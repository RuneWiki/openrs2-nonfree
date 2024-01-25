import jaclib.peer.dba;
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
import jagdx.mc;
import jagdx.saa;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class132_Sub1_Sub2 extends Class132_Sub1 {

	@OriginalMember(owner = "client!sga", name = "eh", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!sga", name = "Mg", descriptor = "Z")
	private boolean aBoolean645 = false;

	@OriginalMember(owner = "client!sga", name = "Wg", descriptor = "I")
	private int anInt9008 = 0;

	@OriginalMember(owner = "client!sga", name = "Rg", descriptor = "Lclient!eja;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!sga", name = "Kg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!sga", name = "kh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!sga", name = "Qg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!sga", name = "Og", descriptor = "I")
	private final int anInt9007;

	@OriginalMember(owner = "client!sga", name = "Tg", descriptor = "Lclient!jaclib/peer/dba;")
	public final dba aDba1;

	@OriginalMember(owner = "client!sga", name = "gh", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!sga", name = "ah", descriptor = "I")
	private final int anInt9009;

	@OriginalMember(owner = "client!sga", name = "Lg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!sga", name = "hh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!sga", name = "bh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!sga", name = "ih", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!sga", name = "Pg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!sga", name = "Yg", descriptor = "Z")
	public final boolean aBoolean647;

	@OriginalMember(owner = "client!sga", name = "Xg", descriptor = "Z")
	public final boolean aBoolean646;

	@OriginalMember(owner = "client!sga", name = "ch", descriptor = "Z")
	public final boolean aBoolean648;

	@OriginalMember(owner = "client!sga", name = "Zg", descriptor = "[Z")
	private final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!sga", name = "jh", descriptor = "[Z")
	private final boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!sga", name = "Ng", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!sga", name = "lh", descriptor = "[I")
	private final int[] anIntArray606;

	@OriginalMember(owner = "client!sga", name = "fh", descriptor = "[Lclient!cw;")
	private final Class59[] aClass59Array1;

	@OriginalMember(owner = "client!sga", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!sga", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!ae;Ljava/lang/Integer;)Lclient!ha;")
	private static Class132 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class132_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) dba local9 = new dba();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(179) D3DPRESENT_PARAMETERS local179 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static537.method7657(arg3, local179, local3, local13, local5)) {
					throw new RuntimeException("");
				}
				local179.EnableAutoDepthStencil = true;
				local179.PresentationInterval = Integer.MIN_VALUE;
				local179.Windowed = true;
				@Pc(204) int local204 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local204 |= 0x10;
				}
				@Pc(225) IDirect3DDevice local225;
				try {
					local225 = local13.a(local3, local5, arg0, local204 | 0x40, local179);
				} catch (@Pc(227) mc local227) {
					local225 = local13.a(local3, local5, arg0, local204 | 0x20, local179);
				}
				@Pc(246) Class87 local246 = new Class87(local225.b(0), local225.b());
				local1 = new Class132_Sub1_Sub2(local3, local5, arg0, local9, local13, local225, local246, local179, local18, arg1, arg2, arg3);
				local1.method7526();
				return local1;
			}
		} catch (@Pc(269) RuntimeException local269) {
			if (local1 != null) {
				local1.method7498();
			}
			throw local269;
		}
	}

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/dba;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!eja;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!ae;I)V")
	public Class132_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) dba arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class87 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface6 arg9, @OriginalArg(10) Class8 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aClass87_1 = arg6;
			this.anIDirect3DDevice1 = arg5;
			this.anIDirect3D1 = arg4;
			this.aD3DCAPS1 = arg8;
			this.anInt9007 = arg1;
			this.aDba1 = arg3;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt9009 = arg0;
			this.aD3DLIGHT1 = new D3DLIGHT(this.aDba1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aDba1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aDba1);
			this.aPixelBuffer1 = new PixelBuffer(this.aDba1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aDba1);
			new GeometryBuffer(this.aDba1);
			this.aBoolean647 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean638 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean640 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt8986 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.anInt8996 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean646 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean648 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean628 = this.anInt8987 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9009, this.anInt9007, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray28 = new boolean[this.anInt8996];
			this.aBooleanArray29 = new boolean[this.anInt8996];
			this.aBooleanArray26 = new boolean[this.anInt8996];
			this.anIntArray606 = new int[this.anInt8996];
			this.aClass59Array1 = new Class59[this.anInt8996];
			this.aBooleanArray27 = new boolean[this.anInt8996];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(214) Throwable local214) {
			local214.printStackTrace();
			this.method7491();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!sga", name = "u", descriptor = "()V")
	@Override
	protected void method7498() {
		this.aDba1.b(false);
		super.method7498();
	}

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "(Z)V")
	@Override
	protected void method7527() {
		this.anIDirect3DDevice1.a(174, this.aBoolean644);
	}

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "(B)V")
	@Override
	protected void method7647() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat177 * this.aFloat168, this.aFloat177 * this.aFloat171, this.aFloat179 * this.aFloat177, 0.0F);
		this.aBoolean645 = false;
	}

	@OriginalMember(owner = "client!sga", name = "A", descriptor = "(I)V")
	@Override
	protected void method7569() {
		@Pc(15) int local15 = this.aBooleanArray29[this.anInt8970] ? Static537.method7658(this.aClass322Array6[this.anInt8970]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, 4, local15);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILclient!daa;II)V")
	@Override
	public void method7546(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static537.method7663(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!sga", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7604() {
		if (this.aClass134_9 == Static457.aClass134_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass134_9 == Static164.aClass134_11) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass134_9 == Static379.aClass134_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIZIII[FLclient!pb;)Lclient!bw;")
	@Override
	protected Interface2 method7591(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) float[] arg3, @OriginalArg(7) Class265 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7622(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!sga", name = "l", descriptor = "(B)V")
	@Override
	protected void method7619() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8996; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass59Array1[local1] = Static70.aClass59_5;
			this.aBooleanArray28[local1] = this.aBooleanArray27[local1] = true;
			this.aBooleanArray26[local1] = false;
			this.anIntArray606[local1] = 0;
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
		this.aBoolean645 = false;
		super.method7619();
	}

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "(Z)V")
	@Override
	protected void method7562() {
		this.anIDirect3DDevice1.a(28, this.aBoolean635 && this.aBoolean637 && this.anInt9002 >= 0);
	}

	@OriginalMember(owner = "client!sga", name = "j", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return false;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZZ)Lclient!fw;")
	@Override
	public Interface12 method7564(@OriginalArg(0) boolean arg0) {
		return new Class383(this, arg0);
	}

	@OriginalMember(owner = "client!sga", name = "v", descriptor = "(I)V")
	@Override
	protected void method7554() {
		if (this.anIDirect3DVertexShader8 != null || this.aClass257Array3[this.anInt8970] == Static379.aClass257_6) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, 24, 0);
			this.anIntArray606[this.anInt8970] = 0;
			return;
		}
		if (Static87.aClass257_2 == this.aClass257Array3[this.anInt8970]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8970 + 16, this.aClass207_Sub3Array3[this.anInt8970].method8234(Static537.aFloatArray69));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8970 + 16, this.aClass207_Sub3Array3[this.anInt8970].method8236(Static537.aFloatArray69));
		}
		@Pc(74) int local74 = Static537.method7665(this.aClass257Array3[this.anInt8970]);
		if (local74 != this.anIntArray606[this.anInt8970]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, 24, local74);
			this.anIntArray606[this.anInt8970] = local74;
		}
	}

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "(B)V")
	@Override
	protected void method7594() {
		this.anIDirect3DDevice1.a(27, this.aBoolean639);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZIZLclient!vq;Z)V")
	@Override
	public void method7612(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class378 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(19) byte local19;
		if (arg1 == 1) {
			local19 = 3;
		} else if (arg1 == 2) {
			local19 = 26;
		} else {
			local19 = 2;
		}
		if (arg3) {
			local1 = 32;
		}
		if (arg0) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, local19, Static537.method7655(arg2) | local1);
	}

	@OriginalMember(owner = "client!sga", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(BI)V")
	@Override
	public void method7560(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, 11, arg0);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method7656(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader8 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method7554();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLclient!fw;I)V")
	@Override
	public void method7529(@OriginalArg(1) Interface12 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class383 local2 = (Class383) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method8892());
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7446(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7464(arg2, arg3);
	}

	@OriginalMember(owner = "client!sga", name = "m", descriptor = "(Z)V")
	@Override
	protected void method7624() {
		if (this.aBooleanArray29[this.anInt8970]) {
			this.aBooleanArray29[this.anInt8970] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8970, (IDirect3DBaseTexture) null);
			this.method7569();
			this.method7588();
		}
	}

	@OriginalMember(owner = "client!sga", name = "w", descriptor = "(I)V")
	@Override
	protected void method7558() {
		this.anIDirect3DDevice1.a(137, this.aBoolean627 && !this.aBoolean625);
	}

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "(I)V")
	@Override
	protected void method7535() {
		this.anIDirect3DDevice1.a(14, this.aBoolean633 && this.aBoolean631);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZLclient!vq;IZ)V")
	@Override
	protected void method7568(@OriginalArg(1) Class378 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte local14;
		if (arg1 == 1) {
			local14 = 6;
		} else if (arg1 == 2) {
			local14 = 27;
		} else {
			local14 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, local14, Static537.method7655(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "(B)V")
	@Override
	protected void method7563() {
		this.aFloat165 = (float) (this.anInt9004 - this.anInt8982);
		this.aFloat166 = (float) -this.anInt9002 + this.aFloat165;
		if (this.aFloat166 < (float) this.bf) {
			this.aFloat166 = (float) this.bf;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat166);
		this.anIDirect3DDevice1.a(37, this.aFloat165);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8984);
	}

	@OriginalMember(owner = "client!sga", name = "r", descriptor = "()V")
	@Override
	public void method7493() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (saa.b(local3.Issue(), (byte) 116)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(-5017);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILclient!pb;[BIII)Lclient!at;")
	@Override
	public Interface1 method7575(@OriginalArg(1) Class265 arg0, @OriginalArg(2) byte[] arg1) {
		return new Class21_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!ok;Lclient!ok;FLclient!ok;)Lclient!ok;")
	@Override
	public Class25 method7457(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "()V")
	@Override
	public void method7442() {
	}

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "()V")
	@Override
	public void method7477() {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7584(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7578(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas13 != arg1) {
			return;
		}
		@Pc(11) Dimension local11 = arg1.getSize();
		if (local11.width > 0 && local11.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method7659();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!sga", name = "B", descriptor = "(I)V")
	@Override
	protected void method7570() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8988; local1++) {
			@Pc(14) Class6_Sub17 local14 = this.aClass6_Sub17Array5[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(24) int local24 = local14.method8519();
			@Pc(30) float local30 = local14.method8524() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local14.method8518(), (float) local14.method8522(), (float) local14.method8521());
			this.aD3DLIGHT2.SetDiffuse(local30 * (float) (local24 >> 16 & 0xFF), (float) (local24 >> 8 & 0xFF) * local30, local30 * (float) (local24 & 0xFF), 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method8520() * local14.method8520()));
			this.aD3DLIGHT2.SetRange((float) local14.method8520());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt9005 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7570();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B[Lclient!im;)Lclient!bfa;")
	@Override
	public Class34 method7549(@OriginalArg(1) Class168[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!sga", name = "gb", descriptor = "(I)V")
	@Override
	protected void method7651() {
		this.method7627();
		this.method7605();
	}

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "(Z)V")
	@Override
	protected void method7632() {
		if (this.aBoolean623) {
			Static537.aFloatArray69[0] = 1.0F;
			Static537.aFloatArray69[4] = 0.0F;
			Static537.aFloatArray69[10] = 1.0F;
			Static537.aFloatArray69[1] = 0.0F;
			Static537.aFloatArray69[9] = 0.0F;
			Static537.aFloatArray69[3] = 0.0F;
			Static537.aFloatArray69[6] = 0.0F;
			Static537.aFloatArray69[15] = 1.0F;
			Static537.aFloatArray69[7] = 0.0F;
			Static537.aFloatArray69[5] = 1.0F;
			Static537.aFloatArray69[13] = 0.0F;
			Static537.aFloatArray69[8] = 0.0F;
			Static537.aFloatArray69[12] = 0.0F;
			Static537.aFloatArray69[11] = 0.0F;
			Static537.aFloatArray69[14] = 0.0F;
			Static537.aFloatArray69[2] = 0.0F;
		} else {
			this.aClass207_Sub3_15.method8236(Static537.aFloatArray69);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static537.aFloatArray69);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7579(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!bfa;I)V")
	@Override
	public void method7628(@OriginalArg(0) Class34 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method7458(@OriginalArg(0) int arg0) {
		this.aDba1.a(true);
		super.method7458(arg0);
	}

	@OriginalMember(owner = "client!sga", name = "k", descriptor = "(B)F")
	@Override
	protected float method7617() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(II)Lclient!rca;")
	@Override
	public Interface23 method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)Lclient!pm;")
	@Override
	public Interface21 method7532(@OriginalArg(1) boolean arg0) {
		return new Class83(this, Static417.aClass250_15, arg0);
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(II)V")
	@Override
	public void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass87_1.method2013()) {
			this.anInt9008 = 0;
			if (saa.a(this.aClass87_1.method2014(), (byte) 84)) {
				this.method7659();
			}
		} else if (++this.anInt9008 <= 50) {
			this.method7659();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "(Z)V")
	@Override
	protected void method7555() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8972 + this.anInt9001, this.anInt8977 + this.anInt8976, this.anInt8985, this.anInt8999);
	}

	@OriginalMember(owner = "client!sga", name = "q", descriptor = "(B)Z")
	private boolean method7659() {
		@Pc(9) int local9 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local9 == 0 || local9 == -2005530519) {
			@Pc(22) Class87 local22 = (Class87) this.anObject23;
			this.method7559();
			local22.method2016();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static537.method7657(this.anInt8987, this.aD3DPRESENT_PARAMETERS1, this.anInt9009, this.anIDirect3D1, this.anInt9007)) {
				@Pc(57) int local57 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (saa.b(local57, (byte) -70)) {
					local22.method2015(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.b(0));
					this.method7586();
					this.method7619();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sga", name = "W", descriptor = "(I)V")
	@Override
	protected void method7625() {
		if (this.aClass342_7.method8053()) {
			this.aClass207_Sub3_18.method8236(Static537.aFloatArray69);
		} else {
			Static537.aFloatArray69[14] = 0.0F;
			Static537.aFloatArray69[5] = 1.0F;
			Static537.aFloatArray69[10] = 1.0F;
			Static537.aFloatArray69[15] = 1.0F;
			Static537.aFloatArray69[13] = 0.0F;
			Static537.aFloatArray69[0] = 1.0F;
			Static537.aFloatArray69[1] = 0.0F;
			Static537.aFloatArray69[6] = 0.0F;
			Static537.aFloatArray69[8] = 0.0F;
			Static537.aFloatArray69[3] = 0.0F;
			Static537.aFloatArray69[11] = 0.0F;
			Static537.aFloatArray69[12] = 0.0F;
			Static537.aFloatArray69[7] = 0.0F;
			Static537.aFloatArray69[4] = 0.0F;
			Static537.aFloatArray69[2] = 0.0F;
			Static537.aFloatArray69[9] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static537.aFloatArray69);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!mia;)V")
	@Override
	public void method7489(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BILclient!daa;Lclient!pm;III)V")
	@Override
	public void method7573(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Interface21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class83) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static537.method7663(arg1), 0, arg4, arg5, arg0, arg3);
	}

	@OriginalMember(owner = "client!sga", name = "Y", descriptor = "(I)V")
	@Override
	protected void method7627() {
		@Pc(7) float local7 = this.aBoolean626 ? this.aFloat176 : 0.0F;
		@Pc(16) float local16 = this.aBoolean626 ? -this.aFloat169 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat168 * local7, local7 * this.aFloat171, this.aFloat179 * local7, (float) 0);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat168 * local16, local16 * this.aFloat171, this.aFloat179 * local16, 0.0F);
		this.aBoolean645 = false;
	}

	@OriginalMember(owner = "client!sga", name = "w", descriptor = "()Z")
	@Override
	public boolean method7500() {
		return false;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sga", name = "V", descriptor = "(I)V")
	@Override
	protected void method7621() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8972, this.anInt8977, this.anInt8924, this.anInt8893, (float) 0, 1.0F);
	}

	@OriginalMember(owner = "client!sga", name = "j", descriptor = "(Z)V")
	@Override
	protected void method7607() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray65);
	}

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "(B)V")
	@Override
	protected void method7588() {
		@Pc(15) int local15 = this.aBooleanArray29[this.anInt8970] ? Static537.method7658(this.aClass322Array5[this.anInt8970]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, 1, local15);
	}

	@OriginalMember(owner = "client!sga", name = "E", descriptor = "(I)V")
	@Override
	public void method7580() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray68[0], -this.aFloatArray68[1], -this.aFloatArray68[2]);
		this.aBoolean645 = false;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([BLclient!pb;ZIIIZI)Lclient!bw;")
	@Override
	protected Interface2 method7626(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return new Class21_Sub3(this, arg1, arg3, arg4, arg2, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!sga", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!sga", name = "R", descriptor = "(I)V")
	@Override
	protected void method7605() {
		if (this.aBoolean645) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean645 = true;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZLclient!an;)V")
	public void method7661(@OriginalArg(1) Class21_Sub1 arg0) {
		this.method7662(arg0);
		if (!this.aBooleanArray28[this.anInt8970]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 1, 1);
			this.aBooleanArray28[this.anInt8970] = true;
		}
		if (!this.aBooleanArray27[this.anInt8970]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 2, 1);
			this.aBooleanArray27[this.anInt8970] = true;
		}
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!rh;B)V")
	@Override
	public void method7577(@OriginalArg(0) Class305 arg0) {
		@Pc(1) int local1 = 0;
		if (Static534.aClass305_3 == arg0) {
			local1 = 65536;
		} else if (Static363.aClass305_2 == arg0) {
			local1 = 131072;
		} else if (Static571.aClass305_4 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8970, 11, local1 | this.anInt8970);
	}

	@OriginalMember(owner = "client!sga", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (saa.b(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (byte) 124) && saa.b(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), (byte) 104)) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(76) int local76 = 0; local76 < arg3; local76++) {
					this.aPixelBuffer1.b(local1, local76 * arg2, local55 * local76, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(-5017);
		local16.a(-5017);
		return local1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!pb;ILclient!oea;BI)Lclient!bw;")
	@Override
	public Interface2 method7638(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) int arg3) {
		return new Class21_Sub3(this, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!dha;Z)V")
	public void method7662(@OriginalArg(0) Class21 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8970, arg0.method8894());
		if (this.aClass59Array1[this.anInt8970] != arg0.aClass59_11) {
			@Pc(24) int local24 = Static537.method7660(arg0.aClass59_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 6, local24);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 5, local24);
			this.aClass59Array1[this.anInt8970] = arg0.aClass59_11;
			if (this.aBooleanArray26[this.anInt8970] != arg0.aBoolean733) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 7, arg0.aBoolean733 ? Static537.method7660(arg0.aClass59_11) : 0);
				this.aBooleanArray26[this.anInt8970] = arg0.aBoolean733;
			}
		} else if (this.aBooleanArray26[this.anInt8970] != arg0.aBoolean733) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 7, arg0.aBoolean733 ? Static537.method7660(arg0.aClass59_11) : 0);
			this.aBooleanArray26[this.anInt8970] = arg0.aBoolean733;
		}
		if (!this.aBooleanArray29[this.anInt8970]) {
			this.aBooleanArray29[this.anInt8970] = true;
			this.method7569();
			this.method7588();
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!oea;ILclient!pb;)Z")
	@Override
	public boolean method7634(@OriginalArg(0) Class250 arg0, @OriginalArg(2) Class265 arg1) {
		@Pc(16) D3DDISPLAYMODE local16 = new D3DDISPLAYMODE();
		return saa.b(this.anIDirect3D1.a(this.anInt9009, local16), (byte) -102) && saa.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9009, this.anInt9007, local16.Format, 0, 3, Static537.method7654(arg1, arg0)), (byte) -56);
	}

	@OriginalMember(owner = "client!sga", name = "z", descriptor = "(I)V")
	@Override
	protected void method7567() {
		this.anIDirect3DDevice1.a(7, this.aBoolean636);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZIB[[I)Lclient!fp;")
	@Override
	public Interface9 method7528(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class21_Sub2(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method7664(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "(I)V")
	@Override
	protected void method7537() {
		this.anIDirect3DDevice1.a(15, this.aBoolean641);
	}

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "(Z)V")
	@Override
	protected void method7556() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8994);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)Lclient!cn;")
	@Override
	public Interface4 method7436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method7640(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!sga", name = "O", descriptor = "(I)V")
	@Override
	protected void method7602() {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!cn;Lclient!rca;)Lclient!mia;")
	@Override
	public Interface16 method7463(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V")
	@Override
	public void method7450(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIZIII[I)Lclient!bw;")
	@Override
	public Interface2 method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5) {
		return new Class21_Sub3(this, arg0, arg1, arg2, arg5, 0, arg3);
	}

	@OriginalMember(owner = "client!sga", name = "m", descriptor = "()V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method7574(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass87_1 = (Class87) arg0;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(IB)Lclient!qs;")
	@Override
	protected Class32 method7521(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class32_Sub3(this, this.aClass8_124);
		} else if (arg0 == 4) {
			return new Class32_Sub10(this, this.aClass8_124, this.aClass247_8);
		} else if (arg0 == 8) {
			return new Class32_Sub6(this, this.aClass8_124, this.aClass247_8);
		} else {
			return super.method7521(arg0);
		}
	}

	@OriginalMember(owner = "client!sga", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public Class297 method7439() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt9009, 0);
		return new Class297(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!sga", name = "v", descriptor = "()V")
	@Override
	public void method7499() {
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILclient!wca;)V")
	public void method7666(@OriginalArg(1) Class21_Sub3 arg0) {
		this.method7662(arg0);
		if (this.aBooleanArray28[this.anInt8970] != arg0.aBoolean734) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 1, arg0.aBoolean734 ? 1 : 3);
			this.aBooleanArray28[this.anInt8970] = arg0.aBoolean734;
		}
		if (arg0.aBoolean735 != this.aBooleanArray27[this.anInt8970]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8970, 2, arg0.aBoolean735 ? 1 : 3);
			this.aBooleanArray27[this.anInt8970] = arg0.aBoolean735;
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!oea;Lclient!pb;B)Z")
	@Override
	public boolean method7585(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class265 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return saa.b(this.anIDirect3D1.a(this.anInt9009, local10), (byte) -49) && saa.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9009, this.anInt9007, local10.Format, 0, 4, Static537.method7654(arg1, arg0)), (byte) -127);
	}
}
