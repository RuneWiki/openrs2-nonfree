import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	private int anInt7333 = -1;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
	private int anInt7339 = -1;

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
	public final int anInt7338;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
	public final int anInt7340;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!te;IIIIZ[BIZ)V")
	public Class20_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7338 = arg3;
		this.anInt7340 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(41) int local41 = arg3 * (arg4 - local28 - 1);
				for (@Pc(43) int local43 = 0; local43 < arg3; local43++) {
					local26[local33++] = arg6[local41++];
				}
			}
			arg6 = local26;
		}
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7329 != 34037) {
			Static159.method3142(arg6, arg7, arg4, arg3, arg2, arg1);
			this.method6244(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7329, 0, super.anInt7318, this.anInt7338, this.anInt7340, 0, arg7, 5121, arg6, 0);
			this.method6244(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!te;IIIII)V")
	protected Class20_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt7340 = arg5;
		this.anInt7338 = arg4;
		@Pc(28) int local28 = super.aClass9_Sub3_36.anInt7712 - arg3 - arg5;
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glCopyTexImage2D(super.anInt7329, 0, super.anInt7318, arg2, local28, arg4, arg5, 0);
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!te;IIII)V")
	public Class20_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt7340 = arg4;
		this.anInt7338 = arg3;
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glTexImage2Dub(super.anInt7329, 0, super.anInt7318, arg3, arg4, 0, Static210.method3821(super.anInt7318), 5121, null, 0);
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!te;IIIIZ[IZ)V")
	public Class20_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7338 = arg3;
		this.anInt7340 = arg4;
		if (arg7) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(41) int local41 = (arg4 - local28 - 1) * arg3;
				for (@Pc(43) int local43 = 0; local43 < arg3; local43++) {
					local26[local33++] = arg6[local41++];
				}
			}
			arg6 = local26;
		}
		super.aClass9_Sub3_36.method6701(this);
		if (arg5 && super.anInt7329 != 34037) {
			Static223.method3942(this.anInt7338, super.aClass9_Sub3_36.anInt7913, super.anInt7318, this.anInt7340, arg6, super.anInt7329);
			this.method6244(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7329, 0, super.anInt7318, this.anInt7338, this.anInt7340, 0, 32993, super.aClass9_Sub3_36.anInt7913, arg6, 0);
			this.method6244(false);
		}
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!te;IIIIZ[FI)V")
	public Class20_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7338 = arg3;
		this.anInt7340 = arg4;
		super.aClass9_Sub3_36.method6701(this);
		if (arg5 && super.anInt7329 != 34037) {
			Static265.method4400(arg1, arg7, arg3, arg2, arg6, arg4);
			this.method6244(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7329, 0, super.anInt7318, this.anInt7338, this.anInt7340, 0, arg7, 5126, arg6, 0);
			this.method6244(false);
		}
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IZIIIIIII)V")
	protected final void method6248(@OriginalArg(0) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(8) int arg2) {
		@Pc(20) int[] local20 = new int[arg1 * arg2];
		for (@Pc(22) int local22 = 0; local22 < arg1; local22++) {
			@Pc(27) int local27 = arg2 * local22;
			@Pc(38) int local38 = (arg1 - local22 - 1) * arg2;
			for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
				local20[local27++] = arg0[local38++];
			}
		}
		super.aClass9_Sub3_36.method6701(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt7329, 0, 0, 0, arg2, arg1, 32993, super.aClass9_Sub3_36.anInt7913, local20, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V")
	public final void method6249(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt7329, super.anInt7321, 0);
		this.anInt7339 = arg1;
		this.anInt7333 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	@Override
	public final void method6233() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7339, this.anInt7333, super.anInt7329, 0, 0);
		this.anInt7333 = -1;
		this.anInt7339 = -1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIZII[BI)V")
	public final void method6250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(8) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static72.method1940(6406);
			@Pc(19) int local19 = arg1 * local15;
			@Pc(23) int local23 = local15 * arg1;
			@Pc(28) byte[] local28 = new byte[arg0 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(47) int local47 = local23 * (arg0 - local30 - 1);
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg3[local47++];
				}
			}
			arg3 = local28;
		}
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7329, 0, 0, 0, arg1, arg0, 6406, 5121, arg3, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZZ)V")
	public final void method6253(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7329 == 3553) {
			super.aClass9_Sub3_36.method6701(this);
			OpenGL.glTexParameteri(super.anInt7329, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7329, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V")
	public final void method6254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = super.aClass9_Sub3_36.anInt7712 - arg3 - arg4;
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7329, 0, arg0, this.anInt7340 - arg1 - arg4, arg2, local18, arg5, arg4);
		OpenGL.glFlush();
	}
}
