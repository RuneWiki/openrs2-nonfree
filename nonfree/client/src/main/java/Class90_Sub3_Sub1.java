import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class90_Sub3_Sub1 extends Class90_Sub3 {

	@OriginalMember(owner = "client!mc", name = "fi", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!mc", name = "Yg", descriptor = "Lclient!su;")
	private final Class298 aClass298_116 = new Class298();

	@OriginalMember(owner = "client!mc", name = "Yh", descriptor = "Lclient!su;")
	private final Class298 aClass298_117 = new Class298();

	@OriginalMember(owner = "client!mc", name = "Zh", descriptor = "Lclient!su;")
	private final Class298 aClass298_118 = new Class298();

	@OriginalMember(owner = "client!mc", name = "ai", descriptor = "Lclient!su;")
	private final Class298 aClass298_119 = new Class298();

	@OriginalMember(owner = "client!mc", name = "bi", descriptor = "Lclient!su;")
	private final Class298 aClass298_120 = new Class298();

	@OriginalMember(owner = "client!mc", name = "ci", descriptor = "Lclient!su;")
	private final Class298 aClass298_121 = new Class298();

	@OriginalMember(owner = "client!mc", name = "di", descriptor = "Lclient!su;")
	private final Class298 aClass298_122 = new Class298();

	@OriginalMember(owner = "client!mc", name = "ei", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!mc", name = "ii", descriptor = "I")
	private final int anInt6026 = 0;

	@OriginalMember(owner = "client!mc", name = "ji", descriptor = "Z")
	private boolean aBoolean431 = false;

	@OriginalMember(owner = "client!mc", name = "Fh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!mc", name = "hi", descriptor = "Ljava/lang/String;")
	private final String aString48;

	@OriginalMember(owner = "client!mc", name = "ki", descriptor = "Ljava/lang/String;")
	private final String aString49;

	@OriginalMember(owner = "client!mc", name = "mi", descriptor = "I")
	private final int anInt6028;

	@OriginalMember(owner = "client!mc", name = "ni", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!mc", name = "oi", descriptor = "Z")
	private boolean aBoolean433;

	@OriginalMember(owner = "client!mc", name = "qi", descriptor = "Z")
	private final boolean aBoolean434;

	@OriginalMember(owner = "client!mc", name = "gi", descriptor = "Z")
	public final boolean aBoolean430;

	@OriginalMember(owner = "client!mc", name = "li", descriptor = "I")
	public final int anInt6027;

	@OriginalMember(owner = "client!mc", name = "pi", descriptor = "[I")
	public final int[] anIntArray435;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!e;Lclient!pj;I)V")
	public Class90_Sub3_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class248 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString48 = OpenGL.glGetString(7936).toLowerCase();
			this.aString49 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString48.indexOf("microsoft") != -1 || this.aString48.indexOf("brian paul") != -1 || this.aString48.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(102) String local102 = OpenGL.glGetString(7938);
			@Pc(110) String[] local110 = Static395.method5728(local102.replace('.', ' '), ' ');
			if (local110.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(131) int local131;
			try {
				@Pc(125) int local125 = Static443.method6265(local110[0]);
				local131 = Static443.method6265(local110[1]);
				this.anInt6028 = local131 + local125 * 10;
			} catch (@Pc(140) NumberFormatException local140) {
				throw new RuntimeException("");
			}
			if (this.anInt6028 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(177) int[] local177 = new int[1];
				OpenGL.glGetIntegerv(34018, local177, 0);
				super.anInt9580 = local177[0];
				if (super.anInt9580 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9582 = 8;
				this.aBoolean432 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean636 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean433 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean638 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean434 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean640 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean430 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anInt6027 = Stream.a() ? 33639 : 5121;
				if (this.aString49.indexOf("radeon") != -1) {
					local131 = 0;
					@Pc(273) boolean local273 = false;
					@Pc(275) boolean local275 = false;
					@Pc(284) String[] local284 = Static395.method5728(this.aString49.replace('/', ' '), ' ');
					for (@Pc(286) int local286 = 0; local286 < local284.length; local286++) {
						@Pc(292) String local292 = local284[local286];
						try {
							if (local292.length() > 0) {
								if (local292.charAt(0) == 'x' && local292.length() >= 3 && Static166.method3816(local292.substring(1, 3))) {
									local292 = local292.substring(1);
									local275 = true;
								}
								if (local292.equals("hd")) {
									local273 = true;
								} else {
									if (local292.startsWith("hd")) {
										local292 = local292.substring(2);
										local273 = true;
									}
									if (local292.length() >= 4 && Static166.method3816(local292.substring(0, 4))) {
										local131 = Static443.method6265(local292.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(357) Exception local357) {
						}
					}
					if (!local275 && !local273) {
						if (local131 >= 7000 && local131 <= 7999) {
							this.aBoolean432 = false;
						}
						if (local131 >= 7000 && local131 <= 9250) {
							super.aBoolean640 = false;
						}
					}
					this.aBoolean433 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString48.indexOf("intel");
				if (this.aBoolean432) {
					try {
						@Pc(413) int[] local413 = new int[1];
						OpenGL.glGenBuffersARB(1, local413, 0);
					} catch (@Pc(419) Throwable local419) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray435 = new int[super.anInt9580];
				OpenGL.glClear(16640);
				this.anOpenGL2.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(438) Throwable local438) {
			local438.printStackTrace();
			this.method7525();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(ZI)V")
	@Override
	public void method7599(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "()V")
	@Override
	protected void method7525() {
		super.method7525();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Z)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "(I)V")
	@Override
	protected void method7587() {
		OpenGL.glTexEnvi(8960, 34162, Static286.method4358(super.bf[super.anInt9579]));
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7486(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub14 local19;
		while (!this.aClass298_117.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_117.method6811();
			Static544.anIntArray511[local7++] = (int) local19.aLong245;
			super.anInt9533 -= local19.anInt2188;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static544.anIntArray511, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static544.anIntArray511, 0);
			local7 = 0;
		}
		while (!this.aClass298_118.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_118.method6811();
			Static544.anIntArray511[local7++] = (int) local19.aLong245;
			super.anInt9532 -= local19.anInt2188;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static544.anIntArray511, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static544.anIntArray511, 0);
			local7 = 0;
		}
		while (!this.aClass298_119.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_119.method6811();
			Static544.anIntArray511[local7++] = local19.anInt2188;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static544.anIntArray511, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static544.anIntArray511, 0);
			local7 = 0;
		}
		while (!this.aClass298_120.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_120.method6811();
			Static544.anIntArray511[local7++] = (int) local19.aLong245;
			super.anInt9544 -= local19.anInt2188;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static544.anIntArray511, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static544.anIntArray511, 0);
		}
		while (!this.aClass298_116.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_116.method6811();
			OpenGL.glDeleteLists((int) local19.aLong245, local19.anInt2188);
		}
		@Pc(215) Class6 local215;
		while (!this.aClass298_121.method6813()) {
			local215 = this.aClass298_121.method6811();
			OpenGL.glDeleteProgramARB((int) local215.aLong245);
		}
		while (!this.aClass298_122.method6813()) {
			local215 = this.aClass298_122.method6811();
			OpenGL.glDeleteObjectARB(local215.aLong245);
		}
		while (!this.aClass298_116.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_116.method6811();
			OpenGL.glDeleteLists((int) local19.aLong245, local19.anInt2188);
		}
		if (this.v() > 100663296 && this.aLong140 + 60000L < Static416.method5922()) {
			System.gc();
			this.aLong140 = Static416.method5922();
		}
		super.method7486(local11);
	}

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "(I)V")
	@Override
	protected void method7552() {
		Static375.aFloatArray79[0] = (float) (super.anInt9581 & 0xFF0000) / 1.671168E7F;
		Static375.aFloatArray79[3] = (float) (super.anInt9581 >>> 24) / 255.0F;
		Static375.aFloatArray79[2] = (float) (super.anInt9581 & 0xFF) / 255.0F;
		Static375.aFloatArray79[1] = (float) (super.anInt9581 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static375.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	@Override
	public void method7662(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "()V")
	@Override
	public void method7514() {
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(B)V")
	@Override
	protected void method7625() {
		this.method4890();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILclient!jn;Lclient!uj;I)V")
	@Override
	public void method7560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) Class321 arg4, @OriginalArg(6) int arg5) {
		@Pc(21) byte local21;
		@Pc(19) int local19;
		if (Static384.aClass321_5 == arg4) {
			local19 = arg1 * 2;
			local21 = 1;
		} else if (Static543.aClass321_8 == arg4) {
			local19 = arg1 + 1;
			local21 = 3;
		} else if (Static104.aClass321_1 == arg4) {
			local19 = arg1 * 3;
			local21 = 4;
		} else if (arg4 == Static190.aClass321_6) {
			local21 = 6;
			local19 = arg1 + 2;
		} else if (arg4 == Static535.aClass321_7) {
			local19 = arg1 + 2;
			local21 = 5;
		} else {
			local21 = 0;
			local19 = arg1;
		}
		@Pc(72) Class254 local72 = arg3.method5937();
		@Pc(75) Class11_Sub2 local75 = (Class11_Sub2) arg3;
		local75.method5928();
		OpenGL.glDrawElements(local21, local19, Static6.method88(local72), local75.method5932() + (long) (local72.anInt7322 * arg5));
	}

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "()V")
	@Override
	public void method7508() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "(I)V")
	@Override
	public void method7563() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray89, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray84, 0);
	}

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "(I)V")
	@Override
	protected void method7582() {
		for (@Pc(10) int local10 = super.anInt9580 - 1; local10 >= 0; local10--) {
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
		this.anOpenGL2.setSwapInterval(0);
		super.method7582();
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V")
	@Override
	protected void method7537() {
		@Pc(47) int local47;
		if (super.aBoolean631) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local47 = super.anInt9572;
		} else {
			super.aFloat200 = -super.anInt9553 + super.anInt9577;
			super.aFloat199 = (float) -super.anInt9564 + super.aFloat200;
			if (super.aFloat199 < (float) super.anInt9557) {
				super.aFloat199 = super.anInt9557;
			}
			OpenGL.glFogf(2915, super.aFloat199);
			OpenGL.glFogf(2916, super.aFloat200);
			local47 = super.anInt9562;
		}
		Static375.aFloatArray79[1] = (float) (local47 & 0xFF00) / 65280.0F;
		Static375.aFloatArray79[2] = (float) (local47 & 0xFF) / 255.0F;
		Static375.aFloatArray79[0] = (float) (local47 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static375.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method7601(@OriginalArg(0) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL2.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZI[BLclient!kf;ZII)Lclient!hr;")
	@Override
	protected Interface7 method7600(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean434 || Static331.method5078(arg4) && Static331.method5078(arg0)) {
			return new Class26_Sub3(this, arg3, arg4, arg0, arg1, arg2, 0, 0);
		} else if (this.aBoolean433) {
			return new Class26_Sub4(this, arg3, arg4, arg0, arg2, 0, 0);
		} else {
			@Pc(46) Class26_Sub3 local46 = new Class26_Sub3(this, arg3, Static407.aClass254_14, Static14.method5936(arg4), Static14.method5936(arg0));
			local46.method7050(arg2, arg4, arg0, arg3, 0);
			return local46;
		}
	}

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "(I)V")
	@Override
	protected void method7635() {
		if (super.aBoolean641 && !super.aBoolean646) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(BI)V")
	public synchronized void method4886(@OriginalArg(1) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong245 = arg0;
		this.aClass298_121.method6812(local7);
	}

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "(I)V")
	@Override
	protected void method7551() {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kf;BLclient!ps;)Z")
	@Override
	public boolean method7556(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class254 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7460(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7508();
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V")
	@Override
	protected void method7549() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt9569 > local7; local7++) {
			@Pc(22) Class6_Sub25 local22 = super.aClass6_Sub25Array6[local7];
			@Pc(26) int local26 = local22.method6409(true);
			@Pc(30) int local30 = local7 + 16386;
			@Pc(36) float local36 = local22.method6407() / 255.0F;
			Static375.aFloatArray79[0] = local22.method6405();
			Static375.aFloatArray79[1] = local22.method6402();
			Static375.aFloatArray79[2] = local22.method6400();
			Static375.aFloatArray79[3] = 1.0F;
			OpenGL.glLightfv(local30, 4611, Static375.aFloatArray79, 0);
			Static375.aFloatArray79[3] = 1.0F;
			Static375.aFloatArray79[2] = (float) (local26 & 0xFF) * local36;
			Static375.aFloatArray79[1] = local36 * (float) (local26 >> 8 & 0xFF);
			Static375.aFloatArray79[0] = local36 * (float) (local26 >> 16 & 0xFF);
			OpenGL.glLightfv(local30, 4609, Static375.aFloatArray79, 0);
			OpenGL.glLightf(local30, 4617, 1.0F / (float) (local22.method6398() * local22.method6398()));
			OpenGL.glEnable(local30);
		}
		while (super.anInt9573 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method7549();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method7603(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZILclient!iv;)V")
	@Override
	protected void method7592(@OriginalArg(2) int arg0, @OriginalArg(3) Class150 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static505.method6971(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZ)Lclient!iq;")
	@Override
	public Interface8 method7562(@OriginalArg(1) boolean arg0) {
		return new Class11_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "(I)V")
	@Override
	protected void method7564() {
		Static375.aFloatArray79[1] = super.aFloat204 * super.aFloat201;
		Static375.aFloatArray79[2] = super.aFloat206 * super.aFloat201;
		Static375.aFloatArray79[3] = 1.0F;
		Static375.aFloatArray79[0] = super.aFloat190 * super.aFloat201;
		OpenGL.glLightModelfv(2899, Static375.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7561(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local14);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()Lclient!fea;")
	@Override
	public Class102 method7450() {
		@Pc(7) int local7 = -1;
		if (this.aString48.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString48.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString48.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class102(local7, "OpenGL", this.anInt6028, this.aString49, 0L);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IBI)V")
	public synchronized void method4887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class6_Sub14 local17 = new Class6_Sub14(arg1);
		local17.aLong245 = arg0;
		this.aClass298_118.method6812(local17);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Lclient!jn;")
	@Override
	public Interface9 method7545(@OriginalArg(0) boolean arg0) {
		return new Class11_Sub2(this, Static407.aClass254_15, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "()V")
	@Override
	public void method7501() {
	}

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "(I)V")
	@Override
	protected void method7641() {
		if (super.aBoolean649) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLclient!kf;IIII[F)Lclient!hr;")
	@Override
	protected Interface7 method7534(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean434 || Static331.method5078(arg0) && Static331.method5078(arg3)) {
			return new Class26_Sub3(this, arg2, arg0, arg3, arg1, arg4, 0, 0);
		} else if (this.aBoolean433) {
			return new Class26_Sub4(this, arg2, arg0, arg3, arg4, 0, 0);
		} else {
			@Pc(59) Class26_Sub3 local59 = new Class26_Sub3(this, arg2, Static407.aClass254_18, Static14.method5936(arg0), Static14.method5936(arg3));
			local59.method4223(arg4, arg0, arg2, arg3);
			return local59;
		}
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "()V")
	@Override
	public void method7475() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([IIZIIII)Lclient!hr;")
	@Override
	public Interface7 method7623(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean434 || Static331.method5078(arg3) && Static331.method5078(arg5)) {
			return new Class26_Sub3(this, arg3, arg5, arg1, arg0, 0, arg4);
		} else if (this.aBoolean433) {
			return new Class26_Sub4(this, arg3, arg5, arg0, 0, arg4);
		} else {
			@Pc(52) Class26_Sub3 local52 = new Class26_Sub3(this, Static493.aClass171_15, Static407.aClass254_14, Static14.method5936(arg3), Static14.method5936(arg5));
			local52.method7048(0, arg3, 0, arg4, arg0, arg5);
			return local52;
		}
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7613() {
		if (super.aClass30_7 == Static336.aClass30_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass30_7 == Static126.aClass30_1) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass30_7 == Static225.aClass30_3) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)V")
	@Override
	protected void method7539() {
		if (super.aBoolean647) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!fl;)V")
	@Override
	public void method7553(@OriginalArg(1) Class107 arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBLclient!uj;)V")
	@Override
	public void method7531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class321 arg2) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (Static384.aClass321_5 == arg2) {
			local16 = 1;
			local20 = arg0 * 2;
		} else if (arg2 == Static543.aClass321_8) {
			local16 = 3;
			local20 = arg0 + 1;
		} else if (arg2 == Static104.aClass321_1) {
			local20 = arg0 * 3;
			local16 = 4;
		} else if (arg2 == Static190.aClass321_6) {
			local16 = 6;
			local20 = arg0 + 2;
		} else if (Static535.aClass321_7 == arg2) {
			local16 = 5;
			local20 = arg0 + 2;
		} else {
			local20 = arg0;
			local16 = 0;
		}
		OpenGL.glDrawArrays(local16, arg1, local20);
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "()Z")
	@Override
	public boolean method7479() {
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)V")
	@Override
	protected void method7565() {
		OpenGL.glActiveTexture(super.anInt9579 + 33984);
	}

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "(I)V")
	@Override
	protected void method7616() {
		OpenGL.glTexEnvi(8960, 34161, Static286.method4358(super.aClass214Array3[super.anInt9579]));
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public synchronized void method4888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub14 local8 = new Class6_Sub14(arg0);
		local8.aLong245 = arg1;
		this.aClass298_117.method6812(local8);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
	@Override
	protected void method7530() {
		if (super.aBoolean645) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "()V")
	@Override
	public void method7521() {
		this.method7652(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!mc", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9469 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt6027, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return this.anInt6026;
	}

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "(I)V")
	@Override
	protected void method7646() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray83, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "(B)V")
	@Override
	protected void method7659() {
		OpenGL.glViewport(super.anInt9566, super.anInt9588, super.anInt9524, super.anInt9469);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[[IZI)Lclient!js;")
	@Override
	public Interface10 method7657(@OriginalArg(1) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class26_Sub2(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!ps;Lclient!kf;)Z")
	@Override
	public boolean method7628(@OriginalArg(1) Class254 arg0, @OriginalArg(2) Class171 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[BILclient!kf;I)Lclient!k;")
	@Override
	public Interface11 method7538(@OriginalArg(2) byte[] arg0, @OriginalArg(4) Class171 arg1) {
		return new Class26_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method7636(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(II)Lclient!tf;")
	@Override
	protected Class34 method7656(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class34_Sub1(this, super.aClass248_106);
		} else if (arg0 == 4) {
			return new Class34_Sub2(this, super.aClass248_106, super.aClass66_6);
		} else {
			return super.method7656(arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "(I)V")
	@Override
	protected void method7653() {
		if (super.aBoolean633) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "()V")
	@Override
	public void method7469() {
		if (super.anInt9524 <= 0 && super.anInt9469 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt9550;
		@Pc(19) int local19 = super.anInt9555;
		@Pc(22) int local22 = super.anInt9571;
		@Pc(25) int local25 = super.anInt9567;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7645();
		this.method7589(false);
		this.method7528(false);
		this.method7573(false);
		this.method7652(false);
		this.method7624(null);
		this.method7548(false, -2, false);
		this.method7620(1);
		this.method7640(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9524, super.anInt9469, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "(I)F")
	@Override
	protected float method7578() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([Lclient!lf;B)Lclient!fl;")
	@Override
	public Class107 method7605(@OriginalArg(0) Class185[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "(I)V")
	@Override
	protected void method7607() {
		OpenGL.glDepthMask(super.aBoolean630 && super.aBoolean637);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V")
	@Override
	protected void method7536() {
		if (super.aBoolean635) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kf;IILclient!ps;I)Lclient!hr;")
	@Override
	public Interface7 method7626(@OriginalArg(0) Class171 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class254 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean434 || Static331.method5078(arg3) && Static331.method5078(arg1)) {
			return new Class26_Sub3(this, arg0, arg2, arg3, arg1);
		} else if (this.aBoolean433) {
			return new Class26_Sub4(this, arg0, arg2, arg3, arg1);
		} else {
			return new Class26_Sub3(this, arg0, arg2, Static14.method5936(arg3), Static14.method5936(arg1));
		}
	}

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "(I)V")
	private void method4890() {
		if (this.aBoolean431) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass296_7.method6776()) {
			if (!this.aBoolean431) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass93_Sub3_18.method3758(Static124.aFloatArray11), 0);
				this.method7563();
				this.method7549();
				this.aBoolean431 = true;
			}
			if (this.aBoolean431) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean629) {
				OpenGL.glMultMatrixf(super.aClass93_Sub3_15.method3758(Static124.aFloatArray11), 0);
			}
		} else if (super.aBoolean629) {
			OpenGL.glLoadIdentity();
			this.aBoolean431 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass93_Sub3_15.method3758(Static124.aFloatArray11), 0);
			this.aBoolean431 = false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "(I)V")
	@Override
	protected void method7637() {
		if (super.aBoolean648 && super.aBoolean642 && super.aBoolean631 | super.anInt9564 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "(I)V")
	@Override
	protected void method7583() {
		@Pc(9) int local9 = this.anIntArray435[super.anInt9579];
		if (local9 != 0) {
			this.anIntArray435[super.anInt9579] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "(B)V")
	@Override
	protected void method7642() {
		OpenGL.glScissor(super.anInt9550 + super.anInt9566, -super.anInt9567 + super.anInt9469 + super.anInt9588, super.anInt9555 - super.anInt9550, -super.anInt9571 + super.anInt9567);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ka;Lclient!ka;FLclient!ka;)Lclient!ka;")
	@Override
	public Class3 method7503(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "(I)V")
	@Override
	protected void method7647() {
		OpenGL.glMatrixMode(5890);
		if (Static16.aClass172_1 == super.aClass172Array3[super.anInt9579]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass93_Sub3Array3[super.anInt9579].method3758(Static124.aFloatArray11), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "(I)V")
	@Override
	protected void method7571() {
		this.method4890();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!iv;ZIZ)V")
	@Override
	public void method7557(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static505.method6971(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "()Z")
	@Override
	public boolean method7496() {
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!iq;II)V")
	@Override
	public void method7658(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)V")
	@Override
	protected void method7541() {
		Static375.aFloatArray79[1] = super.aFloat204 * super.aFloat198;
		Static375.aFloatArray79[2] = super.aFloat206 * super.aFloat198;
		Static375.aFloatArray79[0] = super.aFloat190 * super.aFloat198;
		Static375.aFloatArray79[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static375.aFloatArray79, 0);
		Static375.aFloatArray79[3] = 1.0F;
		Static375.aFloatArray79[1] = -super.aFloat202 * super.aFloat204;
		Static375.aFloatArray79[0] = -super.aFloat202 * super.aFloat190;
		Static375.aFloatArray79[2] = super.aFloat206 * -super.aFloat202;
		OpenGL.glLightfv(16385, 4609, Static375.aFloatArray79, 0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kda;I)V")
	@Override
	public void method7655(@OriginalArg(0) Class168 arg0) {
		if (arg0 == Static386.aClass168_3) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(10) int local10 = Static97.method1427(arg0);
		OpenGL.glTexGeni(8192, 9472, local10);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local10);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local10);
		OpenGL.glEnable(3170);
	}
}
