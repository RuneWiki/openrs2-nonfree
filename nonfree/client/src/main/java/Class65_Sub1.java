import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
	private int anInt1684 = -1;

	@OriginalMember(owner = "client!fq", name = "C", descriptor = "I")
	private int anInt1690 = -1;

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "I")
	public final int anInt1686;

	@OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
	public final int anInt1694;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ep;IIIIZ[FI)V")
	public Class65_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1686 = arg4;
		this.anInt1694 = arg3;
		super.aClass95_Sub1_36.method2077(this);
		if (arg5 && super.anInt8058 != 34037) {
			Static272.method3796(arg4, arg1, arg2, arg3, arg7, arg6);
			this.method6827(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8058, 0, super.anInt8057, this.anInt1694, this.anInt1686, 0, arg7, 5126, arg6, 0);
			this.method6827(false);
		}
		this.method6836(true);
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ep;IIIIZ[BIZ)V")
	public Class65_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1686 = arg4;
		this.anInt1694 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8058 != 34037) {
			Static528.method7296(arg6, arg4, arg2, arg7, arg1, arg3);
			this.method6827(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8058, 0, super.anInt8057, this.anInt1694, this.anInt1686, 0, arg7, 5121, arg6, 0);
			this.method6827(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6836(true);
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ep;IIII)V")
	public Class65_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt1686 = arg4;
		this.anInt1694 = arg3;
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glTexImage2Dub(super.anInt8058, 0, super.anInt8057, arg3, arg4, 0, Static194.method7690(super.anInt8057), 5121, null, 0);
		this.method6836(true);
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ep;IIIII)V")
	public Class65_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt1694 = arg4;
		this.anInt1686 = arg5;
		@Pc(29) int local29 = super.aClass95_Sub1_36.anInt2469 - arg5 - arg3;
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glCopyTexImage2D(super.anInt8058, 0, super.anInt8057, arg2, local29, arg4, arg5, 0);
		this.method6836(true);
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ep;IIIIZ[IIIZ)V")
	public Class65_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1694 = arg3;
		this.anInt1686 = arg4;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass95_Sub1_36.method2077(this);
		if (super.anInt8058 != 34037 && arg5 && arg7 == 0) {
			Static101.method1538(super.aClass95_Sub1_36.anInt2550, this.anInt1694, arg6, super.anInt8057, this.anInt1686, super.anInt8058);
			this.method6827(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt8058, 0, super.anInt8057, this.anInt1694, this.anInt1686, 0, 32993, super.aClass95_Sub1_36.anInt2550, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6827(false);
		}
		this.method6836(true);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public final void method6824() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1690, this.anInt1684, super.anInt8058, 0, 0);
		this.anInt1690 = -1;
		this.anInt1684 = -1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIII)V")
	public final void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass95_Sub1_36.anInt2469 - arg2 - arg4;
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8058, 0, arg0, this.anInt1686 - arg2 - arg5, arg3, local12, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZZI)V")
	public final void method1424(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt8058 == 3553) {
			super.aClass95_Sub1_36.method2077(this);
			OpenGL.glTexParameteri(super.anInt8058, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8058, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBIIZ[BIIII)V")
	public final void method1426(@OriginalArg(4) boolean arg0, @OriginalArg(5) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3, @OriginalArg(9) int arg4) {
		if (arg0) {
			@Pc(22) int local22 = Static513.method7197(6406);
			@Pc(26) int local26 = local22 * arg2;
			@Pc(30) int local30 = local22 * arg2;
			@Pc(35) byte[] local35 = new byte[local26 * arg3];
			for (@Pc(37) int local37 = 0; local37 < arg3; local37++) {
				@Pc(43) int local43 = local37 * local26;
				@Pc(53) int local53 = (arg3 - local37 - 1) * local30;
				for (@Pc(55) int local55 = 0; local55 < local26; local55++) {
					local35[local43++] = arg1[local53++];
				}
			}
			arg1 = local35;
		}
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8058, 0, 0, 0, arg2, arg3, 6406, 5121, arg1, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[IIIIIIIZ)V")
	protected final void method1428(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int arg2) {
		@Pc(27) int[] local27 = new int[arg1 * arg2];
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(35) int local35 = arg2 * local29;
			@Pc(46) int local46 = (arg1 - local29 - 1) * arg2;
			for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
				local27[local35++] = arg0[local46++];
			}
		}
		super.aClass95_Sub1_36.method2077(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt8058, 0, 0, 0, arg2, arg1, 32993, super.aClass95_Sub1_36.anInt2550, local27, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZI)V")
	public final void method1429(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt8058, super.anInt8055, 0);
		this.anInt1690 = arg0;
		this.anInt1684 = arg1;
	}
}
