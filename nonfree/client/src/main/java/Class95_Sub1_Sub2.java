import jaclib.peer.hk;
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
import jagdx.pda;
import jagdx.tb;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class95_Sub1_Sub2 extends Class95_Sub1 {

	@OriginalMember(owner = "client!uda", name = "Tg", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private IDirect3DVertexShader anIDirect3DVertexShader8;

	@OriginalMember(owner = "client!uda", name = "Wg", descriptor = "Z")
	private boolean aBoolean706 = false;

	@OriginalMember(owner = "client!uda", name = "ch", descriptor = "I")
	private int anInt10067 = 0;

	@OriginalMember(owner = "client!uda", name = "Og", descriptor = "Lclient!jagdx/D3DCAPS;")
	public final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!uda", name = "jh", descriptor = "Lclient!wq;")
	private Class391 aClass391_1;

	@OriginalMember(owner = "client!uda", name = "eh", descriptor = "Lclient!jagdx/IDirect3D;")
	private final IDirect3D anIDirect3D1;

	@OriginalMember(owner = "client!uda", name = "kh", descriptor = "I")
	private final int anInt10068;

	@OriginalMember(owner = "client!uda", name = "bh", descriptor = "Lclient!jagdx/IDirect3DDevice;")
	public final IDirect3DDevice anIDirect3DDevice1;

	@OriginalMember(owner = "client!uda", name = "Rg", descriptor = "I")
	private final int anInt10066;

	@OriginalMember(owner = "client!uda", name = "ih", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	private final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!uda", name = "Ug", descriptor = "Lclient!jaclib/peer/hk;")
	public final hk aHk1;

	@OriginalMember(owner = "client!uda", name = "oh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT2;

	@OriginalMember(owner = "client!uda", name = "ph", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT3;

	@OriginalMember(owner = "client!uda", name = "dh", descriptor = "Lclient!jagdx/D3DLIGHT;")
	private final D3DLIGHT aD3DLIGHT1;

	@OriginalMember(owner = "client!uda", name = "lh", descriptor = "Lclient!jagdx/PixelBuffer;")
	public final PixelBuffer aPixelBuffer1;

	@OriginalMember(owner = "client!uda", name = "Zg", descriptor = "Lclient!jagdx/GeometryBuffer;")
	public final GeometryBuffer aGeometryBuffer1;

	@OriginalMember(owner = "client!uda", name = "Yg", descriptor = "Z")
	public final boolean aBoolean707;

	@OriginalMember(owner = "client!uda", name = "Qg", descriptor = "Z")
	public final boolean aBoolean705;

	@OriginalMember(owner = "client!uda", name = "Pg", descriptor = "Z")
	public final boolean aBoolean704;

	@OriginalMember(owner = "client!uda", name = "ah", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!uda", name = "fh", descriptor = "[I")
	private final int[] anIntArray535;

	@OriginalMember(owner = "client!uda", name = "nh", descriptor = "[Z")
	private final boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!uda", name = "gh", descriptor = "[Z")
	private final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!uda", name = "hh", descriptor = "[Z")
	private final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!uda", name = "mh", descriptor = "[Lclient!ag;")
	private final Class8[] aClass8Array1;

	@OriginalMember(owner = "client!uda", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!uq;Ljava/lang/Integer;)Lclient!ha;")
	public static Class95 createToolkit(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Integer arg3) {
		@Pc(1) Class95_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(9) hk local9 = new hk();
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
			} else if ((local18.DestBlendCaps & 0x10 & local18.SrcBlendCaps) == 0) {
				throw new RuntimeException("");
			} else if ((local18.DestBlendCaps & local18.SrcBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local18.SrcBlendCaps & local18.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local18.MaxActiveLights > 0 && local18.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local18.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(183) D3DPRESENT_PARAMETERS local183 = new D3DPRESENT_PARAMETERS(arg0);
				if (!Static602.method8212(local13, local3, local5, local183, arg3)) {
					throw new RuntimeException("");
				}
				local183.Windowed = true;
				local183.PresentationInterval = Integer.MIN_VALUE;
				local183.EnableAutoDepthStencil = true;
				@Pc(208) int local208 = 2;
				if ((local18.DevCaps & 0x100000) != 0) {
					local208 |= 0x10;
				}
				@Pc(233) IDirect3DDevice local233;
				try {
					local233 = local13.a(local3, local5, arg0, local208 | 0x40, local183);
				} catch (@Pc(235) tb local235) {
					local233 = local13.a(local3, local5, arg0, local208 | 0x20, local183);
				}
				@Pc(254) Class391 local254 = new Class391(local233.b(0), local233.b());
				local1 = new Class95_Sub1_Sub2(local3, local5, arg0, local9, local13, local233, local254, local183, local18, arg1, arg2, arg3);
				local1.method8135();
				return local1;
			}
		} catch (@Pc(277) RuntimeException local277) {
			if (local1 != null) {
				local1.method8014();
			}
			throw local277;
		}
	}

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(IILjava/awt/Canvas;Lclient!jaclib/peer/hk;Lclient!jagdx/IDirect3D;Lclient!jagdx/IDirect3DDevice;Lclient!wq;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!d;Lclient!uq;I)V")
	public Class95_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) hk arg3, @OriginalArg(4) IDirect3D arg4, @OriginalArg(5) IDirect3DDevice arg5, @OriginalArg(6) Class391 arg6, @OriginalArg(7) D3DPRESENT_PARAMETERS arg7, @OriginalArg(8) D3DCAPS arg8, @OriginalArg(9) Interface2 arg9, @OriginalArg(10) Class362 arg10, @OriginalArg(11) int arg11) {
		super(arg2, arg6, arg9, arg10, arg11, 0);
		try {
			this.aD3DCAPS1 = arg8;
			this.aClass391_1 = arg6;
			this.anIDirect3D1 = arg4;
			this.anInt10068 = arg0;
			this.anIDirect3DDevice1 = arg5;
			this.anInt10066 = arg1;
			this.aD3DPRESENT_PARAMETERS1 = arg7;
			this.aHk1 = arg3;
			this.aD3DLIGHT2 = new D3DLIGHT(this.aHk1);
			this.aD3DLIGHT3 = new D3DLIGHT(this.aHk1);
			this.aD3DLIGHT1 = new D3DLIGHT(this.aHk1);
			this.aPixelBuffer1 = new PixelBuffer(this.aHk1);
			this.aGeometryBuffer1 = new GeometryBuffer(this.aHk1);
			new GeometryBuffer(this.aHk1);
			this.aBoolean707 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.anInt10040 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.aBoolean705 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean697 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean704 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean693 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.anInt10039 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean694 = this.anInt10034 > 0 || this.anIDirect3D1.CheckDeviceMultiSampleType(this.anInt10068, this.anInt10066, this.aD3DPRESENT_PARAMETERS1.BackBufferFormat, true, 2) == 0;
			this.aBooleanArray26 = new boolean[this.anInt10040];
			this.anIntArray535 = new int[this.anInt10040];
			this.aBooleanArray29 = new boolean[this.anInt10040];
			this.aBooleanArray27 = new boolean[this.anInt10040];
			this.aBooleanArray28 = new boolean[this.anInt10040];
			this.aClass8Array1 = new Class8[this.anInt10040];
			this.anIDirect3DDevice1.BeginScene();
		} catch (@Pc(223) Throwable local223) {
			local223.printStackTrace();
			this.method8007();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!hfa;B)V")
	public void method8210(@OriginalArg(0) Class38 arg0) {
		this.anIDirect3DDevice1.SetTexture(this.anInt10026, arg0.method6846());
		if (arg0.aClass8_8 != this.aClass8Array1[this.anInt10026]) {
			@Pc(59) int local59 = Static602.method8219(arg0.aClass8_8);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 6, local59);
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 5, local59);
			this.aClass8Array1[this.anInt10026] = arg0.aClass8_8;
			if (this.aBooleanArray29[this.anInt10026] != arg0.aBoolean576) {
				this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 7, arg0.aBoolean576 ? Static602.method8219(arg0.aClass8_8) : 0);
				this.aBooleanArray29[this.anInt10026] = arg0.aBoolean576;
			}
		} else if (this.aBooleanArray29[this.anInt10026] != arg0.aBoolean576) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 7, arg0.aBoolean576 ? Static602.method8219(arg0.aClass8_8) : 0);
			this.aBooleanArray29[this.anInt10026] = arg0.aBoolean576;
		}
		if (!this.aBooleanArray26[this.anInt10026]) {
			this.aBooleanArray26[this.anInt10026] = true;
			this.method8139();
			this.method8179();
		}
	}

	@OriginalMember(owner = "client!uda", name = "t", descriptor = "(B)V")
	@Override
	protected void method8191() {
		this.anIDirect3DDevice1.a(15, this.aBoolean689);
	}

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "(Z)V")
	@Override
	protected void method8132() {
		this.aFloat189 = (float) (this.anInt10035 - this.anInt10041);
		this.aFloat195 = this.aFloat189 - (float) this.anInt10049;
		if (this.aFloat195 < (float) this.anInt10050) {
			this.aFloat195 = (float) this.anInt10050;
		}
		this.anIDirect3DDevice1.a(36, this.aFloat195);
		this.anIDirect3DDevice1.a(37, this.aFloat189);
		this.anIDirect3DDevice1.SetRenderState(34, this.anInt10029);
	}

	@OriginalMember(owner = "client!uda", name = "fb", descriptor = "(I)V")
	@Override
	protected void method8207() {
		this.anIDirect3DDevice1.SetRenderState(60, this.anInt10046);
	}

	@OriginalMember(owner = "client!uda", name = "m", descriptor = "(I)V")
	@Override
	protected void method8089() {
	}

	@OriginalMember(owner = "client!uda", name = "x", descriptor = "(B)V")
	@Override
	protected void method8203() {
		if (this.aBoolean682) {
			Static602.aFloatArray68[6] = 0.0F;
			Static602.aFloatArray68[10] = 1.0F;
			Static602.aFloatArray68[2] = 0.0F;
			Static602.aFloatArray68[5] = 1.0F;
			Static602.aFloatArray68[15] = 1.0F;
			Static602.aFloatArray68[9] = 0.0F;
			Static602.aFloatArray68[13] = 0.0F;
			Static602.aFloatArray68[3] = 0.0F;
			Static602.aFloatArray68[14] = 0.0F;
			Static602.aFloatArray68[11] = 0.0F;
			Static602.aFloatArray68[12] = 0.0F;
			Static602.aFloatArray68[7] = 0.0F;
			Static602.aFloatArray68[8] = 0.0F;
			Static602.aFloatArray68[1] = 0.0F;
			Static602.aFloatArray68[0] = 1.0F;
			Static602.aFloatArray68[4] = 0.0F;
		} else {
			this.aClass17_Sub2_15.method5840(Static602.aFloatArray68);
		}
		this.anIDirect3DDevice1.SetTransform(256, Static602.aFloatArray68);
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(B)V")
	@Override
	protected void method8093() {
		this.anIDirect3DDevice1.a(14, this.aBoolean696 && this.aBoolean687);
	}

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "(B)V")
	@Override
	protected void method8123() {
		if (this.aBooleanArray26[this.anInt10026]) {
			this.aBooleanArray26[this.anInt10026] = false;
			this.anIDirect3DDevice1.SetTexture(this.anInt10026, (IDirect3DBaseTexture) null);
			this.method8139();
			this.method8179();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILclient!sia;)V")
	@Override
	public void method8199(@OriginalArg(1) Class323 arg0) {
		@Pc(1) int local1 = 0;
		if (Static117.aClass323_2 == arg0) {
			local1 = 65536;
		} else if (arg0 == Static189.aClass323_3) {
			local1 = 131072;
		} else if (Static44.aClass323_1 == arg0) {
			local1 = 196608;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, 11, local1 | this.anInt10026);
	}

	@OriginalMember(owner = "client!uda", name = "u", descriptor = "(I)V")
	@Override
	protected void method8111() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt10030; local1++) {
			@Pc(14) Class3_Sub13 local14 = this.aClass3_Sub13Array6[local1];
			@Pc(18) int local18 = local1 + 2;
			@Pc(24) int local24 = local14.method5957();
			@Pc(30) float local30 = local14.method5961() / 255.0F;
			this.aD3DLIGHT1.SetPosition((float) local14.method5958(), (float) local14.method5963(), (float) local14.method5960());
			this.aD3DLIGHT1.SetDiffuse((float) (local24 >> 16 & 0xFF) * local30, local30 * (float) (local24 >> 8 & 0xFF), local30 * (float) (local24 & 0xFF), 0.0F);
			this.aD3DLIGHT1.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (local14.method5962() * local14.method5962()));
			this.aD3DLIGHT1.SetRange((float) local14.method5962());
			this.anIDirect3DDevice1.SetLight(local18, this.aD3DLIGHT1);
			this.anIDirect3DDevice1.LightEnable(local18, true);
		}
		while (this.anInt10051 > local1) {
			this.anIDirect3DDevice1.LightEnable(local1 + 2, false);
			local1++;
		}
		super.method8111();
	}

	@OriginalMember(owner = "client!uda", name = "J", descriptor = "(I)Z")
	private boolean method8211() {
		@Pc(8) int local8 = this.anIDirect3DDevice1.TestCooperativeLevel();
		if (local8 == 0 || local8 == -2005530519) {
			@Pc(20) Class391 local20 = (Class391) this.anObject19;
			this.method8143();
			local20.method8974();
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = 0;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = 0;
			if (Static602.method8212(this.anIDirect3D1, this.anInt10068, this.anInt10066, this.aD3DPRESENT_PARAMETERS1, this.anInt10034)) {
				@Pc(56) int local56 = this.anIDirect3DDevice1.Reset(this.aD3DPRESENT_PARAMETERS1);
				if (pda.a(local56, 17527)) {
					local20.method8975(this.anIDirect3DDevice1.b(0), this.anIDirect3DDevice1.b());
					this.method8170();
					this.method8156();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLclient!g;Lclient!wj;)Z")
	@Override
	public boolean method8206(@OriginalArg(1) Class122 arg0, @OriginalArg(2) Class389 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return pda.a(this.anIDirect3D1.a(this.anInt10068, local3), 17527) && pda.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt10068, this.anInt10066, local3.Format, 0, 4, Static602.method8215(arg1, arg0)), 17527);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!rq;B)V")
	public void method8213(@OriginalArg(0) Class38_Sub3 arg0) {
		this.method8210(arg0);
		if (this.aBooleanArray27[this.anInt10026] != arg0.aBoolean577) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 1, arg0.aBoolean577 ? 1 : 3);
			this.aBooleanArray27[this.anInt10026] = arg0.aBoolean577;
		}
		if (this.aBooleanArray28[this.anInt10026] != arg0.aBoolean578) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 2, arg0.aBoolean578 ? 1 : 3);
			this.aBooleanArray28[this.anInt10026] = arg0.aBoolean578;
		}
	}

	@OriginalMember(owner = "client!uda", name = "t", descriptor = "()V")
	@Override
	public void method8039() {
	}

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "(B)V")
	@Override
	protected void method8117() {
		this.anIDirect3DDevice1.SetTransform(3, this.aFloatArray63);
	}

	@OriginalMember(owner = "client!uda", name = "v", descriptor = "(I)V")
	@Override
	protected void method8113() {
		if (Static343.aClass147_4 == this.aClass147_7) {
			this.anIDirect3DDevice1.SetRenderState(19, 5);
			this.anIDirect3DDevice1.SetRenderState(20, 6);
		} else if (this.aClass147_7 == Static159.aClass147_2) {
			this.anIDirect3DDevice1.SetRenderState(19, 2);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		} else if (this.aClass147_7 == Static554.aClass147_6) {
			this.anIDirect3DDevice1.SetRenderState(19, 9);
			this.anIDirect3DDevice1.SetRenderState(20, 2);
		}
	}

	@OriginalMember(owner = "client!uda", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.Clear(1, arg0, 0.0F, 0);
	}

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "(B)V")
	@Override
	protected void method8105() {
		this.method8130();
		this.method8126();
	}

	@OriginalMember(owner = "client!uda", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return 0;
	}

	@OriginalMember(owner = "client!uda", name = "m", descriptor = "(II)Lclient!ev;")
	@Override
	protected Class4 method8209(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class4_Sub1(this, this.aClass362_142);
		} else if (arg0 == 4) {
			return new Class4_Sub8(this, this.aClass362_142, this.aClass123_8);
		} else if (arg0 == 8) {
			return new Class4_Sub9(this, this.aClass362_142, this.aClass123_8);
		} else {
			return super.method8209(arg0);
		}
	}

	@OriginalMember(owner = "client!uda", name = "o", descriptor = "()V")
	@Override
	public void method8019() {
	}

	@OriginalMember(owner = "client!uda", name = "n", descriptor = "(B)V")
	@Override
	protected void method8152() {
		this.anIDirect3DDevice1.a(174, this.aBoolean703);
	}

	@OriginalMember(owner = "client!uda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8095(true);
		this.anIDirect3DDevice1.Clear(2, 0, 1.0F, 0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BIILclient!fga;)V")
	@Override
	public void method8182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class115 arg2) {
		this.anIDirect3DDevice1.DrawPrimitive(Static602.method8214(arg2), arg0, arg1);
	}

	@OriginalMember(owner = "client!uda", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int[] local1 = null;
		@Pc(6) IDirect3DSurface local6 = this.anIDirect3DDevice1.c(0);
		@Pc(16) IDirect3DSurface local16 = this.anIDirect3DDevice1.a(arg2, arg3, 21, 0, 0, true);
		if (pda.a(this.anIDirect3DDevice1.StretchRect(local6, arg0, arg1, arg2, arg3, local16, 0, 0, arg2, arg3, 0), 17527) && pda.a(local16.LockRect(0, 0, arg2, arg3, 16, this.aPixelBuffer1), 17527)) {
			local1 = new int[arg3 * arg2];
			@Pc(54) int local54 = this.aPixelBuffer1.getRowPitch();
			if (arg2 * 4 == local54) {
				this.aPixelBuffer1.b(local1, 0, 0, arg3 * arg2);
			} else {
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					this.aPixelBuffer1.b(local1, local65 * arg2, local54 * local65, arg2);
				}
			}
			local16.UnlockRect();
		}
		local6.a(true);
		local16.a(true);
		return local1;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method8107(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
	}

	@OriginalMember(owner = "client!uda", name = "u", descriptor = "()V")
	@Override
	public void method8042() {
	}

	@OriginalMember(owner = "client!uda", name = "D", descriptor = "(I)V")
	@Override
	protected void method8138() {
		this.anIDirect3DDevice1.SetViewport(this.anInt10027, this.anInt10036, this.anInt9996, this.anInt9970, (float) 0, 1.0F);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLclient!jagdx/IDirect3DVertexShader;)V")
	public void method8217(@OriginalArg(1) IDirect3DVertexShader arg0) {
		this.anIDirect3DVertexShader8 = arg0;
		this.anIDirect3DDevice1.SetVertexShader(arg0);
		this.method8192();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILclient!g;III[B)Lclient!or;")
	@Override
	public Interface20 method8136(@OriginalArg(1) Class122 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class38_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLclient!wj;Lclient!g;)Z")
	@Override
	public boolean method8151(@OriginalArg(1) Class389 arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(8) D3DDISPLAYMODE local8 = new D3DDISPLAYMODE();
		return pda.a(this.anIDirect3D1.a(this.anInt10068, local8), 17527) && pda.a(this.anIDirect3D1.CheckDeviceFormat(this.anInt10068, this.anInt10066, local8.Format, 0, 3, Static602.method8215(arg0, arg1)), 17527);
	}

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8126() {
		if (this.aBoolean706) {
			return;
		}
		this.anIDirect3DDevice1.LightEnable(0, false);
		this.anIDirect3DDevice1.LightEnable(1, false);
		this.anIDirect3DDevice1.SetLight(0, this.aD3DLIGHT2);
		this.anIDirect3DDevice1.SetLight(1, this.aD3DLIGHT3);
		this.anIDirect3DDevice1.LightEnable(0, true);
		this.anIDirect3DDevice1.LightEnable(1, true);
		this.aBoolean706 = true;
	}

	@OriginalMember(owner = "client!uda", name = "s", descriptor = "()Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILclient!mq;ZI)V")
	@Override
	protected void method8077(@OriginalArg(1) Class235 arg0, @OriginalArg(3) int arg1) {
		@Pc(12) byte local12;
		if (arg1 == 1) {
			local12 = 6;
		} else if (arg1 == 2) {
			local12 = 27;
		} else {
			local12 = 5;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, local12, Static602.method8220(arg0) | 0x0);
	}

	@OriginalMember(owner = "client!uda", name = "l", descriptor = "()V")
	@Override
	protected void method8014() {
		this.aHk1.a((int) 26610);
		super.method8014();
	}

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "()Z")
	@Override
	public boolean method8011() {
		return false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I[[IZB)Lclient!faa;")
	@Override
	public Interface7 method8194(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2) {
		return new Class38_Sub1(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!uda", name = "cb", descriptor = "(I)V")
	@Override
	protected void method8192() {
		if (this.anIDirect3DVertexShader8 != null || Static70.aClass366_1 == this.aClass366Array3[this.anInt10026]) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, 24, 0);
			this.anIntArray535[this.anInt10026] = 0;
			return;
		}
		if (Static345.aClass366_6 == this.aClass366Array3[this.anInt10026]) {
			this.anIDirect3DDevice1.SetTransform(this.anInt10026 + 16, this.aClass17_Sub2Array3[this.anInt10026].method5844(Static602.aFloatArray68));
		} else {
			this.anIDirect3DDevice1.SetTransform(this.anInt10026 + 16, this.aClass17_Sub2Array3[this.anInt10026].method5840(Static602.aFloatArray68));
		}
		@Pc(80) int local80 = Static602.method8218(this.aClass366Array3[this.anInt10026]);
		if (this.anIntArray535[this.anInt10026] != local80) {
			this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, 24, local80);
			this.anIntArray535[this.anInt10026] = local80;
		}
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(Z)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uda", name = "u", descriptor = "(B)V")
	@Override
	protected void method8197() {
		this.anIDirect3DDevice1.a(27, this.aBoolean684);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method8208(@OriginalArg(0) Canvas arg0) {
		return null;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "([Lclient!rf;Z)Lclient!eda;")
	@Override
	public Class94 method8185(@OriginalArg(0) Class306[] arg0) {
		return new dxVertexLayout(this, arg0);
	}

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "(B)V")
	@Override
	protected void method8130() {
		@Pc(7) float local7 = this.aBoolean690 ? this.aFloat203 : 0.0F;
		@Pc(20) float local20 = this.aBoolean690 ? -this.aFloat191 : 0.0F;
		this.aD3DLIGHT2.SetDiffuse(this.aFloat193 * local7, local7 * this.aFloat200, local7 * this.aFloat192, 0.0F);
		this.aD3DLIGHT3.SetDiffuse(this.aFloat193 * local20, local20 * this.aFloat200, this.aFloat192 * local20, 0.0F);
		this.aBoolean706 = false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!hg;)V")
	@Override
	public void method8072(@OriginalArg(0) Interface10 arg0) {
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!wj;IBILclient!g;)Lclient!fk;")
	@Override
	public Interface8 method8084(@OriginalArg(0) Class389 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122 arg3) {
		return new Class38_Sub3(this, arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!uda", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)Lclient!km;")
	@Override
	public Interface15 method8090(@OriginalArg(1) boolean arg0) {
		return new Class74(this, arg0);
	}

	@OriginalMember(owner = "client!uda", name = "A", descriptor = "(I)F")
	@Override
	protected float method8128() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!uda", name = "S", descriptor = "(I)V")
	@Override
	protected void method8175() {
		this.anIDirect3DDevice1.a(28, this.aBoolean685 && this.aBoolean695 && this.anInt10049 >= 0);
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!uda", name = "eb", descriptor = "(I)V")
	@Override
	protected void method8204() {
		this.anIDirect3DDevice1.a(7, this.aBoolean691);
	}

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "(Z)V")
	@Override
	protected void method8114() {
		this.anIDirect3DDevice1.SetScissorRect(this.anInt10027 + this.anInt10033, this.anInt10036 - -this.anInt10028, this.anInt10062, this.anInt10053);
	}

	@OriginalMember(owner = "client!uda", name = "V", descriptor = "(I)V")
	@Override
	protected void method8179() {
		@Pc(29) int local29 = this.aBooleanArray26[this.anInt10026] ? Static602.method8216(this.aClass112Array6[this.anInt10026]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, 1, local29);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!uda", name = "o", descriptor = "(B)V")
	@Override
	public void method8159() {
		this.aD3DLIGHT2.SetDirection(-this.aFloatArray64[0], -this.aFloatArray64[1], -this.aFloatArray64[2]);
		this.aD3DLIGHT3.SetDirection(-this.aFloatArray65[0], -this.aFloatArray65[1], -this.aFloatArray65[2]);
		this.aBoolean706 = false;
	}

	@OriginalMember(owner = "client!uda", name = "p", descriptor = "(B)V")
	@Override
	protected void method8165() {
		if (this.aClass393_11.method9020()) {
			this.aClass17_Sub2_18.method5840(Static602.aFloatArray68);
		} else {
			Static602.aFloatArray68[12] = 0.0F;
			Static602.aFloatArray68[1] = 0.0F;
			Static602.aFloatArray68[13] = 0.0F;
			Static602.aFloatArray68[3] = 0.0F;
			Static602.aFloatArray68[9] = 0.0F;
			Static602.aFloatArray68[8] = 0.0F;
			Static602.aFloatArray68[6] = 0.0F;
			Static602.aFloatArray68[11] = 0.0F;
			Static602.aFloatArray68[4] = 0.0F;
			Static602.aFloatArray68[2] = 0.0F;
			Static602.aFloatArray68[15] = 1.0F;
			Static602.aFloatArray68[7] = 0.0F;
			Static602.aFloatArray68[10] = 1.0F;
			Static602.aFloatArray68[0] = 1.0F;
			Static602.aFloatArray68[5] = 1.0F;
			Static602.aFloatArray68[14] = 0.0F;
		}
		this.anIDirect3DDevice1.SetTransform(2, Static602.aFloatArray68);
	}

	@OriginalMember(owner = "client!uda", name = "L", descriptor = "(I)V")
	@Override
	protected void method8156() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt10040; local1++) {
			this.anIDirect3DDevice1.SetSamplerState(local1, 7, 0);
			this.anIDirect3DDevice1.SetSamplerState(local1, 6, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 5, 2);
			this.anIDirect3DDevice1.SetSamplerState(local1, 1, 1);
			this.anIDirect3DDevice1.SetSamplerState(local1, 2, 1);
			this.aClass8Array1[local1] = Static608.aClass8_11;
			this.aBooleanArray27[local1] = this.aBooleanArray28[local1] = true;
			this.aBooleanArray29[local1] = false;
			this.anIntArray535[local1] = 0;
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
		this.aBoolean706 = false;
		super.method8156();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZI[FIIILclient!g;)Lclient!fk;")
	@Override
	protected Interface8 method8085(@OriginalArg(1) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class122 arg4) {
		return null;
	}

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "(Z)V")
	@Override
	protected void method8139() {
		@Pc(18) int local18 = this.aBooleanArray26[this.anInt10026] ? Static602.method8216(this.aClass112Array5[this.anInt10026]) : 1;
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, 4, local18);
	}

	@OriginalMember(owner = "client!uda", name = "A", descriptor = "()Lclient!dca;")
	@Override
	public Class72 method8064() {
		@Pc(6) D3DADAPTER_IDENTIFIER local6 = this.anIDirect3D1.a(this.anInt10068, 0);
		return new Class72(local6.VendorID, "Direct3D", 9, local6.Description, local6.DriverVersion);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILclient!g;[BIIIIZ)Lclient!fk;")
	@Override
	protected Interface8 method8171(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(7) boolean arg4) {
		return new Class38_Sub3(this, arg1, arg3, arg0, arg4, arg2, 0, 0);
	}

	@OriginalMember(owner = "client!uda", name = "v", descriptor = "()V")
	@Override
	public void method8052() {
	}

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "(II)Lclient!io;")
	@Override
	public Interface12 method8030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "(II)V")
	@Override
	public void method8146(@OriginalArg(0) int arg0) {
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, 11, arg0);
	}

	@OriginalMember(owner = "client!uda", name = "O", descriptor = "(I)V")
	@Override
	protected void method8164() {
		this.aD3DLIGHT2.SetAmbient(this.aFloat199 * this.aFloat193, this.aFloat200 * this.aFloat199, this.aFloat192 * this.aFloat199, 0.0F);
		this.aBoolean706 = false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method8189(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		if (this.aCanvas13 != arg0) {
			return;
		}
		@Pc(6) Dimension local6 = arg0.getSize();
		if (local6.width > 0 && local6.height > 0) {
			this.anIDirect3DDevice1.EndScene();
			this.method8211();
			this.anIDirect3DDevice1.BeginScene();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lclient!rr;")
	@Override
	public Interface23 method7987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!io;Lclient!rr;)Lclient!hg;")
	@Override
	public Interface10 method8004(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V")
	@Override
	public void method8010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anIDirect3DDevice1.EndScene();
		if (this.aClass391_1.method8976()) {
			this.anInt10067 = 0;
			if (pda.b(0, this.aClass391_1.method8973())) {
				this.method8211();
			}
		} else if (++this.anInt10067 <= 50) {
			this.method8211();
		} else {
			throw new Exception_Sub1();
		}
		this.anIDirect3DDevice1.BeginScene();
	}

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8056(@OriginalArg(0) int arg0) {
		this.aHk1.a((byte) 95);
		super.method8056(arg0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZLclient!mq;ZI)V")
	@Override
	public void method8101(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) int local1 = 0;
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local13 = 3;
		} else if (arg0 == 2) {
			local13 = 26;
		} else {
			local13 = 2;
		}
		if (arg3) {
			local1 = 32;
		}
		if (arg1) {
			local1 |= 0x10;
		}
		this.anIDirect3DDevice1.SetTextureStageState(this.anInt10026, local13, Static602.method8220(arg2) | local1);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZB)Lclient!ra;")
	@Override
	public Interface22 method8115(@OriginalArg(0) boolean arg0) {
		return new Class329(this, Static666.aClass389_17, arg0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZIII[III)Lclient!fk;")
	@Override
	public Interface8 method8167(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		return new Class38_Sub3(this, arg3, arg2, arg0, arg4, 0, arg5);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILclient!oga;)V")
	public void method8221(@OriginalArg(1) Class38_Sub2 arg0) {
		this.method8210(arg0);
		if (!this.aBooleanArray27[this.anInt10026]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 1, 1);
			this.aBooleanArray27[this.anInt10026] = true;
		}
		if (!this.aBooleanArray28[this.anInt10026]) {
			this.anIDirect3DDevice1.SetSamplerState(this.anInt10026, 2, 1);
			this.aBooleanArray28[this.anInt10026] = true;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLclient!eda;)V")
	@Override
	public void method8166(@OriginalArg(1) Class94 arg0) {
		@Pc(2) dxVertexLayout local2 = (dxVertexLayout) arg0;
		this.anIDirect3DDevice1.SetVertexDeclaration(local2.anIDirect3DVertexDeclaration1);
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(BZ)V")
	@Override
	public void method8169(@OriginalArg(1) boolean arg0) {
		this.anIDirect3DDevice1.a(161, arg0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLclient!km;I)V")
	@Override
	public void method8133(@OriginalArg(1) Interface15 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class74 local5 = (Class74) arg0;
		this.anIDirect3DDevice1.SetStreamSource(arg1, local5.anIDirect3DVertexBuffer1, 0, local5.method1657());
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8094(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		this.aClass391_1 = (Class391) arg1;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!cj;Lclient!cj;FLclient!cj;)Lclient!cj;")
	@Override
	public Class57 method8055(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIILclient!fga;ILclient!ra;)V")
	@Override
	public void method8109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class115 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface22 arg5) {
		this.anIDirect3DDevice1.SetIndices(((Class329) arg5).anIDirect3DIndexBuffer1);
		this.anIDirect3DDevice1.DrawIndexedPrimitive(Static602.method8214(arg3), 0, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8048(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8010(arg2, arg3);
	}

	@OriginalMember(owner = "client!uda", name = "w", descriptor = "()V")
	@Override
	public void method8058() {
		@Pc(3) IDirect3DEventQuery local3 = this.anIDirect3DDevice1.c();
		if (pda.a(local3.Issue(), 17527)) {
			while (true) {
				@Pc(11) int local11 = local3.IsSignaled();
				if (local11 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		local3.a(true);
	}

	@OriginalMember(owner = "client!uda", name = "r", descriptor = "(B)V")
	@Override
	protected void method8188() {
		this.anIDirect3DDevice1.a(137, this.aBoolean699 && !this.aBoolean688);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;I)V")
	public void method8222(@OriginalArg(0) IDirect3DPixelShader arg0) {
		this.anIDirect3DDevice1.SetPixelShader(arg0);
	}
}
