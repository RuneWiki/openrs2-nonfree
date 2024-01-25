import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class26_Sub6 extends Class26 {

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "Z")
	private boolean aBoolean454;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "Lclient!wu;")
	private final Class145_Sub1_Sub2 aClass145_Sub1_Sub2_7;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "Z")
	private final boolean aBoolean456;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "Lclient!de;")
	private Interface4 anInterface4_3;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!wu;Lclient!nca;)V")
	public Class26_Sub6(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class254 arg1) {
		super(arg0);
		this.aClass145_Sub1_Sub2_7 = arg0;
		if (arg1 == null || (this.aClass145_Sub1_Sub2_7.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean456 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6104("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader6 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6104("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader4 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6104("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader3 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1.a(arg1.method6104("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface4_3 = this.aClass145_Sub1_21.method9753(new int[] { 0, -1 }, false, 1, 2);
				this.anInterface4_3.method6853(false, false);
				this.aBoolean456 = true;
			} else {
				this.aBoolean456 = false;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "(Z)V")
	private void method4839() {
		if (this.anIDirect3DVertexShader7 == null || !this.aBoolean454) {
			return;
		}
		@Pc(18) Class86_Sub2 local18 = this.aClass145_Sub1_21.method9759();
		@Pc(22) IDirect3DDevice local22 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1;
		local22.b(13, this.aClass145_Sub1_21.aFloat194 * this.aClass145_Sub1_21.aFloat181, this.aClass145_Sub1_21.aFloat194 * this.aClass145_Sub1_21.aFloat188, this.aClass145_Sub1_21.aFloat194 * this.aClass145_Sub1_21.aFloat184, 1.0F);
		local22.b(14, this.aClass145_Sub1_21.aFloat181 * this.aClass145_Sub1_21.aFloat191, this.aClass145_Sub1_21.aFloat191 * this.aClass145_Sub1_21.aFloat188, this.aClass145_Sub1_21.aFloat184 * this.aClass145_Sub1_21.aFloat191, 1.0F);
		local22.b(16, this.aClass145_Sub1_21.aFloat181 * this.aClass145_Sub1_21.aFloat195, this.aClass145_Sub1_21.aFloat195 * this.aClass145_Sub1_21.aFloat188, this.aClass145_Sub1_21.aFloat184 * this.aClass145_Sub1_21.aFloat195, 1.0F);
		local18.method2719(Static349.aFloatArray26, this.aClass145_Sub1_21.aFloatArray74[0], this.aClass145_Sub1_21.aFloatArray74[1], this.aClass145_Sub1_21.aFloatArray74[2]);
		local22.SetVertexShaderConstantF(15, Static349.aFloatArray26, 1);
		local18.method2719(Static349.aFloatArray26, this.aClass145_Sub1_21.aFloatArray68[0], this.aClass145_Sub1_21.aFloatArray68[1], this.aClass145_Sub1_21.aFloatArray68[2]);
		local22.SetVertexShaderConstantF(17, Static349.aFloatArray26, 1);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)V")
	@Override
	public void method8000() {
		if (this.anIDirect3DVertexShader7 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(16) int local16 = this.aClass145_Sub1_21.XA();
		@Pc(20) int local20 = this.aClass145_Sub1_21.i();
		@Pc(31) float local31 = (float) local16 - (float) (local16 - local20) * 0.125F;
		@Pc(42) float local42 = (float) local16 - (float) (local16 - local20) * 0.25F;
		local12.b(10, local42, 1.0F / (local31 - local42), local31, 1.0F / ((float) local16 - local31));
		local12.b(11, 1.0F / (float) this.aClass145_Sub1_21.method9827(), (float) this.aClass145_Sub1_21.method9746() / 255.0F, this.aClass145_Sub1_21.aFloat183, 1.0F / (this.aClass145_Sub1_21.aFloat183 - this.aClass145_Sub1_21.aFloat192));
		this.aClass145_Sub1_21.method9769(this.aClass145_Sub1_21.method9726());
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean455) {
				this.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
				this.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
				this.aBoolean455 = false;
			}
			this.aClass145_Sub1_21.method9754(arg0);
			this.aClass145_Sub1_21.method9797(arg1);
		} else if (!this.aBoolean455) {
			this.aClass145_Sub1_21.method9754(this.aClass145_Sub1_21.anInterface9_3);
			this.aClass145_Sub1_21.method9797(1);
			this.aClass145_Sub1_21.method9813(Static240.aClass352_6, 0);
			this.aClass145_Sub1_21.method9795(0, Static240.aClass352_6);
			this.aBoolean455 = true;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return this.aBoolean456;
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(Z)V")
	@Override
	public void method8008() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(11) Class86_Sub2 local11 = this.aClass145_Sub1_21.method9756();
			local6.SetVertexShaderConstantF(8, local11.method2725(Static349.aFloatArray27), 2);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		this.aBoolean454 = arg0;
		this.aClass145_Sub1_21.method9745(1);
		this.aClass145_Sub1_21.method9754(this.anInterface4_3);
		this.aClass145_Sub1_21.method9725(Static62.aClass293_1, Static162.aClass293_4);
		this.aClass145_Sub1_21.method9813(Static45.aClass352_1, 0);
		this.aClass145_Sub1_21.method9829(2, false, Static231.aClass352_5, true);
		this.aClass145_Sub1_21.method9795(0, Static240.aClass352_6);
		this.aClass145_Sub1_21.method9745(0);
		this.method7996();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	@Override
	public void method7999() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1;
			local15.a(4, this.aClass145_Sub1_21.method9807(Static349.aFloatArray27));
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
	@Override
	public void method7996() {
		@Pc(3) IDirect3DDevice local3 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass145_Sub1_21.method9791();
		@Pc(24) Class86_Sub2 local24 = this.aClass145_Sub1_21.method9721();
		@Pc(41) IDirect3DVertexShader local41;
		if (this.aBoolean454) {
			local41 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader3;
		} else {
			local41 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader4;
		}
		if (local41 != this.anIDirect3DVertexShader7) {
			this.anIDirect3DVertexShader7 = local41;
			this.aClass145_Sub1_Sub2_7.method9864(local41);
			this.method4839();
			this.method7999();
			this.method8008();
			this.method8002();
			this.method8005();
			this.method8000();
		}
		local24.method2722(0.0F, 0.0F, Static349.aFloatArray26, -1.0F, (float) local8);
		local3.a(12, Static349.aFloatArray26);
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(12) Class86_Sub2 local12 = this.aClass145_Sub1_Sub2_7.method9741();
			local7.a(0, local12.method2714(Static349.aFloatArray27));
		}
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(Z)V")
	@Override
	public void method8005() {
		if (this.anIDirect3DVertexShader7 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass145_Sub1_Sub2_7.anIDirect3DDevice1;
			@Pc(11) Class86_Sub2 local11 = this.aClass145_Sub1_Sub2_7.method9741();
			local6.a(0, local11.method2714(Static349.aFloatArray27));
		}
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		this.aClass145_Sub1_21.method9745(1);
		this.aClass145_Sub1_21.method9754((Interface9) null);
		this.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
		this.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
		this.aClass145_Sub1_21.method9813(Static45.aClass352_1, 2);
		this.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
		this.aClass145_Sub1_21.method9745(0);
		if (this.aBoolean455) {
			this.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
			this.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
			this.aBoolean455 = false;
		}
		if (this.anIDirect3DVertexShader7 != null) {
			this.aClass145_Sub1_Sub2_7.method9864((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader7 = null;
		}
	}
}
