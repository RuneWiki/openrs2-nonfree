import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class13_Sub1_Sub1 extends Class13_Sub1 {

	@OriginalMember(owner = "client!pa", name = "zi", descriptor = "Z")
	private boolean aBoolean539;

	@OriginalMember(owner = "client!pa", name = "Ai", descriptor = "Z")
	private boolean aBoolean540;

	@OriginalMember(owner = "client!pa", name = "Bi", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!pa", name = "Ci", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!pa", name = "Ei", descriptor = "I")
	private int anInt7380;

	@OriginalMember(owner = "client!pa", name = "Fi", descriptor = "Z")
	private boolean aBoolean542;

	@OriginalMember(owner = "client!pa", name = "Hi", descriptor = "Z")
	private boolean aBoolean543;

	@OriginalMember(owner = "client!pa", name = "Yg", descriptor = "Lclient!tm;")
	private final Class338 aClass338_175 = new Class338();

	@OriginalMember(owner = "client!pa", name = "Wh", descriptor = "Lclient!tm;")
	private final Class338 aClass338_176 = new Class338();

	@OriginalMember(owner = "client!pa", name = "ni", descriptor = "Lclient!tm;")
	private final Class338 aClass338_177 = new Class338();

	@OriginalMember(owner = "client!pa", name = "vi", descriptor = "Lclient!tm;")
	private final Class338 aClass338_178 = new Class338();

	@OriginalMember(owner = "client!pa", name = "wi", descriptor = "Lclient!tm;")
	private final Class338 aClass338_179 = new Class338();

	@OriginalMember(owner = "client!pa", name = "xi", descriptor = "Lclient!tm;")
	private final Class338 aClass338_180 = new Class338();

	@OriginalMember(owner = "client!pa", name = "yi", descriptor = "Lclient!tm;")
	private final Class338 aClass338_181 = new Class338();

	@OriginalMember(owner = "client!pa", name = "Di", descriptor = "[Lclient!uw;")
	private final Class2_Sub2[] aClass2_Sub2Array1 = new Class2_Sub2[16];

	@OriginalMember(owner = "client!pa", name = "Gi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!pa", name = "Ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!pa", name = "Ti", descriptor = "I")
	private final int anInt7383 = 0;

	@OriginalMember(owner = "client!pa", name = "Sh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!pa", name = "Ji", descriptor = "Ljava/lang/String;")
	private final String aString76;

	@OriginalMember(owner = "client!pa", name = "Ri", descriptor = "Ljava/lang/String;")
	private final String aString77;

	@OriginalMember(owner = "client!pa", name = "Ki", descriptor = "I")
	private final int anInt7381;

	@OriginalMember(owner = "client!pa", name = "Li", descriptor = "Z")
	public boolean aBoolean544;

	@OriginalMember(owner = "client!pa", name = "Ui", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!pa", name = "Si", descriptor = "Z")
	private final boolean aBoolean548;

	@OriginalMember(owner = "client!pa", name = "Mi", descriptor = "Z")
	public final boolean aBoolean545;

	@OriginalMember(owner = "client!pa", name = "Ni", descriptor = "Z")
	public final boolean aBoolean546;

	@OriginalMember(owner = "client!pa", name = "Qi", descriptor = "Z")
	public final boolean aBoolean547;

	@OriginalMember(owner = "client!pa", name = "Pi", descriptor = "[I")
	public final int[] anIntArray633;

	@OriginalMember(owner = "client!pa", name = "Oi", descriptor = "I")
	public final int anInt7382;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!aj;I)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString76 = OpenGL.glGetString(7936).toLowerCase();
			this.aString77 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString76.indexOf("microsoft") != -1 || this.aString76.indexOf("brian paul") != -1 || this.aString76.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static644.method8957(local109.replace('.', ' '), ' ');
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(140) int local140;
			try {
				@Pc(134) int local134 = Static63.method1308(local117[0]);
				local140 = Static63.method1308(local117[1]);
				this.anInt7381 = local140 + local134 * 10;
			} catch (@Pc(149) NumberFormatException local149) {
				throw new RuntimeException("");
			}
			if (this.anInt7381 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(188) int[] local188 = new int[1];
				OpenGL.glGetIntegerv(34018, local188, 0);
				super.anInt8620 = local188[0];
				if (super.anInt8620 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8612 = 8;
				this.aBoolean544 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean666 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean549 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean654 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean548 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean660 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean545 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean546 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean547 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray633 = new int[super.anInt8620];
				this.anInt7382 = Stream.c() ? 33639 : 5121;
				if (this.aString77.indexOf("radeon") != -1) {
					local140 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static644.method8957(this.aString77.replace('/', ' '), ' ');
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(309) String local309 = local301[local303];
						try {
							if (local309.length() > 0) {
								if (local309.charAt(0) == 'x' && local309.length() >= 3 && Static409.method5813(local309.substring(1, 3))) {
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
									if (local309.length() >= 4 && Static409.method5813(local309.substring(0, 4))) {
										local140 = Static63.method1308(local309.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(374) Exception local374) {
						}
					}
					if (!local292 && !local290) {
						if (local140 >= 7000 && local140 <= 9250) {
							super.aBoolean660 = false;
						}
						if (local140 >= 7000 && local140 <= 7999) {
							this.aBoolean544 = false;
						}
					}
					this.aBoolean549 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString76.indexOf("intel");
				if (this.aBoolean544) {
					try {
						@Pc(422) int[] local422 = new int[1];
						OpenGL.glGenBuffersARB(1, local422, 0);
					} catch (@Pc(428) Throwable local428) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(434) Throwable local434) {
			local434.printStackTrace();
			this.method8459();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "(B)V")
	@Override
	protected void method7468() {
		if (Static581.aClass99_7 == super.aClass99_8) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static583.aClass99_9 == super.aClass99_8) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass99_8 == Static356.aClass99_2) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "()V")
	@Override
	public void method8530() {
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)Lclient!tq;")
	@Override
	public Interface25 method8509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)Lclient!oh;")
	@Override
	public Interface20 method7435(@OriginalArg(1) boolean arg0) {
		return new Class2_Sub1(this, Static246.aClass152_11, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7430(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZI[[I)Lclient!fn;")
	@Override
	public Interface10 method7513(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class93_Sub3(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "(B)V")
	@Override
	protected void method7471() {
		if (super.aBoolean649 && super.aBoolean655 && super.anInt8627 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!nc;B)V")
	@Override
	public void method7472(@OriginalArg(0) Class233 arg0) {
		@Pc(9) Class298[] local9 = ((Class233_Sub1) arg0).aClass298Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(24) int local24 = 0; local24 < local9.length; local24++) {
			@Pc(30) Class298 local30 = local9[local24];
			@Pc(35) Class2_Sub2 local35 = this.aClass2_Sub2Array1[local24];
			@Pc(37) int local37 = 0;
			@Pc(41) int local41 = local35.method8750();
			@Pc(45) long local45 = local35.method8743();
			local35.method8735();
			for (@Pc(52) int local52 = 0; local52 < local30.method7235(); local52++) {
				@Pc(59) Class124 local59 = local30.method7230(local52);
				if (Static205.aClass124_1 == local59) {
					OpenGL.glVertexPointer(3, 5126, local41, local45 + (long) local37);
					local17 = true;
				} else if (local59 == Static205.aClass124_2) {
					OpenGL.glNormalPointer(5126, local41, local45 + (long) local37);
					local15 = true;
				} else if (local59 == Static205.aClass124_3) {
					OpenGL.glColorPointer(4, 5121, local41, (long) local37 + local45);
					local13 = true;
				} else if (Static205.aClass124_4 == local59) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local41, (long) local37 + local45);
				} else if (Static205.aClass124_5 == local59) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local41, (long) local37 + local45);
				} else if (local59 == Static205.aClass124_6) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local41, local45 + (long) local37);
				} else if (Static205.aClass124_7 == local59) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local41, local45 + (long) local37);
				}
				local37 += local59.anInt3996;
			}
		}
		if (this.aBoolean541 != local17) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean541 = local17;
		}
		if (local15 != this.aBoolean543) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean543 = local15;
		}
		if (this.aBoolean542 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean542 = local13;
		}
		@Pc(257) int local257;
		if (local11 > this.anInt7380) {
			for (local257 = this.anInt7380; local257 < local11; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt7380 = local11;
		} else if (local11 < this.anInt7380) {
			for (local257 = local11; local257 < this.anInt7380; local257++) {
				OpenGL.glClientActiveTexture(local257 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt7380 = local11;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
	public synchronized void method6529(@OriginalArg(0) int arg0) {
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong311 = (long) arg0;
		this.aClass338_180.method8171(local15);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!sw;II[BIII)Lclient!ec;")
	@Override
	protected Interface7 method7418(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean548 || Static129.method2437(arg4) && Static129.method2437(arg2)) {
			return new Class93_Sub1(this, arg1, arg4, arg2, arg0, arg3, 0, 0);
		} else if (this.aBoolean549) {
			return new Class93_Sub2(this, arg1, arg4, arg2, arg3, 0, 0);
		} else {
			@Pc(38) Class93_Sub1 local38 = new Class93_Sub1(this, arg1, Static246.aClass152_10, Static282.method4521(arg4), Static282.method4521(arg2));
			local38.method5807(arg1, arg4, arg3, 0, arg2);
			return local38;
		}
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "(II)Lclient!aba;")
	@Override
	protected Class4 method7540(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class4_Sub9(this, super.aClass15_132);
		} else if (arg0 == 4) {
			return new Class4_Sub5(this, super.aClass15_132, super.aClass202_6);
		} else if (arg0 == 8) {
			return new Class4_Sub2(this, super.aClass15_132, super.aClass202_6);
		} else {
			return super.method7540(arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "(I)V")
	@Override
	protected void method7428() {
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "(I)V")
	@Override
	protected void method7415() {
		if (super.aBoolean651) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "(B)V")
	@Override
	protected void method7494() {
		Static401.aFloatArray43[3] = 1.0F;
		Static401.aFloatArray43[0] = super.aFloat183 * super.aFloat176;
		Static401.aFloatArray43[2] = super.aFloat183 * super.aFloat181;
		Static401.aFloatArray43[1] = super.aFloat187 * super.aFloat183;
		OpenGL.glLightfv(16384, 4609, Static401.aFloatArray43, 0);
		Static401.aFloatArray43[1] = super.aFloat187 * -super.aFloat179;
		Static401.aFloatArray43[2] = super.aFloat181 * -super.aFloat179;
		Static401.aFloatArray43[0] = -super.aFloat179 * super.aFloat176;
		Static401.aFloatArray43[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static401.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lclient!rd;B)Lclient!nc;")
	@Override
	public Class233 method7427(@OriginalArg(0) Class298[] arg0) {
		return new Class233_Sub1(arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[IIIZII)Lclient!ec;")
	@Override
	public Interface7 method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean548 || Static129.method2437(arg2) && Static129.method2437(arg5)) {
			return new Class93_Sub1(this, arg2, arg5, arg4, arg1, 0, arg0);
		} else if (this.aBoolean549) {
			return new Class93_Sub2(this, arg2, arg5, arg1, 0, arg0);
		} else {
			@Pc(47) Class93_Sub1 local47 = new Class93_Sub1(this, Static419.aClass327_2, Static246.aClass152_10, Static282.method4521(arg2), Static282.method4521(arg5));
			local47.method5801(0, arg2, arg1, arg0, arg5, 0);
			return local47;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)V")
	@Override
	public void method8484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!wt;IIB)V")
	@Override
	public void method7449(@OriginalArg(0) Class393 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) byte local13;
		@Pc(17) int local17;
		if (arg0 == Static318.aClass393_2) {
			local13 = 1;
			local17 = arg1 * 2;
		} else if (arg0 == Static406.aClass393_3) {
			local13 = 3;
			local17 = arg1 + 1;
		} else if (Static413.aClass393_4 == arg0) {
			local17 = arg1 * 3;
			local13 = 4;
		} else if (Static668.aClass393_6 == arg0) {
			local13 = 6;
			local17 = arg1 + 2;
		} else if (Static492.aClass393_5 == arg0) {
			local17 = arg1 + 2;
			local13 = 5;
		} else {
			local13 = 0;
			local17 = arg1;
		}
		OpenGL.glDrawArrays(local13, arg2, local17);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method7488(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "(I)V")
	@Override
	protected void method7441() {
		this.aBoolean539 = false;
		this.method6536();
	}

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "(I)F")
	@Override
	protected float method7458() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "(I)V")
	@Override
	protected void method7450() {
		if (super.aBoolean668) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "(I)V")
	@Override
	public void method7490() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray72, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray70, 0);
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8516(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub33 local19;
		while (!this.aClass338_176.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_176.method8169();
			Static469.anIntArray655[local7++] = (int) local19.aLong311;
			super.anInt8591 -= local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static469.anIntArray655, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static469.anIntArray655, 0);
			local7 = 0;
		}
		while (!this.aClass338_177.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_177.method8169();
			Static469.anIntArray655[local7++] = (int) local19.aLong311;
			super.anInt8588 -= local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static469.anIntArray655, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static469.anIntArray655, 0);
			local7 = 0;
		}
		while (!this.aClass338_178.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_178.method8169();
			Static469.anIntArray655[local7++] = local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static469.anIntArray655, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static469.anIntArray655, 0);
			local7 = 0;
		}
		while (!this.aClass338_179.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_179.method8169();
			Static469.anIntArray655[local7++] = (int) local19.aLong311;
			super.anInt8587 -= local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static469.anIntArray655, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static469.anIntArray655, 0);
		}
		while (!this.aClass338_175.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_175.method8169();
			OpenGL.glDeleteLists((int) local19.aLong311, local19.anInt4831);
		}
		@Pc(212) Class3 local212;
		while (!this.aClass338_180.method8166()) {
			local212 = this.aClass338_180.method8169();
			OpenGL.glDeleteProgramARB((int) local212.aLong311);
		}
		while (!this.aClass338_181.method8166()) {
			local212 = this.aClass338_181.method8169();
			OpenGL.glDeleteObjectARB(local212.aLong311);
		}
		while (!this.aClass338_175.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_175.method8169();
			OpenGL.glDeleteLists((int) local19.aLong311, local19.anInt4831);
		}
		if (this.E() > 100663296 && this.aLong228 + 60000L < Static524.method7320()) {
			System.gc();
			this.aLong228 = Static524.method7320();
		}
		super.method8516(local11);
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(IZ)Lclient!id;")
	@Override
	public Interface15 method7541(@OriginalArg(1) boolean arg0) {
		return new Class2_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)V")
	@Override
	protected void method7433() {
		this.method7459();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt8633 > local10; local10++) {
			@Pc(17) Class3_Sub15 local17 = super.aClass3_Sub15Array5[local10];
			@Pc(21) int local21 = local17.method8377();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method8381() / 255.0F;
			Static401.aFloatArray43[0] = (float) local17.method8384();
			Static401.aFloatArray43[1] = (float) local17.method8380();
			Static401.aFloatArray43[2] = (float) local17.method8383();
			Static401.aFloatArray43[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static401.aFloatArray43, 0);
			Static401.aFloatArray43[0] = (float) (local21 >> 16 & 0xFF) * local31;
			Static401.aFloatArray43[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static401.aFloatArray43[2] = local31 * (float) (local21 & 0xFF);
			Static401.aFloatArray43[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, Static401.aFloatArray43, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method8378() * local17.method8378()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt8615 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method7433();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!oh;IIZLclient!wt;)V")
	@Override
	public void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class393 arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static318.aClass393_2 == arg5) {
			local10 = 1;
			local14 = arg0 * 2;
		} else if (arg5 == Static406.aClass393_3) {
			local10 = 3;
			local14 = arg0 + 1;
		} else if (arg5 == Static413.aClass393_4) {
			local14 = arg0 * 3;
			local10 = 4;
		} else if (arg5 == Static668.aClass393_6) {
			local10 = 6;
			local14 = arg0 + 2;
		} else if (arg5 == Static492.aClass393_5) {
			local10 = 5;
			local14 = arg0 + 2;
		} else {
			local10 = 0;
			local14 = arg0;
		}
		@Pc(68) Class152 local68 = arg2.method7827();
		@Pc(71) Class2_Sub1 local71 = (Class2_Sub1) arg2;
		local71.method8735();
		OpenGL.glDrawElements(local10, local14, Static31.method747(local68), local71.method8743() + (long) (local68.anInt4478 * arg1));
	}

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "(I)V")
	@Override
	protected void method7506() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray71, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(Z)V")
	@Override
	protected void method7470() {
		if (super.aBoolean652) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(II)V")
	@Override
	public void method7527(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8512(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "(I)V")
	@Override
	protected void method7442() {
		for (@Pc(10) int local10 = super.anInt8620 - 1; local10 >= 0; local10--) {
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
		@Pc(78) float[] local78 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(80) int local80 = 0; local80 < 8; local80++) {
			@Pc(86) int local86 = local80 + 16384;
			OpenGL.glLightfv(local86, 4608, local78, 0);
			OpenGL.glLightf(local86, 4615, 0.0F);
			OpenGL.glLightf(local86, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method7442();
	}

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "()V")
	@Override
	public void method8483() {
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(B)V")
	@Override
	protected void method7443() {
		super.aFloat175 = (float) (-super.anInt8621 + super.anInt8600);
		super.aFloat174 = super.aFloat175 - (float) super.anInt8627;
		if (super.aFloat174 < (float) super.anInt8608) {
			super.aFloat174 = (float) super.anInt8608;
		}
		OpenGL.glFogf(2915, super.aFloat174);
		OpenGL.glFogf(2916, super.aFloat175);
		Static401.aFloatArray43[0] = (float) (super.anInt8598 & 0xFF0000) / 1.671168E7F;
		Static401.aFloatArray43[2] = (float) (super.anInt8598 & 0xFF) / 255.0F;
		Static401.aFloatArray43[1] = (float) (super.anInt8598 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static401.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "(I)V")
	@Override
	protected void method7422() {
		Static401.aFloatArray43[2] = (float) (super.anInt8616 & 0xFF) / 255.0F;
		Static401.aFloatArray43[1] = (float) (super.anInt8616 & 0xFF00) / 65280.0F;
		Static401.aFloatArray43[3] = (float) (super.anInt8616 >>> 24) / 255.0F;
		Static401.aFloatArray43[0] = (float) (super.anInt8616 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static401.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method8519(@OriginalArg(0) Interface26 arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "(Z)V")
	@Override
	protected void method7524() {
		if (super.aBoolean664 && !super.aBoolean662) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!pa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt7383;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(IZ)V")
	@Override
	public void method7531(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
	@Override
	protected void method8455() {
		super.method8455();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7538(@OriginalArg(1) Canvas arg0) {
		@Pc(13) long local13 = this.anOpenGL2.prepareSurface(arg0);
		if (local13 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local13);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "()Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "(I)V")
	@Override
	protected void method7432() {
		if (super.aBoolean661) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ss;ZZI)V")
	@Override
	protected void method7475(@OriginalArg(0) Class326 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static590.method8296(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!ig;Lclient!sw;I)Lclient!ec;")
	@Override
	public Interface7 method7535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) Class327 arg3) {
		if (this.aBoolean548 || Static129.method2437(arg1) && Static129.method2437(arg0)) {
			return new Class93_Sub1(this, arg3, arg2, arg1, arg0);
		} else if (this.aBoolean549) {
			return new Class93_Sub2(this, arg3, arg2, arg1, arg0);
		} else {
			return new Class93_Sub1(this, arg3, arg2, Static282.method4521(arg1), Static282.method4521(arg0));
		}
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
	@Override
	public void method8457() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZBILclient!ss;)V")
	@Override
	public void method7498(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class326 arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static590.method8296(arg3));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "(I)V")
	@Override
	protected void method7436() {
		if (super.aBoolean653) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!sw;III[BI)Lclient!oo;")
	@Override
	public Interface21 method7447(@OriginalArg(0) Class327 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class93_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "(B)V")
	@Override
	protected void method7502() {
		OpenGL.glViewport(super.anInt8631, super.anInt8628, super.anInt8516, super.anInt8556);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public synchronized void method6532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub33 local12 = new Class3_Sub33(arg1);
		local12.aLong311 = (long) arg0;
		this.aClass338_176.method8171(local12);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!id;II)V")
	@Override
	public void method7423(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		this.aClass2_Sub2Array1[arg1] = (Class2_Sub2) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "(I)V")
	@Override
	protected void method7445() {
		OpenGL.glDepthMask(super.aBoolean663 && super.aBoolean650);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8473(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8484(arg2, arg3);
	}

	@OriginalMember(owner = "client!pa", name = "fb", descriptor = "(I)V")
	@Override
	protected void method7537() {
		this.method6536();
	}

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "()Lclient!cja;")
	@Override
	public Class61 method8522() {
		@Pc(7) int local7 = -1;
		if (this.aString76.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString76.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString76.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class61(local7, "OpenGL", this.anInt7381, this.aString77, 0L);
	}

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
	@Override
	public void method8490() {
	}

	@OriginalMember(owner = "client!pa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7505(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
	public synchronized void method6534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub33 local8 = new Class3_Sub33(arg1);
		local8.aLong311 = (long) arg0;
		this.aClass338_177.method8171(local8);
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)V")
	@Override
	protected void method7419() {
		OpenGL.glMatrixMode(5890);
		if (Static111.aClass94_3 == super.aClass94Array3[super.anInt8601]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass239_Sub3Array3[super.anInt8601].method9266(Static441.aFloatArray52), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!aga;)V")
	@Override
	public void method7408(@OriginalArg(1) Class10 arg0) {
		if (Static635.aClass10_3 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(18) int local18 = Static180.method3221(arg0);
		OpenGL.glTexGeni(8192, 9472, local18);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local18);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local18);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "(I)V")
	@Override
	protected void method7516() {
		OpenGL.glTexEnvi(8960, 34161, Static63.method1309(super.aClass203Array6[super.anInt8601]));
	}

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "()V")
	@Override
	public void method8480() {
		if (super.anInt8516 <= 0 && super.anInt8556 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt8599;
		@Pc(16) int local16 = super.anInt8605;
		@Pc(19) int local19 = super.anInt8603;
		@Pc(22) int local22 = super.anInt8622;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7500();
		this.method7536(false);
		this.method7465(false);
		this.method7482(false);
		this.method7505(false);
		this.method7530((Interface3) null);
		this.method7508(false, -2, false);
		this.method7509(1);
		this.method7440(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8516, super.anInt8556, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method7463(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)V")
	public synchronized void method6535(@OriginalArg(1) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong311 = arg0;
		this.aClass338_181.method8171(local7);
	}

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "(B)V")
	@Override
	protected void method7460() {
		OpenGL.glActiveTexture(super.anInt8601 + 33984);
	}

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "(B)V")
	@Override
	protected void method7462() {
		@Pc(17) int local17 = this.anIntArray633[super.anInt8601];
		if (local17 != 0) {
			this.anIntArray633[super.anInt8601] = 0;
			OpenGL.glBindTexture(local17, 0);
			OpenGL.glDisable(local17);
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)Lclient!bfa;")
	@Override
	public Interface2 method8502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!sw;ILclient!ig;)Z")
	@Override
	public boolean method7425(@OriginalArg(0) Class327 arg0, @OriginalArg(2) Class152 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8491(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!bfa;Lclient!tq;)Lclient!vv;")
	@Override
	public Interface26 method8529(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[FLclient!sw;IIIIZ)Lclient!ec;")
	@Override
	protected Interface7 method7456(@OriginalArg(1) float[] arg0, @OriginalArg(2) Class327 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean548 || Static129.method2437(arg3) && Static129.method2437(arg2)) {
			return new Class93_Sub1(this, arg1, arg3, arg2, arg4, arg0, 0, 0);
		} else if (this.aBoolean549) {
			return new Class93_Sub2(this, arg1, arg3, arg2, arg0, 0, 0);
		} else {
			@Pc(60) Class93_Sub1 local60 = new Class93_Sub1(this, arg1, Static246.aClass152_14, Static282.method4521(arg3), Static282.method4521(arg2));
			local60.method2604(arg0, arg2, arg1, arg3);
			return local60;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class35 method8477(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class35 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "(I)V")
	@Override
	protected void method7503() {
		Static401.aFloatArray43[1] = super.aFloat187 * super.aFloat172;
		Static401.aFloatArray43[0] = super.aFloat172 * super.aFloat176;
		Static401.aFloatArray43[2] = super.aFloat172 * super.aFloat181;
		Static401.aFloatArray43[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static401.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!pa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8556 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt7382, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "(I)V")
	@Override
	protected void method7438() {
		OpenGL.glScissor(super.anInt8631 + super.anInt8599, -super.anInt8622 + (super.anInt8628 - -super.anInt8556), super.anInt8605 - super.anInt8599, -super.anInt8603 + super.anInt8622);
	}

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "(I)V")
	@Override
	protected void method7416() {
		OpenGL.glTexEnvi(8960, 34162, Static63.method1309(super.aClass203Array5[super.anInt8601]));
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!sw;Lclient!ig;Z)Z")
	@Override
	public boolean method7448(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class152 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "()Z")
	@Override
	public boolean method8524() {
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "kb", descriptor = "(I)V")
	private void method6536() {
		if (this.aBoolean540) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass232_6.method5542()) {
			if (!this.aBoolean539) {
				OpenGL.glLoadMatrixf(super.aClass239_Sub3_18.method9266(Static441.aFloatArray52), 0);
				this.aBoolean539 = true;
				this.method7490();
				this.method7433();
			}
			if (super.aBoolean647) {
				this.aBoolean540 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass239_Sub3_15.method9266(Static441.aFloatArray52), 0);
				this.aBoolean540 = true;
			}
		} else if (super.aBoolean647) {
			OpenGL.glLoadIdentity();
			this.aBoolean540 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass239_Sub3_15.method9266(Static441.aFloatArray52), 0);
			this.aBoolean540 = false;
		}
	}
}
