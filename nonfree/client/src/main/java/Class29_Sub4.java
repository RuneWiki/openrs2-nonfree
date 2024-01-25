import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class29_Sub4 extends Class29 {

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "Lclient!ad;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_3;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!ur;")
	private final Class345 aClass345_2;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!ad;Lclient!la;Lclient!ur;)V")
	public Class29_Sub4(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class345 arg2) {
		super(arg0);
		this.aClass5_Sub1_Sub1_3 = arg0;
		this.aClass345_2 = arg2;
		if (arg1 != null && this.aClass345_2.method8240() && (this.aClass5_Sub1_Sub1_3.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass5_Sub1_Sub1_3.anIDirect3DDevice1.b(arg1.method5093("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	@Override
	public void method8078() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(12) IDirect3DDevice local12 = this.aClass5_Sub1_Sub1_3.anIDirect3DDevice1;
			local12.a(4, this.aClass5_Sub1_22.method5627(Static172.aFloatArray25));
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass5_Sub1_Sub1_3.anIDirect3DDevice1;
		if (this.aClass345_2.aBoolean688) {
			@Pc(46) float local46 = (float) (this.aClass5_Sub1_22.anInt6524 % 4000) / 4000.0F;
			this.aClass5_Sub1_22.method5609(this.aClass345_2.anInterface12_2);
			local3.a(11, local46, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(17) int local17 = this.aClass5_Sub1_22.anInt6524 % 4000 * 16 / 4000;
			this.aClass5_Sub1_22.method5609(this.aClass345_2.anInterface24Array1[local17]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	@Override
	public void method8082() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(15) IDirect3DDevice local15 = this.aClass5_Sub1_Sub1_3.anIDirect3DDevice1;
			@Pc(20) Class39_Sub1 local20 = this.aClass5_Sub1_Sub1_3.method5594();
			local15.a(0, local20.method1559(Static172.aFloatArray25));
		}
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
	@Override
	public void method8079() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass5_Sub1_Sub1_3.anIDirect3DDevice1;
			@Pc(14) Class39_Sub1 local14 = this.aClass5_Sub1_Sub1_3.method5594();
			local7.a(0, local14.method1559(Static172.aFloatArray25));
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		this.aClass5_Sub1_Sub1_3.method658(null);
		this.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
		this.aClass5_Sub1_22.method5583(Static578.aClass9_5, 1);
		this.aClass5_Sub1_22.method5583(Static161.aClass9_3, 2);
		this.aClass5_Sub1_22.method5644(true);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return this.anIDirect3DVertexShader2 != null;
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
	@Override
	public void method8077() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass5_Sub1_Sub1_3.anIDirect3DDevice1;
		@Pc(11) Class39_Sub1 local11 = this.aClass5_Sub1_22.method5661();
		local11.method1563(Static172.aFloatArray25);
		Static172.aFloatArray25[2] *= 0.25F;
		Static172.aFloatArray25[3] *= 0.25F;
		Static172.aFloatArray25[0] *= 0.25F;
		Static172.aFloatArray25[5] *= 0.25F;
		Static172.aFloatArray25[4] *= 0.25F;
		Static172.aFloatArray25[7] *= 0.25F;
		Static172.aFloatArray25[1] *= 0.25F;
		Static172.aFloatArray25[6] *= 0.25F;
		local6.SetVertexShaderConstantF(8, Static172.aFloatArray25, 2);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		this.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
		this.aClass5_Sub1_22.method5583(Static161.aClass9_3, 1);
		this.aClass5_Sub1_22.method5618(true, false, 2, Static578.aClass9_5);
		this.aClass5_Sub1_22.method5644(false);
		this.aClass5_Sub1_Sub1_3.method658(this.anIDirect3DVertexShader2);
		this.method8082();
		this.method8077();
		this.method8078();
		this.method8084();
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
	@Override
	public void method8084() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(12) IDirect3DDevice local12 = this.aClass5_Sub1_Sub1_3.anIDirect3DDevice1;
		if (this.aClass5_Sub1_22.anInt6539 > 0) {
			@Pc(23) float local23 = this.aClass5_Sub1_22.aFloat139;
			@Pc(27) float local27 = this.aClass5_Sub1_22.aFloat145;
			@Pc(31) float local31 = local27 - 512.0F;
			local12.a(10, local31, 1.0F / (local27 - local31), local27, 1.0F / (local23 - local27));
		} else {
			local12.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass5_Sub1_22.method5574(this.aClass5_Sub1_22.anInt6521);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
		this.aClass5_Sub1_22.method5682(Static377.aClass374_3, Static275.aClass374_1);
	}
}
