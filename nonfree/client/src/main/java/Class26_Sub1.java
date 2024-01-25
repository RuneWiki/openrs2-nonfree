import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!av", name = "k", descriptor = "Lclient!wu;")
	private final Class145_Sub1_Sub2 aClass145_Sub1_Sub2_1;

	@OriginalMember(owner = "client!av", name = "n", descriptor = "Lclient!oc;")
	private final Class270 aClass270_1;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!wu;Lclient!nca;Lclient!oc;)V")
	public Class26_Sub1(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class270 arg2) {
		super(arg0);
		this.aClass145_Sub1_Sub2_1 = arg0;
		this.aClass270_1 = arg2;
		if (arg1 != null && this.aClass270_1.method6535() && (this.aClass145_Sub1_Sub2_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass145_Sub1_Sub2_1.anIDirect3DDevice1.a(arg1.method6104("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
		this.aClass145_Sub1_21.method9725(Static62.aClass293_1, Static679.aClass293_5);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass145_Sub1_Sub2_1.anIDirect3DDevice1;
		if (this.aClass270_1.aBoolean614) {
			@Pc(48) float local48 = (float) (this.aClass145_Sub1_21.anInt11263 % 4000) / 4000.0F;
			this.aClass145_Sub1_21.method9754(this.aClass270_1.anInterface7_1);
			local7.b(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass145_Sub1_21.anInt11263 % 4000 * 16 / 4000;
			this.aClass145_Sub1_21.method9754(this.aClass270_1.anInterface4Array2[local21]);
			local7.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V")
	@Override
	public void method7999() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass145_Sub1_Sub2_1.anIDirect3DDevice1;
			local8.a(4, this.aClass145_Sub1_21.method9807(Static32.aFloatArray5));
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		this.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
		this.aClass145_Sub1_21.method9813(Static45.aClass352_1, 1);
		this.aClass145_Sub1_21.method9829(2, true, Static150.aClass352_4, false);
		this.aClass145_Sub1_21.method9728(false);
		this.aClass145_Sub1_Sub2_1.method9864(this.anIDirect3DVertexShader1);
		this.method8002();
		this.method8008();
		this.method7999();
		this.method8000();
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)V")
	@Override
	public void method8000() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass145_Sub1_Sub2_1.anIDirect3DDevice1;
		if (this.aClass145_Sub1_21.anInt11261 <= 0) {
			local13.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(34) float local34 = this.aClass145_Sub1_21.aFloat183;
			@Pc(38) float local38 = this.aClass145_Sub1_21.aFloat192;
			@Pc(42) float local42 = local38 - 512.0F;
			local13.b(10, local42, 1.0F / (local38 - local42), local38, 1.0F / (local34 - local38));
		}
		this.aClass145_Sub1_21.method9769(this.aClass145_Sub1_21.anInt11257);
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(Z)V")
	@Override
	public void method8008() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass145_Sub1_Sub2_1.anIDirect3DDevice1;
		@Pc(20) Class86_Sub2 local20 = this.aClass145_Sub1_21.method9756();
		local20.method2725(Static32.aFloatArray5);
		Static32.aFloatArray5[3] *= 0.25F;
		Static32.aFloatArray5[1] *= 0.25F;
		Static32.aFloatArray5[6] *= 0.25F;
		Static32.aFloatArray5[5] *= 0.25F;
		Static32.aFloatArray5[0] *= 0.25F;
		Static32.aFloatArray5[7] *= 0.25F;
		Static32.aFloatArray5[4] *= 0.25F;
		Static32.aFloatArray5[2] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static32.aFloatArray5, 2);
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass145_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(15) Class86_Sub2 local15 = this.aClass145_Sub1_Sub2_1.method9741();
			local10.a(0, local15.method2714(Static32.aFloatArray5));
		}
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		this.aClass145_Sub1_Sub2_1.method9864((IDirect3DVertexShader) null);
		this.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
		this.aClass145_Sub1_21.method9813(Static150.aClass352_4, 1);
		this.aClass145_Sub1_21.method9813(Static45.aClass352_1, 2);
		this.aClass145_Sub1_21.method9728(true);
	}

	@OriginalMember(owner = "client!av", name = "e", descriptor = "(Z)V")
	@Override
	public void method8005() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass145_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(19) Class86_Sub2 local19 = this.aClass145_Sub1_Sub2_1.method9741();
			local14.a(0, local19.method2714(Static32.aFloatArray5));
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return this.anIDirect3DVertexShader1 != null;
	}
}
