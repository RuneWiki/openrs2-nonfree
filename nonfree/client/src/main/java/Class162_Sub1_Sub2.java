import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class162_Sub1_Sub2 extends Class162_Sub1 {

	@OriginalMember(owner = "client!kd", name = "ii", descriptor = "J")
	private long aLong117;

	@OriginalMember(owner = "client!kd", name = "ji", descriptor = "Z")
	private boolean aBoolean353;

	@OriginalMember(owner = "client!kd", name = "ki", descriptor = "Z")
	private boolean aBoolean354;

	@OriginalMember(owner = "client!kd", name = "li", descriptor = "Z")
	private boolean aBoolean355;

	@OriginalMember(owner = "client!kd", name = "mi", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!kd", name = "ni", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!kd", name = "pi", descriptor = "I")
	private int anInt4708;

	@OriginalMember(owner = "client!kd", name = "Mg", descriptor = "Lclient!dc;")
	private final Class70 aClass70_28 = new Class70();

	@OriginalMember(owner = "client!kd", name = "ai", descriptor = "Lclient!dc;")
	private final Class70 aClass70_29 = new Class70();

	@OriginalMember(owner = "client!kd", name = "bi", descriptor = "Lclient!dc;")
	private final Class70 aClass70_30 = new Class70();

	@OriginalMember(owner = "client!kd", name = "di", descriptor = "Lclient!dc;")
	private final Class70 aClass70_31 = new Class70();

	@OriginalMember(owner = "client!kd", name = "ei", descriptor = "Lclient!dc;")
	private final Class70 aClass70_32 = new Class70();

	@OriginalMember(owner = "client!kd", name = "fi", descriptor = "Lclient!dc;")
	private final Class70 aClass70_33 = new Class70();

	@OriginalMember(owner = "client!kd", name = "gi", descriptor = "Lclient!dc;")
	private final Class70 aClass70_34 = new Class70();

	@OriginalMember(owner = "client!kd", name = "hi", descriptor = "[Lclient!ol;")
	private final Class85_Sub2[] aClass85_Sub2Array1 = new Class85_Sub2[16];

	@OriginalMember(owner = "client!kd", name = "oi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!kd", name = "qi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!kd", name = "ui", descriptor = "I")
	private final int anInt4709 = 0;

	@OriginalMember(owner = "client!kd", name = "Qh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!kd", name = "xi", descriptor = "Ljava/lang/String;")
	private final String aString55;

	@OriginalMember(owner = "client!kd", name = "si", descriptor = "Ljava/lang/String;")
	private final String aString54;

	@OriginalMember(owner = "client!kd", name = "wi", descriptor = "I")
	private final int anInt4710;

	@OriginalMember(owner = "client!kd", name = "yi", descriptor = "Z")
	public boolean aBoolean361;

	@OriginalMember(owner = "client!kd", name = "vi", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!kd", name = "ri", descriptor = "Z")
	private final boolean aBoolean358;

	@OriginalMember(owner = "client!kd", name = "Ci", descriptor = "Z")
	public final boolean aBoolean363;

	@OriginalMember(owner = "client!kd", name = "ti", descriptor = "Z")
	public final boolean aBoolean359;

	@OriginalMember(owner = "client!kd", name = "Ai", descriptor = "Z")
	public final boolean aBoolean362;

	@OriginalMember(owner = "client!kd", name = "zi", descriptor = "[I")
	public final int[] anIntArray318;

	@OriginalMember(owner = "client!kd", name = "Bi", descriptor = "I")
	public final int anInt4711;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!mv;I)V")
	public Class162_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(4) Class229 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString55 = OpenGL.glGetString(7936).toLowerCase();
			this.aString54 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString55.indexOf("microsoft") != -1 || this.aString55.indexOf("brian paul") != -1 || this.aString55.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static439.method5762(local108.replace('.', ' '), ' ');
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(139) int local139;
			try {
				@Pc(133) int local133 = Static559.method7310(local116[0]);
				local139 = Static559.method7310(local116[1]);
				this.anInt4710 = local133 * 10 + local139;
			} catch (@Pc(148) NumberFormatException local148) {
				throw new RuntimeException("");
			}
			if (this.anInt4710 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(185) int[] local185 = new int[1];
				OpenGL.glGetIntegerv(34018, local185, 0);
				super.anInt4587 = local185[0];
				if (super.anInt4587 < 2) {
					throw new RuntimeException("");
				}
				super.anInt4589 = 8;
				this.aBoolean361 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean347 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean360 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean341 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean358 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean349 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean363 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean359 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean362 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray318 = new int[super.anInt4587];
				this.anInt4711 = Stream.b() ? 33639 : 5121;
				if (this.aString54.indexOf("radeon") != -1) {
					local139 = 0;
					@Pc(287) boolean local287 = false;
					@Pc(289) boolean local289 = false;
					@Pc(298) String[] local298 = Static439.method5762(this.aString54.replace('/', ' '), ' ');
					for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
						@Pc(306) String local306 = local298[local300];
						try {
							if (local306.length() > 0) {
								if (local306.charAt(0) == 'x' && local306.length() >= 3 && Static531.method6990(local306.substring(1, 3))) {
									local306 = local306.substring(1);
									local289 = true;
								}
								if (local306.equals("hd")) {
									local287 = true;
								} else {
									if (local306.startsWith("hd")) {
										local287 = true;
										local306 = local306.substring(2);
									}
									if (local306.length() >= 4 && Static531.method6990(local306.substring(0, 4))) {
										local139 = Static559.method7310(local306.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(376) Exception local376) {
						}
					}
					if (!local289 && !local287) {
						if (local139 >= 7000 && local139 <= 9250) {
							super.aBoolean349 = false;
						}
						if (local139 >= 7000 && local139 <= 7999) {
							this.aBoolean361 = false;
						}
					}
					this.aBoolean360 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString55.indexOf("intel");
				if (this.aBoolean361) {
					try {
						@Pc(436) int[] local436 = new int[1];
						OpenGL.glGenBuffersARB(1, local436, 0);
					} catch (@Pc(442) Throwable local442) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(448) Throwable local448) {
			local448.printStackTrace();
			this.method6875();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "(I)V")
	@Override
	protected void method3911() {
		for (@Pc(6) int local6 = super.anInt4587 - 1; local6 >= 0; local6--) {
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
		@Pc(75) float[] local75 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(77) int local77 = 0; local77 < 8; local77++) {
			@Pc(83) int local83 = local77 + 16384;
			OpenGL.glLightfv(local83, 4608, local75, 0);
			OpenGL.glLightf(local83, 4615, 0.0F);
			OpenGL.glLightf(local83, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method3911();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
	public synchronized void method3960(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong268 = arg0;
		this.aClass70_34.method1269(local7);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Lclient!ega;")
	@Override
	public Interface8 method3826(@OriginalArg(1) boolean arg0) {
		return new Class85_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "(I)V")
	@Override
	protected void method3872() {
		OpenGL.glViewport(super.anInt4592, super.anInt4611, super.anInt4500, super.anInt4487);
	}

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "(I)V")
	@Override
	protected void method3908() {
		OpenGL.glDepthMask(super.aBoolean348 && super.aBoolean350);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method3913(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "(I)V")
	@Override
	protected void method3929() {
		this.method3952();
		@Pc(18) int local18;
		for (local18 = 0; local18 < super.anInt4607; local18++) {
			@Pc(25) Class2_Sub11 local25 = super.aClass2_Sub11Array4[local18];
			@Pc(29) int local29 = local25.method7274();
			@Pc(33) int local33 = local18 + 16386;
			@Pc(39) float local39 = local25.method7280() / 255.0F;
			Static263.aFloatArray34[0] = local25.method7276();
			Static263.aFloatArray34[1] = local25.method7270();
			Static263.aFloatArray34[2] = local25.method7271();
			Static263.aFloatArray34[3] = 1.0F;
			OpenGL.glLightfv(local33, 4611, Static263.aFloatArray34, 0);
			Static263.aFloatArray34[0] = local39 * (float) (local29 >> 16 & 0xFF);
			Static263.aFloatArray34[3] = 1.0F;
			Static263.aFloatArray34[2] = local39 * (float) (local29 & 0xFF);
			Static263.aFloatArray34[1] = local39 * (float) (local29 >> 8 & 0xFF);
			OpenGL.glLightfv(local33, 4609, Static263.aFloatArray34, 0);
			OpenGL.glLightf(local33, 4617, 1.0F / (float) (local25.method7277() * local25.method7277()));
			OpenGL.glEnable(local33);
		}
		while (super.anInt4595 > local18) {
			OpenGL.glDisable(local18 + 16386);
			local18++;
		}
		super.method3929();
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(Z)V")
	@Override
	protected void method3925() {
		Static263.aFloatArray34[0] = super.aFloat143 * super.aFloat140;
		Static263.aFloatArray34[3] = 1.0F;
		Static263.aFloatArray34[2] = super.aFloat138 * super.aFloat140;
		Static263.aFloatArray34[1] = super.aFloat140 * super.aFloat139;
		OpenGL.glLightfv(16384, 4609, Static263.aFloatArray34, 0);
		Static263.aFloatArray34[1] = super.aFloat139 * -super.aFloat142;
		Static263.aFloatArray34[3] = 1.0F;
		Static263.aFloatArray34[0] = super.aFloat143 * -super.aFloat142;
		Static263.aFloatArray34[2] = -super.aFloat142 * super.aFloat138;
		OpenGL.glLightfv(16385, 4609, Static263.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V")
	@Override
	protected void method3846() {
		this.method3961();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6855(@OriginalArg(0) Class38 arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(IZ)V")
	@Override
	public void method3894(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lclient!dm;I)Lclient!cl;")
	@Override
	public Class59 method3935(@OriginalArg(0) Class76[] arg0) {
		return new Class59_Sub1(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)F")
	@Override
	protected float method3853() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
	@Override
	protected void method3833() {
		OpenGL.glTexEnvi(8960, 34161, Static457.method5939(super.aClass247Array6[super.anInt4617]));
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)Lclient!ip;")
	@Override
	public Interface13 method3889(@OriginalArg(0) boolean arg0) {
		return new Class85_Sub1(this, Static42.aClass35_5, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!id;ILclient!ip;I)V")
	@Override
	public void method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface13 arg4, @OriginalArg(6) int arg5) {
		@Pc(19) byte local19;
		@Pc(23) int local23;
		if (arg2 == Static151.aClass155_3) {
			local19 = 1;
			local23 = arg3 * 2;
		} else if (Static172.aClass155_4 == arg2) {
			local19 = 3;
			local23 = arg3 + 1;
		} else if (arg2 == Static523.aClass155_6) {
			local19 = 4;
			local23 = arg3 * 3;
		} else if (arg2 == Static248.aClass155_5) {
			local23 = arg3 + 2;
			local19 = 6;
		} else if (Static21.aClass155_1 == arg2) {
			local19 = 5;
			local23 = arg3 + 2;
		} else {
			local19 = 0;
			local23 = arg3;
		}
		@Pc(74) Class35 local74 = arg4.method7031();
		@Pc(77) Class85_Sub1 local77 = (Class85_Sub1) arg4;
		local77.method5360();
		OpenGL.glDrawElements(local19, local23, Static582.method7549(local74), local77.method5359() + (long) (arg0 * local74.anInt776));
	}

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "(I)V")
	@Override
	protected void method3953() {
		@Pc(9) int local9 = this.anIntArray318[super.anInt4617];
		if (local9 != 0) {
			this.anIntArray318[super.anInt4617] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(B)V")
	@Override
	protected void method3883() {
		this.aBoolean356 = false;
		this.method3961();
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "()Z")
	@Override
	public boolean method6838() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V")
	@Override
	protected void method3844() {
		if (super.aBoolean351) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([FIIILclient!wu;ZII)Lclient!fj;")
	@Override
	protected Interface11 method3931(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class366 arg3, @OriginalArg(5) boolean arg4) {
		if (this.aBoolean358 || Static259.method3656(arg2) && Static259.method3656(arg1)) {
			return new Class188_Sub2(this, arg3, arg2, arg1, arg4, arg0, 0, 0);
		} else if (this.aBoolean360) {
			return new Class188_Sub3(this, arg3, arg2, arg1, arg0, 0, 0);
		} else {
			@Pc(37) Class188_Sub2 local37 = new Class188_Sub2(this, arg3, Static42.aClass35_8, Static355.method5078(arg2), Static355.method5078(arg1));
			local37.method5070(arg2, arg1, arg0, arg3);
			return local37;
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)Lclient!wc;")
	@Override
	protected Class34 method3934(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class34_Sub6(this, super.aClass229_65);
		} else if (arg0 == 4) {
			return new Class34_Sub9(this, super.aClass229_65, super.aClass120_6);
		} else if (arg0 == 8) {
			return new Class34_Sub7(this, super.aClass229_65, super.aClass120_6);
		} else {
			return super.method3934(arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt4487 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt4711, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!wu;BLclient!bk;I)Lclient!fj;")
	@Override
	public Interface11 method3849(@OriginalArg(0) int arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean358 || Static259.method3656(arg3) && Static259.method3656(arg0)) {
			return new Class188_Sub2(this, arg1, arg2, arg3, arg0);
		} else if (this.aBoolean360) {
			return new Class188_Sub3(this, arg1, arg2, arg3, arg0);
		} else {
			return new Class188_Sub2(this, arg1, arg2, Static355.method5078(arg3), Static355.method5078(arg0));
		}
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(B)V")
	@Override
	protected void method3900() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray38, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIILclient!pca;)V")
	@Override
	protected void method3843(@OriginalArg(2) int arg0, @OriginalArg(3) Class263 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static437.method5737(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	@Override
	public void method6887(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)V")
	@Override
	protected void method3835() {
		if (super.aBoolean333 && !super.aBoolean339) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIIZII)Lclient!fj;")
	@Override
	public Interface11 method3875(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean358 || Static259.method3656(arg2) && Static259.method3656(arg5)) {
			return new Class188_Sub2(this, arg2, arg5, arg4, arg0, 0, arg3);
		} else if (this.aBoolean360) {
			return new Class188_Sub3(this, arg2, arg5, arg0, 0, arg3);
		} else {
			@Pc(48) Class188_Sub2 local48 = new Class188_Sub2(this, Static225.aClass366_3, Static42.aClass35_4, Static355.method5078(arg2), Static355.method5078(arg5));
			local48.method7637(arg3, 0, arg0, arg5, 0, arg2);
			return local48;
		}
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "()V")
	@Override
	public void method6857() {
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(Z)V")
	private void method3961() {
		if (this.aBoolean353) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass250_9.method5245()) {
			if (!this.aBoolean356) {
				OpenGL.glLoadMatrixf(super.aClass25_Sub2_18.method2704(Static89.aFloatArray5), 0);
				this.aBoolean356 = true;
				this.method3933();
				this.method3929();
			}
			if (super.aBoolean330) {
				this.aBoolean353 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass25_Sub2_15.method2704(Static89.aFloatArray5), 0);
				this.aBoolean353 = true;
			}
		} else if (super.aBoolean330) {
			OpenGL.glLoadIdentity();
			this.aBoolean353 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass25_Sub2_15.method2704(Static89.aFloatArray5), 0);
			this.aBoolean353 = false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V")
	@Override
	public void method3942(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method3851(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(I)V")
	@Override
	protected void method3873() {
	}

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "(B)V")
	@Override
	public void method3933() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray39, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray42, 0);
	}

	@OriginalMember(owner = "client!kd", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public synchronized void method3962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub44 local12 = new Class2_Sub44(arg1);
		local12.aLong268 = arg0;
		this.aClass70_30.method1269(local12);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLclient!pca;II)V")
	@Override
	public void method3828(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static437.method5737(arg2));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!kd", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt4709;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method6829(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub44 local19;
		while (!this.aClass70_29.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_29.method1262();
			Static238.anIntArray294[local7++] = (int) local19.aLong268;
			super.anInt4577 -= local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static238.anIntArray294, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static238.anIntArray294, 0);
			local7 = 0;
		}
		while (!this.aClass70_30.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_30.method1262();
			Static238.anIntArray294[local7++] = (int) local19.aLong268;
			super.anInt4570 -= local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static238.anIntArray294, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static238.anIntArray294, 0);
			local7 = 0;
		}
		while (!this.aClass70_31.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_31.method1262();
			Static238.anIntArray294[local7++] = local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static238.anIntArray294, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static238.anIntArray294, 0);
			local7 = 0;
		}
		while (!this.aClass70_32.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_32.method1262();
			Static238.anIntArray294[local7++] = (int) local19.aLong268;
			super.anInt4564 -= local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static238.anIntArray294, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static238.anIntArray294, 0);
		}
		while (!this.aClass70_28.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_28.method1262();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt7748);
		}
		@Pc(213) Class2 local213;
		while (!this.aClass70_33.method1263()) {
			local213 = this.aClass70_33.method1262();
			OpenGL.glDeleteProgramARB((int) local213.aLong268);
		}
		while (!this.aClass70_34.method1263()) {
			local213 = this.aClass70_34.method1262();
			OpenGL.glDeleteObjectARB(local213.aLong268);
		}
		while (!this.aClass70_28.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_28.method1262();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt7748);
		}
		if (this.b() > 100663296 && Static362.method5133() > this.aLong117 + 60000L) {
			System.gc();
			this.aLong117 = Static362.method5133();
		}
		super.method6829(local11);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ega;II)V")
	@Override
	public void method3954(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		this.aClass85_Sub2Array1[arg1] = (Class85_Sub2) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "()V")
	@Override
	public void method6861() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "()Lclient!pg;")
	@Override
	public Class267 method6863() {
		@Pc(7) int local7 = -1;
		if (this.aString55.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString55.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString55.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class267(local7, "OpenGL", this.anInt4710, this.aString54, 0L);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!bk;ILclient!wu;)Z")
	@Override
	public boolean method3886(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class366 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!rf;B)V")
	@Override
	public void method3845(@OriginalArg(0) Class297 arg0) {
		if (Static592.aClass297_4 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(18) int local18 = Static124.method7563(arg0);
		OpenGL.glTexGeni(8192, 9472, local18);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local18);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local18);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(Z)V")
	@Override
	protected void method3918() {
		super.aFloat131 = -super.anInt4608 + super.anInt4603;
		super.aFloat145 = super.aFloat131 - (float) super.anInt4604;
		if ((float) super.anInt4605 > super.aFloat145) {
			super.aFloat145 = super.anInt4605;
		}
		OpenGL.glFogf(2915, super.aFloat145);
		OpenGL.glFogf(2916, super.aFloat131);
		Static263.aFloatArray34[1] = (float) (super.anInt4625 & 0xFF00) / 65280.0F;
		Static263.aFloatArray34[2] = (float) (super.anInt4625 & 0xFF) / 255.0F;
		Static263.aFloatArray34[0] = (float) (super.anInt4625 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static263.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
	@Override
	protected void method3837() {
		Static263.aFloatArray34[0] = super.aFloat143 * super.aFloat144;
		Static263.aFloatArray34[3] = 1.0F;
		Static263.aFloatArray34[1] = super.aFloat139 * super.aFloat144;
		Static263.aFloatArray34[2] = super.aFloat138 * super.aFloat144;
		OpenGL.glLightModelfv(2899, Static263.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ[[II)Lclient!ap;")
	@Override
	public Interface3 method3890(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class188_Sub1(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "(I)V")
	@Override
	protected void method3937() {
		OpenGL.glMatrixMode(5890);
		if (Static221.aClass348_5 == super.aClass348Array3[super.anInt4617]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass25_Sub2Array3[super.anInt4617].method2704(Static89.aFloatArray5), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method3893(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local12);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!wu;I[BI)Lclient!jf;")
	@Override
	public Interface15 method3874(@OriginalArg(2) Class366 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class188_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "()V")
	@Override
	public void method6840() {
	}

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "(I)V")
	@Override
	protected void method3930() {
		if (super.aBoolean335) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V")
	@Override
	protected void method3831() {
		if (super.aBoolean332) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "()V")
	@Override
	public void method6842() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "()Z")
	@Override
	public boolean method6880() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!id;IBI)V")
	@Override
	public void method3854(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte local18;
		@Pc(16) int local16;
		if (Static151.aClass155_3 == arg0) {
			local16 = arg1 * 2;
			local18 = 1;
		} else if (arg0 == Static172.aClass155_4) {
			local16 = arg1 + 1;
			local18 = 3;
		} else if (Static523.aClass155_6 == arg0) {
			local18 = 4;
			local16 = arg1 * 3;
		} else if (arg0 == Static248.aClass155_5) {
			local16 = arg1 + 2;
			local18 = 6;
		} else if (Static21.aClass155_1 == arg0) {
			local16 = arg1 + 2;
			local18 = 5;
		} else {
			local16 = arg1;
			local18 = 0;
		}
		OpenGL.glDrawArrays(local18, arg2, local16);
	}

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "(I)V")
	@Override
	protected void method3901() {
		if (super.aBoolean342) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!wu;Lclient!bk;I)Z")
	@Override
	public boolean method3847(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class35 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6869(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6842();
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(II)V")
	public synchronized void method3964(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong268 = arg0;
		this.aClass70_33.method1269(local7);
	}

	@OriginalMember(owner = "client!kd", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method3940(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "()V")
	@Override
	protected void method6875() {
		super.method6875();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BLclient!wu;ZIIIII)Lclient!fj;")
	@Override
	protected Interface11 method3947(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (this.aBoolean358 || Static259.method3656(arg4) && Static259.method3656(arg3)) {
			return new Class188_Sub2(this, arg1, arg4, arg3, arg2, arg0, 0, 0);
		} else if (this.aBoolean360) {
			return new Class188_Sub3(this, arg1, arg4, arg3, arg0, 0, 0);
		} else {
			@Pc(50) Class188_Sub2 local50 = new Class188_Sub2(this, arg1, Static42.aClass35_4, Static355.method5078(arg4), Static355.method5078(arg3));
			local50.method7641(arg3, arg4, 0, arg0, arg1);
			return local50;
		}
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(B)V")
	@Override
	protected void method3924() {
		Static263.aFloatArray34[3] = (float) (super.anInt4602 >>> 24) / 255.0F;
		Static263.aFloatArray34[2] = (float) (super.anInt4602 & 0xFF) / 255.0F;
		Static263.aFloatArray34[1] = (float) (super.anInt4602 & 0xFF00) / 65280.0F;
		Static263.aFloatArray34[0] = (float) (super.anInt4602 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static263.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "()V")
	@Override
	public void method6832() {
		if (super.anInt4500 <= 0 && super.anInt4487 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt4616;
		@Pc(19) int local19 = super.anInt4614;
		@Pc(22) int local22 = super.anInt4624;
		@Pc(25) int local25 = super.anInt4593;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3858();
		this.method3958(false);
		this.method3836(false);
		this.method3829(false);
		this.method3940(false);
		this.method3865(null);
		this.method3943(false, -2, false);
		this.method3906(1);
		this.method3957(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt4500, super.anInt4487, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!cl;B)V")
	@Override
	public void method3882(@OriginalArg(0) Class59 arg0) {
		@Pc(9) Class76[] local9 = ((Class59_Sub1) arg0).aClass76Array1;
		@Pc(11) int local11 = 0;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local9.length; local27++) {
			@Pc(33) Class76 local33 = local9[local27];
			@Pc(38) Class85_Sub2 local38 = this.aClass85_Sub2Array1[local27];
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = local38.method5372();
			@Pc(48) long local48 = local38.method5359();
			local38.method5360();
			for (@Pc(53) int local53 = 0; local53 < local33.method1468(); local53++) {
				@Pc(60) Class341 local60 = local33.method1469(local53);
				if (Static545.aClass341_1 == local60) {
					local25 = true;
					OpenGL.glVertexPointer(3, 5126, local44, (long) local40 + local48);
				} else if (Static545.aClass341_2 == local60) {
					local23 = true;
					OpenGL.glNormalPointer(5126, local44, local48 + (long) local40);
				} else if (Static545.aClass341_3 == local60) {
					OpenGL.glColorPointer(4, 5121, local44, local48 + (long) local40);
					local21 = true;
				} else if (local60 == Static545.aClass341_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, (long) local40 + local48);
				} else if (local60 == Static545.aClass341_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static545.aClass341_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, (long) local40 + local48);
				} else if (Static545.aClass341_7 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, (long) local40 + local48);
				}
				local40 += local60.anInt8927;
			}
		}
		if (local25 != this.aBoolean354) {
			if (local25) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean354 = local25;
		}
		if (local23 != this.aBoolean357) {
			if (local23) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean357 = local23;
		}
		if (local21 != this.aBoolean355) {
			if (local21) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean355 = local21;
		}
		@Pc(263) int local263;
		if (this.anInt4708 < local11) {
			for (local263 = this.anInt4708; local263 < local11; local263++) {
				OpenGL.glClientActiveTexture(local263 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt4708 = local11;
		} else if (this.anInt4708 > local11) {
			for (local263 = local11; local263 < this.anInt4708; local263++) {
				OpenGL.glClientActiveTexture(local263 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt4708 = local11;
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	@Override
	protected void method3834() {
		OpenGL.glActiveTexture(super.anInt4617 + 33984);
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "()V")
	@Override
	public void method6847() {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method3917(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(15) Long local15 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local15);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
	public synchronized void method3966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub44 local8 = new Class2_Sub44(arg0);
		local8.aLong268 = arg1;
		this.aClass70_29.method1269(local8);
	}

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "(B)V")
	@Override
	protected void method3944() {
		if (super.aBoolean343 && super.aBoolean336 && super.anInt4604 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "(I)V")
	@Override
	protected void method3895() {
		OpenGL.glTexEnvi(8960, 34162, Static457.method5939(super.aClass247Array5[super.anInt4617]));
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)V")
	@Override
	protected void method3856() {
		if (super.aClass354_6 == Static51.aClass354_2) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass354_6 == Static155.aClass354_3) {
			OpenGL.glBlendFunc(1, 1);
			return;
		} else if (Static388.aClass354_7 == super.aClass354_6) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)V")
	@Override
	protected void method3862() {
		if (super.aBoolean334) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "(I)V")
	@Override
	protected void method3932() {
		OpenGL.glScissor(super.anInt4616 + super.anInt4592, -super.anInt4593 + super.anInt4487 + super.anInt4611, -super.anInt4616 + super.anInt4614, -super.anInt4624 + super.anInt4593);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!rs;Lclient!rs;FLclient!rs;)Lclient!rs;")
	@Override
	public Class17 method6882(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}
}
