import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public abstract class Class45 implements Interface4 {

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
	private int anInt3569;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	private int anInt3576;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
	private int anInt3565 = -1;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
	private int anInt3562 = 0;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
	private final int anInt3572;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "Lclient!lm;")
	protected final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_8;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!lm;IZ)V")
	protected Class45(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt3572 = arg1;
		this.aClass100_Sub1_Sub2_8 = arg0;
		this.aBoolean296 = arg2;
	}

	@OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5772();
		super.finalize();
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public void method5772() {
		if (this.anInt3565 > 0) {
			this.aClass100_Sub1_Sub2_8.method4889(this.anInt3569, this.anInt3565);
			this.anInt3565 = -1;
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	public final void method2938() {
		if (this.aClass100_Sub1_Sub2_8.aBoolean468) {
			OpenGL.glBindBufferARB(this.anInt3572, this.anInt3565);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZBLclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method2939(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt3562 == 0) {
			this.method2941();
			if (this.anInt3565 <= 0) {
				this.anInt3562 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt3572, this.anInt3565);
			OpenGL.glBufferDataARBub(this.anInt3572, this.anInt3576, null, 0, this.aBoolean296 ? 35040 : 35044);
			if (this.anInt3569 <= this.aClass100_Sub1_Sub2_8.aNativeHeapBuffer8.b) {
				this.anInt3562 = 1;
				return this.aClass100_Sub1_Sub2_8.aNativeHeapBuffer8;
			}
			if (!arg0.b() && arg0.a(this.anInt3572, this.anInt3569, 35001)) {
				this.anInt3562 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)J")
	public final long method2940() {
		return this.anInt3565 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "(I)V")
	private void method2941() {
		if (this.anInt3565 >= 0) {
			return;
		}
		if (this.aClass100_Sub1_Sub2_8.aBoolean468) {
			OpenGL.glGenBuffersARB(1, Static282.anIntArray345, 0);
			this.anInt3565 = Static282.anIntArray345[0];
			OpenGL.glBindBufferARB(this.anInt3572, this.anInt3565);
		} else {
			this.anInt3565 = 0;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public void method4117(@OriginalArg(1) int arg0) {
		if (this.anInt3576 < arg0) {
			this.method2941();
			if (this.anInt3565 > 0) {
				OpenGL.glBindBufferARB(this.anInt3572, this.anInt3565);
				OpenGL.glBufferDataARBub(this.anInt3572, arg0, null, 0, this.aBoolean296 ? 35040 : 35044);
				this.aClass100_Sub1_Sub2_8.anInt5753 += arg0 - this.anInt3576;
			} else {
				this.aNativeHeapBuffer7 = this.aClass100_Sub1_Sub2_8.method4788(arg0, false);
			}
			this.anInt3576 = arg0;
		}
		this.anInt3569 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!jaclib/memory/Source;B)Z")
	protected final boolean method2943(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 <= this.anInt3576) {
			if (this.anInt3565 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt3572, this.anInt3565);
			OpenGL.glBufferSubDataARBa(this.anInt3572, 0, this.anInt3569, arg1.getAddress());
			this.aClass100_Sub1_Sub2_8.anInt5753 += arg0 - this.anInt3569;
		} else {
			this.method2941();
			if (this.anInt3565 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt3572, this.anInt3565);
			OpenGL.glBufferDataARBa(this.anInt3572, arg0, arg1.getAddress(), this.aBoolean296 ? 35040 : 35044);
			this.aClass100_Sub1_Sub2_8.anInt5753 += arg0 - this.anInt3569;
			this.anInt3576 = arg0;
		}
		this.anInt3569 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method2944(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt3562 != 0) {
			if (this.anInt3565 > 0) {
				OpenGL.glBindBufferARB(this.anInt3572, this.anInt3565);
				if (this.anInt3562 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt3572, 0, this.anInt3576, this.aClass100_Sub1_Sub2_8.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt3562 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
	@Override
	public int method5771() {
		return this.anInt3569;
	}
}
