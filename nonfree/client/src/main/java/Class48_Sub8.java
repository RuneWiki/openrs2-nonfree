import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class48_Sub8 extends Class48 {

	@OriginalMember(owner = "client!os", name = "q", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "Lclient!b;")
	private final Class24 aClass24_6;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "Lclient!er;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_7;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "Z")
	private final boolean aBoolean480;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!er;Lclient!gda;Lclient!b;)V")
	public Class48_Sub8(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class24 arg2) {
		super(arg0);
		this.aClass24_6 = arg2;
		this.aClass100_Sub1_Sub1_7 = arg0;
		if (arg1 != null && this.aClass100_Sub1_23.aBoolean608 && this.aClass100_Sub1_23.aBoolean606 && (this.aClass100_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method3073("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method3073("environment_mapped_water_f", "dx"));
			this.aBoolean480 = this.anIDirect3DVertexShader3 != null && this.anIDirect3DPixelShader1 != null && this.aClass24_6.method397();
		} else {
			this.anIDirect3DVertexShader3 = null;
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean480 = false;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		@Pc(4) Interface22 local4 = this.aClass100_Sub1_23.method7985();
		if (!this.aBoolean480 || local4 == null) {
			return;
		}
		@Pc(18) IDirect3DDevice local18 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1;
		this.aClass100_Sub1_Sub1_7.method2537(this.anIDirect3DVertexShader3);
		this.aClass100_Sub1_Sub1_7.method2529(this.anIDirect3DPixelShader1);
		this.aClass100_Sub1_23.method7941(1);
		this.aClass100_Sub1_23.method7923(local4);
		this.aClass100_Sub1_23.method7941(0);
		this.aClass100_Sub1_23.method7923(this.aClass24_6.anInterface14_1);
		this.aBoolean481 = true;
		this.method8943();
		this.method8944();
		this.method8936();
		this.method8937();
		local18.b(1, -this.aClass100_Sub1_23.aFloatArray67[0], -this.aClass100_Sub1_23.aFloatArray67[1], -this.aClass100_Sub1_23.aFloatArray67[2], 0.0F);
		local18.b(2, this.aClass100_Sub1_23.aFloat175, this.aClass100_Sub1_23.aFloat179, this.aClass100_Sub1_23.aFloat177, 1.0F);
		local18.b(3, Math.abs(this.aClass100_Sub1_23.aFloatArray67[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	@Override
	public void method8936() {
		if (this.aBoolean481) {
			@Pc(8) IDirect3DDevice local8 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1;
			local8.a(8, this.aClass100_Sub1_23.method7965(Static436.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
	@Override
	public void method8943() {
		if (!this.aBoolean481) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(11) Class10_Sub2 local11 = this.aClass100_Sub1_Sub1_7.method7861();
		@Pc(16) Class10_Sub2 local16 = this.aClass100_Sub1_Sub1_7.method7927();
		local6.a(0, local16.method1690(Static436.aFloatArray57));
		local6.a(4, local11.method1710(Static436.aFloatArray57));
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean481) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		local12.a(14, (float) (this.aClass100_Sub1_23.anInt9259 * local18 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(59) float local59 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local12.a(15, local29, 0.0F, 0.0F, 0.0F);
		local12.b(4, (float) local33, 0.0F, 0.0F, 0.0F);
		local12.b(5, local59, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
	@Override
	public void method8939() {
		if (this.aBoolean481) {
			@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(11) Class10_Sub2 local11 = this.aClass100_Sub1_Sub1_7.method7927();
			local6.a(0, local11.method1690(Static436.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		if (!this.aBoolean481) {
			return;
		}
		this.aClass100_Sub1_Sub1_7.method2537((IDirect3DVertexShader) null);
		this.aClass100_Sub1_Sub1_7.method2529((IDirect3DPixelShader) null);
		this.aClass100_Sub1_23.method7941(1);
		this.aClass100_Sub1_23.method7923((Interface19) null);
		this.aClass100_Sub1_23.method7941(0);
		this.aClass100_Sub1_23.method7923((Interface19) null);
		this.aBoolean481 = false;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	@Override
	public void method8937() {
		if (!this.aBoolean481) {
			return;
		}
		@Pc(17) IDirect3DDevice local17 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass100_Sub1_23.anInt9255 > 0) {
			@Pc(28) float local28 = this.aClass100_Sub1_23.aFloat170;
			@Pc(32) float local32 = this.aClass100_Sub1_23.aFloat176;
			local17.a(16, local28, 1.0F / (local28 - local32), 0.0F, 0.0F);
		} else {
			local17.a(16, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		local17.b(0, (float) (this.aClass100_Sub1_23.anInt9236 >> 16 & 0xFF) / 255.0F, (float) (this.aClass100_Sub1_23.anInt9236 >> 8 & 0xFF) / 255.0F, (float) (this.aClass100_Sub1_23.anInt9236 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V")
	@Override
	public void method8944() {
		if (this.aBoolean481) {
			@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(19) Class10_Sub2 local19 = this.aClass100_Sub1_23.method7862();
			local12.SetVertexShaderConstantF(12, local19.method1703(Static436.aFloatArray57), 2);
		}
	}
}
