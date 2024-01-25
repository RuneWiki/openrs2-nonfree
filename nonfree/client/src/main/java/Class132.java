import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public abstract class Class132 implements Interface23 {

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	private int anInt5734;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	private int anInt5744;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	private int anInt5731 = -1;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
	private int anInt5740 = 0;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	private final int anInt5736;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
	private final boolean aBoolean483;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Lclient!laa;")
	protected final Class126_Sub2_Sub1 aClass126_Sub2_Sub1_9;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!laa;IZ)V")
	protected Class132(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt5736 = arg1;
		this.aBoolean483 = arg2;
		this.aClass126_Sub2_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
	@Override
	public int method7713() {
		return this.anInt5734;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method5104(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt5740 != 0) {
			if (this.anInt5731 > 0) {
				OpenGL.glBindBufferARB(this.anInt5736, this.anInt5731);
				if (this.anInt5740 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt5736, 0, this.anInt5744, this.aClass126_Sub2_Sub1_9.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt5740 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)J")
	public final long method5105() {
		return this.anInt5731 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;BZ)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method5106(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt5740 == 0) {
			this.method5108();
			if (this.anInt5731 <= 0) {
				this.anInt5740 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt5736, this.anInt5731);
			OpenGL.glBufferDataARBub(this.anInt5736, this.anInt5744, (byte[]) null, 0, this.aBoolean483 ? 35040 : 35044);
			if (this.aClass126_Sub2_Sub1_9.aNativeHeapBuffer8.a >= this.anInt5734) {
				this.anInt5740 = 1;
				return this.aClass126_Sub2_Sub1_9.aNativeHeapBuffer8;
			}
			if (!arg0.b() && arg0.a(this.anInt5736, this.anInt5734, 35001)) {
				this.anInt5740 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	private void method5108() {
		if (this.anInt5731 >= 0) {
			return;
		}
		if (this.aClass126_Sub2_Sub1_9.aBoolean458) {
			OpenGL.glGenBuffersARB(1, Static354.anIntArray489, 0);
			this.anInt5731 = Static354.anIntArray489[0];
			OpenGL.glBindBufferARB(this.anInt5736, this.anInt5731);
		} else {
			this.anInt5731 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7716();
		super.finalize();
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
	public final void method5109() {
		if (this.aClass126_Sub2_Sub1_9.aBoolean458) {
			OpenGL.glBindBufferARB(this.anInt5736, this.anInt5731);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V")
	public void method5732(@OriginalArg(0) int arg0) {
		if (this.anInt5744 < arg0) {
			this.method5108();
			if (this.anInt5731 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass126_Sub2_Sub1_9.method5455(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt5736, this.anInt5731);
				OpenGL.glBufferDataARBub(this.anInt5736, arg0, (byte[]) null, 0, this.aBoolean483 ? 35040 : 35044);
				this.aClass126_Sub2_Sub1_9.anInt6247 += arg0 - this.anInt5744;
			}
			this.anInt5744 = arg0;
		}
		this.anInt5734 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
	public void method7716() {
		if (this.anInt5731 > 0) {
			this.aClass126_Sub2_Sub1_9.method4915(this.anInt5731, this.anInt5734);
			this.anInt5731 = -1;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!jaclib/memory/Source;B)Z")
	protected final boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 <= this.anInt5744) {
			if (this.anInt5731 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt5736, this.anInt5731);
			OpenGL.glBufferSubDataARBa(this.anInt5736, 0, this.anInt5734, arg1.getAddress());
			this.aClass126_Sub2_Sub1_9.anInt6247 += arg0 - this.anInt5734;
		} else {
			this.method5108();
			if (this.anInt5731 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt5736, this.anInt5731);
			OpenGL.glBufferDataARBa(this.anInt5736, arg0, arg1.getAddress(), this.aBoolean483 ? 35040 : 35044);
			this.aClass126_Sub2_Sub1_9.anInt6247 += arg0 - this.anInt5734;
			this.anInt5744 = arg0;
		}
		this.anInt5734 = arg0;
		return true;
	}
}
