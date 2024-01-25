import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class92_Sub7 extends Class92 {

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "Lclient!ui;")
	private final Class121_Sub2_Sub2 aClass121_Sub2_Sub2_7;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "Lclient!rba;")
	private final Class269 aClass269_3;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!ui;Lclient!pq;Lclient!rba;)V")
	public Class92_Sub7(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class269 arg2) {
		super(arg0);
		this.aClass121_Sub2_Sub2_7 = arg0;
		this.aClass269_3 = arg2;
		if (this.aClass269_3.method6276() && (this.aClass121_Sub2_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method5836("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
	@Override
	public void method7752() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(20) Class34_Sub3 local20 = this.aClass121_Sub2_Sub2_7.method7189();
			local15.a(0, local20.method3755(Static497.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	@Override
	public void method7746() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1;
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_20.method7284();
		local13.method3768(Static497.aFloatArray52);
		Static497.aFloatArray52[2] *= 0.25F;
		Static497.aFloatArray52[6] *= 0.25F;
		Static497.aFloatArray52[0] *= 0.25F;
		Static497.aFloatArray52[5] *= 0.25F;
		Static497.aFloatArray52[3] *= 0.25F;
		Static497.aFloatArray52[7] *= 0.25F;
		Static497.aFloatArray52[1] *= 0.25F;
		Static497.aFloatArray52[4] *= 0.25F;
		local8.SetVertexShaderConstantF(8, Static497.aFloatArray52, 2);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass121_Sub2_20.method7270(Static67.aClass305_1, 0);
		this.aClass121_Sub2_20.method7270(Static121.aClass305_2, 1);
		this.aClass121_Sub2_20.method7270(Static257.aClass305_4, 2);
		this.aClass121_Sub2_20.method7178(true);
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)V")
	@Override
	public void method7757() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(17) Class34_Sub3 local17 = this.aClass121_Sub2_Sub2_7.method7189();
			local12.a(0, local17.method3755(Static497.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V")
	@Override
	public void method7755() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1;
			local8.a(4, this.aClass121_Sub2_20.method7287(Static497.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass121_Sub2_20.method7270(Static67.aClass305_1, 0);
		this.aClass121_Sub2_20.method7270(Static257.aClass305_4, 1);
		this.aClass121_Sub2_20.method7282(false, 2, true, Static121.aClass305_2);
		this.aClass121_Sub2_20.method7178(false);
		this.method7752();
		this.method7746();
		this.method7755();
		this.method7750();
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) IDirect3DDevice local10 = this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1;
		if (this.aClass269_3.aBoolean523) {
			@Pc(51) float local51 = (float) (this.aClass121_Sub2_20.anInt8920 % 4000) / 4000.0F;
			this.aClass121_Sub2_20.method7167(this.aClass269_3.anInterface12_1);
			local10.a(11, local51, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass121_Sub2_20.anInt8920 % 4000 * 16 / 4000;
			this.aClass121_Sub2_20.method7167(this.aClass269_3.anInterface20Array2[local24]);
			local10.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	@Override
	public void method7750() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass121_Sub2_Sub2_7.anIDirect3DDevice1;
		if (this.aClass121_Sub2_20.anInt8913 > 0) {
			@Pc(18) float local18 = this.aClass121_Sub2_20.aFloat192;
			@Pc(22) float local22 = this.aClass121_Sub2_20.aFloat200;
			@Pc(26) float local26 = local22 - 512.0F;
			local7.a(10, local26, 1.0F / (local22 - local26), local22, 1.0F / (local18 - local22));
		} else {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass121_Sub2_20.method7166(this.aClass121_Sub2_20.anInt8914);
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
		this.aClass121_Sub2_20.method7198(Static570.aClass59_5, Static351.aClass59_3);
	}
}
