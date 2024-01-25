import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class95_Sub1_Sub1 extends Class95_Sub1 {

	@OriginalMember(owner = "client!sha", name = "Fi", descriptor = "Z")
	private boolean aBoolean616;

	@OriginalMember(owner = "client!sha", name = "Gi", descriptor = "Z")
	private boolean aBoolean617;

	@OriginalMember(owner = "client!sha", name = "Hi", descriptor = "Z")
	private boolean aBoolean618;

	@OriginalMember(owner = "client!sha", name = "Ki", descriptor = "Z")
	private boolean aBoolean619;

	@OriginalMember(owner = "client!sha", name = "Li", descriptor = "I")
	private int anInt8943;

	@OriginalMember(owner = "client!sha", name = "Mi", descriptor = "Z")
	private boolean aBoolean620;

	@OriginalMember(owner = "client!sha", name = "Ni", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "client!sha", name = "Ch", descriptor = "Lclient!qw;")
	private final Class302 aClass302_55 = new Class302();

	@OriginalMember(owner = "client!sha", name = "ui", descriptor = "Lclient!qw;")
	private final Class302 aClass302_56 = new Class302();

	@OriginalMember(owner = "client!sha", name = "zi", descriptor = "Lclient!qw;")
	private final Class302 aClass302_57 = new Class302();

	@OriginalMember(owner = "client!sha", name = "Bi", descriptor = "Lclient!qw;")
	private final Class302 aClass302_58 = new Class302();

	@OriginalMember(owner = "client!sha", name = "Ci", descriptor = "Lclient!qw;")
	private final Class302 aClass302_59 = new Class302();

	@OriginalMember(owner = "client!sha", name = "Di", descriptor = "Lclient!qw;")
	private final Class302 aClass302_60 = new Class302();

	@OriginalMember(owner = "client!sha", name = "Ei", descriptor = "Lclient!qw;")
	private final Class302 aClass302_61 = new Class302();

	@OriginalMember(owner = "client!sha", name = "Ji", descriptor = "[Lclient!ni;")
	private final Class233_Sub1[] aClass233_Sub1Array1 = new Class233_Sub1[16];

	@OriginalMember(owner = "client!sha", name = "Ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!sha", name = "Oi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!sha", name = "Ti", descriptor = "I")
	private final int anInt8946 = 0;

	@OriginalMember(owner = "client!sha", name = "gi", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!sha", name = "Wi", descriptor = "Ljava/lang/String;")
	private final String aString101;

	@OriginalMember(owner = "client!sha", name = "Yi", descriptor = "Ljava/lang/String;")
	private final String aString102;

	@OriginalMember(owner = "client!sha", name = "Ri", descriptor = "I")
	private final int anInt8945;

	@OriginalMember(owner = "client!sha", name = "Pi", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!sha", name = "aj", descriptor = "Z")
	private boolean aBoolean626;

	@OriginalMember(owner = "client!sha", name = "Xi", descriptor = "Z")
	private final boolean aBoolean624;

	@OriginalMember(owner = "client!sha", name = "Zi", descriptor = "Z")
	public final boolean aBoolean625;

	@OriginalMember(owner = "client!sha", name = "Ui", descriptor = "Z")
	public final boolean aBoolean623;

	@OriginalMember(owner = "client!sha", name = "Si", descriptor = "Z")
	public final boolean aBoolean622;

	@OriginalMember(owner = "client!sha", name = "Vi", descriptor = "[I")
	public final int[] anIntArray476;

	@OriginalMember(owner = "client!sha", name = "Qi", descriptor = "I")
	public final int anInt8944;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!uq;I)V")
	public Class95_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class362 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString101 = OpenGL.glGetString(7936).toLowerCase();
			this.aString102 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString101.indexOf("microsoft") != -1 || this.aString101.indexOf("brian paul") != -1 || this.aString101.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(110) String local110 = OpenGL.glGetString(7938);
			@Pc(118) String[] local118 = Static120.method1814(local110.replace('.', ' '), ' ');
			if (local118.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(141) int local141;
			try {
				@Pc(135) int local135 = Static505.method6599(local118[0]);
				local141 = Static505.method6599(local118[1]);
				this.anInt8945 = local141 + local135 * 10;
			} catch (@Pc(150) NumberFormatException local150) {
				throw new RuntimeException("");
			}
			if (this.anInt8945 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(189) int[] local189 = new int[1];
				OpenGL.glGetIntegerv(34018, local189, 0);
				super.anInt10040 = local189[0];
				if (super.anInt10040 < 2) {
					throw new RuntimeException("");
				}
				super.anInt10039 = 8;
				this.aBoolean621 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean694 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean626 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean697 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean624 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean693 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean625 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean623 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean622 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray476 = new int[super.anInt10040];
				this.anInt8944 = Stream.b() ? 33639 : 5121;
				if (this.aString102.indexOf("radeon") != -1) {
					local141 = 0;
					@Pc(292) boolean local292 = false;
					@Pc(294) boolean local294 = false;
					@Pc(303) String[] local303 = Static120.method1814(this.aString102.replace('/', ' '), ' ');
					for (@Pc(305) int local305 = 0; local305 < local303.length; local305++) {
						@Pc(311) String local311 = local303[local305];
						try {
							if (local311.length() > 0) {
								if (local311.charAt(0) == 'x' && local311.length() >= 3 && Static346.method5030(local311.substring(1, 3))) {
									local294 = true;
									local311 = local311.substring(1);
								}
								if (local311.equals("hd")) {
									local292 = true;
								} else {
									if (local311.startsWith("hd")) {
										local311 = local311.substring(2);
										local292 = true;
									}
									if (local311.length() >= 4 && Static346.method5030(local311.substring(0, 4))) {
										local141 = Static505.method6599(local311.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(381) Exception local381) {
						}
					}
					if (!local294 && !local292) {
						if (local141 >= 7000 && local141 <= 7999) {
							this.aBoolean621 = false;
						}
						if (local141 >= 7000 && local141 <= 9250) {
							super.aBoolean693 = false;
						}
					}
					this.aBoolean626 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString101.indexOf("intel");
				if (this.aBoolean621) {
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
			this.method8007();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method8208(@OriginalArg(0) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL2.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZB)Lclient!ra;")
	@Override
	public Interface22 method8115(@OriginalArg(0) boolean arg0) {
		return new Class233_Sub2(this, Static666.aClass389_17, arg0);
	}

	@OriginalMember(owner = "client!sha", name = "m", descriptor = "(I)V")
	@Override
	protected void method8089() {
		OpenGL.glActiveTexture(super.anInt10026 + 33984);
	}

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "(B)V")
	@Override
	protected void method8105() {
		if (super.aBoolean690) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "(Z)V")
	@Override
	protected void method8132() {
		super.aFloat189 = (float) (-super.anInt10041 + super.anInt10035);
		super.aFloat195 = super.aFloat189 - (float) super.anInt10049;
		if ((float) super.anInt10050 > super.aFloat195) {
			super.aFloat195 = (float) super.anInt10050;
		}
		OpenGL.glFogf(2915, super.aFloat195);
		OpenGL.glFogf(2916, super.aFloat189);
		Static237.aFloatArray29[2] = (float) (super.anInt10029 & 0xFF) / 255.0F;
		Static237.aFloatArray29[0] = (float) (super.anInt10029 & 0xFF0000) / 1.671168E7F;
		Static237.aFloatArray29[1] = (float) (super.anInt10029 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static237.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!sha", name = "t", descriptor = "(B)V")
	@Override
	protected void method8191() {
		if (super.aBoolean689) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!sha", name = "o", descriptor = "()V")
	@Override
	public void method8019() {
		if (super.anInt9996 <= 0 && super.anInt9970 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt10033;
		@Pc(22) int local22 = super.anInt10062;
		@Pc(25) int local25 = super.anInt10028;
		@Pc(28) int local28 = super.anInt10053;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8116();
		this.method8099(false);
		this.method8163(false);
		this.method8154(false);
		this.method8095(false);
		this.method8147((Interface1) null);
		this.method8118(false, -2, false);
		this.method8129(1);
		this.method8162(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9996, super.anInt9970, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!sha", name = "l", descriptor = "()V")
	@Override
	protected void method8014() {
		super.method8014();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method8189(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(10) Long local10 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local10);
	}

	@OriginalMember(owner = "client!sha", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!sha", name = "n", descriptor = "(II)V")
	public synchronized void method7301(@OriginalArg(1) int arg0) {
		@Pc(12) Class3 local12 = new Class3();
		local12.aLong313 = (long) arg0;
		this.aClass302_60.method6613(local12);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZI[FIIILclient!g;)Lclient!fk;")
	@Override
	protected Interface8 method8085(@OriginalArg(1) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class122 arg4) {
		if (this.aBoolean624 || Static365.method5254(arg3) && Static365.method5254(arg2)) {
			return new Class111_Sub1(this, arg4, arg3, arg2, arg0, arg1, 0, 0);
		} else if (this.aBoolean626) {
			return new Class111_Sub3(this, arg4, arg3, arg2, arg1, 0, 0);
		} else {
			@Pc(35) Class111_Sub1 local35 = new Class111_Sub1(this, arg4, Static666.aClass389_20, Static585.method7772(arg3), Static585.method7772(arg2));
			local35.method2577(arg3, arg2, arg1, arg4);
			return local35;
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!sia;)V")
	@Override
	public void method8199(@OriginalArg(1) Class323 arg0) {
		if (Static253.aClass323_4 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(18) int local18 = Static272.method4017(arg0);
		OpenGL.glTexGeni(8192, 9472, local18);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local18);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local18);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)Lclient!rr;")
	@Override
	public Interface23 method7987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "(B)V")
	@Override
	protected void method8123() {
		@Pc(9) int local9 = this.anIntArray476[super.anInt10026];
		if (local9 != 0) {
			this.anIntArray476[super.anInt10026] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "(II)Lclient!io;")
	@Override
	public Interface12 method8030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sha", name = "n", descriptor = "(B)V")
	@Override
	protected void method8152() {
		if (super.aBoolean703) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8048(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8010(arg2, arg3);
	}

	@OriginalMember(owner = "client!sha", name = "u", descriptor = "(I)V")
	@Override
	protected void method8111() {
		this.method8144();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt10030 > local10; local10++) {
			@Pc(17) Class3_Sub13 local17 = super.aClass3_Sub13Array6[local10];
			@Pc(21) int local21 = local17.method5957();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method5961() / 255.0F;
			Static237.aFloatArray29[0] = (float) local17.method5958();
			Static237.aFloatArray29[1] = (float) local17.method5963();
			Static237.aFloatArray29[2] = (float) local17.method5960();
			Static237.aFloatArray29[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static237.aFloatArray29, 0);
			Static237.aFloatArray29[0] = local31 * (float) (local21 >> 16 & 0xFF);
			Static237.aFloatArray29[1] = (float) (local21 >> 8 & 0xFF) * local31;
			Static237.aFloatArray29[3] = 1.0F;
			Static237.aFloatArray29[2] = local31 * (float) (local21 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static237.aFloatArray29, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method5962() * local17.method5962()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt10051 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method8111();
	}

	@OriginalMember(owner = "client!sha", name = "D", descriptor = "(I)V")
	@Override
	protected void method8138() {
		OpenGL.glViewport(super.anInt10027, super.anInt10036, super.anInt9996, super.anInt9970);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!hg;)V")
	@Override
	public void method8072(@OriginalArg(0) Interface10 arg0) {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBI)V")
	public synchronized void method7302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub24 local16 = new Class3_Sub24(arg1);
		local16.aLong313 = (long) arg0;
		this.aClass302_57.method6613(local16);
	}

	@OriginalMember(owner = "client!sha", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt8946;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!cj;Lclient!cj;FLclient!cj;)Lclient!cj;")
	@Override
	public Class57 method8055(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIILclient!fga;ILclient!ra;)V")
	@Override
	public void method8109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class115 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface22 arg5) {
		@Pc(17) byte local17;
		@Pc(15) int local15;
		if (Static285.aClass115_3 == arg3) {
			local15 = arg0 * 2;
			local17 = 1;
		} else if (arg3 == Static506.aClass115_4) {
			local15 = arg0 + 1;
			local17 = 3;
		} else if (arg3 == Static649.aClass115_6) {
			local15 = arg0 * 3;
			local17 = 4;
		} else if (Static163.aClass115_2 == arg3) {
			local17 = 6;
			local15 = arg0 + 2;
		} else if (arg3 == Static160.aClass115_1) {
			local15 = arg0 + 2;
			local17 = 5;
		} else {
			local15 = arg0;
			local17 = 0;
		}
		@Pc(68) Class389 local68 = arg5.method7406();
		@Pc(71) Class233_Sub2 local71 = (Class233_Sub2) arg5;
		local71.method6254();
		OpenGL.glDrawElements(local17, local15, Static507.method6793(local68), local71.method6259() + (long) (local68.anInt10800 * arg1));
	}

	@OriginalMember(owner = "client!sha", name = "u", descriptor = "()V")
	@Override
	public void method8042() {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!wj;IBILclient!g;)Lclient!fk;")
	@Override
	public Interface8 method8084(@OriginalArg(0) Class389 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122 arg3) {
		if (this.aBoolean624 || Static365.method5254(arg2) && Static365.method5254(arg1)) {
			return new Class111_Sub1(this, arg3, arg0, arg2, arg1);
		} else if (this.aBoolean626) {
			return new Class111_Sub3(this, arg3, arg0, arg2, arg1);
		} else {
			return new Class111_Sub1(this, arg3, arg0, Static585.method7772(arg2), Static585.method7772(arg1));
		}
	}

	@OriginalMember(owner = "client!sha", name = "x", descriptor = "(B)V")
	@Override
	protected void method8203() {
		this.method7304();
	}

	@OriginalMember(owner = "client!sha", name = "eb", descriptor = "(I)V")
	@Override
	protected void method8204() {
		if (super.aBoolean691) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "(Z)V")
	@Override
	protected void method8114() {
		OpenGL.glScissor(super.anInt10033 + super.anInt10027, super.anInt10036 + (super.anInt9970 - super.anInt10053), -super.anInt10033 + super.anInt10062, -super.anInt10028 + super.anInt10053);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!g;III[B)Lclient!or;")
	@Override
	public Interface20 method8136(@OriginalArg(1) Class122 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class111_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!sha", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8095(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(III)V")
	public synchronized void method7303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub24 local14 = new Class3_Sub24(arg0);
		local14.aLong313 = (long) arg1;
		this.aClass302_56.method6613(local14);
	}

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "(B)V")
	@Override
	protected void method8117() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray63, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLclient!km;I)V")
	@Override
	public void method8133(@OriginalArg(1) Interface15 arg0, @OriginalArg(2) int arg1) {
		this.aClass233_Sub1Array1[arg1] = (Class233_Sub1) arg0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLclient!eda;)V")
	@Override
	public void method8166(@OriginalArg(1) Class94 arg0) {
		@Pc(9) Class306[] local9 = ((Class94_Sub1) arg0).aClass306Array1;
		@Pc(11) int local11 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local9.length; local23++) {
			@Pc(29) Class306 local29 = local9[local23];
			@Pc(34) Class233_Sub1 local34 = this.aClass233_Sub1Array1[local23];
			@Pc(36) int local36 = 0;
			@Pc(40) int local40 = local34.method5535();
			@Pc(44) long local44 = local34.method6259();
			local34.method6254();
			for (@Pc(49) int local49 = 0; local49 < local29.method6729(); local49++) {
				@Pc(56) Class356 local56 = local29.method6725(local49);
				if (local56 == Static610.aClass356_1) {
					OpenGL.glVertexPointer(3, 5126, local40, local44 + (long) local36);
					local21 = true;
				} else if (local56 == Static610.aClass356_2) {
					OpenGL.glNormalPointer(5126, local40, (long) local36 + local44);
					local19 = true;
				} else if (local56 == Static610.aClass356_3) {
					local17 = true;
					OpenGL.glColorPointer(4, 5121, local40, local44 + (long) local36);
				} else if (Static610.aClass356_4 == local56) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static610.aClass356_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local40, local44 + (long) local36);
				} else if (Static610.aClass356_6 == local56) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local40, (long) local36 + local44);
				} else if (local56 == Static610.aClass356_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local40, local44 + (long) local36);
				}
				local36 += local56.anInt10150;
			}
		}
		if (local21 != this.aBoolean618) {
			if (local21) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean618 = local21;
		}
		if (this.aBoolean616 != local19) {
			if (local19) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean616 = local19;
		}
		if (this.aBoolean619 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean619 = local17;
		}
		@Pc(257) int local257;
		if (local11 > this.anInt8943) {
			for (local257 = this.anInt8943; local257 < local11; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt8943 = local11;
		} else if (local11 < this.anInt8943) {
			for (local257 = local11; local257 < this.anInt8943; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt8943 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!sha", name = "cb", descriptor = "(I)V")
	@Override
	protected void method8192() {
		OpenGL.glMatrixMode(5890);
		if (Static70.aClass366_1 == super.aClass366Array3[super.anInt10026]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass17_Sub2Array3[super.anInt10026].method5840(Static218.aFloatArray25), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZIII[III)Lclient!fk;")
	@Override
	public Interface8 method8167(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean624 || Static365.method5254(arg3) && Static365.method5254(arg2)) {
			return new Class111_Sub1(this, arg3, arg2, arg0, arg4, 0, arg5);
		} else if (this.aBoolean626) {
			return new Class111_Sub3(this, arg3, arg2, arg4, 0, arg5);
		} else {
			@Pc(35) Class111_Sub1 local35 = new Class111_Sub1(this, Static21.aClass122_14, Static666.aClass389_16, Static585.method7772(arg3), Static585.method7772(arg2));
			local35.method7066(0, arg3, 0, arg5, arg4, arg2);
			return local35;
		}
	}

	@OriginalMember(owner = "client!sha", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9970 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt8944, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!sha", name = "A", descriptor = "()Lclient!dca;")
	@Override
	public Class72 method8064() {
		@Pc(7) int local7 = -1;
		if (this.aString101.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString101.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString101.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class72(local7, "OpenGL", this.anInt8945, this.aString102, 0L);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "([Lclient!rf;Z)Lclient!eda;")
	@Override
	public Class94 method8185(@OriginalArg(0) Class306[] arg0) {
		return new Class94_Sub1(arg0);
	}

	@OriginalMember(owner = "client!sha", name = "w", descriptor = "()V")
	@Override
	public void method8058() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!sha", name = "J", descriptor = "(I)V")
	private void method7304() {
		if (this.aBoolean620) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass393_11.method9020()) {
			if (!this.aBoolean617) {
				OpenGL.glLoadMatrixf(super.aClass17_Sub2_18.method5840(Static218.aFloatArray25), 0);
				this.aBoolean617 = true;
				this.method8159();
				this.method8111();
			}
			if (super.aBoolean682) {
				this.aBoolean620 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass17_Sub2_15.method5840(Static218.aFloatArray25), 0);
				this.aBoolean620 = true;
			}
		} else if (super.aBoolean682) {
			OpenGL.glLoadIdentity();
			this.aBoolean620 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass17_Sub2_15.method5840(Static218.aFloatArray25), 0);
			this.aBoolean620 = false;
		}
	}

	@OriginalMember(owner = "client!sha", name = "L", descriptor = "(I)V")
	@Override
	protected void method8156() {
		for (@Pc(14) int local14 = super.anInt10040 - 1; local14 >= 0; local14--) {
			OpenGL.glActiveTexture(local14 + 33984);
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
		super.method8156();
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!mq;ZI)V")
	@Override
	protected void method8077(@OriginalArg(1) Class235 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static568.method7474(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!sha", name = "u", descriptor = "(B)V")
	@Override
	protected void method8197() {
		if (super.aBoolean684) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "(Z)V")
	@Override
	protected void method8139() {
		OpenGL.glTexEnvi(8960, 34162, Static1.method8755(super.aClass112Array5[super.anInt10026]));
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(Z)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8094(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(B)V")
	@Override
	protected void method8093() {
		OpenGL.glDepthMask(super.aBoolean696 && super.aBoolean687);
	}

	@OriginalMember(owner = "client!sha", name = "A", descriptor = "(I)F")
	@Override
	protected float method8128() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BIILclient!fga;)V")
	@Override
	public void method8182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class115 arg2) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (Static285.aClass115_3 == arg2) {
			local16 = 1;
			local20 = arg1 * 2;
		} else if (Static506.aClass115_4 == arg2) {
			local16 = 3;
			local20 = arg1 + 1;
		} else if (Static649.aClass115_6 == arg2) {
			local16 = 4;
			local20 = arg1 * 3;
		} else if (arg2 == Static163.aClass115_2) {
			local20 = arg1 + 2;
			local16 = 6;
		} else if (arg2 == Static160.aClass115_1) {
			local20 = arg1 + 2;
			local16 = 5;
		} else {
			local20 = arg1;
			local16 = 0;
		}
		OpenGL.glDrawArrays(local16, arg0, local20);
	}

	@OriginalMember(owner = "client!sha", name = "O", descriptor = "(I)V")
	@Override
	protected void method8164() {
		Static237.aFloatArray29[2] = super.aFloat199 * super.aFloat192;
		Static237.aFloatArray29[0] = super.aFloat193 * super.aFloat199;
		Static237.aFloatArray29[3] = 1.0F;
		Static237.aFloatArray29[1] = super.aFloat200 * super.aFloat199;
		OpenGL.glLightModelfv(2899, Static237.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!sha", name = "k", descriptor = "(B)V")
	@Override
	protected void method8130() {
		Static237.aFloatArray29[1] = super.aFloat203 * super.aFloat200;
		Static237.aFloatArray29[3] = 1.0F;
		Static237.aFloatArray29[2] = super.aFloat192 * super.aFloat203;
		Static237.aFloatArray29[0] = super.aFloat203 * super.aFloat193;
		OpenGL.glLightfv(16384, 4609, Static237.aFloatArray29, 0);
		Static237.aFloatArray29[0] = super.aFloat193 * -super.aFloat191;
		Static237.aFloatArray29[2] = -super.aFloat191 * super.aFloat192;
		Static237.aFloatArray29[3] = 1.0F;
		Static237.aFloatArray29[1] = super.aFloat200 * -super.aFloat191;
		OpenGL.glLightfv(16385, 4609, Static237.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!sha", name = "v", descriptor = "(I)V")
	@Override
	protected void method8113() {
		if (super.aClass147_7 == Static343.aClass147_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static159.aClass147_2 == super.aClass147_7) {
			OpenGL.glBlendFunc(1, 1);
			return;
		} else if (Static554.aClass147_6 == super.aClass147_7) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)Lclient!km;")
	@Override
	public Interface15 method8090(@OriginalArg(1) boolean arg0) {
		return new Class233_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!sha", name = "t", descriptor = "()V")
	@Override
	public void method8039() {
	}

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8056(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub24 local19;
		while (!this.aClass302_56.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_56.method6611();
			Static603.anIntArray536[local11++] = (int) local19.aLong313;
			super.anInt10019 -= local19.anInt3846;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static603.anIntArray536, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static603.anIntArray536, 0);
			local11 = 0;
		}
		while (!this.aClass302_57.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_57.method6611();
			Static603.anIntArray536[local11++] = (int) local19.aLong313;
			super.anInt10020 -= local19.anInt3846;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static603.anIntArray536, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static603.anIntArray536, 0);
			local11 = 0;
		}
		while (!this.aClass302_58.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_58.method6611();
			Static603.anIntArray536[local11++] = local19.anInt3846;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static603.anIntArray536, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static603.anIntArray536, 0);
			local11 = 0;
		}
		while (!this.aClass302_59.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_59.method6611();
			Static603.anIntArray536[local11++] = (int) local19.aLong313;
			super.anInt10016 -= local19.anInt3846;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static603.anIntArray536, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static603.anIntArray536, 0);
		}
		while (!this.aClass302_55.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_55.method6611();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt3846);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass302_60.method6612()) {
			local215 = this.aClass302_60.method6611();
			OpenGL.glDeleteProgramARB((int) local215.aLong313);
		}
		while (!this.aClass302_61.method6612()) {
			local215 = this.aClass302_61.method6611();
			OpenGL.glDeleteObjectARB(local215.aLong313);
		}
		while (!this.aClass302_55.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_55.method6611();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt3846);
		}
		if (this.E() > 100663296 && this.aLong247 + 60000L < Static15.method380()) {
			System.gc();
			this.aLong247 = Static15.method380();
		}
		super.method8056(local9);
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(II)V")
	@Override
	public void method8010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLclient!wj;Lclient!g;)Z")
	@Override
	public boolean method8151(@OriginalArg(1) Class389 arg0, @OriginalArg(2) Class122 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!io;Lclient!rr;)Lclient!hg;")
	@Override
	public Interface10 method8004(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sha", name = "fb", descriptor = "(I)V")
	@Override
	protected void method8207() {
		Static237.aFloatArray29[2] = (float) (super.anInt10046 & 0xFF) / 255.0F;
		Static237.aFloatArray29[0] = (float) (super.anInt10046 & 0xFF0000) / 1.671168E7F;
		Static237.aFloatArray29[1] = (float) (super.anInt10046 & 0xFF00) / 65280.0F;
		Static237.aFloatArray29[3] = (float) (super.anInt10046 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static237.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!sha", name = "S", descriptor = "(I)V")
	@Override
	protected void method8175() {
		if (super.aBoolean685 && super.aBoolean695 && super.anInt10049 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I[[IZB)Lclient!faa;")
	@Override
	public Interface7 method8194(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2) {
		return new Class111_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BJ)V")
	public synchronized void method7306(@OriginalArg(1) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong313 = arg0;
		this.aClass302_61.method6613(local7);
	}

	@OriginalMember(owner = "client!sha", name = "r", descriptor = "(B)V")
	@Override
	protected void method8188() {
		if (super.aBoolean699 && !super.aBoolean688) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!sha", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLclient!g;Lclient!wj;)Z")
	@Override
	public boolean method8206(@OriginalArg(1) Class122 arg0, @OriginalArg(2) Class389 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!sha", name = "v", descriptor = "()V")
	@Override
	public void method8052() {
	}

	@OriginalMember(owner = "client!sha", name = "V", descriptor = "(I)V")
	@Override
	protected void method8179() {
		OpenGL.glTexEnvi(8960, 34161, Static1.method8755(super.aClass112Array6[super.anInt10026]));
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(BZ)V")
	@Override
	public void method8169(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!sha", name = "o", descriptor = "(B)V")
	@Override
	public void method8159() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray64, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZLclient!mq;ZI)V")
	@Override
	public void method8101(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static568.method7474(arg2));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method8107(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local14);
	}

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "()Z")
	@Override
	public boolean method8011() {
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sha", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8126() {
	}

	@OriginalMember(owner = "client!sha", name = "m", descriptor = "(II)Lclient!ev;")
	@Override
	protected Class4 method8209(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class4_Sub2(this, super.aClass362_142);
		} else if (arg0 == 4) {
			return new Class4_Sub3(this, super.aClass362_142, super.aClass123_8);
		} else if (arg0 == 8) {
			return new Class4_Sub10(this, super.aClass362_142, super.aClass123_8);
		} else {
			return super.method8209(arg0);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!g;[BIIIIZ)Lclient!fk;")
	@Override
	protected Interface8 method8171(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean624 || Static365.method5254(arg3) && Static365.method5254(arg0)) {
			return new Class111_Sub1(this, arg1, arg3, arg0, arg4, arg2, 0, 0);
		} else if (this.aBoolean626) {
			return new Class111_Sub3(this, arg1, arg3, arg0, arg2, 0, 0);
		} else {
			@Pc(38) Class111_Sub1 local38 = new Class111_Sub1(this, arg1, Static666.aClass389_16, Static585.method7772(arg3), Static585.method7772(arg0));
			local38.method7069(0, arg0, arg2, arg1, arg3);
			return local38;
		}
	}

	@OriginalMember(owner = "client!sha", name = "s", descriptor = "()Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "p", descriptor = "(B)V")
	@Override
	protected void method8165() {
		this.aBoolean617 = false;
		this.method7304();
	}

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "(II)V")
	@Override
	public void method8146(@OriginalArg(0) int arg0) {
	}
}
