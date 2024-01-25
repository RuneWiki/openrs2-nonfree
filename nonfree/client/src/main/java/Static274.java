import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!ic;")
	public static Class113 aClass113_84;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
	public static int anInt4341 = -1;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_142 = new Class151(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIBIIII)V")
	public static void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static335.method4287(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(24) int local24 = -arg2;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static106.anIntArrayArray46[arg0];
		@Pc(42) int local42 = arg5 - local15;
		Static298.method3891(local42, arg5 - arg2, local37, arg1);
		@Pc(55) int local55 = local15 + arg5;
		Static298.method3891(local55, local42, local37, arg3);
		Static298.method3891(arg2 + arg5, local55, local37, arg1);
		while (local10 < local21) {
			local31 += 2;
			local33 += 2;
			local24 += local31;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				Static28.anIntArray32[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(123) int[] local123;
			@Pc(129) int[] local129;
			@Pc(133) int local133;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(145) int local145;
			@Pc(149) int local149;
			if (local24 >= 0) {
				local21--;
				if (local15 > local21) {
					local123 = Static106.anIntArrayArray46[local21 + arg0];
					local129 = Static106.anIntArrayArray46[arg0 - local21];
					local133 = Static28.anIntArray32[local21];
					local137 = arg5 + local10;
					local141 = arg5 - local10;
					local145 = arg5 + local133;
					local149 = arg5 - local133;
					Static298.method3891(local149, local141, local123, arg1);
					Static298.method3891(local145, local149, local123, arg3);
					Static298.method3891(local137, local145, local123, arg1);
					Static298.method3891(local149, local141, local129, arg1);
					Static298.method3891(local145, local149, local129, arg3);
					Static298.method3891(local137, local145, local129, arg1);
				} else {
					local123 = Static106.anIntArrayArray46[local21 + arg0];
					local129 = Static106.anIntArrayArray46[arg0 - local21];
					local133 = arg5 + local10;
					local137 = arg5 - local10;
					Static298.method3891(local133, local137, local123, arg1);
					Static298.method3891(local133, local137, local129, arg1);
				}
				local24 -= local21 << 1;
			}
			local123 = Static106.anIntArrayArray46[arg0 + local10];
			local129 = Static106.anIntArrayArray46[arg0 - local10];
			local133 = arg5 + local21;
			local137 = arg5 - local21;
			if (local15 <= local10) {
				Static298.method3891(local133, local137, local123, arg1);
				Static298.method3891(local133, local137, local129, arg1);
			} else {
				local141 = local26 < local10 ? Static28.anIntArray32[local10] : local26;
				local145 = arg5 + local141;
				local149 = arg5 - local141;
				Static298.method3891(local149, local137, local123, arg1);
				Static298.method3891(local145, local149, local123, arg3);
				Static298.method3891(local133, local145, local123, arg1);
				Static298.method3891(local149, local137, local129, arg1);
				Static298.method3891(local145, local149, local129, arg3);
				Static298.method3891(local133, local145, local129, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public static void method3489() {
		for (@Pc(14) int local14 = 0; local14 < Static167.aClass210ArrayArray1.length; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static167.aClass210ArrayArray1[local14].length; local18++) {
				Static167.aClass210ArrayArray1[local14][local18] = Static211.aClass210_2;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	public static void method3491() {
		@Pc(13) Class167 local13 = Static250.aClass167_9;
		synchronized (Static250.aClass167_9) {
			Static250.aClass167_9.method3389();
		}
	}
}
