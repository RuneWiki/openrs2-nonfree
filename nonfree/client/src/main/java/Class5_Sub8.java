import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Lclient!hda;")
	private final Class144_Sub1_Sub1 aClass144_Sub1_Sub1_6;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "Lclient!lj;")
	private final Class223 aClass223_6;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!hda;Lclient!rg;Lclient!lj;)V")
	public Class5_Sub8(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class223 arg2) {
		super(arg0);
		this.aClass144_Sub1_Sub1_6 = arg0;
		this.aClass223_6 = arg2;
		if (arg1 != null && this.aClass223_6.method5331() && (this.aClass144_Sub1_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass144_Sub1_Sub1_6.anIDirect3DDevice1.a(arg1.method7801("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass144_Sub1_Sub1_6.anIDirect3DDevice1;
		if (this.aClass223_6.aBoolean423) {
			@Pc(44) float local44 = (float) (this.aClass144_Sub1_20.anInt6502 % 4000) / 4000.0F;
			this.aClass144_Sub1_20.method5643(this.aClass223_6.anInterface18_1);
			local3.b(11, local44, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(17) int local17 = this.aClass144_Sub1_20.anInt6502 % 4000 * 16 / 4000;
			this.aClass144_Sub1_20.method5643(this.aClass223_6.anInterface9Array2[local17]);
			local3.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)V")
	@Override
	public void method6872() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(18) IDirect3DDevice local18 = this.aClass144_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(23) Class263_Sub2 local23 = this.aClass144_Sub1_20.method5737();
		local23.method7281(Static442.aFloatArray59);
		Static442.aFloatArray59[5] *= 0.25F;
		Static442.aFloatArray59[7] *= 0.25F;
		Static442.aFloatArray59[0] *= 0.25F;
		Static442.aFloatArray59[1] *= 0.25F;
		Static442.aFloatArray59[4] *= 0.25F;
		Static442.aFloatArray59[6] *= 0.25F;
		Static442.aFloatArray59[2] *= 0.25F;
		Static442.aFloatArray59[3] *= 0.25F;
		local18.SetVertexShaderConstantF(8, Static442.aFloatArray59, 2);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		this.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
		this.aClass144_Sub1_20.method5740(Static216.aClass138_5, 1);
		this.aClass144_Sub1_20.method5775(2, Static627.aClass138_6, false, true);
		this.aClass144_Sub1_20.method5666(false);
		this.aClass144_Sub1_Sub1_6.method3735(this.anIDirect3DVertexShader7);
		this.method6869();
		this.method6872();
		this.method6876();
		this.method6868();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method6869() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass144_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(14) Class263_Sub2 local14 = this.aClass144_Sub1_Sub1_6.method5765();
			local9.a(0, local14.method7298(Static442.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
	@Override
	public void method6875() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass144_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(24) Class263_Sub2 local24 = this.aClass144_Sub1_Sub1_6.method5765();
			local17.a(0, local24.method7298(Static442.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
		this.aClass144_Sub1_20.method5653(Static408.aClass287_3, Static448.aClass287_4);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		this.aClass144_Sub1_Sub1_6.method3735((IDirect3DVertexShader) null);
		this.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
		this.aClass144_Sub1_20.method5740(Static627.aClass138_6, 1);
		this.aClass144_Sub1_20.method5740(Static216.aClass138_5, 2);
		this.aClass144_Sub1_20.method5666(true);
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	@Override
	public void method6876() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass144_Sub1_Sub1_6.anIDirect3DDevice1;
			local7.a(4, this.aClass144_Sub1_20.method5668(Static442.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public void method6868() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass144_Sub1_Sub1_6.anIDirect3DDevice1;
		if (this.aClass144_Sub1_20.anInt6499 > 0) {
			@Pc(23) float local23 = this.aClass144_Sub1_20.aFloat99;
			@Pc(27) float local27 = this.aClass144_Sub1_20.aFloat94;
			@Pc(31) float local31 = local27 - 512.0F;
			local12.b(10, local31, 1.0F / (local27 - local31), local27, 1.0F / (local23 - local27));
		} else {
			local12.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass144_Sub1_20.method5655(this.aClass144_Sub1_20.anInt6507);
	}
}
