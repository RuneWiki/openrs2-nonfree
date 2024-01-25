import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!mr;")
	public static final Class210 aClass210_1 = new Class210(0, 3, Static239.aClass161_16);

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Lclient!mr;")
	public static final Class210 aClass210_2 = new Class210(1, 3, Static239.aClass161_16);

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "Lclient!mr;")
	public static final Class210 aClass210_3 = new Class210(2, 4, Static239.aClass161_12);

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "Lclient!mr;")
	public static final Class210 aClass210_4 = new Class210(3, 1, Static239.aClass161_16);

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "Lclient!mr;")
	public static final Class210 aClass210_5 = new Class210(4, 2, Static239.aClass161_16);

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Lclient!mr;")
	public static final Class210 aClass210_6 = new Class210(5, 3, Static239.aClass161_16);

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Lclient!mr;")
	private static final Class210 aClass210_7 = new Class210(6, 4, Static239.aClass161_16);

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
	public static final int anInt5883 = Static564.method7583(16);

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_9 = new Class342(4, 1, 1, 1);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B[B)Z")
	public static boolean method5067(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class6_Sub21 local13 = new Class6_Sub21(arg0);
		@Pc(17) int local17 = local13.method6069();
		if (local17 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local13.method6069() == 1;
		if (local35) {
			Static154.method2909(local13);
		}
		Static393.method5767(local13);
		return true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public static void method5068() {
		Static523.method7187();
		Static587.aClass348ArrayArray1 = null;
		Static25.aClass14_1 = null;
		Static461.aClass26_6 = null;
		Static199.aClass26_5 = null;
		Static284.aClass26_4 = null;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)[Lclient!mr;")
	public static Class210[] method5069() {
		return new Class210[] { aClass210_1, aClass210_2, aClass210_3, aClass210_4, aClass210_5, aClass210_6, aClass210_7 };
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZI[Lclient!rr;I)V")
	public static void method5071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class292[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(14) int local14 = 0; local14 < arg3.length; local14++) {
			@Pc(20) Class292 local20 = arg3[local14];
			if (local20 != null && arg4 == local20.anInt7901) {
				Static438.method6241(arg0, arg2, arg1, local20);
				Static422.method6089(local20, arg1, arg0);
				if (local20.anInt7957 > local20.anInt7896 - local20.anInt7963) {
					local20.anInt7957 = local20.anInt7896 - local20.anInt7963;
				}
				if (local20.anInt7957 < 0) {
					local20.anInt7957 = 0;
				}
				if (local20.anInt7911 > local20.anInt7949 - local20.anInt7912) {
					local20.anInt7911 = local20.anInt7949 - local20.anInt7912;
				}
				if (local20.anInt7911 < 0) {
					local20.anInt7911 = 0;
				}
				if (local20.lb == 0) {
					Static339.method5265(arg2, local20);
				}
			}
		}
	}
}
