import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class73_Sub4 extends Class73 {

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "Lclient!lba;")
	private final Class173 aClass173_4;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Lclient!hg;")
	private final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_5;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!hg;Lclient!dn;Lclient!lba;)V")
	public Class73_Sub4(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class173 arg2) {
		super(arg0);
		this.aClass173_4 = arg2;
		this.aClass4_Sub2_Sub1_5 = arg0;
		if (this.aClass173_4.method4735() && (this.aClass4_Sub2_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1.a(arg1.method1900("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	@Override
	public void method7572() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1;
			@Pc(18) Class128_Sub3 local18 = this.aClass4_Sub2_Sub1_5.method7225();
			local13.a(0, local18.method6893(Static178.aFloatArray36));
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
		this.aClass4_Sub2_19.method7270(Static157.aClass246_1, Static449.aClass246_4);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass4_Sub2_19.method7277(0, Static360.aClass27_5);
		this.aClass4_Sub2_19.method7277(1, Static319.aClass27_4);
		this.aClass4_Sub2_19.method7351(false, true, 2, Static503.aClass27_3);
		this.aClass4_Sub2_19.method7254(false);
		this.method7563();
		this.method7573();
		this.method7571();
		this.method7565();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass4_Sub2_19.method7277(0, Static360.aClass27_5);
		this.aClass4_Sub2_19.method7277(1, Static503.aClass27_3);
		this.aClass4_Sub2_19.method7277(2, Static319.aClass27_4);
		this.aClass4_Sub2_19.method7254(true);
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	@Override
	public void method7573() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1;
		@Pc(12) Class128_Sub3 local12 = this.aClass4_Sub2_19.method7331();
		local12.method6908(Static178.aFloatArray36);
		Static178.aFloatArray36[2] *= 0.25F;
		Static178.aFloatArray36[4] *= 0.25F;
		Static178.aFloatArray36[3] *= 0.25F;
		Static178.aFloatArray36[7] *= 0.25F;
		Static178.aFloatArray36[5] *= 0.25F;
		Static178.aFloatArray36[6] *= 0.25F;
		Static178.aFloatArray36[1] *= 0.25F;
		Static178.aFloatArray36[0] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static178.aFloatArray36, 2);
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public void method7571() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1;
			local13.a(4, this.aClass4_Sub2_19.method7328(Static178.aFloatArray36));
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1;
		if (this.aClass173_4.aBoolean380) {
			@Pc(49) float local49 = (float) (this.aClass4_Sub2_19.anInt8322 % 4000) / 4000.0F;
			this.aClass4_Sub2_19.method7316(this.aClass173_4.anInterface3_1);
			local3.a(11, local49, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(20) int local20 = this.aClass4_Sub2_19.anInt8322 % 4000 * 16 / 4000;
			this.aClass4_Sub2_19.method7316(this.aClass173_4.anInterface5Array2[local20]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	@Override
	public void method7563() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1;
			@Pc(18) Class128_Sub3 local18 = this.aClass4_Sub2_Sub1_5.method7225();
			local13.a(0, local18.method6893(Static178.aFloatArray36));
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	@Override
	public void method7565() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass4_Sub2_Sub1_5.anIDirect3DDevice1;
		if (this.aClass4_Sub2_19.anInt8289 <= 0) {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass4_Sub2_19.aFloat169;
			@Pc(31) float local31 = this.aClass4_Sub2_19.aFloat164;
			@Pc(35) float local35 = local31 - 512.0F;
			local7.a(10, local35, 1.0F / (local31 - local35), local31, 1.0F / (local27 - local31));
		}
		this.aClass4_Sub2_19.method7275(this.aClass4_Sub2_19.anInt8311);
	}
}
