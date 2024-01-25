import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
	public static int anInt4725;

	@OriginalMember(owner = "client!iw", name = "q", descriptor = "Lclient!me;")
	public static final Class211 aClass211_34 = new Class211(260);

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_60 = new Class276(99, 4);

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)Lclient!pl;")
	public static Class55_Sub6 method3979(@OriginalArg(1) int arg0) {
		@Pc(13) Class134[] local13 = Class2.aClass134Array24;
		synchronized (Class2.aClass134Array24) {
			@Pc(36) Class55_Sub6 local36;
			if (Class2.aClass134Array24.length <= arg0 || Class2.aClass134Array24[arg0].method3227()) {
				local36 = new Class55_Sub6();
				local36.aClass55_Sub3Array1 = new Class55_Sub3[arg0];
				for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
					local36.aClass55_Sub3Array1[local57] = new Class55_Sub3();
				}
			} else {
				local36 = (Class55_Sub6) Class2.aClass134Array24[arg0].method3235();
				local36.method7112();
				@Pc(43) int local43 = Static380.anIntArray474[arg0]--;
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Z")
	public static boolean method3980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static39.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == -Static360.anInt1763) {
			return false;
		} else if (local7 == Static360.anInt1763) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static309.anInt6172;
			@Pc(26) int local26 = arg2 << Static309.anInt6172;
			if (Static557.method1639(local22 + 1, Static224.aClass4Array3[arg0].JA(arg1, arg2), local26 + 1) && Static557.method1639(local22 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1 + 1, arg2), local26 + 1) && Static557.method1639(local22 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1 + 1, arg2 + 1), local26 + Static480.anInt8971 - 1) && Static557.method1639(local22 + 1, Static224.aClass4Array3[arg0].JA(arg1, arg2 + 1), local26 + Static480.anInt8971 - 1) && Static557.method1639(local22 + Static377.anInt7321, Static224.aClass4Array3[arg0].JA(arg1, arg2), local26 + 1) && Static557.method1639(local22 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1 + 1, arg2), local26 + Static377.anInt7321) && Static557.method1639(local22 + Static377.anInt7321, Static224.aClass4Array3[arg0].JA(arg1, arg2 + 1), local26 + Static480.anInt8971 - 1) && Static557.method1639(local22 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1, arg2), local26 + Static377.anInt7321) && Static557.method1639(local22 + Static377.anInt7321, Static224.aClass4Array3[arg0].JA(arg1, arg2), local26 + Static377.anInt7321)) {
				Static39.anIntArrayArrayArray1[arg0][arg1][arg2] = Static360.anInt1763;
				return true;
			} else {
				Static39.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static360.anInt1763;
				return false;
			}
		}
	}
}
