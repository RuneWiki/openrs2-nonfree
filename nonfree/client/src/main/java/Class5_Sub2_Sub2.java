import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hl", name = "ui", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!hl", name = "vi", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!hl", name = "wi", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!hl", name = "xi", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!hl", name = "yi", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!hl", name = "Bi", descriptor = "I")
	private int anInt4981;

	@OriginalMember(owner = "client!hl", name = "Ci", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!hl", name = "Yg", descriptor = "Lclient!kba;")
	private final Class163 aClass163_24 = new Class163();

	@OriginalMember(owner = "client!hl", name = "ci", descriptor = "Lclient!kba;")
	private final Class163 aClass163_25 = new Class163();

	@OriginalMember(owner = "client!hl", name = "ji", descriptor = "Lclient!kba;")
	private final Class163 aClass163_26 = new Class163();

	@OriginalMember(owner = "client!hl", name = "mi", descriptor = "Lclient!kba;")
	private final Class163 aClass163_27 = new Class163();

	@OriginalMember(owner = "client!hl", name = "qi", descriptor = "Lclient!kba;")
	private final Class163 aClass163_28 = new Class163();

	@OriginalMember(owner = "client!hl", name = "si", descriptor = "Lclient!kba;")
	private final Class163 aClass163_29 = new Class163();

	@OriginalMember(owner = "client!hl", name = "ti", descriptor = "Lclient!kba;")
	private final Class163 aClass163_30 = new Class163();

	@OriginalMember(owner = "client!hl", name = "zi", descriptor = "[Lclient!va;")
	private final Class84_Sub2[] aClass84_Sub2Array1 = new Class84_Sub2[16];

	@OriginalMember(owner = "client!hl", name = "Ai", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!hl", name = "Di", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!hl", name = "Hi", descriptor = "I")
	private final int anInt4983 = 0;

	@OriginalMember(owner = "client!hl", name = "Vg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!hl", name = "Pi", descriptor = "Ljava/lang/String;")
	private final String aString49;

	@OriginalMember(owner = "client!hl", name = "Gi", descriptor = "Ljava/lang/String;")
	private final String aString48;

	@OriginalMember(owner = "client!hl", name = "Ei", descriptor = "I")
	private final int anInt4982;

	@OriginalMember(owner = "client!hl", name = "Mi", descriptor = "Z")
	public boolean aBoolean404;

	@OriginalMember(owner = "client!hl", name = "Ni", descriptor = "Z")
	private boolean aBoolean405;

	@OriginalMember(owner = "client!hl", name = "Fi", descriptor = "Z")
	private final boolean aBoolean400;

	@OriginalMember(owner = "client!hl", name = "Ii", descriptor = "Z")
	public final boolean aBoolean401;

	@OriginalMember(owner = "client!hl", name = "Ji", descriptor = "Z")
	public final boolean aBoolean402;

	@OriginalMember(owner = "client!hl", name = "Li", descriptor = "Z")
	public final boolean aBoolean403;

	@OriginalMember(owner = "client!hl", name = "Oi", descriptor = "[I")
	public final int[] anIntArray209;

	@OriginalMember(owner = "client!hl", name = "Ki", descriptor = "I")
	public final int anInt4984;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!ni;I)V")
	public Class5_Sub2_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class223 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.b();
			this.aString49 = OpenGL.glGetString(7936).toLowerCase();
			this.aString48 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString49.indexOf("microsoft") != -1 || this.aString49.indexOf("brian paul") != -1 || this.aString49.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static206.method3730(local108.replace('.', ' '), ' ');
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(134) int local134;
			try {
				@Pc(128) int local128 = Static533.method7565(local116[0]);
				local134 = Static533.method7565(local116[1]);
				this.anInt4982 = local134 + local128 * 10;
			} catch (@Pc(143) NumberFormatException local143) {
				throw new RuntimeException("");
			}
			if (this.anInt4982 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(187) int[] local187 = new int[1];
				OpenGL.glGetIntegerv(34018, local187, 0);
				super.anInt4880 = local187[0];
				if (super.anInt4880 < 2) {
					throw new RuntimeException("");
				}
				super.anInt4863 = 8;
				this.aBoolean404 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean376 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean405 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean381 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean400 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean386 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean401 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean402 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean403 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray209 = new int[super.anInt4880];
				this.anInt4984 = Stream.a() ? 33639 : 5121;
				if (this.aString48.indexOf("radeon") != -1) {
					local134 = 0;
					@Pc(289) boolean local289 = false;
					@Pc(291) boolean local291 = false;
					@Pc(300) String[] local300 = Static206.method3730(this.aString48.replace('/', ' '), ' ');
					for (@Pc(302) int local302 = 0; local302 < local300.length; local302++) {
						@Pc(308) String local308 = local300[local302];
						try {
							if (local308.length() > 0) {
								if (local308.charAt(0) == 'x' && local308.length() >= 3 && Static394.method6226(local308.substring(1, 3))) {
									local308 = local308.substring(1);
									local291 = true;
								}
								if (local308.equals("hd")) {
									local289 = true;
								} else {
									if (local308.startsWith("hd")) {
										local308 = local308.substring(2);
										local289 = true;
									}
									if (local308.length() >= 4 && Static394.method6226(local308.substring(0, 4))) {
										local134 = Static533.method7565(local308.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(375) Exception local375) {
						}
					}
					if (!local291 && !local289) {
						if (local134 >= 7000 && local134 <= 7999) {
							this.aBoolean404 = false;
						}
						if (local134 >= 7000 && local134 <= 9250) {
							super.aBoolean386 = false;
						}
					}
					this.aBoolean405 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString49.indexOf("intel");
				if (this.aBoolean404) {
					try {
						@Pc(423) int[] local423 = new int[1];
						OpenGL.glGenBuffersARB(1, local423, 0);
					} catch (@Pc(429) Throwable local429) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(435) Throwable local435) {
			local435.printStackTrace();
			this.method6106();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
	@Override
	public void method3997(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!hl", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZBLclient!ef;Z)V")
	@Override
	public void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class80 arg2, @OriginalArg(4) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, Static139.method2766(arg2));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!oq;IBI)V")
	@Override
	public void method4040(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) byte local21;
		@Pc(19) int local19;
		if (Static572.aClass248_10 == arg0) {
			local19 = arg2 * 2;
			local21 = 1;
		} else if (arg0 == Static255.aClass248_5) {
			local19 = arg2 + 1;
			local21 = 3;
		} else if (arg0 == Static574.aClass248_11) {
			local21 = 4;
			local19 = arg2 * 3;
		} else if (arg0 == Static258.aClass248_6) {
			local19 = arg2 + 2;
			local21 = 6;
		} else if (Static173.aClass248_3 == arg0) {
			local19 = arg2 + 2;
			local21 = 5;
		} else {
			local19 = arg2;
			local21 = 0;
		}
		OpenGL.glDrawArrays(local21, arg1, local19);
	}

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "(B)V")
	private void method4071() {
		if (this.aBoolean396) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass220_4.method5917()) {
			if (!this.aBoolean398) {
				OpenGL.glLoadMatrixf(super.aClass115_Sub3_18.method6302(Static321.aFloatArray59), 0);
				this.aBoolean398 = true;
				this.method4068();
				this.method4038();
			}
			if (super.aBoolean373) {
				this.aBoolean396 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass115_Sub3_15.method6302(Static321.aFloatArray59), 0);
				this.aBoolean396 = true;
			}
		} else if (super.aBoolean373) {
			OpenGL.glLoadIdentity();
			this.aBoolean396 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass115_Sub3_15.method6302(Static321.aFloatArray59), 0);
			this.aBoolean396 = false;
		}
	}

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "(B)V")
	@Override
	protected void method4028() {
		if (super.aBoolean375) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(IB)Lclient!ew;")
	@Override
	protected Class57 method4070(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class57_Sub8(this, super.aClass223_53);
		} else if (arg0 == 4) {
			return new Class57_Sub2(this, super.aClass223_53, super.aClass211_6);
		} else if (arg0 == 8) {
			return new Class57_Sub9(this, super.aClass223_53, super.aClass211_6);
		} else {
			return super.method4070(arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "(I)V")
	@Override
	protected void method4012() {
		OpenGL.glScissor(super.anInt4866 + super.anInt4877, -super.anInt4892 + super.anInt4786 + super.anInt4885, super.anInt4865 - super.anInt4877, -super.anInt4861 + super.anInt4892);
	}

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(Z)V")
	@Override
	protected void method4010() {
		super.aFloat95 = (float) (-super.anInt4876 + super.anInt4878);
		super.aFloat99 = (float) -super.anInt4869 + super.aFloat95;
		if (super.aFloat99 < (float) super.anInt4893) {
			super.aFloat99 = (float) super.anInt4893;
		}
		OpenGL.glFogf(2915, super.aFloat99);
		OpenGL.glFogf(2916, super.aFloat95);
		Static449.aFloatArray67[2] = (float) (super.anInt4891 & 0xFF) / 255.0F;
		Static449.aFloatArray67[0] = (float) (super.anInt4891 & 0xFF0000) / 1.671168E7F;
		Static449.aFloatArray67[1] = (float) (super.anInt4891 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static449.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method4061(@OriginalArg(0) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL2.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt4983;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)V")
	public synchronized void method4072(@OriginalArg(1) long arg0) {
		@Pc(12) Class6 local12 = new Class6();
		local12.aLong278 = arg0;
		this.aClass163_30.method4967(local12);
	}

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "(B)V")
	@Override
	protected void method4033() {
		if (super.aBoolean394) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "(B)V")
	@Override
	protected void method4002() {
		if (super.aBoolean383 && super.aBoolean378 && super.anInt4869 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!hl", name = "W", descriptor = "(I)V")
	@Override
	protected void method4039() {
		OpenGL.glViewport(super.anInt4866, super.anInt4885, super.anInt4743, super.anInt4786);
	}

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "(B)V")
	@Override
	protected void method4019() {
		if (super.aClass142_6 == Static181.aClass142_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static460.aClass142_8 == super.aClass142_6) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static154.aClass142_4 == super.aClass142_6) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4062(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "()Lclient!eca;")
	@Override
	public Class77 method6162() {
		@Pc(7) int local7 = -1;
		if (this.aString49.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString49.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString49.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class77(local7, "OpenGL", this.anInt4982, this.aString48, 0L);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
	@Override
	public void method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6154(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hl", name = "T", descriptor = "(I)V")
	@Override
	protected void method4036() {
		if (super.aBoolean377) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!hl", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt4786 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt4984, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method6169(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub37 local19;
		while (!this.aClass163_25.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_25.method4969();
			Static514.anIntArray466[local11++] = (int) local19.aLong278;
			super.anInt4852 -= local19.anInt7833;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static514.anIntArray466, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static514.anIntArray466, 0);
			local11 = 0;
		}
		while (!this.aClass163_26.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_26.method4969();
			Static514.anIntArray466[local11++] = (int) local19.aLong278;
			super.anInt4854 -= local19.anInt7833;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static514.anIntArray466, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static514.anIntArray466, 0);
			local11 = 0;
		}
		while (!this.aClass163_27.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_27.method4969();
			Static514.anIntArray466[local11++] = local19.anInt7833;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static514.anIntArray466, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static514.anIntArray466, 0);
			local11 = 0;
		}
		while (!this.aClass163_28.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_28.method4969();
			Static514.anIntArray466[local11++] = (int) local19.aLong278;
			super.anInt4853 -= local19.anInt7833;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static514.anIntArray466, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static514.anIntArray466, 0);
		}
		while (!this.aClass163_24.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_24.method4969();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7833);
		}
		@Pc(213) Class6 local213;
		while (!this.aClass163_29.method4968()) {
			local213 = this.aClass163_29.method4969();
			OpenGL.glDeleteProgramARB((int) local213.aLong278);
		}
		while (!this.aClass163_30.method4968()) {
			local213 = this.aClass163_30.method4969();
			OpenGL.glDeleteObjectARB(local213.aLong278);
		}
		while (!this.aClass163_24.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_24.method4969();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7833);
		}
		if (this.E() > 100663296 && this.aLong135 + 60000L < Static582.method8056()) {
			System.gc();
			this.aLong135 = Static582.method8056();
		}
		super.method6169(local9);
	}

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "(I)V")
	@Override
	protected void method3958() {
		if (super.aBoolean393 && !super.aBoolean392) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "(B)V")
	@Override
	protected void method3969() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray45, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(ZI)Lclient!tea;")
	@Override
	public Interface26 method4063(@OriginalArg(0) boolean arg0) {
		return new Class84_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(BZ)Lclient!ug;")
	@Override
	public Interface27 method3993(@OriginalArg(1) boolean arg0) {
		return new Class84_Sub1(this, Static302.aClass176_9, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "()V")
	@Override
	public void method6188() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6168(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6127(arg2, arg3);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V")
	@Override
	public void method6124(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lclient!ku;")
	@Override
	public Interface16 method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!kt;Lclient!kq;)Z")
	@Override
	public boolean method3945(@OriginalArg(1) Class178 arg0, @OriginalArg(2) Class176 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "(I)V")
	@Override
	protected void method3975() {
		OpenGL.glDepthMask(super.aBoolean388 && super.aBoolean389);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
	public synchronized void method4073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub37 local8 = new Class6_Sub37(arg1);
		local8.aLong278 = (long) arg0;
		this.aClass163_26.method4967(local8);
	}

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "(B)V")
	@Override
	protected void method3986() {
		this.method4071();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZBLclient!ef;)V")
	@Override
	protected void method4050(@OriginalArg(0) int arg0, @OriginalArg(3) Class80 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static139.method2766(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB[IZIII)Lclient!js;")
	@Override
	public Interface15 method4066(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean400 || Static152.method3040(arg3) && Static152.method3040(arg4)) {
			return new Class25_Sub1(this, arg3, arg4, arg2, arg1, 0, arg5);
		} else if (this.aBoolean405) {
			return new Class25_Sub3(this, arg3, arg4, arg1, 0, arg5);
		} else {
			@Pc(38) Class25_Sub1 local38 = new Class25_Sub1(this, Static120.aClass178_4, Static302.aClass176_8, Static101.method2622(arg3), Static101.method2622(arg4));
			local38.method8455(0, arg4, arg1, 0, arg5, arg3);
			return local38;
		}
	}

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "()V")
	@Override
	public void method6139() {
	}

	@OriginalMember(owner = "client!hl", name = "Z", descriptor = "(I)V")
	@Override
	protected void method4049() {
		if (super.aBoolean387) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(II)Lclient!ci;")
	@Override
	public Interface5 method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BZLclient!kt;IIZII)Lclient!js;")
	@Override
	protected Interface15 method4035(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean400 || Static152.method3040(arg4) && Static152.method3040(arg2)) {
			return new Class25_Sub1(this, arg1, arg4, arg2, arg3, arg0, 0, 0);
		} else if (this.aBoolean405) {
			return new Class25_Sub3(this, arg1, arg4, arg2, arg0, 0, 0);
		} else {
			@Pc(48) Class25_Sub1 local48 = new Class25_Sub1(this, arg1, Static302.aClass176_8, Static101.method2622(arg4), Static101.method2622(arg2));
			local48.method8447(0, arg4, arg2, arg0, arg1);
			return local48;
		}
	}

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "(I)V")
	@Override
	protected void method3977() {
		if (super.aBoolean385) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!kt;[BIII)Lclient!ff;")
	@Override
	public Interface11 method4047(@OriginalArg(1) Class178 arg0, @OriginalArg(2) byte[] arg1) {
		return new Class25_Sub4(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "()V")
	@Override
	public void method6177() {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!cm;B)V")
	@Override
	public void method3967(@OriginalArg(0) Class52 arg0) {
		if (arg0 == Static190.aClass52_67) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(20) int local20 = Static558.method7842(arg0);
		OpenGL.glTexGeni(8192, 9472, local20);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local20);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local20);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method4045(@OriginalArg(0) Class270 arg0) {
		@Pc(17) Class63[] local17 = ((Class270_Sub1) arg0).aClass63Array1;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local17.length; local27++) {
			@Pc(33) Class63 local33 = local17[local27];
			@Pc(38) Class84_Sub2 local38 = this.aClass84_Sub2Array1[local27];
			@Pc(40) int local40 = 0;
			@Pc(44) int local44 = local38.method8111();
			@Pc(48) long local48 = local38.method8096();
			local38.method8099();
			for (@Pc(53) int local53 = 0; local33.method2424() > local53; local53++) {
				@Pc(60) Class183 local60 = local33.method2423(local53);
				if (local60 == Static315.aClass183_1) {
					local25 = true;
					OpenGL.glVertexPointer(3, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static315.aClass183_2) {
					local23 = true;
					OpenGL.glNormalPointer(5126, local44, local48 + (long) local40);
				} else if (Static315.aClass183_3 == local60) {
					local21 = true;
					OpenGL.glColorPointer(4, 5121, local44, local48 + (long) local40);
				} else if (Static315.aClass183_4 == local60) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local44, local48 + (long) local40);
				} else if (Static315.aClass183_5 == local60) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static315.aClass183_6) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local44, local48 + (long) local40);
				} else if (local60 == Static315.aClass183_7) {
					OpenGL.glClientActiveTexture(local19++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local44, (long) local40 + local48);
				}
				local40 += local60.anInt6309;
			}
		}
		if (local25 != this.aBoolean397) {
			if (local25) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean397 = local25;
		}
		if (this.aBoolean399 != local23) {
			if (local23) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean399 = local23;
		}
		if (this.aBoolean395 != local21) {
			if (local21) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean395 = local21;
		}
		@Pc(270) int local270;
		if (this.anInt4981 < local19) {
			for (local270 = this.anInt4981; local270 < local19; local270++) {
				OpenGL.glClientActiveTexture(local270 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt4981 = local19;
		} else if (this.anInt4981 > local19) {
			for (local270 = local19; local270 < this.anInt4981; local270++) {
				OpenGL.glClientActiveTexture(local270 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt4981 = local19;
			return;
		}
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)V")
	@Override
	protected void method3961() {
		OpenGL.glTexEnvi(8960, 34162, Static9.method496(super.aClass144Array6[super.anInt4867]));
	}

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "()V")
	@Override
	public void method6180() {
		if (super.anInt4743 <= 0 && super.anInt4786 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt4877;
		@Pc(19) int local19 = super.anInt4865;
		@Pc(22) int local22 = super.anInt4861;
		@Pc(25) int local25 = super.anInt4892;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3995();
		this.method4031(false);
		this.method3982(false);
		this.method4016(false);
		this.method4000(false);
		this.method4008((Interface4) null);
		this.method4042(false, -2, false);
		this.method4018(1);
		this.method4004(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt4743, super.anInt4786, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!oq;IIILclient!ug;II)V")
	@Override
	public void method3976(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface27 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) byte local18;
		@Pc(16) int local16;
		if (Static572.aClass248_10 == arg0) {
			local16 = arg5 * 2;
			local18 = 1;
		} else if (Static255.aClass248_5 == arg0) {
			local16 = arg5 + 1;
			local18 = 3;
		} else if (Static574.aClass248_11 == arg0) {
			local18 = 4;
			local16 = arg5 * 3;
		} else if (Static258.aClass248_6 == arg0) {
			local18 = 6;
			local16 = arg5 + 2;
		} else if (Static173.aClass248_3 == arg0) {
			local18 = 5;
			local16 = arg5 + 2;
		} else {
			local16 = arg5;
			local18 = 0;
		}
		@Pc(72) Class176 local72 = arg3.method7961();
		@Pc(75) Class84_Sub1 local75 = (Class84_Sub1) arg3;
		local75.method8099();
		OpenGL.glDrawElements(local18, local16, Static157.method3088(local72), local75.method8096() + (long) (arg2 * local72.anInt6139));
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!di;Lclient!di;FLclient!di;)Lclient!di;")
	@Override
	public Class31 method6132(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class31 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "(I)V")
	@Override
	protected void method4014() {
		OpenGL.glTexEnvi(8960, 34161, Static9.method496(super.aClass144Array5[super.anInt4867]));
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZLclient!kt;III[F)Lclient!js;")
	@Override
	protected Interface15 method3971(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class178 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float[] arg4) {
		if (this.aBoolean400 || Static152.method3040(arg0) && Static152.method3040(arg3)) {
			return new Class25_Sub1(this, arg2, arg0, arg3, arg1, arg4, 0, 0);
		} else if (this.aBoolean405) {
			return new Class25_Sub3(this, arg2, arg0, arg3, arg4, 0, 0);
		} else {
			@Pc(61) Class25_Sub1 local61 = new Class25_Sub1(this, arg2, Static302.aClass176_12, Static101.method2622(arg0), Static101.method2622(arg3));
			local61.method1327(arg4, arg2, arg3, arg0);
			return local61;
		}
	}

	@OriginalMember(owner = "client!hl", name = "bb", descriptor = "(I)V")
	@Override
	protected void method4060() {
		Static449.aFloatArray67[2] = (float) (super.anInt4895 & 0xFF) / 255.0F;
		Static449.aFloatArray67[1] = (float) (super.anInt4895 & 0xFF00) / 65280.0F;
		Static449.aFloatArray67[0] = (float) (super.anInt4895 & 0xFF0000) / 1.671168E7F;
		Static449.aFloatArray67[3] = (float) (super.anInt4895 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static449.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([Lclient!dia;I)Lclient!qa;")
	@Override
	public Class270 method3985(@OriginalArg(0) Class63[] arg0) {
		return new Class270_Sub1(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)V")
	@Override
	protected void method3953() {
		OpenGL.glActiveTexture(super.anInt4867 + 33984);
	}

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "(B)V")
	@Override
	protected void method4007() {
		Static449.aFloatArray67[1] = super.aFloat89 * super.aFloat101;
		Static449.aFloatArray67[3] = 1.0F;
		Static449.aFloatArray67[0] = super.aFloat101 * super.aFloat98;
		Static449.aFloatArray67[2] = super.aFloat101 * super.bf;
		OpenGL.glLightfv(16384, 4609, Static449.aFloatArray67, 0);
		Static449.aFloatArray67[3] = 1.0F;
		Static449.aFloatArray67[1] = -super.aFloat96 * super.aFloat89;
		Static449.aFloatArray67[2] = -super.aFloat96 * super.bf;
		Static449.aFloatArray67[0] = super.aFloat98 * -super.aFloat96;
		OpenGL.glLightfv(16385, 4609, Static449.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method3939(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(11) Long local11 = (Long) arg0;
		this.anOpenGL2.releaseSurface(arg1, local11);
	}

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "(I)V")
	@Override
	protected void method4024() {
		this.aBoolean398 = false;
		this.method4071();
	}

	@OriginalMember(owner = "client!hl", name = "C", descriptor = "(B)V")
	@Override
	public void method4068() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray49, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray46, 0);
	}

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "(I)V")
	@Override
	protected void method3962() {
		@Pc(9) int local9 = this.anIntArray209[super.anInt4867];
		if (local9 != 0) {
			this.anIntArray209[super.anInt4867] = 0;
			OpenGL.glBindTexture(local9, 0);
			OpenGL.glDisable(local9);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!qp;)V")
	@Override
	public void method6103(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)V")
	public synchronized void method4074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class6_Sub37 local17 = new Class6_Sub37(arg0);
		local17.aLong278 = (long) arg1;
		this.aClass163_25.method4967(local17);
	}

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "(I)V")
	@Override
	protected void method3992() {
	}

	@OriginalMember(owner = "client!hl", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4000(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!ci;Lclient!ku;)Lclient!qp;")
	@Override
	public Interface20 method6178(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Interface16 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!kq;ZLclient!kt;)Z")
	@Override
	public boolean method3980(@OriginalArg(0) Class176 arg0, @OriginalArg(2) Class178 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "()Z")
	@Override
	public boolean method6165() {
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "(I)V")
	@Override
	protected void method3994() {
		Static449.aFloatArray67[2] = super.aFloat93 * super.bf;
		Static449.aFloatArray67[3] = 1.0F;
		Static449.aFloatArray67[1] = super.aFloat89 * super.aFloat93;
		Static449.aFloatArray67[0] = super.aFloat98 * super.aFloat93;
		OpenGL.glLightModelfv(2899, Static449.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILclient!kt;BLclient!kq;)Lclient!js;")
	@Override
	public Interface15 method4009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(4) Class176 arg3) {
		if (this.aBoolean400 || Static152.method3040(arg1) && Static152.method3040(arg0)) {
			return new Class25_Sub1(this, arg2, arg3, arg1, arg0);
		} else if (this.aBoolean405) {
			return new Class25_Sub3(this, arg2, arg3, arg1, arg0);
		} else {
			return new Class25_Sub1(this, arg2, arg3, Static101.method2622(arg1), Static101.method2622(arg0));
		}
	}

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "(I)V")
	@Override
	protected void method3944() {
		for (@Pc(6) int local6 = super.anInt4880 - 1; local6 >= 0; local6--) {
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
		this.anOpenGL2.setSwapInterval(0);
		super.method3944();
	}

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "(B)F")
	@Override
	protected float method4053() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ[[II)Lclient!td;")
	@Override
	public Interface24 method3937(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2) {
		return new Class25_Sub2(this, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!hl", name = "V", descriptor = "(I)V")
	@Override
	protected void method4038() {
		this.method3963();
		@Pc(12) int local12;
		for (local12 = 0; super.anInt4884 > local12; local12++) {
			@Pc(19) Class6_Sub10 local19 = super.aClass6_Sub10Array5[local12];
			@Pc(23) int local23 = local19.method5319();
			@Pc(28) int local28 = local12 + 16386;
			@Pc(34) float local34 = local19.method5314() / 255.0F;
			Static449.aFloatArray67[0] = (float) local19.method5312();
			Static449.aFloatArray67[1] = (float) local19.method5321();
			Static449.aFloatArray67[2] = (float) local19.method5320();
			Static449.aFloatArray67[3] = 1.0F;
			OpenGL.glLightfv(local28, 4611, Static449.aFloatArray67, 0);
			Static449.aFloatArray67[2] = local34 * (float) (local23 & 0xFF);
			Static449.aFloatArray67[1] = local34 * (float) (local23 >> 8 & 0xFF);
			Static449.aFloatArray67[3] = 1.0F;
			Static449.aFloatArray67[0] = (float) (local23 >> 16 & 0xFF) * local34;
			OpenGL.glLightfv(local28, 4609, Static449.aFloatArray67, 0);
			OpenGL.glLightf(local28, 4617, 1.0F / (float) (local19.method5316() * local19.method5316()));
			OpenGL.glEnable(local28);
		}
		while (super.anInt4887 > local12) {
			OpenGL.glDisable(local12 + 16386);
			local12++;
		}
		super.method4038();
	}

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "()V")
	@Override
	protected void method6136() {
		super.method6136();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.a();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZLclient!tea;)V")
	@Override
	public void method3974(@OriginalArg(0) int arg0, @OriginalArg(2) Interface26 arg1) {
		this.aClass84_Sub2Array1[arg0] = (Class84_Sub2) arg1;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "()V")
	@Override
	public void method6119() {
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
	@Override
	protected void method3991(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local12);
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "()Z")
	@Override
	public boolean method6131() {
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(ZI)V")
	public synchronized void method4075(@OriginalArg(1) int arg0) {
		@Pc(13) Class6 local13 = new Class6();
		local13.aLong278 = (long) arg0;
		this.aClass163_29.method4967(local13);
	}

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "(I)V")
	@Override
	protected void method4013() {
		OpenGL.glMatrixMode(5890);
		if (Static356.aClass272_5 == super.aClass272Array3[super.anInt4867]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass115_Sub3Array3[super.anInt4867].method6302(Static321.aFloatArray59), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
	@Override
	protected void method3947(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local10)) {
			throw new RuntimeException();
		}
	}
}
