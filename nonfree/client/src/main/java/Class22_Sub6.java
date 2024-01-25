import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class22_Sub6 extends Class22 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!rl;")
	private final Class178 aClass178_3;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!bb;")
	private final Class20 aClass20_5;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!tb;Lclient!rl;)V")
	public Class22_Sub6(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class178 arg1) {
		super(arg0);
		this.aClass178_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass20_5 = new Class20(arg0, 2);
		this.aClass20_5.method222(0);
		this.aClass129_Sub2_32.method5091(1);
		if (this.aClass178_3.aBoolean357) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass129_Sub2_32.method5091(0);
		this.aClass20_5.method221();
		this.aClass20_5.method222(1);
		this.aClass129_Sub2_32.method5091(1);
		if (this.aClass178_3.aBoolean357) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass129_Sub2_32.method5091(0);
		this.aClass20_5.method221();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()Z")
	@Override
	public boolean method4341() {
		return true;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ue;)V")
	@Override
	public void method4343(@OriginalArg(0) Class56 arg0) {
		this.aClass129_Sub2_32.method5084(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4338(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4340(@OriginalArg(0) boolean arg0) {
		this.aClass20_5.method223('\u0000');
		if (this.aClass178_3.aBoolean357) {
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5084(this.aClass178_3.aClass56_Sub3_2);
			this.aClass129_Sub2_32.method5091(0);
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "()V")
	@Override
	public void method4342() {
		this.aClass20_5.method223('\u0001');
		this.aClass129_Sub2_32.method5091(1);
		this.aClass129_Sub2_32.method5084(null);
		this.aClass129_Sub2_32.method5091(0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass129_Sub2_32.anOpengl2;
		this.aClass129_Sub2_32.method5091(1);
		if (local35) {
			Static228.aFloatArray22[0] = local27;
			Static228.aFloatArray22[1] = 0.0F;
			Static228.aFloatArray22[2] = 0.0F;
			Static228.aFloatArray22[3] = 0.0F;
		} else {
			Static228.aFloatArray22[0] = 0.0F;
			Static228.aFloatArray22[1] = 0.0F;
			Static228.aFloatArray22[2] = local27;
			Static228.aFloatArray22[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static228.aFloatArray22, 0);
		Static228.aFloatArray22[0] = 0.0F;
		Static228.aFloatArray22[1] = local27;
		Static228.aFloatArray22[2] = 0.0F;
		Static228.aFloatArray22[3] = (float) this.aClass129_Sub2_32.anInt5886 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static228.aFloatArray22, 0);
		if (this.aClass178_3.aBoolean357) {
			Static228.aFloatArray22[0] = 0.0F;
			Static228.aFloatArray22[1] = 0.0F;
			Static228.aFloatArray22[2] = 0.0F;
			Static228.aFloatArray22[3] = (float) this.aClass129_Sub2_32.anInt5886 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static228.aFloatArray22, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass129_Sub2_32.anInt5886 * 16.0F);
			this.aClass129_Sub2_32.method5084(this.aClass178_3.aClass56_Sub4Array4[local127 % 16]);
		}
		this.aClass129_Sub2_32.method5091(0);
	}
}
