import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_86 = new Class265(89, 8);

	@OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
	public static int anInt4265 = -1;

	@OriginalMember(owner = "client!lg", name = "ab", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!lg", name = "gb", descriptor = "J")
	public static long aLong119 = 0L;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ga;Ljava/awt/Canvas;BLclient!dr;I)Lclient!ya;")
	public static Class49 method3454(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Class59 arg2, @OriginalArg(4) int arg3) {
		return new qa(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
	public static int method3458(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public static void method3461() {
		if (Static34.aClass34_2 != null) {
			Static34.aClass34_2.method610();
			Static34.aClass34_2 = null;
		}
		Static372.method2347();
		Static86.method3567();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static194.aClass70Array1[local17].method1797();
		}
		Static251.method5213(false);
		System.gc();
		Static349.method4777();
		Static144.aBoolean238 = false;
		Static342.anInt5851 = -1;
		Static386.method5102(true);
		Static455.anInt5548 = 0;
		Static376.anInt6396 = 0;
		Static402.anInt6692 = 0;
		Static324.anInt5624 = 0;
		Static48.anInt962 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static20.aClass237Array1.length; local58++) {
			Static20.aClass237Array1[local58] = null;
		}
		Static309.method4375();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static74.aClass3_Sub2_Sub1_Sub2Array1[local77] = null;
		}
		Static62.anInt1371 = 0;
		for (@Pc(93) int local93 = 0; local93 < 32768; local93++) {
			Static174.aClass3_Sub2_Sub1_Sub1Array1[local93] = null;
		}
		Static132.aClass163_13.method3767();
		Static56.method924();
		Static25.anInt589 = 0;
		Static344.aClass108_1.method2428();
		Static55.method922();
		Static281.method5828();
		Static258.method584(true);
		try {
			Static463.method4344("loggedout", Static43.aClass59_5.anApplet1);
		} catch (@Pc(130) Throwable local130) {
		}
		Static278.aClass2_Sub36_1 = null;
		Static452.aLong226 = 0L;
	}
}
