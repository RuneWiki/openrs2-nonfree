import jaclib.peer.wl;
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
import jagdx.dga;
import jagdx.gfa;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class162_Sub1_Sub1 extends Class162_Sub1 {

	@OriginalMember(owner = "client!ik", name = "Jg", descriptor = "Z")
	private boolean aBoolean288 = false;

	@OriginalMember(owner = "client!ik", name = "vg", descriptor = "I")
	private int anInt3817 = 0;

	@OriginalMember(owner = "client!ik", name = "Ig", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ik", name = "Rg", descriptor = "Lclient!jaclib/peer/wl;")
	public final wl aWl1;

	@OriginalMember(owner = "client!ik", name = "ug", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ik", name = "tg", descriptor = "I")
	private final int anInt3816;

	@OriginalMember(owner = "client!ik", name = "Tg", descriptor = "I")
	private final int anInt3818;

	@OriginalMember(owner = "client!ik", name = "zg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ik", name = "Dg", descriptor = "Lclient!nt;")
	private Class246 aClass246_1;

	@OriginalMember(owner = "client!ik", name = "Ng", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ik", name = "Eg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ik", name = "Hg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ik", name = "Og", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ik", name = "Bg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ik", name = "wg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ik", name = "Pg", descriptor = "Z")
	public final boolean aBoolean289;

	@OriginalMember(owner = "client!ik", name = "Qg", descriptor = "Z")
	public final boolean aBoolean290;

	@OriginalMember(owner = "client!ik", name = "Gg", descriptor = "Z")
	public final boolean aBoolean287;

	@OriginalMember(owner = "client!ik", name = "xg", descriptor = "[Lclient!kk;")
	private final Class195[] aClass195Array1;

	@OriginalMember(owner = "client!ik", name = "Kg", descriptor = "[I")
	private final int[] anIntArray280;

	@OriginalMember(owner = "client!ik", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!ik", name = "yg", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ik", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!ik", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!ik", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!mv;Ljava/lang/Integer;)Lclient!r;")
	private static Class162 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class162_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) wl local9 = new wl();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x20 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(180) D3DPRESENT_PARAMETERS local180 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static231.method3299(local3, local5, local180, local13, arg3)) {
					throw new RuntimeException("");
				}
				local180.Windowed = true;
				local180.EnableAutoDepthStencil = true;
				local180.PresentationInterval = Integer.MIN_VALUE;
				@Pc(206) int local206 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local206 |= 0x10;
				}
				@Pc(230) IDirect3DDevice local230;
				try {
					local230 = local13.a(local3, local5, arg0, local206 | 0x40, local180);
				} catch (@Pc(232) dga local232) {
					local230 = local13.a(local3, local5, arg0, local206 | 0x20, local180);
				}
				@Pc(251) Class246 local251 = new Class246(local230.a(0), local230.c());
				local1 = new Class162_Sub1_Sub1(local3, local5, arg0, local9, local13, local230, local251, local180, local18, arg1, arg2, arg3);
				local1.method3864();
				return local1;
			}
		} catch (@Pc(274) RuntimeException local274) {
			if (local1 != null) {
				local1.method6875();
			}
			throw local274;
		}
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/wl;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!nt;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!mv;I)V")
	public Class162_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) wl arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class246 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface9 arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aD3DCAPS1 = arg8;
		this.aWl1 = arg3;
		this.anIDirect3D1 = arg4;
		this.anInt3816 = arg0;
		this.anInt3818 = arg1;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aClass246_1 = arg6;
		this.anIDirect3DDevice1 = arg5;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aWl1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aWl1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aWl1);
		this.aPixelBuffer1 = new PixelBuffer(this.aWl1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aWl1);
		new GeometryBuffer(this.aWl1);
		this.anInt4589 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean341 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean289 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean290 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean287 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean349 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt4587 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean347 = this.anInt4596 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3816, this.anInt3818, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aClass195Array1 = new Class195[this.anInt4587];
		this.anIntArray280 = new int[this.anInt4587];
		this.aBooleanArray14 = new boolean[this.anInt4587];
		this.aBooleanArray12 = new boolean[this.anInt4587];
		this.aBooleanArray13 = new boolean[this.anInt4587];
		this.aBooleanArray15 = new boolean[this.anInt4587];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(II)Lclient!wc;")
	@Override
	protected Class34 method3934(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class34_Sub8(this, this.aClass229_65);
		} else if (arg0 == 4) {
			return new Class34_Sub1(this, this.aClass229_65, this.aClass120_6);
		} else if (arg0 == 8) {
			return new Class34_Sub3(this, this.aClass229_65, this.aClass120_6);
		} else {
			return super.method3934(arg0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "()Lclient!pg;")
	@Override
	public Class267 method6863() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt3816, 0);
		return new Class267(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ega;II)V")
	@Override
	public void method3954(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class40 local18 = (Class40) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local18.anIDirect3DVertexBuffer1, 0, local18.method819());
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([FIIILclient!wu;ZII)Lclient!fj;")
	@Override
	protected Interface11 method3931(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class366 arg3, @OriginalArg(5) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "()V")
	@Override
	public void method6832() {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILclient!id;ILclient!ip;I)V")
	@Override
	public void method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface13 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class335) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static231.method3304(arg2), 0, arg5, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ik", name = "V", descriptor = "(I)V")
	@Override
	protected void method3953() {
		if (this.aBooleanArray14[this.anInt4617]) {
			this.aBooleanArray14[this.anInt4617] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt4617, null);
			this.method3895();
			this.method3833();
		}
	}

	@OriginalMember(owner = "client!ik", name = "R", descriptor = "(I)V")
	@Override
	protected void method3937() {
		if (Static221.aClass348_5 == this.aClass348Array3[this.anInt4617]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, 24, 0);
			this.anIntArray280[this.anInt4617] = 0;
			return;
		}
		if (Static79.aClass348_8 == this.aClass348Array3[this.anInt4617]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt4617 + 16, this.aClass25_Sub2Array3[this.anInt4617].method2704(Static231.aFloatArray32));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt4617 + 16, this.aClass25_Sub2Array3[this.anInt4617].method2709(Static231.aFloatArray32));
		}
		@Pc(63) int local63 = Static231.method3308(this.aClass348Array3[this.anInt4617]);
		if (this.anIntArray280[this.anInt4617] != local63) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, 24, local63);
			this.anIntArray280[this.anInt4617] = local63;
		}
	}

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "(B)V")
	@Override
	protected void method3944() {
		this.anIDirect3DDevice1.a(28, this.aBoolean343 && this.aBoolean336 && this.anInt4604 >= 0);
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(B)V")
	@Override
	protected void method3844() {
		this.anIDirect3DDevice1.a(174, this.aBoolean351);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6869(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6842();
	}

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "(I)V")
	@Override
	protected void method3908() {
		this.anIDirect3DDevice1.a(14, this.aBoolean348 && this.aBoolean350);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method3893(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "(I)V")
	@Override
	protected void method3872() {
		this.anIDirect3DDevice1.SetViewport(this.anInt4592, this.anInt4611, this.anInt4500, this.anInt4487, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "(I)V")
	@Override
	protected void method3930() {
		this.anIDirect3DDevice1.a(27, this.aBoolean335);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method6829(@OriginalArg(0) int arg0) {
		this.aWl1.b(93);
		super.method6829(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!rf;B)V")
	@Override
	public void method3845(@OriginalArg(0) Class297 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static530.aClass297_3) {
			local1 = 65536;
		} else if (arg0 == Static437.aClass297_1) {
			local1 = 131072;
		} else if (arg0 == Static452.aClass297_2) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, 11, this.anInt4617 | local1);
	}

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "(I)V")
	@Override
	protected void method3873() {
		if (this.aBoolean288) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean288 = true;
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(IZ)V")
	@Override
	public void method3894(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZLclient!pca;II)V")
	@Override
	public void method3828(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) int arg3) {
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
		if (arg1) {
			local29 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, local21, local29 | Static231.method3300(arg2));
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZIILclient!pca;)V")
	@Override
	protected void method3843(@OriginalArg(2) int arg0, @OriginalArg(3) Class263 arg1) {
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 6;
		} else if (arg0 == 2) {
			local13 = 27;
		} else {
			local13 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, local13, Static231.method3300(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "()V")
	@Override
	public void method6847() {
	}

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "(I)V")
	@Override
	protected void method3911() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4587; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass195Array1[local1] = Class12_Sub2_Sub5_Sub2.lb;
			this.aBooleanArray15[local1] = this.aBooleanArray13[local1] = true;
			this.aBooleanArray12[local1] = false;
			this.anIntArray280[local1] = 0;
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
		this.aD3DLIGHT2.SetType(3);
		this.aD3DLIGHT3.SetType(1);
		this.aBoolean288 = false;
		super.method3911();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!rs;Lclient!rs;FLclient!rs;)Lclient!rs;")
	@Override
	public Class17 method6882(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "()Z")
	@Override
	public boolean method6838() {
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method3913(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "(B)V")
	@Override
	protected void method3883() {
		if (this.aClass250_9.method5245()) {
			this.aClass25_Sub2_18.method2704(Static231.aFloatArray32);
		} else {
			Static231.aFloatArray32[4] = 0.0F;
			Static231.aFloatArray32[10] = 1.0F;
			Static231.aFloatArray32[2] = 0.0F;
			Static231.aFloatArray32[0] = 1.0F;
			Static231.aFloatArray32[1] = 0.0F;
			Static231.aFloatArray32[15] = 1.0F;
			Static231.aFloatArray32[11] = 0.0F;
			Static231.aFloatArray32[9] = 0.0F;
			Static231.aFloatArray32[14] = 0.0F;
			Static231.aFloatArray32[12] = 0.0F;
			Static231.aFloatArray32[13] = 0.0F;
			Static231.aFloatArray32[8] = 0.0F;
			Static231.aFloatArray32[5] = 1.0F;
			Static231.aFloatArray32[6] = 0.0F;
			Static231.aFloatArray32[3] = 0.0F;
			Static231.aFloatArray32[7] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static231.aFloatArray32);
	}

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "()V")
	@Override
	protected void method6875() {
		this.aWl1.a((int) -120);
		super.method6875();
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "(Z)V")
	@Override
	protected void method3918() {
		this.aFloat131 = this.anInt4603 - this.anInt4608;
		this.aFloat145 = (float) -this.anInt4604 + this.aFloat131;
		if (this.aFloat145 < (float) this.anInt4605) {
			this.aFloat145 = this.anInt4605;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat145);
		this.anIDirect3DDevice1.a(37, this.aFloat131);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt4625);
	}

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "(B)V")
	@Override
	protected void method3924() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt4602);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!wk;I)V")
	public void method3301(@OriginalArg(0) Class168_Sub3 arg0) {
		this.method3305(arg0);
		if (arg0.aBoolean800 != this.aBooleanArray15[this.anInt4617]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 1, arg0.aBoolean800 ? 1 : 3);
			this.aBooleanArray15[this.anInt4617] = arg0.aBoolean800;
		}
		if (this.aBooleanArray13[this.anInt4617] != arg0.aBoolean799) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 2, arg0.aBoolean799 ? 1 : 3);
			this.aBooleanArray13[this.anInt4617] = arg0.aBoolean799;
		}
	}

	@OriginalMember(owner = "client!ik", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method3940(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!id;IBI)V")
	@Override
	public void method3854(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static231.method3304(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "(Z)V")
	@Override
	protected void method3925() {
		@Pc(7) float local7 = this.aBoolean342 ? this.aFloat140 : 0.0F;
		@Pc(16) float local16 = this.aBoolean342 ? -this.aFloat142 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat143 * local7, this.aFloat139 * local7, local7 * this.aFloat138, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local16 * this.aFloat143, this.aFloat139 * local16, local16 * this.aFloat138, 0.0F);
		this.aBoolean288 = false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!wu;Lclient!bk;I)Z")
	@Override
	public boolean method3847(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class35 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return gfa.a(this.anIDirect3D1.a(this.anInt3816, local3), (int) 10067) && gfa.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3816, this.anInt3818, local3.Format, 0, 3, Static231.method3307(arg0, arg1)), (int) 10067);
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (gfa.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (int) 10067) && gfa.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), (int) 10067)) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					this.aPixelBuffer1.b(local1, arg2 * local63, local63 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b((byte) -127);
		local16.b((byte) 42);
		return local1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([Lclient!dm;I)Lclient!cl;")
	@Override
	public Class59 method3935(@OriginalArg(0) Class76[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "(I)V")
	@Override
	protected void method3901() {
		this.method3925();
		this.method3873();
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(Z)V")
	@Override
	protected void method3831() {
		this.anIDirect3DDevice1.a(15, this.aBoolean332);
	}

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "(I)F")
	@Override
	protected float method3853() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!wu;BLclient!bk;I)Lclient!fj;")
	@Override
	public Interface11 method3849(@OriginalArg(0) int arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) int arg3) {
		return new Class168_Sub3(this, arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "P", descriptor = "(I)V")
	@Override
	protected void method3932() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt4592 + this.anInt4616, this.anInt4611 + this.anInt4624, this.anInt4614, this.anInt4593);
	}

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "(B)V")
	@Override
	public void method3933() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray39[0], -this.aFloatArray39[1], -this.aFloatArray39[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray42[0], -this.aFloatArray42[1], -this.aFloatArray42[2]);
		this.aBoolean288 = false;
	}

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "(I)V")
	@Override
	protected void method3895() {
		@Pc(15) int local15 = this.aBooleanArray14[this.anInt4617] ? Static231.method3303(this.aClass247Array5[this.anInt4617]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, 4, local15);
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V")
	@Override
	protected void method3837() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat144 * this.aFloat143, this.aFloat139 * this.aFloat144, this.aFloat144 * this.aFloat138, 0.0F);
		this.aBoolean288 = false;
	}

	@OriginalMember(owner = "client!ik", name = "N", descriptor = "(I)V")
	@Override
	protected void method3929() {
		@Pc(9) int local9;
		for (local9 = 0; local9 < this.anInt4607; local9++) {
			@Pc(18) Class2_Sub11 local18 = this.aClass2_Sub11Array4[local9];
			@Pc(22) int local22 = local9 + 2;
			@Pc(26) int local26 = local18.method7274();
			@Pc(32) float local32 = local18.method7280() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local18.method7276(), (float) local18.method7270(), (float) local18.method7271());
			this.aD3DLIGHT3.SetDiffuse((float) (local26 >> 16 & 0xFF) * local32, (float) (local26 >> 8 & 0xFF) * local32, local32 * (float) (local26 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local18.method7277() * local18.method7277()));
			this.aD3DLIGHT3.SetRange((float) local18.method7277());
			this.anIDirect3DDevice1.SetLight(local22, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local22, true);
		}
		while (local9 < this.anInt4595) {
			this.anIDirect3DDevice1.LightEnable(local9 + 2, false);
			local9++;
		}
		super.method3929();
	}

	@OriginalMember(owner = "client!ik", name = "Y", descriptor = "(I)Z")
	private boolean method3302() {
		@Pc(9) int local9 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local9 == 0 || local9 == -2005530519) {
			@Pc(24) Class246 local24 = (Class246) this.anObject12;
			this.method3928();
			local24.method5179();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static231.method3299(this.anInt3816, this.anInt3818, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1, this.anInt4596)) {
				@Pc(57) int local57 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (gfa.a(local57, (int) 10067)) {
					local24.method5180(this.anIDirect3DDevice1.a(0), this.anIDirect3DDevice1.c());
					this.method3938();
					this.method3911();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method3851(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass246_1 = (Class246) arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([IIIIZII)Lclient!fj;")
	@Override
	public Interface11 method3875(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		return new Class168_Sub3(this, arg2, arg5, arg4, arg0, 0, arg3);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!bk;ILclient!wu;)Z")
	@Override
	public boolean method3886(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class366 arg1) {
		@Pc(13) D3DDISPLAYMODE local13 = new D3DDISPLAYMODE();
		return gfa.a(this.anIDirect3D1.a(this.anInt3816, local13), (int) 10067) && gfa.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3816, this.anInt3818, local13.Format, 0, 4, Static231.method3307(arg1, arg0)), (int) 10067);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6855(@OriginalArg(0) Class38 arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V")
	@Override
	protected void method3833() {
		@Pc(15) int local15 = this.aBooleanArray14[this.anInt4617] ? Static231.method3303(this.aClass247Array6[this.anInt4617]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, 1, local15);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	@Override
	public void method6887(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "(B)V")
	@Override
	protected void method3846() {
		if (this.aBoolean330) {
			Static231.aFloatArray32[6] = 0.0F;
			Static231.aFloatArray32[0] = 1.0F;
			Static231.aFloatArray32[2] = 0.0F;
			Static231.aFloatArray32[8] = 0.0F;
			Static231.aFloatArray32[9] = 0.0F;
			Static231.aFloatArray32[5] = 1.0F;
			Static231.aFloatArray32[13] = 0.0F;
			Static231.aFloatArray32[15] = 1.0F;
			Static231.aFloatArray32[4] = 0.0F;
			Static231.aFloatArray32[1] = 0.0F;
			Static231.aFloatArray32[10] = 1.0F;
			Static231.aFloatArray32[7] = 0.0F;
			Static231.aFloatArray32[12] = 0.0F;
			Static231.aFloatArray32[3] = 0.0F;
			Static231.aFloatArray32[14] = 0.0F;
			Static231.aFloatArray32[11] = 0.0F;
		} else {
			this.aClass25_Sub2_15.method2704(Static231.aFloatArray32);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static231.aFloatArray32);
	}

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "(I)V")
	@Override
	protected void method3862() {
		this.anIDirect3DDevice1.a(7, this.aBoolean334);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Lclient!ip;")
	@Override
	public Interface13 method3889(@OriginalArg(0) boolean arg0) {
		return new Class335(this, Static42.aClass35_5, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "()V")
	@Override
	public void method6857() {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!lda;I)V")
	public void method3305(@OriginalArg(0) Class168 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt4617, arg0.method7633());
		if (arg0.aClass195_10 != this.aClass195Array1[this.anInt4617]) {
			@Pc(26) int local26 = Static231.method3306(arg0.aClass195_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 6, local26);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 5, local26);
			this.aClass195Array1[this.anInt4617] = arg0.aClass195_10;
			if (arg0.aBoolean798 != this.aBooleanArray12[this.anInt4617]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 7, arg0.aBoolean798 ? Static231.method3306(arg0.aClass195_10) : 0);
				this.aBooleanArray12[this.anInt4617] = arg0.aBoolean798;
			}
		} else if (this.aBooleanArray12[this.anInt4617] != arg0.aBoolean798) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 7, arg0.aBoolean798 ? Static231.method3306(arg0.aClass195_10) : 0);
			this.aBooleanArray12[this.anInt4617] = arg0.aBoolean798;
		}
		if (!this.aBooleanArray14[this.anInt4617]) {
			this.aBooleanArray14[this.anInt4617] = true;
			this.method3895();
			this.method3833();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILclient!wu;I[BI)Lclient!jf;")
	@Override
	public Interface15 method3874(@OriginalArg(2) Class366 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class168_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "()V")
	@Override
	public void method6840() {
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(ZI)V")
	@Override
	public void method3942(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4617, 11, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([BLclient!wu;ZIIIII)Lclient!fj;")
	@Override
	protected Interface11 method3947(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return new Class168_Sub3(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)Lclient!ega;")
	@Override
	public Interface8 method3826(@OriginalArg(1) boolean arg0) {
		return new Class40(this, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "(I)V")
	@Override
	protected void method3856() {
		if (Static51.aClass354_2 == this.aClass354_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass354_6 == Static155.aClass354_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass354_6 == Static388.aClass354_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "()V")
	@Override
	public void method6842() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass246_1.method5182()) {
			this.anInt3817 = 0;
			if (gfa.a(this.aClass246_1.method5181(), (byte) 77)) {
				this.method3302();
			}
		} else if (++this.anInt3817 <= 50) {
			this.method3302();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(B)V")
	@Override
	protected void method3835() {
		this.anIDirect3DDevice1.a(137, this.aBoolean333 && !this.aBoolean339);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method3917(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas7) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method3302();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "()Z")
	@Override
	public boolean method6880() {
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!cl;B)V")
	@Override
	public void method3882(@OriginalArg(0) Class59 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "()V")
	@Override
	public void method6861() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (gfa.a(local3.Issue(), (int) 10067)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b((byte) 87);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ[[II)Lclient!ap;")
	@Override
	public Interface3 method3890(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class168_Sub2(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)V")
	@Override
	protected void method3834() {
	}

	@OriginalMember(owner = "client!ik", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!it;)V")
	public void method3309(@OriginalArg(1) Class168_Sub1 arg0) {
		this.method3305(arg0);
		if (!this.aBooleanArray15[this.anInt4617]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 1, 1);
			this.aBooleanArray15[this.anInt4617] = true;
		}
		if (!this.aBooleanArray13[this.anInt4617]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4617, 2, 1);
			this.aBooleanArray13[this.anInt4617] = true;
		}
	}

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "(B)V")
	@Override
	protected void method3900() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray38);
	}

	@OriginalMember(owner = "client!ik", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}
}
