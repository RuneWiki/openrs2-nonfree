import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
	public static int anInt9350;

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "Lclient!de;")
	public static final Class69 aClass69_61 = new Class69(10);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILclient!ria;I)V")
	public static void method7943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class303 arg2) {
		if (Static557.aBoolean660) {
			@Pc(15) Class328 local15 = Static404.anInt6894 == -1 ? null : Static106.aClass293_1.method6807(Static404.anInt6894);
			if (Static79.method1734(arg2).method2648() && (Static613.anInt10082 & 0x20) != 0 && (local15 == null || arg2.method6942(local15.anInt8782, Static404.anInt6894) != local15.anInt8782)) {
				Static244.method4145(0L, (long) (arg2.anInt7983 << 0 | arg2.anInt7962), false, true, Static80.aString17 + " -> " + arg2.aString78, arg2.anInt7964, Static237.anInt4365, 6, arg2.anInt7962, Static184.aString32, false, arg2.anInt7983);
			}
		}
		@Pc(88) String local88;
		for (@Pc(82) int local82 = 9; local82 >= 5; local82--) {
			local88 = Static493.method6907(local82, arg2);
			if (local88 != null) {
				Static244.method4145((long) (local82 + 1), (long) (arg2.anInt7983 << 0 | arg2.anInt7962), false, true, arg2.aString78, arg2.anInt7964, Static124.method2243(local82, arg2), 1007, arg2.anInt7962, local88, false, arg2.anInt7983);
			}
		}
		local88 = Static270.method4444(arg2);
		if (local88 != null) {
			Static244.method4145(0L, (long) (arg2.anInt7962 | arg2.anInt7983 << 0), false, true, arg2.aString78, arg2.anInt7964, arg2.anInt7994, 51, arg2.anInt7962, local88, false, arg2.anInt7983);
		}
		for (@Pc(175) int local175 = 4; local175 >= 0; local175--) {
			@Pc(181) String local181 = Static493.method6907(local175, arg2);
			if (local181 != null) {
				Static244.method4145((long) (local175 + 1), (long) (arg2.anInt7962 | arg2.anInt7983 << 0), false, true, arg2.aString78, arg2.anInt7964, Static124.method2243(local175, arg2), 23, arg2.anInt7962, local181, false, arg2.anInt7983);
			}
		}
		if (!Static79.method1734(arg2).method2654()) {
			return;
		}
		if (arg2.aString76 == null) {
			Static244.method4145(0L, (long) (arg2.anInt7983 << 0 | arg2.anInt7962), false, true, "", arg2.anInt7964, -1, 3, arg2.anInt7962, Static573.aClass345_11.method7951(Static496.anInt7407), false, arg2.anInt7983);
		} else {
			Static244.method4145(0L, (long) (arg2.anInt7983 << 0 | arg2.anInt7962), false, true, "", arg2.anInt7964, -1, 3, arg2.anInt7962, arg2.aString76, false, arg2.anInt7983);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)V")
	public static void method7944(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub7_Sub2 local18 = Static188.method3210(6, arg0);
		local18.method923();
	}
}
