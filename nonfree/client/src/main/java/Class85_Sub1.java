import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!tp", name = "B", descriptor = "I")
	private int anInt3119 = -1;

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
	private int anInt3115 = -1;

	@OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
	public final int anInt3117;

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "I")
	public final int anInt3121;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!qo;IIII)V")
	public Class85_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt3117 = arg3;
		this.anInt3121 = arg4;
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glTexImage2Dub(super.anInt10892, 0, super.anInt10899, arg3, arg4, 0, Static206.method4083(super.anInt10899), 5121, null, 0);
		this.method9102(true);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!qo;IIIIZ[FI)V")
	public Class85_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3117 = arg3;
		this.anInt3121 = arg4;
		super.aClass20_Sub3_41.method7358(this);
		if (arg5 && super.anInt10892 != 34037) {
			Static487.method7982(arg3, arg7, arg1, arg6, arg4, arg2);
			this.method9100(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt10892, 0, super.anInt10899, this.anInt3117, this.anInt3121, 0, arg7, 5126, arg6, 0);
			this.method9100(false);
		}
		this.method9102(true);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!qo;IIIIZ[IIIZ)V")
	public Class85_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3117 = arg3;
		this.anInt3121 = arg4;
		if (arg9) {
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
		super.aClass20_Sub3_41.method7358(this);
		if (super.anInt10892 != 34037 && arg5 && arg7 == 0) {
			Static131.method3025(super.anInt10892, super.anInt10899, this.anInt3121, super.aClass20_Sub3_41.anInt8801, this.anInt3117, arg6);
			this.method9100(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt10892, 0, super.anInt10899, this.anInt3117, this.anInt3121, 0, 32993, super.aClass20_Sub3_41.anInt8801, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method9100(false);
		}
		this.method9102(true);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!qo;IIIIZ[BIZ)V")
	public Class85_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3117 = arg3;
		this.anInt3121 = arg4;
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
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt10892 != 34037) {
			Static310.method5474(arg4, arg3, arg6, arg7, arg1, arg2);
			this.method9100(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt10892, 0, super.anInt10899, this.anInt3117, this.anInt3121, 0, arg7, 5121, arg6, 0);
			this.method9100(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method9102(true);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!qo;IIIII)V")
	public Class85_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt3117 = arg4;
		this.anInt3121 = arg5;
		@Pc(30) int local30 = super.aClass20_Sub3_41.anInt8691 - arg3 - arg5;
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glCopyTexImage2D(super.anInt10892, 0, super.anInt10899, arg2, local30, arg4, arg5, 0);
		this.method9102(true);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIII)V")
	public final void method2891(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt10892, super.anInt10900, 0);
		this.anInt3119 = arg0;
		this.anInt3115 = arg1;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZII[IIBIII)V")
	protected final void method2892(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(16) int[] local16 = new int[arg2 * arg0];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(24) int local24 = arg2 * local18;
			@Pc(34) int local34 = (arg0 - local18 - 1) * arg2;
			for (@Pc(36) int local36 = 0; local36 < arg2; local36++) {
				local16[local24++] = arg1[local34++];
			}
		}
		super.aClass20_Sub3_41.method7358(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt10892, 0, 0, 0, arg2, arg0, 32993, super.aClass20_Sub3_41.anInt8801, local16, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZZI)V")
	public final void method2893(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt10892 == 3553) {
			super.aClass20_Sub3_41.method7358(this);
			OpenGL.glTexParameteri(super.anInt10892, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt10892, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIBI)V")
	public final void method2895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass20_Sub3_41.anInt8691 - arg2 - arg1;
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glCopyTexSubImage2D(super.anInt10892, 0, arg0, this.anInt3121 - arg1 - arg3, arg4, local12, arg5, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	@Override
	public final void method9094() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3119, this.anInt3115, super.anInt10892, 0, 0);
		this.anInt3115 = -1;
		this.anInt3119 = -1;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIZIIII[BI)V")
	public final void method2898(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg1) {
			@Pc(15) int local15 = Static452.method7106(6406);
			@Pc(19) int local19 = local15 * arg0;
			@Pc(23) int local23 = arg0 * local15;
			@Pc(28) byte[] local28 = new byte[arg2 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg2; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(46) int local46 = (arg2 - local30 - 1) * local23;
				for (@Pc(48) int local48 = 0; local48 < local19; local48++) {
					local28[local36++] = arg4[local46++];
				}
			}
			arg4 = local28;
		}
		super.aClass20_Sub3_41.method7358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10892, 0, 0, 0, arg0, arg2, 6406, 5121, arg4, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
