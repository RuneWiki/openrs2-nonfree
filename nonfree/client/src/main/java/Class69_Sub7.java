import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class69_Sub7 extends Class69 {

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!pq;")
	private final Class202 aClass202_5;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!gk;")
	private final Class94 aClass94_4;

	static {
		new Class142("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
		new Class142("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!ih;Lclient!pq;)V")
	public Class69_Sub7(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_5 = arg1;
		this.aClass94_4 = new Class94(arg0, 2);
		this.aClass94_4.method1744(0);
		super.aClass117_Sub1_43.method2476(1);
		if (this.aClass202_5.aBoolean484) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass117_Sub1_43.method2476(0);
		this.aClass94_4.method1745();
		this.aClass94_4.method1744(1);
		super.aClass117_Sub1_43.method2476(1);
		if (this.aClass202_5.aBoolean484) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass117_Sub1_43.method2476(0);
		this.aClass94_4.method1745();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	@Override
	public void method5853() {
		this.aClass94_4.method1738('\u0001');
		super.aClass117_Sub1_43.method2476(1);
		super.aClass117_Sub1_43.method2504(null);
		super.aClass117_Sub1_43.method2476(0);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5861(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BII)V")
	@Override
	public void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg1 & 0x80) != 0;
		super.aClass117_Sub1_43.method2476(1);
		if (local44) {
			Static286.aFloatArray22[1] = 0.0F;
			Static286.aFloatArray22[2] = 0.0F;
			Static286.aFloatArray22[0] = local36;
			Static286.aFloatArray22[3] = 0.0F;
		} else {
			Static286.aFloatArray22[2] = local36;
			Static286.aFloatArray22[0] = 0.0F;
			Static286.aFloatArray22[1] = 0.0F;
			Static286.aFloatArray22[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static286.aFloatArray22, 0);
		Static286.aFloatArray22[2] = 0.0F;
		Static286.aFloatArray22[1] = local36;
		Static286.aFloatArray22[3] = local14 * (float) super.aClass117_Sub1_43.anInt3092 % 1.0F;
		Static286.aFloatArray22[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static286.aFloatArray22, 0);
		if (this.aClass202_5.aBoolean484) {
			Static286.aFloatArray22[1] = 0.0F;
			Static286.aFloatArray22[0] = 0.0F;
			Static286.aFloatArray22[3] = (float) super.aClass117_Sub1_43.anInt3092 * local25 % 1.0F;
			Static286.aFloatArray22[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static286.aFloatArray22, 0);
		} else {
			@Pc(140) int local140 = (int) (local25 * 16.0F * (float) super.aClass117_Sub1_43.anInt3092);
			super.aClass117_Sub1_43.method2504(this.aClass202_5.aClass23_Sub3Array4[local140 % 16]);
		}
		super.aClass117_Sub1_43.method2476(0);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!sv;IB)V")
	@Override
	public void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		super.aClass117_Sub1_43.method2504(arg0);
		super.aClass117_Sub1_43.method2535(arg1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5852() {
		return true;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5862(@OriginalArg(0) boolean arg0) {
		this.aClass94_4.method1738('\u0000');
		if (this.aClass202_5.aBoolean484) {
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2504(this.aClass202_5.aClass23_Sub2_1);
			super.aClass117_Sub1_43.method2476(0);
		}
	}
}
