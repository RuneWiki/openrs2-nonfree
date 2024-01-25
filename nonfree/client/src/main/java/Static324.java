import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!nea", name = "H", descriptor = "I")
	public static int anInt6207;

	@OriginalMember(owner = "client!nea", name = "E", descriptor = "[I")
	public static final int[] anIntArray544 = new int[8];

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)V")
	public static void method5199(@OriginalArg(0) int arg0) {
		Static312.anInt6059 = 2;
		Static36.anInt940 = arg0;
		if (Static482.aString81 == null) {
			Static442.method6681(35);
		} else {
			@Pc(20) Class3_Sub27 local20 = new Class3_Sub27(Static443.method6715(Static515.method7365(Static482.aString81)));
			@Pc(26) long local26 = local20.method7555();
			Static209.aLong116 = local20.method7555();
			Static434.method6593(true, "", Static190.method3578(local26));
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!qf;III)V")
	public static void method5200(@OriginalArg(0) Class245 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static496.aClass245_15 = arg0;
		Static518.anInt1786 = arg2;
		Static337.anInt6396 = arg1;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZII)I")
	public static int method5201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static133.anInt2744 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg0 - Static55.anInt1978;
		@Pc(23) int local23 = arg1 - Static55.anInt1974;
		for (@Pc(28) Class3_Sub31 local28 = (Class3_Sub31) Static55.aClass71_19.method2089(); local28 != null; local28 = (Class3_Sub31) Static55.aClass71_19.method2086()) {
			if (local28.anInt5809 == arg2) {
				@Pc(37) int local37 = local28.anInt5808;
				@Pc(40) int local40 = local28.anInt5806;
				@Pc(50) int local50 = Static55.anInt1978 + local37 << 14 | Static55.anInt1974 + local40;
				@Pc(69) int local69 = (local23 - local40) * (-local40 + local23) + (local19 - local37) * (-local37 + local19);
				if (local12 < 0 || local14 > local69) {
					local14 = local69;
					local12 = local50;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!nea", name = "i", descriptor = "(I)V")
	public static void method5203() {
		Static345.aClass3_Sub9_Sub1_2.method1202();
		Static429.anInt7900 = 1;
		Static492.aClass161_108 = null;
	}
}
