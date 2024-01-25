import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class60_Sub11 extends Class60 {

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!uw;")
	private final Class367 aClass367_8;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!aia;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_8;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!aia;Lclient!gj;Lclient!uw;)V")
	public Class60_Sub11(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class367 arg2) {
		super(arg0);
		this.aClass367_8 = arg2;
		this.aClass16_Sub1_Sub1_8 = arg0;
		if (arg1 != null && this.aClass367_8.method8229() && (this.aClass16_Sub1_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass16_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method3119("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return this.anIDirect3DVertexShader8 != null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	public void method8294() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub1_8.anIDirect3DDevice1;
		if (this.aClass16_Sub1_23.anInt7457 > 0) {
			@Pc(18) float local18 = this.aClass16_Sub1_23.aFloat165;
			@Pc(22) float local22 = this.aClass16_Sub1_23.aFloat162;
			@Pc(26) float local26 = local22 - 512.0F;
			local7.b(10, local26, 1.0F / (local22 - local26), local22, 1.0F / (local18 - local22));
		} else {
			local7.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass16_Sub1_23.method6263(this.aClass16_Sub1_23.anInt7449);
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
	@Override
	public void method8303() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass16_Sub1_Sub1_8.anIDirect3DDevice1;
			local6.a(4, this.aClass16_Sub1_23.method6213(Static629.aFloatArray81));
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	@Override
	public void method8298() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass16_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(19) Class25_Sub3 local19 = this.aClass16_Sub1_Sub1_8.method6198();
			local14.a(0, local19.method4328(Static629.aFloatArray81));
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub1_8.anIDirect3DDevice1;
		if (this.aClass367_8.aBoolean714) {
			@Pc(20) float local20 = (float) (this.aClass16_Sub1_23.anInt7468 % 4000) / 4000.0F;
			this.aClass16_Sub1_23.method6197(this.aClass367_8.anInterface24_1);
			local7.b(11, local20, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(46) int local46 = this.aClass16_Sub1_23.anInt7468 % 4000 * 16 / 4000;
			this.aClass16_Sub1_23.method6197(this.aClass367_8.anInterface11Array1[local46]);
			local7.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		this.aClass16_Sub1_Sub1_8.method692((IDirect3DVertexShader) null);
		this.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
		this.aClass16_Sub1_23.method6284(Static317.aClass188_3, 1);
		this.aClass16_Sub1_23.method6284(Static262.aClass188_2, 2);
		this.aClass16_Sub1_23.method6327(true);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method8292() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass16_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(18) Class25_Sub3 local18 = this.aClass16_Sub1_23.method6297();
		local18.method4312(Static629.aFloatArray81);
		Static629.aFloatArray81[3] *= 0.25F;
		Static629.aFloatArray81[1] *= 0.25F;
		Static629.aFloatArray81[0] *= 0.25F;
		Static629.aFloatArray81[7] *= 0.25F;
		Static629.aFloatArray81[5] *= 0.25F;
		Static629.aFloatArray81[2] *= 0.25F;
		Static629.aFloatArray81[4] *= 0.25F;
		Static629.aFloatArray81[6] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static629.aFloatArray81, 2);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
		this.aClass16_Sub1_23.method6241(Static333.aClass11_3, Static49.aClass11_2);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		this.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
		this.aClass16_Sub1_23.method6284(Static262.aClass188_2, 1);
		this.aClass16_Sub1_23.method6277(Static317.aClass188_3, false, 2, true);
		this.aClass16_Sub1_23.method6327(false);
		this.aClass16_Sub1_Sub1_8.method692(this.anIDirect3DVertexShader8);
		this.method8297();
		this.method8292();
		this.method8303();
		this.method8294();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	@Override
	public void method8297() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass16_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(19) Class25_Sub3 local19 = this.aClass16_Sub1_Sub1_8.method6198();
			local14.a(0, local19.method4328(Static629.aFloatArray81));
		}
	}
}
