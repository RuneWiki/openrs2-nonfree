import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class44_Sub2_Sub1 extends Class44_Sub2 {

	@OriginalMember(owner = "client!dda", name = "gi", descriptor = "Z")
	private boolean aBoolean138;

	@OriginalMember(owner = "client!dda", name = "ii", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "client!dda", name = "ji", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!dda", name = "ki", descriptor = "Z")
	private boolean aBoolean141;

	@OriginalMember(owner = "client!dda", name = "li", descriptor = "Z")
	private boolean aBoolean142;

	@OriginalMember(owner = "client!dda", name = "mi", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!dda", name = "ni", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!dda", name = "zg", descriptor = "Lclient!oe;")
	private final Class244 aClass244_10 = new Class244();

	@OriginalMember(owner = "client!dda", name = "ai", descriptor = "Lclient!oe;")
	private final Class244 aClass244_12 = new Class244();

	@OriginalMember(owner = "client!dda", name = "bi", descriptor = "Lclient!oe;")
	private final Class244 aClass244_13 = new Class244();

	@OriginalMember(owner = "client!dda", name = "ci", descriptor = "Lclient!oe;")
	private final Class244 aClass244_14 = new Class244();

	@OriginalMember(owner = "client!dda", name = "di", descriptor = "Lclient!oe;")
	private final Class244 aClass244_15 = new Class244();

	@OriginalMember(owner = "client!dda", name = "ei", descriptor = "Lclient!oe;")
	private final Class244 aClass244_16 = new Class244();

	@OriginalMember(owner = "client!dda", name = "fi", descriptor = "Lclient!oe;")
	private final Class244 aClass244_17 = new Class244();

	@OriginalMember(owner = "client!dda", name = "hi", descriptor = "[Lclient!jga;")
	private final Class172_Sub1[] aClass172_Sub1Array1 = new Class172_Sub1[16];

	@OriginalMember(owner = "client!dda", name = "oi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!dda", name = "pi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!dda", name = "Bi", descriptor = "I")
	private final int anInt2123 = 0;

	@OriginalMember(owner = "client!dda", name = "jh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!dda", name = "qi", descriptor = "Ljava/lang/String;")
	private final String aString6;

	@OriginalMember(owner = "client!dda", name = "ui", descriptor = "Ljava/lang/String;")
	private final String aString7;

	@OriginalMember(owner = "client!dda", name = "si", descriptor = "I")
	private final int anInt2121;

	@OriginalMember(owner = "client!dda", name = "zi", descriptor = "Z")
	public boolean aBoolean148;

	@OriginalMember(owner = "client!dda", name = "ti", descriptor = "Z")
	private boolean aBoolean144;

	@OriginalMember(owner = "client!dda", name = "vi", descriptor = "Z")
	private final boolean aBoolean145;

	@OriginalMember(owner = "client!dda", name = "ri", descriptor = "Z")
	public final boolean aBoolean143;

	@OriginalMember(owner = "client!dda", name = "yi", descriptor = "Z")
	public final boolean aBoolean147;

	@OriginalMember(owner = "client!dda", name = "xi", descriptor = "Z")
	public final boolean aBoolean146;

	@OriginalMember(owner = "client!dda", name = "Ai", descriptor = "[I")
	public final int[] anIntArray83;

	@OriginalMember(owner = "client!dda", name = "wi", descriptor = "I")
	public final int anInt2122;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!fa;Lclient!jn;I)V")
	public Class44_Sub2_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class176 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString6 = OpenGL.glGetString(7936).toLowerCase();
			this.aString7 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString6.indexOf("microsoft") != -1 || this.aString6.indexOf("brian paul") != -1 || this.aString6.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(107) String local107 = OpenGL.glGetString(7938);
			@Pc(115) String[] local115 = Static175.method3185(' ', local107.replace('.', ' '));
			if (local115.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(138) int local138;
			try {
				@Pc(132) int local132 = Static82.method1379(local115[0]);
				local138 = Static82.method1379(local115[1]);
				this.anInt2121 = local138 + local132 * 10;
			} catch (@Pc(147) NumberFormatException local147) {
				throw new RuntimeException("");
			}
			if (this.anInt2121 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(186) int[] local186 = new int[1];
				OpenGL.glGetIntegerv(34018, local186, 0);
				super.anInt4961 = local186[0];
				if (super.anInt4961 < 2) {
					throw new RuntimeException("");
				}
				super.anInt4968 = 8;
				this.aBoolean148 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean351 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean144 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean354 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean145 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean345 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean143 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean147 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean146 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray83 = new int[super.anInt4961];
				this.anInt2122 = Stream.b() ? 33639 : 5121;
				if (this.aString7.indexOf("radeon") != -1) {
					local138 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static175.method3185(' ', this.aString7.replace('/', ' '));
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static220.method3590(local308.substring(1, 3))) {
									local291 = true;
									local308 = local308.substring(1);
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local308 = local308.substring(2);
										local289 = true;
									}
									if (local308.length() >= 4 && Static220.method3590(local308.substring(0, 4))) {
										local138 = Static82.method1379(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(376) Exception local376) {
						}
					}
					if (!local291 && !local289) {
						if (local138 >= 7000 && local138 <= 7999) {
							this.aBoolean148 = false;
						}
						if (local138 >= 7000 && local138 <= 9250) {
							super.aBoolean345 = false;
						}
					}
					this.aBoolean144 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString6.indexOf("intel");
				if (this.aBoolean148) {
					try {
						@Pc(426) int[] local426 = new int[1];
						OpenGL.glGenBuffersARB(1, local426, 0);
					} catch (@Pc(432) Throwable local432) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(438) Throwable local438) {
			local438.printStackTrace();
			this.method5029();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(IZ)V")
	@Override
	public void method4290(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt4807 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt2122, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!fj;I)V")
	@Override
	public void method4374(@OriginalArg(0) Class3 arg0) {
		@Pc(17) Class220[] local17 = ((Class3_Sub1) arg0).aClass220Array1;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local17.length; local27++) {
			@Pc(33) Class220 local33 = local17[local27];
			@Pc(38) Class172_Sub1 local38 = this.aClass172_Sub1Array1[local27];
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = local38.method3881();
			@Pc(48) long local48 = local38.method5232();
			local38.method5225();
			for (@Pc(53) int local53 = 0; local33.method5376() > local53; local53++) {
				@Pc(60) Class326 local60 = local33.method5379(local53);
				if (Static525.aClass326_1 == local60) {
					local25 = true;
					OpenGL.glVertexPointer(3, 5126, local44, (long) local40 + local48);
				} else if (Static525.aClass326_2 == local60) {
					OpenGL.glNormalPointer(5126, local44, (long) local40 + local48);
					local23 = true;
				} else if (local60 == Static525.aClass326_3) {
					OpenGL.glColorPointer(4, 5121, local44, local48 + (long) local40);
					local21 = true;
				} else if (local60 == Static525.aClass326_4) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, local48 + (long) local40);
				} else if (Static525.aClass326_5 == local60) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, (long) local40 + local48);
				} else if (local60 == Static525.aClass326_6) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static525.aClass326_7) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, (long) local40 + local48);
				}
				local40 += local60.anInt9354;
			}
		}
		if (local25 != this.aBoolean140) {
			if (local25) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean140 = local25;
		}
		if (this.aBoolean139 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean139 = local23;
		}
		if (local21 != this.aBoolean138) {
			if (local21) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean138 = local21;
		}
		@Pc(255) int local255;
		if (this.anInt2120 < local19) {
			for (local255 = this.anInt2120; local255 < local19; local255++) {
				OpenGL.glClientActiveTexture(local255 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2120 = local19;
		} else if (this.anInt2120 > local19) {
			for (local255 = local19; local255 < this.anInt2120; local255++) {
				OpenGL.glClientActiveTexture(local255 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2120 = local19;
			return;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILclient!el;)V")
	@Override
	public void method4358(@OriginalArg(1) int arg0, @OriginalArg(2) Interface9 arg1) {
		this.aClass172_Sub1Array1[arg0] = (Class172_Sub1) arg1;
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "()Lclient!ik;")
	@Override
	public Class155 method4985() {
		@Pc(7) int local7 = -1;
		if (this.aString6.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString6.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString6.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class155(local7, "OpenGL", this.anInt2121, this.aString7, 0L);
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(B)V")
	@Override
	protected void method4261() {
		this.method2017();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIILclient!qf;)V")
	@Override
	public void method4262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class271 arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static501.aClass271_7 == arg2) {
			local10 = 1;
			local14 = arg0 * 2;
		} else if (arg2 == Static535.aClass271_9) {
			local14 = arg0 + 1;
			local10 = 3;
		} else if (Static262.aClass271_5 == arg2) {
			local10 = 4;
			local14 = arg0 * 3;
		} else if (arg2 == Static344.aClass271_6) {
			local14 = arg0 + 2;
			local10 = 6;
		} else if (arg2 == Static379.aClass271_8) {
			local14 = arg0 + 2;
			local10 = 5;
		} else {
			local14 = arg0;
			local10 = 0;
		}
		OpenGL.glDrawArrays(local10, arg1, local14);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIILclient!fca;[BIZI)Lclient!co;")
	@Override
	protected Interface6 method4370(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (this.aBoolean145 || Static100.method2181(arg1) && Static100.method2181(arg4)) {
			return new Class196_Sub2(this, arg2, arg1, arg4, arg0, arg3, 0, 0);
		} else if (this.aBoolean144) {
			return new Class196_Sub4(this, arg2, arg1, arg4, arg3, 0, 0);
		} else {
			@Pc(47) Class196_Sub2 local47 = new Class196_Sub2(this, arg2, Static53.aClass42_4, Static341.method5553(arg1), Static341.method5553(arg4));
			local47.method8286(0, arg4, arg1, arg2, arg3);
			return local47;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4992(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!dda", name = "u", descriptor = "(I)V")
	@Override
	protected void method4301() {
		Static223.aFloatArray27[3] = 1.0F;
		Static223.aFloatArray27[2] = super.aFloat150 * super.aFloat155;
		Static223.aFloatArray27[0] = super.aFloat142 * super.aFloat155;
		Static223.aFloatArray27[1] = super.aFloat156 * super.aFloat155;
		OpenGL.glLightfv(16384, 4609, Static223.aFloatArray27, 0);
		Static223.aFloatArray27[3] = 1.0F;
		Static223.aFloatArray27[0] = super.aFloat142 * -super.aFloat146;
		Static223.aFloatArray27[1] = super.aFloat156 * -super.aFloat146;
		Static223.aFloatArray27[2] = -super.aFloat146 * super.aFloat150;
		OpenGL.glLightfv(16385, 4609, Static223.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!dda", name = "x", descriptor = "()V")
	@Override
	protected void method5029() {
		super.method5029();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "(I)V")
	@Override
	protected void method4336() {
		if (Static591.aClass288_7 == super.aClass288_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static33.aClass288_1 == super.aClass288_5) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass288_5 == Static201.aClass288_4) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4986(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5013();
	}

	@OriginalMember(owner = "client!dda", name = "p", descriptor = "()V")
	@Override
	public void method5009() {
	}

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "()Z")
	@Override
	public boolean method4989() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "z", descriptor = "(I)V")
	@Override
	protected void method4308() {
		OpenGL.glTexEnvi(8960, 34162, Static350.method5648(super.aClass117Array6[super.anInt4955]));
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBI)V")
	public synchronized void method2016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub38 local14 = new Class4_Sub38(arg1);
		local14.aLong268 = arg0;
		this.aClass244_12.method5960(local14);
	}

	@OriginalMember(owner = "client!dda", name = "S", descriptor = "(I)V")
	private void method2017() {
		if (this.aBoolean142) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass128_5.method3186()) {
			if (!this.aBoolean141) {
				OpenGL.glLoadMatrixf(super.aClass8_Sub3_18.method1584(Static554.aFloatArray69), 0);
				this.aBoolean141 = true;
				this.method4240();
				this.method4354();
			}
			if (super.aBoolean336) {
				this.aBoolean142 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass8_Sub3_15.method1584(Static554.aFloatArray69), 0);
				this.aBoolean142 = true;
			}
		} else if (super.aBoolean336) {
			OpenGL.glLoadIdentity();
			this.aBoolean142 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass8_Sub3_15.method1584(Static554.aFloatArray69), 0);
			this.aBoolean142 = false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(II)V")
	public synchronized void method2018(@OriginalArg(1) int arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong268 = arg0;
		this.aClass244_16.method5960(local7);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method4287(@OriginalArg(1) Canvas arg0) {
		@Pc(16) long local16 = this.anOpenGL1.prepareSurface(arg0);
		if (local16 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local16);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZLclient!uf;Z)V")
	@Override
	protected void method4277(@OriginalArg(0) int arg0, @OriginalArg(2) Class328 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static51.method675(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!dda", name = "B", descriptor = "(B)V")
	@Override
	protected void method4354() {
		this.method4273();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt4958; local10++) {
			@Pc(17) Class4_Sub24 local17 = super.aClass4_Sub24Array4[local10];
			@Pc(21) int local21 = local17.method7149();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method7144() / 255.0F;
			Static223.aFloatArray27[0] = local17.method7145();
			Static223.aFloatArray27[1] = local17.method7147();
			Static223.aFloatArray27[2] = local17.method7142();
			Static223.aFloatArray27[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static223.aFloatArray27, 0);
			Static223.aFloatArray27[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static223.aFloatArray27[0] = (float) (local21 >> 16 & 0xFF) * local31;
			Static223.aFloatArray27[3] = 1.0F;
			Static223.aFloatArray27[2] = local31 * (float) (local21 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static223.aFloatArray27, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method7151() * local17.method7151()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt4959) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method4354();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIILclient!uf;Z)V")
	@Override
	public void method4258(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class328 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, Static51.method675(arg2));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!dda", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!dda", name = "H", descriptor = "(I)F")
	@Override
	protected float method4332() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4264(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dda", name = "q", descriptor = "()V")
	@Override
	public void method5013() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!dda", name = "r", descriptor = "()Z")
	@Override
	public boolean method5019() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "B", descriptor = "()V")
	@Override
	public void method5039() {
	}

	@OriginalMember(owner = "client!dda", name = "C", descriptor = "(I)V")
	@Override
	protected void method4318() {
		if (super.aBoolean353) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!dda", name = "w", descriptor = "(B)V")
	@Override
	protected void method4325() {
		super.aFloat149 = super.anInt4974 - super.anInt4953;
		super.aFloat152 = super.aFloat149 - (float) super.anInt4943;
		if ((float) super.anInt4965 > super.aFloat152) {
			super.aFloat152 = super.anInt4965;
		}
		OpenGL.glFogf(2915, super.aFloat152);
		OpenGL.glFogf(2916, super.aFloat149);
		Static223.aFloatArray27[2] = (float) (super.anInt4950 & 0xFF) / 255.0F;
		Static223.aFloatArray27[1] = (float) (super.anInt4950 & 0xFF00) / 65280.0F;
		Static223.aFloatArray27[0] = (float) (super.anInt4950 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static223.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!fca;III[FIIZ)Lclient!co;")
	@Override
	protected Interface6 method4345(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean145 || Static100.method2181(arg1) && Static100.method2181(arg2)) {
			return new Class196_Sub2(this, arg0, arg1, arg2, arg4, arg3, 0, 0);
		} else if (this.aBoolean144) {
			return new Class196_Sub4(this, arg0, arg1, arg2, arg3, 0, 0);
		} else {
			@Pc(61) Class196_Sub2 local61 = new Class196_Sub2(this, arg0, Static53.aClass42_8, Static341.method5553(arg1), Static341.method5553(arg2));
			local61.method5787(arg3, arg1, arg0, arg2);
			return local61;
		}
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(B)V")
	@Override
	protected void method4263() {
		if (super.aBoolean339 && super.aBoolean338 && super.anInt4943 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!dda", name = "N", descriptor = "(I)V")
	@Override
	protected void method4351() {
		if (super.aBoolean350) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZJ)V")
	public synchronized void method2019(@OriginalArg(1) long arg0) {
		@Pc(11) Class4 local11 = new Class4();
		local11.aLong268 = arg0;
		this.aClass244_17.method5960(local11);
	}

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "(Z)V")
	@Override
	protected void method4340() {
		this.aBoolean141 = false;
		this.method2017();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4973(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class4_Sub38 local19;
		while (!this.aClass244_12.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_12.method5968();
			Static331.anIntArray304[local11++] = (int) local19.aLong268;
			super.anInt4931 -= local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static331.anIntArray304, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static331.anIntArray304, 0);
			local11 = 0;
		}
		while (!this.aClass244_13.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_13.method5968();
			Static331.anIntArray304[local11++] = (int) local19.aLong268;
			super.anInt4932 -= local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static331.anIntArray304, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static331.anIntArray304, 0);
			local11 = 0;
		}
		while (!this.aClass244_14.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_14.method5968();
			Static331.anIntArray304[local11++] = local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static331.anIntArray304, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static331.anIntArray304, 0);
			local11 = 0;
		}
		while (!this.aClass244_15.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_15.method5968();
			Static331.anIntArray304[local11++] = (int) local19.aLong268;
			super.anInt4934 -= local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static331.anIntArray304, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static331.anIntArray304, 0);
		}
		while (!this.aClass244_10.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_10.method5968();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt8496);
		}
		@Pc(215) Class4 local215;
		while (!this.aClass244_16.method5961()) {
			local215 = this.aClass244_16.method5968();
			OpenGL.glDeleteProgramARB((int) local215.aLong268);
		}
		while (!this.aClass244_17.method5961()) {
			local215 = this.aClass244_17.method5968();
			OpenGL.glDeleteObjectARB(local215.aLong268);
		}
		while (!this.aClass244_10.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_10.method5968();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt8496);
		}
		if (this.b() > 100663296 && this.aLong44 + 60000L < Static574.method8210()) {
			System.gc();
			this.aLong44 = Static574.method8210();
		}
		super.method4973(local9);
	}

	@OriginalMember(owner = "client!dda", name = "n", descriptor = "(Z)V")
	@Override
	protected void method4373() {
		OpenGL.glActiveTexture(super.anInt4955 + 33984);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!fca;ILclient!bv;)Z")
	@Override
	public boolean method4280(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class42 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "()V")
	@Override
	public void method4990() {
		if (super.anInt4914 <= 0 && super.anInt4807 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt4971;
		@Pc(16) int local16 = super.anInt4938;
		@Pc(19) int local19 = super.anInt4969;
		@Pc(22) int local22 = super.anInt4966;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4242();
		this.method4270(false);
		this.method4244(false);
		this.method4269(false);
		this.method4248(false);
		this.method4265(null);
		this.method4272(-2, false, false);
		this.method4335(1);
		this.method4321(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt4914, super.anInt4807, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method4327(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!dda", name = "s", descriptor = "(I)V")
	@Override
	protected void method4299() {
		OpenGL.glViewport(super.anInt4944, super.anInt4951, super.anInt4914, super.anInt4807);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B[Lclient!mm;)Lclient!fj;")
	@Override
	public Class3 method4314(@OriginalArg(1) Class220[] arg0) {
		return new Class3_Sub1(arg0);
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(II)Lclient!jfa;")
	@Override
	protected Class38 method4291(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class38_Sub11(this, super.aClass176_68);
		} else if (arg0 == 4) {
			return new Class38_Sub1(this, super.aClass176_68, super.aClass348_4);
		} else if (arg0 == 8) {
			return new Class38_Sub7(this, super.aClass176_68, super.aClass348_4);
		} else {
			return super.method4291(arg0);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
	public synchronized void method2020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub38 local15 = new Class4_Sub38(arg1);
		local15.aLong268 = arg0;
		this.aClass244_13.method5960(local15);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIIIIZI)Lclient!co;")
	@Override
	public Interface6 method4259(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean145 || Static100.method2181(arg5) && Static100.method2181(arg2)) {
			return new Class196_Sub2(this, arg5, arg2, arg4, arg0, 0, arg1);
		} else if (this.aBoolean144) {
			return new Class196_Sub4(this, arg5, arg2, arg0, 0, arg1);
		} else {
			@Pc(56) Class196_Sub2 local56 = new Class196_Sub2(this, Static7.aClass97_5, Static53.aClass42_4, Static341.method5553(arg5), Static341.method5553(arg2));
			local56.method8287(arg2, 0, arg5, arg0, 0, arg1);
			return local56;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!fca;BILclient!bv;)Lclient!co;")
	@Override
	public Interface6 method4369(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3) {
		if (this.aBoolean145 || Static100.method2181(arg0) && Static100.method2181(arg2)) {
			return new Class196_Sub2(this, arg1, arg3, arg0, arg2);
		} else if (this.aBoolean144) {
			return new Class196_Sub4(this, arg1, arg3, arg0, arg2);
		} else {
			return new Class196_Sub2(this, arg1, arg3, Static341.method5553(arg0), Static341.method5553(arg2));
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method5024(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([BILclient!fca;III)Lclient!ck;")
	@Override
	public Interface4 method4366(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class97 arg1) {
		return new Class196_Sub1(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!dda", name = "D", descriptor = "(I)V")
	@Override
	protected void method4320() {
		Static223.aFloatArray27[2] = super.aFloat153 * super.aFloat150;
		Static223.aFloatArray27[3] = 1.0F;
		Static223.aFloatArray27[1] = super.aFloat156 * super.aFloat153;
		Static223.aFloatArray27[0] = super.aFloat153 * super.aFloat142;
		OpenGL.glLightModelfv(2899, Static223.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!qf;IIILclient!cda;B)V")
	@Override
	public void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface3 arg5) {
		@Pc(21) byte local21;
		@Pc(19) int local19;
		if (Static501.aClass271_7 == arg1) {
			local21 = 1;
			local19 = arg2 * 2;
		} else if (Static535.aClass271_9 == arg1) {
			local19 = arg2 + 1;
			local21 = 3;
		} else if (Static262.aClass271_5 == arg1) {
			local19 = arg2 * 3;
			local21 = 4;
		} else if (Static344.aClass271_6 == arg1) {
			local19 = arg2 + 2;
			local21 = 6;
		} else if (Static379.aClass271_8 == arg1) {
			local19 = arg2 + 2;
			local21 = 5;
		} else {
			local19 = arg2;
			local21 = 0;
		}
		@Pc(72) Class42 local72 = arg5.method5236();
		@Pc(75) Class172_Sub2 local75 = (Class172_Sub2) arg5;
		local75.method5225();
		OpenGL.glDrawElements(local21, local19, Static346.method5590(local72), local75.method5232() + (long) (arg0 * local72.anInt771));
	}

	@OriginalMember(owner = "client!dda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4248(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!dda", name = "P", descriptor = "(I)V")
	@Override
	protected void method4363() {
		@Pc(15) int local15 = this.anIntArray83[super.anInt4955];
		if (local15 != 0) {
			this.anIntArray83[super.anInt4955] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZ[[II)Lclient!gi;")
	@Override
	public Interface13 method4364(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class196_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(II)V")
	@Override
	public void method4330(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "()V")
	@Override
	public void method5003() {
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(Z)V")
	@Override
	protected void method4246() {
		OpenGL.glScissor(super.anInt4971 + super.anInt4944, super.anInt4807 + (super.anInt4951 - super.anInt4966), -super.anInt4971 + super.anInt4938, -super.anInt4969 + super.anInt4966);
	}

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "(Z)V")
	@Override
	protected void method4357() {
		if (super.aBoolean357) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZI)Lclient!cda;")
	@Override
	public Interface3 method4245(@OriginalArg(0) boolean arg0) {
		return new Class172_Sub2(this, Static53.aClass42_5, arg0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!caa;Lclient!caa;FLclient!caa;)Lclient!caa;")
	@Override
	public Class36 method5005(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "(B)V")
	@Override
	protected void method4271() {
		if (super.aBoolean342) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!cr;I)V")
	@Override
	public void method4346(@OriginalArg(0) Class54 arg0) {
		if (Static3.aClass54_1 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static569.method8145(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!dda", name = "y", descriptor = "()V")
	@Override
	public void method5032() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(BZ)Lclient!el;")
	@Override
	public Interface9 method4286(@OriginalArg(1) boolean arg0) {
		return new Class172_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!fca;ZLclient!bv;)Z")
	@Override
	public boolean method4311(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class42 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V")
	@Override
	public void method4240() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray35, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!dda", name = "u", descriptor = "(B)V")
	@Override
	protected void method4317() {
		OpenGL.glTexEnvi(8960, 34161, Static350.method5648(super.aClass117Array5[super.anInt4955]));
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(Z)V")
	@Override
	protected void method4282() {
		if (super.aBoolean352 && !super.aBoolean337) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "(Z)V")
	@Override
	protected void method4297() {
		Static223.aFloatArray27[3] = (float) (super.anInt4948 >>> 24) / 255.0F;
		Static223.aFloatArray27[0] = (float) (super.anInt4948 & 0xFF0000) / 1.671168E7F;
		Static223.aFloatArray27[1] = (float) (super.anInt4948 & 0xFF00) / 65280.0F;
		Static223.aFloatArray27[2] = (float) (super.anInt4948 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static223.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!dda", name = "n", descriptor = "(B)V")
	@Override
	protected void method4283() {
		if (super.aBoolean356) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(B)V")
	@Override
	protected void method4249() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray31, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method4329(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!dda", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		return this.anInt2123;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
	@Override
	public void method5042(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "y", descriptor = "(I)V")
	@Override
	protected void method4306() {
		OpenGL.glDepthMask(super.aBoolean340 && super.aBoolean343);
	}

	@OriginalMember(owner = "client!dda", name = "J", descriptor = "(I)V")
	@Override
	protected void method4339() {
		for (@Pc(10) int local10 = super.anInt4961 - 1; local10 >= 0; local10--) {
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
		super.method4339();
	}

	@OriginalMember(owner = "client!dda", name = "C", descriptor = "(B)V")
	@Override
	protected void method4355() {
		OpenGL.glMatrixMode(5890);
		if (Static60.aClass340_1 == super.aClass340Array3[super.anInt4955]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass8_Sub3Array3[super.anInt4955].method1584(Static554.aFloatArray69), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dda", name = "M", descriptor = "(I)V")
	@Override
	protected void method4349() {
	}
}
