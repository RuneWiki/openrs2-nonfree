import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public static int anInt10056;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_19 = new Class307(9, 0, 4, 1);

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Z")
	public static boolean aBoolean735 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIILclient!wq;)V")
	public static void method8372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class394 arg2) {
		if (Static386.aBoolean482) {
			@Pc(14) Class53 local14 = Static350.anInt6210 == -1 ? null : Static522.aClass282_2.method6901(Static350.anInt6210);
			if (Static81.method1268(arg2).method6631() && (Static2.anInt22 & 0x20) != 0 && (local14 == null || arg2.method8724(local14.anInt1028, Static350.anInt6210) != local14.anInt1028)) {
				Static244.method3492(57, Static116.aString18 + " -> " + arg2.aString116, true, arg2.anInt10469, Static11.aString1, Static476.anInt8267, (long) (arg2.anInt10490 | arg2.anInt10502 << 0), false, false, arg2.anInt10502, arg2.anInt10490, 0L);
			}
		}
		@Pc(90) String local90;
		for (@Pc(81) int local81 = 9; local81 >= 5; local81--) {
			local90 = Static482.method7043(arg2, local81);
			if (local90 != null) {
				Static244.method3492(1009, arg2.aString116, true, arg2.anInt10469, local90, Static23.method336(local81, arg2), (long) (arg2.anInt10502 << 0 | arg2.anInt10490), false, false, arg2.anInt10502, arg2.anInt10490, (long) (local81 + 1));
			}
		}
		local90 = Static326.method5086(arg2);
		if (local90 != null) {
			Static244.method3492(60, arg2.aString116, true, arg2.anInt10469, local90, arg2.anInt10524, (long) (arg2.anInt10502 << 0 | arg2.anInt10490), false, false, arg2.anInt10502, arg2.anInt10490, 0L);
		}
		for (@Pc(171) int local171 = 4; local171 >= 0; local171--) {
			@Pc(178) String local178 = Static482.method7043(arg2, local171);
			if (local178 != null) {
				Static244.method3492(19, arg2.aString116, true, arg2.anInt10469, local178, Static23.method336(local171, arg2), (long) (arg2.anInt10490 | arg2.anInt10502 << 0), false, false, arg2.anInt10502, arg2.anInt10490, (long) (local171 + 1));
			}
		}
		if (!Static81.method1268(arg2).method6634()) {
			return;
		}
		if (arg2.aString114 == null) {
			Static244.method3492(10, "", true, arg2.anInt10469, Static49.aClass42_10.method730(Static259.anInt4113), -1, (long) (arg2.anInt10502 << 0 | arg2.anInt10490), false, false, arg2.anInt10502, arg2.anInt10490, 0L);
		} else {
			Static244.method3492(10, "", true, arg2.anInt10469, arg2.aString114, -1, (long) (arg2.anInt10502 << 0 | arg2.anInt10490), false, false, arg2.anInt10502, arg2.anInt10490, 0L);
		}
	}
}
