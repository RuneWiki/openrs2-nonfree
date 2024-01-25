import jaclib.peer.k;
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
import jagdx.ow;
import jagdx.rj;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class133_Sub1_Sub1 extends Class133_Sub1 {

	@OriginalMember(owner = "client!hb", name = "ch", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!hb", name = "Ug", descriptor = "I")
	private int anInt3879 = 0;

	@OriginalMember(owner = "client!hb", name = "dh", descriptor = "Z")
	private boolean aBoolean285 = false;

	@OriginalMember(owner = "client!hb", name = "ih", descriptor = "Lclient!lga;")
	private Class212 aClass212_1;

	@OriginalMember(owner = "client!hb", name = "Wg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!hb", name = "bh", descriptor = "Lclient!jaclib/peer/k;")
	public final k aK1;

	@OriginalMember(owner = "client!hb", name = "eh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!hb", name = "Xg", descriptor = "I")
	private final int anInt3880;

	@OriginalMember(owner = "client!hb", name = "lh", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!hb", name = "Ng", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!hb", name = "Rg", descriptor = "I")
	private final int anInt3878;

	@OriginalMember(owner = "client!hb", name = "fh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!hb", name = "jh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!hb", name = "mh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!hb", name = "Qg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!hb", name = "Og", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!hb", name = "Pg", descriptor = "Z")
	public final boolean aBoolean282;

	@OriginalMember(owner = "client!hb", name = "ah", descriptor = "Z")
	public final boolean aBoolean284;

	@OriginalMember(owner = "client!hb", name = "Zg", descriptor = "Z")
	public final boolean aBoolean283;

	@OriginalMember(owner = "client!hb", name = "kh", descriptor = "[Lclient!gca;")
	private final Class116[] aClass116Array1;

	@OriginalMember(owner = "client!hb", name = "hh", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!hb", name = "gh", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hb", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!hb", name = "Tg", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!hb", name = "Mg", descriptor = "[I")
	private final int[] anIntArray190;

	@OriginalMember(owner = "client!hb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!la;Ljava/lang/Integer;)Lclient!ha;")
	private static Class133 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class133_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) k local9 = new k();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(173) D3DPRESENT_PARAMETERS local173 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static195.method3494(local3, local173, arg3, local5, local13)) {
					throw new RuntimeException("");
				}
				local173.PresentationInterval = Integer.MIN_VALUE;
				local173.EnableAutoDepthStencil = true;
				local173.Windowed = true;
				@Pc(198) int local198 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local198 |= 0x10;
				}
				@Pc(220) IDirect3DDevice local220;
				try {
					local220 = local13.a(local3, local5, arg0, local198 | 0x40, local173);
				} catch (@Pc(222) ow local222) {
					local220 = local13.a(local3, local5, arg0, local198 | 0x20, local173);
				}
				@Pc(241) Class212 local241 = new Class212(local220.b(0), local220.c());
				local1 = new Class133_Sub1_Sub1(local3, local5, arg0, local9, local13, local220, local241, local173, local18, arg1, arg2, arg3);
				local1.method6231();
				return local1;
			}
		} catch (@Pc(264) RuntimeException local264) {
			if (local1 != null) {
				local1.method7236();
			}
			throw local264;
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/k;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!lga;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!la;I)V")
	public Class133_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) k arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class212 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface3 arg9, @OriginalArg(10) Class207 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aClass212_1 = arg6;
			this.aD3DCAPS1 = arg8;
			this.aK1 = arg3;
			this.anIDirect3D1 = arg4;
			this.anInt3880 = arg1;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt3878 = arg0;
			this.aD3DLIGHT1 = new D3DLIGHT(this.aK1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aK1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aK1);
			this.aPixelBuffer1 = new PixelBuffer(this.aK1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aK1);
			new GeometryBuffer(this.aK1);
			this.aBoolean282 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean284 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.anInt6988 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt6984 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean478 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean283 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean477 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean484 = this.anInt6982 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3878, this.anInt3880, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aClass116Array1 = new Class116[this.anInt6988];
			this.aBooleanArray11 = new boolean[this.anInt6988];
			this.aBooleanArray10 = new boolean[this.anInt6988];
			this.aBooleanArray8 = new boolean[this.anInt6988];
			this.aBooleanArray9 = new boolean[this.anInt6988];
			this.anIntArray190 = new int[this.anInt6988];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(214) Throwable local214) {
			local214.printStackTrace();
			this.method7295();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hu;Lclient!wm;)Lclient!pea;")
	@Override
	public Interface16 method7288(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Interface27 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7321(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "(I)V")
	@Override
	protected void method6175() {
		@Pc(31) int local31 = this.aBooleanArray11[this.anInt6996] ? Static195.method3485(this.aClass151Array5[this.anInt6996]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, 4, local31);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	@Override
	protected void method6152() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6998, this.anInt7011, this.anInt6805, this.anInt6881, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!lw;I[BIIZ)Lclient!rm;")
	@Override
	protected Interface20 method6230(@OriginalArg(2) Class223 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4) {
		return new Class132_Sub1(this, arg0, arg1, arg3, arg4, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(ZI)Lclient!fb;")
	@Override
	public Interface6 method6196(@OriginalArg(0) boolean arg0) {
		return new Class112(this, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!lw;Lclient!al;)Z")
	@Override
	public boolean method6283(@OriginalArg(1) Class223 arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return rj.a(91, this.anIDirect3D1.a(this.anInt3878, local3)) && rj.a(112, this.anIDirect3D1.CheckDeviceFormat(this.anInt3878, this.anInt3880, local3.Format, 0, 4, Static195.method3493(arg0, arg1)));
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7239(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7282(arg2, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "(B)V")
	@Override
	protected void method6236() {
		this.method6245();
		this.method6219();
	}

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "(I)V")
	@Override
	protected void method6245() {
		@Pc(7) float local7 = this.aBoolean496 ? this.aFloat127 : 0.0F;
		@Pc(16) float local16 = this.aBoolean496 ? -this.aFloat124 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(local7 * this.aFloat126, local7 * this.aFloat119, local7 * this.aFloat132, (float) 0);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat126 * local16, this.aFloat119 * local16, local16 * this.aFloat132, 0.0F);
		this.aBoolean285 = false;
	}

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "(B)V")
	@Override
	protected void method6228() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat126 * this.aFloat129, this.aFloat119 * this.aFloat129, this.aFloat132 * this.aFloat129, 0.0F);
		this.aBoolean285 = false;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Lclient!hu;")
	@Override
	public Interface7 method7271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IZ)V")
	@Override
	public void method6260(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "(I)V")
	@Override
	public void method6224() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray57[0], -this.aFloatArray57[1], -this.aFloatArray57[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray50[0], -this.aFloatArray50[1], -this.aFloatArray50[2]);
		this.aBoolean285 = false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Lclient!bl;)Lclient!fk;")
	@Override
	public Class90 method6154(@OriginalArg(1) Class40[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hl;I)V")
	public void method3488(@OriginalArg(0) Class132_Sub1 arg0) {
		this.method3495(arg0);
		if (arg0.aBoolean301 != this.aBooleanArray9[this.anInt6996]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 1, arg0.aBoolean301 ? 1 : 3);
			this.aBooleanArray9[this.anInt6996] = arg0.aBoolean301;
		}
		if (arg0.aBoolean300 != this.aBooleanArray10[this.anInt6996]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 2, arg0.aBoolean300 ? 1 : 3);
			this.aBooleanArray10[this.anInt6996] = arg0.aBoolean300;
		}
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "(Z)V")
	@Override
	protected void method6210() {
		this.anIDirect3DDevice1.a(28, this.aBoolean491 && this.aBoolean493 && this.anInt7003 >= 0);
	}

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "(I)V")
	@Override
	protected void method6279() {
		@Pc(20) int local20 = this.aBooleanArray11[this.anInt6996] ? Static195.method3485(this.aClass151Array6[this.anInt6996]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, 1, local20);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	@Override
	public void method7234() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BBLclient!lw;III)Lclient!uc;")
	@Override
	public Interface23 method6270(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class223 arg1) {
		return new Class132_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ri;ZI)V")
	@Override
	public void method6266(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static195.method3486(arg1), arg2, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "()V")
	@Override
	public void method7268() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (rj.a(-80, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(false);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!jagdx/IDirect3DPixelShader;)V")
	public void method3489(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!al;Lclient!lw;)Z")
	@Override
	public boolean method6263(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class223 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return rj.a(-125, this.anIDirect3D1.a(this.anInt3878, local10)) && rj.a(110, this.anIDirect3D1.CheckDeviceFormat(this.anInt3878, this.anInt3880, local10.Format, 0, 3, Static195.method3493(arg1, arg0)));
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([[IBIZ)Lclient!qn;")
	@Override
	public Interface18 method6237(@OriginalArg(0) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return new Class132_Sub2(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!fb;II)V")
	@Override
	public void method6215(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class112 local2 = (Class112) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method2355());
	}

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "(I)V")
	@Override
	protected void method6249() {
		this.anIDirect3DDevice1.a(7, this.aBoolean492);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!mq;ZII)V")
	@Override
	protected void method6243(@OriginalArg(0) Class236 arg0, @OriginalArg(2) int arg1) {
		@Pc(22) byte local22;
		if (arg1 == 1) {
			local22 = 6;
		} else if (arg1 == 2) {
			local22 = 27;
		} else {
			local22 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, local22, Static195.method3487(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;Z)V")
	public void method3490(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader2 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method6192();
	}

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "(I)V")
	@Override
	protected void method6219() {
		if (this.aBoolean285) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!oq;ILclient!ri;I)V")
	@Override
	public void method6194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class303 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class102) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static195.method3486(arg5), 0, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.a(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (rj.a(110, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && rj.a(-34, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (local54 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
					this.aPixelBuffer1.a(local1, local71 * arg2, local71 * local54, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(false);
		local16.b(false);
		return local1;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7252(@OriginalArg(0) int arg0) {
		this.aK1.a(12002);
		super.method7252(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method6213(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6259(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!pea;)V")
	@Override
	public void method7322(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "()V")
	@Override
	public void method7267() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6223(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (arg1 != this.aCanvas15) {
			return;
		}
		@Pc(7) Dimension local7 = arg1.getSize();
		if (local7.width > 0 && local7.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method3496();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V")
	@Override
	protected void method6187() {
		this.anIDirect3DDevice1.a(14, this.aBoolean482 && this.aBoolean483);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!mq;ZZI)V")
	@Override
	public void method6222(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 3;
		} else if (arg0 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(27) int local27 = 0;
		if (arg3) {
			local27 = 32;
		}
		if (arg2) {
			local27 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, local13, Static195.method3487(arg1) | local27);
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "()V")
	@Override
	public void method7247() {
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "(B)V")
	@Override
	protected void method6233() {
		this.anIDirect3DDevice1.a(137, this.aBoolean479 && !this.aBoolean486);
	}

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "(I)V")
	@Override
	protected void method6272() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt6983; local5++) {
			@Pc(18) Class5_Sub11 local18 = this.aClass5_Sub11Array7[local5];
			@Pc(22) int local22 = local5 + 2;
			@Pc(26) int local26 = local18.method8102();
			@Pc(32) float local32 = local18.method8101() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local18.method8103(), (float) local18.method8096(), (float) local18.method8098());
			this.aD3DLIGHT3.SetDiffuse(local32 * (float) (local26 >> 16 & 0xFF), (float) (local26 >> 8 & 0xFF) * local32, (float) (local26 & 0xFF) * local32, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local18.method8099() * local18.method8099()));
			this.aD3DLIGHT3.SetRange((float) local18.method8099());
			this.anIDirect3DDevice1.SetLight(local22, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local22, true);
		}
		while (local5 < this.anInt6992) {
			this.anIDirect3DDevice1.LightEnable(local5 + 2, false);
			local5++;
		}
		super.method6272();
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(B)V")
	@Override
	protected void method6192() {
		if (this.anIDirect3DVertexShader2 != null || this.aClass373Array3[this.anInt6996] == Static255.aClass373_3) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, 24, 0);
			this.anIntArray190[this.anInt6996] = 0;
			return;
		}
		if (this.aClass373Array3[this.anInt6996] == Static337.aClass373_6) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6996 + 16, this.aClass113_Sub1Array3[this.anInt6996].method2455(Static195.aFloatArray22));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6996 + 16, this.aClass113_Sub1Array3[this.anInt6996].method2471(Static195.aFloatArray22));
		}
		@Pc(74) int local74 = Static195.method3484(this.aClass373Array3[this.anInt6996]);
		if (this.anIntArray190[this.anInt6996] != local74) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, 24, local74);
			this.anIntArray190[this.anInt6996] = local74;
		}
	}

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!lw;IILclient!al;I)Lclient!rm;")
	@Override
	public Interface20 method6275(@OriginalArg(0) Class223 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) int arg3) {
		return new Class132_Sub1(this, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "(I)V")
	@Override
	protected void method6203() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray52);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!fk;)V")
	@Override
	public void method6217(@OriginalArg(1) Class90 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "(I)V")
	@Override
	protected void method6193() {
		if (this.aClass242_5.method5447()) {
			this.aClass113_Sub1_18.method2471(Static195.aFloatArray22);
		} else {
			Static195.aFloatArray22[10] = 1.0F;
			Static195.aFloatArray22[11] = 0.0F;
			Static195.aFloatArray22[1] = 0.0F;
			Static195.aFloatArray22[2] = 0.0F;
			Static195.aFloatArray22[5] = 1.0F;
			Static195.aFloatArray22[7] = 0.0F;
			Static195.aFloatArray22[15] = 1.0F;
			Static195.aFloatArray22[12] = 0.0F;
			Static195.aFloatArray22[0] = 1.0F;
			Static195.aFloatArray22[3] = 0.0F;
			Static195.aFloatArray22[4] = 0.0F;
			Static195.aFloatArray22[14] = 0.0F;
			Static195.aFloatArray22[6] = 0.0F;
			Static195.aFloatArray22[13] = 0.0F;
			Static195.aFloatArray22[8] = 0.0F;
			Static195.aFloatArray22[9] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static195.aFloatArray22);
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "(B)V")
	@Override
	protected void method6232() {
		this.anIDirect3DDevice1.a(27, this.aBoolean489);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!vm;Lclient!vm;FLclient!vm;)Lclient!vm;")
	@Override
	public Class130 method7259(@OriginalArg(0) Class130 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class130 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "()V")
	@Override
	public void method7305() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([FIZILclient!lw;III)Lclient!rm;")
	@Override
	protected Interface20 method6274(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class223 arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "(I)V")
	@Override
	protected void method6234() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6987 + this.anInt6998, this.anInt7011 - -this.anInt6994, this.anInt6991, this.bf);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
	@Override
	protected void method6184() {
		if (this.aBoolean475) {
			Static195.aFloatArray22[13] = 0.0F;
			Static195.aFloatArray22[2] = 0.0F;
			Static195.aFloatArray22[15] = 1.0F;
			Static195.aFloatArray22[6] = 0.0F;
			Static195.aFloatArray22[7] = 0.0F;
			Static195.aFloatArray22[1] = 0.0F;
			Static195.aFloatArray22[11] = 0.0F;
			Static195.aFloatArray22[5] = 1.0F;
			Static195.aFloatArray22[4] = 0.0F;
			Static195.aFloatArray22[8] = 0.0F;
			Static195.aFloatArray22[3] = 0.0F;
			Static195.aFloatArray22[9] = 0.0F;
			Static195.aFloatArray22[0] = 1.0F;
			Static195.aFloatArray22[14] = 0.0F;
			Static195.aFloatArray22[12] = 0.0F;
			Static195.aFloatArray22[10] = 1.0F;
		} else {
			this.aClass113_Sub1_15.method2471(Static195.aFloatArray22);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static195.aFloatArray22);
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(II)Lclient!wm;")
	@Override
	public Interface27 method7313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!qg;)V")
	@Override
	public void method6218(@OriginalArg(1) Class286 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static399.aClass286_6) {
			local1 = 65536;
		} else if (Static122.aClass286_1 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static193.aClass286_9) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, 11, local1 | this.anInt6996);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)V")
	@Override
	public void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass212_1.method4814()) {
			this.anInt3879 = 0;
			if (rj.b(this.aClass212_1.method4815(), 4456)) {
				this.method3496();
			}
		} else if (++this.anInt3879 <= 50) {
			this.method3496();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "(I)V")
	@Override
	protected void method6229() {
		if (this.aClass32_7 == Static212.aClass32_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass32_7 == Static401.aClass32_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static262.aClass32_4 == this.aClass32_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6278(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "(I)F")
	@Override
	protected float method6214() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "()Z")
	@Override
	public boolean method7310() {
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!tfa;)V")
	public void method3492(@OriginalArg(1) Class132_Sub3 arg0) {
		this.method3495(arg0);
		if (!this.aBooleanArray9[this.anInt6996]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 1, 1);
			this.aBooleanArray9[this.anInt6996] = true;
		}
		if (!this.aBooleanArray10[this.anInt6996]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 2, 1);
			this.aBooleanArray10[this.anInt6996] = true;
		}
	}

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "(I)V")
	@Override
	protected void method6261() {
		this.anIDirect3DDevice1.a(174, this.aBoolean497);
	}

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "(I)V")
	@Override
	protected void method6201() {
		if (this.aBooleanArray11[this.anInt6996]) {
			this.aBooleanArray11[this.anInt6996] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6996, null);
			this.method6175();
			this.method6279();
		}
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(B)V")
	@Override
	protected void method6191() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6988; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass116Array1[local1] = Static415.aClass116_12;
			this.aBooleanArray9[local1] = this.aBooleanArray10[local1] = true;
			this.aBooleanArray8[local1] = false;
			this.anIntArray190[local1] = 0;
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
		this.aBoolean285 = false;
		super.method6191();
	}

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6209() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6990);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	@Override
	protected void method7236() {
		this.aK1.b(408);
		super.method7236();
	}

	@OriginalMember(owner = "client!hb", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "()Z")
	@Override
	public boolean method7319() {
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[IIIZ)Lclient!rm;")
	@Override
	public Interface20 method6269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		return new Class132_Sub1(this, arg4, arg1, arg5, arg3, 0, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!gw;)V")
	public void method3495(@OriginalArg(1) Class132 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6996, arg0.method7906());
		if (this.aClass116Array1[this.anInt6996] != arg0.aClass116_14) {
			@Pc(59) int local59 = Static195.method3491(arg0.aClass116_14);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 6, local59);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 5, local59);
			this.aClass116Array1[this.anInt6996] = arg0.aClass116_14;
			if (arg0.aBoolean665 != this.aBooleanArray8[this.anInt6996]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 7, arg0.aBoolean665 ? Static195.method3491(arg0.aClass116_14) : 0);
				this.aBooleanArray8[this.anInt6996] = arg0.aBoolean665;
			}
		} else if (arg0.aBoolean665 != this.aBooleanArray8[this.anInt6996]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6996, 7, arg0.aBoolean665 ? Static195.method3491(arg0.aClass116_14) : 0);
			this.aBooleanArray8[this.anInt6996] = arg0.aBoolean665;
		}
		if (!this.aBooleanArray11[this.anInt6996]) {
			this.aBooleanArray11[this.anInt6996] = true;
			this.method6175();
			this.method6279();
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(IZ)Lclient!oq;")
	@Override
	public Interface14 method6281(@OriginalArg(1) boolean arg0) {
		return new Class102(this, Static20.aClass19_5, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "(I)V")
	@Override
	protected void method6238() {
		this.anIDirect3DDevice1.a(15, this.aBoolean490);
	}

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "(I)Z")
	private boolean method3496() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(21) Class212 local21 = (Class212) this.anObject17;
			this.method6258();
			local21.method4816();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static195.method3494(this.anInt3878, this.aD3DPRESENT_PARAMETERS1, this.anInt6982, this.anInt3880, this.anIDirect3D1)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (rj.a(98, local55)) {
					local21.method4817(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method6250();
					this.method6191();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(B)V")
	@Override
	protected void method6216() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method6189(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass212_1 = (Class212) arg0;
	}

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "()Lclient!qm;")
	@Override
	public Class294 method7281() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt3878, 0);
		return new Class294(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "(I)V")
	@Override
	protected void method6205() {
		this.aFloat130 = this.anInt6985 - this.anInt7006;
		this.aFloat125 = this.aFloat130 - (float) this.anInt7003;
		if (this.aFloat125 < (float) this.anInt7002) {
			this.aFloat125 = this.anInt7002;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat125);
		this.anIDirect3DDevice1.a(37, this.aFloat130);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6997);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lclient!oca;")
	@Override
	protected Class27 method6188(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class27_Sub6(this, this.aClass207_81);
		} else if (arg0 == 4) {
			return new Class27_Sub2(this, this.aClass207_81, this.aClass250_5);
		} else if (arg0 == 8) {
			return new Class27_Sub11(this, this.aClass207_81, this.aClass250_5);
		} else {
			return super.method6188(arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(II)V")
	@Override
	public void method6167(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6996, 11, arg0);
	}
}
