import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class37_Sub9 extends Class37 {

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Z")
	private boolean aBoolean680;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!gb;")
	private final Class9_Sub3_Sub1 aClass9_Sub3_Sub1_8;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!gb;Lclient!jo;)V")
	public Class37_Sub9(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1) {
		super(arg0);
		this.aClass9_Sub3_Sub1_8 = arg0;
		if ((this.aClass9_Sub3_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1.a(arg1.method4450("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1.a(arg1.method4450("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1.a(arg1.method4450("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1.a(arg1.method4450("uw_model_lit", "dx"));
			this.aBoolean679 = this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader6 != null;
		} else {
			this.aBoolean679 = false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	@Override
	public void method7558() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1;
			@Pc(16) Class8_Sub3 local16 = this.aClass9_Sub3_Sub1_8.method5563();
			local11.a(0, local16.method8184(Static509.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		if (this.anIDirect3DVertexShader5 != null) {
			this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader5 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	@Override
	public void method7557() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1;
			local14.a(4, this.aClass9_Sub3_19.method5523(Static509.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return this.aBoolean679;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	@Override
	public void method7553() {
		if (this.anIDirect3DVertexShader5 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass9_Sub3_19.IA();
		@Pc(15) int local15 = this.aClass9_Sub3_19.U();
		@Pc(25) float local25 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(36) float local36 = (float) local11 - (float) (local11 - local15) * 0.25F;
		local7.a(10, local36, 1.0F / (local25 - local36), local25, 1.0F / ((float) local11 - local25));
		local7.a(11, 1.0F / (float) this.aClass9_Sub3_19.method5568(), (float) this.aClass9_Sub3_19.method5469() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		this.aBoolean680 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public void method7554() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1;
			@Pc(18) Class8_Sub3 local18 = this.aClass9_Sub3_Sub1_8.method5563();
			local13.a(0, local18.method8184(Static509.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	@Override
	public void method7555() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1;
			@Pc(12) Class8_Sub3 local12 = this.aClass9_Sub3_19.method5484();
			local7.SetVertexShaderConstantF(8, local12.method8182(Static509.aFloatArray66), 2);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	private void method7566() {
		if (this.anIDirect3DVertexShader5 == null || !this.aBoolean680) {
			return;
		}
		@Pc(14) Class8_Sub3 local14 = this.aClass9_Sub3_19.method5512();
		@Pc(18) IDirect3DDevice local18 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1;
		local18.a(13, this.aClass9_Sub3_19.aFloat145 * this.aClass9_Sub3_19.aFloat148, this.aClass9_Sub3_19.aFloat148 * this.aClass9_Sub3_19.aFloat144, this.aClass9_Sub3_19.aFloat148 * this.aClass9_Sub3_19.aFloat138, 1.0F);
		local18.a(14, this.aClass9_Sub3_19.aFloat143 * this.aClass9_Sub3_19.aFloat145, this.aClass9_Sub3_19.aFloat144 * this.aClass9_Sub3_19.aFloat143, this.aClass9_Sub3_19.aFloat138 * this.aClass9_Sub3_19.aFloat143, 1.0F);
		local18.a(16, this.aClass9_Sub3_19.aFloat142 * this.aClass9_Sub3_19.aFloat145, this.aClass9_Sub3_19.aFloat142 * this.aClass9_Sub3_19.aFloat144, this.aClass9_Sub3_19.aFloat138 * this.aClass9_Sub3_19.aFloat142, 1.0F);
		local14.method8189(Static509.aFloatArray65, this.aClass9_Sub3_19.aFloatArray40[1], this.aClass9_Sub3_19.aFloatArray40[0], this.aClass9_Sub3_19.aFloatArray40[2]);
		local18.SetVertexShaderConstantF(15, Static509.aFloatArray65, 1);
		local14.method8189(Static509.aFloatArray65, this.aClass9_Sub3_19.aFloatArray44[1], this.aClass9_Sub3_19.aFloatArray44[0], this.aClass9_Sub3_19.aFloatArray44[2]);
		local18.SetVertexShaderConstantF(15, Static509.aFloatArray65, 1);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	@Override
	public void method7556() {
		@Pc(3) IDirect3DDevice local3 = this.aClass9_Sub3_Sub1_8.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass9_Sub3_19.method5511();
		@Pc(19) Class8_Sub3 local19 = this.aClass9_Sub3_19.method5512();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean680) {
			local33 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader6;
		} else {
			local33 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader4;
		}
		if (local33 != this.anIDirect3DVertexShader5) {
			this.anIDirect3DVertexShader5 = local33;
			local3.SetVertexShader(local33);
			this.method7566();
			this.method7557();
			this.method7555();
			this.method7554();
			this.method7558();
			this.method7553();
		}
		local19.method8183(0.0F, 0.0F, (float) local8, Static509.aFloatArray65, -1.0F);
		local3.a(12, Static509.aFloatArray65);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		this.aClass9_Sub3_19.method5494(arg1);
	}
}
