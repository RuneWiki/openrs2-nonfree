import jaclib.peer.jaa;
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
import jagdx.jc;
import jagdx.kg;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bea", name = "Og", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader1;

	@OriginalMember(owner = "client!bea", name = "Gg", descriptor = "I")
	private int anInt1355 = 0;

	@OriginalMember(owner = "client!bea", name = "Tg", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!bea", name = "ah", descriptor = "I")
	private final int anInt1357;

	@OriginalMember(owner = "client!bea", name = "fh", descriptor = "Lclient!jaclib/peer/jaa;")
	public final jaa aJaa1;

	@OriginalMember(owner = "client!bea", name = "Vg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!bea", name = "Ng", descriptor = "I")
	private final int anInt1356;

	@OriginalMember(owner = "client!bea", name = "Ig", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!bea", name = "hh", descriptor = "Lclient!oj;")
	private Class244 aClass244_1;

	@OriginalMember(owner = "client!bea", name = "Qg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!bea", name = "Mg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!bea", name = "Wg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!bea", name = "bh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!bea", name = "Pg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!bea", name = "Sg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!bea", name = "Jg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!bea", name = "Ug", descriptor = "Z")
	public final boolean aBoolean130;

	@OriginalMember(owner = "client!bea", name = "eh", descriptor = "Z")
	public final boolean aBoolean131;

	@OriginalMember(owner = "client!bea", name = "gh", descriptor = "Z")
	public final boolean aBoolean132;

	@OriginalMember(owner = "client!bea", name = "Xg", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bea", name = "Lg", descriptor = "[Z")
	private final boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bea", name = "Rg", descriptor = "[Z")
	private final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bea", name = "ch", descriptor = "[Z")
	private final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!bea", name = "Kg", descriptor = "[I")
	private final int[] anIntArray37;

	@OriginalMember(owner = "client!bea", name = "Zg", descriptor = "[Lclient!nd;")
	private final Class216[] aClass216Array1;

	@OriginalMember(owner = "client!bea", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!ni;Ljava/lang/Integer;)Lclient!ha;")
	private static Class5 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class5_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) jaa local9 = new jaa();
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
			} else if ((local18.DestBlendCaps & 0x10 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & 0x2 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams >= 5) {
				@Pc(175) D3DPRESENT_PARAMETERS local175 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static36.method1278(arg3, local3, local13, local175, local5)) {
					throw new RuntimeException("");
				}
				local175.PresentationInterval = Integer.MIN_VALUE;
				local175.EnableAutoDepthStencil = true;
				local175.Windowed = true;
				@Pc(201) int local201 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local201 |= 0x10;
				}
				@Pc(225) IDirect3DDevice local225;
				try {
					local225 = local13.a(local3, local5, arg0, local201 | 0x40, local175);
				} catch (@Pc(227) jc local227) {
					local225 = local13.a(local3, local5, arg0, local201 | 0x20, local175);
				}
				@Pc(246) Class244 local246 = new Class244(local225.c(0), local225.b());
				local1 = new Class5_Sub2_Sub1(local3, local5, arg0, local9, local13, local225, local246, local175, local18, arg1, arg2, arg3);
				local1.method3968();
				return local1;
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(269) RuntimeException local269) {
			if (local1 != null) {
				local1.method6136();
			}
			throw local269;
		}
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/jaa;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!oj;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!ni;I)V")
	public Class5_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) jaa arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class244 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface7 arg9, @OriginalArg(10) Class223 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.anInt1357 = arg0;
			this.aJaa1 = arg3;
			this.anIDirect3DDevice1 = arg5;
			this.anInt1356 = arg1;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aClass244_1 = arg6;
			this.aD3DCAPS1 = arg8;
			this.anIDirect3D1 = arg4;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aJaa1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aJaa1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aJaa1);
			this.aPixelBuffer1 = new PixelBuffer(this.aJaa1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aJaa1);
			new GeometryBuffer(this.aJaa1);
			this.anInt4880 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean130 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean381 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.anInt4863 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean131 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean386 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean132 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean376 = this.anInt4882 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt1357, this.anInt1356, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray4 = new boolean[this.anInt4880];
			this.aBooleanArray2 = new boolean[this.anInt4880];
			this.aBooleanArray3 = new boolean[this.anInt4880];
			this.aBooleanArray5 = new boolean[this.anInt4880];
			this.anIntArray37 = new int[this.anInt4880];
			this.aClass216Array1 = new Class216[this.anInt4880];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(218) Throwable local218) {
			local218.printStackTrace();
			this.method6106();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIZLclient!kt;III[F)Lclient!js;")
	@Override
	protected Interface15 method3971(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class178 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4) {
		return null;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bea", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "(Z)V")
	@Override
	protected void method4010() {
		this.aFloat95 = (float) (this.anInt4878 - this.anInt4876);
		this.aFloat99 = (float) -this.anInt4869 + this.aFloat95;
		if (this.aFloat99 < (float) this.anInt4893) {
			this.aFloat99 = (float) this.anInt4893;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat99);
		this.anIDirect3DDevice1.a(37, this.aFloat95);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt4891);
	}

	@OriginalMember(owner = "client!bea", name = "L", descriptor = "(I)V")
	@Override
	protected void method4013() {
		if (this.anIDirect3DVertexShader1 != null || Static356.aClass272_5 == this.aClass272Array3[this.anInt4867]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, 24, 0);
			this.anIntArray37[this.anInt4867] = 0;
			return;
		}
		if (Static557.aClass272_6 == this.aClass272Array3[this.anInt4867]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt4867 + 16, this.aClass115_Sub3Array3[this.anInt4867].method6303(Static36.aFloatArray25));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt4867 + 16, this.aClass115_Sub3Array3[this.anInt4867].method6302(Static36.aFloatArray25));
		}
		@Pc(81) int local81 = Static36.method1269(this.aClass272Array3[this.anInt4867]);
		if (local81 != this.anIntArray37[this.anInt4867]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, 24, local81);
			this.anIntArray37[this.anInt4867] = local81;
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(BZ)Lclient!ug;")
	@Override
	public Interface27 method3993(@OriginalArg(1) boolean arg0) {
		return new Class141(this, Static302.aClass176_9, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "()V")
	@Override
	protected void method6136() {
		this.aJaa1.b((byte) -125);
		super.method6136();
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V")
	@Override
	public void method6124(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bea", name = "P", descriptor = "(I)V")
	@Override
	protected void method4024() {
		if (this.aClass220_4.method5917()) {
			this.aClass115_Sub3_18.method6302(Static36.aFloatArray25);
		} else {
			Static36.aFloatArray25[15] = 1.0F;
			Static36.aFloatArray25[1] = 0.0F;
			Static36.aFloatArray25[11] = 0.0F;
			Static36.aFloatArray25[12] = 0.0F;
			Static36.aFloatArray25[8] = 0.0F;
			Static36.aFloatArray25[13] = 0.0F;
			Static36.aFloatArray25[4] = 0.0F;
			Static36.aFloatArray25[5] = 1.0F;
			Static36.aFloatArray25[6] = 0.0F;
			Static36.aFloatArray25[14] = 0.0F;
			Static36.aFloatArray25[7] = 0.0F;
			Static36.aFloatArray25[2] = 0.0F;
			Static36.aFloatArray25[3] = 0.0F;
			Static36.aFloatArray25[0] = 1.0F;
			Static36.aFloatArray25[9] = 0.0F;
			Static36.aFloatArray25[10] = 1.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static36.aFloatArray25);
	}

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "(B)F")
	@Override
	protected float method4053() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "()V")
	@Override
	public void method6139() {
	}

	@OriginalMember(owner = "client!bea", name = "o", descriptor = "()Lclient!eca;")
	@Override
	public Class77 method6162() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt1357, 0);
		return new Class77(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!bea", name = "F", descriptor = "(I)V")
	@Override
	protected void method3992() {
		if (this.aBoolean129) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean129 = true;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;Z)V")
	public void method1268(@OriginalArg(0) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader1 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method4013();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!qp;)V")
	@Override
	public void method6103(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!bea", name = "Z", descriptor = "(I)V")
	@Override
	protected void method4049() {
		this.anIDirect3DDevice1.a(15, this.aBoolean387);
	}

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "()V")
	@Override
	public void method6188() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (kg.a(-21593, local3.Issue())) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.b(99);
	}

	@OriginalMember(owner = "client!bea", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!oq;IBI)V")
	@Override
	public void method4040(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static36.method1267(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "(II)Lclient!ci;")
	@Override
	public Interface5 method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bea", name = "t", descriptor = "()V")
	@Override
	public void method6177() {
	}

	@OriginalMember(owner = "client!bea", name = "W", descriptor = "(I)V")
	@Override
	protected void method4039() {
		this.anIDirect3DDevice1.SetViewport(this.anInt4866, this.anInt4885, this.anInt4743, this.anInt4786, 0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(ZI)Lclient!tea;")
	@Override
	public Interface26 method4063(@OriginalArg(0) boolean arg0) {
		return new Class95(this, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!kq;ZLclient!kt;)Z")
	@Override
	public boolean method3980(@OriginalArg(0) Class176 arg0, @OriginalArg(2) Class178 arg1) {
		@Pc(13) D3DDISPLAYMODE local13 = new D3DDISPLAYMODE();
		return kg.a(-21593, this.anIDirect3D1.a(this.anInt1357, local13)) && kg.a(-21593, this.anIDirect3D1.CheckDeviceFormat(this.anInt1357, this.anInt1356, local13.Format, 0, 4, Static36.method1272(arg1, arg0)));
	}

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "(I)V")
	@Override
	protected void method3958() {
		this.anIDirect3DDevice1.a(137, this.aBoolean393 && !this.aBoolean392);
	}

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method6169(@OriginalArg(0) int arg0) {
		this.aJaa1.a((byte) 126);
		super.method6169(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "K", descriptor = "(I)V")
	@Override
	protected void method4012() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt4877 + this.anInt4866, this.anInt4861 + this.anInt4885, this.anInt4865, this.anInt4892);
	}

	@OriginalMember(owner = "client!bea", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.d(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (kg.a(-21593, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0)) && kg.a(-21593, local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1))) {
			local1 = new int[arg2 * arg3];
			@Pc(56) int local56 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local56) {
				this.aPixelBuffer1.b(local1, 0, 0, arg2 * arg3);
			} else {
				for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
					this.aPixelBuffer1.b(local1, arg2 * local77, local77 * local56, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.b(71);
		local16.b(80);
		return local1;
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "()V")
	@Override
	public void method6119() {
	}

	@OriginalMember(owner = "client!bea", name = "bb", descriptor = "(I)V")
	@Override
	protected void method4060() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt4895);
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(IB)Lclient!ew;")
	@Override
	protected Class57 method4070(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class57_Sub6(this, this.aClass223_53);
		} else if (arg0 == 4) {
			return new Class57_Sub3(this, this.aClass223_53, this.aClass211_6);
		} else if (arg0 == 8) {
			return new Class57_Sub1(this, this.aClass223_53, this.aClass211_6);
		} else {
			return super.method4070(arg0);
		}
	}

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "()Z")
	@Override
	public boolean method6131() {
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "w", descriptor = "(B)V")
	@Override
	protected void method4028() {
		this.method4007();
		this.method3992();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!di;Lclient!di;FLclient!di;)Lclient!di;")
	@Override
	public Class31 method6132(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class31 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!cm;B)V")
	@Override
	public void method3967(@OriginalArg(0) Class52 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0 == Static609.aClass52_141) {
			local12 = 65536;
		} else if (Static178.aClass52_150 == arg0) {
			local12 = 131072;
		} else if (Static372.aClass52_103 == arg0) {
			local12 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, 11, local12 | this.anInt4867);
	}

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "(B)V")
	@Override
	protected void method3986() {
		if (this.aBoolean373) {
			Static36.aFloatArray25[5] = 1.0F;
			Static36.aFloatArray25[9] = 0.0F;
			Static36.aFloatArray25[7] = 0.0F;
			Static36.aFloatArray25[3] = 0.0F;
			Static36.aFloatArray25[11] = 0.0F;
			Static36.aFloatArray25[10] = 1.0F;
			Static36.aFloatArray25[4] = 0.0F;
			Static36.aFloatArray25[13] = 0.0F;
			Static36.aFloatArray25[2] = 0.0F;
			Static36.aFloatArray25[6] = 0.0F;
			Static36.aFloatArray25[12] = 0.0F;
			Static36.aFloatArray25[0] = 1.0F;
			Static36.aFloatArray25[14] = 0.0F;
			Static36.aFloatArray25[1] = 0.0F;
			Static36.aFloatArray25[15] = 1.0F;
			Static36.aFloatArray25[8] = 0.0F;
		} else {
			this.aClass115_Sub3_15.method6302(Static36.aFloatArray25);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static36.aFloatArray25);
	}

	@OriginalMember(owner = "client!bea", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4000(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!oq;IIILclient!ug;II)V")
	@Override
	public void method3976(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface27 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class141) arg3).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static36.method1267(arg0), 0, arg4, arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method3939(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!jagdx/IDirect3DPixelShader;)V")
	public void method1273(@OriginalArg(1) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILclient!kt;BLclient!kq;)Lclient!js;")
	@Override
	public Interface15 method4009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(4) Class176 arg3) {
		return new Class38_Sub3(this, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Lclient!ku;")
	@Override
	public Interface16 method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bea", name = "eb", descriptor = "(I)Z")
	private boolean method1274() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(21) Class244 local21 = (Class244) this.anObject9;
			this.method3984();
			local21.method6343();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static36.method1278(this.anInt4882, this.anInt1357, this.anIDirect3D1, this.aD3DPRESENT_PARAMETERS1, this.anInt1356)) {
				@Pc(54) int local54 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (kg.a(-21593, local54)) {
					local21.method6341(this.anIDirect3DDevice1.b(), this.anIDirect3DDevice1.c(0));
					this.method4067();
					this.method3944();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLclient!oha;)V")
	public void method1275(@OriginalArg(1) Class38_Sub2 arg0) {
		this.method1276(arg0);
		if (!this.aBooleanArray2[this.anInt4867]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 1, 1);
			this.aBooleanArray2[this.anInt4867] = true;
		}
		if (!this.aBooleanArray4[this.anInt4867]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 2, 1);
			this.aBooleanArray4[this.anInt4867] = true;
		}
	}

	@OriginalMember(owner = "client!bea", name = "u", descriptor = "()V")
	@Override
	public void method6180() {
	}

	@OriginalMember(owner = "client!bea", name = "q", descriptor = "()Z")
	@Override
	public boolean method6165() {
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method1276(@OriginalArg(0) Class38 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt4867, arg0.method8444());
		if (arg0.aClass216_10 != this.aClass216Array1[this.anInt4867]) {
			@Pc(21) int local21 = Static36.method1271(arg0.aClass216_10);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 6, local21);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 5, local21);
			this.aClass216Array1[this.anInt4867] = arg0.aClass216_10;
			if (this.aBooleanArray5[this.anInt4867] != arg0.aBoolean821) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 7, arg0.aBoolean821 ? Static36.method1271(arg0.aClass216_10) : 0);
				this.aBooleanArray5[this.anInt4867] = arg0.aBoolean821;
			}
		} else if (arg0.aBoolean821 != this.aBooleanArray5[this.anInt4867]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 7, arg0.aBoolean821 ? Static36.method1271(arg0.aClass216_10) : 0);
			this.aBooleanArray5[this.anInt4867] = arg0.aBoolean821;
		}
		if (!this.aBooleanArray3[this.anInt4867]) {
			this.aBooleanArray3[this.anInt4867] = true;
			this.method3961();
			this.method4014();
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(BI)V")
	@Override
	public void method3997(@OriginalArg(1) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, 11, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "C", descriptor = "(B)V")
	@Override
	public void method4068() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray49[0], -this.aFloatArray49[1], -this.aFloatArray49[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray46[0], -this.aFloatArray46[1], -this.aFloatArray46[2]);
		this.aBoolean129 = false;
	}

	@OriginalMember(owner = "client!bea", name = "G", descriptor = "(I)V")
	@Override
	protected void method3994() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat98 * this.aFloat93, this.aFloat89 * this.aFloat93, this.aFloat93 * this.bf, 0.0F);
		this.aBoolean129 = false;
	}

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "(B)V")
	@Override
	protected void method4033() {
		this.anIDirect3DDevice1.a(174, this.aBoolean394);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!kt;Lclient!kq;)Z")
	@Override
	public boolean method3945(@OriginalArg(1) Class178 arg0, @OriginalArg(2) Class176 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return kg.a(-21593, this.anIDirect3D1.a(this.anInt1357, local3)) && kg.a(-21593, this.anIDirect3D1.CheckDeviceFormat(this.anInt1357, this.anInt1356, local3.Format, 0, 3, Static36.method1272(arg0, arg1)));
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([Lclient!dia;I)Lclient!qa;")
	@Override
	public Class270 method3985(@OriginalArg(0) Class63[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB[IZIII)Lclient!js;")
	@Override
	public Interface15 method4066(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class38_Sub3(this, arg3, arg4, arg2, arg1, 0, arg5);
	}

	@OriginalMember(owner = "client!bea", name = "z", descriptor = "(I)V")
	@Override
	protected void method3975() {
		this.anIDirect3DDevice1.a(14, this.aBoolean388 && this.aBoolean389);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)V")
	@Override
	public void method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass244_1.method6342()) {
			this.anInt1355 = 0;
			if (kg.b(-7175, this.aClass244_1.method6340())) {
				this.method1274();
			}
		} else if (++this.anInt1355 <= 50) {
			this.method1274();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([BZLclient!kt;IIZII)Lclient!js;")
	@Override
	protected Interface15 method4035(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4) {
		return new Class38_Sub3(this, arg1, arg4, arg2, arg3, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method3947(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		this.aClass244_1 = (Class244) arg0;
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(B)V")
	@Override
	protected void method3953() {
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLclient!vs;)V")
	public void method1277(@OriginalArg(1) Class38_Sub3 arg0) {
		this.method1276(arg0);
		if (arg0.aBoolean822 != this.aBooleanArray2[this.anInt4867]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 1, arg0.aBoolean822 ? 1 : 3);
			this.aBooleanArray2[this.anInt4867] = arg0.aBoolean822;
		}
		if (arg0.aBoolean823 != this.aBooleanArray4[this.anInt4867]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt4867, 2, arg0.aBoolean823 ? 1 : 3);
			this.aBooleanArray4[this.anInt4867] = arg0.aBoolean823;
		}
	}

	@OriginalMember(owner = "client!bea", name = "o", descriptor = "(B)V")
	@Override
	protected void method4002() {
		this.anIDirect3DDevice1.a(28, this.aBoolean383 && this.aBoolean378 && this.anInt4869 >= 0);
	}

	@OriginalMember(owner = "client!bea", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ[[II)Lclient!td;")
	@Override
	public Interface24 method3937(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class38_Sub1(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZLclient!tea;)V")
	@Override
	public void method3974(@OriginalArg(0) int arg0, @OriginalArg(2) Interface26 arg1) {
		@Pc(2) Class95 local2 = (Class95) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local2.anIDirect3DVertexBuffer1, 0, local2.method2996());
	}

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "(B)V")
	@Override
	protected void method3961() {
		@Pc(15) int local15 = this.aBooleanArray3[this.anInt4867] ? Static36.method1270(this.aClass144Array6[this.anInt4867]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, 4, local15);
	}

	@OriginalMember(owner = "client!bea", name = "t", descriptor = "(I)V")
	@Override
	protected void method3962() {
		if (this.aBooleanArray3[this.anInt4867]) {
			this.aBooleanArray3[this.anInt4867] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt4867, (IDirect3DBaseTexture) null);
			this.method3961();
			this.method4014();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method4061(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "(B)V")
	@Override
	protected void method3969() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray45);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!ci;Lclient!ku;)Lclient!qp;")
	@Override
	public Interface20 method6178(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Interface16 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method4045(@OriginalArg(0) Class270 arg0) {
		@Pc(10) dxVertexLayout local10 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local10.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method3991(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		if (this.aCanvas9 != arg0) {
			return;
		}
		@Pc(12) Dimension local12 = arg0.getSize();
		if (local12.width > 0 && local12.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method1274();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!bea", name = "V", descriptor = "(I)V")
	@Override
	protected void method4038() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4884; local1++) {
			@Pc(10) Class6_Sub10 local10 = this.aClass6_Sub10Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method5319();
			@Pc(24) float local24 = local10.method5314() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local10.method5312(), (float) local10.method5321(), (float) local10.method5320());
			this.aD3DLIGHT1.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method5316() * local10.method5316()));
			this.aD3DLIGHT1.SetRange((float) local10.method5316());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (this.anInt4887 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method4038();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZBLclient!ef;Z)V")
	@Override
	public void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class80 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(18) byte local18;
		if (arg0 == 1) {
			local18 = 3;
		} else if (arg0 == 2) {
			local18 = 26;
		} else {
			local18 = 2;
		}
		@Pc(26) int local26 = 0;
		if (arg1) {
			local26 = 32;
		}
		if (arg3) {
			local26 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, local18, local26 | Static36.method1266(arg2));
	}

	@OriginalMember(owner = "client!bea", name = "r", descriptor = "(B)V")
	@Override
	protected void method4007() {
		@Pc(11) float local11 = this.aBoolean375 ? this.aFloat101 : 0.0F;
		@Pc(20) float local20 = this.aBoolean375 ? -this.aFloat96 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(local11 * this.aFloat98, this.aFloat89 * local11, local11 * this.bf, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat98 * local20, this.aFloat89 * local20, this.bf * local20, 0.0F);
		this.aBoolean129 = false;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!kt;[BIII)Lclient!ff;")
	@Override
	public Interface11 method4047(@OriginalArg(1) Class178 arg0, @OriginalArg(2) byte[] arg1) {
		return new Class38_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!bea", name = "T", descriptor = "(I)V")
	@Override
	protected void method4036() {
		this.anIDirect3DDevice1.a(27, this.aBoolean377);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4062(@OriginalArg(0) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "(I)V")
	@Override
	protected void method3944() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4880; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass216Array1[local1] = Static121.aClass216_4;
			this.aBooleanArray2[local1] = this.aBooleanArray4[local1] = true;
			this.aBooleanArray5[local1] = false;
			this.anIntArray37[local1] = 0;
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
		this.aBoolean129 = false;
		super.method3944();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZBLclient!ef;)V")
	@Override
	protected void method4050(@OriginalArg(0) int arg0, @OriginalArg(3) Class80 arg1) {
		@Pc(21) byte local21;
		if (arg0 == 1) {
			local21 = 6;
		} else if (arg0 == 2) {
			local21 = 27;
		} else {
			local21 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, local21, Static36.method1266(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!bea", name = "M", descriptor = "(I)V")
	@Override
	protected void method4014() {
		@Pc(15) int local15 = this.aBooleanArray3[this.anInt4867] ? Static36.method1270(this.aClass144Array5[this.anInt4867]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt4867, 1, local15);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6154(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "(B)V")
	@Override
	protected void method4019() {
		if (this.aClass142_6 == Static181.aClass142_5) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass142_6 == Static460.aClass142_8) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (Static154.aClass142_4 == this.aClass142_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "(I)V")
	@Override
	protected void method3977() {
		this.anIDirect3DDevice1.a(7, this.aBoolean385);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6168(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6127(arg2, arg3);
	}
}
