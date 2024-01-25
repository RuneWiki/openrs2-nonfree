import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Z")
	private boolean aBoolean1;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!uda;")
	private final Class95_Sub1_Sub2 aClass95_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Z")
	private final boolean aBoolean3;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!fk;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!uda;Lclient!uq;)V")
	public Class4_Sub1(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class362 arg1) {
		super(arg0);
		this.aClass95_Sub1_Sub2_1 = arg0;
		if (arg1 == null || (this.aClass95_Sub1_Sub2_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean3 = false;
		} else {
			this.anIDirect3DVertexShader1 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method8369("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method8369("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method8369("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method8369("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader5 != null) {
				this.anInterface8_1 = this.aClass95_Sub1_23.method8103(1, 2, new int[] { 0, -1 }, false);
				this.anInterface8_1.method7068(false, false);
				this.aBoolean3 = true;
			} else {
				this.aBoolean3 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	@Override
	public void method8486() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1;
		@Pc(15) int local15 = this.aClass95_Sub1_23.XA();
		@Pc(19) int local19 = this.aClass95_Sub1_23.i();
		@Pc(30) float local30 = -((float) (local15 - local19) * 0.125F) + (float) local15;
		@Pc(42) float local42 = -((float) (local15 - local19) * 0.25F) + (float) local15;
		local11.a(10, local42, 1.0F / (local30 - local42), local30, 1.0F / ((float) local15 - local30));
		local11.a(11, 1.0F / (float) this.aClass95_Sub1_23.method8079(), (float) this.aClass95_Sub1_23.method8158() / 255.0F, this.aClass95_Sub1_23.aFloat189, 1.0F / (this.aClass95_Sub1_23.aFloat189 - this.aClass95_Sub1_23.aFloat195));
		this.aClass95_Sub1_23.method8078(this.aClass95_Sub1_23.method8096());
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
	@Override
	public void method8490() {
		@Pc(3) IDirect3DDevice local3 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass95_Sub1_23.method8187();
		@Pc(22) Class17_Sub2 local22 = this.aClass95_Sub1_23.method8124();
		@Pc(36) IDirect3DVertexShader local36;
		if (this.aBoolean1) {
			local36 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader4;
		} else {
			local36 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader1 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader2 != local36) {
			this.anIDirect3DVertexShader2 = local36;
			this.aClass95_Sub1_Sub2_1.method8217(local36);
			this.method78();
			this.method8492();
			this.method8485();
			this.method8489();
			this.method8480();
			this.method8486();
		}
		local22.method5858(Static4.aFloatArray1, -1.0F, (float) local8, 0.0F, 0.0F);
		local3.a(12, Static4.aFloatArray1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	@Override
	public void method8480() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(11) Class17_Sub2 local11 = this.aClass95_Sub1_Sub2_1.method8081();
			local6.a(0, local11.method5854(Static4.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	@Override
	public void method8489() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_Sub2_1.method8081();
			local8.a(0, local13.method5854(Static4.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		this.aBoolean1 = arg0;
		this.aClass95_Sub1_23.method8153(1);
		this.aClass95_Sub1_23.method8147(this.anInterface8_1);
		this.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static315.aClass112_22);
		this.aClass95_Sub1_23.method8108(0, Static576.aClass235_3);
		this.aClass95_Sub1_23.method8101(2, false, Static665.aClass235_4, true);
		this.aClass95_Sub1_23.method8122(Static383.aClass235_2, 0);
		this.aClass95_Sub1_23.method8153(0);
		this.method8490();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	@Override
	public void method8485() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(14) Class17_Sub2 local14 = this.aClass95_Sub1_23.method8102();
			local7.SetVertexShaderConstantF(8, local14.method5852(Static4.aFloatArray2), 2);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean2) {
				this.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
				this.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
				this.aBoolean2 = false;
			}
			this.aClass95_Sub1_23.method8147(arg0);
			this.aClass95_Sub1_23.method8129(arg1);
		} else if (!this.aBoolean2) {
			this.aClass95_Sub1_23.method8147(this.aClass95_Sub1_23.anInterface1_3);
			this.aClass95_Sub1_23.method8129(1);
			this.aClass95_Sub1_23.method8108(0, Static383.aClass235_2);
			this.aClass95_Sub1_23.method8122(Static383.aClass235_2, 0);
			this.aBoolean2 = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1;
			local7.a(4, this.aClass95_Sub1_23.method8193(Static4.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		this.aClass95_Sub1_23.method8153(1);
		this.aClass95_Sub1_23.method8147((Interface1) null);
		this.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
		this.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
		this.aClass95_Sub1_23.method8108(2, Static576.aClass235_3);
		this.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
		this.aClass95_Sub1_23.method8153(0);
		if (this.aBoolean2) {
			this.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
			this.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
			this.aBoolean2 = false;
		}
		if (this.anIDirect3DVertexShader2 != null) {
			this.aClass95_Sub1_Sub2_1.method8217((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	private void method78() {
		if (this.anIDirect3DVertexShader2 == null || !this.aBoolean1) {
			return;
		}
		@Pc(11) Class17_Sub2 local11 = this.aClass95_Sub1_23.method8172();
		@Pc(15) IDirect3DDevice local15 = this.aClass95_Sub1_Sub2_1.anIDirect3DDevice1;
		local15.a(13, this.aClass95_Sub1_23.aFloat193 * this.aClass95_Sub1_23.aFloat199, this.aClass95_Sub1_23.aFloat200 * this.aClass95_Sub1_23.aFloat199, this.aClass95_Sub1_23.aFloat192 * this.aClass95_Sub1_23.aFloat199, 1.0F);
		local15.a(14, this.aClass95_Sub1_23.aFloat193 * this.aClass95_Sub1_23.aFloat203, this.aClass95_Sub1_23.aFloat203 * this.aClass95_Sub1_23.aFloat200, this.aClass95_Sub1_23.aFloat192 * this.aClass95_Sub1_23.aFloat203, 1.0F);
		local15.a(16, this.aClass95_Sub1_23.aFloat191 * this.aClass95_Sub1_23.aFloat193, this.aClass95_Sub1_23.aFloat200 * this.aClass95_Sub1_23.aFloat191, this.aClass95_Sub1_23.aFloat191 * this.aClass95_Sub1_23.aFloat192, 1.0F);
		local11.method5847(this.aClass95_Sub1_23.aFloatArray64[1], this.aClass95_Sub1_23.aFloatArray64[2], Static4.aFloatArray1, this.aClass95_Sub1_23.aFloatArray64[0]);
		local15.SetVertexShaderConstantF(15, Static4.aFloatArray1, 1);
		local11.method5847(this.aClass95_Sub1_23.aFloatArray65[1], this.aClass95_Sub1_23.aFloatArray65[2], Static4.aFloatArray1, this.aClass95_Sub1_23.aFloatArray65[0]);
		local15.SetVertexShaderConstantF(17, Static4.aFloatArray1, 1);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return this.aBoolean3;
	}
}
