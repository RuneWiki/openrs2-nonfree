import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "Lclient!kha;")
	public static Class181 aClass181_96;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	public static int anInt8476 = 0;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z")
	public static boolean method6991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)Z")
	public static boolean method6993(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)I")
	public static int method6994() {
		if (Static433.aBoolean672) {
			return 6;
		} else if (Static300.aClass3_Sub1_Sub4_3 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static300.aClass3_Sub1_Sub4_3.anInt3485;
			if (Static483.method7096(local14)) {
				return 1;
			} else if (Static603.method8220(local14)) {
				return 2;
			} else if (Static530.method7543(local14)) {
				return 3;
			} else if (Static438.method6668(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
