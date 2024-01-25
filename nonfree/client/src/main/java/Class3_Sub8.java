import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "Lclient!hb;")
	private final Class12_Sub2_Sub1 aClass12_Sub2_Sub1_4;

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "Lclient!ln;")
	private final Class204 aClass204_6;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!hb;Lclient!ga;Lclient!ln;)V")
	public Class3_Sub8(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class204 arg2) {
		super(arg0);
		this.aClass12_Sub2_Sub1_4 = arg0;
		this.aClass204_6 = arg2;
		if (arg1 != null && this.aClass204_6.method4712() && (this.aClass12_Sub2_Sub1_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1.a(arg1.method2450("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	@Override
	public void method7527() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(18) Class209_Sub2 local18 = this.aClass12_Sub2_Sub1_4.method6164();
			local13.a(0, local18.method4917(Static342.aFloatArray44));
		}
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
		this.aClass12_Sub2_23.method6179(Static328.aClass84_3, 1);
		this.aClass12_Sub2_23.method6179(Static135.aClass84_1, 2);
		this.aClass12_Sub2_23.method6170(true);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1;
		if (this.aClass204_6.aBoolean413) {
			@Pc(16) float local16 = (float) (this.aClass12_Sub2_23.anInt7542 % 4000) / 4000.0F;
			this.aClass12_Sub2_23.method6159(this.aClass204_6.anInterface4_1);
			local3.b(11, local16, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(42) int local42 = this.aClass12_Sub2_23.anInt7542 % 4000 * 16 / 4000;
			this.aClass12_Sub2_23.method6159(this.aClass204_6.anInterface8Array2[local42]);
			local3.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "(I)V")
	@Override
	public void method7536() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1;
		@Pc(11) Class209_Sub2 local11 = this.aClass12_Sub2_23.method6238();
		local11.method4919(Static342.aFloatArray44);
		Static342.aFloatArray44[5] *= 0.25F;
		Static342.aFloatArray44[6] *= 0.25F;
		Static342.aFloatArray44[4] *= 0.25F;
		Static342.aFloatArray44[0] *= 0.25F;
		Static342.aFloatArray44[3] *= 0.25F;
		Static342.aFloatArray44[2] *= 0.25F;
		Static342.aFloatArray44[1] *= 0.25F;
		Static342.aFloatArray44[7] *= 0.25F;
		local6.SetVertexShaderConstantF(8, Static342.aFloatArray44, 2);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
		this.aClass12_Sub2_23.method6241(Static466.aClass108_4, Static6.aClass108_7);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader7);
		this.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
		this.aClass12_Sub2_23.method6179(Static135.aClass84_1, 1);
		this.aClass12_Sub2_23.method6280(2, Static328.aClass84_3, true, false);
		this.aClass12_Sub2_23.method6170(false);
		this.method7526();
		this.method7536();
		this.method7530();
		this.method7525();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Z)V")
	@Override
	public void method7530() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1;
			local8.a(4, this.aClass12_Sub2_23.method6216(Static342.aFloatArray44));
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	@Override
	public void method7525() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1;
		if (this.aClass12_Sub2_23.anInt7552 > 0) {
			@Pc(14) float local14 = this.aClass12_Sub2_23.aFloat186;
			@Pc(18) float local18 = this.aClass12_Sub2_23.aFloat194;
			@Pc(22) float local22 = local18 - 512.0F;
			local6.b(10, local22, 1.0F / (local18 - local22), local18, 1.0F / (local14 - local18));
		} else {
			local6.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass12_Sub2_23.method6259(this.aClass12_Sub2_23.anInt7555);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	@Override
	public void method7526() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass12_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(17) Class209_Sub2 local17 = this.aClass12_Sub2_Sub1_4.method6164();
			local12.a(0, local17.method4917(Static342.aFloatArray44));
		}
	}
}
