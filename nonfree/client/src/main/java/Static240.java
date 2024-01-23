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

public final class Static240 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "F")
	private static float aFloat139;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt4943;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	private static int anInt4945;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	private static int anInt4946;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Z")
	public static boolean aBoolean370;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt4947;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString163;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString164;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private static int anInt4948;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public static int anInt4949;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	private static int anInt4951;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
	public static boolean aBoolean373;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	private static int anInt4952;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "Z")
	public static boolean aBoolean375;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	private static int anInt4954;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Z")
	public static boolean aBoolean376;

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "Z")
	public static boolean aBoolean379;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "F")
	private static float aFloat141;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	public static int anInt4958;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "Z")
	public static boolean aBoolean380;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "Z")
	public static boolean aBoolean381;

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "Z")
	public static boolean aBoolean382;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "Z")
	public static boolean aBoolean383;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int anInt4959;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "Z")
	public static boolean aBoolean384;

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
	private static int anInt4960;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
	public static int anInt4961;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	private static int anInt4944 = 0;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
	private static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Z")
	public static boolean aBoolean368 = true;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[F")
	private static float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Z")
	private static boolean aBoolean371 = true;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public static int anInt4950 = 0;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Z")
	private static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	private static int anInt4953 = -1;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Z")
	private static boolean aBoolean377 = true;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
	private static int anInt4955 = 0;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Z")
	private static boolean aBoolean378 = true;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "F")
	private static float aFloat140 = 0.0F;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	private static int anInt4956 = -1;

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
	private static int anInt4957 = -1;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "F")
	private static float aFloat142 = 0.0F;

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "F")
	private static float aFloat143 = 0.09765625F;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()F")
	public static float method3769() {
		return aFloat142;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method3770(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method3794(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
	public static void method3771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method3780(anInt4947, anInt4959, anInt4949, anInt4961);
		aBoolean367 = false;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	private static void method3772() {
		aGL1.glViewport(anInt4948 + anInt4947, anInt4954 + anInt4959, anInt4960, anInt4952);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()F")
	public static float method3773() {
		return aFloat140;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method3774(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean377) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean377 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
	public static void method3775() {
		if (Static294.aBoolean445) {
			method3787(true);
			method3785(true);
		} else {
			method3787(false);
			method3785(false);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method3776(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public static void method3777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt4947 = arg0;
		anInt4959 = arg1;
		method3772();
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "()V")
	public static void method3778() {
		Static122.method1910(0, 0);
		method3799();
		method3789(-1);
		method3787(false);
		method3801(false);
		method3774(false);
		method3781();
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "()V")
	public static void method3779() {
		Static122.method1910(0, 0);
		method3799();
		method3804(1);
		method3791(1);
		method3787(false);
		method3801(false);
		method3774(false);
		method3781();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)V")
	private static void method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt4948 = arg0;
		anInt4954 = arg1;
		anInt4960 = arg2;
		anInt4952 = arg3;
		method3772();
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "()V")
	public static void method3781() {
		if (aBoolean374) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean374 = false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method3782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method3786((float) local7 * aFloat143, (float) local17 * aFloat143, (float) -local35 * aFloat143, (float) -local25 * aFloat143, 50.0F, 3584.0F);
		method3780(arg0, anInt4961 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean367 = false;
		Static77.anInt1560 = local7;
		Static211.anInt958 = local17;
		Static17.anInt409 = local25;
		Static150.anInt2786 = local35;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)V")
	public static void method3784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method3782(0, 0, anInt4949, anInt4961, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
	private static void method3785(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean368) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean368 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFFFFF)V")
	private static void method3786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray30[0] = local3 / (arg1 - arg0);
		aFloatArray30[1] = 0.0F;
		aFloatArray30[2] = 0.0F;
		aFloatArray30[3] = 0.0F;
		aFloatArray30[4] = 0.0F;
		aFloatArray30[5] = local3 / (arg3 - arg2);
		aFloatArray30[6] = 0.0F;
		aFloatArray30[7] = 0.0F;
		aFloatArray30[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray30[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray30[10] = aFloat141 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray30[11] = -1.0F;
		aFloatArray30[12] = 0.0F;
		aFloatArray30[13] = 0.0F;
		aFloatArray30[14] = aFloat139 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray30[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray30, 0);
		aFloat140 = 0.0F;
		aFloat142 = 0.0F;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)V")
	public static void method3787(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean378) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean378 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method3788(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method3789(@OriginalArg(0) int arg0) {
		if (arg0 == anInt4957) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt4957 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt4957 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "()I")
	private static int method3790() {
		@Pc(1) int local1 = 0;
		aString164 = aGL1.glGetString(7936);
		aString163 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString164.toLowerCase();
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
				anInt4945 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt4945 < 12) {
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
		anInt4958 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt4946 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt4951 = local100[0];
		if (anInt4958 < 2 || anInt4946 < 2 || anInt4951 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean379 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean372 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean384 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean380 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean373 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean370 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean382 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean375 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean376 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean383 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		@Pc(195) String local195 = aString163.toLowerCase(Locale.ENGLISH);
		if (local195.indexOf("radeon") != -1) {
			@Pc(202) int local202 = 0;
			@Pc(204) boolean local204 = false;
			@Pc(212) String[] local212 = Static80.method1358(local195.replace('/', ' '), ' ');
			for (@Pc(214) int local214 = 0; local214 < local212.length; local214++) {
				@Pc(222) String local222 = local212[local214];
				if (local222.length() >= 4) {
					if (local222.charAt(0) == 'x' && Static293.method4495(local222.substring(1, 3))) {
						local204 = true;
						break;
					}
					if (Static293.method4495(local222.substring(0, 4))) {
						local202 = Static75.method1281(local222.substring(0, 4));
						break;
					}
				}
			}
			if (local202 >= 7000 && local202 <= 7999) {
				aBoolean372 = false;
			}
			if (local202 >= 7000 && local202 <= 9250) {
				aBoolean375 = false;
			}
			if (local202 >= 9200 || local204) {
				aBoolean383 = false;
			}
			aBoolean381 = aBoolean372;
		}
		if (aBoolean372) {
			try {
				@Pc(288) int[] local288 = new int[1];
				aGL1.glGenBuffersARB(1, local288, 0);
			} catch (@Pc(295) Throwable local295) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	public static void method3791(@OriginalArg(0) int arg0) {
		if (arg0 == anInt4955) {
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
		anInt4955 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	public static void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt4949 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt4961 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method3780(0, 0, anInt4949, anInt4961);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean367 = false;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
	public static void method3793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt4949 = arg0;
		anInt4961 = arg1;
		aBoolean367 = false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method3794(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static275.method4233(1000L);
			}
			aGL1 = aGLContext1.getGL();
			new GLU();
			aBoolean369 = true;
			anInt4949 = arg0.getSize().width;
			anInt4961 = arg0.getSize().height;
			var6 = method3790();
			if (var6 != 0) {
				method3803();
				return var6;
			}
			method3806();
			method3798();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(86) Exception local86) {
					if (local29++ > 5) {
						method3803();
						return -3;
					}
					Static275.method4233(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(103) Throwable local103) {
			method3803();
			return -5;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method3795(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "()V")
	public static void method3796() {
		Static122.method1910(0, 0);
		method3799();
		method3804(0);
		method3791(0);
		method3787(false);
		method3801(false);
		method3774(false);
		method3781();
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "()V")
	public static void method3797() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "()V")
	private static void method3798() {
		aBoolean367 = false;
		aGL1.glDisable(3553);
		anInt4957 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt4944 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt4955 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean378 = true;
		aBoolean371 = true;
		aBoolean377 = true;
		Static110.method1728();
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
		method3808();
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
		aBoolean368 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static34.method624();
		Static194.method2941();
	}

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "()V")
	private static void method3799() {
		if (aBoolean367) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt4949, 0.0D, (double) anInt4961, -1.0D, 1.0D);
		method3780(0, 0, anInt4949, anInt4961);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean367 = true;
	}

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "()V")
	public static void method3800() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(Z)V")
	public static void method3801(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean371) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean371 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "()V")
	public static void method3802() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "()V")
	public static void method3803() {
		if (aGL1 != null) {
			try {
				Static111.method1736();
				Static244.method3855();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static154.method2371();
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
		Static194.method2937();
		aBoolean369 = false;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public static void method3804(@OriginalArg(0) int arg0) {
		if (arg0 == anInt4944) {
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
		anInt4944 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "()V")
	public static void method3805() {
		Static122.method1910(0, 0);
		method3799();
		method3804(0);
		method3791(0);
		method3787(false);
		method3801(false);
		method3774(false);
		method3781();
	}

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "()V")
	private static void method3806() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt4943 = local2[0];
		aGL1.glBindTexture(3553, anInt4943);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static194.method2948();
		Static169.method2559();
		Static111.method1730();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FF)V")
	public static void method3807(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean367 || arg0 == aFloat140 && arg1 == aFloat142) {
			return;
		}
		aFloat140 = arg0;
		aFloat142 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray30[10] = aFloat141;
			aFloatArray30[14] = aFloat139;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat139 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray30[10] = aFloat141 + local42;
			aFloatArray30[14] = aFloat139 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray30, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "()V")
	public static void method3808() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(F)V")
	public static void method3809(@OriginalArg(0) float arg0) {
		method3807(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFF)V")
	public static void method3810(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean374) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean374 = true;
	}

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "()V")
	public static void method3811() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method3789(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt4949, anInt4961, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "()I")
	public static int method3812() {
		if (aBoolean370 && (anInt4956 <= 0 || anInt4953 != Static154.anInt2852)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt4953 = Static154.anInt2852;
			anInt4956 = local9[0];
		}
		return anInt4956;
	}
}
