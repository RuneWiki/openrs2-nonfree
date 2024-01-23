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

public final class Static283 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "Z")
	public static boolean aBoolean389;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public static int anInt5678;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString215;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public static int anInt5679;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
	public static boolean aBoolean390;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
	public static boolean aBoolean391;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString216;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	private static int anInt5681;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	private static int anInt5682;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "Z")
	public static boolean aBoolean395;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
	public static int anInt5683;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	private static int anInt5685;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
	public static int anInt5686;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "Z")
	public static boolean aBoolean397;

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
	public static int anInt5688;

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "Z")
	public static boolean aBoolean399;

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "Z")
	public static boolean aBoolean400;

	@OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
	private static int anInt5689;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "Z")
	public static boolean aBoolean402;

	@OriginalMember(owner = "client!uk", name = "I", descriptor = "Z")
	public static boolean aBoolean403;

	@OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
	private static int anInt5691;

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "Z")
	public static boolean aBoolean404;

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "Z")
	public static boolean aBoolean405;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "Z")
	public static boolean aBoolean406;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
	private static int anInt5693;

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
	private static int anInt5694;

	@OriginalMember(owner = "client!uk", name = "T", descriptor = "F")
	private static float aFloat69;

	@OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
	public static int anInt5695;

	@OriginalMember(owner = "client!uk", name = "V", descriptor = "F")
	private static float aFloat70;

	@OriginalMember(owner = "client!uk", name = "W", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	private static int anInt5677 = -1;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "[F")
	private static float[] aFloatArray28 = new float[16];

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
	private static int anInt5680 = 0;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "F")
	private static float aFloat66 = 0.0F;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
	private static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
	private static boolean aBoolean394 = true;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "Z")
	public static boolean aBoolean396 = true;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	private static int anInt5684 = 0;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "F")
	private static float aFloat67 = 0.09765625F;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Z")
	private static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
	public static int anInt5687 = 0;

	@OriginalMember(owner = "client!uk", name = "F", descriptor = "Z")
	private static boolean aBoolean401 = true;

	@OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
	private static int anInt5690 = -1;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "F")
	private static float aFloat68 = 0.0F;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
	private static int anInt5692 = -1;

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "Z")
	private static boolean aBoolean407 = true;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(FFFFFF)V")
	private static void method4627(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray28[0] = local3 / (arg1 - arg0);
		aFloatArray28[1] = 0.0F;
		aFloatArray28[2] = 0.0F;
		aFloatArray28[3] = 0.0F;
		aFloatArray28[4] = 0.0F;
		aFloatArray28[5] = local3 / (arg3 - arg2);
		aFloatArray28[6] = 0.0F;
		aFloatArray28[7] = 0.0F;
		aFloatArray28[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray28[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray28[10] = aFloat69 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray28[11] = -1.0F;
		aFloatArray28[12] = 0.0F;
		aFloatArray28[13] = 0.0F;
		aFloatArray28[14] = aFloat70 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray28[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray28, 0);
		aFloat66 = 0.0F;
		aFloat68 = 0.0F;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(FF)V")
	public static void method4628(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean398 || arg0 == aFloat66 && arg1 == aFloat68) {
			return;
		}
		aFloat66 = arg0;
		aFloat68 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray28[10] = aFloat69;
			aFloatArray28[14] = aFloat70;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat70 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray28[10] = aFloat69 + local42;
			aFloatArray28[14] = aFloat70 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray28, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method4629(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
	public static void method4630() {
		Static53.method5036(0, 0);
		method4668();
		method4664(1);
		method4656(1);
		method4651(false);
		method4657(false);
		method4665(false);
		method4655();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "()V")
	public static void method4631() {
		Static53.method5036(0, 0);
		method4668();
		method4664(0);
		method4656(0);
		method4651(false);
		method4657(false);
		method4665(false);
		method4655();
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "()F")
	public static float method4632() {
		return aFloat66;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	private static void method4633(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean396) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean396 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(F)V")
	public static void method4634(@OriginalArg(0) float arg0) {
		method4628(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
	public static void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method4642(0, 0, anInt5695, anInt5688, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public static void method4636(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5692) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt5692 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt5692 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "()V")
	public static void method4637() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "()V")
	private static void method4638() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt5686 = local2[0];
		aGL1.glBindTexture(3553, anInt5686);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static142.method2406();
		Static210.method3472();
		Static30.method463();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIII)V")
	public static void method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt5695 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt5688 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method4645(0, 0, anInt5695, anInt5688);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean398 = false;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5695 = arg0;
		anInt5688 = arg1;
		aBoolean398 = false;
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "()V")
	public static void method4641() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method4642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method4627((float) local7 * aFloat67, (float) local17 * aFloat67, (float) -local35 * aFloat67, (float) -local25 * aFloat67, 50.0F, 3584.0F);
		method4645(arg0, anInt5688 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean398 = false;
		Static152.anInt2870 = local7;
		Static136.anInt2620 = local17;
		Static183.anInt3645 = local25;
		Static181.anInt3567 = local35;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	public static void method4643(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "()V")
	private static void method4644() {
		aBoolean398 = false;
		aGL1.glDisable(3553);
		anInt5692 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt5684 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt5680 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean401 = true;
		aBoolean394 = true;
		aBoolean407 = true;
		Static301.method4864();
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
		method4653();
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
		aBoolean396 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static226.method3650();
		Static142.method2400();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(IIII)V")
	private static void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt5689 = arg0;
		anInt5685 = arg1;
		anInt5681 = arg2;
		anInt5691 = arg3;
		method4659();
	}

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "()V")
	public static void method4646() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V")
	public static void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5678 = arg0;
		anInt5679 = arg1;
		method4659();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method4648(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static150.method2552(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean393 = true;
			anInt5695 = arg0.getSize().width;
			anInt5688 = arg0.getSize().height;
			var6 = method4669();
			if (var6 != 0) {
				method4652();
				return var6;
			}
			method4638();
			method4644();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method4652();
						return -3;
					}
					Static150.method2552(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method4652();
			return -5;
		}
	}

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "()I")
	public static int method4649() {
		if (aBoolean391 && (anInt5690 <= 0 || anInt5677 != Static189.anInt3719)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt5677 = Static189.anInt3719;
			anInt5690 = local9[0];
		}
		return anInt5690;
	}

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "()V")
	public static void method4650() {
		Static53.method5036(0, 0);
		method4668();
		method4636(-1);
		method4651(false);
		method4657(false);
		method4665(false);
		method4655();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V")
	public static void method4651(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean401) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean401 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "()V")
	public static void method4652() {
		if (aGL1 != null) {
			try {
				Static30.method469();
				Static175.method2883();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static189.method3152();
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
		Static142.method2407();
		aBoolean393 = false;
	}

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "()V")
	public static void method4653() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "()V")
	public static void method4655() {
		if (aBoolean392) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean392 = false;
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public static void method4656(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5680) {
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
		anInt5680 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(Z)V")
	public static void method4657(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean394) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean394 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(IIII)V")
	public static void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method4645(anInt5678, anInt5679, anInt5695, anInt5688);
		aBoolean398 = false;
	}

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "()V")
	private static void method4659() {
		aGL1.glViewport(anInt5689 + anInt5678, anInt5685 + anInt5679, anInt5681, anInt5691);
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
	public static void method4660(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(FFF)V")
	public static void method4661(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean392) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean392 = true;
	}

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "()V")
	public static void method4662() {
		if (Static67.aBoolean95) {
			method4651(true);
			method4633(true);
		} else {
			method4651(false);
			method4633(false);
		}
	}

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "()V")
	public static void method4663() {
		Static53.method5036(0, 0);
		method4668();
		method4664(0);
		method4656(0);
		method4651(false);
		method4657(false);
		method4665(false);
		method4655();
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
	public static void method4664(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5684) {
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
		anInt5684 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(Z)V")
	public static void method4665(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean407) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean407 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "()V")
	public static void method4666() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method4636(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt5695, anInt5688, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "()F")
	public static float method4667() {
		return aFloat68;
	}

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "()V")
	private static void method4668() {
		if (aBoolean398) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt5695, 0.0D, (double) anInt5688, -1.0D, 1.0D);
		method4645(0, 0, anInt5695, anInt5688);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean398 = true;
	}

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "()I")
	private static int method4669() {
		@Pc(1) int local1 = 0;
		aString215 = aGL1.glGetString(7936);
		aString216 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString215.toLowerCase();
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
				anInt5694 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt5694 < 12) {
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
		anInt5683 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt5693 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt5682 = local100[0];
		if (anInt5683 < 2 || anInt5693 < 2 || anInt5682 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean403 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean406 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean397 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean389 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean400 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean391 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean390 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean405 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean404 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean399 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean395 = true;
		@Pc(197) String local197 = aString216.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static308.method4941(local197.replace('/', ' '), ' ');
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static10.method155(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static10.method155(local224.substring(0, 4))) {
						local204 = Static218.method3603(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean406 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean405 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean399 = false;
			}
			aBoolean402 = aBoolean406;
			aBoolean395 = false;
		}
		if (aBoolean406) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method4670(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method4648(arg0, arg1, null);
	}
}
