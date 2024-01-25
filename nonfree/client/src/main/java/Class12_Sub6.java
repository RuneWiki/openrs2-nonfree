import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class12_Sub6 extends Class12 {

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "[I")
	public static final int[] anIntArray362 = new int[256];

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Lclient!hu;")
	private Class110 aClass110_3;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!ha;")
	private final Class98 aClass98_4;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Lclient!fc;")
	private final Class19_Sub2 aClass19_Sub2_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray362[local4] = local7;
		}
		new Class267("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!rl;Lclient!ha;)V")
	public Class12_Sub6(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class98 arg1) {
		super(arg0);
		this.aClass98_4 = arg1;
		this.method4524();
		this.aClass19_Sub2_1 = new Class19_Sub2(super.aClass66_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass19_Sub2_1.method1866();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
		super.aClass66_Sub2_41.method5145(8448, 260);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		if (super.aClass66_Sub2_41.anInt6182 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass66_Sub2_41.anInt6182;
			super.aClass66_Sub2_41.method5075(1);
			Static318.aFloatArray18[2] = local10;
			Static318.aFloatArray18[0] = 0.0F;
			Static318.aFloatArray18[3] = local10 * super.aClass66_Sub2_41.aFloat69 + 0.25F;
			Static318.aFloatArray18[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static318.aFloatArray18, 0);
			OpenGL.glPopMatrix();
			super.aClass66_Sub2_41.method5084((float) super.aClass66_Sub2_41.anInt6182, 0.5F);
			super.aClass66_Sub2_41.method5109(this.aClass19_Sub2_1);
			super.aClass66_Sub2_41.method5075(0);
		}
		this.aClass110_3.method2677('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	private void method4524() {
		this.aClass110_3 = new Class110(super.aClass66_Sub2_41, 2);
		this.aClass110_3.method2674(0);
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5145(260, 7681);
		super.aClass66_Sub2_41.method5081(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass66_Sub2_41.method5075(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass98_4.aBoolean187) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass110_3.method2676();
		this.aClass110_3.method2674(1);
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5145(8448, 8448);
		super.aClass66_Sub2_41.method5081(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass66_Sub2_41.method5075(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass98_4.aBoolean187) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass110_3.method2676();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass98_4.aBoolean187) {
				super.aClass66_Sub2_41.method5109(this.aClass98_4.aClass19_Sub1_3);
				Static318.aFloatArray18[1] = 0.0F;
				Static318.aFloatArray18[2] = 0.0F;
				Static318.aFloatArray18[0] = 0.0F;
				Static318.aFloatArray18[3] = (float) (super.aClass66_Sub2_41.anInt6140 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static318.aFloatArray18, 0);
			} else {
				@Pc(73) int local73 = super.aClass66_Sub2_41.anInt6140 % 4000 * 16 / 4000;
				super.aClass66_Sub2_41.method5109(this.aClass98_4.aClass19_Sub4Array1[local73]);
			}
		} else if (this.aClass98_4.aBoolean187) {
			super.aClass66_Sub2_41.method5109(this.aClass98_4.aClass19_Sub1_3);
			Static318.aFloatArray18[1] = 0.0F;
			Static318.aFloatArray18[0] = 0.0F;
			Static318.aFloatArray18[2] = 0.0F;
			Static318.aFloatArray18[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static318.aFloatArray18, 0);
		} else {
			super.aClass66_Sub2_41.method5109(this.aClass98_4.aClass19_Sub4Array1[0]);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		this.aClass110_3.method2677('\u0001');
		if (super.aClass66_Sub2_41.anInt6182 > 0) {
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5109(null);
			super.aClass66_Sub2_41.method5084(0.0F, 1.0F);
			super.aClass66_Sub2_41.method5075(0);
		}
		super.aClass66_Sub2_41.method5145(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
	}
}
