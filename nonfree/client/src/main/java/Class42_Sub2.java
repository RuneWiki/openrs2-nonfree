import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "Lclient!hv;")
	private final Class122_Sub2_Sub1 aClass122_Sub2_Sub1_3;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "Lclient!pv;")
	private final Class241 aClass241_1;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!hv;Lclient!kr;Lclient!pv;)V")
	public Class42_Sub2(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class241 arg2) {
		super(arg0);
		this.aClass122_Sub2_Sub1_3 = arg0;
		this.aClass241_1 = arg2;
		if (this.aClass241_1.method5765() && (this.aClass122_Sub2_Sub1_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader1 = this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1.a(arg1.method4330("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
	@Override
	public void method6427() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(16) IDirect3DDevice local16 = this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1;
			@Pc(21) Class118_Sub3 local21 = this.aClass122_Sub2_Sub1_3.method5597();
			local16.a(0, local21.method6967(Static75.aFloatArray3));
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	@Override
	public void method6428() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1;
			@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_Sub1_3.method5597();
			local8.a(0, local13.method6967(Static75.aFloatArray3));
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	@Override
	public void method6422() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1;
		if (this.aClass122_Sub2_16.anInt6702 <= 0) {
			local13.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(33) float local33 = this.aClass122_Sub2_16.aFloat135;
			@Pc(37) float local37 = this.aClass122_Sub2_16.aFloat137;
			@Pc(41) float local41 = local37 - 512.0F;
			local13.a(10, local41, 1.0F / (local37 - local41), local37, 1.0F / (local33 - local37));
		}
		this.aClass122_Sub2_16.method5634(this.aClass122_Sub2_16.anInt6692);
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return this.anIDirect3DVertexShader1 != null;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
	@Override
	public void method6435() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1;
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_16.method5553();
		local13.method6981(Static75.aFloatArray3);
		Static75.aFloatArray3[1] *= 0.25F;
		Static75.aFloatArray3[2] *= 0.25F;
		Static75.aFloatArray3[4] *= 0.25F;
		Static75.aFloatArray3[7] *= 0.25F;
		Static75.aFloatArray3[0] *= 0.25F;
		Static75.aFloatArray3[3] *= 0.25F;
		Static75.aFloatArray3[6] *= 0.25F;
		Static75.aFloatArray3[5] *= 0.25F;
		local8.SetVertexShaderConstantF(8, Static75.aFloatArray3, 2);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) IDirect3DDevice local9 = this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1;
		if (this.aClass241_1.aBoolean500) {
			@Pc(22) float local22 = (float) (this.aClass122_Sub2_16.anInt6721 % 4000) / 4000.0F;
			this.aClass122_Sub2_16.method5651(this.aClass241_1.anInterface9_1);
			local9.a(11, local22, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(48) int local48 = this.aClass122_Sub2_16.anInt6721 % 4000 * 16 / 4000;
			this.aClass122_Sub2_16.method5651(this.aClass241_1.anInterface3Array2[local48]);
			local9.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V")
	@Override
	public void method6436() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1;
			local10.a(4, this.aClass122_Sub2_16.method5657(Static75.aFloatArray3));
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
		this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass122_Sub2_16.method5575(0, Static162.aClass181_2);
		this.aClass122_Sub2_16.method5575(1, Static30.aClass181_1);
		this.aClass122_Sub2_16.method5575(2, Static312.aClass181_4);
		this.aClass122_Sub2_16.method5581(true);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
		this.aClass122_Sub2_16.method5605(Static343.aClass271_2, Static39.aClass271_1);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
		this.aClass122_Sub2_Sub1_3.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader1);
		this.aClass122_Sub2_16.method5575(0, Static162.aClass181_2);
		this.aClass122_Sub2_16.method5575(1, Static312.aClass181_4);
		this.aClass122_Sub2_16.method5678(Static30.aClass181_1, true, false, 2);
		this.aClass122_Sub2_16.method5581(false);
		this.method6428();
		this.method6435();
		this.method6436();
		this.method6422();
	}
}
