import jaclib.peer.hr;
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
import jagdx.hb;
import jagdx.oea;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class9_Sub3_Sub1 extends Class9_Sub3 {

	@OriginalMember(owner = "client!gb", name = "Rg", descriptor = "Z")
	private boolean aBoolean303 = false;

	@OriginalMember(owner = "client!gb", name = "Qg", descriptor = "I")
	private int anInt3636 = 0;

	@OriginalMember(owner = "client!gb", name = "wg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!gb", name = "Og", descriptor = "I")
	private final int anInt3635;

	@OriginalMember(owner = "client!gb", name = "Eg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!gb", name = "Dg", descriptor = "Lclient!cga;")
	private Class54 aClass54_1;

	@OriginalMember(owner = "client!gb", name = "Sg", descriptor = "Lclient!jaclib/peer/hr;")
	public final hr aHr1;

	@OriginalMember(owner = "client!gb", name = "tg", descriptor = "I")
	private final int anInt3634;

	@OriginalMember(owner = "client!gb", name = "Bg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!gb", name = "Ag", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!gb", name = "Ig", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!gb", name = "zg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!gb", name = "yg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!gb", name = "Cg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!gb", name = "Pg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!gb", name = "Kg", descriptor = "Z")
	public final boolean aBoolean301;

	@OriginalMember(owner = "client!gb", name = "Ng", descriptor = "Z")
	public final boolean aBoolean302;

	@OriginalMember(owner = "client!gb", name = "xg", descriptor = "Z")
	public final boolean aBoolean300;

	@OriginalMember(owner = "client!gb", name = "Mg", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!gb", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!gb", name = "Fg", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!gb", name = "Hg", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gb", name = "Jg", descriptor = "[Lclient!up;")
	private final Class321[] aClass321Array1;

	@OriginalMember(owner = "client!gb", name = "vg", descriptor = "[I")
	private final int[] anIntArray239;

	@OriginalMember(owner = "client!gb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!e;Lclient!jo;Ljava/lang/Integer;)Lclient!oa;")
	private static Class9 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class9_Sub3_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) hr local9 = new hr();
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
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(175) D3DPRESENT_PARAMETERS local175 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static160.method3247(arg3, local3, local13, local175, local5)) {
					throw new RuntimeException("");
				}
				local175.Windowed = true;
				local175.PresentationInterval = Integer.MIN_VALUE;
				local175.EnableAutoDepthStencil = true;
				@Pc(201) int local201 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local201 |= 0x10;
				}
				@Pc(226) IDirect3DDevice local226;
				try {
					local226 = local13.a(local3, local5, arg0, local201 | 0x40, local175);
				} catch (@Pc(228) oea local228) {
					local226 = local13.a(local3, local5, arg0, local201 | 0x20, local175);
				}
				@Pc(247) Class54 local247 = new Class54(local226.b(0), local226.c());
				local1 = new Class9_Sub3_Sub1(local3, local5, arg0, local9, local13, local226, local247, local175, local18, arg1, arg2, arg3);
				local1.method5588();
				return local1;
			}
		} catch (@Pc(270) RuntimeException local270) {
			if (local1 != null) {
				local1.method5418();
			}
			throw local270;
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/hr;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!cga;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!e;Lclient!jo;I)V")
	public Class9_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) hr arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class54 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface2 arg9, @OriginalArg(10) Class168 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anInt3635 = arg0;
		this.aD3DCAPS1 = arg8;
		this.aClass54_1 = arg6;
		this.aHr1 = arg3;
		this.anInt3634 = arg1;
		this.anIDirect3DDevice1 = arg5;
		this.anIDirect3D1 = arg4;
		this.aD3DLIGHT3 = new D3DLIGHT(this.aHr1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aHr1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.aHr1);
		this.aPixelBuffer1 = new PixelBuffer(this.aHr1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aHr1);
		new GeometryBuffer(this.aHr1);
		this.aBoolean301 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean302 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean491 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.anInt6541 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean300 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.anInt6530 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean478 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean487 = this.anInt6533 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt3635, this.anInt3634, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray11 = new boolean[this.anInt6541];
		this.aBooleanArray10 = new boolean[this.anInt6541];
		this.aBooleanArray8 = new boolean[this.anInt6541];
		this.aBooleanArray9 = new boolean[this.anInt6541];
		this.aClass321Array1 = new Class321[this.anInt6541];
		this.anIntArray239 = new int[this.anInt6541];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method5411();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(242) Exception_Sub1 local242) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(ZZ)V")
	@Override
	public void method5538(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(B)V")
	@Override
	protected void method5496() {
		if (this.aBoolean479) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt6553);
			return;
		}
		this.aFloat139 = this.anInt6560 - this.anInt6556;
		this.aFloat149 = this.aFloat139 - (float) this.anInt6531;
		if (this.aFloat149 < (float) this.anInt6540) {
			this.aFloat149 = this.anInt6540;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat149);
		this.anIDirect3DDevice1.a(37, this.aFloat139);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6537);
	}

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "(I)V")
	@Override
	protected void method5582() {
		@Pc(7) float local7 = this.aBoolean488 ? this.aFloat143 : 0.0F;
		@Pc(16) float local16 = this.aBoolean488 ? -this.aFloat142 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat145, local7 * this.aFloat144, this.aFloat138 * local7, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat145 * local16, local16 * this.aFloat144, this.aFloat138 * local16, 0.0F);
		this.aBoolean303 = false;
	}

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "(I)V")
	@Override
	protected void method5500() {
		if (this.aClass207_8.method5012()) {
			this.aClass8_Sub3_18.method8196(Static160.aFloatArray30);
		} else {
			Static160.aFloatArray30[2] = 0.0F;
			Static160.aFloatArray30[4] = 0.0F;
			Static160.aFloatArray30[8] = 0.0F;
			Static160.aFloatArray30[11] = 0.0F;
			Static160.aFloatArray30[12] = 0.0F;
			Static160.aFloatArray30[5] = 1.0F;
			Static160.aFloatArray30[6] = 0.0F;
			Static160.aFloatArray30[3] = 0.0F;
			Static160.aFloatArray30[0] = 1.0F;
			Static160.aFloatArray30[15] = 1.0F;
			Static160.aFloatArray30[14] = 0.0F;
			Static160.aFloatArray30[1] = 0.0F;
			Static160.aFloatArray30[9] = 0.0F;
			Static160.aFloatArray30[13] = 0.0F;
			Static160.aFloatArray30[7] = 0.0F;
			Static160.aFloatArray30[10] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static160.aFloatArray30);
	}

	@OriginalMember(owner = "client!gb", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI[IZII)Lclient!ae;")
	@Override
	public Interface1 method5564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class96_Sub1(this, arg5, arg1, arg3, arg2, 0, arg4);
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(II)Lclient!or;")
	@Override
	protected Class37 method5529(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class37_Sub9(this, this.aClass168_83);
		} else if (arg0 == 4) {
			return new Class37_Sub2(this, this.aClass168_83, this.aClass149_5);
		} else {
			return super.method5529(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "(I)Z")
	private boolean method3240() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(22) Class54 local22 = (Class54) this.anObject9;
			this.method5473();
			local22.method1339();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static160.method3247(this.anInt6533, this.anInt3635, this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1, this.anInt3634)) {
				@Pc(56) int local56 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (hb.a(local56, (byte) -98)) {
					local22.method1340(this.anIDirect3DDevice1.c(), this.anIDirect3DDevice1.b(0));
					this.method5600();
					this.method5586();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "()V")
	@Override
	public void method5430() {
		this.method5526(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "()V")
	@Override
	public void method5441() {
	}

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "(B)V")
	@Override
	protected void method5533() {
		this.anIDirect3DDevice1.a(28, this.aBoolean475 && this.aBoolean493 && this.aBoolean479 | this.anInt6531 >= 0);
	}

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "(I)V")
	@Override
	protected void method5490() {
		this.anIDirect3DDevice1.a(27, this.aBoolean480);
	}

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "(B)V")
	@Override
	protected void method5517() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6559; local1++) {
			@Pc(10) Class6_Sub29 local10 = this.aClass6_Sub29Array4[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method6157();
			@Pc(24) float local24 = local10.method6158() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method6164(), (float) local10.method6161(), (float) local10.method6165());
			this.aD3DLIGHT1.SetDiffuse(local24 * (float) (local18 >> 16 & 0xFF), local24 * (float) (local18 >> 8 & 0xFF), (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method6160() * local10.method6160()));
			this.aD3DLIGHT1.SetRange((float) local10.method6160());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt6561 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5517();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!pg;)V")
	public void method3243(@OriginalArg(1) Class96_Sub2 arg0) {
		this.method3250(arg0);
		if (!this.aBooleanArray11[this.anInt6536]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 1, 1);
			this.aBooleanArray11[this.anInt6536] = true;
		}
		if (!this.aBooleanArray9[this.anInt6536]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 2, 1);
			this.aBooleanArray9[this.anInt6536] = true;
		}
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "()V")
	@Override
	protected void method5418() {
		this.aHr1.b(20522);
		super.method5418();
	}

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "(I)V")
	@Override
	protected void method5479() {
		this.method5582();
		this.method5551();
	}

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "()Lclient!hl;")
	@Override
	public Class138 method5435() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt3635, 0);
		return new Class138(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBLclient!vd;Lclient!tj;II)V")
	@Override
	public void method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class328 arg2, @OriginalArg(4) Interface21 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class209) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static160.method3242(arg2), 0, arg1, arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "(I)V")
	@Override
	protected void method5551() {
		if (this.aBoolean303) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean303 = true;
	}

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "(I)F")
	@Override
	protected float method5585() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5519(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (arg1 != this.aCanvas12) {
			return;
		}
		@Pc(13) Dimension local13 = arg1.getSize();
		if (local13.width > 0 && local13.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method3240();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B[Lclient!ada;)Lclient!eh;")
	@Override
	public Class88 method5510(@OriginalArg(1) Class7[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5599() {
		@Pc(22) int local22 = this.aBooleanArray8[this.anInt6536] ? Static160.method3246(this.aClass238Array6[this.anInt6536]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, 1, local22);
	}

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "(I)V")
	@Override
	protected void method5554() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6562);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V")
	@Override
	public void method5413(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	@Override
	protected void method5477() {
		this.anIDirect3DDevice1.a(15, this.aBoolean485);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BIZILclient!vj;II)Lclient!ae;")
	@Override
	protected Interface1 method5570(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) Class333 arg3, @OriginalArg(6) int arg4) {
		return new Class96_Sub1(this, arg3, arg0, arg4, arg2, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(B)V")
	@Override
	protected void method5505() {
		this.anIDirect3DDevice1.a(7, this.aBoolean481);
	}

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "(I)V")
	@Override
	protected void method5514() {
		if (Static503.aClass340_13 == this.aClass340Array3[this.anInt6536]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, 24, 0);
			this.anIntArray239[this.anInt6536] = 0;
			return;
		}
		if (Static204.aClass340_7 == this.aClass340Array3[this.anInt6536]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6536 + 16, this.aClass8_Sub3Array3[this.anInt6536].method8196(Static160.aFloatArray30));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6536 + 16, this.aClass8_Sub3Array3[this.anInt6536].method8180(Static160.aFloatArray30));
		}
		@Pc(74) int local74 = Static160.method3244(this.aClass340Array3[this.anInt6536]);
		if (local74 != this.anIntArray239[this.anInt6536]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, 24, local74);
			this.anIntArray239[this.anInt6536] = local74;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZLclient!cea;II)V")
	@Override
	public void method5491(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) byte local13;
		if (arg3 == 1) {
			local13 = 3;
		} else if (arg3 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(21) int local21 = 0;
		if (arg1) {
			local21 = 32;
		}
		if (arg0) {
			local21 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, local13, Static160.method3249(arg2) | local21);
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5438(@OriginalArg(0) int arg0) {
		this.aHr1.c(104);
		super.method5438(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (hb.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1), (byte) -95) && hb.a(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), (byte) -60)) {
			local1 = new int[arg2 * arg3];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					this.aPixelBuffer1.a(local1, local72 * arg2, local55 * local72, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -34);
		local16.a((byte) -34);
		return local1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!vj;Lclient!nb;B)Z")
	@Override
	public boolean method5567(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Class220 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return hb.a(this.anIDirect3D1.a(this.anInt3635, local3), (byte) -121) && hb.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3635, this.anInt3634, local3.Format, 0, 3, Static160.method3245(arg1, arg0)), (byte) -39);
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "()V")
	@Override
	public void method5411() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass54_1.method1341()) {
			this.anInt3636 = 0;
			if (hb.b(this.aClass54_1.method1342(), (byte) 114)) {
				this.method3240();
			}
		} else if (++this.anInt3636 <= 50) {
			this.method3240();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "()Z")
	@Override
	public boolean method5453() {
		return false;
	}

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "(I)V")
	@Override
	protected void method5480() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray46);
	}

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "(I)V")
	@Override
	protected void method5549() {
		@Pc(23) int local23 = this.aBooleanArray8[this.anInt6536] ? Static160.method3246(this.aClass238Array5[this.anInt6536]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, 4, local23);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
	@Override
	protected void method5488() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6555 + this.anInt6539, this.anInt6554 + this.anInt6552, this.anInt6532, this.anInt6543);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!eh;)V")
	@Override
	public void method5535(@OriginalArg(1) Class88 arg0) {
		@Pc(7) dxVertexLayout local7 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local7.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "(I)V")
	@Override
	protected void method5558() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6539, this.anInt6552, this.anInt6442, this.anInt6381, 0.0F, (float) 1);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILclient!vd;)V")
	@Override
	public void method5571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class328 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static160.method3242(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "(I)V")
	@Override
	protected void method5534() {
		if (this.aBoolean474) {
			Static160.aFloatArray30[7] = 0.0F;
			Static160.aFloatArray30[8] = 0.0F;
			Static160.aFloatArray30[5] = 1.0F;
			Static160.aFloatArray30[3] = 0.0F;
			Static160.aFloatArray30[2] = 0.0F;
			Static160.aFloatArray30[14] = 0.0F;
			Static160.aFloatArray30[4] = 0.0F;
			Static160.aFloatArray30[13] = 0.0F;
			Static160.aFloatArray30[0] = 1.0F;
			Static160.aFloatArray30[11] = 0.0F;
			Static160.aFloatArray30[6] = 0.0F;
			Static160.aFloatArray30[12] = 0.0F;
			Static160.aFloatArray30[15] = 1.0F;
			Static160.aFloatArray30[9] = 0.0F;
			Static160.aFloatArray30[10] = 1.0F;
			Static160.aFloatArray30[1] = 0.0F;
		} else {
			this.aClass8_Sub3_15.method8196(Static160.aFloatArray30);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static160.aFloatArray30);
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(II)V")
	@Override
	public void method5589(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, 11, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "(I)V")
	@Override
	protected void method5518() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!dj;)V")
	@Override
	public void method5483(@OriginalArg(1) Class71 arg0) {
		@Pc(8) int local8 = 0;
		if (Static88.aClass71_1 == arg0) {
			local8 = 65536;
		} else if (Static408.aClass71_3 == arg0) {
			local8 = 131072;
		} else if (Static338.aClass71_2 == arg0) {
			local8 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, 11, this.anInt6536 | local8);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
	@Override
	public void method5406() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!dga;Lclient!dga;FLclient!dga;)Lclient!dga;")
	@Override
	public Class65 method5402(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class65 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(BZ)Lclient!tj;")
	@Override
	public Interface21 method5550(@OriginalArg(1) boolean arg0) {
		return new Class209(this, Static336.aClass220_13, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLclient!mv;)V")
	public void method3248(@OriginalArg(1) Class96_Sub1 arg0) {
		this.method3250(arg0);
		if (this.aBooleanArray11[this.anInt6536] != arg0.aBoolean458) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 1, arg0.aBoolean458 ? 1 : 3);
			this.aBooleanArray11[this.anInt6536] = arg0.aBoolean458;
		}
		if (arg0.aBoolean459 != this.aBooleanArray9[this.anInt6536]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 2, arg0.aBoolean459 ? 1 : 3);
			this.aBooleanArray9[this.anInt6536] = arg0.aBoolean459;
		}
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(B)V")
	@Override
	protected void method5508() {
		this.anIDirect3DDevice1.a(137, this.aBoolean486 && !this.aBoolean484);
	}

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "(I)V")
	@Override
	protected void method5507() {
		this.anIDirect3DDevice1.a(174, this.aBoolean494);
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "()V")
	@Override
	public void method5420() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (hb.a(local3.Issue(), (byte) -102)) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -34);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBILclient!vj;Lclient!nb;)Lclient!ae;")
	@Override
	public Interface1 method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class333 arg2, @OriginalArg(4) Class220 arg3) {
		return new Class96_Sub1(this, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "(I)V")
	@Override
	protected void method5584() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat145 * this.aFloat148, this.aFloat144 * this.aFloat148, this.aFloat148 * this.aFloat138, 0.0F);
		this.aBoolean303 = false;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BILclient!vj;BII)Lclient!te;")
	@Override
	public Interface19 method5573(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class333 arg1) {
		return new Class96_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!cea;IZ)V")
	@Override
	protected void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1) {
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 6;
		} else if (arg0 == 2) {
			local13 = 27;
		} else {
			local13 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6536, local13, Static160.method3249(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5485(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass54_1 = (Class54) arg0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()Z")
	@Override
	public boolean method5398() {
		return false;
	}

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "(B)V")
	@Override
	protected void method5575() {
		if (this.aClass27_4 == Static464.aClass27_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass27_4 == Static537.aClass27_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static553.aClass27_7 == this.aClass27_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5591(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!vj;Lclient!nb;I)Z")
	@Override
	public boolean method5515(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Class220 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return hb.a(this.anIDirect3D1.a(this.anInt3635, local3), (byte) -94) && hb.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt3635, this.anInt3634, local3.Format, 0, 4, Static160.method3245(arg1, arg0)), (byte) -84);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z[[III)Lclient!vfa;")
	@Override
	public Interface22 method5476(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class96_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5531() {
		if (this.aBooleanArray8[this.anInt6536]) {
			this.aBooleanArray8[this.anInt6536] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6536, null);
			this.method5549();
			this.method5599();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5448(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5411();
	}

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "(B)V")
	@Override
	public void method5566() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray40[0], -this.aFloatArray40[1], -this.aFloatArray40[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray44[0], -this.aFloatArray44[1], -this.aFloatArray44[2]);
		this.aBoolean303 = false;
	}

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "()V")
	@Override
	public void method5463() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method5493(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!tfa;)V")
	@Override
	public void method5513(@OriginalArg(0) int arg0, @OriginalArg(2) Interface20 arg1) {
		@Pc(2) Class265 local2 = (Class265) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method6525());
	}

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "(I)V")
	@Override
	protected void method5557() {
		this.anIDirect3DDevice1.a(14, this.aBoolean482 && this.aBoolean476);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5443(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "(I)V")
	@Override
	protected void method5586() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6541; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass321Array1[local1] = Static333.aClass321_7;
			this.aBooleanArray11[local1] = this.aBooleanArray9[local1] = true;
			this.aBooleanArray10[local1] = false;
			this.anIntArray239[local1] = 0;
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
		this.aD3DLIGHT2.SetType(3);
		this.aD3DLIGHT1.SetType(1);
		this.aBoolean303 = false;
		super.method5586();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[FZIIZILclient!vj;)Lclient!ae;")
	@Override
	protected Interface1 method5470(@OriginalArg(1) float[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class333 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!es;I)V")
	public void method3250(@OriginalArg(0) Class96 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6536, arg0.method6280());
		if (arg0.aClass321_10 != this.aClass321Array1[this.anInt6536]) {
			@Pc(69) int local69 = Static160.method3241(arg0.aClass321_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 6, local69);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 5, local69);
			this.aClass321Array1[this.anInt6536] = arg0.aClass321_10;
			if (arg0.aBoolean552 != this.aBooleanArray10[this.anInt6536]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 7, arg0.aBoolean552 ? Static160.method3241(arg0.aClass321_10) : 0);
				this.aBooleanArray10[this.anInt6536] = arg0.aBoolean552;
			}
		} else if (this.aBooleanArray10[this.anInt6536] != arg0.aBoolean552) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6536, 7, arg0.aBoolean552 ? Static160.method3241(arg0.aClass321_10) : 0);
			this.aBooleanArray10[this.anInt6536] = arg0.aBoolean552;
		}
		if (!this.aBooleanArray8[this.anInt6536]) {
			this.aBooleanArray8[this.anInt6536] = true;
			this.method5549();
			this.method5599();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(ZZ)Lclient!tfa;")
	@Override
	public Interface20 method5528(@OriginalArg(0) boolean arg0) {
		return new Class265(this, arg0);
	}
}
