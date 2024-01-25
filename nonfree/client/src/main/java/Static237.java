import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	public static int anInt4696;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "I")
	public static int anInt4697;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Lclient!rk;")
	public static Class180 aClass180_59;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString296 = "Please remove ";

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	public static int anInt4702 = 0;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!bd;Z)[Lclient!uo;")
	public static Class201[] method4091(@OriginalArg(0) Class21 arg0) {
		if (!arg0.method373()) {
			return new Class201[0];
		}
		@Pc(14) Class99 local14 = arg0.method365();
		while (local14.anInt2836 == 0) {
			Static129.method2634(10L);
		}
		if (local14.anInt2836 == 2) {
			return new Class201[0];
		}
		@Pc(35) int[] local35 = (int[]) local14.anObject2;
		@Pc(41) Class201[] local41 = new Class201[local35.length >> 2];
		for (@Pc(43) int local43 = 0; local43 < local41.length; local43++) {
			@Pc(48) Class201 local48 = new Class201();
			local41[local43] = local48;
			local48.anInt6172 = local35[local43 << 2];
			local48.anInt6174 = local35[(local43 << 2) + 1];
			local48.anInt6176 = local35[(local43 << 2) + 2];
			local48.anInt6175 = local35[(local43 << 2) + 3];
		}
		return local41;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIBI[Lclient!bi;Z)V")
	public static void method4093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26[] arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg3.length; local5++) {
			@Pc(10) Class26 local10 = arg3[local5];
			if (local10 != null && arg2 == local10.anInt530) {
				Static4.method60(local10, arg4, arg0, arg1);
				Static292.method4789(arg1, local10, arg0);
				if (local10.anInt533 > local10.anInt506 - local10.anInt523) {
					local10.anInt533 = local10.anInt506 - local10.anInt523;
				}
				if (local10.anInt533 < 0) {
					local10.anInt533 = 0;
				}
				if (local10.anInt499 > local10.anInt548 - local10.anInt515) {
					local10.anInt499 = local10.anInt548 - local10.anInt515;
				}
				if (local10.anInt499 < 0) {
					local10.anInt499 = 0;
				}
				if (local10.anInt520 == 0) {
					Static70.method1378(local10, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public static void method4094() {
		@Pc(5) Class103 local5 = Static325.aClass103_64;
		synchronized (Static325.aClass103_64) {
			Static325.aClass103_64.method2684();
		}
		local5 = Static251.aClass103_66;
		synchronized (Static251.aClass103_66) {
			Static251.aClass103_66.method2684();
		}
		@Pc(36) Class62 local36 = Static17.aClass62_3;
		synchronized (Static17.aClass62_3) {
			Static17.aClass62_3.method1392();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public static void method4095() {
		@Pc(5) Class103 local5 = Static251.aClass103_67;
		synchronized (Static251.aClass103_67) {
			Static251.aClass103_67.method2678();
		}
	}
}
