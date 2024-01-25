import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "Lclient!ik;")
	private final Class162_Sub1_Sub1 aClass162_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "Lclient!gb;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!ik;Lclient!mv;Lclient!gb;)V")
	public Class34_Sub1(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class120 arg2) {
		super(arg0);
		this.aClass162_Sub1_Sub1_1 = arg0;
		this.aClass120_1 = arg2;
		if (arg1 != null && this.aClass120_1.method2152() && (this.aClass162_Sub1_Sub1_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1.a(arg1.method4953("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method7352() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_Sub1_1.method3857();
			local8.a(0, local13.method2697(Static41.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1;
		if (this.aClass120_1.aBoolean180) {
			@Pc(16) float local16 = (float) (this.aClass162_Sub1_23.anInt4612 % 4000) / 4000.0F;
			this.aClass162_Sub1_23.method3865(this.aClass120_1.anInterface15_1);
			local3.a(11, local16, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(42) int local42 = this.aClass162_Sub1_23.anInt4612 % 4000 * 16 / 4000;
			this.aClass162_Sub1_23.method3865(this.aClass120_1.anInterface11Array1[local42]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
		this.aClass162_Sub1_23.method3867(Static584.aClass247_5, Static449.aClass247_3);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7365() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1;
		if (this.aClass162_Sub1_23.anInt4604 > 0) {
			@Pc(15) float local15 = this.aClass162_Sub1_23.aFloat131;
			@Pc(19) float local19 = this.aClass162_Sub1_23.aFloat145;
			@Pc(23) float local23 = local19 - 512.0F;
			local7.a(10, local23, 1.0F / (local19 - local23), local19, 1.0F / (local15 - local19));
		} else {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass162_Sub1_23.method3891(this.aClass162_Sub1_23.anInt4625);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
		this.aClass162_Sub1_23.method3885(Static491.aClass263_3, 1);
		this.aClass162_Sub1_23.method3885(Static504.aClass263_4, 2);
		this.aClass162_Sub1_23.method3922(true);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
		this.aClass162_Sub1_23.method3885(Static504.aClass263_4, 1);
		this.aClass162_Sub1_23.method3828(false, true, Static491.aClass263_3, 2);
		this.aClass162_Sub1_23.method3922(false);
		this.method7352();
		this.method7364();
		this.method7354();
		this.method7365();
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
	@Override
	public void method7364() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1;
		@Pc(21) Class25_Sub2 local21 = this.aClass162_Sub1_23.method3956();
		local21.method2713(Static41.aFloatArray2);
		Static41.aFloatArray2[7] *= 0.25F;
		Static41.aFloatArray2[6] *= 0.25F;
		Static41.aFloatArray2[1] *= 0.25F;
		Static41.aFloatArray2[3] *= 0.25F;
		Static41.aFloatArray2[2] *= 0.25F;
		Static41.aFloatArray2[0] *= 0.25F;
		Static41.aFloatArray2[4] *= 0.25F;
		Static41.aFloatArray2[5] *= 0.25F;
		local16.SetVertexShaderConstantF(8, Static41.aFloatArray2, 2);
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
	@Override
	public void method7360() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1;
			@Pc(20) Class25_Sub2 local20 = this.aClass162_Sub1_Sub1_1.method3857();
			local15.a(0, local20.method2697(Static41.aFloatArray2));
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	@Override
	public void method7354() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass162_Sub1_Sub1_1.anIDirect3DDevice1;
			local13.a(4, this.aClass162_Sub1_23.method3871(Static41.aFloatArray2));
		}
	}
}
