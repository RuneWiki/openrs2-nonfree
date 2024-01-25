import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class42_Sub7 extends Class42 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!bq;")
	private Class41 aClass41_4;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "Lclient!al;")
	private final Class14 aClass14_6;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Lclient!bs;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!uca;Lclient!al;)V")
	public Class42_Sub7(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class14 arg1) {
		super(arg0);
		this.aClass14_6 = arg1;
		this.method6286();
		this.aClass3_Sub2_1 = new Class3_Sub2(super.aClass162_Sub3_44, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass3_Sub2_1.method856();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		if (super.aClass162_Sub3_44.anInt8701 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass162_Sub3_44.anInt8701;
			super.aClass162_Sub3_44.method6947(1);
			Static378.aFloatArray50[3] = super.aClass162_Sub3_44.aFloat229 * local10 + 0.25F;
			Static378.aFloatArray50[1] = 0.0F;
			Static378.aFloatArray50[0] = 0.0F;
			Static378.aFloatArray50[2] = local10;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static378.aFloatArray50, 0);
			OpenGL.glPopMatrix();
			super.aClass162_Sub3_44.method6939((float) super.aClass162_Sub3_44.anInt8701, 0.5F);
			super.aClass162_Sub3_44.method6911(this.aClass3_Sub2_1);
			super.aClass162_Sub3_44.method6947(0);
		}
		this.aClass41_4.method821('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		this.aClass41_4.method821('\u0001');
		if (super.aClass162_Sub3_44.anInt8701 > 0) {
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6911(null);
			super.aClass162_Sub3_44.method6939(0.0F, 1.0F);
			super.aClass162_Sub3_44.method6947(0);
		}
		super.aClass162_Sub3_44.method6903(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass14_6.aBoolean25) {
				super.aClass162_Sub3_44.method6911(this.aClass14_6.aClass3_Sub4_3);
				Static378.aFloatArray50[3] = (float) (super.aClass162_Sub3_44.anInt8686 % 4000) / 4000.0F;
				Static378.aFloatArray50[0] = 0.0F;
				Static378.aFloatArray50[2] = 0.0F;
				Static378.aFloatArray50[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static378.aFloatArray50, 0);
			} else {
				@Pc(109) int local109 = super.aClass162_Sub3_44.anInt8686 % 4000 * 16 / 4000;
				super.aClass162_Sub3_44.method6911(this.aClass14_6.aClass3_Sub1Array2[local109]);
			}
		} else if (this.aClass14_6.aBoolean25) {
			super.aClass162_Sub3_44.method6911(this.aClass14_6.aClass3_Sub4_3);
			Static378.aFloatArray50[0] = 0.0F;
			Static378.aFloatArray50[3] = 0.0F;
			Static378.aFloatArray50[2] = 0.0F;
			Static378.aFloatArray50[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static378.aFloatArray50, 0);
		} else {
			super.aClass162_Sub3_44.method6911(this.aClass14_6.aClass3_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub3_44.method6903(260, 8448);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	private void method6286() {
		this.aClass41_4 = new Class41(super.aClass162_Sub3_44, 2);
		this.aClass41_4.method823(0);
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6903(7681, 260);
		super.aClass162_Sub3_44.method6957(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass162_Sub3_44.method6947(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass14_6.aBoolean25) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass41_4.method822();
		this.aClass41_4.method823(1);
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6903(8448, 8448);
		super.aClass162_Sub3_44.method6957(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass162_Sub3_44.method6947(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass14_6.aBoolean25) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass41_4.method822();
	}
}
