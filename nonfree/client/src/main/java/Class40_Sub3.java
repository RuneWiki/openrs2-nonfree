import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public class Class40_Sub3 extends Class40 {

	@OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
	private int anInt3380 = -1;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
	private int anInt3381 = -1;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	public final int anInt3370;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
	public final int anInt3372;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!bl;IIIIZ[BIZ)V")
	public Class40_Sub3(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3370 = arg4;
		this.anInt3372 = arg3;
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
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6158 != 34037) {
			Static149.method2458(arg2, arg3, arg7, arg6, arg4, arg1);
			this.method5153(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6158, 0, super.anInt6159, this.anInt3372, this.anInt3370, 0, arg7, 5121, arg6, 0);
			this.method5153(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5148(true);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!bl;IIIII)V")
	protected Class40_Sub3(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt3370 = arg5;
		this.anInt3372 = arg4;
		@Pc(30) int local30 = super.aClass28_Sub1_35.anInt566 - arg3 - arg5;
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glCopyTexImage2D(super.anInt6158, 0, super.anInt6159, arg2, local30, arg4, arg5, 0);
		this.method5148(true);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!bl;IIIIZ[FI)V")
	public Class40_Sub3(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3370 = arg4;
		this.anInt3372 = arg3;
		super.aClass28_Sub1_35.method654(this);
		if (arg5 && super.anInt6158 != 34037) {
			Static124.method3211(arg1, arg7, arg2, arg6, arg3, arg4);
			this.method5153(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6158, 0, super.anInt6159, this.anInt3372, this.anInt3370, 0, arg7, 5126, arg6, 0);
			this.method5153(false);
		}
		this.method5148(true);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!bl;IIII)V")
	public Class40_Sub3(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt3372 = arg3;
		this.anInt3370 = arg4;
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glTexImage2Dub(super.anInt6158, 0, super.anInt6159, arg3, arg4, 0, Static234.method3692(super.anInt6159), 5121, null, 0);
		this.method5148(true);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!bl;IIIIZ[IZ)V")
	public Class40_Sub3(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3372 = arg3;
		this.anInt3370 = arg4;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass28_Sub1_35.method654(this);
		if (arg5 && super.anInt6158 != 34037) {
			Static131.method2146(super.anInt6159, super.anInt6158, this.anInt3372, super.aClass28_Sub1_35.anInt774, this.anInt3370, arg6);
			this.method5153(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6158, 0, super.anInt6159, this.anInt3372, this.anInt3370, 0, 32993, super.aClass28_Sub1_35.anInt774, arg6, 0);
			this.method5153(false);
		}
		this.method5148(true);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIZII[BIIZI)V")
	public final void method3019(@OriginalArg(4) int arg0, @OriginalArg(5) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) boolean arg4) {
		if (arg4) {
			@Pc(18) int local18 = Static7.method121(6406);
			@Pc(22) int local22 = arg2 * local18;
			@Pc(26) int local26 = arg2 * local18;
			@Pc(31) byte[] local31 = new byte[arg3 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg3; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(49) int local49 = (arg3 - local33 - 1) * local26;
				for (@Pc(51) int local51 = 0; local51 < local22; local51++) {
					local31[local39++] = arg1[local49++];
				}
			}
			arg1 = local31;
		}
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6158, 0, 0, 0, arg2, arg3, 6406, 5121, arg1, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
	public final void method3020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt6158, super.anInt6163, 0);
		this.anInt3381 = arg1;
		this.anInt3380 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZI)V")
	public final void method3021(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt6158 == 3553) {
			super.aClass28_Sub1_35.method654(this);
			OpenGL.glTexParameteri(super.anInt6158, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6158, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIZ[IBIII)V")
	protected final void method3024(@OriginalArg(1) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(7) int arg2) {
		@Pc(19) int[] local19 = new int[arg2 * arg0];
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(27) int local27 = local21 * arg0;
			@Pc(39) int local39 = (arg2 - local21 - 1) * arg0;
			for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
				local19[local27++] = arg1[local39++];
			}
		}
		super.aClass28_Sub1_35.method654(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt6158, 0, 0, 0, arg0, arg2, 32993, super.aClass28_Sub1_35.anInt774, local19, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V")
	public final void method3026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(12) int local12 = super.aClass28_Sub1_35.anInt566 - arg0;
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6158, 0, arg1, this.anInt3370 - arg0 - arg3, 0, local12, arg2, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	@Override
	public final void method5143() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3381, this.anInt3380, super.anInt6158, 0, 0);
		this.anInt3380 = -1;
		this.anInt3381 = -1;
	}
}
