import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public static int anInt1851 = 0;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public static int anInt1854 = 0;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	public static void method1698() {
		Static276.aClass94_61.method2952();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1707(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(43) StringBuffer local43 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local43.append(Static18.aCharArray1[(int) (local56 - arg0 * 37L)]);
			}
			return local43.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(B)I")
	public static int method1708() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static496.aClass104_4.aBoolean290 && !Static496.aClass104_4.aBoolean288) {
			local7 = true;
			if (Static18.aClass6_Sub38_1.anInt7891 < 512 && Static18.aClass6_Sub38_1.anInt7891 != 0) {
				local7 = false;
			}
			if (Static161.aString38.startsWith("win")) {
				local11 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (Static633.aBoolean839) {
			local7 = false;
		}
		if (Static169.aBoolean303) {
			local9 = false;
		}
		if (Static129.aBoolean244) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static557.method7835();
		}
		@Pc(65) int local65 = -1;
		@Pc(67) int local67 = -1;
		if (local7) {
			try {
				local65 = Static128.method2646(1000, 2);
			} catch (@Pc(76) Exception local76) {
			}
		}
		@Pc(79) int local79 = -1;
		if (local11) {
			try {
				local79 = Static128.method2646(1000, 3);
				if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 3) {
					@Pc(95) Class77 local95 = Static467.aClass5_13.method6162();
					@Pc(100) long local100 = local95.aLong72 & 0xFFFFFFFFFFFFL;
					@Pc(103) int local103 = local95.anInt3030;
					if (local103 == 4318) {
						local9 &= local100 >= 64425238954L;
					} else if (local103 == 4098) {
						local9 &= local100 >= 60129613779L;
					}
				}
			} catch (@Pc(141) Exception local141) {
			}
		}
		if (local9) {
			try {
				local67 = Static128.method2646(1000, 1);
			} catch (@Pc(156) Exception local156) {
			}
		}
		if (local65 == -1 && local67 == -1 && local79 == -1) {
			return Static557.method7835();
		}
		local79 = (int) ((float) local79 * 1.1F);
		local67 = (int) ((float) local67 * 1.1F);
		if (local79 < local65 && local65 > local67) {
			return Static150.method2981(local65);
		} else if (local79 <= local67) {
			return Static254.method4487(local67, 1);
		} else {
			return Static254.method4487(local79, 3);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)I")
	public static int method1709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static382.anInt7220 < 100) {
			return -2;
		}
		@Pc(19) int local19 = -2;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg1 - Static491.anInt7783;
		@Pc(31) int local31 = arg2 - Static491.anInt7785;
		for (@Pc(38) Class6_Sub48 local38 = (Class6_Sub48) Static491.aClass163_49.method4966(); local38 != null; local38 = (Class6_Sub48) Static491.aClass163_49.method4965()) {
			if (arg0 == local38.anInt9722) {
				@Pc(47) int local47 = local38.anInt9726;
				@Pc(50) int local50 = local38.anInt9721;
				@Pc(60) int local60 = local47 + Static491.anInt7783 << 14 | Static491.anInt7785 + local50;
				@Pc(79) int local79 = (local31 - local50) * (local31 + -local50) + (local26 - local47) * (local26 - local47);
				if (local19 < 0 || local79 < local21) {
					local19 = local60;
					local21 = local79;
				}
			}
		}
		return local19;
	}
}
