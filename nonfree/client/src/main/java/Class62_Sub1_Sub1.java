import jaclib.peer.wn;
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
import jagdx.dk;
import jagdx.fe;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class62_Sub1_Sub1 extends Class62_Sub1 {

	@OriginalMember(owner = "client!de", name = "Lg", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!de", name = "Ig", descriptor = "I")
	private int anInt2098 = 0;

	@OriginalMember(owner = "client!de", name = "Cg", descriptor = "I")
	private final int anInt2097;

	@OriginalMember(owner = "client!de", name = "yg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!de", name = "Dg", descriptor = "Lclient!wp;")
	private Class316 aClass316_1;

	@OriginalMember(owner = "client!de", name = "Xg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!de", name = "zg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!de", name = "Qg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!de", name = "Pg", descriptor = "Lclient!jaclib/peer/wn;")
	public final wn aWn1;

	@OriginalMember(owner = "client!de", name = "Ng", descriptor = "I")
	private final int anInt2099;

	@OriginalMember(owner = "client!de", name = "xg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!de", name = "Sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!de", name = "Kg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!de", name = "Wg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!de", name = "Gg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!de", name = "Tg", descriptor = "Z")
	public final boolean aBoolean137;

	@OriginalMember(owner = "client!de", name = "Hg", descriptor = "Z")
	public final boolean aBoolean135;

	@OriginalMember(owner = "client!de", name = "Bg", descriptor = "Z")
	public final boolean aBoolean134;

	@OriginalMember(owner = "client!de", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!de", name = "Mg", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!de", name = "Eg", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!de", name = "Fg", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!de", name = "Jg", descriptor = "[I")
	private final int[] anIntArray176;

	@OriginalMember(owner = "client!de", name = "Ug", descriptor = "[Lclient!em;")
	private final Class86[] aClass86Array1;

	@OriginalMember(owner = "client!de", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!n;Lclient!gp;Ljava/lang/Integer;)Lclient!qa;")
	public static Class62 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class62_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) wn local9 = new wn();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(189) D3DPRESENT_PARAMETERS local189 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static87.method1935(arg3, local5, local3, local13, local189)) {
					throw new RuntimeException("");
				}
				local189.Windowed = true;
				local189.PresentationInterval = Integer.MIN_VALUE;
				local189.EnableAutoDepthStencil = true;
				@Pc(214) int local214 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local214 |= 0x10;
				}
				@Pc(238) IDirect3DDevice local238;
				try {
					local238 = local13.a(local3, local5, arg0, local214 | 0x40, local189);
				} catch (@Pc(240) dk local240) {
					local238 = local13.a(local3, local5, arg0, local214 | 0x20, local189);
				}
				@Pc(259) Class316 local259 = new Class316(local238.c(0), local238.c());
				local1 = new Class62_Sub1_Sub1(local3, local5, arg0, local9, local13, local238, local259, local189, local18, arg1, arg2, arg3);
				local1.method4691();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(282) RuntimeException local282) {
			if (local1 != null) {
				local1.method7037();
			}
			throw local282;
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/wn;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!wp;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!n;Lclient!gp;I)V")
	public Class62_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) wn arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class316 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface8 arg9, @OriginalArg(10) Class117 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt2097 = arg0;
		this.aD3DCAPS1 = arg8;
		this.aClass316_1 = arg6;
		this.anIDirect3DDevice1 = arg5;
		this.anIDirect3D1 = arg4;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aWn1 = arg3;
		this.anInt2099 = arg1;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aWn1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aWn1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aWn1);
		this.aPixelBuffer1 = new PixelBuffer(this.aWn1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aWn1);
		this.aBoolean394 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean137 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean135 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.anInt5699 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean379 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt5677 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean134 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean384 = this.anInt5678 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt2097, this.anInt2099, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray12 = new boolean[this.anInt5677];
		this.aBooleanArray11 = new boolean[this.anInt5677];
		this.aBooleanArray9 = new boolean[this.anInt5677];
		this.aBooleanArray10 = new boolean[this.anInt5677];
		this.anIntArray176 = new int[this.anInt5677];
		this.aClass86Array1 = new Class86[this.anInt5677];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method7030();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(234) Exception_Sub1 local234) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!de", name = "y", descriptor = "(I)V")
	@Override
	protected void method4697() {
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean385);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean385);
	}

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "(I)F")
	@Override
	protected float method4774() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!de", name = "s", descriptor = "()V")
	@Override
	public void method7035() {
	}

	@OriginalMember(owner = "client!de", name = "C", descriptor = "(I)V")
	@Override
	protected void method4708() {
		this.anIDirect3DDevice1.a(15, this.aBoolean382);
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "()Lclient!dp;")
	@Override
	public Class68 method7016() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt2097, 0);
		return new Class68(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!de", name = "l", descriptor = "(B)V")
	@Override
	protected void method4747() {
		this.anIDirect3DDevice1.a(28, this.aBoolean393 && this.aBoolean387 && this.anInt5689 >= 0 | this.aBoolean388);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z[Lclient!wg;)Lclient!ws;")
	@Override
	public Class318 method4782(@OriginalArg(1) Class313[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLclient!dg;Z)V")
	@Override
	protected void method4662(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(17) byte local17;
		if (arg0 == 1) {
			local17 = 6;
		} else if (arg0 == 2) {
			local17 = 27;
		} else {
			local17 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, local17, Static87.method1927(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!de", name = "n", descriptor = "(I)V")
	@Override
	protected void method4670() {
		if (this.aClass28_9 == Static318.aClass28_10) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass28_9 == Static193.aClass28_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass28_9 == Static4.aClass28_12) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!kl;Lclient!vt;)Z")
	@Override
	public boolean method4660(@OriginalArg(1) Class174 arg0, @OriginalArg(2) Class306 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = this.anIDirect3D1.b(this.anInt2097);
		return fe.a((byte) -96, this.anIDirect3D1.CheckDeviceFormat(this.anInt2097, this.anInt2099, local11.Format, 0, 4, Static87.method1934(arg0, arg1)));
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method4689(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[[IBZ)Lclient!uba;")
	@Override
	public Interface15 method4761(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class172_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!de", name = "o", descriptor = "()V")
	@Override
	public void method7030() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass316_1.method7401()) {
			this.anInt2098 = 0;
			if (fe.a((int) 32025, this.aClass316_1.method7402())) {
				this.method1931();
			}
		} else if (++this.anInt2098 <= 50) {
			this.method1931();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!de", name = "t", descriptor = "()V")
	@Override
	protected void method7037() {
		this.aWn1.a(false);
		super.method7037();
	}

	@OriginalMember(owner = "client!de", name = "m", descriptor = "(B)V")
	@Override
	protected void method4748() {
		@Pc(21) int local21 = this.aBooleanArray11[this.anInt5667] ? Static87.method1930(this.aClass98Array5[this.anInt5667]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, 1, local21);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZILclient!dg;I)V")
	@Override
	public void method4732(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class63 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) byte local13;
		if (arg3 == 1) {
			local13 = 3;
		} else if (arg3 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(21) int local21 = 0;
		if (arg1) {
			local21 = 32;
		}
		if (arg0) {
			local21 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, local13, Static87.method1927(arg2) | local21);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZB)Lclient!sp;")
	@Override
	public Interface13 method4657(@OriginalArg(0) boolean arg0) {
		return new Class143(this, Static523.aClass306_16, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!de", name = "q", descriptor = "(B)V")
	@Override
	protected void method4788() {
		this.anIDirect3DDevice1.a(174, this.aBoolean397);
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7048(@OriginalArg(0) int arg0) {
		this.aWn1.b(false);
		super.method7048(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
	@Override
	public void method4700(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, 11, arg0);
	}

	@OriginalMember(owner = "client!de", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (fe.a((byte) -85, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1)) && fe.a((byte) -37, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (local54 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					this.aPixelBuffer1.b(local1, local65 * arg2, local54 * local65, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(125);
		local16.a(41);
		return local1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!kk;Lclient!kk;FLclient!kk;)Lclient!kk;")
	@Override
	public Class92 method7052(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IZ)V")
	@Override
	public void method4784(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4687(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
	@Override
	protected void method4683() {
		@Pc(15) int local15 = this.aBooleanArray11[this.anInt5667] ? Static87.method1930(this.aClass98Array6[this.anInt5667]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, 4, local15);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	@Override
	protected void method4658() {
		this.aD3DLIGHT1.SetDiffuse(this.aFloat236 * this.aFloat234, this.aFloat236 * this.aFloat239, this.aFloat229 * this.aFloat236, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat234 * -this.aFloat235, -this.aFloat235 * this.aFloat239, this.aFloat229 * -this.aFloat235, 0.0F);
		this.aBoolean136 = false;
	}

	@OriginalMember(owner = "client!de", name = "E", descriptor = "(I)V")
	@Override
	protected void method4717() {
		if (this.aBoolean136) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, !this.aBoolean385);
		this.anIDirect3DDevice1.LightEnable(1, !this.aBoolean385);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean385);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean385);
		this.aBoolean136 = true;
	}

	@OriginalMember(owner = "client!de", name = "l", descriptor = "(I)V")
	@Override
	protected void method4667() {
		this.anIDirect3DDevice1.a(137, this.aBoolean386 && !this.aBoolean392);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4720(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas12 == arg1) {
			this.anIDirect3DDevice1.EndScene();
			this.method1931();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(II)Lclient!rda;")
	@Override
	protected Class70 method4725(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class70_Sub4(this, this.aClass117_127);
		} else if (arg0 == 4) {
			return new Class70_Sub8(this, this.aClass117_127, this.aClass222_5);
		} else {
			return super.method4725(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ws;B)V")
	@Override
	public void method4713(@OriginalArg(0) Class318 arg0) {
		@Pc(9) dxVertexLayout local9 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local9.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "(I)V")
	@Override
	protected void method4776() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat241 * this.aFloat234, this.aFloat241 * this.aFloat239, this.aFloat229 * this.aFloat241, 0.0F);
		this.aBoolean136 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ru;I)V")
	public void method1929(@OriginalArg(0) Class172_Sub3 arg0) {
		this.method1936(arg0);
		if (!this.aBooleanArray12[this.anInt5667]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 1, 1);
			this.aBooleanArray12[this.anInt5667] = true;
		}
		if (!this.aBooleanArray10[this.anInt5667]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 2, 1);
			this.aBooleanArray10[this.anInt5667] = true;
		}
	}

	@OriginalMember(owner = "client!de", name = "j", descriptor = "(Z)V")
	@Override
	protected void method4777() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray46);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ne;B)V")
	@Override
	public void method4694(@OriginalArg(0) Class206 arg0) {
		@Pc(1) int local1 = 0;
		if (Static526.aClass206_5 == arg0) {
			local1 = 65536;
		} else if (Static170.aClass206_2 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static276.aClass206_3) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, 11, local1 | this.anInt5667);
	}

	@OriginalMember(owner = "client!de", name = "q", descriptor = "(I)V")
	@Override
	protected void method4678() {
	}

	@OriginalMember(owner = "client!de", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return 0;
	}

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!de", name = "D", descriptor = "()V")
	@Override
	public void method7065() {
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
	@Override
	public void method7004() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (!fe.a((byte) -110, local3.Issue())) {
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

	@OriginalMember(owner = "client!de", name = "m", descriptor = "(I)V")
	@Override
	protected void method4669() {
		if (this.aBoolean388) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt5687);
			return;
		}
		this.aFloat226 = this.anInt5685 - this.anInt5662;
		this.aFloat231 = this.aFloat226 - (float) this.anInt5689;
		if ((float) this.anInt5676 > this.aFloat231) {
			this.aFloat231 = this.anInt5676;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat231);
		this.anIDirect3DDevice1.a(37, this.aFloat226);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt5673);
	}

	@OriginalMember(owner = "client!de", name = "k", descriptor = "(I)V")
	@Override
	protected void method4666() {
		if (this.aClass95_3.method2412()) {
			this.aClass78_Sub1_18.method2181(Static87.aFloatArray23);
		} else {
			Static87.aFloatArray23[0] = 1.0F;
			Static87.aFloatArray23[15] = 1.0F;
			Static87.aFloatArray23[10] = 1.0F;
			Static87.aFloatArray23[3] = 0.0F;
			Static87.aFloatArray23[14] = 0.0F;
			Static87.aFloatArray23[2] = 0.0F;
			Static87.aFloatArray23[4] = 0.0F;
			Static87.aFloatArray23[1] = 0.0F;
			Static87.aFloatArray23[13] = 0.0F;
			Static87.aFloatArray23[12] = 0.0F;
			Static87.aFloatArray23[8] = 0.0F;
			Static87.aFloatArray23[5] = 1.0F;
			Static87.aFloatArray23[7] = 0.0F;
			Static87.aFloatArray23[9] = 0.0F;
			Static87.aFloatArray23[11] = 0.0F;
			Static87.aFloatArray23[6] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static87.aFloatArray23);
	}

	@OriginalMember(owner = "client!de", name = "N", descriptor = "(I)V")
	@Override
	protected void method4735() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5663; local1++) {
			@Pc(10) Class5_Sub10 local10 = this.aClass5_Sub10Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method5185();
			@Pc(24) float local24 = local10.method5184() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method5189(), (float) local10.method5190(), (float) local10.method5183());
			this.aD3DLIGHT2.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, local24 * (float) (local18 >> 8 & 0xFF), local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method5191() * local10.method5191()));
			this.aD3DLIGHT2.SetRange((float) local10.method5191());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt5675) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4735();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Lclient!up;")
	@Override
	public Interface16 method4702(@OriginalArg(1) boolean arg0) {
		return new Class140(this, arg0);
	}

	@OriginalMember(owner = "client!de", name = "o", descriptor = "(B)V")
	@Override
	protected void method4780() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt5665);
	}

	@OriginalMember(owner = "client!de", name = "H", descriptor = "(I)V")
	@Override
	protected void method4729() {
		if (this.aClass273Array3[this.anInt5667] == Static288.aClass273_6) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, 24, 0);
			this.anIntArray176[this.anInt5667] = 0;
			return;
		}
		if (this.aClass273Array3[this.anInt5667] == Static203.aClass273_2) {
			this.anIDirect3DDevice1.SetTransform(this.anInt5667 + 16, this.aClass78_Sub1Array3[this.anInt5667].method2181(Static87.aFloatArray23));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt5667 + 16, this.aClass78_Sub1Array3[this.anInt5667].method2183(Static87.aFloatArray23));
		}
		@Pc(54) int local54 = Static87.method1937(this.aClass273Array3[this.anInt5667]);
		if (this.anIntArray176[this.anInt5667] != local54) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5667, 24, local54);
			this.anIntArray176[this.anInt5667] = local54;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
	@Override
	public void method7027(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)V")
	@Override
	protected void method4664() {
		if (this.aBoolean377) {
			Static87.aFloatArray23[0] = 1.0F;
			Static87.aFloatArray23[11] = 0.0F;
			Static87.aFloatArray23[1] = 0.0F;
			Static87.aFloatArray23[14] = 0.0F;
			Static87.aFloatArray23[8] = 0.0F;
			Static87.aFloatArray23[7] = 0.0F;
			Static87.aFloatArray23[13] = 0.0F;
			Static87.aFloatArray23[5] = 1.0F;
			Static87.aFloatArray23[4] = 0.0F;
			Static87.aFloatArray23[9] = 0.0F;
			Static87.aFloatArray23[10] = 1.0F;
			Static87.aFloatArray23[12] = 0.0F;
			Static87.aFloatArray23[6] = 0.0F;
			Static87.aFloatArray23[3] = 0.0F;
			Static87.aFloatArray23[2] = 0.0F;
			Static87.aFloatArray23[15] = 1.0F;
		} else {
			this.aClass78_Sub1_15.method2181(Static87.aFloatArray23);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static87.aFloatArray23);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4753(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass316_1 = (Class316) arg1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!pca;IIILclient!sp;II)V")
	@Override
	public void method4727(@OriginalArg(0) Class228 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface13 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class143) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static87.method1928(arg0), 0, arg5, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "(I)V")
	@Override
	protected void method4769() {
		this.anIDirect3DDevice1.SetViewport(this.anInt5692, this.anInt5682, this.anInt5584, this.anInt5509, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BIIIILclient!kl;)Lclient!ve;")
	@Override
	public Interface17 method4682(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class174 arg1) {
		return new Class172_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(B)V")
	@Override
	protected void method4712() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt5692 + this.anInt5670, this.anInt5682 - -this.anInt5666, this.anInt5661, this.anInt5668);
	}

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "(I)V")
	@Override
	public void method4779() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray41[0], -this.aFloatArray41[1], -this.aFloatArray41[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray44[0], -this.aFloatArray44[1], -this.aFloatArray44[2]);
		this.aBoolean136 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7041(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "(I)Z")
	private boolean method1931() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(21) Class316 local21 = (Class316) this.anObject13;
			this.method4734();
			local21.method7400();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static87.method1935(this.anInt5678, this.anInt2099, this.anInt2097, this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (fe.a((byte) -32, local55)) {
					local21.method7403(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.c());
					this.method4684();
					this.method4726();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "q", descriptor = "()Z")
	@Override
	public boolean method7033() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
	@Override
	public void method6999() {
		this.method4752(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!vt;Lclient!kl;)Z")
	@Override
	public boolean method4739(@OriginalArg(1) Class306 arg0, @OriginalArg(2) Class174 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = this.anIDirect3D1.b(this.anInt2097);
		return fe.a((byte) -16, this.anIDirect3D1.CheckDeviceFormat(this.anInt2097, this.anInt2099, local12.Format, 0, 3, Static87.method1934(arg1, arg0)));
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[IIIZ)Lclient!dea;")
	@Override
	public Interface3 method4743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		return new Class172_Sub1(this, arg4, arg1, arg5, arg3, 0, arg2);
	}

	@OriginalMember(owner = "client!de", name = "z", descriptor = "(I)V")
	@Override
	protected void method4698() {
		this.anIDirect3DDevice1.a(7, this.aBoolean390);
	}

	@OriginalMember(owner = "client!de", name = "D", descriptor = "(I)V")
	@Override
	protected void method4716() {
		this.anIDirect3DDevice1.a(27, this.aBoolean381);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!pca;II)V")
	@Override
	public void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static87.method1928(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIILclient!vt;Lclient!kl;)Lclient!dea;")
	@Override
	public Interface3 method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class306 arg2, @OriginalArg(4) Class174 arg3) {
		return new Class172_Sub1(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!kda;)V")
	public void method1933(@OriginalArg(1) Class172_Sub1 arg0) {
		this.method1936(arg0);
		if (arg0.aBoolean354 != this.aBooleanArray12[this.anInt5667]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 1, arg0.aBoolean354 ? 1 : 3);
			this.aBooleanArray12[this.anInt5667] = arg0.aBoolean354;
		}
		if (arg0.aBoolean353 != this.aBooleanArray10[this.anInt5667]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 2, arg0.aBoolean353 ? 1 : 3);
			this.aBooleanArray10[this.anInt5667] = arg0.aBoolean353;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZIIILclient!kl;[BI)Lclient!dea;")
	@Override
	protected Interface3 method4762(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class174 arg3, @OriginalArg(6) byte[] arg4) {
		return new Class172_Sub1(this, arg3, arg2, arg1, arg0, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!up;I)V")
	@Override
	public void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		@Pc(2) Class140 local2 = (Class140) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method3334());
	}

	@OriginalMember(owner = "client!de", name = "u", descriptor = "()V")
	@Override
	public void method7039() {
	}

	@OriginalMember(owner = "client!de", name = "u", descriptor = "(I)V")
	@Override
	protected void method4686() {
		this.anIDirect3DDevice1.a(14, this.aBoolean383 && this.aBoolean380);
	}

	@OriginalMember(owner = "client!de", name = "o", descriptor = "(I)V")
	@Override
	protected void method4675() {
		if (this.aBooleanArray11[this.anInt5667]) {
			this.aBooleanArray11[this.anInt5667] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt5667, null);
			this.method4683();
			this.method4748();
		}
	}

	@OriginalMember(owner = "client!de", name = "p", descriptor = "()Z")
	@Override
	public boolean method7031() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7055(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7030();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!kp;I)V")
	public void method1936(@OriginalArg(0) Class172 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt5667, arg0.method6219());
		if (this.aClass86Array1[this.anInt5667] != arg0.aClass86_11) {
			@Pc(25) int local25 = Static87.method1932(arg0.aClass86_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 6, local25);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 5, local25);
			this.aClass86Array1[this.anInt5667] = arg0.aClass86_11;
			if (this.aBooleanArray9[this.anInt5667] != arg0.aBoolean545) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 7, arg0.aBoolean545 ? Static87.method1932(arg0.aClass86_11) : 0);
				this.aBooleanArray9[this.anInt5667] = arg0.aBoolean545;
			}
		} else if (arg0.aBoolean545 != this.aBooleanArray9[this.anInt5667]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5667, 7, arg0.aBoolean545 ? Static87.method1932(arg0.aClass86_11) : 0);
			this.aBooleanArray9[this.anInt5667] = arg0.aBoolean545;
		}
		if (!this.aBooleanArray11[this.anInt5667]) {
			this.aBooleanArray11[this.anInt5667] = true;
			this.method4683();
			this.method4748();
		}
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "(B)V")
	@Override
	protected void method4726() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5677; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass86Array1[local1] = Static354.aClass86_9;
			this.aBooleanArray12[local1] = this.aBooleanArray10[local1] = true;
			this.aBooleanArray9[local1] = false;
			this.anIntArray176[local1] = 0;
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
		this.aBoolean136 = false;
		super.method4726();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIZLclient!kl;[FII)Lclient!dea;")
	@Override
	protected Interface3 method4736(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) Class174 arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) int arg4) {
		return null;
	}
}
