import jaclib.peer.fl;
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
import jagdx.ae;
import jagdx.at;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class78_Sub1_Sub1 extends Class78_Sub1 {

	@OriginalMember(owner = "client!ega", name = "Jg", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!ega", name = "Ag", descriptor = "I")
	private int anInt2449 = 0;

	@OriginalMember(owner = "client!ega", name = "Hg", descriptor = "I")
	private final int anInt2451;

	@OriginalMember(owner = "client!ega", name = "Kg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!ega", name = "Ig", descriptor = "Lclient!dea;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!ega", name = "Mg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!ega", name = "zg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!ega", name = "Tg", descriptor = "Lclient!jaclib/peer/fl;")
	public final fl aFl1;

	@OriginalMember(owner = "client!ega", name = "Pg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!ega", name = "Fg", descriptor = "I")
	private final int anInt2450;

	@OriginalMember(owner = "client!ega", name = "Ng", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!ega", name = "tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!ega", name = "Eg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!ega", name = "Qg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!ega", name = "Sg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!ega", name = "wg", descriptor = "Z")
	public final boolean aBoolean180;

	@OriginalMember(owner = "client!ega", name = "ug", descriptor = "Z")
	public final boolean aBoolean179;

	@OriginalMember(owner = "client!ega", name = "Cg", descriptor = "Z")
	public final boolean aBoolean181;

	@OriginalMember(owner = "client!ega", name = "vg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!ega", name = "Dg", descriptor = "[Lclient!dca;")
	private final Class54[] aClass54Array1;

	@OriginalMember(owner = "client!ega", name = "yg", descriptor = "[I")
	private final int[] anIntArray91;

	@OriginalMember(owner = "client!ega", name = "Bg", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!ega", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ega", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ega", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!sea;Ljava/lang/Integer;)Lclient!r;")
	private static Class78 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class78_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) fl local9 = new fl();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(180) D3DPRESENT_PARAMETERS local180 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static117.method2131(local13, local180, arg3, local3, local5)) {
					throw new RuntimeException("");
				}
				local180.PresentationInterval = Integer.MIN_VALUE;
				local180.Windowed = true;
				local180.EnableAutoDepthStencil = true;
				@Pc(206) int local206 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local206 |= 0x10;
				}
				@Pc(231) IDirect3DDevice local231;
				try {
					local231 = local13.a(local3, local5, arg0, local206 | 0x40, local180);
				} catch (@Pc(233) at local233) {
					local231 = local13.a(local3, local5, arg0, local206 | 0x20, local180);
				}
				@Pc(252) Class58 local252 = new Class58(local231.d(0), local231.c());
				local1 = new Class78_Sub1_Sub1(local3, local5, arg0, local9, local13, local231, local252, local180, local18, arg1, arg2, arg3);
				local1.method6872();
				return local1;
			}
		} catch (@Pc(275) RuntimeException local275) {
			if (local1 != null) {
				local1.method6789();
			}
			throw local275;
		}
	}

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/fl;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!dea;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!sea;I)V")
	public Class78_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) fl arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class58 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface9 arg9, @OriginalArg(10) Class308 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt2451 = arg0;
		this.aD3DCAPS1 = arg8;
		this.aClass58_1 = arg6;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anIDirect3DDevice1 = arg5;
		this.aFl1 = arg3;
		this.anIDirect3D1 = arg4;
		this.anInt2450 = arg1;
		this.aD3DLIGHT3 = new D3DLIGHT(this.aFl1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aFl1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aFl1);
		this.aPixelBuffer1 = new PixelBuffer(this.aFl1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aFl1);
		new GeometryBuffer(this.aFl1);
		this.aBoolean180 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean179 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean639 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.anInt8584 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.anInt8578 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean635 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean181 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean628 = this.anInt8577 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt2451, this.anInt2450, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray8 = new boolean[this.anInt8584];
		this.aClass54Array1 = new Class54[this.anInt8584];
		this.anIntArray91 = new int[this.anInt8584];
		this.aBooleanArray9 = new boolean[this.anInt8584];
		this.aBooleanArray10 = new boolean[this.anInt8584];
		this.aBooleanArray11 = new boolean[this.anInt8584];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6901(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, 11, arg0);
	}

	@OriginalMember(owner = "client!ega", name = "W", descriptor = "(I)V")
	@Override
	protected void method6958() {
		@Pc(11) float local11 = this.aBoolean640 ? this.aFloat219 : 0.0F;
		@Pc(20) float local20 = this.aBoolean640 ? -this.aFloat225 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(this.aFloat215 * local11, local11 * this.aFloat220, local11 * this.aFloat214, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat215 * local20, this.aFloat220 * local20, this.aFloat214 * local20, 0.0F);
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!eu;I)V")
	public void method2128(@OriginalArg(0) Class88_Sub1 arg0) {
		this.method2130(arg0);
		if (!this.aBooleanArray10[this.anInt8573]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 1, 1);
			this.aBooleanArray10[this.anInt8573] = true;
		}
		if (!this.aBooleanArray11[this.anInt8573]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 2, 1);
			this.aBooleanArray11[this.anInt8573] = true;
		}
	}

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "(I)V")
	@Override
	protected void method6859() {
		@Pc(22) int local22 = this.aBooleanArray8[this.anInt8573] ? Static117.method2134(this.aClass118Array6[this.anInt8573]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, 4, local22);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II[BILclient!pn;I)Lclient!tea;")
	@Override
	public Interface21 method6972(@OriginalArg(2) byte[] arg0, @OriginalArg(4) Class271 arg1) {
		return new Class88_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!eg;II)V")
	@Override
	public void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static117.method2133(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!hw;IIZ)V")
	@Override
	protected void method6934(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 6;
		} else if (arg1 == 2) {
			local12 = 27;
		} else {
			local12 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, local12, Static117.method2135(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!ega", name = "t", descriptor = "(I)V")
	@Override
	protected void method6880() {
		this.anIDirect3DDevice1.a(7, this.aBoolean630);
	}

	@OriginalMember(owner = "client!ega", name = "u", descriptor = "()Lclient!ho;")
	@Override
	public Class141 method6841() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt2451, 0);
		return new Class141(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!jg;Lclient!pn;I)Z")
	@Override
	public boolean method6869(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class271 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return ae.a((byte) -110, this.anIDirect3D1.a(this.anInt2451, local11)) && ae.a((byte) -127, this.anIDirect3D1.CheckDeviceFormat(this.anInt2451, this.anInt2450, local11.Format, 0, 3, Static117.method2129(arg1, arg0)));
	}

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "()V")
	@Override
	public void method6813() {
	}

	@OriginalMember(owner = "client!ega", name = "D", descriptor = "(I)V")
	@Override
	protected void method6906() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray69);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z[IIIIII)Lclient!cm;")
	@Override
	public Interface5 method6986(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class88_Sub2(this, arg2, arg5, arg0, arg1, 0, arg3);
	}

	@OriginalMember(owner = "client!ega", name = "u", descriptor = "(I)V")
	@Override
	protected void method6882() {
		this.aFloat217 = this.anInt8583 - this.anInt8585;
		this.aFloat223 = (float) -this.anInt8565 + this.aFloat217;
		if ((float) this.anInt8591 > this.aFloat223) {
			this.aFloat223 = this.anInt8591;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat223);
		this.anIDirect3DDevice1.a(37, this.aFloat217);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8566);
	}

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "(B)V")
	@Override
	protected void method6945() {
		if (this.aClass4_6 == Static235.aClass4_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass4_6 == Static526.aClass4_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static148.aClass4_3 == this.aClass4_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method2130(@OriginalArg(0) Class88 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8573, arg0.method5851());
		if (this.aClass54Array1[this.anInt8573] != arg0.aClass54_9) {
			@Pc(26) int local26 = Static117.method2136(arg0.aClass54_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 6, local26);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 5, local26);
			this.aClass54Array1[this.anInt8573] = arg0.aClass54_9;
			if (this.aBooleanArray9[this.anInt8573] != arg0.aBoolean556) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 7, arg0.aBoolean556 ? Static117.method2136(arg0.aClass54_9) : 0);
				this.aBooleanArray9[this.anInt8573] = arg0.aBoolean556;
			}
		} else if (this.aBooleanArray9[this.anInt8573] != arg0.aBoolean556) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 7, arg0.aBoolean556 ? Static117.method2136(arg0.aClass54_9) : 0);
			this.aBooleanArray9[this.anInt8573] = arg0.aBoolean556;
		}
		if (!this.aBooleanArray8[this.anInt8573]) {
			this.aBooleanArray8[this.anInt8573] = true;
			this.method6859();
			this.method6868();
		}
	}

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "(B)V")
	@Override
	protected void method6910() {
		this.anIDirect3DDevice1.a(137, this.aBoolean632 && !this.aBoolean626);
	}

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "(II)Lclient!cc;")
	@Override
	protected Class2 method6926(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class2_Sub8(this, this.aClass308_167);
		} else if (arg0 == 4) {
			return new Class2_Sub2(this, this.aClass308_167, this.aClass315_7);
		} else if (arg0 == 8) {
			return new Class2_Sub6(this, this.aClass308_167, this.aClass315_7);
		} else {
			return super.method6926(arg0);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6821(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6820();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BLclient!pn;ILclient!jg;I)Lclient!cm;")
	@Override
	public Interface5 method6885(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) int arg3) {
		return new Class88_Sub2(this, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ega", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6953(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(Lclient!jg;Lclient!pn;I)Z")
	@Override
	public boolean method6875(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class271 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return ae.a((byte) 9, this.anIDirect3D1.a(this.anInt2451, local10)) && ae.a((byte) -118, this.anIDirect3D1.CheckDeviceFormat(this.anInt2451, this.anInt2450, local10.Format, 0, 4, Static117.method2129(arg1, arg0)));
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!eg;IIIILclient!jea;B)V")
	@Override
	public void method6947(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface13 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class264) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static117.method2133(arg0), 0, arg2, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method6862(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZLclient!ou;)V")
	@Override
	public void method6887(@OriginalArg(1) Class260 arg0) {
		@Pc(7) int local7 = 0;
		if (Static104.aClass260_1 == arg0) {
			local7 = 65536;
		} else if (Static361.aClass260_3 == arg0) {
			local7 = 131072;
		} else if (arg0 == Static228.aClass260_2) {
			local7 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, 11, this.anInt8573 | local7);
	}

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "(I)V")
	@Override
	protected void method6866() {
		this.anIDirect3DDevice1.a(15, this.aBoolean636);
	}

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "(B)V")
	@Override
	protected void method6954() {
		this.anIDirect3DDevice1.a(27, this.aBoolean638);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!wn;Lclient!wn;FLclient!wn;)Lclient!wn;")
	@Override
	public Class209 method6811(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class209 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6827(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6897(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas12 != arg1) {
			return;
		}
		@Pc(6) Dimension local6 = arg1.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method2132();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "(B)V")
	@Override
	protected void method6898() {
		this.anIDirect3DDevice1.a(174, this.aBoolean644);
	}

	@OriginalMember(owner = "client!ega", name = "Q", descriptor = "(I)V")
	@Override
	protected void method6942() {
		this.anIDirect3DDevice1.a(28, this.aBoolean637 && this.aBoolean624 && this.anInt8565 >= 0);
	}

	@OriginalMember(owner = "client!ega", name = "jb", descriptor = "(I)Z")
	private boolean method2132() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(15) Class58 local15 = (Class58) this.anObject24;
			this.method6932();
			local15.method1366();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static117.method2131(this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1, this.anInt8577, this.anInt2451, this.anInt2450)) {
				@Pc(50) int local50 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (ae.a((byte) -123, local50)) {
					local15.method1368(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.d(0));
					this.method6881();
					this.method6890();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ega", name = "x", descriptor = "(I)V")
	@Override
	protected void method6890() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8584; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass54Array1[local1] = Static299.aClass54_6;
			this.aBooleanArray10[local1] = this.aBooleanArray11[local1] = true;
			this.aBooleanArray9[local1] = false;
			this.anIntArray91[local1] = 0;
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
		this.aBoolean182 = false;
		super.method6890();
	}

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "(B)V")
	@Override
	protected void method6886() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8596 + this.anInt8594, this.anInt8586 + this.anInt8572, this.anInt8576, this.anInt8570);
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6940(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!ega", name = "Z", descriptor = "(I)V")
	@Override
	protected void method6963() {
		if (Static21.aClass316_1 == this.aClass316Array3[this.anInt8573]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, 24, 0);
			this.anIntArray91[this.anInt8573] = 0;
			return;
		}
		if (Static34.aClass316_2 == this.aClass316Array3[this.anInt8573]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8573 + 16, this.aClass34_Sub1Array3[this.anInt8573].method903(Static117.aFloatArray29));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8573 + 16, this.aClass34_Sub1Array3[this.anInt8573].method909(Static117.aFloatArray29));
		}
		@Pc(76) int local76 = Static117.method2138(this.aClass316Array3[this.anInt8573]);
		if (local76 != this.anIntArray91[this.anInt8573]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, 24, local76);
			this.anIntArray91[this.anInt8573] = local76;
		}
	}

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "(I)V")
	@Override
	protected void method6868() {
		@Pc(25) int local25 = this.aBooleanArray8[this.anInt8573] ? Static117.method2134(this.aClass118Array5[this.anInt8573]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, 1, local25);
	}

	@OriginalMember(owner = "client!ega", name = "B", descriptor = "(I)V")
	@Override
	protected void method6896() {
		if (this.aBoolean623) {
			Static117.aFloatArray29[7] = 0.0F;
			Static117.aFloatArray29[4] = 0.0F;
			Static117.aFloatArray29[8] = 0.0F;
			Static117.aFloatArray29[15] = 1.0F;
			Static117.aFloatArray29[14] = 0.0F;
			Static117.aFloatArray29[13] = 0.0F;
			Static117.aFloatArray29[5] = 1.0F;
			Static117.aFloatArray29[9] = 0.0F;
			Static117.aFloatArray29[10] = 1.0F;
			Static117.aFloatArray29[6] = 0.0F;
			Static117.aFloatArray29[1] = 0.0F;
			Static117.aFloatArray29[3] = 0.0F;
			Static117.aFloatArray29[12] = 0.0F;
			Static117.aFloatArray29[0] = 1.0F;
			Static117.aFloatArray29[2] = 0.0F;
			Static117.aFloatArray29[11] = 0.0F;
		} else {
			this.aClass34_Sub1_15.method903(Static117.aFloatArray29);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static117.aFloatArray29);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
	@Override
	protected void method6860() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8587);
	}

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6799(@OriginalArg(0) int arg0) {
		this.aFl1.b(942);
		super.method6799(arg0);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ega", name = "q", descriptor = "(B)V")
	@Override
	protected void method6968() {
		if (this.aClass322_5.method7149()) {
			this.aClass34_Sub1_18.method903(Static117.aFloatArray29);
		} else {
			Static117.aFloatArray29[1] = 0.0F;
			Static117.aFloatArray29[10] = 1.0F;
			Static117.aFloatArray29[14] = 0.0F;
			Static117.aFloatArray29[6] = 0.0F;
			Static117.aFloatArray29[0] = 1.0F;
			Static117.aFloatArray29[15] = 1.0F;
			Static117.aFloatArray29[2] = 0.0F;
			Static117.aFloatArray29[4] = 0.0F;
			Static117.aFloatArray29[11] = 0.0F;
			Static117.aFloatArray29[13] = 0.0F;
			Static117.aFloatArray29[12] = 0.0F;
			Static117.aFloatArray29[7] = 0.0F;
			Static117.aFloatArray29[8] = 0.0F;
			Static117.aFloatArray29[9] = 0.0F;
			Static117.aFloatArray29[3] = 0.0F;
			Static117.aFloatArray29[5] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static117.aFloatArray29);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!si;)V")
	@Override
	public void method6941(@OriginalArg(1) Class185 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!ega", name = "C", descriptor = "()Z")
	@Override
	public boolean method6854() {
		return false;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BLclient!pn;IZII[BI)Lclient!cm;")
	@Override
	protected Interface5 method6908(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		return new Class88_Sub2(this, arg0, arg1, arg3, arg2, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!ega", name = "H", descriptor = "(I)V")
	@Override
	protected void method6919() {
		if (this.aBooleanArray8[this.anInt8573]) {
			this.aBooleanArray8[this.anInt8573] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8573, null);
			this.method6859();
			this.method6868();
		}
	}

	@OriginalMember(owner = "client!ega", name = "s", descriptor = "()V")
	@Override
	public void method6834() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (ae.a((byte) 54, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(-8);
	}

	@OriginalMember(owner = "client!ega", name = "x", descriptor = "()V")
	@Override
	public void method6844() {
	}

	@OriginalMember(owner = "client!ega", name = "V", descriptor = "(I)V")
	@Override
	protected void method6956() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat213 * this.aFloat215, this.aFloat213 * this.aFloat220, this.aFloat213 * this.aFloat214, 0.0F);
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "()V")
	@Override
	public void method6820() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass58_1.method1369()) {
			this.anInt2449 = 0;
			if (ae.a(2005530584, this.aClass58_1.method1367())) {
				this.method2132();
			}
		} else if (++this.anInt2449 <= 50) {
			this.method2132();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!ega", name = "hb", descriptor = "(I)V")
	@Override
	protected void method6985() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt8582; local7++) {
			@Pc(16) Class1_Sub24 local16 = this.aClass1_Sub24Array5[local7];
			@Pc(20) int local20 = local7 + 2;
			@Pc(24) int local24 = local16.method7613();
			@Pc(30) float local30 = local16.method7615() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local16.method7609(), (float) local16.method7612(), (float) local16.method7608());
			this.aD3DLIGHT2.SetDiffuse(local30 * (float) (local24 >> 16 & 0xFF), local30 * (float) (local24 >> 8 & 0xFF), (float) (local24 & 0xFF) * local30, 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local16.method7610() * local16.method7610()));
			this.aD3DLIGHT2.SetRange((float) local16.method7610());
			this.anIDirect3DDevice1.SetLight(local20, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local20, true);
		}
		while (local7 < this.anInt8559) {
			this.anIDirect3DDevice1.LightEnable(local7 + 2, false);
			local7++;
		}
		super.method6985();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method6921(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass58_1 = (Class58) arg1;
	}

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "(Z)V")
	@Override
	protected void method6929() {
		this.anIDirect3DDevice1.a(14, this.aBoolean631 && this.aBoolean629);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z[[III)Lclient!hea;")
	@Override
	public Interface11 method6935(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class88_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "(I)V")
	@Override
	protected void method6856() {
	}

	@OriginalMember(owner = "client!ega", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "(B)V")
	@Override
	protected void method6962() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8594, this.anInt8586, this.anInt8491, this.anInt8451, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "(ZI)Lclient!jea;")
	@Override
	public Interface13 method6980(@OriginalArg(0) boolean arg0) {
		return new Class264(this, Static243.aClass172_10, arg0);
	}

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "()Z")
	@Override
	public boolean method6802() {
		return false;
	}

	@OriginalMember(owner = "client!ega", name = "G", descriptor = "(I)V")
	@Override
	protected void method6915() {
		this.method6958();
		this.method6933();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!vc;BI)V")
	@Override
	public void method6965(@OriginalArg(0) Interface23 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class176 local2 = (Class176) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method3636());
	}

	@OriginalMember(owner = "client!ega", name = "U", descriptor = "(I)V")
	@Override
	public void method6955() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray72[0], -this.aFloatArray72[1], -this.aFloatArray72[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray74[0], -this.aFloatArray74[1], -this.aFloatArray74[2]);
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZIZLclient!hw;I)V")
	@Override
	public void method6959(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class148 arg3) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 3;
		} else if (arg1 == 2) {
			local12 = 26;
		} else {
			local12 = 2;
		}
		@Pc(20) int local20 = 0;
		if (arg2) {
			local20 = 32;
		}
		if (arg0) {
			local20 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8573, local12, local20 | Static117.method2135(arg3));
	}

	@OriginalMember(owner = "client!ega", name = "N", descriptor = "(I)V")
	@Override
	protected void method6933() {
		if (this.aBoolean182) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean182 = true;
	}

	@OriginalMember(owner = "client!ega", name = "z", descriptor = "()V")
	@Override
	public void method6846() {
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!md;Z)V")
	public void method2137(@OriginalArg(0) Class88_Sub2 arg0) {
		this.method2130(arg0);
		if (this.aBooleanArray10[this.anInt8573] != arg0.aBoolean453) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 1, arg0.aBoolean453 ? 1 : 3);
			this.aBooleanArray10[this.anInt8573] = arg0.aBoolean453;
		}
		if (arg0.aBoolean452 != this.aBooleanArray11[this.anInt8573]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8573, 2, arg0.aBoolean452 ? 1 : 3);
			this.aBooleanArray11[this.anInt8573] = arg0.aBoolean452;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6889(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(Z)V")
	@Override
	public void method6852(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ega", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(ZI)Lclient!vc;")
	@Override
	public Interface23 method6927(@OriginalArg(0) boolean arg0) {
		return new Class176(this, arg0);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZI[FIIILclient!pn;)Lclient!cm;")
	@Override
	protected Interface5 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(7) Class271 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([Lclient!th;B)Lclient!si;")
	@Override
	public Class185 method6938(@OriginalArg(0) Class318[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (ae.a((byte) -108, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && ae.a((byte) -106, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local55) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(66) int local66 = 0; local66 < arg3; local66++) {
					this.aPixelBuffer1.b(local1, arg2 * local66, local66 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(-3);
		local16.b(115);
		return local1;
	}

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "()V")
	@Override
	public void method6809() {
	}

	@OriginalMember(owner = "client!ega", name = "X", descriptor = "(I)F")
	@Override
	protected float method6960() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "()V")
	@Override
	protected void method6789() {
		this.aFl1.a(false);
		super.method6789();
	}
}
