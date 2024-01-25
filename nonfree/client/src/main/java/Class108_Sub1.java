import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class108_Sub1 extends Class108 {

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "Lclient!mh;")
	private final Class126_Sub2_Sub2 aClass126_Sub2_Sub2_4;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Lclient!tr;")
	private Interface25 anInterface25_1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!mh;Lclient!wu;)V")
	public Class108_Sub1(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class384 arg1) {
		super(arg0);
		this.aClass126_Sub2_Sub2_4 = arg0;
		if (arg1 == null || (this.aClass126_Sub2_Sub2_4.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean215 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1.b(arg1.method8871("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1.b(arg1.method8871("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1.b(arg1.method8871("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1.b(arg1.method8871("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface25_1 = this.aClass126_Sub2_23.method5553(2, new int[] { 0, -1 }, false, 1);
				this.anInterface25_1.method7630(false, false);
				this.aBoolean215 = true;
			} else {
				this.aBoolean215 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	@Override
	public void method8705() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1;
			@Pc(13) Class117_Sub2 local13 = this.aClass126_Sub2_Sub2_4.method5539();
			local8.a(0, local13.method3879(Static155.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
	private void method2270() {
		if (this.anIDirect3DVertexShader1 == null || !this.aBoolean214) {
			return;
		}
		@Pc(11) Class117_Sub2 local11 = this.aClass126_Sub2_23.method5478();
		@Pc(15) IDirect3DDevice local15 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1;
		local15.b(13, this.aClass126_Sub2_23.aFloat122 * this.aClass126_Sub2_23.aFloat119, this.aClass126_Sub2_23.aFloat119 * this.aClass126_Sub2_23.aFloat129, this.aClass126_Sub2_23.aFloat126 * this.aClass126_Sub2_23.aFloat119, 1.0F);
		local15.b(14, this.aClass126_Sub2_23.aFloat122 * this.aClass126_Sub2_23.aFloat131, this.aClass126_Sub2_23.aFloat131 * this.aClass126_Sub2_23.aFloat129, this.aClass126_Sub2_23.aFloat126 * this.aClass126_Sub2_23.aFloat131, 1.0F);
		local15.b(16, this.aClass126_Sub2_23.aFloat132 * this.aClass126_Sub2_23.aFloat122, this.aClass126_Sub2_23.aFloat132 * this.aClass126_Sub2_23.aFloat129, this.aClass126_Sub2_23.aFloat126 * this.aClass126_Sub2_23.aFloat132, 1.0F);
		local11.method3872(Static155.aFloatArray5, this.aClass126_Sub2_23.aFloatArray37[2], this.aClass126_Sub2_23.aFloatArray37[0], this.aClass126_Sub2_23.aFloatArray37[1]);
		local15.SetVertexShaderConstantF(15, Static155.aFloatArray5, 1);
		local11.method3872(Static155.aFloatArray5, this.aClass126_Sub2_23.bf[2], this.aClass126_Sub2_23.bf[0], this.aClass126_Sub2_23.bf[1]);
		local15.SetVertexShaderConstantF(17, Static155.aFloatArray5, 1);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	@Override
	public void method8698() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1;
			@Pc(17) Class117_Sub2 local17 = this.aClass126_Sub2_23.method5499();
			local12.SetVertexShaderConstantF(8, local17.method3862(Static155.aFloatArray6), 2);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		this.aBoolean214 = arg0;
		this.aClass126_Sub2_23.method5560(1);
		this.aClass126_Sub2_23.method5449(this.anInterface25_1);
		this.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static646.aClass10_5);
		this.aClass126_Sub2_23.method5466(0, Static645.aClass294_5);
		this.aClass126_Sub2_23.method5537(2, Static256.aClass294_4, false, true);
		this.aClass126_Sub2_23.method5471(Static131.aClass294_2, 0);
		this.aClass126_Sub2_23.method5560(0);
		this.method8706();
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	@Override
	public void method8711() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1;
			local6.a(4, this.aClass126_Sub2_23.method5447(Static155.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean213) {
				this.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
				this.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
				this.aBoolean213 = false;
			}
			this.aClass126_Sub2_23.method5449(arg0);
			this.aClass126_Sub2_23.method5513(arg1);
		} else if (!this.aBoolean213) {
			this.aClass126_Sub2_23.method5449(this.aClass126_Sub2_23.anInterface27_3);
			this.aClass126_Sub2_23.method5513(1);
			this.aClass126_Sub2_23.method5466(0, Static131.aClass294_2);
			this.aClass126_Sub2_23.method5471(Static131.aClass294_2, 0);
			this.aBoolean213 = true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1;
			@Pc(18) Class117_Sub2 local18 = this.aClass126_Sub2_Sub2_4.method5539();
			local13.a(0, local18.method3879(Static155.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	@Override
	public void method8704() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(13) IDirect3DDevice local13 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1;
		@Pc(17) int local17 = this.aClass126_Sub2_23.XA();
		@Pc(21) int local21 = this.aClass126_Sub2_23.i();
		@Pc(31) float local31 = (float) local17 - (float) (local17 - local21) * 0.125F;
		@Pc(43) float local43 = -((float) (local17 - local21) * 0.25F) + (float) local17;
		local13.b(10, local43, 1.0F / (local31 - local43), local31, 1.0F / ((float) local17 - local31));
		local13.b(11, 1.0F / (float) this.aClass126_Sub2_23.method5555(), (float) this.aClass126_Sub2_23.method5498() / 255.0F, this.aClass126_Sub2_23.aFloat123, 1.0F / (this.aClass126_Sub2_23.aFloat123 - this.aClass126_Sub2_23.aFloat120));
		this.aClass126_Sub2_23.method5496(this.aClass126_Sub2_23.method5522());
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return this.aBoolean215;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		this.aClass126_Sub2_23.method5560(1);
		this.aClass126_Sub2_23.method5449((Interface27) null);
		this.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
		this.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
		this.aClass126_Sub2_23.method5466(2, Static645.aClass294_5);
		this.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
		this.aClass126_Sub2_23.method5560(0);
		if (this.aBoolean213) {
			this.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
			this.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
			this.aBoolean213 = false;
		}
		if (this.anIDirect3DVertexShader1 != null) {
			this.aClass126_Sub2_Sub2_4.method5575((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	@Override
	public void method8706() {
		@Pc(11) IDirect3DDevice local11 = this.aClass126_Sub2_Sub2_4.anIDirect3DDevice1;
		@Pc(16) int local16 = this.aClass126_Sub2_23.method5573();
		@Pc(21) Class117_Sub2 local21 = this.aClass126_Sub2_23.method5493();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean214) {
			local33 = local16 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader4;
		} else {
			local33 = local16 == Integer.MAX_VALUE ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader3;
		}
		if (local33 != this.anIDirect3DVertexShader1) {
			this.anIDirect3DVertexShader1 = local33;
			this.aClass126_Sub2_Sub2_4.method5575(local33);
			this.method2270();
			this.method8711();
			this.method8698();
			this.method8703();
			this.method8705();
			this.method8704();
		}
		local21.method3877(Static155.aFloatArray5, -1.0F, 0.0F, 0.0F, (float) local16);
		local11.a(12, Static155.aFloatArray5);
	}
}
