import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class93_Sub9 extends Class93 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!ni;")
	private Class201 aClass201_6;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "Lclient!km;")
	private final Class162 aClass162_5;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "Lclient!mo;")
	private final Class19_Sub3 aClass19_Sub3_1;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!os;Lclient!km;)V")
	public Class93_Sub9(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_5 = arg1;
		this.method7500();
		this.aClass19_Sub3_1 = new Class19_Sub3(super.aClass39_Sub3_40, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass19_Sub3_1.method4762();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!baa;IB)V")
	@Override
	public void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	@Override
	public void method7494() {
		this.aClass201_6.method5132('\u0001');
		if (super.aClass39_Sub3_40.anInt6756 > 0) {
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5719(null);
			super.aClass39_Sub3_40.method5698(0.0F, 1.0F);
			super.aClass39_Sub3_40.method5750(0);
		}
		super.aClass39_Sub3_40.method5760(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass162_5.aBoolean337) {
				super.aClass39_Sub3_40.method5719(this.aClass162_5.aClass19_Sub4_3);
				Static517.aFloatArray72[0] = 0.0F;
				Static517.aFloatArray72[3] = (float) (super.aClass39_Sub3_40.anInt6717 % 4000) / 4000.0F;
				Static517.aFloatArray72[2] = 0.0F;
				Static517.aFloatArray72[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static517.aFloatArray72, 0);
			} else {
				@Pc(104) int local104 = super.aClass39_Sub3_40.anInt6717 % 4000 * 16 / 4000;
				super.aClass39_Sub3_40.method5719(this.aClass162_5.aClass19_Sub2Array3[local104]);
			}
		} else if (this.aClass162_5.aBoolean337) {
			super.aClass39_Sub3_40.method5719(this.aClass162_5.aClass19_Sub4_3);
			Static517.aFloatArray72[0] = 0.0F;
			Static517.aFloatArray72[1] = 0.0F;
			Static517.aFloatArray72[3] = 0.0F;
			Static517.aFloatArray72[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static517.aFloatArray72, 0);
		} else {
			super.aClass39_Sub3_40.method5719(this.aClass162_5.aClass19_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
		if (super.aClass39_Sub3_40.anInt6756 > 0) {
			@Pc(25) float local25 = -0.5F / (float) super.aClass39_Sub3_40.anInt6756;
			super.aClass39_Sub3_40.method5750(1);
			Static517.aFloatArray72[2] = local25;
			Static517.aFloatArray72[3] = super.aClass39_Sub3_40.aFloat155 * local25 + 0.25F;
			Static517.aFloatArray72[0] = 0.0F;
			Static517.aFloatArray72[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static517.aFloatArray72, 0);
			OpenGL.glPopMatrix();
			super.aClass39_Sub3_40.method5698((float) super.aClass39_Sub3_40.anInt6756, 0.5F);
			super.aClass39_Sub3_40.method5719(this.aClass19_Sub3_1);
			super.aClass39_Sub3_40.method5750(0);
		}
		this.aClass201_6.method5132('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V")
	private void method7500() {
		this.aClass201_6 = new Class201(super.aClass39_Sub3_40, 2);
		this.aClass201_6.method5135(0);
		super.aClass39_Sub3_40.method5750(1);
		super.aClass39_Sub3_40.method5760(7681, 260);
		super.aClass39_Sub3_40.method5709(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass39_Sub3_40.method5750(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass162_5.aBoolean337) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass201_6.method5136();
		this.aClass201_6.method5135(1);
		super.aClass39_Sub3_40.method5750(1);
		super.aClass39_Sub3_40.method5760(8448, 8448);
		super.aClass39_Sub3_40.method5709(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass39_Sub3_40.method5750(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass162_5.aBoolean337) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass201_6.method5136();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7493(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub3_40.method5760(260, 8448);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7490() {
		return true;
	}
}
