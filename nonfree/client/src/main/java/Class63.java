import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public abstract class Class63 implements Interface9 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	private int anInt5644;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	private int anInt5648;

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
	private int anInt5640 = 0;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
	private int anInt5649 = -1;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Lclient!lt;")
	protected final Class67_Sub1_Sub2 aClass67_Sub1_Sub2_7;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Z")
	private final boolean aBoolean468;

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
	private final int anInt5641;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!lt;IZ)V")
	protected Class63(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass67_Sub1_Sub2_7 = arg0;
		this.aBoolean468 = arg2;
		this.anInt5641 = arg1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BILclient!jaclib/memory/Source;)Z")
	protected final boolean method4802(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 > this.anInt5644) {
			this.method4804();
			if (this.anInt5649 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt5641, this.anInt5649);
			OpenGL.glBufferDataARBa(this.anInt5641, arg0, arg1.getAddress(), this.aBoolean468 ? 35040 : 35044);
			this.aClass67_Sub1_Sub2_7.anInt6649 += arg0 - this.anInt5648;
			this.anInt5644 = arg0;
		} else if (this.anInt5649 > 0) {
			OpenGL.glBindBufferARB(this.anInt5641, this.anInt5649);
			OpenGL.glBufferSubDataARBa(this.anInt5641, 0, this.anInt5648, arg1.getAddress());
			this.aClass67_Sub1_Sub2_7.anInt6649 += arg0 - this.anInt5648;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt5648 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
	public final void method4803() {
		if (this.aClass67_Sub1_Sub2_7.aBoolean533) {
			OpenGL.glBindBufferARB(this.anInt5641, this.anInt5649);
		}
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	private void method4804() {
		if (this.anInt5649 >= 0) {
			return;
		}
		if (this.aClass67_Sub1_Sub2_7.aBoolean533) {
			OpenGL.glGenBuffersARB(1, Static564.anIntArray517, 0);
			this.anInt5649 = Static564.anIntArray517[0];
			OpenGL.glBindBufferARB(this.anInt5641, this.anInt5649);
		} else {
			this.anInt5649 = 0;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method4806(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt5640 != 0) {
			if (this.anInt5649 > 0) {
				OpenGL.glBindBufferARB(this.anInt5641, this.anInt5649);
				if (this.anInt5640 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt5641, 0, this.anInt5644, this.aClass67_Sub1_Sub2_7.aNativeHeapBuffer7.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt5640 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
	@Override
	public int method9247() {
		return this.anInt5648;
	}

	@OriginalMember(owner = "client!tu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9249();
		super.finalize();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZI)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method4808(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt5640 == 0) {
			this.method4804();
			if (this.anInt5649 <= 0) {
				this.anInt5640 = 2;
				return this.aNativeHeapBuffer6;
			}
			OpenGL.glBindBufferARB(this.anInt5641, this.anInt5649);
			OpenGL.glBufferDataARBub(this.anInt5641, this.anInt5644, (byte[]) null, 0, this.aBoolean468 ? 35040 : 35044);
			if (this.aClass67_Sub1_Sub2_7.aNativeHeapBuffer7.c >= this.anInt5648) {
				this.anInt5640 = 1;
				return this.aClass67_Sub1_Sub2_7.aNativeHeapBuffer7;
			}
			if (!arg0.b() && arg0.a(this.anInt5641, this.anInt5648, 35001)) {
				this.anInt5640 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	public void method9249() {
		if (this.anInt5649 > 0) {
			this.aClass67_Sub1_Sub2_7.method5693(this.anInt5648, this.anInt5649);
			this.anInt5649 = -1;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)J")
	public final long method4810() {
		return this.anInt5649 == 0 ? this.aNativeHeapBuffer6.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	public void method9248(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt5644) {
			this.method4804();
			if (this.anInt5649 <= 0) {
				this.aNativeHeapBuffer6 = this.aClass67_Sub1_Sub2_7.method5594(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt5641, this.anInt5649);
				OpenGL.glBufferDataARBub(this.anInt5641, arg0, (byte[]) null, 0, this.aBoolean468 ? 35040 : 35044);
				this.aClass67_Sub1_Sub2_7.anInt6649 += arg0 - this.anInt5644;
			}
			this.anInt5644 = arg0;
		}
		this.anInt5648 = arg0;
	}
}
