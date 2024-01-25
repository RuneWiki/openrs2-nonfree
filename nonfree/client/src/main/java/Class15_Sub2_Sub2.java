import jaclib.peer.aaa;
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
import jagdx.pea;
import jagdx.sw;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class15_Sub2_Sub2 extends Class15_Sub2 {

	@OriginalMember(owner = "client!mba", name = "Hg", descriptor = "Z")
	private boolean aBoolean564 = false;

	@OriginalMember(owner = "client!mba", name = "Rg", descriptor = "I")
	private int anInt6561 = 0;

	@OriginalMember(owner = "client!mba", name = "Jg", descriptor = "I")
	private final int anInt6559;

	@OriginalMember(owner = "client!mba", name = "Dg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!mba", name = "Cg", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!mba", name = "Lg", descriptor = "I")
	private final int anInt6560;

	@OriginalMember(owner = "client!mba", name = "Fg", descriptor = "Lclient!fn;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!mba", name = "yg", descriptor = "Lclient!jaclib/peer/aaa;")
	public final aaa anAaa1;

	@OriginalMember(owner = "client!mba", name = "Eg", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!mba", name = "Sg", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!mba", name = "Ig", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!mba", name = "wg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!mba", name = "Bg", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!mba", name = "Tg", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!mba", name = "Kg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!mba", name = "Qg", descriptor = "Z")
	public final boolean aBoolean567;

	@OriginalMember(owner = "client!mba", name = "Mg", descriptor = "Z")
	public final boolean aBoolean565;

	@OriginalMember(owner = "client!mba", name = "Ng", descriptor = "Z")
	public final boolean aBoolean566;

	@OriginalMember(owner = "client!mba", name = "Ag", descriptor = "[Z")
	private final boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!mba", name = "xg", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!mba", name = "ug", descriptor = "[Lclient!gv;")
	private final Class130[] aClass130Array1;

	@OriginalMember(owner = "client!mba", name = "Pg", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!mba", name = "vg", descriptor = "[I")
	private final int[] anIntArray433;

	@OriginalMember(owner = "client!mba", name = "Gg", descriptor = "[Z")
	private final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!mba", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!e;Lclient!pe;Ljava/lang/Integer;)Lclient!oa;")
	private static Class15 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class15_Sub2_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) aaa local9 = new aaa();
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
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(186) D3DPRESENT_PARAMETERS local186 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static315.method5496(arg3, local13, local3, local186, local5)) {
					throw new RuntimeException("");
				}
				local186.PresentationInterval = Integer.MIN_VALUE;
				local186.EnableAutoDepthStencil = true;
				local186.Windowed = true;
				@Pc(212) int local212 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local212 |= 0x10;
				}
				@Pc(235) IDirect3DDevice local235;
				try {
					local235 = local13.a(local3, local5, arg0, local212 | 0x40, local186);
				} catch (@Pc(237) pea local237) {
					local235 = local13.a(local3, local5, arg0, local212 | 0x20, local186);
				}
				@Pc(256) Class105 local256 = new Class105(local235.b(0), local235.b());
				local1 = new Class15_Sub2_Sub2(local3, local5, arg0, local9, local13, local235, local256, local186, local18, arg1, arg2, arg3);
				local1.method5418();
				return local1;
			}
		} catch (@Pc(279) RuntimeException local279) {
			if (local1 != null) {
				local1.method5305();
			}
			throw local279;
		}
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/aaa;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!fn;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!e;Lclient!pe;I)V")
	public Class15_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) aaa arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface4 arg9, @OriginalArg(10) Class254 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		this.anInt6559 = arg1;
		this.aD3DPRESENT_PARAMETERS1 = arg7;
		this.anIDirect3D1 = arg4;
		this.anInt6560 = arg0;
		this.aClass105_1 = arg6;
		this.anAaa1 = arg3;
		this.aD3DCAPS1 = arg8;
		this.anIDirect3DDevice1 = arg5;
		this.aD3DLIGHT3 = new D3DLIGHT(this.anAaa1);
		this.aD3DLIGHT1 = new D3DLIGHT(this.anAaa1);
		this.aD3DLIGHT2 = new D3DLIGHT(this.anAaa1);
		this.aPixelBuffer1 = new PixelBuffer(this.anAaa1);
		this.aGeometryBuffer1 = new GeometryBuffer(this.anAaa1);
		new GeometryBuffer(this.anAaa1);
		this.aBoolean558 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
		this.aBoolean567 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
		this.aBoolean565 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
		this.anInt6518 = this.aD3DCAPS1.MaxSimultaneousTextures;
		this.aBoolean566 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
		this.anInt6538 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
		this.aBoolean555 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
		this.aBoolean550 = this.anInt6530 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt6560, this.anInt6559, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
		this.aBooleanArray24 = new boolean[this.anInt6518];
		this.aBooleanArray23 = new boolean[this.anInt6518];
		this.aClass130Array1 = new Class130[this.anInt6518];
		this.aBooleanArray26 = new boolean[this.anInt6518];
		this.anIntArray433 = new int[this.anInt6518];
		this.aBooleanArray25 = new boolean[this.anInt6518];
		this.anIDirect3DDevice1.BeginScene();
		try {
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
			this.method5355();
			this.anIDirect3DDevice1.Clear(3, 0, 1.0F, 0);
		} catch (@Pc(232) Exception_Sub1 local232) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "(B)V")
	@Override
	protected void method5396() {
		if (this.aBoolean543) {
			Static315.aFloatArray57[0] = 1.0F;
			Static315.aFloatArray57[14] = 0.0F;
			Static315.aFloatArray57[12] = 0.0F;
			Static315.aFloatArray57[10] = 1.0F;
			Static315.aFloatArray57[13] = 0.0F;
			Static315.aFloatArray57[4] = 0.0F;
			Static315.aFloatArray57[6] = 0.0F;
			Static315.aFloatArray57[15] = 1.0F;
			Static315.aFloatArray57[9] = 0.0F;
			Static315.aFloatArray57[8] = 0.0F;
			Static315.aFloatArray57[5] = 1.0F;
			Static315.aFloatArray57[1] = 0.0F;
			Static315.aFloatArray57[3] = 0.0F;
			Static315.aFloatArray57[11] = 0.0F;
			Static315.aFloatArray57[2] = 0.0F;
			Static315.aFloatArray57[7] = 0.0F;
		} else {
			this.aClass255_Sub3_15.method8033(Static315.aFloatArray57);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static315.aFloatArray57);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!jga;I)V")
	public void method5492(@OriginalArg(0) Class1 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt6523, arg0.method6928());
		if (this.aClass130Array1[this.anInt6523] != arg0.aClass130_9) {
			@Pc(25) int local25 = Static315.method5495(arg0.aClass130_9);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 6, local25);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 5, local25);
			this.aClass130Array1[this.anInt6523] = arg0.aClass130_9;
			if (arg0.aBoolean695 != this.aBooleanArray25[this.anInt6523]) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 7, arg0.aBoolean695 ? Static315.method5495(arg0.aClass130_9) : 0);
				this.aBooleanArray25[this.anInt6523] = arg0.aBoolean695;
			}
		} else if (this.aBooleanArray25[this.anInt6523] != arg0.aBoolean695) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 7, arg0.aBoolean695 ? Static315.method5495(arg0.aClass130_9) : 0);
			this.aBooleanArray25[this.anInt6523] = arg0.aBoolean695;
		}
		if (!this.aBooleanArray24[this.anInt6523]) {
			this.aBooleanArray24[this.anInt6523] = true;
			this.method5402();
			this.method5453();
		}
	}

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "(B)V")
	@Override
	protected void method5380() {
		this.anIDirect3DDevice1.a(7, this.aBoolean560);
	}

	@OriginalMember(owner = "client!mba", name = "E", descriptor = "()V")
	@Override
	public void method5355() throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass105_1.method2882()) {
			this.anInt6561 = 0;
			if (sw.a((int) this.aClass105_1.method2881(), -64)) {
				this.method5497();
			}
		} else if (++this.anInt6561 <= 50) {
			this.method5497();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "(Z)V")
	@Override
	protected void method5454() {
		if (this.aBoolean547) {
			this.anIDirect3DDevice1.a(36, 0.0F);
			this.anIDirect3DDevice1.a(37, 1.0F);
			this.anIDirect3DDevice1.SetRenderState(34, this.anInt6521);
			return;
		}
		this.aFloat141 = this.anInt6542 - this.anInt6534;
		this.aFloat130 = this.aFloat141 - (float) this.anInt6550;
		if (this.aFloat130 < (float) this.anInt6556) {
			this.aFloat130 = this.anInt6556;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat130);
		this.anIDirect3DDevice1.a(37, this.aFloat141);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt6548);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[BIILclient!pw;I)Lclient!aq;")
	@Override
	public Interface1 method5369(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class261 arg1) {
		return new Class1_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "()V")
	@Override
	public void method5303() {
	}

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "(I)V")
	@Override
	protected void method5401() {
		this.aD3DLIGHT3.SetAmbient(this.aFloat131 * this.aFloat126, this.aFloat143 * this.aFloat126, this.aFloat142 * this.aFloat126, 0.0F);
		this.aBoolean564 = false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLclient!ab;)V")
	public void method5494(@OriginalArg(1) Class1_Sub1 arg0) {
		this.method5492(arg0);
		if (arg0.aBoolean6 != this.aBooleanArray23[this.anInt6523]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 1, arg0.aBoolean6 ? 1 : 3);
			this.aBooleanArray23[this.anInt6523] = arg0.aBoolean6;
		}
		if (this.aBooleanArray26[this.anInt6523] != arg0.aBoolean7) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 2, arg0.aBoolean7 ? 1 : 3);
			this.aBooleanArray26[this.anInt6523] = arg0.aBoolean7;
		}
	}

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "(Z)V")
	@Override
	protected void method5446() {
		if (this.aBoolean564) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT1);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean564 = true;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!mba", name = "D", descriptor = "()V")
	@Override
	public void method5350() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (sw.a((byte) -58, local3.Issue())) {
			while (true) {
				@Pc(12) int local12 = local3.IsSignaled();
				if (local12 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a((byte) -46);
	}

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "()Z")
	@Override
	public boolean method5325() {
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5455(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		if (arg1 != this.aCanvas12) {
			return;
		}
		@Pc(6) Dimension local6 = arg1.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method5497();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "(Z)V")
	@Override
	protected void method5405() {
		@Pc(7) float local7 = this.aBoolean557 ? this.aFloat139 : 0.0F;
		@Pc(16) float local16 = this.aBoolean557 ? -this.aFloat140 : 0.0F;
		this.aD3DLIGHT3.SetDiffuse(local7 * this.aFloat131, this.aFloat143 * local7, local7 * this.aFloat142, 0.0F);
		this.aD3DLIGHT1.SetDiffuse(local16 * this.aFloat131, local16 * this.aFloat143, this.aFloat142 * local16, 0.0F);
		this.aBoolean564 = false;
	}

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "(I)V")
	@Override
	protected void method5379() {
		this.method5405();
		this.method5446();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5338(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5355();
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(II)V")
	@Override
	public void method5461(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, 11, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "P", descriptor = "(I)V")
	@Override
	protected void method5468() {
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(Z)F")
	@Override
	protected float method5367() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIILclient!bm;)V")
	@Override
	public void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class32 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static315.method5500(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "(B)V")
	@Override
	protected void method5386() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6518; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass130Array1[local1] = Static247.aClass130_8;
			this.aBooleanArray23[local1] = this.aBooleanArray26[local1] = true;
			this.aBooleanArray25[local1] = false;
			this.anIntArray433[local1] = 0;
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
		this.aD3DLIGHT1.SetType(3);
		this.aD3DLIGHT2.SetType(1);
		this.aBoolean564 = false;
		super.method5386();
	}

	@OriginalMember(owner = "client!mba", name = "K", descriptor = "(I)V")
	@Override
	protected void method5453() {
		@Pc(15) int local15 = this.aBooleanArray24[this.anInt6523] ? Static315.method5493(this.aClass120Array5[this.anInt6523]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, 1, local15);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZ)Lclient!cu;")
	@Override
	public Interface2 method5383(@OriginalArg(0) boolean arg0) {
		return new Class221(this, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "(B)V")
	@Override
	protected void method5387() {
		this.anIDirect3DDevice1.a(14, this.aBoolean546 && this.aBoolean556);
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5406() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray51);
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(Z)V")
	@Override
	public void method5345(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(ZZ)Lclient!ui;")
	@Override
	public Interface20 method5489(@OriginalArg(0) boolean arg0) {
		return new Class232(this, Static302.aClass200_12, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "(Z)V")
	@Override
	protected void method5473() {
		if (this.aBooleanArray24[this.anInt6523]) {
			this.aBooleanArray24[this.anInt6523] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt6523, null);
			this.method5402();
			this.method5453();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method5368(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method5302(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIZ[FILclient!pw;II)Lclient!qaa;")
	@Override
	protected Interface14 method5479(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) Class261 arg3, @OriginalArg(7) int arg4) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "()V")
	@Override
	public void method5285() {
	}

	@OriginalMember(owner = "client!mba", name = "A", descriptor = "()V")
	@Override
	public void method5342() {
		this.method5399(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!bm;IIIILclient!ui;)V")
	@Override
	public void method5375(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface20 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class232) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static315.method5500(arg1), 0, arg0, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLclient!pw;Lclient!lj;)Z")
	@Override
	public boolean method5374(@OriginalArg(1) Class261 arg0, @OriginalArg(2) Class200 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return sw.a((byte) -58, this.anIDirect3D1.a(this.anInt6560, local3)) && sw.a((byte) -58, this.anIDirect3D1.CheckDeviceFormat(this.anInt6560, this.anInt6559, local3.Format, 0, 4, Static315.method5502(arg0, arg1)));
	}

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5318(@OriginalArg(0) int arg0) {
		this.anAaa1.a(-28275);
		super.method5318(arg0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLclient!ej;ZII)V")
	@Override
	public void method5404(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = 0;
		@Pc(16) byte local16;
		if (arg3 == 1) {
			local16 = 3;
		} else if (arg3 == 2) {
			local16 = 26;
		} else {
			local16 = 2;
		}
		if (arg2) {
			local1 = 32;
		}
		if (arg0) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, local16, Static315.method5498(arg1) | local1);
	}

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "(I)V")
	@Override
	protected void method5402() {
		@Pc(22) int local22 = this.aBooleanArray24[this.anInt6523] ? Static315.method5493(this.aClass120Array6[this.anInt6523]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, 4, local22);
	}

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "(I)V")
	@Override
	protected void method5394() {
		this.anIDirect3DDevice1.a(174, this.aBoolean563);
	}

	@OriginalMember(owner = "client!mba", name = "V", descriptor = "(I)Z")
	private boolean method5497() {
		@Pc(3) int local3 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local3 == 0 || local3 == -2005530519) {
			@Pc(16) Class105 local16 = (Class105) this.anObject12;
			this.method5426();
			local16.method2879();
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			if (Static315.method5496(this.anInt6530, this.anIDirect3D1, this.anInt6560, this.aD3DPRESENT_PARAMETERS1, this.anInt6559)) {
				@Pc(49) int local49 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (sw.a((byte) -58, local49)) {
					local16.method2880(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.b());
					this.method5416();
					this.method5386();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[IIIIZI)Lclient!qaa;")
	@Override
	public Interface14 method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		return new Class1_Sub1(this, arg0, arg5, arg4, arg1, 0, arg3);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "()V")
	@Override
	public void method5276() {
	}

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "(I)V")
	@Override
	protected void method5381() {
		this.anIDirect3DDevice1.SetViewport(this.anInt6535, this.anInt6554, this.anInt6395, this.anInt6436, (float) 0, 1.0F);
	}

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "(B)V")
	@Override
	protected void method5388() {
		if (this.aClass112_13 == Static116.aClass112_3) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass112_13 == Static172.aClass112_19) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass112_13 == Static558.aClass112_17) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIILclient!lj;Lclient!pw;)Lclient!qaa;")
	@Override
	public Interface14 method5472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) Class261 arg3) {
		return new Class1_Sub1(this, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!rc;)V")
	public void method5499(@OriginalArg(1) Class1_Sub3 arg0) {
		this.method5492(arg0);
		if (!this.aBooleanArray23[this.anInt6523]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 1, 1);
			this.aBooleanArray23[this.anInt6523] = true;
		}
		if (!this.aBooleanArray26[this.anInt6523]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt6523, 2, 1);
			this.aBooleanArray26[this.anInt6523] = true;
		}
	}

	@OriginalMember(owner = "client!mba", name = "J", descriptor = "(I)V")
	@Override
	protected void method5449() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt6535 + this.anInt6552, this.anInt6554 - -this.anInt6520, this.anInt6524, this.anInt6553);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "()Lclient!og;")
	@Override
	public Class242 method5278() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.b(this.anInt6560, 0);
		return new Class242(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "(I)V")
	@Override
	public void method5365() {
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray56[0], -this.aFloatArray56[1], -this.aFloatArray56[2]);
		this.aD3DLIGHT1.SetDirection(-this.aFloatArray48[0], -this.aFloatArray48[1], -this.aFloatArray48[2]);
		this.aBoolean564 = false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIIZ[BLclient!pw;)Lclient!qaa;")
	@Override
	protected Interface14 method5440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class261 arg4) {
		return new Class1_Sub1(this, arg4, arg1, arg0, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!pw;BLclient!lj;)Z")
	@Override
	public boolean method5443(@OriginalArg(0) Class261 arg0, @OriginalArg(2) Class200 arg1) {
		@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
		return sw.a((byte) -58, this.anIDirect3D1.a(this.anInt6560, local9)) && sw.a((byte) -58, this.anIDirect3D1.CheckDeviceFormat(this.anInt6560, this.anInt6559, local9.Format, 0, 3, Static315.method5502(arg0, arg1)));
	}

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "()Z")
	@Override
	public boolean method5314() {
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "E", descriptor = "(I)V")
	@Override
	protected void method5437() {
		if (this.aClass359Array3[this.anInt6523] == Static21.aClass359_1) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, 24, 0);
			this.anIntArray433[this.anInt6523] = 0;
			return;
		}
		if (this.aClass359Array3[this.anInt6523] == Static515.aClass359_14) {
			this.anIDirect3DDevice1.SetTransform(this.anInt6523 + 16, this.aClass255_Sub3Array3[this.anInt6523].method8033(Static315.aFloatArray57));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt6523 + 16, this.aClass255_Sub3Array3[this.anInt6523].method8026(Static315.aFloatArray57));
		}
		@Pc(70) int local70 = Static315.method5501(this.aClass359Array3[this.anInt6523]);
		if (local70 != this.anIntArray433[this.anInt6523]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, 24, local70);
			this.anIntArray433[this.anInt6523] = local70;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!hj;)V")
	@Override
	public void method5391(@OriginalArg(1) Class142 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "(B)V")
	@Override
	protected void method5398() {
		this.anIDirect3DDevice1.a(15, this.aBoolean552);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!cu;I)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1) {
		@Pc(8) Class221 local8 = (Class221) arg1;
		this.anIDirect3DDevice1.SetStreamSource(arg0, local8.anIDirect3DVertexBuffer1, 0, local8.method5807());
	}

	@OriginalMember(owner = "client!mba", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return 0;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5464(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		this.aClass105_1 = (Class105) arg0;
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(B)V")
	@Override
	protected void method5361() {
		if (this.aClass82_5.method2320()) {
			this.aClass255_Sub3_18.method8033(Static315.aFloatArray57);
		} else {
			Static315.aFloatArray57[6] = 0.0F;
			Static315.aFloatArray57[5] = 1.0F;
			Static315.aFloatArray57[11] = 0.0F;
			Static315.aFloatArray57[8] = 0.0F;
			Static315.aFloatArray57[14] = 0.0F;
			Static315.aFloatArray57[3] = 0.0F;
			Static315.aFloatArray57[10] = 1.0F;
			Static315.aFloatArray57[12] = 0.0F;
			Static315.aFloatArray57[1] = 0.0F;
			Static315.aFloatArray57[2] = 0.0F;
			Static315.aFloatArray57[4] = 0.0F;
			Static315.aFloatArray57[13] = 0.0F;
			Static315.aFloatArray57[7] = 0.0F;
			Static315.aFloatArray57[0] = 1.0F;
			Static315.aFloatArray57[15] = 1.0F;
			Static315.aFloatArray57[9] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static315.aFloatArray57);
	}

	@OriginalMember(owner = "client!mba", name = "r", descriptor = "(I)V")
	@Override
	protected void method5400() {
		this.anIDirect3DDevice1.a(27, this.aBoolean544);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5393(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "()V")
	@Override
	public void method5295() {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI[[IZ)Lclient!tda;")
	@Override
	public Interface18 method5463(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class1_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "(I)V")
	@Override
	protected void method5358() {
		this.anIDirect3DDevice1.a(28, this.aBoolean562 && this.aBoolean548 && this.aBoolean547 | this.anInt6550 >= 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZILclient!ej;)V")
	@Override
	protected void method5458(@OriginalArg(2) int arg0, @OriginalArg(3) Class85 arg1) {
		@Pc(21) byte local21;
		if (arg0 == 1) {
			local21 = 6;
		} else if (arg0 == 2) {
			local21 = 27;
		} else {
			local21 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, local21, Static315.method5498(arg1) | 0x0);
	}

	@OriginalMember(owner = "client!mba", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (sw.a((byte) -58, this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 1)) && sw.a((byte) -58, local16.LockRect(0, 0, arg2, arg3, 0, this.aPixelBuffer1))) {
			local1 = new int[arg3 * arg2];
			@Pc(55) int local55 = this.aPixelBuffer1.getRowPitch();
			if (local55 == arg2 * 4) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(62) int local62 = 0; local62 < arg3; local62++) {
					this.aPixelBuffer1.b(local1, local62 * arg2, local62 * local55, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a((byte) -46);
		local16.a((byte) -46);
		return local1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLclient!ol;)V")
	@Override
	public void method5389(@OriginalArg(1) Class245 arg0) {
		@Pc(1) int local1 = 0;
		if (Static408.aClass245_3 == arg0) {
			local1 = 65536;
		} else if (Static207.aClass245_1 == arg0) {
			local1 = 131072;
		} else if (Static311.aClass245_2 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt6523, 11, local1 | this.anInt6523);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B[Lclient!ed;)Lclient!hj;")
	@Override
	public Class142 method5421(@OriginalArg(1) Class78[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "M", descriptor = "(I)V")
	@Override
	protected void method5459() {
		this.anIDirect3DDevice1.a(137, this.aBoolean545 && !this.aBoolean549);
	}

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "(B)V")
	@Override
	protected void method5371() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt6546);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ)Lclient!wh;")
	@Override
	protected Class19 method5451(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class19_Sub7(this, this.aClass254_89);
		} else if (arg0 == 4) {
			return new Class19_Sub2(this, this.aClass254_89, this.aClass31_5);
		} else {
			return super.method5451(arg0);
		}
	}

	@OriginalMember(owner = "client!mba", name = "G", descriptor = "(I)V")
	@Override
	protected void method5441() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt6522; local1++) {
			@Pc(10) Class3_Sub28 local10 = this.aClass3_Sub28Array5[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method8153();
			@Pc(24) float local24 = local10.method8159() / 255.0F;
			this.aD3DLIGHT2.SetPosition((float) local10.method8156(), (float) local10.method8155(), (float) local10.method8158());
			this.aD3DLIGHT2.SetDiffuse((float) (local18 >> 16 & 0xFF) * local24, local24 * (float) (local18 >> 8 & 0xFF), (float) (local18 & 0xFF) * local24, 0.0F);
			this.aD3DLIGHT2.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local10.method8154() * local10.method8154()));
			this.aD3DLIGHT2.SetRange((float) local10.method8154());
			this.anIDirect3DDevice1.SetLight(local14, this.aD3DLIGHT2);
			this.anIDirect3DDevice1.LightEnable(local14, true);
		}
		while (local1 < this.anInt6551) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method5441();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5412(@OriginalArg(1) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "()V")
	@Override
	protected void method5305() {
		this.anAaa1.b(7622);
		super.method5305();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!kn;Lclient!kn;FLclient!kn;)Lclient!kn;")
	@Override
	public Class108 method5298(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class108 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}
}
