import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class34_Sub8 extends Class34 {

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "Lclient!uk;")
	private final Class331 aClass331_6;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Lclient!tb;")
	private final Class134_Sub1_Sub2 aClass134_Sub1_Sub2_8;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!tb;Lclient!pu;Lclient!uk;)V")
	public Class34_Sub8(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass331_6 = arg2;
		this.aClass134_Sub1_Sub2_8 = arg0;
		if (arg1 != null && this.aClass331_6.method7305() && (this.aClass134_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method5706("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	@Override
	public void method7004() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(15) Class113_Sub3 local15 = this.aClass134_Sub1_Sub2_8.method6786();
			local8.a(0, local15.method6055(Static453.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
	@Override
	public void method7019() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass134_Sub1_21.anInt8430 > 0) {
			@Pc(16) float local16 = this.aClass134_Sub1_21.aFloat187;
			@Pc(20) float local20 = this.aClass134_Sub1_21.aFloat201;
			@Pc(24) float local24 = local20 - 512.0F;
			local8.b(10, local24, 1.0F / (local20 - local24), local20, 1.0F / (local16 - local20));
		} else {
			local8.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass134_Sub1_21.method6738(this.aClass134_Sub1_21.anInt8460);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
		this.aClass134_Sub1_21.method6770(Static116.aClass82_3, Static59.aClass82_2);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
	@Override
	public void method7015() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1;
			local6.a(4, this.aClass134_Sub1_21.method6825(Static453.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
	@Override
	public void method7018() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(12) Class113_Sub3 local12 = this.aClass134_Sub1_21.method6787();
		local12.method6069(Static453.aFloatArray45);
		Static453.aFloatArray45[0] *= 0.25F;
		Static453.aFloatArray45[1] *= 0.25F;
		Static453.aFloatArray45[7] *= 0.25F;
		Static453.aFloatArray45[6] *= 0.25F;
		Static453.aFloatArray45[4] *= 0.25F;
		Static453.aFloatArray45[3] *= 0.25F;
		Static453.aFloatArray45[2] *= 0.25F;
		Static453.aFloatArray45[5] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static453.aFloatArray45, 2);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader2);
		this.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
		this.aClass134_Sub1_21.method6742(1, Static308.aClass192_1);
		this.aClass134_Sub1_21.method6791(false, Static468.aClass192_3, 2, true);
		this.aClass134_Sub1_21.method6781(false);
		this.method7008();
		this.method7018();
		this.method7015();
		this.method7019();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass331_6.aBoolean694) {
			@Pc(20) float local20 = (float) (this.aClass134_Sub1_21.anInt8444 % 4000) / 4000.0F;
			this.aClass134_Sub1_21.method6766(this.aClass331_6.anInterface11_2);
			local7.b(11, local20, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(46) int local46 = this.aClass134_Sub1_21.anInt8444 % 4000 * 16 / 4000;
			this.aClass134_Sub1_21.method6766(this.aClass331_6.anInterface14Array1[local46]);
			local7.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
	@Override
	public void method7008() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(16) Class113_Sub3 local16 = this.aClass134_Sub1_Sub2_8.method6786();
			local11.a(0, local16.method6055(Static453.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return this.anIDirect3DVertexShader2 != null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		this.aClass134_Sub1_Sub2_8.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
		this.aClass134_Sub1_21.method6742(1, Static468.aClass192_3);
		this.aClass134_Sub1_21.method6742(2, Static308.aClass192_1);
		this.aClass134_Sub1_21.method6781(true);
	}
}
