import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Lclient!uda;")
	private final Class95_Sub1_Sub2 aClass95_Sub1_Sub2_5;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Lclient!gaa;")
	private final Class123 aClass123_4;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!uda;Lclient!uq;Lclient!gaa;)V")
	public Class4_Sub8(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class123 arg2) {
		super(arg0);
		this.aClass95_Sub1_Sub2_5 = arg0;
		this.aClass123_4 = arg2;
		if (arg1 != null && this.aClass123_4.method2906() && (this.aClass95_Sub1_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass95_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method8369("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) IDirect3DDevice local9 = this.aClass95_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass123_4.aBoolean250) {
			@Pc(22) float local22 = (float) (this.aClass95_Sub1_23.anInt10064 % 4000) / 4000.0F;
			this.aClass95_Sub1_23.method8147(this.aClass123_4.anInterface20_1);
			local9.a(11, local22, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(48) int local48 = this.aClass95_Sub1_23.anInt10064 % 4000 * 16 / 4000;
			this.aClass95_Sub1_23.method8147(this.aClass123_4.anInterface8Array1[local48]);
			local9.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	@Override
	public void method8485() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass95_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(18) Class17_Sub2 local18 = this.aClass95_Sub1_23.method8102();
		local18.method5852(Static314.aFloatArray32);
		Static314.aFloatArray32[6] *= 0.25F;
		Static314.aFloatArray32[1] *= 0.25F;
		Static314.aFloatArray32[2] *= 0.25F;
		Static314.aFloatArray32[4] *= 0.25F;
		Static314.aFloatArray32[7] *= 0.25F;
		Static314.aFloatArray32[0] *= 0.25F;
		Static314.aFloatArray32[3] *= 0.25F;
		Static314.aFloatArray32[5] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static314.aFloatArray32, 2);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
		this.aClass95_Sub1_23.method8195(Static461.aClass112_52, Static315.aClass112_22);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		this.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
		this.aClass95_Sub1_23.method8108(1, Static576.aClass235_3);
		this.aClass95_Sub1_23.method8101(2, true, Static189.aClass235_1, false);
		this.aClass95_Sub1_23.method8087(false);
		this.aClass95_Sub1_Sub2_5.method8217(this.anIDirect3DVertexShader6);
		this.method8489();
		this.method8485();
		this.method8492();
		this.method8486();
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		this.aClass95_Sub1_Sub2_5.method8217((IDirect3DVertexShader) null);
		this.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
		this.aClass95_Sub1_23.method8108(1, Static189.aClass235_1);
		this.aClass95_Sub1_23.method8108(2, Static576.aClass235_3);
		this.aClass95_Sub1_23.method8087(true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass95_Sub1_Sub2_5.anIDirect3DDevice1;
			local13.a(4, this.aClass95_Sub1_23.method8193(Static314.aFloatArray32));
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	@Override
	public void method8480() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass95_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(12) Class17_Sub2 local12 = this.aClass95_Sub1_Sub2_5.method8081();
			local7.a(0, local12.method5854(Static314.aFloatArray32));
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	@Override
	public void method8486() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass95_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass95_Sub1_23.anInt10049 > 0) {
			@Pc(21) float local21 = this.aClass95_Sub1_23.aFloat189;
			@Pc(25) float local25 = this.aClass95_Sub1_23.aFloat195;
			@Pc(29) float local29 = local25 - 512.0F;
			local12.a(10, local29, 1.0F / (local25 - local29), local25, 1.0F / (local21 - local25));
		} else {
			local12.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass95_Sub1_23.method8078(this.aClass95_Sub1_23.anInt10029);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	@Override
	public void method8489() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass95_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(20) Class17_Sub2 local20 = this.aClass95_Sub1_Sub2_5.method8081();
			local15.a(0, local20.method5854(Static314.aFloatArray32));
		}
	}
}
