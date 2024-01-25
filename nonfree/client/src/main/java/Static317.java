import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!ad;")
	public static Class5 aClass5_4;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public static int anInt5682 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method4375() {
		if (!Static194.aBoolean282) {
			return;
		}
		while (true) {
			while (Static284.anInt5184 < Static190.aClass84_Sub1Array1.length) {
				@Pc(29) Class84_Sub1 local29 = Static190.aClass84_Sub1Array1[Static284.anInt5184];
				if (local29 != null && local29.anInt6835 == -1) {
					if (Static405.aClass4_Sub6_2 == null) {
						Static405.aClass4_Sub6_2 = Static201.aClass255_2.method5499(local29.aString66);
					}
					@Pc(53) int local53 = Static405.aClass4_Sub6_2.anInt1312;
					if (local53 == -1) {
						return;
					}
					local29.anInt6835 = local53;
					Static405.aClass4_Sub6_2 = null;
					Static284.anInt5184++;
				} else {
					Static284.anInt5184++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)Z")
	public static boolean method4377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
	public static boolean method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static327.aByteArrayArrayArray11[1][arg1][arg0] & 0x2) != 0;
	}
}
