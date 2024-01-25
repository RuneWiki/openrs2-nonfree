import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class144_Sub1_Sub2 extends Class144_Sub1 {

	@OriginalMember(owner = "client!md", name = "Kg", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "client!md", name = "Zh", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!md", name = "ah", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!md", name = "Pg", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!md", name = "Gh", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!md", name = "Ph", descriptor = "I")
	private int anInt6617;

	@OriginalMember(owner = "client!md", name = "hi", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!md", name = "Ci", descriptor = "Lclient!bd;")
	private final Class32 aClass32_33 = new Class32();

	@OriginalMember(owner = "client!md", name = "Xh", descriptor = "Lclient!bd;")
	private final Class32 aClass32_34 = new Class32();

	@OriginalMember(owner = "client!md", name = "Vg", descriptor = "Lclient!bd;")
	private final Class32 aClass32_35 = new Class32();

	@OriginalMember(owner = "client!md", name = "Rg", descriptor = "Lclient!bd;")
	private final Class32 aClass32_36 = new Class32();

	@OriginalMember(owner = "client!md", name = "gh", descriptor = "Lclient!bd;")
	private final Class32 aClass32_37 = new Class32();

	@OriginalMember(owner = "client!md", name = "Mh", descriptor = "Lclient!bd;")
	private final Class32 aClass32_38 = new Class32();

	@OriginalMember(owner = "client!md", name = "Dh", descriptor = "Lclient!bd;")
	private final Class32 aClass32_39 = new Class32();

	@OriginalMember(owner = "client!md", name = "ih", descriptor = "[Lclient!bia;")
	private final Class40_Sub1[] aClass40_Sub1Array1 = new Class40_Sub1[16];

	@OriginalMember(owner = "client!md", name = "Ri", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!md", name = "Gi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!md", name = "vi", descriptor = "I")
	private final int anInt6618 = 0;

	@OriginalMember(owner = "client!md", name = "Th", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!md", name = "si", descriptor = "Ljava/lang/String;")
	private final String aString78;

	@OriginalMember(owner = "client!md", name = "rh", descriptor = "Ljava/lang/String;")
	private final String aString79;

	@OriginalMember(owner = "client!md", name = "Eh", descriptor = "I")
	private final int anInt6619;

	@OriginalMember(owner = "client!md", name = "bh", descriptor = "Z")
	public boolean aBoolean467;

	@OriginalMember(owner = "client!md", name = "pi", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!md", name = "Lh", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!md", name = "Mi", descriptor = "Z")
	public final boolean aBoolean468;

	@OriginalMember(owner = "client!md", name = "Wh", descriptor = "Z")
	public final boolean aBoolean470;

	@OriginalMember(owner = "client!md", name = "li", descriptor = "Z")
	public final boolean aBoolean469;

	@OriginalMember(owner = "client!md", name = "eh", descriptor = "[I")
	public final int[] anIntArray343;

	@OriginalMember(owner = "client!md", name = "Sh", descriptor = "I")
	public final int anInt6620;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!rg;I)V")
	public Class144_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class310 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString78 = OpenGL.glGetString(7936).toLowerCase();
			this.aString79 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString78.indexOf("microsoft") != -1 || this.aString78.indexOf("brian paul") != -1 || this.aString78.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(116) String local116 = OpenGL.glGetString(7938);
			@Pc(124) String[] local124 = Static407.method2868(local116.replace('.', ' '), ' ');
			if (local124.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(140) int local140;
			try {
				@Pc(134) int local134 = Static297.method4858(local124[0], 95);
				local140 = Static297.method4858(local124[1], 117);
				this.anInt6619 = local140 + local134 * 10;
			} catch (@Pc(149) NumberFormatException local149) {
				throw new RuntimeException("");
			}
			if (this.anInt6619 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(200) int[] local200 = new int[1];
				OpenGL.glGetIntegerv(34018, local200, 0);
				super.anInt6497 = local200[0];
				if (super.anInt6497 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6530 = 8;
				this.aBoolean467 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean450 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean471 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean440 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean466 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean449 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean468 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean470 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean469 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray343 = new int[super.anInt6497];
				this.anInt6620 = Stream.c() ? 33639 : 5121;
				if (this.aString79.indexOf("radeon") != -1) {
					local140 = 0;
					@Pc(327) boolean local327 = false;
					@Pc(329) boolean local329 = false;
					@Pc(338) String[] local338 = Static407.method2868(this.aString79.replace('/', ' '), ' ');
					for (@Pc(340) int local340 = 0; local340 < local338.length; local340++) {
						@Pc(345) String local345 = local338[local340];
						try {
							if (local345.length() > 0) {
								if (local345.charAt(0) == 'x' && local345.length() >= 3 && Static334.method5155(local345.substring(1, 3))) {
									local329 = true;
									local345 = local345.substring(1);
								}
								if (local345.equals("hd")) {
									local327 = true;
								} else {
									if (local345.startsWith("hd")) {
										local327 = true;
										local345 = local345.substring(2);
									}
									if (local345.length() >= 4 && Static334.method5155(local345.substring(0, 4))) {
										local140 = Static297.method4858(local345.substring(0, 4), -117);
										break;
									}
								}
							}
						} catch (@Pc(425) Exception local425) {
						}
					}
					if (!local329 && !local327) {
						if (local140 >= 7000 && local140 <= 9250) {
							super.aBoolean449 = false;
						}
						if (local140 >= 7000 && local140 <= 7999) {
							this.aBoolean467 = false;
						}
					}
					this.aBoolean471 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString78.indexOf("intel");
				if (this.aBoolean467) {
					try {
						@Pc(497) int[] local497 = new int[1];
						OpenGL.glGenBuffersARB(1, local497, 0);
					} catch (@Pc(503) Throwable local503) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(509) Throwable local509) {
			local509.printStackTrace();
			this.method6932();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(ZI)Lclient!fea;")
	@Override
	public Interface7 method5780(@OriginalArg(0) boolean arg0) {
		return new Class40_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!md", name = "w", descriptor = "(I)F")
	@Override
	protected float method5739() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method5752(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!md", name = "j", descriptor = "()V")
	@Override
	public void method6936() {
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!al;BLclient!o;)Z")
	@Override
	public boolean method5759(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class260 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!al;Lclient!o;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class260 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!lb;Lclient!lb;FLclient!lb;)Lclient!lb;")
	@Override
	public Class47 method6899(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ida;Z)V")
	@Override
	public void method5772(@OriginalArg(0) Class170 arg0) {
		if (arg0 == Static20.aClass170_1) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static606.method8538(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B[BILclient!o;II)Lclient!pw;")
	@Override
	public Interface18 method5733(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class260 arg1) {
		return new Class28_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILclient!fm;ILclient!l;I)V")
	@Override
	public void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class213 arg4, @OriginalArg(6) int arg5) {
		@Pc(19) byte local19;
		@Pc(23) int local23;
		if (Static374.aClass213_29 == arg4) {
			local19 = 1;
			local23 = arg0 * 2;
		} else if (Static67.aClass213_6 == arg4) {
			local23 = arg0 + 1;
			local19 = 3;
		} else if (arg4 == Static469.aClass213_46) {
			local19 = 4;
			local23 = arg0 * 3;
		} else if (Static378.aClass213_30 == arg4) {
			local19 = 6;
			local23 = arg0 + 2;
		} else if (arg4 == Static18.aClass213_1) {
			local23 = arg0 + 2;
			local19 = 5;
		} else {
			local19 = 0;
			local23 = arg0;
		}
		@Pc(85) Class19 local85 = arg2.method5082();
		@Pc(88) Class40_Sub2 local88 = (Class40_Sub2) arg2;
		local88.method1385();
		OpenGL.glDrawElements(local19, local23, Static158.method2257(local85), local88.method1388() + (long) (arg5 * local85.anInt242));
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(II)V")
	@Override
	public void method5721(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!md", name = "s", descriptor = "(I)V")
	@Override
	protected void method5774() {
		if (super.aBoolean442 && super.aBoolean451 && super.anInt6499 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!md", name = "o", descriptor = "(B)V")
	@Override
	protected void method5777() {
		OpenGL.glDepthMask(super.aBoolean446 && super.aBoolean453);
	}

	@OriginalMember(owner = "client!md", name = "P", descriptor = "(I)V")
	@Override
	protected void method5763() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass199Array3[super.anInt6503] == Static79.aClass199_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass263_Sub2Array3[super.anInt6503].method7291(Static626.aFloatArray72), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!l;I)V")
	@Override
	public void method5698(@OriginalArg(1) int arg0, @OriginalArg(2) Class213 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) byte local20;
		@Pc(24) int local24;
		if (arg1 == Static374.aClass213_29) {
			local24 = arg2 * 2;
			local20 = 1;
		} else if (Static67.aClass213_6 == arg1) {
			local24 = arg2 + 1;
			local20 = 3;
		} else if (Static469.aClass213_46 == arg1) {
			local20 = 4;
			local24 = arg2 * 3;
		} else if (Static378.aClass213_30 == arg1) {
			local20 = 6;
			local24 = arg2 + 2;
		} else if (Static18.aClass213_1 == arg1) {
			local20 = 5;
			local24 = arg2 + 2;
		} else {
			local24 = arg2;
			local20 = 0;
		}
		OpenGL.glDrawArrays(local20, arg0, local24);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(B)V")
	@Override
	protected void method5654() {
		OpenGL.glActiveTexture(super.anInt6503 + 33984);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(II)Lclient!wi;")
	@Override
	public Interface27 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!fea;I)V")
	@Override
	public void method5696(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass40_Sub1Array1[arg0] = (Class40_Sub1) arg1;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	@Override
	public void method5673() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray51, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(II)Lclient!kba;")
	@Override
	protected Class5 method5691(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class5_Sub7(this, super.aClass310_76);
		} else if (arg0 == 4) {
			return new Class5_Sub4(this, super.aClass310_76, super.aClass223_5);
		} else if (arg0 == 8) {
			return new Class5_Sub9(this, super.aClass310_76, super.aClass223_5);
		} else {
			return super.method5691(arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "l", descriptor = "(B)V")
	@Override
	protected void method5644() {
		OpenGL.glViewport(super.anInt6513, super.anInt6528, super.anInt6409, super.anInt6368);
	}

	@OriginalMember(owner = "client!md", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!md", name = "F", descriptor = "(I)V")
	@Override
	protected void method5717() {
		if (super.aBoolean460) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IJ)V")
	public synchronized void method5781(@OriginalArg(1) long arg0) {
		@Pc(7) Class14 local7 = new Class14();
		local7.aLong324 = arg0;
		this.aClass32_39.method582(local7);
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "(II)V")
	public synchronized void method5782(@OriginalArg(1) int arg0) {
		@Pc(12) Class14 local12 = new Class14();
		local12.aLong324 = (long) arg0;
		this.aClass32_38.method582(local12);
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(Z)V")
	@Override
	protected void method5660() {
		if (super.aBoolean454) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([Lclient!gaa;I)Lclient!ok;")
	@Override
	public Class119 method5689(@OriginalArg(0) Class127[] arg0) {
		return new Class119_Sub1(arg0);
	}

	@OriginalMember(owner = "client!md", name = "v", descriptor = "(B)V")
	@Override
	protected void method5731() {
		@Pc(9) int local9 = this.anIntArray343[super.anInt6503];
		if (local9 != 0) {
			this.anIntArray343[super.anInt6503] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!md", name = "y", descriptor = "()Lclient!bg;")
	@Override
	public Class35 method6960() {
		@Pc(7) int local7 = -1;
		if (this.aString78.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString78.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString78.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class35(local7, "OpenGL", this.anInt6619, this.aString79, 0L);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V")
	@Override
	public void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
	@Override
	protected void method5688() {
		Static172.aFloatArray14[3] = (float) (super.anInt6527 >>> 24) / 255.0F;
		Static172.aFloatArray14[1] = (float) (super.anInt6527 & 0xFF00) / 65280.0F;
		Static172.aFloatArray14[0] = (float) (super.anInt6527 & 0xFF0000) / 1.671168E7F;
		Static172.aFloatArray14[2] = (float) (super.anInt6527 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static172.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(Z)V")
	@Override
	protected void method5730() {
		OpenGL.glTexEnvi(8960, 34161, Static48.method809(super.aClass287Array6[super.anInt6503]));
	}

	@OriginalMember(owner = "client!md", name = "o", descriptor = "(I)V")
	@Override
	protected void method5708() {
		OpenGL.glScissor(super.anInt6513 + super.anInt6522, -super.anInt6495 + super.anInt6368 + super.anInt6528, -super.anInt6522 + super.anInt6508, super.anInt6495 - super.anInt6519);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5682(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(13) Long local13 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local13)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!md", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6368 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt6620, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "s", descriptor = "()Z")
	@Override
	public boolean method6898() {
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII[IIZ)Lclient!gka;")
	@Override
	public Interface9 method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (this.aBoolean466 || Static670.method9288(126, arg2) && Static670.method9288(114, arg4)) {
			return new Class28_Sub2(this, arg2, arg4, arg5, arg3, 0, arg1);
		} else if (this.aBoolean471) {
			return new Class28_Sub3(this, arg2, arg4, arg3, 0, arg1);
		} else {
			@Pc(55) Class28_Sub2 local55 = new Class28_Sub2(this, Static641.aClass260_12, Static18.aClass19_4, Static255.method4294(arg2), Static255.method4294(arg4));
			local55.method4771(arg4, arg1, arg3, 0, arg2, 0);
			return local55;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!bj;")
	@Override
	public Interface3 method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!md", name = "B", descriptor = "(B)V")
	private void method5783() {
		if (this.aBoolean463) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass114_6.method2260()) {
			if (!this.aBoolean462) {
				OpenGL.glLoadMatrixf(super.aClass263_Sub2_18.method7291(Static626.aFloatArray72), 0);
				this.aBoolean462 = true;
				this.method5673();
				this.method5773();
			}
			if (super.aBoolean439) {
				this.aBoolean463 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass263_Sub2_15.method7291(Static626.aFloatArray72), 0);
				this.aBoolean463 = true;
			}
		} else if (super.aBoolean439) {
			OpenGL.glLoadIdentity();
			this.aBoolean463 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass263_Sub2_15.method7291(Static626.aFloatArray72), 0);
			this.aBoolean463 = false;
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(B)V")
	@Override
	protected void method5659() {
		if (super.aBoolean448) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!tca;)V")
	@Override
	public void method6891(@OriginalArg(0) Interface22 arg0) {
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(ZZ)Lclient!fm;")
	@Override
	public Interface8 method5736(@OriginalArg(1) boolean arg0) {
		return new Class40_Sub2(this, Static18.aClass19_5, arg0);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
	@Override
	public void method6953() {
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "()V")
	@Override
	public void method6889() {
		if (super.anInt6409 <= 0 && super.anInt6368 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt6522;
		@Pc(22) int local22 = super.anInt6508;
		@Pc(25) int local25 = super.anInt6519;
		@Pc(28) int local28 = super.anInt6495;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5722();
		this.method5764(false);
		this.method5745(false);
		this.method5664(false);
		this.method5694(false);
		this.method5643((Interface25) null);
		this.method5769(false, -2, false);
		this.method5723(1);
		this.method5685(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6409, super.anInt6368, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(Z)V")
	@Override
	protected void method5762() {
		Static172.aFloatArray14[3] = 1.0F;
		Static172.aFloatArray14[1] = super.aFloat102 * super.aFloat104;
		Static172.aFloatArray14[2] = super.aFloat102 * super.aFloat106;
		Static172.aFloatArray14[0] = super.aFloat102 * super.aFloat103;
		OpenGL.glLightfv(16384, 4609, Static172.aFloatArray14, 0);
		Static172.aFloatArray14[2] = super.aFloat106 * -super.aFloat91;
		Static172.aFloatArray14[1] = -super.aFloat91 * super.aFloat104;
		Static172.aFloatArray14[0] = super.aFloat103 * -super.aFloat91;
		Static172.aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static172.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!md", name = "t", descriptor = "(B)V")
	@Override
	protected void method5648() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray48, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!md", name = "S", descriptor = "(I)V")
	@Override
	protected void method5656() {
		this.aBoolean462 = false;
		this.method5783();
	}

	@OriginalMember(owner = "client!md", name = "x", descriptor = "()Z")
	@Override
	public boolean method6892() {
		return false;
	}

	@OriginalMember(owner = "client!md", name = "Z", descriptor = "(I)V")
	@Override
	protected void method5710() {
		if (super.aBoolean458) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!md", name = "L", descriptor = "(I)V")
	@Override
	protected void method5773() {
		this.method5662();
		@Pc(15) int local15;
		for (local15 = 0; local15 < super.anInt6501; local15++) {
			@Pc(22) Class14_Sub18 local22 = super.aClass14_Sub18Array5[local15];
			@Pc(26) int local26 = local22.method8345();
			@Pc(30) int local30 = local15 + 16386;
			@Pc(36) float local36 = local22.method8339() / 255.0F;
			Static172.aFloatArray14[0] = (float) local22.method8342();
			Static172.aFloatArray14[1] = (float) local22.method8344();
			Static172.aFloatArray14[2] = (float) local22.method8341();
			Static172.aFloatArray14[3] = 1.0F;
			OpenGL.glLightfv(local30, 4611, Static172.aFloatArray14, 0);
			Static172.aFloatArray14[3] = 1.0F;
			Static172.aFloatArray14[2] = local36 * (float) (local26 & 0xFF);
			Static172.aFloatArray14[1] = (float) (local26 >> 8 & 0xFF) * local36;
			Static172.aFloatArray14[0] = local36 * (float) (local26 >> 16 & 0xFF);
			OpenGL.glLightfv(local30, 4609, Static172.aFloatArray14, 0);
			OpenGL.glLightf(local30, 4617, 1.0F / (float) (local22.method8343() * local22.method8343()));
			OpenGL.glEnable(local30);
		}
		while (super.anInt6510 > local15) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		super.method5773();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!md", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt6618;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)V")
	public synchronized void method5784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class14_Sub30 local8 = new Class14_Sub30(arg1);
		local8.aLong324 = (long) arg0;
		this.aClass32_34.method582(local8);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5672(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6952(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZBILclient!gn;)V")
	@Override
	protected void method5738(@OriginalArg(2) int arg0, @OriginalArg(3) Class138 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static16.method279(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6946(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class14_Sub30 local19;
		while (!this.aClass32_34.method591()) {
			local19 = (Class14_Sub30) this.aClass32_34.method579();
			Static173.anIntArray172[local7++] = (int) local19.aLong324;
			super.anInt6491 -= local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static173.anIntArray172, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static173.anIntArray172, 0);
			local7 = 0;
		}
		while (!this.aClass32_35.method591()) {
			local19 = (Class14_Sub30) this.aClass32_35.method579();
			Static173.anIntArray172[local7++] = (int) local19.aLong324;
			super.anInt6490 -= local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static173.anIntArray172, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static173.anIntArray172, 0);
			local7 = 0;
		}
		while (!this.aClass32_36.method591()) {
			local19 = (Class14_Sub30) this.aClass32_36.method579();
			Static173.anIntArray172[local7++] = local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static173.anIntArray172, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static173.anIntArray172, 0);
			local7 = 0;
		}
		while (!this.aClass32_37.method591()) {
			local19 = (Class14_Sub30) this.aClass32_37.method579();
			Static173.anIntArray172[local7++] = (int) local19.aLong324;
			super.anInt6489 -= local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static173.anIntArray172, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static173.anIntArray172, 0);
		}
		while (!this.aClass32_33.method591()) {
			local19 = (Class14_Sub30) this.aClass32_33.method579();
			OpenGL.glDeleteLists((int) local19.aLong324, local19.anInt6793);
		}
		@Pc(227) Class14 local227;
		while (!this.aClass32_38.method591()) {
			local227 = this.aClass32_38.method579();
			OpenGL.glDeleteProgramARB((int) local227.aLong324);
		}
		while (!this.aClass32_39.method591()) {
			local227 = this.aClass32_39.method579();
			OpenGL.glDeleteObjectARB(local227.aLong324);
		}
		while (!this.aClass32_33.method591()) {
			local19 = (Class14_Sub30) this.aClass32_33.method579();
			OpenGL.glDeleteLists((int) local19.aLong324, local19.anInt6793);
		}
		if (this.E() > 100663296 && Static26.method382() > this.aLong172 + 60000L) {
			System.gc();
			this.aLong172 = Static26.method382();
		}
		super.method6946(local11);
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "(B)V")
	@Override
	protected void method5700() {
		if (super.aBoolean456 && !super.aBoolean445) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!md", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!md", name = "w", descriptor = "(B)V")
	@Override
	protected void method5732() {
		if (Static282.aClass231_5 == super.aClass231_6) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static122.aClass231_2 == super.aClass231_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass231_6 == Static632.aClass231_7) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V")
	public synchronized void method5785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class14_Sub30 local15 = new Class14_Sub30(arg0);
		local15.aLong324 = (long) arg1;
		this.aClass32_35.method582(local15);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!wi;Lclient!bj;)Lclient!tca;")
	@Override
	public Interface22 method6956(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Interface3 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!md", name = "r", descriptor = "()V")
	@Override
	public void method6901() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!md", name = "l", descriptor = "(I)V")
	@Override
	protected void method5742() {
		if (super.aBoolean457) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	@Override
	public void method6954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5678(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIILclient!o;Z[B)Lclient!gka;")
	@Override
	protected Interface9 method5726(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class260 arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) byte[] arg4) {
		if (this.aBoolean466 || Static670.method9288(74, arg1) && Static670.method9288(0xD ^ 0x65, arg0)) {
			return new Class28_Sub2(this, arg2, arg1, arg0, arg3, arg4, 0, 0);
		} else if (this.aBoolean471) {
			return new Class28_Sub3(this, arg2, arg1, arg0, arg4, 0, 0);
		} else {
			@Pc(57) Class28_Sub2 local57 = new Class28_Sub2(this, arg2, Static18.aClass19_4, Static255.method4294(arg1), Static255.method4294(arg0));
			local57.method4776(arg0, arg2, arg1, 0, arg4);
			return local57;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZIIILclient!o;I[F)Lclient!gka;")
	@Override
	protected Interface9 method5749(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class260 arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean466 || Static670.method9288(87, arg0) && Static670.method9288(83, arg2)) {
			return new Class28_Sub2(this, arg3, arg0, arg2, arg1, arg4, 0, 0);
		} else if (this.aBoolean471) {
			return new Class28_Sub3(this, arg3, arg0, arg2, arg4, 0, 0);
		} else {
			@Pc(67) Class28_Sub2 local67 = new Class28_Sub2(this, arg3, Static18.aClass19_8, Static255.method4294(arg0), Static255.method4294(arg2));
			local67.method1762(arg0, arg2, arg4, arg3);
			return local67;
		}
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(Z)V")
	@Override
	protected void method5743() {
		for (@Pc(6) int local6 = super.anInt6497 - 1; local6 >= 0; local6--) {
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
		if (false) {
			return;
		}
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(84) float[] local84 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(86) int local86 = 0; local86 < 8; local86++) {
			@Pc(94) int local94 = local86 + 16384;
			OpenGL.glLightfv(local94, 4608, local84, 0);
			OpenGL.glLightf(local94, 4615, 0.0F);
			OpenGL.glLightf(local94, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method5743();
	}

	@OriginalMember(owner = "client!md", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5694(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6942(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6918(arg2, arg3);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()V")
	@Override
	protected void method6905() {
		super.method6905();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ok;I)V")
	@Override
	public void method5707(@OriginalArg(0) Class119 arg0) {
		@Pc(9) Class127[] local9 = ((Class119_Sub1) arg0).aClass127Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class127 local25 = local9[local19];
			@Pc(30) Class40_Sub1 local30 = this.aClass40_Sub1Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method774();
			@Pc(40) long local40 = local30.method1388();
			local30.method1385();
			for (@Pc(45) int local45 = 0; local25.method2653() > local45; local45++) {
				@Pc(52) Class73 local52 = local25.method2658(local45);
				if (local52 == Static102.aClass73_1) {
					OpenGL.glVertexPointer(3, 5126, local36, local40 + (long) local32);
					local17 = true;
				} else if (Static102.aClass73_2 == local52) {
					OpenGL.glNormalPointer(5126, local36, local40 + (long) local32);
					local15 = true;
				} else if (Static102.aClass73_3 == local52) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local36, local40 + (long) local32);
				} else if (Static102.aClass73_4 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, (long) local32 + local40);
				} else if (Static102.aClass73_5 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, (long) local32 + local40);
				} else if (local52 == Static102.aClass73_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, (long) local32 + local40);
				} else if (local52 == Static102.aClass73_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, local40 + (long) local32);
				}
				local32 += local52.anInt1768;
			}
		}
		if (this.aBoolean464 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean464 = local17;
		}
		if (local15 != this.aBoolean461) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean461 = local15;
		}
		if (local13 != this.aBoolean465) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean465 = local13;
		}
		@Pc(312) int local312;
		if (local11 > this.anInt6617) {
			for (local312 = this.anInt6617; local312 < local11; local312++) {
				OpenGL.glClientActiveTexture(local312 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt6617 = local11;
		} else if (this.anInt6617 > local11) {
			for (local312 = local11; local312 < this.anInt6617; local312++) {
				OpenGL.glClientActiveTexture(local312 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt6617 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "q", descriptor = "()V")
	@Override
	public void method6916() {
	}

	@OriginalMember(owner = "client!md", name = "A", descriptor = "(I)V")
	@Override
	protected void method5725() {
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "(B)V")
	@Override
	protected void method5748() {
		OpenGL.glTexEnvi(8960, 34162, Static48.method809(super.aClass287Array5[super.anInt6503]));
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!gn;ZZI)V")
	@Override
	public void method5775(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static16.method279(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([[IIZI)Lclient!sba;")
	@Override
	public Interface20 method5741(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class28_Sub4(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(ZI)V")
	@Override
	public void method5652(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!o;BILclient!al;)Lclient!gka;")
	@Override
	public Interface9 method5753(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3) {
		if (this.aBoolean466 || Static670.method9288(105, arg2) && Static670.method9288(~-91, arg0)) {
			return new Class28_Sub2(this, arg1, arg3, arg2, arg0);
		} else if (this.aBoolean471) {
			return new Class28_Sub3(this, arg1, arg3, arg2, arg0);
		} else {
			return new Class28_Sub2(this, arg1, arg3, Static255.method4294(arg2), Static255.method4294(arg0));
		}
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "(I)V")
	@Override
	protected void method5704() {
		this.method5783();
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "(I)V")
	@Override
	protected void method5665() {
		Static172.aFloatArray14[2] = super.aFloat95 * super.aFloat106;
		Static172.aFloatArray14[3] = 1.0F;
		Static172.aFloatArray14[0] = super.aFloat95 * super.aFloat103;
		Static172.aFloatArray14[1] = super.aFloat104 * super.aFloat95;
		OpenGL.glLightModelfv(2899, Static172.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!md", name = "U", descriptor = "(I)V")
	@Override
	protected void method5695() {
		super.aFloat99 = (float) (-super.anInt6517 + super.anInt6520);
		super.aFloat94 = super.aFloat99 - (float) super.anInt6499;
		if (super.aFloat94 < (float) super.anInt6493) {
			super.aFloat94 = (float) super.anInt6493;
		}
		OpenGL.glFogf(2915, super.aFloat94);
		OpenGL.glFogf(2916, super.aFloat99);
		Static172.aFloatArray14[0] = (float) (super.anInt6507 & 0xFF0000) / 1.671168E7F;
		Static172.aFloatArray14[2] = (float) (super.anInt6507 & 0xFF) / 255.0F;
		Static172.aFloatArray14[1] = (float) (super.anInt6507 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static172.aFloatArray14, 0);
	}
}
