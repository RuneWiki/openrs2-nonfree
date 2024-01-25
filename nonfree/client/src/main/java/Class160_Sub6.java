import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class160_Sub6 extends Class160 {

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "Lclient!fga;")
	private Class113 aClass113_5;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!pia;")
	private final Class288 aClass288_5;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Lclient!qaa;")
	private final Class29_Sub4 aClass29_Sub4_1;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!vf;Lclient!pia;)V")
	public Class160_Sub6(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class288 arg1) {
		super(arg0);
		this.aClass288_5 = arg1;
		this.method5601();
		this.aClass29_Sub4_1 = new Class29_Sub4(super.aClass100_Sub3_40, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass29_Sub4_1.method6689();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		this.aClass113_5.method2793('\u0001');
		if (super.aClass100_Sub3_40.anInt10292 > 0) {
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8743((Class29) null);
			super.aClass100_Sub3_40.method8682(0.0F, 1.0F);
			super.aClass100_Sub3_40.method8678(0);
		}
		super.aClass100_Sub3_40.method8738(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass288_5.aBoolean504) {
				super.aClass100_Sub3_40.method8743(this.aClass288_5.aClass29_Sub1_3);
				Static670.aFloatArray53[1] = 0.0F;
				Static670.aFloatArray53[3] = (float) (super.aClass100_Sub3_40.anInt10257 % 4000) / 4000.0F;
				Static670.aFloatArray53[2] = 0.0F;
				Static670.aFloatArray53[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static670.aFloatArray53, 0);
			} else {
				@Pc(73) int local73 = super.aClass100_Sub3_40.anInt10257 % 4000 * 16 / 4000;
				super.aClass100_Sub3_40.method8743(this.aClass288_5.aClass29_Sub3Array3[local73]);
			}
		} else if (this.aClass288_5.aBoolean504) {
			super.aClass100_Sub3_40.method8743(this.aClass288_5.aClass29_Sub1_3);
			Static670.aFloatArray53[0] = 0.0F;
			Static670.aFloatArray53[1] = 0.0F;
			Static670.aFloatArray53[3] = 0.0F;
			Static670.aFloatArray53[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static670.aFloatArray53, 0);
		} else {
			super.aClass100_Sub3_40.method8743(this.aClass288_5.aClass29_Sub3Array3[0]);
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
	private void method5601() {
		this.aClass113_5 = new Class113(super.aClass100_Sub3_40, 2);
		this.aClass113_5.method2789(0);
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8738(260, 7681);
		super.aClass100_Sub3_40.method8702(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass100_Sub3_40.method8678(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass288_5.aBoolean504) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass113_5.method2790();
		this.aClass113_5.method2789(1);
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8738(8448, 8448);
		super.aClass100_Sub3_40.method8702(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass100_Sub3_40.method8678(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass288_5.aBoolean504) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass113_5.method2790();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		if (super.aClass100_Sub3_40.anInt10292 > 0) {
			@Pc(22) float local22 = -0.5F / (float) super.aClass100_Sub3_40.anInt10292;
			super.aClass100_Sub3_40.method8678(1);
			Static670.aFloatArray53[1] = 0.0F;
			Static670.aFloatArray53[0] = 0.0F;
			Static670.aFloatArray53[2] = local22;
			Static670.aFloatArray53[3] = super.aClass100_Sub3_40.aFloat210 * local22 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static670.aFloatArray53, 0);
			OpenGL.glPopMatrix();
			super.aClass100_Sub3_40.method8682((float) super.aClass100_Sub3_40.anInt10292, 0.5F);
			super.aClass100_Sub3_40.method8743(this.aClass29_Sub4_1);
			super.aClass100_Sub3_40.method8678(0);
		}
		this.aClass113_5.method2793('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_40.method8738(8448, 260);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return true;
	}
}
