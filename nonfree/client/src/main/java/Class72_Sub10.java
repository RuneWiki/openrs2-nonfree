import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class72_Sub10 extends Class72 {

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!tu", name = "w", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Lclient!eda;")
	private final Class45_Sub2_Sub1 aClass45_Sub2_Sub1_8;

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "Lclient!pm;")
	private Interface17 anInterface17_6;

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "Z")
	private final boolean aBoolean639;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!eda;Lclient!tf;)V")
	public Class72_Sub10(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class322 arg1) {
		super(arg0);
		this.aClass45_Sub2_Sub1_8 = arg0;
		if (arg1 == null || (this.aClass45_Sub2_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean639 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method6810("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method6810("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method6810("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader7 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method6810("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader7 != null) {
				this.anInterface17_6 = this.aClass45_Sub2_22.method4904(false, 1, 2, new int[] { 0, -1 });
				this.anInterface17_6.method6973(false, false);
				this.aBoolean639 = true;
			} else {
				this.aBoolean639 = false;
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	@Override
	public void method7183() {
		@Pc(3) IDirect3DDevice local3 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass45_Sub2_22.method4996();
		@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_22.method4984();
		@Pc(31) IDirect3DVertexShader local31;
		if (this.aBoolean640) {
			local31 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader7;
		} else {
			local31 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader6;
		}
		if (this.anIDirect3DVertexShader5 != local31) {
			this.anIDirect3DVertexShader5 = local31;
			local3.SetVertexShader(local31);
			this.method6956();
			this.method7190();
			this.method7191();
			this.method7185();
			this.method7186();
			this.method7192();
		}
		local13.method172(0.0F, -1.0F, 0.0F, Static518.aFloatArray92, (float) local8);
		local3.a(12, Static518.aFloatArray92);
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return this.aBoolean639;
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
	@Override
	public void method7192() {
		if (this.anIDirect3DVertexShader5 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(10) int local10 = this.aClass45_Sub2_22.U();
		@Pc(14) int local14 = this.aClass45_Sub2_22.BA();
		@Pc(26) float local26 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(38) float local38 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		local6.a(10, local38, 1.0F / (local26 - local38), local26, 1.0F / ((float) local10 - local26));
		local6.a(11, 1.0F / (float) this.aClass45_Sub2_22.method4973(), (float) this.aClass45_Sub2_22.method5023() / 255.0F, this.aClass45_Sub2_22.aFloat128, 1.0F / (this.aClass45_Sub2_22.aFloat128 - this.aClass45_Sub2_22.aFloat129));
		this.aClass45_Sub2_22.method4912(this.aClass45_Sub2_22.method4915());
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	@Override
	public void method7186() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(16) Class11_Sub1 local16 = this.aClass45_Sub2_Sub1_8.method4989();
			local11.a(0, local16.method174(Static518.aFloatArray91));
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		this.aClass45_Sub2_22.method4961(1);
		this.aClass45_Sub2_22.method4926(null);
		this.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
		this.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
		this.aClass45_Sub2_22.method4953(2, Static62.aClass108_1);
		this.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
		this.aClass45_Sub2_22.method4961(0);
		this.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
		this.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
		if (this.anIDirect3DVertexShader5 != null) {
			this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader5 = null;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		if (arg1 == null) {
			this.aClass45_Sub2_22.method4926(this.aClass45_Sub2_22.anInterface11_3);
			this.aClass45_Sub2_22.method4939(1);
			this.aClass45_Sub2_22.method4953(0, Static160.aClass108_2);
			this.aClass45_Sub2_22.method4900(0, Static160.aClass108_2);
		} else {
			this.aClass45_Sub2_22.method4926(arg1);
			this.aClass45_Sub2_22.method4939(arg0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		this.aBoolean640 = arg0;
		this.aClass45_Sub2_22.method4961(1);
		this.aClass45_Sub2_22.method4926(this.anInterface17_6);
		this.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static479.aClass307_6);
		this.aClass45_Sub2_22.method4953(0, Static62.aClass108_1);
		this.aClass45_Sub2_22.method5010(2, false, true, Static164.aClass108_3);
		this.aClass45_Sub2_22.method4900(0, Static160.aClass108_2);
		this.aClass45_Sub2_22.method4961(0);
		this.method7183();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V")
	@Override
	public void method7191() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(12) Class11_Sub1 local12 = this.aClass45_Sub2_22.method4970();
			local7.SetVertexShaderConstantF(8, local12.method178(Static518.aFloatArray91), 2);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	@Override
	public void method7185() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_Sub1_8.method4989();
			local8.a(0, local13.method174(Static518.aFloatArray91));
		}
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V")
	@Override
	public void method7190() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1;
			local6.a(4, this.aClass45_Sub2_22.method5017(Static518.aFloatArray91));
		}
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
	private void method6956() {
		if (this.anIDirect3DVertexShader5 == null || !this.aBoolean640) {
			return;
		}
		@Pc(13) Class11_Sub1 local13 = this.aClass45_Sub2_22.method5014();
		@Pc(17) IDirect3DDevice local17 = this.aClass45_Sub2_Sub1_8.anIDirect3DDevice1;
		local17.a(13, this.aClass45_Sub2_22.aFloat131 * this.aClass45_Sub2_22.aFloat134, this.aClass45_Sub2_22.aFloat134 * this.aClass45_Sub2_22.aFloat123, this.aClass45_Sub2_22.aFloat134 * this.aClass45_Sub2_22.bf, 1.0F);
		local17.a(14, this.aClass45_Sub2_22.aFloat135 * this.aClass45_Sub2_22.aFloat131, this.aClass45_Sub2_22.aFloat135 * this.aClass45_Sub2_22.aFloat123, this.aClass45_Sub2_22.aFloat135 * this.aClass45_Sub2_22.bf, 1.0F);
		local17.a(16, this.aClass45_Sub2_22.aFloat133 * this.aClass45_Sub2_22.aFloat131, this.aClass45_Sub2_22.aFloat123 * this.aClass45_Sub2_22.aFloat133, this.aClass45_Sub2_22.aFloat133 * this.aClass45_Sub2_22.bf, 1.0F);
		local13.method173(Static518.aFloatArray92, this.aClass45_Sub2_22.aFloatArray66[2], this.aClass45_Sub2_22.aFloatArray66[0], this.aClass45_Sub2_22.aFloatArray66[1]);
		local17.SetVertexShaderConstantF(15, Static518.aFloatArray92, 1);
		local13.method173(Static518.aFloatArray92, this.aClass45_Sub2_22.aFloatArray61[2], this.aClass45_Sub2_22.aFloatArray61[0], this.aClass45_Sub2_22.aFloatArray61[1]);
		local17.SetVertexShaderConstantF(17, Static518.aFloatArray92, 1);
	}
}
