import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "Lclient!jo;")
	private final Class174 aClass174_1;

	@OriginalMember(owner = "client!afa", name = "q", descriptor = "Lclient!rd;")
	private final Class95_Sub3_Sub1 aClass95_Sub3_Sub1_1;

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!rd;Lclient!wu;Lclient!jo;)V")
	public Class7_Sub1(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class174 arg2) {
		super(arg0);
		this.aClass174_1 = arg2;
		this.aClass95_Sub3_Sub1_1 = arg0;
		if (arg1 != null && this.aClass174_1.method3797() && (this.aClass95_Sub3_Sub1_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass95_Sub3_Sub1_1.anIDirect3DDevice1.b(arg1.method8628("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		this.aClass95_Sub3_Sub1_1.method6738(null);
		this.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
		this.aClass95_Sub3_23.method7139(1, Static113.aClass291_2);
		this.aClass95_Sub3_23.method7139(2, Static185.aClass291_3);
		this.aClass95_Sub3_23.method7057(true);
	}

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "(B)V")
	@Override
	public void method8134() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass95_Sub3_Sub1_1.anIDirect3DDevice1;
			@Pc(11) Class177_Sub1 local11 = this.aClass95_Sub3_Sub1_1.method7113();
			local6.a(0, local11.method3839(Static9.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
		this.aClass95_Sub3_23.method7023(Static248.aClass136_4, Static504.aClass136_8);
	}

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)V")
	@Override
	public void method8133() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass95_Sub3_Sub1_1.anIDirect3DDevice1;
			@Pc(20) Class177_Sub1 local20 = this.aClass95_Sub3_Sub1_1.method7113();
			local15.a(0, local20.method3839(Static9.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V")
	@Override
	public void method8131() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass95_Sub3_Sub1_1.anIDirect3DDevice1;
		@Pc(20) Class177_Sub1 local20 = this.aClass95_Sub3_23.method7053();
		local20.method3826(Static9.aFloatArray2);
		Static9.aFloatArray2[6] *= 0.25F;
		Static9.aFloatArray2[3] *= 0.25F;
		Static9.aFloatArray2[2] *= 0.25F;
		Static9.aFloatArray2[1] *= 0.25F;
		Static9.aFloatArray2[5] *= 0.25F;
		Static9.aFloatArray2[7] *= 0.25F;
		Static9.aFloatArray2[0] *= 0.25F;
		Static9.aFloatArray2[4] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static9.aFloatArray2, 2);
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(B)V")
	@Override
	public void method8129() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass95_Sub3_Sub1_1.anIDirect3DDevice1;
			local8.a(4, this.aClass95_Sub3_23.method7038(Static9.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(B)V")
	@Override
	public void method8130() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass95_Sub3_Sub1_1.anIDirect3DDevice1;
		if (this.aClass95_Sub3_23.anInt8382 > 0) {
			@Pc(22) float local22 = this.aClass95_Sub3_23.aFloat179;
			@Pc(26) float local26 = this.aClass95_Sub3_23.aFloat175;
			@Pc(30) float local30 = local26 - 512.0F;
			local11.b(10, local30, 1.0F / (local26 - local30), local26, 1.0F / (local22 - local26));
		} else {
			local11.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass95_Sub3_23.method7079(this.aClass95_Sub3_23.anInt8359);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		this.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
		this.aClass95_Sub3_23.method7139(1, Static185.aClass291_3);
		this.aClass95_Sub3_23.method7028(2, false, Static113.aClass291_2, true);
		this.aClass95_Sub3_23.method7057(false);
		this.aClass95_Sub3_Sub1_1.method6738(this.anIDirect3DVertexShader1);
		this.method8134();
		this.method8131();
		this.method8129();
		this.method8130();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) IDirect3DDevice local8 = this.aClass95_Sub3_Sub1_1.anIDirect3DDevice1;
		if (this.aClass174_1.aBoolean302) {
			@Pc(49) float local49 = (float) (this.aClass95_Sub3_23.anInt8347 % 4000) / 4000.0F;
			this.aClass95_Sub3_23.method7112(this.aClass174_1.anInterface5_2);
			local8.b(11, local49, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(22) int local22 = this.aClass95_Sub3_23.anInt8347 % 4000 * 16 / 4000;
			this.aClass95_Sub3_23.method7112(this.aClass174_1.anInterface19Array2[local22]);
			local8.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}
}
