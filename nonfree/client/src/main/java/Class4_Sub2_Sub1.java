import jaclib.peer.pe;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.PixelBuffer;
import jagdx.dt;
import jagdx.td;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!hg", name = "Mg", descriptor = "Z")
	private boolean aBoolean304 = false;

	@OriginalMember(owner = "client!hg", name = "Lg", descriptor = "Lclient!uba;")
	private Class290 aClass290_1;

	@OriginalMember(owner = "client!hg", name = "Cg", descriptor = "I")
	private final int anInt3743;

	@OriginalMember(owner = "client!hg", name = "Og", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!hg", name = "Ug", descriptor = "Lclient!jaclib/peer/pe;")
	public final pe aPe1;

	@OriginalMember(owner = "client!hg", name = "Wg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!hg", name = "Sg", descriptor = "I")
	private final int anInt3744;

	@OriginalMember(owner = "client!hg", name = "Kg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!hg", name = "Hg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!hg", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!hg", name = "Gg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!hg", name = "Ng", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!hg", name = "Fg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!hg", name = "zg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!hg", name = "Vg", descriptor = "Z")
	public final boolean aBoolean305;

	@OriginalMember(owner = "client!hg", name = "Bg", descriptor = "Z")
	public final boolean aBoolean302;

	@OriginalMember(owner = "client!hg", name = "Ig", descriptor = "Z")
	public final boolean aBoolean303;

	@OriginalMember(owner = "client!hg", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hg", name = "Qg", descriptor = "[Lclient!ie;")
	private final Class136[] aClass136Array1;

	@OriginalMember(owner = "client!hg", name = "yg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!hg", name = "Eg", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!hg", name = "Ag", descriptor = "[I")
	private final int[] anIntArray293;

	@OriginalMember(owner = "client!hg", name = "xg", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!hg", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!n;Lclient!dn;Ljava/lang/Integer;)Lclient!qa;")
	private static Class4 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface13 arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class4_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) pe local9 = new pe();
			@Pc(13) IDirect3D local13 = IDirect3D.a(-2147483616, local9);
			@Pc(18) D3DADAPTER_IDENTIFIER local18 = local13.b(local3, 0);
			if (local18.VendorID == 32902) {
				throw new RuntimeException("");
			}
			@Pc(32) D3DCAPS local32 = local13.a(local3, local5);
			if ((local32.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local32.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local32.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local32.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local32.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local32.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local32.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local32.SrcBlendCaps & local32.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local32.SrcBlendCaps & local32.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local32.DestBlendCaps & 0x2 & local32.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local32.MaxActiveLights > 0 && local32.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local32.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(194) D3DPRESENT_PARAMETERS local194 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static177.method3484(local194, local5, arg3, local13, local3)) {
					throw new RuntimeException("");
				}
				local194.Windowed = true;
				local194.EnableAutoDepthStencil = true;
				local194.PresentationInterval = Integer.MIN_VALUE;
				@Pc(219) int local219 = 2;
				if ((local32.DevCaps & 0x100000) != 0) {
					local219 |= 0x10;
				}
				@Pc(243) IDirect3DDevice local243;
				try {
					local243 = local13.a(local3, local5, arg0, local219 | 0x40, local194);
				} catch (@Pc(245) td local245) {
					local243 = local13.a(local3, local5, arg0, local219 | 0x20, local194);
				}
				@Pc(264) Class290 local264 = new Class290(local243.d(0), local243.b());
				local1 = new Class4_Sub2_Sub1(local3, local5, arg0, local9, local13, local243, local264, local194, local32, arg1, arg2, arg3);
				local1.method7340();
				return local1;
			}
		} catch (@Pc(287) RuntimeException local287) {
			if (local1 != null) {
				local1.method7197();
			}
			throw local287;
		}
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/pe;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!uba;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!n;Lclient!dn;I)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) pe arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class290 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface13 arg9, @OriginalArg(10) Class69 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aClass290_1 = arg6;
		this.anInt3743 = arg0;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aPe1 = arg3;
		this.anIDirect3DDevice1 = arg5;
		this.anInt3744 = arg1;
		this.anIDirect3D1 = arg4;
		this.aD3DCAPS1 = arg8;
		this.aD3DLIGHT3 = new D3DLIGHT(this.aPe1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aPe1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aPe1);
		this.aPixelBuffer1 = new PixelBuffer(this.aPe1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aPe1);
		this.aBoolean605 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean305 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean302 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean303 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean603 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt8319 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.anInt8321 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean610 = this.anInt8299 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3743, this.anInt3744, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray10 = new boolean[this.anInt8319];
		this.aClass136Array1 = new Class136[this.anInt8319];
		this.aBooleanArray8 = new boolean[this.anInt8319];
		this.aBooleanArray9 = new boolean[this.anInt8319];
		this.anIntArray293 = new int[this.anInt8319];
		this.aBooleanArray7 = new boolean[this.anInt8319];
		this.anIDirect3DDevice1.BeginScene();
		this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		this.method7164();
		this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "()V")
	@Override
	public void method7154() {
	}

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "(B)V")
	@Override
	protected void method7352() {
		if (!this.aBoolean304) {
			this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
			this.aBoolean304 = true;
		}
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "()V")
	@Override
	public void method7164() {
		this.anIDirect3DDevice1.EndScene();
		if (dt.a((byte) 118, this.aClass290_1.method7479())) {
			this.method3486();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!de;)V")
	public void method3483(@OriginalArg(1) Class19_Sub2 arg0) {
		this.method3487(arg0);
		if (!this.aBooleanArray9[this.anInt8310]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 1, 1);
			this.aBooleanArray9[this.anInt8310] = true;
		}
		if (!this.aBooleanArray8[this.anInt8310]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 2, 1);
			this.aBooleanArray8[this.anInt8310] = true;
		}
	}

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "(I)V")
	@Override
	protected void method7267() {
		if (this.aBooleanArray7[this.anInt8310]) {
			this.aBooleanArray7[this.anInt8310] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8310, null);
			this.method7269();
			this.method7334();
		}
	}

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "(B)V")
	@Override
	protected void method7360() {
		this.anIDirect3DDevice1.a(14, this.aBoolean600 && this.aBoolean612);
	}

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "(I)V")
	@Override
	public void method7312() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray66[0], -this.aFloatArray66[1], -this.aFloatArray66[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray74[0], -this.aFloatArray74[1], -this.aFloatArray74[2]);
		this.aBoolean304 = false;
	}

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "(I)V")
	@Override
	protected void method7284() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray71);
	}

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "(I)V")
	@Override
	protected void method7310() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8305; local1++) {
			@Pc(10) Class1_Sub5 local10 = this.aClass1_Sub5Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method4313();
			@Pc(24) float local24 = local10.method4310() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method4306(), (float) local10.method4305(), (float) local10.method4314());
			this.aD3DLIGHT2.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method4311() * local10.method4311()));
			this.aD3DLIGHT2.SetRange((float) local10.method4311());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt8309) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7310();
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7311() {
		if (this.aBoolean594) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt8294);
			return;
		}
		this.aFloat169 = this.anInt8291 - this.anInt8327;
		this.aFloat164 = this.aFloat169 - (float) this.anInt8289;
		if (this.aFloat164 < (float) this.anInt8324) {
			this.aFloat164 = this.anInt8324;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat164);
		this.anIDirect3DDevice1.a(37, this.aFloat169);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8311);
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(B)V")
	@Override
	protected void method7246() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8298, this.anInt8313, this.anInt8123, this.anInt8167, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "()V")
	@Override
	protected void method7197() {
		this.aPe1.c(-27803);
		super.method7197();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!vr;I)V")
	@Override
	public void method7268(@OriginalArg(0) Class310 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "(B)Z")
	private boolean method3486() {
		@Pc(10) int local10 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local10 == 0 || local10 == -2005530519) {
			@Pc(24) Class290 local24 = (Class290) this.anObject15;
			this.method7238();
			local24.method7481();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static177.method3484(this.aD3DPRESENT_PARAMETERS1, this.anInt3744, this.anInt8299, this.anIDirect3D1, this.anInt3743)) {
				@Pc(58) int local58 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (dt.a(local58, -2005530590)) {
					local24.method7480(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.d(0));
					this.method7273();
					this.method7236();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)Lclient!rq;")
	@Override
	public Interface16 method7250(@OriginalArg(1) boolean arg0) {
		return new Class60(this, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "cb", descriptor = "(I)V")
	@Override
	protected void method7356() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8298 + this.anInt8315, this.anInt8301 + this.anInt8313, this.anInt8293, this.anInt8316);
	}

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "(I)V")
	@Override
	protected void method7257() {
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean599);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean599);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI[[IZ)Lclient!lm;")
	@Override
	public Interface11 method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class19_Sub1(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (dt.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1), -2005530590) && dt.a(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), -2005530590)) {
			local1 = new int[arg3 * arg2];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(67) int local67 = 0; local67 < arg3; local67++) {
					this.aPixelBuffer1.b(local1, arg2 * local67, local67 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(-11385);
		local16.b(-11385);
		return local1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ba;B)V")
	public void method3487(@OriginalArg(0) Class19 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8310, arg0.method5123());
		if (arg0.aClass136_10 != this.aClass136Array1[this.anInt8310]) {
			@Pc(25) int local25 = Static177.method3488(arg0.aClass136_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 6, local25);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 5, local25);
			this.aClass136Array1[this.anInt8310] = arg0.aClass136_10;
			if (arg0.aBoolean416 != this.aBooleanArray10[this.anInt8310]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 7, arg0.aBoolean416 ? Static177.method3488(arg0.aClass136_10) : 0);
				this.aBooleanArray10[this.anInt8310] = arg0.aBoolean416;
			}
		} else if (this.aBooleanArray10[this.anInt8310] != arg0.aBoolean416) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 7, arg0.aBoolean416 ? Static177.method3488(arg0.aClass136_10) : 0);
			this.aBooleanArray10[this.anInt8310] = arg0.aBoolean416;
		}
		if (!this.aBooleanArray7[this.anInt8310]) {
			this.aBooleanArray7[this.anInt8310] = true;
			this.method7269();
			this.method7334();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!bk;)V")
	@Override
	public void method7248(@OriginalArg(1) Class31 arg0) {
		@Pc(1) int local1 = 0;
		if (Static355.aClass31_5 == arg0) {
			local1 = 65536;
		} else if (Static44.aClass31_7 == arg0) {
			local1 = 131072;
		} else if (Static145.aClass31_3 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, 11, local1 | this.anInt8310);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7178(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method7164();
	}

	@OriginalMember(owner = "client!hg", name = "T", descriptor = "(I)V")
	@Override
	protected void method7336() {
		this.anIDirect3DDevice1.a(137, this.aBoolean606 && !this.aBoolean598);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([Lclient!jp;I)Lclient!vr;")
	@Override
	public Class310 method7266(@OriginalArg(0) Class154[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "(I)V")
	@Override
	protected void method7247() {
		this.anIDirect3DDevice1.a(28, this.aBoolean611 && this.aBoolean607 && this.aBoolean594 | this.anInt8289 >= 0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!g;ZLclient!vp;)Lclient!eea;")
	@Override
	public Interface5 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(4) Class308 arg3) {
		return new Class19_Sub3(this, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "(I)V")
	@Override
	protected void method7319() {
		if (this.aBoolean593) {
			Static177.aFloatArray35[8] = 0.0F;
			Static177.aFloatArray35[5] = 1.0F;
			Static177.aFloatArray35[3] = 0.0F;
			Static177.aFloatArray35[10] = 1.0F;
			Static177.aFloatArray35[14] = 0.0F;
			Static177.aFloatArray35[7] = 0.0F;
			Static177.aFloatArray35[6] = 0.0F;
			Static177.aFloatArray35[2] = 0.0F;
			Static177.aFloatArray35[15] = 1.0F;
			Static177.aFloatArray35[1] = 0.0F;
			Static177.aFloatArray35[12] = 0.0F;
			Static177.aFloatArray35[11] = 0.0F;
			Static177.aFloatArray35[0] = 1.0F;
			Static177.aFloatArray35[13] = 0.0F;
			Static177.aFloatArray35[4] = 0.0F;
			Static177.aFloatArray35[9] = 0.0F;
		} else {
			this.aClass128_Sub3_15.method6901(Static177.aFloatArray35);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static177.aFloatArray35);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[BZILclient!g;II)Lclient!eea;")
	@Override
	protected Interface5 method7345(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class110 arg4) {
		return new Class19_Sub3(this, arg4, arg3, arg0, arg2, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "(I)V")
	@Override
	protected void method7334() {
		@Pc(15) int local15 = this.aBooleanArray7[this.anInt8310] ? Static177.method3491(this.aClass246Array6[this.anInt8310]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, 1, local15);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
	@Override
	public void method7231(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, 11, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	@Override
	protected void method7226() {
		if (Static158.aClass107_1 == this.aClass107Array3[this.anInt8310]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, 24, 0);
			this.anIntArray293[this.anInt8310] = 0;
			return;
		}
		if (Static470.aClass107_7 == this.aClass107Array3[this.anInt8310]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8310 + 16, this.aClass128_Sub3Array3[this.anInt8310].method6901(Static177.aFloatArray35));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8310 + 16, this.aClass128_Sub3Array3[this.anInt8310].method6890(Static177.aFloatArray35));
		}
		@Pc(60) int local60 = Static177.method3492(this.aClass107Array3[this.anInt8310]);
		if (local60 != this.anIntArray293[this.anInt8310]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, 24, local60);
			this.anIntArray293[this.anInt8310] = local60;
		}
	}

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "(I)V")
	@Override
	protected void method7317() {
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "(I)V")
	@Override
	protected void method7236() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8319; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass136Array1[local1] = Static114.aClass136_8;
			this.aBooleanArray9[local1] = this.aBooleanArray8[local1] = true;
			this.aBooleanArray10[local1] = false;
			this.anIntArray293[local1] = 0;
		}
		this.anIDirect3DDevice1.SetTextureStageState(0, 6, 1);
		this.anIDirect3DDevice1.SetRenderState(9, 2);
		this.anIDirect3DDevice1.SetRenderState(23, 4);
		this.anIDirect3DDevice1.SetRenderState(25, 5);
		this.anIDirect3DDevice1.SetRenderState(24, 0);
		this.anIDirect3DDevice1.SetRenderState(22, 2);
		this.anIDirect3DDevice1.SetRenderState(147, 1);
		this.anIDirect3DDevice1.SetRenderState(145, 1);
		this.anIDirect3DDevice1.a(38, 0.95F);
		this.anIDirect3DDevice1.SetRenderState(140, 3);
		this.aD3DLIGHT1.SetType(3);
		this.aD3DLIGHT3.SetType(3);
		this.aD3DLIGHT2.SetType(1);
		this.aBoolean304 = false;
		super.method7236();
	}

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "()Z")
	@Override
	public boolean method7182() {
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "(B)V")
	@Override
	protected void method7309() {
		this.anIDirect3DDevice1.a(7, this.aBoolean595);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7276(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (arg1 == this.aCanvas14) {
			this.anIDirect3DDevice1.EndScene();
			this.method3486();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V")
	@Override
	public void method7216(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "()V")
	@Override
	public void method7168() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7206(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hg", name = "V", descriptor = "(I)V")
	@Override
	protected void method7342() {
		if (Static143.aClass294_5 == this.aClass294_13) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static344.aClass294_9 == this.aClass294_13) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static513.aClass294_15 == this.aClass294_13) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method7233(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "()Lclient!fd;")
	@Override
	public Class98 method7207() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt3743, 0);
		return new Class98(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZB)Lclient!iaa;")
	@Override
	public Interface9 method7227(@OriginalArg(0) boolean arg0) {
		return new Class133(this, Static517.aClass308_16, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!vp;Lclient!g;)Z")
	@Override
	public boolean method7308(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Class110 arg1) {
		@Pc(13) D3DDISPLAYMODE local13 = this.anIDirect3D1.c(this.anInt3743);
		return dt.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3743, this.anInt3744, local13.Format, 0, 3, Static177.method3493(arg1, arg0)), -2005530590);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!bg;IZI)V")
	@Override
	protected void method7298(@OriginalArg(0) Class27 arg0, @OriginalArg(3) int arg1) {
		@Pc(15) byte local15;
		if (arg1 == 1) {
			local15 = 6;
		} else if (arg1 == 2) {
			local15 = 27;
		} else {
			local15 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, local15, Static177.method3490(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!mv;Lclient!mv;FLclient!mv;)Lclient!mv;")
	@Override
	public Class103 method7200(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class103 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!mda;)V")
	public void method3489(@OriginalArg(1) Class19_Sub3 arg0) {
		this.method3487(arg0);
		if (arg0.aBoolean418 != this.aBooleanArray9[this.anInt8310]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 1, arg0.aBoolean418 ? 1 : 3);
			this.aBooleanArray9[this.anInt8310] = arg0.aBoolean418;
		}
		if (this.aBooleanArray8[this.anInt8310] != arg0.aBoolean417) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8310, 2, arg0.aBoolean417 ? 1 : 3);
			this.aBooleanArray8[this.anInt8310] = arg0.aBoolean417;
		}
	}

	@OriginalMember(owner = "client!hg", name = "O", descriptor = "(I)V")
	@Override
	protected void method7320() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat176 * this.aFloat175, this.aFloat179 * this.aFloat176, this.aFloat176 * this.aFloat172, 1.0F);
		this.aBoolean304 = false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILclient!sc;Lclient!iaa;II)V")
	@Override
	public void method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class263 arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class133) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static177.method3485(arg2), 0, arg0, arg1, arg5, arg4);
	}

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "()V")
	@Override
	public void method7221() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (!dt.a(local3.Issue(), -2005530590)) {
			return;
		}
		while (true) {
			@Pc(12) int local12 = local3.IsSignaled();
			if (local12 != 1) {
				break;
			}
			Thread.yield();
		}
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "(B)V")
	@Override
	protected void method7300() {
		if (this.aClass137_7.method3761()) {
			this.aClass128_Sub3_18.method6901(Static177.aFloatArray35);
		} else {
			Static177.aFloatArray35[6] = 0.0F;
			Static177.aFloatArray35[11] = 0.0F;
			Static177.aFloatArray35[12] = 0.0F;
			Static177.aFloatArray35[3] = 0.0F;
			Static177.aFloatArray35[9] = 0.0F;
			Static177.aFloatArray35[8] = 0.0F;
			Static177.aFloatArray35[13] = 0.0F;
			Static177.aFloatArray35[0] = 1.0F;
			Static177.aFloatArray35[15] = 1.0F;
			Static177.aFloatArray35[1] = 0.0F;
			Static177.aFloatArray35[2] = 0.0F;
			Static177.aFloatArray35[14] = 0.0F;
			Static177.aFloatArray35[4] = 0.0F;
			Static177.aFloatArray35[10] = 1.0F;
			Static177.aFloatArray35[5] = 1.0F;
			Static177.aFloatArray35[7] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static177.aFloatArray35);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!g;III[BZ)Lclient!aw;")
	@Override
	public Interface3 method7305(@OriginalArg(0) Class110 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class19_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "(I)V")
	@Override
	protected void method7292() {
		this.anIDirect3DDevice1.a(174, this.aBoolean613);
	}

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "()Z")
	@Override
	public boolean method7204() {
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "(I)V")
	@Override
	protected void method7232() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8306);
	}

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "()V")
	@Override
	public void method7202() {
		this.method7348(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7258(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7177(@OriginalArg(0) int arg0) {
		this.aPe1.b(48);
		super.method7177(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "()V")
	@Override
	public void method7161() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZIILclient!bg;)V")
	@Override
	public void method7351(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class27 arg3) {
		@Pc(5) int local5 = 0;
		@Pc(18) byte local18;
		if (arg2 == 1) {
			local18 = 3;
		} else if (arg2 == 2) {
			local18 = 26;
		} else {
			local18 = 2;
		}
		if (arg0) {
			local5 = 32;
		}
		if (arg1) {
			local5 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, local18, local5 | Static177.method3490(arg3));
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "(I)F")
	@Override
	protected float method7314() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!hg", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method7313(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass290_1 = (Class290) arg0;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(ZI)V")
	@Override
	public void method7327(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
	@Override
	protected void method7230() {
		this.anIDirect3DDevice1.a(27, this.aBoolean602);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([FIIZIILclient!g;B)Lclient!eea;")
	@Override
	protected Interface5 method7318(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class110 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!sc;III)V")
	@Override
	public void method7322(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static177.method3485(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!g;Lclient!vp;)Z")
	@Override
	public boolean method7237(@OriginalArg(1) Class110 arg0, @OriginalArg(2) Class308 arg1) {
		@Pc(5) D3DDISPLAYMODE local5 = this.anIDirect3D1.c(this.anInt3743);
		return dt.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3743, this.anInt3744, local5.Format, 0, 4, Static177.method3493(arg0, arg1)), -2005530590);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!rq;IB)V")
	@Override
	public void method7251(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class60 local6 = (Class60) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local6.anIDirect3DVertexBuffer1, 0, local6.method1762());
	}

	@OriginalMember(owner = "client!hg", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return 0;
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "(B)V")
	@Override
	protected void method7269() {
		@Pc(15) int local15 = this.aBooleanArray7[this.anInt8310] ? Static177.method3491(this.aClass246Array5[this.anInt8310]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8310, 4, local15);
	}

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "(I)V")
	@Override
	protected void method7307() {
		this.anIDirect3DDevice1.a(15, this.aBoolean597);
	}

	@OriginalMember(owner = "client!hg", name = "X", descriptor = "(I)V")
	@Override
	protected void method7346() {
		this.aD3DLIGHT3.SetDiffuse(this.aFloat174 * this.aFloat175, this.aFloat179 * this.aFloat174, this.aFloat174 * this.aFloat172, 1.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat175 * -this.aFloat166, -this.aFloat166 * this.aFloat179, -this.aFloat166 * this.aFloat172, 1.0F);
		this.aBoolean304 = false;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(BI)Lclient!lj;")
	@Override
	protected Class73 method7256(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class73_Sub9(this, this.aClass69_92);
		} else if (arg0 == 4) {
			return new Class73_Sub4(this, this.aClass69_92, this.aClass173_6);
		} else {
			return super.method7256(arg0);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI[IIII)Lclient!eea;")
	@Override
	public Interface5 method7323(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class19_Sub3(this, arg4, arg1, arg0, arg2, 0, arg3);
	}
}
