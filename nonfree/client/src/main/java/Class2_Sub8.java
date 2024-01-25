import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!uaa", name = "p", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!uaa", name = "l", descriptor = "Lclient!ega;")
	private final Class78_Sub1_Sub1 aClass78_Sub1_Sub1_9;

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!uaa", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!uaa", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lclient!cm;")
	private Interface5 anInterface5_6;

	@OriginalMember(owner = "client!uaa", name = "m", descriptor = "Z")
	private final boolean aBoolean664;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!ega;Lclient!sea;)V")
	public Class2_Sub8(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class308 arg1) {
		super(arg0);
		this.aClass78_Sub1_Sub1_9 = arg0;
		if (arg1 == null || (this.aClass78_Sub1_Sub1_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean664 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method6557("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method6557("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method6557("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader7 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method6557("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader7 != null) {
				this.anInterface5_6 = this.aClass78_Sub1_23.method6874(false, new int[] { 0, -1 }, 1, 2);
				this.anInterface5_6.method7314(false, false);
				this.aBoolean664 = true;
			} else {
				this.aBoolean664 = false;
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		this.aClass78_Sub1_23.method6867(1);
		this.aClass78_Sub1_23.method6931(null);
		this.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
		this.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
		this.aClass78_Sub1_23.method6975(Static276.aClass148_4, 2);
		this.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
		this.aClass78_Sub1_23.method6867(0);
		this.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
		this.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
		if (this.anIDirect3DVertexShader5 != null) {
			this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader5 = null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		this.aBoolean665 = arg0;
		this.aClass78_Sub1_23.method6867(1);
		this.aClass78_Sub1_23.method6931(this.anInterface5_6);
		this.aClass78_Sub1_23.method6864(Static585.aClass118_5, Static569.aClass118_4);
		this.aClass78_Sub1_23.method6975(Static276.aClass148_4, 0);
		this.aClass78_Sub1_23.method6959(false, 2, true, Static47.aClass148_1);
		this.aClass78_Sub1_23.method6903(0, Static226.aClass148_3);
		this.aClass78_Sub1_23.method6867(0);
		this.method7903();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)V")
	@Override
	public void method7903() {
		@Pc(3) IDirect3DDevice local3 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass78_Sub1_23.method6894();
		@Pc(13) Class34_Sub1 local13 = this.aClass78_Sub1_23.method6888();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean665) {
			local33 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader7;
		} else {
			local33 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader6;
		}
		if (this.anIDirect3DVertexShader5 != local33) {
			this.anIDirect3DVertexShader5 = local33;
			local3.SetVertexShader(local33);
			this.method7198();
			this.method7896();
			this.method7890();
			this.method7898();
			this.method7900();
			this.method7891();
		}
		local13.method890(Static521.aFloatArray77, -1.0F, 0.0F, (float) local8, 0.0F);
		local3.a(12, Static521.aFloatArray77);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
		if (arg1 == null) {
			this.aClass78_Sub1_23.method6931(this.aClass78_Sub1_23.anInterface20_3);
			this.aClass78_Sub1_23.method6943(1);
			this.aClass78_Sub1_23.method6975(Static226.aClass148_3, 0);
			this.aClass78_Sub1_23.method6903(0, Static226.aClass148_3);
		} else {
			this.aClass78_Sub1_23.method6931(arg1);
			this.aClass78_Sub1_23.method6943(arg0);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	@Override
	public void method7890() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(15) Class34_Sub1 local15 = this.aClass78_Sub1_23.method6893();
			local10.SetVertexShaderConstantF(8, local15.method887(Static521.aFloatArray76), 2);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)V")
	private void method7198() {
		if (this.anIDirect3DVertexShader5 == null || !this.aBoolean665) {
			return;
		}
		@Pc(15) Class34_Sub1 local15 = this.aClass78_Sub1_23.method6971();
		@Pc(19) IDirect3DDevice local19 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1;
		local19.a(13, this.aClass78_Sub1_23.aFloat215 * this.aClass78_Sub1_23.aFloat213, this.aClass78_Sub1_23.aFloat213 * this.aClass78_Sub1_23.aFloat220, this.aClass78_Sub1_23.aFloat214 * this.aClass78_Sub1_23.aFloat213, 1.0F);
		local19.a(14, this.aClass78_Sub1_23.aFloat219 * this.aClass78_Sub1_23.aFloat215, this.aClass78_Sub1_23.aFloat220 * this.aClass78_Sub1_23.aFloat219, this.aClass78_Sub1_23.aFloat214 * this.aClass78_Sub1_23.aFloat219, 1.0F);
		local19.a(16, this.aClass78_Sub1_23.aFloat225 * this.aClass78_Sub1_23.aFloat215, this.aClass78_Sub1_23.aFloat220 * this.aClass78_Sub1_23.aFloat225, this.aClass78_Sub1_23.aFloat225 * this.aClass78_Sub1_23.aFloat214, 1.0F);
		local15.method893(this.aClass78_Sub1_23.aFloatArray72[1], Static521.aFloatArray77, this.aClass78_Sub1_23.aFloatArray72[2], this.aClass78_Sub1_23.aFloatArray72[0]);
		local19.SetVertexShaderConstantF(15, Static521.aFloatArray77, 1);
		local15.method893(this.aClass78_Sub1_23.aFloatArray74[1], Static521.aFloatArray77, this.aClass78_Sub1_23.aFloatArray74[2], this.aClass78_Sub1_23.aFloatArray74[0]);
		local19.SetVertexShaderConstantF(17, Static521.aFloatArray77, 1);
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)V")
	@Override
	public void method7900() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(11) Class34_Sub1 local11 = this.aClass78_Sub1_Sub1_9.method6987();
			local6.a(0, local11.method888(Static521.aFloatArray76));
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	@Override
	public void method7891() {
		if (this.anIDirect3DVertexShader5 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass78_Sub1_23.U();
		@Pc(22) int local22 = this.aClass78_Sub1_23.BA();
		@Pc(33) float local33 = -((float) (local18 - local22) * 0.125F) + (float) local18;
		@Pc(45) float local45 = -((float) (local18 - local22) * 0.25F) + (float) local18;
		local14.a(10, local45, 1.0F / (local33 - local45), local33, 1.0F / ((float) local18 - local33));
		local14.a(11, 1.0F / (float) this.aClass78_Sub1_23.method6905(), (float) this.aClass78_Sub1_23.method6924() / 255.0F, this.aClass78_Sub1_23.aFloat217, 1.0F / (this.aClass78_Sub1_23.aFloat217 - this.aClass78_Sub1_23.aFloat223));
		this.aClass78_Sub1_23.method6917(this.aClass78_Sub1_23.method6928());
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)V")
	@Override
	public void method7896() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1;
			local6.a(4, this.aClass78_Sub1_23.method6930(Static521.aFloatArray76));
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	@Override
	public void method7898() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass78_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(17) Class34_Sub1 local17 = this.aClass78_Sub1_Sub1_9.method6987();
			local10.a(0, local17.method888(Static521.aFloatArray76));
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return this.aBoolean664;
	}
}
