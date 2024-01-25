import jaclib.peer.qd;
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
import jagdx.gh;
import jagdx.tt;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class100_Sub1_Sub1 extends Class100_Sub1 {

	@OriginalMember(owner = "client!er", name = "Lg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!er", name = "Ng", descriptor = "I")
	private int anInt2722 = 0;

	@OriginalMember(owner = "client!er", name = "Bg", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!er", name = "Ag", descriptor = "I")
	private final int anInt2721;

	@OriginalMember(owner = "client!er", name = "Eg", descriptor = "Lclient!jaclib/peer/qd;")
	public final qd aQd1;

	@OriginalMember(owner = "client!er", name = "Og", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!er", name = "Fg", descriptor = "I")
	private final int anInt2720;

	@OriginalMember(owner = "client!er", name = "Gg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!er", name = "Zg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!er", name = "ah", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!er", name = "Hg", descriptor = "Lclient!aw;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!er", name = "Xg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!er", name = "Dg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!er", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!er", name = "Cg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!er", name = "Ig", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!er", name = "Vg", descriptor = "Z")
	public final boolean aBoolean197;

	@OriginalMember(owner = "client!er", name = "Yg", descriptor = "Z")
	public final boolean aBoolean199;

	@OriginalMember(owner = "client!er", name = "Rg", descriptor = "Z")
	public final boolean aBoolean198;

	@OriginalMember(owner = "client!er", name = "Kg", descriptor = "[Lclient!se;")
	private final Class328[] aClass328Array1;

	@OriginalMember(owner = "client!er", name = "Qg", descriptor = "[I")
	private final int[] anIntArray129;

	@OriginalMember(owner = "client!er", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!er", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!er", name = "bh", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!er", name = "Mg", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!er", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!gda;Ljava/lang/Integer;)Lclient!ha;")
	private static Class100 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class100_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) qd local9 = new qd();
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
			} else if ((local18.DestBlendCaps & 0x20 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(191) D3DPRESENT_PARAMETERS local191 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static136.method2530(local5, local3, local13, local191, arg3)) {
					throw new RuntimeException("");
				}
				local191.EnableAutoDepthStencil = true;
				local191.Windowed = true;
				local191.PresentationInterval = Integer.MIN_VALUE;
				@Pc(218) int local218 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local218 |= 0x10;
				}
				@Pc(241) IDirect3DDevice local241;
				try {
					local241 = local13.a(local3, local5, arg0, local218 | 0x40, local191);
				} catch (@Pc(243) tt local243) {
					local241 = local13.a(local3, local5, arg0, local218 | 0x20, local191);
				}
				@Pc(262) Class23 local262 = new Class23(local241.b(0), local241.b());
				local1 = new Class100_Sub1_Sub1(local3, local5, arg0, local9, local13, local241, local262, local191, local18, arg1, arg2, arg3);
				local1.method7891();
				return local1;
			}
		} catch (@Pc(285) RuntimeException local285) {
			if (local1 != null) {
				local1.method8653();
			}
			throw local285;
		}
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/qd;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!aw;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!gda;I)V")
	private Class100_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) qd arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class23 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface7 arg9, @OriginalArg(10) Class126 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt2721 = arg1;
			this.aQd1 = arg3;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt2720 = arg0;
			this.anIDirect3DDevice1 = arg5;
			this.anIDirect3D1 = arg4;
			this.aD3DCAPS1 = arg8;
			this.aClass23_1 = arg6;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aQd1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aQd1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aQd1);
			this.aPixelBuffer1 = new PixelBuffer(this.aQd1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aQd1);
			new GeometryBuffer(this.aQd1);
			this.aBoolean197 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.anInt9240 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean199 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt9250 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean606 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean608 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean198 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean619 = this.anInt9239 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt2720, this.anInt2721, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aClass328Array1 = new Class328[this.anInt9250];
			this.anIntArray129 = new int[this.anInt9250];
			this.aBooleanArray5 = new boolean[this.anInt9250];
			this.aBooleanArray7 = new boolean[this.anInt9250];
			this.aBooleanArray6 = new boolean[this.anInt9250];
			this.aBooleanArray4 = new boolean[this.anInt9250];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(235) Throwable local235) {
			local235.printStackTrace();
			this.method8666();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!er", name = "x", descriptor = "()V")
	@Override
	public void method8654() {
	}

	@OriginalMember(owner = "client!er", name = "t", descriptor = "(B)V")
	@Override
	protected void method7919() {
		@Pc(16) int local16 = this.aBooleanArray4[this.anInt9241] ? Static136.method2534(this.aClass94Array5[this.anInt9241]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, 1, local16);
	}

	@OriginalMember(owner = "client!er", name = "m", descriptor = "()Lclient!waa;")
	@Override
	public Class385 method8602() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt2720, 0);
		return new Class385(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
	@Override
	public void method7896() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray67[0], -this.aFloatArray67[1], -this.aFloatArray67[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray65[0], -this.aFloatArray65[1], -this.aFloatArray65[2]);
		this.aBoolean200 = false;
	}

	@OriginalMember(owner = "client!er", name = "L", descriptor = "(I)V")
	@Override
	protected void method7942() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9247, this.anInt9244, this.anInt9118, this.anInt9057, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ)Lclient!fk;")
	@Override
	public Interface15 method7920(@OriginalArg(0) boolean arg0) {
		return new Class37(this, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7960(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!er", name = "w", descriptor = "(B)V")
	@Override
	protected void method7993() {
		this.anIDirect3DDevice1.a(7, this.aBoolean615);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lclient!el;")
	@Override
	public Interface13 method8629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!ua;Lclient!dn;)Z")
	@Override
	public boolean method7963(@OriginalArg(1) Class358 arg0, @OriginalArg(2) Class86 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return gh.a(-2005530585, this.anIDirect3D1.a(this.anInt2720, local3)) && gh.a(-2005530585, this.anIDirect3D1.CheckDeviceFormat(this.anInt2720, this.anInt2721, local3.Format, 0, 4, Static136.method2539(arg1, arg0)));
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method2529(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fk;II)V")
	@Override
	public void method7868(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class37 local2 = (Class37) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method739());
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "(Z)V")
	@Override
	protected void method7884() {
		this.anIDirect3DDevice1.a(174, this.aBoolean626);
	}

	@OriginalMember(owner = "client!er", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!er", name = "H", descriptor = "(I)V")
	@Override
	protected void method7917() {
		this.anIDirect3DDevice1.a(28, this.aBoolean607 && this.aBoolean613 && this.anInt9255 >= 0);
	}

	@OriginalMember(owner = "client!er", name = "v", descriptor = "(B)V")
	@Override
	protected void method7864() {
		if (this.aBooleanArray4[this.anInt9241]) {
			this.aBooleanArray4[this.anInt9241] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9241, (IDirect3DBaseTexture) null);
			this.method7937();
			this.method7919();
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!er", name = "V", descriptor = "(I)V")
	@Override
	protected void method7870() {
		this.anIDirect3DDevice1.a(15, this.aBoolean618);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "(B)V")
	@Override
	protected void method7895() {
		if (this.aClass102_7 == Static381.aClass102_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass102_7 == Static33.aClass102_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass102_7 == Static306.aClass102_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!gaa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class124 arg0) {
		@Pc(10) dxVertexLayout local10 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local10.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[BIZLclient!ua;II)Lclient!ah;")
	@Override
	protected Interface2 method7897(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class358 arg3, @OriginalArg(7) int arg4) {
		return new Class33_Sub1(this, arg3, arg4, arg0, arg2, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!sia;)V")
	@Override
	public void method8594(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7899(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!er", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "()V")
	@Override
	public void method8663() {
	}

	@OriginalMember(owner = "client!er", name = "U", descriptor = "(I)V")
	@Override
	protected void method7931() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt9262; local1++) {
			@Pc(14) Class5_Sub12 local14 = this.aClass5_Sub12Array5[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method4530();
			@Pc(28) float local28 = local14.method4536() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method4537(), (float) local14.method4533(), (float) local14.method4534());
			this.aD3DLIGHT1.SetDiffuse(local28 * (float) (local22 >> 16 & 0xFF), local28 * (float) (local22 >> 8 & 0xFF), (float) (local22 & 0xFF) * local28, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method4531() * local14.method4531()));
			this.aD3DLIGHT1.SetRange((float) local14.method4531());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (local1 < this.anInt9228) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7931();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZLclient!ega;B)V")
	@Override
	protected void method7881(@OriginalArg(0) int arg0, @OriginalArg(2) Class93 arg1) {
		@Pc(15) byte local15;
		if (arg0 == 1) {
			local15 = 6;
		} else if (arg0 == 2) {
			local15 = 27;
		} else {
			local15 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, local15, Static136.method2528(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!dn;IILclient!ua;)Lclient!ah;")
	@Override
	public Interface2 method7946(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class358 arg3) {
		return new Class33_Sub1(this, arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B[[IZI)Lclient!oda;")
	@Override
	public Interface22 method7879(@OriginalArg(1) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class33_Sub3(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!jj;III)V")
	@Override
	public void method7986(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static136.method2535(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8634(@OriginalArg(0) int arg0) {
		this.aQd1.b(-98);
		super.method8634(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8583(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8582(arg2, arg3);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I[Lclient!gt;)Lclient!gaa;")
	@Override
	public Class124 method7981(@OriginalArg(1) Class139[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(Z)V")
	@Override
	public void method8599(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7955() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9247 + this.anInt9260, this.anInt9244 + this.anInt9245, this.anInt9251, this.anInt9253);
	}

	@OriginalMember(owner = "client!er", name = "t", descriptor = "()V")
	@Override
	protected void method8653() {
		this.aQd1.a(62);
		super.method8653();
	}

	@OriginalMember(owner = "client!er", name = "s", descriptor = "()V")
	@Override
	public void method8616() {
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "(B)V")
	@Override
	protected void method7912() {
		if (this.aBoolean605) {
			Static136.aFloatArray23[5] = 1.0F;
			Static136.aFloatArray23[7] = 0.0F;
			Static136.aFloatArray23[12] = 0.0F;
			Static136.aFloatArray23[6] = 0.0F;
			Static136.aFloatArray23[1] = 0.0F;
			Static136.aFloatArray23[4] = 0.0F;
			Static136.aFloatArray23[3] = 0.0F;
			Static136.aFloatArray23[10] = 1.0F;
			Static136.aFloatArray23[2] = 0.0F;
			Static136.aFloatArray23[13] = 0.0F;
			Static136.aFloatArray23[11] = 0.0F;
			Static136.aFloatArray23[15] = 1.0F;
			Static136.aFloatArray23[8] = 0.0F;
			Static136.aFloatArray23[0] = 1.0F;
			Static136.aFloatArray23[14] = 0.0F;
			Static136.aFloatArray23[9] = 0.0F;
		} else {
			this.aClass10_Sub2_15.method1715(Static136.aFloatArray23);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static136.aFloatArray23);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!lia;Lclient!lia;FLclient!lia;)Lclient!lia;")
	@Override
	public Class185 method8584(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class185 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!er", name = "v", descriptor = "()V")
	@Override
	public void method8601() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (gh.a(-2005530585, local3.Issue())) {
			while (true) {
				@Pc(13) int local13 = local3.IsSignaled();
				if (local13 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(-81);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8591(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!er", name = "s", descriptor = "(B)F")
	@Override
	protected float method7932() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!er", name = "t", descriptor = "(I)V")
	@Override
	protected void method7937() {
		@Pc(16) int local16 = this.aBooleanArray4[this.anInt9241] ? Static136.method2534(this.aClass94Array6[this.anInt9241]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, 4, local16);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!dn;Lclient!ua;)Z")
	@Override
	public boolean method7885(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class358 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = new D3DDISPLAYMODE();
		return gh.a(-2005530585, this.anIDirect3D1.a(this.anInt2720, local12)) && gh.a(0x6 ^ 0x88760821, this.anIDirect3D1.CheckDeviceFormat(this.anInt2720, this.anInt2721, local12.Format, 0, 3, Static136.method2539(arg0, arg1)));
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "(B)V")
	@Override
	protected void method7918() {
		this.method7989();
		this.method7943();
	}

	@OriginalMember(owner = "client!er", name = "z", descriptor = "()V")
	@Override
	public void method8648() {
	}

	@OriginalMember(owner = "client!er", name = "I", descriptor = "(I)V")
	@Override
	protected void method7872() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt9250; local9++) {
			this.anIDirect3DDevice1.SetSamplerState(local9, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local9, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local9, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local9, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local9, 2, 1);
			this.aClass328Array1[local9] = Static464.aClass328_10;
			this.aBooleanArray7[local9] = this.aBooleanArray6[local9] = true;
			this.aBooleanArray5[local9] = false;
			this.anIntArray129[local9] = 0;
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
		this.aBoolean200 = false;
		super.method7872();
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(II)Lclient!tq;")
	@Override
	public Interface26 method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!bg;B)V")
	public void method2533(@OriginalArg(0) Class33 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9241, arg0.method6164());
		if (this.aClass328Array1[this.anInt9241] != arg0.aClass328_9) {
			@Pc(76) int local76 = Static136.method2532(arg0.aClass328_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 6, local76);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 5, local76);
			this.aClass328Array1[this.anInt9241] = arg0.aClass328_9;
			if (this.aBooleanArray5[this.anInt9241] != arg0.aBoolean471) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 7, arg0.aBoolean471 ? Static136.method2532(arg0.aClass328_9) : 0);
				this.aBooleanArray5[this.anInt9241] = arg0.aBoolean471;
			}
		} else if (arg0.aBoolean471 != this.aBooleanArray5[this.anInt9241]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 7, arg0.aBoolean471 ? Static136.method2532(arg0.aClass328_9) : 0);
			this.aBooleanArray5[this.anInt9241] = arg0.aBoolean471;
		}
		if (!this.aBooleanArray4[this.anInt9241]) {
			this.aBooleanArray4[this.anInt9241] = true;
			this.method7937();
			this.method7919();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIILclient!ua;[FIZ)Lclient!ah;")
	@Override
	protected Interface2 method7939(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class358 arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7952() {
		if (this.anIDirect3DVertexShader1 != null || Static240.aClass16_19 == this.aClass16Array3[this.anInt9241]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, 24, 0);
			this.anIntArray129[this.anInt9241] = 0;
			return;
		}
		if (Static475.aClass16_46 == this.aClass16Array3[this.anInt9241]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9241 + 16, this.aClass10_Sub2Array3[this.anInt9241].method1699(Static136.aFloatArray23));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9241 + 16, this.aClass10_Sub2Array3[this.anInt9241].method1715(Static136.aFloatArray23));
		}
		@Pc(77) int local77 = Static136.method2531(this.aClass16Array3[this.anInt9241]);
		if (this.anIntArray129[this.anInt9241] != local77) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, 24, local77);
			this.anIntArray129[this.anInt9241] = local77;
		}
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "()Z")
	@Override
	public boolean method8656() {
		return false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBILclient!jj;Lclient!lp;I)V")
	@Override
	public void method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class187 arg3, @OriginalArg(5) Interface20 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class320) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static136.method2535(arg3), 0, arg1, arg0, arg2, arg5);
	}

	@OriginalMember(owner = "client!er", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7989() {
		@Pc(8) float local8 = this.aBoolean614 ? this.aFloat168 : 0.0F;
		@Pc(26) float local26 = this.aBoolean614 ? -this.aFloat173 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local8 * this.aFloat175, local8 * this.aFloat179, this.aFloat177 * local8, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local26 * this.aFloat175, this.aFloat179 * local26, this.aFloat177 * local26, 0.0F);
		this.aBoolean200 = false;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(II)V")
	@Override
	public void method8582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass23_1.method389()) {
			this.anInt2722 = 0;
			if (gh.a((byte) 110, this.aClass23_1.method392())) {
				this.method2536();
			}
		} else if (++this.anInt2722 <= 50) {
			this.method2536();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!er", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (gh.a(-2005530585, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && gh.a(-2005530585, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(58) int local58 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local58) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
					this.aPixelBuffer1.a(local1, arg2 * local69, local69 * local58, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(-117);
		local16.a(-85);
		return local1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLclient!ega;ZII)V")
	@Override
	public void method7883(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(15) byte local15;
		if (arg3 == 1) {
			local15 = 3;
		} else if (arg3 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		@Pc(27) int local27 = 0;
		if (arg0) {
			local27 = 32;
		}
		if (arg2) {
			local27 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, local15, local27 | Static136.method2528(arg1));
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "(I)V")
	@Override
	protected void method7990() {
		if (this.aClass146_8.method3395()) {
			this.aClass10_Sub2_18.method1715(Static136.aFloatArray23);
		} else {
			Static136.aFloatArray23[1] = 0.0F;
			Static136.aFloatArray23[5] = 1.0F;
			Static136.aFloatArray23[0] = 1.0F;
			Static136.aFloatArray23[12] = 0.0F;
			Static136.aFloatArray23[2] = 0.0F;
			Static136.aFloatArray23[7] = 0.0F;
			Static136.aFloatArray23[9] = 0.0F;
			Static136.aFloatArray23[14] = 0.0F;
			Static136.aFloatArray23[6] = 0.0F;
			Static136.aFloatArray23[3] = 0.0F;
			Static136.aFloatArray23[15] = 1.0F;
			Static136.aFloatArray23[10] = 1.0F;
			Static136.aFloatArray23[11] = 0.0F;
			Static136.aFloatArray23[4] = 0.0F;
			Static136.aFloatArray23[8] = 0.0F;
			Static136.aFloatArray23[13] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static136.aFloatArray23);
	}

	@OriginalMember(owner = "client!er", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!er", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7914(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!er", name = "cb", descriptor = "(I)Z")
	private boolean method2536() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(27) Class23 local27 = (Class23) this.anObject17;
			this.method7958();
			local27.method390();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static136.method2530(this.anInt2721, this.anInt2720, this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1, this.anInt9239)) {
				@Pc(62) int local62 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (gh.a(-2005530585, local62)) {
					local27.method391(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.b(0));
					this.method7938();
					this.method7872();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!el;Lclient!tq;)Lclient!sia;")
	@Override
	public Interface24 method8664(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!er", name = "s", descriptor = "(I)V")
	@Override
	protected void method7943() {
		if (this.aBoolean200) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!er", name = "n", descriptor = "(B)V")
	@Override
	protected void method7906() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9266);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;B)V")
	public void method2537(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method7952();
	}

	@OriginalMember(owner = "client!er", name = "n", descriptor = "(Z)V")
	@Override
	protected void method7867() {
		this.anIDirect3DDevice1.a(27, this.aBoolean625);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!jr;)V")
	public void method2538(@OriginalArg(1) Class33_Sub2 arg0) {
		this.method2533(arg0);
		if (!this.aBooleanArray7[this.anInt9241]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 1, 1);
			this.aBooleanArray7[this.anInt9241] = true;
		}
		if (!this.aBooleanArray6[this.anInt9241]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 2, 1);
			this.aBooleanArray6[this.anInt9241] = true;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)Lclient!lp;")
	@Override
	public Interface20 method7882(@OriginalArg(1) boolean arg0) {
		return new Class320(this, Static104.aClass86_9, arg0);
	}

	@OriginalMember(owner = "client!er", name = "o", descriptor = "()Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7977(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas11 != arg0) {
			return;
		}
		@Pc(12) Dimension local12 = arg0.getSize();
		if (local12.width > 0 && local12.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method2536();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([BIILclient!ua;BI)Lclient!fd;")
	@Override
	public Interface14 method7894(@OriginalArg(0) byte[] arg0, @OriginalArg(3) Class358 arg1) {
		return new Class33_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!er", name = "K", descriptor = "(I)V")
	@Override
	protected void method7949() {
		this.anIDirect3DDevice1.a(14, this.aBoolean624 && this.aBoolean621);
	}

	@OriginalMember(owner = "client!er", name = "o", descriptor = "(I)V")
	@Override
	protected void method7909() {
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(BI)V")
	@Override
	public void method7928(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, 11, arg0);
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(II)Lclient!qba;")
	@Override
	protected Class48 method7966(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class48_Sub9(this, this.aClass126_262);
		} else if (arg0 == 4) {
			return new Class48_Sub6(this, this.aClass126_262, this.aClass24_7);
		} else if (arg0 == 8) {
			return new Class48_Sub8(this, this.aClass126_262, this.aClass24_7);
		} else {
			return super.method7966(arg0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ew;)V")
	public void method2540(@OriginalArg(1) Class33_Sub1 arg0) {
		this.method2533(arg0);
		if (this.aBooleanArray7[this.anInt9241] != arg0.aBoolean203) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 1, arg0.aBoolean203 ? 1 : 3);
			this.aBooleanArray7[this.anInt9241] = arg0.aBoolean203;
		}
		if (this.aBooleanArray6[this.anInt9241] != arg0.aBoolean202) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9241, 2, arg0.aBoolean202 ? 1 : 3);
			this.aBooleanArray6[this.anInt9241] = arg0.aBoolean202;
		}
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "(I)V")
	@Override
	protected void method7924() {
		this.aFloat170 = (float) (this.anInt9229 - this.anInt9264);
		this.aFloat176 = (float) -this.anInt9255 + this.aFloat170;
		if ((float) this.anInt9231 > this.aFloat176) {
			this.aFloat176 = (float) this.anInt9231;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat176);
		this.anIDirect3DDevice1.a(37, this.aFloat170);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9236);
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(B)V")
	@Override
	protected void method7880() {
		this.anIDirect3DDevice1.a(137, this.aBoolean610 && !this.aBoolean611);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIZI[III)Lclient!ah;")
	@Override
	public Interface2 method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class33_Sub1(this, arg5, arg1, arg2, arg4, 0, arg3);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fg;I)V")
	@Override
	public void method7969(@OriginalArg(0) Class112 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static131.aClass112_1) {
			local1 = 65536;
		} else if (Static449.aClass112_3 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static403.aClass112_2) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9241, 11, local1 | this.anInt9241);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method7915(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		this.aClass23_1 = (Class23) arg1;
	}

	@OriginalMember(owner = "client!er", name = "y", descriptor = "(I)V")
	@Override
	protected void method7865() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat178 * this.aFloat175, this.aFloat178 * this.aFloat179, this.aFloat177 * this.aFloat178, 0.0F);
		this.aBoolean200 = false;
	}

	@OriginalMember(owner = "client!er", name = "w", descriptor = "(I)V")
	@Override
	protected void method7974() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray64);
	}
}
