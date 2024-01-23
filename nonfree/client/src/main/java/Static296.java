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

public final class Static296 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	public static int anInt6197;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Z")
	public static boolean aBoolean330;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	public static int anInt6198;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
	public static boolean aBoolean332;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public static int anInt6199;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt6200;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	private static int anInt6201;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Z")
	public static boolean aBoolean334;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	private static int anInt6202;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString199;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	private static int anInt6204;

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "Z")
	public static boolean aBoolean337;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "Z")
	public static boolean aBoolean338;

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "F")
	private static float aFloat202;

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "Z")
	public static boolean aBoolean339;

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "Z")
	public static boolean aBoolean340;

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
	private static int anInt6207;

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "Z")
	public static boolean aBoolean342;

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
	public static int anInt6209;

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "Z")
	public static boolean aBoolean344;

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
	private static int anInt6210;

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
	public static int anInt6212;

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "F")
	private static float aFloat205;

	@OriginalMember(owner = "client!wk", name = "R", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
	private static int anInt6213;

	@OriginalMember(owner = "client!wk", name = "U", descriptor = "Z")
	public static boolean aBoolean345;

	@OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
	private static int anInt6215;

	@OriginalMember(owner = "client!wk", name = "W", descriptor = "Ljava/lang/String;")
	private static String aString200;

	@OriginalMember(owner = "client!wk", name = "Y", descriptor = "Z")
	public static boolean aBoolean347;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "Z")
	private static boolean aBoolean331 = true;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
	public static boolean aBoolean333 = true;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
	public static int anInt6203 = 0;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "Z")
	private static boolean aBoolean336 = true;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "F")
	private static float aFloat201 = 0.0F;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
	private static int anInt6205 = -1;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
	private static int anInt6206 = 0;

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "Z")
	private static boolean aBoolean341 = true;

	@OriginalMember(owner = "client!wk", name = "B", descriptor = "F")
	private static float aFloat203 = 0.09765625F;

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "Z")
	private static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
	private static int anInt6208 = -1;

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "F")
	private static float aFloat204 = 0.0F;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "[F")
	private static float[] aFloatArray33 = new float[16];

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
	private static int anInt6211 = 0;

	@OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
	private static int anInt6214 = -1;

	@OriginalMember(owner = "client!wk", name = "X", descriptor = "Z")
	private static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
	public static void method4798(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean331) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean331 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
	public static void method4799() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method4812(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt6200, anInt6197, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
	private static void method4800() {
		aBoolean346 = false;
		aGL1.glDisable(3553);
		anInt6214 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt6206 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt6211 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean341 = true;
		aBoolean331 = true;
		aBoolean336 = true;
		Static13.method292();
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
		method4813();
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
		aBoolean333 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static201.method3580();
		Static67.method1291();
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()V")
	public static void method4801() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "()V")
	public static void method4802() {
		Static141.method2524(0, 0);
		method4816();
		method4805(1);
		method4823(1);
		method4840(false);
		method4798(false);
		method4814(false);
		method4811();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method4803(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method4832(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
	private static void method4804(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean333) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean333 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method4805(@OriginalArg(0) int arg0) {
		if (arg0 == anInt6206) {
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
		anInt6206 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(F)V")
	public static void method4806(@OriginalArg(0) float arg0) {
		method4830(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(FFFFFF)V")
	private static void method4807(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray33[0] = local3 / (arg1 - arg0);
		aFloatArray33[1] = 0.0F;
		aFloatArray33[2] = 0.0F;
		aFloatArray33[3] = 0.0F;
		aFloatArray33[4] = 0.0F;
		aFloatArray33[5] = local3 / (arg3 - arg2);
		aFloatArray33[6] = 0.0F;
		aFloatArray33[7] = 0.0F;
		aFloatArray33[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray33[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray33[10] = aFloat205 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray33[11] = -1.0F;
		aFloatArray33[12] = 0.0F;
		aFloatArray33[13] = 0.0F;
		aFloatArray33[14] = aFloat202 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray33[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray33, 0);
		aFloat201 = 0.0F;
		aFloat204 = 0.0F;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "()V")
	public static void method4808() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "()V")
	public static void method4809() {
		if (aGL1 != null) {
			try {
				Static214.method3753();
				Static91.method1598();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static237.method4095();
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
		Static67.method1286();
		aBoolean335 = false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(FFF)V")
	public static void method4810(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean343) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean343 = true;
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "()V")
	public static void method4811() {
		if (aBoolean343) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean343 = false;
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method4812(@OriginalArg(0) int arg0) {
		if (arg0 == anInt6214) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt6214 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt6214 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "()V")
	public static void method4813() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)V")
	public static void method4814(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean336) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean336 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "()I")
	private static int method4815() {
		@Pc(1) int local1 = 0;
		aString199 = aGL1.glGetString(7936);
		aString200 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString199.toLowerCase();
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
				anInt6202 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt6202 < 12) {
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
		anInt6199 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt6201 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt6213 = local100[0];
		if (anInt6199 < 2 || anInt6201 < 2 || anInt6213 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean344 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean347 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean338 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean345 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean334 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean340 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean337 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean339 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean342 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean330 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		@Pc(195) String local195 = aString200.toLowerCase(Locale.ENGLISH);
		if (local195.indexOf("radeon") != -1) {
			@Pc(202) int local202 = 0;
			@Pc(204) boolean local204 = false;
			@Pc(212) String[] local212 = Static191.method3403(' ', local195.replace('/', ' '));
			for (@Pc(214) int local214 = 0; local214 < local212.length; local214++) {
				@Pc(222) String local222 = local212[local214];
				if (local222.length() >= 4) {
					if (local222.charAt(0) == 'x' && Static259.method4401(local222.substring(1, 3))) {
						local204 = true;
						break;
					}
					if (Static259.method4401(local222.substring(0, 4))) {
						local202 = Static267.method2723(local222.substring(0, 4));
						break;
					}
				}
			}
			if (local202 >= 7000 && local202 <= 7999) {
				aBoolean347 = false;
			}
			if (local202 >= 7000 && local202 <= 9250) {
				aBoolean339 = false;
			}
			if (local202 >= 9200 || local204) {
				aBoolean330 = false;
			}
			aBoolean332 = aBoolean347;
		}
		if (aBoolean347) {
			try {
				@Pc(288) int[] local288 = new int[1];
				aGL1.glGenBuffersARB(1, local288, 0);
			} catch (@Pc(295) Throwable local295) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "()V")
	private static void method4816() {
		if (aBoolean346) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt6200, 0.0D, (double) anInt6197, -1.0D, 1.0D);
		method4839(0, 0, anInt6200, anInt6197);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean346 = true;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	public static void method4817(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "()V")
	private static void method4818() {
		aGL1.glViewport(anInt6210 + anInt6212, anInt6204 + anInt6209, anInt6207, anInt6215);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public static void method4819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt6212 = arg0;
		anInt6209 = arg1;
		method4818();
	}

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "()V")
	public static void method4820() {
		Static141.method2524(0, 0);
		method4816();
		method4805(0);
		method4823(0);
		method4840(false);
		method4798(false);
		method4814(false);
		method4811();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V")
	public static void method4821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method4827(0, 0, anInt6200, anInt6197, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "()V")
	public static void method4822() {
		if (Static10.aBoolean12) {
			method4840(true);
			method4804(true);
		} else {
			method4840(false);
			method4804(false);
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public static void method4823(@OriginalArg(0) int arg0) {
		if (arg0 == anInt6211) {
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
		anInt6211 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "()V")
	private static void method4824() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt6198 = local2[0];
		aGL1.glBindTexture(3553, anInt6198);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static67.method1285();
		Static191.method3404();
		Static214.method3750();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V")
	public static void method4826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt6200 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt6197 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method4839(0, 0, anInt6200, anInt6197);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean346 = false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method4827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method4807((float) local7 * aFloat203, (float) local17 * aFloat203, (float) -local35 * aFloat203, (float) -local25 * aFloat203, 50.0F, 3584.0F);
		method4839(arg0, anInt6197 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean346 = false;
		Static9.anInt271 = local7;
		Static148.anInt3502 = local17;
		Static91.anInt2137 = local25;
		Static234.anInt5157 = local35;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V")
	public static void method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt6200 = arg0;
		anInt6197 = arg1;
		aBoolean346 = false;
	}

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "()F")
	public static float method4829() {
		return aFloat201;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(FF)V")
	public static void method4830(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean346 || arg0 == aFloat201 && arg1 == aFloat204) {
			return;
		}
		aFloat201 = arg0;
		aFloat204 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray33[10] = aFloat205;
			aFloatArray33[14] = aFloat202;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat202 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray33[10] = aFloat205 + local42;
			aFloatArray33[14] = aFloat202 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray33, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "()F")
	public static float method4831() {
		return aFloat204;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method4832(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static230.method4022(1000L);
			}
			aGL1 = aGLContext1.getGL();
			new GLU();
			aBoolean335 = true;
			anInt6200 = arg0.getSize().width;
			anInt6197 = arg0.getSize().height;
			var6 = method4815();
			if (var6 != 0) {
				method4809();
				return var6;
			}
			method4824();
			method4800();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(86) Exception local86) {
					if (local29++ > 5) {
						method4809();
						return -3;
					}
					Static230.method4022(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(103) Throwable local103) {
			method4809();
			return -5;
		}
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
	public static void method4833(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method4834(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "()V")
	public static void method4835() {
		Static141.method2524(0, 0);
		method4816();
		method4812(-1);
		method4840(false);
		method4798(false);
		method4814(false);
		method4811();
	}

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "()V")
	public static void method4836() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "()V")
	public static void method4837() {
		Static141.method2524(0, 0);
		method4816();
		method4805(0);
		method4823(0);
		method4840(false);
		method4798(false);
		method4814(false);
		method4811();
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIII)V")
	public static void method4838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method4839(anInt6212, anInt6209, anInt6200, anInt6197);
		aBoolean346 = false;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIII)V")
	private static void method4839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt6210 = arg0;
		anInt6204 = arg1;
		anInt6207 = arg2;
		anInt6215 = arg3;
		method4818();
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)V")
	public static void method4840(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean341) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean341 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "()I")
	public static int method4841() {
		if (aBoolean340 && (anInt6208 <= 0 || anInt6205 != Static237.anInt5216)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt6205 = Static237.anInt5216;
			anInt6208 = local9[0];
		}
		return anInt6208;
	}
}
