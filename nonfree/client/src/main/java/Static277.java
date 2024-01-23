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

public final class Static277 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public static int anInt5350;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	private static int anInt5351;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public static int anInt5352;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "F")
	private static float aFloat52;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Z")
	public static boolean aBoolean404;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	public static int anInt5354;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	public static int anInt5357;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "Z")
	public static boolean aBoolean407;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	private static int anInt5358;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
	private static int anInt5359;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	public static int anInt5360;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "Ljava/lang/String;")
	private static String aString312;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "F")
	private static float aFloat54;

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	public static int anInt5362;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "Z")
	public static boolean aBoolean408;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "Z")
	public static boolean aBoolean410;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "Z")
	public static boolean aBoolean411;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "Z")
	public static boolean aBoolean413;

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "Z")
	public static boolean aBoolean414;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "Z")
	public static boolean aBoolean416;

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
	private static int anInt5363;

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "Z")
	public static boolean aBoolean417;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "Ljava/lang/String;")
	private static String aString313;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Z")
	public static boolean aBoolean418;

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
	private static int anInt5365;

	@OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
	private static int anInt5366;

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
	private static int anInt5368;

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "Z")
	public static boolean aBoolean420;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "F")
	private static float aFloat50 = 0.0F;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "F")
	private static float aFloat51 = 0.0F;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
	private static boolean aBoolean403 = true;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
	private static boolean aBoolean405 = true;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	private static int anInt5353 = 0;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "F")
	private static float aFloat53 = 0.09765625F;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	private static int anInt5355 = -1;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	private static int anInt5356 = -1;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
	private static boolean aBoolean406 = true;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "[F")
	private static float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
	public static int anInt5361 = 0;

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "Z")
	private static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "Z")
	private static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "Z")
	public static boolean aBoolean419 = true;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	private static int anInt5364 = 0;

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
	private static int anInt5367 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
	public static void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method4213(anInt5354, anInt5357, anInt5362, anInt5360);
		aBoolean415 = false;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFF)V")
	public static void method4185(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean409) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean409 = true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method4186(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFFFFF)V")
	private static void method4187(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray27[0] = local3 / (arg1 - arg0);
		aFloatArray27[1] = 0.0F;
		aFloatArray27[2] = 0.0F;
		aFloatArray27[3] = 0.0F;
		aFloatArray27[4] = 0.0F;
		aFloatArray27[5] = local3 / (arg3 - arg2);
		aFloatArray27[6] = 0.0F;
		aFloatArray27[7] = 0.0F;
		aFloatArray27[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray27[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray27[10] = aFloat54 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray27[11] = -1.0F;
		aFloatArray27[12] = 0.0F;
		aFloatArray27[13] = 0.0F;
		aFloatArray27[14] = aFloat52 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray27[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray27, 0);
		aFloat50 = 0.0F;
		aFloat51 = 0.0F;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
	public static void method4188() {
		Static123.method2162(0, 0);
		method4196();
		method4222(1);
		method4190(1);
		method4193(false);
		method4192(false);
		method4209(false);
		method4210();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	private static void method4189() {
		aBoolean415 = false;
		aGL1.glDisable(3553);
		anInt5367 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt5364 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt5353 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean406 = true;
		aBoolean405 = true;
		aBoolean403 = true;
		Static232.method3602();
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
		method4215();
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
		aBoolean419 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static28.method563();
		Static120.method2135();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method4190(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5353) {
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
		anInt5353 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method4191(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method4192(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean405) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean405 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	public static void method4193(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean406) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean406 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
	private static void method4194() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt5350 = local2[0];
		aGL1.glBindTexture(3553, anInt5350);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static120.method2142();
		Static259.method3978();
		Static167.method2901();
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
	public static void method4195() {
		Static123.method2162(0, 0);
		method4196();
		method4212(-1);
		method4193(false);
		method4192(false);
		method4209(false);
		method4210();
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
	private static void method4196() {
		if (aBoolean415) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt5362, 0.0D, (double) anInt5360, -1.0D, 1.0D);
		method4213(0, 0, anInt5362, anInt5360);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean415 = true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method4197(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static48.method934(1000L);
			}
			aGL1 = aGLContext1.getGL();
			new GLU();
			aBoolean412 = true;
			anInt5362 = arg0.getSize().width;
			anInt5360 = arg0.getSize().height;
			var6 = method4205();
			if (var6 != 0) {
				method4202();
				return var6;
			}
			method4194();
			method4189();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(86) Exception local86) {
					if (local29++ > 5) {
						method4202();
						return -3;
					}
					Static48.method934(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(103) Throwable local103) {
			method4202();
			return -5;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V")
	public static void method4198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method4225(0, 0, anInt5362, anInt5360, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V")
	public static void method4199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt5362 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt5360 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method4213(0, 0, anInt5362, anInt5360);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean415 = false;
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "()V")
	public static void method4200() {
		Static123.method2162(0, 0);
		method4196();
		method4222(0);
		method4190(0);
		method4193(false);
		method4192(false);
		method4209(false);
		method4210();
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "()V")
	public static void method4201() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method4212(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt5362, anInt5360, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "()V")
	public static void method4202() {
		if (aGL1 != null) {
			try {
				Static167.method2910();
				Static287.method4346();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static94.method1744();
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
		Static120.method2146();
		aBoolean412 = false;
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "()F")
	public static float method4203() {
		return aFloat50;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method4204(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method4197(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "()I")
	private static int method4205() {
		@Pc(1) int local1 = 0;
		aString312 = aGL1.glGetString(7936);
		aString313 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString312.toLowerCase();
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
				anInt5351 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt5351 < 12) {
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
		anInt5352 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt5365 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt5368 = local100[0];
		if (anInt5352 < 2 || anInt5365 < 2 || anInt5368 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean418 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean417 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean414 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean407 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean413 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean408 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean404 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean416 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean420 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean411 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		@Pc(195) String local195 = aString313.toLowerCase(Locale.ENGLISH);
		if (local195.indexOf("radeon") != -1) {
			@Pc(202) int local202 = 0;
			@Pc(204) boolean local204 = false;
			@Pc(212) String[] local212 = Static201.method3251(local195.replace('/', ' '), ' ');
			for (@Pc(214) int local214 = 0; local214 < local212.length; local214++) {
				@Pc(222) String local222 = local212[local214];
				if (local222.length() >= 4) {
					if (local222.charAt(0) == 'x' && Static63.method1130(local222.substring(1, 3))) {
						local204 = true;
						break;
					}
					if (Static63.method1130(local222.substring(0, 4))) {
						local202 = Static126.method1526(local222.substring(0, 4));
						break;
					}
				}
			}
			if (local202 >= 7000 && local202 <= 7999) {
				aBoolean417 = false;
			}
			if (local202 >= 7000 && local202 <= 9250) {
				aBoolean416 = false;
			}
			if (local202 >= 9200 || local204) {
				aBoolean411 = false;
			}
			aBoolean410 = aBoolean417;
		}
		if (aBoolean417) {
			try {
				@Pc(288) int[] local288 = new int[1];
				aGL1.glGenBuffersARB(1, local288, 0);
			} catch (@Pc(295) Throwable local295) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "()V")
	private static void method4206() {
		aGL1.glViewport(anInt5363 + anInt5354, anInt5358 + anInt5357, anInt5359, anInt5366);
	}

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "()V")
	public static void method4208() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V")
	public static void method4209(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean403) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean403 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "()V")
	public static void method4210() {
		if (aBoolean409) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean409 = false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method4211(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	public static void method4212(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5367) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt5367 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt5367 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIII)V")
	private static void method4213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt5363 = arg0;
		anInt5358 = arg1;
		anInt5359 = arg2;
		anInt5366 = arg3;
		method4206();
	}

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "()V")
	public static void method4214() {
		Static123.method2162(0, 0);
		method4196();
		method4222(0);
		method4190(0);
		method4193(false);
		method4192(false);
		method4209(false);
		method4210();
	}

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "()V")
	public static void method4215() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "()V")
	public static void method4216() {
		if (Static188.aBoolean295) {
			method4193(true);
			method4217(true);
		} else {
			method4193(false);
			method4217(false);
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(Z)V")
	private static void method4217(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean419) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean419 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "()F")
	public static float method4218() {
		return aFloat51;
	}

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "()I")
	public static int method4219() {
		if (aBoolean408 && (anInt5355 <= 0 || anInt5356 != Static94.anInt2207)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt5356 = Static94.anInt2207;
			anInt5355 = local9[0];
		}
		return anInt5355;
	}

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "()V")
	public static void method4220() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(F)V")
	public static void method4221(@OriginalArg(0) float arg0) {
		method4224(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	public static void method4222(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5364) {
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
		anInt5364 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "()V")
	public static void method4223() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(FF)V")
	public static void method4224(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean415 || arg0 == aFloat50 && arg1 == aFloat51) {
			return;
		}
		aFloat50 = arg0;
		aFloat51 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray27[10] = aFloat54;
			aFloatArray27[14] = aFloat52;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat52 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray27[10] = aFloat54 + local42;
			aFloatArray27[14] = aFloat52 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray27, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method4187((float) local7 * aFloat53, (float) local17 * aFloat53, (float) -local35 * aFloat53, (float) -local25 * aFloat53, 50.0F, 3584.0F);
		method4213(arg0, anInt5360 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean415 = false;
		Static169.anInt3630 = local7;
		Static128.anInt2846 = local17;
		Static209.anInt4169 = local25;
		Static23.anInt474 = local35;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method4226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5362 = arg0;
		anInt5360 = arg1;
		aBoolean415 = false;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
	public static void method4227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5354 = arg0;
		anInt5357 = arg1;
		method4206();
	}
}
