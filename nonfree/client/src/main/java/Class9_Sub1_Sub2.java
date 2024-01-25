import jaclib.peer.of;
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
import jagdx.fo;
import jagdx.wo;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!wda", name = "Gg", descriptor = "I")
	private int anInt9233 = 0;

	@OriginalMember(owner = "client!wda", name = "Rg", descriptor = "Z")
	private boolean aBoolean646 = false;

	@OriginalMember(owner = "client!wda", name = "Vg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!wda", name = "zg", descriptor = "I")
	private final int anInt9232;

	@OriginalMember(owner = "client!wda", name = "xg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!wda", name = "Sg", descriptor = "Lclient!jaclib/peer/of;")
	public final of anOf1;

	@OriginalMember(owner = "client!wda", name = "Mg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!wda", name = "Og", descriptor = "Lclient!ul;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!wda", name = "Pg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!wda", name = "Ug", descriptor = "I")
	private final int anInt9234;

	@OriginalMember(owner = "client!wda", name = "Bg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!wda", name = "Dg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!wda", name = "Fg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!wda", name = "Ng", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!wda", name = "Qg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!wda", name = "Cg", descriptor = "Z")
	public final boolean aBoolean644;

	@OriginalMember(owner = "client!wda", name = "Tg", descriptor = "Z")
	public final boolean aBoolean647;

	@OriginalMember(owner = "client!wda", name = "Jg", descriptor = "Z")
	public final boolean aBoolean645;

	@OriginalMember(owner = "client!wda", name = "Lg", descriptor = "[I")
	private final int[] anIntArray781;

	@OriginalMember(owner = "client!wda", name = "Kg", descriptor = "[Z")
	private final boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!wda", name = "wg", descriptor = "[Lclient!pw;")
	private final Class234[] aClass234Array1;

	@OriginalMember(owner = "client!wda", name = "vg", descriptor = "[Z")
	private final boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!wda", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray37;

	@OriginalMember(owner = "client!wda", name = "Ig", descriptor = "[Z")
	private final boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!wda", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!n;Lclient!kda;Ljava/lang/Integer;)Lclient!qa;")
	private static Class9 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class9_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) of local9 = new of();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x20 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(173) D3DPRESENT_PARAMETERS local173 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static532.method7789(local5, local3, arg3, local173, local13)) {
					throw new RuntimeException("");
				}
				local173.PresentationInterval = Integer.MIN_VALUE;
				local173.Windowed = true;
				local173.EnableAutoDepthStencil = true;
				@Pc(199) int local199 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local199 |= 0x10;
				}
				@Pc(224) IDirect3DDevice local224;
				try {
					local224 = local13.a(local3, local5, arg0, local199 | 0x40, local173);
				} catch (@Pc(226) wo local226) {
					local224 = local13.a(local3, local5, arg0, local199 | 0x20, local173);
				}
				@Pc(245) Class291 local245 = new Class291(local224.b(0), local224.b());
				local1 = new Class9_Sub1_Sub2(local3, local5, arg0, local9, local13, local224, local245, local173, local18, arg1, arg2, arg3);
				local1.method7773();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(268) RuntimeException local268) {
			if (local1 != null) {
				local1.method7566();
			}
			throw local268;
		}
	}

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/of;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!ul;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!n;Lclient!kda;I)V")
	public Class9_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) of arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class291 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface8 arg9, @OriginalArg(10) Class160 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anIDirect3D1 = arg4;
		this.anInt9232 = arg0;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anOf1 = arg3;
		this.anIDirect3DDevice1 = arg5;
		this.aClass291_1 = arg6;
		this.aD3DCAPS1 = arg8;
		this.anInt9234 = arg1;
		this.aD3DLIGHT1 = new D3DLIGHT(this.anOf1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.anOf1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.anOf1);
		this.aPixelBuffer1 = new PixelBuffer(this.anOf1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.anOf1);
		this.aBoolean629 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean633 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.anInt9204 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean644 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean647 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.anInt9203 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean645 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean636 = this.anInt9223 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9232, this.anInt9234, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.anIntArray781 = new int[this.anInt9203];
		this.aBooleanArray39 = new boolean[this.anInt9203];
		this.aClass234Array1 = new Class234[this.anInt9203];
		this.aBooleanArray36 = new boolean[this.anInt9203];
		this.aBooleanArray37 = new boolean[this.anInt9203];
		this.aBooleanArray38 = new boolean[this.anInt9203];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method7637();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(228) Exception_Sub1 local228) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "()V")
	@Override
	public void method7602() {
	}

	@OriginalMember(owner = "client!wda", name = "x", descriptor = "(I)V")
	@Override
	protected void method7699() {
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean638);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean638);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZZ)Lclient!af;")
	@Override
	public Interface1 method7718(@OriginalArg(0) boolean arg0) {
		return new Class235(this, Static489.aClass289_14, arg0);
	}

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "(B)V")
	@Override
	protected void method7685() {
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)V")
	@Override
	public void method7610(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!qba;Lclient!qba;FLclient!qba;)Lclient!qba;")
	@Override
	public Class25 method7609(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLclient!sk;)V")
	@Override
	public void method7664(@OriginalArg(1) Class265 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(Z)V")
	@Override
	protected void method7650() {
		this.anIDirect3DDevice1.a(27, this.aBoolean632);
	}

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7689() {
		if (Static259.aClass171_6 == this.aClass171Array3[this.anInt9192]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, 24, 0);
			this.anIntArray781[this.anInt9192] = 0;
			return;
		}
		if (Static218.aClass171_5 == this.aClass171Array3[this.anInt9192]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt9192 + 16, this.aClass22_Sub3Array3[this.anInt9192].method5953(Static532.aFloatArray82));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt9192 + 16, this.aClass22_Sub3Array3[this.anInt9192].method5969(Static532.aFloatArray82));
		}
		@Pc(54) int local54 = Static532.method7786(this.aClass171Array3[this.anInt9192]);
		if (local54 != this.anIntArray781[this.anInt9192]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, 24, local54);
			this.anIntArray781[this.anInt9192] = local54;
		}
	}

	@OriginalMember(owner = "client!wda", name = "Y", descriptor = "(I)V")
	@Override
	protected void method7767() {
		if (Static166.aClass196_3 == this.aClass196_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass196_7 == Static224.aClass196_4) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static526.aClass196_6 == this.aClass196_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "(I)V")
	@Override
	protected void method7687() {
		if (this.aBoolean626) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt9218);
			return;
		}
		this.aFloat189 = this.anInt9198 - this.anInt9197;
		this.aFloat184 = (float) -this.anInt9215 + this.aFloat189;
		if (this.aFloat184 < (float) this.anInt9217) {
			this.aFloat184 = this.anInt9217;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat184);
		this.anIDirect3DDevice1.a(37, this.aFloat189);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt9212);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII[IZI)Lclient!jb;")
	@Override
	public Interface5 method7771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		return new Class21_Sub2(this, arg2, arg0, arg5, arg4, 0, arg3);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!wda", name = "w", descriptor = "(I)V")
	@Override
	protected void method7698() {
		this.anIDirect3DDevice1.SetViewport(this.anInt9229, this.anInt9207, this.anInt9150, this.anInt9085, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!wda", name = "z", descriptor = "(I)V")
	@Override
	protected void method7701() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray81);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I[Lclient!wj;)Lclient!sk;")
	@Override
	public Class265 method7729(@OriginalArg(1) Class317[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!wda", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return 0;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!gf;III)V")
	@Override
	public void method7667(@OriginalArg(0) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static532.method7781(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLclient!iw;)V")
	public void method7782(@OriginalArg(1) Class21_Sub2 arg0) {
		this.method7783(arg0);
		if (arg0.aBoolean274 != this.aBooleanArray38[this.anInt9192]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 1, arg0.aBoolean274 ? 1 : 3);
			this.aBooleanArray38[this.anInt9192] = arg0.aBoolean274;
		}
		if (this.aBooleanArray39[this.anInt9192] != arg0.aBoolean273) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 2, arg0.aBoolean273 ? 1 : 3);
			this.aBooleanArray39[this.anInt9192] = arg0.aBoolean273;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLclient!ui;Lclient!aq;)Z")
	@Override
	public boolean method7713(@OriginalArg(1) Class289 arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(10) D3DDISPLAYMODE local10 = this.anIDirect3D1.b(this.anInt9232);
		return fo.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt9232, this.anInt9234, local10.Format, 0, 3, Static532.method7780(arg0, arg1)), (byte) 45);
	}

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "(I)V")
	@Override
	protected void method7690() {
		this.aD3DLIGHT1.SetDiffuse(this.aFloat192 * this.aFloat200, this.aFloat192 * this.aFloat199, this.aFloat192 * this.aFloat188, 0.0F);
		this.aD3DLIGHT2.SetDiffuse(this.aFloat200 * -this.aFloat197, this.aFloat199 * -this.aFloat197, -this.aFloat197 * this.aFloat188, 0.0F);
		this.aBoolean646 = false;
	}

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "(I)V")
	@Override
	protected void method7700() {
		if (this.aClass123_7.method3505()) {
			this.aClass22_Sub3_18.method5953(Static532.aFloatArray82);
		} else {
			Static532.aFloatArray82[12] = 0.0F;
			Static532.aFloatArray82[13] = 0.0F;
			Static532.aFloatArray82[15] = 1.0F;
			Static532.aFloatArray82[14] = 0.0F;
			Static532.aFloatArray82[1] = 0.0F;
			Static532.aFloatArray82[10] = 1.0F;
			Static532.aFloatArray82[9] = 0.0F;
			Static532.aFloatArray82[6] = 0.0F;
			Static532.aFloatArray82[2] = 0.0F;
			Static532.aFloatArray82[5] = 1.0F;
			Static532.aFloatArray82[7] = 0.0F;
			Static532.aFloatArray82[8] = 0.0F;
			Static532.aFloatArray82[4] = 0.0F;
			Static532.aFloatArray82[0] = 1.0F;
			Static532.aFloatArray82[3] = 0.0F;
			Static532.aFloatArray82[11] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static532.aFloatArray82);
	}

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "()Z")
	@Override
	public boolean method7591() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "(I)V")
	@Override
	protected void method7671() {
		this.anIDirect3DDevice1.a(28, this.aBoolean634 && this.aBoolean631 && this.anInt9215 >= 0 | this.aBoolean626);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(B)F")
	@Override
	protected float method7660() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method7783(@OriginalArg(0) Class21 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt9192, arg0.method6151());
		if (arg0.aClass234_8 != this.aClass234Array1[this.anInt9192]) {
			@Pc(25) int local25 = Static532.method7779(arg0.aClass234_8);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 6, local25);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 5, local25);
			this.aClass234Array1[this.anInt9192] = arg0.aClass234_8;
			if (this.aBooleanArray37[this.anInt9192] != arg0.aBoolean475) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 7, arg0.aBoolean475 ? Static532.method7779(arg0.aClass234_8) : 0);
				this.aBooleanArray37[this.anInt9192] = arg0.aBoolean475;
			}
		} else if (this.aBooleanArray37[this.anInt9192] != arg0.aBoolean475) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 7, arg0.aBoolean475 ? Static532.method7779(arg0.aClass234_8) : 0);
			this.aBooleanArray37[this.anInt9192] = arg0.aBoolean475;
		}
		if (!this.aBooleanArray36[this.anInt9192]) {
			this.aBooleanArray36[this.anInt9192] = true;
			this.method7709();
			this.method7734();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method7725(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZILclient!hm;)V")
	@Override
	protected void method7661(@OriginalArg(0) int arg0, @OriginalArg(3) Class122 arg1) {
		@Pc(11) byte local11;
		if (arg0 == 1) {
			local11 = 6;
		} else if (arg0 == 2) {
			local11 = 27;
		} else {
			local11 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, local11, Static532.method7784(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "(I)V")
	@Override
	protected void method7708() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt9228);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IILclient!ui;ILclient!aq;)Lclient!jb;")
	@Override
	public Interface5 method7775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class289 arg2, @OriginalArg(4) Class16 arg3) {
		return new Class21_Sub2(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!wda", name = "R", descriptor = "(I)V")
	@Override
	protected void method7753() {
		if (this.aBooleanArray36[this.anInt9192]) {
			this.aBooleanArray36[this.anInt9192] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt9192, null);
			this.method7709();
			this.method7734();
		}
	}

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "(B)V")
	@Override
	public void method7682() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray75[0], -this.aFloatArray75[1], -this.aFloatArray75[2]);
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray74[0], -this.aFloatArray74[1], -this.aFloatArray74[2]);
		this.aBoolean646 = false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method7684(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 == this.aCanvas15) {
			this.anIDirect3DDevice1.EndScene();
			this.method7788();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!wda", name = "N", descriptor = "(I)V")
	@Override
	protected void method7745() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9203; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass234Array1[local1] = Static66.aClass234_3;
			this.aBooleanArray38[local1] = this.aBooleanArray39[local1] = true;
			this.aBooleanArray37[local1] = false;
			this.anIntArray781[local1] = 0;
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
		this.aBoolean646 = false;
		super.method7745();
	}

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "()Z")
	@Override
	public boolean method7583() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!aq;IIII[B)Lclient!vi;")
	@Override
	public Interface18 method7648(@OriginalArg(0) Class16 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class21_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "()V")
	@Override
	protected void method7566() {
		this.anOf1.a((int) -67);
		super.method7566();
	}

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "(I)V")
	@Override
	protected void method7716() {
		if (this.aBoolean646) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, !this.aBoolean638);
		this.anIDirect3DDevice1.LightEnable(1, !this.aBoolean638);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.LightEnable(0, this.aBoolean638);
		this.anIDirect3DDevice1.LightEnable(1, this.aBoolean638);
		this.aBoolean646 = true;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!ql;IB)V")
	@Override
	public void method7697(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class257 local2 = (Class257) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local2.anIDirect3DVertexBuffer1, 0, local2.method6279());
	}

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (fo.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1), (byte) 93) && fo.a(local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1), (byte) 102)) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					this.aPixelBuffer1.b(local1, arg2 * local63, local63 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(2266);
		local16.a(2266);
		return local1;
	}

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "(B)V")
	@Override
	protected void method7672() {
		this.anIDirect3DDevice1.a(7, this.aBoolean627);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7756(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7748(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass291_1 = (Class291) arg0;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIZ[[I)Lclient!wv;")
	@Override
	public Interface20 method7770(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class21_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)Lclient!ql;")
	@Override
	public Interface15 method7707(@OriginalArg(0) boolean arg0) {
		return new Class257(this, arg0);
	}

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "(B)V")
	@Override
	protected void method7709() {
		@Pc(21) int local21 = this.aBooleanArray36[this.anInt9192] ? Static532.method7785(this.aClass295Array6[this.anInt9192]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, 4, local21);
	}

	@OriginalMember(owner = "client!wda", name = "K", descriptor = "(I)V")
	@Override
	protected void method7741() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt9222; local1++) {
			@Pc(10) Class1_Sub27 local10 = this.aClass1_Sub27Array6[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method5488();
			@Pc(24) float local24 = local10.method5486() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local10.method5493(), (float) local10.method5487(), (float) local10.method5495());
			this.aD3DLIGHT3.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method5496() * local10.method5496()));
			this.aD3DLIGHT3.SetRange((float) local10.method5496());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt9213) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method7741();
	}

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7727() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat200 * this.aFloat202, this.aFloat202 * this.aFloat199, this.aFloat202 * this.aFloat188, 0.0F);
		this.aBoolean646 = false;
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "()V")
	@Override
	public void method7570() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (!fo.a(local3.Issue(), (byte) 38)) {
			return;
		}
		while (true) {
			@Pc(12) int local12 = local3.IsSignaled();
			if (local12 != 1) {
				break;
			}
			Thread.yield();
		}
	}

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "(B)V")
	@Override
	protected void method7673() {
		this.anIDirect3DDevice1.SetScissorRect(this.bf + this.anInt9229, this.anInt9214 + this.anInt9207, this.anInt9225, this.anInt9221);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([BLclient!aq;ZIIIIZ)Lclient!jb;")
	@Override
	protected Interface5 method7721(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		return new Class21_Sub2(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!aq;Lclient!ui;)Z")
	@Override
	public boolean method7663(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class289 arg1) {
		@Pc(5) D3DDISPLAYMODE local5 = this.anIDirect3D1.b(this.anInt9232);
		return fo.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt9232, this.anInt9234, local5.Format, 0, 4, Static532.method7780(arg1, arg0)), (byte) 95);
	}

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "()V")
	@Override
	public void method7619() {
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(ZB)V")
	@Override
	public void method7653(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "(B)V")
	@Override
	protected void method7734() {
		@Pc(29) int local29 = this.aBooleanArray36[this.anInt9192] ? Static532.method7785(this.aClass295Array5[this.anInt9192]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, 1, local29);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!av;B)V")
	public void method7787(@OriginalArg(0) Class21_Sub1 arg0) {
		this.method7783(arg0);
		if (!this.aBooleanArray38[this.anInt9192]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 1, 1);
			this.aBooleanArray38[this.anInt9192] = true;
		}
		if (!this.aBooleanArray39[this.anInt9192]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt9192, 2, 1);
			this.aBooleanArray39[this.anInt9192] = true;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIB[FIIZLclient!aq;)Lclient!jb;")
	@Override
	protected Interface5 method7655(@OriginalArg(3) float[] arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) Class16 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(II)V")
	@Override
	public void method7647(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, 11, arg0);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLclient!ee;)V")
	@Override
	public void method7731(@OriginalArg(1) Class74 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 == Static200.aClass74_3) {
			local1 = 65536;
		} else if (arg0 == Static193.aClass74_2) {
			local1 = 131072;
		} else if (arg0 == Static49.aClass74_1) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, 11, this.anInt9192 | local1);
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(II)Lclient!gl;")
	@Override
	protected Class17 method7728(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class17_Sub6(this, this.aClass160_104);
		} else if (arg0 == 4) {
			return new Class17_Sub9(this, this.aClass160_104, this.aClass155_6);
		} else {
			return super.method7728(arg0);
		}
	}

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "()V")
	@Override
	public void method7637() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass291_1.method7080()) {
			this.anInt9233 = 0;
			if (fo.a(this.aClass291_1.method7079(), true)) {
				this.method7788();
			}
		} else if (++this.anInt9233 <= 50) {
			this.method7788();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!wda", name = "db", descriptor = "(I)Z")
	private boolean method7788() {
		@Pc(10) int local10 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local10 == 0 || local10 == -2005530519) {
			@Pc(21) Class291 local21 = (Class291) this.anObject16;
			this.method7755();
			local21.method7081();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static532.method7789(this.anInt9234, this.anInt9232, this.anInt9223, this.aD3DPRESENT_PARAMETERS1, this.anIDirect3D1)) {
				@Pc(54) int local54 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (fo.a(local54, (byte) 43)) {
					local21.method7082(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.b(0));
					this.method7757();
					this.method7745();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "()V")
	@Override
	public void method7623() {
		this.method7724(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLclient!gf;IIIILclient!af;)V")
	@Override
	public void method7658(@OriginalArg(1) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface1 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class235) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static532.method7781(arg0), 0, arg1, arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7567(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7637();
	}

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7742() {
		this.anIDirect3DDevice1.a(174, this.aBoolean643);
	}

	@OriginalMember(owner = "client!wda", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "()Lclient!cr;")
	@Override
	public Class49 method7626() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt9232, 0);
		return new Class49(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "(Z)V")
	@Override
	protected void method7761() {
		this.anIDirect3DDevice1.a(15, this.aBoolean630);
	}

	@OriginalMember(owner = "client!wda", name = "I", descriptor = "(I)V")
	@Override
	protected void method7739() {
		this.anIDirect3DDevice1.a(14, this.aBoolean641 && this.aBoolean637);
	}

	@OriginalMember(owner = "client!wda", name = "X", descriptor = "(I)V")
	@Override
	protected void method7763() {
		if (this.aBoolean623) {
			Static532.aFloatArray82[3] = 0.0F;
			Static532.aFloatArray82[0] = 1.0F;
			Static532.aFloatArray82[14] = 0.0F;
			Static532.aFloatArray82[2] = 0.0F;
			Static532.aFloatArray82[1] = 0.0F;
			Static532.aFloatArray82[13] = 0.0F;
			Static532.aFloatArray82[15] = 1.0F;
			Static532.aFloatArray82[12] = 0.0F;
			Static532.aFloatArray82[8] = 0.0F;
			Static532.aFloatArray82[11] = 0.0F;
			Static532.aFloatArray82[6] = 0.0F;
			Static532.aFloatArray82[5] = 1.0F;
			Static532.aFloatArray82[4] = 0.0F;
			Static532.aFloatArray82[9] = 0.0F;
			Static532.aFloatArray82[7] = 0.0F;
			Static532.aFloatArray82[10] = 1.0F;
		} else {
			this.aClass22_Sub3_15.method5953(Static532.aFloatArray82);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static532.aFloatArray82);
	}

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "(I)V")
	@Override
	protected void method7651() {
		this.anIDirect3DDevice1.a(137, this.aBoolean625 && !this.aBoolean640);
	}

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "()V")
	@Override
	public void method7586() {
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZIBZLclient!hm;)V")
	@Override
	public void method7692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class122 arg3) {
		@Pc(1) int local1 = 0;
		@Pc(15) byte local15;
		if (arg1 == 1) {
			local15 = 3;
		} else if (arg1 == 2) {
			local15 = 26;
		} else {
			local15 = 2;
		}
		if (arg0) {
			local1 = 32;
		}
		if (arg2) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt9192, local15, local1 | Static532.method7784(arg3));
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method7613(@OriginalArg(0) int arg0) {
		this.anOf1.a((byte) 123);
		super.method7613(arg0);
	}
}
