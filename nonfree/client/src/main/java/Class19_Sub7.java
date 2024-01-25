import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class19_Sub7 extends Class19 {

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
	private boolean aBoolean672;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!mba;")
	private final Class15_Sub2_Sub2 aClass15_Sub2_Sub2_7;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Z")
	private final boolean aBoolean671;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!mba;Lclient!pe;)V")
	public Class19_Sub7(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class254 arg1) {
		super(arg0);
		this.aClass15_Sub2_Sub2_7 = arg0;
		if ((this.aClass15_Sub2_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader6 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method6410("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method6410("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method6410("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1.a(arg1.method6410("uw_model_lit", "dx"));
			this.aBoolean671 = this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader3 != null;
		} else {
			this.aBoolean671 = false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
		this.aClass15_Sub2_18.method5414(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	@Override
	public void method7885() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(13) Class255_Sub3 local13 = this.aClass15_Sub2_Sub2_7.method5377();
			local8.a(0, local13.method8031(Static418.aFloatArray68));
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
		if (this.anIDirect3DVertexShader2 != null) {
			this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	@Override
	public void method7893() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1;
			local8.a(4, this.aClass15_Sub2_18.method5456(Static418.aFloatArray68));
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
	private void method6737() {
		if (this.anIDirect3DVertexShader2 == null || !this.aBoolean672) {
			return;
		}
		@Pc(11) Class255_Sub3 local11 = this.aClass15_Sub2_18.method5428();
		@Pc(15) IDirect3DDevice local15 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1;
		local15.a(13, this.aClass15_Sub2_18.aFloat131 * this.aClass15_Sub2_18.aFloat126, this.aClass15_Sub2_18.aFloat126 * this.aClass15_Sub2_18.aFloat143, this.aClass15_Sub2_18.aFloat142 * this.aClass15_Sub2_18.aFloat126, 1.0F);
		local15.a(14, this.aClass15_Sub2_18.aFloat131 * this.aClass15_Sub2_18.aFloat139, this.aClass15_Sub2_18.aFloat143 * this.aClass15_Sub2_18.aFloat139, this.aClass15_Sub2_18.aFloat142 * this.aClass15_Sub2_18.aFloat139, 1.0F);
		local15.a(16, this.aClass15_Sub2_18.aFloat140 * this.aClass15_Sub2_18.aFloat131, this.aClass15_Sub2_18.aFloat140 * this.aClass15_Sub2_18.aFloat143, this.aClass15_Sub2_18.aFloat140 * this.aClass15_Sub2_18.aFloat142, 1.0F);
		local11.method8024(this.aClass15_Sub2_18.aFloatArray56[1], Static418.aFloatArray67, this.aClass15_Sub2_18.aFloatArray56[2], this.aClass15_Sub2_18.aFloatArray56[0]);
		local15.SetVertexShaderConstantF(15, Static418.aFloatArray67, 1);
		local11.method8024(this.aClass15_Sub2_18.aFloatArray48[1], Static418.aFloatArray67, this.aClass15_Sub2_18.aFloatArray48[2], this.aClass15_Sub2_18.aFloatArray48[0]);
		local15.SetVertexShaderConstantF(15, Static418.aFloatArray67, 1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return this.aBoolean671;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	@Override
	public void method7891() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(17) Class255_Sub3 local17 = this.aClass15_Sub2_18.method5469();
			local12.SetVertexShaderConstantF(8, local17.method8039(Static418.aFloatArray68), 2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	@Override
	public void method7882() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class255_Sub3 local12 = this.aClass15_Sub2_Sub2_7.method5377();
			local7.a(0, local12.method8031(Static418.aFloatArray68));
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
		this.aBoolean672 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	@Override
	public void method7884() {
		@Pc(3) IDirect3DDevice local3 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass15_Sub2_18.method5413();
		@Pc(13) Class255_Sub3 local13 = this.aClass15_Sub2_18.method5428();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean672) {
			local25 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader3;
		} else {
			local25 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader4;
		}
		if (local25 != this.anIDirect3DVertexShader2) {
			this.anIDirect3DVertexShader2 = local25;
			local3.SetVertexShader(local25);
			this.method6737();
			this.method7893();
			this.method7891();
			this.method7882();
			this.method7885();
			this.method7887();
		}
		local13.method8028(0.0F, (float) local8, Static418.aFloatArray67, 0.0F, -1.0F);
		local3.a(12, Static418.aFloatArray67);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	@Override
	public void method7887() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass15_Sub2_Sub2_7.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass15_Sub2_18.IA();
		@Pc(15) int local15 = this.aClass15_Sub2_18.U();
		@Pc(26) float local26 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(36) float local36 = (float) local11 - (float) (local11 - local15) * 0.25F;
		local7.a(10, local36, 1.0F / (local26 - local36), local26, 1.0F / ((float) local11 - local26));
		local7.a(11, 1.0F / (float) this.aClass15_Sub2_18.method5478(), (float) this.aClass15_Sub2_18.method5480() / 255.0F, 0.0F, 0.0F);
	}
}
