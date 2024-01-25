import jaclib.peer.vv;
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
import jagdx.ala;
import jagdx.ws;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class67_Sub1_Sub1 extends Class67_Sub1 {

	@OriginalMember(owner = "client!de", name = "Lg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!de", name = "Dg", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!de", name = "Xg", descriptor = "I")
	private int anInt2163 = 0;

	@OriginalMember(owner = "client!de", name = "Tg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!de", name = "Ig", descriptor = "I")
	private final int anInt2164;

	@OriginalMember(owner = "client!de", name = "Gg", descriptor = "I")
	private final int anInt2162;

	@OriginalMember(owner = "client!de", name = "Qg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!de", name = "Wg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!de", name = "Cg", descriptor = "Lclient!jaclib/peer/vv;")
	public final vv aVv1;

	@OriginalMember(owner = "client!de", name = "Sg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!de", name = "Ng", descriptor = "Lclient!wu;")
	private Class408 aClass408_1;

	@OriginalMember(owner = "client!de", name = "Ug", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!de", name = "zg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!de", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!de", name = "Bg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!de", name = "Hg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!de", name = "Zg", descriptor = "Z")
	public final boolean aBoolean179;

	@OriginalMember(owner = "client!de", name = "Og", descriptor = "Z")
	public final boolean aBoolean180;

	@OriginalMember(owner = "client!de", name = "Fg", descriptor = "Z")
	public final boolean aBoolean177;

	@OriginalMember(owner = "client!de", name = "Jg", descriptor = "[Lclient!vea;")
	private final Class384[] aClass384Array1;

	@OriginalMember(owner = "client!de", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!de", name = "Mg", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!de", name = "yg", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!de", name = "Kg", descriptor = "[I")
	private final int[] anIntArray105;

	@OriginalMember(owner = "client!de", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!de", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!lb;Ljava/lang/Integer;)Lclient!ha;")
	private static Class67 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class67_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) vv local9 = new vv();
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
			} else if ((local18.DestBlendCaps & 0x20 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(190) D3DPRESENT_PARAMETERS local190 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static107.method1926(local3, local190, local5, local13, arg3)) {
					throw new RuntimeException("");
				}
				local190.Windowed = true;
				local190.EnableAutoDepthStencil = true;
				local190.PresentationInterval = Integer.MIN_VALUE;
				@Pc(217) int local217 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local217 |= 0x10;
				}
				@Pc(243) IDirect3DDevice local243;
				try {
					local243 = local13.a(local3, local5, arg0, local217 | 0x40, local190);
				} catch (@Pc(245) ws local245) {
					local243 = local13.a(local3, local5, arg0, local217 | 0x20, local190);
				}
				@Pc(264) Class408 local264 = new Class408(local243.b(0), local243.c());
				local1 = new Class67_Sub1_Sub1(local3, local5, arg0, local9, local13, local243, local264, local190, local18, arg1, arg2, arg3);
				local1.method5669();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(287) RuntimeException local287) {
			if (local1 != null) {
				local1.method7632();
			}
			throw local287;
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/vv;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!wu;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!lb;I)V")
	private Class67_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) vv arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class408 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface2 arg9, @OriginalArg(10) Class221 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aD3DCAPS1 = arg8;
			this.anInt2164 = arg0;
			this.anInt2162 = arg1;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anIDirect3DDevice1 = arg5;
			this.aVv1 = arg3;
			this.anIDirect3D1 = arg4;
			this.aClass408_1 = arg6;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aVv1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aVv1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aVv1);
			this.aPixelBuffer1 = new PixelBuffer(this.aVv1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aVv1);
			new GeometryBuffer(this.aVv1);
			this.anInt6683 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean179 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.anInt6689 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean180 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean505 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean177 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean508 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean504 = this.anInt6688 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt2164, this.anInt2162, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aClass384Array1 = new Class384[this.anInt6683];
			this.aBooleanArray3 = new boolean[this.anInt6683];
			this.aBooleanArray6 = new boolean[this.anInt6683];
			this.aBooleanArray4 = new boolean[this.anInt6683];
			this.anIntArray105 = new int[this.anInt6683];
			this.aBooleanArray5 = new boolean[this.anInt6683];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(227) Throwable local227) {
			local227.printStackTrace();
			this.method7681();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!de", name = "l", descriptor = "()Lclient!ega;")
	@Override
	public Class90 method7687() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt2164, 0);
		return new Class90(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IZ)V")
	@Override
	public void method5667(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!hd;Lclient!ns;B)Z")
	@Override
	public boolean method5664(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class261 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = new D3DDISPLAYMODE();
		return ala.a(this.anIDirect3D1.a(this.anInt2164, local12), -1) && ala.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt2164, this.anInt2162, local12.Format, 0, 4, Static107.method1928(arg1, arg0)), -1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[IZIII)Lclient!gp;")
	@Override
	public Interface6 method5644(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class52_Sub2(this, arg3, arg0, arg2, arg1, 0, arg5);
	}

	@OriginalMember(owner = "client!de", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!de", name = "k", descriptor = "(Z)Z")
	private boolean method1920() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(23) Class408 local23 = (Class408) this.anObject18;
			this.method5598();
			local23.method9429();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static107.method1926(this.anInt2164, this.aD3DPRESENT_PARAMETERS1, this.anInt2162, this.anIDirect3D1, this.anInt6688)) {
				@Pc(58) int local58 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (ala.a(local58, -1)) {
					local23.method9431(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method5663();
					this.method5576(50);
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "t", descriptor = "(I)F")
	@Override
	protected float method5645() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method1921(@OriginalArg(0) Class52 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6659, arg0.method4344());
		if (this.aClass384Array1[this.anInt6659] != arg0.aClass384_9) {
			@Pc(67) int local67 = Static107.method1922(arg0.aClass384_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 6, local67);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 5, local67);
			this.aClass384Array1[this.anInt6659] = arg0.aClass384_9;
			if (this.aBooleanArray4[this.anInt6659] != arg0.aBoolean450) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 7, arg0.aBoolean450 ? Static107.method1922(arg0.aClass384_9) : 0);
				this.aBooleanArray4[this.anInt6659] = arg0.aBoolean450;
			}
		} else if (arg0.aBoolean450 != this.aBooleanArray4[this.anInt6659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 7, arg0.aBoolean450 ? Static107.method1922(arg0.aClass384_9) : 0);
			this.aBooleanArray4[this.anInt6659] = arg0.aBoolean450;
		}
		if (!this.aBooleanArray3[this.anInt6659]) {
			this.aBooleanArray3[this.anInt6659] = true;
			this.method5676();
			this.method5688();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!iw;)V")
	public void method1924(@OriginalArg(1) Class52_Sub3 arg0) {
		this.method1921(arg0);
		if (!this.aBooleanArray5[this.anInt6659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 1, 1);
			this.aBooleanArray5[this.anInt6659] = true;
		}
		if (!this.aBooleanArray6[this.anInt6659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 2, 1);
			this.aBooleanArray6[this.anInt6659] = true;
		}
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "(B)V")
	@Override
	protected void method5668() {
		this.anIDirect3DDevice1.a(7, this.aBoolean515);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!ct;II)V")
	@Override
	protected void method5582(@OriginalArg(1) Class58 arg0, @OriginalArg(3) int arg1) {
		@Pc(21) byte local21;
		if (arg1 == 1) {
			local21 = 6;
		} else if (arg1 == 2) {
			local21 = 27;
		} else {
			local21 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, local21, Static107.method1929(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!de", name = "h", descriptor = "(Z)V")
	@Override
	protected void method5574() {
		this.anIDirect3DDevice1.a(137, this.aBoolean509 && !this.aBoolean506);
	}

	@OriginalMember(owner = "client!de", name = "A", descriptor = "()V")
	@Override
	public void method7645() {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method1925(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method5613();
	}

	@OriginalMember(owner = "client!de", name = "u", descriptor = "(I)V")
	@Override
	protected void method5568() {
		if (Static430.aClass369_5 == this.aClass369_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static645.aClass369_9 == this.aClass369_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static584.aClass369_7 == this.aClass369_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method5559(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas11) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method1920();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!de", name = "l", descriptor = "(B)V")
	@Override
	protected void method5623() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6687 + this.anInt6660, this.anInt6675 + this.anInt6685, this.anInt6682, this.anInt6651);
	}

	@OriginalMember(owner = "client!de", name = "t", descriptor = "()V")
	@Override
	protected void method7632() {
		this.aVv1.a((byte) -128);
		super.method7632();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ns;Lclient!hd;I)Z")
	@Override
	public boolean method5563(@OriginalArg(0) Class261 arg0, @OriginalArg(1) Class145 arg1) {
		@Pc(13) D3DDISPLAYMODE local13 = new D3DDISPLAYMODE();
		return ala.a(this.anIDirect3D1.a(this.anInt2164, local13), -1) && ala.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt2164, this.anInt2162, local13.Format, 0, 3, Static107.method1928(arg0, arg1)), -1);
	}

	@OriginalMember(owner = "client!de", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!ns;ILclient!hd;)Lclient!gp;")
	@Override
	public Interface6 method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(4) Class145 arg3) {
		return new Class52_Sub2(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(IZ)V")
	@Override
	public void method5638(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, 11, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!pea;)V")
	@Override
	public void method7633(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method5579(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass408_1 = (Class408) arg0;
	}

	@OriginalMember(owner = "client!de", name = "C", descriptor = "(I)V")
	@Override
	protected void method5657() {
		this.anIDirect3DDevice1.a(15, this.aBoolean520);
	}

	@OriginalMember(owner = "client!de", name = "n", descriptor = "()V")
	@Override
	public void method7663() {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5557(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(ZI)Lclient!fh;")
	@Override
	public Interface5 method5684(@OriginalArg(0) boolean arg0) {
		return new Class401(this, Static438.aClass261_15, arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7649(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7630(arg2, arg3);
	}

	@OriginalMember(owner = "client!de", name = "x", descriptor = "(B)V")
	@Override
	protected void method5660() {
		this.method5585();
		this.method5607();
	}

	@OriginalMember(owner = "client!de", name = "x", descriptor = "()V")
	@Override
	public void method7667() {
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
	@Override
	public void method7678() {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(II)Lclient!hg;")
	@Override
	protected Class121 method5626(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class121_Sub6(this, this.aClass221_109);
		} else if (arg0 == 4) {
			return new Class121_Sub4(this, this.aClass221_109, this.aClass76_5);
		} else if (arg0 == 8) {
			return new Class121_Sub5(this, this.aClass221_109, this.aClass76_5);
		} else {
			return super.method5626(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!dea;I)V")
	public void method1927(@OriginalArg(0) Class52_Sub2 arg0) {
		this.method1921(arg0);
		if (arg0.aBoolean182 != this.aBooleanArray5[this.anInt6659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 1, arg0.aBoolean182 ? 1 : 3);
			this.aBooleanArray5[this.anInt6659] = arg0.aBoolean182;
		}
		if (arg0.aBoolean183 != this.aBooleanArray6[this.anInt6659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6659, 2, arg0.aBoolean183 ? 1 : 3);
			this.aBooleanArray6[this.anInt6659] = arg0.aBoolean183;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!tt;Lclient!hba;)Lclient!pea;")
	@Override
	public Interface20 method7638(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!de", name = "A", descriptor = "(B)V")
	@Override
	protected void method5613() {
		if (this.anIDirect3DVertexShader1 != null || Static547.aClass96_5 == this.aClass96Array3[this.anInt6659]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, 24, 0);
			this.anIntArray105[this.anInt6659] = 0;
			return;
		}
		if (Static32.aClass96_1 == this.aClass96Array3[this.anInt6659]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6659 + 16, this.aClass181_Sub1Array3[this.anInt6659].method4935(Static107.aFloatArray26));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6659 + 16, this.aClass181_Sub1Array3[this.anInt6659].method4917(Static107.aFloatArray26));
		}
		@Pc(77) int local77 = Static107.method1923(this.aClass96Array3[this.anInt6659]);
		if (this.anIntArray105[this.anInt6659] != local77) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, 24, local77);
			this.anIntArray105[this.anInt6659] = local77;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!kn;)V")
	@Override
	public void method5569(@OriginalArg(1) Class212 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ur;B)V")
	@Override
	public void method5633(@OriginalArg(0) Class377 arg0) {
		@Pc(5) int local5 = 0;
		if (Static595.aClass377_2 == arg0) {
			local5 = 65536;
		} else if (Static603.aClass377_4 == arg0) {
			local5 = 131072;
		} else if (Static254.aClass377_1 == arg0) {
			local5 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, 11, this.anInt6659 | local5);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!de", name = "x", descriptor = "(I)V")
	@Override
	protected void method5677() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6686);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class77 method7662(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class77 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method5593(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!de", name = "J", descriptor = "(I)V")
	@Override
	protected void method5676() {
		@Pc(24) int local24 = this.aBooleanArray3[this.anInt6659] ? Static107.method1918(this.aClass37Array5[this.anInt6659]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, 4, local24);
	}

	@OriginalMember(owner = "client!de", name = "H", descriptor = "(I)V")
	@Override
	protected void method5685() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat121 * this.aFloat125, this.aFloat117 * this.aFloat121, this.aFloat119 * this.aFloat121, 0.0F);
		this.aBoolean178 = false;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(ZB)Lclient!lq;")
	@Override
	public Interface16 method5649(@OriginalArg(0) boolean arg0) {
		return new Class289(this, arg0);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5602() {
		this.aFloat124 = (float) (this.anInt6656 - this.anInt6681);
		this.aFloat126 = (float) -this.anInt6676 + this.aFloat124;
		if (this.aFloat126 < (float) this.anInt6680) {
			this.aFloat126 = (float) this.anInt6680;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat126);
		this.anIDirect3DDevice1.a(37, this.aFloat124);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6669);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIZLclient!ct;I)V")
	@Override
	public void method5641(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) int arg3) {
		@Pc(23) byte local23;
		if (arg3 == 1) {
			local23 = 3;
		} else if (arg3 == 2) {
			local23 = 26;
		} else {
			local23 = 2;
		}
		@Pc(31) int local31 = 0;
		if (arg0) {
			local31 = 32;
		}
		if (arg1) {
			local31 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, local23, Static107.method1929(arg2) | local31);
	}

	@OriginalMember(owner = "client!de", name = "q", descriptor = "(I)V")
	@Override
	public void method5611() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray57[0], -this.aFloatArray57[1], -this.aFloatArray57[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
		this.aBoolean178 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!pc;I)V")
	@Override
	public void method5640(@OriginalArg(0) int arg0, @OriginalArg(2) Class281 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static107.method1919(arg1), arg2, arg0);
	}

	@OriginalMember(owner = "client!de", name = "p", descriptor = "(B)V")
	@Override
	protected void method5608() {
		if (this.aBooleanArray3[this.anInt6659]) {
			this.aBooleanArray3[this.anInt6659] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6659, (IDirect3DBaseTexture) null);
			this.method5676();
			this.method5688();
		}
	}

	@OriginalMember(owner = "client!de", name = "h", descriptor = "(B)V")
	@Override
	protected void method5606() {
		if (this.aClass320_5.method7780()) {
			this.aClass181_Sub1_18.method4917(Static107.aFloatArray26);
		} else {
			Static107.aFloatArray26[0] = 1.0F;
			Static107.aFloatArray26[5] = 1.0F;
			Static107.aFloatArray26[6] = 0.0F;
			Static107.aFloatArray26[12] = 0.0F;
			Static107.aFloatArray26[1] = 0.0F;
			Static107.aFloatArray26[9] = 0.0F;
			Static107.aFloatArray26[14] = 0.0F;
			Static107.aFloatArray26[10] = 1.0F;
			Static107.aFloatArray26[7] = 0.0F;
			Static107.aFloatArray26[4] = 0.0F;
			Static107.aFloatArray26[8] = 0.0F;
			Static107.aFloatArray26[11] = 0.0F;
			Static107.aFloatArray26[13] = 0.0F;
			Static107.aFloatArray26[15] = 1.0F;
			Static107.aFloatArray26[2] = 0.0F;
			Static107.aFloatArray26[3] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static107.aFloatArray26);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
	@Override
	protected void method5636() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray60);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z[FLclient!hd;IIIBI)Lclient!gp;")
	@Override
	protected Interface6 method5679(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!de", name = "k", descriptor = "(I)V")
	@Override
	public synchronized void method7709(@OriginalArg(0) int arg0) {
		this.aVv1.a(true);
		super.method7709(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!lq;I)V")
	@Override
	public void method5620(@OriginalArg(1) Interface16 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class289 local2 = (Class289) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method7126());
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)Lclient!tt;")
	@Override
	public Interface25 method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!de", name = "D", descriptor = "(I)V")
	@Override
	protected void method5691() {
		this.anIDirect3DDevice1.a(28, this.aBoolean507 && this.aBoolean510 && this.anInt6676 >= 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!fh;IZIIILclient!pc;)V")
	@Override
	public void method5659(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class281 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class401) arg0).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static107.method1919(arg5), 0, arg4, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
	@Override
	public void method7630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass408_1.method9430()) {
			this.anInt2163 = 0;
			if (ala.b(-30611, this.aClass408_1.method9432())) {
				this.method1920();
			}
		} else if (++this.anInt2163 <= 50) {
			this.method1920();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()Z")
	@Override
	public boolean method7643() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[BIILclient!hd;Z)Lclient!gp;")
	@Override
	protected Interface6 method5689(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class145 arg3, @OriginalArg(7) boolean arg4) {
		return new Class52_Sub2(this, arg3, arg2, arg0, arg4, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!de", name = "B", descriptor = "(I)V")
	@Override
	protected void method5673() {
	}

	@OriginalMember(owner = "client!de", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.a(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (ala.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), -1) && ala.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), -1)) {
			local1 = new int[arg3 * arg2];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(78) int local78 = 0; local78 < arg3; local78++) {
					this.aPixelBuffer1.a(local1, arg2 * local78, local78 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b((byte) 99);
		local16.b((byte) 108);
		return local1;
	}

	@OriginalMember(owner = "client!de", name = "l", descriptor = "(I)V")
	@Override
	protected void method5688() {
		@Pc(20) int local20 = this.aBooleanArray3[this.anInt6659] ? Static107.method1918(this.aClass37Array6[this.anInt6659]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6659, 1, local20);
	}

	@OriginalMember(owner = "client!de", name = "F", descriptor = "(I)V")
	@Override
	protected void method5583() {
		this.anIDirect3DDevice1.a(174, this.aBoolean523);
	}

	@OriginalMember(owner = "client!de", name = "B", descriptor = "()Z")
	@Override
	public boolean method7655() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "y", descriptor = "(B)V")
	@Override
	protected void method5607() {
		if (this.aBoolean178) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean178 = true;
	}

	@OriginalMember(owner = "client!de", name = "v", descriptor = "(B)V")
	@Override
	protected void method5610() {
		if (this.aBoolean502) {
			Static107.aFloatArray26[4] = 0.0F;
			Static107.aFloatArray26[6] = 0.0F;
			Static107.aFloatArray26[0] = 1.0F;
			Static107.aFloatArray26[1] = 0.0F;
			Static107.aFloatArray26[3] = 0.0F;
			Static107.aFloatArray26[5] = 1.0F;
			Static107.aFloatArray26[12] = 0.0F;
			Static107.aFloatArray26[8] = 0.0F;
			Static107.aFloatArray26[10] = 1.0F;
			Static107.aFloatArray26[14] = 0.0F;
			Static107.aFloatArray26[15] = 1.0F;
			Static107.aFloatArray26[9] = 0.0F;
			Static107.aFloatArray26[2] = 0.0F;
			Static107.aFloatArray26[7] = 0.0F;
			Static107.aFloatArray26[13] = 0.0F;
			Static107.aFloatArray26[11] = 0.0F;
		} else {
			this.aClass181_Sub1_15.method4917(Static107.aFloatArray26);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static107.aFloatArray26);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!hd;III[B)Lclient!bf;")
	@Override
	public Interface1 method5562(@OriginalArg(1) Class145 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class52_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!de", name = "E", descriptor = "(I)V")
	@Override
	protected void method5584() {
		this.anIDirect3DDevice1.a(14, this.aBoolean514 && this.aBoolean511);
	}

	@OriginalMember(owner = "client!de", name = "v", descriptor = "(I)V")
	@Override
	protected void method5561() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6660, this.anInt6675, this.anInt6608, this.anInt6626, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BZI[[I)Lclient!gr;")
	@Override
	public Interface7 method5599(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class52_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!de", name = "K", descriptor = "(I)V")
	@Override
	protected void method5581() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6666; local1++) {
			@Pc(10) Class3_Sub16 local10 = this.aClass3_Sub16Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method6325();
			@Pc(24) float local24 = local10.method6326() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method6323(), (float) local10.method6322(), (float) local10.method6320());
			this.aD3DLIGHT1.SetDiffuse(local24 * (float) (local18 >> 16 & 0xFF), (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method6324() * local10.method6324()));
			this.aD3DLIGHT1.SetRange((float) local10.method6324());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt6684 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5581();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method1930(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lclient!hba;")
	@Override
	public Interface8 method7689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!de", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5652(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([Lclient!he;Z)Lclient!kn;")
	@Override
	public Class212 method5570(@OriginalArg(0) Class147[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!de", name = "O", descriptor = "(I)V")
	@Override
	protected void method5624() {
		this.anIDirect3DDevice1.a(27, this.aBoolean503);
	}

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "(I)V")
	@Override
	protected void method5576(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6683; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass384Array1[local1] = Static108.aClass384_7;
			this.aBooleanArray5[local1] = this.aBooleanArray6[local1] = true;
			this.aBooleanArray4[local1] = false;
			this.anIntArray105[local1] = 0;
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
		this.aD3DLIGHT2.SetType(3);
		this.aD3DLIGHT3.SetType(3);
		this.aD3DLIGHT1.SetType(1);
		this.aBoolean178 = false;
		super.method5576(25);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	@Override
	public void method7652(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "t", descriptor = "(B)V")
	@Override
	protected void method5585() {
		@Pc(17) float local17 = this.aBoolean513 ? this.aFloat122 : 0.0F;
		@Pc(27) float local27 = this.aBoolean513 ? -this.aFloat110 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(this.aFloat125 * local17, this.aFloat117 * local17, local17 * this.aFloat119, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local27 * this.aFloat125, local27 * this.aFloat117, local27 * this.aFloat119, 0.0F);
		this.aBoolean178 = false;
	}

	@OriginalMember(owner = "client!de", name = "z", descriptor = "()V")
	@Override
	public void method7707() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (ala.a(local3.Issue(), -1)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b((byte) 98);
	}

	@OriginalMember(owner = "client!de", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}
}
