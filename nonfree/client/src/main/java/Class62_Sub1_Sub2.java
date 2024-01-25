import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class62_Sub1_Sub2 extends Class62_Sub1 {

	@OriginalMember(owner = "client!lh", name = "ii", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!lh", name = "Yh", descriptor = "Lclient!fea;")
	private final Class99 aClass99_42 = new Class99();

	@OriginalMember(owner = "client!lh", name = "bi", descriptor = "Lclient!fea;")
	private final Class99 aClass99_43 = new Class99();

	@OriginalMember(owner = "client!lh", name = "ci", descriptor = "Lclient!fea;")
	private final Class99 aClass99_44 = new Class99();

	@OriginalMember(owner = "client!lh", name = "di", descriptor = "Lclient!fea;")
	private final Class99 aClass99_45 = new Class99();

	@OriginalMember(owner = "client!lh", name = "fi", descriptor = "Lclient!fea;")
	private final Class99 aClass99_46 = new Class99();

	@OriginalMember(owner = "client!lh", name = "gi", descriptor = "Lclient!fea;")
	private final Class99 aClass99_47 = new Class99();

	@OriginalMember(owner = "client!lh", name = "hi", descriptor = "Lclient!fea;")
	private final Class99 aClass99_48 = new Class99();

	@OriginalMember(owner = "client!lh", name = "ji", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!lh", name = "si", descriptor = "Z")
	private boolean aBoolean401 = false;

	@OriginalMember(owner = "client!lh", name = "oi", descriptor = "I")
	private final int anInt5781 = 0;

	@OriginalMember(owner = "client!lh", name = "th", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!lh", name = "ui", descriptor = "Ljava/lang/String;")
	private final String aString58;

	@OriginalMember(owner = "client!lh", name = "qi", descriptor = "Ljava/lang/String;")
	private final String aString57;

	@OriginalMember(owner = "client!lh", name = "ri", descriptor = "I")
	private final int anInt5783;

	@OriginalMember(owner = "client!lh", name = "ti", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!lh", name = "mi", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!lh", name = "ni", descriptor = "Z")
	private final boolean aBoolean400;

	@OriginalMember(owner = "client!lh", name = "li", descriptor = "Z")
	public final boolean aBoolean398;

	@OriginalMember(owner = "client!lh", name = "pi", descriptor = "I")
	public final int anInt5782;

	@OriginalMember(owner = "client!lh", name = "ki", descriptor = "[I")
	public final int[] anIntArray394;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!n;Lclient!gp;I)V")
	public Class62_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface8 arg3, @OriginalArg(4) Class117 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString58 = OpenGL.glGetString(7936).toLowerCase();
			this.aString57 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString58.indexOf("microsoft") != -1 || this.aString58.indexOf("brian paul") != -1 || this.aString58.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(101) String local101 = OpenGL.glGetString(7938);
			@Pc(109) String[] local109 = Static514.method7107(' ', local101.replace('.', ' '));
			if (local109.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(132) int local132;
			try {
				@Pc(126) int local126 = Static412.method5992(local109[0]);
				local132 = Static412.method5992(local109[1]);
				this.anInt5783 = local132 + local126 * 10;
			} catch (@Pc(141) NumberFormatException local141) {
				throw new RuntimeException("");
			}
			if (this.anInt5783 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(180) int[] local180 = new int[1];
				OpenGL.glGetIntegerv(34018, local180, 0);
				super.anInt5677 = local180[0];
				if (super.anInt5677 < 2) {
					throw new RuntimeException("");
				}
				super.anInt5699 = 8;
				this.aBoolean402 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean384 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean399 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean394 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean400 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean379 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean398 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anInt5782 = Stream.c() ? 33639 : 5121;
				if (this.aString57.indexOf("radeon") != -1) {
					local132 = 0;
					@Pc(276) boolean local276 = false;
					@Pc(278) boolean local278 = false;
					@Pc(287) String[] local287 = Static514.method7107(' ', this.aString57.replace('/', ' '));
					for (@Pc(289) int local289 = 0; local289 < local287.length; local289++) {
						@Pc(295) String local295 = local287[local289];
						try {
							if (local295.length() > 0) {
								if (local295.charAt(0) == 'x' && local295.length() >= 3 && Static359.method5525(local295.substring(1, 3))) {
									local295 = local295.substring(1);
									local278 = true;
								}
								if (local295.equals("hd")) {
									local276 = true;
								} else {
									if (local295.startsWith("hd")) {
										local295 = local295.substring(2);
										local276 = true;
									}
									if (local295.length() >= 4 && Static359.method5525(local295.substring(0, 4))) {
										local132 = Static412.method5992(local295.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(365) Exception local365) {
						}
					}
					if (!local278 && !local276) {
						if (local132 >= 7000 && local132 <= 9250) {
							super.aBoolean379 = false;
						}
						if (local132 >= 7000 && local132 <= 7999) {
							this.aBoolean402 = false;
						}
					}
					this.aBoolean399 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString58.indexOf("intel");
				if (this.aBoolean402) {
					try {
						@Pc(419) int[] local419 = new int[1];
						OpenGL.glGenBuffersARB(1, local419, 0);
					} catch (@Pc(425) Throwable local425) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray394 = new int[super.anInt5677];
				OpenGL.glClear(16640);
				this.anOpenGL2.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(444) Throwable local444) {
			local444.printStackTrace();
			this.method7037();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "(I)V")
	@Override
	protected void method4670() {
		if (super.aClass28_9 == Static318.aClass28_10) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static193.aClass28_7 == super.aClass28_9) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass28_9 == Static4.aClass28_12) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZIIILclient!kl;[BI)Lclient!dea;")
	@Override
	protected Interface3 method4762(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class174 arg3, @OriginalArg(6) byte[] arg4) {
		if (this.aBoolean400 || Static281.method4574(arg2) && Static281.method4574(arg1)) {
			return new Class102_Sub4(this, arg3, arg2, arg1, arg0, arg4, 0, 0);
		} else if (this.aBoolean399) {
			return new Class102_Sub3(this, arg3, arg2, arg1, arg4, 0, 0);
		} else {
			@Pc(50) Class102_Sub4 local50 = new Class102_Sub4(this, arg3, Static523.aClass306_15, Static179.method3071(arg2), Static179.method3071(arg1));
			local50.method7453(arg2, arg3, 0, arg4, arg1);
			return local50;
		}
	}

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "()V")
	@Override
	public void method7039() {
	}

	@OriginalMember(owner = "client!lh", name = "ib", descriptor = "(I)V")
	@Override
	public void method4779() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray41, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ne;B)V")
	@Override
	public void method4694(@OriginalArg(0) Class206 arg0) {
		if (arg0 == Static77.aClass206_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(6) int local6 = Static6.method262(arg0);
		OpenGL.glTexGeni(8192, 9472, local6);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local6);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local6);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "(I)V")
	@Override
	protected void method4675() {
		@Pc(13) int local13 = this.anIntArray394[super.anInt5667];
		if (local13 != 0) {
			this.anIntArray394[super.anInt5667] = 0;
			OpenGL.glBindTexture(local13, 0);
			OpenGL.glDisable(local13);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!vt;Lclient!kl;)Z")
	@Override
	public boolean method4739(@OriginalArg(1) Class306 arg0, @OriginalArg(2) Class174 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "(B)V")
	@Override
	protected void method4780() {
		Static475.aFloatArray67[0] = (float) (super.anInt5665 & 0xFF0000) / 1.671168E7F;
		Static475.aFloatArray67[3] = (float) (super.anInt5665 >>> 24) / 255.0F;
		Static475.aFloatArray67[1] = (float) (super.anInt5665 & 0xFF00) / 65280.0F;
		Static475.aFloatArray67[2] = (float) (super.anInt5665 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static475.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "(I)V")
	@Override
	protected void method4697() {
		if (super.aBoolean385) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIIIILclient!kl;)Lclient!ve;")
	@Override
	public Interface17 method4682(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class174 arg1) {
		return new Class102_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7055(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7030();
	}

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "(I)V")
	@Override
	protected void method4678() {
		OpenGL.glActiveTexture(super.anInt5667 + 33984);
	}

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "()V")
	@Override
	public void method7065() {
		if (super.anInt5584 <= 0 && super.anInt5509 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt5670;
		@Pc(16) int local16 = super.anInt5661;
		@Pc(19) int local19 = super.anInt5666;
		@Pc(22) int local22 = super.anInt5668;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4709();
		this.method4721(false);
		this.method4760(false);
		this.method4751(false);
		this.method4752(false);
		this.method4676(null);
		this.method4656(-2, false, false);
		this.method4714(1);
		this.method4754(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt5584, super.anInt5509, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!lh", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt5781;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!kl;Lclient!vt;)Z")
	@Override
	public boolean method4660(@OriginalArg(1) Class174 arg0, @OriginalArg(2) Class306 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIZLclient!kl;[FII)Lclient!dea;")
	@Override
	protected Interface3 method4736(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) Class174 arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean400 || Static281.method4574(arg0) && Static281.method4574(arg4)) {
			return new Class102_Sub4(this, arg2, arg0, arg4, arg1, arg3, 0, 0);
		} else if (this.aBoolean399) {
			return new Class102_Sub3(this, arg2, arg0, arg4, arg3, 0, 0);
		} else {
			@Pc(51) Class102_Sub4 local51 = new Class102_Sub4(this, arg2, Static523.aClass306_19, Static179.method3071(arg0), Static179.method3071(arg4));
			local51.method7457(arg0, arg4, arg3, arg2);
			return local51;
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(Z)V")
	@Override
	protected void method4664() {
		this.method4796();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
	@Override
	public void method4700(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "()Z")
	@Override
	public boolean method7031() {
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!pca;II)V")
	@Override
	public void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) int arg2) {
		@Pc(18) byte local18;
		@Pc(22) int local22;
		if (Static357.aClass228_6 == arg1) {
			local18 = 1;
			local22 = arg2 * 2;
		} else if (Static41.aClass228_3 == arg1) {
			local18 = 3;
			local22 = arg2 + 1;
		} else if (arg1 == Static403.aClass228_7) {
			local18 = 4;
			local22 = arg2 * 3;
		} else if (Static147.aClass228_4 == arg1) {
			local18 = 6;
			local22 = arg2 + 2;
		} else if (Static206.aClass228_5 == arg1) {
			local18 = 5;
			local22 = arg2 + 2;
		} else {
			local18 = 0;
			local22 = arg2;
		}
		OpenGL.glDrawArrays(local18, arg0, local22);
	}

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "(I)V")
	@Override
	protected void method4708() {
		if (super.aBoolean382) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "(B)V")
	@Override
	protected void method4726() {
		for (@Pc(6) int local6 = super.anInt5677 - 1; local6 >= 0; local6--) {
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
		OpenGL.glDisable(2884);
		OpenGL.glCullFace(1029);
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
		super.method4726();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4720(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "(I)V")
	@Override
	protected void method4686() {
		OpenGL.glDepthMask(super.aBoolean383 && super.aBoolean380);
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7048(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub27 local19;
		while (!this.aClass99_43.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_43.method2516();
			Static504.anIntArray671[local7++] = (int) local19.aLong253;
			super.anInt5640 -= local19.anInt4812;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static504.anIntArray671, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static504.anIntArray671, 0);
			local7 = 0;
		}
		while (!this.aClass99_44.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_44.method2516();
			Static504.anIntArray671[local7++] = (int) local19.aLong253;
			super.anInt5658 -= local19.anInt4812;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static504.anIntArray671, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static504.anIntArray671, 0);
			local7 = 0;
		}
		while (!this.aClass99_45.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_45.method2516();
			Static504.anIntArray671[local7++] = local19.anInt4812;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static504.anIntArray671, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static504.anIntArray671, 0);
			local7 = 0;
		}
		while (!this.aClass99_46.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_46.method2516();
			Static504.anIntArray671[local7++] = (int) local19.aLong253;
			super.anInt5654 -= local19.anInt4812;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static504.anIntArray671, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static504.anIntArray671, 0);
		}
		while (!this.aClass99_42.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_42.method2516();
			OpenGL.glDeleteLists((int) local19.aLong253, local19.anInt4812);
		}
		@Pc(218) Class5 local218;
		while (!this.aClass99_47.method2523()) {
			local218 = this.aClass99_47.method2516();
			OpenGL.glDeleteProgramARB((int) local218.aLong253);
		}
		while (!this.aClass99_48.method2523()) {
			local218 = this.aClass99_48.method2516();
			OpenGL.glDeleteObjectARB(local218.aLong253);
		}
		while (!this.aClass99_42.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_42.method2516();
			OpenGL.glDeleteLists((int) local19.aLong253, local19.anInt4812);
		}
		if (this.U() > 100663296 && Static105.method2132() > this.aLong153 + 60000L) {
			System.gc();
			this.aLong153 = Static105.method2132();
		}
		super.method7048(local11);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(IB)V")
	public synchronized void method4792(@OriginalArg(0) int arg0) {
		@Pc(12) Class5 local12 = new Class5();
		local12.aLong253 = arg0;
		this.aClass99_47.method2513(local12);
	}

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt5509 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt5782, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "(Z)V")
	@Override
	protected void method4777() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray46, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7041(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ws;B)V")
	@Override
	public void method4713(@OriginalArg(0) Class318 arg0) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)V")
	public synchronized void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub27 local8 = new Class5_Sub27(arg1);
		local8.aLong253 = arg0;
		this.aClass99_44.method2513(local8);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
	public synchronized void method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub27 local12 = new Class5_Sub27(arg0);
		local12.aLong253 = arg1;
		this.aClass99_43.method2513(local12);
	}

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "(B)V")
	@Override
	protected void method4747() {
		if (super.aBoolean393 && super.aBoolean387 && super.anInt5689 >= 0 | super.aBoolean388) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(B)V")
	@Override
	protected void method4712() {
		OpenGL.glScissor(super.anInt5670 + super.anInt5692, super.anInt5509 + super.anInt5682 - super.anInt5668, super.anInt5661 - super.anInt5670, super.anInt5668 + -super.anInt5666);
	}

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "(B)V")
	@Override
	protected void method4748() {
		OpenGL.glTexEnvi(8960, 34161, Static532.method7251(super.aClass98Array5[super.anInt5667]));
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!kk;Lclient!kk;FLclient!kk;)Lclient!kk;")
	@Override
	public Class92 method7052(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class92 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[IIIZ)Lclient!dea;")
	@Override
	public Interface3 method4743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (this.aBoolean400 || Static281.method4574(arg4) && Static281.method4574(arg1)) {
			return new Class102_Sub4(this, arg4, arg1, arg5, arg3, 0, arg2);
		} else if (this.aBoolean399) {
			return new Class102_Sub3(this, arg4, arg1, arg3, 0, arg2);
		} else {
			@Pc(38) Class102_Sub4 local38 = new Class102_Sub4(this, Static189.aClass174_6, Static523.aClass306_15, Static179.method3071(arg4), Static179.method3071(arg1));
			local38.method7452(0, arg1, arg4, arg3, 0, arg2);
			return local38;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[[IBZ)Lclient!uba;")
	@Override
	public Interface15 method4761(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class102_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "()V")
	@Override
	public void method6999() {
		this.method4752(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "()V")
	@Override
	protected void method7037() {
		super.method7037();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "()Lclient!dp;")
	@Override
	public Class68 method7016() {
		@Pc(7) int local7 = -1;
		if (this.aString58.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString58.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString58.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class68(local7, "OpenGL", this.anInt5783, this.aString57, 0L);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4753(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local14)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZB)Lclient!sp;")
	@Override
	public Interface13 method4657(@OriginalArg(0) boolean arg0) {
		return new Class129_Sub2(this, Static523.aClass306_16, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "(B)V")
	@Override
	protected void method4788() {
		if (super.aBoolean397) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!lh", name = "hb", descriptor = "(I)V")
	@Override
	protected void method4776() {
		Static475.aFloatArray67[1] = super.aFloat239 * super.aFloat241;
		Static475.aFloatArray67[2] = super.aFloat229 * super.aFloat241;
		Static475.aFloatArray67[3] = 1.0F;
		Static475.aFloatArray67[0] = super.aFloat241 * super.aFloat234;
		OpenGL.glLightModelfv(2899, Static475.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IZ)V")
	@Override
	public void method4784(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method4689(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "(I)V")
	@Override
	protected void method4698() {
		if (super.aBoolean390) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "(I)V")
	@Override
	protected void method4669() {
		@Pc(46) int local46;
		if (super.aBoolean388) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local46 = super.anInt5687;
		} else {
			super.aFloat226 = super.anInt5685 - super.anInt5662;
			super.aFloat231 = super.aFloat226 - (float) super.anInt5689;
			if (super.aFloat231 < (float) super.anInt5676) {
				super.aFloat231 = super.anInt5676;
			}
			OpenGL.glFogf(2915, super.aFloat231);
			OpenGL.glFogf(2916, super.aFloat226);
			local46 = super.anInt5673;
		}
		Static475.aFloatArray67[1] = (float) (local46 & 0xFF00) / 65280.0F;
		Static475.aFloatArray67[0] = (float) (local46 & 0xFF0000) / 1.671168E7F;
		Static475.aFloatArray67[2] = (float) (local46 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static475.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZLclient!dg;Z)V")
	@Override
	protected void method4662(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static47.method1045(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "(I)V")
	@Override
	protected void method4717() {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!pca;IIILclient!sp;II)V")
	@Override
	public void method4727(@OriginalArg(0) Class228 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface13 arg4, @OriginalArg(6) int arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static357.aClass228_6 == arg0) {
			local12 = arg3 * 2;
			local14 = 1;
		} else if (arg0 == Static41.aClass228_3) {
			local12 = arg3 + 1;
			local14 = 3;
		} else if (Static403.aClass228_7 == arg0) {
			local12 = arg3 * 3;
			local14 = 4;
		} else if (Static147.aClass228_4 == arg0) {
			local14 = 6;
			local12 = arg3 + 2;
		} else if (arg0 == Static206.aClass228_5) {
			local14 = 5;
			local12 = arg3 + 2;
		} else {
			local14 = 0;
			local12 = arg3;
		}
		@Pc(68) Class306 local68 = arg4.method3497();
		@Pc(71) Class129_Sub2 local71 = (Class129_Sub2) arg4;
		local71.method3496();
		OpenGL.glDrawElements(local14, local12, Static149.method2768(local68), local71.method3486() + (long) (arg1 * local68.anInt8854));
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V")
	@Override
	public void method7027(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)Lclient!up;")
	@Override
	public Interface16 method4702(@OriginalArg(1) boolean arg0) {
		return new Class129_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "()Z")
	@Override
	public boolean method7033() {
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "fb", descriptor = "(I)F")
	@Override
	protected float method4774() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIILclient!vt;Lclient!kl;)Lclient!dea;")
	@Override
	public Interface3 method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class306 arg2, @OriginalArg(4) Class174 arg3) {
		if (this.aBoolean400 || Static281.method4574(arg0) && Static281.method4574(arg1)) {
			return new Class102_Sub4(this, arg3, arg2, arg0, arg1);
		} else if (this.aBoolean399) {
			return new Class102_Sub3(this, arg3, arg2, arg0, arg1);
		} else {
			return new Class102_Sub4(this, arg3, arg2, Static179.method3071(arg0), Static179.method3071(arg1));
		}
	}

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "(I)V")
	@Override
	protected void method4729() {
		OpenGL.glMatrixMode(5890);
		if (Static288.aClass273_6 == super.aClass273Array3[super.anInt5667]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass78_Sub1Array3[super.anInt5667].method2181(Static218.aFloatArray28), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	@Override
	protected void method4683() {
		OpenGL.glTexEnvi(8960, 34162, Static532.method7251(super.aClass98Array6[super.anInt5667]));
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z[Lclient!wg;)Lclient!ws;")
	@Override
	public Class318 method4782(@OriginalArg(1) Class313[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZZILclient!dg;I)V")
	@Override
	public void method4732(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class63 arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static47.method1045(arg2));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "(I)V")
	@Override
	protected void method4667() {
		if (super.aBoolean386 && !super.aBoolean392) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "(I)V")
	@Override
	protected void method4716() {
		if (super.aBoolean381) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!up;I)V")
	@Override
	public void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)Lclient!rda;")
	@Override
	protected Class70 method4725(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class70_Sub1(this, super.aClass117_127);
		} else if (arg0 == 4) {
			return new Class70_Sub3(this, super.aClass117_127, super.aClass222_5);
		} else {
			return super.method4725(arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "()V")
	@Override
	public void method7035() {
	}

	@OriginalMember(owner = "client!lh", name = "cb", descriptor = "(I)V")
	@Override
	protected void method4769() {
		OpenGL.glViewport(super.anInt5692, super.anInt5682, super.anInt5584, super.anInt5509);
	}

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "(I)V")
	@Override
	protected void method4666() {
		this.method4796();
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "()V")
	@Override
	public void method7004() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	@Override
	protected void method4658() {
		Static475.aFloatArray67[0] = super.aFloat234 * super.aFloat236;
		Static475.aFloatArray67[1] = super.aFloat239 * super.aFloat236;
		Static475.aFloatArray67[3] = 1.0F;
		Static475.aFloatArray67[2] = super.aFloat236 * super.aFloat229;
		OpenGL.glLightfv(16384, 4609, Static475.aFloatArray67, 0);
		Static475.aFloatArray67[2] = -super.aFloat235 * super.aFloat229;
		Static475.aFloatArray67[0] = super.aFloat234 * -super.aFloat235;
		Static475.aFloatArray67[1] = -super.aFloat235 * super.aFloat239;
		Static475.aFloatArray67[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static475.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4687(@OriginalArg(1) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL2.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "(B)V")
	private void method4796() {
		if (this.aBoolean401) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass95_3.method2412()) {
			if (!this.aBoolean401) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass78_Sub1_18.method2181(Static218.aFloatArray28), 0);
				this.method4779();
				this.method4735();
				this.aBoolean401 = true;
			}
			if (this.aBoolean401) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean377) {
				OpenGL.glMultMatrixf(super.aClass78_Sub1_15.method2181(Static218.aFloatArray28), 0);
				return;
			}
		} else if (super.aBoolean377) {
			OpenGL.glLoadIdentity();
			this.aBoolean401 = false;
			return;
		} else {
			OpenGL.glLoadMatrixf(super.aClass78_Sub1_15.method2181(Static218.aFloatArray28), 0);
			this.aBoolean401 = false;
		}
	}

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "()V")
	@Override
	public void method7030() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!lh", name = "N", descriptor = "(I)V")
	@Override
	protected void method4735() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt5663 > local7; local7++) {
			@Pc(14) Class5_Sub10 local14 = super.aClass5_Sub10Array6[local7];
			@Pc(18) int local18 = local14.method5185();
			@Pc(22) int local22 = local7 + 16386;
			@Pc(28) float local28 = local14.method5184() / 255.0F;
			Static475.aFloatArray67[0] = local14.method5189();
			Static475.aFloatArray67[1] = local14.method5190();
			Static475.aFloatArray67[2] = local14.method5183();
			Static475.aFloatArray67[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static475.aFloatArray67, 0);
			Static475.aFloatArray67[3] = 1.0F;
			Static475.aFloatArray67[0] = local28 * (float) (local18 >> 16 & 0xFF);
			Static475.aFloatArray67[1] = (float) (local18 >> 8 & 0xFF) * local28;
			Static475.aFloatArray67[2] = (float) (local18 & 0xFF) * local28;
			OpenGL.glLightfv(local22, 4609, Static475.aFloatArray67, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method5191() * local14.method5191()));
			OpenGL.glEnable(local22);
		}
		while (super.anInt5675 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method4735();
	}
}
