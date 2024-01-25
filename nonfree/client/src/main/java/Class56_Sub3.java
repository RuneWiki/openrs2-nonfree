import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Z")
	private boolean aBoolean322;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!gaa;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_5;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "Lclient!ls;")
	private Interface14 anInterface14_4;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Z")
	private final boolean aBoolean323;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!gaa;Lclient!pl;)V")
	public Class56_Sub3(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class259 arg1) {
		super(arg0);
		this.aClass100_Sub1_Sub1_5 = arg0;
		if (arg1 == null || (this.aClass100_Sub1_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean323 = false;
		} else {
			this.anIDirect3DVertexShader6 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method5965("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader3 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method5965("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method5965("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader2 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method5965("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface14_4 = this.aClass100_Sub1_23.method4838(2, false, 1, new int[] { 0, -1 });
				this.anInterface14_4.method7067(false, false);
				this.aBoolean323 = true;
			} else {
				this.aBoolean323 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return this.aBoolean323;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg1 == null) {
			this.aClass100_Sub1_23.method4876(this.aClass100_Sub1_23.anInterface10_3);
			this.aClass100_Sub1_23.method4872(1);
			this.aClass100_Sub1_23.method4883(0, Static48.aClass119_5);
			this.aClass100_Sub1_23.method4816(0, Static48.aClass119_5);
		} else {
			this.aClass100_Sub1_23.method4876(arg1);
			this.aClass100_Sub1_23.method4872(arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	@Override
	public void method7185() {
		@Pc(3) IDirect3DDevice local3 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass100_Sub1_23.method4768();
		@Pc(13) Class68_Sub2 local13 = this.aClass100_Sub1_23.method4811();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean322) {
			local25 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader2;
		} else {
			local25 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader4 != local25) {
			this.anIDirect3DVertexShader4 = local25;
			local3.SetVertexShader(local25);
			this.method3236();
			this.method7179();
			this.method7181();
			this.method7175();
			this.method7176();
			this.method7177();
		}
		local13.method5121(0.0F, Static194.aFloatArray34, -1.0F, (float) local8, 0.0F);
		local3.a(12, Static194.aFloatArray34);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	@Override
	public void method7175() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(17) Class68_Sub2 local17 = this.aClass100_Sub1_Sub1_5.method4842();
			local12.a(0, local17.method5119(Static194.aFloatArray35));
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	@Override
	public void method7181() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(20) Class68_Sub2 local20 = this.aClass100_Sub1_23.method4792();
			local15.SetVertexShaderConstantF(8, local20.method5101(Static194.aFloatArray35), 2);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	private void method3236() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean322) {
			return;
		}
		@Pc(11) Class68_Sub2 local11 = this.aClass100_Sub1_23.method4880();
		@Pc(15) IDirect3DDevice local15 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
		local15.a(13, this.aClass100_Sub1_23.aFloat166 * this.aClass100_Sub1_23.aFloat152, this.aClass100_Sub1_23.aFloat166 * this.aClass100_Sub1_23.aFloat161, this.aClass100_Sub1_23.aFloat166 * this.aClass100_Sub1_23.aFloat156, 1.0F);
		local15.a(14, this.aClass100_Sub1_23.aFloat152 * this.aClass100_Sub1_23.aFloat159, this.aClass100_Sub1_23.aFloat159 * this.aClass100_Sub1_23.aFloat161, this.aClass100_Sub1_23.aFloat159 * this.aClass100_Sub1_23.aFloat156, 1.0F);
		local15.a(16, this.aClass100_Sub1_23.aFloat162 * this.aClass100_Sub1_23.aFloat152, this.aClass100_Sub1_23.aFloat161 * this.aClass100_Sub1_23.aFloat162, this.aClass100_Sub1_23.aFloat162 * this.aClass100_Sub1_23.aFloat156, 1.0F);
		local11.method5111(this.aClass100_Sub1_23.aFloatArray52[0], Static194.aFloatArray34, this.aClass100_Sub1_23.aFloatArray52[1], this.aClass100_Sub1_23.aFloatArray52[2]);
		local15.SetVertexShaderConstantF(15, Static194.aFloatArray34, 1);
		local11.method5111(this.aClass100_Sub1_23.aFloatArray48[0], Static194.aFloatArray34, this.aClass100_Sub1_23.aFloatArray48[1], this.aClass100_Sub1_23.aFloatArray48[2]);
		local15.SetVertexShaderConstantF(17, Static194.aFloatArray34, 1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	@Override
	public void method7176() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(12) Class68_Sub2 local12 = this.aClass100_Sub1_Sub1_5.method4842();
			local7.a(0, local12.method5119(Static194.aFloatArray35));
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		this.aClass100_Sub1_23.method4860(1);
		this.aClass100_Sub1_23.method4876(null);
		this.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
		this.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
		this.aClass100_Sub1_23.method4883(2, Static224.aClass119_18);
		this.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
		this.aClass100_Sub1_23.method4860(0);
		this.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
		this.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
			local7.a(4, this.aClass100_Sub1_23.method4809(Static194.aFloatArray35));
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		this.aBoolean322 = arg0;
		this.aClass100_Sub1_23.method4860(1);
		this.aClass100_Sub1_23.method4876(this.anInterface14_4);
		this.aClass100_Sub1_23.method4797(Static583.aClass236_5, Static291.aClass236_2);
		this.aClass100_Sub1_23.method4883(0, Static224.aClass119_18);
		this.aClass100_Sub1_23.method4875(false, Static325.aClass119_44, 2, true);
		this.aClass100_Sub1_23.method4816(0, Static48.aClass119_5);
		this.aClass100_Sub1_23.method4860(0);
		this.method7185();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	@Override
	public void method7177() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass100_Sub1_23.U();
		@Pc(15) int local15 = this.aClass100_Sub1_23.BA();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(38) float local38 = (float) local11 - (float) (local11 - local15) * 0.25F;
		local7.a(10, local38, 1.0F / (local27 - local38), local27, 1.0F / ((float) local11 - local27));
		local7.a(11, 1.0F / (float) this.aClass100_Sub1_23.method4864(), (float) this.aClass100_Sub1_23.method4847() / 255.0F, this.aClass100_Sub1_23.bf, 1.0F / (this.aClass100_Sub1_23.bf - this.aClass100_Sub1_23.aFloat151));
		this.aClass100_Sub1_23.method4877(this.aClass100_Sub1_23.method4789());
	}
}
