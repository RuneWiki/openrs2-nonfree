import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class16_Sub11 extends Class16 {

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "Z")
	private boolean aBoolean881;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "Z")
	private boolean aBoolean879 = false;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "Lclient!cu;")
	private final Class33_Sub1_Sub2 aClass33_Sub1_Sub2_9;

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "Lclient!baa;")
	private Interface2 anInterface2_6;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "Z")
	private final boolean aBoolean880;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!cu;Lclient!kha;)V")
	public Class16_Sub11(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class181 arg1) {
		super(arg0);
		this.aClass33_Sub1_Sub2_9 = arg0;
		if (arg1 == null || (this.aClass33_Sub1_Sub2_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean880 = false;
		} else {
			this.anIDirect3DVertexShader7 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1.b(arg1.method5026("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader8 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1.b(arg1.method5026("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader6 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1.b(arg1.method5026("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1.b(arg1.method5026("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader7 != null & this.anIDirect3DVertexShader8 != null & this.anIDirect3DVertexShader6 != null) {
				this.anInterface2_6 = this.aClass33_Sub1_23.method2023(new int[] { 0, -1 }, false, 2, 1);
				this.anInterface2_6.method6506(false, false);
				this.aBoolean880 = true;
			} else {
				this.aBoolean880 = false;
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	@Override
	public void method8607() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1;
			local13.a(4, this.aClass33_Sub1_23.method2048(Static635.aFloatArray78));
		}
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V")
	@Override
	public void method8610() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1;
			@Pc(16) Class47_Sub3 local16 = this.aClass33_Sub1_23.method2041();
			local11.SetVertexShaderConstantF(8, local16.method7895(Static635.aFloatArray78), 2);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		this.aBoolean881 = arg0;
		this.aClass33_Sub1_23.method2010(1);
		this.aClass33_Sub1_23.method1987(this.anInterface2_6);
		this.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static95.aClass363_3);
		this.aClass33_Sub1_23.method2098(0, Static139.aClass371_3);
		this.aClass33_Sub1_23.method1988(false, 2, true, Static419.aClass371_4);
		this.aClass33_Sub1_23.method1991(Static25.aClass371_1, 0);
		this.aClass33_Sub1_23.method2010(0);
		this.method8606();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean879) {
				this.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
				this.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
				this.aBoolean879 = false;
			}
			this.aClass33_Sub1_23.method1987(arg0);
			this.aClass33_Sub1_23.method2105(arg1);
		} else if (!this.aBoolean879) {
			this.aClass33_Sub1_23.method1987(this.aClass33_Sub1_23.anInterface3_3);
			this.aClass33_Sub1_23.method2105(1);
			this.aClass33_Sub1_23.method2098(0, Static25.aClass371_1);
			this.aClass33_Sub1_23.method1991(Static25.aClass371_1, 0);
			this.aBoolean879 = true;
		}
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
	private void method8612() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean881) {
			return;
		}
		@Pc(12) Class47_Sub3 local12 = this.aClass33_Sub1_23.method2016();
		@Pc(16) IDirect3DDevice local16 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1;
		local16.a(13, this.aClass33_Sub1_23.aFloat69 * this.aClass33_Sub1_23.aFloat85, this.aClass33_Sub1_23.aFloat85 * this.aClass33_Sub1_23.aFloat71, this.aClass33_Sub1_23.aFloat77 * this.aClass33_Sub1_23.aFloat85, 1.0F);
		local16.a(14, this.aClass33_Sub1_23.aFloat69 * this.aClass33_Sub1_23.aFloat84, this.aClass33_Sub1_23.aFloat71 * this.aClass33_Sub1_23.aFloat84, this.aClass33_Sub1_23.aFloat77 * this.aClass33_Sub1_23.aFloat84, 1.0F);
		local16.a(16, this.aClass33_Sub1_23.aFloat79 * this.aClass33_Sub1_23.aFloat69, this.aClass33_Sub1_23.aFloat79 * this.aClass33_Sub1_23.aFloat71, this.aClass33_Sub1_23.aFloat77 * this.aClass33_Sub1_23.aFloat79, 1.0F);
		local12.method7890(Static635.aFloatArray79, this.aClass33_Sub1_23.aFloatArray29[2], this.aClass33_Sub1_23.aFloatArray29[1], this.aClass33_Sub1_23.aFloatArray29[0]);
		local16.SetVertexShaderConstantF(15, Static635.aFloatArray79, 1);
		local12.method7890(Static635.aFloatArray79, this.aClass33_Sub1_23.aFloatArray27[2], this.aClass33_Sub1_23.aFloatArray27[1], this.aClass33_Sub1_23.aFloatArray27[0]);
		local16.SetVertexShaderConstantF(17, Static635.aFloatArray79, 1);
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return this.aBoolean880;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	@Override
	public void method8599() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass33_Sub1_23.XA();
		@Pc(22) int local22 = this.aClass33_Sub1_23.i();
		@Pc(34) float local34 = -((float) (local18 - local22) * 0.125F) + (float) local18;
		@Pc(46) float local46 = -((float) (local18 - local22) * 0.25F) + (float) local18;
		local14.a(10, local46, 1.0F / (local34 - local46), local34, 1.0F / ((float) local18 - local34));
		local14.a(11, 1.0F / (float) this.aClass33_Sub1_23.method2103(), (float) this.aClass33_Sub1_23.method1984() / 255.0F, this.aClass33_Sub1_23.aFloat73, 1.0F / (this.aClass33_Sub1_23.aFloat73 - this.aClass33_Sub1_23.aFloat81));
		this.aClass33_Sub1_23.method1996(this.aClass33_Sub1_23.method2071());
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	@Override
	public void method8609() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1;
			@Pc(11) Class47_Sub3 local11 = this.aClass33_Sub1_Sub2_9.method2061();
			local6.a(0, local11.method7880(Static635.aFloatArray78));
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
	@Override
	public void method8600() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1;
			@Pc(16) Class47_Sub3 local16 = this.aClass33_Sub1_Sub2_9.method2061();
			local11.a(0, local16.method7880(Static635.aFloatArray78));
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		this.aClass33_Sub1_23.method2010(1);
		this.aClass33_Sub1_23.method1987(null);
		this.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
		this.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
		this.aClass33_Sub1_23.method2098(2, Static139.aClass371_3);
		this.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
		this.aClass33_Sub1_23.method2010(0);
		if (this.aBoolean879) {
			this.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
			this.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
			this.aBoolean879 = false;
		}
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass33_Sub1_Sub2_9.method2119(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
	@Override
	public void method8606() {
		@Pc(3) IDirect3DDevice local3 = this.aClass33_Sub1_Sub2_9.anIDirect3DDevice1;
		@Pc(12) int local12 = this.aClass33_Sub1_23.method2082();
		@Pc(19) Class47_Sub3 local19 = this.aClass33_Sub1_23.method1997();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean881) {
			local33 = ~local12 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader8 : this.anIDirect3DVertexShader5;
		} else {
			local33 = ~local12 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader7 : this.anIDirect3DVertexShader6;
		}
		if (this.anIDirect3DVertexShader4 != local33) {
			this.anIDirect3DVertexShader4 = local33;
			this.aClass33_Sub1_Sub2_9.method2119(local33);
			this.method8612();
			this.method8607();
			this.method8610();
			this.method8609();
			this.method8600();
			this.method8599();
		}
		local19.method7897(-1.0F, Static635.aFloatArray79, 0.0F, 0.0F, (float) local12);
		local3.a(12, Static635.aFloatArray79);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
	}
}
