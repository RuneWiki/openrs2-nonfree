import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class45_Sub2_Sub2 extends Class45_Sub2 {

	@OriginalMember(owner = "client!mr", name = "ji", descriptor = "I")
	private int anInt5958;

	@OriginalMember(owner = "client!mr", name = "ki", descriptor = "J")
	private long aLong155;

	@OriginalMember(owner = "client!mr", name = "mi", descriptor = "Z")
	private boolean aBoolean430;

	@OriginalMember(owner = "client!mr", name = "ni", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!mr", name = "oi", descriptor = "Z")
	private boolean aBoolean432;

	@OriginalMember(owner = "client!mr", name = "pi", descriptor = "Z")
	private boolean aBoolean433;

	@OriginalMember(owner = "client!mr", name = "qi", descriptor = "Z")
	private boolean aBoolean434;

	@OriginalMember(owner = "client!mr", name = "th", descriptor = "Lclient!gk;")
	private final Class112 aClass112_40 = new Class112();

	@OriginalMember(owner = "client!mr", name = "Yh", descriptor = "Lclient!gk;")
	private final Class112 aClass112_41 = new Class112();

	@OriginalMember(owner = "client!mr", name = "di", descriptor = "Lclient!gk;")
	private final Class112 aClass112_42 = new Class112();

	@OriginalMember(owner = "client!mr", name = "fi", descriptor = "Lclient!gk;")
	private final Class112 aClass112_43 = new Class112();

	@OriginalMember(owner = "client!mr", name = "gi", descriptor = "Lclient!gk;")
	private final Class112 aClass112_44 = new Class112();

	@OriginalMember(owner = "client!mr", name = "hi", descriptor = "Lclient!gk;")
	private final Class112 aClass112_45 = new Class112();

	@OriginalMember(owner = "client!mr", name = "ii", descriptor = "Lclient!gk;")
	private final Class112 aClass112_46 = new Class112();

	@OriginalMember(owner = "client!mr", name = "ri", descriptor = "[Lclient!ls;")
	private final Class20_Sub2[] aClass20_Sub2Array1 = new Class20_Sub2[16];

	@OriginalMember(owner = "client!mr", name = "li", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!mr", name = "si", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!mr", name = "yi", descriptor = "I")
	private final int anInt5960 = 0;

	@OriginalMember(owner = "client!mr", name = "rh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!mr", name = "Ei", descriptor = "Ljava/lang/String;")
	private final String aString41;

	@OriginalMember(owner = "client!mr", name = "ui", descriptor = "Ljava/lang/String;")
	private final String aString40;

	@OriginalMember(owner = "client!mr", name = "vi", descriptor = "I")
	private final int anInt5959;

	@OriginalMember(owner = "client!mr", name = "zi", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!mr", name = "Di", descriptor = "Z")
	private boolean aBoolean440;

	@OriginalMember(owner = "client!mr", name = "ti", descriptor = "Z")
	private final boolean aBoolean435;

	@OriginalMember(owner = "client!mr", name = "wi", descriptor = "Z")
	public final boolean aBoolean436;

	@OriginalMember(owner = "client!mr", name = "Bi", descriptor = "Z")
	public final boolean aBoolean438;

	@OriginalMember(owner = "client!mr", name = "Ci", descriptor = "Z")
	public final boolean aBoolean439;

	@OriginalMember(owner = "client!mr", name = "xi", descriptor = "[I")
	public final int[] anIntArray319;

	@OriginalMember(owner = "client!mr", name = "Ai", descriptor = "I")
	public final int anInt5961;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!tf;I)V")
	public Class45_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) Class322 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString41 = OpenGL.glGetString(7936).toLowerCase();
			this.aString40 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString41.indexOf("microsoft") != -1 || this.aString41.indexOf("brian paul") != -1 || this.aString41.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static572.method7699(' ', local108.replace('.', ' '));
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(132) int local132;
			try {
				@Pc(126) int local126 = Static213.method6524(local116[0]);
				local132 = Static213.method6524(local116[1]);
				this.anInt5959 = local126 * 10 + local132;
			} catch (@Pc(142) NumberFormatException local142) {
				throw new RuntimeException("");
			}
			if (this.anInt5959 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(184) int[] local184 = new int[1];
				OpenGL.glGetIntegerv(34018, local184, 0);
				super.anInt5869 = local184[0];
				if (super.anInt5869 < 2) {
					throw new RuntimeException("");
				}
				super.anInt5852 = 8;
				this.aBoolean437 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean410 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean440 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean428 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean435 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean409 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean436 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean438 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean439 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray319 = new int[super.anInt5869];
				this.anInt5961 = Stream.c() ? 33639 : 5121;
				if (this.aString40.indexOf("radeon") != -1) {
					local132 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static572.method7699(' ', this.aString40.replace('/', ' '));
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static368.method5388(local308.substring(1, 3))) {
									local308 = local308.substring(1);
									local291 = true;
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local289 = true;
										local308 = local308.substring(2);
									}
									if (local308.length() >= 4 && Static368.method5388(local308.substring(0, 4))) {
										local132 = Static213.method6524(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(375) Exception local375) {
						}
					}
					if (!local291 && !local289) {
						if (local132 >= 7000 && local132 <= 9250) {
							super.aBoolean409 = false;
						}
						if (local132 >= 7000 && local132 <= 7999) {
							this.aBoolean437 = false;
						}
					}
					this.aBoolean440 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString41.indexOf("intel");
				if (this.aBoolean437) {
					try {
						@Pc(425) int[] local425 = new int[1];
						OpenGL.glGenBuffersARB(1, local425, 0);
					} catch (@Pc(431) Throwable local431) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(437) Throwable local437) {
			local437.printStackTrace();
			this.method7359();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIZLclient!bs;Lclient!mda;I)V")
	@Override
	public void method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class40 arg3, @OriginalArg(5) Interface13 arg4, @OriginalArg(6) int arg5) {
		@Pc(13) byte local13;
		@Pc(17) int local17;
		if (Static33.aClass40_3 == arg3) {
			local13 = 1;
			local17 = arg1 * 2;
		} else if (Static16.aClass40_1 == arg3) {
			local13 = 3;
			local17 = arg1 + 1;
		} else if (Static379.aClass40_9 == arg3) {
			local17 = arg1 * 3;
			local13 = 4;
		} else if (arg3 == Static24.aClass40_2) {
			local13 = 6;
			local17 = arg1 + 2;
		} else if (arg3 == Static263.aClass40_7) {
			local17 = arg1 + 2;
			local13 = 5;
		} else {
			local13 = 0;
			local17 = arg1;
		}
		@Pc(68) Class298 local68 = arg4.method6434();
		@Pc(77) Class20_Sub1 local77 = (Class20_Sub1) arg4;
		local77.method4584();
		OpenGL.glDrawElements(local13, local17, Static36.method583(local68), local77.method4583() + (long) (arg0 * local68.anInt7812));
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BII)V")
	public synchronized void method5031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub17 local16 = new Class3_Sub17(arg0);
		local16.aLong273 = arg1;
		this.aClass112_42.method3079(local16);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(ZB)V")
	@Override
	public void method4918(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I[Lclient!uaa;)Lclient!ada;")
	@Override
	public Class7 method5002(@OriginalArg(1) Class332[] arg0) {
		return new Class7_Sub1(arg0);
	}

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "(II)V")
	@Override
	public void method4944(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!su;II)V")
	@Override
	public void method4910(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		this.aClass20_Sub2Array1[arg1] = (Class20_Sub2) arg0;
	}

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt5786 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt5961, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!lj;Lclient!lj;FLclient!lj;)Lclient!lj;")
	@Override
	public Class12 method7381(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mr", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "(I)V")
	@Override
	protected void method4954() {
		OpenGL.glActiveTexture(super.anInt5855 + 33984);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
	@Override
	public void method7421(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)Lclient!su;")
	@Override
	public Interface19 method5009(@OriginalArg(0) boolean arg0) {
		return new Class20_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "(I)V")
	@Override
	protected void method4928() {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLclient!ada;)V")
	@Override
	public void method4957(@OriginalArg(1) Class7 arg0) {
		@Pc(9) Class332[] local9 = ((Class7_Sub1) arg0).aClass332Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local9.length; local23++) {
			@Pc(29) Class332 local29 = local9[local23];
			@Pc(34) Class20_Sub2 local34 = this.aClass20_Sub2Array1[local23];
			@Pc(36) int local36 = 0;
			@Pc(40) int local40 = local34.method4596();
			@Pc(44) long local44 = local34.method4583();
			local34.method4584();
			for (@Pc(49) int local49 = 0; local29.method6980() > local49; local49++) {
				@Pc(56) Class147 local56 = local29.method6976(local49);
				if (Static227.aClass147_1 == local56) {
					local21 = true;
					OpenGL.glVertexPointer(3, 5126, local40, (long) local36 + local44);
				} else if (local56 == Static227.aClass147_2) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local40, local44 + (long) local36);
				} else if (Static227.aClass147_3 == local56) {
					OpenGL.glColorPointer(4, 5121, local40, local44 + (long) local36);
					local13 = true;
				} else if (local56 == Static227.aClass147_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static227.aClass147_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local40, local44 + (long) local36);
				} else if (Static227.aClass147_6 == local56) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local40, (long) local36 + local44);
				} else if (local56 == Static227.aClass147_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local40, local44 + (long) local36);
				}
				local36 += local56.anInt3987;
			}
		}
		if (local21 != this.aBoolean433) {
			if (local21) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean433 = local21;
		}
		if (this.aBoolean432 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean432 = local15;
		}
		if (this.aBoolean430 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean430 = local13;
		}
		@Pc(274) int local274;
		if (local11 > this.anInt5958) {
			for (local274 = this.anInt5958; local274 < local11; local274++) {
				OpenGL.glClientActiveTexture(local274 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt5958 = local11;
		} else if (this.anInt5958 > local11) {
			for (local274 = local11; local274 < this.anInt5958; local274++) {
				OpenGL.glClientActiveTexture(local274 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt5958 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!rt;Lclient!sq;B)Z")
	@Override
	public boolean method5016(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class314 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "(I)F")
	@Override
	protected float method4922() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!mr", name = "Y", descriptor = "(I)V")
	@Override
	protected void method5012() {
		OpenGL.glMatrixMode(5890);
		if (Static11.aClass222_5 == super.aClass222Array3[super.anInt5855]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass11_Sub1Array3[super.anInt5855].method170(Static372.aFloatArray74), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBI[BILclient!sq;)Lclient!n;")
	@Override
	public Interface14 method4972(@OriginalArg(3) byte[] arg0, @OriginalArg(5) Class314 arg1) {
		return new Class73_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!mr", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4981(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!bs;IZI)V")
	@Override
	public void method4927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte local14;
		@Pc(18) int local18;
		if (Static33.aClass40_3 == arg0) {
			local14 = 1;
			local18 = arg2 * 2;
		} else if (Static16.aClass40_1 == arg0) {
			local18 = arg2 + 1;
			local14 = 3;
		} else if (arg0 == Static379.aClass40_9) {
			local14 = 4;
			local18 = arg2 * 3;
		} else if (Static24.aClass40_2 == arg0) {
			local14 = 6;
			local18 = arg2 + 2;
		} else if (Static263.aClass40_7 == arg0) {
			local14 = 5;
			local18 = arg2 + 2;
		} else {
			local18 = arg2;
			local14 = 0;
		}
		OpenGL.glDrawArrays(local14, arg1, local18);
	}

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4983() {
		OpenGL.glViewport(super.anInt5840, super.anInt5833, super.anInt5668, super.anInt5786);
	}

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "(I)V")
	@Override
	protected void method4956() {
		Static352.aFloatArray71[2] = (float) (super.anInt5835 & 0xFF) / 255.0F;
		Static352.aFloatArray71[3] = (float) (super.anInt5835 >>> 24) / 255.0F;
		Static352.aFloatArray71[0] = (float) (super.anInt5835 & 0xFF0000) / 1.671168E7F;
		Static352.aFloatArray71[1] = (float) (super.anInt5835 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static352.aFloatArray71, 0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4964(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!sq;IZII[F)Lclient!pm;")
	@Override
	protected Interface17 method4908(@OriginalArg(0) int arg0, @OriginalArg(2) Class314 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean435 || Static259.method3984(arg0) && Static259.method3984(arg3)) {
			return new Class73_Sub3(this, arg1, arg0, arg3, arg2, arg4, 0, 0);
		} else if (this.aBoolean440) {
			return new Class73_Sub4(this, arg1, arg0, arg3, arg4, 0, 0);
		} else {
			@Pc(58) Class73_Sub3 local58 = new Class73_Sub3(this, arg1, Static471.aClass298_19, Static371.method5424(arg0), Static371.method5424(arg3));
			local58.method4489(arg1, arg3, arg4, arg0);
			return local58;
		}
	}

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "(Z)V")
	@Override
	protected void method4990() {
		super.aFloat128 = super.anInt5861 - super.anInt5848;
		super.aFloat129 = (float) -super.anInt5837 + super.aFloat128;
		if (super.aFloat129 < (float) super.anInt5836) {
			super.aFloat129 = super.anInt5836;
		}
		OpenGL.glFogf(2915, super.aFloat129);
		OpenGL.glFogf(2916, super.aFloat128);
		Static352.aFloatArray71[2] = (float) (super.anInt5847 & 0xFF) / 255.0F;
		Static352.aFloatArray71[0] = (float) (super.anInt5847 & 0xFF0000) / 1.671168E7F;
		Static352.aFloatArray71[1] = (float) (super.anInt5847 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static352.aFloatArray71, 0);
	}

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "(I)V")
	@Override
	protected void method4941() {
		if (super.aBoolean413) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method5000(@OriginalArg(0) Canvas arg0) {
		@Pc(15) long local15 = this.anOpenGL1.prepareSurface(arg0);
		if (local15 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local15);
	}

	@OriginalMember(owner = "client!mr", name = "M", descriptor = "(I)V")
	@Override
	protected void method4987() {
		OpenGL.glTexEnvi(8960, 34162, Static142.method2757(super.aClass307Array6[super.anInt5855]));
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZIII[II)Lclient!pm;")
	@Override
	public Interface17 method4965(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean435 || Static259.method3984(arg3) && Static259.method3984(arg2)) {
			return new Class73_Sub3(this, arg3, arg2, arg0, arg4, 0, arg1);
		} else if (this.aBoolean440) {
			return new Class73_Sub4(this, arg3, arg2, arg4, 0, arg1);
		} else {
			@Pc(45) Class73_Sub3 local45 = new Class73_Sub3(this, Static469.aClass314_11, Static471.aClass298_15, Static371.method5424(arg3), Static371.method5424(arg2));
			local45.method6967(arg1, arg3, 0, arg4, arg2, 0);
			return local45;
		}
	}

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "(Z)V")
	@Override
	public void method4986() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray66, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "()V")
	@Override
	public void method7386() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5025(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "(B)V")
	private void method5034() {
		if (this.aBoolean434) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass242_6.method5734()) {
			if (!this.aBoolean431) {
				OpenGL.glLoadMatrixf(super.aClass11_Sub1_18.method170(Static372.aFloatArray74), 0);
				this.aBoolean431 = true;
				this.method4986();
				this.method4935();
			}
			if (super.aBoolean408) {
				this.aBoolean434 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass11_Sub1_15.method170(Static372.aFloatArray74), 0);
				this.aBoolean434 = true;
			}
		} else if (super.aBoolean408) {
			OpenGL.glLoadIdentity();
			this.aBoolean434 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass11_Sub1_15.method170(Static372.aFloatArray74), 0);
			this.aBoolean434 = false;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!gb;IIZ)V")
	@Override
	protected void method4923(@OriginalArg(0) Class108 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static329.method6551(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "(I)V")
	@Override
	protected void method4906() {
		if (super.aBoolean427) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "(I)V")
	@Override
	protected void method4935() {
		this.method4952();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt5839; local10++) {
			@Pc(17) Class3_Sub10 local17 = super.aClass3_Sub10Array4[local10];
			@Pc(21) int local21 = local17.method6020();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method6013() / 255.0F;
			Static352.aFloatArray71[0] = local17.method6021();
			Static352.aFloatArray71[1] = local17.method6011();
			Static352.aFloatArray71[2] = local17.method6015();
			Static352.aFloatArray71[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static352.aFloatArray71, 0);
			Static352.aFloatArray71[2] = local31 * (float) (local21 & 0xFF);
			Static352.aFloatArray71[3] = 1.0F;
			Static352.aFloatArray71[0] = (float) (local21 >> 16 & 0xFF) * local31;
			Static352.aFloatArray71[1] = local31 * (float) (local21 >> 8 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static352.aFloatArray71, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method6018() * local17.method6018()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt5863) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method4935();
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7410(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub17 local19;
		while (!this.aClass112_41.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_41.method3094();
			Static353.anIntArray337[local11++] = (int) local19.aLong273;
			super.anInt5831 -= local19.anInt3217;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static353.anIntArray337, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static353.anIntArray337, 0);
			local11 = 0;
		}
		while (!this.aClass112_42.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_42.method3094();
			Static353.anIntArray337[local11++] = (int) local19.aLong273;
			super.anInt5826 -= local19.anInt3217;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static353.anIntArray337, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static353.anIntArray337, 0);
			local11 = 0;
		}
		while (!this.aClass112_43.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_43.method3094();
			Static353.anIntArray337[local11++] = local19.anInt3217;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static353.anIntArray337, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static353.anIntArray337, 0);
			local11 = 0;
		}
		while (!this.aClass112_44.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_44.method3094();
			Static353.anIntArray337[local11++] = (int) local19.aLong273;
			super.anInt5829 -= local19.anInt3217;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static353.anIntArray337, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static353.anIntArray337, 0);
		}
		while (!this.aClass112_40.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_40.method3094();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt3217);
		}
		@Pc(208) Class3 local208;
		while (!this.aClass112_45.method3093()) {
			local208 = this.aClass112_45.method3094();
			OpenGL.glDeleteProgramARB((int) local208.aLong273);
		}
		while (!this.aClass112_46.method3093()) {
			local208 = this.aClass112_46.method3094();
			OpenGL.glDeleteObjectARB(local208.aLong273);
		}
		while (!this.aClass112_40.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_40.method3094();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt3217);
		}
		if (this.b() > 100663296 && this.aLong155 + 60000L < Static158.method2936()) {
			System.gc();
			this.aLong155 = Static158.method2936();
		}
		super.method7410(local9);
	}

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "(B)V")
	@Override
	protected void method5028() {
		this.aBoolean431 = false;
		this.method5034();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "(B)V")
	@Override
	protected void method4988() {
		if (super.aBoolean426 && super.aBoolean424 && super.anInt5837 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "()V")
	@Override
	public void method7368() {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "()V")
	@Override
	protected void method7359() {
		super.method7359();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "J", descriptor = "(I)V")
	@Override
	protected void method4980() {
		this.method5034();
	}

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "(B)V")
	@Override
	protected void method5027() {
		OpenGL.glDepthMask(super.aBoolean414 && super.aBoolean415);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7399(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7386();
	}

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "(I)V")
	@Override
	protected void method4949() {
		@Pc(9) int local9 = this.anIntArray319[super.anInt5855];
		if (local9 != 0) {
			this.anIntArray319[super.anInt5855] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([BIZIIILclient!sq;I)Lclient!pm;")
	@Override
	protected Interface17 method5021(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class314 arg4) {
		if (this.aBoolean435 || Static259.method3984(arg2) && Static259.method3984(arg3)) {
			return new Class73_Sub3(this, arg4, arg2, arg3, arg1, arg0, 0, 0);
		} else if (this.aBoolean440) {
			return new Class73_Sub4(this, arg4, arg2, arg3, arg0, 0, 0);
		} else {
			@Pc(35) Class73_Sub3 local35 = new Class73_Sub3(this, arg4, Static471.aClass298_15, Static371.method5424(arg2), Static371.method5424(arg3));
			local35.method6971(0, arg0, arg3, arg2, arg4);
			return local35;
		}
	}

	@OriginalMember(owner = "client!mr", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt5960;
	}

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "(II)V")
	public synchronized void method5035(@OriginalArg(0) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong273 = arg0;
		this.aClass112_45.method3079(local7);
	}

	@OriginalMember(owner = "client!mr", name = "X", descriptor = "(I)V")
	@Override
	protected void method5011() {
		OpenGL.glScissor(super.anInt5853 + super.anInt5840, -super.anInt5864 + super.anInt5833 + super.anInt5786, -super.anInt5853 + super.anInt5871, -super.anInt5854 + super.anInt5864);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7400(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)Lclient!nm;")
	@Override
	protected Class72 method4929(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class72_Sub5(this, super.aClass322_107);
		} else if (arg0 == 4) {
			return new Class72_Sub4(this, super.aClass322_107, super.aClass331_4);
		} else if (arg0 == 8) {
			return new Class72_Sub8(this, super.aClass322_107, super.aClass331_4);
		} else {
			return super.method4929(arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "(Z)V")
	@Override
	protected void method5020() {
		if (super.aBoolean423) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "(B)V")
	@Override
	protected void method4997() {
		if (super.aBoolean429) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIILclient!rt;Lclient!sq;)Lclient!pm;")
	@Override
	public Interface17 method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class298 arg2, @OriginalArg(4) Class314 arg3) {
		if (this.aBoolean435 || Static259.method3984(arg0) && Static259.method3984(arg1)) {
			return new Class73_Sub3(this, arg3, arg2, arg0, arg1);
		} else if (this.aBoolean440) {
			return new Class73_Sub4(this, arg3, arg2, arg0, arg1);
		} else {
			return new Class73_Sub3(this, arg3, arg2, Static371.method5424(arg0), Static371.method5424(arg1));
		}
	}

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "()V")
	@Override
	public void method7420() {
	}

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "(I)V")
	@Override
	protected void method4913() {
		Static352.aFloatArray71[2] = super.bf * super.aFloat134;
		Static352.aFloatArray71[1] = super.aFloat134 * super.aFloat123;
		Static352.aFloatArray71[3] = 1.0F;
		Static352.aFloatArray71[0] = super.aFloat134 * super.aFloat131;
		OpenGL.glLightModelfv(2899, Static352.aFloatArray71, 0);
	}

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "()Lclient!aj;")
	@Override
	public Class15 method7401() {
		@Pc(7) int local7 = -1;
		if (this.aString41.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString41.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString41.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class15(local7, "OpenGL", this.anInt5959, this.aString40, 0L);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ[[IB)Lclient!ica;")
	@Override
	public Interface6 method4991(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class73_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mr", name = "ab", descriptor = "(I)V")
	@Override
	protected void method5022() {
		if (super.aBoolean422 && !super.aBoolean416) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "(B)V")
	@Override
	protected void method4982() {
		OpenGL.glTexEnvi(8960, 34161, Static142.method2757(super.aClass307Array5[super.anInt5855]));
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(JI)V")
	public synchronized void method5036(@OriginalArg(0) long arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong273 = arg0;
		this.aClass112_46.method3079(local13);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)Lclient!mda;")
	@Override
	public Interface13 method4945(@OriginalArg(1) boolean arg0) {
		return new Class20_Sub1(this, Static471.aClass298_16, arg0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
	@Override
	protected void method4959(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZZZLclient!gb;)V")
	@Override
	public void method5010(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class108 arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static329.method6551(arg3));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
	public synchronized void method5038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class3_Sub17 local11 = new Class3_Sub17(arg0);
		local11.aLong273 = arg1;
		this.aClass112_41.method3079(local11);
	}

	@OriginalMember(owner = "client!mr", name = "T", descriptor = "(I)V")
	@Override
	protected void method5005() {
		if (super.aClass158_5 == Static538.aClass158_7) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass158_5 == Static536.aClass158_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static207.aClass158_4 == super.aClass158_5) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "()Z")
	@Override
	public boolean method7365() {
		return false;
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "()Z")
	@Override
	public boolean method7363() {
		return false;
	}

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "(I)V")
	@Override
	protected void method4933() {
		Static352.aFloatArray71[3] = 1.0F;
		Static352.aFloatArray71[1] = super.aFloat135 * super.aFloat123;
		Static352.aFloatArray71[0] = super.aFloat131 * super.aFloat135;
		Static352.aFloatArray71[2] = super.bf * super.aFloat135;
		OpenGL.glLightfv(16384, 4609, Static352.aFloatArray71, 0);
		Static352.aFloatArray71[1] = super.aFloat123 * -super.aFloat133;
		Static352.aFloatArray71[2] = super.bf * -super.aFloat133;
		Static352.aFloatArray71[0] = -super.aFloat133 * super.aFloat131;
		Static352.aFloatArray71[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static352.aFloatArray71, 0);
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4942() {
		if (super.aBoolean417) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "()V")
	@Override
	public void method7426() {
	}

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "()V")
	@Override
	public void method7432() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(Z)V")
	@Override
	protected void method4951() {
		for (@Pc(10) int local10 = super.anInt5869 - 1; local10 >= 0; local10--) {
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
			@Pc(87) int local87 = local80 + 16384;
			OpenGL.glLightfv(local87, 4608, local78, 0);
			OpenGL.glLightf(local87, 4615, 0.0F);
			OpenGL.glLightf(local87, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method4951();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!rt;Lclient!sq;)Z")
	@Override
	public boolean method4955(@OriginalArg(1) Class298 arg0, @OriginalArg(2) Class314 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!al;B)V")
	@Override
	public void method4919(@OriginalArg(0) Class17 arg0) {
		if (arg0 == Static109.aClass17_2) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static470.method6497(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "()V")
	@Override
	public void method7361() {
		if (super.anInt5668 <= 0 && super.anInt5786 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt5853;
		@Pc(19) int local19 = super.anInt5871;
		@Pc(22) int local22 = super.anInt5854;
		@Pc(25) int local25 = super.anInt5864;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4968();
		this.method4978(false);
		this.method4905(false);
		this.method4936(false);
		this.method4981(false);
		this.method4926(null);
		this.method4947(false, -2, false);
		this.method4939(1);
		this.method5019(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt5668, super.anInt5786, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "(Z)V")
	@Override
	protected void method4969() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray65, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}
}
