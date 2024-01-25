import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class19_Sub11 extends Class19 {

	@OriginalMember(owner = "client!vga", name = "t", descriptor = "Z")
	private boolean aBoolean737;

	@OriginalMember(owner = "client!vga", name = "A", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!vga", name = "C", descriptor = "Z")
	private boolean aBoolean739 = false;

	@OriginalMember(owner = "client!vga", name = "B", descriptor = "Lclient!kfa;")
	private final Class82_Sub3_Sub2 aClass82_Sub3_Sub2_9;

	@OriginalMember(owner = "client!vga", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!vga", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!vga", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!vga", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!vga", name = "x", descriptor = "Z")
	private final boolean aBoolean738;

	@OriginalMember(owner = "client!vga", name = "z", descriptor = "Lclient!dg;")
	private Interface6 anInterface6_6;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!kfa;Lclient!uu;)V")
	public Class19_Sub11(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class343 arg1) {
		super(arg0);
		this.aClass82_Sub3_Sub2_9 = arg0;
		if (arg1 == null || (this.aClass82_Sub3_Sub2_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean738 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method8142("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method8142("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method8142("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader7 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1.a(arg1.method8142("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader7 != null) {
				this.anInterface6_6 = this.aClass82_Sub3_23.method5022(new int[] { 0, -1 }, 1, false, 2);
				this.anInterface6_6.method8506(false, false);
				this.aBoolean738 = true;
			} else {
				this.aBoolean738 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg1 != null) {
			if (this.aBoolean739) {
				this.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
				this.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
				this.aBoolean739 = false;
			}
			this.aClass82_Sub3_23.method4972(arg1);
			this.aClass82_Sub3_23.method5010(arg0);
		} else if (!this.aBoolean739) {
			this.aClass82_Sub3_23.method4972(this.aClass82_Sub3_23.anInterface10_3);
			this.aClass82_Sub3_23.method5010(1);
			this.aClass82_Sub3_23.method4928(0, Static430.aClass165_3);
			this.aClass82_Sub3_23.method5028(Static430.aClass165_3, 0);
			this.aBoolean739 = true;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		this.aBoolean737 = arg0;
		this.aClass82_Sub3_23.method4946(1);
		this.aClass82_Sub3_23.method4972(this.anInterface6_6);
		this.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static603.aClass88_5);
		this.aClass82_Sub3_23.method4928(0, Static302.aClass165_1);
		this.aClass82_Sub3_23.method5034(2, true, Static527.aClass165_4, false);
		this.aClass82_Sub3_23.method5028(Static430.aClass165_3, 0);
		this.aClass82_Sub3_23.method4946(0);
		this.method8275();
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
	@Override
	public void method8288() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(16) Class31_Sub2 local16 = this.aClass82_Sub3_23.method4981();
			local11.SetVertexShaderConstantF(8, local16.method7675(Static600.aFloatArray94), 2);
		}
	}

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "(Z)V")
	@Override
	public void method8279() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(9) IDirect3DDevice local9 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(14) Class31_Sub2 local14 = this.aClass82_Sub3_Sub2_9.method4924();
			local9.a(0, local14.method7679(Static600.aFloatArray94));
		}
	}

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "(Z)V")
	@Override
	public void method8284() {
		if (this.anIDirect3DVertexShader8 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1;
		@Pc(10) int local10 = this.aClass82_Sub3_23.XA();
		@Pc(14) int local14 = this.aClass82_Sub3_23.i();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		local6.a(10, local37, 1.0F / (local25 - local37), local25, 1.0F / ((float) local10 - local25));
		local6.a(11, 1.0F / (float) this.aClass82_Sub3_23.method5021(), (float) this.aClass82_Sub3_23.method4919() / 255.0F, this.aClass82_Sub3_23.aFloat122, 1.0F / (this.aClass82_Sub3_23.aFloat122 - this.aClass82_Sub3_23.aFloat132));
		this.aClass82_Sub3_23.method4933(this.aClass82_Sub3_23.method5025());
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	@Override
	public void method8278() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1;
			@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_Sub2_9.method4924();
			local6.a(0, local13.method7679(Static600.aFloatArray94));
		}
	}

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "(I)V")
	private void method8290() {
		if (this.anIDirect3DVertexShader8 == null || !this.aBoolean737) {
			return;
		}
		@Pc(12) Class31_Sub2 local12 = this.aClass82_Sub3_23.method4948();
		@Pc(16) IDirect3DDevice local16 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1;
		local16.a(13, this.aClass82_Sub3_23.aFloat123 * this.aClass82_Sub3_23.aFloat137, this.aClass82_Sub3_23.aFloat135 * this.aClass82_Sub3_23.aFloat123, this.aClass82_Sub3_23.aFloat123 * this.aClass82_Sub3_23.aFloat124, 1.0F);
		local16.a(14, this.aClass82_Sub3_23.aFloat138 * this.aClass82_Sub3_23.aFloat137, this.aClass82_Sub3_23.aFloat138 * this.aClass82_Sub3_23.aFloat135, this.aClass82_Sub3_23.aFloat124 * this.aClass82_Sub3_23.aFloat138, 1.0F);
		local16.a(16, this.aClass82_Sub3_23.aFloat137 * this.aClass82_Sub3_23.aFloat136, this.aClass82_Sub3_23.aFloat135 * this.aClass82_Sub3_23.aFloat136, this.aClass82_Sub3_23.aFloat136 * this.aClass82_Sub3_23.aFloat124, 1.0F);
		local12.method7660(Static600.aFloatArray93, this.aClass82_Sub3_23.aFloatArray54[1], this.aClass82_Sub3_23.aFloatArray54[2], this.aClass82_Sub3_23.aFloatArray54[0]);
		local16.SetVertexShaderConstantF(15, Static600.aFloatArray93, 1);
		local12.method7660(Static600.aFloatArray93, this.aClass82_Sub3_23.aFloatArray55[1], this.aClass82_Sub3_23.aFloatArray55[2], this.aClass82_Sub3_23.aFloatArray55[0]);
		local16.SetVertexShaderConstantF(17, Static600.aFloatArray93, 1);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	@Override
	public void method8272() {
		if (this.anIDirect3DVertexShader8 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1;
			local14.a(4, this.aClass82_Sub3_23.method4905(Static600.aFloatArray94));
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
	@Override
	public void method8275() {
		@Pc(3) IDirect3DDevice local3 = this.aClass82_Sub3_Sub2_9.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass82_Sub3_23.method4983();
		@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_23.method4971();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean737) {
			local25 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader7;
		} else {
			local25 = local8 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader6;
		}
		if (local25 != this.anIDirect3DVertexShader8) {
			this.anIDirect3DVertexShader8 = local25;
			this.aClass82_Sub3_Sub2_9.method5050(local25);
			this.method8290();
			this.method8272();
			this.method8288();
			this.method8279();
			this.method8278();
			this.method8284();
		}
		local13.method7665(-1.0F, 0.0F, (float) local8, Static600.aFloatArray93, 0.0F);
		local3.a(12, Static600.aFloatArray93);
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		this.aClass82_Sub3_23.method4946(1);
		this.aClass82_Sub3_23.method4972((Interface10) null);
		this.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
		this.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
		this.aClass82_Sub3_23.method4928(2, Static302.aClass165_1);
		this.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
		this.aClass82_Sub3_23.method4946(0);
		if (this.aBoolean739) {
			this.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
			this.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
			this.aBoolean739 = false;
		}
		if (this.anIDirect3DVertexShader8 != null) {
			this.aClass82_Sub3_Sub2_9.method5050((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader8 = null;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return this.aBoolean738;
	}
}
