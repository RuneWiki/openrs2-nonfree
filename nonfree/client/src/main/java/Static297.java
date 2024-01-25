import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
	public static int anInt4831;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
	public static int anInt4826 = 0;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_38 = new Class156();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIII)Lclient!dc;")
	public static Class3_Sub4_Sub1 method3931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class270 local15 = Static309.aClass270ArrayArrayArray3[arg2][arg0][arg1];
		if (local15 == null) {
			return null;
		}
		@Pc(21) Class3_Sub4_Sub1 local21 = null;
		@Pc(23) int local23 = -1;
		for (@Pc(26) Class241 local26 = local15.aClass241_2; local26 != null; local26 = local26.aClass241_1) {
			@Pc(30) Class3_Sub4 local30 = local26.aClass3_Sub4_2;
			if (local30 instanceof Class3_Sub4_Sub1) {
				@Pc(36) Class3_Sub4_Sub1 local36 = (Class3_Sub4_Sub1) local30;
				@Pc(46) int local46 = (local36.method4009() - 1) * 64 + 60;
				@Pc(54) int local54 = local36.anInt6833 - local46 >> 7;
				@Pc(62) int local62 = local36.anInt6835 - local46 >> 7;
				@Pc(69) int local69 = local46 + local36.anInt6833 >> 7;
				@Pc(76) int local76 = local46 + local36.anInt6835 >> 7;
				if (local54 <= arg0 && local62 <= arg1 && local69 >= arg0 && arg1 <= local76) {
					@Pc(114) int local114 = (local76 + 1 - arg1) * (-arg0 + 1 + local69);
					if (local114 > local23) {
						local23 = local114;
						local21 = local36;
					}
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BII)Z")
	public static boolean method3932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
	public static void method3933() {
		if (Static290.anInt4777 == 6) {
			Static312.method4252(false);
		} else if (Static345.anInt5892 > 0) {
			Static312.method4252(Static137.aBoolean469);
		} else {
			Static283.aClass160_2 = Static375.aClass160_3;
			Static375.aClass160_3 = null;
			Static37.method5022(12);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!sv;Z)Lclient!st;")
	public static Class231 method3934(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(14) Class231 local14 = new Class231();
		local14.anInt6249 = arg0.method3555();
		local14.aClass2_Sub5_Sub17_1 = Static216.aClass219_1.method4730(local14.anInt6249);
		return local14;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IB)I")
	public static int method3935(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static433.method5451(arg0);
	}
}
