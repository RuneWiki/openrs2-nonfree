import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class15_Sub2_Sub1 extends Class15_Sub2 {

	@OriginalMember(owner = "client!ia", name = "ki", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!ia", name = "Qh", descriptor = "Lclient!ki;")
	private final Class183 aClass183_20 = new Class183();

	@OriginalMember(owner = "client!ia", name = "di", descriptor = "Lclient!ki;")
	private final Class183 aClass183_21 = new Class183();

	@OriginalMember(owner = "client!ia", name = "ei", descriptor = "Lclient!ki;")
	private final Class183 aClass183_22 = new Class183();

	@OriginalMember(owner = "client!ia", name = "fi", descriptor = "Lclient!ki;")
	private final Class183 aClass183_23 = new Class183();

	@OriginalMember(owner = "client!ia", name = "gi", descriptor = "Lclient!ki;")
	private final Class183 aClass183_24 = new Class183();

	@OriginalMember(owner = "client!ia", name = "hi", descriptor = "Lclient!ki;")
	private final Class183 aClass183_25 = new Class183();

	@OriginalMember(owner = "client!ia", name = "ii", descriptor = "Lclient!ki;")
	private final Class183 aClass183_26 = new Class183();

	@OriginalMember(owner = "client!ia", name = "ji", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!ia", name = "li", descriptor = "I")
	private final int anInt4274 = 0;

	@OriginalMember(owner = "client!ia", name = "ui", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!ia", name = "eh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ia", name = "ni", descriptor = "Ljava/lang/String;")
	private final String aString42;

	@OriginalMember(owner = "client!ia", name = "ti", descriptor = "Ljava/lang/String;")
	private final String aString43;

	@OriginalMember(owner = "client!ia", name = "oi", descriptor = "I")
	private final int anInt4276;

	@OriginalMember(owner = "client!ia", name = "qi", descriptor = "Z")
	public boolean aBoolean330;

	@OriginalMember(owner = "client!ia", name = "si", descriptor = "Z")
	private boolean aBoolean332;

	@OriginalMember(owner = "client!ia", name = "pi", descriptor = "Z")
	private final boolean aBoolean329;

	@OriginalMember(owner = "client!ia", name = "ri", descriptor = "Z")
	public final boolean aBoolean331;

	@OriginalMember(owner = "client!ia", name = "mi", descriptor = "I")
	public final int anInt4275;

	@OriginalMember(owner = "client!ia", name = "vi", descriptor = "[I")
	public final int[] anIntArray276;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!e;Lclient!pe;I)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class254 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString42 = OpenGL.glGetString(7936).toLowerCase();
			this.aString43 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString42.indexOf("microsoft") != -1 || this.aString42.indexOf("brian paul") != -1 || this.aString42.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(101) String local101 = OpenGL.glGetString(7938);
			@Pc(109) String[] local109 = Static335.method5785(' ', local101.replace('.', ' '));
			if (local109.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(132) int local132;
			try {
				@Pc(126) int local126 = Static403.method6559(local109[0]);
				local132 = Static403.method6559(local109[1]);
				this.anInt4276 = local132 + local126 * 10;
			} catch (@Pc(141) NumberFormatException local141) {
				throw new RuntimeException("");
			}
			if (this.anInt4276 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(178) int[] local178 = new int[1];
				OpenGL.glGetIntegerv(34018, local178, 0);
				super.anInt6518 = local178[0];
				if (super.anInt6518 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6538 = 8;
				this.aBoolean330 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean550 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean332 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean558 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean329 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean555 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean331 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anInt4275 = Stream.b() ? 33639 : 5121;
				if (this.aString43.indexOf("radeon") != -1) {
					local132 = 0;
					@Pc(274) boolean local274 = false;
					@Pc(276) boolean local276 = false;
					@Pc(285) String[] local285 = Static335.method5785(' ', this.aString43.replace('/', ' '));
					for (@Pc(287) int local287 = 0; local287 < local285.length; local287++) {
						@Pc(292) String local292 = local285[local287];
						try {
							if (local292.length() > 0) {
								if (local292.charAt(0) == 'x' && local292.length() >= 3 && Static256.method4564(local292.substring(1, 3))) {
									local276 = true;
									local292 = local292.substring(1);
								}
								if (local292.equals("hd")) {
									local274 = true;
								} else {
									if (local292.startsWith("hd")) {
										local292 = local292.substring(2);
										local274 = true;
									}
									if (local292.length() >= 4 && Static256.method4564(local292.substring(0, 4))) {
										local132 = Static403.method6559(local292.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(358) Exception local358) {
						}
					}
					if (!local276 && !local274) {
						if (local132 >= 7000 && local132 <= 7999) {
							this.aBoolean330 = false;
						}
						if (local132 >= 7000 && local132 <= 9250) {
							super.aBoolean555 = false;
						}
					}
					this.aBoolean332 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString42.indexOf("intel");
				if (this.aBoolean330) {
					try {
						@Pc(412) int[] local412 = new int[1];
						OpenGL.glGenBuffersARB(1, local412, 0);
					} catch (@Pc(418) Throwable local418) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray276 = new int[super.anInt6518];
				OpenGL.glClear(16640);
				this.anOpenGL1.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(437) Throwable local437) {
			local437.printStackTrace();
			this.method5305();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5406() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray51, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!cu;I)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1) {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZ[FILclient!pw;II)Lclient!qaa;")
	@Override
	protected Interface14 method5479(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) Class261 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean329 || Static282.method4863(arg0) && Static282.method4863(arg4)) {
			return new Class7_Sub3(this, arg3, arg0, arg4, arg1, arg2, 0, 0);
		} else if (this.aBoolean332) {
			return new Class7_Sub4(this, arg3, arg0, arg4, arg2, 0, 0);
		} else {
			@Pc(38) Class7_Sub3 local38 = new Class7_Sub3(this, arg3, Static302.aClass200_15, Static178.method3152(arg0), Static178.method3152(arg4));
			local38.method7344(arg4, arg0, arg3, arg2);
			return local38;
		}
	}

	@OriginalMember(owner = "client!ia", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6436 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt4275, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "(B)V")
	@Override
	protected void method5396() {
		this.method3629();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZZ)Lclient!cu;")
	@Override
	public Interface2 method5383(@OriginalArg(0) boolean arg0) {
		return new Class135_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "(I)V")
	@Override
	protected void method5453() {
		OpenGL.glTexEnvi(8960, 34161, Static182.method3228(super.aClass120Array5[super.anInt6523]));
	}

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "(I)V")
	@Override
	protected void method5402() {
		OpenGL.glTexEnvi(8960, 34162, Static182.method3228(super.aClass120Array6[super.anInt6523]));
	}

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method5368(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!bm;IIIILclient!ui;)V")
	@Override
	public void method5375(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface20 arg5) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (arg1 == Static300.aClass32_10) {
			local20 = arg3 * 2;
			local16 = 1;
		} else if (arg1 == Static358.aClass32_9) {
			local16 = 3;
			local20 = arg3 + 1;
		} else if (arg1 == Static18.aClass32_2) {
			local16 = 4;
			local20 = arg3 * 3;
		} else if (Static34.aClass32_3 == arg1) {
			local16 = 6;
			local20 = arg3 + 2;
		} else if (Static17.aClass32_7 == arg1) {
			local20 = arg3 + 2;
			local16 = 5;
		} else {
			local20 = arg3;
			local16 = 0;
		}
		@Pc(72) Class200 local72 = arg5.method6246();
		@Pc(75) Class135_Sub2 local75 = (Class135_Sub2) arg5;
		local75.method6238();
		OpenGL.glDrawElements(local16, local20, Static240.method4171(local72), local75.method6236() + (long) (local72.anInt6064 * arg2));
	}

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "(I)V")
	@Override
	protected void method5401() {
		Static397.aFloatArray66[2] = super.aFloat142 * super.aFloat126;
		Static397.aFloatArray66[0] = super.aFloat126 * super.aFloat131;
		Static397.aFloatArray66[1] = super.aFloat126 * super.aFloat143;
		Static397.aFloatArray66[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static397.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5455(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)V")
	@Override
	public void method5345(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ia", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return this.anInt4274;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(Z)V")
	@Override
	protected void method5473() {
		@Pc(16) int local16 = this.anIntArray276[super.anInt6523];
		if (local16 != 0) {
			this.anIntArray276[super.anInt6523] = 0;
			OpenGL.glBindTexture(local16, 0);
			OpenGL.glDisable(local16);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5412(@OriginalArg(1) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL1.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "(B)V")
	@Override
	protected void method5398() {
		if (super.aBoolean552) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(B)V")
	@Override
	protected void method5387() {
		OpenGL.glDepthMask(super.aBoolean546 && super.aBoolean556);
	}

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "()V")
	@Override
	public void method5303() {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)Lclient!wh;")
	@Override
	protected Class19 method5451(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class19_Sub6(this, super.aClass254_89);
		} else if (arg0 == 4) {
			return new Class19_Sub3(this, super.aClass254_89, super.aClass31_5);
		} else {
			return super.method5451(arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public synchronized void method3626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub48 local8 = new Class3_Sub48(arg1);
		local8.aLong262 = arg0;
		this.aClass183_21.method4792(local8);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!pw;Lclient!lj;)Z")
	@Override
	public boolean method5374(@OriginalArg(1) Class261 arg0, @OriginalArg(2) Class200 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "(I)V")
	@Override
	protected void method5468() {
		OpenGL.glActiveTexture(super.anInt6523 + 33984);
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "()V")
	@Override
	public void method5295() {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	@Override
	public void method5276() {
		if (super.anInt6395 <= 0 && super.anInt6436 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt6552;
		@Pc(22) int local22 = super.anInt6524;
		@Pc(25) int local25 = super.anInt6520;
		@Pc(28) int local28 = super.anInt6553;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5462();
		this.method5476(false);
		this.method5403(false);
		this.method5470(false);
		this.method5399(false);
		this.method5414(null);
		this.method5359(false, false, -2);
		this.method5372(1);
		this.method5460(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6395, super.anInt6436, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "(I)V")
	@Override
	protected void method5379() {
		if (super.aBoolean557) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	public synchronized void method3628(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub48 local14 = new Class3_Sub48(arg1);
		local14.aLong262 = arg0;
		this.aClass183_22.method4792(local14);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!ol;)V")
	@Override
	public void method5389(@OriginalArg(1) Class245 arg0) {
		if (Static533.aClass245_4 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(18) int local18 = Static330.method5722(arg0);
		OpenGL.glTexGeni(8192, 9472, local18);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local18);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local18);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(I)V")
	@Override
	public void method5365() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray56, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray48, 0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!bm;)V")
	@Override
	public void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class32 arg2) {
		@Pc(20) byte local20;
		@Pc(18) int local18;
		if (Static300.aClass32_10 == arg2) {
			local18 = arg1 * 2;
			local20 = 1;
		} else if (arg2 == Static358.aClass32_9) {
			local20 = 3;
			local18 = arg1 + 1;
		} else if (Static18.aClass32_2 == arg2) {
			local18 = arg1 * 3;
			local20 = 4;
		} else if (Static34.aClass32_3 == arg2) {
			local18 = arg1 + 2;
			local20 = 6;
		} else if (arg2 == Static17.aClass32_7) {
			local20 = 5;
			local18 = arg1 + 2;
		} else {
			local20 = 0;
			local18 = arg1;
		}
		OpenGL.glDrawArrays(local20, arg0, local18);
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(ZZ)Lclient!ui;")
	@Override
	public Interface20 method5489(@OriginalArg(0) boolean arg0) {
		return new Class135_Sub2(this, Static302.aClass200_12, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!hj;)V")
	@Override
	public void method5391(@OriginalArg(1) Class142 arg0) {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!kn;Lclient!kn;FLclient!kn;)Lclient!kn;")
	@Override
	public Class108 method5298(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class108 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()Lclient!og;")
	@Override
	public Class242 method5278() {
		@Pc(7) int local7 = -1;
		if (this.aString42.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString42.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString42.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class242(local7, "OpenGL", this.anInt4276, this.aString43, 0L);
	}

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "(I)V")
	@Override
	protected void method5459() {
		if (super.aBoolean545 && !super.aBoolean549) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
	@Override
	protected void method5371() {
		Static397.aFloatArray66[0] = (float) (super.anInt6546 & 0xFF0000) / 1.671168E7F;
		Static397.aFloatArray66[3] = (float) (super.anInt6546 >>> 24) / 255.0F;
		Static397.aFloatArray66[1] = (float) (super.anInt6546 & 0xFF00) / 65280.0F;
		Static397.aFloatArray66[2] = (float) (super.anInt6546 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static397.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!lj;Lclient!pw;)Lclient!qaa;")
	@Override
	public Interface14 method5472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) Class261 arg3) {
		if (this.aBoolean329 || Static282.method4863(arg1) && Static282.method4863(arg0)) {
			return new Class7_Sub3(this, arg3, arg2, arg1, arg0);
		} else if (this.aBoolean332) {
			return new Class7_Sub4(this, arg3, arg2, arg1, arg0);
		} else {
			return new Class7_Sub3(this, arg3, arg2, Static178.method3152(arg1), Static178.method3152(arg0));
		}
	}

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "(I)V")
	@Override
	protected void method5400() {
		if (super.aBoolean544) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "()V")
	@Override
	public void method5285() {
	}

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "(I)V")
	@Override
	protected void method5394() {
		if (super.aBoolean563) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(B)V")
	@Override
	protected void method5380() {
		if (super.aBoolean560) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "(I)V")
	@Override
	protected void method5449() {
		OpenGL.glScissor(super.anInt6535 + super.anInt6552, -super.anInt6553 + super.anInt6436 + super.anInt6554, super.anInt6524 - super.anInt6552, super.anInt6553 - super.anInt6520);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIZ[BLclient!pw;)Lclient!qaa;")
	@Override
	protected Interface14 method5440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class261 arg4) {
		if (this.aBoolean329 || Static282.method4863(arg1) && Static282.method4863(arg0)) {
			return new Class7_Sub3(this, arg4, arg1, arg0, arg2, arg3, 0, 0);
		} else if (this.aBoolean332) {
			return new Class7_Sub4(this, arg4, arg1, arg0, arg3, 0, 0);
		} else {
			@Pc(59) Class7_Sub3 local59 = new Class7_Sub3(this, arg4, Static302.aClass200_11, Static178.method3152(arg1), Static178.method3152(arg0));
			local59.method8241(arg0, arg4, arg1, arg3, 0);
			return local59;
		}
	}

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "(I)V")
	@Override
	protected void method5381() {
		OpenGL.glViewport(super.anInt6535, super.anInt6554, super.anInt6395, super.anInt6436);
	}

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "(I)V")
	private void method3629() {
		if (this.aBoolean333) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass82_5.method2320()) {
			if (!this.aBoolean333) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass255_Sub3_18.method8033(Static45.aFloatArray1), 0);
				this.method5365();
				this.method5441();
				this.aBoolean333 = true;
			}
			if (this.aBoolean333) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean543) {
				OpenGL.glMultMatrixf(super.aClass255_Sub3_15.method8033(Static45.aFloatArray1), 0);
			}
		} else if (super.aBoolean543) {
			OpenGL.glLoadIdentity();
			this.aBoolean333 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass255_Sub3_15.method8033(Static45.aFloatArray1), 0);
			this.aBoolean333 = false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(Z)V")
	@Override
	protected void method5446() {
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
	@Override
	protected void method5361() {
		this.method3629();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI[[IZ)Lclient!tda;")
	@Override
	public Interface18 method5463(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class7_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "()V")
	@Override
	public void method5342() {
		this.method5399(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!ej;ZII)V")
	@Override
	public void method5404(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static407.method6620(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(B)V")
	@Override
	protected void method5388() {
		if (super.aClass112_13 == Static116.aClass112_3) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static172.aClass112_19 == super.aClass112_13) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static558.aClass112_17 == super.aClass112_13) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "()V")
	@Override
	public void method5350() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V")
	@Override
	public void method5461(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "()Z")
	@Override
	public boolean method5325() {
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)V")
	@Override
	protected void method5358() {
		if (super.aBoolean562 && super.aBoolean548 && super.aBoolean547 | super.anInt6550 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[IIIIZI)Lclient!qaa;")
	@Override
	public Interface14 method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean329 || Static282.method4863(arg0) && Static282.method4863(arg5)) {
			return new Class7_Sub3(this, arg0, arg5, arg4, arg1, 0, arg3);
		} else if (this.aBoolean332) {
			return new Class7_Sub4(this, arg0, arg5, arg1, 0, arg3);
		} else {
			@Pc(48) Class7_Sub3 local48 = new Class7_Sub3(this, Static492.aClass261_14, Static302.aClass200_11, Static178.method3152(arg0), Static178.method3152(arg5));
			local48.method8237(arg1, 0, arg0, arg5, 0, arg3);
			return local48;
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(Z)V")
	@Override
	protected void method5405() {
		Static397.aFloatArray66[1] = super.aFloat143 * super.aFloat139;
		Static397.aFloatArray66[3] = 1.0F;
		Static397.aFloatArray66[0] = super.aFloat139 * super.aFloat131;
		Static397.aFloatArray66[2] = super.aFloat139 * super.aFloat142;
		OpenGL.glLightfv(16384, 4609, Static397.aFloatArray66, 0);
		Static397.aFloatArray66[0] = super.aFloat131 * -super.aFloat140;
		Static397.aFloatArray66[2] = -super.aFloat140 * super.aFloat142;
		Static397.aFloatArray66[3] = 1.0F;
		Static397.aFloatArray66[1] = super.aFloat143 * -super.aFloat140;
		OpenGL.glLightfv(16385, 4609, Static397.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(II)V")
	public synchronized void method3630(@OriginalArg(1) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong262 = arg0;
		this.aClass183_25.method4792(local7);
	}

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "()V")
	@Override
	public void method5355() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(Z)V")
	@Override
	protected void method5454() {
		@Pc(47) int local47;
		if (super.aBoolean547) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local47 = super.anInt6521;
		} else {
			super.aFloat141 = -super.anInt6534 + super.anInt6542;
			super.aFloat130 = (float) -super.anInt6550 + super.aFloat141;
			if (super.aFloat130 < (float) super.anInt6556) {
				super.aFloat130 = super.anInt6556;
			}
			OpenGL.glFogf(2915, super.aFloat130);
			OpenGL.glFogf(2916, super.aFloat141);
			local47 = super.anInt6548;
		}
		Static397.aFloatArray66[0] = (float) (local47 & 0xFF0000) / 1.671168E7F;
		Static397.aFloatArray66[2] = (float) (local47 & 0xFF) / 255.0F;
		Static397.aFloatArray66[1] = (float) (local47 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static397.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5464(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5338(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5355();
	}

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "(B)V")
	@Override
	protected void method5386() {
		for (@Pc(10) int local10 = super.anInt6518 - 1; local10 >= 0; local10--) {
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
		@Pc(74) float[] local74 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(76) int local76 = 0; local76 < 8; local76++) {
			@Pc(83) int local83 = local76 + 16384;
			OpenGL.glLightfv(local83, 4608, local74, 0);
			OpenGL.glLightf(local83, 4615, 0.0F);
			OpenGL.glLightf(local83, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method5386();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5393(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pw;BLclient!lj;)Z")
	@Override
	public boolean method5443(@OriginalArg(0) Class261 arg0, @OriginalArg(2) Class200 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5318(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub48 local19;
		while (!this.aClass183_21.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_21.method4797();
			Static6.anIntArray4[local11++] = (int) local19.aLong262;
			super.anInt6515 -= local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static6.anIntArray4, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static6.anIntArray4, 0);
			local11 = 0;
		}
		while (!this.aClass183_22.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_22.method4797();
			Static6.anIntArray4[local11++] = (int) local19.aLong262;
			super.anInt6517 -= local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static6.anIntArray4, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static6.anIntArray4, 0);
			local11 = 0;
		}
		while (!this.aClass183_23.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_23.method4797();
			Static6.anIntArray4[local11++] = local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static6.anIntArray4, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static6.anIntArray4, 0);
			local11 = 0;
		}
		while (!this.aClass183_24.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_24.method4797();
			Static6.anIntArray4[local11++] = (int) local19.aLong262;
			super.anInt6516 -= local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static6.anIntArray4, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static6.anIntArray4, 0);
		}
		while (!this.aClass183_20.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_20.method4797();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt9989);
		}
		@Pc(208) Class3 local208;
		while (!this.aClass183_25.method4798()) {
			local208 = this.aClass183_25.method4797();
			OpenGL.glDeleteProgramARB((int) local208.aLong262);
		}
		while (!this.aClass183_26.method4798()) {
			local208 = this.aClass183_26.method4797();
			OpenGL.glDeleteObjectARB(local208.aLong262);
		}
		while (!this.aClass183_20.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_20.method4797();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt9989);
		}
		if (this.v() > 100663296 && this.aLong119 + 60000L < Static376.method6088()) {
			System.gc();
			this.aLong119 = Static376.method6088();
		}
		super.method5318(local9);
	}

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "()V")
	@Override
	protected void method5305() {
		super.method5305();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "(I)V")
	@Override
	protected void method5437() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass359Array3[super.anInt6523] == Static21.aClass359_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass255_Sub3Array3[super.anInt6523].method8033(Static45.aFloatArray1), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BIILclient!pw;I)Lclient!aq;")
	@Override
	public Interface1 method5369(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class261 arg1) {
		return new Class7_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZZILclient!ej;)V")
	@Override
	protected void method5458(@OriginalArg(2) int arg0, @OriginalArg(3) Class85 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static407.method6620(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "(I)V")
	@Override
	protected void method5441() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt6522 > local7; local7++) {
			@Pc(14) Class3_Sub28 local14 = super.aClass3_Sub28Array5[local7];
			@Pc(20) int local20 = local14.method8153();
			@Pc(25) int local25 = local7 + 16386;
			@Pc(31) float local31 = local14.method8159() / 255.0F;
			Static397.aFloatArray66[0] = local14.method8156();
			Static397.aFloatArray66[1] = local14.method8155();
			Static397.aFloatArray66[2] = local14.method8158();
			Static397.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static397.aFloatArray66, 0);
			Static397.aFloatArray66[3] = 1.0F;
			Static397.aFloatArray66[0] = (float) (local20 >> 16 & 0xFF) * local31;
			Static397.aFloatArray66[1] = local31 * (float) (local20 >> 8 & 0xFF);
			Static397.aFloatArray66[2] = (float) (local20 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static397.aFloatArray66, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method8154() * local14.method8154()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt6551 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method5441();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[Lclient!ed;)Lclient!hj;")
	@Override
	public Class142 method5421(@OriginalArg(1) Class78[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "()Z")
	@Override
	public boolean method5314() {
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(Z)F")
	@Override
	protected float method5367() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method5302(@OriginalArg(0) Class37 arg0) {
	}
}
