import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class20_Sub8 extends Class20 {

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "Z")
	private boolean aBoolean613 = false;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "Lclient!us;")
	private final Class33_Sub2_Sub2 aClass33_Sub2_Sub2_8;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Lclient!ada;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!us;Lclient!bt;)V")
	public Class20_Sub8(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class34 arg1) {
		super(arg0);
		this.aClass33_Sub2_Sub2_8 = arg0;
		if (arg1 == null || (this.aClass33_Sub2_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean615 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1.a(arg1.method1238("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader2 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1.a(arg1.method1238("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader6 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1.a(arg1.method1238("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1.a(arg1.method1238("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader6 != null) {
				this.anInterface1_5 = this.aClass33_Sub2_21.method8273(false, 2, 1, new int[] { 0, -1 });
				this.anInterface1_5.method8629(false, false);
				this.aBoolean615 = true;
			} else {
				this.aBoolean615 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		this.aClass33_Sub2_21.method8235(1);
		this.aClass33_Sub2_21.method8159((Interface14) null);
		this.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
		this.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
		this.aClass33_Sub2_21.method8239(2, Static228.aClass230_2);
		this.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
		this.aClass33_Sub2_21.method8235(0);
		if (this.aBoolean613) {
			this.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
			this.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
			this.aBoolean613 = false;
		}
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass33_Sub2_Sub2_8.method8300((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
	@Override
	public void method7959() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1;
			@Pc(18) Class92_Sub1 local18 = this.aClass33_Sub2_Sub2_8.method8216();
			local13.a(0, local18.method2313(Static501.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return this.aBoolean615;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		this.aBoolean614 = arg0;
		this.aClass33_Sub2_21.method8235(1);
		this.aClass33_Sub2_21.method8159(this.anInterface1_5);
		this.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static586.aClass91_5);
		this.aClass33_Sub2_21.method8239(0, Static228.aClass230_2);
		this.aClass33_Sub2_21.method8182(Static41.aClass230_1, true, false, 2);
		this.aClass33_Sub2_21.method8258(Static238.aClass230_3, 0);
		this.aClass33_Sub2_21.method8235(0);
		this.method7966();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		if (arg1 != null) {
			if (this.aBoolean613) {
				this.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
				this.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
				this.aBoolean613 = false;
			}
			this.aClass33_Sub2_21.method8159(arg1);
			this.aClass33_Sub2_21.method8167(arg0);
		} else if (!this.aBoolean613) {
			this.aClass33_Sub2_21.method8159(this.aClass33_Sub2_21.anInterface14_3);
			this.aClass33_Sub2_21.method8167(1);
			this.aClass33_Sub2_21.method8239(0, Static238.aClass230_3);
			this.aClass33_Sub2_21.method8258(Static238.aClass230_3, 0);
			this.aBoolean613 = true;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	@Override
	public void method7958() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1;
			@Pc(19) Class92_Sub1 local19 = this.aClass33_Sub2_Sub2_8.method8216();
			local14.a(0, local19.method2313(Static501.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V")
	private void method6821() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean614) {
			return;
		}
		@Pc(14) Class92_Sub1 local14 = this.aClass33_Sub2_21.method8187();
		@Pc(18) IDirect3DDevice local18 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1;
		local18.b(13, this.aClass33_Sub2_21.aFloat212 * this.aClass33_Sub2_21.aFloat215, this.aClass33_Sub2_21.aFloat212 * this.aClass33_Sub2_21.aFloat224, this.aClass33_Sub2_21.aFloat212 * this.aClass33_Sub2_21.aFloat218, 1.0F);
		local18.b(14, this.aClass33_Sub2_21.aFloat215 * this.aClass33_Sub2_21.aFloat217, this.aClass33_Sub2_21.aFloat224 * this.aClass33_Sub2_21.aFloat217, this.aClass33_Sub2_21.aFloat217 * this.aClass33_Sub2_21.aFloat218, 1.0F);
		local18.b(16, this.aClass33_Sub2_21.aFloat215 * this.aClass33_Sub2_21.aFloat210, this.aClass33_Sub2_21.aFloat224 * this.aClass33_Sub2_21.aFloat210, this.aClass33_Sub2_21.aFloat210 * this.aClass33_Sub2_21.aFloat218, 1.0F);
		local14.method2309(Static501.aFloatArray55, this.aClass33_Sub2_21.aFloatArray71[2], this.aClass33_Sub2_21.aFloatArray71[0], this.aClass33_Sub2_21.aFloatArray71[1]);
		local18.SetVertexShaderConstantF(15, Static501.aFloatArray55, 1);
		local14.method2309(Static501.aFloatArray55, this.aClass33_Sub2_21.aFloatArray66[2], this.aClass33_Sub2_21.aFloatArray66[0], this.aClass33_Sub2_21.aFloatArray66[1]);
		local18.SetVertexShaderConstantF(17, Static501.aFloatArray55, 1);
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
	@Override
	public void method7964() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1;
			local7.a(4, this.aClass33_Sub2_21.method8270(Static501.aFloatArray56));
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	@Override
	public void method7962() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1;
			@Pc(20) Class92_Sub1 local20 = this.aClass33_Sub2_21.method8256();
			local15.SetVertexShaderConstantF(8, local20.method2303(Static501.aFloatArray56), 2);
		}
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
	@Override
	public void method7966() {
		@Pc(9) IDirect3DDevice local9 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass33_Sub2_21.method8196();
		@Pc(21) Class92_Sub1 local21 = this.aClass33_Sub2_21.method8274();
		@Pc(35) IDirect3DVertexShader local35;
		if (this.aBoolean614) {
			local35 = ~local14 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader5;
		} else {
			local35 = ~local14 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader6;
		}
		if (this.anIDirect3DVertexShader4 != local35) {
			this.anIDirect3DVertexShader4 = local35;
			this.aClass33_Sub2_Sub2_8.method8300(local35);
			this.method6821();
			this.method7964();
			this.method7962();
			this.method7958();
			this.method7959();
			this.method7956();
		}
		local21.method2294(-1.0F, (float) local14, 0.0F, 0.0F, Static501.aFloatArray55);
		local9.a(12, Static501.aFloatArray55);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	@Override
	public void method7956() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass33_Sub2_Sub2_8.anIDirect3DDevice1;
		@Pc(17) int local17 = this.aClass33_Sub2_21.XA();
		@Pc(21) int local21 = this.aClass33_Sub2_21.i();
		@Pc(33) float local33 = -((float) (local17 - local21) * 0.125F) + (float) local17;
		@Pc(44) float local44 = (float) local17 - (float) (local17 - local21) * 0.25F;
		local13.b(10, local44, 1.0F / (local33 - local44), local33, 1.0F / ((float) local17 - local33));
		local13.b(11, 1.0F / (float) this.aClass33_Sub2_21.method8177(), (float) this.aClass33_Sub2_21.method8186() / 255.0F, this.aClass33_Sub2_21.aFloat213, 1.0F / (this.aClass33_Sub2_21.aFloat213 - this.aClass33_Sub2_21.aFloat216));
		this.aClass33_Sub2_21.method8208(this.aClass33_Sub2_21.method8220());
	}
}
