import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!lj;")
	private final Class101_Sub1_Sub2 aClass101_Sub1_Sub2_5;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!nc;")
	private final Class242 aClass242_6;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!lj;Lclient!gga;Lclient!nc;)V")
	public Class13_Sub6(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass101_Sub1_Sub2_5 = arg0;
		this.aClass242_6 = arg2;
		if (arg1 != null && this.aClass242_6.method6564() && (this.aClass101_Sub1_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass101_Sub1_Sub2_5.anIDirect3DDevice1.a(arg1.method3639("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	@Override
	public void method8487() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass101_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(17) Class76_Sub2 local17 = this.aClass101_Sub1_Sub2_5.method5958();
			local10.a(0, local17.method7330(Static246.aFloatArray25));
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) IDirect3DDevice local10 = this.aClass101_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass242_6.aBoolean552) {
			@Pc(23) float local23 = (float) (this.aClass101_Sub1_22.anInt6645 % 4000) / 4000.0F;
			this.aClass101_Sub1_22.method5909(this.aClass242_6.anInterface13_2);
			local10.a(11, local23, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(51) int local51 = this.aClass101_Sub1_22.anInt6645 % 4000 * 16 / 4000;
			this.aClass101_Sub1_22.method5909(this.aClass242_6.anInterface10Array1[local51]);
			local10.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass101_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(19) Class76_Sub2 local19 = this.aClass101_Sub1_Sub2_5.method5958();
			local14.a(0, local19.method7330(Static246.aFloatArray25));
		}
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
	@Override
	public void method8499() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(11) IDirect3DDevice local11 = this.aClass101_Sub1_Sub2_5.anIDirect3DDevice1;
		if (this.aClass101_Sub1_22.anInt6650 > 0) {
			@Pc(19) float local19 = this.aClass101_Sub1_22.aFloat149;
			@Pc(23) float local23 = this.aClass101_Sub1_22.aFloat158;
			@Pc(27) float local27 = local23 - 512.0F;
			local11.a(10, local27, 1.0F / (local23 - local27), local23, 1.0F / (local19 - local23));
		} else {
			local11.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass101_Sub1_22.method5933(this.aClass101_Sub1_22.anInt6649);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	@Override
	public void method8496() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass101_Sub1_Sub2_5.anIDirect3DDevice1;
			local15.a(4, this.aClass101_Sub1_22.method5950(Static246.aFloatArray25));
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
		this.aClass101_Sub1_22.method5891(Static98.aClass381_1, Static238.aClass381_4);
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	@Override
	public void method8493() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass101_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(19) Class76_Sub2 local19 = this.aClass101_Sub1_22.method5936();
		local19.method7329(Static246.aFloatArray25);
		Static246.aFloatArray25[2] *= 0.25F;
		Static246.aFloatArray25[7] *= 0.25F;
		Static246.aFloatArray25[6] *= 0.25F;
		Static246.aFloatArray25[5] *= 0.25F;
		Static246.aFloatArray25[3] *= 0.25F;
		Static246.aFloatArray25[0] *= 0.25F;
		Static246.aFloatArray25[4] *= 0.25F;
		Static246.aFloatArray25[1] *= 0.25F;
		local14.SetVertexShaderConstantF(8, Static246.aFloatArray25, 2);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		this.aClass101_Sub1_Sub2_5.method5967((IDirect3DVertexShader) null);
		this.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
		this.aClass101_Sub1_22.method5954(1, Static312.aClass118_3);
		this.aClass101_Sub1_22.method5954(2, Static660.aClass118_5);
		this.aClass101_Sub1_22.method5894(true);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		this.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
		this.aClass101_Sub1_22.method5954(1, Static660.aClass118_5);
		this.aClass101_Sub1_22.method5922(2, true, false, Static312.aClass118_3);
		this.aClass101_Sub1_22.method5894(false);
		this.aClass101_Sub1_Sub2_5.method5967(this.anIDirect3DVertexShader1);
		this.method8492();
		this.method8493();
		this.method8496();
		this.method8499();
	}
}
