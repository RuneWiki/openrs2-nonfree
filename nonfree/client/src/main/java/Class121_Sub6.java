import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class121_Sub6 extends Class121 {

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Z")
	private boolean aBoolean623;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
	private boolean aBoolean621 = false;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "Lclient!de;")
	private final Class67_Sub1_Sub1 aClass67_Sub1_Sub1_7;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "Lclient!gp;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "Z")
	private final boolean aBoolean622;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!de;Lclient!lb;)V")
	public Class121_Sub6(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class221 arg1) {
		super(arg0);
		this.aClass67_Sub1_Sub1_7 = arg0;
		if (arg1 == null || (this.aClass67_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean622 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method5076("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method5076("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method5076("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader8 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method5076("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader8 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader6 != null) {
				this.anInterface6_4 = this.aClass67_Sub1_23.method5567(2, false, 1, new int[] { 0, -1 });
				this.anInterface6_4.method9275(false, false);
				this.aBoolean622 = true;
			} else {
				this.aBoolean622 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		this.aBoolean623 = arg0;
		this.aClass67_Sub1_23.method5687(1);
		this.aClass67_Sub1_23.method5612(this.anInterface6_4);
		this.aClass67_Sub1_23.method5686(Static477.aClass37_1, Static573.aClass37_3);
		this.aClass67_Sub1_23.method5590(0, Static472.aClass58_3);
		this.aClass67_Sub1_23.method5641(true, false, Static143.aClass58_1, 2);
		this.aClass67_Sub1_23.method5674(0, Static273.aClass58_2);
		this.aClass67_Sub1_23.method5687(0);
		this.method9242();
	}

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)V")
	private void method6843() {
		if (this.anIDirect3DVertexShader7 == null || !this.aBoolean623) {
			return;
		}
		@Pc(15) Class181_Sub1 local15 = this.aClass67_Sub1_23.method5629();
		@Pc(19) IDirect3DDevice local19 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1;
		local19.a(13, this.aClass67_Sub1_23.aFloat121 * this.aClass67_Sub1_23.aFloat125, this.aClass67_Sub1_23.aFloat121 * this.aClass67_Sub1_23.aFloat117, this.aClass67_Sub1_23.aFloat119 * this.aClass67_Sub1_23.aFloat121, 1.0F);
		local19.a(14, this.aClass67_Sub1_23.aFloat122 * this.aClass67_Sub1_23.aFloat125, this.aClass67_Sub1_23.aFloat122 * this.aClass67_Sub1_23.aFloat117, this.aClass67_Sub1_23.aFloat119 * this.aClass67_Sub1_23.aFloat122, 1.0F);
		local19.a(16, this.aClass67_Sub1_23.aFloat125 * this.aClass67_Sub1_23.aFloat110, this.aClass67_Sub1_23.aFloat110 * this.aClass67_Sub1_23.aFloat117, this.aClass67_Sub1_23.aFloat110 * this.aClass67_Sub1_23.aFloat119, 1.0F);
		local15.method4933(this.aClass67_Sub1_23.aFloatArray57[2], Static461.aFloatArray86, this.aClass67_Sub1_23.aFloatArray57[1], this.aClass67_Sub1_23.aFloatArray57[0]);
		local19.SetVertexShaderConstantF(15, Static461.aFloatArray86, 1);
		local15.method4933(this.aClass67_Sub1_23.aFloatArray61[2], Static461.aFloatArray86, this.aClass67_Sub1_23.aFloatArray61[1], this.aClass67_Sub1_23.aFloatArray61[0]);
		local19.SetVertexShaderConstantF(17, Static461.aFloatArray86, 1);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return this.aBoolean622;
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
	@Override
	public void method9233() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1;
			local17.a(4, this.aClass67_Sub1_23.method5632(Static461.aFloatArray87));
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method9240() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(20) int local20 = this.aClass67_Sub1_23.XA();
		@Pc(24) int local24 = this.aClass67_Sub1_23.i();
		@Pc(35) float local35 = (float) local20 - (float) (local20 - local24) * 0.125F;
		@Pc(47) float local47 = -((float) (local20 - local24) * 0.25F) + (float) local20;
		local16.a(10, local47, 1.0F / (local35 - local47), local35, 1.0F / ((float) local20 - local35));
		local16.a(11, 1.0F / (float) this.aClass67_Sub1_23.method5596(), (float) this.aClass67_Sub1_23.method5634() / 255.0F, this.aClass67_Sub1_23.aFloat124, 1.0F / (this.aClass67_Sub1_23.aFloat124 - this.aClass67_Sub1_23.aFloat126));
		this.aClass67_Sub1_23.method5588(this.aClass67_Sub1_23.method5647());
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		this.aClass67_Sub1_23.method5687(1);
		this.aClass67_Sub1_23.method5612((Interface12) null);
		this.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
		this.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
		this.aClass67_Sub1_23.method5590(2, Static472.aClass58_3);
		this.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
		this.aClass67_Sub1_23.method5687(0);
		if (this.aBoolean621) {
			this.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
			this.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
			this.aBoolean621 = false;
		}
		if (this.anIDirect3DVertexShader7 != null) {
			this.aClass67_Sub1_Sub1_7.method1925((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean621) {
				this.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
				this.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
				this.aBoolean621 = false;
			}
			this.aClass67_Sub1_23.method5612(arg0);
			this.aClass67_Sub1_23.method5655(arg1);
		} else if (!this.aBoolean621) {
			this.aClass67_Sub1_23.method5612(this.aClass67_Sub1_23.anInterface12_3);
			this.aClass67_Sub1_23.method5655(1);
			this.aClass67_Sub1_23.method5590(0, Static273.aClass58_2);
			this.aClass67_Sub1_23.method5674(0, Static273.aClass58_2);
			this.aBoolean621 = true;
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(14) Class181_Sub1 local14 = this.aClass67_Sub1_Sub1_7.method5578();
			local9.a(0, local14.method4920(Static461.aFloatArray87));
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
	@Override
	public void method9242() {
		@Pc(3) IDirect3DDevice local3 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass67_Sub1_23.method5654();
		@Pc(22) Class181_Sub1 local22 = this.aClass67_Sub1_23.method5619();
		@Pc(39) IDirect3DVertexShader local39;
		if (this.aBoolean623) {
			local39 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader8;
		} else {
			local39 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader6;
		}
		if (local39 != this.anIDirect3DVertexShader7) {
			this.anIDirect3DVertexShader7 = local39;
			this.aClass67_Sub1_Sub1_7.method1925(local39);
			this.method6843();
			this.method9233();
			this.method9237();
			this.method9235();
			this.method9243();
			this.method9240();
		}
		local22.method4921(0.0F, (float) local8, 0.0F, Static461.aFloatArray86, -1.0F);
		local3.a(12, Static461.aFloatArray86);
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)V")
	@Override
	public void method9243() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class181_Sub1 local13 = this.aClass67_Sub1_Sub1_7.method5578();
			local8.a(0, local13.method4920(Static461.aFloatArray87));
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public void method9237() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass67_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(15) Class181_Sub1 local15 = this.aClass67_Sub1_23.method5566();
			local10.SetVertexShaderConstantF(8, local15.method4925(Static461.aFloatArray87), 2);
		}
	}
}
