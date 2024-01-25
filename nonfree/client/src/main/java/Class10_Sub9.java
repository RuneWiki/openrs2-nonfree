import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class10_Sub9 extends Class10 {

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "Lclient!tha;")
	private final Class22_Sub2_Sub1 aClass22_Sub2_Sub1_8;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "Lclient!ic;")
	private final Class172 aClass172_8;

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!tha;Lclient!ik;Lclient!ic;)V")
	public Class10_Sub9(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class172 arg2) {
		super(arg0);
		this.aClass22_Sub2_Sub1_8 = arg0;
		this.aClass172_8 = arg2;
		if (arg1 != null && this.aClass172_8.method3804() && (this.aClass22_Sub2_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass22_Sub2_Sub1_8.anIDirect3DDevice1.b(arg1.method3958("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		this.aClass22_Sub2_Sub1_8.method8195((IDirect3DVertexShader) null);
		this.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
		this.aClass22_Sub2_23.method8962(Static407.aClass392_2, 1);
		this.aClass22_Sub2_23.method8962(Static547.aClass392_3, 2);
		this.aClass22_Sub2_23.method8911(true);
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	@Override
	public void method9550() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass22_Sub2_Sub1_8.anIDirect3DDevice1;
		if (this.aClass22_Sub2_23.anInt10480 <= 0) {
			local11.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(29) float local29 = this.aClass22_Sub2_23.aFloat181;
			@Pc(33) float local33 = this.aClass22_Sub2_23.aFloat187;
			@Pc(37) float local37 = local33 - 512.0F;
			local11.b(10, local37, 1.0F / (local33 - local37), local33, 1.0F / (local29 - local33));
		}
		this.aClass22_Sub2_23.method8930(this.aClass22_Sub2_23.anInt10487);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
		this.aClass22_Sub2_23.method8914(Static666.aClass372_7, Static240.aClass372_6);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	@Override
	public void method9556() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(18) IDirect3DDevice local18 = this.aClass22_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(23) Class58_Sub2 local23 = this.aClass22_Sub2_Sub1_8.method8942();
			local18.a(0, local23.method6107(Static676.aFloatArray78));
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		this.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
		this.aClass22_Sub2_23.method8962(Static547.aClass392_3, 1);
		this.aClass22_Sub2_23.method8954(2, true, false, Static407.aClass392_2);
		this.aClass22_Sub2_23.method8911(false);
		this.aClass22_Sub2_Sub1_8.method8195(this.anIDirect3DVertexShader8);
		this.method9556();
		this.method9548();
		this.method9553();
		this.method9550();
	}

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)V")
	@Override
	public void method9547() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass22_Sub2_Sub1_8.anIDirect3DDevice1;
			@Pc(22) Class58_Sub2 local22 = this.aClass22_Sub2_Sub1_8.method8942();
			local17.a(0, local22.method6107(Static676.aFloatArray78));
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(Z)V")
	@Override
	public void method9548() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass22_Sub2_Sub1_8.anIDirect3DDevice1;
		@Pc(19) Class58_Sub2 local19 = this.aClass22_Sub2_23.method8921();
		local19.method6109(Static676.aFloatArray78);
		Static676.aFloatArray78[0] *= 0.25F;
		Static676.aFloatArray78[7] *= 0.25F;
		Static676.aFloatArray78[6] *= 0.25F;
		Static676.aFloatArray78[5] *= 0.25F;
		Static676.aFloatArray78[4] *= 0.25F;
		Static676.aFloatArray78[3] *= 0.25F;
		Static676.aFloatArray78[2] *= 0.25F;
		Static676.aFloatArray78[1] *= 0.25F;
		local14.SetVertexShaderConstantF(8, Static676.aFloatArray78, 2);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return this.anIDirect3DVertexShader8 != null;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass22_Sub2_Sub1_8.anIDirect3DDevice1;
		if (this.aClass172_8.aBoolean278) {
			@Pc(20) float local20 = (float) (this.aClass22_Sub2_23.anInt10466 % 4000) / 4000.0F;
			this.aClass22_Sub2_23.method8976(this.aClass172_8.anInterface19_1);
			local3.b(11, local20, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(46) int local46 = this.aClass22_Sub2_23.anInt10466 % 4000 * 16 / 4000;
			this.aClass22_Sub2_23.method8976(this.aClass172_8.anInterface16Array2[local46]);
			local3.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	@Override
	public void method9553() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass22_Sub2_Sub1_8.anIDirect3DDevice1;
			local14.a(4, this.aClass22_Sub2_23.method8946(Static676.aFloatArray78));
		}
	}
}
