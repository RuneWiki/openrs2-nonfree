import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!gha", name = "G", descriptor = "I")
	private int anInt8355 = -1;

	@OriginalMember(owner = "client!gha", name = "H", descriptor = "I")
	private int anInt8356 = -1;

	@OriginalMember(owner = "client!gha", name = "I", descriptor = "I")
	public final int anInt8357;

	@OriginalMember(owner = "client!gha", name = "F", descriptor = "I")
	public final int anInt8354;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!ck;IIII)V")
	public Class80_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt8357 = arg4;
		this.anInt8354 = arg3;
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glTexImage2Dub(super.anInt8338, 0, super.anInt8332, arg3, arg4, 0, Static149.method2714(super.anInt8332), 5121, (byte[]) null, 0);
		this.method7142(true);
	}

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!ck;IIIIZ[FI)V")
	public Class80_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt8354 = arg3;
		this.anInt8357 = arg4;
		super.aClass65_Sub1_32.method1286(this);
		if (arg5 && super.anInt8338 != 34037) {
			Static235.method3634(arg2, arg3, arg6, arg7, arg4, arg1);
			this.method7139(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8338, 0, super.anInt8332, this.anInt8354, this.anInt8357, 0, arg7, 5126, arg6, 0);
			this.method7139(false);
		}
		this.method7142(true);
	}

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!ck;IIIIZ[IIIZ)V")
	public Class80_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt8354 = arg3;
		this.anInt8357 = arg4;
		if (arg9) {
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
		super.aClass65_Sub1_32.method1286(this);
		if (super.anInt8338 != 34037 && arg5 && arg7 == 0) {
			Static361.method5432(super.anInt8332, this.anInt8357, super.anInt8338, super.aClass65_Sub1_32.anInt1410, arg6, this.anInt8354);
			this.method7139(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt8338, 0, super.anInt8332, this.anInt8354, this.anInt8357, 0, 32993, super.aClass65_Sub1_32.anInt1410, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method7139(false);
		}
		this.method7142(true);
	}

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!ck;IIIIZ[BIZ)V")
	public Class80_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt8354 = arg3;
		this.anInt8357 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8338 != 34037) {
			Static409.method6022(arg6, arg2, arg3, arg4, arg1, arg7);
			this.method7139(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8338, 0, super.anInt8332, this.anInt8354, this.anInt8357, 0, arg7, 5121, arg6, 0);
			this.method7139(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7142(true);
	}

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!ck;IIIII)V")
	public Class80_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt8357 = arg5;
		this.anInt8354 = arg4;
		@Pc(28) int local28 = super.aClass65_Sub1_32.anInt1374 - arg5 - arg3;
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glCopyTexImage2D(super.anInt8338, 0, super.anInt8332, arg2, local28, arg4, arg5, 0);
		this.method7142(true);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
	@Override
	public final void method7433() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt8355, this.anInt8356, super.anInt8338, 0, 0);
		this.anInt8356 = -1;
		this.anInt8355 = -1;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZIIIII)V")
	public final void method7143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass65_Sub1_32.anInt1374 - arg2 - arg3;
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8338, 0, arg0, this.anInt8357 - arg1 - arg3, arg5, local12, arg4, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z[IIIIIIII)V")
	public final void method7144(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg4 == 0) {
			arg4 = arg1;
		}
		@Pc(19) int[] local19 = new int[arg5 * arg1];
		for (@Pc(21) int local21 = 0; local21 < arg5; local21++) {
			@Pc(27) int local27 = arg1 * local21;
			@Pc(38) int local38 = (arg5 - local21 - 1) * arg4;
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				local19[local27++] = arg0[local38++];
			}
		}
		super.aClass65_Sub1_32.method1286(this);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Di(super.anInt8338, 0, arg2, this.anInt8357 - arg5 - arg3, arg1, arg5, 32993, super.aClass65_Sub1_32.anInt1410, local19, 0);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIII)V")
	public final void method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt8338, super.anInt8337, 0);
		this.anInt8356 = arg0;
		this.anInt8355 = arg1;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZZ)V")
	public final void method7150(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt8338 == 3553) {
			super.aClass65_Sub1_32.method1286(this);
			OpenGL.glTexParameteri(super.anInt8338, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8338, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BI[BIIIIIZI)V")
	public final void method7151(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(8) boolean arg3, @OriginalArg(9) int arg4) {
		if (arg3) {
			@Pc(15) int local15 = Static105.method2031(6406);
			@Pc(19) int local19 = arg2 * local15;
			@Pc(23) int local23 = local15 * arg2;
			@Pc(28) byte[] local28 = new byte[local19 * arg1];
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(47) int local47 = (arg1 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg0[local47++];
				}
			}
			arg0 = local28;
		}
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8338, 0, 0, 0, arg2, arg1, 6406, 5121, arg0, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
