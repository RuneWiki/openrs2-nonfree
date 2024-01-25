import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public class Class24_Sub4 extends Class24 {

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
	private int anInt7718 = -1;

	@OriginalMember(owner = "client!sia", name = "B", descriptor = "I")
	private int anInt7722 = -1;

	@OriginalMember(owner = "client!sia", name = "C", descriptor = "I")
	public final int anInt7723;

	@OriginalMember(owner = "client!sia", name = "G", descriptor = "I")
	public final int anInt7727;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!rda;IIII)V")
	public Class24_Sub4(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt7723 = arg4;
		this.anInt7727 = arg3;
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glTexImage2Dub(super.anInt7702, 0, super.anInt7714, arg3, arg4, 0, Static274.method8783(super.anInt7714), 5121, (byte[]) null, 0);
		this.method6783(true);
	}

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!rda;IIIII)V")
	public Class24_Sub4(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt7727 = arg4;
		this.anInt7723 = arg5;
		@Pc(29) int local29 = super.aClass126_Sub3_30.anInt8084 - arg3 - arg5;
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glCopyTexImage2D(super.anInt7702, 0, super.anInt7714, arg2, local29, arg4, arg5, 0);
		this.method6783(true);
	}

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!rda;IIIIZ[IIIZ)V")
	public Class24_Sub4(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7727 = arg3;
		this.anInt7723 = arg4;
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
		super.aClass126_Sub3_30.method7113(this);
		if (super.anInt7702 != 34037 && arg5 && arg7 == 0) {
			Static232.method3615(this.anInt7727, super.anInt7702, this.anInt7723, super.anInt7714, arg6, super.aClass126_Sub3_30.anInt8314);
			this.method6782(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt7702, 0, super.anInt7714, this.anInt7727, this.anInt7723, 0, 32993, super.aClass126_Sub3_30.anInt8314, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6782(false);
		}
		this.method6783(true);
	}

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!rda;IIIIZ[BIZ)V")
	public Class24_Sub4(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7723 = arg4;
		this.anInt7727 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7702 != 34037) {
			Static433.method6471(arg4, arg2, arg3, arg1, arg7, arg6);
			this.method6782(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7702, 0, super.anInt7714, this.anInt7727, this.anInt7723, 0, arg7, 5121, arg6, 0);
			this.method6782(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6783(true);
	}

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!rda;IIIIZ[FI)V")
	public Class24_Sub4(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7727 = arg3;
		this.anInt7723 = arg4;
		super.aClass126_Sub3_30.method7113(this);
		if (arg5 && super.anInt7702 != 34037) {
			Static543.method8851(arg1, arg3, arg6, arg4, arg2, arg7);
			this.method6782(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7702, 0, super.anInt7714, this.anInt7727, this.anInt7723, 0, arg7, 5126, arg6, 0);
			this.method6782(false);
		}
		this.method6783(true);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BIIIIZ[III)V")
	public final void method6788(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int[] arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg4 == 0) {
			arg4 = arg0;
		}
		@Pc(19) int[] local19 = new int[arg0 * arg1];
		for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
			@Pc(27) int local27 = local21 * arg0;
			@Pc(38) int local38 = arg4 * (arg1 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				local19[local27++] = arg3[local38++];
			}
		}
		super.aClass126_Sub3_30.method7113(this);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Di(super.anInt7702, 0, arg5, this.anInt7723 - arg2 - arg1, arg0, arg1, 32993, super.aClass126_Sub3_30.anInt8314, local19, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIBI)V")
	public final void method6789(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt7702, super.anInt7710, 0);
		this.anInt7722 = arg0;
		this.anInt7718 = arg1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIII)V")
	public final void method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass126_Sub3_30.anInt8084 - arg2 - arg0;
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7702, 0, arg5, this.anInt7723 - arg3 - arg2, arg4, local13, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
	@Override
	public final void method6776() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7722, this.anInt7718, super.anInt7702, 0, 0);
		this.anInt7718 = -1;
		this.anInt7722 = -1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BZZ)V")
	public final void method6792(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7702 == 3553) {
			super.aClass126_Sub3_30.method7113(this);
			OpenGL.glTexParameteri(super.anInt7702, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7702, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "([BIIIIIZIII)V")
	public final void method6794(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(6) boolean arg2, @OriginalArg(7) int arg3, @OriginalArg(9) int arg4) {
		if (arg2) {
			@Pc(18) int local18 = Static211.method3220(6406);
			@Pc(22) int local22 = local18 * arg4;
			@Pc(26) int local26 = local18 * arg4;
			@Pc(31) byte[] local31 = new byte[arg3 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg3; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(51) int local51 = (arg3 - local33 - 1) * local26;
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg0[local51++];
				}
			}
			arg0 = local31;
		}
		super.aClass126_Sub3_30.method7113(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7702, 0, 0, 0, arg4, arg3, 6406, 5121, arg0, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
