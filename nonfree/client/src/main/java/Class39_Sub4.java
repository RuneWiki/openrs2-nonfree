import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public class Class39_Sub4 extends Class39 {

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	private int anInt9945 = -1;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
	private int anInt9953 = -1;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
	public final int anInt9946;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	public final int anInt9944;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!hk;IIIIZ[IIIZ)V")
	public Class39_Sub4(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9946 = arg4;
		this.anInt9944 = arg3;
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
		super.aClass16_Sub2_39.method3620(this);
		if (super.anInt9936 != 34037 && arg5 && arg7 == 0) {
			Static188.method3033(arg6, this.anInt9946, this.anInt9944, super.anInt9936, super.anInt9934, super.aClass16_Sub2_39.anInt4403);
			this.method8459(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9936, 0, super.anInt9934, this.anInt9944, this.anInt9946, 0, 32993, super.aClass16_Sub2_39.anInt4403, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method8459(false);
		}
		this.method8465(true);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!hk;IIII)V")
	public Class39_Sub4(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt9944 = arg3;
		this.anInt9946 = arg4;
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glTexImage2Dub(super.anInt9936, 0, super.anInt9934, arg3, arg4, 0, Static512.method7238(super.anInt9934), 5121, (byte[]) null, 0);
		this.method8465(true);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!hk;IIIIZ[FI)V")
	public Class39_Sub4(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt9946 = arg4;
		this.anInt9944 = arg3;
		super.aClass16_Sub2_39.method3620(this);
		if (arg5 && super.anInt9936 != 34037) {
			Static369.method1823(arg1, arg4, arg6, arg7, arg2, arg3);
			this.method8459(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9936, 0, super.anInt9934, this.anInt9944, this.anInt9946, 0, arg7, 5126, arg6, 0);
			this.method8459(false);
		}
		this.method8465(true);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!hk;IIIIZ[BIZ)V")
	public Class39_Sub4(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9944 = arg3;
		this.anInt9946 = arg4;
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
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9936 != 34037) {
			Static84.method8591(arg7, arg3, arg6, arg1, arg4, arg2);
			this.method8459(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9936, 0, super.anInt9934, this.anInt9944, this.anInt9946, 0, arg7, 5121, arg6, 0);
			this.method8459(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8465(true);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!hk;IIIII)V")
	public Class39_Sub4(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt9946 = arg5;
		this.anInt9944 = arg4;
		@Pc(29) int local29 = super.aClass16_Sub2_39.anInt4359 - arg3 - arg5;
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glCopyTexImage2D(super.anInt9936, 0, super.anInt9934, arg2, local29, arg4, arg5, 0);
		this.method8465(true);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII[BIIZI)V")
	public final void method8468(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(8) boolean arg3, @OriginalArg(9) int arg4) {
		if (arg3) {
			@Pc(18) int local18 = Static517.method7338(6406);
			@Pc(22) int local22 = arg1 * local18;
			@Pc(26) int local26 = arg1 * local18;
			@Pc(31) byte[] local31 = new byte[local22 * arg0];
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = local26 * (arg0 - local33 - 1);
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg2[local50++];
				}
			}
			arg2 = local31;
		}
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9936, 0, 0, 0, arg1, arg0, 6406, 5121, arg2, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	@Override
	public final void method8457() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt9945, this.anInt9953, super.anInt9936, 0, 0);
		this.anInt9945 = -1;
		this.anInt9953 = -1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZZ)V")
	public final void method8469(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9936 == 3553) {
			super.aClass16_Sub2_39.method3620(this);
			OpenGL.glTexParameteri(super.anInt9936, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9936, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V")
	public final void method8470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt9936, super.anInt9939, 0);
		this.anInt9953 = arg0;
		this.anInt9945 = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V")
	public final void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass16_Sub2_39.anInt4359 - arg2 - arg0;
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9936, 0, arg4, this.anInt9946 - arg0 - arg5, arg3, local12, arg1, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZIII[III)V")
	public final void method8473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg3 == 0) {
			arg3 = arg0;
		}
		@Pc(19) int[] local19 = new int[arg0 * arg5];
		for (@Pc(21) int local21 = 0; local21 < arg5; local21++) {
			@Pc(27) int local27 = local21 * arg0;
			@Pc(38) int local38 = arg3 * (arg5 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				local19[local27++] = arg4[local38++];
			}
		}
		super.aClass16_Sub2_39.method3620(this);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt9936, 0, arg1, this.anInt9946 - arg2 - arg5, arg0, arg5, 32993, super.aClass16_Sub2_39.anInt4403, local19, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
