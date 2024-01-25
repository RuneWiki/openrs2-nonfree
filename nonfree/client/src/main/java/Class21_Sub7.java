import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class21_Sub7 extends Class21 {

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!paa;")
	private final Class236 aClass236_6;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!bv;")
	private final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_5;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!bv;Lclient!an;Lclient!paa;)V")
	public Class21_Sub7(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class236 arg2) {
		super(arg0);
		this.aClass236_6 = arg2;
		this.aClass42_Sub1_Sub1_5 = arg0;
		if (this.aClass236_6.method5705() && (this.aClass42_Sub1_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method396("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass42_Sub1_19.method5951(Static159.aClass302_1, 0);
		this.aClass42_Sub1_19.method5951(Static388.aClass302_3, 1);
		this.aClass42_Sub1_19.method5951(Static371.aClass302_2, 2);
		this.aClass42_Sub1_19.method5931(true);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1;
		if (this.aClass42_Sub1_19.anInt7104 > 0) {
			@Pc(24) float local24 = this.aClass42_Sub1_19.aFloat162;
			@Pc(28) float local28 = this.aClass42_Sub1_19.aFloat166;
			@Pc(32) float local32 = local28 - 512.0F;
			local15.a(10, local32, 1.0F / (local28 - local32), local28, 1.0F / (local24 - local28));
		} else {
			local15.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass42_Sub1_19.method5935(this.aClass42_Sub1_19.anInt7132);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	@Override
	public void method7555() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1;
			local11.a(4, this.aClass42_Sub1_19.method5891(Static442.aFloatArray67));
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	@Override
	public void method7546() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(11) Class91_Sub2 local11 = this.aClass42_Sub1_Sub1_5.method5916();
			local6.a(0, local11.method5501(Static442.aFloatArray67));
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	@Override
	public void method7545() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(13) Class91_Sub2 local13 = this.aClass42_Sub1_Sub1_5.method5916();
			local8.a(0, local13.method5501(Static442.aFloatArray67));
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
		this.aClass42_Sub1_19.method5945(Static88.aClass129_1, Static159.aClass129_2);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	@Override
	public void method7554() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1;
		@Pc(12) Class91_Sub2 local12 = this.aClass42_Sub1_19.method5975();
		local12.method5502(Static442.aFloatArray67);
		Static442.aFloatArray67[4] *= 0.25F;
		Static442.aFloatArray67[7] *= 0.25F;
		Static442.aFloatArray67[5] *= 0.25F;
		Static442.aFloatArray67[0] *= 0.25F;
		Static442.aFloatArray67[6] *= 0.25F;
		Static442.aFloatArray67[3] *= 0.25F;
		Static442.aFloatArray67[1] *= 0.25F;
		Static442.aFloatArray67[2] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static442.aFloatArray67, 2);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1;
		if (this.aClass236_6.aBoolean493) {
			@Pc(24) float local24 = (float) (this.aClass42_Sub1_19.anInt7105 % 4000) / 4000.0F;
			this.aClass42_Sub1_19.method5868(this.aClass236_6.anInterface17_1);
			local3.a(11, local24, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(50) int local50 = this.aClass42_Sub1_19.anInt7105 % 4000 * 16 / 4000;
			this.aClass42_Sub1_19.method5868(this.aClass236_6.anInterface20Array1[local50]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		this.aClass42_Sub1_Sub1_5.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass42_Sub1_19.method5951(Static159.aClass302_1, 0);
		this.aClass42_Sub1_19.method5951(Static371.aClass302_2, 1);
		this.aClass42_Sub1_19.method5983(false, true, 2, Static388.aClass302_3);
		this.aClass42_Sub1_19.method5931(false);
		this.method7546();
		this.method7554();
		this.method7555();
		this.method7551();
	}
}
