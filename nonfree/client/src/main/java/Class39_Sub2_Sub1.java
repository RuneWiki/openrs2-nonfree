import jaclib.peer.pb;
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
import jagdx.dm;
import jagdx.kl;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class39_Sub2_Sub1 extends Class39_Sub2 {

	@OriginalMember(owner = "client!nca", name = "Qg", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!nca", name = "Bg", descriptor = "I")
	private int anInt5955 = 0;

	@OriginalMember(owner = "client!nca", name = "Hg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!nca", name = "Eg", descriptor = "Lclient!nf;")
	private Class199 aClass199_1;

	@OriginalMember(owner = "client!nca", name = "Sg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!nca", name = "Wg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!nca", name = "yg", descriptor = "Lclient!jaclib/peer/pb;")
	public final pb aPb1;

	@OriginalMember(owner = "client!nca", name = "Cg", descriptor = "I")
	private final int anInt5956;

	@OriginalMember(owner = "client!nca", name = "Tg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!nca", name = "Gg", descriptor = "I")
	private final int anInt5957;

	@OriginalMember(owner = "client!nca", name = "Ig", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!nca", name = "zg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!nca", name = "xg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!nca", name = "Rg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!nca", name = "Jg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!nca", name = "Lg", descriptor = "Z")
	public final boolean aBoolean442;

	@OriginalMember(owner = "client!nca", name = "wg", descriptor = "Z")
	public final boolean aBoolean441;

	@OriginalMember(owner = "client!nca", name = "Mg", descriptor = "Z")
	public final boolean aBoolean443;

	@OriginalMember(owner = "client!nca", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!nca", name = "Kg", descriptor = "[I")
	private final int[] anIntArray488;

	@OriginalMember(owner = "client!nca", name = "Og", descriptor = "[Lclient!qq;")
	private final Class240[] aClass240Array1;

	@OriginalMember(owner = "client!nca", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!nca", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!nca", name = "Pg", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!nca", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!n;Lclient!dda;Ljava/lang/Integer;)Lclient!qa;")
	private static Class39 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class39_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) pb local9 = new pb();
			@Pc(13) IDirect3D local13 = IDirect3D.a(-2147483616, local9);
			@Pc(18) D3DADAPTER_IDENTIFIER local18 = local13.b(local3, 0);
			if (local18.VendorID == 32902) {
				throw new RuntimeException("");
			}
			@Pc(34) D3DCAPS local34 = local13.a(local3, local5);
			if ((local34.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local34.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local34.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local34.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local34.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local34.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local34.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local34.SrcBlendCaps & local34.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local34.SrcBlendCaps & 0x20 & local34.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local34.DestBlendCaps & 0x2 & local34.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local34.MaxActiveLights > 0 && local34.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local34.MaxStreams >= 5) {
				@Pc(201) D3DPRESENT_PARAMETERS local201 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static317.method5082(arg3, local5, local201, local3, local13)) {
					throw new RuntimeException("");
				}
				local201.EnableAutoDepthStencil = true;
				local201.Windowed = true;
				local201.PresentationInterval = Integer.MIN_VALUE;
				@Pc(227) int local227 = 2;
				if ((local34.DevCaps & 0x100000) != 0) {
					local227 |= 0x10;
				}
				@Pc(252) IDirect3DDevice local252;
				try {
					local252 = local13.a(local3, local5, arg0, local227 | 0x40, local201);
				} catch (@Pc(254) kl local254) {
					local252 = local13.a(local3, local5, arg0, local227 | 0x20, local201);
				}
				@Pc(273) Class199 local273 = new Class199(local252.b(0), local252.c());
				local1 = new Class39_Sub2_Sub1(local3, local5, arg0, local9, local13, local252, local273, local201, local34, arg1, arg2, arg3);
				local1.method6176();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(296) RuntimeException local296) {
			if (local1 != null) {
				local1.method6055();
			}
			throw local296;
		}
	}

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/pb;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!nf;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!n;Lclient!dda;I)V")
	public Class39_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) pb arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class199 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface12 arg9, @OriginalArg(10) Class53 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aD3DCAPS1 = arg8;
		this.aClass199_1 = arg6;
		this.anIDirect3D1 = arg4;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aPb1 = arg3;
		this.anInt5956 = arg0;
		this.anIDirect3DDevice1 = arg5;
		this.anInt5957 = arg1;
		this.aD3DLIGHT3 = new D3DLIGHT(this.aPb1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aPb1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aPb1);
		this.aPixelBuffer1 = new PixelBuffer(this.aPb1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aPb1);
		this.anInt7291 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean442 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.anInt7279 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean441 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean443 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean540 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean546 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean532 = this.anInt7275 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt5956, this.anInt5957, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray28 = new boolean[this.anInt7291];
		this.anIntArray488 = new int[this.anInt7291];
		this.aClass240Array1 = new Class240[this.anInt7291];
		this.aBooleanArray27 = new boolean[this.anInt7291];
		this.aBooleanArray25 = new boolean[this.anInt7291];
		this.aBooleanArray26 = new boolean[this.anInt7291];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method6034();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(232) Exception_Sub1 local232) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!wo;I)V")
	@Override
	public void method6189(@OriginalArg(0) Class316 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 == Static244.aClass316_2) {
			local5 = 65536;
		} else if (arg0 == Static441.aClass316_4) {
			local5 = 131072;
		} else if (Static421.aClass316_3 == arg0) {
			local5 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, 11, this.anInt7278 | local5);
	}

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "()Z")
	@Override
	public boolean method6025() {
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!lc;BLclient!jt;)Z")
	@Override
	public boolean method6186(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class150 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = this.anIDirect3D1.b(this.anInt5956);
		return dm.a((int) 7155, this.anIDirect3D1.CheckDeviceFormat(this.anInt5956, this.anInt5957, local12.Format, 0, 4, Static317.method5078(arg0, arg1)));
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!nca", name = "B", descriptor = "(I)V")
	@Override
	protected void method6149() {
		if (this.aBooleanArray27[this.anInt7278]) {
			this.aBooleanArray27[this.anInt7278] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7278, null);
			this.method6086();
			this.method6120();
		}
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)V")
	@Override
	protected void method6099() {
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean549);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean549);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6132(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nca", name = "r", descriptor = "(I)V")
	@Override
	protected void method6117() {
		this.anIDirect3DDevice1.a(14, this.aBoolean543 && this.aBoolean545);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I[IIIZBI)Lclient!hc;")
	@Override
	public Interface8 method6180(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		return new Class139_Sub2(this, arg2, arg3, arg4, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "()V")
	@Override
	public void method6062() {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "()Lclient!rr;")
	@Override
	public Class254 method6009() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt5956, 0);
		return new Class254(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "()V")
	@Override
	public void method6034() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass199_1.method5099()) {
			this.anInt5955 = 0;
			if (dm.a((byte) 118, this.aClass199_1.method5097())) {
				this.method5075();
			}
		} else if (++this.anInt5955 <= 50) {
			this.method5075();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!lw;I)V")
	public void method5074(@OriginalArg(0) Class139_Sub2 arg0) {
		this.method5080(arg0);
		if (arg0.aBoolean394 != this.aBooleanArray25[this.anInt7278]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 1, arg0.aBoolean394 ? 1 : 3);
			this.aBooleanArray25[this.anInt7278] = arg0.aBoolean394;
		}
		if (this.aBooleanArray28[this.anInt7278] != arg0.aBoolean395) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 2, arg0.aBoolean395 ? 1 : 3);
			this.aBooleanArray28[this.anInt7278] = arg0.aBoolean395;
		}
	}

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "(B)V")
	@Override
	protected void method6163() {
		this.anIDirect3DDevice1.a(174, this.aBoolean550);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIZLclient!hba;)V")
	@Override
	protected void method6097(@OriginalArg(1) int arg0, @OriginalArg(3) Class111 arg1) {
		@Pc(20) byte local20;
		if (arg0 == 1) {
			local20 = 6;
		} else if (arg0 == 2) {
			local20 = 27;
		} else {
			local20 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, local20, Static317.method5084(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLclient!g;ILclient!ud;III)V")
	@Override
	public void method6215(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class281 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class167) arg0).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static317.method5079(arg2), 0, arg4, arg5, arg1, arg3);
	}

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "(B)Z")
	private boolean method5075() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(22) Class199 local22 = (Class199) this.anObject16;
			this.method6217();
			local22.method5100();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static317.method5082(this.anInt7275, this.anInt5957, this.aD3DPRESENT_PARAMETERS1, this.anInt5956, this.anIDirect3D1)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (dm.a((int) 7155, local55)) {
					local22.method5098(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method6134();
					this.method6167();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIZI[FILclient!jt;)Lclient!hc;")
	@Override
	protected Interface8 method6199(@OriginalArg(3) boolean arg0, @OriginalArg(4) int arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class150 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6110(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass199_1 = (Class199) arg0;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!tq;I)V")
	@Override
	public void method6095(@OriginalArg(0) int arg0, @OriginalArg(1) Interface19 arg1) {
		@Pc(2) Class248 local2 = (Class248) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method6494());
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6154(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "()V")
	@Override
	protected void method6055() {
		this.aPb1.a(true);
		super.method6055();
	}

	@OriginalMember(owner = "client!nca", name = "X", descriptor = "(I)V")
	@Override
	protected void method6218() {
		this.anIDirect3DDevice1.a(7, this.aBoolean536);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!ud;II)V")
	@Override
	public void method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static317.method5079(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(ZI)Lclient!g;")
	@Override
	public Interface7 method6204(@OriginalArg(0) boolean arg0) {
		return new Class167(this, Static268.aClass171_11, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "()V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)Lclient!tq;")
	@Override
	public Interface19 method6100(@OriginalArg(0) boolean arg0) {
		return new Class248(this, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ[[II)Lclient!df;")
	@Override
	public Interface4 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class139_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
	@Override
	public void method6010(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nca", name = "s", descriptor = "(I)V")
	@Override
	protected void method6120() {
		@Pc(22) int local22 = this.aBooleanArray27[this.anInt7278] ? Static317.method5083(this.aClass165Array6[this.anInt7278]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, 1, local22);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6144(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas13 == arg1) {
			this.anIDirect3DDevice1.EndScene();
			this.method5075();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "(I)V")
	@Override
	protected void method6098() {
		if (this.aClass223_7 == Static146.aClass223_2) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass223_7 == Static8.aClass223_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass223_7 == Static251.aClass223_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!nca", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return 0;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([Lclient!uq;B)Lclient!vs;")
	@Override
	public Class304 method6090(@OriginalArg(0) Class287[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "()V")
	@Override
	public void method6031() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (!dm.a((int) 7155, local3.Issue())) {
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

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(II)Lclient!eba;")
	@Override
	protected Class5 method6084(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class5_Sub6(this, this.aClass53_111);
		} else if (arg0 == 4) {
			return new Class5_Sub7(this, this.aClass53_111, this.aClass284_6);
		} else {
			return super.method6084(arg0);
		}
	}

	@OriginalMember(owner = "client!nca", name = "E", descriptor = "(I)V")
	@Override
	public void method6155() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray57[0], -this.aFloatArray57[1], -this.aFloatArray57[2]);
		this.aBoolean444 = false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!lc;Lclient!jt;II)Lclient!hc;")
	@Override
	public Interface8 method6122(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class150 arg2, @OriginalArg(4) int arg3) {
		return new Class139_Sub2(this, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!hba;IZIZ)V")
	@Override
	public void method6119(@OriginalArg(0) Class111 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(17) byte local17;
		if (arg2 == 1) {
			local17 = 3;
		} else if (arg2 == 2) {
			local17 = 26;
		} else {
			local17 = 2;
		}
		if (arg3) {
			local1 = 32;
		}
		if (arg1) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, local17, Static317.method5084(arg0) | local1);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIZLclient!jt;I[BZ)Lclient!hc;")
	@Override
	protected Interface8 method6105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class150 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) boolean arg4) {
		return new Class139_Sub2(this, arg2, arg1, arg0, arg4, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!nca", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!nca", name = "u", descriptor = "()V")
	@Override
	public void method6056() {
		this.method6171(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!nca", name = "T", descriptor = "(I)V")
	@Override
	protected void method6207() {
		this.anIDirect3DDevice1.a(15, this.aBoolean548);
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)V")
	@Override
	protected void method6096() {
		this.anIDirect3DDevice1.a(137, this.aBoolean538 && !this.aBoolean535);
	}

	@OriginalMember(owner = "client!nca", name = "P", descriptor = "(I)V")
	@Override
	protected void method6177() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7281);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!vs;)V")
	@Override
	public void method6200(@OriginalArg(1) Class304 arg0) {
		@Pc(9) dxVertexLayout local9 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local9.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (dm.a((int) 7155, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1)) && dm.a((int) 7155, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(66) int local66 = 0; local66 < arg3; local66++) {
					this.aPixelBuffer1.b(local1, arg2 * local66, local55 * local66, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -27);
		local16.a((byte) -27);
		return local1;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!ne;)V")
	public void method5080(@OriginalArg(1) Class139 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7278, arg0.method6781());
		if (this.aClass240Array1[this.anInt7278] != arg0.aClass240_9) {
			@Pc(58) int local58 = Static317.method5077(arg0.aClass240_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 6, local58);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 5, local58);
			this.aClass240Array1[this.anInt7278] = arg0.aClass240_9;
			if (this.aBooleanArray26[this.anInt7278] != arg0.aBoolean595) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 7, arg0.aBoolean595 ? Static317.method5077(arg0.aClass240_9) : 0);
				this.aBooleanArray26[this.anInt7278] = arg0.aBoolean595;
			}
		} else if (arg0.aBoolean595 != this.aBooleanArray26[this.anInt7278]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 7, arg0.aBoolean595 ? Static317.method5077(arg0.aClass240_9) : 0);
			this.aBooleanArray26[this.anInt7278] = arg0.aBoolean595;
		}
		if (!this.aBooleanArray27[this.anInt7278]) {
			this.aBooleanArray27[this.anInt7278] = true;
			this.method6086();
			this.method6120();
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!j;Z)V")
	public void method5081(@OriginalArg(0) Class139_Sub1 arg0) {
		this.method5080(arg0);
		if (!this.aBooleanArray25[this.anInt7278]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 1, 1);
			this.aBooleanArray25[this.anInt7278] = true;
		}
		if (!this.aBooleanArray28[this.anInt7278]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7278, 2, 1);
			this.aBooleanArray28[this.anInt7278] = true;
		}
	}

	@OriginalMember(owner = "client!nca", name = "A", descriptor = "(B)V")
	@Override
	protected void method6216() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat189 * this.aFloat188, this.aFloat191 * this.aFloat189, this.aFloat189 * this.aFloat194, 0.0F);
		this.aBoolean444 = false;
	}

	@OriginalMember(owner = "client!nca", name = "K", descriptor = "(I)V")
	@Override
	protected void method6172() {
		this.anIDirect3DDevice1.a(27, this.aBoolean537);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!lh;Lclient!lh;FLclient!lh;)Lclient!lh;")
	@Override
	public Class58 method6045(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class58 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6188() {
		this.anIDirect3DDevice1.a(28, this.aBoolean531 && this.aBoolean541 && this.anInt7277 >= 0 | this.aBoolean533);
	}

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "(B)F")
	@Override
	protected float method6130() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
	@Override
	protected void method6086() {
		@Pc(21) int local21 = this.aBooleanArray27[this.anInt7278] ? Static317.method5083(this.aClass165Array5[this.anInt7278]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, 4, local21);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLclient!lc;Lclient!jt;)Z")
	@Override
	public boolean method6103(@OriginalArg(1) Class171 arg0, @OriginalArg(2) Class150 arg1) {
		@Pc(5) D3DDISPLAYMODE local5 = this.anIDirect3D1.b(this.anInt5956);
		return dm.a((int) 7155, this.anIDirect3D1.CheckDeviceFormat(this.anInt5956, this.anInt5957, local5.Format, 0, 3, Static317.method5078(arg0, arg1)));
	}

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6185() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray63);
	}

	@OriginalMember(owner = "client!nca", name = "J", descriptor = "(I)V")
	@Override
	protected void method6170() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7303; local1++) {
			@Pc(10) Class2_Sub5 local10 = this.aClass2_Sub5Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method1669();
			@Pc(24) float local24 = local10.method1665() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method1672(), (float) local10.method1671(), (float) local10.method1662());
			this.aD3DLIGHT1.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method1666() * local10.method1666()));
			this.aD3DLIGHT1.SetRange((float) local10.method1666());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt7290) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6170();
	}

	@OriginalMember(owner = "client!nca", name = "B", descriptor = "()V")
	@Override
	public void method6076() {
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6143() {
		this.aD3DLIGHT3.SetDiffuse(this.aFloat200 * this.aFloat188, this.aFloat191 * this.aFloat200, this.aFloat194 * this.aFloat200, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat188 * -this.aFloat192, this.aFloat191 * -this.aFloat192, this.aFloat194 * -this.aFloat192, 0.0F);
		this.aBoolean444 = false;
	}

	@OriginalMember(owner = "client!nca", name = "r", descriptor = "(B)V")
	@Override
	protected void method6165() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7296, this.anInt7282, this.anInt7145, this.anInt7126, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(BZ)V")
	@Override
	public void method6124(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "()Z")
	@Override
	public boolean method6043() {
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "(I)V")
	@Override
	protected void method6112() {
		if (this.aBoolean530) {
			Static317.aFloatArray46[11] = 0.0F;
			Static317.aFloatArray46[3] = 0.0F;
			Static317.aFloatArray46[1] = 0.0F;
			Static317.aFloatArray46[10] = 1.0F;
			Static317.aFloatArray46[9] = 0.0F;
			Static317.aFloatArray46[12] = 0.0F;
			Static317.aFloatArray46[13] = 0.0F;
			Static317.aFloatArray46[2] = 0.0F;
			Static317.aFloatArray46[4] = 0.0F;
			Static317.aFloatArray46[8] = 0.0F;
			Static317.aFloatArray46[0] = 1.0F;
			Static317.aFloatArray46[7] = 0.0F;
			Static317.aFloatArray46[5] = 1.0F;
			Static317.aFloatArray46[6] = 0.0F;
			Static317.aFloatArray46[15] = 1.0F;
			Static317.aFloatArray46[14] = 0.0F;
		} else {
			this.aClass181_Sub2_15.method5389(Static317.aFloatArray46);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static317.aFloatArray46);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6104(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, 11, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "y", descriptor = "(I)V")
	@Override
	protected void method6136() {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6008(@OriginalArg(0) int arg0) {
		this.aPb1.a((int) -13691);
		super.method6008(arg0);
	}

	@OriginalMember(owner = "client!nca", name = "z", descriptor = "(I)V")
	@Override
	protected void method6138() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7292 + this.anInt7296, this.anInt7282 - -this.anInt7286, this.anInt7300, this.anInt7293);
	}

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "(I)V")
	@Override
	protected void method6135() {
		if (this.aBoolean444) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, !this.aBoolean549);
		this.anIDirect3DDevice1.LightEnable(1, !this.aBoolean549);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean549);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean549);
		this.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6064(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6034();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!jt;[BIIB)Lclient!pl;")
	@Override
	public Interface15 method6137(@OriginalArg(1) Class150 arg0, @OriginalArg(2) byte[] arg1) {
		return new Class139_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!nca", name = "I", descriptor = "(I)V")
	@Override
	protected void method6167() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7291; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass240Array1[local1] = Static539.aClass240_11;
			this.aBooleanArray25[local1] = this.aBooleanArray28[local1] = true;
			this.aBooleanArray26[local1] = false;
			this.anIntArray488[local1] = 0;
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
		this.aD3DLIGHT3.SetType(3);
		this.aD3DLIGHT2.SetType(3);
		this.aD3DLIGHT1.SetType(1);
		this.aBoolean444 = false;
		super.method6167();
	}

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "(I)V")
	@Override
	protected void method6121() {
		if (this.aClass184_10.method4615()) {
			this.aClass181_Sub2_18.method5389(Static317.aFloatArray46);
		} else {
			Static317.aFloatArray46[4] = 0.0F;
			Static317.aFloatArray46[6] = 0.0F;
			Static317.aFloatArray46[14] = 0.0F;
			Static317.aFloatArray46[7] = 0.0F;
			Static317.aFloatArray46[3] = 0.0F;
			Static317.aFloatArray46[2] = 0.0F;
			Static317.aFloatArray46[12] = 0.0F;
			Static317.aFloatArray46[10] = 1.0F;
			Static317.aFloatArray46[0] = 1.0F;
			Static317.aFloatArray46[13] = 0.0F;
			Static317.aFloatArray46[11] = 0.0F;
			Static317.aFloatArray46[8] = 0.0F;
			Static317.aFloatArray46[9] = 0.0F;
			Static317.aFloatArray46[5] = 1.0F;
			Static317.aFloatArray46[15] = 1.0F;
			Static317.aFloatArray46[1] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static317.aFloatArray46);
	}

	@OriginalMember(owner = "client!nca", name = "y", descriptor = "(B)V")
	@Override
	protected void method6197() {
		if (this.aBoolean533) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt7302);
			return;
		}
		this.aFloat196 = this.anInt7298 - this.anInt7308;
		this.aFloat202 = (float) -this.anInt7277 + this.aFloat196;
		if ((float) this.anInt7288 > this.aFloat202) {
			this.aFloat202 = this.anInt7288;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat202);
		this.anIDirect3DDevice1.a(37, this.aFloat196);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7301);
	}

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "(I)V")
	@Override
	protected void method6101() {
		if (this.aClass224Array3[this.anInt7278] == Static376.aClass224_4) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, 24, 0);
			this.anIntArray488[this.anInt7278] = 0;
			return;
		}
		if (Static237.aClass224_3 == this.aClass224Array3[this.anInt7278]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7278 + 16, this.aClass181_Sub2Array3[this.anInt7278].method5389(Static317.aFloatArray46));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7278 + 16, this.aClass181_Sub2Array3[this.anInt7278].method5407(Static317.aFloatArray46));
		}
		@Pc(72) int local72 = Static317.method5076(this.aClass224Array3[this.anInt7278]);
		if (local72 != this.anIntArray488[this.anInt7278]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7278, 24, local72);
			this.anIntArray488[this.anInt7278] = local72;
		}
	}
}
