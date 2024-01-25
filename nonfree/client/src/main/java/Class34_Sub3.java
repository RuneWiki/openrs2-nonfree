import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!gba", name = "r", descriptor = "Lclient!ik;")
	private final Class162_Sub1_Sub1 aClass162_Sub1_Sub1_3;

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "Lclient!gb;")
	private final Class120 aClass120_2;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!ik;Lclient!mv;Lclient!gb;)V")
	public Class34_Sub3(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class120 arg2) {
		super(arg0);
		this.aClass162_Sub1_Sub1_3 = arg0;
		this.aClass120_2 = arg2;
		if (arg1 != null && this.aClass162_Sub1_23.aBoolean341 && this.aClass162_Sub1_23.aBoolean349 && (this.aClass162_Sub1_Sub1_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1.a(arg1.method4953("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1.b(arg1.method4953("dx", "environment_mapped_water_f"));
			this.aBoolean182 = this.anIDirect3DVertexShader2 != null && this.anIDirect3DPixelShader1 != null && this.aClass120_2.method2153();
		} else {
			this.anIDirect3DVertexShader2 = null;
			this.aBoolean182 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "(I)V")
	@Override
	public void method7364() {
		if (this.aBoolean181) {
			@Pc(7) IDirect3DDevice local7 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
			@Pc(12) Class25_Sub2 local12 = this.aClass162_Sub1_23.method3956();
			local7.SetVertexShaderConstantF(12, local12.method2713(Static163.aFloatArray12), 2);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean181) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local12.a(14, (float) (local18 * this.aClass162_Sub1_23.anInt4612 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local12.a(15, local29, 0.0F, 0.0F, 0.0F);
		local12.b(4, (float) local33, 0.0F, 0.0F, 0.0F);
		local12.b(5, local42, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	@Override
	public void method7352() {
		if (this.aBoolean181) {
			@Pc(6) IDirect3DDevice local6 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
			@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_Sub1_3.method3857();
			local6.a(0, local13.method2697(Static163.aFloatArray12));
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return this.aBoolean182;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	@Override
	public void method7354() {
		if (this.aBoolean181) {
			@Pc(12) IDirect3DDevice local12 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
			local12.a(8, this.aClass162_Sub1_23.method3871(Static163.aFloatArray12));
		}
	}

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "(I)V")
	@Override
	public void method7360() {
		if (!this.aBoolean181) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
		@Pc(12) Class25_Sub2 local12 = this.aClass162_Sub1_Sub1_3.method3841();
		@Pc(17) Class25_Sub2 local17 = this.aClass162_Sub1_Sub1_3.method3857();
		local7.a(0, local17.method2697(Static163.aFloatArray12));
		local7.a(4, local12.method2715(Static163.aFloatArray12));
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		@Pc(11) Interface3 local11 = this.aClass162_Sub1_23.method3842();
		if (!this.aBoolean182 || local11 == null) {
			return;
		}
		@Pc(22) IDirect3DDevice local22 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
		local22.SetVertexShader(this.anIDirect3DVertexShader2);
		local22.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass162_Sub1_23.method3926(1);
		this.aClass162_Sub1_23.method3865(local11);
		this.aClass162_Sub1_23.method3926(0);
		this.aClass162_Sub1_23.method3865(this.aClass120_2.anInterface15_2);
		this.aBoolean181 = true;
		this.method7360();
		this.method7364();
		this.method7354();
		this.method7365();
		local22.b(1, -this.aClass162_Sub1_23.aFloatArray39[0], -this.aClass162_Sub1_23.aFloatArray39[1], -this.aClass162_Sub1_23.aFloatArray39[2], 0.0F);
		local22.b(2, this.aClass162_Sub1_23.aFloat143, this.aClass162_Sub1_23.aFloat139, this.aClass162_Sub1_23.aFloat138, 1.0F);
		local22.b(3, Math.abs(this.aClass162_Sub1_23.aFloatArray39[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		if (!this.aBoolean181) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
		local13.SetVertexShader(null);
		local13.SetPixelShader(null);
		this.aClass162_Sub1_23.method3926(1);
		this.aClass162_Sub1_23.method3865(null);
		this.aClass162_Sub1_23.method3926(0);
		this.aClass162_Sub1_23.method3865(null);
		this.aBoolean181 = false;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
	@Override
	public void method7365() {
		if (!this.aBoolean181) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass162_Sub1_Sub1_3.anIDirect3DDevice1;
		if (this.aClass162_Sub1_23.anInt4604 > 0) {
			@Pc(16) float local16 = this.aClass162_Sub1_23.aFloat131;
			@Pc(20) float local20 = this.aClass162_Sub1_23.aFloat145;
			local7.a(16, local16, 1.0F / (local16 - local20), 0.0F, 0.0F);
		} else {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass162_Sub1_23.anInt4625 >> 16 & 0xFF) / 255.0F, (float) (this.aClass162_Sub1_23.anInt4625 >> 8 & 0xFF) / 255.0F, (float) (this.aClass162_Sub1_23.anInt4625 & 0xFF) / 255.0F, 0.0F);
	}
}
