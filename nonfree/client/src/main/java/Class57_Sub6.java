import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class57_Sub6 extends Class57 {

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "Lclient!bea;")
	private final Class5_Sub2_Sub1 aClass5_Sub2_Sub1_6;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "Z")
	private final boolean aBoolean464;

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "Lclient!js;")
	private Interface15 anInterface15_3;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!bea;Lclient!ni;)V")
	public Class57_Sub6(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class223 arg1) {
		super(arg0);
		this.aClass5_Sub2_Sub1_6 = arg0;
		if (arg1 == null || (this.aClass5_Sub2_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean464 = false;
		} else {
			this.anIDirect3DVertexShader8 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1.a(arg1.method5948("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1.a(arg1.method5948("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader4 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1.a(arg1.method5948("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader7 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1.a(arg1.method5948("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader7 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader8 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface15_3 = this.aClass5_Sub2_23.method4015(2, 1, new int[] { 0, -1 }, false);
				this.anInterface15_3.method8452(false, false);
				this.aBoolean464 = true;
			} else {
				this.aBoolean464 = false;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V")
	@Override
	public void method8704() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1;
			local14.a(4, this.aClass5_Sub2_23.method4043(Static278.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	@Override
	public void method8702() {
		if (this.anIDirect3DVertexShader5 == null) {
			return;
		}
		@Pc(15) IDirect3DDevice local15 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1;
		@Pc(19) int local19 = this.aClass5_Sub2_23.XA();
		@Pc(23) int local23 = this.aClass5_Sub2_23.i();
		@Pc(33) float local33 = (float) local19 - (float) (local19 - local23) * 0.125F;
		@Pc(44) float local44 = -((float) (local19 - local23) * 0.25F) + (float) local19;
		local15.b(10, local44, 1.0F / (local33 - local44), local33, 1.0F / ((float) local19 - local33));
		local15.b(11, 1.0F / (float) this.aClass5_Sub2_23.method3951(), (float) this.aClass5_Sub2_23.method4021() / 255.0F, this.aClass5_Sub2_23.aFloat95, 1.0F / (this.aClass5_Sub2_23.aFloat95 - this.aClass5_Sub2_23.aFloat99));
		this.aClass5_Sub2_23.method3987(this.aClass5_Sub2_23.method4001());
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
	private void method4929() {
		if (this.anIDirect3DVertexShader5 == null || !this.aBoolean463) {
			return;
		}
		@Pc(18) Class115_Sub3 local18 = this.aClass5_Sub2_23.method4026();
		@Pc(22) IDirect3DDevice local22 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1;
		local22.b(13, this.aClass5_Sub2_23.aFloat93 * this.aClass5_Sub2_23.aFloat98, this.aClass5_Sub2_23.aFloat93 * this.aClass5_Sub2_23.aFloat89, this.aClass5_Sub2_23.bf * this.aClass5_Sub2_23.aFloat93, 1.0F);
		local22.b(14, this.aClass5_Sub2_23.aFloat101 * this.aClass5_Sub2_23.aFloat98, this.aClass5_Sub2_23.aFloat89 * this.aClass5_Sub2_23.aFloat101, this.aClass5_Sub2_23.aFloat101 * this.aClass5_Sub2_23.bf, 1.0F);
		local22.b(16, this.aClass5_Sub2_23.aFloat98 * this.aClass5_Sub2_23.aFloat96, this.aClass5_Sub2_23.aFloat96 * this.aClass5_Sub2_23.aFloat89, this.aClass5_Sub2_23.aFloat96 * this.aClass5_Sub2_23.bf, 1.0F);
		local18.method6315(this.aClass5_Sub2_23.aFloatArray49[0], this.aClass5_Sub2_23.aFloatArray49[2], Static278.aFloatArray56, this.aClass5_Sub2_23.aFloatArray49[1]);
		local22.SetVertexShaderConstantF(15, Static278.aFloatArray56, 1);
		local18.method6315(this.aClass5_Sub2_23.aFloatArray46[0], this.aClass5_Sub2_23.aFloatArray46[2], Static278.aFloatArray56, this.aClass5_Sub2_23.aFloatArray46[1]);
		local22.SetVertexShaderConstantF(17, Static278.aFloatArray56, 1);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		if (arg1 != null) {
			if (this.aBoolean465) {
				this.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
				this.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
				this.aBoolean465 = false;
			}
			this.aClass5_Sub2_23.method4008(arg1);
			this.aClass5_Sub2_23.method4018(arg0);
		} else if (!this.aBoolean465) {
			this.aClass5_Sub2_23.method4008(this.aClass5_Sub2_23.anInterface4_3);
			this.aClass5_Sub2_23.method4018(1);
			this.aClass5_Sub2_23.method4054(0, Static115.aClass80_1);
			this.aClass5_Sub2_23.method3956(Static115.aClass80_1, 0);
			this.aBoolean465 = true;
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		this.aClass5_Sub2_23.method3954(1);
		this.aClass5_Sub2_23.method4008((Interface4) null);
		this.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
		this.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
		this.aClass5_Sub2_23.method4054(2, Static347.aClass80_2);
		this.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
		this.aClass5_Sub2_23.method3954(0);
		if (this.aBoolean465) {
			this.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
			this.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
			this.aBoolean465 = false;
		}
		if (this.anIDirect3DVertexShader5 != null) {
			this.aClass5_Sub2_Sub1_6.method1268((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader5 = null;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return this.aBoolean464;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	@Override
	public void method8705() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_Sub1_6.method4030();
			local8.a(0, local13.method6309(Static278.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		this.aBoolean463 = arg0;
		this.aClass5_Sub2_23.method3954(1);
		this.aClass5_Sub2_23.method4008(this.anInterface15_3);
		this.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static558.aClass144_5);
		this.aClass5_Sub2_23.method4054(0, Static347.aClass80_2);
		this.aClass5_Sub2_23.method4029(2, true, Static522.aClass80_4, false);
		this.aClass5_Sub2_23.method3956(Static115.aClass80_1, 0);
		this.aClass5_Sub2_23.method3954(0);
		this.method8711();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method8701() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(11) Class115_Sub3 local11 = this.aClass5_Sub2_Sub1_6.method4030();
			local6.a(0, local11.method6309(Static278.aFloatArray57));
		}
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
	@Override
	public void method8711() {
		@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1;
		@Pc(12) int local12 = this.aClass5_Sub2_23.method4020();
		@Pc(17) Class115_Sub3 local17 = this.aClass5_Sub2_23.method3959();
		@Pc(29) IDirect3DVertexShader local29;
		if (this.aBoolean463) {
			local29 = Integer.MIN_VALUE == ~local12 ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader7;
		} else {
			local29 = local12 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader8 : this.anIDirect3DVertexShader4;
		}
		if (this.anIDirect3DVertexShader5 != local29) {
			this.anIDirect3DVertexShader5 = local29;
			this.aClass5_Sub2_Sub1_6.method1268(local29);
			this.method4929();
			this.method8704();
			this.method8713();
			this.method8705();
			this.method8701();
			this.method8702();
		}
		local17.method6301(0.0F, -1.0F, (float) local12, Static278.aFloatArray56, 0.0F);
		local7.a(12, Static278.aFloatArray56);
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	@Override
	public void method8713() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub2_Sub1_6.anIDirect3DDevice1;
			@Pc(14) Class115_Sub3 local14 = this.aClass5_Sub2_23.method4064();
			local7.SetVertexShaderConstantF(8, local14.method6310(Static278.aFloatArray57), 2);
		}
	}
}
