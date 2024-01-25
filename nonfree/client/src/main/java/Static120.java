import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)V")
	public static void method2016(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static541.method7520(1, arg0);
		local12.method4946();
		local12.anInt5822 = arg1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public static void method2017() {
		if (Static25.anInt547 <= 0) {
			Static69.aString12 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static200.aStringArray19.length; local14++) {
			if (Static200.aStringArray19[local14].startsWith("--> ")) {
				local12++;
				if (local12 == Static25.anInt547) {
					Static69.aString12 = Static200.aStringArray19[local14].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
	public static void method2020() {
		Static235.aClass313_29.method7398();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZII)B")
	public static byte method2022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
