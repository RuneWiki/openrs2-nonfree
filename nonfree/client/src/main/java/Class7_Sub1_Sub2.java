import jaclib.peer.jd;
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
import jagdx.eea;
import jagdx.eo;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class7_Sub1_Sub2 extends Class7_Sub1 {

	@OriginalMember(owner = "client!oe", name = "Fg", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!oe", name = "Pg", descriptor = "I")
	private int anInt7384 = 0;

	@OriginalMember(owner = "client!oe", name = "xg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!oe", name = "Vg", descriptor = "I")
	private final int anInt7385;

	@OriginalMember(owner = "client!oe", name = "vg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!oe", name = "zg", descriptor = "Lclient!lg;")
	private Class196 aClass196_1;

	@OriginalMember(owner = "client!oe", name = "wg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!oe", name = "Dg", descriptor = "I")
	private final int anInt7383;

	@OriginalMember(owner = "client!oe", name = "Qg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!oe", name = "Hg", descriptor = "Lclient!jaclib/peer/jd;")
	public final jd aJd1;

	@OriginalMember(owner = "client!oe", name = "Kg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!oe", name = "Bg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!oe", name = "Mg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!oe", name = "yg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!oe", name = "Ig", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!oe", name = "Rg", descriptor = "Z")
	public final boolean aBoolean536;

	@OriginalMember(owner = "client!oe", name = "Cg", descriptor = "Z")
	public final boolean aBoolean534;

	@OriginalMember(owner = "client!oe", name = "Tg", descriptor = "Z")
	public final boolean aBoolean537;

	@OriginalMember(owner = "client!oe", name = "Sg", descriptor = "[I")
	private final int[] anIntArray398;

	@OriginalMember(owner = "client!oe", name = "Ng", descriptor = "[Z")
	private final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!oe", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!oe", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!oe", name = "Eg", descriptor = "[Lclient!tn;")
	private final Class318[] aClass318Array1;

	@OriginalMember(owner = "client!oe", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!oe", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!vo;Ljava/lang/Integer;)Lclient!r;")
	private static Class7 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class7_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) jd local9 = new jd();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(180) D3DPRESENT_PARAMETERS local180 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static373.method5794(local3, local180, local13, arg3, local5)) {
					throw new RuntimeException("");
				}
				local180.Windowed = true;
				local180.PresentationInterval = Integer.MIN_VALUE;
				local180.EnableAutoDepthStencil = true;
				@Pc(206) int local206 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local206 |= 0x10;
				}
				@Pc(230) IDirect3DDevice local230;
				try {
					local230 = local13.a(local3, local5, arg0, local206 | 0x40, local180);
				} catch (@Pc(232) eea local232) {
					local230 = local13.a(local3, local5, arg0, local206 | 0x20, local180);
				}
				@Pc(251) Class196 local251 = new Class196(local230.a(0), local230.c());
				local1 = new Class7_Sub1_Sub2(local3, local5, arg0, local9, local13, local230, local251, local180, local18, arg1, arg2, arg3);
				local1.method5688();
				return local1;
			}
		} catch (@Pc(274) RuntimeException local274) {
			if (local1 != null) {
				local1.method7822();
			}
			throw local274;
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/jd;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!lg;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!vo;I)V")
	public Class7_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) jd arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class196 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface7 arg9, @OriginalArg(10) Class348 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anIDirect3D1 = arg4;
		this.anInt7385 = arg1;
		this.anIDirect3DDevice1 = arg5;
		this.aClass196_1 = arg6;
		this.aD3DCAPS1 = arg8;
		this.anInt7383 = arg0;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aJd1 = arg3;
		this.aD3DLIGHT2 = new D3DLIGHT(this.aJd1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aJd1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aJd1);
		this.aPixelBuffer1 = new PixelBuffer(this.aJd1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aJd1);
		new GeometryBuffer(this.aJd1);
		this.aBoolean532 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean536 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.anInt7376 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean534 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.anInt7369 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean537 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean520 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean519 = this.anInt7346 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt7383, this.anInt7385, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.anIntArray398 = new int[this.anInt7369];
		this.aBooleanArray20 = new boolean[this.anInt7369];
		this.aBooleanArray21 = new boolean[this.anInt7369];
		this.aBooleanArray19 = new boolean[this.anInt7369];
		this.aClass318Array1 = new Class318[this.anInt7369];
		this.aBooleanArray22 = new boolean[this.anInt7369];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "()V")
	@Override
	public void method7854() {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7848(@OriginalArg(0) Class88 arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "(B)V")
	@Override
	protected void method5735() {
		this.anIDirect3DDevice1.a(137, this.aBoolean524 && !this.aBoolean514);
	}

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "(B)V")
	@Override
	protected void method5756() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7378);
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(B)V")
	@Override
	protected void method5683() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7369; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass318Array1[local1] = Static132.aClass318_4;
			this.aBooleanArray19[local1] = this.aBooleanArray20[local1] = true;
			this.aBooleanArray22[local1] = false;
			this.anIntArray398[local1] = 0;
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
		this.aD3DLIGHT1.SetType(3);
		this.aD3DLIGHT3.SetType(1);
		this.aBoolean535 = false;
		super.method5683();
	}

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "(I)V")
	@Override
	protected void method5723() {
		if (this.aBoolean535) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean535 = true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZILclient!ct;Z)V")
	@Override
	protected void method5664(@OriginalArg(1) int arg0, @OriginalArg(2) Class61 arg1) {
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local12 = 6;
		} else if (arg0 == 2) {
			local12 = 27;
		} else {
			local12 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, local12, Static373.method5789(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIILclient!gca;)V")
	@Override
	public void method5760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class119 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static373.method5796(arg2), arg1, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "(I)V")
	@Override
	protected void method5777() {
		@Pc(15) int local15 = this.aBooleanArray21[this.anInt7359] ? Static373.method5797(this.aClass95Array6[this.anInt7359]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, 1, local15);
	}

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "(I)V")
	@Override
	protected void method5691() {
		this.aFloat177 = this.anInt7343 - this.anInt7350;
		this.aFloat175 = this.aFloat177 - (float) this.anInt7354;
		if (this.aFloat175 < (float) this.anInt7356) {
			this.aFloat175 = this.anInt7356;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat175);
		this.anIDirect3DDevice1.a(37, this.aFloat177);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7362);
	}

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "()Lclient!sr;")
	@Override
	public Class308 method7815() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt7383, 0);
		return new Class308(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "(B)V")
	@Override
	protected void method5739() {
		if (this.aClass96_6 == Static78.aClass96_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass96_6 == Static18.aClass96_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static361.aClass96_5 == this.aClass96_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(II)Lclient!cf;")
	@Override
	protected Class9 method5779(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class9_Sub2(this, this.aClass348_80);
		} else if (arg0 == 4) {
			return new Class9_Sub4(this, this.aClass348_80, this.aClass242_6);
		} else if (arg0 == 8) {
			return new Class9_Sub9(this, this.aClass348_80, this.aClass242_6);
		} else {
			return super.method5779(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5698(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass196_1 = (Class196) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!pa;Lclient!pa;FLclient!pa;)Lclient!pa;")
	@Override
	public Class112 method7816(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class112 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "(I)F")
	@Override
	protected float method5715() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "(I)V")
	@Override
	protected void method5773() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7366; local1++) {
			@Pc(10) Class4_Sub3 local10 = this.aClass4_Sub3Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method4952();
			@Pc(26) float local26 = local10.method4955() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local10.method4954(), (float) local10.method4953(), (float) local10.method4949());
			this.aD3DLIGHT3.SetDiffuse(local26 * (float) (local18 >> 16 & 0xFF), (float) (local18 >> 8 & 0xFF) * local26, (float) (local18 & 0xFF) * local26, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method4950() * local10.method4950()));
			this.aD3DLIGHT3.SetRange((float) local10.method4950());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt7381) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5773();
	}

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "()V")
	@Override
	public void method7827() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass196_1.method4728()) {
			this.anInt7384 = 0;
			if (eo.b(this.aClass196_1.method4727(), -1)) {
				this.method5793();
			}
		} else if (++this.anInt7384 <= 50) {
			this.method5793();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "()V")
	@Override
	public void method7843() {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5761(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "(I)V")
	@Override
	protected void method5677() {
		this.anIDirect3DDevice1.a(14, this.aBoolean525 && this.aBoolean513);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!jb;ILclient!qda;)Z")
	@Override
	public boolean method5660(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class273 arg1) {
		@Pc(16) D3DDISPLAYMODE local16 = new D3DDISPLAYMODE();
		return eo.a(-109, this.anIDirect3D1.a(this.anInt7383, local16)) && eo.a(106, this.anIDirect3D1.CheckDeviceFormat(this.anInt7383, this.anInt7385, local16.Format, 0, 3, Static373.method5791(arg1, arg0)));
	}

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "(I)V")
	@Override
	protected void method5679() {
		if (this.aClass357_6.method8118()) {
			this.aClass81_Sub1_18.method1969(Static373.aFloatArray57);
		} else {
			Static373.aFloatArray57[2] = 0.0F;
			Static373.aFloatArray57[1] = 0.0F;
			Static373.aFloatArray57[12] = 0.0F;
			Static373.aFloatArray57[8] = 0.0F;
			Static373.aFloatArray57[7] = 0.0F;
			Static373.aFloatArray57[13] = 0.0F;
			Static373.aFloatArray57[5] = 1.0F;
			Static373.aFloatArray57[4] = 0.0F;
			Static373.aFloatArray57[11] = 0.0F;
			Static373.aFloatArray57[0] = 1.0F;
			Static373.aFloatArray57[6] = 0.0F;
			Static373.aFloatArray57[3] = 0.0F;
			Static373.aFloatArray57[14] = 0.0F;
			Static373.aFloatArray57[10] = 1.0F;
			Static373.aFloatArray57[9] = 0.0F;
			Static373.aFloatArray57[15] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static373.aFloatArray57);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7799(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7827();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z[[IIB)Lclient!hba;")
	@Override
	public Interface11 method5744(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class154_Sub2(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "()Z")
	@Override
	public boolean method7850() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!jb;I[BZI)Lclient!wca;")
	@Override
	public Interface23 method5784(@OriginalArg(1) Class161 arg0, @OriginalArg(3) byte[] arg1) {
		return new Class154_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	@Override
	public void method7805(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method5754(@OriginalArg(1) Class82 arg0) {
		@Pc(10) dxVertexLayout local10 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local10.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "(I)V")
	@Override
	protected void method5706() {
		if (this.aClass322Array3[this.anInt7359] == Static190.aClass322_4) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, 24, 0);
			this.anIntArray398[this.anInt7359] = 0;
			return;
		}
		if (Static560.aClass322_5 == this.aClass322Array3[this.anInt7359]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7359 + 16, this.aClass81_Sub1Array3[this.anInt7359].method1969(Static373.aFloatArray57));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7359 + 16, this.aClass81_Sub1Array3[this.anInt7359].method1962(Static373.aFloatArray57));
		}
		@Pc(65) int local65 = Static373.method5792(this.aClass322Array3[this.anInt7359]);
		if (local65 != this.anIntArray398[this.anInt7359]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, 24, local65);
			this.anIntArray398[this.anInt7359] = local65;
		}
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "()Z")
	@Override
	public boolean method7807() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "(B)V")
	@Override
	protected void method5752() {
		this.anIDirect3DDevice1.a(174, this.aBoolean533);
	}

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "()V")
	@Override
	public void method7849() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (eo.a(-98, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b((byte) -6);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!jb;Lclient!qda;IIB)Lclient!dca;")
	@Override
	public Interface4 method5705(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class154_Sub1(this, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5708(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "()V")
	@Override
	protected void method7822() {
		this.aJd1.c(14821);
		super.method7822();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!jb;Lclient!qda;I)Z")
	@Override
	public boolean method5734(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class273 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return eo.a(-110, this.anIDirect3D1.a(this.anInt7383, local3)) && eo.a(-111, this.anIDirect3D1.CheckDeviceFormat(this.anInt7383, this.anInt7385, local3.Format, 0, 4, Static373.method5791(arg1, arg0)));
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BZIILclient!jb;I)Lclient!dca;")
	@Override
	protected Interface4 method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(6) Class161 arg4) {
		return new Class154_Sub1(this, arg4, arg1, arg0, arg3, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
	@Override
	protected void method5731(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		if (this.aCanvas11 != arg0) {
			return;
		}
		@Pc(13) Dimension local13 = arg0.getSize();
		if (local13.width > 0 && local13.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method5793();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "(B)V")
	@Override
	protected void method5785() {
		if (this.aBooleanArray21[this.anInt7359]) {
			this.aBooleanArray21[this.anInt7359] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7359, null);
			this.method5747();
			this.method5777();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ir;Z)V")
	public void method5790(@OriginalArg(0) Class154_Sub1 arg0) {
		this.method5798(arg0);
		if (this.aBooleanArray19[this.anInt7359] != arg0.aBoolean321) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 1, arg0.aBoolean321 ? 1 : 3);
			this.aBooleanArray19[this.anInt7359] = arg0.aBoolean321;
		}
		if (arg0.aBoolean320 != this.aBooleanArray20[this.anInt7359]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 2, arg0.aBoolean320 ? 1 : 3);
			this.aBooleanArray20[this.anInt7359] = arg0.aBoolean320;
		}
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5783() {
		this.anIDirect3DDevice1.a(27, this.aBoolean522);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)Lclient!eu;")
	@Override
	public Interface6 method5726(@OriginalArg(1) boolean arg0) {
		return new Class345(this, Static424.aClass273_13, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILclient!eu;Lclient!gca;BI)V")
	@Override
	public void method5680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(4) Class119 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class345) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static373.method5796(arg4), 0, arg5, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "(B)V")
	@Override
	protected void method5745() {
		this.anIDirect3DDevice1.a(15, this.aBoolean515);
	}

	@OriginalMember(owner = "client!oe", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)Lclient!wf;")
	@Override
	public Interface24 method5704(@OriginalArg(0) boolean arg0) {
		return new Class57(this, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "(B)V")
	@Override
	protected void method5781() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7374 + this.anInt7361, this.anInt7380 + this.anInt7373, this.anInt7347, this.anInt7355);
	}

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "(Z)Z")
	private boolean method5793() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(18) Class196 local18 = (Class196) this.anObject99;
			this.method5768();
			local18.method4730();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static373.method5794(this.anInt7383, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1, this.anInt7346, this.anInt7385)) {
				@Pc(52) int local52 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (eo.a(91, local52)) {
					local18.method4729(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.a(0));
					this.method5666();
					this.method5683();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5742(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "(B)V")
	@Override
	protected void method5771() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7374, this.anInt7373, this.anInt7180, this.anInt7241, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "(I)V")
	@Override
	protected void method5728() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat171 * this.aFloat173, this.aFloat178 * this.aFloat171, this.aFloat171 * this.aFloat176, 0.0F);
		this.aBoolean535 = false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!hp;I)V")
	@Override
	public void method5684(@OriginalArg(0) Class143 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static424.aClass143_3) {
			local1 = 65536;
		} else if (Static278.aClass143_2 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static153.aClass143_1) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, 11, this.anInt7359 | local1);
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5747() {
		@Pc(22) int local22 = this.aBooleanArray21[this.anInt7359] ? Static373.method5797(this.aClass95Array5[this.anInt7359]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, 4, local22);
	}

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "()V")
	@Override
	public void method7830() {
	}

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "(I)V")
	@Override
	public void method5703() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray54[0], -this.aFloatArray54[1], -this.aFloatArray54[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray51[0], -this.aFloatArray51[1], -this.aFloatArray51[2]);
		this.aBoolean535 = false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZBILclient!jb;I[FI)Lclient!dca;")
	@Override
	protected Interface4 method5753(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class161 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!wf;I)V")
	@Override
	public void method5721(@OriginalArg(1) Interface24 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class57 local2 = (Class57) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method1572());
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLclient!vf;)V")
	public void method5795(@OriginalArg(1) Class154_Sub3 arg0) {
		this.method5798(arg0);
		if (!this.aBooleanArray19[this.anInt7359]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 1, 1);
			this.aBooleanArray19[this.anInt7359] = true;
		}
		if (!this.aBooleanArray20[this.anInt7359]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 2, 1);
			this.aBooleanArray20[this.anInt7359] = true;
		}
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (eo.a(-121, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && eo.a(84, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					this.aPixelBuffer1.a(local1, arg2 * local63, local56 * local63, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b((byte) -6);
		local16.b((byte) -6);
		return local1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZB[I)Lclient!dca;")
	@Override
	public Interface4 method5758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int[] arg5) {
		return new Class154_Sub1(this, arg1, arg0, arg4, arg5, 0, arg3);
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
	@Override
	public void method7780() {
	}

	@OriginalMember(owner = "client!oe", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5702(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "(I)V")
	@Override
	protected void method5748() {
		this.method5714();
		this.method5723();
	}

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "(B)V")
	@Override
	protected void method5729() {
		this.anIDirect3DDevice1.a(7, this.aBoolean531);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([Lclient!ls;Z)Lclient!dt;")
	@Override
	public Class82 method5736(@OriginalArg(0) Class204[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oj;I)V")
	public void method5798(@OriginalArg(0) Class154 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7359, arg0.method7870());
		if (arg0.aClass318_11 != this.aClass318Array1[this.anInt7359]) {
			@Pc(21) int local21 = Static373.method5788(arg0.aClass318_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 5, local21);
			this.aClass318Array1[this.anInt7359] = arg0.aClass318_11;
			if (arg0.aBoolean696 != this.aBooleanArray22[this.anInt7359]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 7, arg0.aBoolean696 ? Static373.method5788(arg0.aClass318_11) : 0);
				this.aBooleanArray22[this.anInt7359] = arg0.aBoolean696;
			}
		} else if (arg0.aBoolean696 != this.aBooleanArray22[this.anInt7359]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7359, 7, arg0.aBoolean696 ? Static373.method5788(arg0.aClass318_11) : 0);
			this.aBooleanArray22[this.anInt7359] = arg0.aBoolean696;
		}
		if (!this.aBooleanArray21[this.anInt7359]) {
			this.aBooleanArray21[this.anInt7359] = true;
			this.method5747();
			this.method5777();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLclient!ct;IZI)V")
	@Override
	public void method5741(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(21) byte local21;
		if (arg3 == 1) {
			local21 = 3;
		} else if (arg3 == 2) {
			local21 = 26;
		} else {
			local21 = 2;
		}
		@Pc(29) int local29 = 0;
		if (arg0) {
			local29 = 32;
		}
		if (arg2) {
			local29 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, local21, Static373.method5789(arg1) | local29);
	}

	@OriginalMember(owner = "client!oe", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V")
	@Override
	protected void method5678() {
	}

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "(B)V")
	@Override
	protected void method5714() {
		@Pc(7) float local7 = this.aBoolean527 ? this.aFloat180 : 0.0F;
		@Pc(22) float local22 = this.aBoolean527 ? -this.aFloat168 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(this.aFloat173 * local7, local7 * this.aFloat178, this.aFloat176 * local7, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat173 * local22, this.aFloat178 * local22, local22 * this.aFloat176, 0.0F);
		this.aBoolean535 = false;
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method7853(@OriginalArg(0) int arg0) {
		this.aJd1.a(15977);
		super.method7853(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "(I)V")
	@Override
	protected void method5762() {
		if (this.aBoolean512) {
			Static373.aFloatArray57[8] = 0.0F;
			Static373.aFloatArray57[2] = 0.0F;
			Static373.aFloatArray57[10] = 1.0F;
			Static373.aFloatArray57[6] = 0.0F;
			Static373.aFloatArray57[15] = 1.0F;
			Static373.aFloatArray57[12] = 0.0F;
			Static373.aFloatArray57[4] = 0.0F;
			Static373.aFloatArray57[13] = 0.0F;
			Static373.aFloatArray57[14] = 0.0F;
			Static373.aFloatArray57[7] = 0.0F;
			Static373.aFloatArray57[9] = 0.0F;
			Static373.aFloatArray57[11] = 0.0F;
			Static373.aFloatArray57[1] = 0.0F;
			Static373.aFloatArray57[0] = 1.0F;
			Static373.aFloatArray57[3] = 0.0F;
			Static373.aFloatArray57[5] = 1.0F;
		} else {
			this.aClass81_Sub1_15.method1969(Static373.aFloatArray57);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static373.aFloatArray57);
	}

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "(I)V")
	@Override
	protected void method5751() {
		this.anIDirect3DDevice1.a(28, this.aBoolean521 && this.aBoolean530 && this.anInt7354 >= 0);
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	@Override
	protected void method5662() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray50);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(II)V")
	@Override
	public void method5730(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7359, 11, arg0);
	}
}
