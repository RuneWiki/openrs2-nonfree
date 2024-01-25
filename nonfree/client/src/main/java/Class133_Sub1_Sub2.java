import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class133_Sub1_Sub2 extends Class133_Sub1 {

	@OriginalMember(owner = "client!om", name = "Ei", descriptor = "Z")
	private boolean aBoolean498;

	@OriginalMember(owner = "client!om", name = "Gi", descriptor = "Z")
	private boolean aBoolean499;

	@OriginalMember(owner = "client!om", name = "Hi", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!om", name = "Ii", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!om", name = "Ji", descriptor = "Z")
	private boolean aBoolean501;

	@OriginalMember(owner = "client!om", name = "Ki", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!om", name = "Mi", descriptor = "I")
	private int anInt7105;

	@OriginalMember(owner = "client!om", name = "mh", descriptor = "Lclient!tg;")
	private final Class330 aClass330_36 = new Class330();

	@OriginalMember(owner = "client!om", name = "ni", descriptor = "Lclient!tg;")
	private final Class330 aClass330_37 = new Class330();

	@OriginalMember(owner = "client!om", name = "zi", descriptor = "Lclient!tg;")
	private final Class330 aClass330_38 = new Class330();

	@OriginalMember(owner = "client!om", name = "Ai", descriptor = "Lclient!tg;")
	private final Class330 aClass330_39 = new Class330();

	@OriginalMember(owner = "client!om", name = "Bi", descriptor = "Lclient!tg;")
	private final Class330 aClass330_40 = new Class330();

	@OriginalMember(owner = "client!om", name = "Ci", descriptor = "Lclient!tg;")
	private final Class330 aClass330_41 = new Class330();

	@OriginalMember(owner = "client!om", name = "Di", descriptor = "Lclient!tg;")
	private final Class330 aClass330_42 = new Class330();

	@OriginalMember(owner = "client!om", name = "Li", descriptor = "[Lclient!jca;")
	private final Class172_Sub1[] aClass172_Sub1Array1 = new Class172_Sub1[16];

	@OriginalMember(owner = "client!om", name = "Fi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!om", name = "Ni", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!om", name = "Yi", descriptor = "I")
	private final int anInt7108 = 0;

	@OriginalMember(owner = "client!om", name = "zh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!om", name = "Qi", descriptor = "Ljava/lang/String;")
	private final String aString77;

	@OriginalMember(owner = "client!om", name = "Ti", descriptor = "Ljava/lang/String;")
	private final String aString78;

	@OriginalMember(owner = "client!om", name = "Vi", descriptor = "I")
	private final int anInt7106;

	@OriginalMember(owner = "client!om", name = "Si", descriptor = "Z")
	public boolean aBoolean506;

	@OriginalMember(owner = "client!om", name = "Oi", descriptor = "Z")
	private boolean aBoolean503;

	@OriginalMember(owner = "client!om", name = "Ui", descriptor = "Z")
	private final boolean aBoolean507;

	@OriginalMember(owner = "client!om", name = "Pi", descriptor = "Z")
	public final boolean aBoolean504;

	@OriginalMember(owner = "client!om", name = "Wi", descriptor = "Z")
	public final boolean aBoolean508;

	@OriginalMember(owner = "client!om", name = "Ri", descriptor = "Z")
	public final boolean aBoolean505;

	@OriginalMember(owner = "client!om", name = "Zi", descriptor = "[I")
	public final int[] anIntArray377;

	@OriginalMember(owner = "client!om", name = "Xi", descriptor = "I")
	public final int anInt7107;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!la;I)V")
	public Class133_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) Class207 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString77 = OpenGL.glGetString(7936).toLowerCase();
			this.aString78 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString77.indexOf("microsoft") != -1 || this.aString77.indexOf("brian paul") != -1 || this.aString77.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static481.method7093(local109.replace('.', ' '), ' ');
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(135) int local135;
			try {
				@Pc(129) int local129 = Static548.method7986(local117[0]);
				local135 = Static548.method7986(local117[1]);
				this.anInt7106 = local129 * 10 + local135;
			} catch (@Pc(144) NumberFormatException local144) {
				throw new RuntimeException("");
			}
			if (this.anInt7106 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(186) int[] local186 = new int[1];
				OpenGL.glGetIntegerv(34018, local186, 0);
				super.anInt6988 = local186[0];
				if (super.anInt6988 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6984 = 8;
				this.aBoolean506 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean484 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean503 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean478 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean507 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean477 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean504 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean508 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean505 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray377 = new int[super.anInt6988];
				this.anInt7107 = Stream.a() ? 33639 : 5121;
				if (this.aString78.indexOf("radeon") != -1) {
					local135 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static481.method7093(this.aString78.replace('/', ' '), ' ');
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static495.method7354(local308.substring(1, 3))) {
									local291 = true;
									local308 = local308.substring(1);
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local308 = local308.substring(2);
										local289 = true;
									}
									if (local308.length() >= 4 && Static495.method7354(local308.substring(0, 4))) {
										local135 = Static548.method7986(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(377) Exception local377) {
						}
					}
					if (!local291 && !local289) {
						if (local135 >= 7000 && local135 <= 9250) {
							super.aBoolean477 = false;
						}
						if (local135 >= 7000 && local135 <= 7999) {
							this.aBoolean506 = false;
						}
					}
					this.aBoolean503 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString77.indexOf("intel");
				if (this.aBoolean506) {
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
			this.method7295();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!om", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6259(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6278(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local12);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([FIZILclient!lw;III)Lclient!rm;")
	@Override
	protected Interface20 method6274(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class223 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean507 || Static413.method8723(arg1) && Static413.method8723(arg4)) {
			return new Class53_Sub4(this, arg3, arg1, arg4, arg2, arg0, 0, 0);
		} else if (this.aBoolean503) {
			return new Class53_Sub3(this, arg3, arg1, arg4, arg0, 0, 0);
		} else {
			@Pc(49) Class53_Sub4 local49 = new Class53_Sub4(this, arg3, Static20.aClass19_8, Static613.method8740(arg1), Static613.method8740(arg4));
			local49.method4644(arg0, arg3, arg4, arg1);
			return local49;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method6213(@OriginalArg(0) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL1.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!fb;II)V")
	@Override
	public void method6215(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) int arg1) {
		this.aClass172_Sub1Array1[arg1] = (Class172_Sub1) arg0;
	}

	@OriginalMember(owner = "client!om", name = "q", descriptor = "()Lclient!qm;")
	@Override
	public Class294 method7281() {
		@Pc(7) int local7 = -1;
		if (this.aString77.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString77.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString77.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class294(local7, "OpenGL", this.anInt7106, this.aString78, 0L);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
	@Override
	protected void method7236() {
		super.method7236();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
	@Override
	public void method7234() {
	}

	@OriginalMember(owner = "client!om", name = "u", descriptor = "()V")
	@Override
	public void method7305() {
	}

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "(I)V")
	@Override
	protected void method6272() {
		this.method6285();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt6983 > local10; local10++) {
			@Pc(17) Class5_Sub11 local17 = super.aClass5_Sub11Array7[local10];
			@Pc(21) int local21 = local17.method8102();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method8101() / 255.0F;
			Static580.aFloatArray74[0] = local17.method8103();
			Static580.aFloatArray74[1] = local17.method8096();
			Static580.aFloatArray74[2] = local17.method8098();
			Static580.aFloatArray74[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static580.aFloatArray74, 0);
			Static580.aFloatArray74[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static580.aFloatArray74[3] = 1.0F;
			Static580.aFloatArray74[2] = local31 * (float) (local21 & 0xFF);
			Static580.aFloatArray74[0] = (float) (local21 >> 16 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static580.aFloatArray74, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method8099() * local17.method8099()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt6992 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method6272();
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(II)Lclient!wm;")
	@Override
	public Interface27 method7313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!om", name = "Y", descriptor = "(I)V")
	@Override
	protected void method6261() {
		if (super.aBoolean497) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!om", name = "S", descriptor = "(I)V")
	@Override
	protected void method6249() {
		if (super.aBoolean492) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!om", name = "K", descriptor = "(I)V")
	@Override
	protected void method6234() {
		OpenGL.glScissor(super.anInt6987 + super.anInt6998, super.anInt7011 + super.anInt6881 + -super.bf, -super.anInt6987 + super.anInt6991, super.bf + -super.anInt6994);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!lw;Lclient!al;)Z")
	@Override
	public boolean method6283(@OriginalArg(1) Class223 arg0, @OriginalArg(2) Class19 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!om", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!om", name = "m", descriptor = "(B)V")
	@Override
	protected void method6233() {
		if (super.aBoolean479 && !super.aBoolean486) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(ZI)Lclient!fb;")
	@Override
	public Interface6 method6196(@OriginalArg(0) boolean arg0) {
		return new Class172_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!om", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
	@Override
	protected void method6187() {
		OpenGL.glDepthMask(super.aBoolean482 && super.aBoolean483);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([[IBIZ)Lclient!qn;")
	@Override
	public Interface18 method6237(@OriginalArg(0) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return new Class53_Sub2(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!om", name = "G", descriptor = "(I)V")
	@Override
	protected void method6219() {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!oq;ILclient!ri;I)V")
	@Override
	public void method6194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class303 arg5) {
		@Pc(13) byte local13;
		@Pc(17) int local17;
		if (arg5 == Static533.aClass303_5) {
			local17 = arg0 * 2;
			local13 = 1;
		} else if (arg5 == Static48.aClass303_1) {
			local13 = 3;
			local17 = arg0 + 1;
		} else if (arg5 == Static68.aClass303_2) {
			local13 = 4;
			local17 = arg0 * 3;
		} else if (arg5 == Static538.aClass303_6) {
			local13 = 6;
			local17 = arg0 + 2;
		} else if (Static215.aClass303_4 == arg5) {
			local13 = 5;
			local17 = arg0 + 2;
		} else {
			local17 = arg0;
			local13 = 0;
		}
		@Pc(70) Class19 local70 = arg3.method6768();
		@Pc(73) Class172_Sub2 local73 = (Class172_Sub2) arg3;
		local73.method6767();
		OpenGL.glDrawElements(local13, local17, Static204.method3553(local70), local73.method6759() + (long) (local70.anInt281 * arg4));
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(IZ)Lclient!oq;")
	@Override
	public Interface14 method6281(@OriginalArg(1) boolean arg0) {
		return new Class172_Sub2(this, Static20.aClass19_5, arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLclient!qg;)V")
	@Override
	public void method6218(@OriginalArg(1) Class286 arg0) {
		if (arg0 == Static528.aClass286_10) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static497.method7446(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!pea;)V")
	@Override
	public void method7322(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!om", name = "I", descriptor = "(I)V")
	@Override
	protected void method6229() {
		if (Static212.aClass32_3 == super.aClass32_7) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static401.aClass32_6 == super.aClass32_7) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static262.aClass32_4 == super.aClass32_7) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!mq;ZII)V")
	@Override
	protected void method6243(@OriginalArg(0) Class236 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static75.method1296(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(B)V")
	@Override
	protected void method6192() {
		OpenGL.glMatrixMode(5890);
		if (Static255.aClass373_3 == super.aClass373Array3[super.anInt6996]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass113_Sub1Array3[super.anInt6996].method2471(Static471.aFloatArray63), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!om", name = "n", descriptor = "(B)V")
	@Override
	protected void method6236() {
		if (super.aBoolean496) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!om", name = "l", descriptor = "(B)V")
	@Override
	protected void method6232() {
		if (super.aBoolean489) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!lw;IILclient!al;I)Lclient!rm;")
	@Override
	public Interface20 method6275(@OriginalArg(0) Class223 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean507 || Static413.method8723(arg1) && Static413.method8723(arg3)) {
			return new Class53_Sub4(this, arg0, arg2, arg1, arg3);
		} else if (this.aBoolean503) {
			return new Class53_Sub3(this, arg0, arg2, arg1, arg3);
		} else {
			return new Class53_Sub4(this, arg0, arg2, Static613.method8740(arg1), Static613.method8740(arg3));
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!vm;Lclient!vm;FLclient!vm;)Lclient!vm;")
	@Override
	public Class130 method7259(@OriginalArg(0) Class130 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class130 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([BBLclient!lw;III)Lclient!uc;")
	@Override
	public Interface23 method6270(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class223 arg1) {
		return new Class53_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!fk;)V")
	@Override
	public void method6217(@OriginalArg(1) Class90 arg0) {
		@Pc(9) Class40[] local9 = ((Class90_Sub1) arg0).aClass40Array1;
		@Pc(17) int local17 = 0;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class40 local31 = local9[local25];
			@Pc(36) Class172_Sub1 local36 = this.aClass172_Sub1Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(44) int local44 = local36.method4131();
			@Pc(48) long local48 = local36.method6759();
			local36.method6767();
			for (@Pc(53) int local53 = 0; local53 < local31.method830(); local53++) {
				@Pc(60) Class266 local60 = local31.method829(local53);
				if (Static420.aClass266_1 == local60) {
					local23 = true;
					OpenGL.glVertexPointer(3, 5126, local44, local48 + (long) local38);
				} else if (Static420.aClass266_2 == local60) {
					OpenGL.glNormalPointer(5126, local44, local48 + (long) local38);
					local21 = true;
				} else if (local60 == Static420.aClass266_3) {
					OpenGL.glColorPointer(4, 5121, local44, (long) local38 + local48);
					local19 = true;
				} else if (Static420.aClass266_4 == local60) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, (long) local38 + local48);
				} else if (local60 == Static420.aClass266_5) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, (long) local38 + local48);
				} else if (local60 == Static420.aClass266_6) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, (long) local38 + local48);
				} else if (Static420.aClass266_7 == local60) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, (long) local38 + local48);
				}
				local38 += local60.anInt7237;
			}
		}
		if (local23 != this.aBoolean498) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean498 = local23;
		}
		if (local21 != this.aBoolean502) {
			if (local21) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean502 = local21;
		}
		if (this.aBoolean500 != local19) {
			if (local19) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean500 = local19;
		}
		@Pc(268) int local268;
		if (local17 > this.anInt7105) {
			for (local268 = this.anInt7105; local268 < local17; local268++) {
				OpenGL.glClientActiveTexture(local268 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt7105 = local17;
		} else if (local17 < this.anInt7105) {
			for (local268 = local17; local268 < this.anInt7105; local268++) {
				OpenGL.glClientActiveTexture(local268 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt7105 = local17;
			return;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!mq;ZZI)V")
	@Override
	public void method6222(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static75.method1296(arg1));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6209() {
		Static580.aFloatArray74[1] = (float) (super.anInt6990 & 0xFF00) / 65280.0F;
		Static580.aFloatArray74[0] = (float) (super.anInt6990 & 0xFF0000) / 1.671168E7F;
		Static580.aFloatArray74[2] = (float) (super.anInt6990 & 0xFF) / 255.0F;
		Static580.aFloatArray74[3] = (float) (super.anInt6990 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static580.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!om", name = "F", descriptor = "(I)F")
	@Override
	protected float method6214() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "(II)V")
	@Override
	public void method6167(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!lw;I[BIIZ)Lclient!rm;")
	@Override
	protected Interface20 method6230(@OriginalArg(2) Class223 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean507 || Static413.method8723(arg1) && Static413.method8723(arg3)) {
			return new Class53_Sub4(this, arg0, arg1, arg3, arg4, arg2, 0, 0);
		} else if (this.aBoolean503) {
			return new Class53_Sub3(this, arg0, arg1, arg3, arg2, 0, 0);
		} else {
			@Pc(51) Class53_Sub4 local51 = new Class53_Sub4(this, arg0, Static20.aClass19_4, Static613.method8740(arg1), Static613.method8740(arg3));
			local51.method4638(0, arg0, arg3, arg1, arg2);
			return local51;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lclient!hu;")
	@Override
	public Interface7 method7271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7239(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7282(arg2, arg3);
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V")
	@Override
	protected void method6184() {
		this.method6287();
	}

	@OriginalMember(owner = "client!om", name = "fb", descriptor = "(I)V")
	private void method6287() {
		if (this.aBoolean501) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass242_5.method5447()) {
			if (!this.aBoolean499) {
				OpenGL.glLoadMatrixf(super.aClass113_Sub1_18.method2471(Static471.aFloatArray63), 0);
				this.aBoolean499 = true;
				this.method6224();
				this.method6272();
			}
			if (super.aBoolean475) {
				this.aBoolean501 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass113_Sub1_15.method2471(Static471.aFloatArray63), 0);
				this.aBoolean501 = true;
			}
		} else if (super.aBoolean475) {
			OpenGL.glLoadIdentity();
			this.aBoolean501 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass113_Sub1_15.method2471(Static471.aFloatArray63), 0);
			this.aBoolean501 = false;
		}
	}

	@OriginalMember(owner = "client!om", name = "H", descriptor = "(I)V")
	@Override
	public void method6224() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray57, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!om", name = "v", descriptor = "()Z")
	@Override
	public boolean method7310() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "l", descriptor = "(Z)V")
	@Override
	protected void method6210() {
		if (super.aBoolean491 && super.aBoolean493 && super.anInt7003 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!om", name = "A", descriptor = "()Z")
	@Override
	public boolean method7319() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	@Override
	protected void method6152() {
		OpenGL.glViewport(super.anInt6998, super.anInt7011, super.anInt6805, super.anInt6881);
	}

	@OriginalMember(owner = "client!om", name = "db", descriptor = "(I)V")
	@Override
	protected void method6279() {
		OpenGL.glTexEnvi(8960, 34161, Static502.method7531(super.aClass151Array6[super.anInt6996]));
	}

	@OriginalMember(owner = "client!om", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6881 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt7107, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7252(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub41 local19;
		while (!this.aClass330_37.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_37.method7911();
			Static100.anIntArray121[local7++] = (int) local19.aLong278;
			super.anInt6969 -= local19.anInt7600;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static100.anIntArray121, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static100.anIntArray121, 0);
			local7 = 0;
		}
		while (!this.aClass330_38.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_38.method7911();
			Static100.anIntArray121[local7++] = (int) local19.aLong278;
			super.anInt6964 -= local19.anInt7600;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static100.anIntArray121, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static100.anIntArray121, 0);
			local7 = 0;
		}
		while (!this.aClass330_39.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_39.method7911();
			Static100.anIntArray121[local7++] = local19.anInt7600;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static100.anIntArray121, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static100.anIntArray121, 0);
			local7 = 0;
		}
		while (!this.aClass330_40.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_40.method7911();
			Static100.anIntArray121[local7++] = (int) local19.aLong278;
			super.anInt6972 -= local19.anInt7600;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static100.anIntArray121, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static100.anIntArray121, 0);
		}
		while (!this.aClass330_36.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_36.method7911();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7600);
		}
		@Pc(222) Class5 local222;
		while (!this.aClass330_41.method7918()) {
			local222 = this.aClass330_41.method7911();
			OpenGL.glDeleteProgramARB((int) local222.aLong278);
		}
		while (!this.aClass330_42.method7918()) {
			local222 = this.aClass330_42.method7911();
			OpenGL.glDeleteObjectARB(local222.aLong278);
		}
		while (!this.aClass330_36.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_36.method7911();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7600);
		}
		if (this.E() > 100663296 && this.aLong177 + 60000L < Static95.method1587()) {
			System.gc();
			this.aLong177 = Static95.method1587();
		}
		super.method7252(local11);
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "(B)V")
	@Override
	protected void method6228() {
		Static580.aFloatArray74[1] = super.aFloat119 * super.aFloat129;
		Static580.aFloatArray74[0] = super.aFloat126 * super.aFloat129;
		Static580.aFloatArray74[2] = super.aFloat132 * super.aFloat129;
		Static580.aFloatArray74[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static580.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!om", name = "m", descriptor = "()V")
	@Override
	public void method7267() {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Lclient!oca;")
	@Override
	protected Class27 method6188(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class27_Sub4(this, super.aClass207_81);
		} else if (arg0 == 4) {
			return new Class27_Sub5(this, super.aClass207_81, super.aClass250_5);
		} else if (arg0 == 8) {
			return new Class27_Sub10(this, super.aClass207_81, super.aClass250_5);
		} else {
			return super.method6188(arg0);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V")
	public synchronized void method6288(@OriginalArg(0) long arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong278 = arg0;
		this.aClass330_42.method7917(local7);
	}

	@OriginalMember(owner = "client!om", name = "C", descriptor = "(I)V")
	@Override
	protected void method6203() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray52, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6223(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(19) Long local19 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local19);
	}

	@OriginalMember(owner = "client!om", name = "D", descriptor = "(I)V")
	@Override
	protected void method6205() {
		super.aFloat130 = super.anInt6985 - super.anInt7006;
		super.aFloat125 = (float) -super.anInt7003 + super.aFloat130;
		if ((float) super.anInt7002 > super.aFloat125) {
			super.aFloat125 = super.anInt7002;
		}
		OpenGL.glFogf(2915, super.aFloat125);
		OpenGL.glFogf(2916, super.aFloat130);
		Static580.aFloatArray74[2] = (float) (super.anInt6997 & 0xFF) / 255.0F;
		Static580.aFloatArray74[1] = (float) (super.anInt6997 & 0xFF00) / 65280.0F;
		Static580.aFloatArray74[0] = (float) (super.anInt6997 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static580.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!om", name = "A", descriptor = "(I)V")
	@Override
	protected void method6201() {
		@Pc(13) int local13 = this.anIntArray377[super.anInt6996];
		if (local13 != 0) {
			this.anIntArray377[super.anInt6996] = 0;
			OpenGL.glBindTexture(local13, 0);
			OpenGL.glDisable(local13);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	public synchronized void method6289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg1);
		local8.aLong278 = arg0;
		this.aClass330_37.method7917(local8);
	}

	@OriginalMember(owner = "client!om", name = "n", descriptor = "()V")
	@Override
	public void method7268() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!om", name = "M", descriptor = "(I)V")
	@Override
	protected void method6238() {
		if (super.aBoolean490) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!om", name = "r", descriptor = "(I)V")
	@Override
	protected void method6175() {
		OpenGL.glTexEnvi(8960, 34162, Static502.method7531(super.aClass151Array5[super.anInt6996]));
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "()V")
	@Override
	public void method7247() {
		if (super.anInt6805 <= 0 && super.anInt6881 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt6987;
		@Pc(16) int local16 = super.anInt6991;
		@Pc(19) int local19 = super.anInt6994;
		@Pc(22) int local22 = super.bf;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6179();
		this.method6162(false);
		this.method6252(false);
		this.method6178(false);
		this.method6259(false);
		this.method6153(null);
		this.method6277(false, -2, false);
		this.method6268(1);
		this.method6208(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6805, super.anInt6881, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!ri;ZI)V")
	@Override
	public void method6266(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(3) int arg2) {
		@Pc(25) byte local25;
		@Pc(23) int local23;
		if (arg1 == Static533.aClass303_5) {
			local23 = arg0 * 2;
			local25 = 1;
		} else if (arg1 == Static48.aClass303_1) {
			local25 = 3;
			local23 = arg0 + 1;
		} else if (Static68.aClass303_2 == arg1) {
			local23 = arg0 * 3;
			local25 = 4;
		} else if (Static538.aClass303_6 == arg1) {
			local25 = 6;
			local23 = arg0 + 2;
		} else if (arg1 == Static215.aClass303_4) {
			local23 = arg0 + 2;
			local25 = 5;
		} else {
			local25 = 0;
			local23 = arg0;
		}
		OpenGL.glDrawArrays(local25, arg2, local23);
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "(B)V")
	@Override
	protected void method6216() {
		OpenGL.glActiveTexture(super.anInt6996 + 33984);
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V")
	@Override
	protected void method6191() {
		for (@Pc(6) int local6 = super.anInt6988 - 1; local6 >= 0; local6--) {
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
		@Pc(77) float[] local77 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(79) int local79 = 0; local79 < 8; local79++) {
			@Pc(85) int local85 = local79 + 16384;
			OpenGL.glLightfv(local85, 4608, local77, 0);
			OpenGL.glLightf(local85, 4615, 0.0F);
			OpenGL.glLightf(local85, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method6191();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!al;Lclient!lw;)Z")
	@Override
	public boolean method6263(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class223 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!hu;Lclient!wm;)Lclient!pea;")
	@Override
	public Interface16 method7288(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Interface27 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!om", name = "w", descriptor = "(I)V")
	@Override
	protected void method6193() {
		this.aBoolean499 = false;
		this.method6287();
	}

	@OriginalMember(owner = "client!om", name = "P", descriptor = "(I)V")
	@Override
	protected void method6245() {
		Static580.aFloatArray74[3] = 1.0F;
		Static580.aFloatArray74[1] = super.aFloat119 * super.aFloat127;
		Static580.aFloatArray74[2] = super.aFloat127 * super.aFloat132;
		Static580.aFloatArray74[0] = super.aFloat126 * super.aFloat127;
		OpenGL.glLightfv(16384, 4609, Static580.aFloatArray74, 0);
		Static580.aFloatArray74[0] = -super.aFloat124 * super.aFloat126;
		Static580.aFloatArray74[3] = 1.0F;
		Static580.aFloatArray74[1] = -super.aFloat124 * super.aFloat119;
		Static580.aFloatArray74[2] = super.aFloat132 * -super.aFloat124;
		OpenGL.glLightfv(16385, 4609, Static580.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III[IIIZ)Lclient!rm;")
	@Override
	public Interface20 method6269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (this.aBoolean507 || Static413.method8723(arg4) && Static413.method8723(arg1)) {
			return new Class53_Sub4(this, arg4, arg1, arg5, arg3, 0, arg0);
		} else if (this.aBoolean503) {
			return new Class53_Sub3(this, arg4, arg1, arg3, 0, arg0);
		} else {
			@Pc(45) Class53_Sub4 local45 = new Class53_Sub4(this, Static576.aClass223_16, Static20.aClass19_4, Static613.method8740(arg4), Static613.method8740(arg1));
			local45.method4635(arg0, arg3, arg4, arg1, 0, 0);
			return local45;
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(IZ)V")
	@Override
	public void method6260(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "(II)V")
	public synchronized void method6291(@OriginalArg(0) int arg0) {
		@Pc(13) Class5 local13 = new Class5();
		local13.aLong278 = arg0;
		this.aClass330_41.method7917(local13);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[Lclient!bl;)Lclient!fk;")
	@Override
	public Class90 method6154(@OriginalArg(1) Class40[] arg0) {
		return new Class90_Sub1(arg0);
	}

	@OriginalMember(owner = "client!om", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt7108;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7321(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BII)V")
	public synchronized void method6292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg1);
		local8.aLong278 = arg0;
		this.aClass330_38.method7917(local8);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V")
	@Override
	public void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method6189(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}
}
