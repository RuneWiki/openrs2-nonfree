import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class23_Sub4 extends Class23 {

	@OriginalMember(owner = "client!fba", name = "q", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "Lclient!os;")
	private final Class75_Sub1_Sub2 aClass75_Sub1_Sub2_2;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "Z")
	private final boolean aBoolean249;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "Lclient!cf;")
	private Interface7 anInterface7_3;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!os;Lclient!lga;)V")
	public Class23_Sub4(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class223 arg1) {
		super(arg0);
		this.aClass75_Sub1_Sub2_2 = arg0;
		if (arg1 == null || (this.aClass75_Sub1_Sub2_2.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean249 = false;
		} else {
			this.anIDirect3DVertexShader2 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1.a(arg1.method5284("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1.a(arg1.method5284("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1.a(arg1.method5284("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader1 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1.a(arg1.method5284("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader1 != null) {
				this.anInterface7_3 = this.aClass75_Sub1_22.method6727(2, false, new int[] { 0, -1 }, 1);
				this.anInterface7_3.method8723(false, false);
				this.aBoolean249 = true;
			} else {
				this.aBoolean249 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8168() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1;
			local15.a(4, this.aClass75_Sub1_22.method6800(Static151.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)V")
	@Override
	public void method8170() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(13) Class109_Sub3 local13 = this.aClass75_Sub1_22.method6836();
			local8.SetVertexShaderConstantF(8, local13.method4360(Static151.aFloatArray39), 2);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		this.aBoolean248 = arg0;
		this.aClass75_Sub1_22.method6805(1);
		this.aClass75_Sub1_22.method6814(this.anInterface7_3);
		this.aClass75_Sub1_22.method6743(Static399.aClass344_3, Static571.aClass344_5);
		this.aClass75_Sub1_22.method6795(0, Static389.aClass261_8);
		this.aClass75_Sub1_22.method6831(true, false, Static24.aClass261_1, 2);
		this.aClass75_Sub1_22.method6816(0, Static110.aClass261_3);
		this.aClass75_Sub1_22.method6805(0);
		this.method8163();
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
	@Override
	public void method8171() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1;
		@Pc(20) int local20 = this.aClass75_Sub1_22.XA();
		@Pc(24) int local24 = this.aClass75_Sub1_22.i();
		@Pc(35) float local35 = (float) local20 - (float) (local20 - local24) * 0.125F;
		@Pc(46) float local46 = (float) local20 - (float) (local20 - local24) * 0.25F;
		local16.a(10, local46, 1.0F / (local35 - local46), local35, 1.0F / ((float) local20 - local35));
		local16.a(11, 1.0F / (float) this.aClass75_Sub1_22.method6729(), (float) this.aClass75_Sub1_22.method6810() / 255.0F, this.aClass75_Sub1_22.aFloat155, 1.0F / (this.aClass75_Sub1_22.aFloat155 - this.aClass75_Sub1_22.aFloat142));
		this.aClass75_Sub1_22.method6801(this.aClass75_Sub1_22.method6792());
	}

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
	@Override
	public void method8169() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(19) Class109_Sub3 local19 = this.aClass75_Sub1_Sub2_2.method6848();
			local14.a(0, local19.method4357(Static151.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "(I)V")
	private void method2940() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean248) {
			return;
		}
		@Pc(18) Class109_Sub3 local18 = this.aClass75_Sub1_22.method6773();
		@Pc(22) IDirect3DDevice local22 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1;
		local22.a(13, this.aClass75_Sub1_22.aFloat153 * this.aClass75_Sub1_22.aFloat152, this.aClass75_Sub1_22.aFloat147 * this.aClass75_Sub1_22.aFloat152, this.aClass75_Sub1_22.aFloat152 * this.aClass75_Sub1_22.aFloat146, 1.0F);
		local22.a(14, this.aClass75_Sub1_22.aFloat153 * this.aClass75_Sub1_22.aFloat145, this.aClass75_Sub1_22.aFloat145 * this.aClass75_Sub1_22.aFloat147, this.aClass75_Sub1_22.aFloat146 * this.aClass75_Sub1_22.aFloat145, 1.0F);
		local22.a(16, this.aClass75_Sub1_22.aFloat144 * this.aClass75_Sub1_22.aFloat153, this.aClass75_Sub1_22.aFloat147 * this.aClass75_Sub1_22.aFloat144, this.aClass75_Sub1_22.aFloat144 * this.aClass75_Sub1_22.aFloat146, 1.0F);
		local18.method4346(this.aClass75_Sub1_22.aFloatArray62[0], this.aClass75_Sub1_22.aFloatArray62[2], Static151.aFloatArray40, this.aClass75_Sub1_22.aFloatArray62[1]);
		local22.SetVertexShaderConstantF(15, Static151.aFloatArray40, 1);
		local18.method4346(this.aClass75_Sub1_22.aFloatArray64[0], this.aClass75_Sub1_22.aFloatArray64[2], Static151.aFloatArray40, this.aClass75_Sub1_22.aFloatArray64[1]);
		local22.SetVertexShaderConstantF(17, Static151.aFloatArray40, 1);
	}

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "(I)V")
	@Override
	public void method8165() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(14) Class109_Sub3 local14 = this.aClass75_Sub1_Sub2_2.method6848();
			local9.a(0, local14.method4357(Static151.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		if (arg1 != null) {
			if (this.aBoolean247) {
				this.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
				this.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
				this.aBoolean247 = false;
			}
			this.aClass75_Sub1_22.method6814(arg1);
			this.aClass75_Sub1_22.method6830(arg0);
		} else if (!this.aBoolean247) {
			this.aClass75_Sub1_22.method6814(this.aClass75_Sub1_22.anInterface1_3);
			this.aClass75_Sub1_22.method6830(1);
			this.aClass75_Sub1_22.method6795(0, Static110.aClass261_3);
			this.aClass75_Sub1_22.method6816(0, Static110.aClass261_3);
			this.aBoolean247 = true;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return this.aBoolean249;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		this.aClass75_Sub1_22.method6805(1);
		this.aClass75_Sub1_22.method6814((Interface1) null);
		this.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
		this.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
		this.aClass75_Sub1_22.method6795(2, Static389.aClass261_8);
		this.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
		this.aClass75_Sub1_22.method6805(0);
		if (this.aBoolean247) {
			this.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
			this.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
			this.aBoolean247 = false;
		}
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass75_Sub1_Sub2_2.method6859((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V")
	@Override
	public void method8163() {
		@Pc(3) IDirect3DDevice local3 = this.aClass75_Sub1_Sub2_2.anIDirect3DDevice1;
		@Pc(17) int local17 = this.aClass75_Sub1_22.method6839();
		@Pc(22) Class109_Sub3 local22 = this.aClass75_Sub1_22.method6722();
		@Pc(37) IDirect3DVertexShader local37;
		if (this.aBoolean248) {
			local37 = Integer.MAX_VALUE == local17 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader1;
		} else {
			local37 = Integer.MIN_VALUE == ~local17 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader3 != local37) {
			this.anIDirect3DVertexShader3 = local37;
			this.aClass75_Sub1_Sub2_2.method6859(local37);
			this.method2940();
			this.method8168();
			this.method8170();
			this.method8165();
			this.method8169();
			this.method8171();
		}
		local22.method4348(0.0F, Static151.aFloatArray40, (float) local17, -1.0F, 0.0F);
		local3.a(12, Static151.aFloatArray40);
	}
}
