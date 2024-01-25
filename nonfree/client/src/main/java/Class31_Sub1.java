import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
	private int anInt1869 = -1;

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
	private int anInt1874 = -1;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
	public final int anInt1864;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public final int anInt1865;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!tt;IIIII)V")
	protected Class31_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt1864 = arg4;
		this.anInt1865 = arg5;
		@Pc(29) int local29 = super.aClass200_Sub2_34.anInt6597 - arg3 - arg5;
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glCopyTexImage2D(super.anInt5787, 0, super.anInt5789, arg2, local29, arg4, arg5, 0);
		this.method4591(true);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!tt;IIIIZ[FI)V")
	public Class31_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1865 = arg4;
		this.anInt1864 = arg3;
		super.aClass200_Sub2_34.method5312(this);
		if (arg5 && super.anInt5787 != 34037) {
			Static336.method4357(arg7, arg6, arg4, arg2, arg3, arg1);
			this.method4587(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5787, 0, super.anInt5789, this.anInt1864, this.anInt1865, 0, arg7, 5126, arg6, 0);
			this.method4587(false);
		}
		this.method4591(true);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!tt;IIII)V")
	public Class31_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt1865 = arg4;
		this.anInt1864 = arg3;
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glTexImage2Dub(super.anInt5787, 0, super.anInt5789, arg3, arg4, 0, Static314.method3855(super.anInt5789), 5121, null, 0);
		this.method4591(true);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!tt;IIIIZ[BIZ)V")
	public Class31_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1865 = arg4;
		this.anInt1864 = arg3;
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
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5787 != 34037) {
			Static359.method4640(arg6, arg4, arg3, arg7, arg2, arg1);
			this.method4587(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5787, 0, super.anInt5789, this.anInt1864, this.anInt1865, 0, arg7, 5121, arg6, 0);
			this.method4587(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4591(true);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!tt;IIIIZ[IZ)V")
	public Class31_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1864 = arg3;
		this.anInt1865 = arg4;
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
		super.aClass200_Sub2_34.method5312(this);
		if (arg5 && super.anInt5787 != 34037) {
			Static376.method5009(arg6, this.anInt1865, super.aClass200_Sub2_34.anInt6760, this.anInt1864, super.anInt5787, super.anInt5789);
			this.method4587(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5787, 0, super.anInt5789, this.anInt1864, this.anInt1865, 0, 32993, super.aClass200_Sub2_34.anInt6760, arg6, 0);
			this.method4587(false);
		}
		this.method4591(true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	@Override
	public final void method4581() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1874, this.anInt1869, super.anInt5787, 0, 0);
		this.anInt1874 = -1;
		this.anInt1869 = -1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)V")
	public final void method1519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt5787, super.anInt5784, 0);
		this.anInt1874 = arg1;
		this.anInt1869 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZBZ)V")
	public final void method1520(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5787 == 3553) {
			super.aClass200_Sub2_34.method5312(this);
			OpenGL.glTexParameteri(super.anInt5787, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5787, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
	public final void method1523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass200_Sub2_34.anInt6597 - arg5;
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5787, 0, arg0, this.anInt1865 - arg3 - arg5, 0, local12, arg1, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIB[IIIZ)V")
	protected final void method1524(@OriginalArg(3) int arg0, @OriginalArg(5) int[] arg1, @OriginalArg(7) int arg2) {
		@Pc(20) int[] local20 = new int[arg2 * arg0];
		for (@Pc(22) int local22 = 0; local22 < arg2; local22++) {
			@Pc(28) int local28 = arg0 * local22;
			@Pc(39) int local39 = (arg2 - local22 - 1) * arg0;
			for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
				local20[local28++] = arg1[local39++];
			}
		}
		super.aClass200_Sub2_34.method5312(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt5787, 0, 0, 0, arg0, arg2, 32993, super.aClass200_Sub2_34.anInt6760, local20, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII[BIIZI)V")
	public final void method1525(@OriginalArg(2) int arg0, @OriginalArg(5) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) boolean arg4) {
		if (arg4) {
			@Pc(22) int local22 = Static331.method4086(6406);
			@Pc(26) int local26 = arg3 * local22;
			@Pc(30) int local30 = arg3 * local22;
			@Pc(35) byte[] local35 = new byte[local26 * arg0];
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				@Pc(43) int local43 = local37 * local26;
				@Pc(54) int local54 = local30 * (arg0 - local37 - 1);
				for (@Pc(56) int local56 = 0; local56 < local26; local56++) {
					local35[local43++] = arg1[local54++];
				}
			}
			arg1 = local35;
		}
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5787, 0, 0, 0, arg3, arg0, 6406, 5121, arg1, 0);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
