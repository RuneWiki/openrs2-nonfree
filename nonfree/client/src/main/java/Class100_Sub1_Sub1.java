import jaclib.peer.qr;
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
import jagdx.co;
import jagdx.sv;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class100_Sub1_Sub1 extends Class100_Sub1 {

	@OriginalMember(owner = "client!fi", name = "Zg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!fi", name = "ah", descriptor = "I")
	private int anInt3320 = 0;

	@OriginalMember(owner = "client!fi", name = "hh", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!fi", name = "fh", descriptor = "I")
	private final int anInt3322;

	@OriginalMember(owner = "client!fi", name = "Qg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!fi", name = "Yg", descriptor = "Lclient!jaclib/peer/qr;")
	public final qr aQr1;

	@OriginalMember(owner = "client!fi", name = "Ug", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!fi", name = "ch", descriptor = "I")
	private final int anInt3321;

	@OriginalMember(owner = "client!fi", name = "dh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!fi", name = "Tg", descriptor = "Lclient!qs;")
	private Class277 aClass277_1;

	@OriginalMember(owner = "client!fi", name = "Pg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!fi", name = "jh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!fi", name = "Rg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!fi", name = "eh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!fi", name = "oh", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!fi", name = "nh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!fi", name = "Xg", descriptor = "Z")
	public final boolean aBoolean238;

	@OriginalMember(owner = "client!fi", name = "Sg", descriptor = "Z")
	public final boolean aBoolean237;

	@OriginalMember(owner = "client!fi", name = "mh", descriptor = "Z")
	public final boolean aBoolean240;

	@OriginalMember(owner = "client!fi", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!fi", name = "bh", descriptor = "[Z")
	private final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!fi", name = "gh", descriptor = "[Z")
	private final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!fi", name = "Vg", descriptor = "[I")
	private final int[] anIntArray204;

	@OriginalMember(owner = "client!fi", name = "ih", descriptor = "[Z")
	private final boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!fi", name = "kh", descriptor = "[Lclient!ej;")
	private final Class82[] aClass82Array1;

	@OriginalMember(owner = "client!fi", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!vd;Ljava/lang/Integer;)Lclient!ha;")
	private static Class100 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class100_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) qr local9 = new qr();
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
			} else if ((local18.DestBlendCaps & 0x20 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(184) D3DPRESENT_PARAMETERS local184 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static157.method2989(local13, local184, local5, local3, arg3)) {
					throw new RuntimeException("");
				}
				local184.Windowed = true;
				local184.PresentationInterval = Integer.MIN_VALUE;
				local184.EnableAutoDepthStencil = true;
				@Pc(209) int local209 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local209 |= 0x10;
				}
				@Pc(230) IDirect3DDevice local230;
				try {
					local230 = local13.a(local3, local5, arg0, local209 | 0x40, local184);
				} catch (@Pc(232) sv local232) {
					local230 = local13.a(local3, local5, arg0, local209 | 0x20, local184);
				}
				@Pc(251) Class277 local251 = new Class277(local230.b(0), local230.b());
				local1 = new Class100_Sub1_Sub1(local3, local5, arg0, local9, local13, local230, local251, local184, local18, arg1, arg2, arg3);
				local1.method6069();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(274) RuntimeException local274) {
			if (local1 != null) {
				local1.method8826();
			}
			throw local274;
		}
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/qr;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!qs;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!vd;I)V")
	public Class100_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) qr arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class277 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class353 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt3322 = arg1;
			this.aD3DCAPS1 = arg8;
			this.aQr1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.anInt3321 = arg0;
			this.anIDirect3D1 = arg4;
			this.aClass277_1 = arg6;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aD3DLIGHT3 = new D3DLIGHT(this.aQr1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aQr1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aQr1);
			this.aPixelBuffer1 = new PixelBuffer(this.aQr1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aQr1);
			new GeometryBuffer(this.aQr1);
			this.aBoolean238 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean237 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean474 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt7157 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt7136 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean479 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean240 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean478 = this.anInt7161 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3321, this.anInt3322, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray18 = new boolean[this.anInt7157];
			this.aBooleanArray19 = new boolean[this.anInt7157];
			this.aBooleanArray20 = new boolean[this.anInt7157];
			this.anIntArray204 = new int[this.anInt7157];
			this.aBooleanArray21 = new boolean[this.anInt7157];
			this.aClass82Array1 = new Class82[this.anInt7157];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(220) Throwable local220) {
			local220.printStackTrace();
			this.method8789();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZII[III)Lclient!ch;")
	@Override
	public Interface3 method6156(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		return new Class46_Sub2(this, arg3, arg2, arg1, arg4, 0, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "(I)V")
	@Override
	protected void method6151() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7157; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass82Array1[local1] = Static55.aClass82_1;
			this.aBooleanArray18[local1] = this.aBooleanArray20[local1] = true;
			this.aBooleanArray21[local1] = false;
			this.anIntArray204[local1] = 0;
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
		this.aBoolean239 = false;
		super.method6151();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z[FIILclient!pd;III)Lclient!ch;")
	@Override
	protected Interface3 method6091(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class250 arg3, @OriginalArg(5) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!sr;B)V")
	@Override
	public void method6107(@OriginalArg(0) Class293 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLclient!ll;)V")
	@Override
	public void method6128(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		@Pc(2) Class72 local2 = (Class72) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method1960());
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8818(@OriginalArg(0) int arg0) {
		this.aQr1.a(-17898);
		super.method8818(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "(I)V")
	@Override
	protected void method6129() {
		this.anIDirect3DDevice1.a(15, this.aBoolean471);
	}

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "()V")
	@Override
	protected void method8826() {
		this.aQr1.c(28501);
		super.method8826();
	}

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "(I)V")
	@Override
	protected void method6090() {
		if (Static475.aClass381_11 == this.aClass381_9) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass381_9 == Static39.aClass381_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static287.aClass381_12 == this.aClass381_9) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
	@Override
	protected void method6031() {
		if (this.aBoolean462) {
			Static157.aFloatArray37[0] = 1.0F;
			Static157.aFloatArray37[5] = 1.0F;
			Static157.aFloatArray37[1] = 0.0F;
			Static157.aFloatArray37[15] = 1.0F;
			Static157.aFloatArray37[12] = 0.0F;
			Static157.aFloatArray37[13] = 0.0F;
			Static157.aFloatArray37[10] = 1.0F;
			Static157.aFloatArray37[9] = 0.0F;
			Static157.aFloatArray37[8] = 0.0F;
			Static157.aFloatArray37[6] = 0.0F;
			Static157.aFloatArray37[14] = 0.0F;
			Static157.aFloatArray37[3] = 0.0F;
			Static157.aFloatArray37[4] = 0.0F;
			Static157.aFloatArray37[7] = 0.0F;
			Static157.aFloatArray37[2] = 0.0F;
			Static157.aFloatArray37[11] = 0.0F;
		} else {
			this.aClass154_Sub2_15.method4526(Static157.aFloatArray37);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static157.aFloatArray37);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	@Override
	public void method8776() {
	}

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "(I)V")
	@Override
	protected void method6054() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7159 + this.anInt7149, this.anInt7137 + this.anInt7146, this.anInt7155, this.anInt7147);
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "(I)V")
	@Override
	protected void method6040() {
		this.method6159();
		this.method6080();
	}

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "(I)V")
	@Override
	protected void method6080() {
		if (this.aBoolean239) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean239 = true;
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(II)Lclient!nia;")
	@Override
	protected Class7 method6098(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class7_Sub7(this, this.aClass353_62);
		} else if (arg0 == 4) {
			return new Class7_Sub5(this, this.aClass353_62, this.aClass249_7);
		} else if (arg0 == 8) {
			return new Class7_Sub8(this, this.aClass353_62, this.aClass249_7);
		} else {
			return super.method6098(arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "()Lclient!kaa;")
	@Override
	public Class168 method8779() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt3321, 0);
		return new Class168(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "(B)V")
	@Override
	protected void method6120() {
		if (this.aBooleanArray19[this.anInt7127]) {
			this.aBooleanArray19[this.anInt7127] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7127, (IDirect3DBaseTexture) null);
			this.method6136();
			this.method6059();
		}
	}

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "(I)Z")
	private boolean method2985() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(23) Class277 local23 = (Class277) this.anObject15;
			this.method6048();
			local23.method7131();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static157.method2989(this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1, this.anInt3322, this.anInt3321, this.anInt7161)) {
				@Pc(57) int local57 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (co.a((byte) 114, local57)) {
					local23.method7132(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.b());
					this.method6102();
					this.method6151();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "()V")
	@Override
	public void method8852() {
	}

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "(Z)V")
	@Override
	protected void method6153() {
		this.anIDirect3DDevice1.a(27, this.aBoolean482);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	@Override
	public void method8775(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (co.a((byte) 72, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && co.a((byte) 61, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (local54 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
					this.aPixelBuffer1.b(local1, arg2 * local75, local75 * local54, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) 116);
		local16.a((byte) 101);
		return local1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIIII[BLclient!pd;I)Lclient!ch;")
	@Override
	protected Interface3 method6049(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) Class250 arg3, @OriginalArg(7) int arg4) {
		return new Class46_Sub2(this, arg3, arg1, arg4, arg0, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "(B)F")
	@Override
	protected float method6115() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!cc;I)V")
	public void method2988(@OriginalArg(0) Class46_Sub1 arg0) {
		this.method2990(arg0);
		if (!this.aBooleanArray18[this.anInt7127]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 1, 1);
			this.aBooleanArray18[this.anInt7127] = true;
		}
		if (!this.aBooleanArray20[this.anInt7127]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 2, 1);
			this.aBooleanArray20[this.anInt7127] = true;
		}
	}

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "(I)V")
	@Override
	protected void method6058() {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8855(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8800(arg2, arg3);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!lf;ZIZZ)V")
	@Override
	public void method6079(@OriginalArg(0) Class187 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(15) byte local15;
		if (arg2 == 1) {
			local15 = 3;
		} else if (arg2 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		if (arg1) {
			local1 = 32;
		}
		if (arg3) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, local15, Static157.method2984(arg0) | local1);
	}

	@OriginalMember(owner = "client!fi", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!hca;I)V")
	public void method2990(@OriginalArg(0) Class46 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7127, arg0.method4660());
		if (this.aClass82Array1[this.anInt7127] != arg0.aClass82_8) {
			@Pc(61) int local61 = Static157.method2986(arg0.aClass82_8);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 6, local61);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 5, local61);
			this.aClass82Array1[this.anInt7127] = arg0.aClass82_8;
			if (arg0.aBoolean356 != this.aBooleanArray21[this.anInt7127]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 7, arg0.aBoolean356 ? Static157.method2986(arg0.aClass82_8) : 0);
				this.aBooleanArray21[this.anInt7127] = arg0.aBoolean356;
			}
		} else if (arg0.aBoolean356 != this.aBooleanArray21[this.anInt7127]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 7, arg0.aBoolean356 ? Static157.method2986(arg0.aClass82_8) : 0);
			this.aBooleanArray21[this.anInt7127] = arg0.aBoolean356;
		}
		if (!this.aBooleanArray19[this.anInt7127]) {
			this.aBooleanArray19[this.anInt7127] = true;
			this.method6136();
			this.method6059();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!jagdx/IDirect3DPixelShader;)V")
	public void method2991(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "(B)V")
	@Override
	protected void method6108() {
		this.anIDirect3DDevice1.a(14, this.aBoolean477 && this.aBoolean464);
	}

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	@Override
	protected void method6093(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (arg1 != this.aCanvas7) {
			return;
		}
		@Pc(10) Dimension local10 = arg1.getSize();
		if (local10.width > 0 && local10.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method2985();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "(B)V")
	@Override
	protected void method6113() {
		this.anIDirect3DDevice1.a(28, this.aBoolean475 && this.aBoolean476 && this.anInt7148 >= 0);
	}

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "()Z")
	@Override
	public boolean method8811() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ok;ILclient!pd;ZI)Lclient!ch;")
	@Override
	public Interface3 method6082(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) int arg3) {
		return new Class46_Sub2(this, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	@Override
	protected void method6036() {
		@Pc(9) int local9;
		for (local9 = 0; local9 < this.anInt7126; local9++) {
			@Pc(22) Class6_Sub1 local22 = this.aClass6_Sub1Array3[local9];
			@Pc(26) int local26 = local9 + 2;
			@Pc(30) int local30 = local22.method8265();
			@Pc(36) float local36 = local22.method8266() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local22.method8264(), (float) local22.method8267(), (float) local22.method8260());
			this.aD3DLIGHT2.SetDiffuse(local36 * (float) (local30 >> 16 & 0xFF), local36 * (float) (local30 >> 8 & 0xFF), local36 * (float) (local30 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local22.method8268() * local22.method8268()));
			this.aD3DLIGHT2.SetRange((float) local22.method8268());
			this.anIDirect3DDevice1.SetLight(local26, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local26, true);
		}
		while (this.anInt7143 > local9) {
			this.anIDirect3DDevice1.LightEnable(local9 + 2, false);
			local9++;
		}
		super.method6036();
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(II)V")
	@Override
	public void method6070(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, 11, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "(B)V")
	@Override
	protected void method6104() {
		if (this.aClass160_7.method4615()) {
			this.aClass154_Sub2_18.method4526(Static157.aFloatArray37);
		} else {
			Static157.aFloatArray37[7] = 0.0F;
			Static157.aFloatArray37[3] = 0.0F;
			Static157.aFloatArray37[15] = 1.0F;
			Static157.aFloatArray37[14] = 0.0F;
			Static157.aFloatArray37[0] = 1.0F;
			Static157.aFloatArray37[4] = 0.0F;
			Static157.aFloatArray37[2] = 0.0F;
			Static157.aFloatArray37[12] = 0.0F;
			Static157.aFloatArray37[6] = 0.0F;
			Static157.aFloatArray37[5] = 1.0F;
			Static157.aFloatArray37[10] = 1.0F;
			Static157.aFloatArray37[1] = 0.0F;
			Static157.aFloatArray37[8] = 0.0F;
			Static157.aFloatArray37[13] = 0.0F;
			Static157.aFloatArray37[11] = 0.0F;
			Static157.aFloatArray37[9] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static157.aFloatArray37);
	}

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "(I)V")
	@Override
	protected void method6159() {
		@Pc(7) float local7 = this.aBoolean473 ? this.aFloat132 : 0.0F;
		@Pc(16) float local16 = this.aBoolean473 ? -this.aFloat139 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat130, local7 * this.aFloat138, this.aFloat127 * local7, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat130 * local16, local16 * this.aFloat138, local16 * this.aFloat127, 0.0F);
		this.aBoolean239 = false;
	}

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "(I)V")
	@Override
	protected void method6063() {
		if (this.anIDirect3DVertexShader1 != null || Static477.aClass377_11 == this.aClass377Array3[this.anInt7127]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, 24, 0);
			this.anIntArray204[this.anInt7127] = 0;
			return;
		}
		if (Static104.aClass377_2 == this.aClass377Array3[this.anInt7127]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7127 + 16, this.aClass154_Sub2Array3[this.anInt7127].method4520(Static157.aFloatArray37));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7127 + 16, this.aClass154_Sub2Array3[this.anInt7127].method4526(Static157.aFloatArray37));
		}
		@Pc(77) int local77 = Static157.method2987(this.aClass377Array3[this.anInt7127]);
		if (local77 != this.anIntArray204[this.anInt7127]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, 24, local77);
			this.anIntArray204[this.anInt7127] = local77;
		}
	}

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "(B)V")
	@Override
	protected void method6136() {
		@Pc(19) int local19 = this.aBooleanArray19[this.anInt7127] ? Static157.method2994(this.aClass256Array6[this.anInt7127]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, 4, local19);
	}

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "(I)V")
	@Override
	protected void method6061() {
		this.aFloat135 = (float) (this.anInt7140 - this.anInt7152);
		this.aFloat137 = this.aFloat135 - (float) this.anInt7148;
		if (this.aFloat137 < (float) this.anInt7142) {
			this.aFloat137 = (float) this.anInt7142;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat137);
		this.anIDirect3DDevice1.a(37, this.aFloat135);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7158);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!lf;IZZ)V")
	@Override
	protected void method6057(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) byte local15;
		if (arg1 == 1) {
			local15 = 6;
		} else if (arg1 == 2) {
			local15 = 27;
		} else {
			local15 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, local15, Static157.method2984(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Lclient!dk;")
	@Override
	public Interface5 method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!om;Lclient!om;FLclient!om;)Lclient!om;")
	@Override
	public Class57 method8827(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "(B)V")
	@Override
	public void method6109() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray60[0], -this.aFloatArray60[1], -this.aFloatArray60[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray59[0], -this.aFloatArray59[1], -this.aFloatArray59[2]);
		this.aBoolean239 = false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6117(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "(B)V")
	@Override
	protected void method6162() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7162);
	}

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "(I)V")
	@Override
	protected void method6095() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7149, this.anInt7146, this.anInt7000, this.anInt7091, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "()V")
	@Override
	public void method8851() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (co.a((byte) 55, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) 96);
	}

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "(B)V")
	@Override
	protected void method6116() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat126 * this.aFloat130, this.aFloat138 * this.aFloat126, this.aFloat127 * this.aFloat126, 0.0F);
		this.aBoolean239 = false;
	}

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([[IIZZ)Lclient!pf;")
	@Override
	public Interface19 method6163(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class46_Sub3(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "(B)V")
	@Override
	protected void method6160() {
		this.anIDirect3DDevice1.a(7, this.aBoolean463);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!bi;Lclient!dk;)Lclient!pk;")
	@Override
	public Interface20 method8839(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface5 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!ok;Lclient!pd;)Z")
	@Override
	public boolean method6085(@OriginalArg(1) Class242 arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return co.a((byte) 80, this.anIDirect3D1.a(this.anInt3321, local3)) && co.a((byte) 95, this.anIDirect3D1.CheckDeviceFormat(this.anInt3321, this.anInt3322, local3.Format, 0, 4, Static157.method2992(arg1, arg0)));
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lclient!bq;I)Lclient!sr;")
	@Override
	public Class293 method6041(@OriginalArg(0) Class41[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()Z")
	@Override
	public boolean method8784() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!ok;Lclient!pd;)Z")
	@Override
	public boolean method6050(@OriginalArg(1) Class242 arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = new D3DDISPLAYMODE();
		return co.a((byte) 124, this.anIDirect3D1.a(this.anInt3321, local12)) && co.a((byte) 127, this.anIDirect3D1.CheckDeviceFormat(this.anInt3321, this.anInt3322, local12.Format, 0, 3, Static157.method2992(arg1, arg0)));
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!pk;)V")
	@Override
	public void method8794(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6034(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass277_1 = (Class277) arg0;
	}

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "()V")
	@Override
	public void method8854() {
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6112() {
		this.anIDirect3DDevice1.a(174, this.aBoolean483);
	}

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "(I)V")
	@Override
	protected void method6059() {
		@Pc(15) int local15 = this.aBooleanArray19[this.anInt7127] ? Static157.method2994(this.aClass256Array5[this.anInt7127]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, 1, local15);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IZ)Lclient!jf;")
	@Override
	public Interface11 method6101(@OriginalArg(1) boolean arg0) {
		return new Class45(this, Static409.aClass242_14, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
	@Override
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass277_1.method7133()) {
			this.anInt3320 = 0;
			if (co.a(this.aClass277_1.method7130(), 2005530599)) {
				this.method2985();
			}
		} else if (++this.anInt3320 <= 50) {
			this.method2985();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "(B)V")
	@Override
	protected void method6126() {
		this.anIDirect3DDevice1.a(137, this.aBoolean470 && !this.aBoolean466);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ef;BII)V")
	@Override
	public void method6147(@OriginalArg(0) Class77 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static157.method2993(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([BIIZILclient!pd;)Lclient!kj;")
	@Override
	public Interface15 method6053(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class250 arg1) {
		return new Class46_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6071(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "()V")
	@Override
	public void method8806() {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method6065(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6152() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray64);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;I)V")
	public void method2995(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method6063();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!dga;)V")
	public void method2996(@OriginalArg(1) Class46_Sub2 arg0) {
		this.method2990(arg0);
		if (this.aBooleanArray18[this.anInt7127] != arg0.aBoolean148) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 1, arg0.aBoolean148 ? 1 : 3);
			this.aBooleanArray18[this.anInt7127] = arg0.aBoolean148;
		}
		if (arg0.aBoolean147 != this.aBooleanArray20[this.anInt7127]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7127, 2, arg0.aBoolean147 ? 1 : 3);
			this.aBooleanArray20[this.anInt7127] = arg0.aBoolean147;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!de;)V")
	@Override
	public void method6087(@OriginalArg(1) Class61 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static380.aClass61_4) {
			local1 = 65536;
		} else if (Static119.aClass61_5 == arg0) {
			local1 = 131072;
		} else if (Static78.aClass61_1 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7127, 11, this.anInt7127 | local1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIILclient!jf;ILclient!ef;)V")
	@Override
	public void method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(6) Class77 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class45) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static157.method2993(arg5), 0, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6133(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Lclient!bi;")
	@Override
	public Interface2 method8807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)Lclient!ll;")
	@Override
	public Interface17 method6123(@OriginalArg(0) boolean arg0) {
		return new Class72(this, arg0);
	}
}
