import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class70_Sub4 extends Class70 {

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Z")
	private boolean aBoolean362;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "Lclient!de;")
	private final Class62_Sub1_Sub1 aClass62_Sub1_Sub1_5;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Z")
	private final boolean aBoolean361;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader4;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader5;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!de;Lclient!gp;)V")
	public Class70_Sub4(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class117 arg1) {
		super(arg0);
		this.aClass62_Sub1_Sub1_5 = arg0;
		if ((this.aClass62_Sub1_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) < 257) {
			this.aBoolean361 = false;
		} else {
			this.anIDirect3DVertexShader4 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method2980("dx", "uw_ground_unlit"));
			this.anIDirect3DVertexShader3 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method2980("dx", "uw_ground_lit"));
			this.anIDirect3DVertexShader5 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method2980("dx", "uw_model_unlit"));
			this.anIDirect3DVertexShader1 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method2980("dx", "uw_model_lit"));
			this.aBoolean361 = this.anIDirect3DVertexShader1 != null & this.anIDirect3DVertexShader4 != null & this.anIDirect3DVertexShader3 != null & this.anIDirect3DVertexShader5 != null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	@Override
	public void method7299() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(14) IDirect3DDevice local14 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1;
		@Pc(18) int local18 = this.aClass62_Sub1_20.CA();
		@Pc(22) int local22 = this.aClass62_Sub1_20.c();
		@Pc(32) float local32 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(43) float local43 = (float) local18 - (float) (local18 - local22) * 0.25F;
		local14.a(10, local43, 1.0F / (local32 - local43), local32, 1.0F / ((float) local18 - local32));
		local14.a(11, 1.0F / (float) this.aClass62_Sub1_20.method4733(), (float) this.aClass62_Sub1_20.method4731() / 255.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return this.aBoolean361;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V")
	@Override
	public void method7312() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(12) Class78_Sub1 local12 = this.aClass62_Sub1_Sub1_5.method4783();
			local7.a(0, local12.method2179(Static258.aFloatArray36));
		}
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
	@Override
	public void method7314() {
		@Pc(3) IDirect3DDevice local3 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1;
		@Pc(8) int local8 = this.aClass62_Sub1_20.method4711();
		@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_20.method4730();
		@Pc(27) IDirect3DVertexShader local27;
		if (this.aBoolean362) {
			local27 = ~local8 == Integer.MIN_VALUE ? this.anIDirect3DVertexShader3 : this.anIDirect3DVertexShader1;
		} else {
			local27 = Integer.MAX_VALUE == local8 ? this.anIDirect3DVertexShader4 : this.anIDirect3DVertexShader5;
		}
		if (this.anIDirect3DVertexShader2 != local27) {
			this.anIDirect3DVertexShader2 = local27;
			local3.SetVertexShader(local27);
			this.method4372();
			this.method7304();
			this.method7307();
			this.method7312();
			this.method7308();
			this.method7299();
		}
		local13.method2199((float) local8, -1.0F, 0.0F, Static258.aFloatArray37, 0.0F);
		local3.a(12, Static258.aFloatArray37);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	@Override
	public void method7304() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1;
			local6.a(4, this.aClass62_Sub1_20.method4701(Static258.aFloatArray36));
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
		this.aBoolean362 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
	private void method4372() {
		if (this.anIDirect3DVertexShader2 == null || !this.aBoolean362) {
			return;
		}
		@Pc(15) Class78_Sub1 local15 = this.aClass62_Sub1_20.method4730();
		@Pc(19) IDirect3DDevice local19 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1;
		local19.a(13, this.aClass62_Sub1_20.aFloat234 * this.aClass62_Sub1_20.aFloat241, this.aClass62_Sub1_20.aFloat241 * this.aClass62_Sub1_20.aFloat239, this.aClass62_Sub1_20.aFloat241 * this.aClass62_Sub1_20.aFloat229, 1.0F);
		local19.a(14, this.aClass62_Sub1_20.aFloat234 * this.aClass62_Sub1_20.aFloat236, this.aClass62_Sub1_20.aFloat236 * this.aClass62_Sub1_20.aFloat239, this.aClass62_Sub1_20.aFloat229 * this.aClass62_Sub1_20.aFloat236, 1.0F);
		local19.a(16, this.aClass62_Sub1_20.aFloat235 * this.aClass62_Sub1_20.aFloat234, this.aClass62_Sub1_20.aFloat235 * this.aClass62_Sub1_20.aFloat239, this.aClass62_Sub1_20.aFloat229 * this.aClass62_Sub1_20.aFloat235, 1.0F);
		local15.method2178(Static258.aFloatArray37, this.aClass62_Sub1_20.aFloatArray41[2], this.aClass62_Sub1_20.aFloatArray41[1], this.aClass62_Sub1_20.aFloatArray41[0]);
		local19.SetVertexShaderConstantF(15, Static258.aFloatArray37, 1);
		local15.method2178(Static258.aFloatArray37, this.aClass62_Sub1_20.aFloatArray44[2], this.aClass62_Sub1_20.aFloatArray44[1], this.aClass62_Sub1_20.aFloatArray44[0]);
		local19.SetVertexShaderConstantF(15, Static258.aFloatArray37, 1);
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
	@Override
	public void method7308() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(6) IDirect3DDevice local6 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(11) Class78_Sub1 local11 = this.aClass62_Sub1_Sub1_5.method4783();
			local6.a(0, local11.method2179(Static258.aFloatArray36));
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	@Override
	public void method7307() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(11) IDirect3DDevice local11 = this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(16) Class78_Sub1 local16 = this.aClass62_Sub1_20.method4764();
			local11.SetVertexShaderConstantF(8, local16.method2194(Static258.aFloatArray36), 2);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
		this.aClass62_Sub1_20.method4676(arg1);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
		if (this.anIDirect3DVertexShader2 != null) {
			this.aClass62_Sub1_Sub1_5.anIDirect3DDevice1.SetVertexShader(null);
			this.anIDirect3DVertexShader2 = null;
		}
	}
}
