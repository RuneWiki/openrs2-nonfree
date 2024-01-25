import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!mba;")
	private final Class15_Sub2_Sub2 aClass15_Sub2_Sub2_4;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!bl;")
	private final Class31 aClass31_2;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!mba;Lclient!pe;Lclient!bl;)V")
	public Class19_Sub2(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class31 arg2) {
		super(arg0);
		this.aClass15_Sub2_Sub2_4 = arg0;
		this.aClass31_2 = arg2;
		if (this.aClass31_2.method1147() && (this.aClass15_Sub2_Sub2_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1.a(arg1.method6410("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	@Override
	public void method7885() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1;
			@Pc(16) Class255_Sub3 local16 = this.aClass15_Sub2_Sub2_4.method5377();
			local11.a(0, local16.method8031(Static180.aFloatArray29));
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
	@Override
	public void method7887() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1;
		if (this.aClass15_Sub2_18.anInt6550 > 0) {
			@Pc(19) float local19 = this.aClass15_Sub2_18.aFloat141;
			@Pc(23) float local23 = this.aClass15_Sub2_18.aFloat130;
			@Pc(27) float local27 = local23 - 512.0F;
			local8.a(10, local27, 1.0F / (local23 - local27), local23, 1.0F / (local19 - local23));
		} else {
			local8.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass15_Sub2_18.method5487(this.aClass15_Sub2_18.anInt6548);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1;
		if (this.aClass31_2.aBoolean84) {
			@Pc(20) float local20 = (float) (this.aClass15_Sub2_18.anInt6528 % 4000) / 4000.0F;
			this.aClass15_Sub2_18.method5414(this.aClass31_2.anInterface1_1);
			local3.a(11, local20, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(46) int local46 = this.aClass15_Sub2_18.anInt6528 % 4000 * 16 / 4000;
			this.aClass15_Sub2_18.method5414(this.aClass31_2.anInterface14Array2[local46]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	@Override
	public void method7893() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1;
			local12.a(4, this.aClass15_Sub2_18.method5456(Static180.aFloatArray29));
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	@Override
	public void method7891() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1;
		@Pc(18) Class255_Sub3 local18 = this.aClass15_Sub2_18.method5469();
		local18.method8039(Static180.aFloatArray29);
		Static180.aFloatArray29[3] *= 0.25F;
		Static180.aFloatArray29[2] *= 0.25F;
		Static180.aFloatArray29[7] *= 0.25F;
		Static180.aFloatArray29[1] *= 0.25F;
		Static180.aFloatArray29[4] *= 0.25F;
		Static180.aFloatArray29[6] *= 0.25F;
		Static180.aFloatArray29[5] *= 0.25F;
		Static180.aFloatArray29[0] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static180.aFloatArray29, 2);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
		this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass15_Sub2_18.method5444(0, Static159.aClass85_1);
		this.aClass15_Sub2_18.method5444(1, Static531.aClass85_5);
		this.aClass15_Sub2_18.method5404(true, Static454.aClass85_2, false, 2);
		this.aClass15_Sub2_18.method5424(false);
		this.method7882();
		this.method7891();
		this.method7893();
		this.method7887();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method7882() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1;
			@Pc(11) Class255_Sub3 local11 = this.aClass15_Sub2_Sub2_4.method5377();
			local6.a(0, local11.method8031(Static180.aFloatArray29));
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
		this.aClass15_Sub2_18.method5430(Static220.aClass120_4, Static162.aClass120_2);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
		this.aClass15_Sub2_Sub2_4.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass15_Sub2_18.method5444(0, Static159.aClass85_1);
		this.aClass15_Sub2_18.method5444(1, Static454.aClass85_2);
		this.aClass15_Sub2_18.method5444(2, Static531.aClass85_5);
		this.aClass15_Sub2_18.method5424(true);
	}
}
