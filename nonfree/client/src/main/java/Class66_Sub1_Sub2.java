import jaclib.peer.bea;
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
import jagdx.nba;
import jagdx.sh;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class66_Sub1_Sub2 extends Class66_Sub1 {

	@OriginalMember(owner = "client!ss", name = "Eg", descriptor = "Z")
	private boolean aBoolean586 = false;

	@OriginalMember(owner = "client!ss", name = "Ug", descriptor = "I")
	private int anInt8452 = 0;

	@OriginalMember(owner = "client!ss", name = "Kg", descriptor = "I")
	private final int anInt8450;

	@OriginalMember(owner = "client!ss", name = "Yg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ss", name = "Wg", descriptor = "Lclient!jaclib/peer/bea;")
	public final bea aBea1;

	@OriginalMember(owner = "client!ss", name = "Rg", descriptor = "I")
	private final int anInt8451;

	@OriginalMember(owner = "client!ss", name = "Sg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ss", name = "Pg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ss", name = "Ng", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ss", name = "Ig", descriptor = "Lclient!kfa;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "client!ss", name = "Lg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ss", name = "Vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ss", name = "Qg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ss", name = "Bg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ss", name = "Tg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ss", name = "Mg", descriptor = "Z")
	public final boolean aBoolean588;

	@OriginalMember(owner = "client!ss", name = "Fg", descriptor = "Z")
	public final boolean aBoolean587;

	@OriginalMember(owner = "client!ss", name = "bh", descriptor = "Z")
	public final boolean aBoolean589;

	@OriginalMember(owner = "client!ss", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!ss", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!ss", name = "Zg", descriptor = "[Z")
	private final boolean[] aBooleanArray37;

	@OriginalMember(owner = "client!ss", name = "Gg", descriptor = "[I")
	private final int[] anIntArray646;

	@OriginalMember(owner = "client!ss", name = "Jg", descriptor = "[Lclient!cba;")
	private final Class46[] aClass46Array1;

	@OriginalMember(owner = "client!ss", name = "Dg", descriptor = "[Z")
	private final boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!ss", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!e;Lclient!bi;Ljava/lang/Integer;)Lclient!oa;")
	private static Class66 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class66_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) bea local9 = new bea();
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
			} else if ((local18.DestBlendCaps & 0x20 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(182) D3DPRESENT_PARAMETERS local182 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static490.method7003(local182, local3, local13, arg3, local5)) {
					throw new RuntimeException("");
				}
				local182.Windowed = true;
				local182.EnableAutoDepthStencil = true;
				local182.PresentationInterval = Integer.MIN_VALUE;
				@Pc(208) int local208 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local208 |= 0x10;
				}
				@Pc(233) IDirect3DDevice local233;
				try {
					local233 = local13.a(local3, local5, arg0, local208 | 0x40, local182);
				} catch (@Pc(235) sh local235) {
					local233 = local13.a(local3, local5, arg0, local208 | 0x20, local182);
				}
				@Pc(254) Class195 local254 = new Class195(local233.c(0), local233.b());
				local1 = new Class66_Sub1_Sub2(local3, local5, arg0, local9, local13, local233, local254, local182, local18, arg1, arg2, arg3);
				local1.method6989();
				return local1;
			}
		} catch (@Pc(277) RuntimeException local277) {
			if (local1 != null) {
				local1.method6805();
			}
			throw local277;
		}
	}

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/bea;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!kfa;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!e;Lclient!bi;I)V")
	public Class66_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) bea arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class195 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface3 arg9, @OriginalArg(10) Class31 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt8450 = arg1;
		this.anIDirect3DDevice1 = arg5;
		this.aBea1 = arg3;
		this.anInt8451 = arg0;
		this.aD3DCAPS1 = arg8;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anIDirect3D1 = arg4;
		this.aClass195_1 = arg6;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aBea1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aBea1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aBea1);
		this.aPixelBuffer1 = new PixelBuffer(this.aBea1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aBea1);
		new GeometryBuffer(this.aBea1);
		this.aBoolean588 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean576 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean587 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.anInt8436 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean589 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean570 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt8426 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean584 = this.anInt8434 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt8451, this.anInt8450, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray35 = new boolean[this.anInt8426];
		this.aBooleanArray36 = new boolean[this.anInt8426];
		this.aBooleanArray37 = new boolean[this.anInt8426];
		this.anIntArray646 = new int[this.anInt8426];
		this.aClass46Array1 = new Class46[this.anInt8426];
		this.aBooleanArray34 = new boolean[this.anInt8426];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method6847();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(241) Exception_Sub1 local241) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZZLclient!gf;)V")
	@Override
	public void method6959(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class120 arg3) {
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local12 = 3;
		} else if (arg0 == 2) {
			local12 = 26;
		} else {
			local12 = 2;
		}
		@Pc(20) int local20 = 0;
		if (arg1) {
			local20 = 32;
		}
		if (arg2) {
			local20 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, local12, Static490.method6998(arg3) | local20);
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(II)V")
	@Override
	public void method6885(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, 11, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "eb", descriptor = "(I)Z")
	private boolean method6999() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(19) Class195 local19 = (Class195) this.anObject42;
			this.method6878();
			local19.method4364();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static490.method7003(this.aD3DPRESENT_PARAMETERS1, this.anInt8451, this.anIDirect3D1, this.anInt8434, this.anInt8450)) {
				@Pc(52) int local52 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (nba.a(local52, (byte) -63)) {
					local19.method4365(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.c(0));
					this.method6986();
					this.method6942();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "(Z)V")
	@Override
	protected void method6912() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8428 + this.anInt8446, this.anInt8433 + this.anInt8412, this.anInt8429, this.anInt8443);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILclient!ob;Lclient!ft;III)V")
	@Override
	public void method6917(@OriginalArg(1) int arg0, @OriginalArg(2) Class247 arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class313) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static490.method7001(arg1), 0, arg0, arg4, arg3, arg5);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!ts;)V")
	@Override
	public void method6890(@OriginalArg(1) Class321 arg0) {
		@Pc(5) dxVertexLayout local5 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local5.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI[[II)Lclient!ul;")
	@Override
	public Interface22 method6922(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2) {
		return new Class87_Sub2(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6936(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "(I)V")
	@Override
	protected void method6892() {
		@Pc(15) int local15 = this.aBooleanArray36[this.anInt8432] ? Static490.method7004(this.aClass240Array6[this.anInt8432]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, 4, local15);
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
	@Override
	protected void method6863() {
		if (this.aBoolean578) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt8442);
			return;
		}
		this.aFloat178 = this.anInt8441 - this.anInt8439;
		this.aFloat170 = this.aFloat178 - (float) this.anInt8414;
		if (this.aFloat170 < (float) this.anInt8410) {
			this.aFloat170 = this.anInt8410;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat170);
		this.anIDirect3DDevice1.a(37, this.aFloat178);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8416);
	}

	@OriginalMember(owner = "client!ss", name = "cb", descriptor = "(I)V")
	@Override
	protected void method6992() {
		@Pc(7) float local7 = this.aBoolean572 ? this.aFloat183 : 0.0F;
		@Pc(20) float local20 = this.aBoolean572 ? -this.bf : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat174 * local7, local7 * this.aFloat172, this.aFloat173 * local7, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local20 * this.aFloat174, this.aFloat172 * local20, local20 * this.aFloat173, 0.0F);
		this.aBoolean586 = false;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6811(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!hi;ZLclient!ne;)Z")
	@Override
	public boolean method6969(@OriginalArg(0) Class141 arg0, @OriginalArg(2) Class239 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return nba.a(this.anIDirect3D1.a(this.anInt8451, local3), (byte) -58) && nba.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt8451, this.anInt8450, local3.Format, 0, 3, Static490.method7005(arg0, arg1)), (byte) -56);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([FIZIIILclient!hi;B)Lclient!ak;")
	@Override
	protected Interface2 method6891(@OriginalArg(0) float[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class141 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!sk;)V")
	public void method7000(@OriginalArg(1) Class87_Sub3 arg0) {
		this.method7002(arg0);
		if (this.aBooleanArray35[this.anInt8432] != arg0.aBoolean560) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 1, arg0.aBoolean560 ? 1 : 3);
			this.aBooleanArray35[this.anInt8432] = arg0.aBoolean560;
		}
		if (arg0.aBoolean561 != this.aBooleanArray34[this.anInt8432]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 2, arg0.aBoolean561 ? 1 : 3);
			this.aBooleanArray34[this.anInt8432] = arg0.aBoolean561;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIILclient!hi;[BZ)Lclient!ak;")
	@Override
	protected Interface2 method6994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class141 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) boolean arg4) {
		return new Class87_Sub3(this, arg2, arg1, arg0, arg4, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!hi;Lclient!ne;I)Z")
	@Override
	public boolean method6937(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class239 arg1) {
		@Pc(7) D3DDISPLAYMODE local7 = new D3DDISPLAYMODE();
		return nba.a(this.anIDirect3D1.a(this.anInt8451, local7), (byte) -104) && nba.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt8451, this.anInt8450, local7.Format, 0, 4, Static490.method7005(arg0, arg1)), (byte) -79);
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(ZI)Lclient!eu;")
	@Override
	public Interface4 method6931(@OriginalArg(0) boolean arg0) {
		return new Class144(this, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "P", descriptor = "(I)F")
	@Override
	protected float method6952() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "(B)V")
	@Override
	protected void method6904() {
		if (this.aBooleanArray36[this.anInt8432]) {
			this.aBooleanArray36[this.anInt8432] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8432, null);
			this.method6892();
			this.method6868();
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6908(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		if (this.aCanvas15 != arg1) {
			return;
		}
		@Pc(15) Dimension local15 = arg1.getSize();
		if (local15.width > 0 && local15.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method6999();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!nn;B)V")
	public void method7002(@OriginalArg(0) Class87 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8432, arg0.method6716());
		if (this.aClass46Array1[this.anInt8432] != arg0.aClass46_10) {
			@Pc(57) int local57 = Static490.method7007(arg0.aClass46_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 6, local57);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 5, local57);
			this.aClass46Array1[this.anInt8432] = arg0.aClass46_10;
			if (arg0.aBoolean559 != this.aBooleanArray37[this.anInt8432]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 7, arg0.aBoolean559 ? Static490.method7007(arg0.aClass46_10) : 0);
				this.aBooleanArray37[this.anInt8432] = arg0.aBoolean559;
			}
		} else if (arg0.aBoolean559 != this.aBooleanArray37[this.anInt8432]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 7, arg0.aBoolean559 ? Static490.method7007(arg0.aClass46_10) : 0);
			this.aBooleanArray37[this.anInt8432] = arg0.aBoolean559;
		}
		if (!this.aBooleanArray36[this.anInt8432]) {
			this.aBooleanArray36[this.anInt8432] = true;
			this.method6892();
			this.method6868();
		}
	}

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "(I)V")
	@Override
	protected void method6896() {
		this.anIDirect3DDevice1.a(137, this.aBoolean567 && !this.aBoolean574);
	}

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "(I)V")
	@Override
	protected void method6921() {
		if (this.aBoolean586) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean586 = true;
	}

	@OriginalMember(owner = "client!ss", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6873(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ss", name = "V", descriptor = "(I)V")
	@Override
	protected void method6971() {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIILclient!ob;)V")
	@Override
	public void method6964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class247 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static490.method7001(arg2), arg1, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.d(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (nba.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1), (byte) -31) && nba.a(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), (byte) -20)) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
					this.aPixelBuffer1.a(local1, arg2 * local77, local56 * local77, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(-81);
		local16.b(-125);
		return local1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6907(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass195_1 = (Class195) arg0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Lclient!lu;")
	@Override
	protected Class93 method6897(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class93_Sub6(this, this.aClass31_106);
		} else if (arg0 == 4) {
			return new Class93_Sub2(this, this.aClass31_106, this.aClass217_5);
		} else {
			return super.method6897(arg0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6812(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6847();
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6972(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "(I)V")
	@Override
	protected void method6881() {
		if (this.aBoolean565) {
			Static490.aFloatArray60[11] = 0.0F;
			Static490.aFloatArray60[5] = 1.0F;
			Static490.aFloatArray60[3] = 0.0F;
			Static490.aFloatArray60[4] = 0.0F;
			Static490.aFloatArray60[9] = 0.0F;
			Static490.aFloatArray60[13] = 0.0F;
			Static490.aFloatArray60[0] = 1.0F;
			Static490.aFloatArray60[6] = 0.0F;
			Static490.aFloatArray60[10] = 1.0F;
			Static490.aFloatArray60[7] = 0.0F;
			Static490.aFloatArray60[2] = 0.0F;
			Static490.aFloatArray60[8] = 0.0F;
			Static490.aFloatArray60[14] = 0.0F;
			Static490.aFloatArray60[12] = 0.0F;
			Static490.aFloatArray60[1] = 0.0F;
			Static490.aFloatArray60[15] = 1.0F;
		} else {
			this.aClass134_Sub1_15.method3398(Static490.aFloatArray60);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static490.aFloatArray60);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class75 method6775(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class75 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!ne;IILclient!hi;I)Lclient!ak;")
	@Override
	public Interface2 method6995(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class141 arg2, @OriginalArg(4) int arg3) {
		return new Class87_Sub3(this, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!ss", name = "z", descriptor = "(I)V")
	@Override
	protected void method6905() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray55);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6926() {
		this.anIDirect3DDevice1.a(14, this.aBoolean573 && this.aBoolean566);
	}

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "()V")
	@Override
	public void method6795() {
		this.method6864(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ss", name = "ab", descriptor = "(I)V")
	@Override
	protected void method6987() {
		this.anIDirect3DDevice1.a(28, this.aBoolean577 && this.aBoolean568 && this.anInt8414 >= 0 | this.aBoolean578);
	}

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "(B)V")
	@Override
	protected void method6898() {
		if (this.aClass129_4.method3348()) {
			this.aClass134_Sub1_18.method3398(Static490.aFloatArray60);
		} else {
			Static490.aFloatArray60[1] = 0.0F;
			Static490.aFloatArray60[0] = 1.0F;
			Static490.aFloatArray60[2] = 0.0F;
			Static490.aFloatArray60[13] = 0.0F;
			Static490.aFloatArray60[5] = 1.0F;
			Static490.aFloatArray60[7] = 0.0F;
			Static490.aFloatArray60[4] = 0.0F;
			Static490.aFloatArray60[12] = 0.0F;
			Static490.aFloatArray60[3] = 0.0F;
			Static490.aFloatArray60[15] = 1.0F;
			Static490.aFloatArray60[9] = 0.0F;
			Static490.aFloatArray60[6] = 0.0F;
			Static490.aFloatArray60[11] = 0.0F;
			Static490.aFloatArray60[10] = 1.0F;
			Static490.aFloatArray60[8] = 0.0F;
			Static490.aFloatArray60[14] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static490.aFloatArray60);
	}

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "(B)V")
	@Override
	protected void method6977() {
		this.anIDirect3DDevice1.a(15, this.aBoolean582);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIZI[III)Lclient!ak;")
	@Override
	public Interface2 method6886(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class87_Sub3(this, arg5, arg0, arg1, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!ss", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!gf;ZBI)V")
	@Override
	protected void method6988(@OriginalArg(0) Class120 arg0, @OriginalArg(3) int arg1) {
		@Pc(13) byte local13;
		if (arg1 == 1) {
			local13 = 6;
		} else if (arg1 == 2) {
			local13 = 27;
		} else {
			local13 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, local13, Static490.method6998(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6824(@OriginalArg(0) int arg0) {
		this.aBea1.b((byte) 21);
		super.method6824(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "(B)V")
	@Override
	public void method6961() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray58[0], -this.aFloatArray58[1], -this.aFloatArray58[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray57[0], -this.aFloatArray57[1], -this.aFloatArray57[2]);
		this.aBoolean586 = false;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLclient!eea;)V")
	public void method7006(@OriginalArg(1) Class87_Sub1 arg0) {
		this.method7002(arg0);
		if (!this.aBooleanArray35[this.anInt8432]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 1, 1);
			this.aBooleanArray35[this.anInt8432] = true;
		}
		if (!this.aBooleanArray34[this.anInt8432]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8432, 2, 1);
			this.aBooleanArray34[this.anInt8432] = true;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!mf;Z)V")
	@Override
	public void method6990(@OriginalArg(0) Class221 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static486.aClass221_5) {
			local1 = 65536;
		} else if (arg0 == Static149.aClass221_1) {
			local1 = 131072;
		} else if (arg0 == Static487.aClass221_3) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, 11, local1 | this.anInt8432);
	}

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "(B)V")
	@Override
	protected void method6949() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8446, this.anInt8433, this.anInt8277, this.anInt8336, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI)Lclient!ft;")
	@Override
	public Interface8 method6859(@OriginalArg(0) boolean arg0) {
		return new Class313(this, Static349.aClass239_13, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[Lclient!ca;)Lclient!ts;")
	@Override
	public Class321 method6903(@OriginalArg(1) Class43[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "(I)V")
	@Override
	protected void method6876() {
		if (this.aClass194_7 == Static272.aClass194_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass194_7 == Static79.aClass194_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass194_7 == Static226.aClass194_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ss", name = "E", descriptor = "()Z")
	@Override
	public boolean method6852() {
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "(I)V")
	@Override
	protected void method6879() {
		this.method6992();
		this.method6921();
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "()V")
	@Override
	public void method6784() {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLclient!eu;I)V")
	@Override
	public void method6941(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class144 local2 = (Class144) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method3562());
	}

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "()V")
	@Override
	public void method6790() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (nba.a(local3.Issue(), (byte) -40)) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(-106);
	}

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "(I)V")
	@Override
	protected void method6860() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8431; local1++) {
			@Pc(10) Class4_Sub32 local10 = this.aClass4_Sub32Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(20) int local20 = local10.method6613(72);
			@Pc(26) float local26 = local10.method6618() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method6614(), (float) local10.method6615(-18736), (float) local10.method6617());
			this.aD3DLIGHT2.SetDiffuse((float) (local20 >> 16 & 0xFF) * local26, (float) (local20 >> 8 & 0xFF) * local26, local26 * (float) (local20 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method6621() * local10.method6621()));
			this.aD3DLIGHT2.SetRange((float) local10.method6621());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt8427) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6860();
	}

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "(I)V")
	@Override
	protected void method6901() {
		this.anIDirect3DDevice1.a(7, this.aBoolean569);
	}

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "(B)V")
	@Override
	protected void method6894() {
		this.anIDirect3DDevice1.a(174, this.aBoolean585);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "()V")
	@Override
	public void method6780() {
	}

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "(Z)V")
	@Override
	protected void method6910() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8425);
	}

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "(I)V")
	@Override
	protected void method6877() {
		if (this.aClass81Array3[this.anInt8432] == Static114.aClass81_5) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, 24, 0);
			this.anIntArray646[this.anInt8432] = 0;
			return;
		}
		if (Static209.aClass81_8 == this.aClass81Array3[this.anInt8432]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8432 + 16, this.aClass134_Sub1Array3[this.anInt8432].method3398(Static490.aFloatArray60));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8432 + 16, this.aClass134_Sub1Array3[this.anInt8432].method3415(Static490.aFloatArray60));
		}
		@Pc(70) int local70 = Static490.method7008(this.aClass81Array3[this.anInt8432]);
		if (local70 != this.anIntArray646[this.anInt8432]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, 24, local70);
			this.anIntArray646[this.anInt8432] = local70;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B[BIILclient!hi;I)Lclient!js;")
	@Override
	public Interface12 method6928(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class141 arg1) {
		return new Class87_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "A", descriptor = "()V")
	@Override
	public void method6847() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass195_1.method4363()) {
			this.anInt8452 = 0;
			if (nba.a(this.aClass195_1.method4366(), (int) 78)) {
				this.method6999();
			}
		} else if (++this.anInt8452 <= 50) {
			this.method6999();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "()Z")
	@Override
	public boolean method6814() {
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "(I)V")
	@Override
	protected void method6868() {
		@Pc(22) int local22 = this.aBooleanArray36[this.anInt8432] ? Static490.method7004(this.aClass240Array5[this.anInt8432]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8432, 1, local22);
	}

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "()V")
	@Override
	public void method6830() {
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V")
	@Override
	public void method6851(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "()V")
	@Override
	protected void method6805() {
		this.aBea1.a((byte) -77);
		super.method6805();
	}

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "(I)V")
	@Override
	protected void method6942() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8426; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass46Array1[local1] = Static472.aClass46_9;
			this.aBooleanArray35[local1] = this.aBooleanArray34[local1] = true;
			this.aBooleanArray37[local1] = false;
			this.anIntArray646[local1] = 0;
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
		this.aBoolean586 = false;
		super.method6942();
	}

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "()Lclient!ffa;")
	@Override
	public Class105 method6836() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt8451, 0);
		return new Class105(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "(B)V")
	@Override
	protected void method6975() {
		this.anIDirect3DDevice1.a(27, this.aBoolean571);
	}

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "(Z)V")
	@Override
	protected void method6947() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat174 * this.aFloat168, this.aFloat172 * this.aFloat168, this.aFloat173 * this.aFloat168, 0.0F);
		this.aBoolean586 = false;
	}

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "()V")
	@Override
	public void method6808() {
	}
}
