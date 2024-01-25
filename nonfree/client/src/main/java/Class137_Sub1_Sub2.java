import jaclib.peer.bd;
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
import jagdx.mk;
import jagdx.q;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class137_Sub1_Sub2 extends Class137_Sub1 {

	@OriginalMember(owner = "client!ta", name = "Jg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!ta", name = "Lg", descriptor = "Z")
	private boolean aBoolean688 = false;

	@OriginalMember(owner = "client!ta", name = "ah", descriptor = "I")
	private int anInt9748 = 0;

	@OriginalMember(owner = "client!ta", name = "Yg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ta", name = "Ug", descriptor = "Lclient!jaclib/peer/bd;")
	public final bd aBd1;

	@OriginalMember(owner = "client!ta", name = "Mg", descriptor = "I")
	private final int anInt9747;

	@OriginalMember(owner = "client!ta", name = "Ig", descriptor = "I")
	private final int anInt9746;

	@OriginalMember(owner = "client!ta", name = "Vg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ta", name = "Hg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ta", name = "dh", descriptor = "Lclient!hja;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!ta", name = "Og", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ta", name = "Xg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ta", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ta", name = "Tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ta", name = "Zg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ta", name = "gh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ta", name = "Rg", descriptor = "Z")
	public final boolean aBoolean689;

	@OriginalMember(owner = "client!ta", name = "eh", descriptor = "Z")
	public final boolean aBoolean690;

	@OriginalMember(owner = "client!ta", name = "fh", descriptor = "Z")
	public final boolean aBoolean691;

	@OriginalMember(owner = "client!ta", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!ta", name = "Ng", descriptor = "[Lclient!tda;")
	private final Class334[] aClass334Array1;

	@OriginalMember(owner = "client!ta", name = "ih", descriptor = "[Z")
	private final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ta", name = "ch", descriptor = "[Z")
	private final boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!ta", name = "hh", descriptor = "[I")
	private final int[] anIntArray702;

	@OriginalMember(owner = "client!ta", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!ta", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!wia;Ljava/lang/Integer;)Lclient!ha;")
	private static Class137 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class137_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) bd local9 = new bd();
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
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(181) D3DPRESENT_PARAMETERS local181 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static560.method8095(local3, arg3, local13, local181, local5)) {
					throw new RuntimeException("");
				}
				local181.PresentationInterval = Integer.MIN_VALUE;
				local181.EnableAutoDepthStencil = true;
				local181.Windowed = true;
				@Pc(207) int local207 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local207 |= 0x10;
				}
				@Pc(231) IDirect3DDevice local231;
				try {
					local231 = local13.a(local3, local5, arg0, local207 | 0x40, local181);
				} catch (@Pc(233) q local233) {
					local231 = local13.a(local3, local5, arg0, local207 | 0x20, local181);
				}
				@Pc(252) Class145 local252 = new Class145(local231.b(0), local231.c());
				local1 = new Class137_Sub1_Sub2(local3, local5, arg0, local9, local13, local231, local252, local181, local18, arg1, arg2, arg3);
				local1.method8066();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(275) RuntimeException local275) {
			if (local1 != null) {
				local1.method7905();
			}
			throw local275;
		}
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/bd;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!hja;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!wia;I)V")
	public Class137_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) bd arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface3 arg9, @OriginalArg(10) Class386 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anIDirect3DDevice1 = arg5;
			this.aBd1 = arg3;
			this.anInt9747 = arg1;
			this.anInt9746 = arg0;
			this.anIDirect3D1 = arg4;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aClass145_1 = arg6;
			this.aD3DCAPS1 = arg8;
			this.aD3DLIGHT3 = new D3DLIGHT(this.aBd1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aBd1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aBd1);
			this.aPixelBuffer1 = new PixelBuffer(this.aBd1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aBd1);
			new GeometryBuffer(this.aBd1);
			this.aBoolean682 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean689 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean690 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt9722 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean691 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean673 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt9721 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean676 = this.anInt9706 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9746, this.anInt9747, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray22 = new boolean[this.anInt9721];
			this.aClass334Array1 = new Class334[this.anInt9721];
			this.aBooleanArray25 = new boolean[this.anInt9721];
			this.aBooleanArray24 = new boolean[this.anInt9721];
			this.anIntArray702 = new int[this.anInt9721];
			this.aBooleanArray23 = new boolean[this.anInt9721];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(222) Throwable local222) {
			local222.printStackTrace();
			this.method7935();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Lclient!kfa;")
	@Override
	public Interface14 method7902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method7998(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass145_1 = (Class145) arg0;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
	@Override
	protected void method7972() {
		this.anIDirect3DDevice1.a(28, this.aBoolean668 && this.aBoolean680 && this.anInt9727 >= 0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!jagdx/IDirect3DPixelShader;)V")
	public void method8089(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "(B)V")
	@Override
	protected void method8015() {
		if (this.aBoolean688) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean688 = true;
	}

	@OriginalMember(owner = "client!ta", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8022(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "(B)V")
	@Override
	protected void method7984() {
		this.anIDirect3DDevice1.a(7, this.aBoolean675);
	}

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "(I)V")
	@Override
	protected void method8084() {
		if (this.aBoolean666) {
			Static560.aFloatArray80[12] = 0.0F;
			Static560.aFloatArray80[15] = 1.0F;
			Static560.aFloatArray80[1] = 0.0F;
			Static560.aFloatArray80[11] = 0.0F;
			Static560.aFloatArray80[14] = 0.0F;
			Static560.aFloatArray80[10] = 1.0F;
			Static560.aFloatArray80[5] = 1.0F;
			Static560.aFloatArray80[6] = 0.0F;
			Static560.aFloatArray80[2] = 0.0F;
			Static560.aFloatArray80[4] = 0.0F;
			Static560.aFloatArray80[7] = 0.0F;
			Static560.aFloatArray80[8] = 0.0F;
			Static560.aFloatArray80[3] = 0.0F;
			Static560.aFloatArray80[9] = 0.0F;
			Static560.aFloatArray80[13] = 0.0F;
			Static560.aFloatArray80[0] = 1.0F;
		} else {
			this.aClass26_Sub1_15.method795(Static560.aFloatArray80);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static560.aFloatArray80);
	}

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "(I)V")
	@Override
	protected void method8054() {
		this.method8033();
		this.method8015();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLclient!hl;)V")
	@Override
	public void method8067(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		@Pc(2) Class101 local2 = (Class101) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method2463());
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()Z")
	@Override
	public boolean method7867() {
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "(I)V")
	@Override
	protected void method8033() {
		@Pc(15) float local15 = this.aBoolean671 ? this.aFloat238 : 0.0F;
		@Pc(24) float local24 = this.aBoolean671 ? -this.aFloat251 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local15 * this.aFloat250, this.aFloat245 * local15, this.aFloat246 * local15, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(local24 * this.aFloat250, local24 * this.aFloat245, this.aFloat246 * local24, 0.0F);
		this.aBoolean688 = false;
	}

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8028() {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(Z)V")
	@Override
	protected void method8019() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9721; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass334Array1[local1] = Static159.aClass334_8;
			this.aBooleanArray23[local1] = this.aBooleanArray22[local1] = true;
			this.aBooleanArray24[local1] = false;
			this.anIntArray702[local1] = 0;
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
		this.aBoolean688 = false;
		super.method8019();
	}

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "()V")
	@Override
	public void method7946() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (mk.b(local3.Issue(), -1)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(29036);
	}

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "(I)V")
	@Override
	public void method7976() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray72[0], -this.aFloatArray72[1], -this.aFloatArray72[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray73[0], -this.aFloatArray73[1], -this.aFloatArray73[2]);
		this.aBoolean688 = false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!bja;Lclient!vea;I)Z")
	@Override
	public boolean method8011(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class363 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return mk.b(this.anIDirect3D1.a(this.anInt9746, local9), -1) && mk.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9746, this.anInt9747, local9.Format, 0, 4, Static560.method8093(arg1, arg0)), -1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7889(arg2, arg3);
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "()V")
	@Override
	public void method7893() {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method8085(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BZ)Lclient!hl;")
	@Override
	public Interface10 method7963(@OriginalArg(1) boolean arg0) {
		return new Class101(this, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!vea;Lclient!bja;III)Lclient!oga;")
	@Override
	public Interface21 method7992(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class228_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method8008(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILclient!cfa;I)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static560.method8092(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)Lclient!nm;")
	@Override
	protected Class31 method8031(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class31_Sub5(this, this.aClass386_119);
		} else if (arg0 == 4) {
			return new Class31_Sub8(this, this.aClass386_119, this.aClass353_6);
		} else if (arg0 == 8) {
			return new Class31_Sub1(this, this.aClass386_119, this.aClass353_6);
		} else {
			return super.method8031(arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "(B)V")
	@Override
	protected void method8032() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray74);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[IIIIBZ)Lclient!oga;")
	@Override
	public Interface21 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		return new Class228_Sub2(this, arg3, arg4, arg5, arg1, 0, arg2);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII[[I)Lclient!ks;")
	@Override
	public Interface16 method8023(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class228_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
	@Override
	public void method7878() {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7964(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		if (this.aCanvas13 != arg1) {
			return;
		}
		@Pc(7) Dimension local7 = arg1.getSize();
		if (local7.width > 0 && local7.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method8100();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!pt;)V")
	@Override
	public void method7933(@OriginalArg(0) Interface23 arg0) {
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
	@Override
	public void method7954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "(B)V")
	@Override
	protected void method8064() {
		this.anIDirect3DDevice1.a(14, this.aBoolean686 && this.aBoolean677);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ad;)V")
	@Override
	public void method7970(@OriginalArg(1) Class7 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static622.aClass7_9) {
			local1 = 65536;
		} else if (Static448.aClass7_6 == arg0) {
			local1 = 131072;
		} else if (Static536.aClass7_7 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, 11, local1 | this.anInt9739);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ip;ZII)V")
	@Override
	protected void method7987(@OriginalArg(0) Class169 arg0, @OriginalArg(3) int arg1) {
		@Pc(16) byte local16;
		if (arg1 == 1) {
			local16 = 6;
		} else if (arg1 == 2) {
			local16 = 27;
		} else {
			local16 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, local16, Static560.method8101(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
	@Override
	public void method7999(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, 11, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "(B)V")
	@Override
	protected void method8027() {
		if (this.aClass141_8.method3375()) {
			this.aClass26_Sub1_18.method795(Static560.aFloatArray80);
		} else {
			Static560.aFloatArray80[1] = 0.0F;
			Static560.aFloatArray80[4] = 0.0F;
			Static560.aFloatArray80[2] = 0.0F;
			Static560.aFloatArray80[15] = 1.0F;
			Static560.aFloatArray80[7] = 0.0F;
			Static560.aFloatArray80[5] = 1.0F;
			Static560.aFloatArray80[13] = 0.0F;
			Static560.aFloatArray80[9] = 0.0F;
			Static560.aFloatArray80[12] = 0.0F;
			Static560.aFloatArray80[10] = 1.0F;
			Static560.aFloatArray80[6] = 0.0F;
			Static560.aFloatArray80[11] = 0.0F;
			Static560.aFloatArray80[8] = 0.0F;
			Static560.aFloatArray80[14] = 0.0F;
			Static560.aFloatArray80[3] = 0.0F;
			Static560.aFloatArray80[0] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static560.aFloatArray80);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBI[BZLclient!vea;)Lclient!oga;")
	@Override
	protected Interface21 method8003(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) Class363 arg4) {
		return new Class228_Sub2(this, arg4, arg0, arg1, arg3, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	@Override
	protected void method7957() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9744);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!kfa;Lclient!ts;)Lclient!pt;")
	@Override
	public Interface23 method7874(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "(B)V")
	@Override
	protected void method8062() {
		this.anIDirect3DDevice1.a(137, this.aBoolean667 && !this.aBoolean679);
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "(Z)V")
	@Override
	protected void method8074() {
		this.anIDirect3DDevice1.a(27, this.aBoolean670);
	}

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "(I)V")
	@Override
	protected void method8014() {
		@Pc(19) int local19 = this.aBooleanArray25[this.anInt9739] ? Static560.method8091(this.aClass87Array6[this.anInt9739]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, 4, local19);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!kq;)V")
	@Override
	public void method8000(@OriginalArg(1) Class201 arg0) {
		@Pc(6) dxVertexLayout local6 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local6.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!we;I)V")
	public void method8094(@OriginalArg(0) Class228_Sub3 arg0) {
		this.method8099(arg0);
		if (!this.aBooleanArray23[this.anInt9739]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 1, 1);
			this.aBooleanArray23[this.anInt9739] = true;
		}
		if (!this.aBooleanArray22[this.anInt9739]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 2, 1);
			this.aBooleanArray22[this.anInt9739] = true;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass145_1.method3444()) {
			this.anInt9748 = 0;
			if (mk.a(this.aClass145_1.method3446(), -122)) {
				this.method8100();
			}
		} else if (++this.anInt9748 <= 50) {
			this.method8100();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ta", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(IZ)Lclient!dk;")
	@Override
	public Interface4 method8073(@OriginalArg(1) boolean arg0) {
		return new Class22(this, Static47.aClass36_6, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "(I)V")
	@Override
	protected void method7967() {
		if (this.aBooleanArray25[this.anInt9739]) {
			this.aBooleanArray25[this.anInt9739] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9739, (IDirect3DBaseTexture) null);
			this.method8014();
			this.method8012();
		}
	}

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "()Lclient!cq;")
	@Override
	public Class64 method7953() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt9746, 0);
		return new Class64(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "(I)V")
	@Override
	protected void method8018() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt9730; local1++) {
			@Pc(10) Class14_Sub37 local10 = this.aClass14_Sub37Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method7820();
			@Pc(24) float local24 = local10.method7825() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method7827(), (float) local10.method7823(), (float) local10.method7826());
			this.aD3DLIGHT2.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, local24 * (float) (local18 >> 8 & 0xFF), local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method7819() * local10.method7819()));
			this.aD3DLIGHT2.SetRange((float) local10.method7819());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt9729 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method8018();
	}

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "()V")
	@Override
	protected void method7905() {
		this.aBd1.a((int) 26288);
		super.method7905();
	}

	@OriginalMember(owner = "client!ta", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (mk.b(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), -1) && mk.b(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), -1)) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local55) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(66) int local66 = 0; local66 < arg3; local66++) {
					this.aPixelBuffer1.a(local1, local66 * arg2, local66 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(29036);
		local16.a(29036);
		return local1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!qaa;Lclient!qaa;FLclient!qaa;)Lclient!qaa;")
	@Override
	public Class144 method7894(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class144 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "(I)F")
	@Override
	protected float method8013() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Lclient!wk;)Lclient!kq;")
	@Override
	public Class201 method8040(@OriginalArg(1) Class388[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "(B)V")
	@Override
	protected void method8063() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat250 * this.aFloat235, this.aFloat245 * this.aFloat235, this.aFloat235 * this.aFloat246, 0.0F);
		this.aBoolean688 = false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!qf;)V")
	public void method8097(@OriginalArg(1) Class228_Sub2 arg0) {
		this.method8099(arg0);
		if (arg0.aBoolean577 != this.aBooleanArray23[this.anInt9739]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 1, arg0.aBoolean577 ? 1 : 3);
			this.aBooleanArray23[this.anInt9739] = arg0.aBoolean577;
		}
		if (this.aBooleanArray22[this.anInt9739] != arg0.aBoolean578) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 2, arg0.aBoolean578 ? 1 : 3);
			this.aBooleanArray22[this.anInt9739] = arg0.aBoolean578;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;Z)V")
	public void method8098(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method7975();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!vea;Lclient!bja;)Z")
	@Override
	public boolean method8087(@OriginalArg(1) Class363 arg0, @OriginalArg(2) Class36 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return mk.b(this.anIDirect3D1.a(this.anInt9746, local11), -1) && mk.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9746, this.anInt9747, local11.Format, 0, 3, Static560.method8093(arg0, arg1)), -1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!pb;)V")
	public void method8099(@OriginalArg(1) Class228 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9739, arg0.method9086());
		if (arg0.aClass334_13 != this.aClass334Array1[this.anInt9739]) {
			@Pc(61) int local61 = Static560.method8090(arg0.aClass334_13);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 6, local61);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 5, local61);
			this.aClass334Array1[this.anInt9739] = arg0.aClass334_13;
			if (this.aBooleanArray24[this.anInt9739] != arg0.aBoolean746) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 7, arg0.aBoolean746 ? Static560.method8090(arg0.aClass334_13) : 0);
				this.aBooleanArray24[this.anInt9739] = arg0.aBoolean746;
			}
		} else if (arg0.aBoolean746 != this.aBooleanArray24[this.anInt9739]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9739, 7, arg0.aBoolean746 ? Static560.method8090(arg0.aClass334_13) : 0);
			this.aBooleanArray24[this.anInt9739] = arg0.aBoolean746;
		}
		if (!this.aBooleanArray25[this.anInt9739]) {
			this.aBooleanArray25[this.anInt9739] = true;
			this.method8014();
			this.method8012();
		}
	}

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "(I)V")
	@Override
	protected void method8038() {
		if (Static175.aClass105_1 == this.aClass105_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static237.aClass105_3 == this.aClass105_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static585.aClass105_7 == this.aClass105_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "(B)V")
	@Override
	protected void method8045() {
		this.anIDirect3DDevice1.a(174, this.aBoolean687);
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(I)V")
	@Override
	protected void method7975() {
		if (this.anIDirect3DVertexShader7 != null || Static453.aClass70_3 == this.aClass70Array3[this.anInt9739]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, 24, 0);
			this.anIntArray702[this.anInt9739] = 0;
			return;
		}
		if (this.aClass70Array3[this.anInt9739] == Static658.aClass70_6) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9739 + 16, this.aClass26_Sub1Array3[this.anInt9739].method802(Static560.aFloatArray80));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9739 + 16, this.aClass26_Sub1Array3[this.anInt9739].method795(Static560.aFloatArray80));
		}
		@Pc(72) int local72 = Static560.method8096(this.aClass70Array3[this.anInt9739]);
		if (this.anIntArray702[this.anInt9739] != local72) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, 24, local72);
			this.anIntArray702[this.anInt9739] = local72;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!dk;IIILclient!cfa;B)V")
	@Override
	public void method7980(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class54 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class22) arg1).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static560.method8092(arg5), 0, arg2, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method8058(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)Lclient!ts;")
	@Override
	public Interface26 method7934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "()V")
	@Override
	public void method7948() {
	}

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "(I)V")
	@Override
	protected void method8039() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9720 + this.bf, this.anInt9725 + this.anInt9733, this.anInt9726, this.anInt9707);
	}

	@OriginalMember(owner = "client!ta", name = "ab", descriptor = "(I)Z")
	private boolean method8100() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(13) Class145 local13 = (Class145) this.anObject19;
			this.method7986();
			local13.method3445();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static560.method8095(this.anInt9746, this.anInt9706, this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1, this.anInt9747)) {
				@Pc(46) int local46 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (mk.b(local46, -1)) {
					local13.method3443(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method8049();
					this.method8019();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7882(@OriginalArg(0) int arg0) {
		this.aBd1.a((byte) 69);
		super.method7882(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!vea;ZI[FZI)Lclient!oga;")
	@Override
	protected Interface21 method8051(@OriginalArg(0) int arg0, @OriginalArg(2) Class363 arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "()Z")
	@Override
	public boolean method7880() {
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "(I)V")
	@Override
	protected void method8010() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9720, this.anInt9733, this.anInt9683, this.anInt9590, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7915(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
	@Override
	protected void method7958() {
		this.aFloat248 = (float) (this.anInt9738 - this.anInt9734);
		this.aFloat244 = this.aFloat248 - (float) this.anInt9727;
		if ((float) this.anInt9737 > this.aFloat244) {
			this.aFloat244 = (float) this.anInt9737;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat244);
		this.anIDirect3DDevice1.a(37, this.aFloat248);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9723);
	}

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "()V")
	@Override
	public void method7919() {
	}

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "(B)V")
	@Override
	protected void method8024() {
		this.anIDirect3DDevice1.a(15, this.aBoolean674);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZZBLclient!ip;I)V")
	@Override
	public void method8047(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class169 arg2, @OriginalArg(4) int arg3) {
		@Pc(1) int local1 = 0;
		@Pc(21) byte local21;
		if (arg3 == 1) {
			local21 = 3;
		} else if (arg3 == 2) {
			local21 = 26;
		} else {
			local21 = 2;
		}
		if (arg1) {
			local1 = 32;
		}
		if (arg0) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, local21, Static560.method8101(arg2) | local1);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(Z)V")
	@Override
	protected void method8012() {
		@Pc(21) int local21 = this.aBooleanArray25[this.anInt9739] ? Static560.method8091(this.aClass87Array5[this.anInt9739]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9739, 1, local21);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!vea;[BIZII)Lclient!gga;")
	@Override
	public Interface9 method8082(@OriginalArg(0) Class363 arg0, @OriginalArg(1) byte[] arg1) {
		return new Class228_Sub3(this, arg0, 128, 128, 16, arg1);
	}
}
