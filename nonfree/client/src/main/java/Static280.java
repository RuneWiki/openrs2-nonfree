import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt5692 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!wl;")
	public static Class62_Sub1 method5066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class172 local14 = local7.aClass172_1; local14 != null; local14 = local14.aClass172_4) {
			@Pc(18) Class62_Sub1 local18 = local14.aClass62_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort84 == arg1 && local18.aShort83 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method5067(@OriginalArg(0) int arg0) {
		Static71.anInt1580 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static223.anInt4280; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static160.anInt3244; local6++) {
				if (Static275.aClass8ArrayArrayArray4[arg0][local3][local6] == null) {
					Static275.aClass8ArrayArrayArray4[arg0][local3][local6] = new Class8(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method5068(@OriginalArg(0) Class191 arg0) {
		Static159.aClass191_100 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZI)V")
	public static void method5069(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub26 local12 = Static42.method991(arg0, arg1);
		if (local12 != null) {
			local12.method5945();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method5070() {
		if (Static263.anInt5396 == 10) {
			Static125.method2616(28);
		}
		if (Static263.anInt5396 == 30) {
			Static125.method2616(25);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIJ)V")
	public static void method5071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(12) int local12 = (int) arg2 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg2 >> 20 & 0x3;
		@Pc(26) int local26 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local12 != 10 && local12 != 11 && local12 != 22) {
			Static73.method3198(local19, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, 0, arg1, local12, arg0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], 0);
			return;
		}
		@Pc(66) Class96 local66 = Static234.method4051(local26);
		@Pc(79) int local79;
		@Pc(82) int local82;
		if (local19 == 0 || local19 == 2) {
			local79 = local66.anInt3120;
			local82 = local66.anInt3135;
		} else {
			local79 = local66.anInt3135;
			local82 = local66.anInt3120;
		}
		@Pc(93) int local93 = local66.anInt3145;
		if (local19 != 0) {
			local93 = (local93 << local19 & 0xF) + (local93 >> 4 - local19);
		}
		Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, local93, local82, arg1, 0, arg0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local79);
	}
}
