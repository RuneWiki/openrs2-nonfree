import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!gf", name = "gi", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!gf", name = "Zh", descriptor = "Lclient!eea;")
	private final Class71 aClass71_27 = new Class71();

	@OriginalMember(owner = "client!gf", name = "ai", descriptor = "Lclient!eea;")
	private final Class71 aClass71_28 = new Class71();

	@OriginalMember(owner = "client!gf", name = "bi", descriptor = "Lclient!eea;")
	private final Class71 aClass71_29 = new Class71();

	@OriginalMember(owner = "client!gf", name = "ci", descriptor = "Lclient!eea;")
	private final Class71 aClass71_30 = new Class71();

	@OriginalMember(owner = "client!gf", name = "di", descriptor = "Lclient!eea;")
	private final Class71 aClass71_31 = new Class71();

	@OriginalMember(owner = "client!gf", name = "ei", descriptor = "Lclient!eea;")
	private final Class71 aClass71_32 = new Class71();

	@OriginalMember(owner = "client!gf", name = "fi", descriptor = "Lclient!eea;")
	private final Class71 aClass71_33 = new Class71();

	@OriginalMember(owner = "client!gf", name = "hi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!gf", name = "ki", descriptor = "I")
	private final int anInt3689 = 0;

	@OriginalMember(owner = "client!gf", name = "pi", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!gf", name = "tg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!gf", name = "qi", descriptor = "Ljava/lang/String;")
	private final String aString31;

	@OriginalMember(owner = "client!gf", name = "ni", descriptor = "Ljava/lang/String;")
	private final String aString30;

	@OriginalMember(owner = "client!gf", name = "oi", descriptor = "I")
	private final int anInt3690;

	@OriginalMember(owner = "client!gf", name = "ri", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!gf", name = "ji", descriptor = "Z")
	private boolean aBoolean268;

	@OriginalMember(owner = "client!gf", name = "si", descriptor = "Z")
	private final boolean aBoolean272;

	@OriginalMember(owner = "client!gf", name = "li", descriptor = "Z")
	public final boolean aBoolean269;

	@OriginalMember(owner = "client!gf", name = "ii", descriptor = "I")
	public final int anInt3688;

	@OriginalMember(owner = "client!gf", name = "mi", descriptor = "[I")
	public final int[] anIntArray363;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!e;Lclient!kea;I)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString31 = OpenGL.glGetString(7936).toLowerCase();
			this.aString30 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString31.indexOf("microsoft") != -1 || this.aString31.indexOf("brian paul") != -1 || this.aString31.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(104) String local104 = OpenGL.glGetString(7938);
			@Pc(112) String[] local112 = Static439.method6626(' ', local104.replace('.', ' '));
			if (local112.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(130) int local130;
			try {
				@Pc(124) int local124 = Static454.method6837(local112[0]);
				local130 = Static454.method6837(local112[1]);
				this.anInt3690 = local130 + local124 * 10;
			} catch (@Pc(139) NumberFormatException local139) {
				throw new RuntimeException("");
			}
			if (this.anInt3690 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(183) int[] local183 = new int[1];
				OpenGL.glGetIntegerv(34018, local183, 0);
				super.anInt7760 = local183[0];
				if (super.anInt7760 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7783 = 8;
				this.aBoolean271 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean532 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean268 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean541 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean272 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean543 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean269 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anInt3688 = Stream.c() ? 33639 : 5121;
				if (this.aString30.indexOf("radeon") != -1) {
					local130 = 0;
					@Pc(279) boolean local279 = false;
					@Pc(281) boolean local281 = false;
					@Pc(290) String[] local290 = Static439.method6626(' ', this.aString30.replace('/', ' '));
					for (@Pc(292) int local292 = 0; local292 < local290.length; local292++) {
						@Pc(298) String local298 = local290[local292];
						try {
							if (local298.length() > 0) {
								if (local298.charAt(0) == 'x' && local298.length() >= 3 && Static521.method7402(local298.substring(1, 3))) {
									local298 = local298.substring(1);
									local281 = true;
								}
								if (local298.equals("hd")) {
									local279 = true;
								} else {
									if (local298.startsWith("hd")) {
										local298 = local298.substring(2);
										local279 = true;
									}
									if (local298.length() >= 4 && Static521.method7402(local298.substring(0, 4))) {
										local130 = Static454.method6837(local298.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(368) Exception local368) {
						}
					}
					if (!local281 && !local279) {
						if (local130 >= 7000 && local130 <= 7999) {
							this.aBoolean271 = false;
						}
						if (local130 >= 7000 && local130 <= 9250) {
							super.aBoolean543 = false;
						}
					}
					this.aBoolean268 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString31.indexOf("intel");
				if (this.aBoolean271) {
					try {
						@Pc(416) int[] local416 = new int[1];
						OpenGL.glGenBuffersARB(1, local416, 0);
					} catch (@Pc(422) Throwable local422) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray363 = new int[super.anInt7760];
				OpenGL.glClear(16640);
				this.anOpenGL2.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(441) Throwable local441) {
			local441.printStackTrace();
			this.method7447();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(II)V")
	@Override
	public void method6316(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIILclient!fea;Lclient!nq;)V")
	@Override
	public void method6295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class87 arg4, @OriginalArg(6) Interface14 arg5) {
		@Pc(20) byte local20;
		@Pc(24) int local24;
		if (Static94.aClass87_4 == arg4) {
			local24 = arg1 * 2;
			local20 = 1;
		} else if (Static478.aClass87_6 == arg4) {
			local24 = arg1 + 1;
			local20 = 3;
		} else if (Static524.aClass87_7 == arg4) {
			local20 = 4;
			local24 = arg1 * 3;
		} else if (arg4 == Static328.aClass87_5) {
			local24 = arg1 + 2;
			local20 = 6;
		} else if (arg4 == Static543.aClass87_8) {
			local24 = arg1 + 2;
			local20 = 5;
		} else {
			local20 = 0;
			local24 = arg1;
		}
		@Pc(72) Class310 local72 = arg5.method3134();
		@Pc(75) Class79_Sub1 local75 = (Class79_Sub1) arg5;
		local75.method2329();
		OpenGL.glDrawElements(local20, local24, Static138.method2343(local72), local75.method2330() + (long) (local72.anInt9119 * arg3));
	}

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "()Z")
	@Override
	public boolean method7441() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "(I)V")
	@Override
	protected void method6300() {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7427(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub47 local19;
		while (!this.aClass71_28.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_28.method2084();
			Static75.anIntArray737[local11++] = (int) local19.aLong285;
			super.anInt7745 -= local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static75.anIntArray737, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static75.anIntArray737, 0);
			local11 = 0;
		}
		while (!this.aClass71_29.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_29.method2084();
			Static75.anIntArray737[local11++] = (int) local19.aLong285;
			super.anInt7743 -= local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static75.anIntArray737, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static75.anIntArray737, 0);
			local11 = 0;
		}
		while (!this.aClass71_30.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_30.method2084();
			Static75.anIntArray737[local11++] = local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static75.anIntArray737, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static75.anIntArray737, 0);
			local11 = 0;
		}
		while (!this.aClass71_31.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_31.method2084();
			Static75.anIntArray737[local11++] = (int) local19.aLong285;
			super.anInt7741 -= local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static75.anIntArray737, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static75.anIntArray737, 0);
		}
		while (!this.aClass71_27.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_27.method2084();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt8701);
		}
		@Pc(220) Class3 local220;
		while (!this.aClass71_32.method2085()) {
			local220 = this.aClass71_32.method2084();
			OpenGL.glDeleteProgramARB((int) local220.aLong285);
		}
		while (!this.aClass71_33.method2085()) {
			local220 = this.aClass71_33.method2084();
			OpenGL.glDeleteObjectARB(local220.aLong285);
		}
		while (!this.aClass71_27.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_27.method2084();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt8701);
		}
		if (this.v() > 100663296 && this.aLong91 + 60000L < Static12.method647()) {
			System.gc();
			this.aLong91 = Static12.method647();
		}
		super.method7427(local9);
	}

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "(I)V")
	@Override
	protected void method6426() {
		OpenGL.glActiveTexture(super.anInt7746 + 33984);
	}

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "()Lclient!nl;")
	@Override
	public Class207 method7430() {
		@Pc(7) int local7 = -1;
		if (this.aString31.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString31.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString31.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class207(local7, "OpenGL", this.anInt3690, this.aString30, 0L);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!dw;Lclient!dw;FLclient!dw;)Lclient!dw;")
	@Override
	public Class66 method7450(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class66 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)V")
	@Override
	public void method7455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(B)V")
	@Override
	protected void method6338() {
		OpenGL.glTexEnvi(8960, 34162, Static169.method3221(super.aClass289Array5[super.anInt7746]));
	}

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "(I)V")
	@Override
	protected void method6390() {
		Static306.aFloatArray41[2] = super.aFloat219 * super.aFloat225;
		Static306.aFloatArray41[0] = super.aFloat226 * super.aFloat219;
		Static306.aFloatArray41[1] = super.aFloat219 * super.aFloat220;
		Static306.aFloatArray41[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static306.aFloatArray41, 0);
		Static306.aFloatArray41[1] = super.aFloat220 * -super.aFloat232;
		Static306.aFloatArray41[2] = -super.aFloat232 * super.aFloat225;
		Static306.aFloatArray41[0] = super.aFloat226 * -super.aFloat232;
		Static306.aFloatArray41[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static306.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "(I)V")
	@Override
	protected void method6308() {
		OpenGL.glDepthMask(super.aBoolean530 && super.aBoolean539);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IZ)V")
	@Override
	public void method6372(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "(B)V")
	@Override
	protected void method6386() {
		if (super.aBoolean526) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!gf", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return this.anInt3689;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([Lclient!ck;Z)Lclient!ep;")
	@Override
	public Class76 method6361(@OriginalArg(0) Class50[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIZLclient!km;Z)V")
	@Override
	public void method6358(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class166 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static311.method5069(arg2));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "(I)V")
	@Override
	protected void method6393() {
		if (super.aBoolean527) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!gf", name = "ab", descriptor = "(I)V")
	private void method3093() {
		if (this.aBoolean270) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass246_9.method6019()) {
			if (!this.aBoolean270) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass205_Sub1_18.method5226(Static498.aFloatArray72), 0);
				this.method6351();
				this.method6368();
				this.aBoolean270 = true;
			}
			if (this.aBoolean270) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean525) {
				OpenGL.glMultMatrixf(super.aClass205_Sub1_15.method5226(Static498.aFloatArray72), 0);
			}
		} else if (super.aBoolean525) {
			OpenGL.glLoadIdentity();
			this.aBoolean270 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass205_Sub1_15.method5226(Static498.aFloatArray72), 0);
			this.aBoolean270 = false;
		}
	}

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "(I)F")
	@Override
	protected float method6304() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(B)V")
	@Override
	protected void method6340() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass243Array3[super.anInt7746] == Static95.aClass243_6) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass205_Sub1Array3[super.anInt7746].method5226(Static498.aFloatArray72), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "(I)V")
	@Override
	protected void method6407() {
		OpenGL.glScissor(super.anInt7775 + super.anInt7751, super.anInt7640 + super.anInt7774 + -super.anInt7782, super.anInt7769 - super.anInt7751, -super.anInt7750 + super.anInt7782);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "()V")
	@Override
	public void method7413() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "(I)V")
	@Override
	protected void method6391() {
		if (super.aBoolean534 && !super.aBoolean535) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!kp;BLclient!vt;)Z")
	@Override
	public boolean method6310(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class310 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "(I)V")
	@Override
	protected void method6368() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < super.anInt7759; local15++) {
			@Pc(22) Class3_Sub30 local22 = super.aClass3_Sub30Array6[local15];
			@Pc(26) int local26 = local22.method5391();
			@Pc(30) int local30 = local15 + 16386;
			@Pc(36) float local36 = local22.method5382() / 255.0F;
			Static306.aFloatArray41[0] = local22.method5386();
			Static306.aFloatArray41[1] = local22.method5390();
			Static306.aFloatArray41[2] = local22.method5388();
			Static306.aFloatArray41[3] = 1.0F;
			OpenGL.glLightfv(local30, 4611, Static306.aFloatArray41, 0);
			Static306.aFloatArray41[2] = local36 * (float) (local26 & 0xFF);
			Static306.aFloatArray41[1] = local36 * (float) (local26 >> 8 & 0xFF);
			Static306.aFloatArray41[0] = (float) (local26 >> 16 & 0xFF) * local36;
			Static306.aFloatArray41[3] = 1.0F;
			OpenGL.glLightfv(local30, 4609, Static306.aFloatArray41, 0);
			OpenGL.glLightf(local30, 4617, 1.0F / (float) (local22.method5387() * local22.method5387()));
			OpenGL.glEnable(local30);
		}
		while (local15 < super.anInt7763) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		super.method6368();
	}

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6383() {
		OpenGL.glTexEnvi(8960, 34161, Static169.method3221(super.aClass289Array6[super.anInt7746]));
	}

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "(I)V")
	@Override
	protected void method6420() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray50, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "()V")
	@Override
	public void method7420() {
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6380(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6298() {
		if (super.aBoolean538) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method6350(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(10) Long local10 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local10);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(BZ)Lclient!nq;")
	@Override
	public Interface14 method6325(@OriginalArg(1) boolean arg0) {
		return new Class79_Sub1(this, Static524.aClass310_17, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!kp;I[BZBI)Lclient!ica;")
	@Override
	protected Interface9 method6360(@OriginalArg(1) int arg0, @OriginalArg(2) Class167 arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean272 || Static260.method4582(arg0) && Static260.method4582(arg4)) {
			return new Class8_Sub1(this, arg1, arg0, arg4, arg3, arg2, 0, 0);
		} else if (this.aBoolean268) {
			return new Class8_Sub2(this, arg1, arg0, arg4, arg2, 0, 0);
		} else {
			@Pc(47) Class8_Sub1 local47 = new Class8_Sub1(this, arg1, Static524.aClass310_16, Static483.method7134(arg0), Static483.method7134(arg4));
			local47.method3274(0, arg0, arg1, arg2, arg4);
			return local47;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI[[IZ)Lclient!wn;")
	@Override
	public Interface20 method6379(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2) {
		return new Class8_Sub3(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "(B)V")
	@Override
	protected void method6418() {
		if (super.aBoolean545) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIB)V")
	public synchronized void method3094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class3_Sub47 local18 = new Class3_Sub47(arg1);
		local18.aLong285 = arg0;
		this.aClass71_28.method2076(local18);
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(Z)V")
	@Override
	protected void method6301() {
		if (super.aBoolean537) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7410(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "()V")
	@Override
	public void method7428() {
		if (super.anInt7674 <= 0 && super.anInt7640 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt7751;
		@Pc(19) int local19 = super.anInt7769;
		@Pc(22) int local22 = super.anInt7750;
		@Pc(25) int local25 = super.anInt7782;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6423();
		this.method6428(false);
		this.method6349(false);
		this.method6414(false);
		this.method6311(false);
		this.method6416(null);
		this.method6299(false, -2, false);
		this.method6309(1);
		this.method6398(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7674, super.anInt7640, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6328() {
		Static306.aFloatArray41[2] = super.aFloat228 * super.aFloat225;
		Static306.aFloatArray41[0] = super.aFloat226 * super.aFloat228;
		Static306.aFloatArray41[3] = 1.0F;
		Static306.aFloatArray41[1] = super.aFloat220 * super.aFloat228;
		OpenGL.glLightModelfv(2899, Static306.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V")
	public synchronized void method3095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub47 local8 = new Class3_Sub47(arg0);
		local8.aLong285 = arg1;
		this.aClass71_29.method2076(local8);
	}

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "(Z)V")
	@Override
	protected void method6362() {
		for (@Pc(10) int local10 = super.anInt7760 - 1; local10 >= 0; local10--) {
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
		OpenGL.glDisable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(71) float[] local71 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(73) int local73 = 0; local73 < 8; local73++) {
			@Pc(80) int local80 = local73 + 16384;
			OpenGL.glLightfv(local80, 4608, local71, 0);
			OpenGL.glLightf(local80, 4615, 0.0F);
			OpenGL.glLightf(local80, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method6362();
	}

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "(B)V")
	@Override
	protected void method6429() {
		@Pc(46) int local46;
		if (super.aBoolean531) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local46 = super.anInt7772;
		} else {
			super.aFloat217 = -super.anInt7773 + super.anInt7757;
			super.aFloat230 = super.aFloat217 - (float) super.anInt7764;
			if (super.aFloat230 < (float) super.anInt7778) {
				super.aFloat230 = super.anInt7778;
			}
			OpenGL.glFogf(2915, super.aFloat230);
			OpenGL.glFogf(2916, super.aFloat217);
			local46 = super.anInt7785;
		}
		Static306.aFloatArray41[2] = (float) (local46 & 0xFF) / 255.0F;
		Static306.aFloatArray41[1] = (float) (local46 & 0xFF00) / 65280.0F;
		Static306.aFloatArray41[0] = (float) (local46 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static306.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "(I)V")
	@Override
	protected void method6313() {
		this.method3093();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!lk;I)V")
	@Override
	public void method6394(@OriginalArg(0) Class177 arg0) {
		if (arg0 == Static331.aClass177_3) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(29) int local29 = Static393.method5995(arg0);
		OpenGL.glTexGeni(8192, 9472, local29);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local29);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local29);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
	@Override
	protected void method6327() {
		Static306.aFloatArray41[0] = (float) (super.anInt7749 & 0xFF0000) / 1.671168E7F;
		Static306.aFloatArray41[2] = (float) (super.anInt7749 & 0xFF) / 255.0F;
		Static306.aFloatArray41[3] = (float) (super.anInt7749 >>> 24) / 255.0F;
		Static306.aFloatArray41[1] = (float) (super.anInt7749 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static306.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(BZ)Lclient!cca;")
	@Override
	public Interface3 method6422(@OriginalArg(1) boolean arg0) {
		return new Class79_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "()V")
	@Override
	public void method7453() {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZIII[II)Lclient!ica;")
	@Override
	public Interface9 method6321(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean272 || Static260.method4582(arg5) && Static260.method4582(arg2)) {
			return new Class8_Sub1(this, arg5, arg2, arg0, arg4, 0, arg3);
		} else if (this.aBoolean268) {
			return new Class8_Sub2(this, arg5, arg2, arg4, 0, arg3);
		} else {
			@Pc(45) Class8_Sub1 local45 = new Class8_Sub1(this, Static468.aClass167_14, Static524.aClass310_16, Static483.method7134(arg5), Static483.method7134(arg2));
			local45.method3271(0, arg3, arg5, 0, arg4, arg2);
			return local45;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z[FIILclient!kp;IIZ)Lclient!ica;")
	@Override
	protected Interface9 method6403(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4) {
		if (this.aBoolean272 || Static260.method4582(arg2) && Static260.method4582(arg4)) {
			return new Class8_Sub1(this, arg3, arg2, arg4, arg0, arg1, 0, 0);
		} else if (this.aBoolean268) {
			return new Class8_Sub2(this, arg3, arg2, arg4, arg1, 0, 0);
		} else {
			@Pc(36) Class8_Sub1 local36 = new Class8_Sub1(this, arg3, Static524.aClass310_20, Static483.method7134(arg2), Static483.method7134(arg4));
			local36.method1743(arg2, arg1, arg3, arg4);
			return local36;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!km;ZIB)V")
	@Override
	protected void method6413(@OriginalArg(0) Class166 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static311.method5069(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!kp;Lclient!vt;)Z")
	@Override
	public boolean method6307(@OriginalArg(1) Class167 arg0, @OriginalArg(2) Class310 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7417(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7449();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method6324(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local10)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "()V")
	@Override
	protected void method7447() {
		super.method7447();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "(B)V")
	@Override
	protected void method6397() {
		this.method3093();
	}

	@OriginalMember(owner = "client!gf", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7640 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt3688, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!kp;Lclient!vt;III)Lclient!ica;")
	@Override
	public Interface9 method6400(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean272 || Static260.method4582(arg2) && Static260.method4582(arg3)) {
			return new Class8_Sub1(this, arg0, arg1, arg2, arg3);
		} else if (this.aBoolean268) {
			return new Class8_Sub2(this, arg0, arg1, arg2, arg3);
		} else {
			return new Class8_Sub1(this, arg0, arg1, Static483.method7134(arg2), Static483.method7134(arg3));
		}
	}

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "(B)V")
	@Override
	protected void method6404() {
		if (super.aClass223_5 == Static146.aClass223_1) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass223_5 == Static459.aClass223_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static508.aClass223_7 == super.aClass223_5) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!kp;IIB[B)Lclient!kc;")
	@Override
	public Interface13 method6402(@OriginalArg(1) Class167 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class8_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "()Z")
	@Override
	public boolean method7472() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!cca;II)V")
	@Override
	public void method6382(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "()V")
	@Override
	public void method7444() {
		this.method6311(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "(II)Lclient!ic;")
	@Override
	protected Class120 method6425(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class120_Sub2(this, super.aClass161_93);
		} else if (arg0 == 4) {
			return new Class120_Sub8(this, super.aClass161_93, super.aClass164_5);
		} else {
			return super.method6425(arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "(B)V")
	@Override
	protected void method6346() {
		OpenGL.glViewport(super.anInt7775, super.anInt7774, super.anInt7674, super.anInt7640);
	}

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "()V")
	@Override
	public void method7449() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILclient!fea;)V")
	@Override
	public void method6329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class87 arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static94.aClass87_4 == arg2) {
			local10 = 1;
			local14 = arg1 * 2;
		} else if (arg2 == Static478.aClass87_6) {
			local14 = arg1 + 1;
			local10 = 3;
		} else if (Static524.aClass87_7 == arg2) {
			local10 = 4;
			local14 = arg1 * 3;
		} else if (Static328.aClass87_5 == arg2) {
			local14 = arg1 + 2;
			local10 = 6;
		} else if (arg2 == Static543.aClass87_8) {
			local14 = arg1 + 2;
			local10 = 5;
		} else {
			local14 = arg1;
			local10 = 0;
		}
		OpenGL.glDrawArrays(local10, arg0, local14);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ep;)V")
	@Override
	public void method6333(@OriginalArg(1) Class76 arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "(I)V")
	@Override
	public void method6351() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray53, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)V")
	public synchronized void method3096(@OriginalArg(0) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong285 = arg0;
		this.aClass71_32.method2076(local7);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method6406(@OriginalArg(0) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL2.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "(B)V")
	@Override
	protected void method6408() {
		if (super.aBoolean542 && super.aBoolean544 && super.aBoolean531 | super.anInt7764 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "(B)V")
	@Override
	protected void method6396() {
		@Pc(15) int local15 = this.anIntArray363[super.anInt7746];
		if (local15 != 0) {
			this.anIntArray363[super.anInt7746] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}
}
