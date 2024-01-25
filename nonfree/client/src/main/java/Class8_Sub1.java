import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	private int anInt3070 = -1;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
	private int anInt3074 = -1;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
	public final int anInt3069;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	public final int anInt3063;

	static {
		new Class158("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
		new Class158("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class8_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt3069 = arg3;
		this.anInt3063 = arg4;
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glTexImage2Dub(super.anInt3947, 0, super.anInt3950, arg3, arg4, 0, Static76.method1408(super.anInt3950), 5121, null, 0);
		this.method3073(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ih;IIIII)V")
	protected Class8_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt3069 = arg4;
		this.anInt3063 = arg5;
		@Pc(29) int local29 = super.aClass106_Sub2_25.anInt3713 - arg3 - arg5;
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glCopyTexImage2D(super.anInt3947, 0, super.anInt3950, arg2, local29, arg4, arg5, 0);
		this.method3073(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[IZ)V")
	public Class8_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3063 = arg4;
		this.anInt3069 = arg3;
		if (arg7) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass106_Sub2_25.method2912(this);
		if (arg5 && super.anInt3947 != 34037) {
			Static308.method4426(super.anInt3950, arg6, super.aClass106_Sub2_25.anInt3759, super.anInt3947, this.anInt3063, this.anInt3069);
			this.method3075(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt3947, 0, super.anInt3950, this.anInt3069, this.anInt3063, 0, 32993, super.aClass106_Sub2_25.anInt3759, arg6, 0);
			this.method3075(false);
		}
		this.method3073(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[BIZ)V")
	public Class8_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3063 = arg4;
		this.anInt3069 = arg3;
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
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt3947 != 34037) {
			Static120.method1934(arg4, arg7, arg6, arg2, arg3, arg1);
			this.method3075(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt3947, 0, super.anInt3950, this.anInt3069, this.anInt3063, 0, arg7, 5121, arg6, 0);
			this.method3075(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method3073(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[FI)V")
	public Class8_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3063 = arg4;
		this.anInt3069 = arg3;
		super.aClass106_Sub2_25.method2912(this);
		if (arg5 && super.anInt3947 != 34037) {
			Static122.method1985(arg6, arg2, arg4, arg1, arg3, arg7);
			this.method3075(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt3947, 0, super.anInt3950, this.anInt3069, this.anInt3063, 0, arg7, 5126, arg6, 0);
			this.method3075(false);
		}
		this.method3073(true);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZZ)V")
	public final void method2252(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt3947 == 3553) {
			super.aClass106_Sub2_25.method2912(this);
			OpenGL.glTexParameteri(super.anInt3947, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt3947, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	@Override
	public final void method3067() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3070, this.anInt3074, super.anInt3947, 0, 0);
		this.anInt3074 = -1;
		this.anInt3070 = -1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)V")
	public final void method2253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt3947, super.anInt3959, 0);
		this.anInt3070 = arg0;
		this.anInt3074 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZIIII)V")
	public final void method2254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass106_Sub2_25.anInt3713 - arg3;
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glCopyTexSubImage2D(super.anInt3947, 0, arg0, this.anInt3063 - arg4 - arg3, 0, local12, arg2, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBZI[BIIIII)V")
	public final void method2258(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1) {
			@Pc(13) int local13 = Static172.method2853(6406);
			@Pc(17) int local17 = arg0 * local13;
			@Pc(21) int local21 = local13 * arg0;
			@Pc(26) byte[] local26 = new byte[local17 * arg3];
			for (@Pc(28) int local28 = 0; local28 < arg3; local28++) {
				@Pc(33) int local33 = local28 * local17;
				@Pc(44) int local44 = (arg3 - local28 - 1) * local21;
				for (@Pc(46) int local46 = 0; local46 < local17; local46++) {
					local26[local33++] = arg2[local44++];
				}
			}
			arg2 = local26;
		}
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt3947, 0, 0, 0, arg0, arg3, 6406, 5121, arg2, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZIB[IIIII)V")
	protected final void method2262(@OriginalArg(2) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(16) int[] local16 = new int[arg0 * arg2];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(24) int local24 = arg2 * local18;
			@Pc(34) int local34 = arg2 * (arg0 - local18 - 1);
			for (@Pc(36) int local36 = 0; local36 < arg2; local36++) {
				local16[local24++] = arg1[local34++];
			}
		}
		super.aClass106_Sub2_25.method2912(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt3947, 0, 0, 0, arg2, arg0, 32993, super.aClass106_Sub2_25.anInt3759, local16, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
