import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class66_Sub1_Sub1 extends Class66_Sub1 {

	@OriginalMember(owner = "client!dc", name = "oi", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!dc", name = "yh", descriptor = "Lclient!gj;")
	private final Class124 aClass124_8 = new Class124();

	@OriginalMember(owner = "client!dc", name = "ei", descriptor = "Lclient!gj;")
	private final Class124 aClass124_9 = new Class124();

	@OriginalMember(owner = "client!dc", name = "hi", descriptor = "Lclient!gj;")
	private final Class124 aClass124_10 = new Class124();

	@OriginalMember(owner = "client!dc", name = "ki", descriptor = "Lclient!gj;")
	private final Class124 aClass124_11 = new Class124();

	@OriginalMember(owner = "client!dc", name = "li", descriptor = "Lclient!gj;")
	private final Class124 aClass124_12 = new Class124();

	@OriginalMember(owner = "client!dc", name = "mi", descriptor = "Lclient!gj;")
	private final Class124 aClass124_13 = new Class124();

	@OriginalMember(owner = "client!dc", name = "ni", descriptor = "Lclient!gj;")
	private final Class124 aClass124_14 = new Class124();

	@OriginalMember(owner = "client!dc", name = "pi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!dc", name = "ui", descriptor = "I")
	private final int anInt2248 = 0;

	@OriginalMember(owner = "client!dc", name = "qi", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!dc", name = "Cg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!dc", name = "wi", descriptor = "Ljava/lang/String;")
	private final String aString18;

	@OriginalMember(owner = "client!dc", name = "xi", descriptor = "Ljava/lang/String;")
	private final String aString19;

	@OriginalMember(owner = "client!dc", name = "vi", descriptor = "I")
	private final int anInt2249;

	@OriginalMember(owner = "client!dc", name = "ri", descriptor = "Z")
	public boolean aBoolean186;

	@OriginalMember(owner = "client!dc", name = "si", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "client!dc", name = "yi", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!dc", name = "zi", descriptor = "Z")
	public final boolean aBoolean189;

	@OriginalMember(owner = "client!dc", name = "Ai", descriptor = "I")
	public final int anInt2250;

	@OriginalMember(owner = "client!dc", name = "ti", descriptor = "[I")
	public final int[] anIntArray221;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!e;Lclient!bi;I)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString18 = OpenGL.glGetString(7936).toLowerCase();
			this.aString19 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString18.indexOf("microsoft") != -1 || this.aString18.indexOf("brian paul") != -1 || this.aString18.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(104) String local104 = OpenGL.glGetString(7938);
			@Pc(112) String[] local112 = Static246.method4172(local104.replace('.', ' '), ' ');
			if (local112.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(128) int local128;
			try {
				@Pc(122) int local122 = Static272.method4392(local112[0]);
				local128 = Static272.method4392(local112[1]);
				this.anInt2249 = local122 * 10 + local128;
			} catch (@Pc(138) NumberFormatException local138) {
				throw new RuntimeException("");
			}
			if (this.anInt2249 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(180) int[] local180 = new int[1];
				OpenGL.glGetIntegerv(34018, local180, 0);
				super.anInt8426 = local180[0];
				if (super.anInt8426 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8436 = 8;
				this.aBoolean186 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean584 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean187 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean576 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean188 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean570 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean189 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anInt2250 = Stream.b() ? 33639 : 5121;
				if (this.aString19.indexOf("radeon") != -1) {
					local128 = 0;
					@Pc(276) boolean local276 = false;
					@Pc(278) boolean local278 = false;
					@Pc(287) String[] local287 = Static246.method4172(this.aString19.replace('/', ' '), ' ');
					for (@Pc(289) int local289 = 0; local289 < local287.length; local289++) {
						@Pc(295) String local295 = local287[local289];
						try {
							if (local295.length() > 0) {
								if (local295.charAt(0) == 'x' && local295.length() >= 3 && Static241.method4087(local295.substring(1, 3))) {
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
									if (local295.length() >= 4 && Static241.method4087(local295.substring(0, 4))) {
										local128 = Static272.method4392(local295.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(364) Exception local364) {
						}
					}
					if (!local278 && !local276) {
						if (local128 >= 7000 && local128 <= 7999) {
							this.aBoolean186 = false;
						}
						if (local128 >= 7000 && local128 <= 9250) {
							super.aBoolean570 = false;
						}
					}
					this.aBoolean187 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString18.indexOf("intel");
				if (this.aBoolean186) {
					try {
						@Pc(416) int[] local416 = new int[1];
						OpenGL.glGenBuffersARB(1, local416, 0);
					} catch (@Pc(422) Throwable local422) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray221 = new int[super.anInt8426];
				OpenGL.glClear(16640);
				this.anOpenGL1.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(441) Throwable local441) {
			local441.printStackTrace();
			this.method6805();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "()V")
	@Override
	public void method6808() {
	}

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "()V")
	@Override
	public void method6830() {
	}

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "(I)V")
	@Override
	protected void method6921() {
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V")
	public synchronized void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub33 local12 = new Class4_Sub33(arg0);
		local12.aLong307 = arg1;
		this.aClass124_10.method3275(local12);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	@Override
	public void method6851(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!hi;Lclient!ne;I)Z")
	@Override
	public boolean method6937(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class239 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(Z)V")
	@Override
	protected void method6912() {
		OpenGL.glScissor(super.anInt8428 + super.anInt8446, -super.anInt8443 + super.anInt8433 - -super.anInt8336, -super.anInt8428 + super.anInt8429, -super.anInt8412 + super.anInt8443);
	}

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "(I)V")
	@Override
	protected void method6901() {
		if (super.aBoolean569) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIZI[III)Lclient!ak;")
	@Override
	public Interface2 method6886(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean188 || Static422.method6062(arg5) && Static422.method6062(arg0)) {
			return new Class53_Sub2(this, arg5, arg0, arg1, arg3, 0, arg4);
		} else if (this.aBoolean187) {
			return new Class53_Sub3(this, arg5, arg0, arg3, 0, arg4);
		} else {
			@Pc(36) Class53_Sub2 local36 = new Class53_Sub2(this, Static85.aClass141_2, Static349.aClass239_12, Static514.method7261(arg5), Static514.method7261(arg0));
			local36.method6720(0, arg0, arg5, arg4, 0, arg3);
			return local36;
		}
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "()V")
	@Override
	public void method6795() {
		this.method6864(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lclient!lu;")
	@Override
	protected Class93 method6897(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class93_Sub9(this, super.aClass31_106);
		} else if (arg0 == 4) {
			return new Class93_Sub1(this, super.aClass31_106, super.aClass217_5);
		} else {
			return super.method6897(arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(B)V")
	@Override
	protected void method6894() {
		if (super.aBoolean585) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "(I)V")
	@Override
	protected void method6877() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass81Array3[super.anInt8432] == Static114.aClass81_5) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass134_Sub1Array3[super.anInt8432].method3398(Static268.aFloatArray35), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "(I)V")
	@Override
	protected void method6892() {
		OpenGL.glTexEnvi(8960, 34162, Static283.method4482(super.aClass240Array6[super.anInt8432]));
	}

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "(B)V")
	@Override
	protected void method6949() {
		OpenGL.glViewport(super.anInt8446, super.anInt8433, super.anInt8277, super.anInt8336);
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(B)V")
	@Override
	protected void method6904() {
		@Pc(9) int local9 = this.anIntArray221[super.anInt8432];
		if (local9 != 0) {
			this.anIntArray221[super.anInt8432] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[Lclient!ca;)Lclient!ts;")
	@Override
	public Class321 method6903(@OriginalArg(1) Class43[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ne;IILclient!hi;I)Lclient!ak;")
	@Override
	public Interface2 method6995(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class141 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean188 || Static422.method6062(arg1) && Static422.method6062(arg3)) {
			return new Class53_Sub2(this, arg2, arg0, arg1, arg3);
		} else if (this.aBoolean187) {
			return new Class53_Sub3(this, arg2, arg0, arg1, arg3);
		} else {
			return new Class53_Sub2(this, arg2, arg0, Static514.method7261(arg1), Static514.method7261(arg3));
		}
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(Z)V")
	@Override
	protected void method6947() {
		Static225.aFloatArray26[0] = super.aFloat174 * super.aFloat168;
		Static225.aFloatArray26[1] = super.aFloat172 * super.aFloat168;
		Static225.aFloatArray26[3] = 1.0F;
		Static225.aFloatArray26[2] = super.aFloat173 * super.aFloat168;
		OpenGL.glLightModelfv(2899, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!eu;I)V")
	@Override
	public void method6941(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class75 method6775(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class75 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6936(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local12);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6824(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class4_Sub33 local19;
		while (!this.aClass124_9.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_9.method3272();
			Static76.anIntArray204[local7++] = (int) local19.aLong307;
			super.anInt8407 -= local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static76.anIntArray204, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static76.anIntArray204, 0);
			local7 = 0;
		}
		while (!this.aClass124_10.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_10.method3272();
			Static76.anIntArray204[local7++] = (int) local19.aLong307;
			super.anInt8408 -= local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static76.anIntArray204, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static76.anIntArray204, 0);
			local7 = 0;
		}
		while (!this.aClass124_11.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_11.method3272();
			Static76.anIntArray204[local7++] = local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static76.anIntArray204, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static76.anIntArray204, 0);
			local7 = 0;
		}
		while (!this.aClass124_12.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_12.method3272();
			Static76.anIntArray204[local7++] = (int) local19.aLong307;
			super.anInt8405 -= local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static76.anIntArray204, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static76.anIntArray204, 0);
		}
		while (!this.aClass124_8.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_8.method3272();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt6079);
		}
		@Pc(212) Class4 local212;
		while (!this.aClass124_13.method3264()) {
			local212 = this.aClass124_13.method3272();
			OpenGL.glDeleteProgramARB((int) local212.aLong307);
		}
		while (!this.aClass124_14.method3264()) {
			local212 = this.aClass124_14.method3272();
			OpenGL.glDeleteObjectARB(local212.aLong307);
		}
		while (!this.aClass124_8.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_8.method3272();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt6079);
		}
		if (this.v() > 100663296 && this.aLong48 + 60000L < Static184.method3422()) {
			System.gc();
			this.aLong48 = Static184.method3422();
		}
		super.method6824(local11);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ob;Lclient!ft;III)V")
	@Override
	public void method6917(@OriginalArg(1) int arg0, @OriginalArg(2) Class247 arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg1 == Static238.aClass247_6) {
			local10 = 1;
			local14 = arg5 * 2;
		} else if (arg1 == Static318.aClass247_4) {
			local14 = arg5 + 1;
			local10 = 3;
		} else if (arg1 == Static453.aClass247_5) {
			local10 = 4;
			local14 = arg5 * 3;
		} else if (Static130.aClass247_2 == arg1) {
			local10 = 6;
			local14 = arg5 + 2;
		} else if (arg1 == Static543.aClass247_7) {
			local10 = 5;
			local14 = arg5 + 2;
		} else {
			local10 = 0;
			local14 = arg5;
		}
		@Pc(68) Class239 local68 = arg2.method7147();
		@Pc(71) Class17_Sub2 local71 = (Class17_Sub2) arg2;
		local71.method1344();
		OpenGL.glDrawElements(local10, local14, Static264.method4336(local68), local71.method1346() + (long) (arg3 * local68.anInt6113));
	}

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "(I)V")
	@Override
	protected void method6942() {
		for (@Pc(6) int local6 = super.anInt8426 - 1; local6 >= 0; local6--) {
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
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(71) float[] local71 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(73) int local73 = 0; local73 < 8; local73++) {
			@Pc(79) int local79 = local73 + 16384;
			OpenGL.glLightfv(local79, 4608, local71, 0);
			OpenGL.glLightf(local79, 4615, 0.0F);
			OpenGL.glLightf(local79, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method6942();
	}

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "()Lclient!ffa;")
	@Override
	public Class105 method6836() {
		@Pc(7) int local7 = -1;
		if (this.aString18.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString18.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString18.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class105(local7, "OpenGL", this.anInt2249, this.aString19, 0L);
	}

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "()V")
	@Override
	protected void method6805() {
		super.method6805();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!gf;ZBI)V")
	@Override
	protected void method6988(@OriginalArg(0) Class120 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static422.method6052(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6926() {
		OpenGL.glDepthMask(super.aBoolean573 && super.aBoolean566);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)V")
	public synchronized void method2036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub33 local15 = new Class4_Sub33(arg1);
		local15.aLong307 = arg0;
		this.aClass124_9.method3275(local15);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZZLclient!gf;)V")
	@Override
	public void method6959(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class120 arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static422.method6052(arg3));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIILclient!hi;[BZ)Lclient!ak;")
	@Override
	protected Interface2 method6994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class141 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean188 || Static422.method6062(arg1) && Static422.method6062(arg0)) {
			return new Class53_Sub2(this, arg2, arg1, arg0, arg4, arg3, 0, 0);
		} else if (this.aBoolean187) {
			return new Class53_Sub3(this, arg2, arg1, arg0, arg3, 0, 0);
		} else {
			@Pc(48) Class53_Sub2 local48 = new Class53_Sub2(this, arg2, Static349.aClass239_12, Static514.method7261(arg1), Static514.method7261(arg0));
			local48.method6719(arg0, arg3, arg2, 0, arg1);
			return local48;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!ts;)V")
	@Override
	public void method6890(@OriginalArg(1) Class321 arg0) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!mf;Z)V")
	@Override
	public void method6990(@OriginalArg(0) Class221 arg0) {
		if (arg0 == Static342.aClass221_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static110.method2323(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "(I)V")
	@Override
	protected void method6881() {
		this.method2038();
	}

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "(I)F")
	@Override
	protected float method6952() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "(B)V")
	@Override
	protected void method6975() {
		if (super.aBoolean571) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6908(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "(I)V")
	@Override
	protected void method6868() {
		OpenGL.glTexEnvi(8960, 34161, Static283.method4482(super.aClass240Array5[super.anInt8432]));
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!hi;ZLclient!ne;)Z")
	@Override
	public boolean method6969(@OriginalArg(0) Class141 arg0, @OriginalArg(2) Class239 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6972(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "(I)V")
	private void method2038() {
		if (this.aBoolean185) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass129_4.method3348()) {
			if (!this.aBoolean185) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass134_Sub1_18.method3398(Static268.aFloatArray35), 0);
				this.method6961();
				this.method6860();
				this.aBoolean185 = true;
			}
			if (this.aBoolean185) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean565) {
				OpenGL.glMultMatrixf(super.aClass134_Sub1_15.method3398(Static268.aFloatArray35), 0);
			}
		} else if (super.aBoolean565) {
			OpenGL.glLoadIdentity();
			this.aBoolean185 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass134_Sub1_15.method3398(Static268.aFloatArray35), 0);
			this.aBoolean185 = false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(B)V")
	@Override
	protected void method6898() {
		this.method2038();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([FIZIIILclient!hi;B)Lclient!ak;")
	@Override
	protected Interface2 method6891(@OriginalArg(0) float[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class141 arg4) {
		if (this.aBoolean188 || Static422.method6062(arg2) && Static422.method6062(arg3)) {
			return new Class53_Sub2(this, arg4, arg2, arg3, arg1, arg0, 0, 0);
		} else if (this.aBoolean187) {
			return new Class53_Sub3(this, arg4, arg2, arg3, arg0, 0, 0);
		} else {
			@Pc(59) Class53_Sub2 local59 = new Class53_Sub2(this, arg4, Static349.aClass239_16, Static514.method7261(arg2), Static514.method7261(arg3));
			local59.method4339(arg0, arg3, arg2, arg4);
			return local59;
		}
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "()V")
	@Override
	public void method6784() {
		if (super.anInt8277 <= 0 && super.anInt8336 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt8428;
		@Pc(19) int local19 = super.anInt8429;
		@Pc(22) int local22 = super.anInt8412;
		@Pc(25) int local25 = super.anInt8443;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6935();
		this.method6862(false);
		this.method6985(false);
		this.method6946(false);
		this.method6864(false);
		this.method6979(null);
		this.method6899(false, -2, false);
		this.method6920(1);
		this.method6984(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8277, super.anInt8336, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "(I)V")
	@Override
	protected void method6896() {
		if (super.aBoolean567 && !super.aBoolean574) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "(I)V")
	@Override
	protected void method6987() {
		if (super.aBoolean577 && super.aBoolean568 && super.anInt8414 >= 0 | super.aBoolean578) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(II)V")
	public synchronized void method2039(@OriginalArg(1) int arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong307 = arg0;
		this.aClass124_13.method3275(local7);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6811(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6907(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(Z)V")
	@Override
	protected void method6910() {
		Static225.aFloatArray26[2] = (float) (super.anInt8425 & 0xFF) / 255.0F;
		Static225.aFloatArray26[1] = (float) (super.anInt8425 & 0xFF00) / 65280.0F;
		Static225.aFloatArray26[3] = (float) (super.anInt8425 >>> 24) / 255.0F;
		Static225.aFloatArray26[0] = (float) (super.anInt8425 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(I)V")
	@Override
	protected void method6860() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt8431 > local7; local7++) {
			@Pc(14) Class4_Sub32 local14 = super.aClass4_Sub32Array6[local7];
			@Pc(18) int local18 = local14.method6613(85);
			@Pc(22) int local22 = local7 + 16386;
			@Pc(28) float local28 = local14.method6618() / 255.0F;
			Static225.aFloatArray26[0] = local14.method6614();
			Static225.aFloatArray26[1] = local14.method6615(-18736);
			Static225.aFloatArray26[2] = local14.method6617();
			Static225.aFloatArray26[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static225.aFloatArray26, 0);
			Static225.aFloatArray26[2] = local28 * (float) (local18 & 0xFF);
			Static225.aFloatArray26[0] = (float) (local18 >> 16 & 0xFF) * local28;
			Static225.aFloatArray26[1] = local28 * (float) (local18 >> 8 & 0xFF);
			Static225.aFloatArray26[3] = 1.0F;
			OpenGL.glLightfv(local22, 4609, Static225.aFloatArray26, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method6621() * local14.method6621()));
			OpenGL.glEnable(local22);
		}
		while (super.anInt8427 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method6860();
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(II)V")
	@Override
	public void method6885(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "(I)V")
	@Override
	protected void method6879() {
		if (super.aBoolean572) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6812(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6847();
	}

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
	@Override
	protected void method6863() {
		@Pc(56) int local56;
		if (super.aBoolean578) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local56 = super.anInt8442;
		} else {
			super.aFloat178 = -super.anInt8439 + super.anInt8441;
			super.aFloat170 = super.aFloat178 - (float) super.anInt8414;
			if ((float) super.anInt8410 > super.aFloat170) {
				super.aFloat170 = super.anInt8410;
			}
			OpenGL.glFogf(2915, super.aFloat170);
			OpenGL.glFogf(2916, super.aFloat178);
			local56 = super.anInt8416;
		}
		Static225.aFloatArray26[2] = (float) (local56 & 0xFF) / 255.0F;
		Static225.aFloatArray26[1] = (float) (local56 & 0xFF00) / 65280.0F;
		Static225.aFloatArray26[0] = (float) (local56 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIILclient!ob;)V")
	@Override
	public void method6964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class247 arg2) {
		@Pc(13) byte local13;
		@Pc(17) int local17;
		if (Static238.aClass247_6 == arg2) {
			local13 = 1;
			local17 = arg0 * 2;
		} else if (arg2 == Static318.aClass247_4) {
			local13 = 3;
			local17 = arg0 + 1;
		} else if (Static453.aClass247_5 == arg2) {
			local13 = 4;
			local17 = arg0 * 3;
		} else if (Static130.aClass247_2 == arg2) {
			local13 = 6;
			local17 = arg0 + 2;
		} else if (Static543.aClass247_7 == arg2) {
			local17 = arg0 + 2;
			local13 = 5;
		} else {
			local13 = 0;
			local17 = arg0;
		}
		OpenGL.glDrawArrays(local13, arg1, local17);
	}

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "(B)V")
	@Override
	protected void method6977() {
		if (super.aBoolean582) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "(I)V")
	@Override
	protected void method6971() {
		OpenGL.glActiveTexture(super.anInt8432 + 33984);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B[BIILclient!hi;I)Lclient!js;")
	@Override
	public Interface12 method6928(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class141 arg1) {
		return new Class53_Sub4(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "()Z")
	@Override
	public boolean method6814() {
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "(I)V")
	@Override
	protected void method6992() {
		Static225.aFloatArray26[1] = super.aFloat183 * super.aFloat172;
		Static225.aFloatArray26[0] = super.aFloat174 * super.aFloat183;
		Static225.aFloatArray26[2] = super.aFloat183 * super.aFloat173;
		Static225.aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static225.aFloatArray26, 0);
		Static225.aFloatArray26[2] = super.aFloat173 * -super.bf;
		Static225.aFloatArray26[3] = 1.0F;
		Static225.aFloatArray26[0] = super.aFloat174 * -super.bf;
		Static225.aFloatArray26[1] = super.aFloat172 * -super.bf;
		OpenGL.glLightfv(16385, 4609, Static225.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "(I)V")
	@Override
	protected void method6905() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray55, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "()Z")
	@Override
	public boolean method6852() {
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "()V")
	@Override
	public void method6847() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "(I)V")
	@Override
	protected void method6876() {
		if (super.aClass194_7 == Static272.aClass194_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass194_7 == Static79.aClass194_1) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass194_7 == Static226.aClass194_5) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "()V")
	@Override
	public void method6790() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6873(@OriginalArg(1) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL1.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "(B)V")
	@Override
	public void method6961() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray58, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray57, 0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI[[II)Lclient!ul;")
	@Override
	public Interface22 method6922(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2) {
		return new Class53_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!dc", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return this.anInt2248;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)Lclient!ft;")
	@Override
	public Interface8 method6859(@OriginalArg(0) boolean arg0) {
		return new Class17_Sub2(this, Static349.aClass239_13, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8336 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt2250, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()V")
	@Override
	public void method6780() {
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(ZI)Lclient!eu;")
	@Override
	public Interface4 method6931(@OriginalArg(0) boolean arg0) {
		return new Class17_Sub1(this, arg0);
	}
}
