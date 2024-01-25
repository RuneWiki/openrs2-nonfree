import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Lclient!ie;")
	private final Class149 aClass149_1;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!gb;")
	private final Class9_Sub3_Sub1 aClass9_Sub3_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!gb;Lclient!jo;Lclient!ie;)V")
	public Class37_Sub2(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class149 arg2) {
		super(arg0);
		this.aClass149_1 = arg2;
		this.aClass9_Sub3_Sub1_1 = arg0;
		if (this.aClass149_1.method3987() && (this.aClass9_Sub3_Sub1_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1.a(arg1.method4450("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
	@Override
	public void method7555() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1;
		@Pc(20) Class8_Sub3 local20 = this.aClass9_Sub3_19.method5484();
		local20.method8182(Static97.aFloatArray9);
		Static97.aFloatArray9[2] *= 0.25F;
		Static97.aFloatArray9[4] *= 0.25F;
		Static97.aFloatArray9[0] *= 0.25F;
		Static97.aFloatArray9[7] *= 0.25F;
		Static97.aFloatArray9[5] *= 0.25F;
		Static97.aFloatArray9[6] *= 0.25F;
		Static97.aFloatArray9[3] *= 0.25F;
		Static97.aFloatArray9[1] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static97.aFloatArray9, 2);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass9_Sub3_19.method5596(Static503.aClass50_4, 0);
		this.aClass9_Sub3_19.method5596(Static140.aClass50_2, 1);
		this.aClass9_Sub3_19.method5491(true, false, Static237.aClass50_3, 2);
		this.aClass9_Sub3_19.method5520(false);
		this.method7554();
		this.method7555();
		this.method7557();
		this.method7553();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method7554() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1;
			@Pc(11) Class8_Sub3 local11 = this.aClass9_Sub3_Sub1_1.method5563();
			local6.a(0, local11.method8184(Static97.aFloatArray9));
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	@Override
	public void method7558() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1;
			@Pc(11) Class8_Sub3 local11 = this.aClass9_Sub3_Sub1_1.method5563();
			local6.a(0, local11.method8184(Static97.aFloatArray9));
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
		this.aClass9_Sub3_19.method5598(Static167.aClass238_2, Static71.aClass238_1);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) IDirect3DDevice local10 = this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1;
		if (this.aClass149_1.aBoolean367) {
			@Pc(51) float local51 = (float) (this.aClass9_Sub3_19.anInt6563 % 4000) / 4000.0F;
			this.aClass9_Sub3_19.method5494(this.aClass149_1.anInterface19_1);
			local10.a(11, local51, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass9_Sub3_19.anInt6563 % 4000 * 16 / 4000;
			this.aClass9_Sub3_19.method5494(this.aClass149_1.anInterface1Array2[local24]);
			local10.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass9_Sub3_19.method5596(Static503.aClass50_4, 0);
		this.aClass9_Sub3_19.method5596(Static237.aClass50_3, 1);
		this.aClass9_Sub3_19.method5596(Static140.aClass50_2, 2);
		this.aClass9_Sub3_19.method5520(true);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
	@Override
	public void method7557() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1;
			local6.a(4, this.aClass9_Sub3_19.method5523(Static97.aFloatArray9));
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	@Override
	public void method7553() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass9_Sub3_Sub1_1.anIDirect3DDevice1;
		if (this.aClass9_Sub3_19.anInt6531 <= 0) {
			local14.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(34) float local34 = this.aClass9_Sub3_19.aFloat139;
			@Pc(38) float local38 = this.aClass9_Sub3_19.aFloat149;
			@Pc(42) float local42 = local38 - 512.0F;
			local14.a(10, local42, 1.0F / (local38 - local42), local38, 1.0F / (local34 - local38));
		}
		this.aClass9_Sub3_19.method5536(this.aClass9_Sub3_19.anInt6537);
	}
}
