import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class18_Sub4 extends Class18 {

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "Lclient!cka;")
	private final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_7;

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "Lclient!jga;")
	private final Class179 aClass179_6;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!cka;Lclient!wm;Lclient!jga;)V")
	public Class18_Sub4(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class179 arg2) {
		super(arg0);
		this.aClass65_Sub2_Sub1_7 = arg0;
		this.aClass179_6 = arg2;
		if (arg1 != null && this.aClass179_6.method4541() && (this.aClass65_Sub2_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass65_Sub2_Sub1_7.anIDirect3DDevice1.a(arg1.method8917("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
		this.aClass65_Sub2_23.method4432(Static512.aClass178_3, Static654.aClass178_5);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
	@Override
	public void method8998() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass65_Sub2_Sub1_7.anIDirect3DDevice1;
			local7.a(4, this.aClass65_Sub2_23.method4376(Static462.aFloatArray77));
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return this.anIDirect3DVertexShader2 != null;
	}

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "(I)V")
	@Override
	public void method9010() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass65_Sub2_Sub1_7.anIDirect3DDevice1;
		if (this.aClass65_Sub2_23.anInt5263 > 0) {
			@Pc(21) float local21 = this.aClass65_Sub2_23.aFloat97;
			@Pc(25) float local25 = this.aClass65_Sub2_23.aFloat102;
			@Pc(29) float local29 = local25 - 512.0F;
			local13.a(10, local29, 1.0F / (local25 - local29), local25, 1.0F / (local21 - local25));
		} else {
			local13.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass65_Sub2_23.method4455(this.aClass65_Sub2_23.anInt5246);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		this.aClass65_Sub2_Sub1_7.method1762((IDirect3DVertexShader) null);
		this.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
		this.aClass65_Sub2_23.method4400(Static235.aClass64_2, 1);
		this.aClass65_Sub2_23.method4400(Static413.aClass64_3, 2);
		this.aClass65_Sub2_23.method4462(true);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		this.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
		this.aClass65_Sub2_23.method4400(Static413.aClass64_3, 1);
		this.aClass65_Sub2_23.method4388(2, Static235.aClass64_2, false, true);
		this.aClass65_Sub2_23.method4462(false);
		this.aClass65_Sub2_Sub1_7.method1762(this.anIDirect3DVertexShader2);
		this.method8997();
		this.method9002();
		this.method8998();
		this.method9010();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	@Override
	public void method8999() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass65_Sub2_Sub1_7.anIDirect3DDevice1;
			@Pc(20) Class254_Sub2 local20 = this.aClass65_Sub2_Sub1_7.method4410();
			local15.a(0, local20.method6242(Static462.aFloatArray77));
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) IDirect3DDevice local10 = this.aClass65_Sub2_Sub1_7.anIDirect3DDevice1;
		if (this.aClass179_6.aBoolean463) {
			@Pc(51) float local51 = (float) (this.aClass65_Sub2_23.anInt5266 % 4000) / 4000.0F;
			this.aClass65_Sub2_23.method4426(this.aClass179_6.anInterface10_1);
			local10.a(11, local51, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass65_Sub2_23.anInt5266 % 4000 * 16 / 4000;
			this.aClass65_Sub2_23.method4426(this.aClass179_6.anInterface27Array1[local24]);
			local10.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	@Override
	public void method8997() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass65_Sub2_Sub1_7.anIDirect3DDevice1;
			@Pc(19) Class254_Sub2 local19 = this.aClass65_Sub2_Sub1_7.method4410();
			local14.a(0, local19.method6242(Static462.aFloatArray77));
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(B)V")
	@Override
	public void method9002() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass65_Sub2_Sub1_7.anIDirect3DDevice1;
		@Pc(12) Class254_Sub2 local12 = this.aClass65_Sub2_23.method4429();
		local12.method6223(Static462.aFloatArray77);
		Static462.aFloatArray77[6] *= 0.25F;
		Static462.aFloatArray77[7] *= 0.25F;
		Static462.aFloatArray77[5] *= 0.25F;
		Static462.aFloatArray77[0] *= 0.25F;
		Static462.aFloatArray77[3] *= 0.25F;
		Static462.aFloatArray77[2] *= 0.25F;
		Static462.aFloatArray77[1] *= 0.25F;
		Static462.aFloatArray77[4] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static462.aFloatArray77, 2);
	}
}
