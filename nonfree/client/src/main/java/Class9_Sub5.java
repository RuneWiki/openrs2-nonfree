import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "Lclient!m;")
	private final Class144 aClass144_5;

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "Lclient!ct;")
	private final Class43 aClass43_4;

	static {
		new Class83("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
		new Class83("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!fd;Lclient!m;)V")
	public Class9_Sub5(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class144 arg1) {
		super(arg0);
		this.aClass144_5 = arg1;
		this.aClass43_4 = new Class43(arg0, 2);
		this.aClass43_4.method990(0);
		super.aClass19_Sub2_41.method1936(1);
		if (this.aClass144_5.aBoolean415) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass19_Sub2_41.method1936(0);
		this.aClass43_4.method991();
		this.aClass43_4.method990(1);
		super.aClass19_Sub2_41.method1936(1);
		if (this.aClass144_5.aBoolean415) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass19_Sub2_41.method1936(0);
		this.aClass43_4.method991();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!kj;Z)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		super.aClass19_Sub2_41.method1905(arg1);
		super.aClass19_Sub2_41.method1900(arg0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	@Override
	public void method5373() {
		this.aClass43_4.method989('\u0001');
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1905(null);
		super.aClass19_Sub2_41.method1936(0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass19_Sub2_41.method1936(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static184.aFloatArray22[3] = 0.0F;
			Static184.aFloatArray22[2] = 0.0F;
			Static184.aFloatArray22[1] = 0.0F;
			Static184.aFloatArray22[0] = local36;
		} else {
			Static184.aFloatArray22[2] = local36;
			Static184.aFloatArray22[0] = 0.0F;
			Static184.aFloatArray22[1] = 0.0F;
			Static184.aFloatArray22[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static184.aFloatArray22, 0);
		Static184.aFloatArray22[3] = local14 * (float) super.aClass19_Sub2_41.anInt2274 % 1.0F;
		Static184.aFloatArray22[0] = 0.0F;
		Static184.aFloatArray22[1] = local36;
		Static184.aFloatArray22[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static184.aFloatArray22, 0);
		if (this.aClass144_5.aBoolean415) {
			Static184.aFloatArray22[3] = (float) super.aClass19_Sub2_41.anInt2274 * local25 % 1.0F;
			Static184.aFloatArray22[1] = 0.0F;
			Static184.aFloatArray22[2] = 0.0F;
			Static184.aFloatArray22[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static184.aFloatArray22, 0);
		} else {
			@Pc(162) int local162 = (int) ((float) super.aClass19_Sub2_41.anInt2274 * 16.0F * local25);
			super.aClass19_Sub2_41.method1905(this.aClass144_5.aClass6_Sub1Array2[local162 % 16]);
		}
		super.aClass19_Sub2_41.method1936(0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5377(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5371(@OriginalArg(1) boolean arg0) {
		this.aClass43_4.method989('\u0000');
		if (this.aClass144_5.aBoolean415) {
			super.aClass19_Sub2_41.method1936(1);
			super.aClass19_Sub2_41.method1905(this.aClass144_5.aClass6_Sub3_1);
			super.aClass19_Sub2_41.method1936(0);
		}
	}
}
