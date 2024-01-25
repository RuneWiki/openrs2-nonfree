import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class22_Sub2_Sub2 extends Class22_Sub2 {

	@OriginalMember(owner = "client!vaa", name = "Yh", descriptor = "Z")
	private boolean aBoolean707;

	@OriginalMember(owner = "client!vaa", name = "Vg", descriptor = "Z")
	private boolean aBoolean708;

	@OriginalMember(owner = "client!vaa", name = "lh", descriptor = "I")
	private int anInt10580;

	@OriginalMember(owner = "client!vaa", name = "Og", descriptor = "J")
	private long aLong325;

	@OriginalMember(owner = "client!vaa", name = "Mg", descriptor = "Z")
	private boolean aBoolean709;

	@OriginalMember(owner = "client!vaa", name = "qh", descriptor = "Z")
	private boolean aBoolean710;

	@OriginalMember(owner = "client!vaa", name = "Ng", descriptor = "Z")
	private boolean aBoolean711;

	@OriginalMember(owner = "client!vaa", name = "Ph", descriptor = "Lclient!sja;")
	private final Class342 aClass342_85 = new Class342();

	@OriginalMember(owner = "client!vaa", name = "qi", descriptor = "Lclient!sja;")
	private final Class342 aClass342_86 = new Class342();

	@OriginalMember(owner = "client!vaa", name = "Cg", descriptor = "Lclient!sja;")
	private final Class342 aClass342_87 = new Class342();

	@OriginalMember(owner = "client!vaa", name = "si", descriptor = "Lclient!sja;")
	private final Class342 aClass342_88 = new Class342();

	@OriginalMember(owner = "client!vaa", name = "oi", descriptor = "Lclient!sja;")
	private final Class342 aClass342_89 = new Class342();

	@OriginalMember(owner = "client!vaa", name = "jh", descriptor = "Lclient!sja;")
	private final Class342 aClass342_90 = new Class342();

	@OriginalMember(owner = "client!vaa", name = "ki", descriptor = "Lclient!sja;")
	private final Class342 aClass342_91 = new Class342();

	@OriginalMember(owner = "client!vaa", name = "Fi", descriptor = "[Lclient!pg;")
	private final Class168_Sub2[] aClass168_Sub2Array1 = new Class168_Sub2[16];

	@OriginalMember(owner = "client!vaa", name = "Sg", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!vaa", name = "ti", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!vaa", name = "ii", descriptor = "I")
	private final int anInt10581 = 0;

	@OriginalMember(owner = "client!vaa", name = "zg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!vaa", name = "eh", descriptor = "Ljava/lang/String;")
	private final String aString125;

	@OriginalMember(owner = "client!vaa", name = "Lh", descriptor = "Ljava/lang/String;")
	private final String aString126;

	@OriginalMember(owner = "client!vaa", name = "ni", descriptor = "I")
	private final int anInt10583;

	@OriginalMember(owner = "client!vaa", name = "th", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!vaa", name = "ai", descriptor = "Z")
	private boolean aBoolean713;

	@OriginalMember(owner = "client!vaa", name = "ji", descriptor = "Z")
	private final boolean aBoolean716;

	@OriginalMember(owner = "client!vaa", name = "Wg", descriptor = "Z")
	public final boolean aBoolean712;

	@OriginalMember(owner = "client!vaa", name = "yh", descriptor = "Z")
	public final boolean aBoolean715;

	@OriginalMember(owner = "client!vaa", name = "xg", descriptor = "Z")
	public final boolean aBoolean717;

	@OriginalMember(owner = "client!vaa", name = "Di", descriptor = "[I")
	public final int[] anIntArray759;

	@OriginalMember(owner = "client!vaa", name = "Ei", descriptor = "I")
	public final int anInt10582;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!ik;I)V")
	public Class22_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class182 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString125 = OpenGL.glGetString(7936).toLowerCase();
			this.aString126 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString125.indexOf("microsoft") != -1 || this.aString125.indexOf("brian paul") != -1 || this.aString125.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(118) String local118 = OpenGL.glGetString(7938);
			@Pc(126) String[] local126 = Static104.method2099(local118.replace('.', ' '), ' ');
			if (local126.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(150) int local150;
			try {
				@Pc(144) int local144 = Static636.method8390(local126[0]);
				local150 = Static636.method8390(local126[1]);
				this.anInt10583 = local150 + local144 * 10;
			} catch (@Pc(159) NumberFormatException local159) {
				throw new RuntimeException("");
			}
			if (this.anInt10583 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(203) int[] local203 = new int[1];
				OpenGL.glGetIntegerv(34018, local203, 0);
				super.anInt10459 = local203[0];
				if (super.anInt10459 < 2) {
					throw new RuntimeException("");
				}
				super.anInt10491 = 8;
				this.aBoolean714 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean696 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean713 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean693 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean716 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean700 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean712 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean715 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean717 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray759 = new int[super.anInt10459];
				this.anInt10582 = Stream.c() ? 33639 : 5121;
				if (this.aString126.indexOf("radeon") != -1) {
					local150 = 0;
					@Pc(329) boolean local329 = false;
					@Pc(331) boolean local331 = false;
					@Pc(340) String[] local340 = Static104.method2099(this.aString126.replace('/', ' '), ' ');
					for (@Pc(342) int local342 = 0; local342 < local340.length; local342++) {
						@Pc(348) String local348 = local340[local342];
						try {
							if (local348.length() > 0) {
								if (local348.charAt(0) == 'x' && local348.length() >= 3 && Static473.method6432(local348.substring(1, 3))) {
									local331 = true;
									local348 = local348.substring(1);
								}
								if (local348.equals("hd")) {
									local329 = true;
								} else {
									if (local348.startsWith("hd")) {
										local348 = local348.substring(2);
										local329 = true;
									}
									if (local348.length() >= 4 && Static473.method6432(local348.substring(0, 4))) {
										local150 = Static636.method8390(local348.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(425) Exception local425) {
						}
					}
					if (!local331 && !local329) {
						if (local150 >= 7000 && local150 <= 7999) {
							this.aBoolean714 = false;
						}
						if (local150 >= 7000 && local150 <= 9250) {
							super.aBoolean700 = false;
						}
					}
					this.aBoolean713 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString125.indexOf("intel");
				if (this.aBoolean714) {
					try {
						@Pc(499) int[] local499 = new int[1];
						OpenGL.glGenBuffersARB(1, local499, 0);
					} catch (@Pc(505) Throwable local505) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(511) Throwable local511) {
			local511.printStackTrace();
			this.method9397();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!vaa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZILclient!vga;I)V")
	@Override
	protected void method8868(@OriginalArg(1) int arg0, @OriginalArg(2) Class392 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static397.method5360(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "()Z")
	@Override
	public boolean method9332() {
		return false;
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(III)V")
	public synchronized void method8984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub44 local16 = new Class3_Sub44(arg0);
		local16.aLong345 = (long) arg1;
		this.aClass342_86.method7654(local16);
	}

	@OriginalMember(owner = "client!vaa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!vaa", name = "l", descriptor = "(B)F")
	@Override
	protected float method8959() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZZILclient!vga;)V")
	@Override
	public void method8954(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class392 arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static397.method5360(arg3));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt10377 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt10582, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!lma;IIIILclient!kl;I)V")
	@Override
	public void method8861(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface11 arg5) {
		@Pc(22) byte local22;
		@Pc(20) int local20;
		if (Static35.aClass234_2 == arg0) {
			local20 = arg2 * 2;
			local22 = 1;
		} else if (Static346.aClass234_4 == arg0) {
			local22 = 3;
			local20 = arg2 + 1;
		} else if (Static492.aClass234_6 == arg0) {
			local22 = 4;
			local20 = arg2 * 3;
		} else if (Static339.aClass234_3 == arg0) {
			local22 = 6;
			local20 = arg2 + 2;
		} else if (Static32.aClass234_1 == arg0) {
			local22 = 5;
			local20 = arg2 + 2;
		} else {
			local20 = arg2;
			local22 = 0;
		}
		@Pc(84) Class167 local84 = arg5.method5368();
		@Pc(87) Class168_Sub1 local87 = (Class168_Sub1) arg5;
		local87.method6759();
		OpenGL.glDrawElements(local22, local20, Static619.method7938(local84), local87.method6763() + (long) (arg4 * local84.anInt3992));
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "()V")
	@Override
	public void method9396() {
	}

	@OriginalMember(owner = "client!vaa", name = "B", descriptor = "()V")
	@Override
	public void method9372() {
	}

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "(B)V")
	@Override
	protected void method8941() {
		if (super.aBoolean698 && super.aBoolean686 && super.anInt10480 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "(B)V")
	@Override
	protected void method8874() {
		@Pc(14) int local14 = this.anIntArray759[super.anInt10465];
		if (local14 != 0) {
			this.anIntArray759[super.anInt10465] = 0;
			OpenGL.glBindTexture(local14, 0);
			OpenGL.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(ZI)Lclient!kl;")
	@Override
	public Interface11 method8916(@OriginalArg(0) boolean arg0) {
		return new Class168_Sub1(this, Static259.aClass167_8, arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "l", descriptor = "()V")
	@Override
	public void method9345() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method9398(@OriginalArg(0) Interface25 arg0) {
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method8882(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(11) Long local11 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local11)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
	@Override
	protected Object method8890(@OriginalArg(0) Canvas arg0) {
		@Pc(15) long local15 = this.anOpenGL2.prepareSurface(arg0);
		if (local15 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local15);
	}

	@OriginalMember(owner = "client!vaa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt10581;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!hu;IILclient!sca;I)Lclient!pt;")
	@Override
	public Interface16 method8857(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class335 arg3) {
		if (this.aBoolean716 || Static88.method1890(arg1) && Static88.method1890(arg2)) {
			return new Class13_Sub2(this, arg3, arg0, arg1, arg2);
		} else if (this.aBoolean713) {
			return new Class13_Sub3(this, arg3, arg0, arg1, arg2);
		} else {
			return new Class13_Sub2(this, arg3, arg0, Static92.method1941(arg1), Static92.method1941(arg2));
		}
	}

	@OriginalMember(owner = "client!vaa", name = "o", descriptor = "()Z")
	@Override
	public boolean method9365() {
		return false;
	}

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "()V")
	@Override
	protected void method9339() {
		super.method9339();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "(I)V")
	@Override
	protected void method8975() {
		OpenGL.glScissor(super.anInt10488 + super.anInt10469, super.anInt10456 + (super.anInt10377 - super.anInt10472), -super.anInt10469 + super.anInt10460, super.anInt10472 - super.anInt10484);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!bj;)V")
	@Override
	public void method8883(@OriginalArg(1) Class37 arg0) {
		if (arg0 == Static586.aClass37_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(23) int local23 = Static133.method2365(arg0);
		OpenGL.glTexGeni(8192, 9472, local23);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local23);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local23);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(III)V")
	public synchronized void method8985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub44 local8 = new Class3_Sub44(arg0);
		local8.aLong345 = (long) arg1;
		this.aClass342_87.method7654(local8);
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(ZB)V")
	@Override
	public void method8933(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9393(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "(Z)V")
	@Override
	protected void method8974() {
		OpenGL.glTexEnvi(8960, 34161, Static720.method9526(super.aClass372Array6[super.anInt10465]));
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(IB)V")
	public synchronized void method8986(@OriginalArg(0) int arg0) {
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong345 = (long) arg0;
		this.aClass342_90.method7654(local15);
	}

	@OriginalMember(owner = "client!vaa", name = "H", descriptor = "(I)V")
	@Override
	protected void method8920() {
		if (super.aBoolean703 && !super.aBoolean688) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "t", descriptor = "(I)V")
	@Override
	protected void method8955() {
		this.aBoolean709 = false;
		this.method8988();
	}

	@OriginalMember(owner = "client!vaa", name = "db", descriptor = "(I)V")
	@Override
	protected void method8859() {
		OpenGL.glTexEnvi(8960, 34162, Static720.method9526(super.aClass372Array5[super.anInt10465]));
	}

	@OriginalMember(owner = "client!vaa", name = "C", descriptor = "(I)V")
	@Override
	protected void method8891() {
		OpenGL.glViewport(super.anInt10488, super.anInt10456, super.anInt10347, super.anInt10377);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!ih;Lclient!ih;FLclient!ih;)Lclient!ih;")
	@Override
	public Class113 method9334(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class113 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "z", descriptor = "()V")
	@Override
	public void method9389() {
		if (super.anInt10347 <= 0 && super.anInt10377 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt10469;
		@Pc(22) int local22 = super.anInt10460;
		@Pc(25) int local25 = super.anInt10484;
		@Pc(28) int local28 = super.anInt10472;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8892();
		this.method8898(false);
		this.method8927(false);
		this.method8862(false);
		this.method8902(false);
		this.method8976((Interface21) null);
		this.method8979(false, false, -2);
		this.method8853(1);
		this.method8978(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt10347, super.anInt10377, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "()Lclient!an;")
	@Override
	public Class19 method9364() {
		@Pc(7) int local7 = -1;
		if (this.aString125.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString125.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString125.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class19(local7, "OpenGL", this.anInt10583, this.aString126, 0L);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!sca;Lclient!hu;)Z")
	@Override
	public boolean method8895(@OriginalArg(1) Class335 arg0, @OriginalArg(2) Class167 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!lq;II)V")
	@Override
	public void method8912(@OriginalArg(0) Interface14 arg0, @OriginalArg(2) int arg1) {
		this.aClass168_Sub2Array1[arg1] = (Class168_Sub2) arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "P", descriptor = "(I)V")
	@Override
	protected void method8860() {
		Static289.aFloatArray30[1] = super.aFloat178 * super.aFloat182;
		Static289.aFloatArray30[3] = 1.0F;
		Static289.aFloatArray30[2] = super.aFloat182 * super.aFloat185;
		Static289.aFloatArray30[0] = super.aFloat186 * super.aFloat182;
		OpenGL.glLightModelfv(2899, Static289.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "cb", descriptor = "(I)V")
	@Override
	protected void method8961() {
		if (super.aBoolean705) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "(Z)V")
	@Override
	protected void method8915() {
		super.aFloat181 = (float) (super.anInt10478 - super.anInt10458);
		super.aFloat187 = (float) -super.anInt10480 + super.aFloat181;
		if (super.aFloat187 < (float) super.anInt10464) {
			super.aFloat187 = (float) super.anInt10464;
		}
		OpenGL.glFogf(2915, super.aFloat187);
		OpenGL.glFogf(2916, super.aFloat181);
		Static289.aFloatArray30[2] = (float) (super.anInt10487 & 0xFF) / 255.0F;
		Static289.aFloatArray30[1] = (float) (super.anInt10487 & 0xFF00) / 65280.0F;
		Static289.aFloatArray30[0] = (float) (super.anInt10487 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static289.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)Lclient!si;")
	@Override
	public Interface23 method9381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!si;Lclient!es;)Lclient!vv;")
	@Override
	public Interface25 method9359(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([[IIBZ)Lclient!c;")
	@Override
	public Interface1 method8881(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		return new Class13_Sub1(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "K", descriptor = "(I)V")
	@Override
	protected void method8983() {
		OpenGL.glActiveTexture(super.anInt10465 + 33984);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIBZ[FIILclient!sca;)Lclient!pt;")
	@Override
	protected Interface16 method8931(@OriginalArg(3) boolean arg0, @OriginalArg(4) float[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class335 arg4) {
		if (this.aBoolean716 || Static88.method1890(arg2) && Static88.method1890(arg3)) {
			return new Class13_Sub2(this, arg4, arg2, arg3, arg0, arg1, 0, 0);
		} else if (this.aBoolean713) {
			return new Class13_Sub3(this, arg4, arg2, arg3, arg1, 0, 0);
		} else {
			@Pc(66) Class13_Sub2 local66 = new Class13_Sub2(this, arg4, Static259.aClass167_11, Static92.method1941(arg2), Static92.method1941(arg3));
			local66.method1226(arg2, arg4, arg1, arg3);
			return local66;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method9394(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub44 local19;
		while (!this.aClass342_86.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_86.method7653();
			Static606.anIntArray663[local11++] = (int) local19.aLong345;
			super.anInt10452 -= local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static606.anIntArray663, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static606.anIntArray663, 0);
			local11 = 0;
		}
		while (!this.aClass342_87.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_87.method7653();
			Static606.anIntArray663[local11++] = (int) local19.aLong345;
			super.anInt10451 -= local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static606.anIntArray663, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static606.anIntArray663, 0);
			local11 = 0;
		}
		while (!this.aClass342_88.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_88.method7653();
			Static606.anIntArray663[local11++] = local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static606.anIntArray663, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static606.anIntArray663, 0);
			local11 = 0;
		}
		while (!this.aClass342_89.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_89.method7653();
			Static606.anIntArray663[local11++] = (int) local19.aLong345;
			super.anInt10450 -= local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static606.anIntArray663, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static606.anIntArray663, 0);
		}
		while (!this.aClass342_85.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_85.method7653();
			OpenGL.glDeleteLists((int) local19.aLong345, local19.anInt7298);
		}
		@Pc(223) Class3 local223;
		while (!this.aClass342_90.method7652()) {
			local223 = this.aClass342_90.method7653();
			OpenGL.glDeleteProgramARB((int) local223.aLong345);
		}
		while (!this.aClass342_91.method7652()) {
			local223 = this.aClass342_91.method7653();
			OpenGL.glDeleteObjectARB(local223.aLong345);
		}
		while (!this.aClass342_85.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_85.method7653();
			OpenGL.glDeleteLists((int) local19.aLong345, local19.anInt7298);
		}
		if (this.E() > 100663296 && Static517.method6965() > this.aLong325 + 60000L) {
			System.gc();
			this.aLong325 = Static517.method6965();
		}
		super.method9394(local9);
	}

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "(B)V")
	@Override
	protected void method8957() {
		if (Static302.aClass135_5 == super.aClass135_8) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static197.aClass135_6 == super.aClass135_8) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static77.aClass135_2 == super.aClass135_8) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(BZ)Lclient!lq;")
	@Override
	public Interface14 method8937(@OriginalArg(1) boolean arg0) {
		return new Class168_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[IIIZII)Lclient!pt;")
	@Override
	public Interface16 method8879(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean716 || Static88.method1890(arg5) && Static88.method1890(arg3)) {
			return new Class13_Sub2(this, arg5, arg3, arg4, arg1, 0, arg0);
		} else if (this.aBoolean713) {
			return new Class13_Sub3(this, arg5, arg3, arg1, 0, arg0);
		} else {
			@Pc(56) Class13_Sub2 local56 = new Class13_Sub2(this, Static646.aClass335_14, Static259.aClass167_7, Static92.method1941(arg5), Static92.method1941(arg3));
			local56.method8242(arg3, 0, arg5, arg1, 0, arg0);
			return local56;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "T", descriptor = "(I)V")
	@Override
	protected void method8901() {
		for (@Pc(6) int local6 = super.anInt10459 - 1; local6 >= 0; local6--) {
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
		@Pc(76) float[] local76 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(78) int local78 = 0; local78 < 8; local78++) {
			@Pc(88) int local88 = local78 + 16384;
			OpenGL.glLightfv(local88, 4608, local76, 0);
			OpenGL.glLightf(local88, 4615, 0.0F);
			OpenGL.glLightf(local88, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method8901();
	}

	@OriginalMember(owner = "client!vaa", name = "s", descriptor = "(I)V")
	@Override
	protected void method8856() {
		if (super.aBoolean689) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B[Lclient!ega;)Lclient!wh;")
	@Override
	public Class36 method8944(@OriginalArg(1) Class95[] arg0) {
		return new Class36_Sub1(arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9385(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method9391(arg2, arg3);
	}

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "(II)Lclient!es;")
	@Override
	public Interface8 method9383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(JB)V")
	public synchronized void method8987(@OriginalArg(0) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong345 = arg0;
		this.aClass342_91.method7654(local7);
	}

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "(B)V")
	@Override
	protected void method8906() {
		if (super.aBoolean694) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "z", descriptor = "(B)V")
	private void method8988() {
		if (this.aBoolean710) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass72_27.method1981()) {
			if (!this.aBoolean709) {
				OpenGL.glLoadMatrixf(super.aClass58_Sub2_18.method6092(Static684.aFloatArray81), 0);
				this.aBoolean709 = true;
				this.method8928();
				this.method8977();
			}
			if (super.aBoolean684) {
				this.aBoolean710 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass58_Sub2_15.method6092(Static684.aFloatArray81), 0);
				this.aBoolean710 = true;
			}
		} else if (super.aBoolean684) {
			OpenGL.glLoadIdentity();
			this.aBoolean710 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass58_Sub2_15.method6092(Static684.aFloatArray81), 0);
			this.aBoolean710 = false;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "x", descriptor = "(I)V")
	@Override
	protected void method8977() {
		this.method8905();
		@Pc(15) int local15;
		for (local15 = 0; super.anInt10477 > local15; local15++) {
			@Pc(22) Class3_Sub5 local22 = super.aClass3_Sub5Array5[local15];
			@Pc(26) int local26 = local22.method7172();
			@Pc(31) int local31 = local15 + 16386;
			@Pc(37) float local37 = local22.method7176() / 255.0F;
			Static289.aFloatArray30[0] = (float) local22.method7174();
			Static289.aFloatArray30[1] = (float) local22.method7175();
			Static289.aFloatArray30[2] = (float) local22.method7177();
			Static289.aFloatArray30[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static289.aFloatArray30, 0);
			Static289.aFloatArray30[3] = 1.0F;
			Static289.aFloatArray30[0] = local37 * (float) (local26 >> 16 & 0xFF);
			Static289.aFloatArray30[2] = local37 * (float) (local26 & 0xFF);
			Static289.aFloatArray30[1] = local37 * (float) (local26 >> 8 & 0xFF);
			OpenGL.glLightfv(local31, 4609, Static289.aFloatArray30, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local22.method7173() * local22.method7173()));
			OpenGL.glEnable(local31);
		}
		while (local15 < super.anInt10467) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		super.method8977();
	}

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "(II)Lclient!ag;")
	@Override
	protected Class10 method8960(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class10_Sub11(this, super.aClass182_122);
		} else if (arg0 == 4) {
			return new Class10_Sub8(this, super.aClass182_122, super.aClass172_7);
		} else if (arg0 == 8) {
			return new Class10_Sub1(this, super.aClass182_122, super.aClass172_7);
		} else {
			return super.method8960(arg0);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!hu;ILclient!sca;)Z")
	@Override
	public boolean method8953(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class335 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([BIZIIBILclient!sca;)Lclient!pt;")
	@Override
	protected Interface16 method8980(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(7) Class335 arg4) {
		if (this.aBoolean716 || Static88.method1890(arg3) && Static88.method1890(arg1)) {
			return new Class13_Sub2(this, arg4, arg3, arg1, arg2, arg0, 0, 0);
		} else if (this.aBoolean713) {
			return new Class13_Sub3(this, arg4, arg3, arg1, arg0, 0, 0);
		} else {
			@Pc(67) Class13_Sub2 local67 = new Class13_Sub2(this, arg4, Static259.aClass167_7, Static92.method1941(arg3), Static92.method1941(arg1));
			local67.method8243(0, arg1, arg4, arg0, arg3);
			return local67;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "(B)V")
	@Override
	public void method8928() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray72, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray76, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(Z)V")
	@Override
	protected void method8936() {
		this.method8988();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method8982(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "(II)V")
	@Override
	public void method8972(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!vaa", name = "t", descriptor = "(B)V")
	@Override
	protected void method8889() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray71, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "(I)V")
	@Override
	protected void method8929() {
		Static289.aFloatArray30[2] = (float) (super.anInt10468 & 0xFF) / 255.0F;
		Static289.aFloatArray30[0] = (float) (super.anInt10468 & 0xFF0000) / 1.671168E7F;
		Static289.aFloatArray30[1] = (float) (super.anInt10468 & 0xFF00) / 65280.0F;
		Static289.aFloatArray30[3] = (float) (super.anInt10468 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static289.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "w", descriptor = "(I)V")
	@Override
	protected void method8888() {
	}

	@OriginalMember(owner = "client!vaa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8902(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!vaa", name = "u", descriptor = "(B)V")
	@Override
	protected void method8880() {
		OpenGL.glDepthMask(super.aBoolean691 && super.aBoolean699);
	}

	@OriginalMember(owner = "client!vaa", name = "B", descriptor = "(I)V")
	@Override
	protected void method8858() {
		if (super.aBoolean704) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "(I)V")
	@Override
	protected void method8967() {
		if (super.aBoolean701) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method8910(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(11) Long local11 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local11);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([BLclient!sca;IBII)Lclient!rm;")
	@Override
	public Interface19 method8850(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class335 arg1) {
		return new Class13_Sub4(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "(B)V")
	@Override
	protected void method8876() {
		Static289.aFloatArray30[2] = super.aFloat185 * super.aFloat188;
		Static289.aFloatArray30[3] = 1.0F;
		Static289.aFloatArray30[0] = super.aFloat188 * super.aFloat186;
		Static289.aFloatArray30[1] = super.aFloat188 * super.aFloat178;
		OpenGL.glLightfv(16384, 4609, Static289.aFloatArray30, 0);
		Static289.aFloatArray30[1] = super.aFloat178 * -super.aFloat190;
		Static289.aFloatArray30[0] = -super.aFloat190 * super.aFloat186;
		Static289.aFloatArray30[2] = -super.aFloat190 * super.aFloat185;
		Static289.aFloatArray30[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static289.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!lma;ZI)V")
	@Override
	public void method8904(@OriginalArg(0) int arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(3) int arg2) {
		@Pc(32) byte local32;
		@Pc(30) int local30;
		if (Static35.aClass234_2 == arg1) {
			local30 = arg2 * 2;
			local32 = 1;
		} else if (arg1 == Static346.aClass234_4) {
			local32 = 3;
			local30 = arg2 + 1;
		} else if (arg1 == Static492.aClass234_6) {
			local30 = arg2 * 3;
			local32 = 4;
		} else if (Static339.aClass234_3 == arg1) {
			local32 = 6;
			local30 = arg2 + 2;
		} else if (arg1 == Static32.aClass234_1) {
			local32 = 5;
			local30 = arg2 + 2;
		} else {
			local32 = 0;
			local30 = arg2;
		}
		OpenGL.glDrawArrays(local32, arg0, local30);
	}

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "()V")
	@Override
	public void method9351() {
	}

	@OriginalMember(owner = "client!vaa", name = "A", descriptor = "(I)V")
	@Override
	protected void method8875() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass222Array3[super.anInt10465] == Static184.aClass222_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass58_Sub2Array3[super.anInt10465].method6092(Static684.aFloatArray81), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!wh;)V")
	@Override
	public void method8894(@OriginalArg(1) Class36 arg0) {
		@Pc(9) Class95[] local9 = ((Class36_Sub1) arg0).aClass95Array1;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local9.length; local27++) {
			@Pc(33) Class95 local33 = local9[local27];
			@Pc(38) Class168_Sub2 local38 = this.aClass168_Sub2Array1[local27];
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = local38.method6770();
			@Pc(48) long local48 = local38.method6763();
			local38.method6759();
			for (@Pc(53) int local53 = 0; local53 < local33.method2395(); local53++) {
				@Pc(60) Class278 local60 = local33.method2393(local53);
				if (Static469.aClass278_1 == local60) {
					local25 = true;
					OpenGL.glVertexPointer(3, 5126, local44, (long) local40 + local48);
				} else if (Static469.aClass278_2 == local60) {
					local23 = true;
					OpenGL.glNormalPointer(5126, local44, (long) local40 + local48);
				} else if (local60 == Static469.aClass278_3) {
					local21 = true;
					OpenGL.glColorPointer(4, 5121, local44, local48 + (long) local40);
				} else if (Static469.aClass278_4 == local60) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, local48 + (long) local40);
				} else if (Static469.aClass278_5 == local60) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static469.aClass278_6) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, (long) local40 + local48);
				} else if (local60 == Static469.aClass278_7) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, local48 + (long) local40);
				}
				local40 += local60.anInt7370;
			}
		}
		if (this.aBoolean711 != local25) {
			if (local25) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean711 = local25;
		}
		if (this.aBoolean708 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean708 = local23;
		}
		if (this.aBoolean707 != local21) {
			if (local21) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean707 = local21;
		}
		@Pc(299) int local299;
		if (local19 > this.anInt10580) {
			for (local299 = this.anInt10580; local299 < local19; local299++) {
				OpenGL.glClientActiveTexture(local299 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt10580 = local19;
		} else if (this.anInt10580 > local19) {
			for (local299 = local19; local299 < this.anInt10580; local299++) {
				OpenGL.glClientActiveTexture(local299 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt10580 = local19;
		}
	}
}
