import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_147 = new Class349(18, 2);

	@OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
	public static int anInt9008 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Z")
	public static boolean method7170() {
		try {
			if (Static25.anInt442 == 2) {
				if (Static503.aClass2_Sub31_2 == null) {
					Static503.aClass2_Sub31_2 = Static601.method4678(Static467.aClass229_108, Static518.anInt8283, Static90.anInt1607);
					if (Static503.aClass2_Sub31_2 == null) {
						return false;
					}
				}
				if (Static185.aClass234_1 == null) {
					Static185.aClass234_1 = new Class234(Static276.aClass229_67, Static507.aClass229_120);
				}
				@Pc(31) Class2_Sub3_Sub2 local31 = Static84.aClass2_Sub3_Sub2_7;
				if (Static488.aClass2_Sub3_Sub2_5 != null) {
					local31 = Static488.aClass2_Sub3_Sub2_5;
				}
				if (local31.method2041(Static503.aClass2_Sub31_2, Static130.aClass229_26, Static185.aClass234_1)) {
					Static84.aClass2_Sub3_Sub2_7 = local31;
					Static84.aClass2_Sub3_Sub2_7.method2053();
					@Pc(58) int local58;
					if (Static410.anInt6683 <= 0) {
						Static25.anInt442 = 0;
						Static84.aClass2_Sub3_Sub2_7.method2059(Static268.anInt4384);
						for (local58 = 0; local58 < Static462.anIntArray496.length; local58++) {
							Static84.aClass2_Sub3_Sub2_7.method2048(Static462.anIntArray496[local58], local58);
							Static462.anIntArray496[local58] = 255;
						}
					} else {
						Static25.anInt442 = 3;
						Static84.aClass2_Sub3_Sub2_7.method2059(Static268.anInt4384 >= Static410.anInt6683 ? Static410.anInt6683 : Static268.anInt4384);
						for (local58 = 0; local58 < Static462.anIntArray496.length; local58++) {
							Static84.aClass2_Sub3_Sub2_7.method2048(Static462.anIntArray496[local58], local58);
							Static462.anIntArray496[local58] = 255;
						}
					}
					if (Static488.aClass2_Sub3_Sub2_5 == null) {
						if (Static148.aLong56 <= 0L) {
							Static84.aClass2_Sub3_Sub2_7.method2069(Static431.aBoolean568, Static503.aClass2_Sub31_2);
						} else {
							Static84.aClass2_Sub3_Sub2_7.method2054(Static431.aBoolean568, Static503.aClass2_Sub31_2, Static148.aLong56);
						}
					}
					if (Static339.aClass7_2 != null) {
						Static339.aClass7_2.method6321(Static84.aClass2_Sub3_Sub2_7);
					}
					Static467.aClass229_108 = null;
					Static148.aLong56 = 0L;
					Static503.aClass2_Sub31_2 = null;
					Static488.aClass2_Sub3_Sub2_5 = null;
					Static185.aClass234_1 = null;
					return true;
				}
			}
		} catch (@Pc(162) Exception local162) {
			local162.printStackTrace();
			Static84.aClass2_Sub3_Sub2_7.method2057();
			Static185.aClass234_1 = null;
			Static488.aClass2_Sub3_Sub2_5 = null;
			Static467.aClass229_108 = null;
			Static503.aClass2_Sub31_2 = null;
			Static25.anInt442 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IC)I")
	public static int method7172(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class172.anIntArray299.length > arg0 ? Class172.anIntArray299[arg0] : -1;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)I")
	public static int method7174(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
	public static void method7175() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static255.aBooleanArray17[local3] = true;
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V")
	public static void method7177() {
		if (Static306.anInt5072 <= 0) {
			Static280.aString57 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static311.aStringArray28.length; local14++) {
			if (Static311.aStringArray28[local14].indexOf("--> ") != -1) {
				local12++;
				if (local12 == Static306.anInt5072) {
					Static280.aString57 = Static311.aStringArray28[local14].substring(Static311.aStringArray28[local14].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
