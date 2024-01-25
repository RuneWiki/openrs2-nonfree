import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class108_Sub4 extends Class108 {

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!mh;")
	private final Class126_Sub2_Sub2 aClass126_Sub2_Sub2_5;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!wda;")
	private final Class373 aClass373_1;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!mh;Lclient!wu;Lclient!wda;)V")
	public Class108_Sub4(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class373 arg2) {
		super(arg0);
		this.aClass126_Sub2_Sub2_5 = arg0;
		this.aClass373_1 = arg2;
		if (arg1 != null && this.aClass373_1.method8675() && (this.aClass126_Sub2_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass126_Sub2_Sub2_5.anIDirect3DDevice1.b(arg1.method8871("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	@Override
	public void method8711() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass126_Sub2_Sub2_5.anIDirect3DDevice1;
			local10.a(4, this.aClass126_Sub2_23.method5447(Static255.aFloatArray12));
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass126_Sub2_Sub2_5.anIDirect3DDevice1;
			@Pc(19) Class117_Sub2 local19 = this.aClass126_Sub2_Sub2_5.method5539();
			local14.a(0, local19.method3879(Static255.aFloatArray12));
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	@Override
	public void method8704() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass126_Sub2_Sub2_5.anIDirect3DDevice1;
		if (this.aClass126_Sub2_23.anInt6255 > 0) {
			@Pc(16) float local16 = this.aClass126_Sub2_23.aFloat123;
			@Pc(20) float local20 = this.aClass126_Sub2_23.aFloat120;
			@Pc(24) float local24 = local20 - 512.0F;
			local7.b(10, local24, 1.0F / (local20 - local24), local20, 1.0F / (local16 - local20));
		} else {
			local7.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass126_Sub2_23.method5496(this.aClass126_Sub2_23.anInt6277);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
		this.aClass126_Sub2_23.method5475(Static140.aClass10_3, Static646.aClass10_5);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass126_Sub2_Sub2_5.anIDirect3DDevice1;
		if (this.aClass373_1.aBoolean823) {
			@Pc(16) float local16 = (float) (this.aClass126_Sub2_23.anInt6264 % 4000) / 4000.0F;
			this.aClass126_Sub2_23.method5449(this.aClass373_1.anInterface19_2);
			local3.b(11, local16, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(42) int local42 = this.aClass126_Sub2_23.anInt6264 % 4000 * 16 / 4000;
			this.aClass126_Sub2_23.method5449(this.aClass373_1.anInterface25Array1[local42]);
			local3.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	@Override
	public void method8698() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass126_Sub2_Sub2_5.anIDirect3DDevice1;
		@Pc(12) Class117_Sub2 local12 = this.aClass126_Sub2_23.method5499();
		local12.method3862(Static255.aFloatArray12);
		Static255.aFloatArray12[5] *= 0.25F;
		Static255.aFloatArray12[0] *= 0.25F;
		Static255.aFloatArray12[3] *= 0.25F;
		Static255.aFloatArray12[1] *= 0.25F;
		Static255.aFloatArray12[6] *= 0.25F;
		Static255.aFloatArray12[7] *= 0.25F;
		Static255.aFloatArray12[4] *= 0.25F;
		Static255.aFloatArray12[2] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static255.aFloatArray12, 2);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		this.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
		this.aClass126_Sub2_23.method5466(1, Static645.aClass294_5);
		this.aClass126_Sub2_23.method5537(2, Static18.aClass294_1, true, false);
		this.aClass126_Sub2_23.method5534(false);
		this.aClass126_Sub2_Sub2_5.method5575(this.anIDirect3DVertexShader6);
		this.method8703();
		this.method8698();
		this.method8711();
		this.method8704();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		this.aClass126_Sub2_Sub2_5.method5575((IDirect3DVertexShader) null);
		this.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
		this.aClass126_Sub2_23.method5466(1, Static18.aClass294_1);
		this.aClass126_Sub2_23.method5466(2, Static645.aClass294_5);
		this.aClass126_Sub2_23.method5534(true);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	@Override
	public void method8705() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass126_Sub2_Sub2_5.anIDirect3DDevice1;
			@Pc(16) Class117_Sub2 local16 = this.aClass126_Sub2_Sub2_5.method5539();
			local11.a(0, local16.method3879(Static255.aFloatArray12));
		}
	}
}
