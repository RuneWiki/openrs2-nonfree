import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "J")
	public static long aLong242;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BII)V")
	public static void method6907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub6_Sub12 local16 = Static636.method8647(6, (long) arg1);
		local16.method6239();
		local16.anInt6936 = arg0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZZII)V")
	public static void method6910(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static625.aClass254_156.anInt6802 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(27) Class22 local27 = Static97.aClass328_2.method7810(arg5);
			if (local27 == null || arg2 != local27.method372()) {
				return;
			}
			if (local27.method372()) {
				local18 = local27.aString1;
			} else {
				local16 = local27.anInt376;
			}
		}
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static543.aClass37_2.anInt613; local62++) {
			@Pc(69) Class203 local69 = Static543.aClass37_2.method605(local62);
			if ((!arg3 || local69.aBoolean419) && local69.anInt4849 == -1 && local69.anInt4845 == -1 && local69.anInt4855 == -1 && local69.anInt4859 == 0 && local69.aString52.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg2) {
						if (!arg1.equals(local69.method4421(local18, arg5))) {
							continue;
						}
					} else if (arg4 != local69.method4411(arg5, local16)) {
						continue;
					}
				}
				if (local60 >= 250) {
					Static354.anInt5659 = -1;
					Static727.aShortArray149 = null;
					return;
				}
				if (local14.length <= local60) {
					@Pc(177) short[] local177 = new short[local14.length * 2];
					for (@Pc(179) int local179 = 0; local179 < local60; local179++) {
						local177[local179] = local14[local179];
					}
					local14 = local177;
				}
				local14[local60++] = (short) local62;
			}
		}
		Static727.aShortArray149 = local14;
		Static465.anInt7549 = 0;
		Static354.anInt5659 = local60;
		@Pc(230) String[] local230 = new String[Static354.anInt5659];
		for (@Pc(232) int local232 = 0; local232 < Static354.anInt5659; local232++) {
			local230[local232] = Static543.aClass37_2.method605(local14[local232]).aString52;
		}
		Static344.method4778(local230, Static727.aShortArray149);
		Static625.aClass254_156.method6096();
		Static625.aClass254_156.anInt6802 = 2;
	}
}
