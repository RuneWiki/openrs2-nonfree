import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class93_Sub6 extends Class93 {

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "Z")
	private boolean aBoolean634;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "Lclient!ss;")
	private final Class66_Sub1_Sub2 aClass66_Sub1_Sub2_8;

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "Z")
	private final boolean aBoolean635;

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!ss;Lclient!bi;)V")
	public Class93_Sub6(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class31 arg1) {
		super(arg0);
		this.aClass66_Sub1_Sub2_8 = arg0;
		if ((this.aClass66_Sub1_Sub2_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean635 = false;
		} else {
			this.anIDirect3DVertexShader6 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method662("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader2 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method662("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method662("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader3 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1.a(arg1.method662("dx", "uw_model_lit"));
			this.aBoolean635 = this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader6 != null;
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return this.aBoolean635;
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
	@Override
	public void method8005() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(15) Class134_Sub1 local15 = this.aClass66_Sub1_Sub2_8.method6940();
			local8.a(0, local15.method3406(Static544.aFloatArray65));
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
		this.aClass66_Sub1_19.method6979(arg1);
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	@Override
	public void method7999() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass66_Sub1_19.IA();
		@Pc(15) int local15 = this.aClass66_Sub1_19.U();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(39) float local39 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.a(10, local39, 1.0F / (local27 - local39), local27, 1.0F / ((float) local11 - local27));
		local7.a(11, 1.0F / (float) this.aClass66_Sub1_19.method6934(), (float) this.aClass66_Sub1_19.method6954() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
	@Override
	public void method8006() {
		@Pc(3) IDirect3DDevice local3 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1;
		@Pc(16) int local16 = this.aClass66_Sub1_19.method6871();
		@Pc(21) Class134_Sub1 local21 = this.aClass66_Sub1_19.method6939();
		@Pc(33) IDirect3DVertexShader local33;
		if (this.aBoolean634) {
			local33 = Integer.MAX_VALUE == local16 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader3;
		} else {
			local33 = Integer.MAX_VALUE == local16 ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader4 != local33) {
			this.anIDirect3DVertexShader4 = local33;
			local3.SetVertexShader(local33);
			this.method7547();
			this.method8004();
			this.method7994();
			this.method8003();
			this.method8005();
			this.method7999();
		}
		local21.method3402(0.0F, 0.0F, (float) local16, Static544.aFloatArray66, -1.0F);
		local3.a(12, Static544.aFloatArray66);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		this.aBoolean634 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	@Override
	public void method7994() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(20) Class134_Sub1 local20 = this.aClass66_Sub1_19.method6869();
			local15.SetVertexShaderConstantF(8, local20.method3397(Static544.aFloatArray65), 2);
		}
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
	@Override
	public void method8003() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1;
			@Pc(13) Class134_Sub1 local13 = this.aClass66_Sub1_Sub2_8.method6940();
			local8.a(0, local13.method3406(Static544.aFloatArray65));
		}
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "(I)V")
	private void method7547() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean634) {
			return;
		}
		@Pc(11) Class134_Sub1 local11 = this.aClass66_Sub1_19.method6939();
		@Pc(15) IDirect3DDevice local15 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1;
		local15.a(13, this.aClass66_Sub1_19.aFloat168 * this.aClass66_Sub1_19.aFloat174, this.aClass66_Sub1_19.aFloat168 * this.aClass66_Sub1_19.aFloat172, this.aClass66_Sub1_19.aFloat168 * this.aClass66_Sub1_19.aFloat173, 1.0F);
		local15.a(14, this.aClass66_Sub1_19.aFloat183 * this.aClass66_Sub1_19.aFloat174, this.aClass66_Sub1_19.aFloat172 * this.aClass66_Sub1_19.aFloat183, this.aClass66_Sub1_19.aFloat173 * this.aClass66_Sub1_19.aFloat183, 1.0F);
		local15.a(16, this.aClass66_Sub1_19.aFloat174 * this.aClass66_Sub1_19.bf, this.aClass66_Sub1_19.aFloat172 * this.aClass66_Sub1_19.bf, this.aClass66_Sub1_19.bf * this.aClass66_Sub1_19.aFloat173, 1.0F);
		local11.method3414(Static544.aFloatArray66, this.aClass66_Sub1_19.aFloatArray58[1], this.aClass66_Sub1_19.aFloatArray58[0], this.aClass66_Sub1_19.aFloatArray58[2]);
		local15.SetVertexShaderConstantF(15, Static544.aFloatArray66, 1);
		local11.method3414(Static544.aFloatArray66, this.aClass66_Sub1_19.aFloatArray57[1], this.aClass66_Sub1_19.aFloatArray57[0], this.aClass66_Sub1_19.aFloatArray57[2]);
		local15.SetVertexShaderConstantF(15, Static544.aFloatArray66, 1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	@Override
	public void method8004() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass66_Sub1_Sub2_8.anIDirect3DDevice1;
			local11.a(4, this.aClass66_Sub1_19.method6965(Static544.aFloatArray65));
		}
	}
}
