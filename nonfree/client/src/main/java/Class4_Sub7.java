import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Lclient!rja;")
	private final Class13_Sub1_Sub2 aClass13_Sub1_Sub2_6;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Lclient!lja;")
	private final Class202 aClass202_4;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!rja;Lclient!aj;Lclient!lja;)V")
	public Class4_Sub7(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class202 arg2) {
		super(arg0);
		this.aClass13_Sub1_Sub2_6 = arg0;
		this.aClass202_4 = arg2;
		if (arg1 != null && this.aClass202_4.method5174() && (this.aClass13_Sub1_Sub2_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass13_Sub1_Sub2_6.anIDirect3DDevice1.b(arg1.method533("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
		this.aClass13_Sub1_23.method7521(Static191.aClass203_2, Static582.aClass203_5);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) IDirect3DDevice local10 = this.aClass13_Sub1_Sub2_6.anIDirect3DDevice1;
		if (this.aClass202_4.aBoolean412) {
			@Pc(51) float local51 = (float) (this.aClass13_Sub1_23.anInt8613 % 4000) / 4000.0F;
			this.aClass13_Sub1_23.method7530(this.aClass202_4.anInterface21_2);
			local10.b(11, local51, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass13_Sub1_23.anInt8613 % 4000 * 16 / 4000;
			this.aClass13_Sub1_23.method7530(this.aClass202_4.anInterface7Array2[local24]);
			local10.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public void method7855() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass13_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(20) Class239_Sub3 local20 = this.aClass13_Sub1_Sub2_6.method7431();
			local15.a(0, local20.method9263(Static435.aFloatArray50));
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		this.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
		this.aClass13_Sub1_23.method7522(Static125.aClass326_1, 1);
		this.aClass13_Sub1_23.method7498(false, true, 2, Static206.aClass326_3);
		this.aClass13_Sub1_23.method7484(false);
		this.aClass13_Sub1_Sub2_6.method7545(this.anIDirect3DVertexShader6);
		this.method7855();
		this.method7851();
		this.method7857();
		this.method7853();
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V")
	@Override
	public void method7853() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass13_Sub1_Sub2_6.anIDirect3DDevice1;
		if (this.aClass13_Sub1_23.anInt8627 > 0) {
			@Pc(16) float local16 = this.aClass13_Sub1_23.aFloat175;
			@Pc(20) float local20 = this.aClass13_Sub1_23.aFloat174;
			@Pc(24) float local24 = local20 - 512.0F;
			local8.b(10, local24, 1.0F / (local20 - local24), local20, 1.0F / (local16 - local20));
		} else {
			local8.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass13_Sub1_23.method7539(this.aClass13_Sub1_23.anInt8598);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
	@Override
	public void method7851() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass13_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(19) Class239_Sub3 local19 = this.aClass13_Sub1_23.method7420();
		local19.method9264(Static435.aFloatArray50);
		Static435.aFloatArray50[7] *= 0.25F;
		Static435.aFloatArray50[6] *= 0.25F;
		Static435.aFloatArray50[5] *= 0.25F;
		Static435.aFloatArray50[0] *= 0.25F;
		Static435.aFloatArray50[2] *= 0.25F;
		Static435.aFloatArray50[4] *= 0.25F;
		Static435.aFloatArray50[3] *= 0.25F;
		Static435.aFloatArray50[1] *= 0.25F;
		local14.SetVertexShaderConstantF(8, Static435.aFloatArray50, 2);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	@Override
	public void method7847() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass13_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(20) Class239_Sub3 local20 = this.aClass13_Sub1_Sub2_6.method7431();
			local15.a(0, local20.method9263(Static435.aFloatArray50));
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	@Override
	public void method7857() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass13_Sub1_Sub2_6.anIDirect3DDevice1;
			local6.a(4, this.aClass13_Sub1_23.method7411(Static435.aFloatArray50));
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		this.aClass13_Sub1_Sub2_6.method7545((IDirect3DVertexShader) null);
		this.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
		this.aClass13_Sub1_23.method7522(Static206.aClass326_3, 1);
		this.aClass13_Sub1_23.method7522(Static125.aClass326_1, 2);
		this.aClass13_Sub1_23.method7484(true);
	}
}
