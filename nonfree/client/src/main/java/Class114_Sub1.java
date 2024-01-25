import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "I")
	private int anInt5914 = -1;

	@OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
	private int anInt5919 = -1;

	@OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
	public final int anInt5918;

	@OriginalMember(owner = "client!gaa", name = "I", descriptor = "I")
	public final int anInt5921;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!no;IIIIZ[BIZ)V")
	public Class114_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5918 = arg4;
		this.anInt5921 = arg3;
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
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5902 != 34037) {
			Static283.method4481(arg2, arg4, arg1, arg6, arg7, arg3);
			this.method4997(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5902, 0, super.anInt5900, this.anInt5921, this.anInt5918, 0, arg7, 5121, arg6, 0);
			this.method4997(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4999(true);
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!no;IIIIZ[FI)V")
	public Class114_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5918 = arg4;
		this.anInt5921 = arg3;
		super.aClass66_Sub3_28.method5382(this);
		if (arg5 && super.anInt5902 != 34037) {
			Static306.method4734(arg2, arg4, arg7, arg6, arg3, arg1);
			this.method4997(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5902, 0, super.anInt5900, this.anInt5921, this.anInt5918, 0, arg7, 5126, arg6, 0);
			this.method4997(false);
		}
		this.method4999(true);
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!no;IIII)V")
	public Class114_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt5918 = arg4;
		this.anInt5921 = arg3;
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glTexImage2Dub(super.anInt5902, 0, super.anInt5900, arg3, arg4, 0, Static516.method2307(super.anInt5900), 5121, null, 0);
		this.method4999(true);
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!no;IIIII)V")
	public Class114_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt5921 = arg4;
		this.anInt5918 = arg5;
		@Pc(29) int local29 = super.aClass66_Sub3_28.anInt6320 - arg3 - arg5;
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glCopyTexImage2D(super.anInt5902, 0, super.anInt5900, arg2, local29, arg4, arg5, 0);
		this.method4999(true);
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!no;IIIIZ[IZ)V")
	public Class114_Sub1(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5918 = arg4;
		this.anInt5921 = arg3;
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
		super.aClass66_Sub3_28.method5382(this);
		if (arg5 && super.anInt5902 != 34037) {
			Static281.method4444(arg6, super.anInt5902, this.anInt5921, super.anInt5900, this.anInt5918, super.aClass66_Sub3_28.anInt6459);
			this.method4997(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5902, 0, super.anInt5900, this.anInt5921, this.anInt5918, 0, 32993, super.aClass66_Sub3_28.anInt6459, arg6, 0);
			this.method4997(false);
		}
		this.method4999(true);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIII)V")
	public final void method5007(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt5902, super.anInt5897, 0);
		this.anInt5919 = arg1;
		this.anInt5914 = arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZB)V")
	public final void method5008(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt5902 == 3553) {
			super.aClass66_Sub3_28.method5382(this);
			OpenGL.glTexParameteri(super.anInt5902, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5902, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
	@Override
	public final void method4996() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5919, this.anInt5914, super.anInt5902, 0, 0);
		this.anInt5914 = -1;
		this.anInt5919 = -1;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIIII)V")
	public final void method5010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = super.aClass66_Sub3_28.anInt6320 - arg5 - arg1;
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5902, 0, arg2, this.anInt5918 - arg3 - arg1, arg4, local19, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([IIIIIIIIZ)V")
	protected final void method5011(@OriginalArg(0) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		@Pc(16) int[] local16 = new int[arg2 * arg1];
		for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
			@Pc(24) int local24 = arg2 * local18;
			@Pc(34) int local34 = arg2 * (arg1 - local18 - 1);
			for (@Pc(36) int local36 = 0; local36 < arg2; local36++) {
				local16[local24++] = arg0[local34++];
			}
		}
		super.aClass66_Sub3_28.method5382(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt5902, 0, 0, 0, arg2, arg1, 32993, super.aClass66_Sub3_28.anInt6459, local16, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIIII[BIZI)V")
	public final void method5014(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) boolean arg4) {
		if (arg4) {
			@Pc(15) int local15 = Static257.method4279(6406);
			@Pc(19) int local19 = local15 * arg1;
			@Pc(23) int local23 = local15 * arg1;
			@Pc(28) byte[] local28 = new byte[local19 * arg3];
			for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(48) int local48 = (arg3 - local30 - 1) * local23;
				for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
					local28[local36++] = arg2[local48++];
				}
			}
			arg2 = local28;
		}
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5902, 0, 0, 0, arg1, arg3, 6406, 5121, arg2, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
