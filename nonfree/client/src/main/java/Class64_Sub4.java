import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public class Class64_Sub4 extends Class64 {

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
	private int anInt4999 = -1;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
	private int anInt5006 = -1;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
	public final int anInt5007;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
	public final int anInt5008;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!uja;IIIIZ[BIZ)V")
	public Class64_Sub4(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5007 = arg4;
		this.anInt5008 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt4996 != 34037) {
			Static516.method7321(arg1, arg2, arg3, arg4, arg6, arg7);
			this.method4546(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt4996, 0, super.anInt4992, this.anInt5008, this.anInt5007, 0, arg7, 5121, arg6, 0);
			this.method4546(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4540(true);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!uja;IIIIZ[IIIZ)V")
	public Class64_Sub4(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5008 = arg3;
		this.anInt5007 = arg4;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass145_Sub3_27.method8872(this);
		if (super.anInt4996 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static14.method221(super.anInt4996, this.anInt5007, super.anInt4992, this.anInt5008, super.aClass145_Sub3_27.anInt10181, arg6);
			this.method4546(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt4996, 0, super.anInt4992, this.anInt5008, this.anInt5007, 0, 32993, super.aClass145_Sub3_27.anInt10181, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method4546(false);
		}
		this.method4540(true);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!uja;IIIIZ[FI)V")
	public Class64_Sub4(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5007 = arg4;
		this.anInt5008 = arg3;
		super.aClass145_Sub3_27.method8872(this);
		if (arg5 && super.anInt4996 != 34037) {
			Static707.method9447(arg2, arg3, arg6, arg7, arg1, arg4);
			this.method4546(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt4996, 0, super.anInt4992, this.anInt5008, this.anInt5007, 0, arg7, 5126, arg6, 0);
			this.method4546(false);
		}
		this.method4540(true);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!uja;IIII)V")
	public Class64_Sub4(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt5008 = arg3;
		this.anInt5007 = arg4;
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glTexImage2Dub(super.anInt4996, 0, super.anInt4992, arg3, arg4, 0, Static100.method1532(super.anInt4992), 5121, (byte[]) null, 0);
		this.method4540(true);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!uja;IIIII)V")
	public Class64_Sub4(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt5007 = arg5;
		this.anInt5008 = arg4;
		@Pc(30) int local30 = super.aClass145_Sub3_27.anInt10030 - arg5 - arg3;
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glCopyTexImage2D(super.anInt4996, 0, super.anInt4992, arg2, local30, arg4, arg5, 0);
		this.method4540(true);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIZ[BIIII)V")
	public final void method4547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(7) int arg4) {
		if (arg2) {
			@Pc(18) int local18 = Static582.method8098(6406);
			@Pc(22) int local22 = arg1 * local18;
			@Pc(26) int local26 = local18 * arg1;
			@Pc(31) byte[] local31 = new byte[local22 * arg0];
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(51) int local51 = local26 * (arg0 - local33 - 1);
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg3[local51++];
				}
			}
			arg3 = local31;
		}
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt4996, 0, 0, 0, arg1, arg0, 6406, 5121, arg3, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	@Override
	public final void method4536() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5006, this.anInt4999, super.anInt4996, 0, 0);
		this.anInt5006 = -1;
		this.anInt4999 = -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIZ)V")
	public final void method4548(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt4996 == 3553) {
			super.aClass145_Sub3_27.method8872(this);
			OpenGL.glTexParameteri(super.anInt4996, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt4996, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBII)V")
	public final void method4549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt4996, super.anInt4988, 0);
		this.anInt5006 = arg1;
		this.anInt4999 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)V")
	public final void method4550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass145_Sub3_27.anInt10030 - arg3 - arg2;
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glCopyTexSubImage2D(super.anInt4996, 0, arg4, this.anInt5007 - arg3 - arg5, arg0, local12, arg1, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIZI[I)V")
	public final void method4552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int[] arg5) {
		if (arg2 == 0) {
			arg2 = arg4;
		}
		@Pc(19) int[] local19 = new int[arg4 * arg0];
		for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
			@Pc(27) int local27 = arg4 * local21;
			@Pc(38) int local38 = arg2 * (arg0 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg4; local40++) {
				local19[local27++] = arg5[local38++];
			}
		}
		super.aClass145_Sub3_27.method8872(this);
		if (arg4 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt4996, 0, arg1, this.anInt5007 - arg0 - arg3, arg4, arg0, 32993, super.aClass145_Sub3_27.anInt10181, local19, 0);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
