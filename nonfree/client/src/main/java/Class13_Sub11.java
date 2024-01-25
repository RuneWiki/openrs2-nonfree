import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class13_Sub11 extends Class13 {

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "Z")
	private boolean aBoolean713;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Lclient!nc;")
	private final Class242 aClass242_8;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "Lclient!lj;")
	private final Class101_Sub1_Sub2 aClass101_Sub1_Sub2_8;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "Z")
	private final boolean aBoolean714;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!lj;Lclient!gga;Lclient!nc;)V")
	public Class13_Sub11(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass242_8 = arg2;
		this.aClass101_Sub1_Sub2_8 = arg0;
		if (arg1 != null && this.aClass101_Sub1_22.aBoolean487 && this.aClass101_Sub1_22.aBoolean486 && (this.aClass101_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method3639("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1.b(arg1.method3639("environment_mapped_water_f", "dx"));
			this.aBoolean714 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass242_8.method6565();
		} else {
			this.anIDirect3DVertexShader8 = null;
			this.aBoolean714 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		if (!this.aBoolean713) {
			return;
		}
		this.aClass101_Sub1_Sub2_8.method5967((IDirect3DVertexShader) null);
		this.aClass101_Sub1_Sub2_8.method5975((IDirect3DPixelShader) null);
		this.aClass101_Sub1_22.method5862(1);
		this.aClass101_Sub1_22.method5909((Interface5) null);
		this.aClass101_Sub1_22.method5862(0);
		this.aClass101_Sub1_22.method5909((Interface5) null);
		this.aBoolean713 = false;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
	@Override
	public void method8496() {
		if (this.aBoolean713) {
			@Pc(6) IDirect3DDevice local6 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1;
			local6.a(8, this.aClass101_Sub1_22.method5950(Static556.aFloatArray69));
		}
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V")
	@Override
	public void method8499() {
		if (!this.aBoolean713) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass101_Sub1_22.anInt6650 > 0) {
			@Pc(18) float local18 = this.aClass101_Sub1_22.aFloat149;
			@Pc(22) float local22 = this.aClass101_Sub1_22.aFloat158;
			local7.a(16, local18, 1.0F / (local18 - local22), 0.0F, 0.0F);
		} else {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass101_Sub1_22.anInt6649 >> 16 & 0xFF) / 255.0F, (float) (this.aClass101_Sub1_22.anInt6649 >> 8 & 0xFF) / 255.0F, (float) (this.aClass101_Sub1_22.anInt6649 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean713) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(19) int local19 = 0x1 << (arg1 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg0 & 0xFFFF;
		local13.a(14, (float) (local19 * this.aClass101_Sub1_22.anInt6645 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(60) float local60 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local13.a(15, local30, 0.0F, 0.0F, 0.0F);
		local13.b(4, (float) local34, 0.0F, 0.0F, 0.0F);
		local13.b(5, local60, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	@Override
	public void method8487() {
		if (!this.aBoolean713) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(12) Class76_Sub2 local12 = this.aClass101_Sub1_Sub2_8.method5835();
		@Pc(17) Class76_Sub2 local17 = this.aClass101_Sub1_Sub2_8.method5958();
		local7.a(0, local17.method7330(Static556.aFloatArray69));
		local7.a(4, local12.method7344(Static556.aFloatArray69));
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	@Override
	public void method8493() {
		if (this.aBoolean713) {
			@Pc(11) IDirect3DDevice local11 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(16) Class76_Sub2 local16 = this.aClass101_Sub1_22.method5936();
			local11.SetVertexShaderConstantF(12, local16.method7329(Static556.aFloatArray69), 2);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return this.aBoolean714;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		@Pc(4) Interface26 local4 = this.aClass101_Sub1_22.method5960();
		if (!this.aBoolean714 || local4 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1;
		this.aClass101_Sub1_Sub2_8.method5967(this.anIDirect3DVertexShader8);
		this.aClass101_Sub1_Sub2_8.method5975(this.anIDirect3DPixelShader1);
		this.aClass101_Sub1_22.method5862(1);
		this.aClass101_Sub1_22.method5909(local4);
		this.aClass101_Sub1_22.method5862(0);
		this.aClass101_Sub1_22.method5909(this.aClass242_8.anInterface13_1);
		this.aBoolean713 = true;
		this.method8487();
		this.method8493();
		this.method8496();
		this.method8499();
		local13.b(1, -this.aClass101_Sub1_22.aFloatArray47[0], -this.aClass101_Sub1_22.aFloatArray47[1], -this.aClass101_Sub1_22.aFloatArray47[2], 0.0F);
		local13.b(2, this.aClass101_Sub1_22.aFloat157, this.aClass101_Sub1_22.aFloat153, this.aClass101_Sub1_22.aFloat152, 1.0F);
		local13.b(3, Math.abs(this.aClass101_Sub1_22.aFloatArray47[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.aBoolean713) {
			@Pc(15) IDirect3DDevice local15 = this.aClass101_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(20) Class76_Sub2 local20 = this.aClass101_Sub1_Sub2_8.method5958();
			local15.a(0, local20.method7330(Static556.aFloatArray69));
		}
	}
}
