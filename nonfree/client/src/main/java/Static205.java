import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
	public static final int[] anIntArray493 = new int[200];

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[50][];

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "[I")
	public static final int[] anIntArray494 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString166 = "Choose Option";

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
	public static int method3805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub38 local15 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray762.length) {
			return local15.anIntArray762[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)I")
	public static int method3806(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method3807() {
		Static234.aClass140_122.method3813();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass5_Sub4_2 != null) {
			local7.aClass5_Sub4_2 = null;
		}
		if (local7.aClass5_Sub4_1 != null) {
			local7.aClass5_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3809(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static74.aClass181_3);
		arg0.addMouseMotionListener(Static74.aClass181_3);
		arg0.addFocusListener(Static74.aClass181_3);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIFIZ)[I")
	public static int[] method3810(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(15) Class1_Sub2_Sub39 local15 = new Class1_Sub2_Sub39();
		local15.aBoolean584 = true;
		local15.anInt6493 = 8;
		local15.anInt6490 = 8;
		local15.anInt6492 = (int) (arg0 * 4096.0F);
		local15.anInt6489 = 4;
		local15.anInt6499 = 35;
		local15.method5661();
		Static78.method1541(1, 2048);
		local15.method5666(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lclient!dp;")
	public static Class1_Sub1_Sub7 method3812(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static298.aClass156_13.method4258((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static6.aClass165_5.method4508(arg0, 19);
		local10 = new Class1_Sub1_Sub7();
		if (local28 != null) {
			local10.method1388(new Class1_Sub7(local28));
		}
		Static298.aClass156_13.method4256(local10, (long) arg0);
		return local10;
	}
}
