import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class29_Sub8 extends Class29 {

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Lclient!ad;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_6;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "Lclient!ur;")
	private final Class345 aClass345_4;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!ad;Lclient!la;Lclient!ur;)V")
	public Class29_Sub8(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class345 arg2) {
		super(arg0);
		this.aClass5_Sub1_Sub1_6 = arg0;
		this.aClass345_4 = arg2;
		if (arg1 != null && this.aClass5_Sub1_22.aBoolean469 && this.aClass5_Sub1_22.aBoolean465 && (this.aClass5_Sub1_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method5093("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1.a(arg1.method5093("dx", "environment_mapped_water_f"));
			this.aBoolean421 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass345_4.method8242();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean421 = false;
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	@Override
	public void method8082() {
		if (this.aBoolean420) {
			@Pc(14) IDirect3DDevice local14 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(19) Class39_Sub1 local19 = this.aClass5_Sub1_Sub1_6.method5594();
			local14.a(0, local19.method1559(Static316.aFloatArray40));
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	@Override
	public void method8078() {
		if (this.aBoolean420) {
			@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1;
			local6.a(8, this.aClass5_Sub1_22.method5627(Static316.aFloatArray40));
		}
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V")
	@Override
	public void method8084() {
		if (!this.aBoolean420) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1;
		if (this.aClass5_Sub1_22.anInt6539 > 0) {
			@Pc(17) float local17 = this.aClass5_Sub1_22.aFloat139;
			@Pc(21) float local21 = this.aClass5_Sub1_22.aFloat145;
			local6.a(16, local17, 1.0F / (local17 - local21), 0.0F, 0.0F);
		} else {
			local6.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local6.b(0, (float) (this.aClass5_Sub1_22.anInt6521 >> 16 & 0xFF) / 255.0F, (float) (this.aClass5_Sub1_22.anInt6521 >> 8 & 0xFF) / 255.0F, (float) (this.aClass5_Sub1_22.anInt6521 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return this.aBoolean421;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	@Override
	public void method8077() {
		if (this.aBoolean420) {
			@Pc(14) IDirect3DDevice local14 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(19) Class39_Sub1 local19 = this.aClass5_Sub1_22.method5661();
			local14.SetVertexShaderConstantF(12, local19.method1563(Static316.aFloatArray40), 2);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		if (!this.aBoolean420) {
			return;
		}
		this.aClass5_Sub1_Sub1_6.method658(null);
		this.aClass5_Sub1_Sub1_6.method654(null);
		this.aClass5_Sub1_22.method5571(1);
		this.aClass5_Sub1_22.method5609(null);
		this.aClass5_Sub1_22.method5571(0);
		this.aClass5_Sub1_22.method5609(null);
		this.aBoolean420 = false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	@Override
	public void method8079() {
		if (!this.aBoolean420) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(12) Class39_Sub1 local12 = this.aClass5_Sub1_Sub1_6.method5646();
		@Pc(17) Class39_Sub1 local17 = this.aClass5_Sub1_Sub1_6.method5594();
		local7.a(0, local17.method1559(Static316.aFloatArray40));
		local7.a(4, local12.method1557(Static316.aFloatArray40));
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		@Pc(11) Interface3 local11 = this.aClass5_Sub1_22.method5681();
		if (!this.aBoolean421 || local11 == null) {
			return;
		}
		@Pc(22) IDirect3DDevice local22 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1;
		this.aClass5_Sub1_Sub1_6.method658(this.anIDirect3DVertexShader8);
		this.aClass5_Sub1_Sub1_6.method654(this.anIDirect3DPixelShader1);
		this.aClass5_Sub1_22.method5571(1);
		this.aClass5_Sub1_22.method5609(local11);
		this.aClass5_Sub1_22.method5571(0);
		this.aClass5_Sub1_22.method5609(this.aClass345_4.anInterface12_1);
		this.aBoolean420 = true;
		this.method8079();
		this.method8077();
		this.method8078();
		this.method8084();
		local22.b(1, -this.aClass5_Sub1_22.aFloatArray50[0], -this.aClass5_Sub1_22.aFloatArray50[1], -this.aClass5_Sub1_22.aFloatArray50[2], 0.0F);
		local22.b(2, this.aClass5_Sub1_22.aFloat136, this.aClass5_Sub1_22.aFloat142, this.aClass5_Sub1_22.aFloat140, 1.0F);
		local22.b(3, Math.abs(this.aClass5_Sub1_22.aFloatArray50[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean420) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass5_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(18) int local18 = 0x1 << (arg1 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg0 & 0xFFFF;
		local12.a(14, (float) (this.aClass5_Sub1_22.anInt6524 * local18 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(59) float local59 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local12.a(15, local29, 0.0F, 0.0F, 0.0F);
		local12.b(4, (float) local33, 0.0F, 0.0F, 0.0F);
		local12.b(5, local59, 0.0F, 0.0F, 0.0F);
	}
}
