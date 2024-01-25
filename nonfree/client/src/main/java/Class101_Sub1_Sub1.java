import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class101_Sub1_Sub1 extends Class101_Sub1 {

	@OriginalMember(owner = "client!fc", name = "vi", descriptor = "I")
	private int anInt3367;

	@OriginalMember(owner = "client!fc", name = "wi", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!fc", name = "xi", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!fc", name = "yi", descriptor = "Z")
	private boolean aBoolean245;

	@OriginalMember(owner = "client!fc", name = "zi", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!fc", name = "Ai", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!fc", name = "Bi", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!fc", name = "ai", descriptor = "Lclient!ow;")
	private final Class271 aClass271_14 = new Class271();

	@OriginalMember(owner = "client!fc", name = "mi", descriptor = "Lclient!ow;")
	private final Class271 aClass271_15 = new Class271();

	@OriginalMember(owner = "client!fc", name = "pi", descriptor = "Lclient!ow;")
	private final Class271 aClass271_16 = new Class271();

	@OriginalMember(owner = "client!fc", name = "qi", descriptor = "Lclient!ow;")
	private final Class271 aClass271_17 = new Class271();

	@OriginalMember(owner = "client!fc", name = "ri", descriptor = "Lclient!ow;")
	private final Class271 aClass271_18 = new Class271();

	@OriginalMember(owner = "client!fc", name = "si", descriptor = "Lclient!ow;")
	private final Class271 aClass271_19 = new Class271();

	@OriginalMember(owner = "client!fc", name = "ti", descriptor = "Lclient!ow;")
	private final Class271 aClass271_20 = new Class271();

	@OriginalMember(owner = "client!fc", name = "Ci", descriptor = "[Lclient!uha;")
	private final Class237_Sub2[] aClass237_Sub2Array1 = new Class237_Sub2[16];

	@OriginalMember(owner = "client!fc", name = "ui", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!fc", name = "Di", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!fc", name = "Pi", descriptor = "I")
	private final int anInt3370 = 0;

	@OriginalMember(owner = "client!fc", name = "Sh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!fc", name = "Hi", descriptor = "Ljava/lang/String;")
	private final String aString37;

	@OriginalMember(owner = "client!fc", name = "Mi", descriptor = "Ljava/lang/String;")
	private final String aString38;

	@OriginalMember(owner = "client!fc", name = "Ni", descriptor = "I")
	private final int anInt3369;

	@OriginalMember(owner = "client!fc", name = "Ii", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!fc", name = "Gi", descriptor = "Z")
	private boolean aBoolean250;

	@OriginalMember(owner = "client!fc", name = "Li", descriptor = "Z")
	private final boolean aBoolean252;

	@OriginalMember(owner = "client!fc", name = "Fi", descriptor = "Z")
	public final boolean aBoolean249;

	@OriginalMember(owner = "client!fc", name = "Ei", descriptor = "Z")
	public final boolean aBoolean248;

	@OriginalMember(owner = "client!fc", name = "Oi", descriptor = "Z")
	public final boolean aBoolean253;

	@OriginalMember(owner = "client!fc", name = "Ki", descriptor = "[I")
	public final int[] anIntArray163;

	@OriginalMember(owner = "client!fc", name = "Ji", descriptor = "I")
	public final int anInt3368;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!gga;I)V")
	public Class101_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) Class124 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString37 = OpenGL.glGetString(7936).toLowerCase();
			this.aString38 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString37.indexOf("microsoft") != -1 || this.aString37.indexOf("brian paul") != -1 || this.aString37.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(110) String local110 = OpenGL.glGetString(7938);
			@Pc(118) String[] local118 = Static184.method3569(' ', local110.replace('.', ' '));
			if (local118.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(136) int local136;
			try {
				@Pc(130) int local130 = Static77.method1385(local118[0]);
				local136 = Static77.method1385(local118[1]);
				this.anInt3369 = local130 * 10 + local136;
			} catch (@Pc(145) NumberFormatException local145) {
				throw new RuntimeException("");
			}
			if (this.anInt3369 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(187) int[] local187 = new int[1];
				OpenGL.glGetIntegerv(34018, local187, 0);
				super.anInt6618 = local187[0];
				if (super.anInt6618 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6651 = 8;
				this.aBoolean251 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean495 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean250 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean487 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean252 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean486 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean249 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean248 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean253 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray163 = new int[super.anInt6618];
				this.anInt3368 = Stream.c() ? 33639 : 5121;
				if (this.aString38.indexOf("radeon") != -1) {
					local136 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static184.method3569(' ', this.aString38.replace('/', ' '));
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(309) String local309 = local301[local303];
						try {
							if (local309.length() > 0) {
								if (local309.charAt(0) == 'x' && local309.length() >= 3 && Static664.method9705(local309.substring(1, 3))) {
									local292 = true;
									local309 = local309.substring(1);
								}
								if (local309.equals("hd")) {
									local290 = true;
								} else {
									if (local309.startsWith("hd")) {
										local290 = true;
										local309 = local309.substring(2);
									}
									if (local309.length() >= 4 && Static664.method9705(local309.substring(0, 4))) {
										local136 = Static77.method1385(local309.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(379) Exception local379) {
						}
					}
					if (!local292 && !local290) {
						if (local136 >= 7000 && local136 <= 9250) {
							super.aBoolean486 = false;
						}
						if (local136 >= 7000 && local136 <= 7999) {
							this.aBoolean251 = false;
						}
					}
					this.aBoolean250 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString37.indexOf("intel");
				if (this.aBoolean251) {
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
			this.method8148();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(II)Lclient!jk;")
	@Override
	public Interface8 method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "(I)V")
	@Override
	protected void method5860() {
		if (super.aBoolean488) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ[BIILclient!nea;I)Lclient!lba;")
	@Override
	protected Interface10 method5847(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class244 arg4) {
		if (this.aBoolean252 || Static100.method1457(arg0) && Static100.method1457(arg3)) {
			return new Class107_Sub4(this, arg4, arg0, arg3, arg1, arg2, 0, 0);
		} else if (this.aBoolean250) {
			return new Class107_Sub2(this, arg4, arg0, arg3, arg2, 0, 0);
		} else {
			@Pc(49) Class107_Sub4 local49 = new Class107_Sub4(this, arg4, Static114.aClass79_7, Static432.method7064(arg0), Static432.method7064(arg3));
			local49.method9106(arg4, arg2, 0, arg0, arg3);
			return local49;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(IB)V")
	@Override
	public void method5867(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!nea;I[BI)Lclient!oq;")
	@Override
	public Interface13 method5834(@OriginalArg(2) Class244 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class107_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "()V")
	@Override
	protected void method8124() {
		super.method8124();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)Lclient!wba;")
	@Override
	public Interface25 method5856(@OriginalArg(0) boolean arg0) {
		return new Class237_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "(I)V")
	@Override
	public void method5843() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray47, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "(B)V")
	@Override
	protected void method5948() {
		OpenGL.glActiveTexture(super.anInt6625 + 33984);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!vr;Lclient!vr;FLclient!vr;)Lclient!vr;")
	@Override
	public Class3 method8071(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "()V")
	@Override
	public void method8125() {
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(B)V")
	@Override
	protected void method5892() {
		if (super.aBoolean481 && !super.bf) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5931() {
		@Pc(9) int local9 = this.anIntArray163[super.anInt6625];
		if (local9 != 0) {
			this.anIntArray163[super.anInt6625] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)V")
	@Override
	protected void method5870() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass327Array3[super.anInt6625] == Static401.aClass327_3) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass76_Sub2Array3[super.anInt6625].method7347(Static510.aFloatArray57), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "()Lclient!ev;")
	@Override
	public Class99 method8090() {
		@Pc(7) int local7 = -1;
		if (this.aString37.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString37.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString37.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class99(local7, "OpenGL", this.anInt3369, this.aString38, 0L);
	}

	@OriginalMember(owner = "client!fc", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6599 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt3368, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "(I)V")
	@Override
	protected void method5849() {
		super.aFloat149 = (float) (-super.anInt6638 + super.anInt6648);
		super.aFloat158 = (float) -super.anInt6650 + super.aFloat149;
		if ((float) super.anInt6637 > super.aFloat158) {
			super.aFloat158 = (float) super.anInt6637;
		}
		OpenGL.glFogf(2915, super.aFloat158);
		OpenGL.glFogf(2916, super.aFloat149);
		Static295.aFloatArray30[1] = (float) (super.anInt6649 & 0xFF00) / 65280.0F;
		Static295.aFloatArray30[2] = (float) (super.anInt6649 & 0xFF) / 255.0F;
		Static295.aFloatArray30[0] = (float) (super.anInt6649 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static295.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fc", name = "jb", descriptor = "(I)V")
	private void method3141() {
		if (this.aBoolean247) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass227_7.method6167()) {
			if (!this.aBoolean246) {
				OpenGL.glLoadMatrixf(super.aClass76_Sub2_18.method7347(Static510.aFloatArray57), 0);
				this.aBoolean246 = true;
				this.method5843();
				this.method5926();
			}
			if (super.aBoolean479) {
				this.aBoolean247 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass76_Sub2_15.method7347(Static510.aFloatArray57), 0);
				this.aBoolean247 = true;
			}
		} else if (super.aBoolean479) {
			OpenGL.glLoadIdentity();
			this.aBoolean247 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass76_Sub2_15.method7347(Static510.aFloatArray57), 0);
			this.aBoolean247 = false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5934(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(11) Long local11 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local11);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
	@Override
	public void method8072() {
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	@Override
	protected void method5841() {
		if (super.aBoolean491) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "()V")
	@Override
	public void method8107() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "(B)V")
	@Override
	protected void method5930() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray46, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(IZ)V")
	public synchronized void method3142(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong313 = (long) arg0;
		this.aClass271_19.method7174(local7);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(IZ)V")
	@Override
	public void method5907(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!nea;Lclient!dr;)Z")
	@Override
	public boolean method5850(@OriginalArg(1) Class244 arg0, @OriginalArg(2) Class79 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "(I)V")
	@Override
	protected void method5943() {
		this.method3141();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZLclient!gca;B)V")
	@Override
	protected void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) Class118 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static625.method9289(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()Z")
	@Override
	public boolean method8070() {
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)V")
	public synchronized void method3143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub14 local8 = new Class2_Sub14(arg0);
		local8.aLong313 = (long) arg1;
		this.aClass271_16.method7174(local8);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method8108(@OriginalArg(0) Interface17 arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!rl;II)V")
	@Override
	public void method5853(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) int arg2) {
		@Pc(20) byte local20;
		@Pc(18) int local18;
		if (arg1 == Static605.aClass320_5) {
			local18 = arg2 * 2;
			local20 = 1;
		} else if (Static310.aClass320_4 == arg1) {
			local20 = 3;
			local18 = arg2 + 1;
		} else if (arg1 == Static627.aClass320_6) {
			local18 = arg2 * 3;
			local20 = 4;
		} else if (Static70.aClass320_1 == arg1) {
			local18 = arg2 + 2;
			local20 = 6;
		} else if (arg1 == Static120.aClass320_3) {
			local18 = arg2 + 2;
			local20 = 5;
		} else {
			local18 = arg2;
			local20 = 0;
		}
		OpenGL.glDrawArrays(local20, arg0, local18);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILclient!wba;)V")
	@Override
	public void method5953(@OriginalArg(1) int arg0, @OriginalArg(2) Interface25 arg1) {
		this.aClass237_Sub2Array1[arg0] = (Class237_Sub2) arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lclient!pfa;)Lclient!ija;")
	@Override
	public Class167 method5871(@OriginalArg(1) Class280[] arg0) {
		return new Class167_Sub1(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt3370;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!up;B)V")
	@Override
	public void method5889(@OriginalArg(0) Class362 arg0) {
		if (Static267.aClass362_171 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(17) int local17 = Static405.method6680(arg0);
		OpenGL.glTexGeni(8192, 9472, local17);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local17);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local17);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8118(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub14 local19;
		while (!this.aClass271_15.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_15.method7172();
			Static440.anIntArray401[local7++] = (int) local19.aLong313;
			super.anInt6611 -= local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static440.anIntArray401, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static440.anIntArray401, 0);
			local7 = 0;
		}
		while (!this.aClass271_16.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_16.method7172();
			Static440.anIntArray401[local7++] = (int) local19.aLong313;
			super.anInt6614 -= local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static440.anIntArray401, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static440.anIntArray401, 0);
			local7 = 0;
		}
		while (!this.aClass271_17.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_17.method7172();
			Static440.anIntArray401[local7++] = local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static440.anIntArray401, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static440.anIntArray401, 0);
			local7 = 0;
		}
		while (!this.aClass271_18.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_18.method7172();
			Static440.anIntArray401[local7++] = (int) local19.aLong313;
			super.anInt6612 -= local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static440.anIntArray401, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static440.anIntArray401, 0);
		}
		while (!this.aClass271_14.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_14.method7172();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt1303);
		}
		@Pc(216) Class2 local216;
		while (!this.aClass271_19.method7169()) {
			local216 = this.aClass271_19.method7172();
			OpenGL.glDeleteProgramARB((int) local216.aLong313);
		}
		while (!this.aClass271_20.method7169()) {
			local216 = this.aClass271_20.method7172();
			OpenGL.glDeleteObjectARB(local216.aLong313);
		}
		while (!this.aClass271_14.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_14.method7172();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt1303);
		}
		if (this.E() > 100663296 && Static99.method1701() > this.aLong88 + 60000L) {
			System.gc();
			this.aLong88 = Static99.method1701();
		}
		super.method8118(local11);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method5875(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!nea;[FIZIB)Lclient!lba;")
	@Override
	protected Interface10 method5877(@OriginalArg(1) int arg0, @OriginalArg(2) Class244 arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (this.aBoolean252 || Static100.method1457(arg3) && Static100.method1457(arg0)) {
			return new Class107_Sub4(this, arg1, arg3, arg0, arg4, arg2, 0, 0);
		} else if (this.aBoolean250) {
			return new Class107_Sub2(this, arg1, arg3, arg0, arg2, 0, 0);
		} else {
			@Pc(58) Class107_Sub4 local58 = new Class107_Sub4(this, arg1, Static114.aClass79_11, Static432.method7064(arg3), Static432.method7064(arg0));
			local58.method9110(arg2, arg3, arg0, arg1);
			return local58;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZZLclient!gca;I)V")
	@Override
	public void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class118 arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static625.method9289(arg3));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(II)Lclient!sba;")
	@Override
	protected Class13 method5831(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class13_Sub4(this, super.aClass124_74);
		} else if (arg0 == 4) {
			return new Class13_Sub2(this, super.aClass124_74, super.aClass242_7);
		} else if (arg0 == 8) {
			return new Class13_Sub1(this, super.aClass124_74, super.aClass242_7);
		} else {
			return super.method5831(arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "(I)V")
	@Override
	protected void method5914() {
		OpenGL.glViewport(super.anInt6647, super.anInt6636, super.anInt6608, super.anInt6599);
	}

	@OriginalMember(owner = "client!fc", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5864(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLclient!nea;Lclient!dr;I)Lclient!lba;")
	@Override
	public Interface10 method5848(@OriginalArg(0) int arg0, @OriginalArg(2) Class244 arg1, @OriginalArg(3) Class79 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean252 || Static100.method1457(arg3) && Static100.method1457(arg0)) {
			return new Class107_Sub4(this, arg1, arg2, arg3, arg0);
		} else if (this.aBoolean250) {
			return new Class107_Sub2(this, arg1, arg2, arg3, arg0);
		} else {
			return new Class107_Sub4(this, arg1, arg2, Static432.method7064(arg3), Static432.method7064(arg0));
		}
	}

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "()V")
	@Override
	public void method8147() {
		if (super.anInt6608 <= 0 && super.anInt6599 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt6644;
		@Pc(16) int local16 = super.anInt6629;
		@Pc(19) int local19 = super.anInt6652;
		@Pc(22) int local22 = super.anInt6646;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5842();
		this.method5921(false);
		this.method5836(false);
		this.method5837(false);
		this.method5864(false);
		this.method5909((Interface5) null);
		this.method5873(-2, false, false);
		this.method5840(1);
		this.method5963(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6608, super.anInt6599, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!fc", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(Z)V")
	@Override
	protected void method5929() {
		if (super.aBoolean490) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "(I)V")
	@Override
	protected void method5883() {
		OpenGL.glTexEnvi(8960, 34162, Static280.method4715(super.aClass381Array6[super.anInt6625]));
	}

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "(I)V")
	@Override
	protected void method5872() {
		for (@Pc(10) int local10 = super.anInt6618 - 1; local10 >= 0; local10--) {
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
		super.method5872();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ija;I)V")
	@Override
	public void method5938(@OriginalArg(0) Class167 arg0) {
		@Pc(9) Class280[] local9 = ((Class167_Sub1) arg0).aClass280Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(23) int local23 = 0; local23 < local9.length; local23++) {
			@Pc(29) Class280 local29 = local9[local23];
			@Pc(34) Class237_Sub2 local34 = this.aClass237_Sub2Array1[local23];
			@Pc(36) int local36 = 0;
			@Pc(40) int local40 = local34.method9047();
			@Pc(44) long local44 = local34.method9035();
			local34.method9038();
			for (@Pc(49) int local49 = 0; local29.method7302() > local49; local49++) {
				@Pc(56) Class354 local56 = local29.method7303(local49);
				if (local56 == Static591.aClass354_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static591.aClass354_2) {
					OpenGL.glNormalPointer(5126, local40, local44 + (long) local36);
					local15 = true;
				} else if (local56 == Static591.aClass354_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local40, (long) local36 + local44);
				} else if (local56 == Static591.aClass354_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local40, (long) local36 + local44);
				} else if (Static591.aClass354_5 == local56) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static591.aClass354_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local40, local44 + (long) local36);
				} else if (local56 == Static591.aClass354_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local40, (long) local36 + local44);
				}
				local36 += local56.anInt10300;
			}
		}
		if (local17 != this.aBoolean244) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean244 = local17;
		}
		if (local15 != this.aBoolean245) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean245 = local15;
		}
		if (local13 != this.aBoolean243) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean243 = local13;
		}
		@Pc(257) int local257;
		if (local11 > this.anInt3367) {
			for (local257 = this.anInt3367; local257 < local11; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt3367 = local11;
		} else if (local11 < this.anInt3367) {
			for (local257 = local11; local257 < this.anInt3367; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt3367 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	public synchronized void method3144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub14 local8 = new Class2_Sub14(arg0);
		local8.aLong313 = (long) arg1;
		this.aClass271_15.method7174(local8);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIIIIZ)Lclient!lba;")
	@Override
	public Interface10 method5916(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (this.aBoolean252 || Static100.method1457(arg3) && Static100.method1457(arg2)) {
			return new Class107_Sub4(this, arg3, arg2, arg5, arg0, 0, arg1);
		} else if (this.aBoolean250) {
			return new Class107_Sub2(this, arg3, arg2, arg0, 0, arg1);
		} else {
			@Pc(45) Class107_Sub4 local45 = new Class107_Sub4(this, Static584.aClass244_9, Static114.aClass79_7, Static432.method7064(arg3), Static432.method7064(arg2));
			local45.method9108(arg1, 0, arg0, arg2, arg3, 0);
			return local45;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!vv;Lclient!rl;III)V")
	@Override
	public void method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static605.aClass320_5 == arg3) {
			local10 = 1;
			local14 = arg5 * 2;
		} else if (arg3 == Static310.aClass320_4) {
			local14 = arg5 + 1;
			local10 = 3;
		} else if (arg3 == Static627.aClass320_6) {
			local14 = arg5 * 3;
			local10 = 4;
		} else if (Static70.aClass320_1 == arg3) {
			local10 = 6;
			local14 = arg5 + 2;
		} else if (arg3 == Static120.aClass320_3) {
			local10 = 5;
			local14 = arg5 + 2;
		} else {
			local14 = arg5;
			local10 = 0;
		}
		@Pc(68) Class79 local68 = arg2.method6461();
		@Pc(71) Class237_Sub1 local71 = (Class237_Sub1) arg2;
		local71.method9038();
		OpenGL.glDrawElements(local10, local14, Static139.method2439(local68), local71.method9035() + (long) (arg4 * local68.anInt2048));
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method5888(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local12);
	}

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "(I)V")
	@Override
	protected void method5910() {
		Static295.aFloatArray30[3] = (float) (super.anInt6653 >>> 24) / 255.0F;
		Static295.aFloatArray30[0] = (float) (super.anInt6653 & 0xFF0000) / 1.671168E7F;
		Static295.aFloatArray30[1] = (float) (super.anInt6653 & 0xFF00) / 65280.0F;
		Static295.aFloatArray30[2] = (float) (super.anInt6653 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static295.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5844() {
		OpenGL.glScissor(super.anInt6644 + super.anInt6647, -super.anInt6646 + super.anInt6599 + super.anInt6636, super.anInt6629 - super.anInt6644, -super.anInt6652 + super.anInt6646);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
	@Override
	protected void method5863() {
		Static295.aFloatArray30[0] = super.aFloat150 * super.aFloat157;
		Static295.aFloatArray30[3] = 1.0F;
		Static295.aFloatArray30[2] = super.aFloat152 * super.aFloat150;
		Static295.aFloatArray30[1] = super.aFloat153 * super.aFloat150;
		OpenGL.glLightModelfv(2899, Static295.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "(I)V")
	@Override
	protected void method5869() {
		if (super.aBoolean499) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "()V")
	@Override
	public void method8116() {
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "(B)V")
	@Override
	protected void method5926() {
		this.method5895();
		@Pc(15) int local15;
		for (local15 = 0; local15 < super.anInt6643; local15++) {
			@Pc(22) Class2_Sub13 local22 = super.aClass2_Sub13Array5[local15];
			@Pc(26) int local26 = local22.method9405();
			@Pc(30) int local30 = local15 + 16386;
			@Pc(36) float local36 = local22.method9404() / 255.0F;
			Static295.aFloatArray30[0] = (float) local22.method9411();
			Static295.aFloatArray30[1] = (float) local22.method9410();
			Static295.aFloatArray30[2] = (float) local22.method9406();
			Static295.aFloatArray30[3] = 1.0F;
			OpenGL.glLightfv(local30, 4611, Static295.aFloatArray30, 0);
			Static295.aFloatArray30[2] = local36 * (float) (local26 & 0xFF);
			Static295.aFloatArray30[0] = (float) (local26 >> 16 & 0xFF) * local36;
			Static295.aFloatArray30[3] = 1.0F;
			Static295.aFloatArray30[1] = local36 * (float) (local26 >> 8 & 0xFF);
			OpenGL.glLightfv(local30, 4609, Static295.aFloatArray30, 0);
			OpenGL.glLightf(local30, 4617, 1.0F / (float) (local22.method9407() * local22.method9407()));
			OpenGL.glEnable(local30);
		}
		while (super.anInt6631 > local15) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		super.method5926();
	}

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "(I)V")
	@Override
	protected void method5865() {
		Static295.aFloatArray30[0] = super.aFloat151 * super.aFloat157;
		Static295.aFloatArray30[3] = 1.0F;
		Static295.aFloatArray30[2] = super.aFloat151 * super.aFloat152;
		Static295.aFloatArray30[1] = super.aFloat153 * super.aFloat151;
		OpenGL.glLightfv(16384, 4609, Static295.aFloatArray30, 0);
		Static295.aFloatArray30[2] = -super.aFloat156 * super.aFloat152;
		Static295.aFloatArray30[3] = 1.0F;
		Static295.aFloatArray30[1] = -super.aFloat156 * super.aFloat153;
		Static295.aFloatArray30[0] = -super.aFloat156 * super.aFloat157;
		OpenGL.glLightfv(16385, 4609, Static295.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!nea;Lclient!dr;I)Z")
	@Override
	public boolean method5876(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class79 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Lclient!lf;")
	@Override
	public Interface11 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8143(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8081(arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "(I)F")
	@Override
	protected float method5913() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "(I)V")
	@Override
	protected void method5912() {
		if (super.aClass220_7 == Static537.aClass220_9) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass220_7 == Static470.aClass220_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass220_7 == Static497.aClass220_8) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!fc", name = "hb", descriptor = "(I)V")
	@Override
	protected void method5961() {
		if (super.aBoolean480) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fc", name = "cb", descriptor = "(I)V")
	@Override
	protected void method5945() {
		if (super.aBoolean492 && super.aBoolean497 && super.anInt6650 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "(I)V")
	@Override
	protected void method5896() {
		OpenGL.glTexEnvi(8960, 34161, Static280.method4715(super.aClass381Array5[super.anInt6625]));
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	@Override
	protected void method5838() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!lf;Lclient!jk;)Lclient!rs;")
	@Override
	public Interface17 method8131(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "(I)V")
	@Override
	protected void method5857() {
		OpenGL.glDepthMask(super.aBoolean484 && super.aBoolean493);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method5915(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local10)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(IZ)Lclient!vv;")
	@Override
	public Interface24 method5941(@OriginalArg(1) boolean arg0) {
		return new Class237_Sub1(this, Static114.aClass79_8, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z[[IIZ)Lclient!wf;")
	@Override
	public Interface26 method5880(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2) {
		return new Class107_Sub1(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	@Override
	public void method8093(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V")
	public synchronized void method3146(@OriginalArg(1) long arg0) {
		@Pc(15) Class2 local15 = new Class2();
		local15.aLong313 = arg0;
		this.aClass271_20.method7174(local15);
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(Z)V")
	@Override
	protected void method5854() {
		this.aBoolean246 = false;
		this.method3141();
	}
}
