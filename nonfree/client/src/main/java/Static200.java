import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!kr;")
	public static Class46 aClass46_15;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!iq;")
	public static Class104 aClass104_110;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public static int anInt4354 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)I")
	public static int method3771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Lclient!dh;")
	public static Class2_Sub8 method3772() {
		if (Static202.aClass180_34 == null || Static244.aClass91_1 == null) {
			return null;
		}
		for (@Pc(18) Class2_Sub8 local18 = (Class2_Sub8) Static244.aClass91_1.method2443(); local18 != null; local18 = (Class2_Sub8) Static244.aClass91_1.method2443()) {
			@Pc(25) Class66 local25 = Static312.method5209(local18.anInt1039);
			if (local25 != null && local25.aBoolean154 && local25.method1811()) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
	public static int method3773(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
