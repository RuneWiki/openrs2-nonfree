import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	public static int anInt4871;

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "Lclient!gl;")
	public static Class2 aClass2_18;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString184 = "Prepared sound engine";

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	public static void method4385() {
		@Pc(1) Class11 local1 = Static159.aClass11_73;
		synchronized (Static159.aClass11_73) {
			Static159.aClass11_73.method214();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIII)I")
	public static int method4386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg0;
			arg0 = arg5;
			arg5 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 + 1 - arg3 - arg0;
		} else if (local14 == 2) {
			return 1 + 7 - arg5 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBIIILclient!ne;II)V")
	public static void method4387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class146 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4.anInt4135 == 2) {
			@Pc(13) int local13 = 99999;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg4.anInt4129; local19++) {
				for (@Pc(23) int local23 = 0; local23 < arg4.anInt4125; local23++) {
					@Pc(34) int local34 = local23 * (arg4.anInt4172 + 32) + arg3;
					@Pc(43) int local43 = arg6 + (arg4.anInt4212 + 32) * local19;
					if (local17 < 20) {
						local43 += arg4.anIntArray363[local17];
						local34 += arg4.anIntArray371[local17];
					}
					if (arg4.anIntArray374[local17] > 0 && (local34 + 32 > arg0 && arg2 > local34 && arg1 < local43 + 32 && local43 < arg5 || Static176.aClass146_40 == arg4 && Static354.anInt6717 == local17)) {
						if (local13 > local17) {
							local13 = local17;
						}
						if (local17 > local15) {
							local15 = local17;
						}
					}
					local17++;
				}
			}
			Static96.method2209(local13, local15, Static218.aClass46_5, arg4);
		} else if (arg4.anInt4135 == 5 && arg4.anInt4124 != -1) {
			Static270.method4604(Static218.aClass46_5, arg4);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!e;B)V")
	public static void method4388(@OriginalArg(0) Class46 arg0) {
		if (Static302.aBoolean409) {
			Static285.method4882(arg0);
		} else {
			Static202.method3763(arg0);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Z")
	public static boolean method4389(@OriginalArg(0) int arg0) {
		if (arg0 == 41 || arg0 == 50 || arg0 == 19 || arg0 == 49 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 33 || arg0 == 9 || arg0 == 1001;
		}
	}
}
