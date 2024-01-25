import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class19_Sub6 extends Class19 {

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "Z")
	private boolean aBoolean443;

	@OriginalMember(owner = "client!lca", name = "w", descriptor = "Lclient!ep;")
	private final Class96 aClass96_3;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "Lclient!kfa;")
	private final Class82_Sub3_Sub2 aClass82_Sub3_Sub2_3;

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!lca", name = "u", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!kfa;Lclient!uu;Lclient!ep;)V")
	public Class19_Sub6(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class96 arg2) {
		super(arg0);
		this.aClass96_3 = arg2;
		this.aClass82_Sub3_Sub2_3 = arg0;
		if (arg1 != null && this.aClass82_Sub3_23.aBoolean412 && this.aClass82_Sub3_23.aBoolean406 && (this.aClass82_Sub3_Sub2_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1.a(arg1.method8142("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1.b(arg1.method8142("environment_mapped_water_f", "dx"));
			this.aBoolean444 = this.anIDirect3DVertexShader2 != null && this.anIDirect3DPixelShader1 != null && this.aClass96_3.method2364();
		} else {
			this.anIDirect3DVertexShader2 = null;
			this.aBoolean444 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		if (!this.aBoolean443) {
			return;
		}
		this.aClass82_Sub3_Sub2_3.method5050((IDirect3DVertexShader) null);
		this.aClass82_Sub3_Sub2_3.method5046((IDirect3DPixelShader) null);
		this.aClass82_Sub3_23.method4946(1);
		this.aClass82_Sub3_23.method4972((Interface10) null);
		this.aClass82_Sub3_23.method4946(0);
		this.aClass82_Sub3_23.method4972((Interface10) null);
		this.aBoolean443 = false;
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(Z)V")
	@Override
	public void method8279() {
		if (this.aBoolean443) {
			@Pc(7) IDirect3DDevice local7 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1;
			@Pc(12) Class31_Sub2 local12 = this.aClass82_Sub3_Sub2_3.method4924();
			local7.a(0, local12.method7679(Static315.aFloatArray67));
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	@Override
	public void method8272() {
		if (this.aBoolean443) {
			@Pc(14) IDirect3DDevice local14 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1;
			local14.a(8, this.aClass82_Sub3_23.method4905(Static315.aFloatArray67));
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean443) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1;
		@Pc(19) int local19 = 0x1 << (arg1 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg0 & 0xFFFF;
		@Pc(43) float local43 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local13.a(14, (float) (this.aClass82_Sub3_23.anInt5838 * local19 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local13.a(15, local30, 0.0F, 0.0F, 0.0F);
		local13.b(4, (float) local34, 0.0F, 0.0F, 0.0F);
		local13.b(5, local43, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "(Z)V")
	@Override
	public void method8284() {
		if (!this.aBoolean443) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1;
		if (this.aClass82_Sub3_23.anInt5844 > 0) {
			@Pc(18) float local18 = this.aClass82_Sub3_23.aFloat122;
			@Pc(22) float local22 = this.aClass82_Sub3_23.aFloat132;
			local7.a(16, local18, 1.0F / (local18 - local22), 0.0F, 0.0F);
		} else {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass82_Sub3_23.anInt5843 >> 16 & 0xFF) / 255.0F, (float) (this.aClass82_Sub3_23.anInt5843 >> 8 & 0xFF) / 255.0F, (float) (this.aClass82_Sub3_23.anInt5843 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return this.aBoolean444;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	@Override
	public void method8278() {
		if (!this.aBoolean443) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1;
		@Pc(12) Class31_Sub2 local12 = this.aClass82_Sub3_Sub2_3.method4971();
		@Pc(17) Class31_Sub2 local17 = this.aClass82_Sub3_Sub2_3.method4924();
		local7.a(0, local17.method7679(Static315.aFloatArray67));
		local7.a(4, local12.method7662(Static315.aFloatArray67));
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	@Override
	public void method8288() {
		if (this.aBoolean443) {
			@Pc(12) IDirect3DDevice local12 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1;
			@Pc(17) Class31_Sub2 local17 = this.aClass82_Sub3_23.method4981();
			local12.SetVertexShaderConstantF(12, local17.method7675(Static315.aFloatArray67), 2);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		@Pc(4) Interface18 local4 = this.aClass82_Sub3_23.method4952();
		if (!this.aBoolean444 || local4 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass82_Sub3_Sub2_3.anIDirect3DDevice1;
		this.aClass82_Sub3_Sub2_3.method5050(this.anIDirect3DVertexShader2);
		this.aClass82_Sub3_Sub2_3.method5046(this.anIDirect3DPixelShader1);
		this.aClass82_Sub3_23.method4946(1);
		this.aClass82_Sub3_23.method4972(local4);
		this.aClass82_Sub3_23.method4946(0);
		this.aClass82_Sub3_23.method4972(this.aClass96_3.anInterface20_2);
		this.aBoolean443 = true;
		this.method8278();
		this.method8288();
		this.method8272();
		this.method8284();
		local15.b(1, -this.aClass82_Sub3_23.aFloatArray54[0], -this.aClass82_Sub3_23.aFloatArray54[1], -this.aClass82_Sub3_23.aFloatArray54[2], 0.0F);
		local15.b(2, this.aClass82_Sub3_23.aFloat137, this.aClass82_Sub3_23.aFloat135, this.aClass82_Sub3_23.aFloat124, 1.0F);
		local15.b(3, Math.abs(this.aClass82_Sub3_23.aFloatArray54[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}
}
