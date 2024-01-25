import jaclib.peer.mk;
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
import jagdx.fha;
import jagdx.pia;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class101_Sub1_Sub2 extends Class101_Sub1 {

	@OriginalMember(owner = "client!lj", name = "Ng", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!lj", name = "Mg", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "client!lj", name = "bh", descriptor = "I")
	private int anInt6658 = 0;

	@OriginalMember(owner = "client!lj", name = "ah", descriptor = "I")
	private final int anInt6657;

	@OriginalMember(owner = "client!lj", name = "Yg", descriptor = "Lclient!qm;")
	private Class302 aClass302_1;

	@OriginalMember(owner = "client!lj", name = "Zg", descriptor = "I")
	private final int anInt6656;

	@OriginalMember(owner = "client!lj", name = "Lg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!lj", name = "Hg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!lj", name = "Fg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!lj", name = "Pg", descriptor = "Lclient!jaclib/peer/mk;")
	public final mk aMk1;

	@OriginalMember(owner = "client!lj", name = "Dg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!lj", name = "Kg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!lj", name = "Tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!lj", name = "Gg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!lj", name = "Sg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!lj", name = "Vg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!lj", name = "Ug", descriptor = "Z")
	public final boolean aBoolean503;

	@OriginalMember(owner = "client!lj", name = "Jg", descriptor = "Z")
	public final boolean aBoolean500;

	@OriginalMember(owner = "client!lj", name = "Og", descriptor = "Z")
	public final boolean aBoolean502;

	@OriginalMember(owner = "client!lj", name = "Cg", descriptor = "[Z")
	private final boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!lj", name = "ch", descriptor = "[Z")
	private final boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!lj", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!lj", name = "Eg", descriptor = "[I")
	private final int[] anIntArray313;

	@OriginalMember(owner = "client!lj", name = "Ig", descriptor = "[Lclient!rha;")
	private final Class315[] aClass315Array1;

	@OriginalMember(owner = "client!lj", name = "dh", descriptor = "[Z")
	private final boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!lj", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!gga;Ljava/lang/Integer;)Lclient!ha;")
	private static Class101 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class101_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) mk local9 = new mk();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(178) D3DPRESENT_PARAMETERS local178 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static344.method5965(arg3, local3, local178, local5, local13)) {
					throw new RuntimeException("");
				}
				local178.EnableAutoDepthStencil = true;
				local178.PresentationInterval = Integer.MIN_VALUE;
				local178.Windowed = true;
				@Pc(203) int local203 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local203 |= 0x10;
				}
				@Pc(226) IDirect3DDevice local226;
				try {
					local226 = local13.a(local3, local5, arg0, local203 | 0x40, local178);
				} catch (@Pc(228) fha local228) {
					local226 = local13.a(local3, local5, arg0, local203 | 0x20, local178);
				}
				@Pc(247) Class302 local247 = new Class302(local226.c(0), local226.c());
				local1 = new Class101_Sub1_Sub2(local3, local5, arg0, local9, local13, local226, local247, local178, local18, arg1, arg2, arg3);
				local1.method5899();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(270) RuntimeException local270) {
			if (local1 != null) {
				local1.method8124();
			}
			throw local270;
		}
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/mk;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!qm;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!gga;I)V")
	public Class101_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) mk arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class302 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface3 arg9, @OriginalArg(10) Class124 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt6657 = arg1;
			this.aClass302_1 = arg6;
			this.anInt6656 = arg0;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aD3DCAPS1 = arg8;
			this.anIDirect3D1 = arg4;
			this.aMk1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aMk1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aMk1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aMk1);
			this.aPixelBuffer1 = new PixelBuffer(this.aMk1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aMk1);
			new GeometryBuffer(this.aMk1);
			this.aBoolean503 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt6618 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt6651 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean486 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean500 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean502 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean487 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean495 = this.anInt6627 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt6656, this.anInt6657, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray32 = new boolean[this.anInt6618];
			this.aBooleanArray34 = new boolean[this.anInt6618];
			this.aBooleanArray33 = new boolean[this.anInt6618];
			this.anIntArray313 = new int[this.anInt6618];
			this.aClass315Array1 = new Class315[this.anInt6618];
			this.aBooleanArray35 = new boolean[this.anInt6618];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(223) Throwable local223) {
			local223.printStackTrace();
			this.method8148();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!lf;Lclient!jk;)Lclient!rs;")
	@Override
	public Interface17 method8131(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "Q", descriptor = "(I)F")
	@Override
	protected float method5913() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "(B)V")
	@Override
	protected void method5948() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!cr;B)V")
	public void method5964(@OriginalArg(0) Class61_Sub1 arg0) {
		this.method5972(arg0);
		if (!this.aBooleanArray35[this.anInt6625]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 1, 1);
			this.aBooleanArray35[this.anInt6625] = true;
		}
		if (!this.aBooleanArray34[this.anInt6625]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 2, 1);
			this.aBooleanArray34[this.anInt6625] = true;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "(I)V")
	@Override
	protected void method5872() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6618; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass315Array1[local1] = Static100.aClass315_2;
			this.aBooleanArray35[local1] = this.aBooleanArray34[local1] = true;
			this.aBooleanArray33[local1] = false;
			this.anIntArray313[local1] = 0;
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
		this.aBoolean501 = false;
		super.method5872();
	}

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(II)Lclient!sba;")
	@Override
	protected Class13 method5831(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class13_Sub7(this, this.aClass124_74);
		} else if (arg0 == 4) {
			return new Class13_Sub6(this, this.aClass124_74, this.aClass242_7);
		} else if (arg0 == 8) {
			return new Class13_Sub11(this, this.aClass124_74, this.aClass242_7);
		} else {
			return super.method5831(arg0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(IZ)V")
	@Override
	public void method5907(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBLclient!nea;Lclient!dr;I)Lclient!lba;")
	@Override
	public Interface10 method5848(@OriginalArg(0) int arg0, @OriginalArg(2) Class244 arg1, @OriginalArg(3) Class79 arg2, @OriginalArg(4) int arg3) {
		return new Class61_Sub2(this, arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "R", descriptor = "(I)V")
	@Override
	protected void method5914() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6647, this.anInt6636, this.anInt6608, this.anInt6599, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
	@Override
	protected void method5863() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat157 * this.aFloat150, this.aFloat153 * this.aFloat150, this.aFloat150 * this.aFloat152, 0.0F);
		this.aBoolean501 = false;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;I)V")
	public void method5967(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method5870();
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5931() {
		if (this.aBooleanArray32[this.anInt6625]) {
			this.aBooleanArray32[this.anInt6625] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6625, (IDirect3DBaseTexture) null);
			this.method5883();
			this.method5896();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!nea;Lclient!dr;)Z")
	@Override
	public boolean method5850(@OriginalArg(1) Class244 arg0, @OriginalArg(2) Class79 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return pia.a(-2005530600, this.anIDirect3D1.a(this.anInt6656, local11)) && pia.a(-2005530600, this.anIDirect3D1.CheckDeviceFormat(this.anInt6656, this.anInt6657, local11.Format, 0, 3, Static344.method5970(arg0, arg1)));
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(B)V")
	@Override
	protected void method5892() {
		this.anIDirect3DDevice1.a(137, this.aBoolean481 && !this.bf);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILclient!wba;)V")
	@Override
	public void method5953(@OriginalArg(1) int arg0, @OriginalArg(2) Interface25 arg1) {
		@Pc(7) Class203 local7 = (Class203) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local7.anIDirect3DVertexBuffer1, 0, local7.method5363());
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method5888(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8118(@OriginalArg(0) int arg0) {
		this.aMk1.a((int) -9377);
		super.method8118(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)Lclient!lf;")
	@Override
	public Interface11 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5844() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6647 + this.anInt6644, this.anInt6652 + this.anInt6636, this.anInt6629, this.anInt6646);
	}

	@OriginalMember(owner = "client!lj", name = "ab", descriptor = "(I)V")
	@Override
	protected void method5943() {
		if (this.aBoolean479) {
			Static344.aFloatArray48[13] = 0.0F;
			Static344.aFloatArray48[8] = 0.0F;
			Static344.aFloatArray48[3] = 0.0F;
			Static344.aFloatArray48[6] = 0.0F;
			Static344.aFloatArray48[1] = 0.0F;
			Static344.aFloatArray48[0] = 1.0F;
			Static344.aFloatArray48[9] = 0.0F;
			Static344.aFloatArray48[2] = 0.0F;
			Static344.aFloatArray48[15] = 1.0F;
			Static344.aFloatArray48[12] = 0.0F;
			Static344.aFloatArray48[7] = 0.0F;
			Static344.aFloatArray48[5] = 1.0F;
			Static344.aFloatArray48[4] = 0.0F;
			Static344.aFloatArray48[10] = 1.0F;
			Static344.aFloatArray48[11] = 0.0F;
			Static344.aFloatArray48[14] = 0.0F;
		} else {
			this.aClass76_Sub2_15.method7347(Static344.aFloatArray48);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static344.aFloatArray48);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "(B)V")
	@Override
	protected void method5930() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray46);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z[[IIZ)Lclient!wf;")
	@Override
	public Interface26 method5880(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class61_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (pia.a(-2005530600, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && pia.a(-2005530600, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(76) int local76 = 0; local76 < arg3; local76++) {
					this.aPixelBuffer1.b(local1, arg2 * local76, local76 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(-4840);
		local16.a(-4840);
		return local1;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()Z")
	@Override
	public boolean method8070() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(IZ)Lclient!vv;")
	@Override
	public Interface24 method5941(@OriginalArg(1) boolean arg0) {
		return new Class131(this, Static114.aClass79_8, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "(I)V")
	@Override
	protected void method5896() {
		@Pc(15) int local15 = this.aBooleanArray32[this.anInt6625] ? Static344.method5968(this.aClass381Array5[this.anInt6625]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, 1, local15);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8143(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8081(arg2, arg3);
	}

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "()V")
	@Override
	public void method8125() {
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(II)Lclient!jk;")
	@Override
	public Interface8 method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ija;I)V")
	@Override
	public void method5938(@OriginalArg(0) Class167 arg0) {
		@Pc(9) dxVertexLayout local9 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local9.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "(I)V")
	@Override
	protected void method5857() {
		this.anIDirect3DDevice1.a(14, this.aBoolean484 && this.aBoolean493);
	}

	@OriginalMember(owner = "client!lj", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5864(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!nea;Lclient!dr;I)Z")
	@Override
	public boolean method5876(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class79 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return pia.a(-2005530600, this.anIDirect3D1.a(this.anInt6656, local9)) && pia.a(-2005530600, this.anIDirect3D1.CheckDeviceFormat(this.anInt6656, this.anInt6657, local9.Format, 0, 4, Static344.method5970(arg0, arg1)));
	}

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "(I)V")
	@Override
	protected void method5860() {
		this.method5865();
		this.method5838();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!vr;Lclient!vr;FLclient!vr;)Lclient!vr;")
	@Override
	public Class3 method8071(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lj", name = "hb", descriptor = "(I)V")
	@Override
	protected void method5961() {
		this.anIDirect3DDevice1.a(15, this.aBoolean480);
	}

	@OriginalMember(owner = "client!lj", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!up;B)V")
	@Override
	public void method5889(@OriginalArg(0) Class362 arg0) {
		@Pc(1) int local1 = 0;
		if (Static434.aClass362_93 == arg0) {
			local1 = 65536;
		} else if (Static147.aClass362_51 == arg0) {
			local1 = 131072;
		} else if (Static610.aClass362_153 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, 11, this.anInt6625 | local1);
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "(I)V")
	@Override
	protected void method5849() {
		this.aFloat149 = (float) (this.anInt6648 - this.anInt6638);
		this.aFloat158 = (float) -this.anInt6650 + this.aFloat149;
		if ((float) this.anInt6637 > this.aFloat158) {
			this.aFloat158 = (float) this.anInt6637;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat158);
		this.anIDirect3DDevice1.a(37, this.aFloat149);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6649);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(IB)V")
	@Override
	public void method5867(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, 11, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "cb", descriptor = "(I)V")
	@Override
	protected void method5945() {
		this.anIDirect3DDevice1.a(28, this.aBoolean492 && this.aBoolean497 && this.anInt6650 >= 0);
	}

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "(I)V")
	@Override
	protected void method5865() {
		@Pc(7) float local7 = this.aBoolean488 ? this.aFloat151 : 0.0F;
		@Pc(16) float local16 = this.aBoolean488 ? -this.aFloat156 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(this.aFloat157 * local7, this.aFloat153 * local7, this.aFloat152 * local7, (float) 0);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat157 * local16, this.aFloat153 * local16, local16 * this.aFloat152, 0.0F);
		this.aBoolean501 = false;
	}

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)V")
	@Override
	public void method5843() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray47[0], -this.aFloatArray47[1], -this.aFloatArray47[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray43[0], -this.aFloatArray43[1], -this.aFloatArray43[2]);
		this.aBoolean501 = false;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	@Override
	protected void method5838() {
		if (this.aBoolean501) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean501 = true;
	}

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "(B)V")
	@Override
	protected void method5926() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6643; local1++) {
			@Pc(14) Class2_Sub13 local14 = this.aClass2_Sub13Array5[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method9405();
			@Pc(28) float local28 = local14.method9404() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method9411(), (float) local14.method9410(), (float) local14.method9406());
			this.aD3DLIGHT1.SetDiffuse(local28 * (float) (local22 >> 16 & 0xFF), (float) (local22 >> 8 & 0xFF) * local28, (float) (local22 & 0xFF) * local28, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method9407() * local14.method9407()));
			this.aD3DLIGHT1.SetRange((float) local14.method9407());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (local1 < this.anInt6631) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5926();
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "()Lclient!ev;")
	@Override
	public Class99 method8090() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt6656, 0);
		return new Class99(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass302_1.method7789()) {
			this.anInt6658 = 0;
			if (pia.a((byte) -110, this.aClass302_1.method7790())) {
				this.method5971();
			}
		} else if (++this.anInt6658 <= 50) {
			this.method5971();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "(B)Z")
	private boolean method5971() {
		@Pc(11) int local11 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local11 == 0 || local11 == -2005530519) {
			@Pc(24) Class302 local24 = (Class302) this.anObject14;
			this.method5851();
			local24.method7787();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static344.method5965(this.anInt6627, this.anInt6656, this.aD3DPRESENT_PARAMETERS1, this.anInt6657, this.anIDirect3D1)) {
				@Pc(58) int local58 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (pia.a(-2005530600, local58)) {
					local24.method7788(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.c(0));
					this.method5866();
					this.method5872();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
	@Override
	protected void method5841() {
		this.anIDirect3DDevice1.a(27, this.aBoolean491);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!nea;I[BI)Lclient!oq;")
	@Override
	public Interface13 method5834(@OriginalArg(2) Class244 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class61_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "(I)V")
	@Override
	protected void method5869() {
		this.anIDirect3DDevice1.a(174, this.aBoolean499);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!nr;I)V")
	public void method5972(@OriginalArg(0) Class61 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6625, arg0.method9324());
		if (arg0.aClass315_12 != this.aClass315Array1[this.anInt6625]) {
			@Pc(23) int local23 = Static344.method5966(arg0.aClass315_12);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 6, local23);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 5, local23);
			this.aClass315Array1[this.anInt6625] = arg0.aClass315_12;
			if (this.aBooleanArray33[this.anInt6625] != arg0.aBoolean785) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 7, arg0.aBoolean785 ? Static344.method5966(arg0.aClass315_12) : 0);
				this.aBooleanArray33[this.anInt6625] = arg0.aBoolean785;
			}
		} else if (this.aBooleanArray33[this.anInt6625] != arg0.aBoolean785) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 7, arg0.aBoolean785 ? Static344.method5966(arg0.aClass315_12) : 0);
			this.aBooleanArray33[this.anInt6625] = arg0.aBoolean785;
		}
		if (!this.aBooleanArray32[this.anInt6625]) {
			this.aBooleanArray32[this.anInt6625] = true;
			this.method5883();
			this.method5896();
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
	@Override
	public void method8072() {
	}

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "(I)V")
	@Override
	protected void method5912() {
		if (this.aClass220_7 == Static537.aClass220_9) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass220_7 == Static470.aClass220_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass220_7 == Static497.aClass220_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!cw;)V")
	public void method5973(@OriginalArg(1) Class61_Sub2 arg0) {
		this.method5972(arg0);
		if (arg0.aBoolean117 != this.aBooleanArray35[this.anInt6625]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 1, arg0.aBoolean117 ? 1 : 3);
			this.aBooleanArray35[this.anInt6625] = arg0.aBoolean117;
		}
		if (this.aBooleanArray34[this.anInt6625] != arg0.aBoolean118) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6625, 2, arg0.aBoolean118 ? 1 : 3);
			this.aBooleanArray34[this.anInt6625] = arg0.aBoolean118;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!nea;[FIZIB)Lclient!lba;")
	@Override
	protected Interface10 method5877(@OriginalArg(1) int arg0, @OriginalArg(2) Class244 arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "()V")
	@Override
	public void method8116() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method8108(@OriginalArg(0) Interface17 arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "()V")
	@Override
	public void method8107() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (pia.a(-2005530600, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(-4840);
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(Z)V")
	@Override
	protected void method5854() {
		if (this.aClass227_7.method6167()) {
			this.aClass76_Sub2_18.method7347(Static344.aFloatArray48);
		} else {
			Static344.aFloatArray48[9] = 0.0F;
			Static344.aFloatArray48[10] = 1.0F;
			Static344.aFloatArray48[6] = 0.0F;
			Static344.aFloatArray48[4] = 0.0F;
			Static344.aFloatArray48[2] = 0.0F;
			Static344.aFloatArray48[15] = 1.0F;
			Static344.aFloatArray48[0] = 1.0F;
			Static344.aFloatArray48[5] = 1.0F;
			Static344.aFloatArray48[12] = 0.0F;
			Static344.aFloatArray48[11] = 0.0F;
			Static344.aFloatArray48[13] = 0.0F;
			Static344.aFloatArray48[14] = 0.0F;
			Static344.aFloatArray48[7] = 0.0F;
			Static344.aFloatArray48[1] = 0.0F;
			Static344.aFloatArray48[8] = 0.0F;
			Static344.aFloatArray48[3] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static344.aFloatArray48);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!rl;II)V")
	@Override
	public void method5853(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static344.method5974(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIIIIIZ)Lclient!lba;")
	@Override
	public Interface10 method5916(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		return new Class61_Sub2(this, arg3, arg2, arg5, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[Lclient!pfa;)Lclient!ija;")
	@Override
	public Class167 method5871(@OriginalArg(1) Class280[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!jagdx/IDirect3DPixelShader;)V")
	public void method5975(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(B)V")
	@Override
	protected void method5870() {
		if (this.anIDirect3DVertexShader7 != null || Static401.aClass327_3 == this.aClass327Array3[this.anInt6625]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, 24, 0);
			this.anIntArray313[this.anInt6625] = 0;
			return;
		}
		if (this.aClass327Array3[this.anInt6625] == Static174.aClass327_1) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6625 + 16, this.aClass76_Sub2Array3[this.anInt6625].method7331(Static344.aFloatArray48));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6625 + 16, this.aClass76_Sub2Array3[this.anInt6625].method7347(Static344.aFloatArray48));
		}
		@Pc(68) int local68 = Static344.method5976(this.aClass327Array3[this.anInt6625]);
		if (local68 != this.anIntArray313[this.anInt6625]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, 24, local68);
			this.anIntArray313[this.anInt6625] = local68;
		}
	}

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "(I)V")
	@Override
	protected void method5883() {
		@Pc(19) int local19 = this.aBooleanArray32[this.anInt6625] ? Static344.method5968(this.aClass381Array6[this.anInt6625]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, 4, local19);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method5875(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5915(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass302_1 = (Class302) arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZLclient!gca;B)V")
	@Override
	protected void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) Class118 arg1) {
		@Pc(17) byte local17;
		if (arg0 == 1) {
			local17 = 6;
		} else if (arg0 == 2) {
			local17 = 27;
		} else {
			local17 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, local17, Static344.method5969(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5934(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (arg1 != this.aCanvas9) {
			return;
		}
		@Pc(6) Dimension local6 = arg1.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method5971();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)Lclient!wba;")
	@Override
	public Interface25 method5856(@OriginalArg(0) boolean arg0) {
		return new Class203(this, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ[BIILclient!nea;I)Lclient!lba;")
	@Override
	protected Interface10 method5847(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class244 arg4) {
		return new Class61_Sub2(this, arg4, arg0, arg3, arg1, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	@Override
	public void method8093(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "()V")
	@Override
	public void method8147() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZZLclient!gca;I)V")
	@Override
	public void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class118 arg3) {
		@Pc(11) byte local11;
		if (arg0 == 1) {
			local11 = 3;
		} else if (arg0 == 2) {
			local11 = 26;
		} else {
			local11 = 2;
		}
		@Pc(19) int local19 = 0;
		if (arg2) {
			local19 = 32;
		}
		if (arg1) {
			local19 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6625, local11, Static344.method5969(arg3) | local19);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!vv;Lclient!rl;III)V")
	@Override
	public void method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class131) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static344.method5974(arg3), 0, arg0, arg1, arg4, arg5);
	}

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "()V")
	@Override
	protected void method8124() {
		this.aMk1.b(-3147);
		super.method8124();
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(Z)V")
	@Override
	protected void method5929() {
		this.anIDirect3DDevice1.a(7, this.aBoolean490);
	}

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "(I)V")
	@Override
	protected void method5910() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6653);
	}
}
