import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public abstract class Class135 implements Interface6 {

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
	private int anInt7499;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
	private int anInt7502;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
	private int anInt7501 = 0;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	private int anInt7504 = -1;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
	private final int anInt7494;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Lclient!ia;")
	private final Class15_Sub2_Sub1 aClass15_Sub2_Sub1_8;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "Z")
	private final boolean aBoolean640;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!ia;IZ)V")
	protected Class135(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt7494 = arg1;
		this.aClass15_Sub2_Sub1_8 = arg0;
		this.aBoolean640 = arg2;
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)J")
	public final long method6236() {
		return this.anInt7504 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)I")
	@Override
	public int method6235() {
		return this.anInt7502;
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V")
	private void method6237() {
		if (this.anInt7504 >= 0) {
			return;
		}
		if (this.aClass15_Sub2_Sub1_8.aBoolean330) {
			OpenGL.glGenBuffersARB(1, Static457.anIntArray626, 0);
			this.anInt7504 = Static457.anIntArray626[0];
			OpenGL.glBindBufferARB(this.anInt7494, this.anInt7504);
		} else {
			this.anInt7504 = 0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public final void method6238() {
		if (this.aClass15_Sub2_Sub1_8.aBoolean330) {
			OpenGL.glBindBufferARB(this.anInt7494, this.anInt7504);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public void method6239() {
		if (this.anInt7504 > 0) {
			this.aClass15_Sub2_Sub1_8.method3626(this.anInt7504, this.anInt7502);
			this.anInt7504 = -1;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)V")
	public void method6240(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt7499) {
			this.method6237();
			if (this.anInt7504 <= 0) {
				this.aNativeHeapBuffer8 = this.aClass15_Sub2_Sub1_8.method5423(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt7494, this.anInt7504);
				OpenGL.glBufferDataARBub(this.anInt7494, arg0, null, 0, this.aBoolean640 ? 35040 : 35044);
				this.aClass15_Sub2_Sub1_8.anInt6515 += arg0 - this.anInt7499;
			}
			this.anInt7499 = arg0;
		}
		this.anInt7502 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6239();
		super.finalize();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Z")
	public boolean method6241() {
		@Pc(10) boolean local10 = true;
		if (this.anInt7501 != 0) {
			if (this.anInt7504 > 0) {
				OpenGL.glBindBufferARB(this.anInt7494, this.anInt7504);
				if (this.anInt7501 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7494, 0, this.anInt7499, this.aClass15_Sub2_Sub1_8.aNativeHeapBuffer7.getAddress());
				} else {
					local10 = this.aClass15_Sub2_Sub1_8.aMapBuffer1.b();
				}
			}
			this.anInt7501 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method6243() {
		if (this.anInt7501 == 0) {
			this.method6237();
			if (this.anInt7504 <= 0) {
				this.anInt7501 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt7494, this.anInt7504);
			OpenGL.glBufferDataARBub(this.anInt7494, this.anInt7499, null, 0, this.aBoolean640 ? 35040 : 35044);
			if (this.anInt7502 <= this.aClass15_Sub2_Sub1_8.aNativeHeapBuffer7.b) {
				this.anInt7501 = 1;
				return this.aClass15_Sub2_Sub1_8.aNativeHeapBuffer7;
			}
			@Pc(63) MapBuffer local63 = this.aClass15_Sub2_Sub1_8.aMapBuffer1;
			if (!local63.a() && local63.a(this.anInt7494, this.anInt7502, 35001)) {
				this.anInt7501 = 2;
				return local63;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!jaclib/memory/Source;Z)Z")
	protected final boolean method6245(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 <= this.anInt7499) {
			if (this.anInt7504 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7494, this.anInt7504);
			OpenGL.glBufferSubDataARBa(this.anInt7494, 0, this.anInt7502, arg1.getAddress());
			this.aClass15_Sub2_Sub1_8.anInt6515 += arg0 - this.anInt7502;
		} else {
			this.method6237();
			if (this.anInt7504 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7494, this.anInt7504);
			OpenGL.glBufferDataARBa(this.anInt7494, arg0, arg1.getAddress(), this.aBoolean640 ? 35040 : 35044);
			this.aClass15_Sub2_Sub1_8.anInt6515 += arg0 - this.anInt7502;
			this.anInt7499 = arg0;
		}
		this.anInt7502 = arg0;
		return true;
	}
}
