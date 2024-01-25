import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "Z")
	private boolean aBoolean108;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "Lclient!sga;")
	private final Class132_Sub1_Sub2 aClass132_Sub1_Sub2_3;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "Lclient!bw;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "Z")
	private final boolean aBoolean110;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!sga;Lclient!ae;)V")
	public Class32_Sub3(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class8 arg1) {
		super(arg0);
		this.aClass132_Sub1_Sub2_3 = arg0;
		if (arg1 == null || (this.aClass132_Sub1_Sub2_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean110 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1.a(arg1.method274("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader5 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1.a(arg1.method274("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader3 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1.a(arg1.method274("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader1 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1.a(arg1.method274("dx", "uw_model_lit"));
			if (this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader5 != null & this.anIDirect3DVertexShader3 != null) {
				this.anInterface2_1 = this.aClass132_Sub1_21.method7590(1, 2, false, new int[] { 0, -1 });
				this.anInterface2_1.method8901(false, false);
				this.aBoolean110 = true;
			} else {
				this.aBoolean110 = false;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)V")
	@Override
	public void method8325() {
		@Pc(10) IDirect3DDevice local10 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(15) int local15 = this.aClass132_Sub1_21.method7600();
		@Pc(20) Class207_Sub3 local20 = this.aClass132_Sub1_21.method7542();
		@Pc(32) IDirect3DVertexShader local32;
		if (this.aBoolean108) {
			local32 = Integer.MAX_VALUE == local15 ? this.anIDirect3DVertexShader5 : this.anIDirect3DVertexShader1;
		} else {
			local32 = Integer.MAX_VALUE == local15 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader3;
		}
		if (local32 != this.anIDirect3DVertexShader2) {
			this.anIDirect3DVertexShader2 = local32;
			this.aClass132_Sub1_Sub2_3.method7656(local32);
			this.method1526();
			this.method8319();
			this.method8321();
			this.method8320();
			this.method8317();
			this.method8323();
		}
		local20.method8219(0.0F, 0.0F, -1.0F, Static91.aFloatArray7, (float) local15);
		local10.a(12, Static91.aFloatArray7);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
	@Override
	public void method8317() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(12) Class207_Sub3 local12 = this.aClass132_Sub1_Sub2_3.method7566();
			local7.a(0, local12.method8230(Static91.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(B)V")
	private void method1526() {
		if (this.anIDirect3DVertexShader2 == null || !this.aBoolean108) {
			return;
		}
		@Pc(11) Class207_Sub3 local11 = this.aClass132_Sub1_21.method7533();
		@Pc(15) IDirect3DDevice local15 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1;
		local15.a(13, this.aClass132_Sub1_21.aFloat177 * this.aClass132_Sub1_21.aFloat168, this.aClass132_Sub1_21.aFloat171 * this.aClass132_Sub1_21.aFloat177, this.aClass132_Sub1_21.aFloat179 * this.aClass132_Sub1_21.aFloat177, 1.0F);
		local15.a(14, this.aClass132_Sub1_21.aFloat176 * this.aClass132_Sub1_21.aFloat168, this.aClass132_Sub1_21.aFloat176 * this.aClass132_Sub1_21.aFloat171, this.aClass132_Sub1_21.aFloat179 * this.aClass132_Sub1_21.aFloat176, 1.0F);
		local15.a(16, this.aClass132_Sub1_21.aFloat169 * this.aClass132_Sub1_21.aFloat168, this.aClass132_Sub1_21.aFloat169 * this.aClass132_Sub1_21.aFloat171, this.aClass132_Sub1_21.aFloat169 * this.aClass132_Sub1_21.aFloat179, 1.0F);
		local11.method8216(this.aClass132_Sub1_21.aFloatArray63[0], Static91.aFloatArray7, this.aClass132_Sub1_21.aFloatArray63[2], this.aClass132_Sub1_21.aFloatArray63[1]);
		local15.SetVertexShaderConstantF(15, Static91.aFloatArray7, 1);
		local11.method8216(this.aClass132_Sub1_21.aFloatArray68[0], Static91.aFloatArray7, this.aClass132_Sub1_21.aFloatArray68[2], this.aClass132_Sub1_21.aFloatArray68[1]);
		local15.SetVertexShaderConstantF(17, Static91.aFloatArray7, 1);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		this.aBoolean108 = arg0;
		this.aClass132_Sub1_21.method7616(1);
		this.aClass132_Sub1_21.method7635(this.anInterface2_1);
		this.aClass132_Sub1_21.method7637(Static296.aClass322_4, Static320.aClass322_5);
		this.aClass132_Sub1_21.method7552(Static583.aClass378_3, 0);
		this.aClass132_Sub1_21.method7612(false, 2, Static368.aClass378_1, true);
		this.aClass132_Sub1_21.method7598(0, Static648.aClass378_4);
		this.aClass132_Sub1_21.method7616(0);
		this.method8325();
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		this.aClass132_Sub1_21.method7616(1);
		this.aClass132_Sub1_21.method7635((Interface17) null);
		this.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
		this.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
		this.aClass132_Sub1_21.method7552(Static583.aClass378_3, 2);
		this.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
		this.aClass132_Sub1_21.method7616(0);
		if (this.aBoolean109) {
			this.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
			this.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
			this.aBoolean109 = false;
		}
		if (this.anIDirect3DVertexShader2 != null) {
			this.aClass132_Sub1_Sub2_3.method7656((IDirect3DVertexShader) null);
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
	@Override
	public void method8323() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(17) IDirect3DDevice local17 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1;
		@Pc(21) int local21 = this.aClass132_Sub1_21.XA();
		@Pc(25) int local25 = this.aClass132_Sub1_21.i();
		@Pc(37) float local37 = -((float) (local21 - local25) * 0.125F) + (float) local21;
		@Pc(48) float local48 = (float) local21 - (float) (local21 - local25) * 0.25F;
		local17.a(10, local48, 1.0F / (local37 - local48), local37, 1.0F / ((float) local21 - local37));
		local17.a(11, 1.0F / (float) this.aClass132_Sub1_21.method7597(), (float) this.aClass132_Sub1_21.method7530() / 255.0F, this.aClass132_Sub1_21.aFloat165, 1.0F / (this.aClass132_Sub1_21.aFloat165 - this.aClass132_Sub1_21.aFloat166));
		this.aClass132_Sub1_21.method7611(this.aClass132_Sub1_21.method7582());
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	@Override
	public void method8321() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(13) IDirect3DDevice local13 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(18) Class207_Sub3 local18 = this.aClass132_Sub1_21.method7643();
			local13.SetVertexShaderConstantF(8, local18.method8217(Static91.aFloatArray6), 2);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	@Override
	public void method8319() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1;
			local12.a(4, this.aClass132_Sub1_21.method7596(Static91.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	@Override
	public void method8320() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass132_Sub1_Sub2_3.anIDirect3DDevice1;
			@Pc(12) Class207_Sub3 local12 = this.aClass132_Sub1_Sub2_3.method7566();
			local7.a(0, local12.method8230(Static91.aFloatArray6));
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		if (arg1 != null) {
			if (this.aBoolean109) {
				this.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
				this.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
				this.aBoolean109 = false;
			}
			this.aClass132_Sub1_21.method7635(arg1);
			this.aClass132_Sub1_21.method7652(arg0);
		} else if (!this.aBoolean109) {
			this.aClass132_Sub1_21.method7635(this.aClass132_Sub1_21.anInterface17_3);
			this.aClass132_Sub1_21.method7652(1);
			this.aClass132_Sub1_21.method7552(Static648.aClass378_4, 0);
			this.aClass132_Sub1_21.method7598(0, Static648.aClass378_4);
			this.aBoolean109 = true;
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return this.aBoolean110;
	}
}
