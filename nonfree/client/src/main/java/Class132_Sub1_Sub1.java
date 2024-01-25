import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class132_Sub1_Sub1 extends Class132_Sub1 {

	@OriginalMember(owner = "client!oaa", name = "Ei", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!oaa", name = "Fi", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!oaa", name = "Gi", descriptor = "I")
	private int anInt7179;

	@OriginalMember(owner = "client!oaa", name = "Hi", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!oaa", name = "Ii", descriptor = "Z")
	private boolean aBoolean472;

	@OriginalMember(owner = "client!oaa", name = "Ji", descriptor = "Z")
	private boolean aBoolean473;

	@OriginalMember(owner = "client!oaa", name = "Ki", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!oaa", name = "Xh", descriptor = "Lclient!v;")
	private final Class362 aClass362_37 = new Class362();

	@OriginalMember(owner = "client!oaa", name = "hi", descriptor = "Lclient!v;")
	private final Class362 aClass362_38 = new Class362();

	@OriginalMember(owner = "client!oaa", name = "ti", descriptor = "Lclient!v;")
	private final Class362 aClass362_39 = new Class362();

	@OriginalMember(owner = "client!oaa", name = "wi", descriptor = "Lclient!v;")
	private final Class362 aClass362_40 = new Class362();

	@OriginalMember(owner = "client!oaa", name = "zi", descriptor = "Lclient!v;")
	private final Class362 aClass362_41 = new Class362();

	@OriginalMember(owner = "client!oaa", name = "Ai", descriptor = "Lclient!v;")
	private final Class362 aClass362_42 = new Class362();

	@OriginalMember(owner = "client!oaa", name = "Bi", descriptor = "Lclient!v;")
	private final Class362 aClass362_43 = new Class362();

	@OriginalMember(owner = "client!oaa", name = "Di", descriptor = "[Lclient!ir;")
	private final Class72_Sub1[] aClass72_Sub1Array1 = new Class72_Sub1[16];

	@OriginalMember(owner = "client!oaa", name = "Ci", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!oaa", name = "Li", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!oaa", name = "Ri", descriptor = "I")
	private final int anInt7180 = 0;

	@OriginalMember(owner = "client!oaa", name = "yh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!oaa", name = "Oi", descriptor = "Ljava/lang/String;")
	private final String aString92;

	@OriginalMember(owner = "client!oaa", name = "Pi", descriptor = "Ljava/lang/String;")
	private final String aString93;

	@OriginalMember(owner = "client!oaa", name = "Xi", descriptor = "I")
	private final int anInt7182;

	@OriginalMember(owner = "client!oaa", name = "Ti", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!oaa", name = "Vi", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!oaa", name = "Ui", descriptor = "Z")
	private final boolean aBoolean478;

	@OriginalMember(owner = "client!oaa", name = "Ni", descriptor = "Z")
	public final boolean aBoolean474;

	@OriginalMember(owner = "client!oaa", name = "Si", descriptor = "Z")
	public final boolean aBoolean476;

	@OriginalMember(owner = "client!oaa", name = "Qi", descriptor = "Z")
	public final boolean aBoolean475;

	@OriginalMember(owner = "client!oaa", name = "Mi", descriptor = "[I")
	public final int[] anIntArray440;

	@OriginalMember(owner = "client!oaa", name = "Wi", descriptor = "I")
	public final int anInt7181;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!ae;I)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString92 = OpenGL.glGetString(7936).toLowerCase();
			this.aString93 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString92.indexOf("microsoft") != -1 || this.aString92.indexOf("brian paul") != -1 || this.aString92.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static635.method8720(local108.replace('.', ' '), ' ');
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(137) int local137;
			try {
				@Pc(131) int local131 = Static368.method5312(local116[0]);
				local137 = Static368.method5312(local116[1]);
				this.anInt7182 = local137 + local131 * 10;
			} catch (@Pc(146) NumberFormatException local146) {
				throw new RuntimeException("");
			}
			if (this.anInt7182 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(185) int[] local185 = new int[1];
				OpenGL.glGetIntegerv(34018, local185, 0);
				super.anInt8996 = local185[0];
				if (super.anInt8996 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8986 = 8;
				this.aBoolean477 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean628 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean479 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean638 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean478 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean640 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean474 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean476 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean475 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray440 = new int[super.anInt8996];
				this.anInt7181 = Stream.b() ? 33639 : 5121;
				if (this.aString93.indexOf("radeon") != -1) {
					local137 = 0;
					@Pc(290) boolean local290 = false;
					@Pc(292) boolean local292 = false;
					@Pc(301) String[] local301 = Static635.method8720(this.aString93.replace('/', ' '), ' ');
					for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
						@Pc(309) String local309 = local301[local303];
						try {
							if (local309.length() > 0) {
								if (local309.charAt(0) == 'x' && local309.length() >= 3 && Static267.method3977(local309.substring(1, 3))) {
									local309 = local309.substring(1);
									local292 = true;
								}
								if (local309.equals("hd")) {
									local290 = true;
								} else {
									if (local309.startsWith("hd")) {
										local309 = local309.substring(2);
										local290 = true;
									}
									if (local309.length() >= 4 && Static267.method3977(local309.substring(0, 4))) {
										local137 = Static368.method5312(local309.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(372) Exception local372) {
						}
					}
					if (!local292 && !local290) {
						if (local137 >= 7000 && local137 <= 9250) {
							super.aBoolean640 = false;
						}
						if (local137 >= 7000 && local137 <= 7999) {
							this.aBoolean477 = false;
						}
					}
					this.aBoolean479 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString92.indexOf("intel");
				if (this.aBoolean477) {
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
			this.method7491();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public Class297 method7439() {
		@Pc(7) int local7 = -1;
		if (this.aString92.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString92.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString92.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class297(local7, "OpenGL", this.anInt7182, this.aString93, 0L);
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II)Lclient!rca;")
	@Override
	public Interface23 method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt7180;
	}

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "()V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7584(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "(B)V")
	@Override
	protected void method7619() {
		for (@Pc(6) int local6 = super.anInt8996 - 1; local6 >= 0; local6--) {
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
		this.anOpenGL1.setSwapInterval(0);
		super.method7619();
	}

	@OriginalMember(owner = "client!oaa", name = "u", descriptor = "()V")
	@Override
	protected void method7498() {
		super.method7498();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "(Z)V")
	@Override
	protected void method7607() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray65, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "(I)V")
	@Override
	protected void method7570() {
		this.method7641();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt8988; local10++) {
			@Pc(17) Class6_Sub17 local17 = super.aClass6_Sub17Array5[local10];
			@Pc(21) int local21 = local17.method8519();
			@Pc(26) int local26 = local10 + 16386;
			@Pc(32) float local32 = local17.method8524() / 255.0F;
			Static228.aFloatArray11[0] = (float) local17.method8518();
			Static228.aFloatArray11[1] = (float) local17.method8522();
			Static228.aFloatArray11[2] = (float) local17.method8521();
			Static228.aFloatArray11[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static228.aFloatArray11, 0);
			Static228.aFloatArray11[1] = (float) (local21 >> 8 & 0xFF) * local32;
			Static228.aFloatArray11[0] = (float) (local21 >> 16 & 0xFF) * local32;
			Static228.aFloatArray11[2] = (float) (local21 & 0xFF) * local32;
			Static228.aFloatArray11[3] = 1.0F;
			OpenGL.glLightfv(local26, 4609, Static228.aFloatArray11, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local17.method8520() * local17.method8520()));
			OpenGL.glEnable(local26);
		}
		while (super.anInt9005 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method7570();
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(IB)V")
	public synchronized void method6162(@OriginalArg(0) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong314 = (long) arg0;
		this.aClass362_42.method8536(local7);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IB)Lclient!qs;")
	@Override
	protected Class32 method7521(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class32_Sub7(this, super.aClass8_124);
		} else if (arg0 == 4) {
			return new Class32_Sub9(this, super.aClass8_124, super.aClass247_8);
		} else if (arg0 == 8) {
			return new Class32_Sub2(this, super.aClass8_124, super.aClass247_8);
		} else {
			return super.method7521(arg0);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "(B)V")
	@Override
	protected void method7647() {
		Static228.aFloatArray11[2] = super.aFloat177 * super.aFloat179;
		Static228.aFloatArray11[0] = super.aFloat168 * super.aFloat177;
		Static228.aFloatArray11[3] = 1.0F;
		Static228.aFloatArray11[1] = super.aFloat171 * super.aFloat177;
		OpenGL.glLightModelfv(2899, Static228.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!oaa", name = "gb", descriptor = "(I)V")
	@Override
	protected void method7651() {
		if (super.aBoolean626) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZZ)Lclient!fw;")
	@Override
	public Interface12 method7564(@OriginalArg(0) boolean arg0) {
		return new Class72_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IJ)V")
	public synchronized void method6163(@OriginalArg(1) long arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong314 = arg0;
		this.aClass362_43.method8536(local7);
	}

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return false;
	}

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "(I)V")
	@Override
	protected void method7567() {
		if (super.aBoolean636) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "(Z)V")
	@Override
	protected void method7624() {
		@Pc(13) int local13 = this.anIntArray440[super.anInt8970];
		if (local13 != 0) {
			this.anIntArray440[super.anInt8970] = 0;
			OpenGL.glBindTexture(local13, 0);
			OpenGL.glDisable(local13);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BLclient!pb;ZIIIZI)Lclient!bw;")
	@Override
	protected Interface2 method7626(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (this.aBoolean478 || Static177.method2498(arg3) && Static177.method2498(arg4)) {
			return new Class23_Sub2(this, arg1, arg3, arg4, arg2, arg0, 0, 0);
		} else if (this.aBoolean479) {
			return new Class23_Sub4(this, arg1, arg3, arg4, arg0, 0, 0);
		} else {
			@Pc(58) Class23_Sub2 local58 = new Class23_Sub2(this, arg1, Static417.aClass250_14, Static655.method8912(arg3), Static655.method8912(arg4));
			local58.method8899(0, arg0, arg1, arg3, arg4);
			return local58;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "(B)V")
	@Override
	protected void method7588() {
		OpenGL.glTexEnvi(8960, 34161, Static563.method7906(super.aClass322Array5[super.anInt8970]));
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "()V")
	@Override
	public void method7442() {
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IZI)V")
	public synchronized void method6164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub36 local8 = new Class6_Sub36(arg1);
		local8.aLong314 = (long) arg0;
		this.aClass362_38.method8536(local8);
	}

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "(Z)V")
	@Override
	protected void method7556() {
		Static228.aFloatArray11[3] = (float) (super.anInt8994 >>> 24) / 255.0F;
		Static228.aFloatArray11[2] = (float) (super.anInt8994 & 0xFF) / 255.0F;
		Static228.aFloatArray11[0] = (float) (super.anInt8994 & 0xFF0000) / 1.671168E7F;
		Static228.aFloatArray11[1] = (float) (super.anInt8994 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static228.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B[Lclient!im;)Lclient!bfa;")
	@Override
	public Class34 method7549(@OriginalArg(1) Class168[] arg0) {
		return new Class34_Sub1(arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "Q", descriptor = "(I)V")
	@Override
	protected void method7604() {
		if (Static457.aClass134_8 == super.aClass134_9) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static164.aClass134_11 == super.aClass134_9) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static379.aClass134_6 == super.aClass134_9) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "R", descriptor = "(I)V")
	@Override
	protected void method7605() {
	}

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "(B)F")
	@Override
	protected float method7617() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!bfa;I)V")
	@Override
	public void method7628(@OriginalArg(0) Class34 arg0) {
		@Pc(9) Class168[] local9 = ((Class34_Sub1) arg0).aClass168Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class168 local31 = local9[local25];
			@Pc(36) Class72_Sub1 local36 = this.aClass72_Sub1Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method3752();
			@Pc(46) long local46 = local36.method5801();
			local36.method5805();
			for (@Pc(51) int local51 = 0; local31.method3648() > local51; local51++) {
				@Pc(58) Class116 local58 = local31.method3644(local51);
				if (local58 == Static174.aClass116_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local42, local46 + (long) local38);
				} else if (Static174.aClass116_2 == local58) {
					OpenGL.glNormalPointer(5126, local42, local46 + (long) local38);
					local15 = true;
				} else if (Static174.aClass116_3 == local58) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local42, local46 + (long) local38);
				} else if (local58 == Static174.aClass116_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static174.aClass116_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local46 + (long) local38);
				} else if (Static174.aClass116_6 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, local46 + (long) local38);
				} else if (Static174.aClass116_7 == local58) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, (long) local38 + local46);
				}
				local38 += local58.anInt2905;
			}
		}
		if (local17 != this.aBoolean473) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean473 = local17;
		}
		if (this.aBoolean469 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean469 = local15;
		}
		if (this.aBoolean470 != local13) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean470 = local13;
		}
		@Pc(265) int local265;
		if (local11 > this.anInt7179) {
			for (local265 = this.anInt7179; local265 < local11; local265++) {
				OpenGL.glClientActiveTexture(local265 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt7179 = local11;
		} else if (this.anInt7179 > local11) {
			for (local265 = local11; local265 < this.anInt7179; local265++) {
				OpenGL.glClientActiveTexture(local265 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt7179 = local11;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7446(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7464(arg2, arg3);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)Lclient!cn;")
	@Override
	public Interface4 method7436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIB[[I)Lclient!fp;")
	@Override
	public Interface9 method7528(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class23_Sub1(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method7458(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub36 local19;
		while (!this.aClass362_38.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_38.method8531();
			Static40.anIntArray562[local11++] = (int) local19.aLong314;
			super.anInt8965 -= local19.anInt5996;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static40.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static40.anIntArray562, 0);
			local11 = 0;
		}
		while (!this.aClass362_39.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_39.method8531();
			Static40.anIntArray562[local11++] = (int) local19.aLong314;
			super.anInt8966 -= local19.anInt5996;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static40.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static40.anIntArray562, 0);
			local11 = 0;
		}
		while (!this.aClass362_40.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_40.method8531();
			Static40.anIntArray562[local11++] = local19.anInt5996;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static40.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static40.anIntArray562, 0);
			local11 = 0;
		}
		while (!this.aClass362_41.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_41.method8531();
			Static40.anIntArray562[local11++] = (int) local19.aLong314;
			super.anInt8963 -= local19.anInt5996;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static40.anIntArray562, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static40.anIntArray562, 0);
		}
		while (!this.aClass362_37.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_37.method8531();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5996);
		}
		@Pc(208) Class6 local208;
		while (!this.aClass362_42.method8541()) {
			local208 = this.aClass362_42.method8531();
			OpenGL.glDeleteProgramARB((int) local208.aLong314);
		}
		while (!this.aClass362_43.method8541()) {
			local208 = this.aClass362_43.method8531();
			OpenGL.glDeleteObjectARB(local208.aLong314);
		}
		while (!this.aClass362_37.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_37.method8531();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5996);
		}
		if (this.E() > 100663296 && Static566.method7936() > this.aLong205 + 60000L) {
			System.gc();
			this.aLong205 = Static566.method7936();
		}
		super.method7458(local9);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oea;Lclient!pb;B)Z")
	@Override
	public boolean method7585(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class265 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7450(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "()V")
	@Override
	public void method7477() {
		if (super.anInt8924 <= 0 && super.anInt8893 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt9001;
		@Pc(19) int local19 = super.anInt8985;
		@Pc(22) int local22 = super.anInt8976;
		@Pc(25) int local25 = super.anInt8999;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7540();
		this.method7642(false);
		this.method7536(false);
		this.method7623(false);
		this.method7622(false);
		this.method7635((Interface17) null);
		this.method7610(false, false, -2);
		this.method7652(1);
		this.method7547(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8924, super.anInt8893, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!oaa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8893 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt7181, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "(I)V")
	@Override
	protected void method7537() {
		if (super.aBoolean641) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "hb", descriptor = "(I)V")
	private void method6165() {
		if (this.aBoolean472) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass342_7.method8053()) {
			if (!this.aBoolean471) {
				OpenGL.glLoadMatrixf(super.aClass207_Sub3_18.method8236(Static600.aFloatArray73), 0);
				this.aBoolean471 = true;
				this.method7580();
				this.method7570();
			}
			if (super.aBoolean623) {
				this.aBoolean472 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass207_Sub3_15.method8236(Static600.aFloatArray73), 0);
				this.aBoolean472 = true;
			}
		} else if (super.aBoolean623) {
			OpenGL.glLoadIdentity();
			this.aBoolean472 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass207_Sub3_15.method8236(Static600.aFloatArray73), 0);
			this.aBoolean472 = false;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZII)V")
	public synchronized void method6166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub36 local8 = new Class6_Sub36(arg0);
		local8.aLong314 = (long) arg1;
		this.aClass362_39.method8536(local8);
	}

	@OriginalMember(owner = "client!oaa", name = "Y", descriptor = "(I)V")
	@Override
	protected void method7627() {
		Static228.aFloatArray11[2] = super.aFloat179 * super.aFloat176;
		Static228.aFloatArray11[1] = super.aFloat176 * super.aFloat171;
		Static228.aFloatArray11[3] = 1.0F;
		Static228.aFloatArray11[0] = super.aFloat168 * super.aFloat176;
		OpenGL.glLightfv(16384, 4609, Static228.aFloatArray11, 0);
		Static228.aFloatArray11[3] = 1.0F;
		Static228.aFloatArray11[1] = super.aFloat171 * -super.aFloat169;
		Static228.aFloatArray11[2] = super.aFloat179 * -super.aFloat169;
		Static228.aFloatArray11[0] = super.aFloat168 * -super.aFloat169;
		OpenGL.glLightfv(16385, 4609, Static228.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIZLclient!vq;Z)V")
	@Override
	public void method7612(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class378 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static163.method2340(arg2));
		if (arg3) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!mia;)V")
	@Override
	public void method7489(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(BI)V")
	@Override
	public void method7560(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7622(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "()V")
	@Override
	public void method7499() {
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(II)V")
	@Override
	public void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!rh;B)V")
	@Override
	public void method7577(@OriginalArg(0) Class305 arg0) {
		if (Static357.aClass305_1 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(10) int local10 = Static86.method1491(arg0);
		OpenGL.glTexGeni(8192, 9472, local10);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local10);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local10);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "(Z)V")
	@Override
	protected void method7632() {
		this.method6165();
	}

	@OriginalMember(owner = "client!oaa", name = "O", descriptor = "(I)V")
	@Override
	protected void method7602() {
		OpenGL.glActiveTexture(super.anInt8970 + 33984);
	}

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "()V")
	@Override
	public void method7493() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!daa;II)V")
	@Override
	public void method7546(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) byte local16;
		@Pc(20) int local20;
		if (Static550.aClass60_5 == arg0) {
			local20 = arg2 * 2;
			local16 = 1;
		} else if (arg0 == Static252.aClass60_2) {
			local16 = 3;
			local20 = arg2 + 1;
		} else if (arg0 == Static122.aClass60_1) {
			local16 = 4;
			local20 = arg2 * 3;
		} else if (Static648.aClass60_6 == arg0) {
			local16 = 6;
			local20 = arg2 + 2;
		} else if (arg0 == Static265.aClass60_3) {
			local20 = arg2 + 2;
			local16 = 5;
		} else {
			local20 = arg2;
			local16 = 0;
		}
		OpenGL.glDrawArrays(local16, arg1, local20);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method7578(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(15) Long local15 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local15);
	}

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "(I)V")
	@Override
	protected void method7569() {
		OpenGL.glTexEnvi(8960, 34162, Static563.method7906(super.aClass322Array6[super.anInt8970]));
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZIII[I)Lclient!bw;")
	@Override
	public Interface2 method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5) {
		if (this.aBoolean478 || Static177.method2498(arg0) && Static177.method2498(arg1)) {
			return new Class23_Sub2(this, arg0, arg1, arg2, arg5, 0, arg3);
		} else if (this.aBoolean479) {
			return new Class23_Sub4(this, arg0, arg1, arg5, 0, arg3);
		} else {
			@Pc(37) Class23_Sub2 local37 = new Class23_Sub2(this, Static169.aClass265_9, Static417.aClass250_14, Static655.method8912(arg0), Static655.method8912(arg1));
			local37.method8903(arg5, arg3, 0, arg1, 0, arg0);
			return local37;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!cn;Lclient!rca;)Lclient!mia;")
	@Override
	public Interface16 method7463(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method7640(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local14);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!pb;ILclient!oea;BI)Lclient!bw;")
	@Override
	public Interface2 method7638(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean478 || Static177.method2498(arg1) && Static177.method2498(arg3)) {
			return new Class23_Sub2(this, arg0, arg2, arg1, arg3);
		} else if (this.aBoolean479) {
			return new Class23_Sub4(this, arg0, arg2, arg1, arg3);
		} else {
			return new Class23_Sub2(this, arg0, arg2, Static655.method8912(arg1), Static655.method8912(arg3));
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method7574(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(B)V")
	@Override
	protected void method7563() {
		super.aFloat165 = (float) (-super.anInt8982 + super.anInt9004);
		super.aFloat166 = (float) -super.anInt9002 + super.aFloat165;
		if (super.aFloat166 < (float) super.bf) {
			super.aFloat166 = (float) super.bf;
		}
		OpenGL.glFogf(2915, super.aFloat166);
		OpenGL.glFogf(2916, super.aFloat165);
		Static228.aFloatArray11[0] = (float) (super.anInt8984 & 0xFF0000) / 1.671168E7F;
		Static228.aFloatArray11[2] = (float) (super.anInt8984 & 0xFF) / 255.0F;
		Static228.aFloatArray11[1] = (float) (super.anInt8984 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static228.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "(I)V")
	@Override
	protected void method7554() {
		OpenGL.glMatrixMode(5890);
		if (Static379.aClass257_6 == super.aClass257Array3[super.anInt8970]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass207_Sub3Array3[super.anInt8970].method8236(Static600.aFloatArray73), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZ)Lclient!pm;")
	@Override
	public Interface21 method7532(@OriginalArg(1) boolean arg0) {
		return new Class72_Sub2(this, Static417.aClass250_15, arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7500() {
		return false;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ok;Lclient!ok;FLclient!ok;)Lclient!ok;")
	@Override
	public Class25 method7457(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "(B)V")
	@Override
	protected void method7594() {
		if (super.aBoolean639) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZIII[FLclient!pb;)Lclient!bw;")
	@Override
	protected Interface2 method7591(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) float[] arg3, @OriginalArg(7) Class265 arg4) {
		if (this.aBoolean478 || Static177.method2498(arg2) && Static177.method2498(arg0)) {
			return new Class23_Sub2(this, arg4, arg2, arg0, arg1, arg3, 0, 0);
		} else if (this.aBoolean479) {
			return new Class23_Sub4(this, arg4, arg2, arg0, arg3, 0, 0);
		} else {
			@Pc(50) Class23_Sub2 local50 = new Class23_Sub2(this, arg4, Static417.aClass250_18, Static655.method8912(arg2), Static655.method8912(arg0));
			local50.method3893(arg3, arg4, arg0, arg2);
			return local50;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "V", descriptor = "(I)V")
	@Override
	protected void method7621() {
		OpenGL.glViewport(super.anInt8972, super.anInt8977, super.anInt8924, super.anInt8893);
	}

	@OriginalMember(owner = "client!oaa", name = "W", descriptor = "(I)V")
	@Override
	protected void method7625() {
		this.aBoolean471 = false;
		this.method6165();
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(Z)V")
	@Override
	protected void method7555() {
		OpenGL.glScissor(super.anInt8972 + super.anInt9001, super.anInt8893 + (super.anInt8977 - super.anInt8999), -super.anInt9001 + super.anInt8985, super.anInt8999 - super.anInt8976);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!pb;[BIII)Lclient!at;")
	@Override
	public Interface1 method7575(@OriginalArg(1) Class265 arg0, @OriginalArg(2) byte[] arg1) {
		return new Class23_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLclient!vq;IZ)V")
	@Override
	protected void method7568(@OriginalArg(1) Class378 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static163.method2340(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oea;ILclient!pb;)Z")
	@Override
	public boolean method7634(@OriginalArg(0) Class250 arg0, @OriginalArg(2) Class265 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "(I)V")
	@Override
	public void method7580() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray63, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "(Z)V")
	@Override
	protected void method7562() {
		if (super.aBoolean635 && super.aBoolean637 && super.anInt9002 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BILclient!daa;Lclient!pm;III)V")
	@Override
	public void method7573(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Interface21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static550.aClass60_5 == arg1) {
			local12 = arg3 * 2;
			local14 = 1;
		} else if (arg1 == Static252.aClass60_2) {
			local12 = arg3 + 1;
			local14 = 3;
		} else if (arg1 == Static122.aClass60_1) {
			local14 = 4;
			local12 = arg3 * 3;
		} else if (arg1 == Static648.aClass60_6) {
			local14 = 6;
			local12 = arg3 + 2;
		} else if (Static265.aClass60_3 == arg1) {
			local14 = 5;
			local12 = arg3 + 2;
		} else {
			local12 = arg3;
			local14 = 0;
		}
		@Pc(68) Class250 local68 = arg2.method5807();
		@Pc(71) Class72_Sub2 local71 = (Class72_Sub2) arg2;
		local71.method5805();
		OpenGL.glDrawElements(local14, local12, Static541.method5282(local68), local71.method5801() + (long) (local68.anInt7253 * arg0));
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLclient!fw;I)V")
	@Override
	public void method7529(@OriginalArg(1) Interface12 arg0, @OriginalArg(2) int arg1) {
		this.aClass72_Sub1Array1[arg1] = (Class72_Sub1) arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "(I)V")
	@Override
	protected void method7558() {
		if (super.aBoolean627 && !super.aBoolean625) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method7579(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "(I)V")
	@Override
	protected void method7535() {
		OpenGL.glDepthMask(super.aBoolean633 && super.aBoolean631);
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(Z)V")
	@Override
	protected void method7527() {
		if (super.aBoolean644) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}
}
