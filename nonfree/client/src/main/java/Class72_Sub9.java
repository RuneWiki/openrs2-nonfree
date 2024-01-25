import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class72_Sub9 extends Class72 {

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "Lclient!tt;")
	private final Class331 aClass331_7;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "Lclient!eda;")
	private final Class45_Sub2_Sub1 aClass45_Sub2_Sub1_6;

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!eda;Lclient!tf;Lclient!tt;)V")
	public Class72_Sub9(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass331_7 = arg2;
		this.aClass45_Sub2_Sub1_6 = arg0;
		if (arg1 != null && this.aClass331_7.method6941() && (this.aClass45_Sub2_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1.a(arg1.method6810("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	@Override
	public void method7185() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(21) Class11_Sub1 local21 = this.aClass45_Sub2_Sub1_6.method4989();
			local14.a(0, local21.method174(Static456.aFloatArray83));
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
	@Override
	public void method7186() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(16) Class11_Sub1 local16 = this.aClass45_Sub2_Sub1_6.method4989();
			local11.a(0, local16.method174(Static456.aFloatArray83));
		}
	}

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)V")
	@Override
	public void method7192() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1;
		if (this.aClass45_Sub2_22.anInt5837 <= 0) {
			local14.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(32) float local32 = this.aClass45_Sub2_22.aFloat128;
			@Pc(36) float local36 = this.aClass45_Sub2_22.aFloat129;
			@Pc(40) float local40 = local36 - 512.0F;
			local14.a(10, local40, 1.0F / (local36 - local40), local36, 1.0F / (local32 - local36));
		}
		this.aClass45_Sub2_22.method4912(this.aClass45_Sub2_22.anInt5847);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return this.anIDirect3DVertexShader2 != null;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader2);
		this.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
		this.aClass45_Sub2_22.method4953(1, Static62.aClass108_1);
		this.aClass45_Sub2_22.method5010(2, true, false, Static425.aClass108_4);
		this.aClass45_Sub2_22.method5003(false);
		this.method7185();
		this.method7191();
		this.method7190();
		this.method7192();
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
		this.aClass45_Sub2_22.method4953(1, Static425.aClass108_4);
		this.aClass45_Sub2_22.method4953(2, Static62.aClass108_1);
		this.aClass45_Sub2_22.method5003(true);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1;
		if (this.aClass331_7.aBoolean638) {
			@Pc(46) float local46 = (float) (this.aClass45_Sub2_22.anInt5856 % 4000) / 4000.0F;
			this.aClass45_Sub2_22.method4926(this.aClass331_7.anInterface14_2);
			local3.a(11, local46, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(17) int local17 = this.aClass45_Sub2_22.anInt5856 % 4000 * 16 / 4000;
			this.aClass45_Sub2_22.method4926(this.aClass331_7.anInterface17Array2[local17]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(B)V")
	@Override
	public void method7190() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1;
			local12.a(4, this.aClass45_Sub2_22.method5017(Static456.aFloatArray83));
		}
	}

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(B)V")
	@Override
	public void method7191() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass45_Sub2_Sub1_6.anIDirect3DDevice1;
		@Pc(18) Class11_Sub1 local18 = this.aClass45_Sub2_22.method4970();
		local18.method178(Static456.aFloatArray83);
		Static456.aFloatArray83[2] *= 0.25F;
		Static456.aFloatArray83[0] *= 0.25F;
		Static456.aFloatArray83[7] *= 0.25F;
		Static456.aFloatArray83[4] *= 0.25F;
		Static456.aFloatArray83[1] *= 0.25F;
		Static456.aFloatArray83[3] *= 0.25F;
		Static456.aFloatArray83[6] *= 0.25F;
		Static456.aFloatArray83[5] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static456.aFloatArray83, 2);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
		this.aClass45_Sub2_22.method4921(Static177.aClass307_2, Static479.aClass307_6);
	}
}
