import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class18_Sub6 extends Class18 {

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!tn;")
	private final Class334 aClass334_4;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Lclient!ul;")
	private final Class13_Sub3_Sub2 aClass13_Sub3_Sub2_4;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!ul;Lclient!nd;Lclient!tn;)V")
	public Class18_Sub6(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class334 arg2) {
		super(arg0);
		this.aClass334_4 = arg2;
		this.aClass13_Sub3_Sub2_4 = arg0;
		if (arg1 != null && this.aClass334_4.method7835() && (this.aClass13_Sub3_Sub2_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass13_Sub3_Sub2_4.anIDirect3DDevice1.a(arg1.method5572("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		this.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
		this.aClass13_Sub3_23.method8231(Static470.aClass43_5, 1);
		this.aClass13_Sub3_23.method8277(true, false, Static23.aClass43_1, 2);
		this.aClass13_Sub3_23.method8207(false);
		this.aClass13_Sub3_Sub2_4.method8318(this.anIDirect3DVertexShader1);
		this.method8634();
		this.method8639();
		this.method8636();
		this.method8635();
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
	@Override
	public void method8639() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass13_Sub3_Sub2_4.anIDirect3DDevice1;
		@Pc(18) Class51_Sub2 local18 = this.aClass13_Sub3_23.method8256();
		local18.method3243(Static323.aFloatArray45);
		Static323.aFloatArray45[0] *= 0.25F;
		Static323.aFloatArray45[4] *= 0.25F;
		Static323.aFloatArray45[5] *= 0.25F;
		Static323.aFloatArray45[2] *= 0.25F;
		Static323.aFloatArray45[3] *= 0.25F;
		Static323.aFloatArray45[1] *= 0.25F;
		Static323.aFloatArray45[6] *= 0.25F;
		Static323.aFloatArray45[7] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static323.aFloatArray45, 2);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	@Override
	public void method8635() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass13_Sub3_Sub2_4.anIDirect3DDevice1;
		if (this.aClass13_Sub3_23.anInt9726 <= 0) {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(25) float local25 = this.aClass13_Sub3_23.aFloat196;
			@Pc(29) float local29 = this.aClass13_Sub3_23.aFloat192;
			@Pc(33) float local33 = local29 - 512.0F;
			local7.a(10, local33, 1.0F / (local29 - local33), local29, 1.0F / (local25 - local29));
		}
		this.aClass13_Sub3_23.method8212(this.aClass13_Sub3_23.anInt9743);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass13_Sub3_Sub2_4.anIDirect3DDevice1;
		if (this.aClass334_4.aBoolean659) {
			@Pc(48) float local48 = (float) (this.aClass13_Sub3_23.anInt9736 % 4000) / 4000.0F;
			this.aClass13_Sub3_23.method8234(this.aClass334_4.anInterface1_1);
			local7.a(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass13_Sub3_23.anInt9736 % 4000 * 16 / 4000;
			this.aClass13_Sub3_23.method8234(this.aClass334_4.anInterface27Array2[local21]);
			local7.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	@Override
	public void method8636() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass13_Sub3_Sub2_4.anIDirect3DDevice1;
			local6.a(4, this.aClass13_Sub3_23.method8294(Static323.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
		this.aClass13_Sub3_23.method8235(Static398.aClass269_5, Static26.aClass269_1);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		this.aClass13_Sub3_Sub2_4.method8318((IDirect3DVertexShader) null);
		this.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
		this.aClass13_Sub3_23.method8231(Static23.aClass43_1, 1);
		this.aClass13_Sub3_23.method8231(Static470.aClass43_5, 2);
		this.aClass13_Sub3_23.method8207(true);
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	@Override
	public void method8634() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass13_Sub3_Sub2_4.anIDirect3DDevice1;
			@Pc(17) Class51_Sub2 local17 = this.aClass13_Sub3_Sub2_4.method8289();
			local12.a(0, local17.method3231(Static323.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
	@Override
	public void method8640() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass13_Sub3_Sub2_4.anIDirect3DDevice1;
			@Pc(17) Class51_Sub2 local17 = this.aClass13_Sub3_Sub2_4.method8289();
			local12.a(0, local17.method3231(Static323.aFloatArray45));
		}
	}
}
