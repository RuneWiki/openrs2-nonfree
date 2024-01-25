import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "Lclient!fi;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_6;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Lclient!pba;")
	private final Class249 aClass249_4;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!fi;Lclient!vd;Lclient!pba;)V")
	public Class7_Sub5(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class249 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub1_6 = arg0;
		this.aClass249_4 = arg2;
		if (arg1 != null && this.aClass249_4.method6665() && (this.aClass100_Sub1_Sub1_6.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.b(arg1.method8426("dx", "transparent_water"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return this.anIDirect3DVertexShader2 != null;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1;
		if (this.aClass249_4.aBoolean522) {
			@Pc(48) float local48 = (float) (this.aClass100_Sub1_22.anInt7125 % 4000) / 4000.0F;
			this.aClass100_Sub1_22.method6033(this.aClass249_4.anInterface15_1);
			local3.b(11, local48, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(21) int local21 = this.aClass100_Sub1_22.anInt7125 % 4000 * 16 / 4000;
			this.aClass100_Sub1_22.method6033(this.aClass249_4.anInterface3Array2[local21]);
			local3.b(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V")
	@Override
	public void method7184() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(12) Class154_Sub2 local12 = this.aClass100_Sub1_Sub1_6.method6077();
			local7.a(0, local12.method4538(Static192.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		this.aClass100_Sub1_Sub1_6.method2995((IDirect3DVertexShader) null);
		this.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
		this.aClass100_Sub1_22.method6068(1, Static200.aClass187_1);
		this.aClass100_Sub1_22.method6068(2, Static456.aClass187_2);
		this.aClass100_Sub1_22.method6127(true);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
		this.aClass100_Sub1_22.method6039(Static114.aClass256_1, Static190.aClass256_2);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		this.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
		this.aClass100_Sub1_22.method6068(1, Static456.aClass187_2);
		this.aClass100_Sub1_22.method6079(Static200.aClass187_1, false, 2, true);
		this.aClass100_Sub1_22.method6127(false);
		this.aClass100_Sub1_Sub1_6.method2995(this.anIDirect3DVertexShader2);
		this.method7185();
		this.method7196();
		this.method7182();
		this.method7190();
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
	@Override
	public void method7185() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1;
			@Pc(12) Class154_Sub2 local12 = this.aClass100_Sub1_Sub1_6.method6077();
			local7.a(0, local12.method4538(Static192.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
	@Override
	public void method7182() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1;
			local6.a(4, this.aClass100_Sub1_22.method6111(Static192.aFloatArray39));
		}
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(Z)V")
	@Override
	public void method7196() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(10) IDirect3DDevice local10 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1;
		@Pc(15) Class154_Sub2 local15 = this.aClass100_Sub1_22.method6089();
		local15.method4530(Static192.aFloatArray39);
		Static192.aFloatArray39[2] *= 0.25F;
		Static192.aFloatArray39[3] *= 0.25F;
		Static192.aFloatArray39[5] *= 0.25F;
		Static192.aFloatArray39[6] *= 0.25F;
		Static192.aFloatArray39[1] *= 0.25F;
		Static192.aFloatArray39[7] *= 0.25F;
		Static192.aFloatArray39[0] *= 0.25F;
		Static192.aFloatArray39[4] *= 0.25F;
		local10.SetVertexShaderConstantF(8, Static192.aFloatArray39, 2);
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(Z)V")
	@Override
	public void method7190() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1;
		if (this.aClass100_Sub1_22.anInt7148 > 0) {
			@Pc(14) float local14 = this.aClass100_Sub1_22.aFloat135;
			@Pc(18) float local18 = this.aClass100_Sub1_22.aFloat137;
			@Pc(22) float local22 = local18 - 512.0F;
			local6.b(10, local22, 1.0F / (local18 - local22), local18, 1.0F / (local14 - local18));
		} else {
			local6.b(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass100_Sub1_22.method6154(this.aClass100_Sub1_22.anInt7158);
	}
}
