import jaclib.peer.bu;
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
import jagdx.fma;
import jagdx.oia;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class22_Sub2_Sub1 extends Class22_Sub2 {

	@OriginalMember(owner = "client!tha", name = "Mg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader7;

	@OriginalMember(owner = "client!tha", name = "Bg", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!tha", name = "Rg", descriptor = "I")
	private int anInt9635 = 0;

	@OriginalMember(owner = "client!tha", name = "Vg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!tha", name = "Wg", descriptor = "I")
	private final int anInt9633;

	@OriginalMember(owner = "client!tha", name = "yg", descriptor = "Lclient!aca;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!tha", name = "Kg", descriptor = "I")
	private final int anInt9634;

	@OriginalMember(owner = "client!tha", name = "Dg", descriptor = "Lclient!jaclib/peer/bu;")
	public final bu aBu1;

	@OriginalMember(owner = "client!tha", name = "xg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!tha", name = "Gg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!tha", name = "Og", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!tha", name = "Sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!tha", name = "wg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!tha", name = "Fg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!tha", name = "Ng", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!tha", name = "Ig", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!tha", name = "Hg", descriptor = "Z")
	public final boolean aBoolean644;

	@OriginalMember(owner = "client!tha", name = "Ag", descriptor = "Z")
	public final boolean aBoolean645;

	@OriginalMember(owner = "client!tha", name = "Ug", descriptor = "Z")
	public final boolean aBoolean646;

	@OriginalMember(owner = "client!tha", name = "Jg", descriptor = "[Lclient!on;")
	private final Class280[] aClass280Array1;

	@OriginalMember(owner = "client!tha", name = "Qg", descriptor = "[Z")
	private final boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!tha", name = "Cg", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!tha", name = "Eg", descriptor = "[Z")
	private final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!tha", name = "Pg", descriptor = "[Z")
	private final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!tha", name = "Lg", descriptor = "[I")
	private final int[] anIntArray693;

	@OriginalMember(owner = "client!tha", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!ik;Ljava/lang/Integer;)Lclient!ha;")
	private static Class22 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class22_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) bu local9 = new bu();
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
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(190) D3DPRESENT_PARAMETERS local190 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static622.method8194(arg3, local3, local13, local5, local190)) {
					throw new RuntimeException("");
				}
				local190.Windowed = true;
				local190.PresentationInterval = Integer.MIN_VALUE;
				local190.EnableAutoDepthStencil = true;
				@Pc(216) int local216 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local216 |= 0x10;
				}
				@Pc(240) IDirect3DDevice local240;
				try {
					local240 = local13.a(local3, local5, arg0, local216 | 0x40, local190);
				} catch (@Pc(242) oia local242) {
					local240 = local13.a(local3, local5, arg0, local216 | 0x20, local190);
				}
				@Pc(261) Class5 local261 = new Class5(local240.c(0), local240.b());
				local1 = new Class22_Sub2_Sub1(local3, local5, arg0, local9, local13, local240, local261, local190, local18, arg1, arg2, arg3);
				local1.method8903();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(284) RuntimeException local284) {
			if (local1 != null) {
				local1.method9339();
			}
			throw local284;
		}
	}

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/bu;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!aca;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!ik;I)V")
	private Class22_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) bu arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class182 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.anInt9633 = arg0;
			this.aClass5_1 = arg6;
			this.anInt9634 = arg1;
			this.aBu1 = arg3;
			this.anIDirect3D1 = arg4;
			this.anIDirect3DDevice1 = arg5;
			this.aD3DCAPS1 = arg8;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aBu1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aBu1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aBu1);
			this.aPixelBuffer1 = new PixelBuffer(this.aBu1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aBu1);
			new GeometryBuffer(this.aBu1);
			this.anInt10459 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean700 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean693 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean644 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean645 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.anInt10491 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean646 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean696 = this.anInt10453 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt9633, this.anInt9634, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aClass280Array1 = new Class280[this.anInt10459];
			this.aBooleanArray29 = new boolean[this.anInt10459];
			this.aBooleanArray26 = new boolean[this.anInt10459];
			this.aBooleanArray28 = new boolean[this.anInt10459];
			this.aBooleanArray27 = new boolean[this.anInt10459];
			this.anIntArray693 = new int[this.anInt10459];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(236) Throwable local236) {
			local236.printStackTrace();
			this.method9397();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tha", name = "db", descriptor = "(I)V")
	@Override
	protected void method8859() {
		@Pc(25) int local25 = this.aBooleanArray26[this.anInt10465] ? Static622.method8201(this.aClass372Array5[this.anInt10465]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, 4, local25);
	}

	@OriginalMember(owner = "client!tha", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8902(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!tha", name = "r", descriptor = "(I)V")
	@Override
	protected void method8967() {
		this.anIDirect3DDevice1.a(15, this.aBoolean701);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method8190(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZILclient!vga;I)V")
	@Override
	protected void method8868(@OriginalArg(1) int arg0, @OriginalArg(2) Class392 arg1) {
		@Pc(23) byte local23;
		if (arg0 == 1) {
			local23 = 6;
		} else if (arg0 == 2) {
			local23 = 27;
		} else {
			local23 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, local23, Static622.method8196(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method8982(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!tha", name = "t", descriptor = "(B)V")
	@Override
	protected void method8889() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray71);
	}

	@OriginalMember(owner = "client!tha", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tha", name = "B", descriptor = "()V")
	@Override
	public void method9372() {
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tha", name = "y", descriptor = "(B)V")
	@Override
	protected void method8876() {
		@Pc(8) float local8 = this.aBoolean704 ? this.aFloat188 : 0.0F;
		@Pc(18) float local18 = this.aBoolean704 ? -this.aFloat190 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(this.aFloat186 * local8, local8 * this.aFloat178, local8 * this.aFloat185, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(this.aFloat186 * local18, this.aFloat178 * local18, local18 * this.aFloat185, 0.0F);
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!tk;)V")
	public void method8192(@OriginalArg(1) Class217_Sub2 arg0) {
		this.method8197(arg0);
		if (this.aBooleanArray29[this.anInt10465] != arg0.aBoolean650) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 1, arg0.aBoolean650 ? 1 : 3);
			this.aBooleanArray29[this.anInt10465] = arg0.aBoolean650;
		}
		if (arg0.aBoolean649 != this.aBooleanArray27[this.anInt10465]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 2, arg0.aBoolean649 ? 1 : 3);
			this.aBooleanArray27[this.anInt10465] = arg0.aBoolean649;
		}
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method9394(@OriginalArg(0) int arg0) {
		this.aBu1.b(-80);
		super.method9394(arg0);
	}

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "(B)V")
	@Override
	protected void method8906() {
		this.anIDirect3DDevice1.a(27, this.aBoolean694);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIBZ[FIILclient!sca;)Lclient!pt;")
	@Override
	protected Interface16 method8931(@OriginalArg(3) boolean arg0, @OriginalArg(4) float[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class335 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!lma;ZI)V")
	@Override
	public void method8904(@OriginalArg(0) int arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static622.method8202(arg1), arg0, arg2);
	}

	@OriginalMember(owner = "client!tha", name = "A", descriptor = "(I)V")
	@Override
	protected void method8875() {
		if (this.anIDirect3DVertexShader7 != null || Static184.aClass222_1 == this.aClass222Array3[this.anInt10465]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, 24, 0);
			this.anIntArray693[this.anInt10465] = 0;
			return;
		}
		if (this.aClass222Array3[this.anInt10465] == Static606.aClass222_6) {
			this.anIDirect3DDevice1.SetTransform(this.anInt10465 + 16, this.aClass58_Sub2Array3[this.anInt10465].method6093(Static622.aFloatArray66));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt10465 + 16, this.aClass58_Sub2Array3[this.anInt10465].method6092(Static622.aFloatArray66));
		}
		@Pc(68) int local68 = Static622.method8191(this.aClass222Array3[this.anInt10465]);
		if (local68 != this.anIntArray693[this.anInt10465]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, 24, local68);
			this.anIntArray693[this.anInt10465] = local68;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!hu;IILclient!sca;I)Lclient!pt;")
	@Override
	public Interface16 method8857(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class335 arg3) {
		return new Class217_Sub2(this, arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!hu;ILclient!sca;)Z")
	@Override
	public boolean method8953(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class335 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return fma.a(this.anIDirect3D1.a(this.anInt9633, local8), (byte) 104) && fma.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt9633, this.anInt9634, local8.Format, 0, 3, Static622.method8193(arg0, arg1)), (byte) 104);
	}

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "(B)V")
	@Override
	public void method8928() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray72[0], -this.aFloatArray72[1], -this.aFloatArray72[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray76[0], -this.aFloatArray76[1], -this.aFloatArray76[2]);
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;I)V")
	public void method8195(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader7 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method8875();
	}

	@OriginalMember(owner = "client!tha", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "(B)V")
	@Override
	protected void method8874() {
		if (this.aBooleanArray26[this.anInt10465]) {
			this.aBooleanArray26[this.anInt10465] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt10465, (IDirect3DBaseTexture) null);
			this.method8859();
			this.method8974();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9385(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method9391(arg2, arg3);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)Lclient!si;")
	@Override
	public Interface23 method9381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!wh;)V")
	@Override
	public void method8894(@OriginalArg(1) Class36 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!lq;II)V")
	@Override
	public void method8912(@OriginalArg(0) Interface14 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class15 local10 = (Class15) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local10.anIDirect3DVertexBuffer1, 0, local10.method640());
	}

	@OriginalMember(owner = "client!tha", name = "t", descriptor = "(I)V")
	@Override
	protected void method8955() {
		if (this.aClass72_27.method1981()) {
			this.aClass58_Sub2_18.method6092(Static622.aFloatArray66);
		} else {
			Static622.aFloatArray66[11] = 0.0F;
			Static622.aFloatArray66[15] = 1.0F;
			Static622.aFloatArray66[10] = 1.0F;
			Static622.aFloatArray66[2] = 0.0F;
			Static622.aFloatArray66[7] = 0.0F;
			Static622.aFloatArray66[1] = 0.0F;
			Static622.aFloatArray66[5] = 1.0F;
			Static622.aFloatArray66[0] = 1.0F;
			Static622.aFloatArray66[3] = 0.0F;
			Static622.aFloatArray66[9] = 0.0F;
			Static622.aFloatArray66[12] = 0.0F;
			Static622.aFloatArray66[4] = 0.0F;
			Static622.aFloatArray66[14] = 0.0F;
			Static622.aFloatArray66[13] = 0.0F;
			Static622.aFloatArray66[8] = 0.0F;
			Static622.aFloatArray66[6] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static622.aFloatArray66);
	}

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "(II)Lclient!ag;")
	@Override
	protected Class10 method8960(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class10_Sub5(this, this.aClass182_122);
		} else if (arg0 == 4) {
			return new Class10_Sub9(this, this.aClass182_122, this.aClass172_7);
		} else if (arg0 == 8) {
			return new Class10_Sub2(this, this.aClass182_122, this.aClass172_7);
		} else {
			return super.method8960(arg0);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "()V")
	@Override
	public void method9396() {
	}

	@OriginalMember(owner = "client!tha", name = "v", descriptor = "(I)V")
	@Override
	protected void method8975() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt10488 + this.anInt10469, this.anInt10484 + this.anInt10456, this.anInt10460, this.anInt10472);
	}

	@OriginalMember(owner = "client!tha", name = "z", descriptor = "()V")
	@Override
	public void method9389() {
	}

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "(Z)V")
	@Override
	protected void method8915() {
		this.aFloat181 = (float) (this.anInt10478 - this.anInt10458);
		this.aFloat187 = this.aFloat181 - (float) this.anInt10480;
		if (this.aFloat187 < (float) this.anInt10464) {
			this.aFloat187 = (float) this.anInt10464;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat187);
		this.anIDirect3DDevice1.a(37, this.aFloat181);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt10487);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)V")
	@Override
	public void method9393(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tha", name = "x", descriptor = "(I)V")
	@Override
	protected void method8977() {
		@Pc(9) int local9;
		for (local9 = 0; local9 < this.anInt10477; local9++) {
			@Pc(18) Class3_Sub5 local18 = this.aClass3_Sub5Array5[local9];
			@Pc(22) int local22 = local9 + 2;
			@Pc(26) int local26 = local18.method7172();
			@Pc(32) float local32 = local18.method7176() / 255.0F;
			this.aD3DLIGHT3.SetPosition((float) local18.method7174(), (float) local18.method7175(), (float) local18.method7177());
			this.aD3DLIGHT3.SetDiffuse(local32 * (float) (local26 >> 16 & 0xFF), (float) (local26 >> 8 & 0xFF) * local32, (float) (local26 & 0xFF) * local32, 0.0F);
			this.aD3DLIGHT3.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local18.method7173() * local18.method7173()));
			this.aD3DLIGHT3.SetRange((float) local18.method7173());
			this.anIDirect3DDevice1.SetLight(local22, this.aD3DLIGHT3);
			this.anIDirect3DDevice1.LightEnable(local22, true);
		}
		while (this.anInt10467 > local9) {
			this.anIDirect3DDevice1.LightEnable(local9 + 2, false);
			local9++;
		}
		super.method8977();
	}

	@OriginalMember(owner = "client!tha", name = "T", descriptor = "(I)V")
	@Override
	protected void method8901() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt10459; local5++) {
			this.anIDirect3DDevice1.SetSamplerState(local5, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local5, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local5, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local5, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local5, 2, 1);
			this.aClass280Array1[local5] = Static131.aClass280_4;
			this.aBooleanArray29[local5] = this.aBooleanArray27[local5] = true;
			this.aBooleanArray28[local5] = false;
			this.anIntArray693[local5] = 0;
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
		this.aBoolean643 = false;
		super.method8901();
	}

	@OriginalMember(owner = "client!tha", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	@Override
	protected Object method8890(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(BZ)Lclient!lq;")
	@Override
	public Interface14 method8937(@OriginalArg(1) boolean arg0) {
		return new Class15(this, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!sca;Lclient!hu;)Z")
	@Override
	public boolean method8895(@OriginalArg(1) Class335 arg0, @OriginalArg(2) Class167 arg1) {
		@Pc(11) D3DDISPLAYMODE local11 = new D3DDISPLAYMODE();
		return fma.a(this.anIDirect3D1.a(this.anInt9633, local11), (byte) 113) && fma.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt9633, this.anInt9634, local11.Format, 0, 4, Static622.method8193(arg1, arg0)), (byte) 107);
	}

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "()V")
	@Override
	public void method9351() {
	}

	@OriginalMember(owner = "client!tha", name = "k", descriptor = "()Z")
	@Override
	public boolean method9332() {
		return false;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method8882(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass5_1 = (Class5) arg0;
	}

	@OriginalMember(owner = "client!tha", name = "K", descriptor = "(I)V")
	@Override
	protected void method8983() {
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IZZILclient!vga;)V")
	@Override
	public void method8954(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class392 arg3) {
		@Pc(1) int local1 = 0;
		@Pc(17) byte local17;
		if (arg0 == 1) {
			local17 = 3;
		} else if (arg0 == 2) {
			local17 = 26;
		} else {
			local17 = 2;
		}
		if (arg2) {
			local1 = 32;
		}
		if (arg1) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, local17, local1 | Static622.method8196(arg3));
	}

	@OriginalMember(owner = "client!tha", name = "B", descriptor = "(I)V")
	@Override
	protected void method8858() {
		this.method8876();
		this.method8888();
	}

	@OriginalMember(owner = "client!tha", name = "w", descriptor = "(I)V")
	@Override
	protected void method8888() {
		if (this.aBoolean643) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean643 = true;
	}

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "(B)V")
	@Override
	protected void method8941() {
		this.anIDirect3DDevice1.a(28, this.aBoolean698 && this.aBoolean686 && this.anInt10480 >= 0);
	}

	@OriginalMember(owner = "client!tha", name = "H", descriptor = "(I)V")
	@Override
	protected void method8920() {
		this.anIDirect3DDevice1.a(137, this.aBoolean703 && !this.aBoolean688);
	}

	@OriginalMember(owner = "client!tha", name = "s", descriptor = "(I)V")
	@Override
	protected void method8856() {
		this.anIDirect3DDevice1.a(7, this.aBoolean689);
	}

	@OriginalMember(owner = "client!tha", name = "l", descriptor = "(B)F")
	@Override
	protected float method8959() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!tha", name = "C", descriptor = "(I)V")
	@Override
	protected void method8891() {
		this.anIDirect3DDevice1.SetViewport(this.anInt10488, this.anInt10456, this.anInt10347, this.anInt10377, (float) 0, 1.0F);
	}

	@OriginalMember(owner = "client!tha", name = "l", descriptor = "()V")
	@Override
	public void method9345() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (fma.a(local3.Issue(), (byte) -5)) {
			while (true) {
				@Pc(13) int local13 = local3.IsSignaled();
				if (local13 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -40);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method8910(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas11) {
			return;
		}
		@Pc(8) Dimension local8 = arg0.getSize();
		if (local8.width > 0 && local8.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method8198();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(ZI)Lclient!kl;")
	@Override
	public Interface11 method8916(@OriginalArg(0) boolean arg0) {
		return new Class244(this, Static259.aClass167_8, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "o", descriptor = "()Z")
	@Override
	public boolean method9365() {
		return false;
	}

	@OriginalMember(owner = "client!tha", name = "P", descriptor = "(I)V")
	@Override
	protected void method8860() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat182 * this.aFloat186, this.aFloat178 * this.aFloat182, this.aFloat182 * this.aFloat185, 0.0F);
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B[Lclient!ega;)Lclient!wh;")
	@Override
	public Class36 method8944(@OriginalArg(1) Class95[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "([BLclient!sca;IBII)Lclient!rm;")
	@Override
	public Interface19 method8850(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class335 arg1) {
		return new Class217_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "(B)V")
	@Override
	protected void method8957() {
		if (Static302.aClass135_5 == this.aClass135_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass135_8 == Static197.aClass135_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass135_8 == Static77.aClass135_2) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "([[IIBZ)Lclient!c;")
	@Override
	public Interface1 method8881(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		return new Class217_Sub3(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!mj;B)V")
	public void method8197(@OriginalArg(0) Class217 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt10465, arg0.method9228());
		if (this.aClass280Array1[this.anInt10465] != arg0.aClass280_11) {
			@Pc(21) int local21 = Static622.method8200(arg0.aClass280_11);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 5, local21);
			this.aClass280Array1[this.anInt10465] = arg0.aClass280_11;
			if (arg0.aBoolean739 != this.aBooleanArray28[this.anInt10465]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 7, arg0.aBoolean739 ? Static622.method8200(arg0.aClass280_11) : 0);
				this.aBooleanArray28[this.anInt10465] = arg0.aBoolean739;
			}
		} else if (this.aBooleanArray28[this.anInt10465] != arg0.aBoolean739) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 7, arg0.aBoolean739 ? Static622.method8200(arg0.aClass280_11) : 0);
			this.aBooleanArray28[this.anInt10465] = arg0.aBoolean739;
		}
		if (!this.aBooleanArray26[this.anInt10465]) {
			this.aBooleanArray26[this.anInt10465] = true;
			this.method8859();
			this.method8974();
		}
	}

	@OriginalMember(owner = "client!tha", name = "cb", descriptor = "(I)V")
	@Override
	protected void method8961() {
		this.anIDirect3DDevice1.a(174, this.aBoolean705);
	}

	@OriginalMember(owner = "client!tha", name = "z", descriptor = "(B)Z")
	private boolean method8198() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(17) Class5 local17 = (Class5) this.anObject19;
			this.method8871();
			local17.method231();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static622.method8194(this.anInt10453, this.anInt9633, this.anIDirect3D1, this.anInt9634, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(52) int local52 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (fma.a(local52, (byte) -35)) {
					local17.method234(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.c(0));
					this.method8948();
					this.method8901();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method9398(@OriginalArg(0) Interface25 arg0) {
	}

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "()Lclient!an;")
	@Override
	public Class19 method9364() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt9633, 0);
		return new Class19(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!tha", name = "y", descriptor = "()V")
	@Override
	protected void method9339() {
		this.aBu1.a(16705);
		super.method9339();
	}

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "(II)Lclient!es;")
	@Override
	public Interface8 method9383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(II)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass5_1.method232()) {
			this.anInt9635 = 0;
			if (fma.a(this.aClass5_1.method233(), (int) 0)) {
				this.method8198();
			}
		} else if (++this.anInt9635 <= 50) {
			this.method8198();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I[IIIZII)Lclient!pt;")
	@Override
	public Interface16 method8879(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		return new Class217_Sub2(this, arg5, arg3, arg4, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!lma;IIIILclient!kl;I)V")
	@Override
	public void method8861(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface11 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class244) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static622.method8202(arg0), 0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!kq;)V")
	public void method8199(@OriginalArg(1) Class217_Sub1 arg0) {
		this.method8197(arg0);
		if (!this.aBooleanArray29[this.anInt10465]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 1, 1);
			this.aBooleanArray29[this.anInt10465] = true;
		}
		if (!this.aBooleanArray27[this.anInt10465]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10465, 2, 1);
			this.aBooleanArray27[this.anInt10465] = true;
		}
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "(Z)V")
	@Override
	protected void method8974() {
		@Pc(16) int local16 = this.aBooleanArray26[this.anInt10465] ? Static622.method8201(this.aClass372Array6[this.anInt10465]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, 1, local16);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!ih;Lclient!ih;FLclient!ih;)Lclient!ih;")
	@Override
	public Class113 method9334(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class113 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(ZB)V")
	@Override
	public void method8933(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "(II)V")
	@Override
	public void method8972(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, 11, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!bj;)V")
	@Override
	public void method8883(@OriginalArg(1) Class37 arg0) {
		@Pc(9) int local9 = 0;
		if (Static526.aClass37_3 == arg0) {
			local9 = 65536;
		} else if (Static15.aClass37_1 == arg0) {
			local9 = 131072;
		} else if (Static281.aClass37_2 == arg0) {
			local9 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10465, 11, this.anInt10465 | local9);
	}

	@OriginalMember(owner = "client!tha", name = "y", descriptor = "(I)V")
	@Override
	protected void method8929() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt10468);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!si;Lclient!es;)Lclient!vv;")
	@Override
	public Interface25 method9359(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tha", name = "u", descriptor = "(B)V")
	@Override
	protected void method8880() {
		this.anIDirect3DDevice1.a(14, this.aBoolean691 && this.aBoolean699);
	}

	@OriginalMember(owner = "client!tha", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (fma.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), (byte) 9) && fma.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), (byte) -87)) {
			local1 = new int[arg2 * arg3];
			@Pc(58) int local58 = this.aPixelBuffer1.getRowPitch();
			if (local58 == arg2 * 4) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(80) int local80 = 0; local80 < arg3; local80++) {
					this.aPixelBuffer1.a(local1, local80 * arg2, local58 * local80, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) 111);
		local16.a((byte) -39);
		return local1;
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(Z)V")
	@Override
	protected void method8936() {
		if (this.aBoolean684) {
			Static622.aFloatArray66[15] = 1.0F;
			Static622.aFloatArray66[2] = 0.0F;
			Static622.aFloatArray66[11] = 0.0F;
			Static622.aFloatArray66[8] = 0.0F;
			Static622.aFloatArray66[10] = 1.0F;
			Static622.aFloatArray66[1] = 0.0F;
			Static622.aFloatArray66[4] = 0.0F;
			Static622.aFloatArray66[13] = 0.0F;
			Static622.aFloatArray66[14] = 0.0F;
			Static622.aFloatArray66[0] = 1.0F;
			Static622.aFloatArray66[5] = 1.0F;
			Static622.aFloatArray66[6] = 0.0F;
			Static622.aFloatArray66[3] = 0.0F;
			Static622.aFloatArray66[7] = 0.0F;
			Static622.aFloatArray66[9] = 0.0F;
			Static622.aFloatArray66[12] = 0.0F;
		} else {
			this.aClass58_Sub2_15.method6092(Static622.aFloatArray66);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static622.aFloatArray66);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "([BIZIIBILclient!sca;)Lclient!pt;")
	@Override
	protected Interface16 method8980(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(7) Class335 arg4) {
		return new Class217_Sub2(this, arg4, arg3, arg1, arg2, arg0, 0, 0);
	}
}
