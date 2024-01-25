import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "Z")
	private boolean aBoolean16;

	@OriginalMember(owner = "client!aia", name = "q", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "Lclient!hda;")
	private final Class144_Sub1_Sub1 aClass144_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "Lclient!gka;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "Z")
	private final boolean aBoolean15;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!hda;Lclient!rg;)V")
	public Class5_Sub2(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class310 arg1) {
		super(arg0);
		this.aClass144_Sub1_Sub1_1 = arg0;
		if (arg1 == null || (this.aClass144_Sub1_Sub1_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean15 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1.a(arg1.method7801("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1.a(arg1.method7801("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader1 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1.a(arg1.method7801("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1.a(arg1.method7801("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader2 != null) {
				this.anInterface9_1 = this.aClass144_Sub1_20.method5687(2, false, 1, new int[] { 0, -1 });
				this.anInterface9_1.method4773(false, false);
				this.aBoolean15 = true;
			} else {
				this.aBoolean15 = false;
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "(I)V")
	private void method263() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean16) {
			return;
		}
		@Pc(23) Class263_Sub2 local23 = this.aClass144_Sub1_20.method5758();
		@Pc(27) IDirect3DDevice local27 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1;
		local27.b(13, this.aClass144_Sub1_20.aFloat103 * this.aClass144_Sub1_20.aFloat95, this.aClass144_Sub1_20.aFloat95 * this.aClass144_Sub1_20.aFloat104, this.aClass144_Sub1_20.aFloat106 * this.aClass144_Sub1_20.aFloat95, 1.0F);
		local27.b(14, this.aClass144_Sub1_20.aFloat102 * this.aClass144_Sub1_20.aFloat103, this.aClass144_Sub1_20.aFloat102 * this.aClass144_Sub1_20.aFloat104, this.aClass144_Sub1_20.aFloat106 * this.aClass144_Sub1_20.aFloat102, 1.0F);
		local27.b(16, this.aClass144_Sub1_20.aFloat91 * this.aClass144_Sub1_20.aFloat103, this.aClass144_Sub1_20.aFloat91 * this.aClass144_Sub1_20.aFloat104, this.aClass144_Sub1_20.aFloat91 * this.aClass144_Sub1_20.aFloat106, 1.0F);
		local23.method7287(this.aClass144_Sub1_20.aFloatArray51[0], Static13.aFloatArray2, this.aClass144_Sub1_20.aFloatArray51[2], this.aClass144_Sub1_20.aFloatArray51[1]);
		local27.SetVertexShaderConstantF(15, Static13.aFloatArray2, 1);
		local23.method7287(this.aClass144_Sub1_20.aFloatArray50[0], Static13.aFloatArray2, this.aClass144_Sub1_20.aFloatArray50[2], this.aClass144_Sub1_20.aFloatArray50[1]);
		local27.SetVertexShaderConstantF(17, Static13.aFloatArray2, 1);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		this.aBoolean16 = arg0;
		this.aClass144_Sub1_20.method5706(1);
		this.aClass144_Sub1_20.method5643(this.anInterface9_1);
		this.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static448.aClass287_4);
		this.aClass144_Sub1_20.method5740(Static216.aClass138_5, 0);
		this.aClass144_Sub1_20.method5775(2, Static308.aClass138_4, true, false);
		this.aClass144_Sub1_20.method5779(0, Static225.aClass138_3);
		this.aClass144_Sub1_20.method5706(0);
		this.method6866();
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		this.aClass144_Sub1_20.method5706(1);
		this.aClass144_Sub1_20.method5643((Interface25) null);
		this.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
		this.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
		this.aClass144_Sub1_20.method5740(Static216.aClass138_5, 2);
		this.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
		this.aClass144_Sub1_20.method5706(0);
		if (this.aBoolean17) {
			this.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
			this.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
			this.aBoolean17 = false;
		}
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass144_Sub1_Sub1_1.method3735((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
		if (arg1 != null) {
			if (this.aBoolean17) {
				this.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
				this.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
				this.aBoolean17 = false;
			}
			this.aClass144_Sub1_20.method5643(arg1);
			this.aClass144_Sub1_20.method5723(arg0);
		} else if (!this.aBoolean17) {
			this.aClass144_Sub1_20.method5643(this.aClass144_Sub1_20.anInterface25_3);
			this.aClass144_Sub1_20.method5723(1);
			this.aClass144_Sub1_20.method5740(Static225.aClass138_3, 0);
			this.aClass144_Sub1_20.method5779(0, Static225.aClass138_3);
			this.aBoolean17 = true;
		}
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(B)V")
	@Override
	public void method6872() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(16) IDirect3DDevice local16 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(23) Class263_Sub2 local23 = this.aClass144_Sub1_20.method5737();
			local16.SetVertexShaderConstantF(8, local23.method7281(Static13.aFloatArray1), 2);
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(B)V")
	@Override
	public void method6875() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(16) Class263_Sub2 local16 = this.aClass144_Sub1_Sub1_1.method5765();
			local9.a(0, local16.method7298(Static13.aFloatArray1));
		}
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)V")
	@Override
	public void method6876() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1;
			local13.a(4, this.aClass144_Sub1_20.method5668(Static13.aFloatArray1));
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	@Override
	public void method6869() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(22) Class263_Sub2 local22 = this.aClass144_Sub1_Sub1_1.method5765();
			local17.a(0, local22.method7298(Static13.aFloatArray1));
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
	@Override
	public void method6868() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1;
		@Pc(19) int local19 = this.aClass144_Sub1_20.XA();
		@Pc(23) int local23 = this.aClass144_Sub1_20.i();
		@Pc(34) float local34 = (float) local19 - (float) (local19 - local23) * 0.125F;
		@Pc(44) float local44 = (float) local19 - (float) (local19 - local23) * 0.25F;
		local15.b(10, local44, 1.0F / (local34 - local44), local34, 1.0F / ((float) local19 - local34));
		local15.b(11, 1.0F / (float) this.aClass144_Sub1_20.method5701(), (float) this.aClass144_Sub1_20.method5658() / 255.0F, this.aClass144_Sub1_20.aFloat99, 1.0F / (this.aClass144_Sub1_20.aFloat99 - this.aClass144_Sub1_20.aFloat94));
		this.aClass144_Sub1_20.method5655(this.aClass144_Sub1_20.method5684());
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return this.aBoolean15;
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
	@Override
	public void method6866() {
		@Pc(3) IDirect3DDevice local3 = this.aClass144_Sub1_Sub1_1.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass144_Sub1_20.method5676();
		@Pc(22) Class263_Sub2 local22 = this.aClass144_Sub1_20.method5674();
		@Pc(37) IDirect3DVertexShader local37;
		if (this.aBoolean16) {
			local37 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader2;
		} else {
			local37 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader1;
		}
		if (this.anIDirect3DVertexShader3 != local37) {
			this.anIDirect3DVertexShader3 = local37;
			this.aClass144_Sub1_Sub1_1.method3735(local37);
			this.method263();
			this.method6876();
			this.method6872();
			this.method6869();
			this.method6875();
			this.method6868();
		}
		local22.method7286((float) local8, 0.0F, -1.0F, 0.0F, Static13.aFloatArray2);
		local3.a(12, Static13.aFloatArray2);
	}
}
