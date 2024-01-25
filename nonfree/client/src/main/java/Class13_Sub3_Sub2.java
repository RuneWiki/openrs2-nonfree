import jaclib.peer.gca;
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
import jagdx.lg;
import jagdx.rw;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class13_Sub3_Sub2 extends Class13_Sub3 {

	@OriginalMember(owner = "client!ul", name = "gh", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader3;

	@OriginalMember(owner = "client!ul", name = "Lg", descriptor = "Z")
	private boolean aBoolean704 = false;

	@OriginalMember(owner = "client!ul", name = "Kg", descriptor = "I")
	private int anInt9763 = 0;

	@OriginalMember(owner = "client!ul", name = "Hg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ul", name = "ch", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ul", name = "Sg", descriptor = "I")
	private final int anInt9765;

	@OriginalMember(owner = "client!ul", name = "Gg", descriptor = "Lclient!jaclib/peer/gca;")
	public final gca aGca1;

	@OriginalMember(owner = "client!ul", name = "ah", descriptor = "Lclient!mu;")
	private Class233 aClass233_1;

	@OriginalMember(owner = "client!ul", name = "Yg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ul", name = "Wg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ul", name = "Mg", descriptor = "I")
	private final int anInt9764;

	@OriginalMember(owner = "client!ul", name = "dh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ul", name = "Rg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ul", name = "Vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ul", name = "Pg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ul", name = "bh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ul", name = "fh", descriptor = "Z")
	public final boolean aBoolean706;

	@OriginalMember(owner = "client!ul", name = "Jg", descriptor = "Z")
	public final boolean aBoolean703;

	@OriginalMember(owner = "client!ul", name = "Ug", descriptor = "Z")
	public final boolean aBoolean705;

	@OriginalMember(owner = "client!ul", name = "Ig", descriptor = "[Z")
	private final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ul", name = "eh", descriptor = "[Lclient!cg;")
	private final Class54[] aClass54Array1;

	@OriginalMember(owner = "client!ul", name = "Qg", descriptor = "[Z")
	private final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!ul", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!ul", name = "Tg", descriptor = "[I")
	private final int[] anIntArray689;

	@OriginalMember(owner = "client!ul", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!ul", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!nd;Ljava/lang/Integer;)Lclient!ha;")
	public static Class13 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class13_Sub3_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) gca local9 = new gca();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(177) D3DPRESENT_PARAMETERS local177 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static586.method8313(local5, arg3, local13, local3, local177)) {
					throw new RuntimeException("");
				}
				local177.PresentationInterval = Integer.MIN_VALUE;
				local177.EnableAutoDepthStencil = true;
				local177.Windowed = true;
				@Pc(202) int local202 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local202 |= 0x10;
				}
				@Pc(225) IDirect3DDevice local225;
				try {
					local225 = local13.a(local3, local5, arg0, local202 | 0x40, local177);
				} catch (@Pc(227) rw local227) {
					local225 = local13.a(local3, local5, arg0, local202 | 0x20, local177);
				}
				@Pc(246) Class233 local246 = new Class233(local225.b(0), local225.b());
				local1 = new Class13_Sub3_Sub2(local3, local5, arg0, local9, local13, local225, local246, local177, local18, arg1, arg2, arg3);
				local1.method8202();
				return local1;
			}
		} catch (@Pc(269) RuntimeException local269) {
			if (local1 != null) {
				local1.method8103();
			}
			throw local269;
		}
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/gca;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!mu;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!nd;I)V")
	public Class13_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) gca arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class233 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface2 arg9, @OriginalArg(10) Class238 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aD3DCAPS1 = arg8;
			this.anIDirect3DDevice1 = arg5;
			this.anInt9765 = arg1;
			this.aGca1 = arg3;
			this.aClass233_1 = arg6;
			this.anIDirect3D1 = arg4;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt9764 = arg0;
			this.aD3DLIGHT3 = new D3DLIGHT(this.aGca1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aGca1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aGca1);
			this.aPixelBuffer1 = new PixelBuffer(this.aGca1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aGca1);
			new GeometryBuffer(this.aGca1);
			this.anInt9737 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean706 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean695 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean703 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean705 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.anInt9722 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean686 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean689 = this.anInt9758 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9764, this.anInt9765, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray25 = new boolean[this.anInt9722];
			this.aClass54Array1 = new Class54[this.anInt9722];
			this.aBooleanArray27 = new boolean[this.anInt9722];
			this.aBooleanArray28 = new boolean[this.anInt9722];
			this.anIntArray689 = new int[this.anInt9722];
			this.aBooleanArray26 = new boolean[this.anInt9722];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(218) Throwable local218) {
			local218.printStackTrace();
			this.method8117();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "(I)V")
	@Override
	protected void method8237() {
		@Pc(23) int local23 = this.aBooleanArray26[this.anInt9746] ? Static586.method8315(this.aClass269Array5[this.anInt9746]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, 1, local23);
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "()Z")
	@Override
	public boolean method8093() {
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "J", descriptor = "(I)V")
	@Override
	protected void method8249() {
		if (this.anIDirect3DVertexShader3 != null || this.aClass100Array3[this.anInt9746] == Static461.aClass100_4) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, 24, 0);
			this.anIntArray689[this.anInt9746] = 0;
			return;
		}
		if (this.aClass100Array3[this.anInt9746] == Static593.aClass100_6) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9746 + 16, this.aClass51_Sub2Array3[this.anInt9746].method3234(Static586.aFloatArray99));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9746 + 16, this.aClass51_Sub2Array3[this.anInt9746].method3240(Static586.aFloatArray99));
		}
		@Pc(65) int local65 = Static586.method8321(this.aClass100Array3[this.anInt9746]);
		if (local65 != this.anIntArray689[this.anInt9746]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, 24, local65);
			this.anIntArray689[this.anInt9746] = local65;
		}
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "()V")
	@Override
	public void method8108() {
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8247(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(Z)V")
	@Override
	protected void method8254() {
		this.anIDirect3DDevice1.a(7, this.aBoolean683);
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "()V")
	@Override
	public void method8094() {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIZLclient!et;[B)Lclient!wk;")
	@Override
	protected Interface27 method8171(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) Class104 arg3, @OriginalArg(7) byte[] arg4) {
		return new Class99_Sub1(this, arg3, arg1, arg0, arg2, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ul", name = "eb", descriptor = "(I)V")
	@Override
	protected void method8308() {
		if (this.aClass101_10.method2511()) {
			this.aClass51_Sub2_18.method3240(Static586.aFloatArray99);
		} else {
			Static586.aFloatArray99[0] = 1.0F;
			Static586.aFloatArray99[5] = 1.0F;
			Static586.aFloatArray99[13] = 0.0F;
			Static586.aFloatArray99[11] = 0.0F;
			Static586.aFloatArray99[1] = 0.0F;
			Static586.aFloatArray99[10] = 1.0F;
			Static586.aFloatArray99[12] = 0.0F;
			Static586.aFloatArray99[14] = 0.0F;
			Static586.aFloatArray99[15] = 1.0F;
			Static586.aFloatArray99[7] = 0.0F;
			Static586.aFloatArray99[8] = 0.0F;
			Static586.aFloatArray99[3] = 0.0F;
			Static586.aFloatArray99[9] = 0.0F;
			Static586.aFloatArray99[6] = 0.0F;
			Static586.aFloatArray99[4] = 0.0F;
			Static586.aFloatArray99[2] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static586.aFloatArray99);
	}

	@OriginalMember(owner = "client!ul", name = "R", descriptor = "(I)V")
	@Override
	protected void method8271() {
		if (this.aBooleanArray26[this.anInt9746]) {
			this.aBooleanArray26[this.anInt9746] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9746, (IDirect3DBaseTexture) null);
			this.method8225();
			this.method8237();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8085(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8133(arg2, arg3);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "(B)V")
	@Override
	protected void method8274() {
		this.aFloat196 = (float) (this.anInt9749 - this.anInt9747);
		this.aFloat192 = this.aFloat196 - (float) this.anInt9726;
		if ((float) this.anInt9723 > this.aFloat192) {
			this.aFloat192 = (float) this.anInt9723;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat192);
		this.anIDirect3DDevice1.a(37, this.aFloat196);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9743);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!jv;Lclient!iaa;ZII)V")
	@Override
	public void method8188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class191 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class321) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static586.method8310(arg2), 0, arg0, arg1, arg5, arg4);
	}

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "()V")
	@Override
	public void method8118() {
	}

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[BIILclient!et;I)Lclient!aga;")
	@Override
	public Interface1 method8229(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class104 arg1) {
		return new Class99_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(Z)V")
	@Override
	protected void method8259() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9757);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!hca;Lclient!lda;)Lclient!nl;")
	@Override
	public Interface18 method8107(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Interface15 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "(B)V")
	@Override
	protected void method8214() {
		this.anIDirect3DDevice1.a(15, this.bf);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!wha;IIBLclient!et;)Lclient!wk;")
	@Override
	public Interface27 method8264(@OriginalArg(0) Class381 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class104 arg3) {
		return new Class99_Sub1(this, arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z[IIBIII)Lclient!wk;")
	@Override
	public Interface27 method8199(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class99_Sub1(this, arg3, arg4, arg0, arg1, 0, arg2);
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(B)V")
	@Override
	protected void method8201() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9748 + this.anInt9733, this.anInt9727 + this.anInt9732, this.anInt9755, this.anInt9734);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!ri;)V")
	@Override
	public void method8243(@OriginalArg(1) Class258 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method8177(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!et;BLclient!wha;)Z")
	@Override
	public boolean method8293(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Class381 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return lg.b(this.anIDirect3D1.a(this.anInt9764, local9), 25499) && lg.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9764, this.anInt9765, local9.Format, 0, 3, Static586.method8309(arg1, arg0)), 25499);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8251(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		this.aClass233_1 = (Class233) arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!ia;B)V")
	@Override
	public void method8192(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		@Pc(2) Class360 local2 = (Class360) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method8451());
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!et;ZI[FIZ)Lclient!wk;")
	@Override
	protected Interface27 method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "()V")
	@Override
	protected void method8103() {
		this.aGca1.b(22591);
		super.method8103();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!et;Lclient!wha;Z)Z")
	@Override
	public boolean method8196(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class381 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return lg.b(this.anIDirect3D1.a(this.anInt9764, local9), 25499) && lg.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9764, this.anInt9765, local9.Format, 0, 4, Static586.method8309(arg1, arg0)), 25499);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method8311(@OriginalArg(0) Class99 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9746, arg0.method7187());
		if (arg0.aClass54_9 != this.aClass54Array1[this.anInt9746]) {
			@Pc(65) int local65 = Static586.method8316(arg0.aClass54_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 6, local65);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 5, local65);
			this.aClass54Array1[this.anInt9746] = arg0.aClass54_9;
			if (this.aBooleanArray28[this.anInt9746] != arg0.aBoolean605) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 7, arg0.aBoolean605 ? Static586.method8316(arg0.aClass54_9) : 0);
				this.aBooleanArray28[this.anInt9746] = arg0.aBoolean605;
			}
		} else if (this.aBooleanArray28[this.anInt9746] != arg0.aBoolean605) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 7, arg0.aBoolean605 ? Static586.method8316(arg0.aClass54_9) : 0);
			this.aBooleanArray28[this.anInt9746] = arg0.aBoolean605;
		}
		if (!this.aBooleanArray26[this.anInt9746]) {
			this.aBooleanArray26[this.anInt9746] = true;
			this.method8225();
			this.method8237();
		}
	}

	@OriginalMember(owner = "client!ul", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8218(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "(B)V")
	@Override
	protected void method8226() {
		if (this.aBoolean682) {
			Static586.aFloatArray99[7] = 0.0F;
			Static586.aFloatArray99[6] = 0.0F;
			Static586.aFloatArray99[12] = 0.0F;
			Static586.aFloatArray99[9] = 0.0F;
			Static586.aFloatArray99[13] = 0.0F;
			Static586.aFloatArray99[1] = 0.0F;
			Static586.aFloatArray99[14] = 0.0F;
			Static586.aFloatArray99[11] = 0.0F;
			Static586.aFloatArray99[8] = 0.0F;
			Static586.aFloatArray99[0] = 1.0F;
			Static586.aFloatArray99[3] = 0.0F;
			Static586.aFloatArray99[15] = 1.0F;
			Static586.aFloatArray99[5] = 1.0F;
			Static586.aFloatArray99[2] = 0.0F;
			Static586.aFloatArray99[4] = 0.0F;
			Static586.aFloatArray99[10] = 1.0F;
		} else {
			this.aClass51_Sub2_15.method3240(Static586.aFloatArray99);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static586.aFloatArray99);
	}

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "(I)V")
	@Override
	protected void method8227() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9722; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass54Array1[local1] = Static216.aClass54_3;
			this.aBooleanArray25[local1] = this.aBooleanArray27[local1] = true;
			this.aBooleanArray28[local1] = false;
			this.anIntArray689[local1] = 0;
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
		this.aBoolean704 = false;
		super.method8227();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZB)Lclient!iaa;")
	@Override
	public Interface11 method8288(@OriginalArg(0) boolean arg0) {
		return new Class321(this, Static638.aClass381_16, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!mda;Lclient!mda;FLclient!mda;)Lclient!mda;")
	@Override
	public Class49 method8123(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8248(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas12) {
			return;
		}
		@Pc(15) Dimension local15 = arg0.getSize();
		if (local15.width > 0 && local15.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method8317();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Lclient!gda;")
	@Override
	protected Class18 method8278(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class18_Sub11(this, this.aClass238_272);
		} else if (arg0 == 4) {
			return new Class18_Sub6(this, this.aClass238_272, this.aClass334_8);
		} else if (arg0 == 8) {
			return new Class18_Sub9(this, this.aClass238_272, this.aClass334_8);
		} else {
			return super.method8278(arg0);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method8303(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "(B)F")
	@Override
	protected float method8299() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method8312(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZZLclient!bp;I)V")
	@Override
	public void method8277(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = 0;
		@Pc(25) byte local25;
		if (arg3 == 1) {
			local25 = 3;
		} else if (arg3 == 2) {
			local25 = 26;
		} else {
			local25 = 2;
		}
		if (arg1) {
			local9 = 32;
		}
		if (arg0) {
			local9 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, local25, Static586.method8314(arg2) | local9);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZZ)Lclient!ia;")
	@Override
	public Interface10 method8200(@OriginalArg(0) boolean arg0) {
		return new Class360(this, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "()V")
	@Override
	public void method8150() {
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
	@Override
	protected void method8186() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt9731; local1++) {
			@Pc(10) Class2_Sub12 local10 = this.aClass2_Sub12Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method7417();
			@Pc(26) float local26 = local10.method7422() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method7415(), (float) local10.method7420(), (float) local10.method7421());
			this.aD3DLIGHT2.SetDiffuse((float) (local18 >> 16 & 0xFF) * local26, (float) (local18 >> 8 & 0xFF) * local26, (float) (local18 & 0xFF) * local26, 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method7418() * local10.method7418()));
			this.aD3DLIGHT2.SetRange((float) local10.method7418());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt9756) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method8186();
	}

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "()V")
	@Override
	public void method8110() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (lg.b(local3.Issue(), 25499)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b((byte) -36);
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)V")
	@Override
	public void method8133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass233_1.method5469()) {
			this.anInt9763 = 0;
			if (lg.a(-2005530522, this.aClass233_1.method5467())) {
				this.method8317();
			}
		} else if (++this.anInt9763 <= 50) {
			this.method8317();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!bp;Z)V")
	@Override
	protected void method8189(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1) {
		@Pc(17) byte local17;
		if (arg0 == 1) {
			local17 = 6;
		} else if (arg0 == 2) {
			local17 = 27;
		} else {
			local17 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, local17, Static586.method8314(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "(B)V")
	@Override
	protected void method8253() {
		@Pc(7) float local7 = this.aBoolean696 ? this.aFloat197 : 0.0F;
		@Pc(16) float local16 = this.aBoolean696 ? -this.aFloat204 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat199, this.aFloat203 * local7, local7 * this.aFloat193, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat199 * local16, this.aFloat203 * local16, local16 * this.aFloat193, 0.0F);
		this.aBoolean704 = false;
	}

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "(I)V")
	@Override
	protected void method8210() {
		this.anIDirect3DDevice1.a(27, this.aBoolean684);
	}

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "(B)V")
	@Override
	protected void method8215() {
		this.anIDirect3DDevice1.a(28, this.aBoolean699 && this.aBoolean685 && this.anInt9726 >= 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[Lclient!fk;)Lclient!ri;")
	@Override
	public Class258 method8292(@OriginalArg(1) Class118[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "(B)V")
	@Override
	protected void method8276() {
		if (this.aBoolean704) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "(I)V")
	@Override
	protected void method8240() {
		this.anIDirect3DDevice1.a(14, this.aBoolean700 && this.aBoolean687);
	}

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "()Lclient!nia;")
	@Override
	public Class240 method8135() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt9764, 0);
		return new Class240(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "(B)V")
	@Override
	protected void method8242() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat199 * this.aFloat202, this.aFloat203 * this.aFloat202, this.aFloat193 * this.aFloat202, 0.0F);
		this.aBoolean704 = false;
	}

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "(I)V")
	@Override
	protected void method8233() {
		if (Static275.aClass32_4 == this.aClass32_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static174.aClass32_1 == this.aClass32_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass32_7 == Static230.aClass32_2) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ul", name = "U", descriptor = "(I)V")
	@Override
	public void method8280() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray91[0], -this.aFloatArray91[1], -this.aFloatArray91[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray90[0], -this.aFloatArray90[1], -this.aFloatArray90[2]);
		this.aBoolean704 = false;
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
	@Override
	protected void method8172() {
	}

	@OriginalMember(owner = "client!ul", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.a(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (lg.b(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), 25499) && lg.b(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), 25499)) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					this.aPixelBuffer1.b(local1, local63 * arg2, local63 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b((byte) -36);
		local16.b((byte) -36);
		return local1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!mg;I)V")
	@Override
	public void method8206(@OriginalArg(0) Class222 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static314.aClass222_2) {
			local1 = 65536;
		} else if (arg0 == Static516.aClass222_4) {
			local1 = 131072;
		} else if (arg0 == Static150.aClass222_1) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, 11, local1 | this.anInt9746);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ul", name = "fb", descriptor = "(I)Z")
	private boolean method8317() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(18) Class233 local18 = (Class233) this.anObject25;
			this.method8300();
			local18.method5470();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static586.method8313(this.anInt9765, this.anInt9758, this.anIDirect3D1, this.anInt9764, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(51) int local51 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (lg.b(local51, 25499)) {
					local18.method5468(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.b());
					this.method8236();
					this.method8227();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!jv;III)V")
	@Override
	public void method8211(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static586.method8310(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "(B)V")
	@Override
	protected void method8238() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray92);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!nl;)V")
	@Override
	public void method8168(@OriginalArg(0) Interface18 arg0) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Lclient!lda;")
	@Override
	public Interface15 method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(II)Lclient!hca;")
	@Override
	public Interface8 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "(I)V")
	@Override
	protected void method8225() {
		@Pc(15) int local15 = this.aBooleanArray26[this.anInt9746] ? Static586.method8315(this.aClass269Array6[this.anInt9746]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, 4, local15);
	}

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "()Z")
	@Override
	public boolean method8116() {
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "W", descriptor = "(I)V")
	@Override
	protected void method8285() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9748, this.anInt9732, this.anInt9598, this.anInt9644, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "(I)V")
	@Override
	protected void method8246() {
		this.method8253();
		this.method8276();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method8318(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader3 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method8249();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!em;)V")
	public void method8319(@OriginalArg(1) Class99_Sub1 arg0) {
		this.method8311(arg0);
		if (this.aBooleanArray25[this.anInt9746] != arg0.aBoolean226) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 1, arg0.aBoolean226 ? 1 : 3);
			this.aBooleanArray25[this.anInt9746] = arg0.aBoolean226;
		}
		if (this.aBooleanArray27[this.anInt9746] != arg0.aBoolean227) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 2, arg0.aBoolean227 ? 1 : 3);
			this.aBooleanArray27[this.anInt9746] = arg0.aBoolean227;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
	@Override
	public void method8140(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8097(@OriginalArg(0) int arg0) {
		this.aGca1.a((byte) -72);
		super.method8097(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZI[[I)Lclient!nn;")
	@Override
	public Interface19 method8305(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class99_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "(I)V")
	@Override
	protected void method8208() {
		this.anIDirect3DDevice1.a(174, this.aBoolean702);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(BI)V")
	@Override
	public void method8298(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9746, 11, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!kda;)V")
	public void method8320(@OriginalArg(1) Class99_Sub2 arg0) {
		this.method8311(arg0);
		if (!this.aBooleanArray25[this.anInt9746]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 1, 1);
			this.aBooleanArray25[this.anInt9746] = true;
		}
		if (!this.aBooleanArray27[this.anInt9746]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9746, 2, 1);
			this.aBooleanArray27[this.anInt9746] = true;
		}
	}

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "(I)V")
	@Override
	protected void method8216() {
		this.anIDirect3DDevice1.a(137, this.aBoolean690 && !this.aBoolean694);
	}
}
