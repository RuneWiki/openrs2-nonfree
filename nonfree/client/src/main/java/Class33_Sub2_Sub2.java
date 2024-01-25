import jaclib.peer.pba;
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
import jagdx.aha;
import jagdx.jha;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class33_Sub2_Sub2 extends Class33_Sub2 {

	@OriginalMember(owner = "client!us", name = "Tg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!us", name = "Sg", descriptor = "Z")
	private boolean aBoolean757 = false;

	@OriginalMember(owner = "client!us", name = "Zg", descriptor = "I")
	private int anInt9683 = 0;

	@OriginalMember(owner = "client!us", name = "ih", descriptor = "Lclient!dfa;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!us", name = "Kg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!us", name = "Vg", descriptor = "Lclient!jaclib/peer/pba;")
	public final pba aPba1;

	@OriginalMember(owner = "client!us", name = "Wg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!us", name = "Yg", descriptor = "I")
	private final int anInt9682;

	@OriginalMember(owner = "client!us", name = "fh", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!us", name = "jh", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!us", name = "eh", descriptor = "I")
	private final int anInt9684;

	@OriginalMember(owner = "client!us", name = "ah", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!us", name = "Xg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!us", name = "hh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!us", name = "bh", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!us", name = "Ug", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!us", name = "Qg", descriptor = "Z")
	public final boolean aBoolean756;

	@OriginalMember(owner = "client!us", name = "dh", descriptor = "Z")
	public final boolean aBoolean758;

	@OriginalMember(owner = "client!us", name = "Lg", descriptor = "Z")
	public final boolean aBoolean755;

	@OriginalMember(owner = "client!us", name = "Og", descriptor = "[I")
	private final int[] anIntArray664;

	@OriginalMember(owner = "client!us", name = "Jg", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!us", name = "gh", descriptor = "[Z")
	private final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!us", name = "Rg", descriptor = "[Lclient!ko;")
	private final Class198[] aClass198Array1;

	@OriginalMember(owner = "client!us", name = "kh", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!us", name = "Pg", descriptor = "[Z")
	private final boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!us", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!bt;Ljava/lang/Integer;)Lclient!ha;")
	public static Class33 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class33_Sub2_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) pba local9 = new pba();
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
				@Pc(177) D3DPRESENT_PARAMETERS local177 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static616.method8293(local3, arg3, local177, local13, local5)) {
					throw new RuntimeException("");
				}
				local177.EnableAutoDepthStencil = true;
				local177.Windowed = true;
				local177.PresentationInterval = Integer.MIN_VALUE;
				@Pc(203) int local203 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local203 |= 0x10;
				}
				@Pc(224) IDirect3DDevice local224;
				try {
					local224 = local13.a(local3, local5, arg0, local203 | 0x40, local177);
				} catch (@Pc(226) jha local226) {
					local224 = local13.a(local3, local5, arg0, local203 | 0x20, local177);
				}
				@Pc(245) Class63 local245 = new Class63(local224.c(0), local224.b());
				local1 = new Class33_Sub2_Sub2(local3, local5, arg0, local9, local13, local224, local245, local177, local18, arg1, arg2, arg3);
				local1.method8281();
				return local1;
			}
		} catch (@Pc(268) RuntimeException local268) {
			if (local1 != null) {
				local1.method8126();
			}
			throw local268;
		}
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/pba;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!dfa;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!bt;I)V")
	public Class33_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) pba arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class63 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface9 arg9, @OriginalArg(10) Class34 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aClass63_1 = arg6;
			this.anIDirect3D1 = arg4;
			this.aPba1 = arg3;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt9682 = arg0;
			this.aD3DCAPS1 = arg8;
			this.anIDirect3DDevice1 = arg5;
			this.anInt9684 = arg1;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aPba1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aPba1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aPba1);
			this.aPixelBuffer1 = new PixelBuffer(this.aPba1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aPba1);
			new GeometryBuffer(this.aPba1);
			this.aBoolean756 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean758 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean755 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.anInt9664 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean750 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt9660 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
			this.aBoolean738 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean744 = this.anInt9656 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9682, this.anInt9684, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.anIntArray664 = new int[this.anInt9664];
			this.aBooleanArray23 = new boolean[this.anInt9664];
			this.aBooleanArray25 = new boolean[this.anInt9664];
			this.aClass198Array1 = new Class198[this.anInt9664];
			this.aBooleanArray26 = new boolean[this.anInt9664];
			this.aBooleanArray24 = new boolean[this.anInt9664];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(222) Throwable local222) {
			local222.printStackTrace();
			this.method8070();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!je;BILclient!kja;III)V")
	@Override
	public void method8279(@OriginalArg(0) Interface16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class194 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class294) arg0).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static616.method8303(arg2), 0, arg5, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "()V")
	@Override
	public void method8073() {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!dw;ILclient!pe;BI)Lclient!ada;")
	@Override
	public Interface1 method8169(@OriginalArg(0) Class79 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class276 arg2, @OriginalArg(4) int arg3) {
		return new Class145_Sub2(this, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!mga;ZBZI)V")
	@Override
	public void method8182(@OriginalArg(0) Class230 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(11) byte local11;
		if (arg3 == 1) {
			local11 = 3;
		} else if (arg3 == 2) {
			local11 = 26;
		} else {
			local11 = 2;
		}
		@Pc(19) int local19 = 0;
		if (arg1) {
			local19 = 32;
		}
		if (arg2) {
			local19 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, local11, Static616.method8298(arg0) | local19);
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(II)V")
	@Override
	public void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass63_1.method1879()) {
			this.anInt9683 = 0;
			if (aha.b(-1, this.aClass63_1.method1882())) {
				this.method8304();
			}
		} else if (++this.anInt9683 <= 50) {
			this.method8304();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!us", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8194(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!us", name = "v", descriptor = "(I)V")
	@Override
	protected void method8203() {
		this.anIDirect3DDevice1.a(15, this.aBoolean749);
	}

	@OriginalMember(owner = "client!us", name = "x", descriptor = "(B)V")
	@Override
	protected void method8261() {
		if (this.anIDirect3DVertexShader8 != null || this.aClass331Array3[this.anInt9658] == Static426.aClass331_4) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, 24, 0);
			this.anIntArray664[this.anInt9658] = 0;
			return;
		}
		if (this.aClass331Array3[this.anInt9658] == Static100.aClass331_1) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9658 + 16, this.aClass92_Sub1Array3[this.anInt9658].method2308(Static616.aFloatArray75));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9658 + 16, this.aClass92_Sub1Array3[this.anInt9658].method2296(Static616.aFloatArray75));
		}
		@Pc(79) int local79 = Static616.method8299(this.aClass331Array3[this.anInt9658]);
		if (local79 != this.anIntArray664[this.anInt9658]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, 24, local79);
			this.anIntArray664[this.anInt9658] = local79;
		}
	}

	@OriginalMember(owner = "client!us", name = "s", descriptor = "(I)V")
	@Override
	protected void method8200() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat215 * this.aFloat212, this.aFloat224 * this.aFloat212, this.aFloat218 * this.aFloat212, 0.0F);
		this.aBoolean757 = false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method8292(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I[BIIZLclient!pe;II)Lclient!ada;")
	@Override
	protected Interface1 method8209(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class276 arg3, @OriginalArg(6) int arg4) {
		return new Class145_Sub2(this, arg3, arg4, arg1, arg2, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!us", name = "x", descriptor = "(I)V")
	@Override
	protected void method8207() {
		if (this.aBoolean733) {
			Static616.aFloatArray75[5] = 1.0F;
			Static616.aFloatArray75[10] = 1.0F;
			Static616.aFloatArray75[0] = 1.0F;
			Static616.aFloatArray75[15] = 1.0F;
			Static616.aFloatArray75[6] = 0.0F;
			Static616.aFloatArray75[3] = 0.0F;
			Static616.aFloatArray75[13] = 0.0F;
			Static616.aFloatArray75[8] = 0.0F;
			Static616.aFloatArray75[2] = 0.0F;
			Static616.aFloatArray75[14] = 0.0F;
			Static616.aFloatArray75[7] = 0.0F;
			Static616.aFloatArray75[9] = 0.0F;
			Static616.aFloatArray75[1] = 0.0F;
			Static616.aFloatArray75[12] = 0.0F;
			Static616.aFloatArray75[11] = 0.0F;
			Static616.aFloatArray75[4] = 0.0F;
		} else {
			this.aClass92_Sub1_15.method2296(Static616.aFloatArray75);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static616.aFloatArray75);
	}

	@OriginalMember(owner = "client!us", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!us", name = "C", descriptor = "(B)V")
	@Override
	protected void method8285() {
		@Pc(23) int local23 = this.aBooleanArray23[this.anInt9658] ? Static616.method8301(this.aClass91Array5[this.anInt9658]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, 4, local23);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZZ)Lclient!je;")
	@Override
	public Interface16 method8265(@OriginalArg(1) boolean arg0) {
		return new Class294(this, Static111.aClass79_8, arg0);
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(II)Lclient!bda;")
	@Override
	protected Class20 method8163(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class20_Sub8(this, this.aClass34_123);
		} else if (arg0 == 4) {
			return new Class20_Sub9(this, this.aClass34_123, this.aClass312_8);
		} else if (arg0 == 8) {
			return new Class20_Sub7(this, this.aClass34_123, this.aClass312_8);
		} else {
			return super.method8163(arg0);
		}
	}

	@OriginalMember(owner = "client!us", name = "K", descriptor = "(I)V")
	@Override
	protected void method8246() {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!kja;II)V")
	@Override
	public void method8204(@OriginalArg(1) Class194 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static616.method8303(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!us", name = "t", descriptor = "()V")
	@Override
	public void method8134() {
	}

	@OriginalMember(owner = "client!us", name = "w", descriptor = "(I)V")
	@Override
	protected void method8206() {
		this.aFloat213 = (float) (this.anInt9642 - this.anInt9647);
		this.aFloat216 = this.aFloat213 - (float) this.anInt9645;
		if (this.aFloat216 < (float) this.anInt9679) {
			this.aFloat216 = (float) this.anInt9679;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat216);
		this.anIDirect3DDevice1.a(37, this.aFloat213);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9674);
	}

	@OriginalMember(owner = "client!us", name = "u", descriptor = "(I)V")
	@Override
	protected void method8202() {
		if (this.aBooleanArray23[this.anInt9658]) {
			this.aBooleanArray23[this.anInt9658] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9658, (IDirect3DBaseTexture) null);
			this.method8285();
			this.method8171();
		}
	}

	@OriginalMember(owner = "client!us", name = "J", descriptor = "(I)V")
	@Override
	protected void method8245() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9653, this.anInt9673, this.anInt9573, this.anInt9526, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!mm;I)V")
	public void method8294(@OriginalArg(0) Class145_Sub2 arg0) {
		this.method8296(arg0);
		if (arg0.aBoolean426 != this.aBooleanArray24[this.anInt9658]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 1, arg0.aBoolean426 ? 1 : 3);
			this.aBooleanArray24[this.anInt9658] = arg0.aBoolean426;
		}
		if (arg0.aBoolean425 != this.aBooleanArray25[this.anInt9658]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 2, arg0.aBoolean425 ? 1 : 3);
			this.aBooleanArray25[this.anInt9658] = arg0.aBoolean425;
		}
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "()V")
	@Override
	public void method8093() {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([BIIIBLclient!pe;)Lclient!ch;")
	@Override
	public Interface7 method8248(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class276 arg1) {
		return new Class145_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8252(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		if (this.aCanvas12 != arg0) {
			return;
		}
		@Pc(10) Dimension local10 = arg0.getSize();
		if (local10.width > 0 && local10.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method8304();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!us", name = "r", descriptor = "(B)V")
	@Override
	protected void method8214() {
		if (Static618.aClass137_7 == this.aClass137_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass137_6 == Static606.aClass137_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass137_6 == Static282.aClass137_1) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(BI)V")
	@Override
	public void method8230(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, 11, arg0);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)V")
	@Override
	public void method8102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!us", name = "x", descriptor = "()V")
	@Override
	public void method8149() {
	}

	@OriginalMember(owner = "client!us", name = "D", descriptor = "(B)V")
	@Override
	protected void method8289() {
		this.anIDirect3DDevice1.a(14, this.aBoolean735 && this.aBoolean736);
	}

	@OriginalMember(owner = "client!us", name = "q", descriptor = "(B)V")
	@Override
	protected void method8211() {
		this.anIDirect3DDevice1.a(28, this.aBoolean752 && this.aBoolean746 && this.anInt9645 >= 0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!hm;B)V")
	public void method8296(@OriginalArg(0) Class145 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9658, arg0.method6705());
		if (this.aClass198Array1[this.anInt9658] != arg0.aClass198_10) {
			@Pc(54) int local54 = Static616.method8302(arg0.aClass198_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 6, local54);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 5, local54);
			this.aClass198Array1[this.anInt9658] = arg0.aClass198_10;
			if (this.aBooleanArray26[this.anInt9658] != arg0.aBoolean606) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 7, arg0.aBoolean606 ? Static616.method8302(arg0.aClass198_10) : 0);
				this.aBooleanArray26[this.anInt9658] = arg0.aBoolean606;
			}
		} else if (arg0.aBoolean606 != this.aBooleanArray26[this.anInt9658]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 7, arg0.aBoolean606 ? Static616.method8302(arg0.aClass198_10) : 0);
			this.aBooleanArray26[this.anInt9658] = arg0.aBoolean606;
		}
		if (!this.aBooleanArray23[this.anInt9658]) {
			this.aBooleanArray23[this.anInt9658] = true;
			this.method8285();
			this.method8171();
		}
	}

	@OriginalMember(owner = "client!us", name = "z", descriptor = "()V")
	@Override
	public void method8153() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (aha.a(-1, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(true);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!hca;)V")
	public void method8297(@OriginalArg(1) Class145_Sub1 arg0) {
		this.method8296(arg0);
		if (!this.aBooleanArray24[this.anInt9658]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 1, 1);
			this.aBooleanArray24[this.anInt9658] = true;
		}
		if (!this.aBooleanArray25[this.anInt9658]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9658, 2, 1);
			this.aBooleanArray25[this.anInt9658] = true;
		}
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8241() {
		this.method8277();
		this.method8227();
	}

	@OriginalMember(owner = "client!us", name = "W", descriptor = "(I)V")
	@Override
	protected void method8275() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt9659; local5++) {
			@Pc(14) Class4_Sub29 local14 = this.aClass4_Sub29Array6[local5];
			@Pc(18) int local18 = local5 + 2;
			@Pc(22) int local22 = local14.method7633();
			@Pc(28) float local28 = local14.method7626() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local14.method7627(), (float) local14.method7630(), (float) local14.method7628());
			this.aD3DLIGHT3.SetDiffuse(local28 * (float) (local22 >> 16 & 0xFF), local28 * (float) (local22 >> 8 & 0xFF), local28 * (float) (local22 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method7632() * local14.method7632()));
			this.aD3DLIGHT3.SetRange((float) local14.method7632());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt9651 > local5) {
			this.anIDirect3DDevice1.LightEnable(local5 + 2, false);
			local5++;
		}
		super.method8275();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(IZ)V")
	@Override
	public void method8283(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!dw;Lclient!pe;I)Z")
	@Override
	public boolean method8165(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class276 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return aha.a(-1, this.anIDirect3D1.a(this.anInt9682, local11)) && aha.a(-1, this.anIDirect3D1.CheckDeviceFormat(this.anInt9682, this.anInt9684, local11.Format, 0, 3, Static616.method8295(arg1, arg0)));
	}

	@OriginalMember(owner = "client!us", name = "L", descriptor = "(I)V")
	@Override
	protected void method8255() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray69);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)Lclient!sea;")
	@Override
	public Interface21 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI[[II)Lclient!mia;")
	@Override
	public Interface17 method8251(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class145_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!us", name = "q", descriptor = "(I)V")
	@Override
	protected void method8189() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9653 + this.anInt9655, this.anInt9673 + this.anInt9646, this.anInt9670, this.anInt9661);
	}

	@OriginalMember(owner = "client!us", name = "u", descriptor = "(B)V")
	@Override
	protected void method8223() {
		this.anIDirect3DDevice1.a(27, this.aBoolean748);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!us", name = "l", descriptor = "(I)V")
	@Override
	protected void method8171() {
		@Pc(20) int local20 = this.aBooleanArray23[this.anInt9658] ? Static616.method8301(this.aClass91Array6[this.anInt9658]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, 1, local20);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)Lclient!up;")
	@Override
	public Interface23 method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!us", name = "q", descriptor = "()V")
	@Override
	protected void method8126() {
		this.aPba1.a((byte) 48);
		super.method8126();
	}

	@OriginalMember(owner = "client!us", name = "v", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return false;
	}

	@OriginalMember(owner = "client!us", name = "o", descriptor = "(B)F")
	@Override
	protected float method8199() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method8131(@OriginalArg(0) int arg0) {
		this.aPba1.b((byte) -62);
		super.method8131(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)Lclient!oda;")
	@Override
	public Interface19 method8157(@OriginalArg(1) boolean arg0) {
		return new Class296(this, arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8193(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		this.aClass63_1 = (Class63) arg1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!gha;I)V")
	@Override
	public void method8249(@OriginalArg(0) Class134 arg0) {
		@Pc(5) int local5 = 0;
		if (Static117.aClass134_1 == arg0) {
			local5 = 65536;
		} else if (arg0 == Static587.aClass134_4) {
			local5 = 131072;
		} else if (arg0 == Static274.aClass134_2) {
			local5 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, 11, local5 | this.anInt9658);
	}

	@OriginalMember(owner = "client!us", name = "o", descriptor = "()Lclient!ub;")
	@Override
	public Class359 method8115() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt9682, 0);
		return new Class359(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!pe;ILclient!dw;)Z")
	@Override
	public boolean method8291(@OriginalArg(0) Class276 arg0, @OriginalArg(2) Class79 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return aha.a(-1, this.anIDirect3D1.a(this.anInt9682, local3)) && aha.a(-1, this.anIDirect3D1.CheckDeviceFormat(this.anInt9682, this.anInt9684, local3.Format, 0, 4, Static616.method8295(arg0, arg1)));
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZI[FBLclient!pe;I)Lclient!ada;")
	@Override
	protected Interface1 method8231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float[] arg3, @OriginalArg(6) Class276 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!oda;I)V")
	@Override
	public void method8175(@OriginalArg(1) Interface19 arg0, @OriginalArg(2) int arg1) {
		@Pc(2) Class296 local2 = (Class296) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method6569());
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!jia;Lclient!jia;FLclient!jia;)Lclient!jia;")
	@Override
	public Class68 method8138(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class68 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!jagdx/IDirect3DVertexShader;)V")
	public void method8300(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader8 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method8261();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!nm;)V")
	@Override
	public void method8117(@OriginalArg(0) Interface18 arg0) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I[Lclient!po;)Lclient!nca;")
	@Override
	public Class247 method8237(@OriginalArg(1) Class289[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!us", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!sea;Lclient!up;)Lclient!nm;")
	@Override
	public Interface18 method8119(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "()Z")
	@Override
	public boolean method8074() {
		return false;
	}

	@OriginalMember(owner = "client!us", name = "y", descriptor = "(B)V")
	@Override
	protected void method8277() {
		@Pc(13) float local13 = this.aBoolean753 ? this.aFloat217 : 0.0F;
		@Pc(22) float local22 = this.aBoolean753 ? -this.aFloat210 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local13 * this.aFloat215, local13 * this.aFloat224, local13 * this.aFloat218, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat215 * local22, local22 * this.aFloat224, this.aFloat218 * local22, 0.0F);
		this.aBoolean757 = false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8254(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!us", name = "E", descriptor = "(I)V")
	@Override
	protected void method8227() {
		if (this.aBoolean757) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean757 = true;
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(B)V")
	@Override
	protected void method8176() {
		this.anIDirect3DDevice1.a(7, this.aBoolean747);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method8259(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!us", name = "A", descriptor = "(I)V")
	@Override
	protected void method8217() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9657);
	}

	@OriginalMember(owner = "client!us", name = "p", descriptor = "(B)V")
	@Override
	protected void method8210() {
		if (this.aClass340_7.method7445()) {
			this.aClass92_Sub1_18.method2296(Static616.aFloatArray75);
		} else {
			Static616.aFloatArray75[6] = 0.0F;
			Static616.aFloatArray75[4] = 0.0F;
			Static616.aFloatArray75[0] = 1.0F;
			Static616.aFloatArray75[1] = 0.0F;
			Static616.aFloatArray75[13] = 0.0F;
			Static616.aFloatArray75[15] = 1.0F;
			Static616.aFloatArray75[12] = 0.0F;
			Static616.aFloatArray75[2] = 0.0F;
			Static616.aFloatArray75[3] = 0.0F;
			Static616.aFloatArray75[7] = 0.0F;
			Static616.aFloatArray75[10] = 1.0F;
			Static616.aFloatArray75[9] = 0.0F;
			Static616.aFloatArray75[14] = 0.0F;
			Static616.aFloatArray75[11] = 0.0F;
			Static616.aFloatArray75[8] = 0.0F;
			Static616.aFloatArray75[5] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static616.aFloatArray75);
	}

	@OriginalMember(owner = "client!us", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!us", name = "S", descriptor = "(I)V")
	@Override
	protected void method8267() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9664; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass198Array1[local1] = Static156.aClass198_4;
			this.aBooleanArray24[local1] = this.aBooleanArray25[local1] = true;
			this.aBooleanArray26[local1] = false;
			this.anIntArray664[local1] = 0;
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
		this.aBoolean757 = false;
		super.method8267();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIZZ[I)Lclient!ada;")
	@Override
	public Interface1 method8242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5) {
		return new Class145_Sub2(this, arg0, arg2, arg4, arg5, 0, arg3);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!nca;)V")
	@Override
	public void method8179(@OriginalArg(1) Class247 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!us", name = "j", descriptor = "(Z)V")
	@Override
	public void method8263() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray71[0], -this.aFloatArray71[1], -this.aFloatArray71[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray66[0], -this.aFloatArray66[1], -this.aFloatArray66[2]);
		this.aBoolean757 = false;
	}

	@OriginalMember(owner = "client!us", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (aha.a(-1, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && aha.a(-1, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (local54 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(61) int local61 = 0; local61 < arg3; local61++) {
					this.aPixelBuffer1.a(local1, arg2 * local61, local54 * local61, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(true);
		local16.a(true);
		return local1;
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(B)V")
	@Override
	protected void method8183() {
		this.anIDirect3DDevice1.a(174, this.aBoolean754);
	}

	@OriginalMember(owner = "client!us", name = "bb", descriptor = "(I)Z")
	private boolean method8304() {
		@Pc(11) int local11 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local11 == 0 || local11 == -2005530519) {
			@Pc(23) Class63 local23 = (Class63) this.anObject19;
			this.method8257();
			local23.method1881();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static616.method8293(this.anInt9682, this.anInt9656, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1, this.anInt9684)) {
				@Pc(56) int local56 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (aha.a(-1, local56)) {
					local23.method1880(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.c(0));
					this.method8260();
					this.method8267();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!us", name = "P", descriptor = "(I)V")
	@Override
	protected void method8262() {
		this.anIDirect3DDevice1.a(137, this.aBoolean737 && !this.aBoolean740);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZLclient!mga;)V")
	@Override
	protected void method8173(@OriginalArg(1) int arg0, @OriginalArg(3) Class230 arg1) {
		@Pc(10) byte local10;
		if (arg0 == 1) {
			local10 = 6;
		} else if (arg0 == 2) {
			local10 = 27;
		} else {
			local10 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9658, local10, Static616.method8298(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8141(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8120(arg2, arg3);
	}
}
