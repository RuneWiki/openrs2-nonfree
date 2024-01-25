import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	private int anInt2182 = -1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt2180 = -1;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public final int anInt2179;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "I")
	public final int anInt2188;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!us;IIIIZ[BIZ)V")
	public Class34_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2179 = arg3;
		this.anInt2188 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5770 != 34037) {
			Static295.method4688(arg6, arg1, arg7, arg2, arg3, arg4);
			this.method4971(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5770, 0, super.anInt5764, this.anInt2179, this.anInt2188, 0, arg7, 5121, arg6, 0);
			this.method4971(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4974(true);
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!us;IIIIZ[FI)V")
	public Class34_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2188 = arg4;
		this.anInt2179 = arg3;
		super.aClass43_Sub3_23.method7220(this);
		if (arg5 && super.anInt5770 != 34037) {
			Static481.method6575(arg4, arg7, arg2, arg1, arg3, arg6);
			this.method4971(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5770, 0, super.anInt5764, this.anInt2179, this.anInt2188, 0, arg7, 5126, arg6, 0);
			this.method4971(false);
		}
		this.method4974(true);
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!us;IIIII)V")
	public Class34_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt2179 = arg4;
		this.anInt2188 = arg5;
		@Pc(30) int local30 = super.aClass43_Sub3_23.anInt8564 - arg5 - arg3;
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glCopyTexImage2D(super.anInt5770, 0, super.anInt5764, arg2, local30, arg4, arg5, 0);
		this.method4974(true);
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!us;IIIIZ[IZ)V")
	public Class34_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2188 = arg4;
		this.anInt2179 = arg3;
		if (arg7) {
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
		super.aClass43_Sub3_23.method7220(this);
		if (arg5 && super.anInt5770 != 34037) {
			Static65.method1515(super.anInt5770, arg6, this.anInt2188, super.aClass43_Sub3_23.anInt8763, this.anInt2179, super.anInt5764);
			this.method4971(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5770, 0, super.anInt5764, this.anInt2179, this.anInt2188, 0, 32993, super.aClass43_Sub3_23.anInt8763, arg6, 0);
			this.method4971(false);
		}
		this.method4974(true);
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!us;IIII)V")
	public Class34_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt2188 = arg4;
		this.anInt2179 = arg3;
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glTexImage2Dub(super.anInt5770, 0, super.anInt5764, arg3, arg4, 0, Static562.method7491(super.anInt5764), 5121, null, 0);
		this.method4974(true);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
	public final void method1959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt5770, super.anInt5765, 0);
		this.anInt2180 = arg1;
		this.anInt2182 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I[IIIZIIII)V")
	protected final void method1961(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(19) int[] local19 = new int[arg2 * arg1];
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(27) int local27 = local21 * arg1;
			@Pc(38) int local38 = arg1 * (arg2 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				local19[local27++] = arg0[local38++];
			}
		}
		super.aClass43_Sub3_23.method7220(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt5770, 0, 0, 0, arg1, arg2, 32993, super.aClass43_Sub3_23.anInt8763, local19, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public final void method4969() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2180, this.anInt2182, super.anInt5770, 0, 0);
		this.anInt2180 = -1;
		this.anInt2182 = -1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)V")
	public final void method1962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = super.aClass43_Sub3_23.anInt8564 - arg0 - arg2;
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5770, 0, arg5, this.anInt2188 - arg3 - arg0, arg1, local18, arg4, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIZ[B)V")
	public final void method1963(@OriginalArg(4) int arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2, @OriginalArg(8) boolean arg3, @OriginalArg(9) byte[] arg4) {
		if (arg3) {
			@Pc(17) int local17 = Static57.method1112(6406);
			@Pc(21) int local21 = local17 * arg2;
			@Pc(25) int local25 = arg2 * local17;
			@Pc(30) byte[] local30 = new byte[arg1 * local21];
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				@Pc(38) int local38 = local32 * local21;
				@Pc(50) int local50 = (arg1 - local32 - 1) * local25;
				for (@Pc(52) int local52 = 0; local52 < local21; local52++) {
					local30[local38++] = arg4[local50++];
				}
			}
			arg4 = local30;
		}
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5770, 0, 0, 0, arg2, arg1, 6406, 5121, arg4, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIZ)V")
	public final void method1964(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5770 == 3553) {
			super.aClass43_Sub3_23.method7220(this);
			OpenGL.glTexParameteri(super.anInt5770, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5770, 10243, arg1 ? 10497 : 33071);
		}
	}
}
