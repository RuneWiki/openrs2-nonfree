import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_93 = new Class77(21, 4);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public static void method7874(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class198 local13 = Static428.method6579(arg2, arg0);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray17 != null) {
			@Pc(23) Class12_Sub6 local23 = new Class12_Sub6();
			local23.anInt1514 = arg3;
			local23.aClass198_2 = local13;
			local23.anObjectArray2 = local13.anObjectArray17;
			local23.aString11 = arg1;
			Static312.method5029(local23);
		}
		if (Static96.anInt2243 != 9 || !Static67.method1529(local13).method5777(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static332.method5312(Static514.aClass77_14);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 2) {
			Static332.method5312(Static535.aClass77_94);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 3) {
			Static332.method5312(Static132.aClass77_27);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 4) {
			Static332.method5312(Static146.aClass77_31);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 5) {
			Static332.method5312(Static103.aClass77_21);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 6) {
			Static332.method5312(Static196.aClass77_39);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 7) {
			Static332.method5312(Static114.aClass77_23);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 8) {
			Static332.method5312(Static354.aClass77_63);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 9) {
			Static332.method5312(Static85.aClass77_19);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
		if (arg3 == 10) {
			Static332.method5312(Static181.aClass77_37);
			Static91.method1970(arg0, local13.anInt5726, arg2);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	public static int method7877(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
