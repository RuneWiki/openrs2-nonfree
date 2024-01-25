import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class33_Sub2_Sub1 extends Class33_Sub2 {

	@OriginalMember(owner = "client!nv", name = "Di", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!nv", name = "Fi", descriptor = "Z")
	private boolean aBoolean498;

	@OriginalMember(owner = "client!nv", name = "Hi", descriptor = "I")
	private int anInt6607;

	@OriginalMember(owner = "client!nv", name = "Ii", descriptor = "Z")
	private boolean aBoolean499;

	@OriginalMember(owner = "client!nv", name = "Ji", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!nv", name = "Ki", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!nv", name = "Li", descriptor = "Z")
	private boolean aBoolean501;

	@OriginalMember(owner = "client!nv", name = "Mh", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_38 = new Class163();

	@OriginalMember(owner = "client!nv", name = "gi", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_39 = new Class163();

	@OriginalMember(owner = "client!nv", name = "ui", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_40 = new Class163();

	@OriginalMember(owner = "client!nv", name = "zi", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_41 = new Class163();

	@OriginalMember(owner = "client!nv", name = "Ai", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_42 = new Class163();

	@OriginalMember(owner = "client!nv", name = "Bi", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_43 = new Class163();

	@OriginalMember(owner = "client!nv", name = "Ci", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_44 = new Class163();

	@OriginalMember(owner = "client!nv", name = "Gi", descriptor = "[Lclient!lq;")
	private final Class24_Sub1[] aClass24_Sub1Array1 = new Class24_Sub1[16];

	@OriginalMember(owner = "client!nv", name = "Ei", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!nv", name = "Mi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!nv", name = "Ni", descriptor = "I")
	private final int anInt6608 = 0;

	@OriginalMember(owner = "client!nv", name = "Jh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!nv", name = "Vi", descriptor = "Ljava/lang/String;")
	private final String aString75;

	@OriginalMember(owner = "client!nv", name = "Yi", descriptor = "Ljava/lang/String;")
	private final String aString76;

	@OriginalMember(owner = "client!nv", name = "Ti", descriptor = "I")
	private final int anInt6610;

	@OriginalMember(owner = "client!nv", name = "Ri", descriptor = "Z")
	public boolean aBoolean504;

	@OriginalMember(owner = "client!nv", name = "Oi", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!nv", name = "Xi", descriptor = "Z")
	private final boolean aBoolean507;

	@OriginalMember(owner = "client!nv", name = "Wi", descriptor = "Z")
	public final boolean aBoolean506;

	@OriginalMember(owner = "client!nv", name = "Ui", descriptor = "Z")
	public final boolean aBoolean505;

	@OriginalMember(owner = "client!nv", name = "Qi", descriptor = "Z")
	public final boolean aBoolean503;

	@OriginalMember(owner = "client!nv", name = "Pi", descriptor = "[I")
	public final int[] anIntArray453;

	@OriginalMember(owner = "client!nv", name = "Si", descriptor = "I")
	public final int anInt6609;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!bt;I)V")
	public Class33_Sub2_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(4) Class34 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString75 = OpenGL.glGetString(7936).toLowerCase();
			this.aString76 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString75.indexOf("microsoft") != -1 || this.aString75.indexOf("brian paul") != -1 || this.aString75.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static189.method2958(' ', local108.replace('.', ' '));
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(132) int local132;
			try {
				@Pc(126) int local126 = Static613.method8035(local116[0]);
				local132 = Static613.method8035(local116[1]);
				this.anInt6610 = local126 * 10 + local132;
			} catch (@Pc(141) NumberFormatException local141) {
				throw new RuntimeException("");
			}
			if (this.anInt6610 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(185) int[] local185 = new int[1];
				OpenGL.glGetIntegerv(34018, local185, 0);
				super.anInt9664 = local185[0];
				if (super.anInt9664 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9660 = 8;
				this.aBoolean504 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean744 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean502 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean738 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean507 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean750 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean506 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean505 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean503 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray453 = new int[super.anInt9664];
				this.anInt6609 = Stream.b() ? 33639 : 5121;
				if (this.aString76.indexOf("radeon") != -1) {
					local132 = 0;
					@Pc(288) boolean local288 = false;
					@Pc(290) boolean local290 = false;
					@Pc(299) String[] local299 = Static189.method2958(' ', this.aString76.replace('/', ' '));
					for (@Pc(301) int local301 = 0; local301 < local299.length; local301++) {
						@Pc(307) String local307 = local299[local301];
						try {
							if (local307.length() > 0) {
								if (local307.charAt(0) == 'x' && local307.length() >= 3 && Static509.method6933(local307.substring(1, 3))) {
									local290 = true;
									local307 = local307.substring(1);
								}
								if (local307.equals("hd")) {
									local288 = true;
								} else {
									if (local307.startsWith("hd")) {
										local288 = true;
										local307 = local307.substring(2);
									}
									if (local307.length() >= 4 && Static509.method6933(local307.substring(0, 4))) {
										local132 = Static613.method8035(local307.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(377) Exception local377) {
						}
					}
					if (!local290 && !local288) {
						if (local132 >= 7000 && local132 <= 7999) {
							this.aBoolean504 = false;
						}
						if (local132 >= 7000 && local132 <= 9250) {
							super.aBoolean750 = false;
						}
					}
					this.aBoolean502 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString75.indexOf("intel");
				if (this.aBoolean504) {
					try {
						@Pc(433) int[] local433 = new int[1];
						OpenGL.glGenBuffersARB(1, local433, 0);
					} catch (@Pc(439) Throwable local439) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(445) Throwable local445) {
			local445.printStackTrace();
			this.method8070();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IJ)V")
	public synchronized void method5744(@OriginalArg(1) long arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong307 = arg0;
		this.aClass163_44.method3646(local7);
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "(I)V")
	@Override
	protected void method8171() {
		OpenGL.glTexEnvi(8960, 34161, Static291.method4148(super.aClass91Array6[super.anInt9658]));
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method8259(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "(I)V")
	@Override
	protected void method8202() {
		@Pc(16) int local16 = this.anIntArray453[super.anInt9658];
		if (local16 != 0) {
			this.anIntArray453[super.anInt9658] = 0;
			OpenGL.glBindTexture(local16, 0);
			OpenGL.glDisable(local16);
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8252(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZI[FBLclient!pe;I)Lclient!ada;")
	@Override
	protected Interface1 method8231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float[] arg3, @OriginalArg(6) Class276 arg4) {
		if (this.aBoolean507 || Static211.method8993(arg0) && Static211.method8993(arg1)) {
			return new Class7_Sub4(this, arg4, arg0, arg1, arg2, arg3, 0, 0);
		} else if (this.aBoolean502) {
			return new Class7_Sub2(this, arg4, arg0, arg1, arg3, 0, 0);
		} else {
			@Pc(35) Class7_Sub4 local35 = new Class7_Sub4(this, arg4, Static111.aClass79_11, Static162.method2593(arg0), Static162.method2593(arg1));
			local35.method8633(arg4, arg1, arg0, arg3);
			return local35;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!sea;Lclient!up;)Lclient!nm;")
	@Override
	public Interface18 method8119(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "(B)V")
	@Override
	protected void method8210() {
		this.aBoolean499 = false;
		this.method5751();
	}

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "(I)V")
	@Override
	protected void method8207() {
		this.method5751();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!jia;Lclient!jia;FLclient!jia;)Lclient!jia;")
	@Override
	public Class68 method8138(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class68 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "(I)V")
	@Override
	protected void method8246() {
		OpenGL.glActiveTexture(super.anInt9658 + 33984);
	}

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "(B)V")
	@Override
	protected void method8211() {
		if (super.aBoolean752 && super.aBoolean746 && super.anInt9645 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method8131(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class4_Sub24 local19;
		while (!this.aClass163_39.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_39.method3644();
			Static393.anIntArray438[local7++] = (int) local19.aLong307;
			super.anInt9640 -= local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static393.anIntArray438, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static393.anIntArray438, 0);
			local7 = 0;
		}
		while (!this.aClass163_40.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_40.method3644();
			Static393.anIntArray438[local7++] = (int) local19.aLong307;
			super.anInt9634 -= local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static393.anIntArray438, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static393.anIntArray438, 0);
			local7 = 0;
		}
		while (!this.aClass163_41.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_41.method3644();
			Static393.anIntArray438[local7++] = local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static393.anIntArray438, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static393.anIntArray438, 0);
			local7 = 0;
		}
		while (!this.aClass163_42.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_42.method3644();
			Static393.anIntArray438[local7++] = (int) local19.aLong307;
			super.anInt9636 -= local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static393.anIntArray438, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static393.anIntArray438, 0);
		}
		while (!this.aClass163_38.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_38.method3644();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt4156);
		}
		@Pc(215) Class4 local215;
		while (!this.aClass163_43.method3638()) {
			local215 = this.aClass163_43.method3644();
			OpenGL.glDeleteProgramARB((int) local215.aLong307);
		}
		while (!this.aClass163_44.method3638()) {
			local215 = this.aClass163_44.method3644();
			OpenGL.glDeleteObjectARB(local215.aLong307);
		}
		while (!this.aClass163_38.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_38.method3644();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt4156);
		}
		if (this.E() > 100663296 && Static429.method5935() > this.aLong191 + 60000L) {
			System.gc();
			this.aLong191 = Static429.method5935();
		}
		super.method8131(local11);
	}

	@OriginalMember(owner = "client!nv", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9526 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt6609, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!dw;ILclient!pe;BI)Lclient!ada;")
	@Override
	public Interface1 method8169(@OriginalArg(0) Class79 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class276 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean507 || Static211.method8993(arg1) && Static211.method8993(arg3)) {
			return new Class7_Sub4(this, arg2, arg0, arg1, arg3);
		} else if (this.aBoolean502) {
			return new Class7_Sub2(this, arg2, arg0, arg1, arg3);
		} else {
			return new Class7_Sub4(this, arg2, arg0, Static162.method2593(arg1), Static162.method2593(arg3));
		}
	}

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "(B)V")
	@Override
	protected void method8223() {
		if (super.aBoolean748) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "()Lclient!ub;")
	@Override
	public Class359 method8115() {
		@Pc(7) int local7 = -1;
		if (this.aString75.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString75.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString75.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class359(local7, "OpenGL", this.anInt6610, this.aString76, 0L);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!sea;")
	@Override
	public Interface21 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8194(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
	@Override
	protected void method8176() {
		if (super.aBoolean747) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8254(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!nv", name = "S", descriptor = "(I)V")
	@Override
	protected void method8267() {
		for (@Pc(6) int local6 = super.anInt9664 - 1; local6 >= 0; local6--) {
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
		this.anOpenGL1.setSwapInterval(0);
		super.method8267();
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "()V")
	@Override
	public void method8073() {
	}

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "(B)F")
	@Override
	protected float method8199() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "(I)V")
	@Override
	protected void method8203() {
		if (super.aBoolean749) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!nv", name = "P", descriptor = "(I)V")
	@Override
	protected void method8262() {
		if (super.aBoolean737 && !super.aBoolean740) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!mga;ZBZI)V")
	@Override
	public void method8182(@OriginalArg(0) Class230 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static619.method8335(arg0));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8141(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8120(arg2, arg3);
	}

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "()V")
	@Override
	public void method8093() {
		if (super.anInt9573 <= 0 && super.anInt9526 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt9655;
		@Pc(16) int local16 = super.anInt9670;
		@Pc(19) int local19 = super.anInt9646;
		@Pc(22) int local22 = super.anInt9661;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8240();
		this.method8197(false);
		this.method8213(false);
		this.method8205(false);
		this.method8194(false);
		this.method8159((Interface14) null);
		this.method8272(false, -2, false);
		this.method8167(1);
		this.method8250(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9573, super.anInt9526, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)Lclient!up;")
	@Override
	public Interface23 method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "(I)V")
	@Override
	protected void method8217() {
		Static366.aFloatArray28[1] = (float) (super.anInt9657 & 0xFF00) / 65280.0F;
		Static366.aFloatArray28[3] = (float) (super.anInt9657 >>> 24) / 255.0F;
		Static366.aFloatArray28[0] = (float) (super.anInt9657 & 0xFF0000) / 1.671168E7F;
		Static366.aFloatArray28[2] = (float) (super.anInt9657 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static366.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!kja;II)V")
	@Override
	public void method8204(@OriginalArg(1) Class194 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte local18;
		@Pc(22) int local22;
		if (Static266.aClass194_5 == arg0) {
			local18 = 1;
			local22 = arg2 * 2;
		} else if (arg0 == Static230.aClass194_4) {
			local22 = arg2 + 1;
			local18 = 3;
		} else if (arg0 == Static83.aClass194_13) {
			local18 = 4;
			local22 = arg2 * 3;
		} else if (arg0 == Static454.aClass194_9) {
			local22 = arg2 + 2;
			local18 = 6;
		} else if (Static156.aClass194_2 == arg0) {
			local18 = 5;
			local22 = arg2 + 2;
		} else {
			local22 = arg2;
			local18 = 0;
		}
		OpenGL.glDrawArrays(local18, arg1, local22);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V")
	@Override
	public void method8102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(B)V")
	@Override
	protected void method8183() {
		if (super.aBoolean754) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "(I)V")
	@Override
	protected void method8245() {
		OpenGL.glViewport(super.anInt9653, super.anInt9673, super.anInt9573, super.anInt9526);
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(Z)V")
	@Override
	protected void method8241() {
		if (super.aBoolean753) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)V")
	@Override
	public void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZ)Lclient!je;")
	@Override
	public Interface16 method8265(@OriginalArg(1) boolean arg0) {
		return new Class24_Sub2(this, Static111.aClass79_8, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "()Z")
	@Override
	public boolean method8074() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!nm;)V")
	@Override
	public void method8117(@OriginalArg(0) Interface18 arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!dw;Lclient!pe;I)Z")
	@Override
	public boolean method8165(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class276 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "(I)V")
	@Override
	protected void method8200() {
		Static366.aFloatArray28[3] = 1.0F;
		Static366.aFloatArray28[2] = super.aFloat212 * super.aFloat218;
		Static366.aFloatArray28[0] = super.aFloat215 * super.aFloat212;
		Static366.aFloatArray28[1] = super.aFloat224 * super.aFloat212;
		OpenGL.glLightModelfv(2899, Static366.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!gha;I)V")
	@Override
	public void method8249(@OriginalArg(0) Class134 arg0) {
		if (arg0 == Static315.aClass134_3) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(10) int local10 = Static321.method4424(arg0);
		OpenGL.glTexGeni(8192, 9472, local10);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local10);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local10);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!nv", name = "E", descriptor = "(I)V")
	@Override
	protected void method8227() {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!nca;)V")
	@Override
	public void method8179(@OriginalArg(1) Class247 arg0) {
		@Pc(9) Class289[] local9 = ((Class247_Sub1) arg0).aClass289Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class289 local31 = local9[local25];
			@Pc(36) Class24_Sub1 local36 = this.aClass24_Sub1Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method4752();
			@Pc(46) long local46 = local36.method8361();
			local36.method8355();
			for (@Pc(53) int local53 = 0; local53 < local31.method6485(); local53++) {
				@Pc(60) Class214 local60 = local31.method6483(local53);
				if (Static345.aClass214_1 == local60) {
					local23 = true;
					OpenGL.glVertexPointer(3, 5126, local42, local46 + (long) local38);
				} else if (local60 == Static345.aClass214_2) {
					OpenGL.glNormalPointer(5126, local42, local46 + (long) local38);
					local15 = true;
				} else if (local60 == Static345.aClass214_3) {
					OpenGL.glColorPointer(4, 5121, local42, (long) local38 + local46);
					local13 = true;
				} else if (local60 == Static345.aClass214_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local46 + (long) local38);
				} else if (local60 == Static345.aClass214_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local46 + (long) local38);
				} else if (local60 == Static345.aClass214_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, (long) local38 + local46);
				} else if (Static345.aClass214_7 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, local46 + (long) local38);
				}
				local38 += local60.anInt5272;
			}
		}
		if (this.aBoolean501 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean501 = local23;
		}
		if (local15 != this.aBoolean500) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean500 = local15;
		}
		if (this.aBoolean497 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean497 = local13;
		}
		@Pc(266) int local266;
		if (this.anInt6607 < local11) {
			for (local266 = this.anInt6607; local266 < local11; local266++) {
				OpenGL.glClientActiveTexture(local266 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt6607 = local11;
		} else if (this.anInt6607 > local11) {
			for (local266 = local11; local266 < this.anInt6607; local266++) {
				OpenGL.glClientActiveTexture(local266 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt6607 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "(I)V")
	@Override
	protected void method8206() {
		super.aFloat213 = (float) (-super.anInt9647 + super.anInt9642);
		super.aFloat216 = super.aFloat213 - (float) super.anInt9645;
		if ((float) super.anInt9679 > super.aFloat216) {
			super.aFloat216 = (float) super.anInt9679;
		}
		OpenGL.glFogf(2915, super.aFloat216);
		OpenGL.glFogf(2916, super.aFloat213);
		Static366.aFloatArray28[0] = (float) (super.anInt9674 & 0xFF0000) / 1.671168E7F;
		Static366.aFloatArray28[1] = (float) (super.anInt9674 & 0xFF00) / 65280.0F;
		Static366.aFloatArray28[2] = (float) (super.anInt9674 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static366.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "(B)V")
	@Override
	protected void method8261() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass331Array3[super.anInt9658] == Static426.aClass331_4) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass92_Sub1Array3[super.anInt9658].method2296(Static264.aFloatArray23), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nv", name = "C", descriptor = "(B)V")
	@Override
	protected void method8285() {
		OpenGL.glTexEnvi(8960, 34162, Static291.method4148(super.aClass91Array5[super.anInt9658]));
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(BI)V")
	@Override
	public void method8230(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!je;BILclient!kja;III)V")
	@Override
	public void method8279(@OriginalArg(0) Interface16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class194 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static266.aClass194_5 == arg2) {
			local12 = arg4 * 2;
			local14 = 1;
		} else if (arg2 == Static230.aClass194_4) {
			local12 = arg4 + 1;
			local14 = 3;
		} else if (Static83.aClass194_13 == arg2) {
			local12 = arg4 * 3;
			local14 = 4;
		} else if (arg2 == Static454.aClass194_9) {
			local14 = 6;
			local12 = arg4 + 2;
		} else if (Static156.aClass194_2 == arg2) {
			local12 = arg4 + 2;
			local14 = 5;
		} else {
			local14 = 0;
			local12 = arg4;
		}
		@Pc(68) Class79 local68 = arg0.method8365();
		@Pc(77) Class24_Sub2 local77 = (Class24_Sub2) arg0;
		local77.method8355();
		OpenGL.glDrawElements(local14, local12, Static48.method995(local68), local77.method8361() + (long) (local68.anInt2185 * arg3));
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)V")
	public synchronized void method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub24 local14 = new Class4_Sub24(arg0);
		local14.aLong307 = (long) arg1;
		this.aClass163_40.method3646(local14);
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(II)V")
	public synchronized void method5749(@OriginalArg(0) int arg0) {
		@Pc(11) Class4 local11 = new Class4();
		local11.aLong307 = (long) arg0;
		this.aClass163_43.method3646(local11);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI[[II)Lclient!mia;")
	@Override
	public Interface17 method8251(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class7_Sub1(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8193(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local14)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[Lclient!po;)Lclient!nca;")
	@Override
	public Class247 method8237(@OriginalArg(1) Class289[] arg0) {
		return new Class247_Sub1(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "(I)V")
	@Override
	protected void method8189() {
		OpenGL.glScissor(super.anInt9655 + super.anInt9653, -super.anInt9661 + super.anInt9526 + super.anInt9673, -super.anInt9655 + super.anInt9670, -super.anInt9646 + super.anInt9661);
	}

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)Lclient!oda;")
	@Override
	public Interface19 method8157(@OriginalArg(1) boolean arg0) {
		return new Class24_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "W", descriptor = "(I)V")
	@Override
	protected void method8275() {
		this.method8266();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt9659; local10++) {
			@Pc(17) Class4_Sub29 local17 = super.aClass4_Sub29Array6[local10];
			@Pc(21) int local21 = local17.method7633();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method7626() / 255.0F;
			Static366.aFloatArray28[0] = (float) local17.method7627();
			Static366.aFloatArray28[1] = (float) local17.method7630();
			Static366.aFloatArray28[2] = (float) local17.method7628();
			Static366.aFloatArray28[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static366.aFloatArray28, 0);
			Static366.aFloatArray28[3] = 1.0F;
			Static366.aFloatArray28[0] = local31 * (float) (local21 >> 16 & 0xFF);
			Static366.aFloatArray28[2] = (float) (local21 & 0xFF) * local31;
			Static366.aFloatArray28[1] = local31 * (float) (local21 >> 8 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static366.aFloatArray28, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method7632() * local17.method7632()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt9651) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method8275();
	}

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "(B)V")
	@Override
	protected void method8277() {
		Static366.aFloatArray28[3] = 1.0F;
		Static366.aFloatArray28[1] = super.aFloat224 * super.aFloat217;
		Static366.aFloatArray28[0] = super.aFloat217 * super.aFloat215;
		Static366.aFloatArray28[2] = super.aFloat218 * super.aFloat217;
		OpenGL.glLightfv(16384, 4609, Static366.aFloatArray28, 0);
		Static366.aFloatArray28[1] = -super.aFloat210 * super.aFloat224;
		Static366.aFloatArray28[0] = super.aFloat215 * -super.aFloat210;
		Static366.aFloatArray28[2] = -super.aFloat210 * super.aFloat218;
		Static366.aFloatArray28[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static366.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "()V")
	@Override
	protected void method8126() {
		super.method8126();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!oda;I)V")
	@Override
	public void method8175(@OriginalArg(1) Interface19 arg0, @OriginalArg(2) int arg1) {
		this.aClass24_Sub1Array1[arg1] = (Class24_Sub1) arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZZ[I)Lclient!ada;")
	@Override
	public Interface1 method8242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5) {
		if (this.aBoolean507 || Static211.method8993(arg0) && Static211.method8993(arg2)) {
			return new Class7_Sub4(this, arg0, arg2, arg4, arg5, 0, arg3);
		} else if (this.aBoolean502) {
			return new Class7_Sub2(this, arg0, arg2, arg5, 0, arg3);
		} else {
			@Pc(36) Class7_Sub4 local36 = new Class7_Sub4(this, Static220.aClass276_11, Static111.aClass79_7, Static162.method2593(arg0), Static162.method2593(arg2));
			local36.method8625(arg0, 0, arg2, arg5, arg3, 0);
			return local36;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZLclient!mga;)V")
	@Override
	protected void method8173(@OriginalArg(1) int arg0, @OriginalArg(3) Class230 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static619.method8335(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!nv", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(II)Lclient!bda;")
	@Override
	protected Class20 method8163(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class20_Sub6(this, super.aClass34_123);
		} else if (arg0 == 4) {
			return new Class20_Sub2(this, super.aClass34_123, super.aClass312_8);
		} else if (arg0 == 8) {
			return new Class20_Sub10(this, super.aClass34_123, super.aClass312_8);
		} else {
			return super.method8163(arg0);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!pe;ILclient!dw;)Z")
	@Override
	public boolean method8291(@OriginalArg(0) Class276 arg0, @OriginalArg(2) Class79 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt6608;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[BIIZLclient!pe;II)Lclient!ada;")
	@Override
	protected Interface1 method8209(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class276 arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean507 || Static211.method8993(arg4) && Static211.method8993(arg1)) {
			return new Class7_Sub4(this, arg3, arg4, arg1, arg2, arg0, 0, 0);
		} else if (this.aBoolean502) {
			return new Class7_Sub2(this, arg3, arg4, arg1, arg0, 0, 0);
		} else {
			@Pc(47) Class7_Sub4 local47 = new Class7_Sub4(this, arg3, Static111.aClass79_7, Static162.method2593(arg4), Static162.method2593(arg1));
			local47.method8626(arg0, 0, arg3, arg4, arg1);
			return local47;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([BIIIBLclient!pe;)Lclient!ch;")
	@Override
	public Interface7 method8248(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class276 arg1) {
		return new Class7_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(Z)V")
	@Override
	public void method8263() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray71, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "(I)V")
	@Override
	protected void method8255() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray69, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "(B)V")
	private void method5751() {
		if (this.aBoolean498) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass340_7.method7445()) {
			if (!this.aBoolean499) {
				OpenGL.glLoadMatrixf(super.aClass92_Sub1_18.method2296(Static264.aFloatArray23), 0);
				this.aBoolean499 = true;
				this.method8263();
				this.method8275();
			}
			if (super.aBoolean733) {
				this.aBoolean498 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass92_Sub1_15.method2296(Static264.aFloatArray23), 0);
				this.aBoolean498 = true;
			}
		} else if (super.aBoolean733) {
			OpenGL.glLoadIdentity();
			this.aBoolean498 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass92_Sub1_15.method2296(Static264.aFloatArray23), 0);
			this.aBoolean498 = false;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(BII)V")
	public synchronized void method5752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub24 local14 = new Class4_Sub24(arg0);
		local14.aLong307 = (long) arg1;
		this.aClass163_39.method3646(local14);
	}

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "()V")
	@Override
	public void method8134() {
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(IZ)V")
	@Override
	public void method8283(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!nv", name = "D", descriptor = "(B)V")
	@Override
	protected void method8289() {
		OpenGL.glDepthMask(super.aBoolean735 && super.aBoolean736);
	}

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "(B)V")
	@Override
	protected void method8214() {
		if (super.aClass137_6 == Static618.aClass137_7) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass137_6 == Static606.aClass137_5) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass137_6 == Static282.aClass137_1) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "()V")
	@Override
	public void method8149() {
	}

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "()V")
	@Override
	public void method8153() {
		OpenGL.glFinish();
	}
}
