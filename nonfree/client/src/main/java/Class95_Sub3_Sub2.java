import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class95_Sub3_Sub2 extends Class95_Sub3 {

	@OriginalMember(owner = "client!sb", name = "Mi", descriptor = "Z")
	private boolean aBoolean636;

	@OriginalMember(owner = "client!sb", name = "Ni", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "client!sb", name = "Oi", descriptor = "I")
	private int anInt8479;

	@OriginalMember(owner = "client!sb", name = "Pi", descriptor = "Z")
	private boolean aBoolean637;

	@OriginalMember(owner = "client!sb", name = "Qi", descriptor = "Z")
	private boolean aBoolean638;

	@OriginalMember(owner = "client!sb", name = "Ri", descriptor = "Z")
	private boolean aBoolean639;

	@OriginalMember(owner = "client!sb", name = "Ti", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!sb", name = "ph", descriptor = "Lclient!fha;")
	private final Class109 aClass109_53 = new Class109();

	@OriginalMember(owner = "client!sb", name = "zi", descriptor = "Lclient!fha;")
	private final Class109 aClass109_54 = new Class109();

	@OriginalMember(owner = "client!sb", name = "Bi", descriptor = "Lclient!fha;")
	private final Class109 aClass109_55 = new Class109();

	@OriginalMember(owner = "client!sb", name = "Fi", descriptor = "Lclient!fha;")
	private final Class109 aClass109_56 = new Class109();

	@OriginalMember(owner = "client!sb", name = "Ji", descriptor = "Lclient!fha;")
	private final Class109 aClass109_57 = new Class109();

	@OriginalMember(owner = "client!sb", name = "Ki", descriptor = "Lclient!fha;")
	private final Class109 aClass109_58 = new Class109();

	@OriginalMember(owner = "client!sb", name = "Li", descriptor = "Lclient!fha;")
	private final Class109 aClass109_59 = new Class109();

	@OriginalMember(owner = "client!sb", name = "Ui", descriptor = "[Lclient!jw;")
	private final Class180_Sub1[] aClass180_Sub1Array1 = new Class180_Sub1[16];

	@OriginalMember(owner = "client!sb", name = "Si", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!sb", name = "Vi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!sb", name = "gj", descriptor = "I")
	private final int anInt8482 = 0;

	@OriginalMember(owner = "client!sb", name = "ci", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!sb", name = "cj", descriptor = "Ljava/lang/String;")
	private final String aString98;

	@OriginalMember(owner = "client!sb", name = "Zi", descriptor = "Ljava/lang/String;")
	private final String aString97;

	@OriginalMember(owner = "client!sb", name = "ej", descriptor = "I")
	private final int anInt8481;

	@OriginalMember(owner = "client!sb", name = "Xi", descriptor = "Z")
	public boolean aBoolean642;

	@OriginalMember(owner = "client!sb", name = "hj", descriptor = "Z")
	private boolean aBoolean646;

	@OriginalMember(owner = "client!sb", name = "bj", descriptor = "Z")
	private final boolean aBoolean644;

	@OriginalMember(owner = "client!sb", name = "Wi", descriptor = "Z")
	public final boolean aBoolean641;

	@OriginalMember(owner = "client!sb", name = "Yi", descriptor = "Z")
	public final boolean aBoolean643;

	@OriginalMember(owner = "client!sb", name = "fj", descriptor = "Z")
	public final boolean aBoolean645;

	@OriginalMember(owner = "client!sb", name = "dj", descriptor = "[I")
	public final int[] anIntArray575;

	@OriginalMember(owner = "client!sb", name = "aj", descriptor = "I")
	public final int anInt8480;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!wu;I)V")
	public Class95_Sub3_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(4) Class380 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString98 = OpenGL.glGetString(7936).toLowerCase();
			this.aString97 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString98.indexOf("microsoft") != -1 || this.aString98.indexOf("brian paul") != -1 || this.aString98.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(110) String local110 = OpenGL.glGetString(7938);
			@Pc(118) String[] local118 = Static17.method249(local110.replace('.', ' '), ' ');
			if (local118.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(134) int local134;
			try {
				@Pc(128) int local128 = Static445.method6066(local118[0]);
				local134 = Static445.method6066(local118[1]);
				this.anInt8481 = local128 * 10 + local134;
			} catch (@Pc(144) NumberFormatException local144) {
				throw new RuntimeException("");
			}
			if (this.anInt8481 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(186) int[] local186 = new int[1];
				OpenGL.glGetIntegerv(34018, local186, 0);
				super.anInt8371 = local186[0];
				if (super.anInt8371 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8376 = 8;
				this.aBoolean642 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean615 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean646 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean629 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean644 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean623 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean641 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean643 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean645 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray575 = new int[super.anInt8371];
				this.anInt8480 = Stream.a() ? 33639 : 5121;
				if (this.aString97.indexOf("radeon") != -1) {
					local134 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static17.method249(this.aString97.replace('/', ' '), ' ');
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static319.method4274(local308.substring(1, 3))) {
									local308 = local308.substring(1);
									local291 = true;
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local308 = local308.substring(2);
										local289 = true;
									}
									if (local308.length() >= 4 && Static319.method4274(local308.substring(0, 4))) {
										local134 = Static445.method6066(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(376) Exception local376) {
						}
					}
					if (!local291 && !local289) {
						if (local134 >= 7000 && local134 <= 9250) {
							super.aBoolean623 = false;
						}
						if (local134 >= 7000 && local134 <= 7999) {
							this.aBoolean642 = false;
						}
					}
					this.aBoolean646 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString98.indexOf("intel");
				if (this.aBoolean642) {
					try {
						@Pc(426) int[] local426 = new int[1];
						OpenGL.glGenBuffersARB(1, local426, 0);
					} catch (@Pc(432) Throwable local432) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(438) Throwable local438) {
			local438.printStackTrace();
			this.method6966();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "()V")
	@Override
	public void method6986() {
		if (super.anInt8288 <= 0 && super.anInt8286 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt8369;
		@Pc(16) int local16 = super.anInt8365;
		@Pc(19) int local19 = super.anInt8385;
		@Pc(22) int local22 = super.anInt8363;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7088();
		this.method7065(false);
		this.method7076(false);
		this.method7013(false);
		this.method7033(false);
		this.method7112(null);
		this.method7148(false, false, -2);
		this.method7026(1);
		this.method7137(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8288, super.anInt8286, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "(II)V")
	public synchronized void method7150(@OriginalArg(1) int arg0) {
		@Pc(12) Class2 local12 = new Class2();
		local12.aLong280 = arg0;
		this.aClass109_58.method2323(local12);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7140(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	@Override
	public void method6988(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "(I)V")
	@Override
	protected void method7118() {
		OpenGL.glTexEnvi(8960, 34161, Static136.method8328(super.aClass136Array6[super.anInt8362]));
	}

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "(B)V")
	@Override
	protected void method7142() {
		Static261.aFloatArray20[2] = super.aFloat178 * super.aFloat181;
		Static261.aFloatArray20[1] = super.aFloat178 * super.aFloat172;
		Static261.aFloatArray20[3] = 1.0F;
		Static261.aFloatArray20[0] = super.aFloat183 * super.aFloat178;
		OpenGL.glLightModelfv(2899, Static261.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!sb", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!lk;Z)V")
	@Override
	public void method7054(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		this.aClass180_Sub1Array1[arg0] = (Class180_Sub1) arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLclient!dha;)V")
	@Override
	public void method7059(@OriginalArg(1) Class72 arg0) {
		@Pc(9) Class258[] local9 = ((Class72_Sub1) arg0).aClass258Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class258 local25 = local9[local19];
			@Pc(30) Class180_Sub1 local30 = this.aClass180_Sub1Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method3896();
			@Pc(40) long local40 = local30.method7376();
			local30.method7377();
			for (@Pc(45) int local45 = 0; local45 < local25.method5568(); local45++) {
				@Pc(52) Class202 local52 = local25.method5570(local45);
				if (local52 == Static312.aClass202_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local36, (long) local32 + local40);
				} else if (Static312.aClass202_2 == local52) {
					OpenGL.glNormalPointer(5126, local36, local40 + (long) local32);
					local15 = true;
				} else if (local52 == Static312.aClass202_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local36, local40 + (long) local32);
				} else if (local52 == Static312.aClass202_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, local40 + (long) local32);
				} else if (local52 == Static312.aClass202_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, (long) local32 + local40);
				} else if (local52 == Static312.aClass202_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, local40 + (long) local32);
				} else if (Static312.aClass202_7 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, local40 + (long) local32);
				}
				local32 += local52.anInt5012;
			}
		}
		if (this.aBoolean638 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean638 = local17;
		}
		if (this.aBoolean636 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean636 = local15;
		}
		if (local13 != this.aBoolean640) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean640 = local13;
		}
		@Pc(258) int local258;
		if (local11 > this.anInt8479) {
			for (local258 = this.anInt8479; local258 < local11; local258++) {
				OpenGL.glClientActiveTexture(local258 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt8479 = local11;
		} else if (local11 < this.anInt8479) {
			for (local258 = local11; local258 < this.anInt8479; local258++) {
				OpenGL.glClientActiveTexture(local258 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt8479 = local11;
		}
	}

	@OriginalMember(owner = "client!sb", name = "P", descriptor = "(I)V")
	@Override
	protected void method7102() {
		for (@Pc(6) int local6 = super.anInt8371 - 1; local6 >= 0; local6--) {
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
		@Pc(81) float[] local81 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(83) int local83 = 0; local83 < 8; local83++) {
			@Pc(89) int local89 = local83 + 16384;
			OpenGL.glLightfv(local89, 4608, local81, 0);
			OpenGL.glLightf(local89, 4615, 0.0F);
			OpenGL.glLightf(local89, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method7102();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method7120(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "()Lclient!gba;")
	@Override
	public Class117 method7008() {
		@Pc(7) int local7 = -1;
		if (this.aString98.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString98.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString98.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class117(local7, "OpenGL", this.anInt8481, this.aString97, 0L);
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "()Z")
	@Override
	public boolean method6951() {
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6957(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7073(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[Lclient!ot;)Lclient!dha;")
	@Override
	public Class72 method7056(@OriginalArg(1) Class258[] arg0) {
		return new Class72_Sub1(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(Z)V")
	@Override
	protected void method7081() {
		OpenGL.glDepthMask(super.aBoolean625 && super.aBoolean617);
	}

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "(I)V")
	@Override
	protected void method7092() {
		@Pc(15) int local15 = this.anIntArray575[super.anInt8362];
		if (local15 != 0) {
			this.anIntArray575[super.anInt8362] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "(I)V")
	@Override
	protected void method7096() {
		if (super.aBoolean622) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "(I)V")
	private void method7152() {
		if (this.aBoolean637) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass125_7.method2683()) {
			if (!this.aBoolean639) {
				OpenGL.glLoadMatrixf(super.aClass177_Sub1_18.method3828(Static111.aFloatArray6), 0);
				this.aBoolean639 = true;
				this.method7047();
				this.method7074();
			}
			if (super.aBoolean613) {
				this.aBoolean637 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass177_Sub1_15.method3828(Static111.aFloatArray6), 0);
				this.aBoolean637 = true;
			}
		} else if (super.aBoolean613) {
			OpenGL.glLoadIdentity();
			this.aBoolean637 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass177_Sub1_15.method3828(Static111.aFloatArray6), 0);
			this.aBoolean637 = false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "(I)V")
	@Override
	protected void method7072() {
		if (super.aBoolean633) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILclient!bfa;)V")
	@Override
	public void method7114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(18) byte local18;
		@Pc(22) int local22;
		if (Static176.aClass30_1 == arg2) {
			local18 = 1;
			local22 = arg1 * 2;
		} else if (Static439.aClass30_4 == arg2) {
			local22 = arg1 + 1;
			local18 = 3;
		} else if (Static286.aClass30_3 == arg2) {
			local18 = 4;
			local22 = arg1 * 3;
		} else if (arg2 == Static482.aClass30_5) {
			local18 = 6;
			local22 = arg1 + 2;
		} else if (Static249.aClass30_2 == arg2) {
			local18 = 5;
			local22 = arg1 + 2;
		} else {
			local18 = 0;
			local22 = arg1;
		}
		OpenGL.glDrawArrays(local18, arg0, local22);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[FIZILclient!kea;I)Lclient!oia;")
	@Override
	protected Interface19 method7132(@OriginalArg(2) float[] arg0, @OriginalArg(4) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class188 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean644 || Static485.method6790(arg2) && Static485.method6790(arg4)) {
			return new Class59_Sub1(this, arg3, arg2, arg4, arg1, arg0, 0, 0);
		} else if (this.aBoolean646) {
			return new Class59_Sub3(this, arg3, arg2, arg4, arg0, 0, 0);
		} else {
			@Pc(58) Class59_Sub1 local58 = new Class59_Sub1(this, arg3, Static290.aClass189_15, Static350.method4699(arg2), Static350.method4699(arg4));
			local58.method1165(arg4, arg3, arg0, arg2);
			return local58;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBZLclient!qs;Z)V")
	@Override
	public void method7028(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class291 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static520.method7259(arg2));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "(I)V")
	@Override
	protected void method7082() {
		if (super.aBoolean614 && super.aBoolean618 && super.anInt8382 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!hs;Lclient!mp;)Lclient!cha;")
	@Override
	public Interface4 method6959(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface18 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
	public synchronized void method7153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub30 local13 = new Class2_Sub30(arg1);
		local13.aLong280 = arg0;
		this.aClass109_54.method2323(local13);
	}

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "(I)F")
	@Override
	protected float method7058() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "()V")
	@Override
	protected void method6966() {
		super.method6966();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "(I)V")
	@Override
	protected void method7063() {
		if (super.aBoolean619) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "()V")
	@Override
	public void method6976() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!sb", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8286 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt8480, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!kf;Lclient!kea;I)Z")
	@Override
	public boolean method7135(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class188 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!pf;B)V")
	@Override
	public void method7046(@OriginalArg(0) Class266 arg0) {
		if (Static160.aClass266_2 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static188.method2727(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt8482;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Lclient!ni;")
	@Override
	protected Class7 method7050(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class7_Sub2(this, super.aClass380_114);
		} else if (arg0 == 4) {
			return new Class7_Sub7(this, super.aClass380_114, super.aClass174_7);
		} else if (arg0 == 8) {
			return new Class7_Sub5(this, super.aClass380_114, super.aClass174_7);
		} else {
			return super.method7050(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!cha;)V")
	@Override
	public void method7010(@OriginalArg(0) Interface4 arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7138(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL2.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "(B)V")
	@Override
	protected void method7104() {
		if (super.aBoolean628) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)V")
	public synchronized void method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub30 local13 = new Class2_Sub30(arg0);
		local13.aLong280 = arg1;
		this.aClass109_55.method2323(local13);
	}

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "(I)V")
	@Override
	protected void method7074() {
		this.method7034();
		@Pc(12) int local12;
		for (local12 = 0; super.anInt8381 > local12; local12++) {
			@Pc(19) Class2_Sub24 local19 = super.aClass2_Sub24Array34[local12];
			@Pc(23) int local23 = local19.method6305();
			@Pc(27) int local27 = local12 + 16386;
			@Pc(33) float local33 = local19.method6307() / 255.0F;
			Static261.aFloatArray20[0] = local19.method6299();
			Static261.aFloatArray20[1] = local19.method6308();
			Static261.aFloatArray20[2] = local19.method6301();
			Static261.aFloatArray20[3] = 1.0F;
			OpenGL.glLightfv(local27, 4611, Static261.aFloatArray20, 0);
			Static261.aFloatArray20[1] = local33 * (float) (local23 >> 8 & 0xFF);
			Static261.aFloatArray20[3] = 1.0F;
			Static261.aFloatArray20[2] = (float) (local23 & 0xFF) * local33;
			Static261.aFloatArray20[0] = local33 * (float) (local23 >> 16 & 0xFF);
			OpenGL.glLightfv(local27, 4609, Static261.aFloatArray20, 0);
			OpenGL.glLightf(local27, 4617, 1.0F / (float) (local19.method6302() * local19.method6302()));
			OpenGL.glEnable(local27);
		}
		while (local12 < super.anInt8378) {
			OpenGL.glDisable(local12 + 16386);
			local12++;
		}
		super.method7074();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Lclient!hs;")
	@Override
	public Interface11 method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIZ[I)Lclient!oia;")
	@Override
	public Interface19 method7089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5) {
		if (this.aBoolean644 || Static485.method6790(arg1) && Static485.method6790(arg3)) {
			return new Class59_Sub1(this, arg1, arg3, arg4, arg5, 0, arg2);
		} else if (this.aBoolean646) {
			return new Class59_Sub3(this, arg1, arg3, arg5, 0, arg2);
		} else {
			@Pc(60) Class59_Sub1 local60 = new Class59_Sub1(this, Static393.aClass188_12, Static290.aClass189_11, Static350.method4699(arg1), Static350.method4699(arg3));
			local60.method3130(0, arg2, 0, arg1, arg5, arg3);
			return local60;
		}
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(Z)V")
	@Override
	protected void method7109() {
		Static261.aFloatArray20[2] = (float) (super.anInt8348 & 0xFF) / 255.0F;
		Static261.aFloatArray20[3] = (float) (super.anInt8348 >>> 24) / 255.0F;
		Static261.aFloatArray20[1] = (float) (super.anInt8348 & 0xFF00) / 65280.0F;
		Static261.aFloatArray20[0] = (float) (super.anInt8348 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static261.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "(B)V")
	@Override
	protected void method7048() {
		if (super.aClass215_8 == Static469.aClass215_2) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static365.aClass215_5 == super.aClass215_8) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass215_8 == Static528.aClass215_9) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "(I)V")
	@Override
	protected void method7098() {
		OpenGL.glActiveTexture(super.anInt8362 + 33984);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)V")
	public synchronized void method7155(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong280 = arg0;
		this.aClass109_59.method2323(local7);
	}

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "(I)V")
	@Override
	protected void method7052() {
		OpenGL.glViewport(super.anInt8353, super.anInt8356, super.anInt8288, super.anInt8286);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(BZ)V")
	@Override
	public void method7126(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "()Z")
	@Override
	public boolean method6946() {
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(B)V")
	@Override
	protected void method7027() {
		if (super.aBoolean620) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!sb", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7033(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z[BILclient!kea;II)Lclient!co;")
	@Override
	public Interface5 method7068(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class188 arg1) {
		return new Class59_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!bfa;IIZILclient!ho;I)V")
	@Override
	public void method7060(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface10 arg4, @OriginalArg(6) int arg5) {
		@Pc(17) byte local17;
		@Pc(15) int local15;
		if (Static176.aClass30_1 == arg0) {
			local15 = arg5 * 2;
			local17 = 1;
		} else if (arg0 == Static439.aClass30_4) {
			local15 = arg5 + 1;
			local17 = 3;
		} else if (Static286.aClass30_3 == arg0) {
			local15 = arg5 * 3;
			local17 = 4;
		} else if (Static482.aClass30_5 == arg0) {
			local17 = 6;
			local15 = arg5 + 2;
		} else if (Static249.aClass30_2 == arg0) {
			local17 = 5;
			local15 = arg5 + 2;
		} else {
			local15 = arg5;
			local17 = 0;
		}
		@Pc(68) Class189 local68 = arg4.method7386();
		@Pc(71) Class180_Sub2 local71 = (Class180_Sub2) arg4;
		local71.method7377();
		OpenGL.glDrawElements(local17, local15, Static626.method8393(local68), local71.method7376() + (long) (arg1 * local68.anInt4729));
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	@Override
	protected void method7016() {
		super.aFloat179 = -super.anInt8366 + super.anInt8375;
		super.aFloat175 = (float) -super.anInt8382 + super.aFloat179;
		if ((float) super.anInt8377 > super.aFloat175) {
			super.aFloat175 = super.anInt8377;
		}
		OpenGL.glFogf(2915, super.aFloat175);
		OpenGL.glFogf(2916, super.aFloat179);
		Static261.aFloatArray20[2] = (float) (super.anInt8359 & 0xFF) / 255.0F;
		Static261.aFloatArray20[0] = (float) (super.anInt8359 & 0xFF0000) / 1.671168E7F;
		Static261.aFloatArray20[1] = (float) (super.anInt8359 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static261.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!kea;Lclient!kf;B)Z")
	@Override
	public boolean method7103(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class189 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "()V")
	@Override
	public void method6991() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ[BLclient!kea;IZII)Lclient!oia;")
	@Override
	protected Interface19 method7141(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class188 arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean644 || Static485.method6790(arg4) && Static485.method6790(arg3)) {
			return new Class59_Sub1(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
		} else if (this.aBoolean646) {
			return new Class59_Sub3(this, arg1, arg4, arg3, arg0, 0, 0);
		} else {
			@Pc(48) Class59_Sub1 local48 = new Class59_Sub1(this, arg1, Static290.aClass189_11, Static350.method4699(arg4), Static350.method4699(arg3));
			local48.method3135(arg0, arg1, 0, arg4, arg3);
			return local48;
		}
	}

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "(I)V")
	@Override
	protected void method7129() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass85Array3[super.anInt8362] == Static624.aClass85_5) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass177_Sub1Array3[super.anInt8362].method3828(Static111.aFloatArray6), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "(B)V")
	@Override
	public void method7047() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray72, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray69, 0);
	}

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "(B)V")
	@Override
	protected void method7110() {
		this.aBoolean639 = false;
		this.method7152();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6943(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6996(arg2, arg3);
	}

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "(B)V")
	@Override
	protected void method7136() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!qs;ZI)V")
	@Override
	protected void method7134(@OriginalArg(1) Class291 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static520.method7259(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "()V")
	@Override
	public void method7011() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[[IIZ)Lclient!uia;")
	@Override
	public Interface23 method7043(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class59_Sub4(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "(I)V")
	@Override
	protected void method7037() {
		OpenGL.glScissor(super.anInt8353 + super.anInt8369, -super.anInt8363 + super.anInt8356 + super.anInt8286, super.anInt8365 - super.anInt8369, -super.anInt8385 + super.anInt8363);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Lclient!mp;")
	@Override
	public Interface18 method6983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "(I)V")
	@Override
	protected void method7130() {
		if (super.aBoolean626 && !super.aBoolean631) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V")
	@Override
	public void method7030(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!cd;Lclient!cd;FLclient!cd;)Lclient!cd;")
	@Override
	public Class12 method6974(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)V")
	@Override
	public void method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(B)V")
	@Override
	protected void method7036() {
		OpenGL.glTexEnvi(8960, 34162, Static136.method8328(super.aClass136Array5[super.anInt8362]));
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZ)Lclient!ho;")
	@Override
	public Interface10 method7119(@OriginalArg(0) boolean arg0) {
		return new Class180_Sub2(this, Static290.aClass189_12, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "()V")
	@Override
	public void method7000() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!kf;Lclient!kea;I)Lclient!oia;")
	@Override
	public Interface19 method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) Class188 arg3) {
		if (this.aBoolean644 || Static485.method6790(arg0) && Static485.method6790(arg1)) {
			return new Class59_Sub1(this, arg3, arg2, arg0, arg1);
		} else if (this.aBoolean646) {
			return new Class59_Sub3(this, arg3, arg2, arg0, arg1);
		} else {
			return new Class59_Sub1(this, arg3, arg2, Static350.method4699(arg0), Static350.method4699(arg1));
		}
	}

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "(I)V")
	@Override
	protected void method7090() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray68, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(BZ)Lclient!lk;")
	@Override
	public Interface16 method7122(@OriginalArg(1) boolean arg0) {
		return new Class180_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6925(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub30 local19;
		while (!this.aClass109_54.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_54.method2322();
			Static595.anIntArray661[local7++] = (int) local19.aLong280;
			super.anInt8343 -= local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static595.anIntArray661, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static595.anIntArray661, 0);
			local7 = 0;
		}
		while (!this.aClass109_55.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_55.method2322();
			Static595.anIntArray661[local7++] = (int) local19.aLong280;
			super.anInt8342 -= local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static595.anIntArray661, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static595.anIntArray661, 0);
			local7 = 0;
		}
		while (!this.aClass109_56.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_56.method2322();
			Static595.anIntArray661[local7++] = local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static595.anIntArray661, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static595.anIntArray661, 0);
			local7 = 0;
		}
		while (!this.aClass109_57.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_57.method2322();
			Static595.anIntArray661[local7++] = (int) local19.aLong280;
			super.anInt8344 -= local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static595.anIntArray661, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static595.anIntArray661, 0);
		}
		while (!this.aClass109_53.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_53.method2322();
			OpenGL.glDeleteLists((int) local19.aLong280, local19.anInt5508);
		}
		@Pc(215) Class2 local215;
		while (!this.aClass109_58.method2328()) {
			local215 = this.aClass109_58.method2322();
			OpenGL.glDeleteProgramARB((int) local215.aLong280);
		}
		while (!this.aClass109_59.method2328()) {
			local215 = this.aClass109_59.method2322();
			OpenGL.glDeleteObjectARB(local215.aLong280);
		}
		while (!this.aClass109_53.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_53.method2322();
			OpenGL.glDeleteLists((int) local19.aLong280, local19.anInt5508);
		}
		if (this.E() > 100663296 && Static476.method6413() > this.aLong229 + 60000L) {
			System.gc();
			this.aLong229 = Static476.method6413();
		}
		super.method6925(local11);
	}

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "(I)V")
	@Override
	protected void method7078() {
		Static261.aFloatArray20[2] = super.aFloat181 * super.aFloat174;
		Static261.aFloatArray20[3] = 1.0F;
		Static261.aFloatArray20[0] = super.aFloat174 * super.aFloat183;
		Static261.aFloatArray20[1] = super.aFloat174 * super.aFloat172;
		OpenGL.glLightfv(16384, 4609, Static261.aFloatArray20, 0);
		Static261.aFloatArray20[0] = super.aFloat183 * -super.aFloat188;
		Static261.aFloatArray20[1] = super.aFloat172 * -super.aFloat188;
		Static261.aFloatArray20[2] = -super.aFloat188 * super.aFloat181;
		Static261.aFloatArray20[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static261.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "(I)V")
	@Override
	protected void method7127() {
		this.method7152();
	}
}
