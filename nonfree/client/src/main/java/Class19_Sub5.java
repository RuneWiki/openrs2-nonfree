import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class19_Sub5 extends Class19 {

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Lclient!lc;")
	private final Class189 aClass189_3;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "Lclient!jv;")
	private final Class170 aClass170_2;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!qo;Lclient!lc;)V")
	public Class19_Sub5(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class189 arg1) {
		super(arg0);
		this.aClass189_3 = arg1;
		this.aClass170_2 = new Class170(arg0, 2);
		this.aClass170_2.method5087(0);
		super.aClass20_Sub3_42.method7325(1);
		if (this.aClass189_3.aBoolean483) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass20_Sub3_42.method7325(0);
		this.aClass170_2.method5083();
		this.aClass170_2.method5087(1);
		super.aClass20_Sub3_42.method7325(1);
		if (this.aClass189_3.aBoolean483) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass20_Sub3_42.method7325(0);
		this.aClass170_2.method5083();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(44) boolean local44 = (arg0 & 0x80) != 0;
		super.aClass20_Sub3_42.method7325(1);
		if (local44) {
			Static344.aFloatArray57[1] = 0.0F;
			Static344.aFloatArray57[0] = local36;
			Static344.aFloatArray57[3] = 0.0F;
			Static344.aFloatArray57[2] = 0.0F;
		} else {
			Static344.aFloatArray57[1] = 0.0F;
			Static344.aFloatArray57[0] = 0.0F;
			Static344.aFloatArray57[2] = local36;
			Static344.aFloatArray57[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static344.aFloatArray57, 0);
		Static344.aFloatArray57[0] = 0.0F;
		Static344.aFloatArray57[1] = local36;
		Static344.aFloatArray57[3] = local14 * (float) super.aClass20_Sub3_42.anInt8773 % 1.0F;
		Static344.aFloatArray57[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static344.aFloatArray57, 0);
		if (this.aClass189_3.aBoolean483) {
			Static344.aFloatArray57[0] = 0.0F;
			Static344.aFloatArray57[3] = (float) super.aClass20_Sub3_42.anInt8773 * local25 % 1.0F;
			Static344.aFloatArray57[2] = 0.0F;
			Static344.aFloatArray57[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static344.aFloatArray57, 0);
		} else {
			@Pc(170) int local170 = (int) ((float) super.aClass20_Sub3_42.anInt8773 * 16.0F * local25);
			super.aClass20_Sub3_42.method7358(this.aClass189_3.aClass85_Sub1Array3[local170 % 16]);
		}
		super.aClass20_Sub3_42.method7325(0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass20_Sub3_42.method7358(arg0);
		super.aClass20_Sub3_42.method7348(arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		this.aClass170_2.method5086('\u0001');
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7358(null);
		super.aClass20_Sub3_42.method7325(0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		this.aClass170_2.method5086('\u0000');
		if (this.aClass189_3.aBoolean483) {
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7358(this.aClass189_3.aClass85_Sub2_3);
			super.aClass20_Sub3_42.method7325(0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return true;
	}
}
