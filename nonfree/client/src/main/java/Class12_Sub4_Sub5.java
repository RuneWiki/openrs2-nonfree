import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class12_Sub4_Sub5 extends Class12_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!fda", name = "z", descriptor = "I")
	private int anInt3011 = -1;

	@OriginalMember(owner = "client!fda", name = "M", descriptor = "I")
	private int anInt3020 = -1;

	@OriginalMember(owner = "client!fda", name = "L", descriptor = "I")
	private final int anInt3019;

	@OriginalMember(owner = "client!fda", name = "J", descriptor = "I")
	public final int anInt3017;

	@OriginalMember(owner = "client!fda", name = "H", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_7;

	@OriginalMember(owner = "client!fda", name = "I", descriptor = "I")
	public final int anInt3016;

	@OriginalMember(owner = "client!fda", name = "G", descriptor = "I")
	private int anInt3015;

	@OriginalMember(owner = "client!fda", name = "A", descriptor = "I")
	private final int anInt3012;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!gi;III)V")
	public Class12_Sub4_Sub5(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3019 = arg1;
		this.anInt3017 = arg3;
		this.aClass42_Sub3_7 = arg0;
		this.anInt3016 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static459.anIntArray625, 0);
		this.anInt3015 = Static459.anIntArray625[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3015);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3019, this.anInt3016, this.anInt3017);
		this.anInt3012 = this.anInt3016 * this.anInt3017 * this.aClass42_Sub3_7.method3228(this.anInt3019);
	}

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!gi;IIII)V")
	public Class12_Sub4_Sub5(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3017 = arg3;
		this.anInt3019 = arg1;
		this.aClass42_Sub3_7 = arg0;
		this.anInt3016 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static459.anIntArray625, 0);
		this.anInt3015 = Static459.anIntArray625[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3015);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3019, this.anInt3016, this.anInt3017);
		this.anInt3012 = this.anInt3017 * this.anInt3016 * this.aClass42_Sub3_7.method3228(this.anInt3019);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIZ)V")
	public void method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt3015);
		this.anInt3020 = arg0;
		this.anInt3011 = arg1;
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V")
	public void method2746() {
		if (this.anInt3015 > 0) {
			this.aClass42_Sub3_7.method3197(this.anInt3015, this.anInt3012);
			this.anInt3015 = 0;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
	@Override
	public void method5270() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3020, this.anInt3011, 36161, 0);
		this.anInt3020 = -1;
		this.anInt3011 = -1;
	}

	@OriginalMember(owner = "client!fda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2746();
		super.finalize();
	}
}
