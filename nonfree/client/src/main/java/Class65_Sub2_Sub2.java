import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class65_Sub2_Sub2 extends Class65_Sub2 {

	@OriginalMember(owner = "client!jc", name = "Ai", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!jc", name = "Bi", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!jc", name = "Ci", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!jc", name = "Di", descriptor = "Z")
	private boolean aBoolean451;

	@OriginalMember(owner = "client!jc", name = "Ei", descriptor = "I")
	private int anInt5362;

	@OriginalMember(owner = "client!jc", name = "Gi", descriptor = "Z")
	private boolean aBoolean452;

	@OriginalMember(owner = "client!jc", name = "Hi", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!jc", name = "ri", descriptor = "Lclient!fca;")
	private final Class114 aClass114_30 = new Class114();

	@OriginalMember(owner = "client!jc", name = "ti", descriptor = "Lclient!fca;")
	private final Class114 aClass114_31 = new Class114();

	@OriginalMember(owner = "client!jc", name = "ui", descriptor = "Lclient!fca;")
	private final Class114 aClass114_32 = new Class114();

	@OriginalMember(owner = "client!jc", name = "vi", descriptor = "Lclient!fca;")
	private final Class114 aClass114_33 = new Class114();

	@OriginalMember(owner = "client!jc", name = "wi", descriptor = "Lclient!fca;")
	private final Class114 aClass114_34 = new Class114();

	@OriginalMember(owner = "client!jc", name = "xi", descriptor = "Lclient!fca;")
	private final Class114 aClass114_35 = new Class114();

	@OriginalMember(owner = "client!jc", name = "yi", descriptor = "Lclient!fca;")
	private final Class114 aClass114_36 = new Class114();

	@OriginalMember(owner = "client!jc", name = "Fi", descriptor = "[Lclient!uia;")
	private final Class31_Sub2[] aClass31_Sub2Array1 = new Class31_Sub2[16];

	@OriginalMember(owner = "client!jc", name = "zi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!jc", name = "Ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!jc", name = "Ri", descriptor = "I")
	private final int anInt5365 = 0;

	@OriginalMember(owner = "client!jc", name = "mi", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!jc", name = "Oi", descriptor = "Ljava/lang/String;")
	private final String aString40;

	@OriginalMember(owner = "client!jc", name = "Ui", descriptor = "Ljava/lang/String;")
	private final String aString41;

	@OriginalMember(owner = "client!jc", name = "Li", descriptor = "I")
	private final int anInt5363;

	@OriginalMember(owner = "client!jc", name = "Ji", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!jc", name = "Ni", descriptor = "Z")
	private boolean aBoolean456;

	@OriginalMember(owner = "client!jc", name = "Ki", descriptor = "Z")
	private final boolean aBoolean455;

	@OriginalMember(owner = "client!jc", name = "Si", descriptor = "Z")
	public final boolean aBoolean458;

	@OriginalMember(owner = "client!jc", name = "Ti", descriptor = "Z")
	public final boolean aBoolean459;

	@OriginalMember(owner = "client!jc", name = "Pi", descriptor = "Z")
	public final boolean aBoolean457;

	@OriginalMember(owner = "client!jc", name = "Mi", descriptor = "[I")
	public final int[] anIntArray293;

	@OriginalMember(owner = "client!jc", name = "Qi", descriptor = "I")
	public final int anInt5364;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!wm;I)V")
	public Class65_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class390 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString40 = OpenGL.glGetString(7936).toLowerCase();
			this.aString41 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString40.indexOf("microsoft") != -1 || this.aString40.indexOf("brian paul") != -1 || this.aString40.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(107) String local107 = OpenGL.glGetString(7938);
			@Pc(115) String[] local115 = Static147.method2668(' ', local107.replace('.', ' '));
			if (local115.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(138) int local138;
			try {
				@Pc(132) int local132 = Static270.method4173(local115[0]);
				local138 = Static270.method4173(local115[1]);
				this.anInt5363 = local138 + local132 * 10;
			} catch (@Pc(147) NumberFormatException local147) {
				throw new RuntimeException("");
			}
			if (this.anInt5363 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(186) int[] local186 = new int[1];
				OpenGL.glGetIntegerv(34018, local186, 0);
				super.anInt5257 = local186[0];
				if (super.anInt5257 < 2) {
					throw new RuntimeException("");
				}
				super.anInt5241 = 8;
				this.aBoolean454 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean447 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean456 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean429 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean455 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean445 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean458 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean459 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean457 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray293 = new int[super.anInt5257];
				this.anInt5364 = Stream.c() ? 33639 : 5121;
				if (this.aString41.indexOf("radeon") != -1) {
					local138 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static147.method2668(' ', this.aString41.replace('/', ' '));
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(308) String local308 = local301[local303];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static414.method6154(local308.substring(1, 3))) {
									local308 = local308.substring(1);
									local292 = true;
								}
								if (local308.equals("hd")) {
									local290 = true;
								} else {
									if (local308.startsWith("hd")) {
										local308 = local308.substring(2);
										local290 = true;
									}
									if (local308.length() >= 4 && Static414.method6154(local308.substring(0, 4))) {
										local138 = Static270.method4173(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(374) Exception local374) {
						}
					}
					if (!local292 && !local290) {
						if (local138 >= 7000 && local138 <= 7999) {
							this.aBoolean454 = false;
						}
						if (local138 >= 7000 && local138 <= 9250) {
							super.aBoolean445 = false;
						}
					}
					this.aBoolean456 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString40.indexOf("intel");
				if (this.aBoolean454) {
					try {
						@Pc(430) int[] local430 = new int[1];
						OpenGL.glGenBuffersARB(1, local430, 0);
					} catch (@Pc(436) Throwable local436) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(442) Throwable local442) {
			local442.printStackTrace();
			this.method6923();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "(I)V")
	@Override
	protected void method4475() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray46, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!co;I)V")
	@Override
	public void method4447(@OriginalArg(0) Class69 arg0) {
		@Pc(9) Class219[] local9 = ((Class69_Sub1) arg0).aClass219Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class219 local25 = local9[local19];
			@Pc(30) Class31_Sub2 local30 = this.aClass31_Sub2Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(38) int local38 = local30.method8248();
			@Pc(42) long local42 = local30.method8236();
			local30.method8240();
			for (@Pc(47) int local47 = 0; local25.method5341() > local47; local47++) {
				@Pc(54) Class281 local54 = local25.method5340(local47);
				if (local54 == Static456.aClass281_1) {
					OpenGL.glVertexPointer(3, 5126, local38, (long) local32 + local42);
					local17 = true;
				} else if (local54 == Static456.aClass281_2) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local38, (long) local32 + local42);
				} else if (Static456.aClass281_3 == local54) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local38, (long) local32 + local42);
				} else if (local54 == Static456.aClass281_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local38, local42 + (long) local32);
				} else if (Static456.aClass281_5 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local38, local42 + (long) local32);
				} else if (Static456.aClass281_6 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local38, (long) local32 + local42);
				} else if (Static456.aClass281_7 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local38, local42 + (long) local32);
				}
				local32 += local54.anInt7743;
			}
		}
		if (local17 != this.aBoolean453) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean453 = local17;
		}
		if (this.aBoolean452 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean452 = local15;
		}
		if (local13 != this.aBoolean449) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean449 = local13;
		}
		@Pc(261) int local261;
		if (local11 > this.anInt5362) {
			for (local261 = this.anInt5362; local261 < local11; local261++) {
				OpenGL.glClientActiveTexture(local261 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt5362 = local11;
		} else if (local11 < this.anInt5362) {
			for (local261 = local11; local261 < this.anInt5362; local261++) {
				OpenGL.glClientActiveTexture(local261 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt5362 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILclient!hu;ZLclient!jj;I)V")
	@Override
	public void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) Interface12 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static493.aClass155_5 == arg3) {
			local10 = 1;
			local14 = arg5 * 2;
		} else if (Static106.aClass155_2 == arg3) {
			local10 = 3;
			local14 = arg5 + 1;
		} else if (Static72.aClass155_1 == arg3) {
			local10 = 4;
			local14 = arg5 * 3;
		} else if (Static504.aClass155_6 == arg3) {
			local10 = 6;
			local14 = arg5 + 2;
		} else if (Static246.aClass155_3 == arg3) {
			local10 = 5;
			local14 = arg5 + 2;
		} else {
			local10 = 0;
			local14 = arg5;
		}
		@Pc(68) Class89 local68 = arg4.method902();
		@Pc(71) Class31_Sub1 local71 = (Class31_Sub1) arg4;
		local71.method8240();
		OpenGL.glDrawElements(local10, local14, Static439.method6408(local68), local71.method8236() + (long) (arg0 * local68.anInt2489));
	}

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "()V")
	@Override
	public void method6959() {
	}

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "(I)V")
	@Override
	protected void method4393() {
		Static618.aFloatArray93[2] = super.aFloat112 * super.aFloat99;
		Static618.aFloatArray93[1] = super.aFloat99 * super.aFloat107;
		Static618.aFloatArray93[3] = 1.0F;
		Static618.aFloatArray93[0] = super.aFloat106 * super.aFloat99;
		OpenGL.glLightModelfv(2899, Static618.aFloatArray93, 0);
	}

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "()V")
	@Override
	public void method6940() {
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "()V")
	@Override
	public void method6909() {
		if (super.anInt5222 <= 0 && super.anInt5126 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt5247;
		@Pc(19) int local19 = super.anInt5264;
		@Pc(22) int local22 = super.anInt5261;
		@Pc(25) int local25 = super.anInt5236;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4408();
		this.method4366(false);
		this.method4372(false);
		this.method4433(false);
		this.method4445(false);
		this.method4426((Interface25) null);
		this.method4446(false, -2, false);
		this.method4405(1);
		this.method4419(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt5222, super.anInt5126, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "(I)V")
	@Override
	protected void method4409() {
		OpenGL.glScissor(super.anInt5274 + super.anInt5247, -super.anInt5236 + super.anInt5126 + super.anInt5249, -super.anInt5247 + super.anInt5264, -super.anInt5261 + super.anInt5236);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)Lclient!od;")
	@Override
	public Interface19 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6918(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub47 local19;
		while (!this.aClass114_31.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_31.method2813();
			Static94.anIntArray77[local7++] = (int) local19.aLong307;
			super.anInt5231 -= local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static94.anIntArray77, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static94.anIntArray77, 0);
			local7 = 0;
		}
		while (!this.aClass114_32.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_32.method2813();
			Static94.anIntArray77[local7++] = (int) local19.aLong307;
			super.anInt5229 -= local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static94.anIntArray77, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static94.anIntArray77, 0);
			local7 = 0;
		}
		while (!this.aClass114_33.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_33.method2813();
			Static94.anIntArray77[local7++] = local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static94.anIntArray77, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static94.anIntArray77, 0);
			local7 = 0;
		}
		while (!this.aClass114_34.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_34.method2813();
			Static94.anIntArray77[local7++] = (int) local19.aLong307;
			super.anInt5234 -= local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static94.anIntArray77, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static94.anIntArray77, 0);
		}
		while (!this.aClass114_30.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_30.method2813();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt8308);
		}
		@Pc(223) Class5 local223;
		while (!this.aClass114_35.method2810()) {
			local223 = this.aClass114_35.method2813();
			OpenGL.glDeleteProgramARB((int) local223.aLong307);
		}
		while (!this.aClass114_36.method2810()) {
			local223 = this.aClass114_36.method2813();
			OpenGL.glDeleteObjectARB(local223.aLong307);
		}
		while (!this.aClass114_30.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_30.method2813();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt8308);
		}
		if (this.E() > 100663296 && this.aLong129 + 60000L < Static547.method7619()) {
			System.gc();
			this.aLong129 = Static547.method7619();
		}
		super.method6918(local11);
	}

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(ZI)V")
	@Override
	public void method4436(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "(I)V")
	@Override
	protected void method4357() {
		OpenGL.glActiveTexture(super.anInt5239 + 33984);
	}

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "()Z")
	@Override
	public boolean method6934() {
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(B)V")
	@Override
	protected void method4430() {
		for (@Pc(6) int local6 = super.anInt5257 - 1; local6 >= 0; local6--) {
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
		for (@Pc(79) int local79 = 0; local79 < 8; local79++) {
			@Pc(85) int local85 = local79 + 16384;
			OpenGL.glLightfv(local85, 4608, local77, 0);
			OpenGL.glLightf(local85, 4615, 0.0F);
			OpenGL.glLightf(local85, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method4430();
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(ZI)V")
	@Override
	public void method4382(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!iea;I)V")
	@Override
	public void method4347(@OriginalArg(0) Class162 arg0) {
		if (arg0 == Static407.aClass162_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static80.method1040(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(B)V")
	@Override
	protected void method4428() {
		this.method4484();
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(Z)V")
	@Override
	protected void method4465() {
		@Pc(9) int local9 = this.anIntArray293[super.anInt5239];
		if (local9 != 0) {
			this.anIntArray293[super.anInt5239] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZLclient!cja;I)V")
	@Override
	protected void method4362(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static211.method3347(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)Lclient!cq;")
	@Override
	public Interface3 method4374(@OriginalArg(1) boolean arg0) {
		return new Class31_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "(I)V")
	@Override
	protected void method4403() {
		if (super.aBoolean448) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(B)V")
	@Override
	protected void method4416() {
		if (super.aBoolean434) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!md;)V")
	@Override
	public void method6877(@OriginalArg(0) Interface15 arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6888(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(B)V")
	@Override
	protected void method4407() {
		if (super.aBoolean433) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!jc", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt5126 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt5364, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "(I)V")
	private void method4484() {
		if (this.aBoolean450) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass173_4.method4244()) {
			if (!this.aBoolean451) {
				OpenGL.glLoadMatrixf(super.aClass254_Sub2_18.method6231(Static105.aFloatArray30), 0);
				this.aBoolean451 = true;
				this.method4389();
				this.method4438();
			}
			if (super.aBoolean427) {
				this.aBoolean450 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass254_Sub2_15.method6231(Static105.aFloatArray30), 0);
				this.aBoolean450 = true;
			}
		} else if (super.aBoolean427) {
			OpenGL.glLoadIdentity();
			this.aBoolean450 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass254_Sub2_15.method6231(Static105.aFloatArray30), 0);
			this.aBoolean450 = false;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method4386(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local10);
	}

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "(I)V")
	@Override
	protected void method4355() {
		OpenGL.glDepthMask(super.aBoolean442 && super.aBoolean439);
	}

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "(I)F")
	@Override
	protected float method4441() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BILclient!tn;ZIIIB)Lclient!w;")
	@Override
	protected Interface27 method4365(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class339 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean455 || Static111.method4954(arg4) && Static111.method4954(arg3)) {
			return new Class203_Sub2(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
		} else if (this.aBoolean456) {
			return new Class203_Sub1(this, arg1, arg4, arg3, arg0, 0, 0);
		} else {
			@Pc(47) Class203_Sub2 local47 = new Class203_Sub2(this, arg1, Static120.aClass89_7, Static67.method917(arg4), Static67.method917(arg3));
			local47.method5621(arg1, 0, arg3, arg0, arg4);
			return local47;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6912(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6916(arg2, arg3);
	}

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "(B)V")
	@Override
	protected void method4454() {
		if (super.aBoolean440) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(I)V")
	@Override
	protected void method4351() {
		this.aBoolean451 = false;
		this.method4484();
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "()V")
	@Override
	protected void method6904() {
		super.method6904();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	@Override
	protected void method4375() {
		super.aFloat97 = (float) (super.anInt5260 - super.anInt5250);
		super.aFloat102 = (float) -super.anInt5263 + super.aFloat97;
		if ((float) super.anInt5242 > super.aFloat102) {
			super.aFloat102 = (float) super.anInt5242;
		}
		OpenGL.glFogf(2915, super.aFloat102);
		OpenGL.glFogf(2916, super.aFloat97);
		Static618.aFloatArray93[1] = (float) (super.anInt5246 & 0xFF00) / 65280.0F;
		Static618.aFloatArray93[0] = (float) (super.anInt5246 & 0xFF0000) / 1.671168E7F;
		Static618.aFloatArray93[2] = (float) (super.anInt5246 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static618.aFloatArray93, 0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()Lclient!fga;")
	@Override
	public Class118 method6878() {
		@Pc(7) int local7 = -1;
		if (this.aString40.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString40.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString40.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class118(local7, "OpenGL", this.anInt5363, this.aString41, 0L);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[Lclient!ls;)Lclient!co;")
	@Override
	public Class69 method4463(@OriginalArg(1) Class219[] arg0) {
		return new Class69_Sub1(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "(I)V")
	@Override
	protected void method4368() {
		OpenGL.glViewport(super.anInt5274, super.anInt5249, super.anInt5222, super.anInt5126);
	}

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "(I)V")
	@Override
	protected void method4452() {
		OpenGL.glTexEnvi(8960, 34161, Static347.method5295(super.aClass178Array5[super.anInt5239]));
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BJ)V")
	public synchronized void method4486(@OriginalArg(1) long arg0) {
		@Pc(14) Class5 local14 = new Class5();
		local14.aLong307 = arg0;
		this.aClass114_36.method2807(local14);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)Lclient!jj;")
	@Override
	public Interface12 method4364(@OriginalArg(0) boolean arg0) {
		return new Class31_Sub1(this, Static120.aClass89_8, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "()Z")
	@Override
	public boolean method6929() {
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "(I)V")
	@Override
	protected void method4370() {
		if (super.aBoolean446) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(I)V")
	@Override
	protected void method4349() {
		OpenGL.glTexEnvi(8960, 34162, Static347.method5295(super.aClass178Array6[super.anInt5239]));
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([[IIZI)Lclient!lha;")
	@Override
	public Interface14 method4387(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class203_Sub4(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4473(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL2.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lclient!tu;")
	@Override
	protected Class18 method4354(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class18_Sub6(this, super.aClass390_68);
		} else if (arg0 == 4) {
			return new Class18_Sub1(this, super.aClass390_68, super.aClass179_5);
		} else if (arg0 == 8) {
			return new Class18_Sub10(this, super.aClass390_68, super.aClass179_5);
		} else {
			return super.method4354(arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(B)V")
	@Override
	protected void method4438() {
		this.method4443();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt5235; local10++) {
			@Pc(17) Class5_Sub18 local17 = super.aClass5_Sub18Array4[local10];
			@Pc(21) int local21 = local17.method8058();
			@Pc(26) int local26 = local10 + 16386;
			@Pc(32) float local32 = local17.method8054() / 255.0F;
			Static618.aFloatArray93[0] = (float) local17.method8055();
			Static618.aFloatArray93[1] = (float) local17.method8051();
			Static618.aFloatArray93[2] = (float) local17.method8057();
			Static618.aFloatArray93[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static618.aFloatArray93, 0);
			Static618.aFloatArray93[2] = (float) (local21 & 0xFF) * local32;
			Static618.aFloatArray93[1] = local32 * (float) (local21 >> 8 & 0xFF);
			Static618.aFloatArray93[3] = 1.0F;
			Static618.aFloatArray93[0] = (float) (local21 >> 16 & 0xFF) * local32;
			OpenGL.glLightfv(local26, 4609, Static618.aFloatArray93, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local17.method8056() * local17.method8056()));
			OpenGL.glEnable(local26);
		}
		while (super.anInt5272 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method4438();
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
	@Override
	protected void method4383() {
	}

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "(I)V")
	@Override
	protected void method4437() {
		if (super.aBoolean436 && !super.aBoolean431) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!tn;BLclient!ds;)Z")
	@Override
	public boolean method4359(@OriginalArg(0) Class339 arg0, @OriginalArg(2) Class89 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method4415(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI[FIILclient!tn;I)Lclient!w;")
	@Override
	protected Interface27 method4474(@OriginalArg(1) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class339 arg4) {
		if (this.aBoolean455 || Static111.method4954(arg3) && Static111.method4954(arg2)) {
			return new Class203_Sub2(this, arg4, arg3, arg2, arg0, arg1, 0, 0);
		} else if (this.aBoolean456) {
			return new Class203_Sub1(this, arg4, arg3, arg2, arg1, 0, 0);
		} else {
			@Pc(47) Class203_Sub2 local47 = new Class203_Sub2(this, arg4, Static120.aClass89_11, Static67.method917(arg3), Static67.method917(arg2));
			local47.method5554(arg1, arg4, arg3, arg2);
			return local47;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!hu;ZII)V")
	@Override
	public void method4450(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) byte local25;
		@Pc(23) int local23;
		if (arg0 == Static493.aClass155_5) {
			local25 = 1;
			local23 = arg2 * 2;
		} else if (Static106.aClass155_2 == arg0) {
			local23 = arg2 + 1;
			local25 = 3;
		} else if (arg0 == Static72.aClass155_1) {
			local23 = arg2 * 3;
			local25 = 4;
		} else if (Static504.aClass155_6 == arg0) {
			local23 = arg2 + 2;
			local25 = 6;
		} else if (arg0 == Static246.aClass155_3) {
			local25 = 5;
			local23 = arg2 + 2;
		} else {
			local25 = 0;
			local23 = arg2;
		}
		OpenGL.glDrawArrays(local25, arg1, local23);
	}

	@OriginalMember(owner = "client!jc", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!od;Lclient!ic;)Lclient!md;")
	@Override
	public Interface15 method6942(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(Z)V")
	@Override
	protected void method4467() {
		Static618.aFloatArray93[3] = (float) (super.anInt5273 >>> 24) / 255.0F;
		Static618.aFloatArray93[0] = (float) (super.anInt5273 & 0xFF0000) / 1.671168E7F;
		Static618.aFloatArray93[2] = (float) (super.anInt5273 & 0xFF) / 255.0F;
		Static618.aFloatArray93[1] = (float) (super.anInt5273 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static618.aFloatArray93, 0);
	}

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "(I)V")
	@Override
	protected void method4381() {
		OpenGL.glMatrixMode(5890);
		if (Static378.aClass198_2 == super.aClass198Array3[super.anInt5239]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass254_Sub2Array3[super.anInt5239].method6231(Static105.aFloatArray30), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4373(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(II)V")
	@Override
	public void method6916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "(I)V")
	@Override
	protected void method4444() {
		if (super.aClass239_6 == Static49.aClass239_1) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static625.aClass239_7 == super.aClass239_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static204.aClass239_4 == super.aClass239_6) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)V")
	public synchronized void method4488(@OriginalArg(0) int arg0) {
		@Pc(13) Class5 local13 = new Class5();
		local13.aLong307 = (long) arg0;
		this.aClass114_35.method2807(local13);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public synchronized void method4489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5_Sub47 local16 = new Class5_Sub47(arg1);
		local16.aLong307 = (long) arg0;
		this.aClass114_32.method2807(local16);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!tea;Lclient!tea;FLclient!tea;)Lclient!tea;")
	@Override
	public Class57 method6949(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public synchronized void method4490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub47 local12 = new Class5_Sub47(arg0);
		local12.aLong307 = (long) arg1;
		this.aClass114_31.method2807(local12);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	@Override
	public void method6944(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILclient!cq;)V")
	@Override
	public void method4427(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1) {
		this.aClass31_Sub2Array1[arg0] = (Class31_Sub2) arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!tn;I[BI)Lclient!ii;")
	@Override
	public Interface10 method4350(@OriginalArg(2) Class339 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class203_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "(I)V")
	@Override
	protected void method4440() {
		if (super.aBoolean430 && super.aBoolean441 && super.anInt5263 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ds;IILclient!tn;)Lclient!w;")
	@Override
	public Interface27 method4348(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class339 arg3) {
		if (this.aBoolean455 || Static111.method4954(arg0) && Static111.method4954(arg2)) {
			return new Class203_Sub2(this, arg3, arg1, arg0, arg2);
		} else if (this.aBoolean456) {
			return new Class203_Sub1(this, arg3, arg1, arg0, arg2);
		} else {
			return new Class203_Sub2(this, arg3, arg1, Static67.method917(arg0), Static67.method917(arg2));
		}
	}

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "(I)V")
	@Override
	public void method4389() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray50, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray48, 0);
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(II)Lclient!ic;")
	@Override
	public Interface9 method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!cja;ZZ)V")
	@Override
	public void method4388(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static211.method3347(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!jc", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4445(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt5365;
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "(B)V")
	@Override
	protected void method4448() {
		Static618.aFloatArray93[0] = super.aFloat101 * super.aFloat106;
		Static618.aFloatArray93[3] = 1.0F;
		Static618.aFloatArray93[2] = super.aFloat101 * super.aFloat112;
		Static618.aFloatArray93[1] = super.aFloat107 * super.aFloat101;
		OpenGL.glLightfv(16384, 4609, Static618.aFloatArray93, 0);
		Static618.aFloatArray93[3] = 1.0F;
		Static618.aFloatArray93[1] = super.aFloat107 * -super.aFloat104;
		Static618.aFloatArray93[2] = -super.aFloat104 * super.aFloat112;
		Static618.aFloatArray93[0] = super.aFloat106 * -super.aFloat104;
		OpenGL.glLightfv(16385, 4609, Static618.aFloatArray93, 0);
	}

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "()V")
	@Override
	public void method6910() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIB[III)Lclient!w;")
	@Override
	public Interface27 method4464(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean455 || Static111.method4954(arg2) && Static111.method4954(arg4)) {
			return new Class203_Sub2(this, arg2, arg4, arg0, arg3, 0, arg5);
		} else if (this.aBoolean456) {
			return new Class203_Sub1(this, arg2, arg4, arg3, 0, arg5);
		} else {
			@Pc(46) Class203_Sub2 local46 = new Class203_Sub2(this, Static435.aClass339_15, Static120.aClass89_7, Static67.method917(arg2), Static67.method917(arg4));
			local46.method5620(arg3, 0, arg4, 0, arg2, arg5);
			return local46;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ds;ILclient!tn;)Z")
	@Override
	public boolean method4424(@OriginalArg(0) Class89 arg0, @OriginalArg(2) Class339 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "()V")
	@Override
	public void method6961() {
	}
}
