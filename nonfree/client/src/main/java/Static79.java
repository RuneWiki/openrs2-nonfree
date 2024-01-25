import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!b;")
	public static Class20 aClass20_20;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!jj;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt1634 = -1;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "[I")
	public static final int[] anIntArray162 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!us;")
	public static final Class234 aClass234_35 = new Class234(14, 4);

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Z")
	public static boolean aBoolean130 = true;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method1316() {
		Static278.aClass155_6.method4899(((float) Static164.aClass154_Sub1_1.anInt6069 * 0.1F + 0.7F) * 1.1523438F);
		Static278.aClass155_6.method4881(Static103.anInt2049, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static278.aClass155_6.method4915(Static162.anInt2896, -1);
		Static278.aClass155_6.method4907(Static118.aClass8_3);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V")
	public static void method1319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static170.anInt2978 = arg4;
		Static383.anInt6417 = arg5;
		Static226.anInt3991 = arg3;
		Static50.anInt1079 = arg0;
		Static175.anInt3064 = arg1;
		Static162.anInt2897 = arg2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public static boolean method1320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static203.anInt3627; local1++) {
			@Pc(6) Class80 local6 = Static165.aClass80Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1995 == 1) {
				local15 = local6.anInt1979 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1986 + (local6.anInt1997 * local15 >> 8);
					local37 = local6.anInt1985 + (local6.anInt1980 * local15 >> 8);
					local47 = local6.anInt1991 + (local6.anInt1984 * local15 >> 8);
					local57 = local6.anInt1982 + (local6.anInt1978 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1995 == 2) {
				local15 = arg0 - local6.anInt1979;
				if (local15 > 0) {
					local27 = local6.anInt1986 + (local6.anInt1997 * local15 >> 8);
					local37 = local6.anInt1985 + (local6.anInt1980 * local15 >> 8);
					local47 = local6.anInt1991 + (local6.anInt1984 * local15 >> 8);
					local57 = local6.anInt1982 + (local6.anInt1978 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1995 == 3) {
				local15 = local6.anInt1986 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1979 + (local6.anInt1993 * local15 >> 8);
					local37 = local6.anInt1996 + (local6.anInt1992 * local15 >> 8);
					local47 = local6.anInt1991 + (local6.anInt1984 * local15 >> 8);
					local57 = local6.anInt1982 + (local6.anInt1978 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1995 == 4) {
				local15 = arg2 - local6.anInt1986;
				if (local15 > 0) {
					local27 = local6.anInt1979 + (local6.anInt1993 * local15 >> 8);
					local37 = local6.anInt1996 + (local6.anInt1992 * local15 >> 8);
					local47 = local6.anInt1991 + (local6.anInt1984 * local15 >> 8);
					local57 = local6.anInt1982 + (local6.anInt1978 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1995 == 5) {
				local15 = arg1 - local6.anInt1991;
				if (local15 > 0) {
					local27 = local6.anInt1979 + (local6.anInt1993 * local15 >> 8);
					local37 = local6.anInt1996 + (local6.anInt1992 * local15 >> 8);
					local47 = local6.anInt1986 + (local6.anInt1997 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt1980 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
