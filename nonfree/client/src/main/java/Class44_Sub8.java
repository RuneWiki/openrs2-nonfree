import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class44_Sub8 extends Class44 {

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!ab;")
	private Class3 aClass3_5;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Lclient!lm;")
	private final Class188 aClass188_5;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Lclient!lf;")
	private final Class4_Sub3 aClass4_Sub3_1;

	static {
		new Class40("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!jj;Lclient!lm;)V")
	public Class44_Sub8(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class188 arg1) {
		super(arg0);
		this.aClass188_5 = arg1;
		this.method6211();
		this.aClass4_Sub3_1 = new Class4_Sub3(super.aClass62_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass4_Sub3_1.method4571();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass188_5.aBoolean404) {
				super.aClass62_Sub3_43.method4007(this.aClass188_5.aClass4_Sub1_1);
				Static523.aFloatArray71[3] = (float) (super.aClass62_Sub3_43.anInt4623 % 4000) / 4000.0F;
				Static523.aFloatArray71[2] = 0.0F;
				Static523.aFloatArray71[1] = 0.0F;
				Static523.aFloatArray71[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static523.aFloatArray71, 0);
			} else {
				@Pc(26) int local26 = super.aClass62_Sub3_43.anInt4623 % 4000 * 16 / 4000;
				super.aClass62_Sub3_43.method4007(this.aClass188_5.aClass4_Sub2Array2[local26]);
			}
		} else if (this.aClass188_5.aBoolean404) {
			super.aClass62_Sub3_43.method4007(this.aClass188_5.aClass4_Sub1_1);
			Static523.aFloatArray71[3] = 0.0F;
			Static523.aFloatArray71[1] = 0.0F;
			Static523.aFloatArray71[0] = 0.0F;
			Static523.aFloatArray71[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static523.aFloatArray71, 0);
		} else {
			super.aClass62_Sub3_43.method4007(this.aClass188_5.aClass4_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7281() {
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!aba;I)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	private void method6211() {
		this.aClass3_5 = new Class3(super.aClass62_Sub3_43, 2);
		this.aClass3_5.method205(0);
		super.aClass62_Sub3_43.method4009(1);
		super.aClass62_Sub3_43.method4011(260, 7681);
		super.aClass62_Sub3_43.method3984(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass62_Sub3_43.method4009(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass188_5.aBoolean404) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass3_5.method210();
		this.aClass3_5.method205(1);
		super.aClass62_Sub3_43.method4009(1);
		super.aClass62_Sub3_43.method4011(8448, 8448);
		super.aClass62_Sub3_43.method3984(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass62_Sub3_43.method4009(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass188_5.aBoolean404) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass3_5.method210();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	@Override
	public void method7280() {
		this.aClass3_5.method207('\u0001');
		if (super.aClass62_Sub3_43.anInt4653 > 0) {
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4007(null);
			super.aClass62_Sub3_43.method3975(1.0F, 0.0F);
			super.aClass62_Sub3_43.method4009(0);
		}
		super.aClass62_Sub3_43.method4011(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
		if (super.aClass62_Sub3_43.anInt4653 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass62_Sub3_43.anInt4653;
			super.aClass62_Sub3_43.method4009(1);
			Static523.aFloatArray71[3] = local10 * super.aClass62_Sub3_43.aFloat197 + 0.25F;
			Static523.aFloatArray71[1] = 0.0F;
			Static523.aFloatArray71[0] = 0.0F;
			Static523.aFloatArray71[2] = local10;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static523.aFloatArray71, 0);
			OpenGL.glPopMatrix();
			super.aClass62_Sub3_43.method3975(0.5F, (float) super.aClass62_Sub3_43.anInt4653);
			super.aClass62_Sub3_43.method4007(this.aClass4_Sub3_1);
			super.aClass62_Sub3_43.method4009(0);
		}
		this.aClass3_5.method207('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7277(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub3_43.method4011(8448, 260);
	}
}
