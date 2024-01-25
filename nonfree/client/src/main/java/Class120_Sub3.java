import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class120_Sub3 extends Class120 {

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "Lclient!ki;")
	private final Class164 aClass164_4;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "Lclient!rca;")
	private final Class5_Sub3_Sub2 aClass5_Sub3_Sub2_5;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!rca;Lclient!kea;Lclient!ki;)V")
	public Class120_Sub3(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class164 arg2) {
		super(arg0);
		this.aClass164_4 = arg2;
		this.aClass5_Sub3_Sub2_5 = arg0;
		if (this.aClass164_4.method4287() && (this.aClass5_Sub3_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1.a(arg1.method4238("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	@Override
	public void method7325() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1;
		@Pc(19) Class205_Sub1 local19 = this.aClass5_Sub3_20.method6359();
		local19.method5236(Static189.aFloatArray33);
		Static189.aFloatArray33[6] *= 0.25F;
		Static189.aFloatArray33[1] *= 0.25F;
		Static189.aFloatArray33[2] *= 0.25F;
		Static189.aFloatArray33[5] *= 0.25F;
		Static189.aFloatArray33[3] *= 0.25F;
		Static189.aFloatArray33[0] *= 0.25F;
		Static189.aFloatArray33[4] *= 0.25F;
		Static189.aFloatArray33[7] *= 0.25F;
		local14.SetVertexShaderConstantF(8, Static189.aFloatArray33, 2);
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
	@Override
	public void method7323() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1;
			@Pc(19) Class205_Sub1 local19 = this.aClass5_Sub3_Sub2_5.method6357();
			local14.a(0, local19.method5221(Static189.aFloatArray33));
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	@Override
	public void method7319() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1;
			local7.a(4, this.aClass5_Sub3_20.method6385(Static189.aFloatArray33));
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass5_Sub3_20.method6415(Static213.aClass166_3, 0);
		this.aClass5_Sub3_20.method6415(Static144.aClass166_2, 1);
		this.aClass5_Sub3_20.method6358(false, 2, Static501.aClass166_4, true);
		this.aClass5_Sub3_20.method6335(false);
		this.method7327();
		this.method7325();
		this.method7319();
		this.method7321();
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass5_Sub3_20.method6415(Static213.aClass166_3, 0);
		this.aClass5_Sub3_20.method6415(Static501.aClass166_4, 1);
		this.aClass5_Sub3_20.method6415(Static144.aClass166_2, 2);
		this.aClass5_Sub3_20.method6335(true);
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
	@Override
	public void method7327() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1;
			@Pc(17) Class205_Sub1 local17 = this.aClass5_Sub3_Sub2_5.method6357();
			local12.a(0, local17.method5221(Static189.aFloatArray33));
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
	@Override
	public void method7321() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1;
		if (this.aClass5_Sub3_20.anInt7764 > 0) {
			@Pc(16) float local16 = this.aClass5_Sub3_20.aFloat217;
			@Pc(20) float local20 = this.aClass5_Sub3_20.aFloat230;
			@Pc(24) float local24 = local20 - 512.0F;
			local8.a(10, local24, 1.0F / (local20 - local24), local20, 1.0F / (local16 - local20));
		} else {
			local8.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass5_Sub3_20.method6363(this.aClass5_Sub3_20.anInt7785);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
		this.aClass5_Sub3_20.method6320(Static500.aClass289_4, Static306.aClass289_2);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub3_Sub2_5.anIDirect3DDevice1;
		if (this.aClass164_4.aBoolean349) {
			@Pc(48) float local48 = (float) (this.aClass5_Sub3_20.anInt7766 % 4000) / 4000.0F;
			this.aClass5_Sub3_20.method6416(this.aClass164_4.anInterface13_1);
			local7.a(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass5_Sub3_20.anInt7766 % 4000 * 16 / 4000;
			this.aClass5_Sub3_20.method6416(this.aClass164_4.anInterface9Array2[local21]);
			local7.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}
}
