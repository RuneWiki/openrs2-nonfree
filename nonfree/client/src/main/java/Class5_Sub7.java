import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!om", name = "t", descriptor = "Lclient!nca;")
	private final Class39_Sub2_Sub1 aClass39_Sub2_Sub1_6;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!ui;")
	private final Class284 aClass284_5;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!nca;Lclient!dda;Lclient!ui;)V")
	public Class5_Sub7(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class284 arg2) {
		super(arg0);
		this.aClass39_Sub2_Sub1_6 = arg0;
		this.aClass284_5 = arg2;
		if (this.aClass284_5.method7212() && (this.aClass39_Sub2_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1.a(arg1.method1596("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	@Override
	public void method7097() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1;
			local7.a(4, this.aClass39_Sub2_20.method6153(Static350.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass39_Sub2_20.method6192(0, Static132.aClass111_1);
		this.aClass39_Sub2_20.method6192(1, Static463.aClass111_4);
		this.aClass39_Sub2_20.method6192(2, Static254.aClass111_2);
		this.aClass39_Sub2_20.method6169(true);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
		this.aClass39_Sub2_20.method6093(Static72.aClass165_1, Static420.aClass165_4);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	@Override
	public void method7082() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1;
		if (this.aClass39_Sub2_20.anInt7277 > 0) {
			@Pc(18) float local18 = this.aClass39_Sub2_20.aFloat196;
			@Pc(22) float local22 = this.aClass39_Sub2_20.aFloat202;
			@Pc(26) float local26 = local22 - 512.0F;
			local10.a(10, local26, 1.0F / (local22 - local26), local22, 1.0F / (local18 - local22));
		} else {
			local10.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass39_Sub2_20.method6203(this.aClass39_Sub2_20.anInt7301);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1;
		if (this.aClass284_5.aBoolean618) {
			@Pc(44) float local44 = (float) (this.aClass39_Sub2_20.anInt7297 % 4000) / 4000.0F;
			this.aClass39_Sub2_20.method6179(this.aClass284_5.anInterface15_1);
			local3.a(11, local44, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(17) int local17 = this.aClass39_Sub2_20.anInt7297 % 4000 * 16 / 4000;
			this.aClass39_Sub2_20.method6179(this.aClass284_5.anInterface8Array2[local17]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	@Override
	public void method7086() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1;
		@Pc(21) Class181_Sub2 local21 = this.aClass39_Sub2_20.method6116();
		local21.method5398(Static350.aFloatArray49);
		Static350.aFloatArray49[7] *= 0.25F;
		Static350.aFloatArray49[4] *= 0.25F;
		Static350.aFloatArray49[6] *= 0.25F;
		Static350.aFloatArray49[3] *= 0.25F;
		Static350.aFloatArray49[1] *= 0.25F;
		Static350.aFloatArray49[2] *= 0.25F;
		Static350.aFloatArray49[5] *= 0.25F;
		Static350.aFloatArray49[0] *= 0.25F;
		local14.SetVertexShaderConstantF(8, Static350.aFloatArray49, 2);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass39_Sub2_20.method6192(0, Static132.aClass111_1);
		this.aClass39_Sub2_20.method6192(1, Static254.aClass111_2);
		this.aClass39_Sub2_20.method6119(Static463.aClass111_4, true, 2, false);
		this.aClass39_Sub2_20.method6169(false);
		this.method7095();
		this.method7086();
		this.method7097();
		this.method7082();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
	@Override
	public void method7088() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(13) Class181_Sub2 local13 = this.aClass39_Sub2_Sub1_6.method6161();
			local8.a(0, local13.method5404(Static350.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	@Override
	public void method7095() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass39_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(11) Class181_Sub2 local11 = this.aClass39_Sub2_Sub1_6.method6161();
			local6.a(0, local11.method5404(Static350.aFloatArray49));
		}
	}
}
