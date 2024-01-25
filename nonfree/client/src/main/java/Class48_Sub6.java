import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class48_Sub6 extends Class48 {

	@OriginalMember(owner = "client!kfa", name = "p", descriptor = "Lclient!er;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_5;

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "Lclient!b;")
	private final Class24 aClass24_5;

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!er;Lclient!gda;Lclient!b;)V")
	public Class48_Sub6(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class24 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub1_5 = arg0;
		this.aClass24_5 = arg2;
		if (arg1 != null && this.aClass24_5.method393() && (this.aClass100_Sub1_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method3073("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
	@Override
	public void method8943() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(14) Class10_Sub2 local14 = this.aClass100_Sub1_Sub1_5.method7927();
			local9.a(0, local14.method1690(Static297.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		this.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
		this.aClass100_Sub1_23.method7970(Static520.aClass93_4, 1);
		this.aClass100_Sub1_23.method7883(false, Static89.aClass93_1, true, 2);
		this.aClass100_Sub1_23.method7887(false);
		this.aClass100_Sub1_Sub1_5.method2537(this.anIDirect3DVertexShader2);
		this.method8939();
		this.method8944();
		this.method8936();
		this.method8937();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
		this.aClass100_Sub1_23.method7904(Static618.aClass94_4, Static280.aClass94_2);
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return this.anIDirect3DVertexShader2 != null;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
	@Override
	public void method8937() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(18) IDirect3DDevice local18 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
		if (this.aClass100_Sub1_23.anInt9255 > 0) {
			@Pc(29) float local29 = this.aClass100_Sub1_23.aFloat170;
			@Pc(33) float local33 = this.aClass100_Sub1_23.aFloat176;
			@Pc(37) float local37 = local33 - 512.0F;
			local18.a(10, local37, 1.0F / (local33 - local37), local33, 1.0F / (local29 - local33));
		} else {
			local18.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass100_Sub1_23.method7873(this.aClass100_Sub1_23.anInt9236);
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)V")
	@Override
	public void method8944() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(9) IDirect3DDevice local9 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
		@Pc(14) Class10_Sub2 local14 = this.aClass100_Sub1_23.method7862();
		local14.method1703(Static297.aFloatArray45);
		Static297.aFloatArray45[4] *= 0.25F;
		Static297.aFloatArray45[1] *= 0.25F;
		Static297.aFloatArray45[7] *= 0.25F;
		Static297.aFloatArray45[6] *= 0.25F;
		Static297.aFloatArray45[0] *= 0.25F;
		Static297.aFloatArray45[5] *= 0.25F;
		Static297.aFloatArray45[3] *= 0.25F;
		Static297.aFloatArray45[2] *= 0.25F;
		local9.SetVertexShaderConstantF(8, Static297.aFloatArray45, 2);
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
	@Override
	public void method8939() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(17) Class10_Sub2 local17 = this.aClass100_Sub1_Sub1_5.method7927();
			local12.a(0, local17.method1690(Static297.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8936() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
			local9.a(4, this.aClass100_Sub1_23.method7965(Static297.aFloatArray45));
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		this.aClass100_Sub1_Sub1_5.method2537((IDirect3DVertexShader) null);
		this.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
		this.aClass100_Sub1_23.method7970(Static89.aClass93_1, 1);
		this.aClass100_Sub1_23.method7970(Static520.aClass93_4, 2);
		this.aClass100_Sub1_23.method7887(true);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1;
		if (this.aClass24_5.aBoolean19) {
			@Pc(25) float local25 = (float) (this.aClass100_Sub1_23.anInt9259 % 4000) / 4000.0F;
			this.aClass100_Sub1_23.method7923(this.aClass24_5.anInterface14_2);
			local12.a(11, local25, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(51) int local51 = this.aClass100_Sub1_23.anInt9259 % 4000 * 16 / 4000;
			this.aClass100_Sub1_23.method7923(this.aClass24_5.anInterface2Array1[local51]);
			local12.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}
}
