import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class27_Sub11 extends Class27 {

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Z")
	private boolean aBoolean749;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!hb;")
	private final Class133_Sub1_Sub1 aClass133_Sub1_Sub1_9;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!no;")
	private final Class250 aClass250_8;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
	private final boolean aBoolean750;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!hb;Lclient!la;Lclient!no;)V")
	public Class27_Sub11(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class250 arg2) {
		super(arg0);
		this.aClass133_Sub1_Sub1_9 = arg0;
		this.aClass250_8 = arg2;
		if (arg1 != null && this.aClass133_Sub1_23.aBoolean478 && this.aClass133_Sub1_23.aBoolean477 && (this.aClass133_Sub1_Sub1_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1.b(arg1.method4695("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1.a(arg1.method4695("environment_mapped_water_f", "dx"));
			this.aBoolean750 = this.anIDirect3DVertexShader8 != null && this.anIDirect3DPixelShader1 != null && this.aClass250_8.method5557();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.anIDirect3DVertexShader8 = null;
			this.aBoolean750 = false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	@Override
	public void method8899() {
		if (!this.aBoolean749) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(18) Class113_Sub1 local18 = this.aClass133_Sub1_Sub1_9.method6267();
		@Pc(23) Class113_Sub1 local23 = this.aClass133_Sub1_Sub1_9.method6262();
		local13.a(0, local23.method2473(Static629.aFloatArray79));
		local13.a(4, local18.method2468(Static629.aFloatArray79));
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	@Override
	public void method8902() {
		if (this.aBoolean749) {
			@Pc(13) IDirect3DDevice local13 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(18) Class113_Sub1 local18 = this.aClass133_Sub1_23.method6180();
			local13.SetVertexShaderConstantF(12, local18.method2478(Static629.aFloatArray79), 2);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		@Pc(6) Interface18 local6 = this.aClass133_Sub1_23.method6256();
		if (!this.aBoolean750 || local6 == null) {
			return;
		}
		@Pc(17) IDirect3DDevice local17 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1;
		this.aClass133_Sub1_Sub1_9.method3490(this.anIDirect3DVertexShader8);
		this.aClass133_Sub1_Sub1_9.method3489(this.anIDirect3DPixelShader1);
		this.aClass133_Sub1_23.method6271(1);
		this.aClass133_Sub1_23.method6153(local6);
		this.aClass133_Sub1_23.method6271(0);
		this.aClass133_Sub1_23.method6153(this.aClass250_8.anInterface23_1);
		this.aBoolean749 = true;
		this.method8899();
		this.method8902();
		this.method8900();
		this.method8893();
		local17.b(1, -this.aClass133_Sub1_23.aFloatArray57[0], -this.aClass133_Sub1_23.aFloatArray57[1], -this.aClass133_Sub1_23.aFloatArray57[2], 0.0F);
		local17.b(2, this.aClass133_Sub1_23.aFloat126, this.aClass133_Sub1_23.aFloat119, this.aClass133_Sub1_23.aFloat132, 1.0F);
		local17.b(3, Math.abs(this.aClass133_Sub1_23.aFloatArray57[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	@Override
	public void method8900() {
		if (this.aBoolean749) {
			@Pc(7) IDirect3DDevice local7 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1;
			local7.a(8, this.aClass133_Sub1_23.method6220(Static629.aFloatArray79));
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return this.aBoolean750;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	public void method8893() {
		if (!this.aBoolean749) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1;
		if (this.aClass133_Sub1_23.anInt7003 <= 0) {
			local7.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass133_Sub1_23.aFloat130;
			@Pc(31) float local31 = this.aClass133_Sub1_23.aFloat125;
			local7.a(16, local27, 1.0F / (local27 - local31), 0.0F, 0.0F);
		}
		local7.b(0, (float) (this.aClass133_Sub1_23.anInt6997 >> 16 & 0xFF) / 255.0F, (float) (this.aClass133_Sub1_23.anInt6997 >> 8 & 0xFF) / 255.0F, (float) (this.aClass133_Sub1_23.anInt6997 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V")
	@Override
	public void method8903() {
		if (this.aBoolean749) {
			@Pc(12) IDirect3DDevice local12 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(17) Class113_Sub1 local17 = this.aClass133_Sub1_Sub1_9.method6262();
			local12.a(0, local17.method2473(Static629.aFloatArray79));
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		if (!this.aBoolean749) {
			return;
		}
		this.aClass133_Sub1_Sub1_9.method3490(null);
		this.aClass133_Sub1_Sub1_9.method3489(null);
		this.aClass133_Sub1_23.method6271(1);
		this.aClass133_Sub1_23.method6153(null);
		this.aClass133_Sub1_23.method6271(0);
		this.aClass133_Sub1_23.method6153(null);
		this.aBoolean749 = false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean749) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass133_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(17) int local17 = 0x1 << (arg0 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg1 & 0xFFFF;
		local11.a(14, (float) (local17 * this.aClass133_Sub1_23.anInt7009 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(58) float local58 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local11.a(15, local28, 0.0F, 0.0F, 0.0F);
		local11.b(4, (float) local32, 0.0F, 0.0F, 0.0F);
		local11.b(5, local58, 0.0F, 0.0F, 0.0F);
	}
}
