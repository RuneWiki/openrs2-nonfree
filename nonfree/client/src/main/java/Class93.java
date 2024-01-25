import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public abstract class Class93 implements Interface2 {

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
	private int anInt3306;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
	private int anInt3322;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	private int anInt3310 = 0;

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
	private int anInt3323 = -1;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Z")
	private final boolean aBoolean267;

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
	private final int anInt3313;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "Lclient!rda;")
	protected final Class57_Sub3_Sub1 aClass57_Sub3_Sub1_7;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!rda;IZ)V")
	protected Class93(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean267 = arg2;
		this.anInt3313 = arg1;
		this.aClass57_Sub3_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)J")
	public final long method2916() {
		return this.anInt3323 == 0 ? this.aNativeHeapBuffer3.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V")
	private void method2917() {
		if (this.anInt3323 >= 0) {
			return;
		}
		if (this.aClass57_Sub3_Sub1_7.aBoolean652) {
			OpenGL.glGenBuffersARB(1, Static40.anIntArray39, 0);
			this.anInt3323 = Static40.anIntArray39[0];
			OpenGL.glBindBufferARB(this.anInt3313, this.anInt3323);
		} else {
			this.anInt3323 = 0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BZLclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method2918(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt3310 == 0) {
			this.method2917();
			if (this.anInt3323 <= 0) {
				this.anInt3310 = 2;
				return this.aNativeHeapBuffer3;
			}
			OpenGL.glBindBufferARB(this.anInt3313, this.anInt3323);
			OpenGL.glBufferDataARBub(this.anInt3313, this.anInt3306, (byte[]) null, 0, this.aBoolean267 ? 35040 : 35044);
			if (this.aClass57_Sub3_Sub1_7.aNativeHeapBuffer8.b >= this.anInt3322) {
				this.anInt3310 = 1;
				return this.aClass57_Sub3_Sub1_7.aNativeHeapBuffer8;
			}
			if (!arg0.a() && arg0.a(this.anInt3313, this.anInt3322, 35001)) {
				this.anInt3310 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;B)Z")
	protected final boolean method2919(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt3310 != 0) {
			if (this.anInt3323 > 0) {
				OpenGL.glBindBufferARB(this.anInt3313, this.anInt3323);
				if (this.anInt3310 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt3313, 0, this.anInt3306, this.aClass57_Sub3_Sub1_7.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt3310 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZLclient!jaclib/memory/Source;)Z")
	protected final boolean method2920(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1) {
		if (this.anInt3306 < arg0) {
			this.method2917();
			if (this.anInt3323 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt3313, this.anInt3323);
			OpenGL.glBufferDataARBa(this.anInt3313, arg0, arg1.getAddress(), this.aBoolean267 ? 35040 : 35044);
			this.aClass57_Sub3_Sub1_7.anInt9140 += arg0 - this.anInt3322;
			this.anInt3306 = arg0;
		} else if (this.anInt3323 > 0) {
			OpenGL.glBindBufferARB(this.anInt3313, this.anInt3323);
			OpenGL.glBufferSubDataARBa(this.anInt3313, 0, this.anInt3322, arg1.getAddress());
			this.aClass57_Sub3_Sub1_7.anInt9140 += arg0 - this.anInt3322;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt3322 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
	public void method2921() {
		if (this.anInt3323 > 0) {
			this.aClass57_Sub3_Sub1_7.method7402(this.anInt3323, this.anInt3322);
			this.anInt3323 = -1;
		}
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "(I)V")
	public final void method2922() {
		if (this.aClass57_Sub3_Sub1_7.aBoolean652) {
			OpenGL.glBindBufferARB(this.anInt3313, this.anInt3323);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public void method2925(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt3306) {
			this.method2917();
			if (this.anInt3323 <= 0) {
				this.aNativeHeapBuffer3 = this.aClass57_Sub3_Sub1_7.method7740(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt3313, this.anInt3323);
				OpenGL.glBufferDataARBub(this.anInt3313, arg0, (byte[]) null, 0, this.aBoolean267 ? 35040 : 35044);
				this.aClass57_Sub3_Sub1_7.anInt9140 += arg0 - this.anInt3306;
			}
			this.anInt3306 = arg0;
		}
		this.anInt3322 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method2921();
		super.finalize();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)I")
	@Override
	public int method2915() {
		return this.anInt3322;
	}
}
