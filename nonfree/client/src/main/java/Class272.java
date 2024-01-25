import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public abstract class Class272 implements Interface12 {

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	private int anInt9121;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	private int anInt9123;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	private int anInt9115 = -1;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	private int anInt9128 = 0;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
	private final boolean aBoolean669;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	private final int anInt9116;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!eea;")
	protected final Class87_Sub1_Sub1 aClass87_Sub1_Sub1_12;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!eea;IZ)V")
	protected Class272(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean669 = arg2;
		this.anInt9116 = arg1;
		this.aClass87_Sub1_Sub1_12 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method7670(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= this.anInt9123) {
			if (this.anInt9115 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9116, this.anInt9115);
			OpenGL.glBufferSubDataARBa(this.anInt9116, 0, this.anInt9121, arg0.getAddress());
			this.aClass87_Sub1_Sub1_12.anInt6109 += arg1 - this.anInt9121;
		} else {
			this.method7677();
			if (this.anInt9115 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9116, this.anInt9115);
			OpenGL.glBufferDataARBa(this.anInt9116, arg1, arg0.getAddress(), this.aBoolean669 ? 35040 : 35044);
			this.aClass87_Sub1_Sub1_12.anInt6109 += arg1 - this.anInt9121;
			this.anInt9123 = arg1;
		}
		this.anInt9121 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public void method7671() {
		if (this.anInt9115 > 0) {
			this.aClass87_Sub1_Sub1_12.method2404(this.anInt9121, this.anInt9115);
			this.anInt9115 = -1;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method7672(@OriginalArg(0) MapBuffer arg0) {
		@Pc(14) boolean local14 = true;
		if (this.anInt9128 != 0) {
			if (this.anInt9115 > 0) {
				OpenGL.glBindBufferARB(this.anInt9116, this.anInt9115);
				if (this.anInt9128 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9116, 0, this.anInt9123, this.aClass87_Sub1_Sub1_12.aNativeHeapBuffer5.getAddress());
				} else {
					local14 = arg0.b();
				}
			}
			this.anInt9128 = 0;
		}
		return local14;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)J")
	public final long method7673() {
		return this.anInt9115 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public void method7675(@OriginalArg(0) int arg0) {
		if (this.anInt9123 < arg0) {
			this.method7677();
			if (this.anInt9115 > 0) {
				OpenGL.glBindBufferARB(this.anInt9116, this.anInt9115);
				OpenGL.glBufferDataARBub(this.anInt9116, arg0, null, 0, this.aBoolean669 ? 35040 : 35044);
				this.aClass87_Sub1_Sub1_12.anInt6109 += arg0 - this.anInt9123;
			} else {
				this.aNativeHeapBuffer8 = this.aClass87_Sub1_Sub1_12.method5130(arg0, false);
			}
			this.anInt9123 = arg0;
		}
		this.anInt9121 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7671();
		super.finalize();
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
	@Override
	public int method7668() {
		return this.anInt9121;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	private void method7677() {
		if (this.anInt9115 >= 0) {
			return;
		}
		if (this.aClass87_Sub1_Sub1_12.aBoolean234) {
			OpenGL.glGenBuffersARB(1, Static286.anIntArray545, 0);
			this.anInt9115 = Static286.anIntArray545[0];
			OpenGL.glBindBufferARB(this.anInt9116, this.anInt9115);
		} else {
			this.anInt9115 = 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7678(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt9128 == 0) {
			this.method7677();
			if (this.anInt9115 <= 0) {
				this.anInt9128 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9116, this.anInt9115);
			OpenGL.glBufferDataARBub(this.anInt9116, this.anInt9123, null, 0, this.aBoolean669 ? 35040 : 35044);
			if (this.anInt9121 <= this.aClass87_Sub1_Sub1_12.aNativeHeapBuffer5.c) {
				this.anInt9128 = 1;
				return this.aClass87_Sub1_Sub1_12.aNativeHeapBuffer5;
			}
			if (!arg0.a() && arg0.a(this.anInt9116, this.anInt9121, 35001)) {
				this.anInt9128 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	public final void method7680() {
		if (this.aClass87_Sub1_Sub1_12.aBoolean234) {
			OpenGL.glBindBufferARB(this.anInt9116, this.anInt9115);
		}
	}
}
