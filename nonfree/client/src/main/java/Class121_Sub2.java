import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public class Class121_Sub2 extends Class121 {

	@OriginalMember(owner = "client!hga", name = "D", descriptor = "I")
	private int anInt6649 = -1;

	@OriginalMember(owner = "client!hga", name = "M", descriptor = "I")
	private int anInt6658 = -1;

	@OriginalMember(owner = "client!hga", name = "I", descriptor = "I")
	public final int anInt6654;

	@OriginalMember(owner = "client!hga", name = "K", descriptor = "I")
	public final int anInt6656;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!eq;IIIIZ[BIZ)V")
	public Class121_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6654 = arg3;
		this.anInt6656 = arg4;
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
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8871 != 34037) {
			Static389.method6144(arg4, arg1, arg3, arg2, arg6, arg7);
			this.method7329(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8871, 0, super.anInt8883, this.anInt6654, this.anInt6656, 0, arg7, 5121, arg6, 0);
			this.method7329(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7326(true);
	}

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!eq;IIIII)V")
	public Class121_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt6654 = arg4;
		this.anInt6656 = arg5;
		@Pc(29) int local29 = super.aClass33_Sub3_36.anInt3352 - arg5 - arg3;
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glCopyTexImage2D(super.anInt8871, 0, super.anInt8883, arg2, local29, arg4, arg5, 0);
		this.method7326(true);
	}

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!eq;IIIIZ[FI)V")
	public Class121_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6654 = arg3;
		this.anInt6656 = arg4;
		super.aClass33_Sub3_36.method3012(this);
		if (arg5 && super.anInt8871 != 34037) {
			Static300.method5153(arg4, arg7, arg6, arg1, arg3, arg2);
			this.method7329(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8871, 0, super.anInt8883, this.anInt6654, this.anInt6656, 0, arg7, 5126, arg6, 0);
			this.method7329(false);
		}
		this.method7326(true);
	}

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!eq;IIII)V")
	public Class121_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt6654 = arg3;
		this.anInt6656 = arg4;
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glTexImage2Dub(super.anInt8871, 0, super.anInt8883, arg3, arg4, 0, Static78.method1882(super.anInt8883), 5121, null, 0);
		this.method7326(true);
	}

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!eq;IIIIZ[IIIZ)V")
	public Class121_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt6656 = arg4;
		this.anInt6654 = arg3;
		if (arg9) {
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
		super.aClass33_Sub3_36.method3012(this);
		if (super.anInt8871 != 34037 && arg5 && arg7 == 0) {
			Static571.method7997(super.anInt8883, arg6, super.aClass33_Sub3_36.anInt3439, super.anInt8871, this.anInt6654, this.anInt6656);
			this.method7329(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt8871, 0, super.anInt8883, this.anInt6654, this.anInt6656, 0, 32993, super.aClass33_Sub3_36.anInt3439, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method7329(false);
		}
		this.method7326(true);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIII)V")
	public final void method5558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt8871, super.anInt8879, 0);
		this.anInt6649 = arg1;
		this.anInt6658 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II[IIIZIII)V")
	public final void method5559(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg0 == 0) {
			arg0 = arg4;
		}
		@Pc(16) int[] local16 = new int[arg4 * arg3];
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(24) int local24 = arg4 * local18;
			@Pc(34) int local34 = arg0 * (arg3 - local18 - 1);
			for (@Pc(36) int local36 = 0; local36 < arg4; local36++) {
				local16[local24++] = arg1[local34++];
			}
		}
		super.aClass33_Sub3_36.method3012(this);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt8871, 0, arg2, this.anInt6656 - arg5 - arg3, arg4, arg3, 32993, super.aClass33_Sub3_36.anInt3439, local16, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7320() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6649, this.anInt6658, super.anInt8871, 0, 0);
		this.anInt6649 = -1;
		this.anInt6658 = -1;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIII)V")
	public final void method5562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = super.aClass33_Sub3_36.anInt3352 - arg0 - arg3;
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8871, 0, arg2, this.anInt6656 - arg0 - arg1, arg5, local11, arg4, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIZ[BIIIIII)V")
	public final void method5566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(6) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static393.method2874(6406);
			@Pc(19) int local19 = local15 * arg0;
			@Pc(23) int local23 = local15 * arg0;
			@Pc(28) byte[] local28 = new byte[arg1 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(47) int local47 = (arg1 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg3[local47++];
				}
			}
			arg3 = local28;
		}
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8871, 0, 0, 0, arg0, arg1, 6406, 5121, arg3, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZZ)V")
	public final void method5567(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt8871 == 3553) {
			super.aClass33_Sub3_36.method3012(this);
			OpenGL.glTexParameteri(super.anInt8871, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8871, 10243, arg1 ? 10497 : 33071);
		}
	}
}
