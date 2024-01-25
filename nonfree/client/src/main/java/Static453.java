import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static final int anInt7580 = 12;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZBLjava/lang/String;I)Z")
	public static boolean method6002(@OriginalArg(2) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local29 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local44 >= '0' && local44 <= '9') {
				local73 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local73 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local73 = local44 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local29) {
				local73 = -local73;
			}
			@Pc(113) int local113 = local73 + local33 * 10;
			if (local113 / 10 != local33) {
				return false;
			}
			local33 = local113;
			local31 = true;
		}
		return local31;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	public static void method6003() {
		Static308.anInt5041 = 0;
		Static182.anInt3339 = 0;
		Static100.anInt1833 = 0;
		Static62.anInt1112 = 0;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public static void method6004() {
		@Pc(9) int[] local9 = new int[Static416.aClass64_2.anInt1669];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static416.aClass64_2.anInt1669; local13++) {
			@Pc(20) Class80 local20 = Static416.aClass64_2.method1372(local13);
			if (local20.anInt2001 >= 0 || local20.anInt2010 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static435.anIntArray545 = new int[local11];
		for (@Pc(48) int local48 = 0; local48 < local11; local48++) {
			Static435.anIntArray545[local48] = local9[local48];
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!hd;IZ)V")
	public static void method6005(@OriginalArg(0) Class110 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt2634 == 0 ? arg0.anInt2617 : arg0.anInt2634;
		@Pc(27) int local27 = arg0.anInt2596 == 0 ? arg0.anInt2590 : arg0.anInt2596;
		Static291.method3801(local15, Static412.aClass110ArrayArray2[arg0.anInt2675 >> 16], local27, arg1, arg0.anInt2675);
		if (arg0.aClass110Array1 != null) {
			Static291.method3801(local15, arg0.aClass110Array1, local27, arg1, arg0.anInt2675);
		}
		@Pc(60) Class4_Sub8 local60 = (Class4_Sub8) Static449.aClass67_37.method1429((long) arg0.anInt2675);
		if (local60 != null) {
			Static49.method642(local15, local60.anInt861, local27, arg1);
		}
	}
}
