import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class78_Sub1_Sub2 extends Class78_Sub1 {

	@OriginalMember(owner = "client!tba", name = "di", descriptor = "Z")
	private boolean aBoolean645;

	@OriginalMember(owner = "client!tba", name = "fi", descriptor = "Z")
	private boolean aBoolean646;

	@OriginalMember(owner = "client!tba", name = "gi", descriptor = "Z")
	private boolean aBoolean647;

	@OriginalMember(owner = "client!tba", name = "hi", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!tba", name = "ii", descriptor = "I")
	private int anInt8678;

	@OriginalMember(owner = "client!tba", name = "ji", descriptor = "Z")
	private boolean aBoolean648;

	@OriginalMember(owner = "client!tba", name = "li", descriptor = "Z")
	private boolean aBoolean649;

	@OriginalMember(owner = "client!tba", name = "lh", descriptor = "Lclient!gca;")
	private final Class111 aClass111_57 = new Class111();

	@OriginalMember(owner = "client!tba", name = "Lh", descriptor = "Lclient!gca;")
	private final Class111 aClass111_58 = new Class111();

	@OriginalMember(owner = "client!tba", name = "Oh", descriptor = "Lclient!gca;")
	private final Class111 aClass111_59 = new Class111();

	@OriginalMember(owner = "client!tba", name = "Vh", descriptor = "Lclient!gca;")
	private final Class111 aClass111_60 = new Class111();

	@OriginalMember(owner = "client!tba", name = "ai", descriptor = "Lclient!gca;")
	private final Class111 aClass111_61 = new Class111();

	@OriginalMember(owner = "client!tba", name = "bi", descriptor = "Lclient!gca;")
	private final Class111 aClass111_62 = new Class111();

	@OriginalMember(owner = "client!tba", name = "ci", descriptor = "Lclient!gca;")
	private final Class111 aClass111_63 = new Class111();

	@OriginalMember(owner = "client!tba", name = "ei", descriptor = "[Lclient!ot;")
	private final Class115_Sub2[] aClass115_Sub2Array1 = new Class115_Sub2[16];

	@OriginalMember(owner = "client!tba", name = "ki", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!tba", name = "mi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!tba", name = "si", descriptor = "I")
	private final int anInt8680 = 0;

	@OriginalMember(owner = "client!tba", name = "xh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!tba", name = "xi", descriptor = "Ljava/lang/String;")
	private final String aString95;

	@OriginalMember(owner = "client!tba", name = "qi", descriptor = "Ljava/lang/String;")
	private final String aString94;

	@OriginalMember(owner = "client!tba", name = "ni", descriptor = "I")
	private final int anInt8679;

	@OriginalMember(owner = "client!tba", name = "yi", descriptor = "Z")
	public boolean aBoolean655;

	@OriginalMember(owner = "client!tba", name = "vi", descriptor = "Z")
	private boolean aBoolean653;

	@OriginalMember(owner = "client!tba", name = "ui", descriptor = "Z")
	private final boolean aBoolean652;

	@OriginalMember(owner = "client!tba", name = "wi", descriptor = "Z")
	public final boolean aBoolean654;

	@OriginalMember(owner = "client!tba", name = "pi", descriptor = "Z")
	public final boolean aBoolean650;

	@OriginalMember(owner = "client!tba", name = "ri", descriptor = "Z")
	public final boolean aBoolean651;

	@OriginalMember(owner = "client!tba", name = "oi", descriptor = "[I")
	public final int[] anIntArray522;

	@OriginalMember(owner = "client!tba", name = "ti", descriptor = "I")
	public final int anInt8681;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!sea;I)V")
	public Class78_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(4) Class308 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString95 = OpenGL.glGetString(7936).toLowerCase();
			this.aString94 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString95.indexOf("microsoft") != -1 || this.aString95.indexOf("brian paul") != -1 || this.aString95.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static95.method1438(local109.replace('.', ' '), ' ');
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(135) int local135;
			try {
				@Pc(129) int local129 = Static216.method3234(local117[0]);
				local135 = Static216.method3234(local117[1]);
				this.anInt8679 = local135 + local129 * 10;
			} catch (@Pc(144) NumberFormatException local144) {
				throw new RuntimeException("");
			}
			if (this.anInt8679 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(186) int[] local186 = new int[1];
				OpenGL.glGetIntegerv(34018, local186, 0);
				super.anInt8584 = local186[0];
				if (super.anInt8584 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8578 = 8;
				this.aBoolean655 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean628 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean653 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean639 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean652 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean635 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean654 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean650 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean651 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray522 = new int[super.anInt8584];
				this.anInt8681 = Stream.b() ? 33639 : 5121;
				if (this.aString94.indexOf("radeon") != -1) {
					local135 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static95.method1438(this.aString94.replace('/', ' '), ' ');
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(309) String local309 = local301[local303];
						try {
							if (local309.length() > 0) {
								if (local309.charAt(0) == 'x' && local309.length() >= 3 && Static570.method7674(local309.substring(1, 3))) {
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
									if (local309.length() >= 4 && Static570.method7674(local309.substring(0, 4))) {
										local135 = Static216.method3234(local309.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(381) Exception local381) {
						}
					}
					if (!local292 && !local290) {
						if (local135 >= 7000 && local135 <= 9250) {
							super.aBoolean635 = false;
						}
						if (local135 >= 7000 && local135 <= 7999) {
							this.aBoolean655 = false;
						}
					}
					this.aBoolean653 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString95.indexOf("intel");
				if (this.aBoolean655) {
					try {
						@Pc(433) int[] local433 = new int[1];
						OpenGL.glGenBuffersARB(1, local433, 0);
					} catch (@Pc(439) Throwable local439) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(445) Throwable local445) {
			local445.printStackTrace();
			this.method6789();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!vc;BI)V")
	@Override
	public void method6965(@OriginalArg(0) Interface23 arg0, @OriginalArg(2) int arg1) {
		this.aClass115_Sub2Array1[arg1] = (Class115_Sub2) arg0;
	}

	@OriginalMember(owner = "client!tba", name = "C", descriptor = "()Z")
	@Override
	public boolean method6854() {
		return false;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	@Override
	protected void method6860() {
		Static236.aFloatArray79[3] = (float) (super.anInt8587 >>> 24) / 255.0F;
		Static236.aFloatArray79[1] = (float) (super.anInt8587 & 0xFF00) / 65280.0F;
		Static236.aFloatArray79[0] = (float) (super.anInt8587 & 0xFF0000) / 1.671168E7F;
		Static236.aFloatArray79[2] = (float) (super.anInt8587 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static236.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!tba", name = "D", descriptor = "(I)V")
	@Override
	protected void method6906() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray69, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "(B)V")
	@Override
	protected void method6962() {
		OpenGL.glViewport(super.anInt8594, super.anInt8586, super.anInt8491, super.anInt8451);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!pn;ILclient!jg;I)Lclient!cm;")
	@Override
	public Interface5 method6885(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean652 || Static166.method6223(arg3) && Static166.method6223(arg1)) {
			return new Class149_Sub4(this, arg0, arg2, arg3, arg1);
		} else if (this.aBoolean653) {
			return new Class149_Sub3(this, arg0, arg2, arg3, arg1);
		} else {
			return new Class149_Sub4(this, arg0, arg2, Static122.method2187(arg3), Static122.method2187(arg1));
		}
	}

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "(I)V")
	@Override
	protected void method6859() {
		OpenGL.glTexEnvi(8960, 34162, Static162.method2688(super.aClass118Array6[super.anInt8573]));
	}

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "(I)V")
	@Override
	protected void method6866() {
		if (super.aBoolean636) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z[[III)Lclient!hea;")
	@Override
	public Interface11 method6935(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class149_Sub1(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)V")
	public synchronized void method6988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub27 local15 = new Class1_Sub27(arg0);
		local15.aLong268 = arg1;
		this.aClass111_58.method2552(local15);
	}

	@OriginalMember(owner = "client!tba", name = "u", descriptor = "(I)V")
	@Override
	protected void method6882() {
		super.aFloat217 = super.anInt8583 - super.anInt8585;
		super.aFloat223 = (float) -super.anInt8565 + super.aFloat217;
		if (super.aFloat223 < (float) super.anInt8591) {
			super.aFloat223 = super.anInt8591;
		}
		OpenGL.glFogf(2915, super.aFloat223);
		OpenGL.glFogf(2916, super.aFloat217);
		Static236.aFloatArray79[2] = (float) (super.anInt8566 & 0xFF) / 255.0F;
		Static236.aFloatArray79[0] = (float) (super.anInt8566 & 0xFF0000) / 1.671168E7F;
		Static236.aFloatArray79[1] = (float) (super.anInt8566 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static236.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method6921(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tba", name = "V", descriptor = "(I)V")
	@Override
	protected void method6956() {
		Static236.aFloatArray79[3] = 1.0F;
		Static236.aFloatArray79[1] = super.aFloat213 * super.aFloat220;
		Static236.aFloatArray79[2] = super.aFloat213 * super.aFloat214;
		Static236.aFloatArray79[0] = super.aFloat215 * super.aFloat213;
		OpenGL.glLightModelfv(2899, Static236.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "([Lclient!th;B)Lclient!si;")
	@Override
	public Class185 method6938(@OriginalArg(0) Class318[] arg0) {
		return new Class185_Sub1(arg0);
	}

	@OriginalMember(owner = "client!tba", name = "U", descriptor = "(I)V")
	@Override
	public void method6955() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray72, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "()V")
	@Override
	public void method6820() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(Z)V")
	@Override
	public void method6852(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "(B)V")
	@Override
	protected void method6898() {
		if (super.aBoolean644) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!tba", name = "Q", descriptor = "(I)V")
	@Override
	protected void method6942() {
		if (super.aBoolean637 && super.aBoolean624 && super.anInt8565 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(ZI)Lclient!vc;")
	@Override
	public Interface23 method6927(@OriginalArg(0) boolean arg0) {
		return new Class115_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "(B)V")
	@Override
	protected void method6945() {
		if (super.aClass4_6 == Static235.aClass4_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static526.aClass4_7 == super.aClass4_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass4_6 == Static148.aClass4_3) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!tba", name = "B", descriptor = "(I)V")
	@Override
	protected void method6896() {
		this.method6993();
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(II)Lclient!cc;")
	@Override
	protected Class2 method6926(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class2_Sub5(this, super.aClass308_167);
		} else if (arg0 == 4) {
			return new Class2_Sub1(this, super.aClass308_167, super.aClass315_7);
		} else if (arg0 == 8) {
			return new Class2_Sub4(this, super.aClass308_167, super.aClass315_7);
		} else {
			return super.method6926(arg0);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZLclient!ou;)V")
	@Override
	public void method6887(@OriginalArg(1) Class260 arg0) {
		if (arg0 == Static440.aClass260_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static467.method4896(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method6862(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local14);
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6940(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6821(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6820();
	}

	@OriginalMember(owner = "client!tba", name = "H", descriptor = "(I)V")
	@Override
	protected void method6919() {
		@Pc(9) int local9 = this.anIntArray522[super.anInt8573];
		if (local9 != 0) {
			this.anIntArray522[super.anInt8573] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8451 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt8681, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(JI)V")
	public synchronized void method6990(@OriginalArg(0) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong268 = arg0;
		this.aClass111_63.method2552(local7);
	}

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "()V")
	@Override
	public void method6809() {
		if (super.anInt8491 <= 0 && super.anInt8451 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt8596;
		@Pc(19) int local19 = super.anInt8576;
		@Pc(22) int local22 = super.anInt8572;
		@Pc(25) int local25 = super.anInt8570;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6911();
		this.method6978(false);
		this.method6949(false);
		this.method6944(false);
		this.method6953(false);
		this.method6931(null);
		this.method6948(false, false, -2);
		this.method6943(1);
		this.method6913(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8491, super.anInt8451, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!tba", name = "hb", descriptor = "(I)V")
	@Override
	protected void method6985() {
		this.method6957();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt8582 > local10; local10++) {
			@Pc(17) Class1_Sub24 local17 = super.aClass1_Sub24Array5[local10];
			@Pc(21) int local21 = local17.method7613();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method7615() / 255.0F;
			Static236.aFloatArray79[0] = local17.method7609();
			Static236.aFloatArray79[1] = local17.method7612();
			Static236.aFloatArray79[2] = local17.method7608();
			Static236.aFloatArray79[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static236.aFloatArray79, 0);
			Static236.aFloatArray79[0] = local31 * (float) (local21 >> 16 & 0xFF);
			Static236.aFloatArray79[2] = local31 * (float) (local21 & 0xFF);
			Static236.aFloatArray79[3] = 1.0F;
			Static236.aFloatArray79[1] = local31 * (float) (local21 >> 8 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static236.aFloatArray79, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method7610() * local17.method7610()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt8559) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method6985();
	}

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "()Z")
	@Override
	public boolean method6802() {
		return false;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(III)V")
	public synchronized void method6991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub27 local12 = new Class1_Sub27(arg1);
		local12.aLong268 = arg0;
		this.aClass111_59.method2552(local12);
	}

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "()V")
	@Override
	public void method6813() {
	}

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "(B)V")
	@Override
	protected void method6910() {
		if (super.aBoolean632 && !super.aBoolean626) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!si;)V")
	@Override
	public void method6941(@OriginalArg(1) Class185 arg0) {
		@Pc(9) Class318[] local9 = ((Class185_Sub1) arg0).aClass318Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class318 local25 = local9[local19];
			@Pc(30) Class115_Sub2 local30 = this.aClass115_Sub2Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method5574();
			@Pc(40) long local40 = local30.method5568();
			local30.method5560();
			for (@Pc(45) int local45 = 0; local25.method7064() > local45; local45++) {
				@Pc(52) Class174 local52 = local25.method7060(local45);
				if (Static246.aClass174_1 == local52) {
					OpenGL.glVertexPointer(3, 5126, local36, local40 + (long) local32);
					local17 = true;
				} else if (local52 == Static246.aClass174_2) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local36, (long) local32 + local40);
				} else if (local52 == Static246.aClass174_3) {
					OpenGL.glColorPointer(4, 5121, local36, (long) local32 + local40);
					local13 = true;
				} else if (local52 == Static246.aClass174_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, local40 + (long) local32);
				} else if (local52 == Static246.aClass174_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, local40 + (long) local32);
				} else if (Static246.aClass174_6 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, local40 + (long) local32);
				} else if (local52 == Static246.aClass174_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, (long) local32 + local40);
				}
				local32 += local52.anInt4535;
			}
		}
		if (this.aBoolean646 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean646 = local17;
		}
		if (local15 != this.aBoolean648) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean648 = local15;
		}
		if (this.aBoolean647 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean647 = local13;
		}
		@Pc(268) int local268;
		if (local11 > this.anInt8678) {
			for (local268 = this.anInt8678; local268 < local11; local268++) {
				OpenGL.glClientActiveTexture(local268 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt8678 = local11;
		} else if (local11 < this.anInt8678) {
			for (local268 = local11; local268 < this.anInt8678; local268++) {
				OpenGL.glClientActiveTexture(local268 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt8678 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!hw;IIZ)V")
	@Override
	protected void method6934(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static166.method6222(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6827(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!wn;Lclient!wn;FLclient!wn;)Lclient!wn;")
	@Override
	public Class209 method6811(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class209 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZIZLclient!hw;I)V")
	@Override
	public void method6959(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class148 arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static166.method6222(arg3));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!tba", name = "u", descriptor = "()Lclient!ho;")
	@Override
	public Class141 method6841() {
		@Pc(7) int local7 = -1;
		if (this.aString95.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString95.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString95.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class141(local7, "OpenGL", this.anInt8679, this.aString94, 0L);
	}

	@OriginalMember(owner = "client!tba", name = "G", descriptor = "(I)V")
	@Override
	protected void method6915() {
		if (super.aBoolean640) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!jg;Lclient!pn;I)Z")
	@Override
	public boolean method6869(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class271 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tba", name = "x", descriptor = "(I)V")
	@Override
	protected void method6890() {
		for (@Pc(6) int local6 = super.anInt8584 - 1; local6 >= 0; local6--) {
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
		this.anOpenGL2.setSwapInterval(0);
		super.method6890();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tba", name = "X", descriptor = "(I)F")
	@Override
	protected float method6960() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!tba", name = "Z", descriptor = "(I)V")
	@Override
	protected void method6963() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass316Array3[super.anInt8573] == Static21.aClass316_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass34_Sub1Array3[super.anInt8573].method903(Static19.aFloatArray6), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZI[FIIILclient!pn;)Lclient!cm;")
	@Override
	protected Interface5 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(7) Class271 arg4) {
		if (this.aBoolean652 || Static166.method6223(arg2) && Static166.method6223(arg0)) {
			return new Class149_Sub4(this, arg4, arg2, arg0, arg1, arg3, 0, 0);
		} else if (this.aBoolean653) {
			return new Class149_Sub3(this, arg4, arg2, arg0, arg3, 0, 0);
		} else {
			@Pc(56) Class149_Sub4 local56 = new Class149_Sub4(this, arg4, Static243.aClass172_13, Static122.method2187(arg2), Static122.method2187(arg0));
			local56.method7321(arg0, arg2, arg3, arg4);
			return local56;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!pn;IZII[BI)Lclient!cm;")
	@Override
	protected Interface5 method6908(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		if (this.aBoolean652 || Static166.method6223(arg1) && Static166.method6223(arg3)) {
			return new Class149_Sub4(this, arg0, arg1, arg3, arg2, arg4, 0, 0);
		} else if (this.aBoolean653) {
			return new Class149_Sub3(this, arg0, arg1, arg3, arg4, 0, 0);
		} else {
			@Pc(48) Class149_Sub4 local48 = new Class149_Sub4(this, arg0, Static243.aClass172_9, Static122.method2187(arg1), Static122.method2187(arg3));
			local48.method7311(0, arg1, arg0, arg3, arg4);
			return local48;
		}
	}

	@OriginalMember(owner = "client!tba", name = "z", descriptor = "()V")
	@Override
	public void method6846() {
	}

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "(I)V")
	@Override
	protected void method6868() {
		OpenGL.glTexEnvi(8960, 34161, Static162.method2688(super.aClass118Array5[super.anInt8573]));
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(II[BILclient!pn;I)Lclient!tea;")
	@Override
	public Interface21 method6972(@OriginalArg(2) byte[] arg0, @OriginalArg(4) Class271 arg1) {
		return new Class149_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "(ZI)Lclient!jea;")
	@Override
	public Interface13 method6980(@OriginalArg(0) boolean arg0) {
		return new Class115_Sub1(this, Static243.aClass172_10, arg0);
	}

	@OriginalMember(owner = "client!tba", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z[IIIIII)Lclient!cm;")
	@Override
	public Interface5 method6986(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean652 || Static166.method6223(arg2) && Static166.method6223(arg5)) {
			return new Class149_Sub4(this, arg2, arg5, arg0, arg1, 0, arg3);
		} else if (this.aBoolean653) {
			return new Class149_Sub3(this, arg2, arg5, arg1, 0, arg3);
		} else {
			@Pc(35) Class149_Sub4 local35 = new Class149_Sub4(this, Static429.aClass271_12, Static243.aClass172_9, Static122.method2187(arg2), Static122.method2187(arg5));
			local35.method7318(arg5, arg1, 0, 0, arg2, arg3);
			return local35;
		}
	}

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "(B)V")
	@Override
	protected void method6954() {
		if (super.aBoolean638) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!tba", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt8680;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!eg;IIIILclient!jea;B)V")
	@Override
	public void method6947(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface13 arg5) {
		@Pc(15) byte local15;
		@Pc(19) int local19;
		if (Static578.aClass77_8 == arg0) {
			local15 = 1;
			local19 = arg3 * 2;
		} else if (arg0 == Static308.aClass77_2) {
			local19 = arg3 + 1;
			local15 = 3;
		} else if (Static302.aClass77_5 == arg0) {
			local19 = arg3 * 3;
			local15 = 4;
		} else if (arg0 == Static528.aClass77_6) {
			local15 = 6;
			local19 = arg3 + 2;
		} else if (arg0 == Static312.aClass77_3) {
			local15 = 5;
			local19 = arg3 + 2;
		} else {
			local19 = arg3;
			local15 = 0;
		}
		@Pc(73) Class172 local73 = arg5.method5599();
		@Pc(76) Class115_Sub1 local76 = (Class115_Sub1) arg5;
		local76.method5560();
		OpenGL.glDrawElements(local15, local19, Static430.method6139(local73), local76.method5568() + (long) (local73.anInt4482 * arg4));
	}

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "(I)V")
	@Override
	protected void method6856() {
		OpenGL.glActiveTexture(super.anInt8573 + 33984);
	}

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "(II)V")
	public synchronized void method6992(@OriginalArg(0) int arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong268 = arg0;
		this.aClass111_62.method2552(local13);
	}

	@OriginalMember(owner = "client!tba", name = "kb", descriptor = "(I)V")
	private void method6993() {
		if (this.aBoolean645) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass322_5.method7149()) {
			if (!this.aBoolean649) {
				OpenGL.glLoadMatrixf(super.aClass34_Sub1_18.method903(Static19.aFloatArray6), 0);
				this.aBoolean649 = true;
				this.method6955();
				this.method6985();
			}
			if (super.aBoolean623) {
				this.aBoolean645 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass34_Sub1_15.method903(Static19.aFloatArray6), 0);
				this.aBoolean645 = true;
			}
		} else if (super.aBoolean623) {
			OpenGL.glLoadIdentity();
			this.aBoolean645 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass34_Sub1_15.method903(Static19.aFloatArray6), 0);
			this.aBoolean645 = false;
		}
	}

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "(Z)V")
	@Override
	protected void method6929() {
		OpenGL.glDepthMask(super.aBoolean631 && super.aBoolean629);
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(Lclient!jg;Lclient!pn;I)Z")
	@Override
	public boolean method6875(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class271 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6897(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!tba", name = "t", descriptor = "(I)V")
	@Override
	protected void method6880() {
		if (super.aBoolean630) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!tba", name = "x", descriptor = "()V")
	@Override
	public void method6844() {
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6889(@OriginalArg(0) Canvas arg0) {
		@Pc(15) long local15 = this.anOpenGL2.prepareSurface(arg0);
		if (local15 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local15);
	}

	@OriginalMember(owner = "client!tba", name = "q", descriptor = "(B)V")
	@Override
	protected void method6968() {
		this.aBoolean649 = false;
		this.method6993();
	}

	@OriginalMember(owner = "client!tba", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6953(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "(B)V")
	@Override
	protected void method6886() {
		OpenGL.glScissor(super.anInt8594 + super.anInt8596, -super.anInt8570 + super.anInt8451 + super.anInt8586, super.anInt8576 - super.anInt8596, super.anInt8570 + -super.anInt8572);
	}

	@OriginalMember(owner = "client!tba", name = "s", descriptor = "()V")
	@Override
	public void method6834() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!tba", name = "N", descriptor = "(I)V")
	@Override
	protected void method6933() {
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6901(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!tba", name = "W", descriptor = "(I)V")
	@Override
	protected void method6958() {
		Static236.aFloatArray79[0] = super.aFloat215 * super.aFloat219;
		Static236.aFloatArray79[1] = super.aFloat219 * super.aFloat220;
		Static236.aFloatArray79[3] = 1.0F;
		Static236.aFloatArray79[2] = super.aFloat219 * super.aFloat214;
		OpenGL.glLightfv(16384, 4609, Static236.aFloatArray79, 0);
		Static236.aFloatArray79[1] = super.aFloat220 * -super.aFloat225;
		Static236.aFloatArray79[2] = -super.aFloat225 * super.aFloat214;
		Static236.aFloatArray79[0] = -super.aFloat225 * super.aFloat215;
		Static236.aFloatArray79[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static236.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6799(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class1_Sub27 local19;
		while (!this.aClass111_58.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_58.method2553();
			Static88.anIntArray74[local7++] = (int) local19.aLong268;
			super.anInt8557 -= local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static88.anIntArray74, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static88.anIntArray74, 0);
			local7 = 0;
		}
		while (!this.aClass111_59.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_59.method2553();
			Static88.anIntArray74[local7++] = (int) local19.aLong268;
			super.anInt8556 -= local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static88.anIntArray74, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static88.anIntArray74, 0);
			local7 = 0;
		}
		while (!this.aClass111_60.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_60.method2553();
			Static88.anIntArray74[local7++] = local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static88.anIntArray74, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static88.anIntArray74, 0);
			local7 = 0;
		}
		while (!this.aClass111_61.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_61.method2553();
			Static88.anIntArray74[local7++] = (int) local19.aLong268;
			super.anInt8555 -= local19.anInt3348;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static88.anIntArray74, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static88.anIntArray74, 0);
		}
		while (!this.aClass111_57.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_57.method2553();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3348);
		}
		@Pc(215) Class1 local215;
		while (!this.aClass111_62.method2546()) {
			local215 = this.aClass111_62.method2553();
			OpenGL.glDeleteProgramARB((int) local215.aLong268);
		}
		while (!this.aClass111_63.method2546()) {
			local215 = this.aClass111_63.method2553();
			OpenGL.glDeleteObjectARB(local215.aLong268);
		}
		while (!this.aClass111_57.method2546()) {
			local19 = (Class1_Sub27) this.aClass111_57.method2553();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3348);
		}
		if (this.b() > 100663296 && this.aLong231 + 60000L < Static480.method6650()) {
			System.gc();
			this.aLong231 = Static480.method6650();
		}
		super.method6799(local11);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!eg;II)V")
	@Override
	public void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) byte local15;
		@Pc(19) int local19;
		if (arg1 == Static578.aClass77_8) {
			local15 = 1;
			local19 = arg2 * 2;
		} else if (Static308.aClass77_2 == arg1) {
			local15 = 3;
			local19 = arg2 + 1;
		} else if (arg1 == Static302.aClass77_5) {
			local19 = arg2 * 3;
			local15 = 4;
		} else if (Static528.aClass77_6 == arg1) {
			local19 = arg2 + 2;
			local15 = 6;
		} else if (Static312.aClass77_3 == arg1) {
			local15 = 5;
			local19 = arg2 + 2;
		} else {
			local19 = arg2;
			local15 = 0;
		}
		OpenGL.glDrawArrays(local15, arg0, local19);
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "()V")
	@Override
	protected void method6789() {
		super.method6789();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}
}
