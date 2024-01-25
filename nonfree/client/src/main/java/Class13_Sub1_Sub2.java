import jaclib.peer.ge;
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
import jagdx.hl;
import jagdx.ud;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rja")
public final class Class13_Sub1_Sub2 extends Class13_Sub1 {

	@OriginalMember(owner = "client!rja", name = "Gg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!rja", name = "Tg", descriptor = "I")
	private int anInt8638 = 0;

	@OriginalMember(owner = "client!rja", name = "bh", descriptor = "Z")
	private boolean aBoolean672 = false;

	@OriginalMember(owner = "client!rja", name = "Rg", descriptor = "I")
	private final int anInt8637;

	@OriginalMember(owner = "client!rja", name = "Lg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!rja", name = "Ng", descriptor = "Lclient!jaclib/peer/ge;")
	public final ge aGe1;

	@OriginalMember(owner = "client!rja", name = "Sg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!rja", name = "Hg", descriptor = "I")
	private final int anInt8636;

	@OriginalMember(owner = "client!rja", name = "Mg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!rja", name = "Og", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!rja", name = "Pg", descriptor = "Lclient!sg;")
	private Class317 aClass317_1;

	@OriginalMember(owner = "client!rja", name = "Fg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!rja", name = "Wg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!rja", name = "Dg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!rja", name = "Kg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!rja", name = "Qg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!rja", name = "Ig", descriptor = "Z")
	public final boolean aBoolean669;

	@OriginalMember(owner = "client!rja", name = "Vg", descriptor = "Z")
	public final boolean aBoolean670;

	@OriginalMember(owner = "client!rja", name = "Zg", descriptor = "Z")
	public final boolean aBoolean671;

	@OriginalMember(owner = "client!rja", name = "Eg", descriptor = "[I")
	private final int[] anIntArray735;

	@OriginalMember(owner = "client!rja", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray41;

	@OriginalMember(owner = "client!rja", name = "dh", descriptor = "[Z")
	private final boolean[] aBooleanArray42;

	@OriginalMember(owner = "client!rja", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray40;

	@OriginalMember(owner = "client!rja", name = "Ug", descriptor = "[Lclient!wga;")
	private final Class385[] aClass385Array1;

	@OriginalMember(owner = "client!rja", name = "eh", descriptor = "[Z")
	private final boolean[] aBooleanArray43;

	@OriginalMember(owner = "client!rja", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!aj;Ljava/lang/Integer;)Lclient!ha;")
	private static Class13 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class13_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) ge local9 = new ge();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(188) D3DPRESENT_PARAMETERS local188 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static525.method7554(local188, local5, local13, local3, arg3)) {
					throw new RuntimeException("");
				}
				local188.PresentationInterval = Integer.MIN_VALUE;
				local188.EnableAutoDepthStencil = true;
				local188.Windowed = true;
				@Pc(213) int local213 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local213 |= 0x10;
				}
				@Pc(235) IDirect3DDevice local235;
				try {
					local235 = local13.a(local3, local5, arg0, local213 | 0x40, local188);
				} catch (@Pc(237) hl local237) {
					local235 = local13.a(local3, local5, arg0, local213 | 0x20, local188);
				}
				@Pc(256) Class317 local256 = new Class317(local235.b(0), local235.c());
				local1 = new Class13_Sub1_Sub2(local3, local5, arg0, local9, local13, local235, local256, local188, local18, arg1, arg2, arg3);
				local1.method7421();
				return local1;
			}
		} catch (@Pc(279) RuntimeException local279) {
			if (local1 != null) {
				local1.method8455();
			}
			throw local279;
		}
	}

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/ge;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!sg;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!aj;I)V")
	public Class13_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) ge arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class317 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class15 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt8637 = arg1;
			this.anIDirect3DDevice1 = arg5;
			this.aGe1 = arg3;
			this.anIDirect3D1 = arg4;
			this.anInt8636 = arg0;
			this.aD3DCAPS1 = arg8;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aClass317_1 = arg6;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aGe1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aGe1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aGe1);
			this.aPixelBuffer1 = new PixelBuffer(this.aGe1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aGe1);
			new GeometryBuffer(this.aGe1);
			this.aBoolean669 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean654 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean660 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt8612 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean670 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.anInt8620 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean671 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean666 = this.anInt8618 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt8636, this.anInt8637, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.anIntArray735 = new int[this.anInt8620];
			this.aBooleanArray41 = new boolean[this.anInt8620];
			this.aBooleanArray42 = new boolean[this.anInt8620];
			this.aBooleanArray40 = new boolean[this.anInt8620];
			this.aClass385Array1 = new Class385[this.anInt8620];
			this.aBooleanArray43 = new boolean[this.anInt8620];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(223) Throwable local223) {
			local223.printStackTrace();
			this.method8459();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(Z)V")
	@Override
	protected void method7433() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8633; local1++) {
			@Pc(14) Class3_Sub15 local14 = this.aClass3_Sub15Array5[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(22) int local22 = local14.method8377();
			@Pc(28) float local28 = local14.method8381() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method8384(), (float) local14.method8380(), (float) local14.method8383());
			this.aD3DLIGHT1.SetDiffuse((float) (local22 >> 16 & 0xFF) * local28, (float) (local22 >> 8 & 0xFF) * local28, local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method8378() * local14.method8378()));
			this.aD3DLIGHT1.SetRange((float) local14.method8378());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (local1 < this.anInt8615) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7433();
	}

	@OriginalMember(owner = "client!rja", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rja", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.a(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (ud.a(0, (int) this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && ud.a(0, (int) local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(76) int local76 = 0; local76 < arg3; local76++) {
					this.aPixelBuffer1.b(local1, local76 * arg2, local76 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b((byte) -70);
		local16.b((byte) -70);
		return local1;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!wt;IIB)V")
	@Override
	public void method7449(@OriginalArg(0) Class393 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static525.method7552(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!rja", name = "v", descriptor = "(I)V")
	@Override
	protected void method7441() {
		if (this.aClass232_6.method5542()) {
			this.aClass239_Sub3_18.method9266(Static525.aFloatArray74);
		} else {
			Static525.aFloatArray74[10] = 1.0F;
			Static525.aFloatArray74[14] = 0.0F;
			Static525.aFloatArray74[12] = 0.0F;
			Static525.aFloatArray74[13] = 0.0F;
			Static525.aFloatArray74[0] = 1.0F;
			Static525.aFloatArray74[15] = 1.0F;
			Static525.aFloatArray74[2] = 0.0F;
			Static525.aFloatArray74[4] = 0.0F;
			Static525.aFloatArray74[1] = 0.0F;
			Static525.aFloatArray74[3] = 0.0F;
			Static525.aFloatArray74[6] = 0.0F;
			Static525.aFloatArray74[7] = 0.0F;
			Static525.aFloatArray74[11] = 0.0F;
			Static525.aFloatArray74[5] = 1.0F;
			Static525.aFloatArray74[9] = 0.0F;
			Static525.aFloatArray74[8] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static525.aFloatArray74);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I[IIIZII)Lclient!ec;")
	@Override
	public Interface7 method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg2, arg5, arg4, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!bfa;Lclient!tq;)Lclient!vv;")
	@Override
	public Interface26 method8529(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rja", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7505(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I[FLclient!sw;IIIIZ)Lclient!ec;")
	@Override
	protected Interface7 method7456(@OriginalArg(1) float[] arg0, @OriginalArg(2) Class327 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!rja", name = "C", descriptor = "(I)F")
	@Override
	protected float method7458() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!rja", name = "U", descriptor = "(I)V")
	@Override
	protected void method7516() {
		@Pc(19) int local19 = this.aBooleanArray42[this.anInt8601] ? Static525.method7547(this.aClass203Array6[this.anInt8601]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, 1, local19);
	}

	@OriginalMember(owner = "client!rja", name = "o", descriptor = "(I)V")
	@Override
	protected void method7428() {
		if (this.aBoolean672) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean672 = true;
	}

	@OriginalMember(owner = "client!rja", name = "p", descriptor = "()V")
	@Override
	public void method8490() {
	}

	@OriginalMember(owner = "client!rja", name = "h", descriptor = "(B)V")
	@Override
	protected void method7443() {
		this.aFloat175 = (float) (this.anInt8600 - this.anInt8621);
		this.aFloat174 = (float) -this.anInt8627 + this.aFloat175;
		if (this.aFloat174 < (float) this.anInt8608) {
			this.aFloat174 = (float) this.anInt8608;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat174);
		this.anIDirect3DDevice1.a(37, this.aFloat175);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8598);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!sw;ILclient!ig;)Z")
	@Override
	public boolean method7425(@OriginalArg(0) Class327 arg0, @OriginalArg(2) Class152 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return ud.a(0, (int) this.anIDirect3D1.a(this.anInt8636, local10)) && ud.a(0, (int) this.anIDirect3D1.CheckDeviceFormat(this.anInt8636, this.anInt8637, local10.Format, 0, 3, Static525.method7553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IILclient!oh;IIZLclient!wt;)V")
	@Override
	public void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class393 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class316) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static525.method7552(arg5), 0, arg3, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILclient!jagdx/IDirect3DVertexShader;)V")
	public void method7545(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method7419();
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(BLclient!jagdx/IDirect3DPixelShader;)V")
	public void method7546(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!rja", name = "o", descriptor = "()V")
	@Override
	public void method8483() {
	}

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "(II)Lclient!tq;")
	@Override
	public Interface25 method8509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(BZI[[I)Lclient!fn;")
	@Override
	public Interface10 method7513(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class135_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!rja", name = "y", descriptor = "()Z")
	@Override
	public boolean method8524() {
		return false;
	}

	@OriginalMember(owner = "client!rja", name = "x", descriptor = "()Lclient!cja;")
	@Override
	public Class61 method8522() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt8636, 0);
		return new Class61(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILclient!aga;)V")
	@Override
	public void method7408(@OriginalArg(1) Class10 arg0) {
		@Pc(1) int local1 = 0;
		if (Static263.aClass10_1 == arg0) {
			local1 = 65536;
		} else if (Static437.aClass10_2 == arg0) {
			local1 = 131072;
		} else if (Static660.aClass10_4 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, 11, this.anInt8601 | local1);
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(II)V")
	@Override
	public void method8484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass317_1.method7831()) {
			this.anInt8638 = 0;
			if (ud.a(this.aClass317_1.method7834(), (byte) -100)) {
				this.method7555();
			}
		} else if (++this.anInt8638 <= 50) {
			this.method7555();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!rja", name = "u", descriptor = "(I)V")
	@Override
	protected void method7438() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8599 + this.anInt8631, this.anInt8603 + this.anInt8628, this.anInt8605, this.anInt8622);
	}

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "(B)V")
	@Override
	protected void method7419() {
		if (this.anIDirect3DVertexShader7 != null || this.aClass94Array3[this.anInt8601] == Static111.aClass94_3) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, 24, 0);
			this.anIntArray735[this.anInt8601] = 0;
			return;
		}
		if (Static178.aClass94_4 == this.aClass94Array3[this.anInt8601]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8601 + 16, this.aClass239_Sub3Array3[this.anInt8601].method9251(Static525.aFloatArray74));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8601 + 16, this.aClass239_Sub3Array3[this.anInt8601].method9266(Static525.aFloatArray74));
		}
		@Pc(72) int local72 = Static525.method7548(this.aClass94Array3[this.anInt8601]);
		if (local72 != this.anIntArray735[this.anInt8601]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, 24, local72);
			this.anIntArray735[this.anInt8601] = local72;
		}
	}

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "(II)Lclient!bfa;")
	@Override
	public Interface2 method8502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rja", name = "A", descriptor = "()V")
	@Override
	public void method8530() {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ZLclient!sw;II[BIII)Lclient!ec;")
	@Override
	protected Interface7 method7418(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		return new Class135_Sub3(this, arg1, arg4, arg2, arg0, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!rja", name = "j", descriptor = "(Z)V")
	@Override
	protected void method7524() {
		this.anIDirect3DDevice1.a(137, this.aBoolean664 && !this.aBoolean662);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7538(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!vu;I)V")
	public void method7550(@OriginalArg(0) Class135 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8601, arg0.method5798());
		if (this.aClass385Array1[this.anInt8601] != arg0.aClass385_21) {
			@Pc(64) int local64 = Static525.method7544(arg0.aClass385_21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 6, local64);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 5, local64);
			this.aClass385Array1[this.anInt8601] = arg0.aClass385_21;
			if (this.aBooleanArray40[this.anInt8601] != arg0.aBoolean458) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 7, arg0.aBoolean458 ? Static525.method7544(arg0.aClass385_21) : 0);
				this.aBooleanArray40[this.anInt8601] = arg0.aBoolean458;
			}
		} else if (arg0.aBoolean458 != this.aBooleanArray40[this.anInt8601]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 7, arg0.aBoolean458 ? Static525.method7544(arg0.aClass385_21) : 0);
			this.aBooleanArray40[this.anInt8601] = arg0.aBoolean458;
		}
		if (!this.aBooleanArray42[this.anInt8601]) {
			this.aBooleanArray42[this.anInt8601] = true;
			this.method7416();
			this.method7516();
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7430(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!rja", name = "L", descriptor = "(I)V")
	@Override
	public void method7490() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray72[0], -this.aFloatArray72[1], -this.aFloatArray72[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray70[0], -this.aFloatArray70[1], -this.aFloatArray70[2]);
		this.aBoolean672 = false;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method7551(@OriginalArg(0) Class135_Sub3 arg0) {
		this.method7550(arg0);
		if (arg0.aBoolean460 != this.aBooleanArray43[this.anInt8601]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 1, arg0.aBoolean460 ? 1 : 3);
			this.aBooleanArray43[this.anInt8601] = arg0.aBoolean460;
		}
		if (arg0.aBoolean459 != this.aBooleanArray41[this.anInt8601]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 2, arg0.aBoolean459 ? 1 : 3);
			this.aBooleanArray41[this.anInt8601] = arg0.aBoolean459;
		}
	}

	@OriginalMember(owner = "client!rja", name = "n", descriptor = "(B)V")
	@Override
	protected void method7468() {
		if (Static581.aClass99_7 == this.aClass99_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (Static583.aClass99_9 == this.aClass99_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static356.aClass99_2 == this.aClass99_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!id;II)V")
	@Override
	public void method7423(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class297 local2 = (Class297) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method7208());
	}

	@OriginalMember(owner = "client!rja", name = "r", descriptor = "(B)V")
	@Override
	protected void method7502() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8631, this.anInt8628, this.anInt8516, this.anInt8556, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!rja", name = "z", descriptor = "(I)V")
	@Override
	protected void method7450() {
		this.anIDirect3DDevice1.a(174, this.aBoolean668);
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(Z)V")
	@Override
	public void method8512(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8473(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8484(arg2, arg3);
	}

	@OriginalMember(owner = "client!rja", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!rja", name = "ib", descriptor = "(I)Z")
	private boolean method7555() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(20) Class317 local20 = (Class317) this.anObject18;
			this.method7453();
			local20.method7833();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static525.method7554(this.aD3DPRESENT_PARAMETERS1, this.anInt8637, this.anIDirect3D1, this.anInt8636, this.anInt8618)) {
				@Pc(54) int local54 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (ud.a(0, (int) local54)) {
					local20.method7832(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.c());
					this.method7528();
					this.method7442();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rja", name = "R", descriptor = "(I)V")
	@Override
	protected void method7506() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray71);
	}

	@OriginalMember(owner = "client!rja", name = "P", descriptor = "(I)V")
	@Override
	protected void method7503() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat176 * this.aFloat172, this.aFloat187 * this.aFloat172, this.aFloat172 * this.aFloat181, 0.0F);
		this.aBoolean672 = false;
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "()Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method7463(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass317_1 = (Class317) arg1;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IILclient!ig;Lclient!sw;I)Lclient!ec;")
	@Override
	public Interface7 method7535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) Class327 arg3) {
		return new Class135_Sub3(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "([Lclient!rd;B)Lclient!nc;")
	@Override
	public Class233 method7427(@OriginalArg(0) Class298[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "k", descriptor = "(I)V")
	@Override
	protected void method7416() {
		@Pc(15) int local15 = this.aBooleanArray42[this.anInt8601] ? Static525.method7547(this.aClass203Array5[this.anInt8601]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, 4, local15);
	}

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "(IZ)V")
	@Override
	public void method7531(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!sw;III[BI)Lclient!oo;")
	@Override
	public Interface21 method7447(@OriginalArg(0) Class327 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class135_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!rja", name = "m", descriptor = "(I)V")
	@Override
	protected void method7422() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8616);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7488(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas11) {
			return;
		}
		@Pc(15) Dimension local15 = arg0.getSize();
		if (local15.width > 0 && local15.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method7555();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!rja", name = "j", descriptor = "(II)Lclient!aba;")
	@Override
	protected Class4 method7540(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class4_Sub6(this, this.aClass15_132);
		} else if (arg0 == 4) {
			return new Class4_Sub7(this, this.aClass15_132, this.aClass202_6);
		} else if (arg0 == 8) {
			return new Class4_Sub10(this, this.aClass15_132, this.aClass202_6);
		} else {
			return super.method7540(arg0);
		}
	}

	@OriginalMember(owner = "client!rja", name = "fb", descriptor = "(I)V")
	@Override
	protected void method7537() {
		if (this.aBoolean647) {
			Static525.aFloatArray74[8] = 0.0F;
			Static525.aFloatArray74[12] = 0.0F;
			Static525.aFloatArray74[0] = 1.0F;
			Static525.aFloatArray74[7] = 0.0F;
			Static525.aFloatArray74[5] = 1.0F;
			Static525.aFloatArray74[3] = 0.0F;
			Static525.aFloatArray74[6] = 0.0F;
			Static525.aFloatArray74[2] = 0.0F;
			Static525.aFloatArray74[4] = 0.0F;
			Static525.aFloatArray74[1] = 0.0F;
			Static525.aFloatArray74[9] = 0.0F;
			Static525.aFloatArray74[11] = 0.0F;
			Static525.aFloatArray74[14] = 0.0F;
			Static525.aFloatArray74[13] = 0.0F;
			Static525.aFloatArray74[15] = 1.0F;
			Static525.aFloatArray74[10] = 1.0F;
		} else {
			this.aClass239_Sub3_15.method9266(Static525.aFloatArray74);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static525.aFloatArray74);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!lba;I)V")
	public void method7556(@OriginalArg(0) Class135_Sub2 arg0) {
		this.method7550(arg0);
		if (!this.aBooleanArray43[this.anInt8601]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 1, 1);
			this.aBooleanArray43[this.anInt8601] = true;
		}
		if (!this.aBooleanArray41[this.anInt8601]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8601, 2, 1);
			this.aBooleanArray41[this.anInt8601] = true;
		}
	}

	@OriginalMember(owner = "client!rja", name = "f", descriptor = "(IZ)Lclient!id;")
	@Override
	public Interface15 method7541(@OriginalArg(1) boolean arg0) {
		return new Class297(this, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "o", descriptor = "(B)V")
	@Override
	protected void method7471() {
		this.anIDirect3DDevice1.a(28, this.aBoolean649 && this.aBoolean655 && this.anInt8627 >= 0);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8491(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method8519(@OriginalArg(0) Interface26 arg0) {
	}

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "()V")
	@Override
	protected void method8455() {
		this.aGe1.b((byte) 83);
		super.method8455();
	}

	@OriginalMember(owner = "client!rja", name = "q", descriptor = "(I)V")
	@Override
	protected void method7432() {
		this.anIDirect3DDevice1.a(27, this.aBoolean661);
	}

	@OriginalMember(owner = "client!rja", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "()V")
	@Override
	public void method8457() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (ud.a(0, (int) local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b((byte) -70);
	}

	@OriginalMember(owner = "client!rja", name = "h", descriptor = "(II)V")
	@Override
	public void method7527(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, 11, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class35 method8477(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class35 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!rja", name = "f", descriptor = "(Z)V")
	@Override
	protected void method7470() {
		this.anIDirect3DDevice1.a(7, this.aBoolean652);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ZZBILclient!ss;)V")
	@Override
	public void method7498(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class326 arg3) {
		@Pc(13) byte local13;
		if (arg2 == 1) {
			local13 = 3;
		} else if (arg2 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(21) int local21 = 0;
		if (arg0) {
			local21 = 32;
		}
		if (arg1) {
			local21 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, local13, Static525.method7549(arg3) | local21);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IZ)Lclient!oh;")
	@Override
	public Interface20 method7435(@OriginalArg(1) boolean arg0) {
		return new Class316(this, Static246.aClass152_11, arg0);
	}

	@OriginalMember(owner = "client!rja", name = "w", descriptor = "(I)V")
	@Override
	protected void method7442() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8620; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass385Array1[local1] = Static198.aClass385_42;
			this.aBooleanArray43[local1] = this.aBooleanArray41[local1] = true;
			this.aBooleanArray40[local1] = false;
			this.anIntArray735[local1] = 0;
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
		this.aBoolean672 = false;
		super.method7442();
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!sw;Lclient!ig;Z)Z")
	@Override
	public boolean method7448(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class152 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = new D3DDISPLAYMODE();
		return ud.a(0, (int) this.anIDirect3D1.a(this.anInt8636, local10)) && ud.a(0, (int) this.anIDirect3D1.CheckDeviceFormat(this.anInt8636, this.anInt8637, local10.Format, 0, 4, Static525.method7553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!rja", name = "l", descriptor = "(B)V")
	@Override
	protected void method7460() {
	}

	@OriginalMember(owner = "client!rja", name = "q", descriptor = "(B)V")
	@Override
	protected void method7494() {
		@Pc(11) float local11 = this.aBoolean651 ? this.aFloat183 : 0.0F;
		@Pc(20) float local20 = this.aBoolean651 ? -this.aFloat179 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local11 * this.aFloat176, this.aFloat187 * local11, this.aFloat181 * local11, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(local20 * this.aFloat176, local20 * this.aFloat187, this.aFloat181 * local20, 0.0F);
		this.aBoolean672 = false;
	}

	@OriginalMember(owner = "client!rja", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8516(@OriginalArg(0) int arg0) {
		this.aGe1.a(true);
		super.method8516(arg0);
	}

	@OriginalMember(owner = "client!rja", name = "m", descriptor = "()V")
	@Override
	public void method8480() {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!nc;B)V")
	@Override
	public void method7472(@OriginalArg(0) Class233 arg0) {
		@Pc(6) dxVertexLayout local6 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local6.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!rja", name = "j", descriptor = "(I)V")
	@Override
	protected void method7415() {
		this.method7494();
		this.method7428();
	}

	@OriginalMember(owner = "client!rja", name = "s", descriptor = "(I)V")
	@Override
	protected void method7436() {
		this.anIDirect3DDevice1.a(15, this.aBoolean653);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!ss;ZZI)V")
	@Override
	protected void method7475(@OriginalArg(0) Class326 arg0, @OriginalArg(3) int arg1) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 6;
		} else if (arg1 == 2) {
			local12 = 27;
		} else {
			local12 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8601, local12, Static525.method7549(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!rja", name = "m", descriptor = "(B)V")
	@Override
	protected void method7462() {
		if (this.aBooleanArray42[this.anInt8601]) {
			this.aBooleanArray42[this.anInt8601] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8601, (IDirect3DBaseTexture) null);
			this.method7416();
			this.method7516();
		}
	}

	@OriginalMember(owner = "client!rja", name = "y", descriptor = "(I)V")
	@Override
	protected void method7445() {
		this.anIDirect3DDevice1.a(14, this.aBoolean663 && this.aBoolean650);
	}
}
