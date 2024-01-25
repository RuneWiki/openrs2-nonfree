import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public static int anInt6601;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_188 = new Class34("K", "T", "K", "K");

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "Z")
	public static boolean aBoolean648 = true;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Z")
	public static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_189 = new Class34("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method5525() {
		@Pc(16) Class90 local16 = null;
		try {
			@Pc(20) Class162 local20 = Static15.aClass143_1.method3885();
			while (local20.anInt4801 == 0) {
				Static190.method3690(1L);
			}
			if (local20.anInt4801 == 1) {
				local16 = (Class90) local20.anObject5;
				@Pc(47) byte[] local47 = new byte[(int) local16.method2567()];
				@Pc(62) int local62;
				for (@Pc(49) int local49 = 0; local49 < local47.length; local49 += local62) {
					local62 = local16.method2566(local49, local47.length - local49, local47);
					if (local62 == -1) {
						throw new IOException("EOF");
					}
				}
				Static342.method2768(new Class1_Sub8(local47));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local16 != null) {
				local16.method2565();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIII)Lclient!ki;")
	public static Class17_Sub1_Sub1 method5533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class194 local11 = Static77.aClass194ArrayArrayArray1[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class17_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class126 local22 = local11.aClass126_2; local22 != null; local22 = local22.aClass126_1) {
			@Pc(26) Class17_Sub1 local26 = local22.aClass17_Sub1_1;
			if (local26 instanceof Class17_Sub1_Sub1) {
				@Pc(32) Class17_Sub1_Sub1 local32 = (Class17_Sub1_Sub1) local26;
				@Pc(42) int local42 = (local32.method4318() - 1) * 64 + 60;
				@Pc(50) int local50 = local32.anInt5109 - local42 >> 7;
				@Pc(57) int local57 = local32.anInt5108 - local42 >> 7;
				@Pc(65) int local65 = local32.anInt5109 + local42 >> 7;
				@Pc(72) int local72 = local42 + local32.anInt5108 >> 7;
				if (arg0 >= local50 && arg1 >= local57 && local65 >= arg0 && arg1 <= local72) {
					@Pc(110) int local110 = (local65 + 1 - arg0) * (-arg1 + local72 + 1);
					if (local110 > local19) {
						local17 = local32;
						local19 = local110;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!bg;)V")
	public static void method5534(@OriginalArg(1) Class1_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method4528();
		Static231.aClass50Array1 = new Class50[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static231.aClass50Array1[local14] = new Class50();
			Static231.aClass50Array1[local14].anInt1767 = arg0.method4528();
			Static231.aClass50Array1[local14].aString20 = arg0.method4540();
		}
		Static285.anInt4459 = arg0.method4528();
		Static351.anInt6705 = arg0.method4528();
		Static227.anInt4728 = arg0.method4528();
		Static85.aClass104_Sub1Array4 = new Class104_Sub1[Static351.anInt6705 + 1 - Static285.anInt4459];
		for (@Pc(61) int local61 = 0; local61 < Static227.anInt4728; local61++) {
			@Pc(67) int local67 = arg0.method4528();
			@Pc(75) Class104_Sub1 local75 = Static85.aClass104_Sub1Array4[local67] = new Class104_Sub1();
			local75.anInt4708 = arg0.method4532();
			local75.anInt4711 = arg0.method4545();
			local75.anInt4715 = local67 + Static285.anInt4459;
			local75.aString48 = arg0.method4540();
			local75.aString47 = arg0.method4540();
		}
		Static121.anInt2759 = arg0.method4545();
		Static195.aBoolean384 = true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZZZ)I")
	public static int method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class1_Sub19 local10 = Static274.method4804(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray247.length; local23++) {
			if (local10.anIntArray247[local23] >= 0 && Static345.anInt6609 > local10.anIntArray247[local23]) {
				@Pc(43) Class111 local43 = Static20.method561(local10.anIntArray247[local23]);
				@Pc(52) int local52 = local43.method2997(arg1, Static357.method3867(arg1).anInt3392);
				if (arg2) {
					local16 += local52 * local10.anIntArray248[local23];
				} else {
					local16 += local52;
				}
			}
		}
		return local16;
	}
}
