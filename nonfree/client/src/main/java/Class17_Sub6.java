import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class17_Sub6 extends Class17 {

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "Lclient!wda;")
	private final Class9_Sub1_Sub2 aClass9_Sub1_Sub2_4;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
	private final boolean aBoolean435;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!wda;Lclient!kda;)V")
	public Class17_Sub6(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class160 arg1) {
		super(arg0);
		this.aClass9_Sub1_Sub2_4 = arg0;
		if ((this.aClass9_Sub1_Sub2_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean435 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1.a(arg1.method4222("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader1 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1.a(arg1.method4222("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1.a(arg1.method4222("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1.a(arg1.method4222("uw_model_lit", "dx"));
			this.aBoolean435 = this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader3 != null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V")
	@Override
	public void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	@Override
	public void method6798() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(12) Class22_Sub3 local12 = this.aClass9_Sub1_Sub2_4.method7659();
			local7.a(0, local12.method5960(Static378.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	@Override
	public void method6800() {
		if (this.anIDirect3DVertexShader2 != null) {
			this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	@Override
	public void method6795() {
		@Pc(3) IDirect3DDevice local3 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass9_Sub1_19.method7752();
		@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_19.method7679();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean436) {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader1 : this.anIDirect3DVertexShader3;
		} else {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader2 != local27) {
			this.anIDirect3DVertexShader2 = local27;
			local3.SetVertexShader(local27);
			this.method5746();
			this.method6804();
			this.method6807();
			this.method6798();
			this.method6801();
			this.method6806();
		}
		local13.method5964(Static378.aFloatArray55, 0.0F, (float) local8, -1.0F, 0.0F);
		local3.a(12, Static378.aFloatArray55);
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	@Override
	public void method6807() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(20) Class22_Sub3 local20 = this.aClass9_Sub1_19.method7680();
			local13.SetVertexShaderConstantF(8, local20.method5963(Static378.aFloatArray56), 2);
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	@Override
	public void method6804() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1;
			local7.a(4, this.aClass9_Sub1_19.method7764(Static378.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6802(@OriginalArg(1) boolean arg0) {
		this.aBoolean436 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V")
	@Override
	public void method6801() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_Sub2_4.method7659();
			local8.a(0, local13.method5960(Static378.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V")
	private void method5746() {
		if (this.anIDirect3DVertexShader2 == null || !this.aBoolean436) {
			return;
		}
		@Pc(15) Class22_Sub3 local15 = this.aClass9_Sub1_19.method7679();
		@Pc(19) IDirect3DDevice local19 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1;
		local19.a(13, this.aClass9_Sub1_19.aFloat202 * this.aClass9_Sub1_19.aFloat200, this.aClass9_Sub1_19.aFloat199 * this.aClass9_Sub1_19.aFloat202, this.aClass9_Sub1_19.aFloat188 * this.aClass9_Sub1_19.aFloat202, 1.0F);
		local19.a(14, this.aClass9_Sub1_19.aFloat192 * this.aClass9_Sub1_19.aFloat200, this.aClass9_Sub1_19.aFloat192 * this.aClass9_Sub1_19.aFloat199, this.aClass9_Sub1_19.aFloat188 * this.aClass9_Sub1_19.aFloat192, 1.0F);
		local19.a(16, this.aClass9_Sub1_19.aFloat200 * this.aClass9_Sub1_19.aFloat197, this.aClass9_Sub1_19.aFloat197 * this.aClass9_Sub1_19.aFloat199, this.aClass9_Sub1_19.aFloat197 * this.aClass9_Sub1_19.aFloat188, 1.0F);
		local15.method5968(this.aClass9_Sub1_19.aFloatArray75[1], this.aClass9_Sub1_19.aFloatArray75[2], Static378.aFloatArray55, this.aClass9_Sub1_19.aFloatArray75[0]);
		local19.SetVertexShaderConstantF(15, Static378.aFloatArray55, 1);
		local15.method5968(this.aClass9_Sub1_19.aFloatArray74[1], this.aClass9_Sub1_19.aFloatArray74[2], Static378.aFloatArray55, this.aClass9_Sub1_19.aFloatArray74[0]);
		local19.SetVertexShaderConstantF(15, Static378.aFloatArray55, 1);
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)V")
	@Override
	public void method6806() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass9_Sub1_Sub2_4.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass9_Sub1_19.CA();
		@Pc(15) int local15 = this.aClass9_Sub1_19.c();
		@Pc(26) float local26 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(38) float local38 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.a(10, local38, 1.0F / (local26 - local38), local26, 1.0F / ((float) local11 - local26));
		local7.a(11, 1.0F / (float) this.aClass9_Sub1_19.method7754(), (float) this.aClass9_Sub1_19.method7657() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!pb;II)V")
	@Override
	public void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		this.aClass9_Sub1_19.method7712(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6805(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6799() {
		return this.aBoolean435;
	}
}
