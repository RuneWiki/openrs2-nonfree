import jaclib.peer.hb;
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
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.fda;
import jagdx.ue;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class20_Sub2_Sub1 extends Class20_Sub2 {

	@OriginalMember(owner = "client!bfa", name = "Xg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!bfa", name = "Og", descriptor = "I")
	private int anInt1308 = 0;

	@OriginalMember(owner = "client!bfa", name = "eh", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!bfa", name = "Rg", descriptor = "Lclient!jaclib/peer/hb;")
	public final hb aHb1;

	@OriginalMember(owner = "client!bfa", name = "dh", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!bfa", name = "kh", descriptor = "I")
	private final int anInt1310;

	@OriginalMember(owner = "client!bfa", name = "Wg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!bfa", name = "ch", descriptor = "I")
	private final int anInt1309;

	@OriginalMember(owner = "client!bfa", name = "Qg", descriptor = "Lclient!je;")
	private Class163 aClass163_1;

	@OriginalMember(owner = "client!bfa", name = "nh", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!bfa", name = "Ug", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!bfa", name = "Sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!bfa", name = "Zg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!bfa", name = "lh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!bfa", name = "gh", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!bfa", name = "oh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!bfa", name = "bh", descriptor = "Z")
	public final boolean aBoolean108;

	@OriginalMember(owner = "client!bfa", name = "Vg", descriptor = "Z")
	public final boolean aBoolean107;

	@OriginalMember(owner = "client!bfa", name = "fh", descriptor = "Z")
	public final boolean aBoolean110;

	@OriginalMember(owner = "client!bfa", name = "jh", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!bfa", name = "hh", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!bfa", name = "Ng", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bfa", name = "Yg", descriptor = "[Lclient!ria;")
	private final Class298[] aClass298Array1;

	@OriginalMember(owner = "client!bfa", name = "ih", descriptor = "[I")
	private final int[] anIntArray56;

	@OriginalMember(owner = "client!bfa", name = "Pg", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!bfa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!in;Ljava/lang/Integer;)Lclient!ha;")
	private static Class20 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class20_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) hb local9 = new hb();
			@Pc(13) IDirect3D local13 = IDirect3D.a(-2147483616, local9);
			@Pc(18) D3DCAPS local18 = local13.b(local3, local5);
			if ((local18.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local18.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x10 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(181) D3DPRESENT_PARAMETERS local181 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static39.method1337(local181, local3, local13, local5, arg3)) {
					throw new RuntimeException("");
				}
				local181.PresentationInterval = Integer.MIN_VALUE;
				local181.EnableAutoDepthStencil = true;
				local181.Windowed = true;
				@Pc(206) int local206 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local206 |= 0x10;
				}
				@Pc(230) IDirect3DDevice local230;
				try {
					local230 = local13.a(local3, local5, arg0, local206 | 0x40, local181);
				} catch (@Pc(232) fda local232) {
					local230 = local13.a(local3, local5, arg0, local206 | 0x20, local181);
				}
				@Pc(251) Class163 local251 = new Class163(local230.b(0), local230.c());
				local1 = new Class20_Sub2_Sub1(local3, local5, arg0, local9, local13, local230, local251, local181, local18, arg1, arg2, arg3);
				local1.method1564();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(274) RuntimeException local274) {
			if (local1 != null) {
				local1.method7255();
			}
			throw local274;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/hb;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!je;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!in;I)V")
	public Class20_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) hb arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class163 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class157 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aHb1 = arg3;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt1310 = arg1;
			this.anIDirect3D1 = arg4;
			this.anInt1309 = arg0;
			this.aClass163_1 = arg6;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DCAPS1 = arg8;
			this.aD3DLIGHT1 = new D3DLIGHT(this.aHb1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aHb1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aHb1);
			this.aPixelBuffer1 = new PixelBuffer(this.aHb1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aHb1);
			new GeometryBuffer(this.aHb1);
			this.aBoolean115 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean108 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean107 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean110 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.anInt1562 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
			this.aBoolean128 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt1540 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean132 = this.anInt1554 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt1309, this.anInt1310, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray7 = new boolean[this.anInt1540];
			this.aBooleanArray6 = new boolean[this.anInt1540];
			this.aBooleanArray4 = new boolean[this.anInt1540];
			this.aClass298Array1 = new Class298[this.anInt1540];
			this.anIntArray56 = new int[this.anInt1540];
			this.aBooleanArray5 = new boolean[this.anInt1540];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(218) Throwable local218) {
			local218.printStackTrace();
			this.method7238();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bfa", name = "H", descriptor = "(I)V")
	@Override
	protected void method1562() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat63 * this.aFloat51, this.aFloat51 * this.aFloat49, this.aFloat59 * this.aFloat51, (float) 0);
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!kf;IBZ)V")
	@Override
	protected void method1463(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1) {
		@Pc(19) byte local19;
		if (arg1 == 1) {
			local19 = 6;
		} else if (arg1 == 2) {
			local19 = 27;
		} else {
			local19 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, local19, Static39.method1334(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!bfa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (ue.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), false) && ue.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), false)) {
			local1 = new int[arg3 * arg2];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(67) int local67 = 0; local67 < arg3; local67++) {
					this.aPixelBuffer1.b(local1, local67 * arg2, local67 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(9275);
		local16.a(9275);
		return local1;
	}

	@OriginalMember(owner = "client!bfa", name = "j", descriptor = "(Z)V")
	@Override
	protected void method1502() {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method1496(@OriginalArg(1) Class22 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!kt;)V")
	public void method1327(@OriginalArg(1) Class55_Sub2 arg0) {
		this.method1329(arg0);
		if (this.aBooleanArray5[this.anInt1574] != arg0.aBoolean477) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 1, arg0.aBoolean477 ? 1 : 3);
			this.aBooleanArray5[this.anInt1574] = arg0.aBoolean477;
		}
		if (this.aBooleanArray7[this.anInt1574] != arg0.aBoolean478) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 2, arg0.aBoolean478 ? 1 : 3);
			this.aBooleanArray7[this.anInt1574] = arg0.aBoolean478;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "j", descriptor = "(B)V")
	@Override
	protected void method1475() {
		this.anIDirect3DDevice1.a(14, this.aBoolean121 && this.aBoolean119);
	}

	@OriginalMember(owner = "client!bfa", name = "v", descriptor = "()V")
	@Override
	public void method7301() {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!wq;ZI[B)Lclient!ir;")
	@Override
	public Interface13 method1506(@OriginalArg(2) Class375 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class55_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "(B)V")
	@Override
	protected void method1461() {
		this.anIDirect3DDevice1.a(28, this.aBoolean125 && this.bf && this.anInt1541 >= 0);
	}

	@OriginalMember(owner = "client!bfa", name = "t", descriptor = "(B)V")
	@Override
	protected void method1535() {
		if (this.aBoolean113) {
			Static39.aFloatArray24[1] = 0.0F;
			Static39.aFloatArray24[2] = 0.0F;
			Static39.aFloatArray24[15] = 1.0F;
			Static39.aFloatArray24[3] = 0.0F;
			Static39.aFloatArray24[9] = 0.0F;
			Static39.aFloatArray24[6] = 0.0F;
			Static39.aFloatArray24[0] = 1.0F;
			Static39.aFloatArray24[7] = 0.0F;
			Static39.aFloatArray24[11] = 0.0F;
			Static39.aFloatArray24[13] = 0.0F;
			Static39.aFloatArray24[10] = 1.0F;
			Static39.aFloatArray24[8] = 0.0F;
			Static39.aFloatArray24[12] = 0.0F;
			Static39.aFloatArray24[5] = 1.0F;
			Static39.aFloatArray24[14] = 0.0F;
			Static39.aFloatArray24[4] = 0.0F;
		} else {
			this.aClass30_Sub2_15.method4038(Static39.aFloatArray24);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static39.aFloatArray24);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method1560(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZZILclient!kf;Z)V")
	@Override
	public void method1558(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 3;
		} else if (arg1 == 2) {
			local12 = 26;
		} else {
			local12 = 2;
		}
		@Pc(20) int local20 = 0;
		if (arg0) {
			local20 = 32;
		}
		if (arg3) {
			local20 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, local12, local20 | Static39.method1334(arg2));
	}

	@OriginalMember(owner = "client!bfa", name = "x", descriptor = "(I)V")
	@Override
	public void method1526() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray33[0], -this.aFloatArray33[1], -this.aFloatArray33[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray25[0], -this.aFloatArray25[1], -this.aFloatArray25[2]);
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)Lclient!vm;")
	@Override
	public Interface25 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(BI)V")
	@Override
	public void method1544(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, 11, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method1545(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BLclient!cg;)V")
	public void method1329(@OriginalArg(1) Class55 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt1574, arg0.method6142());
		if (this.aClass298Array1[this.anInt1574] != arg0.aClass298_8) {
			@Pc(61) int local61 = Static39.method1325(arg0.aClass298_8);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 6, local61);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 5, local61);
			this.aClass298Array1[this.anInt1574] = arg0.aClass298_8;
			if (this.aBooleanArray6[this.anInt1574] != arg0.aBoolean526) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 7, arg0.aBoolean526 ? Static39.method1325(arg0.aClass298_8) : 0);
				this.aBooleanArray6[this.anInt1574] = arg0.aBoolean526;
			}
		} else if (this.aBooleanArray6[this.anInt1574] != arg0.aBoolean526) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 7, arg0.aBoolean526 ? Static39.method1325(arg0.aClass298_8) : 0);
			this.aBooleanArray6[this.anInt1574] = arg0.aBoolean526;
		}
		if (!this.aBooleanArray4[this.anInt1574]) {
			this.aBooleanArray4[this.anInt1574] = true;
			this.method1569();
			this.method1554();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "(II)Lclient!he;")
	@Override
	public Interface12 method7268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1447() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray28);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;B)V")
	public void method1330(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method1574();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!hj;ILclient!uq;IIII)V")
	@Override
	public void method1572(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class238) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static39.method1326(arg0), 0, arg3, arg5, arg4, arg1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!he;Lclient!vm;)Lclient!is;")
	@Override
	public Interface14 method7237(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "()V")
	@Override
	public void method7275() {
	}

	@OriginalMember(owner = "client!bfa", name = "w", descriptor = "(I)V")
	@Override
	protected void method1522() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt1578 + this.anInt1549, this.anInt1552 - -this.anInt1571, this.anInt1579, this.anInt1544);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7310(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7229(arg2, arg3);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZLclient!wq;Lclient!baa;)Z")
	@Override
	public boolean method1565(@OriginalArg(1) Class375 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return ue.a(this.anIDirect3D1.a(this.anInt1309, local3), false) && ue.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt1309, this.anInt1310, local3.Format, 0, 4, Static39.method1331(arg1, arg0)), false);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method1515(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass163_1 = (Class163) arg0;
	}

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "(Z)V")
	@Override
	protected void method1476() {
		@Pc(7) float local7 = this.aBoolean116 ? this.aFloat62 : 0.0F;
		@Pc(16) float local16 = this.aBoolean116 ? -this.aFloat65 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(local7 * this.aFloat63, this.aFloat49 * local7, local7 * this.aFloat59, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat63 * local16, this.aFloat49 * local16, this.aFloat59 * local16, 0.0F);
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "()Z")
	@Override
	public boolean method7269() {
		return false;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "()V")
	@Override
	public void method7236() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (ue.a(local3.Issue(), false)) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(9275);
	}

	@OriginalMember(owner = "client!bfa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bfa", name = "P", descriptor = "(I)V")
	@Override
	protected void method1579() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt1555);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!wh;Lclient!wh;FLclient!wh;)Lclient!wh;")
	@Override
	public Class78 method7309(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7250(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "(B)V")
	@Override
	protected void method1457() {
		@Pc(9) int local9;
		for (local9 = 0; local9 < this.anInt1566; local9++) {
			@Pc(22) Class2_Sub1 local22 = this.aClass2_Sub1Array3[local9];
			@Pc(26) int local26 = local9 + 2;
			@Pc(30) int local30 = local22.method3965();
			@Pc(36) float local36 = local22.method3966() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local22.method3969(), (float) local22.method3967(), (float) local22.method3962());
			this.aD3DLIGHT3.SetDiffuse(local36 * (float) (local30 >> 16 & 0xFF), (float) (local30 >> 8 & 0xFF) * local36, local36 * (float) (local30 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local22.method3968() * local22.method3968()));
			this.aD3DLIGHT3.SetRange((float) local22.method3968());
			this.anIDirect3DDevice1.SetLight(local26, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local26, true);
		}
		while (this.anInt1556 > local9) {
			this.anIDirect3DDevice1.LightEnable(local9 + 2, false);
			local9++;
		}
		super.method1457();
	}

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "(B)V")
	@Override
	protected void method1453() {
		if (this.aBooleanArray4[this.anInt1574]) {
			this.aBooleanArray4[this.anInt1574] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt1574, null);
			this.method1569();
			this.method1554();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "z", descriptor = "(I)V")
	@Override
	protected void method1532() {
		if (this.aClass286_4.method7446()) {
			this.aClass30_Sub2_18.method4038(Static39.aFloatArray24);
		} else {
			Static39.aFloatArray24[1] = 0.0F;
			Static39.aFloatArray24[7] = 0.0F;
			Static39.aFloatArray24[12] = 0.0F;
			Static39.aFloatArray24[0] = 1.0F;
			Static39.aFloatArray24[5] = 1.0F;
			Static39.aFloatArray24[13] = 0.0F;
			Static39.aFloatArray24[2] = 0.0F;
			Static39.aFloatArray24[11] = 0.0F;
			Static39.aFloatArray24[9] = 0.0F;
			Static39.aFloatArray24[10] = 1.0F;
			Static39.aFloatArray24[14] = 0.0F;
			Static39.aFloatArray24[8] = 0.0F;
			Static39.aFloatArray24[4] = 0.0F;
			Static39.aFloatArray24[15] = 1.0F;
			Static39.aFloatArray24[6] = 0.0F;
			Static39.aFloatArray24[3] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static39.aFloatArray24);
	}

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "()V")
	@Override
	protected void method7255() {
		this.aHb1.a((byte) 13);
		super.method7255();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)Lclient!uq;")
	@Override
	public Interface24 method1474(@OriginalArg(1) boolean arg0) {
		return new Class238(this, Static29.aClass26_5, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!bfa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "(I)V")
	@Override
	protected void method1485() {
		this.aFloat53 = this.anInt1567 - this.anInt1548;
		this.aFloat61 = (float) -this.anInt1541 + this.aFloat53;
		if (this.aFloat61 < (float) this.anInt1543) {
			this.aFloat61 = this.anInt1543;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat61);
		this.anIDirect3DDevice1.a(37, this.aFloat53);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt1563);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!wq;II[FZIII)Lclient!wfa;")
	@Override
	protected Interface27 method1489(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "(B)V")
	@Override
	protected void method1518() {
		if (this.aBoolean109) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean109 = true;
	}

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "()Z")
	@Override
	public boolean method7274() {
		return false;
	}

	@OriginalMember(owner = "client!bfa", name = "D", descriptor = "(B)V")
	@Override
	protected void method1571() {
		this.anIDirect3DDevice1.SetViewport(this.anInt1578, this.anInt1552, this.anInt1398, this.anInt1428, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!nc;)V")
	public void method1332(@OriginalArg(1) Class55_Sub3 arg0) {
		this.method1329(arg0);
		if (!this.aBooleanArray5[this.anInt1574]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 1, 1);
			this.aBooleanArray5[this.anInt1574] = true;
		}
		if (!this.aBooleanArray7[this.anInt1574]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt1574, 2, 1);
			this.aBooleanArray7[this.anInt1574] = true;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!hj;Z)V")
	@Override
	public void method1533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static39.method1326(arg2), arg1, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "(Z)V")
	@Override
	protected void method1452() {
		this.method1476();
		this.method1518();
	}

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "()V")
	@Override
	public void method7276() {
	}

	@OriginalMember(owner = "client!bfa", name = "Q", descriptor = "(I)V")
	@Override
	protected void method1581() {
		this.anIDirect3DDevice1.a(27, this.aBoolean118);
	}

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "(I)V")
	@Override
	protected void method1493() {
		this.anIDirect3DDevice1.a(7, this.aBoolean130);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIII[BLclient!wq;IZ)Lclient!wfa;")
	@Override
	protected Interface27 method1477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class375 arg3, @OriginalArg(7) boolean arg4) {
		return new Class55_Sub2(this, arg3, arg1, arg0, arg4, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7249(@OriginalArg(0) int arg0) {
		this.aHb1.b((byte) -82);
		super.method7249(arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "i", descriptor = "(Z)F")
	@Override
	protected float method1492() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method1510(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "(Z)Z")
	private boolean method1333() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(23) Class163 local23 = (Class163) this.anObject6;
			this.method1556();
			local23.method4734();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static39.method1337(this.aD3DPRESENT_PARAMETERS1, this.anInt1309, this.anIDirect3D1, this.anInt1310, this.anInt1554)) {
				@Pc(56) int local56 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (ue.a(local56, false)) {
					local23.method4735(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.c());
					this.method1536();
					this.method1516();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bfa", name = "F", descriptor = "(I)V")
	@Override
	protected void method1554() {
		@Pc(15) int local15 = this.aBooleanArray4[this.anInt1574] ? Static39.method1328(this.aClass315Array5[this.anInt1574]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, 1, local15);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[IZBIII)Lclient!wfa;")
	@Override
	public Interface27 method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class55_Sub2(this, arg0, arg5, arg2, arg1, 0, arg4);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!is;)V")
	@Override
	public void method7290(@OriginalArg(0) Interface14 arg0) {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([[IZII)Lclient!nj;")
	@Override
	public Interface19 method1534(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class55_Sub1(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "E", descriptor = "(B)V")
	@Override
	protected void method1573() {
		this.anIDirect3DDevice1.a(15, this.aBoolean123);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[Lclient!jl;)Lclient!np;")
	@Override
	public Class22 method1446(@OriginalArg(1) Class168[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method1335(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "A", descriptor = "()V")
	@Override
	public void method7313() {
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(ZI)Lclient!tc;")
	@Override
	public Interface22 method1523(@OriginalArg(0) boolean arg0) {
		return new Class15(this, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "G", descriptor = "(I)V")
	@Override
	protected void method1555() {
		this.anIDirect3DDevice1.a(174, this.aBoolean133);
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IB)Lclient!fj;")
	@Override
	protected Class17 method1466(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class17_Sub3(this, this.aClass157_32);
		} else if (arg0 == 4) {
			return new Class17_Sub4(this, this.aClass157_32, this.aClass347_3);
		} else if (arg0 == 8) {
			return new Class17_Sub5(this, this.aClass157_32, this.aClass347_3);
		} else {
			return super.method1466(arg0);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7303(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!bf;I)V")
	@Override
	public void method1505(@OriginalArg(0) Class31 arg0) {
		@Pc(1) int local1 = 0;
		if (Static228.aClass31_2 == arg0) {
			local1 = 65536;
		} else if (Static13.aClass31_1 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static570.aClass31_4) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, 11, this.anInt1574 | local1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!baa;Lclient!wq;B)Z")
	@Override
	public boolean method1514(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class375 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return ue.a(this.anIDirect3D1.a(this.anInt1309, local3), false) && ue.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt1309, this.anInt1310, local3.Format, 0, 3, Static39.method1331(arg0, arg1)), false);
	}

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "(B)V")
	@Override
	protected void method1516() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1540; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass298Array1[local1] = Static292.aClass298_5;
			this.aBooleanArray5[local1] = this.aBooleanArray7[local1] = true;
			this.aBooleanArray6[local1] = false;
			this.anIntArray56[local1] = 0;
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
		this.aD3DLIGHT2.SetType(3);
		this.aD3DLIGHT3.SetType(1);
		this.aBoolean109 = false;
		super.method1516();
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "()Lclient!fia;")
	@Override
	public Class108 method7240() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt1309, 0);
		return new Class108(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!bfa", name = "K", descriptor = "(I)V")
	@Override
	protected void method1569() {
		@Pc(19) int local19 = this.aBooleanArray4[this.anInt1574] ? Static39.method1328(this.aClass315Array6[this.anInt1574]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, 4, local19);
	}

	@OriginalMember(owner = "client!bfa", name = "M", descriptor = "(I)V")
	@Override
	protected void method1574() {
		if (this.anIDirect3DVertexShader1 != null || this.aClass332Array3[this.anInt1574] == Static263.aClass332_3) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, 24, 0);
			this.anIntArray56[this.anInt1574] = 0;
			return;
		}
		if (Static547.aClass332_6 == this.aClass332Array3[this.anInt1574]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt1574 + 16, this.aClass30_Sub2Array3[this.anInt1574].method4048(Static39.aFloatArray24));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt1574 + 16, this.aClass30_Sub2Array3[this.anInt1574].method4038(Static39.aFloatArray24));
		}
		@Pc(62) int local62 = Static39.method1336(this.aClass332Array3[this.anInt1574]);
		if (local62 != this.anIntArray56[this.anInt1574]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt1574, 24, local62);
			this.anIntArray56[this.anInt1574] = local62;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IBILclient!baa;Lclient!wq;)Lclient!wfa;")
	@Override
	public Interface27 method1495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class375 arg3) {
		return new Class55_Sub2(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method1478(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.lb) {
			return;
		}
		@Pc(7) Dimension local7 = arg0.getSize();
		if (local7.width > 0 && local7.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method1333();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "u", descriptor = "(I)V")
	@Override
	protected void method1517() {
		this.anIDirect3DDevice1.a(137, this.aBoolean124 && !this.aBoolean126);
	}

	@OriginalMember(owner = "client!bfa", name = "S", descriptor = "(I)V")
	@Override
	protected void method1584() {
		if (Static142.aClass266_4 == this.aClass266_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass266_3 == Static288.aClass266_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static586.aClass266_7 == this.aClass266_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)V")
	@Override
	public void method7229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass163_1.method4736()) {
			this.anInt1308 = 0;
			if (ue.a((byte) 97, this.aClass163_1.method4733())) {
				this.method1333();
			}
		} else if (++this.anInt1308 <= 50) {
			this.method1333();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!tc;I)V")
	@Override
	public void method1559(@OriginalArg(1) Interface22 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class15 local10 = (Class15) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local10.anIDirect3DVertexBuffer1, 0, local10.method333());
	}

	@OriginalMember(owner = "client!bfa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method1580(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}
}
