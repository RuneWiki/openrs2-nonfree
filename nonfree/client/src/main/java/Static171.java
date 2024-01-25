import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "Lclient!pt;")
	public static final Class230 aClass230_22 = new Class230(16);

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!g;")
	public static final Class110 aClass110_13 = new Class110(4);

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!raa;B)I")
	public static int method3197(@OriginalArg(0) Class246 arg0) {
		if (arg0 == Static428.aClass246_3) {
			return 7681;
		} else if (arg0 == Static459.aClass246_5) {
			return 8448;
		} else if (Static449.aClass246_4 == arg0) {
			return 34165;
		} else if (arg0 == Static157.aClass246_1) {
			return 260;
		} else if (Static409.aClass246_2 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)I")
	public static int method3198(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLclient!il;)Z")
	public static boolean method3200(@OriginalArg(1) Class139 arg0) {
		return Static392.aClass139_6 == arg0 || arg0 == Static347.aClass139_5 || Static291.aClass139_3 == arg0 || arg0 == Static545.aClass139_7;
	}
}
