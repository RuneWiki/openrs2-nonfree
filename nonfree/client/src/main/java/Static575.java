import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;ILclient!vb;Lclient!ww;)V")
	public static void method7785(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class2_Sub46 arg1, @OriginalArg(3) Class366 arg2) {
		@Pc(10) Class39 local10 = arg2.method7993(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.E();
		if (local16 < local10.u()) {
			local16 = local10.u();
		}
		@Pc(28) int local28 = arg1.anInt9118;
		@Pc(31) int local31 = arg1.anInt9114;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg2.aString101 != null) {
			local33 = Static450.aClass294_11.method6721(arg2.aString101, Static370.aStringArray119, null, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static370.aStringArray119[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static16.aClass243_1.method5693(local57);
				if (local78 > local35) {
					local35 = local78;
				}
			}
			local37 = local33 * Static16.aClass243_1.method5691() + Static16.aClass243_1.method5692() / 2;
		}
		local51 = arg1.anInt9118 + local16 / 2;
		@Pc(112) int local112 = arg1.anInt9114;
		if (local28 < Static270.anInt1798 + local16) {
			local28 = Static270.anInt1798;
			local51 = local35 / 2 + Static270.anInt1798 + local16 / 2 + 5 + 10;
		} else if (local28 > Static270.anInt1795 - local16) {
			local51 = Static270.anInt1795 - local16 / 2 - local35 / 2 - 10 - 5;
			local28 = Static270.anInt1795 - local16;
		}
		if (local16 + Static270.anInt1796 > local31) {
			local112 = local16 / 2 + Static270.anInt1796 + 10;
			local31 = Static270.anInt1796;
		} else if (Static270.anInt1802 - local16 < local31) {
			local31 = Static270.anInt1802 - local16;
			local112 = Static270.anInt1802 - local37 - local16 / 2 - 10;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg1.anInt9118), (double) (local31 - arg1.anInt9114)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7857((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local78);
		@Pc(249) int local249 = -2;
		@Pc(251) int local251 = -2;
		@Pc(253) int local253 = -2;
		@Pc(263) int local263 = -2;
		if (arg2.aString101 != null) {
			local251 = local112;
			local249 = local51 - local35 / 2 - 5;
			local253 = local249 + local35 + 10;
			local263 = local112 + Static16.aClass243_1.method5691() * local33 + 3;
			if (arg2.anInt9631 != 0) {
				arg0.method6261(arg2.anInt9631, local249, local112, local263 - local112, local253 - local249);
			}
			if (arg2.anInt9637 != 0) {
				arg0.method6200(local253 - local249, local112, local263 - local112, local249, arg2.anInt9637);
			}
			for (@Pc(336) int local336 = 0; local336 < local33; local336++) {
				@Pc(342) String local342 = Static370.aStringArray119[local336];
				if (local336 < local33 - 1) {
					local342 = local342.substring(0, local342.length() - 4);
				}
				Static16.aClass243_1.method5690(arg0, local342, local51, local112, arg2.anInt9643);
				local112 += Static16.aClass243_1.method5691();
			}
		}
		if (arg2.anInt9648 == -1 && arg2.aString101 == null) {
			return;
		}
		@Pc(390) Class2_Sub8 local390 = new Class2_Sub8(arg1);
		local16 >>= 0x1;
		local390.anInt1371 = local28 - local16;
		local390.anInt1372 = local16 + local31;
		local390.anInt1367 = local251;
		local390.anInt1375 = local253;
		local390.anInt1373 = local263;
		local390.anInt1369 = local249;
		local390.anInt1374 = local31 - local16;
		local390.anInt1370 = local28 + local16;
		Static36.aClass8_3.method212(local390);
	}
}
