import jaclib.peer.dj;
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
import jagdx.ica;
import jagdx.uw;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class14_Sub2_Sub2 extends Class14_Sub2 {

	@OriginalMember(owner = "client!tga", name = "Dg", descriptor = "I")
	private int anInt8620 = 0;

	@OriginalMember(owner = "client!tga", name = "Cg", descriptor = "Z")
	private boolean aBoolean624 = false;

	@OriginalMember(owner = "client!tga", name = "Yg", descriptor = "I")
	private final int anInt8622;

	@OriginalMember(owner = "client!tga", name = "Ug", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!tga", name = "Pg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!tga", name = "Xg", descriptor = "Lclient!jaclib/peer/dj;")
	public final dj aDj1;

	@OriginalMember(owner = "client!tga", name = "Mg", descriptor = "Lclient!mb;")
	private Class203 aClass203_1;

	@OriginalMember(owner = "client!tga", name = "Lg", descriptor = "I")
	private final int anInt8621;

	@OriginalMember(owner = "client!tga", name = "Rg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!tga", name = "Kg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!tga", name = "Ig", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!tga", name = "Sg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!tga", name = "Jg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!tga", name = "Og", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!tga", name = "Eg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!tga", name = "Tg", descriptor = "Z")
	public final boolean aBoolean626;

	@OriginalMember(owner = "client!tga", name = "Qg", descriptor = "Z")
	public final boolean aBoolean625;

	@OriginalMember(owner = "client!tga", name = "Vg", descriptor = "Z")
	public final boolean aBoolean627;

	@OriginalMember(owner = "client!tga", name = "Hg", descriptor = "[Z")
	private final boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!tga", name = "Ng", descriptor = "[I")
	private final int[] anIntArray640;

	@OriginalMember(owner = "client!tga", name = "zg", descriptor = "[Z")
	private final boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!tga", name = "Zg", descriptor = "[Z")
	private final boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!tga", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!tga", name = "Wg", descriptor = "[Lclient!ju;")
	private final Class164[] aClass164Array1;

	@OriginalMember(owner = "client!tga", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!e;Lclient!pfa;Ljava/lang/Integer;)Lclient!oa;")
	private static Class14 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class14_Sub2_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) dj local9 = new dj();
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
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & 0x2 & local18.DestBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(174) D3DPRESENT_PARAMETERS local174 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static506.method7041(arg3, local3, local5, local13, local174)) {
					throw new RuntimeException("");
				}
				local174.PresentationInterval = Integer.MIN_VALUE;
				local174.Windowed = true;
				local174.EnableAutoDepthStencil = true;
				@Pc(200) int local200 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local200 |= 0x10;
				}
				@Pc(224) IDirect3DDevice local224;
				try {
					local224 = local13.a(local3, local5, arg0, local200 | 0x40, local174);
				} catch (@Pc(226) uw local226) {
					local224 = local13.a(local3, local5, arg0, local200 | 0x20, local174);
				}
				@Pc(245) Class203 local245 = new Class203(local224.c(0), local224.c());
				local1 = new Class14_Sub2_Sub2(local3, local5, arg0, local9, local13, local224, local245, local174, local18, arg1, arg2, arg3);
				local1.method6959();
				return local1;
			}
		} catch (@Pc(268) RuntimeException local268) {
			if (local1 != null) {
				local1.method6839();
			}
			throw local268;
		}
	}

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/dj;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!mb;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!e;Lclient!pfa;I)V")
	public Class14_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) dj arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class203 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class251 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt8622 = arg1;
		this.anIDirect3DDevice1 = arg5;
		this.anIDirect3D1 = arg4;
		this.aDj1 = arg3;
		this.aClass203_1 = arg6;
		this.anInt8621 = arg0;
		this.aD3DCAPS1 = arg8;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.aD3DLIGHT1 = new D3DLIGHT(this.aDj1);
		this.aD3DLIGHT3 = new D3DLIGHT(this.aDj1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.aDj1);
		this.aPixelBuffer1 = new PixelBuffer(this.aDj1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.aDj1);
		new GeometryBuffer(this.aDj1);
		this.anInt8616 = this.aD3DCAPS1.MaxActiveLights <= 0 ? 8 : this.aD3DCAPS1.MaxActiveLights;
		this.aBoolean609 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean626 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.aBoolean610 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.anInt8600 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean625 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.aBoolean627 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean612 = this.anInt8599 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt8621, this.anInt8622, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray35 = new boolean[this.anInt8600];
		this.anIntArray640 = new int[this.anInt8600];
		this.aBooleanArray33 = new boolean[this.anInt8600];
		this.aBooleanArray36 = new boolean[this.anInt8600];
		this.aBooleanArray34 = new boolean[this.anInt8600];
		this.aClass164Array1 = new Class164[this.anInt8600];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method6848();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(241) Exception_Sub1 local241) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tga", name = "A", descriptor = "()V")
	@Override
	public void method6890() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.b();
		if (ica.b(14528, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(123);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!nh;ILclient!jr;I)Lclient!em;")
	@Override
	public Interface6 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(3) Class161 arg2, @OriginalArg(4) int arg3) {
		return new Class30_Sub2(this, arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZIIILclient!nh;[BI)Lclient!em;")
	@Override
	protected Interface6 method7036(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class219 arg3, @OriginalArg(6) byte[] arg4) {
		return new Class30_Sub2(this, arg3, arg2, arg1, arg0, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!tga", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!tga", name = "t", descriptor = "()Lclient!taa;")
	@Override
	public Class312 method6871() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt8621, 0);
		return new Class312(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!tga", name = "o", descriptor = "()V")
	@Override
	public void method6848() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass203_1.method4801()) {
			this.anInt8620 = 0;
			if (ica.a(-2147467259, this.aClass203_1.method4800())) {
				this.method7042();
			}
		} else if (++this.anInt8620 <= 50) {
			this.method7042();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!nba;Z)V")
	@Override
	public void method6946(@OriginalArg(0) Class215 arg0) {
		@Pc(1) int local1 = 0;
		if (Static62.aClass215_2 == arg0) {
			local1 = 65536;
		} else if (arg0 == Static32.aClass215_1) {
			local1 = 131072;
		} else if (arg0 == Static338.aClass215_3) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, 11, local1 | this.anInt8594);
	}

	@OriginalMember(owner = "client!tga", name = "o", descriptor = "(I)V")
	@Override
	protected void method6927() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt8607; local1++) {
			@Pc(10) Class6_Sub7 local10 = this.aClass6_Sub7Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(20) int local20 = local10.method4288();
			@Pc(26) float local26 = local10.method4284() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method4292(), (float) local10.method4291(), (float) local10.method4286());
			this.aD3DLIGHT2.SetDiffuse((float) (local20 >> 16 & 0xFF) * local26, (float) (local20 >> 8 & 0xFF) * local26, (float) (local20 & 0xFF) * local26, 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method4283() * local10.method4283()));
			this.aD3DLIGHT2.SetRange((float) local10.method4283());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt8598) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method6927();
	}

	@OriginalMember(owner = "client!tga", name = "o", descriptor = "(B)V")
	@Override
	protected void method6990() {
		this.anIDirect3DDevice1.SetViewport(this.anInt8610, this.anInt8593, this.anInt8422, this.anInt8558, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!tga", name = "B", descriptor = "()V")
	@Override
	public void method6892() {
		this.method6906(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!tga", name = "G", descriptor = "(I)V")
	@Override
	protected void method6974() {
		this.anIDirect3DDevice1.a(28, this.aBoolean617 && this.aBoolean604 && this.aBoolean621 | this.anInt8592 >= 0);
	}

	@OriginalMember(owner = "client!tga", name = "ab", descriptor = "(I)Z")
	private boolean method7042() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(18) Class203 local18 = (Class203) this.anObject14;
			this.method6923();
			local18.method4798();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static506.method7041(this.anInt8599, this.anInt8621, this.anInt8622, this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(52) int local52 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (ica.b(14528, local52)) {
					local18.method4799(this.anIDirect3DDevice1.c(0), this.anIDirect3DDevice1.c());
					this.method6941();
					this.method6917();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "()V")
	@Override
	public void method6843() {
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6976(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tga", name = "w", descriptor = "()V")
	@Override
	public void method6881() {
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!sv;II)V")
	@Override
	public void method6991(@OriginalArg(1) Class311 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static506.method7049(arg0), arg2, arg1);
	}

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6963() {
		if (Static304.aClass280_7 == this.aClass280Array3[this.anInt8594]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, 24, 0);
			this.anIntArray640[this.anInt8594] = 0;
			return;
		}
		if (Static483.aClass280_8 == this.aClass280Array3[this.anInt8594]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt8594 + 16, this.aClass54_Sub3Array3[this.anInt8594].method5455(Static506.aFloatArray68));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt8594 + 16, this.aClass54_Sub3Array3[this.anInt8594].method5464(Static506.aFloatArray68));
		}
		@Pc(59) int local59 = Static506.method7043(this.aClass280Array3[this.anInt8594]);
		if (local59 != this.anIntArray640[this.anInt8594]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, 24, local59);
			this.anIntArray640[this.anInt8594] = local59;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ff;B)V")
	public void method7044(@OriginalArg(0) Class30_Sub2 arg0) {
		this.method7047(arg0);
		if (this.aBooleanArray33[this.anInt8594] != arg0.aBoolean216) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 1, arg0.aBoolean216 ? 1 : 3);
			this.aBooleanArray33[this.anInt8594] = arg0.aBoolean216;
		}
		if (this.aBooleanArray36[this.anInt8594] != arg0.aBoolean217) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 2, arg0.aBoolean217 ? 1 : 3);
			this.aBooleanArray36[this.anInt8594] = arg0.aBoolean217;
		}
	}

	@OriginalMember(owner = "client!tga", name = "s", descriptor = "(B)V")
	@Override
	public void method7006() {
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray62[0], -this.aFloatArray62[1], -this.aFloatArray62[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray65[0], -this.aFloatArray65[1], -this.aFloatArray65[2]);
		this.aBoolean624 = false;
	}

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6948() {
		this.anIDirect3DDevice1.a(14, this.aBoolean622 && this.aBoolean618);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!te;B)V")
	public void method7046(@OriginalArg(0) Class30_Sub3 arg0) {
		this.method7047(arg0);
		if (!this.aBooleanArray33[this.anInt8594]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 1, 1);
			this.aBooleanArray33[this.anInt8594] = true;
		}
		if (!this.aBooleanArray36[this.anInt8594]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 2, 1);
			this.aBooleanArray36[this.anInt8594] = true;
		}
	}

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "()V")
	@Override
	public void method6858() {
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!vt;Z)V")
	public void method7047(@OriginalArg(0) Class30 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt8594, arg0.method6779());
		if (this.aClass164Array1[this.anInt8594] != arg0.aClass164_13) {
			@Pc(21) int local21 = Static506.method7051(arg0.aClass164_13);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 5, local21);
			this.aClass164Array1[this.anInt8594] = arg0.aClass164_13;
			if (arg0.aBoolean598 != this.aBooleanArray34[this.anInt8594]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 7, arg0.aBoolean598 ? Static506.method7051(arg0.aClass164_13) : 0);
				this.aBooleanArray34[this.anInt8594] = arg0.aBoolean598;
			}
		} else if (this.aBooleanArray34[this.anInt8594] != arg0.aBoolean598) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt8594, 7, arg0.aBoolean598 ? Static506.method7051(arg0.aClass164_13) : 0);
			this.aBooleanArray34[this.anInt8594] = arg0.aBoolean598;
		}
		if (!this.aBooleanArray35[this.anInt8594]) {
			this.aBooleanArray35[this.anInt8594] = true;
			this.method6943();
			this.method6979();
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(III[IZII)Lclient!em;")
	@Override
	public Interface6 method6962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class30_Sub2(this, arg1, arg0, arg3, arg2, 0, arg4);
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(BZ)Lclient!vl;")
	@Override
	public Interface23 method7005(@OriginalArg(1) boolean arg0) {
		return new Class70(this, Static239.aClass161_13, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZ)Lclient!ii;")
	@Override
	public Interface13 method7004(@OriginalArg(1) boolean arg0) {
		return new Class2(this, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "(I)V")
	@Override
	protected void method6911() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray66);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!bf;)V")
	@Override
	public void method6944(@OriginalArg(1) Class28 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6848();
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method6995(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!tga", name = "m", descriptor = "(I)V")
	@Override
	protected void method6920() {
		this.method7037();
		this.method6953();
	}

	@OriginalMember(owner = "client!tga", name = "g", descriptor = "(B)V")
	@Override
	protected void method6943() {
		@Pc(22) int local22 = this.aBooleanArray35[this.anInt8594] ? Static506.method7045(this.aClass228Array5[this.anInt8594]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, 4, local22);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[BBILclient!nh;)Lclient!ht;")
	@Override
	public Interface11 method6908(@OriginalArg(2) byte[] arg0, @OriginalArg(5) Class219 arg1) {
		return new Class30_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "([Lclient!oc;B)Lclient!bf;")
	@Override
	public Class28 method7000(@OriginalArg(0) Class231[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ip;Lclient!ip;FLclient!ip;)Lclient!ip;")
	@Override
	public Class26 method6870(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class26 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[[IZ)Lclient!qca;")
	@Override
	public Interface19 method6932(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class30_Sub1(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!tga", name = "j", descriptor = "(B)V")
	@Override
	protected void method6964() {
		this.anIDirect3DDevice1.a(15, this.aBoolean605);
	}

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6897(@OriginalArg(0) int arg0) {
		this.aDj1.c((byte) 43);
		super.method6897(arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6922(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass203_1 = (Class203) arg0;
	}

	@OriginalMember(owner = "client!tga", name = "C", descriptor = "(I)V")
	@Override
	protected void method6971() {
		this.anIDirect3DDevice1.a(137, this.aBoolean620 && !this.aBoolean607);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!jr;Lclient!nh;)Z")
	@Override
	public boolean method6924(@OriginalArg(1) Class161 arg0, @OriginalArg(2) Class219 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return ica.b(14528, this.anIDirect3D1.a(this.anInt8621, local9)) && ica.b(14528, this.anIDirect3D1.CheckDeviceFormat(this.anInt8621, this.anInt8622, local9.Format, 0, 3, Static506.method7048(arg0, arg1)));
	}

	@OriginalMember(owner = "client!tga", name = "y", descriptor = "(I)V")
	@Override
	protected void method6953() {
		if (this.aBoolean624) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean624 = true;
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V")
	@Override
	protected void method6910() {
		if (this.aBoolean621) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt8601);
			return;
		}
		this.aFloat179 = this.anInt8618 - this.anInt8590;
		this.aFloat185 = (float) -this.anInt8592 + this.aFloat179;
		if ((float) this.anInt8584 > this.aFloat185) {
			this.aFloat185 = this.anInt8584;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat185);
		this.anIDirect3DDevice1.a(37, this.aFloat179);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt8585);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!nh;Lclient!jr;)Z")
	@Override
	public boolean method6989(@OriginalArg(1) Class219 arg0, @OriginalArg(2) Class161 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return ica.b(14528, this.anIDirect3D1.a(this.anInt8621, local3)) && ica.b(14528, this.anIDirect3D1.CheckDeviceFormat(this.anInt8621, this.anInt8622, local3.Format, 0, 4, Static506.method7048(arg1, arg0)));
	}

	@OriginalMember(owner = "client!tga", name = "m", descriptor = "()Z")
	@Override
	public boolean method6846() {
		return false;
	}

	@OriginalMember(owner = "client!tga", name = "A", descriptor = "(B)V")
	@Override
	protected void method7037() {
		@Pc(15) float local15 = this.aBoolean606 ? this.aFloat167 : 0.0F;
		@Pc(24) float local24 = this.aBoolean606 ? -this.aFloat178 : 0.0F;
		this.aD3DLIGHT1.SetDiffuse(this.aFloat182 * local15, local15 * this.aFloat172, this.aFloat170 * local15, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat182 * local24, local24 * this.aFloat172, this.aFloat170 * local24, 0.0F);
		this.aBoolean624 = false;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IILclient!ii;)V")
	@Override
	public void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) Interface13 arg1) {
		@Pc(10) Class2 local10 = (Class2) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local10.anIDirect3DVertexBuffer1, 0, local10.method56());
	}

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "(I)V")
	@Override
	protected void method6926() {
		this.aD3DLIGHT1.SetAmbient(this.aFloat176 * this.aFloat182, this.aFloat172 * this.aFloat176, this.aFloat176 * this.aFloat170, 0.0F);
		this.aBoolean624 = false;
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6983(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "i", descriptor = "(I)F")
	@Override
	protected float method6914() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "(I)V")
	@Override
	protected void method6917() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8600; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass164Array1[local1] = Static411.aClass164_15;
			this.aBooleanArray33[local1] = this.aBooleanArray36[local1] = true;
			this.aBooleanArray34[local1] = false;
			this.anIntArray640[local1] = 0;
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
		this.aD3DLIGHT3.SetType(3);
		this.aD3DLIGHT2.SetType(1);
		this.aBoolean624 = false;
		super.method6917();
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6821(@OriginalArg(0) Class58 arg0) {
	}

	@OriginalMember(owner = "client!tga", name = "z", descriptor = "(I)V")
	@Override
	protected void method6958() {
		if (this.aClass340_9.method7416()) {
			this.aClass54_Sub3_18.method5455(Static506.aFloatArray68);
		} else {
			Static506.aFloatArray68[14] = 0.0F;
			Static506.aFloatArray68[13] = 0.0F;
			Static506.aFloatArray68[4] = 0.0F;
			Static506.aFloatArray68[10] = 1.0F;
			Static506.aFloatArray68[9] = 0.0F;
			Static506.aFloatArray68[7] = 0.0F;
			Static506.aFloatArray68[6] = 0.0F;
			Static506.aFloatArray68[12] = 0.0F;
			Static506.aFloatArray68[0] = 1.0F;
			Static506.aFloatArray68[2] = 0.0F;
			Static506.aFloatArray68[11] = 0.0F;
			Static506.aFloatArray68[5] = 1.0F;
			Static506.aFloatArray68[8] = 0.0F;
			Static506.aFloatArray68[3] = 0.0F;
			Static506.aFloatArray68[1] = 0.0F;
			Static506.aFloatArray68[15] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static506.aFloatArray68);
	}

	@OriginalMember(owner = "client!tga", name = "A", descriptor = "(I)V")
	@Override
	protected void method6961() {
		if (this.aBoolean603) {
			Static506.aFloatArray68[15] = 1.0F;
			Static506.aFloatArray68[1] = 0.0F;
			Static506.aFloatArray68[14] = 0.0F;
			Static506.aFloatArray68[6] = 0.0F;
			Static506.aFloatArray68[4] = 0.0F;
			Static506.aFloatArray68[3] = 0.0F;
			Static506.aFloatArray68[5] = 1.0F;
			Static506.aFloatArray68[11] = 0.0F;
			Static506.aFloatArray68[10] = 1.0F;
			Static506.aFloatArray68[9] = 0.0F;
			Static506.aFloatArray68[2] = 0.0F;
			Static506.aFloatArray68[13] = 0.0F;
			Static506.aFloatArray68[7] = 0.0F;
			Static506.aFloatArray68[0] = 1.0F;
			Static506.aFloatArray68[12] = 0.0F;
			Static506.aFloatArray68[8] = 0.0F;
		} else {
			this.aClass54_Sub3_15.method5455(Static506.aFloatArray68);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static506.aFloatArray68);
	}

	@OriginalMember(owner = "client!tga", name = "O", descriptor = "(I)V")
	@Override
	protected void method7009() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt8614 + this.anInt8610, this.anInt8593 + this.anInt8596, this.anInt8611, this.anInt8615);
	}

	@OriginalMember(owner = "client!tga", name = "H", descriptor = "(I)V")
	@Override
	protected void method6979() {
		@Pc(18) int local18 = this.aBooleanArray35[this.anInt8594] ? Static506.method7045(this.aClass228Array6[this.anInt8594]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, 1, local18);
	}

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "()V")
	@Override
	public void method6834() {
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBIIILclient!sv;Lclient!vl;)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class311 arg4, @OriginalArg(6) Interface23 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class70) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static506.method7049(arg4), 0, arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(II)V")
	@Override
	public void method6909(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, 11, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "s", descriptor = "(I)V")
	@Override
	protected void method6938() {
		if (this.aClass68_5 == Static593.aClass68_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass68_5 == Static292.aClass68_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass68_5 == Static519.aClass68_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "(I)V")
	@Override
	protected void method6937() {
		this.anIDirect3DDevice1.a(27, this.aBoolean608);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tga", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return 0;
	}

	@OriginalMember(owner = "client!tga", name = "p", descriptor = "(I)V")
	@Override
	protected void method6931() {
		this.anIDirect3DDevice1.a(174, this.aBoolean623);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IILclient!hs;Z)V")
	@Override
	protected void method6965(@OriginalArg(1) int arg0, @OriginalArg(2) Class138 arg1) {
		@Pc(14) byte local14;
		if (arg0 == 1) {
			local14 = 6;
		} else if (arg0 == 2) {
			local14 = 27;
		} else {
			local14 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, local14, Static506.method7050(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "(B)V")
	@Override
	protected void method6915() {
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIZLclient!nh;I[FII)Lclient!em;")
	@Override
	protected Interface6 method6975(@OriginalArg(2) boolean arg0, @OriginalArg(3) Class219 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!tga", name = "R", descriptor = "(I)V")
	@Override
	protected void method7014() {
		this.anIDirect3DDevice1.a(7, this.aBoolean616);
	}

	@OriginalMember(owner = "client!tga", name = "g", descriptor = "(II)Lclient!ho;")
	@Override
	protected Class22 method7007(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class22_Sub6(this, this.aClass251_118);
		} else if (arg0 == 4) {
			return new Class22_Sub7(this, this.aClass251_118, this.aClass315_5);
		} else {
			return super.method7007(arg0);
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6997(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (arg0 != this.aCanvas14) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method7042();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(Z)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tga", name = "v", descriptor = "(I)V")
	@Override
	protected void method6949() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt8613);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLclient!hs;ZII)V")
	@Override
	public void method6996(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(13) byte local13;
		if (arg3 == 1) {
			local13 = 3;
		} else if (arg3 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		@Pc(21) int local21 = 0;
		if (arg0) {
			local21 = 32;
		}
		if (arg2) {
			local21 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt8594, local13, local21 | Static506.method7050(arg1));
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "()V")
	@Override
	protected void method6839() {
		this.aDj1.b((byte) 111);
		super.method6839();
	}

	@OriginalMember(owner = "client!tga", name = "z", descriptor = "()Z")
	@Override
	public boolean method6887() {
		return false;
	}

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "(B)V")
	@Override
	protected void method6955() {
		if (this.aBooleanArray35[this.anInt8594]) {
			this.aBooleanArray35[this.anInt8594] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt8594, null);
			this.method6943();
			this.method6979();
		}
	}

	@OriginalMember(owner = "client!tga", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.b(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (ica.b(14528, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1)) && ica.b(14528, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local55) {
				this.aPixelBuffer1.a((int[]) local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(66) int local66 = 0; local66 < arg3; local66++) {
					this.aPixelBuffer1.a(local1, local66 * arg2, local66 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(65);
		local16.a(75);
		return local1;
	}
}
