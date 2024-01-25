import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!vt;")
	private final Class348 aClass348_5;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Lclient!kaa;")
	private final Class44_Sub2_Sub2 aClass44_Sub2_Sub2_5;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!kaa;Lclient!jn;Lclient!vt;)V")
	public Class38_Sub3(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class348 arg2) {
		super(arg0);
		this.aClass348_5 = arg2;
		this.aClass44_Sub2_Sub2_5 = arg0;
		if (arg1 != null && this.aClass348_5.method8144() && (this.aClass44_Sub2_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1.b(arg1.method3972("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
		this.aClass44_Sub2_21.method4241(1, Static447.aClass328_3);
		this.aClass44_Sub2_21.method4258(false, 2, Static233.aClass328_1, true);
		this.aClass44_Sub2_21.method4279(false);
		this.method7442();
		this.method7441();
		this.method7438();
		this.method7429();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1;
		if (this.aClass348_5.aBoolean705) {
			@Pc(48) float local48 = (float) (this.aClass44_Sub2_21.anInt4957 % 4000) / 4000.0F;
			this.aClass44_Sub2_21.method4265(this.aClass348_5.anInterface4_2);
			local7.b(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass44_Sub2_21.anInt4957 % 4000 * 16 / 4000;
			this.aClass44_Sub2_21.method4265(this.aClass348_5.anInterface6Array2[local21]);
			local7.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	@Override
	public void method7441() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1;
		@Pc(12) Class8_Sub3 local12 = this.aClass44_Sub2_21.method4254();
		local12.method1561(Static304.aFloatArray48);
		Static304.aFloatArray48[1] *= 0.25F;
		Static304.aFloatArray48[2] *= 0.25F;
		Static304.aFloatArray48[5] *= 0.25F;
		Static304.aFloatArray48[6] *= 0.25F;
		Static304.aFloatArray48[7] *= 0.25F;
		Static304.aFloatArray48[3] *= 0.25F;
		Static304.aFloatArray48[4] *= 0.25F;
		Static304.aFloatArray48[0] *= 0.25F;
		local7.SetVertexShaderConstantF(8, Static304.aFloatArray48, 2);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method7429() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1;
		if (this.aClass44_Sub2_21.anInt4943 > 0) {
			@Pc(22) float local22 = this.aClass44_Sub2_21.aFloat149;
			@Pc(26) float local26 = this.aClass44_Sub2_21.aFloat152;
			@Pc(30) float local30 = local26 - 512.0F;
			local14.b(10, local30, 1.0F / (local26 - local30), local26, 1.0F / (local22 - local26));
		} else {
			local14.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass44_Sub2_21.method4285(this.aClass44_Sub2_21.anInt4950);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
	@Override
	public void method7443() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1;
			@Pc(19) Class8_Sub3 local19 = this.aClass44_Sub2_Sub2_5.method4322();
			local14.a(0, local19.method1573(Static304.aFloatArray48));
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
		this.aClass44_Sub2_21.method4241(1, Static233.aClass328_1);
		this.aClass44_Sub2_21.method4241(2, Static447.aClass328_3);
		this.aClass44_Sub2_21.method4279(true);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
		this.aClass44_Sub2_21.method4243(Static341.aClass117_4, Static435.aClass117_8);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V")
	@Override
	public void method7442() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1;
			@Pc(16) Class8_Sub3 local16 = this.aClass44_Sub2_Sub2_5.method4322();
			local11.a(0, local16.method1573(Static304.aFloatArray48));
		}
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
	@Override
	public void method7438() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_5.anIDirect3DDevice1;
			local7.a(4, this.aClass44_Sub2_21.method4342(Static304.aFloatArray48));
		}
	}
}
