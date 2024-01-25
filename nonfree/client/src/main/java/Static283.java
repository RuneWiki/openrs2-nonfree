import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
	public static int anInt5875;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!m;ILclient!aia;Lclient!ha;)V")
	public static void method4798(@OriginalArg(0) Class8_Sub35 arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(10) Class21 local10 = arg1.method769(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5790();
		if (local10.method5783() > local16) {
			local16 = local10.method5783();
		}
		@Pc(28) int local28 = arg0.anInt6531;
		@Pc(31) int local31 = arg0.anInt6534;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg1.aString8 != null) {
			local33 = Static184.aClass345_9.method8117(Static196.aStringArray10, arg1.aString8, null, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static196.aStringArray10[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static123.aClass285_6.method7064(local57);
				if (local35 < local74) {
					local35 = local74;
				}
			}
			local37 = Static123.aClass285_6.method7062() * local33 + Static123.aClass285_6.method7066() / 2;
		}
		local51 = local16 / 2 + arg0.anInt6531;
		if (local28 < local16 + Static110.anInt7709) {
			local28 = Static110.anInt7709;
			local51 = local16 / 2 + Static110.anInt7709 + local35 / 2 + 10 + 5;
		} else if (local28 > Static110.anInt7711 - local16) {
			local28 = Static110.anInt7711 - local16;
			local51 = Static110.anInt7711 - local35 / 2 - local16 / 2 - 10 - 5;
		}
		@Pc(163) int local163 = arg0.anInt6534;
		if (local31 < Static110.anInt7706 + local16) {
			local31 = Static110.anInt7706;
			local163 = local16 / 2 + Static110.anInt7706 + 10;
		} else if (local31 > Static110.anInt7707 - local16) {
			local31 = Static110.anInt7707 - local16;
			local163 = Static110.anInt7707 - local16 / 2 - local37 - 10;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg0.anInt6531), (double) (local31 - arg0.anInt6534)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5793((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		if (arg1.aString8 != null) {
			local250 = local163;
			local248 = local51 - local35 / 2 - 5;
			local252 = local35 + local248 + 10;
			local254 = local33 * Static123.aClass285_6.method7062() + local163 + 3;
			if (arg1.anInt807 != 0) {
				arg2.method6114(arg1.anInt807, local248, local254 - local163, local163, local252 - local248);
			}
			if (arg1.anInt795 != 0) {
				arg2.method6086(local248, local163, arg1.anInt795, local254 - local163, local252 - local248);
			}
			for (@Pc(321) int local321 = 0; local321 < local33; local321++) {
				@Pc(327) String local327 = Static196.aStringArray10[local321];
				if (local321 < local33 - 1) {
					local327 = local327.substring(0, local327.length() - 4);
				}
				Static123.aClass285_6.method7061(arg2, local327, local51, local163, arg1.anInt804);
				local163 += Static123.aClass285_6.method7062();
			}
		}
		if (arg1.anInt783 == -1 && arg1.aString8 == null) {
			return;
		}
		@Pc(375) Class8_Sub7 local375 = new Class8_Sub7(arg0);
		local16 >>= 0x1;
		local375.anInt1634 = local254;
		local375.anInt1635 = local250;
		local375.anInt1641 = local252;
		local375.anInt1642 = local248;
		local375.anInt1638 = local31 - local16;
		local375.anInt1636 = local28 + local16;
		local375.anInt1640 = local28 - local16;
		local375.anInt1637 = local31 + local16;
		Static52.aClass43_15.method1424(local375);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZI)V")
	public static void method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(9, arg2);
		local8.method3509();
		local8.anInt4321 = arg0;
		local8.anInt4324 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIIII)V")
	public static void method4801(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static251.anInt9634 = 0;
		Static366.anInt6946 = arg0;
		Static188.anInt4410 = arg1;
		Static444.anInt8258 = 0;
	}
}
