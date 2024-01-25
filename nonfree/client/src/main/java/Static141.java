import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_22 = new Class26(200);

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public static int anInt2601 = 0;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
	public static int anInt2602 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)V")
	public static void method2173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class11_Sub4_Sub12 local10 = Static35.method512(14, arg1);
		local10.method3858();
		local10.anInt4390 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
	public static void method2176() {
		Static313.aClass11_Sub25_Sub1_5.method2454(118);
		for (@Pc(18) Class11_Sub41 local18 = (Class11_Sub41) Static197.aClass58_18.method1008(); local18 != null; local18 = (Class11_Sub41) Static197.aClass58_18.method1004()) {
			if (!local18.method5704()) {
				local18 = (Class11_Sub41) Static197.aClass58_18.method1008();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt6363 == 0) {
				Static66.method1709(local18, true, true);
			}
		}
		if (Static242.aClass137_17 != null) {
			Static69.method1039(Static242.aClass137_17);
			Static242.aClass137_17 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)I")
	public static int method2177(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BILclient!ms;I)V")
	public static void method2178(@OriginalArg(1) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) int arg2) {
		if (!Static103.aBoolean118) {
			@Pc(52) String local52;
			for (@Pc(45) int local45 = 9; local45 >= 5; local45--) {
				local52 = Static210.method3753(arg1, local45);
				if (local52 != null) {
					Static87.method1252(arg1.anInt4044, arg1.anInt4095, 1002, arg1.aString38, Static206.method3696(local45, arg1), (long) (local45 + 1), local52);
				}
			}
			local52 = Static201.method5713(arg1);
			if (local52 != null) {
				Static87.method1252(arg1.anInt4044, arg1.anInt4095, 9, arg1.aString38, arg1.anInt4097, 0L, local52);
			}
			for (@Pc(107) int local107 = 4; local107 >= 0; local107--) {
				@Pc(114) String local114 = Static210.method3753(arg1, local107);
				if (local114 != null) {
					Static87.method1252(arg1.anInt4044, arg1.anInt4095, 47, arg1.aString38, Static206.method3696(local107, arg1), (long) (local107 + 1), local114);
				}
			}
			if (Static42.method634(arg1).method4728()) {
				if (arg1.aString36 == null) {
					Static87.method1252(arg1.anInt4044, arg1.anInt4095, 2, "", -1, 0L, Static46.aClass117_18.method2684(Static230.anInt4634));
				} else {
					Static87.method1252(arg1.anInt4044, arg1.anInt4095, 2, "", -1, 0L, arg1.aString36);
				}
			}
		} else if (Static42.method634(arg1).method4724() && (Static335.anInt6393 & 0x20) != 0) {
			Static87.method1252(arg1.anInt4044, arg1.anInt4095, 6, Static63.aString10 + " -> " + arg1.aString38, Static320.anInt6202, 0L, Static110.aString39);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method2179() {
		@Pc(12) Class113 local12 = null;
		try {
			@Pc(16) Class2 local16 = Static77.aClass118_7.method2693();
			while (local16.anInt6 == 0) {
				Static244.method4311(1L);
			}
			if (local16.anInt6 == 1) {
				local12 = (Class113) local16.anObject1;
				@Pc(43) byte[] local43 = new byte[(int) local12.method2306()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local12.method2305(local45, local43, local43.length - local45);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static165.method2679(new Class11_Sub25(local43));
			}
		} catch (@Pc(86) Exception local86) {
		}
		try {
			if (local12 != null) {
				local12.method2307();
			}
		} catch (@Pc(93) Exception local93) {
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public static void method2180(@OriginalArg(1) int arg0) {
		@Pc(1) Class11_Sub4_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class77 local8 = Static129.aClass77Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static300.anInt5931; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static232.anInt4703; local15++) {
						local1 = local8.method4128(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class77 local41 = Static129.aClass77Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4122(local15, local12) - local41.method4122(local15, local12);
									@Pc(67) int local67 = local8.method4122(local15 + 1, local12) - local41.method4122(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4122(local15 + 1, local12 + 1) - local41.method4122(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4122(local15, local12 + 1) - local41.method4122(local15, local12 + 1);
									local41.method4127(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}
}
