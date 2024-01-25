import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class11_Sub8 extends Class11 {

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!hl;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_6;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Lclient!wt;")
	private final Class376 aClass376_6;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!hl;Lclient!oh;Lclient!wt;)V")
	public Class11_Sub8(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class376 arg2) {
		super(arg0);
		this.aClass16_Sub1_Sub2_6 = arg0;
		this.aClass376_6 = arg2;
		if (arg1 != null && this.aClass376_6.method8618() && (this.aClass16_Sub1_Sub2_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass16_Sub1_Sub2_6.anIDirect3DDevice1.a(arg1.method6304("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	@Override
	public void method7362() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub2_6.anIDirect3DDevice1;
			local7.a(4, this.aClass16_Sub1_21.method3944(Static397.aFloatArray69));
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return this.anIDirect3DVertexShader3 != null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
		this.aClass16_Sub1_21.method3924(Static125.aClass34_3, Static584.aClass34_6);
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	@Override
	public void method7358() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(12) Class54_Sub3 local12 = this.aClass16_Sub1_Sub2_6.method3885();
			local7.a(0, local12.method5152(Static397.aFloatArray69));
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		this.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
		this.aClass16_Sub1_21.method3946(1, Static190.aClass265_8);
		this.aClass16_Sub1_21.method4000(true, false, 2, Static303.aClass265_5);
		this.aClass16_Sub1_21.method3969(false);
		this.aClass16_Sub1_Sub2_6.method4008(this.anIDirect3DVertexShader3);
		this.method7358();
		this.method7365();
		this.method7362();
		this.method7363();
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
	@Override
	public void method7365() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass16_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(18) Class54_Sub3 local18 = this.aClass16_Sub1_21.method3940();
		local18.method5157(Static397.aFloatArray69);
		Static397.aFloatArray69[2] *= 0.25F;
		Static397.aFloatArray69[5] *= 0.25F;
		Static397.aFloatArray69[3] *= 0.25F;
		Static397.aFloatArray69[6] *= 0.25F;
		Static397.aFloatArray69[0] *= 0.25F;
		Static397.aFloatArray69[1] *= 0.25F;
		Static397.aFloatArray69[4] *= 0.25F;
		Static397.aFloatArray69[7] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static397.aFloatArray69, 2);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		this.aClass16_Sub1_Sub2_6.method4008(null);
		this.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
		this.aClass16_Sub1_21.method3946(1, Static303.aClass265_5);
		this.aClass16_Sub1_21.method3946(2, Static190.aClass265_8);
		this.aClass16_Sub1_21.method3969(true);
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(B)V")
	@Override
	public void method7366() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(12) Class54_Sub3 local12 = this.aClass16_Sub1_Sub2_6.method3885();
			local7.a(0, local12.method5152(Static397.aFloatArray69));
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass16_Sub1_Sub2_6.anIDirect3DDevice1;
		if (this.aClass376_6.aBoolean762) {
			@Pc(48) float local48 = (float) (this.aClass16_Sub1_21.anInt4932 % 4000) / 4000.0F;
			this.aClass16_Sub1_21.method3889(this.aClass376_6.anInterface1_2);
			local3.a(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass16_Sub1_21.anInt4932 % 4000 * 16 / 4000;
			this.aClass16_Sub1_21.method3889(this.aClass376_6.anInterface20Array1[local21]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
	@Override
	public void method7363() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass16_Sub1_Sub2_6.anIDirect3DDevice1;
		if (this.aClass16_Sub1_21.anInt4903 > 0) {
			@Pc(16) float local16 = this.aClass16_Sub1_21.aFloat88;
			@Pc(20) float local20 = this.aClass16_Sub1_21.aFloat96;
			@Pc(24) float local24 = local20 - 512.0F;
			local8.a(10, local24, 1.0F / (local20 - local24), local20, 1.0F / (local16 - local20));
		} else {
			local8.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass16_Sub1_21.method3939(this.aClass16_Sub1_21.anInt4915);
	}
}
