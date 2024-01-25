import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
	private int anInt3102 = -1;

	@OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
	private int anInt3106 = -1;

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
	public final int anInt3103;

	@OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
	public final int anInt3107;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!ffa;IIIII)V")
	public Class32_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt3103 = arg4;
		this.anInt3107 = arg5;
		@Pc(30) int local30 = super.aClass57_Sub2_36.anInt2598 - arg5 - arg3;
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glCopyTexImage2D(super.anInt9813, 0, super.anInt9805, arg2, local30, arg4, arg5, 0);
		this.method8430(true);
	}

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!ffa;IIII)V")
	public Class32_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt3103 = arg3;
		this.anInt3107 = arg4;
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glTexImage2Dub(super.anInt9813, 0, super.anInt9805, arg3, arg4, 0, Static640.method8945(super.anInt9805), 5121, (byte[]) null, 0);
		this.method8430(true);
	}

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!ffa;IIIIZ[FI)V")
	public Class32_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3103 = arg3;
		this.anInt3107 = arg4;
		super.aClass57_Sub2_36.method2362(this);
		if (arg5 && super.anInt9813 != 34037) {
			Static604.method8663(arg1, arg4, arg3, arg7, arg6, arg2);
			this.method8436(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9813, 0, super.anInt9805, this.anInt3103, this.anInt3107, 0, arg7, 5126, arg6, 0);
			this.method8436(false);
		}
		this.method8430(true);
	}

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!ffa;IIIIZ[BIZ)V")
	public Class32_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3103 = arg3;
		this.anInt3107 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9813 != 34037) {
			Static21.method315(arg7, arg2, arg3, arg1, arg4, arg6);
			this.method8436(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9813, 0, super.anInt9805, this.anInt3103, this.anInt3107, 0, arg7, 5121, arg6, 0);
			this.method8436(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8430(true);
	}

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!ffa;IIIIZ[IIIZ)V")
	public Class32_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3103 = arg3;
		this.anInt3107 = arg4;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass57_Sub2_36.method2362(this);
		if (super.anInt9813 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static341.method5175(super.anInt9805, this.anInt3107, super.aClass57_Sub2_36.anInt2760, this.anInt3103, super.anInt9813, arg6);
			this.method8436(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9813, 0, super.anInt9805, this.anInt3103, this.anInt3107, 0, 32993, super.aClass57_Sub2_36.anInt2760, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method8436(false);
		}
		this.method8430(true);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	@Override
	public final void method8965() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3102, this.anInt3106, super.anInt9813, 0, 0);
		this.anInt3106 = -1;
		this.anInt3102 = -1;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIBIII)V")
	public final void method2719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass57_Sub2_36.anInt2598 - arg3 - arg0;
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9813, 0, arg1, this.anInt3107 - arg4 - arg3, arg5, local13, arg2, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIII)V")
	public final void method2720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt9813, super.anInt9804, 0);
		this.anInt3102 = arg1;
		this.anInt3106 = arg0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZBZ)V")
	public final void method2721(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9813 == 3553) {
			super.aClass57_Sub2_36.method2362(this);
			OpenGL.glTexParameteri(super.anInt9813, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9813, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III[IIIZIZ)V")
	public final void method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 == 0) {
			arg5 = arg1;
		}
		@Pc(16) int[] local16 = new int[arg1 * arg0];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(24) int local24 = local18 * arg1;
			@Pc(35) int local35 = (arg0 - local18 - 1) * arg5;
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				local16[local24++] = arg3[local35++];
			}
		}
		super.aClass57_Sub2_36.method2362(this);
		if (arg5 != arg1) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt9813, 0, arg2, this.anInt3107 - arg4 - arg0, arg1, arg0, 32993, super.aClass57_Sub2_36.anInt2760, local16, 0);
		if (arg1 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([BIZIIIIIII)V")
	public final void method2724(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(8) int arg4) {
		if (arg2) {
			@Pc(35) int local35 = Static331.method5045(6406);
			@Pc(39) int local39 = local35 * arg4;
			@Pc(43) int local43 = local35 * arg4;
			@Pc(48) byte[] local48 = new byte[local39 * arg3];
			for (@Pc(50) int local50 = 0; local50 < arg3; local50++) {
				@Pc(56) int local56 = local50 * local39;
				@Pc(67) int local67 = local43 * (arg3 - local50 - 1);
				for (@Pc(69) int local69 = 0; local69 < local39; local69++) {
					local48[local56++] = arg0[local67++];
				}
			}
			arg0 = local48;
		}
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9813, 0, 0, 0, arg4, arg3, 6406, 5121, arg0, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
