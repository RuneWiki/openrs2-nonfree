import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class31_Sub1_Sub1 extends Class31_Sub1 {

	@OriginalMember(owner = "client!bea", name = "fi", descriptor = "Z")
	private boolean aBoolean82;

	@OriginalMember(owner = "client!bea", name = "gi", descriptor = "I")
	private int anInt1092;

	@OriginalMember(owner = "client!bea", name = "ii", descriptor = "Z")
	private boolean aBoolean83;

	@OriginalMember(owner = "client!bea", name = "ji", descriptor = "Z")
	private boolean aBoolean84;

	@OriginalMember(owner = "client!bea", name = "li", descriptor = "Z")
	private boolean aBoolean85;

	@OriginalMember(owner = "client!bea", name = "mi", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!bea", name = "ni", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!bea", name = "Ih", descriptor = "Lclient!or;")
	private final Class244 aClass244_8 = new Class244();

	@OriginalMember(owner = "client!bea", name = "Vh", descriptor = "Lclient!or;")
	private final Class244 aClass244_9 = new Class244();

	@OriginalMember(owner = "client!bea", name = "ai", descriptor = "Lclient!or;")
	private final Class244 aClass244_10 = new Class244();

	@OriginalMember(owner = "client!bea", name = "bi", descriptor = "Lclient!or;")
	private final Class244 aClass244_11 = new Class244();

	@OriginalMember(owner = "client!bea", name = "ci", descriptor = "Lclient!or;")
	private final Class244 aClass244_12 = new Class244();

	@OriginalMember(owner = "client!bea", name = "di", descriptor = "Lclient!or;")
	private final Class244 aClass244_13 = new Class244();

	@OriginalMember(owner = "client!bea", name = "ei", descriptor = "Lclient!or;")
	private final Class244 aClass244_14 = new Class244();

	@OriginalMember(owner = "client!bea", name = "ki", descriptor = "[Lclient!oba;")
	private final Class11_Sub1[] aClass11_Sub1Array1 = new Class11_Sub1[16];

	@OriginalMember(owner = "client!bea", name = "hi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!bea", name = "oi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!bea", name = "yi", descriptor = "I")
	private final int anInt1095 = 0;

	@OriginalMember(owner = "client!bea", name = "nh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!bea", name = "xi", descriptor = "Ljava/lang/String;")
	private final String aString23;

	@OriginalMember(owner = "client!bea", name = "ti", descriptor = "Ljava/lang/String;")
	private final String aString22;

	@OriginalMember(owner = "client!bea", name = "vi", descriptor = "I")
	private final int anInt1094;

	@OriginalMember(owner = "client!bea", name = "Ai", descriptor = "Z")
	public boolean aBoolean92;

	@OriginalMember(owner = "client!bea", name = "pi", descriptor = "Z")
	private boolean aBoolean87;

	@OriginalMember(owner = "client!bea", name = "ri", descriptor = "Z")
	private final boolean aBoolean89;

	@OriginalMember(owner = "client!bea", name = "qi", descriptor = "Z")
	public final boolean aBoolean88;

	@OriginalMember(owner = "client!bea", name = "zi", descriptor = "Z")
	public final boolean aBoolean91;

	@OriginalMember(owner = "client!bea", name = "ui", descriptor = "Z")
	public final boolean aBoolean90;

	@OriginalMember(owner = "client!bea", name = "wi", descriptor = "[I")
	public final int[] anIntArray28;

	@OriginalMember(owner = "client!bea", name = "si", descriptor = "I")
	public final int anInt1093;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!ri;I)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class284 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString23 = OpenGL.glGetString(7936).toLowerCase();
			this.aString22 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString23.indexOf("microsoft") != -1 || this.aString23.indexOf("brian paul") != -1 || this.aString23.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static317.method4706(' ', local109.replace('.', ' '));
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(135) int local135;
			try {
				@Pc(129) int local129 = Static406.method5727(local117[0]);
				local135 = Static406.method5727(local117[1]);
				this.anInt1094 = local129 * 10 + local135;
			} catch (@Pc(145) NumberFormatException local145) {
				throw new RuntimeException("");
			}
			if (this.anInt1094 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(189) int[] local189 = new int[1];
				OpenGL.glGetIntegerv(34018, local189, 0);
				super.anInt9123 = local189[0];
				if (super.anInt9123 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9126 = 8;
				this.aBoolean92 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean613 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean87 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean612 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean89 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean614 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean88 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean91 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean90 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray28 = new int[super.anInt9123];
				this.anInt1093 = Stream.a() ? 33639 : 5121;
				if (this.aString22.indexOf("radeon") != -1) {
					local135 = 0;
					@Pc(293) boolean local293 = false;
					@Pc(295) boolean local295 = false;
					@Pc(304) String[] local304 = Static317.method4706(' ', this.aString22.replace('/', ' '));
					for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
						@Pc(312) String local312 = local304[local306];
						try {
							if (local312.length() > 0) {
								if (local312.charAt(0) == 'x' && local312.length() >= 3 && Static517.method6956(local312.substring(1, 3))) {
									local312 = local312.substring(1);
									local295 = true;
								}
								if (local312.equals("hd")) {
									local293 = true;
								} else {
									if (local312.startsWith("hd")) {
										local293 = true;
										local312 = local312.substring(2);
									}
									if (local312.length() >= 4 && Static517.method6956(local312.substring(0, 4))) {
										local135 = Static406.method5727(local312.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(379) Exception local379) {
						}
					}
					if (!local295 && !local293) {
						if (local135 >= 7000 && local135 <= 7999) {
							this.aBoolean92 = false;
						}
						if (local135 >= 7000 && local135 <= 9250) {
							super.aBoolean614 = false;
						}
					}
					this.aBoolean87 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString23.indexOf("intel");
				if (this.aBoolean92) {
					try {
						@Pc(437) int[] local437 = new int[1];
						OpenGL.glGenBuffersARB(1, local437, 0);
					} catch (@Pc(443) Throwable local443) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(449) Throwable local449) {
			local449.printStackTrace();
			this.method8079();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "()V")
	@Override
	public void method8034() {
	}

	@OriginalMember(owner = "client!bea", name = "N", descriptor = "(I)V")
	@Override
	protected void method7131() {
		@Pc(9) int local9 = this.anIntArray28[super.anInt9134];
		if (local9 != 0) {
			this.anIntArray28[super.anInt9134] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7162(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V")
	public synchronized void method1015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg0);
		local8.aLong262 = arg1;
		this.aClass244_9.method5570(local8);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLclient!qs;)V")
	@Override
	public void method7067(@OriginalArg(1) Class273 arg0) {
		if (Static595.aClass273_3 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(23) int local23 = Static405.method5721(arg0);
		OpenGL.glTexGeni(8192, 9472, local23);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local23);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local23);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BJ)V")
	public synchronized void method1016(@OriginalArg(1) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong262 = arg0;
		this.aClass244_14.method5570(local7);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILclient!mg;ILclient!os;)Lclient!mca;")
	@Override
	public Interface12 method7076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(4) Class245 arg3) {
		if (this.aBoolean89 || Static249.method6960(arg1) && Static249.method6960(arg0)) {
			return new Class19_Sub1(this, arg3, arg2, arg1, arg0);
		} else if (this.aBoolean87) {
			return new Class19_Sub3(this, arg3, arg2, arg1, arg0);
		} else {
			return new Class19_Sub1(this, arg3, arg2, Static538.method7366(arg1), Static538.method7366(arg0));
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!ko;ZII)V")
	@Override
	protected void method7099(@OriginalArg(0) Class179 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static376.method5258(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!bea", name = "U", descriptor = "(I)V")
	@Override
	protected void method7163() {
		if (super.aBoolean608 && !super.aBoolean598) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B[Lclient!ej;)Lclient!qf;")
	@Override
	public Class1 method7116(@OriginalArg(1) Class90[] arg0) {
		return new Class1_Sub1(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7156() {
		Static405.aFloatArray53[2] = (float) (super.anInt9109 & 0xFF) / 255.0F;
		Static405.aFloatArray53[3] = (float) (super.anInt9109 >>> 24) / 255.0F;
		Static405.aFloatArray53[0] = (float) (super.anInt9109 & 0xFF0000) / 1.671168E7F;
		Static405.aFloatArray53[1] = (float) (super.anInt9109 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static405.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!bea", name = "H", descriptor = "(I)V")
	@Override
	protected void method7121() {
		OpenGL.glTexEnvi(8960, 34162, Static408.method5757(super.aClass266Array5[super.anInt9134]));
	}

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "()V")
	@Override
	public void method8030() {
		if (super.anInt9092 <= 0 && super.anInt8992 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt9107;
		@Pc(22) int local22 = super.anInt9113;
		@Pc(25) int local25 = super.anInt9117;
		@Pc(28) int local28 = super.anInt9111;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7086();
		this.method7157(false);
		this.method7082(false);
		this.method7167(false);
		this.method7058(false);
		this.method7129(null);
		this.method7088(false, -2, false);
		this.method7141(1);
		this.method7115(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9092, super.anInt8992, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7183(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!pw;ILclient!bo;IIII)V")
	@Override
	public void method7174(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) byte local23;
		@Pc(21) int local21;
		if (arg0 == Static226.aClass265_7) {
			local23 = 1;
			local21 = arg4 * 2;
		} else if (Static569.aClass265_11 == arg0) {
			local21 = arg4 + 1;
			local23 = 3;
		} else if (Static486.aClass265_10 == arg0) {
			local21 = arg4 * 3;
			local23 = 4;
		} else if (arg0 == Static87.aClass265_9) {
			local23 = 6;
			local21 = arg4 + 2;
		} else if (Static468.aClass265_8 == arg0) {
			local23 = 5;
			local21 = arg4 + 2;
		} else {
			local21 = arg4;
			local23 = 0;
		}
		@Pc(74) Class204 local74 = arg2.method7290();
		@Pc(77) Class11_Sub2 local77 = (Class11_Sub2) arg2;
		local77.method7279();
		OpenGL.glDrawElements(local23, local21, Static323.method4780(local74), local77.method7286() + (long) (local74.anInt6009 * arg3));
	}

	@OriginalMember(owner = "client!bea", name = "q", descriptor = "(B)V")
	@Override
	protected void method7172() {
		if (Static519.aClass363_6 == super.aClass363_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass363_5 == Static362.aClass363_3) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass363_5 == Static548.aClass363_7) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!qf;)V")
	@Override
	public void method7149(@OriginalArg(1) Class1 arg0) {
		@Pc(9) Class90[] local9 = ((Class1_Sub1) arg0).aClass90Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(31) Class90 local31 = local9[local19];
			@Pc(36) Class11_Sub1 local36 = this.aClass11_Sub1Array1[local19];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method5280();
			@Pc(46) long local46 = local36.method7286();
			local36.method7279();
			for (@Pc(51) int local51 = 0; local51 < local31.method2365(); local51++) {
				@Pc(58) Class156 local58 = local31.method2368(local51);
				if (local58 == Static248.aClass156_1) {
					OpenGL.glVertexPointer(3, 5126, local42, local46 + (long) local38);
					local17 = true;
				} else if (Static248.aClass156_2 == local58) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local42, (long) local38 + local46);
				} else if (Static248.aClass156_3 == local58) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local42, local46 + (long) local38);
				} else if (local58 == Static248.aClass156_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static248.aClass156_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local46 + (long) local38);
				} else if (Static248.aClass156_6 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, (long) local38 + local46);
				} else if (local58 == Static248.aClass156_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, local46 + (long) local38);
				}
				local38 += local58.anInt4906;
			}
		}
		if (this.aBoolean86 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean86 = local17;
		}
		if (this.aBoolean84 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean84 = local15;
		}
		if (this.aBoolean82 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean82 = local13;
		}
		@Pc(261) int local261;
		if (local11 > this.anInt1092) {
			for (local261 = this.anInt1092; local261 < local11; local261++) {
				OpenGL.glClientActiveTexture(local261 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt1092 = local11;
		} else if (local11 < this.anInt1092) {
			for (local261 = local11; local261 < this.anInt1092; local261++) {
				OpenGL.glClientActiveTexture(local261 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt1092 = local11;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!og;II)V")
	@Override
	public void method7113(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		this.aClass11_Sub1Array1[arg1] = (Class11_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "(Z)F")
	@Override
	protected float method7084() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!ko;IZZB)V")
	@Override
	public void method7083(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static376.method5258(arg0));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8024(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub2 local19;
		while (!this.aClass244_9.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_9.method5578();
			Static113.anIntArray92[local11++] = (int) local19.aLong262;
			super.anInt9103 -= local19.anInt39;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static113.anIntArray92, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static113.anIntArray92, 0);
			local11 = 0;
		}
		while (!this.aClass244_10.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_10.method5578();
			Static113.anIntArray92[local11++] = (int) local19.aLong262;
			super.anInt9099 -= local19.anInt39;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static113.anIntArray92, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static113.anIntArray92, 0);
			local11 = 0;
		}
		while (!this.aClass244_11.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_11.method5578();
			Static113.anIntArray92[local11++] = local19.anInt39;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static113.anIntArray92, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static113.anIntArray92, 0);
			local11 = 0;
		}
		while (!this.aClass244_12.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_12.method5578();
			Static113.anIntArray92[local11++] = (int) local19.aLong262;
			super.anInt9102 -= local19.anInt39;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static113.anIntArray92, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static113.anIntArray92, 0);
		}
		while (!this.aClass244_8.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_8.method5578();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt39);
		}
		@Pc(211) Class3 local211;
		while (!this.aClass244_13.method5571()) {
			local211 = this.aClass244_13.method5578();
			OpenGL.glDeleteProgramARB((int) local211.aLong262);
		}
		while (!this.aClass244_14.method5571()) {
			local211 = this.aClass244_14.method5578();
			OpenGL.glDeleteObjectARB(local211.aLong262);
		}
		while (!this.aClass244_8.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_8.method5578();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt39);
		}
		if (this.b() > 100663296 && Static96.method2000() > this.aLong16 + 60000L) {
			System.gc();
			this.aLong16 = Static96.method2000();
		}
		super.method8024(local9);
	}

	@OriginalMember(owner = "client!bea", name = "z", descriptor = "()Z")
	@Override
	public boolean method8085() {
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "S", descriptor = "(I)V")
	@Override
	protected void method7144() {
		OpenGL.glScissor(super.anInt9137 + super.anInt9107, super.anInt8992 + super.anInt9114 + -super.anInt9111, super.anInt9113 - super.anInt9107, -super.anInt9117 + super.anInt9111);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(ZI)Lclient!bo;")
	@Override
	public Interface2 method7158(@OriginalArg(0) boolean arg0) {
		return new Class11_Sub2(this, Static331.aClass204_14, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "u", descriptor = "(I)V")
	@Override
	protected void method7090() {
		Static405.aFloatArray53[0] = super.aFloat189 * super.aFloat195;
		Static405.aFloatArray53[1] = super.aFloat201 * super.aFloat195;
		Static405.aFloatArray53[3] = 1.0F;
		Static405.aFloatArray53[2] = super.aFloat195 * super.aFloat193;
		OpenGL.glLightfv(16384, 4609, Static405.aFloatArray53, 0);
		Static405.aFloatArray53[2] = super.aFloat193 * -super.aFloat205;
		Static405.aFloatArray53[1] = -super.aFloat205 * super.aFloat201;
		Static405.aFloatArray53[0] = super.aFloat189 * -super.aFloat205;
		Static405.aFloatArray53[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static405.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V")
	@Override
	public void method8061(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bea", name = "ab", descriptor = "(I)V")
	@Override
	protected void method7177() {
		if (super.aBoolean616) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!dd;Lclient!dd;FLclient!dd;)Lclient!dd;")
	@Override
	public Class47 method8093(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "(I)V")
	@Override
	protected void method7091() {
		for (@Pc(6) int local6 = super.anInt9123 - 1; local6 >= 0; local6--) {
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
		super.method7091();
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "()V")
	@Override
	public void method8023() {
	}

	@OriginalMember(owner = "client!bea", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7058(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "(B)V")
	@Override
	protected void method7081() {
		if (super.aBoolean605) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "(B)V")
	@Override
	protected void method7073() {
	}

	@OriginalMember(owner = "client!bea", name = "cb", descriptor = "(I)V")
	private void method1017() {
		if (this.aBoolean85) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass218_8.method5025()) {
			if (!this.aBoolean83) {
				OpenGL.glLoadMatrixf(super.aClass42_Sub3_18.method7520(Static438.aFloatArray37), 0);
				this.aBoolean83 = true;
				this.method7114();
				this.method7095();
			}
			if (super.aBoolean595) {
				this.aBoolean85 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass42_Sub3_15.method7520(Static438.aFloatArray37), 0);
				this.aBoolean85 = true;
			}
		} else if (super.aBoolean595) {
			OpenGL.glLoadIdentity();
			this.aBoolean85 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass42_Sub3_15.method7520(Static438.aFloatArray37), 0);
			this.aBoolean85 = false;
		}
	}

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "(I)V")
	@Override
	protected void method7095() {
		this.method7060();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt9121 > local10; local10++) {
			@Pc(23) Class3_Sub9 local23 = super.aClass3_Sub9Array6[local10];
			@Pc(27) int local27 = local23.method5994();
			@Pc(32) int local32 = local10 + 16386;
			@Pc(38) float local38 = local23.method5996() / 255.0F;
			Static405.aFloatArray53[0] = local23.method5997();
			Static405.aFloatArray53[1] = local23.method5990();
			Static405.aFloatArray53[2] = local23.method5999();
			Static405.aFloatArray53[3] = 1.0F;
			OpenGL.glLightfv(local32, 4611, Static405.aFloatArray53, 0);
			Static405.aFloatArray53[1] = (float) (local27 >> 8 & 0xFF) * local38;
			Static405.aFloatArray53[3] = 1.0F;
			Static405.aFloatArray53[0] = (float) (local27 >> 16 & 0xFF) * local38;
			Static405.aFloatArray53[2] = (float) (local27 & 0xFF) * local38;
			OpenGL.glLightfv(local32, 4609, Static405.aFloatArray53, 0);
			OpenGL.glLightf(local32, 4617, 1.0F / (float) (local23.method6000() * local23.method6000()));
			OpenGL.glEnable(local32);
		}
		while (local10 < super.anInt9135) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method7095();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZIILclient!os;[BII)Lclient!mca;")
	@Override
	protected Interface12 method7104(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class245 arg3, @OriginalArg(5) byte[] arg4) {
		if (this.aBoolean89 || Static249.method6960(arg2) && Static249.method6960(arg0)) {
			return new Class19_Sub1(this, arg3, arg2, arg0, arg1, arg4, 0, 0);
		} else if (this.aBoolean87) {
			return new Class19_Sub3(this, arg3, arg2, arg0, arg4, 0, 0);
		} else {
			@Pc(48) Class19_Sub1 local48 = new Class19_Sub1(this, arg3, Static331.aClass204_13, Static538.method7366(arg2), Static538.method7366(arg0));
			local48.method2989(arg3, arg4, arg2, arg0, 0);
			return local48;
		}
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(B)V")
	@Override
	protected void method7063() {
		this.method1017();
	}

	@OriginalMember(owner = "client!bea", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7179() {
		OpenGL.glViewport(super.anInt9137, super.anInt9114, super.anInt9092, super.anInt8992);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!os;I[BII)Lclient!qw;")
	@Override
	public Interface19 method7152(@OriginalArg(1) Class245 arg0, @OriginalArg(3) byte[] arg1) {
		return new Class19_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(B)V")
	@Override
	protected void method7066() {
		OpenGL.glDepthMask(super.aBoolean607 && super.aBoolean610);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method7106(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(ZI)Lclient!og;")
	@Override
	public Interface15 method7132(@OriginalArg(0) boolean arg0) {
		return new Class11_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "(II)V")
	public synchronized void method1019(@OriginalArg(0) int arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong262 = arg0;
		this.aClass244_13.method5570(local11);
	}

	@OriginalMember(owner = "client!bea", name = "o", descriptor = "(I)V")
	@Override
	protected void method7068() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray62, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "(B)V")
	@Override
	protected void method7153() {
		if (super.aBoolean606 && super.aBoolean611 && super.anInt9110 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bea", name = "C", descriptor = "(I)V")
	@Override
	protected void method7102() {
		if (super.aBoolean596) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "(I)V")
	@Override
	protected void method7055() {
		super.aFloat203 = super.anInt9129 - super.anInt9106;
		super.aFloat198 = (float) -super.anInt9110 + super.aFloat203;
		if (super.aFloat198 < (float) super.anInt9127) {
			super.aFloat198 = super.anInt9127;
		}
		OpenGL.glFogf(2915, super.aFloat198);
		OpenGL.glFogf(2916, super.aFloat203);
		Static405.aFloatArray53[0] = (float) (super.anInt9133 & 0xFF0000) / 1.671168E7F;
		Static405.aFloatArray53[2] = (float) (super.anInt9133 & 0xFF) / 255.0F;
		Static405.aFloatArray53[1] = (float) (super.anInt9133 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static405.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(Z)V")
	@Override
	protected void method7056() {
		Static405.aFloatArray53[2] = super.aFloat191 * super.aFloat193;
		Static405.aFloatArray53[1] = super.aFloat191 * super.aFloat201;
		Static405.aFloatArray53[0] = super.aFloat189 * super.aFloat191;
		Static405.aFloatArray53[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static405.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(ZII)V")
	public synchronized void method1020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub2 local12 = new Class3_Sub2(arg1);
		local12.aLong262 = arg0;
		this.aClass244_10.method5570(local12);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7142(@OriginalArg(1) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!bea", name = "l", descriptor = "(B)V")
	@Override
	protected void method7145() {
		if (super.aBoolean609) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([IIZIIII)Lclient!mca;")
	@Override
	public Interface12 method7181(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean89 || Static249.method6960(arg5) && Static249.method6960(arg2)) {
			return new Class19_Sub1(this, arg5, arg2, arg1, arg0, 0, arg3);
		} else if (this.aBoolean87) {
			return new Class19_Sub3(this, arg5, arg2, arg0, 0, arg3);
		} else {
			@Pc(49) Class19_Sub1 local49 = new Class19_Sub1(this, Static18.aClass245_3, Static331.aClass204_13, Static538.method7366(arg5), Static538.method7366(arg2));
			local49.method2995(arg5, arg0, arg3, 0, arg2, 0);
			return local49;
		}
	}

	@OriginalMember(owner = "client!bea", name = "P", descriptor = "(I)V")
	@Override
	protected void method7135() {
		this.aBoolean83 = false;
		this.method1017();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I[FIIIILclient!os;Z)Lclient!mca;")
	@Override
	protected Interface12 method7070(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(6) Class245 arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean89 || Static249.method6960(arg0) && Static249.method6960(arg2)) {
			return new Class19_Sub1(this, arg3, arg0, arg2, arg4, arg1, 0, 0);
		} else if (this.aBoolean87) {
			return new Class19_Sub3(this, arg3, arg0, arg2, arg1, 0, 0);
		} else {
			@Pc(46) Class19_Sub1 local46 = new Class19_Sub1(this, arg3, Static331.aClass204_17, Static538.method7366(arg0), Static538.method7366(arg2));
			local46.method206(arg3, arg1, arg2, arg0);
			return local46;
		}
	}

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "()V")
	@Override
	protected void method8079() {
		super.method8079();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!bea", name = "p", descriptor = "(B)V")
	@Override
	protected void method7170() {
		OpenGL.glActiveTexture(super.anInt9134 + 33984);
	}

	@OriginalMember(owner = "client!bea", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method8044(@OriginalArg(0) Class73 arg0) {
	}

	@OriginalMember(owner = "client!bea", name = "bb", descriptor = "(I)V")
	@Override
	protected void method7184() {
		if (super.aBoolean597) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIBLclient!pw;)V")
	@Override
	public void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class265 arg2) {
		@Pc(20) byte local20;
		@Pc(18) int local18;
		if (Static226.aClass265_7 == arg2) {
			local18 = arg0 * 2;
			local20 = 1;
		} else if (Static569.aClass265_11 == arg2) {
			local20 = 3;
			local18 = arg0 + 1;
		} else if (arg2 == Static486.aClass265_10) {
			local18 = arg0 * 3;
			local20 = 4;
		} else if (arg2 == Static87.aClass265_9) {
			local18 = arg0 + 2;
			local20 = 6;
		} else if (arg2 == Static468.aClass265_8) {
			local20 = 5;
			local18 = arg0 + 2;
		} else {
			local18 = arg0;
			local20 = 0;
		}
		OpenGL.glDrawArrays(local20, arg1, local18);
	}

	@OriginalMember(owner = "client!bea", name = "G", descriptor = "(I)V")
	@Override
	public void method7114() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray67, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "(II)V")
	@Override
	public void method7176(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "(I)V")
	@Override
	protected void method7065() {
		OpenGL.glMatrixMode(5890);
		if (Static389.aClass51_16 == super.aClass51Array3[super.anInt9134]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass42_Sub3Array3[super.anInt9134].method7520(Static438.aFloatArray37), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "()Z")
	@Override
	public boolean method8022() {
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method8071(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method8082();
	}

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8992 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt1093, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "()V")
	@Override
	public void method8067() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!os;Lclient!mg;B)Z")
	@Override
	public boolean method7147(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class204 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method7051(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!bea", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt1095;
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(II)Lclient!ia;")
	@Override
	protected Class32 method7111(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class32_Sub2(this, super.aClass284_148);
		} else if (arg0 == 4) {
			return new Class32_Sub8(this, super.aClass284_148, super.aClass318_8);
		} else if (arg0 == 8) {
			return new Class32_Sub5(this, super.aClass284_148, super.aClass318_8);
		} else {
			return super.method7111(arg0);
		}
	}

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "()V")
	@Override
	public void method8082() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "()V")
	@Override
	public void method8087() {
	}

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "(I)V")
	@Override
	protected void method7050() {
		OpenGL.glTexEnvi(8960, 34161, Static408.method5757(super.aClass266Array6[super.anInt9134]));
	}

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "()Lclient!fe;")
	@Override
	public Class102 method8041() {
		@Pc(7) int local7 = -1;
		if (this.aString23.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString23.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString23.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class102(local7, "OpenGL", this.anInt1094, this.aString22, 0L);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZZ[[II)Lclient!pfa;")
	@Override
	public Interface18 method7053(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class19_Sub4(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!mg;Lclient!os;I)Z")
	@Override
	public boolean method7080(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class245 arg1) {
		return true;
	}
}
