import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray36;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array11;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt5932;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([IZLclient!ad;BII)Lclient!ah;")
	public static Class11_Sub1_Sub1 method4947(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean31 || Static260.method4582(arg3) && Static260.method4582(arg2)) {
			return new Class11_Sub1_Sub1(arg1, 3553, arg3, arg2, false, arg0);
		} else if (arg1.aBoolean40) {
			return new Class11_Sub1_Sub1(arg1, 34037, arg3, arg2, false, arg0);
		} else {
			return new Class11_Sub1_Sub1(arg1, arg3, arg2, Static483.method7134(arg3), Static483.method7134(arg2), arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method4948() {
		Static31.method809(Static166.aClass245_12);
		Static339.anInt5664++;
		if (Static489.aBoolean645 && Static509.aBoolean661) {
			@Pc(33) int local33 = Static35.aClass54_1.method4074();
			@Pc(37) int local37 = Static35.aClass54_1.method4071();
			local33 -= Static21.anInt706;
			local37 -= Static392.anInt7212;
			if (Static495.anInt5639 > local33) {
				local33 = Static495.anInt5639;
			}
			if (Static495.anInt5639 + Static143.aClass245_6.anInt7249 < local33 + Static166.aClass245_12.anInt7249) {
				local33 = Static143.aClass245_6.anInt7249 + Static495.anInt5639 - Static166.aClass245_12.anInt7249;
			}
			if (Static282.anInt5795 > local37) {
				local37 = Static282.anInt5795;
			}
			if (local37 + Static166.aClass245_12.anInt7229 > Static282.anInt5795 + Static143.aClass245_6.anInt7229) {
				local37 = Static143.aClass245_6.anInt7229 + Static282.anInt5795 - Static166.aClass245_12.anInt7229;
			}
			@Pc(107) int local107 = local33 + Static143.aClass245_6.anInt7268 - Static495.anInt5639;
			@Pc(116) int local116 = local37 + Static143.aClass245_6.anInt7309 - Static282.anInt5795;
			@Pc(131) Class3_Sub21 local131;
			if (Static35.aClass54_1.method4075()) {
				if (Static339.anInt5664 > Static166.aClass245_12.anInt7302) {
					@Pc(203) int local203 = local33 - Static282.anInt5796;
					@Pc(208) int local208 = local37 - Static89.anInt1948;
					if (local203 > Static166.aClass245_12.anInt7310 || local203 < -Static166.aClass245_12.anInt7310 || local208 > Static166.aClass245_12.anInt7310 || -Static166.aClass245_12.anInt7310 > local208) {
						Static468.aBoolean618 = true;
					}
				}
				if (Static166.aClass245_12.anObjectArray28 != null && Static468.aBoolean618) {
					local131 = new Class3_Sub21();
					local131.aClass245_8 = Static166.aClass245_12;
					local131.anInt4199 = local116;
					local131.anInt4201 = local107;
					local131.anObjectArray4 = Static166.aClass245_12.anObjectArray28;
					Static60.method1227(local131);
				}
			} else {
				if (Static468.aBoolean618) {
					Static320.method5152();
					if (Static166.aClass245_12.anObjectArray20 != null) {
						local131 = new Class3_Sub21();
						local131.anObjectArray4 = Static166.aClass245_12.anObjectArray20;
						local131.anInt4201 = local107;
						local131.aClass245_9 = Static143.aClass245_5;
						local131.aClass245_8 = Static166.aClass245_12;
						local131.anInt4199 = local116;
						Static60.method1227(local131);
					}
					if (Static143.aClass245_5 != null && Static63.method1280(Static166.aClass245_12) != null) {
						Static265.method4651(Static143.aClass245_5, Static166.aClass245_12);
					}
				} else if ((Static19.anInt703 == 1 || Static10.method637()) && Static179.anInt4933 > 2) {
					Static432.method6574(Static89.anInt1948 + Static392.anInt7212, Static282.anInt5796 + Static21.anInt706);
				} else if (Static376.method7297()) {
					Static432.method6574(Static89.anInt1948 + Static392.anInt7212, Static282.anInt5796 + Static21.anInt706);
				}
				Static166.aClass245_12 = null;
			}
		} else if (Static339.anInt5664 > 1) {
			Static166.aClass245_12 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public static void method4950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass6_Sub2_2 != null) {
			local7.aClass6_Sub2_2 = null;
		}
		if (local7.aClass6_Sub2_3 != null) {
			local7.aClass6_Sub2_3 = null;
		}
	}
}
