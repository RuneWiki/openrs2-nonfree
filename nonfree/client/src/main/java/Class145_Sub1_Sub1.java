import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class145_Sub1_Sub1 extends Class145_Sub1 {

	@OriginalMember(owner = "client!mba", name = "ti", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!mba", name = "si", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!mba", name = "ai", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!mba", name = "Xh", descriptor = "Z")
	private boolean aBoolean526;

	@OriginalMember(owner = "client!mba", name = "Zg", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!mba", name = "di", descriptor = "Z")
	private boolean aBoolean528;

	@OriginalMember(owner = "client!mba", name = "ah", descriptor = "I")
	private int anInt6413;

	@OriginalMember(owner = "client!mba", name = "ph", descriptor = "Lclient!cga;")
	private final Class60 aClass60_119 = new Class60();

	@OriginalMember(owner = "client!mba", name = "Og", descriptor = "Lclient!cga;")
	private final Class60 aClass60_120 = new Class60();

	@OriginalMember(owner = "client!mba", name = "ni", descriptor = "Lclient!cga;")
	private final Class60 aClass60_121 = new Class60();

	@OriginalMember(owner = "client!mba", name = "Ng", descriptor = "Lclient!cga;")
	private final Class60 aClass60_122 = new Class60();

	@OriginalMember(owner = "client!mba", name = "Fi", descriptor = "Lclient!cga;")
	private final Class60 aClass60_123 = new Class60();

	@OriginalMember(owner = "client!mba", name = "Wh", descriptor = "Lclient!cga;")
	private final Class60 aClass60_124 = new Class60();

	@OriginalMember(owner = "client!mba", name = "Rh", descriptor = "Lclient!cga;")
	private final Class60 aClass60_125 = new Class60();

	@OriginalMember(owner = "client!mba", name = "zg", descriptor = "[Lclient!vla;")
	private final Class213_Sub2[] aClass213_Sub2Array1 = new Class213_Sub2[16];

	@OriginalMember(owner = "client!mba", name = "mh", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!mba", name = "sh", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!mba", name = "Ug", descriptor = "I")
	private final int anInt6416 = 0;

	@OriginalMember(owner = "client!mba", name = "Sg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!mba", name = "Gg", descriptor = "Ljava/lang/String;")
	private final String aString67;

	@OriginalMember(owner = "client!mba", name = "hi", descriptor = "Ljava/lang/String;")
	private final String aString68;

	@OriginalMember(owner = "client!mba", name = "Ag", descriptor = "I")
	private final int anInt6415;

	@OriginalMember(owner = "client!mba", name = "ch", descriptor = "Z")
	public boolean aBoolean533;

	@OriginalMember(owner = "client!mba", name = "mi", descriptor = "Z")
	private boolean aBoolean530;

	@OriginalMember(owner = "client!mba", name = "yi", descriptor = "Z")
	private final boolean aBoolean534;

	@OriginalMember(owner = "client!mba", name = "th", descriptor = "Z")
	public final boolean aBoolean529;

	@OriginalMember(owner = "client!mba", name = "Dh", descriptor = "Z")
	public final boolean aBoolean532;

	@OriginalMember(owner = "client!mba", name = "Pg", descriptor = "Z")
	public final boolean aBoolean531;

	@OriginalMember(owner = "client!mba", name = "Hi", descriptor = "[I")
	public final int[] anIntArray422;

	@OriginalMember(owner = "client!mba", name = "zi", descriptor = "I")
	public final int anInt6414;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!nca;I)V")
	public Class145_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) Class254 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString67 = OpenGL.glGetString(7936).toLowerCase();
			this.aString68 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString67.indexOf("microsoft") != -1 || this.aString67.indexOf("brian paul") != -1 || this.aString67.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(118) String local118 = OpenGL.glGetString(7938);
			@Pc(126) String[] local126 = Static100.method1530(local118.replace('.', ' '), ' ');
			if (local126.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(148) int local148;
			try {
				@Pc(142) int local142 = Static171.method2545(local126[0]);
				local148 = Static171.method2545(local126[1]);
				this.anInt6415 = local142 * 10 + local148;
			} catch (@Pc(158) NumberFormatException local158) {
				throw new RuntimeException("");
			}
			if (this.anInt6415 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(202) int[] local202 = new int[1];
				OpenGL.glGetIntegerv(34018, local202, 0);
				super.anInt11280 = local202[0];
				if (super.anInt11280 < 2) {
					throw new RuntimeException("");
				}
				super.anInt11252 = 8;
				this.aBoolean533 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean957 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean530 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean958 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean534 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean949 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean529 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean532 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean531 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray422 = new int[super.anInt11280];
				this.anInt6414 = Stream.b() ? 33639 : 5121;
				if (this.aString68.indexOf("radeon") != -1) {
					local148 = 0;
					@Pc(331) boolean local331 = false;
					@Pc(333) boolean local333 = false;
					@Pc(342) String[] local342 = Static100.method1530(this.aString68.replace('/', ' '), ' ');
					for (@Pc(344) int local344 = 0; local344 < local342.length; local344++) {
						@Pc(350) String local350 = local342[local344];
						try {
							if (local350.length() > 0) {
								if (local350.charAt(0) == 'x' && local350.length() >= 3 && Static716.method9519(local350.substring(1, 3))) {
									local350 = local350.substring(1);
									local333 = true;
								}
								if (local350.equals("hd")) {
									local331 = true;
								} else {
									if (local350.startsWith("hd")) {
										local331 = true;
										local350 = local350.substring(2);
									}
									if (local350.length() >= 4 && Static716.method9519(local350.substring(0, 4))) {
										local148 = Static171.method2545(local350.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(434) Exception local434) {
						}
					}
					if (!local333 && !local331) {
						if (local148 >= 7000 && local148 <= 9250) {
							super.aBoolean949 = false;
						}
						if (local148 >= 7000 && local148 <= 7999) {
							this.aBoolean533 = false;
						}
					}
					this.aBoolean530 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString67.indexOf("intel");
				if (this.aBoolean533) {
					try {
						@Pc(504) int[] local504 = new int[1];
						OpenGL.glGenBuffersARB(1, local504, 0);
					} catch (@Pc(510) Throwable local510) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(516) Throwable local516) {
			local516.printStackTrace();
			this.method9661();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!jt;Lclient!mh;)Lclient!cla;")
	@Override
	public Interface1 method9697(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface16 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "Q", descriptor = "(I)V")
	@Override
	protected void method9845() {
		super.aFloat183 = (float) (super.anInt11258 - super.anInt11259);
		super.aFloat192 = (float) -super.anInt11261 + super.aFloat183;
		if ((float) super.anInt11250 > super.aFloat192) {
			super.aFloat192 = (float) super.anInt11250;
		}
		OpenGL.glFogf(2915, super.aFloat192);
		OpenGL.glFogf(2916, super.aFloat183);
		Static529.aFloatArray58[0] = (float) (super.anInt11257 & 0xFF0000) / 1.671168E7F;
		Static529.aFloatArray58[2] = (float) (super.anInt11257 & 0xFF) / 255.0F;
		Static529.aFloatArray58[1] = (float) (super.anInt11257 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static529.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "(B)V")
	@Override
	protected void method9771(@OriginalArg(0) byte arg0) {
		this.method9730();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt11264; local10++) {
			@Pc(17) Class2_Sub7 local17 = super.aClass2_Sub7Array8[local10];
			@Pc(21) int local21 = local17.method8170();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method8169() / 255.0F;
			Static529.aFloatArray58[0] = (float) local17.method8171();
			Static529.aFloatArray58[1] = (float) local17.method8174();
			Static529.aFloatArray58[2] = (float) local17.method8172();
			Static529.aFloatArray58[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static529.aFloatArray58, 0);
			Static529.aFloatArray58[0] = local31 * (float) (local21 >> 16 & 0xFF);
			Static529.aFloatArray58[1] = (float) (local21 >> 8 & 0xFF) * local31;
			Static529.aFloatArray58[3] = 1.0F;
			Static529.aFloatArray58[2] = (float) (local21 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static529.aFloatArray58, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method8173() * local17.method8173()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt11278) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		if (arg0 > -126) {
			this.aBoolean528 = true;
		}
		super.method9771((byte) -128);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([Lclient!mj;I)Lclient!oka;")
	@Override
	public Class277 method9830(@OriginalArg(0) Class243[] arg0) {
		return new Class277_Sub1(arg0);
	}

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "(II)V")
	@Override
	public void method9804(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!cla;)V")
	@Override
	public void method9658(@OriginalArg(0) Interface1 arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZ)Lclient!uh;")
	@Override
	public Interface24 method9825(@OriginalArg(0) boolean arg0) {
		return new Class213_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([BILclient!pm;III)Lclient!fi;")
	@Override
	public Interface7 method9732(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class295 arg1) {
		return new Class55_Sub4(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!mba", name = "T", descriptor = "(I)V")
	@Override
	protected void method9833() {
		if (super.aBoolean960) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "()V")
	@Override
	public void method9636() {
		if (super.anInt11157 <= 0 && super.anInt11144 <= 0) {
			return;
		}
		@Pc(22) int local22 = super.anInt11243;
		@Pc(25) int local25 = super.anInt11279;
		@Pc(28) int local28 = super.anInt11253;
		@Pc(31) int local31 = super.anInt11242;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method9763();
		this.method9768(false);
		this.method9801(false);
		this.method9839(false);
		this.method9822(false);
		this.method9754((Interface9) null);
		this.method9724(-2, false, false);
		this.method9797(1);
		this.method9832(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt11157, super.anInt11144, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!hk;Lclient!pm;)Z")
	@Override
	public boolean method9764(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Class295 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mba", name = "K", descriptor = "(I)V")
	@Override
	protected void method9781() {
		this.aBoolean524 = false;
		this.method5739();
	}

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "(B)F")
	@Override
	protected float method9823() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "()V")
	@Override
	public void method9667() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "()Z")
	@Override
	public boolean method9650() {
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIILclient!ra;)V")
	@Override
	public void method9772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class317 arg2) {
		@Pc(30) byte local30;
		@Pc(34) int local34;
		if (Static708.aClass317_9 == arg2) {
			local34 = arg1 * 2;
			local30 = 1;
		} else if (Static296.aClass317_5 == arg2) {
			local34 = arg1 + 1;
			local30 = 3;
		} else if (Static601.aClass317_8 == arg2) {
			local34 = arg1 * 3;
			local30 = 4;
		} else if (Static289.aClass317_4 == arg2) {
			local30 = 6;
			local34 = arg1 + 2;
		} else if (arg2 == Static513.aClass317_7) {
			local34 = arg1 + 2;
			local30 = 5;
		} else {
			local30 = 0;
			local34 = arg1;
		}
		OpenGL.glDrawArrays(local30, arg0, local34);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9767(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!mba", name = "v", descriptor = "()V")
	@Override
	public void method9673() {
	}

	@OriginalMember(owner = "client!mba", name = "C", descriptor = "(I)V")
	@Override
	protected void method9849() {
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)V")
	public synchronized void method5734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2 local8 = new Class2_Sub2(arg0);
		local8.aLong352 = (long) arg1;
		this.aClass60_120.method1233(local8);
	}

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!mba", name = "u", descriptor = "()V")
	@Override
	public void method9706() {
	}

	@OriginalMember(owner = "client!mba", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt11144 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt6414, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mba", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method9822(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!mba", name = "W", descriptor = "(I)V")
	@Override
	protected void method9749() {
		if (super.aBoolean946) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(II)Lclient!jt;")
	@Override
	public Interface11 method9657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "R", descriptor = "(I)V")
	@Override
	protected void method9806() {
		if (super.aClass323_8 == Static396.aClass323_3) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass323_8 == Static589.aClass323_7) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass323_8 == Static572.aClass323_5) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	@Override
	protected Object method9836(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[FILclient!pm;IZ)Lclient!de;")
	@Override
	protected Interface4 method9805(@OriginalArg(2) int arg0, @OriginalArg(3) float[] arg1, @OriginalArg(5) Class295 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean534 || Static457.method6641(arg0) && Static457.method6641(arg3)) {
			return new Class55_Sub3(this, arg2, arg0, arg3, arg4, arg1, 0, 0);
		} else if (this.aBoolean530) {
			return new Class55_Sub2(this, arg2, arg0, arg3, arg1, 0, 0);
		} else {
			@Pc(66) Class55_Sub3 local66 = new Class55_Sub3(this, arg2, Static243.aClass158_14, Static330.method4577(arg0), Static330.method4577(arg3));
			local66.method6862(arg2, arg0, arg3, arg1);
			return local66;
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(BI)V")
	public synchronized void method5736(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong352 = (long) arg0;
		this.aClass60_124.method1233(local7);
	}

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "(I)V")
	@Override
	protected void method9729() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray73, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V")
	@Override
	public void method9659(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "()V")
	@Override
	public void method9660() {
	}

	@OriginalMember(owner = "client!mba", name = "I", descriptor = "(I)V")
	@Override
	protected void method9783() {
		if (super.aBoolean947) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ[[II)Lclient!on;")
	@Override
	public Interface18 method9740(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class55_Sub1(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method9643(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub2 local19;
		while (!this.aClass60_120.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_120.method1225();
			Static73.anIntArray108[local11++] = (int) local19.aLong352;
			super.anInt11239 -= local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static73.anIntArray108, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static73.anIntArray108, 0);
			local11 = 0;
		}
		while (!this.aClass60_121.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_121.method1225();
			Static73.anIntArray108[local11++] = (int) local19.aLong352;
			super.anInt11238 -= local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static73.anIntArray108, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static73.anIntArray108, 0);
			local11 = 0;
		}
		while (!this.aClass60_122.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_122.method1225();
			Static73.anIntArray108[local11++] = local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static73.anIntArray108, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static73.anIntArray108, 0);
			local11 = 0;
		}
		while (!this.aClass60_123.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_123.method1225();
			Static73.anIntArray108[local11++] = (int) local19.aLong352;
			super.anInt11240 -= local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static73.anIntArray108, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static73.anIntArray108, 0);
		}
		while (!this.aClass60_119.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_119.method1225();
			OpenGL.glDeleteLists((int) local19.aLong352, local19.anInt41);
		}
		@Pc(220) Class2 local220;
		while (!this.aClass60_124.method1221()) {
			local220 = this.aClass60_124.method1225();
			OpenGL.glDeleteProgramARB((int) local220.aLong352);
		}
		while (!this.aClass60_125.method1221()) {
			local220 = this.aClass60_125.method1225();
			OpenGL.glDeleteObjectARB(local220.aLong352);
		}
		while (!this.aClass60_119.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_119.method1225();
			OpenGL.glDeleteLists((int) local19.aLong352, local19.anInt41);
		}
		if (this.E() > 100663296 && Static567.method7863() > this.aLong182 + 60000L) {
			System.gc();
			this.aLong182 = Static567.method7863();
		}
		super.method9643(local9);
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(II)Lclient!mh;")
	@Override
	public Interface16 method9645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	@Override
	public Class74 method9678(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class74 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method9762(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!pm;ZLclient!hk;)Z")
	@Override
	public boolean method9843(@OriginalArg(0) Class295 arg0, @OriginalArg(2) Class158 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "(B)V")
	@Override
	protected void method9720() {
		if (super.aBoolean944) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "(I)V")
	@Override
	protected void method9810() {
		if (super.aBoolean951 && super.aBoolean961 && super.anInt11261 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(Z)V")
	@Override
	protected void method9752() {
		OpenGL.glViewport(super.anInt11248, super.anInt11254, super.anInt11157, super.anInt11144);
	}

	@OriginalMember(owner = "client!mba", name = "w", descriptor = "(B)V")
	@Override
	protected void method9787() {
		OpenGL.glDepthMask(super.aBoolean953 && super.aBoolean959);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZLclient!tfa;IZ)V")
	@Override
	public void method9829(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static656.method9008(arg2));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "(Z)V")
	@Override
	protected void method9794() {
		OpenGL.glActiveTexture(super.anInt11277 + 33984);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9639(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method9644(arg2, arg3);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!ra;IIIILclient!lg;)V")
	@Override
	public void method9778(@OriginalArg(0) int arg0, @OriginalArg(1) Class317 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface15 arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static708.aClass317_9 == arg1) {
			local12 = arg2 * 2;
			local14 = 1;
		} else if (arg1 == Static296.aClass317_5) {
			local14 = 3;
			local12 = arg2 + 1;
		} else if (Static601.aClass317_8 == arg1) {
			local12 = arg2 * 3;
			local14 = 4;
		} else if (arg1 == Static289.aClass317_4) {
			local14 = 6;
			local12 = arg2 + 2;
		} else if (Static513.aClass317_7 == arg1) {
			local14 = 5;
			local12 = arg2 + 2;
		} else {
			local12 = arg2;
			local14 = 0;
		}
		@Pc(78) Class158 local78 = arg5.method4690();
		@Pc(90) Class213_Sub1 local90 = (Class213_Sub1) arg5;
		local90.method9220();
		OpenGL.glDrawElements(local14, local12, Static438.method6362(local78), local90.method9221() + (long) (local78.anInt3816 * arg0));
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)V")
	public synchronized void method5738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2 local8 = new Class2_Sub2(arg0);
		local8.aLong352 = (long) arg1;
		this.aClass60_121.method1233(local8);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(IB)Lclient!au;")
	@Override
	protected Class26 method9814(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class26_Sub9(this, super.aClass254_173);
		} else if (arg0 == 4) {
			return new Class26_Sub3(this, super.aClass254_173, super.aClass270_8);
		} else if (arg0 == 8) {
			return new Class26_Sub5(this, super.aClass254_173, super.aClass270_8);
		} else {
			return super.method9814(arg0);
		}
	}

	@OriginalMember(owner = "client!mba", name = "y", descriptor = "(I)V")
	@Override
	protected void method9788() {
		OpenGL.glTexEnvi(8960, 34161, Static49.method633(super.aClass293Array6[super.anInt11277]));
	}

	@OriginalMember(owner = "client!mba", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt6416;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!oka;)V")
	@Override
	public void method9766(@OriginalArg(1) Class277 arg0) {
		@Pc(9) Class243[] local9 = ((Class277_Sub1) arg0).aClass243Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class243 local25 = local9[local19];
			@Pc(30) Class213_Sub2 local30 = this.aClass213_Sub2Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method9232();
			@Pc(40) long local40 = local30.method9221();
			local30.method9220();
			for (@Pc(45) int local45 = 0; local25.method5863() > local45; local45++) {
				@Pc(54) Class115 local54 = local25.method5862(local45);
				if (Static169.aClass115_1 == local54) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local36, local40 + (long) local32);
				} else if (Static169.aClass115_2 == local54) {
					OpenGL.glNormalPointer(5126, local36, local40 + (long) local32);
					local15 = true;
				} else if (local54 == Static169.aClass115_3) {
					OpenGL.glColorPointer(4, 5121, local36, local40 + (long) local32);
					local13 = true;
				} else if (Static169.aClass115_4 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, local40 + (long) local32);
				} else if (Static169.aClass115_5 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, local40 + (long) local32);
				} else if (Static169.aClass115_6 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, local40 + (long) local32);
				} else if (local54 == Static169.aClass115_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, local40 + (long) local32);
				}
				local32 += local54.anInt2905;
			}
		}
		if (this.aBoolean527 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean527 = local17;
		}
		if (local15 != this.aBoolean526) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean526 = local15;
		}
		if (this.aBoolean528 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean528 = local13;
		}
		@Pc(307) int local307;
		if (local11 > this.anInt6413) {
			for (local307 = this.anInt6413; local307 < local11; local307++) {
				OpenGL.glClientActiveTexture(local307 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt6413 = local11;
		} else if (this.anInt6413 > local11) {
			for (local307 = local11; local307 < this.anInt6413; local307++) {
				OpenGL.glClientActiveTexture(local307 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt6413 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "(Z)V")
	@Override
	public void method9854(@OriginalArg(0) boolean arg0) {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray74, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray68, 0);
		if (!arg0) {
			Static385.anIntArray420 = null;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!pm;ILclient!hk;II)Lclient!de;")
	@Override
	public Interface4 method9782(@OriginalArg(0) Class295 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean534 || Static457.method6641(arg1) && Static457.method6641(arg3)) {
			return new Class55_Sub3(this, arg0, arg2, arg1, arg3);
		} else if (this.aBoolean530) {
			return new Class55_Sub2(this, arg0, arg2, arg1, arg3);
		} else {
			return new Class55_Sub3(this, arg0, arg2, Static330.method4577(arg1), Static330.method4577(arg3));
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method9847(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(11) Long local11 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local11);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BILclient!uh;)V")
	@Override
	public void method9800(@OriginalArg(1) int arg0, @OriginalArg(2) Interface24 arg1) {
		this.aClass213_Sub2Array1[arg0] = (Class213_Sub2) arg1;
	}

	@OriginalMember(owner = "client!mba", name = "B", descriptor = "()V")
	@Override
	protected void method9642() {
		super.method9642();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!mba", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!mba", name = "A", descriptor = "(B)V")
	@Override
	protected void method9840(@OriginalArg(0) byte arg0) {
		for (@Pc(6) int local6 = super.anInt11280 - 1; local6 >= 0; local6--) {
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
		if (arg0 > -25) {
			this.method9854(false);
		}
		@Pc(89) float[] local89 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(91) int local91 = 0; local91 < 8; local91++) {
			@Pc(99) int local99 = local91 + 16384;
			OpenGL.glLightfv(local99, 4608, local89, 0);
			OpenGL.glLightf(local99, 4615, 0.0F);
			OpenGL.glLightf(local99, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method9840((byte) -57);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZI)Lclient!lg;")
	@Override
	public Interface15 method9776(@OriginalArg(0) boolean arg0) {
		return new Class213_Sub1(this, Static243.aClass158_11, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "z", descriptor = "(I)V")
	@Override
	protected void method9739() {
		Static529.aFloatArray58[0] = super.aFloat181 * super.aFloat191;
		Static529.aFloatArray58[3] = 1.0F;
		Static529.aFloatArray58[1] = super.aFloat188 * super.aFloat191;
		Static529.aFloatArray58[2] = super.aFloat184 * super.aFloat191;
		OpenGL.glLightfv(16384, 4609, Static529.aFloatArray58, 0);
		Static529.aFloatArray58[1] = -super.aFloat195 * super.aFloat188;
		Static529.aFloatArray58[3] = 1.0F;
		Static529.aFloatArray58[2] = -super.aFloat195 * super.aFloat184;
		Static529.aFloatArray58[0] = super.aFloat181 * -super.aFloat195;
		OpenGL.glLightfv(16385, 4609, Static529.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method9748(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!mba", name = "H", descriptor = "(I)V")
	@Override
	protected void method9809() {
		OpenGL.glTexEnvi(8960, 34162, Static49.method633(super.aClass293Array5[super.anInt11277]));
	}

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "(I)V")
	@Override
	protected void method9850() {
		Static529.aFloatArray58[2] = (float) (super.anInt11249 & 0xFF) / 255.0F;
		Static529.aFloatArray58[3] = (float) (super.anInt11249 >>> 24) / 255.0F;
		Static529.aFloatArray58[1] = (float) (super.anInt11249 & 0xFF00) / 65280.0F;
		Static529.aFloatArray58[0] = (float) (super.anInt11249 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static529.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII[IIZ)Lclient!de;")
	@Override
	public Interface4 method9802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) boolean arg5) {
		if (this.aBoolean534 || Static457.method6641(arg1) && Static457.method6641(arg0)) {
			return new Class55_Sub3(this, arg1, arg0, arg5, arg4, 0, arg3);
		} else if (this.aBoolean530) {
			return new Class55_Sub2(this, arg1, arg0, arg4, 0, arg3);
		} else {
			@Pc(52) Class55_Sub3 local52 = new Class55_Sub3(this, Static165.aClass295_6, Static243.aClass158_10, Static330.method4577(arg1), Static330.method4577(arg0));
			local52.method6855(0, 0, arg3, arg4, arg0, arg1);
			return local52;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II[BIIZLclient!pm;I)Lclient!de;")
	@Override
	protected Interface4 method9775(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) Class295 arg4) {
		if (this.aBoolean534 || Static457.method6641(arg0) && Static457.method6641(arg2)) {
			return new Class55_Sub3(this, arg4, arg0, arg2, arg3, arg1, 0, 0);
		} else if (this.aBoolean530) {
			return new Class55_Sub2(this, arg4, arg0, arg2, arg1, 0, 0);
		} else {
			@Pc(46) Class55_Sub3 local46 = new Class55_Sub3(this, arg4, Static243.aClass158_10, Static330.method4577(arg0), Static330.method4577(arg2));
			local46.method6854(0, arg1, arg0, arg4, arg2);
			return local46;
		}
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(Z)V")
	@Override
	protected void method9789() {
		if (super.aBoolean963) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!mba", name = "ab", descriptor = "(I)V")
	@Override
	protected void method9780() {
		Static529.aFloatArray58[2] = super.aFloat194 * super.aFloat184;
		Static529.aFloatArray58[1] = super.aFloat188 * super.aFloat194;
		Static529.aFloatArray58[3] = 1.0F;
		Static529.aFloatArray58[0] = super.aFloat181 * super.aFloat194;
		OpenGL.glLightModelfv(2899, Static529.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!ifa;B)V")
	@Override
	public void method9736(@OriginalArg(0) Class175 arg0) {
		if (arg0 == Static153.aClass175_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(28) int local28 = Static711.method9465(arg0);
		OpenGL.glTexGeni(8192, 9472, local28);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local28);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local28);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!mba", name = "u", descriptor = "(I)V")
	@Override
	protected void method9737() {
		this.method5739();
	}

	@OriginalMember(owner = "client!mba", name = "B", descriptor = "(B)V")
	private void method5739() {
		if (this.aBoolean525) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass291_9.method7016()) {
			if (!this.aBoolean524) {
				OpenGL.glLoadMatrixf(super.aClass86_Sub2_18.method2737(Static246.aFloatArray23), 0);
				this.aBoolean524 = true;
				this.method9854(true);
				this.method9771((byte) -127);
			}
			if (super.aBoolean942) {
				this.aBoolean525 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass86_Sub2_15.method2737(Static246.aFloatArray23), 0);
				this.aBoolean525 = true;
			}
		} else if (super.aBoolean942) {
			OpenGL.glLoadIdentity();
			this.aBoolean525 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass86_Sub2_15.method2737(Static246.aFloatArray23), 0);
			this.aBoolean525 = false;
		}
	}

	@OriginalMember(owner = "client!mba", name = "q", descriptor = "(B)V")
	@Override
	protected void method9760() {
		if (super.aBoolean955 && !super.aBoolean954) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mba", name = "y", descriptor = "(B)V")
	@Override
	protected void method9779() {
		@Pc(17) int local17 = this.anIntArray422[super.anInt11277];
		if (local17 != 0) {
			this.anIntArray422[super.anInt11277] = 0;
			OpenGL.glBindTexture(local17, 0);
			OpenGL.glDisable(local17);
		}
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(II)V")
	@Override
	public void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!mba", name = "y", descriptor = "()Z")
	@Override
	public boolean method9632() {
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZIZLclient!tfa;)V")
	@Override
	protected void method9842(@OriginalArg(1) int arg0, @OriginalArg(3) Class352 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static656.method9008(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IJ)V")
	public synchronized void method5742(@OriginalArg(1) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong352 = arg0;
		this.aClass60_125.method1233(local7);
	}

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "(Z)V")
	@Override
	protected void method9826() {
		OpenGL.glScissor(super.anInt11248 + super.anInt11243, super.anInt11254 + super.anInt11144 + -super.anInt11242, super.anInt11279 - super.anInt11243, super.anInt11242 - super.anInt11253);
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(B)V")
	@Override
	protected void method9846() {
		OpenGL.glMatrixMode(5890);
		if (Static540.aClass146_8 == super.aClass146Array3[super.anInt11277]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass86_Sub2Array3[super.anInt11277].method2737(Static246.aFloatArray23), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mba", name = "q", descriptor = "()Lclient!bo;")
	@Override
	public Class47 method9653() {
		@Pc(7) int local7 = -1;
		if (this.aString67.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString67.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString67.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class47(local7, "OpenGL", this.anInt6415, this.aString68, 0L);
	}
}
