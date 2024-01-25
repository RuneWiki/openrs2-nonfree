import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class9_Sub4 extends Class9 {

	@OriginalMember(owner = "client!br", name = "k", descriptor = "Lclient!ob;")
	private final Class242 aClass242_4;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "Lclient!oe;")
	private final Class7_Sub1_Sub2 aClass7_Sub1_Sub2_2;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!oe;Lclient!vo;Lclient!ob;)V")
	public Class9_Sub4(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass242_4 = arg2;
		this.aClass7_Sub1_Sub2_2 = arg0;
		if (arg1 != null && this.aClass242_4.method5534() && (this.aClass7_Sub1_Sub2_2.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1.b(arg1.method7956("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1;
		if (this.aClass242_4.aBoolean489) {
			@Pc(23) float local23 = (float) (this.aClass7_Sub1_23.anInt7377 % 4000) / 4000.0F;
			this.aClass7_Sub1_23.method5694(this.aClass242_4.anInterface23_2);
			local3.b(11, local23, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(49) int local49 = this.aClass7_Sub1_23.anInt7377 % 4000 * 16 / 4000;
			this.aClass7_Sub1_23.method5694(this.aClass242_4.anInterface4Array2[local49]);
			local3.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!br", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return this.anIDirect3DVertexShader6 != null;
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V")
	@Override
	public void method8025() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1;
		@Pc(17) Class81_Sub1 local17 = this.aClass7_Sub1_23.method5759();
		local17.method1957(Static49.aFloatArray24);
		Static49.aFloatArray24[3] *= 0.25F;
		Static49.aFloatArray24[0] *= 0.25F;
		Static49.aFloatArray24[7] *= 0.25F;
		Static49.aFloatArray24[4] *= 0.25F;
		Static49.aFloatArray24[1] *= 0.25F;
		Static49.aFloatArray24[5] *= 0.25F;
		Static49.aFloatArray24[2] *= 0.25F;
		Static49.aFloatArray24[6] *= 0.25F;
		local12.SetVertexShaderConstantF(8, Static49.aFloatArray24, 2);
	}

	@OriginalMember(owner = "client!br", name = "h", descriptor = "(I)V")
	@Override
	public void method8032() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(19) Class81_Sub1 local19 = this.aClass7_Sub1_Sub2_2.method5776();
			local14.a(0, local19.method1955(Static49.aFloatArray24));
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1;
		if (this.aClass7_Sub1_23.anInt7354 <= 0) {
			local7.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(27) float local27 = this.aClass7_Sub1_23.aFloat177;
			@Pc(31) float local31 = this.aClass7_Sub1_23.aFloat175;
			@Pc(35) float local35 = local31 - 512.0F;
			local7.b(10, local35, 1.0F / (local31 - local35), local31, 1.0F / (local27 - local31));
		}
		this.aClass7_Sub1_23.method5712(this.aClass7_Sub1_23.anInt7362);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1.SetVertexShader(null);
		this.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
		this.aClass7_Sub1_23.method5681(1, Static308.aClass61_4);
		this.aClass7_Sub1_23.method5681(2, Static18.aClass61_1);
		this.aClass7_Sub1_23.method5765(true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	@Override
	public void method8023() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1;
			@Pc(12) Class81_Sub1 local12 = this.aClass7_Sub1_Sub2_2.method5776();
			local7.a(0, local12.method1955(Static49.aFloatArray24));
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1.SetVertexShader(this.anIDirect3DVertexShader6);
		this.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
		this.aClass7_Sub1_23.method5681(1, Static18.aClass61_1);
		this.aClass7_Sub1_23.method5741(false, Static308.aClass61_4, true, 2);
		this.aClass7_Sub1_23.method5765(false);
		this.method8032();
		this.method8025();
		this.method8020();
		this.method8031();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
		this.aClass7_Sub1_23.method5764(Static509.aClass95_4, Static371.aClass95_1);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	@Override
	public void method8020() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass7_Sub1_Sub2_2.anIDirect3DDevice1;
			local8.a(4, this.aClass7_Sub1_23.method5755(Static49.aFloatArray24));
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
	}
}
