import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!nea", name = "k", descriptor = "Lclient!db;")
	private final Class66 aClass66_4;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "Lclient!vg;")
	private final Class90_Sub3_Sub2 aClass90_Sub3_Sub2_5;

	@OriginalMember(owner = "client!nea", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!vg;Lclient!pj;Lclient!db;)V")
	public Class34_Sub3(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class66 arg2) {
		super(arg0);
		this.aClass66_4 = arg2;
		this.aClass90_Sub3_Sub2_5 = arg0;
		if (this.aClass66_4.method1373() && (this.aClass90_Sub3_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1.a(arg1.method5794("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)V")
	@Override
	public void method7280() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1;
			local12.a(4, this.aClass90_Sub3_19.method7621(Static341.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	@Override
	public void method7270() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1;
			@Pc(14) Class93_Sub3 local14 = this.aClass90_Sub3_Sub2_5.method7574();
			local9.a(0, local14.method3756(Static341.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
		this.aClass90_Sub3_19.method7570(Static458.aClass214_3, Static74.aClass214_1);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass90_Sub3_19.method7540(0, Static393.aClass150_6);
		this.aClass90_Sub3_19.method7540(1, Static20.aClass150_1);
		this.aClass90_Sub3_19.method7557(true, Static412.aClass150_8, false, 2);
		this.aClass90_Sub3_19.method7610(false);
		this.method7270();
		this.method7272();
		this.method7280();
		this.method7279();
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1;
		if (this.aClass66_4.aBoolean112) {
			@Pc(16) float local16 = (float) (this.aClass90_Sub3_19.anInt9563 % 4000) / 4000.0F;
			this.aClass90_Sub3_19.method7624(this.aClass66_4.anInterface11_1);
			local3.a(11, local16, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(42) int local42 = this.aClass90_Sub3_19.anInt9563 % 4000 * 16 / 4000;
			this.aClass90_Sub3_19.method7624(this.aClass66_4.anInterface7Array1[local42]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "(I)V")
	@Override
	public void method7279() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1;
		if (this.aClass90_Sub3_19.anInt9564 > 0) {
			@Pc(18) float local18 = this.aClass90_Sub3_19.aFloat200;
			@Pc(22) float local22 = this.aClass90_Sub3_19.aFloat199;
			@Pc(26) float local26 = local22 - 512.0F;
			local7.a(10, local26, 1.0F / (local22 - local26), local22, 1.0F / (local18 - local22));
		} else {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass90_Sub3_19.method7650(this.aClass90_Sub3_19.anInt9562);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass90_Sub3_19.method7540(0, Static393.aClass150_6);
		this.aClass90_Sub3_19.method7540(1, Static412.aClass150_8);
		this.aClass90_Sub3_19.method7540(2, Static20.aClass150_1);
		this.aClass90_Sub3_19.method7610(true);
	}

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "(I)V")
	@Override
	public void method7278() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1;
			@Pc(20) Class93_Sub3 local20 = this.aClass90_Sub3_Sub2_5.method7574();
			local15.a(0, local20.method3756(Static341.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V")
	@Override
	public void method7272() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass90_Sub3_Sub2_5.anIDirect3DDevice1;
		@Pc(20) Class93_Sub3 local20 = this.aClass90_Sub3_19.method7527();
		local20.method3769(Static341.aFloatArray57);
		Static341.aFloatArray57[6] *= 0.25F;
		Static341.aFloatArray57[2] *= 0.25F;
		Static341.aFloatArray57[1] *= 0.25F;
		Static341.aFloatArray57[4] *= 0.25F;
		Static341.aFloatArray57[0] *= 0.25F;
		Static341.aFloatArray57[7] *= 0.25F;
		Static341.aFloatArray57[5] *= 0.25F;
		Static341.aFloatArray57[3] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static341.aFloatArray57, 2);
	}
}
