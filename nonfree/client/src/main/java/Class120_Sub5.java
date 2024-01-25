import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class120_Sub5 extends Class120 {

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!no", name = "r", descriptor = "Lclient!rca;")
	private final Class5_Sub3_Sub2 aClass5_Sub3_Sub2_7;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Z")
	private final boolean aBoolean398;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!rca;Lclient!kea;)V")
	public Class120_Sub5(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class161 arg1) {
		super(arg0);
		this.aClass5_Sub3_Sub2_7 = arg0;
		if ((this.aClass5_Sub3_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean398 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4238("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4238("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4238("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1.a(arg1.method4238("uw_model_lit", "dx"));
			this.aBoolean398 = this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader3 != null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)V")
	private void method5297() {
		if (this.anIDirect3DVertexShader5 == null || !this.aBoolean399) {
			return;
		}
		@Pc(14) Class205_Sub1 local14 = this.aClass5_Sub3_20.method6427();
		@Pc(18) IDirect3DDevice local18 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1;
		local18.a(13, this.aClass5_Sub3_20.aFloat228 * this.aClass5_Sub3_20.aFloat226, this.aClass5_Sub3_20.aFloat220 * this.aClass5_Sub3_20.aFloat228, this.aClass5_Sub3_20.aFloat225 * this.aClass5_Sub3_20.aFloat228, 1.0F);
		local18.a(14, this.aClass5_Sub3_20.aFloat226 * this.aClass5_Sub3_20.aFloat219, this.aClass5_Sub3_20.aFloat220 * this.aClass5_Sub3_20.aFloat219, this.aClass5_Sub3_20.aFloat219 * this.aClass5_Sub3_20.aFloat225, 1.0F);
		local18.a(16, this.aClass5_Sub3_20.aFloat232 * this.aClass5_Sub3_20.aFloat226, this.aClass5_Sub3_20.aFloat232 * this.aClass5_Sub3_20.aFloat220, this.aClass5_Sub3_20.aFloat232 * this.aClass5_Sub3_20.aFloat225, 1.0F);
		local14.method5222(Static334.aFloatArray43, this.aClass5_Sub3_20.aFloatArray53[1], this.aClass5_Sub3_20.aFloatArray53[0], this.aClass5_Sub3_20.aFloatArray53[2]);
		local18.SetVertexShaderConstantF(15, Static334.aFloatArray43, 1);
		local14.method5222(Static334.aFloatArray43, this.aClass5_Sub3_20.aFloatArray51[1], this.aClass5_Sub3_20.aFloatArray51[0], this.aClass5_Sub3_20.aFloatArray51[2]);
		local18.SetVertexShaderConstantF(15, Static334.aFloatArray43, 1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		this.aBoolean399 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
	@Override
	public void method7323() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1;
			@Pc(16) Class205_Sub1 local16 = this.aClass5_Sub3_Sub2_7.method6357();
			local11.a(0, local16.method5221(Static334.aFloatArray42));
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
	@Override
	public void method7330() {
		@Pc(3) IDirect3DDevice local3 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass5_Sub3_20.method6389();
		@Pc(13) Class205_Sub1 local13 = this.aClass5_Sub3_20.method6427();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean399) {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader3;
		} else {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader2;
		}
		if (local27 != this.anIDirect3DVertexShader5) {
			this.anIDirect3DVertexShader5 = local27;
			local3.SetVertexShader(local27);
			this.method5297();
			this.method7319();
			this.method7325();
			this.method7327();
			this.method7323();
			this.method7321();
		}
		local13.method5234(Static334.aFloatArray43, 0.0F, -1.0F, (float) local8, 0.0F);
		local3.a(12, Static334.aFloatArray43);
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	@Override
	public void method7327() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1;
			@Pc(19) Class205_Sub1 local19 = this.aClass5_Sub3_Sub2_7.method6357();
			local14.a(0, local19.method5221(Static334.aFloatArray42));
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	@Override
	public void method7321() {
		if (this.anIDirect3DVertexShader5 == null) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass5_Sub3_20.IA();
		@Pc(18) int local18 = this.aClass5_Sub3_20.U();
		@Pc(30) float local30 = -((float) (local14 - local18) * 0.125F) + (float) local14;
		@Pc(41) float local41 = (float) local14 - (float) (local14 - local18) * 0.25F;
		local10.a(10, local41, 1.0F / (local30 - local41), local30, 1.0F / ((float) local14 - local30));
		local10.a(11, 1.0F / (float) this.aClass5_Sub3_20.method6296(), (float) this.aClass5_Sub3_20.method6323() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		if (this.anIDirect3DVertexShader5 != null) {
			this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader5 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
	@Override
	public void method7325() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class205_Sub1 local12 = this.aClass5_Sub3_20.method6359();
			local7.SetVertexShaderConstantF(8, local12.method5236(Static334.aFloatArray42), 2);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method7319() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass5_Sub3_Sub2_7.anIDirect3DDevice1;
			local8.a(4, this.aClass5_Sub3_20.method6385(Static334.aFloatArray42));
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		this.aClass5_Sub3_20.method6416(arg1);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return this.aBoolean398;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
