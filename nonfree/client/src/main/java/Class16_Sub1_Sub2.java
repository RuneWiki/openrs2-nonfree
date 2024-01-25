import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class16_Sub1_Sub2 extends Class16_Sub1 {

	@OriginalMember(owner = "client!oia", name = "Di", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!oia", name = "Ei", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!oia", name = "Fi", descriptor = "Z")
	private boolean aBoolean570;

	@OriginalMember(owner = "client!oia", name = "Gi", descriptor = "Z")
	private boolean aBoolean571;

	@OriginalMember(owner = "client!oia", name = "Hi", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!oia", name = "Ji", descriptor = "Z")
	private boolean aBoolean572;

	@OriginalMember(owner = "client!oia", name = "Ki", descriptor = "I")
	private int anInt7564;

	@OriginalMember(owner = "client!oia", name = "gi", descriptor = "Lclient!jia;")
	private final Class193 aClass193_40 = new Class193();

	@OriginalMember(owner = "client!oia", name = "wi", descriptor = "Lclient!jia;")
	private final Class193 aClass193_41 = new Class193();

	@OriginalMember(owner = "client!oia", name = "xi", descriptor = "Lclient!jia;")
	private final Class193 aClass193_42 = new Class193();

	@OriginalMember(owner = "client!oia", name = "yi", descriptor = "Lclient!jia;")
	private final Class193 aClass193_43 = new Class193();

	@OriginalMember(owner = "client!oia", name = "zi", descriptor = "Lclient!jia;")
	private final Class193 aClass193_44 = new Class193();

	@OriginalMember(owner = "client!oia", name = "Ai", descriptor = "Lclient!jia;")
	private final Class193 aClass193_45 = new Class193();

	@OriginalMember(owner = "client!oia", name = "Bi", descriptor = "Lclient!jia;")
	private final Class193 aClass193_46 = new Class193();

	@OriginalMember(owner = "client!oia", name = "Ci", descriptor = "[Lclient!og;")
	private final Class53_Sub1[] aClass53_Sub1Array1 = new Class53_Sub1[16];

	@OriginalMember(owner = "client!oia", name = "Ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!oia", name = "Li", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!oia", name = "Ti", descriptor = "I")
	private final int anInt7566 = 0;

	@OriginalMember(owner = "client!oia", name = "Rh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!oia", name = "Xi", descriptor = "Ljava/lang/String;")
	private final String aString99;

	@OriginalMember(owner = "client!oia", name = "Qi", descriptor = "Ljava/lang/String;")
	private final String aString98;

	@OriginalMember(owner = "client!oia", name = "Wi", descriptor = "I")
	private final int anInt7567;

	@OriginalMember(owner = "client!oia", name = "Ui", descriptor = "Z")
	public boolean aBoolean577;

	@OriginalMember(owner = "client!oia", name = "Si", descriptor = "Z")
	private boolean aBoolean576;

	@OriginalMember(owner = "client!oia", name = "Mi", descriptor = "Z")
	private final boolean aBoolean573;

	@OriginalMember(owner = "client!oia", name = "Ni", descriptor = "Z")
	public final boolean aBoolean574;

	@OriginalMember(owner = "client!oia", name = "Vi", descriptor = "Z")
	public final boolean aBoolean578;

	@OriginalMember(owner = "client!oia", name = "Ri", descriptor = "Z")
	public final boolean aBoolean575;

	@OriginalMember(owner = "client!oia", name = "Pi", descriptor = "[I")
	public final int[] anIntArray455;

	@OriginalMember(owner = "client!oia", name = "Oi", descriptor = "I")
	public final int anInt7565;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!gj;I)V")
	public Class16_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(4) Class143 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString99 = OpenGL.glGetString(7936).toLowerCase();
			this.aString98 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString99.indexOf("microsoft") != -1 || this.aString99.indexOf("brian paul") != -1 || this.aString99.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static325.method5062(local108.replace('.', ' '), ' ');
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(132) int local132;
			try {
				@Pc(126) int local126 = Static305.method4695(local116[0]);
				local132 = Static305.method4695(local116[1]);
				this.anInt7567 = local132 + local126 * 10;
			} catch (@Pc(141) NumberFormatException local141) {
				throw new RuntimeException("");
			}
			if (this.anInt7567 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(183) int[] local183 = new int[1];
				OpenGL.glGetIntegerv(34018, local183, 0);
				super.anInt7465 = local183[0];
				if (super.anInt7465 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7473 = 8;
				this.aBoolean577 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean561 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean576 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean563 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean573 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean558 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean574 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean578 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean575 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray455 = new int[super.anInt7465];
				this.anInt7565 = Stream.c() ? 33639 : 5121;
				if (this.aString98.indexOf("radeon") != -1) {
					local132 = 0;
					@Pc(285) boolean local285 = false;
					@Pc(287) boolean local287 = false;
					@Pc(296) String[] local296 = Static325.method5062(this.aString98.replace('/', ' '), ' ');
					for (@Pc(298) int local298 = 0; local298 < local296.length; local298++) {
						@Pc(304) String local304 = local296[local298];
						try {
							if (local304.length() > 0) {
								if (local304.charAt(0) == 'x' && local304.length() >= 3 && Static363.method5417(local304.substring(1, 3))) {
									local304 = local304.substring(1);
									local287 = true;
								}
								if (local304.equals("hd")) {
									local285 = true;
								} else {
									if (local304.startsWith("hd")) {
										local304 = local304.substring(2);
										local285 = true;
									}
									if (local304.length() >= 4 && Static363.method5417(local304.substring(0, 4))) {
										local132 = Static305.method4695(local304.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(374) Exception local374) {
						}
					}
					if (!local287 && !local285) {
						if (local132 >= 7000 && local132 <= 7999) {
							this.aBoolean577 = false;
						}
						if (local132 >= 7000 && local132 <= 9250) {
							super.aBoolean558 = false;
						}
					}
					this.aBoolean576 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString99.indexOf("intel");
				if (this.aBoolean577) {
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
			this.method8199();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oia", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt7566;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!so;ZLclient!ul;)Z")
	@Override
	public boolean method6292(@OriginalArg(0) Class330 arg0, @OriginalArg(2) Class361 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8174(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8175(arg2, arg3);
	}

	@OriginalMember(owner = "client!oia", name = "m", descriptor = "(B)V")
	@Override
	protected void method6249() {
		if (super.aBoolean564 && !super.aBoolean559) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "(ZI)Lclient!ta;")
	@Override
	public Interface22 method6262(@OriginalArg(0) boolean arg0) {
		return new Class53_Sub2(this, Static553.aClass330_15, arg0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)V")
	@Override
	public void method8125(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "([BZILclient!ul;IIII)Lclient!gl;")
	@Override
	protected Interface11 method6253(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class361 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean573 || Static9.method94(arg3) && Static9.method94(arg4)) {
			return new Class40_Sub2(this, arg2, arg3, arg4, arg1, arg0, 0, 0);
		} else if (this.aBoolean576) {
			return new Class40_Sub4(this, arg2, arg3, arg4, arg0, 0, 0);
		} else {
			@Pc(60) Class40_Sub2 local60 = new Class40_Sub2(this, arg2, Static553.aClass330_14, Static527.method7377(arg3), Static527.method7377(arg4));
			local60.method8764(arg0, arg4, arg2, 0, arg3);
			return local60;
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)V")
	public synchronized void method6330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub53 local8 = new Class3_Sub53(arg0);
		local8.aLong309 = (long) arg1;
		this.aClass193_41.method4462(local8);
	}

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "(B)V")
	@Override
	protected void method6296() {
	}

	@OriginalMember(owner = "client!oia", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6232(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!ul;BLclient!so;)Z")
	@Override
	public boolean method6204(@OriginalArg(0) Class361 arg0, @OriginalArg(2) Class330 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "(IZ)Lclient!mha;")
	@Override
	public Interface16 method6244(@OriginalArg(1) boolean arg0) {
		return new Class53_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6305(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!oia", name = "r", descriptor = "(B)V")
	@Override
	protected void method6280() {
		if (super.aBoolean562) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!oia", name = "r", descriptor = "(I)V")
	@Override
	protected void method6219() {
		if (super.aBoolean547 && super.aBoolean554 && super.anInt7457 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!oia", name = "U", descriptor = "(I)V")
	@Override
	protected void method6304() {
		this.method6279();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt7471; local10++) {
			@Pc(17) Class3_Sub7 local17 = super.aClass3_Sub7Array5[local10];
			@Pc(23) int local23 = local17.method6351();
			@Pc(28) int local28 = local10 + 16386;
			@Pc(34) float local34 = local17.method6352() / 255.0F;
			Static98.aFloatArray29[0] = (float) local17.method6348();
			Static98.aFloatArray29[1] = (float) local17.method6346();
			Static98.aFloatArray29[2] = (float) local17.method6343();
			Static98.aFloatArray29[3] = 1.0F;
			OpenGL.glLightfv(local28, 4611, Static98.aFloatArray29, 0);
			Static98.aFloatArray29[0] = (float) (local23 >> 16 & 0xFF) * local34;
			Static98.aFloatArray29[3] = 1.0F;
			Static98.aFloatArray29[2] = (float) (local23 & 0xFF) * local34;
			Static98.aFloatArray29[1] = (float) (local23 >> 8 & 0xFF) * local34;
			OpenGL.glLightfv(local28, 4609, Static98.aFloatArray29, 0);
			OpenGL.glLightf(local28, 4617, 1.0F / (float) (local17.method6349() * local17.method6349()));
			OpenGL.glEnable(local28);
		}
		while (local10 < super.anInt7445) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method6304();
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!gh;Lclient!oq;)Lclient!el;")
	@Override
	public Interface8 method8166(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Interface19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)V")
	@Override
	protected void method6194() {
		OpenGL.glDepthMask(super.aBoolean565 && super.aBoolean556);
	}

	@OriginalMember(owner = "client!oia", name = "r", descriptor = "()Z")
	@Override
	public boolean method8181() {
		return false;
	}

	@OriginalMember(owner = "client!oia", name = "p", descriptor = "(I)V")
	@Override
	protected void method6214() {
		if (super.aBoolean550) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!oia", name = "I", descriptor = "(I)V")
	@Override
	protected void method6268() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray52, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oia", name = "f", descriptor = "(B)V")
	@Override
	protected void method6211() {
		if (super.aBoolean549) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IZIBII[I)Lclient!gl;")
	@Override
	public Interface11 method6285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (this.aBoolean573 || Static9.method94(arg0) && Static9.method94(arg3)) {
			return new Class40_Sub2(this, arg0, arg3, arg1, arg5, 0, arg4);
		} else if (this.aBoolean576) {
			return new Class40_Sub4(this, arg0, arg3, arg5, 0, arg4);
		} else {
			@Pc(49) Class40_Sub2 local49 = new Class40_Sub2(this, Static264.aClass361_8, Static553.aClass330_14, Static527.method7377(arg0), Static527.method7377(arg3));
			local49.method8768(arg5, 0, 0, arg4, arg3, arg0);
			return local49;
		}
	}

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "(II)Lclient!mr;")
	@Override
	protected Class60 method6231(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class60_Sub7(this, super.aClass143_105);
		} else if (arg0 == 4) {
			return new Class60_Sub10(this, super.aClass143_105, super.aClass367_5);
		} else if (arg0 == 8) {
			return new Class60_Sub3(this, super.aClass143_105, super.aClass367_5);
		} else {
			return super.method6231(arg0);
		}
	}

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "()V")
	@Override
	public void method8167() {
		if (super.anInt7431 <= 0 && super.anInt7430 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt7472;
		@Pc(19) int local19 = super.anInt7453;
		@Pc(22) int local22 = super.anInt7469;
		@Pc(25) int local25 = super.anInt7475;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6307();
		this.method6311(false);
		this.method6260(false);
		this.method6199(false);
		this.method6232(false);
		this.method6197((Interface3) null);
		this.method6264(-2, false, false);
		this.method6233(1);
		this.method6239(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7431, super.anInt7430, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!oia", name = "V", descriptor = "(I)V")
	@Override
	protected void method6309() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass20Array3[super.anInt7448] == Static226.aClass20_7) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass25_Sub3Array3[super.anInt7448].method4325(Static143.aFloatArray31), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oia", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7430 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt7565, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "()V")
	@Override
	public void method8138() {
	}

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "()V")
	@Override
	public void method8189() {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILclient!ta;Lclient!bo;BIII)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) Interface22 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) byte local22;
		@Pc(20) int local20;
		if (Static43.aClass44_1 == arg2) {
			local20 = arg3 * 2;
			local22 = 1;
		} else if (arg2 == Static576.aClass44_6) {
			local20 = arg3 + 1;
			local22 = 3;
		} else if (arg2 == Static425.aClass44_5) {
			local22 = 4;
			local20 = arg3 * 3;
		} else if (Static351.aClass44_3 == arg2) {
			local22 = 6;
			local20 = arg3 + 2;
		} else if (Static375.aClass44_4 == arg2) {
			local22 = 5;
			local20 = arg3 + 2;
		} else {
			local20 = arg3;
			local22 = 0;
		}
		@Pc(76) Class330 local76 = arg1.method7740();
		@Pc(79) Class53_Sub2 local79 = (Class53_Sub2) arg1;
		local79.method7733();
		OpenGL.glDrawElements(local22, local20, Static525.method7361(local76), local79.method7728() + (long) (local76.anInt8941 * arg5));
	}

	@OriginalMember(owner = "client!oia", name = "w", descriptor = "(B)V")
	@Override
	protected void method6316() {
		this.aBoolean568 = false;
		this.method6332();
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(BII)V")
	public synchronized void method6331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub53 local8 = new Class3_Sub53(arg1);
		local8.aLong309 = (long) arg0;
		this.aClass193_42.method4462(local8);
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "()V")
	@Override
	public void method8127() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!oia", name = "Y", descriptor = "(I)V")
	@Override
	protected void method6312() {
		this.method6332();
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6270(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(11) Long local11 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local11)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6245(@OriginalArg(0) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL2.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!oia", name = "x", descriptor = "()Lclient!aja;")
	@Override
	public Class18 method8193() {
		@Pc(7) int local7 = -1;
		if (this.aString99.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString99.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString99.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class18(local7, "OpenGL", this.anInt7567, this.aString98, 0L);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!el;)V")
	@Override
	public void method8152(@OriginalArg(0) Interface8 arg0) {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IB)V")
	@Override
	public void method6278(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6229() {
		OpenGL.glScissor(super.anInt7454 + super.anInt7472, -super.anInt7475 + super.anInt7430 + super.anInt7461, -super.anInt7472 + super.anInt7453, -super.anInt7469 + super.anInt7475);
	}

	@OriginalMember(owner = "client!oia", name = "B", descriptor = "(I)V")
	@Override
	protected void method6242() {
		if (super.aBoolean566) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(III[FZIILclient!ul;)Lclient!gl;")
	@Override
	protected Interface11 method6240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) Class361 arg4) {
		if (this.aBoolean573 || Static9.method94(arg1) && Static9.method94(arg0)) {
			return new Class40_Sub2(this, arg4, arg1, arg0, arg3, arg2, 0, 0);
		} else if (this.aBoolean576) {
			return new Class40_Sub4(this, arg4, arg1, arg0, arg2, 0, 0);
		} else {
			@Pc(48) Class40_Sub2 local48 = new Class40_Sub2(this, arg4, Static553.aClass330_18, Static527.method7377(arg1), Static527.method7377(arg0));
			local48.method4103(arg0, arg2, arg4, arg1);
			return local48;
		}
	}

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6238() {
		Static98.aFloatArray29[1] = (float) (super.anInt7470 & 0xFF00) / 65280.0F;
		Static98.aFloatArray29[2] = (float) (super.anInt7470 & 0xFF) / 255.0F;
		Static98.aFloatArray29[3] = (float) (super.anInt7470 >>> 24) / 255.0F;
		Static98.aFloatArray29[0] = (float) (super.anInt7470 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static98.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!jda;ZIZI)V")
	@Override
	public void method6277(@OriginalArg(0) Class188 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static538.method7478(arg0));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6269(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!oia", name = "o", descriptor = "(I)V")
	@Override
	protected void method6210() {
		OpenGL.glActiveTexture(super.anInt7448 + 33984);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I[Lclient!ug;)Lclient!wp;")
	@Override
	public Class277 method6271(@OriginalArg(1) Class355[] arg0) {
		return new Class277_Sub1(arg0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6252(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(15) Long local15 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local15);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(BLclient!wp;)V")
	@Override
	public void method6287(@OriginalArg(1) Class277 arg0) {
		@Pc(9) Class355[] local9 = ((Class277_Sub1) arg0).aClass355Array1;
		@Pc(17) int local17 = 0;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class355 local31 = local9[local25];
			@Pc(36) Class53_Sub1 local36 = this.aClass53_Sub1Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method6046();
			@Pc(46) long local46 = local36.method7728();
			local36.method7733();
			for (@Pc(51) int local51 = 0; local51 < local31.method8012(); local51++) {
				@Pc(58) Class37 local58 = local31.method8013(local51);
				if (local58 == Static45.aClass37_1) {
					local23 = true;
					OpenGL.glVertexPointer(3, 5126, local42, (long) local38 + local46);
				} else if (local58 == Static45.aClass37_2) {
					local21 = true;
					OpenGL.glNormalPointer(5126, local42, local46 + (long) local38);
				} else if (Static45.aClass37_3 == local58) {
					OpenGL.glColorPointer(4, 5121, local42, (long) local38 + local46);
					local19 = true;
				} else if (local58 == Static45.aClass37_4) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static45.aClass37_5) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, (long) local38 + local46);
				} else if (local58 == Static45.aClass37_6) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static45.aClass37_7) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, local46 + (long) local38);
				}
				local38 += local58.anInt1234;
			}
		}
		if (local23 != this.aBoolean570) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean570 = local23;
		}
		if (local21 != this.aBoolean572) {
			if (local21) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean572 = local21;
		}
		if (local19 != this.aBoolean569) {
			if (local19) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean569 = local19;
		}
		@Pc(265) int local265;
		if (local17 > this.anInt7564) {
			for (local265 = this.anInt7564; local265 < local17; local265++) {
				OpenGL.glClientActiveTexture(local265 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt7564 = local17;
		} else if (this.anInt7564 > local17) {
			for (local265 = local17; local265 < this.anInt7564; local265++) {
				OpenGL.glClientActiveTexture(local265 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt7564 = local17;
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8121(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub53 local19;
		while (!this.aClass193_41.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_41.method4452();
			Static56.anIntArray62[local7++] = (int) local19.aLong309;
			super.anInt7432 -= local19.anInt10023;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static56.anIntArray62, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static56.anIntArray62, 0);
			local7 = 0;
		}
		while (!this.aClass193_42.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_42.method4452();
			Static56.anIntArray62[local7++] = (int) local19.aLong309;
			super.anInt7435 -= local19.anInt10023;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static56.anIntArray62, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static56.anIntArray62, 0);
			local7 = 0;
		}
		while (!this.aClass193_43.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_43.method4452();
			Static56.anIntArray62[local7++] = local19.anInt10023;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static56.anIntArray62, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static56.anIntArray62, 0);
			local7 = 0;
		}
		while (!this.aClass193_44.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_44.method4452();
			Static56.anIntArray62[local7++] = (int) local19.aLong309;
			super.anInt7433 -= local19.anInt10023;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static56.anIntArray62, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static56.anIntArray62, 0);
		}
		while (!this.aClass193_40.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_40.method4452();
			OpenGL.glDeleteLists((int) local19.aLong309, local19.anInt10023);
		}
		@Pc(218) Class3 local218;
		while (!this.aClass193_45.method4454()) {
			local218 = this.aClass193_45.method4452();
			OpenGL.glDeleteProgramARB((int) local218.aLong309);
		}
		while (!this.aClass193_46.method4454()) {
			local218 = this.aClass193_46.method4452();
			OpenGL.glDeleteObjectARB(local218.aLong309);
		}
		while (!this.aClass193_40.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_40.method4452();
			OpenGL.glDeleteLists((int) local19.aLong309, local19.anInt10023);
		}
		if (this.E() > 100663296 && Static131.method2268() > this.aLong211 + 60000L) {
			System.gc();
			this.aLong211 = Static131.method2268();
		}
		super.method8121(local11);
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IBZ[[I)Lclient!pj;")
	@Override
	public Interface20 method6258(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class40_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oia", name = "db", descriptor = "(I)V")
	@Override
	protected void method6325() {
		OpenGL.glViewport(super.anInt7454, super.anInt7461, super.anInt7431, super.anInt7430);
	}

	@OriginalMember(owner = "client!oia", name = "o", descriptor = "()V")
	@Override
	public void method8172() {
	}

	@OriginalMember(owner = "client!oia", name = "l", descriptor = "(I)V")
	@Override
	protected void method6200() {
		if (super.aBoolean560) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!en;Lclient!en;FLclient!en;)Lclient!en;")
	@Override
	public Class106 method8158(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IILclient!so;ZLclient!ul;)Lclient!gl;")
	@Override
	public Interface11 method6300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(4) Class361 arg3) {
		if (this.aBoolean573 || Static9.method94(arg1) && Static9.method94(arg0)) {
			return new Class40_Sub2(this, arg3, arg2, arg1, arg0);
		} else if (this.aBoolean576) {
			return new Class40_Sub4(this, arg3, arg2, arg1, arg0);
		} else {
			return new Class40_Sub2(this, arg3, arg2, Static527.method7377(arg1), Static527.method7377(arg0));
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)F")
	@Override
	protected float method6201() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!oia", name = "s", descriptor = "()Z")
	@Override
	public boolean method8186() {
		return false;
	}

	@OriginalMember(owner = "client!oia", name = "y", descriptor = "(B)V")
	@Override
	protected void method6321() {
		if (super.aClass393_5 == Static463.aClass393_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass393_5 == Static667.aClass393_8) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static660.aClass393_7 == super.aClass393_5) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!bl;B)V")
	@Override
	public void method6282(@OriginalArg(0) Class41 arg0) {
		if (arg0 == Static129.aClass41_2) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static637.method8376(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!oia", name = "g", descriptor = "(B)V")
	@Override
	protected void method6215() {
		OpenGL.glTexEnvi(8960, 34161, Static535.method7438(super.aClass11Array5[super.anInt7448]));
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "(II)V")
	@Override
	public void method8175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "(B)V")
	@Override
	protected void method6250() {
		Static98.aFloatArray29[1] = super.aFloat164 * super.aFloat159;
		Static98.aFloatArray29[2] = super.aFloat163 * super.aFloat164;
		Static98.aFloatArray29[0] = super.aFloat164 * super.aFloat161;
		Static98.aFloatArray29[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static98.aFloatArray29, 0);
		Static98.aFloatArray29[1] = -super.aFloat166 * super.aFloat159;
		Static98.aFloatArray29[2] = -super.aFloat166 * super.aFloat163;
		Static98.aFloatArray29[3] = 1.0F;
		Static98.aFloatArray29[0] = super.aFloat161 * -super.aFloat166;
		OpenGL.glLightfv(16385, 4609, Static98.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!oia", name = "eb", descriptor = "(I)V")
	private void method6332() {
		if (this.aBoolean571) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass7_3.method69()) {
			if (!this.aBoolean568) {
				OpenGL.glLoadMatrixf(super.aClass25_Sub3_18.method4325(Static143.aFloatArray31), 0);
				this.aBoolean568 = true;
				this.method6223();
				this.method6304();
			}
			if (super.aBoolean546) {
				this.aBoolean571 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass25_Sub3_15.method4325(Static143.aFloatArray31), 0);
				this.aBoolean571 = true;
			}
		} else if (super.aBoolean546) {
			OpenGL.glLoadIdentity();
			this.aBoolean571 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass25_Sub3_15.method4325(Static143.aFloatArray31), 0);
			this.aBoolean571 = false;
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I[BILclient!ul;II)Lclient!vga;")
	@Override
	public Interface24 method6298(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class361 arg1) {
		return new Class40_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!oia", name = "m", descriptor = "()V")
	@Override
	protected void method8163() {
		super.method8163();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(JI)V")
	public synchronized void method6333(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong309 = arg0;
		this.aClass193_46.method4462(local11);
	}

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "(ZI)V")
	public synchronized void method6334(@OriginalArg(1) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong309 = (long) arg0;
		this.aClass193_45.method4462(local7);
	}

	@OriginalMember(owner = "client!oia", name = "q", descriptor = "(I)V")
	@Override
	protected void method6218() {
		super.aFloat165 = (float) (super.anInt7451 - super.anInt7455);
		super.aFloat162 = super.aFloat165 - (float) super.anInt7457;
		if (super.aFloat162 < (float) super.anInt7443) {
			super.aFloat162 = (float) super.anInt7443;
		}
		OpenGL.glFogf(2915, super.aFloat162);
		OpenGL.glFogf(2916, super.aFloat165);
		Static98.aFloatArray29[1] = (float) (super.anInt7449 & 0xFF00) / 65280.0F;
		Static98.aFloatArray29[2] = (float) (super.anInt7449 & 0xFF) / 255.0F;
		Static98.aFloatArray29[0] = (float) (super.anInt7449 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static98.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IILclient!bo;I)V")
	@Override
	public void method6320(@OriginalArg(1) int arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) int arg2) {
		@Pc(23) byte local23;
		@Pc(21) int local21;
		if (arg1 == Static43.aClass44_1) {
			local23 = 1;
			local21 = arg0 * 2;
		} else if (arg1 == Static576.aClass44_6) {
			local21 = arg0 + 1;
			local23 = 3;
		} else if (arg1 == Static425.aClass44_5) {
			local23 = 4;
			local21 = arg0 * 3;
		} else if (arg1 == Static351.aClass44_3) {
			local21 = arg0 + 2;
			local23 = 6;
		} else if (Static375.aClass44_4 == arg1) {
			local23 = 5;
			local21 = arg0 + 2;
		} else {
			local21 = arg0;
			local23 = 0;
		}
		OpenGL.glDrawArrays(local23, arg2, local21);
	}

	@OriginalMember(owner = "client!oia", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "(I)V")
	@Override
	protected void method6195() {
		for (@Pc(6) int local6 = super.anInt7465 - 1; local6 >= 0; local6--) {
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
		this.anOpenGL2.setSwapInterval(0);
		super.method6195();
	}

	@OriginalMember(owner = "client!oia", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IBLclient!mha;)V")
	@Override
	public void method6257(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1) {
		this.aClass53_Sub1Array1[arg0] = (Class53_Sub1) arg1;
	}

	@OriginalMember(owner = "client!oia", name = "Z", descriptor = "(I)V")
	@Override
	protected void method6313() {
		@Pc(9) int local9 = this.anIntArray455[super.anInt7448];
		if (local9 != 0) {
			this.anIntArray455[super.anInt7448] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!oia", name = "A", descriptor = "(I)V")
	@Override
	protected void method6237() {
		OpenGL.glTexEnvi(8960, 34162, Static535.method7438(super.aClass11Array6[super.anInt7448]));
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(II)Lclient!oq;")
	@Override
	public Interface19 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "(II)Lclient!gh;")
	@Override
	public Interface10 method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oia", name = "j", descriptor = "(B)V")
	@Override
	public void method6223() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray57, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!jda;IIZ)V")
	@Override
	protected void method6303(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static538.method7478(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "(B)V")
	@Override
	protected void method6205() {
		Static98.aFloatArray29[0] = super.aFloat161 * super.aFloat157;
		Static98.aFloatArray29[1] = super.aFloat159 * super.aFloat157;
		Static98.aFloatArray29[3] = 1.0F;
		Static98.aFloatArray29[2] = super.aFloat157 * super.aFloat163;
		OpenGL.glLightModelfv(2899, Static98.aFloatArray29, 0);
	}
}
