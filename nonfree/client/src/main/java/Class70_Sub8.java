import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class70_Sub8 extends Class70 {

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "Lclient!de;")
	private final Class62_Sub1_Sub1 aClass62_Sub1_Sub1_7;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "Lclient!om;")
	private final Class222 aClass222_6;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!de;Lclient!gp;Lclient!om;)V")
	public Class70_Sub8(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class222 arg2) {
		super(arg0);
		this.aClass62_Sub1_Sub1_7 = arg0;
		this.aClass222_6 = arg2;
		if (this.aClass222_6.method5524() && (this.aClass62_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method2980("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
	@Override
	public void method7307() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(18) Class78_Sub1 local18 = this.aClass62_Sub1_20.method4764();
		local18.method2194(Static406.aFloatArray64);
		Static406.aFloatArray64[3] *= 0.25F;
		Static406.aFloatArray64[2] *= 0.25F;
		Static406.aFloatArray64[4] *= 0.25F;
		Static406.aFloatArray64[7] *= 0.25F;
		Static406.aFloatArray64[1] *= 0.25F;
		Static406.aFloatArray64[5] *= 0.25F;
		Static406.aFloatArray64[0] *= 0.25F;
		Static406.aFloatArray64[6] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static406.aFloatArray64, 2);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
		this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass62_Sub1_20.method4715(Static24.aClass63_4, 0);
		this.aClass62_Sub1_20.method4715(Static44.aClass63_2, 1);
		this.aClass62_Sub1_20.method4715(Static429.aClass63_6, 2);
		this.aClass62_Sub1_20.method4773(true);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	@Override
	public void method7308() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_Sub1_7.method4783();
			local8.a(0, local13.method2179(Static406.aFloatArray64));
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
		this.aClass62_Sub1_20.method4685(Static395.aClass98_5, Static344.aClass98_4);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
		this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass62_Sub1_20.method4715(Static24.aClass63_4, 0);
		this.aClass62_Sub1_20.method4715(Static429.aClass63_6, 1);
		this.aClass62_Sub1_20.method4732(true, false, Static44.aClass63_2, 2);
		this.aClass62_Sub1_20.method4773(false);
		this.method7312();
		this.method7307();
		this.method7304();
		this.method7299();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass222_6.aBoolean476) {
			@Pc(48) float local48 = (float) (this.aClass62_Sub1_20.anInt5698 % 4000) / 4000.0F;
			this.aClass62_Sub1_20.method4676(this.aClass222_6.anInterface17_1);
			local3.a(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass62_Sub1_20.anInt5698 % 4000 * 16 / 4000;
			this.aClass62_Sub1_20.method4676(this.aClass222_6.anInterface3Array2[local21]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	@Override
	public void method7299() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass62_Sub1_20.anInt5689 > 0) {
			@Pc(15) float local15 = this.aClass62_Sub1_20.aFloat226;
			@Pc(19) float local19 = this.aClass62_Sub1_20.aFloat231;
			@Pc(23) float local23 = local19 - 512.0F;
			local6.a(10, local23, 1.0F / (local19 - local23), local19, 1.0F / (local15 - local19));
		} else {
			local6.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass62_Sub1_20.method4671(this.aClass62_Sub1_20.anInt5673);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	@Override
	public void method7304() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1;
			local14.a(4, this.aClass62_Sub1_20.method4701(Static406.aFloatArray64));
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)V")
	@Override
	public void method7312() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass62_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(12) Class78_Sub1 local12 = this.aClass62_Sub1_Sub1_7.method4783();
			local7.a(0, local12.method2179(Static406.aFloatArray64));
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return this.anIDirect3DVertexShader6 != null;
	}
}
