import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	public static int anInt5666;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Lclient!vr;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
	public static int anInt5672;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray84 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString209 = "flash2:";

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
	public static int anInt5671 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5035(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static358.method769(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IJ)V")
	public static void method5036(@OriginalArg(1) long arg0) {
		Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
		Static164.aClass14_Sub4_Sub2_3.method2538(21);
		Static164.aClass14_Sub4_Sub2_3.method2544(arg0);
		Static57.anInt1379 = -3;
		Static309.anInt5892 = 0;
		Static108.anInt2423 = 1;
		Static68.anInt1635 = 0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)I")
	public static int method5038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(28) int local28 = Static219.method3941(local7, local17);
		@Pc(35) int local35 = Static219.method3941(local7 + 1, local17);
		@Pc(42) int local42 = Static219.method3941(local7, local17 + 1);
		@Pc(51) int local51 = Static219.method3941(local7 + 1, local17 - -1);
		@Pc(58) int local58 = Static257.method4006(local35, arg0, local28, local13);
		@Pc(65) int local65 = Static257.method4006(local51, arg0, local42, local13);
		return Static257.method4006(local65, arg0, local58, local23);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!qi;")
	public static Class28 method5039(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class28_Sub2");
			@Pc(15) Class28 local15 = (Class28) local11.getDeclaredConstructor().newInstance();
			local15.method3789(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class28_Sub1 local26 = new Class28_Sub1();
			local26.method3789(arg0);
			return local26;
		}
	}
}
