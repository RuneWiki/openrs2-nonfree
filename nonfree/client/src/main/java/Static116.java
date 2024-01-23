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

public final class Static116 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt2590;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
	public static boolean aBoolean174;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	private static int anInt2592;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Z")
	public static boolean aBoolean175;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	private static int anInt2593;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Z")
	public static boolean aBoolean176;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Z")
	public static boolean aBoolean177;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt2594;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Z")
	public static boolean aBoolean178;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	private static int anInt2596;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Z")
	public static boolean aBoolean180;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString90;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "Z")
	public static boolean aBoolean182;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "Z")
	public static boolean aBoolean183;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "I")
	public static int anInt2598;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "I")
	private static int anInt2599;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "I")
	public static int anInt2600;

	@OriginalMember(owner = "client!i", name = "C", descriptor = "Z")
	public static boolean aBoolean186;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "Z")
	public static boolean aBoolean187;

	@OriginalMember(owner = "client!i", name = "F", descriptor = "I")
	private static int anInt2601;

	@OriginalMember(owner = "client!i", name = "I", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "F")
	private static float aFloat16;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "F")
	private static float aFloat17;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "Ljava/lang/String;")
	private static String aString91;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "I")
	private static int anInt2604;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "I")
	private static int anInt2605;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "Z")
	public static boolean aBoolean191;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	public static int anInt2608;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	private static int anInt2591 = -1;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	private static int anInt2595 = -1;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Z")
	private static boolean aBoolean179 = true;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "F")
	private static float aFloat13 = 0.0F;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
	private static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	private static int anInt2597 = 0;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "F")
	private static float aFloat14 = 0.09765625F;

	@OriginalMember(owner = "client!i", name = "y", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!i", name = "D", descriptor = "F")
	private static float aFloat15 = 0.0F;

	@OriginalMember(owner = "client!i", name = "G", descriptor = "I")
	public static int anInt2602 = 0;

	@OriginalMember(owner = "client!i", name = "H", descriptor = "Z")
	private static boolean aBoolean188 = true;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "Z")
	public static boolean aBoolean189 = true;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "I")
	private static int anInt2603 = -1;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "Z")
	private static boolean aBoolean190 = true;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[F")
	private static float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!i", name = "T", descriptor = "Z")
	private static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "I")
	private static int anInt2606 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	public static void method1937() {
		if (aGL1 != null) {
			try {
				Static288.method4476();
				Static312.method4082();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static124.method2215();
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
		Static212.method3531();
		aBoolean184 = false;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	private static void method1938() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt2594 = local2[0];
		aGL1.glBindTexture(3553, anInt2594);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static212.method3536();
		Static134.method2458();
		Static288.method4470();
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()I")
	public static int method1939() {
		if (aBoolean191 && (anInt2595 <= 0 || anInt2591 != Static124.anInt2871)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt2591 = Static124.anInt2871;
			anInt2595 = local9[0];
		}
		return anInt2595;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(FFFFFF)V")
	private static void method1940(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray4[0] = local3 / (arg1 - arg0);
		aFloatArray4[1] = 0.0F;
		aFloatArray4[2] = 0.0F;
		aFloatArray4[3] = 0.0F;
		aFloatArray4[4] = 0.0F;
		aFloatArray4[5] = local3 / (arg3 - arg2);
		aFloatArray4[6] = 0.0F;
		aFloatArray4[7] = 0.0F;
		aFloatArray4[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray4[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray4[10] = aFloat17 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray4[11] = -1.0F;
		aFloatArray4[12] = 0.0F;
		aFloatArray4[13] = 0.0F;
		aFloatArray4[14] = aFloat16 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray4[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray4, 0);
		aFloat13 = 0.0F;
		aFloat15 = 0.0F;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	public static void method1941() {
		Static118.method1991(0, 0);
		method1965();
		method1977(1);
		method1976(1);
		method1974(false);
		method1963(false);
		method1954(false);
		method1960();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	private static void method1943(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean189) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean189 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(FFF)V")
	public static void method1944(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean181) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean181 = true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method1945(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2603) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt2603 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt2603 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	private static void method1946() {
		aBoolean192 = false;
		aGL1.glDisable(3553);
		anInt2603 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt2597 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt2606 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean190 = true;
		aBoolean188 = true;
		aBoolean179 = true;
		Static113.method1905();
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
		method1958();
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
		aBoolean189 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static235.method3801();
		Static212.method3543();
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	public static void method1947() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	public static void method1948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method1950(anInt2600, anInt2598, anInt2607, anInt2590);
		aBoolean192 = false;
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "()V")
	public static void method1949() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method1945(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt2607, anInt2590, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIII)V")
	private static void method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt2599 = arg0;
		anInt2592 = arg1;
		anInt2601 = arg2;
		anInt2596 = arg3;
		method1962();
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "()V")
	public static void method1951() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "()V")
	public static void method1952() {
		Static118.method1991(0, 0);
		method1965();
		method1945(-1);
		method1974(false);
		method1963(false);
		method1954(false);
		method1960();
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "()V")
	public static void method1953() {
		if (Static265.aBoolean348) {
			method1974(true);
			method1943(true);
		} else {
			method1974(false);
			method1943(false);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
	public static void method1954(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean179) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean179 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method1955(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(FF)V")
	public static void method1956(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean192 || arg0 == aFloat13 && arg1 == aFloat15) {
			return;
		}
		aFloat13 = arg0;
		aFloat15 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray4[10] = aFloat17;
			aFloatArray4[14] = aFloat16;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat16 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray4[10] = aFloat17 + local42;
			aFloatArray4[14] = aFloat16 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray4, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(F)V")
	public static void method1957(@OriginalArg(0) float arg0) {
		method1956(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "()V")
	public static void method1958() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!i", name = "m", descriptor = "()V")
	public static void method1959() {
		Static118.method1991(0, 0);
		method1965();
		method1977(0);
		method1976(0);
		method1974(false);
		method1963(false);
		method1954(false);
		method1960();
	}

	@OriginalMember(owner = "client!i", name = "n", descriptor = "()V")
	public static void method1960() {
		if (aBoolean181) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean181 = false;
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public static void method1961(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!i", name = "o", descriptor = "()V")
	private static void method1962() {
		aGL1.glViewport(anInt2599 + anInt2600, anInt2592 + anInt2598, anInt2601, anInt2596);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)V")
	public static void method1963(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean188) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean188 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "()F")
	public static float method1964() {
		return aFloat15;
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "()V")
	private static void method1965() {
		if (aBoolean192) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt2607, 0.0D, (double) anInt2590, -1.0D, 1.0D);
		method1950(0, 0, anInt2607, anInt2590);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean192 = true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2607 = arg0;
		anInt2590 = arg1;
		aBoolean192 = false;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()I")
	private static int method1967() {
		@Pc(1) int local1 = 0;
		aString91 = aGL1.glGetString(7936);
		aString90 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString91.toLowerCase();
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
				anInt2605 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt2605 < 12) {
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
		anInt2608 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt2604 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt2593 = local100[0];
		if (anInt2608 < 2 || anInt2604 < 2 || anInt2593 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean180 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean186 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean187 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean174 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean178 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean191 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean176 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean183 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean175 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean185 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean177 = true;
		@Pc(197) String local197 = aString90.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static227.method3704(local197.replace('/', ' '), ' ');
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static237.method3833(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static237.method3833(local224.substring(0, 4))) {
						local204 = Static100.method1729(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean186 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean183 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean185 = false;
			}
			aBoolean182 = aBoolean186;
			aBoolean177 = false;
		}
		if (aBoolean186) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method1940((float) local7 * aFloat14, (float) local17 * aFloat14, (float) -local35 * aFloat14, (float) -local25 * aFloat14, 50.0F, 3584.0F);
		method1950(arg0, anInt2590 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean192 = false;
		Static246.anInt4876 = local7;
		Static185.anInt5539 = local17;
		Static185.anInt5543 = local25;
		Static263.anInt5196 = local35;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public static void method1969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2600 = arg0;
		anInt2598 = arg1;
		method1962();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method1970(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!i", name = "s", descriptor = "()V")
	public static void method1971() {
		Static118.method1991(0, 0);
		method1965();
		method1977(0);
		method1976(0);
		method1974(false);
		method1963(false);
		method1954(false);
		method1960();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V")
	public static void method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt2607 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt2590 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method1950(0, 0, anInt2607, anInt2590);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean192 = false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method1973(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static138.method2475(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean184 = true;
			anInt2607 = arg0.getSize().width;
			anInt2590 = arg0.getSize().height;
			var6 = method1967();
			if (var6 != 0) {
				method1937();
				return var6;
			}
			method1938();
			method1946();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method1937();
						return -3;
					}
					Static138.method2475(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method1937();
			return -5;
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(Z)V")
	public static void method1974(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean190) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean190 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(IIII)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method1968(0, 0, anInt2607, anInt2590, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	public static void method1976(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2606) {
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
		anInt2606 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public static void method1977(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2597) {
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
		anInt2597 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method1978(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method1973(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!i", name = "t", descriptor = "()V")
	public static void method1979() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!i", name = "u", descriptor = "()F")
	public static float method1980() {
		return aFloat13;
	}
}
