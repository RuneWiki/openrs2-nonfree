import jaclib.peer.naa;
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
import jagdx.hl;
import jagdx.jw;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class44_Sub2_Sub2 extends Class44_Sub2 {

	@OriginalMember(owner = "client!kaa", name = "Dg", descriptor = "I")
	private int anInt4978 = 0;

	@OriginalMember(owner = "client!kaa", name = "Mg", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!kaa", name = "Eg", descriptor = "Lclient!jaclib/peer/naa;")
	public final naa aNaa1;

	@OriginalMember(owner = "client!kaa", name = "Rg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!kaa", name = "Og", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!kaa", name = "Ug", descriptor = "Lclient!tp;")
	private Class318 aClass318_1;

	@OriginalMember(owner = "client!kaa", name = "Qg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!kaa", name = "Bg", descriptor = "I")
	private final int anInt4977;

	@OriginalMember(owner = "client!kaa", name = "wg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!kaa", name = "Jg", descriptor = "I")
	private final int anInt4979;

	@OriginalMember(owner = "client!kaa", name = "Kg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!kaa", name = "yg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!kaa", name = "Gg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!kaa", name = "ug", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!kaa", name = "Ng", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!kaa", name = "Lg", descriptor = "Z")
	public final boolean aBoolean359;

	@OriginalMember(owner = "client!kaa", name = "Sg", descriptor = "Z")
	public final boolean aBoolean361;

	@OriginalMember(owner = "client!kaa", name = "Ag", descriptor = "Z")
	public final boolean aBoolean358;

	@OriginalMember(owner = "client!kaa", name = "Hg", descriptor = "[Lclient!fw;")
	private final Class110[] aClass110Array1;

	@OriginalMember(owner = "client!kaa", name = "Cg", descriptor = "[Z")
	private final boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kaa", name = "Ig", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!kaa", name = "zg", descriptor = "[I")
	private final int[] anIntArray243;

	@OriginalMember(owner = "client!kaa", name = "Tg", descriptor = "[Z")
	private final boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!kaa", name = "vg", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!kaa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!jn;Ljava/lang/Integer;)Lclient!r;")
	private static Class44 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class44_Sub2_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) naa local9 = new naa();
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
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(176) D3DPRESENT_PARAMETERS local176 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static259.method4377(local176, arg3, local5, local3, local13)) {
					throw new RuntimeException("");
				}
				local176.PresentationInterval = Integer.MIN_VALUE;
				local176.Windowed = true;
				local176.EnableAutoDepthStencil = true;
				@Pc(201) int local201 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local201 |= 0x10;
				}
				@Pc(226) IDirect3DDevice local226;
				try {
					local226 = local13.a(local3, local5, arg0, local201 | 0x40, local176);
				} catch (@Pc(228) jw local228) {
					local226 = local13.a(local3, local5, arg0, local201 | 0x20, local176);
				}
				@Pc(247) Class318 local247 = new Class318(local226.d(0), local226.b());
				local1 = new Class44_Sub2_Sub2(local3, local5, arg0, local9, local13, local226, local247, local176, local18, arg1, arg2, arg3);
				local1.method4294();
				return local1;
			}
		} catch (@Pc(270) RuntimeException local270) {
			if (local1 != null) {
				local1.method5029();
			}
			throw local270;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/naa;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!tp;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!jn;I)V")
	public Class44_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) naa arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class318 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface11 arg9, @OriginalArg(10) Class176 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aNaa1 = arg3;
		this.anIDirect3DDevice1 = arg5;
		this.anIDirect3D1 = arg4;
		this.aClass318_1 = arg6;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anInt4977 = arg0;
		this.aD3DCAPS1 = arg8;
		this.anInt4979 = arg1;
		this.aD3DLIGHT3 = new D3DLIGHT(this.aNaa1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aNaa1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aNaa1);
		this.aPixelBuffer1 = new PixelBuffer(this.aNaa1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aNaa1);
		new GeometryBuffer(this.aNaa1);
		this.anInt4961 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.anInt4968 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean359 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean354 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean361 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean345 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean358 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean351 = this.anInt4970 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt4977, this.anInt4979, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aClass110Array1 = new Class110[this.anInt4961];
		this.aBooleanArray15 = new boolean[this.anInt4961];
		this.aBooleanArray16 = new boolean[this.anInt4961];
		this.anIntArray243 = new int[this.anInt4961];
		this.aBooleanArray17 = new boolean[this.anInt4961];
		this.aBooleanArray14 = new boolean[this.anInt4961];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "()V")
	@Override
	protected void method5029() {
		this.aNaa1.a(118);
		super.method5029();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!caa;Lclient!caa;FLclient!caa;)Lclient!caa;")
	@Override
	public Class36 method5005(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "()Lclient!ik;")
	@Override
	public Class155 method4985() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt4977, 0);
		return new Class155(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!kaa", name = "u", descriptor = "(B)V")
	@Override
	protected void method4317() {
		@Pc(15) int local15 = this.aBooleanArray16[this.anInt4955] ? Static259.method4380(this.aClass117Array5[this.anInt4955]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, 1, local15);
	}

	@OriginalMember(owner = "client!kaa", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "(Z)V")
	@Override
	protected void method4357() {
		this.anIDirect3DDevice1.a(174, this.aBoolean357);
	}

	@OriginalMember(owner = "client!kaa", name = "P", descriptor = "(I)V")
	@Override
	protected void method4363() {
		if (this.aBooleanArray16[this.anInt4955]) {
			this.aBooleanArray16[this.anInt4955] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt4955, null);
			this.method4308();
			this.method4317();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4986(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5013();
	}

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "(B)V")
	@Override
	protected void method4261() {
		if (this.aBoolean336) {
			Static259.aFloatArray39[15] = 1.0F;
			Static259.aFloatArray39[3] = 0.0F;
			Static259.aFloatArray39[10] = 1.0F;
			Static259.aFloatArray39[4] = 0.0F;
			Static259.aFloatArray39[11] = 0.0F;
			Static259.aFloatArray39[6] = 0.0F;
			Static259.aFloatArray39[13] = 0.0F;
			Static259.aFloatArray39[1] = 0.0F;
			Static259.aFloatArray39[2] = 0.0F;
			Static259.aFloatArray39[12] = 0.0F;
			Static259.aFloatArray39[7] = 0.0F;
			Static259.aFloatArray39[8] = 0.0F;
			Static259.aFloatArray39[0] = 1.0F;
			Static259.aFloatArray39[14] = 0.0F;
			Static259.aFloatArray39[9] = 0.0F;
			Static259.aFloatArray39[5] = 1.0F;
		} else {
			this.aClass8_Sub3_15.method1584(Static259.aFloatArray39);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static259.aFloatArray39);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ[[II)Lclient!gi;")
	@Override
	public Interface13 method4364(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class62_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (hl.a((byte) 104, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && hl.a((byte) 106, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local55) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.a(local1, arg2 * local72, local72 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(100);
		local16.b(100);
		return local1;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!cr;I)V")
	@Override
	public void method4346(@OriginalArg(0) Class54 arg0) {
		@Pc(7) int local7 = 0;
		if (arg0 == Static266.aClass54_5) {
			local7 = 65536;
		} else if (arg0 == Static538.aClass54_7) {
			local7 = 131072;
		} else if (Static87.aClass54_2 == arg0) {
			local7 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, 11, this.anInt4955 | local7);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!kaa", name = "y", descriptor = "(I)V")
	@Override
	protected void method4306() {
		this.anIDirect3DDevice1.a(14, this.aBoolean340 && this.aBoolean343);
	}

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "(Z)V")
	@Override
	protected void method4340() {
		if (this.aClass128_5.method3186()) {
			this.aClass8_Sub3_18.method1584(Static259.aFloatArray39);
		} else {
			Static259.aFloatArray39[3] = 0.0F;
			Static259.aFloatArray39[12] = 0.0F;
			Static259.aFloatArray39[6] = 0.0F;
			Static259.aFloatArray39[4] = 0.0F;
			Static259.aFloatArray39[9] = 0.0F;
			Static259.aFloatArray39[14] = 0.0F;
			Static259.aFloatArray39[13] = 0.0F;
			Static259.aFloatArray39[8] = 0.0F;
			Static259.aFloatArray39[0] = 1.0F;
			Static259.aFloatArray39[7] = 0.0F;
			Static259.aFloatArray39[5] = 1.0F;
			Static259.aFloatArray39[10] = 1.0F;
			Static259.aFloatArray39[2] = 0.0F;
			Static259.aFloatArray39[15] = 1.0F;
			Static259.aFloatArray39[11] = 0.0F;
			Static259.aFloatArray39[1] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static259.aFloatArray39);
	}

	@OriginalMember(owner = "client!kaa", name = "B", descriptor = "(B)V")
	@Override
	protected void method4354() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4958; local1++) {
			@Pc(14) Class4_Sub24 local14 = this.aClass4_Sub24Array4[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method7149();
			@Pc(28) float local28 = local14.method7144() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local14.method7145(), (float) local14.method7147(), (float) local14.method7142());
			this.aD3DLIGHT2.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, local28 * (float) (local22 >> 8 & 0xFF), (float) (local22 & 0xFF) * local28, 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method7151() * local14.method7151()));
			this.aD3DLIGHT2.SetRange((float) local14.method7151());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt4959 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4354();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZI)Lclient!cda;")
	@Override
	public Interface3 method4245(@OriginalArg(0) boolean arg0) {
		return new Class69(this, Static53.aClass42_5, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(Z)V")
	@Override
	public void method5042(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4282() {
		this.anIDirect3DDevice1.a(137, this.aBoolean352 && !this.aBoolean337);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method5024(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZIILclient!fca;[BIZI)Lclient!co;")
	@Override
	protected Interface6 method4370(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		return new Class62_Sub3(this, arg2, arg1, arg4, arg0, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "(B)V")
	@Override
	protected void method4263() {
		this.anIDirect3DDevice1.a(28, this.aBoolean339 && this.aBoolean338 && this.anInt4943 >= 0);
	}

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "(II)Lclient!jfa;")
	@Override
	protected Class38 method4291(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class38_Sub5(this, this.aClass176_68);
		} else if (arg0 == 4) {
			return new Class38_Sub3(this, this.aClass176_68, this.aClass348_4);
		} else if (arg0 == 8) {
			return new Class38_Sub8(this, this.aClass176_68, this.aClass348_4);
		} else {
			return super.method4291(arg0);
		}
	}

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "()Z")
	@Override
	public boolean method5019() {
		return false;
	}

	@OriginalMember(owner = "client!kaa", name = "q", descriptor = "()V")
	@Override
	public void method5013() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass318_1.method7513()) {
			this.anInt4978 = 0;
			if (hl.a(this.aClass318_1.method7515(), true)) {
				this.method4375();
			}
		} else if (++this.anInt4978 <= 50) {
			this.method4375();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!kaa", name = "y", descriptor = "()V")
	@Override
	public void method5032() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (hl.a((byte) -49, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(100);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!fj;I)V")
	@Override
	public void method4374(@OriginalArg(0) Class3 arg0) {
		@Pc(10) dxVertexLayout local10 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local10.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!fca;ZLclient!bv;)Z")
	@Override
	public boolean method4311(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class42 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return hl.a((byte) 117, this.anIDirect3D1.a(this.anInt4977, local3)) && hl.a((byte) 115, this.anIDirect3D1.CheckDeviceFormat(this.anInt4977, this.anInt4979, local3.Format, 0, 3, Static259.method4385(arg0, arg1)));
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZLclient!uf;Z)V")
	@Override
	protected void method4277(@OriginalArg(0) int arg0, @OriginalArg(2) Class328 arg1) {
		@Pc(18) byte local18;
		if (arg0 == 1) {
			local18 = 6;
		} else if (arg0 == 2) {
			local18 = 27;
		} else {
			local18 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, local18, Static259.method4382(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4327(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!kaa", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!kaa", name = "D", descriptor = "(B)Z")
	private boolean method4375() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(17) Class318 local17 = (Class318) this.anObject13;
			this.method4334();
			local17.method7516();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static259.method4377(this.aD3DPRESENT_PARAMETERS1, this.anInt4970, this.anInt4979, this.anInt4977, this.anIDirect3D1)) {
				@Pc(51) int local51 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (hl.a((byte) -61, local51)) {
					local17.method7514(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.d(0));
					this.method4292();
					this.method4339();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kaa", name = "D", descriptor = "(I)V")
	@Override
	protected void method4320() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat153 * this.aFloat142, this.aFloat156 * this.aFloat153, this.aFloat153 * this.aFloat150, 0.0F);
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "(IZ)V")
	@Override
	public void method4290(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4329(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas7) {
			return;
		}
		@Pc(10) Dimension local10 = arg0.getSize();
		if (local10.width > 0 && local10.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method4375();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!dg;)V")
	public void method4376(@OriginalArg(1) Class62_Sub1 arg0) {
		this.method4381(arg0);
		if (!this.aBooleanArray15[this.anInt4955]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 1, 1);
			this.aBooleanArray15[this.anInt4955] = true;
		}
		if (!this.aBooleanArray17[this.anInt4955]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 2, 1);
			this.aBooleanArray17[this.anInt4955] = true;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "C", descriptor = "(I)V")
	@Override
	protected void method4318() {
		this.anIDirect3DDevice1.a(27, this.aBoolean353);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4992(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4973(@OriginalArg(0) int arg0) {
		this.aNaa1.c(25632);
		super.method4973(arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!vn;B)V")
	public void method4378(@OriginalArg(0) Class62_Sub3 arg0) {
		this.method4381(arg0);
		if (arg0.aBoolean695 != this.aBooleanArray15[this.anInt4955]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 1, arg0.aBoolean695 ? 1 : 3);
			this.aBooleanArray15[this.anInt4955] = arg0.aBoolean695;
		}
		if (this.aBooleanArray17[this.anInt4955] != arg0.aBoolean696) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 2, arg0.aBoolean696 ? 1 : 3);
			this.aBooleanArray17[this.anInt4955] = arg0.aBoolean696;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!fca;ILclient!bv;)Z")
	@Override
	public boolean method4280(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class42 arg1) {
		@Pc(16) D3DDISPLAYMODE local16 = new D3DDISPLAYMODE();
		return hl.a((byte) -66, this.anIDirect3D1.a(this.anInt4977, local16)) && hl.a((byte) 13, this.anIDirect3D1.CheckDeviceFormat(this.anInt4977, this.anInt4979, local16.Format, 0, 4, Static259.method4385(arg0, arg1)));
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IILclient!el;)V")
	@Override
	public void method4358(@OriginalArg(1) int arg0, @OriginalArg(2) Interface9 arg1) {
		@Pc(2) Class203 local2 = (Class203) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method5105());
	}

	@OriginalMember(owner = "client!kaa", name = "u", descriptor = "(I)V")
	@Override
	protected void method4301() {
		@Pc(7) float local7 = this.aBoolean356 ? this.aFloat155 : 0.0F;
		@Pc(16) float local16 = this.aBoolean356 ? -this.aFloat146 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat142, local7 * this.aFloat156, local7 * this.aFloat150, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(local16 * this.aFloat142, local16 * this.aFloat156, this.aFloat150 * local16, 0.0F);
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!kaa", name = "w", descriptor = "(B)V")
	@Override
	protected void method4325() {
		this.aFloat149 = this.anInt4974 - this.anInt4953;
		this.aFloat152 = this.aFloat149 - (float) this.anInt4943;
		if ((float) this.anInt4965 > this.aFloat152) {
			this.aFloat152 = this.anInt4965;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat152);
		this.anIDirect3DDevice1.a(37, this.aFloat149);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt4950);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!fca;BILclient!bv;)Lclient!co;")
	@Override
	public Interface6 method4369(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3) {
		return new Class62_Sub3(this, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "(B)V")
	@Override
	protected void method4249() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray31);
	}

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "(II)V")
	@Override
	public void method4330(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, 11, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4248(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)V")
	@Override
	public void method4240() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray35[0], -this.aFloatArray35[1], -this.aFloatArray35[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray30[0], -this.aFloatArray30[1], -this.aFloatArray30[2]);
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BILclient!fca;III)Lclient!ck;")
	@Override
	public Interface4 method4366(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class97 arg1) {
		return new Class62_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "()V")
	@Override
	public void method5009() {
	}

	@OriginalMember(owner = "client!kaa", name = "n", descriptor = "(Z)V")
	@Override
	protected void method4373() {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B[Lclient!mm;)Lclient!fj;")
	@Override
	public Class3 method4314(@OriginalArg(1) Class220[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4246() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt4944 + this.anInt4971, this.anInt4969 + this.anInt4951, this.anInt4938, this.anInt4966);
	}

	@OriginalMember(owner = "client!kaa", name = "z", descriptor = "(I)V")
	@Override
	protected void method4308() {
		@Pc(22) int local22 = this.aBooleanArray16[this.anInt4955] ? Static259.method4380(this.aClass117Array6[this.anInt4955]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, 4, local22);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!qea;)V")
	public void method4381(@OriginalArg(1) Class62 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt4955, arg0.method8082());
		if (arg0.aClass110_10 != this.aClass110Array1[this.anInt4955]) {
			@Pc(21) int local21 = Static259.method4379(arg0.aClass110_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 5, local21);
			this.aClass110Array1[this.anInt4955] = arg0.aClass110_10;
			if (arg0.aBoolean694 != this.aBooleanArray14[this.anInt4955]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 7, arg0.aBoolean694 ? Static259.method4379(arg0.aClass110_10) : 0);
				this.aBooleanArray14[this.anInt4955] = arg0.aBoolean694;
			}
		} else if (arg0.aBoolean694 != this.aBooleanArray14[this.anInt4955]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4955, 7, arg0.aBoolean694 ? Static259.method4379(arg0.aClass110_10) : 0);
			this.aBooleanArray14[this.anInt4955] = arg0.aBoolean694;
		}
		if (!this.aBooleanArray16[this.anInt4955]) {
			this.aBooleanArray16[this.anInt4955] = true;
			this.method4308();
			this.method4317();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIILclient!qf;)V")
	@Override
	public void method4262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class271 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static259.method4383(arg2), arg1, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "I", descriptor = "(I)V")
	@Override
	protected void method4336() {
		if (this.aClass288_5 == Static591.aClass288_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass288_5 == Static33.aClass288_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static201.aClass288_4 == this.aClass288_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!fca;III[FIIZ)Lclient!co;")
	@Override
	protected Interface6 method4345(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(7) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZIILclient!uf;Z)V")
	@Override
	public void method4258(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class328 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(13) byte local13;
		if (arg1 == 1) {
			local13 = 3;
		} else if (arg1 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		if (arg0) {
			local1 = 32;
		}
		if (arg3) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, local13, local1 | Static259.method4382(arg2));
	}

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "(Z)V")
	@Override
	protected void method4297() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt4948);
	}

	@OriginalMember(owner = "client!kaa", name = "j", descriptor = "()V")
	@Override
	public void method4990() {
	}

	@OriginalMember(owner = "client!kaa", name = "H", descriptor = "(I)F")
	@Override
	protected float method4332() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4264(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass318_1 = (Class318) arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(BZ)Lclient!el;")
	@Override
	public Interface9 method4286(@OriginalArg(1) boolean arg0) {
		return new Class203(this, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "()Z")
	@Override
	public boolean method4989() {
		return false;
	}

	@OriginalMember(owner = "client!kaa", name = "n", descriptor = "(B)V")
	@Override
	protected void method4283() {
		this.method4301();
		this.method4349();
	}

	@OriginalMember(owner = "client!kaa", name = "N", descriptor = "(I)V")
	@Override
	protected void method4351() {
		this.anIDirect3DDevice1.a(7, this.aBoolean350);
	}

	@OriginalMember(owner = "client!kaa", name = "j", descriptor = "(B)V")
	@Override
	protected void method4271() {
		this.anIDirect3DDevice1.a(15, this.aBoolean342);
	}

	@OriginalMember(owner = "client!kaa", name = "B", descriptor = "()V")
	@Override
	public void method5039() {
	}

	@OriginalMember(owner = "client!kaa", name = "s", descriptor = "(I)V")
	@Override
	protected void method4299() {
		this.anIDirect3DDevice1.SetViewport(this.anInt4944, this.anInt4951, this.anInt4914, this.anInt4807, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4287(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kaa", name = "C", descriptor = "(B)V")
	@Override
	protected void method4355() {
		if (Static60.aClass340_1 == this.aClass340Array3[this.anInt4955]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, 24, 0);
			this.anIntArray243[this.anInt4955] = 0;
			return;
		}
		if (this.aClass340Array3[this.anInt4955] == Static484.aClass340_7) {
			this.anIDirect3DDevice1.SetTransform(this.anInt4955 + 16, this.aClass8_Sub3Array3[this.anInt4955].method1584(Static259.aFloatArray39));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt4955 + 16, this.aClass8_Sub3Array3[this.anInt4955].method1567(Static259.aFloatArray39));
		}
		@Pc(56) int local56 = Static259.method4384(this.aClass340Array3[this.anInt4955]);
		if (this.anIntArray243[this.anInt4955] != local56) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4955, 24, local56);
			this.anIntArray243[this.anInt4955] = local56;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([IIIIIZI)Lclient!co;")
	@Override
	public Interface6 method4259(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		return new Class62_Sub3(this, arg5, arg2, arg4, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kaa", name = "M", descriptor = "(I)V")
	@Override
	protected void method4349() {
		if (this.aBoolean360) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean360 = true;
	}

	@OriginalMember(owner = "client!kaa", name = "J", descriptor = "(I)V")
	@Override
	protected void method4339() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4961; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass110Array1[local1] = Static63.aClass110_1;
			this.aBooleanArray15[local1] = this.aBooleanArray17[local1] = true;
			this.aBooleanArray14[local1] = false;
			this.anIntArray243[local1] = 0;
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
		this.aBoolean360 = false;
		super.method4339();
	}

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "()V")
	@Override
	public void method5003() {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!qf;IIILclient!cda;B)V")
	@Override
	public void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface3 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class69) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static259.method4383(arg1), 0, arg3, arg4, arg0, arg2);
	}
}
