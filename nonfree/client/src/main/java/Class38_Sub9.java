import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class38_Sub9 extends Class38 {

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!qf;")
	private final Class198 aClass198_6;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!pb;")
	private final Class184 aClass184_6;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ur;Lclient!qf;)V")
	public Class38_Sub9(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_6 = arg1;
		this.aClass184_6 = new Class184(arg0, 2);
		this.aClass184_6.method4094(0);
		super.aClass34_Sub2_41.method5507(1);
		if (this.aClass198_6.aBoolean630) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass34_Sub2_41.method5507(0);
		this.aClass184_6.method4095();
		this.aClass184_6.method4094(1);
		super.aClass34_Sub2_41.method5507(1);
		if (this.aClass198_6.aBoolean630) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass34_Sub2_41.method5507(0);
		this.aClass184_6.method4095();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		this.aClass184_6.method4096('\u0000');
		if (this.aClass198_6.aBoolean630) {
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5493(this.aClass198_6.aClass10_Sub4_1);
			super.aClass34_Sub2_41.method5507(0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass34_Sub2_41.method5493(arg0);
		super.aClass34_Sub2_41.method5517(arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) float local21 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(32) float local32 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(40) float local40 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass34_Sub2_41.method5507(1);
		@Pc(56) boolean local56 = (arg1 & 0x80) != 0;
		if (local56) {
			Static266.aFloatArray21[3] = 0.0F;
			Static266.aFloatArray21[2] = 0.0F;
			Static266.aFloatArray21[0] = local40;
			Static266.aFloatArray21[1] = 0.0F;
		} else {
			Static266.aFloatArray21[3] = 0.0F;
			Static266.aFloatArray21[1] = 0.0F;
			Static266.aFloatArray21[0] = 0.0F;
			Static266.aFloatArray21[2] = local40;
		}
		OpenGL.glTexGenfv(8192, 9474, Static266.aFloatArray21, 0);
		Static266.aFloatArray21[3] = local21 * (float) super.aClass34_Sub2_41.anInt7073 % 1.0F;
		Static266.aFloatArray21[2] = 0.0F;
		Static266.aFloatArray21[0] = 0.0F;
		Static266.aFloatArray21[1] = local40;
		OpenGL.glTexGenfv(8193, 9474, Static266.aFloatArray21, 0);
		if (this.aClass198_6.aBoolean630) {
			Static266.aFloatArray21[2] = 0.0F;
			Static266.aFloatArray21[1] = 0.0F;
			Static266.aFloatArray21[0] = 0.0F;
			Static266.aFloatArray21[3] = (float) super.aClass34_Sub2_41.anInt7073 * local32 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, Static266.aFloatArray21, 0);
		} else {
			@Pc(139) int local139 = (int) ((float) super.aClass34_Sub2_41.anInt7073 * local32 * 16.0F);
			super.aClass34_Sub2_41.method5493(this.aClass198_6.aClass10_Sub1Array3[local139 % 16]);
		}
		super.aClass34_Sub2_41.method5507(0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		this.aClass184_6.method4096('\u0001');
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5493(null);
		super.aClass34_Sub2_41.method5507(0);
	}
}
