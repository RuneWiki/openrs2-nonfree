import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class93_Sub5 extends Class93 {

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "Lclient!km;")
	private final Class162 aClass162_2;

	@OriginalMember(owner = "client!pca", name = "q", descriptor = "Lclient!ni;")
	private final Class201 aClass201_4;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!os;Lclient!km;)V")
	public Class93_Sub5(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_2 = arg1;
		this.aClass201_4 = new Class201(arg0, 2);
		this.aClass201_4.method5135(0);
		super.aClass39_Sub3_40.method5750(1);
		if (this.aClass162_2.aBoolean337) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass39_Sub3_40.method5750(0);
		this.aClass201_4.method5136();
		this.aClass201_4.method5135(1);
		super.aClass39_Sub3_40.method5750(1);
		if (this.aClass162_2.aBoolean337) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass39_Sub3_40.method5750(0);
		this.aClass201_4.method5136();
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7490() {
		return true;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
		this.aClass201_4.method5132('\u0000');
		if (this.aClass162_2.aBoolean337) {
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5719(this.aClass162_2.aClass19_Sub4_2);
			super.aClass39_Sub3_40.method5750(0);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!baa;IB)V")
	@Override
	public void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub3_40.method5719(arg0);
		super.aClass39_Sub3_40.method5699(arg1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	@Override
	public void method7494() {
		this.aClass201_4.method5132('\u0001');
		super.aClass39_Sub3_40.method5750(1);
		super.aClass39_Sub3_40.method5719(null);
		super.aClass39_Sub3_40.method5750(0);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		super.aClass39_Sub3_40.method5750(1);
		if (local49) {
			Static325.aFloatArray36[1] = 0.0F;
			Static325.aFloatArray36[2] = 0.0F;
			Static325.aFloatArray36[3] = 0.0F;
			Static325.aFloatArray36[0] = local36;
		} else {
			Static325.aFloatArray36[3] = 0.0F;
			Static325.aFloatArray36[0] = 0.0F;
			Static325.aFloatArray36[1] = 0.0F;
			Static325.aFloatArray36[2] = local36;
		}
		OpenGL.glTexGenfv(8192, 9474, Static325.aFloatArray36, 0);
		Static325.aFloatArray36[0] = 0.0F;
		Static325.aFloatArray36[2] = 0.0F;
		Static325.aFloatArray36[1] = local36;
		Static325.aFloatArray36[3] = (float) super.aClass39_Sub3_40.anInt6717 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static325.aFloatArray36, 0);
		if (this.aClass162_2.aBoolean337) {
			Static325.aFloatArray36[0] = 0.0F;
			Static325.aFloatArray36[1] = 0.0F;
			Static325.aFloatArray36[3] = (float) super.aClass39_Sub3_40.anInt6717 * local25 % 1.0F;
			Static325.aFloatArray36[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static325.aFloatArray36, 0);
		} else {
			@Pc(167) int local167 = (int) (local25 * 16.0F * (float) super.aClass39_Sub3_40.anInt6717);
			super.aClass39_Sub3_40.method5719(this.aClass162_2.aClass19_Sub2Array2[local167 % 16]);
		}
		super.aClass39_Sub3_40.method5750(0);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7493(@OriginalArg(1) boolean arg0) {
	}
}
