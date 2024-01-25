import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class60_Sub9 extends Class60 {

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "Z")
	private boolean aBoolean669;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "Lclient!aia;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_7;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "Lclient!uw;")
	private final Class367 aClass367_6;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Z")
	private final boolean aBoolean668;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!aia;Lclient!gj;Lclient!uw;)V")
	public Class60_Sub9(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class367 arg2) {
		super(arg0);
		this.aClass16_Sub1_Sub1_7 = arg0;
		this.aClass367_6 = arg2;
		if (arg1 != null && this.aClass16_Sub1_23.aBoolean563 && this.aClass16_Sub1_23.aBoolean558 && (this.aClass16_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method3119("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method3119("dx", "environment_mapped_water_f"));
			this.aBoolean668 = this.anIDirect3DVertexShader7 != null && this.anIDirect3DPixelShader1 != null && this.aClass367_6.method8226();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean668 = false;
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return this.aBoolean668;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean669) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		local6.b(14, (float) (local12 * this.aClass16_Sub1_23.anInt7468 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(53) float local53 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local6.b(15, local23, 0.0F, 0.0F, 0.0F);
		local6.a(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.a(5, local53, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	@Override
	public void method8292() {
		if (this.aBoolean669) {
			@Pc(6) IDirect3DDevice local6 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(11) Class25_Sub3 local11 = this.aClass16_Sub1_23.method6297();
			local6.SetVertexShaderConstantF(12, local11.method4312(Static556.aFloatArray66), 2);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface20 local10 = this.aClass16_Sub1_23.method6208();
		if (!this.aBoolean668 || local10 == null) {
			return;
		}
		@Pc(19) IDirect3DDevice local19 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1;
		this.aClass16_Sub1_Sub1_7.method692(this.anIDirect3DVertexShader7);
		this.aClass16_Sub1_Sub1_7.method687(this.anIDirect3DPixelShader1);
		this.aClass16_Sub1_23.method6234(1);
		this.aClass16_Sub1_23.method6197(local10);
		this.aClass16_Sub1_23.method6234(0);
		this.aClass16_Sub1_23.method6197(this.aClass367_6.anInterface24_2);
		this.aBoolean669 = true;
		this.method8298();
		this.method8292();
		this.method8303();
		this.method8294();
		local19.a(1, -this.aClass16_Sub1_23.aFloatArray57[0], -this.aClass16_Sub1_23.aFloatArray57[1], -this.aClass16_Sub1_23.aFloatArray57[2], 0.0F);
		local19.a(2, this.aClass16_Sub1_23.aFloat161, this.aClass16_Sub1_23.aFloat159, this.aClass16_Sub1_23.aFloat163, 1.0F);
		local19.a(3, Math.abs(this.aClass16_Sub1_23.aFloatArray57[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	@Override
	public void method8294() {
		if (!this.aBoolean669) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass16_Sub1_23.anInt7457 > 0) {
			@Pc(18) float local18 = this.aClass16_Sub1_23.aFloat165;
			@Pc(22) float local22 = this.aClass16_Sub1_23.aFloat162;
			local10.b(16, local18, 1.0F / (local18 - local22), 0.0F, 0.0F);
		} else {
			local10.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local10.a(0, (float) (this.aClass16_Sub1_23.anInt7449 >> 16 & 0xFF) / 255.0F, (float) (this.aClass16_Sub1_23.anInt7449 >> 8 & 0xFF) / 255.0F, (float) (this.aClass16_Sub1_23.anInt7449 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
	@Override
	public void method8298() {
		if (!this.aBoolean669) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(18) Class25_Sub3 local18 = this.aClass16_Sub1_Sub1_7.method6203();
		@Pc(23) Class25_Sub3 local23 = this.aClass16_Sub1_Sub1_7.method6198();
		local13.a(0, local23.method4328(Static556.aFloatArray66));
		local13.a(4, local18.method4316(Static556.aFloatArray66));
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	@Override
	public void method8297() {
		if (this.aBoolean669) {
			@Pc(11) IDirect3DDevice local11 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(16) Class25_Sub3 local16 = this.aClass16_Sub1_Sub1_7.method6198();
			local11.a(0, local16.method4328(Static556.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		if (!this.aBoolean669) {
			return;
		}
		this.aClass16_Sub1_Sub1_7.method692((IDirect3DVertexShader) null);
		this.aClass16_Sub1_Sub1_7.method687((IDirect3DPixelShader) null);
		this.aClass16_Sub1_23.method6234(1);
		this.aClass16_Sub1_23.method6197((Interface3) null);
		this.aClass16_Sub1_23.method6234(0);
		this.aClass16_Sub1_23.method6197((Interface3) null);
		this.aBoolean669 = false;
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V")
	@Override
	public void method8303() {
		if (this.aBoolean669) {
			@Pc(6) IDirect3DDevice local6 = this.aClass16_Sub1_Sub1_7.anIDirect3DDevice1;
			local6.a(8, this.aClass16_Sub1_23.method6213(Static556.aFloatArray66));
		}
	}
}
