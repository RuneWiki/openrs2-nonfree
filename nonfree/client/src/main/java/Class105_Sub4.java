import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class105_Sub4 extends Class105 {

	@OriginalMember(owner = "client!iea", name = "x", descriptor = "Lclient!uq;")
	private Class334 aClass334_2;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "Lclient!ul;")
	private final Class330 aClass330_3;

	@OriginalMember(owner = "client!iea", name = "s", descriptor = "Lclient!aaa;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!kfa;Lclient!ul;)V")
	public Class105_Sub4(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class330 arg1) {
		super(arg0);
		this.aClass330_3 = arg1;
		this.method3494();
		this.aClass3_Sub1_1 = new Class3_Sub1(super.aClass7_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass3_Sub1_1.method34();
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass330_3.aBoolean660) {
				super.aClass7_Sub2_41.method4313(this.aClass330_3.aClass3_Sub3_1);
				Static28.aFloatArray19[1] = 0.0F;
				Static28.aFloatArray19[0] = 0.0F;
				Static28.aFloatArray19[3] = (float) (super.aClass7_Sub2_41.anInt5597 % 4000) / 4000.0F;
				Static28.aFloatArray19[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static28.aFloatArray19, 0);
			} else {
				@Pc(103) int local103 = super.aClass7_Sub2_41.anInt5597 % 4000 * 16 / 4000;
				super.aClass7_Sub2_41.method4313(this.aClass330_3.aClass3_Sub2Array4[local103]);
			}
		} else if (this.aClass330_3.aBoolean660) {
			super.aClass7_Sub2_41.method4313(this.aClass330_3.aClass3_Sub3_1);
			Static28.aFloatArray19[1] = 0.0F;
			Static28.aFloatArray19[2] = 0.0F;
			Static28.aFloatArray19[3] = 0.0F;
			Static28.aFloatArray19[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static28.aFloatArray19, 0);
		} else {
			super.aClass7_Sub2_41.method4313(this.aClass330_3.aClass3_Sub2Array4[0]);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
		super.aClass7_Sub2_41.method4346(260, 8448);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return true;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		if (super.aClass7_Sub2_41.anInt5616 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass7_Sub2_41.anInt5616;
			super.aClass7_Sub2_41.method4326(1);
			Static28.aFloatArray19[1] = 0.0F;
			Static28.aFloatArray19[3] = super.aClass7_Sub2_41.aFloat139 * local13 + 0.25F;
			Static28.aFloatArray19[2] = local13;
			Static28.aFloatArray19[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static28.aFloatArray19, 0);
			OpenGL.glPopMatrix();
			super.aClass7_Sub2_41.method4307((float) super.aClass7_Sub2_41.anInt5616, 0.5F);
			super.aClass7_Sub2_41.method4313(this.aClass3_Sub1_1);
			super.aClass7_Sub2_41.method4326(0);
		}
		this.aClass334_2.method7575('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		this.aClass334_2.method7575('\u0001');
		if (super.aClass7_Sub2_41.anInt5616 > 0) {
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4313(null);
			super.aClass7_Sub2_41.method4307(0.0F, 1.0F);
			super.aClass7_Sub2_41.method4326(0);
		}
		super.aClass7_Sub2_41.method4346(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
	private void method3494() {
		this.aClass334_2 = new Class334(super.aClass7_Sub2_41, 2);
		this.aClass334_2.method7573(0);
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4346(7681, 260);
		super.aClass7_Sub2_41.method4280(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass7_Sub2_41.method4326(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass330_3.aBoolean660) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass334_2.method7574();
		this.aClass334_2.method7573(1);
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4346(8448, 8448);
		super.aClass7_Sub2_41.method4280(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass7_Sub2_41.method4326(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass330_3.aBoolean660) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass334_2.method7574();
	}
}
