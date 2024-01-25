import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class63_Sub9 extends Class63 {

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Lclient!lo;")
	private Class147 aClass147_6;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "Lclient!rk;")
	private final Class215 aClass215_6;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "Lclient!md;")
	private final Class20_Sub4 aClass20_Sub4_1;

	static {
		new Class134("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
		new Class134("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!pg;Lclient!rk;)V")
	public Class63_Sub9(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class215 arg1) {
		super(arg0);
		this.aClass215_6 = arg1;
		this.method5731();
		this.aClass20_Sub4_1 = new Class20_Sub4(super.aClass163_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass20_Sub4_1.method3115();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		if (super.aClass163_Sub2_43.anInt5241 > 0) {
			@Pc(21) float local21 = -0.5F / (float) super.aClass163_Sub2_43.anInt5241;
			super.aClass163_Sub2_43.method4131(1);
			Static170.aFloatArray7[0] = 0.0F;
			Static170.aFloatArray7[1] = 0.0F;
			Static170.aFloatArray7[3] = local21 * super.aClass163_Sub2_43.aFloat66 + 0.25F;
			Static170.aFloatArray7[2] = local21;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static170.aFloatArray7, 0);
			OpenGL.glPopMatrix();
			super.aClass163_Sub2_43.method4133(0.5F, (float) super.aClass163_Sub2_43.anInt5241);
			super.aClass163_Sub2_43.method4118(this.aClass20_Sub4_1);
			super.aClass163_Sub2_43.method4131(0);
		}
		this.aClass147_6.method3026('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
	private void method5731() {
		this.aClass147_6 = new Class147(super.aClass163_Sub2_43, 2);
		this.aClass147_6.method3028(0);
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4164(7681, 260);
		super.aClass163_Sub2_43.method4181(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass163_Sub2_43.method4131(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass215_6.aBoolean431) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass147_6.method3029();
		this.aClass147_6.method3028(1);
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4164(8448, 8448);
		super.aClass163_Sub2_43.method4181(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass163_Sub2_43.method4131(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass215_6.aBoolean431) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass147_6.method3029();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		this.aClass147_6.method3026('\u0001');
		if (super.aClass163_Sub2_43.anInt5241 > 0) {
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4118(null);
			super.aClass163_Sub2_43.method4133(1.0F, 0.0F);
			super.aClass163_Sub2_43.method4131(0);
		}
		super.aClass163_Sub2_43.method4164(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
		super.aClass163_Sub2_43.method4164(260, 8448);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return true;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass215_6.aBoolean431) {
				super.aClass163_Sub2_43.method4118(this.aClass215_6.aClass20_Sub2_3);
				Static170.aFloatArray7[2] = 0.0F;
				Static170.aFloatArray7[1] = 0.0F;
				Static170.aFloatArray7[3] = (float) (super.aClass163_Sub2_43.anInt5219 % 4000) / 4000.0F;
				Static170.aFloatArray7[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static170.aFloatArray7, 0);
			} else {
				@Pc(59) int local59 = super.aClass163_Sub2_43.anInt5219 % 4000 * 16 / 4000;
				super.aClass163_Sub2_43.method4118(this.aClass215_6.aClass20_Sub1Array4[local59]);
			}
		} else if (this.aClass215_6.aBoolean431) {
			super.aClass163_Sub2_43.method4118(this.aClass215_6.aClass20_Sub2_3);
			Static170.aFloatArray7[2] = 0.0F;
			Static170.aFloatArray7[0] = 0.0F;
			Static170.aFloatArray7[1] = 0.0F;
			Static170.aFloatArray7[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static170.aFloatArray7, 0);
		} else {
			super.aClass163_Sub2_43.method4118(this.aClass215_6.aClass20_Sub1Array4[0]);
		}
	}
}
