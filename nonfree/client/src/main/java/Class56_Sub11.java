import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class56_Sub11 extends Class56 {

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "Lclient!gaa;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_9;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "Lclient!bd;")
	private final Class31 aClass31_8;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!gaa;Lclient!pl;Lclient!bd;)V")
	public Class56_Sub11(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class31 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub1_9 = arg0;
		this.aClass31_8 = arg2;
		if (arg1 != null && this.aClass31_8.method545() && (this.aClass100_Sub1_Sub1_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader7 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1.a(arg1.method5965("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader7 = null;
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)V")
	@Override
	public void method7181() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
		@Pc(20) Class68_Sub2 local20 = this.aClass100_Sub1_23.method4792();
		local20.method5101(Static519.aFloatArray66);
		Static519.aFloatArray66[7] *= 0.25F;
		Static519.aFloatArray66[0] *= 0.25F;
		Static519.aFloatArray66[2] *= 0.25F;
		Static519.aFloatArray66[4] *= 0.25F;
		Static519.aFloatArray66[3] *= 0.25F;
		Static519.aFloatArray66[1] *= 0.25F;
		Static519.aFloatArray66[5] *= 0.25F;
		Static519.aFloatArray66[6] *= 0.25F;
		local15.SetVertexShaderConstantF(8, Static519.aFloatArray66, 2);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
		this.aClass100_Sub1_23.method4797(Static583.aClass236_5, Static202.aClass236_1);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
		if (this.aClass31_8.aBoolean40) {
			@Pc(53) float local53 = (float) (this.aClass100_Sub1_23.anInt5768 % 4000) / 4000.0F;
			this.aClass100_Sub1_23.method4876(this.aClass31_8.anInterface6_1);
			local3.a(11, local53, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(24) int local24 = this.aClass100_Sub1_23.anInt5768 % 4000 * 16 / 4000;
			this.aClass100_Sub1_23.method4876(this.aClass31_8.anInterface14Array2[local24]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	@Override
	public void method7176() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(13) Class68_Sub2 local13 = this.aClass100_Sub1_Sub1_9.method4842();
			local8.a(0, local13.method5119(Static519.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
		this.aClass100_Sub1_23.method4883(1, Static113.aClass119_11);
		this.aClass100_Sub1_23.method4883(2, Static224.aClass119_18);
		this.aClass100_Sub1_23.method4765(true);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
	@Override
	public void method7175() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
			@Pc(17) Class68_Sub2 local17 = this.aClass100_Sub1_Sub1_9.method4842();
			local12.a(0, local17.method5119(Static519.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
			local14.a(4, this.aClass100_Sub1_23.method4809(Static519.aFloatArray66));
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return this.anIDirect3DVertexShader7 != null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader7);
		this.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
		this.aClass100_Sub1_23.method4883(1, Static224.aClass119_18);
		this.aClass100_Sub1_23.method4875(true, Static113.aClass119_11, 2, false);
		this.aClass100_Sub1_23.method4765(false);
		this.method7175();
		this.method7181();
		this.method7179();
		this.method7177();
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	@Override
	public void method7177() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1;
		if (this.aClass100_Sub1_23.anInt5789 <= 0) {
			local7.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass100_Sub1_23.bf;
			@Pc(31) float local31 = this.aClass100_Sub1_23.aFloat151;
			@Pc(35) float local35 = local31 - 512.0F;
			local7.a(10, local35, 1.0F / (local31 - local35), local31, 1.0F / (local27 - local31));
		}
		this.aClass100_Sub1_23.method4877(this.aClass100_Sub1_23.anInt5779);
	}
}
