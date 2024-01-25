import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	public static int anInt1163;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "([Lclient!cr;IZIZI)V")
	public static void method834(@OriginalArg(0) Class41[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(19) Class41 local19 = arg0[local13];
			if (local19 != null && arg2 == local19.anInt1663) {
				Static427.method5775(arg3, arg1, local19, arg4);
				Static34.method447(local19, arg1, arg4);
				if (local19.anInt1636 - local19.anInt1622 < local19.anInt1665) {
					local19.anInt1665 = local19.anInt1636 - local19.anInt1622;
				}
				if (local19.anInt1665 < 0) {
					local19.anInt1665 = 0;
				}
				if (local19.anInt1635 - local19.anInt1599 < local19.anInt1620) {
					local19.anInt1620 = local19.anInt1635 - local19.anInt1599;
				}
				if (local19.anInt1620 < 0) {
					local19.anInt1620 = 0;
				}
				if (local19.anInt1642 == 0) {
					Static115.method5068(arg3, local19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Lclient!tk;")
	public static Class2_Sub38 method835() {
		if (Static169.aClass265_27 == null || Static333.aClass247_1 == null) {
			return null;
		}
		Static333.aClass247_1.method5531(Static169.aClass265_27);
		@Pc(24) Class2_Sub38 local24 = (Class2_Sub38) Static333.aClass247_1.method5532();
		if (local24 == null) {
			return null;
		} else {
			@Pc(34) Class83 local34 = Static169.aClass173_3.method4022(local24.anInt6772);
			return local34 != null && local34.aBoolean198 && local34.method1708(Static169.anInterface11_2) ? local24 : Static322.method4608();
		}
	}
}
