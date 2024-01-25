import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class20_Sub2_Sub2 extends Class20_Sub2 {

	@OriginalMember(owner = "client!bga", name = "Di", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!bga", name = "Fi", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!bga", name = "Gi", descriptor = "I")
	private int anInt1666;

	@OriginalMember(owner = "client!bga", name = "Hi", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!bga", name = "Ii", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!bga", name = "Ji", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!bga", name = "Li", descriptor = "Z")
	private boolean aBoolean138;

	@OriginalMember(owner = "client!bga", name = "Sh", descriptor = "Lclient!uh;")
	private final Class341 aClass341_12 = new Class341();

	@OriginalMember(owner = "client!bga", name = "wi", descriptor = "Lclient!uh;")
	private final Class341 aClass341_13 = new Class341();

	@OriginalMember(owner = "client!bga", name = "yi", descriptor = "Lclient!uh;")
	private final Class341 aClass341_14 = new Class341();

	@OriginalMember(owner = "client!bga", name = "zi", descriptor = "Lclient!uh;")
	private final Class341 aClass341_15 = new Class341();

	@OriginalMember(owner = "client!bga", name = "Ai", descriptor = "Lclient!uh;")
	private final Class341 aClass341_16 = new Class341();

	@OriginalMember(owner = "client!bga", name = "Bi", descriptor = "Lclient!uh;")
	private final Class341 aClass341_17 = new Class341();

	@OriginalMember(owner = "client!bga", name = "Ci", descriptor = "Lclient!uh;")
	private final Class341 aClass341_18 = new Class341();

	@OriginalMember(owner = "client!bga", name = "Ei", descriptor = "[Lclient!bba;")
	private final Class28_Sub1[] aClass28_Sub1Array1 = new Class28_Sub1[16];

	@OriginalMember(owner = "client!bga", name = "Ki", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!bga", name = "Mi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!bga", name = "Wi", descriptor = "I")
	private final int anInt1669 = 0;

	@OriginalMember(owner = "client!bga", name = "Fh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!bga", name = "Oi", descriptor = "Ljava/lang/String;")
	private final String aString10;

	@OriginalMember(owner = "client!bga", name = "Ni", descriptor = "Ljava/lang/String;")
	private final String aString9;

	@OriginalMember(owner = "client!bga", name = "Vi", descriptor = "I")
	private final int anInt1668;

	@OriginalMember(owner = "client!bga", name = "Ri", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!bga", name = "Qi", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "client!bga", name = "Xi", descriptor = "Z")
	private final boolean aBoolean144;

	@OriginalMember(owner = "client!bga", name = "Si", descriptor = "Z")
	public final boolean aBoolean141;

	@OriginalMember(owner = "client!bga", name = "Ui", descriptor = "Z")
	public final boolean aBoolean143;

	@OriginalMember(owner = "client!bga", name = "Ti", descriptor = "Z")
	public final boolean aBoolean142;

	@OriginalMember(owner = "client!bga", name = "Yi", descriptor = "[I")
	public final int[] anIntArray61;

	@OriginalMember(owner = "client!bga", name = "Pi", descriptor = "I")
	public final int anInt1667;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!in;I)V")
	public Class20_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString10 = OpenGL.glGetString(7936).toLowerCase();
			this.aString9 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString10.indexOf("microsoft") != -1 || this.aString10.indexOf("brian paul") != -1 || this.aString10.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static62.method1946(' ', local108.replace('.', ' '));
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(137) int local137;
			try {
				@Pc(131) int local131 = Static562.method8436(local116[0]);
				local137 = Static562.method8436(local116[1]);
				this.anInt1668 = local131 * 10 + local137;
			} catch (@Pc(147) NumberFormatException local147) {
				throw new RuntimeException("");
			}
			if (this.anInt1668 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(184) int[] local184 = new int[1];
				OpenGL.glGetIntegerv(34018, local184, 0);
				super.anInt1540 = local184[0];
				if (super.anInt1540 < 2) {
					throw new RuntimeException("");
				}
				super.anInt1562 = 8;
				this.aBoolean140 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean132 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean139 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean115 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean144 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean128 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean141 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean143 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean142 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray61 = new int[super.anInt1540];
				this.anInt1667 = Stream.c() ? 33639 : 5121;
				if (this.aString9.indexOf("radeon") != -1) {
					local137 = 0;
					@Pc(286) boolean local286 = false;
					@Pc(288) boolean local288 = false;
					@Pc(297) String[] local297 = Static62.method1946(' ', this.aString9.replace('/', ' '));
					for (@Pc(299) int local299 = 0; local299 < local297.length; local299++) {
						@Pc(305) String local305 = local297[local299];
						try {
							if (local305.length() > 0) {
								if (local305.charAt(0) == 'x' && local305.length() >= 3 && Static202.method4067(local305.substring(1, 3))) {
									local288 = true;
									local305 = local305.substring(1);
								}
								if (local305.equals("hd")) {
									local286 = true;
								} else {
									if (local305.startsWith("hd")) {
										local286 = true;
										local305 = local305.substring(2);
									}
									if (local305.length() >= 4 && Static202.method4067(local305.substring(0, 4))) {
										local137 = Static562.method8436(local305.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(373) Exception local373) {
						}
					}
					if (!local288 && !local286) {
						if (local137 >= 7000 && local137 <= 7999) {
							this.aBoolean140 = false;
						}
						if (local137 >= 7000 && local137 <= 9250) {
							super.aBoolean128 = false;
						}
					}
					this.aBoolean139 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString10.indexOf("intel");
				if (this.aBoolean140) {
					try {
						@Pc(427) int[] local427 = new int[1];
						OpenGL.glGenBuffersARB(1, local427, 0);
					} catch (@Pc(433) Throwable local433) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(439) Throwable local439) {
			local439.printStackTrace();
			this.method7238();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7249(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub43 local19;
		while (!this.aClass341_13.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_13.method8526();
			Static353.anIntArray443[local7++] = (int) local19.aLong278;
			super.anInt1524 -= local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static353.anIntArray443, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static353.anIntArray443, 0);
			local7 = 0;
		}
		while (!this.aClass341_14.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_14.method8526();
			Static353.anIntArray443[local7++] = (int) local19.aLong278;
			super.anInt1523 -= local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static353.anIntArray443, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static353.anIntArray443, 0);
			local7 = 0;
		}
		while (!this.aClass341_15.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_15.method8526();
			Static353.anIntArray443[local7++] = local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static353.anIntArray443, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static353.anIntArray443, 0);
			local7 = 0;
		}
		while (!this.aClass341_16.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_16.method8526();
			Static353.anIntArray443[local7++] = (int) local19.aLong278;
			super.anInt1538 -= local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static353.anIntArray443, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static353.anIntArray443, 0);
		}
		while (!this.aClass341_12.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_12.method8526();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9046);
		}
		@Pc(214) Class2 local214;
		while (!this.aClass341_17.method8531()) {
			local214 = this.aClass341_17.method8526();
			OpenGL.glDeleteProgramARB((int) local214.aLong278);
		}
		while (!this.aClass341_18.method8531()) {
			local214 = this.aClass341_18.method8526();
			OpenGL.glDeleteObjectARB(local214.aLong278);
		}
		while (!this.aClass341_12.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_12.method8526();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9046);
		}
		if (this.E() > 100663296 && this.aLong30 + 60000L < Static277.method5091()) {
			System.gc();
			this.aLong30 = Static277.method5091();
		}
		super.method7249(local11);
	}

	@OriginalMember(owner = "client!bga", name = "j", descriptor = "(B)V")
	@Override
	protected void method1475() {
		OpenGL.glDepthMask(super.aBoolean121 && super.aBoolean119);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[Lclient!jl;)Lclient!np;")
	@Override
	public Class22 method1446(@OriginalArg(1) Class168[] arg0) {
		return new Class22_Sub1(arg0);
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(Z)V")
	@Override
	protected void method1452() {
		if (super.aBoolean116) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method1515(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local10)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bga", name = "t", descriptor = "(B)V")
	@Override
	protected void method1535() {
		this.method1590();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZILclient!kf;Z)V")
	@Override
	public void method1558(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static28.method687(arg2));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!baa;Lclient!wq;B)Z")
	@Override
	public boolean method1514(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class375 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1447() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray28, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bga", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method1580(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(JI)V")
	public synchronized void method1586(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong278 = arg0;
		this.aClass341_18.method8528(local7);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)Lclient!vm;")
	@Override
	public Interface25 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bga", name = "K", descriptor = "(I)V")
	@Override
	protected void method1569() {
		OpenGL.glTexEnvi(8960, 34162, Static474.method7457(super.aClass315Array6[super.anInt1574]));
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILclient!wq;ZI[B)Lclient!ir;")
	@Override
	public Interface13 method1506(@OriginalArg(2) Class375 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class38_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBI)V")
	public synchronized void method1587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub43 local8 = new Class2_Sub43(arg0);
		local8.aLong278 = arg1;
		this.aClass341_14.method8528(local8);
	}

	@OriginalMember(owner = "client!bga", name = "r", descriptor = "(B)V")
	@Override
	protected void method1518() {
	}

	@OriginalMember(owner = "client!bga", name = "H", descriptor = "(I)V")
	@Override
	protected void method1562() {
		Static291.aFloatArray54[0] = super.aFloat63 * super.aFloat51;
		Static291.aFloatArray54[2] = super.aFloat51 * super.aFloat59;
		Static291.aFloatArray54[1] = super.aFloat49 * super.aFloat51;
		Static291.aFloatArray54[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static291.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIII[BLclient!wq;IZ)Lclient!wfa;")
	@Override
	protected Interface27 method1477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class375 arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean144 || Static468.method7401(arg1) && Static468.method7401(arg0)) {
			return new Class38_Sub1(this, arg3, arg1, arg0, arg4, arg2, 0, 0);
		} else if (this.aBoolean139) {
			return new Class38_Sub4(this, arg3, arg1, arg0, arg2, 0, 0);
		} else {
			@Pc(51) Class38_Sub1 local51 = new Class38_Sub1(this, arg3, Static29.aClass26_4, Static231.method4407(arg1), Static231.method4407(arg0));
			local51.method8304(0, arg0, arg1, arg2, arg3);
			return local51;
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(BI)V")
	@Override
	public void method1544(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!bf;I)V")
	@Override
	public void method1505(@OriginalArg(0) Class31 arg0) {
		if (arg0 == Static398.aClass31_3) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(13) int local13 = Static253.method8221(arg0);
		OpenGL.glTexGeni(8192, 9472, local13);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local13);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local13);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BZ)V")
	@Override
	public void method1560(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!bga", name = "M", descriptor = "(I)V")
	@Override
	protected void method1574() {
		OpenGL.glMatrixMode(5890);
		if (Static263.aClass332_3 == super.aClass332Array3[super.anInt1574]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass30_Sub2Array3[super.anInt1574].method4038(Static522.aFloatArray81), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILclient!tc;I)V")
	@Override
	public void method1559(@OriginalArg(1) Interface22 arg0, @OriginalArg(2) int arg1) {
		this.aClass28_Sub1Array1[arg1] = (Class28_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bga", name = "F", descriptor = "(I)V")
	@Override
	protected void method1554() {
		OpenGL.glTexEnvi(8960, 34161, Static474.method7457(super.aClass315Array5[super.anInt1574]));
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(II)Lclient!he;")
	@Override
	public Interface12 method7268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)V")
	@Override
	protected void method1453() {
		@Pc(9) int local9 = this.anIntArray61[super.anInt1574];
		if (local9 != 0) {
			this.anIntArray61[super.anInt1574] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!bga", name = "q", descriptor = "(B)V")
	@Override
	protected void method1516() {
		for (@Pc(10) int local10 = super.anInt1540 - 1; local10 >= 0; local10--) {
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
		@Pc(74) float[] local74 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(76) int local76 = 0; local76 < 8; local76++) {
			@Pc(88) int local88 = local76 + 16384;
			OpenGL.glLightfv(local88, 4608, local74, 0);
			OpenGL.glLightf(local88, 4615, 0.0F);
			OpenGL.glLightf(local88, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method1516();
	}

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "(B)V")
	@Override
	protected void method1461() {
		if (super.aBoolean125 && super.bf && super.anInt1541 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!he;Lclient!vm;)Lclient!is;")
	@Override
	public Interface14 method7237(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method1510(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "()Lclient!fia;")
	@Override
	public Class108 method7240() {
		@Pc(7) int local7 = -1;
		if (this.aString10.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString10.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString10.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class108(local7, "OpenGL", this.anInt1668, this.aString9, 0L);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!wh;Lclient!wh;FLclient!wh;)Lclient!wh;")
	@Override
	public Class78 method7309(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V")
	public synchronized void method1589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub43 local14 = new Class2_Sub43(arg0);
		local14.aLong278 = arg1;
		this.aClass341_13.method8528(local14);
	}

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "(Z)V")
	@Override
	protected void method1476() {
		Static291.aFloatArray54[2] = super.aFloat59 * super.aFloat62;
		Static291.aFloatArray54[3] = 1.0F;
		Static291.aFloatArray54[0] = super.aFloat63 * super.aFloat62;
		Static291.aFloatArray54[1] = super.aFloat49 * super.aFloat62;
		OpenGL.glLightfv(16384, 4609, Static291.aFloatArray54, 0);
		Static291.aFloatArray54[0] = super.aFloat63 * -super.aFloat65;
		Static291.aFloatArray54[2] = -super.aFloat65 * super.aFloat59;
		Static291.aFloatArray54[3] = 1.0F;
		Static291.aFloatArray54[1] = -super.aFloat65 * super.aFloat49;
		OpenGL.glLightfv(16385, 4609, Static291.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!bga", name = "U", descriptor = "(I)V")
	private void method1590() {
		if (this.aBoolean136) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass286_4.method7446()) {
			if (!this.aBoolean138) {
				OpenGL.glLoadMatrixf(super.aClass30_Sub2_18.method4038(Static522.aFloatArray81), 0);
				this.aBoolean138 = true;
				this.method1526();
				this.method1457();
			}
			if (super.aBoolean113) {
				this.aBoolean136 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass30_Sub2_15.method4038(Static522.aFloatArray81), 0);
				this.aBoolean136 = true;
			}
		} else if (super.aBoolean113) {
			OpenGL.glLoadIdentity();
			this.aBoolean136 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass30_Sub2_15.method4038(Static522.aFloatArray81), 0);
			this.aBoolean136 = false;
		}
	}

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "()V")
	@Override
	protected void method7255() {
		super.method7255();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!bga", name = "o", descriptor = "(I)V")
	@Override
	protected void method1485() {
		super.aFloat53 = super.anInt1567 - super.anInt1548;
		super.aFloat61 = (float) -super.anInt1541 + super.aFloat53;
		if (super.aFloat61 < (float) super.anInt1543) {
			super.aFloat61 = super.anInt1543;
		}
		OpenGL.glFogf(2915, super.aFloat61);
		OpenGL.glFogf(2916, super.aFloat53);
		Static291.aFloatArray54[2] = (float) (super.anInt1563 & 0xFF) / 255.0F;
		Static291.aFloatArray54[0] = (float) (super.anInt1563 & 0xFF0000) / 1.671168E7F;
		Static291.aFloatArray54[1] = (float) (super.anInt1563 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static291.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!bga", name = "o", descriptor = "()Z")
	@Override
	public boolean method7274() {
		return false;
	}

	@OriginalMember(owner = "client!bga", name = "u", descriptor = "(I)V")
	@Override
	protected void method1517() {
		if (super.aBoolean124 && !super.aBoolean126) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bga", name = "G", descriptor = "(I)V")
	@Override
	protected void method1555() {
		if (super.aBoolean133) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!bga", name = "D", descriptor = "(B)V")
	@Override
	protected void method1571() {
		OpenGL.glViewport(super.anInt1578, super.anInt1552, super.anInt1398, super.anInt1428);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!hj;ILclient!uq;IIII)V")
	@Override
	public void method1572(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) byte local23;
		@Pc(21) int local21;
		if (Static545.aClass134_7 == arg0) {
			local23 = 1;
			local21 = arg1 * 2;
		} else if (arg0 == Static481.aClass134_5) {
			local21 = arg1 + 1;
			local23 = 3;
		} else if (arg0 == Static539.aClass134_6) {
			local23 = 4;
			local21 = arg1 * 3;
		} else if (Static150.aClass134_3 == arg0) {
			local23 = 6;
			local21 = arg1 + 2;
		} else if (arg0 == Static465.aClass134_4) {
			local21 = arg1 + 2;
			local23 = 5;
		} else {
			local21 = arg1;
			local23 = 0;
		}
		@Pc(74) Class26 local74 = arg2.method6478();
		@Pc(77) Class28_Sub2 local77 = (Class28_Sub2) arg2;
		local77.method6077();
		OpenGL.glDrawElements(local23, local21, Static378.method2837(local74), local77.method6073() + (long) (arg4 * local74.anInt622));
	}

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "(B)V")
	@Override
	protected void method1457() {
		this.method1576();
		@Pc(18) int local18;
		for (local18 = 0; super.anInt1566 > local18; local18++) {
			@Pc(25) Class2_Sub1 local25 = super.aClass2_Sub1Array3[local18];
			@Pc(29) int local29 = local25.method3965();
			@Pc(33) int local33 = local18 + 16386;
			@Pc(39) float local39 = local25.method3966() / 255.0F;
			Static291.aFloatArray54[0] = local25.method3969();
			Static291.aFloatArray54[1] = local25.method3967();
			Static291.aFloatArray54[2] = local25.method3962();
			Static291.aFloatArray54[3] = 1.0F;
			OpenGL.glLightfv(local33, 4611, Static291.aFloatArray54, 0);
			Static291.aFloatArray54[2] = (float) (local29 & 0xFF) * local39;
			Static291.aFloatArray54[1] = local39 * (float) (local29 >> 8 & 0xFF);
			Static291.aFloatArray54[0] = (float) (local29 >> 16 & 0xFF) * local39;
			Static291.aFloatArray54[3] = 1.0F;
			OpenGL.glLightfv(local33, 4609, Static291.aFloatArray54, 0);
			OpenGL.glLightf(local33, 4617, 1.0F / (float) (local25.method3968() * local25.method3968()));
			OpenGL.glEnable(local33);
		}
		while (super.anInt1556 > local18) {
			OpenGL.glDisable(local18 + 16386);
			local18++;
		}
		super.method1457();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method1478(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "()V")
	@Override
	public void method7236() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZLclient!wq;Lclient!baa;)Z")
	@Override
	public boolean method1565(@OriginalArg(1) Class375 arg0, @OriginalArg(2) Class26 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILclient!hj;Z)V")
	@Override
	public void method1533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2) {
		@Pc(22) byte local22;
		@Pc(26) int local26;
		if (arg2 == Static545.aClass134_7) {
			local26 = arg0 * 2;
			local22 = 1;
		} else if (Static481.aClass134_5 == arg2) {
			local26 = arg0 + 1;
			local22 = 3;
		} else if (Static539.aClass134_6 == arg2) {
			local22 = 4;
			local26 = arg0 * 3;
		} else if (arg2 == Static150.aClass134_3) {
			local22 = 6;
			local26 = arg0 + 2;
		} else if (Static465.aClass134_4 == arg2) {
			local26 = arg0 + 2;
			local22 = 5;
		} else {
			local26 = arg0;
			local22 = 0;
		}
		OpenGL.glDrawArrays(local22, arg1, local26);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([[IZII)Lclient!nj;")
	@Override
	public Interface19 method1534(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class38_Sub2(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!wq;II[FZIII)Lclient!wfa;")
	@Override
	protected Interface27 method1489(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean144 || Static468.method7401(arg1) && Static468.method7401(arg4)) {
			return new Class38_Sub1(this, arg0, arg1, arg4, arg3, arg2, 0, 0);
		} else if (this.aBoolean139) {
			return new Class38_Sub4(this, arg0, arg1, arg4, arg2, 0, 0);
		} else {
			@Pc(47) Class38_Sub1 local47 = new Class38_Sub1(this, arg0, Static29.aClass26_8, Static231.method4407(arg1), Static231.method4407(arg4));
			local47.method1754(arg2, arg0, arg1, arg4);
			return local47;
		}
	}

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "()Z")
	@Override
	public boolean method7269() {
		return false;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)Lclient!fj;")
	@Override
	protected Class17 method1466(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class17_Sub9(this, super.aClass157_32);
		} else if (arg0 == 4) {
			return new Class17_Sub10(this, super.aClass157_32, super.aClass347_3);
		} else if (arg0 == 8) {
			return new Class17_Sub7(this, super.aClass157_32, super.aClass347_3);
		} else {
			return super.method1466(arg0);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[IZBIII)Lclient!wfa;")
	@Override
	public Interface27 method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean144 || Static468.method7401(arg0) && Static468.method7401(arg5)) {
			return new Class38_Sub1(this, arg0, arg5, arg2, arg1, 0, arg4);
		} else if (this.aBoolean139) {
			return new Class38_Sub4(this, arg0, arg5, arg1, 0, arg4);
		} else {
			@Pc(49) Class38_Sub1 local49 = new Class38_Sub1(this, Static354.aClass375_31, Static29.aClass26_4, Static231.method4407(arg0), Static231.method4407(arg5));
			local49.method8302(arg4, arg1, 0, arg0, 0, arg5);
			return local49;
		}
	}

	@OriginalMember(owner = "client!bga", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)V")
	@Override
	public void method7229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!bga", name = "q", descriptor = "()V")
	@Override
	public void method7276() {
		if (super.anInt1398 <= 0 && super.anInt1428 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt1549;
		@Pc(22) int local22 = super.anInt1579;
		@Pc(25) int local25 = super.anInt1571;
		@Pc(28) int local28 = super.anInt1544;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method1566();
		this.method1472(false);
		this.method1500(false);
		this.method1524(false);
		this.method1580(false);
		this.method1484(null);
		this.method1448(false, false, -2);
		this.method1557(1);
		this.method1451(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt1398, super.anInt1428, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!bga", name = "Q", descriptor = "(I)V")
	@Override
	protected void method1581() {
		if (super.aBoolean118) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!bga", name = "l", descriptor = "(II)V")
	public synchronized void method1591(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong278 = arg0;
		this.aClass341_17.method8528(local7);
	}

	@OriginalMember(owner = "client!bga", name = "p", descriptor = "(I)V")
	@Override
	protected void method1493() {
		if (super.aBoolean130) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!kf;IBZ)V")
	@Override
	protected void method1463(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static28.method687(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7310(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7229(arg2, arg3);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method1496(@OriginalArg(1) Class22 arg0) {
		@Pc(9) Class168[] local9 = ((Class22_Sub1) arg0).aClass168Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class168 local25 = local9[local19];
			@Pc(30) Class28_Sub1 local30 = this.aClass28_Sub1Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method768();
			@Pc(40) long local40 = local30.method6073();
			local30.method6077();
			for (@Pc(45) int local45 = 0; local25.method4915() > local45; local45++) {
				@Pc(52) Class69 local52 = local25.method4914(local45);
				if (local52 == Static88.aClass69_1) {
					OpenGL.glVertexPointer(3, 5126, local36, (long) local32 + local40);
					local17 = true;
				} else if (Static88.aClass69_2 == local52) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local36, (long) local32 + local40);
				} else if (local52 == Static88.aClass69_3) {
					OpenGL.glColorPointer(4, 5121, local36, (long) local32 + local40);
					local13 = true;
				} else if (Static88.aClass69_4 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, (long) local32 + local40);
				} else if (Static88.aClass69_5 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, (long) local32 + local40);
				} else if (Static88.aClass69_6 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, (long) local32 + local40);
				} else if (local52 == Static88.aClass69_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, local40 + (long) local32);
				}
				local32 += local52.anInt2606;
			}
		}
		if (this.aBoolean135 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean135 = local17;
		}
		if (this.aBoolean137 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean137 = local15;
		}
		if (local13 != this.aBoolean134) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean134 = local13;
		}
		@Pc(258) int local258;
		if (this.anInt1666 < local11) {
			for (local258 = this.anInt1666; local258 < local11; local258++) {
				OpenGL.glClientActiveTexture(local258 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt1666 = local11;
		} else if (this.anInt1666 > local11) {
			for (local258 = local11; local258 < this.anInt1666; local258++) {
				OpenGL.glClientActiveTexture(local258 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt1666 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IZ)Lclient!uq;")
	@Override
	public Interface24 method1474(@OriginalArg(1) boolean arg0) {
		return new Class28_Sub2(this, Static29.aClass26_5, arg0);
	}

	@OriginalMember(owner = "client!bga", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt1669;
	}

	@OriginalMember(owner = "client!bga", name = "j", descriptor = "(Z)V")
	@Override
	protected void method1502() {
		OpenGL.glActiveTexture(super.anInt1574 + 33984);
	}

	@OriginalMember(owner = "client!bga", name = "z", descriptor = "(I)V")
	@Override
	protected void method1532() {
		this.aBoolean138 = false;
		this.method1590();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7303(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method1545(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!bga", name = "P", descriptor = "(I)V")
	@Override
	protected void method1579() {
		Static291.aFloatArray54[1] = (float) (super.anInt1555 & 0xFF00) / 65280.0F;
		Static291.aFloatArray54[2] = (float) (super.anInt1555 & 0xFF) / 255.0F;
		Static291.aFloatArray54[3] = (float) (super.anInt1555 >>> 24) / 255.0F;
		Static291.aFloatArray54[0] = (float) (super.anInt1555 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static291.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!bga", name = "x", descriptor = "(I)V")
	@Override
	public void method1526() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray33, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray25, 0);
	}

	@OriginalMember(owner = "client!bga", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!bga", name = "p", descriptor = "()V")
	@Override
	public void method7275() {
	}

	@OriginalMember(owner = "client!bga", name = "E", descriptor = "(B)V")
	@Override
	protected void method1573() {
		if (super.aBoolean123) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!bga", name = "A", descriptor = "()V")
	@Override
	public void method7313() {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBILclient!baa;Lclient!wq;)Lclient!wfa;")
	@Override
	public Interface27 method1495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class375 arg3) {
		if (this.aBoolean144 || Static468.method7401(arg1) && Static468.method7401(arg0)) {
			return new Class38_Sub1(this, arg3, arg2, arg1, arg0);
		} else if (this.aBoolean139) {
			return new Class38_Sub4(this, arg3, arg2, arg1, arg0);
		} else {
			return new Class38_Sub1(this, arg3, arg2, Static231.method4407(arg1), Static231.method4407(arg0));
		}
	}

	@OriginalMember(owner = "client!bga", name = "v", descriptor = "()V")
	@Override
	public void method7301() {
	}

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "(I)V")
	@Override
	protected void method1522() {
		OpenGL.glScissor(super.anInt1578 + super.anInt1549, -super.anInt1544 + (super.anInt1552 - -super.anInt1428), -super.anInt1549 + super.anInt1579, super.anInt1544 - super.anInt1571);
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(Z)V")
	@Override
	public void method7250(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "S", descriptor = "(I)V")
	@Override
	protected void method1584() {
		if (Static142.aClass266_4 == super.aClass266_3) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static288.aClass266_5 == super.aClass266_3) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static586.aClass266_7 == super.aClass266_3) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(ZI)Lclient!tc;")
	@Override
	public Interface22 method1523(@OriginalArg(0) boolean arg0) {
		return new Class28_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!bga", name = "i", descriptor = "(Z)F")
	@Override
	protected float method1492() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!bga", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt1428 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt1667, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!is;)V")
	@Override
	public void method7290(@OriginalArg(0) Interface14 arg0) {
	}
}
