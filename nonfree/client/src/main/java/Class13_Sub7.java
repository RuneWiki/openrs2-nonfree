import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!jfa", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!jfa", name = "p", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!jfa", name = "r", descriptor = "Z")
	private boolean aBoolean390 = false;

	@OriginalMember(owner = "client!jfa", name = "t", descriptor = "Lclient!lj;")
	private final Class101_Sub1_Sub2 aClass101_Sub1_Sub2_6;

	@OriginalMember(owner = "client!jfa", name = "s", descriptor = "Z")
	private final boolean aBoolean391;

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!jfa", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!jfa", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "Lclient!lba;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!lj;Lclient!gga;)V")
	public Class13_Sub7(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class124 arg1) {
		super(arg0);
		this.aClass101_Sub1_Sub2_6 = arg0;
		if (arg1 == null || (this.aClass101_Sub1_Sub2_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean391 = false;
		} else {
			this.anIDirect3DVertexShader5 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1.a(arg1.method3639("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader6 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1.a(arg1.method3639("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1.a(arg1.method3639("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader4 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1.a(arg1.method3639("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader6 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null) {
				this.anInterface10_2 = this.aClass101_Sub1_22.method5833(1, 2, new int[] { 0, -1 }, false);
				this.anInterface10_2.method9107(false, false);
				this.aBoolean391 = true;
			} else {
				this.aBoolean391 = false;
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		this.aBoolean389 = arg0;
		this.aClass101_Sub1_22.method5862(1);
		this.aClass101_Sub1_22.method5909(this.anInterface10_2);
		this.aClass101_Sub1_22.method5891(Static98.aClass381_1, Static512.aClass381_5);
		this.aClass101_Sub1_22.method5954(0, Static660.aClass118_5);
		this.aClass101_Sub1_22.method5922(2, false, true, Static44.aClass118_1);
		this.aClass101_Sub1_22.method5890(0, Static175.aClass118_2);
		this.aClass101_Sub1_22.method5862(0);
		this.method8497();
	}

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "(I)V")
	@Override
	public void method8496() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(8) IDirect3DDevice local8 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1;
			local8.a(4, this.aClass101_Sub1_22.method5950(Static281.aFloatArray29));
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return this.aBoolean391;
	}

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)V")
	@Override
	public void method8497() {
		@Pc(3) IDirect3DDevice local3 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass101_Sub1_22.method5901();
		@Pc(13) Class76_Sub2 local13 = this.aClass101_Sub1_22.method5835();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean389) {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader6 : this.anIDirect3DVertexShader4;
		} else {
			local27 = Integer.MIN_VALUE == ~local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader2;
		}
		if (this.anIDirect3DVertexShader3 != local27) {
			this.anIDirect3DVertexShader3 = local27;
			this.aClass101_Sub1_Sub2_6.method5967(local27);
			this.method4731();
			this.method8496();
			this.method8493();
			this.method8492();
			this.method8487();
			this.method8499();
		}
		local13.method7348((float) local8, 0.0F, -1.0F, 0.0F, Static281.aFloatArray28);
		local3.a(12, Static281.aFloatArray28);
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V")
	@Override
	public void method8493() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(14) IDirect3DDevice local14 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(19) Class76_Sub2 local19 = this.aClass101_Sub1_22.method5936();
			local14.SetVertexShaderConstantF(8, local19.method7329(Static281.aFloatArray29), 2);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		this.aClass101_Sub1_22.method5862(1);
		this.aClass101_Sub1_22.method5909((Interface5) null);
		this.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
		this.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
		this.aClass101_Sub1_22.method5954(2, Static660.aClass118_5);
		this.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
		this.aClass101_Sub1_22.method5862(0);
		if (this.aBoolean390) {
			this.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
			this.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
			this.aBoolean390 = false;
		}
		if (this.anIDirect3DVertexShader3 != null) {
			this.aClass101_Sub1_Sub2_6.method5967((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader3 = null;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8487() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(12) Class76_Sub2 local12 = this.aClass101_Sub1_Sub2_6.method5958();
			local7.a(0, local12.method7330(Static281.aFloatArray29));
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.anIDirect3DVertexShader3 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1;
			@Pc(16) Class76_Sub2 local16 = this.aClass101_Sub1_Sub2_6.method5958();
			local11.a(0, local16.method7330(Static281.aFloatArray29));
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean390) {
				this.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
				this.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
				this.aBoolean390 = false;
			}
			this.aClass101_Sub1_22.method5909(arg0);
			this.aClass101_Sub1_22.method5840(arg1);
		} else if (!this.aBoolean390) {
			this.aClass101_Sub1_22.method5909(this.aClass101_Sub1_22.anInterface5_3);
			this.aClass101_Sub1_22.method5840(1);
			this.aClass101_Sub1_22.method5954(0, Static175.aClass118_2);
			this.aClass101_Sub1_22.method5890(0, Static175.aClass118_2);
			this.aBoolean390 = true;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "(I)V")
	private void method4731() {
		if (this.anIDirect3DVertexShader3 == null || !this.aBoolean389) {
			return;
		}
		@Pc(10) Class76_Sub2 local10 = this.aClass101_Sub1_22.method5881();
		@Pc(14) IDirect3DDevice local14 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1;
		local14.a(13, this.aClass101_Sub1_22.aFloat150 * this.aClass101_Sub1_22.aFloat157, this.aClass101_Sub1_22.aFloat153 * this.aClass101_Sub1_22.aFloat150, this.aClass101_Sub1_22.aFloat152 * this.aClass101_Sub1_22.aFloat150, 1.0F);
		local14.a(14, this.aClass101_Sub1_22.aFloat157 * this.aClass101_Sub1_22.aFloat151, this.aClass101_Sub1_22.aFloat153 * this.aClass101_Sub1_22.aFloat151, this.aClass101_Sub1_22.aFloat152 * this.aClass101_Sub1_22.aFloat151, 1.0F);
		local14.a(16, this.aClass101_Sub1_22.aFloat157 * this.aClass101_Sub1_22.aFloat156, this.aClass101_Sub1_22.aFloat153 * this.aClass101_Sub1_22.aFloat156, this.aClass101_Sub1_22.aFloat152 * this.aClass101_Sub1_22.aFloat156, 1.0F);
		local10.method7327(this.aClass101_Sub1_22.aFloatArray47[2], Static281.aFloatArray28, this.aClass101_Sub1_22.aFloatArray47[0], this.aClass101_Sub1_22.aFloatArray47[1]);
		local14.SetVertexShaderConstantF(15, Static281.aFloatArray28, 1);
		local10.method7327(this.aClass101_Sub1_22.aFloatArray43[2], Static281.aFloatArray28, this.aClass101_Sub1_22.aFloatArray43[0], this.aClass101_Sub1_22.aFloatArray43[1]);
		local14.SetVertexShaderConstantF(17, Static281.aFloatArray28, 1);
	}

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "(I)V")
	@Override
	public void method8499() {
		if (this.anIDirect3DVertexShader3 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass101_Sub1_Sub2_6.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass101_Sub1_22.XA();
		@Pc(15) int local15 = this.aClass101_Sub1_22.i();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(38) float local38 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.a(10, local38, 1.0F / (local27 - local38), local27, 1.0F / ((float) local11 - local27));
		local7.a(11, 1.0F / (float) this.aClass101_Sub1_22.method5927(), (float) this.aClass101_Sub1_22.method5956() / 255.0F, this.aClass101_Sub1_22.aFloat149, 1.0F / (this.aClass101_Sub1_22.aFloat149 - this.aClass101_Sub1_22.aFloat158));
		this.aClass101_Sub1_22.method5933(this.aClass101_Sub1_22.method5949());
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
