import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public class Class79_Sub2 extends Class79 {

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
	private int anInt2819 = -1;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	private int anInt2814 = -1;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	public final int anInt2812;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
	public final int anInt2816;

	static {
		new Class88("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!gi;IIIIZ[IZ)V")
	public Class79_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2812 = arg4;
		this.anInt2816 = arg3;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass42_Sub3_23.method3219(this);
		if (arg5 && super.anInt6293 != 34037) {
			Static83.method1856(super.aClass42_Sub3_23.anInt3701, this.anInt2816, super.anInt6298, super.anInt6293, this.anInt2812, arg6);
			this.method5274(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6293, 0, super.anInt6298, this.anInt2816, this.anInt2812, 0, 32993, super.aClass42_Sub3_23.anInt3701, arg6, 0);
			this.method5274(false);
		}
		this.method5278(true);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!gi;IIIIZ[BIZ)V")
	public Class79_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2816 = arg3;
		this.anInt2812 = arg4;
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
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6293 != 34037) {
			Static471.method7105(arg4, arg6, arg1, arg2, arg7, arg3);
			this.method5274(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6293, 0, super.anInt6298, this.anInt2816, this.anInt2812, 0, arg7, 5121, arg6, 0);
			this.method5274(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5278(true);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!gi;IIIII)V")
	protected Class79_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt2816 = arg4;
		this.anInt2812 = arg5;
		@Pc(30) int local30 = super.aClass42_Sub3_23.anInt3515 - arg5 - arg3;
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glCopyTexImage2D(super.anInt6293, 0, super.anInt6298, arg2, local30, arg4, arg5, 0);
		this.method5278(true);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!gi;IIIIZ[FI)V")
	public Class79_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2816 = arg3;
		this.anInt2812 = arg4;
		super.aClass42_Sub3_23.method3219(this);
		if (arg5 && super.anInt6293 != 34037) {
			Static29.method553(arg2, arg6, arg4, arg1, arg7, arg3);
			this.method5274(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6293, 0, super.anInt6298, this.anInt2816, this.anInt2812, 0, arg7, 5126, arg6, 0);
			this.method5274(false);
		}
		this.method5278(true);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!gi;IIII)V")
	public Class79_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt2816 = arg3;
		this.anInt2812 = arg4;
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glTexImage2Dub(super.anInt6293, 0, super.anInt6298, arg3, arg4, 0, Static439.method6675(super.anInt6298), 5121, null, 0);
		this.method5278(true);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIIII)V")
	public final void method2523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass42_Sub3_23.anInt3515 - arg1 - arg0;
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6293, 0, arg4, this.anInt2812 - arg3 - arg1, arg2, local13, arg5, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIIIIIZII)V")
	protected final void method2525(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(8) int arg2) {
		@Pc(19) int[] local19 = new int[arg2 * arg1];
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(27) int local27 = arg1 * local21;
			@Pc(38) int local38 = (arg2 - local21 - 1) * arg1;
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				local19[local27++] = arg0[local38++];
			}
		}
		super.aClass42_Sub3_23.method3219(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt6293, 0, 0, 0, arg1, arg2, 32993, super.aClass42_Sub3_23.anInt3701, local19, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ)V")
	public final void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt6293, super.anInt6292, 0);
		this.anInt2814 = arg0;
		this.anInt2819 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	@Override
	public final void method5270() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2814, this.anInt2819, super.anInt6293, 0, 0);
		this.anInt2819 = -1;
		this.anInt2814 = -1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZZI[BIII)V")
	public final void method2528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static129.method7912(6406);
			@Pc(19) int local19 = arg0 * local15;
			@Pc(23) int local23 = arg0 * local15;
			@Pc(28) byte[] local28 = new byte[local19 * arg4];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(47) int local47 = (arg4 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg3[local47++];
				}
			}
			arg3 = local28;
		}
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6293, 0, 0, 0, arg0, arg4, 6406, 5121, arg3, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZZ)V")
	public final void method2529(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt6293 == 3553) {
			super.aClass42_Sub3_23.method3219(this);
			OpenGL.glTexParameteri(super.anInt6293, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6293, 10243, arg1 ? 10497 : 33071);
		}
	}
}
