import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class12_Sub8 extends Class12 {

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!j;")
	private final Class157 aClass157_4;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!hg;")
	private final Class43_Sub1_Sub1 aClass43_Sub1_Sub1_8;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!hg;Lclient!om;Lclient!j;)V")
	public Class12_Sub8(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class157 arg2) {
		super(arg0);
		this.aClass157_4 = arg2;
		this.aClass43_Sub1_Sub1_8 = arg0;
		if (arg1 != null && this.aClass157_4.method3970() && (this.aClass43_Sub1_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method5648("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
		this.aClass43_Sub1_21.method4251(1, Static525.aClass252_4);
		this.aClass43_Sub1_21.method4251(2, Static88.aClass252_2);
		this.aClass43_Sub1_21.method4168(true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
		this.aClass43_Sub1_21.method4253(Static474.aClass37_3, Static581.aClass37_4);
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
	@Override
	public void method6852() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_Sub1_8.method4173();
			local8.a(0, local13.method7108(Static344.aFloatArray48));
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	@Override
	public void method6841() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1;
		if (this.aClass43_Sub1_21.anInt4832 <= 0) {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) float local24 = this.aClass43_Sub1_21.aFloat106;
			@Pc(28) float local28 = this.aClass43_Sub1_21.aFloat94;
			@Pc(32) float local32 = local28 - 512.0F;
			local7.a(10, local32, 1.0F / (local28 - local32), local28, 1.0F / (local24 - local28));
		}
		this.aClass43_Sub1_21.method4266(this.aClass43_Sub1_21.anInt4820);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) IDirect3DDevice local11 = this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1;
		if (this.aClass157_4.aBoolean343) {
			@Pc(52) float local52 = (float) (this.aClass43_Sub1_21.anInt4808 % 4000) / 4000.0F;
			this.aClass43_Sub1_21.method4298(this.aClass157_4.anInterface9_2);
			local11.a(11, local52, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(25) int local25 = this.aClass43_Sub1_21.anInt4808 % 4000 * 16 / 4000;
			this.aClass43_Sub1_21.method4298(this.aClass157_4.anInterface10Array1[local25]);
			local11.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader7);
		this.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
		this.aClass43_Sub1_21.method4251(1, Static88.aClass252_2);
		this.aClass43_Sub1_21.method4268(Static525.aClass252_4, false, true, 2);
		this.aClass43_Sub1_21.method4168(false);
		this.method6852();
		this.method6844();
		this.method6851();
		this.method6841();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	@Override
	public void method6847() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(18) Class109_Sub3 local18 = this.aClass43_Sub1_Sub1_8.method4173();
			local13.a(0, local18.method7108(Static344.aFloatArray48));
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	@Override
	public void method6844() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(20) Class109_Sub3 local20 = this.aClass43_Sub1_21.method4293();
		local20.method7103(Static344.aFloatArray48);
		Static344.aFloatArray48[2] *= 0.25F;
		Static344.aFloatArray48[7] *= 0.25F;
		Static344.aFloatArray48[4] *= 0.25F;
		Static344.aFloatArray48[1] *= 0.25F;
		Static344.aFloatArray48[6] *= 0.25F;
		Static344.aFloatArray48[0] *= 0.25F;
		Static344.aFloatArray48[3] *= 0.25F;
		Static344.aFloatArray48[5] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static344.aFloatArray48, 2);
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V")
	@Override
	public void method6851() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass43_Sub1_Sub1_8.anIDirect3DDevice1;
			local14.a(4, this.aClass43_Sub1_21.method4295(Static344.aFloatArray48));
		}
	}
}
