import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!jb;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	public static int anInt321;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_46 = Static199.method3560(")3");

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_48 = Static199.method3560("blinken3:");

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_49 = Static199.method3560("; Expires=");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Lclient!qb;")
	public static Class2_Sub3_Sub26 method231(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub3_Sub26 local18 = (Class2_Sub3_Sub26) Static167.aClass110_16.method3891((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static188.aClass72_263.method3197(Static160.method2882(arg0), Static5.method96(arg0));
		local18 = new Class2_Sub3_Sub26();
		if (local32 != null) {
			local18.method2997(new Class2_Sub23(local32));
		}
		Static167.aClass110_16.method3894(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method232() {
		if (Static114.anInt2557 < 128) {
			Static114.anInt2557 = 128;
		}
		@Pc(14) int local14 = Static124.anInt2829 >> 7;
		Static140.anInt3197 &= 0x7FF;
		@Pc(26) int local26 = Static86.anInt1939 >> 7;
		@Pc(28) int local28 = 0;
		if (Static114.anInt2557 > 383) {
			Static114.anInt2557 = 383;
		}
		@Pc(41) int local41 = Static208.method3667(Static86.anInt1939, Static137.anInt3136, Static124.anInt2829);
		@Pc(61) int local61;
		if (local26 > 3 && local14 > 3 && local26 < 100 && local14 < 100) {
			for (local61 = local26 - 4; local61 <= local26 + 4; local61++) {
				for (@Pc(67) int local67 = local14 - 4; local67 <= local14 + 4; local67++) {
					@Pc(71) int local71 = Static137.anInt3136;
					if (local71 < 3 && (Static133.aByteArrayArrayArray10[1][local61][local67] & 0x2) == 2) {
						local71++;
					}
					@Pc(101) int local101 = local41 - Static144.anIntArrayArrayArray7[local71][local61][local67];
					if (local101 > local28) {
						local28 = local101;
					}
				}
			}
		}
		local61 = local28 * 192;
		if (local61 > 98048) {
			local61 = 98048;
		}
		if (local61 < 32768) {
			local61 = 32768;
		}
		if (Static119.anInt2804 < local61) {
			Static119.anInt2804 += (local61 - Static119.anInt2804) / 24;
		} else if (local61 < Static119.anInt2804) {
			Static119.anInt2804 += (local61 - Static119.anInt2804) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLclient!oe;Lclient!sb;Lclient!oe;)V")
	public static void method233(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) Class72 arg2) {
		Static223.anInterface2_1 = arg1;
		Static39.aClass72_48 = arg0;
		Static102.aClass72_138 = arg2;
	}
}
