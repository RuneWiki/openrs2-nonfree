import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!fi;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_8;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!ch;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!fi;Lclient!vd;)V")
	public Class7_Sub7(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class353 arg1) {
		super(arg0);
		this.aClass100_Sub1_Sub1_8 = arg0;
		if (arg1 == null || (this.aClass100_Sub1_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean396 = false;
		} else {
			this.anIDirect3DVertexShader7 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method8426("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method8426("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method8426("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader3 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method8426("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader7 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface3_4 = this.aClass100_Sub1_22.method6097(false, 1, new int[] { 0, -1 }, 2);
				this.anInterface3_4.method7839(false, false);
				this.aBoolean396 = true;
			} else {
				this.aBoolean396 = false;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	private void method5182() {
		if (this.anIDirect3DVertexShader6 == null || !this.aBoolean395) {
			return;
		}
		@Pc(12) Class154_Sub2 local12 = this.aClass100_Sub1_22.method6060();
		@Pc(16) IDirect3DDevice local16 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
		local16.b(13, this.aClass100_Sub1_22.aFloat126 * this.aClass100_Sub1_22.aFloat130, this.aClass100_Sub1_22.aFloat138 * this.aClass100_Sub1_22.aFloat126, this.aClass100_Sub1_22.aFloat126 * this.aClass100_Sub1_22.aFloat127, 1.0F);
		local16.b(14, this.aClass100_Sub1_22.aFloat132 * this.aClass100_Sub1_22.aFloat130, this.aClass100_Sub1_22.aFloat138 * this.aClass100_Sub1_22.aFloat132, this.aClass100_Sub1_22.aFloat127 * this.aClass100_Sub1_22.aFloat132, 1.0F);
		local16.b(16, this.aClass100_Sub1_22.aFloat130 * this.aClass100_Sub1_22.aFloat139, this.aClass100_Sub1_22.aFloat139 * this.aClass100_Sub1_22.aFloat138, this.aClass100_Sub1_22.aFloat127 * this.aClass100_Sub1_22.aFloat139, 1.0F);
		local12.method4532(this.aClass100_Sub1_22.aFloatArray60[2], Static305.aFloatArray48, this.aClass100_Sub1_22.aFloatArray60[1], this.aClass100_Sub1_22.aFloatArray60[0]);
		local16.SetVertexShaderConstantF(15, Static305.aFloatArray48, 1);
		local12.method4532(this.aClass100_Sub1_22.aFloatArray59[2], Static305.aFloatArray48, this.aClass100_Sub1_22.aFloatArray59[1], this.aClass100_Sub1_22.aFloatArray59[0]);
		local16.SetVertexShaderConstantF(17, Static305.aFloatArray48, 1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return this.aBoolean396;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(Z)V")
	@Override
	public void method7190() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass100_Sub1_22.XA();
		@Pc(15) int local15 = this.aClass100_Sub1_22.i();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(39) float local39 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.b(10, local39, 1.0F / (local27 - local39), local27, 1.0F / ((float) local11 - local27));
		local7.b(11, 1.0F / (float) this.aClass100_Sub1_22.method6100(), (float) this.aClass100_Sub1_22.method6155() / 255.0F, this.aClass100_Sub1_22.aFloat135, 1.0F / (this.aClass100_Sub1_22.aFloat135 - this.aClass100_Sub1_22.aFloat137));
		this.aClass100_Sub1_22.method6154(this.aClass100_Sub1_22.method6072());
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean397) {
				this.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
				this.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
				this.aBoolean397 = false;
			}
			this.aClass100_Sub1_22.method6033(arg0);
			this.aClass100_Sub1_22.method6092(arg1);
		} else if (!this.aBoolean397) {
			this.aClass100_Sub1_22.method6033(this.aClass100_Sub1_22.anInterface1_3);
			this.aClass100_Sub1_22.method6092(1);
			this.aClass100_Sub1_22.method6068(0, Static506.aClass187_3);
			this.aClass100_Sub1_22.method6146(0, Static506.aClass187_3);
			this.aBoolean397 = true;
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
	@Override
	public void method7188() {
		@Pc(3) IDirect3DDevice local3 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass100_Sub1_22.method6132();
		@Pc(19) Class154_Sub2 local19 = this.aClass100_Sub1_22.method6086();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean395) {
			local33 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader3;
		} else {
			local33 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader7 : this.anIDirect3DVertexShader5;
		}
		if (local33 != this.anIDirect3DVertexShader6) {
			this.anIDirect3DVertexShader6 = local33;
			this.aClass100_Sub1_Sub1_8.method2995(local33);
			this.method5182();
			this.method7182();
			this.method7196();
			this.method7185();
			this.method7184();
			this.method7190();
		}
		local19.method4537(Static305.aFloatArray48, 0.0F, (float) local8, 0.0F, -1.0F);
		local3.a(12, Static305.aFloatArray48);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	@Override
	public void method7185() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(18) Class154_Sub2 local18 = this.aClass100_Sub1_Sub1_8.method6077();
			local13.a(0, local18.method4538(Static305.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	@Override
	public void method7184() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(15) Class154_Sub2 local15 = this.aClass100_Sub1_Sub1_8.method6077();
			local10.a(0, local15.method4538(Static305.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(Z)V")
	@Override
	public void method7196() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(18) Class154_Sub2 local18 = this.aClass100_Sub1_22.method6089();
			local13.SetVertexShaderConstantF(8, local18.method4530(Static305.aFloatArray49), 2);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	@Override
	public void method7182() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			local8.a(4, this.aClass100_Sub1_22.method6111(Static305.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		this.aBoolean395 = arg0;
		this.aClass100_Sub1_22.method6114(1);
		this.aClass100_Sub1_22.method6033(this.anInterface3_4);
		this.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static190.aClass256_2);
		this.aClass100_Sub1_22.method6068(0, Static456.aClass187_2);
		this.aClass100_Sub1_22.method6079(Static622.aClass187_4, true, 2, false);
		this.aClass100_Sub1_22.method6146(0, Static506.aClass187_3);
		this.aClass100_Sub1_22.method6114(0);
		this.method7188();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		this.aClass100_Sub1_22.method6114(1);
		this.aClass100_Sub1_22.method6033((Interface1) null);
		this.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
		this.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
		this.aClass100_Sub1_22.method6068(2, Static456.aClass187_2);
		this.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
		this.aClass100_Sub1_22.method6114(0);
		if (this.aBoolean397) {
			this.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
			this.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
			this.aBoolean397 = false;
		}
		if (this.anIDirect3DVertexShader6 != null) {
			this.aClass100_Sub1_Sub1_8.method2995((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader6 = null;
		}
	}
}
