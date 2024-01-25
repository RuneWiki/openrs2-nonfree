import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!st;")
	private final Class315 aClass315_2;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!ega;")
	private final Class78_Sub1_Sub1 aClass78_Sub1_Sub1_1;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!ega;Lclient!sea;Lclient!st;)V")
	public Class2_Sub2(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class315 arg2) {
		super(arg0);
		this.aClass315_2 = arg2;
		this.aClass78_Sub1_Sub1_1 = arg0;
		if (arg1 != null && this.aClass315_2.method6724() && (this.aClass78_Sub1_Sub1_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1.b(arg1.method6557("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1;
		if (this.aClass315_2.aBoolean619) {
			@Pc(24) float local24 = (float) (this.aClass78_Sub1_23.anInt8564 % 4000) / 4000.0F;
			this.aClass78_Sub1_23.method6931(this.aClass315_2.anInterface21_2);
			local3.a(11, local24, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(50) int local50 = this.aClass78_Sub1_23.anInt8564 % 4000 * 16 / 4000;
			this.aClass78_Sub1_23.method6931(this.aClass315_2.anInterface5Array1[local50]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	@Override
	public void method7896() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1;
			local11.a(4, this.aClass78_Sub1_23.method6930(Static26.aFloatArray7));
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	@Override
	public void method7891() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1;
		if (this.aClass78_Sub1_23.anInt8565 > 0) {
			@Pc(23) float local23 = this.aClass78_Sub1_23.aFloat217;
			@Pc(27) float local27 = this.aClass78_Sub1_23.aFloat223;
			@Pc(31) float local31 = local27 - 512.0F;
			local15.a(10, local31, 1.0F / (local27 - local31), local27, 1.0F / (local23 - local27));
		} else {
			local15.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass78_Sub1_23.method6917(this.aClass78_Sub1_23.anInt8566);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	@Override
	public void method7900() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(20) Class34_Sub1 local20 = this.aClass78_Sub1_Sub1_1.method6987();
			local15.a(0, local20.method888(Static26.aFloatArray7));
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	@Override
	public void method7890() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1;
		@Pc(20) Class34_Sub1 local20 = this.aClass78_Sub1_23.method6893();
		local20.method887(Static26.aFloatArray7);
		Static26.aFloatArray7[3] *= 0.25F;
		Static26.aFloatArray7[1] *= 0.25F;
		Static26.aFloatArray7[2] *= 0.25F;
		Static26.aFloatArray7[7] *= 0.25F;
		Static26.aFloatArray7[0] *= 0.25F;
		Static26.aFloatArray7[6] *= 0.25F;
		Static26.aFloatArray7[4] *= 0.25F;
		Static26.aFloatArray7[5] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static26.aFloatArray7, 2);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	@Override
	public void method7898() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(12) Class34_Sub1 local12 = this.aClass78_Sub1_Sub1_1.method6987();
			local7.a(0, local12.method888(Static26.aFloatArray7));
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
		this.aClass78_Sub1_23.method6975(Static276.aClass148_4, 1);
		this.aClass78_Sub1_23.method6959(true, 2, false, Static155.aClass148_2);
		this.aClass78_Sub1_23.method6982(false);
		this.method7898();
		this.method7890();
		this.method7896();
		this.method7891();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
		this.aClass78_Sub1_23.method6864(Static585.aClass118_5, Static327.aClass118_2);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		this.aClass78_Sub1_Sub1_1.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
		this.aClass78_Sub1_23.method6975(Static155.aClass148_2, 1);
		this.aClass78_Sub1_23.method6975(Static276.aClass148_4, 2);
		this.aClass78_Sub1_23.method6982(true);
	}
}
