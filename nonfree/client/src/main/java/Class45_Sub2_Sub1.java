import jaclib.peer.tc;
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
import jagdx.hba;
import jagdx.qi;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class45_Sub2_Sub1 extends Class45_Sub2 {

	@OriginalMember(owner = "client!eda", name = "Ng", descriptor = "I")
	private int anInt2692 = 0;

	@OriginalMember(owner = "client!eda", name = "Dg", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!eda", name = "Kg", descriptor = "Lclient!aca;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!eda", name = "Gg", descriptor = "Lclient!jaclib/peer/tc;")
	public final tc aTc1;

	@OriginalMember(owner = "client!eda", name = "Hg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!eda", name = "Ig", descriptor = "I")
	private final int anInt2690;

	@OriginalMember(owner = "client!eda", name = "Jg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!eda", name = "Lg", descriptor = "I")
	private final int anInt2691;

	@OriginalMember(owner = "client!eda", name = "Bg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!eda", name = "Fg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!eda", name = "sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!eda", name = "tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!eda", name = "Rg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!eda", name = "yg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!eda", name = "rg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!eda", name = "vg", descriptor = "Z")
	public final boolean aBoolean220;

	@OriginalMember(owner = "client!eda", name = "zg", descriptor = "Z")
	public final boolean aBoolean221;

	@OriginalMember(owner = "client!eda", name = "Mg", descriptor = "Z")
	public final boolean aBoolean223;

	@OriginalMember(owner = "client!eda", name = "wg", descriptor = "[Lclient!dj;")
	private final Class71[] aClass71Array1;

	@OriginalMember(owner = "client!eda", name = "Qg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!eda", name = "Og", descriptor = "[I")
	private final int[] anIntArray108;

	@OriginalMember(owner = "client!eda", name = "xg", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!eda", name = "Eg", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!eda", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!eda", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!tf;Ljava/lang/Integer;)Lclient!r;")
	private static Class45 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class45_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) tc local9 = new tc();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(190) D3DPRESENT_PARAMETERS local190 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static116.method2414(local5, local190, local13, local3, arg3)) {
					throw new RuntimeException("");
				}
				local190.EnableAutoDepthStencil = true;
				local190.PresentationInterval = Integer.MIN_VALUE;
				local190.Windowed = true;
				@Pc(215) int local215 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local215 |= 0x10;
				}
				@Pc(240) IDirect3DDevice local240;
				try {
					local240 = local13.a(local3, local5, arg0, local215 | 0x40, local190);
				} catch (@Pc(242) hba local242) {
					local240 = local13.a(local3, local5, arg0, local215 | 0x20, local190);
				}
				@Pc(261) Class5 local261 = new Class5(local240.c(0), local240.b());
				local1 = new Class45_Sub2_Sub1(local3, local5, arg0, local9, local13, local240, local261, local190, local18, arg1, arg2, arg3);
				local1.method4963();
				return local1;
			}
		} catch (@Pc(284) RuntimeException local284) {
			if (local1 != null) {
				local1.method7359();
			}
			throw local284;
		}
	}

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/tc;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!aca;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!tf;I)V")
	public Class45_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) tc arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface3 arg9, @OriginalArg(10) Class322 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aClass5_1 = arg6;
		this.aTc1 = arg3;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anInt2690 = arg1;
		this.anIDirect3DDevice1 = arg5;
		this.anInt2691 = arg0;
		this.anIDirect3D1 = arg4;
		this.aD3DCAPS1 = arg8;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aTc1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aTc1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aTc1);
		this.aPixelBuffer1 = new PixelBuffer(this.aTc1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aTc1);
		new GeometryBuffer(this.aTc1);
		this.aBoolean220 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean428 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean221 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.anInt5852 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean409 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt5869 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean223 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean410 = this.anInt5846 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt2691, this.anInt2690, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aClass71Array1 = new Class71[this.anInt5869];
		this.aBooleanArray8 = new boolean[this.anInt5869];
		this.anIntArray108 = new int[this.anInt5869];
		this.aBooleanArray5 = new boolean[this.anInt5869];
		this.aBooleanArray7 = new boolean[this.anInt5869];
		this.aBooleanArray6 = new boolean[this.anInt5869];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method5000(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.d(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (qi.a((byte) 35, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && qi.a((byte) 35, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.b(local1, arg2 * local72, local72 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(-127);
		local16.b(-127);
		return local1;
	}

	@OriginalMember(owner = "client!eda", name = "p", descriptor = "()Lclient!aj;")
	@Override
	public Class15 method7401() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt2691, 0);
		return new Class15(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!eda", name = "i", descriptor = "(Z)V")
	@Override
	protected void method4990() {
		this.aFloat128 = this.anInt5861 - this.anInt5848;
		this.aFloat129 = this.aFloat128 - (float) this.anInt5837;
		if (this.aFloat129 < (float) this.anInt5836) {
			this.aFloat129 = this.anInt5836;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat129);
		this.anIDirect3DDevice1.a(37, this.aFloat128);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt5847);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZ[[IB)Lclient!ica;")
	@Override
	public Interface6 method4991(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class42_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "(I)V")
	@Override
	protected void method4933() {
		@Pc(7) float local7 = this.aBoolean423 ? this.aFloat135 : 0.0F;
		@Pc(24) float local24 = this.aBoolean423 ? -this.aFloat133 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(local7 * this.aFloat131, local7 * this.aFloat123, local7 * this.bf, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat131 * local24, this.aFloat123 * local24, local24 * this.bf, 0.0F);
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZZZLclient!gb;)V")
	@Override
	public void method5010(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class108 arg3) {
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
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, local11, Static116.method2407(arg3) | local19);
	}

	@OriginalMember(owner = "client!eda", name = "v", descriptor = "(I)V")
	@Override
	protected void method4935() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5839; local1++) {
			@Pc(21) Class3_Sub10 local21 = this.aClass3_Sub10Array4[local1];
			@Pc(25) int local25 = local1 + 2;
			@Pc(29) int local29 = local21.method6020();
			@Pc(35) float local35 = local21.method6013() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local21.method6021(), (float) local21.method6011(), (float) local21.method6015());
			this.aD3DLIGHT3.SetDiffuse((float) (local29 >> 16 & 0xFF) * local35, local35 * (float) (local29 >> 8 & 0xFF), local35 * (float) (local29 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local21.method6018() * local21.method6018()));
			this.aD3DLIGHT3.SetRange((float) local21.method6018());
			this.anIDirect3DDevice1.SetLight(local25, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local25, true);
		}
		while (this.anInt5863 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4935();
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4942() {
		this.anIDirect3DDevice1.a(15, this.aBoolean417);
	}

	@OriginalMember(owner = "client!eda", name = "l", descriptor = "()V")
	@Override
	public void method7386() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass5_1.method89()) {
			this.anInt2692 = 0;
			if (qi.a((int) this.aClass5_1.method90(), 0)) {
				this.method2410();
			}
		} else if (++this.anInt2692 <= 50) {
			this.method2410();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!eda", name = "T", descriptor = "(I)V")
	@Override
	protected void method5005() {
		if (this.aClass158_5 == Static538.aClass158_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass158_5 == Static536.aClass158_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static207.aClass158_4 == this.aClass158_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!su;II)V")
	@Override
	public void method4910(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class285 local9 = (Class285) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local9.anIDirect3DVertexBuffer1, 0, local9.method6256());
	}

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "(I)V")
	@Override
	protected void method4906() {
		this.anIDirect3DDevice1.a(7, this.aBoolean427);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBI[BILclient!sq;)Lclient!n;")
	@Override
	public Interface14 method4972(@OriginalArg(3) byte[] arg0, @OriginalArg(5) Class314 arg1) {
		return new Class42_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "(B)V")
	@Override
	protected void method5027() {
		this.anIDirect3DDevice1.a(14, this.aBoolean414 && this.aBoolean415);
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(Z)V")
	@Override
	protected void method4951() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5869; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass71Array1[local1] = Static567.aClass71_11;
			this.aBooleanArray5[local1] = this.aBooleanArray7[local1] = true;
			this.aBooleanArray8[local1] = false;
			this.anIntArray108[local1] = 0;
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
		this.aBoolean222 = false;
		super.method4951();
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!al;B)V")
	@Override
	public void method4919(@OriginalArg(0) Class17 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static326.aClass17_3) {
			local1 = 65536;
		} else if (arg0 == Static62.aClass17_1) {
			local1 = 131072;
		} else if (arg0 == Static380.aClass17_4) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, 11, local1 | this.anInt5855);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)Lclient!nm;")
	@Override
	protected Class72 method4929(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class72_Sub10(this, this.aClass322_107);
		} else if (arg0 == 4) {
			return new Class72_Sub9(this, this.aClass322_107, this.aClass331_4);
		} else if (arg0 == 8) {
			return new Class72_Sub7(this, this.aClass322_107, this.aClass331_4);
		} else {
			return super.method4929(arg0);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!dh;B)V")
	public void method2406(@OriginalArg(0) Class42_Sub2 arg0) {
		this.method2412(arg0);
		if (!this.aBooleanArray5[this.anInt5855]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 1, 1);
			this.aBooleanArray5[this.anInt5855] = true;
		}
		if (!this.aBooleanArray7[this.anInt5855]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 2, 1);
			this.aBooleanArray7[this.anInt5855] = true;
		}
	}

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "()V")
	@Override
	public void method7420() {
	}

	@OriginalMember(owner = "client!eda", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZ)Lclient!mda;")
	@Override
	public Interface13 method4945(@OriginalArg(1) boolean arg0) {
		return new Class294(this, Static471.aClass298_16, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!tw;)V")
	public void method2408(@OriginalArg(1) Class42_Sub3 arg0) {
		this.method2412(arg0);
		if (arg0.aBoolean643 != this.aBooleanArray5[this.anInt5855]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 1, arg0.aBoolean643 ? 1 : 3);
			this.aBooleanArray5[this.anInt5855] = arg0.aBoolean643;
		}
		if (arg0.aBoolean644 != this.aBooleanArray7[this.anInt5855]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 2, arg0.aBoolean644 ? 1 : 3);
			this.aBooleanArray7[this.anInt5855] = arg0.aBoolean644;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!bs;IZI)V")
	@Override
	public void method4927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static116.method2404(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "()Z")
	@Override
	public boolean method7363() {
		return false;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIILclient!rt;Lclient!sq;)Lclient!pm;")
	@Override
	public Interface17 method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class298 arg2, @OriginalArg(4) Class314 arg3) {
		return new Class42_Sub3(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!rt;Lclient!sq;B)Z")
	@Override
	public boolean method5016(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class314 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return qi.a((byte) 35, this.anIDirect3D1.a(this.anInt2691, local3)) && qi.a((byte) 35, this.anIDirect3D1.CheckDeviceFormat(this.anInt2691, this.anInt2690, local3.Format, 0, 4, Static116.method2411(arg1, arg0)));
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "()V")
	@Override
	public void method7361() {
	}

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "(II)V")
	@Override
	public void method4944(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, 11, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "gb", descriptor = "(I)Z")
	private boolean method2410() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(17) Class5 local17 = (Class5) this.anObject12;
			this.method5008();
			local17.method88();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static116.method2414(this.anInt2690, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1, this.anInt2691, this.anInt5846)) {
				@Pc(51) int local51 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (qi.a((byte) 35, local51)) {
					local17.method91(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.b());
					this.method4925();
					this.method4951();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eda", name = "s", descriptor = "(I)V")
	@Override
	protected void method4928() {
		if (this.aBoolean222) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean222 = true;
	}

	@OriginalMember(owner = "client!eda", name = "l", descriptor = "(Z)V")
	@Override
	protected void method5020() {
		this.method4933();
		this.method4928();
	}

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "()V")
	@Override
	public void method7368() {
	}

	@OriginalMember(owner = "client!eda", name = "m", descriptor = "(B)V")
	@Override
	protected void method4988() {
		this.anIDirect3DDevice1.a(28, this.aBoolean426 && this.aBoolean424 && this.anInt5837 >= 0);
	}

	@OriginalMember(owner = "client!eda", name = "x", descriptor = "()V")
	@Override
	public void method7426() {
	}

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "()Z")
	@Override
	public boolean method7365() {
		return false;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([BIZIIILclient!sq;I)Lclient!pm;")
	@Override
	protected Interface17 method5021(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class314 arg4) {
		return new Class42_Sub3(this, arg4, arg2, arg3, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "(B)V")
	@Override
	protected void method5028() {
		if (this.aClass242_6.method5734()) {
			this.aClass11_Sub1_18.method170(Static116.aFloatArray37);
		} else {
			Static116.aFloatArray37[11] = 0.0F;
			Static116.aFloatArray37[12] = 0.0F;
			Static116.aFloatArray37[8] = 0.0F;
			Static116.aFloatArray37[5] = 1.0F;
			Static116.aFloatArray37[14] = 0.0F;
			Static116.aFloatArray37[7] = 0.0F;
			Static116.aFloatArray37[13] = 0.0F;
			Static116.aFloatArray37[9] = 0.0F;
			Static116.aFloatArray37[3] = 0.0F;
			Static116.aFloatArray37[10] = 1.0F;
			Static116.aFloatArray37[1] = 0.0F;
			Static116.aFloatArray37[4] = 0.0F;
			Static116.aFloatArray37[6] = 0.0F;
			Static116.aFloatArray37[15] = 1.0F;
			Static116.aFloatArray37[0] = 1.0F;
			Static116.aFloatArray37[2] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static116.aFloatArray37);
	}

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7410(@OriginalArg(0) int arg0) {
		this.aTc1.a(-21326);
		super.method7410(arg0);
	}

	@OriginalMember(owner = "client!eda", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "(Z)V")
	@Override
	public void method4986() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray66[0], -this.aFloatArray66[1], -this.aFloatArray66[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(ZB)V")
	@Override
	public void method4918(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!sq;IZII[F)Lclient!pm;")
	@Override
	protected Interface17 method4908(@OriginalArg(0) int arg0, @OriginalArg(2) Class314 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!gb;IIZ)V")
	@Override
	protected void method4923(@OriginalArg(0) Class108 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte local13;
		if (arg1 == 1) {
			local13 = 6;
		} else if (arg1 == 2) {
			local13 = 27;
		} else {
			local13 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, local13, Static116.method2407(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!kfa;)V")
	public void method2412(@OriginalArg(1) Class42 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt5855, arg0.method6964());
		if (this.aClass71Array1[this.anInt5855] != arg0.aClass71_10) {
			@Pc(57) int local57 = Static116.method2405(arg0.aClass71_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 6, local57);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 5, local57);
			this.aClass71Array1[this.anInt5855] = arg0.aClass71_10;
			if (this.aBooleanArray8[this.anInt5855] != arg0.aBoolean642) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 7, arg0.aBoolean642 ? Static116.method2405(arg0.aClass71_10) : 0);
				this.aBooleanArray8[this.anInt5855] = arg0.aBoolean642;
			}
		} else if (this.aBooleanArray8[this.anInt5855] != arg0.aBoolean642) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5855, 7, arg0.aBoolean642 ? Static116.method2405(arg0.aClass71_10) : 0);
			this.aBooleanArray8[this.anInt5855] = arg0.aBoolean642;
		}
		if (!this.aBooleanArray6[this.anInt5855]) {
			this.aBooleanArray6[this.anInt5855] = true;
			this.method4987();
			this.method4982();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!rt;Lclient!sq;)Z")
	@Override
	public boolean method4955(@OriginalArg(1) Class298 arg0, @OriginalArg(2) Class314 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return qi.a((byte) 35, this.anIDirect3D1.a(this.anInt2691, local9)) && qi.a((byte) 35, this.anIDirect3D1.CheckDeviceFormat(this.anInt2691, this.anInt2690, local9.Format, 0, 3, Static116.method2411(arg1, arg0)));
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)V")
	@Override
	public void method7421(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)Lclient!su;")
	@Override
	public Interface19 method5009(@OriginalArg(0) boolean arg0) {
		return new Class285(this, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "(Z)V")
	@Override
	protected void method4969() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray65);
	}

	@OriginalMember(owner = "client!eda", name = "ab", descriptor = "(I)V")
	@Override
	protected void method5022() {
		this.anIDirect3DDevice1.a(137, this.aBoolean422 && !this.aBoolean416);
	}

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "(B)V")
	@Override
	protected void method4997() {
		this.anIDirect3DDevice1.a(174, this.aBoolean429);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLclient!ada;)V")
	@Override
	public void method4957(@OriginalArg(1) Class7 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIZLclient!bs;Lclient!mda;I)V")
	@Override
	public void method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class40 arg3, @OriginalArg(5) Interface13 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class294) arg4).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static116.method2404(arg3), 0, arg5, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!lj;Lclient!lj;FLclient!lj;)Lclient!lj;")
	@Override
	public Class12 method7381(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7399(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7386();
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I[Lclient!uaa;)Lclient!ada;")
	@Override
	public Class7 method5002(@OriginalArg(1) Class332[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4983() {
		this.anIDirect3DDevice1.SetViewport(this.anInt5840, this.anInt5833, this.anInt5668, this.anInt5786, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!eda", name = "A", descriptor = "()V")
	@Override
	public void method7432() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (qi.a((byte) 35, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(-127);
	}

	@OriginalMember(owner = "client!eda", name = "A", descriptor = "(I)V")
	@Override
	protected void method4954() {
	}

	@OriginalMember(owner = "client!eda", name = "B", descriptor = "(I)V")
	@Override
	protected void method4956() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt5835);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4964(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!eda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4981(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7400(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!eda", name = "l", descriptor = "(B)V")
	@Override
	protected void method4982() {
		@Pc(15) int local15 = this.aBooleanArray6[this.anInt5855] ? Static116.method2409(this.aClass307Array5[this.anInt5855]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, 1, local15);
	}

	@OriginalMember(owner = "client!eda", name = "y", descriptor = "(I)V")
	@Override
	protected void method4949() {
		if (this.aBooleanArray6[this.anInt5855]) {
			this.aBooleanArray6[this.anInt5855] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt5855, null);
			this.method4987();
			this.method4982();
		}
	}

	@OriginalMember(owner = "client!eda", name = "x", descriptor = "(I)V")
	@Override
	protected void method4941() {
		this.anIDirect3DDevice1.a(27, this.aBoolean413);
	}

	@OriginalMember(owner = "client!eda", name = "J", descriptor = "(I)V")
	@Override
	protected void method4980() {
		if (this.aBoolean408) {
			Static116.aFloatArray37[8] = 0.0F;
			Static116.aFloatArray37[3] = 0.0F;
			Static116.aFloatArray37[15] = 1.0F;
			Static116.aFloatArray37[1] = 0.0F;
			Static116.aFloatArray37[10] = 1.0F;
			Static116.aFloatArray37[11] = 0.0F;
			Static116.aFloatArray37[0] = 1.0F;
			Static116.aFloatArray37[14] = 0.0F;
			Static116.aFloatArray37[12] = 0.0F;
			Static116.aFloatArray37[5] = 1.0F;
			Static116.aFloatArray37[13] = 0.0F;
			Static116.aFloatArray37[2] = 0.0F;
			Static116.aFloatArray37[4] = 0.0F;
			Static116.aFloatArray37[9] = 0.0F;
			Static116.aFloatArray37[6] = 0.0F;
			Static116.aFloatArray37[7] = 0.0F;
		} else {
			this.aClass11_Sub1_15.method170(Static116.aFloatArray37);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static116.aFloatArray37);
	}

	@OriginalMember(owner = "client!eda", name = "M", descriptor = "(I)V")
	@Override
	protected void method4987() {
		@Pc(15) int local15 = this.aBooleanArray6[this.anInt5855] ? Static116.method2409(this.aClass307Array6[this.anInt5855]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, 4, local15);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BZIII[II)Lclient!pm;")
	@Override
	public Interface17 method4965(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class42_Sub3(this, arg3, arg2, arg0, arg4, 0, arg1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
	@Override
	protected void method4959(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		this.aClass5_1 = (Class5) arg1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "()V")
	@Override
	protected void method7359() {
		this.aTc1.a(true);
		super.method7359();
	}

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "(I)V")
	@Override
	protected void method4913() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat134 * this.aFloat131, this.aFloat134 * this.aFloat123, this.aFloat134 * this.bf, 0.0F);
		this.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5025(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas7) {
			return;
		}
		@Pc(11) Dimension local11 = arg0.getSize();
		if (local11.width > 0 && local11.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method2410();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!eda", name = "X", descriptor = "(I)V")
	@Override
	protected void method5011() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt5840 + this.anInt5853, this.anInt5833 - -this.anInt5854, this.anInt5871, this.anInt5864);
	}

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "(I)F")
	@Override
	protected float method4922() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!eda", name = "Y", descriptor = "(I)V")
	@Override
	protected void method5012() {
		if (Static11.aClass222_5 == this.aClass222Array3[this.anInt5855]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, 24, 0);
			this.anIntArray108[this.anInt5855] = 0;
			return;
		}
		if (this.aClass222Array3[this.anInt5855] == Static334.aClass222_9) {
			this.anIDirect3DDevice1.SetTransform(this.anInt5855 + 16, this.aClass11_Sub1Array3[this.anInt5855].method170(Static116.aFloatArray37));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt5855 + 16, this.aClass11_Sub1Array3[this.anInt5855].method179(Static116.aFloatArray37));
		}
		@Pc(74) int local74 = Static116.method2413(this.aClass222Array3[this.anInt5855]);
		if (local74 != this.anIntArray108[this.anInt5855]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5855, 24, local74);
			this.anIntArray108[this.anInt5855] = local74;
		}
	}
}
