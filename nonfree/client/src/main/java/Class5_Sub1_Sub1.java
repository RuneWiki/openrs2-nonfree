import jaclib.peer.ep;
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
import jagdx.mm;
import jagdx.vq;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ad", name = "Mg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!ad", name = "Rg", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ad", name = "Fg", descriptor = "I")
	private int anInt565 = 0;

	@OriginalMember(owner = "client!ad", name = "Zg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ad", name = "Eg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ad", name = "Dg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ad", name = "bh", descriptor = "Lclient!jaclib/peer/ep;")
	public final ep anEp1;

	@OriginalMember(owner = "client!ad", name = "ah", descriptor = "I")
	private final int anInt567;

	@OriginalMember(owner = "client!ad", name = "Jg", descriptor = "Lclient!vda;")
	private Class352 aClass352_1;

	@OriginalMember(owner = "client!ad", name = "Kg", descriptor = "I")
	private final int anInt566;

	@OriginalMember(owner = "client!ad", name = "ch", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ad", name = "Lg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ad", name = "Sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ad", name = "Ug", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ad", name = "Ng", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ad", name = "Ig", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ad", name = "Qg", descriptor = "Z")
	public final boolean aBoolean52;

	@OriginalMember(owner = "client!ad", name = "Vg", descriptor = "Z")
	public final boolean aBoolean54;

	@OriginalMember(owner = "client!ad", name = "Hg", descriptor = "Z")
	public final boolean aBoolean51;

	@OriginalMember(owner = "client!ad", name = "Gg", descriptor = "[Z")
	private final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ad", name = "dh", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ad", name = "eh", descriptor = "[I")
	private final int[] anIntArray8;

	@OriginalMember(owner = "client!ad", name = "Tg", descriptor = "[Z")
	private final boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!ad", name = "Xg", descriptor = "[Lclient!ui;")
	private final Class339[] aClass339Array1;

	@OriginalMember(owner = "client!ad", name = "Yg", descriptor = "[Z")
	private final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!ad", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!la;Ljava/lang/Integer;)Lclient!ha;")
	private static Class5 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class5_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ep local9 = new ep();
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
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(179) D3DPRESENT_PARAMETERS local179 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static6.method649(local13, local5, local3, local179, arg3)) {
					throw new RuntimeException("");
				}
				local179.PresentationInterval = Integer.MIN_VALUE;
				local179.Windowed = true;
				local179.EnableAutoDepthStencil = true;
				@Pc(205) int local205 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local205 |= 0x10;
				}
				@Pc(230) IDirect3DDevice local230;
				try {
					local230 = local13.a(local3, local5, arg0, local205 | 0x40, local179);
				} catch (@Pc(232) mm local232) {
					local230 = local13.a(local3, local5, arg0, local205 | 0x20, local179);
				}
				@Pc(251) Class352 local251 = new Class352(local230.c(0), local230.c());
				local1 = new Class5_Sub1_Sub1(local3, local5, arg0, local9, local13, local230, local251, local179, local18, arg1, arg2, arg3);
				local1.method5676();
				return local1;
			}
		} catch (@Pc(274) RuntimeException local274) {
			if (local1 != null) {
				local1.method7493();
			}
			throw local274;
		}
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ep;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!vda;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!la;I)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ep arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class352 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface7 arg9, @OriginalArg(10) Class196 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anIDirect3D1 = arg4;
		this.aD3DCAPS1 = arg8;
		this.anIDirect3DDevice1 = arg5;
		this.anEp1 = arg3;
		this.anInt567 = arg0;
		this.aClass352_1 = arg6;
		this.anInt566 = arg1;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aD3DLIGHT1 = new D3DLIGHT(this.anEp1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.anEp1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.anEp1);
		this.aPixelBuffer1 = new PixelBuffer(this.anEp1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.anEp1);
		new GeometryBuffer(this.anEp1);
		this.anInt6549 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean52 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean465 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt6538 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean54 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean51 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean469 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean453 = this.anInt6545 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt567, this.anInt566, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray1 = new boolean[this.anInt6538];
		this.aBooleanArray4 = new boolean[this.anInt6538];
		this.anIntArray8 = new int[this.anInt6538];
		this.aBooleanArray2 = new boolean[this.anInt6538];
		this.aClass339Array1 = new Class339[this.anInt6538];
		this.aBooleanArray3 = new boolean[this.anInt6538];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method5685(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "(I)V")
	@Override
	protected void method5695() {
		if (this.aBooleanArray1[this.anInt6535]) {
			this.aBooleanArray1[this.anInt6535] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6535, null);
			this.method5622();
			this.method5614();
		}
	}

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "(I)V")
	@Override
	protected void method5621() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat136 * this.aFloat141, this.aFloat142 * this.aFloat141, this.aFloat141 * this.aFloat140, 0.0F);
		this.aBoolean53 = false;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!rw;)V")
	public void method646(@OriginalArg(1) Class48_Sub3 arg0) {
		this.method651(arg0);
		if (arg0.aBoolean622 != this.aBooleanArray3[this.anInt6535]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 1, arg0.aBoolean622 ? 1 : 3);
			this.aBooleanArray3[this.anInt6535] = arg0.aBoolean622;
		}
		if (this.aBooleanArray2[this.anInt6535] != arg0.aBoolean623) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 2, arg0.aBoolean623 ? 1 : 3);
			this.aBooleanArray2[this.anInt6535] = arg0.aBoolean623;
		}
	}

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "()V")
	@Override
	public void method7567() {
	}

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "()V")
	@Override
	public void method7535() {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7565(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7514(arg2, arg3);
	}

	@OriginalMember(owner = "client!ad", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (vq.b(-2005530516, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && vq.b(-2005530516, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local55) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(62) int local62 = 0; local62 < arg3; local62++) {
					this.aPixelBuffer1.a(local1, local62 * arg2, local62 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -118);
		local16.a((byte) -89);
		return local1;
	}

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "(I)V")
	@Override
	protected void method5616() {
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "()V")
	@Override
	public void method7560() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (vq.b(-2005530516, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -125);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5590(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!fg;IB)V")
	@Override
	public void method5692(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class244 local2 = (Class244) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method6377());
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(II)V")
	@Override
	public void method5566(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, 11, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "()Lclient!fc;")
	@Override
	public Class103 method7569() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt567, 0);
		return new Class103(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	@Override
	public void method7492(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "(B)F")
	@Override
	protected float method5660() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "(I)V")
	@Override
	protected void method5635() {
		@Pc(7) float local7 = this.aBoolean470 ? this.aFloat148 : 0.0F;
		@Pc(16) float local16 = this.aBoolean470 ? -this.aFloat147 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat136 * local7, this.aFloat142 * local7, this.aFloat140 * local7, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat136 * local16, this.aFloat142 * local16, this.aFloat140 * local16, 0.0F);
		this.aBoolean53 = false;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!up;Lclient!rga;)Lclient!dv;")
	@Override
	public Interface8 method7512(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface18 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "(I)V")
	@Override
	protected void method5645() {
		this.anIDirect3DDevice1.a(27, this.aBoolean452);
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(Z)V")
	@Override
	protected void method5572() {
		this.aFloat139 = this.anInt6516 - this.anInt6531;
		this.aFloat145 = this.aFloat139 - (float) this.anInt6539;
		if (this.aFloat145 < (float) this.anInt6510) {
			this.aFloat145 = this.anInt6510;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat145);
		this.anIDirect3DDevice1.a(37, this.aFloat139);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6521);
	}

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "()V")
	@Override
	public void method7555() {
	}

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "(I)V")
	@Override
	protected void method5639() {
		this.anIDirect3DDevice1.a(15, this.aBoolean457);
	}

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "(I)V")
	@Override
	protected void method5691() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6518, this.anInt6534, this.anInt6469, this.anInt6423, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method7509(@OriginalArg(0) int arg0) {
		this.anEp1.a((byte) 123);
		super.method7509(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ew;)V")
	@Override
	public void method5620(@OriginalArg(1) Class99 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static218.aClass99_15) {
			local1 = 65536;
		} else if (Static435.aClass99_20 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static281.aClass99_22) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, 11, local1 | this.anInt6535);
	}

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "(I)V")
	@Override
	protected void method5670() {
		this.method5635();
		this.method5693();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZBILclient!af;)V")
	@Override
	public void method5618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3) {
		@Pc(1) int local1 = 0;
		@Pc(14) byte local14;
		if (arg2 == 1) {
			local14 = 3;
		} else if (arg2 == 2) {
			local14 = 26;
		} else {
			local14 = 2;
		}
		if (arg1) {
			local1 = 32;
		}
		if (arg0) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, local14, local1 | Static6.method648(arg3));
	}

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "()Z")
	@Override
	public boolean method7534() {
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5636(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5565() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6513);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZI[III)Lclient!ug;")
	@Override
	public Interface24 method5626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class48_Sub3(this, arg3, arg5, arg2, arg4, 0, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "(B)V")
	@Override
	protected void method5604() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6536 + this.anInt6518, this.anInt6534 - -this.anInt6520, this.anInt6519, this.anInt6523);
	}

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!em;I)V")
	public void method651(@OriginalArg(0) Class48 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6535, arg0.method7473());
		if (arg0.aClass339_11 != this.aClass339Array1[this.anInt6535]) {
			@Pc(58) int local58 = Static6.method657(arg0.aClass339_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 6, local58);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 5, local58);
			this.aClass339Array1[this.anInt6535] = arg0.aClass339_11;
			if (this.aBooleanArray4[this.anInt6535] != arg0.aBoolean621) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 7, arg0.aBoolean621 ? Static6.method657(arg0.aClass339_11) : 0);
				this.aBooleanArray4[this.anInt6535] = arg0.aBoolean621;
			}
		} else if (arg0.aBoolean621 != this.aBooleanArray4[this.anInt6535]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 7, arg0.aBoolean621 ? Static6.method657(arg0.aClass339_11) : 0);
			this.aBooleanArray4[this.anInt6535] = arg0.aBoolean621;
		}
		if (!this.aBooleanArray1[this.anInt6535]) {
			this.aBooleanArray1[this.anInt6535] = true;
			this.method5622();
			this.method5614();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!dv;)V")
	@Override
	public void method7527(@OriginalArg(0) Interface8 arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	@Override
	protected void method5570() {
		if (this.aClass7_5 == Static57.aClass7_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass7_5 == Static32.aClass7_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass7_5 == Static608.aClass7_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "(B)Z")
	private boolean method652() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(20) Class352 local20 = (Class352) this.anObject12;
			this.method5653();
			local20.method8343();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static6.method649(this.anIDirect3D1, this.anInt566, this.anInt567, this.aD3DPRESENT_PARAMETERS1, this.anInt6545)) {
				@Pc(54) int local54 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (vq.b(-2005530516, local54)) {
					local20.method8344(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.c());
					this.method5634();
					this.method5655();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "()Z")
	@Override
	public boolean method7516() {
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "(B)V")
	@Override
	protected void method5655() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6538; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass339Array1[local1] = Static108.aClass339_3;
			this.aBooleanArray3[local1] = this.aBooleanArray2[local1] = true;
			this.aBooleanArray4[local1] = false;
			this.anIntArray8[local1] = 0;
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
		this.aBoolean53 = false;
		super.method5655();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(ZZ)Lclient!fg;")
	@Override
	public Interface11 method5649(@OriginalArg(0) boolean arg0) {
		return new Class244(this, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "(B)V")
	@Override
	protected void method5615() {
		this.anIDirect3DDevice1.a(14, this.aBoolean460 && this.aBoolean459);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!kca;BII[BI)Lclient!iv;")
	@Override
	public Interface12 method5637(@OriginalArg(0) Class182 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class48_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lclient!sha;")
	@Override
	protected Class29 method5585(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class29_Sub5(this, this.aClass196_66);
		} else if (arg0 == 4) {
			return new Class29_Sub4(this, this.aClass196_66, this.lb);
		} else if (arg0 == 8) {
			return new Class29_Sub8(this, this.aClass196_66, this.lb);
		} else {
			return super.method5585(arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(B)V")
	@Override
	protected void method5595() {
		if (this.aBoolean451) {
			Static6.aFloatArray19[11] = 0.0F;
			Static6.aFloatArray19[14] = 0.0F;
			Static6.aFloatArray19[7] = 0.0F;
			Static6.aFloatArray19[3] = 0.0F;
			Static6.aFloatArray19[15] = 1.0F;
			Static6.aFloatArray19[10] = 1.0F;
			Static6.aFloatArray19[1] = 0.0F;
			Static6.aFloatArray19[8] = 0.0F;
			Static6.aFloatArray19[4] = 0.0F;
			Static6.aFloatArray19[13] = 0.0F;
			Static6.aFloatArray19[0] = 1.0F;
			Static6.aFloatArray19[12] = 0.0F;
			Static6.aFloatArray19[9] = 0.0F;
			Static6.aFloatArray19[5] = 1.0F;
			Static6.aFloatArray19[2] = 0.0F;
			Static6.aFloatArray19[6] = 0.0F;
		} else {
			this.aClass39_Sub1_15.method1556(Static6.aFloatArray19);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static6.aFloatArray19);
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(Z)V")
	@Override
	public void method5591() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray50[0], -this.aFloatArray50[1], -this.aFloatArray50[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray53[0], -this.aFloatArray53[1], -this.aFloatArray53[2]);
		this.aBoolean53 = false;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	@Override
	public void method7489() {
	}

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "(I)V")
	@Override
	protected void method5675() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray54);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method654(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;IIZ)V")
	@Override
	protected void method5600(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte local11;
		if (arg1 == 1) {
			local11 = 6;
		} else if (arg1 == 2) {
			local11 = 27;
		} else {
			local11 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, local11, Static6.method648(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7544(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(BZ)Lclient!rr;")
	@Override
	public Interface19 method5671(@OriginalArg(1) boolean arg0) {
		return new Class321(this, Static637.aClass376_17, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method5587(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		if (arg1 != this.aCanvas9) {
			return;
		}
		@Pc(15) Dimension local15 = arg1.getSize();
		if (local15.width > 0 && local15.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method652();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!eu;B)V")
	@Override
	public void method5610(@OriginalArg(0) Class46 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!rf;IIB)V")
	@Override
	public void method5688(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static6.method656(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!lea;)V")
	public void method655(@OriginalArg(1) Class48_Sub2 arg0) {
		this.method651(arg0);
		if (!this.aBooleanArray3[this.anInt6535]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 1, 1);
			this.aBooleanArray3[this.anInt6535] = true;
		}
		if (!this.aBooleanArray2[this.anInt6535]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6535, 2, 1);
			this.aBooleanArray2[this.anInt6535] = true;
		}
	}

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "(B)V")
	@Override
	protected void method5614() {
		@Pc(19) int local19 = this.aBooleanArray1[this.anInt6535] ? Static6.method650(this.aClass374Array6[this.anInt6535]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, 1, local19);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!kca;IIB[BIZI)Lclient!ug;")
	@Override
	protected Interface24 method5629(@OriginalArg(0) Class182 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		return new Class48_Sub3(this, arg0, arg1, arg4, arg3, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "(I)V")
	@Override
	protected void method5622() {
		@Pc(24) int local24 = this.aBooleanArray1[this.anInt6535] ? Static6.method650(this.aClass374Array5[this.anInt6535]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, 4, local24);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI[[IZ)Lclient!au;")
	@Override
	public Interface3 method5581(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class48_Sub1(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "(I)V")
	@Override
	protected void method5684() {
		this.anIDirect3DDevice1.a(137, this.aBoolean464 && !this.aBoolean468);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!rf;IIILclient!rr;II)V")
	@Override
	public void method5665(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class321) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static6.method656(arg0), 0, arg1, arg2, arg5, arg4);
	}

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "(I)V")
	@Override
	protected void method5693() {
		if (this.aBoolean53) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean53 = true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!wq;Lclient!kca;)Z")
	@Override
	public boolean method5619(@OriginalArg(1) Class376 arg0, @OriginalArg(2) Class182 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return vq.b(-2005530516, this.anIDirect3D1.a(this.anInt567, local11)) && vq.b(-2005530516, this.anIDirect3D1.CheckDeviceFormat(this.anInt567, this.anInt566, local11.Format, 0, 4, Static6.method647(arg1, arg0)));
	}

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "(I)V")
	@Override
	protected void method5668() {
		this.anIDirect3DDevice1.a(174, this.aBoolean472);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!kca;Lclient!wq;)Z")
	@Override
	public boolean method5602(@OriginalArg(1) Class182 arg0, @OriginalArg(2) Class376 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return vq.b(-2005530516, this.anIDirect3D1.a(this.anInt567, local3)) && vq.b(-2005530516, this.anIDirect3D1.CheckDeviceFormat(this.anInt567, this.anInt566, local3.Format, 0, 3, Static6.method647(arg0, arg1)));
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "(B)V")
	@Override
	protected void method5608() {
		if (this.anIDirect3DVertexShader1 != null || this.aClass340Array3[this.anInt6535] == Static362.aClass340_4) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, 24, 0);
			this.anIntArray8[this.anInt6535] = 0;
			return;
		}
		if (this.aClass340Array3[this.anInt6535] == Static602.aClass340_6) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6535 + 16, this.bf[this.anInt6535].method1556(Static6.aFloatArray19));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6535 + 16, this.bf[this.anInt6535].method1554(Static6.aFloatArray19));
		}
		@Pc(80) int local80 = Static6.method653(this.aClass340Array3[this.anInt6535]);
		if (this.anIntArray8[this.anInt6535] != local80) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6535, 24, local80);
			this.anIntArray8[this.anInt6535] = local80;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "(I)V")
	@Override
	protected void method5641() {
		if (this.aClass372_13.method8631()) {
			this.aClass39_Sub1_18.method1556(Static6.aFloatArray19);
		} else {
			Static6.aFloatArray19[11] = 0.0F;
			Static6.aFloatArray19[0] = 1.0F;
			Static6.aFloatArray19[13] = 0.0F;
			Static6.aFloatArray19[10] = 1.0F;
			Static6.aFloatArray19[9] = 0.0F;
			Static6.aFloatArray19[5] = 1.0F;
			Static6.aFloatArray19[6] = 0.0F;
			Static6.aFloatArray19[2] = 0.0F;
			Static6.aFloatArray19[15] = 1.0F;
			Static6.aFloatArray19[1] = 0.0F;
			Static6.aFloatArray19[7] = 0.0F;
			Static6.aFloatArray19[3] = 0.0F;
			Static6.aFloatArray19[8] = 0.0F;
			Static6.aFloatArray19[12] = 0.0F;
			Static6.aFloatArray19[14] = 0.0F;
			Static6.aFloatArray19[4] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static6.aFloatArray19);
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "(B)V")
	@Override
	protected void method5667() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6533; local1++) {
			@Pc(10) Class3_Sub16 local10 = this.aClass3_Sub16Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(20) int local20 = local10.method4776();
			@Pc(28) float local28 = local10.method4785() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local10.method4778(), (float) local10.method4777(), (float) local10.method4783());
			this.aD3DLIGHT3.SetDiffuse(local28 * (float) (local20 >> 16 & 0xFF), local28 * (float) (local20 >> 8 & 0xFF), local28 * (float) (local20 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method4781() * local10.method4781()));
			this.aD3DLIGHT3.SetRange((float) local10.method4781());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt6522 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5667();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ss;Lclient!ss;FLclient!ss;)Lclient!ss;")
	@Override
	public Class205 method7564(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class205 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBLclient!wq;Lclient!kca;)Lclient!ug;")
	@Override
	public Interface24 method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class376 arg2, @OriginalArg(4) Class182 arg3) {
		return new Class48_Sub3(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)Lclient!up;")
	@Override
	public Interface25 method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lclient!rga;")
	@Override
	public Interface18 method7488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!jagdx/IDirect3DVertexShader;)V")
	public void method658(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method5608();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V")
	@Override
	public void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass352_1.method8342()) {
			this.anInt565 = 0;
			if (vq.a(this.aClass352_1.method8341(), -2420)) {
				this.method652();
			}
		} else if (++this.anInt565 <= 50) {
			this.method652();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBZIILclient!kca;[F)Lclient!ug;")
	@Override
	protected Interface24 method5677(@OriginalArg(3) boolean arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class182 arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method5576(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5648(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass352_1 = (Class352) arg1;
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5657() {
		this.anIDirect3DDevice1.a(28, this.aBoolean463 && this.aBoolean461 && this.anInt6539 >= 0);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
	@Override
	protected void method7493() {
		this.anEp1.a(false);
		super.method7493();
	}

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "(B)V")
	@Override
	protected void method5694() {
		this.anIDirect3DDevice1.a(7, this.aBoolean458);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[Lclient!en;)Lclient!eu;")
	@Override
	public Class46 method5652(@OriginalArg(1) Class93[] arg0) {
		return new dxVertexLayout(this, arg0);
	}
}
