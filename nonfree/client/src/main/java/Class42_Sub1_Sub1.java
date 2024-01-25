import jaclib.peer.fk;
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
import jagdx.di;
import jagdx.wu;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class42_Sub1_Sub1 extends Class42_Sub1 {

	@OriginalMember(owner = "client!bv", name = "Mg", descriptor = "I")
	private int anInt1361 = 0;

	@OriginalMember(owner = "client!bv", name = "Fg", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!bv", name = "yg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!bv", name = "Dg", descriptor = "Lclient!mf;")
	private Class201 aClass201_1;

	@OriginalMember(owner = "client!bv", name = "Gg", descriptor = "I")
	private final int anInt1360;

	@OriginalMember(owner = "client!bv", name = "Ig", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!bv", name = "zg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!bv", name = "Kg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!bv", name = "Pg", descriptor = "Lclient!jaclib/peer/fk;")
	public final fk aFk1;

	@OriginalMember(owner = "client!bv", name = "Xg", descriptor = "I")
	private final int anInt1362;

	@OriginalMember(owner = "client!bv", name = "Rg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!bv", name = "Yg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!bv", name = "Hg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!bv", name = "Ng", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!bv", name = "Lg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!bv", name = "Bg", descriptor = "Z")
	public final boolean aBoolean92;

	@OriginalMember(owner = "client!bv", name = "Cg", descriptor = "Z")
	public final boolean aBoolean93;

	@OriginalMember(owner = "client!bv", name = "Qg", descriptor = "Z")
	public final boolean aBoolean95;

	@OriginalMember(owner = "client!bv", name = "Ug", descriptor = "[I")
	private final int[] anIntArray126;

	@OriginalMember(owner = "client!bv", name = "Eg", descriptor = "[Lclient!fj;")
	private final Class101[] aClass101Array1;

	@OriginalMember(owner = "client!bv", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!bv", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!bv", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!bv", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!bv", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!n;Lclient!an;Ljava/lang/Integer;)Lclient!qa;")
	private static Class42 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class42_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) fk local9 = new fk();
			@Pc(13) IDirect3D local13 = IDirect3D.a(-2147483616, local9);
			@Pc(18) D3DADAPTER_IDENTIFIER local18 = local13.a(local3, 0);
			if (local18.VendorID == 32902) {
				throw new RuntimeException("");
			}
			@Pc(35) D3DCAPS local35 = local13.b(local3, local5);
			if ((local35.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local35.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local35.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local35.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local35.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local35.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local35.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local35.SrcBlendCaps & local35.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local35.DestBlendCaps & 0x20 & local35.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local35.SrcBlendCaps & 0x2 & local35.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local35.MaxActiveLights > 0 && local35.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local35.MaxStreams >= 5) {
				@Pc(198) D3DPRESENT_PARAMETERS local198 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static50.method1348(local5, local198, arg3, local13, local3)) {
					throw new RuntimeException("");
				}
				local198.Windowed = true;
				local198.EnableAutoDepthStencil = true;
				local198.PresentationInterval = Integer.MIN_VALUE;
				@Pc(223) int local223 = 2;
				if ((local35.DevCaps & 0x100000) != 0) {
					local223 |= 0x10;
				}
				@Pc(245) IDirect3DDevice local245;
				try {
					local245 = local13.a(local3, local5, arg0, local223 | 0x40, local198);
				} catch (@Pc(247) di local247) {
					local245 = local13.a(local3, local5, arg0, local223 | 0x20, local198);
				}
				@Pc(266) Class201 local266 = new Class201(local245.b(0), local245.c());
				local1 = new Class42_Sub1_Sub1(local3, local5, arg0, local9, local13, local245, local266, local198, local35, arg1, arg2, arg3);
				local1.method5887();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(289) RuntimeException local289) {
			if (local1 != null) {
				local1.method5800();
			}
			throw local289;
		}
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/fk;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!mf;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!n;Lclient!an;I)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) fk arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class201 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface11 arg9, @OriginalArg(10) Class16 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anIDirect3DDevice1 = arg5;
		this.aClass201_1 = arg6;
		this.anInt1360 = arg1;
		this.aD3DCAPS1 = arg8;
		this.anIDirect3D1 = arg4;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aFk1 = arg3;
		this.anInt1362 = arg0;
		this.aD3DLIGHT2 = new D3DLIGHT(this.aFk1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aFk1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aFk1);
		this.aPixelBuffer1 = new PixelBuffer(this.aFk1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aFk1);
		this.aBoolean92 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean93 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean95 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean502 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean501 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt7101 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.anInt7129 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean511 = this.anInt7121 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt1362, this.anInt1360, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.anIntArray126 = new int[this.anInt7129];
		this.aClass101Array1 = new Class101[this.anInt7129];
		this.aBooleanArray11 = new boolean[this.anInt7129];
		this.aBooleanArray14 = new boolean[this.anInt7129];
		this.aBooleanArray13 = new boolean[this.anInt7129];
		this.aBooleanArray12 = new boolean[this.anInt7129];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method5821();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(234) Exception_Sub1 local234) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(B)V")
	@Override
	protected void method5892() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat165 * this.aFloat158, this.aFloat169 * this.aFloat165, this.aFloat168 * this.aFloat165, 1.0F);
		this.aBoolean94 = false;
	}

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (wu.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1), (byte) 74) && wu.a(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), (byte) -114)) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(67) int local67 = 0; local67 < arg3; local67++) {
					this.aPixelBuffer1.a(local1, arg2 * local67, local56 * local67, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -74);
		local16.a((byte) 123);
		return local1;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZB)Lclient!uj;")
	@Override
	public Interface18 method5906(@OriginalArg(0) boolean arg0) {
		return new Class283(this, Static155.aClass114_7, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "()V")
	@Override
	public void method5845() {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BILclient!vf;Z)V")
	@Override
	protected void method5869(@OriginalArg(1) int arg0, @OriginalArg(2) Class302 arg1) {
		@Pc(16) byte local16;
		if (arg0 == 1) {
			local16 = 6;
		} else if (arg0 == 2) {
			local16 = 27;
		} else {
			local16 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, local16, Static50.method1349(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!bv", name = "C", descriptor = "(I)V")
	@Override
	protected void method5950() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray61);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
	@Override
	public void method5792() {
		this.method5885(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!bv", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "(Z)V")
	@Override
	protected void method5968() {
		@Pc(27) int local27 = this.aBooleanArray14[this.anInt7107] ? Static50.method1342(this.aClass129Array6[this.anInt7107]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, 1, local27);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!sv;Lclient!sv;FLclient!sv;)Lclient!sv;")
	@Override
	public Class124 method5805(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class124 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "()Z")
	@Override
	public boolean method5836() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!mn;B)V")
	public void method1341(@OriginalArg(0) Class204_Sub1 arg0) {
		this.method1343(arg0);
		if (!this.aBooleanArray13[this.anInt7107]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 1, 1);
			this.aBooleanArray13[this.anInt7107] = true;
		}
		if (!this.aBooleanArray12[this.anInt7107]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 2, 1);
			this.aBooleanArray12[this.anInt7107] = true;
		}
	}

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "(II)V")
	@Override
	public void method5996(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, 11, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5984(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!bv", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return 0;
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "(Z)F")
	@Override
	protected float method5920() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
	@Override
	public void method5806(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "D", descriptor = "(I)V")
	@Override
	protected void method5954() {
		if (!this.aBoolean94) {
			this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
			this.aBoolean94 = true;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5910(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5895() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7129; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass101Array1[local1] = Static342.aClass101_4;
			this.aBooleanArray13[local1] = this.aBooleanArray12[local1] = true;
			this.aBooleanArray11[local1] = false;
			this.anIntArray126[local1] = 0;
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
		this.aBoolean94 = false;
		super.method5895();
	}

	@OriginalMember(owner = "client!bv", name = "G", descriptor = "(I)V")
	@Override
	protected void method5963() {
		this.aD3DLIGHT2.SetDiffuse(this.aFloat167 * this.aFloat158, this.aFloat169 * this.aFloat167, this.aFloat168 * this.aFloat167, 1.0F);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat158 * -this.aFloat163, this.aFloat169 * -this.aFloat163, this.aFloat168 * -this.aFloat163, 1.0F);
		this.aBoolean94 = false;
	}

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "(I)V")
	@Override
	protected void method5913() {
		this.anIDirect3DDevice1.a(15, this.aBoolean504);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5803(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "()V")
	@Override
	public void method5794() {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZIILclient!dk;II[BI)Lclient!wn;")
	@Override
	protected Interface20 method5914(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class72 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		return new Class204_Sub2(this, arg2, arg3, arg1, arg0, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "(Z)V")
	@Override
	protected void method5925() {
		this.anIDirect3DDevice1.a(174, this.aBoolean516);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!or;)V")
	public void method1343(@OriginalArg(1) Class204 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7107, arg0.method6852());
		if (arg0.aClass101_11 != this.aClass101Array1[this.anInt7107]) {
			@Pc(65) int local65 = Static50.method1340(arg0.aClass101_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 6, local65);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 5, local65);
			this.aClass101Array1[this.anInt7107] = arg0.aClass101_11;
			if (arg0.aBoolean565 != this.aBooleanArray11[this.anInt7107]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 7, arg0.aBoolean565 ? Static50.method1340(arg0.aClass101_11) : 0);
				this.aBooleanArray11[this.anInt7107] = arg0.aBoolean565;
			}
		} else if (arg0.aBoolean565 != this.aBooleanArray11[this.anInt7107]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 7, arg0.aBoolean565 ? Static50.method1340(arg0.aClass101_11) : 0);
			this.aBooleanArray11[this.anInt7107] = arg0.aBoolean565;
		}
		if (!this.aBooleanArray14[this.anInt7107]) {
			this.aBooleanArray14[this.anInt7107] = true;
			this.method5971();
			this.method5968();
		}
	}

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "()Z")
	@Override
	public boolean method5842() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIIZI[II)Lclient!wn;")
	@Override
	public Interface20 method5876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class204_Sub2(this, arg5, arg1, arg2, arg4, 0, arg3);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!lu;IZ)V")
	@Override
	public void method5877(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class316 local2 = (Class316) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method7900());
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(ZI)V")
	@Override
	public void method5985(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5999(@OriginalArg(0) Class287 arg0) {
		@Pc(10) dxVertexLayout local10 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local10.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "()V")
	@Override
	protected void method5800() {
		this.aFk1.a(-21036);
		super.method5800();
	}

	@OriginalMember(owner = "client!bv", name = "B", descriptor = "(I)V")
	@Override
	protected void method5948() {
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean514);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean514);
	}

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "(B)V")
	@Override
	protected void method5902() {
		if (this.aClass299Array3[this.anInt7107] == Static339.aClass299_3) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, 24, 0);
			this.anIntArray126[this.anInt7107] = 0;
			return;
		}
		if (this.aClass299Array3[this.anInt7107] == Static365.aClass299_4) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7107 + 16, this.aClass91_Sub2Array3[this.anInt7107].method5503(Static50.aFloatArray24));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7107 + 16, this.aClass91_Sub2Array3[this.anInt7107].method5493(Static50.aFloatArray24));
		}
		@Pc(62) int local62 = Static50.method1345(this.aClass299Array3[this.anInt7107]);
		if (this.anIntArray126[this.anInt7107] != local62) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, 24, local62);
			this.anIntArray126[this.anInt7107] = local62;
		}
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "()V")
	@Override
	public void method5821() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass201_1.method4841()) {
			this.anInt1361 = 0;
			if (wu.a(115, (int) this.aClass201_1.method4839())) {
				this.method1346();
			}
		} else if (++this.anInt1361 <= 50) {
			this.method1346();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!dk;I[FIIIZ)Lclient!wn;")
	@Override
	protected Interface20 method5880(@OriginalArg(1) Class72 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([[IIZZ)Lclient!jg;")
	@Override
	public Interface8 method5947(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class204_Sub3(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "(I)V")
	@Override
	protected void method5965() {
		if (this.aClass4_6.method202()) {
			this.aClass91_Sub2_18.method5503(Static50.aFloatArray24);
		} else {
			Static50.aFloatArray24[10] = 1.0F;
			Static50.aFloatArray24[2] = 0.0F;
			Static50.aFloatArray24[7] = 0.0F;
			Static50.aFloatArray24[1] = 0.0F;
			Static50.aFloatArray24[0] = 1.0F;
			Static50.aFloatArray24[11] = 0.0F;
			Static50.aFloatArray24[6] = 0.0F;
			Static50.aFloatArray24[5] = 1.0F;
			Static50.aFloatArray24[13] = 0.0F;
			Static50.aFloatArray24[14] = 0.0F;
			Static50.aFloatArray24[8] = 0.0F;
			Static50.aFloatArray24[9] = 0.0F;
			Static50.aFloatArray24[12] = 0.0F;
			Static50.aFloatArray24[3] = 0.0F;
			Static50.aFloatArray24[4] = 0.0F;
			Static50.aFloatArray24[15] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static50.aFloatArray24);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZILclient!uj;IIILclient!io;)V")
	@Override
	public void method5986(@OriginalArg(1) int arg0, @OriginalArg(2) Interface18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class147 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class283) arg1).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static50.method1344(arg5), 0, arg2, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)V")
	@Override
	protected void method5882() {
		this.anIDirect3DDevice1.a(28, this.aBoolean512 && this.aBoolean500 && this.aBoolean508 | this.anInt7104 >= 0);
	}

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "(Z)V")
	@Override
	protected void method5938() {
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)V")
	@Override
	protected void method5872() {
		this.anIDirect3DDevice1.a(7, this.aBoolean509);
	}

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "(B)V")
	@Override
	protected void method5941() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7134);
	}

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "(I)V")
	@Override
	public void method5874() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray58[0], -this.aFloatArray58[1], -this.aFloatArray58[2]);
		this.aBoolean94 = false;
	}

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "(B)Z")
	private boolean method1346() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(15) Class201 local15 = (Class201) this.anObject11;
			this.method5956();
			local15.method4840();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static50.method1348(this.anInt1360, this.aD3DPRESENT_PARAMETERS1, this.anInt7121, this.anIDirect3D1, this.anInt1362)) {
				@Pc(49) int local49 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (wu.a(local49, (byte) 99)) {
					local15.method4842(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.c());
					this.method5904();
					this.method5895();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "U", descriptor = "(I)V")
	@Override
	protected void method5992() {
		if (this.aClass187_26 == Static220.aClass187_18) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass187_26 == Static301.aClass187_21) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass187_26 == Static22.aClass187_34) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "(I)V")
	@Override
	protected void method5926() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7119, this.anInt7106, this.anInt7027, this.anInt7054, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "(B)V")
	@Override
	protected void method5932() {
		this.anIDirect3DDevice1.a(14, this.aBoolean499 && this.aBoolean513);
	}

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "()V")
	@Override
	public void method5816() {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5835(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5821();
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "()V")
	@Override
	public void method5810() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (!wu.a(local3.Issue(), (byte) 15)) {
			return;
		}
		while (true) {
			@Pc(11) int local11 = local3.IsSignaled();
			if (local11 != 1) {
				break;
			}
			Thread.yield();
		}
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "(I)V")
	@Override
	protected void method5884() {
		this.anIDirect3DDevice1.a(27, this.aBoolean515);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5896(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass201_1 = (Class201) arg1;
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(I)V")
	@Override
	protected void method5878() {
		if (this.aBoolean508) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt7127);
			return;
		}
		this.aFloat162 = this.anInt7128 - this.anInt7120;
		this.aFloat166 = this.aFloat162 - (float) this.anInt7104;
		if ((float) this.anInt7126 > this.aFloat166) {
			this.aFloat166 = this.anInt7126;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat166);
		this.anIDirect3DDevice1.a(37, this.aFloat162);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7132);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!dk;Lclient!ge;)Z")
	@Override
	public boolean method5911(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class114 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = this.anIDirect3D1.b(this.anInt1362);
		return wu.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt1362, this.anInt1360, local9.Format, 0, 3, Static50.method1347(arg1, arg0)), (byte) 95);
	}

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "(I)V")
	@Override
	protected void method5944() {
		if (this.aBooleanArray14[this.anInt7107]) {
			this.aBooleanArray14[this.anInt7107] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7107, null);
			this.method5971();
			this.method5968();
		}
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method5861(@OriginalArg(0) int arg0) {
		this.aFk1.b(77);
		super.method5861(arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILclient!dk;I[B)Lclient!uda;")
	@Override
	public Interface17 method5962(@OriginalArg(3) Class72 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class204_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!bv", name = "R", descriptor = "(I)V")
	@Override
	protected void method5989() {
		if (this.aBoolean497) {
			Static50.aFloatArray24[8] = 0.0F;
			Static50.aFloatArray24[13] = 0.0F;
			Static50.aFloatArray24[2] = 0.0F;
			Static50.aFloatArray24[1] = 0.0F;
			Static50.aFloatArray24[7] = 0.0F;
			Static50.aFloatArray24[0] = 1.0F;
			Static50.aFloatArray24[15] = 1.0F;
			Static50.aFloatArray24[4] = 0.0F;
			Static50.aFloatArray24[11] = 0.0F;
			Static50.aFloatArray24[12] = 0.0F;
			Static50.aFloatArray24[5] = 1.0F;
			Static50.aFloatArray24[9] = 0.0F;
			Static50.aFloatArray24[14] = 0.0F;
			Static50.aFloatArray24[6] = 0.0F;
			Static50.aFloatArray24[10] = 1.0F;
			Static50.aFloatArray24[3] = 0.0F;
		} else {
			this.aClass91_Sub2_15.method5503(Static50.aFloatArray24);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static50.aFloatArray24);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!dk;Lclient!ge;)Z")
	@Override
	public boolean method5923(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class114 arg1) {
		@Pc(13) D3DDISPLAYMODE local13 = this.anIDirect3D1.b(this.anInt1362);
		return wu.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt1362, this.anInt1360, local13.Format, 0, 4, Static50.method1347(arg1, arg0)), (byte) -72);
	}

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "(B)V")
	@Override
	protected void method5924() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7119 + this.anInt7124, this.anInt7106 + this.anInt7111, this.anInt7116, this.anInt7130);
	}

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "()Lclient!la;")
	@Override
	public Class179 method5828() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt1362, 0);
		return new Class179(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIILclient!io;)V")
	@Override
	public void method5937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class147 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static50.method1344(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "(B)V")
	@Override
	protected void method5939() {
		this.anIDirect3DDevice1.a(137, this.bf && !this.aBoolean507);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZILclient!vf;I)V")
	@Override
	public void method5983(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class302 arg3) {
		@Pc(13) byte local13;
		if (arg2 == 1) {
			local13 = 3;
		} else if (arg2 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(21) int local21 = 0;
		if (arg0) {
			local21 = 32;
		}
		if (arg1) {
			local21 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, local13, local21 | Static50.method1349(arg3));
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method5946(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == this.aCanvas13) {
			this.anIDirect3DDevice1.EndScene();
			this.method1346();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lclient!ds;Z)Lclient!tq;")
	@Override
	public Class287 method5940(@OriginalArg(0) Class75[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BZ)Lclient!lu;")
	@Override
	public Interface10 method5930(@OriginalArg(1) boolean arg0) {
		return new Class316(this, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "(I)V")
	@Override
	protected void method5971() {
		@Pc(15) int local15 = this.aBooleanArray14[this.anInt7107] ? Static50.method1342(this.aClass129Array5[this.anInt7107]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, 4, local15);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!on;)V")
	public void method1350(@OriginalArg(1) Class204_Sub2 arg0) {
		this.method1343(arg0);
		if (this.aBooleanArray13[this.anInt7107] != arg0.aBoolean488) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 1, arg0.aBoolean488 ? 1 : 3);
			this.aBooleanArray13[this.anInt7107] = arg0.aBoolean488;
		}
		if (this.aBooleanArray12[this.anInt7107] != arg0.aBoolean489) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7107, 2, arg0.aBoolean489 ? 1 : 3);
			this.aBooleanArray12[this.anInt7107] = arg0.aBoolean489;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!vc;I)V")
	@Override
	public void method5972(@OriginalArg(0) Class301 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static156.aClass301_2) {
			local1 = 65536;
		} else if (Static19.aClass301_1 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static230.aClass301_4) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7107, 11, local1 | this.anInt7107);
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(II)Lclient!cj;")
	@Override
	protected Class21 method5978(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class21_Sub5(this, this.aClass16_91);
		} else if (arg0 == 4) {
			return new Class21_Sub7(this, this.aClass16_91, this.aClass236_5);
		} else {
			return super.method5978(arg0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "O", descriptor = "(I)V")
	@Override
	protected void method5981() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7139; local1++) {
			@Pc(14) Class12_Sub7 local14 = this.aClass12_Sub7Array4[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method5118();
			@Pc(28) float local28 = local14.method5125() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method5124(), (float) local14.method5120(), (float) local14.method5117());
			this.aD3DLIGHT1.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, local28 * (float) (local22 >> 8 & 0xFF), local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method5123() * local14.method5123()));
			this.aD3DLIGHT1.SetRange((float) local14.method5123());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt7135 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5981();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ge;Lclient!dk;BII)Lclient!wn;")
	@Override
	public Interface20 method5952(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class204_Sub2(this, arg1, arg0, arg3, arg2);
	}
}
