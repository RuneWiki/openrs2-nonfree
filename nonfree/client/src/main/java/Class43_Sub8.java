import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class43_Sub8 extends Class43 {

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!tk;")
	private final Class192 aClass192_4;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!ns;")
	private final Class147 aClass147_6;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!se;Lclient!tk;)V")
	public Class43_Sub8(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class192 arg1) {
		super(arg0);
		this.aClass192_4 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass147_6 = new Class147(arg0, 2);
		this.aClass147_6.method3752(0);
		this.aClass122_Sub2_37.method4811(1);
		if (this.aClass192_4.aBoolean411) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass122_Sub2_37.method4811(0);
		this.aClass147_6.method3753();
		this.aClass147_6.method3752(1);
		this.aClass122_Sub2_37.method4811(1);
		if (this.aClass192_4.aBoolean411) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass122_Sub2_37.method4811(0);
		this.aClass147_6.method3753();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()V")
	@Override
	public void method4382() {
		this.aClass147_6.method3754('\u0001');
		this.aClass122_Sub2_37.method4811(1);
		this.aClass122_Sub2_37.method4864(null);
		this.aClass122_Sub2_37.method4811(0);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()Z")
	@Override
	public boolean method4383() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	@Override
	public void method4384(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	@Override
	public void method4381(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass122_Sub2_37.method4811(1);
		if (local35) {
			Static259.aFloatArray19[0] = local27;
			Static259.aFloatArray19[1] = 0.0F;
			Static259.aFloatArray19[2] = 0.0F;
			Static259.aFloatArray19[3] = 0.0F;
		} else {
			Static259.aFloatArray19[0] = 0.0F;
			Static259.aFloatArray19[1] = 0.0F;
			Static259.aFloatArray19[2] = local27;
			Static259.aFloatArray19[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static259.aFloatArray19, 0);
		Static259.aFloatArray19[0] = 0.0F;
		Static259.aFloatArray19[1] = local27;
		Static259.aFloatArray19[2] = 0.0F;
		Static259.aFloatArray19[3] = (float) this.aClass122_Sub2_37.anInt5610 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static259.aFloatArray19, 0);
		if (this.aClass192_4.aBoolean411) {
			Static259.aFloatArray19[0] = 0.0F;
			Static259.aFloatArray19[1] = 0.0F;
			Static259.aFloatArray19[2] = 0.0F;
			Static259.aFloatArray19[3] = (float) this.aClass122_Sub2_37.anInt5610 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static259.aFloatArray19, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass122_Sub2_37.anInt5610 * 16.0F);
			this.aClass122_Sub2_37.method4864(this.aClass192_4.aClass66_Sub1Array4[local127 % 16]);
		}
		this.aClass122_Sub2_37.method4811(0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!gd;)V")
	@Override
	public void method4385(@OriginalArg(0) Class66 arg0) {
		this.aClass122_Sub2_37.method4864(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Z)V")
	@Override
	public void method4386(@OriginalArg(0) boolean arg0) {
		this.aClass147_6.method3754('\u0000');
		if (this.aClass192_4.aBoolean411) {
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4864(this.aClass192_4.aClass66_Sub3_3);
			this.aClass122_Sub2_37.method4811(0);
		}
	}
}
