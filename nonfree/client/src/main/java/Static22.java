import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
	public static void method431(@OriginalArg(0) int arg0) {
		Static122.anIntArray164 = new int[arg0];
		Static111.anIntArray139 = new int[arg0];
		Static27.anIntArray36 = new int[arg0];
		Static51.anIntArray69 = new int[arg0];
		Static160.anIntArray218 = new int[arg0];
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
	public static void method432() {
		Static4.aClass198_2.method5243(50);
		Static264.aClass198_49.method5243(50);
		Static290.aClass198_52.method5243(50);
		Static235.aClass198_44.method5243(50);
		Static181.aClass198_13.method5243(50);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!w;I)Z")
	public static boolean method433(@OriginalArg(0) Class211 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean441) {
			return false;
		} else if (!arg0.method5562()) {
			return false;
		} else if (Static57.aClass24_4.method609((long) arg0.anInt6590) == null) {
			return Static289.aClass24_27.method609((long) arg0.anInt6589) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I")
	public static int method434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static137.anIntArray154[arg0 & 0x3] : 256;
	}
}
