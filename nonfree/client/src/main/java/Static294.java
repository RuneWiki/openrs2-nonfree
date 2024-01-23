import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public static int anInt5868;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	public static int anInt5869;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Z")
	public static boolean aBoolean365;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	private static int anInt5870;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
	public static boolean aBoolean366;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
	public static boolean aBoolean368;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	public static int anInt5873;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "Z")
	public static boolean aBoolean373;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Z")
	public static boolean aBoolean375;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
	public static int anInt5874;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString421;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Z")
	public static boolean aBoolean376;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "Z")
	public static boolean aBoolean377;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "Ljava/lang/String;")
	private static String aString422;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "F")
	private static float aFloat59;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	private static int anInt5875;

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	private static int anInt5876;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "Z")
	public static boolean aBoolean378;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "F")
	private static float aFloat61;

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
	private static int anInt5879;

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "Z")
	public static boolean aBoolean379;

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
	private static int anInt5880;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
	public static int anInt5881;

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
	private static int anInt5884;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "Z")
	public static boolean aBoolean381;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "Z")
	public static boolean aBoolean382;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
	public static int anInt5885;

	@OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
	private static int anInt5886;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public static int anInt5871 = 0;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "F")
	private static float aFloat57 = 0.09765625F;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	private static int anInt5872 = -1;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Z")
	private static boolean aBoolean369 = true;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Z")
	private static boolean aBoolean370 = true;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "F")
	private static float aFloat58 = 0.0F;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Z")
	private static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "[F")
	private static float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "Z")
	public static boolean aBoolean374 = true;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "F")
	private static float aFloat60 = 0.0F;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
	private static int anInt5877 = 0;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
	private static int anInt5878 = 0;

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
	private static boolean aBoolean380 = true;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	private static int anInt5882 = -1;

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
	private static int anInt5883 = -1;

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "Z")
	private static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFFFFF)V")
	private static void method4482(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray32[0] = local3 / (arg1 - arg0);
		aFloatArray32[1] = 0.0F;
		aFloatArray32[2] = 0.0F;
		aFloatArray32[3] = 0.0F;
		aFloatArray32[4] = 0.0F;
		aFloatArray32[5] = local3 / (arg3 - arg2);
		aFloatArray32[6] = 0.0F;
		aFloatArray32[7] = 0.0F;
		aFloatArray32[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray32[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray32[10] = aFloat59 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray32[11] = -1.0F;
		aFloatArray32[12] = 0.0F;
		aFloatArray32[13] = 0.0F;
		aFloatArray32[14] = aFloat61 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray32[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray32, 0);
		aFloat60 = 0.0F;
		aFloat58 = 0.0F;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()I")
	public static int method4484() {
		if (aBoolean366 && (anInt5883 <= 0 || anInt5882 != Static113.anInt2464)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt5882 = Static113.anInt2464;
			anInt5883 = local9[0];
		}
		return anInt5883;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "()V")
	private static void method4485() {
		aGL1.glViewport(anInt5880 + anInt5885, anInt5884 + anInt5868, anInt5879, anInt5870);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method4486(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5872) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt5872 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt5872 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public static void method4487(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	public static void method4488(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5877) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(8960, 34161, 8448);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(8960, 34161, 7681);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(8960, 34161, 260);
		}
		if (arg0 == 3) {
			aGL1.glTexEnvi(8960, 34161, 34023);
		}
		if (arg0 == 4) {
			aGL1.glTexEnvi(8960, 34161, 34164);
		}
		if (arg0 == 5) {
			aGL1.glTexEnvi(8960, 34161, 34165);
		}
		anInt5877 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "()V")
	public static void method4489() {
		Static1.method4721(0, 0);
		method4494();
		method4488(0);
		method4490(0);
		method4496(false);
		method4491(false);
		method4499(false);
		method4512();
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	public static void method4490(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5878) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(8960, 34162, 8448);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(8960, 34162, 7681);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(8960, 34162, 260);
		}
		anInt5878 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public static void method4491(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean370) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean370 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "()V")
	public static void method4492() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
	private static void method4493(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean374) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean374 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "()V")
	private static void method4494() {
		if (aBoolean383) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt5873, 0.0D, (double) anInt5874, -1.0D, 1.0D);
		method4498(0, 0, anInt5873, anInt5874);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean383 = true;
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "()V")
	public static void method4495() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V")
	public static void method4496(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean380) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean380 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method4497(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
		try {
			if (!arg0.isDisplayable()) {
				return -1;
			}
			@Pc(8) GLCapabilities local8 = new GLCapabilities();
			if (arg1 > 0) {
				local8.setSampleBuffers(true);
				local8.setNumSamples(arg1);
			}
			@Pc(18) GLDrawableFactory local18 = GLDrawableFactory.getFactory();
			aGLDrawable1 = local18.getGLDrawable(arg0, local8, null);
			aGLDrawable1.setRealized(true);
			@Pc(29) int local29 = 0;
			@Pc(36) int var6;
			while (true) {
				aGLContext1 = aGLDrawable1.createContext(arg2);
				try {
					var6 = aGLContext1.makeCurrent();
					if (var6 != 0) {
						break;
					}
				} catch (@Pc(41) Exception local41) {
				}
				if (local29++ > 5) {
					return -2;
				}
				Static312.method4734(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean367 = true;
			anInt5873 = arg0.getSize().width;
			anInt5874 = arg0.getSize().height;
			var6 = method4507();
			if (var6 != 0) {
				method4523();
				return var6;
			}
			method4522();
			method4506();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method4523();
						return -3;
					}
					Static312.method4734(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method4523();
			return -5;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
	private static void method4498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt5880 = arg0;
		anInt5884 = arg1;
		anInt5879 = arg2;
		anInt5870 = arg3;
		method4485();
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V")
	public static void method4499(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean369) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean369 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "()V")
	public static void method4500() {
		if (Static65.aBoolean96) {
			method4496(true);
			method4493(true);
		} else {
			method4496(false);
			method4493(false);
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "()V")
	public static void method4501() {
		Static1.method4721(0, 0);
		method4494();
		method4488(0);
		method4490(0);
		method4496(false);
		method4491(false);
		method4499(false);
		method4512();
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "()V")
	public static void method4502() {
		Static1.method4721(0, 0);
		method4494();
		method4486(-1);
		method4496(false);
		method4491(false);
		method4499(false);
		method4512();
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "()F")
	public static float method4503() {
		return aFloat58;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5873 = arg0;
		anInt5874 = arg1;
		aBoolean383 = false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method4505(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method4497(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "()V")
	private static void method4506() {
		aBoolean383 = false;
		aGL1.glDisable(3553);
		anInt5872 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt5877 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt5878 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean380 = true;
		aBoolean370 = true;
		aBoolean369 = true;
		Static188.method3048();
		aGL1.glActiveTexture(33985);
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		aGL1.glTexEnvi(8960, 34162, 8448);
		aGL1.glActiveTexture(33984);
		aGL1.setSwapInterval(0);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		aGL1.glShadeModel(7425);
		aGL1.glClearDepth(1.0F);
		aGL1.glDepthFunc(515);
		method4495();
		aGL1.glMatrixMode(5890);
		aGL1.glLoadIdentity();
		aGL1.glPolygonMode(1028, 6914);
		aGL1.glEnable(2884);
		aGL1.glCullFace(1029);
		aGL1.glEnable(3042);
		aGL1.glBlendFunc(770, 771);
		aGL1.glEnable(3008);
		aGL1.glAlphaFunc(516, 0.0F);
		aGL1.glEnableClientState(32884);
		aGL1.glEnableClientState(32885);
		aBoolean374 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static180.method2901();
		Static191.method3082();
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "()I")
	private static int method4507() {
		@Pc(1) int local1 = 0;
		aString421 = aGL1.glGetString(7936);
		aString422 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString421.toLowerCase();
		if (local12.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local12.indexOf("brian paul") != -1 || local12.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(39) String local39 = aGL1.glGetString(7938);
		@Pc(43) String[] local43 = local39.split("[. ]");
		if (local43.length >= 2) {
			try {
				@Pc(52) int local52 = Integer.parseInt(local43[0]);
				@Pc(57) int local57 = Integer.parseInt(local43[1]);
				anInt5886 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt5886 < 12) {
			local1 |= 0x2;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(100) int[] local100 = new int[1];
		aGL1.glGetIntegerv(34018, local100, 0);
		anInt5869 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt5875 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt5876 = local100[0];
		if (anInt5869 < 2 || anInt5875 < 2 || anInt5876 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean377 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean381 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean365 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean375 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean382 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean366 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean378 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean372 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean373 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean368 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean379 = true;
		@Pc(197) String local197 = aString422.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static3.method35(local197.replace('/', ' '), ' ');
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static187.method3026(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static187.method3026(local224.substring(0, 4))) {
						local204 = Static79.method1345(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean381 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean372 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean368 = false;
			}
			aBoolean376 = aBoolean381;
			aBoolean379 = false;
		}
		if (aBoolean381) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method4482((float) local7 * aFloat57, (float) local17 * aFloat57, (float) -local35 * aFloat57, (float) -local25 * aFloat57, 50.0F, 3584.0F);
		method4498(arg0, anInt5874 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean383 = false;
		Static57.anInt6308 = local7;
		Static221.anInt4698 = local17;
		Static280.anInt5623 = local25;
		Static221.anInt4693 = local35;
	}

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "()V")
	public static void method4509() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "()V")
	public static void method4510() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method4486(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt5873, anInt5874, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(F)V")
	public static void method4511(@OriginalArg(0) float arg0) {
		method4513(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "()V")
	public static void method4512() {
		if (aBoolean371) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean371 = false;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FF)V")
	public static void method4513(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean383 || arg0 == aFloat60 && arg1 == aFloat58) {
			return;
		}
		aFloat60 = arg0;
		aFloat58 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray32[10] = aFloat59;
			aFloatArray32[14] = aFloat61;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat61 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray32[10] = aFloat59 + local42;
			aFloatArray32[14] = aFloat61 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray32, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
	public static void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt5873 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt5874 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method4498(0, 0, anInt5873, anInt5874);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean383 = false;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIII)V")
	public static void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method4508(0, 0, anInt5873, anInt5874, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "()F")
	public static float method4516() {
		return aFloat60;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFF)V")
	public static void method4517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean371) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean371 = true;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
	public static void method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5885 = arg0;
		anInt5868 = arg1;
		method4485();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method4519(@OriginalArg(0) Canvas arg0) {
		try {
			if (!arg0.isDisplayable()) {
				return;
			}
			@Pc(5) GLDrawableFactory local5 = GLDrawableFactory.getFactory();
			@Pc(11) GLDrawable local11 = local5.getGLDrawable(arg0, null, null);
			local11.setRealized(true);
			@Pc(18) GLContext local18 = local11.createContext(null);
			local18.makeCurrent();
			local18.release();
			local18.destroy();
			local11.setRealized(false);
		} catch (@Pc(30) Throwable local30) {
		}
	}

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "()V")
	public static void method4520() {
		Static1.method4721(0, 0);
		method4494();
		method4488(1);
		method4490(1);
		method4496(false);
		method4491(false);
		method4499(false);
		method4512();
	}

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "()V")
	public static void method4521() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "()V")
	private static void method4522() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt5881 = local2[0];
		aGL1.glBindTexture(3553, anInt5881);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static191.method3084();
		Static79.method1348();
		Static314.method4752();
	}

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "()V")
	public static void method4523() {
		if (aGL1 != null) {
			try {
				Static314.method4750();
				Static83.method1426();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static113.method1829();
			try {
				if (GLContext.getCurrent() == aGLContext1) {
					aGLContext1.release();
				}
			} catch (@Pc(18) Throwable local18) {
			}
			try {
				aGLContext1.destroy();
			} catch (@Pc(22) Throwable local22) {
			}
			aGLContext1 = null;
		}
		if (aGLDrawable1 != null) {
			try {
				aGLDrawable1.setRealized(false);
			} catch (@Pc(31) Throwable local31) {
			}
			aGLDrawable1 = null;
		}
		Static191.method3098();
		aBoolean367 = false;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	public static void method4524(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(IIII)V")
	public static void method4525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method4498(anInt5885, anInt5868, anInt5873, anInt5874);
		aBoolean383 = false;
	}
}
