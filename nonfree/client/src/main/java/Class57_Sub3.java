import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Lclient!bea;")
	private final Class5_Sub2_Sub1 aClass5_Sub2_Sub1_4;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!mt;")
	private final Class211 aClass211_5;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!bea;Lclient!ni;Lclient!mt;)V")
	public Class57_Sub3(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class211 arg2) {
		super(arg0);
		this.aClass5_Sub2_Sub1_4 = arg0;
		this.aClass211_5 = arg2;
		if (arg1 != null && this.aClass211_5.method5816() && (this.aClass5_Sub2_Sub1_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass5_Sub2_Sub1_4.anIDirect3DDevice1.a(arg1.method5948("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
		this.aClass5_Sub2_23.method4022(Static3.aClass144_1, Static558.aClass144_5);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	@Override
	public void method8705() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass5_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_Sub1_4.method4030();
			local8.a(0, local13.method6309(Static200.aFloatArray43));
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub2_Sub1_4.anIDirect3DDevice1;
		if (this.aClass211_5.aBoolean554) {
			@Pc(48) float local48 = (float) (this.aClass5_Sub2_23.anInt4859 % 4000) / 4000.0F;
			this.aClass5_Sub2_23.method4008(this.aClass211_5.anInterface11_1);
			local7.b(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass5_Sub2_23.anInt4859 % 4000 * 16 / 4000;
			this.aClass5_Sub2_23.method4008(this.aClass211_5.anInterface15Array1[local21]);
			local7.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V")
	@Override
	public void method8704() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(16) IDirect3DDevice local16 = this.aClass5_Sub2_Sub1_4.anIDirect3DDevice1;
			local16.a(4, this.aClass5_Sub2_23.method4043(Static200.aFloatArray43));
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	@Override
	public void method8702() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass5_Sub2_Sub1_4.anIDirect3DDevice1;
		if (this.aClass5_Sub2_23.anInt4869 <= 0) {
			local11.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(31) float local31 = this.aClass5_Sub2_23.aFloat95;
			@Pc(35) float local35 = this.aClass5_Sub2_23.aFloat99;
			@Pc(39) float local39 = local35 - 512.0F;
			local11.b(10, local39, 1.0F / (local35 - local39), local35, 1.0F / (local31 - local35));
		}
		this.aClass5_Sub2_23.method3987(this.aClass5_Sub2_23.anInt4891);
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		this.aClass5_Sub2_Sub1_4.method1268((IDirect3DVertexShader) null);
		this.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
		this.aClass5_Sub2_23.method4054(1, Static512.aClass80_3);
		this.aClass5_Sub2_23.method4054(2, Static347.aClass80_2);
		this.aClass5_Sub2_23.method3948(true);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return this.anIDirect3DVertexShader3 != null;
	}

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "(I)V")
	@Override
	public void method8713() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub2_Sub1_4.anIDirect3DDevice1;
		@Pc(12) Class115_Sub3 local12 = this.aClass5_Sub2_23.method4064();
		local12.method6310(Static200.aFloatArray43);
		Static200.aFloatArray43[5] *= 0.25F;
		Static200.aFloatArray43[2] *= 0.25F;
		Static200.aFloatArray43[7] *= 0.25F;
		Static200.aFloatArray43[4] *= 0.25F;
		Static200.aFloatArray43[0] *= 0.25F;
		Static200.aFloatArray43[6] *= 0.25F;
		Static200.aFloatArray43[1] *= 0.25F;
		Static200.aFloatArray43[3] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static200.aFloatArray43, 2);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	@Override
	public void method8701() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass5_Sub2_Sub1_4.anIDirect3DDevice1;
			@Pc(17) Class115_Sub3 local17 = this.aClass5_Sub2_Sub1_4.method4030();
			local12.a(0, local17.method6309(Static200.aFloatArray43));
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		this.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
		this.aClass5_Sub2_23.method4054(1, Static347.aClass80_2);
		this.aClass5_Sub2_23.method4029(2, false, Static512.aClass80_3, true);
		this.aClass5_Sub2_23.method3948(false);
		this.aClass5_Sub2_Sub1_4.method1268(this.anIDirect3DVertexShader3);
		this.method8705();
		this.method8713();
		this.method8704();
		this.method8702();
	}
}
