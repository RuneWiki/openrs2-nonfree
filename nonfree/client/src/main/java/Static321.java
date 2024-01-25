import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!oa;")
	public static Class59 aClass59_4;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Z")
	public static boolean aBoolean480 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Lclient!eh;")
	public static Class7_Sub4 method4376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_Sub4_2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)Lclient!ob;")
	public static Class7_Sub2_Sub3 method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class118 local11 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class7_Sub2_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class179 local27 = local11.aClass179_2; local27 != null; local27 = local27.aClass179_3) {
			@Pc(31) Class7_Sub2 local31 = local27.aClass7_Sub2_2;
			if (local31 instanceof Class7_Sub2_Sub3) {
				@Pc(37) Class7_Sub2_Sub3 local37 = (Class7_Sub2_Sub3) local31;
				@Pc(47) int local47 = (local37.method3499() - 1) * 64 + 60;
				@Pc(54) int local54 = local37.anInt4318 - local47 >> 7;
				@Pc(61) int local61 = local37.anInt4321 - local47 >> 7;
				@Pc(68) int local68 = local47 + local37.anInt4318 >> 7;
				@Pc(75) int local75 = local47 + local37.anInt4321 >> 7;
				if (local54 <= arg1 && arg2 >= local61 && local68 >= arg1 && local75 >= arg2) {
					@Pc(108) int local108 = (local75 + 1 - arg2) * (local68 + 1 + -arg1);
					if (local108 > local19) {
						local17 = local37;
						local19 = local108;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4378(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static295.method4137(Static14.method321(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method4379() {
		for (@Pc(8) Class3_Sub17 local8 = (Class3_Sub17) Static301.aClass243_16.method5208(); local8 != null; local8 = (Class3_Sub17) Static301.aClass243_16.method5203()) {
			if (local8.anInt2911 > 0) {
				local8.anInt2911--;
			}
			if (local8.anInt2911 != 0) {
				if (local8.anInt2916 > 0) {
					local8.anInt2916--;
				}
				if (local8.anInt2916 == 0 && local8.anInt2917 >= 1 && local8.anInt2910 >= 1 && Static40.anInt1089 - 2 >= local8.anInt2917 && local8.anInt2910 <= Static44.anInt7276 - 2 && (local8.anInt2912 < 0 || Static451.method5938(local8.anInt2909, local8.anInt2912))) {
					Static375.method5188(-1, local8.anInt2910, local8.anInt2917, local8.anInt2914, local8.anInt2906, local8.anInt2909, local8.anInt2912, local8.anInt2915);
					local8.anInt2916 = -1;
					if (local8.anInt2912 == local8.anInt2907 && local8.anInt2907 == -1) {
						local8.method5977();
					} else if (local8.anInt2912 == local8.anInt2907 && local8.anInt2914 == local8.anInt2913 && local8.anInt2909 == local8.anInt2918) {
						local8.method5977();
					}
				}
			} else if (local8.anInt2907 < 0 || Static451.method5938(local8.anInt2918, local8.anInt2907)) {
				Static375.method5188(-1, local8.anInt2910, local8.anInt2917, local8.anInt2913, local8.anInt2906, local8.anInt2918, local8.anInt2907, local8.anInt2915);
				local8.method5977();
			}
		}
	}
}
