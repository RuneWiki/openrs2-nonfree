import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public static void method7957() {
		for (@Pc(8) int local8 = 0; local8 < Static521.aByteArrayArrayArray45.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static521.aByteArrayArrayArray45[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static521.aByteArrayArrayArray45[0][0].length; local16++) {
					Static521.aByteArrayArrayArray45[local8][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BILclient!r;Z)Lclient!bq;")
	public static Class40 method7958(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static510.anIntArray605 != null) {
			for (@Pc(23) int local23 = 0; local23 < Static510.anIntArray605.length; local23++) {
				if (arg0 == Static510.anIntArray605[local23]) {
					return Static231.aClass40Array1[local23];
				}
			}
		}
		@Pc(54) Class40 local54 = (Class40) Static418.aClass313_43.method6989((long) arg0);
		if (local54 != null) {
			if (arg2 && local54.aClass294_3 == null) {
				@Pc(66) Class294 local66 = Static461.method6506(Static312.aClass259_97, arg0);
				if (local66 == null) {
					return null;
				}
				local54.aClass294_3 = local66;
			}
			return local54;
		}
		@Pc(79) Class13[] local79 = Static596.method248(Static290.aClass259_87, arg0);
		if (local79 == null) {
			return null;
		}
		@Pc(88) Class294 local88 = Static461.method6506(Static312.aClass259_97, arg0);
		if (local88 == null) {
			return null;
		}
		if (arg2) {
			local54 = new Class40(arg1.method6225(local88, local79), local88);
		} else {
			local54 = new Class40(arg1.method6225(local88, local79));
		}
		Static418.aClass313_43.method6980((long) arg0, local54);
		return local54;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	public static void method7959() {
		if (Static527.aClass175_1 != null) {
			Static527.aClass175_1.method3943();
		}
		if (Static462.aThread5 == null) {
			return;
		}
		while (true) {
			try {
				Static462.aThread5.join();
				break;
			} catch (@Pc(14) InterruptedException local14) {
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!lo;IIIII)V")
	public static void method7960(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static89.anInt8689) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static496.anInt8369) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static357.anInt6390 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class346 local62 = Static389.aClass346ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static421.aClass67Array7[local17].method6707(local32, local23) + Static421.aClass67Array7[local17].method6707(local32, local23 + 1) + Static421.aClass67Array7[local17].method6707(local32 + 1, local23) + Static421.aClass67Array7[local17].method6707(local32 + 1, local23 + 1)) / 4 - (Static421.aClass67Array7[arg1].method6707(arg3, arg2) + Static421.aClass67Array7[arg1].method6707(arg3, arg2 + 1) + Static421.aClass67Array7[arg1].method6707(arg3 + 1, arg2) + Static421.aClass67Array7[arg1].method6707(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class6_Sub1_Sub3 local151 = local62.aClass6_Sub1_Sub3_2;
									@Pc(154) Class6_Sub1_Sub3 local154 = local62.aClass6_Sub1_Sub3_1;
									if (local151 != null && local151.method7330()) {
										arg0.method7325(local1, (local23 - arg2) * Static33.anInt857 + (1 - arg4) * Static81.anInt1767, Static356.aClass100_8, local151, local148, (local32 - arg3) * Static33.anInt857 + (1 - arg5) * Static81.anInt1767);
									}
									if (local154 != null && local154.method7330()) {
										arg0.method7325(local1, (local23 - arg2) * Static33.anInt857 + (1 - arg4) * Static81.anInt1767, Static356.aClass100_8, local154, local148, (local32 - arg3) * Static33.anInt857 + (1 - arg5) * Static81.anInt1767);
									}
									for (@Pc(227) Class153 local227 = local62.aClass153_3; local227 != null; local227 = local227.aClass153_1) {
										@Pc(231) Class6_Sub1_Sub1 local231 = local227.aClass6_Sub1_Sub1_1;
										if (local231 != null && local231.method7330() && (local23 == local231.aShort85 || local23 == local3) && (local32 == local231.aShort83 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort86 + 1 - local231.aShort85;
											@Pc(268) int local268 = local231.aShort84 + 1 - local231.aShort83;
											arg0.method7325(local1, (local231.aShort85 - arg2) * Static33.anInt857 + (local260 - arg4) * Static81.anInt1767, Static356.aClass100_8, local231, local148, (local231.aShort83 - arg3) * Static33.anInt857 + (local268 - arg5) * Static81.anInt1767);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
