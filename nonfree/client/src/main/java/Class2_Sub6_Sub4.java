import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class2_Sub6_Sub4 extends Class2_Sub6 implements Interface19 {

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt2233 = -1;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	private int anInt2234 = -1;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private final int anInt2235;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_9;

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
	public final int anInt2245;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
	public final int anInt2244;

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
	private int anInt2243;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
	private final int anInt2239;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!uja;III)V")
	public Class2_Sub6_Sub4(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2235 = arg1;
		this.aClass145_Sub3_9 = arg0;
		this.anInt2245 = arg2;
		this.anInt2244 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static188.anIntArray241, 0);
		this.anInt2243 = Static188.anIntArray241[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2243);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2235, this.anInt2245, this.anInt2244);
		this.anInt2239 = this.anInt2244 * this.anInt2245 * this.aClass145_Sub3_9.method8877(this.anInt2235);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!uja;IIII)V")
	public Class2_Sub6_Sub4(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass145_Sub3_9 = arg0;
		this.anInt2245 = arg2;
		this.anInt2244 = arg3;
		this.anInt2235 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static188.anIntArray241, 0);
		this.anInt2243 = Static188.anIntArray241[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2243);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2235, this.anInt2245, this.anInt2244);
		this.anInt2239 = this.anInt2245 * this.anInt2244 * this.aClass145_Sub3_9.method8877(this.anInt2235);
	}

	@OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1974();
		super.finalize();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	public void method1974() {
		if (this.anInt2243 > 0) {
			this.aClass145_Sub3_9.method8918(this.anInt2243, this.anInt2239);
			this.anInt2243 = 0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public void method1975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt2243);
		this.anInt2233 = arg1;
		this.anInt2234 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	@Override
	public void method4536() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2233, this.anInt2234, 36161, 0);
		this.anInt2234 = -1;
		this.anInt2233 = -1;
	}
}
