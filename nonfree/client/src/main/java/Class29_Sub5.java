import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class29_Sub5 extends Class29 {

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "Z")
	private boolean aBoolean280;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Z")
	private boolean aBoolean281 = false;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "Lclient!ad;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_4;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "Lclient!ug;")
	private Interface24 anInterface24_1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ad;Lclient!la;)V")
	public Class29_Sub5(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class196 arg1) {
		super(arg0);
		this.aClass5_Sub1_Sub1_4 = arg0;
		if (arg1 == null || (this.aClass5_Sub1_Sub1_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean282 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1.b(arg1.method5093("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader7 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1.b(arg1.method5093("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader4 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1.b(arg1.method5093("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1.b(arg1.method5093("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader7 != null) {
				this.anInterface24_1 = this.aClass5_Sub1_22.method5633(false, 1, 2, new int[] { 0, -1 });
				this.anInterface24_1.method7475(false, false);
				this.aBoolean282 = true;
			} else {
				this.aBoolean282 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		this.aClass5_Sub1_22.method5571(1);
		this.aClass5_Sub1_22.method5609(null);
		this.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
		this.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
		this.aClass5_Sub1_22.method5583(Static161.aClass9_3, 2);
		this.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
		this.aClass5_Sub1_22.method5571(0);
		if (this.aBoolean281) {
			this.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
			this.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
			this.aBoolean281 = false;
		}
		if (this.anIDirect3DVertexShader6 != null) {
			this.aClass5_Sub1_Sub1_4.method658(null);
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
	@Override
	public void method8079() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1;
			@Pc(12) Class39_Sub1 local12 = this.aClass5_Sub1_Sub1_4.method5594();
			local7.a(0, local12.method1559(Static217.aFloatArray28));
		}
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
	@Override
	public void method8077() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1;
			@Pc(12) Class39_Sub1 local12 = this.aClass5_Sub1_22.method5661();
			local7.SetVertexShaderConstantF(8, local12.method1563(Static217.aFloatArray28), 2);
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	@Override
	public void method8082() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1;
			@Pc(11) Class39_Sub1 local11 = this.aClass5_Sub1_Sub1_4.method5594();
			local6.a(0, local11.method1559(Static217.aFloatArray28));
		}
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
	@Override
	public void method8084() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass5_Sub1_22.XA();
		@Pc(15) int local15 = this.aClass5_Sub1_22.i();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(38) float local38 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.a(10, local38, 1.0F / (local27 - local38), local27, 1.0F / ((float) local11 - local27));
		local7.a(11, 1.0F / (float) this.aClass5_Sub1_22.method5689(), (float) this.aClass5_Sub1_22.method5577() / 255.0F, this.aClass5_Sub1_22.aFloat139, 1.0F / (this.aClass5_Sub1_22.aFloat139 - this.aClass5_Sub1_22.aFloat145));
		this.aClass5_Sub1_22.method5574(this.aClass5_Sub1_22.method5696());
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	private void method3655() {
		if (this.anIDirect3DVertexShader6 == null || !this.aBoolean280) {
			return;
		}
		@Pc(11) Class39_Sub1 local11 = this.aClass5_Sub1_22.method5569();
		@Pc(15) IDirect3DDevice local15 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1;
		local15.a(13, this.aClass5_Sub1_22.aFloat141 * this.aClass5_Sub1_22.aFloat136, this.aClass5_Sub1_22.aFloat142 * this.aClass5_Sub1_22.aFloat141, this.aClass5_Sub1_22.aFloat141 * this.aClass5_Sub1_22.aFloat140, 1.0F);
		local15.a(14, this.aClass5_Sub1_22.aFloat148 * this.aClass5_Sub1_22.aFloat136, this.aClass5_Sub1_22.aFloat148 * this.aClass5_Sub1_22.aFloat142, this.aClass5_Sub1_22.aFloat140 * this.aClass5_Sub1_22.aFloat148, 1.0F);
		local15.a(16, this.aClass5_Sub1_22.aFloat136 * this.aClass5_Sub1_22.aFloat147, this.aClass5_Sub1_22.aFloat147 * this.aClass5_Sub1_22.aFloat142, this.aClass5_Sub1_22.aFloat147 * this.aClass5_Sub1_22.aFloat140, 1.0F);
		local11.method1561(this.aClass5_Sub1_22.aFloatArray50[0], Static217.aFloatArray29, this.aClass5_Sub1_22.aFloatArray50[1], this.aClass5_Sub1_22.aFloatArray50[2]);
		local15.SetVertexShaderConstantF(15, Static217.aFloatArray29, 1);
		local11.method1561(this.aClass5_Sub1_22.aFloatArray53[0], Static217.aFloatArray29, this.aClass5_Sub1_22.aFloatArray53[1], this.aClass5_Sub1_22.aFloatArray53[2]);
		local15.SetVertexShaderConstantF(17, Static217.aFloatArray29, 1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg1 != null) {
			if (this.aBoolean281) {
				this.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
				this.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
				this.aBoolean281 = false;
			}
			this.aClass5_Sub1_22.method5609(arg1);
			this.aClass5_Sub1_22.method5697(arg0);
		} else if (!this.aBoolean281) {
			this.aClass5_Sub1_22.method5609(this.aClass5_Sub1_22.anInterface10_3);
			this.aClass5_Sub1_22.method5697(1);
			this.aClass5_Sub1_22.method5583(Static482.aClass9_4, 0);
			this.aClass5_Sub1_22.method5592(Static482.aClass9_4, 0);
			this.aBoolean281 = true;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return this.aBoolean282;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		this.aBoolean280 = arg0;
		this.aClass5_Sub1_22.method5571(1);
		this.aClass5_Sub1_22.method5609(this.anInterface24_1);
		this.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static275.aClass374_1);
		this.aClass5_Sub1_22.method5583(Static161.aClass9_3, 0);
		this.aClass5_Sub1_22.method5618(false, true, 2, Static333.aClass9_2);
		this.aClass5_Sub1_22.method5592(Static482.aClass9_4, 0);
		this.aClass5_Sub1_22.method5571(0);
		this.method8076();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	@Override
	public void method8076() {
		@Pc(3) IDirect3DDevice local3 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass5_Sub1_22.method5588();
		@Pc(13) Class39_Sub1 local13 = this.aClass5_Sub1_22.method5646();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean280) {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader7 : this.anIDirect3DVertexShader5;
		} else {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader4;
		}
		if (this.anIDirect3DVertexShader6 != local27) {
			this.anIDirect3DVertexShader6 = local27;
			this.aClass5_Sub1_Sub1_4.method658(local27);
			this.method3655();
			this.method8078();
			this.method8077();
			this.method8082();
			this.method8079();
			this.method8084();
		}
		local13.method1553(-1.0F, Static217.aFloatArray29, 0.0F, (float) local8, (float) 0);
		local3.a(12, Static217.aFloatArray29);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	@Override
	public void method8078() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub1_Sub1_4.anIDirect3DDevice1;
			local7.a(4, this.aClass5_Sub1_22.method5627(Static217.aFloatArray28));
		}
	}
}
