import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "Lclient!ln;")
	private final Class204 aClass204_4;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!hb;")
	private final Class12_Sub2_Sub1 aClass12_Sub2_Sub1_3;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!hb;Lclient!ga;Lclient!ln;)V")
	public Class3_Sub6(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class204 arg2) {
		super(arg0);
		this.aClass204_4 = arg2;
		this.aClass12_Sub2_Sub1_3 = arg0;
		if (arg1 != null && this.aClass12_Sub2_23.aBoolean537 && this.aClass12_Sub2_23.aBoolean544 && (this.aClass12_Sub2_Sub1_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1.a(arg1.method2450("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1.b(arg1.method2450("environment_mapped_water_f", "dx"));
			this.aBoolean385 = this.anIDirect3DVertexShader6 != null && this.anIDirect3DPixelShader1 != null && this.aClass204_4.method4714();
		} else {
			this.anIDirect3DVertexShader6 = null;
			this.aBoolean385 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	@Override
	public void method7526() {
		if (this.aBoolean386) {
			@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
			@Pc(12) Class209_Sub2 local12 = this.aClass12_Sub2_Sub1_3.method6164();
			local7.a(0, local12.method4917(Static272.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	@Override
	public void method7527() {
		if (!this.aBoolean386) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
		@Pc(18) Class209_Sub2 local18 = this.aClass12_Sub2_Sub1_3.method6198();
		@Pc(23) Class209_Sub2 local23 = this.aClass12_Sub2_Sub1_3.method6164();
		local13.a(0, local23.method4917(Static272.aFloatArray39));
		local13.a(4, local18.method4915(Static272.aFloatArray39));
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean386) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local7.b(14, (float) (this.aClass12_Sub2_23.anInt7542 * local13 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local7.b(15, local24, 0.0F, 0.0F, 0.0F);
		local7.a(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.a(5, local37, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		if (!this.aBoolean386) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
		local6.SetVertexShader(null);
		local6.SetPixelShader(null);
		this.aClass12_Sub2_23.method6196(1);
		this.aClass12_Sub2_23.method6159(null);
		this.aClass12_Sub2_23.method6196(0);
		this.aClass12_Sub2_23.method6159(null);
		this.aBoolean386 = false;
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
	@Override
	public void method7536() {
		if (this.aBoolean386) {
			@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
			@Pc(12) Class209_Sub2 local12 = this.aClass12_Sub2_23.method6238();
			local7.SetVertexShaderConstantF(12, local12.method4919(Static272.aFloatArray39), 2);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	@Override
	public void method7530() {
		if (this.aBoolean386) {
			@Pc(10) IDirect3DDevice local10 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
			local10.a(8, this.aClass12_Sub2_23.method6216(Static272.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return this.aBoolean385;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		@Pc(4) Interface12 local4 = this.aClass12_Sub2_23.method6208();
		if (!this.aBoolean385 || local4 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
		local21.SetVertexShader(this.anIDirect3DVertexShader6);
		local21.SetPixelShader(this.anIDirect3DPixelShader1);
		this.aClass12_Sub2_23.method6196(1);
		this.aClass12_Sub2_23.method6159(local4);
		this.aClass12_Sub2_23.method6196(0);
		this.aClass12_Sub2_23.method6159(this.aClass204_4.anInterface4_2);
		this.aBoolean386 = true;
		this.method7527();
		this.method7536();
		this.method7530();
		this.method7525();
		local21.a(1, -this.aClass12_Sub2_23.aFloatArray62[0], -this.aClass12_Sub2_23.aFloatArray62[1], -this.aClass12_Sub2_23.aFloatArray62[2], 0.0F);
		local21.a(2, this.aClass12_Sub2_23.aFloat183, this.aClass12_Sub2_23.aFloat197, this.aClass12_Sub2_23.aFloat195, 1.0F);
		local21.a(3, Math.abs(this.aClass12_Sub2_23.aFloatArray62[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	@Override
	public void method7525() {
		if (!this.aBoolean386) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass12_Sub2_Sub1_3.anIDirect3DDevice1;
		if (this.aClass12_Sub2_23.anInt7552 > 0) {
			@Pc(16) float local16 = this.aClass12_Sub2_23.aFloat186;
			@Pc(20) float local20 = this.aClass12_Sub2_23.aFloat194;
			local7.b(16, local16, 1.0F / (local16 - local20), 0.0F, 0.0F);
		} else {
			local7.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.a(0, (float) (this.aClass12_Sub2_23.anInt7555 >> 16 & 0xFF) / 255.0F, (float) (this.aClass12_Sub2_23.anInt7555 >> 8 & 0xFF) / 255.0F, (float) (this.aClass12_Sub2_23.anInt7555 & 0xFF) / 255.0F, 0.0F);
	}
}
