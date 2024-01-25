import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class20_Sub9 extends Class20 {

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "Lclient!rfa;")
	private final Class312 aClass312_6;

	@OriginalMember(owner = "client!sga", name = "p", descriptor = "Lclient!us;")
	private final Class33_Sub2_Sub2 aClass33_Sub2_Sub2_9;

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!us;Lclient!bt;Lclient!rfa;)V")
	public Class20_Sub9(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class312 arg2) {
		super(arg0);
		this.aClass312_6 = arg2;
		this.aClass33_Sub2_Sub2_9 = arg0;
		if (arg1 != null && this.aClass312_6.method6974() && (this.aClass33_Sub2_Sub2_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass33_Sub2_Sub2_9.anIDirect3DDevice1.a(arg1.method1238("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
	@Override
	public void method7962() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass33_Sub2_Sub2_9.anIDirect3DDevice1;
		@Pc(19) Class92_Sub1 local19 = this.aClass33_Sub2_21.method8256();
		local19.method2303(Static546.aFloatArray60);
		Static546.aFloatArray60[0] *= 0.25F;
		Static546.aFloatArray60[3] *= 0.25F;
		Static546.aFloatArray60[2] *= 0.25F;
		Static546.aFloatArray60[6] *= 0.25F;
		Static546.aFloatArray60[5] *= 0.25F;
		Static546.aFloatArray60[4] *= 0.25F;
		Static546.aFloatArray60[7] *= 0.25F;
		Static546.aFloatArray60[1] *= 0.25F;
		local14.SetVertexShaderConstantF(8, Static546.aFloatArray60, 2);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	@Override
	public void method7958() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub2_Sub2_9.anIDirect3DDevice1;
			@Pc(11) Class92_Sub1 local11 = this.aClass33_Sub2_Sub2_9.method8216();
			local6.a(0, local11.method2313(Static546.aFloatArray60));
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		this.aClass33_Sub2_Sub2_9.method8300((IDirect3DVertexShader) null);
		this.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
		this.aClass33_Sub2_21.method8239(1, Static621.aClass230_4);
		this.aClass33_Sub2_21.method8239(2, Static228.aClass230_2);
		this.aClass33_Sub2_21.method8288(true);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass33_Sub2_Sub2_9.anIDirect3DDevice1;
		if (this.aClass312_6.aBoolean629) {
			@Pc(20) float local20 = (float) (this.aClass33_Sub2_21.anInt9643 % 4000) / 4000.0F;
			this.aClass33_Sub2_21.method8159(this.aClass312_6.anInterface7_2);
			local3.b(11, local20, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(46) int local46 = this.aClass33_Sub2_21.anInt9643 % 4000 * 16 / 4000;
			this.aClass33_Sub2_21.method8159(this.aClass312_6.anInterface1Array2[local46]);
			local3.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		this.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
		this.aClass33_Sub2_21.method8239(1, Static228.aClass230_2);
		this.aClass33_Sub2_21.method8182(Static621.aClass230_4, false, true, 2);
		this.aClass33_Sub2_21.method8288(false);
		this.aClass33_Sub2_Sub2_9.method8300(this.anIDirect3DVertexShader7);
		this.method7958();
		this.method7962();
		this.method7964();
		this.method7956();
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)V")
	@Override
	public void method7964() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub2_Sub2_9.anIDirect3DDevice1;
			local6.a(4, this.aClass33_Sub2_21.method8270(Static546.aFloatArray60));
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
	@Override
	public void method7956() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass33_Sub2_Sub2_9.anIDirect3DDevice1;
		if (this.aClass33_Sub2_21.anInt9645 <= 0) {
			local10.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(30) float local30 = this.aClass33_Sub2_21.aFloat213;
			@Pc(34) float local34 = this.aClass33_Sub2_21.aFloat216;
			@Pc(38) float local38 = local34 - 512.0F;
			local10.b(10, local38, 1.0F / (local34 - local38), local34, 1.0F / (local30 - local34));
		}
		this.aClass33_Sub2_21.method8208(this.aClass33_Sub2_21.anInt9674);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V")
	@Override
	public void method7959() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass33_Sub2_Sub2_9.anIDirect3DDevice1;
			@Pc(18) Class92_Sub1 local18 = this.aClass33_Sub2_Sub2_9.method8216();
			local13.a(0, local18.method2313(Static546.aFloatArray60));
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
		this.aClass33_Sub2_21.method8280(Static228.aClass91_2, Static586.aClass91_5);
	}
}
