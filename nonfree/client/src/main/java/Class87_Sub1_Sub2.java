import jaclib.peer.wf;
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
import jagdx.ln;
import jagdx.op;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class87_Sub1_Sub2 extends Class87_Sub1 {

	@OriginalMember(owner = "client!lt", name = "Xg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!lt", name = "hh", descriptor = "I")
	private int anInt6157 = 0;

	@OriginalMember(owner = "client!lt", name = "Zg", descriptor = "Z")
	private boolean aBoolean466 = false;

	@OriginalMember(owner = "client!lt", name = "Vg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!lt", name = "lh", descriptor = "Lclient!jaclib/peer/wf;")
	public final wf aWf1;

	@OriginalMember(owner = "client!lt", name = "gh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!lt", name = "Pg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!lt", name = "eh", descriptor = "I")
	private final int anInt6156;

	@OriginalMember(owner = "client!lt", name = "Wg", descriptor = "Lclient!gk;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!lt", name = "bh", descriptor = "I")
	private final int anInt6155;

	@OriginalMember(owner = "client!lt", name = "Yg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!lt", name = "kh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!lt", name = "ih", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!lt", name = "Og", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!lt", name = "mh", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!lt", name = "jh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!lt", name = "ch", descriptor = "Z")
	public final boolean aBoolean467;

	@OriginalMember(owner = "client!lt", name = "Ng", descriptor = "Z")
	public final boolean aBoolean465;

	@OriginalMember(owner = "client!lt", name = "dh", descriptor = "Z")
	public final boolean aBoolean468;

	@OriginalMember(owner = "client!lt", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!lt", name = "nh", descriptor = "[Lclient!qt;")
	private final Class283[] aClass283Array1;

	@OriginalMember(owner = "client!lt", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!lt", name = "Qg", descriptor = "[I")
	private final int[] anIntArray404;

	@OriginalMember(owner = "client!lt", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!lt", name = "ah", descriptor = "[Z")
	private final boolean[] aBooleanArray37;

	@OriginalMember(owner = "client!lt", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!eq;Ljava/lang/Integer;)Lclient!ha;")
	public static Class87 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class87_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) wf local9 = new wf();
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
			} else if ((local18.DestBlendCaps & 0x10 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(180) D3DPRESENT_PARAMETERS local180 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static332.method5163(local13, local5, arg3, local180, local3)) {
					throw new RuntimeException("");
				}
				local180.EnableAutoDepthStencil = true;
				local180.PresentationInterval = Integer.MIN_VALUE;
				local180.Windowed = true;
				@Pc(205) int local205 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local205 |= 0x10;
				}
				@Pc(227) IDirect3DDevice local227;
				try {
					local227 = local13.a(local3, local5, arg0, local205 | 0x40, local180);
				} catch (@Pc(229) ln local229) {
					local227 = local13.a(local3, local5, arg0, local205 | 0x20, local180);
				}
				@Pc(248) Class132 local248 = new Class132(local227.d(0), local227.b());
				local1 = new Class87_Sub1_Sub2(local3, local5, arg0, local9, local13, local227, local248, local180, local18, arg1, arg2, arg3);
				local1.method5151();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(271) RuntimeException local271) {
			if (local1 != null) {
				local1.method7970();
			}
			throw local271;
		}
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/wf;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!gk;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!eq;I)V")
	public Class87_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) wf arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class132 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface6 arg9, @OriginalArg(10) Class97 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anIDirect3DDevice1 = arg5;
		this.aWf1 = arg3;
		this.anIDirect3D1 = arg4;
		this.aD3DCAPS1 = arg8;
		this.anInt6156 = arg1;
		this.aClass132_1 = arg6;
		this.anInt6155 = arg0;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aD3DLIGHT3 = new D3DLIGHT(this.aWf1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aWf1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aWf1);
		this.aPixelBuffer1 = new PixelBuffer(this.aWf1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aWf1);
		new GeometryBuffer(this.aWf1);
		this.aBoolean445 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean467 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean453 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean465 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.anInt6148 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.anInt6151 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean468 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean450 = this.anInt6141 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt6155, this.anInt6156, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray35 = new boolean[this.anInt6151];
		this.aClass283Array1 = new Class283[this.anInt6151];
		this.aBooleanArray34 = new boolean[this.anInt6151];
		this.anIntArray404 = new int[this.anInt6151];
		this.aBooleanArray36 = new boolean[this.anInt6151];
		this.aBooleanArray37 = new boolean[this.anInt6151];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!lt", name = "T", descriptor = "(I)V")
	@Override
	protected void method5122() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat137 * this.aFloat140, this.aFloat140 * this.aFloat147, this.aFloat148 * this.aFloat140, 0.0F);
		this.aBoolean466 = false;
	}

	@OriginalMember(owner = "client!lt", name = "C", descriptor = "(B)Z")
	private boolean method5154() {
		@Pc(10) int local10 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local10 == 0 || local10 == -2005530519) {
			@Pc(21) Class132 local21 = (Class132) this.anObject11;
			this.method5076();
			local21.method3321();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static332.method5163(this.anIDirect3D1, this.anInt6156, this.anInt6141, this.aD3DPRESENT_PARAMETERS1, this.anInt6155)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (op.a(local55, (byte) -100)) {
					local21.method3320(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.d(0));
					this.method5039();
					this.method5042();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!tr;)V")
	public void method5155(@OriginalArg(1) Class16_Sub2 arg0) {
		this.method5164(arg0);
		if (!this.aBooleanArray35[this.anInt6114]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 1, 1);
			this.aBooleanArray35[this.anInt6114] = true;
		}
		if (!this.aBooleanArray34[this.anInt6114]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 2, 1);
			this.aBooleanArray34[this.anInt6114] = true;
		}
	}

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "(I)V")
	@Override
	protected void method5033() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6135; local1++) {
			@Pc(10) Class2_Sub4 local10 = this.aClass2_Sub4Array3[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method8152();
			@Pc(24) float local24 = local10.method8156() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method8150(), (float) local10.method8158(), (float) local10.method8151());
			this.aD3DLIGHT1.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method8154() * local10.method8154()));
			this.aD3DLIGHT1.SetRange((float) local10.method8154());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt6143 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5033();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method5156(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!sfa;Lclient!sfa;FLclient!sfa;)Lclient!sfa;")
	@Override
	public Class22 method7923(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class22 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Lclient!vi;")
	@Override
	public Interface25 method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7918(@OriginalArg(0) int arg0) {
		this.aWf1.a((byte) 98);
		super.method7918(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "(II)V")
	@Override
	public void method5065(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, 11, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "(Z)F")
	@Override
	protected float method5142() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "()Lclient!sia;")
	@Override
	public Class306 method7942() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt6155, 0);
		return new Class306(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;B)V")
	public void method5157(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method5026();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)Lclient!dw;")
	@Override
	protected Class74 method5094(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class74_Sub5(this, this.aClass97_86);
		} else if (arg0 == 4) {
			return new Class74_Sub8(this, this.aClass97_86, this.aClass378_6);
		} else if (arg0 == 8) {
			return new Class74_Sub2(this, this.aClass97_86, this.aClass378_6);
		} else {
			return super.method5094(arg0);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLclient!cv;)V")
	@Override
	public void method5021(@OriginalArg(1) Class62 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static577.aClass62_4) {
			local1 = 65536;
		} else if (arg0 == Static322.aClass62_3) {
			local1 = 131072;
		} else if (Static261.aClass62_1 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, 11, local1 | this.anInt6114);
	}

	@OriginalMember(owner = "client!lt", name = "O", descriptor = "(I)V")
	@Override
	protected void method5105() {
		this.aFloat145 = this.anInt6127 - this.anInt6137;
		this.aFloat143 = this.aFloat145 - (float) this.anInt6122;
		if (this.aFloat143 < (float) this.anInt6146) {
			this.aFloat143 = this.anInt6146;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat143);
		this.anIDirect3DDevice1.a(37, this.aFloat145);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6149);
	}

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "()Z")
	@Override
	public boolean method7955() {
		return false;
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "(II)Lclient!c;")
	@Override
	public Interface2 method7973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "()Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIILclient!kca;I[BZI)Lclient!wda;")
	@Override
	protected Interface26 method5103(@OriginalArg(3) Class187 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		return new Class16_Sub3(this, arg0, arg4, arg1, arg3, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!kca;IBI[BI)Lclient!ii;")
	@Override
	public Interface11 method5056(@OriginalArg(0) Class187 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class16_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[Lclient!ofa;)Lclient!hi;")
	@Override
	public Class147 method5083(@OriginalArg(1) Class241[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLclient!ti;Lclient!kca;)Z")
	@Override
	public boolean method5137(@OriginalArg(1) Class324 arg0, @OriginalArg(2) Class187 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return op.a(this.anIDirect3D1.a(this.anInt6155, local10), (byte) -109) && op.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt6155, this.anInt6156, local10.Format, 0, 4, Static332.method5160(arg0, arg1)), (byte) -124);
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "()V")
	@Override
	public void method7895() {
	}

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "(B)V")
	@Override
	protected void method5035() {
		this.anIDirect3DDevice1.a(7, this.aBoolean452);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5078(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
	@Override
	public void method5018() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray52[0], -this.aFloatArray52[1], -this.aFloatArray52[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray44[0], -this.aFloatArray44[1], -this.aFloatArray44[2]);
		this.aBoolean466 = false;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IZ)Lclient!ida;")
	@Override
	public Interface10 method5087(@OriginalArg(1) boolean arg0) {
		return new Class257(this, Static545.aClass324_13, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZBILclient!taa;)V")
	@Override
	public void method5052(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class315 arg3) {
		@Pc(20) byte local20;
		if (arg2 == 1) {
			local20 = 3;
		} else if (arg2 == 2) {
			local20 = 26;
		} else {
			local20 = 2;
		}
		@Pc(28) int local28 = 0;
		if (arg1) {
			local28 = 32;
		}
		if (arg0) {
			local28 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, local20, local28 | Static332.method5159(arg3));
	}

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "(B)V")
	@Override
	protected void method5048() {
		if (this.aClass308_8.method7333()) {
			this.aClass6_Sub2_18.method2715(Static332.aFloatArray53);
		} else {
			Static332.aFloatArray53[3] = 0.0F;
			Static332.aFloatArray53[2] = 0.0F;
			Static332.aFloatArray53[5] = 1.0F;
			Static332.aFloatArray53[6] = 0.0F;
			Static332.aFloatArray53[4] = 0.0F;
			Static332.aFloatArray53[11] = 0.0F;
			Static332.aFloatArray53[10] = 1.0F;
			Static332.aFloatArray53[9] = 0.0F;
			Static332.aFloatArray53[15] = 1.0F;
			Static332.aFloatArray53[8] = 0.0F;
			Static332.aFloatArray53[13] = 0.0F;
			Static332.aFloatArray53[14] = 0.0F;
			Static332.aFloatArray53[0] = 1.0F;
			Static332.aFloatArray53[12] = 0.0F;
			Static332.aFloatArray53[7] = 0.0F;
			Static332.aFloatArray53[1] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static332.aFloatArray53);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method5144(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass132_1 = (Class132) arg1;
	}

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "()V")
	@Override
	public void method7919() {
	}

	@OriginalMember(owner = "client!lt", name = "A", descriptor = "()V")
	@Override
	protected void method7970() {
		this.aWf1.b((byte) 112);
		super.method7970();
	}

	@OriginalMember(owner = "client!lt", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5053(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "(I)V")
	@Override
	protected void method5037() {
		this.anIDirect3DDevice1.a(174, this.aBoolean464);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "()V")
	@Override
	public void method7893() {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([FIIZIILclient!kca;I)Lclient!wda;")
	@Override
	protected Interface26 method5102(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class187 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!ut;Z)V")
	public void method5161(@OriginalArg(0) Class16_Sub3 arg0) {
		this.method5164(arg0);
		if (this.aBooleanArray35[this.anInt6114] != arg0.aBoolean695) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 1, arg0.aBoolean695 ? 1 : 3);
			this.aBooleanArray35[this.anInt6114] = arg0.aBoolean695;
		}
		if (arg0.aBoolean694 != this.aBooleanArray34[this.anInt6114]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 2, arg0.aBoolean694 ? 1 : 3);
			this.aBooleanArray34[this.anInt6114] = arg0.aBoolean694;
		}
	}

	@OriginalMember(owner = "client!lt", name = "Y", descriptor = "(I)V")
	@Override
	protected void method5134() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6145, this.anInt6152, this.anInt5936, this.anInt6075, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7963(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7907(arg2, arg3);
	}

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "()V")
	@Override
	public void method7940() {
	}

	@OriginalMember(owner = "client!lt", name = "J", descriptor = "(I)V")
	@Override
	protected void method5096() {
		if (this.aBoolean466) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean466 = true;
	}

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "(I)V")
	@Override
	protected void method5058() {
		if (this.aBooleanArray37[this.anInt6114]) {
			this.aBooleanArray37[this.anInt6114] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6114, null);
			this.method5069();
			this.method5086();
		}
	}

	@OriginalMember(owner = "client!lt", name = "bb", descriptor = "(I)V")
	@Override
	protected void method5145() {
		if (this.aBoolean443) {
			Static332.aFloatArray53[2] = 0.0F;
			Static332.aFloatArray53[6] = 0.0F;
			Static332.aFloatArray53[0] = 1.0F;
			Static332.aFloatArray53[15] = 1.0F;
			Static332.aFloatArray53[12] = 0.0F;
			Static332.aFloatArray53[4] = 0.0F;
			Static332.aFloatArray53[13] = 0.0F;
			Static332.aFloatArray53[5] = 1.0F;
			Static332.aFloatArray53[9] = 0.0F;
			Static332.aFloatArray53[1] = 0.0F;
			Static332.aFloatArray53[7] = 0.0F;
			Static332.aFloatArray53[14] = 0.0F;
			Static332.aFloatArray53[10] = 1.0F;
			Static332.aFloatArray53[3] = 0.0F;
			Static332.aFloatArray53[8] = 0.0F;
			Static332.aFloatArray53[11] = 0.0F;
		} else {
			this.aClass6_Sub2_15.method2715(Static332.aFloatArray53);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static332.aFloatArray53);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZIZ[[I)Lclient!saa;")
	@Override
	public Interface22 method5150(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class16_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5028(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5097(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas8 != arg1) {
			return;
		}
		@Pc(6) Dimension local6 = arg1.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method5154();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!kca;Lclient!ti;II)Lclient!wda;")
	@Override
	public Interface26 method5149(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(4) int arg3) {
		return new Class16_Sub3(this, arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!lt", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!caa;II)V")
	@Override
	public void method5148(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class216 local8 = (Class216) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local8.anIDirect3DVertexBuffer1, 0, local8.method5250());
	}

	@OriginalMember(owner = "client!lt", name = "cb", descriptor = "(I)V")
	@Override
	protected void method5146() {
		this.anIDirect3DDevice1.a(28, this.aBoolean448 && this.aBoolean463 && this.anInt6122 >= 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!ai;I)V")
	public void method5164(@OriginalArg(0) Class16 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6114, arg0.method8047());
		if (arg0.aClass283_11 != this.aClass283Array1[this.anInt6114]) {
			@Pc(21) int local21 = Static332.method5158(arg0.aClass283_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 5, local21);
			this.aClass283Array1[this.anInt6114] = arg0.aClass283_11;
			if (arg0.aBoolean693 != this.aBooleanArray36[this.anInt6114]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 7, arg0.aBoolean693 ? Static332.method5158(arg0.aClass283_11) : 0);
				this.aBooleanArray36[this.anInt6114] = arg0.aBoolean693;
			}
		} else if (this.aBooleanArray36[this.anInt6114] != arg0.aBoolean693) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6114, 7, arg0.aBoolean693 ? Static332.method5158(arg0.aClass283_11) : 0);
			this.aBooleanArray36[this.anInt6114] = arg0.aBoolean693;
		}
		if (!this.aBooleanArray37[this.anInt6114]) {
			this.aBooleanArray37[this.anInt6114] = true;
			this.method5069();
			this.method5086();
		}
	}

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "(I)V")
	@Override
	protected void method5092() {
		this.method5046();
		this.method5096();
	}

	@OriginalMember(owner = "client!lt", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (op.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (byte) -101) && op.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), (byte) -97)) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(62) int local62 = 0; local62 < arg3; local62++) {
					this.aPixelBuffer1.b(local1, local62 * arg2, local55 * local62, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(30216);
		local16.b(30216);
		return local1;
	}

	@OriginalMember(owner = "client!lt", name = "G", descriptor = "(I)V")
	@Override
	protected void method5086() {
		@Pc(15) int local15 = this.aBooleanArray37[this.anInt6114] ? Static332.method5166(this.aClass300Array6[this.anInt6114]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, 1, local15);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!taa;ZI)V")
	@Override
	protected void method5029(@OriginalArg(1) Class315 arg0, @OriginalArg(3) int arg1) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 6;
		} else if (arg1 == 2) {
			local12 = 27;
		} else {
			local12 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, local12, Static332.method5159(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!ida;BILclient!uf;I)V")
	@Override
	public void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class334 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class257) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static332.method5162(arg4), 0, arg5, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "(B)V")
	@Override
	protected void method5026() {
		if (this.anIDirect3DVertexShader7 != null || this.aClass108Array3[this.anInt6114] == Static190.aClass108_25) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, 24, 0);
			this.anIntArray404[this.anInt6114] = 0;
			return;
		}
		if (this.aClass108Array3[this.anInt6114] == Static446.aClass108_21) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6114 + 16, this.aClass6_Sub2Array3[this.anInt6114].method2715(Static332.aFloatArray53));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6114 + 16, this.aClass6_Sub2Array3[this.anInt6114].method2720(Static332.aFloatArray53));
		}
		@Pc(74) int local74 = Static332.method5165(this.aClass108Array3[this.anInt6114]);
		if (local74 != this.anIntArray404[this.anInt6114]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, 24, local74);
			this.anIntArray404[this.anInt6114] = local74;
		}
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(B)V")
	@Override
	protected void method5025() {
		if (Static85.aClass94_1 == this.aClass94_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass94_4 == Static340.aClass94_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass94_4 == Static474.aClass94_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!uf;III)V")
	@Override
	public void method5090(@OriginalArg(0) Class334 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static332.method5162(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "(B)V")
	@Override
	protected void method5109() {
		this.anIDirect3DDevice1.a(27, this.aBoolean459);
	}

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "()V")
	@Override
	public void method7937() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (op.a(local3.Issue(), (byte) -127)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(30216);
	}

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "(B)V")
	@Override
	protected void method5073() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6117);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)V")
	@Override
	public void method7916(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!ti;Lclient!kca;)Z")
	@Override
	public boolean method5091(@OriginalArg(1) Class324 arg0, @OriginalArg(2) Class187 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return op.a(this.anIDirect3D1.a(this.anInt6155, local9), (byte) -122) && op.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt6155, this.anInt6156, local9.Format, 0, 3, Static332.method5160(arg0, arg1)), (byte) -98);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III[IZIZ)Lclient!wda;")
	@Override
	public Interface26 method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		return new Class16_Sub3(this, arg2, arg5, arg4, arg3, 0, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "C", descriptor = "(I)V")
	@Override
	protected void method5069() {
		@Pc(21) int local21 = this.aBooleanArray37[this.anInt6114] ? Static332.method5166(this.aClass300Array5[this.anInt6114]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6114, 4, local21);
	}

	@OriginalMember(owner = "client!lt", name = "Z", descriptor = "(I)V")
	@Override
	protected void method5138() {
		this.anIDirect3DDevice1.a(14, this.aBoolean451 && this.aBoolean447);
	}

	@OriginalMember(owner = "client!lt", name = "F", descriptor = "(I)V")
	@Override
	protected void method5077() {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BZ)Lclient!caa;")
	@Override
	public Interface3 method5043(@OriginalArg(1) boolean arg0) {
		return new Class216(this, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7945(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "(I)V")
	@Override
	protected void method5031() {
		this.anIDirect3DDevice1.a(137, this.aBoolean455 && !this.aBoolean449);
	}

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "(B)V")
	@Override
	protected void method5080() {
		this.anIDirect3DDevice1.a(15, this.aBoolean462);
	}

	@OriginalMember(owner = "client!lt", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method5074(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "s", descriptor = "(B)V")
	@Override
	protected void method5084() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6119 + this.anInt6145, this.anInt6140 + this.anInt6152, this.anInt6142, this.anInt6115);
	}

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "(B)V")
	@Override
	protected void method5046() {
		@Pc(7) float local7 = this.aBoolean444 ? this.aFloat144 : 0.0F;
		@Pc(16) float local16 = this.aBoolean444 ? -this.aFloat134 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat137, this.aFloat147 * local7, local7 * this.aFloat148, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local16 * this.aFloat137, local16 * this.aFloat147, local16 * this.aFloat148, 0.0F);
		this.aBoolean466 = false;
	}

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "(I)V")
	@Override
	protected void method5042() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6151; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass283Array1[local1] = Static494.aClass283_8;
			this.aBooleanArray35[local1] = this.aBooleanArray34[local1] = true;
			this.aBooleanArray36[local1] = false;
			this.anIntArray404[local1] = 0;
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
		this.aBoolean466 = false;
		super.method5042();
	}

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "(B)V")
	@Override
	protected void method5032() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray48);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!uaa;)V")
	@Override
	public void method7949(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)V")
	@Override
	public void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass132_1.method3322()) {
			this.anInt6157 = 0;
			if (op.a((byte) -41, this.aClass132_1.method3323())) {
				this.method5154();
			}
		} else if (++this.anInt6157 <= 50) {
			this.method5154();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!hi;Z)V")
	@Override
	public void method5110(@OriginalArg(0) Class147 arg0) {
		@Pc(7) dxVertexLayout local7 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local7.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!c;Lclient!vi;)Lclient!uaa;")
	@Override
	public Interface24 method7900(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}
}
