import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class38_Sub5 extends Class38 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!pb;")
	private Class184 aClass184_5;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!qf;")
	private final Class198 aClass198_3;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Lclient!gt;")
	private final Class10_Sub2 aClass10_Sub2_1;

	static {
		new Class119("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
		new Class119(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!ur;Lclient!qf;)V")
	public Class38_Sub5(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_3 = arg1;
		this.method3905();
		this.aClass10_Sub2_1 = new Class10_Sub2(super.aClass34_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass10_Sub2_1.method2132();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
		super.aClass34_Sub2_41.method5526(260, 8448);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	private void method3905() {
		this.aClass184_5 = new Class184(super.aClass34_Sub2_41, 2);
		this.aClass184_5.method4094(0);
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5526(7681, 260);
		super.aClass34_Sub2_41.method5486(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass34_Sub2_41.method5507(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass198_3.aBoolean630) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass184_5.method4095();
		this.aClass184_5.method4094(1);
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5526(8448, 8448);
		super.aClass34_Sub2_41.method5486(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass34_Sub2_41.method5507(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass198_3.aBoolean630) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass184_5.method4095();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass198_3.aBoolean630) {
				super.aClass34_Sub2_41.method5493(this.aClass198_3.aClass10_Sub4_2);
				Static181.aFloatArray10[3] = (float) (super.aClass34_Sub2_41.anInt7073 % 4000) / 4000.0F;
				Static181.aFloatArray10[1] = 0.0F;
				Static181.aFloatArray10[0] = 0.0F;
				Static181.aFloatArray10[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static181.aFloatArray10, 0);
			} else {
				@Pc(28) int local28 = super.aClass34_Sub2_41.anInt7073 % 4000 * 16 / 4000;
				super.aClass34_Sub2_41.method5493(this.aClass198_3.aClass10_Sub1Array4[local28]);
			}
		} else if (this.aClass198_3.aBoolean630) {
			super.aClass34_Sub2_41.method5493(this.aClass198_3.aClass10_Sub4_2);
			Static181.aFloatArray10[2] = 0.0F;
			Static181.aFloatArray10[0] = 0.0F;
			Static181.aFloatArray10[3] = 0.0F;
			Static181.aFloatArray10[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static181.aFloatArray10, 0);
		} else {
			super.aClass34_Sub2_41.method5493(this.aClass198_3.aClass10_Sub1Array4[0]);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		if (super.aClass34_Sub2_41.anInt7095 > 0) {
			@Pc(15) float local15 = -0.5F / (float) super.aClass34_Sub2_41.anInt7095;
			super.aClass34_Sub2_41.method5507(1);
			Static181.aFloatArray10[1] = 0.0F;
			Static181.aFloatArray10[2] = local15;
			Static181.aFloatArray10[3] = super.aClass34_Sub2_41.aFloat82 * local15 + 0.25F;
			Static181.aFloatArray10[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static181.aFloatArray10, 0);
			OpenGL.glPopMatrix();
			super.aClass34_Sub2_41.method5499(0.5F, (float) super.aClass34_Sub2_41.anInt7095);
			super.aClass34_Sub2_41.method5493(this.aClass10_Sub2_1);
			super.aClass34_Sub2_41.method5507(0);
		}
		this.aClass184_5.method4096('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		this.aClass184_5.method4096('\u0001');
		if (super.aClass34_Sub2_41.anInt7095 > 0) {
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5493(null);
			super.aClass34_Sub2_41.method5499(1.0F, 0.0F);
			super.aClass34_Sub2_41.method5507(0);
		}
		super.aClass34_Sub2_41.method5526(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
