import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class100_Sub1_Sub2 extends Class100_Sub1 {

	@OriginalMember(owner = "client!lm", name = "gi", descriptor = "Z")
	private boolean aBoolean459;

	@OriginalMember(owner = "client!lm", name = "ii", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!lm", name = "ji", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!lm", name = "ki", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "client!lm", name = "li", descriptor = "I")
	private int anInt5875;

	@OriginalMember(owner = "client!lm", name = "mi", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!lm", name = "ni", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!lm", name = "Wg", descriptor = "Lclient!ae;")
	private final Class8 aClass8_30 = new Class8();

	@OriginalMember(owner = "client!lm", name = "wh", descriptor = "Lclient!ae;")
	private final Class8 aClass8_31 = new Class8();

	@OriginalMember(owner = "client!lm", name = "ai", descriptor = "Lclient!ae;")
	private final Class8 aClass8_32 = new Class8();

	@OriginalMember(owner = "client!lm", name = "bi", descriptor = "Lclient!ae;")
	private final Class8 aClass8_33 = new Class8();

	@OriginalMember(owner = "client!lm", name = "ci", descriptor = "Lclient!ae;")
	private final Class8 aClass8_34 = new Class8();

	@OriginalMember(owner = "client!lm", name = "di", descriptor = "Lclient!ae;")
	private final Class8 aClass8_35 = new Class8();

	@OriginalMember(owner = "client!lm", name = "ei", descriptor = "Lclient!ae;")
	private final Class8 aClass8_36 = new Class8();

	@OriginalMember(owner = "client!lm", name = "fi", descriptor = "[Lclient!caa;")
	private final Class45_Sub1[] aClass45_Sub1Array1 = new Class45_Sub1[16];

	@OriginalMember(owner = "client!lm", name = "hi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!lm", name = "oi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!lm", name = "vi", descriptor = "I")
	private final int anInt5877 = 0;

	@OriginalMember(owner = "client!lm", name = "wg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!lm", name = "si", descriptor = "Ljava/lang/String;")
	private final String aString47;

	@OriginalMember(owner = "client!lm", name = "ui", descriptor = "Ljava/lang/String;")
	private final String aString48;

	@OriginalMember(owner = "client!lm", name = "zi", descriptor = "I")
	private final int anInt5878;

	@OriginalMember(owner = "client!lm", name = "xi", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!lm", name = "ri", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!lm", name = "qi", descriptor = "Z")
	private final boolean aBoolean465;

	@OriginalMember(owner = "client!lm", name = "yi", descriptor = "Z")
	public final boolean aBoolean469;

	@OriginalMember(owner = "client!lm", name = "wi", descriptor = "Z")
	public final boolean aBoolean467;

	@OriginalMember(owner = "client!lm", name = "pi", descriptor = "Z")
	public final boolean aBoolean464;

	@OriginalMember(owner = "client!lm", name = "Ai", descriptor = "[I")
	public final int[] anIntArray415;

	@OriginalMember(owner = "client!lm", name = "ti", descriptor = "I")
	public final int anInt5876;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!pl;I)V")
	public Class100_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(4) Class259 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString47 = OpenGL.glGetString(7936).toLowerCase();
			this.aString48 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString47.indexOf("microsoft") != -1 || this.aString47.indexOf("brian paul") != -1 || this.aString47.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(110) String local110 = OpenGL.glGetString(7938);
			@Pc(118) String[] local118 = Static568.method7710(local110.replace('.', ' '), ' ');
			if (local118.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(134) int local134;
			try {
				@Pc(128) int local128 = Static158.method2594(local118[0]);
				local134 = Static158.method2594(local118[1]);
				this.anInt5878 = local134 + local128 * 10;
			} catch (@Pc(143) NumberFormatException local143) {
				throw new RuntimeException("");
			}
			if (this.anInt5878 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(185) int[] local185 = new int[1];
				OpenGL.glGetIntegerv(34018, local185, 0);
				super.anInt5775 = local185[0];
				if (super.anInt5775 < 2) {
					throw new RuntimeException("");
				}
				super.anInt5773 = 8;
				this.aBoolean468 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean443 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean466 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean438 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean465 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean454 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean469 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean467 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean464 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray415 = new int[super.anInt5775];
				this.anInt5876 = Stream.a() ? 33639 : 5121;
				if (this.aString48.indexOf("radeon") != -1) {
					local134 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static568.method7710(this.aString48.replace('/', ' '), ' ');
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(309) String local309 = local301[local303];
						try {
							if (local309.length() > 0) {
								if (local309.charAt(0) == 'x' && local309.length() >= 3 && Static271.method4107(local309.substring(1, 3))) {
									local309 = local309.substring(1);
									local292 = true;
								}
								if (local309.equals("hd")) {
									local290 = true;
								} else {
									if (local309.startsWith("hd")) {
										local290 = true;
										local309 = local309.substring(2);
									}
									if (local309.length() >= 4 && Static271.method4107(local309.substring(0, 4))) {
										local134 = Static158.method2594(local309.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(376) Exception local376) {
						}
					}
					if (!local292 && !local290) {
						if (local134 >= 7000 && local134 <= 9250) {
							super.aBoolean454 = false;
						}
						if (local134 >= 7000 && local134 <= 7999) {
							this.aBoolean468 = false;
						}
					}
					this.aBoolean466 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString47.indexOf("intel");
				if (this.aBoolean468) {
					try {
						@Pc(432) int[] local432 = new int[1];
						OpenGL.glGenBuffersARB(1, local432, 0);
					} catch (@Pc(438) Throwable local438) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(444) Throwable local444) {
			local444.printStackTrace();
			this.method6250();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "(B)V")
	@Override
	protected void method4813() {
		OpenGL.glMatrixMode(5890);
		if (Static248.aClass190_3 == super.aClass190Array3[super.anInt5771]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass68_Sub2Array3[super.anInt5771].method5114(Static8.aFloatArray1), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!nba;I)V")
	@Override
	public void method4863(@OriginalArg(1) Interface16 arg0, @OriginalArg(2) int arg1) {
		this.aClass45_Sub1Array1[arg1] = (Class45_Sub1) arg0;
	}

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "(I)V")
	@Override
	protected void method4751() {
		OpenGL.glTexEnvi(8960, 34162, Static404.method5912(super.aClass236Array6[super.anInt5771]));
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZ)Lclient!nba;")
	@Override
	public Interface16 method4837(@OriginalArg(1) boolean arg0) {
		return new Class45_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "(I)V")
	@Override
	protected void method4781() {
		if (super.aBoolean446) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "(I)V")
	@Override
	protected void method4755() {
		OpenGL.glDepthMask(super.aBoolean452 && super.aBoolean450);
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4822() {
		if (super.aBoolean456) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "(I)V")
	@Override
	protected void method4817() {
		Static527.aFloatArray67[1] = super.aFloat161 * super.aFloat159;
		Static527.aFloatArray67[3] = 1.0F;
		Static527.aFloatArray67[2] = super.aFloat156 * super.aFloat159;
		Static527.aFloatArray67[0] = super.aFloat152 * super.aFloat159;
		OpenGL.glLightfv(16384, 4609, Static527.aFloatArray67, 0);
		Static527.aFloatArray67[1] = -super.aFloat162 * super.aFloat161;
		Static527.aFloatArray67[3] = 1.0F;
		Static527.aFloatArray67[2] = super.aFloat156 * -super.aFloat162;
		Static527.aFloatArray67[0] = -super.aFloat162 * super.aFloat152;
		OpenGL.glLightfv(16385, 4609, Static527.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lclient!eda;Z)Lclient!mq;")
	@Override
	public Class199 method4853(@OriginalArg(0) Class89[] arg0) {
		return new Class199_Sub1(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "(I)V")
	@Override
	protected void method4756() {
		Static527.aFloatArray67[0] = (float) (super.anInt5776 & 0xFF0000) / 1.671168E7F;
		Static527.aFloatArray67[3] = (float) (super.anInt5776 >>> 24) / 255.0F;
		Static527.aFloatArray67[2] = (float) (super.anInt5776 & 0xFF) / 255.0F;
		Static527.aFloatArray67[1] = (float) (super.anInt5776 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static527.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6205(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub22 local19;
		while (!this.aClass8_31.method219()) {
			local19 = (Class2_Sub22) this.aClass8_31.method217();
			Static116.anIntArray141[local11++] = (int) local19.aLong268;
			super.anInt5753 -= local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static116.anIntArray141, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static116.anIntArray141, 0);
			local11 = 0;
		}
		while (!this.aClass8_32.method219()) {
			local19 = (Class2_Sub22) this.aClass8_32.method217();
			Static116.anIntArray141[local11++] = (int) local19.aLong268;
			super.anInt5751 -= local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static116.anIntArray141, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static116.anIntArray141, 0);
			local11 = 0;
		}
		while (!this.aClass8_33.method219()) {
			local19 = (Class2_Sub22) this.aClass8_33.method217();
			Static116.anIntArray141[local11++] = local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static116.anIntArray141, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static116.anIntArray141, 0);
			local11 = 0;
		}
		while (!this.aClass8_34.method219()) {
			local19 = (Class2_Sub22) this.aClass8_34.method217();
			Static116.anIntArray141[local11++] = (int) local19.aLong268;
			super.anInt5754 -= local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static116.anIntArray141, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static116.anIntArray141, 0);
		}
		while (!this.aClass8_30.method219()) {
			local19 = (Class2_Sub22) this.aClass8_30.method217();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3866);
		}
		@Pc(225) Class2 local225;
		while (!this.aClass8_35.method219()) {
			local225 = this.aClass8_35.method217();
			OpenGL.glDeleteProgramARB((int) local225.aLong268);
		}
		while (!this.aClass8_36.method219()) {
			local225 = this.aClass8_36.method217();
			OpenGL.glDeleteObjectARB(local225.aLong268);
		}
		while (!this.aClass8_30.method219()) {
			local19 = (Class2_Sub22) this.aClass8_30.method217();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3866);
		}
		if (this.b() > 100663296 && Static548.method7437() > this.aLong147 + 60000L) {
			System.gc();
			this.aLong147 = Static548.method7437();
		}
		super.method6205(local9);
	}

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "(B)V")
	@Override
	protected void method4874() {
		this.aBoolean459 = false;
		this.method4887();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLclient!mq;)V")
	@Override
	public void method4757(@OriginalArg(1) Class199 arg0) {
		@Pc(9) Class89[] local9 = ((Class199_Sub1) arg0).aClass89Array1;
		@Pc(11) int local11 = 0;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class89 local31 = local9[local25];
			@Pc(36) Class45_Sub1 local36 = this.aClass45_Sub1Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method896();
			@Pc(46) long local46 = local36.method2940();
			local36.method2938();
			for (@Pc(51) int local51 = 0; local31.method1693() > local51; local51++) {
				@Pc(58) Class181 local58 = local31.method1692(local51);
				if (Static263.aClass181_1 == local58) {
					local23 = true;
					OpenGL.glVertexPointer(3, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static263.aClass181_2) {
					local21 = true;
					OpenGL.glNormalPointer(5126, local42, local46 + (long) local38);
				} else if (local58 == Static263.aClass181_3) {
					OpenGL.glColorPointer(4, 5121, local42, local46 + (long) local38);
					local19 = true;
				} else if (local58 == Static263.aClass181_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static263.aClass181_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static263.aClass181_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, local46 + (long) local38);
				} else if (Static263.aClass181_7 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, (long) local38 + local46);
				}
				local38 += local58.anInt4836;
			}
		}
		if (local23 != this.aBoolean460) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean460 = local23;
		}
		if (this.aBoolean463 != local21) {
			if (local21) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean463 = local21;
		}
		if (this.aBoolean461 != local19) {
			if (local19) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean461 = local19;
		}
		@Pc(275) int local275;
		if (local11 > this.anInt5875) {
			for (local275 = this.anInt5875; local275 < local11; local275++) {
				OpenGL.glClientActiveTexture(local275 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt5875 = local11;
		} else if (local11 < this.anInt5875) {
			for (local275 = local11; local275 < this.anInt5875; local275++) {
				OpenGL.glClientActiveTexture(local275 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt5875 = local11;
		}
	}

	@OriginalMember(owner = "client!lm", name = "W", descriptor = "(I)V")
	@Override
	protected void method4867() {
		if (super.aBoolean440 && !super.aBoolean451) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "(B)V")
	@Override
	protected void method4873() {
		for (@Pc(10) int local10 = super.anInt5775 - 1; local10 >= 0; local10--) {
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
		@Pc(77) float[] local77 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(79) int local79 = 0; local79 < 8; local79++) {
			@Pc(86) int local86 = local79 + 16384;
			OpenGL.glLightfv(local86, 4608, local77, 0);
			OpenGL.glLightf(local86, 4615, 0.0F);
			OpenGL.glLightf(local86, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method4873();
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(ZB)V")
	@Override
	public void method4881(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method4861(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local14)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZILclient!gb;Z)V")
	@Override
	protected void method4754(@OriginalArg(1) int arg0, @OriginalArg(2) Class119 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static274.method4151(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(II)V")
	public synchronized void method4885(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong268 = arg0;
		this.aClass8_35.method212(local7);
	}

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "(B)F")
	@Override
	protected float method4851() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "(I)V")
	@Override
	protected void method4782() {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "()Z")
	@Override
	public boolean method6248() {
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZJ)V")
	public synchronized void method4886(@OriginalArg(1) long arg0) {
		@Pc(11) Class2 local11 = new Class2();
		local11.aLong268 = arg0;
		this.aClass8_36.method212(local11);
	}

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "()V")
	@Override
	public void method6231() {
		if (super.anInt5608 <= 0 && super.anInt5630 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt5778;
		@Pc(19) int local19 = super.anInt5793;
		@Pc(22) int local22 = super.anInt5794;
		@Pc(25) int local25 = super.anInt5780;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4762();
		this.method4857(false);
		this.method4774(false);
		this.method4832(false);
		this.method4871(false);
		this.method4876(null);
		this.method4761(-2, false, false);
		this.method4872(1);
		this.method4801(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt5608, super.anInt5630, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "()V")
	@Override
	public void method6198() {
	}

	@OriginalMember(owner = "client!lm", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(B)V")
	@Override
	protected void method4798() {
		OpenGL.glViewport(super.anInt5781, super.anInt5770, super.anInt5608, super.anInt5630);
	}

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "(I)V")
	@Override
	protected void method4831() {
		this.method4799();
		@Pc(16) int local16;
		for (local16 = 0; super.anInt5785 > local16; local16++) {
			@Pc(23) Class2_Sub14 local23 = super.aClass2_Sub14Array3[local16];
			@Pc(27) int local27 = local23.method7687();
			@Pc(31) int local31 = local16 + 16386;
			@Pc(37) float local37 = local23.method7689() / 255.0F;
			Static527.aFloatArray67[0] = local23.method7694();
			Static527.aFloatArray67[1] = local23.method7696();
			Static527.aFloatArray67[2] = local23.method7693();
			Static527.aFloatArray67[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static527.aFloatArray67, 0);
			Static527.aFloatArray67[2] = local37 * (float) (local27 & 0xFF);
			Static527.aFloatArray67[1] = local37 * (float) (local27 >> 8 & 0xFF);
			Static527.aFloatArray67[0] = (float) (local27 >> 16 & 0xFF) * local37;
			Static527.aFloatArray67[3] = 1.0F;
			OpenGL.glLightfv(local31, 4609, Static527.aFloatArray67, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local23.method7691() * local23.method7691()));
			OpenGL.glEnable(local31);
		}
		while (local16 < super.anInt5763) {
			OpenGL.glDisable(local16 + 16386);
			local16++;
		}
		super.method4831();
	}

	@OriginalMember(owner = "client!lm", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt5877;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	@Override
	protected void method4767() {
		this.method4887();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(ZI)Lclient!hh;")
	@Override
	public Interface11 method4777(@OriginalArg(0) boolean arg0) {
		return new Class45_Sub2(this, Static47.aClass42_5, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "()V")
	@Override
	protected void method6250() {
		super.method6250();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "(I)V")
	@Override
	protected void method4825() {
		if (super.aBoolean445) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!jt;Lclient!jt;FLclient!jt;)Lclient!jt;")
	@Override
	public Class37 method6210(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class37 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "(I)V")
	@Override
	protected void method4779() {
		Static527.aFloatArray67[2] = super.aFloat166 * super.aFloat156;
		Static527.aFloatArray67[0] = super.aFloat152 * super.aFloat166;
		Static527.aFloatArray67[1] = super.aFloat161 * super.aFloat166;
		Static527.aFloatArray67[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static527.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZI[[I)Lclient!oq;")
	@Override
	public Interface20 method4759(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class103_Sub3(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!lm", name = "ab", descriptor = "(I)V")
	private void method4887() {
		if (this.aBoolean462) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass302_6.method6803()) {
			if (!this.aBoolean459) {
				OpenGL.glLoadMatrixf(super.aClass68_Sub2_18.method5114(Static8.aFloatArray1), 0);
				this.aBoolean459 = true;
				this.method4843();
				this.method4831();
			}
			if (super.aBoolean437) {
				this.aBoolean462 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass68_Sub2_15.method5114(Static8.aFloatArray1), 0);
				this.aBoolean462 = true;
			}
		} else if (super.aBoolean437) {
			OpenGL.glLoadIdentity();
			this.aBoolean462 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass68_Sub2_15.method5114(Static8.aFloatArray1), 0);
			this.aBoolean462 = false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	@Override
	public void method6199(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([FIIIZIILclient!ec;)Lclient!ls;")
	@Override
	protected Interface14 method4752(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class88 arg4) {
		if (this.aBoolean465 || Static19.method380(arg3) && Static19.method380(arg1)) {
			return new Class103_Sub4(this, arg4, arg3, arg1, arg2, arg0, 0, 0);
		} else if (this.aBoolean466) {
			return new Class103_Sub2(this, arg4, arg3, arg1, arg0, 0, 0);
		} else {
			@Pc(50) Class103_Sub4 local50 = new Class103_Sub4(this, arg4, Static47.aClass42_8, Static89.method7259(arg3), Static89.method7259(arg1));
			local50.method7073(arg0, arg4, arg1, arg3);
			return local50;
		}
	}

	@OriginalMember(owner = "client!lm", name = "X", descriptor = "(I)V")
	@Override
	protected void method4868() {
		if (super.aBoolean453) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "()Z")
	@Override
	public boolean method6197() {
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)V")
	public synchronized void method4888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg1);
		local8.aLong268 = arg0;
		this.aClass8_32.method212(local8);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([BLclient!ec;IIZZII)Lclient!ls;")
	@Override
	protected Interface14 method4814(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean465 || Static19.method380(arg4) && Static19.method380(arg2)) {
			return new Class103_Sub4(this, arg1, arg4, arg2, arg3, arg0, 0, 0);
		} else if (this.aBoolean466) {
			return new Class103_Sub2(this, arg1, arg4, arg2, arg0, 0, 0);
		} else {
			@Pc(48) Class103_Sub4 local48 = new Class103_Sub4(this, arg1, Static47.aClass42_4, Static89.method7259(arg4), Static89.method7259(arg2));
			local48.method7066(arg0, arg1, arg4, 0, arg2);
			return local48;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!ec;IILclient!bt;)Lclient!ls;")
	@Override
	public Interface14 method4846(@OriginalArg(1) Class88 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3) {
		if (this.aBoolean465 || Static19.method380(arg1) && Static19.method380(arg2)) {
			return new Class103_Sub4(this, arg0, arg3, arg1, arg2);
		} else if (this.aBoolean466) {
			return new Class103_Sub2(this, arg0, arg3, arg1, arg2);
		} else {
			return new Class103_Sub4(this, arg0, arg3, Static89.method7259(arg1), Static89.method7259(arg2));
		}
	}

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "(I)V")
	@Override
	protected void method4802() {
		if (super.aBoolean442 && super.aBoolean441 && super.anInt5789 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!rca;I)V")
	@Override
	public void method4855(@OriginalArg(0) Class280 arg0) {
		if (Static3.aClass280_1 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static50.method899(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLclient!gb;IZB)V")
	@Override
	public void method4875(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static274.method4151(arg1));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "(I)V")
	@Override
	protected void method4829() {
		@Pc(9) int local9 = this.anIntArray415[super.anInt5771];
		if (local9 != 0) {
			this.anIntArray415[super.anInt5771] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "()V")
	@Override
	public void method6203() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6237(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "()V")
	@Override
	public void method6238() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ec;Lclient!bt;I)Z")
	@Override
	public boolean method4810(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class42 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[BIILclient!ec;I)Lclient!fl;")
	@Override
	public Interface6 method4776(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class88 arg1) {
		return new Class103_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4815(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local10);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)V")
	@Override
	public void method4859(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "()Lclient!oa;")
	@Override
	public Class237 method6247() {
		@Pc(7) int local7 = -1;
		if (this.aString47.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString47.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString47.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class237(local7, "OpenGL", this.anInt5878, this.aString48, 0L);
	}

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "(Z)V")
	@Override
	protected void method4856() {
		if (Static106.aClass206_9 == super.aClass206_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass206_6 == Static536.aClass206_10) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static12.aClass206_1 == super.aClass206_6) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method4862(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	@Override
	public void method6184() {
	}

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "(I)V")
	@Override
	protected void method4769() {
		OpenGL.glScissor(super.anInt5781 + super.anInt5778, super.anInt5630 + super.anInt5770 + -super.anInt5780, super.anInt5793 - super.anInt5778, -super.anInt5794 + super.anInt5780);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB)V")
	public synchronized void method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		local8.aLong268 = arg1;
		this.aClass8_31.method212(local8);
	}

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "()V")
	@Override
	public void method6228() {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!lt;IIIILclient!hh;)V")
	@Override
	public void method4764(@OriginalArg(0) int arg0, @OriginalArg(1) Class213 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface11 arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static380.aClass213_6 == arg1) {
			local10 = 1;
			local14 = arg3 * 2;
		} else if (Static275.aClass213_4 == arg1) {
			local10 = 3;
			local14 = arg3 + 1;
		} else if (Static341.aClass213_5 == arg1) {
			local14 = arg3 * 3;
			local10 = 4;
		} else if (Static339.aClass213_3 == arg1) {
			local14 = arg3 + 2;
			local10 = 6;
		} else if (Static50.aClass213_1 == arg1) {
			local10 = 5;
			local14 = arg3 + 2;
		} else {
			local14 = arg3;
			local10 = 0;
		}
		@Pc(74) Class42 local74 = arg5.method4115();
		@Pc(77) Class45_Sub2 local77 = (Class45_Sub2) arg5;
		local77.method2938();
		OpenGL.glDrawElements(local10, local14, Static274.method4153(local74), local77.method2940() + (long) (arg2 * local74.anInt1131));
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt5630 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt5876, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)Lclient!cl;")
	@Override
	protected Class56 method4866(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class56_Sub7(this, super.aClass259_96);
		} else if (arg0 == 4) {
			return new Class56_Sub4(this, super.aClass259_96, super.aClass31_6);
		} else if (arg0 == 8) {
			return new Class56_Sub9(this, super.aClass259_96, super.aClass31_6);
		} else {
			return super.method4866(arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "(Z)V")
	@Override
	public void method4843() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray52, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray48, 0);
	}

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "(I)V")
	@Override
	protected void method4840() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray51, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4808(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!lt;III)V")
	@Override
	public void method4849(@OriginalArg(0) Class213 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static380.aClass213_6 == arg0) {
			local12 = arg2 * 2;
			local14 = 1;
		} else if (Static275.aClass213_4 == arg0) {
			local14 = 3;
			local12 = arg2 + 1;
		} else if (Static341.aClass213_5 == arg0) {
			local14 = 4;
			local12 = arg2 * 3;
		} else if (arg0 == Static339.aClass213_3) {
			local12 = arg2 + 2;
			local14 = 6;
		} else if (Static50.aClass213_1 == arg0) {
			local12 = arg2 + 2;
			local14 = 5;
		} else {
			local12 = arg2;
			local14 = 0;
		}
		OpenGL.glDrawArrays(local14, arg1, local12);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!bt;Lclient!ec;)Z")
	@Override
	public boolean method4794(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class88 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "(I)V")
	@Override
	protected void method4803() {
		super.bf = super.anInt5765 - super.anInt5782;
		super.aFloat151 = super.bf - (float) super.anInt5789;
		if (super.aFloat151 < (float) super.anInt5786) {
			super.aFloat151 = super.anInt5786;
		}
		OpenGL.glFogf(2915, super.aFloat151);
		OpenGL.glFogf(2916, super.bf);
		Static527.aFloatArray67[0] = (float) (super.anInt5779 & 0xFF0000) / 1.671168E7F;
		Static527.aFloatArray67[1] = (float) (super.anInt5779 & 0xFF00) / 65280.0F;
		Static527.aFloatArray67[2] = (float) (super.anInt5779 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static527.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
	@Override
	protected void method4770() {
		OpenGL.glActiveTexture(super.anInt5771 + 33984);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6202(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6238();
	}

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "(I)V")
	@Override
	protected void method4819() {
		if (super.aBoolean458) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "(I)V")
	@Override
	protected void method4786() {
		OpenGL.glTexEnvi(8960, 34161, Static404.method5912(super.aClass236Array5[super.anInt5771]));
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([IIZIIII)Lclient!ls;")
	@Override
	public Interface14 method4787(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean465 || Static19.method380(arg4) && Static19.method380(arg5)) {
			return new Class103_Sub4(this, arg4, arg5, arg1, arg0, 0, arg2);
		} else if (this.aBoolean466) {
			return new Class103_Sub2(this, arg4, arg5, arg0, 0, arg2);
		} else {
			@Pc(35) Class103_Sub4 local35 = new Class103_Sub4(this, Static356.aClass88_11, Static47.aClass42_4, Static89.method7259(arg4), Static89.method7259(arg5));
			local35.method7069(arg2, arg0, 0, arg4, arg5, 0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!lm", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4871(true);
		OpenGL.glClear(256);
	}
}
