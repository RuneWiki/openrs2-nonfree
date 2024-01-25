import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class9_Sub3_Sub2 extends Class9_Sub3 {

	@OriginalMember(owner = "client!nfa", name = "bi", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!nfa", name = "Gh", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_49 = new Class211();

	@OriginalMember(owner = "client!nfa", name = "Sh", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_50 = new Class211();

	@OriginalMember(owner = "client!nfa", name = "Wh", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_51 = new Class211();

	@OriginalMember(owner = "client!nfa", name = "Xh", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_52 = new Class211();

	@OriginalMember(owner = "client!nfa", name = "Yh", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_53 = new Class211();

	@OriginalMember(owner = "client!nfa", name = "Zh", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_54 = new Class211();

	@OriginalMember(owner = "client!nfa", name = "ai", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_55 = new Class211();

	@OriginalMember(owner = "client!nfa", name = "ci", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!nfa", name = "ii", descriptor = "I")
	private final int anInt6645 = 0;

	@OriginalMember(owner = "client!nfa", name = "ni", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "client!nfa", name = "Yg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!nfa", name = "fi", descriptor = "Ljava/lang/String;")
	private final String aString73;

	@OriginalMember(owner = "client!nfa", name = "gi", descriptor = "Ljava/lang/String;")
	private final String aString74;

	@OriginalMember(owner = "client!nfa", name = "li", descriptor = "I")
	private final int anInt6646;

	@OriginalMember(owner = "client!nfa", name = "ki", descriptor = "Z")
	public boolean aBoolean498;

	@OriginalMember(owner = "client!nfa", name = "ji", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!nfa", name = "hi", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!nfa", name = "mi", descriptor = "Z")
	public final boolean aBoolean499;

	@OriginalMember(owner = "client!nfa", name = "ei", descriptor = "I")
	public final int anInt6644;

	@OriginalMember(owner = "client!nfa", name = "di", descriptor = "[I")
	public final int[] anIntArray471;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!e;Lclient!jo;I)V")
	public Class9_Sub3_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class168 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString73 = OpenGL.glGetString(7936).toLowerCase();
			this.aString74 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString73.indexOf("microsoft") != -1 || this.aString73.indexOf("brian paul") != -1 || this.aString73.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(104) String local104 = OpenGL.glGetString(7938);
			@Pc(112) String[] local112 = Static288.method4721(local104.replace('.', ' '), ' ');
			if (local112.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(133) int local133;
			try {
				@Pc(127) int local127 = Static228.method4072(local112[0]);
				local133 = Static228.method4072(local112[1]);
				this.anInt6646 = local133 + local127 * 10;
			} catch (@Pc(142) NumberFormatException local142) {
				throw new RuntimeException("");
			}
			if (this.anInt6646 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(181) int[] local181 = new int[1];
				OpenGL.glGetIntegerv(34018, local181, 0);
				super.anInt6541 = local181[0];
				if (super.anInt6541 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6530 = 8;
				this.aBoolean498 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean487 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean497 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean491 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean496 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean478 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean499 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anInt6644 = Stream.c() ? 33639 : 5121;
				if (this.aString74.indexOf("radeon") != -1) {
					local133 = 0;
					@Pc(278) boolean local278 = false;
					@Pc(280) boolean local280 = false;
					@Pc(289) String[] local289 = Static288.method4721(this.aString74.replace('/', ' '), ' ');
					for (@Pc(291) int local291 = 0; local291 < local289.length; local291++) {
						@Pc(297) String local297 = local289[local291];
						try {
							if (local297.length() > 0) {
								if (local297.charAt(0) == 'x' && local297.length() >= 3 && Static251.method4415(local297.substring(1, 3))) {
									local297 = local297.substring(1);
									local280 = true;
								}
								if (local297.equals("hd")) {
									local278 = true;
								} else {
									if (local297.startsWith("hd")) {
										local278 = true;
										local297 = local297.substring(2);
									}
									if (local297.length() >= 4 && Static251.method4415(local297.substring(0, 4))) {
										local133 = Static228.method4072(local297.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(365) Exception local365) {
						}
					}
					if (!local280 && !local278) {
						if (local133 >= 7000 && local133 <= 9250) {
							super.aBoolean478 = false;
						}
						if (local133 >= 7000 && local133 <= 7999) {
							this.aBoolean498 = false;
						}
					}
					this.aBoolean497 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString73.indexOf("intel");
				if (this.aBoolean498) {
					try {
						@Pc(419) int[] local419 = new int[1];
						OpenGL.glGenBuffersARB(1, local419, 0);
					} catch (@Pc(425) Throwable local425) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray471 = new int[super.anInt6541];
				OpenGL.glClear(16640);
				this.anOpenGL2.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(444) Throwable local444) {
			local444.printStackTrace();
			this.method5418();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "(B)V")
	@Override
	protected void method5533() {
		if (super.aBoolean475 && super.aBoolean493 && super.anInt6531 >= 0 | super.aBoolean479) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "B", descriptor = "(I)V")
	@Override
	protected void method5518() {
		OpenGL.glActiveTexture(super.anInt6536 + 33984);
	}

	@OriginalMember(owner = "client!nfa", name = "s", descriptor = "(B)V")
	@Override
	public void method5566() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray40, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(ZZ)Lclient!tfa;")
	@Override
	public Interface20 method5528(@OriginalArg(0) boolean arg0) {
		return new Class91_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "(B)V")
	@Override
	protected void method5496() {
		@Pc(23) int local23;
		if (super.aBoolean479) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local23 = super.anInt6553;
		} else {
			super.aFloat139 = -super.anInt6556 + super.anInt6560;
			super.aFloat149 = (float) -super.anInt6531 + super.aFloat139;
			if (super.aFloat149 < (float) super.anInt6540) {
				super.aFloat149 = super.anInt6540;
			}
			OpenGL.glFogf(2915, super.aFloat149);
			OpenGL.glFogf(2916, super.aFloat139);
			local23 = super.anInt6537;
		}
		Static339.aFloatArray37[2] = (float) (local23 & 0xFF) / 255.0F;
		Static339.aFloatArray37[0] = (float) (local23 & 0xFF0000) / 1.671168E7F;
		Static339.aFloatArray37[1] = (float) (local23 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static339.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "W", descriptor = "(I)F")
	@Override
	protected float method5585() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!dj;)V")
	@Override
	public void method5483(@OriginalArg(1) Class71 arg0) {
		if (Static506.aClass71_4 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(20) int local20 = Static508.method7551(arg0);
		OpenGL.glTexGeni(8192, 9472, local20);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local20);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local20);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "([BILclient!vj;BII)Lclient!te;")
	@Override
	public Interface19 method5573(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class333 arg1) {
		return new Class81_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZI[IZII)Lclient!ae;")
	@Override
	public Interface1 method5564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean496 || Static85.method1890(arg5) && Static85.method1890(arg1)) {
			return new Class81_Sub3(this, arg5, arg1, arg3, arg2, 0, arg4);
		} else if (this.aBoolean497) {
			return new Class81_Sub4(this, arg5, arg1, arg2, 0, arg4);
		} else {
			@Pc(57) Class81_Sub3 local57 = new Class81_Sub3(this, Static487.aClass333_15, Static336.aClass220_12, Static247.method4363(arg5), Static247.method4363(arg1));
			local57.method7751(0, arg4, arg1, 0, arg5, arg2);
			return local57;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5438(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub24 local19;
		while (!this.aClass211_50.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_50.method5180();
			Static519.anIntArray795[local11++] = (int) local19.aLong252;
			super.anInt6524 -= local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static519.anIntArray795, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static519.anIntArray795, 0);
			local11 = 0;
		}
		while (!this.aClass211_51.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_51.method5180();
			Static519.anIntArray795[local11++] = (int) local19.aLong252;
			super.anInt6523 -= local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static519.anIntArray795, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static519.anIntArray795, 0);
			local11 = 0;
		}
		while (!this.aClass211_52.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_52.method5180();
			Static519.anIntArray795[local11++] = local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static519.anIntArray795, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static519.anIntArray795, 0);
			local11 = 0;
		}
		while (!this.aClass211_53.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_53.method5180();
			Static519.anIntArray795[local11++] = (int) local19.aLong252;
			super.anInt6525 -= local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static519.anIntArray795, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static519.anIntArray795, 0);
		}
		while (!this.aClass211_49.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_49.method5180();
			OpenGL.glDeleteLists((int) local19.aLong252, local19.anInt4156);
		}
		@Pc(212) Class6 local212;
		while (!this.aClass211_54.method5170()) {
			local212 = this.aClass211_54.method5180();
			OpenGL.glDeleteProgramARB((int) local212.aLong252);
		}
		while (!this.aClass211_55.method5170()) {
			local212 = this.aClass211_55.method5180();
			OpenGL.glDeleteObjectARB(local212.aLong252);
		}
		while (!this.aClass211_49.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_49.method5180();
			OpenGL.glDeleteLists((int) local19.aLong252, local19.anInt4156);
		}
		if (this.v() > 100663296 && Static174.method3502() > this.aLong146 + 60000L) {
			System.gc();
			this.aLong146 = Static174.method3502();
		}
		super.method5438(local9);
	}

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "(B)V")
	@Override
	protected void method5517() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt6559 > local7; local7++) {
			@Pc(14) Class6_Sub29 local14 = super.aClass6_Sub29Array4[local7];
			@Pc(18) int local18 = local14.method6157();
			@Pc(22) int local22 = local7 + 16386;
			@Pc(28) float local28 = local14.method6158() / 255.0F;
			Static339.aFloatArray37[0] = local14.method6164();
			Static339.aFloatArray37[1] = local14.method6161();
			Static339.aFloatArray37[2] = local14.method6165();
			Static339.aFloatArray37[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static339.aFloatArray37, 0);
			Static339.aFloatArray37[0] = (float) (local18 >> 16 & 0xFF) * local28;
			Static339.aFloatArray37[2] = local28 * (float) (local18 & 0xFF);
			Static339.aFloatArray37[1] = (float) (local18 >> 8 & 0xFF) * local28;
			Static339.aFloatArray37[3] = 1.0F;
			OpenGL.glLightfv(local22, 4609, Static339.aFloatArray37, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method6160() * local14.method6160()));
			OpenGL.glEnable(local22);
		}
		while (super.anInt6561 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method5517();
	}

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "(B)V")
	@Override
	protected void method5505() {
		if (super.aBoolean481) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "()V")
	@Override
	public void method5430() {
		this.method5526(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5519(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!nfa", name = "C", descriptor = "()V")
	@Override
	public void method5463() {
		if (super.anInt6442 <= 0 && super.anInt6381 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt6555;
		@Pc(22) int local22 = super.anInt6532;
		@Pc(25) int local25 = super.anInt6554;
		@Pc(28) int local28 = super.anInt6543;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5577();
		this.method5594(false);
		this.method5502(false);
		this.method5547(false);
		this.method5526(false);
		this.method5494(null);
		this.method5559(-2, false, false);
		this.method5545(1);
		this.method5587(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6442, super.anInt6381, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!nfa", name = "x", descriptor = "(I)V")
	@Override
	protected void method5507() {
		if (super.aBoolean494) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(ZZ)V")
	@Override
	public void method5538(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5531() {
		@Pc(13) int local13 = this.anIntArray471[super.anInt6536];
		if (local13 != 0) {
			this.anIntArray471[super.anInt6536] = 0;
			OpenGL.glBindTexture(local13, 0);
			OpenGL.glDisable(local13);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[BIZILclient!vj;II)Lclient!ae;")
	@Override
	protected Interface1 method5570(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) Class333 arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean496 || Static85.method1890(arg0) && Static85.method1890(arg4)) {
			return new Class81_Sub3(this, arg3, arg0, arg4, arg2, arg1, 0, 0);
		} else if (this.aBoolean497) {
			return new Class81_Sub4(this, arg3, arg0, arg4, arg1, 0, 0);
		} else {
			@Pc(60) Class81_Sub3 local60 = new Class81_Sub3(this, arg3, Static336.aClass220_12, Static247.method4363(arg0), Static247.method4363(arg4));
			local60.method7747(arg0, arg4, arg1, arg3, 0);
			return local60;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "X", descriptor = "(I)V")
	@Override
	protected void method5586() {
		for (@Pc(10) int local10 = super.anInt6541 - 1; local10 >= 0; local10--) {
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
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(72) float[] local72 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(74) int local74 = 0; local74 < 8; local74++) {
			@Pc(80) int local80 = local74 + 16384;
			OpenGL.glLightfv(local80, 4608, local72, 0);
			OpenGL.glLightf(local80, 4615, 0.0F);
			OpenGL.glLightf(local80, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method5586();
	}

	@OriginalMember(owner = "client!nfa", name = "p", descriptor = "()Lclient!hl;")
	@Override
	public Class138 method5435() {
		@Pc(7) int local7 = -1;
		if (this.aString73.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString73.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString73.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class138(local7, "OpenGL", this.anInt6646, this.aString74, 0L);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBLclient!tfa;)V")
	@Override
	public void method5513(@OriginalArg(0) int arg0, @OriginalArg(2) Interface20 arg1) {
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!eh;)V")
	@Override
	public void method5535(@OriginalArg(1) Class88 arg0) {
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5485(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "(II)V")
	@Override
	public void method5589(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nfa", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6381 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt6644, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "(B)V")
	@Override
	protected void method5508() {
		if (super.aBoolean486 && !super.aBoolean484) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(B)V")
	@Override
	protected void method5477() {
		if (super.aBoolean485) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "z", descriptor = "(B)V")
	private void method5604() {
		if (this.aBoolean500) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass207_8.method5012()) {
			if (!this.aBoolean500) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass8_Sub3_18.method8196(Static503.aFloatArray64), 0);
				this.method5566();
				this.method5517();
				this.aBoolean500 = true;
			}
			if (this.aBoolean500) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean474) {
				OpenGL.glMultMatrixf(super.aClass8_Sub3_15.method8196(Static503.aFloatArray64), 0);
			}
		} else if (super.aBoolean474) {
			OpenGL.glLoadIdentity();
			this.aBoolean500 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass8_Sub3_15.method8196(Static503.aFloatArray64), 0);
			this.aBoolean500 = false;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBILclient!vj;Lclient!nb;)Lclient!ae;")
	@Override
	public Interface1 method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class333 arg2, @OriginalArg(4) Class220 arg3) {
		if (this.aBoolean496 || Static85.method1890(arg0) && Static85.method1890(arg1)) {
			return new Class81_Sub3(this, arg2, arg3, arg0, arg1);
		} else if (this.aBoolean497) {
			return new Class81_Sub4(this, arg2, arg3, arg0, arg1);
		} else {
			return new Class81_Sub3(this, arg2, arg3, Static247.method4363(arg0), Static247.method4363(arg1));
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5443(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "(II)Lclient!or;")
	@Override
	protected Class37 method5529(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class37_Sub3(this, super.aClass168_83);
		} else if (arg0 == 4) {
			return new Class37_Sub4(this, super.aClass168_83, super.aClass149_5);
		} else {
			return super.method5529(arg0);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!cea;IZ)V")
	@Override
	protected void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static416.method6499(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!nfa", name = "V", descriptor = "(I)V")
	@Override
	protected void method5584() {
		Static339.aFloatArray37[3] = 1.0F;
		Static339.aFloatArray37[2] = super.aFloat138 * super.aFloat148;
		Static339.aFloatArray37[1] = super.aFloat144 * super.aFloat148;
		Static339.aFloatArray37[0] = super.aFloat145 * super.aFloat148;
		OpenGL.glLightModelfv(2899, Static339.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "r", descriptor = "(I)V")
	@Override
	protected void method5490() {
		if (super.aBoolean480) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "(II)V")
	public synchronized void method5605(@OriginalArg(0) int arg0) {
		@Pc(11) Class6 local11 = new Class6();
		local11.aLong252 = arg0;
		this.aClass211_54.method5173(local11);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!vj;Lclient!nb;B)Z")
	@Override
	public boolean method5567(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Class220 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!dga;Lclient!dga;FLclient!dga;)Lclient!dga;")
	@Override
	public Class65 method5402(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class65 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZZLclient!cea;II)V")
	@Override
	public void method5491(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static416.method6499(arg2));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!nfa", name = "z", descriptor = "(I)V")
	@Override
	protected void method5514() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass340Array3[super.anInt6536] == Static503.aClass340_13) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass8_Sub3Array3[super.anInt6536].method8196(Static503.aFloatArray64), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nfa", name = "U", descriptor = "(I)V")
	@Override
	protected void method5582() {
		Static339.aFloatArray37[1] = super.aFloat143 * super.aFloat144;
		Static339.aFloatArray37[2] = super.aFloat138 * super.aFloat143;
		Static339.aFloatArray37[3] = 1.0F;
		Static339.aFloatArray37[0] = super.aFloat143 * super.aFloat145;
		OpenGL.glLightfv(16384, 4609, Static339.aFloatArray37, 0);
		Static339.aFloatArray37[0] = -super.aFloat142 * super.aFloat145;
		Static339.aFloatArray37[1] = -super.aFloat142 * super.aFloat144;
		Static339.aFloatArray37[2] = super.aFloat138 * -super.aFloat142;
		Static339.aFloatArray37[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static339.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "()V")
	@Override
	public void method5406() {
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIBLclient!vd;Lclient!tj;II)V")
	@Override
	public void method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class328 arg2, @OriginalArg(4) Interface21 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (arg2 == Static112.aClass328_1) {
			local16 = 1;
			local20 = arg4 * 2;
		} else if (arg2 == Static385.aClass328_5) {
			local16 = 3;
			local20 = arg4 + 1;
		} else if (Static492.aClass328_6 == arg2) {
			local20 = arg4 * 3;
			local16 = 4;
		} else if (Static287.aClass328_3 == arg2) {
			local20 = arg4 + 2;
			local16 = 6;
		} else if (Static194.aClass328_2 == arg2) {
			local16 = 5;
			local20 = arg4 + 2;
		} else {
			local16 = 0;
			local20 = arg4;
		}
		@Pc(74) Class220 local74 = arg3.method5021();
		@Pc(77) Class91_Sub2 local77 = (Class91_Sub2) arg3;
		local77.method4627();
		OpenGL.glDrawElements(local16, local20, Static345.method5631(local74), local77.method4626() + (long) (arg0 * local74.anInt6224));
	}

	@OriginalMember(owner = "client!nfa", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return this.anInt6645;
	}

	@OriginalMember(owner = "client!nfa", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5599() {
		OpenGL.glTexEnvi(8960, 34161, Static551.method7864(super.aClass238Array6[super.anInt6536]));
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIILclient!vd;)V")
	@Override
	public void method5571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class328 arg2) {
		@Pc(26) byte local26;
		@Pc(24) int local24;
		if (Static112.aClass328_1 == arg2) {
			local24 = arg1 * 2;
			local26 = 1;
		} else if (arg2 == Static385.aClass328_5) {
			local26 = 3;
			local24 = arg1 + 1;
		} else if (Static492.aClass328_6 == arg2) {
			local24 = arg1 * 3;
			local26 = 4;
		} else if (arg2 == Static287.aClass328_3) {
			local26 = 6;
			local24 = arg1 + 2;
		} else if (Static194.aClass328_2 == arg2) {
			local26 = 5;
			local24 = arg1 + 2;
		} else {
			local24 = arg1;
			local26 = 0;
		}
		OpenGL.glDrawArrays(local26, arg0, local24);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5448(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5411();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)V")
	public synchronized void method5606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub24 local12 = new Class6_Sub24(arg0);
		local12.aLong252 = arg1;
		this.aClass211_51.method5173(local12);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5591(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local14);
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "()Z")
	@Override
	public boolean method5398() {
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "(I)V")
	@Override
	protected void method5480() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray46, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(Z)V")
	@Override
	public void method5413(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nfa", name = "G", descriptor = "(I)V")
	@Override
	protected void method5534() {
		this.method5604();
	}

	@OriginalMember(owner = "client!nfa", name = "K", descriptor = "(I)V")
	@Override
	protected void method5551() {
	}

	@OriginalMember(owner = "client!nfa", name = "P", descriptor = "(I)V")
	@Override
	protected void method5558() {
		OpenGL.glViewport(super.anInt6539, super.anInt6552, super.anInt6442, super.anInt6381);
	}

	@OriginalMember(owner = "client!nfa", name = "t", descriptor = "(I)V")
	@Override
	protected void method5500() {
		this.method5604();
	}

	@OriginalMember(owner = "client!nfa", name = "O", descriptor = "(I)V")
	@Override
	protected void method5557() {
		OpenGL.glDepthMask(super.aBoolean482 && super.aBoolean476);
	}

	@OriginalMember(owner = "client!nfa", name = "j", descriptor = "()V")
	@Override
	public void method5420() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method5493(@OriginalArg(0) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL2.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!nfa", name = "J", descriptor = "(I)V")
	@Override
	protected void method5549() {
		OpenGL.glTexEnvi(8960, 34162, Static551.method7864(super.aClass238Array5[super.anInt6536]));
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!vj;Lclient!nb;I)Z")
	@Override
	public boolean method5515(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Class220 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "()V")
	@Override
	protected void method5418() {
		super.method5418();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z[[III)Lclient!vfa;")
	@Override
	public Interface22 method5476(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class81_Sub1(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "(I)V")
	@Override
	protected void method5479() {
		if (super.aBoolean488) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "M", descriptor = "(I)V")
	@Override
	protected void method5554() {
		Static339.aFloatArray37[2] = (float) (super.anInt6562 & 0xFF) / 255.0F;
		Static339.aFloatArray37[1] = (float) (super.anInt6562 & 0xFF00) / 65280.0F;
		Static339.aFloatArray37[3] = (float) (super.anInt6562 >>> 24) / 255.0F;
		Static339.aFloatArray37[0] = (float) (super.anInt6562 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static339.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "t", descriptor = "()V")
	@Override
	public void method5441() {
	}

	@OriginalMember(owner = "client!nfa", name = "z", descriptor = "()Z")
	@Override
	public boolean method5453() {
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[FZIIZILclient!vj;)Lclient!ae;")
	@Override
	protected Interface1 method5470(@OriginalArg(1) float[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class333 arg4) {
		if (this.aBoolean496 || Static85.method1890(arg3) && Static85.method1890(arg2)) {
			return new Class81_Sub3(this, arg4, arg3, arg2, arg1, arg0, 0, 0);
		} else if (this.aBoolean497) {
			return new Class81_Sub4(this, arg4, arg3, arg2, arg0, 0, 0);
		} else {
			@Pc(39) Class81_Sub3 local39 = new Class81_Sub3(this, arg4, Static336.aClass220_16, Static247.method4363(arg3), Static247.method4363(arg2));
			local39.method5692(arg0, arg2, arg4, arg3);
			return local39;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "u", descriptor = "(B)V")
	@Override
	protected void method5575() {
		if (super.aClass27_4 == Static464.aClass27_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static537.aClass27_6 == super.aClass27_4) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass27_4 == Static553.aClass27_7) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "()V")
	@Override
	public void method5411() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(IBI)V")
	public synchronized void method5607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub24 local12 = new Class6_Sub24(arg0);
		local12.aLong252 = arg1;
		this.aClass211_50.method5173(local12);
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(BZ)Lclient!tj;")
	@Override
	public Interface21 method5550(@OriginalArg(1) boolean arg0) {
		return new Class91_Sub2(this, Static336.aClass220_13, arg0);
	}

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "(B)V")
	@Override
	protected void method5488() {
		OpenGL.glScissor(super.anInt6539 + super.anInt6555, -super.anInt6543 + super.anInt6381 + super.anInt6552, super.anInt6532 - super.anInt6555, -super.anInt6554 + super.anInt6543);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B[Lclient!ada;)Lclient!eh;")
	@Override
	public Class88 method5510(@OriginalArg(1) Class7[] arg0) {
		return null;
	}
}
