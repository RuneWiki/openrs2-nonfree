import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "Lclient!cda;")
	private final Class61 aClass61_3;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "Lclient!sd;")
	private final Class57_Sub3_Sub2 aClass57_Sub3_Sub2_8;

	@OriginalMember(owner = "client!nga", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!nga", name = "s", descriptor = "Z")
	private final boolean aBoolean522;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!sd;Lclient!la;Lclient!cda;)V")
	public Class13_Sub7(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class61 arg2) {
		super(arg0);
		this.aClass61_3 = arg2;
		this.aClass57_Sub3_Sub2_8 = arg0;
		if (arg1 != null && this.aClass57_Sub3_21.aBoolean696 && this.aClass57_Sub3_21.aBoolean687 && (this.aClass57_Sub3_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1.a(arg1.method4999("environment_mapped_water_v", "dx"));
			this.anIDirect3DPixelShader1 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1.b(arg1.method4999("environment_mapped_water_f", "dx"));
			this.aBoolean522 = this.anIDirect3DVertexShader6 != null && this.anIDirect3DPixelShader1 != null && this.aClass61_3.method1091();
		} else {
			this.anIDirect3DPixelShader1 = null;
			this.aBoolean522 = false;
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(B)V")
	@Override
	public void method8266() {
		if (!this.aBoolean521) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1;
		@Pc(15) Class203_Sub1 local15 = this.aClass57_Sub3_Sub2_8.method7867();
		@Pc(20) Class203_Sub1 local20 = this.aClass57_Sub3_Sub2_8.method7865();
		local10.a(0, local20.method4843(Static392.aFloatArray61));
		local10.a(4, local15.method4848(Static392.aFloatArray61));
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
	@Override
	public void method8268() {
		if (this.aBoolean521) {
			@Pc(8) IDirect3DDevice local8 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1;
			@Pc(13) Class203_Sub1 local13 = this.aClass57_Sub3_21.method7761();
			local8.SetVertexShaderConstantF(12, local13.method4835(Static392.aFloatArray61), 2);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "(I)V")
	@Override
	public void method8267() {
		if (this.aBoolean521) {
			@Pc(15) IDirect3DDevice local15 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1;
			@Pc(20) Class203_Sub1 local20 = this.aClass57_Sub3_Sub2_8.method7865();
			local15.a(0, local20.method4843(Static392.aFloatArray61));
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		if (!this.aBoolean521) {
			return;
		}
		this.aClass57_Sub3_Sub2_8.method7872((IDirect3DVertexShader) null);
		this.aClass57_Sub3_Sub2_8.method7878((IDirect3DPixelShader) null);
		this.aClass57_Sub3_21.method7795(1);
		this.aClass57_Sub3_21.method7813((Interface22) null);
		this.aClass57_Sub3_21.method7795(0);
		this.aClass57_Sub3_21.method7813((Interface22) null);
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (this.aBoolean521) {
			@Pc(8) IDirect3DDevice local8 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1;
			local8.a(8, this.aClass57_Sub3_21.method7823(Static392.aFloatArray61));
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface24 local13 = this.aClass57_Sub3_21.method7811();
		if (!this.aBoolean522 || local13 == null) {
			return;
		}
		@Pc(24) IDirect3DDevice local24 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1;
		this.aClass57_Sub3_Sub2_8.method7872(this.anIDirect3DVertexShader6);
		this.aClass57_Sub3_Sub2_8.method7878(this.anIDirect3DPixelShader1);
		this.aClass57_Sub3_21.method7795(1);
		this.aClass57_Sub3_21.method7813(local13);
		this.aClass57_Sub3_21.method7795(0);
		this.aClass57_Sub3_21.method7813(this.aClass61_3.anInterface19_2);
		this.aBoolean521 = true;
		this.method8266();
		this.method8268();
		this.method8260();
		this.method8272();
		local24.a(1, -this.aClass57_Sub3_21.aFloatArray92[0], -this.aClass57_Sub3_21.aFloatArray92[1], -this.aClass57_Sub3_21.aFloatArray92[2], 0.0F);
		local24.a(2, this.aClass57_Sub3_21.aFloat165, this.aClass57_Sub3_21.aFloat177, this.aClass57_Sub3_21.aFloat179, 1.0F);
		local24.a(3, Math.abs(this.aClass57_Sub3_21.aFloatArray92[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
	@Override
	public void method8272() {
		if (!this.aBoolean521) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1;
		if (this.aClass57_Sub3_21.anInt9170 <= 0) {
			local14.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(35) float local35 = this.aClass57_Sub3_21.aFloat170;
			@Pc(39) float local39 = this.aClass57_Sub3_21.aFloat172;
			local14.b(16, local35, 1.0F / (local35 - local39), 0.0F, 0.0F);
		}
		local14.a(0, (float) (this.aClass57_Sub3_21.anInt9162 >> 16 & 0xFF) / 255.0F, (float) (this.aClass57_Sub3_21.anInt9162 >> 8 & 0xFF) / 255.0F, (float) (this.aClass57_Sub3_21.anInt9162 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return this.aBoolean522;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean521) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass57_Sub3_Sub2_8.anIDirect3DDevice1;
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		local14.b(14, (float) (local20 * this.aClass57_Sub3_21.anInt9168 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		@Pc(61) float local61 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		local14.b(15, local31, 0.0F, 0.0F, 0.0F);
		local14.a(4, (float) local35, 0.0F, 0.0F, 0.0F);
		local14.a(5, local61, 0.0F, 0.0F, 0.0F);
	}
}
