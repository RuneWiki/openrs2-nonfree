import jaclib.peer.uca;
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
import jagdx.iba;
import jagdx.raa;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class126_Sub2_Sub2 extends Class126_Sub2 {

	@OriginalMember(owner = "client!mh", name = "eh", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!mh", name = "Tg", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!mh", name = "Jg", descriptor = "I")
	private int anInt6292 = 0;

	@OriginalMember(owner = "client!mh", name = "Hg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!mh", name = "Vg", descriptor = "I")
	private final int anInt6293;

	@OriginalMember(owner = "client!mh", name = "Qg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!mh", name = "ch", descriptor = "Lclient!jia;")
	private Class172 aClass172_1;

	@OriginalMember(owner = "client!mh", name = "Og", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!mh", name = "Gg", descriptor = "Lclient!jaclib/peer/uca;")
	public final uca anUca1;

	@OriginalMember(owner = "client!mh", name = "dh", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!mh", name = "ah", descriptor = "I")
	private final int anInt6294;

	@OriginalMember(owner = "client!mh", name = "Zg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!mh", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!mh", name = "Wg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!mh", name = "Ig", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!mh", name = "Ng", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!mh", name = "Mg", descriptor = "Z")
	public final boolean aBoolean525;

	@OriginalMember(owner = "client!mh", name = "Rg", descriptor = "Z")
	public final boolean aBoolean526;

	@OriginalMember(owner = "client!mh", name = "Yg", descriptor = "Z")
	public final boolean aBoolean528;

	@OriginalMember(owner = "client!mh", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray40;

	@OriginalMember(owner = "client!mh", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!mh", name = "hh", descriptor = "[I")
	private final int[] anIntArray487;

	@OriginalMember(owner = "client!mh", name = "fh", descriptor = "[Z")
	private final boolean[] aBooleanArray41;

	@OriginalMember(owner = "client!mh", name = "Sg", descriptor = "[Lclient!kha;")
	private final Class189[] aClass189Array1;

	@OriginalMember(owner = "client!mh", name = "Kg", descriptor = "[Z")
	private final boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!mh", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!wu;Ljava/lang/Integer;)Lclient!ha;")
	private static Class126 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class126_Sub2_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) uca local9 = new uca();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(179) D3DPRESENT_PARAMETERS local179 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static351.method5576(arg3, local5, local179, local13, local3)) {
					throw new RuntimeException("");
				}
				local179.Windowed = true;
				local179.PresentationInterval = Integer.MIN_VALUE;
				local179.EnableAutoDepthStencil = true;
				@Pc(204) int local204 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local204 |= 0x10;
				}
				@Pc(227) IDirect3DDevice local227;
				try {
					local227 = local13.a(local3, local5, arg0, local204 | 0x40, local179);
				} catch (@Pc(229) iba local229) {
					local227 = local13.a(local3, local5, arg0, local204 | 0x20, local179);
				}
				@Pc(248) Class172 local248 = new Class172(local227.b(0), local227.b());
				local1 = new Class126_Sub2_Sub2(local3, local5, arg0, local9, local13, local227, local248, local179, local18, arg1, arg2, arg3);
				local1.method5508();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(271) RuntimeException local271) {
			if (local1 != null) {
				local1.method7024();
			}
			throw local271;
		}
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/uca;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!jia;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!wu;I)V")
	public Class126_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) uca arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class172 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface8 arg9, @OriginalArg(10) Class384 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anIDirect3D1 = arg4;
			this.anInt6293 = arg0;
			this.anIDirect3DDevice1 = arg5;
			this.aClass172_1 = arg6;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anUca1 = arg3;
			this.aD3DCAPS1 = arg8;
			this.anInt6294 = arg1;
			this.aD3DLIGHT3 = new D3DLIGHT(this.anUca1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.anUca1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.anUca1);
			this.aPixelBuffer1 = new PixelBuffer(this.anUca1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.anUca1);
			new GeometryBuffer(this.anUca1);
			this.aBoolean522 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean520 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean525 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt6266 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean526 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean528 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.anInt6284 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean507 = this.anInt6273 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt6293, this.anInt6294, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray40 = new boolean[this.anInt6284];
			this.aBooleanArray39 = new boolean[this.anInt6284];
			this.anIntArray487 = new int[this.anInt6284];
			this.aBooleanArray41 = new boolean[this.anInt6284];
			this.aClass189Array1 = new Class189[this.anInt6284];
			this.aBooleanArray38 = new boolean[this.anInt6284];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(224) Throwable local224) {
			local224.printStackTrace();
			this.method7044();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "()V")
	@Override
	public void method7061() {
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!rh;Lclient!aw;IIIII)V")
	@Override
	public void method5526(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class237) arg0).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static351.method5585(arg1), 0, arg5, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!jagdx/IDirect3DVertexShader;)V")
	public void method5575(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method5502();
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5467() {
		this.anIDirect3DDevice1.a(27, this.aBoolean512);
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(II)V")
	@Override
	public void method7031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass172_1.method4008()) {
			this.anInt6292 = 0;
			if (raa.a(this.aClass172_1.method4007(), (int) -94)) {
				this.method5579();
			}
		} else if (++this.anInt6292 <= 50) {
			this.method5579();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method5521(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!qda;IILclient!ns;)Lclient!tr;")
	@Override
	public Interface25 method5487(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class247 arg3) {
		return new Class28_Sub3(this, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(B)V")
	@Override
	protected void method5491() {
		this.anIDirect3DDevice1.a(137, this.aBoolean523 && !this.aBoolean517);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(BI)V")
	@Override
	public void method5541(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, 11, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[BLclient!qda;II)Lclient!op;")
	@Override
	public Interface19 method5531(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class281 arg1) {
		return new Class28_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "()Z")
	@Override
	public boolean method7025() {
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)Lclient!mj;")
	@Override
	public Interface15 method6995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "()V")
	@Override
	public void method7004() {
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	@Override
	protected void method5457() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray40);
	}

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "(Z)V")
	@Override
	protected void method5568() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6275 + this.anInt6281, this.anInt6278 + this.anInt6289, this.anInt6258, this.anInt6253);
	}

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "(I)F")
	@Override
	protected float method5479() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5520(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!qt;ZZ)V")
	@Override
	public void method5537(@OriginalArg(1) int arg0, @OriginalArg(2) Class294 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 3;
		} else if (arg0 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(21) int local21 = 0;
		if (arg3) {
			local21 = 32;
		}
		if (arg2) {
			local21 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, local13, Static351.method5584(arg1) | local21);
	}

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "(I)V")
	@Override
	protected void method5550() {
		this.anIDirect3DDevice1.a(15, this.aBoolean518);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V")
	@Override
	protected void method5460() {
		this.method5517();
		this.method5565();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!ku;)V")
	@Override
	public void method5519(@OriginalArg(1) Class199 arg0) {
		@Pc(1) int local1 = 0;
		if (Static424.aClass199_4 == arg0) {
			local1 = 65536;
		} else if (arg0 == Static133.aClass199_2) {
			local1 = 131072;
		} else if (arg0 == Static559.aClass199_5) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, 11, local1 | this.anInt6274);
	}

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "()V")
	@Override
	public void method7038() {
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(II)Lclient!ul;")
	@Override
	protected Class108 method5461(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class108_Sub1(this, this.aClass384_91);
		} else if (arg0 == 4) {
			return new Class108_Sub4(this, this.aClass384_91, this.aClass373_5);
		} else if (arg0 == 8) {
			return new Class108_Sub11(this, this.aClass384_91, this.aClass373_5);
		} else {
			return super.method5461(arg0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "(I)Z")
	private boolean method5579() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(23) Class172 local23 = (Class172) this.anObject12;
			this.method5547();
			local23.method4009();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static351.method5576(this.anInt6273, this.anInt6294, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1, this.anInt6293)) {
				@Pc(58) int local58 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (raa.a(local58, (byte) 100)) {
					local23.method4006(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.b());
					this.method5574();
					this.method5533();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "(I)V")
	@Override
	protected void method5552() {
		if (this.aBooleanArray41[this.anInt6274]) {
			this.aBooleanArray41[this.anInt6274] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6274, (IDirect3DBaseTexture) null);
			this.method5571();
			this.method5557();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5527(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		if (arg1 != this.aCanvas7) {
			return;
		}
		@Pc(15) Dimension local15 = arg1.getSize();
		if (local15.width > 0 && local15.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method5579();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZII[BLclient!qda;II)Lclient!tr;")
	@Override
	protected Interface25 method5516(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class281 arg3, @OriginalArg(6) int arg4) {
		return new Class28_Sub3(this, arg3, arg1, arg4, arg0, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "(B)V")
	@Override
	protected void method5559() {
	}

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "(B)V")
	@Override
	protected void method5571() {
		@Pc(22) int local22 = this.aBooleanArray41[this.anInt6274] ? Static351.method5586(this.aClass10Array6[this.anInt6274]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, 4, local22);
	}

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "(I)V")
	@Override
	protected void method5459() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6265; local1++) {
			@Pc(14) Class5_Sub27 local14 = this.aClass5_Sub27Array4[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method6336();
			@Pc(28) float local28 = local14.method6331() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local14.method6330(), (float) local14.method6334(), (float) local14.method6335());
			this.aD3DLIGHT2.SetDiffuse(local28 * (float) (local22 >> 16 & 0xFF), (float) (local22 >> 8 & 0xFF) * local28, local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method6338() * local14.method6338()));
			this.aD3DLIGHT2.SetRange((float) local14.method6338());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (local1 < this.anInt6282) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5459();
	}

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!tea;Lclient!tea;FLclient!tea;)Lclient!tea;")
	@Override
	public Class91 method7003(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!bd;B)V")
	public void method5581(@OriginalArg(0) Class28_Sub1 arg0) {
		this.method5587(arg0);
		if (!this.aBooleanArray38[this.anInt6274]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 1, 1);
			this.aBooleanArray38[this.anInt6274] = true;
		}
		if (!this.aBooleanArray39[this.anInt6274]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 2, 1);
			this.aBooleanArray39[this.anInt6274] = true;
		}
	}

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "(Z)V")
	@Override
	protected void method5557() {
		@Pc(15) int local15 = this.aBooleanArray41[this.anInt6274] ? Static351.method5586(this.aClass10Array5[this.anInt6274]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, 1, local15);
	}

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "(I)V")
	@Override
	protected void method5489() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6281, this.anInt6289, this.anInt6105, this.anInt6075, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[IIZIII)Lclient!tr;")
	@Override
	public Interface25 method5476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class28_Sub3(this, arg2, arg5, arg3, arg1, 0, arg4);
	}

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "(B)V")
	@Override
	protected void method5535() {
		if (this.aClass49_3.method1074()) {
			this.aClass117_Sub2_18.method3881(Static351.aFloatArray43);
		} else {
			Static351.aFloatArray43[2] = 0.0F;
			Static351.aFloatArray43[9] = 0.0F;
			Static351.aFloatArray43[0] = 1.0F;
			Static351.aFloatArray43[14] = 0.0F;
			Static351.aFloatArray43[11] = 0.0F;
			Static351.aFloatArray43[13] = 0.0F;
			Static351.aFloatArray43[6] = 0.0F;
			Static351.aFloatArray43[4] = 0.0F;
			Static351.aFloatArray43[10] = 1.0F;
			Static351.aFloatArray43[5] = 1.0F;
			Static351.aFloatArray43[8] = 0.0F;
			Static351.aFloatArray43[12] = 0.0F;
			Static351.aFloatArray43[3] = 0.0F;
			Static351.aFloatArray43[1] = 0.0F;
			Static351.aFloatArray43[15] = 1.0F;
			Static351.aFloatArray43[7] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static351.aFloatArray43);
	}

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "(B)V")
	@Override
	protected void method5565() {
		if (this.aBoolean527) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean527 = true;
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "(I)V")
	@Override
	public synchronized void method7053(@OriginalArg(0) int arg0) {
		this.anUca1.a((int) 84);
		super.method7053(arg0);
	}

	@OriginalMember(owner = "client!mh", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5470(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!mh", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (raa.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (byte) 124) && raa.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), (byte) 115)) {
			local1 = new int[arg2 * arg3];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local54) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					this.aPixelBuffer1.b(local1, arg2 * local65, local54 * local65, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -113);
		local16.a((byte) -80);
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!am;)V")
	@Override
	public void method5451(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		@Pc(10) Class323 local10 = (Class323) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local10.anIDirect3DVertexBuffer1, 0, local10.method7719());
	}

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "()Z")
	@Override
	public boolean method7055() {
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V")
	@Override
	public void method5485() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray37[0], -this.aFloatArray37[1], -this.aFloatArray37[2]);
		this.aD3DLIGHT1.SetDirection(-this.bf[0], -this.bf[1], -this.bf[2]);
		this.aBoolean527 = false;
	}

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "(I)V")
	@Override
	protected void method5502() {
		if (this.anIDirect3DVertexShader7 != null || this.aClass52Array3[this.anInt6274] == Static583.aClass52_6) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, 24, 0);
			this.anIntArray487[this.anInt6274] = 0;
			return;
		}
		if (Static242.aClass52_2 == this.aClass52Array3[this.anInt6274]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6274 + 16, this.aClass117_Sub2Array3[this.anInt6274].method3882(Static351.aFloatArray43));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6274 + 16, this.aClass117_Sub2Array3[this.anInt6274].method3881(Static351.aFloatArray43));
		}
		@Pc(58) int local58 = Static351.method5577(this.aClass52Array3[this.anInt6274]);
		if (this.anIntArray487[this.anInt6274] != local58) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, 24, local58);
			this.anIntArray487[this.anInt6274] = local58;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIILclient!qt;)V")
	@Override
	protected void method5450(@OriginalArg(1) int arg0, @OriginalArg(3) Class294 arg1) {
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local12 = 6;
		} else if (arg0 == 2) {
			local12 = 27;
		} else {
			local12 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6274, local12, Static351.method5584(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(IZ)Lclient!am;")
	@Override
	public Interface1 method5530(@OriginalArg(1) boolean arg0) {
		return new Class323(this, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!aw;III)V")
	@Override
	public void method5454(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static351.method5585(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "(I)V")
	@Override
	protected void method5561() {
		this.aFloat123 = (float) (this.anInt6256 - this.anInt6280);
		this.aFloat120 = (float) -this.anInt6255 + this.aFloat123;
		if (this.aFloat120 < (float) this.anInt6259) {
			this.aFloat120 = (float) this.anInt6259;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat120);
		this.anIDirect3DDevice1.a(37, this.aFloat123);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6277);
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "(B)V")
	@Override
	protected void method5517() {
		@Pc(11) float local11 = this.aBoolean510 ? this.aFloat131 : 0.0F;
		@Pc(20) float local20 = this.aBoolean510 ? -this.aFloat132 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(this.aFloat122 * local11, local11 * this.aFloat129, this.aFloat126 * local11, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(local20 * this.aFloat122, this.aFloat129 * local20, local20 * this.aFloat126, 0.0F);
		this.aBoolean527 = false;
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "()V")
	@Override
	protected void method7024() {
		this.anUca1.b(-13759);
		super.method7024();
	}

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "()V")
	@Override
	public void method7008() {
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
	@Override
	protected void method5474() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6272);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IZ)Lclient!rh;")
	@Override
	public Interface21 method5444(@OriginalArg(1) boolean arg0) {
		return new Class237(this, Static385.aClass247_15, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "()V")
	@Override
	public void method7052() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (raa.a(local3.Issue(), (byte) 119)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -81);
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(Z)V")
	@Override
	protected void method5480() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat122 * this.aFloat119, this.aFloat129 * this.aFloat119, this.aFloat126 * this.aFloat119, 0.0F);
		this.aBoolean527 = false;
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "(Z)V")
	@Override
	protected void method5569() {
		if (this.aBoolean503) {
			Static351.aFloatArray43[8] = 0.0F;
			Static351.aFloatArray43[4] = 0.0F;
			Static351.aFloatArray43[2] = 0.0F;
			Static351.aFloatArray43[5] = 1.0F;
			Static351.aFloatArray43[13] = 0.0F;
			Static351.aFloatArray43[6] = 0.0F;
			Static351.aFloatArray43[1] = 0.0F;
			Static351.aFloatArray43[7] = 0.0F;
			Static351.aFloatArray43[9] = 0.0F;
			Static351.aFloatArray43[15] = 1.0F;
			Static351.aFloatArray43[0] = 1.0F;
			Static351.aFloatArray43[3] = 0.0F;
			Static351.aFloatArray43[10] = 1.0F;
			Static351.aFloatArray43[14] = 0.0F;
			Static351.aFloatArray43[12] = 0.0F;
			Static351.aFloatArray43[11] = 0.0F;
		} else {
			this.aClass117_Sub2_15.method3881(Static351.aFloatArray43);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static351.aFloatArray43);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method5582(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!mh", name = "Q", descriptor = "(I)V")
	@Override
	protected void method5546() {
		this.anIDirect3DDevice1.a(174, this.aBoolean524);
	}

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "(I)V")
	@Override
	protected void method5533() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6284; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass189Array1[local1] = Static276.aClass189_15;
			this.aBooleanArray38[local1] = this.aBooleanArray39[local1] = true;
			this.aBooleanArray40[local1] = false;
			this.anIntArray487[local1] = 0;
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
		this.aBoolean527 = false;
		super.method5533();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!oi;B)V")
	public void method5583(@OriginalArg(0) Class28_Sub3 arg0) {
		this.method5587(arg0);
		if (this.aBooleanArray38[this.anInt6274] != arg0.aBoolean581) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 1, arg0.aBoolean581 ? 1 : 3);
			this.aBooleanArray38[this.anInt6274] = arg0.aBoolean581;
		}
		if (arg0.aBoolean580 != this.aBooleanArray39[this.anInt6274]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 2, arg0.aBoolean580 ? 1 : 3);
			this.aBooleanArray39[this.anInt6274] = arg0.aBoolean580;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6983(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!nc;)V")
	@Override
	public void method7013(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "(I)V")
	@Override
	protected void method5495() {
		this.anIDirect3DDevice1.a(14, this.aBoolean511 && this.aBoolean515);
	}

	@OriginalMember(owner = "client!mh", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!ns;Lclient!qda;)Z")
	@Override
	public boolean method5453(@OriginalArg(1) Class247 arg0, @OriginalArg(2) Class281 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return raa.a(this.anIDirect3D1.a(this.anInt6293, local10), (byte) 100) && raa.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt6293, this.anInt6294, local10.Format, 0, 3, Static351.method5578(arg0, arg1)), (byte) 96);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()Lclient!kea;")
	@Override
	public Class185 method6980() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt6293, 0);
		return new Class185(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!mj;Lclient!bba;)Lclient!nc;")
	@Override
	public Interface16 method7029(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) Interface3 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)V")
	@Override
	protected void method5441() {
		this.anIDirect3DDevice1.a(28, this.aBoolean513 && this.aBoolean521 && this.anInt6255 >= 0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5543(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "(Z)V")
	@Override
	protected void method5558() {
		if (Static577.aClass27_8 == this.aClass27_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass27_4 == Static569.aClass27_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static572.aClass27_7 == this.aClass27_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	@Override
	public void method7022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method5448(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass172_1 = (Class172) arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Lclient!bba;")
	@Override
	public Interface3 method6978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ld;B)V")
	@Override
	public void method5524(@OriginalArg(0) Class203 arg0) {
		@Pc(6) dxVertexLayout local6 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local6.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZLclient!qda;IIB[F)Lclient!tr;")
	@Override
	protected Interface25 method5464(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class281 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[Lclient!lm;)Lclient!ld;")
	@Override
	public Class203 method5525(@OriginalArg(1) Class212[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ns;Lclient!qda;I)Z")
	@Override
	public boolean method5564(@OriginalArg(0) Class247 arg0, @OriginalArg(1) Class281 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return raa.a(this.anIDirect3D1.a(this.anInt6293, local9), (byte) 105) && raa.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt6293, this.anInt6294, local9.Format, 0, 4, Static351.method5578(arg0, arg1)), (byte) 124);
	}

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "(I)V")
	@Override
	protected void method5463() {
		this.anIDirect3DDevice1.a(7, this.aBoolean514);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ[[II)Lclient!np;")
	@Override
	public Interface18 method5458(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class28_Sub2(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7014(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7031(arg2, arg3);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ch;Z)V")
	public void method5587(@OriginalArg(0) Class28 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6274, arg0.method6206());
		if (this.aClass189Array1[this.anInt6274] != arg0.aClass189_13) {
			@Pc(21) int local21 = Static351.method5580(arg0.aClass189_13);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 5, local21);
			this.aClass189Array1[this.anInt6274] = arg0.aClass189_13;
			if (this.aBooleanArray40[this.anInt6274] != arg0.aBoolean579) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 7, arg0.aBoolean579 ? Static351.method5580(arg0.aClass189_13) : 0);
				this.aBooleanArray40[this.anInt6274] = arg0.aBoolean579;
			}
		} else if (arg0.aBoolean579 != this.aBooleanArray40[this.anInt6274]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6274, 7, arg0.aBoolean579 ? Static351.method5580(arg0.aClass189_13) : 0);
			this.aBooleanArray40[this.anInt6274] = arg0.aBoolean579;
		}
		if (!this.aBooleanArray41[this.anInt6274]) {
			this.aBooleanArray41[this.anInt6274] = true;
			this.method5571();
			this.method5557();
		}
	}
}
