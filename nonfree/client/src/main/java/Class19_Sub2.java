import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
	private int anInt2878 = -1;

	@OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
	private int anInt2883 = -1;

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
	public final int anInt2872;

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
	public final int anInt2873;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!os;IIIII)V")
	protected Class19_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt2872 = arg5;
		this.anInt2873 = arg4;
		@Pc(30) int local30 = super.aClass39_Sub3_26.anInt6701 - arg5 - arg3;
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glCopyTexImage2D(super.anInt5629, 0, super.anInt5628, arg2, local30, arg4, arg5, 0);
		this.method4799(true);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!os;IIIIZ[BIZ)V")
	public Class19_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2873 = arg3;
		this.anInt2872 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5629 != 34037) {
			Static332.method5297(arg6, arg3, arg4, arg2, arg1, arg7);
			this.method4806(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5629, 0, super.anInt5628, this.anInt2873, this.anInt2872, 0, arg7, 5121, arg6, 0);
			this.method4806(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4799(true);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!os;IIIIZ[FI)V")
	public Class19_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2872 = arg4;
		this.anInt2873 = arg3;
		super.aClass39_Sub3_26.method5719(this);
		if (arg5 && super.anInt5629 != 34037) {
			Static117.method2253(arg2, arg3, arg6, arg7, arg4, arg1);
			this.method4806(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5629, 0, super.anInt5628, this.anInt2873, this.anInt2872, 0, arg7, 5126, arg6, 0);
			this.method4806(false);
		}
		this.method4799(true);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!os;IIII)V")
	public Class19_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt2873 = arg3;
		this.anInt2872 = arg4;
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glTexImage2Dub(super.anInt5629, 0, super.anInt5628, arg3, arg4, 0, Static428.method6599(super.anInt5628), 5121, null, 0);
		this.method4799(true);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!os;IIIIZ[IZ)V")
	public Class19_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2873 = arg3;
		this.anInt2872 = arg4;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass39_Sub3_26.method5719(this);
		if (arg5 && super.anInt5629 != 34037) {
			Static304.method4760(super.anInt5628, super.anInt5629, this.anInt2873, this.anInt2872, super.aClass39_Sub3_26.anInt6735, arg6);
			this.method4806(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5629, 0, super.anInt5628, this.anInt2873, this.anInt2872, 0, 32993, super.aClass39_Sub3_26.anInt6735, arg6, 0);
			this.method4806(false);
		}
		this.method4799(true);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZZ)V")
	public final void method2691(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5629 == 3553) {
			super.aClass39_Sub3_26.method5719(this);
			OpenGL.glTexParameteri(super.anInt5629, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5629, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII)V")
	public final void method2692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass39_Sub3_26.anInt6701 - arg1 - arg4;
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5629, 0, arg3, this.anInt2872 - arg0 - arg1, arg5, local13, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIII)V")
	public final void method2693(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt5629, super.anInt5624, 0);
		this.anInt2883 = arg0;
		this.anInt2878 = arg1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III[IZIIII)V")
	protected final void method2694(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(8) int arg2) {
		@Pc(25) int[] local25 = new int[arg2 * arg0];
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			@Pc(33) int local33 = local27 * arg0;
			@Pc(44) int local44 = (arg2 - local27 - 1) * arg0;
			for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
				local25[local33++] = arg1[local44++];
			}
		}
		super.aClass39_Sub3_26.method5719(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt5629, 0, 0, 0, arg0, arg2, 32993, super.aClass39_Sub3_26.anInt6735, local25, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	@Override
	public final void method4798() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2883, this.anInt2878, super.anInt5629, 0, 0);
		this.anInt2883 = -1;
		this.anInt2878 = -1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIZ[BIZIIII)V")
	public final void method2697(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (arg1) {
			@Pc(18) int local18 = Static472.method6911(6406);
			@Pc(22) int local22 = arg0 * local18;
			@Pc(26) int local26 = local18 * arg0;
			@Pc(31) byte[] local31 = new byte[arg4 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg4; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(50) int local50 = (arg4 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg2[local50++];
				}
			}
			arg2 = local31;
		}
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5629, 0, 0, 0, arg0, arg4, 6406, 5121, arg2, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
