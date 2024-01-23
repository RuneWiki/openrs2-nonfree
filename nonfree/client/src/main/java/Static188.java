import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_4;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
	public static int[] anIntArray377 = new int[5];

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!of", name = "p", descriptor = "S")
	public static short aShort24 = 1;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	public static int anInt4193 = 0;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString122 = "Allocating memory";

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)V")
	public static void method3367() {
		Static11.aClass155_26.method4364(5);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)I")
	public static int method3368(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static294.method4792();
		for (@Pc(20) Class1_Sub21 local20 = arg0 ? (Class1_Sub21) Static127.aClass117_8.method3441() : (Class1_Sub21) Static127.aClass117_8.method3444(); local20 != null; local20 = (Class1_Sub21) Static127.aClass117_8.method3444()) {
			if (local8 > (local20.aLong106 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local20.aLong106 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local20.aLong201;
					Static170.anIntArray601[local49] = Static265.anIntArray574[local49];
					local20.method4742();
					return local49;
				}
				local20.method4742();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!v;IIZ)V")
	public static void method3369(@OriginalArg(1) int arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static111.anInt2392 >= 50 || (arg1 == null || arg1.anIntArrayArray44 == null || arg1.anIntArrayArray44.length <= arg2 || arg1.anIntArrayArray44[arg2] == null)) {
			return;
		}
		@Pc(39) int local39 = arg1.anIntArrayArray44[arg2][0];
		@Pc(43) int local43 = local39 >> 8;
		@Pc(49) int local49 = local39 >> 5 & 0x7;
		@Pc(67) int local67;
		if (arg1.anIntArrayArray44[arg2].length > 1) {
			local67 = (int) (Math.random() * (double) arg1.anIntArrayArray44[arg2].length);
			if (local67 > 0) {
				local43 = arg1.anIntArrayArray44[arg2][local67];
			}
		}
		@Pc(84) int local84 = local39 & 0x1F;
		if (local84 == 0) {
			if (arg4) {
				Static159.method2999(local43, local49, 255, 0);
			}
		} else if (Static210.anInt4682 != 0) {
			Static128.anIntArray263[Static111.anInt2392] = local43;
			local67 = (arg3 - 64) / 128;
			Static13.anIntArray22[Static111.anInt2392] = local49;
			@Pc(128) int local128 = (arg0 - 64) / 128;
			Static116.anIntArray248[Static111.anInt2392] = 0;
			Static49.aClass118Array1[Static111.anInt2392] = null;
			Static40.anIntArray202[Static111.anInt2392] = 255;
			Static222.anIntArray513[Static111.anInt2392] = local84 + (local67 << 16) + (local128 << 8);
			Static111.anInt2392++;
		}
	}
}
