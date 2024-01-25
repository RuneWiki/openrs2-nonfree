import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class38_Sub1 extends Class38 implements Interface27 {

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
	private final int anInt1850;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	private final int anInt1843;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bga;IIZ[III)V")
	public Class38_Sub1(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static354.aClass375_31, Static29.aClass26_4, arg1 * arg2, arg3);
		this.anInt1850 = arg1;
		this.anInt1843 = arg2;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		if (arg3 && arg6 == 0) {
			this.method8293(arg1, arg2, arg4, super.anInt9963);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9963, 0, 6408, this.anInt1850, this.anInt1843, 0, 32993, super.aClass20_Sub2_Sub2_12.anInt1667, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bga;Lclient!wq;IIZ[BII)V")
	public Class38_Sub1(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static29.aClass26_4, arg3 * arg2, arg4);
		this.anInt1850 = arg2;
		this.anInt1843 = arg3;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8290(arg2, arg5, arg3, super.anInt9963);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9963, 0, this.method8288(), arg2, arg3, 0, Static209.method4123(super.aClass375_46), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bga;Lclient!wq;Lclient!baa;II)V")
	public Class38_Sub1(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt1850 = arg3;
		this.anInt1843 = arg4;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glTexImage2Dub(super.anInt9963, 0, this.method8288(), arg3, arg4, 0, Static209.method4123(super.aClass375_46), Static378.method2837(super.aClass26_20), null, 0);
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bga;Lclient!wq;IIZ[FII)V")
	public Class38_Sub1(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static29.aClass26_8, arg2 * arg3, arg4);
		this.anInt1850 = arg2;
		this.anInt1843 = arg3;
		super.aClass20_Sub2_Sub2_12.method1484(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9963, 0, this.method8288(), arg2, arg3, 0, Static209.method4123(super.aClass375_46), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8298(super.anInt9963, arg2, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BF)F")
	@Override
	public float method8305(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1843;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FI)F")
	@Override
	public float method8301(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1850;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB[FLclient!wq;IIIII)V")
	public void method1754(@OriginalArg(2) float[] arg0, @OriginalArg(3) Class375 arg1, @OriginalArg(7) int arg2, @OriginalArg(8) int arg3) {
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9963, 0, 0, 0, arg2, arg3, Static209.method4123(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBIIII[BLclient!wq;)V")
	@Override
	public void method8304(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class375 arg4) {
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt9963, 0, 0, 0, arg2, arg1, Static209.method4123(arg4), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[IIIIBI)V")
	@Override
	public void method8299(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt1850 * this.anInt1843];
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glGetTexImagei(super.anInt9963, 0, 32993, 5121, local12, 0);
		for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
			Static653.method7724(local12, (arg2 - local31 - 1) * this.anInt1850, arg0, arg1 * local31, arg1);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)I")
	@Override
	public int method8303() {
		return this.anInt1850;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I")
	@Override
	public int method8306() {
		return this.anInt1843;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8307() {
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method8302(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt9963, 0, arg2, arg4, arg3, arg5, 32993, super.aClass20_Sub2_Sub2_12.anInt1667, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8300(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass20_Sub2_Sub2_12.method1484(this);
		OpenGL.glTexParameteri(super.anInt9963, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9963, 10243, arg1 ? 10497 : 33071);
	}
}
