import jaclib.peer.er;
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
import jagdx.tha;
import jagdx.wd;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class95_Sub3_Sub1 extends Class95_Sub3 {

	@OriginalMember(owner = "client!rd", name = "Xg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!rd", name = "bh", descriptor = "I")
	private int anInt7936 = 0;

	@OriginalMember(owner = "client!rd", name = "eh", descriptor = "Z")
	private boolean aBoolean591 = false;

	@OriginalMember(owner = "client!rd", name = "Pg", descriptor = "Lclient!jaclib/peer/er;")
	public final er anEr1;

	@OriginalMember(owner = "client!rd", name = "hh", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!rd", name = "ch", descriptor = "Lclient!saa;")
	private Class311 aClass311_1;

	@OriginalMember(owner = "client!rd", name = "ah", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!rd", name = "ph", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!rd", name = "Ug", descriptor = "I")
	private final int anInt7935;

	@OriginalMember(owner = "client!rd", name = "Yg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!rd", name = "Og", descriptor = "I")
	private final int anInt7934;

	@OriginalMember(owner = "client!rd", name = "mh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!rd", name = "gh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!rd", name = "Tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!rd", name = "Sg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!rd", name = "nh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!rd", name = "oh", descriptor = "Z")
	public final boolean aBoolean594;

	@OriginalMember(owner = "client!rd", name = "kh", descriptor = "Z")
	public final boolean aBoolean593;

	@OriginalMember(owner = "client!rd", name = "ih", descriptor = "Z")
	public final boolean aBoolean592;

	@OriginalMember(owner = "client!rd", name = "Qg", descriptor = "[I")
	private final int[] anIntArray558;

	@OriginalMember(owner = "client!rd", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray139;

	@OriginalMember(owner = "client!rd", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray138;

	@OriginalMember(owner = "client!rd", name = "jh", descriptor = "[Lclient!tb;")
	private final Class328[] aClass328Array1;

	@OriginalMember(owner = "client!rd", name = "dh", descriptor = "[Z")
	private final boolean[] aBooleanArray140;

	@OriginalMember(owner = "client!rd", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray137;

	@OriginalMember(owner = "client!rd", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!wu;Ljava/lang/Integer;)Lclient!ha;")
	private static Class95 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class95_Sub3_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) er local9 = new er();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(188) D3DPRESENT_PARAMETERS local188 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static484.method6731(local13, local188, local3, local5, arg3)) {
					throw new RuntimeException("");
				}
				local188.Windowed = true;
				local188.EnableAutoDepthStencil = true;
				local188.PresentationInterval = Integer.MIN_VALUE;
				@Pc(213) int local213 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local213 |= 0x10;
				}
				@Pc(237) IDirect3DDevice local237;
				try {
					local237 = local13.a(local3, local5, arg0, local213 | 0x40, local188);
				} catch (@Pc(239) tha local239) {
					local237 = local13.a(local3, local5, arg0, local213 | 0x20, local188);
				}
				@Pc(258) Class311 local258 = new Class311(local237.c(0), local237.c());
				local1 = new Class95_Sub3_Sub1(local3, local5, arg0, local9, local13, local237, local258, local188, local18, arg1, arg2, arg3);
				local1.method7022();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(281) RuntimeException local281) {
			if (local1 != null) {
				local1.method6966();
			}
			throw local281;
		}
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/er;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!saa;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!wu;I)V")
	public Class95_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) er arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class311 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface6 arg9, @OriginalArg(10) Class380 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anEr1 = arg3;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aClass311_1 = arg6;
		this.anIDirect3DDevice1 = arg5;
		this.anIDirect3D1 = arg4;
		this.anInt7935 = arg1;
		this.aD3DCAPS1 = arg8;
		this.anInt7934 = arg0;
		this.aD3DLIGHT3 = new D3DLIGHT(this.anEr1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.anEr1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.anEr1);
		this.aPixelBuffer1 = new PixelBuffer(this.anEr1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.anEr1);
		new GeometryBuffer(this.anEr1);
		this.aBoolean594 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean593 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.anInt8371 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean592 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean629 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean623 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt8376 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean615 = this.anInt8368 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt7934, this.anInt7935, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.anIntArray558 = new int[this.anInt8371];
		this.aBooleanArray139 = new boolean[this.anInt8371];
		this.aBooleanArray138 = new boolean[this.anInt8371];
		this.aClass328Array1 = new Class328[this.anInt8371];
		this.aBooleanArray140 = new boolean[this.anInt8371];
		this.aBooleanArray137 = new boolean[this.anInt8371];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(BZ)V")
	@Override
	public void method7126(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "(B)V")
	@Override
	protected void method7110() {
		if (this.aClass125_7.method2683()) {
			this.aClass177_Sub1_18.method3828(Static484.aFloatArray64);
		} else {
			Static484.aFloatArray64[9] = 0.0F;
			Static484.aFloatArray64[6] = 0.0F;
			Static484.aFloatArray64[4] = 0.0F;
			Static484.aFloatArray64[5] = 1.0F;
			Static484.aFloatArray64[1] = 0.0F;
			Static484.aFloatArray64[2] = 0.0F;
			Static484.aFloatArray64[0] = 1.0F;
			Static484.aFloatArray64[11] = 0.0F;
			Static484.aFloatArray64[7] = 0.0F;
			Static484.aFloatArray64[10] = 1.0F;
			Static484.aFloatArray64[15] = 1.0F;
			Static484.aFloatArray64[14] = 0.0F;
			Static484.aFloatArray64[3] = 0.0F;
			Static484.aFloatArray64[8] = 0.0F;
			Static484.aFloatArray64[12] = 0.0F;
			Static484.aFloatArray64[13] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static484.aFloatArray64);
	}

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "(I)V")
	@Override
	protected void method7127() {
		if (this.aBoolean613) {
			Static484.aFloatArray64[15] = 1.0F;
			Static484.aFloatArray64[8] = 0.0F;
			Static484.aFloatArray64[9] = 0.0F;
			Static484.aFloatArray64[10] = 1.0F;
			Static484.aFloatArray64[4] = 0.0F;
			Static484.aFloatArray64[3] = 0.0F;
			Static484.aFloatArray64[5] = 1.0F;
			Static484.aFloatArray64[6] = 0.0F;
			Static484.aFloatArray64[11] = 0.0F;
			Static484.aFloatArray64[7] = 0.0F;
			Static484.aFloatArray64[2] = 0.0F;
			Static484.aFloatArray64[0] = 1.0F;
			Static484.aFloatArray64[1] = 0.0F;
			Static484.aFloatArray64[12] = 0.0F;
			Static484.aFloatArray64[13] = 0.0F;
			Static484.aFloatArray64[14] = 0.0F;
		} else {
			this.aClass177_Sub1_15.method3828(Static484.aFloatArray64);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static484.aFloatArray64);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Lclient!mp;")
	@Override
	public Interface18 method6983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "(B)V")
	@Override
	protected void method7136() {
		if (this.aBoolean591) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean591 = true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "(I)V")
	@Override
	protected void method7096() {
		this.anIDirect3DDevice1.a(15, this.aBoolean622);
	}

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "(I)V")
	@Override
	protected void method7102() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8371; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass328Array1[local1] = Static541.aClass328_10;
			this.aBooleanArray138[local1] = this.aBooleanArray137[local1] = true;
			this.aBooleanArray140[local1] = false;
			this.anIntArray558[local1] = 0;
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
		this.aBoolean591 = false;
		super.method7102();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7140(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "()Lclient!gba;")
	@Override
	public Class117 method7008() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt7934, 0);
		return new Class117(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!rd", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7033(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!bha;)V")
	public void method6728(@OriginalArg(1) Class33_Sub1 arg0) {
		this.method6733(arg0);
		if (!this.aBooleanArray138[this.anInt8362]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 1, 1);
			this.aBooleanArray138[this.anInt8362] = true;
		}
		if (!this.aBooleanArray137[this.anInt8362]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 2, 1);
			this.aBooleanArray137[this.anInt8362] = true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)Lclient!ho;")
	@Override
	public Interface10 method7119(@OriginalArg(0) boolean arg0) {
		return new Class267(this, Static290.aClass189_12, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!bfa;IIZILclient!ho;I)V")
	@Override
	public void method7060(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface10 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class267) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static484.method6727(arg0), 0, arg2, arg3, arg1, arg5);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method6730(@OriginalArg(0) Class33_Sub2 arg0) {
		this.method6733(arg0);
		if (this.aBooleanArray138[this.anInt8362] != arg0.aBoolean123) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 1, arg0.aBoolean123 ? 1 : 3);
			this.aBooleanArray138[this.anInt8362] = arg0.aBoolean123;
		}
		if (arg0.aBoolean122 != this.aBooleanArray137[this.anInt8362]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 2, arg0.aBoolean122 ? 1 : 3);
			this.aBooleanArray137[this.anInt8362] = arg0.aBoolean122;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!kf;Lclient!kea;I)Z")
	@Override
	public boolean method7135(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class188 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return wd.a(71, (int) this.anIDirect3D1.a(this.anInt7934, local10)) && wd.a(45, (int) this.anIDirect3D1.CheckDeviceFormat(this.anInt7934, this.anInt7935, local10.Format, 0, 4, Static484.method6732(arg0, arg1)));
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(BZ)Lclient!lk;")
	@Override
	public Interface16 method7122(@OriginalArg(1) boolean arg0) {
		return new Class331(this, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z[BILclient!kea;II)Lclient!co;")
	@Override
	public Interface5 method7068(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class188 arg1) {
		return new Class33_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "(I)V")
	@Override
	protected void method7129() {
		if (this.anIDirect3DVertexShader7 != null || Static624.aClass85_5 == this.aClass85Array3[this.anInt8362]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, 24, 0);
			this.anIntArray558[this.anInt8362] = 0;
			return;
		}
		if (this.aClass85Array3[this.anInt8362] == Static629.aClass85_6) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8362 + 16, this.aClass177_Sub1Array3[this.anInt8362].method3828(Static484.aFloatArray64));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8362 + 16, this.aClass177_Sub1Array3[this.anInt8362].method3836(Static484.aFloatArray64));
		}
		@Pc(67) int local67 = Static484.method6736(this.aClass85Array3[this.anInt8362]);
		if (this.anIntArray558[this.anInt8362] != local67) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, 24, local67);
			this.anIntArray558[this.anInt8362] = local67;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6957(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(Z)V")
	@Override
	protected void method7109() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8348);
	}

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "(I)V")
	@Override
	protected void method7063() {
		this.anIDirect3DDevice1.a(27, this.aBoolean619);
	}

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "()V")
	@Override
	public void method7000() {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILclient!bfa;)V")
	@Override
	public void method7114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static484.method6727(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	@Override
	public void method6988(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Lclient!ni;")
	@Override
	protected Class7 method7050(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class7_Sub9(this, this.aClass380_114);
		} else if (arg0 == 4) {
			return new Class7_Sub1(this, this.aClass380_114, this.aClass174_7);
		} else if (arg0 == 8) {
			return new Class7_Sub11(this, this.aClass380_114, this.aClass174_7);
		} else {
			return super.method7050(arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "()V")
	@Override
	public void method7011() {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7138(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "()Z")
	@Override
	public boolean method6951() {
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!kf;Lclient!kea;I)Lclient!oia;")
	@Override
	public Interface19 method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) Class188 arg3) {
		return new Class33_Sub2(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ[BLclient!kea;IZII)Lclient!oia;")
	@Override
	protected Interface19 method7141(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class188 arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		return new Class33_Sub2(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!pf;B)V")
	@Override
	public void method7046(@OriginalArg(0) Class266 arg0) {
		@Pc(9) int local9 = 0;
		if (arg0 == Static376.aClass266_3) {
			local9 = 65536;
		} else if (Static59.aClass266_1 == arg0) {
			local9 = 131072;
		} else if (arg0 == Static566.aClass266_4) {
			local9 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, 11, this.anInt8362 | local9);
	}

	@OriginalMember(owner = "client!rd", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (wd.a(98, (int) this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && wd.a(109, (int) local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local55) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(62) int local62 = 0; local62 < arg3; local62++) {
					this.aPixelBuffer1.b(local1, local62 * arg2, local55 * local62, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -104);
		local16.a((byte) -92);
		return local1;
	}

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "(I)V")
	@Override
	protected void method7074() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8381; local1++) {
			@Pc(14) Class2_Sub24 local14 = this.aClass2_Sub24Array34[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method6305();
			@Pc(28) float local28 = local14.method6307() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method6299(), (float) local14.method6308(), (float) local14.method6301());
			this.aD3DLIGHT1.SetDiffuse(local28 * (float) (local22 >> 16 & 0xFF), (float) (local22 >> 8 & 0xFF) * local28, local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method6302() * local14.method6302()));
			this.aD3DLIGHT1.SetRange((float) local14.method6302());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt8378 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7074();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!qs;ZI)V")
	@Override
	protected void method7134(@OriginalArg(1) Class291 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte local14;
		if (arg1 == 1) {
			local14 = 6;
		} else if (arg1 == 2) {
			local14 = 27;
		} else {
			local14 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, local14, Static484.method6729(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!cd;Lclient!cd;FLclient!cd;)Lclient!cd;")
	@Override
	public Class12 method6974(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "(I)V")
	@Override
	protected void method7078() {
		@Pc(7) float local7 = this.aBoolean620 ? this.aFloat174 : 0.0F;
		@Pc(16) float local16 = this.aBoolean620 ? -this.aFloat188 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat183, this.aFloat172 * local7, local7 * this.aFloat181, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local16 * this.aFloat183, local16 * this.aFloat172, this.aFloat181 * local16, 0.0F);
		this.aBoolean591 = false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!vga;I)V")
	public void method6733(@OriginalArg(0) Class33 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8362, arg0.method7838());
		if (this.aClass328Array1[this.anInt8362] != arg0.aClass328_11) {
			@Pc(68) int local68 = Static484.method6735(arg0.aClass328_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 6, local68);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 5, local68);
			this.aClass328Array1[this.anInt8362] = arg0.aClass328_11;
			if (arg0.aBoolean692 != this.aBooleanArray140[this.anInt8362]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 7, arg0.aBoolean692 ? Static484.method6735(arg0.aClass328_11) : 0);
				this.aBooleanArray140[this.anInt8362] = arg0.aBoolean692;
			}
		} else if (arg0.aBoolean692 != this.aBooleanArray140[this.anInt8362]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8362, 7, arg0.aBoolean692 ? Static484.method6735(arg0.aClass328_11) : 0);
			this.aBooleanArray140[this.anInt8362] = arg0.aBoolean692;
		}
		if (!this.aBooleanArray139[this.anInt8362]) {
			this.aBooleanArray139[this.anInt8362] = true;
			this.method7036();
			this.method7118();
		}
	}

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "(I)V")
	@Override
	protected void method7072() {
		this.anIDirect3DDevice1.a(174, this.aBoolean633);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBZLclient!qs;Z)V")
	@Override
	public void method7028(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class291 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 3;
		} else if (arg0 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(29) int local29 = 0;
		if (arg1) {
			local29 = 32;
		}
		if (arg3) {
			local29 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, local13, local29 | Static484.method6729(arg2));
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method6734(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "()Z")
	@Override
	public boolean method6946() {
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6925(@OriginalArg(0) int arg0) {
		this.anEr1.b((byte) -78);
		super.method6925(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!lk;Z)V")
	@Override
	public void method7054(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		@Pc(9) Class331 local9 = (Class331) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local9.anIDirect3DVertexBuffer1, 0, local9.method7461());
	}

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "()V")
	@Override
	public void method6986() {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[[IIZ)Lclient!uia;")
	@Override
	public Interface23 method7043(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class33_Sub3(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "(I)V")
	@Override
	protected void method7098() {
	}

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "(I)V")
	@Override
	protected void method7130() {
		this.anIDirect3DDevice1.a(137, this.aBoolean626 && !this.aBoolean631);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7120(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass311_1 = (Class311) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!hs;Lclient!mp;)Lclient!cha;")
	@Override
	public Interface4 method6959(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface18 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[Lclient!ot;)Lclient!dha;")
	@Override
	public Class72 method7056(@OriginalArg(1) Class258[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "(I)V")
	@Override
	protected void method7090() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray68);
	}

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "()V")
	@Override
	public void method6991() {
	}

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "()V")
	@Override
	public void method6976() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (wd.a(103, (int) local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -110);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;B)V")
	public void method6738(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method7129();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIZ[I)Lclient!oia;")
	@Override
	public Interface19 method7089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5) {
		return new Class33_Sub2(this, arg1, arg3, arg4, arg5, 0, arg2);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!cha;)V")
	@Override
	public void method7010(@OriginalArg(0) Interface4 arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	@Override
	public void method7030(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, 11, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "(I)V")
	@Override
	protected void method7052() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8353, this.anInt8356, this.anInt8288, this.anInt8286, 0.0F, (float) 1);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	@Override
	protected void method7016() {
		this.aFloat179 = this.anInt8375 - this.anInt8366;
		this.aFloat175 = (float) -this.anInt8382 + this.aFloat179;
		if ((float) this.anInt8377 > this.aFloat175) {
			this.aFloat175 = this.anInt8377;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat175);
		this.anIDirect3DDevice1.a(37, this.aFloat179);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8359);
	}

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "(I)V")
	@Override
	protected void method7037() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8369 + this.anInt8353, this.anInt8356 + this.anInt8385, this.anInt8365, this.anInt8363);
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(B)V")
	@Override
	public void method7047() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray72[0], -this.aFloatArray72[1], -this.aFloatArray72[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray69[0], -this.aFloatArray69[1], -this.aFloatArray69[2]);
		this.aBoolean591 = false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7073(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas12) {
			return;
		}
		@Pc(10) Dimension local10 = arg0.getSize();
		if (local10.width > 0 && local10.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method6739();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(Z)V")
	@Override
	protected void method7081() {
		this.anIDirect3DDevice1.a(14, this.aBoolean625 && this.aBoolean617);
	}

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "(I)V")
	@Override
	protected void method7092() {
		if (this.aBooleanArray139[this.anInt8362]) {
			this.aBooleanArray139[this.anInt8362] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8362, null);
			this.method7036();
			this.method7118();
		}
	}

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "(I)V")
	@Override
	protected void method7082() {
		this.anIDirect3DDevice1.a(28, this.aBoolean614 && this.aBoolean618 && this.anInt8382 >= 0);
	}

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)V")
	@Override
	public void method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass311_1.method6924()) {
			this.anInt7936 = 0;
			if (wd.a(this.aClass311_1.method6922(), (byte) 87)) {
				this.method6739();
			}
		} else if (++this.anInt7936 <= 50) {
			this.method6739();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!dha;)V")
	@Override
	public void method7059(@OriginalArg(1) Class72 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6943(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6996(arg2, arg3);
	}

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "(I)V")
	@Override
	protected void method7118() {
		@Pc(21) int local21 = this.aBooleanArray139[this.anInt8362] ? Static484.method6737(this.aClass136Array6[this.anInt8362]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, 1, local21);
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(B)V")
	@Override
	protected void method7036() {
		@Pc(22) int local22 = this.aBooleanArray139[this.anInt8362] ? Static484.method6737(this.aClass136Array5[this.anInt8362]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8362, 4, local22);
	}

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "(B)Z")
	private boolean method6739() {
		@Pc(9) int local9 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local9 == 0 || local9 == -2005530519) {
			@Pc(21) Class311 local21 = (Class311) this.anObject21;
			this.method7040();
			local21.method6923();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static484.method6731(this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1, this.anInt7934, this.anInt7935, this.anInt8368)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (wd.a(56, (int) local55)) {
					local21.method6921(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.c());
					this.method7093();
					this.method7102();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "(B)V")
	@Override
	protected void method7142() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat178 * this.aFloat183, this.aFloat178 * this.aFloat172, this.aFloat181 * this.aFloat178, 0.0F);
		this.aBoolean591 = false;
	}

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "()V")
	@Override
	protected void method6966() {
		this.anEr1.a(true);
		super.method6966();
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(B)V")
	@Override
	protected void method7048() {
		if (Static469.aClass215_2 == this.aClass215_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass215_8 == Static365.aClass215_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass215_8 == Static528.aClass215_9) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lclient!hs;")
	@Override
	public Interface11 method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "(I)F")
	@Override
	protected float method7058() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "(B)V")
	@Override
	protected void method7104() {
		this.anIDirect3DDevice1.a(7, this.aBoolean628);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[FIZILclient!kea;I)Lclient!oia;")
	@Override
	protected Interface19 method7132(@OriginalArg(2) float[] arg0, @OriginalArg(4) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class188 arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!kea;Lclient!kf;B)Z")
	@Override
	public boolean method7103(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class189 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return wd.a(42, (int) this.anIDirect3D1.a(this.anInt7934, local3)) && wd.a(57, (int) this.anIDirect3D1.CheckDeviceFormat(this.anInt7934, this.anInt7935, local3.Format, 0, 3, Static484.method6732(arg1, arg0)));
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)V")
	@Override
	protected void method7027() {
		this.method7078();
		this.method7136();
	}

	@OriginalMember(owner = "client!rd", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}
}
