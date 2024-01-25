import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class74_Sub8 extends Class74 {

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!wv;")
	private final Class378 aClass378_7;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "Lclient!lt;")
	private final Class87_Sub1_Sub2 aClass87_Sub1_Sub2_5;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!lt;Lclient!eq;Lclient!wv;)V")
	public Class74_Sub8(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class378 arg2) {
		super(arg0);
		this.aClass378_7 = arg2;
		this.aClass87_Sub1_Sub2_5 = arg0;
		if (arg1 != null && this.aClass378_7.method8579() && (this.aClass87_Sub1_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader8 = this.aClass87_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method2567("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	@Override
	public void method8242() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass87_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass87_Sub1_22.anInt6122 <= 0) {
			local12.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(32) float local32 = this.aClass87_Sub1_22.aFloat145;
			@Pc(36) float local36 = this.aClass87_Sub1_22.aFloat143;
			@Pc(40) float local40 = local36 - 512.0F;
			local12.a(10, local40, 1.0F / (local36 - local40), local36, 1.0F / (local32 - local36));
		}
		this.aClass87_Sub1_22.method5075(this.aClass87_Sub1_22.anInt6149);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		this.aClass87_Sub1_Sub2_5.method5157(null);
		this.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
		this.aClass87_Sub1_22.method5131(1, Static572.aClass315_4);
		this.aClass87_Sub1_22.method5131(2, Static358.aClass315_1);
		this.aClass87_Sub1_22.method5111(true);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return this.anIDirect3DVertexShader8 != null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
		this.aClass87_Sub1_22.method5133(Static591.aClass300_5, Static215.aClass300_4);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	@Override
	public void method8247() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass87_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(18) Class6_Sub2 local18 = this.aClass87_Sub1_Sub2_5.method5100();
			local13.a(0, local18.method2701(Static359.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass87_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass378_7.aBoolean758) {
			@Pc(16) float local16 = (float) (this.aClass87_Sub1_22.anInt6123 % 4000) / 4000.0F;
			this.aClass87_Sub1_22.method5079(this.aClass378_7.anInterface11_1);
			local3.a(11, local16, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(44) int local44 = this.aClass87_Sub1_22.anInt6123 % 4000 * 16 / 4000;
			this.aClass87_Sub1_22.method5079(this.aClass378_7.anInterface26Array1[local44]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "(I)V")
	@Override
	public void method8255() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass87_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(18) Class6_Sub2 local18 = this.aClass87_Sub1_Sub2_5.method5100();
			local13.a(0, local18.method2701(Static359.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
	@Override
	public void method8254() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass87_Sub1_Sub2_5.anIDirect3DDevice1;
			local8.a(4, this.aClass87_Sub1_22.method5038(Static359.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		this.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
		this.aClass87_Sub1_22.method5131(1, Static358.aClass315_1);
		this.aClass87_Sub1_22.method5052(true, false, 2, Static572.aClass315_4);
		this.aClass87_Sub1_22.method5111(false);
		this.aClass87_Sub1_Sub2_5.method5157(this.anIDirect3DVertexShader8);
		this.method8255();
		this.method8246();
		this.method8254();
		this.method8242();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	@Override
	public void method8246() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass87_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(12) Class6_Sub2 local12 = this.aClass87_Sub1_22.method5063();
		local12.method2722(Static359.aFloatArray54);
		Static359.aFloatArray54[3] *= 0.25F;
		Static359.aFloatArray54[6] *= 0.25F;
		Static359.aFloatArray54[1] *= 0.25F;
		Static359.aFloatArray54[0] *= 0.25F;
		Static359.aFloatArray54[4] *= 0.25F;
		Static359.aFloatArray54[5] *= 0.25F;
		Static359.aFloatArray54[7] *= 0.25F;
		Static359.aFloatArray54[2] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static359.aFloatArray54, 2);
	}
}
