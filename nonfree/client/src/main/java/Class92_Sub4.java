import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class92_Sub4 extends Class92 {

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Lclient!ui;")
	private final Class121_Sub2_Sub2 aClass121_Sub2_Sub2_6;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "Z")
	private final boolean aBoolean439;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ui;Lclient!pq;)V")
	public Class92_Sub4(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class251 arg1) {
		super(arg0);
		this.aClass121_Sub2_Sub2_6 = arg0;
		if ((this.aClass121_Sub2_Sub2_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean439 = false;
		} else {
			this.anIDirect3DVertexShader3 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1.a(arg1.method5836("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader2 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1.a(arg1.method5836("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1.a(arg1.method5836("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader4 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1.a(arg1.method5836("dx", "uw_model_lit"));
			this.aBoolean439 = this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader5 != null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		this.aClass121_Sub2_20.method7167(arg1);
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	@Override
	public void method7755() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1;
			local8.a(4, this.aClass121_Sub2_20.method7287(Static366.aFloatArray38));
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V")
	@Override
	public void method7757() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(10) IDirect3DDevice local10 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1;
			@Pc(15) Class34_Sub3 local15 = this.aClass121_Sub2_Sub2_6.method7189();
			local10.a(0, local15.method3755(Static366.aFloatArray38));
		}
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
	private void method5402() {
		if (this.anIDirect3DVertexShader1 == null || !this.aBoolean438) {
			return;
		}
		@Pc(11) Class34_Sub3 local11 = this.aClass121_Sub2_20.method7242();
		@Pc(15) IDirect3DDevice local15 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1;
		local15.a(13, this.aClass121_Sub2_20.aFloat199 * this.aClass121_Sub2_20.aFloat194, this.aClass121_Sub2_20.aFloat199 * this.aClass121_Sub2_20.aFloat186, this.aClass121_Sub2_20.aFloat199 * this.aClass121_Sub2_20.aFloat188, 1.0F);
		local15.a(14, this.aClass121_Sub2_20.aFloat185 * this.aClass121_Sub2_20.aFloat194, this.aClass121_Sub2_20.aFloat186 * this.aClass121_Sub2_20.aFloat185, this.aClass121_Sub2_20.aFloat185 * this.aClass121_Sub2_20.aFloat188, 1.0F);
		local15.a(16, this.aClass121_Sub2_20.aFloat194 * this.aClass121_Sub2_20.aFloat191, this.aClass121_Sub2_20.aFloat186 * this.aClass121_Sub2_20.aFloat191, this.aClass121_Sub2_20.aFloat191 * this.aClass121_Sub2_20.aFloat188, 1.0F);
		local11.method3766(this.aClass121_Sub2_20.aFloatArray59[1], this.aClass121_Sub2_20.aFloatArray59[2], Static366.aFloatArray39, this.aClass121_Sub2_20.aFloatArray59[0]);
		local15.SetVertexShaderConstantF(15, Static366.aFloatArray39, 1);
		local11.method3766(this.aClass121_Sub2_20.aFloatArray61[1], this.aClass121_Sub2_20.aFloatArray61[2], Static366.aFloatArray39, this.aClass121_Sub2_20.aFloatArray61[0]);
		local15.SetVertexShaderConstantF(15, Static366.aFloatArray39, 1);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		this.aBoolean438 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	@Override
	public void method7746() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1;
			@Pc(12) Class34_Sub3 local12 = this.aClass121_Sub2_20.method7284();
			local7.SetVertexShaderConstantF(8, local12.method3768(Static366.aFloatArray38), 2);
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	@Override
	public void method7752() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1;
			@Pc(12) Class34_Sub3 local12 = this.aClass121_Sub2_Sub2_6.method7189();
			local7.a(0, local12.method3755(Static366.aFloatArray38));
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	@Override
	public void method7747() {
		@Pc(3) IDirect3DDevice local3 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass121_Sub2_20.method7215();
		@Pc(13) Class34_Sub3 local13 = this.aClass121_Sub2_20.method7242();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean438) {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader4;
		} else {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader5;
		}
		if (local27 != this.anIDirect3DVertexShader1) {
			this.anIDirect3DVertexShader1 = local27;
			local3.SetVertexShader(local27);
			this.method5402();
			this.method7755();
			this.method7746();
			this.method7752();
			this.method7757();
			this.method7750();
		}
		local13.method3771(-1.0F, Static366.aFloatArray39, (float) local8, 0.0F, 0.0F);
		local3.a(12, Static366.aFloatArray39);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		if (this.anIDirect3DVertexShader1 != null) {
			this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	@Override
	public void method7750() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass121_Sub2_Sub2_6.anIDirect3DDevice1;
		@Pc(14) int local14 = this.aClass121_Sub2_20.IA();
		@Pc(18) int local18 = this.aClass121_Sub2_20.U();
		@Pc(29) float local29 = (float) local14 - (float) (local14 - local18) * 0.125F;
		@Pc(40) float local40 = (float) local14 - (float) (local14 - local18) * 0.25F;
		local10.a(10, local40, 1.0F / (local29 - local40), local29, 1.0F / ((float) local14 - local29));
		local10.a(11, 1.0F / (float) this.aClass121_Sub2_20.method7247(), (float) this.aClass121_Sub2_20.method7283() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
	}
}
