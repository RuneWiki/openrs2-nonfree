import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public class Class161_Sub1 extends Class161 {

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
	private int anInt4550 = -1;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
	private int anInt4555 = -1;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
	public final int anInt4546;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
	public final int anInt4554;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!pi;IIIIZ[BIZ)V")
	public Class161_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4546 = arg4;
		this.anInt4554 = arg3;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(41) int local41 = (arg4 - local28 - 1) * arg3;
				for (@Pc(43) int local43 = 0; local43 < arg3; local43++) {
					local26[local33++] = arg6[local41++];
				}
			}
			arg6 = local26;
		}
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt10743 != 34037) {
			Static402.method6102(arg6, arg1, arg2, arg7, arg4, arg3);
			this.method9169(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt10743, 0, super.anInt10745, this.anInt4554, this.anInt4546, 0, arg7, 5121, arg6, 0);
			this.method9169(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method9173(true);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!pi;IIII)V")
	public Class161_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt4554 = arg3;
		this.anInt4546 = arg4;
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glTexImage2Dub(super.anInt10743, 0, super.anInt10745, arg3, arg4, 0, Static30.method478(super.anInt10745), 5121, (byte[]) null, 0);
		this.method9173(true);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!pi;IIIIZ[IIIZ)V")
	public Class161_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4546 = arg4;
		this.anInt4554 = arg3;
		if (arg9) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass144_Sub3_42.method6982(this);
		if (super.anInt10743 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static518.method7672(super.aClass144_Sub3_42.anInt8089, super.anInt10745, this.anInt4554, arg6, this.anInt4546, super.anInt10743);
			this.method9169(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt10743, 0, super.anInt10745, this.anInt4554, this.anInt4546, 0, 32993, super.aClass144_Sub3_42.anInt8089, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method9169(false);
		}
		this.method9173(true);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!pi;IIIII)V")
	public Class161_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt4554 = arg4;
		this.anInt4546 = arg5;
		@Pc(29) int local29 = super.aClass144_Sub3_42.anInt7942 - arg5 - arg3;
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glCopyTexImage2D(super.anInt10743, 0, super.anInt10745, arg2, local29, arg4, arg5, 0);
		this.method9173(true);
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!pi;IIIIZ[FI)V")
	public Class161_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4546 = arg4;
		this.anInt4554 = arg3;
		super.aClass144_Sub3_42.method6982(this);
		if (arg5 && super.anInt10743 != 34037) {
			Static533.method7887(arg4, arg7, arg6, arg2, arg3, arg1);
			this.method9169(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt10743, 0, super.anInt10745, this.anInt4554, this.anInt4546, 0, arg7, 5126, arg6, 0);
			this.method9169(false);
		}
		this.method9173(true);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIII)V")
	public final void method3967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt10743, super.anInt10748, 0);
		this.anInt4555 = arg1;
		this.anInt4550 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	@Override
	public final void method9166() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4555, this.anInt4550, super.anInt10743, 0, 0);
		this.anInt4555 = -1;
		this.anInt4550 = -1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[IIIIIZ)V")
	public final void method3968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == 0) {
			arg3 = arg0;
		}
		@Pc(23) int[] local23 = new int[arg0 * arg5];
		for (@Pc(25) int local25 = 0; local25 < arg5; local25++) {
			@Pc(31) int local31 = local25 * arg0;
			@Pc(41) int local41 = arg3 * (arg5 - local25 - 1);
			for (@Pc(43) int local43 = 0; local43 < arg0; local43++) {
				local23[local31++] = arg2[local41++];
			}
		}
		super.aClass144_Sub3_42.method6982(this);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt10743, 0, arg4, this.anInt4546 - arg1 - arg5, arg0, arg5, 32993, super.aClass144_Sub3_42.anInt8089, local23, 0);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)V")
	public final void method3969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass144_Sub3_42.anInt7942 - arg2 - arg1;
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glCopyTexSubImage2D(super.anInt10743, 0, arg5, this.anInt4546 - arg0 - arg1, arg3, local12, arg4, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIZ)V")
	public final void method3971(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt10743 == 3553) {
			super.aClass144_Sub3_42.method6982(this);
			OpenGL.glTexParameteri(super.anInt10743, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt10743, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[BIIZBIII)V")
	public final void method3972(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4) {
		if (arg3) {
			@Pc(15) int local15 = Static492.method7404(6406);
			@Pc(19) int local19 = arg4 * local15;
			@Pc(23) int local23 = arg4 * local15;
			@Pc(28) byte[] local28 = new byte[arg0 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(47) int local47 = local23 * (arg0 - local30 - 1);
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg1[local47++];
				}
			}
			arg1 = local28;
		}
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10743, 0, 0, 0, arg4, arg0, 6406, 5121, arg1, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
