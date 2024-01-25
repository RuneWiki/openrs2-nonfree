import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public class Class64_Sub4 extends Class64 {

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	private int anInt4405 = -1;

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
	private int anInt4406 = -1;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
	public final int anInt4399;

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
	public final int anInt4403;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!na;IIIII)V")
	protected Class64_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt4399 = arg4;
		this.anInt4403 = arg5;
		@Pc(30) int local30 = super.aClass75_Sub2_24.anInt4822 - arg5 - arg3;
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glCopyTexImage2D(super.anInt4388, 0, super.anInt4384, arg2, local30, arg4, arg5, 0);
		this.method3523(true);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!na;IIIIZ[FI)V")
	public Class64_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4403 = arg4;
		this.anInt4399 = arg3;
		super.aClass75_Sub2_24.method3844(this);
		if (arg5 && super.anInt4388 != 34037) {
			Static41.method622(arg4, arg3, arg1, arg7, arg6, arg2);
			this.method3525(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt4388, 0, super.anInt4384, this.anInt4399, this.anInt4403, 0, arg7, 5126, arg6, 0);
			this.method3525(false);
		}
		this.method3523(true);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!na;IIII)V")
	public Class64_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt4399 = arg3;
		this.anInt4403 = arg4;
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glTexImage2Dub(super.anInt4388, 0, super.anInt4384, arg3, arg4, 0, Static353.method4961(super.anInt4384), 5121, null, 0);
		this.method3523(true);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!na;IIIIZ[BIZ)V")
	public Class64_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4403 = arg4;
		this.anInt4399 = arg3;
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
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt4388 != 34037) {
			Static140.method2188(arg7, arg4, arg2, arg1, arg3, arg6);
			this.method3525(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt4388, 0, super.anInt4384, this.anInt4399, this.anInt4403, 0, arg7, 5121, arg6, 0);
			this.method3525(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method3523(true);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!na;IIIIZ[IZ)V")
	public Class64_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4403 = arg4;
		this.anInt4399 = arg3;
		if (arg7) {
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
		super.aClass75_Sub2_24.method3844(this);
		if (arg5 && super.anInt4388 != 34037) {
			Static203.method2865(super.anInt4388, arg6, this.anInt4399, this.anInt4403, super.aClass75_Sub2_24.anInt4902, super.anInt4384);
			this.method3525(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt4388, 0, super.anInt4384, this.anInt4399, this.anInt4403, 0, 32993, super.aClass75_Sub2_24.anInt4902, arg6, 0);
			this.method3525(false);
		}
		this.method3523(true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBIII)V")
	public final void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass75_Sub2_24.anInt4822 - arg1;
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glCopyTexSubImage2D(super.anInt4388, 0, arg0, this.anInt4403 - arg4 - arg1, 0, local13, arg3, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBZ)V")
	public final void method3530(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt4388 == 3553) {
			super.aClass75_Sub2_24.method3844(this);
			OpenGL.glTexParameteri(super.anInt4388, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt4388, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ[IIIIII)V")
	protected final void method3533(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(17) int[] local17 = new int[arg0 * arg2];
		for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
			@Pc(25) int local25 = local19 * arg2;
			@Pc(36) int local36 = arg2 * (arg0 - local19 - 1);
			for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
				local17[local25++] = arg1[local36++];
			}
		}
		super.aClass75_Sub2_24.method3844(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt4388, 0, 0, 0, arg2, arg0, 32993, super.aClass75_Sub2_24.anInt4902, local17, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	@Override
	public final void method5596() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4405, this.anInt4406, super.anInt4388, 0, 0);
		this.anInt4405 = -1;
		this.anInt4406 = -1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII[BZIIIZ)V")
	public final void method3534(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4) {
		if (arg3) {
			@Pc(18) int local18 = Static368.method6275(6406);
			@Pc(22) int local22 = local18 * arg0;
			@Pc(26) int local26 = local18 * arg0;
			@Pc(31) byte[] local31 = new byte[local22 * arg4];
			for (@Pc(33) int local33 = 0; local33 < arg4; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = (arg4 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg2[local50++];
				}
			}
			arg2 = local31;
		}
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt4388, 0, 0, 0, arg0, arg4, 6406, 5121, arg2, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIB)V")
	public final void method3536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt4388, super.anInt4398, 0);
		this.anInt4405 = arg1;
		this.anInt4406 = arg0;
	}
}
