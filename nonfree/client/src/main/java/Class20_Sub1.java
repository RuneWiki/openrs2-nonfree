import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	private int anInt2463 = -1;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	private int anInt2465 = -1;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public final int anInt2466;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public final int anInt2464;

	static {
		new Class134("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!pg;IIIII)V")
	protected Class20_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt2466 = arg4;
		this.anInt2464 = arg5;
		@Pc(29) int local29 = super.aClass163_Sub2_27.anInt5121 - arg3 - arg5;
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glCopyTexImage2D(super.anInt3919, 0, super.anInt3921, arg2, local29, arg4, arg5, 0);
		this.method3113(true);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!pg;IIIIZ[IZ)V")
	public Class20_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2464 = arg4;
		this.anInt2466 = arg3;
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
		super.aClass163_Sub2_27.method4118(this);
		if (arg5 && super.anInt3919 != 34037) {
			Static457.method5720(super.anInt3921, this.anInt2466, this.anInt2464, super.anInt3919, arg6, super.aClass163_Sub2_27.anInt5249);
			this.method3109(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt3919, 0, super.anInt3921, this.anInt2466, this.anInt2464, 0, 32993, super.aClass163_Sub2_27.anInt5249, arg6, 0);
			this.method3109(false);
		}
		this.method3113(true);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!pg;IIIIZ[BIZ)V")
	public Class20_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2466 = arg3;
		this.anInt2464 = arg4;
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
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt3919 != 34037) {
			Static43.method645(arg2, arg1, arg7, arg3, arg6, arg4);
			this.method3109(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt3919, 0, super.anInt3921, this.anInt2466, this.anInt2464, 0, arg7, 5121, arg6, 0);
			this.method3109(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method3113(true);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!pg;IIIIZ[FI)V")
	public Class20_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2464 = arg4;
		this.anInt2466 = arg3;
		super.aClass163_Sub2_27.method4118(this);
		if (arg5 && super.anInt3919 != 34037) {
			Static402.method5078(arg3, arg4, arg1, arg6, arg2, arg7);
			this.method3109(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt3919, 0, super.anInt3921, this.anInt2466, this.anInt2464, 0, arg7, 5126, arg6, 0);
			this.method3109(false);
		}
		this.method3113(true);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!pg;IIII)V")
	public Class20_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt2466 = arg3;
		this.anInt2464 = arg4;
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glTexImage2Dub(super.anInt3919, 0, super.anInt3921, arg3, arg4, 0, Static452.method5679(super.anInt3921), 5121, null, 0);
		this.method3113(true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZIZ)V")
	public final void method2040(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt3919 == 3553) {
			super.aClass163_Sub2_27.method4118(this);
			OpenGL.glTexParameteri(super.anInt3919, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt3919, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([IZIBIIIII)V")
	protected final void method2041(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(19) int[] local19 = new int[arg2 * arg1];
		for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
			@Pc(27) int local27 = arg2 * local21;
			@Pc(38) int local38 = (arg1 - local21 - 1) * arg2;
			for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
				local19[local27++] = arg0[local38++];
			}
		}
		super.aClass163_Sub2_27.method4118(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt3919, 0, 0, 0, arg2, arg1, 32993, super.aClass163_Sub2_27.anInt5249, local19, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBIII)V")
	public final void method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = super.aClass163_Sub2_27.anInt5121 - arg0;
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glCopyTexSubImage2D(super.anInt3919, 0, arg5, this.anInt2464 - arg4 - arg0, 0, local21, arg1, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
	public final void method2045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt3919, super.anInt3922, 0);
		this.anInt2465 = arg1;
		this.anInt2463 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	@Override
	public final void method4531() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2465, this.anInt2463, super.anInt3919, 0, 0);
		this.anInt2463 = -1;
		this.anInt2465 = -1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZIIZIIII[B)V")
	public final void method2046(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(9) byte[] arg4) {
		if (arg2) {
			@Pc(30) int local30 = Static334.method4468(6406);
			@Pc(34) int local34 = arg0 * local30;
			@Pc(38) int local38 = arg0 * local30;
			@Pc(43) byte[] local43 = new byte[arg3 * local34];
			for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
				@Pc(51) int local51 = local34 * local45;
				@Pc(62) int local62 = (arg3 - local45 - 1) * local38;
				for (@Pc(64) int local64 = 0; local64 < local34; local64++) {
					local43[local51++] = arg4[local62++];
				}
			}
			arg4 = local43;
		}
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt3919, 0, 0, 0, arg0, arg3, 6406, 5121, arg4, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
