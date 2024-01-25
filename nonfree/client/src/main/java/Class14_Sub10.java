import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class14_Sub10 extends Class14 {

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Z")
	private boolean aBoolean741;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Lclient!lo;")
	private final Class224 aClass224_8;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "Lclient!ki;")
	private final Class143_Sub1_Sub1 aClass143_Sub1_Sub1_8;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Z")
	private final boolean aBoolean740;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!ki;Lclient!cb;Lclient!lo;)V")
	public Class14_Sub10(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class224 arg2) {
		super(arg0);
		this.aClass224_8 = arg2;
		this.aClass143_Sub1_Sub1_8 = arg0;
		if (arg1 != null && this.aClass143_Sub1_22.aBoolean534 && this.aClass143_Sub1_22.aBoolean530 && (this.aClass143_Sub1_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1.b(arg1.method892("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1.a(arg1.method892("dx", "environment_mapped_water_f"));
			this.aBoolean740 = this.anIDirect3DVertexShader3 != null && this.anIDirect3DPixelShader1 != null && this.aClass224_8.method5205();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader3 = null;
			this.aBoolean740 = false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface1 local10 = this.aClass143_Sub1_22.method6280();
		if (!this.aBoolean740 || local10 == null) {
			return;
		}
		@Pc(21) IDirect3DDevice local21 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1;
		this.aClass143_Sub1_Sub1_8.method4610(this.anIDirect3DVertexShader3);
		this.aClass143_Sub1_Sub1_8.method4608(this.anIDirect3DPixelShader1);
		this.aClass143_Sub1_22.method6374(1);
		this.aClass143_Sub1_22.method6338(local10);
		this.aClass143_Sub1_22.method6374(0);
		this.aClass143_Sub1_22.method6338(this.aClass224_8.anInterface21_2);
		this.aBoolean741 = true;
		this.method8622();
		this.method8616();
		this.method8621();
		this.method8618();
		local21.a(1, -this.aClass143_Sub1_22.aFloatArray55[0], -this.aClass143_Sub1_22.aFloatArray55[1], -this.aClass143_Sub1_22.aFloatArray55[2], 0.0F);
		local21.a(2, this.aClass143_Sub1_22.aFloat141, this.aClass143_Sub1_22.aFloat129, this.aClass143_Sub1_22.aFloat143, 1.0F);
		local21.a(3, Math.abs(this.aClass143_Sub1_22.aFloatArray55[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return this.aBoolean740;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)V")
	@Override
	public void method8621() {
		if (this.aBoolean741) {
			@Pc(10) IDirect3DDevice local10 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1;
			local10.a(8, this.aClass143_Sub1_22.method6394(Static641.aFloatArray78));
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	@Override
	public void method8618() {
		if (!this.aBoolean741) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1;
		if (this.aClass143_Sub1_22.anInt7407 <= 0) {
			local7.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) float local24 = this.aClass143_Sub1_22.aFloat134;
			@Pc(28) float local28 = this.aClass143_Sub1_22.aFloat130;
			local7.b(16, local24, 1.0F / (local24 - local28), 0.0F, 0.0F);
		}
		local7.a(0, (float) (this.aClass143_Sub1_22.anInt7399 >> 16 & 0xFF) / 255.0F, (float) (this.aClass143_Sub1_22.anInt7399 >> 8 & 0xFF) / 255.0F, (float) (this.aClass143_Sub1_22.anInt7399 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		if (!this.aBoolean741) {
			return;
		}
		this.aClass143_Sub1_Sub1_8.method4610((IDirect3DVertexShader) null);
		this.aClass143_Sub1_Sub1_8.method4608((IDirect3DPixelShader) null);
		this.aClass143_Sub1_22.method6374(1);
		this.aClass143_Sub1_22.method6338((Interface4) null);
		this.aClass143_Sub1_22.method6374(0);
		this.aClass143_Sub1_22.method6338((Interface4) null);
		this.aBoolean741 = false;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
	@Override
	public void method8622() {
		if (!this.aBoolean741) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(11) Class56_Sub2 local11 = this.aClass143_Sub1_Sub1_8.method6281();
		@Pc(16) Class56_Sub2 local16 = this.aClass143_Sub1_Sub1_8.method6402();
		local6.a(0, local16.method6822(Static641.aFloatArray78));
		local6.a(4, local11.method6812(Static641.aFloatArray78));
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	@Override
	public void method8614() {
		if (this.aBoolean741) {
			@Pc(7) IDirect3DDevice local7 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(12) Class56_Sub2 local12 = this.aClass143_Sub1_Sub1_8.method6402();
			local7.a(0, local12.method6822(Static641.aFloatArray78));
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean741) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(13) int local13 = 0x1 << (arg1 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg0 & 0xFFFF;
		local7.b(14, (float) (this.aClass143_Sub1_22.anInt7410 * local13 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(54) float local54 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local7.b(15, local24, 0.0F, 0.0F, 0.0F);
		local7.a(4, (float) local28, 0.0F, 0.0F, 0.0F);
		local7.a(5, local54, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	@Override
	public void method8616() {
		if (this.aBoolean741) {
			@Pc(6) IDirect3DDevice local6 = this.aClass143_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(11) Class56_Sub2 local11 = this.aClass143_Sub1_22.method6399();
			local6.SetVertexShaderConstantF(12, local11.method6830(Static641.aFloatArray78), 2);
		}
	}
}
