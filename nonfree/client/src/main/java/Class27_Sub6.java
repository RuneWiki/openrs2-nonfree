import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class27_Sub6 extends Class27 {

	@OriginalMember(owner = "client!oha", name = "t", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!oha", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!oha", name = "o", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!oha", name = "n", descriptor = "Lclient!hb;")
	private final Class133_Sub1_Sub1 aClass133_Sub1_Sub1_6;

	@OriginalMember(owner = "client!oha", name = "r", descriptor = "Z")
	private final boolean aBoolean469;

	@OriginalMember(owner = "client!oha", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!oha", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!oha", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!oha", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!oha", name = "x", descriptor = "Lclient!rm;")
	private Interface20 anInterface20_4;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!hb;Lclient!la;)V")
	public Class27_Sub6(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class207 arg1) {
		super(arg0);
		this.aClass133_Sub1_Sub1_6 = arg0;
		if (arg1 == null || (this.aClass133_Sub1_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean469 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method4695("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method4695("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method4695("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method4695("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface20_4 = this.aClass133_Sub1_23.method6181(1, false, 2, new int[] { 0, -1 });
				this.anInterface20_4.method4639(false, false);
				this.aBoolean469 = true;
			} else {
				this.aBoolean469 = false;
			}
		}
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(Z)V")
	@Override
	public void method8903() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(16) Class113_Sub1 local16 = this.aClass133_Sub1_Sub1_6.method6262();
			local11.a(0, local16.method2473(Static402.aFloatArray48));
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	@Override
	public void method8893() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass133_Sub1_23.XA();
		@Pc(22) int local22 = this.aClass133_Sub1_23.i();
		@Pc(33) float local33 = -((float) (local18 - local22) * 0.125F) + (float) local18;
		@Pc(44) float local44 = (float) local18 - (float) (local18 - local22) * 0.25F;
		local14.a(10, local44, 1.0F / (local33 - local44), local33, 1.0F / ((float) local18 - local33));
		local14.a(11, 1.0F / (float) this.aClass133_Sub1_23.method6251(), (float) this.aClass133_Sub1_23.method6282() / 255.0F, this.aClass133_Sub1_23.aFloat130, 1.0F / (this.aClass133_Sub1_23.aFloat130 - this.aClass133_Sub1_23.aFloat125));
		this.aClass133_Sub1_23.method6160(this.aClass133_Sub1_23.method6248());
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		@Pc(3) IDirect3DDevice local3 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass133_Sub1_23.method6235();
		@Pc(13) Class113_Sub1 local13 = this.aClass133_Sub1_23.method6267();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean470) {
			local25 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader6;
		} else {
			local25 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader4;
		}
		if (this.anIDirect3DVertexShader7 != local25) {
			this.anIDirect3DVertexShader7 = local25;
			this.aClass133_Sub1_Sub1_6.method3490(local25);
			this.method6005();
			this.method8900();
			this.method8902();
			this.method8903();
			this.method8899();
			this.method8893();
		}
		local13.method2477(0.0F, (float) local8, 0.0F, -1.0F, Static402.aFloatArray49);
		local3.a(12, Static402.aFloatArray49);
	}

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)V")
	@Override
	public void method8900() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1;
			local7.a(4, this.aClass133_Sub1_23.method6220(Static402.aFloatArray48));
		}
	}

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "(B)V")
	private void method6005() {
		if (this.anIDirect3DVertexShader7 == null || !this.aBoolean470) {
			return;
		}
		@Pc(12) Class113_Sub1 local12 = this.aClass133_Sub1_23.method6171();
		@Pc(16) IDirect3DDevice local16 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1;
		local16.a(13, this.aClass133_Sub1_23.aFloat126 * this.aClass133_Sub1_23.aFloat129, this.aClass133_Sub1_23.aFloat129 * this.aClass133_Sub1_23.aFloat119, this.aClass133_Sub1_23.aFloat132 * this.aClass133_Sub1_23.aFloat129, 1.0F);
		local16.a(14, this.aClass133_Sub1_23.aFloat126 * this.aClass133_Sub1_23.aFloat127, this.aClass133_Sub1_23.aFloat127 * this.aClass133_Sub1_23.aFloat119, this.aClass133_Sub1_23.aFloat127 * this.aClass133_Sub1_23.aFloat132, 1.0F);
		local16.a(16, this.aClass133_Sub1_23.aFloat124 * this.aClass133_Sub1_23.aFloat126, this.aClass133_Sub1_23.aFloat124 * this.aClass133_Sub1_23.aFloat119, this.aClass133_Sub1_23.aFloat132 * this.aClass133_Sub1_23.aFloat124, 1.0F);
		local12.method2460(this.aClass133_Sub1_23.aFloatArray57[2], this.aClass133_Sub1_23.aFloatArray57[1], this.aClass133_Sub1_23.aFloatArray57[0], Static402.aFloatArray49);
		local16.SetVertexShaderConstantF(15, Static402.aFloatArray49, 1);
		local12.method2460(this.aClass133_Sub1_23.aFloatArray50[2], this.aClass133_Sub1_23.aFloatArray50[1], this.aClass133_Sub1_23.aFloatArray50[0], Static402.aFloatArray49);
		local16.SetVertexShaderConstantF(17, Static402.aFloatArray49, 1);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return this.aBoolean469;
	}

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
	@Override
	public void method8899() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(13) Class113_Sub1 local13 = this.aClass133_Sub1_Sub1_6.method6262();
			local8.a(0, local13.method2473(Static402.aFloatArray48));
		}
	}

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "(I)V")
	@Override
	public void method8902() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass133_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(11) Class113_Sub1 local11 = this.aClass133_Sub1_23.method6180();
			local6.SetVertexShaderConstantF(8, local11.method2478(Static402.aFloatArray48), 2);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		this.aBoolean470 = arg0;
		this.aClass133_Sub1_23.method6271(1);
		this.aClass133_Sub1_23.method6153(this.anInterface20_4);
		this.aClass133_Sub1_23.method6239(Static132.aClass151_7, Static481.aClass151_8);
		this.aClass133_Sub1_23.method6211(Static105.aClass236_1, 0);
		this.aClass133_Sub1_23.method6222(2, Static626.aClass236_6, false, true);
		this.aClass133_Sub1_23.method6159(0, Static229.aClass236_2);
		this.aClass133_Sub1_23.method6271(0);
		this.method8892();
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		this.aClass133_Sub1_23.method6271(1);
		this.aClass133_Sub1_23.method6153(null);
		this.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
		this.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
		this.aClass133_Sub1_23.method6211(Static105.aClass236_1, 2);
		this.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
		this.aClass133_Sub1_23.method6271(0);
		if (this.aBoolean468) {
			this.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
			this.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
			this.aBoolean468 = false;
		}
		if (this.anIDirect3DVertexShader7 != null) {
			this.aClass133_Sub1_Sub1_6.method3490(null);
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
		if (arg1 != null) {
			if (this.aBoolean468) {
				this.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
				this.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
				this.aBoolean468 = false;
			}
			this.aClass133_Sub1_23.method6153(arg1);
			this.aClass133_Sub1_23.method6268(arg0);
		} else if (!this.aBoolean468) {
			this.aClass133_Sub1_23.method6153(this.aClass133_Sub1_23.anInterface8_3);
			this.aClass133_Sub1_23.method6268(1);
			this.aClass133_Sub1_23.method6211(Static229.aClass236_2, 0);
			this.aClass133_Sub1_23.method6159(0, Static229.aClass236_2);
			this.aBoolean468 = true;
		}
	}
}
