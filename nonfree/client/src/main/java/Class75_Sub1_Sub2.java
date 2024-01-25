import jaclib.peer.io;
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
import jagdx.ck;
import jagdx.wea;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class75_Sub1_Sub2 extends Class75_Sub1 {

	@OriginalMember(owner = "client!os", name = "Lg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!os", name = "Gg", descriptor = "I")
	private int anInt7691 = 0;

	@OriginalMember(owner = "client!os", name = "Xg", descriptor = "Z")
	private boolean aBoolean580 = false;

	@OriginalMember(owner = "client!os", name = "Ig", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!os", name = "Zg", descriptor = "I")
	private final int anInt7692;

	@OriginalMember(owner = "client!os", name = "Ug", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!os", name = "Tg", descriptor = "Lclient!od;")
	private Class264 aClass264_1;

	@OriginalMember(owner = "client!os", name = "Pg", descriptor = "I")
	private final int anInt7693;

	@OriginalMember(owner = "client!os", name = "Rg", descriptor = "Lclient!jaclib/peer/io;")
	public final io anIo1;

	@OriginalMember(owner = "client!os", name = "Qg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!os", name = "Mg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!os", name = "Hg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!os", name = "eh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!os", name = "Ng", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!os", name = "ch", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!os", name = "dh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!os", name = "Dg", descriptor = "Z")
	public final boolean aBoolean577;

	@OriginalMember(owner = "client!os", name = "bh", descriptor = "Z")
	public final boolean aBoolean579;

	@OriginalMember(owner = "client!os", name = "Wg", descriptor = "Z")
	public final boolean aBoolean578;

	@OriginalMember(owner = "client!os", name = "Eg", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!os", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!os", name = "Sg", descriptor = "[Z")
	private final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!os", name = "ah", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!os", name = "Og", descriptor = "[I")
	private final int[] anIntArray484;

	@OriginalMember(owner = "client!os", name = "Fg", descriptor = "[Lclient!td;")
	private final Class338[] aClass338Array1;

	@OriginalMember(owner = "client!os", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!lga;Ljava/lang/Integer;)Lclient!ha;")
	private static Class75 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class75_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) io local9 = new io();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(192) D3DPRESENT_PARAMETERS local192 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static440.method6862(arg3, local5, local3, local192, local13)) {
					throw new RuntimeException("");
				}
				local192.EnableAutoDepthStencil = true;
				local192.PresentationInterval = Integer.MIN_VALUE;
				local192.Windowed = true;
				@Pc(219) int local219 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local219 |= 0x10;
				}
				@Pc(243) IDirect3DDevice local243;
				try {
					local243 = local13.a(local3, local5, arg0, local219 | 0x40, local192);
				} catch (@Pc(245) wea local245) {
					local243 = local13.a(local3, local5, arg0, local219 | 0x20, local192);
				}
				@Pc(264) Class264 local264 = new Class264(local243.a(0), local243.c());
				local1 = new Class75_Sub1_Sub2(local3, local5, arg0, local9, local13, local243, local264, local192, local18, arg1, arg2, arg3);
				local1.method6829();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(287) RuntimeException local287) {
			if (local1 != null) {
				local1.method6667();
			}
			throw local287;
		}
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/io;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!od;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!lga;I)V")
	private Class75_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) io arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class264 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface11 arg9, @OriginalArg(10) Class223 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt7692 = arg0;
			this.anIDirect3D1 = arg4;
			this.aClass264_1 = arg6;
			this.anInt7693 = arg1;
			this.anIo1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DCAPS1 = arg8;
			this.aD3DLIGHT1 = new D3DLIGHT(this.anIo1);
			this.aD3DLIGHT2 = new D3DLIGHT(this.anIo1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.anIo1);
			this.aPixelBuffer1 = new PixelBuffer(this.anIo1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.anIo1);
			new GeometryBuffer(this.anIo1);
			this.anInt7661 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean577 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean579 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean569 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean561 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.anInt7658 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean578 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean565 = this.anInt7665 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt7692, this.anInt7693, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray23 = new boolean[this.anInt7658];
			this.aBooleanArray24 = new boolean[this.anInt7658];
			this.aBooleanArray25 = new boolean[this.anInt7658];
			this.aBooleanArray26 = new boolean[this.anInt7658];
			this.anIntArray484 = new int[this.anInt7658];
			this.aClass338Array1 = new Class338[this.anInt7658];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(224) Throwable local224) {
			local224.printStackTrace();
			this.method6672();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!lc;)V")
	@Override
	public void method6769(@OriginalArg(1) Class219 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static261.aClass219_4) {
			local1 = 65536;
		} else if (Static321.aClass219_5 == arg0) {
			local1 = 131072;
		} else if (arg0 == Static630.aClass219_3) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, 11, this.anInt7659 | local1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZILclient!oba;Z)V")
	@Override
	protected void method6760(@OriginalArg(1) int arg0, @OriginalArg(2) Class261 arg1) {
		@Pc(19) byte local19;
		if (arg0 == 1) {
			local19 = 6;
		} else if (arg0 == 2) {
			local19 = 27;
		} else {
			local19 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, local19, Static440.method6855(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!os", name = "U", descriptor = "(I)V")
	@Override
	protected void method6757() {
		if (this.anIDirect3DVertexShader7 != null || this.aClass211Array3[this.anInt7659] == Static486.aClass211_4) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, 24, 0);
			this.anIntArray484[this.anInt7659] = 0;
			return;
		}
		if (this.aClass211Array3[this.anInt7659] == Static82.aClass211_2) {
			this.anIDirect3DDevice1.SetTransform(this.anInt7659 + 16, this.aClass109_Sub3Array3[this.anInt7659].method4347(Static440.aFloatArray70));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt7659 + 16, this.aClass109_Sub3Array3[this.anInt7659].method4345(Static440.aFloatArray70));
		}
		@Pc(68) int local68 = Static440.method6857(this.aClass211Array3[this.anInt7659]);
		if (this.anIntArray484[this.anInt7659] != local68) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, 24, local68);
			this.anIntArray484[this.anInt7659] = local68;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!bha;Lclient!kb;)Lclient!tha;")
	@Override
	public Interface24 method6641(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Interface14 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6783(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6724(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		if (arg1 != this.aCanvas10) {
			return;
		}
		@Pc(6) Dimension local6 = arg1.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method6863();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!os", name = "O", descriptor = "(I)V")
	@Override
	protected void method6781() {
		this.anIDirect3DDevice1.SetViewport(this.anInt7651, this.anInt7678, this.anInt7597, this.anInt7590, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!os", name = "db", descriptor = "(I)V")
	@Override
	protected void method6835() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt7660; local1++) {
			@Pc(10) Class6_Sub10 local10 = this.aClass6_Sub10Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method8328();
			@Pc(26) float local26 = local10.method8334() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local10.method8332(), (float) local10.method8327(), (float) local10.method8329());
			this.aD3DLIGHT3.SetDiffuse((float) (local18 >> 16 & 0xFF) * local26, local26 * (float) (local18 >> 8 & 0xFF), (float) (local18 & 0xFF) * local26, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method8331() * local10.method8331()));
			this.aD3DLIGHT3.SetRange((float) local10.method8331());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt7683) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6835();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)Lclient!uba;")
	@Override
	public Interface25 method6817(@OriginalArg(0) boolean arg0) {
		return new Class377(this, Static435.aClass274_14, arg0);
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(II)Lclient!bha;")
	@Override
	public Interface5 method6674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "w", descriptor = "()V")
	@Override
	public void method6663() {
	}

	@OriginalMember(owner = "client!os", name = "A", descriptor = "()Z")
	@Override
	public boolean method6705() {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "x", descriptor = "(I)V")
	@Override
	protected void method6812() {
		if (this.aBoolean555) {
			Static440.aFloatArray70[10] = 1.0F;
			Static440.aFloatArray70[12] = 0.0F;
			Static440.aFloatArray70[1] = 0.0F;
			Static440.aFloatArray70[8] = 0.0F;
			Static440.aFloatArray70[0] = 1.0F;
			Static440.aFloatArray70[3] = 0.0F;
			Static440.aFloatArray70[2] = 0.0F;
			Static440.aFloatArray70[4] = 0.0F;
			Static440.aFloatArray70[11] = 0.0F;
			Static440.aFloatArray70[13] = 0.0F;
			Static440.aFloatArray70[9] = 0.0F;
			Static440.aFloatArray70[5] = 1.0F;
			Static440.aFloatArray70[14] = 0.0F;
			Static440.aFloatArray70[15] = 1.0F;
			Static440.aFloatArray70[7] = 0.0F;
			Static440.aFloatArray70[6] = 0.0F;
		} else {
			this.aClass109_Sub3_15.method4345(Static440.aFloatArray70);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static440.aFloatArray70);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[FIIIZILclient!hh;)Lclient!cf;")
	@Override
	protected Interface7 method6748(@OriginalArg(1) float[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class155 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!sn;Lclient!sn;FLclient!sn;)Lclient!sn;")
	@Override
	public Class81 method6656(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class81 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!cb;IILclient!uba;III)V")
	@Override
	public void method6746(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface25 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class377) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static440.method6854(arg0), 0, arg1, arg2, arg4, arg5);
	}

	@OriginalMember(owner = "client!os", name = "w", descriptor = "(I)V")
	@Override
	protected void method6785() {
		this.anIDirect3DDevice1.a(7, this.aBoolean557);
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6770(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!os", name = "v", descriptor = "()Lclient!cba;")
	@Override
	public Class52 method6699() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt7692, 0);
		return new Class52(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLclient!tk;)V")
	public void method6856(@OriginalArg(1) Class193_Sub3 arg0) {
		this.method6864(arg0);
		if (!this.aBooleanArray26[this.anInt7659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 1, 1);
			this.aBooleanArray26[this.anInt7659] = true;
		}
		if (!this.aBooleanArray24[this.anInt7659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 2, 1);
			this.aBooleanArray24[this.anInt7659] = true;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIZ[III)Lclient!cf;")
	@Override
	public Interface7 method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class193_Sub1(this, arg1, arg4, arg2, arg3, 0, arg5);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!hh;Lclient!on;Z)Z")
	@Override
	public boolean method6819(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class274 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return ck.a(this.anIDirect3D1.a(this.anInt7692, local3), -1) && ck.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt7692, this.anInt7693, local3.Format, 0, 4, Static440.method6860(arg1, arg0)), -1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Lclient!uc;)Lclient!ot;")
	@Override
	public Class207 method6803(@OriginalArg(1) Class355[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!os", name = "r", descriptor = "(B)V")
	@Override
	protected void method6798() {
		this.aFloat155 = (float) (this.anInt7680 - this.anInt7675);
		this.aFloat142 = (float) -this.anInt7657 + this.aFloat155;
		if ((float) this.anInt7687 > this.aFloat142) {
			this.aFloat142 = (float) this.anInt7687;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat142);
		this.anIDirect3DDevice1.a(37, this.aFloat155);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt7670);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!on;Lclient!hh;)Z")
	@Override
	public boolean method6786(@OriginalArg(1) Class274 arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(12) D3DDISPLAYMODE local12 = new D3DDISPLAYMODE();
		return ck.a(this.anIDirect3D1.a(this.anInt7692, local12), -1) && ck.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt7692, this.anInt7693, local12.Format, 0, 3, Static440.method6860(arg0, arg1)), -1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II[[IZ)Lclient!nm;")
	@Override
	public Interface19 method6765(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class193_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!os", name = "K", descriptor = "(I)V")
	@Override
	protected void method6793() {
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(B)V")
	@Override
	protected void method6730() {
		@Pc(8) float local8 = this.aBoolean572 ? this.aFloat145 : 0.0F;
		@Pc(22) float local22 = this.aBoolean572 ? -this.aFloat144 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat153 * local8, this.aFloat147 * local8, this.aFloat146 * local8, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local22 * this.aFloat153, local22 * this.aFloat147, this.aFloat146 * local22, 0.0F);
		this.aBoolean580 = false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!bl;IZ)V")
	@Override
	public void method6827(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class61 local2 = (Class61) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method1203());
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;I)V")
	public void method6859(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method6757();
	}

	@OriginalMember(owner = "client!os", name = "m", descriptor = "(B)V")
	@Override
	protected void method6842() {
		this.anIDirect3DDevice1.a(174, this.aBoolean576);
	}

	@OriginalMember(owner = "client!os", name = "x", descriptor = "()V")
	@Override
	public void method6645() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (ck.a(local3.Issue(), -1)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(true);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!os", name = "F", descriptor = "(I)V")
	@Override
	protected void method6790() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt7651 + this.anInt7656, this.anInt7678 + this.anInt7681, this.anInt7686, this.anInt7668);
	}

	@OriginalMember(owner = "client!os", name = "s", descriptor = "(I)V")
	@Override
	protected void method6735() {
		if (this.aBooleanArray25[this.anInt7659]) {
			this.aBooleanArray25[this.anInt7659] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt7659, (IDirect3DBaseTexture) null);
			this.method6740();
			this.method6806();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!hh;III[B)Lclient!jca;")
	@Override
	public Interface13 method6849(@OriginalArg(1) Class155 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class193_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!os", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6847() {
		if (this.aBoolean580) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean580 = true;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(B)F")
	@Override
	protected float method6733() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZZBLclient!oba;I)V")
	@Override
	public void method6831(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class261 arg2, @OriginalArg(4) int arg3) {
		@Pc(25) byte local25;
		if (arg3 == 1) {
			local25 = 3;
		} else if (arg3 == 2) {
			local25 = 26;
		} else {
			local25 = 2;
		}
		@Pc(33) int local33 = 0;
		if (arg0) {
			local33 = 32;
		}
		if (arg1) {
			local33 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, local25, Static440.method6855(arg2) | local33);
	}

	@OriginalMember(owner = "client!os", name = "u", descriptor = "()V")
	@Override
	public void method6642() {
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
	@Override
	protected void method6721() {
		this.anIDirect3DDevice1.a(28, this.aBoolean570 && this.aBoolean564 && this.anInt7657 >= 0);
	}

	@OriginalMember(owner = "client!os", name = "V", descriptor = "(I)V")
	@Override
	protected void method6799() {
		if (this.aClass171_6 == Static89.aClass171_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass171_6 == Static329.aClass171_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static636.aClass171_7 == this.aClass171_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!os", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (ck.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), -1) && ck.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), -1)) {
			local1 = new int[arg3 * arg2];
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
		local6.a(true);
		local16.a(true);
		return local1;
	}

	@OriginalMember(owner = "client!os", name = "gb", descriptor = "(I)V")
	@Override
	protected void method6726() {
		this.method6730();
		this.method6847();
	}

	@OriginalMember(owner = "client!os", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!os", name = "r", descriptor = "()V")
	@Override
	public void method6715() {
	}

	@OriginalMember(owner = "client!os", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "()V")
	@Override
	public void method6717() {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6797(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!os", name = "t", descriptor = "(I)V")
	@Override
	protected void method6841() {
		this.anIDirect3DDevice1.a(137, this.aBoolean571 && !this.aBoolean575);
	}

	@OriginalMember(owner = "client!os", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6752(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!cb;III)V")
	@Override
	public void method6853(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static440.method6854(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(B)V")
	@Override
	protected void method6774() {
		if (this.aClass111_5.method3099()) {
			this.aClass109_Sub3_18.method4345(Static440.aFloatArray70);
		} else {
			Static440.aFloatArray70[5] = 1.0F;
			Static440.aFloatArray70[14] = 0.0F;
			Static440.aFloatArray70[2] = 0.0F;
			Static440.aFloatArray70[1] = 0.0F;
			Static440.aFloatArray70[8] = 0.0F;
			Static440.aFloatArray70[4] = 0.0F;
			Static440.aFloatArray70[10] = 1.0F;
			Static440.aFloatArray70[3] = 0.0F;
			Static440.aFloatArray70[9] = 0.0F;
			Static440.aFloatArray70[12] = 0.0F;
			Static440.aFloatArray70[0] = 1.0F;
			Static440.aFloatArray70[11] = 0.0F;
			Static440.aFloatArray70[13] = 0.0F;
			Static440.aFloatArray70[15] = 1.0F;
			Static440.aFloatArray70[7] = 0.0F;
			Static440.aFloatArray70[6] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static440.aFloatArray70);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!jl;)V")
	public void method6861(@OriginalArg(1) Class193_Sub1 arg0) {
		this.method6864(arg0);
		if (arg0.aBoolean397 != this.aBooleanArray26[this.anInt7659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 1, arg0.aBoolean397 ? 1 : 3);
			this.aBooleanArray26[this.anInt7659] = arg0.aBoolean397;
		}
		if (this.aBooleanArray24[this.anInt7659] != arg0.aBoolean398) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 2, arg0.aBoolean398 ? 1 : 3);
			this.aBooleanArray24[this.anInt7659] = arg0.aBoolean398;
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(II)Lclient!kb;")
	@Override
	public Interface14 method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "()V")
	@Override
	protected void method6667() {
		this.anIo1.b(-128);
		super.method6667();
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(B)V")
	@Override
	protected void method6806() {
		@Pc(16) int local16 = this.aBooleanArray25[this.anInt7659] ? Static440.method6866(this.aClass344Array5[this.anInt7659]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, 1, local16);
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
	@Override
	public void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass264_1.method6414()) {
			this.anInt7691 = 0;
			if (ck.b(this.aClass264_1.method6413(), -2005530585)) {
				this.method6863();
			}
		} else if (++this.anInt7691 <= 50) {
			this.method6863();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method6671(@OriginalArg(0) int arg0) {
		this.anIo1.a(-15351);
		super.method6671(arg0);
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "(B)V")
	@Override
	protected void method6745() {
		this.anIDirect3DDevice1.a(27, this.aBoolean574);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!os", name = "L", descriptor = "(I)V")
	@Override
	protected void method6845() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat152 * this.aFloat153, this.aFloat152 * this.aFloat147, this.aFloat146 * this.aFloat152, 0.0F);
		this.aBoolean580 = false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()Z")
	@Override
	public boolean method6664() {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!os", name = "q", descriptor = "(I)V")
	@Override
	protected void method6789() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt7650);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	@Override
	public void method6650(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!os", name = "t", descriptor = "(B)Z")
	private boolean method6863() {
		@Pc(13) int local13 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local13 == 0 || local13 == -2005530519) {
			@Pc(25) Class264 local25 = (Class264) this.anObject20;
			this.method6751();
			local25.method6411();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static440.method6862(this.anInt7665, this.anInt7693, this.anInt7692, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1)) {
				@Pc(62) int local62 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (ck.a(local62, -1)) {
					local25.method6412(this.anIDirect3DDevice1.a(0), this.anIDirect3DDevice1.c());
					this.method6720();
					this.method6833();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!pda;)V")
	public void method6864(@OriginalArg(1) Class193 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt7659, arg0.method8209());
		if (arg0.aClass338_11 != this.aClass338Array1[this.anInt7659]) {
			@Pc(21) int local21 = Static440.method6858(arg0.aClass338_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 5, local21);
			this.aClass338Array1[this.anInt7659] = arg0.aClass338_11;
			if (this.aBooleanArray23[this.anInt7659] != arg0.aBoolean700) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 7, arg0.aBoolean700 ? Static440.method6858(arg0.aClass338_11) : 0);
				this.aBooleanArray23[this.anInt7659] = arg0.aBoolean700;
			}
		} else if (arg0.aBoolean700 != this.aBooleanArray23[this.anInt7659]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt7659, 7, arg0.aBoolean700 ? Static440.method6858(arg0.aClass338_11) : 0);
			this.aBooleanArray23[this.anInt7659] = arg0.aBoolean700;
		}
		if (!this.aBooleanArray25[this.anInt7659]) {
			this.aBooleanArray25[this.anInt7659] = true;
			this.method6740();
			this.method6806();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6834(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass264_1 = (Class264) arg0;
	}

	@OriginalMember(owner = "client!os", name = "y", descriptor = "(I)V")
	@Override
	public void method6821() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray62[0], -this.aFloatArray62[1], -this.aFloatArray62[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray64[0], -this.aFloatArray64[1], -this.aFloatArray64[2]);
		this.aBoolean580 = false;
	}

	@OriginalMember(owner = "client!os", name = "p", descriptor = "(B)V")
	@Override
	protected void method6747() {
		this.anIDirect3DDevice1.a(15, this.aBoolean567);
	}

	@OriginalMember(owner = "client!os", name = "G", descriptor = "(I)V")
	@Override
	protected void method6740() {
		@Pc(22) int local22 = this.aBooleanArray25[this.anInt7659] ? Static440.method6866(this.aClass344Array6[this.anInt7659]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, 4, local22);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6711(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6639(arg2, arg3);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ZI)Lclient!bl;")
	@Override
	public Interface6 method6768(@OriginalArg(0) boolean arg0) {
		return new Class61(this, arg0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method6865(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!os", name = "B", descriptor = "(I)V")
	@Override
	protected void method6844() {
		this.anIDirect3DDevice1.a(14, this.aBoolean566 && this.aBoolean558);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ot;I)V")
	@Override
	public void method6753(@OriginalArg(0) Class207 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!hh;IIILclient!on;)Lclient!cf;")
	@Override
	public Interface7 method6818(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class274 arg3) {
		return new Class193_Sub1(this, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!os", name = "E", descriptor = "(I)V")
	@Override
	protected void method6833() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7658; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass338Array1[local1] = Static673.aClass338_15;
			this.aBooleanArray26[local1] = this.aBooleanArray24[local1] = true;
			this.aBooleanArray23[local1] = false;
			this.anIntArray484[local1] = 0;
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
		this.aBoolean580 = false;
		super.method6833();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!tha;)V")
	@Override
	public void method6665(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)V")
	@Override
	public void method6832(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt7659, 11, arg0);
	}

	@OriginalMember(owner = "client!os", name = "H", descriptor = "(I)V")
	@Override
	protected void method6739() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray68);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIB[BILclient!hh;II)Lclient!cf;")
	@Override
	protected Interface7 method6837(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) Class155 arg3, @OriginalArg(7) int arg4) {
		return new Class193_Sub1(this, arg3, arg4, arg1, arg0, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!os", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(BI)Lclient!oo;")
	@Override
	protected Class23 method6750(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class23_Sub4(this, this.aClass223_90);
		} else if (arg0 == 4) {
			return new Class23_Sub11(this, this.aClass223_90, this.aClass184_6);
		} else if (arg0 == 8) {
			return new Class23_Sub6(this, this.aClass223_90, this.aClass184_6);
		} else {
			return super.method6750(arg0);
		}
	}
}
