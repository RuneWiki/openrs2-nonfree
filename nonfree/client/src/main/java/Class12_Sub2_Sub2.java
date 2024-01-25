import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!qi", name = "pi", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!qi", name = "ri", descriptor = "I")
	private int anInt7641;

	@OriginalMember(owner = "client!qi", name = "si", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!qi", name = "ti", descriptor = "J")
	private long aLong333;

	@OriginalMember(owner = "client!qi", name = "ui", descriptor = "Z")
	private boolean aBoolean551;

	@OriginalMember(owner = "client!qi", name = "vi", descriptor = "Z")
	private boolean aBoolean552;

	@OriginalMember(owner = "client!qi", name = "wi", descriptor = "Z")
	private boolean aBoolean553;

	@OriginalMember(owner = "client!qi", name = "xh", descriptor = "Lclient!wo;")
	private final Class361 aClass361_81 = new Class361();

	@OriginalMember(owner = "client!qi", name = "Nh", descriptor = "Lclient!wo;")
	private final Class361 aClass361_82 = new Class361();

	@OriginalMember(owner = "client!qi", name = "fi", descriptor = "Lclient!wo;")
	private final Class361 aClass361_83 = new Class361();

	@OriginalMember(owner = "client!qi", name = "ki", descriptor = "Lclient!wo;")
	private final Class361 aClass361_84 = new Class361();

	@OriginalMember(owner = "client!qi", name = "li", descriptor = "Lclient!wo;")
	private final Class361 aClass361_85 = new Class361();

	@OriginalMember(owner = "client!qi", name = "mi", descriptor = "Lclient!wo;")
	private final Class361 aClass361_86 = new Class361();

	@OriginalMember(owner = "client!qi", name = "ni", descriptor = "Lclient!wo;")
	private final Class361 aClass361_87 = new Class361();

	@OriginalMember(owner = "client!qi", name = "oi", descriptor = "[Lclient!ku;")
	private final Class58_Sub1[] aClass58_Sub1Array1 = new Class58_Sub1[16];

	@OriginalMember(owner = "client!qi", name = "qi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!qi", name = "xi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!qi", name = "Bi", descriptor = "I")
	private final int anInt7643 = 0;

	@OriginalMember(owner = "client!qi", name = "vh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!qi", name = "Ji", descriptor = "Ljava/lang/String;")
	private final String aString79;

	@OriginalMember(owner = "client!qi", name = "Di", descriptor = "Ljava/lang/String;")
	private final String aString78;

	@OriginalMember(owner = "client!qi", name = "Ci", descriptor = "I")
	private final int anInt7644;

	@OriginalMember(owner = "client!qi", name = "Ei", descriptor = "Z")
	public boolean aBoolean556;

	@OriginalMember(owner = "client!qi", name = "yi", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!qi", name = "zi", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!qi", name = "Fi", descriptor = "Z")
	public final boolean aBoolean557;

	@OriginalMember(owner = "client!qi", name = "Ii", descriptor = "Z")
	public final boolean aBoolean559;

	@OriginalMember(owner = "client!qi", name = "Gi", descriptor = "Z")
	public final boolean aBoolean558;

	@OriginalMember(owner = "client!qi", name = "Hi", descriptor = "[I")
	public final int[] anIntArray503;

	@OriginalMember(owner = "client!qi", name = "Ai", descriptor = "I")
	public final int anInt7642;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!ga;I)V")
	public Class12_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(4) Class111 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString79 = OpenGL.glGetString(7936).toLowerCase();
			this.aString78 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString79.indexOf("microsoft") != -1 || this.aString79.indexOf("brian paul") != -1 || this.aString79.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static46.method1116(' ', local108.replace('.', ' '));
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(132) int local132;
			try {
				@Pc(126) int local126 = Static480.method6741(local116[0]);
				local132 = Static480.method6741(local116[1]);
				this.anInt7644 = local132 + local126 * 10;
			} catch (@Pc(141) NumberFormatException local141) {
				throw new RuntimeException("");
			}
			if (this.anInt7644 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(183) int[] local183 = new int[1];
				OpenGL.glGetIntegerv(34018, local183, 0);
				super.anInt7533 = local183[0];
				if (super.anInt7533 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7534 = 8;
				this.aBoolean556 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean536 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean554 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean537 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean555 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean544 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean557 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean559 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean558 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray503 = new int[super.anInt7533];
				this.anInt7642 = Stream.c() ? 33639 : 5121;
				if (this.aString78.indexOf("radeon") != -1) {
					local132 = 0;
					@Pc(285) boolean local285 = false;
					@Pc(287) boolean local287 = false;
					@Pc(296) String[] local296 = Static46.method1116(' ', this.aString78.replace('/', ' '));
					for (@Pc(298) int local298 = 0; local298 < local296.length; local298++) {
						@Pc(304) String local304 = local296[local298];
						try {
							if (local304.length() > 0) {
								if (local304.charAt(0) == 'x' && local304.length() >= 3 && Static88.method1743(local304.substring(1, 3))) {
									local304 = local304.substring(1);
									local287 = true;
								}
								if (local304.equals("hd")) {
									local285 = true;
								} else {
									if (local304.startsWith("hd")) {
										local285 = true;
										local304 = local304.substring(2);
									}
									if (local304.length() >= 4 && Static88.method1743(local304.substring(0, 4))) {
										local132 = Static480.method6741(local304.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(369) Exception local369) {
						}
					}
					if (!local287 && !local285) {
						if (local132 >= 7000 && local132 <= 9250) {
							super.aBoolean544 = false;
						}
						if (local132 >= 7000 && local132 <= 7999) {
							this.aBoolean556 = false;
						}
					}
					this.aBoolean554 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString79.indexOf("intel");
				if (this.aBoolean556) {
					try {
						@Pc(419) int[] local419 = new int[1];
						OpenGL.glGenBuffersARB(1, local419, 0);
					} catch (@Pc(425) Throwable local425) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(431) Throwable local431) {
			local431.printStackTrace();
			this.method6414();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ed;IZZ)V")
	@Override
	public void method6280(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static588.method7845(arg1));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "(B)V")
	@Override
	protected void method6268() {
		@Pc(13) int local13 = this.anIntArray503[super.anInt7547];
		if (local13 != 0) {
			this.anIntArray503[super.anInt7547] = 0;
			OpenGL.glBindTexture(local13, 0);
			OpenGL.glDisable(local13);
		}
	}

	@OriginalMember(owner = "client!qi", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "(I)V")
	@Override
	protected void method6168() {
		if (super.aClass220_18 == Static539.aClass220_21) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass220_18 == Static256.aClass220_11) {
			OpenGL.glBlendFunc(1, 1);
			return;
		} else if (super.aClass220_18 == Static287.aClass220_14) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(II)Lclient!ft;")
	@Override
	protected Class3 method6223(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class3_Sub10(this, super.aClass111_103);
		} else if (arg0 == 4) {
			return new Class3_Sub11(this, super.aClass111_103, super.aClass204_7);
		} else if (arg0 == 8) {
			return new Class3_Sub3(this, super.aClass111_103, super.aClass204_7);
		} else {
			return super.method6223(arg0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method6152(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local10);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6182(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "(I)V")
	@Override
	protected void method6156() {
		this.method6175();
		@Pc(14) int local14;
		for (local14 = 0; super.anInt7519 > local14; local14++) {
			@Pc(21) Class1_Sub5 local21 = super.aClass1_Sub5Array6[local14];
			@Pc(25) int local25 = local21.method4165();
			@Pc(30) int local30 = local14 + 16386;
			@Pc(36) float local36 = local21.method4160() / 255.0F;
			Static193.aFloatArray36[0] = local21.method4159();
			Static193.aFloatArray36[1] = local21.method4163();
			Static193.aFloatArray36[2] = local21.method4158();
			Static193.aFloatArray36[3] = 1.0F;
			OpenGL.glLightfv(local30, 4611, Static193.aFloatArray36, 0);
			Static193.aFloatArray36[0] = (float) (local25 >> 16 & 0xFF) * local36;
			Static193.aFloatArray36[2] = local36 * (float) (local25 & 0xFF);
			Static193.aFloatArray36[1] = local36 * (float) (local25 >> 8 & 0xFF);
			Static193.aFloatArray36[3] = 1.0F;
			OpenGL.glLightfv(local30, 4609, Static193.aFloatArray36, 0);
			OpenGL.glLightf(local30, 4617, 1.0F / (float) (local21.method4162() * local21.method4162()));
			OpenGL.glEnable(local30);
		}
		while (local14 < super.anInt7521) {
			OpenGL.glDisable(local14 + 16386);
			local14++;
		}
		super.method6156();
	}

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "(B)V")
	@Override
	protected void method6246() {
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(IZ)Lclient!kga;")
	@Override
	public Interface13 method6193(@OriginalArg(1) boolean arg0) {
		return new Class58_Sub2(this, Static554.aClass340_15, arg0);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6424(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub32 local19;
		while (!this.aClass361_82.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_82.method7850();
			Static456.anIntArray516[local11++] = (int) local19.aLong425;
			super.anInt7515 -= local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static456.anIntArray516, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static456.anIntArray516, 0);
			local11 = 0;
		}
		while (!this.aClass361_83.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_83.method7850();
			Static456.anIntArray516[local11++] = (int) local19.aLong425;
			super.anInt7516 -= local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static456.anIntArray516, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static456.anIntArray516, 0);
			local11 = 0;
		}
		while (!this.aClass361_84.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_84.method7850();
			Static456.anIntArray516[local11++] = local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static456.anIntArray516, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static456.anIntArray516, 0);
			local11 = 0;
		}
		while (!this.aClass361_85.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_85.method7850();
			Static456.anIntArray516[local11++] = (int) local19.aLong425;
			super.anInt7518 -= local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static456.anIntArray516, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static456.anIntArray516, 0);
		}
		while (!this.aClass361_81.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_81.method7850();
			OpenGL.glDeleteLists((int) local19.aLong425, local19.anInt6144);
		}
		@Pc(222) Class1 local222;
		while (!this.aClass361_86.method7847()) {
			local222 = this.aClass361_86.method7850();
			OpenGL.glDeleteProgramARB((int) local222.aLong425);
		}
		while (!this.aClass361_87.method7847()) {
			local222 = this.aClass361_87.method7850();
			OpenGL.glDeleteObjectARB(local222.aLong425);
		}
		while (!this.aClass361_81.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_81.method7850();
			OpenGL.glDeleteLists((int) local19.aLong425, local19.anInt6144);
		}
		if (this.b() > 100663296 && Static255.method4035() > this.aLong333 + 60000L) {
			System.gc();
			this.aLong333 = Static255.method4035();
		}
		super.method6424(local9);
	}

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "()V")
	@Override
	public void method6462() {
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "(I)V")
	@Override
	protected void method6166() {
		if (super.aBoolean543 && !super.aBoolean535) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIIIZII)Lclient!gn;")
	@Override
	public Interface8 method6257(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean555 || Static119.method2029(arg5) && Static119.method2029(arg3)) {
			return new Class112_Sub4(this, arg5, arg3, arg4, arg0, 0, arg1);
		} else if (this.aBoolean554) {
			return new Class112_Sub3(this, arg5, arg3, arg0, 0, arg1);
		} else {
			@Pc(38) Class112_Sub4 local38 = new Class112_Sub4(this, Static253.aClass297_5, Static554.aClass340_14, Static200.method3428(arg5), Static200.method3428(arg3));
			local38.method7330(arg1, arg5, 0, arg0, 0, arg3);
			return local38;
		}
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "()V")
	@Override
	protected void method6414() {
		super.method6414();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!wr;)V")
	@Override
	public void method6276(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1) {
		this.aClass58_Sub1Array1[arg0] = (Class58_Sub1) arg1;
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "()V")
	@Override
	public void method6425() {
	}

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "(I)V")
	@Override
	protected void method6210() {
		if (super.aBoolean528 && super.aBoolean533 && super.anInt7552 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "()V")
	@Override
	public void method6416() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "()V")
	@Override
	public void method6440() {
		if (super.anInt7363 <= 0 && super.anInt7472 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt7531;
		@Pc(22) int local22 = super.anInt7548;
		@Pc(25) int local25 = super.anInt7545;
		@Pc(28) int local28 = super.anInt7541;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6205();
		this.method6225(false);
		this.method6161(false);
		this.method6199(false);
		this.method6184(false);
		this.method6159(null);
		this.method6236(-2, false, false);
		this.method6249(1);
		this.method6183(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7363, super.anInt7472, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "()Z")
	@Override
	public boolean method6459() {
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "(I)V")
	@Override
	protected void method6281() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass296Array3[super.anInt7547] == Static146.aClass296_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass209_Sub2Array3[super.anInt7547].method4927(Static14.aFloatArray6), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLclient!dn;)V")
	@Override
	public void method6157(@OriginalArg(1) Class74 arg0) {
		if (arg0 == Static26.aClass74_1) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(16) int local16 = Static550.method7488(arg0);
		OpenGL.glTexGeni(8192, 9472, local16);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local16);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local16);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B[Lclient!qp;)Lclient!um;")
	@Override
	public Class331 method6189(@OriginalArg(1) Class271[] arg0) {
		return new Class331_Sub1(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(IB)V")
	public synchronized void method6288(@OriginalArg(0) int arg0) {
		@Pc(11) Class1 local11 = new Class1();
		local11.aLong425 = arg0;
		this.aClass361_86.method7855(local11);
	}

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "(B)V")
	@Override
	protected void method6262() {
		if (super.aBoolean548) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIZ[[I)Lclient!jn;")
	@Override
	public Interface12 method6248(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class112_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6242() {
		if (super.aBoolean532) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZB)Lclient!wr;")
	@Override
	public Interface24 method6176(@OriginalArg(0) boolean arg0) {
		return new Class58_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "(I)V")
	@Override
	protected void method6252() {
		if (super.aBoolean547) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6272(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(10) Long local10 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local10);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6400(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6416();
	}

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "(I)V")
	@Override
	protected void method6261() {
		Static193.aFloatArray36[2] = (float) (super.anInt7537 & 0xFF) / 255.0F;
		Static193.aFloatArray36[0] = (float) (super.anInt7537 & 0xFF0000) / 1.671168E7F;
		Static193.aFloatArray36[3] = (float) (super.anInt7537 >>> 24) / 255.0F;
		Static193.aFloatArray36[1] = (float) (super.anInt7537 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static193.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "(B)V")
	@Override
	protected void method6269() {
		OpenGL.glScissor(super.anInt7543 + super.anInt7531, super.anInt7472 + super.anInt7522 - super.anInt7541, super.anInt7548 - super.anInt7531, super.anInt7541 - super.anInt7545);
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7472 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt7642, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZLclient!ed;B)V")
	@Override
	protected void method6255(@OriginalArg(0) int arg0, @OriginalArg(2) Class84 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static588.method7845(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "()V")
	@Override
	public void method6436() {
	}

	@OriginalMember(owner = "client!qi", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6184(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!it;Lclient!it;FLclient!it;)Lclient!it;")
	@Override
	public Class36 method6464(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qi", name = "X", descriptor = "(I)V")
	private void method6291() {
		if (this.aBoolean553) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass325_6.method7219()) {
			if (!this.aBoolean551) {
				OpenGL.glLoadMatrixf(super.aClass209_Sub2_18.method4927(Static14.aFloatArray6), 0);
				this.aBoolean551 = true;
				this.method6171();
				this.method6156();
			}
			if (super.aBoolean527) {
				this.aBoolean553 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass209_Sub2_15.method4927(Static14.aFloatArray6), 0);
				this.aBoolean553 = true;
			}
		} else if (super.aBoolean527) {
			OpenGL.glLoadIdentity();
			this.aBoolean553 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass209_Sub2_15.method4927(Static14.aFloatArray6), 0);
			this.aBoolean553 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII[BLclient!sk;)Lclient!dea;")
	@Override
	public Interface4 method6155(@OriginalArg(4) byte[] arg0, @OriginalArg(5) Class297 arg1) {
		return new Class112_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "(I)V")
	@Override
	protected void method6250() {
		OpenGL.glActiveTexture(super.anInt7547 + 33984);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!jb;I)V")
	@Override
	public void method6167(@OriginalArg(0) int arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static236.aClass165_2 == arg1) {
			local10 = 1;
			local14 = arg0 * 2;
		} else if (Static358.aClass165_4 == arg1) {
			local10 = 3;
			local14 = arg0 + 1;
		} else if (arg1 == Static312.aClass165_3) {
			local10 = 4;
			local14 = arg0 * 3;
		} else if (Static450.aClass165_5 == arg1) {
			local14 = arg0 + 2;
			local10 = 6;
		} else if (arg1 == Static567.aClass165_6) {
			local14 = arg0 + 2;
			local10 = 5;
		} else {
			local14 = arg0;
			local10 = 0;
		}
		OpenGL.glDrawArrays(local10, arg2, local14);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method6178(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!vea;Lclient!sk;B)Z")
	@Override
	public boolean method6219(@OriginalArg(0) Class340 arg0, @OriginalArg(1) Class297 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "E", descriptor = "(I)V")
	@Override
	protected void method6235() {
		if (super.aBoolean539) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!sk;Lclient!vea;I)Z")
	@Override
	public boolean method6279(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class340 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILclient!kga;IILclient!jb;)V")
	@Override
	public void method6274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class165 arg5) {
		@Pc(22) byte local22;
		@Pc(20) int local20;
		if (arg5 == Static236.aClass165_2) {
			local20 = arg3 * 2;
			local22 = 1;
		} else if (Static358.aClass165_4 == arg5) {
			local20 = arg3 + 1;
			local22 = 3;
		} else if (Static312.aClass165_3 == arg5) {
			local20 = arg3 * 3;
			local22 = 4;
		} else if (arg5 == Static450.aClass165_5) {
			local22 = 6;
			local20 = arg3 + 2;
		} else if (Static567.aClass165_6 == arg5) {
			local20 = arg3 + 2;
			local22 = 5;
		} else {
			local22 = 0;
			local20 = arg3;
		}
		@Pc(76) Class340 local76 = arg2.method7649();
		@Pc(79) Class58_Sub2 local79 = (Class58_Sub2) arg2;
		local79.method6747();
		OpenGL.glDrawElements(local22, local20, Static575.method4595(local76), local79.method6751() + (long) (local76.anInt9068 * arg0));
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLclient!sk;Lclient!vea;II)Lclient!gn;")
	@Override
	public Interface8 method6187(@OriginalArg(1) Class297 arg0, @OriginalArg(2) Class340 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean555 || Static119.method2029(arg3) && Static119.method2029(arg2)) {
			return new Class112_Sub4(this, arg0, arg1, arg3, arg2);
		} else if (this.aBoolean554) {
			return new Class112_Sub3(this, arg0, arg1, arg3, arg2);
		} else {
			return new Class112_Sub4(this, arg0, arg1, Static200.method3428(arg3), Static200.method3428(arg2));
		}
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(II)V")
	@Override
	public void method6247(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6254() {
		if (super.aBoolean534) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "(I)V")
	@Override
	protected void method6258() {
		this.method6291();
	}

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "()Z")
	@Override
	public boolean method6451() {
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "(B)V")
	@Override
	protected void method6253() {
		super.aFloat186 = -super.anInt7520 + super.bf;
		super.aFloat194 = super.aFloat186 - (float) super.anInt7552;
		if ((float) super.anInt7532 > super.aFloat194) {
			super.aFloat194 = super.anInt7532;
		}
		OpenGL.glFogf(2915, super.aFloat194);
		OpenGL.glFogf(2916, super.aFloat186);
		Static193.aFloatArray36[0] = (float) (super.anInt7555 & 0xFF0000) / 1.671168E7F;
		Static193.aFloatArray36[2] = (float) (super.anInt7555 & 0xFF) / 255.0F;
		Static193.aFloatArray36[1] = (float) (super.anInt7555 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static193.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)V")
	public synchronized void method6293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub32 local8 = new Class1_Sub32(arg0);
		local8.aLong425 = arg1;
		this.aClass361_83.method7855(local8);
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "(B)V")
	@Override
	protected void method6222() {
		OpenGL.glViewport(super.anInt7543, super.anInt7522, super.anInt7363, super.anInt7472);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6412(@OriginalArg(0) Class10 arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "(I)V")
	@Override
	protected void method6163() {
		OpenGL.glDepthMask(super.aBoolean546 && super.aBoolean545);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(JI)V")
	public synchronized void method6294(@OriginalArg(0) long arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong425 = arg0;
		this.aClass361_87.method7855(local13);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6265(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL2.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "(B)F")
	@Override
	protected float method6202() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "(I)V")
	@Override
	protected void method6230() {
		Static193.aFloatArray36[2] = super.aFloat195 * super.aFloat193;
		Static193.aFloatArray36[1] = super.aFloat197 * super.aFloat193;
		Static193.aFloatArray36[0] = super.aFloat183 * super.aFloat193;
		Static193.aFloatArray36[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static193.aFloatArray36, 0);
		Static193.aFloatArray36[1] = -super.aFloat191 * super.aFloat197;
		Static193.aFloatArray36[2] = super.aFloat195 * -super.aFloat191;
		Static193.aFloatArray36[0] = -super.aFloat191 * super.aFloat183;
		Static193.aFloatArray36[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static193.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "(B)V")
	@Override
	protected void method6256() {
		this.aBoolean551 = false;
		this.method6291();
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(Z)V")
	@Override
	public void method6171() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray62, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "(I)V")
	@Override
	protected void method6173() {
		Static193.aFloatArray36[0] = super.aFloat183 * super.aFloat188;
		Static193.aFloatArray36[1] = super.aFloat188 * super.aFloat197;
		Static193.aFloatArray36[2] = super.aFloat195 * super.aFloat188;
		Static193.aFloatArray36[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static193.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "(I)V")
	@Override
	protected void method6263() {
		for (@Pc(6) int local6 = super.anInt7533 - 1; local6 >= 0; local6--) {
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
		@Pc(74) float[] local74 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(76) int local76 = 0; local76 < 8; local76++) {
			@Pc(82) int local82 = local76 + 16384;
			OpenGL.glLightfv(local82, 4608, local74, 0);
			OpenGL.glLightf(local82, 4615, 0.0F);
			OpenGL.glLightf(local82, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method6263();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILclient!sk;I[BZI)Lclient!gn;")
	@Override
	protected Interface8 method6283(@OriginalArg(0) int arg0, @OriginalArg(3) Class297 arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean555 || Static119.method2029(arg4) && Static119.method2029(arg0)) {
			return new Class112_Sub4(this, arg1, arg4, arg0, arg3, arg2, 0, 0);
		} else if (this.aBoolean554) {
			return new Class112_Sub3(this, arg1, arg4, arg0, arg2, 0, 0);
		} else {
			@Pc(35) Class112_Sub4 local35 = new Class112_Sub4(this, arg1, Static554.aClass340_14, Static200.method3428(arg4), Static200.method3428(arg0));
			local35.method7329(0, arg4, arg2, arg1, arg0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "(I)V")
	@Override
	protected void method6266() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray61, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!um;I)V")
	@Override
	public void method6194(@OriginalArg(0) Class331 arg0) {
		@Pc(9) Class271[] local9 = ((Class331_Sub1) arg0).aClass271Array1;
		@Pc(11) int local11 = 0;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local9.length; local26++) {
			@Pc(32) Class271 local32 = local9[local26];
			@Pc(37) Class58_Sub1 local37 = this.aClass58_Sub1Array1[local26];
			@Pc(39) int local39 = 0;
			@Pc(43) int local43 = local37.method4363();
			@Pc(47) long local47 = local37.method6751();
			local37.method6747();
			for (@Pc(52) int local52 = 0; local52 < local32.method6330(); local52++) {
				@Pc(59) Class193 local59 = local32.method6329(local52);
				if (Static278.aClass193_1 == local59) {
					OpenGL.glVertexPointer(3, 5126, local43, local47 + (long) local39);
					local24 = true;
				} else if (Static278.aClass193_2 == local59) {
					OpenGL.glNormalPointer(5126, local43, (long) local39 + local47);
					local22 = true;
				} else if (Static278.aClass193_3 == local59) {
					local20 = true;
					OpenGL.glColorPointer(4, 5121, local43, local47 + (long) local39);
				} else if (Static278.aClass193_4 == local59) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local43, (long) local39 + local47);
				} else if (local59 == Static278.aClass193_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local43, local47 + (long) local39);
				} else if (Static278.aClass193_6 == local59) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local43, local47 + (long) local39);
				} else if (Static278.aClass193_7 == local59) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local43, (long) local39 + local47);
				}
				local39 += local59.anInt5102;
			}
		}
		if (local24 != this.aBoolean549) {
			if (local24) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean549 = local24;
		}
		if (this.aBoolean550 != local22) {
			if (local22) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean550 = local22;
		}
		if (local20 != this.aBoolean552) {
			if (local20) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean552 = local20;
		}
		@Pc(257) int local257;
		if (local11 > this.anInt7641) {
			for (local257 = this.anInt7641; local257 < local11; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt7641 = local11;
		} else if (local11 < this.anInt7641) {
			for (local257 = local11; local257 < this.anInt7641; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt7641 = local11;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!sk;IZIIBI[F)Lclient!gn;")
	@Override
	protected Interface8 method6203(@OriginalArg(0) Class297 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean555 || Static119.method2029(arg3) && Static119.method2029(arg1)) {
			return new Class112_Sub4(this, arg0, arg3, arg1, arg2, arg4, 0, 0);
		} else if (this.aBoolean554) {
			return new Class112_Sub3(this, arg0, arg3, arg1, arg4, 0, 0);
		} else {
			@Pc(59) Class112_Sub4 local59 = new Class112_Sub4(this, arg0, Static554.aClass340_18, Static200.method3428(arg3), Static200.method3428(arg1));
			local59.method7333(arg0, arg3, arg1, arg4);
			return local59;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public synchronized void method6295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub32 local14 = new Class1_Sub32(arg1);
		local14.aLong425 = arg0;
		this.aClass361_82.method7855(local14);
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "()Lclient!aa;")
	@Override
	public Class2 method6419() {
		@Pc(7) int local7 = -1;
		if (this.aString79.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString79.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString79.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class2(local7, "OpenGL", this.anInt7644, this.aString78, 0L);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6174() {
		OpenGL.glTexEnvi(8960, 34162, Static388.method5568(super.aClass108Array5[super.anInt7547]));
	}

	@OriginalMember(owner = "client!qi", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt7643;
	}

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "(I)V")
	@Override
	protected void method6188() {
		OpenGL.glTexEnvi(8960, 34161, Static388.method5568(super.aClass108Array6[super.anInt7547]));
	}

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "()V")
	@Override
	public void method6469() {
		OpenGL.glFinish();
	}
}
