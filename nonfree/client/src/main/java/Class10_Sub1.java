import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!km", name = "C", descriptor = "I")
	private int anInt255 = -1;

	@OriginalMember(owner = "client!km", name = "J", descriptor = "I")
	private int anInt261 = -1;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	public final int anInt252;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "I")
	public final int anInt257;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ur;IIIIZ[BIZ)V")
	public Class10_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt252 = arg4;
		this.anInt257 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7522 != 34037) {
			Static399.method5204(arg3, arg7, arg6, arg4, arg2, arg1);
			this.method5936(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7522, 0, super.anInt7515, this.anInt257, this.anInt252, 0, arg7, 5121, arg6, 0);
			this.method5936(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5928(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ur;IIII)V")
	public Class10_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt252 = arg4;
		this.anInt257 = arg3;
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glTexImage2Dub(super.anInt7522, 0, super.anInt7515, arg3, arg4, 0, Static423.method5066(super.anInt7515), 5121, null, 0);
		this.method5928(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ur;IIIII)V")
	protected Class10_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt252 = arg5;
		this.anInt257 = arg4;
		@Pc(28) int local28 = super.aClass34_Sub2_43.anInt6906 - arg5 - arg3;
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glCopyTexImage2D(super.anInt7522, 0, super.anInt7515, arg2, local28, arg4, arg5, 0);
		this.method5928(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ur;IIIIZ[IZ)V")
	public Class10_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt257 = arg3;
		this.anInt252 = arg4;
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
		super.aClass34_Sub2_43.method5493(this);
		if (arg5 && super.anInt7522 != 34037) {
			Static81.method1354(super.aClass34_Sub2_43.anInt7113, this.anInt257, arg6, this.anInt252, super.anInt7522, super.anInt7515);
			this.method5936(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7522, 0, super.anInt7515, this.anInt257, this.anInt252, 0, 32993, super.aClass34_Sub2_43.anInt7113, arg6, 0);
			this.method5936(false);
		}
		this.method5928(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ur;IIIIZ[FI)V")
	public Class10_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt252 = arg4;
		this.anInt257 = arg3;
		super.aClass34_Sub2_43.method5493(this);
		if (arg5 && super.anInt7522 != 34037) {
			Static254.method3673(arg4, arg6, arg3, arg2, arg1, arg7);
			this.method5936(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7522, 0, super.anInt7515, this.anInt257, this.anInt252, 0, arg7, 5126, arg6, 0);
			this.method5936(false);
		}
		this.method5928(true);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BIIIIIIIZI)V")
	public final void method197(@OriginalArg(0) byte[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2, @OriginalArg(8) boolean arg3, @OriginalArg(9) int arg4) {
		if (arg3) {
			@Pc(23) int local23 = Static397.method5187(6406);
			@Pc(27) int local27 = arg4 * local23;
			@Pc(31) int local31 = local23 * arg4;
			@Pc(36) byte[] local36 = new byte[arg1 * local27];
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				@Pc(44) int local44 = local27 * local38;
				@Pc(54) int local54 = local31 * (arg1 - local38 - 1);
				for (@Pc(56) int local56 = 0; local56 < local27; local56++) {
					local36[local44++] = arg0[local54++];
				}
			}
			arg0 = local36;
		}
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7522, 0, 0, 0, arg4, arg1, 6406, 5121, arg0, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
	public final void method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = super.aClass34_Sub2_43.anInt6906 - arg5;
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7522, 0, arg0, this.anInt252 - arg1 - arg5, 0, local11, arg4, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIZI[IIZI)V")
	protected final void method199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int[] arg2) {
		@Pc(19) int[] local19 = new int[arg0 * arg1];
		for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
			@Pc(27) int local27 = arg1 * local21;
			@Pc(38) int local38 = arg1 * (arg0 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				local19[local27++] = arg2[local38++];
			}
		}
		super.aClass34_Sub2_43.method5493(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt7522, 0, 0, 0, arg1, arg0, 32993, super.aClass34_Sub2_43.anInt7113, local19, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	@Override
	public final void method5925() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt261, this.anInt255, super.anInt7522, 0, 0);
		this.anInt255 = -1;
		this.anInt261 = -1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIB)V")
	public final void method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt7522, super.anInt7520, 0);
		this.anInt255 = arg0;
		this.anInt261 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIZ)V")
	public final void method201(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7522 == 3553) {
			super.aClass34_Sub2_43.method5493(this);
			OpenGL.glTexParameteri(super.anInt7522, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7522, 10243, arg0 ? 10497 : 33071);
		}
	}
}
