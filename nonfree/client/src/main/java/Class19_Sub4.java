import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
	private int anInt5076 = -1;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
	private int anInt5078 = -1;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	public final int anInt5083;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	public final int anInt5081;

	static {
		new Class267("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!rl;IIIIZ[BIZ)V")
	public Class19_Sub4(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5083 = arg3;
		this.anInt5081 = arg4;
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
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5060 != 34037) {
			Static105.method1867(arg7, arg4, arg3, arg2, arg6, arg1);
			this.method4247(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5060, 0, super.anInt5062, this.anInt5083, this.anInt5081, 0, arg7, 5121, arg6, 0);
			this.method4247(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!rl;IIIIZ[FI)V")
	public Class19_Sub4(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5083 = arg3;
		this.anInt5081 = arg4;
		super.aClass66_Sub2_28.method5109(this);
		if (arg5 && super.anInt5060 != 34037) {
			Static195.method5945(arg4, arg1, arg6, arg3, arg7, arg2);
			this.method4247(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5060, 0, super.anInt5062, this.anInt5083, this.anInt5081, 0, arg7, 5126, arg6, 0);
			this.method4247(false);
		}
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!rl;IIII)V")
	public Class19_Sub4(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt5083 = arg3;
		this.anInt5081 = arg4;
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glTexImage2Dub(super.anInt5060, 0, super.anInt5062, arg3, arg4, 0, Static426.method6222(super.anInt5062), 5121, null, 0);
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!rl;IIIII)V")
	protected Class19_Sub4(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt5081 = arg5;
		this.anInt5083 = arg4;
		@Pc(28) int local28 = super.aClass66_Sub2_28.anInt6028 - arg3 - arg5;
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glCopyTexImage2D(super.anInt5060, 0, super.anInt5062, arg2, local28, arg4, arg5, 0);
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!rl;IIIIZ[IZ)V")
	public Class19_Sub4(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5081 = arg4;
		this.anInt5083 = arg3;
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
		super.aClass66_Sub2_28.method5109(this);
		if (arg5 && super.anInt5060 != 34037) {
			Static380.method5652(super.aClass66_Sub2_28.anInt6171, super.anInt5062, arg6, this.anInt5083, this.anInt5081, super.anInt5060);
			this.method4247(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5060, 0, super.anInt5062, this.anInt5083, this.anInt5081, 0, 32993, super.aClass66_Sub2_28.anInt6171, arg6, 0);
			this.method4247(false);
		}
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public final void method4235() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5076, this.anInt5078, super.anInt5060, 0, 0);
		this.anInt5078 = -1;
		this.anInt5076 = -1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BIIIIII)V")
	public final void method4254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(21) int local21 = super.aClass66_Sub2_28.anInt6028 - arg1;
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5060, 0, arg0, this.anInt5081 - arg1 - arg3, 0, local21, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
	public final void method4255(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt5060, super.anInt5072, 0);
		this.anInt5078 = arg1;
		this.anInt5076 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIIIIII[BI)V")
	public final void method4256(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg0) {
			@Pc(18) int local18 = Static443.method6419(6406);
			@Pc(22) int local22 = local18 * arg2;
			@Pc(26) int local26 = arg2 * local18;
			@Pc(31) byte[] local31 = new byte[arg1 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(50) int local50 = local26 * (arg1 - local33 - 1);
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg4[local50++];
				}
			}
			arg4 = local31;
		}
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5060, 0, 0, 0, arg2, arg1, 6406, 5121, arg4, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZI)V")
	public final void method4257(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt5060 == 3553) {
			super.aClass66_Sub2_28.method5109(this);
			OpenGL.glTexParameteri(super.anInt5060, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5060, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIIII[III)V")
	protected final void method4258(@OriginalArg(4) int arg0, @OriginalArg(6) int[] arg1, @OriginalArg(7) int arg2) {
		@Pc(27) int[] local27 = new int[arg0 * arg2];
		for (@Pc(29) int local29 = 0; local29 < arg2; local29++) {
			@Pc(35) int local35 = local29 * arg0;
			@Pc(45) int local45 = (arg2 - local29 - 1) * arg0;
			for (@Pc(47) int local47 = 0; local47 < arg0; local47++) {
				local27[local35++] = arg1[local45++];
			}
		}
		super.aClass66_Sub2_28.method5109(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt5060, 0, 0, 0, arg0, arg2, 32993, super.aClass66_Sub2_28.anInt6171, local27, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
