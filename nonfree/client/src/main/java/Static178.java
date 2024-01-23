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

public final class Static178 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString113;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "F")
	private static float aFloat29;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString114;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt3489;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Z")
	public static boolean aBoolean217;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
	public static boolean aBoolean219;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static int anInt3491;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
	public static boolean aBoolean220;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
	public static boolean aBoolean221;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	private static int anInt3493;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	private static int anInt3494;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
	public static int anInt3496;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	private static int anInt3497;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Z")
	public static boolean aBoolean223;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	private static int anInt3498;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
	public static int anInt3499;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Z")
	public static boolean aBoolean225;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
	public static int anInt3500;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	private static int anInt3502;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "Z")
	public static boolean aBoolean226;

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "F")
	private static float aFloat32;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Z")
	public static boolean aBoolean228;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
	private static int anInt3503;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
	public static int anInt3505;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Z")
	public static boolean aBoolean229;

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "Z")
	public static boolean aBoolean231;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Z")
	public static boolean aBoolean232;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
	private static int anInt3506;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[F")
	private static float[] aFloatArray21 = new float[16];

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Z")
	private static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Z")
	private static boolean aBoolean218 = true;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	private static int anInt3490 = -1;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "F")
	private static float aFloat30 = 0.09765625F;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	public static int anInt3492 = 0;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Z")
	private static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
	private static int anInt3495 = -1;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Z")
	private static boolean aBoolean224 = true;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "F")
	private static float aFloat31 = 0.0F;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	private static int anInt3501 = 0;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "Z")
	public static boolean aBoolean227 = true;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	private static int anInt3504 = 0;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "F")
	private static float aFloat33 = 0.0F;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "Z")
	private static boolean aBoolean230 = true;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
	private static int anInt3507 = -1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public static void method2748() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V")
	public static void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method2767(0, 0, anInt3500, anInt3505, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method2750(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method2751(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean224) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean224 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public static void method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt3500 = arg0;
		anInt3505 = arg1;
		aBoolean215 = false;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
	public static void method2753() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method2763(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt3500, anInt3505, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method2754(@OriginalArg(0) int arg0) {
		if (arg0 == anInt3501) {
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
		anInt3501 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()I")
	public static int method2755() {
		if (aBoolean221 && (anInt3490 <= 0 || anInt3495 != Static163.anInt3218)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt3495 = Static163.anInt3218;
			anInt3490 = local9[0];
		}
		return anInt3490;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()V")
	private static void method2756() {
		aBoolean215 = false;
		aGL1.glDisable(3553);
		anInt3507 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt3501 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt3504 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean230 = true;
		aBoolean224 = true;
		aBoolean218 = true;
		Static255.method3847();
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
		method2748();
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
		aBoolean227 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static291.method4316();
		Static12.method196();
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	public static void method2757() {
		if (Static298.aBoolean357) {
			method2776(true);
			method2789(true);
		} else {
			method2776(false);
			method2789(false);
		}
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "()V")
	public static void method2758() {
		Static32.method479(0, 0);
		method2774();
		method2754(0);
		method2769(0);
		method2776(false);
		method2751(false);
		method2772(false);
		method2791();
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()F")
	public static float method2759() {
		return aFloat31;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(FFF)V")
	public static void method2760(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean222) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean222 = true;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	public static void method2761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt3489 = arg0;
		anInt3499 = arg1;
		method2780();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public static void method2763(@OriginalArg(0) int arg0) {
		if (arg0 == anInt3507) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt3507 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt3507 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "()I")
	private static int method2764() {
		@Pc(1) int local1 = 0;
		aString114 = aGL1.glGetString(7936);
		aString113 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString114.toLowerCase();
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
				anInt3498 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt3498 < 12) {
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
		anInt3496 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt3506 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt3502 = local100[0];
		if (anInt3496 < 2 || anInt3506 < 2 || anInt3502 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean232 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean225 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean226 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean217 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean220 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean221 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean219 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean229 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean228 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean223 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		@Pc(195) String local195 = aString113.toLowerCase(Locale.ENGLISH);
		if (local195.indexOf("radeon") != -1) {
			@Pc(202) int local202 = 0;
			@Pc(204) boolean local204 = false;
			@Pc(212) String[] local212 = Static102.method1652(local195.replace('/', ' '), ' ');
			for (@Pc(214) int local214 = 0; local214 < local212.length; local214++) {
				@Pc(222) String local222 = local212[local214];
				if (local222.length() >= 4) {
					if (local222.charAt(0) == 'x' && Static19.method351(local222.substring(1, 3))) {
						local204 = true;
						break;
					}
					if (Static19.method351(local222.substring(0, 4))) {
						local202 = Static224.method3585(local222.substring(0, 4));
						break;
					}
				}
			}
			if (local202 >= 7000 && local202 <= 7999) {
				aBoolean225 = false;
			}
			if (local202 >= 7000 && local202 <= 9250) {
				aBoolean229 = false;
			}
			if (local202 >= 9200 || local204) {
				aBoolean223 = false;
			}
			aBoolean231 = aBoolean225;
		}
		if (aBoolean225) {
			try {
				@Pc(288) int[] local288 = new int[1];
				aGL1.glGenBuffersARB(1, local288, 0);
			} catch (@Pc(295) Throwable local295) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method2765(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "()V")
	public static void method2766() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method2767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method2773((float) local7 * aFloat30, (float) local17 * aFloat30, (float) -local35 * aFloat30, (float) -local25 * aFloat30, 50.0F, 3584.0F);
		method2778(arg0, anInt3505 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean215 = false;
		Static61.anInt1159 = local7;
		Static60.anInt1151 = local17;
		Static93.anInt1922 = local25;
		Static26.anInt481 = local35;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method2768(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method2783(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	public static void method2769(@OriginalArg(0) int arg0) {
		if (arg0 == anInt3504) {
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
		anInt3504 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
	public static void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt3500 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt3505 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method2778(0, 0, anInt3500, anInt3505);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean215 = false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(F)V")
	public static void method2771(@OriginalArg(0) float arg0) {
		method2775(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
	public static void method2772(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean218) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean218 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(FFFFFF)V")
	private static void method2773(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray21[0] = local3 / (arg1 - arg0);
		aFloatArray21[1] = 0.0F;
		aFloatArray21[2] = 0.0F;
		aFloatArray21[3] = 0.0F;
		aFloatArray21[4] = 0.0F;
		aFloatArray21[5] = local3 / (arg3 - arg2);
		aFloatArray21[6] = 0.0F;
		aFloatArray21[7] = 0.0F;
		aFloatArray21[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray21[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray21[10] = aFloat29 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray21[11] = -1.0F;
		aFloatArray21[12] = 0.0F;
		aFloatArray21[13] = 0.0F;
		aFloatArray21[14] = aFloat32 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray21[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray21, 0);
		aFloat33 = 0.0F;
		aFloat31 = 0.0F;
	}

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "()V")
	private static void method2774() {
		if (aBoolean215) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt3500, 0.0D, (double) anInt3505, -1.0D, 1.0D);
		method2778(0, 0, anInt3500, anInt3505);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean215 = true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(FF)V")
	public static void method2775(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean215 || arg0 == aFloat33 && arg1 == aFloat31) {
			return;
		}
		aFloat33 = arg0;
		aFloat31 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray21[10] = aFloat29;
			aFloatArray21[14] = aFloat32;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat32 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray21[10] = aFloat29 + local42;
			aFloatArray21[14] = aFloat32 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray21, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V")
	public static void method2776(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean230) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean230 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "()F")
	public static float method2777() {
		return aFloat33;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIII)V")
	private static void method2778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt3503 = arg0;
		anInt3493 = arg1;
		anInt3497 = arg2;
		anInt3494 = arg3;
		method2780();
	}

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "()V")
	private static void method2779() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt3491 = local2[0];
		aGL1.glBindTexture(3553, anInt3491);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static12.method207();
		Static138.method2259();
		Static58.method933();
	}

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "()V")
	private static void method2780() {
		aGL1.glViewport(anInt3503 + anInt3489, anInt3493 + anInt3499, anInt3497, anInt3494);
	}

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "()V")
	public static void method2781() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "()V")
	public static void method2782() {
		Static32.method479(0, 0);
		method2774();
		method2754(1);
		method2769(1);
		method2776(false);
		method2751(false);
		method2772(false);
		method2791();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method2783(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static122.method2061(1000L);
			}
			aGL1 = aGLContext1.getGL();
			new GLU();
			aBoolean216 = true;
			anInt3500 = arg0.getSize().width;
			anInt3505 = arg0.getSize().height;
			var6 = method2764();
			if (var6 != 0) {
				method2762();
				return var6;
			}
			method2779();
			method2756();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(86) Exception local86) {
					if (local29++ > 5) {
						method2762();
						return -3;
					}
					Static122.method2061(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(103) Throwable local103) {
			method2762();
			return -5;
		}
	}

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "()V")
	public static void method2784() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "()V")
	public static void method2785() {
		Static32.method479(0, 0);
		method2774();
		method2763(-1);
		method2776(false);
		method2751(false);
		method2772(false);
		method2791();
	}

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "()V")
	public static void method2786() {
		Static32.method479(0, 0);
		method2774();
		method2754(0);
		method2769(0);
		method2776(false);
		method2751(false);
		method2772(false);
		method2791();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIII)V")
	public static void method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method2778(anInt3489, anInt3499, anInt3500, anInt3505);
		aBoolean215 = false;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
	public static void method2788(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(Z)V")
	private static void method2789(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean227) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean227 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "()V")
	public static void method2790() {
		aString113 = null;
		aString114 = null;
		aGL1 = null;
		aGLDrawable1 = null;
		aGLContext1 = null;
		aFloatArray21 = null;
	}

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "()V")
	public static void method2791() {
		if (aBoolean222) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean222 = false;
		}
	}
}
