import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public abstract class Class262 implements Interface13 {

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
	private int anInt9247;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	private int anInt9248;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
	private int anInt9249 = -1;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
	private int anInt9255 = 0;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Lclient!mc;")
	private final Class121_Sub2_Sub1 aClass121_Sub2_Sub1_8;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	private final int anInt9245;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Z")
	private final boolean aBoolean648;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!mc;IZ)V")
	protected Class262(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass121_Sub2_Sub1_8 = arg0;
		this.anInt9245 = arg1;
		this.aBoolean648 = arg2;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	public void method7560(@OriginalArg(0) int arg0) {
		if (this.anInt9248 < arg0) {
			this.method7561();
			if (this.anInt9249 > 0) {
				OpenGL.glBindBufferARB(this.anInt9245, this.anInt9249);
				OpenGL.glBufferDataARBub(this.anInt9245, arg0, null, 0, this.aBoolean648 ? 35040 : 35044);
				this.aClass121_Sub2_Sub1_8.anInt8890 += arg0 - this.anInt9248;
			} else {
				this.aNativeHeapBuffer8 = this.aClass121_Sub2_Sub1_8.method7205(false, arg0);
			}
			this.anInt9248 = arg0;
		}
		this.anInt9247 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7567();
		super.finalize();
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
	private void method7561() {
		if (this.anInt9249 >= 0) {
			return;
		}
		if (this.aClass121_Sub2_Sub1_8.aBoolean339) {
			OpenGL.glGenBuffersARB(1, Static346.anIntArray532, 0);
			this.anInt9249 = Static346.anIntArray532[0];
			OpenGL.glBindBufferARB(this.anInt9245, this.anInt9249);
		} else {
			this.anInt9249 = 0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!jaclib/memory/Source;B)Z")
	protected final boolean method7562(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (this.anInt9248 < arg0) {
			this.method7561();
			if (this.anInt9249 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9245, this.anInt9249);
			OpenGL.glBufferDataARBa(this.anInt9245, arg0, arg1.getAddress(), this.aBoolean648 ? 35040 : 35044);
			this.aClass121_Sub2_Sub1_8.anInt8890 += arg0 - this.anInt9247;
			this.anInt9248 = arg0;
		} else if (this.anInt9249 > 0) {
			OpenGL.glBindBufferARB(this.anInt9245, this.anInt9249);
			OpenGL.glBufferSubDataARBa(this.anInt9245, 0, this.anInt9247, arg1.getAddress());
			this.aClass121_Sub2_Sub1_8.anInt8890 += arg0 - this.anInt9247;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9247 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Z")
	public boolean method7563() {
		@Pc(5) boolean local5 = true;
		if (this.anInt9255 != 0) {
			if (this.anInt9249 > 0) {
				OpenGL.glBindBufferARB(this.anInt9245, this.anInt9249);
				if (this.anInt9255 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9245, 0, this.anInt9248, this.aClass121_Sub2_Sub1_8.aNativeHeapBuffer7.getAddress());
				} else {
					local5 = this.aClass121_Sub2_Sub1_8.aMapBuffer1.b();
				}
			}
			this.anInt9255 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)I")
	@Override
	public int method7559() {
		return this.anInt9247;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public final void method7566() {
		if (this.aClass121_Sub2_Sub1_8.aBoolean339) {
			OpenGL.glBindBufferARB(this.anInt9245, this.anInt9249);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public void method7567() {
		if (this.anInt9249 > 0) {
			this.aClass121_Sub2_Sub1_8.method4673(this.anInt9249, this.anInt9247);
			this.anInt9249 = -1;
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)J")
	public final long method7568() {
		return this.anInt9249 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	public Buffer method7569() {
		if (this.anInt9255 == 0) {
			this.method7561();
			if (this.anInt9249 <= 0) {
				this.anInt9255 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9245, this.anInt9249);
			OpenGL.glBufferDataARBub(this.anInt9245, this.anInt9248, null, 0, this.aBoolean648 ? 35040 : 35044);
			if (this.aClass121_Sub2_Sub1_8.aNativeHeapBuffer7.d >= this.anInt9247) {
				this.anInt9255 = 1;
				return this.aClass121_Sub2_Sub1_8.aNativeHeapBuffer7;
			}
			@Pc(63) MapBuffer local63 = this.aClass121_Sub2_Sub1_8.aMapBuffer1;
			if (!local63.a() && local63.a(this.anInt9245, this.anInt9247, 35001)) {
				this.anInt9255 = 2;
				return local63;
			}
		}
		return null;
	}
}
