import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!rja;")
	private final Class13_Sub1_Sub2 aClass13_Sub1_Sub2_5;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
	private final boolean aBoolean481;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!ec;")
	private Interface7 anInterface7_4;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rja;Lclient!aj;)V")
	public Class4_Sub6(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class15 arg1) {
		super(arg0);
		this.aClass13_Sub1_Sub2_5 = arg0;
		if (arg1 == null || (this.aClass13_Sub1_Sub2_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean481 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method533("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method533("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader3 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method533("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader2 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1.b(arg1.method533("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface7_4 = this.aClass13_Sub1_23.method7526(2, 1, false, new int[] { 0, -1 });
				this.anInterface7_4.method5805(false, false);
				this.aBoolean481 = true;
			} else {
				this.aBoolean481 = false;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(B)V")
	private void method6085() {
		if (this.anIDirect3DVertexShader1 == null || !this.aBoolean479) {
			return;
		}
		@Pc(12) Class239_Sub3 local12 = this.aClass13_Sub1_23.method7437();
		@Pc(16) IDirect3DDevice local16 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1;
		local16.b(13, this.aClass13_Sub1_23.aFloat172 * this.aClass13_Sub1_23.aFloat176, this.aClass13_Sub1_23.aFloat172 * this.aClass13_Sub1_23.aFloat187, this.aClass13_Sub1_23.aFloat181 * this.aClass13_Sub1_23.aFloat172, 1.0F);
		local16.b(14, this.aClass13_Sub1_23.aFloat176 * this.aClass13_Sub1_23.aFloat183, this.aClass13_Sub1_23.aFloat187 * this.aClass13_Sub1_23.aFloat183, this.aClass13_Sub1_23.aFloat183 * this.aClass13_Sub1_23.aFloat181, 1.0F);
		local16.b(16, this.aClass13_Sub1_23.aFloat176 * this.aClass13_Sub1_23.aFloat179, this.aClass13_Sub1_23.aFloat179 * this.aClass13_Sub1_23.aFloat187, this.aClass13_Sub1_23.aFloat179 * this.aClass13_Sub1_23.aFloat181, 1.0F);
		local12.method9262(this.aClass13_Sub1_23.aFloatArray72[1], this.aClass13_Sub1_23.aFloatArray72[2], this.aClass13_Sub1_23.aFloatArray72[0], Static422.aFloatArray48);
		local16.SetVertexShaderConstantF(15, Static422.aFloatArray48, 1);
		local12.method9262(this.aClass13_Sub1_23.aFloatArray70[1], this.aClass13_Sub1_23.aFloatArray70[2], this.aClass13_Sub1_23.aFloatArray70[0], Static422.aFloatArray48);
		local16.SetVertexShaderConstantF(17, Static422.aFloatArray48, 1);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		if (arg1 != null) {
			if (this.aBoolean480) {
				this.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
				this.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
				this.aBoolean480 = false;
			}
			this.aClass13_Sub1_23.method7530(arg1);
			this.aClass13_Sub1_23.method7509(arg0);
		} else if (!this.aBoolean480) {
			this.aClass13_Sub1_23.method7530(this.aClass13_Sub1_23.anInterface3_3);
			this.aClass13_Sub1_23.method7509(1);
			this.aClass13_Sub1_23.method7522(Static348.aClass326_4, 0);
			this.aClass13_Sub1_23.method7517(0, Static348.aClass326_4);
			this.aBoolean480 = true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return this.aBoolean481;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
	@Override
	public void method7853() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass13_Sub1_23.XA();
		@Pc(22) int local22 = this.aClass13_Sub1_23.i();
		@Pc(33) float local33 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(44) float local44 = -((float) (local18 - local22) * 0.25F) + (float) local18;
		local14.b(10, local44, 1.0F / (local33 - local44), local33, 1.0F / ((float) local18 - local33));
		local14.b(11, 1.0F / (float) this.aClass13_Sub1_23.method7414(), (float) this.aClass13_Sub1_23.method7429() / 255.0F, this.aClass13_Sub1_23.aFloat175, 1.0F / (this.aClass13_Sub1_23.aFloat175 - this.aClass13_Sub1_23.aFloat174));
		this.aClass13_Sub1_23.method7539(this.aClass13_Sub1_23.method7467());
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		this.aClass13_Sub1_23.method7461(1);
		this.aClass13_Sub1_23.method7530((Interface3) null);
		this.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
		this.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
		this.aClass13_Sub1_23.method7522(Static125.aClass326_1, 2);
		this.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
		this.aClass13_Sub1_23.method7461(0);
		if (this.aBoolean480) {
			this.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
			this.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
			this.aBoolean480 = false;
		}
		if (this.anIDirect3DVertexShader1 != null) {
			this.aClass13_Sub1_Sub2_5.method7545((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
	@Override
	public void method7851() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(20) Class239_Sub3 local20 = this.aClass13_Sub1_23.method7420();
			local15.SetVertexShaderConstantF(8, local20.method9264(Static422.aFloatArray49), 2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	@Override
	public void method7855() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(12) Class239_Sub3 local12 = this.aClass13_Sub1_Sub2_5.method7431();
			local7.a(0, local12.method9263(Static422.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	@Override
	public void method7847() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1;
			@Pc(11) Class239_Sub3 local11 = this.aClass13_Sub1_Sub2_5.method7431();
			local6.a(0, local11.method9263(Static422.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	@Override
	public void method7857() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1;
			local12.a(4, this.aClass13_Sub1_23.method7411(Static422.aFloatArray49));
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V")
	@Override
	public void method7854() {
		@Pc(3) IDirect3DDevice local3 = this.aClass13_Sub1_Sub2_5.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass13_Sub1_23.method7532();
		@Pc(17) Class239_Sub3 local17 = this.aClass13_Sub1_23.method7412();
		@Pc(31) IDirect3DVertexShader local31;
		if (this.aBoolean479) {
			local31 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader2;
		} else {
			local31 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader3;
		}
		if (local31 != this.anIDirect3DVertexShader1) {
			this.anIDirect3DVertexShader1 = local31;
			this.aClass13_Sub1_Sub2_5.method7545(local31);
			this.method6085();
			this.method7857();
			this.method7851();
			this.method7855();
			this.method7847();
			this.method7853();
		}
		local17.method9270(-1.0F, 0.0F, (float) local8, 0.0F, Static422.aFloatArray48);
		local3.a(12, Static422.aFloatArray48);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		this.aBoolean479 = arg0;
		this.aClass13_Sub1_23.method7461(1);
		this.aClass13_Sub1_23.method7530(this.anInterface7_4);
		this.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static582.aClass203_5);
		this.aClass13_Sub1_23.method7522(Static125.aClass326_1, 0);
		this.aClass13_Sub1_23.method7498(true, false, 2, Static523.aClass326_5);
		this.aClass13_Sub1_23.method7517(0, Static348.aClass326_4);
		this.aClass13_Sub1_23.method7461(0);
		this.method7854();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
