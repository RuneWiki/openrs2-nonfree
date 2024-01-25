import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
	private int anInt3718 = -1;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	private int anInt3724 = -1;

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
	public final int anInt3716;

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
	public final int anInt3719;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ml;IIIII)V")
	public Class44_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt3716 = arg5;
		this.anInt3719 = arg4;
		@Pc(30) int local30 = super.aClass75_Sub3_43.anInt6525 - arg5 - arg3;
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glCopyTexImage2D(super.anInt10474, 0, super.anInt10483, arg2, local30, arg4, arg5, 0);
		this.method9007(true);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ml;IIIIZ[BIZ)V")
	public Class44_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3716 = arg4;
		this.anInt3719 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt10474 != 34037) {
			Static310.method4934(arg3, arg2, arg6, arg7, arg1, arg4);
			this.method9010(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt10474, 0, super.anInt10483, this.anInt3719, this.anInt3716, 0, arg7, 5121, arg6, 0);
			this.method9010(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method9007(true);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ml;IIIIZ[IIIZ)V")
	public Class44_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3716 = arg4;
		this.anInt3719 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass75_Sub3_43.method5774(this);
		if (super.anInt10474 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static175.method3365(arg6, super.anInt10474, this.anInt3719, super.anInt10483, super.aClass75_Sub3_43.anInt6551, this.anInt3716);
			this.method9010(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt10474, 0, super.anInt10483, this.anInt3719, this.anInt3716, 0, 32993, super.aClass75_Sub3_43.anInt6551, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method9010(false);
		}
		this.method9007(true);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ml;IIII)V")
	public Class44_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt3719 = arg3;
		this.anInt3716 = arg4;
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glTexImage2Dub(super.anInt10474, 0, super.anInt10483, arg3, arg4, 0, Static2.method19(super.anInt10483), 5121, (byte[]) null, 0);
		this.method9007(true);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ml;IIIIZ[FI)V")
	public Class44_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3716 = arg4;
		this.anInt3719 = arg3;
		super.aClass75_Sub3_43.method5774(this);
		if (arg5 && super.anInt10474 != 34037) {
			Static498.method7329(arg1, arg4, arg2, arg3, arg6, arg7);
			this.method9010(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt10474, 0, super.anInt10483, this.anInt3719, this.anInt3716, 0, arg7, 5126, arg6, 0);
			this.method9010(false);
		}
		this.method9007(true);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I[BIIIZIIBI)V")
	public final void method3475(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4) {
		if (arg3) {
			@Pc(34) int local34 = Static8.method111(6406);
			@Pc(38) int local38 = arg2 * local34;
			@Pc(42) int local42 = local34 * arg2;
			@Pc(47) byte[] local47 = new byte[arg4 * local38];
			for (@Pc(49) int local49 = 0; local49 < arg4; local49++) {
				@Pc(55) int local55 = local49 * local38;
				@Pc(67) int local67 = local42 * (arg4 - local49 - 1);
				for (@Pc(69) int local69 = 0; local69 < local38; local69++) {
					local47[local55++] = arg0[local67++];
				}
			}
			arg0 = local47;
		}
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10474, 0, 0, 0, arg2, arg4, 6406, 5121, arg0, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZBZ)V")
	public final void method3476(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt10474 == 3553) {
			super.aClass75_Sub3_43.method5774(this);
			OpenGL.glTexParameteri(super.anInt10474, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt10474, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IBII)V")
	public final void method3477(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt10474, super.anInt10480, 0);
		this.anInt3718 = arg1;
		this.anInt3724 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIBI)V")
	public final void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass75_Sub3_43.anInt6525 - arg2 - arg3;
		super.aClass75_Sub3_43.method5774(this);
		OpenGL.glCopyTexSubImage2D(super.anInt10474, 0, arg5, this.anInt3716 - arg1 - arg3, arg4, local13, arg0, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III[IZIIII)V")
	public final void method3479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == 0) {
			arg1 = arg5;
		}
		@Pc(24) int[] local24 = new int[arg0 * arg5];
		for (@Pc(26) int local26 = 0; local26 < arg0; local26++) {
			@Pc(32) int local32 = local26 * arg5;
			@Pc(44) int local44 = (arg0 - local26 - 1) * arg1;
			for (@Pc(46) int local46 = 0; local46 < arg5; local46++) {
				local24[local32++] = arg3[local44++];
			}
		}
		super.aClass75_Sub3_43.method5774(this);
		if (arg1 != arg5) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt10474, 0, arg4, this.anInt3716 - arg0 - arg2, arg5, arg0, 32993, super.aClass75_Sub3_43.anInt6551, local24, 0);
		if (arg1 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	@Override
	public final void method9004() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3718, this.anInt3724, super.anInt10474, 0, 0);
		this.anInt3724 = -1;
		this.anInt3718 = -1;
	}
}
