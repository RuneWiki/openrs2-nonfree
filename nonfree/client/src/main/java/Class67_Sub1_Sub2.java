import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class67_Sub1_Sub2 extends Class67_Sub1 {

	@OriginalMember(owner = "client!lt", name = "ui", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!lt", name = "Gh", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!lt", name = "Eh", descriptor = "Z")
	private boolean aBoolean526;

	@OriginalMember(owner = "client!lt", name = "Og", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!lt", name = "zi", descriptor = "I")
	private int anInt6777;

	@OriginalMember(owner = "client!lt", name = "qi", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!lt", name = "Sg", descriptor = "Z")
	private boolean aBoolean528;

	@OriginalMember(owner = "client!lt", name = "mh", descriptor = "Lclient!tj;")
	private final Class357 aClass357_35 = new Class357();

	@OriginalMember(owner = "client!lt", name = "jh", descriptor = "Lclient!tj;")
	private final Class357 aClass357_36 = new Class357();

	@OriginalMember(owner = "client!lt", name = "uh", descriptor = "Lclient!tj;")
	private final Class357 aClass357_37 = new Class357();

	@OriginalMember(owner = "client!lt", name = "Dh", descriptor = "Lclient!tj;")
	private final Class357 aClass357_38 = new Class357();

	@OriginalMember(owner = "client!lt", name = "yg", descriptor = "Lclient!tj;")
	private final Class357 aClass357_39 = new Class357();

	@OriginalMember(owner = "client!lt", name = "ti", descriptor = "Lclient!tj;")
	private final Class357 aClass357_40 = new Class357();

	@OriginalMember(owner = "client!lt", name = "Cg", descriptor = "Lclient!tj;")
	private final Class357 aClass357_41 = new Class357();

	@OriginalMember(owner = "client!lt", name = "li", descriptor = "[Lclient!dba;")
	private final Class63_Sub1[] aClass63_Sub1Array1 = new Class63_Sub1[16];

	@OriginalMember(owner = "client!lt", name = "Vg", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!lt", name = "ai", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!lt", name = "xi", descriptor = "I")
	private final int anInt6780 = 0;

	@OriginalMember(owner = "client!lt", name = "Dg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!lt", name = "mi", descriptor = "Ljava/lang/String;")
	private final String aString98;

	@OriginalMember(owner = "client!lt", name = "ah", descriptor = "Ljava/lang/String;")
	private final String aString99;

	@OriginalMember(owner = "client!lt", name = "si", descriptor = "I")
	private final int anInt6779;

	@OriginalMember(owner = "client!lt", name = "Kh", descriptor = "Z")
	public boolean aBoolean533;

	@OriginalMember(owner = "client!lt", name = "Ih", descriptor = "Z")
	private boolean aBoolean529;

	@OriginalMember(owner = "client!lt", name = "gh", descriptor = "Z")
	private final boolean aBoolean530;

	@OriginalMember(owner = "client!lt", name = "hh", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!lt", name = "ni", descriptor = "Z")
	public final boolean aBoolean531;

	@OriginalMember(owner = "client!lt", name = "Ai", descriptor = "Z")
	public final boolean aBoolean532;

	@OriginalMember(owner = "client!lt", name = "Vh", descriptor = "[I")
	public final int[] anIntArray362;

	@OriginalMember(owner = "client!lt", name = "Jh", descriptor = "I")
	public final int anInt6778;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!lb;I)V")
	public Class67_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class221 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.a();
			this.aString98 = OpenGL.glGetString(7936).toLowerCase();
			this.aString99 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString98.indexOf("microsoft") != -1 || this.aString98.indexOf("brian paul") != -1 || this.aString98.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(118) String local118 = OpenGL.glGetString(7938);
			@Pc(126) String[] local126 = Static349.method5051(' ', local118.replace('.', ' '));
			if (local126.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(150) int local150;
			try {
				@Pc(144) int local144 = Static349.method5057(local126[0]);
				local150 = Static349.method5057(local126[1]);
				this.anInt6779 = local144 * 10 + local150;
			} catch (@Pc(160) NumberFormatException local160) {
				throw new RuntimeException("");
			}
			if (this.anInt6779 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
				@Pc(204) int[] local204 = new int[1];
				OpenGL.glGetIntegerv(34018, local204, 0);
				super.anInt6683 = local204[0];
				if (super.anInt6683 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6689 = 8;
				this.aBoolean533 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
				super.aBoolean504 = this.anOpenGL2.a("GL_ARB_multisample");
				this.aBoolean529 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
				super.aBoolean508 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
				this.aBoolean530 = this.anOpenGL2.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean505 = this.anOpenGL2.a("GL_EXT_texture3D");
				this.aBoolean534 = this.anOpenGL2.a("GL_ARB_vertex_shader");
				this.aBoolean531 = this.anOpenGL2.a("GL_ARB_vertex_program");
				this.aBoolean532 = this.anOpenGL2.a("GL_ARB_fragment_shader");
				this.anOpenGL2.a("GL_ARB_fragment_program");
				this.anIntArray362 = new int[super.anInt6683];
				this.anInt6778 = Stream.b() ? 33639 : 5121;
				if (this.aString99.indexOf("radeon") != -1) {
					local150 = 0;
					@Pc(330) boolean local330 = false;
					@Pc(332) boolean local332 = false;
					@Pc(341) String[] local341 = Static349.method5051(' ', this.aString99.replace('/', ' '));
					for (@Pc(343) int local343 = 0; local343 < local341.length; local343++) {
						@Pc(349) String local349 = local341[local343];
						try {
							if (local349.length() > 0) {
								if (local349.charAt(0) == 'x' && local349.length() >= 3 && Static399.method5982(local349.substring(1, 3))) {
									local332 = true;
									local349 = local349.substring(1);
								}
								if (local349.equals("hd")) {
									local330 = true;
								} else {
									if (local349.startsWith("hd")) {
										local330 = true;
										local349 = local349.substring(2);
									}
									if (local349.length() >= 4 && Static399.method5982(local349.substring(0, 4))) {
										local150 = Static349.method5057(local349.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(432) Exception local432) {
						}
					}
					if (!local332 && !local330) {
						if (local150 >= 7000 && local150 <= 9250) {
							super.aBoolean505 = false;
						}
						if (local150 >= 7000 && local150 <= 7999) {
							this.aBoolean533 = false;
						}
					}
					this.aBoolean529 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
				}
				this.aString98.indexOf("intel");
				if (this.aBoolean533) {
					try {
						@Pc(502) int[] local502 = new int[1];
						OpenGL.glGenBuffersARB(1, local502, 0);
					} catch (@Pc(508) Throwable local508) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(514) Throwable local514) {
			local514.printStackTrace();
			this.method7681();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lt", name = "H", descriptor = "(I)V")
	@Override
	protected void method5685() {
		Static534.aFloatArray92[0] = super.aFloat125 * super.aFloat121;
		Static534.aFloatArray92[1] = super.aFloat121 * super.aFloat117;
		Static534.aFloatArray92[3] = 1.0F;
		Static534.aFloatArray92[2] = super.aFloat119 * super.aFloat121;
		OpenGL.glLightModelfv(2899, Static534.aFloatArray92, 0);
	}

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "(II)Lclient!hg;")
	@Override
	protected Class121 method5626(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class121_Sub10(this, super.aClass221_109);
		} else if (arg0 == 4) {
			return new Class121_Sub3(this, super.aClass221_109, super.aClass76_5);
		} else if (arg0 == 8) {
			return new Class121_Sub11(this, super.aClass221_109, super.aClass76_5);
		} else {
			return super.method5626(arg0);
		}
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(B)V")
	@Override
	protected void method5636() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray60, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lt", name = "E", descriptor = "(I)V")
	@Override
	protected void method5584() {
		OpenGL.glDepthMask(super.aBoolean514 && super.aBoolean511);
	}

	@OriginalMember(owner = "client!lt", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5652(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)Lclient!tt;")
	@Override
	public Interface25 method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!pea;)V")
	@Override
	public void method7633(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt6780;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([Lclient!he;Z)Lclient!kn;")
	@Override
	public Class212 method5570(@OriginalArg(0) Class147[] arg0) {
		return new Class212_Sub1(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZIZLclient!ct;I)V")
	@Override
	public void method5641(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static391.method5904(arg2));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(JB)V")
	public synchronized void method5692(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -103) {
			this.aBoolean534 = false;
		}
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong382 = arg0;
		this.aClass357_41.method8401(local15);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!tt;Lclient!hba;)Lclient!pea;")
	@Override
	public Interface20 method7638(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "z", descriptor = "()V")
	@Override
	public void method7707() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!lt", name = "ab", descriptor = "(I)V")
	@Override
	protected void method5576(@OriginalArg(0) int arg0) {
		for (@Pc(6) int local6 = super.anInt6683 - 1; local6 >= 0; local6--) {
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
		if (arg0 < 23) {
			this.method5692(71L, (byte) -18);
		}
		OpenGL.glEnable(2903);
		@Pc(93) float[] local93 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(95) int local95 = 0; local95 < 8; local95++) {
			@Pc(103) int local103 = local95 + 16384;
			OpenGL.glLightfv(local103, 4608, local93, 0);
			OpenGL.glLightf(local103, 4615, 0.0F);
			OpenGL.glLightf(local103, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method5576(44);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	@Override
	protected Object method5593(@OriginalArg(0) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL2.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
	@Override
	protected void method5579(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(14) Long local14 = (Long) arg0;
		if (!this.anOpenGL2.setSurface(local14)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Lclient!hba;")
	@Override
	public Interface8 method7689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "(I)V")
	@Override
	public synchronized void method7709(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub42 local19;
		while (!this.aClass357_36.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_36.method8398();
			Static593.anIntArray535[local7++] = (int) local19.aLong382;
			super.anInt6649 -= local19.anInt8429;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static593.anIntArray535, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static593.anIntArray535, 0);
			local7 = 0;
		}
		while (!this.aClass357_37.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_37.method8398();
			Static593.anIntArray535[local7++] = (int) local19.aLong382;
			super.anInt6648 -= local19.anInt8429;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static593.anIntArray535, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static593.anIntArray535, 0);
			local7 = 0;
		}
		while (!this.aClass357_38.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_38.method8398();
			Static593.anIntArray535[local7++] = local19.anInt8429;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static593.anIntArray535, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static593.anIntArray535, 0);
			local7 = 0;
		}
		while (!this.aClass357_39.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_39.method8398();
			Static593.anIntArray535[local7++] = (int) local19.aLong382;
			super.anInt6635 -= local19.anInt8429;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static593.anIntArray535, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static593.anIntArray535, 0);
		}
		while (!this.aClass357_35.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_35.method8398();
			OpenGL.glDeleteLists((int) local19.aLong382, local19.anInt8429);
		}
		@Pc(219) Class3 local219;
		while (!this.aClass357_40.method8404()) {
			local219 = this.aClass357_40.method8398();
			OpenGL.glDeleteProgramARB((int) local219.aLong382);
		}
		while (!this.aClass357_41.method8404()) {
			local219 = this.aClass357_41.method8398();
			OpenGL.glDeleteObjectARB(local219.aLong382);
		}
		while (!this.aClass357_35.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_35.method8398();
			OpenGL.glDeleteLists((int) local19.aLong382, local19.anInt8429);
		}
		if (this.E() > 100663296 && this.aLong218 + 60000L < Static626.method8479()) {
			System.gc();
			this.aLong218 = Static626.method8479();
		}
		super.method7709(local11);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(ZB)Lclient!lq;")
	@Override
	public Interface16 method5649(@OriginalArg(0) boolean arg0) {
		return new Class63_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!pc;I)V")
	@Override
	public void method5640(@OriginalArg(0) int arg0, @OriginalArg(2) Class281 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg1 == Static626.aClass281_8) {
			local10 = 1;
			local14 = arg0 * 2;
		} else if (arg1 == Static541.aClass281_6) {
			local14 = arg0 + 1;
			local10 = 3;
		} else if (Static508.aClass281_7 == arg1) {
			local14 = arg0 * 3;
			local10 = 4;
		} else if (arg1 == Static63.aClass281_1) {
			local14 = arg0 + 2;
			local10 = 6;
		} else if (arg1 == Static332.aClass281_5) {
			local14 = arg0 + 2;
			local10 = 5;
		} else {
			local14 = arg0;
			local10 = 0;
		}
		OpenGL.glDrawArrays(local10, arg2, local14);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IZ)V")
	@Override
	public void method5667(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "()V")
	@Override
	protected void method7632() {
		super.method7632();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.b();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!lq;I)V")
	@Override
	public void method5620(@OriginalArg(1) Interface16 arg0, @OriginalArg(2) int arg1) {
		this.aClass63_Sub1Array1[arg1] = (Class63_Sub1) arg0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7652(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III[BIILclient!hd;Z)Lclient!gp;")
	@Override
	protected Interface6 method5689(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class145 arg3, @OriginalArg(7) boolean arg4) {
		if (this.aBoolean530 || Static28.method398(arg2) && Static28.method398(arg0)) {
			return new Class39_Sub4(this, arg3, arg2, arg0, arg4, arg1, 0, 0);
		} else if (this.aBoolean529) {
			return new Class39_Sub1(this, arg3, arg2, arg0, arg1, 0, 0);
		} else {
			@Pc(46) Class39_Sub4 local46 = new Class39_Sub4(this, arg3, Static438.aClass261_14, Static60.method735(arg2), Static60.method735(arg0));
			local46.method9270(0, arg1, arg3, arg2, arg0);
			return local46;
		}
	}

	@OriginalMember(owner = "client!lt", name = "O", descriptor = "(I)V")
	@Override
	protected void method5624() {
		if (super.aBoolean503) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "()Z")
	@Override
	public boolean method7643() {
		return false;
	}

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "(I)V")
	@Override
	public void method5611() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray57, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray61, 0);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IIZ)V")
	public synchronized void method5693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub42 local8 = new Class3_Sub42(arg0);
		local8.aLong382 = (long) arg1;
		this.aClass357_36.method8401(local8);
	}

	@OriginalMember(owner = "client!lt", name = "A", descriptor = "()V")
	@Override
	public void method7645() {
	}

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "(B)V")
	@Override
	protected void method5660() {
		if (super.aBoolean513) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "(Z)V")
	@Override
	protected void method5574() {
		if (super.aBoolean509 && !super.aBoolean506) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "()V")
	@Override
	public void method7667() {
	}

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "(B)V")
	@Override
	protected void method5623() {
		OpenGL.glScissor(super.anInt6660 + super.anInt6687, -super.anInt6651 + super.anInt6626 + super.anInt6675, -super.anInt6687 + super.anInt6682, -super.anInt6685 + super.anInt6651);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLclient!ct;II)V")
	@Override
	protected void method5582(@OriginalArg(1) Class58 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static391.method5904(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "(B)V")
	@Override
	protected void method5608() {
		@Pc(17) int local17 = this.anIntArray362[super.anInt6659];
		if (local17 != 0) {
			this.anIntArray362[super.anInt6659] = 0;
			OpenGL.glBindTexture(local17, 0);
			OpenGL.glDisable(local17);
		}
	}

	@OriginalMember(owner = "client!lt", name = "cb", descriptor = "(I)V")
	private void method5694() {
		if (this.aBoolean528) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass320_5.method7780()) {
			if (!this.aBoolean525) {
				OpenGL.glLoadMatrixf(super.aClass181_Sub1_18.method4917(Static190.aFloatArray34), 0);
				this.aBoolean525 = true;
				this.method5611();
				this.method5581();
			}
			if (super.aBoolean502) {
				this.aBoolean528 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass181_Sub1_15.method4917(Static190.aFloatArray34), 0);
				this.aBoolean528 = true;
			}
		} else if (super.aBoolean502) {
			OpenGL.glLoadIdentity();
			this.aBoolean528 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass181_Sub1_15.method4917(Static190.aFloatArray34), 0);
			this.aBoolean528 = false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II[IZIII)Lclient!gp;")
	@Override
	public Interface6 method5644(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean530 || Static28.method398(arg3) && Static28.method398(arg0)) {
			return new Class39_Sub4(this, arg3, arg0, arg2, arg1, 0, arg5);
		} else if (this.aBoolean529) {
			return new Class39_Sub1(this, arg3, arg0, arg1, 0, arg5);
		} else {
			@Pc(55) Class39_Sub4 local55 = new Class39_Sub4(this, Static557.aClass145_14, Static438.aClass261_14, Static60.method735(arg3), Static60.method735(arg0));
			local55.method9273(arg1, 0, arg0, 0, arg3, arg5);
			return local55;
		}
	}

	@OriginalMember(owner = "client!lt", name = "A", descriptor = "(B)V")
	@Override
	protected void method5613() {
		OpenGL.glMatrixMode(5890);
		if (Static547.aClass96_5 == super.aClass96Array3[super.anInt6659]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass181_Sub1Array3[super.anInt6659].method4917(Static190.aFloatArray34), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!fh;IZIIILclient!pc;)V")
	@Override
	public void method5659(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class281 arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (arg5 == Static626.aClass281_8) {
			local12 = arg3 * 2;
			local14 = 1;
		} else if (arg5 == Static541.aClass281_6) {
			local14 = 3;
			local12 = arg3 + 1;
		} else if (arg5 == Static508.aClass281_7) {
			local12 = arg3 * 3;
			local14 = 4;
		} else if (Static63.aClass281_1 == arg5) {
			local12 = arg3 + 2;
			local14 = 6;
		} else if (arg5 == Static332.aClass281_5) {
			local12 = arg3 + 2;
			local14 = 5;
		} else {
			local12 = arg3;
			local14 = 0;
		}
		@Pc(76) Class261 local76 = arg0.method9251();
		@Pc(79) Class63_Sub2 local79 = (Class63_Sub2) arg0;
		local79.method4803();
		OpenGL.glDrawElements(local14, local12, Static191.method2897(local76), local79.method4810() + (long) (local76.anInt7631 * arg1));
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(IZ)V")
	@Override
	public void method5638(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!lt", name = "D", descriptor = "(I)V")
	@Override
	protected void method5691() {
		if (super.aBoolean507 && super.aBoolean510 && super.anInt6676 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method5559(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL2.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "(B)V")
	@Override
	protected void method5607() {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!hd;Lclient!ns;B)Z")
	@Override
	public boolean method5664(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class261 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "(I)V")
	@Override
	protected void method5561() {
		OpenGL.glViewport(super.anInt6660, super.anInt6675, super.anInt6608, super.anInt6626);
	}

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "()V")
	@Override
	public void method7663() {
		if (super.anInt6608 <= 0 && super.anInt6626 <= 0) {
			return;
		}
		@Pc(16) int local16 = super.anInt6687;
		@Pc(19) int local19 = super.anInt6682;
		@Pc(22) int local22 = super.anInt6685;
		@Pc(25) int local25 = super.anInt6651;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5558();
		this.method5572(false);
		this.method5592(false);
		this.method5591(false);
		this.method5652(false);
		this.method5612((Interface12) null);
		this.method5575(false, false, -2);
		this.method5655(1);
		this.method5617(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt6608, super.anInt6626, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!lt", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6626 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt6778, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!lt", name = "B", descriptor = "(I)V")
	@Override
	protected void method5673() {
		OpenGL.glActiveTexture(super.anInt6659 + 33984);
	}

	@OriginalMember(owner = "client!lt", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!ur;B)V")
	@Override
	public void method5633(@OriginalArg(0) Class377 arg0) {
		if (arg0 == Static600.aClass377_3) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(14) int local14 = Static333.method4977(arg0);
		OpenGL.glTexGeni(8192, 9472, local14);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local14);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local14);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
	public synchronized void method5696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub42 local8 = new Class3_Sub42(arg1);
		local8.aLong382 = (long) arg0;
		this.aClass357_37.method8401(local8);
	}

	@OriginalMember(owner = "client!lt", name = "K", descriptor = "(I)V")
	@Override
	protected void method5581() {
		this.method5650();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt6666 > local10; local10++) {
			@Pc(20) Class3_Sub16 local20 = super.aClass3_Sub16Array5[local10];
			@Pc(24) int local24 = local20.method6325();
			@Pc(28) int local28 = local10 + 16386;
			@Pc(34) float local34 = local20.method6326() / 255.0F;
			Static534.aFloatArray92[0] = (float) local20.method6323();
			Static534.aFloatArray92[1] = (float) local20.method6322();
			Static534.aFloatArray92[2] = (float) local20.method6320();
			Static534.aFloatArray92[3] = 1.0F;
			OpenGL.glLightfv(local28, 4611, Static534.aFloatArray92, 0);
			Static534.aFloatArray92[1] = local34 * (float) (local24 >> 8 & 0xFF);
			Static534.aFloatArray92[3] = 1.0F;
			Static534.aFloatArray92[2] = local34 * (float) (local24 & 0xFF);
			Static534.aFloatArray92[0] = (float) (local24 >> 16 & 0xFF) * local34;
			OpenGL.glLightfv(local28, 4609, Static534.aFloatArray92, 0);
			OpenGL.glLightf(local28, 4617, 1.0F / (float) (local20.method6324() * local20.method6324()));
			OpenGL.glEnable(local28);
		}
		while (super.anInt6684 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method5581();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "(B)V")
	@Override
	protected void method5585() {
		Static534.aFloatArray92[3] = 1.0F;
		Static534.aFloatArray92[0] = super.aFloat122 * super.aFloat125;
		Static534.aFloatArray92[2] = super.aFloat119 * super.aFloat122;
		Static534.aFloatArray92[1] = super.aFloat122 * super.aFloat117;
		OpenGL.glLightfv(16384, 4609, Static534.aFloatArray92, 0);
		Static534.aFloatArray92[3] = 1.0F;
		Static534.aFloatArray92[2] = -super.aFloat110 * super.aFloat119;
		Static534.aFloatArray92[1] = -super.aFloat110 * super.aFloat117;
		Static534.aFloatArray92[0] = -super.aFloat110 * super.aFloat125;
		OpenGL.glLightfv(16385, 4609, Static534.aFloatArray92, 0);
	}

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "(B)V")
	@Override
	protected void method5668() {
		if (super.aBoolean515) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7649(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7630(arg2, arg3);
	}

	@OriginalMember(owner = "client!lt", name = "C", descriptor = "(I)V")
	@Override
	protected void method5657() {
		if (super.aBoolean520) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!lt", name = "F", descriptor = "(I)V")
	@Override
	protected void method5583() {
		if (super.aBoolean523) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!lt", name = "J", descriptor = "(I)V")
	@Override
	protected void method5676() {
		OpenGL.glTexEnvi(8960, 34162, Static712.method9282(super.aClass37Array5[super.anInt6659]));
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(II)V")
	@Override
	public void method7630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL2.swapBuffers();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!ns;ILclient!hd;)Lclient!gp;")
	@Override
	public Interface6 method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(4) Class145 arg3) {
		if (this.aBoolean530 || Static28.method398(arg1) && Static28.method398(arg0)) {
			return new Class39_Sub4(this, arg3, arg2, arg1, arg0);
		} else if (this.aBoolean529) {
			return new Class39_Sub1(this, arg3, arg2, arg1, arg0);
		} else {
			return new Class39_Sub4(this, arg3, arg2, Static60.method735(arg1), Static60.method735(arg0));
		}
	}

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "(I)V")
	@Override
	protected void method5568() {
		if (super.aClass369_4 == Static430.aClass369_5) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static645.aClass369_9 == super.aClass369_4) {
			OpenGL.glBlendFunc(1, 1);
		} else if (Static584.aClass369_7 == super.aClass369_4) {
			OpenGL.glBlendFunc(774, 1);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BZI[[I)Lclient!gr;")
	@Override
	public Interface7 method5599(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class39_Sub2(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(ZI)Lclient!fh;")
	@Override
	public Interface5 method5684(@OriginalArg(0) boolean arg0) {
		return new Class63_Sub2(this, Static438.aClass261_15, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5557(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(13) Long local13 = (Long) arg1;
		this.anOpenGL2.releaseSurface(arg0, local13);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!ns;Lclient!hd;I)Z")
	@Override
	public boolean method5563(@OriginalArg(0) Class261 arg0, @OriginalArg(1) Class145 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!lt", name = "B", descriptor = "()Z")
	@Override
	public boolean method7655() {
		return false;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class77 method7662(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class77 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "(I)V")
	@Override
	protected void method5688() {
		OpenGL.glTexEnvi(8960, 34161, Static712.method9282(super.aClass37Array6[super.anInt6659]));
	}

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "()V")
	@Override
	public void method7678() {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!hd;III[B)Lclient!bf;")
	@Override
	public Interface1 method5562(@OriginalArg(1) Class145 arg0, @OriginalArg(5) byte[] arg1) {
		return new Class39_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "(B)V")
	@Override
	protected void method5610() {
		this.method5694();
	}

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "()Lclient!ega;")
	@Override
	public Class90 method7687() {
		@Pc(7) int local7 = -1;
		if (this.aString98.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString98.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString98.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class90(local7, "OpenGL", this.anInt6779, this.aString99, 0L);
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(Z)V")
	@Override
	protected void method5602() {
		super.aFloat124 = (float) (super.anInt6656 - super.anInt6681);
		super.aFloat126 = (float) -super.anInt6676 + super.aFloat124;
		if ((float) super.anInt6680 > super.aFloat126) {
			super.aFloat126 = (float) super.anInt6680;
		}
		OpenGL.glFogf(2915, super.aFloat126);
		OpenGL.glFogf(2916, super.aFloat124);
		Static534.aFloatArray92[2] = (float) (super.anInt6669 & 0xFF) / 255.0F;
		Static534.aFloatArray92[0] = (float) (super.anInt6669 & 0xFF0000) / 1.671168E7F;
		Static534.aFloatArray92[1] = (float) (super.anInt6669 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static534.aFloatArray92, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!kn;)V")
	@Override
	public void method5569(@OriginalArg(1) Class212 arg0) {
		@Pc(9) Class147[] local9 = ((Class212_Sub1) arg0).aClass147Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class147 local25 = local9[local19];
			@Pc(30) Class63_Sub1 local30 = this.aClass63_Sub1Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method1353();
			@Pc(40) long local40 = local30.method4810();
			local30.method4803();
			for (@Pc(47) int local47 = 0; local47 < local25.method3650(); local47++) {
				@Pc(54) Class134 local54 = local25.method3649(local47);
				if (Static219.aClass134_1 == local54) {
					OpenGL.glVertexPointer(3, 5126, local36, local40 + (long) local32);
					local17 = true;
				} else if (Static219.aClass134_2 == local54) {
					OpenGL.glNormalPointer(5126, local36, local40 + (long) local32);
					local15 = true;
				} else if (local54 == Static219.aClass134_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local36, local40 + (long) local32);
				} else if (local54 == Static219.aClass134_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, (long) local32 + local40);
				} else if (local54 == Static219.aClass134_5) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, (long) local32 + local40);
				} else if (Static219.aClass134_6 == local54) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, local40 + (long) local32);
				} else if (local54 == Static219.aClass134_7) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, local40 + (long) local32);
				}
				local32 += local54.anInt4244;
			}
		}
		if (local17 != this.aBoolean526) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean526 = local17;
		}
		if (this.aBoolean524 != local15) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean524 = local15;
		}
		if (local13 != this.aBoolean527) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean527 = local13;
		}
		@Pc(305) int local305;
		if (this.anInt6777 < local11) {
			for (local305 = this.anInt6777; local305 < local11; local305++) {
				OpenGL.glClientActiveTexture(local305 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt6777 = local11;
		} else if (local11 < this.anInt6777) {
			for (local305 = local11; local305 < this.anInt6777; local305++) {
				OpenGL.glClientActiveTexture(local305 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt6777 = local11;
		}
	}

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "(II)V")
	public synchronized void method5698(@OriginalArg(1) int arg0) {
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong382 = (long) arg0;
		this.aClass357_40.method8401(local15);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z[FLclient!hd;IIIBI)Lclient!gp;")
	@Override
	protected Interface6 method5679(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean530 || Static28.method398(arg3) && Static28.method398(arg4)) {
			return new Class39_Sub4(this, arg2, arg3, arg4, arg0, arg1, 0, 0);
		} else if (this.aBoolean529) {
			return new Class39_Sub1(this, arg2, arg3, arg4, arg1, 0, 0);
		} else {
			@Pc(58) Class39_Sub4 local58 = new Class39_Sub4(this, arg2, Static438.aClass261_18, Static60.method735(arg3), Static60.method735(arg4));
			local58.method9278(arg4, arg3, arg2, arg1);
			return local58;
		}
	}

	@OriginalMember(owner = "client!lt", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "(B)V")
	@Override
	protected void method5606() {
		this.aBoolean525 = false;
		this.method5694();
	}

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "(I)F")
	@Override
	protected float method5645() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "(I)V")
	@Override
	protected void method5677() {
		Static534.aFloatArray92[0] = (float) (super.anInt6686 & 0xFF0000) / 1.671168E7F;
		Static534.aFloatArray92[2] = (float) (super.anInt6686 & 0xFF) / 255.0F;
		Static534.aFloatArray92[3] = (float) (super.anInt6686 >>> 24) / 255.0F;
		Static534.aFloatArray92[1] = (float) (super.anInt6686 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static534.aFloatArray92, 0);
	}
}
