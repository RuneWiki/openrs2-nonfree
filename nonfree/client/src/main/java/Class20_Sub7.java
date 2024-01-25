import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class20_Sub7 extends Class20 {

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "Lclient!rfa;")
	private final Class312 aClass312_3;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "Lclient!us;")
	private final Class33_Sub2_Sub2 aClass33_Sub2_Sub2_3;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "Z")
	private final boolean aBoolean316;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!us;Lclient!bt;Lclient!rfa;)V")
	public Class20_Sub7(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class312 arg2) {
		super(arg0);
		this.aClass312_3 = arg2;
		this.aClass33_Sub2_Sub2_3 = arg0;
		if (arg1 != null && this.aClass33_Sub2_21.aBoolean738 && this.aClass33_Sub2_21.aBoolean750 && (this.aClass33_Sub2_Sub2_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1.a(arg1.method1238("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1.b(arg1.method1238("dx", "environment_mapped_water_f"));
			this.aBoolean316 = this.anIDirect3DVertexShader1 != null && this.anIDirect3DPixelShader1 != null && this.aClass312_3.method6976();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader1 = null;
			this.aBoolean316 = false;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	@Override
	public void method7956() {
		if (!this.aBoolean315) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1;
		if (this.aClass33_Sub2_21.anInt9645 > 0) {
			@Pc(21) float local21 = this.aClass33_Sub2_21.aFloat213;
			@Pc(25) float local25 = this.aClass33_Sub2_21.aFloat216;
			local13.b(16, local21, 1.0F / (local21 - local25), 0.0F, 0.0F);
		} else {
			local13.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local13.a(0, (float) (this.aClass33_Sub2_21.anInt9674 >> 16 & 0xFF) / 255.0F, (float) (this.aClass33_Sub2_21.anInt9674 >> 8 & 0xFF) / 255.0F, (float) (this.aClass33_Sub2_21.anInt9674 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	@Override
	public void method7962() {
		if (this.aBoolean315) {
			@Pc(6) IDirect3DDevice local6 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1;
			@Pc(11) Class92_Sub1 local11 = this.aClass33_Sub2_21.method8256();
			local6.SetVertexShaderConstantF(12, local11.method2303(Static262.aFloatArray22), 2);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
	@Override
	public void method7959() {
		if (!this.aBoolean315) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1;
		@Pc(17) Class92_Sub1 local17 = this.aClass33_Sub2_Sub2_3.method8274();
		@Pc(22) Class92_Sub1 local22 = this.aClass33_Sub2_Sub2_3.method8216();
		local12.a(0, local22.method2313(Static262.aFloatArray22));
		local12.a(4, local17.method2297(Static262.aFloatArray22));
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return this.aBoolean316;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean315) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1;
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local10.b(14, (float) (local16 * this.aClass33_Sub2_21.anInt9643 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local10.b(15, local27, 0.0F, 0.0F, 0.0F);
		local10.a(4, (float) local31, 0.0F, 0.0F, 0.0F);
		local10.a(5, local40, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V")
	@Override
	public void method7964() {
		if (this.aBoolean315) {
			@Pc(10) IDirect3DDevice local10 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1;
			local10.a(8, this.aClass33_Sub2_21.method8270(Static262.aFloatArray22));
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	@Override
	public void method7958() {
		if (this.aBoolean315) {
			@Pc(15) IDirect3DDevice local15 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1;
			@Pc(20) Class92_Sub1 local20 = this.aClass33_Sub2_Sub2_3.method8216();
			local15.a(0, local20.method2313(Static262.aFloatArray22));
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		if (!this.aBoolean315) {
			return;
		}
		this.aClass33_Sub2_Sub2_3.method8300((IDirect3DVertexShader) null);
		this.aClass33_Sub2_Sub2_3.method8292((IDirect3DPixelShader) null);
		this.aClass33_Sub2_21.method8235(1);
		this.aClass33_Sub2_21.method8159((Interface14) null);
		this.aClass33_Sub2_21.method8235(0);
		this.aClass33_Sub2_21.method8159((Interface14) null);
		this.aBoolean315 = false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		@Pc(4) Interface17 local4 = this.aClass33_Sub2_21.method8215();
		if (!this.aBoolean316 || local4 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass33_Sub2_Sub2_3.anIDirect3DDevice1;
		this.aClass33_Sub2_Sub2_3.method8300(this.anIDirect3DVertexShader1);
		this.aClass33_Sub2_Sub2_3.method8292(this.anIDirect3DPixelShader1);
		this.aClass33_Sub2_21.method8235(1);
		this.aClass33_Sub2_21.method8159(local4);
		this.aClass33_Sub2_21.method8235(0);
		this.aClass33_Sub2_21.method8159(this.aClass312_3.anInterface7_1);
		this.aBoolean315 = true;
		this.method7959();
		this.method7962();
		this.method7964();
		this.method7956();
		local21.a(1, -this.aClass33_Sub2_21.aFloatArray71[0], -this.aClass33_Sub2_21.aFloatArray71[1], -this.aClass33_Sub2_21.aFloatArray71[2], 0.0F);
		local21.a(2, this.aClass33_Sub2_21.aFloat215, this.aClass33_Sub2_21.aFloat224, this.aClass33_Sub2_21.aFloat218, 1.0F);
		local21.a(3, Math.abs(this.aClass33_Sub2_21.aFloatArray71[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}
}
