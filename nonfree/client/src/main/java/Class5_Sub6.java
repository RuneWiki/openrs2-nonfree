import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!nca;")
	private final Class39_Sub2_Sub1 aClass39_Sub2_Sub1_5;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "Z")
	private final boolean aBoolean465;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!nca;Lclient!dda;)V")
	public Class5_Sub6(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class53 arg1) {
		super(arg0);
		this.aClass39_Sub2_Sub1_5 = arg0;
		if ((this.aClass39_Sub2_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader4 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1.a(arg1.method1596("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1.a(arg1.method1596("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1.a(arg1.method1596("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader1 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1.a(arg1.method1596("uw_model_lit", "dx"));
			this.aBoolean465 = this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null;
		} else {
			this.aBoolean465 = false;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	@Override
	public void method7086() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1;
			@Pc(13) Class181_Sub2 local13 = this.aClass39_Sub2_20.method6116();
			local8.SetVertexShaderConstantF(8, local13.method5398(Static334.aFloatArray47), 2);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
	@Override
	public void method7095() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1;
			@Pc(16) Class181_Sub2 local16 = this.aClass39_Sub2_Sub1_5.method6161();
			local11.a(0, local16.method5404(Static334.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
	private void method5324() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean466) {
			return;
		}
		@Pc(12) Class181_Sub2 local12 = this.aClass39_Sub2_20.method6151();
		@Pc(16) IDirect3DDevice local16 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1;
		local16.a(13, this.aClass39_Sub2_20.aFloat188 * this.aClass39_Sub2_20.aFloat189, this.aClass39_Sub2_20.aFloat191 * this.aClass39_Sub2_20.aFloat189, this.aClass39_Sub2_20.aFloat189 * this.aClass39_Sub2_20.aFloat194, 1.0F);
		local16.a(14, this.aClass39_Sub2_20.aFloat200 * this.aClass39_Sub2_20.aFloat188, this.aClass39_Sub2_20.aFloat191 * this.aClass39_Sub2_20.aFloat200, this.aClass39_Sub2_20.aFloat194 * this.aClass39_Sub2_20.aFloat200, 1.0F);
		local16.a(16, this.aClass39_Sub2_20.aFloat192 * this.aClass39_Sub2_20.aFloat188, this.aClass39_Sub2_20.aFloat192 * this.aClass39_Sub2_20.aFloat191, this.aClass39_Sub2_20.aFloat192 * this.aClass39_Sub2_20.aFloat194, 1.0F);
		local12.method5405(this.aClass39_Sub2_20.aFloatArray61[0], this.aClass39_Sub2_20.aFloatArray61[2], Static334.aFloatArray48, this.aClass39_Sub2_20.aFloatArray61[1]);
		local16.SetVertexShaderConstantF(15, Static334.aFloatArray48, 1);
		local12.method5405(this.aClass39_Sub2_20.aFloatArray57[0], this.aClass39_Sub2_20.aFloatArray57[2], Static334.aFloatArray48, this.aClass39_Sub2_20.aFloatArray57[1]);
		local16.SetVertexShaderConstantF(15, Static334.aFloatArray48, 1);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return this.aBoolean465;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		this.aClass39_Sub2_20.method6179(arg1);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)V")
	@Override
	public void method7097() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1;
			local8.a(4, this.aClass39_Sub2_20.method6153(Static334.aFloatArray47));
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		this.aBoolean466 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
	@Override
	public void method7089() {
		@Pc(3) IDirect3DDevice local3 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass39_Sub2_20.method6150();
		@Pc(13) Class181_Sub2 local13 = this.aClass39_Sub2_20.method6151();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean466) {
			local25 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader1;
		} else {
			local25 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader5;
		}
		if (local25 != this.anIDirect3DVertexShader3) {
			this.anIDirect3DVertexShader3 = local25;
			local3.SetVertexShader(local25);
			this.method5324();
			this.method7097();
			this.method7086();
			this.method7095();
			this.method7088();
			this.method7082();
		}
		local13.method5408(Static334.aFloatArray48, -1.0F, (float) local8, 0.0F, 0.0F);
		local3.a(12, Static334.aFloatArray48);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	@Override
	public void method7082() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass39_Sub2_20.CA();
		@Pc(22) int local22 = this.aClass39_Sub2_20.c();
		@Pc(32) float local32 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(44) float local44 = -((float) (local18 - local22) * 0.25F) + (float) local18;
		local14.a(10, local44, 1.0F / (local32 - local44), local32, 1.0F / ((float) local18 - local32));
		local14.a(11, 1.0F / (float) this.aClass39_Sub2_20.method6184(), (float) this.aClass39_Sub2_20.method6125() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
	@Override
	public void method7088() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass39_Sub2_Sub1_5.anIDirect3DDevice1;
			@Pc(20) Class181_Sub2 local20 = this.aClass39_Sub2_Sub1_5.method6161();
			local15.a(0, local20.method5404(Static334.aFloatArray47));
		}
	}
}
