import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Z")
	private boolean aBoolean588;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Lclient!gaa;")
	private final Class123 aClass123_5;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!uda;")
	private final Class95_Sub1_Sub2 aClass95_Sub1_Sub2_8;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Z")
	private final boolean aBoolean589;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!uda;Lclient!uq;Lclient!gaa;)V")
	public Class4_Sub9(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class123 arg2) {
		super(arg0);
		this.aClass123_5 = arg2;
		this.aClass95_Sub1_Sub2_8 = arg0;
		if (arg1 != null && this.aClass95_Sub1_23.aBoolean697 && this.aClass95_Sub1_23.aBoolean693 && (this.aClass95_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1.b(arg1.method8369("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method8369("environment_mapped_water_f", "dx"));
			this.aBoolean589 = this.anIDirect3DVertexShader7 != null && this.anIDirect3DPixelShader1 != null && this.aClass123_5.method2907();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean589 = false;
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	@Override
	public void method8489() {
		if (this.aBoolean588) {
			@Pc(15) IDirect3DDevice local15 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(20) Class17_Sub2 local20 = this.aClass95_Sub1_Sub2_8.method8081();
			local15.a(0, local20.method5854(Static549.aFloatArray46));
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean588) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		local6.a(14, (float) (local12 * this.aClass95_Sub1_23.anInt10064 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(53) float local53 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local6.a(15, local23, 0.0F, 0.0F, 0.0F);
		local6.b(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.b(5, local53, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	@Override
	public void method8485() {
		if (this.aBoolean588) {
			@Pc(6) IDirect3DDevice local6 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(13) Class17_Sub2 local13 = this.aClass95_Sub1_23.method8102();
			local6.SetVertexShaderConstantF(12, local13.method5852(Static549.aFloatArray46), 2);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface7 local8 = this.aClass95_Sub1_23.method8120();
		if (!this.aBoolean589 || local8 == null) {
			return;
		}
		@Pc(19) IDirect3DDevice local19 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1;
		this.aClass95_Sub1_Sub2_8.method8217(this.anIDirect3DVertexShader7);
		this.aClass95_Sub1_Sub2_8.method8222(this.anIDirect3DPixelShader1);
		this.aClass95_Sub1_23.method8153(1);
		this.aClass95_Sub1_23.method8147(local8);
		this.aClass95_Sub1_23.method8153(0);
		this.aClass95_Sub1_23.method8147(this.aClass123_5.anInterface20_2);
		this.aBoolean588 = true;
		this.method8480();
		this.method8485();
		this.method8492();
		this.method8486();
		local19.b(1, -this.aClass95_Sub1_23.aFloatArray64[0], -this.aClass95_Sub1_23.aFloatArray64[1], -this.aClass95_Sub1_23.aFloatArray64[2], 0.0F);
		local19.b(2, this.aClass95_Sub1_23.aFloat193, this.aClass95_Sub1_23.aFloat200, this.aClass95_Sub1_23.aFloat192, 1.0F);
		local19.b(3, Math.abs(this.aClass95_Sub1_23.aFloatArray64[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		if (!this.aBoolean588) {
			return;
		}
		this.aClass95_Sub1_Sub2_8.method8217((IDirect3DVertexShader) null);
		this.aClass95_Sub1_Sub2_8.method8222((IDirect3DPixelShader) null);
		this.aClass95_Sub1_23.method8153(1);
		this.aClass95_Sub1_23.method8147((Interface1) null);
		this.aClass95_Sub1_23.method8153(0);
		this.aClass95_Sub1_23.method8147((Interface1) null);
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.aBoolean588) {
			@Pc(15) IDirect3DDevice local15 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1;
			local15.a(8, this.aClass95_Sub1_23.method8193(Static549.aFloatArray46));
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	@Override
	public void method8480() {
		if (!this.aBoolean588) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(15) Class17_Sub2 local15 = this.aClass95_Sub1_Sub2_8.method8124();
		@Pc(20) Class17_Sub2 local20 = this.aClass95_Sub1_Sub2_8.method8081();
		local10.a(0, local20.method5854(Static549.aFloatArray46));
		local10.a(4, local15.method5851(Static549.aFloatArray46));
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	@Override
	public void method8486() {
		if (!this.aBoolean588) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub1_Sub2_8.anIDirect3DDevice1;
		if (this.aClass95_Sub1_23.anInt10049 > 0) {
			@Pc(16) float local16 = this.aClass95_Sub1_23.aFloat189;
			@Pc(20) float local20 = this.aClass95_Sub1_23.aFloat195;
			local7.a(16, local16, 1.0F / (local16 - local20), 0.0F, 0.0F);
		} else {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass95_Sub1_23.anInt10029 >> 16 & 0xFF) / 255.0F, (float) (this.aClass95_Sub1_23.anInt10029 >> 8 & 0xFF) / 255.0F, (float) (this.aClass95_Sub1_23.anInt10029 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return this.aBoolean589;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
	}
}
