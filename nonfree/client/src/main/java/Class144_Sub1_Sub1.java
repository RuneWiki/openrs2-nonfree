import jaclib.peer.ks;
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
import jagdx.efa;
import jagdx.hia;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class144_Sub1_Sub1 extends Class144_Sub1 {

	@OriginalMember(owner = "client!hda", name = "Og", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader6;

	@OriginalMember(owner = "client!hda", name = "Qg", descriptor = "I")
	private int anInt4237 = 0;

	@OriginalMember(owner = "client!hda", name = "Ng", descriptor = "Z")
	private boolean aBoolean325 = false;

	@OriginalMember(owner = "client!hda", name = "Mg", descriptor = "I")
	private final int anInt4235;

	@OriginalMember(owner = "client!hda", name = "Rg", descriptor = "Lclient!jaclib/peer/ks;")
	public final ks aKs1;

	@OriginalMember(owner = "client!hda", name = "gh", descriptor = "Lclient!wd;")
	private Class387 aClass387_1;

	@OriginalMember(owner = "client!hda", name = "ah", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!hda", name = "Lg", descriptor = "I")
	private final int anInt4236;

	@OriginalMember(owner = "client!hda", name = "Pg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!hda", name = "eh", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!hda", name = "Sg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!hda", name = "jh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!hda", name = "Zg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!hda", name = "ch", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!hda", name = "Tg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!hda", name = "bh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!hda", name = "Jg", descriptor = "Z")
	public final boolean aBoolean323;

	@OriginalMember(owner = "client!hda", name = "Kg", descriptor = "Z")
	public final boolean aBoolean322;

	@OriginalMember(owner = "client!hda", name = "hh", descriptor = "Z")
	public final boolean aBoolean324;

	@OriginalMember(owner = "client!hda", name = "Wg", descriptor = "[Lclient!gk;")
	private final Class137[] aClass137Array1;

	@OriginalMember(owner = "client!hda", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!hda", name = "Yg", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hda", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!hda", name = "ih", descriptor = "[I")
	private final int[] anIntArray214;

	@OriginalMember(owner = "client!hda", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!hda", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!rg;Ljava/lang/Integer;)Lclient!ha;")
	private static Class144 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class144_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ks local9 = new ks();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(189) D3DPRESENT_PARAMETERS local189 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static215.method3736(local3, local189, local13, arg3, local5)) {
					throw new RuntimeException("");
				}
				local189.PresentationInterval = Integer.MIN_VALUE;
				local189.Windowed = true;
				local189.EnableAutoDepthStencil = true;
				@Pc(216) int local216 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local216 |= 0x10;
				}
				@Pc(242) IDirect3DDevice local242;
				try {
					local242 = local13.a(local3, local5, arg0, local216 | 0x40, local189);
				} catch (@Pc(244) efa local244) {
					local242 = local13.a(local3, local5, arg0, local216 | 0x20, local189);
				}
				@Pc(263) Class387 local263 = new Class387(local242.c(0), local242.c());
				local1 = new Class144_Sub1_Sub1(local3, local5, arg0, local9, local13, local242, local263, local189, local18, arg1, arg2, arg3);
				local1.method5669();
				return local1;
			}
		} catch (@Pc(286) RuntimeException local286) {
			if (local1 != null) {
				local1.method6905();
			}
			throw local286;
		}
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ks;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!wd;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!rg;I)V")
	private Class144_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ks arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class387 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class310 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt4235 = arg0;
			this.aKs1 = arg3;
			this.aClass387_1 = arg6;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt4236 = arg1;
			this.anIDirect3D1 = arg4;
			this.aD3DCAPS1 = arg8;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aKs1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aKs1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aKs1);
			this.aPixelBuffer1 = new PixelBuffer(this.aKs1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aKs1);
			new GeometryBuffer(this.aKs1);
			this.aBoolean323 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt6530 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
			this.aBoolean322 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean324 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean449 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt6497 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean440 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean450 = this.anInt6524 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt4235, this.anInt4236, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aClass137Array1 = new Class137[this.anInt6497];
			this.aBooleanArray7 = new boolean[this.anInt6497];
			this.aBooleanArray10 = new boolean[this.anInt6497];
			this.aBooleanArray9 = new boolean[this.anInt6497];
			this.anIntArray214 = new int[this.anInt6497];
			this.aBooleanArray8 = new boolean[this.anInt6497];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(225) Throwable local225) {
			local225.printStackTrace();
			this.method6932();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(B)V")
	@Override
	protected void method5659() {
		this.method5762();
		this.method5725();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!dl;B)V")
	public void method3729(@OriginalArg(0) Class81 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6503, arg0.method9339());
		if (arg0.aClass137_11 != this.aClass137Array1[this.anInt6503]) {
			@Pc(21) int local21 = Static215.method3738(arg0.aClass137_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 5, local21);
			this.aClass137Array1[this.anInt6503] = arg0.aClass137_11;
			if (this.aBooleanArray7[this.anInt6503] != arg0.aBoolean769) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 7, arg0.aBoolean769 ? Static215.method3738(arg0.aClass137_11) : 0);
				this.aBooleanArray7[this.anInt6503] = arg0.aBoolean769;
			}
		} else if (arg0.aBoolean769 != this.aBooleanArray7[this.anInt6503]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 7, arg0.aBoolean769 ? Static215.method3738(arg0.aClass137_11) : 0);
			this.aBooleanArray7[this.anInt6503] = arg0.aBoolean769;
		}
		if (!this.aBooleanArray10[this.anInt6503]) {
			this.aBooleanArray10[this.anInt6503] = true;
			this.method5748();
			this.method5730();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!tca;)V")
	@Override
	public void method6891(@OriginalArg(0) Interface22 arg0) {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hda", name = "db", descriptor = "(I)Z")
	private boolean method3730() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(17) Class387 local17 = (Class387) this.anObject14;
			this.method5699();
			local17.method9276();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static215.method3736(this.anInt4235, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1, this.anInt6524, this.anInt4236)) {
				@Pc(52) int local52 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (hia.a(local52, (byte) -123)) {
					local17.method9277(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.c());
					this.method5649();
					this.method5743();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)Lclient!bj;")
	@Override
	public Interface3 method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!jj;)V")
	public void method3731(@OriginalArg(1) Class81_Sub1 arg0) {
		this.method3729(arg0);
		if (this.aBooleanArray9[this.anInt6503] != arg0.aBoolean388) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 1, arg0.aBoolean388 ? 1 : 3);
			this.aBooleanArray9[this.anInt6503] = arg0.aBoolean388;
		}
		if (this.aBooleanArray8[this.anInt6503] != arg0.aBoolean389) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 2, arg0.aBoolean389 ? 1 : 3);
			this.aBooleanArray8[this.anInt6503] = arg0.aBoolean389;
		}
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(II)V")
	@Override
	public void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass387_1.method9278()) {
			this.anInt4237 = 0;
			if (hia.a(this.aClass387_1.method9279(), (int) -81)) {
				this.method3730();
			}
		} else if (++this.anInt4237 <= 50) {
			this.method3730();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "(I)V")
	@Override
	protected void method5708() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6522 + this.anInt6513, this.anInt6528 + this.anInt6519, this.anInt6508, this.anInt6495);
	}

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "()Z")
	@Override
	public boolean method6898() {
		return false;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IZIIILclient!o;I[F)Lclient!gka;")
	@Override
	protected Interface9 method5749(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class260 arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "(B)V")
	@Override
	protected void method5732() {
		if (Static282.aClass231_5 == this.aClass231_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass231_6 == Static122.aClass231_2) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass231_6 == Static632.aClass231_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!hda", name = "P", descriptor = "(I)V")
	@Override
	protected void method5763() {
		if (this.anIDirect3DVertexShader6 != null || Static79.aClass199_1 == this.aClass199Array3[this.anInt6503]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, 24, 0);
			this.anIntArray214[this.anInt6503] = 0;
			return;
		}
		if (this.aClass199Array3[this.anInt6503] == Static282.aClass199_6) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6503 + 16, this.aClass263_Sub2Array3[this.anInt6503].method7289(Static215.aFloatArray36));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6503 + 16, this.aClass263_Sub2Array3[this.anInt6503].method7291(Static215.aFloatArray36));
		}
		@Pc(78) int local78 = Static215.method3734(this.aClass199Array3[this.anInt6503]);
		if (local78 != this.anIntArray214[this.anInt6503]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, 24, local78);
			this.anIntArray214[this.anInt6503] = local78;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!al;BLclient!o;)Z")
	@Override
	public boolean method5759(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class260 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return hia.a(this.anIDirect3D1.a(this.anInt4235, local11), (byte) -123) && hia.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt4235, this.anInt4236, local11.Format, 0, 4, Static215.method3733(arg1, arg0)), (byte) -123);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIIILclient!o;Z[B)Lclient!gka;")
	@Override
	protected Interface9 method5726(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class260 arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) byte[] arg4) {
		return new Class81_Sub1(this, arg2, arg1, arg0, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "()V")
	@Override
	protected void method6905() {
		this.aKs1.a((int) -116);
		super.method6905();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!gn;ZZI)V")
	@Override
	public void method5775(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(15) byte local15;
		if (arg0 == 1) {
			local15 = 3;
		} else if (arg0 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		if (arg2) {
			local1 = 32;
		}
		if (arg3) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, local15, Static215.method3740(arg1) | local1);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!wi;Lclient!bj;)Lclient!tca;")
	@Override
	public Interface22 method6956(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Interface3 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6952(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hda", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "()V")
	@Override
	public void method6916() {
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(ZI)V")
	@Override
	public void method5652(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6946(@OriginalArg(0) int arg0) {
		this.aKs1.a((byte) -76);
		super.method6946(arg0);
	}

	@OriginalMember(owner = "client!hda", name = "Z", descriptor = "(I)V")
	@Override
	protected void method5710() {
		this.anIDirect3DDevice1.a(15, this.aBoolean458);
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(B)V")
	@Override
	protected void method5688() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6527);
	}

	@OriginalMember(owner = "client!hda", name = "S", descriptor = "(I)V")
	@Override
	protected void method5656() {
		if (this.aClass114_6.method2260()) {
			this.aClass263_Sub2_18.method7291(Static215.aFloatArray36);
		} else {
			Static215.aFloatArray36[5] = 1.0F;
			Static215.aFloatArray36[7] = 0.0F;
			Static215.aFloatArray36[13] = 0.0F;
			Static215.aFloatArray36[1] = 0.0F;
			Static215.aFloatArray36[4] = 0.0F;
			Static215.aFloatArray36[6] = 0.0F;
			Static215.aFloatArray36[2] = 0.0F;
			Static215.aFloatArray36[12] = 0.0F;
			Static215.aFloatArray36[15] = 1.0F;
			Static215.aFloatArray36[11] = 0.0F;
			Static215.aFloatArray36[10] = 1.0F;
			Static215.aFloatArray36[3] = 0.0F;
			Static215.aFloatArray36[0] = 1.0F;
			Static215.aFloatArray36[8] = 0.0F;
			Static215.aFloatArray36[14] = 0.0F;
			Static215.aFloatArray36[9] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static215.aFloatArray36);
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(Z)V")
	@Override
	protected void method5660() {
		this.anIDirect3DDevice1.a(7, this.aBoolean454);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6942(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6918(arg2, arg3);
	}

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "(B)V")
	@Override
	protected void method5644() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6513, this.anInt6528, this.anInt6409, this.anInt6368, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "()V")
	@Override
	public void method6953() {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ida;Z)V")
	@Override
	public void method5772(@OriginalArg(0) Class170 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static298.aClass170_4) {
			local1 = 65536;
		} else if (Static27.aClass170_2 == arg0) {
			local1 = 131072;
		} else if (Static181.aClass170_3 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, 11, local1 | this.anInt6503);
	}

	@OriginalMember(owner = "client!hda", name = "L", descriptor = "(I)V")
	@Override
	protected void method5773() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6501; local1++) {
			@Pc(14) Class14_Sub18 local14 = this.aClass14_Sub18Array5[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method8345();
			@Pc(28) float local28 = local14.method8339() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method8342(), (float) local14.method8344(), (float) local14.method8341());
			this.aD3DLIGHT1.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, local28 * (float) (local22 >> 8 & 0xFF), (float) (local22 & 0xFF) * local28, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method8343() * local14.method8343()));
			this.aD3DLIGHT1.SetRange((float) local14.method8343());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt6510 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5773();
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(II)Lclient!wi;")
	@Override
	public Interface27 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hda", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "(B)V")
	@Override
	protected void method5654() {
	}

	@OriginalMember(owner = "client!hda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5694(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(ZI)Lclient!fea;")
	@Override
	public Interface7 method5780(@OriginalArg(0) boolean arg0) {
		return new Class236(this, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "y", descriptor = "()Lclient!bg;")
	@Override
	public Class35 method6960() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt4235, 0);
		return new Class35(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method3735(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader6 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method5763();
	}

	@OriginalMember(owner = "client!hda", name = "v", descriptor = "(B)V")
	@Override
	protected void method5731() {
		if (this.aBooleanArray10[this.anInt6503]) {
			this.aBooleanArray10[this.anInt6503] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6503, (IDirect3DBaseTexture) null);
			this.method5748();
			this.method5730();
		}
	}

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "(II)Lclient!kba;")
	@Override
	protected Class5 method5691(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class5_Sub2(this, this.aClass310_76);
		} else if (arg0 == 4) {
			return new Class5_Sub8(this, this.aClass310_76, this.aClass223_5);
		} else if (arg0 == 8) {
			return new Class5_Sub10(this, this.aClass310_76, this.aClass223_5);
		} else {
			return super.method5691(arg0);
		}
	}

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "(B)V")
	@Override
	protected void method5748() {
		@Pc(16) int local16 = this.aBooleanArray10[this.anInt6503] ? Static215.method3732(this.aClass287Array5[this.anInt6503]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, 4, local16);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ok;I)V")
	@Override
	public void method5707(@OriginalArg(0) Class119 arg0) {
		@Pc(11) dxVertexLayout local11 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local11.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "(Z)V")
	@Override
	protected void method5762() {
		@Pc(8) float local8 = this.aBoolean448 ? this.aFloat102 : 0.0F;
		@Pc(18) float local18 = this.aBoolean448 ? -this.aFloat91 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local8 * this.aFloat103, this.aFloat104 * local8, local8 * this.aFloat106, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local18 * this.aFloat103, this.aFloat104 * local18, local18 * this.aFloat106, 0.0F);
		this.aBoolean325 = false;
	}

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "()V")
	@Override
	public void method6936() {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method5752(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIILclient!fm;ILclient!l;I)V")
	@Override
	public void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class213 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class209) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static215.method3741(arg4), 0, arg1, arg3, arg5, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5672(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas6) {
			return;
		}
		@Pc(15) Dimension local15 = arg0.getSize();
		if (local15.width > 0 && local15.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method3730();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([Lclient!gaa;I)Lclient!ok;")
	@Override
	public Class119 method5689(@OriginalArg(0) Class127[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "(I)V")
	@Override
	protected void method5774() {
		this.anIDirect3DDevice1.a(28, this.aBoolean442 && this.aBoolean451 && this.anInt6499 >= 0);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!o;BILclient!al;)Lclient!gka;")
	@Override
	public Interface9 method5753(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3) {
		return new Class81_Sub1(this, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "r", descriptor = "()V")
	@Override
	public void method6901() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (hia.a(local3.Issue(), (byte) -123)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(102);
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)V")
	@Override
	public void method5673() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray51[0], -this.aFloatArray51[1], -this.aFloatArray51[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray50[0], -this.aFloatArray50[1], -this.aFloatArray50[2]);
		this.aBoolean325 = false;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method3737(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!fea;I)V")
	@Override
	public void method5696(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		@Pc(2) Class236 local2 = (Class236) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method5845());
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!al;Lclient!o;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class260 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = new D3DDISPLAYMODE();
		return hia.a(this.anIDirect3D1.a(this.anInt4235, local12), (byte) -123) && hia.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt4235, this.anInt4236, local12.Format, 0, 3, Static215.method3733(arg1, arg0)), (byte) -123);
	}

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "(I)V")
	@Override
	protected void method5704() {
		if (this.aBoolean439) {
			Static215.aFloatArray36[13] = 0.0F;
			Static215.aFloatArray36[14] = 0.0F;
			Static215.aFloatArray36[11] = 0.0F;
			Static215.aFloatArray36[3] = 0.0F;
			Static215.aFloatArray36[4] = 0.0F;
			Static215.aFloatArray36[10] = 1.0F;
			Static215.aFloatArray36[2] = 0.0F;
			Static215.aFloatArray36[9] = 0.0F;
			Static215.aFloatArray36[8] = 0.0F;
			Static215.aFloatArray36[7] = 0.0F;
			Static215.aFloatArray36[12] = 0.0F;
			Static215.aFloatArray36[6] = 0.0F;
			Static215.aFloatArray36[1] = 0.0F;
			Static215.aFloatArray36[5] = 1.0F;
			Static215.aFloatArray36[15] = 1.0F;
			Static215.aFloatArray36[0] = 1.0F;
		} else {
			this.aClass263_Sub2_15.method7291(Static215.aFloatArray36);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static215.aFloatArray36);
	}

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "(I)F")
	@Override
	protected float method5739() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5682(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass387_1 = (Class387) arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5678(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5743() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6497; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass137Array1[local1] = Static306.aClass137_8;
			this.aBooleanArray9[local1] = this.aBooleanArray8[local1] = true;
			this.aBooleanArray7[local1] = false;
			this.anIntArray214[local1] = 0;
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
		this.aBoolean325 = false;
		super.method5743();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B[BILclient!o;II)Lclient!pw;")
	@Override
	public Interface18 method5733(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class260 arg1) {
		return new Class81_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "(Z)V")
	@Override
	protected void method5730() {
		@Pc(21) int local21 = this.aBooleanArray10[this.anInt6503] ? Static215.method3732(this.aClass287Array6[this.anInt6503]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, 1, local21);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([[IIZI)Lclient!sba;")
	@Override
	public Interface20 method5741(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class81_Sub2(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!lb;Lclient!lb;FLclient!lb;)Lclient!lb;")
	@Override
	public Class47 method6899(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "(B)V")
	@Override
	protected void method5700() {
		this.anIDirect3DDevice1.a(137, this.aBoolean456 && !this.aBoolean445);
	}

	@OriginalMember(owner = "client!hda", name = "U", descriptor = "(I)V")
	@Override
	protected void method5695() {
		this.aFloat99 = (float) (this.anInt6520 - this.anInt6517);
		this.aFloat94 = this.aFloat99 - (float) this.anInt6499;
		if ((float) this.anInt6493 > this.aFloat94) {
			this.aFloat94 = (float) this.anInt6493;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat94);
		this.anIDirect3DDevice1.a(37, this.aFloat99);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6507);
	}

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "()V")
	@Override
	public void method6889() {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!wh;)V")
	public void method3739(@OriginalArg(1) Class81_Sub3 arg0) {
		this.method3729(arg0);
		if (!this.aBooleanArray9[this.anInt6503]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 1, 1);
			this.aBooleanArray9[this.anInt6503] = true;
		}
		if (!this.aBooleanArray8[this.anInt6503]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6503, 2, 1);
			this.aBooleanArray8[this.anInt6503] = true;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V")
	@Override
	public void method6954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(ZZ)Lclient!fm;")
	@Override
	public Interface8 method5736(@OriginalArg(1) boolean arg0) {
		return new Class209(this, Static18.aClass19_5, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "A", descriptor = "(I)V")
	@Override
	protected void method5725() {
		if (this.aBoolean325) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean325 = true;
	}

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "(B)V")
	@Override
	protected void method5648() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray48);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIII[IIZ)Lclient!gka;")
	@Override
	public Interface9 method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		return new Class81_Sub1(this, arg2, arg4, arg5, arg3, 0, arg1);
	}

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "(I)V")
	@Override
	protected void method5665() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat95 * this.aFloat103, this.aFloat95 * this.aFloat104, this.aFloat106 * this.aFloat95, 0.0F);
		this.aBoolean325 = false;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BILclient!l;I)V")
	@Override
	public void method5698(@OriginalArg(1) int arg0, @OriginalArg(2) Class213 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static215.method3741(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZBILclient!gn;)V")
	@Override
	protected void method5738(@OriginalArg(2) int arg0, @OriginalArg(3) Class138 arg1) {
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 6;
		} else if (arg0 == 2) {
			local13 = 27;
		} else {
			local13 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, local13, Static215.method3740(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!hda", name = "F", descriptor = "(I)V")
	@Override
	protected void method5717() {
		this.anIDirect3DDevice1.a(174, this.aBoolean460);
	}

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "(II)V")
	@Override
	public void method5721(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6503, 11, arg0);
	}

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "(B)V")
	@Override
	protected void method5777() {
		this.anIDirect3DDevice1.a(14, this.aBoolean446 && this.aBoolean453);
	}

	@OriginalMember(owner = "client!hda", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!hda", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.d(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (hia.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (byte) -123) && hia.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), (byte) -123)) {
			local1 = new int[arg2 * arg3];
			@Pc(58) int local58 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local58) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					this.aPixelBuffer1.a(local1, local65 * arg2, local65 * local58, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(101);
		local16.b(117);
		return local1;
	}

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "(I)V")
	@Override
	protected void method5742() {
		this.anIDirect3DDevice1.a(27, this.aBoolean457);
	}

	@OriginalMember(owner = "client!hda", name = "x", descriptor = "()Z")
	@Override
	public boolean method6892() {
		return false;
	}
}
