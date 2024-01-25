import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
	private int anInt2649 = -1;

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	private int anInt2645 = -1;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
	public final int anInt2642;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
	public final int anInt2641;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!bo;IIIIZ[FI)V")
	public Class65_Sub3(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2642 = arg3;
		this.anInt2641 = arg4;
		super.aClass26_Sub1_26.method673(this);
		if (arg5 && super.anInt5266 != 34037) {
			Static285.method4201(arg1, arg3, arg6, arg4, arg7, arg2);
			this.method4256(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5266, 0, super.anInt5260, this.anInt2642, this.anInt2641, 0, arg7, 5126, arg6, 0);
			this.method4256(false);
		}
		this.method4263(true);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!bo;IIIII)V")
	protected Class65_Sub3(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt2641 = arg5;
		this.anInt2642 = arg4;
		@Pc(30) int local30 = super.aClass26_Sub1_26.anInt786 - arg5 - arg3;
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glCopyTexImage2D(super.anInt5266, 0, super.anInt5260, arg2, local30, arg4, arg5, 0);
		this.method4263(true);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!bo;IIII)V")
	public Class65_Sub3(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt2642 = arg3;
		this.anInt2641 = arg4;
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glTexImage2Dub(super.anInt5266, 0, super.anInt5260, arg3, arg4, 0, Static449.method1966(super.anInt5260), 5121, null, 0);
		this.method4263(true);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!bo;IIIIZ[IZ)V")
	public Class65_Sub3(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2641 = arg4;
		this.anInt2642 = arg3;
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
		super.aClass26_Sub1_26.method673(this);
		if (arg5 && super.anInt5266 != 34037) {
			Static186.method2957(this.anInt2642, arg6, super.anInt5260, super.aClass26_Sub1_26.anInt939, super.anInt5266, this.anInt2641);
			this.method4256(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5266, 0, super.anInt5260, this.anInt2642, this.anInt2641, 0, 32993, super.aClass26_Sub1_26.anInt939, arg6, 0);
			this.method4256(false);
		}
		this.method4263(true);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!bo;IIIIZ[BIZ)V")
	public Class65_Sub3(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2641 = arg4;
		this.anInt2642 = arg3;
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
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5266 != 34037) {
			Static198.method3092(arg2, arg6, arg3, arg7, arg1, arg4);
			this.method4256(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5266, 0, super.anInt5260, this.anInt2642, this.anInt2641, 0, arg7, 5121, arg6, 0);
			this.method4256(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4263(true);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	@Override
	public final void method4255() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2649, this.anInt2645, super.anInt5266, 0, 0);
		this.anInt2649 = -1;
		this.anInt2645 = -1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
	public final void method1959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass26_Sub1_26.anInt786 - arg1;
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5266, 0, arg0, this.anInt2641 - arg2 - arg1, 0, local13, arg3, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZZ)V")
	public final void method1962(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5266 == 3553) {
			super.aClass26_Sub1_26.method673(this);
			OpenGL.glTexParameteri(super.anInt5266, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5266, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZB[BIIIIII)V")
	public final void method1963(@OriginalArg(1) boolean arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (arg0) {
			@Pc(18) int local18 = Static346.method4858(6406);
			@Pc(22) int local22 = arg3 * local18;
			@Pc(26) int local26 = arg3 * local18;
			@Pc(31) byte[] local31 = new byte[arg2 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = local26 * (arg2 - local33 - 1);
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg1[local50++];
				}
			}
			arg1 = local31;
		}
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5266, 0, 0, 0, arg3, arg2, 6406, 5121, arg1, 0);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII)V")
	public final void method1964(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt5266, super.anInt5269, 0);
		this.anInt2649 = arg0;
		this.anInt2645 = arg1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZIIIBII[I)V")
	protected final void method1965(@OriginalArg(4) int arg0, @OriginalArg(6) int arg1, @OriginalArg(8) int[] arg2) {
		@Pc(16) int[] local16 = new int[arg0 * arg1];
		for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
			@Pc(24) int local24 = arg0 * local18;
			@Pc(35) int local35 = (arg1 - local18 - 1) * arg0;
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				local16[local24++] = arg2[local35++];
			}
		}
		super.aClass26_Sub1_26.method673(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt5266, 0, 0, 0, arg0, arg1, 32993, super.aClass26_Sub1_26.anInt939, local16, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
