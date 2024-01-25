import jaclib.peer.jv;
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
import jagdx.bea;
import jagdx.pq;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class134_Sub1_Sub2 extends Class134_Sub1 {

	@OriginalMember(owner = "client!tb", name = "Eg", descriptor = "Z")
	private boolean aBoolean655 = false;

	@OriginalMember(owner = "client!tb", name = "Tg", descriptor = "I")
	private int anInt8469 = 0;

	@OriginalMember(owner = "client!tb", name = "zg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!tb", name = "ug", descriptor = "I")
	private final int anInt8467;

	@OriginalMember(owner = "client!tb", name = "Jg", descriptor = "Lclient!ks;")
	private Class196 aClass196_1;

	@OriginalMember(owner = "client!tb", name = "Hg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!tb", name = "vg", descriptor = "I")
	private final int anInt8468;

	@OriginalMember(owner = "client!tb", name = "Qg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!tb", name = "Kg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!tb", name = "Dg", descriptor = "Lclient!jaclib/peer/jv;")
	public final jv aJv1;

	@OriginalMember(owner = "client!tb", name = "Gg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!tb", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!tb", name = "Fg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!tb", name = "Ig", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!tb", name = "Lg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!tb", name = "Cg", descriptor = "Z")
	public final boolean aBoolean654;

	@OriginalMember(owner = "client!tb", name = "tg", descriptor = "Z")
	public final boolean aBoolean653;

	@OriginalMember(owner = "client!tb", name = "Og", descriptor = "Z")
	public final boolean aBoolean656;

	@OriginalMember(owner = "client!tb", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!tb", name = "yg", descriptor = "[Z")
	private final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!tb", name = "Ng", descriptor = "[Z")
	private final boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!tb", name = "Bg", descriptor = "[Z")
	private final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!tb", name = "xg", descriptor = "[Lclient!gaa;")
	private final Class115[] aClass115Array1;

	@OriginalMember(owner = "client!tb", name = "Mg", descriptor = "[I")
	private final int[] anIntArray641;

	@OriginalMember(owner = "client!tb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!pu;Ljava/lang/Integer;)Lclient!r;")
	private static Class134 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class134_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) jv local9 = new jv();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x20 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(179) D3DPRESENT_PARAMETERS local179 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static491.method6868(arg3, local3, local5, local179, local13)) {
					throw new RuntimeException("");
				}
				local179.Windowed = true;
				local179.PresentationInterval = Integer.MIN_VALUE;
				local179.EnableAutoDepthStencil = true;
				@Pc(205) int local205 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local205 |= 0x10;
				}
				@Pc(227) IDirect3DDevice local227;
				try {
					local227 = local13.a(local3, local5, arg0, local205 | 0x40, local179);
				} catch (@Pc(229) pq local229) {
					local227 = local13.a(local3, local5, arg0, local205 | 0x20, local179);
				}
				@Pc(248) Class196 local248 = new Class196(local227.c(0), local227.b());
				local1 = new Class134_Sub1_Sub2(local3, local5, arg0, local9, local13, local227, local248, local179, local18, arg1, arg2, arg3);
				local1.method6741();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(271) RuntimeException local271) {
			if (local1 != null) {
				local1.method6923();
			}
			throw local271;
		}
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/jv;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!ks;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!pu;I)V")
	public Class134_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) jv arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class196 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface7 arg9, @OriginalArg(10) Class270 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anInt8467 = arg1;
		this.aClass196_1 = arg6;
		this.anIDirect3D1 = arg4;
		this.anInt8468 = arg0;
		this.aD3DCAPS1 = arg8;
		this.anIDirect3DDevice1 = arg5;
		this.aJv1 = arg3;
		this.aD3DLIGHT2 = new D3DLIGHT(this.aJv1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aJv1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aJv1);
		this.aPixelBuffer1 = new PixelBuffer(this.aJv1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aJv1);
		new GeometryBuffer(this.aJv1);
		this.anInt8455 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean654 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean653 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean648 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean656 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.anInt8453 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean647 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean644 = this.anInt8426 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt8468, this.anInt8467, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray22 = new boolean[this.anInt8455];
		this.aBooleanArray19 = new boolean[this.anInt8455];
		this.aBooleanArray21 = new boolean[this.anInt8455];
		this.aBooleanArray20 = new boolean[this.anInt8455];
		this.aClass115Array1 = new Class115[this.anInt8455];
		this.anIntArray641 = new int[this.anInt8455];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "()Z")
	@Override
	public boolean method6906() {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "()Z")
	@Override
	public boolean method6917() {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "(B)V")
	@Override
	protected void method6790() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8455; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass115Array1[local1] = Static440.aClass115_11;
			this.aBooleanArray22[local1] = this.aBooleanArray19[local1] = true;
			this.aBooleanArray20[local1] = false;
			this.anIntArray641[local1] = 0;
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
		this.aBoolean655 = false;
		super.method6790();
	}

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "(I)V")
	@Override
	protected void method6757() {
		@Pc(13) float local13 = this.aBoolean642 ? this.aFloat198 : 0.0F;
		@Pc(22) float local22 = this.aBoolean642 ? -this.aFloat190 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local13 * this.aFloat189, local13 * this.bf, local13 * this.aFloat195, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local22 * this.aFloat189, local22 * this.bf, local22 * this.aFloat195, 0.0F);
		this.aBoolean655 = false;
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(B)V")
	@Override
	protected void method6779() {
		if (this.aBoolean631) {
			Static491.aFloatArray56[4] = 0.0F;
			Static491.aFloatArray56[15] = 1.0F;
			Static491.aFloatArray56[10] = 1.0F;
			Static491.aFloatArray56[12] = 0.0F;
			Static491.aFloatArray56[2] = 0.0F;
			Static491.aFloatArray56[9] = 0.0F;
			Static491.aFloatArray56[5] = 1.0F;
			Static491.aFloatArray56[14] = 0.0F;
			Static491.aFloatArray56[1] = 0.0F;
			Static491.aFloatArray56[3] = 0.0F;
			Static491.aFloatArray56[11] = 0.0F;
			Static491.aFloatArray56[0] = 1.0F;
			Static491.aFloatArray56[6] = 0.0F;
			Static491.aFloatArray56[8] = 0.0F;
			Static491.aFloatArray56[7] = 0.0F;
			Static491.aFloatArray56[13] = 0.0F;
		} else {
			this.aClass113_Sub3_15.method6052(Static491.aFloatArray56);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static491.aFloatArray56);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!kj;IIZ)V")
	@Override
	protected void method6845(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 6;
		} else if (arg1 == 2) {
			local12 = 27;
		} else {
			local12 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, local12, Static491.method6859(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!bca;)V")
	@Override
	public void method6829(@OriginalArg(0) int arg0, @OriginalArg(2) Interface4 arg1) {
		@Pc(6) Class17 local6 = (Class17) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local6.anIDirect3DVertexBuffer1, 0, local6.method257());
	}

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "(B)V")
	@Override
	protected void method6815() {
		if (this.aClass240_7.method4883()) {
			this.aClass113_Sub3_18.method6052(Static491.aFloatArray56);
		} else {
			Static491.aFloatArray56[8] = 0.0F;
			Static491.aFloatArray56[2] = 0.0F;
			Static491.aFloatArray56[3] = 0.0F;
			Static491.aFloatArray56[5] = 1.0F;
			Static491.aFloatArray56[7] = 0.0F;
			Static491.aFloatArray56[13] = 0.0F;
			Static491.aFloatArray56[10] = 1.0F;
			Static491.aFloatArray56[4] = 0.0F;
			Static491.aFloatArray56[9] = 0.0F;
			Static491.aFloatArray56[14] = 0.0F;
			Static491.aFloatArray56[11] = 0.0F;
			Static491.aFloatArray56[0] = 1.0F;
			Static491.aFloatArray56[15] = 1.0F;
			Static491.aFloatArray56[12] = 0.0F;
			Static491.aFloatArray56[6] = 0.0F;
			Static491.aFloatArray56[1] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static491.aFloatArray56);
	}

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "(B)V")
	@Override
	protected void method6840() {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ[BILclient!lca;IZI)Lclient!oi;")
	@Override
	protected Interface14 method6733(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class203 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4) {
		return new Class65_Sub1(this, arg2, arg1, arg3, arg4, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6925(@OriginalArg(0) int arg0) {
		this.aJv1.a((byte) 116);
		super.method6925(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!qs;)V")
	@Override
	public void method6836(@OriginalArg(1) Class278 arg0) {
		@Pc(7) int local7 = 0;
		if (arg0 == Static343.aClass278_1) {
			local7 = 65536;
		} else if (arg0 == Static440.aClass278_5) {
			local7 = 131072;
		} else if (arg0 == Static438.aClass278_4) {
			local7 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, 11, local7 | this.anInt8433);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!kda;II)V")
	@Override
	public void method6723(@OriginalArg(1) Class185 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static491.method6860(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "(B)V")
	@Override
	protected void method6799() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray48);
	}

	@OriginalMember(owner = "client!tb", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6827(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6811() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8434 + this.anInt8429, this.anInt8447 + this.anInt8449, this.anInt8432, this.anInt8461);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!pb;)V")
	public void method6861(@OriginalArg(1) Class65_Sub3 arg0) {
		this.method6867(arg0);
		if (!this.aBooleanArray22[this.anInt8433]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 1, 1);
			this.aBooleanArray22[this.anInt8433] = true;
		}
		if (!this.aBooleanArray19[this.anInt8433]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 2, 1);
			this.aBooleanArray19[this.anInt8433] = true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6774(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas15 != arg0) {
			return;
		}
		@Pc(7) Dimension local7 = arg0.getSize();
		if (local7.width > 0 && local7.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method6863();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "(B)V")
	@Override
	protected void method6841() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8451);
	}

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "(I)V")
	@Override
	protected void method6844() {
		if (this.aClass231_7 == Static451.aClass231_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass231_7 == Static433.aClass231_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass231_7 == Static212.aClass231_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(IZ)Lclient!bca;")
	@Override
	public Interface4 method6805(@OriginalArg(1) boolean arg0) {
		return new Class17(this, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6747() {
		if (this.aBooleanArray21[this.anInt8433]) {
			this.aBooleanArray21[this.anInt8433] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8433, null);
			this.method6798();
			this.method6797();
		}
	}

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "(I)F")
	@Override
	protected float method6810() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "()Lclient!is;")
	@Override
	public Class162 method6962() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt8468, 0);
		return new Class162(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZ[IIII)Lclient!oi;")
	@Override
	public Interface14 method6809(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class65_Sub1(this, arg3, arg4, arg1, arg2, 0, arg5);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6794(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(II)Lclient!vca;")
	@Override
	protected Class34 method6800(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class34_Sub11(this, this.aClass270_101);
		} else if (arg0 == 4) {
			return new Class34_Sub8(this, this.aClass270_101, this.aClass331_8);
		} else if (arg0 == 8) {
			return new Class34_Sub6(this, this.aClass270_101, this.aClass331_8);
		} else {
			return super.method6800(arg0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "()V")
	@Override
	public void method6969() {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BIIILclient!lca;)Lclient!jb;")
	@Override
	public Interface11 method6842(@OriginalArg(1) byte[] arg0, @OriginalArg(5) Class203 arg1) {
		return new Class65_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "(B)V")
	@Override
	protected void method6798() {
		@Pc(15) int local15 = this.aBooleanArray21[this.anInt8433] ? Static491.method6862(this.aClass82Array6[this.anInt8433]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, 4, local15);
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (bea.a(-96, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && bea.a(-111, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local55) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.b(local1, arg2 * local72, local72 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -80);
		local16.a((byte) -80);
		return local1;
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "()V")
	@Override
	public void method6907() {
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)V")
	@Override
	public void method6780(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "(B)V")
	@Override
	protected void method6807() {
		this.anIDirect3DDevice1.a(137, this.aBoolean649 && !this.aBoolean636);
	}

	@OriginalMember(owner = "client!tb", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "(I)Z")
	private boolean method6863() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(22) Class196 local22 = (Class196) this.anObject21;
			this.method6812();
			local22.method3939();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static491.method6868(this.anInt8426, this.anInt8468, this.anInt8467, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1)) {
				@Pc(57) int local57 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (bea.a(-89, local57)) {
					local22.method3940(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.b());
					this.method6736();
					this.method6790();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lca;Lclient!ig;Z)Z")
	@Override
	public boolean method6777(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class155 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return bea.a(-34, this.anIDirect3D1.a(this.anInt8468, local8)) && bea.a(109, this.anIDirect3D1.CheckDeviceFormat(this.anInt8468, this.anInt8467, local8.Format, 0, 4, Static491.method6865(arg1, arg0)));
	}

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "()V")
	@Override
	public void method6944() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass196_1.method3938()) {
			this.anInt8469 = 0;
			if (bea.b(this.aClass196_1.method3937(), -89)) {
				this.method6863();
			}
		} else if (++this.anInt8469 <= 50) {
			this.method6863();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "(I)V")
	@Override
	protected void method6772() {
		this.anIDirect3DDevice1.a(14, this.aBoolean646 && this.aBoolean639);
	}

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "(I)V")
	@Override
	protected void method6848() {
		this.method6757();
		this.method6793();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!kda;IIZLclient!rn;II)V")
	@Override
	public void method6765(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface20 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class53) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static491.method6860(arg0), 0, arg2, arg4, arg5, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "(I)V")
	@Override
	public void method6755() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray47[0], -this.aFloatArray47[1], -this.aFloatArray47[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray52[0], -this.aFloatArray52[1], -this.aFloatArray52[2]);
		this.aBoolean655 = false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!db;I)V")
	public void method6864(@OriginalArg(0) Class65_Sub1 arg0) {
		this.method6867(arg0);
		if (this.aBooleanArray22[this.anInt8433] != arg0.aBoolean115) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 1, arg0.aBoolean115 ? 1 : 3);
			this.aBooleanArray22[this.anInt8433] = arg0.aBoolean115;
		}
		if (arg0.aBoolean116 != this.aBooleanArray19[this.anInt8433]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 2, arg0.aBoolean116 ? 1 : 3);
			this.aBooleanArray19[this.anInt8433] = arg0.aBoolean116;
		}
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(II)V")
	@Override
	public void method6852(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, 11, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "(Z)V")
	@Override
	protected void method6795() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8456; local1++) {
			@Pc(10) Class1_Sub18 local10 = this.aClass1_Sub18Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method4102();
			@Pc(24) float local24 = local10.method4099() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method4107(), (float) local10.method4101(), (float) local10.method4098());
			this.aD3DLIGHT1.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, local24 * (float) (local18 >> 8 & 0xFF), (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method4104() * local10.method4104()));
			this.aD3DLIGHT1.SetRange((float) local10.method4104());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt8457) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6795();
	}

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "(B)V")
	@Override
	protected void method6801() {
		this.anIDirect3DDevice1.a(15, this.aBoolean640);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	@Override
	public void method6903(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!ig;Lclient!lca;IB)Lclient!oi;")
	@Override
	public Interface14 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3) {
		return new Class65_Sub1(this, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "(I)V")
	@Override
	protected void method6739() {
		if (this.aClass309Array3[this.anInt8433] == Static428.aClass309_6) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, 24, 0);
			this.anIntArray641[this.anInt8433] = 0;
			return;
		}
		if (this.aClass309Array3[this.anInt8433] == Static301.aClass309_5) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8433 + 16, this.aClass113_Sub3Array3[this.anInt8433].method6052(Static491.aFloatArray56));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8433 + 16, this.aClass113_Sub3Array3[this.anInt8433].method6060(Static491.aFloatArray56));
		}
		@Pc(70) int local70 = Static491.method6866(this.aClass309Array3[this.anInt8433]);
		if (this.anIntArray641[this.anInt8433] != local70) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, 24, local70);
			this.anIntArray641[this.anInt8433] = local70;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([[IZIB)Lclient!gp;")
	@Override
	public Interface8 method6771(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return new Class65_Sub2(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ig;ZLclient!lca;)Z")
	@Override
	public boolean method6820(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class203 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return bea.a(-103, this.anIDirect3D1.a(this.anInt8468, local11)) && bea.a(-12, this.anIDirect3D1.CheckDeviceFormat(this.anInt8468, this.anInt8467, local11.Format, 0, 3, Static491.method6865(arg0, arg1)));
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V")
	@Override
	protected void method6767() {
		this.anIDirect3DDevice1.a(174, this.aBoolean652);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!rd;)V")
	@Override
	public void method6743(@OriginalArg(1) Class284 arg0) {
		@Pc(12) dxVertexLayout local12 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local12.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(BZ)Lclient!rn;")
	@Override
	public Interface20 method6804(@OriginalArg(1) boolean arg0) {
		return new Class53(this, Static215.aClass155_11, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "()V")
	@Override
	public void method6934() {
	}

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "(I)V")
	@Override
	protected void method6793() {
		if (this.aBoolean655) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean655 = true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!hba;)V")
	public void method6867(@OriginalArg(1) Class65 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8433, arg0.method5453());
		if (this.aClass115Array1[this.anInt8433] != arg0.aClass115_10) {
			@Pc(58) int local58 = Static491.method6858(arg0.aClass115_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 6, local58);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 5, local58);
			this.aClass115Array1[this.anInt8433] = arg0.aClass115_10;
			if (arg0.aBoolean556 != this.aBooleanArray20[this.anInt8433]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 7, arg0.aBoolean556 ? Static491.method6858(arg0.aClass115_10) : 0);
				this.aBooleanArray20[this.anInt8433] = arg0.aBoolean556;
			}
		} else if (this.aBooleanArray20[this.anInt8433] != arg0.aBoolean556) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8433, 7, arg0.aBoolean556 ? Static491.method6858(arg0.aClass115_10) : 0);
			this.aBooleanArray20[this.anInt8433] = arg0.aBoolean556;
		}
		if (!this.aBooleanArray21[this.anInt8433]) {
			this.aBooleanArray21[this.anInt8433] = true;
			this.method6798();
			this.method6797();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLclient!kj;IIZ)V")
	@Override
	public void method6791(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) byte local12;
		if (arg2 == 1) {
			local12 = 3;
		} else if (arg2 == 2) {
			local12 = 26;
		} else {
			local12 = 2;
		}
		@Pc(20) int local20 = 0;
		if (arg0) {
			local20 = 32;
		}
		if (arg3) {
			local20 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, local12, Static491.method6859(arg1) | local20);
	}

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "(Z)V")
	@Override
	protected void method6797() {
		@Pc(19) int local19 = this.aBooleanArray21[this.anInt8433] ? Static491.method6862(this.aClass82Array5[this.anInt8433]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8433, 1, local19);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6751(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "(I)V")
	@Override
	protected void method6745() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat196 * this.aFloat189, this.aFloat196 * this.bf, this.aFloat196 * this.aFloat195, 0.0F);
		this.aBoolean655 = false;
	}

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "(B)V")
	@Override
	protected void method6796() {
		this.anIDirect3DDevice1.a(27, this.aBoolean637);
	}

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "(I)V")
	@Override
	protected void method6762() {
		this.anIDirect3DDevice1.a(7, this.aBoolean651);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Lclient!af;)Lclient!rd;")
	@Override
	public Class284 method6855(@OriginalArg(1) Class7[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6763() {
		this.aFloat187 = this.anInt8440 - this.anInt8437;
		this.aFloat201 = this.aFloat187 - (float) this.anInt8430;
		if (this.aFloat201 < (float) this.anInt8463) {
			this.aFloat201 = this.anInt8463;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat201);
		this.anIDirect3DDevice1.a(37, this.aFloat187);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8460);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!jba;Lclient!jba;FLclient!jba;)Lclient!jba;")
	@Override
	public Class83 method6895(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class83 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
	@Override
	public void method6898() {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6930(@OriginalArg(0) Class22 arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6944();
	}

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "()V")
	@Override
	protected void method6923() {
		this.aJv1.c((byte) -84);
		super.method6923();
	}

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "(I)V")
	@Override
	protected void method6769() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8429, this.anInt8449, this.anInt8399, this.anInt8356, (float) 0, 1.0F);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([FILclient!lca;IIZII)Lclient!oi;")
	@Override
	protected Interface14 method6759(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method6750(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass196_1 = (Class196) arg1;
	}

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "()V")
	@Override
	public void method6971() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (bea.a(119, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -80);
	}

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6792() {
		this.anIDirect3DDevice1.a(28, this.aBoolean632 && this.aBoolean634 && this.anInt8430 >= 0);
	}
}
