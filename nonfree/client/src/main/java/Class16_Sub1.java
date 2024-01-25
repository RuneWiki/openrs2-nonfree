import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!al", name = "h", descriptor = "Lclient!fo;")
	private Class107 aClass107_1;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!dja;")
	private final Class65 aClass65_1;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Lclient!pea;")
	private final Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ac;Lclient!dja;)V")
	public Class16_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class65 arg1) {
		super(arg0);
		this.aClass65_1 = arg1;
		this.method601();
		this.aClass2_Sub3_1 = new Class2_Sub3(super.aClass5_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass2_Sub3_1.method6626();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		if (super.aClass5_Sub1_42.anInt399 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass5_Sub1_42.anInt399;
			super.aClass5_Sub1_42.method334(1);
			Static71.aFloatArray27[1] = 0.0F;
			Static71.aFloatArray27[2] = local13;
			Static71.aFloatArray27[3] = super.aClass5_Sub1_42.aFloat1 * local13 + 0.25F;
			Static71.aFloatArray27[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static71.aFloatArray27, 0);
			OpenGL.glPopMatrix();
			super.aClass5_Sub1_42.method337(0.5F, (float) super.aClass5_Sub1_42.anInt399);
			super.aClass5_Sub1_42.method352(this.aClass2_Sub3_1);
			super.aClass5_Sub1_42.method334(0);
		}
		this.aClass107_1.method3156('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	private void method601() {
		this.aClass107_1 = new Class107(super.aClass5_Sub1_42, 2);
		this.aClass107_1.method3155(0);
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method388(260, 7681);
		super.aClass5_Sub1_42.method329(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass5_Sub1_42.method334(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass65_1.aBoolean234) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass107_1.method3154();
		this.aClass107_1.method3155(1);
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method388(8448, 8448);
		super.aClass5_Sub1_42.method329(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass5_Sub1_42.method334(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass65_1.aBoolean234) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass107_1.method3154();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass65_1.aBoolean234) {
				super.aClass5_Sub1_42.method352(this.aClass65_1.aClass2_Sub4_2);
				Static71.aFloatArray27[3] = (float) (super.aClass5_Sub1_42.anInt361 % 4000) / 4000.0F;
				Static71.aFloatArray27[0] = 0.0F;
				Static71.aFloatArray27[1] = 0.0F;
				Static71.aFloatArray27[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static71.aFloatArray27, 0);
			} else {
				@Pc(65) int local65 = super.aClass5_Sub1_42.anInt361 % 4000 * 16 / 4000;
				super.aClass5_Sub1_42.method352(this.aClass65_1.aClass2_Sub1Array3[local65]);
			}
		} else if (this.aClass65_1.aBoolean234) {
			super.aClass5_Sub1_42.method352(this.aClass65_1.aClass2_Sub4_2);
			Static71.aFloatArray27[2] = 0.0F;
			Static71.aFloatArray27[3] = 0.0F;
			Static71.aFloatArray27[0] = 0.0F;
			Static71.aFloatArray27[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static71.aFloatArray27, 0);
		} else {
			super.aClass5_Sub1_42.method352(this.aClass65_1.aClass2_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return true;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub1_42.method388(8448, 260);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		this.aClass107_1.method3156('\u0001');
		if (super.aClass5_Sub1_42.anInt399 > 0) {
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method352((Class2) null);
			super.aClass5_Sub1_42.method337(1.0F, 0.0F);
			super.aClass5_Sub1_42.method334(0);
		}
		super.aClass5_Sub1_42.method388(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
	}
}
