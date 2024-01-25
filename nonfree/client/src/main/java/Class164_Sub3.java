import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public class Class164_Sub3 extends Class164 {

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
	private int anInt9465 = -1;

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
	private int anInt9469 = -1;

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
	public final int anInt9468;

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
	public final int anInt9475;

	static {
		new Class45(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!mh;IIII)V")
	public Class164_Sub3(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt9468 = arg4;
		this.anInt9475 = arg3;
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glTexImage2Dub(super.anInt9448, 0, super.anInt9461, arg3, arg4, 0, Static514.method7865(super.anInt9461), 5121, null, 0);
		this.method8154(true);
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!mh;IIIIZ[FI)V")
	public Class164_Sub3(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9475 = arg3;
		this.anInt9468 = arg4;
		super.aClass4_Sub3_43.method5250(this);
		if (arg5 && super.anInt9448 != 34037) {
			Static102.method2087(arg4, arg1, arg2, arg7, arg6, arg3);
			this.method8149(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9448, 0, super.anInt9461, this.anInt9475, this.anInt9468, 0, arg7, 5126, arg6, 0);
			this.method8149(false);
		}
		this.method8154(true);
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!mh;IIIII)V")
	protected Class164_Sub3(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt9475 = arg4;
		this.anInt9468 = arg5;
		@Pc(30) int local30 = super.aClass4_Sub3_43.anInt5633 - arg3 - arg5;
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glCopyTexImage2D(super.anInt9448, 0, super.anInt9461, arg2, local30, arg4, arg5, 0);
		this.method8154(true);
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!mh;IIIIZ[BIZ)V")
	public Class164_Sub3(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9468 = arg4;
		this.anInt9475 = arg3;
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
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9448 != 34037) {
			Static433.method6715(arg4, arg1, arg2, arg3, arg6, arg7);
			this.method8149(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9448, 0, super.anInt9461, this.anInt9475, this.anInt9468, 0, arg7, 5121, arg6, 0);
			this.method8149(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8154(true);
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!mh;IIIIZ[IZ)V")
	public Class164_Sub3(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9468 = arg4;
		this.anInt9475 = arg3;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass4_Sub3_43.method5250(this);
		if (arg5 && super.anInt9448 != 34037) {
			Static310.method5798(super.anInt9448, super.anInt9461, arg6, this.anInt9475, this.anInt9468, super.aClass4_Sub3_43.anInt5806);
			this.method8149(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt9448, 0, super.anInt9461, this.anInt9475, this.anInt9468, 0, 32993, super.aClass4_Sub3_43.anInt5806, arg6, 0);
			this.method8149(false);
		}
		this.method8154(true);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V")
	public final void method8155(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9448, super.anInt9463, 0);
		this.anInt9465 = arg1;
		this.anInt9469 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIZBIIIII)V")
	protected final void method8156(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2) {
		@Pc(20) int[] local20 = new int[arg1 * arg2];
		for (@Pc(22) int local22 = 0; local22 < arg1; local22++) {
			@Pc(28) int local28 = arg2 * local22;
			@Pc(38) int local38 = arg2 * (arg1 - local22 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
				local20[local28++] = arg0[local38++];
			}
		}
		super.aClass4_Sub3_43.method5250(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt9448, 0, 0, 0, arg2, arg1, 32993, super.aClass4_Sub3_43.anInt5806, local20, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZZ)V")
	public final void method8159(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9448 == 3553) {
			super.aClass4_Sub3_43.method5250(this);
			OpenGL.glTexParameteri(super.anInt9448, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9448, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V")
	public final void method8160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = super.aClass4_Sub3_43.anInt5633 - arg5 - arg2;
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9448, 0, arg1, this.anInt9468 - arg3 - arg5, arg4, local11, arg0, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI[BIIIIIZI)V")
	public final void method8161(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		if (arg0) {
			@Pc(19) int local19 = Static74.method1729(6406);
			@Pc(23) int local23 = local19 * arg4;
			@Pc(27) int local27 = local19 * arg4;
			@Pc(32) byte[] local32 = new byte[arg3 * local23];
			for (@Pc(34) int local34 = 0; local34 < arg3; local34++) {
				@Pc(40) int local40 = local34 * local23;
				@Pc(51) int local51 = local27 * (arg3 - local34 - 1);
				for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
					local32[local40++] = arg2[local51++];
				}
			}
			arg2 = local32;
		}
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9448, 0, 0, 0, arg4, arg3, 6406, 5121, arg2, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	@Override
	public final void method8143() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt9469, this.anInt9465, super.anInt9448, 0, 0);
		this.anInt9469 = -1;
		this.anInt9465 = -1;
	}
}
