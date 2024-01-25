import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "Lclient!hq;")
	private Class149 aClass149_3;

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "Lclient!cd;")
	private final Class45 aClass45_5;

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "Lclient!eja;")
	private final Class94_Sub1 aClass94_Sub1_1;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!dw;Lclient!cd;)V")
	public Class6_Sub4(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class45 arg1) {
		super(arg0);
		this.aClass45_5 = arg1;
		this.method5302();
		this.aClass94_Sub1_1 = new Class94_Sub1(super.aClass82_Sub1_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass94_Sub1_1.method2345();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		this.aClass149_3.method3804('\u0001');
		if (super.aClass82_Sub1_41.anInt2504 > 0) {
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2029((Class94) null);
			super.aClass82_Sub1_41.method2080(0.0F, 1.0F);
			super.aClass82_Sub1_41.method2086(0);
		}
		super.aClass82_Sub1_41.method2077(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		if (super.aClass82_Sub1_41.anInt2504 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass82_Sub1_41.anInt2504;
			super.aClass82_Sub1_41.method2086(1);
			Static499.aFloatArray87[1] = 0.0F;
			Static499.aFloatArray87[0] = 0.0F;
			Static499.aFloatArray87[3] = local17 * super.aClass82_Sub1_41.aFloat38 + 0.25F;
			Static499.aFloatArray87[2] = local17;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static499.aFloatArray87, 0);
			OpenGL.glPopMatrix();
			super.aClass82_Sub1_41.method2080((float) super.aClass82_Sub1_41.anInt2504, 0.5F);
			super.aClass82_Sub1_41.method2029(this.aClass94_Sub1_1);
			super.aClass82_Sub1_41.method2086(0);
		}
		this.aClass149_3.method3804('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass45_5.aBoolean58) {
				super.aClass82_Sub1_41.method2029(this.aClass45_5.aClass94_Sub3_2);
				Static499.aFloatArray87[0] = 0.0F;
				Static499.aFloatArray87[3] = (float) (super.aClass82_Sub1_41.anInt2463 % 4000) / 4000.0F;
				Static499.aFloatArray87[2] = 0.0F;
				Static499.aFloatArray87[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static499.aFloatArray87, 0);
			} else {
				@Pc(106) int local106 = super.aClass82_Sub1_41.anInt2463 % 4000 * 16 / 4000;
				super.aClass82_Sub1_41.method2029(this.aClass45_5.aClass94_Sub2Array2[local106]);
			}
		} else if (this.aClass45_5.aBoolean58) {
			super.aClass82_Sub1_41.method2029(this.aClass45_5.aClass94_Sub3_2);
			Static499.aFloatArray87[2] = 0.0F;
			Static499.aFloatArray87[1] = 0.0F;
			Static499.aFloatArray87[3] = 0.0F;
			Static499.aFloatArray87[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static499.aFloatArray87, 0);
		} else {
			super.aClass82_Sub1_41.method2029(this.aClass45_5.aClass94_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
		super.aClass82_Sub1_41.method2077(260, 8448);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	private void method5302() {
		this.aClass149_3 = new Class149(super.aClass82_Sub1_41, 2);
		this.aClass149_3.method3800(0);
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2077(7681, 260);
		super.aClass82_Sub1_41.method2066(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass82_Sub1_41.method2086(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass45_5.aBoolean58) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass149_3.method3803();
		this.aClass149_3.method3800(1);
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2077(8448, 8448);
		super.aClass82_Sub1_41.method2066(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass82_Sub1_41.method2086(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass45_5.aBoolean58) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass149_3.method3803();
	}
}
