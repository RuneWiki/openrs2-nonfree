import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class22_Sub7 extends Class22 {

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!tca;")
	private final Class315 aClass315_6;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!tga;")
	private final Class14_Sub2_Sub2 aClass14_Sub2_Sub2_8;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tga;Lclient!pfa;Lclient!tca;)V")
	public Class22_Sub7(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class315 arg2) {
		super(arg0);
		this.aClass315_6 = arg2;
		this.aClass14_Sub2_Sub2_8 = arg0;
		if (this.aClass315_6.method6759() && (this.aClass14_Sub2_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1.a(arg1.method5762("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	@Override
	public void method7650() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1;
			local7.a(4, this.aClass14_Sub2_20.method6993(Static549.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) IDirect3DDevice local10 = this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1;
		if (this.aClass315_6.aBoolean597) {
			@Pc(51) float local51 = (float) (this.aClass14_Sub2_20.anInt8587 % 4000) / 4000.0F;
			this.aClass14_Sub2_20.method7034(this.aClass315_6.anInterface11_1);
			local10.a(11, local51, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass14_Sub2_20.anInt8587 % 4000 * 16 / 4000;
			this.aClass14_Sub2_20.method7034(this.aClass315_6.anInterface6Array1[local24]);
			local10.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	@Override
	public void method7653() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1;
			@Pc(11) Class54_Sub3 local11 = this.aClass14_Sub2_Sub2_8.method7022();
			local6.a(0, local11.method5456(Static549.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	@Override
	public void method7652() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1;
		@Pc(21) Class54_Sub3 local21 = this.aClass14_Sub2_20.method7031();
		local21.method5460(Static549.aFloatArray71);
		Static549.aFloatArray71[3] *= 0.25F;
		Static549.aFloatArray71[0] *= 0.25F;
		Static549.aFloatArray71[7] *= 0.25F;
		Static549.aFloatArray71[2] *= 0.25F;
		Static549.aFloatArray71[1] *= 0.25F;
		Static549.aFloatArray71[5] *= 0.25F;
		Static549.aFloatArray71[4] *= 0.25F;
		Static549.aFloatArray71[6] *= 0.25F;
		local16.SetVertexShaderConstantF(8, Static549.aFloatArray71, 2);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass14_Sub2_20.method6912(Static185.aClass138_3, 0);
		this.aClass14_Sub2_20.method6912(Static89.aClass138_1, 1);
		this.aClass14_Sub2_20.method6912(Static113.aClass138_2, 2);
		this.aClass14_Sub2_20.method7010(true);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
		this.aClass14_Sub2_20.method6935(Static350.aClass228_12, Static581.aClass228_15);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass14_Sub2_20.method6912(Static185.aClass138_3, 0);
		this.aClass14_Sub2_20.method6912(Static113.aClass138_2, 1);
		this.aClass14_Sub2_20.method6996(false, Static89.aClass138_1, true, 2);
		this.aClass14_Sub2_20.method7010(false);
		this.method7644();
		this.method7652();
		this.method7650();
		this.method7649();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
	@Override
	public void method7649() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1;
		if (this.aClass14_Sub2_20.anInt8592 <= 0) {
			local8.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(28) float local28 = this.aClass14_Sub2_20.aFloat179;
			@Pc(32) float local32 = this.aClass14_Sub2_20.aFloat185;
			@Pc(36) float local36 = local32 - 512.0F;
			local8.a(10, local36, 1.0F / (local32 - local36), local32, 1.0F / (local28 - local32));
		}
		this.aClass14_Sub2_20.method7025(this.aClass14_Sub2_20.anInt8585);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	@Override
	public void method7644() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass14_Sub2_Sub2_8.anIDirect3DDevice1;
			@Pc(11) Class54_Sub3 local11 = this.aClass14_Sub2_Sub2_8.method7022();
			local6.a(0, local11.method5456(Static549.aFloatArray71));
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
	}
}
