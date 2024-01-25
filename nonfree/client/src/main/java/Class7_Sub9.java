import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class7_Sub9 extends Class7 {

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Z")
	private boolean aBoolean567;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!rd;")
	private final Class95_Sub3_Sub1 aClass95_Sub3_Sub1_6;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "Z")
	private final boolean aBoolean569;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "Lclient!oia;")
	private Interface19 anInterface19_5;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!rd;Lclient!wu;)V")
	public Class7_Sub9(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class380 arg1) {
		super(arg0);
		this.aClass95_Sub3_Sub1_6 = arg0;
		if (arg1 == null || (this.aClass95_Sub3_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean569 = false;
		} else {
			this.anIDirect3DVertexShader2 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1.b(arg1.method8628("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1.b(arg1.method8628("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1.b(arg1.method8628("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1.b(arg1.method8628("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface19_5 = this.aClass95_Sub3_23.method7116(false, 2, 1, new int[] { 0, -1 });
				this.anInterface19_5.method3138(false, false);
				this.aBoolean569 = true;
			} else {
				this.aBoolean569 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		this.aBoolean567 = arg0;
		this.aClass95_Sub3_23.method7145(1);
		this.aClass95_Sub3_23.method7112(this.anInterface19_5);
		this.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static504.aClass136_8);
		this.aClass95_Sub3_23.method7139(0, Static185.aClass291_3);
		this.aClass95_Sub3_23.method7028(2, true, Static634.aClass291_4, false);
		this.aClass95_Sub3_23.method7095(0, Static10.aClass291_1);
		this.aClass95_Sub3_23.method7145(0);
		this.method8136();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		if (arg1 != null) {
			if (this.aBoolean568) {
				this.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
				this.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
				this.aBoolean568 = false;
			}
			this.aClass95_Sub3_23.method7112(arg1);
			this.aClass95_Sub3_23.method7026(arg0);
		} else if (!this.aBoolean568) {
			this.aClass95_Sub3_23.method7112(this.aClass95_Sub3_23.anInterface17_3);
			this.aClass95_Sub3_23.method7026(1);
			this.aClass95_Sub3_23.method7139(0, Static10.aClass291_1);
			this.aClass95_Sub3_23.method7095(0, Static10.aClass291_1);
			this.aBoolean568 = true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V")
	@Override
	public void method8134() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1;
			@Pc(12) Class177_Sub1 local12 = this.aClass95_Sub3_Sub1_6.method7113();
			local7.a(0, local12.method3839(Static479.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return this.aBoolean569;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	@Override
	public void method8133() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1;
			@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_Sub1_6.method7113();
			local8.a(0, local13.method3839(Static479.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V")
	@Override
	public void method8136() {
		@Pc(3) IDirect3DDevice local3 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass95_Sub3_23.method7049();
		@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_23.method7084();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean567) {
			local27 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader5;
		} else {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader4;
		}
		if (this.anIDirect3DVertexShader6 != local27) {
			this.anIDirect3DVertexShader6 = local27;
			this.aClass95_Sub3_Sub1_6.method6738(local27);
			this.method6475();
			this.method8129();
			this.method8131();
			this.method8134();
			this.method8133();
			this.method8130();
		}
		local13.method3845(Static479.aFloatArray54, -1.0F, 0.0F, 0.0F, (float) local8);
		local3.a(12, Static479.aFloatArray54);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V")
	@Override
	public void method8130() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass95_Sub3_23.XA();
		@Pc(22) int local22 = this.aClass95_Sub3_23.i();
		@Pc(33) float local33 = -((float) (local18 - local22) * 0.125F) + (float) local18;
		@Pc(43) float local43 = (float) local18 - (float) (local18 - local22) * 0.25F;
		local14.b(10, local43, 1.0F / (local33 - local43), local33, 1.0F / ((float) local18 - local33));
		local14.b(11, 1.0F / (float) this.aClass95_Sub3_23.method7115(), (float) this.aClass95_Sub3_23.method7108() / 255.0F, this.aClass95_Sub3_23.aFloat179, 1.0F / (this.aClass95_Sub3_23.aFloat179 - this.aClass95_Sub3_23.aFloat175));
		this.aClass95_Sub3_23.method7079(this.aClass95_Sub3_23.method7025());
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	@Override
	public void method8131() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1;
			@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_23.method7053();
			local8.SetVertexShaderConstantF(8, local13.method3826(Static479.aFloatArray53), 2);
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
	@Override
	public void method8129() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1;
			local7.a(4, this.aClass95_Sub3_23.method7038(Static479.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		this.aClass95_Sub3_23.method7145(1);
		this.aClass95_Sub3_23.method7112(null);
		this.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
		this.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
		this.aClass95_Sub3_23.method7139(2, Static185.aClass291_3);
		this.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
		this.aClass95_Sub3_23.method7145(0);
		if (this.aBoolean568) {
			this.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
			this.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
			this.aBoolean568 = false;
		}
		if (this.anIDirect3DVertexShader6 != null) {
			this.aClass95_Sub3_Sub1_6.method6738(null);
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	private void method6475() {
		if (this.anIDirect3DVertexShader6 == null || !this.aBoolean567) {
			return;
		}
		@Pc(11) Class177_Sub1 local11 = this.aClass95_Sub3_23.method7101();
		@Pc(15) IDirect3DDevice local15 = this.aClass95_Sub3_Sub1_6.anIDirect3DDevice1;
		local15.b(13, this.aClass95_Sub3_23.aFloat183 * this.aClass95_Sub3_23.aFloat178, this.aClass95_Sub3_23.aFloat172 * this.aClass95_Sub3_23.aFloat178, this.aClass95_Sub3_23.aFloat181 * this.aClass95_Sub3_23.aFloat178, 1.0F);
		local15.b(14, this.aClass95_Sub3_23.aFloat174 * this.aClass95_Sub3_23.aFloat183, this.aClass95_Sub3_23.aFloat172 * this.aClass95_Sub3_23.aFloat174, this.aClass95_Sub3_23.aFloat174 * this.aClass95_Sub3_23.aFloat181, 1.0F);
		local15.b(16, this.aClass95_Sub3_23.aFloat188 * this.aClass95_Sub3_23.aFloat183, this.aClass95_Sub3_23.aFloat188 * this.aClass95_Sub3_23.aFloat172, this.aClass95_Sub3_23.aFloat181 * this.aClass95_Sub3_23.aFloat188, 1.0F);
		local11.method3847(this.aClass95_Sub3_23.aFloatArray72[2], this.aClass95_Sub3_23.aFloatArray72[0], this.aClass95_Sub3_23.aFloatArray72[1], Static479.aFloatArray54);
		local15.SetVertexShaderConstantF(15, Static479.aFloatArray54, 1);
		local11.method3847(this.aClass95_Sub3_23.aFloatArray69[2], this.aClass95_Sub3_23.aFloatArray69[0], this.aClass95_Sub3_23.aFloatArray69[1], Static479.aFloatArray54);
		local15.SetVertexShaderConstantF(17, Static479.aFloatArray54, 1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
