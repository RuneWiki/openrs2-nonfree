import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class32_Sub10 extends Class32 {

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "Lclient!sga;")
	private final Class132_Sub1_Sub2 aClass132_Sub1_Sub2_7;

	@OriginalMember(owner = "client!sea", name = "n", descriptor = "Lclient!oca;")
	private final Class247 aClass247_7;

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!sga;Lclient!ae;Lclient!oca;)V")
	public Class32_Sub10(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class247 arg2) {
		super(arg0);
		this.aClass132_Sub1_Sub2_7 = arg0;
		this.aClass247_7 = arg2;
		if (arg1 != null && this.aClass247_7.method6208() && (this.aClass132_Sub1_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass132_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method274("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		this.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
		this.aClass132_Sub1_21.method7552(Static583.aClass378_3, 1);
		this.aClass132_Sub1_21.method7612(true, 2, Static568.aClass378_2, false);
		this.aClass132_Sub1_21.method7595(false);
		this.aClass132_Sub1_Sub2_7.method7656(this.anIDirect3DVertexShader7);
		this.method8320();
		this.method8321();
		this.method8319();
		this.method8323();
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass132_Sub1_Sub2_7.anIDirect3DDevice1;
		if (this.aClass247_7.aBoolean481) {
			@Pc(16) float local16 = (float) (this.aClass132_Sub1_21.anInt9000 % 4000) / 4000.0F;
			this.aClass132_Sub1_21.method7635(this.aClass247_7.anInterface1_1);
			local3.a(11, local16, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(42) int local42 = this.aClass132_Sub1_21.anInt9000 % 4000 * 16 / 4000;
			this.aClass132_Sub1_21.method7635(this.aClass247_7.anInterface2Array1[local42]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	@Override
	public void method8321() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass132_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(16) Class207_Sub3 local16 = this.aClass132_Sub1_21.method7643();
		local16.method8217(Static533.aFloatArray59);
		Static533.aFloatArray59[7] *= 0.25F;
		Static533.aFloatArray59[5] *= 0.25F;
		Static533.aFloatArray59[3] *= 0.25F;
		Static533.aFloatArray59[1] *= 0.25F;
		Static533.aFloatArray59[4] *= 0.25F;
		Static533.aFloatArray59[2] *= 0.25F;
		Static533.aFloatArray59[6] *= 0.25F;
		Static533.aFloatArray59[0] *= 0.25F;
		local11.SetVertexShaderConstantF(8, Static533.aFloatArray59, 2);
	}

	@OriginalMember(owner = "client!sea", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		this.aClass132_Sub1_Sub2_7.method7656((IDirect3DVertexShader) null);
		this.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
		this.aClass132_Sub1_21.method7552(Static568.aClass378_2, 1);
		this.aClass132_Sub1_21.method7552(Static583.aClass378_3, 2);
		this.aClass132_Sub1_21.method7595(true);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
		this.aClass132_Sub1_21.method7637(Static296.aClass322_4, Static116.aClass322_2);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
	@Override
	public void method8317() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass132_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(13) Class207_Sub3 local13 = this.aClass132_Sub1_Sub2_7.method7566();
			local8.a(0, local13.method8230(Static533.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	@Override
	public void method8320() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass132_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class207_Sub3 local12 = this.aClass132_Sub1_Sub2_7.method7566();
			local7.a(0, local12.method8230(Static533.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)V")
	@Override
	public void method8323() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass132_Sub1_Sub2_7.anIDirect3DDevice1;
		if (this.aClass132_Sub1_21.anInt9002 <= 0) {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass132_Sub1_21.aFloat165;
			@Pc(31) float local31 = this.aClass132_Sub1_21.aFloat166;
			@Pc(35) float local35 = local31 - 512.0F;
			local7.a(10, local35, 1.0F / (local31 - local35), local31, 1.0F / (local27 - local31));
		}
		this.aClass132_Sub1_21.method7611(this.aClass132_Sub1_21.anInt8984);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
	@Override
	public void method8319() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass132_Sub1_Sub2_7.anIDirect3DDevice1;
			local6.a(4, this.aClass132_Sub1_21.method7596(Static533.aFloatArray59));
		}
	}
}
