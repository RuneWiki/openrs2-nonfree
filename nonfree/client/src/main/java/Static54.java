import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!nb;")
	public static Class15 aClass15_11;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_446 = Static184.method2923("compass");

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!i;")
	private static Class41 aClass41_447 = Static184.method2923("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_448 = Static184.method2923("");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_449 = aClass41_447;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_450 = Static184.method2923("zap");

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_451 = Static184.method2923("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[200];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method1054(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	public static void method1057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) long local7 = (long) ((arg0 << 16) + arg1);
		@Pc(17) Class2_Sub2_Sub7 local17 = (Class2_Sub2_Sub7) Static181.aClass70_16.method2205(local7);
		if (local17 != null) {
			Static123.aClass89_2.method2850(local17);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!wh;")
	public static Class2_Sub2_Sub28 method1058(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub28 local12 = (Class2_Sub2_Sub28) Static30.aClass43_6.method1464((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static17.aClass15_Sub1_15.method387(0, arg0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class2_Sub2_Sub28();
		@Pc(35) Class2_Sub3 local35 = new Class2_Sub3(local22);
		local35.anInt239 = local35.aByteArray4.length - 2;
		@Pc(46) int local46 = local35.method163();
		@Pc(56) int local56 = local35.aByteArray4.length - local46 - 2 - 12;
		local35.anInt239 = local56;
		@Pc(63) int local63 = local35.method185();
		local12.anInt4796 = local35.method163();
		local12.anInt4792 = local35.method163();
		local12.anInt4794 = local35.method163();
		local12.anInt4793 = local35.method163();
		@Pc(95) int local95 = local35.method209();
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local95 > 0) {
			local12.aClass70Array1 = new Class70[local95];
			for (local106 = 0; local106 < local95; local106++) {
				local112 = local35.method163();
				@Pc(119) Class70 local119 = new Class70(Static163.method2657(local112));
				local12.aClass70Array1[local106] = local119;
				while (local112-- > 0) {
					@Pc(130) int local130 = local35.method185();
					@Pc(134) int local134 = local35.method185();
					local119.method2208((long) local130, new Class2_Sub23(local134));
				}
			}
		}
		local106 = 0;
		local35.anInt239 = 0;
		local12.aClass41_1288 = local35.method215();
		local12.aClass41Array73 = new Class41[local63];
		local12.anIntArray499 = new int[local63];
		local12.anIntArray500 = new int[local63];
		while (local56 > local35.anInt239) {
			local112 = local35.method163();
			if (local112 == 3) {
				local12.aClass41Array73[local106] = local35.method160();
			} else if (local112 >= 100 || local112 == 21 || local112 == 38 || local112 == 39) {
				local12.anIntArray500[local106] = local35.method209();
			} else {
				local12.anIntArray500[local106] = local35.method185();
			}
			local12.anIntArray499[local106++] = local112;
		}
		Static30.aClass43_6.method1462((long) arg0, local12);
		return local12;
	}
}
