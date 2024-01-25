import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class75_Sub1_Sub1 extends Class75_Sub1 {

	@OriginalMember(owner = "client!dga", name = "ji", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!dga", name = "xi", descriptor = "Z")
	private boolean aBoolean161;

	@OriginalMember(owner = "client!dga", name = "vi", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!dga", name = "Xg", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!dga", name = "Si", descriptor = "Z")
	private boolean aBoolean164;

	@OriginalMember(owner = "client!dga", name = "wi", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!dga", name = "th", descriptor = "I")
	private int anInt2025;

	@OriginalMember(owner = "client!dga", name = "Oi", descriptor = "Lclient!tf;")
	private final Class340 aClass340_8 = new Class340();

	@OriginalMember(owner = "client!dga", name = "qh", descriptor = "Lclient!tf;")
	private final Class340 aClass340_9 = new Class340();

	@OriginalMember(owner = "client!dga", name = "yi", descriptor = "Lclient!tf;")
	private final Class340 aClass340_10 = new Class340();

	@OriginalMember(owner = "client!dga", name = "ai", descriptor = "Lclient!tf;")
	private final Class340 aClass340_11 = new Class340();

	@OriginalMember(owner = "client!dga", name = "Gg", descriptor = "Lclient!tf;")
	private final Class340 aClass340_12 = new Class340();

	@OriginalMember(owner = "client!dga", name = "ch", descriptor = "Lclient!tf;")
	private final Class340 aClass340_13 = new Class340();

	@OriginalMember(owner = "client!dga", name = "Ki", descriptor = "Lclient!tf;")
	private final Class340 aClass340_14 = new Class340();

	@OriginalMember(owner = "client!dga", name = "Li", descriptor = "[Lclient!gh;")
	private final Class133_Sub1[] aClass133_Sub1Array1 = new Class133_Sub1[16];

	@OriginalMember(owner = "client!dga", name = "rh", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!dga", name = "Ng", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!dga", name = "Qh", descriptor = "I")
	private final int anInt2028 = 0;

	@OriginalMember(owner = "client!dga", name = "ei", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!dga", name = "Wh", descriptor = "Ljava/lang/String;")
	private final String aString16;

	@OriginalMember(owner = "client!dga", name = "gh", descriptor = "Ljava/lang/String;")
	private final String aString15;

	@OriginalMember(owner = "client!dga", name = "Hg", descriptor = "I")
	private final int anInt2027;

	@OriginalMember(owner = "client!dga", name = "Th", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!dga", name = "Eh", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!dga", name = "ci", descriptor = "Z")
	private final boolean aBoolean166;

	@OriginalMember(owner = "client!dga", name = "fh", descriptor = "Z")
	public final boolean aBoolean165;

	@OriginalMember(owner = "client!dga", name = "ni", descriptor = "Z")
	public final boolean aBoolean170;

	@OriginalMember(owner = "client!dga", name = "ph", descriptor = "Z")
	public final boolean aBoolean169;

	@OriginalMember(owner = "client!dga", name = "Sg", descriptor = "[I")
	public final int[] anIntArray95;

	@OriginalMember(owner = "client!dga", name = "Wg", descriptor = "I")
	public final int anInt2026;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!lga;I)V")
	public Class75_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class223 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString16 = OpenGL.glGetString(7936).toLowerCase();
			this.aString15 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString16.indexOf("microsoft") != -1 || this.aString16.indexOf("brian paul") != -1 || this.aString16.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(118) String local118 = OpenGL.glGetString(7938);
			@Pc(126) String[] local126 = Static26.method332(' ', local118.replace('.', ' '));
			if (local126.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(142) int local142;
			try {
				@Pc(136) int local136 = Static543.method7715(local126[0]);
				local142 = Static543.method7715(local126[1]);
				this.anInt2027 = local136 * 10 + local142;
			} catch (@Pc(152) NumberFormatException local152) {
				throw new RuntimeException("");
			}
			if (this.anInt2027 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(201) int[] local201 = new int[1];
				OpenGL.glGetIntegerv(34018, local201, 0);
				super.anInt7658 = local201[0];
				if (super.anInt7658 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7661 = 8;
				this.aBoolean167 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean565 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean168 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean561 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean166 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean569 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean165 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean170 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean169 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray95 = new int[super.anInt7658];
				this.anInt2026 = Stream.b() ? 33639 : 5121;
				if (this.aString15.indexOf("radeon") != -1) {
					local142 = 0;
					@Pc(328) boolean local328 = false;
					@Pc(330) boolean local330 = false;
					@Pc(339) String[] local339 = Static26.method332(' ', this.aString15.replace('/', ' '));
					for (@Pc(341) int local341 = 0; local341 < local339.length; local341++) {
						@Pc(347) String local347 = local339[local341];
						try {
							if (local347.length() > 0) {
								if (local347.charAt(0) == 'x' && local347.length() >= 3 && Static298.method4815(local347.substring(1, 3))) {
									local330 = true;
									local347 = local347.substring(1);
								}
								if (local347.equals("hd")) {
									local328 = true;
								} else {
									if (local347.startsWith("hd")) {
										local328 = true;
										local347 = local347.substring(2);
									}
									if (local347.length() >= 4 && Static298.method4815(local347.substring(0, 4))) {
										local142 = Static543.method7715(local347.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(426) Exception local426) {
						}
					}
					if (!local330 && !local328) {
						if (local142 >= 7000 && local142 <= 9250) {
							super.aBoolean569 = false;
						}
						if (local142 >= 7000 && local142 <= 7999) {
							this.aBoolean167 = false;
						}
					}
					this.aBoolean168 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString16.indexOf("intel");
				if (this.aBoolean167) {
					try {
						@Pc(496) int[] local496 = new int[1];
						OpenGL.glGenBuffersARB(1, local496, 0);
					} catch (@Pc(502) Throwable local502) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(508) Throwable local508) {
			local508.printStackTrace();
			this.method6672();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(BI)Lclient!oo;")
	@Override
	protected Class23 method6750(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class23_Sub2(this, super.aClass223_90);
		} else if (arg0 == 4) {
			return new Class23_Sub7(this, super.aClass223_90, super.aClass184_6);
		} else if (arg0 == 8) {
			return new Class23_Sub1(this, super.aClass223_90, super.aClass184_6);
		} else {
			return super.method6750(arg0);
		}
	}

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "(I)V")
	@Override
	protected void method6844() {
		OpenGL.glDepthMask(super.aBoolean566 && super.aBoolean558);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZZBLclient!oba;I)V")
	@Override
	public void method6831(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class261 arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static451.method6946(arg2));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ot;I)V")
	@Override
	public void method6753(@OriginalArg(0) Class207 arg0) {
		@Pc(9) Class355[] local9 = ((Class207_Sub1) arg0).aClass355Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(26) int local26 = 0; local26 < local9.length; local26++) {
			@Pc(32) Class355 local32 = local9[local26];
			@Pc(37) Class133_Sub1 local37 = this.aClass133_Sub1Array1[local26];
			@Pc(39) int local39 = 0;
			@Pc(43) int local43 = local37.method3661();
			@Pc(49) long local49 = local37.method3795();
			local37.method3792();
			for (@Pc(56) int local56 = 0; local56 < local32.method8342(); local56++) {
				@Pc(63) Class70 local63 = local32.method8347(local56);
				if (local63 == Static93.aClass70_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local43, local49 + (long) local39);
				} else if (Static93.aClass70_2 == local63) {
					OpenGL.glNormalPointer(5126, local43, local49 + (long) local39);
					local15 = true;
				} else if (Static93.aClass70_3 == local63) {
					OpenGL.glColorPointer(4, 5121, local43, (long) local39 + local49);
					local13 = true;
				} else if (Static93.aClass70_4 == local63) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local43, (long) local39 + local49);
				} else if (Static93.aClass70_5 == local63) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local43, (long) local39 + local49);
				} else if (Static93.aClass70_6 == local63) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local43, (long) local39 + local49);
				} else if (local63 == Static93.aClass70_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local43, local49 + (long) local39);
				}
				local39 += local63.anInt1376;
			}
		}
		if (this.aBoolean160 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean160 = local17;
		}
		if (this.aBoolean161 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean161 = local15;
		}
		if (this.aBoolean164 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean164 = local13;
		}
		@Pc(317) int local317;
		if (local11 > this.anInt2025) {
			for (local317 = this.anInt2025; local317 < local11; local317++) {
				OpenGL.glClientActiveTexture(local317 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2025 = local11;
		} else if (local11 < this.anInt2025) {
			for (local317 = local11; local317 < this.anInt2025; local317++) {
				OpenGL.glClientActiveTexture(local317 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2025 = local11;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!lc;)V")
	@Override
	public void method6769(@OriginalArg(1) Class219 arg0) {
		if (arg0 == Static10.aClass219_1) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(6) int local6 = Static501.method4418(arg0);
		OpenGL.glTexGeni(8192, 9472, local6);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local6);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local6);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!hh;Lclient!on;Z)Z")
	@Override
	public boolean method6819(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class274 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!dga", name = "u", descriptor = "()V")
	@Override
	public void method6642() {
	}

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "(I)V")
	@Override
	protected void method6812() {
		this.method1960();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6783(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!dga", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6752(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!dga", name = "A", descriptor = "()Z")
	@Override
	public boolean method6705() {
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(II)Lclient!kb;")
	@Override
	public Interface14 method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dga", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt2028;
	}

	@OriginalMember(owner = "client!dga", name = "s", descriptor = "(I)V")
	@Override
	protected void method6735() {
		@Pc(17) int local17 = this.anIntArray95[super.anInt7659];
		if (local17 != 0) {
			this.anIntArray95[super.anInt7659] = 0;
			OpenGL.glBindTexture(local17, 0);
			OpenGL.glDisable(local17);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[[IZ)Lclient!nm;")
	@Override
	public Interface19 method6765(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class24_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!hh;III[B)Lclient!jca;")
	@Override
	public Interface13 method6849(@OriginalArg(1) Class155 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class24_Sub1(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6724(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!dga", name = "U", descriptor = "(I)V")
	@Override
	protected void method6757() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass211Array3[super.anInt7659] == Static486.aClass211_4) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass109_Sub3Array3[super.anInt7659].method4345(Static261.aFloatArray47), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)Lclient!uba;")
	@Override
	public Interface25 method6817(@OriginalArg(0) boolean arg0) {
		return new Class133_Sub2(this, Static435.aClass274_14, arg0);
	}

	@OriginalMember(owner = "client!dga", name = "r", descriptor = "(B)V")
	@Override
	protected void method6798() {
		super.aFloat155 = (float) (super.anInt7680 - super.anInt7675);
		super.aFloat142 = super.aFloat155 - (float) super.anInt7657;
		if ((float) super.anInt7687 > super.aFloat142) {
			super.aFloat142 = (float) super.anInt7687;
		}
		OpenGL.glFogf(2915, super.aFloat142);
		OpenGL.glFogf(2916, super.aFloat155);
		Static145.aFloatArray38[2] = (float) (super.anInt7670 & 0xFF) / 255.0F;
		Static145.aFloatArray38[0] = (float) (super.anInt7670 & 0xFF0000) / 1.671168E7F;
		Static145.aFloatArray38[1] = (float) (super.anInt7670 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static145.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!dga", name = "G", descriptor = "(I)V")
	@Override
	protected void method6740() {
		OpenGL.glTexEnvi(8960, 34162, Static441.method4894(super.aClass344Array6[super.anInt7659]));
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6834(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(11) Long local11 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local11)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "()V")
	@Override
	protected void method6667() {
		super.method6667();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!dga", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7590 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt2026, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!dga", name = "t", descriptor = "(I)V")
	@Override
	protected void method6841() {
		if (super.aBoolean571 && !super.aBoolean575) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!dga", name = "gb", descriptor = "(I)V")
	@Override
	protected void method6726() {
		if (super.aBoolean572) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZIB[BILclient!hh;II)Lclient!cf;")
	@Override
	protected Interface7 method6837(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) Class155 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean166 || Static232.method4114(arg4) && Static232.method4114(arg1)) {
			return new Class24_Sub4(this, arg3, arg4, arg1, arg0, arg2, 0, 0);
		} else if (this.aBoolean168) {
			return new Class24_Sub3(this, arg3, arg4, arg1, arg2, 0, 0);
		} else {
			@Pc(44) Class24_Sub4 local44 = new Class24_Sub4(this, arg3, Static435.aClass274_13, Static314.method4970(arg4), Static314.method4970(arg1));
			local44.method8716(arg3, arg2, 0, arg1, arg4);
			return local44;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!hh;IIILclient!on;)Lclient!cf;")
	@Override
	public Interface7 method6818(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class274 arg3) {
		if (this.aBoolean166 || Static232.method4114(arg2) && Static232.method4114(arg1)) {
			return new Class24_Sub4(this, arg0, arg3, arg2, arg1);
		} else if (this.aBoolean168) {
			return new Class24_Sub3(this, arg0, arg3, arg2, arg1);
		} else {
			return new Class24_Sub4(this, arg0, arg3, Static314.method4970(arg2), Static314.method4970(arg1));
		}
	}

	@OriginalMember(owner = "client!dga", name = "E", descriptor = "(I)V")
	@Override
	protected void method6833() {
		for (@Pc(10) int local10 = super.anInt7658 - 1; local10 >= 0; local10--) {
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
		@Pc(76) float[] local76 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(78) int local78 = 0; local78 < 8; local78++) {
			@Pc(89) int local89 = local78 + 16384;
			OpenGL.glLightfv(local89, 4608, local76, 0);
			OpenGL.glLightf(local89, 4615, 0.0F);
			OpenGL.glLightf(local89, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method6833();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!bl;IZ)V")
	@Override
	public void method6827(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1) {
		this.aClass133_Sub1Array1[arg1] = (Class133_Sub1) arg0;
	}

	@OriginalMember(owner = "client!dga", name = "db", descriptor = "(I)V")
	@Override
	protected void method6835() {
		this.method6777();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt7660 > local10; local10++) {
			@Pc(17) Class6_Sub10 local17 = super.aClass6_Sub10Array5[local10];
			@Pc(21) int local21 = local17.method8328();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method8334() / 255.0F;
			Static145.aFloatArray38[0] = (float) local17.method8332();
			Static145.aFloatArray38[1] = (float) local17.method8327();
			Static145.aFloatArray38[2] = (float) local17.method8329();
			Static145.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static145.aFloatArray38, 0);
			Static145.aFloatArray38[2] = (float) (local21 & 0xFF) * local31;
			Static145.aFloatArray38[3] = 1.0F;
			Static145.aFloatArray38[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static145.aFloatArray38[0] = (float) (local21 >> 16 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static145.aFloatArray38, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method8331() * local17.method8331()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt7683) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method6835();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[FIIIZILclient!hh;)Lclient!cf;")
	@Override
	protected Interface7 method6748(@OriginalArg(1) float[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class155 arg4) {
		if (this.aBoolean166 || Static232.method4114(arg1) && Static232.method4114(arg3)) {
			return new Class24_Sub4(this, arg4, arg1, arg3, arg2, arg0, 0, 0);
		} else if (this.aBoolean168) {
			return new Class24_Sub3(this, arg4, arg1, arg3, arg0, 0, 0);
		} else {
			@Pc(56) Class24_Sub4 local56 = new Class24_Sub4(this, arg4, Static435.aClass274_17, Static314.method4970(arg1), Static314.method4970(arg3));
			local56.method8728(arg1, arg3, arg0, arg4);
			return local56;
		}
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(ZI)Lclient!bl;")
	@Override
	public Interface6 method6768(@OriginalArg(0) boolean arg0) {
		return new Class133_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "()Z")
	@Override
	public boolean method6664() {
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(JB)V")
	public synchronized void method1955(@OriginalArg(0) long arg0) {
		@Pc(12) Class6 local12 = new Class6();
		local12.aLong346 = arg0;
		this.aClass340_14.method8131(local12);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "()V")
	@Override
	public void method6663() {
	}

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "()Lclient!cba;")
	@Override
	public Class52 method6699() {
		@Pc(7) int local7 = -1;
		if (this.aString16.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString16.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString16.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class52(local7, "OpenGL", this.anInt2027, this.aString15, 0L);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!sn;Lclient!sn;FLclient!sn;)Lclient!sn;")
	@Override
	public Class81 method6656(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class81 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "(B)V")
	@Override
	protected void method6842() {
		if (super.aBoolean576) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6797(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "(B)V")
	@Override
	protected void method6806() {
		OpenGL.glTexEnvi(8960, 34161, Static441.method4894(super.aClass344Array5[super.anInt7659]));
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "()V")
	@Override
	public void method6717() {
		if (super.anInt7597 <= 0 && super.anInt7590 <= 0) {
			return;
		}
		@Pc(22) int local22 = super.anInt7656;
		@Pc(25) int local25 = super.anInt7686;
		@Pc(28) int local28 = super.anInt7681;
		@Pc(31) int local31 = super.anInt7668;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6850();
		this.method6846(false);
		this.method6780(false);
		this.method6815(false);
		this.method6752(false);
		this.method6814((Interface1) null);
		this.method6809(false, false, -2);
		this.method6830(1);
		this.method6736(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7597, super.anInt7590, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZILclient!oba;Z)V")
	@Override
	protected void method6760(@OriginalArg(1) int arg0, @OriginalArg(2) Class261 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static451.method6946(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!bha;Lclient!kb;)Lclient!tha;")
	@Override
	public Interface24 method6641(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Interface14 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method6671(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub6 local19;
		while (!this.aClass340_9.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_9.method8127();
			Static448.anIntArray490[local11++] = (int) local19.aLong346;
			super.anInt7649 -= local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static448.anIntArray490, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static448.anIntArray490, 0);
			local11 = 0;
		}
		while (!this.aClass340_10.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_10.method8127();
			Static448.anIntArray490[local11++] = (int) local19.aLong346;
			super.anInt7648 -= local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static448.anIntArray490, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static448.anIntArray490, 0);
			local11 = 0;
		}
		while (!this.aClass340_11.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_11.method8127();
			Static448.anIntArray490[local11++] = local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static448.anIntArray490, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static448.anIntArray490, 0);
			local11 = 0;
		}
		while (!this.aClass340_12.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_12.method8127();
			Static448.anIntArray490[local11++] = (int) local19.aLong346;
			super.anInt7645 -= local19.anInt482;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static448.anIntArray490, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static448.anIntArray490, 0);
		}
		while (!this.aClass340_8.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_8.method8127();
			OpenGL.glDeleteLists((int) local19.aLong346, local19.anInt482);
		}
		@Pc(230) Class6 local230;
		while (!this.aClass340_13.method8121()) {
			local230 = this.aClass340_13.method8127();
			OpenGL.glDeleteProgramARB((int) local230.aLong346);
		}
		while (!this.aClass340_14.method8121()) {
			local230 = this.aClass340_14.method8127();
			OpenGL.glDeleteObjectARB(local230.aLong346);
		}
		while (!this.aClass340_8.method8121()) {
			local19 = (Class6_Sub6) this.aClass340_8.method8127();
			OpenGL.glDeleteLists((int) local19.aLong346, local19.anInt482);
		}
		if (this.E() > 100663296 && this.aLong61 + 60000L < Static549.method7758()) {
			System.gc();
			this.aLong61 = Static549.method7758();
		}
		super.method6671(local9);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)F")
	@Override
	protected float method6733() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[Lclient!uc;)Lclient!ot;")
	@Override
	public Class207 method6803(@OriginalArg(1) Class355[] arg0) {
		return new Class207_Sub1(arg0);
	}

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "(B)V")
	@Override
	protected void method6747() {
		if (super.aBoolean567) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "(I)V")
	@Override
	protected void method6781() {
		OpenGL.glViewport(super.anInt7651, super.anInt7678, super.anInt7597, super.anInt7590);
	}

	@OriginalMember(owner = "client!dga", name = "H", descriptor = "(I)V")
	@Override
	protected void method6739() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray68, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6711(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6639(arg2, arg3);
	}

	@OriginalMember(owner = "client!dga", name = "r", descriptor = "()V")
	@Override
	public void method6715() {
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
	public synchronized void method1956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub6 local8 = new Class6_Sub6(arg1);
		local8.aLong346 = (long) arg0;
		this.aClass340_9.method8131(local8);
	}

	@OriginalMember(owner = "client!dga", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZII)V")
	public synchronized void method1957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub6 local8 = new Class6_Sub6(arg1);
		local8.aLong346 = (long) arg0;
		this.aClass340_10.method8131(local8);
	}

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "(B)V")
	@Override
	protected void method6774() {
		this.aBoolean162 = false;
		this.method1960();
	}

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "(II)V")
	public synchronized void method1958(@OriginalArg(0) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong346 = (long) arg0;
		this.aClass340_13.method8131(local7);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "(I)V")
	@Override
	protected void method6789() {
		Static145.aFloatArray38[1] = (float) (super.anInt7650 & 0xFF00) / 65280.0F;
		Static145.aFloatArray38[0] = (float) (super.anInt7650 & 0xFF0000) / 1.671168E7F;
		Static145.aFloatArray38[3] = (float) (super.anInt7650 >>> 24) / 255.0F;
		Static145.aFloatArray38[2] = (float) (super.anInt7650 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static145.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!tha;)V")
	@Override
	public void method6665(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!cb;IILclient!uba;III)V")
	@Override
	public void method6746(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface25 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg0 == Static258.aClass51_7) {
			local10 = 1;
			local14 = arg5 * 2;
		} else if (arg0 == Static96.aClass51_3) {
			local14 = arg5 + 1;
			local10 = 3;
		} else if (Static118.aClass51_4 == arg0) {
			local10 = 4;
			local14 = arg5 * 3;
		} else if (arg0 == Static492.aClass51_6) {
			local14 = arg5 + 2;
			local10 = 6;
		} else if (arg0 == Static345.aClass51_8) {
			local10 = 5;
			local14 = arg5 + 2;
		} else {
			local10 = 0;
			local14 = arg5;
		}
		@Pc(76) Class274 local76 = arg3.method8678();
		@Pc(79) Class133_Sub2 local79 = (Class133_Sub2) arg3;
		local79.method3792();
		OpenGL.glDrawElements(local10, local14, Static142.method2789(local76), local79.method3795() + (long) (arg4 * local76.anInt7437));
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)V")
	@Override
	public void method6650(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIZ[III)Lclient!cf;")
	@Override
	public Interface7 method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean166 || Static232.method4114(arg1) && Static232.method4114(arg4)) {
			return new Class24_Sub4(this, arg1, arg4, arg2, arg3, 0, arg5);
		} else if (this.aBoolean168) {
			return new Class24_Sub3(this, arg1, arg4, arg3, 0, arg5);
		} else {
			@Pc(55) Class24_Sub4 local55 = new Class24_Sub4(this, Static432.aClass155_45, Static435.aClass274_13, Static314.method4970(arg1), Static314.method4970(arg4));
			local55.method8721(0, arg5, arg3, arg4, arg1, 0);
			return local55;
		}
	}

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "(B)V")
	@Override
	protected void method6745() {
		if (super.aBoolean574) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!cb;III)V")
	@Override
	public void method6853(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) byte local25;
		@Pc(29) int local29;
		if (arg0 == Static258.aClass51_7) {
			local25 = 1;
			local29 = arg1 * 2;
		} else if (arg0 == Static96.aClass51_3) {
			local25 = 3;
			local29 = arg1 + 1;
		} else if (arg0 == Static118.aClass51_4) {
			local25 = 4;
			local29 = arg1 * 3;
		} else if (Static492.aClass51_6 == arg0) {
			local29 = arg1 + 2;
			local25 = 6;
		} else if (Static345.aClass51_8 == arg0) {
			local29 = arg1 + 2;
			local25 = 5;
		} else {
			local25 = 0;
			local29 = arg1;
		}
		OpenGL.glDrawArrays(local25, arg2, local29);
	}

	@OriginalMember(owner = "client!dga", name = "V", descriptor = "(I)V")
	@Override
	protected void method6799() {
		if (Static89.aClass171_1 == super.aClass171_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static329.aClass171_5 == super.aClass171_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static636.aClass171_7 == super.aClass171_6) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!dga", name = "y", descriptor = "(I)V")
	@Override
	public void method6821() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray62, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "()V")
	@Override
	public void method6645() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(I)V")
	@Override
	protected void method6721() {
		if (super.aBoolean570 && super.aBoolean564 && super.anInt7657 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "(II)Lclient!bha;")
	@Override
	public Interface5 method6674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!on;Lclient!hh;)Z")
	@Override
	public boolean method6786(@OriginalArg(1) Class274 arg0, @OriginalArg(2) Class155 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!dga", name = "K", descriptor = "(I)V")
	@Override
	protected void method6793() {
		OpenGL.glActiveTexture(super.anInt7659 + 33984);
	}

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "(I)V")
	@Override
	protected void method6785() {
		if (super.aBoolean557) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)V")
	@Override
	public void method6832(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!dga", name = "L", descriptor = "(I)V")
	@Override
	protected void method6845() {
		Static145.aFloatArray38[3] = 1.0F;
		Static145.aFloatArray38[0] = super.aFloat152 * super.aFloat153;
		Static145.aFloatArray38[1] = super.aFloat147 * super.aFloat152;
		Static145.aFloatArray38[2] = super.aFloat152 * super.aFloat146;
		OpenGL.glLightModelfv(2899, Static145.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "(I)V")
	@Override
	protected void method6790() {
		OpenGL.glScissor(super.anInt7656 + super.anInt7651, -super.anInt7668 + super.anInt7590 + super.anInt7678, -super.anInt7656 + super.anInt7686, -super.anInt7681 + super.anInt7668);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(II)V")
	@Override
	public void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6847() {
	}

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "(B)V")
	@Override
	protected void method6730() {
		Static145.aFloatArray38[0] = super.aFloat153 * super.aFloat145;
		Static145.aFloatArray38[1] = super.aFloat147 * super.aFloat145;
		Static145.aFloatArray38[3] = 1.0F;
		Static145.aFloatArray38[2] = super.aFloat146 * super.aFloat145;
		OpenGL.glLightfv(16384, 4609, Static145.aFloatArray38, 0);
		Static145.aFloatArray38[0] = -super.aFloat144 * super.aFloat153;
		Static145.aFloatArray38[1] = -super.aFloat144 * super.aFloat147;
		Static145.aFloatArray38[3] = 1.0F;
		Static145.aFloatArray38[2] = super.aFloat146 * -super.aFloat144;
		OpenGL.glLightfv(16385, 4609, Static145.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method6770(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(13) Long local13 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local13);
	}

	@OriginalMember(owner = "client!dga", name = "t", descriptor = "(B)V")
	private void method1960() {
		if (this.aBoolean163) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass111_5.method3099()) {
			if (!this.aBoolean162) {
				OpenGL.glLoadMatrixf(super.aClass109_Sub3_18.method4345(Static261.aFloatArray47), 0);
				this.aBoolean162 = true;
				this.method6821();
				this.method6835();
			}
			if (super.aBoolean555) {
				this.aBoolean163 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass109_Sub3_15.method4345(Static261.aFloatArray47), 0);
				this.aBoolean163 = true;
			}
		} else if (super.aBoolean555) {
			OpenGL.glLoadIdentity();
			this.aBoolean163 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass109_Sub3_15.method4345(Static261.aFloatArray47), 0);
			this.aBoolean163 = false;
		}
	}
}
