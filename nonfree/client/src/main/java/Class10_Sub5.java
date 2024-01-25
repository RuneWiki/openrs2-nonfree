import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
	private boolean aBoolean425;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "Lclient!tha;")
	private final Class22_Sub2_Sub1 aClass22_Sub2_Sub1_6;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Lclient!pt;")
	private Interface16 anInterface16_1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!tha;Lclient!ik;)V")
	public Class10_Sub5(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class182 arg1) {
		super(arg0);
		this.aClass22_Sub2_Sub1_6 = arg0;
		if (arg1 == null || (this.aClass22_Sub2_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean426 = false;
		} else {
			this.anIDirect3DVertexShader2 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1.b(arg1.method3958("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1.b(arg1.method3958("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1.b(arg1.method3958("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1.b(arg1.method3958("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null) {
				this.anInterface16_1 = this.aClass22_Sub2_23.method8950(new int[] { 0, -1 }, 2, 1, false);
				this.anInterface16_1.method8248(false, false);
				this.aBoolean426 = true;
			} else {
				this.aBoolean426 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		this.aBoolean425 = arg0;
		this.aClass22_Sub2_23.method8896(1);
		this.aClass22_Sub2_23.method8976(this.anInterface16_1);
		this.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static240.aClass372_6);
		this.aClass22_Sub2_23.method8962(Static547.aClass392_3, 0);
		this.aClass22_Sub2_23.method8954(2, false, true, Static358.aClass392_1);
		this.aClass22_Sub2_23.method8897(Static671.aClass392_4, 0);
		this.aClass22_Sub2_23.method8896(0);
		this.method9554();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return this.aBoolean426;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
	@Override
	public void method9554() {
		@Pc(3) IDirect3DDevice local3 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass22_Sub2_23.method8877();
		@Pc(13) Class58_Sub2 local13 = this.aClass22_Sub2_23.method8913();
		@Pc(28) IDirect3DVertexShader local28;
		if (this.aBoolean425) {
			local28 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader5;
		} else {
			local28 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader4;
		}
		if (this.anIDirect3DVertexShader3 != local28) {
			this.anIDirect3DVertexShader3 = local28;
			this.aClass22_Sub2_Sub1_6.method8195(local28);
			this.method5486();
			this.method9553();
			this.method9548();
			this.method9556();
			this.method9547();
			this.method9550();
		}
		local13.method6091((float) local8, 0.0F, -1.0F, 0.0F, Static409.aFloatArray44);
		local3.a(12, Static409.aFloatArray44);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public void method9556() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(14) Class58_Sub2 local14 = this.aClass22_Sub2_Sub1_6.method8942();
			local9.a(0, local14.method6107(Static409.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	@Override
	public void method9550() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass22_Sub2_23.XA();
		@Pc(15) int local15 = this.aClass22_Sub2_23.i();
		@Pc(25) float local25 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(37) float local37 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.b(10, local37, 1.0F / (local25 - local37), local25, 1.0F / ((float) local11 - local25));
		local7.b(11, 1.0F / (float) this.aClass22_Sub2_23.method8870(), (float) this.aClass22_Sub2_23.method8865() / 255.0F, this.aClass22_Sub2_23.aFloat181, 1.0F / (this.aClass22_Sub2_23.aFloat181 - this.aClass22_Sub2_23.aFloat187));
		this.aClass22_Sub2_23.method8930(this.aClass22_Sub2_23.method8932());
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
	@Override
	public void method9547() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(14) Class58_Sub2 local14 = this.aClass22_Sub2_Sub1_6.method8942();
			local9.a(0, local14.method6107(Static409.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	@Override
	public void method9553() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1;
			local7.a(4, this.aClass22_Sub2_23.method8946(Static409.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		this.aClass22_Sub2_23.method8896(1);
		this.aClass22_Sub2_23.method8976((Interface21) null);
		this.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
		this.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
		this.aClass22_Sub2_23.method8962(Static547.aClass392_3, 2);
		this.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
		this.aClass22_Sub2_23.method8896(0);
		if (this.aBoolean427) {
			this.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
			this.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
			this.aBoolean427 = false;
		}
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass22_Sub2_Sub1_6.method8195((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean427) {
				this.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
				this.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
				this.aBoolean427 = false;
			}
			this.aClass22_Sub2_23.method8976(arg0);
			this.aClass22_Sub2_23.method8853(arg1);
		} else if (!this.aBoolean427) {
			this.aClass22_Sub2_23.method8976(this.aClass22_Sub2_23.anInterface21_3);
			this.aClass22_Sub2_23.method8853(1);
			this.aClass22_Sub2_23.method8962(Static671.aClass392_4, 0);
			this.aClass22_Sub2_23.method8897(Static671.aClass392_4, 0);
			this.aBoolean427 = true;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V")
	@Override
	public void method9548() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(16) IDirect3DDevice local16 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(21) Class58_Sub2 local21 = this.aClass22_Sub2_23.method8921();
			local16.SetVertexShaderConstantF(8, local21.method6109(Static409.aFloatArray45), 2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
	private void method5486() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean425) {
			return;
		}
		@Pc(18) Class58_Sub2 local18 = this.aClass22_Sub2_23.method8907();
		@Pc(22) IDirect3DDevice local22 = this.aClass22_Sub2_Sub1_6.anIDirect3DDevice1;
		local22.b(13, this.aClass22_Sub2_23.aFloat186 * this.aClass22_Sub2_23.aFloat182, this.aClass22_Sub2_23.aFloat178 * this.aClass22_Sub2_23.aFloat182, this.aClass22_Sub2_23.aFloat182 * this.aClass22_Sub2_23.aFloat185, 1.0F);
		local22.b(14, this.aClass22_Sub2_23.aFloat186 * this.aClass22_Sub2_23.aFloat188, this.aClass22_Sub2_23.aFloat178 * this.aClass22_Sub2_23.aFloat188, this.aClass22_Sub2_23.aFloat185 * this.aClass22_Sub2_23.aFloat188, 1.0F);
		local22.b(16, this.aClass22_Sub2_23.aFloat190 * this.aClass22_Sub2_23.aFloat186, this.aClass22_Sub2_23.aFloat178 * this.aClass22_Sub2_23.aFloat190, this.aClass22_Sub2_23.aFloat190 * this.aClass22_Sub2_23.aFloat185, 1.0F);
		local18.method6114(this.aClass22_Sub2_23.aFloatArray72[2], Static409.aFloatArray44, this.aClass22_Sub2_23.aFloatArray72[1], this.aClass22_Sub2_23.aFloatArray72[0]);
		local22.SetVertexShaderConstantF(15, Static409.aFloatArray44, 1);
		local18.method6114(this.aClass22_Sub2_23.aFloatArray76[2], Static409.aFloatArray44, this.aClass22_Sub2_23.aFloatArray76[1], this.aClass22_Sub2_23.aFloatArray76[0]);
		local22.SetVertexShaderConstantF(17, Static409.aFloatArray44, 1);
	}
}
