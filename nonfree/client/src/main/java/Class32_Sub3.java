import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "Lclient!to;")
	private final Class31_Sub1_Sub2 aClass31_Sub1_Sub2_4;

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "Z")
	private final boolean aBoolean309;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "Lclient!mca;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!to;Lclient!ri;)V")
	public Class32_Sub3(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class284 arg1) {
		super(arg0);
		this.aClass31_Sub1_Sub2_4 = arg0;
		if (arg1 == null || (this.aClass31_Sub1_Sub2_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean309 = false;
		} else {
			this.anIDirect3DVertexShader2 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1.b(arg1.method6328("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1.b(arg1.method6328("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader4 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1.b(arg1.method6328("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader3 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1.b(arg1.method6328("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface12_2 = this.aClass31_Sub1_22.method7089(new int[] { 0, -1 }, 2, false, 1);
				this.anInterface12_2.method2990(false, false);
				this.aBoolean309 = true;
			} else {
				this.aBoolean309 = false;
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		this.aClass31_Sub1_22.method7092(1);
		this.aClass31_Sub1_22.method7129(null);
		this.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
		this.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
		this.aClass31_Sub1_22.method7155(2, Static438.aClass179_14);
		this.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
		this.aClass31_Sub1_22.method7092(0);
		this.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
		this.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
		if (this.anIDirect3DVertexShader1 != null) {
			this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(14) Class42_Sub3 local14 = this.aClass31_Sub1_22.method7075();
			local7.SetVertexShaderConstantF(8, local14.method7535(Static237.aFloatArray40), 2);
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
	@Override
	public void method7456() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(12) Class42_Sub3 local12 = this.aClass31_Sub1_Sub2_4.method7182();
			local7.a(0, local12.method7540(Static237.aFloatArray40));
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return this.aBoolean309;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		this.aBoolean308 = arg0;
		this.aClass31_Sub1_22.method7092(1);
		this.aClass31_Sub1_22.method7129(this.anInterface12_2);
		this.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static336.aClass266_4);
		this.aClass31_Sub1_22.method7155(0, Static438.aClass179_14);
		this.aClass31_Sub1_22.method7083(Static402.aClass179_23, 2, false, true);
		this.aClass31_Sub1_22.method7185(Static415.aClass179_24, 0);
		this.aClass31_Sub1_22.method7092(0);
		this.method7452();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	@Override
	public void method7447() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1;
			@Pc(18) Class42_Sub3 local18 = this.aClass31_Sub1_Sub2_4.method7182();
			local13.a(0, local18.method7540(Static237.aFloatArray40));
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
	@Override
	public void method7455() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1;
			local7.a(4, this.aClass31_Sub1_22.method7110(Static237.aFloatArray40));
		}
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	@Override
	public void method7452() {
		@Pc(3) IDirect3DDevice local3 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass31_Sub1_22.method7130();
		@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_22.method7171();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean308) {
			local25 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader3;
		} else {
			local25 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader4;
		}
		if (this.anIDirect3DVertexShader1 != local25) {
			this.anIDirect3DVertexShader1 = local25;
			local3.SetVertexShader(local25);
			this.method3805();
			this.method7455();
			this.method7457();
			this.method7447();
			this.method7456();
			this.method7450();
		}
		local13.method7523(0.0F, 0.0F, (float) local8, Static237.aFloatArray39, (float) -1);
		local3.a(12, Static237.aFloatArray39);
	}

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "(I)V")
	private void method3805() {
		if (this.anIDirect3DVertexShader1 == null || !this.aBoolean308) {
			return;
		}
		@Pc(10) Class42_Sub3 local10 = this.aClass31_Sub1_22.method7074();
		@Pc(14) IDirect3DDevice local14 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1;
		local14.a(13, this.aClass31_Sub1_22.aFloat189 * this.aClass31_Sub1_22.aFloat191, this.aClass31_Sub1_22.aFloat191 * this.aClass31_Sub1_22.aFloat201, this.aClass31_Sub1_22.aFloat193 * this.aClass31_Sub1_22.aFloat191, 1.0F);
		local14.a(14, this.aClass31_Sub1_22.aFloat189 * this.aClass31_Sub1_22.aFloat195, this.aClass31_Sub1_22.aFloat201 * this.aClass31_Sub1_22.aFloat195, this.aClass31_Sub1_22.aFloat193 * this.aClass31_Sub1_22.aFloat195, 1.0F);
		local14.a(16, this.aClass31_Sub1_22.aFloat189 * this.aClass31_Sub1_22.aFloat205, this.aClass31_Sub1_22.aFloat205 * this.aClass31_Sub1_22.aFloat201, this.aClass31_Sub1_22.aFloat193 * this.aClass31_Sub1_22.aFloat205, 1.0F);
		local10.method7541(Static237.aFloatArray39, this.aClass31_Sub1_22.aFloatArray67[1], this.aClass31_Sub1_22.aFloatArray67[0], this.aClass31_Sub1_22.aFloatArray67[2]);
		local14.SetVertexShaderConstantF(15, Static237.aFloatArray39, 1);
		local10.method7541(Static237.aFloatArray39, this.aClass31_Sub1_22.aFloatArray66[1], this.aClass31_Sub1_22.aFloatArray66[0], this.aClass31_Sub1_22.aFloatArray66[2]);
		local14.SetVertexShaderConstantF(17, Static237.aFloatArray39, 1);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		if (arg1 == null) {
			this.aClass31_Sub1_22.method7129(this.aClass31_Sub1_22.anInterface24_3);
			this.aClass31_Sub1_22.method7141(1);
			this.aClass31_Sub1_22.method7155(0, Static415.aClass179_24);
			this.aClass31_Sub1_22.method7185(Static415.aClass179_24, 0);
		} else {
			this.aClass31_Sub1_22.method7129(arg1);
			this.aClass31_Sub1_22.method7141(arg0);
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	@Override
	public void method7450() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass31_Sub1_Sub2_4.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass31_Sub1_22.U();
		@Pc(22) int local22 = this.aClass31_Sub1_22.BA();
		@Pc(33) float local33 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(43) float local43 = (float) local18 - (float) (local18 - local22) * 0.25F;
		local14.a(10, local43, 1.0F / (local33 - local43), local33, 1.0F / ((float) local18 - local33));
		local14.a(11, 1.0F / (float) this.aClass31_Sub1_22.method7143(), (float) this.aClass31_Sub1_22.method7094() / 255.0F, this.aClass31_Sub1_22.aFloat203, 1.0F / (this.aClass31_Sub1_22.aFloat203 - this.aClass31_Sub1_22.aFloat198));
		this.aClass31_Sub1_22.method7160(this.aClass31_Sub1_22.method7126());
	}
}
