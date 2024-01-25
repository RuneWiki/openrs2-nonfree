import jaclib.peer.dq;
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
import jagdx.ct;
import jagdx.uo;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class145_Sub1_Sub2 extends Class145_Sub1 {

	@OriginalMember(owner = "client!wu", name = "Mg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!wu", name = "Lg", descriptor = "Z")
	private boolean aBoolean964 = false;

	@OriginalMember(owner = "client!wu", name = "zg", descriptor = "I")
	private int anInt11282 = 0;

	@OriginalMember(owner = "client!wu", name = "Qg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!wu", name = "Og", descriptor = "I")
	private final int anInt11283;

	@OriginalMember(owner = "client!wu", name = "Jg", descriptor = "Lclient!pp;")
	private Class297 aClass297_1;

	@OriginalMember(owner = "client!wu", name = "Wg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!wu", name = "yg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!wu", name = "Kg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!wu", name = "Ug", descriptor = "I")
	private final int anInt11284;

	@OriginalMember(owner = "client!wu", name = "Hg", descriptor = "Lclient!jaclib/peer/dq;")
	public final dq aDq1;

	@OriginalMember(owner = "client!wu", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!wu", name = "Sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!wu", name = "Ig", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!wu", name = "Cg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!wu", name = "Ng", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!wu", name = "Tg", descriptor = "Z")
	public final boolean aBoolean965;

	@OriginalMember(owner = "client!wu", name = "Ag", descriptor = "Z")
	public final boolean aBoolean967;

	@OriginalMember(owner = "client!wu", name = "Gg", descriptor = "Z")
	public boolean aBoolean966;

	@OriginalMember(owner = "client!wu", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray40;

	@OriginalMember(owner = "client!wu", name = "Yg", descriptor = "[I")
	private final int[] anIntArray764;

	@OriginalMember(owner = "client!wu", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray41;

	@OriginalMember(owner = "client!wu", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray42;

	@OriginalMember(owner = "client!wu", name = "Eg", descriptor = "[Lclient!wh;")
	private final Class400[] aClass400Array1;

	@OriginalMember(owner = "client!wu", name = "Zg", descriptor = "[Z")
	private final boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!wu", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!nca;Ljava/lang/Integer;)Lclient!ha;")
	private static Class145 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class145_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) dq local9 = new dq();
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
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(201) D3DPRESENT_PARAMETERS local201 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static725.method9860(local3, local201, local5, local13, arg3)) {
					throw new RuntimeException("");
				}
				local201.EnableAutoDepthStencil = true;
				local201.Windowed = true;
				local201.PresentationInterval = Integer.MIN_VALUE;
				@Pc(228) int local228 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local228 |= 0x10;
				}
				@Pc(254) IDirect3DDevice local254;
				try {
					local254 = local13.a(local3, local5, arg0, local228 | 0x40, local201);
				} catch (@Pc(256) ct local256) {
					local254 = local13.a(local3, local5, arg0, local228 | 0x20, local201);
				}
				@Pc(275) Class297 local275 = new Class297(local254.b(0), local254.c());
				local1 = new Class145_Sub1_Sub2(local3, local5, arg0, local9, local13, local254, local275, local201, local18, arg1, arg2, arg3);
				local1.method9765();
				return local1;
			}
		} catch (@Pc(298) RuntimeException local298) {
			if (local1 != null) {
				local1.method9642();
			}
			throw local298;
		}
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/dq;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!pp;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!nca;I)V")
	private Class145_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) dq arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class297 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface3 arg9, @OriginalArg(10) Class254 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anIDirect3DDevice1 = arg5;
			this.anInt11283 = arg0;
			this.aClass297_1 = arg6;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aD3DCAPS1 = arg8;
			this.anIDirect3D1 = arg4;
			this.anInt11284 = arg1;
			this.aDq1 = arg3;
			this.aD3DLIGHT1 = new D3DLIGHT(this.aDq1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.aDq1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aDq1);
			this.aPixelBuffer1 = new PixelBuffer(this.aDq1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aDq1);
			new GeometryBuffer(this.aDq1);
			this.aBoolean958 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean965 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.anInt11280 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean967 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean966 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean949 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt11252 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
			this.aBoolean957 = this.anInt11260 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt11283, this.anInt11284, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray40 = new boolean[this.anInt11280];
			this.anIntArray764 = new int[this.anInt11280];
			this.aBooleanArray41 = new boolean[this.anInt11280];
			this.aBooleanArray42 = new boolean[this.anInt11280];
			this.aClass400Array1 = new Class400[this.anInt11280];
			this.aBooleanArray39 = new boolean[this.anInt11280];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(227) Throwable local227) {
			local227.printStackTrace();
			this.method9661();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZ)Lclient!uh;")
	@Override
	public Interface24 method9825(@OriginalArg(0) boolean arg0) {
		return new Class44(this, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "()V")
	@Override
	protected void method9642() {
		this.aDq1.b(20602);
		super.method9642();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III[FILclient!pm;IZ)Lclient!de;")
	@Override
	protected Interface4 method9805(@OriginalArg(2) int arg0, @OriginalArg(3) float[] arg1, @OriginalArg(5) Class295 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZLclient!tfa;IZ)V")
	@Override
	public void method9829(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(21) byte local21;
		if (arg0 == 1) {
			local21 = 3;
		} else if (arg0 == 2) {
			local21 = 26;
		} else {
			local21 = 2;
		}
		if (arg3) {
			local1 = 32;
		}
		if (arg1) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, local21, local1 | Static725.method9855(arg2));
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!jt;Lclient!mh;)Lclient!cla;")
	@Override
	public Interface1 method9697(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface16 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method9762(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		this.aClass297_1 = (Class297) arg1;
	}

	@OriginalMember(owner = "client!wu", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method9822(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(B)V")
	@Override
	protected void method9720() {
		this.anIDirect3DDevice1.a(15, this.aBoolean944);
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "()V")
	@Override
	public void method9660() {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZI)Lclient!lg;")
	@Override
	public Interface15 method9776(@OriginalArg(0) boolean arg0) {
		return new Class62(this, Static243.aClass158_11, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(IB)Lclient!au;")
	@Override
	protected Class26 method9814(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class26_Sub6(this, this.aClass254_173);
		} else if (arg0 == 4) {
			return new Class26_Sub1(this, this.aClass254_173, this.aClass270_8);
		} else if (arg0 == 8) {
			return new Class26_Sub2(this, this.aClass254_173, this.aClass270_8);
		} else {
			return super.method9814(arg0);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;Z)V")
	public void method9856(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9639(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method9644(arg2, arg3);
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "()V")
	@Override
	public void method9636() {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!cla;)V")
	@Override
	public void method9658(@OriginalArg(0) Interface1 arg0) {
	}

	@OriginalMember(owner = "client!wu", name = "T", descriptor = "(I)V")
	@Override
	protected void method9833() {
		this.anIDirect3DDevice1.a(27, this.aBoolean960);
	}

	@OriginalMember(owner = "client!wu", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.a(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (uo.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), true) && uo.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), true)) {
			local1 = new int[arg3 * arg2];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(67) int local67 = 0; local67 < arg3; local67++) {
					this.aPixelBuffer1.b(local1, local67 * arg2, local67 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b((byte) -117);
		local16.b((byte) -66);
		return local1;
	}

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "()V")
	@Override
	public void method9667() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (uo.a(local3.Issue(), true)) {
			while (true) {
				@Pc(13) int local13 = local3.IsSignaled();
				if (local13 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b((byte) -118);
	}

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "(I)V")
	@Override
	protected void method9809() {
		@Pc(16) int local16 = this.aBooleanArray41[this.anInt11277] ? Static725.method9863(this.aClass293Array5[this.anInt11277]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, 4, local16);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!pm;ZLclient!hk;)Z")
	@Override
	public boolean method9843(@OriginalArg(0) Class295 arg0, @OriginalArg(2) Class158 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return uo.a(this.anIDirect3D1.a(this.anInt11283, local3), true) && uo.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt11283, this.anInt11284, local3.Format, 0, 3, Static725.method9866(arg1, arg0)), true);
	}

	@OriginalMember(owner = "client!wu", name = "ab", descriptor = "(I)V")
	@Override
	protected void method9780() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat181 * this.aFloat194, this.aFloat188 * this.aFloat194, this.aFloat184 * this.aFloat194, 0.0F);
		this.aBoolean964 = false;
	}

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "(I)V")
	@Override
	protected void method9783() {
		this.anIDirect3DDevice1.a(7, this.aBoolean947);
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "(B)F")
	@Override
	protected float method9823() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "()Lclient!bo;")
	@Override
	public Class47 method9653() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt11283, 0);
		return new Class47(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!dd;)V")
	public void method9858(@OriginalArg(1) Class77_Sub1 arg0) {
		this.method9865(arg0);
		if (this.aBooleanArray42[this.anInt11277] != arg0.aBoolean207) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 1, arg0.aBoolean207 ? 1 : 3);
			this.aBooleanArray42[this.anInt11277] = arg0.aBoolean207;
		}
		if (this.aBooleanArray40[this.anInt11277] != arg0.aBoolean206) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 2, arg0.aBoolean206 ? 1 : 3);
			this.aBooleanArray40[this.anInt11277] = arg0.aBoolean206;
		}
	}

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "(B)V")
	@Override
	protected void method9840(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt11280; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass400Array1[local1] = Static610.aClass400_36;
			this.aBooleanArray42[local1] = this.aBooleanArray40[local1] = true;
			this.aBooleanArray39[local1] = false;
			this.anIntArray764[local1] = 0;
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
		this.aBoolean964 = false;
		super.method9840((byte) -86);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIII[IIZ)Lclient!de;")
	@Override
	public Interface4 method9802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) boolean arg5) {
		return new Class77_Sub1(this, arg1, arg0, arg5, arg4, 0, arg3);
	}

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(I)V")
	@Override
	protected void method9729() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray73);
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(I)V")
	@Override
	protected void method9810() {
		this.anIDirect3DDevice1.a(28, this.aBoolean951 && this.aBoolean961 && this.anInt11261 >= 0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!sca;I)V")
	public void method9859(@OriginalArg(0) Class77_Sub2 arg0) {
		this.method9865(arg0);
		if (!this.aBooleanArray42[this.anInt11277]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 1, 1);
			this.aBooleanArray42[this.anInt11277] = true;
		}
		if (!this.aBooleanArray40[this.anInt11277]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 2, 1);
			this.aBooleanArray40[this.anInt11277] = true;
		}
	}

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "()V")
	@Override
	public void method9706() {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	@Override
	protected Object method9836(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ[[II)Lclient!on;")
	@Override
	public Interface18 method9740(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class77_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BILclient!uh;)V")
	@Override
	public void method9800(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1) {
		@Pc(6) Class44 local6 = (Class44) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local6.anIDirect3DVertexBuffer1, 0, local6.method827());
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	@Override
	public Class74 method9678(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class74 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "()V")
	@Override
	public void method9673() {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method9748(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)V")
	@Override
	public void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass297_1.method7089()) {
			this.anInt11282 = 0;
			if (uo.a(this.aClass297_1.method7092(), (byte) 124)) {
				this.method9867();
			}
		} else if (++this.anInt11282 <= 50) {
			this.method9867();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)Lclient!jt;")
	@Override
	public Interface11 method9657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "K", descriptor = "(I)V")
	@Override
	protected void method9781() {
		if (this.aClass291_9.method7016()) {
			this.aClass86_Sub2_18.method2737(Static725.aFloatArray77);
		} else {
			Static725.aFloatArray77[2] = 0.0F;
			Static725.aFloatArray77[5] = 1.0F;
			Static725.aFloatArray77[14] = 0.0F;
			Static725.aFloatArray77[11] = 0.0F;
			Static725.aFloatArray77[10] = 1.0F;
			Static725.aFloatArray77[12] = 0.0F;
			Static725.aFloatArray77[15] = 1.0F;
			Static725.aFloatArray77[7] = 0.0F;
			Static725.aFloatArray77[3] = 0.0F;
			Static725.aFloatArray77[0] = 1.0F;
			Static725.aFloatArray77[8] = 0.0F;
			Static725.aFloatArray77[13] = 0.0F;
			Static725.aFloatArray77[9] = 0.0F;
			Static725.aFloatArray77[1] = 0.0F;
			Static725.aFloatArray77[4] = 0.0F;
			Static725.aFloatArray77[6] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static725.aFloatArray77);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIZLclient!tfa;)V")
	@Override
	protected void method9842(@OriginalArg(1) int arg0, @OriginalArg(3) Class352 arg1) {
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local26 = 6;
		} else if (arg0 == 2) {
			local26 = 27;
		} else {
			local26 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, local26, Static725.method9855(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V")
	@Override
	public void method9659(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!ra;IIIILclient!lg;)V")
	@Override
	public void method9778(@OriginalArg(0) int arg0, @OriginalArg(1) Class317 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface15 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class62) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static725.method9861(arg1), 0, arg3, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(B)V")
	@Override
	protected void method9771(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt11264; local1++) {
			@Pc(10) Class2_Sub7 local10 = this.aClass2_Sub7Array8[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method8170();
			@Pc(24) float local24 = local10.method8169() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local10.method8171(), (float) local10.method8174(), (float) local10.method8172());
			this.aD3DLIGHT3.SetDiffuse(local24 * (float) (local18 >> 16 & 0xFF), local24 * (float) (local18 >> 8 & 0xFF), local24 * (float) (local18 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method8173() * local10.method8173()));
			this.aD3DLIGHT3.SetRange((float) local10.method8173());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt11278 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method9771((byte) -128);
	}

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "(I)V")
	@Override
	protected void method9850() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt11249);
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(Z)V")
	@Override
	protected void method9789() {
		this.anIDirect3DDevice1.a(174, this.aBoolean963);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!oka;)V")
	@Override
	public void method9766(@OriginalArg(1) Class277 arg0) {
		@Pc(9) dxVertexLayout local9 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local9.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!hk;Lclient!pm;)Z")
	@Override
	public boolean method9764(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Class295 arg1) {
		@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
		return uo.a(this.anIDirect3D1.a(this.anInt11283, local14), true) && uo.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt11283, this.anInt11284, local14.Format, 0, 4, Static725.method9866(arg0, arg1)), true);
	}

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "(I)V")
	@Override
	protected void method9737() {
		if (this.aBoolean942) {
			Static725.aFloatArray77[0] = 1.0F;
			Static725.aFloatArray77[3] = 0.0F;
			Static725.aFloatArray77[11] = 0.0F;
			Static725.aFloatArray77[12] = 0.0F;
			Static725.aFloatArray77[6] = 0.0F;
			Static725.aFloatArray77[13] = 0.0F;
			Static725.aFloatArray77[7] = 0.0F;
			Static725.aFloatArray77[2] = 0.0F;
			Static725.aFloatArray77[9] = 0.0F;
			Static725.aFloatArray77[15] = 1.0F;
			Static725.aFloatArray77[8] = 0.0F;
			Static725.aFloatArray77[10] = 1.0F;
			Static725.aFloatArray77[14] = 0.0F;
			Static725.aFloatArray77[4] = 0.0F;
			Static725.aFloatArray77[5] = 1.0F;
			Static725.aFloatArray77[1] = 0.0F;
		} else {
			this.aClass86_Sub2_15.method2737(Static725.aFloatArray77);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static725.aFloatArray77);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9767(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "(B)V")
	@Override
	protected void method9787() {
		this.anIDirect3DDevice1.a(14, this.aBoolean953 && this.aBoolean959);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method9864(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader8 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method9846();
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(II)Lclient!mh;")
	@Override
	public Interface16 method9645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "R", descriptor = "(I)V")
	@Override
	protected void method9806() {
		if (this.aClass323_8 == Static396.aClass323_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static589.aClass323_7 == this.aClass323_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static572.aClass323_5 == this.aClass323_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!wu", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "()Z")
	@Override
	public boolean method9632() {
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!pm;ILclient!hk;II)Lclient!de;")
	@Override
	public Interface4 method9782(@OriginalArg(0) Class295 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) int arg3) {
		return new Class77_Sub1(this, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[BIIZLclient!pm;I)Lclient!de;")
	@Override
	protected Interface4 method9775(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) Class295 arg4) {
		return new Class77_Sub1(this, arg4, arg0, arg2, arg3, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(Z)V")
	@Override
	protected void method9794() {
	}

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "(I)V")
	@Override
	protected void method9845() {
		this.aFloat183 = (float) (this.anInt11258 - this.anInt11259);
		this.aFloat192 = (float) -this.anInt11261 + this.aFloat183;
		if (this.aFloat192 < (float) this.anInt11250) {
			this.aFloat192 = (float) this.anInt11250;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat192);
		this.anIDirect3DDevice1.a(37, this.aFloat183);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt11257);
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "(B)V")
	@Override
	protected void method9779() {
		if (this.aBooleanArray41[this.anInt11277]) {
			this.aBooleanArray41[this.anInt11277] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt11277, (IDirect3DBaseTexture) null);
			this.method9809();
			this.method9788();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZLclient!ega;)V")
	public void method9865(@OriginalArg(1) Class77 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt11277, arg0.method8447());
		if (this.aClass400Array1[this.anInt11277] != arg0.aClass400_35) {
			@Pc(21) int local21 = Static725.method9857(arg0.aClass400_35);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 5, local21);
			this.aClass400Array1[this.anInt11277] = arg0.aClass400_35;
			if (arg0.aBoolean823 != this.aBooleanArray39[this.anInt11277]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 7, arg0.aBoolean823 ? Static725.method9857(arg0.aClass400_35) : 0);
				this.aBooleanArray39[this.anInt11277] = arg0.aBoolean823;
			}
		} else if (arg0.aBoolean823 != this.aBooleanArray39[this.anInt11277]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt11277, 7, arg0.aBoolean823 ? Static725.method9857(arg0.aClass400_35) : 0);
			this.aBooleanArray39[this.anInt11277] = arg0.aBoolean823;
		}
		if (!this.aBooleanArray41[this.anInt11277]) {
			this.aBooleanArray41[this.anInt11277] = true;
			this.method9809();
			this.method9788();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ifa;B)V")
	@Override
	public void method9736(@OriginalArg(0) Class175 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static617.aClass175_6) {
			local1 = 65536;
		} else if (Static172.aClass175_2 == arg0) {
			local1 = 131072;
		} else if (Static540.aClass175_5 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, 11, local1 | this.anInt11277);
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(Z)V")
	@Override
	protected void method9752() {
		this.anIDirect3DDevice1.SetViewport(this.anInt11248, this.anInt11254, this.anInt11157, this.anInt11144, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(II)V")
	@Override
	public void method9804(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, 11, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!ra;)V")
	@Override
	public void method9772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class317 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static725.method9861(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "(B)Z")
	private boolean method9867() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(17) Class297 local17 = (Class297) this.anObject21;
			this.method9731();
			local17.method7090();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static725.method9860(this.anInt11283, this.aD3DPRESENT_PARAMETERS1, this.anInt11284, this.anIDirect3D1, this.anInt11260)) {
				@Pc(50) int local50 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (uo.a(local50, true)) {
					local17.method7091(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method9727();
					this.method9840((byte) -113);
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method9847(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas13 != arg0) {
			return;
		}
		@Pc(16) Dimension local16 = arg0.getSize();
		if (local16.width > 0 && local16.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method9867();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "(B)V")
	@Override
	protected void method9760() {
		this.anIDirect3DDevice1.a(137, this.aBoolean955 && !this.aBoolean954);
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(Z)V")
	@Override
	protected void method9826() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt11248 + this.anInt11243, this.anInt11253 + this.anInt11254, this.anInt11279, this.anInt11242);
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method9643(@OriginalArg(0) int arg0) {
		this.aDq1.c(33);
		super.method9643(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "(I)V")
	@Override
	protected void method9849() {
		if (this.aBoolean964) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean964 = true;
	}

	@OriginalMember(owner = "client!wu", name = "W", descriptor = "(I)V")
	@Override
	protected void method9749() {
		this.method9739();
		this.method9849();
	}

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "(I)V")
	@Override
	protected void method9739() {
		@Pc(8) float local8 = this.aBoolean946 ? this.aFloat191 : 0.0F;
		@Pc(18) float local18 = this.aBoolean946 ? -this.aFloat195 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat181 * local8, local8 * this.aFloat188, local8 * this.aFloat184, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat181 * local18, local18 * this.aFloat188, local18 * this.aFloat184, 0.0F);
		this.aBoolean964 = false;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(Z)V")
	@Override
	public void method9854(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aBoolean966 = true;
		}
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray74[0], -this.aFloatArray74[1], -this.aFloatArray74[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray68[0], -this.aFloatArray68[1], -this.aFloatArray68[2]);
		this.aBoolean964 = false;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([BILclient!pm;III)Lclient!fi;")
	@Override
	public Interface7 method9732(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class295 arg1) {
		return new Class77_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "(I)V")
	@Override
	protected void method9788() {
		@Pc(16) int local16 = this.aBooleanArray41[this.anInt11277] ? Static725.method9863(this.aClass293Array6[this.anInt11277]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, 1, local16);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([Lclient!mj;I)Lclient!oka;")
	@Override
	public Class277 method9830(@OriginalArg(0) Class243[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(B)V")
	@Override
	protected void method9846() {
		if (this.anIDirect3DVertexShader8 != null || this.aClass146Array3[this.anInt11277] == Static540.aClass146_8) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, 24, 0);
			this.anIntArray764[this.anInt11277] = 0;
			return;
		}
		if (Static145.aClass146_2 == this.aClass146Array3[this.anInt11277]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt11277 + 16, this.aClass86_Sub2Array3[this.anInt11277].method2733(Static725.aFloatArray77));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt11277 + 16, this.aClass86_Sub2Array3[this.anInt11277].method2737(Static725.aFloatArray77));
		}
		@Pc(76) int local76 = Static725.method9862(this.aClass146Array3[this.anInt11277]);
		if (this.anIntArray764[this.anInt11277] != local76) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt11277, 24, local76);
			this.anIntArray764[this.anInt11277] = local76;
		}
	}

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "()Z")
	@Override
	public boolean method9650() {
		return false;
	}
}
