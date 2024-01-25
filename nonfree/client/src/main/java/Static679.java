import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!wv", name = "y", descriptor = "D")
	public static double aDouble36;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_215 = new Class126(36, 6);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIII)V")
	public static void method8752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static400.method5735(Static303.anInt9951, arg1 + arg3, Static408.anInt6951);
		@Pc(35) int local35 = Static400.method5735(Static303.anInt9951, arg1 - arg3, Static408.anInt6951);
		Static526.method7369(Static299.anIntArrayArray58[arg2], local27, local35, arg0);
		while (local9 > local7) {
			local19 += 2;
			local17 += local19;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(82) int local82;
			@Pc(91) int local91;
			if (local17 > 0) {
				local9--;
				local17 -= local9 << 1;
				local64 = arg2 - local9;
				local68 = arg2 + local9;
				if (local68 >= Static255.anInt4818 && local64 <= Static658.anInt10079) {
					local82 = Static400.method5735(Static303.anInt9951, arg1 + local7, Static408.anInt6951);
					local91 = Static400.method5735(Static303.anInt9951, arg1 - local7, Static408.anInt6951);
					if (local68 <= Static658.anInt10079) {
						Static526.method7369(Static299.anIntArrayArray58[local68], local82, local91, arg0);
					}
					if (local64 >= Static255.anInt4818) {
						Static526.method7369(Static299.anIntArrayArray58[local64], local82, local91, arg0);
					}
				}
			}
			local7++;
			local64 = arg2 - local7;
			local68 = arg2 + local7;
			if (Static255.anInt4818 <= local68 && local64 <= Static658.anInt10079) {
				local82 = Static400.method5735(Static303.anInt9951, local9 + arg1, Static408.anInt6951);
				local91 = Static400.method5735(Static303.anInt9951, arg1 - local9, Static408.anInt6951);
				if (Static658.anInt10079 >= local68) {
					Static526.method7369(Static299.anIntArrayArray58[local68], local82, local91, arg0);
				}
				if (Static255.anInt4818 <= local64) {
					Static526.method7369(Static299.anIntArrayArray58[local64], local82, local91, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z")
	public static boolean method8753(@OriginalArg(0) int arg0) {
		return arg0 == 23 || arg0 == 2 || arg0 == 1001 || arg0 == 8 || arg0 == 6;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)V")
	public static void method8755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub6_Sub7 local14 = Static198.method3146((long) arg1, 6);
		local14.method1712();
		local14.anInt1790 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public static void method8756() {
		if (Static287.anApplet2 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static287.anApplet2.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static131.method2268() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static685.method3972("document.cookie=\"" + local30 + "\"", Static287.anApplet2);
		} catch (@Pc(44) Throwable local44) {
		}
	}
}
