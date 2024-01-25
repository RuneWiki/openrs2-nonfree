import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class43_Sub1_Sub2 extends Class43_Sub1 {

	@OriginalMember(owner = "client!jq", name = "oi", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!jq", name = "pi", descriptor = "Z")
	private boolean aBoolean376;

	@OriginalMember(owner = "client!jq", name = "qi", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!jq", name = "ri", descriptor = "Z")
	private boolean aBoolean377;

	@OriginalMember(owner = "client!jq", name = "ti", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!jq", name = "ui", descriptor = "I")
	private int anInt4923;

	@OriginalMember(owner = "client!jq", name = "vi", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!jq", name = "jh", descriptor = "Lclient!hga;")
	private final Class130 aClass130_27 = new Class130();

	@OriginalMember(owner = "client!jq", name = "di", descriptor = "Lclient!hga;")
	private final Class130 aClass130_28 = new Class130();

	@OriginalMember(owner = "client!jq", name = "hi", descriptor = "Lclient!hga;")
	private final Class130 aClass130_29 = new Class130();

	@OriginalMember(owner = "client!jq", name = "ji", descriptor = "Lclient!hga;")
	private final Class130 aClass130_30 = new Class130();

	@OriginalMember(owner = "client!jq", name = "ki", descriptor = "Lclient!hga;")
	private final Class130 aClass130_31 = new Class130();

	@OriginalMember(owner = "client!jq", name = "li", descriptor = "Lclient!hga;")
	private final Class130 aClass130_32 = new Class130();

	@OriginalMember(owner = "client!jq", name = "mi", descriptor = "Lclient!hga;")
	private final Class130 aClass130_33 = new Class130();

	@OriginalMember(owner = "client!jq", name = "ni", descriptor = "[Lclient!ll;")
	private final Class64_Sub2[] aClass64_Sub2Array1 = new Class64_Sub2[16];

	@OriginalMember(owner = "client!jq", name = "si", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!jq", name = "wi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!jq", name = "Fi", descriptor = "I")
	private final int anInt4925 = 0;

	@OriginalMember(owner = "client!jq", name = "Nh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!jq", name = "Di", descriptor = "Ljava/lang/String;")
	private final String aString62;

	@OriginalMember(owner = "client!jq", name = "Gi", descriptor = "Ljava/lang/String;")
	private final String aString63;

	@OriginalMember(owner = "client!jq", name = "Ei", descriptor = "I")
	private final int anInt4924;

	@OriginalMember(owner = "client!jq", name = "Ci", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!jq", name = "yi", descriptor = "Z")
	private boolean aBoolean381;

	@OriginalMember(owner = "client!jq", name = "Ai", descriptor = "Z")
	private final boolean aBoolean382;

	@OriginalMember(owner = "client!jq", name = "xi", descriptor = "Z")
	public final boolean aBoolean380;

	@OriginalMember(owner = "client!jq", name = "Ii", descriptor = "Z")
	public final boolean aBoolean385;

	@OriginalMember(owner = "client!jq", name = "Bi", descriptor = "Z")
	public final boolean aBoolean383;

	@OriginalMember(owner = "client!jq", name = "zi", descriptor = "[I")
	public final int[] anIntArray374;

	@OriginalMember(owner = "client!jq", name = "Hi", descriptor = "I")
	public final int anInt4926;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!om;I)V")
	public Class43_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface8 arg3, @OriginalArg(4) Class246 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString62 = OpenGL.glGetString(7936).toLowerCase();
			this.aString63 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString62.indexOf("microsoft") != -1 || this.aString62.indexOf("brian paul") != -1 || this.aString62.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static583.method7710(' ', local109.replace('.', ' '));
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(140) int local140;
			try {
				@Pc(134) int local134 = Static118.method2472(local117[0]);
				local140 = Static118.method2472(local117[1]);
				this.anInt4924 = local134 * 10 + local140;
			} catch (@Pc(149) NumberFormatException local149) {
				throw new RuntimeException("");
			}
			if (this.anInt4924 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(188) int[] local188 = new int[1];
				OpenGL.glGetIntegerv(34018, local188, 0);
				super.anInt4834 = local188[0];
				if (super.anInt4834 < 2) {
					throw new RuntimeException("");
				}
				super.anInt4831 = 8;
				this.aBoolean384 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean358 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean381 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean356 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean382 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean366 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean380 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean385 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean383 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray374 = new int[super.anInt4834];
				this.anInt4926 = Stream.c() ? 33639 : 5121;
				if (this.aString63.indexOf("radeon") != -1) {
					local140 = 0;
					@Pc(293) boolean local293 = false;
					@Pc(295) boolean local295 = false;
					@Pc(304) String[] local304 = Static583.method7710(' ', this.aString63.replace('/', ' '));
					for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
						@Pc(312) String local312 = local304[local306];
						try {
							if (local312.length() > 0) {
								if (local312.charAt(0) == 'x' && local312.length() >= 3 && Static463.method6417(local312.substring(1, 3))) {
									local295 = true;
									local312 = local312.substring(1);
								}
								if (local312.equals("hd")) {
									local293 = true;
								} else {
									if (local312.startsWith("hd")) {
										local293 = true;
										local312 = local312.substring(2);
									}
									if (local312.length() >= 4 && Static463.method6417(local312.substring(0, 4))) {
										local140 = Static118.method2472(local312.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(375) Exception local375) {
						}
					}
					if (!local295 && !local293) {
						if (local140 >= 7000 && local140 <= 7999) {
							this.aBoolean384 = false;
						}
						if (local140 >= 7000 && local140 <= 9250) {
							super.aBoolean366 = false;
						}
					}
					this.aBoolean381 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString62.indexOf("intel");
				if (this.aBoolean384) {
					try {
						@Pc(429) int[] local429 = new int[1];
						OpenGL.glGenBuffersARB(1, local429, 0);
					} catch (@Pc(435) Throwable local435) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(441) Throwable local441) {
			local441.printStackTrace();
			this.method7165();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)V")
	@Override
	protected void method4167() {
		OpenGL.glScissor(super.anInt4833 + super.anInt4813, super.anInt4804 + super.anInt4635 - super.anInt4819, -super.anInt4813 + super.anInt4812, -super.anInt4825 + super.anInt4819);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!fda;[BIIII)Lclient!gv;")
	@Override
	public Interface9 method4192(@OriginalArg(0) Class93 arg0, @OriginalArg(1) byte[] arg1) {
		return new Class19_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(ZZ)V")
	@Override
	public void method4209(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z[[III)Lclient!pu;")
	@Override
	public Interface20 method4220(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ow;IZZI)V")
	@Override
	public void method4268(@OriginalArg(0) Class252 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static90.method2036(arg0));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "(I)F")
	@Override
	protected float method4212() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt4635 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt4926, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!jq", name = "T", descriptor = "(I)V")
	private void method4304() {
		if (this.aBoolean376) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass240_4.method5517()) {
			if (!this.aBoolean377) {
				OpenGL.glLoadMatrixf(super.aClass109_Sub3_18.method7122(Static159.aFloatArray15), 0);
				this.aBoolean377 = true;
				this.method4218();
				this.method4300();
			}
			if (super.aBoolean353) {
				this.aBoolean376 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass109_Sub3_15.method7122(Static159.aFloatArray15), 0);
				this.aBoolean376 = true;
			}
		} else if (super.aBoolean353) {
			OpenGL.glLoadIdentity();
			this.aBoolean376 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass109_Sub3_15.method7122(Static159.aFloatArray15), 0);
			this.aBoolean376 = false;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ro;Lclient!fda;B)Z")
	@Override
	public boolean method4180(@OriginalArg(0) Class292 arg0, @OriginalArg(1) Class93 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!jq", name = "Q", descriptor = "(I)V")
	@Override
	protected void method4283() {
		OpenGL.glMatrixMode(5890);
		if (Static515.aClass174_18 == super.aClass174Array3[super.anInt4829]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass109_Sub3Array3[super.anInt4829].method7122(Static159.aFloatArray15), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "(B)V")
	@Override
	public void method4218() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray28, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(ZZ)Lclient!wl;")
	@Override
	public Interface24 method4188(@OriginalArg(1) boolean arg0) {
		return new Class64_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "(I)V")
	@Override
	protected void method4227() {
		for (@Pc(10) int local10 = super.anInt4834 - 1; local10 >= 0; local10--) {
			OpenGL.glActiveTexture(local10 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(78) float[] local78 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(80) int local80 = 0; local80 < 8; local80++) {
			@Pc(87) int local87 = local80 + 16384;
			OpenGL.glLightfv(local87, 4608, local78, 0);
			OpenGL.glLightf(local87, 4615, 0.0F);
			OpenGL.glLightf(local87, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method4227();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method4202(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!jq", name = "R", descriptor = "(I)V")
	@Override
	protected void method4291() {
		OpenGL.glDepthMask(super.aBoolean372 && super.aBoolean369);
	}

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "(I)V")
	@Override
	protected void method4230() {
		if (super.aBoolean367) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "()V")
	@Override
	public void method7154() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BJ)V")
	public synchronized void method4305(@OriginalArg(1) long arg0) {
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong273 = arg0;
		this.aClass130_33.method3548(local15);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method4204(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!sh;)V")
	@Override
	public void method4297(@OriginalArg(1) Class307 arg0) {
		if (Static54.aClass307_2 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static369.method5493(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!tf;III)V")
	@Override
	public void method4294(@OriginalArg(0) Class319 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte local14;
		@Pc(18) int local18;
		if (arg0 == Static305.aClass319_5) {
			local14 = 1;
			local18 = arg2 * 2;
		} else if (Static380.aClass319_6 == arg0) {
			local18 = arg2 + 1;
			local14 = 3;
		} else if (arg0 == Static534.aClass319_7) {
			local18 = arg2 * 3;
			local14 = 4;
		} else if (arg0 == Static129.aClass319_2) {
			local18 = arg2 + 2;
			local14 = 6;
		} else if (arg0 == Static94.aClass319_1) {
			local14 = 5;
			local18 = arg2 + 2;
		} else {
			local18 = arg2;
			local14 = 0;
		}
		OpenGL.glDrawArrays(local14, arg1, local18);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBZLclient!ow;)V")
	@Override
	protected void method4260(@OriginalArg(0) int arg0, @OriginalArg(3) Class252 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static90.method2036(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIZ[II)Lclient!hi;")
	@Override
	public Interface10 method4239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean382 || Static159.method2855(arg2) && Static159.method2855(arg1)) {
			return new Class19_Sub1(this, arg2, arg1, arg3, arg4, 0, arg0);
		} else if (this.aBoolean381) {
			return new Class19_Sub3(this, arg2, arg1, arg4, 0, arg0);
		} else {
			@Pc(37) Class19_Sub1 local37 = new Class19_Sub1(this, Static581.aClass93_14, Static461.aClass292_14, Static114.method2375(arg2), Static114.method2375(arg1));
			local37.method6169(0, arg4, arg0, arg2, 0, arg1);
			return local37;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!kr;)V")
	@Override
	public void method4196(@OriginalArg(1) Class48 arg0) {
		@Pc(9) Class289[] local9 = ((Class48_Sub1) arg0).aClass289Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local9.length; local23++) {
			@Pc(29) Class289 local29 = local9[local23];
			@Pc(34) Class64_Sub2 local34 = this.aClass64_Sub2Array1[local23];
			@Pc(36) int local36 = 0;
			@Pc(40) int local40 = local34.method4804();
			@Pc(44) long local44 = local34.method4799();
			local34.method4798();
			for (@Pc(49) int local49 = 0; local49 < local29.method6372(); local49++) {
				@Pc(56) Class68 local56 = local29.method6371(local49);
				if (local56 == Static100.aClass68_1) {
					OpenGL.glVertexPointer(3, 5126, local40, local44 + (long) local36);
					local21 = true;
				} else if (local56 == Static100.aClass68_2) {
					local19 = true;
					OpenGL.glNormalPointer(5126, local40, (long) local36 + local44);
				} else if (local56 == Static100.aClass68_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local40, local44 + (long) local36);
				} else if (Static100.aClass68_4 == local56) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static100.aClass68_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static100.aClass68_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local40, (long) local36 + local44);
				} else if (local56 == Static100.aClass68_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local40, local44 + (long) local36);
				}
				local36 += local56.anInt2406;
			}
		}
		if (this.aBoolean375 != local21) {
			if (local21) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean375 = local21;
		}
		if (this.aBoolean378 != local19) {
			if (local19) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean378 = local19;
		}
		if (this.aBoolean379 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean379 = local13;
		}
		@Pc(257) int local257;
		if (this.anInt4923 < local11) {
			for (local257 = this.anInt4923; local257 < local11; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt4923 = local11;
		} else if (this.anInt4923 > local11) {
			for (local257 = local11; local257 < this.anInt4923; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt4923 = local11;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[FZIIILclient!fda;I)Lclient!hi;")
	@Override
	protected Interface10 method4229(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(6) Class93 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean382 || Static159.method2855(arg0) && Static159.method2855(arg4)) {
			return new Class19_Sub1(this, arg3, arg0, arg4, arg2, arg1, 0, 0);
		} else if (this.aBoolean381) {
			return new Class19_Sub3(this, arg3, arg0, arg4, arg1, 0, 0);
		} else {
			@Pc(52) Class19_Sub1 local52 = new Class19_Sub1(this, arg3, Static461.aClass292_18, Static114.method2375(arg0), Static114.method2375(arg4));
			local52.method5273(arg4, arg0, arg1, arg3);
			return local52;
		}
	}

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "()V")
	@Override
	protected void method7165() {
		super.method7165();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7215(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub4 local19;
		while (!this.aClass130_28.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_28.method3545();
			Static408.anIntArray550[local11++] = (int) local19.aLong273;
			super.anInt4795 -= local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static408.anIntArray550, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static408.anIntArray550, 0);
			local11 = 0;
		}
		while (!this.aClass130_29.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_29.method3545();
			Static408.anIntArray550[local11++] = (int) local19.aLong273;
			super.anInt4791 -= local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static408.anIntArray550, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static408.anIntArray550, 0);
			local11 = 0;
		}
		while (!this.aClass130_30.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_30.method3545();
			Static408.anIntArray550[local11++] = local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static408.anIntArray550, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static408.anIntArray550, 0);
			local11 = 0;
		}
		while (!this.aClass130_31.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_31.method3545();
			Static408.anIntArray550[local11++] = (int) local19.aLong273;
			super.anInt4797 -= local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static408.anIntArray550, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static408.anIntArray550, 0);
		}
		while (!this.aClass130_27.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_27.method3545();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt109);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass130_32.method3542()) {
			local215 = this.aClass130_32.method3545();
			OpenGL.glDeleteProgramARB((int) local215.aLong273);
		}
		while (!this.aClass130_33.method3542()) {
			local215 = this.aClass130_33.method3545();
			OpenGL.glDeleteObjectARB(local215.aLong273);
		}
		while (!this.aClass130_27.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_27.method3545();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt109);
		}
		if (this.b() > 100663296 && this.aLong137 + 60000L < Static587.method7753()) {
			System.gc();
			this.aLong137 = Static587.method7753();
		}
		super.method7215(local9);
	}

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "(I)V")
	@Override
	protected void method4175() {
		this.aBoolean377 = false;
		this.method4304();
	}

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "()V")
	@Override
	public void method7204() {
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(Z)V")
	@Override
	protected void method4219() {
		if (super.aBoolean360) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "(B)V")
	@Override
	protected void method4201() {
		if (super.aBoolean364 && super.aBoolean362 && super.anInt4832 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "()Z")
	@Override
	public boolean method7180() {
		return false;
	}

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "(B)V")
	@Override
	protected void method4223() {
		Static225.aFloatArray26[1] = super.aFloat98 * super.aFloat105;
		Static225.aFloatArray26[2] = super.aFloat93 * super.aFloat105;
		Static225.aFloatArray26[3] = 1.0F;
		Static225.aFloatArray26[0] = super.aFloat100 * super.aFloat105;
		OpenGL.glLightfv(16384, 4609, Static225.aFloatArray26, 0);
		Static225.aFloatArray26[2] = -super.aFloat102 * super.aFloat93;
		Static225.aFloatArray26[3] = 1.0F;
		Static225.aFloatArray26[0] = super.aFloat100 * -super.aFloat102;
		Static225.aFloatArray26[1] = super.aFloat98 * -super.aFloat102;
		OpenGL.glLightfv(16385, 4609, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4198(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(II)Lclient!ne;")
	@Override
	protected Class12 method4252(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class12_Sub5(this, super.aClass246_123);
		} else if (arg0 == 4) {
			return new Class12_Sub4(this, super.aClass246_123, super.lb);
		} else if (arg0 == 8) {
			return new Class12_Sub7(this, super.aClass246_123, super.lb);
		} else {
			return super.method4252(arg0);
		}
	}

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "()Z")
	@Override
	public boolean method7216() {
		return false;
	}

	@OriginalMember(owner = "client!jq", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "(I)V")
	@Override
	protected void method4240() {
		OpenGL.glTexEnvi(8960, 34161, Static77.method1712(super.aClass37Array3[super.anInt4829]));
	}

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "()V")
	@Override
	public void method7171() {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Lclient!ro;Lclient!fda;B)Z")
	@Override
	public boolean method4286(@OriginalArg(0) Class292 arg0, @OriginalArg(1) Class93 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!tf;IIIIILclient!or;)V")
	@Override
	public void method4232(@OriginalArg(0) Class319 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface17 arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg0 == Static305.aClass319_5) {
			local10 = 1;
			local14 = arg4 * 2;
		} else if (Static380.aClass319_6 == arg0) {
			local14 = arg4 + 1;
			local10 = 3;
		} else if (Static534.aClass319_7 == arg0) {
			local14 = arg4 * 3;
			local10 = 4;
		} else if (arg0 == Static129.aClass319_2) {
			local14 = arg4 + 2;
			local10 = 6;
		} else if (arg0 == Static94.aClass319_1) {
			local10 = 5;
			local14 = arg4 + 2;
		} else {
			local10 = 0;
			local14 = arg4;
		}
		@Pc(68) Class292 local68 = arg5.method6940();
		@Pc(71) Class64_Sub1 local71 = (Class64_Sub1) arg5;
		local71.method4798();
		OpenGL.glDrawElements(local10, local14, Static425.method6052(local68), local71.method4799() + (long) (local68.anInt7532 * arg3));
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILclient!wl;)V")
	@Override
	public void method4181(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1) {
		this.aClass64_Sub2Array1[arg0] = (Class64_Sub2) arg1;
	}

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "()V")
	@Override
	public void method7177() {
		if (super.anInt4728 <= 0 && super.anInt4635 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt4813;
		@Pc(19) int local19 = super.anInt4812;
		@Pc(22) int local22 = super.anInt4825;
		@Pc(25) int local25 = super.anInt4819;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4228();
		this.method4193(false);
		this.method4301(false);
		this.method4261(false);
		this.method4278(false);
		this.method4298(null);
		this.method4237(-2, false, false);
		this.method4183(1);
		this.method4273(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt4728, super.anInt4635, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4255(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local10)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "(Z)V")
	@Override
	protected void method4300() {
		this.method4263();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt4836; local10++) {
			@Pc(17) Class3_Sub22 local17 = super.aClass3_Sub22Array3[local10];
			@Pc(21) int local21 = local17.method6724();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method6732() / 255.0F;
			Static225.aFloatArray26[0] = local17.method6731();
			Static225.aFloatArray26[1] = local17.method6728();
			Static225.aFloatArray26[2] = local17.method6725();
			Static225.aFloatArray26[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static225.aFloatArray26, 0);
			Static225.aFloatArray26[2] = (float) (local21 & 0xFF) * local31;
			Static225.aFloatArray26[3] = 1.0F;
			Static225.aFloatArray26[1] = (float) (local21 >> 8 & 0xFF) * local31;
			Static225.aFloatArray26[0] = (float) (local21 >> 16 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static225.aFloatArray26, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method6729() * local17.method6729()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt4828) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method4300();
	}

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "()Lclient!mp;")
	@Override
	public Class216 method7186() {
		@Pc(7) int local7 = -1;
		if (this.aString62.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString62.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString62.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class216(local7, "OpenGL", this.anInt4924, this.aString63, 0L);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7190(@OriginalArg(0) Class46 arg0) {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(ZI)Lclient!or;")
	@Override
	public Interface17 method4258(@OriginalArg(0) boolean arg0) {
		return new Class64_Sub1(this, Static461.aClass292_15, arg0);
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(B)V")
	@Override
	protected void method4178() {
		@Pc(14) int local14 = this.anIntArray374[super.anInt4829];
		if (local14 != 0) {
			this.anIntArray374[super.anInt4829] = 0;
			OpenGL.glBindTexture(local14, 0);
			OpenGL.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[Lclient!rk;)Lclient!kr;")
	@Override
	public Class48 method4290(@OriginalArg(1) Class289[] arg0) {
		return new Class48_Sub1(arg0);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(III)V")
	public synchronized void method4306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub4 local12 = new Class3_Sub4(arg0);
		local12.aLong273 = arg1;
		this.aClass130_28.method3548(local12);
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(Z)V")
	@Override
	protected void method4199() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray33, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(III)V")
	public synchronized void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg1);
		local8.aLong273 = arg0;
		this.aClass130_29.method3548(local8);
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(B)V")
	@Override
	protected void method4182() {
		if (super.aBoolean355) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "()V")
	@Override
	public void method7152() {
	}

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "(B)V")
	@Override
	protected void method4224() {
		if (super.aBoolean374) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "(I)V")
	@Override
	protected void method4234() {
		if (super.aBoolean368 && !super.aBoolean363) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(BI)V")
	@Override
	public void method4289(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "(B)V")
	@Override
	protected void method4246() {
		if (super.aBoolean365) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "(I)V")
	@Override
	protected void method4245() {
		OpenGL.glActiveTexture(super.anInt4829 + 33984);
	}

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "(I)V")
	@Override
	protected void method4186() {
		Static225.aFloatArray26[3] = 1.0F;
		Static225.aFloatArray26[1] = super.aFloat98 * super.aFloat97;
		Static225.aFloatArray26[2] = super.aFloat97 * super.aFloat93;
		Static225.aFloatArray26[0] = super.aFloat100 * super.aFloat97;
		OpenGL.glLightModelfv(2899, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4243() {
		super.aFloat106 = super.anInt4807 - super.anInt4802;
		super.aFloat94 = super.aFloat106 - (float) super.anInt4832;
		if (super.aFloat94 < (float) super.anInt4814) {
			super.aFloat94 = super.anInt4814;
		}
		OpenGL.glFogf(2915, super.aFloat94);
		OpenGL.glFogf(2916, super.aFloat106);
		Static225.aFloatArray26[0] = (float) (super.anInt4820 & 0xFF0000) / 1.671168E7F;
		Static225.aFloatArray26[2] = (float) (super.anInt4820 & 0xFF) / 255.0F;
		Static225.aFloatArray26[1] = (float) (super.anInt4820 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "(B)V")
	@Override
	protected void method4217() {
		this.method4304();
	}

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "(I)V")
	@Override
	protected void method4213() {
		OpenGL.glViewport(super.anInt4833, super.anInt4804, super.anInt4728, super.anInt4635);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7207(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7197();
	}

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "(I)V")
	@Override
	protected void method4200() {
		Static225.aFloatArray26[0] = (float) (super.anInt4822 & 0xFF0000) / 1.671168E7F;
		Static225.aFloatArray26[2] = (float) (super.anInt4822 & 0xFF) / 255.0F;
		Static225.aFloatArray26[1] = (float) (super.anInt4822 & 0xFF00) / 65280.0F;
		Static225.aFloatArray26[3] = (float) (super.anInt4822 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!jq", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt4925;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4189() {
		if (Static246.aClass285_4 == super.aClass285_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass285_5 == Static488.aClass285_7) {
			OpenGL.glBlendFunc(1, 1);
			return;
		} else if (Static474.aClass285_6 == super.aClass285_5) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(BI)V")
	public synchronized void method4310(@OriginalArg(1) int arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong273 = arg0;
		this.aClass130_32.method3548(local11);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILclient!fda;Z[BBI)Lclient!hi;")
	@Override
	protected Interface10 method4169(@OriginalArg(1) int arg0, @OriginalArg(3) Class93 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean382 || Static159.method2855(arg4) && Static159.method2855(arg0)) {
			return new Class19_Sub1(this, arg1, arg4, arg0, arg2, arg3, 0, 0);
		} else if (this.aBoolean381) {
			return new Class19_Sub3(this, arg1, arg4, arg0, arg3, 0, 0);
		} else {
			@Pc(59) Class19_Sub1 local59 = new Class19_Sub1(this, arg1, Static461.aClass292_14, Static114.method2375(arg4), Static114.method2375(arg0));
			local59.method6173(arg1, arg0, 0, arg3, arg4);
			return local59;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!fda;Lclient!ro;II)Lclient!hi;")
	@Override
	public Interface10 method4214(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class292 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean382 || Static159.method2855(arg2) && Static159.method2855(arg3)) {
			return new Class19_Sub1(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean381) {
			return new Class19_Sub3(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class19_Sub1(this, arg0, arg1, Static114.method2375(arg2), Static114.method2375(arg3));
		}
	}

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "(I)V")
	@Override
	protected void method4177() {
	}

	@OriginalMember(owner = "client!jq", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4278(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "()V")
	@Override
	public void method7197() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "(B)V")
	@Override
	protected void method4194() {
		OpenGL.glTexEnvi(8960, 34162, Static77.method1712(super.bf[super.anInt4829]));
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!js;Lclient!js;FLclient!js;)Lclient!js;")
	@Override
	public Class55 method7167(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class55 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}
}
