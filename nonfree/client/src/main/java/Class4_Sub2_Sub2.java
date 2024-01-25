import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!tm", name = "hi", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "client!tm", name = "Lg", descriptor = "Lclient!ui;")
	private final Class295 aClass295_51 = new Class295();

	@OriginalMember(owner = "client!tm", name = "Rh", descriptor = "Lclient!ui;")
	private final Class295 aClass295_52 = new Class295();

	@OriginalMember(owner = "client!tm", name = "bi", descriptor = "Lclient!ui;")
	private final Class295 aClass295_53 = new Class295();

	@OriginalMember(owner = "client!tm", name = "di", descriptor = "Lclient!ui;")
	private final Class295 aClass295_54 = new Class295();

	@OriginalMember(owner = "client!tm", name = "ei", descriptor = "Lclient!ui;")
	private final Class295 aClass295_55 = new Class295();

	@OriginalMember(owner = "client!tm", name = "fi", descriptor = "Lclient!ui;")
	private final Class295 aClass295_56 = new Class295();

	@OriginalMember(owner = "client!tm", name = "gi", descriptor = "Lclient!ui;")
	private final Class295 aClass295_57 = new Class295();

	@OriginalMember(owner = "client!tm", name = "ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!tm", name = "pi", descriptor = "I")
	private final int anInt8410 = 0;

	@OriginalMember(owner = "client!tm", name = "ni", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!tm", name = "bh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!tm", name = "li", descriptor = "Ljava/lang/String;")
	private final String aString195;

	@OriginalMember(owner = "client!tm", name = "ji", descriptor = "Ljava/lang/String;")
	private final String aString194;

	@OriginalMember(owner = "client!tm", name = "ti", descriptor = "I")
	private final int anInt8411;

	@OriginalMember(owner = "client!tm", name = "qi", descriptor = "Z")
	public boolean aBoolean617;

	@OriginalMember(owner = "client!tm", name = "ki", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!tm", name = "mi", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!tm", name = "ri", descriptor = "Z")
	public final boolean aBoolean618;

	@OriginalMember(owner = "client!tm", name = "oi", descriptor = "I")
	public final int anInt8409;

	@OriginalMember(owner = "client!tm", name = "si", descriptor = "[I")
	public final int[] anIntArray742;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!n;Lclient!dn;I)V")
	public Class4_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface13 arg3, @OriginalArg(4) Class69 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString195 = OpenGL.glGetString(7936).toLowerCase();
			this.aString194 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString195.indexOf("microsoft") != -1 || this.aString195.indexOf("brian paul") != -1 || this.aString195.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(103) String local103 = OpenGL.glGetString(7938);
			@Pc(111) String[] local111 = Static340.method5715(local103.replace('.', ' '), ' ');
			if (local111.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(129) int local129;
			try {
				@Pc(123) int local123 = Static302.method8211(local111[0]);
				local129 = Static302.method8211(local111[1]);
				this.anInt8411 = local129 + local123 * 10;
			} catch (@Pc(138) NumberFormatException local138) {
				throw new RuntimeException("");
			}
			if (this.anInt8411 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(182) int[] local182 = new int[1];
				OpenGL.glGetIntegerv(34018, local182, 0);
				super.anInt8319 = local182[0];
				if (super.anInt8319 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8321 = 8;
				this.aBoolean617 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean610 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean614 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean605 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean615 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean603 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean618 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anInt8409 = Stream.a() ? 33639 : 5121;
				if (this.aString194.indexOf("radeon") != -1) {
					local129 = 0;
					@Pc(278) boolean local278 = false;
					@Pc(280) boolean local280 = false;
					@Pc(289) String[] local289 = Static340.method5715(this.aString194.replace('/', ' '), ' ');
					for (@Pc(291) int local291 = 0; local291 < local289.length; local291++) {
						@Pc(297) String local297 = local289[local291];
						try {
							if (local297.length() > 0) {
								if (local297.charAt(0) == 'x' && local297.length() >= 3 && Static453.method6978(local297.substring(1, 3))) {
									local297 = local297.substring(1);
									local280 = true;
								}
								if (local297.equals("hd")) {
									local278 = true;
								} else {
									if (local297.startsWith("hd")) {
										local297 = local297.substring(2);
										local278 = true;
									}
									if (local297.length() >= 4 && Static453.method6978(local297.substring(0, 4))) {
										local129 = Static302.method8211(local297.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(364) Exception local364) {
						}
					}
					if (!local280 && !local278) {
						if (local129 >= 7000 && local129 <= 9250) {
							super.aBoolean603 = false;
						}
						if (local129 >= 7000 && local129 <= 7999) {
							this.aBoolean617 = false;
						}
					}
					this.aBoolean614 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString195.indexOf("intel");
				if (this.aBoolean617) {
					try {
						@Pc(420) int[] local420 = new int[1];
						OpenGL.glGenBuffersARB(1, local420, 0);
					} catch (@Pc(426) Throwable local426) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray742 = new int[super.anInt8319];
				OpenGL.glClear(16640);
				this.anOpenGL2.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(445) Throwable local445) {
			local445.printStackTrace();
			this.method7197();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "(I)V")
	@Override
	protected void method7310() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < super.anInt8305; local7++) {
			@Pc(14) Class1_Sub5 local14 = super.aClass1_Sub5Array6[local7];
			@Pc(18) int local18 = local14.method4313();
			@Pc(22) int local22 = local7 + 16386;
			@Pc(28) float local28 = local14.method4310() / 255.0F;
			Static410.aFloatArray63[0] = local14.method4306();
			Static410.aFloatArray63[1] = local14.method4305();
			Static410.aFloatArray63[2] = local14.method4314();
			Static410.aFloatArray63[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static410.aFloatArray63, 0);
			Static410.aFloatArray63[3] = 1.0F;
			Static410.aFloatArray63[2] = local28 * (float) (local18 & 0xFF);
			Static410.aFloatArray63[0] = local28 * (float) (local18 >> 16 & 0xFF);
			Static410.aFloatArray63[1] = (float) (local18 >> 8 & 0xFF) * local28;
			OpenGL.glLightfv(local22, 4609, Static410.aFloatArray63, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method4311() * local14.method4311()));
			OpenGL.glEnable(local22);
		}
		while (super.anInt8309 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method7310();
	}

	@OriginalMember(owner = "client!tm", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt8410;
	}

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "()Lclient!fd;")
	@Override
	public Class98 method7207() {
		@Pc(7) int local7 = -1;
		if (this.aString195.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString195.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString195.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class98(local7, "OpenGL", this.anInt8411, this.aString194, 0L);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	public synchronized void method7361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg1);
		local8.aLong251 = arg0;
		this.aClass295_53.method7533(local8);
	}

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "()V")
	@Override
	public void method7202() {
		this.method7348(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "(I)V")
	@Override
	protected void method7247() {
		if (super.aBoolean611 && super.aBoolean607 && super.aBoolean594 | super.anInt8289 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI[[IZ)Lclient!lm;")
	@Override
	public Interface11 method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class58_Sub1(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!g;III[BZ)Lclient!aw;")
	@Override
	public Interface3 method7305(@OriginalArg(0) Class110 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class58_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!sc;III)V")
	@Override
	public void method7322(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte local18;
		@Pc(16) int local16;
		if (Static298.aClass263_4 == arg0) {
			local16 = arg1 * 2;
			local18 = 1;
		} else if (Static489.aClass263_6 == arg0) {
			local16 = arg1 + 1;
			local18 = 3;
		} else if (Static416.aClass263_5 == arg0) {
			local18 = 4;
			local16 = arg1 * 3;
		} else if (arg0 == Static57.aClass263_3) {
			local18 = 6;
			local16 = arg1 + 2;
		} else if (arg0 == Static192.aClass263_2) {
			local18 = 5;
			local16 = arg1 + 2;
		} else {
			local18 = 0;
			local16 = arg1;
		}
		OpenGL.glDrawArrays(local18, arg2, local16);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!rq;IB)V")
	@Override
	public void method7251(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tm", name = "V", descriptor = "(I)V")
	@Override
	protected void method7342() {
		if (super.aClass294_13 == Static143.aClass294_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass294_13 == Static344.aClass294_9) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static513.aClass294_15 == super.aClass294_13) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZI[IIII)Lclient!eea;")
	@Override
	public Interface5 method7323(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean615 || Static329.method5606(arg4) && Static329.method5606(arg1)) {
			return new Class58_Sub4(this, arg4, arg1, arg0, arg2, 0, arg3);
		} else if (this.aBoolean614) {
			return new Class58_Sub3(this, arg4, arg1, arg2, 0, arg3);
		} else {
			@Pc(48) Class58_Sub4 local48 = new Class58_Sub4(this, Static171.aClass110_13, Static517.aClass308_15, Static184.method3549(arg4), Static184.method3549(arg1));
			local48.method7773(arg2, arg4, 0, arg3, arg1, 0);
			return local48;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)Lclient!iaa;")
	@Override
	public Interface9 method7227(@OriginalArg(0) boolean arg0) {
		return new Class21_Sub1(this, Static517.aClass308_16, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7311() {
		@Pc(15) int local15;
		if (super.aBoolean594) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = super.anInt8294;
		} else {
			super.aFloat169 = -super.anInt8327 + super.anInt8291;
			super.aFloat164 = super.aFloat169 - (float) super.anInt8289;
			if (super.aFloat164 < (float) super.anInt8324) {
				super.aFloat164 = super.anInt8324;
			}
			OpenGL.glFogf(2915, super.aFloat164);
			OpenGL.glFogf(2916, super.aFloat169);
			local15 = super.anInt8311;
		}
		Static410.aFloatArray63[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static410.aFloatArray63[2] = (float) (local15 & 0xFF) / 255.0F;
		Static410.aFloatArray63[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static410.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "(B)V")
	@Override
	protected void method7300() {
		this.method7365();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZIILclient!bg;)V")
	@Override
	public void method7351(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class27 arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static123.method2353(arg3));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!mv;Lclient!mv;FLclient!mv;)Lclient!mv;")
	@Override
	public Class103 method7200(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class103 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILclient!sc;Lclient!iaa;II)V")
	@Override
	public void method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class263 arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) byte local26;
		@Pc(24) int local24;
		if (Static298.aClass263_4 == arg2) {
			local24 = arg4 * 2;
			local26 = 1;
		} else if (arg2 == Static489.aClass263_6) {
			local24 = arg4 + 1;
			local26 = 3;
		} else if (arg2 == Static416.aClass263_5) {
			local24 = arg4 * 3;
			local26 = 4;
		} else if (Static57.aClass263_3 == arg2) {
			local24 = arg4 + 2;
			local26 = 6;
		} else if (arg2 == Static192.aClass263_2) {
			local24 = arg4 + 2;
			local26 = 5;
		} else {
			local26 = 0;
			local24 = arg4;
		}
		@Pc(75) Class308 local75 = arg3.method3626();
		@Pc(78) Class21_Sub1 local78 = (Class21_Sub1) arg3;
		local78.method7608();
		OpenGL.glDrawElements(local26, local24, Static193.method3691(local75), local78.method7610() + (long) (arg5 * local75.anInt9154));
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!bg;IZI)V")
	@Override
	protected void method7298(@OriginalArg(0) Class27 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static123.method2353(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!tm", name = "T", descriptor = "(I)V")
	@Override
	protected void method7336() {
		if (super.aBoolean606 && !super.aBoolean598) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "(B)V")
	@Override
	protected void method7309() {
		if (super.aBoolean595) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "()V")
	@Override
	public void method7164() {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!vp;Lclient!g;)Z")
	@Override
	public boolean method7308(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Class110 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "(B)V")
	@Override
	protected void method7269() {
		OpenGL.glTexEnvi(8960, 34162, Static171.method3197(super.aClass246Array5[super.anInt8310]));
	}

	@OriginalMember(owner = "client!tm", name = "O", descriptor = "(I)V")
	@Override
	protected void method7320() {
		Static410.aFloatArray63[1] = super.aFloat179 * super.aFloat176;
		Static410.aFloatArray63[2] = super.aFloat172 * super.aFloat176;
		Static410.aFloatArray63[3] = 1.0F;
		Static410.aFloatArray63[0] = super.aFloat175 * super.aFloat176;
		OpenGL.glLightModelfv(2899, Static410.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "(I)V")
	@Override
	protected void method7267() {
		@Pc(9) int local9 = this.anIntArray742[super.anInt8310];
		if (local9 != 0) {
			this.anIntArray742[super.anInt8310] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "(I)V")
	@Override
	protected void method7236() {
		for (@Pc(6) int local6 = super.anInt8319 - 1; local6 >= 0; local6--) {
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
		super.method7236();
	}

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8167 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt8409, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
	@Override
	public void method7231(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	@Override
	protected void method7226() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass107Array3[super.anInt8310] == Static158.aClass107_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass128_Sub3Array3[super.anInt8310].method6901(Static417.aFloatArray59), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tm", name = "F", descriptor = "(I)V")
	@Override
	protected void method7307() {
		if (super.aBoolean597) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7276(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(18) Long local18 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local18);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7258(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "(B)V")
	@Override
	protected void method7360() {
		OpenGL.glDepthMask(super.aBoolean600 && super.aBoolean612);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7177(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub14 local19;
		while (!this.aClass295_52.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_52.method7547();
			Static141.anIntArray244[local11++] = (int) local19.aLong251;
			super.anInt8287 -= local19.anInt2795;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static141.anIntArray244, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static141.anIntArray244, 0);
			local11 = 0;
		}
		while (!this.aClass295_53.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_53.method7547();
			Static141.anIntArray244[local11++] = (int) local19.aLong251;
			super.anInt8285 -= local19.anInt2795;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static141.anIntArray244, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static141.anIntArray244, 0);
			local11 = 0;
		}
		while (!this.aClass295_54.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_54.method7547();
			Static141.anIntArray244[local11++] = local19.anInt2795;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static141.anIntArray244, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static141.anIntArray244, 0);
			local11 = 0;
		}
		while (!this.aClass295_55.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_55.method7547();
			Static141.anIntArray244[local11++] = (int) local19.aLong251;
			super.anInt8288 -= local19.anInt2795;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static141.anIntArray244, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static141.anIntArray244, 0);
		}
		while (!this.aClass295_51.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_51.method7547();
			OpenGL.glDeleteLists((int) local19.aLong251, local19.anInt2795);
		}
		@Pc(215) Class1 local215;
		while (!this.aClass295_56.method7536()) {
			local215 = this.aClass295_56.method7547();
			OpenGL.glDeleteProgramARB((int) local215.aLong251);
		}
		while (!this.aClass295_57.method7536()) {
			local215 = this.aClass295_57.method7547();
			OpenGL.glDeleteObjectARB(local215.aLong251);
		}
		while (!this.aClass295_51.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_51.method7547();
			OpenGL.glDeleteLists((int) local19.aLong251, local19.anInt2795);
		}
		if (this.U() > 100663296 && this.aLong226 + 60000L < Static110.method2222()) {
			System.gc();
			this.aLong226 = Static110.method2222();
		}
		super.method7177(local9);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method7313(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local10)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "()Z")
	@Override
	public boolean method7182() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method7233(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL2.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "()V")
	@Override
	public void method7154() {
	}

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "()V")
	@Override
	protected void method7197() {
		super.method7197();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([FIIZIILclient!g;B)Lclient!eea;")
	@Override
	protected Interface5 method7318(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class110 arg4) {
		if (this.aBoolean615 || Static329.method5606(arg1) && Static329.method5606(arg3)) {
			return new Class58_Sub4(this, arg4, arg1, arg3, arg2, arg0, 0, 0);
		} else if (this.aBoolean614) {
			return new Class58_Sub3(this, arg4, arg1, arg3, arg0, 0, 0);
		} else {
			@Pc(60) Class58_Sub4 local60 = new Class58_Sub4(this, arg4, Static517.aClass308_19, Static184.method3549(arg1), Static184.method3549(arg3));
			local60.method7780(arg0, arg1, arg4, arg3);
			return local60;
		}
	}

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "(I)V")
	@Override
	protected void method7284() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray71, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tm", name = "cb", descriptor = "(I)V")
	@Override
	protected void method7356() {
		OpenGL.glScissor(super.anInt8315 + super.anInt8298, -super.anInt8316 + super.anInt8313 - -super.anInt8167, -super.anInt8315 + super.anInt8293, super.anInt8316 - super.anInt8301);
	}

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "(B)V")
	private void method7365() {
		if (this.aBoolean616) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass137_7.method3761()) {
			if (!this.aBoolean616) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass128_Sub3_18.method6901(Static417.aFloatArray59), 0);
				this.method7312();
				this.method7310();
				this.aBoolean616 = true;
			}
			if (this.aBoolean616) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean593) {
				OpenGL.glMultMatrixf(super.aClass128_Sub3_15.method6901(Static417.aFloatArray59), 0);
				return;
			}
		} else if (super.aBoolean593) {
			OpenGL.glLoadIdentity();
			this.aBoolean616 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass128_Sub3_15.method6901(Static417.aFloatArray59), 0);
			this.aBoolean616 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)Lclient!rq;")
	@Override
	public Interface16 method7250(@OriginalArg(1) boolean arg0) {
		return new Class21_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "X", descriptor = "(I)V")
	@Override
	protected void method7346() {
		Static410.aFloatArray63[3] = 1.0F;
		Static410.aFloatArray63[0] = super.aFloat174 * super.aFloat175;
		Static410.aFloatArray63[2] = super.aFloat172 * super.aFloat174;
		Static410.aFloatArray63[1] = super.aFloat179 * super.aFloat174;
		OpenGL.glLightfv(16384, 4609, Static410.aFloatArray63, 0);
		Static410.aFloatArray63[2] = super.aFloat172 * -super.aFloat166;
		Static410.aFloatArray63[0] = -super.aFloat166 * super.aFloat175;
		Static410.aFloatArray63[1] = -super.aFloat166 * super.aFloat179;
		Static410.aFloatArray63[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static410.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "(I)V")
	@Override
	protected void method7257() {
		if (super.aBoolean599) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!bk;)V")
	@Override
	public void method7248(@OriginalArg(1) Class31 arg0) {
		if (arg0 == Static318.aClass31_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static342.method5738(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[BZILclient!g;II)Lclient!eea;")
	@Override
	protected Interface5 method7345(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class110 arg4) {
		if (this.aBoolean615 || Static329.method5606(arg3) && Static329.method5606(arg0)) {
			return new Class58_Sub4(this, arg4, arg3, arg0, arg2, arg1, 0, 0);
		} else if (this.aBoolean614) {
			return new Class58_Sub3(this, arg4, arg3, arg0, arg1, 0, 0);
		} else {
			@Pc(61) Class58_Sub4 local61 = new Class58_Sub4(this, arg4, Static517.aClass308_15, Static184.method3549(arg3), Static184.method3549(arg0));
			local61.method7772(0, arg4, arg0, arg3, arg1);
			return local61;
		}
	}

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "()Z")
	@Override
	public boolean method7204() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7178(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method7164();
	}

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "(B)V")
	@Override
	protected void method7352() {
	}

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "(I)V")
	@Override
	protected void method7317() {
		OpenGL.glActiveTexture(super.anInt8310 + 33984);
	}

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "(I)V")
	@Override
	protected void method7230() {
		if (super.aBoolean602) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!tm", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "()V")
	@Override
	public void method7168() {
		if (super.anInt8123 <= 0 && super.anInt8167 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt8315;
		@Pc(16) int local16 = super.anInt8293;
		@Pc(19) int local19 = super.anInt8301;
		@Pc(22) int local22 = super.anInt8316;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7355();
		this.method7261(false);
		this.method7299(false);
		this.method7283(false);
		this.method7348(false);
		this.method7316(null);
		this.method7281(-2, false, false);
		this.method7279(1);
		this.method7228(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8123, super.anInt8167, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(B)V")
	@Override
	protected void method7246() {
		OpenGL.glViewport(super.anInt8298, super.anInt8313, super.anInt8123, super.anInt8167);
	}

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "(I)V")
	@Override
	protected void method7232() {
		Static410.aFloatArray63[3] = (float) (super.anInt8306 >>> 24) / 255.0F;
		Static410.aFloatArray63[2] = (float) (super.anInt8306 & 0xFF) / 255.0F;
		Static410.aFloatArray63[1] = (float) (super.anInt8306 & 0xFF00) / 65280.0F;
		Static410.aFloatArray63[0] = (float) (super.anInt8306 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static410.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([Lclient!jp;I)Lclient!vr;")
	@Override
	public Class310 method7266(@OriginalArg(0) Class154[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "()V")
	@Override
	public void method7161() {
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(ZI)V")
	@Override
	public void method7327(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "(I)V")
	@Override
	protected void method7319() {
		this.method7365();
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)V")
	@Override
	public void method7216(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "(I)V")
	@Override
	protected void method7292() {
		if (super.aBoolean613) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!vr;I)V")
	@Override
	public void method7268(@OriginalArg(0) Class310 arg0) {
	}

	@OriginalMember(owner = "client!tm", name = "S", descriptor = "(I)V")
	@Override
	protected void method7334() {
		OpenGL.glTexEnvi(8960, 34161, Static171.method3197(super.aClass246Array6[super.anInt8310]));
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILclient!g;ZLclient!vp;)Lclient!eea;")
	@Override
	public Interface5 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(4) Class308 arg3) {
		if (this.aBoolean615 || Static329.method5606(arg1) && Static329.method5606(arg0)) {
			return new Class58_Sub4(this, arg2, arg3, arg1, arg0);
		} else if (this.aBoolean614) {
			return new Class58_Sub3(this, arg2, arg3, arg1, arg0);
		} else {
			return new Class58_Sub4(this, arg2, arg3, Static184.method3549(arg1), Static184.method3549(arg0));
		}
	}

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "(II)V")
	public synchronized void method7366(@OriginalArg(0) int arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong251 = arg0;
		this.aClass295_56.method7533(local13);
	}

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "(I)V")
	@Override
	public void method7312() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray66, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "()V")
	@Override
	public void method7221() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7206(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBI)V")
	public synchronized void method7367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		local14.aLong251 = arg1;
		this.aClass295_52.method7533(local14);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(BI)Lclient!lj;")
	@Override
	protected Class73 method7256(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class73_Sub6(this, super.aClass69_92);
		} else if (arg0 == 4) {
			return new Class73_Sub2(this, super.aClass69_92, super.aClass173_6);
		} else {
			return super.method7256(arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "J", descriptor = "(I)F")
	@Override
	protected float method7314() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!g;Lclient!vp;)Z")
	@Override
	public boolean method7237(@OriginalArg(1) Class110 arg0, @OriginalArg(2) Class308 arg1) {
		return true;
	}
}
