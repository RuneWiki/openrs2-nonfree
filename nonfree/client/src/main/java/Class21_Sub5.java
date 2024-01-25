import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class21_Sub5 extends Class21 {

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "Lclient!bv;")
	private final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Z")
	private final boolean aBoolean482;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!bv;Lclient!an;)V")
	public Class21_Sub5(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1) {
		super(arg0);
		this.aClass42_Sub1_Sub1_3 = arg0;
		if ((this.aClass42_Sub1_Sub1_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader5 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1.a(arg1.method396("uw_ground_unlit", "dx"));
			this.anIDirect3DVertexShader3 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1.a(arg1.method396("uw_ground_lit", "dx"));
			this.anIDirect3DVertexShader2 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1.a(arg1.method396("uw_model_unlit", "dx"));
			this.anIDirect3DVertexShader1 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1.a(arg1.method396("uw_model_lit", "dx"));
			this.aBoolean482 = this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader2 != null & this.anIDirect3DVertexShader1 != null;
		} else {
			this.aBoolean482 = false;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		this.aBoolean483 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (this.anIDirect3DVertexShader4 == null) {
			return;
		}
		@Pc(7) IDirect3DDevice local7 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1;
		@Pc(11) int local11 = this.aClass42_Sub1_19.CA();
		@Pc(15) int local15 = this.aClass42_Sub1_19.c();
		@Pc(26) float local26 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(37) float local37 = (float) local11 - (float) (local11 - local15) * 0.25F;
		local7.a(10, local37, 1.0F / (local26 - local37), local26, 1.0F / ((float) local11 - local26));
		local7.a(11, 1.0F / (float) this.aClass42_Sub1_19.method5976(), (float) this.aClass42_Sub1_19.method5879() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		this.aClass42_Sub1_19.method5868(arg0);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	@Override
	public void method7546() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1;
			@Pc(11) Class91_Sub2 local11 = this.aClass42_Sub1_Sub1_3.method5916();
			local6.a(0, local11.method5501(Static356.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	@Override
	public void method7554() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1;
			@Pc(16) Class91_Sub2 local16 = this.aClass42_Sub1_19.method5975();
			local11.SetVertexShaderConstantF(8, local16.method5502(Static356.aFloatArray54), 2);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	@Override
	public void method7555() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1;
			local6.a(4, this.aClass42_Sub1_19.method5891(Static356.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return this.aBoolean482;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public void method7547() {
		@Pc(3) IDirect3DDevice local3 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass42_Sub1_19.method5881();
		@Pc(13) Class91_Sub2 local13 = this.aClass42_Sub1_19.method5898();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean483) {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader1;
		} else {
			local27 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader2;
		}
		if (local27 != this.anIDirect3DVertexShader4) {
			this.anIDirect3DVertexShader4 = local27;
			local3.SetVertexShader(local27);
			this.method5568();
			this.method7555();
			this.method7554();
			this.method7546();
			this.method7545();
			this.method7551();
		}
		local13.method5498(0.0F, 0.0F, (float) local8, -1.0F, Static356.aFloatArray53);
		local3.a(12, Static356.aFloatArray53);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method7545() {
		if (this.anIDirect3DVertexShader4 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1;
			@Pc(12) Class91_Sub2 local12 = this.aClass42_Sub1_Sub1_3.method5916();
			local7.a(0, local12.method5501(Static356.aFloatArray54));
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
	private void method5568() {
		if (this.anIDirect3DVertexShader4 == null || !this.aBoolean483) {
			return;
		}
		@Pc(15) Class91_Sub2 local15 = this.aClass42_Sub1_19.method5898();
		@Pc(19) IDirect3DDevice local19 = this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1;
		local19.a(13, this.aClass42_Sub1_19.aFloat165 * this.aClass42_Sub1_19.aFloat158, this.aClass42_Sub1_19.aFloat165 * this.aClass42_Sub1_19.aFloat169, this.aClass42_Sub1_19.aFloat165 * this.aClass42_Sub1_19.aFloat168, 1.0F);
		local19.a(14, this.aClass42_Sub1_19.aFloat167 * this.aClass42_Sub1_19.aFloat158, this.aClass42_Sub1_19.aFloat169 * this.aClass42_Sub1_19.aFloat167, this.aClass42_Sub1_19.aFloat168 * this.aClass42_Sub1_19.aFloat167, 1.0F);
		local19.a(16, this.aClass42_Sub1_19.aFloat163 * this.aClass42_Sub1_19.aFloat158, this.aClass42_Sub1_19.aFloat169 * this.aClass42_Sub1_19.aFloat163, this.aClass42_Sub1_19.aFloat163 * this.aClass42_Sub1_19.aFloat168, 1.0F);
		local15.method5511(this.aClass42_Sub1_19.aFloatArray63[2], this.aClass42_Sub1_19.aFloatArray63[1], Static356.aFloatArray53, this.aClass42_Sub1_19.aFloatArray63[0]);
		local19.SetVertexShaderConstantF(15, Static356.aFloatArray53, 1);
		local15.method5511(this.aClass42_Sub1_19.aFloatArray58[2], this.aClass42_Sub1_19.aFloatArray58[1], Static356.aFloatArray53, this.aClass42_Sub1_19.aFloatArray58[0]);
		local19.SetVertexShaderConstantF(15, Static356.aFloatArray53, 1);
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		if (this.anIDirect3DVertexShader4 != null) {
			this.aClass42_Sub1_Sub1_3.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader4 = null;
		}
	}
}
