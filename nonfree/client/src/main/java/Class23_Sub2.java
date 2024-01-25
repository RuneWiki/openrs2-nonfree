import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class23_Sub2 extends Class23 implements Interface26 {

	@OriginalMember(owner = "client!jv", name = "K", descriptor = "I")
	private final int anInt5111;

	@OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
	private final int anInt5115;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!rda;Lclient!eu;IIZ[FII)V")
	public Class23_Sub2(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static453.aClass278_17, arg3 * arg2, arg4);
		this.anInt5111 = arg2;
		this.anInt5115 = arg3;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method8307(arg3, arg5, super.anInt9693, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9693, 0, this.method8310(), arg2, arg3, 0, Static446.method6638(super.aClass114_20), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!rda;Lclient!eu;IIZ[BII)V")
	public Class23_Sub2(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static453.aClass278_13, arg2 * arg3, arg4);
		this.anInt5111 = arg2;
		this.anInt5115 = arg3;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method8315(arg5, super.anInt9693, arg3, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9693, 0, this.method8310(), arg2, arg3, 0, Static446.method6638(super.aClass114_20), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!rda;Lclient!eu;Lclient!pj;II)V")
	public Class23_Sub2(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class278 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt5111 = arg3;
		this.anInt5115 = arg4;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glTexImage2Dub(super.anInt9693, 0, this.method8310(), arg3, arg4, 0, Static446.method6638(super.aClass114_20), Static13.method243(super.aClass278_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!rda;IIZ[III)V")
	public Class23_Sub2(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static412.aClass114_17, Static453.aClass278_13, arg2 * arg1, arg3);
		this.anInt5111 = arg1;
		this.anInt5115 = arg2;
		super.aClass57_Sub3_Sub1_12.method7813(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method8311(arg4, super.anInt9693, arg2, arg1);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9693, 0, 6408, this.anInt5111, this.anInt5115, 0, 32993, super.aClass57_Sub3_Sub1_12.anInt8653, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BF)F")
	@Override
	public float method4353(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5111;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II[FILclient!eu;IIII)V")
	public void method4355(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(4) Class114 arg2, @OriginalArg(8) int arg3) {
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9693, 0, 0, 0, arg0, arg3, Static446.method6638(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[BIIIIILclient!eu;I)V")
	@Override
	public void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) Class114 arg4) {
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt9693, 0, 0, 0, arg3, arg2, Static446.method6638(arg4), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)I")
	@Override
	public int method4347() {
		return this.anInt5111;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([IIBIIIII)V")
	@Override
	public void method4351(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt9693, 0, arg2, arg3, arg4, arg5, 32993, super.aClass57_Sub3_Sub1_12.anInt8653, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)I")
	@Override
	public int method4349() {
		return this.anInt5115;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IF)F")
	@Override
	public float method4346(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5115;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4352() {
		return true;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method4350(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt5115 * this.anInt5111];
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glGetTexImagei(super.anInt9693, 0, 32993, 5121, local12, 0);
		for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
			Static682.method796(local12, this.anInt5111 * (arg1 - local34 - 1), arg0, arg2 * local34, arg2);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method4348(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass57_Sub3_Sub1_12.method7813(this);
		OpenGL.glTexParameteri(super.anInt9693, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9693, 10243, arg1 ? 10497 : 33071);
	}
}
