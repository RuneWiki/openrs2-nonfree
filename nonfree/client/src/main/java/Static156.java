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

public final class Static156 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
	public static boolean aBoolean194;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt3080;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Z")
	public static boolean aBoolean195;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Z")
	public static boolean aBoolean196;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
	public static boolean aBoolean197;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString174;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	private static int anInt3083;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	private static int anInt3084;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	private static int anInt3085;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "I")
	private static int anInt3086;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Z")
	public static boolean aBoolean200;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "F")
	private static float aFloat89;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	private static int anInt3087;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "Z")
	public static boolean aBoolean202;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "F")
	private static float aFloat90;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "Z")
	public static boolean aBoolean203;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "I")
	private static int anInt3088;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "I")
	private static int anInt3089;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "I")
	public static int anInt3090;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "Z")
	public static boolean aBoolean205;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	public static int anInt3093;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "Z")
	public static boolean aBoolean206;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "I")
	public static int anInt3094;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "Z")
	public static boolean aBoolean207;

	@OriginalMember(owner = "client!le", name = "K", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!le", name = "N", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!le", name = "O", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!le", name = "P", descriptor = "I")
	public static int anInt3095;

	@OriginalMember(owner = "client!le", name = "R", descriptor = "I")
	public static int anInt3097;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "Ljava/lang/String;")
	private static String aString175;

	@OriginalMember(owner = "client!le", name = "W", descriptor = "Z")
	public static boolean aBoolean212;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[F")
	private static float[] aFloatArray12 = new float[16];

	@OriginalMember(owner = "client!le", name = "i", descriptor = "F")
	private static float aFloat88 = 0.09765625F;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	private static int anInt3081 = -1;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	public static int anInt3082 = 0;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
	private static boolean aBoolean198 = true;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Z")
	private static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Z")
	private static boolean aBoolean201 = true;

	@OriginalMember(owner = "client!le", name = "A", descriptor = "Z")
	private static boolean aBoolean204 = true;

	@OriginalMember(owner = "client!le", name = "C", descriptor = "I")
	private static int anInt3091 = -1;

	@OriginalMember(owner = "client!le", name = "E", descriptor = "I")
	private static int anInt3092 = 0;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "F")
	private static float aFloat91 = 0.0F;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "Z")
	public static boolean aBoolean209 = true;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "F")
	private static float aFloat92 = 0.0F;

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
	private static int anInt3096 = 0;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "I")
	private static int anInt3098 = -1;

	@OriginalMember(owner = "client!le", name = "U", descriptor = "Z")
	private static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public static void method2656() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	private static int method2657() {
		@Pc(1) int local1 = 0;
		aString175 = aGL1.glGetString(7936);
		aString174 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString175.toLowerCase();
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
				anInt3087 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt3087 < 12) {
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
		anInt3090 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt3089 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt3088 = local100[0];
		if (anInt3090 < 2 || anInt3089 < 2 || anInt3088 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean212 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean206 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean208 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean205 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean197 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean194 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean207 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean200 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean196 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean202 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean203 = true;
		@Pc(197) String local197 = aString174.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static308.method4674(' ', local197.replace('/', ' '));
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static222.method3455(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static222.method3455(local224.substring(0, 4))) {
						local204 = Static110.method1981(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean206 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean200 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean202 = false;
			}
			aBoolean195 = aBoolean206;
			aBoolean203 = false;
		}
		if (aBoolean206) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(F)V")
	public static void method2658(@OriginalArg(0) float arg0) {
		method2670(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method2659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method2685((float) local7 * aFloat88, (float) local17 * aFloat88, (float) -local35 * aFloat88, (float) -local25 * aFloat88, 50.0F, 3584.0F);
		method2692(arg0, anInt3095 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean210 = false;
		Static280.anInt5070 = local7;
		Static130.anInt2601 = local17;
		Static126.anInt1742 = local25;
		Static187.anInt3579 = local35;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	public static void method2660() {
		if (aBoolean199) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean199 = false;
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
	public static void method2661() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "()V")
	public static void method2662() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	public static void method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt3093 = arg0;
		anInt3095 = arg1;
		aBoolean210 = false;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "()V")
	public static void method2664() {
		Static90.method1648(0, 0);
		method2683();
		method2699(-1);
		method2675(false);
		method2668(false);
		method2674(false);
		method2660();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	private static void method2665(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean209) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean209 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "()F")
	public static float method2666() {
		return aFloat91;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method2667(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method2677(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	public static void method2668(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean204) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean204 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	public static void method2669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method2692(anInt3080, anInt3097, anInt3093, anInt3095);
		aBoolean210 = false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(FF)V")
	public static void method2670(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean210 || arg0 == aFloat91 && arg1 == aFloat92) {
			return;
		}
		aFloat91 = arg0;
		aFloat92 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray12[10] = aFloat89;
			aFloatArray12[14] = aFloat90;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat90 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray12[10] = aFloat89 + local42;
			aFloatArray12[14] = aFloat90 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray12, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method2671(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "()V")
	public static void method2672() {
		if (Static311.aBoolean384) {
			method2675(true);
			method2665(true);
		} else {
			method2675(false);
			method2665(false);
		}
	}

	@OriginalMember(owner = "client!le", name = "i", descriptor = "()V")
	public static void method2673() {
		Static90.method1648(0, 0);
		method2683();
		method2695(1);
		method2681(1);
		method2675(false);
		method2668(false);
		method2674(false);
		method2660();
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V")
	public static void method2674(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean198) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean198 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(Z)V")
	public static void method2675(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean201) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean201 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "()V")
	public static void method2676() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method2677(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static282.method4345(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean211 = true;
			anInt3093 = arg0.getSize().width;
			anInt3095 = arg0.getSize().height;
			var6 = method2657();
			if (var6 != 0) {
				method2697();
				return var6;
			}
			method2684();
			method2686();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method2697();
						return -3;
					}
					Static282.method4345(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method2697();
			return -5;
		}
	}

	@OriginalMember(owner = "client!le", name = "k", descriptor = "()V")
	public static void method2678() {
		Static90.method1648(0, 0);
		method2683();
		method2695(0);
		method2681(0);
		method2675(false);
		method2668(false);
		method2674(false);
		method2660();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	public static void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt3080 = arg0;
		anInt3097 = arg1;
		method2689();
	}

	@OriginalMember(owner = "client!le", name = "l", descriptor = "()I")
	public static int method2680() {
		if (aBoolean194 && (anInt3081 <= 0 || anInt3091 != Static10.anInt142)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt3091 = Static10.anInt142;
			anInt3081 = local9[0];
		}
		return anInt3081;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method2681(@OriginalArg(0) int arg0) {
		if (arg0 == anInt3096) {
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
		anInt3096 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V")
	public static void method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt3093 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt3095 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method2692(0, 0, anInt3093, anInt3095);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean210 = false;
	}

	@OriginalMember(owner = "client!le", name = "m", descriptor = "()V")
	private static void method2683() {
		if (aBoolean210) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt3093, 0.0D, (double) anInt3095, -1.0D, 1.0D);
		method2692(0, 0, anInt3093, anInt3095);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean210 = true;
	}

	@OriginalMember(owner = "client!le", name = "n", descriptor = "()V")
	private static void method2684() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt3094 = local2[0];
		aGL1.glBindTexture(3553, anInt3094);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static101.method1832();
		Static75.method1477();
		Static177.method2957();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(FFFFFF)V")
	private static void method2685(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray12[0] = local3 / (arg1 - arg0);
		aFloatArray12[1] = 0.0F;
		aFloatArray12[2] = 0.0F;
		aFloatArray12[3] = 0.0F;
		aFloatArray12[4] = 0.0F;
		aFloatArray12[5] = local3 / (arg3 - arg2);
		aFloatArray12[6] = 0.0F;
		aFloatArray12[7] = 0.0F;
		aFloatArray12[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray12[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray12[10] = aFloat89 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray12[11] = -1.0F;
		aFloatArray12[12] = 0.0F;
		aFloatArray12[13] = 0.0F;
		aFloatArray12[14] = aFloat90 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray12[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray12, 0);
		aFloat91 = 0.0F;
		aFloat92 = 0.0F;
	}

	@OriginalMember(owner = "client!le", name = "o", descriptor = "()V")
	private static void method2686() {
		aBoolean210 = false;
		aGL1.glDisable(3553);
		anInt3098 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt3092 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt3096 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean201 = true;
		aBoolean204 = true;
		aBoolean198 = true;
		Static137.method2371();
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
		method2676();
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
		aBoolean209 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static283.method4356();
		Static101.method1836();
	}

	@OriginalMember(owner = "client!le", name = "p", descriptor = "()V")
	public static void method2687() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method2699(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt3093, anInt3095, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method2688(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!le", name = "q", descriptor = "()V")
	private static void method2689() {
		aGL1.glViewport(anInt3084 + anInt3080, anInt3083 + anInt3097, anInt3086, anInt3085);
	}

	@OriginalMember(owner = "client!le", name = "r", descriptor = "()F")
	public static float method2690() {
		return aFloat92;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)V")
	public static void method2691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method2659(0, 0, anInt3093, anInt3095, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIII)V")
	private static void method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt3084 = arg0;
		anInt3083 = arg1;
		anInt3086 = arg2;
		anInt3085 = arg3;
		method2689();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(FFF)V")
	public static void method2693(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean199) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean199 = true;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method2695(@OriginalArg(0) int arg0) {
		if (arg0 == anInt3092) {
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
		anInt3092 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	public static void method2696(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!le", name = "t", descriptor = "()V")
	public static void method2697() {
		if (aGL1 != null) {
			try {
				Static177.method2952();
				Static34.method3908();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static10.method128();
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
		Static101.method1835();
		aBoolean211 = false;
	}

	@OriginalMember(owner = "client!le", name = "u", descriptor = "()V")
	public static void method2698() {
		Static90.method1648(0, 0);
		method2683();
		method2695(0);
		method2681(0);
		method2675(false);
		method2668(false);
		method2674(false);
		method2660();
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
	public static void method2699(@OriginalArg(0) int arg0) {
		if (arg0 == anInt3098) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt3098 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt3098 = arg0;
	}
}
