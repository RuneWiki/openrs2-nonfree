import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class100_Sub1_Sub2 extends Class100_Sub1 {

	@OriginalMember(owner = "client!no", name = "Hi", descriptor = "I")
	private int anInt7248;

	@OriginalMember(owner = "client!no", name = "Ii", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!no", name = "Ji", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!no", name = "Ki", descriptor = "Z")
	private boolean aBoolean486;

	@OriginalMember(owner = "client!no", name = "Li", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!no", name = "Mi", descriptor = "Z")
	private boolean aBoolean487;

	@OriginalMember(owner = "client!no", name = "Ni", descriptor = "Z")
	private boolean aBoolean488;

	@OriginalMember(owner = "client!no", name = "ch", descriptor = "Lclient!ada;")
	private final Class8 aClass8_42 = new Class8();

	@OriginalMember(owner = "client!no", name = "wi", descriptor = "Lclient!ada;")
	private final Class8 aClass8_43 = new Class8();

	@OriginalMember(owner = "client!no", name = "yi", descriptor = "Lclient!ada;")
	private final Class8 aClass8_44 = new Class8();

	@OriginalMember(owner = "client!no", name = "Bi", descriptor = "Lclient!ada;")
	private final Class8 aClass8_45 = new Class8();

	@OriginalMember(owner = "client!no", name = "Ci", descriptor = "Lclient!ada;")
	private final Class8 aClass8_46 = new Class8();

	@OriginalMember(owner = "client!no", name = "Di", descriptor = "Lclient!ada;")
	private final Class8 aClass8_47 = new Class8();

	@OriginalMember(owner = "client!no", name = "Ei", descriptor = "Lclient!ada;")
	private final Class8 aClass8_48 = new Class8();

	@OriginalMember(owner = "client!no", name = "Gi", descriptor = "[Lclient!vda;")
	private final Class107_Sub2[] aClass107_Sub2Array1 = new Class107_Sub2[16];

	@OriginalMember(owner = "client!no", name = "Fi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!no", name = "Oi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!no", name = "aj", descriptor = "I")
	private final int anInt7251 = 0;

	@OriginalMember(owner = "client!no", name = "Ph", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!no", name = "Si", descriptor = "Ljava/lang/String;")
	private final String aString85;

	@OriginalMember(owner = "client!no", name = "Ti", descriptor = "Ljava/lang/String;")
	private final String aString86;

	@OriginalMember(owner = "client!no", name = "Vi", descriptor = "I")
	private final int anInt7249;

	@OriginalMember(owner = "client!no", name = "Qi", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!no", name = "Yi", descriptor = "Z")
	private boolean aBoolean493;

	@OriginalMember(owner = "client!no", name = "Xi", descriptor = "Z")
	private final boolean aBoolean492;

	@OriginalMember(owner = "client!no", name = "Zi", descriptor = "Z")
	public final boolean aBoolean494;

	@OriginalMember(owner = "client!no", name = "Ri", descriptor = "Z")
	public final boolean aBoolean491;

	@OriginalMember(owner = "client!no", name = "Pi", descriptor = "Z")
	public final boolean aBoolean489;

	@OriginalMember(owner = "client!no", name = "Ui", descriptor = "[I")
	public final int[] anIntArray431;

	@OriginalMember(owner = "client!no", name = "Wi", descriptor = "I")
	public final int anInt7250;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!vd;I)V")
	public Class100_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class353 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString85 = OpenGL.glGetString(7936).toLowerCase();
			this.aString86 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString85.indexOf("microsoft") != -1 || this.aString85.indexOf("brian paul") != -1 || this.aString85.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(109) String local109 = OpenGL.glGetString(7938);
			@Pc(117) String[] local117 = Static513.method7614(local109.replace('.', ' '), ' ');
			if (local117.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(138) int local138;
			try {
				@Pc(132) int local132 = Static355.method5682(local117[0]);
				local138 = Static355.method5682(local117[1]);
				this.anInt7249 = local138 + local132 * 10;
			} catch (@Pc(147) NumberFormatException local147) {
				throw new RuntimeException("");
			}
			if (this.anInt7249 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(186) int[] local186 = new int[1];
				OpenGL.glGetIntegerv(34018, local186, 0);
				super.anInt7157 = local186[0];
				if (super.anInt7157 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7136 = 8;
				this.aBoolean490 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean478 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean493 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean479 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean492 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean474 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean494 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean491 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean489 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray431 = new int[super.anInt7157];
				this.anInt7250 = Stream.b() ? 33639 : 5121;
				if (this.aString86.indexOf("radeon") != -1) {
					local138 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static513.method7614(this.aString86.replace('/', ' '), ' ');
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static511.method7587(local308.substring(1, 3))) {
									local308 = local308.substring(1);
									local291 = true;
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local289 = true;
										local308 = local308.substring(2);
									}
									if (local308.length() >= 4 && Static511.method7587(local308.substring(0, 4))) {
										local138 = Static355.method5682(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(378) Exception local378) {
						}
					}
					if (!local291 && !local289) {
						if (local138 >= 7000 && local138 <= 9250) {
							super.aBoolean474 = false;
						}
						if (local138 >= 7000 && local138 <= 7999) {
							this.aBoolean490 = false;
						}
					}
					this.aBoolean493 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString85.indexOf("intel");
				if (this.aBoolean490) {
					try {
						@Pc(434) int[] local434 = new int[1];
						OpenGL.glGenBuffersARB(1, local434, 0);
					} catch (@Pc(440) Throwable local440) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(446) Throwable local446) {
			local446.printStackTrace();
			this.method8789();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "(B)V")
	@Override
	protected void method6126() {
		if (super.aBoolean470 && !super.aBoolean466) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!no", name = "B", descriptor = "(B)V")
	private void method6165() {
		if (this.aBoolean484) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass160_7.method4615()) {
			if (!this.aBoolean488) {
				OpenGL.glLoadMatrixf(super.aClass154_Sub2_18.method4526(Static451.aFloatArray71), 0);
				this.aBoolean488 = true;
				this.method6109();
				this.method6036();
			}
			if (super.aBoolean462) {
				this.aBoolean484 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass154_Sub2_15.method4526(Static451.aFloatArray71), 0);
				this.aBoolean484 = true;
			}
		} else if (super.aBoolean462) {
			OpenGL.glLoadIdentity();
			this.aBoolean484 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass154_Sub2_15.method4526(Static451.aFloatArray71), 0);
			this.aBoolean484 = false;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!pk;)V")
	@Override
	public void method8794(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!no", name = "o", descriptor = "(B)V")
	@Override
	protected void method6104() {
		this.aBoolean488 = false;
		this.method6165();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6071(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	@Override
	protected void method6031() {
		this.method6165();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()V")
	@Override
	public void method8776() {
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIILclient!jf;ILclient!ef;)V")
	@Override
	public void method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(6) Class77 arg5) {
		@Pc(20) byte local20;
		@Pc(18) int local18;
		if (Static507.aClass77_4 == arg5) {
			local18 = arg0 * 2;
			local20 = 1;
		} else if (Static101.aClass77_1 == arg5) {
			local18 = arg0 + 1;
			local20 = 3;
		} else if (Static295.aClass77_2 == arg5) {
			local20 = 4;
			local18 = arg0 * 3;
		} else if (Static364.aClass77_3 == arg5) {
			local20 = 6;
			local18 = arg0 + 2;
		} else if (Static622.aClass77_6 == arg5) {
			local18 = arg0 + 2;
			local20 = 5;
		} else {
			local20 = 0;
			local18 = arg0;
		}
		@Pc(74) Class242 local74 = arg4.method3079();
		@Pc(77) Class107_Sub1 local77 = (Class107_Sub1) arg4;
		local77.method8433();
		OpenGL.glDrawElements(local20, local18, Static326.method5412(local74), local77.method8432() + (long) (local74.anInt7529 * arg1));
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ef;BII)V")
	@Override
	public void method6147(@OriginalArg(0) Class77 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg0 == Static507.aClass77_4) {
			local10 = 1;
			local14 = arg2 * 2;
		} else if (arg0 == Static101.aClass77_1) {
			local14 = arg2 + 1;
			local10 = 3;
		} else if (arg0 == Static295.aClass77_2) {
			local10 = 4;
			local14 = arg2 * 3;
		} else if (arg0 == Static364.aClass77_3) {
			local10 = 6;
			local14 = arg2 + 2;
		} else if (arg0 == Static622.aClass77_6) {
			local10 = 5;
			local14 = arg2 + 2;
		} else {
			local10 = 0;
			local14 = arg2;
		}
		OpenGL.glDrawArrays(local10, arg1, local14);
	}

	@OriginalMember(owner = "client!no", name = "q", descriptor = "(I)V")
	@Override
	protected void method6059() {
		OpenGL.glTexEnvi(8960, 34161, Static554.method1508(super.aClass256Array5[super.anInt7127]));
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method6065(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local6);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBLclient!ll;)V")
	@Override
	public void method6128(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		this.aClass107_Sub2Array1[arg0] = (Class107_Sub2) arg1;
	}

	@OriginalMember(owner = "client!no", name = "C", descriptor = "(I)V")
	@Override
	protected void method6090() {
		if (Static475.aClass381_11 == super.aClass381_9) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static39.aClass381_1 == super.aClass381_9) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static287.aClass381_12 == super.aClass381_9) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!no", name = "p", descriptor = "(I)V")
	@Override
	protected void method6058() {
		OpenGL.glActiveTexture(super.anInt7127 + 33984);
	}

	@OriginalMember(owner = "client!no", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7091 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt7250, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8818(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub48 local19;
		while (!this.aClass8_43.method151()) {
			local19 = (Class6_Sub48) this.aClass8_43.method152();
			Static430.anIntArray477[local7++] = (int) local19.aLong278;
			super.anInt7123 -= local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static430.anIntArray477, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static430.anIntArray477, 0);
			local7 = 0;
		}
		while (!this.aClass8_44.method151()) {
			local19 = (Class6_Sub48) this.aClass8_44.method152();
			Static430.anIntArray477[local7++] = (int) local19.aLong278;
			super.anInt7119 -= local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static430.anIntArray477, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static430.anIntArray477, 0);
			local7 = 0;
		}
		while (!this.aClass8_45.method151()) {
			local19 = (Class6_Sub48) this.aClass8_45.method152();
			Static430.anIntArray477[local7++] = local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static430.anIntArray477, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static430.anIntArray477, 0);
			local7 = 0;
		}
		while (!this.aClass8_46.method151()) {
			local19 = (Class6_Sub48) this.aClass8_46.method152();
			Static430.anIntArray477[local7++] = (int) local19.aLong278;
			super.anInt7122 -= local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static430.anIntArray477, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static430.anIntArray477, 0);
		}
		while (!this.aClass8_42.method151()) {
			local19 = (Class6_Sub48) this.aClass8_42.method152();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9611);
		}
		@Pc(218) Class6 local218;
		while (!this.aClass8_47.method151()) {
			local218 = this.aClass8_47.method152();
			OpenGL.glDeleteProgramARB((int) local218.aLong278);
		}
		while (!this.aClass8_48.method151()) {
			local218 = this.aClass8_48.method152();
			OpenGL.glDeleteObjectARB(local218.aLong278);
		}
		while (!this.aClass8_42.method151()) {
			local19 = (Class6_Sub48) this.aClass8_42.method152();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9611);
		}
		if (this.E() > 100663296 && this.aLong178 + 60000L < Static32.method595()) {
			System.gc();
			this.aLong178 = Static32.method595();
		}
		super.method8818(local11);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!no", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt7251;
	}

	@OriginalMember(owner = "client!no", name = "o", descriptor = "(I)V")
	@Override
	protected void method6054() {
		OpenGL.glScissor(super.anInt7159 + super.anInt7149, -super.anInt7147 + (super.anInt7146 - -super.anInt7091), -super.anInt7159 + super.anInt7155, -super.anInt7137 + super.anInt7147);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
	@Override
	protected void method6036() {
		this.method6096();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt7126; local10++) {
			@Pc(17) Class6_Sub1 local17 = super.aClass6_Sub1Array3[local10];
			@Pc(21) int local21 = local17.method8265();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method8266() / 255.0F;
			Static552.aFloatArray78[0] = (float) local17.method8264();
			Static552.aFloatArray78[1] = (float) local17.method8267();
			Static552.aFloatArray78[2] = (float) local17.method8260();
			Static552.aFloatArray78[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static552.aFloatArray78, 0);
			Static552.aFloatArray78[2] = local31 * (float) (local21 & 0xFF);
			Static552.aFloatArray78[1] = local31 * (float) (local21 >> 8 & 0xFF);
			Static552.aFloatArray78[3] = 1.0F;
			Static552.aFloatArray78[0] = (float) (local21 >> 16 & 0xFF) * local31;
			OpenGL.glLightfv(local25, 4609, Static552.aFloatArray78, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method8268() * local17.method8268()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt7143) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method6036();
	}

	@OriginalMember(owner = "client!no", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!no", name = "o", descriptor = "(Z)V")
	@Override
	protected void method6153() {
		if (super.aBoolean482) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!bi;Lclient!dk;)Lclient!pk;")
	@Override
	public Interface20 method8839(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface5 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZII[III)Lclient!ch;")
	@Override
	public Interface3 method6156(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean492 || Static316.method5292(arg3) && Static316.method5292(arg2)) {
			return new Class114_Sub4(this, arg3, arg2, arg1, arg4, 0, arg0);
		} else if (this.aBoolean493) {
			return new Class114_Sub1(this, arg3, arg2, arg4, 0, arg0);
		} else {
			@Pc(35) Class114_Sub4 local35 = new Class114_Sub4(this, Static203.aClass250_7, Static409.aClass242_13, Static567.method8129(arg3), Static567.method8129(arg2));
			local35.method7842(arg3, 0, arg2, arg0, 0, arg4);
			return local35;
		}
	}

	@OriginalMember(owner = "client!no", name = "R", descriptor = "(I)V")
	@Override
	protected void method6151() {
		for (@Pc(10) int local10 = super.anInt7157 - 1; local10 >= 0; local10--) {
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
		super.method6151();
	}

	@OriginalMember(owner = "client!no", name = "x", descriptor = "()V")
	@Override
	public void method8852() {
	}

	@OriginalMember(owner = "client!no", name = "h", descriptor = "(II)V")
	@Override
	public void method6070(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!no", name = "A", descriptor = "(B)V")
	@Override
	protected void method6162() {
		Static552.aFloatArray78[2] = (float) (super.anInt7162 & 0xFF) / 255.0F;
		Static552.aFloatArray78[1] = (float) (super.anInt7162 & 0xFF00) / 65280.0F;
		Static552.aFloatArray78[0] = (float) (super.anInt7162 & 0xFF0000) / 1.671168E7F;
		Static552.aFloatArray78[3] = (float) (super.anInt7162 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static552.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
	@Override
	public void method8775(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!no", name = "D", descriptor = "(I)V")
	@Override
	protected void method6095() {
		OpenGL.glViewport(super.anInt7149, super.anInt7146, super.anInt7000, super.anInt7091);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([BIIZILclient!pd;)Lclient!kj;")
	@Override
	public Interface15 method6053(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class250 arg1) {
		return new Class114_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "()V")
	@Override
	public void method8851() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "()Lclient!kaa;")
	@Override
	public Class168 method8779() {
		@Pc(7) int local7 = -1;
		if (this.aString85.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString85.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString85.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class168(local7, "OpenGL", this.anInt7249, this.aString86, 0L);
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "()Z")
	@Override
	public boolean method8784() {
		return false;
	}

	@OriginalMember(owner = "client!no", name = "s", descriptor = "(I)V")
	@Override
	protected void method6061() {
		super.aFloat135 = (float) (-super.anInt7152 + super.anInt7140);
		super.aFloat137 = (float) -super.anInt7148 + super.aFloat135;
		if (super.aFloat137 < (float) super.anInt7142) {
			super.aFloat137 = (float) super.anInt7142;
		}
		OpenGL.glFogf(2915, super.aFloat137);
		OpenGL.glFogf(2916, super.aFloat135);
		Static552.aFloatArray78[0] = (float) (super.anInt7158 & 0xFF0000) / 1.671168E7F;
		Static552.aFloatArray78[2] = (float) (super.anInt7158 & 0xFF) / 255.0F;
		Static552.aFloatArray78[1] = (float) (super.anInt7158 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static552.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!no", name = "q", descriptor = "(B)V")
	@Override
	protected void method6108() {
		OpenGL.glDepthMask(super.aBoolean477 && super.aBoolean464);
	}

	@OriginalMember(owner = "client!no", name = "k", descriptor = "()V")
	@Override
	public void method8806() {
		if (super.anInt7000 <= 0 && super.anInt7091 <= 0) {
			return;
		}
		@Pc(19) int local19 = super.anInt7159;
		@Pc(22) int local22 = super.anInt7155;
		@Pc(25) int local25 = super.anInt7137;
		@Pc(28) int local28 = super.anInt7147;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6066();
		this.method6141(false);
		this.method6075(false);
		this.method6037(false);
		this.method6133(false);
		this.method6033((Interface1) null);
		this.method6137(false, false, -2);
		this.method6092(1);
		this.method6144(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7000, super.anInt7091, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!no", name = "l", descriptor = "(I)V")
	@Override
	protected void method6040() {
		if (super.aBoolean473) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!no", name = "z", descriptor = "()V")
	@Override
	public void method8854() {
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)V")
	@Override
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!no", name = "z", descriptor = "(B)V")
	@Override
	protected void method6160() {
		if (super.aBoolean463) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!ok;Lclient!pd;)Z")
	@Override
	public boolean method6050(@OriginalArg(1) Class242 arg0, @OriginalArg(2) Class250 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "u", descriptor = "(B)V")
	@Override
	protected void method6116() {
		Static552.aFloatArray78[3] = 1.0F;
		Static552.aFloatArray78[1] = super.aFloat126 * super.aFloat138;
		Static552.aFloatArray78[2] = super.aFloat127 * super.aFloat126;
		Static552.aFloatArray78[0] = super.aFloat130 * super.aFloat126;
		OpenGL.glLightModelfv(2899, Static552.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!no", name = "m", descriptor = "()Z")
	@Override
	public boolean method8811() {
		return false;
	}

	@OriginalMember(owner = "client!no", name = "p", descriptor = "()V")
	@Override
	protected void method8826() {
		super.method8826();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!lf;IZZ)V")
	@Override
	protected void method6057(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static76.method1319(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(III)V")
	public synchronized void method6167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class6_Sub48 local16 = new Class6_Sub48(arg1);
		local16.aLong278 = (long) arg0;
		this.aClass8_43.method157(local16);
	}

	@OriginalMember(owner = "client!no", name = "t", descriptor = "(B)F")
	@Override
	protected float method6115() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!no", name = "r", descriptor = "(B)V")
	@Override
	public void method6109() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray60, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray59, 0);
	}

	@OriginalMember(owner = "client!no", name = "y", descriptor = "(I)V")
	@Override
	protected void method6080() {
	}

	@OriginalMember(owner = "client!no", name = "n", descriptor = "(Z)V")
	@Override
	protected void method6152() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray64, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(II)Lclient!nia;")
	@Override
	protected Class7 method6098(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class7_Sub9(this, super.aClass353_62);
		} else if (arg0 == 4) {
			return new Class7_Sub11(this, super.aClass353_62, super.aClass249_7);
		} else if (arg0 == 8) {
			return new Class7_Sub6(this, super.aClass353_62, super.aClass249_7);
		} else {
			return super.method6098(arg0);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8855(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8800(arg2, arg3);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([Lclient!bq;I)Lclient!sr;")
	@Override
	public Class293 method6041(@OriginalArg(0) Class41[] arg0) {
		return new Class293_Sub1(arg0);
	}

	@OriginalMember(owner = "client!no", name = "U", descriptor = "(I)V")
	@Override
	protected void method6159() {
		Static552.aFloatArray78[3] = 1.0F;
		Static552.aFloatArray78[1] = super.aFloat138 * super.aFloat132;
		Static552.aFloatArray78[2] = super.aFloat132 * super.aFloat127;
		Static552.aFloatArray78[0] = super.aFloat130 * super.aFloat132;
		OpenGL.glLightfv(16384, 4609, Static552.aFloatArray78, 0);
		Static552.aFloatArray78[2] = -super.aFloat139 * super.aFloat127;
		Static552.aFloatArray78[1] = super.aFloat138 * -super.aFloat139;
		Static552.aFloatArray78[0] = super.aFloat130 * -super.aFloat139;
		Static552.aFloatArray78[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static552.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)Lclient!dk;")
	@Override
	public Interface5 method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZIIII[BLclient!pd;I)Lclient!ch;")
	@Override
	protected Interface3 method6049(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) Class250 arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean492 || Static316.method5292(arg1) && Static316.method5292(arg4)) {
			return new Class114_Sub4(this, arg3, arg1, arg4, arg0, arg2, 0, 0);
		} else if (this.aBoolean493) {
			return new Class114_Sub1(this, arg3, arg1, arg4, arg2, 0, 0);
		} else {
			@Pc(59) Class114_Sub4 local59 = new Class114_Sub4(this, arg3, Static409.aClass242_13, Static567.method8129(arg1), Static567.method8129(arg4));
			local59.method7844(arg1, 0, arg4, arg2, arg3);
			return local59;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)V")
	public synchronized void method6168(@OriginalArg(1) long arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong278 = arg0;
		this.aClass8_48.method157(local7);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6117(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!no", name = "K", descriptor = "(I)V")
	@Override
	protected void method6129() {
		if (super.aBoolean471) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!no", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!no", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6133(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6034(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local6)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	@Override
	protected void method6093(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!de;)V")
	@Override
	public void method6087(@OriginalArg(1) Class61 arg0) {
		if (arg0 == Static269.aClass61_6) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(18) int local18 = Static443.method6841(arg0);
		OpenGL.glTexGeni(8192, 9472, local18);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local18);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local18);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z[FIILclient!pd;III)Lclient!ch;")
	@Override
	protected Interface3 method6091(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class250 arg3, @OriginalArg(5) int arg4) {
		if (this.aBoolean492 || Static316.method5292(arg2) && Static316.method5292(arg4)) {
			return new Class114_Sub4(this, arg3, arg2, arg4, arg0, arg1, 0, 0);
		} else if (this.aBoolean493) {
			return new Class114_Sub1(this, arg3, arg2, arg4, arg1, 0, 0);
		} else {
			@Pc(51) Class114_Sub4 local51 = new Class114_Sub4(this, arg3, Static409.aClass242_17, Static567.method8129(arg2), Static567.method8129(arg4));
			local51.method7850(arg4, arg3, arg2, arg1);
			return local51;
		}
	}

	@OriginalMember(owner = "client!no", name = "y", descriptor = "(B)V")
	@Override
	protected void method6136() {
		OpenGL.glTexEnvi(8960, 34162, Static554.method1508(super.aClass256Array6[super.anInt7127]));
	}

	@OriginalMember(owner = "client!no", name = "s", descriptor = "(B)V")
	@Override
	protected void method6113() {
		if (super.aBoolean475 && super.aBoolean476 && super.anInt7148 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!lf;ZIZZ)V")
	@Override
	public void method6079(@OriginalArg(0) Class187 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static76.method1319(arg0));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!no", name = "v", descriptor = "(B)V")
	@Override
	protected void method6120() {
		@Pc(13) int local13 = this.anIntArray431[super.anInt7127];
		if (local13 != 0) {
			this.anIntArray431[super.anInt7127] = 0;
			OpenGL.glBindTexture(local13, 0);
			OpenGL.glDisable(local13);
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(III)V")
	public synchronized void method6169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub48 local8 = new Class6_Sub48(arg0);
		local8.aLong278 = (long) arg1;
		this.aClass8_44.method157(local8);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ok;Lclient!pd;)Z")
	@Override
	public boolean method6085(@OriginalArg(1) Class242 arg0, @OriginalArg(2) Class250 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "u", descriptor = "(I)V")
	@Override
	protected void method6063() {
		OpenGL.glMatrixMode(5890);
		if (Static477.aClass377_11 == super.aClass377Array3[super.anInt7127]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass154_Sub2Array3[super.anInt7127].method4526(Static451.aFloatArray71), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(II)Lclient!bi;")
	@Override
	public Interface2 method8807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!sr;B)V")
	@Override
	public void method6107(@OriginalArg(0) Class293 arg0) {
		@Pc(15) Class41[] local15 = ((Class293_Sub1) arg0).aClass41Array1;
		@Pc(17) int local17 = 0;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local15.length; local25++) {
			@Pc(31) Class41 local31 = local15[local25];
			@Pc(36) Class107_Sub2 local36 = this.aClass107_Sub2Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method8442();
			@Pc(46) long local46 = local36.method8432();
			local36.method8433();
			for (@Pc(51) int local51 = 0; local31.method910() > local51; local51++) {
				@Pc(58) Class362 local58 = local31.method904(local51);
				if (Static610.aClass362_1 == local58) {
					local23 = true;
					OpenGL.glVertexPointer(3, 5126, local42, local46 + (long) local38);
				} else if (Static610.aClass362_2 == local58) {
					OpenGL.glNormalPointer(5126, local42, local46 + (long) local38);
					local21 = true;
				} else if (Static610.aClass362_3 == local58) {
					local19 = true;
					OpenGL.glColorPointer(4, 5121, local42, local46 + (long) local38);
				} else if (local58 == Static610.aClass362_4) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local46 + (long) local38);
				} else if (Static610.aClass362_5 == local58) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local46 + (long) local38);
				} else if (local58 == Static610.aClass362_6) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, (long) local38 + local46);
				} else if (local58 == Static610.aClass362_7) {
					OpenGL.glClientActiveTexture(local17++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, local46 + (long) local38);
				}
				local38 += local58.anInt10082;
			}
		}
		if (this.aBoolean485 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean485 = local23;
		}
		if (local21 != this.aBoolean487) {
			if (local21) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean487 = local21;
		}
		if (local19 != this.aBoolean486) {
			if (local19) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean486 = local19;
		}
		@Pc(253) int local253;
		if (local17 > this.anInt7248) {
			for (local253 = this.anInt7248; local253 < local17; local253++) {
				OpenGL.glClientActiveTexture(local253 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt7248 = local17;
		} else if (local17 < this.anInt7248) {
			for (local253 = local17; local253 < this.anInt7248; local253++) {
				OpenGL.glClientActiveTexture(local253 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt7248 = local17;
		}
	}

	@OriginalMember(owner = "client!no", name = "l", descriptor = "(II)V")
	public synchronized void method6170(@OriginalArg(1) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong278 = (long) arg0;
		this.aClass8_47.method157(local7);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(ZI)Lclient!ll;")
	@Override
	public Interface17 method6123(@OriginalArg(0) boolean arg0) {
		return new Class107_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IZ)Lclient!jf;")
	@Override
	public Interface11 method6101(@OriginalArg(1) boolean arg0) {
		return new Class107_Sub1(this, Static409.aClass242_14, arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([[IIZZ)Lclient!pf;")
	@Override
	public Interface19 method6163(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class114_Sub2(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!om;Lclient!om;FLclient!om;)Lclient!om;")
	@Override
	public Class57 method8827(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ok;ILclient!pd;ZI)Lclient!ch;")
	@Override
	public Interface3 method6082(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean492 || Static316.method5292(arg1) && Static316.method5292(arg3)) {
			return new Class114_Sub4(this, arg2, arg0, arg1, arg3);
		} else if (this.aBoolean493) {
			return new Class114_Sub1(this, arg2, arg0, arg1, arg3);
		} else {
			return new Class114_Sub4(this, arg2, arg0, Static567.method8129(arg1), Static567.method8129(arg3));
		}
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(Z)V")
	@Override
	protected void method6112() {
		if (super.aBoolean483) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}
}
