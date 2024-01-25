import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "Lclient!am;")
	public static Class11 aClass11_102;

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
	public static int anInt5022 = 0;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	public static int anInt5023 = -1;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "Z")
	public static boolean aBoolean423 = true;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!hd;)Lclient!hr;")
	public static Class95 method4158(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		@Pc(13) Class95 local13;
		if (Static59.aClass95_1 == null) {
			local13 = new Class95();
		} else {
			local13 = Static59.aClass95_1;
			Static59.aClass95_1 = Static59.aClass95_1.aClass95_3;
			local13.aClass95_3 = null;
			Static234.anInt4844--;
		}
		local13.anInt2764 = arg0;
		local13.aClass2_Sub2_1 = arg1;
		return local13;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
	public static void method4159() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static60.aBooleanArray8[local7] = true;
		}
	}

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)I")
	public static int method4160() {
		@Pc(11) Class154 local11 = Static202.aClass154_69;
		synchronized (Static202.aClass154_69) {
			return Static202.aClass154_69.method4213();
		}
	}
}
