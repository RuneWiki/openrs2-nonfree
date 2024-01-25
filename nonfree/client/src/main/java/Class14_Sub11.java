import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class14_Sub11 extends Class14 {

	@OriginalMember(owner = "client!wha", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!wha", name = "s", descriptor = "Z")
	private boolean aBoolean756;

	@OriginalMember(owner = "client!wha", name = "j", descriptor = "Z")
	private boolean aBoolean754 = false;

	@OriginalMember(owner = "client!wha", name = "r", descriptor = "Lclient!ki;")
	private final Class143_Sub1_Sub1 aClass143_Sub1_Sub1_9;

	@OriginalMember(owner = "client!wha", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!wha", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!wha", name = "k", descriptor = "Z")
	private final boolean aBoolean755;

	@OriginalMember(owner = "client!wha", name = "t", descriptor = "Lclient!kt;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!ki;Lclient!cb;)V")
	public Class14_Sub11(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class50 arg1) {
		super(arg0);
		this.aClass143_Sub1_Sub1_9 = arg0;
		if (arg1 == null || (this.aClass143_Sub1_Sub1_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean755 = false;
		} else {
			this.anIDirect3DVertexShader7 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method892("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader8 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method892("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method892("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method892("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader8 != null & this.anIDirect3DVertexShader7 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface12_6 = this.aClass143_Sub1_22.method6292(false, new int[] { 0, -1 }, 1, 2);
				this.anInterface12_6.method7449(false, false);
				this.aBoolean755 = true;
			} else {
				this.aBoolean755 = false;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return this.aBoolean755;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		this.aBoolean756 = arg0;
		this.aClass143_Sub1_22.method6374(1);
		this.aClass143_Sub1_22.method6338(this.anInterface12_6);
		this.aClass143_Sub1_22.method6370(Static460.aClass6_3, Static371.aClass6_2);
		this.aClass143_Sub1_22.method6290(Static85.aClass90_1, 0);
		this.aClass143_Sub1_22.method6291(2, false, Static663.aClass90_4, true);
		this.aClass143_Sub1_22.method6391(0, Static85.aClass90_2);
		this.aClass143_Sub1_22.method6374(0);
		this.method8623();
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(B)V")
	@Override
	public void method8621() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1;
			local12.a(4, this.aClass143_Sub1_22.method6394(Static660.aFloatArray79));
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	@Override
	public void method8614() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(17) Class56_Sub2 local17 = this.aClass143_Sub1_Sub1_9.method6402();
			local12.a(0, local17.method6822(Static660.aFloatArray79));
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		this.aClass143_Sub1_22.method6374(1);
		this.aClass143_Sub1_22.method6338((Interface4) null);
		this.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
		this.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
		this.aClass143_Sub1_22.method6290(Static85.aClass90_1, 2);
		this.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
		this.aClass143_Sub1_22.method6374(0);
		if (this.aBoolean754) {
			this.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
			this.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
			this.aBoolean754 = false;
		}
		if (this.anIDirect3DVertexShader6 != null) {
			this.aClass143_Sub1_Sub1_9.method4610((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "(I)V")
	private void method8626() {
		if (this.anIDirect3DVertexShader6 == null || !this.aBoolean756) {
			return;
		}
		@Pc(19) Class56_Sub2 local19 = this.aClass143_Sub1_22.method6272();
		@Pc(23) IDirect3DDevice local23 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1;
		local23.b(13, this.aClass143_Sub1_22.aFloat136 * this.aClass143_Sub1_22.aFloat141, this.aClass143_Sub1_22.aFloat136 * this.aClass143_Sub1_22.aFloat129, this.aClass143_Sub1_22.aFloat136 * this.aClass143_Sub1_22.aFloat143, 1.0F);
		local23.b(14, this.aClass143_Sub1_22.aFloat142 * this.aClass143_Sub1_22.aFloat141, this.aClass143_Sub1_22.aFloat129 * this.aClass143_Sub1_22.aFloat142, this.aClass143_Sub1_22.aFloat143 * this.aClass143_Sub1_22.aFloat142, 1.0F);
		local23.b(16, this.aClass143_Sub1_22.aFloat135 * this.aClass143_Sub1_22.aFloat141, this.aClass143_Sub1_22.aFloat135 * this.aClass143_Sub1_22.aFloat129, this.aClass143_Sub1_22.aFloat135 * this.aClass143_Sub1_22.aFloat143, 1.0F);
		local19.method6821(this.aClass143_Sub1_22.aFloatArray55[2], Static660.aFloatArray80, this.aClass143_Sub1_22.aFloatArray55[1], this.aClass143_Sub1_22.aFloatArray55[0]);
		local23.SetVertexShaderConstantF(15, Static660.aFloatArray80, 1);
		local19.method6821(this.aClass143_Sub1_22.aFloatArray56[2], Static660.aFloatArray80, this.aClass143_Sub1_22.aFloatArray56[1], this.aClass143_Sub1_22.aFloatArray56[0]);
		local23.SetVertexShaderConstantF(17, Static660.aFloatArray80, 1);
	}

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "(I)V")
	@Override
	public void method8623() {
		@Pc(3) IDirect3DDevice local3 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass143_Sub1_22.method6364();
		@Pc(19) Class56_Sub2 local19 = this.aClass143_Sub1_22.method6281();
		@Pc(31) IDirect3DVertexShader local31;
		if (this.aBoolean756) {
			local31 = Integer.MAX_VALUE == local14 ? this.anIDirect3DVertexShader8 : this.anIDirect3DVertexShader4;
		} else {
			local31 = Integer.MAX_VALUE == local14 ? this.anIDirect3DVertexShader7 : this.anIDirect3DVertexShader5;
		}
		if (local31 != this.anIDirect3DVertexShader6) {
			this.anIDirect3DVertexShader6 = local31;
			this.aClass143_Sub1_Sub1_9.method4610(local31);
			this.method8626();
			this.method8621();
			this.method8616();
			this.method8614();
			this.method8622();
			this.method8618();
		}
		local19.method6815((float) local14, 0.0F, -1.0F, 0.0F, Static660.aFloatArray80);
		local3.a(12, Static660.aFloatArray80);
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V")
	@Override
	public void method8622() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(15) Class56_Sub2 local15 = this.aClass143_Sub1_Sub1_9.method6402();
			local8.a(0, local15.method6822(Static660.aFloatArray79));
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean754) {
				this.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
				this.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
				this.aBoolean754 = false;
			}
			this.aClass143_Sub1_22.method6338(arg0);
			this.aClass143_Sub1_22.method6322(arg1);
		} else if (!this.aBoolean754) {
			this.aClass143_Sub1_22.method6338(this.aClass143_Sub1_22.anInterface4_3);
			this.aClass143_Sub1_22.method6322(1);
			this.aClass143_Sub1_22.method6290(Static85.aClass90_2, 0);
			this.aClass143_Sub1_22.method6391(0, Static85.aClass90_2);
			this.aBoolean754 = true;
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
	@Override
	public void method8618() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass143_Sub1_22.XA();
		@Pc(15) int local15 = this.aClass143_Sub1_22.i();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(39) float local39 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.b(10, local39, 1.0F / (local27 - local39), local27, 1.0F / ((float) local11 - local27));
		local7.b(11, 1.0F / (float) this.aClass143_Sub1_22.method6369(), (float) this.aClass143_Sub1_22.method6340() / 255.0F, this.aClass143_Sub1_22.aFloat134, 1.0F / (this.aClass143_Sub1_22.aFloat134 - this.aClass143_Sub1_22.aFloat130));
		this.aClass143_Sub1_22.method6293(this.aClass143_Sub1_22.method6294());
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
	@Override
	public void method8616() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass143_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(20) Class56_Sub2 local20 = this.aClass143_Sub1_22.method6399();
			local15.SetVertexShaderConstantF(8, local20.method6830(Static660.aFloatArray79), 2);
		}
	}
}
