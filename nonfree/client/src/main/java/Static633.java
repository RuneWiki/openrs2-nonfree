import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_256 = new Class215(97, 0);

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	public static int anInt10995 = 1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method9180() {
		if (Static107.aFileOutputStream3 != null) {
			try {
				Static107.aFileOutputStream3.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static107.aFileOutputStream3 = null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method9182(@OriginalArg(0) Class20 arg0) {
		if (Static104.anInt2861 != Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 && (Static395.aClass100ArrayArrayArray3 != null && Static243.method4515(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, arg0))) {
			Static104.anInt2861 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!jb;Z)V")
	public static void method9183(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort118; local2 <= arg0.aShort121; local2++) {
			for (@Pc(6) int local6 = arg0.aShort120; local6 <= arg0.aShort119; local6++) {
				@Pc(16) Class100 local16 = Static395.aClass100ArrayArrayArray3[arg0.aByte132][local2][local6];
				if (local16 != null) {
					@Pc(21) Class243 local21 = local16.aClass243_1;
					@Pc(23) Class243 local23 = null;
					while (local21 != null) {
						if (local21.aClass3_Sub1_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass243_1 = local21.aClass243_3;
							} else {
								local23.aClass243_3 = local21.aClass243_3;
							}
							local21.method6494();
							break;
						}
						local23 = local21;
						local21 = local21.aClass243_3;
					}
				}
			}
		}
		if (!arg1) {
			Static452.method7100(arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)Lclient!es;")
	public static Class100 method9184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static395.aClass100ArrayArrayArray3[0][arg1][arg2] != null && Static395.aClass100ArrayArrayArray3[0][arg1][arg2].aClass100_1 != null;
			if (local28 && arg0 >= Static462.anInt8470 - 1) {
				return null;
			}
			Static454.method7117(arg0, arg1, arg2);
		}
		return Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!cea;)Lclient!um;")
	public static Class110_Sub1 method9185(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(7) Class110 local7 = Static240.method4487(arg0);
		@Pc(13) int local13 = arg0.method8326();
		@Pc(17) int local17 = arg0.method8326();
		@Pc(25) int local25 = arg0.method8326();
		@Pc(31) int local31 = arg0.method8326();
		@Pc(35) int local35 = arg0.method8326();
		@Pc(39) int local39 = arg0.method8326();
		return new Class110_Sub1(local7.aClass309_11, local7.aClass86_10, local7.anInt7742, local7.anInt7733, local7.anInt7743, local7.anInt7736, local7.anInt7739, local7.anInt7738, local7.anInt7735, local13, local17, local25, local31, local35, local39);
	}
}
