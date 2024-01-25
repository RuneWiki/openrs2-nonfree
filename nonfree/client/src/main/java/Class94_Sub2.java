import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
	private int anInt3654 = -1;

	@OriginalMember(owner = "client!fba", name = "L", descriptor = "I")
	private int anInt3663 = -1;

	@OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
	public final int anInt3653;

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
	public final int anInt3659;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!dw;IIIIZ[BIZ)V")
	public Class94_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3653 = arg3;
		this.anInt3659 = arg4;
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
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt4672 != 34037) {
			Static614.method8393(arg2, arg4, arg7, arg6, arg1, arg3);
			this.method4005(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt4672, 0, super.anInt4680, this.anInt3653, this.anInt3659, 0, arg7, 5121, arg6, 0);
			this.method4005(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4012(true);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!dw;IIIII)V")
	public Class94_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt3659 = arg5;
		this.anInt3653 = arg4;
		@Pc(29) int local29 = super.aClass82_Sub1_25.anInt2450 - arg3 - arg5;
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glCopyTexImage2D(super.anInt4672, 0, super.anInt4680, arg2, local29, arg4, arg5, 0);
		this.method4012(true);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!dw;IIIIZ[FI)V")
	public Class94_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3653 = arg3;
		this.anInt3659 = arg4;
		super.aClass82_Sub1_25.method2029(this);
		if (arg5 && super.anInt4672 != 34037) {
			Static534.method7726(arg4, arg3, arg7, arg1, arg2, arg6);
			this.method4005(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt4672, 0, super.anInt4680, this.anInt3653, this.anInt3659, 0, arg7, 5126, arg6, 0);
			this.method4005(false);
		}
		this.method4012(true);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!dw;IIIIZ[IIIZ)V")
	public Class94_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3659 = arg4;
		this.anInt3653 = arg3;
		if (arg9) {
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
		super.aClass82_Sub1_25.method2029(this);
		if (super.anInt4672 != 34037 && arg5 && arg7 == 0) {
			Static507.method7363(super.aClass82_Sub1_25.anInt2488, super.anInt4672, this.anInt3653, super.anInt4680, this.anInt3659, arg6);
			this.method4005(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt4672, 0, super.anInt4680, this.anInt3653, this.anInt3659, 0, 32993, super.aClass82_Sub1_25.anInt2488, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method4005(false);
		}
		this.method4012(true);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!dw;IIII)V")
	public Class94_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt3653 = arg3;
		this.anInt3659 = arg4;
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glTexImage2Dub(super.anInt4672, 0, super.anInt4680, arg3, arg4, 0, Static512.method7421(super.anInt4680), 5121, (byte[]) null, 0);
		this.method4012(true);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZZ)V")
	public final void method3120(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt4672 == 3553) {
			super.aClass82_Sub1_25.method2029(this);
			OpenGL.glTexParameteri(super.anInt4672, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt4672, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIII)V")
	public final void method3122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass82_Sub1_25.anInt2450 - arg4 - arg2;
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glCopyTexSubImage2D(super.anInt4672, 0, arg3, this.anInt3659 - arg5 - arg4, arg1, local12, arg0, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	@Override
	public final void method4004() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3654, this.anInt3663, super.anInt4672, 0, 0);
		this.anInt3654 = -1;
		this.anInt3663 = -1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I[BIIZIIZII)V")
	public final void method3125(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static285.method6790(6406);
			@Pc(19) int local19 = local15 * arg1;
			@Pc(23) int local23 = arg1 * local15;
			@Pc(28) byte[] local28 = new byte[local19 * arg3];
			for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(47) int local47 = (arg3 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg0[local47++];
				}
			}
			arg0 = local28;
		}
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt4672, 0, 0, 0, arg1, arg3, 6406, 5121, arg0, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIII)V")
	public final void method3126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt4672, super.anInt4686, 0);
		this.anInt3654 = arg1;
		this.anInt3663 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIIIIIII[I)V")
	public final void method3127(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int[] arg5) {
		if (arg4 == 0) {
			arg4 = arg0;
		}
		@Pc(19) int[] local19 = new int[arg0 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(27) int local27 = local21 * arg0;
			@Pc(37) int local37 = (arg2 - local21 - 1) * arg4;
			for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
				local19[local27++] = arg5[local37++];
			}
		}
		super.aClass82_Sub1_25.method2029(this);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Di(super.anInt4672, 0, arg1, this.anInt3659 - arg3 - arg2, arg0, arg2, 32993, super.aClass82_Sub1_25.anInt2488, local19, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
