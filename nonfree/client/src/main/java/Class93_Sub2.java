import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "Lclient!ss;")
	private final Class66_Sub1_Sub2 aClass66_Sub1_Sub2_5;

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Lclient!mca;")
	private final Class217 aClass217_4;

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!ss;Lclient!bi;Lclient!mca;)V")
	public Class93_Sub2(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class217 arg2) {
		super(arg0);
		this.aClass66_Sub1_Sub2_5 = arg0;
		this.aClass217_4 = arg2;
		if (this.aClass217_4.method4879() && (this.aClass66_Sub1_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1.a(arg1.method662("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V")
	@Override
	public void method7999() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass66_Sub1_19.anInt8414 > 0) {
			@Pc(15) float local15 = this.aClass66_Sub1_19.aFloat178;
			@Pc(19) float local19 = this.aClass66_Sub1_19.aFloat170;
			@Pc(23) float local23 = local19 - 512.0F;
			local6.a(10, local23, 1.0F / (local19 - local23), local19, 1.0F / (local15 - local19));
		} else {
			local6.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass66_Sub1_19.method6932(this.aClass66_Sub1_19.anInt8416);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	@Override
	public void method8004() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1;
			local8.a(4, this.aClass66_Sub1_19.method6965(Static284.aFloatArray37));
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
		this.aClass66_Sub1_19.method6997(Static440.aClass240_3, Static598.aClass240_5);
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass66_Sub1_19.method6923(Static22.aClass120_2, 0);
		this.aClass66_Sub1_19.method6923(Static184.aClass120_3, 1);
		this.aClass66_Sub1_19.method6923(Static19.aClass120_1, 2);
		this.aClass66_Sub1_19.method6950(true);
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)V")
	@Override
	public void method8003() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(19) Class134_Sub1 local19 = this.aClass66_Sub1_Sub2_5.method6940();
			local14.a(0, local19.method3406(Static284.aFloatArray37));
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)V")
	@Override
	public void method8005() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(15) Class134_Sub1 local15 = this.aClass66_Sub1_Sub2_5.method6940();
			local8.a(0, local15.method3406(Static284.aFloatArray37));
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass66_Sub1_19.method6923(Static22.aClass120_2, 0);
		this.aClass66_Sub1_19.method6923(Static19.aClass120_1, 1);
		this.aClass66_Sub1_19.method6959(2, false, true, Static184.aClass120_3);
		this.aClass66_Sub1_19.method6950(false);
		this.method8003();
		this.method7994();
		this.method8004();
		this.method7999();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	@Override
	public void method7994() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(20) Class134_Sub1 local20 = this.aClass66_Sub1_19.method6869();
		local20.method3397(Static284.aFloatArray37);
		Static284.aFloatArray37[1] *= 0.25F;
		Static284.aFloatArray37[2] *= 0.25F;
		Static284.aFloatArray37[0] *= 0.25F;
		Static284.aFloatArray37[3] *= 0.25F;
		Static284.aFloatArray37[5] *= 0.25F;
		Static284.aFloatArray37[7] *= 0.25F;
		Static284.aFloatArray37[4] *= 0.25F;
		Static284.aFloatArray37[6] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static284.aFloatArray37, 2);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass66_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass217_4.aBoolean428) {
			@Pc(51) float local51 = (float) (this.aClass66_Sub1_19.anInt8419 % 4000) / 4000.0F;
			this.aClass66_Sub1_19.method6979(this.aClass217_4.anInterface12_1);
			local3.a(11, local51, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass66_Sub1_19.anInt8419 % 4000 * 16 / 4000;
			this.aClass66_Sub1_19.method6979(this.aClass217_4.anInterface2Array2[local24]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}
}
