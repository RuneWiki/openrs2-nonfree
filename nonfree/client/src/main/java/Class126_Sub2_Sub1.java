import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class126_Sub2_Sub1 extends Class126_Sub2 {

	@OriginalMember(owner = "client!laa", name = "xi", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!laa", name = "zi", descriptor = "Z")
	private boolean aBoolean454;

	@OriginalMember(owner = "client!laa", name = "Bi", descriptor = "Z")
	private boolean aBoolean455;

	@OriginalMember(owner = "client!laa", name = "Ci", descriptor = "Z")
	private boolean aBoolean456;

	@OriginalMember(owner = "client!laa", name = "Di", descriptor = "Z")
	private boolean aBoolean457;

	@OriginalMember(owner = "client!laa", name = "Ei", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!laa", name = "Fi", descriptor = "I")
	private int anInt5451;

	@OriginalMember(owner = "client!laa", name = "Wh", descriptor = "Lclient!ro;")
	private final Class306 aClass306_22 = new Class306();

	@OriginalMember(owner = "client!laa", name = "li", descriptor = "Lclient!ro;")
	private final Class306 aClass306_23 = new Class306();

	@OriginalMember(owner = "client!laa", name = "oi", descriptor = "Lclient!ro;")
	private final Class306 aClass306_24 = new Class306();

	@OriginalMember(owner = "client!laa", name = "ti", descriptor = "Lclient!ro;")
	private final Class306 aClass306_25 = new Class306();

	@OriginalMember(owner = "client!laa", name = "ui", descriptor = "Lclient!ro;")
	private final Class306 aClass306_26 = new Class306();

	@OriginalMember(owner = "client!laa", name = "vi", descriptor = "Lclient!ro;")
	private final Class306 aClass306_27 = new Class306();

	@OriginalMember(owner = "client!laa", name = "wi", descriptor = "Lclient!ro;")
	private final Class306 aClass306_28 = new Class306();

	@OriginalMember(owner = "client!laa", name = "Ai", descriptor = "[Lclient!gt;")
	private final Class132_Sub1[] aClass132_Sub1Array1 = new Class132_Sub1[16];

	@OriginalMember(owner = "client!laa", name = "yi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!laa", name = "Gi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!laa", name = "Ri", descriptor = "I")
	private final int anInt5454 = 0;

	@OriginalMember(owner = "client!laa", name = "Sg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!laa", name = "Si", descriptor = "Ljava/lang/String;")
	private final String aString80;

	@OriginalMember(owner = "client!laa", name = "Ni", descriptor = "Ljava/lang/String;")
	private final String aString79;

	@OriginalMember(owner = "client!laa", name = "Li", descriptor = "I")
	private final int anInt5453;

	@OriginalMember(owner = "client!laa", name = "Ii", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!laa", name = "Qi", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!laa", name = "Oi", descriptor = "Z")
	private final boolean aBoolean462;

	@OriginalMember(owner = "client!laa", name = "Mi", descriptor = "Z")
	public final boolean aBoolean461;

	@OriginalMember(owner = "client!laa", name = "Ki", descriptor = "Z")
	public final boolean aBoolean460;

	@OriginalMember(owner = "client!laa", name = "Ji", descriptor = "Z")
	public final boolean aBoolean459;

	@OriginalMember(owner = "client!laa", name = "Pi", descriptor = "[I")
	public final int[] anIntArray393;

	@OriginalMember(owner = "client!laa", name = "Hi", descriptor = "I")
	public final int anInt5452;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!wu;I)V")
	public Class126_Sub2_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface8 arg3, @OriginalArg(4) Class384 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString80 = OpenGL.glGetString(7936).toLowerCase();
			this.aString79 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString80.indexOf("microsoft") != -1 || this.aString80.indexOf("brian paul") != -1 || this.aString80.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(110) String local110 = OpenGL.glGetString(7938);
			@Pc(118) String[] local118 = Static132.method1987(local110.replace('.', ' '), ' ');
			if (local118.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(136) int local136;
			try {
				@Pc(130) int local130 = Static443.method6588(local118[0]);
				local136 = Static443.method6588(local118[1]);
				this.anInt5453 = local136 + local130 * 10;
			} catch (@Pc(145) NumberFormatException local145) {
				throw new RuntimeException("");
			}
			if (this.anInt5453 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(187) int[] local187 = new int[1];
				OpenGL.glGetIntegerv(34018, local187, 0);
				super.anInt6284 = local187[0];
				if (super.anInt6284 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6266 = 8;
				this.aBoolean458 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean507 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean463 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean522 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean462 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean520 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean461 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean460 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean459 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray393 = new int[super.anInt6284];
				this.anInt5452 = Stream.b() ? 33639 : 5121;
				if (this.aString79.indexOf("radeon") != -1) {
					local136 = 0;
					@Pc(291) boolean local291 = false;
					@Pc(293) boolean local293 = false;
					@Pc(302) String[] local302 = Static132.method1987(this.aString79.replace('/', ' '), ' ');
					for (@Pc(304) int local304 = 0; local304 < local302.length; local304++) {
						@Pc(310) String local310 = local302[local304];
						try {
							if (local310.length() > 0) {
								if (local310.charAt(0) == 'x' && local310.length() >= 3 && Static515.method7420(local310.substring(1, 3))) {
									local310 = local310.substring(1);
									local293 = true;
								}
								if (local310.equals("hd")) {
									local291 = true;
								} else {
									if (local310.startsWith("hd")) {
										local291 = true;
										local310 = local310.substring(2);
									}
									if (local310.length() >= 4 && Static515.method7420(local310.substring(0, 4))) {
										local136 = Static443.method6588(local310.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(375) Exception local375) {
						}
					}
					if (!local293 && !local291) {
						if (local136 >= 7000 && local136 <= 9250) {
							super.aBoolean520 = false;
						}
						if (local136 >= 7000 && local136 <= 7999) {
							this.aBoolean458 = false;
						}
					}
					this.aBoolean463 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString80.indexOf("intel");
				if (this.aBoolean458) {
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
			this.method7044();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "()Z")
	@Override
	public boolean method7025() {
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ns;Lclient!qda;I)Z")
	@Override
	public boolean method5564(@OriginalArg(0) Class247 arg0, @OriginalArg(1) Class281 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)V")
	public synchronized void method4914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg0);
		local8.aLong282 = (long) arg1;
		this.aClass306_24.method7303(local8);
	}

	@OriginalMember(owner = "client!laa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5470(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method5448(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!ns;Lclient!qda;)Z")
	@Override
	public boolean method5453(@OriginalArg(1) Class247 arg0, @OriginalArg(2) Class281 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!laa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6075 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt5452, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)V")
	@Override
	protected void method5474() {
		Static357.aFloatArray44[0] = (float) (super.anInt6272 & 0xFF0000) / 1.671168E7F;
		Static357.aFloatArray44[3] = (float) (super.anInt6272 >>> 24) / 255.0F;
		Static357.aFloatArray44[1] = (float) (super.anInt6272 & 0xFF00) / 65280.0F;
		Static357.aFloatArray44[2] = (float) (super.anInt6272 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static357.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!laa", name = "M", descriptor = "(I)V")
	@Override
	protected void method5533() {
		for (@Pc(6) int local6 = super.anInt6284 - 1; local6 >= 0; local6--) {
			OpenGL.glActiveTexture(local6 + 33984);
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
		@Pc(82) float[] local82 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(84) int local84 = 0; local84 < 8; local84++) {
			@Pc(90) int local90 = local84 + 16384;
			OpenGL.glLightfv(local90, 4608, local82, 0);
			OpenGL.glLightf(local90, 4615, 0.0F);
			OpenGL.glLightf(local90, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method5533();
	}

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "(I)V")
	@Override
	public synchronized void method7053(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class5_Sub41 local19;
		while (!this.aClass306_23.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_23.method7302();
			Static646.anIntArray842[local11++] = (int) local19.aLong282;
			super.anInt6247 -= local19.anInt7411;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static646.anIntArray842, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static646.anIntArray842, 0);
			local11 = 0;
		}
		while (!this.aClass306_24.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_24.method7302();
			Static646.anIntArray842[local11++] = (int) local19.aLong282;
			super.anInt6245 -= local19.anInt7411;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static646.anIntArray842, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static646.anIntArray842, 0);
			local11 = 0;
		}
		while (!this.aClass306_25.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_25.method7302();
			Static646.anIntArray842[local11++] = local19.anInt7411;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static646.anIntArray842, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static646.anIntArray842, 0);
			local11 = 0;
		}
		while (!this.aClass306_26.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_26.method7302();
			Static646.anIntArray842[local11++] = (int) local19.aLong282;
			super.anInt6244 -= local19.anInt7411;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static646.anIntArray842, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static646.anIntArray842, 0);
		}
		while (!this.aClass306_22.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_22.method7302();
			OpenGL.glDeleteLists((int) local19.aLong282, local19.anInt7411);
		}
		@Pc(214) Class5 local214;
		while (!this.aClass306_27.method7309()) {
			local214 = this.aClass306_27.method7302();
			OpenGL.glDeleteProgramARB((int) local214.aLong282);
		}
		while (!this.aClass306_28.method7309()) {
			local214 = this.aClass306_28.method7302();
			OpenGL.glDeleteObjectARB(local214.aLong282);
		}
		while (!this.aClass306_22.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_22.method7302();
			OpenGL.glDeleteLists((int) local19.aLong282, local19.anInt7411);
		}
		if (this.E() > 100663296 && Static205.method3179() > this.aLong157 + 60000L) {
			System.gc();
			this.aLong157 = Static205.method3179();
		}
		super.method7053(local9);
	}

	@OriginalMember(owner = "client!laa", name = "z", descriptor = "()V")
	@Override
	public void method7061() {
	}

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "(I)V")
	@Override
	protected void method5463() {
		if (super.aBoolean514) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(II)Lclient!mj;")
	@Override
	public Interface15 method6995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "(Z)V")
	@Override
	protected void method5569() {
		this.method4918();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7014(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7031(arg2, arg3);
	}

	@OriginalMember(owner = "client!laa", name = "Y", descriptor = "(I)V")
	@Override
	protected void method5561() {
		super.aFloat123 = (float) (-super.anInt6280 + super.anInt6256);
		super.aFloat120 = (float) -super.anInt6255 + super.aFloat123;
		if ((float) super.anInt6259 > super.aFloat120) {
			super.aFloat120 = (float) super.anInt6259;
		}
		OpenGL.glFogf(2915, super.aFloat120);
		OpenGL.glFogf(2916, super.aFloat123);
		Static357.aFloatArray44[0] = (float) (super.anInt6277 & 0xFF0000) / 1.671168E7F;
		Static357.aFloatArray44[1] = (float) (super.anInt6277 & 0xFF00) / 65280.0F;
		Static357.aFloatArray44[2] = (float) (super.anInt6277 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static357.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!laa", name = "Q", descriptor = "(I)V")
	@Override
	protected void method5546() {
		if (super.aBoolean524) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5520(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!laa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(II)V")
	@Override
	public void method7031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!laa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt5454;
	}

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "(B)V")
	@Override
	protected void method5517() {
		Static357.aFloatArray44[1] = super.aFloat131 * super.aFloat129;
		Static357.aFloatArray44[0] = super.aFloat131 * super.aFloat122;
		Static357.aFloatArray44[2] = super.aFloat131 * super.aFloat126;
		Static357.aFloatArray44[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static357.aFloatArray44, 0);
		Static357.aFloatArray44[0] = -super.aFloat132 * super.aFloat122;
		Static357.aFloatArray44[3] = 1.0F;
		Static357.aFloatArray44[2] = -super.aFloat132 * super.aFloat126;
		Static357.aFloatArray44[1] = super.aFloat129 * -super.aFloat132;
		OpenGL.glLightfv(16385, 4609, Static357.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(B)V")
	@Override
	protected void method5460() {
		if (super.aBoolean510) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIZLclient!qda;IIB[F)Lclient!tr;")
	@Override
	protected Interface25 method5464(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class281 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean462 || Static586.method8223(arg3) && Static586.method8223(arg0)) {
			return new Class48_Sub1(this, arg2, arg3, arg0, arg1, arg4, 0, 0);
		} else if (this.aBoolean463) {
			return new Class48_Sub4(this, arg2, arg3, arg0, arg4, 0, 0);
		} else {
			@Pc(61) Class48_Sub1 local61 = new Class48_Sub1(this, arg2, Static385.aClass247_18, Static522.method6795(arg3), Static522.method6795(arg0));
			local61.method1071(arg4, arg2, arg0, arg3);
			return local61;
		}
	}

	@OriginalMember(owner = "client!laa", name = "u", descriptor = "()V")
	@Override
	public void method7038() {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B[Lclient!lm;)Lclient!ld;")
	@Override
	public Class203 method5525(@OriginalArg(1) Class212[] arg0) {
		return new Class203_Sub1(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "(B)V")
	@Override
	protected void method5565() {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5543(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZIILclient!qt;)V")
	@Override
	protected void method5450(@OriginalArg(1) int arg0, @OriginalArg(3) Class294 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static595.method8339(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!rh;Lclient!aw;IIIII)V")
	@Override
	public void method5526(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(27) byte local27;
		@Pc(31) int local31;
		if (arg1 == Static179.aClass23_5) {
			local31 = arg2 * 2;
			local27 = 1;
		} else if (Static360.aClass23_6 == arg1) {
			local27 = 3;
			local31 = arg2 + 1;
		} else if (arg1 == Static370.aClass23_7) {
			local27 = 4;
			local31 = arg2 * 3;
		} else if (Static28.aClass23_1 == arg1) {
			local27 = 6;
			local31 = arg2 + 2;
		} else if (arg1 == Static99.aClass23_2) {
			local31 = arg2 + 2;
			local27 = 5;
		} else {
			local27 = 0;
			local31 = arg2;
		}
		@Pc(82) Class247 local82 = arg0.method5733();
		@Pc(85) Class132_Sub2 local85 = (Class132_Sub2) arg0;
		local85.method5109();
		OpenGL.glDrawElements(local27, local31, Static602.method8407(local82), local85.method5105() + (long) (local82.anInt6763 * arg3));
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(III)V")
	public synchronized void method4915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg1);
		local8.aLong282 = (long) arg0;
		this.aClass306_23.method7303(local8);
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "()Lclient!kea;")
	@Override
	public Class185 method6980() {
		@Pc(7) int local7 = -1;
		if (this.aString80.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString80.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString80.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class185(local7, "OpenGL", this.anInt5453, this.aString79, 0L);
	}

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "(B)V")
	@Override
	protected void method5559() {
		OpenGL.glActiveTexture(super.anInt6274 + 33984);
	}

	@OriginalMember(owner = "client!laa", name = "w", descriptor = "(I)V")
	@Override
	protected void method5489() {
		OpenGL.glViewport(super.anInt6281, super.anInt6289, super.anInt6105, super.anInt6075);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method5521(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(16) Long local16 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local16);
	}

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "(B)V")
	@Override
	protected void method5535() {
		this.aBoolean457 = false;
		this.method4918();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILclient!am;)V")
	@Override
	public void method5451(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		this.aClass132_Sub1Array1[arg0] = (Class132_Sub1) arg1;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!tea;Lclient!tea;FLclient!tea;)Lclient!tea;")
	@Override
	public Class91 method7003(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(IZ)Lclient!rh;")
	@Override
	public Interface21 method5444(@OriginalArg(1) boolean arg0) {
		return new Class132_Sub2(this, Static385.aClass247_15, arg0);
	}

	@OriginalMember(owner = "client!laa", name = "o", descriptor = "(Z)V")
	@Override
	protected void method5568() {
		OpenGL.glScissor(super.anInt6275 + super.anInt6281, -super.anInt6253 + (super.anInt6289 - -super.anInt6075), super.anInt6258 - super.anInt6275, -super.anInt6278 + super.anInt6253);
	}

	@OriginalMember(owner = "client!laa", name = "w", descriptor = "()V")
	@Override
	public void method7052() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!laa", name = "y", descriptor = "(I)V")
	@Override
	protected void method5495() {
		OpenGL.glDepthMask(super.aBoolean511 && super.aBoolean515);
	}

	@OriginalMember(owner = "client!laa", name = "C", descriptor = "(I)V")
	@Override
	protected void method5502() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass52Array3[super.anInt6274] == Static583.aClass52_6) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass117_Sub2Array3[super.anInt6274].method3881(Static557.aFloatArray71), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "()V")
	@Override
	public void method7008() {
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(BI)V")
	@Override
	public void method5541(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[IIZIII)Lclient!tr;")
	@Override
	public Interface25 method5476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean462 || Static586.method8223(arg2) && Static586.method8223(arg5)) {
			return new Class48_Sub1(this, arg2, arg5, arg3, arg1, 0, arg4);
		} else if (this.aBoolean463) {
			return new Class48_Sub4(this, arg2, arg5, arg1, 0, arg4);
		} else {
			@Pc(46) Class48_Sub1 local46 = new Class48_Sub1(this, Static208.aClass281_10, Static385.aClass247_14, Static522.method6795(arg2), Static522.method6795(arg5));
			local46.method7625(0, arg4, 0, arg2, arg1, arg5);
			return local46;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!aw;III)V")
	@Override
	public void method5454(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) byte local23;
		@Pc(21) int local21;
		if (arg0 == Static179.aClass23_5) {
			local21 = arg1 * 2;
			local23 = 1;
		} else if (arg0 == Static360.aClass23_6) {
			local23 = 3;
			local21 = arg1 + 1;
		} else if (Static370.aClass23_7 == arg0) {
			local23 = 4;
			local21 = arg1 * 3;
		} else if (arg0 == Static28.aClass23_1) {
			local23 = 6;
			local21 = arg1 + 2;
		} else if (Static99.aClass23_2 == arg0) {
			local23 = 5;
			local21 = arg1 + 2;
		} else {
			local23 = 0;
			local21 = arg1;
		}
		OpenGL.glDrawArrays(local23, arg2, local21);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!laa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "(IZ)V")
	public synchronized void method4916(@OriginalArg(0) int arg0) {
		@Pc(13) Class5 local13 = new Class5();
		local13.aLong282 = (long) arg0;
		this.aClass306_27.method7303(local13);
	}

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "(I)F")
	@Override
	protected float method5479() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "(I)V")
	@Override
	protected void method5459() {
		this.method5523();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt6265; local10++) {
			@Pc(17) Class5_Sub27 local17 = super.aClass5_Sub27Array4[local10];
			@Pc(21) int local21 = local17.method6336();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method6331() / 255.0F;
			Static357.aFloatArray44[0] = (float) local17.method6330();
			Static357.aFloatArray44[1] = (float) local17.method6334();
			Static357.aFloatArray44[2] = (float) local17.method6335();
			Static357.aFloatArray44[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static357.aFloatArray44, 0);
			Static357.aFloatArray44[0] = local31 * (float) (local21 >> 16 & 0xFF);
			Static357.aFloatArray44[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static357.aFloatArray44[2] = (float) (local21 & 0xFF) * local31;
			Static357.aFloatArray44[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, Static357.aFloatArray44, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method6338() * local17.method6338()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt6282 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method5459();
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)V")
	@Override
	protected void method5457() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray40, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!laa", name = "v", descriptor = "(B)V")
	@Override
	protected void method5571() {
		OpenGL.glTexEnvi(8960, 34162, Static87.method1368(super.aClass10Array6[super.anInt6274]));
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5467() {
		if (super.aBoolean512) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!qda;IILclient!ns;)Lclient!tr;")
	@Override
	public Interface25 method5487(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class247 arg3) {
		if (this.aBoolean462 || Static586.method8223(arg2) && Static586.method8223(arg0)) {
			return new Class48_Sub1(this, arg1, arg3, arg2, arg0);
		} else if (this.aBoolean463) {
			return new Class48_Sub4(this, arg1, arg3, arg2, arg0);
		} else {
			return new Class48_Sub1(this, arg1, arg3, Static522.method6795(arg2), Static522.method6795(arg0));
		}
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(IZ)Lclient!am;")
	@Override
	public Interface1 method5530(@OriginalArg(1) boolean arg0) {
		return new Class132_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BZ[[II)Lclient!np;")
	@Override
	public Interface18 method5458(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class48_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "()V")
	@Override
	protected void method7024() {
		super.method7024();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)V")
	@Override
	protected void method5441() {
		if (super.aBoolean513 && super.aBoolean521 && super.anInt6255 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BJ)V")
	public synchronized void method4917(@OriginalArg(1) long arg0) {
		@Pc(13) Class5 local13 = new Class5();
		local13.aLong282 = arg0;
		this.aClass306_28.method7303(local13);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II[BLclient!qda;II)Lclient!op;")
	@Override
	public Interface19 method5531(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class281 arg1) {
		return new Class48_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!ku;)V")
	@Override
	public void method5519(@OriginalArg(1) Class199 arg0) {
		if (Static372.aClass199_3 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(10) int local10 = Static252.method3907(arg0);
		OpenGL.glTexGeni(8192, 9472, local10);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local10);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local10);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6983(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5527(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!nc;)V")
	@Override
	public void method7013(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "()V")
	@Override
	public void method7004() {
		if (super.anInt6105 <= 0 && super.anInt6075 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt6275;
		@Pc(19) int local19 = super.anInt6258;
		@Pc(22) int local22 = super.anInt6278;
		@Pc(25) int local25 = super.anInt6253;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5518();
		this.method5514(false);
		this.method5443(false);
		this.method5549(false);
		this.method5470(false);
		this.method5449((Interface27) null);
		this.method5482(-2, false, false);
		this.method5513(1);
		this.method5462(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6105, super.anInt6075, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "(Z)V")
	@Override
	protected void method5558() {
		if (Static577.aClass27_8 == super.aClass27_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass27_4 == Static569.aClass27_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static572.aClass27_7 == super.aClass27_4) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "(B)V")
	@Override
	protected void method5491() {
		if (super.aBoolean523 && !super.aBoolean517) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Lclient!bba;")
	@Override
	public Interface3 method6978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILclient!qt;ZZ)V")
	@Override
	public void method5537(@OriginalArg(1) int arg0, @OriginalArg(2) Class294 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static595.method8339(arg1));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "(Z)V")
	@Override
	protected void method5480() {
		Static357.aFloatArray44[1] = super.aFloat119 * super.aFloat129;
		Static357.aFloatArray44[0] = super.aFloat122 * super.aFloat119;
		Static357.aFloatArray44[3] = 1.0F;
		Static357.aFloatArray44[2] = super.aFloat126 * super.aFloat119;
		OpenGL.glLightModelfv(2899, Static357.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!laa", name = "U", descriptor = "(I)V")
	@Override
	protected void method5552() {
		@Pc(9) int local9 = this.anIntArray393[super.anInt6274];
		if (local9 != 0) {
			this.anIntArray393[super.anInt6274] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "(II)Lclient!ul;")
	@Override
	protected Class108 method5461(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class108_Sub7(this, super.aClass384_91);
		} else if (arg0 == 4) {
			return new Class108_Sub9(this, super.aClass384_91, super.aClass373_5);
		} else if (arg0 == 8) {
			return new Class108_Sub8(this, super.aClass384_91, super.aClass373_5);
		} else {
			return super.method5461(arg0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "y", descriptor = "()Z")
	@Override
	public boolean method7055() {
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ld;B)V")
	@Override
	public void method5524(@OriginalArg(0) Class203 arg0) {
		@Pc(9) Class212[] local9 = ((Class203_Sub1) arg0).aClass212Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class212 local31 = local9[local25];
			@Pc(36) Class132_Sub1 local36 = this.aClass132_Sub1Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method3115();
			@Pc(46) long local46 = local36.method5105();
			local36.method5109();
			for (@Pc(51) int local51 = 0; local31.method5123() > local51; local51++) {
				@Pc(60) Class106 local60 = local31.method5125(local51);
				if (Static150.aClass106_1 == local60) {
					local23 = true;
					OpenGL.glVertexPointer(3, 5126, local42, (long) local38 + local46);
				} else if (Static150.aClass106_2 == local60) {
					local21 = true;
					OpenGL.glNormalPointer(5126, local42, (long) local38 + local46);
				} else if (Static150.aClass106_3 == local60) {
					OpenGL.glColorPointer(4, 5121, local42, (long) local38 + local46);
					local13 = true;
				} else if (Static150.aClass106_4 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local46 + (long) local38);
				} else if (Static150.aClass106_5 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, (long) local38 + local46);
				} else if (Static150.aClass106_6 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, (long) local38 + local46);
				} else if (local60 == Static150.aClass106_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, local46 + (long) local38);
				}
				local38 += local60.anInt2396;
			}
		}
		if (local23 != this.aBoolean456) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean456 = local23;
		}
		if (this.aBoolean454 != local21) {
			if (local21) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean454 = local21;
		}
		if (this.aBoolean455 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean455 = local13;
		}
		@Pc(262) int local262;
		if (local11 > this.anInt5451) {
			for (local262 = this.anInt5451; local262 < local11; local262++) {
				OpenGL.glClientActiveTexture(local262 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt5451 = local11;
		} else if (local11 < this.anInt5451) {
			for (local262 = local11; local262 < this.anInt5451; local262++) {
				OpenGL.glClientActiveTexture(local262 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt5451 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!laa", name = "T", descriptor = "(I)V")
	@Override
	protected void method5550() {
		if (super.aBoolean518) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!mj;Lclient!bba;)Lclient!nc;")
	@Override
	public Interface16 method7029(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) Interface3 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZII[BLclient!qda;II)Lclient!tr;")
	@Override
	protected Interface25 method5516(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class281 arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean462 || Static586.method8223(arg1) && Static586.method8223(arg4)) {
			return new Class48_Sub1(this, arg3, arg1, arg4, arg0, arg2, 0, 0);
		} else if (this.aBoolean463) {
			return new Class48_Sub4(this, arg3, arg1, arg4, arg2, 0, 0);
		} else {
			@Pc(46) Class48_Sub1 local46 = new Class48_Sub1(this, arg3, Static385.aClass247_14, Static522.method6795(arg1), Static522.method6795(arg4));
			local46.method7628(0, arg3, arg1, arg4, arg2);
			return local46;
		}
	}

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "(B)V")
	@Override
	public void method5485() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray37, 0);
		OpenGL.glLightfv(16385, 4611, super.bf, 0);
	}

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "(Z)V")
	private void method4918() {
		if (this.aBoolean453) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass49_3.method1074()) {
			if (!this.aBoolean457) {
				OpenGL.glLoadMatrixf(super.aClass117_Sub2_18.method3881(Static557.aFloatArray71), 0);
				this.aBoolean457 = true;
				this.method5485();
				this.method5459();
			}
			if (super.aBoolean503) {
				this.aBoolean453 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass117_Sub2_15.method3881(Static557.aFloatArray71), 0);
				this.aBoolean453 = true;
			}
		} else if (super.aBoolean503) {
			OpenGL.glLoadIdentity();
			this.aBoolean453 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass117_Sub2_15.method3881(Static557.aFloatArray71), 0);
			this.aBoolean453 = false;
		}
	}

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "(Z)V")
	@Override
	protected void method5557() {
		OpenGL.glTexEnvi(8960, 34161, Static87.method1368(super.aClass10Array5[super.anInt6274]));
	}
}
