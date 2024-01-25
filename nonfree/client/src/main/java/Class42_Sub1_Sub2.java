import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class42_Sub1_Sub2 extends Class42_Sub1 {

	@OriginalMember(owner = "client!pi", name = "hi", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!pi", name = "Uh", descriptor = "Lclient!dm;")
	private final Class73 aClass73_57 = new Class73();

	@OriginalMember(owner = "client!pi", name = "Xh", descriptor = "Lclient!dm;")
	private final Class73 aClass73_58 = new Class73();

	@OriginalMember(owner = "client!pi", name = "ai", descriptor = "Lclient!dm;")
	private final Class73 aClass73_59 = new Class73();

	@OriginalMember(owner = "client!pi", name = "di", descriptor = "Lclient!dm;")
	private final Class73 aClass73_60 = new Class73();

	@OriginalMember(owner = "client!pi", name = "ei", descriptor = "Lclient!dm;")
	private final Class73 aClass73_61 = new Class73();

	@OriginalMember(owner = "client!pi", name = "fi", descriptor = "Lclient!dm;")
	private final Class73 aClass73_62 = new Class73();

	@OriginalMember(owner = "client!pi", name = "gi", descriptor = "Lclient!dm;")
	private final Class73 aClass73_63 = new Class73();

	@OriginalMember(owner = "client!pi", name = "ii", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!pi", name = "li", descriptor = "I")
	private final int anInt7219 = 0;

	@OriginalMember(owner = "client!pi", name = "pi", descriptor = "Z")
	private boolean aBoolean520 = false;

	@OriginalMember(owner = "client!pi", name = "Dh", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!pi", name = "ki", descriptor = "Ljava/lang/String;")
	private final String aString82;

	@OriginalMember(owner = "client!pi", name = "si", descriptor = "Ljava/lang/String;")
	private final String aString83;

	@OriginalMember(owner = "client!pi", name = "oi", descriptor = "I")
	private final int anInt7220;

	@OriginalMember(owner = "client!pi", name = "mi", descriptor = "Z")
	public boolean aBoolean518;

	@OriginalMember(owner = "client!pi", name = "ji", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!pi", name = "ti", descriptor = "Z")
	private final boolean aBoolean521;

	@OriginalMember(owner = "client!pi", name = "ni", descriptor = "Z")
	public final boolean aBoolean519;

	@OriginalMember(owner = "client!pi", name = "qi", descriptor = "I")
	public final int anInt7221;

	@OriginalMember(owner = "client!pi", name = "ri", descriptor = "[I")
	public final int[] anIntArray482;

	static {
		new Class88("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!n;Lclient!an;I)V")
	public Class42_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString82 = OpenGL.glGetString(7936).toLowerCase();
			this.aString83 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString82.indexOf("microsoft") != -1 || this.aString82.indexOf("brian paul") != -1 || this.aString82.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(104) String local104 = OpenGL.glGetString(7938);
			@Pc(112) String[] local112 = Static434.method6610(local104.replace('.', ' '), ' ');
			if (local112.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(130) int local130;
			try {
				@Pc(124) int local124 = Static467.method7015(local112[0]);
				local130 = Static467.method7015(local112[1]);
				this.anInt7220 = local130 + local124 * 10;
			} catch (@Pc(139) NumberFormatException local139) {
				throw new RuntimeException("");
			}
			if (this.anInt7220 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(183) int[] local183 = new int[1];
				OpenGL.glGetIntegerv(34018, local183, 0);
				super.anInt7129 = local183[0];
				if (super.anInt7129 < 2) {
					throw new RuntimeException("");
				}
				super.anInt7101 = 8;
				this.aBoolean518 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean511 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean517 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean502 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean521 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean501 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean519 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anInt7221 = Stream.c() ? 33639 : 5121;
				if (this.aString83.indexOf("radeon") != -1) {
					local130 = 0;
					@Pc(281) boolean local281 = false;
					@Pc(283) boolean local283 = false;
					@Pc(292) String[] local292 = Static434.method6610(this.aString83.replace('/', ' '), ' ');
					for (@Pc(294) int local294 = 0; local294 < local292.length; local294++) {
						@Pc(300) String local300 = local292[local294];
						try {
							if (local300.length() > 0) {
								if (local300.charAt(0) == 'x' && local300.length() >= 3 && Static261.method4417(local300.substring(1, 3))) {
									local283 = true;
									local300 = local300.substring(1);
								}
								if (local300.equals("hd")) {
									local281 = true;
								} else {
									if (local300.startsWith("hd")) {
										local281 = true;
										local300 = local300.substring(2);
									}
									if (local300.length() >= 4 && Static261.method4417(local300.substring(0, 4))) {
										local130 = Static467.method7015(local300.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(365) Exception local365) {
						}
					}
					if (!local283 && !local281) {
						if (local130 >= 7000 && local130 <= 9250) {
							super.aBoolean501 = false;
						}
						if (local130 >= 7000 && local130 <= 7999) {
							this.aBoolean518 = false;
						}
					}
					this.aBoolean517 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString82.indexOf("intel");
				if (this.aBoolean518) {
					try {
						@Pc(419) int[] local419 = new int[1];
						OpenGL.glGenBuffersARB(1, local419, 0);
					} catch (@Pc(425) Throwable local425) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray482 = new int[super.anInt7129];
				OpenGL.glClear(16640);
				this.anOpenGL2.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(444) Throwable local444) {
			local444.printStackTrace();
			this.method5800();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(II)Lclient!cj;")
	@Override
	protected Class21 method5978(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class21_Sub1(this, super.aClass16_91);
		} else if (arg0 == 4) {
			return new Class21_Sub4(this, super.aClass16_91, super.aClass236_5);
		} else {
			return super.method5978(arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
	@Override
	protected void method5946(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(6) Long local6 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local6);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZB)Lclient!uj;")
	@Override
	public Interface18 method5906(@OriginalArg(0) boolean arg0) {
		return new Class57_Sub2(this, Static155.aClass114_7, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "()Z")
	@Override
	public boolean method5836() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "()V")
	@Override
	protected void method5800() {
		super.method5800();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(ZI)V")
	@Override
	public void method5985(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!lu;IZ)V")
	@Override
	public void method5877(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!dk;Lclient!ge;)Z")
	@Override
	public boolean method5911(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class114 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!vc;I)V")
	@Override
	public void method5972(@OriginalArg(0) Class301 arg0) {
		if (Static166.aClass301_3 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(16) int local16 = Static455.method7169(arg0);
		OpenGL.glTexGeni(8192, 9472, local16);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local16);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local16);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILclient!uj;IIILclient!io;)V")
	@Override
	public void method5986(@OriginalArg(1) int arg0, @OriginalArg(2) Interface18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class147 arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static325.aClass147_7 == arg5) {
			local12 = arg3 * 2;
			local14 = 1;
		} else if (arg5 == Static194.aClass147_4) {
			local12 = arg3 + 1;
			local14 = 3;
		} else if (Static480.aClass147_8 == arg5) {
			local12 = arg3 * 3;
			local14 = 4;
		} else if (Static338.aClass147_3 == arg5) {
			local14 = 6;
			local12 = arg3 + 2;
		} else if (arg5 == Static205.aClass147_5) {
			local12 = arg3 + 2;
			local14 = 5;
		} else {
			local12 = arg3;
			local14 = 0;
		}
		@Pc(68) Class114 local68 = arg1.method7540();
		@Pc(75) Class57_Sub2 local75 = (Class57_Sub2) arg1;
		local75.method7530();
		OpenGL.glDrawElements(local14, local12, Static481.method7156(local68), local75.method7538() + (long) (arg4 * local68.anInt3379));
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method5910(@OriginalArg(1) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL2.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(B)V")
	@Override
	protected void method5902() {
		OpenGL.glMatrixMode(5890);
		if (Static339.aClass299_3 == super.aClass299Array3[super.anInt7107]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass91_Sub2Array3[super.anInt7107].method5503(Static378.aFloatArray66), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method5861(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class12_Sub18 local19;
		while (!this.aClass73_58.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_58.method2008();
			Static350.anIntArray457[local11++] = (int) local19.aLong248;
			super.anInt7096 -= local19.anInt3978;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static350.anIntArray457, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static350.anIntArray457, 0);
			local11 = 0;
		}
		while (!this.aClass73_59.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_59.method2008();
			Static350.anIntArray457[local11++] = (int) local19.aLong248;
			super.anInt7093 -= local19.anInt3978;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static350.anIntArray457, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static350.anIntArray457, 0);
			local11 = 0;
		}
		while (!this.aClass73_60.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_60.method2008();
			Static350.anIntArray457[local11++] = local19.anInt3978;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static350.anIntArray457, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static350.anIntArray457, 0);
			local11 = 0;
		}
		while (!this.aClass73_61.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_61.method2008();
			Static350.anIntArray457[local11++] = (int) local19.aLong248;
			super.anInt7094 -= local19.anInt3978;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static350.anIntArray457, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static350.anIntArray457, 0);
		}
		while (!this.aClass73_57.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_57.method2008();
			OpenGL.glDeleteLists((int) local19.aLong248, local19.anInt3978);
		}
		@Pc(218) Class12 local218;
		while (!this.aClass73_62.method2015()) {
			local218 = this.aClass73_62.method2008();
			OpenGL.glDeleteProgramARB((int) local218.aLong248);
		}
		while (!this.aClass73_63.method2015()) {
			local218 = this.aClass73_63.method2008();
			OpenGL.glDeleteObjectARB(local218.aLong248);
		}
		while (!this.aClass73_57.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_57.method2008();
			OpenGL.glDeleteLists((int) local19.aLong248, local19.anInt3978);
		}
		if (this.U() > 100663296 && this.aLong182 + 60000L < Static76.method1679()) {
			System.gc();
			this.aLong182 = Static76.method1679();
		}
		super.method5861(local9);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILclient!dk;I[B)Lclient!uda;")
	@Override
	public Interface17 method5962(@OriginalArg(3) Class72 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class66_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ge;Lclient!dk;BII)Lclient!wn;")
	@Override
	public Interface20 method5952(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean521 || Static78.method1703(arg3) && Static78.method1703(arg2)) {
			return new Class66_Sub4(this, arg1, arg0, arg3, arg2);
		} else if (this.aBoolean517) {
			return new Class66_Sub2(this, arg1, arg0, arg3, arg2);
		} else {
			return new Class66_Sub4(this, arg1, arg0, Static37.method6277(arg3), Static37.method6277(arg2));
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BIIZI[II)Lclient!wn;")
	@Override
	public Interface20 method5876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean521 || Static78.method1703(arg5) && Static78.method1703(arg1)) {
			return new Class66_Sub4(this, arg5, arg1, arg2, arg4, 0, arg3);
		} else if (this.aBoolean517) {
			return new Class66_Sub2(this, arg5, arg1, arg4, 0, arg3);
		} else {
			@Pc(56) Class66_Sub4 local56 = new Class66_Sub4(this, Static306.aClass72_5, Static155.aClass114_6, Static37.method6277(arg5), Static37.method6277(arg1));
			local56.method6986(arg4, arg3, 0, arg5, arg1, 0);
			return local56;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public synchronized void method6001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class12_Sub18 local8 = new Class12_Sub18(arg0);
		local8.aLong248 = arg1;
		this.aClass73_58.method2012(local8);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLclient!dk;Lclient!ge;)Z")
	@Override
	public boolean method5923(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class114 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5999(@OriginalArg(0) Class287 arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "(I)V")
	@Override
	protected void method5992() {
		if (super.aClass187_26 == Static220.aClass187_18) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass187_26 == Static301.aClass187_21) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass187_26 == Static22.aClass187_34) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "(Z)V")
	@Override
	protected void method5968() {
		OpenGL.glTexEnvi(8960, 34161, Static17.method402(super.aClass129Array6[super.anInt7107]));
	}

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "(Z)V")
	@Override
	protected void method5938() {
		OpenGL.glActiveTexture(super.anInt7107 + 33984);
	}

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "()Z")
	@Override
	public boolean method5842() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "(I)V")
	@Override
	protected void method5981() {
		@Pc(11) int local11;
		for (local11 = 0; local11 < super.anInt7139; local11++) {
			@Pc(18) Class12_Sub7 local18 = super.aClass12_Sub7Array4[local11];
			@Pc(22) int local22 = local18.method5118();
			@Pc(26) int local26 = local11 + 16386;
			@Pc(32) float local32 = local18.method5125() / 255.0F;
			Static328.aFloatArray50[0] = local18.method5124();
			Static328.aFloatArray50[1] = local18.method5120();
			Static328.aFloatArray50[2] = local18.method5117();
			Static328.aFloatArray50[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static328.aFloatArray50, 0);
			Static328.aFloatArray50[3] = 1.0F;
			Static328.aFloatArray50[2] = (float) (local22 & 0xFF) * local32;
			Static328.aFloatArray50[0] = local32 * (float) (local22 >> 16 & 0xFF);
			Static328.aFloatArray50[1] = local32 * (float) (local22 >> 8 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static328.aFloatArray50, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local18.method5123() * local18.method5123()));
			OpenGL.glEnable(local26);
		}
		while (local11 < super.anInt7135) {
			OpenGL.glDisable(local11 + 16386);
			local11++;
		}
		super.method5981();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	@Override
	protected void method5984(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local10);
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "()V")
	@Override
	public void method5821() throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5896(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		if (!this.anOpenGL2.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "()V")
	@Override
	public void method5816() {
		if (super.anInt7027 <= 0 && super.anInt7054 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt7124;
		@Pc(16) int local16 = super.anInt7116;
		@Pc(19) int local19 = super.anInt7111;
		@Pc(22) int local22 = super.anInt7130;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5970();
		this.method5928(false);
		this.method5886(false);
		this.method5927(false);
		this.method5885(false);
		this.method5868(null);
		this.method5997(-2, false, false);
		this.method5979(1);
		this.method5955(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt7027, super.anInt7054, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "(Z)V")
	@Override
	protected void method5925() {
		if (super.aBoolean516) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "()Lclient!la;")
	@Override
	public Class179 method5828() {
		@Pc(7) int local7 = -1;
		if (this.aString82.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString82.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString82.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class179(local7, "OpenGL", this.anInt7220, this.aString83, 0L);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([[IIZZ)Lclient!jg;")
	@Override
	public Interface8 method5947(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class66_Sub1(this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "()V")
	@Override
	public void method5810() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIZ)V")
	public synchronized void method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class12_Sub18 local8 = new Class12_Sub18(arg0);
		local8.aLong248 = arg1;
		this.aClass73_59.method2012(local8);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([Lclient!ds;Z)Lclient!tq;")
	@Override
	public Class287 method5940(@OriginalArg(0) Class75[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZILclient!vf;I)V")
	@Override
	public void method5983(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class302 arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static215.method3988(arg3));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!sv;Lclient!sv;FLclient!sv;)Lclient!sv;")
	@Override
	public Class124 method5805(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class124 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BIILclient!io;)V")
	@Override
	public void method5937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class147 arg2) {
		@Pc(20) byte local20;
		@Pc(18) int local18;
		if (arg2 == Static325.aClass147_7) {
			local18 = arg1 * 2;
			local20 = 1;
		} else if (arg2 == Static194.aClass147_4) {
			local18 = arg1 + 1;
			local20 = 3;
		} else if (Static480.aClass147_8 == arg2) {
			local20 = 4;
			local18 = arg1 * 3;
		} else if (arg2 == Static338.aClass147_3) {
			local18 = arg1 + 2;
			local20 = 6;
		} else if (Static205.aClass147_5 == arg2) {
			local20 = 5;
			local18 = arg1 + 2;
		} else {
			local20 = 0;
			local18 = arg1;
		}
		OpenGL.glDrawArrays(local20, arg0, local18);
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(Z)F")
	@Override
	protected float method5920() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt7054 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt7221, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "(I)V")
	@Override
	protected void method5926() {
		OpenGL.glViewport(super.anInt7119, super.anInt7106, super.anInt7027, super.anInt7054);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BZ)Lclient!lu;")
	@Override
	public Interface10 method5930(@OriginalArg(1) boolean arg0) {
		return new Class57_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "(I)V")
	@Override
	protected void method5878() {
		@Pc(15) int local15;
		if (super.aBoolean508) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = super.anInt7127;
		} else {
			super.aFloat162 = -super.anInt7120 + super.anInt7128;
			super.aFloat166 = super.aFloat162 - (float) super.anInt7104;
			if (super.aFloat166 < (float) super.anInt7126) {
				super.aFloat166 = super.anInt7126;
			}
			OpenGL.glFogf(2915, super.aFloat166);
			OpenGL.glFogf(2916, super.aFloat162);
			local15 = super.anInt7132;
		}
		Static328.aFloatArray50[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static328.aFloatArray50[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static328.aFloatArray50[2] = (float) (local15 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static328.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!pi", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt7219;
	}

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "()V")
	@Override
	public void method5845() {
	}

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "(I)V")
	@Override
	protected void method5948() {
		if (super.aBoolean514) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
	@Override
	protected void method5872() {
		if (super.aBoolean509) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(B)V")
	@Override
	protected void method5892() {
		Static328.aFloatArray50[1] = super.aFloat169 * super.aFloat165;
		Static328.aFloatArray50[0] = super.aFloat165 * super.aFloat158;
		Static328.aFloatArray50[2] = super.aFloat165 * super.aFloat168;
		Static328.aFloatArray50[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static328.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!dk;I[FIIIZ)Lclient!wn;")
	@Override
	protected Interface20 method5880(@OriginalArg(1) Class72 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean521 || Static78.method1703(arg1) && Static78.method1703(arg3)) {
			return new Class66_Sub4(this, arg0, arg1, arg3, arg4, arg2, 0, 0);
		} else if (this.aBoolean517) {
			return new Class66_Sub2(this, arg0, arg1, arg3, arg2, 0, 0);
		} else {
			@Pc(59) Class66_Sub4 local59 = new Class66_Sub4(this, arg0, Static155.aClass114_10, Static37.method6277(arg1), Static37.method6277(arg3));
			local59.method6989(arg3, arg2, arg1, arg0);
			return local59;
		}
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(II)V")
	@Override
	public void method5996(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "(B)V")
	@Override
	protected void method5939() {
		if (super.bf && !super.aBoolean507) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "(I)V")
	@Override
	protected void method5963() {
		Static328.aFloatArray50[1] = super.aFloat169 * super.aFloat167;
		Static328.aFloatArray50[3] = 1.0F;
		Static328.aFloatArray50[0] = super.aFloat158 * super.aFloat167;
		Static328.aFloatArray50[2] = super.aFloat168 * super.aFloat167;
		OpenGL.glLightfv(16384, 4609, Static328.aFloatArray50, 0);
		Static328.aFloatArray50[3] = 1.0F;
		Static328.aFloatArray50[0] = -super.aFloat163 * super.aFloat158;
		Static328.aFloatArray50[1] = -super.aFloat163 * super.aFloat169;
		Static328.aFloatArray50[2] = -super.aFloat163 * super.aFloat168;
		OpenGL.glLightfv(16385, 4609, Static328.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "(I)V")
	@Override
	protected void method5944() {
		@Pc(19) int local19 = this.anIntArray482[super.anInt7107];
		if (local19 != 0) {
			this.anIntArray482[super.anInt7107] = 0;
			OpenGL.glBindTexture(local19, 0);
			OpenGL.glDisable(local19);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILclient!vf;Z)V")
	@Override
	protected void method5869(@OriginalArg(1) int arg0, @OriginalArg(2) Class302 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static215.method3988(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "(B)V")
	@Override
	protected void method5924() {
		OpenGL.glScissor(super.anInt7124 + super.anInt7119, -super.anInt7130 + super.anInt7054 + super.anInt7106, super.anInt7116 - super.anInt7124, -super.anInt7111 + super.anInt7130);
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(B)V")
	@Override
	protected void method5932() {
		OpenGL.glDepthMask(super.aBoolean499 && super.aBoolean513);
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V")
	@Override
	protected void method5882() {
		if (super.aBoolean512 && super.aBoolean500 && super.aBoolean508 | super.anInt7104 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "(I)V")
	@Override
	protected void method5989() {
		this.method6004();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	@Override
	public void method5792() {
		this.method5885(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "(Z)V")
	@Override
	protected void method5895() {
		for (@Pc(10) int local10 = super.anInt7129 - 1; local10 >= 0; local10--) {
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
		@Pc(75) float[] local75 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(77) int local77 = 0; local77 < 8; local77++) {
			@Pc(83) int local83 = local77 + 16384;
			OpenGL.glLightfv(local83, 4608, local75, 0);
			OpenGL.glLightf(local83, 4615, 0.0F);
			OpenGL.glLightf(local83, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method5895();
	}

	@OriginalMember(owner = "client!pi", name = "bb", descriptor = "(I)V")
	private void method6004() {
		if (this.aBoolean520) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass4_6.method202()) {
			if (!this.aBoolean520) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass91_Sub2_18.method5503(Static378.aFloatArray66), 0);
				this.method5874();
				this.method5981();
				this.aBoolean520 = true;
			}
			if (this.aBoolean520) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean497) {
				OpenGL.glMultMatrixf(super.aClass91_Sub2_15.method5503(Static378.aFloatArray66), 0);
				return;
			}
		} else if (super.aBoolean497) {
			OpenGL.glLoadIdentity();
			this.aBoolean520 = false;
			return;
		} else {
			OpenGL.glLoadMatrixf(super.aClass91_Sub2_15.method5503(Static378.aFloatArray66), 0);
			this.aBoolean520 = false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(I)V")
	@Override
	protected void method5884() {
		if (super.aBoolean515) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "()V")
	@Override
	public void method5794() {
	}

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "(I)V")
	@Override
	protected void method5971() {
		OpenGL.glTexEnvi(8960, 34162, Static17.method402(super.aClass129Array5[super.anInt7107]));
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V")
	@Override
	public void method5874() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray63, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "(I)V")
	@Override
	protected void method5954() {
	}

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "(I)V")
	@Override
	protected void method5913() {
		if (super.aBoolean504) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIILclient!dk;II[BI)Lclient!wn;")
	@Override
	protected Interface20 method5914(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class72 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		if (this.aBoolean521 || Static78.method1703(arg3) && Static78.method1703(arg1)) {
			return new Class66_Sub4(this, arg2, arg3, arg1, arg0, arg4, 0, 0);
		} else if (this.aBoolean517) {
			return new Class66_Sub2(this, arg2, arg3, arg1, arg4, 0, 0);
		} else {
			@Pc(34) Class66_Sub4 local34 = new Class66_Sub4(this, arg2, Static155.aClass114_6, Static37.method6277(arg3), Static37.method6277(arg1));
			local34.method6983(arg4, arg1, 0, arg2, arg3);
			return local34;
		}
	}

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "(I)V")
	@Override
	protected void method5965() {
		this.method6004();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5803(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5835(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5821();
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "(II)V")
	public synchronized void method6006(@OriginalArg(1) int arg0) {
		@Pc(7) Class12 local7 = new Class12();
		local7.aLong248 = arg0;
		this.aClass73_62.method2012(local7);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5806(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "(B)V")
	@Override
	protected void method5941() {
		Static328.aFloatArray50[0] = (float) (super.anInt7134 & 0xFF0000) / 1.671168E7F;
		Static328.aFloatArray50[2] = (float) (super.anInt7134 & 0xFF) / 255.0F;
		Static328.aFloatArray50[3] = (float) (super.anInt7134 >>> 24) / 255.0F;
		Static328.aFloatArray50[1] = (float) (super.anInt7134 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static328.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "(I)V")
	@Override
	protected void method5950() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray61, 0);
		OpenGL.glMatrixMode(5888);
	}
}
