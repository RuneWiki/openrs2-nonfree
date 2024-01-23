import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "Lclient!uj;")
	public static Class1_Sub5_Sub9 aClass1_Sub5_Sub9_1;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "[Lclient!db;")
	public static Class1_Sub5_Sub4[] aClass1_Sub5_Sub4Array1 = new Class1_Sub5_Sub4[14];

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
	public static int[] anIntArray40 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!bd", name = "O", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4 = new String[200];

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString12 = "Hidden";

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(III)I")
	public static int method318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public static void method319() {
		Static13.anInt282 = -3;
		Static48.anInt1077 = 0;
		Static55.aBoolean119 = false;
		Static129.anInt2552 = 1;
		Static133.anInt2640 = 0;
		Static212.anInt4028 = -1;
		Static120.anInt2454 = 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lclient!h;")
	public static Class70 method321(@OriginalArg(0) int arg0) {
		@Pc(10) Class70 local10 = (Class70) Static210.aClass175_33.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static107.aClass119_41.method3235(arg0, 31);
		local10 = new Class70();
		if (local27 != null) {
			local10.method1807(new Class1_Sub13(local27), arg0);
		}
		Static210.aClass175_33.method4285(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Z")
	public static boolean method322(@OriginalArg(0) int arg0) {
		if (Static196.aBooleanArray16[arg0]) {
			return true;
		} else if (Static273.aClass119_85.method3226(arg0)) {
			@Pc(27) int local27 = Static273.aClass119_85.method3217(arg0);
			if (local27 == 0) {
				Static196.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static176.aClass157ArrayArray1[arg0] == null) {
				Static176.aClass157ArrayArray1[arg0] = new Class157[local27];
			}
			for (@Pc(60) int local60 = 0; local60 < local27; local60++) {
				if (Static176.aClass157ArrayArray1[arg0][local60] == null) {
					@Pc(77) byte[] local77 = Static273.aClass119_85.method3235(local60, arg0);
					if (local77 != null) {
						@Pc(90) Class157 local90 = Static176.aClass157ArrayArray1[arg0][local60] = new Class157();
						local90.anInt4672 = local60 + (arg0 << 16);
						if (local77[0] == -1) {
							local90.method3980(new Class1_Sub13(local77));
						} else {
							local90.method3967(new Class1_Sub13(local77));
						}
					}
				}
			}
			Static196.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!si;B)Lclient!si;")
	public static Class157 method323(@OriginalArg(0) Class157 arg0) {
		@Pc(11) Class157 local11 = Static42.method779(arg0);
		if (local11 == null) {
			local11 = arg0.aClass157_16;
		}
		return local11;
	}
}
