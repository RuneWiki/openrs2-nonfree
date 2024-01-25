import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class9_Sub9 extends Class9 {

	@OriginalMember(owner = "client!tba", name = "q", descriptor = "Z")
	private boolean aBoolean634;

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "Lclient!ob;")
	private final Class242 aClass242_7;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "Lclient!oe;")
	private final Class7_Sub1_Sub2 aClass7_Sub1_Sub2_7;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "Z")
	private final boolean aBoolean633;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!oe;Lclient!vo;Lclient!ob;)V")
	public Class9_Sub9(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass242_7 = arg2;
		this.aClass7_Sub1_Sub2_7 = arg0;
		if (arg1 != null && this.aClass7_Sub1_23.aBoolean520 && this.aClass7_Sub1_23.aBoolean532 && (this.aClass7_Sub1_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1.b(arg1.method7956("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method7956("environment_mapped_water_f", "dx"));
			this.aBoolean633 = this.anIDirect3DVertexShader7 != null && this.anIDirect3DPixelShader1 != null && this.aClass242_7.method5532();
		} else {
			this.anIDirect3DVertexShader7 = null;
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean633 = false;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		@Pc(6) Interface11 local6 = this.aClass7_Sub1_23.method5693();
		if (!this.aBoolean633 || local6 == null) {
			return;
		}
		@Pc(22) IDirect3DDevice local22 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
		local22.SetVertexShader(this.anIDirect3DVertexShader7);
		local22.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass7_Sub1_23.method5746(1);
		this.aClass7_Sub1_23.method5694(local6);
		this.aClass7_Sub1_23.method5746(0);
		this.aClass7_Sub1_23.method5694(this.aClass242_7.anInterface23_1);
		this.aBoolean634 = true;
		this.method8023();
		this.method8025();
		this.method8020();
		this.method8031();
		local22.a(1, -this.aClass7_Sub1_23.aFloatArray54[0], -this.aClass7_Sub1_23.aFloatArray54[1], -this.aClass7_Sub1_23.aFloatArray54[2], 0.0F);
		local22.a(2, this.aClass7_Sub1_23.aFloat173, this.aClass7_Sub1_23.aFloat178, this.aClass7_Sub1_23.aFloat176, 1.0F);
		local22.a(3, Math.abs(this.aClass7_Sub1_23.aFloatArray54[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean634) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg1 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg0 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local7.b(14, (float) (this.aClass7_Sub1_23.anInt7377 * local13 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local7.b(15, local24, 0.0F, 0.0F, 0.0F);
		local7.a(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.a(5, local37, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)V")
	@Override
	public void method8025() {
		if (this.aBoolean634) {
			@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class81_Sub1 local12 = this.aClass7_Sub1_23.method5759();
			local7.SetVertexShaderConstantF(12, local12.method1957(Static498.aFloatArray66), 2);
		}
	}

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return this.aBoolean633;
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (!this.aBoolean634) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
		if (this.aClass7_Sub1_23.anInt7354 <= 0) {
			local7.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) float local24 = this.aClass7_Sub1_23.aFloat177;
			@Pc(28) float local28 = this.aClass7_Sub1_23.aFloat175;
			local7.b(16, local24, 1.0F / (local24 - local28), 0.0F, 0.0F);
		}
		local7.a(0, (float) (this.aClass7_Sub1_23.anInt7362 >> 16 & 0xFF) / 255.0F, (float) (this.aClass7_Sub1_23.anInt7362 >> 8 & 0xFF) / 255.0F, (float) (this.aClass7_Sub1_23.anInt7362 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	@Override
	public void method8020() {
		if (this.aBoolean634) {
			@Pc(11) IDirect3DDevice local11 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
			local11.a(8, this.aClass7_Sub1_23.method5755(Static498.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "(I)V")
	@Override
	public void method8032() {
		if (this.aBoolean634) {
			@Pc(13) IDirect3DDevice local13 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(18) Class81_Sub1 local18 = this.aClass7_Sub1_Sub2_7.method5776();
			local13.a(0, local18.method1955(Static498.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	@Override
	public void method8023() {
		if (!this.aBoolean634) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(18) Class81_Sub1 local18 = this.aClass7_Sub1_Sub2_7.method5766();
		@Pc(23) Class81_Sub1 local23 = this.aClass7_Sub1_Sub2_7.method5776();
		local13.a(0, local23.method1955(Static498.aFloatArray66));
		local13.a(4, local18.method1963(Static498.aFloatArray66));
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		if (!this.aBoolean634) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass7_Sub1_Sub2_7.anIDirect3DDevice1;
		local6.SetVertexShader(null);
		local6.SetPixelShader(null);
		this.aClass7_Sub1_23.method5746(1);
		this.aClass7_Sub1_23.method5694(null);
		this.aClass7_Sub1_23.method5746(0);
		this.aClass7_Sub1_23.method5694(null);
		this.aBoolean634 = false;
	}
}
