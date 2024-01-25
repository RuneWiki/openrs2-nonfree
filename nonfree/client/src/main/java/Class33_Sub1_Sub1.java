import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class33_Sub1_Sub1 extends Class33_Sub1 {

	@OriginalMember(owner = "client!ck", name = "ui", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!ck", name = "vi", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!ck", name = "xi", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!ck", name = "zi", descriptor = "Z")
	private boolean aBoolean138;

	@OriginalMember(owner = "client!ck", name = "Ai", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "client!ck", name = "Bi", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!ck", name = "Ci", descriptor = "I")
	private int anInt1755;

	@OriginalMember(owner = "client!ck", name = "nh", descriptor = "Lclient!qia;")
	private final Class276 aClass276_5 = new Class276();

	@OriginalMember(owner = "client!ck", name = "ki", descriptor = "Lclient!qia;")
	private final Class276 aClass276_6 = new Class276();

	@OriginalMember(owner = "client!ck", name = "pi", descriptor = "Lclient!qia;")
	private final Class276 aClass276_7 = new Class276();

	@OriginalMember(owner = "client!ck", name = "qi", descriptor = "Lclient!qia;")
	private final Class276 aClass276_8 = new Class276();

	@OriginalMember(owner = "client!ck", name = "ri", descriptor = "Lclient!qia;")
	private final Class276 aClass276_9 = new Class276();

	@OriginalMember(owner = "client!ck", name = "si", descriptor = "Lclient!qia;")
	private final Class276 aClass276_10 = new Class276();

	@OriginalMember(owner = "client!ck", name = "ti", descriptor = "Lclient!qia;")
	private final Class276 aClass276_11 = new Class276();

	@OriginalMember(owner = "client!ck", name = "yi", descriptor = "[Lclient!te;")
	private final Class75_Sub2[] aClass75_Sub2Array1 = new Class75_Sub2[16];

	@OriginalMember(owner = "client!ck", name = "wi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!ck", name = "Di", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!ck", name = "Oi", descriptor = "I")
	private final int anInt1757 = 0;

	@OriginalMember(owner = "client!ck", name = "Kg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ck", name = "Gi", descriptor = "Ljava/lang/String;")
	private final String aString12;

	@OriginalMember(owner = "client!ck", name = "Ki", descriptor = "Ljava/lang/String;")
	private final String aString13;

	@OriginalMember(owner = "client!ck", name = "Pi", descriptor = "I")
	private final int anInt1758;

	@OriginalMember(owner = "client!ck", name = "Ei", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!ck", name = "Mi", descriptor = "Z")
	private boolean aBoolean145;

	@OriginalMember(owner = "client!ck", name = "Li", descriptor = "Z")
	private final boolean aBoolean144;

	@OriginalMember(owner = "client!ck", name = "Ni", descriptor = "Z")
	public final boolean aBoolean146;

	@OriginalMember(owner = "client!ck", name = "Ii", descriptor = "Z")
	public final boolean aBoolean142;

	@OriginalMember(owner = "client!ck", name = "Ji", descriptor = "Z")
	public final boolean aBoolean143;

	@OriginalMember(owner = "client!ck", name = "Hi", descriptor = "[I")
	public final int[] anIntArray73;

	@OriginalMember(owner = "client!ck", name = "Fi", descriptor = "I")
	public final int anInt1756;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!kha;I)V")
	public Class33_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString12 = OpenGL.glGetString(7936).toLowerCase();
			this.aString13 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString12.indexOf("microsoft") != -1 || this.aString12.indexOf("brian paul") != -1 || this.aString12.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static107.method2685(' ', local109.replace('.', ' '));
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(138) int local138;
			try {
				@Pc(132) int local132 = Static607.method8246(local117[0]);
				local138 = Static607.method8246(local117[1]);
				this.anInt1758 = local138 + local132 * 10;
			} catch (@Pc(147) NumberFormatException local147) {
				throw new RuntimeException("");
			}
			if (this.anInt1758 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(184) int[] local184 = new int[1];
				OpenGL.glGetIntegerv(34018, local184, 0);
				super.anInt2173 = local184[0];
				if (super.anInt2173 < 2) {
					throw new RuntimeException("");
				}
				super.anInt2163 = 8;
				this.aBoolean141 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean172 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean145 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean179 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean144 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean176 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean146 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean142 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean143 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray73 = new int[super.anInt2173];
				this.anInt1756 = Stream.b() ? 33639 : 5121;
				if (this.aString13.indexOf("radeon") != -1) {
					local138 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static107.method2685(' ', this.aString13.replace('/', ' '));
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static621.method8474(local308.substring(1, 3))) {
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
									if (local308.length() >= 4 && Static621.method8474(local308.substring(0, 4))) {
										local138 = Static607.method8246(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(376) Exception local376) {
						}
					}
					if (!local291 && !local289) {
						if (local138 >= 7000 && local138 <= 9250) {
							super.aBoolean176 = false;
						}
						if (local138 >= 7000 && local138 <= 7999) {
							this.aBoolean141 = false;
						}
					}
					this.aBoolean145 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString12.indexOf("intel");
				if (this.aBoolean141) {
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
			this.method6151();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
	@Override
	protected void method1999() {
		for (@Pc(10) int local10 = super.anInt2173 - 1; local10 >= 0; local10--) {
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
		this.anOpenGL1.setSwapInterval(0);
		super.method1999();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(II)V")
	@Override
	public void method2075(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(JI)V")
	public synchronized void method1729(@OriginalArg(0) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong277 = arg0;
		this.aClass276_11.method6906(local7);
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "()V")
	@Override
	public void method6173() {
	}

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "(B)V")
	@Override
	protected void method2026() {
		if (Static281.aClass86_10 == super.aClass86_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static62.aClass86_2 == super.aClass86_4) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass86_4 == Static478.aClass86_11) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	@Override
	protected void method1985(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local12);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!em;Lclient!ew;)Z")
	@Override
	public boolean method2017(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class89 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "(I)V")
	@Override
	protected void method2059() {
		OpenGL.glTexEnvi(8960, 34161, Static85.method2232(super.aClass363Array6[super.anInt2164]));
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIIZ[FILclient!em;I)Lclient!baa;")
	@Override
	protected Interface2 method1994(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) float[] arg2, @OriginalArg(6) Class82 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean144 || Static474.method7016(arg4) && Static474.method7016(arg0)) {
			return new Class105_Sub3(this, arg3, arg4, arg0, arg1, arg2, 0, 0);
		} else if (this.aBoolean145) {
			return new Class105_Sub1(this, arg3, arg4, arg0, arg2, 0, 0);
		} else {
			@Pc(35) Class105_Sub3 local35 = new Class105_Sub3(this, arg3, Static137.aClass89_12, Static95.method2482(arg4), Static95.method2482(arg0));
			local35.method6512(arg4, arg3, arg0, arg2);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(Z)V")
	@Override
	protected void method2079() {
		if (super.aBoolean174 && !super.aBoolean171) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "()Z")
	@Override
	public boolean method6216() {
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "()V")
	@Override
	public void method6167() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ck", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt2117 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt1756, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!sea;IB)V")
	@Override
	public void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) int arg2) {
		@Pc(17) byte local17;
		@Pc(15) int local15;
		if (Static39.aClass304_1 == arg1) {
			local15 = arg0 * 2;
			local17 = 1;
		} else if (Static499.aClass304_6 == arg1) {
			local15 = arg0 + 1;
			local17 = 3;
		} else if (arg1 == Static338.aClass304_5) {
			local15 = arg0 * 3;
			local17 = 4;
		} else if (arg1 == Static88.aClass304_2) {
			local17 = 6;
			local15 = arg0 + 2;
		} else if (arg1 == Static90.aClass304_3) {
			local15 = arg0 + 2;
			local17 = 5;
		} else {
			local17 = 0;
			local15 = arg0;
		}
		OpenGL.glDrawArrays(local17, arg2, local15);
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(B)V")
	@Override
	protected void method2022() {
		if (super.aBoolean173) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "(I)F")
	@Override
	protected float method2114() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lclient!st;")
	@Override
	public Interface25 method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "(I)V")
	@Override
	public void method2089() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray29, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "(I)V")
	@Override
	protected void method2100() {
		OpenGL.glScissor(super.anInt2182 + super.anInt2194, super.anInt2192 - (-super.anInt2117 + super.anInt2172), -super.anInt2182 + super.anInt2168, -super.anInt2169 + super.anInt2172);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method2064(@OriginalArg(1) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL1.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Lclient!pea;")
	@Override
	public Interface19 method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIZILclient!wga;)V")
	@Override
	public void method1988(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class371 arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static334.method8571(arg3));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "()V")
	@Override
	public void method6178() {
	}

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "()Lclient!oj;")
	@Override
	public Class248 method6230() {
		@Pc(7) int local7 = -1;
		if (this.aString12.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString12.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString12.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class248(local7, "OpenGL", this.anInt1758, this.aString13, 0L);
	}

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "(I)V")
	@Override
	protected void method2043() {
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "()V")
	@Override
	public void method6177() {
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(BZ)V")
	@Override
	public void method2102(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)V")
	@Override
	public void method6228(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
	@Override
	protected void method1989() {
		Static513.aFloatArray64[3] = 1.0F;
		Static513.aFloatArray64[2] = super.aFloat77 * super.aFloat84;
		Static513.aFloatArray64[0] = super.aFloat84 * super.aFloat69;
		Static513.aFloatArray64[1] = super.aFloat84 * super.aFloat71;
		OpenGL.glLightfv(16384, 4609, Static513.aFloatArray64, 0);
		Static513.aFloatArray64[1] = -super.aFloat79 * super.aFloat71;
		Static513.aFloatArray64[2] = -super.aFloat79 * super.aFloat77;
		Static513.aFloatArray64[0] = super.aFloat69 * -super.aFloat79;
		Static513.aFloatArray64[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static513.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ew;BLclient!em;)Z")
	@Override
	public boolean method2007(@OriginalArg(0) Class89 arg0, @OriginalArg(2) Class82 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "(Z)V")
	@Override
	protected void method2110() {
		if (super.aBoolean185) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!ck", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method2080(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!em;ILclient!ew;ZI)Lclient!baa;")
	@Override
	public Interface2 method2083(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean144 || Static474.method7016(arg1) && Static474.method7016(arg3)) {
			return new Class105_Sub3(this, arg0, arg2, arg1, arg3);
		} else if (this.aBoolean145) {
			return new Class105_Sub1(this, arg0, arg2, arg1, arg3);
		} else {
			return new Class105_Sub3(this, arg0, arg2, Static95.method2482(arg1), Static95.method2482(arg3));
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!wga;ZBI)V")
	@Override
	protected void method2049(@OriginalArg(0) Class371 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static334.method8571(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "()Z")
	@Override
	public boolean method6185() {
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "(I)V")
	@Override
	protected void method2037() {
		@Pc(15) int local15 = this.anIntArray73[super.anInt2164];
		if (local15 != 0) {
			this.anIntArray73[super.anInt2164] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
	public synchronized void method1731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg1);
		local8.aLong277 = arg0;
		this.aClass276_7.method6906(local8);
	}

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "(I)V")
	@Override
	protected void method2099() {
		Static513.aFloatArray64[2] = (float) (super.anInt2167 & 0xFF) / 255.0F;
		Static513.aFloatArray64[3] = (float) (super.anInt2167 >>> 24) / 255.0F;
		Static513.aFloatArray64[1] = (float) (super.anInt2167 & 0xFF00) / 65280.0F;
		Static513.aFloatArray64[0] = (float) (super.anInt2167 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static513.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!u;BI)V")
	@Override
	public void method2046(@OriginalArg(0) Interface26 arg0, @OriginalArg(2) int arg1) {
		this.aClass75_Sub2Array1[arg1] = (Class75_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "(I)V")
	@Override
	protected void method2047() {
		Static513.aFloatArray64[2] = super.aFloat85 * super.aFloat77;
		Static513.aFloatArray64[0] = super.aFloat69 * super.aFloat85;
		Static513.aFloatArray64[3] = 1.0F;
		Static513.aFloatArray64[1] = super.aFloat85 * super.aFloat71;
		OpenGL.glLightModelfv(2899, Static513.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!tj;Lclient!tj;FLclient!tj;)Lclient!tj;")
	@Override
	public Class4 method6222(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class4 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "(B)V")
	@Override
	protected void method2066() {
		this.aBoolean140 = false;
		this.method1734();
	}

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "()V")
	@Override
	public void method6181() {
		if (super.anInt2113 <= 0 && super.anInt2117 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt2182;
		@Pc(16) int local16 = super.anInt2168;
		@Pc(19) int local19 = super.anInt2169;
		@Pc(22) int local22 = super.anInt2172;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2069();
		this.method2021(false);
		this.method2044(false);
		this.method2002(false);
		this.method2080(false);
		this.method1987(null);
		this.method2012(false, -2, false);
		this.method2105(1);
		this.method2032(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt2113, super.anInt2117, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method6194(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBLclient!em;[BI)Lclient!ob;")
	@Override
	public Interface17 method2009(@OriginalArg(3) Class82 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class105_Sub2(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "(B)V")
	@Override
	protected void method2072() {
		if (super.aBoolean183) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)Lclient!ru;")
	@Override
	public Interface23 method1998(@OriginalArg(0) boolean arg0) {
		return new Class75_Sub1(this, Static137.aClass89_9, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ[BILclient!em;III)Lclient!baa;")
	@Override
	protected Interface2 method2063(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4) {
		if (this.aBoolean144 || Static474.method7016(arg3) && Static474.method7016(arg0)) {
			return new Class105_Sub3(this, arg4, arg3, arg0, arg1, arg2, 0, 0);
		} else if (this.aBoolean145) {
			return new Class105_Sub1(this, arg4, arg3, arg0, arg2, 0, 0);
		} else {
			@Pc(49) Class105_Sub3 local49 = new Class105_Sub3(this, arg4, Static137.aClass89_8, Static95.method2482(arg3), Static95.method2482(arg0));
			local49.method6499(arg2, arg3, arg0, arg4, 0);
			return local49;
		}
	}

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "(B)V")
	@Override
	protected void method2074() {
		super.aFloat73 = -super.anInt2197 + super.anInt2183;
		super.aFloat81 = super.aFloat73 - (float) super.anInt2170;
		if (super.aFloat81 < (float) super.anInt2161) {
			super.aFloat81 = super.anInt2161;
		}
		OpenGL.glFogf(2915, super.aFloat81);
		OpenGL.glFogf(2916, super.aFloat73);
		Static513.aFloatArray64[0] = (float) (super.anInt2166 & 0xFF0000) / 1.671168E7F;
		Static513.aFloatArray64[1] = (float) (super.anInt2166 & 0xFF00) / 65280.0F;
		Static513.aFloatArray64[2] = (float) (super.anInt2166 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static513.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!sea;BIILclient!ru;I)V")
	@Override
	public void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface23 arg4, @OriginalArg(6) int arg5) {
		@Pc(13) byte local13;
		@Pc(17) int local17;
		if (arg1 == Static39.aClass304_1) {
			local13 = 1;
			local17 = arg3 * 2;
		} else if (Static499.aClass304_6 == arg1) {
			local13 = 3;
			local17 = arg3 + 1;
		} else if (arg1 == Static338.aClass304_5) {
			local17 = arg3 * 3;
			local13 = 4;
		} else if (Static88.aClass304_2 == arg1) {
			local17 = arg3 + 2;
			local13 = 6;
		} else if (arg1 == Static90.aClass304_3) {
			local13 = 5;
			local17 = arg3 + 2;
		} else {
			local17 = arg3;
			local13 = 0;
		}
		@Pc(76) Class89 local76 = arg4.method4805();
		@Pc(79) Class75_Sub1 local79 = (Class75_Sub1) arg4;
		local79.method7629();
		OpenGL.glDrawElements(local13, local17, Static50.method1154(local76), local79.method7626() + (long) (local76.anInt3518 * arg2));
	}

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt1757;
	}

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "()V")
	@Override
	protected void method6224() {
		super.method6224();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
	@Override
	protected void method2006() {
		if (super.aBoolean175 && super.bf && super.anInt2170 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method2060(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)V")
	public synchronized void method1732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub8 local16 = new Class3_Sub8(arg0);
		local16.aLong277 = arg1;
		this.aClass276_6.method6906(local16);
	}

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "(I)V")
	@Override
	protected void method2055() {
		OpenGL.glViewport(super.anInt2194, super.anInt2192, super.anInt2113, super.anInt2117);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
	public synchronized void method1733(@OriginalArg(1) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong277 = arg0;
		this.aClass276_10.method6906(local7);
	}

	@OriginalMember(owner = "client!ck", name = "Y", descriptor = "(I)V")
	private void method1734() {
		if (this.aBoolean136) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass171_4.method4947()) {
			if (!this.aBoolean140) {
				OpenGL.glLoadMatrixf(super.aClass47_Sub3_18.method7902(Static414.aFloatArray61), 0);
				this.aBoolean140 = true;
				this.method2089();
				this.method2015();
			}
			if (super.aBoolean165) {
				this.aBoolean136 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass47_Sub3_15.method7902(Static414.aFloatArray61), 0);
				this.aBoolean136 = true;
			}
		} else if (super.aBoolean165) {
			OpenGL.glLoadIdentity();
			this.aBoolean136 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass47_Sub3_15.method7902(Static414.aFloatArray61), 0);
			this.aBoolean136 = false;
		}
	}

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "(B)V")
	@Override
	protected void method2073() {
		OpenGL.glDepthMask(super.aBoolean184 && super.aBoolean170);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IZ)Lclient!u;")
	@Override
	public Interface26 method2008(@OriginalArg(1) boolean arg0) {
		return new Class75_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "(I)V")
	@Override
	protected void method2028() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray28, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "(B)V")
	@Override
	protected void method2027() {
		OpenGL.glMatrixMode(5890);
		if (Static259.aClass180_5 == super.aClass180Array3[super.anInt2164]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass47_Sub3Array3[super.anInt2164].method7902(Static414.aFloatArray61), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method2113(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "(B)V")
	@Override
	protected void method2067() {
		OpenGL.glTexEnvi(8960, 34162, Static85.method2232(super.aClass363Array5[super.anInt2164]));
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!aca;B)V")
	@Override
	public void method2087(@OriginalArg(0) Class6 arg0) {
		if (arg0 == Static513.aClass6_11) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(16) int local16 = Static452.method6823(arg0);
		OpenGL.glTexGeni(8192, 9472, local16);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local16);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local16);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ[[IZ)Lclient!sq;")
	@Override
	public Interface24 method2035(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class105_Sub4(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ck", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method6201(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub8 local19;
		while (!this.aClass276_6.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_6.method6911();
			Static449.anIntArray509[local11++] = (int) local19.aLong277;
			super.anInt2154 -= local19.anInt706;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static449.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static449.anIntArray509, 0);
			local11 = 0;
		}
		while (!this.aClass276_7.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_7.method6911();
			Static449.anIntArray509[local11++] = (int) local19.aLong277;
			super.anInt2156 -= local19.anInt706;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static449.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static449.anIntArray509, 0);
			local11 = 0;
		}
		while (!this.aClass276_8.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_8.method6911();
			Static449.anIntArray509[local11++] = local19.anInt706;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static449.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static449.anIntArray509, 0);
			local11 = 0;
		}
		while (!this.aClass276_9.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_9.method6911();
			Static449.anIntArray509[local11++] = (int) local19.aLong277;
			super.anInt2157 -= local19.anInt706;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static449.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static449.anIntArray509, 0);
		}
		while (!this.aClass276_5.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_5.method6911();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt706);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass276_10.method6908()) {
			local215 = this.aClass276_10.method6911();
			OpenGL.glDeleteProgramARB((int) local215.aLong277);
		}
		while (!this.aClass276_11.method6908()) {
			local215 = this.aClass276_11.method6911();
			OpenGL.glDeleteObjectARB(local215.aLong277);
		}
		while (!this.aClass276_5.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_5.method6911();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt706);
		}
		if (this.E() > 100663296 && this.aLong42 + 60000L < Static444.method6719()) {
			System.gc();
			this.aLong42 = Static444.method6719();
		}
		super.method6201(local9);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!pea;Lclient!st;)Lclient!mk;")
	@Override
	public Interface16 method6211(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6229(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6217(arg2, arg3);
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(II)Lclient!aia;")
	@Override
	protected Class16 method2095(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class16_Sub5(this, super.aClass181_14);
		} else if (arg0 == 4) {
			return new Class16_Sub6(this, super.aClass181_14, super.aClass73_3);
		} else if (arg0 == 8) {
			return new Class16_Sub4(this, super.aClass181_14, super.aClass73_3);
		} else {
			return super.method2095(arg0);
		}
	}

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "(I)V")
	@Override
	protected void method2001() {
		if (super.aBoolean180) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)V")
	@Override
	public void method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "(I)V")
	@Override
	protected void method2018() {
		if (super.aBoolean178) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z[Lclient!it;)Lclient!mia;")
	@Override
	public Class34 method2090(@OriginalArg(1) Class151[] arg0) {
		return new Class34_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "(I)V")
	@Override
	protected void method2109() {
		this.method1734();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method2003(@OriginalArg(1) Class34 arg0) {
		@Pc(9) Class151[] local9 = ((Class34_Sub1) arg0).aClass151Array1;
		@Pc(17) int local17 = 0;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class151 local31 = local9[local25];
			@Pc(36) Class75_Sub2 local36 = this.aClass75_Sub2Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method7637();
			@Pc(48) long local48 = local36.method7626();
			local36.method7629();
			for (@Pc(53) int local53 = 0; local31.method4660() > local53; local53++) {
				@Pc(60) Class333 local60 = local31.method4666(local53);
				if (Static570.aClass333_1 == local60) {
					OpenGL.glVertexPointer(3, 5126, local42, local48 + (long) local38);
					local23 = true;
				} else if (local60 == Static570.aClass333_2) {
					OpenGL.glNormalPointer(5126, local42, (long) local38 + local48);
					local21 = true;
				} else if (Static570.aClass333_3 == local60) {
					local19 = true;
					OpenGL.glColorPointer(4, 5121, local42, (long) local38 + local48);
				} else if (local60 == Static570.aClass333_4) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, (long) local38 + local48);
				} else if (Static570.aClass333_5 == local60) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local48 + (long) local38);
				} else if (Static570.aClass333_6 == local60) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, local48 + (long) local38);
				} else if (Static570.aClass333_7 == local60) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, (long) local38 + local48);
				}
				local38 += local60.anInt9673;
			}
		}
		if (this.aBoolean139 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean139 = local23;
		}
		if (local21 != this.aBoolean138) {
			if (local21) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean138 = local21;
		}
		if (this.aBoolean137 != local19) {
			if (local19) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean137 = local19;
		}
		@Pc(279) int local279;
		if (this.anInt1755 < local17) {
			for (local279 = this.anInt1755; local279 < local17; local279++) {
				OpenGL.glClientActiveTexture(local279 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt1755 = local17;
		} else if (local17 < this.anInt1755) {
			for (local279 = local17; local279 < this.anInt1755; local279++) {
				OpenGL.glClientActiveTexture(local279 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt1755 = local17;
		}
	}

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "(B)V")
	@Override
	protected void method2068() {
		OpenGL.glActiveTexture(super.anInt2164 + 33984);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[IZII)Lclient!baa;")
	@Override
	public Interface2 method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean144 || Static474.method7016(arg1) && Static474.method7016(arg0)) {
			return new Class105_Sub3(this, arg1, arg0, arg3, arg2, 0, arg5);
		} else if (this.aBoolean145) {
			return new Class105_Sub1(this, arg1, arg0, arg2, 0, arg5);
		} else {
			@Pc(46) Class105_Sub3 local46 = new Class105_Sub3(this, Static333.aClass82_9, Static137.aClass89_8, Static95.method2482(arg1), Static95.method2482(arg0));
			local46.method6500(arg1, arg0, 0, arg2, 0, arg5);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "(I)V")
	@Override
	protected void method2015() {
		this.method2014();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt2193; local10++) {
			@Pc(17) Class3_Sub27 local17 = super.aClass3_Sub27Array3[local10];
			@Pc(21) int local21 = local17.method5626();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method5631() / 255.0F;
			Static513.aFloatArray64[0] = local17.method5627();
			Static513.aFloatArray64[1] = local17.method5628();
			Static513.aFloatArray64[2] = local17.method5630();
			Static513.aFloatArray64[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static513.aFloatArray64, 0);
			Static513.aFloatArray64[2] = (float) (local21 & 0xFF) * local31;
			Static513.aFloatArray64[0] = local31 * (float) (local21 >> 16 & 0xFF);
			Static513.aFloatArray64[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static513.aFloatArray64[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, Static513.aFloatArray64, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method5624() * local17.method5624()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt2186) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method2015();
	}
}
