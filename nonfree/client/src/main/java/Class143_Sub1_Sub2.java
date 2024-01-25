import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class143_Sub1_Sub2 extends Class143_Sub1 {

	@OriginalMember(owner = "client!og", name = "yi", descriptor = "Z")
	private boolean aBoolean537;

	@OriginalMember(owner = "client!og", name = "Ai", descriptor = "Z")
	private boolean aBoolean538;

	@OriginalMember(owner = "client!og", name = "Bi", descriptor = "Z")
	private boolean aBoolean539;

	@OriginalMember(owner = "client!og", name = "Ci", descriptor = "Z")
	private boolean aBoolean540;

	@OriginalMember(owner = "client!og", name = "Di", descriptor = "I")
	private int anInt7507;

	@OriginalMember(owner = "client!og", name = "Ei", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!og", name = "Fi", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!og", name = "dh", descriptor = "Lclient!ga;")
	private final Class124 aClass124_74 = new Class124();

	@OriginalMember(owner = "client!og", name = "ki", descriptor = "Lclient!ga;")
	private final Class124 aClass124_75 = new Class124();

	@OriginalMember(owner = "client!og", name = "si", descriptor = "Lclient!ga;")
	private final Class124 aClass124_76 = new Class124();

	@OriginalMember(owner = "client!og", name = "ui", descriptor = "Lclient!ga;")
	private final Class124 aClass124_77 = new Class124();

	@OriginalMember(owner = "client!og", name = "vi", descriptor = "Lclient!ga;")
	private final Class124 aClass124_78 = new Class124();

	@OriginalMember(owner = "client!og", name = "wi", descriptor = "Lclient!ga;")
	private final Class124 aClass124_79 = new Class124();

	@OriginalMember(owner = "client!og", name = "xi", descriptor = "Lclient!ga;")
	private final Class124 aClass124_80 = new Class124();

	@OriginalMember(owner = "client!og", name = "zi", descriptor = "[Lclient!hg;")
	private final Class57_Sub1[] aClass57_Sub1Array1 = new Class57_Sub1[16];

	@OriginalMember(owner = "client!og", name = "Gi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!og", name = "Hi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!og", name = "Qi", descriptor = "I")
	private final int anInt7509 = 0;

	@OriginalMember(owner = "client!og", name = "nh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!og", name = "Ji", descriptor = "Ljava/lang/String;")
	private final String aString70;

	@OriginalMember(owner = "client!og", name = "Pi", descriptor = "Ljava/lang/String;")
	private final String aString71;

	@OriginalMember(owner = "client!og", name = "Si", descriptor = "I")
	private final int anInt7510;

	@OriginalMember(owner = "client!og", name = "Oi", descriptor = "Z")
	public boolean aBoolean546;

	@OriginalMember(owner = "client!og", name = "Li", descriptor = "Z")
	private boolean aBoolean544;

	@OriginalMember(owner = "client!og", name = "Ti", descriptor = "Z")
	private final boolean aBoolean547;

	@OriginalMember(owner = "client!og", name = "Mi", descriptor = "Z")
	public final boolean aBoolean545;

	@OriginalMember(owner = "client!og", name = "Ii", descriptor = "Z")
	public final boolean aBoolean542;

	@OriginalMember(owner = "client!og", name = "Ki", descriptor = "Z")
	public final boolean aBoolean543;

	@OriginalMember(owner = "client!og", name = "Ri", descriptor = "[I")
	public final int[] anIntArray415;

	@OriginalMember(owner = "client!og", name = "Ni", descriptor = "I")
	public final int anInt7508;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!cb;I)V")
	public Class143_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) Class50 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString70 = OpenGL.glGetString(7936).toLowerCase();
			this.aString71 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString70.indexOf("microsoft") != -1 || this.aString70.indexOf("brian paul") != -1 || this.aString70.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(107) String local107 = OpenGL.glGetString(7938);
			@Pc(115) String[] local115 = Static466.method6897(' ', local107.replace('.', ' '));
			if (local115.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(133) int local133;
			try {
				@Pc(127) int local127 = Static171.method2534(local115[0]);
				local133 = Static171.method2534(local115[1]);
				this.anInt7510 = local127 * 10 + local133;
			} catch (@Pc(143) NumberFormatException local143) {
				throw new RuntimeException("");
			}
			if (this.anInt7510 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(187) int[] local187 = new int[1];
				OpenGL.glGetIntegerv(34018, local187, 0);
				super.anInt7405 = local187[0];
				if (super.anInt7405 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7391 = 8;
				this.aBoolean546 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean518 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean544 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean534 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean547 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean530 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean545 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean542 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean543 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray415 = new int[super.anInt7405];
				this.anInt7508 = Stream.a() ? 33639 : 5121;
				if (this.aString71.indexOf("radeon") != -1) {
					local133 = 0;
					@Pc(292) boolean local292 = false;
					@Pc(294) boolean local294 = false;
					@Pc(303) String[] local303 = Static466.method6897(' ', this.aString71.replace('/', ' '));
					for (@Pc(305) int local305 = 0; local305 < local303.length; local305++) {
						@Pc(310) String local310 = local303[local305];
						try {
							if (local310.length() > 0) {
								if (local310.charAt(0) == 'x' && local310.length() >= 3 && Static648.method8534(local310.substring(1, 3))) {
									local294 = true;
									local310 = local310.substring(1);
								}
								if (local310.equals("hd")) {
									local292 = true;
								} else {
									if (local310.startsWith("hd")) {
										local310 = local310.substring(2);
										local292 = true;
									}
									if (local310.length() >= 4 && Static648.method8534(local310.substring(0, 4))) {
										local133 = Static171.method2534(local310.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(376) Exception local376) {
						}
					}
					if (!local294 && !local292) {
						if (local133 >= 7000 && local133 <= 9250) {
							super.aBoolean530 = false;
						}
						if (local133 >= 7000 && local133 <= 7999) {
							this.aBoolean546 = false;
						}
					}
					this.aBoolean544 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString70.indexOf("intel");
				if (this.aBoolean546) {
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
			this.method6225();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!og", name = "D", descriptor = "(B)V")
	@Override
	protected void method6389() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass270Array3[super.anInt7412] == Static76.aClass270_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass56_Sub2Array3[super.anInt7412].method6832(Static661.aFloatArray81), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!bw;)V")
	@Override
	public void method6333(@OriginalArg(1) Class48 arg0) {
		@Pc(9) Class284[] local9 = ((Class48_Sub1) arg0).aClass284Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(31) Class284 local31 = local9[local19];
			@Pc(36) Class57_Sub1 local36 = this.aClass57_Sub1Array1[local19];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method3125();
			@Pc(46) long local46 = local36.method7648();
			local36.method7652();
			for (@Pc(51) int local51 = 0; local31.method6963() > local51; local51++) {
				@Pc(58) Class137 local58 = local31.method6964(local51);
				if (local58 == Static199.aClass137_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static199.aClass137_2) {
					local15 = true;
					OpenGL.glNormalPointer(5126, local42, local46 + (long) local38);
				} else if (local58 == Static199.aClass137_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local42, local46 + (long) local38);
				} else if (Static199.aClass137_4 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, (long) local38 + local46);
				} else if (local58 == Static199.aClass137_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local46 + (long) local38);
				} else if (Static199.aClass137_6 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static199.aClass137_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, local46 + (long) local38);
				}
				local38 += local58.anInt3219;
			}
		}
		if (local17 != this.aBoolean538) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean538 = local17;
		}
		if (local15 != this.aBoolean539) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean539 = local15;
		}
		if (local13 != this.aBoolean540) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean540 = local13;
		}
		@Pc(264) int local264;
		if (local11 > this.anInt7507) {
			for (local264 = this.anInt7507; local264 < local11; local264++) {
				OpenGL.glClientActiveTexture(local264 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt7507 = local11;
		} else if (local11 < this.anInt7507) {
			for (local264 = local11; local264 < this.anInt7507; local264++) {
				OpenGL.glClientActiveTexture(local264 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt7507 = local11;
		}
	}

	@OriginalMember(owner = "client!og", name = "p", descriptor = "()V")
	@Override
	protected void method6223() {
		super.method6223();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "E", descriptor = "(B)V")
	@Override
	protected void method6392() {
		OpenGL.glActiveTexture(super.anInt7412 + 33984);
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "()V")
	@Override
	public void method6221() {
		if (super.anInt7221 <= 0 && super.anInt7257 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt7406;
		@Pc(19) int local19 = super.anInt7381;
		@Pc(22) int local22 = super.anInt7393;
		@Pc(25) int local25 = super.anInt7395;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6355();
		this.method6380(false);
		this.method6288(false);
		this.method6362(false);
		this.method6405(false);
		this.method6338((Interface4) null);
		this.method6312(false, false, -2);
		this.method6322(1);
		this.method6321(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7221, super.anInt7257, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!ofa;Lclient!kn;)Z")
	@Override
	public boolean method6304(@OriginalArg(1) Class255 arg0, @OriginalArg(2) Class206 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method6376(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method6403(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL2.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!si;ILclient!mq;IIII)V")
	@Override
	public void method6367(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static409.aClass323_3 == arg0) {
			local12 = arg5 * 2;
			local14 = 1;
		} else if (Static149.aClass323_1 == arg0) {
			local12 = arg5 + 1;
			local14 = 3;
		} else if (arg0 == Static536.aClass323_4) {
			local12 = arg5 * 3;
			local14 = 4;
		} else if (arg0 == Static672.aClass323_6) {
			local12 = arg5 + 2;
			local14 = 6;
		} else if (arg0 == Static228.aClass323_2) {
			local12 = arg5 + 2;
			local14 = 5;
		} else {
			local14 = 0;
			local12 = arg5;
		}
		@Pc(68) Class206 local68 = arg2.method7865();
		@Pc(79) Class57_Sub2 local79 = (Class57_Sub2) arg2;
		local79.method7652();
		OpenGL.glDrawElements(local14, local12, Static198.method2807(local68), local79.method7648() + (long) (arg3 * local68.anInt5575));
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([[IZII)Lclient!bv;")
	@Override
	public Interface1 method6300(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		return new Class153_Sub1(this, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!kn;Lclient!ofa;I)Z")
	@Override
	public boolean method6363(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class255 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "()V")
	@Override
	public void method6220() {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BILclient!fka;)V")
	@Override
	public void method6325(@OriginalArg(1) int arg0, @OriginalArg(2) Interface6 arg1) {
		this.aClass57_Sub1Array1[arg0] = (Class57_Sub1) arg1;
	}

	@OriginalMember(owner = "client!og", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7257 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt7508, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6238(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6196(arg2, arg3);
	}

	@OriginalMember(owner = "client!og", name = "L", descriptor = "(I)V")
	@Override
	protected void method6375() {
		if (super.aBoolean520) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!og", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLclient!eca;ZB)V")
	@Override
	public void method6291(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static618.method8286(arg2));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!og", name = "N", descriptor = "(I)V")
	@Override
	protected void method6379() {
		if (super.aBoolean522) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZI[IIII)Lclient!kt;")
	@Override
	public Interface12 method6275(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean547 || Static384.method5636(arg4) && Static384.method5636(arg0)) {
			return new Class153_Sub4(this, arg4, arg0, arg1, arg2, 0, arg5);
		} else if (this.aBoolean544) {
			return new Class153_Sub2(this, arg4, arg0, arg2, 0, arg5);
		} else {
			@Pc(46) Class153_Sub4 local46 = new Class153_Sub4(this, Static92.aClass255_3, Static314.aClass206_12, Static209.method2991(arg4), Static209.method2991(arg0));
			local46.method7451(arg4, arg5, 0, arg0, 0, arg2);
			return local46;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public synchronized void method6407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class5_Sub43 local20 = new Class5_Sub43(arg0);
		local20.aLong329 = (long) arg1;
		this.aClass124_76.method2574(local20);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!cp;)V")
	@Override
	public void method6250(@OriginalArg(0) Interface2 arg0) {
	}

	@OriginalMember(owner = "client!og", name = "q", descriptor = "(I)V")
	@Override
	protected void method6296() {
		Static373.aFloatArray44[2] = super.aFloat142 * super.aFloat143;
		Static373.aFloatArray44[0] = super.aFloat142 * super.aFloat141;
		Static373.aFloatArray44[1] = super.aFloat129 * super.aFloat142;
		Static373.aFloatArray44[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static373.aFloatArray44, 0);
		Static373.aFloatArray44[0] = -super.aFloat135 * super.aFloat141;
		Static373.aFloatArray44[1] = super.aFloat129 * -super.aFloat135;
		Static373.aFloatArray44[3] = 1.0F;
		Static373.aFloatArray44[2] = -super.aFloat135 * super.aFloat143;
		OpenGL.glLightfv(16385, 4609, Static373.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ofa;ILclient!kn;II)Lclient!kt;")
	@Override
	public Interface12 method6360(@OriginalArg(0) Class255 arg0, @OriginalArg(2) Class206 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean547 || Static384.method5636(arg2) && Static384.method5636(arg3)) {
			return new Class153_Sub4(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean544) {
			return new Class153_Sub2(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class153_Sub4(this, arg0, arg1, Static209.method2991(arg2), Static209.method2991(arg3));
		}
	}

	@OriginalMember(owner = "client!og", name = "x", descriptor = "(I)F")
	@Override
	protected float method6319() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZB)Lclient!mq;")
	@Override
	public Interface16 method6279(@OriginalArg(0) boolean arg0) {
		return new Class57_Sub2(this, Static314.aClass206_13, arg0);
	}

	@OriginalMember(owner = "client!og", name = "F", descriptor = "(B)V")
	@Override
	protected void method6404() {
		if (Static414.aClass31_7 == super.aClass31_8) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass31_8 == Static566.aClass31_9) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass31_8 == Static336.aClass31_6) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(II)Lclient!nea;")
	@Override
	public Interface17 method6262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([BILclient!ofa;III)Lclient!po;")
	@Override
	public Interface21 method6359(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class255 arg1) {
		return new Class153_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!si;II)V")
	@Override
	public void method6381(@OriginalArg(1) Class323 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static409.aClass323_3 == arg0) {
			local10 = 1;
			local14 = arg1 * 2;
		} else if (Static149.aClass323_1 == arg0) {
			local10 = 3;
			local14 = arg1 + 1;
		} else if (Static536.aClass323_4 == arg0) {
			local14 = arg1 * 3;
			local10 = 4;
		} else if (Static672.aClass323_6 == arg0) {
			local14 = arg1 + 2;
			local10 = 6;
		} else if (Static228.aClass323_2 == arg0) {
			local10 = 5;
			local14 = arg1 + 2;
		} else {
			local14 = arg1;
			local10 = 0;
		}
		OpenGL.glDrawArrays(local10, arg2, local14);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method6239(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class5_Sub43 local19;
		while (!this.aClass124_75.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_75.method2571();
			Static60.anIntArray59[local11++] = (int) local19.aLong329;
			super.anInt7363 -= local19.anInt7821;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static60.anIntArray59, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static60.anIntArray59, 0);
			local11 = 0;
		}
		while (!this.aClass124_76.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_76.method2571();
			Static60.anIntArray59[local11++] = (int) local19.aLong329;
			super.anInt7368 -= local19.anInt7821;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static60.anIntArray59, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static60.anIntArray59, 0);
			local11 = 0;
		}
		while (!this.aClass124_77.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_77.method2571();
			Static60.anIntArray59[local11++] = local19.anInt7821;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static60.anIntArray59, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static60.anIntArray59, 0);
			local11 = 0;
		}
		while (!this.aClass124_78.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_78.method2571();
			Static60.anIntArray59[local11++] = (int) local19.aLong329;
			super.anInt7370 -= local19.anInt7821;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static60.anIntArray59, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static60.anIntArray59, 0);
		}
		while (!this.aClass124_74.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_74.method2571();
			OpenGL.glDeleteLists((int) local19.aLong329, local19.anInt7821);
		}
		@Pc(213) Class5 local213;
		while (!this.aClass124_79.method2577()) {
			local213 = this.aClass124_79.method2571();
			OpenGL.glDeleteProgramARB((int) local213.aLong329);
		}
		while (!this.aClass124_80.method2577()) {
			local213 = this.aClass124_80.method2571();
			OpenGL.glDeleteObjectARB(local213.aLong329);
		}
		while (!this.aClass124_74.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_74.method2571();
			OpenGL.glDeleteLists((int) local19.aLong329, local19.anInt7821);
		}
		if (this.E() > 100663296 && this.aLong222 + 60000L < Static124.method1947()) {
			System.gc();
			this.aLong222 = Static124.method1947();
		}
		super.method6239(local9);
	}

	@OriginalMember(owner = "client!og", name = "y", descriptor = "(I)V")
	@Override
	protected void method6324() {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	@Override
	public void method6185() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!ofa;[BIIZI)Lclient!kt;")
	@Override
	protected Interface12 method6317(@OriginalArg(0) int arg0, @OriginalArg(2) Class255 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean547 || Static384.method5636(arg4) && Static384.method5636(arg0)) {
			return new Class153_Sub4(this, arg1, arg4, arg0, arg3, arg2, 0, 0);
		} else if (this.aBoolean544) {
			return new Class153_Sub2(this, arg1, arg4, arg0, arg2, 0, 0);
		} else {
			@Pc(35) Class153_Sub4 local35 = new Class153_Sub4(this, arg1, Static314.aClass206_12, Static209.method2991(arg4), Static209.method2991(arg0));
			local35.method7452(0, arg0, arg1, arg2, arg4);
			return local35;
		}
	}

	@OriginalMember(owner = "client!og", name = "F", descriptor = "(I)V")
	@Override
	protected void method6351() {
		this.aBoolean541 = false;
		this.method6413();
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(II)Lclient!bea;")
	@Override
	protected Class14 method6289(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class14_Sub6(this, super.aClass50_120);
		} else if (arg0 == 4) {
			return new Class14_Sub3(this, super.aClass50_120, super.aClass224_5);
		} else if (arg0 == 8) {
			return new Class14_Sub8(this, super.aClass50_120, super.aClass224_5);
		} else {
			return super.method6289(arg0);
		}
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "(I)V")
	@Override
	protected void method6286() {
		Static373.aFloatArray44[3] = (float) (super.anInt7402 >>> 24) / 255.0F;
		Static373.aFloatArray44[2] = (float) (super.anInt7402 & 0xFF) / 255.0F;
		Static373.aFloatArray44[1] = (float) (super.anInt7402 & 0xFF00) / 65280.0F;
		Static373.aFloatArray44[0] = (float) (super.anInt7402 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static373.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!og", name = "z", descriptor = "(I)V")
	@Override
	public void method6326() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray55, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray56, 0);
	}

	@OriginalMember(owner = "client!og", name = "r", descriptor = "()Z")
	@Override
	public boolean method6227() {
		return false;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(BZ)V")
	@Override
	public void method6323(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[Lclient!qe;)Lclient!bw;")
	@Override
	public Class48 method6320(@OriginalArg(1) Class284[] arg0) {
		return new Class48_Sub1(arg0);
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6388() {
		this.method6313();
		@Pc(15) int local15;
		for (local15 = 0; super.anInt7414 > local15; local15++) {
			@Pc(22) Class5_Sub3 local22 = super.aClass5_Sub3Array4[local15];
			@Pc(26) int local26 = local22.method8322();
			@Pc(31) int local31 = local15 + 16386;
			@Pc(37) float local37 = local22.method8314() / 255.0F;
			Static373.aFloatArray44[0] = (float) local22.method8317();
			Static373.aFloatArray44[1] = (float) local22.method8313();
			Static373.aFloatArray44[2] = (float) local22.method8323();
			Static373.aFloatArray44[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static373.aFloatArray44, 0);
			Static373.aFloatArray44[1] = (float) (local26 >> 8 & 0xFF) * local37;
			Static373.aFloatArray44[0] = (float) (local26 >> 16 & 0xFF) * local37;
			Static373.aFloatArray44[3] = 1.0F;
			Static373.aFloatArray44[2] = (float) (local26 & 0xFF) * local37;
			OpenGL.glLightfv(local31, 4609, Static373.aFloatArray44, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local22.method8319() * local22.method8319()));
			OpenGL.glEnable(local31);
		}
		while (local15 < super.anInt7415) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		super.method6388();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JI)V")
	public synchronized void method6409(@OriginalArg(0) long arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong329 = arg0;
		this.aClass124_80.method2574(local7);
	}

	@OriginalMember(owner = "client!og", name = "q", descriptor = "()Z")
	@Override
	public boolean method6224() {
		return false;
	}

	@OriginalMember(owner = "client!og", name = "r", descriptor = "(I)V")
	@Override
	protected void method6305() {
		@Pc(9) int local9 = this.anIntArray415[super.anInt7412];
		if (local9 != 0) {
			this.anIntArray415[super.anInt7412] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(II)V")
	public synchronized void method6410(@OriginalArg(0) int arg0) {
		@Pc(15) Class5 local15 = new Class5();
		local15.aLong329 = (long) arg0;
		this.aClass124_79.method2574(local15);
	}

	@OriginalMember(owner = "client!og", name = "A", descriptor = "(I)V")
	@Override
	protected void method6329() {
		OpenGL.glTexEnvi(8960, 34161, Static654.method8344(super.aClass6Array5[super.anInt7412]));
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(Z)V")
	@Override
	protected void method6285() {
		super.aFloat134 = (float) (super.anInt7385 - super.anInt7390);
		super.aFloat130 = (float) -super.anInt7407 + super.aFloat134;
		if (super.aFloat130 < (float) super.anInt7413) {
			super.aFloat130 = (float) super.anInt7413;
		}
		OpenGL.glFogf(2915, super.aFloat130);
		OpenGL.glFogf(2916, super.aFloat134);
		Static373.aFloatArray44[0] = (float) (super.anInt7399 & 0xFF0000) / 1.671168E7F;
		Static373.aFloatArray44[1] = (float) (super.anInt7399 & 0xFF00) / 65280.0F;
		Static373.aFloatArray44[2] = (float) (super.anInt7399 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static373.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(B)V")
	@Override
	protected void method6334() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray57, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6397(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	@Override
	protected void method6273() {
		OpenGL.glTexEnvi(8960, 34162, Static654.method8344(super.aClass6Array6[super.anInt7412]));
	}

	@OriginalMember(owner = "client!og", name = "p", descriptor = "(B)V")
	@Override
	protected void method6337() {
		if (super.aBoolean536) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6358() {
		if (super.aBoolean531 && !super.aBoolean525) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!nea;Lclient!vu;)Lclient!cp;")
	@Override
	public Interface2 method6228(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Interface27 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IZ)Lclient!fka;")
	@Override
	public Interface6 method6373(@OriginalArg(1) boolean arg0) {
		return new Class57_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
	public synchronized void method6412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg1);
		local8.aLong329 = (long) arg0;
		this.aClass124_75.method2574(local8);
	}

	@OriginalMember(owner = "client!og", name = "D", descriptor = "(I)V")
	@Override
	protected void method6346() {
		for (@Pc(10) int local10 = super.anInt7405 - 1; local10 >= 0; local10--) {
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
		@Pc(80) float[] local80 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(82) int local82 = 0; local82 < 8; local82++) {
			@Pc(89) int local89 = local82 + 16384;
			OpenGL.glLightfv(local89, 4608, local80, 0);
			OpenGL.glLightf(local89, 4615, 0.0F);
			OpenGL.glLightf(local89, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method6346();
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6382() {
		if (super.aBoolean526 && super.aBoolean516 && super.anInt7407 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(I)V")
	@Override
	protected void method6283() {
		Static373.aFloatArray44[3] = 1.0F;
		Static373.aFloatArray44[2] = super.aFloat136 * super.aFloat143;
		Static373.aFloatArray44[1] = super.aFloat136 * super.aFloat129;
		Static373.aFloatArray44[0] = super.aFloat141 * super.aFloat136;
		OpenGL.glLightModelfv(2899, Static373.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	@Override
	public void method6303(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ag;Lclient!ag;FLclient!ag;)Lclient!ag;")
	@Override
	public Class11 method6267(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class11 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!og", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6405(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!pg;)V")
	@Override
	public void method6299(@OriginalArg(1) Class271 arg0) {
		if (arg0 == Static305.aClass271_15) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(13) int local13 = Static581.method7951(arg0);
		OpenGL.glTexGeni(8192, 9472, local13);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local13);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local13);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
	@Override
	public void method6197(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(Z)V")
	private void method6413() {
		if (this.aBoolean537) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass310_7.method7319()) {
			if (!this.aBoolean541) {
				OpenGL.glLoadMatrixf(super.aClass56_Sub2_18.method6832(Static661.aFloatArray81), 0);
				this.aBoolean541 = true;
				this.method6326();
				this.method6388();
			}
			if (super.aBoolean515) {
				this.aBoolean537 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass56_Sub2_15.method6832(Static661.aFloatArray81), 0);
				this.aBoolean537 = true;
			}
		} else if (super.aBoolean515) {
			OpenGL.glLoadIdentity();
			this.aBoolean537 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass56_Sub2_15.method6832(Static661.aFloatArray81), 0);
			this.aBoolean537 = false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	@Override
	public void method6196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)Lclient!vu;")
	@Override
	public Interface27 method6219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6188(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!og", name = "x", descriptor = "()Lclient!rda;")
	@Override
	public Class300 method6248() {
		@Pc(7) int local7 = -1;
		if (this.aString70.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString70.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString70.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class300(local7, "OpenGL", this.anInt7510, this.aString71, 0L);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "()V")
	@Override
	public void method6189() {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!ofa;ZII[FI)Lclient!kt;")
	@Override
	protected Interface12 method6309(@OriginalArg(2) Class255 arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float[] arg4) {
		if (this.aBoolean547 || Static384.method5636(arg3) && Static384.method5636(arg2)) {
			return new Class153_Sub4(this, arg0, arg3, arg2, arg1, arg4, 0, 0);
		} else if (this.aBoolean544) {
			return new Class153_Sub2(this, arg0, arg3, arg2, arg4, 0, 0);
		} else {
			@Pc(46) Class153_Sub4 local46 = new Class153_Sub4(this, arg0, Static314.aClass206_16, Static209.method2991(arg3), Static209.method2991(arg2));
			local46.method7458(arg2, arg4, arg0, arg3);
			return local46;
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(B)V")
	@Override
	protected void method6295() {
		if (super.aBoolean528) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!og", name = "J", descriptor = "(I)V")
	@Override
	protected void method6368() {
		if (super.aBoolean535) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!og", name = "A", descriptor = "(B)V")
	@Override
	protected void method6378() {
		this.method6413();
	}

	@OriginalMember(owner = "client!og", name = "B", descriptor = "(B)V")
	@Override
	protected void method6385() {
		OpenGL.glViewport(super.anInt7404, super.anInt7383, super.anInt7221, super.anInt7257);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZLclient!eca;)V")
	@Override
	protected void method6332(@OriginalArg(1) int arg0, @OriginalArg(3) Class90 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static618.method8286(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!og", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt7509;
	}

	@OriginalMember(owner = "client!og", name = "P", descriptor = "(I)V")
	@Override
	protected void method6390() {
		OpenGL.glScissor(super.anInt7406 + super.anInt7404, -super.anInt7395 + super.anInt7257 + super.anInt7383, super.anInt7381 - super.anInt7406, -super.anInt7393 + super.anInt7395);
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "()V")
	@Override
	public void method6198() {
	}

	@OriginalMember(owner = "client!og", name = "w", descriptor = "(I)V")
	@Override
	protected void method6315() {
		OpenGL.glDepthMask(super.aBoolean517 && super.aBoolean524);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6366(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local10);
	}

	@OriginalMember(owner = "client!og", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
