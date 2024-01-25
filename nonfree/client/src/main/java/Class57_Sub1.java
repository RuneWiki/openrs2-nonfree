import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "Z")
	private boolean aBoolean210;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "Lclient!mt;")
	private final Class211 aClass211_3;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "Lclient!bea;")
	private final Class5_Sub2_Sub1 aClass5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!dba", name = "o", descriptor = "Z")
	private final boolean aBoolean209;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "Lclient!jagdx/IDirect3DPixelShader;")
	private final IDirect3DPixelShader anIDirect3DPixelShader1;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!bea;Lclient!ni;Lclient!mt;)V")
	public Class57_Sub1(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class211 arg2) {
		super(arg0);
		this.aClass211_3 = arg2;
		this.aClass5_Sub2_Sub1_2 = arg0;
		if (arg1 != null && this.aClass5_Sub2_23.aBoolean381 && this.aClass5_Sub2_23.aBoolean386 && (this.aClass5_Sub2_Sub1_2.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1.a(arg1.method5948("dx", "environment_mapped_water_v"));
			this.anIDirect3DPixelShader1 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1.b(arg1.method5948("dx", "environment_mapped_water_f"));
			this.aBoolean209 = this.anIDirect3DVertexShader2 != null && this.anIDirect3DPixelShader1 != null && this.aClass211_3.method5821();
		} else {
			this.anIDirect3DVertexShader2 = null;
			this.aBoolean209 = false;
			this.anIDirect3DPixelShader1 = null;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
	@Override
	public void method8702() {
		if (!this.aBoolean210) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1;
		if (this.aClass5_Sub2_23.anInt4869 <= 0) {
			local12.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(32) float local32 = this.aClass5_Sub2_23.aFloat95;
			@Pc(36) float local36 = this.aClass5_Sub2_23.aFloat99;
			local12.b(16, local32, 1.0F / (local32 - local36), 0.0F, 0.0F);
		}
		local12.a(0, (float) (this.aClass5_Sub2_23.anInt4891 >> 16 & 0xFF) / 255.0F, (float) (this.aClass5_Sub2_23.anInt4891 >> 8 & 0xFF) / 255.0F, (float) (this.aClass5_Sub2_23.anInt4891 & 0xFF) / 255.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
	@Override
	public void method8705() {
		if (this.aBoolean210) {
			@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1;
			@Pc(11) Class115_Sub3 local11 = this.aClass5_Sub2_Sub1_2.method4030();
			local6.a(0, local11.method6309(Static88.aFloatArray28));
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
	@Override
	public void method8701() {
		if (!this.aBoolean210) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1;
		@Pc(18) Class115_Sub3 local18 = this.aClass5_Sub2_Sub1_2.method3959();
		@Pc(23) Class115_Sub3 local23 = this.aClass5_Sub2_Sub1_2.method4030();
		local13.a(0, local23.method6309(Static88.aFloatArray28));
		local13.a(4, local18.method6306(Static88.aFloatArray28));
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "(I)V")
	@Override
	public void method8713() {
		if (this.aBoolean210) {
			@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1;
			@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_23.method4064();
			local6.SetVertexShaderConstantF(12, local13.method6310(Static88.aFloatArray28), 2);
		}
	}

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "(I)V")
	@Override
	public void method8704() {
		if (this.aBoolean210) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1;
			local7.a(8, this.aClass5_Sub2_23.method4043(Static88.aFloatArray28));
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean210) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		local6.b(14, (float) (local12 * this.aClass5_Sub2_23.anInt4859 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
		local6.b(15, local23, 0.0F, 0.0F, 0.0F);
		local6.a(4, (float) local27, 0.0F, 0.0F, 0.0F);
		local6.a(5, local36, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		if (!this.aBoolean210) {
			return;
		}
		this.aClass5_Sub2_Sub1_2.method1268((IDirect3DVertexShader) null);
		this.aClass5_Sub2_Sub1_2.method1273((IDirect3DPixelShader) null);
		this.aClass5_Sub2_23.method3954(1);
		this.aClass5_Sub2_23.method4008((Interface4) null);
		this.aClass5_Sub2_23.method3954(0);
		this.aClass5_Sub2_23.method4008((Interface4) null);
		this.aBoolean210 = false;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		@Pc(4) Interface24 local4 = this.aClass5_Sub2_23.method3942();
		if (!this.aBoolean209 || local4 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass5_Sub2_Sub1_2.anIDirect3DDevice1;
		this.aClass5_Sub2_Sub1_2.method1268(this.anIDirect3DVertexShader2);
		this.aClass5_Sub2_Sub1_2.method1273(this.anIDirect3DPixelShader1);
		this.aClass5_Sub2_23.method3954(1);
		this.aClass5_Sub2_23.method4008(local4);
		this.aClass5_Sub2_23.method3954(0);
		this.aClass5_Sub2_23.method4008(this.aClass211_3.anInterface11_2);
		this.aBoolean210 = true;
		this.method8701();
		this.method8713();
		this.method8704();
		this.method8702();
		local14.a(1, -this.aClass5_Sub2_23.aFloatArray49[0], -this.aClass5_Sub2_23.aFloatArray49[1], -this.aClass5_Sub2_23.aFloatArray49[2], 0.0F);
		local14.a(2, this.aClass5_Sub2_23.aFloat98, this.aClass5_Sub2_23.aFloat89, this.aClass5_Sub2_23.bf, 1.0F);
		local14.a(3, Math.abs(this.aClass5_Sub2_23.aFloatArray49[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return this.aBoolean209;
	}
}
