import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "Lclient!ai;")
	public static Class7 aClass7_38;

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!s;")
	public static Class88 aClass88_8;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "[Lclient!ah;")
	public static Class6[] aClass6Array2;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
	public static int anInt4262;

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1458 = Static200.method3116("labels)3dat");

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1459 = Static200.method3116("; Expires=");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BIIII)V")
	public static void method3111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg0 <= arg3) {
			for (local18 = arg0; local18 < arg3; local18++) {
				Static148.anIntArrayArray78[local18][arg2] = arg1;
			}
		} else {
			for (local18 = arg3; local18 < arg0; local18++) {
				Static148.anIntArrayArray78[local18][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
	public static boolean method3112(@OriginalArg(0) int arg0) {
		if (Static87.aBooleanArray13[arg0]) {
			return true;
		} else if (Static10.aClass7_2.method3227(arg0)) {
			@Pc(23) int local23 = Static10.aClass7_2.method3246(arg0);
			if (local23 == 0) {
				Static87.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static82.aClass6ArrayArray1[arg0] == null) {
				Static82.aClass6ArrayArray1[arg0] = new Class6[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static82.aClass6ArrayArray1[arg0][local47] == null) {
					@Pc(63) byte[] local63 = Static10.aClass7_2.method3242(arg0, local47);
					if (local63 != null) {
						Static82.aClass6ArrayArray1[arg0][local47] = new Class6();
						Static82.aClass6ArrayArray1[arg0][local47].anInt229 = local47 + (arg0 << 16);
						if (local63[0] == -1) {
							Static82.aClass6ArrayArray1[arg0][local47].method153(new Class1_Sub9(local63));
						} else {
							Static82.aClass6ArrayArray1[arg0][local47].method157(new Class1_Sub9(local63));
						}
					}
				}
			}
			Static87.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/util/Random;B)I")
	public static int method3113(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static106.method1796(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static55.method1058(arg0, local45);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!kh;IZ)V")
	public static void method3114(@OriginalArg(0) Class60 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) int local19 = Static49.aClass1_Sub1_Sub14_3.method3322(arg0, 250);
		@Pc(26) int local26 = Static49.aClass1_Sub1_Sub14_3.method3300(arg0, 250) * 13;
		Static76.method1367(6, 6, local19 + 4 + 4, local26 + 8, 0);
		Static76.method1374(6, 6, local19 + 8, local26 + 4 - -4, 16777215);
		Static49.aClass1_Sub1_Sub14_3.method3298(arg0, 10, 10, local19, local26, 16777215, -1, 1, 1, 0);
		Static191.method2989(local26 + 4 + 4, 6, local19 + 4 + 4, 6);
		if (!arg1) {
			Static85.method1481(local19, 10, local26, 10);
			return;
		}
		@Pc(113) Canvas local113 = Static78.aCanvas1;
		try {
			@Pc(116) Graphics local116 = local113.getGraphics();
			Static21.aClass5_1.method1976(local116);
		} catch (@Pc(124) Exception local124) {
			local113.repaint();
		}
	}
}
