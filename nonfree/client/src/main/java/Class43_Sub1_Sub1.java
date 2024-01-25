import jaclib.peer.bda;
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
import jagdx.lq;
import jagdx.rl;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class43_Sub1_Sub1 extends Class43_Sub1 {

	@OriginalMember(owner = "client!hg", name = "zg", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!hg", name = "Dg", descriptor = "I")
	private int anInt3971 = 0;

	@OriginalMember(owner = "client!hg", name = "Mg", descriptor = "Lclient!ao;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!hg", name = "Bg", descriptor = "I")
	private final int anInt3970;

	@OriginalMember(owner = "client!hg", name = "Qg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!hg", name = "Sg", descriptor = "Lclient!jaclib/peer/bda;")
	public final bda aBda1;

	@OriginalMember(owner = "client!hg", name = "Gg", descriptor = "I")
	private final int anInt3972;

	@OriginalMember(owner = "client!hg", name = "Pg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!hg", name = "Lg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!hg", name = "Xg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!hg", name = "Og", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!hg", name = "Vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!hg", name = "Rg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!hg", name = "Ug", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!hg", name = "Eg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!hg", name = "Jg", descriptor = "Z")
	public final boolean aBoolean311;

	@OriginalMember(owner = "client!hg", name = "Tg", descriptor = "Z")
	public final boolean aBoolean312;

	@OriginalMember(owner = "client!hg", name = "Ag", descriptor = "Z")
	public final boolean aBoolean310;

	@OriginalMember(owner = "client!hg", name = "Fg", descriptor = "[Z")
	private final boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!hg", name = "Ig", descriptor = "[I")
	private final int[] anIntArray317;

	@OriginalMember(owner = "client!hg", name = "Zg", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!hg", name = "Hg", descriptor = "[Z")
	private final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!hg", name = "Kg", descriptor = "[Lclient!gw;")
	private final Class123[] aClass123Array1;

	@OriginalMember(owner = "client!hg", name = "Yg", descriptor = "[Z")
	private final boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!hg", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!om;Ljava/lang/Integer;)Lclient!r;")
	private static Class43 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class43_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) bda local9 = new bda();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(176) D3DPRESENT_PARAMETERS local176 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static195.method3537(local13, arg3, local3, local176, local5)) {
					throw new RuntimeException("");
				}
				local176.Windowed = true;
				local176.PresentationInterval = Integer.MIN_VALUE;
				local176.EnableAutoDepthStencil = true;
				@Pc(202) int local202 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local202 |= 0x10;
				}
				@Pc(225) IDirect3DDevice local225;
				try {
					local225 = local13.a(local3, local5, arg0, local202 | 0x40, local176);
				} catch (@Pc(227) lq local227) {
					local225 = local13.a(local3, local5, arg0, local202 | 0x20, local176);
				}
				@Pc(246) Class13 local246 = new Class13(local225.c(0), local225.b());
				local1 = new Class43_Sub1_Sub1(local3, local5, arg0, local9, local13, local225, local246, local176, local18, arg1, arg2, arg3);
				local1.method4280();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(269) RuntimeException local269) {
			if (local1 != null) {
				local1.method7165();
			}
			throw local269;
		}
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/bda;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!ao;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!om;I)V")
	public Class43_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) bda arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class13 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface8 arg9, @OriginalArg(10) Class246 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aClass13_1 = arg6;
		this.anInt3970 = arg1;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aBda1 = arg3;
		this.anInt3972 = arg0;
		this.anIDirect3DDevice1 = arg5;
		this.anIDirect3D1 = arg4;
		this.aD3DCAPS1 = arg8;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aBda1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aBda1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aBda1);
		this.aPixelBuffer1 = new PixelBuffer(this.aBda1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aBda1);
		new GeometryBuffer(this.aBda1);
		this.aBoolean366 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean311 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean312 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.anInt4831 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.anInt4834 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean356 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean310 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean358 = this.anInt4835 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3972, this.anInt3970, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray13 = new boolean[this.anInt4834];
		this.anIntArray317 = new int[this.anInt4834];
		this.aBooleanArray16 = new boolean[this.anInt4834];
		this.aBooleanArray14 = new boolean[this.anInt4834];
		this.aClass123Array1 = new Class123[this.anInt4834];
		this.aBooleanArray15 = new boolean[this.anInt4834];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!vv;B)V")
	public void method3528(@OriginalArg(0) Class20 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt4829, arg0.method3898());
		if (this.aClass123Array1[this.anInt4829] != arg0.aClass123_8) {
			@Pc(69) int local69 = Static195.method3529(arg0.aClass123_8);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 6, local69);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 5, local69);
			this.aClass123Array1[this.anInt4829] = arg0.aClass123_8;
			if (arg0.aBoolean337 != this.aBooleanArray13[this.anInt4829]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 7, arg0.aBoolean337 ? Static195.method3529(arg0.aClass123_8) : 0);
				this.aBooleanArray13[this.anInt4829] = arg0.aBoolean337;
			}
		} else if (arg0.aBoolean337 != this.aBooleanArray13[this.anInt4829]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 7, arg0.aBoolean337 ? Static195.method3529(arg0.aClass123_8) : 0);
			this.aBooleanArray13[this.anInt4829] = arg0.aBoolean337;
		}
		if (!this.aBooleanArray16[this.anInt4829]) {
			this.aBooleanArray16[this.anInt4829] = true;
			this.method4194();
			this.method4240();
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(ZZ)V")
	@Override
	public void method4209(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "(I)V")
	@Override
	protected void method4245() {
	}

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "()V")
	@Override
	public void method7204() {
	}

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "()V")
	@Override
	public void method7171() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method4202(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V")
	@Override
	protected void method4178() {
		if (this.aBooleanArray16[this.anInt4829]) {
			this.aBooleanArray16[this.anInt4829] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt4829, null);
			this.method4194();
			this.method4240();
		}
	}

	@OriginalMember(owner = "client!hg", name = "Q", descriptor = "(I)V")
	@Override
	protected void method4283() {
		if (Static515.aClass174_18 == this.aClass174Array3[this.anInt4829]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, 24, 0);
			this.anIntArray317[this.anInt4829] = 0;
			return;
		}
		if (this.aClass174Array3[this.anInt4829] == Static233.aClass174_24) {
			this.anIDirect3DDevice1.SetTransform(this.anInt4829 + 16, this.aClass109_Sub3Array3[this.anInt4829].method7122(Static195.aFloatArray25));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt4829 + 16, this.aClass109_Sub3Array3[this.anInt4829].method7101(Static195.aFloatArray25));
		}
		@Pc(55) int local55 = Static195.method3532(this.aClass174Array3[this.anInt4829]);
		if (this.anIntArray317[this.anInt4829] != local55) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, 24, local55);
			this.anIntArray317[this.anInt4829] = local55;
		}
	}

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "(I)V")
	@Override
	protected void method4230() {
		this.anIDirect3DDevice1.a(7, this.aBoolean367);
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (rl.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (int) 3102) && rl.a(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), (int) 3102)) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					this.aPixelBuffer1.b(local1, arg2 * local63, local63 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -67);
		local16.a((byte) -67);
		return local1;
	}

	@OriginalMember(owner = "client!hg", name = "T", descriptor = "(I)Z")
	private boolean method3531() {
		@Pc(9) int local9 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local9 == 0 || local9 == -2005530519) {
			@Pc(22) Class13 local22 = (Class13) this.anObject25;
			this.method4299();
			local22.method430();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static195.method3537(this.anIDirect3D1, this.anInt4835, this.anInt3972, this.aD3DPRESENT_PARAMETERS1, this.anInt3970)) {
				@Pc(58) int local58 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (rl.a(local58, (int) 3102)) {
					local22.method428(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.b());
					this.method4270();
					this.method4227();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "()V")
	@Override
	protected void method7165() {
		this.aBda1.a(2340);
		super.method7165();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4255(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass13_1 = (Class13) arg0;
	}

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "(I)V")
	@Override
	protected void method4240() {
		@Pc(15) int local15 = this.aBooleanArray16[this.anInt4829] ? Static195.method3530(this.aClass37Array3[this.anInt4829]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, 1, local15);
	}

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "()V")
	@Override
	public void method7177() {
	}

	@OriginalMember(owner = "client!hg", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!hg", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!sh;)V")
	@Override
	public void method4297(@OriginalArg(1) Class307 arg0) {
		@Pc(1) int local1 = 0;
		if (Static28.aClass307_1 == arg0) {
			local1 = 65536;
		} else if (arg0 == Static337.aClass307_3) {
			local1 = 131072;
		} else if (arg0 == Static390.aClass307_4) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, 11, this.anInt4829 | local1);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZZ)Lclient!wl;")
	@Override
	public Interface24 method4188(@OriginalArg(1) boolean arg0) {
		return new Class148(this, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!wl;)V")
	@Override
	public void method4181(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1) {
		@Pc(10) Class148 local10 = (Class148) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local10.anIDirect3DVertexBuffer1, 0, local10.method3838());
	}

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "(B)V")
	@Override
	protected void method4246() {
		this.anIDirect3DDevice1.a(15, this.aBoolean365);
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(II)Lclient!ne;")
	@Override
	protected Class12 method4252(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class12_Sub6(this, this.aClass246_123);
		} else if (arg0 == 4) {
			return new Class12_Sub8(this, this.aClass246_123, this.lb);
		} else if (arg0 == 8) {
			return new Class12_Sub1(this, this.aClass246_123, this.lb);
		} else {
			return super.method4252(arg0);
		}
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "()V")
	@Override
	public void method7152() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ro;Lclient!fda;B)Z")
	@Override
	public boolean method4180(@OriginalArg(0) Class292 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return rl.a(this.anIDirect3D1.a(this.anInt3972, local11), (int) 3102) && rl.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3972, this.anInt3970, local11.Format, 0, 3, Static195.method3533(arg1, arg0)), (int) 3102);
	}

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "(I)V")
	@Override
	protected void method4227() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4834; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass123Array1[local1] = Static40.aClass123_9;
			this.aBooleanArray15[local1] = this.aBooleanArray14[local1] = true;
			this.aBooleanArray13[local1] = false;
			this.anIntArray317[local1] = 0;
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
		this.aBoolean309 = false;
		super.method4227();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!tf;III)V")
	@Override
	public void method4294(@OriginalArg(0) Class319 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static195.method3534(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
	@Override
	protected void method4167() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt4833 + this.anInt4813, this.anInt4825 + this.anInt4804, this.anInt4812, this.anInt4819);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z[[III)Lclient!pu;")
	@Override
	public Interface20 method4220(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class20_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "R", descriptor = "(I)V")
	@Override
	protected void method4291() {
		this.anIDirect3DDevice1.a(14, this.aBoolean372 && this.aBoolean369);
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "()V")
	@Override
	public void method7154() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (rl.a(local3.Issue(), (int) 3102)) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -67);
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(B)V")
	@Override
	protected void method4182() {
		this.method4223();
		this.method4177();
	}

	@OriginalMember(owner = "client!hg", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4278(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "(I)V")
	@Override
	protected void method4234() {
		this.anIDirect3DDevice1.a(137, this.aBoolean368 && !this.aBoolean363);
	}

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "(B)V")
	@Override
	protected void method4224() {
		this.anIDirect3DDevice1.a(174, this.aBoolean374);
	}

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "(I)V")
	@Override
	protected void method4213() {
		this.anIDirect3DDevice1.SetViewport(this.anInt4833, this.anInt4804, this.anInt4728, this.anInt4635, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ow;IZZI)V")
	@Override
	public void method4268(@OriginalArg(0) Class252 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(1) int local1 = 0;
		@Pc(20) byte local20;
		if (arg3 == 1) {
			local20 = 3;
		} else if (arg3 == 2) {
			local20 = 26;
		} else {
			local20 = 2;
		}
		if (arg1) {
			local1 = 32;
		}
		if (arg2) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, local20, Static195.method3535(arg0) | local1);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Lclient!ro;Lclient!fda;B)Z")
	@Override
	public boolean method4286(@OriginalArg(0) Class292 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return rl.a(this.anIDirect3D1.a(this.anInt3972, local8), (int) 3102) && rl.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3972, this.anInt3970, local8.Format, 0, 4, Static195.method3533(arg1, arg0)), (int) 3102);
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "(B)V")
	@Override
	protected void method4201() {
		this.anIDirect3DDevice1.a(28, this.aBoolean364 && this.aBoolean362 && this.anInt4832 >= 0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!fda;[BIIII)Lclient!gv;")
	@Override
	public Interface9 method4192(@OriginalArg(0) Class93 arg0, @OriginalArg(1) byte[] arg1) {
		return new Class20_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "()Z")
	@Override
	public boolean method7216() {
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(Z)V")
	@Override
	protected void method4219() {
		this.anIDirect3DDevice1.a(27, this.aBoolean360);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!fda;Lclient!ro;II)Lclient!hi;")
	@Override
	public Interface10 method4214(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class292 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class20_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4243() {
		this.aFloat106 = this.anInt4807 - this.anInt4802;
		this.aFloat94 = (float) -this.anInt4832 + this.aFloat106;
		if (this.aFloat94 < (float) this.anInt4814) {
			this.aFloat94 = this.anInt4814;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat94);
		this.anIDirect3DDevice1.a(37, this.aFloat106);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt4820);
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7215(@OriginalArg(0) int arg0) {
		this.aBda1.c(-12435);
		super.method7215(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "(I)V")
	@Override
	protected void method4177() {
		if (this.aBoolean309) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "()V")
	@Override
	public void method7197() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass13_1.method429()) {
			this.anInt3971 = 0;
			if (rl.a(this.aClass13_1.method427(), (byte) -75)) {
				this.method3531();
			}
		} else if (++this.anInt3971 <= 50) {
			this.method3531();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "(B)V")
	@Override
	protected void method4223() {
		@Pc(7) float local7 = this.aBoolean355 ? this.aFloat105 : 0.0F;
		@Pc(16) float local16 = this.aBoolean355 ? -this.aFloat102 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat100 * local7, this.aFloat98 * local7, this.aFloat93 * local7, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local16 * this.aFloat100, local16 * this.aFloat98, local16 * this.aFloat93, 0.0F);
		this.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "(I)F")
	@Override
	protected float method4212() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!aw;)V")
	public void method3536(@OriginalArg(1) Class20_Sub1 arg0) {
		this.method3528(arg0);
		if (!this.aBooleanArray15[this.anInt4829]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 1, 1);
			this.aBooleanArray15[this.anInt4829] = true;
		}
		if (!this.aBooleanArray14[this.anInt4829]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 2, 1);
			this.aBooleanArray14[this.anInt4829] = true;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!tf;IIIIILclient!or;)V")
	@Override
	public void method4232(@OriginalArg(0) Class319 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface17 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class327) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static195.method3534(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4189() {
		if (this.aClass285_5 == Static246.aClass285_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static488.aClass285_7 == this.aClass285_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static474.aClass285_6 == this.aClass285_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
	@Override
	protected void method4175() {
		if (this.aClass240_4.method5517()) {
			this.aClass109_Sub3_18.method7122(Static195.aFloatArray25);
		} else {
			Static195.aFloatArray25[13] = 0.0F;
			Static195.aFloatArray25[6] = 0.0F;
			Static195.aFloatArray25[14] = 0.0F;
			Static195.aFloatArray25[5] = 1.0F;
			Static195.aFloatArray25[1] = 0.0F;
			Static195.aFloatArray25[9] = 0.0F;
			Static195.aFloatArray25[12] = 0.0F;
			Static195.aFloatArray25[11] = 0.0F;
			Static195.aFloatArray25[10] = 1.0F;
			Static195.aFloatArray25[2] = 0.0F;
			Static195.aFloatArray25[3] = 0.0F;
			Static195.aFloatArray25[15] = 1.0F;
			Static195.aFloatArray25[4] = 0.0F;
			Static195.aFloatArray25[7] = 0.0F;
			Static195.aFloatArray25[0] = 1.0F;
			Static195.aFloatArray25[8] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static195.aFloatArray25);
	}

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "()Lclient!mp;")
	@Override
	public Class216 method7186() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt3972, 0);
		return new Class216(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7207(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7197();
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(BI)V")
	@Override
	public void method4289(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, 11, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(Z)V")
	@Override
	protected void method4199() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray33);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method4204(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas7 != arg0) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method3531();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILclient!fda;Z[BBI)Lclient!hi;")
	@Override
	protected Interface10 method4169(@OriginalArg(1) int arg0, @OriginalArg(3) Class93 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(7) int arg4) {
		return new Class20_Sub2(this, arg1, arg4, arg0, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZI)Lclient!or;")
	@Override
	public Interface17 method4258(@OriginalArg(0) boolean arg0) {
		return new Class327(this, Static461.aClass292_15, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "(I)V")
	@Override
	protected void method4186() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat97 * this.aFloat100, this.aFloat98 * this.aFloat97, this.aFloat97 * this.aFloat93, 0.0F);
		this.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBZLclient!ow;)V")
	@Override
	protected void method4260(@OriginalArg(0) int arg0, @OriginalArg(3) Class252 arg1) {
		@Pc(23) byte local23;
		if (arg0 == 1) {
			local23 = 6;
		} else if (arg0 == 2) {
			local23 = 27;
		} else {
			local23 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, local23, Static195.method3535(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!kr;)V")
	@Override
	public void method4196(@OriginalArg(1) Class48 arg0) {
		@Pc(8) dxVertexLayout local8 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local8.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "(B)V")
	@Override
	public void method4218() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray28[0], -this.aFloatArray28[1], -this.aFloatArray28[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray30[0], -this.aFloatArray30[1], -this.aFloatArray30[2]);
		this.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "(B)V")
	@Override
	protected void method4217() {
		if (this.aBoolean353) {
			Static195.aFloatArray25[5] = 1.0F;
			Static195.aFloatArray25[4] = 0.0F;
			Static195.aFloatArray25[10] = 1.0F;
			Static195.aFloatArray25[2] = 0.0F;
			Static195.aFloatArray25[14] = 0.0F;
			Static195.aFloatArray25[15] = 1.0F;
			Static195.aFloatArray25[0] = 1.0F;
			Static195.aFloatArray25[8] = 0.0F;
			Static195.aFloatArray25[1] = 0.0F;
			Static195.aFloatArray25[12] = 0.0F;
			Static195.aFloatArray25[7] = 0.0F;
			Static195.aFloatArray25[6] = 0.0F;
			Static195.aFloatArray25[11] = 0.0F;
			Static195.aFloatArray25[9] = 0.0F;
			Static195.aFloatArray25[13] = 0.0F;
			Static195.aFloatArray25[3] = 0.0F;
		} else {
			this.aClass109_Sub3_15.method7122(Static195.aFloatArray25);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static195.aFloatArray25);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ct;B)V")
	public void method3538(@OriginalArg(0) Class20_Sub2 arg0) {
		this.method3528(arg0);
		if (this.aBooleanArray15[this.anInt4829] != arg0.aBoolean166) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 1, arg0.aBoolean166 ? 1 : 3);
			this.aBooleanArray15[this.anInt4829] = arg0.aBoolean166;
		}
		if (this.aBooleanArray14[this.anInt4829] != arg0.aBoolean167) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4829, 2, arg0.aBoolean167 ? 1 : 3);
			this.aBooleanArray14[this.anInt4829] = arg0.aBoolean167;
		}
	}

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "(Z)V")
	@Override
	protected void method4300() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4836; local1++) {
			@Pc(14) Class3_Sub22 local14 = this.aClass3_Sub22Array3[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method6724();
			@Pc(28) float local28 = local14.method6732() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local14.method6731(), (float) local14.method6728(), (float) local14.method6725());
			this.aD3DLIGHT2.SetDiffuse(local28 * (float) (local22 >> 16 & 0xFF), (float) (local22 >> 8 & 0xFF) * local28, (float) (local22 & 0xFF) * local28, 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method6729() * local14.method6729()));
			this.aD3DLIGHT2.SetRange((float) local14.method6729());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (local1 < this.anInt4828) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4300();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIZ[II)Lclient!hi;")
	@Override
	public Interface10 method4239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class20_Sub2(this, arg2, arg1, arg3, arg4, 0, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[FZIIILclient!fda;I)Lclient!hi;")
	@Override
	protected Interface10 method4229(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(6) Class93 arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7190(@OriginalArg(0) Class46 arg0) {
	}

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "(I)V")
	@Override
	protected void method4200() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt4822);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[Lclient!rk;)Lclient!kr;")
	@Override
	public Class48 method4290(@OriginalArg(1) Class289[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "()Z")
	@Override
	public boolean method7180() {
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4198(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!js;Lclient!js;FLclient!js;)Lclient!js;")
	@Override
	public Class55 method7167(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class55 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(B)V")
	@Override
	protected void method4194() {
		@Pc(15) int local15 = this.aBooleanArray16[this.anInt4829] ? Static195.method3530(this.bf[this.anInt4829]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4829, 4, local15);
	}
}
