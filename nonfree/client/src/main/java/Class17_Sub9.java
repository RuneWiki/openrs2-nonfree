import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class17_Sub9 extends Class17 {

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "Lclient!wda;")
	private final Class9_Sub1_Sub2 aClass9_Sub1_Sub2_8;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Lclient!jq;")
	private final Class155 aClass155_5;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!wda;Lclient!kda;Lclient!jq;)V")
	public Class17_Sub9(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class155 arg2) {
		super(arg0);
		this.aClass9_Sub1_Sub2_8 = arg0;
		this.aClass155_5 = arg2;
		if (this.aClass155_5.method4029() && (this.aClass9_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method4222("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6799() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!pb;II)V")
	@Override
	public void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	@Override
	public void method6800() {
		this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass9_Sub1_19.method7678(Static197.aClass122_2, 0);
		this.aClass9_Sub1_19.method7678(Static43.aClass122_1, 1);
		this.aClass9_Sub1_19.method7678(Static349.aClass122_3, 2);
		this.aClass9_Sub1_19.method7654(true);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	@Override
	public void method6804() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1;
			local6.a(4, this.aClass9_Sub1_19.method7764(Static463.aFloatArray68));
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
	@Override
	public void method6801() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(16) Class22_Sub3 local16 = this.aClass9_Sub1_Sub2_8.method7659();
			local11.a(0, local16.method5960(Static463.aFloatArray68));
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6802(@OriginalArg(1) boolean arg0) {
		this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass9_Sub1_19.method7678(Static197.aClass122_2, 0);
		this.aClass9_Sub1_19.method7678(Static349.aClass122_3, 1);
		this.aClass9_Sub1_19.method7692(false, 2, true, Static43.aClass122_1);
		this.aClass9_Sub1_19.method7654(false);
		this.method6798();
		this.method6807();
		this.method6804();
		this.method6806();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	@Override
	public void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) IDirect3DDevice local11 = this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass155_5.aBoolean280) {
			@Pc(52) float local52 = (float) (this.aClass9_Sub1_19.anInt9193 % 4000) / 4000.0F;
			this.aClass9_Sub1_19.method7712(this.aClass155_5.anInterface18_1);
			local11.a(11, local52, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(25) int local25 = this.aClass9_Sub1_19.anInt9193 % 4000 * 16 / 4000;
			this.aClass9_Sub1_19.method7712(this.aClass155_5.anInterface5Array2[local25]);
			local11.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	@Override
	public void method6798() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(21) Class22_Sub3 local21 = this.aClass9_Sub1_Sub2_8.method7659();
			local14.a(0, local21.method5960(Static463.aFloatArray68));
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
	@Override
	public void method6807() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(13) Class22_Sub3 local13 = this.aClass9_Sub1_19.method7680();
		local13.method5963(Static463.aFloatArray68);
		Static463.aFloatArray68[1] *= 0.25F;
		Static463.aFloatArray68[7] *= 0.25F;
		Static463.aFloatArray68[0] *= 0.25F;
		Static463.aFloatArray68[6] *= 0.25F;
		Static463.aFloatArray68[2] *= 0.25F;
		Static463.aFloatArray68[4] *= 0.25F;
		Static463.aFloatArray68[3] *= 0.25F;
		Static463.aFloatArray68[5] *= 0.25F;
		local8.SetVertexShaderConstantF(8, Static463.aFloatArray68, 2);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
	@Override
	public void method6806() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass9_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass9_Sub1_19.anInt9215 <= 0) {
			local14.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(32) float local32 = this.aClass9_Sub1_19.aFloat189;
			@Pc(36) float local36 = this.aClass9_Sub1_19.aFloat184;
			@Pc(40) float local40 = local36 - 512.0F;
			local14.a(10, local40, 1.0F / (local36 - local40), local36, 1.0F / (local32 - local36));
		}
		this.aClass9_Sub1_19.method7768(this.aClass9_Sub1_19.anInt9212);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6805(@OriginalArg(0) boolean arg0) {
		this.aClass9_Sub1_19.method7723(Static361.aClass295_4, Static269.aClass295_3);
	}
}
