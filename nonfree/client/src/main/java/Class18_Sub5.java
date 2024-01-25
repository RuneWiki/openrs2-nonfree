import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class18_Sub5 extends Class18 {

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Z")
	private boolean aBoolean699;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "Z")
	private boolean aBoolean700 = false;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "Lclient!cka;")
	private final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_8;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Lclient!w;")
	private Interface27 anInterface27_4;

	@OriginalMember(owner = "client!qs", name = "B", descriptor = "Z")
	private final boolean aBoolean701;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!cka;Lclient!wm;)V")
	public Class18_Sub5(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class390 arg1) {
		super(arg0);
		this.aClass65_Sub2_Sub1_8 = arg0;
		if (arg1 == null || (this.aClass65_Sub2_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean701 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method8917("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method8917("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader6 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method8917("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader3 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method8917("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null) {
				this.anInterface27_4 = this.aClass65_Sub2_23.method4371(2, new int[] { 0, -1 }, 1, false);
				this.anInterface27_4.method5618(false, false);
				this.aBoolean701 = true;
			} else {
				this.aBoolean701 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(B)V")
	@Override
	public void method9002() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(20) Class254_Sub2 local20 = this.aClass65_Sub2_23.method4429();
			local15.SetVertexShaderConstantF(8, local20.method6223(Static492.aFloatArray82), 2);
		}
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(I)V")
	private void method7069() {
		if (this.anIDirect3DVertexShader7 == null || !this.aBoolean699) {
			return;
		}
		@Pc(18) Class254_Sub2 local18 = this.aClass65_Sub2_23.method4472();
		@Pc(22) IDirect3DDevice local22 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1;
		local22.a(13, this.aClass65_Sub2_23.aFloat106 * this.aClass65_Sub2_23.aFloat99, this.aClass65_Sub2_23.aFloat107 * this.aClass65_Sub2_23.aFloat99, this.aClass65_Sub2_23.aFloat112 * this.aClass65_Sub2_23.aFloat99, 1.0F);
		local22.a(14, this.aClass65_Sub2_23.aFloat106 * this.aClass65_Sub2_23.aFloat101, this.aClass65_Sub2_23.aFloat101 * this.aClass65_Sub2_23.aFloat107, this.aClass65_Sub2_23.aFloat101 * this.aClass65_Sub2_23.aFloat112, 1.0F);
		local22.a(16, this.aClass65_Sub2_23.aFloat104 * this.aClass65_Sub2_23.aFloat106, this.aClass65_Sub2_23.aFloat104 * this.aClass65_Sub2_23.aFloat107, this.aClass65_Sub2_23.aFloat104 * this.aClass65_Sub2_23.aFloat112, 1.0F);
		local18.method6245(this.aClass65_Sub2_23.aFloatArray50[0], Static492.aFloatArray81, this.aClass65_Sub2_23.aFloatArray50[1], this.aClass65_Sub2_23.aFloatArray50[2]);
		local22.SetVertexShaderConstantF(15, Static492.aFloatArray81, 1);
		local18.method6245(this.aClass65_Sub2_23.aFloatArray48[0], Static492.aFloatArray81, this.aClass65_Sub2_23.aFloatArray48[1], this.aClass65_Sub2_23.aFloatArray48[2]);
		local22.SetVertexShaderConstantF(17, Static492.aFloatArray81, 1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		this.aClass65_Sub2_23.method4358(1);
		this.aClass65_Sub2_23.method4426((Interface25) null);
		this.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
		this.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
		this.aClass65_Sub2_23.method4400(Static413.aClass64_3, 2);
		this.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
		this.aClass65_Sub2_23.method4358(0);
		if (this.aBoolean700) {
			this.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
			this.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
			this.aBoolean700 = false;
		}
		if (this.anIDirect3DVertexShader7 != null) {
			this.aClass65_Sub2_Sub1_8.method1762((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		if (arg1 != null) {
			if (this.aBoolean700) {
				this.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
				this.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
				this.aBoolean700 = false;
			}
			this.aClass65_Sub2_23.method4426(arg1);
			this.aClass65_Sub2_23.method4405(arg0);
		} else if (!this.aBoolean700) {
			this.aClass65_Sub2_23.method4426(this.aClass65_Sub2_23.anInterface25_3);
			this.aClass65_Sub2_23.method4405(1);
			this.aClass65_Sub2_23.method4400(Static169.aClass64_1, 0);
			this.aClass65_Sub2_23.method4369(0, Static169.aClass64_1);
			this.aBoolean700 = true;
		}
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
	@Override
	public void method9001() {
		@Pc(3) IDirect3DDevice local3 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass65_Sub2_23.method4476();
		@Pc(13) Class254_Sub2 local13 = this.aClass65_Sub2_23.method4468();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean699) {
			local33 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader3;
		} else {
			local33 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader6;
		}
		if (local33 != this.anIDirect3DVertexShader7) {
			this.anIDirect3DVertexShader7 = local33;
			this.aClass65_Sub2_Sub1_8.method1762(local33);
			this.method7069();
			this.method8998();
			this.method9002();
			this.method8997();
			this.method8999();
			this.method9010();
		}
		local13.method6233((float) local8, Static492.aFloatArray81, -1.0F, 0.0F, 0.0F);
		local3.a(12, Static492.aFloatArray81);
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V")
	@Override
	public void method9010() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(15) int local15 = this.aClass65_Sub2_23.XA();
		@Pc(19) int local19 = this.aClass65_Sub2_23.i();
		@Pc(30) float local30 = (float) local15 - (float) (local15 - local19) * 0.125F;
		@Pc(42) float local42 = -((float) (local15 - local19) * 0.25F) + (float) local15;
		local11.a(10, local42, 1.0F / (local30 - local42), local30, 1.0F / ((float) local15 - local30));
		local11.a(11, 1.0F / (float) this.aClass65_Sub2_23.method4406(), (float) this.aClass65_Sub2_23.method4414() / 255.0F, this.aClass65_Sub2_23.aFloat97, 1.0F / (this.aClass65_Sub2_23.aFloat97 - this.aClass65_Sub2_23.aFloat102));
		this.aClass65_Sub2_23.method4455(this.aClass65_Sub2_23.method4353());
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		this.aBoolean699 = arg0;
		this.aClass65_Sub2_23.method4358(1);
		this.aClass65_Sub2_23.method4426(this.anInterface27_4);
		this.aClass65_Sub2_23.method4432(Static512.aClass178_3, Static138.aClass178_2);
		this.aClass65_Sub2_23.method4400(Static413.aClass64_3, 0);
		this.aClass65_Sub2_23.method4388(2, Static536.aClass64_4, true, false);
		this.aClass65_Sub2_23.method4369(0, Static169.aClass64_1);
		this.aClass65_Sub2_23.method4358(0);
		this.method9001();
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
	@Override
	public void method8998() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1;
			local7.a(4, this.aClass65_Sub2_23.method4376(Static492.aFloatArray82));
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	@Override
	public void method8999() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(12) Class254_Sub2 local12 = this.aClass65_Sub2_Sub1_8.method4410();
			local7.a(0, local12.method6242(Static492.aFloatArray82));
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return this.aBoolean701;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	@Override
	public void method8997() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass65_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(11) Class254_Sub2 local11 = this.aClass65_Sub2_Sub1_8.method4410();
			local6.a(0, local11.method6242(Static492.aFloatArray82));
		}
	}
}
