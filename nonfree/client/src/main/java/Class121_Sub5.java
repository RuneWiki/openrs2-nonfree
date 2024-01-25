import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class121_Sub5 extends Class121 {

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "Lclient!de;")
	private final Class67_Sub1_Sub1 aClass67_Sub1_Sub1_6;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "Lclient!dma;")
	private final Class76 aClass76_6;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "Z")
	private final boolean aBoolean570;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!de;Lclient!lb;Lclient!dma;)V")
	public Class121_Sub5(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class76 arg2) {
		super(arg0);
		this.aClass67_Sub1_Sub1_6 = arg0;
		this.aClass76_6 = arg2;
		if (arg1 != null && this.aClass67_Sub1_23.aBoolean508 && this.aClass67_Sub1_23.aBoolean505 && (this.aClass67_Sub1_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1.a(arg1.method5076("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method5076("environment_mapped_water_f", "dx"));
			this.aBoolean570 = this.anIDirect3DVertexShader3 != null && this.anIDirect3DPixelShader1 != null && this.aClass76_6.method2073();
		} else {
			this.aBoolean570 = false;
			this.anIDirect3DVertexShader3 = null;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		if (!this.aBoolean569) {
			return;
		}
		this.aClass67_Sub1_Sub1_6.method1925((IDirect3DVertexShader) null);
		this.aClass67_Sub1_Sub1_6.method1930((IDirect3DPixelShader) null);
		this.aClass67_Sub1_23.method5687(1);
		this.aClass67_Sub1_23.method5612((Interface12) null);
		this.aClass67_Sub1_23.method5687(0);
		this.aClass67_Sub1_23.method5612((Interface12) null);
		this.aBoolean569 = false;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	@Override
	public void method9240() {
		if (!this.aBoolean569) {
			return;
		}
		@Pc(17) IDirect3DDevice local17 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1;
		if (this.aClass67_Sub1_23.anInt6676 > 0) {
			@Pc(26) float local26 = this.aClass67_Sub1_23.aFloat124;
			@Pc(30) float local30 = this.aClass67_Sub1_23.aFloat126;
			local17.a(16, local26, 1.0F / (local26 - local30), 0.0F, 0.0F);
		} else {
			local17.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local17.b(0, (float) (this.aClass67_Sub1_23.anInt6669 >> 16 & 0xFF) / 255.0F, (float) (this.aClass67_Sub1_23.anInt6669 >> 8 & 0xFF) / 255.0F, (float) (this.aClass67_Sub1_23.anInt6669 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	@Override
	public void method9237() {
		if (this.aBoolean569) {
			@Pc(16) IDirect3DDevice local16 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(21) Class181_Sub1 local21 = this.aClass67_Sub1_23.method5566();
			local16.SetVertexShaderConstantF(12, local21.method4925(Static409.aFloatArray71), 2);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(B)V")
	@Override
	public void method9243() {
		if (!this.aBoolean569) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(13) Class181_Sub1 local13 = this.aClass67_Sub1_Sub1_6.method5619();
		@Pc(18) Class181_Sub1 local18 = this.aClass67_Sub1_Sub1_6.method5578();
		local8.a(0, local18.method4920(Static409.aFloatArray71));
		local8.a(4, local13.method4928(Static409.aFloatArray71));
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean569) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(21) int local21 = 0x1 << (arg1 & 0x3);
		@Pc(32) float local32 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(36) int local36 = arg0 & 0xFFFF;
		local15.a(14, (float) (local21 * this.aClass67_Sub1_23.anInt6654 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(62) float local62 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local15.a(15, local32, 0.0F, 0.0F, 0.0F);
		local15.b(4, (float) local36, 0.0F, 0.0F, 0.0F);
		local15.b(5, local62, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "(I)V")
	@Override
	public void method9233() {
		if (this.aBoolean569) {
			@Pc(8) IDirect3DDevice local8 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1;
			local8.a(8, this.aClass67_Sub1_23.method5632(Static409.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (this.aBoolean569) {
			@Pc(12) IDirect3DDevice local12 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(17) Class181_Sub1 local17 = this.aClass67_Sub1_Sub1_6.method5578();
			local12.a(0, local17.method4920(Static409.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		@Pc(13) Interface7 local13 = this.aClass67_Sub1_23.method5589();
		if (!this.aBoolean570 || local13 == null) {
			return;
		}
		@Pc(25) IDirect3DDevice local25 = this.aClass67_Sub1_Sub1_6.anIDirect3DDevice1;
		this.aClass67_Sub1_Sub1_6.method1925(this.anIDirect3DVertexShader3);
		this.aClass67_Sub1_Sub1_6.method1930(this.anIDirect3DPixelShader1);
		this.aClass67_Sub1_23.method5687(1);
		this.aClass67_Sub1_23.method5612(local13);
		this.aClass67_Sub1_23.method5687(0);
		this.aClass67_Sub1_23.method5612(this.aClass76_6.anInterface1_2);
		this.aBoolean569 = true;
		this.method9243();
		this.method9237();
		this.method9233();
		this.method9240();
		local25.b(1, -this.aClass67_Sub1_23.aFloatArray57[0], -this.aClass67_Sub1_23.aFloatArray57[1], -this.aClass67_Sub1_23.aFloatArray57[2], 0.0F);
		local25.b(2, this.aClass67_Sub1_23.aFloat125, this.aClass67_Sub1_23.aFloat117, this.aClass67_Sub1_23.aFloat119, 1.0F);
		local25.b(3, Math.abs(this.aClass67_Sub1_23.aFloatArray57[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return this.aBoolean570;
	}
}
