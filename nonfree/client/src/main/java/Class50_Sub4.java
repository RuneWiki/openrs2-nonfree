import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public class Class50_Sub4 extends Class50 {

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
	private int anInt10681 = -1;

	@OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
	private int anInt10689 = -1;

	@OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
	public final int anInt10687;

	@OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
	public final int anInt10688;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!lea;IIIIZ[FI)V")
	public Class50_Sub4(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt10687 = arg3;
		this.anInt10688 = arg4;
		super.aClass101_Sub2_41.method5690(this);
		if (arg5 && super.anInt10677 != 34037) {
			Static144.method2524(arg1, arg2, arg6, arg3, arg7, arg4);
			this.method9139(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt10677, 0, super.anInt10669, this.anInt10687, this.anInt10688, 0, arg7, 5126, arg6, 0);
			this.method9139(false);
		}
		this.method9134(true);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!lea;IIIII)V")
	public Class50_Sub4(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt10687 = arg4;
		this.anInt10688 = arg5;
		@Pc(28) int local28 = super.aClass101_Sub2_41.anInt6211 - arg5 - arg3;
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glCopyTexImage2D(super.anInt10677, 0, super.anInt10669, arg2, local28, arg4, arg5, 0);
		this.method9134(true);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!lea;IIIIZ[BIZ)V")
	public Class50_Sub4(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt10688 = arg4;
		this.anInt10687 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt10677 != 34037) {
			Static210.method3979(arg3, arg7, arg2, arg6, arg4, arg1);
			this.method9139(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt10677, 0, super.anInt10669, this.anInt10687, this.anInt10688, 0, arg7, 5121, arg6, 0);
			this.method9139(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method9134(true);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!lea;IIII)V")
	public Class50_Sub4(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt10687 = arg3;
		this.anInt10688 = arg4;
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glTexImage2Dub(super.anInt10677, 0, super.anInt10669, arg3, arg4, 0, Static402.method7538(super.anInt10669), 5121, (byte[]) null, 0);
		this.method9134(true);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!lea;IIIIZ[IIIZ)V")
	public Class50_Sub4(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt10688 = arg4;
		this.anInt10687 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass101_Sub2_41.method5690(this);
		if (super.anInt10677 != 34037 && arg5 && arg7 == 0) {
			Static608.method9153(super.anInt10677, this.anInt10687, this.anInt10688, super.aClass101_Sub2_41.anInt6346, super.anInt10669, arg6);
			this.method9139(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt10677, 0, super.anInt10669, this.anInt10687, this.anInt10688, 0, 32993, super.aClass101_Sub2_41.anInt6346, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method9139(false);
		}
		this.method9134(true);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIIIIZIIZ)V")
	public final void method9146(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			arg2 = arg1;
		}
		@Pc(19) int[] local19 = new int[arg5 * arg1];
		for (@Pc(21) int local21 = 0; local21 < arg5; local21++) {
			@Pc(27) int local27 = local21 * arg1;
			@Pc(38) int local38 = (arg5 - local21 - 1) * arg2;
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				local19[local27++] = arg0[local38++];
			}
		}
		super.aClass101_Sub2_41.method5690(this);
		if (arg1 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt10677, 0, arg4, this.anInt10688 - arg5 - arg3, arg1, arg5, 32993, super.aClass101_Sub2_41.anInt6346, local19, 0);
		if (arg2 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	@Override
	public final void method9133() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt10681, this.anInt10689, super.anInt10677, 0, 0);
		this.anInt10689 = -1;
		this.anInt10681 = -1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIZII)V")
	public final void method9149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass101_Sub2_41.anInt6211 - arg1 - arg4;
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glCopyTexSubImage2D(super.anInt10677, 0, arg5, this.anInt10688 - arg4 - arg3, arg2, local12, arg0, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIZI[BIIII)V")
	public final void method9150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static36.method624(6406);
			@Pc(19) int local19 = local15 * arg4;
			@Pc(23) int local23 = local15 * arg4;
			@Pc(28) byte[] local28 = new byte[arg0 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(46) int local46 = local23 * (arg0 - local30 - 1);
				for (@Pc(48) int local48 = 0; local48 < local19; local48++) {
					local28[local36++] = arg3[local46++];
				}
			}
			arg3 = local28;
		}
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10677, 0, 0, 0, arg4, arg0, 6406, 5121, arg3, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)V")
	public final void method9151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt10677, super.anInt10666, 0);
		this.anInt10689 = arg1;
		this.anInt10681 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZZZ)V")
	public final void method9152(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt10677 == 3553) {
			super.aClass101_Sub2_41.method5690(this);
			OpenGL.glTexParameteri(super.anInt10677, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt10677, 10243, arg1 ? 10497 : 33071);
		}
	}
}
