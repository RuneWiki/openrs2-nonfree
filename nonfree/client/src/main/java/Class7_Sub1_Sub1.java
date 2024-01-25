import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class7_Sub1_Sub1 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ad", name = "ki", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!ad", name = "li", descriptor = "Z")
	private boolean aBoolean67;

	@OriginalMember(owner = "client!ad", name = "mi", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!ad", name = "oi", descriptor = "Z")
	private boolean aBoolean68;

	@OriginalMember(owner = "client!ad", name = "pi", descriptor = "Z")
	private boolean aBoolean69;

	@OriginalMember(owner = "client!ad", name = "qi", descriptor = "Z")
	private boolean aBoolean70;

	@OriginalMember(owner = "client!ad", name = "ri", descriptor = "J")
	private long aLong3;

	@OriginalMember(owner = "client!ad", name = "Fg", descriptor = "Lclient!au;")
	private final Class22 aClass22_3 = new Class22();

	@OriginalMember(owner = "client!ad", name = "Bh", descriptor = "Lclient!au;")
	private final Class22 aClass22_4 = new Class22();

	@OriginalMember(owner = "client!ad", name = "Xh", descriptor = "Lclient!au;")
	private final Class22 aClass22_5 = new Class22();

	@OriginalMember(owner = "client!ad", name = "Zh", descriptor = "Lclient!au;")
	private final Class22 aClass22_6 = new Class22();

	@OriginalMember(owner = "client!ad", name = "hi", descriptor = "Lclient!au;")
	private final Class22 aClass22_7 = new Class22();

	@OriginalMember(owner = "client!ad", name = "ii", descriptor = "Lclient!au;")
	private final Class22 aClass22_8 = new Class22();

	@OriginalMember(owner = "client!ad", name = "ji", descriptor = "Lclient!au;")
	private final Class22 aClass22_9 = new Class22();

	@OriginalMember(owner = "client!ad", name = "ni", descriptor = "[Lclient!qv;")
	private final Class46_Sub1[] aClass46_Sub1Array1 = new Class46_Sub1[16];

	@OriginalMember(owner = "client!ad", name = "si", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!ad", name = "ti", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!ad", name = "Di", descriptor = "I")
	private final int anInt722 = 0;

	@OriginalMember(owner = "client!ad", name = "kh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ad", name = "yi", descriptor = "Ljava/lang/String;")
	private final String aString5;

	@OriginalMember(owner = "client!ad", name = "zi", descriptor = "Ljava/lang/String;")
	private final String aString6;

	@OriginalMember(owner = "client!ad", name = "ui", descriptor = "I")
	private final int anInt720;

	@OriginalMember(owner = "client!ad", name = "Ci", descriptor = "Z")
	public boolean aBoolean74;

	@OriginalMember(owner = "client!ad", name = "vi", descriptor = "Z")
	private boolean aBoolean71;

	@OriginalMember(owner = "client!ad", name = "Bi", descriptor = "Z")
	private final boolean aBoolean73;

	@OriginalMember(owner = "client!ad", name = "xi", descriptor = "Z")
	public final boolean aBoolean72;

	@OriginalMember(owner = "client!ad", name = "Ei", descriptor = "Z")
	public final boolean aBoolean75;

	@OriginalMember(owner = "client!ad", name = "Fi", descriptor = "Z")
	public final boolean aBoolean76;

	@OriginalMember(owner = "client!ad", name = "wi", descriptor = "[I")
	public final int[] anIntArray10;

	@OriginalMember(owner = "client!ad", name = "Ai", descriptor = "I")
	public final int anInt721;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!vo;I)V")
	public Class7_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class348 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString5 = OpenGL.glGetString(7936).toLowerCase();
			this.aString6 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString5.indexOf("microsoft") != -1 || this.aString5.indexOf("brian paul") != -1 || this.aString5.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static297.method4750(local108.replace('.', ' '), ' ');
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(137) int local137;
			try {
				@Pc(131) int local131 = Static393.method6016(local116[0]);
				local137 = Static393.method6016(local116[1]);
				this.anInt720 = local131 * 10 + local137;
			} catch (@Pc(146) NumberFormatException local146) {
				throw new RuntimeException("");
			}
			if (this.anInt720 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(183) int[] local183 = new int[1];
				OpenGL.glGetIntegerv(34018, local183, 0);
				super.anInt7369 = local183[0];
				if (super.anInt7369 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7376 = 8;
				this.aBoolean74 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean519 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean71 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean520 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean73 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean532 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean72 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean75 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean76 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray10 = new int[super.anInt7369];
				this.anInt721 = Stream.c() ? 33639 : 5121;
				if (this.aString6.indexOf("radeon") != -1) {
					local137 = 0;
					@Pc(286) boolean local286 = false;
					@Pc(288) boolean local288 = false;
					@Pc(297) String[] local297 = Static297.method4750(this.aString6.replace('/', ' '), ' ');
					for (@Pc(299) int local299 = 0; local299 < local297.length; local299++) {
						@Pc(305) String local305 = local297[local299];
						try {
							if (local305.length() > 0) {
								if (local305.charAt(0) == 'x' && local305.length() >= 3 && Static256.method4063(local305.substring(1, 3))) {
									local288 = true;
									local305 = local305.substring(1);
								}
								if (local305.equals("hd")) {
									local286 = true;
								} else {
									if (local305.startsWith("hd")) {
										local286 = true;
										local305 = local305.substring(2);
									}
									if (local305.length() >= 4 && Static256.method4063(local305.substring(0, 4))) {
										local137 = Static393.method6016(local305.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(375) Exception local375) {
						}
					}
					if (!local288 && !local286) {
						if (local137 >= 7000 && local137 <= 9250) {
							super.aBoolean532 = false;
						}
						if (local137 >= 7000 && local137 <= 7999) {
							this.aBoolean74 = false;
						}
					}
					this.aBoolean71 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString5.indexOf("intel");
				if (this.aBoolean74) {
					try {
						@Pc(431) int[] local431 = new int[1];
						OpenGL.glGenBuffersARB(1, local431, 0);
					} catch (@Pc(437) Throwable local437) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(443) Throwable local443) {
			local443.printStackTrace();
			this.method7822();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7799(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7827();
	}

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "()V")
	@Override
	protected void method7822() {
		super.method7822();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method7853(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class4_Sub27 local19;
		while (!this.aClass22_4.method893()) {
			local19 = (Class4_Sub27) this.aClass22_4.method896();
			Static81.anIntArray562[local11++] = (int) local19.aLong295;
			super.anInt7339 -= local19.anInt4968;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static81.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static81.anIntArray562, 0);
			local11 = 0;
		}
		while (!this.aClass22_5.method893()) {
			local19 = (Class4_Sub27) this.aClass22_5.method896();
			Static81.anIntArray562[local11++] = (int) local19.aLong295;
			super.anInt7341 -= local19.anInt4968;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static81.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static81.anIntArray562, 0);
			local11 = 0;
		}
		while (!this.aClass22_6.method893()) {
			local19 = (Class4_Sub27) this.aClass22_6.method896();
			Static81.anIntArray562[local11++] = local19.anInt4968;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static81.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static81.anIntArray562, 0);
			local11 = 0;
		}
		while (!this.aClass22_7.method893()) {
			local19 = (Class4_Sub27) this.aClass22_7.method896();
			Static81.anIntArray562[local11++] = (int) local19.aLong295;
			super.anInt7338 -= local19.anInt4968;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static81.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static81.anIntArray562, 0);
		}
		while (!this.aClass22_3.method893()) {
			local19 = (Class4_Sub27) this.aClass22_3.method896();
			OpenGL.glDeleteLists((int) local19.aLong295, local19.anInt4968);
		}
		@Pc(213) Class4 local213;
		while (!this.aClass22_8.method893()) {
			local213 = this.aClass22_8.method896();
			OpenGL.glDeleteProgramARB((int) local213.aLong295);
		}
		while (!this.aClass22_9.method893()) {
			local213 = this.aClass22_9.method896();
			OpenGL.glDeleteObjectARB(local213.aLong295);
		}
		while (!this.aClass22_3.method893()) {
			local19 = (Class4_Sub27) this.aClass22_3.method896();
			OpenGL.glDeleteLists((int) local19.aLong295, local19.anInt4968);
		}
		if (this.b() > 100663296 && Static112.method2047() > this.aLong3 + 60000L) {
			System.gc();
			this.aLong3 = Static112.method2047();
		}
		super.method7853(local9);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)Lclient!wf;")
	@Override
	public Interface24 method5704(@OriginalArg(0) boolean arg0) {
		return new Class46_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7848(@OriginalArg(0) Class88 arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!hp;I)V")
	@Override
	public void method5684(@OriginalArg(0) Class143 arg0) {
		if (Static469.aClass143_4 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(26) int local26 = Static301.method4796(arg0);
		OpenGL.glTexGeni(8192, 9472, local26);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local26);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local26);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jb;Lclient!qda;I)Z")
	@Override
	public boolean method5734(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class273 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "(I)V")
	@Override
	protected void method5723() {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5742(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZBILclient!jb;I[FI)Lclient!dca;")
	@Override
	protected Interface4 method5753(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class161 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float[] arg4) {
		if (this.aBoolean73 || Static32.method1002(arg3) && Static32.method1002(arg1)) {
			return new Class5_Sub4(this, arg2, arg3, arg1, arg0, arg4, 0, 0);
		} else if (this.aBoolean71) {
			return new Class5_Sub1(this, arg2, arg3, arg1, arg4, 0, 0);
		} else {
			@Pc(47) Class5_Sub4 local47 = new Class5_Sub4(this, arg2, Static424.aClass273_16, Static488.method7100(arg3), Static488.method7100(arg1));
			local47.method7379(arg3, arg2, arg1, arg4);
			return local47;
		}
	}

	@OriginalMember(owner = "client!ad", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt722;
	}

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "(B)V")
	@Override
	protected void method5771() {
		OpenGL.glViewport(super.anInt7374, super.anInt7373, super.anInt7180, super.anInt7241);
	}

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "(B)V")
	@Override
	protected void method5785() {
		@Pc(9) int local9 = this.anIntArray10[super.anInt7359];
		if (local9 != 0) {
			this.anIntArray10[super.anInt7359] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z[[IIB)Lclient!hba;")
	@Override
	public Interface11 method5744(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class5_Sub3(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7241 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt721, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "(Z)V")
	private void method631() {
		if (this.aBoolean70) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass357_6.method8118()) {
			if (!this.aBoolean69) {
				OpenGL.glLoadMatrixf(super.aClass81_Sub1_18.method1969(Static506.aFloatArray67), 0);
				this.aBoolean69 = true;
				this.method5703();
				this.method5773();
			}
			if (super.aBoolean512) {
				this.aBoolean70 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass81_Sub1_15.method1969(Static506.aFloatArray67), 0);
				this.aBoolean70 = true;
			}
		} else if (super.aBoolean512) {
			OpenGL.glLoadIdentity();
			this.aBoolean70 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass81_Sub1_15.method1969(Static506.aFloatArray67), 0);
			this.aBoolean70 = false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public synchronized void method632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub27 local14 = new Class4_Sub27(arg0);
		local14.aLong295 = arg1;
		this.aClass22_5.method894(local14);
	}

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "()V")
	@Override
	public void method7849() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5747() {
		OpenGL.glTexEnvi(8960, 34162, Static520.method8289(super.aClass95Array5[super.anInt7359]));
	}

	@OriginalMember(owner = "client!ad", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZ)Lclient!eu;")
	@Override
	public Interface6 method5726(@OriginalArg(1) boolean arg0) {
		return new Class46_Sub2(this, Static424.aClass273_13, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!jb;I[BZI)Lclient!wca;")
	@Override
	public Interface23 method5784(@OriginalArg(1) Class161 arg0, @OriginalArg(3) byte[] arg1) {
		return new Class5_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "()Lclient!sr;")
	@Override
	public Class308 method7815() {
		@Pc(7) int local7 = -1;
		if (this.aString5.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString5.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString5.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class308(local7, "OpenGL", this.anInt720, this.aString6, 0L);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[BZIILclient!jb;I)Lclient!dca;")
	@Override
	protected Interface4 method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(6) Class161 arg4) {
		if (this.aBoolean73 || Static32.method1002(arg1) && Static32.method1002(arg0)) {
			return new Class5_Sub4(this, arg4, arg1, arg0, arg3, arg2, 0, 0);
		} else if (this.aBoolean71) {
			return new Class5_Sub1(this, arg4, arg1, arg0, arg2, 0, 0);
		} else {
			@Pc(61) Class5_Sub4 local61 = new Class5_Sub4(this, arg4, Static424.aClass273_12, Static488.method7100(arg1), Static488.method7100(arg0));
			local61.method7378(arg2, 0, arg0, arg1, arg4);
			return local61;
		}
	}

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "(I)V")
	@Override
	protected void method5751() {
		if (super.aBoolean521 && super.aBoolean530 && super.anInt7354 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILclient!eu;Lclient!gca;BI)V")
	@Override
	public void method5680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(4) Class119 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static236.aClass119_2 == arg4) {
			local10 = 1;
			local14 = arg0 * 2;
		} else if (arg4 == Static324.aClass119_4) {
			local14 = arg0 + 1;
			local10 = 3;
		} else if (arg4 == Static409.aClass119_6) {
			local10 = 4;
			local14 = arg0 * 3;
		} else if (Static162.aClass119_1 == arg4) {
			local14 = arg0 + 2;
			local10 = 6;
		} else if (arg4 == Static273.aClass119_3) {
			local14 = arg0 + 2;
			local10 = 5;
		} else {
			local10 = 0;
			local14 = arg0;
		}
		@Pc(70) Class273 local70 = arg3.method7934();
		@Pc(77) Class46_Sub2 local77 = (Class46_Sub2) arg3;
		local77.method7926();
		OpenGL.glDrawElements(local10, local14, Static266.method4173(local70), local77.method7924() + (long) (arg1 * local70.anInt8146));
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZILclient!ct;Z)V")
	@Override
	protected void method5664(@OriginalArg(1) int arg0, @OriginalArg(2) Class61 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static329.method7361(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jb;ILclient!qda;)Z")
	@Override
	public boolean method5660(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class273 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "()V")
	@Override
	public void method7830() {
		if (super.anInt7180 <= 0 && super.anInt7241 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt7361;
		@Pc(22) int local22 = super.anInt7347;
		@Pc(25) int local25 = super.anInt7380;
		@Pc(28) int local28 = super.anInt7355;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5778();
		this.method5701(false);
		this.method5717(false);
		this.method5661(false);
		this.method5702(false);
		this.method5694(null);
		this.method5692(-2, false, false);
		this.method5757(1);
		this.method5716(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7180, super.anInt7241, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "(B)V")
	@Override
	protected void method5739() {
		if (super.aClass96_6 == Static78.aClass96_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass96_6 == Static18.aClass96_3) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static361.aClass96_5 == super.aClass96_6) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)V")
	public synchronized void method635(@OriginalArg(0) long arg0) {
		@Pc(13) Class4 local13 = new Class4();
		local13.aLong295 = arg0;
		this.aClass22_9.method894(local13);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method5754(@OriginalArg(1) Class82 arg0) {
		@Pc(9) Class204[] local9 = ((Class82_Sub1) arg0).aClass204Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local9.length; local27++) {
			@Pc(33) Class204 local33 = local9[local27];
			@Pc(38) Class46_Sub1 local38 = this.aClass46_Sub1Array1[local27];
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = local38.method6553();
			@Pc(48) long local48 = local38.method7924();
			local38.method7926();
			for (@Pc(53) int local53 = 0; local33.method4831() > local53; local53++) {
				@Pc(60) Class91 local60 = local33.method4828(local53);
				if (local60 == Static117.aClass91_1) {
					local25 = true;
					OpenGL.glVertexPointer(3, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static117.aClass91_2) {
					OpenGL.glNormalPointer(5126, local44, local48 + (long) local40);
					local23 = true;
				} else if (local60 == Static117.aClass91_3) {
					OpenGL.glColorPointer(4, 5121, local44, local48 + (long) local40);
					local13 = true;
				} else if (local60 == Static117.aClass91_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static117.aClass91_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, (long) local40 + local48);
				} else if (Static117.aClass91_6 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static117.aClass91_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, (long) local40 + local48);
				}
				local40 += local60.anInt2697;
			}
		}
		if (this.aBoolean66 != local25) {
			if (local25) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean66 = local25;
		}
		if (this.aBoolean67 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean67 = local23;
		}
		if (local13 != this.aBoolean68) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean68 = local13;
		}
		@Pc(264) int local264;
		if (local11 > this.anInt719) {
			for (local264 = this.anInt719; local264 < local11; local264++) {
				OpenGL.glClientActiveTexture(local264 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt719 = local11;
		} else if (local11 < this.anInt719) {
			for (local264 = local11; local264 < this.anInt719; local264++) {
				OpenGL.glClientActiveTexture(local264 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt719 = local11;
		}
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "(B)V")
	@Override
	protected void method5714() {
		Static29.aFloatArray20[1] = super.aFloat178 * super.aFloat180;
		Static29.aFloatArray20[3] = 1.0F;
		Static29.aFloatArray20[0] = super.aFloat180 * super.aFloat173;
		Static29.aFloatArray20[2] = super.aFloat176 * super.aFloat180;
		OpenGL.glLightfv(16384, 4609, Static29.aFloatArray20, 0);
		Static29.aFloatArray20[3] = 1.0F;
		Static29.aFloatArray20[0] = super.aFloat173 * -super.aFloat168;
		Static29.aFloatArray20[2] = -super.aFloat168 * super.aFloat176;
		Static29.aFloatArray20[1] = super.aFloat178 * -super.aFloat168;
		OpenGL.glLightfv(16385, 4609, Static29.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "(B)V")
	@Override
	protected void method5745() {
		if (super.aBoolean515) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIILclient!gca;)V")
	@Override
	public void method5760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class119 arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg2 == Static236.aClass119_2) {
			local10 = 1;
			local14 = arg0 * 2;
		} else if (arg2 == Static324.aClass119_4) {
			local10 = 3;
			local14 = arg0 + 1;
		} else if (Static409.aClass119_6 == arg2) {
			local10 = 4;
			local14 = arg0 * 3;
		} else if (Static162.aClass119_1 == arg2) {
			local14 = arg0 + 2;
			local10 = 6;
		} else if (Static273.aClass119_3 == arg2) {
			local10 = 5;
			local14 = arg0 + 2;
		} else {
			local14 = arg0;
			local10 = 0;
		}
		OpenGL.glDrawArrays(local10, arg1, local14);
	}

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "(I)V")
	@Override
	protected void method5748() {
		if (super.aBoolean527) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5761(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jb;Lclient!qda;IIB)Lclient!dca;")
	@Override
	public Interface4 method5705(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean73 || Static32.method1002(arg3) && Static32.method1002(arg2)) {
			return new Class5_Sub4(this, arg0, arg1, arg3, arg2);
		} else if (this.aBoolean71) {
			return new Class5_Sub1(this, arg0, arg1, arg3, arg2);
		} else {
			return new Class5_Sub4(this, arg0, arg1, Static488.method7100(arg3), Static488.method7100(arg2));
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!wf;I)V")
	@Override
	public void method5721(@OriginalArg(1) Interface24 arg0, @OriginalArg(2) int arg1) {
		this.aClass46_Sub1Array1[arg1] = (Class46_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "(I)V")
	@Override
	protected void method5706() {
		OpenGL.glMatrixMode(5890);
		if (Static190.aClass322_4 == super.aClass322Array3[super.anInt7359]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass81_Sub1Array3[super.anInt7359].method1969(Static506.aFloatArray67), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(II)Lclient!cf;")
	@Override
	protected Class9 method5779(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class9_Sub3(this, super.aClass348_80);
		} else if (arg0 == 4) {
			return new Class9_Sub10(this, super.aClass348_80, super.aClass242_6);
		} else if (arg0 == 8) {
			return new Class9_Sub5(this, super.aClass348_80, super.aClass242_6);
		} else {
			return super.method5779(arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	@Override
	protected void method5662() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray50, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "(I)V")
	@Override
	protected void method5691() {
		super.aFloat177 = -super.anInt7350 + super.anInt7343;
		super.aFloat175 = super.aFloat177 - (float) super.anInt7354;
		if (super.aFloat175 < (float) super.anInt7356) {
			super.aFloat175 = super.anInt7356;
		}
		OpenGL.glFogf(2915, super.aFloat175);
		OpenGL.glFogf(2916, super.aFloat177);
		Static29.aFloatArray20[2] = (float) (super.anInt7362 & 0xFF) / 255.0F;
		Static29.aFloatArray20[1] = (float) (super.anInt7362 & 0xFF00) / 65280.0F;
		Static29.aFloatArray20[0] = (float) (super.anInt7362 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static29.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!ct;IZI)V")
	@Override
	public void method5741(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static329.method7361(arg1));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "(I)V")
	@Override
	protected void method5728() {
		Static29.aFloatArray20[2] = super.aFloat176 * super.aFloat171;
		Static29.aFloatArray20[1] = super.aFloat171 * super.aFloat178;
		Static29.aFloatArray20[3] = 1.0F;
		Static29.aFloatArray20[0] = super.aFloat171 * super.aFloat173;
		OpenGL.glLightModelfv(2899, Static29.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
	@Override
	protected void method5731(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "()Z")
	@Override
	public boolean method7807() {
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V")
	public synchronized void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class4_Sub27 local16 = new Class4_Sub27(arg1);
		local16.aLong295 = arg0;
		this.aClass22_4.method894(local16);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()V")
	@Override
	public void method7780() {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!pa;Lclient!pa;FLclient!pa;)Lclient!pa;")
	@Override
	public Class112 method7816(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class112 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "(B)V")
	@Override
	protected void method5735() {
		if (super.aBoolean524 && !super.aBoolean514) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "(I)V")
	@Override
	protected void method5773() {
		this.method5767();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt7366 > local10; local10++) {
			@Pc(17) Class4_Sub3 local17 = super.aClass4_Sub3Array5[local10];
			@Pc(23) int local23 = local17.method4952();
			@Pc(27) int local27 = local10 + 16386;
			@Pc(33) float local33 = local17.method4955() / 255.0F;
			Static29.aFloatArray20[0] = local17.method4954();
			Static29.aFloatArray20[1] = local17.method4953();
			Static29.aFloatArray20[2] = local17.method4949();
			Static29.aFloatArray20[3] = 1.0F;
			OpenGL.glLightfv(local27, 4611, Static29.aFloatArray20, 0);
			Static29.aFloatArray20[0] = local33 * (float) (local23 >> 16 & 0xFF);
			Static29.aFloatArray20[3] = 1.0F;
			Static29.aFloatArray20[2] = local33 * (float) (local23 & 0xFF);
			Static29.aFloatArray20[1] = local33 * (float) (local23 >> 8 & 0xFF);
			OpenGL.glLightfv(local27, 4609, Static29.aFloatArray20, 0);
			OpenGL.glLightf(local27, 4617, 1.0F / (float) (local17.method4950() * local17.method4950()));
			OpenGL.glEnable(local27);
		}
		while (super.anInt7381 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method5773();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V")
	@Override
	protected void method5678() {
		OpenGL.glActiveTexture(super.anInt7359 + 33984);
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "()V")
	@Override
	public void method7843() {
	}

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "(B)V")
	@Override
	protected void method5683() {
		for (@Pc(10) int local10 = super.anInt7369 - 1; local10 >= 0; local10--) {
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
		@Pc(78) float[] local78 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(80) int local80 = 0; local80 < 8; local80++) {
			@Pc(86) int local86 = local80 + 16384;
			OpenGL.glLightfv(local86, 4608, local78, 0);
			OpenGL.glLightf(local86, 4615, 0.0F);
			OpenGL.glLightf(local86, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method5683();
	}

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "(I)V")
	@Override
	protected void method5777() {
		OpenGL.glTexEnvi(8960, 34161, Static520.method8289(super.aClass95Array6[super.anInt7359]));
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5708(@OriginalArg(1) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "()V")
	@Override
	public void method7854() {
	}

	@OriginalMember(owner = "client!ad", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5702(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "(I)V")
	@Override
	protected void method5679() {
		this.aBoolean69 = false;
		this.method631();
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "(B)V")
	@Override
	protected void method5756() {
		Static29.aFloatArray20[3] = (float) (super.anInt7378 >>> 24) / 255.0F;
		Static29.aFloatArray20[1] = (float) (super.anInt7378 & 0xFF00) / 65280.0F;
		Static29.aFloatArray20[0] = (float) (super.anInt7378 & 0xFF0000) / 1.671168E7F;
		Static29.aFloatArray20[2] = (float) (super.anInt7378 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static29.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "(I)F")
	@Override
	protected float method5715() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "()Z")
	@Override
	public boolean method7850() {
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(II)V")
	public synchronized void method637(@OriginalArg(1) int arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong295 = arg0;
		this.aClass22_8.method894(local7);
	}

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "(B)V")
	@Override
	protected void method5729() {
		if (super.aBoolean531) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZB[I)Lclient!dca;")
	@Override
	public Interface4 method5758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int[] arg5) {
		if (this.aBoolean73 || Static32.method1002(arg1) && Static32.method1002(arg0)) {
			return new Class5_Sub4(this, arg1, arg0, arg4, arg5, 0, arg3);
		} else if (this.aBoolean71) {
			return new Class5_Sub1(this, arg1, arg0, arg5, 0, arg3);
		} else {
			@Pc(49) Class5_Sub4 local49 = new Class5_Sub4(this, Static151.aClass161_6, Static424.aClass273_12, Static488.method7100(arg1), Static488.method7100(arg0));
			local49.method7373(arg3, 0, arg1, 0, arg5, arg0);
			return local49;
		}
	}

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "(I)V")
	@Override
	protected void method5677() {
		OpenGL.glDepthMask(super.aBoolean525 && super.aBoolean513);
	}

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "(I)V")
	@Override
	protected void method5762() {
		this.method631();
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5783() {
		if (super.aBoolean522) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "()V")
	@Override
	public void method7827() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "(B)V")
	@Override
	protected void method5781() {
		OpenGL.glScissor(super.anInt7361 + super.anInt7374, -super.anInt7355 + super.anInt7373 + super.anInt7241, super.anInt7347 - super.anInt7361, -super.anInt7380 + super.anInt7355);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V")
	@Override
	public void method5730(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "(B)V")
	@Override
	protected void method5752() {
		if (super.aBoolean533) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5698(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!ls;Z)Lclient!dt;")
	@Override
	public Class82 method5736(@OriginalArg(0) Class204[] arg0) {
		return new Class82_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	@Override
	public void method7805(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "(I)V")
	@Override
	public void method5703() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray54, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray51, 0);
	}
}
