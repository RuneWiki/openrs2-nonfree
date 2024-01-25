import jaclib.peer.bw;
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
import jagdx.hc;
import jagdx.jia;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class57_Sub3_Sub2 extends Class57_Sub3 {

	@OriginalMember(owner = "client!sd", name = "ch", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!sd", name = "Rg", descriptor = "I")
	private int anInt9186 = 0;

	@OriginalMember(owner = "client!sd", name = "Pg", descriptor = "Z")
	private boolean aBoolean703 = false;

	@OriginalMember(owner = "client!sd", name = "jh", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!sd", name = "Lg", descriptor = "I")
	private final int anInt9184;

	@OriginalMember(owner = "client!sd", name = "hh", descriptor = "Lclient!jaclib/peer/bw;")
	public final bw aBw1;

	@OriginalMember(owner = "client!sd", name = "Zg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!sd", name = "fh", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!sd", name = "dh", descriptor = "I")
	private final int anInt9185;

	@OriginalMember(owner = "client!sd", name = "Sg", descriptor = "Lclient!q;")
	private Class285 aClass285_1;

	@OriginalMember(owner = "client!sd", name = "bh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!sd", name = "Ug", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!sd", name = "kh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!sd", name = "Wg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!sd", name = "ih", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!sd", name = "Xg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!sd", name = "eh", descriptor = "Z")
	public final boolean aBoolean702;

	@OriginalMember(owner = "client!sd", name = "Mg", descriptor = "Z")
	public final boolean aBoolean704;

	@OriginalMember(owner = "client!sd", name = "Og", descriptor = "Z")
	public final boolean aBoolean705;

	@OriginalMember(owner = "client!sd", name = "Qg", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!sd", name = "Vg", descriptor = "[Z")
	private final boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!sd", name = "Tg", descriptor = "[Lclient!li;")
	private final Class216[] aClass216Array1;

	@OriginalMember(owner = "client!sd", name = "Ng", descriptor = "[Z")
	private final boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!sd", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!sd", name = "gh", descriptor = "[I")
	private final int[] anIntArray518;

	@OriginalMember(owner = "client!sd", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!la;Ljava/lang/Integer;)Lclient!ha;")
	private static Class57 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class57_Sub3_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) bw local9 = new bw();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(192) D3DPRESENT_PARAMETERS local192 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static531.method7881(local5, local3, local192, arg3, local13)) {
					throw new RuntimeException("");
				}
				local192.PresentationInterval = Integer.MIN_VALUE;
				local192.Windowed = true;
				local192.EnableAutoDepthStencil = true;
				@Pc(219) int local219 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local219 |= 0x10;
				}
				@Pc(245) IDirect3DDevice local245;
				try {
					local245 = local13.a(local3, local5, arg0, local219 | 0x40, local192);
				} catch (@Pc(247) jia local247) {
					local245 = local13.a(local3, local5, arg0, local219 | 0x20, local192);
				}
				@Pc(266) Class285 local266 = new Class285(local245.b(0), local245.c());
				local1 = new Class57_Sub3_Sub2(local3, local5, arg0, local9, local13, local245, local266, local192, local18, arg1, arg2, arg3);
				local1.method7755();
				return local1;
			}
		} catch (@Pc(289) RuntimeException local289) {
			if (local1 != null) {
				local1.method7643();
			}
			throw local289;
		}
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/bw;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!q;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!la;I)V")
	private Class57_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) bw arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class285 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface1 arg9, @OriginalArg(10) Class208 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anIDirect3DDevice1 = arg5;
			this.anInt9184 = arg1;
			this.aBw1 = arg3;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aD3DCAPS1 = arg8;
			this.anInt9185 = arg0;
			this.aClass285_1 = arg6;
			this.anIDirect3D1 = arg4;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aBw1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aBw1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aBw1);
			this.aPixelBuffer1 = new PixelBuffer(this.aBw1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aBw1);
			new GeometryBuffer(this.aBw1);
			this.aBoolean702 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean696 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean704 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt9159 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
			this.anInt9163 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean687 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean705 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean694 = this.anInt9157 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9185, this.anInt9184, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray23 = new boolean[this.anInt9163];
			this.aBooleanArray21 = new boolean[this.anInt9163];
			this.aClass216Array1 = new Class216[this.anInt9163];
			this.aBooleanArray24 = new boolean[this.anInt9163];
			this.aBooleanArray22 = new boolean[this.anInt9163];
			this.anIntArray518 = new int[this.anInt9163];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(229) Throwable local229) {
			local229.printStackTrace();
			this.method7722();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(II)Lclient!oda;")
	@Override
	protected Class13 method7864(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class13_Sub4(this, this.aClass208_118);
		} else if (arg0 == 4) {
			return new Class13_Sub8(this, this.aClass208_118, this.aClass61_6);
		} else if (arg0 == 8) {
			return new Class13_Sub7(this, this.aClass208_118, this.aClass61_6);
		} else {
			return super.method7864(arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII[FLclient!eu;III)Lclient!wp;")
	@Override
	protected Interface26 method7853(@OriginalArg(0) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) Class114 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(II)V")
	@Override
	public void method7838(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, 11, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "()V")
	@Override
	public void method7645() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (hc.a(local3.Issue(), true)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(109);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!rt;IIZ)V")
	@Override
	protected void method7752(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) byte local15;
		if (arg1 == 1) {
			local15 = 6;
		} else if (arg1 == 2) {
			local15 = 27;
		} else {
			local15 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, local15, Static531.method7870(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "(B)V")
	@Override
	public void method7847() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray92[0], -this.aFloatArray92[1], -this.aFloatArray92[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray94[0], -this.aFloatArray94[1], -this.aFloatArray94[2]);
		this.aBoolean703 = false;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()Z")
	@Override
	public boolean method7697() {
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7659(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIIILclient!eu;[BI)Lclient!wp;")
	@Override
	protected Interface26 method7782(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(5) Class114 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) int arg4) {
		return new Class51_Sub1(this, arg2, arg4, arg1, arg0, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7660(@OriginalArg(0) int arg0) {
		this.aBw1.a((byte) 119);
		super.method7660(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "(B)V")
	@Override
	protected void method7768() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9174 + this.anInt9166, this.anInt9153 + this.anInt9181, this.anInt9176, this.anInt9145);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lclient!nq;")
	@Override
	public Interface18 method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(ZI)Lclient!sfa;")
	@Override
	public Interface25 method7784(@OriginalArg(0) boolean arg0) {
		return new Class19(this, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7734() {
		this.anIDirect3DDevice1.a(15, this.aBoolean681);
	}

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "(I)V")
	@Override
	protected void method7849() {
		this.method7856();
		this.method7777();
	}

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "()V")
	@Override
	public void method7729() {
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7824() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9163; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass216Array1[local1] = Static2.aClass216_1;
			this.aBooleanArray23[local1] = this.aBooleanArray24[local1] = true;
			this.aBooleanArray22[local1] = false;
			this.anIntArray518[local1] = 0;
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
		this.aBoolean703 = false;
		super.method7824();
	}

	@OriginalMember(owner = "client!sd", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (hc.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), true) && hc.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), true)) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (local56 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(74) int local74 = 0; local74 < arg3; local74++) {
					this.aPixelBuffer1.b(local1, arg2 * local74, local74 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(124);
		local16.a(-98);
		return local1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pj;Lclient!eu;I)Z")
	@Override
	public boolean method7844(@OriginalArg(0) Class278 arg0, @OriginalArg(1) Class114 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = new D3DDISPLAYMODE();
		return hc.a(this.anIDirect3D1.a(this.anInt9185, local12), true) && hc.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt9185, this.anInt9184, local12.Format, 0, 3, Static531.method7874(arg0, arg1)), true);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!sfa;Z)V")
	@Override
	public void method7807(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		@Pc(2) Class19 local2 = (Class19) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method341());
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "(Z)V")
	@Override
	protected void method7804() {
		this.anIDirect3DDevice1.a(27, this.aBoolean690);
	}

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(II)V")
	@Override
	public void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass285_1.method6796()) {
			this.anInt9186 = 0;
			if (hc.a((byte) -46, this.aClass285_1.method6799())) {
				this.method7880();
			}
		} else if (++this.anInt9186 <= 50) {
			this.method7880();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "(I)V")
	@Override
	protected void method7830() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9155);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method7872(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader8 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method7765();
	}

	@OriginalMember(owner = "client!sd", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "(B)V")
	@Override
	protected void method7790() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt9177; local1++) {
			@Pc(14) Class5_Sub43 local14 = this.aClass5_Sub43Array5[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method8253();
			@Pc(28) float local28 = local14.method8250() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local14.method8251(), (float) local14.method8257(), (float) local14.method8255());
			this.aD3DLIGHT3.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, (float) (local22 >> 8 & 0xFF) * local28, (float) (local22 & 0xFF) * local28, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method8254() * local14.method8254()));
			this.aD3DLIGHT3.SetRange((float) local14.method8254());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt9173 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7790();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!eu;BLclient!pj;)Z")
	@Override
	public boolean method7744(@OriginalArg(0) Class114 arg0, @OriginalArg(2) Class278 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return hc.a(this.anIDirect3D1.a(this.anInt9185, local10), true) && hc.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt9185, this.anInt9184, local10.Format, 0, 4, Static531.method7874(arg1, arg0)), true);
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(B)V")
	@Override
	protected void method7736() {
		@Pc(16) int local16 = this.aBooleanArray21[this.anInt9160] ? Static531.method7876(this.aClass34Array6[this.anInt9160]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, 1, local16);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!gk;)V")
	public void method7873(@OriginalArg(1) Class51_Sub3 arg0) {
		this.method7877(arg0);
		if (!this.aBooleanArray23[this.anInt9160]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 1, 1);
			this.aBooleanArray23[this.anInt9160] = true;
		}
		if (!this.aBooleanArray24[this.anInt9160]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 2, 1);
			this.aBooleanArray24[this.anInt9160] = true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "(B)V")
	@Override
	protected void method7862() {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!eu;ILclient!pj;I)Lclient!wp;")
	@Override
	public Interface26 method7834(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class278 arg3) {
		return new Class51_Sub1(this, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BIILclient!eu;)Lclient!oea;")
	@Override
	public Interface19 method7868(@OriginalArg(2) byte[] arg0, @OriginalArg(5) Class114 arg1) {
		return new Class51_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!gn;)V")
	@Override
	public void method7745(@OriginalArg(1) Class147 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "(I)V")
	@Override
	protected void method7793() {
		this.aFloat170 = (float) (this.bf - this.anInt9148);
		this.aFloat172 = (float) -this.anInt9170 + this.aFloat170;
		if (this.aFloat172 < (float) this.anInt9178) {
			this.aFloat172 = (float) this.anInt9178;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat172);
		this.anIDirect3DDevice1.a(37, this.aFloat170);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9162);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
	@Override
	protected void method7765() {
		if (this.anIDirect3DVertexShader8 != null || this.aClass357Array3[this.anInt9160] == Static95.aClass357_1) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, 24, 0);
			this.anIntArray518[this.anInt9160] = 0;
			return;
		}
		if (this.aClass357Array3[this.anInt9160] == Static169.aClass357_3) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9160 + 16, this.aClass203_Sub1Array3[this.anInt9160].method4845(Static531.aFloatArray101));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9160 + 16, this.aClass203_Sub1Array3[this.anInt9160].method4831(Static531.aFloatArray101));
		}
		@Pc(85) int local85 = Static531.method7875(this.aClass357Array3[this.anInt9160]);
		if (this.anIntArray518[this.anInt9160] != local85) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, 24, local85);
			this.anIntArray518[this.anInt9160] = local85;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([Lclient!aia;B)Lclient!gn;")
	@Override
	public Class147 method7825(@OriginalArg(0) Class14[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7754(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "(B)V")
	@Override
	protected void method7766() {
		if (this.aClass288_6.method6914()) {
			this.aClass203_Sub1_18.method4831(Static531.aFloatArray101);
		} else {
			Static531.aFloatArray101[5] = 1.0F;
			Static531.aFloatArray101[9] = 0.0F;
			Static531.aFloatArray101[6] = 0.0F;
			Static531.aFloatArray101[13] = 0.0F;
			Static531.aFloatArray101[8] = 0.0F;
			Static531.aFloatArray101[1] = 0.0F;
			Static531.aFloatArray101[0] = 1.0F;
			Static531.aFloatArray101[3] = 0.0F;
			Static531.aFloatArray101[14] = 0.0F;
			Static531.aFloatArray101[11] = 0.0F;
			Static531.aFloatArray101[12] = 0.0F;
			Static531.aFloatArray101[2] = 0.0F;
			Static531.aFloatArray101[7] = 0.0F;
			Static531.aFloatArray101[10] = 1.0F;
			Static531.aFloatArray101[15] = 1.0F;
			Static531.aFloatArray101[4] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static531.aFloatArray101);
	}

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "()V")
	@Override
	public void method7663() {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!je;IILclient!dea;IB)V")
	@Override
	public void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class26) arg1).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static531.method7869(arg4), 0, arg2, arg0, arg3, arg5);
	}

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "(I)V")
	@Override
	protected void method7776() {
		if (this.aBooleanArray21[this.anInt9160]) {
			this.aBooleanArray21[this.anInt9160] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9160, (IDirect3DBaseTexture) null);
			this.method7846();
			this.method7736();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!br;)V")
	public void method7877(@OriginalArg(1) Class51 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9160, arg0.method2834());
		if (arg0.aClass216_7 != this.aClass216Array1[this.anInt9160]) {
			@Pc(67) int local67 = Static531.method7871(arg0.aClass216_7);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 6, local67);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 5, local67);
			this.aClass216Array1[this.anInt9160] = arg0.aClass216_7;
			if (this.aBooleanArray22[this.anInt9160] != arg0.aBoolean261) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 7, arg0.aBoolean261 ? Static531.method7871(arg0.aClass216_7) : 0);
				this.aBooleanArray22[this.anInt9160] = arg0.aBoolean261;
			}
		} else if (arg0.aBoolean261 != this.aBooleanArray22[this.anInt9160]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 7, arg0.aBoolean261 ? Static531.method7871(arg0.aClass216_7) : 0);
			this.aBooleanArray22[this.anInt9160] = arg0.aBoolean261;
		}
		if (!this.aBooleanArray21[this.anInt9160]) {
			this.aBooleanArray21[this.anInt9160] = true;
			this.method7846();
			this.method7736();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method7878(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7747(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas12 != arg0) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method7880();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(Z)V")
	@Override
	protected void method7831() {
		this.anIDirect3DDevice1.a(174, this.aBoolean701);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	@Override
	protected void method7643() {
		this.aBw1.b(17);
		super.method7643();
	}

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "()Lclient!mi;")
	@Override
	public Class236 method7656() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt9185, 0);
		return new Class236(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "(I)V")
	@Override
	protected void method7846() {
		@Pc(18) int local18 = this.aBooleanArray21[this.anInt9160] ? Static531.method7876(this.aClass34Array5[this.anInt9160]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, 4, local18);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method7833(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ol;Lclient!ol;FLclient!ol;)Lclient!ol;")
	@Override
	public Class29 method7652(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class29 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "(B)F")
	@Override
	protected float method7859() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!gea;)V")
	@Override
	public void method7730(@OriginalArg(0) Interface6 arg0) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!dda;I)V")
	public void method7879(@OriginalArg(0) Class51_Sub1 arg0) {
		this.method7877(arg0);
		if (this.aBooleanArray23[this.anInt9160] != arg0.aBoolean152) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 1, arg0.aBoolean152 ? 1 : 3);
			this.aBooleanArray23[this.anInt9160] = arg0.aBoolean152;
		}
		if (this.aBooleanArray24[this.anInt9160] != arg0.aBoolean151) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9160, 2, arg0.aBoolean151 ? 1 : 3);
			this.aBooleanArray24[this.anInt9160] = arg0.aBoolean151;
		}
	}

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "(B)V")
	@Override
	protected void method7851() {
		this.anIDirect3DDevice1.a(14, this.aBoolean699 && this.aBoolean700);
	}

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7856() {
		@Pc(8) float local8 = this.aBoolean684 ? this.aFloat174 : 0.0F;
		@Pc(26) float local26 = this.aBoolean684 ? -this.aFloat167 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(this.aFloat165 * local8, local8 * this.aFloat177, local8 * this.aFloat179, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat165 * local26, this.aFloat177 * local26, local26 * this.aFloat179, 0.0F);
		this.aBoolean703 = false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIZILclient!rt;)V")
	@Override
	public void method7750(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class312 arg3) {
		@Pc(1) int local1 = 0;
		@Pc(19) byte local19;
		if (arg1 == 1) {
			local19 = 3;
		} else if (arg1 == 2) {
			local19 = 26;
		} else {
			local19 = 2;
		}
		if (arg2) {
			local1 = 32;
		}
		if (arg0) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, local19, local1 | Static531.method7870(arg3));
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIII[III)Lclient!wp;")
	@Override
	public Interface26 method7748(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub1(this, arg3, arg5, arg0, arg4, 0, arg2);
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)V")
	@Override
	protected void method7746() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat171 * this.aFloat165, this.aFloat171 * this.aFloat177, this.aFloat179 * this.aFloat171, 0.0F);
		this.aBoolean703 = false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!dea;II)V")
	@Override
	public void method7854(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static531.method7869(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(Z)V")
	@Override
	protected void method7749() {
		if (this.aBoolean680) {
			Static531.aFloatArray101[10] = 1.0F;
			Static531.aFloatArray101[14] = 0.0F;
			Static531.aFloatArray101[0] = 1.0F;
			Static531.aFloatArray101[3] = 0.0F;
			Static531.aFloatArray101[13] = 0.0F;
			Static531.aFloatArray101[15] = 1.0F;
			Static531.aFloatArray101[12] = 0.0F;
			Static531.aFloatArray101[5] = 1.0F;
			Static531.aFloatArray101[7] = 0.0F;
			Static531.aFloatArray101[6] = 0.0F;
			Static531.aFloatArray101[1] = 0.0F;
			Static531.aFloatArray101[2] = 0.0F;
			Static531.aFloatArray101[11] = 0.0F;
			Static531.aFloatArray101[9] = 0.0F;
			Static531.aFloatArray101[8] = 0.0F;
			Static531.aFloatArray101[4] = 0.0F;
		} else {
			this.aClass203_Sub1_15.method4831(Static531.aFloatArray101);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static531.aFloatArray101);
	}

	@OriginalMember(owner = "client!sd", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7821(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method7753(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		this.aClass285_1 = (Class285) arg1;
	}

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "()Z")
	@Override
	public boolean method7711() {
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "(B)V")
	@Override
	protected void method7839() {
		this.anIDirect3DDevice1.a(137, this.aBoolean693 && !this.aBoolean691);
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "()V")
	@Override
	public void method7651() {
	}

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "(I)Z")
	private boolean method7880() {
		@Pc(11) int local11 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local11 == 0 || local11 == -2005530519) {
			@Pc(22) Class285 local22 = (Class285) this.anObject15;
			this.method7863();
			local22.method6798();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static531.method7881(this.anInt9184, this.anInt9185, this.aD3DPRESENT_PARAMETERS1, this.anInt9157, this.anIDirect3D1)) {
				@Pc(57) int local57 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (hc.a(local57, true)) {
					local22.method6797(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method7860();
					this.method7824();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!jh;I)V")
	@Override
	public void method7778(@OriginalArg(0) Class188 arg0) {
		@Pc(1) int local1 = 0;
		if (Static506.aClass188_47 == arg0) {
			local1 = 65536;
		} else if (Static145.aClass188_9 == arg0) {
			local1 = 131072;
		} else if (Static307.aClass188_20 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9160, 11, local1 | this.anInt9160);
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(B)V")
	@Override
	protected void method7816() {
		if (this.aClass359_7 == Static342.aClass359_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static227.aClass359_2 == this.aClass359_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass359_7 == Static354.aClass359_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	@Override
	public void method7701(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IZ)Lclient!je;")
	@Override
	public Interface9 method7762(@OriginalArg(1) boolean arg0) {
		return new Class26(this, Static453.aClass278_14, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lclient!rk;")
	@Override
	public Interface23 method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "(Z)V")
	@Override
	protected void method7779() {
		this.anIDirect3DDevice1.a(28, this.aBoolean683 && this.aBoolean682 && this.anInt9170 >= 0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	@Override
	protected void method7810() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray96);
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(B)V")
	@Override
	protected void method7848() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9166, this.anInt9181, this.anInt9094, this.anInt9025, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7666(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7673(arg2, arg3);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([[IIZI)Lclient!rr;")
	@Override
	public Interface24 method7797(@OriginalArg(0) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class51_Sub2(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nq;Lclient!rk;)Lclient!gea;")
	@Override
	public Interface6 method7668(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "()V")
	@Override
	public void method7718() {
	}

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "(I)V")
	@Override
	protected void method7777() {
		if (this.aBoolean703) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean703 = true;
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7757() {
		this.anIDirect3DDevice1.a(7, this.aBoolean685);
	}
}
