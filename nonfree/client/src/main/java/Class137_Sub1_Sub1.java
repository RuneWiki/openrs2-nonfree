import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class137_Sub1_Sub1 extends Class137_Sub1 {

	@OriginalMember(owner = "client!ko", name = "Ai", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!ko", name = "Bi", descriptor = "Z")
	private boolean aBoolean394;

	@OriginalMember(owner = "client!ko", name = "Di", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!ko", name = "Ei", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!ko", name = "Fi", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!ko", name = "Hi", descriptor = "I")
	private int anInt5947;

	@OriginalMember(owner = "client!ko", name = "Ii", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!ko", name = "rh", descriptor = "Lclient!ok;")
	private final Class262 aClass262_28 = new Class262();

	@OriginalMember(owner = "client!ko", name = "ui", descriptor = "Lclient!ok;")
	private final Class262 aClass262_29 = new Class262();

	@OriginalMember(owner = "client!ko", name = "vi", descriptor = "Lclient!ok;")
	private final Class262 aClass262_30 = new Class262();

	@OriginalMember(owner = "client!ko", name = "wi", descriptor = "Lclient!ok;")
	private final Class262 aClass262_31 = new Class262();

	@OriginalMember(owner = "client!ko", name = "xi", descriptor = "Lclient!ok;")
	private final Class262 aClass262_32 = new Class262();

	@OriginalMember(owner = "client!ko", name = "yi", descriptor = "Lclient!ok;")
	private final Class262 aClass262_33 = new Class262();

	@OriginalMember(owner = "client!ko", name = "zi", descriptor = "Lclient!ok;")
	private final Class262 aClass262_34 = new Class262();

	@OriginalMember(owner = "client!ko", name = "Ci", descriptor = "[Lclient!jh;")
	private final Class89_Sub1[] aClass89_Sub1Array1 = new Class89_Sub1[16];

	@OriginalMember(owner = "client!ko", name = "Gi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!ko", name = "Ji", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!ko", name = "Pi", descriptor = "I")
	private final int anInt5948 = 0;

	@OriginalMember(owner = "client!ko", name = "Eh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ko", name = "Ui", descriptor = "Ljava/lang/String;")
	private final String aString63;

	@OriginalMember(owner = "client!ko", name = "Ri", descriptor = "Ljava/lang/String;")
	private final String aString62;

	@OriginalMember(owner = "client!ko", name = "Qi", descriptor = "I")
	private final int anInt5949;

	@OriginalMember(owner = "client!ko", name = "Oi", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!ko", name = "Ki", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!ko", name = "Ni", descriptor = "Z")
	private final boolean aBoolean401;

	@OriginalMember(owner = "client!ko", name = "Si", descriptor = "Z")
	public final boolean aBoolean403;

	@OriginalMember(owner = "client!ko", name = "Ti", descriptor = "Z")
	public final boolean aBoolean404;

	@OriginalMember(owner = "client!ko", name = "Li", descriptor = "Z")
	public final boolean aBoolean400;

	@OriginalMember(owner = "client!ko", name = "Mi", descriptor = "[I")
	public final int[] anIntArray434;

	@OriginalMember(owner = "client!ko", name = "Vi", descriptor = "I")
	public final int anInt5950;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!wia;I)V")
	public Class137_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) Class386 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString63 = OpenGL.glGetString(7936).toLowerCase();
			this.aString62 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString63.indexOf("microsoft") != -1 || this.aString63.indexOf("brian paul") != -1 || this.aString63.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static111.method1920(' ', local108.replace('.', ' '));
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(132) int local132;
			try {
				@Pc(126) int local126 = Static235.method3555(local116[0]);
				local132 = Static235.method3555(local116[1]);
				this.anInt5949 = local126 * 10 + local132;
			} catch (@Pc(141) NumberFormatException local141) {
				throw new RuntimeException("");
			}
			if (this.anInt5949 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(185) int[] local185 = new int[1];
				OpenGL.glGetIntegerv(34018, local185, 0);
				super.anInt9721 = local185[0];
				if (super.anInt9721 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9722 = 8;
				this.aBoolean402 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean676 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean399 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean682 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean401 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean673 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean403 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean404 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean400 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray434 = new int[super.anInt9721];
				this.anInt5950 = Stream.c() ? 33639 : 5121;
				if (this.aString62.indexOf("radeon") != -1) {
					local132 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static111.method1920(' ', this.aString62.replace('/', ' '));
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(309) String local309 = local301[local303];
						try {
							if (local309.length() > 0) {
								if (local309.charAt(0) == 'x' && local309.length() >= 3 && Static324.method5106(local309.substring(1, 3))) {
									local292 = true;
									local309 = local309.substring(1);
								}
								if (local309.equals("hd")) {
									local290 = true;
								} else {
									if (local309.startsWith("hd")) {
										local309 = local309.substring(2);
										local290 = true;
									}
									if (local309.length() >= 4 && Static324.method5106(local309.substring(0, 4))) {
										local132 = Static235.method3555(local309.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(374) Exception local374) {
						}
					}
					if (!local292 && !local290) {
						if (local132 >= 7000 && local132 <= 9250) {
							super.aBoolean673 = false;
						}
						if (local132 >= 7000 && local132 <= 7999) {
							this.aBoolean402 = false;
						}
					}
					this.aBoolean399 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString63.indexOf("intel");
				if (this.aBoolean402) {
					try {
						@Pc(434) int[] local434 = new int[1];
						OpenGL.glGenBuffersARB(1, local434, 0);
					} catch (@Pc(440) Throwable local440) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(446) Throwable local446) {
			local446.printStackTrace();
			this.method7935();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "(I)V")
	@Override
	protected void method8038() {
		if (Static175.aClass105_1 == super.aClass105_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static237.aClass105_3 == super.aClass105_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass105_6 == Static585.aClass105_7) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!ad;)V")
	@Override
	public void method7970(@OriginalArg(1) Class7 arg0) {
		if (arg0 == Static470.aClass7_8) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(16) int local16 = Static248.method3661(arg0);
		OpenGL.glTexGeni(8192, 9472, local16);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local16);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local16);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "(I)V")
	@Override
	protected void method7975() {
		OpenGL.glMatrixMode(5890);
		if (Static453.aClass70_3 == super.aClass70Array3[super.anInt9739]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass26_Sub1Array3[super.anInt9739].method795(Static304.aFloatArray31), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "(Z)V")
	@Override
	protected void method8074() {
		if (super.aBoolean670) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)Lclient!nm;")
	@Override
	protected Class31 method8031(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class31_Sub2(this, super.aClass386_119);
		} else if (arg0 == 4) {
			return new Class31_Sub6(this, super.aClass386_119, super.aClass353_6);
		} else if (arg0 == 8) {
			return new Class31_Sub11(this, super.aClass386_119, super.aClass353_6);
		} else {
			return super.method8031(arg0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!bja;Lclient!vea;I)Z")
	@Override
	public boolean method8011(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class363 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)V")
	@Override
	public void method7954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(II)Lclient!ts;")
	@Override
	public Interface26 method7934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZZBLclient!ip;I)V")
	@Override
	public void method8047(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class169 arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static155.method2504(arg2));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBLclient!hl;)V")
	@Override
	public void method8067(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		this.aClass89_Sub1Array1[arg0] = (Class89_Sub1) arg1;
	}

	@OriginalMember(owner = "client!ko", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(Z)V")
	@Override
	protected void method8019() {
		for (@Pc(6) int local6 = super.anInt9721 - 1; local6 >= 0; local6--) {
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
			@Pc(83) int local83 = local76 + 16384;
			OpenGL.glLightfv(local83, 4608, local74, 0);
			OpenGL.glLightf(local83, 4615, 0.0F);
			OpenGL.glLightf(local83, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method8019();
	}

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "(B)V")
	@Override
	protected void method8027() {
		this.aBoolean394 = false;
		this.method4970();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method7998(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local10)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "()V")
	@Override
	public void method7893() {
	}

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "()V")
	@Override
	public void method7878() {
	}

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "(I)V")
	@Override
	protected void method8018() {
		this.method7977();
		@Pc(12) int local12;
		for (local12 = 0; super.anInt9730 > local12; local12++) {
			@Pc(19) Class14_Sub37 local19 = super.aClass14_Sub37Array6[local12];
			@Pc(23) int local23 = local19.method7820();
			@Pc(27) int local27 = local12 + 16386;
			@Pc(33) float local33 = local19.method7825() / 255.0F;
			Static231.aFloatArray28[0] = (float) local19.method7827();
			Static231.aFloatArray28[1] = (float) local19.method7823();
			Static231.aFloatArray28[2] = (float) local19.method7826();
			Static231.aFloatArray28[3] = 1.0F;
			OpenGL.glLightfv(local27, 4611, Static231.aFloatArray28, 0);
			Static231.aFloatArray28[3] = 1.0F;
			Static231.aFloatArray28[0] = local33 * (float) (local23 >> 16 & 0xFF);
			Static231.aFloatArray28[2] = (float) (local23 & 0xFF) * local33;
			Static231.aFloatArray28[1] = (float) (local23 >> 8 & 0xFF) * local33;
			OpenGL.glLightfv(local27, 4609, Static231.aFloatArray28, 0);
			OpenGL.glLightf(local27, 4617, 1.0F / (float) (local19.method7819() * local19.method7819()));
			OpenGL.glEnable(local27);
		}
		while (super.anInt9729 > local12) {
			OpenGL.glDisable(local12 + 16386);
			local12++;
		}
		super.method8018();
	}

	@OriginalMember(owner = "client!ko", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8022(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!kfa;Lclient!ts;)Lclient!pt;")
	@Override
	public Interface23 method7874(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "()Lclient!cq;")
	@Override
	public Class64 method7953() {
		@Pc(7) int local7 = -1;
		if (this.aString63.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString63.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString63.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class64(local7, "OpenGL", this.anInt5949, this.aString62, 0L);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[Lclient!wk;)Lclient!kq;")
	@Override
	public Class201 method8040(@OriginalArg(1) Class388[] arg0) {
		return new Class201_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "()V")
	@Override
	public void method7919() {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIBI[BZLclient!vea;)Lclient!oga;")
	@Override
	protected Interface21 method8003(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) Class363 arg4) {
		if (this.aBoolean401 || Static178.method2845(arg0) && Static178.method2845(arg1)) {
			return new Class117_Sub1(this, arg4, arg0, arg1, arg3, arg2, 0, 0);
		} else if (this.aBoolean399) {
			return new Class117_Sub4(this, arg4, arg0, arg1, arg2, 0, 0);
		} else {
			@Pc(38) Class117_Sub1 local38 = new Class117_Sub1(this, arg4, Static47.aClass36_5, Static330.method5181(arg0), Static330.method5181(arg1));
			local38.method9039(arg0, arg4, arg1, 0, arg2);
			return local38;
		}
	}

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "()V")
	@Override
	protected void method7905() {
		super.method7905();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZILclient!cfa;I)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg1 == Static41.aClass54_1) {
			local10 = 1;
			local14 = arg2 * 2;
		} else if (Static360.aClass54_5 == arg1) {
			local10 = 3;
			local14 = arg2 + 1;
		} else if (arg1 == Static620.aClass54_6) {
			local10 = 4;
			local14 = arg2 * 3;
		} else if (Static337.aClass54_4 == arg1) {
			local10 = 6;
			local14 = arg2 + 2;
		} else if (arg1 == Static305.aClass54_3) {
			local14 = arg2 + 2;
			local10 = 5;
		} else {
			local14 = arg2;
			local10 = 0;
		}
		OpenGL.glDrawArrays(local10, arg0, local14);
	}

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "(B)V")
	@Override
	protected void method8064() {
		OpenGL.glDepthMask(super.aBoolean686 && super.aBoolean677);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ko", name = "ab", descriptor = "(I)V")
	private void method4970() {
		if (this.aBoolean395) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass141_8.method3375()) {
			if (!this.aBoolean394) {
				OpenGL.glLoadMatrixf(super.aClass26_Sub1_18.method795(Static304.aFloatArray31), 0);
				this.aBoolean394 = true;
				this.method7976();
				this.method8018();
			}
			if (super.aBoolean666) {
				this.aBoolean395 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass26_Sub1_15.method795(Static304.aFloatArray31), 0);
				this.aBoolean395 = true;
			}
		} else if (super.aBoolean666) {
			OpenGL.glLoadIdentity();
			this.aBoolean395 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass26_Sub1_15.method795(Static304.aFloatArray31), 0);
			this.aBoolean395 = false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7882(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class14_Sub18 local19;
		while (!this.aClass262_29.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_29.method6323();
			Static487.anIntArray696[local11++] = (int) local19.aLong305;
			super.anInt9702 -= local19.anInt2644;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static487.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static487.anIntArray696, 0);
			local11 = 0;
		}
		while (!this.aClass262_30.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_30.method6323();
			Static487.anIntArray696[local11++] = (int) local19.aLong305;
			super.anInt9705 -= local19.anInt2644;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static487.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static487.anIntArray696, 0);
			local11 = 0;
		}
		while (!this.aClass262_31.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_31.method6323();
			Static487.anIntArray696[local11++] = local19.anInt2644;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static487.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static487.anIntArray696, 0);
			local11 = 0;
		}
		while (!this.aClass262_32.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_32.method6323();
			Static487.anIntArray696[local11++] = (int) local19.aLong305;
			super.anInt9703 -= local19.anInt2644;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static487.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static487.anIntArray696, 0);
		}
		while (!this.aClass262_28.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_28.method6323();
			OpenGL.glDeleteLists((int) local19.aLong305, local19.anInt2644);
		}
		@Pc(210) Class14 local210;
		while (!this.aClass262_33.method6324()) {
			local210 = this.aClass262_33.method6323();
			OpenGL.glDeleteProgramARB((int) local210.aLong305);
		}
		while (!this.aClass262_34.method6324()) {
			local210 = this.aClass262_34.method6323();
			OpenGL.glDeleteObjectARB(local210.aLong305);
		}
		while (!this.aClass262_28.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_28.method6323();
			OpenGL.glDeleteLists((int) local19.aLong305, local19.anInt2644);
		}
		if (this.E() > 100663296 && this.aLong165 + 60000L < Static521.method7499()) {
			System.gc();
			this.aLong165 = Static521.method7499();
		}
		super.method7882(local9);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method8008(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!ko", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9590 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt5950, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V")
	@Override
	protected void method7972() {
		if (super.aBoolean668 && super.aBoolean680 && super.anInt9727 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt5948;
	}

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "(B)V")
	@Override
	protected void method8062() {
		if (super.aBoolean667 && !super.aBoolean679) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!kq;)V")
	@Override
	public void method8000(@OriginalArg(1) Class201 arg0) {
		@Pc(9) Class388[] local9 = ((Class201_Sub1) arg0).aClass388Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(27) Class388 local27 = local9[local19];
			@Pc(32) Class89_Sub1 local32 = this.aClass89_Sub1Array1[local19];
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = local32.method3997();
			@Pc(42) long local42 = local32.method5671();
			local32.method5670();
			for (@Pc(47) int local47 = 0; local47 < local27.method9238(); local47++) {
				@Pc(54) Class170 local54 = local27.method9233(local47);
				if (Static256.aClass170_1 == local54) {
					OpenGL.glVertexPointer(3, 5126, local38, (long) local34 + local42);
					local17 = true;
				} else if (Static256.aClass170_2 == local54) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local38, local42 + (long) local34);
				} else if (Static256.aClass170_3 == local54) {
					OpenGL.glColorPointer(4, 5121, local38, local42 + (long) local34);
					local13 = true;
				} else if (Static256.aClass170_4 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local38, (long) local34 + local42);
				} else if (local54 == Static256.aClass170_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local38, (long) local34 + local42);
				} else if (local54 == Static256.aClass170_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local38, local42 + (long) local34);
				} else if (Static256.aClass170_7 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local38, (long) local34 + local42);
				}
				local34 += local54.anInt4519;
			}
		}
		if (local17 != this.aBoolean397) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean397 = local17;
		}
		if (this.aBoolean398 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean398 = local15;
		}
		if (this.aBoolean396 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean396 = local13;
		}
		@Pc(252) int local252;
		if (local11 > this.anInt5947) {
			for (local252 = this.anInt5947; local252 < local11; local252++) {
				OpenGL.glClientActiveTexture(local252 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt5947 = local11;
		} else if (local11 < this.anInt5947) {
			for (local252 = local11; local252 < this.anInt5947; local252++) {
				OpenGL.glClientActiveTexture(local252 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt5947 = local11;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7889(arg2, arg3);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "(I)V")
	@Override
	protected void method8054() {
		if (super.aBoolean671) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "(B)V")
	@Override
	protected void method8015() {
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	@Override
	protected void method7957() {
		Static231.aFloatArray28[3] = (float) (super.anInt9744 >>> 24) / 255.0F;
		Static231.aFloatArray28[2] = (float) (super.anInt9744 & 0xFF) / 255.0F;
		Static231.aFloatArray28[1] = (float) (super.anInt9744 & 0xFF00) / 65280.0F;
		Static231.aFloatArray28[0] = (float) (super.anInt9744 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static231.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!dk;IIILclient!cfa;B)V")
	@Override
	public void method7980(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class54 arg5) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (arg5 == Static41.aClass54_1) {
			local20 = arg0 * 2;
			local16 = 1;
		} else if (Static360.aClass54_5 == arg5) {
			local20 = arg0 + 1;
			local16 = 3;
		} else if (arg5 == Static620.aClass54_6) {
			local16 = 4;
			local20 = arg0 * 3;
		} else if (arg5 == Static337.aClass54_4) {
			local16 = 6;
			local20 = arg0 + 2;
		} else if (Static305.aClass54_3 == arg5) {
			local16 = 5;
			local20 = arg0 + 2;
		} else {
			local20 = arg0;
			local16 = 0;
		}
		@Pc(68) Class36 local68 = arg1.method5681();
		@Pc(81) Class89_Sub2 local81 = (Class89_Sub2) arg1;
		local81.method5670();
		OpenGL.glDrawElements(local16, local20, Static243.method3625(local68), local81.method5671() + (long) (arg3 * local68.anInt1130));
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BZ)Lclient!hl;")
	@Override
	public Interface10 method7963(@OriginalArg(1) boolean arg0) {
		return new Class89_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "(I)V")
	@Override
	protected void method7967() {
		@Pc(15) int local15 = this.anIntArray434[super.anInt9739];
		if (local15 != 0) {
			this.anIntArray434[super.anInt9739] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "(I)V")
	@Override
	protected void method8010() {
		OpenGL.glViewport(super.anInt9720, super.anInt9733, super.anInt9683, super.anInt9590);
	}

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "()V")
	@Override
	public void method7948() {
		if (super.anInt9683 <= 0 && super.anInt9590 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.bf;
		@Pc(19) int local19 = super.anInt9726;
		@Pc(22) int local22 = super.anInt9725;
		@Pc(25) int local25 = super.anInt9707;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7973();
		this.method7989(false);
		this.method8077(false);
		this.method8065(false);
		this.method8022(false);
		this.method8007((Interface15) null);
		this.method7962(false, -2, false);
		this.method8078(1);
		this.method7990(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9683, super.anInt9590, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "(B)V")
	@Override
	protected void method8024() {
		if (super.aBoolean674) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(IZ)Lclient!dk;")
	@Override
	public Interface4 method8073(@OriginalArg(1) boolean arg0) {
		return new Class89_Sub2(this, Static47.aClass36_6, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(III)V")
	public synchronized void method4973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub18 local8 = new Class14_Sub18(arg1);
		local8.aLong305 = (long) arg0;
		this.aClass262_29.method6314(local8);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BJ)V")
	public synchronized void method4974(@OriginalArg(1) long arg0) {
		@Pc(13) Class14 local13 = new Class14();
		local13.aLong305 = arg0;
		this.aClass262_34.method6314(local13);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(III)V")
	public synchronized void method4975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub18 local8 = new Class14_Sub18(arg0);
		local8.aLong305 = (long) arg1;
		this.aClass262_30.method6314(local8);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILclient!vea;ZI[FZI)Lclient!oga;")
	@Override
	protected Interface21 method8051(@OriginalArg(0) int arg0, @OriginalArg(2) Class363 arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean401 || Static178.method2845(arg4) && Static178.method2845(arg0)) {
			return new Class117_Sub1(this, arg1, arg4, arg0, arg3, arg2, 0, 0);
		} else if (this.aBoolean399) {
			return new Class117_Sub4(this, arg1, arg4, arg0, arg2, 0, 0);
		} else {
			@Pc(37) Class117_Sub1 local37 = new Class117_Sub1(this, arg1, Static47.aClass36_9, Static330.method5181(arg4), Static330.method5181(arg0));
			local37.method5252(arg1, arg4, arg2, arg0);
			return local37;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method8058(@OriginalArg(1) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL1.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZII[[I)Lclient!ks;")
	@Override
	public Interface16 method8023(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class117_Sub3(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "(II)V")
	public synchronized void method4976(@OriginalArg(1) int arg0) {
		@Pc(7) Class14 local7 = new Class14();
		local7.aLong305 = (long) arg0;
		this.aClass262_33.method6314(local7);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ip;ZII)V")
	@Override
	protected void method7987(@OriginalArg(0) Class169 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static155.method2504(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)V")
	@Override
	public void method7999(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "(I)V")
	@Override
	protected void method8033() {
		Static231.aFloatArray28[1] = super.aFloat245 * super.aFloat238;
		Static231.aFloatArray28[0] = super.aFloat238 * super.aFloat250;
		Static231.aFloatArray28[2] = super.aFloat246 * super.aFloat238;
		Static231.aFloatArray28[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static231.aFloatArray28, 0);
		Static231.aFloatArray28[0] = super.aFloat250 * -super.aFloat251;
		Static231.aFloatArray28[2] = -super.aFloat251 * super.aFloat246;
		Static231.aFloatArray28[1] = super.aFloat245 * -super.aFloat251;
		Static231.aFloatArray28[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static231.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[IIIIBZ)Lclient!oga;")
	@Override
	public Interface21 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (this.aBoolean401 || Static178.method2845(arg3) && Static178.method2845(arg4)) {
			return new Class117_Sub1(this, arg3, arg4, arg5, arg1, 0, arg2);
		} else if (this.aBoolean399) {
			return new Class117_Sub4(this, arg3, arg4, arg1, 0, arg2);
		} else {
			@Pc(57) Class117_Sub1 local57 = new Class117_Sub1(this, Static238.aClass363_4, Static47.aClass36_5, Static330.method5181(arg3), Static330.method5181(arg4));
			local57.method9036(arg3, arg2, 0, 0, arg1, arg4);
			return local57;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!vea;[BIZII)Lclient!gga;")
	@Override
	public Interface9 method8082(@OriginalArg(0) Class363 arg0, @OriginalArg(1) byte[] arg1) {
		return new Class117_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)Lclient!kfa;")
	@Override
	public Interface14 method7902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "(B)V")
	@Override
	protected void method8063() {
		Static231.aFloatArray28[3] = 1.0F;
		Static231.aFloatArray28[1] = super.aFloat245 * super.aFloat235;
		Static231.aFloatArray28[2] = super.aFloat246 * super.aFloat235;
		Static231.aFloatArray28[0] = super.aFloat250 * super.aFloat235;
		OpenGL.glLightModelfv(2899, Static231.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7964(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local10);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
	@Override
	protected void method7958() {
		super.aFloat248 = (float) (-super.anInt9734 + super.anInt9738);
		super.aFloat244 = (float) -super.anInt9727 + super.aFloat248;
		if (super.aFloat244 < (float) super.anInt9737) {
			super.aFloat244 = (float) super.anInt9737;
		}
		OpenGL.glFogf(2915, super.aFloat244);
		OpenGL.glFogf(2916, super.aFloat248);
		Static231.aFloatArray28[1] = (float) (super.anInt9723 & 0xFF00) / 65280.0F;
		Static231.aFloatArray28[2] = (float) (super.anInt9723 & 0xFF) / 255.0F;
		Static231.aFloatArray28[0] = (float) (super.anInt9723 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static231.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()Z")
	@Override
	public boolean method7867() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method8085(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local14);
	}

	@OriginalMember(owner = "client!ko", name = "Y", descriptor = "(I)V")
	@Override
	protected void method8084() {
		this.method4970();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7915(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!pt;)V")
	@Override
	public void method7933(@OriginalArg(0) Interface23 arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(Z)V")
	@Override
	protected void method8012() {
		OpenGL.glTexEnvi(8960, 34161, Static287.method4093(super.aClass87Array5[super.anInt9739]));
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "()Z")
	@Override
	public boolean method7880() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!qaa;Lclient!qaa;FLclient!qaa;)Lclient!qaa;")
	@Override
	public Class144 method7894(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class144 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "(I)F")
	@Override
	protected float method8013() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "(B)V")
	@Override
	protected void method7984() {
		if (super.aBoolean675) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "()V")
	@Override
	public void method7946() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8028() {
		OpenGL.glActiveTexture(super.anInt9739 + 33984);
	}

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "(B)V")
	@Override
	protected void method8032() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray74, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "(B)V")
	@Override
	protected void method8045() {
		if (super.aBoolean687) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "(I)V")
	@Override
	public void method7976() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray72, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray73, 0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!vea;Lclient!bja;III)Lclient!oga;")
	@Override
	public Interface21 method7992(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean401 || Static178.method2845(arg2) && Static178.method2845(arg3)) {
			return new Class117_Sub1(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean399) {
			return new Class117_Sub4(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class117_Sub1(this, arg0, arg1, Static330.method5181(arg2), Static330.method5181(arg3));
		}
	}

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "(I)V")
	@Override
	protected void method8014() {
		OpenGL.glTexEnvi(8960, 34162, Static287.method4093(super.aClass87Array6[super.anInt9739]));
	}

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "(I)V")
	@Override
	protected void method8039() {
		OpenGL.glScissor(super.bf + super.anInt9720, super.anInt9733 - -super.anInt9590 - super.anInt9707, -super.bf + super.anInt9726, -super.anInt9725 + super.anInt9707);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!vea;Lclient!bja;)Z")
	@Override
	public boolean method8087(@OriginalArg(1) Class363 arg0, @OriginalArg(2) Class36 arg1) {
		return true;
	}
}
