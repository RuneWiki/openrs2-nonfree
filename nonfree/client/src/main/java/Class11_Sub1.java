import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!jga;")
	private final Class161 aClass161_1;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!jr;")
	private final Class164 aClass164_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!wh;Lclient!jga;)V")
	public Class11_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class161 arg1) {
		super(arg0);
		this.aClass161_1 = arg1;
		this.aClass164_1 = new Class164(arg0, 2);
		this.aClass164_1.method4791(0);
		super.aClass100_Sub3_41.method8861(1);
		if (this.aClass161_1.aBoolean354) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass100_Sub3_41.method8861(0);
		this.aClass164_1.method4790();
		this.aClass164_1.method4791(1);
		super.aClass100_Sub3_41.method8861(1);
		if (this.aClass161_1.aBoolean354) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass100_Sub3_41.method8861(0);
		this.aClass164_1.method4790();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		this.aClass164_1.method4788('\u0000');
		if (this.aClass161_1.aBoolean354) {
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8925(this.aClass161_1.aClass3_Sub3_1);
			super.aClass100_Sub3_41.method8861(0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub3_41.method8925(arg0);
		super.aClass100_Sub3_41.method8903(arg1);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		this.aClass164_1.method4788('\u0001');
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8925((Class3) null);
		super.aClass100_Sub3_41.method8861(0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		super.aClass100_Sub3_41.method8861(1);
		if (local47) {
			Static144.aFloatArray17[2] = 0.0F;
			Static144.aFloatArray17[1] = 0.0F;
			Static144.aFloatArray17[0] = local36;
			Static144.aFloatArray17[3] = 0.0F;
		} else {
			Static144.aFloatArray17[3] = 0.0F;
			Static144.aFloatArray17[0] = 0.0F;
			Static144.aFloatArray17[2] = local36;
			Static144.aFloatArray17[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static144.aFloatArray17, 0);
		Static144.aFloatArray17[0] = 0.0F;
		Static144.aFloatArray17[1] = local36;
		Static144.aFloatArray17[3] = local14 * (float) super.aClass100_Sub3_41.anInt10585 % 1.0F;
		Static144.aFloatArray17[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static144.aFloatArray17, 0);
		if (this.aClass161_1.aBoolean354) {
			Static144.aFloatArray17[2] = 0.0F;
			Static144.aFloatArray17[3] = (float) super.aClass100_Sub3_41.anInt10585 * local25 % 1.0F;
			Static144.aFloatArray17[0] = 0.0F;
			Static144.aFloatArray17[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static144.aFloatArray17, 0);
		} else {
			@Pc(165) int local165 = (int) ((float) super.aClass100_Sub3_41.anInt10585 * local25 * 16.0F);
			super.aClass100_Sub3_41.method8925(this.aClass161_1.aClass3_Sub2Array3[local165 % 16]);
		}
		super.aClass100_Sub3_41.method8861(0);
	}
}
