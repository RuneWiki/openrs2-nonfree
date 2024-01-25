import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class16_Sub9 extends Class16 {

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "Lclient!eb;")
	private final Class73 aClass73_7;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "Lclient!cu;")
	private final Class33_Sub1_Sub2 aClass33_Sub1_Sub2_8;

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!cu;Lclient!kha;Lclient!eb;)V")
	public Class16_Sub9(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class73 arg2) {
		super(arg0);
		this.aClass73_7 = arg2;
		this.aClass33_Sub1_Sub2_8 = arg0;
		if (arg1 != null && this.aClass73_7.method2713() && (this.aClass33_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass33_Sub1_Sub2_8.anIDirect3DDevice1.b(arg1.method5026("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)V")
	@Override
	public void method8600() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(11) Class47_Sub3 local11 = this.aClass33_Sub1_Sub2_8.method2061();
			local6.a(0, local11.method7880(Static564.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		this.aClass33_Sub1_Sub2_8.method2119(null);
		this.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
		this.aClass33_Sub1_23.method2098(1, Static133.aClass371_2);
		this.aClass33_Sub1_23.method2098(2, Static139.aClass371_3);
		this.aClass33_Sub1_23.method2096(true);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8609() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass33_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(12) Class47_Sub3 local12 = this.aClass33_Sub1_Sub2_8.method2061();
			local7.a(0, local12.method7880(Static564.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) IDirect3DDevice local10 = this.aClass33_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass73_7.aBoolean236) {
			@Pc(51) float local51 = (float) (this.aClass33_Sub1_23.anInt2179 % 4000) / 4000.0F;
			this.aClass33_Sub1_23.method1987(this.aClass73_7.anInterface17_2);
			local10.a(11, local51, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass33_Sub1_23.anInt2179 % 4000 * 16 / 4000;
			this.aClass33_Sub1_23.method1987(this.aClass73_7.anInterface2Array2[local24]);
			local10.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "(B)V")
	@Override
	public void method8610() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass33_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(12) Class47_Sub3 local12 = this.aClass33_Sub1_23.method2041();
		local12.method7895(Static564.aFloatArray75);
		Static564.aFloatArray75[4] *= 0.25F;
		Static564.aFloatArray75[7] *= 0.25F;
		Static564.aFloatArray75[1] *= 0.25F;
		Static564.aFloatArray75[6] *= 0.25F;
		Static564.aFloatArray75[2] *= 0.25F;
		Static564.aFloatArray75[0] *= 0.25F;
		Static564.aFloatArray75[5] *= 0.25F;
		Static564.aFloatArray75[3] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static564.aFloatArray75, 2);
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)V")
	@Override
	public void method8599() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass33_Sub1_23.anInt2170 <= 0) {
			local6.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(26) float local26 = this.aClass33_Sub1_23.aFloat73;
			@Pc(30) float local30 = this.aClass33_Sub1_23.aFloat81;
			@Pc(34) float local34 = local30 - 512.0F;
			local6.a(10, local34, 1.0F / (local30 - local34), local30, 1.0F / (local26 - local30));
		}
		this.aClass33_Sub1_23.method1996(this.aClass33_Sub1_23.anInt2166);
	}

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return this.anIDirect3DVertexShader3 != null;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
		this.aClass33_Sub1_23.method1983(Static428.aClass363_4, Static95.aClass363_3);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		this.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
		this.aClass33_Sub1_23.method2098(1, Static139.aClass371_3);
		this.aClass33_Sub1_23.method1988(true, 2, false, Static133.aClass371_2);
		this.aClass33_Sub1_23.method2096(false);
		this.aClass33_Sub1_Sub2_8.method2119(this.anIDirect3DVertexShader3);
		this.method8609();
		this.method8610();
		this.method8607();
		this.method8599();
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V")
	@Override
	public void method8607() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub1_Sub2_8.anIDirect3DDevice1;
			local6.a(4, this.aClass33_Sub1_23.method2048(Static564.aFloatArray75));
		}
	}
}
