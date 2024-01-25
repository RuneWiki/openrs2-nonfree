import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class73_Sub9 extends Class73 {

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Z")
	private boolean aBoolean649;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!hg;")
	private final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_8;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Z")
	private final boolean aBoolean648;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!hg;Lclient!dn;)V")
	public Class73_Sub9(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class69 arg1) {
		super(arg0);
		this.aClass4_Sub2_Sub1_8 = arg0;
		if ((this.aClass4_Sub2_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean648 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method1900("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method1900("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method1900("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1.a(arg1.method1900("uw_model_lit", "dx"));
			this.aBoolean648 = this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader3 != null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass4_Sub2_19.method7316(arg1);
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
	@Override
	public void method7573() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(16) Class128_Sub3 local16 = this.aClass4_Sub2_19.method7331();
			local11.SetVertexShaderConstantF(8, local16.method6908(Static493.aFloatArray76), 2);
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
	@Override
	public void method7563() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(23) Class128_Sub3 local23 = this.aClass4_Sub2_Sub1_8.method7225();
			local14.a(0, local23.method6893(Static493.aFloatArray76));
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
	@Override
	public void method7571() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1;
			local8.a(4, this.aClass4_Sub2_19.method7328(Static493.aFloatArray76));
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	@Override
	public void method7565() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass4_Sub2_19.CA();
		@Pc(22) int local22 = this.aClass4_Sub2_19.c();
		@Pc(33) float local33 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(44) float local44 = (float) local18 - (float) (local18 - local22) * 0.25F;
		local14.a(10, local44, 1.0F / (local33 - local44), local33, 1.0F / ((float) local18 - local33));
		local14.a(11, 1.0F / (float) this.aClass4_Sub2_19.method7321(), (float) this.aClass4_Sub2_19.method7335() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
	private void method7575() {
		if (this.anIDirect3DVertexShader6 == null || !this.aBoolean649) {
			return;
		}
		@Pc(15) Class128_Sub3 local15 = this.aClass4_Sub2_19.method7296();
		@Pc(19) IDirect3DDevice local19 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1;
		local19.a(13, this.aClass4_Sub2_19.aFloat176 * this.aClass4_Sub2_19.aFloat175, this.aClass4_Sub2_19.aFloat176 * this.aClass4_Sub2_19.aFloat179, this.aClass4_Sub2_19.aFloat176 * this.aClass4_Sub2_19.aFloat172, 1.0F);
		local19.a(14, this.aClass4_Sub2_19.aFloat175 * this.aClass4_Sub2_19.aFloat174, this.aClass4_Sub2_19.aFloat179 * this.aClass4_Sub2_19.aFloat174, this.aClass4_Sub2_19.aFloat174 * this.aClass4_Sub2_19.aFloat172, 1.0F);
		local19.a(16, this.aClass4_Sub2_19.aFloat166 * this.aClass4_Sub2_19.aFloat175, this.aClass4_Sub2_19.aFloat179 * this.aClass4_Sub2_19.aFloat166, this.aClass4_Sub2_19.aFloat166 * this.aClass4_Sub2_19.aFloat172, 1.0F);
		local15.method6900(this.aClass4_Sub2_19.aFloatArray66[2], this.aClass4_Sub2_19.aFloatArray66[1], this.aClass4_Sub2_19.aFloatArray66[0], Static493.aFloatArray75);
		local19.SetVertexShaderConstantF(15, Static493.aFloatArray75, 1);
		local15.method6900(this.aClass4_Sub2_19.aFloatArray74[2], this.aClass4_Sub2_19.aFloatArray74[1], this.aClass4_Sub2_19.aFloatArray74[0], Static493.aFloatArray75);
		local19.SetVertexShaderConstantF(15, Static493.aFloatArray75, 1);
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V")
	@Override
	public void method7574() {
		@Pc(3) IDirect3DDevice local3 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass4_Sub2_19.method7344();
		@Pc(13) Class128_Sub3 local13 = this.aClass4_Sub2_19.method7296();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean649) {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader3;
		} else {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader5;
		}
		if (local27 != this.anIDirect3DVertexShader6) {
			this.anIDirect3DVertexShader6 = local27;
			local3.SetVertexShader(local27);
			this.method7575();
			this.method7571();
			this.method7573();
			this.method7563();
			this.method7572();
			this.method7565();
		}
		local13.method6896(-1.0F, 0.0F, 0.0F, (float) local8, Static493.aFloatArray75);
		local3.a(12, Static493.aFloatArray75);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		if (this.anIDirect3DVertexShader6 != null) {
			this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	@Override
	public void method7572() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass4_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(19) Class128_Sub3 local19 = this.aClass4_Sub2_Sub1_8.method7225();
			local14.a(0, local19.method6893(Static493.aFloatArray76));
		}
	}
}
