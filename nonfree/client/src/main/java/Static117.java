import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!so;")
	public static final Class309 aClass309_2 = new Class309();

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
	public static int anInt2295 = 0;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	public static int anInt2297 = 64;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_21 = new Class70(40, 7);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ICI)I")
	public static int method1847(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLclient!ig;)I")
	public static int method1848(@OriginalArg(1) Class155 arg0) {
		if (Static215.aClass155_7 == arg0) {
			return 5120;
		} else if (arg0 == Static215.aClass155_8) {
			return 5122;
		} else if (Static215.aClass155_9 == arg0) {
			return 5124;
		} else if (arg0 == Static215.aClass155_10) {
			return 5121;
		} else if (Static215.aClass155_11 == arg0) {
			return 5123;
		} else if (arg0 == Static215.aClass155_12) {
			return 5125;
		} else if (arg0 == Static215.aClass155_13) {
			return 5131;
		} else if (Static215.aClass155_14 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
