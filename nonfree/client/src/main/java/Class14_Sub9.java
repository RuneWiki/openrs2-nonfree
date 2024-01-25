import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class14_Sub9 extends Class14 {

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!ki;")
	private final Class143_Sub1_Sub1 aClass143_Sub1_Sub1_7;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!lo;")
	private final Class224 aClass224_7;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!ki;Lclient!cb;Lclient!lo;)V")
	public Class14_Sub9(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class224 arg2) {
		super(arg0);
		this.aClass143_Sub1_Sub1_7 = arg0;
		this.aClass224_7 = arg2;
		if (arg1 != null && this.aClass224_7.method5207() && (this.aClass143_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass143_Sub1_Sub1_7.anIDirect3DDevice1.b(arg1.method892("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	@Override
	public void method8614() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass143_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class56_Sub2 local13 = this.aClass143_Sub1_Sub1_7.method6402();
			local8.a(0, local13.method6822(Static627.aFloatArray69));
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	@Override
	public void method8622() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass143_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class56_Sub2 local13 = this.aClass143_Sub1_Sub1_7.method6402();
			local6.a(0, local13.method6822(Static627.aFloatArray69));
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) IDirect3DDevice local11 = this.aClass143_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass224_7.aBoolean454) {
			@Pc(24) float local24 = (float) (this.aClass143_Sub1_22.anInt7410 % 4000) / 4000.0F;
			this.aClass143_Sub1_22.method6338(this.aClass224_7.anInterface21_1);
			local11.b(11, local24, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(50) int local50 = this.aClass143_Sub1_22.anInt7410 % 4000 * 16 / 4000;
			this.aClass143_Sub1_22.method6338(this.aClass224_7.anInterface12Array1[local50]);
			local11.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		this.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
		this.aClass143_Sub1_22.method6290(Static85.aClass90_1, 1);
		this.aClass143_Sub1_22.method6291(2, true, Static619.aClass90_3, false);
		this.aClass143_Sub1_22.method6396(false);
		this.aClass143_Sub1_Sub1_7.method4610(this.anIDirect3DVertexShader2);
		this.method8614();
		this.method8616();
		this.method8621();
		this.method8618();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	@Override
	public void method8616() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass143_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(12) Class56_Sub2 local12 = this.aClass143_Sub1_22.method6399();
		local12.method6830(Static627.aFloatArray69);
		Static627.aFloatArray69[7] *= 0.25F;
		Static627.aFloatArray69[5] *= 0.25F;
		Static627.aFloatArray69[0] *= 0.25F;
		Static627.aFloatArray69[1] *= 0.25F;
		Static627.aFloatArray69[3] *= 0.25F;
		Static627.aFloatArray69[4] *= 0.25F;
		Static627.aFloatArray69[2] *= 0.25F;
		Static627.aFloatArray69[6] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static627.aFloatArray69, 2);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
	@Override
	public void method8621() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass143_Sub1_Sub1_7.anIDirect3DDevice1;
			local11.a(4, this.aClass143_Sub1_22.method6394(Static627.aFloatArray69));
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		this.aClass143_Sub1_Sub1_7.method4610((IDirect3DVertexShader) null);
		this.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
		this.aClass143_Sub1_22.method6290(Static619.aClass90_3, 1);
		this.aClass143_Sub1_22.method6290(Static85.aClass90_1, 2);
		this.aClass143_Sub1_22.method6396(true);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	@Override
	public void method8618() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass143_Sub1_Sub1_7.anIDirect3DDevice1;
		if (this.aClass143_Sub1_22.anInt7407 <= 0) {
			local13.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(33) float local33 = this.aClass143_Sub1_22.aFloat134;
			@Pc(37) float local37 = this.aClass143_Sub1_22.aFloat130;
			@Pc(41) float local41 = local37 - 512.0F;
			local13.b(10, local41, 1.0F / (local37 - local41), local37, 1.0F / (local33 - local37));
		}
		this.aClass143_Sub1_22.method6293(this.aClass143_Sub1_22.anInt7399);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
		this.aClass143_Sub1_22.method6370(Static460.aClass6_3, Static346.aClass6_1);
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return this.anIDirect3DVertexShader2 != null;
	}
}
