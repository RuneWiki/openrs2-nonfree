import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
	private int anInt4732 = -1;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
	private int anInt4730 = -1;

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
	public final int anInt4728;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
	public final int anInt4726;

	static {
		new Class189("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class112_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt4728 = arg3;
		this.anInt4726 = arg4;
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glTexImage2Dub(super.anInt5815, 0, super.anInt5821, arg3, arg4, 0, Static228.method3427(super.anInt5821), 5121, null, 0);
		this.method4551(true);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[FI)V")
	public Class112_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4728 = arg3;
		this.anInt4726 = arg4;
		super.aClass172_Sub2_29.method5630(this);
		if (arg5 && super.anInt5815 != 34037) {
			Static180.method2863(arg3, arg7, arg4, arg6, arg2, arg1);
			this.method4552(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5815, 0, super.anInt5821, this.anInt4728, this.anInt4726, 0, arg7, 5126, arg6, 0);
			this.method4552(false);
		}
		this.method4551(true);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[IZ)V")
	public Class112_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4728 = arg3;
		this.anInt4726 = arg4;
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
		super.aClass172_Sub2_29.method5630(this);
		if (arg5 && super.anInt5815 != 34037) {
			Static446.method5885(super.anInt5815, super.aClass172_Sub2_29.anInt7177, this.anInt4726, this.anInt4728, arg6, super.anInt5821);
			this.method4552(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5815, 0, super.anInt5821, this.anInt4728, this.anInt4726, 0, 32993, super.aClass172_Sub2_29.anInt7177, arg6, 0);
			this.method4552(false);
		}
		this.method4551(true);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[BIZ)V")
	public Class112_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4728 = arg3;
		this.anInt4726 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5815 != 34037) {
			Static41.method787(arg6, arg4, arg3, arg7, arg1, arg2);
			this.method4552(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5815, 0, super.anInt5821, this.anInt4728, this.anInt4726, 0, arg7, 5121, arg6, 0);
			this.method4552(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4551(true);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!vj;IIIII)V")
	protected Class112_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt4728 = arg4;
		this.anInt4726 = arg5;
		@Pc(29) int local29 = super.aClass172_Sub2_29.anInt7068 - arg3 - arg5;
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glCopyTexImage2D(super.anInt5815, 0, super.anInt5821, arg2, local29, arg4, arg5, 0);
		this.method4551(true);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZBZ)V")
	public final void method3727(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5815 == 3553) {
			super.aClass172_Sub2_29.method5630(this);
			OpenGL.glTexParameteri(super.anInt5815, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5815, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIIIII[BII)V")
	public final void method3730(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) int arg4) {
		if (arg0) {
			@Pc(18) int local18 = Static392.method5077(6406);
			@Pc(22) int local22 = arg1 * local18;
			@Pc(26) int local26 = arg1 * local18;
			@Pc(31) byte[] local31 = new byte[arg2 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = (arg2 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg3[local50++];
				}
			}
			arg3 = local31;
		}
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5815, 0, 0, 0, arg1, arg2, 6406, 5121, arg3, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([IIIIIIZII)V")
	protected final void method3731(@OriginalArg(0) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		@Pc(34) int[] local34 = new int[arg2 * arg1];
		for (@Pc(36) int local36 = 0; local36 < arg2; local36++) {
			@Pc(42) int local42 = arg1 * local36;
			@Pc(53) int local53 = (arg2 - local36 - 1) * arg1;
			for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
				local34[local42++] = arg0[local53++];
			}
		}
		super.aClass172_Sub2_29.method5630(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt5815, 0, 0, 0, arg1, arg2, 32993, super.aClass172_Sub2_29.anInt7177, local34, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
	public final void method3732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = super.aClass172_Sub2_29.anInt7068 - arg2;
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5815, 0, arg0, this.anInt4726 - arg2 - arg4, 0, local16, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V")
	public final void method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt5815, super.anInt5818, 0);
		this.anInt4732 = arg1;
		this.anInt4730 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	@Override
	public final void method4544() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4730, this.anInt4732, super.anInt5815, 0, 0);
		this.anInt4732 = -1;
		this.anInt4730 = -1;
	}
}
