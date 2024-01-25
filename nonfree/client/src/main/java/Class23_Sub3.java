import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
	private int anInt7168 = -1;

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
	private int anInt7170 = -1;

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
	public final int anInt7172;

	@OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
	public final int anInt7176;

	static {
		new Class142("Player ", "Spieler ", "Joueur ", "Jogador ");
		new Class142("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[BIZ)V")
	public Class23_Sub3(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7172 = arg3;
		this.anInt7176 = arg4;
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
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7163 != 34037) {
			Static396.method5136(arg7, arg4, arg3, arg2, arg1, arg6);
			this.method5801(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7163, 0, super.anInt7166, this.anInt7172, this.anInt7176, 0, arg7, 5121, arg6, 0);
			this.method5801(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5805(true);
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class23_Sub3(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt7176 = arg4;
		this.anInt7172 = arg3;
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glTexImage2Dub(super.anInt7163, 0, super.anInt7166, arg3, arg4, 0, Static19.method304(super.anInt7166), 5121, null, 0);
		this.method5805(true);
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ih;IIIII)V")
	protected Class23_Sub3(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt7172 = arg4;
		this.anInt7176 = arg5;
		@Pc(28) int local28 = super.aClass117_Sub1_42.anInt3052 - arg5 - arg3;
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glCopyTexImage2D(super.anInt7163, 0, super.anInt7166, arg2, local28, arg4, arg5, 0);
		this.method5805(true);
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[FI)V")
	public Class23_Sub3(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7172 = arg3;
		this.anInt7176 = arg4;
		super.aClass117_Sub1_42.method2504(this);
		if (arg5 && super.anInt7163 != 34037) {
			Static27.method393(arg4, arg6, arg7, arg1, arg3, arg2);
			this.method5801(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7163, 0, super.anInt7166, this.anInt7172, this.anInt7176, 0, arg7, 5126, arg6, 0);
			this.method5801(false);
		}
		this.method5805(true);
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[IZ)V")
	public Class23_Sub3(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7172 = arg3;
		this.anInt7176 = arg4;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass117_Sub1_42.method2504(this);
		if (arg5 && super.anInt7163 != 34037) {
			Static206.method2990(super.anInt7163, arg6, this.anInt7176, this.anInt7172, super.aClass117_Sub1_42.anInt3134, super.anInt7166);
			this.method5801(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7163, 0, super.anInt7166, this.anInt7172, this.anInt7176, 0, 32993, super.aClass117_Sub1_42.anInt3134, arg6, 0);
			this.method5801(false);
		}
		this.method5805(true);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZZ)V")
	public final void method5808(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7163 == 3553) {
			super.aClass117_Sub1_42.method2504(this);
			OpenGL.glTexParameteri(super.anInt7163, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7163, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII)V")
	public final void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass117_Sub1_42.anInt3052 - arg3;
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7163, 0, arg2, this.anInt7176 - arg4 - arg3, 0, local13, arg1, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBII)V")
	public final void method5810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt7163, super.anInt7153, 0);
		this.anInt7170 = arg0;
		this.anInt7168 = arg1;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIZ[BIIII)V")
	public final void method5811(@OriginalArg(1) int arg0, @OriginalArg(4) boolean arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg1) {
			@Pc(18) int local18 = Static14.method271(6406);
			@Pc(22) int local22 = arg4 * local18;
			@Pc(26) int local26 = arg4 * local18;
			@Pc(31) byte[] local31 = new byte[local22 * arg0];
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(51) int local51 = local26 * (arg0 - local33 - 1);
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg2[local51++];
				}
			}
			arg2 = local31;
		}
		super.aClass117_Sub1_42.method2504(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7163, 0, 0, 0, arg4, arg0, 6406, 5121, arg2, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	@Override
	public final void method5797() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7170, this.anInt7168, super.anInt7163, 0, 0);
		this.anInt7170 = -1;
		this.anInt7168 = -1;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIIII[II)V")
	protected final void method5814(@OriginalArg(6) int arg0, @OriginalArg(7) int[] arg1, @OriginalArg(8) int arg2) {
		@Pc(19) int[] local19 = new int[arg0 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
			@Pc(27) int local27 = local21 * arg2;
			@Pc(38) int local38 = arg2 * (arg0 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
				local19[local27++] = arg1[local38++];
			}
		}
		super.aClass117_Sub1_42.method2504(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt7163, 0, 0, 0, arg2, arg0, 32993, super.aClass117_Sub1_42.anInt3134, local19, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
