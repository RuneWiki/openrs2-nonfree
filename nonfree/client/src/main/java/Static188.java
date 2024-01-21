import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ve", name = "Mc", descriptor = "I")
	public static int anInt4344;

	@OriginalMember(owner = "client!ve", name = "Qc", descriptor = "[I")
	public static int[] anIntArray514;

	@OriginalMember(owner = "client!ve", name = "Cc", descriptor = "I")
	public static int anInt4337 = 0;

	@OriginalMember(owner = "client!ve", name = "Vc", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1692 = Static120.method1824("Drop");

	@OriginalMember(owner = "client!ve", name = "Ec", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1690 = aClass80_1692;

	@OriginalMember(owner = "client!ve", name = "Sc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1691 = Static120.method1824("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ve", name = "Xc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1693 = Static120.method1824("Wordpack geladen)3");

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)Z")
	public static boolean method3068(@OriginalArg(1) int arg0) {
		if (Static129.aBooleanArray16[arg0]) {
			return true;
		} else if (Static107.aClass1_17.method58(arg0)) {
			@Pc(23) int local23 = Static107.aClass1_17.method56(arg0);
			if (local23 == 0) {
				Static129.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static57.aClass77ArrayArray1[arg0] == null) {
				Static57.aClass77ArrayArray1[arg0] = new Class77[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static57.aClass77ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static107.aClass1_17.method60(arg0, local45);
					if (local59 != null) {
						Static57.aClass77ArrayArray1[arg0][local45] = new Class77();
						Static57.aClass77ArrayArray1[arg0][local45].anInt3237 = local45 + (arg0 << 16);
						if (local59[0] == -1) {
							Static57.aClass77ArrayArray1[arg0][local45].method2335(new Class3_Sub17(local59));
						} else {
							Static57.aClass77ArrayArray1[arg0][local45].method2329(new Class3_Sub17(local59));
						}
					}
				}
			}
			Static129.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[[[I)V")
	public static void method3070(@OriginalArg(3) int[][][] arg0) {
		Static97.anInt2061 = 4;
		Static64.anInt1390 = 104;
		Static49.anInt1086 = 104;
		Static185.aClass3_Sub15ArrayArrayArray1 = new Class3_Sub15[4][104][104];
		Static97.anIntArrayArrayArray5 = new int[4][105][105];
		Static111.anIntArrayArrayArray7 = arg0;
		Static111.method1722();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method3072(@OriginalArg(1) Class3_Sub17 arg0) {
		if (Static194.aClass74_5 != null) {
			try {
				Static194.aClass74_5.method2065(0L);
				Static194.aClass74_5.method2064(arg0.aByteArray40, arg0.anInt2923, 24);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt2923 += 24;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Z")
	public static boolean method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static97.anIntArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == -Static109.anInt2440) {
			return false;
		} else if (local7 == Static109.anInt2440) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static79.method1201(local22 + 1, Static111.anIntArrayArrayArray7[arg0][arg1][arg2], local26 + 1) && Static79.method1201(local22 + 128 - 1, Static111.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local26 + 1) && Static79.method1201(local22 + 128 - 1, Static111.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static79.method1201(local22 + 1, Static111.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static97.anIntArrayArrayArray5[arg0][arg1][arg2] = Static109.anInt2440;
				return true;
			} else {
				Static97.anIntArrayArrayArray5[arg0][arg1][arg2] = -Static109.anInt2440;
				return false;
			}
		}
	}
}
