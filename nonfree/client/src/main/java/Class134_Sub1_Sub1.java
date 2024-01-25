import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class134_Sub1_Sub1 extends Class134_Sub1 {

	@OriginalMember(owner = "client!hp", name = "hi", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!hp", name = "ii", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!hp", name = "ji", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!hp", name = "ki", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!hp", name = "li", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!hp", name = "ni", descriptor = "I")
	private int anInt3982;

	@OriginalMember(owner = "client!hp", name = "oi", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!hp", name = "Rg", descriptor = "Lclient!wba;")
	private final Class353 aClass353_18 = new Class353();

	@OriginalMember(owner = "client!hp", name = "xh", descriptor = "Lclient!wba;")
	private final Class353 aClass353_19 = new Class353();

	@OriginalMember(owner = "client!hp", name = "bi", descriptor = "Lclient!wba;")
	private final Class353 aClass353_20 = new Class353();

	@OriginalMember(owner = "client!hp", name = "di", descriptor = "Lclient!wba;")
	private final Class353 aClass353_21 = new Class353();

	@OriginalMember(owner = "client!hp", name = "ei", descriptor = "Lclient!wba;")
	private final Class353 aClass353_22 = new Class353();

	@OriginalMember(owner = "client!hp", name = "fi", descriptor = "Lclient!wba;")
	private final Class353 aClass353_23 = new Class353();

	@OriginalMember(owner = "client!hp", name = "gi", descriptor = "Lclient!wba;")
	private final Class353 aClass353_24 = new Class353();

	@OriginalMember(owner = "client!hp", name = "mi", descriptor = "[Lclient!gr;")
	private final Class129_Sub1[] aClass129_Sub1Array1 = new Class129_Sub1[16];

	@OriginalMember(owner = "client!hp", name = "pi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!hp", name = "qi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!hp", name = "ui", descriptor = "I")
	private final int anInt3984 = 0;

	@OriginalMember(owner = "client!hp", name = "Xg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!hp", name = "vi", descriptor = "Ljava/lang/String;")
	private final String aString34;

	@OriginalMember(owner = "client!hp", name = "xi", descriptor = "Ljava/lang/String;")
	private final String aString35;

	@OriginalMember(owner = "client!hp", name = "ri", descriptor = "I")
	private final int anInt3983;

	@OriginalMember(owner = "client!hp", name = "Ci", descriptor = "Z")
	public boolean aBoolean306;

	@OriginalMember(owner = "client!hp", name = "wi", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!hp", name = "Bi", descriptor = "Z")
	private final boolean aBoolean305;

	@OriginalMember(owner = "client!hp", name = "yi", descriptor = "Z")
	public final boolean aBoolean304;

	@OriginalMember(owner = "client!hp", name = "ti", descriptor = "Z")
	public final boolean aBoolean302;

	@OriginalMember(owner = "client!hp", name = "si", descriptor = "Z")
	public final boolean aBoolean301;

	@OriginalMember(owner = "client!hp", name = "Ai", descriptor = "[I")
	public final int[] anIntArray319;

	@OriginalMember(owner = "client!hp", name = "zi", descriptor = "I")
	public final int anInt3985;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!pu;I)V")
	public Class134_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class270 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString34 = OpenGL.glGetString(7936).toLowerCase();
			this.aString35 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString34.indexOf("microsoft") != -1 || this.aString34.indexOf("brian paul") != -1 || this.aString34.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static500.method7455(' ', local109.replace('.', ' '));
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(138) int local138;
			try {
				@Pc(132) int local132 = Static21.method7701(local117[0]);
				local138 = Static21.method7701(local117[1]);
				this.anInt3983 = local138 + local132 * 10;
			} catch (@Pc(147) NumberFormatException local147) {
				throw new RuntimeException("");
			}
			if (this.anInt3983 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(184) int[] local184 = new int[1];
				OpenGL.glGetIntegerv(34018, local184, 0);
				super.anInt8455 = local184[0];
				if (super.anInt8455 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8453 = 8;
				this.aBoolean306 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean644 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean303 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean647 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean305 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean648 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean304 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean302 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean301 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray319 = new int[super.anInt8455];
				this.anInt3985 = Stream.c() ? 33639 : 5121;
				if (this.aString35.indexOf("radeon") != -1) {
					local138 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static500.method7455(' ', this.aString35.replace('/', ' '));
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static368.method4957(local308.substring(1, 3))) {
									local308 = local308.substring(1);
									local291 = true;
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local289 = true;
										local308 = local308.substring(2);
									}
									if (local308.length() >= 4 && Static368.method4957(local308.substring(0, 4))) {
										local138 = Static21.method7701(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(378) Exception local378) {
						}
					}
					if (!local291 && !local289) {
						if (local138 >= 7000 && local138 <= 9250) {
							super.aBoolean648 = false;
						}
						if (local138 >= 7000 && local138 <= 7999) {
							this.aBoolean306 = false;
						}
					}
					this.aBoolean303 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString34.indexOf("intel");
				if (this.aBoolean306) {
					try {
						@Pc(430) int[] local430 = new int[1];
						OpenGL.glGenBuffersARB(1, local430, 0);
					} catch (@Pc(436) Throwable local436) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(442) Throwable local442) {
			local442.printStackTrace();
			this.method6923();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6763() {
		super.aFloat187 = -super.anInt8437 + super.anInt8440;
		super.aFloat201 = (float) -super.anInt8430 + super.aFloat187;
		if ((float) super.anInt8463 > super.aFloat201) {
			super.aFloat201 = super.anInt8463;
		}
		OpenGL.glFogf(2915, super.aFloat201);
		OpenGL.glFogf(2916, super.aFloat187);
		Static530.aFloatArray60[2] = (float) (super.anInt8460 & 0xFF) / 255.0F;
		Static530.aFloatArray60[1] = (float) (super.anInt8460 & 0xFF00) / 65280.0F;
		Static530.aFloatArray60[0] = (float) (super.anInt8460 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static530.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "(B)V")
	@Override
	protected void method6841() {
		Static530.aFloatArray60[0] = (float) (super.anInt8451 & 0xFF0000) / 1.671168E7F;
		Static530.aFloatArray60[1] = (float) (super.anInt8451 & 0xFF00) / 65280.0F;
		Static530.aFloatArray60[2] = (float) (super.anInt8451 & 0xFF) / 255.0F;
		Static530.aFloatArray60[3] = (float) (super.anInt8451 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static530.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "(Z)V")
	@Override
	protected void method6797() {
		OpenGL.glTexEnvi(8960, 34161, Static371.method4992(super.aClass82Array5[super.anInt8433]));
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "()Z")
	@Override
	public boolean method6917() {
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(BZ)Lclient!rn;")
	@Override
	public Interface20 method6804(@OriginalArg(1) boolean arg0) {
		return new Class129_Sub2(this, Static215.aClass155_11, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6774(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILclient!bca;)V")
	@Override
	public void method6829(@OriginalArg(0) int arg0, @OriginalArg(2) Interface4 arg1) {
		this.aClass129_Sub1Array1[arg0] = (Class129_Sub1) arg1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[Lclient!af;)Lclient!rd;")
	@Override
	public Class284 method6855(@OriginalArg(1) Class7[] arg0) {
		return new Class284_Sub1(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!lca;Lclient!ig;Z)Z")
	@Override
	public boolean method6777(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class155 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6925(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub13 local19;
		while (!this.aClass353_19.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_19.method7688();
			Static534.anIntArray679[local11++] = (int) local19.aLong301;
			super.anInt8423 -= local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static534.anIntArray679, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static534.anIntArray679, 0);
			local11 = 0;
		}
		while (!this.aClass353_20.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_20.method7688();
			Static534.anIntArray679[local11++] = (int) local19.aLong301;
			super.anInt8425 -= local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static534.anIntArray679, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static534.anIntArray679, 0);
			local11 = 0;
		}
		while (!this.aClass353_21.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_21.method7688();
			Static534.anIntArray679[local11++] = local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static534.anIntArray679, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static534.anIntArray679, 0);
			local11 = 0;
		}
		while (!this.aClass353_22.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_22.method7688();
			Static534.anIntArray679[local11++] = (int) local19.aLong301;
			super.anInt8420 -= local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static534.anIntArray679, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static534.anIntArray679, 0);
		}
		while (!this.aClass353_18.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_18.method7688();
			OpenGL.glDeleteLists((int) local19.aLong301, local19.anInt1812);
		}
		@Pc(214) Class1 local214;
		while (!this.aClass353_23.method7686()) {
			local214 = this.aClass353_23.method7688();
			OpenGL.glDeleteProgramARB((int) local214.aLong301);
		}
		while (!this.aClass353_24.method7686()) {
			local214 = this.aClass353_24.method7688();
			OpenGL.glDeleteObjectARB(local214.aLong301);
		}
		while (!this.aClass353_18.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_18.method7688();
			OpenGL.glDeleteLists((int) local19.aLong301, local19.anInt1812);
		}
		if (this.b() > 100663296 && Static413.method5668() > this.aLong111 + 60000L) {
			System.gc();
			this.aLong111 = Static413.method5668();
		}
		super.method6925(local9);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method6750(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZ[IIII)Lclient!oi;")
	@Override
	public Interface14 method6809(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean305 || Static230.method3483(arg3) && Static230.method3483(arg4)) {
			return new Class14_Sub2(this, arg3, arg4, arg1, arg2, 0, arg5);
		} else if (this.aBoolean303) {
			return new Class14_Sub1(this, arg3, arg4, arg2, 0, arg5);
		} else {
			@Pc(46) Class14_Sub2 local46 = new Class14_Sub2(this, Static129.aClass203_5, Static215.aClass155_10, Static457.method6299(arg3), Static457.method6299(arg4));
			local46.method2134(arg3, 0, arg5, arg2, 0, arg4);
			return local46;
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "()V")
	@Override
	public void method6898() {
	}

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "(I)V")
	@Override
	protected void method6757() {
		Static530.aFloatArray60[3] = 1.0F;
		Static530.aFloatArray60[2] = super.aFloat198 * super.aFloat195;
		Static530.aFloatArray60[1] = super.bf * super.aFloat198;
		Static530.aFloatArray60[0] = super.aFloat189 * super.aFloat198;
		OpenGL.glLightfv(16384, 4609, Static530.aFloatArray60, 0);
		Static530.aFloatArray60[0] = super.aFloat189 * -super.aFloat190;
		Static530.aFloatArray60[1] = super.bf * -super.aFloat190;
		Static530.aFloatArray60[3] = 1.0F;
		Static530.aFloatArray60[2] = -super.aFloat190 * super.aFloat195;
		OpenGL.glLightfv(16385, 4609, Static530.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(JI)V")
	public synchronized void method3208(@OriginalArg(0) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong301 = arg0;
		this.aClass353_24.method7679(local7);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "()V")
	@Override
	public void method6934() {
	}

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "(I)V")
	@Override
	protected void method6848() {
		if (super.aBoolean642) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "(I)V")
	@Override
	protected void method6793() {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!kda;IIZLclient!rn;II)V")
	@Override
	public void method6765(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface20 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (arg0 == Static288.aClass185_3) {
			local20 = arg1 * 2;
			local16 = 1;
		} else if (arg0 == Static62.aClass185_2) {
			local20 = arg1 + 1;
			local16 = 3;
		} else if (Static470.aClass185_5 == arg0) {
			local16 = 4;
			local20 = arg1 * 3;
		} else if (Static567.aClass185_6 == arg0) {
			local16 = 6;
			local20 = arg1 + 2;
		} else if (arg0 == Static29.aClass185_1) {
			local16 = 5;
			local20 = arg1 + 2;
		} else {
			local16 = 0;
			local20 = arg1;
		}
		@Pc(74) Class155 local74 = arg3.method7388();
		@Pc(77) Class129_Sub2 local77 = (Class129_Sub2) arg3;
		local77.method7378();
		OpenGL.glDrawElements(local16, local20, Static117.method1848(local74), local77.method7381() + (long) (local74.anInt4123 * arg5));
	}

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "(Z)V")
	@Override
	protected void method6795() {
		this.method6839();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt8456; local10++) {
			@Pc(17) Class1_Sub18 local17 = super.aClass1_Sub18Array6[local10];
			@Pc(21) int local21 = local17.method4102();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method4099() / 255.0F;
			Static530.aFloatArray60[0] = local17.method4107();
			Static530.aFloatArray60[1] = local17.method4101();
			Static530.aFloatArray60[2] = local17.method4098();
			Static530.aFloatArray60[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static530.aFloatArray60, 0);
			Static530.aFloatArray60[3] = 1.0F;
			Static530.aFloatArray60[1] = (float) (local21 >> 8 & 0xFF) * local31;
			Static530.aFloatArray60[2] = local31 * (float) (local21 & 0xFF);
			Static530.aFloatArray60[0] = (float) (local21 >> 16 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static530.aFloatArray60, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method4104() * local17.method4104()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt8457 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method6795();
	}

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "(B)V")
	@Override
	protected void method6840() {
		OpenGL.glActiveTexture(super.anInt8433 + 33984);
	}

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "()V")
	@Override
	public void method6969() {
		if (super.anInt8399 <= 0 && super.anInt8356 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt8434;
		@Pc(19) int local19 = super.anInt8432;
		@Pc(22) int local22 = super.anInt8447;
		@Pc(25) int local25 = super.anInt8461;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6849();
		this.method6782(false);
		this.method6735(false);
		this.method6731(false);
		this.method6827(false);
		this.method6766(null);
		this.method6857(false, false, -2);
		this.method6724(1);
		this.method6746(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8399, super.anInt8356, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6944();
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6792() {
		if (super.aBoolean632 && super.aBoolean634 && super.anInt8430 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "()V")
	@Override
	public void method6944() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ[BILclient!lca;IZI)Lclient!oi;")
	@Override
	protected Interface14 method6733(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class203 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aBoolean305 || Static230.method3483(arg1) && Static230.method3483(arg3)) {
			return new Class14_Sub2(this, arg2, arg1, arg3, arg4, arg0, 0, 0);
		} else if (this.aBoolean303) {
			return new Class14_Sub1(this, arg2, arg1, arg3, arg0, 0, 0);
		} else {
			@Pc(46) Class14_Sub2 local46 = new Class14_Sub2(this, arg2, Static215.aClass155_10, Static457.method6299(arg1), Static457.method6299(arg3));
			local46.method2131(arg2, 0, arg3, arg1, arg0);
			return local46;
		}
	}

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "(I)V")
	@Override
	public void method6755() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray47, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray52, 0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!kda;II)V")
	@Override
	public void method6723(@OriginalArg(1) Class185 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) byte local21;
		@Pc(19) int local19;
		if (Static288.aClass185_3 == arg0) {
			local19 = arg2 * 2;
			local21 = 1;
		} else if (arg0 == Static62.aClass185_2) {
			local19 = arg2 + 1;
			local21 = 3;
		} else if (Static470.aClass185_5 == arg0) {
			local19 = arg2 * 3;
			local21 = 4;
		} else if (arg0 == Static567.aClass185_6) {
			local21 = 6;
			local19 = arg2 + 2;
		} else if (arg0 == Static29.aClass185_1) {
			local19 = arg2 + 2;
			local21 = 5;
		} else {
			local19 = arg2;
			local21 = 0;
		}
		OpenGL.glDrawArrays(local21, arg1, local19);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZLclient!kj;IIZ)V")
	@Override
	public void method6791(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static558.method7591(arg1));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "(I)V")
	@Override
	protected void method6739() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass309Array3[super.anInt8433] == Static428.aClass309_6) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass113_Sub3Array3[super.anInt8433].method6052(Static331.aFloatArray32), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!rd;)V")
	@Override
	public void method6743(@OriginalArg(1) Class284 arg0) {
		@Pc(9) Class7[] local9 = ((Class284_Sub1) arg0).aClass7Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		for (@Pc(29) int local29 = 0; local29 < local9.length; local29++) {
			@Pc(35) Class7 local35 = local9[local29];
			@Pc(40) Class129_Sub1 local40 = this.aClass129_Sub1Array1[local29];
			@Pc(42) int local42 = 0;
			@Pc(46) int local46 = local40.method2469();
			@Pc(50) long local50 = local40.method7381();
			local40.method7378();
			for (@Pc(55) int local55 = 0; local55 < local35.method109(); local55++) {
				@Pc(62) Class198 local62 = local35.method106(local55);
				if (Static282.aClass198_1 == local62) {
					local27 = true;
					OpenGL.glVertexPointer(3, 5126, local46, local50 + (long) local42);
				} else if (Static282.aClass198_2 == local62) {
					local25 = true;
					OpenGL.glNormalPointer(5126, local46, local50 + (long) local42);
				} else if (local62 == Static282.aClass198_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local46, (long) local42 + local50);
				} else if (local62 == Static282.aClass198_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local46, (long) local42 + local50);
				} else if (local62 == Static282.aClass198_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local46, (long) local42 + local50);
				} else if (local62 == Static282.aClass198_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local46, (long) local42 + local50);
				} else if (Static282.aClass198_7 == local62) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local46, local50 + (long) local42);
				}
				local42 += local62.anInt4934;
			}
		}
		if (local27 != this.aBoolean299) {
			if (local27) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean299 = local27;
		}
		if (local25 != this.aBoolean297) {
			if (local25) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean297 = local25;
		}
		if (this.aBoolean296 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean296 = local13;
		}
		@Pc(270) int local270;
		if (this.anInt3982 < local11) {
			for (local270 = this.anInt3982; local270 < local11; local270++) {
				OpenGL.glClientActiveTexture(local270 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt3982 = local11;
		} else if (local11 < this.anInt3982) {
			for (local270 = local11; local270 < this.anInt3982; local270++) {
				OpenGL.glClientActiveTexture(local270 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt3982 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "(I)V")
	@Override
	protected void method6769() {
		OpenGL.glViewport(super.anInt8429, super.anInt8449, super.anInt8399, super.anInt8356);
	}

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "(I)V")
	@Override
	protected void method6745() {
		Static530.aFloatArray60[1] = super.bf * super.aFloat196;
		Static530.aFloatArray60[3] = 1.0F;
		Static530.aFloatArray60[2] = super.aFloat195 * super.aFloat196;
		Static530.aFloatArray60[0] = super.aFloat189 * super.aFloat196;
		OpenGL.glLightModelfv(2899, Static530.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!qs;)V")
	@Override
	public void method6836(@OriginalArg(1) Class278 arg0) {
		if (arg0 == Static586.aClass278_3) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static586.method5389(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(II)Lclient!vca;")
	@Override
	protected Class34 method6800(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class34_Sub2(this, super.aClass270_101);
		} else if (arg0 == 4) {
			return new Class34_Sub7(this, super.aClass270_101, super.aClass331_8);
		} else if (arg0 == 8) {
			return new Class34_Sub10(this, super.aClass270_101, super.aClass331_8);
		} else {
			return super.method6800(arg0);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6930(@OriginalArg(0) Class22 arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "(B)V")
	@Override
	protected void method6799() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray48, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6751(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "(B)V")
	@Override
	protected void method6815() {
		this.aBoolean300 = false;
		this.method3214();
	}

	@OriginalMember(owner = "client!hp", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6827(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([FILclient!lca;IIZII)Lclient!oi;")
	@Override
	protected Interface14 method6759(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (this.aBoolean305 || Static230.method3483(arg1) && Static230.method3483(arg3)) {
			return new Class14_Sub2(this, arg2, arg1, arg3, arg4, arg0, 0, 0);
		} else if (this.aBoolean303) {
			return new Class14_Sub1(this, arg2, arg1, arg3, arg0, 0, 0);
		} else {
			@Pc(46) Class14_Sub2 local46 = new Class14_Sub2(this, arg2, Static215.aClass155_14, Static457.method6299(arg1), Static457.method6299(arg3));
			local46.method2136(arg2, arg1, arg3, arg0);
			return local46;
		}
	}

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "(B)V")
	@Override
	protected void method6798() {
		OpenGL.glTexEnvi(8960, 34162, Static371.method4992(super.aClass82Array6[super.anInt8433]));
	}

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "()V")
	@Override
	public void method6971() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "()Lclient!is;")
	@Override
	public Class162 method6962() {
		@Pc(7) int local7 = -1;
		if (this.aString34.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString34.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString34.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class162(local7, "OpenGL", this.anInt3983, this.aString35, 0L);
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(B)V")
	@Override
	protected void method6767() {
		if (super.aBoolean652) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "()Z")
	@Override
	public boolean method6906() {
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[BIIILclient!lca;)Lclient!jb;")
	@Override
	public Interface11 method6842(@OriginalArg(1) byte[] arg0, @OriginalArg(5) Class203 arg1) {
		return new Class14_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ig;ZLclient!lca;)Z")
	@Override
	public boolean method6820(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class203 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!hp", name = "Q", descriptor = "(I)V")
	@Override
	protected void method6844() {
		if (super.aClass231_7 == Static451.aClass231_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static433.aClass231_5 == super.aClass231_7) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static212.aClass231_3 == super.aClass231_7) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!kj;IIZ)V")
	@Override
	protected void method6845(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static558.method7591(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ig;Lclient!lca;IB)Lclient!oi;")
	@Override
	public Interface14 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean305 || Static230.method3483(arg3) && Static230.method3483(arg0)) {
			return new Class14_Sub2(this, arg2, arg1, arg3, arg0);
		} else if (this.aBoolean303) {
			return new Class14_Sub1(this, arg2, arg1, arg3, arg0);
		} else {
			return new Class14_Sub2(this, arg2, arg1, Static457.method6299(arg3), Static457.method6299(arg0));
		}
	}

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "(II)V")
	public synchronized void method3210(@OriginalArg(0) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong301 = arg0;
		this.aClass353_23.method7679(local7);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(IZ)Lclient!bca;")
	@Override
	public Interface4 method6805(@OriginalArg(1) boolean arg0) {
		return new Class129_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(ZI)V")
	@Override
	public void method6780(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!hp", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(B)V")
	@Override
	protected void method6796() {
		if (super.aBoolean637) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "(I)F")
	@Override
	protected float method6810() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "()V")
	@Override
	protected void method6923() {
		super.method6923();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(IIZ)V")
	public synchronized void method3211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg1);
		local8.aLong301 = arg0;
		this.aClass353_19.method7679(local8);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([[IZIB)Lclient!gp;")
	@Override
	public Interface8 method6771(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return new Class14_Sub4(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	@Override
	public void method6903(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "(B)V")
	@Override
	protected void method6790() {
		for (@Pc(6) int local6 = super.anInt8455 - 1; local6 >= 0; local6--) {
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
		@Pc(75) float[] local75 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(77) int local77 = 0; local77 < 8; local77++) {
			@Pc(83) int local83 = local77 + 16384;
			OpenGL.glLightfv(local83, 4608, local75, 0);
			OpenGL.glLightf(local83, 4615, 0.0F);
			OpenGL.glLightf(local83, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method6790();
	}

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "(I)V")
	@Override
	protected void method6762() {
		if (super.aBoolean651) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!jba;Lclient!jba;FLclient!jba;)Lclient!jba;")
	@Override
	public Class83 method6895(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class83 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)V")
	public synchronized void method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub13 local14 = new Class1_Sub13(arg1);
		local14.aLong301 = arg0;
		this.aClass353_20.method7679(local14);
	}

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "(I)V")
	@Override
	protected void method6772() {
		OpenGL.glDepthMask(super.aBoolean646 && super.aBoolean639);
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6747() {
		@Pc(9) int local9 = this.anIntArray319[super.anInt8433];
		if (local9 != 0) {
			this.anIntArray319[super.anInt8433] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "()V")
	@Override
	public void method6907() {
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8356 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt3985, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!hp", name = "W", descriptor = "(I)V")
	private void method3214() {
		if (this.aBoolean298) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass240_7.method4883()) {
			if (!this.aBoolean300) {
				OpenGL.glLoadMatrixf(super.aClass113_Sub3_18.method6052(Static331.aFloatArray32), 0);
				this.aBoolean300 = true;
				this.method6755();
				this.method6795();
			}
			if (super.aBoolean631) {
				this.aBoolean298 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass113_Sub3_15.method6052(Static331.aFloatArray32), 0);
				this.aBoolean298 = true;
			}
		} else if (super.aBoolean631) {
			OpenGL.glLoadIdentity();
			this.aBoolean298 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass113_Sub3_15.method6052(Static331.aFloatArray32), 0);
			this.aBoolean298 = false;
		}
	}

	@OriginalMember(owner = "client!hp", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt3984;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6794(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local12);
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(B)V")
	@Override
	protected void method6779() {
		this.method3214();
	}

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6811() {
		OpenGL.glScissor(super.anInt8434 + super.anInt8429, -super.anInt8461 + super.anInt8356 + super.anInt8449, super.anInt8432 - super.anInt8434, -super.anInt8447 + super.anInt8461);
	}

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "(B)V")
	@Override
	protected void method6801() {
		if (super.aBoolean640) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(II)V")
	@Override
	public void method6852(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "(B)V")
	@Override
	protected void method6807() {
		if (super.aBoolean649 && !super.aBoolean636) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}
}
