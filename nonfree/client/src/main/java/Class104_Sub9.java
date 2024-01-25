import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class104_Sub9 extends Class104 {

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!gq;")
	private Class121 aClass121_5;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "Lclient!um;")
	private final Class319 aClass319_6;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Lclient!mk;")
	private final Class132_Sub3 aClass132_Sub3_1;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!ap;Lclient!um;)V")
	public Class104_Sub9(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_6 = arg1;
		this.method7877();
		this.aClass132_Sub3_1 = new Class132_Sub3(super.aClass9_Sub2_40, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass132_Sub3_1.method5241();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	@Override
	public void method7868() {
		this.aClass121_5.method3522('\u0001');
		if (super.aClass9_Sub2_40.anInt827 > 0) {
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method814(null);
			super.aClass9_Sub2_40.method785(1.0F, 0.0F);
			super.aClass9_Sub2_40.method806(0);
		}
		super.aClass9_Sub2_40.method797(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7867(@OriginalArg(0) boolean arg0) {
		if (super.aClass9_Sub2_40.anInt827 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass9_Sub2_40.anInt827;
			super.aClass9_Sub2_40.method806(1);
			Static222.aFloatArray33[2] = local10;
			Static222.aFloatArray33[3] = super.aClass9_Sub2_40.aFloat19 * local10 + 0.25F;
			Static222.aFloatArray33[1] = 0.0F;
			Static222.aFloatArray33[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static222.aFloatArray33, 0);
			OpenGL.glPopMatrix();
			super.aClass9_Sub2_40.method785(0.5F, (float) super.aClass9_Sub2_40.anInt827);
			super.aClass9_Sub2_40.method814(this.aClass132_Sub3_1);
			super.aClass9_Sub2_40.method806(0);
		}
		this.aClass121_5.method3522('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!uda;)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
	private void method7877() {
		this.aClass121_5 = new Class121(super.aClass9_Sub2_40, 2);
		this.aClass121_5.method3523(0);
		super.aClass9_Sub2_40.method806(1);
		super.aClass9_Sub2_40.method797(7681, 260);
		super.aClass9_Sub2_40.method798(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass9_Sub2_40.method806(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass319_6.aBoolean683) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass121_5.method3524();
		this.aClass121_5.method3523(1);
		super.aClass9_Sub2_40.method806(1);
		super.aClass9_Sub2_40.method797(8448, 8448);
		super.aClass9_Sub2_40.method798(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass9_Sub2_40.method806(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass319_6.aBoolean683) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass121_5.method3524();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass319_6.aBoolean683) {
				super.aClass9_Sub2_40.method814(this.aClass319_6.aClass132_Sub2_2);
				Static222.aFloatArray33[0] = 0.0F;
				Static222.aFloatArray33[1] = 0.0F;
				Static222.aFloatArray33[3] = (float) (super.aClass9_Sub2_40.anInt810 % 4000) / 4000.0F;
				Static222.aFloatArray33[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static222.aFloatArray33, 0);
			} else {
				@Pc(105) int local105 = super.aClass9_Sub2_40.anInt810 % 4000 * 16 / 4000;
				super.aClass9_Sub2_40.method814(this.aClass319_6.aClass132_Sub1Array3[local105]);
			}
		} else if (this.aClass319_6.aBoolean683) {
			super.aClass9_Sub2_40.method814(this.aClass319_6.aClass132_Sub2_2);
			Static222.aFloatArray33[3] = 0.0F;
			Static222.aFloatArray33[1] = 0.0F;
			Static222.aFloatArray33[2] = 0.0F;
			Static222.aFloatArray33[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static222.aFloatArray33, 0);
		} else {
			super.aClass9_Sub2_40.method814(this.aClass319_6.aClass132_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7871(@OriginalArg(1) boolean arg0) {
		super.aClass9_Sub2_40.method797(260, 8448);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7865() {
		return true;
	}
}
