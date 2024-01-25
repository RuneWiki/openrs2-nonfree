import jaclib.peer.ku;
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
import jagdx.bl;
import jagdx.pp;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class33_Sub1_Sub2 extends Class33_Sub1 {

	@OriginalMember(owner = "client!cu", name = "Ug", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!cu", name = "Ng", descriptor = "I")
	private int anInt2199 = 0;

	@OriginalMember(owner = "client!cu", name = "Hg", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!cu", name = "Xg", descriptor = "I")
	private final int anInt2201;

	@OriginalMember(owner = "client!cu", name = "Sg", descriptor = "I")
	private final int anInt2200;

	@OriginalMember(owner = "client!cu", name = "Jg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!cu", name = "ah", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!cu", name = "Mg", descriptor = "Lclient!jaclib/peer/ku;")
	public final ku aKu1;

	@OriginalMember(owner = "client!cu", name = "ch", descriptor = "Lclient!sk;")
	private Class309 aClass309_1;

	@OriginalMember(owner = "client!cu", name = "Lg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!cu", name = "Og", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!cu", name = "Qg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!cu", name = "dh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!cu", name = "Gg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!cu", name = "Kg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!cu", name = "Eg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!cu", name = "Dg", descriptor = "Z")
	public final boolean aBoolean186;

	@OriginalMember(owner = "client!cu", name = "Tg", descriptor = "Z")
	public final boolean aBoolean189;

	@OriginalMember(owner = "client!cu", name = "Fg", descriptor = "Z")
	public final boolean aBoolean187;

	@OriginalMember(owner = "client!cu", name = "Pg", descriptor = "[I")
	private final int[] anIntArray79;

	@OriginalMember(owner = "client!cu", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!cu", name = "Zg", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!cu", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!cu", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!cu", name = "bh", descriptor = "[Lclient!bba;")
	private final Class26[] aClass26Array1;

	@OriginalMember(owner = "client!cu", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!kha;Ljava/lang/Integer;)Lclient!ha;")
	private static Class33 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class33_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ku local9 = new ku();
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
			} else if ((local18.SrcBlendCaps & 0x10 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(183) D3DPRESENT_PARAMETERS local183 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static80.method2128(local183, local5, local13, arg3, local3)) {
					throw new RuntimeException("");
				}
				local183.PresentationInterval = Integer.MIN_VALUE;
				local183.Windowed = true;
				local183.EnableAutoDepthStencil = true;
				@Pc(209) int local209 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local209 |= 0x10;
				}
				@Pc(231) IDirect3DDevice local231;
				try {
					local231 = local13.a(local3, local5, arg0, local209 | 0x40, local183);
				} catch (@Pc(233) bl local233) {
					local231 = local13.a(local3, local5, arg0, local209 | 0x20, local183);
				}
				@Pc(252) Class309 local252 = new Class309(local231.d(0), local231.c());
				local1 = new Class33_Sub1_Sub2(local3, local5, arg0, local9, local13, local231, local252, local183, local18, arg1, arg2, arg3);
				local1.method2116();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(275) RuntimeException local275) {
			if (local1 != null) {
				local1.method6224();
			}
			throw local275;
		}
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ku;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!sk;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!kha;I)V")
	public Class33_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ku arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class309 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface5 arg9, @OriginalArg(10) Class181 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt2201 = arg0;
			this.anInt2200 = arg1;
			this.aD3DCAPS1 = arg8;
			this.anIDirect3D1 = arg4;
			this.aKu1 = arg3;
			this.aClass309_1 = arg6;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aKu1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aKu1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aKu1);
			this.aPixelBuffer1 = new PixelBuffer(this.aKu1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aKu1);
			new GeometryBuffer(this.aKu1);
			this.aBoolean176 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean179 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean186 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt2173 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean189 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.anInt2163 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
			this.aBoolean187 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean172 = this.anInt2171 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt2201, this.anInt2200, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.anIntArray79 = new int[this.anInt2173];
			this.aBooleanArray6 = new boolean[this.anInt2173];
			this.aBooleanArray7 = new boolean[this.anInt2173];
			this.aBooleanArray4 = new boolean[this.anInt2173];
			this.aBooleanArray5 = new boolean[this.anInt2173];
			this.aClass26Array1 = new Class26[this.anInt2173];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(222) Throwable local222) {
			local222.printStackTrace();
			this.method6151();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cu", name = "M", descriptor = "(I)V")
	@Override
	protected void method2100() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt2194 + this.anInt2182, this.anInt2169 + this.anInt2192, this.anInt2168, this.anInt2172);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIBLclient!em;[BI)Lclient!ob;")
	@Override
	public Interface17 method2009(@OriginalArg(3) Class82 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class13_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "()Z")
	@Override
	public boolean method6185() {
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z[Lclient!it;)Lclient!mia;")
	@Override
	public Class34 method2090(@OriginalArg(1) Class151[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method6201(@OriginalArg(0) int arg0) {
		this.aKu1.a((int) 21348);
		super.method6201(arg0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!pea;Lclient!st;)Lclient!mk;")
	@Override
	public Interface16 method6211(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!jagdx/IDirect3DVertexShader;)V")
	public void method2119(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method2027();
	}

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "()V")
	@Override
	public void method6181() {
	}

	@OriginalMember(owner = "client!cu", name = "Q", descriptor = "(I)V")
	@Override
	protected void method2109() {
		if (this.aBoolean165) {
			Static80.aFloatArray35[1] = 0.0F;
			Static80.aFloatArray35[7] = 0.0F;
			Static80.aFloatArray35[2] = 0.0F;
			Static80.aFloatArray35[6] = 0.0F;
			Static80.aFloatArray35[0] = 1.0F;
			Static80.aFloatArray35[12] = 0.0F;
			Static80.aFloatArray35[14] = 0.0F;
			Static80.aFloatArray35[10] = 1.0F;
			Static80.aFloatArray35[3] = 0.0F;
			Static80.aFloatArray35[15] = 1.0F;
			Static80.aFloatArray35[11] = 0.0F;
			Static80.aFloatArray35[13] = 0.0F;
			Static80.aFloatArray35[8] = 0.0F;
			Static80.aFloatArray35[4] = 0.0F;
			Static80.aFloatArray35[9] = 0.0F;
			Static80.aFloatArray35[5] = 1.0F;
		} else {
			this.aClass47_Sub3_15.method7902(Static80.aFloatArray35);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static80.aFloatArray35);
	}

	@OriginalMember(owner = "client!cu", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (pp.a(false, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && pp.a(false, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
					this.aPixelBuffer1.a(local1, arg2 * local77, local77 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(126);
		local16.b(126);
		return local1;
	}

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "(B)V")
	@Override
	protected void method2027() {
		if (this.anIDirect3DVertexShader1 != null || this.aClass180Array3[this.anInt2164] == Static259.aClass180_5) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, 24, 0);
			this.anIntArray79[this.anInt2164] = 0;
			return;
		}
		if (this.aClass180Array3[this.anInt2164] == Static235.aClass180_4) {
			this.anIDirect3DDevice1.SetTransform(this.anInt2164 + 16, this.aClass47_Sub3Array3[this.anInt2164].method7885(Static80.aFloatArray35));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt2164 + 16, this.aClass47_Sub3Array3[this.anInt2164].method7902(Static80.aFloatArray35));
		}
		@Pc(58) int local58 = Static80.method2125(this.aClass180Array3[this.anInt2164]);
		if (this.anIntArray79[this.anInt2164] != local58) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, 24, local58);
			this.anIntArray79[this.anInt2164] = local58;
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III[IZII)Lclient!baa;")
	@Override
	public Interface2 method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class13_Sub1(this, arg1, arg0, arg3, arg2, 0, arg5);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!aga;)V")
	public void method2120(@OriginalArg(1) Class13_Sub1 arg0) {
		this.method2130(arg0);
		if (arg0.aBoolean7 != this.aBooleanArray4[this.anInt2164]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 1, arg0.aBoolean7 ? 1 : 3);
			this.aBooleanArray4[this.anInt2164] = arg0.aBoolean7;
		}
		if (arg0.aBoolean8 != this.aBooleanArray7[this.anInt2164]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 2, arg0.aBoolean8 ? 1 : 3);
			this.aBooleanArray7[this.anInt2164] = arg0.aBoolean8;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ[BILclient!em;III)Lclient!baa;")
	@Override
	protected Interface2 method2063(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4) {
		return new Class13_Sub1(this, arg4, arg3, arg0, arg1, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(B)V")
	@Override
	protected void method2006() {
		this.anIDirect3DDevice1.a(28, this.aBoolean175 && this.bf && this.anInt2170 >= 0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIIZ[FILclient!em;I)Lclient!baa;")
	@Override
	protected Interface2 method1994(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) float[] arg2, @OriginalArg(6) Class82 arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(II)V")
	@Override
	public void method2075(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, 11, arg0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)Lclient!ru;")
	@Override
	public Interface23 method1998(@OriginalArg(0) boolean arg0) {
		return new Class87(this, Static137.aClass89_9, arg0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method6194(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "(Z)V")
	@Override
	protected void method2110() {
		this.anIDirect3DDevice1.a(174, this.aBoolean185);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZIZILclient!wga;)V")
	@Override
	public void method1988(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class371 arg3) {
		@Pc(1) int local1 = 0;
		@Pc(22) byte local22;
		if (arg1 == 1) {
			local22 = 3;
		} else if (arg1 == 2) {
			local22 = 26;
		} else {
			local22 = 2;
		}
		if (arg2) {
			local1 = 32;
		}
		if (arg0) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, local22, Static80.method2124(arg3) | local1);
	}

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "(I)V")
	@Override
	protected void method2043() {
		if (this.aBoolean188) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean188 = true;
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "()V")
	@Override
	public void method6173() {
	}

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "(I)V")
	@Override
	protected void method2047() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat85 * this.aFloat69, this.aFloat85 * this.aFloat71, this.aFloat85 * this.aFloat77, (float) 0);
		this.aBoolean188 = false;
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "()V")
	@Override
	public void method6177() {
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(Z)V")
	@Override
	public void method6228(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "(B)V")
	@Override
	protected void method2066() {
		if (this.aClass171_4.method4947()) {
			this.aClass47_Sub3_18.method7902(Static80.aFloatArray35);
		} else {
			Static80.aFloatArray35[4] = 0.0F;
			Static80.aFloatArray35[7] = 0.0F;
			Static80.aFloatArray35[0] = 1.0F;
			Static80.aFloatArray35[15] = 1.0F;
			Static80.aFloatArray35[9] = 0.0F;
			Static80.aFloatArray35[8] = 0.0F;
			Static80.aFloatArray35[5] = 1.0F;
			Static80.aFloatArray35[2] = 0.0F;
			Static80.aFloatArray35[6] = 0.0F;
			Static80.aFloatArray35[11] = 0.0F;
			Static80.aFloatArray35[14] = 0.0F;
			Static80.aFloatArray35[1] = 0.0F;
			Static80.aFloatArray35[12] = 0.0F;
			Static80.aFloatArray35[13] = 0.0F;
			Static80.aFloatArray35[10] = 1.0F;
			Static80.aFloatArray35[3] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static80.aFloatArray35);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!sea;IB)V")
	@Override
	public void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static80.method2118(arg1), arg2, arg0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;B)V")
	public void method2122(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!cu", name = "E", descriptor = "(I)V")
	@Override
	protected void method2059() {
		@Pc(29) int local29 = this.aBooleanArray5[this.anInt2164] ? Static80.method2121(this.aClass363Array6[this.anInt2164]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, 1, local29);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)V")
	@Override
	protected void method1989() {
		@Pc(7) float local7 = this.aBoolean178 ? this.aFloat84 : 0.0F;
		@Pc(20) float local20 = this.aBoolean178 ? -this.aFloat79 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local7 * this.aFloat69, local7 * this.aFloat71, this.aFloat77 * local7, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat69 * local20, this.aFloat71 * local20, local20 * this.aFloat77, 0.0F);
		this.aBoolean188 = false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!eca;B)V")
	public void method2123(@OriginalArg(0) Class13_Sub2 arg0) {
		this.method2130(arg0);
		if (!this.aBooleanArray4[this.anInt2164]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 1, 1);
			this.aBooleanArray4[this.anInt2164] = true;
		}
		if (!this.aBooleanArray7[this.anInt2164]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 2, 1);
			this.aBooleanArray7[this.anInt2164] = true;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method2113(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass309_1 = (Class309) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "(B)V")
	@Override
	protected void method2068() {
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!aca;B)V")
	@Override
	public void method2087(@OriginalArg(0) Class6 arg0) {
		@Pc(9) int local9 = 0;
		if (arg0 == Static48.aClass6_3) {
			local9 = 65536;
		} else if (arg0 == Static312.aClass6_13) {
			local9 = 131072;
		} else if (arg0 == Static149.aClass6_7) {
			local9 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, 11, this.anInt2164 | local9);
	}

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "(B)V")
	@Override
	protected void method2074() {
		this.aFloat73 = this.anInt2183 - this.anInt2197;
		this.aFloat81 = this.aFloat73 - (float) this.anInt2170;
		if ((float) this.anInt2161 > this.aFloat81) {
			this.aFloat81 = this.anInt2161;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat81);
		this.anIDirect3DDevice1.a(37, this.aFloat73);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt2166);
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(B)V")
	@Override
	protected void method1999() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2173; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass26Array1[local1] = Static229.aClass26_6;
			this.aBooleanArray4[local1] = this.aBooleanArray7[local1] = true;
			this.aBooleanArray6[local1] = false;
			this.anIntArray79[local1] = 0;
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
		this.aBoolean188 = false;
		super.method1999();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ[[IZ)Lclient!sq;")
	@Override
	public Interface24 method2035(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class13_Sub3(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "()V")
	@Override
	protected void method6224() {
		this.aKu1.a((byte) 125);
		super.method6224();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!tj;Lclient!tj;FLclient!tj;)Lclient!tj;")
	@Override
	public Class4 method6222(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class4 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "(B)V")
	@Override
	protected void method2073() {
		this.anIDirect3DDevice1.a(14, this.aBoolean184 && this.aBoolean170);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!u;BI)V")
	@Override
	public void method2046(@OriginalArg(0) Interface26 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class219 local2 = (Class219) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method5813());
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ew;BLclient!em;)Z")
	@Override
	public boolean method2007(@OriginalArg(0) Class89 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return pp.a(false, this.anIDirect3D1.a(this.anInt2201, local3)) && pp.a(false, this.anIDirect3D1.CheckDeviceFormat(this.anInt2201, this.anInt2200, local3.Format, 0, 3, Static80.method2127(arg0, arg1)));
	}

	@OriginalMember(owner = "client!cu", name = "J", descriptor = "(I)V")
	@Override
	public void method2089() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray29[0], -this.aFloatArray29[1], -this.aFloatArray29[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray27[0], -this.aFloatArray27[1], -this.aFloatArray27[2]);
		this.aBoolean188 = false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!em;ILclient!ew;ZI)Lclient!baa;")
	@Override
	public Interface2 method2083(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(4) int arg3) {
		return new Class13_Sub1(this, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "()V")
	@Override
	public void method6178() {
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(II)V")
	@Override
	public void method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass309_1.method7457()) {
			this.anInt2199 = 0;
			if (pp.a(this.aClass309_1.method7460(), -126)) {
				this.method2126();
			}
		} else if (++this.anInt2199 <= 50) {
			this.method2126();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "(B)V")
	@Override
	protected void method2067() {
		@Pc(21) int local21 = this.aBooleanArray5[this.anInt2164] ? Static80.method2121(this.aClass363Array5[this.anInt2164]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, 4, local21);
	}

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "(I)V")
	@Override
	protected void method2037() {
		if (this.aBooleanArray5[this.anInt2164]) {
			this.aBooleanArray5[this.anInt2164] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt2164, null);
			this.method2067();
			this.method2059();
		}
	}

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "(Z)Z")
	private boolean method2126() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(19) Class309 local19 = (Class309) this.anObject7;
			this.method2111();
			local19.method7459();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static80.method2128(this.aD3DPRESENT_PARAMETERS1, this.anInt2200, this.anIDirect3D1, this.anInt2171, this.anInt2201)) {
				@Pc(52) int local52 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (pp.a(false, local52)) {
					local19.method7458(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.d(0));
					this.method2094();
					this.method1999();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "(I)V")
	@Override
	protected void method2001() {
		this.anIDirect3DDevice1.a(27, this.aBoolean180);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6229(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6217(arg2, arg3);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	@Override
	protected void method1985(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!cu", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method2060(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas6 != arg0) {
			return;
		}
		@Pc(20) Dimension local20 = arg0.getSize();
		if (local20.width > 0 && local20.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method2126();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!sea;BIILclient!ru;I)V")
	@Override
	public void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface23 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class87) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static80.method2118(arg1), 0, arg0, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "()Z")
	@Override
	public boolean method6216() {
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "C", descriptor = "(I)V")
	@Override
	protected void method2055() {
		this.anIDirect3DDevice1.SetViewport(this.anInt2194, this.anInt2192, this.anInt2113, this.anInt2117, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!cu", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method2080(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "(B)V")
	@Override
	protected void method2022() {
		this.anIDirect3DDevice1.a(7, this.aBoolean173);
	}

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "(I)V")
	@Override
	protected void method2018() {
		this.method1989();
		this.method2043();
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(BZ)V")
	@Override
	public void method2102(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "()Lclient!oj;")
	@Override
	public Class248 method6230() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt2201, 0);
		return new Class248(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Lclient!st;")
	@Override
	public Interface25 method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cu", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!cu", name = "L", descriptor = "(I)V")
	@Override
	protected void method2099() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt2167);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(II)Lclient!pea;")
	@Override
	public Interface19 method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cu", name = "T", descriptor = "(I)F")
	@Override
	protected float method2114() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "(B)V")
	@Override
	protected void method2072() {
		this.anIDirect3DDevice1.a(15, this.aBoolean183);
	}

	@OriginalMember(owner = "client!cu", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!hr;)V")
	public void method2130(@OriginalArg(1) Class13 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt2164, arg0.method6679());
		if (this.aClass26Array1[this.anInt2164] != arg0.aClass26_10) {
			@Pc(21) int local21 = Static80.method2129(arg0.aClass26_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 5, local21);
			this.aClass26Array1[this.anInt2164] = arg0.aClass26_10;
			if (this.aBooleanArray6[this.anInt2164] != arg0.aBoolean679) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 7, arg0.aBoolean679 ? Static80.method2129(arg0.aClass26_10) : 0);
				this.aBooleanArray6[this.anInt2164] = arg0.aBoolean679;
			}
		} else if (arg0.aBoolean679 != this.aBooleanArray6[this.anInt2164]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt2164, 7, arg0.aBoolean679 ? Static80.method2129(arg0.aClass26_10) : 0);
			this.aBooleanArray6[this.anInt2164] = arg0.aBoolean679;
		}
		if (!this.aBooleanArray5[this.anInt2164]) {
			this.aBooleanArray5[this.anInt2164] = true;
			this.method2067();
			this.method2059();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!wga;ZBI)V")
	@Override
	protected void method2049(@OriginalArg(0) Class371 arg0, @OriginalArg(3) int arg1) {
		@Pc(24) byte local24;
		if (arg1 == 1) {
			local24 = 6;
		} else if (arg1 == 2) {
			local24 = 27;
		} else {
			local24 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt2164, local24, Static80.method2124(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "(I)V")
	@Override
	protected void method2028() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray28);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "()V")
	@Override
	public void method6167() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (pp.a(false, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(50);
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(IZ)Lclient!u;")
	@Override
	public Interface26 method2008(@OriginalArg(1) boolean arg0) {
		return new Class219(this, arg0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method2064(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "(I)V")
	@Override
	protected void method2015() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2193; local1++) {
			@Pc(19) Class3_Sub27 local19 = this.aClass3_Sub27Array3[local1];
			@Pc(23) int local23 = local1 + 2;
			@Pc(27) int local27 = local19.method5626();
			@Pc(33) float local33 = local19.method5631() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local19.method5627(), (float) local19.method5628(), (float) local19.method5630());
			this.aD3DLIGHT1.SetDiffuse((float) (local27 >> 16 & 0xFF) * local33, (float) (local27 >> 8 & 0xFF) * local33, local33 * (float) (local27 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local19.method5624() * local19.method5624()));
			this.aD3DLIGHT1.SetRange((float) local19.method5624());
			this.anIDirect3DDevice1.SetLight(local23, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local23, true);
		}
		while (local1 < this.anInt2186) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method2015();
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(Z)V")
	@Override
	protected void method2079() {
		this.anIDirect3DDevice1.a(137, this.aBoolean174 && !this.aBoolean171);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method2003(@OriginalArg(1) Class34 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!em;Lclient!ew;)Z")
	@Override
	public boolean method2017(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class89 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return pp.a(false, this.anIDirect3D1.a(this.anInt2201, local10)) && pp.a(false, this.anIDirect3D1.CheckDeviceFormat(this.anInt2201, this.anInt2200, local10.Format, 0, 4, Static80.method2127(arg1, arg0)));
	}

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "(II)Lclient!aia;")
	@Override
	protected Class16 method2095(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class16_Sub11(this, this.aClass181_14);
		} else if (arg0 == 4) {
			return new Class16_Sub9(this, this.aClass181_14, this.aClass73_3);
		} else if (arg0 == 8) {
			return new Class16_Sub3(this, this.aClass181_14, this.aClass73_3);
		} else {
			return super.method2095(arg0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "(B)V")
	@Override
	protected void method2026() {
		if (Static281.aClass86_10 == this.aClass86_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static62.aClass86_2 == this.aClass86_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static478.aClass86_11 == this.aClass86_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}
}
