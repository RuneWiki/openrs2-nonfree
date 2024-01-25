import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public class Class40_Sub3 extends Class40 {

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
	private int anInt6735 = -1;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
	private int anInt6747 = -1;

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
	public final int anInt6745;

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
	public final int anInt6741;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ok;IIIIZ[IZ)V")
	public Class40_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt6745 = arg4;
		this.anInt6741 = arg3;
		if (arg7) {
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
		super.aClass134_Sub2_31.method5202(this);
		if (arg5 && super.anInt7362 != 34037) {
			Static459.method6337(super.anInt7350, this.anInt6741, this.anInt6745, arg6, super.anInt7362, super.aClass134_Sub2_31.anInt6595);
			this.method5879(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7362, 0, super.anInt7350, this.anInt6741, this.anInt6745, 0, 32993, super.aClass134_Sub2_31.anInt6595, arg6, 0);
			this.method5879(false);
		}
		this.method5874(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ok;IIIIZ[BIZ)V")
	public Class40_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6745 = arg4;
		this.anInt6741 = arg3;
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
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7362 != 34037) {
			Static97.method408(arg7, arg3, arg2, arg4, arg1, arg6);
			this.method5879(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7362, 0, super.anInt7350, this.anInt6741, this.anInt6745, 0, arg7, 5121, arg6, 0);
			this.method5879(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5874(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ok;IIIII)V")
	public Class40_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt6745 = arg5;
		this.anInt6741 = arg4;
		@Pc(30) int local30 = super.aClass134_Sub2_31.anInt6489 - arg5 - arg3;
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glCopyTexImage2D(super.anInt7362, 0, super.anInt7350, arg2, local30, arg4, arg5, 0);
		this.method5874(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ok;IIIIZ[FI)V")
	public Class40_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt6741 = arg3;
		this.anInt6745 = arg4;
		super.aClass134_Sub2_31.method5202(this);
		if (arg5 && super.anInt7362 != 34037) {
			Static3.method51(arg6, arg3, arg7, arg1, arg2, arg4);
			this.method5879(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7362, 0, super.anInt7350, this.anInt6741, this.anInt6745, 0, arg7, 5126, arg6, 0);
			this.method5879(false);
		}
		this.method5874(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ok;IIII)V")
	public Class40_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt6745 = arg4;
		this.anInt6741 = arg3;
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glTexImage2Dub(super.anInt7362, 0, super.anInt7350, arg3, arg4, 0, Static22.method242(super.anInt7350), 5121, null, 0);
		this.method5874(true);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	@Override
	public final void method5870() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6747, this.anInt6735, super.anInt7362, 0, 0);
		this.anInt6735 = -1;
		this.anInt6747 = -1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([BIIIIZIIII)V")
	public final void method5387(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(8) int arg3, @OriginalArg(9) int arg4) {
		if (arg2) {
			@Pc(32) int local32 = Static219.method5965(6406);
			@Pc(36) int local36 = arg1 * local32;
			@Pc(40) int local40 = arg1 * local32;
			@Pc(45) byte[] local45 = new byte[arg4 * local36];
			for (@Pc(47) int local47 = 0; local47 < arg4; local47++) {
				@Pc(53) int local53 = local36 * local47;
				@Pc(64) int local64 = (arg4 - local47 - 1) * local40;
				for (@Pc(66) int local66 = 0; local66 < local36; local66++) {
					local45[local53++] = arg0[local64++];
				}
			}
			arg0 = local45;
		}
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7362, 0, 0, 0, arg1, arg4, 6406, 5121, arg0, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([IIIBIIIZI)V")
	protected final void method5388(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2) {
		@Pc(16) int[] local16 = new int[arg2 * arg1];
		for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
			@Pc(24) int local24 = arg2 * local18;
			@Pc(34) int local34 = arg2 * (arg1 - local18 - 1);
			for (@Pc(36) int local36 = 0; local36 < arg2; local36++) {
				local16[local24++] = arg0[local34++];
			}
		}
		super.aClass134_Sub2_31.method5202(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt7362, 0, 0, 0, arg2, arg1, 32993, super.aClass134_Sub2_31.anInt6595, local16, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V")
	public final void method5390(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt7362, super.anInt7359, 0);
		this.anInt6735 = arg0;
		this.anInt6747 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZZ)V")
	public final void method5391(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7362 == 3553) {
			super.aClass134_Sub2_31.method5202(this);
			OpenGL.glTexParameteri(super.anInt7362, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7362, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBIIIII)V")
	public final void method5392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = super.aClass134_Sub2_31.anInt6489 - arg4 - arg3;
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7362, 0, arg0, this.anInt6745 - arg1 - arg4, arg5, local17, arg2, arg4);
		OpenGL.glFlush();
	}
}
