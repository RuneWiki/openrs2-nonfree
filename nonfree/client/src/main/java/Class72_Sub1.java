import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "Lclient!po;")
	private final Class194 aClass194_2;

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "Lclient!sc;")
	private final Class223 aClass223_1;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!vj;Lclient!po;)V")
	public Class72_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class194 arg1) {
		super(arg0);
		this.aClass194_2 = arg1;
		this.aClass223_1 = new Class223(arg0, 2);
		this.aClass223_1.method4786(0);
		super.aClass172_Sub2_43.method5569(1);
		if (this.aClass194_2.aBoolean474) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass172_Sub2_43.method5569(0);
		this.aClass223_1.method4784();
		this.aClass223_1.method4786(1);
		super.aClass172_Sub2_43.method5569(1);
		if (this.aClass194_2.aBoolean474) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass172_Sub2_43.method5569(0);
		this.aClass223_1.method4784();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass172_Sub2_43.method5569(1);
		@Pc(49) boolean local49 = (arg0 & 0x80) != 0;
		if (local49) {
			Static143.aFloatArray4[3] = 0.0F;
			Static143.aFloatArray4[1] = 0.0F;
			Static143.aFloatArray4[0] = local33;
			Static143.aFloatArray4[2] = 0.0F;
		} else {
			Static143.aFloatArray4[3] = 0.0F;
			Static143.aFloatArray4[0] = 0.0F;
			Static143.aFloatArray4[1] = 0.0F;
			Static143.aFloatArray4[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static143.aFloatArray4, 0);
		Static143.aFloatArray4[3] = (float) super.aClass172_Sub2_43.anInt7161 * local14 % 1.0F;
		Static143.aFloatArray4[0] = 0.0F;
		Static143.aFloatArray4[1] = local33;
		Static143.aFloatArray4[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static143.aFloatArray4, 0);
		if (this.aClass194_2.aBoolean474) {
			Static143.aFloatArray4[0] = 0.0F;
			Static143.aFloatArray4[2] = 0.0F;
			Static143.aFloatArray4[3] = local25 * (float) super.aClass172_Sub2_43.anInt7161 % 1.0F;
			Static143.aFloatArray4[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static143.aFloatArray4, 0);
		} else {
			@Pc(132) int local132 = (int) (local25 * (float) super.aClass172_Sub2_43.anInt7161 * 16.0F);
			super.aClass172_Sub2_43.method5630(this.aClass194_2.aClass112_Sub2Array2[local132 % 16]);
		}
		super.aClass172_Sub2_43.method5569(0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		this.aClass223_1.method4785('\u0000');
		if (this.aClass194_2.aBoolean474) {
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5630(this.aClass194_2.aClass112_Sub1_3);
			super.aClass172_Sub2_43.method5569(0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		this.aClass223_1.method4785('\u0001');
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5630(null);
		super.aClass172_Sub2_43.method5569(0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
		super.aClass172_Sub2_43.method5630(arg1);
		super.aClass172_Sub2_43.method5629(arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
	}
}
