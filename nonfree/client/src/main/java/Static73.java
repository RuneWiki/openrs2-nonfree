import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static73 {

	@OriginalMember(owner = "client!cja", name = "k", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_20 = new Class185(74, -1);

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(IILclient!sba;I)V")
	public static void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class302 arg2) {
		if (arg2.aByte112 == 0) {
			arg2.anInt8897 = arg2.anInt8854;
		} else if (arg2.aByte112 == 1) {
			arg2.anInt8897 = arg2.anInt8854 + (arg1 - arg2.anInt8872) / 2;
		} else if (arg2.aByte112 == 2) {
			arg2.anInt8897 = arg1 - arg2.anInt8872 - arg2.anInt8854;
		} else if (arg2.aByte112 == 3) {
			arg2.anInt8897 = arg1 * arg2.anInt8854 >> 14;
		} else if (arg2.aByte112 == 4) {
			arg2.anInt8897 = (arg1 * arg2.anInt8854 >> 14) + (arg1 - arg2.anInt8872) / 2;
		} else {
			arg2.anInt8897 = arg1 - (arg2.anInt8854 * arg1 >> 14) - arg2.anInt8872;
		}
		if (arg2.aByte110 == 0) {
			arg2.anInt8930 = arg2.anInt8885;
		} else if (arg2.aByte110 == 1) {
			arg2.anInt8930 = arg2.anInt8885 + (arg0 - arg2.anInt8909) / 2;
		} else if (arg2.aByte110 == 2) {
			arg2.anInt8930 = arg0 - arg2.anInt8909 - arg2.anInt8885;
		} else if (arg2.aByte110 == 3) {
			arg2.anInt8930 = arg2.anInt8885 * arg0 >> 14;
		} else if (arg2.aByte110 == 4) {
			arg2.anInt8930 = (arg0 - arg2.anInt8909) / 2 + (arg0 * arg2.anInt8885 >> 14);
		} else {
			arg2.anInt8930 = arg0 - arg2.anInt8909 - (arg0 * arg2.anInt8885 >> 14);
		}
		if (!Static30.aBoolean78) {
			return;
		}
		if (Static75.method2151(arg2).anInt10438 == 0 && arg2.anInt8936 != 0) {
			return;
		}
		if (arg2.anInt8897 < 0) {
			arg2.anInt8897 = 0;
		} else if (arg1 < arg2.anInt8897 + arg2.anInt8872) {
			arg2.anInt8897 = arg1 - arg2.anInt8872;
		}
		if (arg2.anInt8930 < 0) {
			arg2.anInt8930 = 0;
			return;
		}
		if (arg0 < arg2.anInt8930 + arg2.anInt8909) {
			arg2.anInt8930 = arg0 - arg2.anInt8909;
			return;
		}
	}
}
