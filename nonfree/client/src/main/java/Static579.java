import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "Lclient!sca;")
	public static Class231_Sub1 aClass231_Sub1_2;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "Lclient!br;")
	public static final Class37 aClass37_8 = new Class37("", 12);

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Z")
	public static boolean method7771(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(II)I")
	public static int method7773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static208.aByteArrayArray27 == null ? 0 : Static208.aByteArrayArray27[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIII)V")
	public static void method7774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static468.method6610(arg1 + arg0, Static487.anInt8210, Static278.anInt5111);
		@Pc(30) int local30 = Static468.method6610(arg1 - arg0, Static487.anInt8210, Static278.anInt5111);
		Static250.method4000(local22, Static478.anIntArrayArray51[arg2], local30, arg3);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local69 = arg2 - local9;
				local73 = arg2 + local9;
				if (local73 >= Static126.anInt6658 && Static494.anInt8295 >= local69) {
					local91 = Static468.method6610(local7 + arg1, Static487.anInt8210, Static278.anInt5111);
					local100 = Static468.method6610(arg1 - local7, Static487.anInt8210, Static278.anInt5111);
					if (local73 <= Static494.anInt8295) {
						Static250.method4000(local91, Static478.anIntArrayArray51[local73], local100, arg3);
					}
					if (Static126.anInt6658 <= local69) {
						Static250.method4000(local91, Static478.anIntArrayArray51[local69], local100, arg3);
					}
				}
			}
			local7++;
			local69 = arg2 - local7;
			local73 = local7 + arg2;
			if (Static126.anInt6658 <= local73 && Static494.anInt8295 >= local69) {
				local91 = Static468.method6610(local9 + arg1, Static487.anInt8210, Static278.anInt5111);
				local100 = Static468.method6610(arg1 - local9, Static487.anInt8210, Static278.anInt5111);
				if (Static494.anInt8295 >= local73) {
					Static250.method4000(local91, Static478.anIntArrayArray51[local73], local100, arg3);
				}
				if (local69 >= Static126.anInt6658) {
					Static250.method4000(local91, Static478.anIntArrayArray51[local69], local100, arg3);
				}
			}
		}
	}
}
