import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!aj;")
	public static Class10 aClass10_12;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	public static int anInt5935;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	public static int anInt5936;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!aa;")
	public static Class2 aClass2_5 = new Class2();

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	public static int anInt5931 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method4659() {
		if (Static20.aClass135ArrayArray1 == null) {
			return;
		}
		@Pc(17) Class135 local17 = new Class135();
		for (@Pc(19) int local19 = 0; local19 < 13; local19++) {
			for (@Pc(26) int local26 = 0; local26 < 13; local26++) {
				Static20.aClass135ArrayArray1[local19][local26] = local17;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method4661() {
		if (!Static242.aBoolean347 && Static210.anInt4148 != 2) {
			try {
				Static324.method4224("tbrefresh", Static265.aClient1);
			} catch (@Pc(26) Throwable local26) {
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)Lclient!gd;")
	public static Class60 method4664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3452; local13++) {
			@Pc(22) Class60 local22 = local7.aClass60Array3[local13];
			if ((local22.aLong64 >> 29 & 0x3L) == 2L && local22.anInt1529 == arg1 && local22.anInt1522 == arg2) {
				Static222.method3502(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
	public static String method4666(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (Static276.anInterface4_3 != null) {
			@Pc(13) String local13 = Static276.anInterface4_3.method3844(arg1, arg0, arg2);
			if (local13 != null) {
				return local13;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I")
	public static int method4667() {
		return 14;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(III)V")
	public static void method4668() {
		for (@Pc(1) int local1 = 0; local1 < Static68.anInt1350; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static6.anInt118; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static178.anInt3591; local11++) {
					@Pc(22) Class1_Sub17 local22 = Static122.aClass1_Sub17ArrayArrayArray3[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class61 local27 = local22.aClass61_1;
						if (local27 != null && local27.aClass22_2.method4076()) {
							Static117.method1860(local27.aClass22_2, local1, local6, local11, 1, 1);
							if (local27.aClass22_3 != null && local27.aClass22_3.method4076()) {
								Static117.method1860(local27.aClass22_3, local1, local6, local11, 1, 1);
								local27.aClass22_2.method4072(local27.aClass22_3, 0, 0, 0, false);
								local27.aClass22_3 = local27.aClass22_3.method4074();
							}
							local27.aClass22_2 = local27.aClass22_2.method4074();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt3452; local83++) {
							@Pc(92) Class60 local92 = local22.aClass60Array3[local83];
							if (local92 != null && local92.aClass22_1.method4076()) {
								Static117.method1860(local92.aClass22_1, local1, local6, local11, local92.anInt1523 + 1 - local92.anInt1529, local92.anInt1537 - local92.anInt1522 + 1);
								local92.aClass22_1 = local92.aClass22_1.method4074();
							}
						}
						@Pc(131) Class171 local131 = local22.aClass171_1;
						if (local131 != null && local131.aClass22_10.method4076()) {
							Static224.method3524(local131.aClass22_10, local1, local6, local11);
							local131.aClass22_10 = local131.aClass22_10.method4074();
						}
					}
				}
			}
		}
	}
}
