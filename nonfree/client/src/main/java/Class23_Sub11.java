import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class23_Sub11 extends Class23 {

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "Lclient!jd;")
	private final Class184 aClass184_8;

	@OriginalMember(owner = "client!tga", name = "i", descriptor = "Lclient!os;")
	private final Class75_Sub1_Sub2 aClass75_Sub1_Sub2_7;

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lclient!os;Lclient!lga;Lclient!jd;)V")
	public Class23_Sub11(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class184 arg2) {
		super(arg0);
		this.aClass184_8 = arg2;
		this.aClass75_Sub1_Sub2_7 = arg0;
		if (arg1 != null && this.aClass184_8.method4632() && (this.aClass75_Sub1_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass75_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method5284("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return this.anIDirect3DVertexShader8 != null;
	}

	@OriginalMember(owner = "client!tga", name = "g", descriptor = "(I)V")
	@Override
	public void method8170() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(9) IDirect3DDevice local9 = this.aClass75_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(14) Class109_Sub3 local14 = this.aClass75_Sub1_22.method6836();
		local14.method4360(Static586.aFloatArray75);
		Static586.aFloatArray75[2] *= 0.25F;
		Static586.aFloatArray75[5] *= 0.25F;
		Static586.aFloatArray75[0] *= 0.25F;
		Static586.aFloatArray75[3] *= 0.25F;
		Static586.aFloatArray75[7] *= 0.25F;
		Static586.aFloatArray75[4] *= 0.25F;
		Static586.aFloatArray75[1] *= 0.25F;
		Static586.aFloatArray75[6] *= 0.25F;
		local9.SetVertexShaderConstantF(8, Static586.aFloatArray75, 2);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass75_Sub1_Sub2_7.anIDirect3DDevice1;
		if (this.aClass184_8.aBoolean386) {
			@Pc(48) float local48 = (float) (this.aClass75_Sub1_22.anInt7673 % 4000) / 4000.0F;
			this.aClass75_Sub1_22.method6814(this.aClass184_8.anInterface13_1);
			local7.a(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass75_Sub1_22.anInt7673 % 4000 * 16 / 4000;
			this.aClass75_Sub1_22.method6814(this.aClass184_8.anInterface7Array1[local21]);
			local7.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		this.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
		this.aClass75_Sub1_22.method6795(1, Static389.aClass261_8);
		this.aClass75_Sub1_22.method6831(false, true, Static51.aClass261_2, 2);
		this.aClass75_Sub1_22.method6725(false);
		this.aClass75_Sub1_Sub2_7.method6859(this.anIDirect3DVertexShader8);
		this.method8165();
		this.method8170();
		this.method8168();
		this.method8171();
	}

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "(I)V")
	@Override
	public void method8165() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass75_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(17) Class109_Sub3 local17 = this.aClass75_Sub1_Sub2_7.method6848();
			local12.a(0, local17.method4357(Static586.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
	@Override
	public void method8168() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass75_Sub1_Sub2_7.anIDirect3DDevice1;
			local6.a(4, this.aClass75_Sub1_22.method6800(Static586.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
		this.aClass75_Sub1_22.method6743(Static399.aClass344_3, Static421.aClass344_4);
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
	@Override
	public void method8171() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass75_Sub1_Sub2_7.anIDirect3DDevice1;
		if (this.aClass75_Sub1_22.anInt7657 > 0) {
			@Pc(17) float local17 = this.aClass75_Sub1_22.aFloat155;
			@Pc(21) float local21 = this.aClass75_Sub1_22.aFloat142;
			@Pc(25) float local25 = local21 - 512.0F;
			local6.a(10, local25, 1.0F / (local21 - local25), local21, 1.0F / (local17 - local21));
		} else {
			local6.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass75_Sub1_22.method6801(this.aClass75_Sub1_22.anInt7670);
	}

	@OriginalMember(owner = "client!tga", name = "f", descriptor = "(I)V")
	@Override
	public void method8169() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass75_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(11) Class109_Sub3 local11 = this.aClass75_Sub1_Sub2_7.method6848();
			local6.a(0, local11.method4357(Static586.aFloatArray75));
		}
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		this.aClass75_Sub1_Sub2_7.method6859((IDirect3DVertexShader) null);
		this.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
		this.aClass75_Sub1_22.method6795(1, Static51.aClass261_2);
		this.aClass75_Sub1_22.method6795(2, Static389.aClass261_8);
		this.aClass75_Sub1_22.method6725(true);
	}
}
