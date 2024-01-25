import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
	private int anInt1529 = -1;

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
	private int anInt1534 = -1;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
	public final int anInt1533;

	@OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
	public final int anInt1539;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!gk;IIII)V")
	public Class42_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt1533 = arg3;
		this.anInt1539 = arg4;
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glTexImage2Dub(super.anInt6241, 0, super.anInt6239, arg3, arg4, 0, Static142.method2552(super.anInt6239), 5121, null, 0);
		this.method4910(true);
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!gk;IIIII)V")
	protected Class42_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt1539 = arg5;
		this.anInt1533 = arg4;
		@Pc(29) int local29 = super.aClass75_Sub2_37.anInt3074 - arg3 - arg5;
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glCopyTexImage2D(super.anInt6241, 0, super.anInt6239, arg2, local29, arg4, arg5, 0);
		this.method4910(true);
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!gk;IIIIZ[IZ)V")
	public Class42_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1533 = arg3;
		this.anInt1539 = arg4;
		if (arg7) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass75_Sub2_37.method2456(this);
		if (arg5 && super.anInt6241 != 34037) {
			Static259.method3924(super.aClass75_Sub2_37.anInt3110, this.anInt1539, arg6, super.anInt6241, this.anInt1533, super.anInt6239);
			this.method4915(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6241, 0, super.anInt6239, this.anInt1533, this.anInt1539, 0, 32993, super.aClass75_Sub2_37.anInt3110, arg6, 0);
			this.method4915(false);
		}
		this.method4910(true);
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!gk;IIIIZ[BIZ)V")
	public Class42_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1539 = arg4;
		this.anInt1533 = arg3;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6241 != 34037) {
			Static447.method5926(arg7, arg3, arg2, arg4, arg6, arg1);
			this.method4915(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6241, 0, super.anInt6239, this.anInt1533, this.anInt1539, 0, arg7, 5121, arg6, 0);
			this.method4915(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4910(true);
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!gk;IIIIZ[FI)V")
	public Class42_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1539 = arg4;
		this.anInt1533 = arg3;
		super.aClass75_Sub2_37.method2456(this);
		if (arg5 && super.anInt6241 != 34037) {
			Static193.method5122(arg3, arg7, arg4, arg6, arg1, arg2);
			this.method4915(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6241, 0, super.anInt6239, this.anInt1533, this.anInt1539, 0, arg7, 5126, arg6, 0);
			this.method4915(false);
		}
		this.method4910(true);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIB)V")
	public final void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12 = super.aClass75_Sub2_37.anInt3074 - arg2;
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6241, 0, arg0, this.anInt1539 - arg1 - arg2, 0, local12, arg4, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)V")
	public final void method1263(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt6241, super.anInt6233, 0);
		this.anInt1529 = arg0;
		this.anInt1534 = arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	@Override
	public final void method4908() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1534, this.anInt1529, super.anInt6241, 0, 0);
		this.anInt1534 = -1;
		this.anInt1529 = -1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([IIIIIIBZI)V")
	protected final void method1264(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(8) int arg2) {
		@Pc(18) int[] local18 = new int[arg1 * arg2];
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			@Pc(25) int local25 = arg1 * local20;
			@Pc(36) int local36 = (arg2 - local20 - 1) * arg1;
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				local18[local25++] = arg0[local36++];
			}
		}
		super.aClass75_Sub2_37.method2456(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt6241, 0, 0, 0, arg1, arg2, 32993, super.aClass75_Sub2_37.anInt3110, local18, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII[BZIIII)V")
	public final void method1266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			@Pc(14) int local14 = Static265.method3997(6406);
			@Pc(18) int local18 = local14 * arg1;
			@Pc(22) int local22 = arg1 * local14;
			@Pc(27) byte[] local27 = new byte[local18 * arg0];
			for (@Pc(29) int local29 = 0; local29 < arg0; local29++) {
				@Pc(34) int local34 = local18 * local29;
				@Pc(45) int local45 = local22 * (arg0 - local29 - 1);
				for (@Pc(47) int local47 = 0; local47 < local18; local47++) {
					local27[local34++] = arg3[local45++];
				}
			}
			arg3 = local27;
		}
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6241, 0, 0, 0, arg1, arg0, 6406, 5121, arg3, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZBZ)V")
	public final void method1269(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt6241 == 3553) {
			super.aClass75_Sub2_37.method2456(this);
			OpenGL.glTexParameteri(super.anInt6241, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6241, 10243, arg0 ? 10497 : 33071);
		}
	}
}
