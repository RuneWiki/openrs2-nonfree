import jaclib.peer.am;
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
import jagdx.bs;
import jagdx.qr;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class100_Sub1_Sub1 extends Class100_Sub1 {

	@OriginalMember(owner = "client!gaa", name = "wg", descriptor = "I")
	private int anInt3443 = 0;

	@OriginalMember(owner = "client!gaa", name = "Ng", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!gaa", name = "zg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!gaa", name = "Qg", descriptor = "I")
	private final int anInt3445;

	@OriginalMember(owner = "client!gaa", name = "Eg", descriptor = "I")
	private final int anInt3444;

	@OriginalMember(owner = "client!gaa", name = "Mg", descriptor = "Lclient!jaclib/peer/am;")
	public final am anAm1;

	@OriginalMember(owner = "client!gaa", name = "Hg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!gaa", name = "tg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!gaa", name = "Rg", descriptor = "Lclient!oo;")
	private Class247 aClass247_1;

	@OriginalMember(owner = "client!gaa", name = "Bg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!gaa", name = "vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!gaa", name = "Jg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!gaa", name = "Ig", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!gaa", name = "Lg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!gaa", name = "Pg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!gaa", name = "Ag", descriptor = "Z")
	public final boolean aBoolean280;

	@OriginalMember(owner = "client!gaa", name = "Kg", descriptor = "Z")
	public final boolean aBoolean282;

	@OriginalMember(owner = "client!gaa", name = "Fg", descriptor = "Z")
	public final boolean aBoolean281;

	@OriginalMember(owner = "client!gaa", name = "sg", descriptor = "[Z")
	private final boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!gaa", name = "Gg", descriptor = "[I")
	private final int[] anIntArray193;

	@OriginalMember(owner = "client!gaa", name = "Cg", descriptor = "[Z")
	private final boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!gaa", name = "yg", descriptor = "[Lclient!mv;")
	private final Class227[] aClass227Array1;

	@OriginalMember(owner = "client!gaa", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!gaa", name = "ug", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!gaa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!pl;Ljava/lang/Integer;)Lclient!r;")
	private static Class100 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class100_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) am local9 = new am();
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
			} else if ((local18.DestBlendCaps & 0x10 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(179) D3DPRESENT_PARAMETERS local179 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static160.method2852(local3, arg3, local5, local179, local13)) {
					throw new RuntimeException("");
				}
				local179.Windowed = true;
				local179.EnableAutoDepthStencil = true;
				local179.PresentationInterval = Integer.MIN_VALUE;
				@Pc(205) int local205 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local205 |= 0x10;
				}
				@Pc(228) IDirect3DDevice local228;
				try {
					local228 = local13.a(local3, local5, arg0, local205 | 0x40, local179);
				} catch (@Pc(230) bs local230) {
					local228 = local13.a(local3, local5, arg0, local205 | 0x20, local179);
				}
				@Pc(249) Class247 local249 = new Class247(local228.d(0), local228.b());
				local1 = new Class100_Sub1_Sub1(local3, local5, arg0, local9, local13, local228, local249, local179, local18, arg1, arg2, arg3);
				local1.method4852();
				return local1;
			}
		} catch (@Pc(272) RuntimeException local272) {
			if (local1 != null) {
				local1.method6250();
			}
			throw local272;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/am;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!oo;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!pl;I)V")
	public Class100_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) am arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class247 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface5 arg9, @OriginalArg(10) Class259 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anIDirect3D1 = arg4;
		this.anInt3445 = arg0;
		this.anInt3444 = arg1;
		this.anAm1 = arg3;
		this.anIDirect3DDevice1 = arg5;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aClass247_1 = arg6;
		this.aD3DCAPS1 = arg8;
		this.aD3DLIGHT1 = new D3DLIGHT(this.anAm1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.anAm1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.anAm1);
		this.aPixelBuffer1 = new PixelBuffer(this.anAm1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.anAm1);
		new GeometryBuffer(this.anAm1);
		this.aBoolean454 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt5773 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.anInt5775 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean280 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean282 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean281 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean438 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean443 = this.anInt5761 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3445, this.anInt3444, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray13 = new boolean[this.anInt5775];
		this.anIntArray193 = new int[this.anInt5775];
		this.aBooleanArray15 = new boolean[this.anInt5775];
		this.aClass227Array1 = new Class227[this.anInt5775];
		this.aBooleanArray16 = new boolean[this.anInt5775];
		this.aBooleanArray14 = new boolean[this.anInt5775];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!gaa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4871(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!gaa", name = "B", descriptor = "(I)V")
	@Override
	protected void method4803() {
		this.bf = this.anInt5765 - this.anInt5782;
		this.aFloat151 = this.bf - (float) this.anInt5789;
		if (this.aFloat151 < (float) this.anInt5786) {
			this.aFloat151 = this.anInt5786;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat151);
		this.anIDirect3DDevice1.a(37, this.bf);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt5779);
	}

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "(B)V")
	@Override
	protected void method4798() {
		this.anIDirect3DDevice1.SetViewport(this.anInt5781, this.anInt5770, this.anInt5608, this.anInt5630, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method4861(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass247_1 = (Class247) arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([IIZIIII)Lclient!ls;")
	@Override
	public Interface14 method4787(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class102_Sub2(this, arg4, arg5, arg1, arg0, 0, arg2);
	}

	@OriginalMember(owner = "client!gaa", name = "z", descriptor = "()Z")
	@Override
	public boolean method6248() {
		return false;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZILclient!gb;Z)V")
	@Override
	protected void method4754(@OriginalArg(1) int arg0, @OriginalArg(2) Class119 arg1) {
		@Pc(11) byte local11;
		if (arg0 == 1) {
			local11 = 6;
		} else if (arg0 == 2) {
			local11 = 27;
		} else {
			local11 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, local11, Static160.method2848(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "()V")
	@Override
	public void method6231() {
	}

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "(I)V")
	@Override
	protected void method4769() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt5778 + this.anInt5781, this.anInt5770 - -this.anInt5794, this.anInt5793, this.anInt5780);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLclient!gb;IZB)V")
	@Override
	public void method4875(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(22) byte local22;
		if (arg2 == 1) {
			local22 = 3;
		} else if (arg2 == 2) {
			local22 = 26;
		} else {
			local22 = 2;
		}
		@Pc(30) int local30 = 0;
		if (arg3) {
			local30 = 32;
		}
		if (arg0) {
			local30 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, local22, Static160.method2848(arg1) | local30);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!rca;I)V")
	@Override
	public void method4855(@OriginalArg(0) Class280 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static512.aClass280_4) {
			local1 = 65536;
		} else if (Static286.aClass280_3 == arg0) {
			local1 = 131072;
		} else if (Static267.aClass280_2 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, 11, local1 | this.anInt5771);
	}

	@OriginalMember(owner = "client!gaa", name = "v", descriptor = "(B)V")
	@Override
	protected void method4874() {
		if (this.aClass302_6.method6803()) {
			this.aClass68_Sub2_18.method5114(Static160.aFloatArray23);
		} else {
			Static160.aFloatArray23[8] = 0.0F;
			Static160.aFloatArray23[1] = 0.0F;
			Static160.aFloatArray23[6] = 0.0F;
			Static160.aFloatArray23[9] = 0.0F;
			Static160.aFloatArray23[0] = 1.0F;
			Static160.aFloatArray23[4] = 0.0F;
			Static160.aFloatArray23[10] = 1.0F;
			Static160.aFloatArray23[7] = 0.0F;
			Static160.aFloatArray23[2] = 0.0F;
			Static160.aFloatArray23[15] = 1.0F;
			Static160.aFloatArray23[5] = 1.0F;
			Static160.aFloatArray23[13] = 0.0F;
			Static160.aFloatArray23[11] = 0.0F;
			Static160.aFloatArray23[12] = 0.0F;
			Static160.aFloatArray23[3] = 0.0F;
			Static160.aFloatArray23[14] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static160.aFloatArray23);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(ZI)Lclient!hh;")
	@Override
	public Interface11 method4777(@OriginalArg(0) boolean arg0) {
		return new Class187(this, Static47.aClass42_5, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "(I)V")
	@Override
	protected void method4779() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat166 * this.aFloat152, this.aFloat166 * this.aFloat161, this.aFloat166 * this.aFloat156, (float) 0);
		this.aBoolean283 = false;
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(ZB)V")
	@Override
	public void method4881(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6199(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gaa", name = "M", descriptor = "(I)V")
	@Override
	protected void method4831() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5785; local1++) {
			@Pc(10) Class2_Sub14 local10 = this.aClass2_Sub14Array3[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method7687();
			@Pc(26) float local26 = local10.method7689() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method7694(), (float) local10.method7696(), (float) local10.method7693());
			this.aD3DLIGHT2.SetDiffuse(local26 * (float) (local18 >> 16 & 0xFF), local26 * (float) (local18 >> 8 & 0xFF), local26 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method7691() * local10.method7691()));
			this.aD3DLIGHT2.SetRange((float) local10.method7691());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt5763 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4831();
	}

	@OriginalMember(owner = "client!gaa", name = "F", descriptor = "(I)V")
	@Override
	protected void method4819() {
		this.anIDirect3DDevice1.a(174, this.aBoolean458);
	}

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "(Z)V")
	@Override
	protected void method4856() {
		if (Static106.aClass206_9 == this.aClass206_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass206_6 == Static536.aClass206_10) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass206_6 == Static12.aClass206_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "I", descriptor = "(I)V")
	@Override
	protected void method4825() {
		this.anIDirect3DDevice1.a(7, this.aBoolean445);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!bt;Lclient!ec;)Z")
	@Override
	public boolean method4794(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class88 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return qr.a(this.anIDirect3D1.a(this.anInt3445, local3), -2005530519) && qr.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3445, this.anInt3444, local3.Format, 0, 3, Static160.method2855(arg1, arg0)), -2005530519);
	}

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "(B)F")
	@Override
	protected float method4851() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "(I)V")
	@Override
	protected void method4781() {
		this.method4817();
		this.method4782();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4815(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas7 != arg1) {
			return;
		}
		@Pc(6) Dimension local6 = arg1.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method2854();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "(I)V")
	@Override
	protected void method4755() {
		this.anIDirect3DDevice1.a(14, this.aBoolean452 && this.aBoolean450);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6237(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4822() {
		this.anIDirect3DDevice1.a(27, this.aBoolean456);
	}

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "(Z)V")
	@Override
	public void method4843() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray52[0], -this.aFloatArray52[1], -this.aFloatArray52[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray48[0], -this.aFloatArray48[1], -this.aFloatArray48[2]);
		this.aBoolean283 = false;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!ep;Z)V")
	public void method2847(@OriginalArg(0) Class102_Sub1 arg0) {
		this.method2849(arg0);
		if (!this.aBooleanArray15[this.anInt5771]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 1, 1);
			this.aBooleanArray15[this.anInt5771] = true;
		}
		if (!this.aBooleanArray13[this.anInt5771]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 2, 1);
			this.aBooleanArray13[this.anInt5771] = true;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLclient!nba;I)V")
	@Override
	public void method4863(@OriginalArg(1) Interface16 arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class250 local6 = (Class250) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local6.anIDirect3DVertexBuffer1, 0, local6.method5777());
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZI[[I)Lclient!oq;")
	@Override
	public Interface20 method4759(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class102_Sub3(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "(B)V")
	@Override
	protected void method4813() {
		if (Static248.aClass190_3 == this.aClass190Array3[this.anInt5771]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, 24, 0);
			this.anIntArray193[this.anInt5771] = 0;
			return;
		}
		if (Static65.aClass190_2 == this.aClass190Array3[this.anInt5771]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt5771 + 16, this.aClass68_Sub2Array3[this.anInt5771].method5114(Static160.aFloatArray23));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt5771 + 16, this.aClass68_Sub2Array3[this.anInt5771].method5116(Static160.aFloatArray23));
		}
		@Pc(54) int local54 = Static160.method2856(this.aClass190Array3[this.anInt5771]);
		if (this.anIntArray193[this.anInt5771] != local54) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, 24, local54);
			this.anIntArray193[this.anInt5771] = local54;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([FIIIZIILclient!ec;)Lclient!ls;")
	@Override
	protected Interface14 method4752(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class88 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!gaa", name = "y", descriptor = "()Lclient!oa;")
	@Override
	public Class237 method6247() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt3445, 0);
		return new Class237(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!lt;IIIILclient!hh;)V")
	@Override
	public void method4764(@OriginalArg(0) int arg0, @OriginalArg(1) Class213 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface11 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class187) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static160.method2850(arg1), 0, arg4, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "()V")
	@Override
	public void method6238() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass247_1.method5732()) {
			this.anInt3443 = 0;
			if (qr.a(true, this.aClass247_1.method5735())) {
				this.method2854();
			}
		} else if (++this.anInt3443 <= 50) {
			this.method2854();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "()Z")
	@Override
	public boolean method6197() {
		return false;
	}

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "(B)V")
	@Override
	protected void method4873() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5775; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass227Array1[local1] = Static85.aClass227_1;
			this.aBooleanArray15[local1] = this.aBooleanArray13[local1] = true;
			this.aBooleanArray14[local1] = false;
			this.anIntArray193[local1] = 0;
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
		this.aBoolean283 = false;
		super.method4873();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!qo;)V")
	public void method2849(@OriginalArg(1) Class102 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt5771, arg0.method5797());
		if (arg0.aClass227_9 != this.aClass227Array1[this.anInt5771]) {
			@Pc(21) int local21 = Static160.method2846(arg0.aClass227_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 5, local21);
			this.aClass227Array1[this.anInt5771] = arg0.aClass227_9;
			if (arg0.aBoolean538 != this.aBooleanArray14[this.anInt5771]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 7, arg0.aBoolean538 ? Static160.method2846(arg0.aClass227_9) : 0);
				this.aBooleanArray14[this.anInt5771] = arg0.aBoolean538;
			}
		} else if (arg0.aBoolean538 != this.aBooleanArray14[this.anInt5771]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 7, arg0.aBoolean538 ? Static160.method2846(arg0.aClass227_9) : 0);
			this.aBooleanArray14[this.anInt5771] = arg0.aBoolean538;
		}
		if (!this.aBooleanArray16[this.anInt5771]) {
			this.aBooleanArray16[this.anInt5771] = true;
			this.method4751();
			this.method4786();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(II)V")
	@Override
	public void method4859(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, 11, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method4862(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gaa", name = "W", descriptor = "(I)V")
	@Override
	protected void method4867() {
		this.anIDirect3DDevice1.a(137, this.aBoolean440 && !this.aBoolean451);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLclient!mq;)V")
	@Override
	public void method4757(@OriginalArg(1) Class199 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!gt;I)V")
	public void method2853(@OriginalArg(0) Class102_Sub2 arg0) {
		this.method2849(arg0);
		if (this.aBooleanArray15[this.anInt5771] != arg0.aBoolean312) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 1, arg0.aBoolean312 ? 1 : 3);
			this.aBooleanArray15[this.anInt5771] = arg0.aBoolean312;
		}
		if (arg0.aBoolean313 != this.aBooleanArray13[this.anInt5771]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5771, 2, arg0.aBoolean313 ? 1 : 3);
			this.aBooleanArray13[this.anInt5771] = arg0.aBoolean313;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "()V")
	@Override
	protected void method6250() {
		this.anAm1.b((byte) -62);
		super.method6250();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6205(@OriginalArg(0) int arg0) {
		this.anAm1.a((byte) -108);
		super.method6205(arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4808(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!ec;Lclient!bt;I)Z")
	@Override
	public boolean method4810(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class42 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return qr.a(this.anIDirect3D1.a(this.anInt3445, local11), -2005530519) && qr.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3445, this.anInt3444, local11.Format, 0, 4, Static160.method2855(arg0, arg1)), -2005530519);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!ec;IILclient!bt;)Lclient!ls;")
	@Override
	public Interface14 method4846(@OriginalArg(1) Class88 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3) {
		return new Class102_Sub2(this, arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([BLclient!ec;IIZZII)Lclient!ls;")
	@Override
	protected Interface14 method4814(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) int arg4) {
		return new Class102_Sub2(this, arg1, arg4, arg2, arg3, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!jt;Lclient!jt;FLclient!jt;)Lclient!jt;")
	@Override
	public Class37 method6210(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class37 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!lt;III)V")
	@Override
	public void method4849(@OriginalArg(0) Class213 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static160.method2850(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZ)Lclient!nba;")
	@Override
	public Interface16 method4837(@OriginalArg(1) boolean arg0) {
		return new Class250(this, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6202(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6238();
	}

	@OriginalMember(owner = "client!gaa", name = "X", descriptor = "(I)V")
	@Override
	protected void method4868() {
		this.anIDirect3DDevice1.a(15, this.aBoolean453);
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)V")
	@Override
	protected void method4770() {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!gaa", name = "ab", descriptor = "(I)Z")
	private boolean method2854() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(16) Class247 local16 = (Class247) this.anObject30;
			this.method4824();
			local16.method5733();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static160.method2852(this.anInt3445, this.anInt5761, this.anInt3444, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1)) {
				@Pc(51) int local51 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (qr.a(local51, -2005530519)) {
					local16.method5734(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.d(0));
					this.method4812();
					this.method4873();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "()V")
	@Override
	public void method6228() {
	}

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "()V")
	@Override
	public void method6203() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (qr.a(local3.Issue(), -2005530519)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(6168);
	}

	@OriginalMember(owner = "client!gaa", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "(I)V")
	@Override
	protected void method4751() {
		@Pc(17) int local17 = this.aBooleanArray16[this.anInt5771] ? Static160.method2851(this.aClass236Array6[this.anInt5771]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, 4, local17);
	}

	@OriginalMember(owner = "client!gaa", name = "D", descriptor = "(I)V")
	@Override
	protected void method4817() {
		@Pc(11) float local11 = this.aBoolean446 ? this.aFloat159 : 0.0F;
		@Pc(20) float local20 = this.aBoolean446 ? -this.aFloat162 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat152 * local11, local11 * this.aFloat161, local11 * this.aFloat156, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local20 * this.aFloat152, this.aFloat161 * local20, local20 * this.aFloat156, 0.0F);
		this.aBoolean283 = false;
	}

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "(I)V")
	@Override
	protected void method4802() {
		this.anIDirect3DDevice1.a(28, this.aBoolean442 && this.aBoolean441 && this.anInt5789 >= 0);
	}

	@OriginalMember(owner = "client!gaa", name = "v", descriptor = "(I)V")
	@Override
	protected void method4782() {
		if (this.aBoolean283) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean283 = true;
	}

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (qr.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), -2005530519) && qr.a(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), -2005530519)) {
			local1 = new int[arg3 * arg2];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					this.aPixelBuffer1.b(local1, arg2 * local63, local56 * local63, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(6168);
		local16.b(6168);
		return local1;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(BI)Lclient!cl;")
	@Override
	protected Class56 method4866(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class56_Sub3(this, this.aClass259_96);
		} else if (arg0 == 4) {
			return new Class56_Sub11(this, this.aClass259_96, this.aClass31_6);
		} else if (arg0 == 8) {
			return new Class56_Sub2(this, this.aClass259_96, this.aClass31_6);
		} else {
			return super.method4866(arg0);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "K", descriptor = "(I)V")
	@Override
	protected void method4829() {
		if (this.aBooleanArray16[this.anInt5771]) {
			this.aBooleanArray16[this.anInt5771] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt5771, null);
			this.method4751();
			this.method4786();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "(I)V")
	@Override
	protected void method4786() {
		@Pc(15) int local15 = this.aBooleanArray16[this.anInt5771] ? Static160.method2851(this.aClass236Array5[this.anInt5771]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5771, 1, local15);
	}

	@OriginalMember(owner = "client!gaa", name = "P", descriptor = "(I)V")
	@Override
	protected void method4840() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray51);
	}

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "(I)V")
	@Override
	protected void method4756() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt5776);
	}

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "()V")
	@Override
	public void method6198() {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([Lclient!eda;Z)Lclient!mq;")
	@Override
	public Class199 method4853(@OriginalArg(0) Class89[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
	@Override
	protected void method4767() {
		if (this.aBoolean437) {
			Static160.aFloatArray23[9] = 0.0F;
			Static160.aFloatArray23[0] = 1.0F;
			Static160.aFloatArray23[12] = 0.0F;
			Static160.aFloatArray23[7] = 0.0F;
			Static160.aFloatArray23[13] = 0.0F;
			Static160.aFloatArray23[5] = 1.0F;
			Static160.aFloatArray23[3] = 0.0F;
			Static160.aFloatArray23[14] = 0.0F;
			Static160.aFloatArray23[10] = 1.0F;
			Static160.aFloatArray23[1] = 0.0F;
			Static160.aFloatArray23[11] = 0.0F;
			Static160.aFloatArray23[4] = 0.0F;
			Static160.aFloatArray23[8] = 0.0F;
			Static160.aFloatArray23[6] = 0.0F;
			Static160.aFloatArray23[2] = 0.0F;
			Static160.aFloatArray23[15] = 1.0F;
		} else {
			this.aClass68_Sub2_15.method5114(Static160.aFloatArray23);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static160.aFloatArray23);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[BIILclient!ec;I)Lclient!fl;")
	@Override
	public Interface6 method4776(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class88 arg1) {
		return new Class102_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "()V")
	@Override
	public void method6184() {
	}
}
