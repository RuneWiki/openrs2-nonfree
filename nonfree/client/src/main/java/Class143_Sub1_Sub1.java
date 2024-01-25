import jaclib.peer.in;
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
import jagdx.aq;
import jagdx.fn;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class143_Sub1_Sub1 extends Class143_Sub1 {

	@OriginalMember(owner = "client!ki", name = "Pg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ki", name = "Wg", descriptor = "I")
	private int anInt5258 = 0;

	@OriginalMember(owner = "client!ki", name = "Sg", descriptor = "Z")
	private boolean aBoolean363 = false;

	@OriginalMember(owner = "client!ki", name = "Tg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ki", name = "Gg", descriptor = "Lclient!pja;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "client!ki", name = "Ug", descriptor = "I")
	private final int anInt5257;

	@OriginalMember(owner = "client!ki", name = "Og", descriptor = "Lclient!jaclib/peer/in;")
	public final in anIn1;

	@OriginalMember(owner = "client!ki", name = "Eg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ki", name = "Zg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ki", name = "Dg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ki", name = "Lg", descriptor = "I")
	private final int anInt5256;

	@OriginalMember(owner = "client!ki", name = "Fg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ki", name = "Mg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ki", name = "Yg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ki", name = "Xg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ki", name = "bh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ki", name = "ah", descriptor = "Z")
	public final boolean aBoolean365;

	@OriginalMember(owner = "client!ki", name = "Vg", descriptor = "Z")
	public final boolean aBoolean364;

	@OriginalMember(owner = "client!ki", name = "Qg", descriptor = "Z")
	public final boolean aBoolean362;

	@OriginalMember(owner = "client!ki", name = "Ig", descriptor = "[Lclient!cr;")
	private final Class67[] aClass67Array1;

	@OriginalMember(owner = "client!ki", name = "Cg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!ki", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!ki", name = "Kg", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ki", name = "Hg", descriptor = "[I")
	private final int[] anIntArray283;

	@OriginalMember(owner = "client!ki", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ki", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!cb;Ljava/lang/Integer;)Lclient!ha;")
	private static Class143 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class143_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) in local9 = new in();
			@Pc(13) IDirect3D local13 = IDirect3D.a(-2147483616, local9);
			@Pc(18) D3DCAPS local18 = local13.a(local3, local5);
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(174) D3DPRESENT_PARAMETERS local174 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static306.method4606(arg3, local5, local174, local13, local3)) {
					throw new RuntimeException("");
				}
				local174.PresentationInterval = Integer.MIN_VALUE;
				local174.Windowed = true;
				local174.EnableAutoDepthStencil = true;
				@Pc(200) int local200 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local200 |= 0x10;
				}
				@Pc(224) IDirect3DDevice local224;
				try {
					local224 = local13.a(local3, local5, arg0, local200 | 0x40, local174);
				} catch (@Pc(226) fn local226) {
					local224 = local13.a(local3, local5, arg0, local200 | 0x20, local174);
				}
				@Pc(245) Class275 local245 = new Class275(local224.c(0), local224.c());
				local1 = new Class143_Sub1_Sub1(local3, local5, arg0, local9, local13, local224, local245, local174, local18, arg1, arg2, arg3);
				local1.method6287();
				return local1;
			}
		} catch (@Pc(268) RuntimeException local268) {
			if (local1 != null) {
				local1.method6223();
			}
			throw local268;
		}
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/in;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!pja;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!cb;I)V")
	public Class143_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) in arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class275 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface3 arg9, @OriginalArg(10) Class50 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aD3DCAPS1 = arg8;
			this.aClass275_1 = arg6;
			this.anInt5257 = arg0;
			this.anIn1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anIDirect3D1 = arg4;
			this.anInt5256 = arg1;
			this.aD3DLIGHT1 = new D3DLIGHT(this.anIn1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.anIn1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.anIn1);
			this.aPixelBuffer1 = new PixelBuffer(this.anIn1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.anIn1);
			new GeometryBuffer(this.anIn1);
			this.aBoolean365 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.anInt7405 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean364 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean530 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean362 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean534 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.anInt7391 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean518 = this.anInt7409 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt5257, this.anInt5256, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aClass67Array1 = new Class67[this.anInt7405];
			this.aBooleanArray8 = new boolean[this.anInt7405];
			this.aBooleanArray9 = new boolean[this.anInt7405];
			this.aBooleanArray10 = new boolean[this.anInt7405];
			this.anIntArray283 = new int[this.anInt7405];
			this.aBooleanArray11 = new boolean[this.anInt7405];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(220) Throwable local220) {
			local220.printStackTrace();
			this.method6225();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!nea;Lclient!vu;)Lclient!cp;")
	@Override
	public Interface2 method6228(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Interface27 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)Lclient!mq;")
	@Override
	public Interface16 method6279(@OriginalArg(0) boolean arg0) {
		return new Class342(this, Static314.aClass206_13, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ofa;ILclient!kn;II)Lclient!kt;")
	@Override
	public Interface12 method6360(@OriginalArg(0) Class255 arg0, @OriginalArg(2) Class206 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class101_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6238(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6196(arg2, arg3);
	}

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "(I)V")
	@Override
	public void method6326() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray55[0], -this.aFloatArray55[1], -this.aFloatArray55[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray56[0], -this.aFloatArray56[1], -this.aFloatArray56[2]);
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "(I)V")
	@Override
	protected void method6296() {
		@Pc(7) float local7 = this.aBoolean535 ? this.aFloat142 : 0.0F;
		@Pc(16) float local16 = this.aBoolean535 ? -this.aFloat135 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat141 * local7, this.aFloat129 * local7, this.aFloat143 * local7, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local16 * this.aFloat141, local16 * this.aFloat129, this.aFloat143 * local16, 0.0F);
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!et;)V")
	public void method4604(@OriginalArg(1) Class101_Sub1 arg0) {
		this.method4616(arg0);
		if (arg0.aBoolean165 != this.aBooleanArray9[this.anInt7412]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 1, arg0.aBoolean165 ? 1 : 3);
			this.aBooleanArray9[this.anInt7412] = arg0.aBoolean165;
		}
		if (arg0.aBoolean166 != this.aBooleanArray8[this.anInt7412]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 2, arg0.aBoolean166 ? 1 : 3);
			this.aBooleanArray8[this.anInt7412] = arg0.aBoolean166;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "()V")
	@Override
	public void method6221() {
	}

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "(I)V")
	@Override
	protected void method6315() {
		this.anIDirect3DDevice1.a(14, this.aBoolean517 && this.aBoolean524);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()V")
	@Override
	public void method6189() {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!cp;)V")
	@Override
	public void method6250(@OriginalArg(0) Interface2 arg0) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[Lclient!qe;)Lclient!bw;")
	@Override
	public Class48 method6320(@OriginalArg(1) Class284[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!pg;)V")
	@Override
	public void method6299(@OriginalArg(1) Class271 arg0) {
		@Pc(8) int local8 = 0;
		if (Static148.aClass271_8 == arg0) {
			local8 = 65536;
		} else if (arg0 == Static214.aClass271_13) {
			local8 = 131072;
		} else if (arg0 == Static552.aClass271_34) {
			local8 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, 11, this.anInt7412 | local8);
	}

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "(I)V")
	@Override
	protected void method6368() {
		this.method6296();
		this.method6324();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
	@Override
	public void method6303(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, 11, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method6376(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		if (arg0 != this.aCanvas10) {
			return;
		}
		@Pc(7) Dimension local7 = arg0.getSize();
		if (local7.width > 0 && local7.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method4615();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "()Lclient!rda;")
	@Override
	public Class300 method6248() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt5257, 0);
		return new Class300(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "(B)V")
	@Override
	protected void method6334() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray57);
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(Z)V")
	@Override
	protected void method6285() {
		this.aFloat134 = (float) (this.anInt7385 - this.anInt7390);
		this.aFloat130 = (float) -this.anInt7407 + this.aFloat134;
		if ((float) this.anInt7413 > this.aFloat130) {
			this.aFloat130 = (float) this.anInt7413;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat130);
		this.anIDirect3DDevice1.a(37, this.aFloat134);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7399);
	}

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "(B)V")
	@Override
	protected void method6392() {
	}

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "(I)V")
	@Override
	protected void method6329() {
		@Pc(19) int local19 = this.aBooleanArray11[this.anInt7412] ? Static306.method4607(this.aClass6Array5[this.anInt7412]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, 1, local19);
	}

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "(I)V")
	@Override
	protected void method6324() {
		if (this.aBoolean363) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean363 = true;
	}

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "(I)V")
	@Override
	protected void method6351() {
		if (this.aClass310_7.method7319()) {
			this.aClass56_Sub2_18.method6832(Static306.aFloatArray37);
		} else {
			Static306.aFloatArray37[3] = 0.0F;
			Static306.aFloatArray37[4] = 0.0F;
			Static306.aFloatArray37[6] = 0.0F;
			Static306.aFloatArray37[8] = 0.0F;
			Static306.aFloatArray37[9] = 0.0F;
			Static306.aFloatArray37[15] = 1.0F;
			Static306.aFloatArray37[7] = 0.0F;
			Static306.aFloatArray37[11] = 0.0F;
			Static306.aFloatArray37[0] = 1.0F;
			Static306.aFloatArray37[14] = 0.0F;
			Static306.aFloatArray37[13] = 0.0F;
			Static306.aFloatArray37[12] = 0.0F;
			Static306.aFloatArray37[5] = 1.0F;
			Static306.aFloatArray37[2] = 0.0F;
			Static306.aFloatArray37[1] = 0.0F;
			Static306.aFloatArray37[10] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static306.aFloatArray37);
	}

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "(I)V")
	@Override
	protected void method6305() {
		if (this.aBooleanArray11[this.anInt7412]) {
			this.aBooleanArray11[this.anInt7412] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7412, (IDirect3DBaseTexture) null);
			this.method6273();
			this.method6329();
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(IZ)Lclient!fka;")
	@Override
	public Interface6 method6373(@OriginalArg(1) boolean arg0) {
		return new Class36(this, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(BZ)V")
	@Override
	public void method6323(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
	@Override
	protected void method6273() {
		@Pc(15) int local15 = this.aBooleanArray11[this.anInt7412] ? Static306.method4607(this.aClass6Array6[this.anInt7412]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, 4, local15);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6366(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZLclient!eca;ZB)V")
	@Override
	public void method6291(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local12 = 3;
		} else if (arg0 == 2) {
			local12 = 26;
		} else {
			local12 = 2;
		}
		@Pc(20) int local20 = 0;
		if (arg3) {
			local20 = 32;
		}
		if (arg1) {
			local20 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, local12, local20 | Static306.method4613(arg2));
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method4608(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "(B)V")
	@Override
	protected void method6385() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7404, this.anInt7383, this.anInt7221, this.anInt7257, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)V")
	@Override
	protected void method6295() {
		this.anIDirect3DDevice1.a(7, this.aBoolean528);
	}

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "()V")
	@Override
	public void method6220() {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([BILclient!ofa;III)Lclient!po;")
	@Override
	public Interface21 method6359(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class255 arg1) {
		return new Class101_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ki", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6405(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "()V")
	@Override
	protected void method6223() {
		this.anIn1.a((int) -81);
		super.method6223();
	}

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "(I)F")
	@Override
	protected float method6319() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZI[IIII)Lclient!kt;")
	@Override
	public Interface12 method6275(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class101_Sub1(this, arg4, arg0, arg1, arg2, 0, arg5);
	}

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "(I)V")
	@Override
	protected void method6375() {
		this.anIDirect3DDevice1.a(15, this.aBoolean520);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZLclient!eca;)V")
	@Override
	protected void method6332(@OriginalArg(1) int arg0, @OriginalArg(3) Class90 arg1) {
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 6;
		} else if (arg0 == 2) {
			local13 = 27;
		} else {
			local13 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, local13, Static306.method4613(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLclient!jagdx/IDirect3DVertexShader;)V")
	public void method4610(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method6389();
	}

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "(B)V")
	@Override
	protected void method6337() {
		this.anIDirect3DDevice1.a(174, this.aBoolean536);
	}

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6358() {
		this.anIDirect3DDevice1.a(137, this.aBoolean531 && !this.aBoolean525);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BILclient!fka;)V")
	@Override
	public void method6325(@OriginalArg(1) int arg0, @OriginalArg(2) Interface6 arg1) {
		@Pc(9) Class36 local9 = (Class36) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local9.anIDirect3DVertexBuffer1, 0, local9.method590());
	}

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6382() {
		this.anIDirect3DDevice1.a(28, this.aBoolean526 && this.aBoolean516 && this.anInt7407 >= 0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!ofa;[BIIZI)Lclient!kt;")
	@Override
	protected Interface12 method6317(@OriginalArg(0) int arg0, @OriginalArg(2) Class255 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		return new Class101_Sub1(this, arg1, arg4, arg0, arg3, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "(B)V")
	@Override
	protected void method6404() {
		if (Static414.aClass31_7 == this.aClass31_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static566.aClass31_9 == this.aClass31_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass31_8 == Static336.aClass31_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "(B)V")
	@Override
	protected void method6389() {
		if (this.anIDirect3DVertexShader1 != null || Static76.aClass270_2 == this.aClass270Array3[this.anInt7412]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, 24, 0);
			this.anIntArray283[this.anInt7412] = 0;
			return;
		}
		if (Static73.aClass270_1 == this.aClass270Array3[this.anInt7412]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7412 + 16, this.aClass56_Sub2Array3[this.anInt7412].method6818(Static306.aFloatArray37));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7412 + 16, this.aClass56_Sub2Array3[this.anInt7412].method6832(Static306.aFloatArray37));
		}
		@Pc(81) int local81 = Static306.method4612(this.aClass270Array3[this.anInt7412]);
		if (this.anIntArray283[this.anInt7412] != local81) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7412, 24, local81);
			this.anIntArray283[this.anInt7412] = local81;
		}
	}

	@OriginalMember(owner = "client!ki", name = "P", descriptor = "(I)V")
	@Override
	protected void method6390() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7406 + this.anInt7404, this.anInt7393 + this.anInt7383, this.anInt7381, this.anInt7395);
	}

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "(I)V")
	@Override
	protected void method6286() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7402);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!kn;Lclient!ofa;I)Z")
	@Override
	public boolean method6363(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class255 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return aq.b(this.anIDirect3D1.a(this.anInt5257, local9), -23) && aq.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt5257, this.anInt5256, local9.Format, 0, 4, Static306.method4609(arg1, arg0)), -44);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ofa;Lclient!kn;)Z")
	@Override
	public boolean method6304(@OriginalArg(1) Class255 arg0, @OriginalArg(2) Class206 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return aq.b(this.anIDirect3D1.a(this.anInt5257, local3), -86) && aq.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt5257, this.anInt5256, local3.Format, 0, 3, Static306.method4609(arg0, arg1)), -114);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6188(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!q;B)V")
	public void method4611(@OriginalArg(0) Class101_Sub3 arg0) {
		this.method4616(arg0);
		if (!this.aBooleanArray9[this.anInt7412]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 1, 1);
			this.aBooleanArray9[this.anInt7412] = true;
		}
		if (!this.aBooleanArray8[this.anInt7412]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 2, 1);
			this.aBooleanArray8[this.anInt7412] = true;
		}
	}

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "(I)V")
	@Override
	protected void method6379() {
		this.anIDirect3DDevice1.a(27, this.aBoolean522);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!si;II)V")
	@Override
	public void method6381(@OriginalArg(1) Class323 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static306.method4605(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "(I)V")
	@Override
	protected void method6346() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7405; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass67Array1[local1] = Static671.aClass67_11;
			this.aBooleanArray9[local1] = this.aBooleanArray8[local1] = true;
			this.aBooleanArray10[local1] = false;
			this.anIntArray283[local1] = 0;
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
		this.aBoolean363 = false;
		super.method6346();
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)Lclient!vu;")
	@Override
	public Interface27 method6219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	@Override
	public void method6196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass275_1.method6727()) {
			this.anInt5258 = 0;
			if (aq.a(121, this.aClass275_1.method6724())) {
				this.method4615();
			}
		} else if (++this.anInt5258 <= 50) {
			this.method4615();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!ofa;ZII[FI)Lclient!kt;")
	@Override
	protected Interface12 method6309(@OriginalArg(2) Class255 arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!bw;)V")
	@Override
	public void method6333(@OriginalArg(1) Class48 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "(I)V")
	@Override
	protected void method6283() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat141 * this.aFloat136, this.aFloat136 * this.aFloat129, this.aFloat136 * this.aFloat143, 0.0F);
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([[IZII)Lclient!bv;")
	@Override
	public Interface1 method6300(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class101_Sub2(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (aq.b(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), -57) && aq.b(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), -113)) {
			local1 = new int[arg2 * arg3];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local54) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
					this.aPixelBuffer1.b(local1, arg2 * local75, local75 * local54, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(false);
		local16.a(false);
		return local1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method6403(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "()V")
	@Override
	public void method6198() {
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "(II)Lclient!bea;")
	@Override
	protected Class14 method6289(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class14_Sub11(this, this.aClass50_120);
		} else if (arg0 == 4) {
			return new Class14_Sub9(this, this.aClass50_120, this.aClass224_5);
		} else if (arg0 == 8) {
			return new Class14_Sub10(this, this.aClass50_120, this.aClass224_5);
		} else {
			return super.method6289(arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6397(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass275_1 = (Class275) arg0;
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method6239(@OriginalArg(0) int arg0) {
		this.anIn1.b((byte) 117);
		super.method6239(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!si;ILclient!mq;IIII)V")
	@Override
	public void method6367(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class342) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static306.method4605(arg0), 0, arg1, arg4, arg3, arg5);
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(II)Lclient!nea;")
	@Override
	public Interface17 method6262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "()Z")
	@Override
	public boolean method6227() {
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6388() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7414; local1++) {
			@Pc(14) Class5_Sub3 local14 = this.aClass5_Sub3Array4[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method8322();
			@Pc(28) float local28 = local14.method8314() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local14.method8317(), (float) local14.method8313(), (float) local14.method8323());
			this.aD3DLIGHT3.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, (float) (local22 >> 8 & 0xFF) * local28, local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method8319() * local14.method8319()));
			this.aD3DLIGHT3.SetRange((float) local14.method8319());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (local1 < this.anInt7415) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6388();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ag;Lclient!ag;FLclient!ag;)Lclient!ag;")
	@Override
	public Class11 method6267(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class11 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "(B)V")
	@Override
	protected void method6378() {
		if (this.aBoolean515) {
			Static306.aFloatArray37[8] = 0.0F;
			Static306.aFloatArray37[3] = 0.0F;
			Static306.aFloatArray37[15] = 1.0F;
			Static306.aFloatArray37[0] = 1.0F;
			Static306.aFloatArray37[14] = 0.0F;
			Static306.aFloatArray37[10] = 1.0F;
			Static306.aFloatArray37[1] = 0.0F;
			Static306.aFloatArray37[4] = 0.0F;
			Static306.aFloatArray37[5] = 1.0F;
			Static306.aFloatArray37[12] = 0.0F;
			Static306.aFloatArray37[2] = 0.0F;
			Static306.aFloatArray37[11] = 0.0F;
			Static306.aFloatArray37[6] = 0.0F;
			Static306.aFloatArray37[7] = 0.0F;
			Static306.aFloatArray37[9] = 0.0F;
			Static306.aFloatArray37[13] = 0.0F;
		} else {
			this.aClass56_Sub2_15.method6832(Static306.aFloatArray37);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static306.aFloatArray37);
	}

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "(Z)Z")
	private boolean method4615() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(13) Class275 local13 = (Class275) this.anObject14;
			this.method6271();
			local13.method6726();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static306.method4606(this.anInt7409, this.anInt5256, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1, this.anInt5257)) {
				@Pc(46) int local46 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (aq.b(local46, -94)) {
					local13.method6725(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.c());
					this.method6308();
					this.method6346();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
	@Override
	public void method6185() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (aq.b(local3.Issue(), -3)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(false);
	}

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "()Z")
	@Override
	public boolean method6224() {
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!en;)V")
	public void method4616(@OriginalArg(1) Class101 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7412, arg0.method6875());
		if (arg0.aClass67_9 != this.aClass67Array1[this.anInt7412]) {
			@Pc(25) int local25 = Static306.method4614(arg0.aClass67_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 6, local25);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 5, local25);
			this.aClass67Array1[this.anInt7412] = arg0.aClass67_9;
			if (this.aBooleanArray10[this.anInt7412] != arg0.aBoolean587) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 7, arg0.aBoolean587 ? Static306.method4614(arg0.aClass67_9) : 0);
				this.aBooleanArray10[this.anInt7412] = arg0.aBoolean587;
			}
		} else if (arg0.aBoolean587 != this.aBooleanArray10[this.anInt7412]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7412, 7, arg0.aBoolean587 ? Static306.method4614(arg0.aClass67_9) : 0);
			this.aBooleanArray10[this.anInt7412] = arg0.aBoolean587;
		}
		if (!this.aBooleanArray11[this.anInt7412]) {
			this.aBooleanArray11[this.anInt7412] = true;
			this.method6273();
			this.method6329();
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
	@Override
	public void method6197(@OriginalArg(0) boolean arg0) {
	}
}
