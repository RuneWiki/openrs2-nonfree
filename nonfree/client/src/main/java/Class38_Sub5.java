import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class38_Sub5 extends Class38 {

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Lclient!kaa;")
	private final Class44_Sub2_Sub2 aClass44_Sub2_Sub2_7;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "Z")
	private final boolean aBoolean526;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Lclient!co;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!kaa;Lclient!jn;)V")
	public Class38_Sub5(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class176 arg1) {
		super(arg0);
		this.aClass44_Sub2_Sub2_7 = arg0;
		if (arg1 == null || (this.aClass44_Sub2_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean526 = false;
		} else {
			this.anIDirect3DVertexShader2 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1.b(arg1.method3972("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1.b(arg1.method3972("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1.b(arg1.method3972("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1.b(arg1.method3972("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader6 != null) {
				this.anInterface6_4 = this.aClass44_Sub2_21.method4250(1, false, new int[] { 0, -1 }, 2);
				this.anInterface6_4.method8281(false, false);
				this.aBoolean526 = true;
			} else {
				this.aBoolean526 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		this.aBoolean527 = arg0;
		this.aClass44_Sub2_21.method4267(1);
		this.aClass44_Sub2_21.method4265(this.anInterface6_4);
		this.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static435.aClass117_8);
		this.aClass44_Sub2_21.method4241(0, Static447.aClass328_3);
		this.aClass44_Sub2_21.method4258(true, 2, Static519.aClass328_4, false);
		this.aClass44_Sub2_21.method4312(0, Static283.aClass328_5);
		this.aClass44_Sub2_21.method4267(0);
		this.method7437();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		if (arg1 == null) {
			this.aClass44_Sub2_21.method4265(this.aClass44_Sub2_21.anInterface16_3);
			this.aClass44_Sub2_21.method4335(1);
			this.aClass44_Sub2_21.method4241(0, Static283.aClass328_5);
			this.aClass44_Sub2_21.method4312(0, Static283.aClass328_5);
		} else {
			this.aClass44_Sub2_21.method4265(arg1);
			this.aClass44_Sub2_21.method4335(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	@Override
	public void method7441() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class8_Sub3 local12 = this.aClass44_Sub2_21.method4254();
			local7.SetVertexShaderConstantF(8, local12.method1561(Static403.aFloatArray52), 2);
		}
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
	@Override
	public void method7442() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(20) Class8_Sub3 local20 = this.aClass44_Sub2_Sub2_7.method4322();
			local15.a(0, local20.method1573(Static403.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		this.aClass44_Sub2_21.method4267(1);
		this.aClass44_Sub2_21.method4265(null);
		this.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
		this.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
		this.aClass44_Sub2_21.method4241(2, Static447.aClass328_3);
		this.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
		this.aClass44_Sub2_21.method4267(0);
		this.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
		this.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	@Override
	public void method7437() {
		@Pc(3) IDirect3DDevice local3 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass44_Sub2_21.method4328();
		@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_21.method4304();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean527) {
			local27 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader6;
		} else {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader3 != local27) {
			this.anIDirect3DVertexShader3 = local27;
			local3.SetVertexShader(local27);
			this.method6349();
			this.method7438();
			this.method7441();
			this.method7442();
			this.method7443();
			this.method7429();
		}
		local13.method1568(0.0F, -1.0F, Static403.aFloatArray53, (float) local8, 0.0F);
		local3.a(12, Static403.aFloatArray53);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return this.aBoolean526;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
	@Override
	public void method7443() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_Sub2_7.method4322();
			local8.a(0, local13.method1573(Static403.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	@Override
	public void method7429() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1;
		@Pc(20) int local20 = this.aClass44_Sub2_21.U();
		@Pc(24) int local24 = this.aClass44_Sub2_21.BA();
		@Pc(34) float local34 = (float) local20 - (float) (local20 - local24) * 0.125F;
		@Pc(45) float local45 = (float) local20 - (float) (local20 - local24) * 0.25F;
		local16.b(10, local45, 1.0F / (local34 - local45), local34, 1.0F / ((float) local20 - local34));
		local16.b(11, 1.0F / (float) this.aClass44_Sub2_21.method4288(), (float) this.aClass44_Sub2_21.method4359() / 255.0F, this.aClass44_Sub2_21.aFloat149, 1.0F / (this.aClass44_Sub2_21.aFloat149 - this.aClass44_Sub2_21.aFloat152));
		this.aClass44_Sub2_21.method4285(this.aClass44_Sub2_21.method4368());
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
	@Override
	public void method7438() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1;
			local7.a(4, this.aClass44_Sub2_21.method4342(Static403.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
	private void method6349() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean527) {
			return;
		}
		@Pc(10) Class8_Sub3 local10 = this.aClass44_Sub2_21.method4313();
		@Pc(14) IDirect3DDevice local14 = this.aClass44_Sub2_Sub2_7.anIDirect3DDevice1;
		local14.b(13, this.aClass44_Sub2_21.aFloat142 * this.aClass44_Sub2_21.aFloat153, this.aClass44_Sub2_21.aFloat156 * this.aClass44_Sub2_21.aFloat153, this.aClass44_Sub2_21.aFloat150 * this.aClass44_Sub2_21.aFloat153, 1.0F);
		local14.b(14, this.aClass44_Sub2_21.aFloat155 * this.aClass44_Sub2_21.aFloat142, this.aClass44_Sub2_21.aFloat156 * this.aClass44_Sub2_21.aFloat155, this.aClass44_Sub2_21.aFloat150 * this.aClass44_Sub2_21.aFloat155, 1.0F);
		local14.b(16, this.aClass44_Sub2_21.aFloat142 * this.aClass44_Sub2_21.aFloat146, this.aClass44_Sub2_21.aFloat146 * this.aClass44_Sub2_21.aFloat156, this.aClass44_Sub2_21.aFloat146 * this.aClass44_Sub2_21.aFloat150, 1.0F);
		local10.method1574(this.aClass44_Sub2_21.aFloatArray35[2], this.aClass44_Sub2_21.aFloatArray35[1], Static403.aFloatArray53, this.aClass44_Sub2_21.aFloatArray35[0]);
		local14.SetVertexShaderConstantF(15, Static403.aFloatArray53, 1);
		local10.method1574(this.aClass44_Sub2_21.aFloatArray30[2], this.aClass44_Sub2_21.aFloatArray30[1], Static403.aFloatArray53, this.aClass44_Sub2_21.aFloatArray30[0]);
		local14.SetVertexShaderConstantF(17, Static403.aFloatArray53, 1);
	}
}
