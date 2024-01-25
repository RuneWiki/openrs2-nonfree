import jaclib.peer.rh;
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
import jagdx.ec;
import jagdx.rl;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class16_Sub1_Sub2 extends Class16_Sub1 {

	@OriginalMember(owner = "client!hl", name = "dh", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!hl", name = "Gg", descriptor = "I")
	private int anInt4935 = 0;

	@OriginalMember(owner = "client!hl", name = "ah", descriptor = "Z")
	private boolean aBoolean367 = false;

	@OriginalMember(owner = "client!hl", name = "Zg", descriptor = "I")
	private final int anInt4937;

	@OriginalMember(owner = "client!hl", name = "Eg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!hl", name = "fh", descriptor = "Lclient!jaclib/peer/rh;")
	public final rh aRh1;

	@OriginalMember(owner = "client!hl", name = "Yg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!hl", name = "Vg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!hl", name = "Tg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!hl", name = "Lg", descriptor = "I")
	private final int anInt4936;

	@OriginalMember(owner = "client!hl", name = "Mg", descriptor = "Lclient!kp;")
	private Class183 aClass183_1;

	@OriginalMember(owner = "client!hl", name = "bh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!hl", name = "Kg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!hl", name = "Ug", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!hl", name = "Rg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!hl", name = "Ng", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!hl", name = "Sg", descriptor = "Z")
	public final boolean aBoolean366;

	@OriginalMember(owner = "client!hl", name = "ch", descriptor = "Z")
	public final boolean aBoolean368;

	@OriginalMember(owner = "client!hl", name = "Hg", descriptor = "Z")
	public final boolean aBoolean365;

	@OriginalMember(owner = "client!hl", name = "Fg", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!hl", name = "Qg", descriptor = "[Lclient!qo;")
	private final Class277[] aClass277Array1;

	@OriginalMember(owner = "client!hl", name = "Wg", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!hl", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hl", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!hl", name = "Jg", descriptor = "[I")
	private final int[] anIntArray262;

	@OriginalMember(owner = "client!hl", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!oh;Ljava/lang/Integer;)Lclient!ha;")
	private static Class16 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class16_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) rh local9 = new rh();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(186) D3DPRESENT_PARAMETERS local186 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static208.method4014(local3, local13, local5, local186, arg3)) {
					throw new RuntimeException("");
				}
				local186.PresentationInterval = Integer.MIN_VALUE;
				local186.EnableAutoDepthStencil = true;
				local186.Windowed = true;
				@Pc(212) int local212 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local212 |= 0x10;
				}
				@Pc(236) IDirect3DDevice local236;
				try {
					local236 = local13.a(local3, local5, arg0, local212 | 0x40, local186);
				} catch (@Pc(238) rl local238) {
					local236 = local13.a(local3, local5, arg0, local212 | 0x20, local186);
				}
				@Pc(257) Class183 local257 = new Class183(local236.c(0), local236.c());
				local1 = new Class16_Sub1_Sub2(local3, local5, arg0, local9, local13, local236, local257, local186, local18, arg1, arg2, arg3);
				local1.method3979();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(280) RuntimeException local280) {
			if (local1 != null) {
				local1.method6053();
			}
			throw local280;
		}
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/rh;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!kp;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!oh;I)V")
	public Class16_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) rh arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class183 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface2 arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt4937 = arg0;
		this.anIDirect3DDevice1 = arg5;
		this.aRh1 = arg3;
		this.anIDirect3D1 = arg4;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aD3DCAPS1 = arg8;
		this.anInt4936 = arg1;
		this.aClass183_1 = arg6;
		this.aD3DLIGHT3 = new D3DLIGHT(this.aRh1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aRh1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aRh1);
		this.aPixelBuffer1 = new PixelBuffer(this.aRh1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aRh1);
		new GeometryBuffer(this.aRh1);
		this.aBoolean357 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.anInt4897 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean366 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean368 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean352 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean365 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.anInt4907 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean346 = this.anInt4929 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt4937, this.anInt4936, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray9 = new boolean[this.anInt4897];
		this.aClass277Array1 = new Class277[this.anInt4897];
		this.aBooleanArray11 = new boolean[this.anInt4897];
		this.aBooleanArray10 = new boolean[this.anInt4897];
		this.aBooleanArray12 = new boolean[this.anInt4897];
		this.anIntArray262 = new int[this.anInt4897];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)V")
	@Override
	protected void method3880() {
		if (this.aBooleanArray11[this.anInt4899]) {
			this.aBooleanArray11[this.anInt4899] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt4899, null);
			this.method3907();
			this.method3955();
		}
	}

	@OriginalMember(owner = "client!hl", name = "E", descriptor = "(B)V")
	@Override
	protected void method4006() {
		this.anIDirect3DDevice1.a(15, this.aBoolean348);
	}

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "(I)V")
	@Override
	protected void method3962() {
		this.anIDirect3DDevice1.a(28, this.aBoolean350 && this.aBoolean359 && this.anInt4903 >= 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLclient!el;I)V")
	@Override
	public void method3983(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class68 local9 = (Class68) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local9.anIDirect3DVertexBuffer1, 0, local9.method2175());
	}

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "(B)V")
	@Override
	protected void method3955() {
		@Pc(19) int local19 = this.aBooleanArray11[this.anInt4899] ? Static208.method4012(this.aClass34Array5[this.anInt4899]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, 1, local19);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZB[[I)Lclient!vq;")
	@Override
	public Interface25 method3898(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class74_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZII[BILclient!wd;II)Lclient!oq;")
	@Override
	protected Interface20 method3935(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class366 arg4) {
		return new Class74_Sub1(this, arg4, arg1, arg3, arg0, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!jm;Lclient!wd;IBI)Lclient!oq;")
	@Override
	public Interface20 method3923(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class74_Sub1(this, arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;I)V")
	public void method4008(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader2 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method3914();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLclient!jagdx/IDirect3DPixelShader;)V")
	public void method4009(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6069(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6131(arg2, arg3);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ[IIBII)Lclient!oq;")
	@Override
	public Interface20 method3928(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class74_Sub1(this, arg0, arg3, arg1, arg2, 0, arg4);
	}

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "(B)F")
	@Override
	protected float method3998() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "(I)V")
	@Override
	protected void method3914() {
		if (this.anIDirect3DVertexShader2 != null || Static42.aClass207_1 == this.aClass207Array3[this.anInt4899]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, 24, 0);
			this.anIntArray262[this.anInt4899] = 0;
			return;
		}
		if (this.aClass207Array3[this.anInt4899] == Static167.aClass207_3) {
			this.anIDirect3DDevice1.SetTransform(this.anInt4899 + 16, this.aClass54_Sub3Array3[this.anInt4899].method5146(Static208.aFloatArray53));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt4899 + 16, this.aClass54_Sub3Array3[this.anInt4899].method5154(Static208.aFloatArray53));
		}
		@Pc(57) int local57 = Static208.method4011(this.aClass207Array3[this.anInt4899]);
		if (local57 != this.anIntArray262[this.anInt4899]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, 24, local57);
			this.anIntArray262[this.anInt4899] = local57;
		}
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "()V")
	@Override
	public void method6061() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (ec.a(local3.Issue(), 2005530520)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(-31315);
	}

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lclient!iaa;")
	@Override
	public Interface8 method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "(I)V")
	@Override
	protected void method3973() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt4905 + this.anInt4901, this.anInt4923 + this.anInt4926, this.anInt4927, this.anInt4912);
	}

	@OriginalMember(owner = "client!hl", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (ec.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), 2005530520) && ec.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), 2005530520)) {
			local1 = new int[arg3 * arg2];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local54) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(61) int local61 = 0; local61 < arg3; local61++) {
					this.aPixelBuffer1.b(local1, arg2 * local61, local54 * local61, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(-31315);
		local16.a(-31315);
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!ffa;)V")
	@Override
	public void method3893(@OriginalArg(1) Class100 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static622.aClass100_36) {
			local1 = 65536;
		} else if (Static457.aClass100_27 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static550.aClass100_35) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, 11, this.anInt4899 | local1);
	}

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method6119(@OriginalArg(0) int arg0) {
		this.aRh1.a(9234);
		super.method6119(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!kv;Lclient!iaa;)Lclient!jj;")
	@Override
	public Interface11 method6125(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "(Z)V")
	@Override
	protected void method3974() {
		this.anIDirect3DDevice1.a(14, this.aBoolean361 && this.aBoolean354);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "(Z)V")
	@Override
	protected void method3968() {
		if (this.aBoolean367) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean367 = true;
	}

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "(B)V")
	@Override
	protected void method3932() {
		if (this.aClass283_3.method7040()) {
			this.aClass54_Sub3_18.method5146(Static208.aFloatArray53);
		} else {
			Static208.aFloatArray53[15] = 1.0F;
			Static208.aFloatArray53[4] = 0.0F;
			Static208.aFloatArray53[5] = 1.0F;
			Static208.aFloatArray53[12] = 0.0F;
			Static208.aFloatArray53[14] = 0.0F;
			Static208.aFloatArray53[11] = 0.0F;
			Static208.aFloatArray53[6] = 0.0F;
			Static208.aFloatArray53[8] = 0.0F;
			Static208.aFloatArray53[10] = 1.0F;
			Static208.aFloatArray53[7] = 0.0F;
			Static208.aFloatArray53[0] = 1.0F;
			Static208.aFloatArray53[3] = 0.0F;
			Static208.aFloatArray53[13] = 0.0F;
			Static208.aFloatArray53[2] = 0.0F;
			Static208.aFloatArray53[1] = 0.0F;
			Static208.aFloatArray53[9] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static208.aFloatArray53);
	}

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "()Z")
	@Override
	public boolean method6133() {
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(II)Lclient!kv;")
	@Override
	public Interface14 method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZZILclient!pt;)V")
	@Override
	public void method4000(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class265 arg3) {
		@Pc(10) byte local10;
		if (arg2 == 1) {
			local10 = 3;
		} else if (arg2 == 2) {
			local10 = 26;
		} else {
			local10 = 2;
		}
		@Pc(24) int local24 = 0;
		if (arg1) {
			local24 = 32;
		}
		if (arg0) {
			local24 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, local10, local24 | Static208.method4017(arg3));
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!f;)V")
	@Override
	public void method3967(@OriginalArg(1) Class94 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "(I)V")
	@Override
	protected void method3984() {
		this.anIDirect3DDevice1.a(7, this.aBoolean360);
	}

	@OriginalMember(owner = "client!hl", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method3916(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!jj;)V")
	@Override
	public void method6078(@OriginalArg(0) Interface11 arg0) {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method3952(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass183_1 = (Class183) arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BILclient!wd;III)Lclient!ak;")
	@Override
	public Interface1 method3912(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class366 arg1) {
		return new Class74_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!pt;ZII)V")
	@Override
	protected void method3953(@OriginalArg(0) Class265 arg0, @OriginalArg(3) int arg1) {
		@Pc(15) byte local15;
		if (arg1 == 1) {
			local15 = 6;
		} else if (arg1 == 2) {
			local15 = 27;
		} else {
			local15 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, local15, Static208.method4017(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!km;Lclient!km;FLclient!km;)Lclient!km;")
	@Override
	public Class40 method6067(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class40 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[FLclient!wd;IBZII)Lclient!oq;")
	@Override
	protected Interface20 method3978(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class366 arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "()V")
	@Override
	public void method6081() {
	}

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "(B)V")
	@Override
	protected void method3911() {
		this.anIDirect3DDevice1.a(137, this.aBoolean358 && !this.aBoolean356);
	}

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "()V")
	@Override
	public void method6095() {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILclient!uh;)V")
	@Override
	public void method3891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class342 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static208.method4010(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "()V")
	@Override
	public void method6075() {
	}

	@OriginalMember(owner = "client!hl", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
	@Override
	protected void method6053() {
		this.aRh1.a(true);
		super.method6053();
	}

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "(II)V")
	@Override
	public void method3934(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, 11, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!sba;)V")
	public void method4013(@OriginalArg(1) Class74_Sub2 arg0) {
		this.method4020(arg0);
		if (!this.aBooleanArray9[this.anInt4899]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 1, 1);
			this.aBooleanArray9[this.anInt4899] = true;
		}
		if (!this.aBooleanArray10[this.anInt4899]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 2, 1);
			this.aBooleanArray10[this.anInt4899] = true;
		}
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V")
	@Override
	protected void method3882() {
		this.anIDirect3DDevice1.SetViewport(this.anInt4905, this.anInt4923, this.anInt4765, this.anInt4732, 0.0F, (float) 1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method3993(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([Lclient!tg;I)Lclient!f;")
	@Override
	public Class94 method3994(@OriginalArg(0) Class325[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(II)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass183_1.method4845()) {
			this.anInt4935 = 0;
			if (ec.b(this.aClass183_1.method4846(), -15560)) {
				this.method4016();
			}
		} else if (++this.anInt4935 <= 50) {
			this.method4016();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!dk;)V")
	public void method4015(@OriginalArg(1) Class74_Sub1 arg0) {
		this.method4020(arg0);
		if (arg0.aBoolean206 != this.aBooleanArray9[this.anInt4899]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 1, arg0.aBoolean206 ? 1 : 3);
			this.aBooleanArray9[this.anInt4899] = arg0.aBoolean206;
		}
		if (arg0.aBoolean205 != this.aBooleanArray10[this.anInt4899]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 2, arg0.aBoolean205 ? 1 : 3);
			this.aBooleanArray10[this.anInt4899] = arg0.aBoolean205;
		}
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)V")
	@Override
	protected void method3879() {
		this.method3971();
		this.method3968();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method3881(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "(B)V")
	@Override
	protected void method3987() {
		this.anIDirect3DDevice1.a(174, this.aBoolean364);
	}

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "(B)V")
	@Override
	protected void method3929() {
		if (Static364.aClass211_7 == this.aClass211_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static74.aClass211_3 == this.aClass211_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static204.aClass211_4 == this.aClass211_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!hl", name = "E", descriptor = "(I)V")
	@Override
	protected void method3959() {
		this.anIDirect3DDevice1.a(27, this.aBoolean345);
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(ZI)Lclient!el;")
	@Override
	public Interface4 method3988(@OriginalArg(0) boolean arg0) {
		return new Class68(this, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "(I)V")
	@Override
	protected void method3902() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4897; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass277Array1[local1] = Static579.aClass277_10;
			this.aBooleanArray9[local1] = this.aBooleanArray10[local1] = true;
			this.aBooleanArray12[local1] = false;
			this.anIntArray262[local1] = 0;
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
		this.aBoolean367 = false;
		super.method3902();
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IZ)V")
	@Override
	public void method3919(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "(Z)Z")
	private boolean method4016() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(22) Class183 local22 = (Class183) this.anObject13;
			this.method3896();
			local22.method4847();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static208.method4014(this.anInt4937, this.anIDirect3D1, this.anInt4936, this.aD3DPRESENT_PARAMETERS1, this.anInt4929)) {
				@Pc(55) int local55 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (ec.a(local55, 2005530520)) {
					local22.method4844(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.c());
					this.method3936();
					this.method3902();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)V")
	@Override
	protected void method3883() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray50);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(ZI)Lclient!kga;")
	@Override
	public Interface13 method3917(@OriginalArg(0) boolean arg0) {
		return new Class169(this, Static258.aClass160_10, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(Z)V")
	@Override
	protected void method3909() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4895; local1++) {
			@Pc(20) Class8_Sub1 local20 = this.aClass8_Sub1Array4[local1];
			@Pc(24) int local24 = local1 + 2;
			@Pc(28) int local28 = local20.method5203();
			@Pc(34) float local34 = local20.method5205() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local20.method5206(), (float) local20.method5198(), (float) local20.method5207());
			this.aD3DLIGHT2.SetDiffuse(local34 * (float) (local28 >> 16 & 0xFF), local34 * (float) (local28 >> 8 & 0xFF), local34 * (float) (local28 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local20.method5200() * local20.method5200()));
			this.aD3DLIGHT2.SetRange((float) local20.method5200());
			this.anIDirect3DDevice1.SetLight(local24, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local24, true);
		}
		while (local1 < this.anInt4913) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method3909();
	}

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "()V")
	@Override
	public void method6128() {
	}

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "(I)V")
	@Override
	public void method3999() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray45[0], -this.aFloatArray45[1], -this.aFloatArray45[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray49[0], -this.aFloatArray49[1], -this.aFloatArray49[2]);
		this.aBoolean367 = false;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method3901(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas8) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method4016();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	@Override
	public void method6071(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "()Z")
	@Override
	public boolean method6079() {
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "(I)V")
	@Override
	protected void method3964() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt4930);
	}

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "(I)V")
	@Override
	protected void method3907() {
		@Pc(23) int local23 = this.aBooleanArray11[this.anInt4899] ? Static208.method4012(this.aClass34Array6[this.anInt4899]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4899, 4, local23);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!uh;ILclient!kga;IIII)V")
	@Override
	public void method3977(@OriginalArg(0) Class342 arg0, @OriginalArg(2) Interface13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class169) arg1).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static208.method4010(arg0), 0, arg2, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "(Z)V")
	@Override
	protected void method3960() {
		if (this.aBoolean343) {
			Static208.aFloatArray53[2] = 0.0F;
			Static208.aFloatArray53[0] = 1.0F;
			Static208.aFloatArray53[7] = 0.0F;
			Static208.aFloatArray53[13] = 0.0F;
			Static208.aFloatArray53[12] = 0.0F;
			Static208.aFloatArray53[5] = 1.0F;
			Static208.aFloatArray53[9] = 0.0F;
			Static208.aFloatArray53[3] = 0.0F;
			Static208.aFloatArray53[1] = 0.0F;
			Static208.aFloatArray53[10] = 1.0F;
			Static208.aFloatArray53[4] = 0.0F;
			Static208.aFloatArray53[15] = 1.0F;
			Static208.aFloatArray53[8] = 0.0F;
			Static208.aFloatArray53[11] = 0.0F;
			Static208.aFloatArray53[6] = 0.0F;
			Static208.aFloatArray53[14] = 0.0F;
		} else {
			this.aClass54_Sub3_15.method5146(Static208.aFloatArray53);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static208.aFloatArray53);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!mca;B)V")
	public void method4020(@OriginalArg(0) Class74 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt4899, arg0.method8279());
		if (arg0.aClass277_11 != this.aClass277Array1[this.anInt4899]) {
			@Pc(21) int local21 = Static208.method4019(arg0.aClass277_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 5, local21);
			this.aClass277Array1[this.anInt4899] = arg0.aClass277_11;
			if (arg0.aBoolean736 != this.aBooleanArray12[this.anInt4899]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 7, arg0.aBoolean736 ? Static208.method4019(arg0.aClass277_11) : 0);
				this.aBooleanArray12[this.anInt4899] = arg0.aBoolean736;
			}
		} else if (this.aBooleanArray12[this.anInt4899] != arg0.aBoolean736) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4899, 7, arg0.aBoolean736 ? Static208.method4019(arg0.aClass277_11) : 0);
			this.aBooleanArray12[this.anInt4899] = arg0.aBoolean736;
		}
		if (!this.aBooleanArray11[this.anInt4899]) {
			this.aBooleanArray11[this.anInt4899] = true;
			this.method3907();
			this.method3955();
		}
	}

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "(B)V")
	@Override
	protected void method3892() {
		this.aFloat88 = this.anInt4906 - this.anInt4922;
		this.aFloat96 = (float) -this.anInt4903 + this.aFloat88;
		if ((float) this.anInt4931 > this.aFloat96) {
			this.aFloat96 = this.anInt4931;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat96);
		this.anIDirect3DDevice1.a(37, this.aFloat88);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt4915);
	}

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "(I)V")
	@Override
	protected void method3941() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat85 * this.aFloat93, this.aFloat93 * this.aFloat82, this.aFloat93 * this.aFloat86, (float) 0);
		this.aBoolean367 = false;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "(Z)V")
	@Override
	protected void method3971() {
		@Pc(7) float local7 = this.aBoolean362 ? this.aFloat89 : 0.0F;
		@Pc(24) float local24 = this.aBoolean362 ? -this.aFloat90 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(this.aFloat85 * local7, local7 * this.aFloat82, this.aFloat86 * local7, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat85 * local24, this.aFloat82 * local24, this.aFloat86 * local24, 0.0F);
		this.aBoolean367 = false;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!wd;ILclient!jm;)Z")
	@Override
	public boolean method3995(@OriginalArg(0) Class366 arg0, @OriginalArg(2) Class160 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return ec.a(this.anIDirect3D1.a(this.anInt4937, local11), 2005530520) && ec.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt4937, this.anInt4936, local11.Format, 0, 4, Static208.method4018(arg0, arg1)), 2005530520);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!wd;Lclient!jm;Z)Z")
	@Override
	public boolean method3874(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class160 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return ec.a(this.anIDirect3D1.a(this.anInt4937, local10), 2005530520) && ec.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt4937, this.anInt4936, local10.Format, 0, 3, Static208.method4018(arg0, arg1)), 2005530520);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(Z)V")
	@Override
	protected void method3877() {
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(II)Lclient!ah;")
	@Override
	protected Class11 method3878(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class11_Sub10(this, this.aClass237_58);
		} else if (arg0 == 4) {
			return new Class11_Sub8(this, this.aClass237_58, this.aClass376_5);
		} else if (arg0 == 8) {
			return new Class11_Sub2(this, this.aClass237_58, this.aClass376_5);
		} else {
			return super.method3878(arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "()Lclient!oba;")
	@Override
	public Class234 method6103() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt4937, 0);
		return new Class234(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}
}
