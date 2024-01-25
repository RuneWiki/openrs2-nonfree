import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class16_Sub1_Sub1 extends Class16_Sub1 {

	@OriginalMember(owner = "client!ai", name = "wi", descriptor = "Z")
	private boolean aBoolean62;

	@OriginalMember(owner = "client!ai", name = "yi", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ai", name = "zi", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!ai", name = "Ai", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!ai", name = "Bi", descriptor = "Z")
	private boolean aBoolean64;

	@OriginalMember(owner = "client!ai", name = "Di", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!ai", name = "Ei", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!ai", name = "Hg", descriptor = "Lclient!bq;")
	private final Class43 aClass43_5 = new Class43();

	@OriginalMember(owner = "client!ai", name = "qi", descriptor = "Lclient!bq;")
	private final Class43 aClass43_6 = new Class43();

	@OriginalMember(owner = "client!ai", name = "ri", descriptor = "Lclient!bq;")
	private final Class43 aClass43_7 = new Class43();

	@OriginalMember(owner = "client!ai", name = "si", descriptor = "Lclient!bq;")
	private final Class43 aClass43_8 = new Class43();

	@OriginalMember(owner = "client!ai", name = "ti", descriptor = "Lclient!bq;")
	private final Class43 aClass43_9 = new Class43();

	@OriginalMember(owner = "client!ai", name = "ui", descriptor = "Lclient!bq;")
	private final Class43 aClass43_10 = new Class43();

	@OriginalMember(owner = "client!ai", name = "vi", descriptor = "Lclient!bq;")
	private final Class43 aClass43_11 = new Class43();

	@OriginalMember(owner = "client!ai", name = "Ci", descriptor = "[Lclient!pb;")
	private final Class25_Sub2[] aClass25_Sub2Array1 = new Class25_Sub2[16];

	@OriginalMember(owner = "client!ai", name = "xi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!ai", name = "Fi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!ai", name = "Ni", descriptor = "I")
	private final int anInt776 = 0;

	@OriginalMember(owner = "client!ai", name = "pi", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ai", name = "Ji", descriptor = "Ljava/lang/String;")
	private final String aString4;

	@OriginalMember(owner = "client!ai", name = "Ii", descriptor = "Ljava/lang/String;")
	private final String aString3;

	@OriginalMember(owner = "client!ai", name = "Qi", descriptor = "I")
	private final int anInt777;

	@OriginalMember(owner = "client!ai", name = "Oi", descriptor = "Z")
	public boolean aBoolean71;

	@OriginalMember(owner = "client!ai", name = "Ri", descriptor = "Z")
	private boolean aBoolean72;

	@OriginalMember(owner = "client!ai", name = "Ki", descriptor = "Z")
	private final boolean aBoolean68;

	@OriginalMember(owner = "client!ai", name = "Hi", descriptor = "Z")
	public final boolean aBoolean67;

	@OriginalMember(owner = "client!ai", name = "Mi", descriptor = "Z")
	public final boolean aBoolean70;

	@OriginalMember(owner = "client!ai", name = "Li", descriptor = "Z")
	public final boolean aBoolean69;

	@OriginalMember(owner = "client!ai", name = "Pi", descriptor = "[I")
	public final int[] anIntArray16;

	@OriginalMember(owner = "client!ai", name = "Gi", descriptor = "I")
	public final int anInt775;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!oh;I)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class237 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString4 = OpenGL.glGetString(7936).toLowerCase();
			this.aString3 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString4.indexOf("microsoft") != -1 || this.aString4.indexOf("brian paul") != -1 || this.aString4.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static403.method6410(local109.replace('.', ' '), ' ');
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(133) int local133;
			try {
				@Pc(127) int local127 = Static82.method2080(local117[0]);
				local133 = Static82.method2080(local117[1]);
				this.anInt777 = local127 * 10 + local133;
			} catch (@Pc(143) NumberFormatException local143) {
				throw new RuntimeException("");
			}
			if (this.anInt777 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(185) int[] local185 = new int[1];
				OpenGL.glGetIntegerv(34018, local185, 0);
				super.anInt4897 = local185[0];
				if (super.anInt4897 < 2) {
					throw new RuntimeException("");
				}
				super.anInt4907 = 8;
				this.aBoolean71 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean346 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean72 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean357 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean68 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean352 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean67 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean70 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean69 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray16 = new int[super.anInt4897];
				this.anInt775 = Stream.c() ? 33639 : 5121;
				if (this.aString3.indexOf("radeon") != -1) {
					local133 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static403.method6410(this.aString3.replace('/', ' '), ' ');
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static577.method8064(local308.substring(1, 3))) {
									local291 = true;
									local308 = local308.substring(1);
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local289 = true;
										local308 = local308.substring(2);
									}
									if (local308.length() >= 4 && Static577.method8064(local308.substring(0, 4))) {
										local133 = Static82.method2080(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(375) Exception local375) {
						}
					}
					if (!local291 && !local289) {
						if (local133 >= 7000 && local133 <= 7999) {
							this.aBoolean71 = false;
						}
						if (local133 >= 7000 && local133 <= 9250) {
							super.aBoolean352 = false;
						}
					}
					this.aBoolean72 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString4.indexOf("intel");
				if (this.aBoolean71) {
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
			this.method6053();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ffa;)V")
	@Override
	public void method3893(@OriginalArg(1) Class100 arg0) {
		if (Static297.aClass100_21 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(6) int local6 = Static107.method2397(arg0);
		OpenGL.glTexGeni(8192, 9472, local6);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local6);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local6);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V")
	@Override
	protected void method3879() {
		if (super.aBoolean362) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!jm;Lclient!wd;IBI)Lclient!oq;")
	@Override
	public Interface20 method3923(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean68 || Static439.method6796(arg2) && Static439.method6796(arg3)) {
			return new Class30_Sub3(this, arg1, arg0, arg2, arg3);
		} else if (this.aBoolean72) {
			return new Class30_Sub1(this, arg1, arg0, arg2, arg3);
		} else {
			return new Class30_Sub3(this, arg1, arg0, Static629.method8469(arg2), Static629.method8469(arg3));
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	@Override
	public void method6071(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "(I)V")
	@Override
	protected void method3959() {
		if (super.aBoolean345) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)V")
	@Override
	protected void method3880() {
		@Pc(9) int local9 = this.anIntArray16[super.anInt4899];
		if (local9 != 0) {
			this.anIntArray16[super.anInt4899] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "()Z")
	@Override
	public boolean method6079() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	@Override
	protected void method3882() {
		OpenGL.glViewport(super.anInt4905, super.anInt4923, super.anInt4765, super.anInt4732);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method3881(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local14);
	}

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "(I)V")
	@Override
	protected void method3941() {
		Static50.aFloatArray22[0] = super.aFloat93 * super.aFloat85;
		Static50.aFloatArray22[3] = 1.0F;
		Static50.aFloatArray22[1] = super.aFloat82 * super.aFloat93;
		Static50.aFloatArray22[2] = super.aFloat93 * super.aFloat86;
		OpenGL.glLightModelfv(2899, Static50.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!f;)V")
	@Override
	public void method3967(@OriginalArg(1) Class94 arg0) {
		@Pc(9) Class325[] local9 = ((Class94_Sub1) arg0).aClass325Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local9.length; local23++) {
			@Pc(29) Class325 local29 = local9[local23];
			@Pc(34) Class25_Sub2 local34 = this.aClass25_Sub2Array1[local23];
			@Pc(36) int local36 = 0;
			@Pc(40) int local40 = local34.method6508();
			@Pc(46) long local46 = local34.method6502();
			local34.method6503();
			for (@Pc(51) int local51 = 0; local29.method7653() > local51; local51++) {
				@Pc(58) Class349 local58 = local29.method7652(local51);
				if (local58 == Static589.aClass349_1) {
					OpenGL.glVertexPointer(3, 5126, local40, local46 + (long) local36);
					local21 = true;
				} else if (Static589.aClass349_2 == local58) {
					OpenGL.glNormalPointer(5126, local40, local46 + (long) local36);
					local19 = true;
				} else if (local58 == Static589.aClass349_3) {
					OpenGL.glColorPointer(4, 5121, local40, local46 + (long) local36);
					local13 = true;
				} else if (Static589.aClass349_4 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local40, local46 + (long) local36);
				} else if (Static589.aClass349_5 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local40, local46 + (long) local36);
				} else if (local58 == Static589.aClass349_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local40, local46 + (long) local36);
				} else if (local58 == Static589.aClass349_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local40, local46 + (long) local36);
				}
				local36 += local58.anInt10052;
			}
		}
		if (local21 != this.aBoolean65) {
			if (local21) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean65 = local21;
		}
		if (local19 != this.aBoolean63) {
			if (local19) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean63 = local19;
		}
		if (this.aBoolean66 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean66 = local13;
		}
		@Pc(262) int local262;
		if (this.anInt774 < local11) {
			for (local262 = this.anInt774; local262 < local11; local262++) {
				OpenGL.glClientActiveTexture(local262 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt774 = local11;
		} else if (local11 < this.anInt774) {
			for (local262 = local11; local262 < this.anInt774; local262++) {
				OpenGL.glClientActiveTexture(local262 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt774 = local11;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IZ)V")
	@Override
	public void method3919(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "(I)V")
	@Override
	protected void method3962() {
		if (super.aBoolean350 && super.aBoolean359 && super.anInt4903 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "()Lclient!oba;")
	@Override
	public Class234 method6103() {
		@Pc(7) int local7 = -1;
		if (this.aString4.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString4.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString4.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class234(local7, "OpenGL", this.anInt777, this.aString3, 0L);
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(II)Lclient!ah;")
	@Override
	protected Class11 method3878(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class11_Sub7(this, super.aClass237_58);
		} else if (arg0 == 4) {
			return new Class11_Sub1(this, super.aClass237_58, super.aClass376_5);
		} else if (arg0 == 8) {
			return new Class11_Sub11(this, super.aClass237_58, super.aClass376_5);
		} else {
			return super.method3878(arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "(B)V")
	@Override
	protected void method3932() {
		this.aBoolean64 = false;
		this.method752();
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "()V")
	@Override
	public void method6075() {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method3993(@OriginalArg(1) Canvas arg0) {
		@Pc(18) long local18 = this.anOpenGL1.prepareSurface(arg0);
		if (local18 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local18);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method3952(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(11) Long local11 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local11)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([Lclient!tg;I)Lclient!f;")
	@Override
	public Class94 method3994(@OriginalArg(0) Class325[] arg0) {
		return new Class94_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "(B)V")
	@Override
	protected void method4006() {
		if (super.aBoolean348) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method6119(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class8_Sub17 local19;
		while (!this.aClass43_6.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_6.method1432();
			Static429.anIntArray426[local11++] = (int) local19.aLong285;
			super.anInt4891 -= local19.anInt2919;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static429.anIntArray426, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static429.anIntArray426, 0);
			local11 = 0;
		}
		while (!this.aClass43_7.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_7.method1432();
			Static429.anIntArray426[local11++] = (int) local19.aLong285;
			super.anInt4893 -= local19.anInt2919;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static429.anIntArray426, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static429.anIntArray426, 0);
			local11 = 0;
		}
		while (!this.aClass43_8.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_8.method1432();
			Static429.anIntArray426[local11++] = local19.anInt2919;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static429.anIntArray426, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static429.anIntArray426, 0);
			local11 = 0;
		}
		while (!this.aClass43_9.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_9.method1432();
			Static429.anIntArray426[local11++] = (int) local19.aLong285;
			super.anInt4894 -= local19.anInt2919;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static429.anIntArray426, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static429.anIntArray426, 0);
		}
		while (!this.aClass43_5.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_5.method1432();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt2919);
		}
		@Pc(209) Class8 local209;
		while (!this.aClass43_10.method1420()) {
			local209 = this.aClass43_10.method1432();
			OpenGL.glDeleteProgramARB((int) local209.aLong285);
		}
		while (!this.aClass43_11.method1420()) {
			local209 = this.aClass43_11.method1432();
			OpenGL.glDeleteObjectARB(local209.aLong285);
		}
		while (!this.aClass43_5.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_5.method1432();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt2919);
		}
		if (this.E() > 100663296 && Static342.method5463() > this.aLong7 + 60000L) {
			System.gc();
			this.aLong7 = Static342.method5463();
		}
		super.method6119(local9);
	}

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "(I)V")
	private void method752() {
		if (this.aBoolean62) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass283_3.method7040()) {
			if (!this.aBoolean64) {
				OpenGL.glLoadMatrixf(super.aClass54_Sub3_18.method5146(Static167.aFloatArray41), 0);
				this.aBoolean64 = true;
				this.method3999();
				this.method3909();
			}
			if (super.aBoolean343) {
				this.aBoolean62 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass54_Sub3_15.method5146(Static167.aFloatArray41), 0);
				this.aBoolean62 = true;
			}
		} else if (super.aBoolean343) {
			OpenGL.glLoadIdentity();
			this.aBoolean62 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass54_Sub3_15.method5146(Static167.aFloatArray41), 0);
			this.aBoolean62 = false;
		}
	}

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "()V")
	@Override
	public void method6081() {
		if (super.anInt4765 <= 0 && super.anInt4732 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt4901;
		@Pc(22) int local22 = super.anInt4927;
		@Pc(25) int local25 = super.anInt4926;
		@Pc(28) int local28 = super.anInt4912;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3972();
		this.method3903(false);
		this.method3966(false);
		this.method3933(false);
		this.method3916(false);
		this.method3889(null);
		this.method3957(false, false, -2);
		this.method3937(1);
		this.method3956(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt4765, super.anInt4732, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(ZI)Lclient!kga;")
	@Override
	public Interface13 method3917(@OriginalArg(0) boolean arg0) {
		return new Class25_Sub1(this, Static258.aClass160_10, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!el;I)V")
	@Override
	public void method3983(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		this.aClass25_Sub2Array1[arg1] = (Class25_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "()V")
	@Override
	public void method6095() {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)V")
	public synchronized void method753(@OriginalArg(0) int arg0) {
		@Pc(7) Class8 local7 = new Class8();
		local7.aLong285 = arg0;
		this.aClass43_10.method1424(local7);
	}

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt776;
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(B)V")
	@Override
	protected void method3892() {
		super.aFloat88 = super.anInt4906 - super.anInt4922;
		super.aFloat96 = super.aFloat88 - (float) super.anInt4903;
		if (super.aFloat96 < (float) super.anInt4931) {
			super.aFloat96 = super.anInt4931;
		}
		OpenGL.glFogf(2915, super.aFloat96);
		OpenGL.glFogf(2916, super.aFloat88);
		Static50.aFloatArray22[0] = (float) (super.anInt4915 & 0xFF0000) / 1.671168E7F;
		Static50.aFloatArray22[1] = (float) (super.anInt4915 & 0xFF00) / 65280.0F;
		Static50.aFloatArray22[2] = (float) (super.anInt4915 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static50.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!pt;ZII)V")
	@Override
	protected void method3953(@OriginalArg(0) Class265 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static68.method1796(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII[BILclient!wd;II)Lclient!oq;")
	@Override
	protected Interface20 method3935(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class366 arg4) {
		if (this.aBoolean68 || Static439.method6796(arg1) && Static439.method6796(arg3)) {
			return new Class30_Sub3(this, arg4, arg1, arg3, arg0, arg2, 0, 0);
		} else if (this.aBoolean72) {
			return new Class30_Sub1(this, arg4, arg1, arg3, arg2, 0, 0);
		} else {
			@Pc(46) Class30_Sub3 local46 = new Class30_Sub3(this, arg4, Static258.aClass160_9, Static629.method8469(arg1), Static629.method8469(arg3));
			local46.method6631(arg3, arg1, arg2, 0, arg4);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!kv;Lclient!iaa;)Lclient!jj;")
	@Override
	public Interface11 method6125(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "(B)V")
	@Override
	protected void method3929() {
		if (Static364.aClass211_7 == super.aClass211_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static74.aClass211_3 == super.aClass211_5) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static204.aClass211_4 == super.aClass211_5) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	@Override
	protected void method6053() {
		super.method6053();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[FLclient!wd;IBZII)Lclient!oq;")
	@Override
	protected Interface20 method3978(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class366 arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean68 || Static439.method6796(arg4) && Static439.method6796(arg0)) {
			return new Class30_Sub3(this, arg2, arg4, arg0, arg3, arg1, 0, 0);
		} else if (this.aBoolean72) {
			return new Class30_Sub1(this, arg2, arg4, arg0, arg1, 0, 0);
		} else {
			@Pc(61) Class30_Sub3 local61 = new Class30_Sub3(this, arg2, Static258.aClass160_13, Static629.method8469(arg4), Static629.method8469(arg0));
			local61.method6633(arg0, arg1, arg4, arg2);
			return local61;
		}
	}

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "(B)F")
	@Override
	protected float method3998() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ[IIBII)Lclient!oq;")
	@Override
	public Interface20 method3928(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean68 || Static439.method6796(arg0) && Static439.method6796(arg3)) {
			return new Class30_Sub3(this, arg0, arg3, arg1, arg2, 0, arg4);
		} else if (this.aBoolean72) {
			return new Class30_Sub1(this, arg0, arg3, arg2, 0, arg4);
		} else {
			@Pc(46) Class30_Sub3 local46 = new Class30_Sub3(this, Static456.aClass366_9, Static258.aClass160_9, Static629.method8469(arg0), Static629.method8469(arg3));
			local46.method6629(arg0, arg4, 0, arg2, 0, arg3);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(Z)V")
	@Override
	protected void method3960() {
		this.method752();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!km;Lclient!km;FLclient!km;)Lclient!km;")
	@Override
	public Class40 method6067(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class40 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(Z)V")
	@Override
	protected void method3909() {
		this.method3976();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt4895 > local10; local10++) {
			@Pc(17) Class8_Sub1 local17 = super.aClass8_Sub1Array4[local10];
			@Pc(21) int local21 = local17.method5203();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method5205() / 255.0F;
			Static50.aFloatArray22[0] = local17.method5206();
			Static50.aFloatArray22[1] = local17.method5198();
			Static50.aFloatArray22[2] = local17.method5207();
			Static50.aFloatArray22[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static50.aFloatArray22, 0);
			Static50.aFloatArray22[2] = local31 * (float) (local21 & 0xFF);
			Static50.aFloatArray22[3] = 1.0F;
			Static50.aFloatArray22[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static50.aFloatArray22[0] = (float) (local21 >> 16 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static50.aFloatArray22, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method5200() * local17.method5200()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt4913) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method3909();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!uh;ILclient!kga;IIII)V")
	@Override
	public void method3977(@OriginalArg(0) Class342 arg0, @OriginalArg(2) Interface13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static449.aClass342_2 == arg0) {
			local10 = 1;
			local14 = arg3 * 2;
		} else if (arg0 == Static546.aClass342_4) {
			local14 = arg3 + 1;
			local10 = 3;
		} else if (arg0 == Static525.aClass342_3) {
			local14 = arg3 * 3;
			local10 = 4;
		} else if (arg0 == Static573.aClass342_5) {
			local14 = arg3 + 2;
			local10 = 6;
		} else if (arg0 == Static16.aClass342_1) {
			local10 = 5;
			local14 = arg3 + 2;
		} else {
			local14 = arg3;
			local10 = 0;
		}
		@Pc(74) Class160 local74 = arg1.method4653();
		@Pc(77) Class25_Sub1 local77 = (Class25_Sub1) arg1;
		local77.method6503();
		OpenGL.glDrawElements(local10, local14, Static475.method7039(local74), local77.method6502() + (long) (arg4 * local74.anInt5547));
	}

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "()Z")
	@Override
	public boolean method6133() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lclient!iaa;")
	@Override
	public Interface8 method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILclient!uh;)V")
	@Override
	public void method3891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class342 arg2) {
		@Pc(19) byte local19;
		@Pc(23) int local23;
		if (Static449.aClass342_2 == arg2) {
			local19 = 1;
			local23 = arg1 * 2;
		} else if (Static546.aClass342_4 == arg2) {
			local23 = arg1 + 1;
			local19 = 3;
		} else if (Static525.aClass342_3 == arg2) {
			local19 = 4;
			local23 = arg1 * 3;
		} else if (Static573.aClass342_5 == arg2) {
			local23 = arg1 + 2;
			local19 = 6;
		} else if (arg2 == Static16.aClass342_1) {
			local23 = arg1 + 2;
			local19 = 5;
		} else {
			local23 = arg1;
			local19 = 0;
		}
		OpenGL.glDrawArrays(local19, arg0, local23);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(JB)V")
	public synchronized void method754(@OriginalArg(0) long arg0) {
		@Pc(13) Class8 local13 = new Class8();
		local13.aLong285 = arg0;
		this.aClass43_11.method1424(local13);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method3901(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(10) Long local10 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local10);
	}

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "(B)V")
	@Override
	protected void method3911() {
		if (super.aBoolean358 && !super.aBoolean356) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(ZI)Lclient!el;")
	@Override
	public Interface4 method3988(@OriginalArg(0) boolean arg0) {
		return new Class25_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!wd;Lclient!jm;Z)Z")
	@Override
	public boolean method3874(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class160 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "()V")
	@Override
	public void method6128() {
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(B)V")
	@Override
	protected void method3883() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray50, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(II)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "(Z)V")
	@Override
	protected void method3971() {
		Static50.aFloatArray22[1] = super.aFloat89 * super.aFloat82;
		Static50.aFloatArray22[3] = 1.0F;
		Static50.aFloatArray22[0] = super.aFloat85 * super.aFloat89;
		Static50.aFloatArray22[2] = super.aFloat89 * super.aFloat86;
		OpenGL.glLightfv(16384, 4609, Static50.aFloatArray22, 0);
		Static50.aFloatArray22[3] = 1.0F;
		Static50.aFloatArray22[1] = -super.aFloat90 * super.aFloat82;
		Static50.aFloatArray22[2] = -super.aFloat90 * super.aFloat86;
		Static50.aFloatArray22[0] = -super.aFloat90 * super.aFloat85;
		OpenGL.glLightfv(16385, 4609, Static50.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "()V")
	@Override
	public void method6061() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6069(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6131(arg2, arg3);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!jj;)V")
	@Override
	public void method6078(@OriginalArg(0) Interface11 arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "(I)V")
	@Override
	protected void method3902() {
		for (@Pc(10) int local10 = super.anInt4897 - 1; local10 >= 0; local10--) {
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
			@Pc(82) int local82 = local76 + 16384;
			OpenGL.glLightfv(local82, 4608, local74, 0);
			OpenGL.glLightf(local82, 4615, 0.0F);
			OpenGL.glLightf(local82, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method3902();
	}

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "(I)V")
	@Override
	protected void method3914() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass207Array3[super.anInt4899] == Static42.aClass207_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass54_Sub3Array3[super.anInt4899].method5146(Static167.aFloatArray41), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "(I)V")
	@Override
	protected void method3907() {
		OpenGL.glTexEnvi(8960, 34162, Static244.method4442(super.aClass34Array6[super.anInt4899]));
	}

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "(I)V")
	@Override
	protected void method3964() {
		Static50.aFloatArray22[2] = (float) (super.anInt4930 & 0xFF) / 255.0F;
		Static50.aFloatArray22[3] = (float) (super.anInt4930 >>> 24) / 255.0F;
		Static50.aFloatArray22[0] = (float) (super.anInt4930 & 0xFF0000) / 1.671168E7F;
		Static50.aFloatArray22[1] = (float) (super.anInt4930 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static50.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "(I)V")
	@Override
	protected void method3984() {
		if (super.aBoolean360) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!ai", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt4732 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt775, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZB[[I)Lclient!vq;")
	@Override
	public Interface25 method3898(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class30_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!wd;ILclient!jm;)Z")
	@Override
	public boolean method3995(@OriginalArg(0) Class366 arg0, @OriginalArg(2) Class160 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZZILclient!pt;)V")
	@Override
	public void method4000(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class265 arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static68.method1796(arg3));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "(I)V")
	@Override
	protected void method3973() {
		OpenGL.glScissor(super.anInt4901 + super.anInt4905, -super.anInt4912 + super.anInt4732 + super.anInt4923, super.anInt4927 - super.anInt4901, -super.anInt4926 + super.anInt4912);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([BILclient!wd;III)Lclient!ak;")
	@Override
	public Interface1 method3912(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class366 arg1) {
		return new Class30_Sub2(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "(Z)V")
	@Override
	protected void method3974() {
		OpenGL.glDepthMask(super.aBoolean361 && super.aBoolean354);
	}

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "(I)V")
	@Override
	public void method3999() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray45, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray49, 0);
	}

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "(B)V")
	@Override
	protected void method3955() {
		OpenGL.glTexEnvi(8960, 34161, Static244.method4442(super.aClass34Array5[super.anInt4899]));
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V")
	@Override
	protected void method3877() {
		OpenGL.glActiveTexture(super.anInt4899 + 33984);
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(Z)V")
	@Override
	protected void method3968() {
	}

	@OriginalMember(owner = "client!ai", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)Lclient!kv;")
	@Override
	public Interface14 method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "(B)V")
	@Override
	protected void method3987() {
		if (super.aBoolean364) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIZ)V")
	public synchronized void method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class8_Sub17 local8 = new Class8_Sub17(arg0);
		local8.aLong285 = arg1;
		this.aClass43_6.method1424(local8);
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(II)V")
	@Override
	public void method3934(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)V")
	public synchronized void method757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class8_Sub17 local8 = new Class8_Sub17(arg1);
		local8.aLong285 = arg0;
		this.aClass43_7.method1424(local8);
	}

	@OriginalMember(owner = "client!ai", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method3916(true);
		OpenGL.glClear(256);
	}
}
