import jaclib.peer.iw;
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
import jagdx.fh;
import jagdx.oo;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class65_Sub2_Sub1 extends Class65_Sub2 {

	@OriginalMember(owner = "client!cka", name = "Tg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!cka", name = "Wg", descriptor = "I")
	private int anInt1907 = 0;

	@OriginalMember(owner = "client!cka", name = "Ug", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!cka", name = "Xg", descriptor = "I")
	private final int anInt1908;

	@OriginalMember(owner = "client!cka", name = "Zg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!cka", name = "ah", descriptor = "I")
	private final int anInt1909;

	@OriginalMember(owner = "client!cka", name = "hh", descriptor = "Lclient!sq;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "client!cka", name = "bh", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!cka", name = "fh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!cka", name = "gh", descriptor = "Lclient!jaclib/peer/iw;")
	public final iw anIw1;

	@OriginalMember(owner = "client!cka", name = "dh", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!cka", name = "Vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!cka", name = "Lg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!cka", name = "Qg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!cka", name = "Og", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!cka", name = "Jg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!cka", name = "Pg", descriptor = "Z")
	public final boolean aBoolean166;

	@OriginalMember(owner = "client!cka", name = "Ig", descriptor = "Z")
	public final boolean aBoolean164;

	@OriginalMember(owner = "client!cka", name = "Ng", descriptor = "Z")
	public final boolean aBoolean165;

	@OriginalMember(owner = "client!cka", name = "ih", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!cka", name = "Sg", descriptor = "[Lclient!qt;")
	private final Class294[] aClass294Array1;

	@OriginalMember(owner = "client!cka", name = "Yg", descriptor = "[I")
	private final int[] anIntArray70;

	@OriginalMember(owner = "client!cka", name = "eh", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!cka", name = "Kg", descriptor = "[Z")
	private final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!cka", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!cka", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!wm;Ljava/lang/Integer;)Lclient!ha;")
	private static Class65 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class65_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) iw local9 = new iw();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(182) D3DPRESENT_PARAMETERS local182 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static82.method1755(local182, local3, local5, local13, arg3)) {
					throw new RuntimeException("");
				}
				local182.PresentationInterval = Integer.MIN_VALUE;
				local182.EnableAutoDepthStencil = true;
				local182.Windowed = true;
				@Pc(208) int local208 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local208 |= 0x10;
				}
				@Pc(229) IDirect3DDevice local229;
				try {
					local229 = local13.a(local3, local5, arg0, local208 | 0x40, local182);
				} catch (@Pc(231) fh local231) {
					local229 = local13.a(local3, local5, arg0, local208 | 0x20, local182);
				}
				@Pc(250) Class326 local250 = new Class326(local229.b(0), local229.c());
				local1 = new Class65_Sub2_Sub1(local3, local5, arg0, local9, local13, local229, local250, local182, local18, arg1, arg2, arg3);
				local1.method4361();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(273) RuntimeException local273) {
			if (local1 != null) {
				local1.method6904();
			}
			throw local273;
		}
	}

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/iw;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!sq;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!wm;I)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) iw arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class326 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class390 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt1908 = arg1;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt1909 = arg0;
			this.aClass326_1 = arg6;
			this.aD3DCAPS1 = arg8;
			this.anIDirect3D1 = arg4;
			this.anIw1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DLIGHT3 = new D3DLIGHT(this.anIw1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.anIw1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.anIw1);
			this.aPixelBuffer1 = new PixelBuffer(this.anIw1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.anIw1);
			new GeometryBuffer(this.anIw1);
			this.anInt5241 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean445 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean166 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean429 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.anInt5257 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean164 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean165 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean447 = this.anInt5243 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt1909, this.anInt1908, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray6 = new boolean[this.anInt5257];
			this.aClass294Array1 = new Class294[this.anInt5257];
			this.anIntArray70 = new int[this.anInt5257];
			this.aBooleanArray5 = new boolean[this.anInt5257];
			this.aBooleanArray3 = new boolean[this.anInt5257];
			this.aBooleanArray4 = new boolean[this.anInt5257];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(218) Throwable local218) {
			local218.printStackTrace();
			this.method6923();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cka", name = "Q", descriptor = "(I)V")
	@Override
	protected void method4437() {
		this.anIDirect3DDevice1.a(137, this.aBoolean436 && !this.aBoolean431);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!tn;BLclient!ds;)Z")
	@Override
	public boolean method4359(@OriginalArg(0) Class339 arg0, @OriginalArg(2) Class89 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return oo.a(false, this.anIDirect3D1.a(this.anInt1909, local10)) && oo.a(false, this.anIDirect3D1.CheckDeviceFormat(this.anInt1909, this.anInt1908, local10.Format, 0, 3, Static82.method1763(arg1, arg0)));
	}

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "(I)V")
	@Override
	protected void method4349() {
		@Pc(27) int local27 = this.aBooleanArray4[this.anInt5239] ? Static82.method1754(this.aClass178Array6[this.anInt5239]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, 4, local27);
	}

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "(II)V")
	@Override
	public void method6916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass326_1.method7651()) {
			this.anInt1907 = 0;
			if (oo.a((byte) -54, this.aClass326_1.method7652())) {
				this.method1752();
			}
		} else if (++this.anInt1907 <= 50) {
			this.method1752();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!ds;ILclient!tn;)Z")
	@Override
	public boolean method4424(@OriginalArg(0) Class89 arg0, @OriginalArg(2) Class339 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return oo.a(false, this.anIDirect3D1.a(this.anInt1909, local8)) && oo.a(false, this.anIDirect3D1.CheckDeviceFormat(this.anInt1909, this.anInt1908, local8.Format, 0, 4, Static82.method1763(arg0, arg1)));
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(BILclient!cq;)V")
	@Override
	public void method4427(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1) {
		@Pc(2) Class197 local2 = (Class197) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method4979());
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!md;)V")
	@Override
	public void method6877(@OriginalArg(0) Interface15 arg0) {
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method4386(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)V")
	@Override
	protected void method4375() {
		this.aFloat97 = (float) (this.anInt5260 - this.anInt5250);
		this.aFloat102 = this.aFloat97 - (float) this.anInt5263;
		if (this.aFloat102 < (float) this.anInt5242) {
			this.aFloat102 = (float) this.anInt5242;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat102);
		this.anIDirect3DDevice1.a(37, this.aFloat97);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt5246);
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(Z)V")
	@Override
	public void method6944(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cka", name = "jb", descriptor = "(I)Z")
	private boolean method1752() {
		@Pc(10) int local10 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local10 == 0 || local10 == -2005530519) {
			@Pc(21) Class326 local21 = (Class326) this.anObject8;
			this.method4431();
			local21.method7653();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static82.method1755(this.aD3DPRESENT_PARAMETERS1, this.anInt1909, this.anInt1908, this.anIDirect3D1, this.anInt5243)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (oo.a(false, local55)) {
					local21.method7654(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method4420();
					this.method4430();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "(B)V")
	@Override
	protected void method4416() {
		this.anIDirect3DDevice1.a(27, this.aBoolean434);
	}

	@OriginalMember(owner = "client!cka", name = "r", descriptor = "()Z")
	@Override
	public boolean method6929() {
		return false;
	}

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "(Z)V")
	@Override
	protected void method4467() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt5273);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!mja;I)V")
	public void method1753(@OriginalArg(0) Class8_Sub1 arg0) {
		this.method1757(arg0);
		if (this.aBooleanArray3[this.anInt5239] != arg0.aBoolean595) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 1, arg0.aBoolean595 ? 1 : 3);
			this.aBooleanArray3[this.anInt5239] = arg0.aBoolean595;
		}
		if (this.aBooleanArray6[this.anInt5239] != arg0.aBoolean594) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 2, arg0.aBoolean594 ? 1 : 3);
			this.aBooleanArray6[this.anInt5239] = arg0.aBoolean594;
		}
	}

	@OriginalMember(owner = "client!cka", name = "y", descriptor = "(I)V")
	@Override
	public void method4389() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray50[0], -this.aFloatArray50[1], -this.aFloatArray50[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray48[0], -this.aFloatArray48[1], -this.aFloatArray48[2]);
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I[Lclient!ls;)Lclient!co;")
	@Override
	public Class69 method4463(@OriginalArg(1) Class219[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!cka", name = "k", descriptor = "(Z)V")
	@Override
	protected void method4465() {
		if (this.aBooleanArray4[this.anInt5239]) {
			this.aBooleanArray4[this.anInt5239] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt5239, (IDirect3DBaseTexture) null);
			this.method4349();
			this.method4452();
		}
	}

	@OriginalMember(owner = "client!cka", name = "j", descriptor = "(B)V")
	@Override
	protected void method4428() {
		if (this.aBoolean427) {
			Static82.aFloatArray29[5] = 1.0F;
			Static82.aFloatArray29[1] = 0.0F;
			Static82.aFloatArray29[6] = 0.0F;
			Static82.aFloatArray29[14] = 0.0F;
			Static82.aFloatArray29[8] = 0.0F;
			Static82.aFloatArray29[7] = 0.0F;
			Static82.aFloatArray29[0] = 1.0F;
			Static82.aFloatArray29[4] = 0.0F;
			Static82.aFloatArray29[10] = 1.0F;
			Static82.aFloatArray29[13] = 0.0F;
			Static82.aFloatArray29[11] = 0.0F;
			Static82.aFloatArray29[15] = 1.0F;
			Static82.aFloatArray29[2] = 0.0F;
			Static82.aFloatArray29[9] = 0.0F;
			Static82.aFloatArray29[3] = 0.0F;
			Static82.aFloatArray29[12] = 0.0F;
		} else {
			this.aClass254_Sub2_15.method6231(Static82.aFloatArray29);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static82.aFloatArray29);
	}

	@OriginalMember(owner = "client!cka", name = "o", descriptor = "(I)V")
	@Override
	protected void method4355() {
		this.anIDirect3DDevice1.a(14, this.aBoolean442 && this.aBoolean439);
	}

	@OriginalMember(owner = "client!cka", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(ZI)V")
	@Override
	public void method4382(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, 11, arg0);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!hu;ZII)V")
	@Override
	public void method4450(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static82.method1758(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "([[IIZI)Lclient!lha;")
	@Override
	public Interface14 method4387(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class8_Sub2(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!co;I)V")
	@Override
	public void method4447(@OriginalArg(0) Class69 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!cka", name = "s", descriptor = "(I)V")
	@Override
	protected void method4368() {
		this.anIDirect3DDevice1.SetViewport(this.anInt5274, this.anInt5249, this.anInt5222, this.anInt5126, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;B)V")
	public void method1756(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!cka", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (oo.a(false, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && oo.a(false, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.a(local1, arg2 * local72, local72 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(true);
		local16.a(true);
		return local1;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(BLclient!ae;)V")
	public void method1757(@OriginalArg(1) Class8 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt5239, arg0.method6358());
		if (arg0.aClass294_9 != this.aClass294Array1[this.anInt5239]) {
			@Pc(63) int local63 = Static82.method1764(arg0.aClass294_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 6, local63);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 5, local63);
			this.aClass294Array1[this.anInt5239] = arg0.aClass294_9;
			if (arg0.aBoolean648 != this.aBooleanArray5[this.anInt5239]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 7, arg0.aBoolean648 ? Static82.method1764(arg0.aClass294_9) : 0);
				this.aBooleanArray5[this.anInt5239] = arg0.aBoolean648;
			}
		} else if (arg0.aBoolean648 != this.aBooleanArray5[this.anInt5239]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 7, arg0.aBoolean648 ? Static82.method1764(arg0.aClass294_9) : 0);
			this.aBooleanArray5[this.anInt5239] = arg0.aBoolean648;
		}
		if (!this.aBooleanArray4[this.anInt5239]) {
			this.aBooleanArray4[this.anInt5239] = true;
			this.method4349();
			this.method4452();
		}
	}

	@OriginalMember(owner = "client!cka", name = "W", descriptor = "(I)V")
	@Override
	protected void method4452() {
		@Pc(15) int local15 = this.aBooleanArray4[this.anInt5239] ? Static82.method1754(this.aClass178Array5[this.anInt5239]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, 1, local15);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!tea;Lclient!tea;FLclient!tea;)Lclient!tea;")
	@Override
	public Class57 method6949(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "()Lclient!fga;")
	@Override
	public Class118 method6878() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt1909, 0);
		return new Class118(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(BZ)Lclient!cq;")
	@Override
	public Interface3 method4374(@OriginalArg(1) boolean arg0) {
		return new Class197(this, arg0);
	}

	@OriginalMember(owner = "client!cka", name = "m", descriptor = "(I)V")
	@Override
	protected void method4351() {
		if (this.aClass173_4.method4244()) {
			this.aClass254_Sub2_18.method6231(Static82.aFloatArray29);
		} else {
			Static82.aFloatArray29[8] = 0.0F;
			Static82.aFloatArray29[13] = 0.0F;
			Static82.aFloatArray29[0] = 1.0F;
			Static82.aFloatArray29[4] = 0.0F;
			Static82.aFloatArray29[6] = 0.0F;
			Static82.aFloatArray29[3] = 0.0F;
			Static82.aFloatArray29[7] = 0.0F;
			Static82.aFloatArray29[15] = 1.0F;
			Static82.aFloatArray29[14] = 0.0F;
			Static82.aFloatArray29[1] = 0.0F;
			Static82.aFloatArray29[5] = 1.0F;
			Static82.aFloatArray29[10] = 1.0F;
			Static82.aFloatArray29[11] = 0.0F;
			Static82.aFloatArray29[12] = 0.0F;
			Static82.aFloatArray29[2] = 0.0F;
			Static82.aFloatArray29[9] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static82.aFloatArray29);
	}

	@OriginalMember(owner = "client!cka", name = "S", descriptor = "(I)V")
	@Override
	protected void method4440() {
		this.anIDirect3DDevice1.a(28, this.aBoolean430 && this.aBoolean441 && this.anInt5263 >= 0);
	}

	@OriginalMember(owner = "client!cka", name = "f", descriptor = "(ZI)V")
	@Override
	public void method4436(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!cka", name = "V", descriptor = "(I)V")
	@Override
	protected void method4444() {
		if (Static49.aClass239_1 == this.aClass239_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static625.aClass239_7 == this.aClass239_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static204.aClass239_4 == this.aClass239_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6888(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6918(@OriginalArg(0) int arg0) {
		this.anIw1.c(9592);
		super.method6918(arg0);
	}

	@OriginalMember(owner = "client!cka", name = "t", descriptor = "(I)V")
	@Override
	protected void method4370() {
		this.anIDirect3DDevice1.a(15, this.aBoolean446);
	}

	@OriginalMember(owner = "client!cka", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZIIB[III)Lclient!w;")
	@Override
	public Interface27 method4464(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class8_Sub1(this, arg2, arg4, arg0, arg3, 0, arg5);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!iea;I)V")
	@Override
	public void method4347(@OriginalArg(0) Class162 arg0) {
		@Pc(5) int local5 = 0;
		if (Static287.aClass162_3 == arg0) {
			local5 = 65536;
		} else if (arg0 == Static448.aClass162_5) {
			local5 = 131072;
		} else if (Static122.aClass162_6 == arg0) {
			local5 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, 11, local5 | this.anInt5239);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!od;Lclient!ic;)Lclient!md;")
	@Override
	public Interface15 method6942(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!ov;B)V")
	public void method1759(@OriginalArg(0) Class8_Sub3 arg0) {
		this.method1757(arg0);
		if (!this.aBooleanArray3[this.anInt5239]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 1, 1);
			this.aBooleanArray3[this.anInt5239] = true;
		}
		if (!this.aBooleanArray6[this.anInt5239]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5239, 2, 1);
			this.aBooleanArray6[this.anInt5239] = true;
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILclient!ds;IILclient!tn;)Lclient!w;")
	@Override
	public Interface27 method4348(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class339 arg3) {
		return new Class8_Sub1(this, arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6912(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6916(arg2, arg3);
	}

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "(B)V")
	@Override
	protected void method4407() {
		this.method4448();
		this.method4383();
	}

	@OriginalMember(owner = "client!cka", name = "F", descriptor = "(I)V")
	@Override
	protected void method4409() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt5247 + this.anInt5274, this.anInt5261 + this.anInt5249, this.anInt5264, this.anInt5236);
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(II)Lclient!od;")
	@Override
	public Interface19 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cka", name = "T", descriptor = "(I)F")
	@Override
	protected float method4441() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "(B)V")
	@Override
	protected void method4383() {
		if (this.aBoolean167) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!cka", name = "D", descriptor = "(I)V")
	@Override
	protected void method4403() {
		this.anIDirect3DDevice1.a(174, this.aBoolean448);
	}

	@OriginalMember(owner = "client!cka", name = "n", descriptor = "()V")
	@Override
	public void method6909() {
	}

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "()V")
	@Override
	protected void method6904() {
		this.anIw1.b(-95);
		super.method6904();
	}

	@OriginalMember(owner = "client!cka", name = "k", descriptor = "(B)V")
	@Override
	protected void method4430() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5257; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass294Array1[local1] = Static516.aClass294_10;
			this.aBooleanArray3[local1] = this.aBooleanArray6[local1] = true;
			this.aBooleanArray5[local1] = false;
			this.anIntArray70[local1] = 0;
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
		this.aD3DLIGHT1.SetType(3);
		this.aD3DLIGHT2.SetType(1);
		this.aBoolean167 = false;
		super.method4430();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IILclient!tn;I[BI)Lclient!ii;")
	@Override
	public Interface10 method4350(@OriginalArg(2) Class339 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class8_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "(B)V")
	@Override
	protected void method4438() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5235; local1++) {
			@Pc(10) Class5_Sub18 local10 = this.aClass5_Sub18Array4[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method8058();
			@Pc(26) float local26 = local10.method8054() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method8055(), (float) local10.method8051(), (float) local10.method8057());
			this.aD3DLIGHT2.SetDiffuse(local26 * (float) (local18 >> 16 & 0xFF), local26 * (float) (local18 >> 8 & 0xFF), local26 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method8056() * local10.method8056()));
			this.aD3DLIGHT2.SetRange((float) local10.method8056());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt5272) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4438();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZLclient!cja;I)V")
	@Override
	protected void method4362(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		@Pc(15) byte local15;
		if (arg0 == 1) {
			local15 = 6;
		} else if (arg0 == 2) {
			local15 = 27;
		} else {
			local15 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, local15, Static82.method1760(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIILclient!hu;ZLclient!jj;I)V")
	@Override
	public void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) Interface12 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class51) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static82.method1758(arg3), 0, arg2, arg1, arg0, arg5);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4473(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method1762(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method4381();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "([BILclient!tn;ZIIIB)Lclient!w;")
	@Override
	protected Interface27 method4365(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class339 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		return new Class8_Sub1(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!cka", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4445(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!cka", name = "p", descriptor = "(I)V")
	@Override
	protected void method4357() {
	}

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "(II)Lclient!ic;")
	@Override
	public Interface9 method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cka", name = "t", descriptor = "()Z")
	@Override
	public boolean method6934() {
		return false;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4373(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas10 != arg1) {
			return;
		}
		@Pc(6) Dimension local6 = arg1.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method1752();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(BI)Lclient!tu;")
	@Override
	protected Class18 method4354(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class18_Sub5(this, this.aClass390_68);
		} else if (arg0 == 4) {
			return new Class18_Sub4(this, this.aClass390_68, this.aClass179_5);
		} else if (arg0 == 8) {
			return new Class18_Sub8(this, this.aClass390_68, this.aClass179_5);
		} else {
			return super.method4354(arg0);
		}
	}

	@OriginalMember(owner = "client!cka", name = "z", descriptor = "(I)V")
	@Override
	protected void method4393() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat99 * this.aFloat106, this.aFloat99 * this.aFloat107, this.aFloat99 * this.aFloat112, (float) 0);
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZI[FIILclient!tn;I)Lclient!w;")
	@Override
	protected Interface27 method4474(@OriginalArg(1) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class339 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!cka", name = "o", descriptor = "()V")
	@Override
	public void method6910() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (oo.a(false, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(true);
	}

	@OriginalMember(owner = "client!cka", name = "u", descriptor = "()V")
	@Override
	public void method6940() {
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!cka", name = "q", descriptor = "(B)V")
	@Override
	protected void method4454() {
		this.anIDirect3DDevice1.a(7, this.aBoolean440);
	}

	@OriginalMember(owner = "client!cka", name = "y", descriptor = "()V")
	@Override
	public void method6959() {
	}

	@OriginalMember(owner = "client!cka", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZI)Lclient!jj;")
	@Override
	public Interface12 method4364(@OriginalArg(0) boolean arg0) {
		return new Class51(this, Static120.aClass89_8, arg0);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method4415(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass326_1 = (Class326) arg0;
	}

	@OriginalMember(owner = "client!cka", name = "w", descriptor = "(I)V")
	@Override
	protected void method4381() {
		if (this.anIDirect3DVertexShader1 != null || this.aClass198Array3[this.anInt5239] == Static378.aClass198_2) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, 24, 0);
			this.anIntArray70[this.anInt5239] = 0;
			return;
		}
		if (this.aClass198Array3[this.anInt5239] == Static102.aClass198_1) {
			this.anIDirect3DDevice1.SetTransform(this.anInt5239 + 16, this.aClass254_Sub2Array3[this.anInt5239].method6234(Static82.aFloatArray29));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt5239 + 16, this.aClass254_Sub2Array3[this.anInt5239].method6231(Static82.aFloatArray29));
		}
		@Pc(59) int local59 = Static82.method1761(this.aClass198Array3[this.anInt5239]);
		if (this.anIntArray70[this.anInt5239] != local59) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, 24, local59);
			this.anIntArray70[this.anInt5239] = local59;
		}
	}

	@OriginalMember(owner = "client!cka", name = "z", descriptor = "()V")
	@Override
	public void method6961() {
	}

	@OriginalMember(owner = "client!cka", name = "fb", descriptor = "(I)V")
	@Override
	protected void method4475() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray46);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IILclient!cja;ZZ)V")
	@Override
	public void method4388(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) byte local15;
		if (arg0 == 1) {
			local15 = 3;
		} else if (arg0 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		@Pc(23) int local23 = 0;
		if (arg2) {
			local23 = 32;
		}
		if (arg3) {
			local23 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5239, local15, Static82.method1760(arg1) | local23);
	}

	@OriginalMember(owner = "client!cka", name = "n", descriptor = "(B)V")
	@Override
	protected void method4448() {
		@Pc(7) float local7 = this.aBoolean433 ? this.aFloat101 : 0.0F;
		@Pc(16) float local16 = this.aBoolean433 ? -this.aFloat104 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat106, this.aFloat107 * local7, local7 * this.aFloat112, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat106 * local16, local16 * this.aFloat107, local16 * this.aFloat112, 0.0F);
		this.aBoolean167 = false;
	}
}
