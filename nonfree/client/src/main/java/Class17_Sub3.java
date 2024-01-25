import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!bfa;")
	private final Class20_Sub2_Sub1 aClass20_Sub2_Sub1_3;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Z")
	private final boolean aBoolean298;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!wfa;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!bfa;Lclient!in;)V")
	public Class17_Sub3(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class157 arg1) {
		super(arg0);
		this.aClass20_Sub2_Sub1_3 = arg0;
		if (arg1 == null || (this.aClass20_Sub2_Sub1_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean298 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1.b(arg1.method4545("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader2 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1.b(arg1.method4545("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1.b(arg1.method4545("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1.b(arg1.method4545("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader6 != null) {
				this.anInterface27_1 = this.aClass20_Sub2_22.method1473(1, 2, false, new int[] { 0, -1 });
				this.anInterface27_1.method8300(false, false);
				this.aBoolean298 = true;
			} else {
				this.aBoolean298 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	@Override
	public void method8065() {
		@Pc(9) IDirect3DDevice local9 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass20_Sub2_22.method1575();
		@Pc(19) Class30_Sub2 local19 = this.aClass20_Sub2_22.method1521();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean299) {
			local33 = ~local14 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader6;
		} else {
			local33 = ~local14 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader4 != local33) {
			this.anIDirect3DVertexShader4 = local33;
			this.aClass20_Sub2_Sub1_3.method1330(local33);
			this.method3503();
			this.method8061();
			this.method8069();
			this.method8060();
			this.method8068();
			this.method8059();
		}
		local19.method4039(0.0F, Static159.aFloatArray36, -1.0F, 0.0F, (float) local14);
		local9.a(12, Static159.aFloatArray36);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		this.aClass20_Sub2_22.method1531(1);
		this.aClass20_Sub2_22.method1484(null);
		this.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
		this.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
		this.aClass20_Sub2_22.method1483(2, Static165.aClass177_3);
		this.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
		this.aClass20_Sub2_22.method1531(0);
		if (this.aBoolean297) {
			this.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
			this.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
			this.aBoolean297 = false;
		}
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass20_Sub2_Sub1_3.method1330(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return this.aBoolean298;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	@Override
	public void method8060() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1;
			@Pc(22) Class30_Sub2 local22 = this.aClass20_Sub2_Sub1_3.method1582();
			local15.a(0, local22.method4044(Static159.aFloatArray37));
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1;
			local11.a(4, this.aClass20_Sub2_22.method1469(Static159.aFloatArray37));
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		if (arg1 != null) {
			if (this.aBoolean297) {
				this.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
				this.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
				this.aBoolean297 = false;
			}
			this.aClass20_Sub2_22.method1484(arg1);
			this.aClass20_Sub2_22.method1557(arg0);
		} else if (!this.aBoolean297) {
			this.aClass20_Sub2_22.method1484(this.aClass20_Sub2_22.anInterface7_3);
			this.aClass20_Sub2_22.method1557(1);
			this.aClass20_Sub2_22.method1483(0, Static154.aClass177_4);
			this.aClass20_Sub2_22.method1519(0, Static154.aClass177_4);
			this.aBoolean297 = true;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	@Override
	public void method8059() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass20_Sub2_22.XA();
		@Pc(22) int local22 = this.aClass20_Sub2_22.i();
		@Pc(34) float local34 = -((float) (local18 - local22) * 0.125F) + (float) local18;
		@Pc(45) float local45 = (float) local18 - (float) (local18 - local22) * 0.25F;
		local14.a(10, local45, 1.0F / (local34 - local45), local34, 1.0F / ((float) local18 - local34));
		local14.a(11, 1.0F / (float) this.aClass20_Sub2_22.method1467(), (float) this.aClass20_Sub2_22.method1460() / 255.0F, this.aClass20_Sub2_22.aFloat53, 1.0F / (this.aClass20_Sub2_22.aFloat53 - this.aClass20_Sub2_22.aFloat61));
		this.aClass20_Sub2_22.method1528(this.aClass20_Sub2_22.method1497());
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		this.aBoolean299 = arg0;
		this.aClass20_Sub2_22.method1531(1);
		this.aClass20_Sub2_22.method1484(this.anInterface27_1);
		this.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static542.aClass315_5);
		this.aClass20_Sub2_22.method1483(0, Static165.aClass177_3);
		this.aClass20_Sub2_22.method1558(true, 2, Static118.aClass177_1, false);
		this.aClass20_Sub2_22.method1519(0, Static154.aClass177_4);
		this.aClass20_Sub2_22.method1531(0);
		this.method8065();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V")
	private void method3503() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean299) {
			return;
		}
		@Pc(15) Class30_Sub2 local15 = this.aClass20_Sub2_22.method1488();
		@Pc(19) IDirect3DDevice local19 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1;
		local19.a(13, this.aClass20_Sub2_22.aFloat51 * this.aClass20_Sub2_22.aFloat63, this.aClass20_Sub2_22.aFloat49 * this.aClass20_Sub2_22.aFloat51, this.aClass20_Sub2_22.aFloat59 * this.aClass20_Sub2_22.aFloat51, 1.0F);
		local19.a(14, this.aClass20_Sub2_22.aFloat62 * this.aClass20_Sub2_22.aFloat63, this.aClass20_Sub2_22.aFloat49 * this.aClass20_Sub2_22.aFloat62, this.aClass20_Sub2_22.aFloat62 * this.aClass20_Sub2_22.aFloat59, 1.0F);
		local19.a(16, this.aClass20_Sub2_22.aFloat63 * this.aClass20_Sub2_22.aFloat65, this.aClass20_Sub2_22.aFloat49 * this.aClass20_Sub2_22.aFloat65, this.aClass20_Sub2_22.aFloat59 * this.aClass20_Sub2_22.aFloat65, 1.0F);
		local15.method4043(this.aClass20_Sub2_22.aFloatArray33[0], this.aClass20_Sub2_22.aFloatArray33[1], this.aClass20_Sub2_22.aFloatArray33[2], Static159.aFloatArray36);
		local19.SetVertexShaderConstantF(15, Static159.aFloatArray36, 1);
		local15.method4043(this.aClass20_Sub2_22.aFloatArray25[0], this.aClass20_Sub2_22.aFloatArray25[1], this.aClass20_Sub2_22.aFloatArray25[2], Static159.aFloatArray36);
		local19.SetVertexShaderConstantF(17, Static159.aFloatArray36, 1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	@Override
	public void method8068() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1;
			@Pc(16) Class30_Sub2 local16 = this.aClass20_Sub2_Sub1_3.method1582();
			local11.a(0, local16.method4044(Static159.aFloatArray37));
		}
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V")
	@Override
	public void method8069() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass20_Sub2_Sub1_3.anIDirect3DDevice1;
			@Pc(19) Class30_Sub2 local19 = this.aClass20_Sub2_22.method1482();
			local14.SetVertexShaderConstantF(8, local19.method4035(Static159.aFloatArray37), 2);
		}
	}
}
