import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class48_Sub9 extends Class48 {

	@OriginalMember(owner = "client!pga", name = "u", descriptor = "Z")
	private boolean aBoolean499;

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!pga", name = "x", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "Lclient!er;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_8;

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!pga", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!pga", name = "v", descriptor = "Z")
	private final boolean aBoolean501;

	@OriginalMember(owner = "client!pga", name = "p", descriptor = "Lclient!ah;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!er;Lclient!gda;)V")
	public Class48_Sub9(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class126 arg1) {
		super(arg0);
		this.aClass100_Sub1_Sub1_8 = arg0;
		if (arg1 == null || (this.aClass100_Sub1_Sub1_8.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean501 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(arg1.method3073("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader8 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(arg1.method3073("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(arg1.method3073("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader7 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(arg1.method3073("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader8 != null & this.anIDirect3DVertexShader7 != null) {
				this.anInterface2_4 = this.aClass100_Sub1_23.method7875(false, 2, new int[] { 0, -1 }, 1);
				this.anInterface2_4.method3687(false, false);
				this.aBoolean501 = true;
			} else {
				this.aBoolean501 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
	@Override
	public void method8931() {
		@Pc(3) IDirect3DDevice local3 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(19) int local19 = this.aClass100_Sub1_23.method7950();
		@Pc(24) Class10_Sub2 local24 = this.aClass100_Sub1_23.method7861();
		@Pc(39) IDirect3DVertexShader local39;
		if (this.aBoolean499) {
			local39 = Integer.MIN_VALUE == ~local19 ? this.anIDirect3DVertexShader8 : this.anIDirect3DVertexShader7;
		} else {
			local39 = Integer.MAX_VALUE == local19 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader6 != local39) {
			this.anIDirect3DVertexShader6 = local39;
			this.aClass100_Sub1_Sub1_8.method2537(local39);
			this.method6413();
			this.method8936();
			this.method8944();
			this.method8939();
			this.method8943();
			this.method8937();
		}
		local24.method1707(0.0F, (float) local19, -1.0F, 0.0F, Static454.aFloatArray58);
		local3.a(12, Static454.aFloatArray58);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)V")
	@Override
	public void method8943() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(22) Class10_Sub2 local22 = this.aClass100_Sub1_Sub1_8.method7927();
			local17.a(0, local22.method1690(Static454.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
	@Override
	public void method8936() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			local12.a(4, this.aClass100_Sub1_23.method7965(Static454.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return this.aBoolean501;
	}

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "(I)V")
	@Override
	public void method8944() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(22) Class10_Sub2 local22 = this.aClass100_Sub1_23.method7862();
			local17.SetVertexShaderConstantF(8, local22.method1703(Static454.aFloatArray59), 2);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		this.aBoolean499 = arg0;
		this.aClass100_Sub1_23.method7941(1);
		this.aClass100_Sub1_23.method7923(this.anInterface2_4);
		this.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static280.aClass94_2);
		this.aClass100_Sub1_23.method7970(Static520.aClass93_4, 0);
		this.aClass100_Sub1_23.method7883(true, Static94.aClass93_2, false, 2);
		this.aClass100_Sub1_23.method7947(Static237.aClass93_3, 0);
		this.aClass100_Sub1_23.method7941(0);
		this.method8931();
	}

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "(I)V")
	@Override
	public void method8939() {
		if (this.anIDirect3DVertexShader6 != null) {
			@Pc(18) IDirect3DDevice local18 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
			@Pc(23) Class10_Sub2 local23 = this.aClass100_Sub1_Sub1_8.method7927();
			local18.a(0, local23.method1690(Static454.aFloatArray59));
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean500) {
				this.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
				this.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
				this.aBoolean500 = false;
			}
			this.aClass100_Sub1_23.method7923(arg0);
			this.aClass100_Sub1_23.method7962(arg1);
		} else if (!this.aBoolean500) {
			this.aClass100_Sub1_23.method7923(this.aClass100_Sub1_23.anInterface19_3);
			this.aClass100_Sub1_23.method7962(1);
			this.aClass100_Sub1_23.method7970(Static237.aClass93_3, 0);
			this.aClass100_Sub1_23.method7947(Static237.aClass93_3, 0);
			this.aBoolean500 = true;
		}
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V")
	@Override
	public void method8937() {
		if (this.anIDirect3DVertexShader6 == null) {
			return;
		}
		@Pc(16) IDirect3DDevice local16 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
		@Pc(20) int local20 = this.aClass100_Sub1_23.XA();
		@Pc(24) int local24 = this.aClass100_Sub1_23.i();
		@Pc(36) float local36 = -((float) (local20 - local24) * 0.125F) + (float) local20;
		@Pc(46) float local46 = (float) local20 - (float) (local20 - local24) * 0.25F;
		local16.a(10, local46, 1.0F / (local36 - local46), local36, 1.0F / ((float) local20 - local36));
		local16.a(11, 1.0F / (float) this.aClass100_Sub1_23.method7968(), (float) this.aClass100_Sub1_23.method7886() / 255.0F, this.aClass100_Sub1_23.aFloat170, 1.0F / (this.aClass100_Sub1_23.aFloat170 - this.aClass100_Sub1_23.aFloat176));
		this.aClass100_Sub1_23.method7873(this.aClass100_Sub1_23.method7911());
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		this.aClass100_Sub1_23.method7941(1);
		this.aClass100_Sub1_23.method7923((Interface19) null);
		this.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
		this.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
		this.aClass100_Sub1_23.method7970(Static520.aClass93_4, 2);
		this.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
		this.aClass100_Sub1_23.method7941(0);
		if (this.aBoolean500) {
			this.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
			this.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
			this.aBoolean500 = false;
		}
		if (this.anIDirect3DVertexShader6 != null) {
			this.aClass100_Sub1_Sub1_8.method2537((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader6 = null;
		}
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(Z)V")
	private void method6413() {
		if (this.anIDirect3DVertexShader6 == null || !this.aBoolean499) {
			return;
		}
		@Pc(20) Class10_Sub2 local20 = this.aClass100_Sub1_23.method7945();
		@Pc(24) IDirect3DDevice local24 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1;
		local24.a(13, this.aClass100_Sub1_23.aFloat178 * this.aClass100_Sub1_23.aFloat175, this.aClass100_Sub1_23.aFloat178 * this.aClass100_Sub1_23.aFloat179, this.aClass100_Sub1_23.aFloat177 * this.aClass100_Sub1_23.aFloat178, 1.0F);
		local24.a(14, this.aClass100_Sub1_23.aFloat168 * this.aClass100_Sub1_23.aFloat175, this.aClass100_Sub1_23.aFloat179 * this.aClass100_Sub1_23.aFloat168, this.aClass100_Sub1_23.aFloat168 * this.aClass100_Sub1_23.aFloat177, 1.0F);
		local24.a(16, this.aClass100_Sub1_23.aFloat173 * this.aClass100_Sub1_23.aFloat175, this.aClass100_Sub1_23.aFloat173 * this.aClass100_Sub1_23.aFloat179, this.aClass100_Sub1_23.aFloat173 * this.aClass100_Sub1_23.aFloat177, 1.0F);
		local20.method1714(Static454.aFloatArray58, this.aClass100_Sub1_23.aFloatArray67[1], this.aClass100_Sub1_23.aFloatArray67[0], this.aClass100_Sub1_23.aFloatArray67[2]);
		local24.SetVertexShaderConstantF(15, Static454.aFloatArray58, 1);
		local20.method1714(Static454.aFloatArray58, this.aClass100_Sub1_23.aFloatArray65[1], this.aClass100_Sub1_23.aFloatArray65[0], this.aClass100_Sub1_23.aFloatArray65[2]);
		local24.SetVertexShaderConstantF(17, Static454.aFloatArray58, 1);
	}
}
