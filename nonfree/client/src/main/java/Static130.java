import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array11;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1696 = Static32.method683("l");

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1697 = Static32.method683(")3runescape)3com");

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	public static int anInt3790 = 0;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "[I")
	public static int[] anIntArray347 = new int[500];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	public static void method2874() {
		Static159.aBoolean148 = true;
		Static171.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
	public static int method2875() {
		return Static61.anInt1317++;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method2877() {
		aClass2_Sub2_Sub2_Sub3Array11 = null;
		anIntArray347 = null;
		aClass49_1696 = null;
		aClass49_1697 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
	public static void method2878(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub19 local12 = (Class2_Sub19) Static70.aClass25_6.method836((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray200.length; local17++) {
				local12.anIntArray200[local17] = -1;
				local12.anIntArray199[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZIBILclient!bi;)V")
	public static void method2879(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub2_Sub4 arg4) {
		if (Static84.anInt1796 >= 50 || (arg4.anIntArray39 == null || arg4.anIntArray39.length <= arg3)) {
			return;
		}
		@Pc(23) int local23 = arg4.anIntArray39[arg3];
		if (local23 == 0) {
			return;
		}
		@Pc(32) int local32 = local23 >> 4 & 0x7;
		@Pc(36) int local36 = local23 >> 8;
		@Pc(40) int local40 = local23 & 0xF;
		if (local40 == 0) {
			if (arg1) {
				Static7.method107(local32, local36, 0);
			}
		} else if (Static150.anInt3220 != 0) {
			@Pc(62) int local62 = (arg2 - 64) / 128;
			@Pc(68) int local68 = (arg0 - 64) / 128;
			Static66.anIntArray168[Static84.anInt1796] = local36;
			Static146.anIntArray284[Static84.anInt1796] = local32;
			Static133.anIntArray327[Static84.anInt1796] = 0;
			Static117.aClass53Array1[Static84.anInt1796] = null;
			Static30.anIntArray62[Static84.anInt1796] = (local68 << 8) + (local62 << 16) + local40;
			Static84.anInt1796++;
		}
	}
}
