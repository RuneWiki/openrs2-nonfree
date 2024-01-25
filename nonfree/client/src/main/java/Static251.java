import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "[I")
	public static final int[] anIntArray246 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)Z")
	public static boolean method3705() {
		if (Static301.aBoolean679) {
			try {
				if ((Boolean) Static681.method743(Static492.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(27) Throwable local27) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public static void method3706() {
		@Pc(10) int local10 = Static637.aClass5_Sub20_31.aClass24_Sub17_2.method6235();
		if (local10 == 0) {
			Static240.aByteArrayArrayArray15 = null;
			Static273.method4048(0);
		} else if (local10 == 1) {
			Static245.method3621((byte) 0);
			Static273.method4048(512);
			if (Static220.aByteArrayArrayArray14 != null) {
				Static600.method8643();
			}
		} else {
			Static245.method3621((byte) (Static287.anInt5060 - 4 & 0xFF));
			Static273.method4048(2);
		}
		Static119.anInt1890 = Static240.anInt3974;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Z")
	public static boolean method3707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static372.aClass203_13.method8325(arg0, arg1, arg2, Static675.anIntArray622);
		@Pc(13) int local13 = Static675.anIntArray622[2];
		if (local13 < 50) {
			return false;
		} else {
			Static675.anIntArray622[2] = local13;
			Static675.anIntArray622[0] = Static502.anInt8565 + Static675.anIntArray622[0] * Static617.anInt10169 / local13;
			Static675.anIntArray622[1] = Static120.anInt1905 + Static675.anIntArray622[1] * Static17.anInt299 / local13;
			return true;
		}
	}
}
