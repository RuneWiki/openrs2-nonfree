import jaclib.peer.ca;
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
import jagdx.iba;
import jagdx.vba;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class90_Sub3_Sub2 extends Class90_Sub3 {

	@OriginalMember(owner = "client!vg", name = "yg", descriptor = "Z")
	private boolean aBoolean651 = false;

	@OriginalMember(owner = "client!vg", name = "zg", descriptor = "I")
	private int anInt9591 = 0;

	@OriginalMember(owner = "client!vg", name = "Kg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!vg", name = "Rg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!vg", name = "xg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!vg", name = "Hg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!vg", name = "Bg", descriptor = "I")
	private final int anInt9592;

	@OriginalMember(owner = "client!vg", name = "Ng", descriptor = "Lclient!jaclib/peer/ca;")
	public final ca aCa1;

	@OriginalMember(owner = "client!vg", name = "Dg", descriptor = "I")
	private final int anInt9593;

	@OriginalMember(owner = "client!vg", name = "Fg", descriptor = "Lclient!dk;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!vg", name = "Gg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!vg", name = "Eg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!vg", name = "Vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!vg", name = "Cg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!vg", name = "Tg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!vg", name = "wg", descriptor = "Z")
	public final boolean aBoolean650;

	@OriginalMember(owner = "client!vg", name = "Sg", descriptor = "Z")
	public final boolean aBoolean653;

	@OriginalMember(owner = "client!vg", name = "Ag", descriptor = "Z")
	public final boolean aBoolean652;

	@OriginalMember(owner = "client!vg", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!vg", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!vg", name = "Mg", descriptor = "[I")
	private final int[] anIntArray700;

	@OriginalMember(owner = "client!vg", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!vg", name = "Ig", descriptor = "[Lclient!qaa;")
	private final Class257[] aClass257Array1;

	@OriginalMember(owner = "client!vg", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!vg", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!e;Lclient!pj;Ljava/lang/Integer;)Lclient!oa;")
	private static Class90 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class90_Sub3_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ca local9 = new ca();
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
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(181) D3DPRESENT_PARAMETERS local181 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static549.method7671(arg3, local3, local5, local13, local181)) {
					throw new RuntimeException("");
				}
				local181.PresentationInterval = Integer.MIN_VALUE;
				local181.EnableAutoDepthStencil = true;
				local181.Windowed = true;
				@Pc(206) int local206 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local206 |= 0x10;
				}
				@Pc(231) IDirect3DDevice local231;
				try {
					local231 = local13.a(local3, local5, arg0, local206 | 0x40, local181);
				} catch (@Pc(233) iba local233) {
					local231 = local13.a(local3, local5, arg0, local206 | 0x20, local181);
				}
				@Pc(252) Class76 local252 = new Class76(local231.c(0), local231.b());
				local1 = new Class90_Sub3_Sub2(local3, local5, arg0, local9, local13, local231, local252, local181, local18, arg1, arg2, arg3);
				local1.method7632();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(275) RuntimeException local275) {
			if (local1 != null) {
				local1.method7525();
			}
			throw local275;
		}
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ca;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!dk;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!e;Lclient!pj;I)V")
	public Class90_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ca arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class76 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface2 arg9, @OriginalArg(10) Class248 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aD3DCAPS1 = arg8;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anIDirect3D1 = arg4;
		this.anIDirect3DDevice1 = arg5;
		this.anInt9592 = arg0;
		this.aCa1 = arg3;
		this.anInt9593 = arg1;
		this.aClass76_1 = arg6;
		this.aD3DLIGHT2 = new D3DLIGHT(this.aCa1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aCa1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aCa1);
		this.aPixelBuffer1 = new PixelBuffer(this.aCa1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aCa1);
		new GeometryBuffer(this.aCa1);
		this.anInt9580 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean638 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean650 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean653 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.anInt9582 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean652 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean640 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean636 = this.anInt9551 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9592, this.anInt9593, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray36 = new boolean[this.anInt9580];
		this.aBooleanArray35 = new boolean[this.anInt9580];
		this.anIntArray700 = new int[this.anInt9580];
		this.aBooleanArray34 = new boolean[this.anInt9580];
		this.aClass257Array1 = new Class257[this.anInt9580];
		this.aBooleanArray33 = new boolean[this.anInt9580];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method7508();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(236) Exception_Sub1 local236) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!vg", name = "T", descriptor = "(I)V")
	@Override
	protected void method7637() {
		this.anIDirect3DDevice1.a(28, this.aBoolean648 && this.aBoolean642 && this.anInt9564 >= 0 | this.aBoolean631);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method7603(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass76_1 = (Class76) arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!kda;I)V")
	@Override
	public void method7655(@OriginalArg(0) Class168 arg0) {
		@Pc(14) int local14 = 0;
		if (Static464.aClass168_4 == arg0) {
			local14 = 65536;
		} else if (Static146.aClass168_1 == arg0) {
			local14 = 131072;
		} else if (arg0 == Static240.aClass168_2) {
			local14 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, 11, this.anInt9579 | local14);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!cl;)V")
	public void method7664(@OriginalArg(1) Class57_Sub1 arg0) {
		this.method7665(arg0);
		if (arg0.aBoolean88 != this.aBooleanArray36[this.anInt9579]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 1, arg0.aBoolean88 ? 1 : 3);
			this.aBooleanArray36[this.anInt9579] = arg0.aBoolean88;
		}
		if (this.aBooleanArray34[this.anInt9579] != arg0.aBoolean87) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 2, arg0.aBoolean87 ? 1 : 3);
			this.aBooleanArray34[this.anInt9579] = arg0.aBoolean87;
		}
	}

	@OriginalMember(owner = "client!vg", name = "V", descriptor = "(I)V")
	@Override
	protected void method7641() {
		this.anIDirect3DDevice1.a(174, this.aBoolean649);
	}

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "(I)V")
	@Override
	protected void method7539() {
		this.anIDirect3DDevice1.a(27, this.aBoolean647);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)Lclient!jn;")
	@Override
	public Interface9 method7545(@OriginalArg(0) boolean arg0) {
		return new Class43(this, Static407.aClass254_15, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7561(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "(I)V")
	@Override
	protected void method7551() {
		if (this.aBoolean651) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean651 = true;
	}

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "(B)V")
	@Override
	protected void method7659() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9566, this.anInt9588, this.anInt9524, this.anInt9469, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBLclient!uj;)V")
	@Override
	public void method7531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class321 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static549.method7668(arg2), arg1, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(ZI)V")
	@Override
	public void method7599(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "()V")
	@Override
	public void method7501() {
	}

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "()Z")
	@Override
	public boolean method7479() {
		return false;
	}

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "(I)V")
	@Override
	public void method7563() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray89[0], -this.aFloatArray89[1], -this.aFloatArray89[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray84[0], -this.aFloatArray84[1], -this.aFloatArray84[2]);
		this.aBoolean651 = false;
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7486(@OriginalArg(0) int arg0) {
		this.aCa1.a(false);
		super.method7486(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "K", descriptor = "(I)V")
	@Override
	protected void method7607() {
		this.anIDirect3DDevice1.a(14, this.aBoolean630 && this.aBoolean637);
	}

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "(I)V")
	@Override
	protected void method7571() {
		if (this.aClass296_7.method6776()) {
			this.aClass93_Sub3_18.method3758(Static549.aFloatArray90);
		} else {
			Static549.aFloatArray90[2] = 0.0F;
			Static549.aFloatArray90[10] = 1.0F;
			Static549.aFloatArray90[13] = 0.0F;
			Static549.aFloatArray90[1] = 0.0F;
			Static549.aFloatArray90[12] = 0.0F;
			Static549.aFloatArray90[9] = 0.0F;
			Static549.aFloatArray90[14] = 0.0F;
			Static549.aFloatArray90[0] = 1.0F;
			Static549.aFloatArray90[3] = 0.0F;
			Static549.aFloatArray90[8] = 0.0F;
			Static549.aFloatArray90[7] = 0.0F;
			Static549.aFloatArray90[4] = 0.0F;
			Static549.aFloatArray90[15] = 1.0F;
			Static549.aFloatArray90[6] = 0.0F;
			Static549.aFloatArray90[11] = 0.0F;
			Static549.aFloatArray90[5] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static549.aFloatArray90);
	}

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
	@Override
	protected void method7536() {
		this.method7541();
		this.method7551();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!kf;IILclient!ps;I)Lclient!hr;")
	@Override
	public Interface7 method7626(@OriginalArg(0) Class171 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class254 arg2, @OriginalArg(4) int arg3) {
		return new Class57_Sub1(this, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "(B)V")
	@Override
	protected void method7565() {
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI[BLclient!kf;ZII)Lclient!hr;")
	@Override
	protected Interface7 method7600(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(6) int arg4) {
		return new Class57_Sub1(this, arg3, arg4, arg0, arg1, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "()V")
	@Override
	protected void method7525() {
		this.aCa1.b((byte) -86);
		super.method7525();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([Lclient!lf;B)Lclient!fl;")
	@Override
	public Class107 method7605(@OriginalArg(0) Class185[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "()Z")
	@Override
	public boolean method7496() {
		return false;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!sf;)V")
	public void method7665(@OriginalArg(1) Class57 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9579, arg0.method5363());
		if (this.aClass257Array1[this.anInt9579] != arg0.aClass257_8) {
			@Pc(63) int local63 = Static549.method7667(arg0.aClass257_8);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 6, local63);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 5, local63);
			this.aClass257Array1[this.anInt9579] = arg0.aClass257_8;
			if (arg0.aBoolean461 != this.aBooleanArray35[this.anInt9579]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 7, arg0.aBoolean461 ? Static549.method7667(arg0.aClass257_8) : 0);
				this.aBooleanArray35[this.anInt9579] = arg0.aBoolean461;
			}
		} else if (this.aBooleanArray35[this.anInt9579] != arg0.aBoolean461) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 7, arg0.aBoolean461 ? Static549.method7667(arg0.aClass257_8) : 0);
			this.aBooleanArray35[this.anInt9579] = arg0.aBoolean461;
		}
		if (!this.aBooleanArray33[this.anInt9579]) {
			this.aBooleanArray33[this.anInt9579] = true;
			this.method7587();
			this.method7616();
		}
	}

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([IIZIIII)Lclient!hr;")
	@Override
	public Interface7 method7623(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class57_Sub1(this, arg3, arg5, arg1, arg0, 0, arg4);
	}

	@OriginalMember(owner = "client!vg", name = "db", descriptor = "(I)Z")
	private boolean method7666() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(21) Class76 local21 = (Class76) this.anObject19;
			this.method7579();
			local21.method1462();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static549.method7671(this.anInt9551, this.anInt9592, this.anInt9593, this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (vba.a(-1, (int) local55)) {
					local21.method1464(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.b());
					this.method7567();
					this.method7582();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!iq;II)V")
	@Override
	public void method7658(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class287 local9 = (Class287) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local9.anIDirect3DVertexBuffer1, 0, local9.method6464());
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!ps;Lclient!kf;)Z")
	@Override
	public boolean method7628(@OriginalArg(1) Class254 arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return vba.a(-1, (int) this.anIDirect3D1.a(this.anInt9592, local10)) && vba.a(-1, (int) this.anIDirect3D1.CheckDeviceFormat(this.anInt9592, this.anInt9593, local10.Format, 0, 4, Static549.method7672(arg0, arg1)));
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLclient!iv;ZIZ)V")
	@Override
	public void method7557(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(15) byte local15;
		if (arg3 == 1) {
			local15 = 3;
		} else if (arg3 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		@Pc(23) int local23 = 0;
		if (arg2) {
			local23 = 32;
		}
		if (arg0) {
			local23 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, local15, Static549.method7670(arg1) | local23);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ka;Lclient!ka;FLclient!ka;)Lclient!ka;")
	@Override
	public Class3 method7503(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIILclient!jn;Lclient!uj;I)V")
	@Override
	public void method7560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) Class321 arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class43) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static549.method7668(arg4), 0, arg2, arg0, arg5, arg1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7460(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7508();
	}

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V")
	@Override
	protected void method7537() {
		if (this.aBoolean631) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt9572);
			return;
		}
		this.aFloat200 = this.anInt9577 - this.anInt9553;
		this.aFloat199 = this.aFloat200 - (float) this.anInt9564;
		if ((float) this.anInt9557 > this.aFloat199) {
			this.aFloat199 = this.anInt9557;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat199);
		this.anIDirect3DDevice1.a(37, this.aFloat200);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9562);
	}

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "(I)V")
	@Override
	protected void method7564() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat190 * this.aFloat201, this.aFloat204 * this.aFloat201, this.aFloat201 * this.aFloat206, 0.0F);
		this.aBoolean651 = false;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[[IZI)Lclient!js;")
	@Override
	public Interface10 method7657(@OriginalArg(1) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class57_Sub3(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "()V")
	@Override
	public void method7475() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (vba.a(-1, (int) local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(21066);
	}

	@OriginalMember(owner = "client!vg", name = "cb", descriptor = "(I)V")
	@Override
	protected void method7653() {
		this.anIDirect3DDevice1.a(7, this.aBoolean633);
	}

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "()V")
	@Override
	public void method7514() {
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
	@Override
	protected void method7530() {
		this.anIDirect3DDevice1.a(15, this.aBoolean645);
	}

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "(I)F")
	@Override
	protected float method7578() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V")
	@Override
	protected void method7549() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt9569; local5++) {
			@Pc(18) Class6_Sub25 local18 = this.aClass6_Sub25Array6[local5];
			@Pc(22) int local22 = local5 + 2;
			@Pc(26) int local26 = local18.method6409(true);
			@Pc(32) float local32 = local18.method6407() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local18.method6405(), (float) local18.method6402(), (float) local18.method6400());
			this.aD3DLIGHT3.SetDiffuse((float) (local26 >> 16 & 0xFF) * local32, local32 * (float) (local26 >> 8 & 0xFF), (float) (local26 & 0xFF) * local32, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local18.method6398() * local18.method6398()));
			this.aD3DLIGHT3.SetRange((float) local18.method6398());
			this.anIDirect3DDevice1.SetLight(local22, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local22, true);
		}
		while (this.anInt9573 > local5) {
			this.anIDirect3DDevice1.LightEnable(local5 + 2, false);
			local5++;
		}
		super.method7549();
	}

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "(I)V")
	@Override
	protected void method7587() {
		@Pc(15) int local15 = this.aBooleanArray33[this.anInt9579] ? Static549.method7663(this.bf[this.anInt9579]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, 4, local15);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
	@Override
	public void method7662(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, 11, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)V")
	@Override
	protected void method7541() {
		@Pc(7) float local7 = this.aBoolean635 ? this.aFloat198 : 0.0F;
		@Pc(23) float local23 = this.aBoolean635 ? -this.aFloat202 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local7 * this.aFloat190, local7 * this.aFloat204, this.aFloat206 * local7, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat190 * local23, this.aFloat204 * local23, local23 * this.aFloat206, 0.0F);
		this.aBoolean651 = false;
	}

	@OriginalMember(owner = "client!vg", name = "Y", descriptor = "(I)V")
	@Override
	protected void method7646() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray83);
	}

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "(I)V")
	@Override
	protected void method7582() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9580; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass257Array1[local1] = Static467.aClass257_9;
			this.aBooleanArray36[local1] = this.aBooleanArray34[local1] = true;
			this.aBooleanArray35[local1] = false;
			this.anIntArray700[local1] = 0;
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
		this.aBoolean651 = false;
		super.method7582();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BZ)Lclient!iq;")
	@Override
	public Interface8 method7562(@OriginalArg(1) boolean arg0) {
		return new Class287(this, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7613() {
		if (this.aClass30_7 == Static336.aClass30_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass30_7 == Static126.aClass30_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass30_7 == Static225.aClass30_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()Lclient!fea;")
	@Override
	public Class102 method7450() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt9592, 0);
		return new Class102(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!vg", name = "N", descriptor = "(I)V")
	@Override
	protected void method7616() {
		@Pc(19) int local19 = this.aBooleanArray33[this.anInt9579] ? Static549.method7663(this.aClass214Array3[this.anInt9579]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, 1, local19);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II[BILclient!kf;I)Lclient!k;")
	@Override
	public Interface11 method7538(@OriginalArg(2) byte[] arg0, @OriginalArg(4) Class171 arg1) {
		return new Class57_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "()V")
	@Override
	public void method7521() {
		this.method7652(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!kf;BLclient!ps;)Z")
	@Override
	public boolean method7556(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class254 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return vba.a(-1, (int) this.anIDirect3D1.a(this.anInt9592, local3)) && vba.a(-1, (int) this.anIDirect3D1.CheckDeviceFormat(this.anInt9592, this.anInt9593, local3.Format, 0, 3, Static549.method7672(arg1, arg0)));
	}

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "(B)V")
	@Override
	protected void method7625() {
		if (this.aBoolean629) {
			Static549.aFloatArray90[14] = 0.0F;
			Static549.aFloatArray90[11] = 0.0F;
			Static549.aFloatArray90[9] = 0.0F;
			Static549.aFloatArray90[12] = 0.0F;
			Static549.aFloatArray90[1] = 0.0F;
			Static549.aFloatArray90[8] = 0.0F;
			Static549.aFloatArray90[3] = 0.0F;
			Static549.aFloatArray90[4] = 0.0F;
			Static549.aFloatArray90[2] = 0.0F;
			Static549.aFloatArray90[13] = 0.0F;
			Static549.aFloatArray90[5] = 1.0F;
			Static549.aFloatArray90[7] = 0.0F;
			Static549.aFloatArray90[10] = 1.0F;
			Static549.aFloatArray90[15] = 1.0F;
			Static549.aFloatArray90[6] = 0.0F;
			Static549.aFloatArray90[0] = 1.0F;
		} else {
			this.aClass93_Sub3_15.method3758(Static549.aFloatArray90);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static549.aFloatArray90);
	}

	@OriginalMember(owner = "client!vg", name = "Z", descriptor = "(I)V")
	@Override
	protected void method7647() {
		if (this.aClass172Array3[this.anInt9579] == Static16.aClass172_1) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, 24, 0);
			this.anIntArray700[this.anInt9579] = 0;
			return;
		}
		if (this.aClass172Array3[this.anInt9579] == Static524.aClass172_8) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9579 + 16, this.aClass93_Sub3Array3[this.anInt9579].method3758(Static549.aFloatArray90));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9579 + 16, this.aClass93_Sub3Array3[this.anInt9579].method3772(Static549.aFloatArray90));
		}
		@Pc(75) int local75 = Static549.method7669(this.aClass172Array3[this.anInt9579]);
		if (this.anIntArray700[this.anInt9579] != local75) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, 24, local75);
			this.anIntArray700[this.anInt9579] = local75;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!fl;)V")
	@Override
	public void method7553(@OriginalArg(1) Class107 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method7601(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZZILclient!iv;)V")
	@Override
	protected void method7592(@OriginalArg(2) int arg0, @OriginalArg(3) Class150 arg1) {
		@Pc(18) byte local18;
		if (arg0 == 1) {
			local18 = 6;
		} else if (arg0 == 2) {
			local18 = 27;
		} else {
			local18 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9579, local18, Static549.method7670(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method7636(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas14 != arg0) {
			return;
		}
		@Pc(13) Dimension local13 = arg0.getSize();
		if (local13.width > 0 && local13.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method7666();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!vg", name = "S", descriptor = "(I)V")
	@Override
	protected void method7635() {
		this.anIDirect3DDevice1.a(137, this.aBoolean641 && !this.aBoolean646);
	}

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "(I)V")
	@Override
	protected void method7583() {
		if (this.aBooleanArray33[this.anInt9579]) {
			this.aBooleanArray33[this.anInt9579] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9579, null);
			this.method7587();
			this.method7616();
		}
	}

	@OriginalMember(owner = "client!vg", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return 0;
	}

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "(I)V")
	@Override
	protected void method7552() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9581);
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "()V")
	@Override
	public void method7469() {
	}

	@OriginalMember(owner = "client!vg", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.d(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (vba.a(-1, (int) this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1)) && vba.a(-1, (int) local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (local54 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
					this.aPixelBuffer1.b(local1, arg2 * local75, local54 * local75, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(21066);
		local16.b(21066);
		return local1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLclient!kf;IIII[F)Lclient!hr;")
	@Override
	protected Interface7 method7534(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!eh;)V")
	public void method7673(@OriginalArg(1) Class57_Sub2 arg0) {
		this.method7665(arg0);
		if (!this.aBooleanArray36[this.anInt9579]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 1, 1);
			this.aBooleanArray36[this.anInt9579] = true;
		}
		if (!this.aBooleanArray34[this.anInt9579]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9579, 2, 1);
			this.aBooleanArray34[this.anInt9579] = true;
		}
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(II)Lclient!tf;")
	@Override
	protected Class34 method7656(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class34_Sub8(this, this.aClass248_106);
		} else if (arg0 == 4) {
			return new Class34_Sub3(this, this.aClass248_106, this.aClass66_6);
		} else {
			return super.method7656(arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "(B)V")
	@Override
	protected void method7642() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9566 + this.anInt9550, this.anInt9588 - -this.anInt9571, this.anInt9555, this.anInt9567);
	}

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "()V")
	@Override
	public void method7508() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass76_1.method1463()) {
			this.anInt9591 = 0;
			if (vba.a(this.aClass76_1.method1465(), (byte) -108)) {
				this.method7666();
			}
		} else if (++this.anInt9591 <= 50) {
			this.method7666();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}
}
