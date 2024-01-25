import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class13_Sub3_Sub1 extends Class13_Sub3 {

	@OriginalMember(owner = "client!tk", name = "Ai", descriptor = "Z")
	private boolean aBoolean648;

	@OriginalMember(owner = "client!tk", name = "Ci", descriptor = "Z")
	private boolean aBoolean649;

	@OriginalMember(owner = "client!tk", name = "Di", descriptor = "Z")
	private boolean aBoolean650;

	@OriginalMember(owner = "client!tk", name = "Ei", descriptor = "Z")
	private boolean aBoolean651;

	@OriginalMember(owner = "client!tk", name = "Fi", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "client!tk", name = "Gi", descriptor = "Z")
	private boolean aBoolean652;

	@OriginalMember(owner = "client!tk", name = "Ii", descriptor = "I")
	private int anInt9183;

	@OriginalMember(owner = "client!tk", name = "ti", descriptor = "Lclient!fh;")
	private final Class114 aClass114_46 = new Class114();

	@OriginalMember(owner = "client!tk", name = "ui", descriptor = "Lclient!fh;")
	private final Class114 aClass114_47 = new Class114();

	@OriginalMember(owner = "client!tk", name = "vi", descriptor = "Lclient!fh;")
	private final Class114 aClass114_48 = new Class114();

	@OriginalMember(owner = "client!tk", name = "wi", descriptor = "Lclient!fh;")
	private final Class114 aClass114_49 = new Class114();

	@OriginalMember(owner = "client!tk", name = "xi", descriptor = "Lclient!fh;")
	private final Class114 aClass114_50 = new Class114();

	@OriginalMember(owner = "client!tk", name = "yi", descriptor = "Lclient!fh;")
	private final Class114 aClass114_51 = new Class114();

	@OriginalMember(owner = "client!tk", name = "zi", descriptor = "Lclient!fh;")
	private final Class114 aClass114_52 = new Class114();

	@OriginalMember(owner = "client!tk", name = "Bi", descriptor = "[Lclient!qr;")
	private final Class127_Sub2[] aClass127_Sub2Array1 = new Class127_Sub2[16];

	@OriginalMember(owner = "client!tk", name = "Hi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!tk", name = "Ji", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!tk", name = "Pi", descriptor = "I")
	private final int anInt9184 = 0;

	@OriginalMember(owner = "client!tk", name = "oh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!tk", name = "Mi", descriptor = "Ljava/lang/String;")
	private final String aString88;

	@OriginalMember(owner = "client!tk", name = "Ui", descriptor = "Ljava/lang/String;")
	private final String aString89;

	@OriginalMember(owner = "client!tk", name = "Qi", descriptor = "I")
	private final int anInt9185;

	@OriginalMember(owner = "client!tk", name = "Ni", descriptor = "Z")
	public boolean aBoolean655;

	@OriginalMember(owner = "client!tk", name = "Oi", descriptor = "Z")
	private boolean aBoolean656;

	@OriginalMember(owner = "client!tk", name = "Si", descriptor = "Z")
	private final boolean aBoolean657;

	@OriginalMember(owner = "client!tk", name = "Li", descriptor = "Z")
	public final boolean aBoolean654;

	@OriginalMember(owner = "client!tk", name = "Vi", descriptor = "Z")
	public final boolean aBoolean658;

	@OriginalMember(owner = "client!tk", name = "Ki", descriptor = "Z")
	public final boolean aBoolean653;

	@OriginalMember(owner = "client!tk", name = "Ri", descriptor = "[I")
	public final int[] anIntArray661;

	@OriginalMember(owner = "client!tk", name = "Ti", descriptor = "I")
	public final int anInt9186;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!nd;I)V")
	public Class13_Sub3_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class238 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString88 = OpenGL.glGetString(7936).toLowerCase();
			this.aString89 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString88.indexOf("microsoft") != -1 || this.aString88.indexOf("brian paul") != -1 || this.aString88.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(107) String local107 = OpenGL.glGetString(7938);
			@Pc(115) String[] local115 = Static386.method5691(' ', local107.replace('.', ' '));
			if (local115.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(138) int local138;
			try {
				@Pc(132) int local132 = Static307.method4785(local115[0]);
				local138 = Static307.method4785(local115[1]);
				this.anInt9185 = local138 + local132 * 10;
			} catch (@Pc(147) NumberFormatException local147) {
				throw new RuntimeException("");
			}
			if (this.anInt9185 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(184) int[] local184 = new int[1];
				OpenGL.glGetIntegerv(34018, local184, 0);
				super.anInt9722 = local184[0];
				if (super.anInt9722 < 2) {
					throw new RuntimeException("");
				}
				super.anInt9737 = 8;
				this.aBoolean655 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean689 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean656 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean686 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean657 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean695 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean654 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean658 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean653 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray661 = new int[super.anInt9722];
				this.anInt9186 = Stream.c() ? 33639 : 5121;
				if (this.aString89.indexOf("radeon") != -1) {
					local138 = 0;
					@Pc(287) boolean local287 = false;
					@Pc(289) boolean local289 = false;
					@Pc(298) String[] local298 = Static386.method5691(' ', this.aString89.replace('/', ' '));
					for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
						@Pc(305) String local305 = local298[local300];
						try {
							if (local305.length() > 0) {
								if (local305.charAt(0) == 'x' && local305.length() >= 3 && Static445.method6373(local305.substring(1, 3))) {
									local289 = true;
									local305 = local305.substring(1);
								}
								if (local305.equals("hd")) {
									local287 = true;
								} else {
									if (local305.startsWith("hd")) {
										local287 = true;
										local305 = local305.substring(2);
									}
									if (local305.length() >= 4 && Static445.method6373(local305.substring(0, 4))) {
										local138 = Static307.method4785(local305.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(367) Exception local367) {
						}
					}
					if (!local289 && !local287) {
						if (local138 >= 7000 && local138 <= 9250) {
							super.aBoolean695 = false;
						}
						if (local138 >= 7000 && local138 <= 7999) {
							this.aBoolean655 = false;
						}
					}
					this.aBoolean656 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString88.indexOf("intel");
				if (this.aBoolean655) {
					try {
						@Pc(425) int[] local425 = new int[1];
						OpenGL.glGenBuffersARB(1, local425, 0);
					} catch (@Pc(431) Throwable local431) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(437) Throwable local437) {
			local437.printStackTrace();
			this.method8117();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8247(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Lclient!gda;")
	@Override
	protected Class18 method8278(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class18_Sub2(this, super.aClass238_272);
		} else if (arg0 == 4) {
			return new Class18_Sub8(this, super.aClass238_272, super.aClass334_8);
		} else if (arg0 == 8) {
			return new Class18_Sub3(this, super.aClass238_272, super.aClass334_8);
		} else {
			return super.method8278(arg0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)V")
	@Override
	public void method8133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(IB)V")
	public synchronized void method7814(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong278 = (long) arg0;
		this.aClass114_51.method2771(local7);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!et;BLclient!wha;)Z")
	@Override
	public boolean method8293(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Class381 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "(B)V")
	@Override
	protected void method8242() {
		Static442.aFloatArray64[3] = 1.0F;
		Static442.aFloatArray64[2] = super.aFloat202 * super.aFloat193;
		Static442.aFloatArray64[1] = super.aFloat203 * super.aFloat202;
		Static442.aFloatArray64[0] = super.aFloat199 * super.aFloat202;
		OpenGL.glLightModelfv(2899, Static442.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!tk", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt9184;
	}

	@OriginalMember(owner = "client!tk", name = "eb", descriptor = "(I)V")
	@Override
	protected void method8308() {
		this.aBoolean652 = false;
		this.method7820();
	}

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "(B)V")
	@Override
	protected void method8276() {
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
	@Override
	public void method8140(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "(I)V")
	@Override
	protected void method8208() {
		if (super.aBoolean702) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "(B)V")
	@Override
	protected void method8226() {
		this.method7820();
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(Z)V")
	@Override
	protected void method8254() {
		if (super.aBoolean683) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!hca;Lclient!lda;)Lclient!nl;")
	@Override
	public Interface18 method8107(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Interface15 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
	@Override
	protected void method8172() {
		OpenGL.glActiveTexture(super.anInt9746 + 33984);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!et;Lclient!wha;Z)Z")
	@Override
	public boolean method8196(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class381 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZB)Lclient!iaa;")
	@Override
	public Interface11 method8288(@OriginalArg(0) boolean arg0) {
		return new Class127_Sub1(this, Static638.aClass381_16, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!mda;Lclient!mda;FLclient!mda;)Lclient!mda;")
	@Override
	public Class49 method8123(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "()Z")
	@Override
	public boolean method8093() {
		return false;
	}

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "(I)V")
	@Override
	protected void method8240() {
		OpenGL.glDepthMask(super.aBoolean700 && super.aBoolean687);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!nl;)V")
	@Override
	public void method8168(@OriginalArg(0) Interface18 arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "(B)V")
	@Override
	protected void method8274() {
		super.aFloat196 = (float) (-super.anInt9747 + super.anInt9749);
		super.aFloat192 = (float) -super.anInt9726 + super.aFloat196;
		if ((float) super.anInt9723 > super.aFloat192) {
			super.aFloat192 = (float) super.anInt9723;
		}
		OpenGL.glFogf(2915, super.aFloat192);
		OpenGL.glFogf(2916, super.aFloat196);
		Static442.aFloatArray64[0] = (float) (super.anInt9743 & 0xFF0000) / 1.671168E7F;
		Static442.aFloatArray64[1] = (float) (super.anInt9743 & 0xFF00) / 65280.0F;
		Static442.aFloatArray64[2] = (float) (super.anInt9743 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static442.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()V")
	@Override
	public void method8094() {
	}

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "()Z")
	@Override
	public boolean method8116() {
		return false;
	}

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "(I)V")
	@Override
	protected void method8249() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass100Array3[super.anInt9746] == Static461.aClass100_4) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass51_Sub2Array3[super.anInt9746].method3240(Static570.aFloatArray89), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!bp;Z)V")
	@Override
	protected void method8189(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static313.method7423(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BIILclient!et;I)Lclient!aga;")
	@Override
	public Interface1 method8229(@OriginalArg(1) byte[] arg0, @OriginalArg(4) Class104 arg1) {
		return new Class197_Sub4(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[Lclient!fk;)Lclient!ri;")
	@Override
	public Class258 method8292(@OriginalArg(1) Class118[] arg0) {
		return new Class258_Sub1(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "U", descriptor = "(I)V")
	@Override
	public void method8280() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray91, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray90, 0);
	}

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "(I)V")
	@Override
	protected void method8210() {
		if (super.aBoolean684) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!jv;III)V")
	@Override
	public void method8211(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) byte local23;
		@Pc(21) int local21;
		if (Static184.aClass191_1 == arg0) {
			local21 = arg1 * 2;
			local23 = 1;
		} else if (arg0 == Static582.aClass191_6) {
			local21 = arg1 + 1;
			local23 = 3;
		} else if (Static339.aClass191_4 == arg0) {
			local23 = 4;
			local21 = arg1 * 3;
		} else if (Static206.aClass191_2 == arg0) {
			local21 = arg1 + 2;
			local23 = 6;
		} else if (arg0 == Static228.aClass191_3) {
			local21 = arg1 + 2;
			local23 = 5;
		} else {
			local23 = 0;
			local21 = arg1;
		}
		OpenGL.glDrawArrays(local23, arg2, local21);
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "()V")
	@Override
	protected void method8103() {
		super.method8103();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)V")
	@Override
	public void method8298(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Lclient!lda;")
	@Override
	public Interface15 method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method8251(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "(I)V")
	@Override
	protected void method8233() {
		if (super.aClass32_7 == Static275.aClass32_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass32_7 == Static174.aClass32_1) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass32_7 == Static230.aClass32_2) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method8248(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "()V")
	@Override
	public void method8150() {
	}

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "()Lclient!nia;")
	@Override
	public Class240 method8135() {
		@Pc(7) int local7 = -1;
		if (this.aString88.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString88.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString88.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class240(local7, "OpenGL", this.anInt9185, this.aString89, 0L);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8097(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub41 local19;
		while (!this.aClass114_47.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_47.method2765();
			Static279.anIntArray307[local11++] = (int) local19.aLong278;
			super.anInt9715 -= local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static279.anIntArray307, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static279.anIntArray307, 0);
			local11 = 0;
		}
		while (!this.aClass114_48.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_48.method2765();
			Static279.anIntArray307[local11++] = (int) local19.aLong278;
			super.anInt9719 -= local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static279.anIntArray307, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static279.anIntArray307, 0);
			local11 = 0;
		}
		while (!this.aClass114_49.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_49.method2765();
			Static279.anIntArray307[local11++] = local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static279.anIntArray307, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static279.anIntArray307, 0);
			local11 = 0;
		}
		while (!this.aClass114_50.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_50.method2765();
			Static279.anIntArray307[local11++] = (int) local19.aLong278;
			super.anInt9712 -= local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static279.anIntArray307, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static279.anIntArray307, 0);
		}
		while (!this.aClass114_46.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_46.method2765();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9197);
		}
		@Pc(215) Class2 local215;
		while (!this.aClass114_51.method2767()) {
			local215 = this.aClass114_51.method2765();
			OpenGL.glDeleteProgramARB((int) local215.aLong278);
		}
		while (!this.aClass114_52.method2767()) {
			local215 = this.aClass114_52.method2765();
			OpenGL.glDeleteObjectARB(local215.aLong278);
		}
		while (!this.aClass114_46.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_46.method2765();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9197);
		}
		if (this.E() > 100663296 && this.aLong238 + 60000L < Static48.method1203()) {
			System.gc();
			this.aLong238 = Static48.method1203();
		}
		super.method8097(local9);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z[IIBIII)Lclient!wk;")
	@Override
	public Interface27 method8199(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean657 || Static608.method8539(arg3) && Static608.method8539(arg4)) {
			return new Class197_Sub2(this, arg3, arg4, arg0, arg1, 0, arg2);
		} else if (this.aBoolean656) {
			return new Class197_Sub1(this, arg3, arg4, arg1, 0, arg2);
		} else {
			@Pc(45) Class197_Sub2 local45 = new Class197_Sub2(this, Static78.aClass104_3, Static638.aClass381_15, Static613.method8565(arg3), Static613.method8565(arg4));
			local45.method7131(0, arg2, 0, arg1, arg3, arg4);
			return local45;
		}
	}

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method8303(@OriginalArg(1) Canvas arg0) {
		@Pc(12) long local12 = this.anOpenGL2.prepareSurface(arg0);
		if (local12 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local12);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!wha;IIBLclient!et;)Lclient!wk;")
	@Override
	public Interface27 method8264(@OriginalArg(0) Class381 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class104 arg3) {
		if (this.aBoolean657 || Static608.method8539(arg2) && Static608.method8539(arg1)) {
			return new Class197_Sub2(this, arg3, arg0, arg2, arg1);
		} else if (this.aBoolean656) {
			return new Class197_Sub1(this, arg3, arg0, arg2, arg1);
		} else {
			return new Class197_Sub2(this, arg3, arg0, Static613.method8565(arg2), Static613.method8565(arg1));
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIZLclient!et;[B)Lclient!wk;")
	@Override
	protected Interface27 method8171(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) Class104 arg3, @OriginalArg(7) byte[] arg4) {
		if (this.aBoolean657 || Static608.method8539(arg1) && Static608.method8539(arg0)) {
			return new Class197_Sub2(this, arg3, arg1, arg0, arg2, arg4, 0, 0);
		} else if (this.aBoolean656) {
			return new Class197_Sub1(this, arg3, arg1, arg0, arg4, 0, 0);
		} else {
			@Pc(49) Class197_Sub2 local49 = new Class197_Sub2(this, arg3, Static638.aClass381_15, Static613.method8565(arg1), Static613.method8565(arg0));
			local49.method7129(arg0, arg3, 0, arg4, arg1);
			return local49;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!mg;I)V")
	@Override
	public void method8206(@OriginalArg(0) Class222 arg0) {
		if (Static562.aClass222_5 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(17) int local17 = Static629.method8703(arg0);
		OpenGL.glTexGeni(8192, 9472, local17);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local17);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local17);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(B)V")
	@Override
	protected void method8201() {
		OpenGL.glScissor(super.anInt9748 + super.anInt9733, -super.anInt9734 + super.anInt9644 + super.anInt9732, -super.anInt9733 + super.anInt9755, super.anInt9734 - super.anInt9727);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	public synchronized void method7817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub41 local16 = new Class2_Sub41(arg1);
		local16.aLong278 = (long) arg0;
		this.aClass114_47.method2771(local16);
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
	@Override
	protected void method8186() {
		this.method8241();
		@Pc(10) int local10;
		for (local10 = 0; local10 < super.anInt9731; local10++) {
			@Pc(17) Class2_Sub12 local17 = super.aClass2_Sub12Array5[local10];
			@Pc(21) int local21 = local17.method7417();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method7422() / 255.0F;
			Static442.aFloatArray64[0] = (float) local17.method7415();
			Static442.aFloatArray64[1] = (float) local17.method7420();
			Static442.aFloatArray64[2] = (float) local17.method7421();
			Static442.aFloatArray64[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static442.aFloatArray64, 0);
			Static442.aFloatArray64[3] = 1.0F;
			Static442.aFloatArray64[0] = (float) (local21 >> 16 & 0xFF) * local31;
			Static442.aFloatArray64[1] = (float) (local21 >> 8 & 0xFF) * local31;
			Static442.aFloatArray64[2] = local31 * (float) (local21 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static442.aFloatArray64, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method7418() * local17.method7418()));
			OpenGL.glEnable(local25);
		}
		while (local10 < super.anInt9756) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method8186();
	}

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "()V")
	@Override
	public void method8110() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(JB)V")
	public synchronized void method7818(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong278 = arg0;
		this.aClass114_52.method2771(local7);
	}

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "(B)F")
	@Override
	protected float method8299() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!tk", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt9644 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt9186, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
	@Override
	protected void method8177(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local10);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V")
	public synchronized void method7819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub41 local12 = new Class2_Sub41(arg1);
		local12.aLong278 = (long) arg0;
		this.aClass114_48.method2771(local12);
	}

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "()V")
	@Override
	public void method8118() {
		if (super.anInt9598 <= 0 && super.anInt9644 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt9733;
		@Pc(19) int local19 = super.anInt9755;
		@Pc(22) int local22 = super.anInt9727;
		@Pc(25) int local25 = super.anInt9734;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8307();
		this.method8184(false);
		this.method8302(false);
		this.method8194(false);
		this.method8218(false);
		this.method8234((Interface6) null);
		this.method8261(false, false, -2);
		this.method8204(1);
		this.method8306(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt9598, super.anInt9644, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!tk", name = "W", descriptor = "(I)V")
	@Override
	protected void method8285() {
		OpenGL.glViewport(super.anInt9748, super.anInt9732, super.anInt9598, super.anInt9644);
	}

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "(B)V")
	private void method7820() {
		if (this.aBoolean648) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass101_10.method2511()) {
			if (!this.aBoolean652) {
				OpenGL.glLoadMatrixf(super.aClass51_Sub2_18.method3240(Static570.aFloatArray89), 0);
				this.aBoolean652 = true;
				this.method8280();
				this.method8186();
			}
			if (super.aBoolean682) {
				this.aBoolean648 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass51_Sub2_15.method3240(Static570.aFloatArray89), 0);
				this.aBoolean648 = true;
			}
		} else if (super.aBoolean682) {
			OpenGL.glLoadIdentity();
			this.aBoolean648 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass51_Sub2_15.method3240(Static570.aFloatArray89), 0);
			this.aBoolean648 = false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "(B)V")
	@Override
	protected void method8253() {
		Static442.aFloatArray64[3] = 1.0F;
		Static442.aFloatArray64[2] = super.aFloat193 * super.aFloat197;
		Static442.aFloatArray64[0] = super.aFloat197 * super.aFloat199;
		Static442.aFloatArray64[1] = super.aFloat203 * super.aFloat197;
		OpenGL.glLightfv(16384, 4609, Static442.aFloatArray64, 0);
		Static442.aFloatArray64[0] = -super.aFloat204 * super.aFloat199;
		Static442.aFloatArray64[1] = super.aFloat203 * -super.aFloat204;
		Static442.aFloatArray64[2] = super.aFloat193 * -super.aFloat204;
		Static442.aFloatArray64[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static442.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(II)Lclient!hca;")
	@Override
	public Interface8 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "(I)V")
	@Override
	protected void method8271() {
		@Pc(9) int local9 = this.anIntArray661[super.anInt9746];
		if (local9 != 0) {
			this.anIntArray661[super.anInt9746] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8085(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8133(arg2, arg3);
	}

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "(B)V")
	@Override
	protected void method8214() {
		if (super.bf) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "(I)V")
	@Override
	protected void method8227() {
		for (@Pc(10) int local10 = super.anInt9722 - 1; local10 >= 0; local10--) {
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
		@Pc(85) float[] local85 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(87) int local87 = 0; local87 < 8; local87++) {
			@Pc(93) int local93 = local87 + 16384;
			OpenGL.glLightfv(local93, 4608, local85, 0);
			OpenGL.glLightf(local93, 4615, 0.0F);
			OpenGL.glLightf(local93, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method8227();
	}

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "(I)V")
	@Override
	protected void method8237() {
		OpenGL.glTexEnvi(8960, 34161, Static283.method4510(super.aClass269Array5[super.anInt9746]));
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!jv;Lclient!iaa;ZII)V")
	@Override
	public void method8188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class191 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) byte local18;
		@Pc(22) int local22;
		if (Static184.aClass191_1 == arg2) {
			local22 = arg4 * 2;
			local18 = 1;
		} else if (Static582.aClass191_6 == arg2) {
			local18 = 3;
			local22 = arg4 + 1;
		} else if (Static339.aClass191_4 == arg2) {
			local18 = 4;
			local22 = arg4 * 3;
		} else if (Static206.aClass191_2 == arg2) {
			local22 = arg4 + 2;
			local18 = 6;
		} else if (Static228.aClass191_3 == arg2) {
			local22 = arg4 + 2;
			local18 = 5;
		} else {
			local22 = arg4;
			local18 = 0;
		}
		@Pc(73) Class381 local73 = arg3.method7408();
		@Pc(76) Class127_Sub1 local76 = (Class127_Sub1) arg3;
		local76.method6786();
		OpenGL.glDrawElements(local18, local22, Static17.method512(local73), local76.method6792() + (long) (arg5 * local73.anInt10306));
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "()V")
	@Override
	public void method8108() {
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(Z)V")
	@Override
	protected void method8259() {
		Static442.aFloatArray64[0] = (float) (super.anInt9757 & 0xFF0000) / 1.671168E7F;
		Static442.aFloatArray64[2] = (float) (super.anInt9757 & 0xFF) / 255.0F;
		Static442.aFloatArray64[1] = (float) (super.anInt9757 & 0xFF00) / 65280.0F;
		Static442.aFloatArray64[3] = (float) (super.anInt9757 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static442.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "(I)V")
	@Override
	protected void method8246() {
		if (super.aBoolean696) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!tk", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8218(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!ri;)V")
	@Override
	public void method8243(@OriginalArg(1) Class258 arg0) {
		@Pc(9) Class118[] local9 = ((Class258_Sub1) arg0).aClass118Array1;
		@Pc(11) int local11 = 0;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local9.length; local25++) {
			@Pc(31) Class118 local31 = local9[local25];
			@Pc(36) Class127_Sub2 local36 = this.aClass127_Sub2Array1[local25];
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = local36.method6797();
			@Pc(48) long local48 = local36.method6792();
			local36.method6786();
			for (@Pc(53) int local53 = 0; local53 < local31.method2808(); local53++) {
				@Pc(60) Class371 local60 = local31.method2809(local53);
				if (Static622.aClass371_1 == local60) {
					local23 = true;
					OpenGL.glVertexPointer(3, 5126, local42, (long) local38 + local48);
				} else if (Static622.aClass371_2 == local60) {
					OpenGL.glNormalPointer(5126, local42, local48 + (long) local38);
					local21 = true;
				} else if (Static622.aClass371_3 == local60) {
					OpenGL.glColorPointer(4, 5121, local42, (long) local38 + local48);
					local19 = true;
				} else if (local60 == Static622.aClass371_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local42, local48 + (long) local38);
				} else if (Static622.aClass371_5 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local42, local48 + (long) local38);
				} else if (Static622.aClass371_6 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local42, (long) local38 + local48);
				} else if (Static622.aClass371_7 == local60) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local42, (long) local38 + local48);
				}
				local38 += local60.anInt10157;
			}
		}
		if (this.aBoolean650 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean650 = local23;
		}
		if (local21 != this.aBoolean649) {
			if (local21) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean649 = local21;
		}
		if (local19 != this.aBoolean651) {
			if (local19) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean651 = local19;
		}
		@Pc(279) int local279;
		if (local11 > this.anInt9183) {
			for (local279 = this.anInt9183; local279 < local11; local279++) {
				OpenGL.glClientActiveTexture(local279 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt9183 = local11;
		} else if (this.anInt9183 > local11) {
			for (local279 = local11; local279 < this.anInt9183; local279++) {
				OpenGL.glClientActiveTexture(local279 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt9183 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZI[[I)Lclient!nn;")
	@Override
	public Interface19 method8305(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[][] arg2) {
		return new Class197_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "(I)V")
	@Override
	protected void method8225() {
		OpenGL.glTexEnvi(8960, 34162, Static283.method4510(super.aClass269Array6[super.anInt9746]));
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZZLclient!bp;I)V")
	@Override
	public void method8277(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static313.method7423(arg2));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "(B)V")
	@Override
	protected void method8238() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray92, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!et;ZI[FIZ)Lclient!wk;")
	@Override
	protected Interface27 method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) float[] arg4) {
		if (this.aBoolean657 || Static608.method8539(arg0) && Static608.method8539(arg1)) {
			return new Class197_Sub2(this, arg2, arg0, arg1, arg3, arg4, 0, 0);
		} else if (this.aBoolean656) {
			return new Class197_Sub1(this, arg2, arg0, arg1, arg4, 0, 0);
		} else {
			@Pc(46) Class197_Sub2 local46 = new Class197_Sub2(this, arg2, Static638.aClass381_19, Static613.method8565(arg0), Static613.method8565(arg1));
			local46.method7139(arg4, arg2, arg0, arg1);
			return local46;
		}
	}

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "(I)V")
	@Override
	protected void method8216() {
		if (super.aBoolean690 && !super.aBoolean694) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "(B)V")
	@Override
	protected void method8215() {
		if (super.aBoolean699 && super.aBoolean685 && super.anInt9726 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!ia;B)V")
	@Override
	public void method8192(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		this.aClass127_Sub2Array1[arg0] = (Class127_Sub2) arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)Lclient!ia;")
	@Override
	public Interface10 method8200(@OriginalArg(0) boolean arg0) {
		return new Class127_Sub2(this, arg0);
	}
}
