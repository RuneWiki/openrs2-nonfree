import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
	public static int anInt7508 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!wt;ILclient!qa;Lclient!di;)V")
	public static void method6706(@OriginalArg(0) Class1_Sub51 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class65 arg2) {
		@Pc(10) Class104 local10 = arg2.method1822(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.c();
		if (local16 < local10.la()) {
			local16 = local10.la();
		}
		@Pc(32) int local32 = arg0.anInt9567;
		@Pc(35) int local35 = arg0.anInt9570;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(78) int local78;
		if (arg2.aString37 != null) {
			local37 = Static379.aClass96_12.method2371(arg2.aString37, Static513.aStringArray37, null, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static513.aStringArray37[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static214.aClass66_6.method1833(local61);
				if (local78 > local39) {
					local39 = local78;
				}
			}
			local41 = local37 * Static214.aClass66_6.method1827() + Static214.aClass66_6.method1829() / 2;
		}
		local55 = local16 / 2 + arg0.anInt9567;
		@Pc(111) int local111 = arg0.anInt9570;
		if (local16 + Static335.anInt4944 > local32) {
			local32 = Static335.anInt4944;
			local55 = local16 / 2 + Static335.anInt4944 + local39 / 2 + 10 + 5;
		} else if (local32 > Static335.anInt4937 - local16) {
			local55 = Static335.anInt4937 - local39 / 2 - local16 / 2 - 10 - 5;
			local32 = Static335.anInt4937 - local16;
		}
		if (local35 < Static335.anInt4942 + local16) {
			local111 = local16 / 2 + Static335.anInt4942 + 10;
			local35 = Static335.anInt4942;
		} else if (Static335.anInt4945 - local16 < local35) {
			local35 = Static335.anInt4945 - local16;
			local111 = Static335.anInt4945 - local41 - local16 / 2 - 10;
		}
		local78 = (int) (Math.atan2((double) (local32 - arg0.anInt9567), (double) (local35 - arg0.anInt9570)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7714((float) local32 + (float) local16 / 2.0F, (float) local35 + (float) local16 / 2.0F, 4096, local78);
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		if (arg2.aString37 != null) {
			local250 = local111;
			local248 = local55 - local39 / 2 - 5;
			local254 = local111 + local37 * Static214.aClass66_6.method1827() + 3;
			local252 = local248 + local39 + 10;
			if (arg2.anInt1912 != 0) {
				arg1.method7162(arg2.anInt1912, local252 - local248, local248, local111, local254 - local111);
			}
			if (arg2.anInt1896 != 0) {
				arg1.method7190(local111, local252 - local248, arg2.anInt1896, local254 - local111, local248);
			}
			for (@Pc(324) int local324 = 0; local324 < local37; local324++) {
				@Pc(330) String local330 = Static513.aStringArray37[local324];
				if (local324 < local37 - 1) {
					local330 = local330.substring(0, local330.length() - 4);
				}
				Static214.aClass66_6.method1831(arg1, local330, local55, local111, arg2.anInt1909);
				local111 += Static214.aClass66_6.method1827();
			}
		}
		if (arg2.anInt1903 == -1 && arg2.aString37 == null) {
			return;
		}
		@Pc(381) Class1_Sub6 local381 = new Class1_Sub6(arg0);
		local16 >>= 0x1;
		local381.anInt1401 = local254;
		local381.anInt1407 = local248;
		local381.anInt1406 = local35 - local16;
		local381.anInt1408 = local252;
		local381.anInt1404 = local250;
		local381.anInt1400 = local16 + local32;
		local381.anInt1405 = local32 - local16;
		local381.anInt1403 = local16 + local35;
		Static18.aClass295_4.method7533(local381);
	}
}
