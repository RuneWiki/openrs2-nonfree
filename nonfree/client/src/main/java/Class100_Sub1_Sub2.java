import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Class100_Sub1_Sub2 extends Class100_Sub1 {

	@OriginalMember(owner = "client!tia", name = "Li", descriptor = "J")
	private long aLong269;

	@OriginalMember(owner = "client!tia", name = "Th", descriptor = "Z")
	private boolean aBoolean627;

	@OriginalMember(owner = "client!tia", name = "Gi", descriptor = "Z")
	private boolean aBoolean628;

	@OriginalMember(owner = "client!tia", name = "Xh", descriptor = "I")
	private int anInt9357;

	@OriginalMember(owner = "client!tia", name = "Ni", descriptor = "Z")
	private boolean aBoolean629;

	@OriginalMember(owner = "client!tia", name = "Ki", descriptor = "Z")
	private boolean aBoolean630;

	@OriginalMember(owner = "client!tia", name = "si", descriptor = "Z")
	private boolean aBoolean631;

	@OriginalMember(owner = "client!tia", name = "dh", descriptor = "Lclient!at;")
	private final Class20 aClass20_53 = new Class20();

	@OriginalMember(owner = "client!tia", name = "wh", descriptor = "Lclient!at;")
	private final Class20 aClass20_54 = new Class20();

	@OriginalMember(owner = "client!tia", name = "hh", descriptor = "Lclient!at;")
	private final Class20 aClass20_55 = new Class20();

	@OriginalMember(owner = "client!tia", name = "fh", descriptor = "Lclient!at;")
	private final Class20 aClass20_56 = new Class20();

	@OriginalMember(owner = "client!tia", name = "Ug", descriptor = "Lclient!at;")
	private final Class20 aClass20_57 = new Class20();

	@OriginalMember(owner = "client!tia", name = "th", descriptor = "Lclient!at;")
	private final Class20 aClass20_58 = new Class20();

	@OriginalMember(owner = "client!tia", name = "Fg", descriptor = "Lclient!at;")
	private final Class20 aClass20_59 = new Class20();

	@OriginalMember(owner = "client!tia", name = "Yh", descriptor = "[Lclient!nfa;")
	private final Class116_Sub2[] aClass116_Sub2Array1 = new Class116_Sub2[16];

	@OriginalMember(owner = "client!tia", name = "Oi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!tia", name = "Eg", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!tia", name = "Ji", descriptor = "I")
	private final int anInt9360 = 0;

	@OriginalMember(owner = "client!tia", name = "Bh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!tia", name = "Qh", descriptor = "Ljava/lang/String;")
	private final String aString111;

	@OriginalMember(owner = "client!tia", name = "Lg", descriptor = "Ljava/lang/String;")
	private final String aString112;

	@OriginalMember(owner = "client!tia", name = "Dg", descriptor = "I")
	private final int anInt9358;

	@OriginalMember(owner = "client!tia", name = "hi", descriptor = "Z")
	public boolean aBoolean634;

	@OriginalMember(owner = "client!tia", name = "Ei", descriptor = "Z")
	private boolean aBoolean632;

	@OriginalMember(owner = "client!tia", name = "ui", descriptor = "Z")
	private final boolean aBoolean635;

	@OriginalMember(owner = "client!tia", name = "Zh", descriptor = "Z")
	public final boolean aBoolean637;

	@OriginalMember(owner = "client!tia", name = "Ag", descriptor = "Z")
	public final boolean aBoolean636;

	@OriginalMember(owner = "client!tia", name = "Di", descriptor = "Z")
	public final boolean aBoolean633;

	@OriginalMember(owner = "client!tia", name = "vi", descriptor = "[I")
	public final int[] anIntArray522;

	@OriginalMember(owner = "client!tia", name = "Ng", descriptor = "I")
	public final int anInt9359;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!gda;I)V")
	public Class100_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class126 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString111 = OpenGL.glGetString(7936).toLowerCase();
			this.aString112 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString111.indexOf("microsoft") != -1 || this.aString111.indexOf("brian paul") != -1 || this.aString111.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(118) String local118 = OpenGL.glGetString(7938);
			@Pc(126) String[] local126 = Static350.method5156(' ', local118.replace('.', ' '));
			if (local126.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(148) int local148;
			try {
				@Pc(142) int local142 = Static407.method5956(local126[0]);
				local148 = Static407.method5956(local126[1]);
				this.anInt9358 = local148 + local142 * 10;
			} catch (@Pc(157) NumberFormatException local157) {
				throw new RuntimeException("");
			}
			if (this.anInt9358 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(201) int[] local201 = new int[1];
				OpenGL.glGetIntegerv(34018, local201, 0);
				super.anInt9250 = local201[0];
				if (super.anInt9250 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9240 = 8;
				this.aBoolean634 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean619 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean632 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean608 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean635 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean606 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean637 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean636 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean633 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray522 = new int[super.anInt9250];
				this.anInt9359 = Stream.c() ? 33639 : 5121;
				if (this.aString112.indexOf("radeon") != -1) {
					local148 = 0;
					@Pc(330) boolean local330 = false;
					@Pc(332) boolean local332 = false;
					@Pc(341) String[] local341 = Static350.method5156(' ', this.aString112.replace('/', ' '));
					for (@Pc(343) int local343 = 0; local343 < local341.length; local343++) {
						@Pc(349) String local349 = local341[local343];
						try {
							if (local349.length() > 0) {
								if (local349.charAt(0) == 'x' && local349.length() >= 3 && Static352.method5186(local349.substring(1, 3))) {
									local349 = local349.substring(1);
									local332 = true;
								}
								if (local349.equals("hd")) {
									local330 = true;
								} else {
									if (local349.startsWith("hd")) {
										local330 = true;
										local349 = local349.substring(2);
									}
									if (local349.length() >= 4 && Static352.method5186(local349.substring(0, 4))) {
										local148 = Static407.method5956(local349.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(433) Exception local433) {
						}
					}
					if (!local332 && !local330) {
						if (local148 >= 7000 && local148 <= 9250) {
							super.aBoolean606 = false;
						}
						if (local148 >= 7000 && local148 <= 7999) {
							this.aBoolean634 = false;
						}
					}
					this.aBoolean632 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString111.indexOf("intel");
				if (this.aBoolean634) {
					try {
						@Pc(505) int[] local505 = new int[1];
						OpenGL.glGenBuffersARB(1, local505, 0);
					} catch (@Pc(511) Throwable local511) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(517) Throwable local517) {
			local517.printStackTrace();
			this.method8666();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tia", name = "v", descriptor = "()V")
	@Override
	public void method8601() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!tia", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7989() {
		Static654.aFloatArray78[2] = super.aFloat168 * super.aFloat177;
		Static654.aFloatArray78[3] = 1.0F;
		Static654.aFloatArray78[0] = super.aFloat175 * super.aFloat168;
		Static654.aFloatArray78[1] = super.aFloat168 * super.aFloat179;
		OpenGL.glLightfv(16384, 4609, Static654.aFloatArray78, 0);
		Static654.aFloatArray78[3] = 1.0F;
		Static654.aFloatArray78[2] = -super.aFloat173 * super.aFloat177;
		Static654.aFloatArray78[0] = super.aFloat175 * -super.aFloat173;
		Static654.aFloatArray78[1] = super.aFloat179 * -super.aFloat173;
		OpenGL.glLightfv(16385, 4609, Static654.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "(B)V")
	@Override
	public void method7896() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray67, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!tia", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZZ)Lclient!fk;")
	@Override
	public Interface15 method7920(@OriginalArg(0) boolean arg0) {
		return new Class116_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!fk;II)V")
	@Override
	public void method7868(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		this.aClass116_Sub2Array1[arg1] = (Class116_Sub2) arg0;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7960(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIIILclient!ua;[FIZ)Lclient!ah;")
	@Override
	protected Interface2 method7939(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class358 arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean635 || Static197.method3300(arg0) && Static197.method3300(arg1)) {
			return new Class32_Sub2(this, arg2, arg0, arg1, arg4, arg3, 0, 0);
		} else if (this.aBoolean632) {
			return new Class32_Sub1(this, arg2, arg0, arg1, arg3, 0, 0);
		} else {
			@Pc(52) Class32_Sub2 local52 = new Class32_Sub2(this, arg2, Static104.aClass86_12, Static146.method2737(arg0), Static146.method2737(arg1));
			local52.method3689(arg1, arg0, arg3, arg2);
			return local52;
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLclient!gaa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class124 arg0) {
		@Pc(9) Class139[] local9 = ((Class124_Sub1) arg0).aClass139Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local9.length; local27++) {
			@Pc(33) Class139 local33 = local9[local27];
			@Pc(38) Class116_Sub2 local38 = this.aClass116_Sub2Array1[local27];
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = local38.method5736();
			@Pc(48) long local48 = local38.method5728();
			local38.method5724();
			for (@Pc(53) int local53 = 0; local33.method3303() > local53; local53++) {
				@Pc(60) Class21 local60 = local33.method3304(local53);
				if (local60 == Static24.aClass21_1) {
					OpenGL.glVertexPointer(3, 5126, local44, (long) local40 + local48);
					local25 = true;
				} else if (Static24.aClass21_2 == local60) {
					OpenGL.glNormalPointer(5126, local44, local48 + (long) local40);
					local23 = true;
				} else if (local60 == Static24.aClass21_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local44, (long) local40 + local48);
				} else if (Static24.aClass21_4 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, local48 + (long) local40);
				} else if (Static24.aClass21_5 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static24.aClass21_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, local48 + (long) local40);
				} else if (Static24.aClass21_7 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, local48 + (long) local40);
				}
				local40 += local60.anInt325;
			}
		}
		if (local25 != this.aBoolean629) {
			if (local25) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean629 = local25;
		}
		if (this.aBoolean628 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean628 = local23;
		}
		if (local13 != this.aBoolean631) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean631 = local13;
		}
		@Pc(321) int local321;
		if (this.anInt9357 < local11) {
			for (local321 = this.anInt9357; local321 < local11; local321++) {
				OpenGL.glClientActiveTexture(local321 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9357 = local11;
		} else if (local11 < this.anInt9357) {
			for (local321 = local11; local321 < this.anInt9357; local321++) {
				OpenGL.glClientActiveTexture(local321 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9357 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!tia", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "(II)V")
	@Override
	public void method8582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!tia", name = "u", descriptor = "(I)V")
	@Override
	protected void method7990() {
		this.aBoolean630 = false;
		this.method8001();
	}

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "(Z)V")
	@Override
	public void method8599(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tia", name = "t", descriptor = "()V")
	@Override
	protected void method8653() {
		super.method8653();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLclient!ua;Lclient!dn;)Z")
	@Override
	public boolean method7963(@OriginalArg(1) Class358 arg0, @OriginalArg(2) Class86 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tia", name = "l", descriptor = "()Z")
	@Override
	public boolean method8656() {
		return false;
	}

	@OriginalMember(owner = "client!tia", name = "h", descriptor = "(B)V")
	@Override
	protected void method7912() {
		this.method8001();
	}

	@OriginalMember(owner = "client!tia", name = "j", descriptor = "(I)V")
	@Override
	protected void method7924() {
		super.aFloat170 = (float) (-super.anInt9264 + super.anInt9229);
		super.aFloat176 = super.aFloat170 - (float) super.anInt9255;
		if ((float) super.anInt9231 > super.aFloat176) {
			super.aFloat176 = (float) super.anInt9231;
		}
		OpenGL.glFogf(2915, super.aFloat176);
		OpenGL.glFogf(2916, super.aFloat170);
		Static654.aFloatArray78[0] = (float) (super.anInt9236 & 0xFF0000) / 1.671168E7F;
		Static654.aFloatArray78[1] = (float) (super.anInt9236 & 0xFF00) / 65280.0F;
		Static654.aFloatArray78[2] = (float) (super.anInt9236 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static654.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!tia", name = "z", descriptor = "()V")
	@Override
	public void method8648() {
	}

	@OriginalMember(owner = "client!tia", name = "U", descriptor = "(I)V")
	@Override
	protected void method7931() {
		this.method7933();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt9262; local10++) {
			@Pc(17) Class5_Sub12 local17 = super.aClass5_Sub12Array5[local10];
			@Pc(21) int local21 = local17.method4530();
			@Pc(26) int local26 = local10 + 16386;
			@Pc(32) float local32 = local17.method4536() / 255.0F;
			Static654.aFloatArray78[0] = (float) local17.method4537();
			Static654.aFloatArray78[1] = (float) local17.method4533();
			Static654.aFloatArray78[2] = (float) local17.method4534();
			Static654.aFloatArray78[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static654.aFloatArray78, 0);
			Static654.aFloatArray78[0] = local32 * (float) (local21 >> 16 & 0xFF);
			Static654.aFloatArray78[1] = local32 * (float) (local21 >> 8 & 0xFF);
			Static654.aFloatArray78[3] = 1.0F;
			Static654.aFloatArray78[2] = local32 * (float) (local21 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static654.aFloatArray78, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local17.method4531() * local17.method4531()));
			OpenGL.glEnable(local26);
		}
		while (local10 < super.anInt9228) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method7931();
	}

	@OriginalMember(owner = "client!tia", name = "t", descriptor = "(B)V")
	@Override
	protected void method7919() {
		OpenGL.glTexEnvi(8960, 34161, Static413.method6091(super.aClass94Array5[super.anInt9241]));
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(B[[IZI)Lclient!oda;")
	@Override
	public Interface22 method7879(@OriginalArg(1) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class32_Sub4(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "(I)V")
	@Override
	protected void method7943() {
	}

	@OriginalMember(owner = "client!tia", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7952() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass16Array3[super.anInt9241] == Static240.aClass16_19) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass10_Sub2Array3[super.anInt9241].method1715(Static360.aFloatArray51), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "()V")
	@Override
	public void method8616() {
	}

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "(B)F")
	@Override
	protected float method7932() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method7915(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(17) Long local17 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local17)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZJ)V")
	public synchronized void method7995(@OriginalArg(1) long arg0) {
		@Pc(16) Class5 local16 = new Class5();
		local16.aLong312 = arg0;
		this.aClass20_59.method370(local16);
	}

	@OriginalMember(owner = "client!tia", name = "u", descriptor = "()V")
	@Override
	public void method8663() {
		if (super.anInt9118 <= 0 && super.anInt9057 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt9260;
		@Pc(22) int local22 = super.anInt9251;
		@Pc(25) int local25 = super.anInt9245;
		@Pc(28) int local28 = super.anInt9253;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7903();
		this.method7878(false);
		this.method7935(false);
		this.method7951(false);
		this.method7914(false);
		this.method7923((Interface19) null);
		this.method7971(false, -2, false);
		this.method7962(1);
		this.method7957(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9118, super.anInt9057, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!tia", name = "j", descriptor = "(Z)V")
	@Override
	protected void method7884() {
		if (super.aBoolean626) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II[BIZLclient!ua;II)Lclient!ah;")
	@Override
	protected Interface2 method7897(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class358 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean635 || Static197.method3300(arg4) && Static197.method3300(arg0)) {
			return new Class32_Sub2(this, arg3, arg4, arg0, arg2, arg1, 0, 0);
		} else if (this.aBoolean632) {
			return new Class32_Sub1(this, arg3, arg4, arg0, arg1, 0, 0);
		} else {
			@Pc(42) Class32_Sub2 local42 = new Class32_Sub2(this, arg3, Static104.aClass86_8, Static146.method2737(arg4), Static146.method2737(arg0));
			local42.method3683(arg0, 0, arg3, arg1, arg4);
			return local42;
		}
	}

	@OriginalMember(owner = "client!tia", name = "l", descriptor = "(B)V")
	@Override
	protected void method7918() {
		if (super.aBoolean614) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!tia", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt9360;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7899(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local14);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IZLclient!ega;B)V")
	@Override
	protected void method7881(@OriginalArg(0) int arg0, @OriginalArg(2) Class93 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static56.method982(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZLclient!ega;ZII)V")
	@Override
	public void method7883(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static56.method982(arg1));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!tia", name = "I", descriptor = "(I)V")
	@Override
	protected void method7872() {
		for (@Pc(6) int local6 = super.anInt9250 - 1; local6 >= 0; local6--) {
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
		@Pc(80) float[] local80 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(90) int local90 = 0; local90 < 8; local90++) {
			@Pc(100) int local100 = local90 + 16384;
			OpenGL.glLightfv(local100, 4608, local80, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method7872();
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(BI)V")
	@Override
	public void method7928(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIZI[III)Lclient!ah;")
	@Override
	public Interface2 method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean635 || Static197.method3300(arg5) && Static197.method3300(arg1)) {
			return new Class32_Sub2(this, arg5, arg1, arg2, arg4, 0, arg3);
		} else if (this.aBoolean632) {
			return new Class32_Sub1(this, arg5, arg1, arg4, 0, arg3);
		} else {
			@Pc(46) Class32_Sub2 local46 = new Class32_Sub2(this, Static171.aClass358_12, Static104.aClass86_8, Static146.method2737(arg5), Static146.method2737(arg1));
			local46.method3684(0, arg1, arg4, arg3, arg5, 0);
			return local46;
		}
	}

	@OriginalMember(owner = "client!tia", name = "o", descriptor = "(I)V")
	@Override
	protected void method7909() {
		OpenGL.glActiveTexture(super.anInt9241 + 33984);
	}

	@OriginalMember(owner = "client!tia", name = "n", descriptor = "(B)V")
	@Override
	protected void method7906() {
		Static654.aFloatArray78[0] = (float) (super.anInt9266 & 0xFF0000) / 1.671168E7F;
		Static654.aFloatArray78[3] = (float) (super.anInt9266 >>> 24) / 255.0F;
		Static654.aFloatArray78[2] = (float) (super.anInt9266 & 0xFF) / 255.0F;
		Static654.aFloatArray78[1] = (float) (super.anInt9266 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static654.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!sia;)V")
	@Override
	public void method8594(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!el;Lclient!tq;)Lclient!sia;")
	@Override
	public Interface24 method8664(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7977(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8583(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8582(arg2, arg3);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "([BIILclient!ua;BI)Lclient!fd;")
	@Override
	public Interface14 method7894(@OriginalArg(0) byte[] arg0, @OriginalArg(3) Class358 arg1) {
		return new Class32_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!tia", name = "cb", descriptor = "(I)V")
	private void method8001() {
		if (this.aBoolean627) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass146_8.method3395()) {
			if (!this.aBoolean630) {
				OpenGL.glLoadMatrixf(super.aClass10_Sub2_18.method1715(Static360.aFloatArray51), 0);
				this.aBoolean630 = true;
				this.method7896();
				this.method7931();
			}
			if (super.aBoolean605) {
				this.aBoolean627 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass10_Sub2_15.method1715(Static360.aFloatArray51), 0);
				this.aBoolean627 = true;
			}
		} else if (super.aBoolean605) {
			OpenGL.glLoadIdentity();
			this.aBoolean627 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass10_Sub2_15.method1715(Static360.aFloatArray51), 0);
			this.aBoolean627 = false;
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8591(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tia", name = "w", descriptor = "(B)V")
	@Override
	protected void method7993() {
		if (super.aBoolean615) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!tia", name = "u", descriptor = "(B)V")
	@Override
	protected void method7895() {
		if (super.aClass102_7 == Static381.aClass102_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass102_7 == Static33.aClass102_1) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass102_7 == Static306.aClass102_5) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!tia", name = "t", descriptor = "(I)V")
	@Override
	protected void method7937() {
		OpenGL.glTexEnvi(8960, 34162, Static413.method6091(super.aClass94Array6[super.anInt9241]));
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(III)V")
	public synchronized void method8002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg1);
		local8.aLong312 = (long) arg0;
		this.aClass20_55.method370(local8);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lclient!el;")
	@Override
	public Interface13 method8629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8634(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub43 local19;
		while (!this.aClass20_54.method367()) {
			local19 = (Class5_Sub43) this.aClass20_54.method369();
			Static668.anIntArray451[local7++] = (int) local19.aLong312;
			super.anInt9226 -= local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static668.anIntArray451, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static668.anIntArray451, 0);
			local7 = 0;
		}
		while (!this.aClass20_55.method367()) {
			local19 = (Class5_Sub43) this.aClass20_55.method369();
			Static668.anIntArray451[local7++] = (int) local19.aLong312;
			super.anInt9220 -= local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static668.anIntArray451, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static668.anIntArray451, 0);
			local7 = 0;
		}
		while (!this.aClass20_56.method367()) {
			local19 = (Class5_Sub43) this.aClass20_56.method369();
			Static668.anIntArray451[local7++] = local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static668.anIntArray451, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static668.anIntArray451, 0);
			local7 = 0;
		}
		while (!this.aClass20_57.method367()) {
			local19 = (Class5_Sub43) this.aClass20_57.method369();
			Static668.anIntArray451[local7++] = (int) local19.aLong312;
			super.anInt9223 -= local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static668.anIntArray451, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static668.anIntArray451, 0);
		}
		while (!this.aClass20_53.method367()) {
			local19 = (Class5_Sub43) this.aClass20_53.method369();
			OpenGL.glDeleteLists((int) local19.aLong312, local19.anInt6989);
		}
		@Pc(228) Class5 local228;
		while (!this.aClass20_58.method367()) {
			local228 = this.aClass20_58.method369();
			OpenGL.glDeleteProgramARB((int) local228.aLong312);
		}
		while (!this.aClass20_59.method367()) {
			local228 = this.aClass20_59.method369();
			OpenGL.glDeleteObjectARB(local228.aLong312);
		}
		while (!this.aClass20_53.method367()) {
			local19 = (Class5_Sub43) this.aClass20_53.method369();
			OpenGL.glDeleteLists((int) local19.aLong312, local19.anInt6989);
		}
		if (this.E() > 100663296 && this.aLong269 + 60000L < Static480.method6763()) {
			System.gc();
			this.aLong269 = Static480.method6763();
		}
		super.method8634(local11);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIBILclient!jj;Lclient!lp;I)V")
	@Override
	public void method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class187 arg3, @OriginalArg(5) Interface20 arg4, @OriginalArg(6) int arg5) {
		@Pc(24) byte local24;
		@Pc(22) int local22;
		if (Static664.aClass187_7 == arg3) {
			local24 = 1;
			local22 = arg5 * 2;
		} else if (Static262.aClass187_3 == arg3) {
			local22 = arg5 + 1;
			local24 = 3;
		} else if (Static649.aClass187_6 == arg3) {
			local22 = arg5 * 3;
			local24 = 4;
		} else if (arg3 == Static37.aClass187_5) {
			local22 = arg5 + 2;
			local24 = 6;
		} else if (Static582.aClass187_4 == arg3) {
			local22 = arg5 + 2;
			local24 = 5;
		} else {
			local22 = arg5;
			local24 = 0;
		}
		@Pc(84) Class86 local84 = arg4.method7348();
		@Pc(87) Class116_Sub1 local87 = (Class116_Sub1) arg4;
		local87.method5724();
		OpenGL.glDrawElements(local24, local22, Static244.method3872(local84), local87.method5728() + (long) (arg2 * local84.anInt1714));
	}

	@OriginalMember(owner = "client!tia", name = "l", descriptor = "(II)V")
	public synchronized void method8003(@OriginalArg(0) int arg0) {
		@Pc(15) Class5 local15 = new Class5();
		local15.aLong312 = (long) arg0;
		this.aClass20_58.method370(local15);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!fg;I)V")
	@Override
	public void method7969(@OriginalArg(0) Class112 arg0) {
		if (arg0 == Static461.aClass112_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(10) int local10 = Static288.method4583(arg0);
		OpenGL.glTexGeni(8192, 9472, local10);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local10);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local10);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!tia", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7955() {
		OpenGL.glScissor(super.anInt9247 + super.anInt9260, super.anInt9057 + super.anInt9244 + -super.anInt9253, -super.anInt9260 + super.anInt9251, super.anInt9253 + -super.anInt9245);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILclient!dn;Lclient!ua;)Z")
	@Override
	public boolean method7885(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class358 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tia", name = "v", descriptor = "(B)V")
	@Override
	protected void method7864() {
		@Pc(9) int local9 = this.anIntArray522[super.anInt9241];
		if (local9 != 0) {
			this.anIntArray522[super.anInt9241] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!tia", name = "y", descriptor = "(I)V")
	@Override
	protected void method7865() {
		Static654.aFloatArray78[0] = super.aFloat178 * super.aFloat175;
		Static654.aFloatArray78[3] = 1.0F;
		Static654.aFloatArray78[2] = super.aFloat177 * super.aFloat178;
		Static654.aFloatArray78[1] = super.aFloat178 * super.aFloat179;
		OpenGL.glLightModelfv(2899, Static654.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!tia", name = "V", descriptor = "(I)V")
	@Override
	protected void method7870() {
		if (super.aBoolean618) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!tia", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7914(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IZ)Lclient!lp;")
	@Override
	public Interface20 method7882(@OriginalArg(1) boolean arg0) {
		return new Class116_Sub1(this, Static104.aClass86_9, arg0);
	}

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "(II)Lclient!tq;")
	@Override
	public Interface26 method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "(II)Lclient!qba;")
	@Override
	protected Class48 method7966(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class48_Sub7(this, super.aClass126_262);
		} else if (arg0 == 4) {
			return new Class48_Sub4(this, super.aClass126_262, super.aClass24_7);
		} else if (arg0 == 8) {
			return new Class48_Sub1(this, super.aClass126_262, super.aClass24_7);
		} else {
			return super.method7966(arg0);
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!jj;III)V")
	@Override
	public void method7986(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) byte local23;
		@Pc(27) int local27;
		if (arg0 == Static664.aClass187_7) {
			local27 = arg2 * 2;
			local23 = 1;
		} else if (arg0 == Static262.aClass187_3) {
			local23 = 3;
			local27 = arg2 + 1;
		} else if (arg0 == Static649.aClass187_6) {
			local23 = 4;
			local27 = arg2 * 3;
		} else if (arg0 == Static37.aClass187_5) {
			local23 = 6;
			local27 = arg2 + 2;
		} else if (arg0 == Static582.aClass187_4) {
			local23 = 5;
			local27 = arg2 + 2;
		} else {
			local27 = arg2;
			local23 = 0;
		}
		OpenGL.glDrawArrays(local23, arg1, local27);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!lia;Lclient!lia;FLclient!lia;)Lclient!lia;")
	@Override
	public Class185 method8584(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class185 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tia", name = "K", descriptor = "(I)V")
	@Override
	protected void method7949() {
		OpenGL.glDepthMask(super.aBoolean624 && super.aBoolean621);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I[Lclient!gt;)Lclient!gaa;")
	@Override
	public Class124 method7981(@OriginalArg(1) Class139[] arg0) {
		return new Class124_Sub1(arg0);
	}

	@OriginalMember(owner = "client!tia", name = "n", descriptor = "(Z)V")
	@Override
	protected void method7867() {
		if (super.aBoolean625) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!tia", name = "H", descriptor = "(I)V")
	@Override
	protected void method7917() {
		if (super.aBoolean607 && super.aBoolean613 && super.anInt9255 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILclient!dn;IILclient!ua;)Lclient!ah;")
	@Override
	public Interface2 method7946(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class358 arg3) {
		if (this.aBoolean635 || Static197.method3300(arg0) && Static197.method3300(arg2)) {
			return new Class32_Sub2(this, arg3, arg1, arg0, arg2);
		} else if (this.aBoolean632) {
			return new Class32_Sub1(this, arg3, arg1, arg0, arg2);
		} else {
			return new Class32_Sub2(this, arg3, arg1, Static146.method2737(arg0), Static146.method2737(arg2));
		}
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(III)V")
	public synchronized void method8004(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub43 local15 = new Class5_Sub43(arg1);
		local15.aLong312 = (long) arg0;
		this.aClass20_54.method370(local15);
	}

	@OriginalMember(owner = "client!tia", name = "m", descriptor = "()Lclient!waa;")
	@Override
	public Class385 method8602() {
		@Pc(7) int local7 = -1;
		if (this.aString111.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString111.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString111.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class385(local7, "OpenGL", this.anInt9358, this.aString112, 0L);
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!tia", name = "w", descriptor = "(I)V")
	@Override
	protected void method7974() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray64, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tia", name = "x", descriptor = "()V")
	@Override
	public void method8654() {
	}

	@OriginalMember(owner = "client!tia", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9057 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt9359, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tia", name = "L", descriptor = "(I)V")
	@Override
	protected void method7942() {
		OpenGL.glViewport(super.anInt9247, super.anInt9244, super.anInt9118, super.anInt9057);
	}

	@OriginalMember(owner = "client!tia", name = "o", descriptor = "()Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!tia", name = "f", descriptor = "(B)V")
	@Override
	protected void method7880() {
		if (super.aBoolean610 && !super.aBoolean611) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}
}
