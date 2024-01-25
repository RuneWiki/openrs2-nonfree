import jaclib.peer.vo;
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
import jagdx.gh;
import jagdx.te;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class121_Sub2_Sub2 extends Class121_Sub2 {

	@OriginalMember(owner = "client!ui", name = "Wg", descriptor = "Z")
	private boolean aBoolean631 = false;

	@OriginalMember(owner = "client!ui", name = "ah", descriptor = "I")
	private int anInt8934 = 0;

	@OriginalMember(owner = "client!ui", name = "Lg", descriptor = "I")
	private final int anInt8933;

	@OriginalMember(owner = "client!ui", name = "Gg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ui", name = "Kg", descriptor = "I")
	private final int anInt8932;

	@OriginalMember(owner = "client!ui", name = "Vg", descriptor = "Lclient!re;")
	private Class272 aClass272_1;

	@OriginalMember(owner = "client!ui", name = "ch", descriptor = "Lclient!jaclib/peer/vo;")
	public final vo aVo1;

	@OriginalMember(owner = "client!ui", name = "Qg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ui", name = "Mg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ui", name = "Og", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ui", name = "Jg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ui", name = "Hg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ui", name = "Sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ui", name = "Ig", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ui", name = "Fg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ui", name = "Eg", descriptor = "Z")
	public final boolean aBoolean630;

	@OriginalMember(owner = "client!ui", name = "dh", descriptor = "Z")
	public final boolean aBoolean632;

	@OriginalMember(owner = "client!ui", name = "Dg", descriptor = "Z")
	public final boolean aBoolean629;

	@OriginalMember(owner = "client!ui", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray45;

	@OriginalMember(owner = "client!ui", name = "Zg", descriptor = "[Lclient!td;")
	private final Class301[] aClass301Array1;

	@OriginalMember(owner = "client!ui", name = "Pg", descriptor = "[I")
	private final int[] anIntArray667;

	@OriginalMember(owner = "client!ui", name = "Tg", descriptor = "[Z")
	private final boolean[] aBooleanArray43;

	@OriginalMember(owner = "client!ui", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray44;

	@OriginalMember(owner = "client!ui", name = "Yg", descriptor = "[Z")
	private final boolean[] aBooleanArray46;

	@OriginalMember(owner = "client!ui", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!e;Lclient!pq;Ljava/lang/Integer;)Lclient!oa;")
	private static Class121 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class121_Sub2_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) vo local9 = new vo();
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
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(181) D3DPRESENT_PARAMETERS local181 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static515.method7301(local3, local181, arg3, local5, local13)) {
					throw new RuntimeException("");
				}
				local181.Windowed = true;
				local181.PresentationInterval = Integer.MIN_VALUE;
				local181.EnableAutoDepthStencil = true;
				@Pc(207) int local207 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local207 |= 0x10;
				}
				@Pc(228) IDirect3DDevice local228;
				try {
					local228 = local13.a(local3, local5, arg0, local207 | 0x40, local181);
				} catch (@Pc(230) gh local230) {
					local228 = local13.a(local3, local5, arg0, local207 | 0x20, local181);
				}
				@Pc(249) Class272 local249 = new Class272(local228.b(0), local228.b());
				local1 = new Class121_Sub2_Sub2(local3, local5, arg0, local9, local13, local228, local249, local181, local18, arg1, arg2, arg3);
				local1.method7196();
				return local1;
			}
		} catch (@Pc(272) RuntimeException local272) {
			if (local1 != null) {
				local1.method7125();
			}
			throw local272;
		}
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/vo;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!re;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!e;Lclient!pq;I)V")
	public Class121_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) vo arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class272 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface7 arg9, @OriginalArg(10) Class251 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt8933 = arg1;
		this.aD3DCAPS1 = arg8;
		this.anInt8932 = arg0;
		this.aClass272_1 = arg6;
		this.aVo1 = arg3;
		this.anIDirect3DDevice1 = arg5;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anIDirect3D1 = arg4;
		this.aD3DLIGHT2 = new D3DLIGHT(this.aVo1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aVo1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aVo1);
		this.aPixelBuffer1 = new PixelBuffer(this.aVo1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aVo1);
		new GeometryBuffer(this.aVo1);
		this.aBoolean630 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean632 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.anInt8922 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.anInt8894 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean629 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean617 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean610 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean626 = this.anInt8919 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt8932, this.anInt8933, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray45 = new boolean[this.anInt8922];
		this.aClass301Array1 = new Class301[this.anInt8922];
		this.anIntArray667 = new int[this.anInt8922];
		this.aBooleanArray43 = new boolean[this.anInt8922];
		this.aBooleanArray44 = new boolean[this.anInt8922];
		this.aBooleanArray46 = new boolean[this.anInt8922];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method7128();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(245) Exception_Sub1 local245) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(Z)V")
	@Override
	public void method7135(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "(I)V")
	@Override
	protected void method7207() {
		if (this.aBooleanArray44[this.anInt8907]) {
			this.aBooleanArray44[this.anInt8907] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8907, null);
			this.method7222();
			this.method7212();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!laa;)V")
	public void method7299(@OriginalArg(1) Class25_Sub2 arg0) {
		this.method7307(arg0);
		if (!this.aBooleanArray45[this.anInt8907]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 1, 1);
			this.aBooleanArray45[this.anInt8907] = true;
		}
		if (!this.aBooleanArray46[this.anInt8907]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 2, 1);
			this.aBooleanArray46[this.anInt8907] = true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "Z", descriptor = "(I)Z")
	private boolean method7302() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(18) Class272 local18 = (Class272) this.anObject29;
			this.method7194();
			local18.method6318();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static515.method7301(this.anInt8932, this.aD3DPRESENT_PARAMETERS1, this.anInt8919, this.anInt8933, this.anIDirect3D1)) {
				@Pc(51) int local51 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (te.a(2005530599, local51)) {
					local18.method6320(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.b(0));
					this.method7227();
					this.method7237();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7100(@OriginalArg(0) int arg0) {
		this.aVo1.a((byte) 13);
		super.method7100(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "(B)V")
	@Override
	protected void method7256() {
		if (this.aBoolean618) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt8926);
			return;
		}
		this.aFloat192 = this.anInt8906 - this.anInt8898;
		this.aFloat200 = this.aFloat192 - (float) this.anInt8913;
		if ((float) this.anInt8893 > this.aFloat200) {
			this.aFloat200 = this.anInt8893;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat200);
		this.anIDirect3DDevice1.a(37, this.aFloat192);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8914);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[BILclient!nl;ZZII)Lclient!sd;")
	@Override
	protected Interface20 method7214(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class214 arg3, @OriginalArg(5) boolean arg4) {
		return new Class25_Sub3(this, arg3, arg2, arg0, arg4, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!ll;)V")
	@Override
	public void method7241(@OriginalArg(1) Class186 arg0) {
		@Pc(7) int local7 = 0;
		if (Static414.aClass186_3 == arg0) {
			local7 = 65536;
		} else if (arg0 == Static152.aClass186_1) {
			local7 = 131072;
		} else if (arg0 == Static490.aClass186_4) {
			local7 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, 11, this.anInt8907 | local7);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIILclient!nl;BII[F)Lclient!sd;")
	@Override
	protected Interface20 method7269(@OriginalArg(0) boolean arg0, @OriginalArg(3) Class214 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	@Override
	protected void method7177() {
		this.anIDirect3DDevice1.a(15, this.aBoolean609);
	}

	@OriginalMember(owner = "client!ui", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return 0;
	}

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "(I)V")
	@Override
	protected void method7176() {
		this.anIDirect3DDevice1.a(7, this.aBoolean624);
	}

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "()Lclient!ru;")
	@Override
	public Class282 method7124() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt8932, 0);
		return new Class282(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7237() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt8922; local9++) {
			this.anIDirect3DDevice1.SetSamplerState(local9, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local9, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local9, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local9, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local9, 2, 1);
			this.aClass301Array1[local9] = Static563.aClass301_11;
			this.aBooleanArray45[local9] = this.aBooleanArray46[local9] = true;
			this.aBooleanArray43[local9] = false;
			this.anIntArray667[local9] = 0;
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
		this.aBoolean631 = false;
		super.method7237();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!aq;Lclient!aq;FLclient!aq;)Lclient!aq;")
	@Override
	public Class17 method7104(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ui", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (te.a(2005530599, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1)) && te.a(2005530599, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(73) int local73 = 0; local73 < arg3; local73++) {
					this.aPixelBuffer1.b(local1, arg2 * local73, local73 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -93);
		local16.a((byte) -84);
		return local1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Lclient!qr;")
	@Override
	protected Class92 method7173(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class92_Sub4(this, this.aClass251_145);
		} else if (arg0 == 4) {
			return new Class92_Sub7(this, this.aClass251_145, this.aClass269_5);
		} else {
			return super.method7173(arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILclient!nl;[BI)Lclient!gp;")
	@Override
	public Interface12 method7276(@OriginalArg(3) Class214 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class25_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "(B)V")
	@Override
	protected void method7293() {
		this.anIDirect3DDevice1.a(28, this.aBoolean616 && this.aBoolean615 && this.anInt8913 >= 0 | this.aBoolean618);
	}

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "()V")
	@Override
	public void method7114() {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7133(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7128();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!eea;IILclient!nl;)Lclient!sd;")
	@Override
	public Interface20 method7185(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class214 arg3) {
		return new Class25_Sub3(this, arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "()V")
	@Override
	public void method7128() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass272_1.method6321()) {
			this.anInt8934 = 0;
			if (te.a((byte) 112, this.aClass272_1.method6319())) {
				this.method7302();
			}
		} else if (++this.anInt8934 <= 50) {
			this.method7302();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIZILclient!tk;)V")
	@Override
	public void method7282(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class305 arg3) {
		@Pc(1) int local1 = 0;
		@Pc(15) byte local15;
		if (arg1 == 1) {
			local15 = 3;
		} else if (arg1 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		if (arg0) {
			local1 = 32;
		}
		if (arg2) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, local15, local1 | Static515.method7300(arg3));
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!nl;ILclient!eea;)Z")
	@Override
	public boolean method7259(@OriginalArg(0) Class214 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return te.a(2005530599, this.anIDirect3D1.a(this.anInt8932, local11)) && te.a(2005530599, this.anIDirect3D1.CheckDeviceFormat(this.anInt8932, this.anInt8933, local11.Format, 0, 4, Static515.method7305(arg1, arg0)));
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!vp;)V")
	@Override
	public void method7297(@OriginalArg(1) int arg0, @OriginalArg(2) Interface23 arg1) {
		@Pc(2) Class201 local2 = (Class201) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method4804());
	}

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "(I)V")
	@Override
	protected void method7203() {
		if (this.aBoolean608) {
			Static515.aFloatArray63[4] = 0.0F;
			Static515.aFloatArray63[14] = 0.0F;
			Static515.aFloatArray63[15] = 1.0F;
			Static515.aFloatArray63[1] = 0.0F;
			Static515.aFloatArray63[12] = 0.0F;
			Static515.aFloatArray63[10] = 1.0F;
			Static515.aFloatArray63[7] = 0.0F;
			Static515.aFloatArray63[11] = 0.0F;
			Static515.aFloatArray63[6] = 0.0F;
			Static515.aFloatArray63[2] = 0.0F;
			Static515.aFloatArray63[8] = 0.0F;
			Static515.aFloatArray63[5] = 1.0F;
			Static515.aFloatArray63[13] = 0.0F;
			Static515.aFloatArray63[9] = 0.0F;
			Static515.aFloatArray63[0] = 1.0F;
			Static515.aFloatArray63[3] = 0.0F;
		} else {
			this.aClass34_Sub3_15.method3772(Static515.aFloatArray63);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static515.aFloatArray63);
	}

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "()Z")
	@Override
	public boolean method7141() {
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "(I)V")
	@Override
	public void method7246() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray59[0], -this.aFloatArray59[1], -this.aFloatArray59[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([Lclient!oh;I)Lclient!qca;")
	@Override
	public Class258 method7285(@OriginalArg(0) Class228[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIILclient!tk;)V")
	@Override
	protected void method7211(@OriginalArg(2) int arg0, @OriginalArg(3) Class305 arg1) {
		@Pc(15) byte local15;
		if (arg0 == 1) {
			local15 = 6;
		} else if (arg0 == 2) {
			local15 = 27;
		} else {
			local15 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, local15, Static515.method7300(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method7174(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas17 != arg1) {
			return;
		}
		@Pc(10) Dimension local10 = arg1.getSize();
		if (local10.width > 0 && local10.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method7302();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "(I)V")
	@Override
	protected void method7175() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray57);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7221(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!go;IILclient!fo;I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class107 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class197) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static515.method7309(arg4), 0, arg0, arg1, arg5, arg3);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZB)Lclient!vp;")
	@Override
	public Interface23 method7201(@OriginalArg(0) boolean arg0) {
		return new Class201(this, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "(I)V")
	@Override
	protected void method7229() {
		this.anIDirect3DDevice1.a(14, this.aBoolean619 && this.aBoolean621);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "()V")
	@Override
	public void method7084() {
		this.method7228(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(II)V")
	@Override
	public void method7265(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, 11, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7258() {
		if (this.aBoolean631) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean631 = true;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
	@Override
	protected void method7179() {
		@Pc(15) float local15 = this.aBoolean611 ? this.aFloat185 : 0.0F;
		@Pc(24) float local24 = this.aBoolean611 ? -this.aFloat191 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(this.aFloat194 * local15, local15 * this.aFloat186, this.aFloat188 * local15, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(local24 * this.aFloat194, local24 * this.aFloat186, local24 * this.aFloat188, 0.0F);
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!nl;Lclient!eea;Z)Z")
	@Override
	public boolean method7169(@OriginalArg(0) Class214 arg0, @OriginalArg(1) Class82 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = new D3DDISPLAYMODE();
		return te.a(2005530599, this.anIDirect3D1.a(this.anInt8932, local12)) && te.a(2005530599, this.anIDirect3D1.CheckDeviceFormat(this.anInt8932, this.anInt8933, local12.Format, 0, 3, Static515.method7305(arg1, arg0)));
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "()V")
	@Override
	public void method7090() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (te.a(2005530599, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -47);
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
	@Override
	protected void method7162() {
		this.anIDirect3DDevice1.a(27, this.aBoolean622);
	}

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "()V")
	@Override
	public void method7130() {
	}

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "(I)V")
	@Override
	protected void method7191() {
		this.anIDirect3DDevice1.a(137, this.aBoolean625 && !this.aBoolean627);
	}

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "(I)V")
	@Override
	protected void method7267() {
		if (this.aClass68_6.method1433()) {
			this.aClass34_Sub3_18.method3772(Static515.aFloatArray63);
		} else {
			Static515.aFloatArray63[1] = 0.0F;
			Static515.aFloatArray63[2] = 0.0F;
			Static515.aFloatArray63[15] = 1.0F;
			Static515.aFloatArray63[9] = 0.0F;
			Static515.aFloatArray63[12] = 0.0F;
			Static515.aFloatArray63[3] = 0.0F;
			Static515.aFloatArray63[14] = 0.0F;
			Static515.aFloatArray63[5] = 1.0F;
			Static515.aFloatArray63[0] = 1.0F;
			Static515.aFloatArray63[6] = 0.0F;
			Static515.aFloatArray63[8] = 0.0F;
			Static515.aFloatArray63[4] = 0.0F;
			Static515.aFloatArray63[11] = 0.0F;
			Static515.aFloatArray63[7] = 0.0F;
			Static515.aFloatArray63[13] = 0.0F;
			Static515.aFloatArray63[10] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static515.aFloatArray63);
	}

	@OriginalMember(owner = "client!ui", name = "U", descriptor = "(I)V")
	@Override
	protected void method7278() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat194 * this.aFloat199, this.aFloat186 * this.aFloat199, this.aFloat188 * this.aFloat199, 0.0F);
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "(Z)V")
	@Override
	protected void method7279() {
		if (Static479.aClass208_16 == this.aClass208_12) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass208_12 == Static296.aClass208_15) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass208_12 == Static520.aClass208_13) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	@Override
	protected void method7161() {
		this.method7179();
		this.method7258();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method7307(@OriginalArg(0) Class25 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8907, arg0.method7526());
		if (arg0.aClass301_10 != this.aClass301Array1[this.anInt8907]) {
			@Pc(61) int local61 = Static515.method7304(arg0.aClass301_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 6, local61);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 5, local61);
			this.aClass301Array1[this.anInt8907] = arg0.aClass301_10;
			if (arg0.aBoolean643 != this.aBooleanArray43[this.anInt8907]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 7, arg0.aBoolean643 ? Static515.method7304(arg0.aClass301_10) : 0);
				this.aBooleanArray43[this.anInt8907] = arg0.aBoolean643;
			}
		} else if (arg0.aBoolean643 != this.aBooleanArray43[this.anInt8907]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 7, arg0.aBoolean643 ? Static515.method7304(arg0.aClass301_10) : 0);
			this.aBooleanArray43[this.anInt8907] = arg0.aBoolean643;
		}
		if (!this.aBooleanArray44[this.anInt8907]) {
			this.aBooleanArray44[this.anInt8907] = true;
			this.method7222();
			this.method7212();
		}
	}

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "(I)V")
	@Override
	protected void method7222() {
		@Pc(23) int local23 = this.aBooleanArray44[this.anInt8907] ? Static515.method7303(this.aClass59Array5[this.anInt8907]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, 4, local23);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!vn;I)V")
	public void method7308(@OriginalArg(0) Class25_Sub3 arg0) {
		this.method7307(arg0);
		if (arg0.aBoolean645 != this.aBooleanArray45[this.anInt8907]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 1, arg0.aBoolean645 ? 1 : 3);
			this.aBooleanArray45[this.anInt8907] = arg0.aBoolean645;
		}
		if (this.aBooleanArray46[this.anInt8907] != arg0.aBoolean644) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8907, 2, arg0.aBoolean644 ? 1 : 3);
			this.aBooleanArray46[this.anInt8907] = arg0.aBoolean644;
		}
	}

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "()V")
	@Override
	public void method7147() {
	}

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "(Z)V")
	@Override
	protected void method7212() {
		@Pc(15) int local15 = this.aBooleanArray44[this.anInt8907] ? Static515.method7303(this.aClass59Array6[this.anInt8907]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, 1, local15);
	}

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "(I)V")
	@Override
	protected void method7182() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8928);
	}

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "()Z")
	@Override
	public boolean method7139() {
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "()V")
	@Override
	protected void method7125() {
		this.aVo1.a((int) 88);
		super.method7125();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIIIZII)Lclient!sd;")
	@Override
	public Interface20 method7219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		return new Class25_Sub3(this, arg3, arg1, arg4, arg0, 0, arg2);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZI[[I)Lclient!vea;")
	@Override
	public Interface22 method7288(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class25_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "(I)V")
	@Override
	protected void method7260() {
		if (this.aClass168Array3[this.anInt8907] == Static359.aClass168_4) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, 24, 0);
			this.anIntArray667[this.anInt8907] = 0;
			return;
		}
		if (this.aClass168Array3[this.anInt8907] == Static268.aClass168_3) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8907 + 16, this.aClass34_Sub3Array3[this.anInt8907].method3772(Static515.aFloatArray63));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8907 + 16, this.aClass34_Sub3Array3[this.anInt8907].method3762(Static515.aFloatArray63));
		}
		@Pc(77) int local77 = Static515.method7306(this.aClass168Array3[this.anInt8907]);
		if (this.anIntArray667[this.anInt8907] != local77) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8907, 24, local77);
			this.anIntArray667[this.anInt8907] = local77;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7171(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "(B)V")
	@Override
	protected void method7234() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8918, this.anInt8924, this.anInt8869, this.anInt8864, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!qca;)V")
	@Override
	public void method7263(@OriginalArg(1) Class258 arg0) {
		@Pc(6) dxVertexLayout local6 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local6.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZZ)Lclient!go;")
	@Override
	public Interface11 method7204(@OriginalArg(1) boolean arg0) {
		return new Class197(this, Static108.aClass82_9, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7210() {
	}

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "(B)V")
	@Override
	protected void method7231() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8899 + this.anInt8918, this.anInt8924 + this.anInt8905, this.anInt8901, this.anInt8909);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	@Override
	protected void method7262(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7184(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass272_1 = (Class272) arg1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!fo;I)V")
	@Override
	public void method7298(@OriginalArg(1) int arg0, @OriginalArg(2) Class107 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static515.method7309(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "(I)V")
	@Override
	protected void method7168() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8925; local1++) {
			@Pc(10) Class6_Sub7 local10 = this.aClass6_Sub7Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method3486();
			@Pc(24) float local24 = local10.method3491() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local10.method3490(), (float) local10.method3493(), (float) local10.method3492());
			this.aD3DLIGHT3.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method3487() * local10.method3487()));
			this.aD3DLIGHT3.SetRange((float) local10.method3487());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt8929) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7168();
	}

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "(B)V")
	@Override
	protected void method7250() {
		this.anIDirect3DDevice1.a(174, this.aBoolean628);
	}

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "(Z)F")
	@Override
	protected float method7255() {
		return -0.5F;
	}
}
