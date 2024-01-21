import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!pe;")
	public static Class65 aClass65_73 = Static119.method1462("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
	public static int anInt166 = 0;

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_74 = Static119.method1462("<col=00ffff>");

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "Lclient!pe;")
	public static Class65 aClass65_75 = Static119.method1462("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_76 = Static119.method1462("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public static void method119() {
		anIntArrayArrayArray1 = null;
		aClass65_74 = null;
		aClass65_75 = null;
		aClass65_73 = null;
		aClass65_76 = null;
		aClass2_Sub1_Sub4_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lclient!od;")
	public static Class2_Sub1_Sub10 method121(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub10 local15 = (Class2_Sub1_Sub10) Static18.aClass8_10.method172((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static95.aClass56_30.method1666(arg0, 3);
		local15 = new Class2_Sub1_Sub10();
		if (local25 != null) {
			local15.method1355(new Class2_Sub4(local25));
		}
		Static18.aClass8_10.method176((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!na;ZLclient!na;I)Lclient!ge;")
	public static Class2_Sub1_Sub5 method125(@OriginalArg(1) Class56 arg0, @OriginalArg(3) Class56 arg1, @OriginalArg(4) int arg2) {
		@Pc(4) int[] local4 = arg0.method1673(arg2);
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < local4.length; local12++) {
			@Pc(31) byte[] local31 = arg0.method1688(local4[local12], arg2);
			if (local31 == null) {
				local10 = false;
			} else {
				@Pc(50) int local50 = local31[1] & 0xFF | (local31[0] & 0xFF) << 8;
				@Pc(58) byte[] local58 = arg1.method1688(0, local50);
				if (local58 == null) {
					local10 = false;
				}
			}
		}
		if (!local10) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub5(arg0, arg1, arg2, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIILclient!wa;B)V")
	public static void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub22 arg6) {
		if (Static97.aBoolean88) {
			Static36.anInt807 = 32;
		} else {
			Static36.anInt807 = 0;
		}
		Static97.aBoolean88 = false;
		@Pc(122) int local122;
		if (Static17.anInt380 != 0) {
			if (arg1 >= arg2 && arg2 + 16 > arg1 && arg0 <= arg4 && arg4 < arg0 + 16) {
				arg6.anInt2781 -= 4;
				Static116.method1853(arg6);
			} else if (arg1 >= arg2 && arg2 + 16 > arg1 && arg4 >= arg5 + arg0 - 16 && arg0 + arg5 > arg4) {
				arg6.anInt2781 += 4;
				Static116.method1853(arg6);
			} else if (arg2 - Static36.anInt807 <= arg1 && Static36.anInt807 + arg2 + 16 > arg1 && arg4 >= arg0 + 16 && arg4 < arg5 + arg0 - 16) {
				local122 = (arg5 - 32) * arg5 / arg3;
				if (local122 < 8) {
					local122 = 8;
				}
				@Pc(135) int local135 = arg5 - local122 - 32;
				@Pc(146) int local146 = arg4 - local122 / 2 - arg0 - 16;
				arg6.anInt2781 = local146 * (arg3 - arg5) / local135;
				Static116.method1853(arg6);
				Static97.aBoolean88 = true;
			}
		}
		if (Static130.anInt2839 == 0) {
			return;
		}
		local122 = arg6.anInt2787;
		if (arg1 >= arg2 - local122 && arg4 >= arg0 && arg2 + 16 > arg1 && arg4 <= arg5 + arg0) {
			arg6.anInt2781 += Static130.anInt2839 * 45;
			Static116.method1853(arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)I")
	public static int method129() {
		@Pc(14) int local14 = Static106.method1718(Static130.anInt2838, Static69.anInt1610, Static59.anInt1479);
		return local14 - Static84.anInt1818 >= 800 || (Static88.aByteArrayArrayArray3[Static59.anInt1479][Static69.anInt1610 >> 7][Static130.anInt2838 >> 7] & 0x4) == 0 ? 3 : Static59.anInt1479;
	}
}
