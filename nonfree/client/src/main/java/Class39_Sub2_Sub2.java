import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class39_Sub2_Sub2 extends Class39_Sub2 {

	@OriginalMember(owner = "client!qba", name = "ji", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!qba", name = "Wg", descriptor = "Lclient!rk;")
	private final Class249 aClass249_50 = new Class249();

	@OriginalMember(owner = "client!qba", name = "Dh", descriptor = "Lclient!rk;")
	private final Class249 aClass249_51 = new Class249();

	@OriginalMember(owner = "client!qba", name = "Ph", descriptor = "Lclient!rk;")
	private final Class249 aClass249_52 = new Class249();

	@OriginalMember(owner = "client!qba", name = "bi", descriptor = "Lclient!rk;")
	private final Class249 aClass249_53 = new Class249();

	@OriginalMember(owner = "client!qba", name = "fi", descriptor = "Lclient!rk;")
	private final Class249 aClass249_54 = new Class249();

	@OriginalMember(owner = "client!qba", name = "gi", descriptor = "Lclient!rk;")
	private final Class249 aClass249_55 = new Class249();

	@OriginalMember(owner = "client!qba", name = "hi", descriptor = "Lclient!rk;")
	private final Class249 aClass249_56 = new Class249();

	@OriginalMember(owner = "client!qba", name = "ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!qba", name = "ki", descriptor = "I")
	private final int anInt7395 = 0;

	@OriginalMember(owner = "client!qba", name = "mi", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!qba", name = "Gg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!qba", name = "oi", descriptor = "Ljava/lang/String;")
	private final String aString148;

	@OriginalMember(owner = "client!qba", name = "pi", descriptor = "Ljava/lang/String;")
	private final String aString149;

	@OriginalMember(owner = "client!qba", name = "ri", descriptor = "I")
	private final int anInt7397;

	@OriginalMember(owner = "client!qba", name = "ui", descriptor = "Z")
	public boolean aBoolean555;

	@OriginalMember(owner = "client!qba", name = "qi", descriptor = "Z")
	private boolean aBoolean553;

	@OriginalMember(owner = "client!qba", name = "si", descriptor = "Z")
	private final boolean aBoolean554;

	@OriginalMember(owner = "client!qba", name = "ni", descriptor = "Z")
	public final boolean aBoolean552;

	@OriginalMember(owner = "client!qba", name = "li", descriptor = "I")
	public final int anInt7396;

	@OriginalMember(owner = "client!qba", name = "ti", descriptor = "[I")
	public final int[] anIntArray570;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!n;Lclient!dda;I)V")
	public Class39_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface12 arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString148 = OpenGL.glGetString(7936).toLowerCase();
			this.aString149 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString148.indexOf("microsoft") != -1 || this.aString148.indexOf("brian paul") != -1 || this.aString148.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(103) String local103 = OpenGL.glGetString(7938);
			@Pc(111) String[] local111 = Static225.method3542(' ', local103.replace('.', ' '));
			if (local111.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(127) int local127;
			try {
				@Pc(121) int local121 = Static359.method5799(local111[0]);
				local127 = Static359.method5799(local111[1]);
				this.anInt7397 = local121 * 10 + local127;
			} catch (@Pc(137) NumberFormatException local137) {
				throw new RuntimeException("");
			}
			if (this.anInt7397 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(179) int[] local179 = new int[1];
				OpenGL.glGetIntegerv(34018, local179, 0);
				super.anInt7291 = local179[0];
				if (super.anInt7291 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7279 = 8;
				this.aBoolean555 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean532 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean553 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean546 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean554 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean540 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean552 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anInt7396 = Stream.a() ? 33639 : 5121;
				if (this.aString149.indexOf("radeon") != -1) {
					local127 = 0;
					@Pc(274) boolean local274 = false;
					@Pc(276) boolean local276 = false;
					@Pc(285) String[] local285 = Static225.method3542(' ', this.aString149.replace('/', ' '));
					for (@Pc(287) int local287 = 0; local287 < local285.length; local287++) {
						@Pc(293) String local293 = local285[local287];
						try {
							if (local293.length() > 0) {
								if (local293.charAt(0) == 'x' && local293.length() >= 3 && Static9.method378(local293.substring(1, 3))) {
									local293 = local293.substring(1);
									local276 = true;
								}
								if (local293.equals("hd")) {
									local274 = true;
								} else {
									if (local293.startsWith("hd")) {
										local293 = local293.substring(2);
										local274 = true;
									}
									if (local293.length() >= 4 && Static9.method378(local293.substring(0, 4))) {
										local127 = Static359.method5799(local293.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(358) Exception local358) {
						}
					}
					if (!local276 && !local274) {
						if (local127 >= 7000 && local127 <= 7999) {
							this.aBoolean555 = false;
						}
						if (local127 >= 7000 && local127 <= 9250) {
							super.aBoolean540 = false;
						}
					}
					this.aBoolean553 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString148.indexOf("intel");
				if (this.aBoolean555) {
					try {
						@Pc(414) int[] local414 = new int[1];
						OpenGL.glGenBuffersARB(1, local414, 0);
					} catch (@Pc(420) Throwable local420) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray570 = new int[super.anInt7291];
				OpenGL.glClear(16640);
				this.anOpenGL2.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(439) Throwable local439) {
			local439.printStackTrace();
			this.method6055();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6188() {
		if (super.aBoolean531 && super.aBoolean541 && super.aBoolean533 | super.anInt7277 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "(I)V")
	@Override
	protected void method6138() {
		OpenGL.glScissor(super.anInt7296 + super.anInt7292, -super.anInt7293 + super.anInt7126 + super.anInt7282, -super.anInt7292 + super.anInt7300, super.anInt7293 + -super.anInt7286);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!tq;I)V")
	@Override
	public void method6095(@OriginalArg(0) int arg0, @OriginalArg(1) Interface19 arg1) {
	}

	@OriginalMember(owner = "client!qba", name = "x", descriptor = "(I)V")
	@Override
	protected void method6135() {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6154(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(11) Long local11 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local11);
	}

	@OriginalMember(owner = "client!qba", name = "I", descriptor = "(I)V")
	@Override
	protected void method6167() {
		for (@Pc(10) int local10 = super.anInt7291 - 1; local10 >= 0; local10--) {
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
		OpenGL.glDisable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(71) float[] local71 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(73) int local73 = 0; local73 < 8; local73++) {
			@Pc(79) int local79 = local73 + 16384;
			OpenGL.glLightfv(local79, 4608, local71, 0);
			OpenGL.glLightf(local79, 4615, 0.0F);
			OpenGL.glLightf(local79, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method6167();
	}

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "(B)F")
	@Override
	protected float method6130() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6008(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub32 local19;
		while (!this.aClass249_51.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_51.method6529();
			Static224.anIntArray408[local7++] = (int) local19.aLong241;
			super.anInt7272 -= local19.anInt5391;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static224.anIntArray408, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static224.anIntArray408, 0);
			local7 = 0;
		}
		while (!this.aClass249_52.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_52.method6529();
			Static224.anIntArray408[local7++] = (int) local19.aLong241;
			super.anInt7274 -= local19.anInt5391;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static224.anIntArray408, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static224.anIntArray408, 0);
			local7 = 0;
		}
		while (!this.aClass249_53.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_53.method6529();
			Static224.anIntArray408[local7++] = local19.anInt5391;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static224.anIntArray408, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static224.anIntArray408, 0);
			local7 = 0;
		}
		while (!this.aClass249_54.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_54.method6529();
			Static224.anIntArray408[local7++] = (int) local19.aLong241;
			super.anInt7273 -= local19.anInt5391;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static224.anIntArray408, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static224.anIntArray408, 0);
		}
		while (!this.aClass249_50.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_50.method6529();
			OpenGL.glDeleteLists((int) local19.aLong241, local19.anInt5391);
		}
		@Pc(213) Class2 local213;
		while (!this.aClass249_55.method6519()) {
			local213 = this.aClass249_55.method6529();
			OpenGL.glDeleteProgramARB((int) local213.aLong241);
		}
		while (!this.aClass249_56.method6519()) {
			local213 = this.aClass249_56.method6529();
			OpenGL.glDeleteObjectARB(local213.aLong241);
		}
		while (!this.aClass249_50.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_50.method6529();
			OpenGL.glDeleteLists((int) local19.aLong241, local19.anInt5391);
		}
		if (this.U() > 100663296 && Static143.method2502() > this.aLong174 + 60000L) {
			System.gc();
			this.aLong174 = Static143.method2502();
		}
		super.method6008(local11);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6110(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qba", name = "B", descriptor = "(I)V")
	@Override
	protected void method6149() {
		@Pc(9) int local9 = this.anIntArray570[super.anInt7278];
		if (local9 != 0) {
			this.anIntArray570[super.anInt7278] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!qba", name = "s", descriptor = "(I)V")
	@Override
	protected void method6120() {
		OpenGL.glTexEnvi(8960, 34161, Static522.method7566(super.aClass165Array6[super.anInt7278]));
	}

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "()V")
	@Override
	public void method6034() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!qba", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!lh;Lclient!lh;FLclient!lh;)Lclient!lh;")
	@Override
	public Class58 method6045(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class58 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(ZI)Lclient!g;")
	@Override
	public Interface7 method6204(@OriginalArg(0) boolean arg0) {
		return new Class122_Sub2(this, Static268.aClass171_11, arg0);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6144(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "(I)V")
	@Override
	protected void method6101() {
		OpenGL.glMatrixMode(5890);
		if (Static376.aClass224_4 == super.aClass224Array3[super.anInt7278]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass181_Sub2Array3[super.anInt7278].method5389(Static461.aFloatArray69), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "()Z")
	@Override
	public boolean method6025() {
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "()V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I[IIIZBI)Lclient!hc;")
	@Override
	public Interface8 method6180(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean554 || Static150.method2607(arg2) && Static150.method2607(arg3)) {
			return new Class144_Sub3(this, arg2, arg3, arg4, arg1, 0, arg0);
		} else if (this.aBoolean553) {
			return new Class144_Sub2(this, arg2, arg3, arg1, 0, arg0);
		} else {
			@Pc(42) Class144_Sub3 local42 = new Class144_Sub3(this, Static51.aClass150_1, Static268.aClass171_10, Static131.method2413(arg2), Static131.method2413(arg3));
			local42.method5779(0, arg3, arg1, arg0, 0, arg2);
			return local42;
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6104(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "(B)V")
	@Override
	protected void method6165() {
		OpenGL.glViewport(super.anInt7296, super.anInt7282, super.anInt7145, super.anInt7126);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!vs;)V")
	@Override
	public void method6200(@OriginalArg(1) Class304 arg0) {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6132(@OriginalArg(1) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL2.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!qba", name = "P", descriptor = "(I)V")
	@Override
	protected void method6177() {
		Static254.aFloatArray24[3] = (float) (super.anInt7281 >>> 24) / 255.0F;
		Static254.aFloatArray24[1] = (float) (super.anInt7281 & 0xFF00) / 65280.0F;
		Static254.aFloatArray24[0] = (float) (super.anInt7281 & 0xFF0000) / 1.671168E7F;
		Static254.aFloatArray24[2] = (float) (super.anInt7281 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static254.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "()V")
	@Override
	public void method6062() {
		if (super.anInt7145 <= 0 && super.anInt7126 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt7292;
		@Pc(19) int local19 = super.anInt7300;
		@Pc(22) int local22 = super.anInt7286;
		@Pc(25) int local25 = super.anInt7293;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6107();
		this.method6102(false);
		this.method6139(false);
		this.method6187(false);
		this.method6171(false);
		this.method6179(null);
		this.method6208(false, -2, false);
		this.method6164(1);
		this.method6088(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7145, super.anInt7126, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!jt;[BIIB)Lclient!pl;")
	@Override
	public Interface15 method6137(@OriginalArg(1) Class150 arg0, @OriginalArg(2) byte[] arg1) {
		return new Class144_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZLclient!g;ILclient!ud;III)V")
	@Override
	public void method6215(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class281 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (Static160.aClass281_2 == arg2) {
			local20 = arg3 * 2;
			local16 = 1;
		} else if (Static290.aClass281_4 == arg2) {
			local16 = 3;
			local20 = arg3 + 1;
		} else if (arg2 == Static514.aClass281_6) {
			local16 = 4;
			local20 = arg3 * 3;
		} else if (arg2 == Static24.aClass281_1) {
			local20 = arg3 + 2;
			local16 = 6;
		} else if (Static421.aClass281_5 == arg2) {
			local20 = arg3 + 2;
			local16 = 5;
		} else {
			local20 = arg3;
			local16 = 0;
		}
		@Pc(68) Class171 local68 = arg0.method6955();
		@Pc(71) Class122_Sub2 local71 = (Class122_Sub2) arg0;
		local71.method6943();
		OpenGL.glDrawElements(local16, local20, Static375.method5912(local68), local71.method6942() + (long) (local68.anInt4927 * arg1));
	}

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "(I)V")
	@Override
	protected void method6121() {
		this.method6219();
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!hba;IZIZ)V")
	@Override
	public void method6119(@OriginalArg(0) Class111 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static119.method2307(arg0));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IZ[[II)Lclient!df;")
	@Override
	public Interface4 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class144_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZLclient!lc;Lclient!jt;)Z")
	@Override
	public boolean method6103(@OriginalArg(1) Class171 arg0, @OriginalArg(2) Class150 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7126 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt7396, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
	@Override
	protected void method6086() {
		OpenGL.glTexEnvi(8960, 34162, Static522.method7566(super.aClass165Array5[super.anInt7278]));
	}

	@OriginalMember(owner = "client!qba", name = "q", descriptor = "()Z")
	@Override
	public boolean method6043() {
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "A", descriptor = "(B)V")
	@Override
	protected void method6216() {
		Static254.aFloatArray24[1] = super.aFloat191 * super.aFloat189;
		Static254.aFloatArray24[3] = 1.0F;
		Static254.aFloatArray24[0] = super.aFloat188 * super.aFloat189;
		Static254.aFloatArray24[2] = super.aFloat194 * super.aFloat189;
		OpenGL.glLightModelfv(2899, Static254.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!ud;II)V")
	@Override
	public void method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2) {
		@Pc(18) byte local18;
		@Pc(16) int local16;
		if (arg1 == Static160.aClass281_2) {
			local16 = arg2 * 2;
			local18 = 1;
		} else if (arg1 == Static290.aClass281_4) {
			local18 = 3;
			local16 = arg2 + 1;
		} else if (Static514.aClass281_6 == arg1) {
			local18 = 4;
			local16 = arg2 * 3;
		} else if (Static24.aClass281_1 == arg1) {
			local16 = arg2 + 2;
			local18 = 6;
		} else if (arg1 == Static421.aClass281_5) {
			local18 = 5;
			local16 = arg2 + 2;
		} else {
			local18 = 0;
			local16 = arg2;
		}
		OpenGL.glDrawArrays(local18, arg0, local16);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(BZ)V")
	@Override
	public void method6124(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "()Lclient!rr;")
	@Override
	public Class254 method6009() {
		@Pc(7) int local7 = -1;
		if (this.aString148.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString148.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString148.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class254(local7, "OpenGL", this.anInt7397, this.aString149, 0L);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIZI[FILclient!jt;)Lclient!hc;")
	@Override
	protected Interface8 method6199(@OriginalArg(3) boolean arg0, @OriginalArg(4) int arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class150 arg4) {
		if (this.aBoolean554 || Static150.method2607(arg1) && Static150.method2607(arg3)) {
			return new Class144_Sub3(this, arg4, arg1, arg3, arg0, arg2, 0, 0);
		} else if (this.aBoolean553) {
			return new Class144_Sub2(this, arg4, arg1, arg3, arg2, 0, 0);
		} else {
			@Pc(59) Class144_Sub3 local59 = new Class144_Sub3(this, arg4, Static268.aClass171_14, Static131.method2413(arg1), Static131.method2413(arg3));
			local59.method5784(arg3, arg1, arg4, arg2);
			return local59;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!lc;Lclient!jt;II)Lclient!hc;")
	@Override
	public Interface8 method6122(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class150 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean554 || Static150.method2607(arg0) && Static150.method2607(arg3)) {
			return new Class144_Sub3(this, arg2, arg1, arg0, arg3);
		} else if (this.aBoolean553) {
			return new Class144_Sub2(this, arg2, arg1, arg0, arg3);
		} else {
			return new Class144_Sub3(this, arg2, arg1, Static131.method2413(arg0), Static131.method2413(arg3));
		}
	}

	@OriginalMember(owner = "client!qba", name = "E", descriptor = "(I)V")
	@Override
	public void method6155() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray61, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray57, 0);
	}

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "(I)V")
	@Override
	protected void method6117() {
		OpenGL.glDepthMask(super.aBoolean543 && super.aBoolean545);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6064(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6034();
	}

	@OriginalMember(owner = "client!qba", name = "q", descriptor = "(B)V")
	@Override
	protected void method6163() {
		if (super.aBoolean550) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
	@Override
	public void method6010(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!lc;BLclient!jt;)Z")
	@Override
	public boolean method6186(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class150 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([Lclient!uq;B)Lclient!vs;")
	@Override
	public Class304 method6090(@OriginalArg(0) Class287[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qba", name = "o", descriptor = "(I)V")
	@Override
	protected void method6112() {
		this.method6219();
	}

	@OriginalMember(owner = "client!qba", name = "Y", descriptor = "(I)V")
	private void method6219() {
		if (this.aBoolean551) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass184_10.method4615()) {
			if (!this.aBoolean551) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass181_Sub2_18.method5389(Static461.aFloatArray69), 0);
				this.method6155();
				this.method6170();
				this.aBoolean551 = true;
			}
			if (this.aBoolean551) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean530) {
				OpenGL.glMultMatrixf(super.aClass181_Sub2_15.method5389(Static461.aFloatArray69), 0);
				return;
			}
		} else if (super.aBoolean530) {
			OpenGL.glLoadIdentity();
			this.aBoolean551 = false;
			return;
		} else {
			OpenGL.glLoadMatrixf(super.aClass181_Sub2_15.method5389(Static461.aFloatArray69), 0);
			this.aBoolean551 = false;
		}
	}

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "()V")
	@Override
	protected void method6055() {
		super.method6055();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!wo;I)V")
	@Override
	public void method6189(@OriginalArg(0) Class316 arg0) {
		if (arg0 == Static139.aClass316_1) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(21) int local21 = Static3.method263(arg0);
		OpenGL.glTexGeni(8192, 9472, local21);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local21);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local21);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!qba", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt7395;
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(B)V")
	@Override
	protected void method6096() {
		if (super.aBoolean538 && !super.aBoolean535) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "()V")
	@Override
	public void method6031() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZZ)Lclient!tq;")
	@Override
	public Interface19 method6100(@OriginalArg(0) boolean arg0) {
		return new Class122_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!qba", name = "K", descriptor = "(I)V")
	@Override
	protected void method6172() {
		if (super.aBoolean537) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "(I)V")
	@Override
	protected void method6098() {
		if (Static146.aClass223_2 == super.aClass223_7) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static8.aClass223_1 == super.aClass223_7) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass223_7 == Static251.aClass223_3) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6143() {
		Static254.aFloatArray24[1] = super.aFloat191 * super.aFloat200;
		Static254.aFloatArray24[0] = super.aFloat188 * super.aFloat200;
		Static254.aFloatArray24[2] = super.aFloat200 * super.aFloat194;
		Static254.aFloatArray24[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static254.aFloatArray24, 0);
		Static254.aFloatArray24[1] = -super.aFloat192 * super.aFloat191;
		Static254.aFloatArray24[3] = 1.0F;
		Static254.aFloatArray24[2] = -super.aFloat192 * super.aFloat194;
		Static254.aFloatArray24[0] = -super.aFloat192 * super.aFloat188;
		OpenGL.glLightfv(16385, 4609, Static254.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!qba", name = "y", descriptor = "(B)V")
	@Override
	protected void method6197() {
		@Pc(50) int local50;
		if (super.aBoolean533) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local50 = super.anInt7302;
		} else {
			super.aFloat196 = super.anInt7298 - super.anInt7308;
			super.aFloat202 = super.aFloat196 - (float) super.anInt7277;
			if ((float) super.anInt7288 > super.aFloat202) {
				super.aFloat202 = super.anInt7288;
			}
			OpenGL.glFogf(2915, super.aFloat202);
			OpenGL.glFogf(2916, super.aFloat196);
			local50 = super.anInt7301;
		}
		Static254.aFloatArray24[1] = (float) (local50 & 0xFF00) / 65280.0F;
		Static254.aFloatArray24[2] = (float) (local50 & 0xFF) / 255.0F;
		Static254.aFloatArray24[0] = (float) (local50 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static254.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZLclient!hba;)V")
	@Override
	protected void method6097(@OriginalArg(1) int arg0, @OriginalArg(3) Class111 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static119.method2307(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6185() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray63, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BI)V")
	public synchronized void method6223(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong241 = arg0;
		this.aClass249_55.method6523(local7);
	}

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(B)V")
	@Override
	protected void method6099() {
		if (super.aBoolean549) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "()V")
	@Override
	public void method6056() {
		this.method6171(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!qba", name = "B", descriptor = "()V")
	@Override
	public void method6076() {
	}

	@OriginalMember(owner = "client!qba", name = "T", descriptor = "(I)V")
	@Override
	protected void method6207() {
		if (super.aBoolean548) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIZLclient!jt;I[BZ)Lclient!hc;")
	@Override
	protected Interface8 method6105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class150 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean554 || Static150.method2607(arg1) && Static150.method2607(arg0)) {
			return new Class144_Sub3(this, arg2, arg1, arg0, arg4, arg3, 0, 0);
		} else if (this.aBoolean553) {
			return new Class144_Sub2(this, arg2, arg1, arg0, arg3, 0, 0);
		} else {
			@Pc(62) Class144_Sub3 local62 = new Class144_Sub3(this, arg2, Static268.aClass171_10, Static131.method2413(arg1), Static131.method2413(arg0));
			local62.method5776(arg2, arg3, arg0, 0, arg1);
			return local62;
		}
	}

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "(III)V")
	public synchronized void method6224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub32 local8 = new Class2_Sub32(arg1);
		local8.aLong241 = arg0;
		this.aClass249_52.method6523(local8);
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(II)Lclient!eba;")
	@Override
	protected Class5 method6084(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class5_Sub3(this, super.aClass53_111);
		} else if (arg0 == 4) {
			return new Class5_Sub2(this, super.aClass53_111, super.aClass284_6);
		} else {
			return super.method6084(arg0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "(III)V")
	public synchronized void method6225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub32 local14 = new Class2_Sub32(arg1);
		local14.aLong241 = arg0;
		this.aClass249_51.method6523(local14);
	}

	@OriginalMember(owner = "client!qba", name = "J", descriptor = "(I)V")
	@Override
	protected void method6170() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt7303 > local7; local7++) {
			@Pc(14) Class2_Sub5 local14 = super.aClass2_Sub5Array6[local7];
			@Pc(18) int local18 = local14.method1669();
			@Pc(22) int local22 = local7 + 16386;
			@Pc(30) float local30 = local14.method1665() / 255.0F;
			Static254.aFloatArray24[0] = local14.method1672();
			Static254.aFloatArray24[1] = local14.method1671();
			Static254.aFloatArray24[2] = local14.method1662();
			Static254.aFloatArray24[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static254.aFloatArray24, 0);
			Static254.aFloatArray24[0] = (float) (local18 >> 16 & 0xFF) * local30;
			Static254.aFloatArray24[2] = local30 * (float) (local18 & 0xFF);
			Static254.aFloatArray24[3] = 1.0F;
			Static254.aFloatArray24[1] = local30 * (float) (local18 >> 8 & 0xFF);
			OpenGL.glLightfv(local22, 4609, Static254.aFloatArray24, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method1666() * local14.method1666()));
			OpenGL.glEnable(local22);
		}
		while (local7 < super.anInt7290) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method6170();
	}

	@OriginalMember(owner = "client!qba", name = "y", descriptor = "(I)V")
	@Override
	protected void method6136() {
		OpenGL.glActiveTexture(super.anInt7278 + 33984);
	}

	@OriginalMember(owner = "client!qba", name = "X", descriptor = "(I)V")
	@Override
	protected void method6218() {
		if (super.aBoolean536) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}
}
