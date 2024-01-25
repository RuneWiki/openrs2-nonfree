import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!br", name = "T", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_10 = new Class200(84, 2);

	@OriginalMember(owner = "client!br", name = "Db", descriptor = "Lclient!eda;")
	public static final Class83 aClass83_4 = new Class83();

	@OriginalMember(owner = "client!br", name = "Fb", descriptor = "I")
	public static int anInt1497 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public static void method1478() {
		@Pc(7) Class175 local7 = null;
		try {
			local7 = Static211.method3582("2");
			@Pc(21) Class3_Sub3 local21 = new Class3_Sub3(Static445.anInt7952 * 6 + 3);
			local21.method4220(1);
			local21.method4201(Static445.anInt7952);
			for (@Pc(31) int local31 = 0; local31 < Static396.anIntArray394.length; local31++) {
				if (Static515.aBooleanArray24[local31]) {
					local21.method4201(local31);
					local21.method4265(Static396.anIntArray394[local31]);
				}
			}
			local7.method4464(local21.anInt4736, 0, local21.aByteArray54);
		} catch (@Pc(62) Exception local62) {
		}
		try {
			if (local7 != null) {
				local7.method4462();
			}
		} catch (@Pc(69) Exception local69) {
		}
		Static190.aLong102 = Static374.method6036();
		Static440.aBoolean552 = false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub3 local12 = new Class3_Sub3(arg3);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local12.method4238();
			if (local23 == 0) {
				return local7;
			}
			local14 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(104) Class299 local104;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local12.method4228();
										if (local42 == 0) {
											continue label68;
										}
										local12.method4225();
									}
									local42 = local12.method4228();
									if (local42 == 0) {
										continue label68;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local12.method4225() >> 2;
									local70 = arg4 + local60;
									local74 = arg0 + local54;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (local70 >= arg2 - 1);
					} while (arg1 - 1 <= local74);
					local104 = Static105.aClass302_1.method7466(local14);
				} while (local66 == 22 && Static262.aClass3_Sub27_12.aClass21_Sub22_1.method6900() == 0 && local104.anInt8641 == 0 && local104.anInt8637 != 1 && !local104.aBoolean603);
				local36 = true;
				if (!local104.method7402()) {
					local7 = false;
					Static365.anInt6937++;
				}
			}
		}
	}
}
