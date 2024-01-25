import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "Lclient!bl;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!ni", name = "M", descriptor = "Lclient!pu;")
	public static final Class286 aClass286_1 = new Class286();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
	public static void method5532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg0 - arg1;
		@Pc(18) int local18 = arg4 - arg2;
		if (local14 == 0) {
			if (local18 != 0) {
				Static201.method3043(arg2, arg1, arg4, arg3);
			}
		} else if (local18 == 0) {
			Static448.method6080(arg1, arg0, arg2, arg3);
		} else {
			@Pc(50) int local50 = (local18 << 12) / local14;
			@Pc(58) int local58 = arg2 - (arg1 * local50 >> 12);
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (arg1 < Static300.anInt5091) {
				local67 = Static300.anInt5091;
				local75 = (Static300.anInt5091 * local50 >> 12) + local58;
			} else if (Static629.anInt10412 >= arg1) {
				local75 = arg2;
				local67 = arg1;
			} else {
				local67 = Static629.anInt10412;
				local75 = (Static629.anInt10412 * local50 >> 12) + local58;
			}
			@Pc(104) int local104;
			@Pc(112) int local112;
			if (arg0 < Static300.anInt5091) {
				local104 = Static300.anInt5091;
				local112 = (Static300.anInt5091 * local50 >> 12) + local58;
			} else if (Static629.anInt10412 < arg0) {
				local104 = Static629.anInt10412;
				local112 = local58 + (Static629.anInt10412 * local50 >> 12);
			} else {
				local104 = arg0;
				local112 = arg4;
			}
			if (local112 < Static617.anInt6260) {
				local104 = (Static617.anInt6260 - local58 << 12) / local50;
				local112 = Static617.anInt6260;
			} else if (Static229.anInt4089 < local112) {
				local112 = Static229.anInt4089;
				local104 = (Static229.anInt4089 - local58 << 12) / local50;
			}
			if (Static617.anInt6260 > local75) {
				local67 = (Static617.anInt6260 - local58 << 12) / local50;
				local75 = Static617.anInt6260;
			} else if (Static229.anInt4089 < local75) {
				local75 = Static229.anInt4089;
				local67 = (Static229.anInt4089 - local58 << 12) / local50;
			}
			Static473.method6295(local104, local112, arg3, local75, local67);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;CLjava/lang/String;)Ljava/lang/String;")
	public static String method5533(@OriginalArg(1) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(21) int local21 = 0;
			while (true) {
				local21 = arg0.indexOf(13, local21);
				if (local21 < 0) {
					break;
				}
				local21++;
				local13 += local17;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local13);
		@Pc(50) int local50 = 0;
		while (true) {
			@Pc(55) int local55 = arg0.indexOf(13, local50);
			if (local55 < 0) {
				local48.append(arg0.substring(local50));
				return local48.toString();
			}
			local48.append(arg0.substring(local50, local55));
			local50 = local55 + 1;
			local48.append(arg1);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BZ)I")
	public static int method5534(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static471.anInt7481;
		if (local5 == 0) {
			return arg0 ? 0 : Static212.anInt3685;
		} else if (local5 == 1) {
			return Static212.anInt3685;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
