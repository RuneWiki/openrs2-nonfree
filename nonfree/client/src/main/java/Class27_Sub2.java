import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "Lclient!no;")
	private final Class250 aClass250_1;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "Lclient!hb;")
	private final Class133_Sub1_Sub1 aClass133_Sub1_Sub1_2;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!hb;Lclient!la;Lclient!no;)V")
	public Class27_Sub2(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class250 arg2) {
		super(arg0);
		this.aClass250_1 = arg2;
		this.aClass133_Sub1_Sub1_2 = arg0;
		if (arg1 != null && this.aClass250_1.method5558() && (this.aClass133_Sub1_Sub1_2.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass133_Sub1_Sub1_2.anIDirect3DDevice1.b(arg1.method4695("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)V")
	@Override
	public void method8902() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass133_Sub1_Sub1_2.anIDirect3DDevice1;
		@Pc(19) Class113_Sub1 local19 = this.aClass133_Sub1_23.method6180();
		local19.method2478(Static161.aFloatArray3);
		Static161.aFloatArray3[1] *= 0.25F;
		Static161.aFloatArray3[2] *= 0.25F;
		Static161.aFloatArray3[3] *= 0.25F;
		Static161.aFloatArray3[7] *= 0.25F;
		Static161.aFloatArray3[6] *= 0.25F;
		Static161.aFloatArray3[0] *= 0.25F;
		Static161.aFloatArray3[4] *= 0.25F;
		Static161.aFloatArray3[5] *= 0.25F;
		local14.SetVertexShaderConstantF(8, Static161.aFloatArray3, 2);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass133_Sub1_Sub1_2.anIDirect3DDevice1;
		if (this.aClass250_1.aBoolean449) {
			@Pc(49) float local49 = (float) (this.aClass133_Sub1_23.anInt7009 % 4000) / 4000.0F;
			this.aClass133_Sub1_23.method6153(this.aClass250_1.anInterface23_2);
			local3.a(11, local49, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(20) int local20 = this.aClass133_Sub1_23.anInt7009 % 4000 * 16 / 4000;
			this.aClass133_Sub1_23.method6153(this.aClass250_1.anInterface20Array1[local20]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
		this.aClass133_Sub1_23.method6239(Static132.aClass151_7, Static81.aClass151_2);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		this.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
		this.aClass133_Sub1_23.method6211(Static105.aClass236_1, 1);
		this.aClass133_Sub1_23.method6222(2, Static273.aClass236_3, true, false);
		this.aClass133_Sub1_23.method6244(false);
		this.aClass133_Sub1_Sub1_2.method3490(this.anIDirect3DVertexShader1);
		this.method8903();
		this.method8902();
		this.method8900();
		this.method8893();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V")
	@Override
	public void method8900() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass133_Sub1_Sub1_2.anIDirect3DDevice1;
			local13.a(4, this.aClass133_Sub1_23.method6220(Static161.aFloatArray3));
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		this.aClass133_Sub1_Sub1_2.method3490(null);
		this.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
		this.aClass133_Sub1_23.method6211(Static273.aClass236_3, 1);
		this.aClass133_Sub1_23.method6211(Static105.aClass236_1, 2);
		this.aClass133_Sub1_23.method6244(true);
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V")
	@Override
	public void method8899() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass133_Sub1_Sub1_2.anIDirect3DDevice1;
			@Pc(12) Class113_Sub1 local12 = this.aClass133_Sub1_Sub1_2.method6262();
			local7.a(0, local12.method2473(Static161.aFloatArray3));
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public void method8893() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass133_Sub1_Sub1_2.anIDirect3DDevice1;
		if (this.aClass133_Sub1_23.anInt7003 <= 0) {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass133_Sub1_23.aFloat130;
			@Pc(31) float local31 = this.aClass133_Sub1_23.aFloat125;
			@Pc(35) float local35 = local31 - 512.0F;
			local7.a(10, local35, 1.0F / (local31 - local35), local31, 1.0F / (local27 - local31));
		}
		this.aClass133_Sub1_23.method6160(this.aClass133_Sub1_23.anInt6997);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(Z)V")
	@Override
	public void method8903() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass133_Sub1_Sub1_2.anIDirect3DDevice1;
			@Pc(18) Class113_Sub1 local18 = this.aClass133_Sub1_Sub1_2.method6262();
			local13.a(0, local18.method2473(Static161.aFloatArray3));
		}
	}
}
