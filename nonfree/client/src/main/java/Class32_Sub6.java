import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class32_Sub6 extends Class32 {

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!to;")
	private final Class31_Sub1_Sub2 aClass31_Sub1_Sub2_7;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!tj;")
	private final Class318 aClass318_5;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!to;Lclient!ri;Lclient!tj;)V")
	public Class32_Sub6(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class318 arg2) {
		super(arg0);
		this.aClass31_Sub1_Sub2_7 = arg0;
		this.aClass318_5 = arg2;
		if (arg1 != null && this.aClass318_5.method6940() && (this.aClass31_Sub1_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1.b(arg1.method6328("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	@Override
	public void method7447() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_Sub2_7.method7182();
			local8.a(0, local13.method7540(Static450.aFloatArray55));
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_22.method7075();
		local13.method7535(Static450.aFloatArray55);
		Static450.aFloatArray55[3] *= 0.25F;
		Static450.aFloatArray55[6] *= 0.25F;
		Static450.aFloatArray55[4] *= 0.25F;
		Static450.aFloatArray55[5] *= 0.25F;
		Static450.aFloatArray55[1] *= 0.25F;
		Static450.aFloatArray55[0] *= 0.25F;
		Static450.aFloatArray55[7] *= 0.25F;
		Static450.aFloatArray55[2] *= 0.25F;
		local6.SetVertexShaderConstantF(8, Static450.aFloatArray55, 2);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1;
		if (this.aClass318_5.aBoolean589) {
			@Pc(50) float local50 = (float) (this.aClass31_Sub1_22.anInt9105 % 4000) / 4000.0F;
			this.aClass31_Sub1_22.method7129(this.aClass318_5.anInterface19_2);
			local3.a(11, local50, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(23) int local23 = this.aClass31_Sub1_22.anInt9105 % 4000 * 16 / 4000;
			this.aClass31_Sub1_22.method7129(this.aClass318_5.anInterface12Array2[local23]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	@Override
	public void method7455() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1;
			local11.a(4, this.aClass31_Sub1_22.method7110(Static450.aFloatArray55));
		}
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
		this.aClass31_Sub1_22.method7155(1, Static138.aClass179_11);
		this.aClass31_Sub1_22.method7155(2, Static438.aClass179_14);
		this.aClass31_Sub1_22.method7175(true);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
		this.aClass31_Sub1_22.method7155(1, Static438.aClass179_14);
		this.aClass31_Sub1_22.method7083(Static138.aClass179_11, 2, true, false);
		this.aClass31_Sub1_22.method7175(false);
		this.method7447();
		this.method7457();
		this.method7455();
		this.method7450();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
		this.aClass31_Sub1_22.method7136(Static438.aClass266_2, Static336.aClass266_4);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	@Override
	public void method7456() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(11) Class42_Sub3 local11 = this.aClass31_Sub1_Sub2_7.method7182();
			local6.a(0, local11.method7540(Static450.aFloatArray55));
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	@Override
	public void method7450() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass31_Sub1_Sub2_7.anIDirect3DDevice1;
		if (this.aClass31_Sub1_22.anInt9110 > 0) {
			@Pc(23) float local23 = this.aClass31_Sub1_22.aFloat203;
			@Pc(27) float local27 = this.aClass31_Sub1_22.aFloat198;
			@Pc(31) float local31 = local27 - 512.0F;
			local14.a(10, local31, 1.0F / (local27 - local31), local27, 1.0F / (local23 - local27));
		} else {
			local14.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass31_Sub1_22.method7160(this.aClass31_Sub1_22.anInt9133);
	}
}
