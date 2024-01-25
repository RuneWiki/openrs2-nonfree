import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class34_Sub5 extends Class34 {

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "Lclient!vi;")
	private Class360 aClass360_5;

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "Lclient!lba;")
	private final Class201 aClass201_3;

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "Lclient!b;")
	private final Class24_Sub1 aClass24_Sub1_1;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!rda;Lclient!lba;)V")
	public Class34_Sub5(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_3 = arg1;
		this.method4960();
		this.aClass24_Sub1_1 = new Class24_Sub1(super.aClass126_Sub3_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass24_Sub1_1.method574();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		if (super.aClass126_Sub3_39.anInt8308 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass126_Sub3_39.anInt8308;
			super.aClass126_Sub3_39.method7104(1);
			Static430.aFloatArray64[2] = local13;
			Static430.aFloatArray64[0] = 0.0F;
			Static430.aFloatArray64[1] = 0.0F;
			Static430.aFloatArray64[3] = local13 * super.aClass126_Sub3_39.aFloat162 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static430.aFloatArray64, 0);
			OpenGL.glPopMatrix();
			super.aClass126_Sub3_39.method7075(0.5F, (float) super.aClass126_Sub3_39.anInt8308);
			super.aClass126_Sub3_39.method7113(this.aClass24_Sub1_1);
			super.aClass126_Sub3_39.method7104(0);
		}
		this.aClass360_5.method8434('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return true;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)V")
	private void method4960() {
		this.aClass360_5 = new Class360(super.aClass126_Sub3_39, 2);
		this.aClass360_5.method8433(0);
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7082(260, 7681);
		super.aClass126_Sub3_39.method7135(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass126_Sub3_39.method7104(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass201_3.aBoolean465) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass360_5.method8436();
		this.aClass360_5.method8433(1);
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7082(8448, 8448);
		super.aClass126_Sub3_39.method7135(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass126_Sub3_39.method7104(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass201_3.aBoolean465) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass360_5.method8436();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		this.aClass360_5.method8434('\u0001');
		if (super.aClass126_Sub3_39.anInt8308 > 0) {
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7113((Class24) null);
			super.aClass126_Sub3_39.method7075(1.0F, 0.0F);
			super.aClass126_Sub3_39.method7104(0);
		}
		super.aClass126_Sub3_39.method7082(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass201_3.aBoolean465) {
				super.aClass126_Sub3_39.method7113(this.aClass201_3.aClass24_Sub2_3);
				Static430.aFloatArray64[3] = (float) (super.aClass126_Sub3_39.anInt8272 % 4000) / 4000.0F;
				Static430.aFloatArray64[2] = 0.0F;
				Static430.aFloatArray64[1] = 0.0F;
				Static430.aFloatArray64[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static430.aFloatArray64, 0);
			} else {
				@Pc(68) int local68 = super.aClass126_Sub3_39.anInt8272 % 4000 * 16 / 4000;
				super.aClass126_Sub3_39.method7113(this.aClass201_3.aClass24_Sub4Array2[local68]);
			}
		} else if (this.aClass201_3.aBoolean465) {
			super.aClass126_Sub3_39.method7113(this.aClass201_3.aClass24_Sub2_3);
			Static430.aFloatArray64[1] = 0.0F;
			Static430.aFloatArray64[3] = 0.0F;
			Static430.aFloatArray64[0] = 0.0F;
			Static430.aFloatArray64[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static430.aFloatArray64, 0);
		} else {
			super.aClass126_Sub3_39.method7113(this.aClass201_3.aClass24_Sub4Array2[0]);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
		super.aClass126_Sub3_39.method7082(8448, 260);
	}
}
