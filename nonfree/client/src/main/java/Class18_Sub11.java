import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class18_Sub11 extends Class18 {

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "Z")
	private boolean aBoolean732;

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!vu", name = "w", descriptor = "Z")
	private boolean aBoolean734 = false;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Lclient!ul;")
	private final Class13_Sub3_Sub2 aClass13_Sub3_Sub2_9;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "Z")
	private final boolean aBoolean733;

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "Lclient!wk;")
	private Interface27 anInterface27_6;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!ul;Lclient!nd;)V")
	public Class18_Sub11(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class238 arg1) {
		super(arg0);
		this.aClass13_Sub3_Sub2_9 = arg0;
		if (arg1 == null || (this.aClass13_Sub3_Sub2_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean733 = false;
		} else {
			this.anIDirect3DVertexShader7 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method5572("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method5572("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader4 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method5572("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method5572("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader7 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface27_6 = this.aClass13_Sub3_23.method8257(false, new int[] { 0, -1 }, 1, 2);
				this.anInterface27_6.method7134(false, false);
				this.aBoolean733 = true;
			} else {
				this.aBoolean733 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
	@Override
	public void method8636() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1;
			local13.a(4, this.aClass13_Sub3_23.method8294(Static623.aFloatArray104));
		}
	}

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "(I)V")
	@Override
	public void method8640() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(15) Class51_Sub2 local15 = this.aClass13_Sub3_Sub2_9.method8289();
			local10.a(0, local15.method3231(Static623.aFloatArray104));
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		this.aClass13_Sub3_23.method8230(1);
		this.aClass13_Sub3_23.method8234((Interface6) null);
		this.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
		this.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
		this.aClass13_Sub3_23.method8231(Static470.aClass43_5, 2);
		this.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
		this.aClass13_Sub3_23.method8230(0);
		if (this.aBoolean734) {
			this.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
			this.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
			this.aBoolean734 = false;
		}
		if (this.anIDirect3DVertexShader8 != null) {
			this.aClass13_Sub3_Sub2_9.method8318((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	@Override
	public void method8635() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1;
		@Pc(12) int local12 = this.aClass13_Sub3_23.XA();
		@Pc(16) int local16 = this.aClass13_Sub3_23.i();
		@Pc(28) float local28 = -((float) (local12 - local16) * 0.125F) + (float) local12;
		@Pc(40) float local40 = -((float) (local12 - local16) * 0.25F) + (float) local12;
		local8.a(10, local40, 1.0F / (local28 - local40), local28, 1.0F / ((float) local12 - local28));
		local8.a(11, 1.0F / (float) this.aClass13_Sub3_23.method8262(), (float) this.aClass13_Sub3_23.method8244() / 255.0F, this.aClass13_Sub3_23.aFloat196, 1.0F / (this.aClass13_Sub3_23.aFloat196 - this.aClass13_Sub3_23.aFloat192));
		this.aClass13_Sub3_23.method8212(this.aClass13_Sub3_23.method8283());
	}

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "(I)V")
	private void method8647() {
		if (this.anIDirect3DVertexShader8 == null || !this.aBoolean732) {
			return;
		}
		@Pc(15) Class51_Sub2 local15 = this.aClass13_Sub3_23.method8173();
		@Pc(19) IDirect3DDevice local19 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1;
		local19.a(13, this.aClass13_Sub3_23.aFloat202 * this.aClass13_Sub3_23.aFloat199, this.aClass13_Sub3_23.aFloat202 * this.aClass13_Sub3_23.aFloat203, this.aClass13_Sub3_23.aFloat202 * this.aClass13_Sub3_23.aFloat193, 1.0F);
		local19.a(14, this.aClass13_Sub3_23.aFloat199 * this.aClass13_Sub3_23.aFloat197, this.aClass13_Sub3_23.aFloat197 * this.aClass13_Sub3_23.aFloat203, this.aClass13_Sub3_23.aFloat193 * this.aClass13_Sub3_23.aFloat197, 1.0F);
		local19.a(16, this.aClass13_Sub3_23.aFloat204 * this.aClass13_Sub3_23.aFloat199, this.aClass13_Sub3_23.aFloat203 * this.aClass13_Sub3_23.aFloat204, this.aClass13_Sub3_23.aFloat204 * this.aClass13_Sub3_23.aFloat193, 1.0F);
		local15.method3235(Static623.aFloatArray105, this.aClass13_Sub3_23.aFloatArray91[0], this.aClass13_Sub3_23.aFloatArray91[1], this.aClass13_Sub3_23.aFloatArray91[2]);
		local19.SetVertexShaderConstantF(15, Static623.aFloatArray105, 1);
		local15.method3235(Static623.aFloatArray105, this.aClass13_Sub3_23.aFloatArray90[0], this.aClass13_Sub3_23.aFloatArray90[1], this.aClass13_Sub3_23.aFloatArray90[2]);
		local19.SetVertexShaderConstantF(17, Static623.aFloatArray105, 1);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		this.aBoolean732 = arg0;
		this.aClass13_Sub3_23.method8230(1);
		this.aClass13_Sub3_23.method8234(this.anInterface27_6);
		this.aClass13_Sub3_23.method8235(Static398.aClass269_5, Static408.aClass269_3);
		this.aClass13_Sub3_23.method8231(Static470.aClass43_5, 0);
		this.aClass13_Sub3_23.method8277(false, true, Static338.aClass43_3, 2);
		this.aClass13_Sub3_23.method8279(Static287.aClass43_8, 0);
		this.aClass13_Sub3_23.method8230(0);
		this.method8638();
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V")
	@Override
	public void method8638() {
		@Pc(3) IDirect3DDevice local3 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass13_Sub3_23.method8222();
		@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_23.method8213();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean732) {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader6;
		} else {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader7 : this.anIDirect3DVertexShader4;
		}
		if (local27 != this.anIDirect3DVertexShader8) {
			this.anIDirect3DVertexShader8 = local27;
			this.aClass13_Sub3_Sub2_9.method8318(local27);
			this.method8647();
			this.method8636();
			this.method8639();
			this.method8634();
			this.method8640();
			this.method8635();
		}
		local13.method3251((float) local8, 0.0F, Static623.aFloatArray105, -1.0F, 0.0F);
		local3.a(12, Static623.aFloatArray105);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	@Override
	public void method8634() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_Sub2_9.method8289();
			local8.a(0, local13.method3231(Static623.aFloatArray104));
		}
	}

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return this.aBoolean733;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		if (arg1 != null) {
			if (this.aBoolean734) {
				this.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
				this.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
				this.aBoolean734 = false;
			}
			this.aClass13_Sub3_23.method8234(arg1);
			this.aClass13_Sub3_23.method8204(arg0);
		} else if (!this.aBoolean734) {
			this.aClass13_Sub3_23.method8234(this.aClass13_Sub3_23.anInterface6_3);
			this.aClass13_Sub3_23.method8204(1);
			this.aClass13_Sub3_23.method8231(Static287.aClass43_8, 0);
			this.aClass13_Sub3_23.method8279(Static287.aClass43_8, 0);
			this.aBoolean734 = true;
		}
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V")
	@Override
	public void method8639() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass13_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(18) Class51_Sub2 local18 = this.aClass13_Sub3_23.method8256();
			local13.SetVertexShaderConstantF(8, local18.method3243(Static623.aFloatArray104), 2);
		}
	}
}
