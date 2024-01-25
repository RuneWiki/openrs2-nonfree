import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!oe;")
	private final Class7_Sub1_Sub2 aClass7_Sub1_Sub2_1;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
	private final boolean aBoolean109;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!dca;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!oe;Lclient!vo;)V")
	public Class9_Sub2(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class348 arg1) {
		super(arg0);
		this.aClass7_Sub1_Sub2_1 = arg0;
		if (arg1 == null || (this.aClass7_Sub1_Sub2_1.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean109 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method7956("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method7956("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method7956("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader5 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1.b(arg1.method7956("uw_model_lit", "dx"));
			if (this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null) {
				this.anInterface4_1 = this.aClass7_Sub1_23.method5699(1, false, 2, new int[] { 0, -1 });
				this.anInterface4_1.method7375(false, false);
				this.aBoolean109 = true;
			} else {
				this.aBoolean109 = false;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			this.aClass7_Sub1_23.method5694(this.aClass7_Sub1_23.anInterface1_3);
			this.aClass7_Sub1_23.method5757(1);
			this.aClass7_Sub1_23.method5681(0, Static410.aClass61_6);
			this.aClass7_Sub1_23.method5713(Static410.aClass61_6, 0);
		} else {
			this.aClass7_Sub1_23.method5694(arg0);
			this.aClass7_Sub1_23.method5757(arg1);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	@Override
	public void method8027() {
		@Pc(10) IDirect3DDevice local10 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1;
		@Pc(15) int local15 = this.aClass7_Sub1_23.method5685();
		@Pc(20) Class81_Sub1 local20 = this.aClass7_Sub1_23.method5766();
		@Pc(34) IDirect3DVertexShader local34;
		if (this.aBoolean110) {
			local34 = ~local15 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader2 : this.anIDirect3DVertexShader5;
		} else {
			local34 = Integer.MAX_VALUE == local15 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader3;
		}
		if (this.anIDirect3DVertexShader1 != local34) {
			this.anIDirect3DVertexShader1 = local34;
			local10.SetVertexShader(local34);
			this.method1048();
			this.method8020();
			this.method8025();
			this.method8032();
			this.method8023();
			this.method8031();
		}
		local20.method1972(Static35.aFloatArray21, -1.0F, 0.0F, 0.0F, (float) local15);
		local10.a(12, Static35.aFloatArray21);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	@Override
	public void method8023() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(18) Class81_Sub1 local18 = this.aClass7_Sub1_Sub2_1.method5776();
			local13.a(0, local18.method1955(Static35.aFloatArray22));
		}
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V")
	@Override
	public void method8032() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(11) Class81_Sub1 local11 = this.aClass7_Sub1_Sub2_1.method5776();
			local6.a(0, local11.method1955(Static35.aFloatArray22));
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	@Override
	public void method8025() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1;
			@Pc(12) Class81_Sub1 local12 = this.aClass7_Sub1_23.method5759();
			local7.SetVertexShaderConstantF(8, local12.method1957(Static35.aFloatArray22), 2);
		}
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return this.aBoolean109;
	}

	@OriginalMember(owner = "client!be", name = "i", descriptor = "(I)V")
	private void method1048() {
		if (this.anIDirect3DVertexShader1 == null || !this.aBoolean110) {
			return;
		}
		@Pc(12) Class81_Sub1 local12 = this.aClass7_Sub1_23.method5722();
		@Pc(16) IDirect3DDevice local16 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1;
		local16.b(13, this.aClass7_Sub1_23.aFloat173 * this.aClass7_Sub1_23.aFloat171, this.aClass7_Sub1_23.aFloat171 * this.aClass7_Sub1_23.aFloat178, this.aClass7_Sub1_23.aFloat171 * this.aClass7_Sub1_23.aFloat176, 1.0F);
		local16.b(14, this.aClass7_Sub1_23.aFloat173 * this.aClass7_Sub1_23.aFloat180, this.aClass7_Sub1_23.aFloat178 * this.aClass7_Sub1_23.aFloat180, this.aClass7_Sub1_23.aFloat176 * this.aClass7_Sub1_23.aFloat180, 1.0F);
		local16.b(16, this.aClass7_Sub1_23.aFloat168 * this.aClass7_Sub1_23.aFloat173, this.aClass7_Sub1_23.aFloat168 * this.aClass7_Sub1_23.aFloat178, this.aClass7_Sub1_23.aFloat176 * this.aClass7_Sub1_23.aFloat168, 1.0F);
		local12.method1961(this.aClass7_Sub1_23.aFloatArray54[1], Static35.aFloatArray21, this.aClass7_Sub1_23.aFloatArray54[0], this.aClass7_Sub1_23.aFloatArray54[2]);
		local16.SetVertexShaderConstantF(15, Static35.aFloatArray21, 1);
		local12.method1961(this.aClass7_Sub1_23.aFloatArray51[1], Static35.aFloatArray21, this.aClass7_Sub1_23.aFloatArray51[0], this.aClass7_Sub1_23.aFloatArray51[2]);
		local16.SetVertexShaderConstantF(17, Static35.aFloatArray21, 1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		this.aBoolean110 = arg0;
		this.aClass7_Sub1_23.method5746(1);
		this.aClass7_Sub1_23.method5694(this.anInterface4_1);
		this.aClass7_Sub1_23.method5764(Static509.aClass95_4, Static563.aClass95_5);
		this.aClass7_Sub1_23.method5681(0, Static18.aClass61_1);
		this.aClass7_Sub1_23.method5741(true, Static411.aClass61_5, false, 2);
		this.aClass7_Sub1_23.method5713(Static410.aClass61_6, 0);
		this.aClass7_Sub1_23.method5746(0);
		this.method8027();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (this.anIDirect3DVertexShader1 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass7_Sub1_23.U();
		@Pc(15) int local15 = this.aClass7_Sub1_23.BA();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(39) float local39 = -((float) (local11 - local15) * 0.25F) + (float) local11;
		local7.b(10, local39, 1.0F / (local27 - local39), local27, 1.0F / ((float) local11 - local27));
		local7.b(11, 1.0F / (float) this.aClass7_Sub1_23.method5775(), (float) this.aClass7_Sub1_23.method5658() / 255.0F, this.aClass7_Sub1_23.aFloat177, 1.0F / (this.aClass7_Sub1_23.aFloat177 - this.aClass7_Sub1_23.aFloat175));
		this.aClass7_Sub1_23.method5712(this.aClass7_Sub1_23.method5663());
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		this.aClass7_Sub1_23.method5746(1);
		this.aClass7_Sub1_23.method5694(null);
		this.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
		this.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
		this.aClass7_Sub1_23.method5681(2, Static18.aClass61_1);
		this.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
		this.aClass7_Sub1_23.method5746(0);
		this.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
		this.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
		if (this.anIDirect3DVertexShader1 != null) {
			this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader1 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	@Override
	public void method8020() {
		if (this.anIDirect3DVertexShader1 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass7_Sub1_Sub2_1.anIDirect3DDevice1;
			local7.a(4, this.aClass7_Sub1_23.method5755(Static35.aFloatArray22));
		}
	}
}
