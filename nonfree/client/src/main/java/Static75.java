import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Lclient!ho;")
	public static Class134 aClass134_7;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
	public static void method1575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static121.aClass274_1 == Static473.aClass274_4) {
			if (Static492.method6667(0, 0, -2, 1, 1, arg0, false, arg1)) {
				return;
			}
			Static492.method6667(0, 0, -3, 1, 1, arg0, false, arg1);
		} else if (Static492.method6667(0, 0, -3, 1, 1, arg0, false, arg1)) {
			return;
		} else {
			Static492.method6667(0, 0, -2, 1, 1, arg0, false, arg1);
		}
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	public static void method1576() {
		Static422.anInt8671 = Static521.aClass134_12.anInt3760 + Static521.aClass134_12.anInt3765 + 2;
		Static292.anInt4989 = aClass134_7.anInt3760 + aClass134_7.anInt3765 + 2;
		Static421.aStringArray28 = new String[500];
		for (@Pc(33) int local33 = 0; local33 < Static421.aStringArray28.length; local33++) {
			Static421.aStringArray28[local33] = "";
		}
		Static359.method5539(Static544.aClass343_5.method7222(Static256.anInt4535));
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!tf;)Lclient!bn;")
	public static Class3_Sub9 method1577(@OriginalArg(0) int arg0, @OriginalArg(2) Class322 arg1) {
		@Pc(13) byte[] local13 = arg1.method6807(arg0);
		return local13 == null ? null : new Class3_Sub9(local13);
	}
}
