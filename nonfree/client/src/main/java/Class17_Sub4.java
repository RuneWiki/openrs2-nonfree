import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class17_Sub4 extends Class17 {

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "Lclient!ur;")
	private final Class347 aClass347_4;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "Lclient!bfa;")
	private final Class20_Sub2_Sub1 aClass20_Sub2_Sub1_4;

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!bfa;Lclient!in;Lclient!ur;)V")
	public Class17_Sub4(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class347 arg2) {
		super(arg0);
		this.aClass347_4 = arg2;
		this.aClass20_Sub2_Sub1_4 = arg0;
		if (arg1 != null && this.aClass347_4.method8640() && (this.aClass20_Sub2_Sub1_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass20_Sub2_Sub1_4.anIDirect3DDevice1.b(arg1.method4545("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
		this.aClass20_Sub2_22.method1508(Static361.aClass315_2, Static542.aClass315_5);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass20_Sub2_Sub1_4.anIDirect3DDevice1;
		if (this.aClass347_4.aBoolean711) {
			@Pc(16) float local16 = (float) (this.aClass20_Sub2_22.anInt1564 % 4000) / 4000.0F;
			this.aClass20_Sub2_22.method1484(this.aClass347_4.anInterface13_1);
			local3.a(11, local16, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(42) int local42 = this.aClass20_Sub2_22.anInt1564 % 4000 * 16 / 4000;
			this.aClass20_Sub2_22.method1484(this.aClass347_4.anInterface27Array2[local42]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
	@Override
	public void method8060() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass20_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(11) Class30_Sub2 local11 = this.aClass20_Sub2_Sub1_4.method1582();
			local6.a(0, local11.method4044(Static171.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		this.aClass20_Sub2_Sub1_4.method1330(null);
		this.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
		this.aClass20_Sub2_22.method1483(1, Static360.aClass177_5);
		this.aClass20_Sub2_22.method1483(2, Static165.aClass177_3);
		this.aClass20_Sub2_22.method1486(true);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass20_Sub2_Sub1_4.anIDirect3DDevice1;
			local6.a(4, this.aClass20_Sub2_22.method1469(Static171.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "(I)V")
	@Override
	public void method8069() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass20_Sub2_Sub1_4.anIDirect3DDevice1;
		@Pc(12) Class30_Sub2 local12 = this.aClass20_Sub2_22.method1482();
		local12.method4035(Static171.aFloatArray39);
		Static171.aFloatArray39[0] *= 0.25F;
		Static171.aFloatArray39[2] *= 0.25F;
		Static171.aFloatArray39[3] *= 0.25F;
		Static171.aFloatArray39[6] *= 0.25F;
		Static171.aFloatArray39[5] *= 0.25F;
		Static171.aFloatArray39[1] *= 0.25F;
		Static171.aFloatArray39[7] *= 0.25F;
		Static171.aFloatArray39[4] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static171.aFloatArray39, 2);
	}

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8068() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass20_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(12) Class30_Sub2 local12 = this.aClass20_Sub2_Sub1_4.method1582();
			local7.a(0, local12.method4044(Static171.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
	@Override
	public void method8059() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass20_Sub2_Sub1_4.anIDirect3DDevice1;
		if (this.aClass20_Sub2_22.anInt1541 <= 0) {
			local13.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(30) float local30 = this.aClass20_Sub2_22.aFloat53;
			@Pc(34) float local34 = this.aClass20_Sub2_22.aFloat61;
			@Pc(38) float local38 = local34 - 512.0F;
			local13.a(10, local38, 1.0F / (local34 - local38), local34, 1.0F / (local30 - local34));
		}
		this.aClass20_Sub2_22.method1528(this.aClass20_Sub2_22.anInt1563);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		this.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
		this.aClass20_Sub2_22.method1483(1, Static165.aClass177_3);
		this.aClass20_Sub2_22.method1558(false, 2, Static360.aClass177_5, true);
		this.aClass20_Sub2_22.method1486(false);
		this.aClass20_Sub2_Sub1_4.method1330(this.anIDirect3DVertexShader7);
		this.method8060();
		this.method8069();
		this.method8061();
		this.method8059();
	}
}
