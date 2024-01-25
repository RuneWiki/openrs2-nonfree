import jaclib.peer.cv;
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
import jagdx.kh;
import jagdx.qc;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class5_Sub3_Sub2 extends Class5_Sub3 {

	@OriginalMember(owner = "client!rca", name = "zg", descriptor = "I")
	private int anInt7787 = 0;

	@OriginalMember(owner = "client!rca", name = "Eg", descriptor = "Z")
	private boolean aBoolean546 = false;

	@OriginalMember(owner = "client!rca", name = "xg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!rca", name = "Kg", descriptor = "Lclient!jaclib/peer/cv;")
	public final cv aCv1;

	@OriginalMember(owner = "client!rca", name = "vg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!rca", name = "Ng", descriptor = "I")
	private final int anInt7789;

	@OriginalMember(owner = "client!rca", name = "Og", descriptor = "Lclient!jd;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!rca", name = "Hg", descriptor = "I")
	private final int anInt7788;

	@OriginalMember(owner = "client!rca", name = "Mg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!rca", name = "Gg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!rca", name = "Bg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!rca", name = "Tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!rca", name = "Rg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!rca", name = "Jg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!rca", name = "Fg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!rca", name = "Sg", descriptor = "Z")
	public final boolean aBoolean549;

	@OriginalMember(owner = "client!rca", name = "Ig", descriptor = "Z")
	public final boolean aBoolean547;

	@OriginalMember(owner = "client!rca", name = "Qg", descriptor = "Z")
	public final boolean aBoolean548;

	@OriginalMember(owner = "client!rca", name = "Cg", descriptor = "[I")
	private final int[] anIntArray664;

	@OriginalMember(owner = "client!rca", name = "yg", descriptor = "[Lclient!lba;")
	private final Class172[] aClass172Array1;

	@OriginalMember(owner = "client!rca", name = "Dg", descriptor = "[Z")
	private final boolean[] aBooleanArray37;

	@OriginalMember(owner = "client!rca", name = "ug", descriptor = "[Z")
	private final boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!rca", name = "tg", descriptor = "[Z")
	private final boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!rca", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!rca", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!e;Lclient!kea;Ljava/lang/Integer;)Lclient!oa;")
	private static Class5 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class5_Sub3_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) cv local9 = new cv();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x20 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(176) D3DPRESENT_PARAMETERS local176 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static415.method6436(local5, local13, arg3, local3, local176)) {
					throw new RuntimeException("");
				}
				local176.Windowed = true;
				local176.EnableAutoDepthStencil = true;
				local176.PresentationInterval = Integer.MIN_VALUE;
				@Pc(202) int local202 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local202 |= 0x10;
				}
				@Pc(224) IDirect3DDevice local224;
				try {
					local224 = local13.a(local3, local5, arg0, local202 | 0x40, local176);
				} catch (@Pc(226) kh local226) {
					local224 = local13.a(local3, local5, arg0, local202 | 0x20, local176);
				}
				@Pc(245) Class145 local245 = new Class145(local224.b(0), local224.b());
				local1 = new Class5_Sub3_Sub2(local3, local5, arg0, local9, local13, local224, local245, local176, local18, arg1, arg2, arg3);
				local1.method6405();
				return local1;
			}
		} catch (@Pc(268) RuntimeException local268) {
			if (local1 != null) {
				local1.method7447();
			}
			throw local268;
		}
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/cv;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!jd;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!e;Lclient!kea;I)V")
	public Class5_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) cv arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class161 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aCv1 = arg3;
		this.anIDirect3D1 = arg4;
		this.anInt7789 = arg0;
		this.aClass145_1 = arg6;
		this.anInt7788 = arg1;
		this.anIDirect3DDevice1 = arg5;
		this.aD3DCAPS1 = arg8;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aCv1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aCv1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aCv1);
		this.aPixelBuffer1 = new PixelBuffer(this.aCv1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aCv1);
		this.anInt7760 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean543 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean549 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean547 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean541 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.anInt7783 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean548 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean532 = this.anInt7753 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt7789, this.anInt7788, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.anIntArray664 = new int[this.anInt7760];
		this.aClass172Array1 = new Class172[this.anInt7760];
		this.aBooleanArray37 = new boolean[this.anInt7760];
		this.aBooleanArray36 = new boolean[this.anInt7760];
		this.aBooleanArray35 = new boolean[this.anInt7760];
		this.aBooleanArray38 = new boolean[this.anInt7760];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method7449();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(228) Exception_Sub1 local228) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7410(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!rca", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (qc.a((byte) 48, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1)) && qc.a((byte) 48, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.a(local1, local72 * arg2, local72 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -61);
		local16.a((byte) -97);
		return local1;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method6350(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
	}

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "(B)V")
	@Override
	protected void method6418() {
		this.anIDirect3DDevice1.a(174, this.aBoolean545);
	}

	@OriginalMember(owner = "client!rca", name = "r", descriptor = "(B)V")
	@Override
	protected void method6404() {
		if (Static146.aClass223_1 == this.aClass223_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static459.aClass223_6 == this.aClass223_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass223_5 == Static508.aClass223_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!rca", name = "V", descriptor = "(I)V")
	@Override
	protected void method6420() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray50);
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6372(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "()V")
	@Override
	protected void method7447() {
		this.aCv1.a((int) -16501);
		super.method7447();
	}

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "(B)V")
	@Override
	protected void method6408() {
		this.anIDirect3DDevice1.a(28, this.aBoolean542 && this.aBoolean544 && this.anInt7764 >= 0 | this.aBoolean531);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!ep;)V")
	@Override
	public void method6333(@OriginalArg(1) Class76 arg0) {
		@Pc(6) dxVertexLayout local6 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local6.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!rca", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "(II)Lclient!ic;")
	@Override
	protected Class120 method6425(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class120_Sub5(this, this.aClass161_93);
		} else if (arg0 == 4) {
			return new Class120_Sub3(this, this.aClass161_93, this.aClass164_5);
		} else {
			return super.method6425(arg0);
		}
	}

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6328() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat226 * this.aFloat228, this.aFloat220 * this.aFloat228, this.aFloat225 * this.aFloat228, 0.0F);
		this.aBoolean546 = false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6406(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rca", name = "R", descriptor = "(I)V")
	@Override
	protected void method6407() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7751 + this.anInt7775, this.anInt7750 + this.anInt7774, this.anInt7769, this.anInt7782);
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(II)V")
	@Override
	public void method6316(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, 11, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "(I)V")
	@Override
	protected void method6300() {
		if (this.aBoolean546) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean546 = true;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILclient!kp;I[BZBI)Lclient!ica;")
	@Override
	protected Interface9 method6360(@OriginalArg(1) int arg0, @OriginalArg(2) Class167 arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4) {
		return new Class116_Sub1(this, arg1, arg0, arg4, arg3, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "(B)V")
	@Override
	protected void method6397() {
		if (this.aBoolean525) {
			Static415.aFloatArray56[5] = 1.0F;
			Static415.aFloatArray56[4] = 0.0F;
			Static415.aFloatArray56[15] = 1.0F;
			Static415.aFloatArray56[6] = 0.0F;
			Static415.aFloatArray56[11] = 0.0F;
			Static415.aFloatArray56[14] = 0.0F;
			Static415.aFloatArray56[10] = 1.0F;
			Static415.aFloatArray56[1] = 0.0F;
			Static415.aFloatArray56[8] = 0.0F;
			Static415.aFloatArray56[3] = 0.0F;
			Static415.aFloatArray56[7] = 0.0F;
			Static415.aFloatArray56[9] = 0.0F;
			Static415.aFloatArray56[0] = 1.0F;
			Static415.aFloatArray56[13] = 0.0F;
			Static415.aFloatArray56[12] = 0.0F;
			Static415.aFloatArray56[2] = 0.0F;
		} else {
			this.aClass205_Sub1_15.method5226(Static415.aFloatArray56);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static415.aFloatArray56);
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6380(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (arg1 != this.aCanvas11) {
			return;
		}
		@Pc(16) Dimension local16 = arg1.getSize();
		if (local16.width > 0 && local16.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method6435();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!kp;Lclient!vt;III)Lclient!ica;")
	@Override
	public Interface9 method6400(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rca", name = "M", descriptor = "(I)V")
	@Override
	protected void method6391() {
		this.anIDirect3DDevice1.a(137, this.aBoolean534 && !this.aBoolean535);
	}

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "()V")
	@Override
	public void method7444() {
		this.method6311(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!kp;BLclient!vt;)Z")
	@Override
	public boolean method6310(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class310 arg1) {
		@Pc(16) D3DDISPLAYMODE local16 = this.anIDirect3D1.b(this.anInt7789);
		return qc.a((byte) 48, this.anIDirect3D1.CheckDeviceFormat(this.anInt7789, this.anInt7788, local16.Format, 0, 3, Static415.method6432(arg1, arg0)));
	}

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6383() {
		@Pc(15) int local15 = this.aBooleanArray38[this.anInt7746] ? Static415.method6440(this.aClass289Array6[this.anInt7746]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, 1, local15);
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(B)V")
	@Override
	protected void method6327() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7749);
	}

	@OriginalMember(owner = "client!rca", name = "O", descriptor = "(I)V")
	@Override
	protected void method6393() {
		this.method6390();
		this.method6300();
	}

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "(I)V")
	@Override
	protected void method6313() {
		if (this.aClass246_9.method6019()) {
			this.aClass205_Sub1_18.method5226(Static415.aFloatArray56);
		} else {
			Static415.aFloatArray56[1] = 0.0F;
			Static415.aFloatArray56[7] = 0.0F;
			Static415.aFloatArray56[5] = 1.0F;
			Static415.aFloatArray56[8] = 0.0F;
			Static415.aFloatArray56[10] = 1.0F;
			Static415.aFloatArray56[6] = 0.0F;
			Static415.aFloatArray56[3] = 0.0F;
			Static415.aFloatArray56[2] = 0.0F;
			Static415.aFloatArray56[11] = 0.0F;
			Static415.aFloatArray56[12] = 0.0F;
			Static415.aFloatArray56[4] = 0.0F;
			Static415.aFloatArray56[14] = 0.0F;
			Static415.aFloatArray56[9] = 0.0F;
			Static415.aFloatArray56[15] = 1.0F;
			Static415.aFloatArray56[13] = 0.0F;
			Static415.aFloatArray56[0] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static415.aFloatArray56);
	}

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "(Z)V")
	@Override
	protected void method6301() {
		this.anIDirect3DDevice1.a(27, this.aBoolean537);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!cca;II)V")
	@Override
	public void method6382(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class100 local2 = (Class100) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method2583());
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7427(@OriginalArg(0) int arg0) {
		this.aCv1.b((byte) 29);
		super.method7427(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "v", descriptor = "(B)V")
	@Override
	protected void method6429() {
		if (this.aBoolean531) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt7772);
			return;
		}
		this.aFloat217 = this.anInt7757 - this.anInt7773;
		this.aFloat230 = this.aFloat217 - (float) this.anInt7764;
		if ((float) this.anInt7778 > this.aFloat230) {
			this.aFloat230 = this.anInt7778;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat230);
		this.anIDirect3DDevice1.a(37, this.aFloat217);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7785);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIIILclient!fea;Lclient!nq;)V")
	@Override
	public void method6295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class87 arg4, @OriginalArg(6) Interface14 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class110) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static415.method6439(arg4), 0, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "()V")
	@Override
	public void method7413() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (qc.a((byte) 48, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -67);
	}

	@OriginalMember(owner = "client!rca", name = "F", descriptor = "(I)V")
	@Override
	protected void method6368() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7759; local1++) {
			@Pc(14) Class3_Sub30 local14 = this.aClass3_Sub30Array6[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method5391();
			@Pc(28) float local28 = local14.method5382() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local14.method5386(), (float) local14.method5390(), (float) local14.method5388());
			this.aD3DLIGHT2.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, local28 * (float) (local22 >> 8 & 0xFF), local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method5387() * local14.method5387()));
			this.aD3DLIGHT2.SetRange((float) local14.method5387());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt7763 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6368();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!rca", name = "Y", descriptor = "(I)V")
	@Override
	protected void method6426() {
	}

	@OriginalMember(owner = "client!rca", name = "L", descriptor = "(I)V")
	@Override
	protected void method6390() {
		@Pc(7) float local7 = this.aBoolean527 ? this.aFloat219 : 0.0F;
		@Pc(16) float local16 = this.aBoolean527 ? -this.aFloat232 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(local7 * this.aFloat226, local7 * this.aFloat220, local7 * this.aFloat225, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local16 * this.aFloat226, this.aFloat220 * local16, local16 * this.aFloat225, (float) 0);
		this.aBoolean546 = false;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(Z)V")
	@Override
	public void method7455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([Lclient!ck;Z)Lclient!ep;")
	@Override
	public Class76 method6361(@OriginalArg(0) Class50[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "x", descriptor = "(I)V")
	@Override
	public void method6351() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray53[0], -this.aFloatArray53[1], -this.aFloatArray53[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray51[0], -this.aFloatArray51[1], -this.aFloatArray51[2]);
		this.aBoolean546 = false;
	}

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "()Z")
	@Override
	public boolean method7441() {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!wj;)V")
	public void method6434(@OriginalArg(1) Class116 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7746, arg0.method5960());
		if (this.aClass172Array1[this.anInt7746] != arg0.aClass172_10) {
			@Pc(61) int local61 = Static415.method6431(arg0.aClass172_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 6, local61);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 5, local61);
			this.aClass172Array1[this.anInt7746] = arg0.aClass172_10;
			if (this.aBooleanArray36[this.anInt7746] != arg0.aBoolean471) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 7, arg0.aBoolean471 ? Static415.method6431(arg0.aClass172_10) : 0);
				this.aBooleanArray36[this.anInt7746] = arg0.aBoolean471;
			}
		} else if (arg0.aBoolean471 != this.aBooleanArray36[this.anInt7746]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 7, arg0.aBoolean471 ? Static415.method6431(arg0.aClass172_10) : 0);
			this.aBooleanArray36[this.anInt7746] = arg0.aBoolean471;
		}
		if (!this.aBooleanArray38[this.anInt7746]) {
			this.aBooleanArray38[this.anInt7746] = true;
			this.method6338();
			this.method6383();
		}
	}

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "(I)V")
	@Override
	protected void method6308() {
		this.anIDirect3DDevice1.a(14, this.aBoolean530 && this.aBoolean539);
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(BZ)Lclient!nq;")
	@Override
	public Interface14 method6325(@OriginalArg(1) boolean arg0) {
		return new Class110(this, Static524.aClass310_17, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6324(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass145_1 = (Class145) arg0;
	}

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "()V")
	@Override
	public void method7428() {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7417(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7449();
	}

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "(B)V")
	@Override
	protected void method6396() {
		if (this.aBooleanArray38[this.anInt7746]) {
			this.aBooleanArray38[this.anInt7746] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7746, null);
			this.method6338();
			this.method6383();
		}
	}

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "(I)F")
	@Override
	protected float method6304() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!rca", name = "Z", descriptor = "(I)Z")
	private boolean method6435() {
		@Pc(9) int local9 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local9 == 0 || local9 == -2005530519) {
			@Pc(20) Class145 local20 = (Class145) this.anObject15;
			this.method6302();
			local20.method3996();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static415.method6436(this.anInt7788, this.anIDirect3D1, this.anInt7753, this.anInt7789, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (qc.a((byte) 48, local55)) {
					local20.method3995(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.b(0));
					this.method6353();
					this.method6362();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return 0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!lk;I)V")
	@Override
	public void method6394(@OriginalArg(0) Class177 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static534.aClass177_4) {
			local1 = 65536;
		} else if (Static289.aClass177_2 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static254.aClass177_1) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, 11, this.anInt7746 | local1);
	}

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "()Z")
	@Override
	public boolean method7472() {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!dw;Lclient!dw;FLclient!dw;)Lclient!dw;")
	@Override
	public Class66 method7450(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class66 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!kp;Lclient!vt;)Z")
	@Override
	public boolean method6307(@OriginalArg(1) Class167 arg0, @OriginalArg(2) Class310 arg1) {
		@Pc(5) D3DDISPLAYMODE local5 = this.anIDirect3D1.b(this.anInt7789);
		return qc.a((byte) 48, this.anIDirect3D1.CheckDeviceFormat(this.anInt7789, this.anInt7788, local5.Format, 0, 4, Static415.method6432(arg1, arg0)));
	}

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "()Lclient!nl;")
	@Override
	public Class207 method7430() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt7789, 0);
		return new Class207(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!km;ZIB)V")
	@Override
	protected void method6413(@OriginalArg(0) Class166 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte local17;
		if (arg1 == 1) {
			local17 = 6;
		} else if (arg1 == 2) {
			local17 = 27;
		} else {
			local17 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, local17, Static415.method6430(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(BZ)Lclient!cca;")
	@Override
	public Interface3 method6422(@OriginalArg(1) boolean arg0) {
		return new Class100(this, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "(B)V")
	@Override
	protected void method6386() {
		this.anIDirect3DDevice1.a(7, this.aBoolean526);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z[FIILclient!kp;IIZ)Lclient!ica;")
	@Override
	protected Interface9 method6403(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "(B)V")
	@Override
	protected void method6346() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7775, this.anInt7774, this.anInt7674, this.anInt7640, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!haa;I)V")
	public void method6437(@OriginalArg(0) Class116_Sub1 arg0) {
		this.method6434(arg0);
		if (this.aBooleanArray35[this.anInt7746] != arg0.aBoolean293) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 1, arg0.aBoolean293 ? 1 : 3);
			this.aBooleanArray35[this.anInt7746] = arg0.aBoolean293;
		}
		if (arg0.aBoolean292 != this.aBooleanArray37[this.anInt7746]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 2, arg0.aBoolean292 ? 1 : 3);
			this.aBooleanArray37[this.anInt7746] = arg0.aBoolean292;
		}
	}

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6362() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7760; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass172Array1[local1] = Static50.aClass172_2;
			this.aBooleanArray35[local1] = this.aBooleanArray37[local1] = true;
			this.aBooleanArray36[local1] = false;
			this.anIntArray664[local1] = 0;
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
		this.aD3DLIGHT3.SetType(3);
		this.aD3DLIGHT2.SetType(1);
		this.aBoolean546 = false;
		super.method6362();
	}

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "()V")
	@Override
	public void method7453() {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZIZLclient!km;Z)V")
	@Override
	public void method6358(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class166 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 3;
		} else if (arg1 == 2) {
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
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, local12, Static415.method6430(arg2) | local20);
	}

	@OriginalMember(owner = "client!rca", name = "q", descriptor = "()V")
	@Override
	public void method7449() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass145_1.method3997()) {
			this.anInt7787 = 0;
			if (qc.a(this.aClass145_1.method3998(), -2005530517)) {
				this.method6435();
			}
		} else if (++this.anInt7787 <= 50) {
			this.method6435();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIILclient!fea;)V")
	@Override
	public void method6329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class87 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static415.method6439(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6298() {
		this.anIDirect3DDevice1.a(15, this.aBoolean538);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!jl;)V")
	public void method6438(@OriginalArg(1) Class116_Sub2 arg0) {
		this.method6434(arg0);
		if (!this.aBooleanArray35[this.anInt7746]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 1, 1);
			this.aBooleanArray35[this.anInt7746] = true;
		}
		if (!this.aBooleanArray37[this.anInt7746]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7746, 2, 1);
			this.aBooleanArray37[this.anInt7746] = true;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!kp;IIB[B)Lclient!kc;")
	@Override
	public Interface13 method6402(@OriginalArg(1) Class167 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class116_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZI[[IZ)Lclient!wn;")
	@Override
	public Interface20 method6379(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2) {
		return new Class116_Sub3(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "(B)V")
	@Override
	protected void method6338() {
		@Pc(15) int local15 = this.aBooleanArray38[this.anInt7746] ? Static415.method6440(this.aClass289Array5[this.anInt7746]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, 4, local15);
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "()V")
	@Override
	public void method7420() {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZIII[II)Lclient!ica;")
	@Override
	public Interface9 method6321(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class116_Sub1(this, arg5, arg2, arg0, arg4, 0, arg3);
	}

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "(B)V")
	@Override
	protected void method6340() {
		if (Static95.aClass243_6 == this.aClass243Array3[this.anInt7746]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, 24, 0);
			this.anIntArray664[this.anInt7746] = 0;
			return;
		}
		if (this.aClass243Array3[this.anInt7746] == Static124.aClass243_14) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7746 + 16, this.aClass205_Sub1Array3[this.anInt7746].method5226(Static415.aFloatArray56));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7746 + 16, this.aClass205_Sub1Array3[this.anInt7746].method5233(Static415.aFloatArray56));
		}
		@Pc(77) int local77 = Static415.method6433(this.aClass243Array3[this.anInt7746]);
		if (this.anIntArray664[this.anInt7746] != local77) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7746, 24, local77);
			this.anIntArray664[this.anInt7746] = local77;
		}
	}
}
