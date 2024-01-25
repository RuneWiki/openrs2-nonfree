import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class74_Sub5 extends Class74 {

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "Lclient!lt;")
	private final Class87_Sub1_Sub2 aClass87_Sub1_Sub2_3;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "Z")
	private final boolean aBoolean383;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "Lclient!wda;")
	private Interface26 anInterface26_2;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!lt;Lclient!eq;)V")
	public Class74_Sub5(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class97 arg1) {
		super(arg0);
		this.aClass87_Sub1_Sub2_3 = arg0;
		if (arg1 == null || (this.aClass87_Sub1_Sub2_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean383 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1.b(arg1.method2567("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1.b(arg1.method2567("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1.b(arg1.method2567("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1.b(arg1.method2567("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader2 != null) {
				this.anInterface26_2 = this.aClass87_Sub1_22.method5098(false, 1, 2, new int[] { 0, -1 });
				this.anInterface26_2.method8053(false, false);
				this.aBoolean383 = true;
			} else {
				this.aBoolean383 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		this.aClass87_Sub1_22.method5116(1);
		this.aClass87_Sub1_22.method5079(null);
		this.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
		this.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
		this.aClass87_Sub1_22.method5131(2, Static358.aClass315_1);
		this.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
		this.aClass87_Sub1_22.method5116(0);
		if (this.aBoolean381) {
			this.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
			this.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
			this.aBoolean381 = false;
		}
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass87_Sub1_Sub2_3.method5157(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
	private void method3798() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean382) {
			return;
		}
		@Pc(11) Class6_Sub2 local11 = this.aClass87_Sub1_22.method5104();
		@Pc(15) IDirect3DDevice local15 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1;
		local15.a(13, this.aClass87_Sub1_22.aFloat140 * this.aClass87_Sub1_22.aFloat137, this.aClass87_Sub1_22.aFloat147 * this.aClass87_Sub1_22.aFloat140, this.aClass87_Sub1_22.aFloat140 * this.aClass87_Sub1_22.aFloat148, 1.0F);
		local15.a(14, this.aClass87_Sub1_22.aFloat137 * this.aClass87_Sub1_22.aFloat144, this.aClass87_Sub1_22.aFloat144 * this.aClass87_Sub1_22.aFloat147, this.aClass87_Sub1_22.aFloat144 * this.aClass87_Sub1_22.aFloat148, 1.0F);
		local15.a(16, this.aClass87_Sub1_22.aFloat134 * this.aClass87_Sub1_22.aFloat137, this.aClass87_Sub1_22.aFloat134 * this.aClass87_Sub1_22.aFloat147, this.aClass87_Sub1_22.aFloat148 * this.aClass87_Sub1_22.aFloat134, 1.0F);
		local11.method2711(this.aClass87_Sub1_22.aFloatArray52[1], this.aClass87_Sub1_22.aFloatArray52[2], this.aClass87_Sub1_22.aFloatArray52[0], Static221.aFloatArray37);
		local15.SetVertexShaderConstantF(15, Static221.aFloatArray37, 1);
		local11.method2711(this.aClass87_Sub1_22.aFloatArray44[1], this.aClass87_Sub1_22.aFloatArray44[2], this.aClass87_Sub1_22.aFloatArray44[0], Static221.aFloatArray37);
		local15.SetVertexShaderConstantF(17, Static221.aFloatArray37, 1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)V")
	@Override
	public void method8255() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_Sub2_3.method5100();
			local8.a(0, local13.method2701(Static221.aFloatArray38));
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		this.aBoolean382 = arg0;
		this.aClass87_Sub1_22.method5116(1);
		this.aClass87_Sub1_22.method5079(this.anInterface26_2);
		this.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static215.aClass300_4);
		this.aClass87_Sub1_22.method5131(0, Static358.aClass315_1);
		this.aClass87_Sub1_22.method5052(false, true, 2, Static516.aClass315_3);
		this.aClass87_Sub1_22.method5118(0, Static508.aClass315_2);
		this.aClass87_Sub1_22.method5116(0);
		this.method8256();
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
	@Override
	public void method8254() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1;
			local14.a(4, this.aClass87_Sub1_22.method5038(Static221.aFloatArray38));
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	@Override
	public void method8242() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(17) int local17 = this.aClass87_Sub1_22.XA();
		@Pc(21) int local21 = this.aClass87_Sub1_22.i();
		@Pc(32) float local32 = -((float) (local17 - local21) * 0.125F) + (float) local17;
		@Pc(43) float local43 = (float) local17 - (float) (local17 - local21) * 0.25F;
		local13.a(10, local43, 1.0F / (local32 - local43), local32, 1.0F / ((float) local17 - local32));
		local13.a(11, 1.0F / (float) this.aClass87_Sub1_22.method5061(), (float) this.aClass87_Sub1_22.method5081() / 255.0F, this.aClass87_Sub1_22.aFloat145, 1.0F / (this.aClass87_Sub1_22.aFloat145 - this.aClass87_Sub1_22.aFloat143));
		this.aClass87_Sub1_22.method5075(this.aClass87_Sub1_22.method5119());
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean381) {
				this.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
				this.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
				this.aBoolean381 = false;
			}
			this.aClass87_Sub1_22.method5079(arg0);
			this.aClass87_Sub1_22.method5062(arg1);
		} else if (!this.aBoolean381) {
			this.aClass87_Sub1_22.method5079(this.aClass87_Sub1_22.anInterface7_3);
			this.aClass87_Sub1_22.method5062(1);
			this.aClass87_Sub1_22.method5131(0, Static508.aClass315_2);
			this.aClass87_Sub1_22.method5118(0, Static508.aClass315_2);
			this.aBoolean381 = true;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return this.aBoolean383;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
	@Override
	public void method8256() {
		@Pc(3) IDirect3DDevice local3 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass87_Sub1_22.method5089();
		@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_22.method5147();
		@Pc(25) IDirect3DVertexShader local25;
		if (this.aBoolean382) {
			local25 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader3;
		} else {
			local25 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader2;
		}
		if (this.anIDirect3DVertexShader4 != local25) {
			this.anIDirect3DVertexShader4 = local25;
			this.aClass87_Sub1_Sub2_3.method5157(local25);
			this.method3798();
			this.method8254();
			this.method8246();
			this.method8255();
			this.method8247();
			this.method8242();
		}
		local13.method2703(0.0F, 0.0F, -1.0F, Static221.aFloatArray37, (float) local8);
		local3.a(12, Static221.aFloatArray37);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
	@Override
	public void method8246() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(12) Class6_Sub2 local12 = this.aClass87_Sub1_22.method5063();
			local7.SetVertexShaderConstantF(8, local12.method2722(Static221.aFloatArray38), 2);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	@Override
	public void method8247() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass87_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_Sub2_3.method5100();
			local8.a(0, local13.method2701(Static221.aFloatArray38));
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
	}
}
