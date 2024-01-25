import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class60_Sub6 extends Class60 {

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "Z")
	private boolean aBoolean513;

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "Z")
	private boolean aBoolean511 = false;

	@OriginalMember(owner = "client!nca", name = "w", descriptor = "Lclient!aia;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_6;

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!nca", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!nca", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "Z")
	private final boolean aBoolean512;

	@OriginalMember(owner = "client!nca", name = "m", descriptor = "Lclient!gl;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!aia;Lclient!gj;)V")
	public Class60_Sub6(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class143 arg1) {
		super(arg0);
		this.aClass16_Sub1_Sub1_6 = arg0;
		if (arg1 == null || (this.aClass16_Sub1_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean512 = false;
		} else {
			this.anIDirect3DVertexShader2 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method3119("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method3119("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method3119("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method3119("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null) {
				this.anInterface11_4 = this.aClass16_Sub1_23.method6276(1, false, 2, new int[] { 0, -1 });
				this.anInterface11_4.method8761(false, false);
				this.aBoolean512 = true;
			} else {
				this.aBoolean512 = false;
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		this.aBoolean513 = arg0;
		this.aClass16_Sub1_23.method6234(1);
		this.aClass16_Sub1_23.method6197(this.anInterface11_4);
		this.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static49.aClass11_2);
		this.aClass16_Sub1_23.method6284(Static262.aClass188_2, 0);
		this.aClass16_Sub1_23.method6277(Static70.aClass188_1, true, 2, false);
		this.aClass16_Sub1_23.method6326(0, Static622.aClass188_4);
		this.aClass16_Sub1_23.method6234(0);
		this.method8299();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
	@Override
	public void method8294() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass16_Sub1_23.XA();
		@Pc(15) int local15 = this.aClass16_Sub1_23.i();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(38) float local38 = (float) local11 - (float) (local11 - local15) * 0.25F;
		local7.b(10, local38, 1.0F / (local27 - local38), local27, 1.0F / ((float) local11 - local27));
		local7.b(11, 1.0F / (float) this.aClass16_Sub1_23.method6224(), (float) this.aClass16_Sub1_23.method6254() / 255.0F, this.aClass16_Sub1_23.aFloat165, 1.0F / (this.aClass16_Sub1_23.aFloat165 - this.aClass16_Sub1_23.aFloat162));
		this.aClass16_Sub1_23.method6263(this.aClass16_Sub1_23.method6274());
	}

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "(I)V")
	private void method5639() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean513) {
			return;
		}
		@Pc(17) Class25_Sub3 local17 = this.aClass16_Sub1_23.method6310();
		@Pc(21) IDirect3DDevice local21 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1;
		local21.b(13, this.aClass16_Sub1_23.aFloat161 * this.aClass16_Sub1_23.aFloat157, this.aClass16_Sub1_23.aFloat157 * this.aClass16_Sub1_23.aFloat159, this.aClass16_Sub1_23.aFloat157 * this.aClass16_Sub1_23.aFloat163, 1.0F);
		local21.b(14, this.aClass16_Sub1_23.aFloat161 * this.aClass16_Sub1_23.aFloat164, this.aClass16_Sub1_23.aFloat159 * this.aClass16_Sub1_23.aFloat164, this.aClass16_Sub1_23.aFloat163 * this.aClass16_Sub1_23.aFloat164, 1.0F);
		local21.b(16, this.aClass16_Sub1_23.aFloat166 * this.aClass16_Sub1_23.aFloat161, this.aClass16_Sub1_23.aFloat159 * this.aClass16_Sub1_23.aFloat166, this.aClass16_Sub1_23.aFloat163 * this.aClass16_Sub1_23.aFloat166, 1.0F);
		local17.method4307(Static386.aFloatArray45, this.aClass16_Sub1_23.aFloatArray57[2], this.aClass16_Sub1_23.aFloatArray57[1], this.aClass16_Sub1_23.aFloatArray57[0]);
		local21.SetVertexShaderConstantF(15, Static386.aFloatArray45, 1);
		local17.method4307(Static386.aFloatArray45, this.aClass16_Sub1_23.aFloatArray58[2], this.aClass16_Sub1_23.aFloatArray58[1], this.aClass16_Sub1_23.aFloatArray58[0]);
		local21.SetVertexShaderConstantF(17, Static386.aFloatArray45, 1);
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V")
	@Override
	public void method8297() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(19) Class25_Sub3 local19 = this.aClass16_Sub1_Sub1_6.method6198();
			local14.a(0, local19.method4328(Static386.aFloatArray46));
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean511) {
				this.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
				this.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
				this.aBoolean511 = false;
			}
			this.aClass16_Sub1_23.method6197(arg0);
			this.aClass16_Sub1_23.method6233(arg1);
		} else if (!this.aBoolean511) {
			this.aClass16_Sub1_23.method6197(this.aClass16_Sub1_23.anInterface3_3);
			this.aClass16_Sub1_23.method6233(1);
			this.aClass16_Sub1_23.method6284(Static622.aClass188_4, 0);
			this.aClass16_Sub1_23.method6326(0, Static622.aClass188_4);
			this.aBoolean511 = true;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "(I)V")
	@Override
	public void method8303() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1;
			local13.a(4, this.aClass16_Sub1_23.method6213(Static386.aFloatArray46));
		}
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		this.aClass16_Sub1_23.method6234(1);
		this.aClass16_Sub1_23.method6197((Interface3) null);
		this.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
		this.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
		this.aClass16_Sub1_23.method6284(Static262.aClass188_2, 2);
		this.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
		this.aClass16_Sub1_23.method6234(0);
		if (this.aBoolean511) {
			this.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
			this.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
			this.aBoolean511 = false;
		}
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass16_Sub1_Sub1_6.method692((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
	@Override
	public void method8299() {
		@Pc(3) IDirect3DDevice local3 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass16_Sub1_23.method6322();
		@Pc(19) Class25_Sub3 local19 = this.aClass16_Sub1_23.method6203();
		@Pc(31) IDirect3DVertexShader local31;
		if (this.aBoolean513) {
			local31 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader6;
		} else {
			local31 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader5;
		}
		if (local31 != this.anIDirect3DVertexShader3) {
			this.anIDirect3DVertexShader3 = local31;
			this.aClass16_Sub1_Sub1_6.method692(local31);
			this.method5639();
			this.method8303();
			this.method8292();
			this.method8297();
			this.method8298();
			this.method8294();
		}
		local19.method4317(0.0F, Static386.aFloatArray45, -1.0F, (float) local8, 0.0F);
		local3.a(12, Static386.aFloatArray45);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
	@Override
	public void method8292() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(19) Class25_Sub3 local19 = this.aClass16_Sub1_23.method6297();
			local14.SetVertexShaderConstantF(8, local19.method4312(Static386.aFloatArray46), 2);
		}
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)V")
	@Override
	public void method8298() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass16_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(18) Class25_Sub3 local18 = this.aClass16_Sub1_Sub1_6.method6198();
			local13.a(0, local18.method4328(Static386.aFloatArray46));
		}
	}
}
