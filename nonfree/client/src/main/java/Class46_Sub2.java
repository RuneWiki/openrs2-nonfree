import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
	private int anInt6363 = -1;

	@OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
	private int anInt6364 = -1;

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
	public final int anInt6360;

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
	public final int anInt6356;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;IIIIZ[BIZ)V")
	public Class46_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt6360 = arg4;
		this.anInt6356 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6350 != 34037) {
			Static547.method7463(arg4, arg6, arg2, arg1, arg3, arg7);
			this.method5141(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6350, 0, super.anInt6354, this.anInt6356, this.anInt6360, 0, arg7, 5121, arg6, 0);
			this.method5141(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5134(true);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;IIIIZ[FI)V")
	public Class46_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6360 = arg4;
		this.anInt6356 = arg3;
		super.aClass78_Sub3_26.method4535(this);
		if (arg5 && super.anInt6350 != 34037) {
			Static83.method1359(arg6, arg4, arg3, arg1, arg2, arg7);
			this.method5141(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6350, 0, super.anInt6354, this.anInt6356, this.anInt6360, 0, arg7, 5126, arg6, 0);
			this.method5141(false);
		}
		this.method5134(true);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;IIIII)V")
	public Class46_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt6356 = arg4;
		this.anInt6360 = arg5;
		@Pc(29) int local29 = super.aClass78_Sub3_26.anInt5524 - arg5 - arg3;
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glCopyTexImage2D(super.anInt6350, 0, super.anInt6354, arg2, local29, arg4, arg5, 0);
		this.method5134(true);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;IIII)V")
	public Class46_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt6360 = arg4;
		this.anInt6356 = arg3;
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glTexImage2Dub(super.anInt6350, 0, super.anInt6354, arg3, arg4, 0, Static485.method6695(super.anInt6354), 5121, null, 0);
		this.method5134(true);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;IIIIZ[IIIZ)V")
	public Class46_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt6360 = arg4;
		this.anInt6356 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass78_Sub3_26.method4535(this);
		if (super.anInt6350 != 34037 && arg5 && arg7 == 0) {
			Static16.method393(arg6, super.anInt6354, this.anInt6356, super.aClass78_Sub3_26.anInt5594, this.anInt6360, super.anInt6350);
			this.method5141(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt6350, 0, super.anInt6354, this.anInt6356, this.anInt6360, 0, 32993, super.aClass78_Sub3_26.anInt5594, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method5141(false);
		}
		this.method5134(true);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIZIIIIB[BI)V")
	public final void method5145(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(6) int arg2, @OriginalArg(8) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg1) {
			@Pc(18) int local18 = Static476.method6629(6406);
			@Pc(22) int local22 = arg2 * local18;
			@Pc(26) int local26 = local18 * arg2;
			@Pc(31) byte[] local31 = new byte[local22 * arg4];
			for (@Pc(33) int local33 = 0; local33 < arg4; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = (arg4 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg3[local50++];
				}
			}
			arg3 = local31;
		}
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6350, 0, 0, 0, arg2, arg4, 6406, 5121, arg3, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	@Override
	public final void method7511() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6363, this.anInt6364, super.anInt6350, 0, 0);
		this.anInt6364 = -1;
		this.anInt6363 = -1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIII)V")
	public final void method5147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = super.aClass78_Sub3_26.anInt5524 - arg1 - arg4;
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6350, 0, arg5, this.anInt6360 - arg3 - arg1, arg2, local17, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIII)V")
	public final void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt6350, super.anInt6344, 0);
		this.anInt6363 = arg0;
		this.anInt6364 = arg1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIZ[IIIII)V")
	protected final void method5149(@OriginalArg(0) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(16) int[] local16 = new int[arg2 * arg0];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(24) int local24 = arg2 * local18;
			@Pc(35) int local35 = arg2 * (arg0 - local18 - 1);
			for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
				local16[local24++] = arg1[local35++];
			}
		}
		super.aClass78_Sub3_26.method4535(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt6350, 0, 0, 0, arg2, arg0, 32993, super.aClass78_Sub3_26.anInt5594, local16, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIZ)V")
	public final void method5150(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt6350 == 3553) {
			super.aClass78_Sub3_26.method4535(this);
			OpenGL.glTexParameteri(super.anInt6350, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6350, 10243, arg0 ? 10497 : 33071);
		}
	}
}
