import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_10 = new Class276(43, -1);

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_10 = new Class230(20, 16);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!fd;)V")
	public static void method1122(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (Static574.aClass9_4 == null) {
			return;
		}
		try {
			Static574.aClass9_4.method371(0L);
			Static574.aClass9_4.method375(arg1.aByteArray86, arg0, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public static void method1123() {
		@Pc(5) Class148 local5 = null;
		try {
			local5 = Static530.method7800("2");
			@Pc(18) Class3_Sub7 local18 = new Class3_Sub7(Static20.anInt617 * 6 + 3);
			local18.method6494(1);
			local18.method6528(Static20.anInt617);
			for (@Pc(28) int local28 = 0; local28 < Static183.anIntArray237.length; local28++) {
				if (Static57.aBooleanArray5[local28]) {
					local18.method6528(local28);
					local18.method6495(Static183.anIntArray237[local28]);
				}
			}
			local5.method3373(local18.anInt7869, local18.aByteArray86, 0);
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local5 != null) {
				local5.method3377();
			}
		} catch (@Pc(65) Exception local65) {
		}
		Static52.aLong52 = Static376.method6088();
		Static463.aBoolean709 = false;
	}
}
