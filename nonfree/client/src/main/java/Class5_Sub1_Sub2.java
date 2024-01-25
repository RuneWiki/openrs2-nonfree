import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mba", name = "ti", descriptor = "Z")
	private boolean aBoolean473;

	@OriginalMember(owner = "client!mba", name = "vi", descriptor = "I")
	private int anInt6636;

	@OriginalMember(owner = "client!mba", name = "wi", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!mba", name = "xi", descriptor = "Z")
	private boolean aBoolean474;

	@OriginalMember(owner = "client!mba", name = "yi", descriptor = "Z")
	private boolean aBoolean475;

	@OriginalMember(owner = "client!mba", name = "zi", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!mba", name = "Ai", descriptor = "Z")
	private boolean aBoolean477;

	@OriginalMember(owner = "client!mba", name = "Qh", descriptor = "Lclient!mr;")
	private final Class223 aClass223_34 = new Class223();

	@OriginalMember(owner = "client!mba", name = "ni", descriptor = "Lclient!mr;")
	private final Class223 aClass223_35 = new Class223();

	@OriginalMember(owner = "client!mba", name = "oi", descriptor = "Lclient!mr;")
	private final Class223 aClass223_36 = new Class223();

	@OriginalMember(owner = "client!mba", name = "pi", descriptor = "Lclient!mr;")
	private final Class223 aClass223_37 = new Class223();

	@OriginalMember(owner = "client!mba", name = "qi", descriptor = "Lclient!mr;")
	private final Class223 aClass223_38 = new Class223();

	@OriginalMember(owner = "client!mba", name = "ri", descriptor = "Lclient!mr;")
	private final Class223 aClass223_39 = new Class223();

	@OriginalMember(owner = "client!mba", name = "si", descriptor = "Lclient!mr;")
	private final Class223 aClass223_40 = new Class223();

	@OriginalMember(owner = "client!mba", name = "Bi", descriptor = "[Lclient!nea;")
	private final Class185_Sub1[] aClass185_Sub1Array1 = new Class185_Sub1[16];

	@OriginalMember(owner = "client!mba", name = "ui", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!mba", name = "Ci", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!mba", name = "Gi", descriptor = "I")
	private final int anInt6637 = 0;

	@OriginalMember(owner = "client!mba", name = "Nh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!mba", name = "Di", descriptor = "Ljava/lang/String;")
	private final String aString68;

	@OriginalMember(owner = "client!mba", name = "Ei", descriptor = "Ljava/lang/String;")
	private final String aString69;

	@OriginalMember(owner = "client!mba", name = "Mi", descriptor = "I")
	private final int anInt6639;

	@OriginalMember(owner = "client!mba", name = "Ni", descriptor = "Z")
	public boolean aBoolean482;

	@OriginalMember(owner = "client!mba", name = "Ji", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!mba", name = "Li", descriptor = "Z")
	private final boolean aBoolean481;

	@OriginalMember(owner = "client!mba", name = "Hi", descriptor = "Z")
	public final boolean aBoolean478;

	@OriginalMember(owner = "client!mba", name = "Oi", descriptor = "Z")
	public final boolean aBoolean483;

	@OriginalMember(owner = "client!mba", name = "Ii", descriptor = "Z")
	public final boolean aBoolean479;

	@OriginalMember(owner = "client!mba", name = "Fi", descriptor = "[I")
	public final int[] anIntArray393;

	@OriginalMember(owner = "client!mba", name = "Ki", descriptor = "I")
	public final int anInt6638;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!la;I)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class196 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString68 = OpenGL.glGetString(7936).toLowerCase();
			this.aString69 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString68.indexOf("microsoft") != -1 || this.aString68.indexOf("brian paul") != -1 || this.aString68.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static33.method1210(' ', local108.replace('.', ' '));
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(139) int local139;
			try {
				@Pc(133) int local133 = Static134.method2553(local116[0]);
				local139 = Static134.method2553(local116[1]);
				this.anInt6639 = local139 + local133 * 10;
			} catch (@Pc(148) NumberFormatException local148) {
				throw new RuntimeException("");
			}
			if (this.anInt6639 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(187) int[] local187 = new int[1];
				OpenGL.glGetIntegerv(34018, local187, 0);
				super.anInt6538 = local187[0];
				if (super.anInt6538 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6549 = 8;
				this.aBoolean482 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean453 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean480 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean469 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean481 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean465 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean478 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean483 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean479 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray393 = new int[super.anInt6538];
				this.anInt6638 = Stream.a() ? 33639 : 5121;
				if (this.aString69.indexOf("radeon") != -1) {
					local139 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static33.method1210(' ', this.aString69.replace('/', ' '));
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(309) String local309 = local301[local303];
						try {
							if (local309.length() > 0) {
								if (local309.charAt(0) == 'x' && local309.length() >= 3 && Static93.method2083(local309.substring(1, 3))) {
									local292 = true;
									local309 = local309.substring(1);
								}
								if (local309.equals("hd")) {
									local290 = true;
								} else {
									if (local309.startsWith("hd")) {
										local309 = local309.substring(2);
										local290 = true;
									}
									if (local309.length() >= 4 && Static93.method2083(local309.substring(0, 4))) {
										local139 = Static134.method2553(local309.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(378) Exception local378) {
						}
					}
					if (!local292 && !local290) {
						if (local139 >= 7000 && local139 <= 7999) {
							this.aBoolean482 = false;
						}
						if (local139 >= 7000 && local139 <= 9250) {
							super.aBoolean465 = false;
						}
					}
					this.aBoolean480 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString68.indexOf("intel");
				if (this.aBoolean482) {
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
			this.method7493();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "()V")
	@Override
	public void method7489() {
	}

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "()Z")
	@Override
	public boolean method7516() {
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5590(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!wq;Lclient!kca;)Z")
	@Override
	public boolean method5619(@OriginalArg(1) Class376 arg0, @OriginalArg(2) Class182 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)Lclient!rga;")
	@Override
	public Interface18 method7488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!rf;IIB)V")
	@Override
	public void method5688(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(22) byte local22;
		@Pc(20) int local20;
		if (arg0 == Static620.aClass292_7) {
			local20 = arg1 * 2;
			local22 = 1;
		} else if (Static493.aClass292_4 == arg0) {
			local22 = 3;
			local20 = arg1 + 1;
		} else if (Static67.aClass292_2 == arg0) {
			local20 = arg1 * 3;
			local22 = 4;
		} else if (Static62.aClass292_6 == arg0) {
			local22 = 6;
			local20 = arg1 + 2;
		} else if (Static490.aClass292_3 == arg0) {
			local22 = 5;
			local20 = arg1 + 2;
		} else {
			local22 = 0;
			local20 = arg1;
		}
		OpenGL.glDrawArrays(local22, arg2, local20);
	}

	@OriginalMember(owner = "client!mba", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6423 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt6638, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(ZZ)Lclient!fg;")
	@Override
	public Interface11 method5649(@OriginalArg(0) boolean arg0) {
		return new Class185_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "(B)V")
	@Override
	protected void method5595() {
		this.method5699();
	}

	@OriginalMember(owner = "client!mba", name = "u", descriptor = "(B)V")
	@Override
	protected void method5655() {
		for (@Pc(6) int local6 = super.anInt6538 - 1; local6 >= 0; local6--) {
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
		this.anOpenGL2.setSwapInterval(0);
		super.method5655();
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(Z)V")
	@Override
	public void method5591() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray50, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mba", name = "U", descriptor = "(I)V")
	@Override
	protected void method5693() {
	}

	@OriginalMember(owner = "client!mba", name = "v", descriptor = "(B)F")
	@Override
	protected float method5660() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZJ)V")
	public synchronized void method5698(@OriginalArg(1) long arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong276 = arg0;
		this.aClass223_40.method5868(local13);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "(Z)V")
	@Override
	protected void method5572() {
		super.aFloat139 = super.anInt6516 - super.anInt6531;
		super.aFloat145 = super.aFloat139 - (float) super.anInt6539;
		if (super.aFloat145 < (float) super.anInt6510) {
			super.aFloat145 = super.anInt6510;
		}
		OpenGL.glFogf(2915, super.aFloat145);
		OpenGL.glFogf(2916, super.aFloat139);
		Static53.aFloatArray81[0] = (float) (super.anInt6521 & 0xFF0000) / 1.671168E7F;
		Static53.aFloatArray81[1] = (float) (super.anInt6521 & 0xFF00) / 65280.0F;
		Static53.aFloatArray81[2] = (float) (super.anInt6521 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static53.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(BZ)Lclient!rr;")
	@Override
	public Interface19 method5671(@OriginalArg(1) boolean arg0) {
		return new Class185_Sub2(this, Static637.aClass376_17, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "A", descriptor = "(I)V")
	@Override
	protected void method5635() {
		Static53.aFloatArray81[3] = 1.0F;
		Static53.aFloatArray81[1] = super.aFloat148 * super.aFloat142;
		Static53.aFloatArray81[0] = super.aFloat148 * super.aFloat136;
		Static53.aFloatArray81[2] = super.aFloat140 * super.aFloat148;
		OpenGL.glLightfv(16384, 4609, Static53.aFloatArray81, 0);
		Static53.aFloatArray81[2] = -super.aFloat147 * super.aFloat140;
		Static53.aFloatArray81[3] = 1.0F;
		Static53.aFloatArray81[1] = super.aFloat142 * -super.aFloat147;
		Static53.aFloatArray81[0] = -super.aFloat147 * super.aFloat136;
		OpenGL.glLightfv(16385, 4609, Static53.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!kca;IIB[BIZI)Lclient!ug;")
	@Override
	protected Interface24 method5629(@OriginalArg(0) Class182 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean481 || Static323.method5278(arg1) && Static323.method5278(arg4)) {
			return new Class111_Sub2(this, arg0, arg1, arg4, arg3, arg2, 0, 0);
		} else if (this.aBoolean480) {
			return new Class111_Sub3(this, arg0, arg1, arg4, arg2, 0, 0);
		} else {
			@Pc(50) Class111_Sub2 local50 = new Class111_Sub2(this, arg0, Static637.aClass376_16, Static109.method2234(arg1), Static109.method2234(arg4));
			local50.method7480(arg0, arg2, arg4, 0, arg1);
			return local50;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[Lclient!en;)Lclient!eu;")
	@Override
	public Class46 method5652(@OriginalArg(1) Class93[] arg0) {
		return new Class46_Sub1(arg0);
	}

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "(B)V")
	@Override
	protected void method5667() {
		this.method5625();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt6533 > local10; local10++) {
			@Pc(17) Class3_Sub16 local17 = super.aClass3_Sub16Array6[local10];
			@Pc(21) int local21 = local17.method4776();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method4785() / 255.0F;
			Static53.aFloatArray81[0] = local17.method4778();
			Static53.aFloatArray81[1] = local17.method4777();
			Static53.aFloatArray81[2] = local17.method4783();
			Static53.aFloatArray81[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static53.aFloatArray81, 0);
			Static53.aFloatArray81[1] = (float) (local21 >> 8 & 0xFF) * local31;
			Static53.aFloatArray81[3] = 1.0F;
			Static53.aFloatArray81[2] = local31 * (float) (local21 & 0xFF);
			Static53.aFloatArray81[0] = (float) (local21 >> 16 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static53.aFloatArray81, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method4781() * local17.method4781()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt6522 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method5667();
	}

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "(B)V")
	@Override
	protected void method5608() {
		OpenGL.glMatrixMode(5890);
		if (Static362.aClass340_4 == super.aClass340Array3[super.anInt6535]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.bf[super.anInt6535].method1556(Static555.aFloatArray76), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)Lclient!sha;")
	@Override
	protected Class29 method5585(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class29_Sub7(this, super.aClass196_66);
		} else if (arg0 == 4) {
			return new Class29_Sub9(this, super.aClass196_66, super.lb);
		} else if (arg0 == 8) {
			return new Class29_Sub6(this, super.aClass196_66, super.lb);
		} else {
			return super.method5585(arg0);
		}
	}

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "(B)V")
	@Override
	protected void method5614() {
		OpenGL.glTexEnvi(8960, 34161, Static512.method7632(super.aClass374Array6[super.anInt6535]));
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)V")
	@Override
	public void method7492(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "(I)V")
	@Override
	protected void method5622() {
		OpenGL.glTexEnvi(8960, 34162, Static512.method7632(super.aClass374Array5[super.anInt6535]));
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!rf;IIILclient!rr;II)V")
	@Override
	public void method5665(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) byte local19;
		@Pc(23) int local23;
		if (Static620.aClass292_7 == arg0) {
			local23 = arg4 * 2;
			local19 = 1;
		} else if (Static493.aClass292_4 == arg0) {
			local19 = 3;
			local23 = arg4 + 1;
		} else if (arg0 == Static67.aClass292_2) {
			local19 = 4;
			local23 = arg4 * 3;
		} else if (Static62.aClass292_6 == arg0) {
			local19 = 6;
			local23 = arg4 + 2;
		} else if (Static490.aClass292_3 == arg0) {
			local19 = 5;
			local23 = arg4 + 2;
		} else {
			local23 = arg4;
			local19 = 0;
		}
		@Pc(68) Class376 local68 = arg3.method7983();
		@Pc(71) Class185_Sub2 local71 = (Class185_Sub2) arg3;
		local71.method7646();
		OpenGL.glDrawElements(local19, local23, Static562.method8095(local68), local71.method7652() + (long) (local68.anInt10167 * arg5));
	}

	@OriginalMember(owner = "client!mba", name = "Y", descriptor = "(I)V")
	private void method5699() {
		if (this.aBoolean476) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass372_13.method8631()) {
			if (!this.aBoolean473) {
				OpenGL.glLoadMatrixf(super.aClass39_Sub1_18.method1556(Static555.aFloatArray76), 0);
				this.aBoolean473 = true;
				this.method5591();
				this.method5667();
			}
			if (super.aBoolean451) {
				this.aBoolean476 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass39_Sub1_15.method1556(Static555.aFloatArray76), 0);
				this.aBoolean476 = true;
			}
		} else if (super.aBoolean451) {
			OpenGL.glLoadIdentity();
			this.aBoolean476 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass39_Sub1_15.method1556(Static555.aFloatArray76), 0);
			this.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!af;IIZ)V")
	@Override
	protected void method5600(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static586.method8275(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "(I)V")
	@Override
	protected void method5645() {
		if (super.aBoolean452) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "(B)V")
	@Override
	protected void method5615() {
		OpenGL.glDepthMask(super.aBoolean460 && super.aBoolean459);
	}

	@OriginalMember(owner = "client!mba", name = "v", descriptor = "()V")
	@Override
	public void method7555() {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIZI[III)Lclient!ug;")
	@Override
	public Interface24 method5626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean481 || Static323.method5278(arg3) && Static323.method5278(arg5)) {
			return new Class111_Sub2(this, arg3, arg5, arg2, arg4, 0, arg1);
		} else if (this.aBoolean480) {
			return new Class111_Sub3(this, arg3, arg5, arg4, 0, arg1);
		} else {
			@Pc(36) Class111_Sub2 local36 = new Class111_Sub2(this, Static502.aClass182_14, Static637.aClass376_16, Static109.method2234(arg3), Static109.method2234(arg5));
			local36.method7477(arg4, arg3, arg1, 0, arg5, 0);
			return local36;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)V")
	public synchronized void method5701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub19 local8 = new Class3_Sub19(arg0);
		local8.aLong276 = arg1;
		this.aClass223_36.method5868(local8);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!kca;BII[BI)Lclient!iv;")
	@Override
	public Interface12 method5637(@OriginalArg(0) Class182 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class111_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIBZIILclient!kca;[F)Lclient!ug;")
	@Override
	protected Interface24 method5677(@OriginalArg(3) boolean arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class182 arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean481 || Static323.method5278(arg2) && Static323.method5278(arg1)) {
			return new Class111_Sub2(this, arg3, arg2, arg1, arg0, arg4, 0, 0);
		} else if (this.aBoolean480) {
			return new Class111_Sub3(this, arg3, arg2, arg1, arg4, 0, 0);
		} else {
			@Pc(67) Class111_Sub2 local67 = new Class111_Sub2(this, arg3, Static637.aClass376_20, Static109.method2234(arg2), Static109.method2234(arg1));
			local67.method3891(arg2, arg1, arg3, arg4);
			return local67;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7565(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7514(arg2, arg3);
	}

	@OriginalMember(owner = "client!mba", name = "V", descriptor = "(I)V")
	@Override
	protected void method5695() {
		@Pc(9) int local9 = this.anIntArray393[super.anInt6535];
		if (local9 != 0) {
			this.anIntArray393[super.anInt6535] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!mba", name = "J", descriptor = "(I)V")
	@Override
	protected void method5668() {
		if (super.aBoolean472) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!mba", name = "B", descriptor = "(I)V")
	@Override
	protected void method5639() {
		if (super.aBoolean457) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!fg;IB)V")
	@Override
	public void method5692(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.aClass185_Sub1Array1[arg1] = (Class185_Sub1) arg0;
	}

	@OriginalMember(owner = "client!mba", name = "N", descriptor = "(I)V")
	@Override
	protected void method5675() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray54, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mba", name = "D", descriptor = "(B)V")
	@Override
	protected void method5694() {
		if (super.aBoolean458) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!mba", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5636(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method5685(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLclient!ew;)V")
	@Override
	public void method5620(@OriginalArg(1) Class99 arg0) {
		if (Static540.aClass99_23 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(6) int local6 = Static444.method7717(arg0);
		OpenGL.glTexGeni(8192, 9472, local6);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local6);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local6);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!dv;)V")
	@Override
	public void method7527(@OriginalArg(0) Interface8 arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!eu;B)V")
	@Override
	public void method5610(@OriginalArg(0) Class46 arg0) {
		@Pc(9) Class93[] local9 = ((Class46_Sub1) arg0).aClass93Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local9.length; local27++) {
			@Pc(33) Class93 local33 = local9[local27];
			@Pc(38) Class185_Sub1 local38 = this.aClass185_Sub1Array1[local27];
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = local38.method6018();
			@Pc(48) long local48 = local38.method7652();
			local38.method7646();
			for (@Pc(53) int local53 = 0; local53 < local33.method2528(); local53++) {
				@Pc(60) Class131 local60 = local33.method2529(local53);
				if (Static196.aClass131_1 == local60) {
					local25 = true;
					OpenGL.glVertexPointer(3, 5126, local44, (long) local40 + local48);
				} else if (local60 == Static196.aClass131_2) {
					local23 = true;
					OpenGL.glNormalPointer(5126, local44, (long) local40 + local48);
				} else if (Static196.aClass131_3 == local60) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local44, local48 + (long) local40);
				} else if (local60 == Static196.aClass131_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static196.aClass131_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, local48 + (long) local40);
				} else if (Static196.aClass131_6 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, (long) local40 + local48);
				} else if (Static196.aClass131_7 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, local48 + (long) local40);
				}
				local40 += local60.anInt3838;
			}
		}
		if (this.aBoolean475 != local25) {
			if (local25) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean475 = local25;
		}
		if (local23 != this.aBoolean474) {
			if (local23) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean474 = local23;
		}
		if (this.aBoolean477 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean477 = local13;
		}
		@Pc(269) int local269;
		if (local11 > this.anInt6636) {
			for (local269 = this.anInt6636; local269 < local11; local269++) {
				OpenGL.glClientActiveTexture(local269 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt6636 = local11;
		} else if (this.anInt6636 > local11) {
			for (local269 = local11; local269 < this.anInt6636; local269++) {
				OpenGL.glClientActiveTexture(local269 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt6636 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7544(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method7509(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub19 local19;
		while (!this.aClass223_35.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_35.method5872();
			Static515.anIntArray553[local7++] = (int) local19.aLong276;
			super.anInt6497 -= local19.anInt2696;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static515.anIntArray553, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static515.anIntArray553, 0);
			local7 = 0;
		}
		while (!this.aClass223_36.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_36.method5872();
			Static515.anIntArray553[local7++] = (int) local19.aLong276;
			super.anInt6509 -= local19.anInt2696;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static515.anIntArray553, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static515.anIntArray553, 0);
			local7 = 0;
		}
		while (!this.aClass223_37.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_37.method5872();
			Static515.anIntArray553[local7++] = local19.anInt2696;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static515.anIntArray553, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static515.anIntArray553, 0);
			local7 = 0;
		}
		while (!this.aClass223_38.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_38.method5872();
			Static515.anIntArray553[local7++] = (int) local19.aLong276;
			super.anInt6508 -= local19.anInt2696;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static515.anIntArray553, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static515.anIntArray553, 0);
		}
		while (!this.aClass223_34.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_34.method5872();
			OpenGL.glDeleteLists((int) local19.aLong276, local19.anInt2696);
		}
		@Pc(214) Class3 local214;
		while (!this.aClass223_39.method5864()) {
			local214 = this.aClass223_39.method5872();
			OpenGL.glDeleteProgramARB((int) local214.aLong276);
		}
		while (!this.aClass223_40.method5864()) {
			local214 = this.aClass223_40.method5872();
			OpenGL.glDeleteObjectARB(local214.aLong276);
		}
		while (!this.aClass223_34.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_34.method5872();
			OpenGL.glDeleteLists((int) local19.aLong276, local19.anInt2696);
		}
		if (this.E() > 100663296 && this.aLong183 + 60000L < Static374.method6036()) {
			System.gc();
			this.aLong183 = Static374.method6036();
		}
		super.method7509(local11);
	}

	@OriginalMember(owner = "client!mba", name = "w", descriptor = "(I)V")
	@Override
	protected void method5621() {
		Static53.aFloatArray81[1] = super.aFloat141 * super.aFloat142;
		Static53.aFloatArray81[2] = super.aFloat140 * super.aFloat141;
		Static53.aFloatArray81[0] = super.aFloat141 * super.aFloat136;
		Static53.aFloatArray81[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static53.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5648(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local14)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(IB)V")
	public synchronized void method5702(@OriginalArg(0) int arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong276 = arg0;
		this.aClass223_39.method5868(local13);
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5565() {
		Static53.aFloatArray81[2] = (float) (super.anInt6513 & 0xFF) / 255.0F;
		Static53.aFloatArray81[0] = (float) (super.anInt6513 & 0xFF0000) / 1.671168E7F;
		Static53.aFloatArray81[3] = (float) (super.anInt6513 >>> 24) / 255.0F;
		Static53.aFloatArray81[1] = (float) (super.anInt6513 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static53.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5657() {
		if (super.aBoolean463 && super.aBoolean461 && super.anInt6539 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(II)V")
	@Override
	public void method5566(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI[[IZ)Lclient!au;")
	@Override
	public Interface3 method5581(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class111_Sub1(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!up;Lclient!rga;)Lclient!dv;")
	@Override
	public Interface8 method7512(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface18 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "K", descriptor = "(I)V")
	@Override
	protected void method5670() {
		if (super.aBoolean470) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method5576(@OriginalArg(0) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL2.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!mba", name = "D", descriptor = "(I)V")
	@Override
	protected void method5641() {
		this.aBoolean473 = false;
		this.method5699();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZI)V")
	public synchronized void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub19 local14 = new Class3_Sub19(arg0);
		local14.aLong276 = arg1;
		this.aClass223_35.method5868(local14);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(II)V")
	@Override
	public void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "(B)V")
	@Override
	protected void method5604() {
		OpenGL.glScissor(super.anInt6536 + super.anInt6518, super.anInt6534 + super.anInt6423 - super.anInt6523, -super.anInt6536 + super.anInt6519, -super.anInt6520 + super.anInt6523);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method5587(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!kca;Lclient!wq;)Z")
	@Override
	public boolean method5602(@OriginalArg(1) Class182 arg0, @OriginalArg(2) Class376 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(II)Lclient!up;")
	@Override
	public Interface25 method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(B)V")
	@Override
	protected void method5570() {
		if (Static57.aClass7_4 == super.aClass7_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static32.aClass7_6 == super.aClass7_5) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass7_5 == Static608.aClass7_7) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!mba", name = "u", descriptor = "(I)V")
	@Override
	protected void method5616() {
		OpenGL.glActiveTexture(super.anInt6535 + 33984);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZBILclient!af;)V")
	@Override
	public void method5618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static586.method8275(arg3));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "()V")
	@Override
	public void method7560() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!mba", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt6637;
	}

	@OriginalMember(owner = "client!mba", name = "P", descriptor = "(I)V")
	@Override
	protected void method5684() {
		if (super.aBoolean464 && !super.aBoolean468) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "()Z")
	@Override
	public boolean method7534() {
		return false;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!ss;Lclient!ss;FLclient!ss;)Lclient!ss;")
	@Override
	public Class205 method7564(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class205 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mba", name = "y", descriptor = "()V")
	@Override
	public void method7567() {
		if (super.anInt6469 <= 0 && super.anInt6423 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt6536;
		@Pc(22) int local22 = super.anInt6519;
		@Pc(25) int local25 = super.anInt6520;
		@Pc(28) int local28 = super.anInt6523;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5564();
		this.method5599(false);
		this.method5630(false);
		this.method5611(false);
		this.method5636(false);
		this.method5609(null);
		this.method5579(false, false, -2);
		this.method5697(1);
		this.method5666(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6469, super.anInt6423, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIBLclient!wq;Lclient!kca;)Lclient!ug;")
	@Override
	public Interface24 method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class376 arg2, @OriginalArg(4) Class182 arg3) {
		if (this.aBoolean481 || Static323.method5278(arg0) && Static323.method5278(arg1)) {
			return new Class111_Sub2(this, arg3, arg2, arg0, arg1);
		} else if (this.aBoolean480) {
			return new Class111_Sub3(this, arg3, arg2, arg0, arg1);
		} else {
			return new Class111_Sub2(this, arg3, arg2, Static109.method2234(arg0), Static109.method2234(arg1));
		}
	}

	@OriginalMember(owner = "client!mba", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!mba", name = "T", descriptor = "(I)V")
	@Override
	protected void method5691() {
		OpenGL.glViewport(super.anInt6518, super.anInt6534, super.anInt6469, super.anInt6423);
	}

	@OriginalMember(owner = "client!mba", name = "A", descriptor = "()Lclient!fc;")
	@Override
	public Class103 method7569() {
		@Pc(7) int local7 = -1;
		if (this.aString68.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString68.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString68.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class103(local7, "OpenGL", this.anInt6639, this.aString69, 0L);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "()V")
	@Override
	protected void method7493() {
		super.method7493();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "()V")
	@Override
	public void method7535() {
	}
}
