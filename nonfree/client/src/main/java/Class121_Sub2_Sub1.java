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
public final class Class121_Sub2_Sub1 extends Class121_Sub2 {

	@OriginalMember(owner = "client!mc", name = "mi", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!mc", name = "Og", descriptor = "Lclient!rh;")
	private final Class275 aClass275_105 = new Class275();

	@OriginalMember(owner = "client!mc", name = "mh", descriptor = "Lclient!rh;")
	private final Class275 aClass275_106 = new Class275();

	@OriginalMember(owner = "client!mc", name = "Fh", descriptor = "Lclient!rh;")
	private final Class275 aClass275_107 = new Class275();

	@OriginalMember(owner = "client!mc", name = "Zh", descriptor = "Lclient!rh;")
	private final Class275 aClass275_108 = new Class275();

	@OriginalMember(owner = "client!mc", name = "bi", descriptor = "Lclient!rh;")
	private final Class275 aClass275_109 = new Class275();

	@OriginalMember(owner = "client!mc", name = "fi", descriptor = "Lclient!rh;")
	private final Class275 aClass275_110 = new Class275();

	@OriginalMember(owner = "client!mc", name = "ki", descriptor = "Lclient!rh;")
	private final Class275 aClass275_111 = new Class275();

	@OriginalMember(owner = "client!mc", name = "li", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!mc", name = "ri", descriptor = "I")
	private final int anInt5464 = 0;

	@OriginalMember(owner = "client!mc", name = "xi", descriptor = "Z")
	private boolean aBoolean343 = false;

	@OriginalMember(owner = "client!mc", name = "Pg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!mc", name = "ti", descriptor = "Ljava/lang/String;")
	private final String aString70;

	@OriginalMember(owner = "client!mc", name = "wi", descriptor = "Ljava/lang/String;")
	private final String aString71;

	@OriginalMember(owner = "client!mc", name = "si", descriptor = "I")
	private final int anInt5465;

	@OriginalMember(owner = "client!mc", name = "ni", descriptor = "Z")
	public boolean aBoolean339;

	@OriginalMember(owner = "client!mc", name = "pi", descriptor = "Z")
	private boolean aBoolean340;

	@OriginalMember(owner = "client!mc", name = "vi", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!mc", name = "qi", descriptor = "Z")
	public final boolean aBoolean341;

	@OriginalMember(owner = "client!mc", name = "oi", descriptor = "I")
	public final int anInt5463;

	@OriginalMember(owner = "client!mc", name = "ui", descriptor = "[I")
	public final int[] anIntArray470;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!e;Lclient!pq;I)V")
	public Class121_Sub2_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class251 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString70 = OpenGL.glGetString(7936).toLowerCase();
			this.aString71 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString70.indexOf("microsoft") != -1 || this.aString70.indexOf("brian paul") != -1 || this.aString70.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(103) String local103 = OpenGL.glGetString(7938);
			@Pc(111) String[] local111 = Static128.method1936(local103.replace('.', ' '), ' ');
			if (local111.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(127) int local127;
			try {
				@Pc(121) int local121 = Static467.method6543(local111[0]);
				local127 = Static467.method6543(local111[1]);
				this.anInt5465 = local121 * 10 + local127;
			} catch (@Pc(136) NumberFormatException local136) {
				throw new RuntimeException("");
			}
			if (this.anInt5465 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(178) int[] local178 = new int[1];
				OpenGL.glGetIntegerv(34018, local178, 0);
				super.anInt8922 = local178[0];
				if (super.anInt8922 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8894 = 8;
				this.aBoolean339 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean626 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean340 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean610 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean342 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean617 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean341 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anInt5463 = Stream.a() ? 33639 : 5121;
				if (this.aString71.indexOf("radeon") != -1) {
					local127 = 0;
					@Pc(273) boolean local273 = false;
					@Pc(275) boolean local275 = false;
					@Pc(284) String[] local284 = Static128.method1936(this.aString71.replace('/', ' '), ' ');
					for (@Pc(286) int local286 = 0; local286 < local284.length; local286++) {
						@Pc(292) String local292 = local284[local286];
						try {
							if (local292.length() > 0) {
								if (local292.charAt(0) == 'x' && local292.length() >= 3 && Static44.method598(local292.substring(1, 3))) {
									local275 = true;
									local292 = local292.substring(1);
								}
								if (local292.equals("hd")) {
									local273 = true;
								} else {
									if (local292.startsWith("hd")) {
										local273 = true;
										local292 = local292.substring(2);
									}
									if (local292.length() >= 4 && Static44.method598(local292.substring(0, 4))) {
										local127 = Static467.method6543(local292.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(357) Exception local357) {
						}
					}
					if (!local275 && !local273) {
						if (local127 >= 7000 && local127 <= 7999) {
							this.aBoolean339 = false;
						}
						if (local127 >= 7000 && local127 <= 9250) {
							super.aBoolean617 = false;
						}
					}
					this.aBoolean340 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString70.indexOf("intel");
				if (this.aBoolean339) {
					try {
						@Pc(417) int[] local417 = new int[1];
						OpenGL.glGenBuffersARB(1, local417, 0);
					} catch (@Pc(423) Throwable local423) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray470 = new int[super.anInt8922];
				OpenGL.glClear(16640);
				this.anOpenGL1.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(442) Throwable local442) {
			local442.printStackTrace();
			this.method7125();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "(Z)F")
	@Override
	protected float method7255() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "()Lclient!ru;")
	@Override
	public Class282 method7124() {
		@Pc(7) int local7 = -1;
		if (this.aString70.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString70.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString70.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class282(local7, "OpenGL", this.anInt5465, this.aString71, 0L);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!nl;ILclient!eea;)Z")
	@Override
	public boolean method7259(@OriginalArg(0) Class214 arg0, @OriginalArg(2) Class82 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZI[[I)Lclient!vea;")
	@Override
	public Interface22 method7288(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class61_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILclient!nl;[BI)Lclient!gp;")
	@Override
	public Interface12 method7276(@OriginalArg(3) Class214 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class61_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!mc", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return this.anInt5464;
	}

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "(I)V")
	@Override
	protected void method7203() {
		this.method4672();
	}

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "(I)V")
	@Override
	protected void method7191() {
		if (super.aBoolean625 && !super.aBoolean627) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "()Z")
	@Override
	public boolean method7139() {
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "(Z)V")
	private void method4672() {
		if (this.aBoolean343) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass68_6.method1433()) {
			if (!this.aBoolean343) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass34_Sub3_18.method3772(Static328.aFloatArray37), 0);
				this.method7246();
				this.method7168();
				this.aBoolean343 = true;
			}
			if (this.aBoolean343) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean608) {
				OpenGL.glMultMatrixf(super.aClass34_Sub3_15.method3772(Static328.aFloatArray37), 0);
			}
		} else if (super.aBoolean608) {
			OpenGL.glLoadIdentity();
			this.aBoolean343 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass34_Sub3_15.method3772(Static328.aFloatArray37), 0);
			this.aBoolean343 = false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IBI)V")
	public synchronized void method4673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub9 local8 = new Class6_Sub9(arg1);
		local8.aLong249 = arg0;
		this.aClass275_106.method6370(local8);
	}

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "(I)V")
	@Override
	protected void method7260() {
		OpenGL.glMatrixMode(5890);
		if (Static359.aClass168_4 == super.aClass168Array3[super.anInt8907]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass34_Sub3Array3[super.anInt8907].method3772(Static328.aFloatArray37), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(Z)V")
	@Override
	protected void method7212() {
		OpenGL.glTexEnvi(8960, 34161, Static85.method1343(super.aClass59Array6[super.anInt8907]));
	}

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "(B)V")
	@Override
	protected void method7250() {
		if (super.aBoolean628) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "()V")
	@Override
	public void method7147() {
		if (super.anInt8869 <= 0 && super.anInt8864 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt8899;
		@Pc(16) int local16 = super.anInt8901;
		@Pc(19) int local19 = super.anInt8905;
		@Pc(22) int local22 = super.anInt8909;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7252();
		this.method7296(false);
		this.method7240(false);
		this.method7264(false);
		this.method7228(false);
		this.method7167(null);
		this.method7290(-2, false, false);
		this.method7266(1);
		this.method7164(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8869, super.anInt8864, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "(I)V")
	@Override
	protected void method7229() {
		OpenGL.glDepthMask(super.aBoolean619 && super.aBoolean621);
	}

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "(I)V")
	@Override
	protected void method7207() {
		@Pc(13) int local13 = this.anIntArray470[super.anInt8907];
		if (local13 != 0) {
			this.anIntArray470[super.anInt8907] = 0;
			OpenGL.glBindTexture(local13, 0);
			OpenGL.glDisable(local13);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!fo;I)V")
	@Override
	public void method7298(@OriginalArg(1) int arg0, @OriginalArg(2) Class107 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte local18;
		@Pc(16) int local16;
		if (arg1 == Static379.aClass107_8) {
			local16 = arg2 * 2;
			local18 = 1;
		} else if (arg1 == Static159.aClass107_3) {
			local18 = 3;
			local16 = arg2 + 1;
		} else if (Static503.aClass107_2 == arg1) {
			local16 = arg2 * 3;
			local18 = 4;
		} else if (arg1 == Static221.aClass107_6) {
			local18 = 6;
			local16 = arg2 + 2;
		} else if (Static171.aClass107_4 == arg1) {
			local18 = 5;
			local16 = arg2 + 2;
		} else {
			local18 = 0;
			local16 = arg2;
		}
		OpenGL.glDrawArrays(local18, arg0, local16);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ll;)V")
	@Override
	public void method7241(@OriginalArg(1) Class186 arg0) {
		if (arg0 == Static374.aClass186_2) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(16) int local16 = Static520.method7328(arg0);
		OpenGL.glTexGeni(8192, 9472, local16);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local16);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local16);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([Lclient!oh;I)Lclient!qca;")
	@Override
	public Class258 method7285(@OriginalArg(0) Class228[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!eea;IILclient!nl;)Lclient!sd;")
	@Override
	public Interface20 method7185(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class214 arg3) {
		if (this.aBoolean342 || Static392.method5808(arg0) && Static392.method5808(arg2)) {
			return new Class61_Sub3(this, arg3, arg1, arg0, arg2);
		} else if (this.aBoolean340) {
			return new Class61_Sub4(this, arg3, arg1, arg0, arg2);
		} else {
			return new Class61_Sub3(this, arg3, arg1, Static516.method7313(arg0), Static516.method7313(arg2));
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)Lclient!vp;")
	@Override
	public Interface23 method7201(@OriginalArg(0) boolean arg0) {
		return new Class262_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([IIIIZII)Lclient!sd;")
	@Override
	public Interface20 method7219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean342 || Static392.method5808(arg3) && Static392.method5808(arg1)) {
			return new Class61_Sub3(this, arg3, arg1, arg4, arg0, 0, arg2);
		} else if (this.aBoolean340) {
			return new Class61_Sub4(this, arg3, arg1, arg0, 0, arg2);
		} else {
			@Pc(35) Class61_Sub3 local35 = new Class61_Sub3(this, Static255.aClass214_8, Static108.aClass82_8, Static516.method7313(arg3), Static516.method7313(arg1));
			local35.method7529(arg2, 0, arg0, arg1, 0, arg3);
			return local35;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIILclient!tk;)V")
	@Override
	protected void method7211(@OriginalArg(2) int arg0, @OriginalArg(3) Class305 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static345.method5204(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!aq;Lclient!aq;FLclient!aq;)Lclient!aq;")
	@Override
	public Class17 method7104(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
	@Override
	protected void method7177() {
		if (super.aBoolean609) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7100(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub9 local19;
		while (!this.aClass275_106.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_106.method6360();
			Static484.anIntArray630[local11++] = (int) local19.aLong249;
			super.anInt8890 -= local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static484.anIntArray630, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static484.anIntArray630, 0);
			local11 = 0;
		}
		while (!this.aClass275_107.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_107.method6360();
			Static484.anIntArray630[local11++] = (int) local19.aLong249;
			super.anInt8891 -= local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static484.anIntArray630, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static484.anIntArray630, 0);
			local11 = 0;
		}
		while (!this.aClass275_108.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_108.method6360();
			Static484.anIntArray630[local11++] = local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static484.anIntArray630, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static484.anIntArray630, 0);
			local11 = 0;
		}
		while (!this.aClass275_109.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_109.method6360();
			Static484.anIntArray630[local11++] = (int) local19.aLong249;
			super.anInt8889 -= local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static484.anIntArray630, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static484.anIntArray630, 0);
		}
		while (!this.aClass275_105.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_105.method6360();
			OpenGL.glDeleteLists((int) local19.aLong249, local19.anInt1006);
		}
		@Pc(213) Class6 local213;
		while (!this.aClass275_110.method6371()) {
			local213 = this.aClass275_110.method6360();
			OpenGL.glDeleteProgramARB((int) local213.aLong249);
		}
		while (!this.aClass275_111.method6371()) {
			local213 = this.aClass275_111.method6360();
			OpenGL.glDeleteObjectARB(local213.aLong249);
		}
		while (!this.aClass275_105.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_105.method6360();
			OpenGL.glDeleteLists((int) local19.aLong249, local19.anInt1006);
		}
		if (this.v() > 100663296 && Static137.method2058() > this.aLong141 + 60000L) {
			System.gc();
			this.aLong141 = Static137.method2058();
		}
		super.method7100(local9);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!qca;)V")
	@Override
	public void method7263(@OriginalArg(1) Class258 arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7221(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(II)V")
	@Override
	public void method7265(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "(I)V")
	@Override
	protected void method7267() {
		this.method4672();
	}

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "()V")
	@Override
	protected void method7125() {
		super.method7125();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "(I)V")
	@Override
	protected void method7222() {
		OpenGL.glTexEnvi(8960, 34162, Static85.method1343(super.aClass59Array5[super.anInt8907]));
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(B)V")
	@Override
	protected void method7231() {
		OpenGL.glScissor(super.anInt8918 + super.anInt8899, super.anInt8924 - -super.anInt8864 + -super.anInt8909, -super.anInt8899 + super.anInt8901, -super.anInt8905 + super.anInt8909);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BILclient!nl;ZZII)Lclient!sd;")
	@Override
	protected Interface20 method7214(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class214 arg3, @OriginalArg(5) boolean arg4) {
		if (this.aBoolean342 || Static392.method5808(arg2) && Static392.method5808(arg0)) {
			return new Class61_Sub3(this, arg3, arg2, arg0, arg4, arg1, 0, 0);
		} else if (this.aBoolean340) {
			return new Class61_Sub4(this, arg3, arg2, arg0, arg1, 0, 0);
		} else {
			@Pc(36) Class61_Sub3 local36 = new Class61_Sub3(this, arg3, Static108.aClass82_8, Static516.method7313(arg2), Static516.method7313(arg0));
			local36.method7532(arg3, arg0, arg1, arg2, 0);
			return local36;
		}
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(Z)V")
	@Override
	public void method7135(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	@Override
	protected void method7262(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7133(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7128();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public synchronized void method4675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub9 local8 = new Class6_Sub9(arg1);
		local8.aLong249 = arg0;
		this.aClass275_107.method6370(local8);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!nl;Lclient!eea;Z)Z")
	@Override
	public boolean method7169(@OriginalArg(0) Class214 arg0, @OriginalArg(1) Class82 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()V")
	@Override
	public void method7084() {
		this.method7228(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(I)V")
	@Override
	protected void method7176() {
		if (super.aBoolean624) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	@Override
	protected void method7161() {
		if (super.aBoolean611) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!mc", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8864 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt5463, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7184(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	@Override
	protected void method7179() {
		Static194.aFloatArray14[2] = super.aFloat185 * super.aFloat188;
		Static194.aFloatArray14[1] = super.aFloat185 * super.aFloat186;
		Static194.aFloatArray14[0] = super.aFloat194 * super.aFloat185;
		Static194.aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static194.aFloatArray14, 0);
		Static194.aFloatArray14[1] = super.aFloat186 * -super.aFloat191;
		Static194.aFloatArray14[0] = super.aFloat194 * -super.aFloat191;
		Static194.aFloatArray14[3] = 1.0F;
		Static194.aFloatArray14[2] = super.aFloat188 * -super.aFloat191;
		OpenGL.glLightfv(16385, 4609, Static194.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "()V")
	@Override
	public void method7130() {
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(Z)V")
	@Override
	protected void method7210() {
		OpenGL.glActiveTexture(super.anInt8907 + 33984);
	}

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "(I)V")
	@Override
	public void method7246() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray59, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V")
	@Override
	protected void method7162() {
		if (super.aBoolean622) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "(Z)V")
	@Override
	protected void method7279() {
		if (super.aClass208_12 == Static479.aClass208_16) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static296.aClass208_15 == super.aClass208_12) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static520.aClass208_13 == super.aClass208_12) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "(I)V")
	@Override
	protected void method7278() {
		Static194.aFloatArray14[2] = super.aFloat199 * super.aFloat188;
		Static194.aFloatArray14[1] = super.aFloat199 * super.aFloat186;
		Static194.aFloatArray14[0] = super.aFloat199 * super.aFloat194;
		Static194.aFloatArray14[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static194.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()V")
	@Override
	public void method7090() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)Lclient!qr;")
	@Override
	protected Class92 method7173(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class92_Sub5(this, super.aClass251_145);
		} else if (arg0 == 4) {
			return new Class92_Sub9(this, super.aClass251_145, super.aClass269_5);
		} else {
			return super.method7173(arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "(B)V")
	@Override
	protected void method7256() {
		@Pc(24) int local24;
		if (super.aBoolean618) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local24 = super.anInt8926;
		} else {
			super.aFloat192 = -super.anInt8898 + super.anInt8906;
			super.aFloat200 = (float) -super.anInt8913 + super.aFloat192;
			if (super.aFloat200 < (float) super.anInt8893) {
				super.aFloat200 = super.anInt8893;
			}
			OpenGL.glFogf(2915, super.aFloat200);
			OpenGL.glFogf(2916, super.aFloat192);
			local24 = super.anInt8914;
		}
		Static194.aFloatArray14[2] = (float) (local24 & 0xFF) / 255.0F;
		Static194.aFloatArray14[1] = (float) (local24 & 0xFF00) / 65280.0F;
		Static194.aFloatArray14[0] = (float) (local24 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static194.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(IB)V")
	public synchronized void method4676(@OriginalArg(0) int arg0) {
		@Pc(20) Class6 local20 = new Class6();
		local20.aLong249 = arg0;
		this.aClass275_110.method6370(local20);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!vp;)V")
	@Override
	public void method7297(@OriginalArg(1) int arg0, @OriginalArg(2) Interface23 arg1) {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIZILclient!tk;)V")
	@Override
	public void method7282(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class305 arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static345.method5204(arg3));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(B)V")
	@Override
	protected void method7234() {
		OpenGL.glViewport(super.anInt8918, super.anInt8924, super.anInt8869, super.anInt8864);
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)V")
	@Override
	protected void method7175() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray57, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "()Z")
	@Override
	public boolean method7141() {
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7258() {
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(Z)V")
	@Override
	protected void method7237() {
		for (@Pc(10) int local10 = super.anInt8922 - 1; local10 >= 0; local10--) {
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
		@Pc(72) float[] local72 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(74) int local74 = 0; local74 < 8; local74++) {
			@Pc(81) int local81 = local74 + 16384;
			OpenGL.glLightfv(local81, 4608, local72, 0);
			OpenGL.glLightf(local81, 4615, 0.0F);
			OpenGL.glLightf(local81, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method7237();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7171(@OriginalArg(1) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL1.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!go;IILclient!fo;I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class107 arg4, @OriginalArg(6) int arg5) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (Static379.aClass107_8 == arg4) {
			local16 = 1;
			local20 = arg3 * 2;
		} else if (arg4 == Static159.aClass107_3) {
			local20 = arg3 + 1;
			local16 = 3;
		} else if (Static503.aClass107_2 == arg4) {
			local16 = 4;
			local20 = arg3 * 3;
		} else if (Static221.aClass107_6 == arg4) {
			local20 = arg3 + 2;
			local16 = 6;
		} else if (arg4 == Static171.aClass107_4) {
			local16 = 5;
			local20 = arg3 + 2;
		} else {
			local20 = arg3;
			local16 = 0;
		}
		@Pc(74) Class82 local74 = arg2.method6271();
		@Pc(77) Class262_Sub1 local77 = (Class262_Sub1) arg2;
		local77.method7566();
		OpenGL.glDrawElements(local16, local20, Static414.method6081(local74), local77.method7568() + (long) (local74.anInt2007 * arg5));
	}

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "(I)V")
	@Override
	protected void method7182() {
		Static194.aFloatArray14[1] = (float) (super.anInt8928 & 0xFF00) / 65280.0F;
		Static194.aFloatArray14[3] = (float) (super.anInt8928 >>> 24) / 255.0F;
		Static194.aFloatArray14[0] = (float) (super.anInt8928 & 0xFF0000) / 1.671168E7F;
		Static194.aFloatArray14[2] = (float) (super.anInt8928 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static194.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIILclient!nl;BII[F)Lclient!sd;")
	@Override
	protected Interface20 method7269(@OriginalArg(0) boolean arg0, @OriginalArg(3) Class214 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean342 || Static392.method5808(arg3) && Static392.method5808(arg2)) {
			return new Class61_Sub3(this, arg1, arg3, arg2, arg0, arg4, 0, 0);
		} else if (this.aBoolean340) {
			return new Class61_Sub4(this, arg1, arg3, arg2, arg4, 0, 0);
		} else {
			@Pc(35) Class61_Sub3 local35 = new Class61_Sub3(this, arg1, Static108.aClass82_12, Static516.method7313(arg3), Static516.method7313(arg2));
			local35.method5032(arg4, arg3, arg2, arg1);
			return local35;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method7174(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)V")
	@Override
	protected void method7168() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < super.anInt8925; local7++) {
			@Pc(14) Class6_Sub7 local14 = super.aClass6_Sub7Array6[local7];
			@Pc(18) int local18 = local14.method3486();
			@Pc(22) int local22 = local7 + 16386;
			@Pc(28) float local28 = local14.method3491() / 255.0F;
			Static194.aFloatArray14[0] = local14.method3490();
			Static194.aFloatArray14[1] = local14.method3493();
			Static194.aFloatArray14[2] = local14.method3492();
			Static194.aFloatArray14[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static194.aFloatArray14, 0);
			Static194.aFloatArray14[2] = local28 * (float) (local18 & 0xFF);
			Static194.aFloatArray14[0] = local28 * (float) (local18 >> 16 & 0xFF);
			Static194.aFloatArray14[3] = 1.0F;
			Static194.aFloatArray14[1] = (float) (local18 >> 8 & 0xFF) * local28;
			OpenGL.glLightfv(local22, 4609, Static194.aFloatArray14, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method3487() * local14.method3487()));
			OpenGL.glEnable(local22);
		}
		while (local7 < super.anInt8929) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method7168();
	}

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "()V")
	@Override
	public void method7128() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "(B)V")
	@Override
	protected void method7293() {
		if (super.aBoolean616 && super.aBoolean615 && super.aBoolean618 | super.anInt8913 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "()V")
	@Override
	public void method7114() {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)Lclient!go;")
	@Override
	public Interface11 method7204(@OriginalArg(1) boolean arg0) {
		return new Class262_Sub1(this, Static108.aClass82_9, arg0);
	}
}
