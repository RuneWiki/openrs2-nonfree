import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class32_Sub6 extends Class32 {

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Z")
	private boolean aBoolean266;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!sga;")
	private final Class132_Sub1_Sub2 aClass132_Sub1_Sub2_6;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Lclient!oca;")
	private final Class247 aClass247_3;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!sga;Lclient!ae;Lclient!oca;)V")
	public Class32_Sub6(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class247 arg2) {
		super(arg0);
		this.aClass132_Sub1_Sub2_6 = arg0;
		this.aClass247_3 = arg2;
		if (arg1 != null && this.aClass132_Sub1_21.aBoolean638 && this.aClass132_Sub1_21.aBoolean640 && (this.aClass132_Sub1_Sub2_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1.a(arg1.method274("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1.b(arg1.method274("dx", "environment_mapped_water_f"));
			this.aBoolean265 = this.anIDirect3DVertexShader6 != null && this.anIDirect3DPixelShader1 != null && this.aClass247_3.method6209();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean265 = false;
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	@Override
	public void method8323() {
		if (!this.aBoolean266) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1;
		if (this.aClass132_Sub1_21.anInt9002 <= 0) {
			local11.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(31) float local31 = this.aClass132_Sub1_21.aFloat165;
			@Pc(35) float local35 = this.aClass132_Sub1_21.aFloat166;
			local11.a(16, local31, 1.0F / (local31 - local35), 0.0F, 0.0F);
		}
		local11.b(0, (float) (this.aClass132_Sub1_21.anInt8984 >> 16 & 0xFF) / 255.0F, (float) (this.aClass132_Sub1_21.anInt8984 >> 8 & 0xFF) / 255.0F, (float) (this.aClass132_Sub1_21.anInt8984 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	@Override
	public void method8321() {
		if (this.aBoolean266) {
			@Pc(6) IDirect3DDevice local6 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(11) Class207_Sub3 local11 = this.aClass132_Sub1_21.method7643();
			local6.SetVertexShaderConstantF(12, local11.method8217(Static235.aFloatArray12), 2);
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	@Override
	public void method8320() {
		if (this.aBoolean266) {
			@Pc(6) IDirect3DDevice local6 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(11) Class207_Sub3 local11 = this.aClass132_Sub1_Sub2_6.method7566();
			local6.a(0, local11.method8230(Static235.aFloatArray12));
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	@Override
	public void method8317() {
		if (!this.aBoolean266) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(18) Class207_Sub3 local18 = this.aClass132_Sub1_Sub2_6.method7542();
		@Pc(23) Class207_Sub3 local23 = this.aClass132_Sub1_Sub2_6.method7566();
		local13.a(0, local23.method8230(Static235.aFloatArray12));
		local13.a(4, local18.method8233(Static235.aFloatArray12));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		@Pc(11) Interface9 local11 = this.aClass132_Sub1_21.method7630();
		if (!this.aBoolean265 || local11 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1;
		this.aClass132_Sub1_Sub2_6.method7656(this.anIDirect3DVertexShader6);
		this.aClass132_Sub1_Sub2_6.method7664(this.anIDirect3DPixelShader1);
		this.aClass132_Sub1_21.method7616(1);
		this.aClass132_Sub1_21.method7635(local11);
		this.aClass132_Sub1_21.method7616(0);
		this.aClass132_Sub1_21.method7635(this.aClass247_3.anInterface1_2);
		this.aBoolean266 = true;
		this.method8317();
		this.method8321();
		this.method8319();
		this.method8323();
		local21.b(1, -this.aClass132_Sub1_21.aFloatArray63[0], -this.aClass132_Sub1_21.aFloatArray63[1], -this.aClass132_Sub1_21.aFloatArray63[2], 0.0F);
		local21.b(2, this.aClass132_Sub1_21.aFloat168, this.aClass132_Sub1_21.aFloat171, this.aClass132_Sub1_21.aFloat179, 1.0F);
		local21.b(3, Math.abs(this.aClass132_Sub1_21.aFloatArray63[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method8319() {
		if (this.aBoolean266) {
			@Pc(11) IDirect3DDevice local11 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1;
			local11.a(8, this.aClass132_Sub1_21.method7596(Static235.aFloatArray12));
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean266) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass132_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local7.a(14, (float) (local13 * this.aClass132_Sub1_21.anInt9000 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local7.a(15, local24, 0.0F, 0.0F, 0.0F);
		local7.b(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.b(5, local37, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		if (!this.aBoolean266) {
			return;
		}
		this.aClass132_Sub1_Sub2_6.method7656((IDirect3DVertexShader) null);
		this.aClass132_Sub1_Sub2_6.method7664((IDirect3DPixelShader) null);
		this.aClass132_Sub1_21.method7616(1);
		this.aClass132_Sub1_21.method7635((Interface17) null);
		this.aClass132_Sub1_21.method7616(0);
		this.aClass132_Sub1_21.method7635((Interface17) null);
		this.aBoolean266 = false;
	}
}
