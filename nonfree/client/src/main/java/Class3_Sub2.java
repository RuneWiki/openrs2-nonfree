import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!hb;")
	private final Class12_Sub2_Sub1 aClass12_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "Z")
	private final boolean aBoolean161;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!gn;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!hb;Lclient!ga;)V")
	public Class3_Sub2(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class111 arg1) {
		super(arg0);
		this.aClass12_Sub2_Sub1_1 = arg0;
		if (arg1 == null || (this.aClass12_Sub2_Sub1_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean161 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1.a(arg1.method2450("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader1 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1.a(arg1.method2450("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1.a(arg1.method2450("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1.a(arg1.method2450("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface8_2 = this.aClass12_Sub2_23.method6229(1, false, 2, new int[] { 0, -1 });
				this.anInterface8_2.method7331(false, false);
				this.aBoolean161 = true;
			} else {
				this.aBoolean161 = false;
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	@Override
	public void method7530() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1;
			local7.a(4, this.aClass12_Sub2_23.method6216(Static91.aFloatArray8));
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	@Override
	public void method7527() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1;
			@Pc(12) Class209_Sub2 local12 = this.aClass12_Sub2_Sub1_1.method6164();
			local7.a(0, local12.method4917(Static91.aFloatArray8));
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	@Override
	public void method7525() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass12_Sub2_23.U();
		@Pc(15) int local15 = this.aClass12_Sub2_23.BA();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(39) float local39 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.b(10, local39, 1.0F / (local27 - local39), local27, 1.0F / ((float) local11 - local27));
		local7.b(11, 1.0F / (float) this.aClass12_Sub2_23.method6224(), (float) this.aClass12_Sub2_23.method6220() / 255.0F, this.aClass12_Sub2_23.aFloat186, 1.0F / (this.aClass12_Sub2_23.aFloat186 - this.aClass12_Sub2_23.aFloat194));
		this.aClass12_Sub2_23.method6259(this.aClass12_Sub2_23.method6251());
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		this.aClass12_Sub2_23.method6196(1);
		this.aClass12_Sub2_23.method6159(null);
		this.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
		this.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
		this.aClass12_Sub2_23.method6179(Static135.aClass84_1, 2);
		this.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
		this.aClass12_Sub2_23.method6196(0);
		this.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
		this.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	@Override
	public void method7526() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1;
			@Pc(12) Class209_Sub2 local12 = this.aClass12_Sub2_Sub1_1.method6164();
			local7.a(0, local12.method4917(Static91.aFloatArray8));
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
	private void method1775() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean162) {
			return;
		}
		@Pc(15) Class209_Sub2 local15 = this.aClass12_Sub2_23.method6180();
		@Pc(19) IDirect3DDevice local19 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1;
		local19.b(13, this.aClass12_Sub2_23.aFloat188 * this.aClass12_Sub2_23.aFloat183, this.aClass12_Sub2_23.aFloat197 * this.aClass12_Sub2_23.aFloat188, this.aClass12_Sub2_23.aFloat188 * this.aClass12_Sub2_23.aFloat195, 1.0F);
		local19.b(14, this.aClass12_Sub2_23.aFloat183 * this.aClass12_Sub2_23.aFloat193, this.aClass12_Sub2_23.aFloat197 * this.aClass12_Sub2_23.aFloat193, this.aClass12_Sub2_23.aFloat195 * this.aClass12_Sub2_23.aFloat193, 1.0F);
		local19.b(16, this.aClass12_Sub2_23.aFloat191 * this.aClass12_Sub2_23.aFloat183, this.aClass12_Sub2_23.aFloat197 * this.aClass12_Sub2_23.aFloat191, this.aClass12_Sub2_23.aFloat191 * this.aClass12_Sub2_23.aFloat195, 1.0F);
		local15.method4929(this.aClass12_Sub2_23.aFloatArray62[1], Static91.aFloatArray7, this.aClass12_Sub2_23.aFloatArray62[2], this.aClass12_Sub2_23.aFloatArray62[0]);
		local19.SetVertexShaderConstantF(15, Static91.aFloatArray7, 1);
		local15.method4929(this.aClass12_Sub2_23.aFloatArray63[1], Static91.aFloatArray7, this.aClass12_Sub2_23.aFloatArray63[2], this.aClass12_Sub2_23.aFloatArray63[0]);
		local19.SetVertexShaderConstantF(17, Static91.aFloatArray7, 1);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		this.aBoolean162 = arg0;
		this.aClass12_Sub2_23.method6196(1);
		this.aClass12_Sub2_23.method6159(this.anInterface8_2);
		this.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static6.aClass108_7);
		this.aClass12_Sub2_23.method6179(Static135.aClass84_1, 0);
		this.aClass12_Sub2_23.method6280(2, Static587.aClass84_6, false, true);
		this.aClass12_Sub2_23.method6234(0, Static266.aClass84_5);
		this.aClass12_Sub2_23.method6196(0);
		this.method7532();
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return this.aBoolean161;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			this.aClass12_Sub2_23.method6159(this.aClass12_Sub2_23.anInterface18_3);
			this.aClass12_Sub2_23.method6249(1);
			this.aClass12_Sub2_23.method6179(Static266.aClass84_5, 0);
			this.aClass12_Sub2_23.method6234(0, Static266.aClass84_5);
		} else {
			this.aClass12_Sub2_23.method6159(arg0);
			this.aClass12_Sub2_23.method6249(arg1);
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
	@Override
	public void method7532() {
		@Pc(9) IDirect3DDevice local9 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass12_Sub2_23.method6282();
		@Pc(19) Class209_Sub2 local19 = this.aClass12_Sub2_23.method6198();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean162) {
			local33 = Integer.MIN_VALUE == ~local14 ? this.anIDirect3DVertexShader1 : this.anIDirect3DVertexShader3;
		} else {
			local33 = Integer.MIN_VALUE == ~local14 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader2;
		}
		if (local33 != this.anIDirect3DVertexShader4) {
			this.anIDirect3DVertexShader4 = local33;
			local9.SetVertexShader(local33);
			this.method1775();
			this.method7530();
			this.method7536();
			this.method7526();
			this.method7527();
			this.method7525();
		}
		local19.method4923(-1.0F, 0.0F, 0.0F, (float) local14, Static91.aFloatArray7);
		local9.a(12, Static91.aFloatArray7);
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
	@Override
	public void method7536() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass12_Sub2_Sub1_1.anIDirect3DDevice1;
			@Pc(13) Class209_Sub2 local13 = this.aClass12_Sub2_23.method6238();
			local8.SetVertexShaderConstantF(8, local13.method4919(Static91.aFloatArray8), 2);
		}
	}
}
