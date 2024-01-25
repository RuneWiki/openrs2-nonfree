import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class34_Sub9 extends Class34 {

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!lba;")
	private final Class201 aClass201_5;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Lclient!vi;")
	private final Class360 aClass360_6;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!rda;Lclient!lba;)V")
	public Class34_Sub9(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_5 = arg1;
		this.aClass360_6 = new Class360(arg0, 2);
		this.aClass360_6.method8433(0);
		super.aClass126_Sub3_39.method7104(1);
		if (this.aClass201_5.aBoolean465) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass126_Sub3_39.method7104(0);
		this.aClass360_6.method8436();
		this.aClass360_6.method8433(1);
		super.aClass126_Sub3_39.method7104(1);
		if (this.aClass201_5.aBoolean465) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass126_Sub3_39.method7104(0);
		this.aClass360_6.method8436();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		super.aClass126_Sub3_39.method7104(1);
		if (local44) {
			Static14.aFloatArray1[3] = 0.0F;
			Static14.aFloatArray1[1] = 0.0F;
			Static14.aFloatArray1[2] = 0.0F;
			Static14.aFloatArray1[0] = local33;
		} else {
			Static14.aFloatArray1[0] = 0.0F;
			Static14.aFloatArray1[1] = 0.0F;
			Static14.aFloatArray1[3] = 0.0F;
			Static14.aFloatArray1[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static14.aFloatArray1, 0);
		Static14.aFloatArray1[2] = 0.0F;
		Static14.aFloatArray1[3] = local14 * (float) super.aClass126_Sub3_39.anInt8272 % 1.0F;
		Static14.aFloatArray1[1] = local33;
		Static14.aFloatArray1[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static14.aFloatArray1, 0);
		if (this.aClass201_5.aBoolean465) {
			Static14.aFloatArray1[2] = 0.0F;
			Static14.aFloatArray1[0] = 0.0F;
			Static14.aFloatArray1[3] = (float) super.aClass126_Sub3_39.anInt8272 * local25 % 1.0F;
			Static14.aFloatArray1[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static14.aFloatArray1, 0);
		} else {
			@Pc(170) int local170 = (int) ((float) super.aClass126_Sub3_39.anInt8272 * 16.0F * local25);
			super.aClass126_Sub3_39.method7113(this.aClass201_5.aClass24_Sub4Array1[local170 % 16]);
		}
		super.aClass126_Sub3_39.method7104(0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		this.aClass360_6.method8434('\u0001');
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113((Class24) null);
		super.aClass126_Sub3_39.method7104(0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass126_Sub3_39.method7113(arg1);
		super.aClass126_Sub3_39.method7105(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return true;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		this.aClass360_6.method8434('\u0000');
		if (this.aClass201_5.aBoolean465) {
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7113(this.aClass201_5.aClass24_Sub2_2);
			super.aClass126_Sub3_39.method7104(0);
		}
	}
}
