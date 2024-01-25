import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class82_Sub3_Sub1 extends Class82_Sub3 {

	@OriginalMember(owner = "client!hj", name = "Ug", descriptor = "Ljava/lang/String;")
	public static final String aString25;

	@OriginalMember(owner = "client!hj", name = "gh", descriptor = "Ljava/lang/String;")
	public static final String aString26;

	@OriginalMember(owner = "client!hj", name = "Fi", descriptor = "Z")
	private boolean aBoolean317;

	@OriginalMember(owner = "client!hj", name = "Gi", descriptor = "Z")
	private boolean aBoolean318;

	@OriginalMember(owner = "client!hj", name = "Ii", descriptor = "I")
	private int anInt4412;

	@OriginalMember(owner = "client!hj", name = "Ji", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!hj", name = "Ki", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!hj", name = "Li", descriptor = "Z")
	private boolean aBoolean320;

	@OriginalMember(owner = "client!hj", name = "Mi", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!hj", name = "oh", descriptor = "Lclient!mba;")
	private final Class216 aClass216_36 = new Class216();

	@OriginalMember(owner = "client!hj", name = "ui", descriptor = "Lclient!mba;")
	private final Class216 aClass216_37 = new Class216();

	@OriginalMember(owner = "client!hj", name = "zi", descriptor = "Lclient!mba;")
	private final Class216 aClass216_38 = new Class216();

	@OriginalMember(owner = "client!hj", name = "Ai", descriptor = "Lclient!mba;")
	private final Class216 aClass216_39 = new Class216();

	@OriginalMember(owner = "client!hj", name = "Bi", descriptor = "Lclient!mba;")
	private final Class216 aClass216_40 = new Class216();

	@OriginalMember(owner = "client!hj", name = "Ci", descriptor = "Lclient!mba;")
	private final Class216 aClass216_41 = new Class216();

	@OriginalMember(owner = "client!hj", name = "Di", descriptor = "Lclient!mba;")
	private final Class216 aClass216_42 = new Class216();

	@OriginalMember(owner = "client!hj", name = "Hi", descriptor = "[Lclient!cs;")
	private final Class60_Sub1[] aClass60_Sub1Array1 = new Class60_Sub1[16];

	@OriginalMember(owner = "client!hj", name = "Ei", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!hj", name = "Ni", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!hj", name = "Wi", descriptor = "I")
	private final int anInt4415 = 0;

	@OriginalMember(owner = "client!hj", name = "li", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!hj", name = "Yi", descriptor = "Ljava/lang/String;")
	private final String aString28;

	@OriginalMember(owner = "client!hj", name = "Ri", descriptor = "Ljava/lang/String;")
	private final String aString27;

	@OriginalMember(owner = "client!hj", name = "Ti", descriptor = "I")
	private final int anInt4413;

	@OriginalMember(owner = "client!hj", name = "Xi", descriptor = "Z")
	public boolean aBoolean326;

	@OriginalMember(owner = "client!hj", name = "Vi", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!hj", name = "Pi", descriptor = "Z")
	private final boolean aBoolean323;

	@OriginalMember(owner = "client!hj", name = "Zi", descriptor = "Z")
	public final boolean aBoolean327;

	@OriginalMember(owner = "client!hj", name = "Qi", descriptor = "Z")
	public final boolean aBoolean324;

	@OriginalMember(owner = "client!hj", name = "Oi", descriptor = "Z")
	public final boolean aBoolean322;

	@OriginalMember(owner = "client!hj", name = "Si", descriptor = "[I")
	public final int[] anIntArray236;

	@OriginalMember(owner = "client!hj", name = "Ui", descriptor = "I")
	public final int anInt4414;

	static {
		@Pc(3) String local3 = "Unknown";
		try {
			local3 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(9) Exception local9) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(20) Exception local20) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(31) Exception local31) {
		}
		aString25 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(42) Exception local42) {
		}
		aString26 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(53) Exception local53) {
		}
		local3.toLowerCase();
		local3 = "~/";
		try {
			local3 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(64) Exception local64) {
		}
		new File(local3);
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!uu;I)V")
	public Class82_Sub3_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(4) Class343 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString28 = OpenGL.glGetString(7936).toLowerCase();
			this.aString27 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString28.indexOf("microsoft") != -1 || this.aString28.indexOf("brian paul") != -1 || this.aString28.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static557.method7916(' ', local109.replace('.', ' '));
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(135) int local135;
			try {
				@Pc(129) int local129 = Static508.method7720(local117[0]);
				local135 = Static508.method7720(local117[1]);
				this.anInt4413 = local129 * 10 + local135;
			} catch (@Pc(144) NumberFormatException local144) {
				throw new RuntimeException("");
			}
			if (this.anInt4413 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(186) int[] local186 = new int[1];
				OpenGL.glGetIntegerv(34018, local186, 0);
				super.anInt5850 = local186[0];
				if (super.anInt5850 < 2) {
					throw new RuntimeException("");
				}
				super.anInt5856 = 8;
				this.aBoolean326 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean408 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean325 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean412 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean323 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean406 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean327 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean324 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean322 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray236 = new int[super.anInt5850];
				this.anInt4414 = Stream.c() ? 33639 : 5121;
				if (this.aString27.indexOf("radeon") != -1) {
					local135 = 0;
					@Pc(288) boolean local288 = false;
					@Pc(290) boolean local290 = false;
					@Pc(299) String[] local299 = Static557.method7916(' ', this.aString27.replace('/', ' '));
					for (@Pc(301) int local301 = 0; local301 < local299.length; local301++) {
						@Pc(307) String local307 = local299[local301];
						try {
							if (local307.length() > 0) {
								if (local307.charAt(0) == 'x' && local307.length() >= 3 && Static279.method4561(local307.substring(1, 3))) {
									local290 = true;
									local307 = local307.substring(1);
								}
								if (local307.equals("hd")) {
									local288 = true;
								} else {
									if (local307.startsWith("hd")) {
										local307 = local307.substring(2);
										local288 = true;
									}
									if (local307.length() >= 4 && Static279.method4561(local307.substring(0, 4))) {
										local135 = Static508.method7720(local307.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(374) Exception local374) {
						}
					}
					if (!local290 && !local288) {
						if (local135 >= 7000 && local135 <= 9250) {
							super.aBoolean406 = false;
						}
						if (local135 >= 7000 && local135 <= 7999) {
							this.aBoolean326 = false;
						}
					}
					this.aBoolean325 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString28.indexOf("intel");
				if (this.aBoolean326) {
					try {
						@Pc(428) int[] local428 = new int[1];
						OpenGL.glGenBuffersARB(1, local428, 0);
					} catch (@Pc(434) Throwable local434) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(440) Throwable local440) {
			local440.printStackTrace();
			this.method6133();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!he;Lclient!he;FLclient!he;)Lclient!he;")
	@Override
	public Class141 method6150(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(JZ)V")
	public synchronized void method3751(@OriginalArg(0) long arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong277 = arg0;
		this.aClass216_42.method5449(local13);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)V")
	@Override
	public void method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "()Lclient!er;")
	@Override
	public Class98 method6119() {
		@Pc(7) int local7 = -1;
		if (this.aString28.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString28.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString28.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class98(local7, "OpenGL", this.anInt4413, this.aString27, 0L);
	}

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!cc;)V")
	@Override
	public void method4960(@OriginalArg(1) Class43 arg0) {
		@Pc(9) Class268[] local9 = ((Class43_Sub1) arg0).aClass268Array1;
		@Pc(11) int local11 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local9.length; local23++) {
			@Pc(29) Class268 local29 = local9[local23];
			@Pc(34) Class60_Sub1 local34 = this.aClass60_Sub1Array1[local23];
			@Pc(36) int local36 = 0;
			@Pc(40) int local40 = local34.method1392();
			@Pc(44) long local44 = local34.method7570();
			local34.method7568();
			for (@Pc(49) int local49 = 0; local49 < local29.method6613(); local49++) {
				@Pc(56) Class279 local56 = local29.method6615(local49);
				if (local56 == Static458.aClass279_1) {
					local21 = true;
					OpenGL.glVertexPointer(3, 5126, local40, (long) local36 + local44);
				} else if (Static458.aClass279_2 == local56) {
					OpenGL.glNormalPointer(5126, local40, local44 + (long) local36);
					local19 = true;
				} else if (Static458.aClass279_3 == local56) {
					local17 = true;
					OpenGL.glColorPointer(4, 5121, local40, local44 + (long) local36);
				} else if (local56 == Static458.aClass279_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static458.aClass279_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local40, (long) local36 + local44);
				} else if (local56 == Static458.aClass279_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local40, (long) local36 + local44);
				} else if (local56 == Static458.aClass279_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local40, local44 + (long) local36);
				}
				local36 += local56.anInt7779;
			}
		}
		if (local21 != this.aBoolean317) {
			if (local21) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean317 = local21;
		}
		if (local19 != this.aBoolean321) {
			if (local19) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean321 = local19;
		}
		if (this.aBoolean320 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean320 = local17;
		}
		@Pc(268) int local268;
		if (local11 > this.anInt4412) {
			for (local268 = this.anInt4412; local268 < local11; local268++) {
				OpenGL.glClientActiveTexture(local268 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt4412 = local11;
		} else if (this.anInt4412 > local11) {
			for (local268 = local11; local268 < this.anInt4412; local268++) {
				OpenGL.glClientActiveTexture(local268 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt4412 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4920(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4923() {
		OpenGL.glTexEnvi(8960, 34161, Static60.method2578(super.aClass88Array5[super.anInt5825]));
	}

	@OriginalMember(owner = "client!hj", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt5782 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt4414, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)V")
	public synchronized void method3752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub51 local8 = new Class3_Sub51(arg1);
		local8.aLong277 = (long) arg0;
		this.aClass216_38.method5449(local8);
	}

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "(I)V")
	@Override
	protected void method4979() {
		OpenGL.glDepthMask(super.aBoolean405 && super.aBoolean404);
	}

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "(I)V")
	@Override
	protected void method5000() {
		OpenGL.glActiveTexture(super.anInt5825 + 33984);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	@Override
	public void method6109(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "(B)V")
	@Override
	protected void method4955() {
		this.aBoolean318 = false;
		this.method3757();
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(I)V")
	@Override
	protected void method4911() {
		super.aFloat122 = (float) (super.anInt5827 - super.anInt5830);
		super.aFloat132 = super.aFloat122 - (float) super.anInt5844;
		if (super.aFloat132 < (float) super.anInt5828) {
			super.aFloat132 = (float) super.anInt5828;
		}
		OpenGL.glFogf(2915, super.aFloat132);
		OpenGL.glFogf(2916, super.aFloat122);
		Static183.aFloatArray17[0] = (float) (super.anInt5843 & 0xFF0000) / 1.671168E7F;
		Static183.aFloatArray17[2] = (float) (super.anInt5843 & 0xFF) / 255.0F;
		Static183.aFloatArray17[1] = (float) (super.anInt5843 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static183.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt4415;
	}

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "()V")
	@Override
	public void method6162() {
	}

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "(B)V")
	@Override
	protected void method5030() {
		if (super.aBoolean417 && !super.aBoolean407) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "(I)V")
	@Override
	protected void method4938() {
		@Pc(9) int local9 = this.anIntArray236[super.anInt5825];
		if (local9 != 0) {
			this.anIntArray236[super.anInt5825] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "()V")
	@Override
	public void method6153() {
		if (super.anInt5688 <= 0 && super.anInt5782 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt5848;
		@Pc(16) int local16 = super.anInt5833;
		@Pc(19) int local19 = super.anInt5852;
		@Pc(22) int local22 = super.anInt5849;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4918();
		this.method4982(false);
		this.method5029(false);
		this.method4997(false);
		this.method4968(false);
		this.method4972((Interface10) null);
		this.method4988(false, false, -2);
		this.method5010(1);
		this.method4939(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt5688, super.anInt5782, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6148(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6166(arg2, arg3);
	}

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "()Z")
	@Override
	public boolean method6177() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method4992(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)V")
	@Override
	protected void method4909() {
		if (super.aBoolean418) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	@Override
	protected void method4906() {
		this.method3757();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!iv;Lclient!jt;I)Z")
	@Override
	public boolean method4994(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class182 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()Z")
	@Override
	public boolean method6103() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "()V")
	@Override
	public void method6157() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(B)V")
	@Override
	protected void method4954() {
		this.method4941();
		@Pc(12) int local12;
		for (local12 = 0; local12 < super.anInt5860; local12++) {
			@Pc(19) Class3_Sub22 local19 = super.aClass3_Sub22Array4[local12];
			@Pc(23) int local23 = local19.method8384();
			@Pc(28) int local28 = local12 + 16386;
			@Pc(34) float local34 = local19.method8387() / 255.0F;
			Static183.aFloatArray17[0] = (float) local19.method8391();
			Static183.aFloatArray17[1] = (float) local19.method8383();
			Static183.aFloatArray17[2] = (float) local19.method8386();
			Static183.aFloatArray17[3] = 1.0F;
			OpenGL.glLightfv(local28, 4611, Static183.aFloatArray17, 0);
			Static183.aFloatArray17[2] = (float) (local23 & 0xFF) * local34;
			Static183.aFloatArray17[3] = 1.0F;
			Static183.aFloatArray17[0] = local34 * (float) (local23 >> 16 & 0xFF);
			Static183.aFloatArray17[1] = local34 * (float) (local23 >> 8 & 0xFF);
			OpenGL.glLightfv(local28, 4609, Static183.aFloatArray17, 0);
			OpenGL.glLightf(local28, 4617, 1.0F / (float) (local19.method8382() * local19.method8382()));
			OpenGL.glEnable(local28);
		}
		while (super.anInt5837 > local12) {
			OpenGL.glDisable(local12 + 16386);
			local12++;
		}
		super.method4954();
	}

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "(I)V")
	@Override
	public void method4950() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray54, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray55, 0);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IBI)V")
	public synchronized void method3754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub51 local14 = new Class3_Sub51(arg1);
		local14.aLong277 = (long) arg0;
		this.aClass216_37.method5449(local14);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZB)Lclient!js;")
	@Override
	public Interface12 method4985(@OriginalArg(0) boolean arg0) {
		return new Class60_Sub2(this, Static280.aClass182_9, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "(I)V")
	@Override
	protected void method4929() {
		OpenGL.glScissor(super.anInt5854 + super.anInt5848, -super.anInt5849 + super.anInt5782 + super.anInt5851, -super.anInt5848 + super.anInt5833, -super.anInt5852 + super.anInt5849);
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(B)V")
	@Override
	protected void method4975() {
		if (super.aBoolean419) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "(I)V")
	@Override
	protected void method4921() {
		OpenGL.glMatrixMode(5890);
		if (Static466.aClass193_6 == super.aClass193Array3[super.anInt5825]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass31_Sub2Array3[super.anInt5825].method7673(Static299.aFloatArray64), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Lclient!pw;")
	@Override
	public Interface19 method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[BILclient!iv;)Lclient!rj;")
	@Override
	public Interface20 method4970(@OriginalArg(3) byte[] arg0, @OriginalArg(5) Class168 arg1) {
		return new Class150_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
	@Override
	protected void method4912() {
		OpenGL.glTexEnvi(8960, 34162, Static60.method2578(super.aClass88Array6[super.anInt5825]));
	}

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "()V")
	@Override
	public void method6167() {
	}

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "(I)V")
	@Override
	protected void method4943() {
		if (super.aBoolean423) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!jt;Lclient!iv;I)Lclient!dg;")
	@Override
	public Interface6 method5008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class168 arg3) {
		if (this.aBoolean323 || Static112.method1840(arg0) && Static112.method1840(arg1)) {
			return new Class150_Sub3(this, arg3, arg2, arg0, arg1);
		} else if (this.aBoolean325) {
			return new Class150_Sub4(this, arg3, arg2, arg0, arg1);
		} else {
			return new Class150_Sub3(this, arg3, arg2, Static533.method1203(arg0), Static533.method1203(arg1));
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4957(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6102(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "(I)V")
	@Override
	protected void method4949() {
		Static183.aFloatArray17[0] = super.aFloat137 * super.aFloat123;
		Static183.aFloatArray17[3] = 1.0F;
		Static183.aFloatArray17[2] = super.aFloat124 * super.aFloat123;
		Static183.aFloatArray17[1] = super.aFloat123 * super.aFloat135;
		OpenGL.glLightModelfv(2899, Static183.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "(II)Lclient!kl;")
	@Override
	protected Class19 method4966(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class19_Sub8(this, super.aClass343_148);
		} else if (arg0 == 4) {
			return new Class19_Sub4(this, super.aClass343_148, super.lb);
		} else if (arg0 == 8) {
			return new Class19_Sub5(this, super.aClass343_148, super.lb);
		} else {
			return super.method4966(arg0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6132(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub51 local19;
		while (!this.aClass216_37.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_37.method5462();
			Static31.anIntArray36[local7++] = (int) local19.aLong277;
			super.anInt5820 -= local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static31.anIntArray36, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static31.anIntArray36, 0);
			local7 = 0;
		}
		while (!this.aClass216_38.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_38.method5462();
			Static31.anIntArray36[local7++] = (int) local19.aLong277;
			super.anInt5818 -= local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static31.anIntArray36, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static31.anIntArray36, 0);
			local7 = 0;
		}
		while (!this.aClass216_39.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_39.method5462();
			Static31.anIntArray36[local7++] = local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static31.anIntArray36, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static31.anIntArray36, 0);
			local7 = 0;
		}
		while (!this.aClass216_40.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_40.method5462();
			Static31.anIntArray36[local7++] = (int) local19.aLong277;
			super.anInt5821 -= local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static31.anIntArray36, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static31.anIntArray36, 0);
		}
		while (!this.aClass216_36.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_36.method5462();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt9787);
		}
		@Pc(210) Class3 local210;
		while (!this.aClass216_41.method5455()) {
			local210 = this.aClass216_41.method5462();
			OpenGL.glDeleteProgramARB((int) local210.aLong277);
		}
		while (!this.aClass216_42.method5455()) {
			local210 = this.aClass216_42.method5462();
			OpenGL.glDeleteObjectARB(local210.aLong277);
		}
		while (!this.aClass216_36.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_36.method5462();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt9787);
		}
		if (this.E() > 100663296 && Static191.method3071() > this.aLong108 + 60000L) {
			System.gc();
			this.aLong108 = Static191.method3071();
		}
		super.method6132(local11);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!pw;Lclient!lh;)Lclient!di;")
	@Override
	public Interface7 method6143(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface14 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "()V")
	@Override
	protected void method6121() {
		super.method6121();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "(I)F")
	@Override
	protected float method5015() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!rv;)V")
	@Override
	public void method4995(@OriginalArg(1) int arg0, @OriginalArg(2) Interface22 arg1) {
		this.aClass60_Sub1Array1[arg0] = (Class60_Sub1) arg1;
	}

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "()V")
	@Override
	public void method6130() {
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "(II)V")
	public synchronized void method3756(@OriginalArg(0) int arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong277 = (long) arg0;
		this.aClass216_41.method5449(local11);
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(II)Lclient!lh;")
	@Override
	public Interface14 method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "jb", descriptor = "(I)V")
	private void method3757() {
		if (this.aBoolean319) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass117_7.method2812()) {
			if (!this.aBoolean318) {
				OpenGL.glLoadMatrixf(super.aClass31_Sub2_18.method7673(Static299.aFloatArray64), 0);
				this.aBoolean318 = true;
				this.method4950();
				this.method4954();
			}
			if (super.aBoolean402) {
				this.aBoolean319 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass31_Sub2_15.method7673(Static299.aFloatArray64), 0);
				this.aBoolean319 = true;
			}
		} else if (super.aBoolean402) {
			OpenGL.glLoadIdentity();
			this.aBoolean319 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass31_Sub2_15.method7673(Static299.aFloatArray64), 0);
			this.aBoolean319 = false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(BZ)Lclient!rv;")
	@Override
	public Interface22 method4925(@OriginalArg(1) boolean arg0) {
		return new Class60_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "(I)V")
	@Override
	protected void method4940() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray59, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "(I)V")
	@Override
	protected void method4914() {
		if (super.aBoolean411 && super.aBoolean421 && super.anInt5844 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BIILclient!iv;IBZ)Lclient!dg;")
	@Override
	protected Interface6 method5006(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) Class168 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean323 || Static112.method1840(arg3) && Static112.method1840(arg0)) {
			return new Class150_Sub3(this, arg2, arg3, arg0, arg4, arg1, 0, 0);
		} else if (this.aBoolean325) {
			return new Class150_Sub4(this, arg2, arg3, arg0, arg1, 0, 0);
		} else {
			@Pc(38) Class150_Sub3 local38 = new Class150_Sub3(this, arg2, Static280.aClass182_8, Static533.method1203(arg3), Static533.method1203(arg0));
			local38.method8505(0, arg3, arg2, arg1, arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!jt;Lclient!iv;B)Z")
	@Override
	public boolean method5005(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class168 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZILclient!ip;Z)V")
	@Override
	public void method5034(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static189.method3060(arg2));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!di;)V")
	@Override
	public void method6141(@OriginalArg(0) Interface7 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(II)V")
	@Override
	public void method5038(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "(B)V")
	@Override
	protected void method4987() {
		if (Static170.aClass54_1 == super.aClass54_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass54_6 == Static436.aClass54_7) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass54_6 == Static222.aClass54_4) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "(B)V")
	@Override
	protected void method5007() {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB[[IZ)Lclient!pda;")
	@Override
	public Interface18 method5003(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class150_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZLclient!ip;)V")
	@Override
	protected void method4953(@OriginalArg(1) int arg0, @OriginalArg(3) Class165 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static189.method3060(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lclient!pj;I)Lclient!cc;")
	@Override
	public Class43 method4976(@OriginalArg(0) Class268[] arg0) {
		return new Class43_Sub1(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "hb", descriptor = "(I)V")
	@Override
	protected void method5037() {
		for (@Pc(6) int local6 = super.anInt5850 - 1; local6 >= 0; local6--) {
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
		@Pc(77) float[] local77 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(87) int local87 = 0; local87 < 8; local87++) {
			@Pc(93) int local93 = local87 + 16384;
			OpenGL.glLightfv(local93, 4608, local77, 0);
			OpenGL.glLightf(local93, 4615, 0.0F);
			OpenGL.glLightf(local93, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method5037();
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5040() {
		Static183.aFloatArray17[3] = (float) (super.anInt5855 >>> 24) / 255.0F;
		Static183.aFloatArray17[0] = (float) (super.anInt5855 & 0xFF0000) / 1.671168E7F;
		Static183.aFloatArray17[1] = (float) (super.anInt5855 & 0xFF00) / 65280.0F;
		Static183.aFloatArray17[2] = (float) (super.anInt5855 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static183.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)V")
	@Override
	protected void method4910() {
		if (super.aBoolean414) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "(I)V")
	@Override
	protected void method4959() {
		OpenGL.glViewport(super.anInt5854, super.anInt5851, super.anInt5688, super.anInt5782);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	@Override
	protected Object method4942(@OriginalArg(0) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL2.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!sga;I)V")
	@Override
	public void method4963(@OriginalArg(0) Class306 arg0) {
		if (Static279.aClass306_2 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(25) int local25 = Static265.method4406(arg0);
		OpenGL.glTexGeni(8192, 9472, local25);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local25);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local25);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "(I)V")
	@Override
	protected void method4932() {
		Static183.aFloatArray17[2] = super.aFloat138 * super.aFloat124;
		Static183.aFloatArray17[0] = super.aFloat138 * super.aFloat137;
		Static183.aFloatArray17[3] = 1.0F;
		Static183.aFloatArray17[1] = super.aFloat135 * super.aFloat138;
		OpenGL.glLightfv(16384, 4609, Static183.aFloatArray17, 0);
		Static183.aFloatArray17[0] = -super.aFloat136 * super.aFloat137;
		Static183.aFloatArray17[2] = -super.aFloat136 * super.aFloat124;
		Static183.aFloatArray17[1] = super.aFloat135 * -super.aFloat136;
		Static183.aFloatArray17[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static183.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "(I)V")
	@Override
	protected void method4978() {
		if (super.aBoolean403) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!js;Lclient!wi;III)V")
	@Override
	public void method4993(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1, @OriginalArg(3) Class376 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) byte local17;
		@Pc(15) int local15;
		if (Static310.aClass376_4 == arg2) {
			local15 = arg3 * 2;
			local17 = 1;
		} else if (Static525.aClass376_7 == arg2) {
			local15 = arg3 + 1;
			local17 = 3;
		} else if (arg2 == Static525.aClass376_6) {
			local17 = 4;
			local15 = arg3 * 3;
		} else if (arg2 == Static52.aClass376_1) {
			local17 = 6;
			local15 = arg3 + 2;
		} else if (arg2 == Static171.aClass376_3) {
			local15 = arg3 + 2;
			local17 = 5;
		} else {
			local17 = 0;
			local15 = arg3;
		}
		@Pc(68) Class182 local68 = arg1.method7575();
		@Pc(71) Class60_Sub2 local71 = (Class60_Sub2) arg1;
		local71.method7568();
		OpenGL.glDrawElements(local17, local15, Static157.method2758(local68), local71.method7570() + (long) (local68.anInt5379 * arg5));
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIZ[III)Lclient!dg;")
	@Override
	public Interface6 method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean323 || Static112.method1840(arg2) && Static112.method1840(arg5)) {
			return new Class150_Sub3(this, arg2, arg5, arg3, arg4, 0, arg0);
		} else if (this.aBoolean325) {
			return new Class150_Sub4(this, arg2, arg5, arg4, 0, arg0);
		} else {
			@Pc(35) Class150_Sub3 local35 = new Class150_Sub3(this, Static95.aClass168_2, Static280.aClass182_8, Static533.method1203(arg2), Static533.method1203(arg5));
			local35.method8507(arg0, arg5, arg4, 0, arg2, 0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method4962(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZIBLclient!iv;[FI)Lclient!dg;")
	@Override
	protected Interface6 method4984(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(5) Class168 arg2, @OriginalArg(6) float[] arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean323 || Static112.method1840(arg0) && Static112.method1840(arg4)) {
			return new Class150_Sub3(this, arg2, arg0, arg4, arg1, arg3, 0, 0);
		} else if (this.aBoolean325) {
			return new Class150_Sub4(this, arg2, arg0, arg4, arg3, 0, 0);
		} else {
			@Pc(48) Class150_Sub3 local48 = new Class150_Sub3(this, arg2, Static280.aClass182_12, Static533.method1203(arg0), Static533.method1203(arg4));
			local48.method8465(arg4, arg3, arg0, arg2);
			return local48;
		}
	}

	@OriginalMember(owner = "client!hj", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4968(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!wi;II)V")
	@Override
	public void method5023(@OriginalArg(1) Class376 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static310.aClass376_4 == arg0) {
			local12 = arg1 * 2;
			local14 = 1;
		} else if (arg0 == Static525.aClass376_7) {
			local12 = arg1 + 1;
			local14 = 3;
		} else if (arg0 == Static525.aClass376_6) {
			local12 = arg1 * 3;
			local14 = 4;
		} else if (Static52.aClass376_1 == arg0) {
			local12 = arg1 + 2;
			local14 = 6;
		} else if (Static171.aClass376_3 == arg0) {
			local14 = 5;
			local12 = arg1 + 2;
		} else {
			local14 = 0;
			local12 = arg1;
		}
		OpenGL.glDrawArrays(local14, arg2, local12);
	}
}
