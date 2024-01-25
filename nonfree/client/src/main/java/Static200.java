import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!li", name = "j", descriptor = "Lclient!fc;")
	public static Class71 aClass71_48;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public static int anInt3681;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_115 = new Class41(29, -1);

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_116 = new Class41(40, 2);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)I")
	public static int method3344(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lclient!q;")
	public static Class183 method3345(@OriginalArg(1) int arg0) {
		@Pc(10) Class183 local10 = (Class183) Static161.aClass154_18.method3751((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static366.aClass71_87.method1555(0, arg0);
		local10 = new Class183();
		if (local20 != null) {
			local10.method4384(new Class2_Sub13(local20));
		}
		local10.method4388();
		Static161.aClass154_18.method3745((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
	public static int method3347() {
		if (Static243.aClass155_26 == null) {
			if (!Static48.aBoolean87 && Static379.anInt1192 > 0) {
				if (Static251.aBoolean337 && Static129.aClass149_1.method3685(81) && Static379.anInt1192 > 2) {
					return ((Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243.aClass2_243).anInt543;
				}
				return ((Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243).anInt543;
			}
			@Pc(23) int local23 = Static138.aClass78_1.method1804();
			@Pc(29) int local29 = Static138.aClass78_1.method1808();
			@Pc(31) int local31 = Static8.anInt189;
			@Pc(33) int local33 = Static40.anInt6591;
			@Pc(35) int local35 = Static300.anInt5403;
			if (local23 > local31 && local23 < local31 + local35) {
				@Pc(45) int local45 = -1;
				@Pc(64) int local64;
				for (@Pc(47) int local47 = 0; local47 < Static379.anInt1192; local47++) {
					if (Static372.aBoolean487) {
						local64 = (Static379.anInt1192 - local47 - 1) * 16 + local33 + 33;
						if (local29 > local64 - 13 && local64 + 3 >= local29) {
							local45 = local47;
						}
					} else {
						local64 = (Static379.anInt1192 - local47 - 1) * 16 + local33 + 31;
						if (local64 - 13 < local29 && local64 + 3 >= local29) {
							local45 = local47;
						}
					}
				}
				if (local45 != -1) {
					local64 = 0;
					@Pc(125) Class150 local125 = new Class150(Static66.aClass210_43);
					for (@Pc(130) Class2_Sub7 local130 = (Class2_Sub7) local125.method3700(); local130 != null; local130 = (Class2_Sub7) local125.method3698()) {
						if (local45 == local64++) {
							return local130.anInt543;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
	public static void method3348(@OriginalArg(1) int arg0) {
		Static386.method1336();
		Static260.method4047();
		Static135.method2370(true, arg0);
		Static163.method2691(Static304.aClass82_4, Static382.aClass71_89, Static119.aClass71_25);
		Static283.method4366(Static304.aClass82_4, Static119.aClass71_25);
		Static340.method5227(Static357.aClass5Array2);
		Static172.method2808();
		Static303.method4753();
		if (Static344.anInt6327 == 10) {
			Static204.method3427(false);
		} else if (Static344.anInt6327 == 30) {
			Static345.method5253(25);
		} else if (Static344.anInt6327 == 5) {
			Static314.method4885(Static119.aClass71_25, Static304.aClass82_4);
		}
	}
}
