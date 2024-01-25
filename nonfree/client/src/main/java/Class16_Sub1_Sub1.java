import jaclib.peer.mba;
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
import jagdx.pl;
import jagdx.rn;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class16_Sub1_Sub1 extends Class16_Sub1 {

	@OriginalMember(owner = "client!aia", name = "Hg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!aia", name = "Mg", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!aia", name = "Zg", descriptor = "I")
	private int anInt662 = 0;

	@OriginalMember(owner = "client!aia", name = "gh", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!aia", name = "Rg", descriptor = "Lclient!jaclib/peer/mba;")
	public final mba aMba1;

	@OriginalMember(owner = "client!aia", name = "Lg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!aia", name = "fh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!aia", name = "Xg", descriptor = "I")
	private final int anInt661;

	@OriginalMember(owner = "client!aia", name = "Jg", descriptor = "I")
	private final int anInt660;

	@OriginalMember(owner = "client!aia", name = "Sg", descriptor = "Lclient!sb;")
	private Class316 aClass316_1;

	@OriginalMember(owner = "client!aia", name = "Tg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!aia", name = "ch", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!aia", name = "Yg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!aia", name = "Ig", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!aia", name = "hh", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!aia", name = "Qg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!aia", name = "Kg", descriptor = "Z")
	public final boolean aBoolean61;

	@OriginalMember(owner = "client!aia", name = "Og", descriptor = "Z")
	public final boolean aBoolean63;

	@OriginalMember(owner = "client!aia", name = "Pg", descriptor = "Z")
	public final boolean aBoolean64;

	@OriginalMember(owner = "client!aia", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!aia", name = "dh", descriptor = "[Lclient!ws;")
	private final Class395[] aClass395Array1;

	@OriginalMember(owner = "client!aia", name = "Ug", descriptor = "[I")
	private final int[] anIntArray10;

	@OriginalMember(owner = "client!aia", name = "Ng", descriptor = "[Z")
	private final boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!aia", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!aia", name = "Gg", descriptor = "[Z")
	private final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!aia", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!gj;Ljava/lang/Integer;)Lclient!ha;")
	private static Class16 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class16_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) mba local9 = new mba();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(179) D3DPRESENT_PARAMETERS local179 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static16.method683(local3, arg3, local13, local5, local179)) {
					throw new RuntimeException("");
				}
				local179.PresentationInterval = Integer.MIN_VALUE;
				local179.EnableAutoDepthStencil = true;
				local179.Windowed = true;
				@Pc(205) int local205 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local205 |= 0x10;
				}
				@Pc(227) IDirect3DDevice local227;
				try {
					local227 = local13.a(local3, local5, arg0, local205 | 0x40, local179);
				} catch (@Pc(229) pl local229) {
					local227 = local13.a(local3, local5, arg0, local205 | 0x20, local179);
				}
				@Pc(248) Class316 local248 = new Class316(local227.b(0), local227.c());
				local1 = new Class16_Sub1_Sub1(local3, local5, arg0, local9, local13, local227, local248, local179, local18, arg1, arg2, arg3);
				local1.method6220();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(271) RuntimeException local271) {
			if (local1 != null) {
				local1.method8163();
			}
			throw local271;
		}
	}

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/mba;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!sb;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!gj;I)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) mba arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class316 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface5 arg9, @OriginalArg(10) Class143 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anIDirect3DDevice1 = arg5;
			this.aMba1 = arg3;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anIDirect3D1 = arg4;
			this.anInt661 = arg0;
			this.anInt660 = arg1;
			this.aClass316_1 = arg6;
			this.aD3DCAPS1 = arg8;
			this.aD3DLIGHT3 = new D3DLIGHT(this.aMba1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aMba1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aMba1);
			this.aPixelBuffer1 = new PixelBuffer(this.aMba1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aMba1);
			new GeometryBuffer(this.aMba1);
			this.aBoolean61 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.anInt7473 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean63 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean558 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean563 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean64 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt7465 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean561 = this.anInt7440 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt661, this.anInt660, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray4 = new boolean[this.anInt7465];
			this.aClass395Array1 = new Class395[this.anInt7465];
			this.anIntArray10 = new int[this.anInt7465];
			this.aBooleanArray2 = new boolean[this.anInt7465];
			this.aBooleanArray3 = new boolean[this.anInt7465];
			this.aBooleanArray1 = new boolean[this.anInt7465];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(218) Throwable local218) {
			local218.printStackTrace();
			this.method8199();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "()V")
	@Override
	protected void method8163() {
		this.aMba1.b((byte) 99);
		super.method8163();
	}

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "(I)V")
	@Override
	protected void method6214() {
		this.method6250();
		this.method6296();
	}

	@OriginalMember(owner = "client!aia", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!gh;Lclient!oq;)Lclient!el;")
	@Override
	public Interface8 method8166(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Interface19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILclient!so;ZLclient!ul;)Lclient!gl;")
	@Override
	public Interface11 method6300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(4) Class361 arg3) {
		return new Class80_Sub3(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6229() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7454 + this.anInt7472, this.anInt7461 + this.anInt7469, this.anInt7453, this.anInt7475);
	}

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "()V")
	@Override
	public void method8138() {
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)F")
	@Override
	protected float method6201() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!mp;)V")
	public void method682(@OriginalArg(1) Class80_Sub1 arg0) {
		this.method693(arg0);
		if (!this.aBooleanArray3[this.anInt7448]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 1, 1);
			this.aBooleanArray3[this.anInt7448] = true;
		}
		if (!this.aBooleanArray4[this.anInt7448]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 2, 1);
			this.aBooleanArray4[this.anInt7448] = true;
		}
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "()V")
	@Override
	public void method8127() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (rn.a(local3.Issue(), -98)) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(-6517);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6245(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "(B)V")
	@Override
	protected void method6215() {
		@Pc(15) int local15 = this.aBooleanArray2[this.anInt7448] ? Static16.method685(this.aClass11Array5[this.anInt7448]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, 1, local15);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I[Lclient!ug;)Lclient!wp;")
	@Override
	public Class277 method6271(@OriginalArg(1) Class355[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(ZI)Lclient!ta;")
	@Override
	public Interface22 method6262(@OriginalArg(0) boolean arg0) {
		return new Class79(this, Static553.aClass330_15, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!jda;IIZ)V")
	@Override
	protected void method6303(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte local13;
		if (arg1 == 1) {
			local13 = 6;
		} else if (arg1 == 2) {
			local13 = 27;
		} else {
			local13 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, local13, Static16.method686(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!aia", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!el;)V")
	@Override
	public void method8152(@OriginalArg(0) Interface8 arg0) {
	}

	@OriginalMember(owner = "client!aia", name = "U", descriptor = "(I)V")
	@Override
	protected void method6304() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7471; local1++) {
			@Pc(14) Class3_Sub7 local14 = this.aClass3_Sub7Array5[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method6351();
			@Pc(28) float local28 = local14.method6352() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method6348(), (float) local14.method6346(), (float) local14.method6343());
			this.aD3DLIGHT1.SetDiffuse(local28 * (float) (local22 >> 16 & 0xFF), local28 * (float) (local22 >> 8 & 0xFF), local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method6349() * local14.method6349()));
			this.aD3DLIGHT1.SetRange((float) local14.method6349());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt7445 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6304();
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!wp;)V")
	@Override
	public void method6287(@OriginalArg(1) Class277 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!aia", name = "V", descriptor = "(I)V")
	@Override
	protected void method6309() {
		if (this.anIDirect3DVertexShader1 != null || this.aClass20Array3[this.anInt7448] == Static226.aClass20_7) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, 24, 0);
			this.anIntArray10[this.anInt7448] = 0;
			return;
		}
		if (Static523.aClass20_6 == this.aClass20Array3[this.anInt7448]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7448 + 16, this.aClass25_Sub3Array3[this.anInt7448].method4321(Static16.aFloatArray20));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7448 + 16, this.aClass25_Sub3Array3[this.anInt7448].method4325(Static16.aFloatArray20));
		}
		@Pc(58) int local58 = Static16.method689(this.aClass20Array3[this.anInt7448]);
		if (this.anIntArray10[this.anInt7448] != local58) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, 24, local58);
			this.anIntArray10[this.anInt7448] = local58;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
	@Override
	protected void method6194() {
		this.anIDirect3DDevice1.a(14, this.aBoolean565 && this.aBoolean556);
	}

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "()Z")
	@Override
	public boolean method8186() {
		return false;
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6305(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!ta;Lclient!bo;BIII)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) Interface22 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class79) arg1).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static16.method684(arg2), 0, arg4, arg0, arg5, arg3);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!en;Lclient!en;FLclient!en;)Lclient!en;")
	@Override
	public Class106 method8158(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IBZ[[I)Lclient!pj;")
	@Override
	public Interface20 method6258(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class80_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!bl;B)V")
	@Override
	public void method6282(@OriginalArg(0) Class41 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 == Static95.aClass41_1) {
			local10 = 65536;
		} else if (arg0 == Static233.aClass41_3) {
			local10 = 131072;
		} else if (arg0 == Static383.aClass41_4) {
			local10 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, 11, this.anInt7448 | local10);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!jagdx/IDirect3DPixelShader;)V")
	public void method687(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZIBII[I)Lclient!gl;")
	@Override
	public Interface11 method6285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		return new Class80_Sub3(this, arg0, arg3, arg1, arg5, 0, arg4);
	}

	@OriginalMember(owner = "client!aia", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (rn.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), -105) && rn.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), -73)) {
			local1 = new int[arg2 * arg3];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.b(local1, arg2 * local72, local55 * local72, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(-6517);
		local16.a(-6517);
		return local1;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6252(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(III[FZIILclient!ul;)Lclient!gl;")
	@Override
	protected Interface11 method6240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) Class361 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!jda;ZIZI)V")
	@Override
	public void method6277(@OriginalArg(0) Class188 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
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
		if (arg3) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, local14, Static16.method686(arg0) | local1);
	}

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "()V")
	@Override
	public void method8172() {
	}

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "(II)Lclient!mr;")
	@Override
	protected Class60 method6231(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class60_Sub6(this, this.aClass143_105);
		} else if (arg0 == 4) {
			return new Class60_Sub11(this, this.aClass143_105, this.aClass367_5);
		} else if (arg0 == 8) {
			return new Class60_Sub9(this, this.aClass143_105, this.aClass367_5);
		} else {
			return super.method6231(arg0);
		}
	}

	@OriginalMember(owner = "client!aia", name = "db", descriptor = "(I)V")
	@Override
	protected void method6325() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7454, this.anInt7461, this.anInt7431, this.anInt7430, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8174(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8175(arg2, arg3);
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(B)V")
	@Override
	protected void method6205() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat157 * this.aFloat161, this.aFloat159 * this.aFloat157, this.aFloat163 * this.aFloat157, 0.0F);
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!so;ZLclient!ul;)Z")
	@Override
	public boolean method6292(@OriginalArg(0) Class330 arg0, @OriginalArg(2) Class361 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return rn.a(this.anIDirect3D1.a(this.anInt661, local10), -77) && rn.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt661, this.anInt660, local10.Format, 0, 3, Static16.method688(arg1, arg0)), -81);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!ul;BLclient!so;)Z")
	@Override
	public boolean method6204(@OriginalArg(0) Class361 arg0, @OriginalArg(2) Class330 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return rn.a(this.anIDirect3D1.a(this.anInt661, local8), -77) && rn.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt661, this.anInt660, local8.Format, 0, 4, Static16.method688(arg0, arg1)), -117);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILclient!bo;I)V")
	@Override
	public void method6320(@OriginalArg(1) int arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static16.method684(arg1), arg2, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "(B)V")
	@Override
	protected void method6280() {
		this.anIDirect3DDevice1.a(15, this.aBoolean562);
	}

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "(B)V")
	@Override
	protected void method6321() {
		if (Static463.aClass393_6 == this.aClass393_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static667.aClass393_8 == this.aClass393_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass393_5 == Static660.aClass393_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6238() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7470);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!ww;)V")
	public void method690(@OriginalArg(1) Class80_Sub3 arg0) {
		this.method693(arg0);
		if (this.aBooleanArray3[this.anInt7448] != arg0.aBoolean766) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 1, arg0.aBoolean766 ? 1 : 3);
			this.aBooleanArray3[this.anInt7448] = arg0.aBoolean766;
		}
		if (this.aBooleanArray4[this.anInt7448] != arg0.aBoolean765) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 2, arg0.aBoolean765 ? 1 : 3);
			this.aBooleanArray4[this.anInt7448] = arg0.aBoolean765;
		}
	}

	@OriginalMember(owner = "client!aia", name = "Y", descriptor = "(I)V")
	@Override
	protected void method6312() {
		if (this.aBoolean546) {
			Static16.aFloatArray20[10] = 1.0F;
			Static16.aFloatArray20[12] = 0.0F;
			Static16.aFloatArray20[9] = 0.0F;
			Static16.aFloatArray20[1] = 0.0F;
			Static16.aFloatArray20[15] = 1.0F;
			Static16.aFloatArray20[3] = 0.0F;
			Static16.aFloatArray20[13] = 0.0F;
			Static16.aFloatArray20[0] = 1.0F;
			Static16.aFloatArray20[14] = 0.0F;
			Static16.aFloatArray20[2] = 0.0F;
			Static16.aFloatArray20[8] = 0.0F;
			Static16.aFloatArray20[4] = 0.0F;
			Static16.aFloatArray20[5] = 1.0F;
			Static16.aFloatArray20[11] = 0.0F;
			Static16.aFloatArray20[7] = 0.0F;
			Static16.aFloatArray20[6] = 0.0F;
		} else {
			this.aClass25_Sub3_15.method4325(Static16.aFloatArray20);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static16.aFloatArray20);
	}

	@OriginalMember(owner = "client!aia", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!aia", name = "Z", descriptor = "(I)V")
	@Override
	protected void method6313() {
		if (this.aBooleanArray2[this.anInt7448]) {
			this.aBooleanArray2[this.anInt7448] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7448, (IDirect3DBaseTexture) null);
			this.method6237();
			this.method6215();
		}
	}

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "(I)V")
	@Override
	protected void method6219() {
		this.anIDirect3DDevice1.a(28, this.aBoolean547 && this.aBoolean554 && this.anInt7457 >= 0);
	}

	@OriginalMember(owner = "client!aia", name = "B", descriptor = "(I)V")
	@Override
	protected void method6242() {
		this.anIDirect3DDevice1.a(174, this.aBoolean566);
	}

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "()Z")
	@Override
	public boolean method8181() {
		return false;
	}

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "(B)V")
	@Override
	protected void method6211() {
		this.anIDirect3DDevice1.a(27, this.aBoolean549);
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(II)Lclient!gh;")
	@Override
	public Interface10 method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aia", name = "I", descriptor = "(I)V")
	@Override
	protected void method6268() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray52);
	}

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "(B)V")
	@Override
	protected void method6249() {
		this.anIDirect3DDevice1.a(137, this.aBoolean564 && !this.aBoolean559);
	}

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "(I)V")
	@Override
	protected void method6200() {
		this.anIDirect3DDevice1.a(7, this.aBoolean560);
	}

	@OriginalMember(owner = "client!aia", name = "eb", descriptor = "(I)Z")
	private boolean method691() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(17) Class316 local17 = (Class316) this.anObject12;
			this.method6261();
			local17.method7426();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static16.method683(this.anInt661, this.anInt7440, this.anIDirect3D1, this.anInt660, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(53) int local53 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (rn.a(local53, -61)) {
					local17.method7429(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method6247();
					this.method6195();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aia", name = "q", descriptor = "(I)V")
	@Override
	protected void method6218() {
		this.aFloat165 = (float) (this.anInt7451 - this.anInt7455);
		this.aFloat162 = this.aFloat165 - (float) this.anInt7457;
		if (this.aFloat162 < (float) this.anInt7443) {
			this.aFloat162 = (float) this.anInt7443;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat162);
		this.anIDirect3DDevice1.a(37, this.aFloat165);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7449);
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(I)V")
	@Override
	protected void method6195() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7465; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass395Array1[local1] = Static193.aClass395_14;
			this.aBooleanArray3[local1] = this.aBooleanArray4[local1] = true;
			this.aBooleanArray1[local1] = false;
			this.anIntArray10[local1] = 0;
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
		this.aBoolean62 = false;
		super.method6195();
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;B)V")
	public void method692(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method6309();
	}

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "(B)V")
	@Override
	protected void method6250() {
		@Pc(12) float local12 = this.aBoolean550 ? this.aFloat164 : 0.0F;
		@Pc(21) float local21 = this.aBoolean550 ? -this.aFloat166 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local12 * this.aFloat161, this.aFloat159 * local12, this.aFloat163 * local12, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local21 * this.aFloat161, local21 * this.aFloat159, local21 * this.aFloat163, 0.0F);
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)V")
	@Override
	public void method6278(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, 11, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(IZ)Lclient!mha;")
	@Override
	public Interface16 method6244(@OriginalArg(1) boolean arg0) {
		return new Class8(this, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I[BILclient!ul;II)Lclient!vga;")
	@Override
	public Interface24 method6298(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class361 arg1) {
		return new Class80_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!dj;)V")
	public void method693(@OriginalArg(1) Class80 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7448, arg0.method8757());
		if (this.aClass395Array1[this.anInt7448] != arg0.aClass395_15) {
			@Pc(54) int local54 = Static16.method694(arg0.aClass395_15);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 6, local54);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 5, local54);
			this.aClass395Array1[this.anInt7448] = arg0.aClass395_15;
			if (this.aBooleanArray1[this.anInt7448] != arg0.aBoolean764) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 7, arg0.aBoolean764 ? Static16.method694(arg0.aClass395_15) : 0);
				this.aBooleanArray1[this.anInt7448] = arg0.aBoolean764;
			}
		} else if (this.aBooleanArray1[this.anInt7448] != arg0.aBoolean764) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7448, 7, arg0.aBoolean764 ? Static16.method694(arg0.aClass395_15) : 0);
			this.aBooleanArray1[this.anInt7448] = arg0.aBoolean764;
		}
		if (!this.aBooleanArray2[this.anInt7448]) {
			this.aBooleanArray2[this.anInt7448] = true;
			this.method6237();
			this.method6215();
		}
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)Lclient!oq;")
	@Override
	public Interface19 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aia", name = "x", descriptor = "()Lclient!aja;")
	@Override
	public Class18 method8193() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt661, 0);
		return new Class18(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IBLclient!mha;)V")
	@Override
	public void method6257(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1) {
		@Pc(6) Class8 local6 = (Class8) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local6.anIDirect3DVertexBuffer1, 0, local6.method86());
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6269(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas7 != arg0) {
			return;
		}
		@Pc(11) Dimension local11 = arg0.getSize();
		if (local11.width > 0 && local11.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method691();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V")
	@Override
	public void method8125(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "()V")
	@Override
	public void method8189() {
	}

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "(B)V")
	@Override
	public void method6223() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray57[0], -this.aFloatArray57[1], -this.aFloatArray57[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray58[0], -this.aFloatArray58[1], -this.aFloatArray58[2]);
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(II)V")
	@Override
	public void method8175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass316_1.method7428()) {
			this.anInt662 = 0;
			if (rn.b(this.aClass316_1.method7427(), -18558)) {
				this.method691();
			}
		} else if (++this.anInt662 <= 50) {
			this.method691();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!aia", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6232(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8121(@OriginalArg(0) int arg0) {
		this.aMba1.a(false);
		super.method8121(arg0);
	}

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "()V")
	@Override
	public void method8167() {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6270(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass316_1 = (Class316) arg0;
	}

	@OriginalMember(owner = "client!aia", name = "A", descriptor = "(I)V")
	@Override
	protected void method6237() {
		@Pc(23) int local23 = this.aBooleanArray2[this.anInt7448] ? Static16.method685(this.aClass11Array6[this.anInt7448]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7448, 4, local23);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "([BZILclient!ul;IIII)Lclient!gl;")
	@Override
	protected Interface11 method6253(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class361 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		return new Class80_Sub3(this, arg2, arg3, arg4, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "(I)V")
	@Override
	protected void method6210() {
	}

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "(B)V")
	@Override
	protected void method6296() {
		if (this.aBoolean62) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "(B)V")
	@Override
	protected void method6316() {
		if (this.aClass7_3.method69()) {
			this.aClass25_Sub3_18.method4325(Static16.aFloatArray20);
		} else {
			Static16.aFloatArray20[0] = 1.0F;
			Static16.aFloatArray20[12] = 0.0F;
			Static16.aFloatArray20[10] = 1.0F;
			Static16.aFloatArray20[9] = 0.0F;
			Static16.aFloatArray20[3] = 0.0F;
			Static16.aFloatArray20[4] = 0.0F;
			Static16.aFloatArray20[13] = 0.0F;
			Static16.aFloatArray20[11] = 0.0F;
			Static16.aFloatArray20[14] = 0.0F;
			Static16.aFloatArray20[5] = 1.0F;
			Static16.aFloatArray20[1] = 0.0F;
			Static16.aFloatArray20[6] = 0.0F;
			Static16.aFloatArray20[15] = 1.0F;
			Static16.aFloatArray20[7] = 0.0F;
			Static16.aFloatArray20[8] = 0.0F;
			Static16.aFloatArray20[2] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static16.aFloatArray20);
	}
}
