import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!kp", name = "F", descriptor = "[I")
	public static final int[] anIntArray276 = new int[32];

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
	private int anInt4216 = -1;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
	private int anInt4215 = -1;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
	public final int anInt4212;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
	public final int anInt4217;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray276[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ap;IIIIZ[IZ)V")
	public Class132_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4212 = arg4;
		this.anInt4217 = arg3;
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
		super.aClass9_Sub2_24.method814(this);
		if (arg5 && super.anInt6650 != 34037) {
			Static402.method8054(super.anInt6656, arg6, this.anInt4212, this.anInt4217, super.aClass9_Sub2_24.anInt839, super.anInt6650);
			this.method5613(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6650, 0, super.anInt6656, this.anInt4217, this.anInt4212, 0, 32993, super.aClass9_Sub2_24.anInt839, arg6, 0);
			this.method5613(false);
		}
		this.method5614(true);
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ap;IIIII)V")
	protected Class132_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt4212 = arg5;
		this.anInt4217 = arg4;
		@Pc(29) int local29 = super.aClass9_Sub2_24.anInt799 - arg5 - arg3;
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glCopyTexImage2D(super.anInt6650, 0, super.anInt6656, arg2, local29, arg4, arg5, 0);
		this.method5614(true);
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ap;IIII)V")
	public Class132_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt4212 = arg4;
		this.anInt4217 = arg3;
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glTexImage2Dub(super.anInt6650, 0, super.anInt6656, arg3, arg4, 0, Static12.method634(super.anInt6656), 5121, null, 0);
		this.method5614(true);
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ap;IIIIZ[FI)V")
	public Class132_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4217 = arg3;
		this.anInt4212 = arg4;
		super.aClass9_Sub2_24.method814(this);
		if (arg5 && super.anInt6650 != 34037) {
			Static511.method7567(arg2, arg6, arg4, arg1, arg3, arg7);
			this.method5613(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6650, 0, super.anInt6656, this.anInt4217, this.anInt4212, 0, arg7, 5126, arg6, 0);
			this.method5613(false);
		}
		this.method5614(true);
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ap;IIIIZ[BIZ)V")
	public Class132_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4212 = arg4;
		this.anInt4217 = arg3;
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
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6650 != 34037) {
			Static297.method4045(arg3, arg1, arg7, arg4, arg6, arg2);
			this.method5613(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6650, 0, super.anInt6656, this.anInt4217, this.anInt4212, 0, arg7, 5121, arg6, 0);
			this.method5613(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5614(true);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZZI)V")
	public final void method3694(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt6650 == 3553) {
			super.aClass9_Sub2_24.method814(this);
			OpenGL.glTexParameteri(super.anInt6650, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6650, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)V")
	public final void method3695(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt6650, super.anInt6652, 0);
		this.anInt4215 = arg0;
		this.anInt4216 = arg1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIZ)V")
	public final void method3697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16 = super.aClass9_Sub2_24.anInt799 - arg2 - arg0;
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6650, 0, arg1, this.anInt4212 - arg3 - arg2, arg5, local16, arg4, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([BIIIIIIZII)V")
	public final void method3698(@OriginalArg(0) byte[] arg0, @OriginalArg(6) int arg1, @OriginalArg(7) boolean arg2, @OriginalArg(8) int arg3, @OriginalArg(9) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static498.method7458(6406);
			@Pc(19) int local19 = local15 * arg3;
			@Pc(23) int local23 = arg3 * local15;
			@Pc(28) byte[] local28 = new byte[local19 * arg1];
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(48) int local48 = local23 * (arg1 - local30 - 1);
				for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
					local28[local36++] = arg0[local48++];
				}
			}
			arg0 = local28;
		}
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6650, 0, 0, 0, arg3, arg1, 6406, 5121, arg0, 0);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[IIIIIZII)V")
	protected final void method3699(@OriginalArg(1) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(8) int arg2) {
		@Pc(16) int[] local16 = new int[arg2 * arg1];
		for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
			@Pc(24) int local24 = arg1 * local18;
			@Pc(35) int local35 = arg1 * (arg2 - local18 - 1);
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				local16[local24++] = arg0[local35++];
			}
		}
		super.aClass9_Sub2_24.method814(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt6650, 0, 0, 0, arg1, arg2, 32993, super.aClass9_Sub2_24.anInt839, local16, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	@Override
	public final void method6643() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4215, this.anInt4216, super.anInt6650, 0, 0);
		this.anInt4216 = -1;
		this.anInt4215 = -1;
	}
}
