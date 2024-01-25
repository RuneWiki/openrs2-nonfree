import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class34_Sub11 extends Class34 {

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "Lclient!tb;")
	private final Class134_Sub1_Sub2 aClass134_Sub1_Sub2_9;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Z")
	private final boolean aBoolean666;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Lclient!oi;")
	private Interface14 anInterface14_6;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!tb;Lclient!pu;)V")
	public Class34_Sub11(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class270 arg1) {
		super(arg0);
		this.aClass134_Sub1_Sub2_9 = arg0;
		if (arg1 == null || (this.aClass134_Sub1_Sub2_9.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean666 = false;
		} else {
			this.anIDirect3DVertexShader6 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1.a(arg1.method5706("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1.a(arg1.method5706("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1.a(arg1.method5706("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader7 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1.a(arg1.method5706("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader7 != null) {
				this.anInterface14_6 = this.aClass134_Sub1_21.method6821(2, false, new int[] { 0, -1 }, 1);
				this.anInterface14_6.method2130(false, false);
				this.aBoolean666 = true;
			} else {
				this.aBoolean666 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		this.aClass134_Sub1_21.method6788(1);
		this.aClass134_Sub1_21.method6766(null);
		this.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
		this.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
		this.aClass134_Sub1_21.method6742(2, Static308.aClass192_1);
		this.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
		this.aClass134_Sub1_21.method6788(0);
		this.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
		this.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
		if (this.anIDirect3DVertexShader5 != null) {
			this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader5 = null;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	@Override
	public void method7010() {
		@Pc(3) IDirect3DDevice local3 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass134_Sub1_21.method6784();
		@Pc(13) Class113_Sub3 local13 = this.aClass134_Sub1_21.method6847();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean665) {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader7;
		} else {
			local27 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader4;
		}
		if (local27 != this.anIDirect3DVertexShader5) {
			this.anIDirect3DVertexShader5 = local27;
			local3.SetVertexShader(local27);
			this.method7021();
			this.method7015();
			this.method7018();
			this.method7008();
			this.method7004();
			this.method7019();
		}
		local13.method6071(0.0F, -1.0F, (float) local8, 0.0F, Static502.aFloatArray57);
		local3.a(12, Static502.aFloatArray57);
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
	@Override
	public void method7019() {
		if (this.anIDirect3DVertexShader5 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1;
		@Pc(10) int local10 = this.aClass134_Sub1_21.U();
		@Pc(14) int local14 = this.aClass134_Sub1_21.BA();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		local6.b(10, local37, 1.0F / (local25 - local37), local25, 1.0F / ((float) local10 - local25));
		local6.b(11, 1.0F / (float) this.aClass134_Sub1_21.method6837(), (float) this.aClass134_Sub1_21.method6761() / 255.0F, this.aClass134_Sub1_21.aFloat187, 1.0F / (this.aClass134_Sub1_21.aFloat187 - this.aClass134_Sub1_21.aFloat201));
		this.aClass134_Sub1_21.method6738(this.aClass134_Sub1_21.method6734());
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)V")
	private void method7021() {
		if (this.anIDirect3DVertexShader5 == null || !this.aBoolean665) {
			return;
		}
		@Pc(18) Class113_Sub3 local18 = this.aClass134_Sub1_21.method6803();
		@Pc(22) IDirect3DDevice local22 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1;
		local22.b(13, this.aClass134_Sub1_21.aFloat189 * this.aClass134_Sub1_21.aFloat196, this.aClass134_Sub1_21.aFloat196 * this.aClass134_Sub1_21.bf, this.aClass134_Sub1_21.aFloat195 * this.aClass134_Sub1_21.aFloat196, 1.0F);
		local22.b(14, this.aClass134_Sub1_21.aFloat189 * this.aClass134_Sub1_21.aFloat198, this.aClass134_Sub1_21.aFloat198 * this.aClass134_Sub1_21.bf, this.aClass134_Sub1_21.aFloat195 * this.aClass134_Sub1_21.aFloat198, 1.0F);
		local22.b(16, this.aClass134_Sub1_21.aFloat189 * this.aClass134_Sub1_21.aFloat190, this.aClass134_Sub1_21.aFloat190 * this.aClass134_Sub1_21.bf, this.aClass134_Sub1_21.aFloat195 * this.aClass134_Sub1_21.aFloat190, 1.0F);
		local18.method6056(this.aClass134_Sub1_21.aFloatArray47[1], this.aClass134_Sub1_21.aFloatArray47[0], Static502.aFloatArray57, this.aClass134_Sub1_21.aFloatArray47[2]);
		local22.SetVertexShaderConstantF(15, Static502.aFloatArray57, 1);
		local18.method6056(this.aClass134_Sub1_21.aFloatArray52[1], this.aClass134_Sub1_21.aFloatArray52[0], Static502.aFloatArray57, this.aClass134_Sub1_21.aFloatArray52[2]);
		local22.SetVertexShaderConstantF(17, Static502.aFloatArray57, 1);
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
	@Override
	public void method7018() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1;
			@Pc(11) Class113_Sub3 local11 = this.aClass134_Sub1_21.method6787();
			local6.SetVertexShaderConstantF(8, local11.method6069(Static502.aFloatArray58), 2);
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	@Override
	public void method7008() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1;
			@Pc(15) Class113_Sub3 local15 = this.aClass134_Sub1_Sub2_9.method6786();
			local8.a(0, local15.method6055(Static502.aFloatArray58));
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	@Override
	public void method7004() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1;
			@Pc(14) Class113_Sub3 local14 = this.aClass134_Sub1_Sub2_9.method6786();
			local7.a(0, local14.method6055(Static502.aFloatArray58));
		}
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
	@Override
	public void method7015() {
		if (this.anIDirect3DVertexShader5 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass134_Sub1_Sub2_9.anIDirect3DDevice1;
			local7.a(4, this.aClass134_Sub1_21.method6825(Static502.aFloatArray58));
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		this.aBoolean665 = arg0;
		this.aClass134_Sub1_21.method6788(1);
		this.aClass134_Sub1_21.method6766(this.anInterface14_6);
		this.aClass134_Sub1_21.method6770(Static116.aClass82_3, Static447.aClass82_5);
		this.aClass134_Sub1_21.method6742(0, Static308.aClass192_1);
		this.aClass134_Sub1_21.method6791(true, Static430.aClass192_2, 2, false);
		this.aClass134_Sub1_21.method6816(0, Static493.aClass192_4);
		this.aClass134_Sub1_21.method6788(0);
		this.method7010();
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return this.aBoolean666;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			this.aClass134_Sub1_21.method6766(this.aClass134_Sub1_21.anInterface3_3);
			this.aClass134_Sub1_21.method6724(1);
			this.aClass134_Sub1_21.method6742(0, Static493.aClass192_4);
			this.aClass134_Sub1_21.method6816(0, Static493.aClass192_4);
		} else {
			this.aClass134_Sub1_21.method6766(arg0);
			this.aClass134_Sub1_21.method6724(arg1);
		}
	}
}
