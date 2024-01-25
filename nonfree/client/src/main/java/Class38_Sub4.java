import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class38_Sub4 extends Class38 implements Interface27 {

	@OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
	private final int anInt9979;

	@OriginalMember(owner = "client!tw", name = "y", descriptor = "I")
	private final int anInt9974;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!bga;II[III)V")
	public Class38_Sub4(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static354.aClass375_31, Static29.aClass26_4, arg1 * arg2, false);
		this.anInt9979 = arg1;
		this.anInt9974 = arg2;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9963, 0, 6408, this.anInt9979, this.anInt9974, 0, 32993, super.aClass20_Sub2_Sub2_12.anInt1667, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!bga;Lclient!wq;II[BII)V")
	public Class38_Sub4(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static29.aClass26_4, arg2 * arg3, false);
		this.anInt9974 = arg3;
		this.anInt9979 = arg2;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9963, 0, this.method8288(), arg2, arg3, 0, Static209.method4123(super.aClass375_46), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!bga;Lclient!wq;Lclient!baa;II)V")
	public Class38_Sub4(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt9974 = arg4;
		this.anInt9979 = arg3;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glTexImage2Dub(super.anInt9963, 0, this.method8288(), arg3, arg4, 0, Static209.method4123(super.aClass375_46), Static378.method2837(super.aClass26_20), null, 0);
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!bga;Lclient!wq;II[FII)V")
	public Class38_Sub4(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static29.aClass26_8, arg3 * arg2, false);
		this.anInt9979 = arg2;
		this.anInt9974 = arg3;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9963, 0, this.method8288(), arg2, arg3, 0, Static209.method4123(super.aClass375_46), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I")
	@Override
	public int method8306() {
		return this.anInt9974;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8300(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[IIIIBI)V")
	@Override
	public void method8299(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(18) int[] local18 = new int[this.anInt9974 * this.anInt9979];
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glGetTexImagei(super.anInt9963, 0, 32993, 5121, local18, 0);
		for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
			Static653.method7724(local18, this.anInt9979 * (arg2 - local33 - 1), arg0, local33 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FI)F")
	@Override
	public float method8301(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BF)F")
	@Override
	public float method8305(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8307() {
		return false;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)I")
	@Override
	public int method8303() {
		return this.anInt9979;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method8302(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass20_Sub2_Sub2_12.method1484(this);
		if (arg0 == 0) {
			arg0 = arg3;
		}
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt9963, 0, arg2, arg4, arg3, arg5, 32993, super.aClass20_Sub2_Sub2_12.anInt1667, arg1, 0);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIBIIII[BLclient!wq;)V")
	@Override
	public void method8304(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class375 arg4) {
		super.aClass20_Sub2_Sub2_12.method1484(this);
		if (arg0 == 0) {
			arg0 = arg2;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9963, 0, 0, 0, arg2, arg1, Static209.method4123(arg4), 5121, arg3, 0);
		if (arg0 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
