import jaclib.peer.ik;
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
import jagdx.bm;
import jagdx.mo;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class122_Sub2_Sub1 extends Class122_Sub2 {

	@OriginalMember(owner = "client!hv", name = "Vg", descriptor = "I")
	private int anInt3860 = 0;

	@OriginalMember(owner = "client!hv", name = "Wg", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!hv", name = "Ig", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!hv", name = "Hg", descriptor = "I")
	private final int anInt3859;

	@OriginalMember(owner = "client!hv", name = "xg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!hv", name = "Bg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!hv", name = "Fg", descriptor = "Lclient!pl;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!hv", name = "Cg", descriptor = "I")
	private final int anInt3858;

	@OriginalMember(owner = "client!hv", name = "Jg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!hv", name = "Qg", descriptor = "Lclient!jaclib/peer/ik;")
	public final ik anIk1;

	@OriginalMember(owner = "client!hv", name = "Tg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!hv", name = "Ug", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!hv", name = "Rg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!hv", name = "Ng", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!hv", name = "Pg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!hv", name = "Kg", descriptor = "Z")
	public final boolean aBoolean277;

	@OriginalMember(owner = "client!hv", name = "Gg", descriptor = "Z")
	public final boolean aBoolean276;

	@OriginalMember(owner = "client!hv", name = "Sg", descriptor = "Z")
	public final boolean aBoolean278;

	@OriginalMember(owner = "client!hv", name = "Og", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!hv", name = "Lg", descriptor = "[I")
	private final int[] anIntArray321;

	@OriginalMember(owner = "client!hv", name = "yg", descriptor = "[Lclient!gu;")
	private final Class113[] aClass113Array1;

	@OriginalMember(owner = "client!hv", name = "zg", descriptor = "[Z")
	private final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!hv", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!hv", name = "Mg", descriptor = "[Z")
	private final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!hv", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!n;Lclient!kr;Ljava/lang/Integer;)Lclient!qa;")
	public static Class122 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class122_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ik local9 = new ik();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(178) D3DPRESENT_PARAMETERS local178 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static195.method3402(local3, local5, arg3, local178, local13)) {
					throw new RuntimeException("");
				}
				local178.EnableAutoDepthStencil = true;
				local178.Windowed = true;
				local178.PresentationInterval = Integer.MIN_VALUE;
				@Pc(203) int local203 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local203 |= 0x10;
				}
				@Pc(228) IDirect3DDevice local228;
				try {
					local228 = local13.a(local3, local5, arg0, local203 | 0x40, local178);
				} catch (@Pc(230) bm local230) {
					local228 = local13.a(local3, local5, arg0, local203 | 0x20, local178);
				}
				@Pc(249) Class235 local249 = new Class235(local228.a(0), local228.c());
				local1 = new Class122_Sub2_Sub1(local3, local5, arg0, local9, local13, local228, local249, local178, local18, arg1, arg2, arg3);
				local1.method5619();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(272) RuntimeException local272) {
			if (local1 != null) {
				local1.method7245();
			}
			throw local272;
		}
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ik;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!pl;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!n;Lclient!kr;I)V")
	public Class122_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ik arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class235 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface8 arg9, @OriginalArg(10) Class171 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anIDirect3D1 = arg4;
		this.anInt3859 = arg1;
		this.anIDirect3DDevice1 = arg5;
		this.aD3DCAPS1 = arg8;
		this.aClass235_1 = arg6;
		this.anInt3858 = arg0;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anIk1 = arg3;
		this.aD3DLIGHT2 = new D3DLIGHT(this.anIk1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.anIk1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.anIk1);
		this.aPixelBuffer1 = new PixelBuffer(this.anIk1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.anIk1);
		this.aBoolean277 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.anInt6712 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean486 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.anInt6699 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean276 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean472 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean278 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean476 = this.anInt6717 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3858, this.anInt3859, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray23 = new boolean[this.anInt6699];
		this.anIntArray321 = new int[this.anInt6699];
		this.aClass113Array1 = new Class113[this.anInt6699];
		this.aBooleanArray20 = new boolean[this.anInt6699];
		this.aBooleanArray21 = new boolean[this.anInt6699];
		this.aBooleanArray22 = new boolean[this.anInt6699];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method7236();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(230) Exception_Sub1 local230) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([BBIIILclient!uda;)Lclient!nf;")
	@Override
	public Interface9 method5588(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class292 arg1) {
		return new Class24_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5628(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas11 != arg0) {
			return;
		}
		@Pc(10) Dimension local10 = arg0.getSize();
		if (local10.width > 0 && local10.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method3408();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "(I)V")
	@Override
	protected void method5584() {
		this.anIDirect3DDevice1.a(15, this.aBoolean484);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIZLclient!lg;)V")
	@Override
	protected void method5659(@OriginalArg(1) int arg0, @OriginalArg(3) Class181 arg1) {
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local22 = 6;
		} else if (arg0 == 2) {
			local22 = 27;
		} else {
			local22 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, local22, Static195.method3401(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!hv", name = "V", descriptor = "(I)V")
	@Override
	public void method5647() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray49[0], -this.aFloatArray49[1], -this.aFloatArray49[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray52[0], -this.aFloatArray52[1], -this.aFloatArray52[2]);
		this.aBoolean279 = false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[BILclient!uda;BIZI)Lclient!gq;")
	@Override
	protected Interface3 method5652(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class292 arg3, @OriginalArg(6) boolean arg4) {
		return new Class24_Sub1(this, arg3, arg2, arg0, arg4, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (mo.b(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1), 28658) && mo.b(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), 28658)) {
			local1 = new int[arg3 * arg2];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
					this.aPixelBuffer1.a(local1, arg2 * local77, local56 * local77, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b((byte) 87);
		local16.b((byte) 87);
		return local1;
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(II)Lclient!sf;")
	@Override
	protected Class42 method5577(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class42_Sub7(this, this.aClass171_110);
		} else if (arg0 == 4) {
			return new Class42_Sub2(this, this.aClass171_110, this.aClass241_6);
		} else {
			return super.method5577(arg0);
		}
	}

	@OriginalMember(owner = "client!hv", name = "B", descriptor = "(I)V")
	@Override
	protected void method5601() {
		@Pc(15) int local15 = this.aBooleanArray21[this.anInt6727] ? Static195.method3400(this.aClass271Array5[this.anInt6727]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, 1, local15);
	}

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "(I)V")
	@Override
	protected void method5558() {
		this.anIDirect3DDevice1.a(7, this.aBoolean489);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!sb;Lclient!uda;III)Lclient!gq;")
	@Override
	public Interface3 method5607(@OriginalArg(0) Class264 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class24_Sub1(this, arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!hv", name = "G", descriptor = "(I)V")
	@Override
	protected void method5608() {
		if (this.aClass68_5.method1636()) {
			this.aClass118_Sub3_18.method6973(Static195.aFloatArray25);
		} else {
			Static195.aFloatArray25[13] = 0.0F;
			Static195.aFloatArray25[2] = 0.0F;
			Static195.aFloatArray25[6] = 0.0F;
			Static195.aFloatArray25[10] = 1.0F;
			Static195.aFloatArray25[11] = 0.0F;
			Static195.aFloatArray25[9] = 0.0F;
			Static195.aFloatArray25[0] = 1.0F;
			Static195.aFloatArray25[3] = 0.0F;
			Static195.aFloatArray25[14] = 0.0F;
			Static195.aFloatArray25[7] = 0.0F;
			Static195.aFloatArray25[15] = 1.0F;
			Static195.aFloatArray25[12] = 0.0F;
			Static195.aFloatArray25[1] = 0.0F;
			Static195.aFloatArray25[8] = 0.0F;
			Static195.aFloatArray25[5] = 1.0F;
			Static195.aFloatArray25[4] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static195.aFloatArray25);
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "()Z")
	@Override
	public boolean method7215() {
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "()V")
	@Override
	public void method7214() {
	}

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "(Z)F")
	@Override
	protected float method5672() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "()Z")
	@Override
	public boolean method7218() {
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "C", descriptor = "()V")
	@Override
	public void method7281() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5578(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "S", descriptor = "(I)V")
	@Override
	protected void method5640() {
		if (this.aBoolean279) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean279 = true;
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(B)V")
	@Override
	protected void method5564() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6723 + this.anInt6709, this.anInt6725 - -this.anInt6703, this.anInt6705, this.anInt6730);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZIIIIB[I)Lclient!gq;")
	@Override
	public Interface3 method5630(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5) {
		return new Class24_Sub1(this, arg4, arg1, arg0, arg5, 0, arg3);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!sb;Lclient!uda;)Z")
	@Override
	public boolean method5656(@OriginalArg(1) Class264 arg0, @OriginalArg(2) Class292 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = this.anIDirect3D1.a(this.anInt3858);
		return mo.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt3858, this.anInt3859, local12.Format, 0, 4, Static195.method3407(arg1, arg0)), 28658);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!lca;IB)V")
	@Override
	public void method5665(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class239 local2 = (Class239) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method5732());
	}

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "(I)V")
	@Override
	protected void method5603() {
		if (this.aBoolean470) {
			Static195.aFloatArray25[3] = 0.0F;
			Static195.aFloatArray25[1] = 0.0F;
			Static195.aFloatArray25[0] = 1.0F;
			Static195.aFloatArray25[7] = 0.0F;
			Static195.aFloatArray25[13] = 0.0F;
			Static195.aFloatArray25[15] = 1.0F;
			Static195.aFloatArray25[8] = 0.0F;
			Static195.aFloatArray25[4] = 0.0F;
			Static195.aFloatArray25[11] = 0.0F;
			Static195.aFloatArray25[5] = 1.0F;
			Static195.aFloatArray25[14] = 0.0F;
			Static195.aFloatArray25[6] = 0.0F;
			Static195.aFloatArray25[9] = 0.0F;
			Static195.aFloatArray25[2] = 0.0F;
			Static195.aFloatArray25[12] = 0.0F;
			Static195.aFloatArray25[10] = 1.0F;
		} else {
			this.aClass118_Sub3_15.method6973(Static195.aFloatArray25);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static195.aFloatArray25);
	}

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "()V")
	@Override
	public void method7284() {
		this.method5551(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!wi;)V")
	public void method3403(@OriginalArg(1) Class24 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6727, arg0.method3590());
		if (arg0.aClass113_7 != this.aClass113Array1[this.anInt6727]) {
			@Pc(21) int local21 = Static195.method3404(arg0.aClass113_7);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 5, local21);
			this.aClass113Array1[this.anInt6727] = arg0.aClass113_7;
			if (this.aBooleanArray20[this.anInt6727] != arg0.aBoolean289) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 7, arg0.aBoolean289 ? Static195.method3404(arg0.aClass113_7) : 0);
				this.aBooleanArray20[this.anInt6727] = arg0.aBoolean289;
			}
		} else if (arg0.aBoolean289 != this.aBooleanArray20[this.anInt6727]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 7, arg0.aBoolean289 ? Static195.method3404(arg0.aClass113_7) : 0);
			this.aBooleanArray20[this.anInt6727] = arg0.aBoolean289;
		}
		if (!this.aBooleanArray21[this.anInt6727]) {
			this.aBooleanArray21[this.anInt6727] = true;
			this.method5627();
			this.method5601();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
	@Override
	public void method7260(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hv", name = "Q", descriptor = "(I)V")
	@Override
	protected void method5636() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray44);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5589(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "(I)V")
	@Override
	protected void method5569() {
		this.method5599();
		this.method5640();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!ug;B)Lclient!kq;")
	@Override
	public Class170 method5674(@OriginalArg(0) Class293[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "(I)V")
	@Override
	protected void method5556() {
	}

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "(B)V")
	@Override
	protected void method5587() {
		this.anIDirect3DDevice1.a(27, this.aBoolean480);
	}

	@OriginalMember(owner = "client!hv", name = "R", descriptor = "(I)V")
	@Override
	protected void method5637() {
		if (this.aClass110Array3[this.anInt6727] == Static275.aClass110_5) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, 24, 0);
			this.anIntArray321[this.anInt6727] = 0;
			return;
		}
		if (Static132.aClass110_3 == this.aClass110Array3[this.anInt6727]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6727 + 16, this.aClass118_Sub3Array3[this.anInt6727].method6973(Static195.aFloatArray25));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6727 + 16, this.aClass118_Sub3Array3[this.anInt6727].method6984(Static195.aFloatArray25));
		}
		@Pc(59) int local59 = Static195.method3405(this.aClass110Array3[this.anInt6727]);
		if (local59 != this.anIntArray321[this.anInt6727]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, 24, local59);
			this.anIntArray321[this.anInt6727] = local59;
		}
	}

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "()V")
	@Override
	public void method7238() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!rn;Lclient!rn;FLclient!rn;)Lclient!rn;")
	@Override
	public Class45 method7233(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class45 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "(I)V")
	@Override
	protected void method5593() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6707);
	}

	@OriginalMember(owner = "client!hv", name = "T", descriptor = "(I)V")
	@Override
	protected void method5641() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6699; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass113Array1[local1] = Static402.aClass113_9;
			this.aBooleanArray23[local1] = this.aBooleanArray22[local1] = true;
			this.aBooleanArray20[local1] = false;
			this.anIntArray321[local1] = 0;
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
		this.aBoolean279 = false;
		super.method5641();
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5572(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "O", descriptor = "(I)V")
	@Override
	protected void method5623() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6723, this.anInt6725, this.anInt6621, this.anInt6649, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "()V")
	@Override
	public void method7236() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass235_1.method5710()) {
			this.anInt3860 = 0;
			if (mo.a(this.aClass235_1.method5712(), -1)) {
				this.method3408();
			}
		} else if (++this.anInt3860 <= 50) {
			this.method3408();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "(I)V")
	@Override
	protected void method5599() {
		@Pc(17) float local17 = this.aBoolean481 ? this.aFloat136 : 0.0F;
		@Pc(26) float local26 = this.aBoolean481 ? -this.aFloat130 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local17 * this.bf, local17 * this.aFloat139, local17 * this.aFloat132, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local26 * this.bf, this.aFloat139 * local26, this.aFloat132 * local26, 0.0F);
		this.aBoolean279 = false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZ)Lclient!bd;")
	@Override
	public Interface1 method5660(@OriginalArg(1) boolean arg0) {
		return new Class219(this, Static431.aClass264_16, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "(B)V")
	@Override
	protected void method5627() {
		@Pc(15) int local15 = this.aBooleanArray21[this.anInt6727] ? Static195.method3400(this.aClass271Array6[this.anInt6727]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, 4, local15);
	}

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "(I)V")
	@Override
	protected void method5600() {
		this.anIDirect3DDevice1.a(14, this.aBoolean475 && this.aBoolean478);
	}

	@OriginalMember(owner = "client!hv", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return 0;
	}

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "(B)V")
	@Override
	protected void method5586() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6694; local1++) {
			@Pc(10) Class1_Sub2 local10 = this.aClass1_Sub2Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method2432();
			@Pc(24) float local24 = local10.method2436() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method2426(), (float) local10.method2428(), (float) local10.method2427());
			this.aD3DLIGHT1.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method2434() * local10.method2434()));
			this.aD3DLIGHT1.SetRange((float) local10.method2434());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt6724 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5586();
	}

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "()V")
	@Override
	protected void method7245() {
		this.anIk1.a((byte) 51);
		super.method7245();
	}

	@OriginalMember(owner = "client!hv", name = "J", descriptor = "(I)V")
	@Override
	protected void method5615() {
		this.anIDirect3DDevice1.a(28, this.aBoolean482 && this.aBoolean471 && this.aBoolean474 | this.anInt6702 >= 0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method5566(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass235_1 = (Class235) arg1;
	}

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "(B)V")
	@Override
	protected void method5649() {
		if (this.aBooleanArray21[this.anInt6727]) {
			this.aBooleanArray21[this.anInt6727] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6727, null);
			this.method5627();
			this.method5601();
		}
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(IZ)Lclient!lca;")
	@Override
	public Interface5 method5671(@OriginalArg(1) boolean arg0) {
		return new Class239(this, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "()V")
	@Override
	public void method7247() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (mo.b(local3.Issue(), 28658)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b((byte) 87);
	}

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "(B)Z")
	private boolean method3408() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(21) Class235 local21 = (Class235) this.anObject14;
			this.method5621();
			local21.method5711();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static195.method3402(this.anInt3858, this.anInt3859, this.anInt6717, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1)) {
				@Pc(56) int local56 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (mo.b(local56, 28658)) {
					local21.method5713(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.a(0));
					this.method5590();
					this.method5641();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!bf;)V")
	public void method3409(@OriginalArg(1) Class24_Sub1 arg0) {
		this.method3403(arg0);
		if (arg0.aBoolean35 != this.aBooleanArray23[this.anInt6727]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 1, arg0.aBoolean35 ? 1 : 3);
			this.aBooleanArray23[this.anInt6727] = arg0.aBoolean35;
		}
		if (arg0.aBoolean36 != this.aBooleanArray22[this.anInt6727]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 2, arg0.aBoolean36 ? 1 : 3);
			this.aBooleanArray22[this.anInt6727] = arg0.aBoolean36;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[[IIZ)Lclient!mca;")
	@Override
	public Interface7 method5631(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class24_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7234(@OriginalArg(0) int arg0) {
		this.anIk1.a((int) -31873);
		super.method7234(arg0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!ei;)V")
	@Override
	public void method5655(@OriginalArg(1) Class79 arg0) {
		@Pc(5) int local5 = 0;
		if (Static431.aClass79_12 == arg0) {
			local5 = 65536;
		} else if (arg0 == Static382.aClass79_10) {
			local5 = 131072;
		} else if (arg0 == Static469.aClass79_13) {
			local5 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, 11, local5 | this.anInt6727);
	}

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "(I)V")
	@Override
	protected void method5596() {
		this.aD3DLIGHT2.SetAmbient(this.bf * this.aFloat131, this.aFloat131 * this.aFloat139, this.aFloat131 * this.aFloat132, 0.0F);
		this.aBoolean279 = false;
	}

	@OriginalMember(owner = "client!hv", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "(B)V")
	@Override
	protected void method5625() {
		if (this.aBoolean474) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt6693);
			return;
		}
		this.aFloat135 = this.anInt6719 - this.anInt6691;
		this.aFloat137 = this.aFloat135 - (float) this.anInt6702;
		if ((float) this.anInt6728 > this.aFloat137) {
			this.aFloat137 = this.anInt6728;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat137);
		this.anIDirect3DDevice1.a(37, this.aFloat135);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6692);
	}

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "(II)V")
	@Override
	public void method5626(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, 11, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z[FILclient!uda;IIII)Lclient!gq;")
	@Override
	protected Interface3 method5673(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) Class292 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "(B)V")
	@Override
	protected void method5682() {
		this.anIDirect3DDevice1.a(174, this.aBoolean490);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!kq;I)V")
	@Override
	public void method5573(@OriginalArg(0) Class170 arg0) {
		@Pc(8) dxVertexLayout local8 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local8.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!be;III)V")
	@Override
	public void method5642(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static195.method3406(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7216(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7236();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLclient!ip;)V")
	public void method3410(@OriginalArg(1) Class24_Sub3 arg0) {
		this.method3403(arg0);
		if (!this.aBooleanArray23[this.anInt6727]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 1, 1);
			this.aBooleanArray23[this.anInt6727] = true;
		}
		if (!this.aBooleanArray22[this.anInt6727]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6727, 2, 1);
			this.aBooleanArray22[this.anInt6727] = true;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!lg;ZZZI)V")
	@Override
	public void method5678(@OriginalArg(0) Class181 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(19) byte local19;
		if (arg3 == 1) {
			local19 = 3;
		} else if (arg3 == 2) {
			local19 = 26;
		} else {
			local19 = 2;
		}
		@Pc(27) int local27 = 0;
		if (arg2) {
			local27 = 32;
		}
		if (arg1) {
			local27 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6727, local19, Static195.method3401(arg0) | local27);
	}

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "(I)V")
	@Override
	protected void method5604() {
		this.anIDirect3DDevice1.a(137, this.aBoolean488 && !this.aBoolean483);
	}

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "()Lclient!qf;")
	@Override
	public Class246 method7276() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt3858, 0);
		return new Class246(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!be;Lclient!bd;IIIII)V")
	@Override
	public void method5669(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class219) arg1).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static195.method3406(arg0), 0, arg3, arg2, arg5, arg4);
	}

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "(I)V")
	@Override
	protected void method5552() {
		if (Static119.aClass155_1 == this.aClass155_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static437.aClass155_7 == this.aClass155_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static391.aClass155_6 == this.aClass155_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!sb;Lclient!uda;I)Z")
	@Override
	public boolean method5618(@OriginalArg(0) Class264 arg0, @OriginalArg(1) Class292 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = this.anIDirect3D1.a(this.anInt3858);
		return mo.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt3858, this.anInt3859, local11.Format, 0, 3, Static195.method3407(arg1, arg0)), 28658);
	}
}
