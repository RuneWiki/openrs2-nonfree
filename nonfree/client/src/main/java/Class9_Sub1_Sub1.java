import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!ag", name = "ii", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!ag", name = "Uh", descriptor = "Lclient!bu;")
	private final Class38 aClass38_4 = new Class38();

	@OriginalMember(owner = "client!ag", name = "Xh", descriptor = "Lclient!bu;")
	private final Class38 aClass38_5 = new Class38();

	@OriginalMember(owner = "client!ag", name = "ai", descriptor = "Lclient!bu;")
	private final Class38 aClass38_6 = new Class38();

	@OriginalMember(owner = "client!ag", name = "ci", descriptor = "Lclient!bu;")
	private final Class38 aClass38_7 = new Class38();

	@OriginalMember(owner = "client!ag", name = "di", descriptor = "Lclient!bu;")
	private final Class38 aClass38_8 = new Class38();

	@OriginalMember(owner = "client!ag", name = "gi", descriptor = "Lclient!bu;")
	private final Class38 aClass38_9 = new Class38();

	@OriginalMember(owner = "client!ag", name = "hi", descriptor = "Lclient!bu;")
	private final Class38 aClass38_10 = new Class38();

	@OriginalMember(owner = "client!ag", name = "ji", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!ag", name = "ni", descriptor = "I")
	private final int anInt660 = 0;

	@OriginalMember(owner = "client!ag", name = "oi", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ag", name = "Ug", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ag", name = "pi", descriptor = "Ljava/lang/String;")
	private final String aString1;

	@OriginalMember(owner = "client!ag", name = "ri", descriptor = "Ljava/lang/String;")
	private final String aString2;

	@OriginalMember(owner = "client!ag", name = "ki", descriptor = "I")
	private final int anInt659;

	@OriginalMember(owner = "client!ag", name = "si", descriptor = "Z")
	public boolean aBoolean52;

	@OriginalMember(owner = "client!ag", name = "ti", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!ag", name = "li", descriptor = "Z")
	private final boolean aBoolean49;

	@OriginalMember(owner = "client!ag", name = "mi", descriptor = "Z")
	public final boolean aBoolean50;

	@OriginalMember(owner = "client!ag", name = "qi", descriptor = "I")
	public final int anInt661;

	@OriginalMember(owner = "client!ag", name = "ui", descriptor = "[I")
	public final int[] anIntArray25;

	static {
		new Class114("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!n;Lclient!kda;I)V")
	public Class9_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface8 arg3, @OriginalArg(4) Class160 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString1 = OpenGL.glGetString(7936).toLowerCase();
			this.aString2 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString1.indexOf("microsoft") != -1 || this.aString1.indexOf("brian paul") != -1 || this.aString1.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(100) String local100 = OpenGL.glGetString(7938);
			@Pc(108) String[] local108 = Static12.method678(' ', local100.replace('.', ' '));
			if (local108.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(131) int local131;
			try {
				@Pc(125) int local125 = Static485.method7022(local108[0]);
				local131 = Static485.method7022(local108[1]);
				this.anInt659 = local125 * 10 + local131;
			} catch (@Pc(141) NumberFormatException local141) {
				throw new RuntimeException("");
			}
			if (this.anInt659 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(178) int[] local178 = new int[1];
				OpenGL.glGetIntegerv(34018, local178, 0);
				super.anInt9203 = local178[0];
				if (super.anInt9203 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9204 = 8;
				this.aBoolean52 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean636 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean53 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean633 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean49 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean629 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean50 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anInt661 = Stream.c() ? 33639 : 5121;
				if (this.aString2.indexOf("radeon") != -1) {
					local131 = 0;
					@Pc(276) boolean local276 = false;
					@Pc(278) boolean local278 = false;
					@Pc(287) String[] local287 = Static12.method678(' ', this.aString2.replace('/', ' '));
					for (@Pc(289) int local289 = 0; local289 < local287.length; local289++) {
						@Pc(294) String local294 = local287[local289];
						try {
							if (local294.length() > 0) {
								if (local294.charAt(0) == 'x' && local294.length() >= 3 && Static138.method7942(local294.substring(1, 3))) {
									local294 = local294.substring(1);
									local278 = true;
								}
								if (local294.equals("hd")) {
									local276 = true;
								} else {
									if (local294.startsWith("hd")) {
										local276 = true;
										local294 = local294.substring(2);
									}
									if (local294.length() >= 4 && Static138.method7942(local294.substring(0, 4))) {
										local131 = Static485.method7022(local294.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(365) Exception local365) {
						}
					}
					if (!local278 && !local276) {
						if (local131 >= 7000 && local131 <= 9250) {
							super.aBoolean629 = false;
						}
						if (local131 >= 7000 && local131 <= 7999) {
							this.aBoolean52 = false;
						}
					}
					this.aBoolean53 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString1.indexOf("intel");
				if (this.aBoolean52) {
					try {
						@Pc(415) int[] local415 = new int[1];
						OpenGL.glGenBuffersARB(1, local415, 0);
					} catch (@Pc(421) Throwable local421) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray25 = new int[super.anInt9203];
				OpenGL.glClear(16640);
				this.anOpenGL1.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(440) Throwable local440) {
			local440.printStackTrace();
			this.method7566();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "(B)V")
	private void method676() {
		if (this.aBoolean51) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass123_7.method3505()) {
			if (!this.aBoolean51) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass22_Sub3_18.method5953(Static79.aFloatArray27), 0);
				this.method7682();
				this.method7741();
				this.aBoolean51 = true;
			}
			if (this.aBoolean51) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean623) {
				OpenGL.glMultMatrixf(super.aClass22_Sub3_15.method5953(Static79.aFloatArray27), 0);
				return;
			}
		} else if (super.aBoolean623) {
			OpenGL.glLoadIdentity();
			this.aBoolean51 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass22_Sub3_15.method5953(Static79.aFloatArray27), 0);
			this.aBoolean51 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[Lclient!wj;)Lclient!sk;")
	@Override
	public Class265 method7729(@OriginalArg(1) Class317[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)Lclient!af;")
	@Override
	public Interface1 method7718(@OriginalArg(0) boolean arg0) {
		return new Class150_Sub2(this, Static489.aClass289_14, arg0);
	}

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "(I)V")
	@Override
	protected void method7698() {
		OpenGL.glViewport(super.anInt9229, super.anInt9207, super.anInt9150, super.anInt9085);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!gf;III)V")
	@Override
	public void method7667(@OriginalArg(0) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) byte local23;
		@Pc(21) int local21;
		if (arg0 == Static335.aClass102_3) {
			local23 = 1;
			local21 = arg1 * 2;
		} else if (Static247.aClass102_2 == arg0) {
			local23 = 3;
			local21 = arg1 + 1;
		} else if (arg0 == Static29.aClass102_1) {
			local21 = arg1 * 3;
			local23 = 4;
		} else if (arg0 == Static531.aClass102_6) {
			local21 = arg1 + 2;
			local23 = 6;
		} else if (Static526.aClass102_5 == arg0) {
			local23 = 5;
			local21 = arg1 + 2;
		} else {
			local23 = 0;
			local21 = arg1;
		}
		OpenGL.glDrawArrays(local23, arg2, local21);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(IZ)V")
	public synchronized void method677(@OriginalArg(0) int arg0) {
		@Pc(12) Class1 local12 = new Class1();
		local12.aLong244 = arg0;
		this.aClass38_9.method1426(local12);
	}

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "()V")
	@Override
	public void method7619() {
	}

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "(I)V")
	@Override
	protected void method7741() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < super.anInt9222; local7++) {
			@Pc(14) Class1_Sub27 local14 = super.aClass1_Sub27Array6[local7];
			@Pc(18) int local18 = local14.method5488();
			@Pc(22) int local22 = local7 + 16386;
			@Pc(28) float local28 = local14.method5486() / 255.0F;
			Static164.aFloatArray33[0] = local14.method5493();
			Static164.aFloatArray33[1] = local14.method5487();
			Static164.aFloatArray33[2] = local14.method5495();
			Static164.aFloatArray33[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static164.aFloatArray33, 0);
			Static164.aFloatArray33[0] = (float) (local18 >> 16 & 0xFF) * local28;
			Static164.aFloatArray33[3] = 1.0F;
			Static164.aFloatArray33[1] = (float) (local18 >> 8 & 0xFF) * local28;
			Static164.aFloatArray33[2] = local28 * (float) (local18 & 0xFF);
			OpenGL.glLightfv(local22, 4609, Static164.aFloatArray33, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method5496() * local14.method5496()));
			OpenGL.glEnable(local22);
		}
		while (super.anInt9213 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method7741();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7567(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7637();
	}

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "(I)V")
	@Override
	protected void method7699() {
		if (super.aBoolean638) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method7725(@OriginalArg(0) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL1.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "(I)V")
	@Override
	protected void method7651() {
		if (super.aBoolean625 && !super.aBoolean640) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "(I)V")
	@Override
	protected void method7700() {
		this.method676();
	}

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "()V")
	@Override
	public void method7637() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method7613(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class1_Sub33 local19;
		while (!this.aClass38_5.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_5.method1423();
			Static323.anIntArray449[local7++] = (int) local19.aLong244;
			super.anInt9183 -= local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static323.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static323.anIntArray449, 0);
			local7 = 0;
		}
		while (!this.aClass38_6.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_6.method1423();
			Static323.anIntArray449[local7++] = (int) local19.aLong244;
			super.anInt9179 -= local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static323.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static323.anIntArray449, 0);
			local7 = 0;
		}
		while (!this.aClass38_7.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_7.method1423();
			Static323.anIntArray449[local7++] = local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static323.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static323.anIntArray449, 0);
			local7 = 0;
		}
		while (!this.aClass38_8.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_8.method1423();
			Static323.anIntArray449[local7++] = (int) local19.aLong244;
			super.anInt9175 -= local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static323.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static323.anIntArray449, 0);
		}
		while (!this.aClass38_4.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_4.method1423();
			OpenGL.glDeleteLists((int) local19.aLong244, local19.anInt6397);
		}
		@Pc(212) Class1 local212;
		while (!this.aClass38_9.method1414()) {
			local212 = this.aClass38_9.method1423();
			OpenGL.glDeleteProgramARB((int) local212.aLong244);
		}
		while (!this.aClass38_10.method1414()) {
			local212 = this.aClass38_10.method1423();
			OpenGL.glDeleteObjectARB(local212.aLong244);
		}
		while (!this.aClass38_4.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_4.method1423();
			OpenGL.glDeleteLists((int) local19.aLong244, local19.anInt6397);
		}
		if (this.U() > 100663296 && Static93.method2172() > this.aLong9 + 60000L) {
			System.gc();
			this.aLong9 = Static93.method2172();
		}
		super.method7613(local11);
	}

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "()V")
	@Override
	public void method7586() {
		if (super.anInt9150 <= 0 && super.anInt9085 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.bf;
		@Pc(22) int local22 = super.anInt9225;
		@Pc(25) int local25 = super.anInt9214;
		@Pc(28) int local28 = super.anInt9221;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7766();
		this.method7747(false);
		this.method7738(false);
		this.method7737(false);
		this.method7724(false);
		this.method7712(null);
		this.method7732(false, -2, false);
		this.method7778(1);
		this.method7730(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9150, super.anInt9085, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ag", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt660;
	}

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9085 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt661, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLclient!sk;)V")
	@Override
	public void method7664(@OriginalArg(1) Class265 arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "()V")
	@Override
	public void method7623() {
		this.method7724(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7742() {
		if (super.aBoolean643) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)V")
	@Override
	public void method7647(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!gf;IIIILclient!af;)V")
	@Override
	public void method7658(@OriginalArg(1) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface1 arg5) {
		@Pc(19) byte local19;
		@Pc(17) int local17;
		if (arg0 == Static335.aClass102_3) {
			local17 = arg4 * 2;
			local19 = 1;
		} else if (arg0 == Static247.aClass102_2) {
			local17 = arg4 + 1;
			local19 = 3;
		} else if (arg0 == Static29.aClass102_1) {
			local17 = arg4 * 3;
			local19 = 4;
		} else if (Static531.aClass102_6 == arg0) {
			local17 = arg4 + 2;
			local19 = 6;
		} else if (Static526.aClass102_5 == arg0) {
			local19 = 5;
			local17 = arg4 + 2;
		} else {
			local19 = 0;
			local17 = arg4;
		}
		@Pc(73) Class289 local73 = arg5.method7529();
		@Pc(76) Class150_Sub2 local76 = (Class150_Sub2) arg5;
		local76.method7524();
		OpenGL.glDrawElements(local19, local17, Static120.method2684(local73), local76.method7523() + (long) (arg2 * local73.anInt8371));
	}

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "(I)V")
	@Override
	protected void method7701() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray81, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "(I)V")
	@Override
	protected void method7671() {
		if (super.aBoolean634 && super.aBoolean631 && super.anInt9215 >= 0 | super.aBoolean626) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "(I)V")
	@Override
	protected void method7690() {
		Static164.aFloatArray33[2] = super.aFloat188 * super.aFloat192;
		Static164.aFloatArray33[3] = 1.0F;
		Static164.aFloatArray33[0] = super.aFloat200 * super.aFloat192;
		Static164.aFloatArray33[1] = super.aFloat192 * super.aFloat199;
		OpenGL.glLightfv(16384, 4609, Static164.aFloatArray33, 0);
		Static164.aFloatArray33[1] = -super.aFloat197 * super.aFloat199;
		Static164.aFloatArray33[0] = super.aFloat200 * -super.aFloat197;
		Static164.aFloatArray33[3] = 1.0F;
		Static164.aFloatArray33[2] = super.aFloat188 * -super.aFloat197;
		OpenGL.glLightfv(16385, 4609, Static164.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "(I)V")
	@Override
	protected void method7716() {
	}

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "()Z")
	@Override
	public boolean method7591() {
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "(I)V")
	@Override
	protected void method7708() {
		Static164.aFloatArray33[2] = (float) (super.anInt9228 & 0xFF) / 255.0F;
		Static164.aFloatArray33[3] = (float) (super.anInt9228 >>> 24) / 255.0F;
		Static164.aFloatArray33[0] = (float) (super.anInt9228 & 0xFF0000) / 1.671168E7F;
		Static164.aFloatArray33[1] = (float) (super.anInt9228 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static164.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "(I)V")
	@Override
	protected void method7687() {
		@Pc(46) int local46;
		if (super.aBoolean626) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local46 = super.anInt9218;
		} else {
			super.aFloat189 = -super.anInt9197 + super.anInt9198;
			super.aFloat184 = super.aFloat189 - (float) super.anInt9215;
			if (super.aFloat184 < (float) super.anInt9217) {
				super.aFloat184 = super.anInt9217;
			}
			OpenGL.glFogf(2915, super.aFloat184);
			OpenGL.glFogf(2916, super.aFloat189);
			local46 = super.anInt9212;
		}
		Static164.aFloatArray33[1] = (float) (local46 & 0xFF00) / 65280.0F;
		Static164.aFloatArray33[0] = (float) (local46 & 0xFF0000) / 1.671168E7F;
		Static164.aFloatArray33[2] = (float) (local46 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static164.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7689() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass171Array3[super.anInt9192] == Static259.aClass171_6) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass22_Sub3Array3[super.anInt9192].method5953(Static79.aFloatArray27), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "(I)V")
	@Override
	protected void method7745() {
		for (@Pc(10) int local10 = super.anInt9203 - 1; local10 >= 0; local10--) {
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
		this.anOpenGL1.setSwapInterval(0);
		super.method7745();
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(Z)V")
	@Override
	protected void method7650() {
		if (super.aBoolean632) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "()V")
	@Override
	public void method7602() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)Lclient!ql;")
	@Override
	public Interface15 method7707(@OriginalArg(0) boolean arg0) {
		return new Class150_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(II)Lclient!gl;")
	@Override
	protected Class17 method7728(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class17_Sub8(this, super.aClass160_104);
		} else if (arg0 == 4) {
			return new Class17_Sub2(this, super.aClass160_104, super.aClass155_6);
		} else {
			return super.method7728(arg0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7727() {
		Static164.aFloatArray33[3] = 1.0F;
		Static164.aFloatArray33[0] = super.aFloat200 * super.aFloat202;
		Static164.aFloatArray33[1] = super.aFloat199 * super.aFloat202;
		Static164.aFloatArray33[2] = super.aFloat202 * super.aFloat188;
		OpenGL.glLightModelfv(2899, Static164.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!qba;Lclient!qba;FLclient!qba;)Lclient!qba;")
	@Override
	public Class25 method7609(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ[[I)Lclient!wv;")
	@Override
	public Interface20 method7770(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
	@Override
	public void method7610(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "(I)V")
	@Override
	protected void method7763() {
		this.method676();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB[FIIZLclient!aq;)Lclient!jb;")
	@Override
	protected Interface5 method7655(@OriginalArg(3) float[] arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) Class16 arg4) {
		if (this.aBoolean49 || Static183.method3500(arg2) && Static183.method3500(arg1)) {
			return new Class135_Sub4(this, arg4, arg2, arg1, arg3, arg0, 0, 0);
		} else if (this.aBoolean53) {
			return new Class135_Sub1(this, arg4, arg2, arg1, arg0, 0, 0);
		} else {
			@Pc(42) Class135_Sub4 local42 = new Class135_Sub4(this, arg4, Static489.aClass289_17, Static117.method2662(arg2), Static117.method2662(arg1));
			local42.method7976(arg4, arg0, arg2, arg1);
			return local42;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7748(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "(B)V")
	@Override
	public void method7682() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray75, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7756(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([BLclient!aq;ZIIIIZ)Lclient!jb;")
	@Override
	protected Interface5 method7721(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean49 || Static183.method3500(arg4) && Static183.method3500(arg3)) {
			return new Class135_Sub4(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
		} else if (this.aBoolean53) {
			return new Class135_Sub1(this, arg1, arg4, arg3, arg0, 0, 0);
		} else {
			@Pc(62) Class135_Sub4 local62 = new Class135_Sub4(this, arg1, Static489.aClass289_13, Static117.method2662(arg4), Static117.method2662(arg3));
			local62.method7973(arg3, arg0, 0, arg1, arg4);
			return local62;
		}
	}

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "(B)V")
	@Override
	protected void method7734() {
		OpenGL.glTexEnvi(8960, 34161, Static17.method816(super.aClass295Array5[super.anInt9192]));
	}

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "(Z)V")
	@Override
	protected void method7761() {
		if (super.aBoolean630) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)F")
	@Override
	protected float method7660() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method7684(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIBZLclient!hm;)V")
	@Override
	public void method7692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class122 arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static419.method6229(arg3));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V")
	public synchronized void method679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		local8.aLong244 = arg1;
		this.aClass38_6.method1426(local8);
	}

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "(I)V")
	@Override
	protected void method7753() {
		@Pc(15) int local15 = this.anIntArray25[super.anInt9192];
		if (local15 != 0) {
			this.anIntArray25[super.anInt9192] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!aq;IIII[B)Lclient!vi;")
	@Override
	public Interface18 method7648(@OriginalArg(0) Class16 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class135_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ql;IB)V")
	@Override
	public void method7697(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	@Override
	protected void method7566() {
		super.method7566();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII[IZI)Lclient!jb;")
	@Override
	public Interface5 method7771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean49 || Static183.method3500(arg2) && Static183.method3500(arg0)) {
			return new Class135_Sub4(this, arg2, arg0, arg5, arg4, 0, arg3);
		} else if (this.aBoolean53) {
			return new Class135_Sub1(this, arg2, arg0, arg4, 0, arg3);
		} else {
			@Pc(48) Class135_Sub4 local48 = new Class135_Sub4(this, Static72.aClass16_3, Static489.aClass289_13, Static117.method2662(arg2), Static117.method2662(arg0));
			local48.method7968(arg0, 0, arg3, arg4, 0, arg2);
			return local48;
		}
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "()Z")
	@Override
	public boolean method7583() {
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "(B)V")
	@Override
	protected void method7709() {
		OpenGL.glTexEnvi(8960, 34162, Static17.method816(super.aClass295Array6[super.anInt9192]));
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()V")
	@Override
	public void method7570() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
	public synchronized void method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		local8.aLong244 = arg1;
		this.aClass38_5.method1426(local8);
	}

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "(I)V")
	@Override
	protected void method7767() {
		if (super.aClass196_7 == Static166.aClass196_3) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass196_7 == Static224.aClass196_4) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass196_7 == Static526.aClass196_6) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!ee;)V")
	@Override
	public void method7731(@OriginalArg(1) Class74 arg0) {
		if (arg0 == Static264.aClass74_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(21) int local21 = Static343.method5542(arg0);
		OpenGL.glTexGeni(8192, 9472, local21);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local21);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local21);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!ui;ILclient!aq;)Lclient!jb;")
	@Override
	public Interface5 method7775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class289 arg2, @OriginalArg(4) Class16 arg3) {
		if (this.aBoolean49 || Static183.method3500(arg1) && Static183.method3500(arg0)) {
			return new Class135_Sub4(this, arg3, arg2, arg1, arg0);
		} else if (this.aBoolean53) {
			return new Class135_Sub1(this, arg3, arg2, arg1, arg0);
		} else {
			return new Class135_Sub4(this, arg3, arg2, Static117.method2662(arg1), Static117.method2662(arg0));
		}
	}

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "(I)V")
	@Override
	protected void method7739() {
		OpenGL.glDepthMask(super.aBoolean641 && super.aBoolean637);
	}

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "()Lclient!cr;")
	@Override
	public Class49 method7626() {
		@Pc(7) int local7 = -1;
		if (this.aString1.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString1.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString1.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class49(local7, "OpenGL", this.anInt659, this.aString2, 0L);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZILclient!hm;)V")
	@Override
	protected void method7661(@OriginalArg(0) int arg0, @OriginalArg(3) Class122 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static419.method6229(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(B)V")
	@Override
	protected void method7673() {
		OpenGL.glScissor(super.bf + super.anInt9229, super.anInt9207 - -super.anInt9085 - super.anInt9221, super.anInt9225 - super.bf, super.anInt9221 - super.anInt9214);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!aq;Lclient!ui;)Z")
	@Override
	public boolean method7663(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class289 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(ZB)V")
	@Override
	public void method7653(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!ui;Lclient!aq;)Z")
	@Override
	public boolean method7713(@OriginalArg(1) Class289 arg0, @OriginalArg(2) Class16 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(B)V")
	@Override
	protected void method7672() {
		if (super.aBoolean627) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "(B)V")
	@Override
	protected void method7685() {
		OpenGL.glActiveTexture(super.anInt9192 + 33984);
	}
}
