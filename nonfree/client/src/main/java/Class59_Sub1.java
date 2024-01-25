import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class59_Sub1 extends Class59 implements Interface19 {

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
	private final int anInt1467;

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
	private final int anInt1465;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!sb;Lclient!kea;IIZ[BII)V")
	public Class59_Sub1(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static290.aClass189_11, arg2 * arg3, arg4);
		this.anInt1467 = arg3;
		this.anInt1465 = arg2;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method4767(super.anInt5594, arg5, arg2, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt5594, 0, this.method4765(), arg2, arg3, 0, Static269.method3772(super.aClass188_10), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!sb;Lclient!kea;Lclient!kf;II)V")
	public Class59_Sub1(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt1465 = arg3;
		this.anInt1467 = arg4;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glTexImage2Dub(super.anInt5594, 0, this.method4765(), arg3, arg4, 0, Static269.method3772(super.aClass188_10), Static626.method8393(super.aClass189_17), null, 0);
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!sb;Lclient!kea;IIZ[FII)V")
	public Class59_Sub1(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static290.aClass189_15, arg3 * arg2, arg4);
		this.anInt1467 = arg3;
		this.anInt1465 = arg2;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt5594, 0, this.method4765(), arg2, arg3, 0, Static269.method3772(super.aClass188_10), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method4764(arg3, super.anInt5594, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!sb;IIZ[III)V")
	public Class59_Sub1(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static393.aClass188_12, Static290.aClass189_11, arg2 * arg1, arg3);
		this.anInt1465 = arg1;
		this.anInt1467 = arg2;
		super.aClass95_Sub3_Sub2_8.method7112(this);
		if (arg3 && arg6 == 0) {
			this.method4768(arg1, arg2, arg4, super.anInt5594);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt5594, 0, 6408, this.anInt1465, this.anInt1467, 0, 32993, super.aClass95_Sub3_Sub2_8.anInt8480, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BF)F")
	@Override
	public float method3136(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1465;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method3138(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glTexParameteri(super.anInt5594, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt5594, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBII[II)V")
	@Override
	public void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt1467 * this.anInt1465];
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glGetTexImagei(super.anInt5594, 0, 32993, 5121, local12, 0);
		for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
			Static653.method5397(local12, (arg0 - local40 - 1) * this.anInt1465, arg2, arg1 * local40, arg1);
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return this.anInt1467;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt5594, 0, arg0, arg2, arg3, arg5, 32993, super.aClass95_Sub3_Sub2_8.anInt8480, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZILclient!kea;I[FIIII)V")
	public void method1165(@OriginalArg(1) int arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(4) float[] arg2, @OriginalArg(8) int arg3) {
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt5594, 0, 0, 0, arg3, arg0, Static269.method3772(arg1), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I")
	@Override
	public int method3134() {
		return this.anInt1465;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IF)F")
	@Override
	public float method3137(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1467;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3131() {
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([BILclient!kea;IIIIII)V")
	@Override
	public void method3135(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		super.aClass95_Sub3_Sub2_8.method7112(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt5594, 0, 0, 0, arg3, arg4, Static269.method3772(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
