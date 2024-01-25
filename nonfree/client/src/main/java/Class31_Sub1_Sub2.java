import jaclib.peer.pi;
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
import jagdx.js;
import jagdx.lg;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class31_Sub1_Sub2 extends Class31_Sub1 {

	@OriginalMember(owner = "client!to", name = "Gg", descriptor = "I")
	private int anInt9146 = 0;

	@OriginalMember(owner = "client!to", name = "Jg", descriptor = "Z")
	private boolean aBoolean619 = false;

	@OriginalMember(owner = "client!to", name = "Cg", descriptor = "I")
	private final int anInt9145;

	@OriginalMember(owner = "client!to", name = "Pg", descriptor = "Lclient!jaclib/peer/pi;")
	public final pi aPi1;

	@OriginalMember(owner = "client!to", name = "Hg", descriptor = "Lclient!gm;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!to", name = "vg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!to", name = "Og", descriptor = "I")
	private final int anInt9147;

	@OriginalMember(owner = "client!to", name = "Ng", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!to", name = "Bg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!to", name = "zg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!to", name = "ug", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!to", name = "yg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!to", name = "Eg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!to", name = "Mg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!to", name = "Ag", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!to", name = "Fg", descriptor = "Z")
	public final boolean aBoolean617;

	@OriginalMember(owner = "client!to", name = "Qg", descriptor = "Z")
	public final boolean aBoolean620;

	@OriginalMember(owner = "client!to", name = "Ig", descriptor = "Z")
	public final boolean aBoolean618;

	@OriginalMember(owner = "client!to", name = "wg", descriptor = "[Z")
	private final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!to", name = "Ug", descriptor = "[Z")
	private final boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!to", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!to", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!to", name = "Tg", descriptor = "[I")
	private final int[] anIntArray533;

	@OriginalMember(owner = "client!to", name = "Dg", descriptor = "[Lclient!dca;")
	private final Class65[] aClass65Array1;

	@OriginalMember(owner = "client!to", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Lclient!ri;Ljava/lang/Integer;)Lclient!r;")
	private static Class31 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class31_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) pi local9 = new pi();
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
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(183) D3DPRESENT_PARAMETERS local183 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static518.method7191(local5, local13, local3, arg3, local183)) {
					throw new RuntimeException("");
				}
				local183.PresentationInterval = Integer.MIN_VALUE;
				local183.Windowed = true;
				local183.EnableAutoDepthStencil = true;
				@Pc(208) int local208 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local208 |= 0x10;
				}
				@Pc(232) IDirect3DDevice local232;
				try {
					local232 = local13.a(local3, local5, arg0, local208 | 0x40, local183);
				} catch (@Pc(234) lg local234) {
					local232 = local13.a(local3, local5, arg0, local208 | 0x20, local183);
				}
				@Pc(253) Class115 local253 = new Class115(local232.c(0), local232.b());
				local1 = new Class31_Sub1_Sub2(local3, local5, arg0, local9, local13, local232, local253, local183, local18, arg1, arg2, arg3);
				local1.method7127();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method8079();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/pi;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!gm;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!fa;Lclient!ri;I)V")
	public Class31_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) pi arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class115 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class284 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt9145 = arg0;
		this.aPi1 = arg3;
		this.aClass115_1 = arg6;
		this.anIDirect3DDevice1 = arg5;
		this.anInt9147 = arg1;
		this.anIDirect3D1 = arg4;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aD3DCAPS1 = arg8;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aPi1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aPi1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aPi1);
		this.aPixelBuffer1 = new PixelBuffer(this.aPi1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aPi1);
		new GeometryBuffer(this.aPi1);
		this.aBoolean617 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.anInt9123 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean614 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean620 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean618 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean612 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.anInt9126 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean613 = this.anInt9115 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9145, this.anInt9147, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray28 = new boolean[this.anInt9123];
		this.aBooleanArray31 = new boolean[this.anInt9123];
		this.aBooleanArray30 = new boolean[this.anInt9123];
		this.aBooleanArray29 = new boolean[this.anInt9123];
		this.anIntArray533 = new int[this.anInt9123];
		this.aClass65Array1 = new Class65[this.anInt9123];
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
	@Override
	protected void method7063() {
		if (this.aBoolean595) {
			Static518.aFloatArray68[9] = 0.0F;
			Static518.aFloatArray68[1] = 0.0F;
			Static518.aFloatArray68[3] = 0.0F;
			Static518.aFloatArray68[14] = 0.0F;
			Static518.aFloatArray68[2] = 0.0F;
			Static518.aFloatArray68[12] = 0.0F;
			Static518.aFloatArray68[15] = 1.0F;
			Static518.aFloatArray68[10] = 1.0F;
			Static518.aFloatArray68[13] = 0.0F;
			Static518.aFloatArray68[0] = 1.0F;
			Static518.aFloatArray68[8] = 0.0F;
			Static518.aFloatArray68[6] = 0.0F;
			Static518.aFloatArray68[5] = 1.0F;
			Static518.aFloatArray68[7] = 0.0F;
			Static518.aFloatArray68[11] = 0.0F;
			Static518.aFloatArray68[4] = 0.0F;
		} else {
			this.aClass42_Sub3_15.method7520(Static518.aFloatArray68);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static518.aFloatArray68);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method8071(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method8082();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!bg;I)V")
	public void method7186(@OriginalArg(0) Class2 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9134, arg0.method7710());
		if (this.aClass65Array1[this.anInt9134] != arg0.aClass65_11) {
			@Pc(21) int local21 = Static518.method7192(arg0.aClass65_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 5, local21);
			this.aClass65Array1[this.anInt9134] = arg0.aClass65_11;
			if (arg0.aBoolean648 != this.aBooleanArray31[this.anInt9134]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 7, arg0.aBoolean648 ? Static518.method7192(arg0.aClass65_11) : 0);
				this.aBooleanArray31[this.anInt9134] = arg0.aBoolean648;
			}
		} else if (this.aBooleanArray31[this.anInt9134] != arg0.aBoolean648) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 7, arg0.aBoolean648 ? Static518.method7192(arg0.aClass65_11) : 0);
			this.aBooleanArray31[this.anInt9134] = arg0.aBoolean648;
		}
		if (!this.aBooleanArray28[this.anInt9134]) {
			this.aBooleanArray28[this.anInt9134] = true;
			this.method7121();
			this.method7050();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B[Lclient!ej;)Lclient!qf;")
	@Override
	public Class1 method7116(@OriginalArg(1) Class90[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7162(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!aa;)V")
	public void method7187(@OriginalArg(1) Class2_Sub1 arg0) {
		this.method7186(arg0);
		if (this.aBooleanArray29[this.anInt9134] != arg0.aBoolean4) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 1, arg0.aBoolean4 ? 1 : 3);
			this.aBooleanArray29[this.anInt9134] = arg0.aBoolean4;
		}
		if (arg0.aBoolean3 != this.aBooleanArray30[this.anInt9134]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 2, arg0.aBoolean3 ? 1 : 3);
			this.aBooleanArray30[this.anInt9134] = arg0.aBoolean3;
		}
	}

	@OriginalMember(owner = "client!to", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7179() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9137, this.anInt9114, this.anInt9092, this.anInt8992, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIBLclient!pw;)V")
	@Override
	public void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class265 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static518.method7188(arg2), arg1, arg0);
	}

	@OriginalMember(owner = "client!to", name = "n", descriptor = "(I)V")
	@Override
	protected void method7065() {
		if (Static389.aClass51_16 == this.aClass51Array3[this.anInt9134]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, 24, 0);
			this.anIntArray533[this.anInt9134] = 0;
			return;
		}
		if (Static496.aClass51_17 == this.aClass51Array3[this.anInt9134]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9134 + 16, this.aClass42_Sub3Array3[this.anInt9134].method7520(Static518.aFloatArray68));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9134 + 16, this.aClass42_Sub3Array3[this.anInt9134].method7529(Static518.aFloatArray68));
		}
		@Pc(77) int local77 = Static518.method7196(this.aClass51Array3[this.anInt9134]);
		if (this.anIntArray533[this.anInt9134] != local77) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, 24, local77);
			this.anIntArray533[this.anInt9134] = local77;
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(ZI)Lclient!bo;")
	@Override
	public Interface2 method7158(@OriginalArg(0) boolean arg0) {
		return new Class232(this, Static331.aClass204_14, arg0);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)V")
	@Override
	public void method8061(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZIILclient!os;[BII)Lclient!mca;")
	@Override
	protected Interface12 method7104(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class245 arg3, @OriginalArg(5) byte[] arg4) {
		return new Class2_Sub1(this, arg3, arg2, arg0, arg1, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!to", name = "P", descriptor = "(I)V")
	@Override
	protected void method7135() {
		if (this.aClass218_8.method5025()) {
			this.aClass42_Sub3_18.method7520(Static518.aFloatArray68);
		} else {
			Static518.aFloatArray68[10] = 1.0F;
			Static518.aFloatArray68[0] = 1.0F;
			Static518.aFloatArray68[11] = 0.0F;
			Static518.aFloatArray68[4] = 0.0F;
			Static518.aFloatArray68[13] = 0.0F;
			Static518.aFloatArray68[15] = 1.0F;
			Static518.aFloatArray68[12] = 0.0F;
			Static518.aFloatArray68[8] = 0.0F;
			Static518.aFloatArray68[2] = 0.0F;
			Static518.aFloatArray68[3] = 0.0F;
			Static518.aFloatArray68[5] = 1.0F;
			Static518.aFloatArray68[9] = 0.0F;
			Static518.aFloatArray68[14] = 0.0F;
			Static518.aFloatArray68[1] = 0.0F;
			Static518.aFloatArray68[7] = 0.0F;
			Static518.aFloatArray68[6] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static518.aFloatArray68);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ko;ZII)V")
	@Override
	protected void method7099(@OriginalArg(0) Class179 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) byte local10;
		if (arg1 == 1) {
			local10 = 6;
		} else if (arg1 == 2) {
			local10 = 27;
		} else {
			local10 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, local10, Static518.method7193(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!os;I[BII)Lclient!qw;")
	@Override
	public Interface19 method7152(@OriginalArg(1) Class245 arg0, @OriginalArg(3) byte[] arg1) {
		return new Class2_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!dd;Lclient!dd;FLclient!dd;)Lclient!dd;")
	@Override
	public Class47 method8093(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!pw;ILclient!bo;IIII)V")
	@Override
	public void method7174(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class232) arg2).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static518.method7188(arg0), 0, arg5, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!to", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!to", name = "y", descriptor = "()V")
	@Override
	public void method8082() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass115_1.method3136()) {
			this.anInt9146 = 0;
			if (js.a(this.aClass115_1.method3135(), 0)) {
				this.method7195();
			}
		} else if (++this.anInt9146 <= 50) {
			this.method7195();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!to", name = "n", descriptor = "(B)V")
	@Override
	protected void method7153() {
		this.anIDirect3DDevice1.a(28, this.aBoolean606 && this.aBoolean611 && this.anInt9110 >= 0);
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(Z)V")
	@Override
	protected void method7056() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat191 * this.aFloat189, this.aFloat201 * this.aFloat191, this.aFloat193 * this.aFloat191, 0.0F);
		this.aBoolean619 = false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!mg;ILclient!os;)Lclient!mca;")
	@Override
	public Interface12 method7076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(4) Class245 arg3) {
		return new Class2_Sub1(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!to", name = "C", descriptor = "(I)V")
	@Override
	protected void method7102() {
		this.anIDirect3DDevice1.a(15, this.aBoolean596);
	}

	@OriginalMember(owner = "client!to", name = "q", descriptor = "(B)V")
	@Override
	protected void method7172() {
		if (Static519.aClass363_6 == this.aClass363_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass363_5 == Static362.aClass363_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static548.aClass363_7 == this.aClass363_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I[FIIIILclient!os;Z)Lclient!mca;")
	@Override
	protected Interface12 method7070(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(6) Class245 arg3, @OriginalArg(7) boolean arg4) {
		return null;
	}

	@OriginalMember(owner = "client!to", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7156() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9109);
	}

	@OriginalMember(owner = "client!to", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return 0;
	}

	@OriginalMember(owner = "client!to", name = "x", descriptor = "()V")
	@Override
	protected void method8079() {
		this.aPi1.a(false);
		super.method8079();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7183(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "()Z")
	@Override
	public boolean method8022() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "j", descriptor = "()V")
	@Override
	public void method8034() {
	}

	@OriginalMember(owner = "client!to", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7058(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!qf;)V")
	@Override
	public void method7149(@OriginalArg(1) Class1 arg0) {
		@Pc(8) dxVertexLayout local8 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local8.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method7051(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		if (arg1 != this.aCanvas11) {
			return;
		}
		@Pc(7) Dimension local7 = arg1.getSize();
		if (local7.width > 0 && local7.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method7195();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!gda;I)V")
	public void method7190(@OriginalArg(0) Class2_Sub2 arg0) {
		this.method7186(arg0);
		if (!this.aBooleanArray29[this.anInt9134]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 1, 1);
			this.aBooleanArray29[this.anInt9134] = true;
		}
		if (!this.aBooleanArray30[this.anInt9134]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9134, 2, 1);
			this.aBooleanArray30[this.anInt9134] = true;
		}
	}

	@OriginalMember(owner = "client!to", name = "S", descriptor = "(I)V")
	@Override
	protected void method7144() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt9137 + this.anInt9107, this.anInt9114 + this.anInt9117, this.anInt9113, this.anInt9111);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([IIZIIII)Lclient!mca;")
	@Override
	public Interface12 method7181(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class2_Sub1(this, arg5, arg2, arg1, arg0, 0, arg3);
	}

	@OriginalMember(owner = "client!to", name = "g", descriptor = "()V")
	@Override
	public void method8030() {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(B)V")
	@Override
	protected void method7081() {
		this.method7090();
		this.method7073();
	}

	@OriginalMember(owner = "client!to", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (js.b(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), 141953135) && js.b(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), 141953135)) {
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
		local6.a(false);
		local16.a(false);
		return local1;
	}

	@OriginalMember(owner = "client!to", name = "j", descriptor = "(I)V")
	@Override
	protected void method7055() {
		this.aFloat203 = this.anInt9129 - this.anInt9106;
		this.aFloat198 = this.aFloat203 - (float) this.anInt9110;
		if (this.aFloat198 < (float) this.anInt9127) {
			this.aFloat198 = this.anInt9127;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat198);
		this.anIDirect3DDevice1.a(37, this.aFloat203);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9133);
	}

	@OriginalMember(owner = "client!to", name = "p", descriptor = "(B)V")
	@Override
	protected void method7170() {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method7106(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass115_1 = (Class115) arg1;
	}

	@OriginalMember(owner = "client!to", name = "i", descriptor = "(I)V")
	@Override
	protected void method7050() {
		@Pc(15) int local15 = this.aBooleanArray28[this.anInt9134] ? Static518.method7189(this.aClass266Array6[this.anInt9134]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, 1, local15);
	}

	@OriginalMember(owner = "client!to", name = "o", descriptor = "(I)V")
	@Override
	protected void method7068() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray62);
	}

	@OriginalMember(owner = "client!to", name = "y", descriptor = "(I)V")
	@Override
	protected void method7095() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt9121; local1++) {
			@Pc(21) Class3_Sub9 local21 = this.aClass3_Sub9Array6[local1];
			@Pc(25) int local25 = local1 + 2;
			@Pc(29) int local29 = local21.method5994();
			@Pc(35) float local35 = local21.method5996() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local21.method5997(), (float) local21.method5990(), (float) local21.method5999());
			this.aD3DLIGHT3.SetDiffuse(local35 * (float) (local29 >> 16 & 0xFF), (float) (local29 >> 8 & 0xFF) * local35, local35 * (float) (local29 & 0xFF), 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local21.method6000() * local21.method6000()));
			this.aD3DLIGHT3.SetRange((float) local21.method6000());
			this.anIDirect3DDevice1.SetLight(local25, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local25, true);
		}
		while (local1 < this.anInt9135) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7095();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8024(@OriginalArg(0) int arg0) {
		this.aPi1.a((int) 12906);
		super.method8024(arg0);
	}

	@OriginalMember(owner = "client!to", name = "U", descriptor = "(I)V")
	@Override
	protected void method7163() {
		this.anIDirect3DDevice1.a(137, this.aBoolean608 && !this.aBoolean598);
	}

	@OriginalMember(owner = "client!to", name = "l", descriptor = "(B)V")
	@Override
	protected void method7145() {
		this.anIDirect3DDevice1.a(27, this.aBoolean609);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method8044(@OriginalArg(0) Class73 arg0) {
	}

	@OriginalMember(owner = "client!to", name = "N", descriptor = "(I)V")
	@Override
	protected void method7131() {
		if (this.aBooleanArray28[this.anInt9134]) {
			this.aBooleanArray28[this.anInt9134] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9134, null);
			this.method7121();
			this.method7050();
		}
	}

	@OriginalMember(owner = "client!to", name = "m", descriptor = "()Lclient!fe;")
	@Override
	public Class102 method8041() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt9145, 0);
		return new Class102(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(II)Lclient!ia;")
	@Override
	protected Class32 method7111(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class32_Sub3(this, this.aClass284_148);
		} else if (arg0 == 4) {
			return new Class32_Sub6(this, this.aClass284_148, this.aClass318_8);
		} else if (arg0 == 8) {
			return new Class32_Sub7(this, this.aClass284_148, this.aClass318_8);
		} else {
			return super.method7111(arg0);
		}
	}

	@OriginalMember(owner = "client!to", name = "g", descriptor = "(Z)F")
	@Override
	protected float method7084() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLclient!qs;)V")
	@Override
	public void method7067(@OriginalArg(1) Class273 arg0) {
		@Pc(1) int local1 = 0;
		if (Static596.aClass273_4 == arg0) {
			local1 = 65536;
		} else if (Static274.aClass273_1 == arg0) {
			local1 = 131072;
		} else if (Static401.aClass273_2 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, 11, this.anInt9134 | local1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!mg;Lclient!os;I)Z")
	@Override
	public boolean method7080(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class245 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return js.b(this.anIDirect3D1.a(this.anInt9145, local3), 141953135) && js.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9145, this.anInt9147, local3.Format, 0, 3, Static518.method7194(arg0, arg1)), 141953135);
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V")
	@Override
	protected void method7066() {
		this.anIDirect3DDevice1.a(14, this.aBoolean607 && this.aBoolean610);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7142(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!to", name = "z", descriptor = "()Z")
	@Override
	public boolean method8085() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "v", descriptor = "(I)V")
	@Override
	protected void method7091() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9123; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass65Array1[local1] = Static93.aClass65_7;
			this.aBooleanArray29[local1] = this.aBooleanArray30[local1] = true;
			this.aBooleanArray31[local1] = false;
			this.anIntArray533[local1] = 0;
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
		this.aBoolean619 = false;
		super.method7091();
	}

	@OriginalMember(owner = "client!to", name = "s", descriptor = "()V")
	@Override
	public void method8067() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (js.b(local3.Issue(), 141953135)) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(false);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZZ[[II)Lclient!pfa;")
	@Override
	public Interface18 method7053(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class2_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(B)V")
	@Override
	protected void method7073() {
		if (this.aBoolean619) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!to", name = "h", descriptor = "(II)V")
	@Override
	public void method7176(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, 11, arg0);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(ZI)Lclient!og;")
	@Override
	public Interface15 method7132(@OriginalArg(0) boolean arg0) {
		return new Class198(this, arg0);
	}

	@OriginalMember(owner = "client!to", name = "ab", descriptor = "(I)V")
	@Override
	protected void method7177() {
		this.anIDirect3DDevice1.a(174, this.aBoolean616);
	}

	@OriginalMember(owner = "client!to", name = "A", descriptor = "()V")
	@Override
	public void method8087() {
	}

	@OriginalMember(owner = "client!to", name = "bb", descriptor = "(I)V")
	@Override
	protected void method7184() {
		this.anIDirect3DDevice1.a(7, this.aBoolean597);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!og;II)V")
	@Override
	public void method7113(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class198 local2 = (Class198) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method4794());
	}

	@OriginalMember(owner = "client!to", name = "cb", descriptor = "(I)Z")
	private boolean method7195() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(16) Class115 local16 = (Class115) this.anObject17;
			this.method7085();
			local16.method3133();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static518.method7191(this.anInt9147, this.anIDirect3D1, this.anInt9145, this.anInt9115, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(49) int local49 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (js.b(local49, 141953135)) {
					local16.method3134(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.c(0));
					this.method7166();
					this.method7091();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!to", name = "u", descriptor = "(I)V")
	@Override
	protected void method7090() {
		@Pc(7) float local7 = this.aBoolean605 ? this.aFloat195 : 0.0F;
		@Pc(16) float local16 = this.aBoolean605 ? -this.aFloat205 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat189 * local7, this.aFloat201 * local7, this.aFloat193 * local7, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(local16 * this.aFloat189, local16 * this.aFloat201, local16 * this.aFloat193, 0.0F);
		this.aBoolean619 = false;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
	@Override
	public void method8023() {
	}

	@OriginalMember(owner = "client!to", name = "H", descriptor = "(I)V")
	@Override
	protected void method7121() {
		@Pc(19) int local19 = this.aBooleanArray28[this.anInt9134] ? Static518.method7189(this.aClass266Array5[this.anInt9134]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, 4, local19);
	}

	@OriginalMember(owner = "client!to", name = "G", descriptor = "(I)V")
	@Override
	public void method7114() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray67[0], -this.aFloatArray67[1], -this.aFloatArray67[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray66[0], -this.aFloatArray66[1], -this.aFloatArray66[2]);
		this.aBoolean619 = false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ko;IZZB)V")
	@Override
	public void method7083(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(15) byte local15;
		if (arg1 == 1) {
			local15 = 3;
		} else if (arg1 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		if (arg3) {
			local1 = 32;
		}
		if (arg2) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9134, local15, Static518.method7193(arg0) | local1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!os;Lclient!mg;B)Z")
	@Override
	public boolean method7147(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class204 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return js.b(this.anIDirect3D1.a(this.anInt9145, local9), 141953135) && js.b(this.anIDirect3D1.CheckDeviceFormat(this.anInt9145, this.anInt9147, local9.Format, 0, 4, Static518.method7194(arg1, arg0)), 141953135);
	}
}
