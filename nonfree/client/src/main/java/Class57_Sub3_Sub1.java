import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class57_Sub3_Sub1 extends Class57_Sub3 {

	@OriginalMember(owner = "client!rda", name = "ii", descriptor = "Z")
	private boolean aBoolean644;

	@OriginalMember(owner = "client!rda", name = "fh", descriptor = "Z")
	private boolean aBoolean645;

	@OriginalMember(owner = "client!rda", name = "pi", descriptor = "Z")
	private boolean aBoolean646;

	@OriginalMember(owner = "client!rda", name = "ti", descriptor = "Z")
	private boolean aBoolean647;

	@OriginalMember(owner = "client!rda", name = "wi", descriptor = "I")
	private int anInt8650;

	@OriginalMember(owner = "client!rda", name = "wh", descriptor = "Z")
	private boolean aBoolean648;

	@OriginalMember(owner = "client!rda", name = "Ki", descriptor = "J")
	private long aLong254;

	@OriginalMember(owner = "client!rda", name = "ai", descriptor = "Lclient!ef;")
	private final Class102 aClass102_53 = new Class102();

	@OriginalMember(owner = "client!rda", name = "vh", descriptor = "Lclient!ef;")
	private final Class102 aClass102_54 = new Class102();

	@OriginalMember(owner = "client!rda", name = "ri", descriptor = "Lclient!ef;")
	private final Class102 aClass102_55 = new Class102();

	@OriginalMember(owner = "client!rda", name = "di", descriptor = "Lclient!ef;")
	private final Class102 aClass102_56 = new Class102();

	@OriginalMember(owner = "client!rda", name = "Jh", descriptor = "Lclient!ef;")
	private final Class102 aClass102_57 = new Class102();

	@OriginalMember(owner = "client!rda", name = "Vh", descriptor = "Lclient!ef;")
	private final Class102 aClass102_58 = new Class102();

	@OriginalMember(owner = "client!rda", name = "th", descriptor = "Lclient!ef;")
	private final Class102 aClass102_59 = new Class102();

	@OriginalMember(owner = "client!rda", name = "Sh", descriptor = "[Lclient!gr;")
	private final Class93_Sub1[] aClass93_Sub1Array1 = new Class93_Sub1[16];

	@OriginalMember(owner = "client!rda", name = "eh", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!rda", name = "Fi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!rda", name = "Ng", descriptor = "I")
	private final int anInt8652 = 0;

	@OriginalMember(owner = "client!rda", name = "Fh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!rda", name = "Ih", descriptor = "Ljava/lang/String;")
	private final String aString111;

	@OriginalMember(owner = "client!rda", name = "Wi", descriptor = "Ljava/lang/String;")
	private final String aString112;

	@OriginalMember(owner = "client!rda", name = "Mh", descriptor = "I")
	private final int anInt8651;

	@OriginalMember(owner = "client!rda", name = "Qg", descriptor = "Z")
	public boolean aBoolean652;

	@OriginalMember(owner = "client!rda", name = "mi", descriptor = "Z")
	private boolean aBoolean649;

	@OriginalMember(owner = "client!rda", name = "ch", descriptor = "Z")
	private final boolean aBoolean654;

	@OriginalMember(owner = "client!rda", name = "Xg", descriptor = "Z")
	public final boolean aBoolean651;

	@OriginalMember(owner = "client!rda", name = "ph", descriptor = "Z")
	public final boolean aBoolean650;

	@OriginalMember(owner = "client!rda", name = "hi", descriptor = "Z")
	public final boolean aBoolean653;

	@OriginalMember(owner = "client!rda", name = "xi", descriptor = "[I")
	public final int[] anIntArray493;

	@OriginalMember(owner = "client!rda", name = "Oh", descriptor = "I")
	public final int anInt8653;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!la;I)V")
	public Class57_Sub3_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface1 arg3, @OriginalArg(4) Class208 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString111 = OpenGL.glGetString(7936).toLowerCase();
			this.aString112 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString111.indexOf("microsoft") != -1 || this.aString111.indexOf("brian paul") != -1 || this.aString111.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(118) String local118 = OpenGL.glGetString(7938);
			@Pc(126) String[] local126 = Static439.method6502(local118.replace('.', ' '), ' ');
			if (local126.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(144) int local144;
			try {
				@Pc(138) int local138 = Static595.method8613(local126[0]);
				local144 = Static595.method8613(local126[1]);
				this.anInt8651 = local144 + local138 * 10;
			} catch (@Pc(153) NumberFormatException local153) {
				throw new RuntimeException("");
			}
			if (this.anInt8651 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(204) int[] local204 = new int[1];
				OpenGL.glGetIntegerv(34018, local204, 0);
				super.anInt9163 = local204[0];
				if (super.anInt9163 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9159 = 8;
				this.aBoolean652 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean694 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean649 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean696 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean654 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean687 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean651 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean650 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean653 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray493 = new int[super.anInt9163];
				this.anInt8653 = Stream.b() ? 33639 : 5121;
				if (this.aString112.indexOf("radeon") != -1) {
					local144 = 0;
					@Pc(330) boolean local330 = false;
					@Pc(332) boolean local332 = false;
					@Pc(341) String[] local341 = Static439.method6502(this.aString112.replace('/', ' '), ' ');
					for (@Pc(343) int local343 = 0; local343 < local341.length; local343++) {
						@Pc(349) String local349 = local341[local343];
						try {
							if (local349.length() > 0) {
								if (local349.charAt(0) == 'x' && local349.length() >= 3 && Static81.method1263(local349.substring(1, 3))) {
									local332 = true;
									local349 = local349.substring(1);
								}
								if (local349.equals("hd")) {
									local330 = true;
								} else {
									if (local349.startsWith("hd")) {
										local349 = local349.substring(2);
										local330 = true;
									}
									if (local349.length() >= 4 && Static81.method1263(local349.substring(0, 4))) {
										local144 = Static595.method8613(local349.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(426) Exception local426) {
						}
					}
					if (!local332 && !local330) {
						if (local144 >= 7000 && local144 <= 9250) {
							super.aBoolean687 = false;
						}
						if (local144 >= 7000 && local144 <= 7999) {
							this.aBoolean652 = false;
						}
					}
					this.aBoolean649 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString111.indexOf("intel");
				if (this.aBoolean652) {
					try {
						@Pc(494) int[] local494 = new int[1];
						OpenGL.glGenBuffersARB(1, local494, 0);
					} catch (@Pc(500) Throwable local500) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(506) Throwable local506) {
			local506.printStackTrace();
			this.method7722();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "(B)V")
	@Override
	protected void method7851() {
		OpenGL.glDepthMask(super.aBoolean699 && super.aBoolean700);
	}

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "()V")
	@Override
	public void method7729() {
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(B)V")
	@Override
	protected void method7816() {
		if (super.aClass359_7 == Static342.aClass359_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static227.aClass359_2 == super.aClass359_7) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static354.aClass359_5 == super.aClass359_7) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IJ)V")
	public synchronized void method7398(@OriginalArg(1) long arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong314 = arg0;
		this.aClass102_59.method1921(local7);
	}

	@OriginalMember(owner = "client!rda", name = "H", descriptor = "(I)V")
	@Override
	protected void method7846() {
		OpenGL.glTexEnvi(8960, 34162, Static365.method5396(super.aClass34Array5[super.anInt9160]));
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(II)V")
	@Override
	public void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "()V")
	@Override
	protected void method7643() {
		super.method7643();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZLclient!gn;)V")
	@Override
	public void method7745(@OriginalArg(1) Class147 arg0) {
		@Pc(9) Class14[] local9 = ((Class147_Sub1) arg0).aClass14Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class14 local25 = local9[local19];
			@Pc(30) Class93_Sub1 local30 = this.aClass93_Sub1Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method2911();
			@Pc(40) long local40 = local30.method2916();
			local30.method2922();
			for (@Pc(45) int local45 = 0; local45 < local25.method291(); local45++) {
				@Pc(52) Class384 local52 = local25.method294(local45);
				if (Static662.aClass384_1 == local52) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local36, (long) local32 + local40);
				} else if (local52 == Static662.aClass384_2) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local36, local40 + (long) local32);
				} else if (Static662.aClass384_3 == local52) {
					OpenGL.glColorPointer(4, 5121, local36, (long) local32 + local40);
					local13 = true;
				} else if (Static662.aClass384_4 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, local40 + (long) local32);
				} else if (local52 == Static662.aClass384_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, local40 + (long) local32);
				} else if (Static662.aClass384_6 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, (long) local32 + local40);
				} else if (Static662.aClass384_7 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, local40 + (long) local32);
				}
				local32 += local52.anInt10632;
			}
		}
		if (this.aBoolean647 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean647 = local17;
		}
		if (local15 != this.aBoolean645) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean645 = local15;
		}
		if (this.aBoolean644 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean644 = local13;
		}
		@Pc(314) int local314;
		if (local11 > this.anInt8650) {
			for (local314 = this.anInt8650; local314 < local11; local314++) {
				OpenGL.glClientActiveTexture(local314 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt8650 = local11;
		} else if (local11 < this.anInt8650) {
			for (local314 = local11; local314 < this.anInt8650; local314++) {
				OpenGL.glClientActiveTexture(local314 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt8650 = local11;
		}
	}

	@OriginalMember(owner = "client!rda", name = "M", descriptor = "(I)V")
	@Override
	protected void method7830() {
		Static126.aFloatArray19[1] = (float) (super.anInt9155 & 0xFF00) / 65280.0F;
		Static126.aFloatArray19[3] = (float) (super.anInt9155 >>> 24) / 255.0F;
		Static126.aFloatArray19[2] = (float) (super.anInt9155 & 0xFF) / 255.0F;
		Static126.aFloatArray19[0] = (float) (super.anInt9155 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static126.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!rda", name = "J", descriptor = "(I)V")
	@Override
	protected void method7793() {
		super.aFloat170 = (float) (super.bf - super.anInt9148);
		super.aFloat172 = super.aFloat170 - (float) super.anInt9170;
		if (super.aFloat172 < (float) super.anInt9178) {
			super.aFloat172 = (float) super.anInt9178;
		}
		OpenGL.glFogf(2915, super.aFloat172);
		OpenGL.glFogf(2916, super.aFloat170);
		Static126.aFloatArray19[2] = (float) (super.anInt9162 & 0xFF) / 255.0F;
		Static126.aFloatArray19[1] = (float) (super.anInt9162 & 0xFF00) / 65280.0F;
		Static126.aFloatArray19[0] = (float) (super.anInt9162 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static126.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)V")
	@Override
	protected void method7746() {
		Static126.aFloatArray19[0] = super.aFloat171 * super.aFloat165;
		Static126.aFloatArray19[2] = super.aFloat171 * super.aFloat179;
		Static126.aFloatArray19[1] = super.aFloat171 * super.aFloat177;
		Static126.aFloatArray19[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static126.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7757() {
		if (super.aBoolean685) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "(II)V")
	public synchronized void method7399(@OriginalArg(1) int arg0) {
		@Pc(11) Class5 local11 = new Class5();
		local11.aLong314 = (long) arg0;
		this.aClass102_58.method1921(local11);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7660(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class5_Sub29 local19;
		while (!this.aClass102_54.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_54.method1928();
			Static89.anIntArray75[local11++] = (int) local19.aLong314;
			super.anInt9140 -= local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static89.anIntArray75, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static89.anIntArray75, 0);
			local11 = 0;
		}
		while (!this.aClass102_55.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_55.method1928();
			Static89.anIntArray75[local11++] = (int) local19.aLong314;
			super.anInt9142 -= local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static89.anIntArray75, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static89.anIntArray75, 0);
			local11 = 0;
		}
		while (!this.aClass102_56.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_56.method1928();
			Static89.anIntArray75[local11++] = local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static89.anIntArray75, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static89.anIntArray75, 0);
			local11 = 0;
		}
		while (!this.aClass102_57.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_57.method1928();
			Static89.anIntArray75[local11++] = (int) local19.aLong314;
			super.anInt9143 -= local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static89.anIntArray75, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static89.anIntArray75, 0);
		}
		while (!this.aClass102_53.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_53.method1928();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5492);
		}
		@Pc(223) Class5 local223;
		while (!this.aClass102_58.method1926()) {
			local223 = this.aClass102_58.method1928();
			OpenGL.glDeleteProgramARB((int) local223.aLong314);
		}
		while (!this.aClass102_59.method1926()) {
			local223 = this.aClass102_59.method1928();
			OpenGL.glDeleteObjectARB(local223.aLong314);
		}
		while (!this.aClass102_53.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_53.method1928();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5492);
		}
		if (this.E() > 100663296 && Static515.method7499(116) > this.aLong254 + 60000L) {
			System.gc();
			this.aLong254 = Static515.method7499(119);
		}
		super.method7660(local9);
	}

	@OriginalMember(owner = "client!rda", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!sfa;Z)V")
	@Override
	public void method7807(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		this.aClass93_Sub1Array1[arg0] = (Class93_Sub1) arg1;
	}

	@OriginalMember(owner = "client!rda", name = "w", descriptor = "(B)V")
	@Override
	public void method7847() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray92, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray94, 0);
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(Z)V")
	@Override
	protected void method7749() {
		this.method7403();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!jh;I)V")
	@Override
	public void method7778(@OriginalArg(0) Class188 arg0) {
		if (arg0 == Static497.aClass188_46) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(17) int local17 = Static32.method556(arg0);
		OpenGL.glTexGeni(8192, 9472, local17);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local17);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local17);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IZ)Lclient!je;")
	@Override
	public Interface9 method7762(@OriginalArg(1) boolean arg0) {
		return new Class93_Sub2(this, Static453.aClass278_14, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "(Z)V")
	@Override
	protected void method7824() {
		for (@Pc(10) int local10 = super.anInt9163 - 1; local10 >= 0; local10--) {
			OpenGL.glActiveTexture(local10 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		if (false) {
			Static502.aClass259_2 = null;
		}
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
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(102) int local102 = local93 + 16384;
			OpenGL.glLightfv(local102, 4608, local91, 0);
			OpenGL.glLightf(local102, 4615, 0.0F);
			OpenGL.glLightf(local102, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method7824();
	}

	@OriginalMember(owner = "client!rda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7821(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIII[III)Lclient!wp;")
	@Override
	public Interface26 method7748(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean654 || Static45.method8836(arg3) && Static45.method8836(arg5)) {
			return new Class23_Sub2(this, arg3, arg5, arg0, arg4, 0, arg2);
		} else if (this.aBoolean649) {
			return new Class23_Sub1(this, arg3, arg5, arg4, 0, arg2);
		} else {
			@Pc(44) Class23_Sub2 local44 = new Class23_Sub2(this, Static412.aClass114_17, Static453.aClass278_13, Static94.method1393(arg3), Static94.method1393(arg5));
			local44.method4351(arg4, arg2, 0, 0, arg3, arg5);
			return local44;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!rt;IIZ)V")
	@Override
	protected void method7752(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static87.method1315(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7734() {
		if (super.aBoolean681) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "(I)V")
	@Override
	protected void method7849() {
		if (super.aBoolean684) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7754(@OriginalArg(1) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL2.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!rda", name = "E", descriptor = "(B)F")
	@Override
	protected float method7859() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[BIILclient!eu;)Lclient!oea;")
	@Override
	public Interface19 method7868(@OriginalArg(2) byte[] arg0, @OriginalArg(5) Class114 arg1) {
		return new Class23_Sub4(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "(Z)V")
	@Override
	protected void method7804() {
		if (super.aBoolean690) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method7753(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(13) Long local13 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local13)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7659(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "()V")
	@Override
	public void method7718() {
		if (super.anInt9094 <= 0 && super.anInt9025 <= 0) {
			return;
		}
		@Pc(22) int local22 = super.anInt9174;
		@Pc(25) int local25 = super.anInt9176;
		@Pc(28) int local28 = super.anInt9153;
		@Pc(31) int local31 = super.anInt9145;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7772();
		this.method7785(false);
		this.method7820(false);
		this.method7789(false);
		this.method7821(false);
		this.method7813((Interface22) null);
		this.method7827(false, -2, false);
		this.method7764(1);
		this.method7800(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9094, super.anInt9025, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!rda", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7856() {
		Static126.aFloatArray19[3] = 1.0F;
		Static126.aFloatArray19[1] = super.aFloat174 * super.aFloat177;
		Static126.aFloatArray19[0] = super.aFloat174 * super.aFloat165;
		Static126.aFloatArray19[2] = super.aFloat179 * super.aFloat174;
		OpenGL.glLightfv(16384, 4609, Static126.aFloatArray19, 0);
		Static126.aFloatArray19[0] = super.aFloat165 * -super.aFloat167;
		Static126.aFloatArray19[1] = -super.aFloat167 * super.aFloat177;
		Static126.aFloatArray19[3] = 1.0F;
		Static126.aFloatArray19[2] = -super.aFloat167 * super.aFloat179;
		OpenGL.glLightfv(16385, 4609, Static126.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(ZI)Lclient!sfa;")
	@Override
	public Interface25 method7784(@OriginalArg(0) boolean arg0) {
		return new Class93_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "()V")
	@Override
	public void method7651() {
	}

	@OriginalMember(owner = "client!rda", name = "w", descriptor = "(I)V")
	@Override
	protected void method7777() {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIIIILclient!eu;[BI)Lclient!wp;")
	@Override
	protected Interface26 method7782(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(5) Class114 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean654 || Static45.method8836(arg4) && Static45.method8836(arg1)) {
			return new Class23_Sub2(this, arg2, arg4, arg1, arg0, arg3, 0, 0);
		} else if (this.aBoolean649) {
			return new Class23_Sub1(this, arg2, arg4, arg1, arg3, 0, 0);
		} else {
			@Pc(44) Class23_Sub2 local44 = new Class23_Sub2(this, arg2, Static453.aClass278_13, Static94.method1393(arg4), Static94.method1393(arg1));
			local44.method4354(0, arg3, arg1, arg4, arg2);
			return local44;
		}
	}

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "(Z)V")
	@Override
	protected void method7831() {
		if (super.aBoolean701) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V")
	@Override
	protected void method7810() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray96, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "(B)V")
	@Override
	protected void method7768() {
		OpenGL.glScissor(super.anInt9166 + super.anInt9174, -super.anInt9145 + super.anInt9181 + super.anInt9025, -super.anInt9174 + super.anInt9176, super.anInt9145 + -super.anInt9153);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)V")
	public synchronized void method7401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub29 local8 = new Class5_Sub29(arg0);
		local8.aLong314 = (long) arg1;
		this.aClass102_55.method1921(local8);
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "()V")
	@Override
	public void method7645() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "(B)V")
	@Override
	protected void method7862() {
		OpenGL.glActiveTexture(super.anInt9160 + 33984);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!gea;)V")
	@Override
	public void method7730(@OriginalArg(0) Interface6 arg0) {
	}

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "()Lclient!mi;")
	@Override
	public Class236 method7656() {
		@Pc(7) int local7 = -1;
		if (this.aString111.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString111.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString111.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class236(local7, "OpenGL", this.anInt8651, this.aString112, 0L);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!pj;Lclient!eu;I)Z")
	@Override
	public boolean method7844(@OriginalArg(0) Class278 arg0, @OriginalArg(1) Class114 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!je;IILclient!dea;IB)V")
	@Override
	public void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) int arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (arg4 == Static184.aClass85_2) {
			local12 = arg5 * 2;
			local14 = 1;
		} else if (Static230.aClass85_3 == arg4) {
			local12 = arg5 + 1;
			local14 = 3;
		} else if (arg4 == Static175.aClass85_1) {
			local14 = 4;
			local12 = arg5 * 3;
		} else if (Static271.aClass85_4 == arg4) {
			local14 = 6;
			local12 = arg5 + 2;
		} else if (Static571.aClass85_7 == arg4) {
			local14 = 5;
			local12 = arg5 + 2;
		} else {
			local14 = 0;
			local12 = arg5;
		}
		@Pc(84) Class278 local84 = arg1.method2928();
		@Pc(87) Class93_Sub2 local87 = (Class93_Sub2) arg1;
		local87.method2922();
		OpenGL.glDrawElements(local14, local12, Static13.method243(local84), local87.method2916() + (long) (arg3 * local84.anInt7757));
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7747(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(15) Long local15 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local15);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(III)V")
	public synchronized void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class5_Sub29 local13 = new Class5_Sub29(arg1);
		local13.aLong314 = (long) arg0;
		this.aClass102_54.method1921(local13);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)Lclient!nq;")
	@Override
	public Interface18 method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "B", descriptor = "(B)V")
	@Override
	protected void method7790() {
		this.method7861();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt9177; local10++) {
			@Pc(17) Class5_Sub43 local17 = super.aClass5_Sub43Array5[local10];
			@Pc(23) int local23 = local17.method8253();
			@Pc(28) int local28 = local10 + 16386;
			@Pc(34) float local34 = local17.method8250() / 255.0F;
			Static126.aFloatArray19[0] = (float) local17.method8251();
			Static126.aFloatArray19[1] = (float) local17.method8257();
			Static126.aFloatArray19[2] = (float) local17.method8255();
			Static126.aFloatArray19[3] = 1.0F;
			OpenGL.glLightfv(local28, 4611, Static126.aFloatArray19, 0);
			Static126.aFloatArray19[3] = 1.0F;
			Static126.aFloatArray19[0] = (float) (local23 >> 16 & 0xFF) * local34;
			Static126.aFloatArray19[2] = (float) (local23 & 0xFF) * local34;
			Static126.aFloatArray19[1] = (float) (local23 >> 8 & 0xFF) * local34;
			OpenGL.glLightfv(local28, 4609, Static126.aFloatArray19, 0);
			OpenGL.glLightf(local28, 4617, 1.0F / (float) (local17.method8254() * local17.method8254()));
			OpenGL.glEnable(local28);
		}
		while (super.anInt9173 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method7790();
	}

	@OriginalMember(owner = "client!rda", name = "D", descriptor = "(I)V")
	private void method7403() {
		if (this.aBoolean646) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass288_6.method6914()) {
			if (!this.aBoolean648) {
				OpenGL.glLoadMatrixf(super.aClass203_Sub1_18.method4831(Static276.aFloatArray39), 0);
				this.aBoolean648 = true;
				this.method7847();
				this.method7790();
			}
			if (super.aBoolean680) {
				this.aBoolean646 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass203_Sub1_15.method4831(Static276.aFloatArray39), 0);
				this.aBoolean646 = true;
			}
		} else if (super.aBoolean680) {
			OpenGL.glLoadIdentity();
			this.aBoolean646 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass203_Sub1_15.method4831(Static276.aFloatArray39), 0);
			this.aBoolean646 = false;
		}
	}

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "(I)V")
	@Override
	protected void method7776() {
		@Pc(14) int local14 = this.anIntArray493[super.anInt9160];
		if (local14 != 0) {
			this.anIntArray493[super.anInt9160] = 0;
			OpenGL.glBindTexture(local14, 0);
			OpenGL.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!eu;BLclient!pj;)Z")
	@Override
	public boolean method7744(@OriginalArg(0) Class114 arg0, @OriginalArg(2) Class278 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "(II)V")
	@Override
	public void method7838(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ol;Lclient!ol;FLclient!ol;)Lclient!ol;")
	@Override
	public Class29 method7652(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class29 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7701(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "()Z")
	@Override
	public boolean method7711() {
		return false;
	}

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "()V")
	@Override
	public void method7663() {
	}

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "(B)V")
	@Override
	protected void method7839() {
		if (super.aBoolean693 && !super.aBoolean691) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([Lclient!aia;B)Lclient!gn;")
	@Override
	public Class147 method7825(@OriginalArg(0) Class14[] arg0) {
		return new Class147_Sub1(arg0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7666(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7673(arg2, arg3);
	}

	@OriginalMember(owner = "client!rda", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZII[FLclient!eu;III)Lclient!wp;")
	@Override
	protected Interface26 method7853(@OriginalArg(0) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) Class114 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean654 || Static45.method8836(arg4) && Static45.method8836(arg3)) {
			return new Class23_Sub2(this, arg2, arg4, arg3, arg0, arg1, 0, 0);
		} else if (this.aBoolean649) {
			return new Class23_Sub1(this, arg2, arg4, arg3, arg1, 0, 0);
		} else {
			@Pc(67) Class23_Sub2 local67 = new Class23_Sub2(this, arg2, Static453.aClass278_17, Static94.method1393(arg4), Static94.method1393(arg3));
			local67.method4355(arg4, arg1, arg2, arg3);
			return local67;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIZILclient!rt;)V")
	@Override
	public void method7750(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class312 arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static87.method1315(arg3));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!nq;Lclient!rk;)Lclient!gea;")
	@Override
	public Interface6 method7668(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLclient!dea;II)V")
	@Override
	public void method7854(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) byte local27;
		@Pc(25) int local25;
		if (Static184.aClass85_2 == arg0) {
			local25 = arg2 * 2;
			local27 = 1;
		} else if (arg0 == Static230.aClass85_3) {
			local25 = arg2 + 1;
			local27 = 3;
		} else if (Static175.aClass85_1 == arg0) {
			local25 = arg2 * 3;
			local27 = 4;
		} else if (Static271.aClass85_4 == arg0) {
			local27 = 6;
			local25 = arg2 + 2;
		} else if (arg0 == Static571.aClass85_7) {
			local27 = 5;
			local25 = arg2 + 2;
		} else {
			local25 = arg2;
			local27 = 0;
		}
		OpenGL.glDrawArrays(local27, arg1, local25);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)Lclient!rk;")
	@Override
	public Interface23 method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9025 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt8653, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "()Z")
	@Override
	public boolean method7697() {
		return false;
	}

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "(B)V")
	@Override
	protected void method7736() {
		OpenGL.glTexEnvi(8960, 34161, Static365.method5396(super.aClass34Array6[super.anInt9160]));
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(B)V")
	@Override
	protected void method7848() {
		OpenGL.glViewport(super.anInt9166, super.anInt9181, super.anInt9094, super.anInt9025);
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(II)Lclient!oda;")
	@Override
	protected Class13 method7864(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class13_Sub5(this, super.aClass208_118);
		} else if (arg0 == 4) {
			return new Class13_Sub11(this, super.aClass208_118, super.aClass61_6);
		} else if (arg0 == 8) {
			return new Class13_Sub6(this, super.aClass208_118, super.aClass61_6);
		} else {
			return super.method7864(arg0);
		}
	}

	@OriginalMember(owner = "client!rda", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt8652;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method7833(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local14);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!eu;ILclient!pj;I)Lclient!wp;")
	@Override
	public Interface26 method7834(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class278 arg3) {
		if (this.aBoolean654 || Static45.method8836(arg0) && Static45.method8836(arg2)) {
			return new Class23_Sub2(this, arg1, arg3, arg0, arg2);
		} else if (this.aBoolean649) {
			return new Class23_Sub1(this, arg1, arg3, arg0, arg2);
		} else {
			return new Class23_Sub2(this, arg1, arg3, Static94.method1393(arg0), Static94.method1393(arg2));
		}
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V")
	@Override
	protected void method7765() {
		OpenGL.glMatrixMode(5890);
		if (Static95.aClass357_1 == super.aClass357Array3[super.anInt9160]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass203_Sub1Array3[super.anInt9160].method4831(Static276.aFloatArray39), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([[IIZI)Lclient!rr;")
	@Override
	public Interface24 method7797(@OriginalArg(0) int[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class23_Sub3(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "(Z)V")
	@Override
	protected void method7779() {
		if (super.aBoolean683 && super.aBoolean682 && super.anInt9170 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "(B)V")
	@Override
	protected void method7766() {
		this.aBoolean648 = false;
		this.method7403();
	}
}
