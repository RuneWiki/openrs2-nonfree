import jaclib.peer.ow;
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
import jagdx.jc;
import jagdx.rm;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!hb", name = "Dg", descriptor = "I")
	private int anInt3709 = 0;

	@OriginalMember(owner = "client!hb", name = "Rg", descriptor = "Z")
	private boolean aBoolean302 = false;

	@OriginalMember(owner = "client!hb", name = "Qg", descriptor = "Lclient!jaclib/peer/ow;")
	public final ow anOw1;

	@OriginalMember(owner = "client!hb", name = "Jg", descriptor = "I")
	private final int anInt3710;

	@OriginalMember(owner = "client!hb", name = "Yg", descriptor = "I")
	private final int anInt3711;

	@OriginalMember(owner = "client!hb", name = "Ag", descriptor = "Lclient!gu;")
	private Class126 aClass126_1;

	@OriginalMember(owner = "client!hb", name = "Zg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!hb", name = "Mg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!hb", name = "Gg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!hb", name = "Wg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!hb", name = "Tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!hb", name = "Fg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!hb", name = "Cg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!hb", name = "Hg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!hb", name = "Ig", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!hb", name = "zg", descriptor = "Z")
	public final boolean aBoolean300;

	@OriginalMember(owner = "client!hb", name = "Vg", descriptor = "Z")
	public final boolean aBoolean303;

	@OriginalMember(owner = "client!hb", name = "Pg", descriptor = "Z")
	public final boolean aBoolean301;

	@OriginalMember(owner = "client!hb", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!hb", name = "Kg", descriptor = "[Lclient!ng;")
	private final Class225[] aClass225Array1;

	@OriginalMember(owner = "client!hb", name = "Bg", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!hb", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!hb", name = "Eg", descriptor = "[I")
	private final int[] anIntArray199;

	@OriginalMember(owner = "client!hb", name = "Ng", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!hb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!ga;Ljava/lang/Integer;)Lclient!r;")
	public static Class12 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class12_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ow local9 = new ow();
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
			} else if ((local18.SrcBlendCaps & 0x10 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(179) D3DPRESENT_PARAMETERS local179 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static182.method3206(local3, local179, local5, arg3, local13)) {
					throw new RuntimeException("");
				}
				local179.EnableAutoDepthStencil = true;
				local179.Windowed = true;
				local179.PresentationInterval = Integer.MIN_VALUE;
				@Pc(204) int local204 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local204 |= 0x10;
				}
				@Pc(227) IDirect3DDevice local227;
				try {
					local227 = local13.a(local3, local5, arg0, local204 | 0x40, local179);
				} catch (@Pc(229) rm local229) {
					local227 = local13.a(local3, local5, arg0, local204 | 0x20, local179);
				}
				@Pc(248) Class126 local248 = new Class126(local227.b(0), local227.b());
				local1 = new Class12_Sub2_Sub1(local3, local5, arg0, local9, local13, local227, local248, local179, local18, arg1, arg2, arg3);
				local1.method6218();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(271) RuntimeException local271) {
			if (local1 != null) {
				local1.method6414();
			}
			throw local271;
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ow;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!gu;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!ga;I)V")
	public Class12_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ow arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class126 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface5 arg9, @OriginalArg(10) Class111 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anOw1 = arg3;
		this.anInt3710 = arg1;
		this.anInt3711 = arg0;
		this.aClass126_1 = arg6;
		this.anIDirect3DDevice1 = arg5;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anIDirect3D1 = arg4;
		this.aD3DCAPS1 = arg8;
		this.aD3DLIGHT3 = new D3DLIGHT(this.anOw1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.anOw1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.anOw1);
		this.aPixelBuffer1 = new PixelBuffer(this.anOw1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.anOw1);
		new GeometryBuffer(this.anOw1);
		this.anInt7533 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean537 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean300 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean303 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean301 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean544 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt7534 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean536 = this.anInt7525 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3711, this.anInt3710, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray8 = new boolean[this.anInt7533];
		this.aClass225Array1 = new Class225[this.anInt7533];
		this.aBooleanArray5 = new boolean[this.anInt7533];
		this.aBooleanArray6 = new boolean[this.anInt7533];
		this.anIntArray199 = new int[this.anInt7533];
		this.aBooleanArray7 = new boolean[this.anInt7533];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "(I)V")
	@Override
	protected void method6235() {
		this.anIDirect3DDevice1.a(27, this.aBoolean539);
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "(I)V")
	@Override
	protected void method6168() {
		if (Static539.aClass220_21 == this.aClass220_18) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass220_18 == Static256.aClass220_11) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static287.aClass220_14 == this.aClass220_18) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLclient!ed;B)V")
	@Override
	protected void method6255(@OriginalArg(0) int arg0, @OriginalArg(2) Class84 arg1) {
		@Pc(20) byte local20;
		if (arg0 == 1) {
			local20 = 6;
		} else if (arg0 == 2) {
			local20 = 27;
		} else {
			local20 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, local20, Static182.method3205(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "(I)V")
	@Override
	protected void method6230() {
		@Pc(17) float local17 = this.aBoolean534 ? this.aFloat193 : 0.0F;
		@Pc(26) float local26 = this.aBoolean534 ? -this.aFloat191 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local17 * this.aFloat183, local17 * this.aFloat197, local17 * this.aFloat195, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local26 * this.aFloat183, local26 * this.aFloat197, local26 * this.aFloat195, 0.0F);
		this.aBoolean302 = false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6265(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "()V")
	@Override
	public void method6425() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!um;I)V")
	@Override
	public void method6194(@OriginalArg(0) Class331 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6254() {
		this.method6230();
		this.method6246();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)Lclient!wr;")
	@Override
	public Interface24 method6176(@OriginalArg(0) boolean arg0) {
		return new Class286(this, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "()V")
	@Override
	public void method6440() {
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "(I)V")
	@Override
	protected void method6166() {
		this.anIDirect3DDevice1.a(137, this.aBoolean543 && !this.aBoolean535);
	}

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "(B)V")
	@Override
	protected void method6262() {
		this.anIDirect3DDevice1.a(174, this.aBoolean548);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(II)V")
	@Override
	public void method6247(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, 11, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "(I)V")
	@Override
	protected void method6281() {
		if (this.aClass296Array3[this.anInt7547] == Static146.aClass296_1) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, 24, 0);
			this.anIntArray199[this.anInt7547] = 0;
			return;
		}
		if (Static566.aClass296_6 == this.aClass296Array3[this.anInt7547]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7547 + 16, this.aClass209_Sub2Array3[this.anInt7547].method4927(Static182.aFloatArray35));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7547 + 16, this.aClass209_Sub2Array3[this.anInt7547].method4922(Static182.aFloatArray35));
		}
		@Pc(60) int local60 = Static182.method3214(this.aClass296Array3[this.anInt7547]);
		if (local60 != this.anIntArray199[this.anInt7547]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, 24, local60);
			this.anIntArray199[this.anInt7547] = local60;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII[BLclient!sk;)Lclient!dea;")
	@Override
	public Interface4 method6155(@OriginalArg(4) byte[] arg0, @OriginalArg(5) Class297 arg1) {
		return new Class186_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!sk;Lclient!vea;II)Lclient!gn;")
	@Override
	public Interface8 method6187(@OriginalArg(1) Class297 arg0, @OriginalArg(2) Class340 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class186_Sub1(this, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method6152(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		if (this.aCanvas10 != arg1) {
			return;
		}
		@Pc(10) Dimension local10 = arg1.getSize();
		if (local10.width > 0 && local10.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method3209();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!sk;IZIIBI[F)Lclient!gn;")
	@Override
	protected Interface8 method6203(@OriginalArg(0) Class297 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "()Z")
	@Override
	public boolean method6459() {
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIZ[[I)Lclient!jn;")
	@Override
	public Interface12 method6248(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class186_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "(I)Z")
	private boolean method3209() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(16) Class126 local16 = (Class126) this.anObject19;
			this.method6278();
			local16.method2710();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static182.method3206(this.anInt3711, this.aD3DPRESENT_PARAMETERS1, this.anInt3710, this.anInt7525, this.anIDirect3D1)) {
				@Pc(50) int local50 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (jc.a(-1, local50)) {
					local16.method2711(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.b(0));
					this.method6286();
					this.method6263();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ed;IZZ)V")
	@Override
	public void method6280(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) byte local11;
		if (arg0 == 1) {
			local11 = 3;
		} else if (arg0 == 2) {
			local11 = 26;
		} else {
			local11 = 2;
		}
		@Pc(19) int local19 = 0;
		if (arg3) {
			local19 = 32;
		}
		if (arg2) {
			local19 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, local11, local19 | Static182.method3205(arg1));
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!jb;I)V")
	@Override
	public void method6167(@OriginalArg(0) int arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static182.method3211(arg1), arg2, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6242() {
		this.anIDirect3DDevice1.a(7, this.aBoolean532);
	}

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "(I)V")
	@Override
	protected void method6250() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6400(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6416();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[Lclient!qp;)Lclient!um;")
	@Override
	public Class331 method6189(@OriginalArg(1) Class271[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(B)F")
	@Override
	protected float method6202() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "()Z")
	@Override
	public boolean method6451() {
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "(B)V")
	@Override
	protected void method6256() {
		if (this.aClass325_6.method7219()) {
			this.aClass209_Sub2_18.method4927(Static182.aFloatArray35);
		} else {
			Static182.aFloatArray35[4] = 0.0F;
			Static182.aFloatArray35[11] = 0.0F;
			Static182.aFloatArray35[7] = 0.0F;
			Static182.aFloatArray35[9] = 0.0F;
			Static182.aFloatArray35[8] = 0.0F;
			Static182.aFloatArray35[10] = 1.0F;
			Static182.aFloatArray35[5] = 1.0F;
			Static182.aFloatArray35[6] = 0.0F;
			Static182.aFloatArray35[3] = 0.0F;
			Static182.aFloatArray35[14] = 0.0F;
			Static182.aFloatArray35[0] = 1.0F;
			Static182.aFloatArray35[2] = 0.0F;
			Static182.aFloatArray35[12] = 0.0F;
			Static182.aFloatArray35[15] = 1.0F;
			Static182.aFloatArray35[13] = 0.0F;
			Static182.aFloatArray35[1] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static182.aFloatArray35);
	}

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "()V")
	@Override
	public void method6462() {
	}

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "(I)V")
	@Override
	protected void method6163() {
		this.anIDirect3DDevice1.a(14, this.aBoolean546 && this.aBoolean545);
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "()Lclient!aa;")
	@Override
	public Class2 method6419() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt3711, 0);
		return new Class2(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!hb", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6184(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(II)Lclient!ft;")
	@Override
	protected Class3 method6223(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class3_Sub2(this, this.aClass111_103);
		} else if (arg0 == 4) {
			return new Class3_Sub8(this, this.aClass111_103, this.aClass204_7);
		} else if (arg0 == 8) {
			return new Class3_Sub6(this, this.aClass111_103, this.aClass204_7);
		} else {
			return super.method6223(arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!wr;)V")
	@Override
	public void method6276(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1) {
		@Pc(2) Class286 local2 = (Class286) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method6522());
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "(I)V")
	@Override
	protected void method6258() {
		if (this.aBoolean527) {
			Static182.aFloatArray35[13] = 0.0F;
			Static182.aFloatArray35[10] = 1.0F;
			Static182.aFloatArray35[8] = 0.0F;
			Static182.aFloatArray35[6] = 0.0F;
			Static182.aFloatArray35[5] = 1.0F;
			Static182.aFloatArray35[1] = 0.0F;
			Static182.aFloatArray35[2] = 0.0F;
			Static182.aFloatArray35[11] = 0.0F;
			Static182.aFloatArray35[9] = 0.0F;
			Static182.aFloatArray35[7] = 0.0F;
			Static182.aFloatArray35[4] = 0.0F;
			Static182.aFloatArray35[14] = 0.0F;
			Static182.aFloatArray35[15] = 1.0F;
			Static182.aFloatArray35[0] = 1.0F;
			Static182.aFloatArray35[12] = 0.0F;
			Static182.aFloatArray35[3] = 0.0F;
		} else {
			this.aClass209_Sub2_15.method4927(Static182.aFloatArray35);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static182.aFloatArray35);
	}

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "(I)V")
	@Override
	protected void method6173() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat188 * this.aFloat183, this.aFloat197 * this.aFloat188, this.aFloat188 * this.aFloat195, (float) 0);
		this.aBoolean302 = false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!vw;)V")
	public void method3210(@OriginalArg(1) Class186_Sub3 arg0) {
		this.method3212(arg0);
		if (!this.aBooleanArray8[this.anInt7547]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 1, 1);
			this.aBooleanArray8[this.anInt7547] = true;
		}
		if (!this.aBooleanArray7[this.anInt7547]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 2, 1);
			this.aBooleanArray7[this.anInt7547] = true;
		}
	}

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "()V")
	@Override
	public void method6469() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (jc.a(-1, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) 125);
	}

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "(I)V")
	@Override
	protected void method6261() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7537);
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (jc.a(-1, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && jc.a(-1, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.b(local1, arg2 * local72, local72 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) 127);
		local16.a((byte) 125);
		return local1;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6182(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(Z)V")
	@Override
	public void method6171() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray62[0], -this.aFloatArray62[1], -this.aFloatArray62[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
		this.aBoolean302 = false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!sk;I[BZI)Lclient!gn;")
	@Override
	protected Interface8 method6283(@OriginalArg(0) int arg0, @OriginalArg(3) Class297 arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		return new Class186_Sub1(this, arg1, arg4, arg0, arg3, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "(B)V")
	@Override
	protected void method6222() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7543, this.anInt7522, this.anInt7363, this.anInt7472, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "(B)V")
	@Override
	protected void method6269() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7543 + this.anInt7531, this.anInt7522 + this.anInt7545, this.anInt7548, this.anInt7541);
	}

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "(I)V")
	@Override
	protected void method6210() {
		this.anIDirect3DDevice1.a(28, this.aBoolean528 && this.aBoolean533 && this.anInt7552 >= 0);
	}

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "(I)V")
	@Override
	protected void method6266() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray61);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ke;)V")
	public void method3212(@OriginalArg(1) Class186 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7547, arg0.method7670());
		if (this.aClass225Array1[this.anInt7547] != arg0.aClass225_11) {
			@Pc(69) int local69 = Static182.method3207(arg0.aClass225_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 6, local69);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 5, local69);
			this.aClass225Array1[this.anInt7547] = arg0.aClass225_11;
			if (this.aBooleanArray6[this.anInt7547] != arg0.aBoolean678) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 7, arg0.aBoolean678 ? Static182.method3207(arg0.aClass225_11) : 0);
				this.aBooleanArray6[this.anInt7547] = arg0.aBoolean678;
			}
		} else if (this.aBooleanArray6[this.anInt7547] != arg0.aBoolean678) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 7, arg0.aBoolean678 ? Static182.method3207(arg0.aClass225_11) : 0);
			this.aBooleanArray6[this.anInt7547] = arg0.aBoolean678;
		}
		if (!this.aBooleanArray5[this.anInt7547]) {
			this.aBooleanArray5[this.anInt7547] = true;
			this.method6174();
			this.method6188();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!it;Lclient!it;FLclient!it;)Lclient!it;")
	@Override
	public Class36 method6464(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "()V")
	@Override
	public void method6436() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!dn;)V")
	@Override
	public void method6157(@OriginalArg(1) Class74 arg0) {
		@Pc(5) int local5 = 0;
		if (Static499.aClass74_4 == arg0) {
			local5 = 65536;
		} else if (arg0 == Static167.aClass74_2) {
			local5 = 131072;
		} else if (Static361.aClass74_3 == arg0) {
			local5 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, 11, this.anInt7547 | local5);
	}

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "(B)V")
	@Override
	protected void method6246() {
		if (this.aBoolean302) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean302 = true;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6424(@OriginalArg(0) int arg0) {
		this.anOw1.b(-115);
		super.method6424(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!om;)V")
	public void method3213(@OriginalArg(1) Class186_Sub1 arg0) {
		this.method3212(arg0);
		if (arg0.aBoolean489 != this.aBooleanArray8[this.anInt7547]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 1, arg0.aBoolean489 ? 1 : 3);
			this.aBooleanArray8[this.anInt7547] = arg0.aBoolean489;
		}
		if (arg0.aBoolean488 != this.aBooleanArray7[this.anInt7547]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7547, 2, arg0.aBoolean488 ? 1 : 3);
			this.aBooleanArray7[this.anInt7547] = arg0.aBoolean488;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!vea;Lclient!sk;B)Z")
	@Override
	public boolean method6219(@OriginalArg(0) Class340 arg0, @OriginalArg(1) Class297 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return jc.a(-1, this.anIDirect3D1.a(this.anInt3711, local10)) && jc.a(-1, this.anIDirect3D1.CheckDeviceFormat(this.anInt3711, this.anInt3710, local10.Format, 0, 3, Static182.method3208(arg1, arg0)));
	}

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "(B)V")
	@Override
	protected void method6253() {
		this.aFloat186 = this.bf - this.anInt7520;
		this.aFloat194 = (float) -this.anInt7552 + this.aFloat186;
		if (this.aFloat194 < (float) this.anInt7532) {
			this.aFloat194 = this.anInt7532;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat194);
		this.anIDirect3DDevice1.a(37, this.aFloat186);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7555);
	}

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "(I)V")
	@Override
	protected void method6188() {
		@Pc(22) int local22 = this.aBooleanArray5[this.anInt7547] ? Static182.method3215(this.aClass108Array6[this.anInt7547]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, 1, local22);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6412(@OriginalArg(0) Class10 arg0) {
	}

	@OriginalMember(owner = "client!hb", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!kga;IILclient!jb;)V")
	@Override
	public void method6274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class165 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class348) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static182.method3211(arg5), 0, arg1, arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method6178(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass126_1 = (Class126) arg1;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6174() {
		@Pc(22) int local22 = this.aBooleanArray5[this.anInt7547] ? Static182.method3215(this.aClass108Array5[this.anInt7547]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7547, 4, local22);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!sk;Lclient!vea;I)Z")
	@Override
	public boolean method6279(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class340 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return jc.a(-1, this.anIDirect3D1.a(this.anInt3711, local10)) && jc.a(-1, this.anIDirect3D1.CheckDeviceFormat(this.anInt3711, this.anInt3710, local10.Format, 0, 4, Static182.method3208(arg0, arg1)));
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "()V")
	@Override
	public void method6416() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass126_1.method2708()) {
			this.anInt3709 = 0;
			if (jc.a(true, this.aClass126_1.method2709())) {
				this.method3209();
			}
		} else if (++this.anInt3709 <= 50) {
			this.method3209();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIZII)Lclient!gn;")
	@Override
	public Interface8 method6257(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		return new Class186_Sub1(this, arg5, arg3, arg4, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)V")
	@Override
	protected void method6156() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7519; local1++) {
			@Pc(10) Class1_Sub5 local10 = this.aClass1_Sub5Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method4165();
			@Pc(24) float local24 = local10.method4160() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method4159(), (float) local10.method4163(), (float) local10.method4158());
			this.aD3DLIGHT1.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, local24 * (float) (local18 >> 8 & 0xFF), local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method4162() * local10.method4162()));
			this.aD3DLIGHT1.SetRange((float) local10.method4162());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt7521 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6156();
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(IZ)Lclient!kga;")
	@Override
	public Interface13 method6193(@OriginalArg(1) boolean arg0) {
		return new Class348(this, Static554.aClass340_15, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "(I)V")
	@Override
	protected void method6252() {
		this.anIDirect3DDevice1.a(15, this.aBoolean547);
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "()V")
	@Override
	protected void method6414() {
		this.anOw1.a((byte) 105);
		super.method6414();
	}

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "(I)V")
	@Override
	protected void method6263() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7533; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass225Array1[local1] = Static195.aClass225_3;
			this.aBooleanArray8[local1] = this.aBooleanArray7[local1] = true;
			this.aBooleanArray6[local1] = false;
			this.anIntArray199[local1] = 0;
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
		this.aBoolean302 = false;
		super.method6263();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6272(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "(B)V")
	@Override
	protected void method6268() {
		if (this.aBooleanArray5[this.anInt7547]) {
			this.aBooleanArray5[this.anInt7547] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7547, null);
			this.method6174();
			this.method6188();
		}
	}
}
