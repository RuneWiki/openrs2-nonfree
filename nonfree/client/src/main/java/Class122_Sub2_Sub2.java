import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class122_Sub2_Sub2 extends Class122_Sub2 {

	@OriginalMember(owner = "client!ph", name = "ii", descriptor = "J")
	private long aLong285;

	@OriginalMember(owner = "client!ph", name = "Ig", descriptor = "Lclient!bv;")
	private final Class37 aClass37_66 = new Class37();

	@OriginalMember(owner = "client!ph", name = "Qh", descriptor = "Lclient!bv;")
	private final Class37 aClass37_67 = new Class37();

	@OriginalMember(owner = "client!ph", name = "bi", descriptor = "Lclient!bv;")
	private final Class37 aClass37_68 = new Class37();

	@OriginalMember(owner = "client!ph", name = "ci", descriptor = "Lclient!bv;")
	private final Class37 aClass37_69 = new Class37();

	@OriginalMember(owner = "client!ph", name = "fi", descriptor = "Lclient!bv;")
	private final Class37 aClass37_70 = new Class37();

	@OriginalMember(owner = "client!ph", name = "gi", descriptor = "Lclient!bv;")
	private final Class37 aClass37_71 = new Class37();

	@OriginalMember(owner = "client!ph", name = "hi", descriptor = "Lclient!bv;")
	private final Class37 aClass37_72 = new Class37();

	@OriginalMember(owner = "client!ph", name = "ji", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!ph", name = "ni", descriptor = "Z")
	private boolean aBoolean491 = false;

	@OriginalMember(owner = "client!ph", name = "mi", descriptor = "I")
	private final int anInt6813 = 0;

	@OriginalMember(owner = "client!ph", name = "hh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ph", name = "ti", descriptor = "Ljava/lang/String;")
	private final String aString60;

	@OriginalMember(owner = "client!ph", name = "ri", descriptor = "Ljava/lang/String;")
	private final String aString59;

	@OriginalMember(owner = "client!ph", name = "ki", descriptor = "I")
	private final int anInt6811;

	@OriginalMember(owner = "client!ph", name = "qi", descriptor = "Z")
	public boolean aBoolean493;

	@OriginalMember(owner = "client!ph", name = "pi", descriptor = "Z")
	private boolean aBoolean492;

	@OriginalMember(owner = "client!ph", name = "ui", descriptor = "Z")
	private final boolean aBoolean495;

	@OriginalMember(owner = "client!ph", name = "si", descriptor = "Z")
	public final boolean aBoolean494;

	@OriginalMember(owner = "client!ph", name = "li", descriptor = "I")
	public final int anInt6812;

	@OriginalMember(owner = "client!ph", name = "oi", descriptor = "[I")
	public final int[] anIntArray661;

	static {
		new Class306("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!n;Lclient!kr;I)V")
	public Class122_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface8 arg3, @OriginalArg(4) Class171 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.b();
			this.aString60 = OpenGL.glGetString(7936).toLowerCase();
			this.aString59 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString60.indexOf("microsoft") != -1 || this.aString60.indexOf("brian paul") != -1 || this.aString60.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(102) String local102 = OpenGL.glGetString(7938);
			@Pc(110) String[] local110 = Static254.method4297(' ', local102.replace('.', ' '));
			if (local110.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(128) int local128;
			try {
				@Pc(122) int local122 = Static197.method7005(local110[0]);
				local128 = Static197.method7005(local110[1]);
				this.anInt6811 = local128 + local122 * 10;
			} catch (@Pc(137) NumberFormatException local137) {
				throw new RuntimeException("");
			}
			if (this.anInt6811 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(179) int[] local179 = new int[1];
				OpenGL.glGetIntegerv(34018, local179, 0);
				super.anInt6699 = local179[0];
				if (super.anInt6699 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6712 = 8;
				this.aBoolean493 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean476 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean492 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean486 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean495 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean472 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean494 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anInt6812 = Stream.c() ? 33639 : 5121;
				if (this.aString59.indexOf("radeon") != -1) {
					local128 = 0;
					@Pc(276) boolean local276 = false;
					@Pc(278) boolean local278 = false;
					@Pc(287) String[] local287 = Static254.method4297(' ', this.aString59.replace('/', ' '));
					for (@Pc(289) int local289 = 0; local289 < local287.length; local289++) {
						@Pc(295) String local295 = local287[local289];
						try {
							if (local295.length() > 0) {
								if (local295.charAt(0) == 'x' && local295.length() >= 3 && Static328.method5048(local295.substring(1, 3))) {
									local295 = local295.substring(1);
									local278 = true;
								}
								if (local295.equals("hd")) {
									local276 = true;
								} else {
									if (local295.startsWith("hd")) {
										local295 = local295.substring(2);
										local276 = true;
									}
									if (local295.length() >= 4 && Static328.method5048(local295.substring(0, 4))) {
										local128 = Static197.method7005(local295.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(363) Exception local363) {
						}
					}
					if (!local278 && !local276) {
						if (local128 >= 7000 && local128 <= 9250) {
							super.aBoolean472 = false;
						}
						if (local128 >= 7000 && local128 <= 7999) {
							this.aBoolean493 = false;
						}
					}
					this.aBoolean492 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString60.indexOf("intel");
				if (this.aBoolean493) {
					try {
						@Pc(419) int[] local419 = new int[1];
						OpenGL.glGenBuffersARB(1, local419, 0);
					} catch (@Pc(425) Throwable local425) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray661 = new int[super.anInt6699];
				OpenGL.glClear(16640);
				this.anOpenGL1.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(444) Throwable local444) {
			local444.printStackTrace();
			this.method7245();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)Lclient!bd;")
	@Override
	public Interface1 method5660(@OriginalArg(1) boolean arg0) {
		return new Class65_Sub1(this, Static431.aClass264_16, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "(I)V")
	@Override
	protected void method5623() {
		OpenGL.glViewport(super.anInt6723, super.anInt6725, super.anInt6621, super.anInt6649);
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(II)V")
	@Override
	public void method5626(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "(B)V")
	@Override
	protected void method5649() {
		@Pc(15) int local15 = this.anIntArray661[super.anInt6727];
		if (local15 != 0) {
			this.anIntArray661[super.anInt6727] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[[IIZ)Lclient!mca;")
	@Override
	public Interface7 method5631(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class88_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ph", name = "Q", descriptor = "(I)V")
	@Override
	protected void method5636() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray44, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5628(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(10) Long local10 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local10);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!sb;Lclient!uda;)Z")
	@Override
	public boolean method5656(@OriginalArg(1) Class264 arg0, @OriginalArg(2) Class292 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(B)V")
	@Override
	protected void method5586() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt6694 > local7; local7++) {
			@Pc(14) Class1_Sub2 local14 = super.aClass1_Sub2Array5[local7];
			@Pc(18) int local18 = local14.method2432();
			@Pc(23) int local23 = local7 + 16386;
			@Pc(29) float local29 = local14.method2436() / 255.0F;
			Static522.aFloatArray68[0] = local14.method2426();
			Static522.aFloatArray68[1] = local14.method2428();
			Static522.aFloatArray68[2] = local14.method2427();
			Static522.aFloatArray68[3] = 1.0F;
			OpenGL.glLightfv(local23, 4611, Static522.aFloatArray68, 0);
			Static522.aFloatArray68[3] = 1.0F;
			Static522.aFloatArray68[0] = (float) (local18 >> 16 & 0xFF) * local29;
			Static522.aFloatArray68[2] = local29 * (float) (local18 & 0xFF);
			Static522.aFloatArray68[1] = (float) (local18 >> 8 & 0xFF) * local29;
			OpenGL.glLightfv(local23, 4609, Static522.aFloatArray68, 0);
			OpenGL.glLightf(local23, 4617, 1.0F / (float) (local14.method2434() * local14.method2434()));
			OpenGL.glEnable(local23);
		}
		while (local7 < super.anInt6724) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method5586();
	}

	@OriginalMember(owner = "client!ph", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt6813;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!sb;Lclient!uda;III)Lclient!gq;")
	@Override
	public Interface3 method5607(@OriginalArg(0) Class264 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean495 || Static535.method7411(arg3) && Static535.method7411(arg2)) {
			return new Class88_Sub1(this, arg1, arg0, arg3, arg2);
		} else if (this.aBoolean492) {
			return new Class88_Sub4(this, arg1, arg0, arg3, arg2);
		} else {
			return new Class88_Sub1(this, arg1, arg0, Static352.method5306(arg3), Static352.method5306(arg2));
		}
	}

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "(I)V")
	@Override
	protected void method5637() {
		OpenGL.glMatrixMode(5890);
		if (Static275.aClass110_5 == super.aClass110Array3[super.anInt6727]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass118_Sub3Array3[super.anInt6727].method6973(Static365.aFloatArray43), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "(B)V")
	@Override
	protected void method5627() {
		OpenGL.glTexEnvi(8960, 34162, Static459.method6492(super.aClass271Array6[super.anInt6727]));
	}

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "(I)V")
	@Override
	protected void method5584() {
		if (super.aBoolean484) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "(I)V")
	@Override
	protected void method5596() {
		Static522.aFloatArray68[2] = super.aFloat131 * super.aFloat132;
		Static522.aFloatArray68[0] = super.aFloat131 * super.bf;
		Static522.aFloatArray68[3] = 1.0F;
		Static522.aFloatArray68[1] = super.aFloat131 * super.aFloat139;
		OpenGL.glLightModelfv(2899, Static522.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7234(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub9 local19;
		while (!this.aClass37_67.method968()) {
			local19 = (Class1_Sub9) this.aClass37_67.method973();
			Static33.anIntArray113[local11++] = (int) local19.aLong392;
			super.anInt6689 -= local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static33.anIntArray113, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static33.anIntArray113, 0);
			local11 = 0;
		}
		while (!this.aClass37_68.method968()) {
			local19 = (Class1_Sub9) this.aClass37_68.method973();
			Static33.anIntArray113[local11++] = (int) local19.aLong392;
			super.anInt6686 -= local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static33.anIntArray113, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static33.anIntArray113, 0);
			local11 = 0;
		}
		while (!this.aClass37_69.method968()) {
			local19 = (Class1_Sub9) this.aClass37_69.method973();
			Static33.anIntArray113[local11++] = local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static33.anIntArray113, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static33.anIntArray113, 0);
			local11 = 0;
		}
		while (!this.aClass37_70.method968()) {
			local19 = (Class1_Sub9) this.aClass37_70.method973();
			Static33.anIntArray113[local11++] = (int) local19.aLong392;
			super.anInt6690 -= local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static33.anIntArray113, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static33.anIntArray113, 0);
		}
		while (!this.aClass37_66.method968()) {
			local19 = (Class1_Sub9) this.aClass37_66.method973();
			OpenGL.glDeleteLists((int) local19.aLong392, local19.anInt1173);
		}
		@Pc(214) Class1 local214;
		while (!this.aClass37_71.method968()) {
			local214 = this.aClass37_71.method973();
			OpenGL.glDeleteProgramARB((int) local214.aLong392);
		}
		while (!this.aClass37_72.method968()) {
			local214 = this.aClass37_72.method973();
			OpenGL.glDeleteObjectARB(local214.aLong392);
		}
		while (!this.aClass37_66.method968()) {
			local19 = (Class1_Sub9) this.aClass37_66.method973();
			OpenGL.glDeleteLists((int) local19.aLong392, local19.anInt1173);
		}
		if (this.U() > 100663296 && Static60.method1119() > this.aLong285 + 60000L) {
			System.gc();
			this.aLong285 = Static60.method1119();
		}
		super.method7234(local9);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([Lclient!ug;B)Lclient!kq;")
	@Override
	public Class170 method5674(@OriginalArg(0) Class293[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6649 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt6812, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZLclient!lg;)V")
	@Override
	protected void method5659(@OriginalArg(1) int arg0, @OriginalArg(3) Class181 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static445.method6366(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!be;III)V")
	@Override
	public void method5642(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) byte local20;
		@Pc(18) int local18;
		if (Static389.aClass22_5 == arg0) {
			local18 = arg2 * 2;
			local20 = 1;
		} else if (arg0 == Static287.aClass22_3) {
			local20 = 3;
			local18 = arg2 + 1;
		} else if (arg0 == Static354.aClass22_4) {
			local18 = arg2 * 3;
			local20 = 4;
		} else if (Static137.aClass22_1 == arg0) {
			local18 = arg2 + 2;
			local20 = 6;
		} else if (Static527.aClass22_6 == arg0) {
			local20 = 5;
			local18 = arg2 + 2;
		} else {
			local18 = arg2;
			local20 = 0;
		}
		OpenGL.glDrawArrays(local20, arg1, local18);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()Z")
	@Override
	public boolean method7215() {
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7216(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7236();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5589(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(6) Long local6 = (Long) arg0;
		this.anOpenGL1.releaseSurface(arg1, local6);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
	@Override
	public void method7214() {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!ei;)V")
	@Override
	public void method5655(@OriginalArg(1) Class79 arg0) {
		if (Static193.aClass79_11 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(6) int local6 = Static310.method4870(arg0);
		OpenGL.glTexGeni(8192, 9472, local6);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local6);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local6);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "(I)V")
	@Override
	protected void method5556() {
		OpenGL.glActiveTexture(super.anInt6727 + 33984);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z[FILclient!uda;IIII)Lclient!gq;")
	@Override
	protected Interface3 method5673(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) Class292 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aBoolean495 || Static535.method7411(arg3) && Static535.method7411(arg4)) {
			return new Class88_Sub1(this, arg2, arg3, arg4, arg0, arg1, 0, 0);
		} else if (this.aBoolean492) {
			return new Class88_Sub4(this, arg2, arg3, arg4, arg1, 0, 0);
		} else {
			@Pc(59) Class88_Sub1 local59 = new Class88_Sub1(this, arg2, Static431.aClass264_19, Static352.method5306(arg3), Static352.method5306(arg4));
			local59.method2057(arg3, arg1, arg4, arg2);
			return local59;
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(IZ)Lclient!lca;")
	@Override
	public Interface5 method5671(@OriginalArg(1) boolean arg0) {
		return new Class65_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V")
	@Override
	protected void method5564() {
		OpenGL.glScissor(super.anInt6709 + super.anInt6723, -super.anInt6730 + super.anInt6649 + super.anInt6725, -super.anInt6709 + super.anInt6705, super.anInt6730 + -super.anInt6703);
	}

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "()V")
	@Override
	public void method7281() {
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "()Z")
	@Override
	public boolean method7218() {
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "T", descriptor = "(I)V")
	@Override
	protected void method5641() {
		for (@Pc(6) int local6 = super.anInt6699 - 1; local6 >= 0; local6--) {
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
		this.anOpenGL1.setSwapInterval(0);
		super.method5641();
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "()V")
	@Override
	public void method7236() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "(B)V")
	@Override
	protected void method5682() {
		if (super.aBoolean490) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "(I)V")
	@Override
	protected void method5599() {
		Static522.aFloatArray68[2] = super.aFloat136 * super.aFloat132;
		Static522.aFloatArray68[1] = super.aFloat136 * super.aFloat139;
		Static522.aFloatArray68[3] = 1.0F;
		Static522.aFloatArray68[0] = super.bf * super.aFloat136;
		OpenGL.glLightfv(16384, 4609, Static522.aFloatArray68, 0);
		Static522.aFloatArray68[3] = 1.0F;
		Static522.aFloatArray68[1] = -super.aFloat130 * super.aFloat139;
		Static522.aFloatArray68[2] = -super.aFloat130 * super.aFloat132;
		Static522.aFloatArray68[0] = super.bf * -super.aFloat130;
		OpenGL.glLightfv(16385, 4609, Static522.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ph", name = "gb", descriptor = "(I)V")
	private void method5685() {
		if (this.aBoolean491) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass68_5.method1636()) {
			if (!this.aBoolean491) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass118_Sub3_18.method6973(Static365.aFloatArray43), 0);
				this.method5647();
				this.method5586();
				this.aBoolean491 = true;
			}
			if (this.aBoolean491) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean470) {
				OpenGL.glMultMatrixf(super.aClass118_Sub3_15.method6973(Static365.aFloatArray43), 0);
			}
		} else if (super.aBoolean470) {
			OpenGL.glLoadIdentity();
			this.aBoolean491 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass118_Sub3_15.method6973(Static365.aFloatArray43), 0);
			this.aBoolean491 = false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "(I)V")
	@Override
	protected void method5569() {
		if (super.aBoolean481) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!lg;ZZZI)V")
	@Override
	public void method5678(@OriginalArg(0) Class181 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static445.method6366(arg0));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!lca;IB)V")
	@Override
	public void method5665(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "(Z)F")
	@Override
	protected float method5672() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ph", name = "S", descriptor = "(I)V")
	@Override
	protected void method5640() {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "(I)V")
	@Override
	protected void method5593() {
		Static522.aFloatArray68[3] = (float) (super.anInt6707 >>> 24) / 255.0F;
		Static522.aFloatArray68[2] = (float) (super.anInt6707 & 0xFF) / 255.0F;
		Static522.aFloatArray68[0] = (float) (super.anInt6707 & 0xFF0000) / 1.671168E7F;
		Static522.aFloatArray68[1] = (float) (super.anInt6707 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static522.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "()V")
	@Override
	public void method7284() {
		this.method5551(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5572(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "()V")
	@Override
	public void method7238() {
		if (super.anInt6621 <= 0 && super.anInt6649 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt6709;
		@Pc(16) int local16 = super.anInt6705;
		@Pc(19) int local19 = super.anInt6703;
		@Pc(22) int local22 = super.anInt6730;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5568();
		this.method5611(false);
		this.method5633(false);
		this.method5624(false);
		this.method5551(false);
		this.method5651(null);
		this.method5622(false, false, -2);
		this.method5561(1);
		this.method5650(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6621, super.anInt6649, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!ph", name = "V", descriptor = "(I)V")
	@Override
	public void method5647() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray49, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray52, 0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIIIB[I)Lclient!gq;")
	@Override
	public Interface3 method5630(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5) {
		if (this.aBoolean495 || Static535.method7411(arg4) && Static535.method7411(arg1)) {
			return new Class88_Sub1(this, arg4, arg1, arg0, arg5, 0, arg3);
		} else if (this.aBoolean492) {
			return new Class88_Sub4(this, arg4, arg1, arg5, 0, arg3);
		} else {
			@Pc(59) Class88_Sub1 local59 = new Class88_Sub1(this, Static542.aClass292_17, Static431.aClass264_15, Static352.method5306(arg4), Static352.method5306(arg1));
			local59.method7322(arg3, arg5, 0, arg1, arg4, 0);
			return local59;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	public synchronized void method5686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub9 local16 = new Class1_Sub9(arg1);
		local16.aLong392 = arg0;
		this.aClass37_67.method970(local16);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	@Override
	public void method7260(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ph", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "(B)V")
	@Override
	protected void method5625() {
		@Pc(55) int local55;
		if (super.aBoolean474) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local55 = super.anInt6693;
		} else {
			super.aFloat135 = -super.anInt6691 + super.anInt6719;
			super.aFloat137 = (float) -super.anInt6702 + super.aFloat135;
			if (super.aFloat137 < (float) super.anInt6728) {
				super.aFloat137 = super.anInt6728;
			}
			OpenGL.glFogf(2915, super.aFloat137);
			OpenGL.glFogf(2916, super.aFloat135);
			local55 = super.anInt6692;
		}
		Static522.aFloatArray68[1] = (float) (local55 & 0xFF00) / 65280.0F;
		Static522.aFloatArray68[2] = (float) (local55 & 0xFF) / 255.0F;
		Static522.aFloatArray68[0] = (float) (local55 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static522.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "(I)V")
	@Override
	protected void method5600() {
		OpenGL.glDepthMask(super.aBoolean475 && super.aBoolean478);
	}

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "(I)V")
	@Override
	protected void method5608() {
		this.method5685();
	}

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "(I)V")
	@Override
	protected void method5601() {
		OpenGL.glTexEnvi(8960, 34161, Static459.method6492(super.aClass271Array5[super.anInt6727]));
	}

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "()V")
	@Override
	protected void method7245() {
		super.method7245();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.a();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([BBIIILclient!uda;)Lclient!nf;")
	@Override
	public Interface9 method5588(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class292 arg1) {
		return new Class88_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!rn;Lclient!rn;FLclient!rn;)Lclient!rn;")
	@Override
	public Class45 method7233(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class45 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "(I)V")
	@Override
	protected void method5552() {
		if (Static119.aClass155_1 == super.aClass155_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass155_5 == Static437.aClass155_7) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static391.aClass155_6 == super.aClass155_5) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!sb;Lclient!uda;I)Z")
	@Override
	public boolean method5618(@OriginalArg(0) Class264 arg0, @OriginalArg(1) Class292 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "(I)V")
	@Override
	protected void method5603() {
		this.method5685();
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)Lclient!sf;")
	@Override
	protected Class42 method5577(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class42_Sub4(this, super.aClass171_110);
		} else if (arg0 == 4) {
			return new Class42_Sub5(this, super.aClass171_110, super.aClass241_6);
		} else {
			return super.method5577(arg0);
		}
	}

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "(II)V")
	public synchronized void method5689(@OriginalArg(0) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong392 = arg0;
		this.aClass37_71.method970(local7);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!be;Lclient!bd;IIIII)V")
	@Override
	public void method5669(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) byte local13;
		@Pc(17) int local17;
		if (arg0 == Static389.aClass22_5) {
			local13 = 1;
			local17 = arg4 * 2;
		} else if (Static287.aClass22_3 == arg0) {
			local13 = 3;
			local17 = arg4 + 1;
		} else if (arg0 == Static354.aClass22_4) {
			local13 = 4;
			local17 = arg4 * 3;
		} else if (arg0 == Static137.aClass22_1) {
			local13 = 6;
			local17 = arg4 + 2;
		} else if (arg0 == Static527.aClass22_6) {
			local13 = 5;
			local17 = arg4 + 2;
		} else {
			local13 = 0;
			local17 = arg4;
		}
		@Pc(74) Class264 local74 = arg1.method5231();
		@Pc(77) Class65_Sub1 local77 = (Class65_Sub1) arg1;
		local77.method5210();
		OpenGL.glDrawElements(local13, local17, Static258.method4328(local74), local77.method5206() + (long) (local74.anInt7501 * arg5));
	}

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "(I)V")
	@Override
	protected void method5558() {
		if (super.aBoolean489) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5578(@OriginalArg(1) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "(B)V")
	@Override
	protected void method5587() {
		if (super.aBoolean480) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
	public synchronized void method5691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub9 local8 = new Class1_Sub9(arg0);
		local8.aLong392 = arg1;
		this.aClass37_68.method970(local8);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BILclient!uda;BIZI)Lclient!gq;")
	@Override
	protected Interface3 method5652(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class292 arg3, @OriginalArg(6) boolean arg4) {
		if (this.aBoolean495 || Static535.method7411(arg2) && Static535.method7411(arg0)) {
			return new Class88_Sub1(this, arg3, arg2, arg0, arg4, arg1, 0, 0);
		} else if (this.aBoolean492) {
			return new Class88_Sub4(this, arg3, arg2, arg0, arg1, 0, 0);
		} else {
			@Pc(35) Class88_Sub1 local35 = new Class88_Sub1(this, arg3, Static431.aClass264_15, Static352.method5306(arg2), Static352.method5306(arg0));
			local35.method7321(0, arg1, arg2, arg3, arg0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "()V")
	@Override
	public void method7247() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "(I)V")
	@Override
	protected void method5604() {
		if (super.aBoolean488 && !super.aBoolean483) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "()Lclient!qf;")
	@Override
	public Class246 method7276() {
		@Pc(7) int local7 = -1;
		if (this.aString60.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString60.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString60.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class246(local7, "OpenGL", this.anInt6811, this.aString59, 0L);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
	@Override
	protected void method5566(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(15) Long local15 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local15)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "(I)V")
	@Override
	protected void method5615() {
		if (super.aBoolean482 && super.aBoolean471 && super.anInt6702 >= 0 | super.aBoolean474) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!kq;I)V")
	@Override
	public void method5573(@OriginalArg(0) Class170 arg0) {
	}
}
