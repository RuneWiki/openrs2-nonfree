import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public class Class85_Sub3 extends Class85 {

	@OriginalMember(owner = "client!tca", name = "K", descriptor = "I")
	private int anInt5922 = -1;

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
	private int anInt5920 = -1;

	@OriginalMember(owner = "client!tca", name = "D", descriptor = "I")
	public final int anInt5915;

	@OriginalMember(owner = "client!tca", name = "O", descriptor = "I")
	public final int anInt5926;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!dia;IIIIZ[BIZ)V")
	public Class85_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5915 = arg4;
		this.anInt5926 = arg3;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9006 != 34037) {
			Static144.method2634(arg4, arg6, arg3, arg7, arg1, arg2);
			this.method7880(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9006, 0, super.anInt9005, this.anInt5926, this.anInt5915, 0, arg7, 5121, arg6, 0);
			this.method7880(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7875(true);
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!dia;IIII)V")
	public Class85_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt5915 = arg4;
		this.anInt5926 = arg3;
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glTexImage2Dub(super.anInt9006, 0, super.anInt9005, arg3, arg4, 0, Static112.method5090(super.anInt9005), 5121, (byte[]) null, 0);
		this.method7875(true);
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!dia;IIIII)V")
	public Class85_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt5915 = arg5;
		this.anInt5926 = arg4;
		@Pc(29) int local29 = super.aClass13_Sub2_40.anInt2132 - arg3 - arg5;
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glCopyTexImage2D(super.anInt9006, 0, super.anInt9005, arg2, local29, arg4, arg5, 0);
		this.method7875(true);
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!dia;IIIIZ[FI)V")
	public Class85_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5926 = arg3;
		this.anInt5915 = arg4;
		super.aClass13_Sub2_40.method2024(this);
		if (arg5 && super.anInt9006 != 34037) {
			Static247.method4114(arg3, arg7, arg4, arg1, arg2, arg6);
			this.method7880(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9006, 0, super.anInt9005, this.anInt5926, this.anInt5915, 0, arg7, 5126, arg6, 0);
			this.method7880(false);
		}
		this.method7875(true);
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!dia;IIIIZ[IIIZ)V")
	public Class85_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5926 = arg3;
		this.anInt5915 = arg4;
		if (arg9) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass13_Sub2_40.method2024(this);
		if (super.anInt9006 != 34037 && arg5 && arg7 == 0) {
			Static478.method6972(super.anInt9006, arg6, this.anInt5926, this.anInt5915, super.aClass13_Sub2_40.anInt2171, super.anInt9005);
			this.method7880(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9006, 0, super.anInt9005, this.anInt5926, this.anInt5915, 0, 32993, super.aClass13_Sub2_40.anInt2171, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method7880(false);
		}
		this.method7875(true);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZZI)V")
	public final void method5365(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt9006 == 3553) {
			super.aClass13_Sub2_40.method2024(this);
			OpenGL.glTexParameteri(super.anInt9006, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9006, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
	@Override
	public final void method7868() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5922, this.anInt5920, super.anInt9006, 0, 0);
		this.anInt5922 = -1;
		this.anInt5920 = -1;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIZII[BIIII)V")
	public final void method5368(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		if (arg1) {
			@Pc(13) int local13 = Static336.method5063(6406);
			@Pc(17) int local17 = arg0 * local13;
			@Pc(21) int local21 = arg0 * local13;
			@Pc(26) byte[] local26 = new byte[arg2 * local17];
			for (@Pc(28) int local28 = 0; local28 < arg2; local28++) {
				@Pc(33) int local33 = local28 * local17;
				@Pc(44) int local44 = local21 * (arg2 - local28 - 1);
				for (@Pc(46) int local46 = 0; local46 < local17; local46++) {
					local26[local33++] = arg3[local44++];
				}
			}
			arg3 = local26;
		}
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9006, 0, 0, 0, arg0, arg2, 6406, 5121, arg3, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBII)V")
	public final void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9006, super.anInt9016, 0);
		this.anInt5920 = arg1;
		this.anInt5922 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZIIIII)V")
	public final void method5371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = super.aClass13_Sub2_40.anInt2132 - arg4 - arg3;
		super.aClass13_Sub2_40.method2024(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9006, 0, arg5, this.anInt5915 - arg3 - arg1, arg0, local17, arg2, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "([IZIIIIIII)V")
	public final void method5372(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg3 == 0) {
			arg3 = arg4;
		}
		@Pc(19) int[] local19 = new int[arg4 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(27) int local27 = arg4 * local21;
			@Pc(38) int local38 = arg3 * (arg2 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg4; local40++) {
				local19[local27++] = arg0[local38++];
			}
		}
		super.aClass13_Sub2_40.method2024(this);
		if (arg3 != arg4) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt9006, 0, arg5, this.anInt5915 - arg2 - arg1, arg4, arg2, 32993, super.aClass13_Sub2_40.anInt2171, local19, 0);
		if (arg3 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
