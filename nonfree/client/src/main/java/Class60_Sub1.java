import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!daa", name = "o", descriptor = "Lclient!dk;")
	private final Class69 aClass69_1;

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "Lclient!qda;")
	private final Class266 aClass266_1;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!jaa;Lclient!dk;)V")
	public Class60_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class69 arg1) {
		super(arg0);
		this.aClass69_1 = arg1;
		this.aClass266_1 = new Class266(arg0, 2);
		this.aClass266_1.method5983(0);
		super.aClass14_Sub3_42.method3917(1);
		if (this.aClass69_1.aBoolean127) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass14_Sub3_42.method3917(0);
		this.aClass266_1.method5989();
		this.aClass266_1.method5983(1);
		super.aClass14_Sub3_42.method3917(1);
		if (this.aClass69_1.aBoolean127) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass14_Sub3_42.method3917(0);
		this.aClass266_1.method5989();
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		this.aClass266_1.method5987('\u0000');
		if (this.aClass69_1.aBoolean127) {
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3985(this.aClass69_1.aClass51_Sub2_2);
			super.aClass14_Sub3_42.method3917(0);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		super.aClass14_Sub3_42.method3985(arg1);
		super.aClass14_Sub3_42.method3925(arg0);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(42) float local42 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(53) boolean local53 = (arg0 & 0x80) != 0;
		super.aClass14_Sub3_42.method3917(1);
		if (local53) {
			Static373.aFloatArray54[0] = local42;
			Static373.aFloatArray54[3] = 0.0F;
			Static373.aFloatArray54[2] = 0.0F;
			Static373.aFloatArray54[1] = 0.0F;
		} else {
			Static373.aFloatArray54[0] = 0.0F;
			Static373.aFloatArray54[2] = local42;
			Static373.aFloatArray54[3] = 0.0F;
			Static373.aFloatArray54[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static373.aFloatArray54, 0);
		Static373.aFloatArray54[3] = (float) super.aClass14_Sub3_42.anInt4557 * local14 % 1.0F;
		Static373.aFloatArray54[0] = 0.0F;
		Static373.aFloatArray54[2] = 0.0F;
		Static373.aFloatArray54[1] = local42;
		OpenGL.glTexGenfv(8193, 9474, Static373.aFloatArray54, 0);
		if (this.aClass69_1.aBoolean127) {
			Static373.aFloatArray54[3] = local25 * (float) super.aClass14_Sub3_42.anInt4557 % 1.0F;
			Static373.aFloatArray54[1] = 0.0F;
			Static373.aFloatArray54[2] = 0.0F;
			Static373.aFloatArray54[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static373.aFloatArray54, 0);
		} else {
			@Pc(171) int local171 = (int) ((float) super.aClass14_Sub3_42.anInt4557 * local25 * 16.0F);
			super.aClass14_Sub3_42.method3985(this.aClass69_1.aClass51_Sub1Array2[local171 % 16]);
		}
		super.aClass14_Sub3_42.method3917(0);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		this.aClass266_1.method5987('\u0001');
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3985(null);
		super.aClass14_Sub3_42.method3917(0);
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return true;
	}
}
