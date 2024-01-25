import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
	private int anInt9348 = -1;

	@OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
	private int anInt9359 = -1;

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
	public final int anInt9354;

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
	public final int anInt9355;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!nv;IIIII)V")
	public Class20_Sub4(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt9354 = arg4;
		this.anInt9355 = arg5;
		@Pc(30) int local30 = super.aClass16_Sub3_40.anInt7270 - arg5 - arg3;
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glCopyTexImage2D(super.anInt9337, 0, super.anInt9338, arg2, local30, arg4, arg5, 0);
		this.method7620(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!nv;IIII)V")
	public Class20_Sub4(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt9354 = arg3;
		this.anInt9355 = arg4;
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glTexImage2Dub(super.anInt9337, 0, super.anInt9338, arg3, arg4, 0, Static607.method6373(super.anInt9338), 5121, null, 0);
		this.method7620(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!nv;IIIIZ[BIZ)V")
	public Class20_Sub4(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9354 = arg3;
		this.anInt9355 = arg4;
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
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9337 != 34037) {
			Static393.method6280(arg2, arg4, arg1, arg3, arg6, arg7);
			this.method7616(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9337, 0, super.anInt9338, this.anInt9354, this.anInt9355, 0, arg7, 5121, arg6, 0);
			this.method7616(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7620(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!nv;IIIIZ[IIIZ)V")
	public Class20_Sub4(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt9355 = arg4;
		this.anInt9354 = arg3;
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
		super.aClass16_Sub3_40.method6020(this);
		if (super.anInt9337 != 34037 && arg5 && arg7 == 0) {
			Static503.method8089(this.anInt9355, super.anInt9338, this.anInt9354, super.anInt9337, super.aClass16_Sub3_40.anInt7376, arg6);
			this.method7616(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9337, 0, super.anInt9338, this.anInt9354, this.anInt9355, 0, 32993, super.aClass16_Sub3_40.anInt7376, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method7616(false);
		}
		this.method7620(true);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!nv;IIIIZ[FI)V")
	public Class20_Sub4(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9354 = arg3;
		this.anInt9355 = arg4;
		super.aClass16_Sub3_40.method6020(this);
		if (arg5 && super.anInt9337 != 34037) {
			Static4.method41(arg6, arg7, arg3, arg2, arg4, arg1);
			this.method7616(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9337, 0, super.anInt9338, this.anInt9354, this.anInt9355, 0, arg7, 5126, arg6, 0);
			this.method7616(false);
		}
		this.method7620(true);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII[BIZIII)V")
	public final void method7621(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(8) int arg4) {
		if (arg3) {
			@Pc(26) int local26 = Static18.method812(6406);
			@Pc(30) int local30 = local26 * arg0;
			@Pc(34) int local34 = arg0 * local26;
			@Pc(39) byte[] local39 = new byte[local30 * arg1];
			for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
				@Pc(47) int local47 = local41 * local30;
				@Pc(59) int local59 = (arg1 - local41 - 1) * local34;
				for (@Pc(61) int local61 = 0; local61 < local30; local61++) {
					local39[local47++] = arg2[local59++];
				}
			}
			arg2 = local39;
		}
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9337, 0, 0, 0, arg0, arg1, 6406, 5121, arg2, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIZI)V")
	public final void method7622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = super.aClass16_Sub3_40.anInt7270 - arg5 - arg1;
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9337, 0, arg2, this.anInt9355 - arg1 - arg4, arg0, local17, arg3, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZIIII[III)V")
	protected final void method7624(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int[] arg2) {
		@Pc(16) int[] local16 = new int[arg0 * arg1];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(24) int local24 = arg1 * local18;
			@Pc(36) int local36 = (arg0 - local18 - 1) * arg1;
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				local16[local24++] = arg2[local36++];
			}
		}
		super.aClass16_Sub3_40.method6020(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9337, 0, 0, 0, arg1, arg0, 32993, super.aClass16_Sub3_40.anInt7376, local16, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	@Override
	public final void method7611() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt9348, this.anInt9359, super.anInt9337, 0, 0);
		this.anInt9359 = -1;
		this.anInt9348 = -1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZZB)V")
	public final void method7626(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt9337 == 3553) {
			super.aClass16_Sub3_40.method6020(this);
			OpenGL.glTexParameteri(super.anInt9337, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9337, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BIII)V")
	public final void method7627(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9337, super.anInt9335, 0);
		this.anInt9348 = arg0;
		this.anInt9359 = arg1;
	}
}
