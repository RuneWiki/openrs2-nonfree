import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
	public static int anInt2417;

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString76 = "Connection lost.";

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString77 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
	public static int anInt2412 = 0;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "(I)V")
	public static void method1946() {
		Static101.anInt1926 = 0;
		Static110.anInt2061 = 0;
		Static18.method325();
		Static2.method59();
		Static272.method4178();
		Static115.method1778();
		@Pc(23) int local23;
		for (local23 = 0; local23 < Static110.anInt2061; local23++) {
			@Pc(34) int local34 = Static246.anIntArray395[local23];
			if (Static261.anInt5259 != Static77.aClass6_Sub6_Sub2Array1[local34].anInt4519) {
				if (Static77.aClass6_Sub6_Sub2Array1[local34].anInt4609 > 0) {
					Static112.method1750(Static77.aClass6_Sub6_Sub2Array1[local34]);
				}
				Static77.aClass6_Sub6_Sub2Array1[local34] = null;
			}
		}
		if (Static63.aClass1_Sub18_Sub1_1.anInt3911 != Static292.anInt5802) {
			throw new RuntimeException("gpp1 pos:" + Static63.aClass1_Sub18_Sub1_1.anInt3911 + " psize:" + Static292.anInt5802);
		}
		for (local23 = 0; local23 < Static241.anInt4977; local23++) {
			if (Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local23]] == null) {
				throw new RuntimeException("gpp2 pos:" + local23 + " size:" + Static241.anInt4977);
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ak;II)Z")
	public static boolean method1947(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method258(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static249.method3882(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)Lclient!t;")
	public static Class152_Sub1 method1948() {
		return Static32.aClass152_Sub1Array1.length <= Static174.anInt3204 ? null : Static32.aClass152_Sub1Array1[Static174.anInt3204++];
	}
}
