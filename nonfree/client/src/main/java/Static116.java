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
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Z")
	public static boolean aBoolean186;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public static int anInt2363;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	public static int anInt2364;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	private static int anInt2365;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "Z")
	public static boolean aBoolean189;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "F")
	private static float aFloat22;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "Z")
	public static boolean aBoolean190;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	private static int anInt2366;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	private static int anInt2368;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "Z")
	public static boolean aBoolean193;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "Z")
	public static boolean aBoolean194;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "Ljava/lang/String;")
	private static String aString88;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
	public static boolean aBoolean195;

	@OriginalMember(owner = "client!in", name = "A", descriptor = "Z")
	public static boolean aBoolean196;

	@OriginalMember(owner = "client!in", name = "B", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "Z")
	public static boolean aBoolean197;

	@OriginalMember(owner = "client!in", name = "D", descriptor = "Z")
	public static boolean aBoolean198;

	@OriginalMember(owner = "client!in", name = "E", descriptor = "Z")
	public static boolean aBoolean199;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	public static int anInt2371;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "I")
	public static int anInt2372;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "Ljava/lang/String;")
	private static String aString89;

	@OriginalMember(owner = "client!in", name = "I", descriptor = "I")
	private static int anInt2373;

	@OriginalMember(owner = "client!in", name = "K", descriptor = "I")
	private static int anInt2374;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!in", name = "N", descriptor = "F")
	private static float aFloat26;

	@OriginalMember(owner = "client!in", name = "O", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "Z")
	public static boolean aBoolean201;

	@OriginalMember(owner = "client!in", name = "S", descriptor = "I")
	public static int anInt2378;

	@OriginalMember(owner = "client!in", name = "T", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!in", name = "U", descriptor = "I")
	private static int anInt2379;

	@OriginalMember(owner = "client!in", name = "V", descriptor = "I")
	private static int anInt2380;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Z")
	public static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Z")
	private static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	private static int anInt2362 = 0;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Z")
	private static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "[F")
	private static float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!in", name = "m", descriptor = "F")
	private static float aFloat23 = 0.0F;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "Z")
	private static boolean aBoolean191 = true;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "F")
	private static float aFloat24 = 0.0F;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	private static int anInt2367 = -1;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "Z")
	private static boolean aBoolean192 = true;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	private static int anInt2369 = 0;

	@OriginalMember(owner = "client!in", name = "y", descriptor = "F")
	private static float aFloat25 = 0.09765625F;

	@OriginalMember(owner = "client!in", name = "J", descriptor = "Z")
	private static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!in", name = "M", descriptor = "I")
	private static int anInt2375 = -1;

	@OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
	public static int anInt2376 = 0;

	@OriginalMember(owner = "client!in", name = "R", descriptor = "I")
	private static int anInt2377 = -1;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(FFFFFF)V")
	private static void method1866(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray5[0] = local3 / (arg1 - arg0);
		aFloatArray5[1] = 0.0F;
		aFloatArray5[2] = 0.0F;
		aFloatArray5[3] = 0.0F;
		aFloatArray5[4] = 0.0F;
		aFloatArray5[5] = local3 / (arg3 - arg2);
		aFloatArray5[6] = 0.0F;
		aFloatArray5[7] = 0.0F;
		aFloatArray5[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray5[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray5[10] = aFloat26 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray5[11] = -1.0F;
		aFloatArray5[12] = 0.0F;
		aFloatArray5[13] = 0.0F;
		aFloatArray5[14] = aFloat22 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray5[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray5, 0);
		aFloat24 = 0.0F;
		aFloat23 = 0.0F;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "()V")
	private static void method1867() {
		aBoolean187 = false;
		aGL1.glDisable(3553);
		anInt2367 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt2369 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt2362 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean191 = true;
		aBoolean185 = true;
		aBoolean192 = true;
		Static66.method3394();
		aGL1.glActiveTexture(33985);
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		aGL1.glTexEnvi(8960, 34162, 8448);
		aGL1.glActiveTexture(33984);
		aGL1.setSwapInterval(0);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		aGL1.glShadeModel(7425);
		aGL1.glClearDepth(1.0D);
		aGL1.glDepthFunc(515);
		method1881();
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
		aBoolean184 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static233.method3548();
		Static186.method2918();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(F)V")
	public static void method1868(@OriginalArg(0) float arg0) {
		method1909(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "()F")
	public static float method1869() {
		return aFloat24;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "()I")
	private static int method1870() {
		@Pc(1) int local1 = 0;
		aString88 = aGL1.glGetString(7936);
		aString89 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString88.toLowerCase();
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
				anInt2380 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt2380 < 12) {
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
		anInt2370 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt2373 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt2366 = local100[0];
		if (anInt2370 < 2 || anInt2373 < 2 || anInt2366 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean189 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean195 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean194 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean199 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean190 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean201 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean186 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean198 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean197 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean193 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		@Pc(195) String local195 = aString89.toLowerCase(Locale.ENGLISH);
		if (local195.indexOf("radeon") != -1) {
			@Pc(202) int local202 = 0;
			@Pc(204) boolean local204 = false;
			@Pc(212) String[] local212 = Static225.method3496(' ', local195.replace('/', ' '));
			for (@Pc(214) int local214 = 0; local214 < local212.length; local214++) {
				@Pc(222) String local222 = local212[local214];
				if (local222.length() >= 4) {
					if (local222.charAt(0) == 'x' && Static3.method3665(local222.substring(1, 3))) {
						local204 = true;
						break;
					}
					if (Static3.method3665(local222.substring(0, 4))) {
						local202 = Static167.method2646(local222.substring(0, 4));
						break;
					}
				}
			}
			if (local202 >= 7000 && local202 <= 7999) {
				aBoolean195 = false;
			}
			if (local202 >= 7000 && local202 <= 9250) {
				aBoolean198 = false;
			}
			if (local202 >= 9200 || local204) {
				aBoolean193 = false;
			}
			aBoolean196 = aBoolean195;
		}
		if (aBoolean195) {
			try {
				@Pc(288) int[] local288 = new int[1];
				aGL1.glGenBuffersARB(1, local288, 0);
			} catch (@Pc(295) Throwable local295) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
	public static void method1871(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean185) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean185 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)V")
	private static void method1872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt2365 = arg0;
		anInt2374 = arg1;
		anInt2379 = arg2;
		anInt2368 = arg3;
		method1908();
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "()V")
	public static void method1873() {
		Static108.method1772(0, 0);
		method1904();
		method1884(1);
		method1889(1);
		method1883(false);
		method1871(false);
		method1885(false);
		method1892();
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "()V")
	public static void method1874() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(Z)V")
	private static void method1875(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean184) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean184 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public static void method1876(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "()V")
	public static void method1877() {
		if (Static76.aBoolean117) {
			method1883(true);
			method1875(true);
		} else {
			method1883(false);
			method1875(false);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method1878(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method1901(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "()V")
	public static void method1879() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(FFF)V")
	public static void method1880(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean200) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean200 = true;
	}

	@OriginalMember(owner = "client!in", name = "h", descriptor = "()V")
	public static void method1881() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!in", name = "i", descriptor = "()V")
	public static void method1882() {
		Static108.method1772(0, 0);
		method1904();
		method1884(0);
		method1889(0);
		method1883(false);
		method1871(false);
		method1885(false);
		method1892();
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(Z)V")
	public static void method1883(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean191) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean191 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	public static void method1884(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2369) {
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
		anInt2369 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(Z)V")
	public static void method1885(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean192) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean192 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "j", descriptor = "()F")
	public static float method1886() {
		return aFloat23;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method1887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method1866((float) local7 * aFloat25, (float) local17 * aFloat25, (float) -local35 * aFloat25, (float) -local25 * aFloat25, 50.0F, 3584.0F);
		method1872(arg0, anInt2363 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean187 = false;
		Static90.anInt1920 = local7;
		Static65.anInt5541 = local17;
		Static37.anInt3864 = local25;
		Static19.anInt523 = local35;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	public static void method1889(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2362) {
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
		anInt2362 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method1890(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!in", name = "l", descriptor = "()I")
	public static int method1891() {
		if (aBoolean201 && (anInt2377 <= 0 || anInt2375 != Static166.anInt3350)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt2375 = Static166.anInt3350;
			anInt2377 = local9[0];
		}
		return anInt2377;
	}

	@OriginalMember(owner = "client!in", name = "m", descriptor = "()V")
	public static void method1892() {
		if (aBoolean200) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean200 = false;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIII)V")
	public static void method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt2364 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt2363 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method1872(0, 0, anInt2364, anInt2363);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean187 = false;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2371 = arg0;
		anInt2372 = arg1;
		method1908();
	}

	@OriginalMember(owner = "client!in", name = "n", descriptor = "()V")
	private static void method1895() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt2378 = local2[0];
		aGL1.glBindTexture(3553, anInt2378);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static186.method2919();
		Static133.method2173();
		Static154.method2464();
	}

	@OriginalMember(owner = "client!in", name = "o", descriptor = "()V")
	public static void method1896() {
		Static108.method1772(0, 0);
		method1904();
		method1897(-1);
		method1883(false);
		method1871(false);
		method1885(false);
		method1892();
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	public static void method1897(@OriginalArg(0) int arg0) {
		if (arg0 == anInt2367) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt2367 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt2367 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
	public static void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2364 = arg0;
		anInt2363 = arg1;
		aBoolean187 = false;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IIII)V")
	public static void method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method1872(anInt2371, anInt2372, anInt2364, anInt2363);
		aBoolean187 = false;
	}

	@OriginalMember(owner = "client!in", name = "p", descriptor = "()V")
	public static void method1900() {
		if (aGL1 != null) {
			try {
				Static154.method2461();
				Static125.method1984();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static166.method2636();
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
		Static186.method2927();
		aBoolean188 = false;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method1901(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static162.method2645(1000L);
			}
			aGL1 = aGLContext1.getGL();
			new GLU();
			aBoolean188 = true;
			anInt2364 = arg0.getSize().width;
			anInt2363 = arg0.getSize().height;
			var6 = method1870();
			if (var6 != 0) {
				method1900();
				return var6;
			}
			method1895();
			method1867();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(86) Exception local86) {
					if (local29++ > 5) {
						method1900();
						return -3;
					}
					Static162.method2645(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(103) Throwable local103) {
			method1900();
			return -5;
		}
	}

	@OriginalMember(owner = "client!in", name = "q", descriptor = "()V")
	public static void method1902() {
		Static108.method1772(0, 0);
		method1904();
		method1884(0);
		method1889(0);
		method1883(false);
		method1871(false);
		method1885(false);
		method1892();
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
	public static void method1903(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!in", name = "r", descriptor = "()V")
	private static void method1904() {
		if (aBoolean187) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt2364, 0.0D, (double) anInt2363, -1.0D, 1.0D);
		method1872(0, 0, anInt2364, anInt2363);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean187 = true;
	}

	@OriginalMember(owner = "client!in", name = "s", descriptor = "()V")
	public static void method1905() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!in", name = "t", descriptor = "()V")
	public static void method1906() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method1897(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt2364, anInt2363, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(IIII)V")
	public static void method1907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method1887(0, 0, anInt2364, anInt2363, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!in", name = "u", descriptor = "()V")
	private static void method1908() {
		aGL1.glViewport(anInt2365 + anInt2371, anInt2374 + anInt2372, anInt2379, anInt2368);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(FF)V")
	public static void method1909(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean187 || arg0 == aFloat24 && arg1 == aFloat23) {
			return;
		}
		aFloat24 = arg0;
		aFloat23 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray5[10] = aFloat26;
			aFloatArray5[14] = aFloat22;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat22 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray5[10] = aFloat26 + local42;
			aFloatArray5[14] = aFloat22 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray5, 0);
		aGL1.glMatrixMode(5888);
	}
}
