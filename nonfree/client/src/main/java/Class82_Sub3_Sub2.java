import jaclib.peer.hea;
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
import jagdx.em;
import jagdx.en;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class82_Sub3_Sub2 extends Class82_Sub3 {

	@OriginalMember(owner = "client!kfa", name = "Zg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!kfa", name = "fh", descriptor = "Z")
	private boolean aBoolean426 = false;

	@OriginalMember(owner = "client!kfa", name = "eh", descriptor = "I")
	private int anInt5864 = 0;

	@OriginalMember(owner = "client!kfa", name = "Ng", descriptor = "Lclient!jaclib/peer/hea;")
	public final hea aHea1;

	@OriginalMember(owner = "client!kfa", name = "Sg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!kfa", name = "Ug", descriptor = "Lclient!bf;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!kfa", name = "Lg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!kfa", name = "Rg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!kfa", name = "Mg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!kfa", name = "Xg", descriptor = "I")
	private final int anInt5863;

	@OriginalMember(owner = "client!kfa", name = "ih", descriptor = "I")
	private final int anInt5865;

	@OriginalMember(owner = "client!kfa", name = "Qg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!kfa", name = "Jg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!kfa", name = "Vg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!kfa", name = "hh", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!kfa", name = "bh", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!kfa", name = "ah", descriptor = "Z")
	public final boolean aBoolean425;

	@OriginalMember(owner = "client!kfa", name = "Kg", descriptor = "Z")
	public final boolean aBoolean424;

	@OriginalMember(owner = "client!kfa", name = "jh", descriptor = "Z")
	public final boolean aBoolean427;

	@OriginalMember(owner = "client!kfa", name = "Yg", descriptor = "[Z")
	private final boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!kfa", name = "Tg", descriptor = "[Z")
	private final boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!kfa", name = "Pg", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!kfa", name = "ch", descriptor = "[I")
	private final int[] anIntArray311;

	@OriginalMember(owner = "client!kfa", name = "gh", descriptor = "[Z")
	private final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!kfa", name = "Og", descriptor = "[Lclient!tha;")
	private final Class324[] aClass324Array1;

	@OriginalMember(owner = "client!kfa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!uu;Ljava/lang/Integer;)Lclient!ha;")
	public static Class82 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class82_Sub3_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) hea local9 = new hea();
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
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(188) D3DPRESENT_PARAMETERS local188 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static293.method5048(arg3, local13, local5, local3, local188)) {
					throw new RuntimeException("");
				}
				local188.EnableAutoDepthStencil = true;
				local188.Windowed = true;
				local188.PresentationInterval = Integer.MIN_VALUE;
				@Pc(214) int local214 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local214 |= 0x10;
				}
				@Pc(239) IDirect3DDevice local239;
				try {
					local239 = local13.a(local3, local5, arg0, local214 | 0x40, local188);
				} catch (@Pc(241) en local241) {
					local239 = local13.a(local3, local5, arg0, local214 | 0x20, local188);
				}
				@Pc(260) Class29 local260 = new Class29(local239.d(0), local239.b());
				local1 = new Class82_Sub3_Sub2(local3, local5, arg0, local9, local13, local239, local260, local188, local18, arg1, arg2, arg3);
				local1.method5033();
				return local1;
			}
		} catch (@Pc(283) RuntimeException local283) {
			if (local1 != null) {
				local1.method6121();
			}
			throw local283;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/hea;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!bf;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!uu;I)V")
	public Class82_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) hea arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class29 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface5 arg9, @OriginalArg(10) Class343 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aHea1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.aClass29_1 = arg6;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anIDirect3D1 = arg4;
			this.aD3DCAPS1 = arg8;
			this.anInt5863 = arg0;
			this.anInt5865 = arg1;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aHea1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aHea1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aHea1);
			this.aPixelBuffer1 = new PixelBuffer(this.aHea1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aHea1);
			new GeometryBuffer(this.aHea1);
			this.aBoolean425 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean406 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt5850 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt5856 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
			this.aBoolean424 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean427 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean412 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean408 = this.anInt5845 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt5863, this.anInt5865, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray18 = new boolean[this.anInt5850];
			this.aBooleanArray17 = new boolean[this.anInt5850];
			this.aBooleanArray16 = new boolean[this.anInt5850];
			this.anIntArray311 = new int[this.anInt5850];
			this.aBooleanArray19 = new boolean[this.anInt5850];
			this.aClass324Array1 = new Class324[this.anInt5850];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(219) Throwable local219) {
			local219.printStackTrace();
			this.method6133();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method4992(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
	}

	@OriginalMember(owner = "client!kfa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!iv;Lclient!jt;I)Z")
	@Override
	public boolean method4994(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class182 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return em.a(this.anIDirect3D1.a(this.anInt5863, local8), (int) -1) && em.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt5863, this.anInt5865, local8.Format, 0, 4, Static293.method5042(arg1, arg0)), (int) -1);
	}

	@OriginalMember(owner = "client!kfa", name = "ab", descriptor = "(I)F")
	@Override
	protected float method5015() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZB)Lclient!js;")
	@Override
	public Interface12 method4985(@OriginalArg(0) boolean arg0) {
		return new Class24(this, Static280.aClass182_9, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "Q", descriptor = "(I)V")
	@Override
	protected void method4979() {
		this.anIDirect3DDevice1.a(14, this.aBoolean405 && this.aBoolean404);
	}

	@OriginalMember(owner = "client!kfa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "()V")
	@Override
	public void method6153() {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILclient!rv;)V")
	@Override
	public void method4995(@OriginalArg(1) int arg0, @OriginalArg(2) Interface22 arg1) {
		@Pc(10) Class37 local10 = (Class37) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local10.anIDirect3DVertexBuffer1, 0, local10.method932());
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(II)Lclient!lh;")
	@Override
	public Interface14 method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZILclient!ip;Z)V")
	@Override
	public void method5034(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) int local5 = 0;
		@Pc(18) byte local18;
		if (arg0 == 1) {
			local18 = 3;
		} else if (arg0 == 2) {
			local18 = 26;
		} else {
			local18 = 2;
		}
		if (arg1) {
			local5 = 32;
		}
		if (arg3) {
			local5 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, local18, Static293.method5047(arg2) | local5);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!tea;I)V")
	public void method5045(@OriginalArg(0) Class262 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt5825, arg0.method8008());
		if (arg0.aClass324_9 != this.aClass324Array1[this.anInt5825]) {
			@Pc(62) int local62 = Static293.method5044(arg0.aClass324_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 6, local62);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 5, local62);
			this.aClass324Array1[this.anInt5825] = arg0.aClass324_9;
			if (arg0.aBoolean703 != this.aBooleanArray19[this.anInt5825]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 7, arg0.aBoolean703 ? Static293.method5044(arg0.aClass324_9) : 0);
				this.aBooleanArray19[this.anInt5825] = arg0.aBoolean703;
			}
		} else if (this.aBooleanArray19[this.anInt5825] != arg0.aBoolean703) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 7, arg0.aBoolean703 ? Static293.method5044(arg0.aClass324_9) : 0);
			this.aBooleanArray19[this.anInt5825] = arg0.aBoolean703;
		}
		if (!this.aBooleanArray18[this.anInt5825]) {
			this.aBooleanArray18[this.anInt5825] = true;
			this.method4912();
			this.method4923();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	@Override
	protected Object method4942(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "()Lclient!er;")
	@Override
	public Class98 method6119() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt5863, 0);
		return new Class98(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method5046(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "z", descriptor = "()Z")
	@Override
	public boolean method6177() {
		return false;
	}

	@OriginalMember(owner = "client!kfa", name = "s", descriptor = "(B)V")
	@Override
	protected void method5007() {
		if (this.aBoolean426) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean426 = true;
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "(B)V")
	@Override
	protected void method4954() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5860; local1++) {
			@Pc(14) Class3_Sub22 local14 = this.aClass3_Sub22Array4[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method8384();
			@Pc(28) float local28 = local14.method8387() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local14.method8391(), (float) local14.method8383(), (float) local14.method8386());
			this.aD3DLIGHT3.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, local28 * (float) (local22 >> 8 & 0xFF), local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method8382() * local14.method8382()));
			this.aD3DLIGHT3.SetRange((float) local14.method8382());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt5837 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4954();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!cc;)V")
	@Override
	public void method4960(@OriginalArg(1) Class43 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "()V")
	@Override
	public void method6130() {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III[BILclient!iv;)Lclient!rj;")
	@Override
	public Interface20 method4970(@OriginalArg(3) byte[] arg0, @OriginalArg(5) Class168 arg1) {
		return new Class262_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "(B)V")
	@Override
	protected void method4955() {
		if (this.aClass117_7.method2812()) {
			this.aClass31_Sub2_18.method7673(Static293.aFloatArray63);
		} else {
			Static293.aFloatArray63[6] = 0.0F;
			Static293.aFloatArray63[14] = 0.0F;
			Static293.aFloatArray63[10] = 1.0F;
			Static293.aFloatArray63[11] = 0.0F;
			Static293.aFloatArray63[4] = 0.0F;
			Static293.aFloatArray63[5] = 1.0F;
			Static293.aFloatArray63[15] = 1.0F;
			Static293.aFloatArray63[3] = 0.0F;
			Static293.aFloatArray63[1] = 0.0F;
			Static293.aFloatArray63[2] = 0.0F;
			Static293.aFloatArray63[8] = 0.0F;
			Static293.aFloatArray63[7] = 0.0F;
			Static293.aFloatArray63[0] = 1.0F;
			Static293.aFloatArray63[9] = 0.0F;
			Static293.aFloatArray63[13] = 0.0F;
			Static293.aFloatArray63[12] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static293.aFloatArray63);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BZ)Lclient!rv;")
	@Override
	public Interface22 method4925(@OriginalArg(1) boolean arg0) {
		return new Class37(this, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILclient!js;Lclient!wi;III)V")
	@Override
	public void method4993(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1, @OriginalArg(3) Class376 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class24) arg1).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static293.method5043(arg2), 0, arg4, arg0, arg5, arg3);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!wi;II)V")
	@Override
	public void method5023(@OriginalArg(1) Class376 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static293.method5043(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZIBLclient!iv;[FI)Lclient!dg;")
	@Override
	protected Interface6 method4984(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(5) Class168 arg2, @OriginalArg(6) float[] arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!kfa", name = "r", descriptor = "(I)V")
	@Override
	protected void method4921() {
		if (this.anIDirect3DVertexShader1 != null || Static466.aClass193_6 == this.aClass193Array3[this.anInt5825]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, 24, 0);
			this.anIntArray311[this.anInt5825] = 0;
			return;
		}
		if (this.aClass193Array3[this.anInt5825] == Static230.aClass193_3) {
			this.anIDirect3DDevice1.SetTransform(this.anInt5825 + 16, this.aClass31_Sub2Array3[this.anInt5825].method7668(Static293.aFloatArray63));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt5825 + 16, this.aClass31_Sub2Array3[this.anInt5825].method7673(Static293.aFloatArray63));
		}
		@Pc(65) int local65 = Static293.method5053(this.aClass193Array3[this.anInt5825]);
		if (this.anIntArray311[this.anInt5825] != local65) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, 24, local65);
			this.anIntArray311[this.anInt5825] = local65;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "(II)Lclient!kl;")
	@Override
	protected Class19 method4966(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class19_Sub11(this, this.aClass343_148);
		} else if (arg0 == 4) {
			return new Class19_Sub10(this, this.aClass343_148, this.lb);
		} else if (arg0 == 8) {
			return new Class19_Sub6(this, this.aClass343_148, this.lb);
		} else {
			return super.method4966(arg0);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4968(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!he;Lclient!he;FLclient!he;)Lclient!he;")
	@Override
	public Class141 method6150(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method4962(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (this.aCanvas9 != arg1) {
			return;
		}
		@Pc(7) Dimension local7 = arg1.getSize();
		if (local7.width > 0 && local7.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method5049();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!sga;I)V")
	@Override
	public void method4963(@OriginalArg(0) Class306 arg0) {
		@Pc(8) int local8 = 0;
		if (Static637.aClass306_5 == arg0) {
			local8 = 65536;
		} else if (Static438.aClass306_3 == arg0) {
			local8 = 131072;
		} else if (arg0 == Static258.aClass306_1) {
			local8 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, 11, this.anInt5825 | local8);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4920(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIZ[III)Lclient!dg;")
	@Override
	public Interface6 method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		return new Class262_Sub1(this, arg2, arg5, arg3, arg4, 0, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "z", descriptor = "(I)V")
	@Override
	protected void method4938() {
		if (this.aBooleanArray18[this.anInt5825]) {
			this.aBooleanArray18[this.anInt5825] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt5825, (IDirect3DBaseTexture) null);
			this.method4912();
			this.method4923();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "t", descriptor = "()V")
	@Override
	public void method6162() {
	}

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "(B)V")
	@Override
	protected void method4975() {
		this.method4932();
		this.method5007();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6109(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kfa", name = "C", descriptor = "(I)V")
	@Override
	protected void method4943() {
		this.anIDirect3DDevice1.a(174, this.aBoolean423);
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(II)V")
	@Override
	public void method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass29_1.method515()) {
			this.anInt5864 = 0;
			if (em.a(this.aClass29_1.method512(), (byte) -94)) {
				this.method5049();
			}
		} else if (++this.anInt5864 <= 50) {
			this.method5049();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!kfa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (em.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (int) -1) && em.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), (int) -1)) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(66) int local66 = 0; local66 < arg3; local66++) {
					this.aPixelBuffer1.b(local1, arg2 * local66, local55 * local66, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(-10573);
		local16.b(-10573);
		return local1;
	}

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5040() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt5855);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6102(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6148(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6166(arg2, arg3);
	}

	@OriginalMember(owner = "client!kfa", name = "J", descriptor = "(I)V")
	@Override
	protected void method4959() {
		this.anIDirect3DDevice1.SetViewport(this.anInt5854, this.anInt5851, this.anInt5688, this.anInt5782, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!kfa", name = "A", descriptor = "(I)V")
	@Override
	protected void method4940() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray59);
	}

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "(I)V")
	@Override
	protected void method4910() {
		this.anIDirect3DDevice1.a(7, this.aBoolean414);
	}

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "(I)V")
	@Override
	protected void method4909() {
		this.anIDirect3DDevice1.a(27, this.aBoolean418);
	}

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "(I)V")
	@Override
	protected void method4911() {
		this.aFloat122 = (float) (this.anInt5827 - this.anInt5830);
		this.aFloat132 = (float) -this.anInt5844 + this.aFloat122;
		if (this.aFloat132 < (float) this.anInt5828) {
			this.aFloat132 = (float) this.anInt5828;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat132);
		this.anIDirect3DDevice1.a(37, this.aFloat122);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt5843);
	}

	@OriginalMember(owner = "client!kfa", name = "G", descriptor = "(I)V")
	@Override
	public void method4950() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray54[0], -this.aFloatArray54[1], -this.aFloatArray54[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray55[0], -this.aFloatArray55[1], -this.aFloatArray55[2]);
		this.aBoolean426 = false;
	}

	@OriginalMember(owner = "client!kfa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "(Z)Z")
	private boolean method5049() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(24) Class29 local24 = (Class29) this.anObject15;
			this.method5036();
			local24.method513();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static293.method5048(this.anInt5845, this.anIDirect3D1, this.anInt5865, this.anInt5863, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(58) int local58 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (em.a(local58, (int) -1)) {
					local24.method514(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.d(0));
					this.method4926();
					this.method5037();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLclient!jagdx/IDirect3DVertexShader;)V")
	public void method5050(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method4921();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(II)Lclient!pw;")
	@Override
	public Interface19 method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!pw;Lclient!lh;)Lclient!di;")
	@Override
	public Interface7 method6143(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface14 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kfa", name = "u", descriptor = "()V")
	@Override
	public void method6167() {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILclient!jt;Lclient!iv;I)Lclient!dg;")
	@Override
	public Interface6 method5008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class168 arg3) {
		return new Class262_Sub1(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB[[IZ)Lclient!pda;")
	@Override
	public Interface18 method5003(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class262_Sub3(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!kfa", name = "r", descriptor = "()V")
	@Override
	public void method6157() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (em.a(local3.Issue(), (int) -1)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(-10573);
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(B)V")
	@Override
	protected void method4912() {
		@Pc(15) int local15 = this.aBooleanArray18[this.anInt5825] ? Static293.method5051(this.aClass88Array6[this.anInt5825]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, 4, local15);
	}

	@OriginalMember(owner = "client!kfa", name = "P", descriptor = "(I)V")
	@Override
	protected void method4978() {
		this.anIDirect3DDevice1.a(15, this.aBoolean403);
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
	@Override
	protected void method4906() {
		if (this.aBoolean402) {
			Static293.aFloatArray63[2] = 0.0F;
			Static293.aFloatArray63[3] = 0.0F;
			Static293.aFloatArray63[9] = 0.0F;
			Static293.aFloatArray63[4] = 0.0F;
			Static293.aFloatArray63[14] = 0.0F;
			Static293.aFloatArray63[6] = 0.0F;
			Static293.aFloatArray63[7] = 0.0F;
			Static293.aFloatArray63[12] = 0.0F;
			Static293.aFloatArray63[0] = 1.0F;
			Static293.aFloatArray63[1] = 0.0F;
			Static293.aFloatArray63[5] = 1.0F;
			Static293.aFloatArray63[11] = 0.0F;
			Static293.aFloatArray63[15] = 1.0F;
			Static293.aFloatArray63[10] = 1.0F;
			Static293.aFloatArray63[8] = 0.0F;
			Static293.aFloatArray63[13] = 0.0F;
		} else {
			this.aClass31_Sub2_15.method7673(Static293.aFloatArray63);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static293.aFloatArray63);
	}

	@OriginalMember(owner = "client!kfa", name = "w", descriptor = "(B)V")
	@Override
	protected void method5030() {
		this.anIDirect3DDevice1.a(137, this.aBoolean417 && !this.aBoolean407);
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4923() {
		@Pc(15) int local15 = this.aBooleanArray18[this.anInt5825] ? Static293.method5051(this.aClass88Array5[this.anInt5825]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, 1, local15);
	}

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "(B)V")
	@Override
	protected void method4987() {
		if (this.aClass54_6 == Static170.aClass54_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static436.aClass54_7 == this.aClass54_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass54_6 == Static222.aClass54_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "W", descriptor = "(I)V")
	@Override
	protected void method5000() {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!di;)V")
	@Override
	public void method6141(@OriginalArg(0) Interface7 arg0) {
	}

	@OriginalMember(owner = "client!kfa", name = "hb", descriptor = "(I)V")
	@Override
	protected void method5037() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5850; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass324Array1[local1] = Static468.aClass324_7;
			this.aBooleanArray17[local1] = this.aBooleanArray16[local1] = true;
			this.aBooleanArray19[local1] = false;
			this.anIntArray311[local1] = 0;
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
		this.aBoolean426 = false;
		super.method5037();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!jt;Lclient!iv;B)Z")
	@Override
	public boolean method5005(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class168 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return em.a(this.anIDirect3D1.a(this.anInt5863, local8), (int) -1) && em.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt5863, this.anInt5865, local8.Format, 0, 3, Static293.method5042(arg0, arg1)), (int) -1);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!pba;)V")
	public void method5052(@OriginalArg(1) Class262_Sub1 arg0) {
		this.method5045(arg0);
		if (this.aBooleanArray17[this.anInt5825] != arg0.aBoolean531) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 1, arg0.aBoolean531 ? 1 : 3);
			this.aBooleanArray17[this.anInt5825] = arg0.aBoolean531;
		}
		if (arg0.aBoolean530 != this.aBooleanArray16[this.anInt5825]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 2, arg0.aBoolean530 ? 1 : 3);
			this.aBooleanArray16[this.anInt5825] = arg0.aBoolean530;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZLclient!ip;)V")
	@Override
	protected void method4953(@OriginalArg(1) int arg0, @OriginalArg(3) Class165 arg1) {
		@Pc(14) byte local14;
		if (arg0 == 1) {
			local14 = 6;
		} else if (arg0 == 2) {
			local14 = 27;
		} else {
			local14 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, local14, Static293.method5047(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([Lclient!pj;I)Lclient!cc;")
	@Override
	public Class43 method4976(@OriginalArg(0) Class268[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I[BIILclient!iv;IBZ)Lclient!dg;")
	@Override
	protected Interface6 method5006(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) Class168 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) boolean arg4) {
		return new Class262_Sub1(this, arg2, arg3, arg0, arg4, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6103() {
		return false;
	}

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "(I)V")
	@Override
	protected void method4914() {
		this.anIDirect3DDevice1.a(28, this.aBoolean411 && this.aBoolean421 && this.anInt5844 >= 0);
	}

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "()V")
	@Override
	protected void method6121() {
		this.aHea1.b(-27744);
		super.method6121();
	}

	@OriginalMember(owner = "client!kfa", name = "F", descriptor = "(I)V")
	@Override
	protected void method4949() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat123 * this.aFloat137, this.aFloat123 * this.aFloat135, this.aFloat124 * this.aFloat123, 0.0F);
		this.aBoolean426 = false;
	}

	@OriginalMember(owner = "client!kfa", name = "w", descriptor = "(I)V")
	@Override
	protected void method4932() {
		@Pc(7) float local7 = this.aBoolean419 ? this.aFloat138 : 0.0F;
		@Pc(16) float local16 = this.aBoolean419 ? -this.aFloat136 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local7 * this.aFloat137, this.aFloat135 * local7, local7 * this.aFloat124, (float) 0);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat137 * local16, this.aFloat135 * local16, this.aFloat124 * local16, 0.0F);
		this.aBoolean426 = false;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!tfa;I)V")
	public void method5054(@OriginalArg(0) Class262_Sub2 arg0) {
		this.method5045(arg0);
		if (!this.aBooleanArray17[this.anInt5825]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 1, 1);
			this.aBooleanArray17[this.anInt5825] = true;
		}
		if (!this.aBooleanArray16[this.anInt5825]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt5825, 2, 1);
			this.aBooleanArray16[this.anInt5825] = true;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6132(@OriginalArg(0) int arg0) {
		this.aHea1.a(-23514);
		super.method6132(arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "(II)V")
	@Override
	public void method5038(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt5825, 11, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4957(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass29_1 = (Class29) arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "(I)V")
	@Override
	protected void method4929() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt5848 + this.anInt5854, this.anInt5851 + this.anInt5852, this.anInt5833, this.anInt5849);
	}
}
