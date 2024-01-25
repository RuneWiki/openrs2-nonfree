import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class34_Sub8 extends Class34 {

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Lclient!ik;")
	private final Class162_Sub1_Sub1 aClass162_Sub1_Sub1_7;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Z")
	private final boolean aBoolean497;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!fj;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!ik;Lclient!mv;)V")
	public Class34_Sub8(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class229 arg1) {
		super(arg0);
		this.aClass162_Sub1_Sub1_7 = arg0;
		if (arg1 == null || (this.aClass162_Sub1_Sub1_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean497 = false;
		} else {
			this.anIDirect3DVertexShader7 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method4953("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method4953("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader3 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method4953("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1.a(arg1.method4953("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader7 != null & this.anIDirect3DVertexShader6 != null) {
				this.anInterface11_5 = this.aClass162_Sub1_23.method3904(1, 2, false, new int[] { 0, -1 });
				this.anInterface11_5.method7639(false, false);
				this.aBoolean497 = true;
			} else {
				this.aBoolean497 = false;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
	@Override
	public void method7360() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_Sub1_7.method3857();
			local8.a(0, local13.method2697(Static381.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return this.aBoolean497;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	@Override
	public void method7359() {
		@Pc(3) IDirect3DDevice local3 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(12) int local12 = this.aClass162_Sub1_23.method3880();
		@Pc(17) Class25_Sub2 local17 = this.aClass162_Sub1_23.method3841();
		@Pc(31) IDirect3DVertexShader local31;
		if (this.aBoolean496) {
			local31 = Integer.MIN_VALUE == ~local12 ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader4;
		} else {
			local31 = ~local12 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader7 : this.anIDirect3DVertexShader3;
		}
		if (local31 != this.anIDirect3DVertexShader5) {
			this.anIDirect3DVertexShader5 = local31;
			local3.SetVertexShader(local31);
			this.method5293();
			this.method7354();
			this.method7364();
			this.method7352();
			this.method7360();
			this.method7365();
		}
		local17.method2716(0.0F, 0.0F, Static381.aFloatArray51, (float) local12, -1.0F);
		local3.a(12, Static381.aFloatArray51);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		this.aClass162_Sub1_23.method3926(1);
		this.aClass162_Sub1_23.method3865(null);
		this.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
		this.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
		this.aClass162_Sub1_23.method3885(Static504.aClass263_4, 2);
		this.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
		this.aClass162_Sub1_23.method3926(0);
		this.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
		this.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
		if (this.anIDirect3DVertexShader5 != null) {
			this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader5 = null;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	@Override
	public void method7352() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(12) Class25_Sub2 local12 = this.aClass162_Sub1_Sub1_7.method3857();
			local7.a(0, local12.method2697(Static381.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	@Override
	public void method7365() {
		if (this.anIDirect3DVertexShader5 == null) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass162_Sub1_23.U();
		@Pc(18) int local18 = this.aClass162_Sub1_23.BA();
		@Pc(28) float local28 = (float) local14 - (float) (local14 - local18) * 0.125F;
		@Pc(39) float local39 = (float) local14 - (float) (local14 - local18) * 0.25F;
		local10.a(10, local39, 1.0F / (local28 - local39), local28, 1.0F / ((float) local14 - local28));
		local10.a(11, 1.0F / (float) this.aClass162_Sub1_23.method3878(), (float) this.aClass162_Sub1_23.method3897() / 255.0F, this.aClass162_Sub1_23.aFloat131, 1.0F / (this.aClass162_Sub1_23.aFloat131 - this.aClass162_Sub1_23.aFloat145));
		this.aClass162_Sub1_23.method3891(this.aClass162_Sub1_23.method3936());
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		this.aBoolean496 = arg0;
		this.aClass162_Sub1_23.method3926(1);
		this.aClass162_Sub1_23.method3865(this.anInterface11_5);
		this.aClass162_Sub1_23.method3867(Static584.aClass247_5, Static317.aClass247_2);
		this.aClass162_Sub1_23.method3885(Static504.aClass263_4, 0);
		this.aClass162_Sub1_23.method3828(true, false, Static191.aClass263_2, 2);
		this.aClass162_Sub1_23.method3877(0, Static64.aClass263_1);
		this.aClass162_Sub1_23.method3926(0);
		this.method7359();
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	@Override
	public void method7364() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1;
			@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_23.method3956();
			local8.SetVertexShaderConstantF(8, local13.method2713(Static381.aFloatArray52), 2);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			this.aClass162_Sub1_23.method3865(this.aClass162_Sub1_23.anInterface20_3);
			this.aClass162_Sub1_23.method3906(1);
			this.aClass162_Sub1_23.method3885(Static64.aClass263_1, 0);
			this.aClass162_Sub1_23.method3877(0, Static64.aClass263_1);
		} else {
			this.aClass162_Sub1_23.method3865(arg0);
			this.aClass162_Sub1_23.method3906(arg1);
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	@Override
	public void method7354() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1;
			local11.a(4, this.aClass162_Sub1_23.method3871(Static381.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
	private void method5293() {
		if (this.anIDirect3DVertexShader5 == null || !this.aBoolean496) {
			return;
		}
		@Pc(18) Class25_Sub2 local18 = this.aClass162_Sub1_23.method3909();
		@Pc(22) IDirect3DDevice local22 = this.aClass162_Sub1_Sub1_7.anIDirect3DDevice1;
		local22.a(13, this.aClass162_Sub1_23.aFloat143 * this.aClass162_Sub1_23.aFloat144, this.aClass162_Sub1_23.aFloat139 * this.aClass162_Sub1_23.aFloat144, this.aClass162_Sub1_23.aFloat144 * this.aClass162_Sub1_23.aFloat138, 1.0F);
		local22.a(14, this.aClass162_Sub1_23.aFloat143 * this.aClass162_Sub1_23.aFloat140, this.aClass162_Sub1_23.aFloat140 * this.aClass162_Sub1_23.aFloat139, this.aClass162_Sub1_23.aFloat140 * this.aClass162_Sub1_23.aFloat138, 1.0F);
		local22.a(16, this.aClass162_Sub1_23.aFloat142 * this.aClass162_Sub1_23.aFloat143, this.aClass162_Sub1_23.aFloat142 * this.aClass162_Sub1_23.aFloat139, this.aClass162_Sub1_23.aFloat138 * this.aClass162_Sub1_23.aFloat142, 1.0F);
		local18.method2703(Static381.aFloatArray51, this.aClass162_Sub1_23.aFloatArray39[2], this.aClass162_Sub1_23.aFloatArray39[1], this.aClass162_Sub1_23.aFloatArray39[0]);
		local22.SetVertexShaderConstantF(15, Static381.aFloatArray51, 1);
		local18.method2703(Static381.aFloatArray51, this.aClass162_Sub1_23.aFloatArray42[2], this.aClass162_Sub1_23.aFloatArray42[1], this.aClass162_Sub1_23.aFloatArray42[0]);
		local22.SetVertexShaderConstantF(17, Static381.aFloatArray51, 1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
