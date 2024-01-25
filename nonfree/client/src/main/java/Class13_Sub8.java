import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!cda;")
	private final Class61 aClass61_5;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!sd;")
	private final Class57_Sub3_Sub2 aClass57_Sub3_Sub2_9;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!sd;Lclient!la;Lclient!cda;)V")
	public Class13_Sub8(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class61 arg2) {
		super(arg0);
		this.aClass61_5 = arg2;
		this.aClass57_Sub3_Sub2_9 = arg0;
		if (arg1 != null && this.aClass61_5.method1092() && (this.aClass57_Sub3_Sub2_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass57_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method4999("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		this.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
		this.aClass57_Sub3_21.method7866(1, Static291.aClass312_3);
		this.aClass57_Sub3_21.method7750(true, 2, false, Static625.aClass312_4);
		this.aClass57_Sub3_21.method7737(false);
		this.aClass57_Sub3_Sub2_9.method7872(this.anIDirect3DVertexShader7);
		this.method8267();
		this.method8268();
		this.method8260();
		this.method8272();
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
	@Override
	public void method8267() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass57_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(15) Class203_Sub1 local15 = this.aClass57_Sub3_Sub2_9.method7865();
			local10.a(0, local15.method4843(Static505.aFloatArray87));
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		this.aClass57_Sub3_Sub2_9.method7872((IDirect3DVertexShader) null);
		this.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
		this.aClass57_Sub3_21.method7866(1, Static625.aClass312_4);
		this.aClass57_Sub3_21.method7866(2, Static291.aClass312_3);
		this.aClass57_Sub3_21.method7737(true);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
		this.aClass57_Sub3_21.method7733(Static11.aClass34_6, Static141.aClass34_77);
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(18) IDirect3DDevice local18 = this.aClass57_Sub3_Sub2_9.anIDirect3DDevice1;
			local18.a(4, this.aClass57_Sub3_21.method7823(Static505.aFloatArray87));
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) IDirect3DDevice local11 = this.aClass57_Sub3_Sub2_9.anIDirect3DDevice1;
		if (this.aClass61_5.aBoolean95) {
			@Pc(24) float local24 = (float) (this.aClass57_Sub3_21.anInt9168 % 4000) / 4000.0F;
			this.aClass57_Sub3_21.method7813(this.aClass61_5.anInterface19_1);
			local11.b(11, local24, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(50) int local50 = this.aClass57_Sub3_21.anInt9168 % 4000 * 16 / 4000;
			this.aClass57_Sub3_21.method7813(this.aClass61_5.anInterface26Array2[local50]);
			local11.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	@Override
	public void method8272() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass57_Sub3_Sub2_9.anIDirect3DDevice1;
		if (this.aClass57_Sub3_21.anInt9170 > 0) {
			@Pc(17) float local17 = this.aClass57_Sub3_21.aFloat170;
			@Pc(21) float local21 = this.aClass57_Sub3_21.aFloat172;
			@Pc(25) float local25 = local21 - 512.0F;
			local6.b(10, local25, 1.0F / (local21 - local25), local21, 1.0F / (local17 - local21));
		} else {
			local6.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass57_Sub3_21.method7806(this.aClass57_Sub3_21.anInt9162);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	@Override
	public void method8268() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass57_Sub3_Sub2_9.anIDirect3DDevice1;
		@Pc(13) Class203_Sub1 local13 = this.aClass57_Sub3_21.method7761();
		local13.method4835(Static505.aFloatArray87);
		Static505.aFloatArray87[1] *= 0.25F;
		Static505.aFloatArray87[7] *= 0.25F;
		Static505.aFloatArray87[2] *= 0.25F;
		Static505.aFloatArray87[5] *= 0.25F;
		Static505.aFloatArray87[3] *= 0.25F;
		Static505.aFloatArray87[4] *= 0.25F;
		Static505.aFloatArray87[6] *= 0.25F;
		Static505.aFloatArray87[0] *= 0.25F;
		local8.SetVertexShaderConstantF(8, Static505.aFloatArray87, 2);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
	@Override
	public void method8266() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass57_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(15) Class203_Sub1 local15 = this.aClass57_Sub3_Sub2_9.method7865();
			local10.a(0, local15.method4843(Static505.aFloatArray87));
		}
	}
}
