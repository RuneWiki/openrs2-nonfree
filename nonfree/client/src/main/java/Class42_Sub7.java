import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class42_Sub7 extends Class42 {

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "Z")
	private boolean aBoolean511;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Lclient!hv;")
	private final Class122_Sub2_Sub1 aClass122_Sub2_Sub1_8;

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "Z")
	private final boolean aBoolean512;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!hv;Lclient!kr;)V")
	public Class42_Sub7(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class171 arg1) {
		super(arg0);
		this.aClass122_Sub2_Sub1_8 = arg0;
		if ((this.aClass122_Sub2_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean512 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method4330("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method4330("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method4330("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method4330("uw_model_lit", "dx"));
			this.aBoolean512 = this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
	@Override
	public void method6434() {
		@Pc(3) IDirect3DDevice local3 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass122_Sub2_16.method5565();
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_16.method5679();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean511) {
			local25 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader6;
		} else {
			local25 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader4;
		}
		if (this.anIDirect3DVertexShader3 != local25) {
			this.anIDirect3DVertexShader3 = local25;
			local3.SetVertexShader(local25);
			this.method5962();
			this.method6436();
			this.method6435();
			this.method6428();
			this.method6427();
			this.method6422();
		}
		local13.method6969(0.0F, -1.0F, (float) local8, 0.0F, Static394.aFloatArray54);
		local3.a(12, Static394.aFloatArray54);
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		this.aClass122_Sub2_16.method5651(arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
		this.aBoolean511 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	@Override
	public void method6428() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(12) Class118_Sub3 local12 = this.aClass122_Sub2_Sub1_8.method5597();
			local7.a(0, local12.method6967(Static394.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
	@Override
	public void method6435() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(17) Class118_Sub3 local17 = this.aClass122_Sub2_16.method5553();
			local12.SetVertexShaderConstantF(8, local17.method6981(Static394.aFloatArray53), 2);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
	private void method5962() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean511) {
			return;
		}
		@Pc(10) Class118_Sub3 local10 = this.aClass122_Sub2_16.method5679();
		@Pc(14) IDirect3DDevice local14 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1;
		local14.a(13, this.aClass122_Sub2_16.aFloat131 * this.aClass122_Sub2_16.bf, this.aClass122_Sub2_16.aFloat139 * this.aClass122_Sub2_16.aFloat131, this.aClass122_Sub2_16.aFloat132 * this.aClass122_Sub2_16.aFloat131, 1.0F);
		local14.a(14, this.aClass122_Sub2_16.aFloat136 * this.aClass122_Sub2_16.bf, this.aClass122_Sub2_16.aFloat139 * this.aClass122_Sub2_16.aFloat136, this.aClass122_Sub2_16.aFloat136 * this.aClass122_Sub2_16.aFloat132, 1.0F);
		local14.a(16, this.aClass122_Sub2_16.bf * this.aClass122_Sub2_16.aFloat130, this.aClass122_Sub2_16.aFloat139 * this.aClass122_Sub2_16.aFloat130, this.aClass122_Sub2_16.aFloat132 * this.aClass122_Sub2_16.aFloat130, 1.0F);
		local10.method6979(this.aClass122_Sub2_16.aFloatArray49[0], Static394.aFloatArray54, this.aClass122_Sub2_16.aFloatArray49[2], this.aClass122_Sub2_16.aFloatArray49[1]);
		local14.SetVertexShaderConstantF(15, Static394.aFloatArray54, 1);
		local10.method6979(this.aClass122_Sub2_16.aFloatArray52[0], Static394.aFloatArray54, this.aClass122_Sub2_16.aFloatArray52[2], this.aClass122_Sub2_16.aFloatArray52[1]);
		local14.SetVertexShaderConstantF(15, Static394.aFloatArray54, 1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
	@Override
	public void method6436() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1;
			local13.a(4, this.aClass122_Sub2_16.method5657(Static394.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	@Override
	public void method6427() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(12) Class118_Sub3 local12 = this.aClass122_Sub2_Sub1_8.method5597();
			local7.a(0, local12.method6967(Static394.aFloatArray53));
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	@Override
	public void method6422() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass122_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(10) int local10 = this.aClass122_Sub2_16.CA();
		@Pc(14) int local14 = this.aClass122_Sub2_16.c();
		@Pc(24) float local24 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(35) float local35 = (float) local10 - (float) (local10 - local14) * 0.25F;
		local6.a(10, local35, 1.0F / (local24 - local35), local24, 1.0F / ((float) local10 - local24));
		local6.a(11, 1.0F / (float) this.aClass122_Sub2_16.method5592(), (float) this.aClass122_Sub2_16.method5683() / 255.0F, 0.0F, 0.0F);
	}
}
