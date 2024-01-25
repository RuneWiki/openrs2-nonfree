import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class19_Sub10 extends Class19 {

	@OriginalMember(owner = "client!vfa", name = "u", descriptor = "Lclient!kfa;")
	private final Class82_Sub3_Sub2 aClass82_Sub3_Sub2_8;

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "Lclient!ep;")
	private final Class96 aClass96_5;

	@OriginalMember(owner = "client!vfa", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!kfa;Lclient!uu;Lclient!ep;)V")
	public Class19_Sub10(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class96 arg2) {
		super(arg0);
		this.aClass82_Sub3_Sub2_8 = arg0;
		this.aClass96_5 = arg2;
		if (arg1 != null && this.aClass96_5.method2362() && (this.aClass82_Sub3_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader3 = this.aClass82_Sub3_Sub2_8.anIDirect3DDevice1.a(arg1.method8142("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		this.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
		this.aClass82_Sub3_23.method4928(1, Static302.aClass165_1);
		this.aClass82_Sub3_23.method5034(2, false, Static309.aClass165_2, true);
		this.aClass82_Sub3_23.method4930(false);
		this.aClass82_Sub3_Sub2_8.method5050(this.anIDirect3DVertexShader3);
		this.method8279();
		this.method8288();
		this.method8272();
		this.method8284();
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		this.aClass82_Sub3_Sub2_8.method5050((IDirect3DVertexShader) null);
		this.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
		this.aClass82_Sub3_23.method4928(1, Static309.aClass165_2);
		this.aClass82_Sub3_23.method4928(2, Static302.aClass165_1);
		this.aClass82_Sub3_23.method4930(true);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
		this.aClass82_Sub3_23.method4908(Static418.aClass88_2, Static603.aClass88_5);
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass82_Sub3_Sub2_8.anIDirect3DDevice1;
		if (this.aClass96_5.aBoolean215) {
			@Pc(20) float local20 = (float) (this.aClass82_Sub3_23.anInt5838 % 4000) / 4000.0F;
			this.aClass82_Sub3_23.method4972(this.aClass96_5.anInterface20_1);
			local3.a(11, local20, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(46) int local46 = this.aClass82_Sub3_23.anInt5838 % 4000 * 16 / 4000;
			this.aClass82_Sub3_23.method4972(this.aClass96_5.anInterface6Array2[local46]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8278() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass82_Sub3_Sub2_8.anIDirect3DDevice1;
			@Pc(19) Class31_Sub2 local19 = this.aClass82_Sub3_Sub2_8.method4924();
			local14.a(0, local19.method7679(Static599.aFloatArray92));
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	@Override
	public void method8288() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass82_Sub3_Sub2_8.anIDirect3DDevice1;
		@Pc(18) Class31_Sub2 local18 = this.aClass82_Sub3_23.method4981();
		local18.method7675(Static599.aFloatArray92);
		Static599.aFloatArray92[0] *= 0.25F;
		Static599.aFloatArray92[1] *= 0.25F;
		Static599.aFloatArray92[7] *= 0.25F;
		Static599.aFloatArray92[4] *= 0.25F;
		Static599.aFloatArray92[5] *= 0.25F;
		Static599.aFloatArray92[6] *= 0.25F;
		Static599.aFloatArray92[3] *= 0.25F;
		Static599.aFloatArray92[2] *= 0.25F;
		local13.SetVertexShaderConstantF(8, Static599.aFloatArray92, 2);
	}

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "(Z)V")
	@Override
	public void method8284() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass82_Sub3_Sub2_8.anIDirect3DDevice1;
		if (this.aClass82_Sub3_23.anInt5844 <= 0) {
			local16.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(33) float local33 = this.aClass82_Sub3_23.aFloat122;
			@Pc(37) float local37 = this.aClass82_Sub3_23.aFloat132;
			@Pc(41) float local41 = local37 - 512.0F;
			local16.a(10, local41, 1.0F / (local37 - local41), local37, 1.0F / (local33 - local37));
		}
		this.aClass82_Sub3_23.method4933(this.aClass82_Sub3_23.anInt5843);
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(Z)V")
	@Override
	public void method8279() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass82_Sub3_Sub2_8.anIDirect3DDevice1;
			@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_Sub2_8.method4924();
			local8.a(0, local13.method7679(Static599.aFloatArray92));
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8272() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass82_Sub3_Sub2_8.anIDirect3DDevice1;
			local14.a(4, this.aClass82_Sub3_23.method4905(Static599.aFloatArray92));
		}
	}

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return this.anIDirect3DVertexShader3 != null;
	}
}
