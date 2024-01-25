import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class11_Sub10 extends Class11 {

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!qba", name = "s", descriptor = "Z")
	private boolean aBoolean593;

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "Z")
	private boolean aBoolean594 = false;

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "Lclient!hl;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_7;

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "Z")
	private final boolean aBoolean592;

	@OriginalMember(owner = "client!qba", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "Lclient!oq;")
	private Interface20 anInterface20_6;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!hl;Lclient!oh;)V")
	public Class11_Sub10(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class237 arg1) {
		super(arg0);
		this.aClass16_Sub1_Sub2_7 = arg0;
		if (arg1 == null || (this.aClass16_Sub1_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean592 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6304("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6304("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader7 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6304("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader8 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6304("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader7 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader8 != null) {
				this.anInterface20_6 = this.aClass16_Sub1_21.method3948(new int[] { 0, -1 }, 1, 2, false);
				this.anInterface20_6.method6623(false, false);
				this.aBoolean592 = true;
			} else {
				this.aBoolean592 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
	@Override
	public void method7363() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(19) int local19 = this.aClass16_Sub1_21.XA();
		@Pc(23) int local23 = this.aClass16_Sub1_21.i();
		@Pc(35) float local35 = -((float) (local19 - local23) * 0.125F) + (float) local19;
		@Pc(47) float local47 = -((float) (local19 - local23) * 0.25F) + (float) local19;
		local15.a(10, local47, 1.0F / (local35 - local47), local35, 1.0F / ((float) local19 - local35));
		local15.a(11, 1.0F / (float) this.aClass16_Sub1_21.method3905(), (float) this.aClass16_Sub1_21.method3975() / 255.0F, this.aClass16_Sub1_21.aFloat88, 1.0F / (this.aClass16_Sub1_21.aFloat88 - this.aClass16_Sub1_21.aFloat96));
		this.aClass16_Sub1_21.method3939(this.aClass16_Sub1_21.method4004());
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V")
	@Override
	public void method7362() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1;
			local7.a(4, this.aClass16_Sub1_21.method3944(Static445.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		this.aClass16_Sub1_21.method3899(1);
		this.aClass16_Sub1_21.method3889(null);
		this.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
		this.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
		this.aClass16_Sub1_21.method3946(2, Static190.aClass265_8);
		this.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
		this.aClass16_Sub1_21.method3899(0);
		if (this.aBoolean594) {
			this.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
			this.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
			this.aBoolean594 = false;
		}
		if (this.anIDirect3DVertexShader6 != null) {
			this.aClass16_Sub1_Sub2_7.method4008(null);
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(B)V")
	@Override
	public void method7365() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(19) Class54_Sub3 local19 = this.aClass16_Sub1_21.method3940();
			local14.SetVertexShaderConstantF(8, local19.method5157(Static445.aFloatArray71), 2);
		}
	}

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "(B)V")
	@Override
	public void method7366() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(11) Class54_Sub3 local11 = this.aClass16_Sub1_Sub2_7.method3885();
			local6.a(0, local11.method5152(Static445.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "(B)V")
	private void method6840() {
		if (this.anIDirect3DVertexShader6 == null || !this.aBoolean593) {
			return;
		}
		@Pc(10) Class54_Sub3 local10 = this.aClass16_Sub1_21.method3918();
		@Pc(14) IDirect3DDevice local14 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1;
		local14.a(13, this.aClass16_Sub1_21.aFloat93 * this.aClass16_Sub1_21.aFloat85, this.aClass16_Sub1_21.aFloat93 * this.aClass16_Sub1_21.aFloat82, this.aClass16_Sub1_21.aFloat86 * this.aClass16_Sub1_21.aFloat93, 1.0F);
		local14.a(14, this.aClass16_Sub1_21.aFloat89 * this.aClass16_Sub1_21.aFloat85, this.aClass16_Sub1_21.aFloat89 * this.aClass16_Sub1_21.aFloat82, this.aClass16_Sub1_21.aFloat86 * this.aClass16_Sub1_21.aFloat89, 1.0F);
		local14.a(16, this.aClass16_Sub1_21.aFloat85 * this.aClass16_Sub1_21.aFloat90, this.aClass16_Sub1_21.aFloat82 * this.aClass16_Sub1_21.aFloat90, this.aClass16_Sub1_21.aFloat86 * this.aClass16_Sub1_21.aFloat90, 1.0F);
		local10.method5148(this.aClass16_Sub1_21.aFloatArray45[1], Static445.aFloatArray72, this.aClass16_Sub1_21.aFloatArray45[2], this.aClass16_Sub1_21.aFloatArray45[0]);
		local14.SetVertexShaderConstantF(15, Static445.aFloatArray72, 1);
		local10.method5148(this.aClass16_Sub1_21.aFloatArray49[1], Static445.aFloatArray72, this.aClass16_Sub1_21.aFloatArray49[2], this.aClass16_Sub1_21.aFloatArray49[0]);
		local14.SetVertexShaderConstantF(17, Static445.aFloatArray72, 1);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
	@Override
	public void method7358() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class54_Sub3 local12 = this.aClass16_Sub1_Sub2_7.method3885();
			local7.a(0, local12.method5152(Static445.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean594) {
				this.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
				this.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
				this.aBoolean594 = false;
			}
			this.aClass16_Sub1_21.method3889(arg0);
			this.aClass16_Sub1_21.method3937(arg1);
		} else if (!this.aBoolean594) {
			this.aClass16_Sub1_21.method3889(this.aClass16_Sub1_21.anInterface12_3);
			this.aClass16_Sub1_21.method3937(1);
			this.aClass16_Sub1_21.method3946(0, Static613.aClass265_9);
			this.aClass16_Sub1_21.method3950(0, Static613.aClass265_9);
			this.aBoolean594 = true;
		}
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(B)V")
	@Override
	public void method7364() {
		@Pc(3) IDirect3DDevice local3 = this.aClass16_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(15) int local15 = this.aClass16_Sub1_21.method3925();
		@Pc(20) Class54_Sub3 local20 = this.aClass16_Sub1_21.method3904();
		@Pc(34) IDirect3DVertexShader local34;
		if (this.aBoolean593) {
			local34 = ~local15 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader8;
		} else {
			local34 = Integer.MIN_VALUE == ~local15 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader7;
		}
		if (this.anIDirect3DVertexShader6 != local34) {
			this.anIDirect3DVertexShader6 = local34;
			this.aClass16_Sub1_Sub2_7.method4008(local34);
			this.method6840();
			this.method7362();
			this.method7365();
			this.method7358();
			this.method7366();
			this.method7363();
		}
		local20.method5165(-1.0F, 0.0F, 0.0F, (float) local15, Static445.aFloatArray72);
		local3.a(12, Static445.aFloatArray72);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		this.aBoolean593 = arg0;
		this.aClass16_Sub1_21.method3899(1);
		this.aClass16_Sub1_21.method3889(this.anInterface20_6);
		this.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static584.aClass34_6);
		this.aClass16_Sub1_21.method3946(0, Static190.aClass265_8);
		this.aClass16_Sub1_21.method4000(false, true, 2, Static625.aClass265_10);
		this.aClass16_Sub1_21.method3950(0, Static613.aClass265_9);
		this.aClass16_Sub1_21.method3899(0);
		this.method7364();
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return this.aBoolean592;
	}
}
