import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
	private int anInt5646 = -1;

	@OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
	private int anInt5640 = -1;

	@OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
	public final int anInt5645;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
	public final int anInt5638;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!pea;IIIIZ[BIZ)V")
	public Class35_Sub3(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5645 = arg3;
		this.anInt5638 = arg4;
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
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6267 != 34037) {
			Static398.method5864(arg6, arg2, arg4, arg1, arg7, arg3);
			this.method5327(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6267, 0, super.anInt6269, this.anInt5645, this.anInt5638, 0, arg7, 5121, arg6, 0);
			this.method5327(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5329(true);
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!pea;IIIIZ[IZ)V")
	public Class35_Sub3(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5638 = arg4;
		this.anInt5645 = arg3;
		if (arg7) {
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
		super.aClass121_Sub3_31.method5713(this);
		if (arg5 && super.anInt6267 != 34037) {
			Static426.method6224(this.anInt5645, super.anInt6269, super.anInt6267, super.aClass121_Sub3_31.anInt6819, this.anInt5638, arg6);
			this.method5327(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6267, 0, super.anInt6269, this.anInt5645, this.anInt5638, 0, 32993, super.aClass121_Sub3_31.anInt6819, arg6, 0);
			this.method5327(false);
		}
		this.method5329(true);
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!pea;IIIII)V")
	protected Class35_Sub3(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt5638 = arg5;
		this.anInt5645 = arg4;
		@Pc(28) int local28 = super.aClass121_Sub3_31.anInt6787 - arg5 - arg3;
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glCopyTexImage2D(super.anInt6267, 0, super.anInt6269, arg2, local28, arg4, arg5, 0);
		this.method5329(true);
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!pea;IIIIZ[FI)V")
	public Class35_Sub3(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5638 = arg4;
		this.anInt5645 = arg3;
		super.aClass121_Sub3_31.method5713(this);
		if (arg5 && super.anInt6267 != 34037) {
			Static332.method5086(arg4, arg3, arg2, arg6, arg7, arg1);
			this.method5327(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6267, 0, super.anInt6269, this.anInt5645, this.anInt5638, 0, arg7, 5126, arg6, 0);
			this.method5327(false);
		}
		this.method5329(true);
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!pea;IIII)V")
	public Class35_Sub3(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt5645 = arg3;
		this.anInt5638 = arg4;
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glTexImage2Dub(super.anInt6267, 0, super.anInt6269, arg3, arg4, 0, Static436.method6280(super.anInt6269), 5121, null, 0);
		this.method5329(true);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III[BIIIIZZ)V")
	public final void method4853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(9) boolean arg4) {
		if (arg4) {
			@Pc(15) int local15 = Static172.method2654(6406);
			@Pc(19) int local19 = arg1 * local15;
			@Pc(23) int local23 = local15 * arg1;
			@Pc(28) byte[] local28 = new byte[arg0 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(46) int local46 = (arg0 - local30 - 1) * local23;
				for (@Pc(48) int local48 = 0; local48 < local19; local48++) {
					local28[local36++] = arg2[local46++];
				}
			}
			arg2 = local28;
		}
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6267, 0, 0, 0, arg1, arg0, 6406, 5121, arg2, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIZ)V")
	public final void method4855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt6267, super.anInt6277, 0);
		this.anInt5646 = arg0;
		this.anInt5640 = arg1;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III[IIIZII)V")
	protected final void method4856(@OriginalArg(3) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		@Pc(20) int[] local20 = new int[arg2 * arg1];
		for (@Pc(22) int local22 = 0; local22 < arg1; local22++) {
			@Pc(28) int local28 = arg2 * local22;
			@Pc(40) int local40 = (arg1 - local22 - 1) * arg2;
			for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
				local20[local28++] = arg0[local40++];
			}
		}
		super.aClass121_Sub3_31.method5713(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt6267, 0, 0, 0, arg2, arg1, 32993, super.aClass121_Sub3_31.anInt6819, local20, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZZ)V")
	public final void method4857(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt6267 == 3553) {
			super.aClass121_Sub3_31.method5713(this);
			OpenGL.glTexParameteri(super.anInt6267, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6267, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIZIIII)V")
	public final void method4858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = super.aClass121_Sub3_31.anInt6787 - arg3 - arg4;
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6267, 0, arg2, this.anInt5638 - arg4 - arg0, arg1, local20, arg5, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
	@Override
	public final void method5323() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5640, this.anInt5646, super.anInt6267, 0, 0);
		this.anInt5640 = -1;
		this.anInt5646 = -1;
	}
}
