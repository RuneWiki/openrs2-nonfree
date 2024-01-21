import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!fc;")
	public static Class21 aClass21_4;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!mb;")
	public static Class38 aClass38_9;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	public static int anInt804 = -1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	public static final int anInt807 = 7759444;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt811 = 0;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_266 = Static34.method846("Benutzen");

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_267 = Static34.method846("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	public static int[] anIntArray47 = new int[50];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rc;IILclient!rc;)V")
	public static void method510(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class55 arg2) {
		if (arg1 == 0 && Static39.anInt1691 != -1) {
			Static44.aClass55_1159 = arg2;
			Static85.anInt2400 = 0;
		}
		if (Static1.anInt3 == -1) {
			Static72.aBoolean99 = true;
		}
		for (@Pc(28) int local28 = 99; local28 > 0; local28--) {
			Static100.anIntArray276[local28] = Static100.anIntArray276[local28 - 1];
			Static74.aClass55Array16[local28] = Static74.aClass55Array16[local28 - 1];
			Static29.aClass55Array10[local28] = Static29.aClass55Array10[local28 - 1];
		}
		Static100.anIntArray276[0] = arg1;
		Static74.aClass55Array16[0] = arg0;
		Static29.aClass55Array10[0] = arg2;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method512() {
		Static13.aClass6_Sub1_Sub1_2.method1524();
		@Pc(11) int local11 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
		if (local11 == 0) {
			return;
		}
		@Pc(27) int local27 = Static13.aClass6_Sub1_Sub1_2.method1519(2);
		if (local27 == 0) {
			Static102.anIntArray288[Static59.anInt1826++] = 2047;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (local27 == 1) {
			local49 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
			Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.method1831(local49, false);
			local59 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
			if (local59 == 1) {
				Static102.anIntArray288[Static59.anInt1826++] = 2047;
			}
			return;
		}
		@Pc(103) int local103;
		if (local27 == 2) {
			local49 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
			Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.method1831(local49, true);
			local59 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
			Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.method1831(local59, true);
			local103 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
			if (local103 == 1) {
				Static102.anIntArray288[Static59.anInt1826++] = 2047;
			}
		} else if (local27 == 3) {
			local49 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
			local59 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
			if (local59 == 1) {
				Static102.anIntArray288[Static59.anInt1826++] = 2047;
			}
			Static56.anInt1718 = Static13.aClass6_Sub1_Sub1_2.method1519(2);
			local103 = Static13.aClass6_Sub1_Sub1_2.method1519(7);
			@Pc(156) int local156 = Static13.aClass6_Sub1_Sub1_2.method1519(7);
			Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.method1832(local103, local49 == 1, local156);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	public static void method513() {
		Static22.aClass36_11.method1155();
		Static91.aClass36_30.method1155();
		Static58.aClass36_22.method1155();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jc;Lclient!md;I)V")
	public static void method516(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class40_Sub1 arg2) {
		@Pc(12) byte[] local12 = null;
		@Pc(14) Class3 local14 = Static90.aClass3_6;
		synchronized (Static90.aClass3_6) {
			for (@Pc(21) Class6_Sub8 local21 = (Class6_Sub8) Static90.aClass3_6.method31(); local21 != null; local21 = (Class6_Sub8) Static90.aClass3_6.method26()) {
				if ((long) arg0 == local21.aLong114 && arg1 == local21.aClass32_2 && local21.anInt1568 == 0) {
					local12 = local21.aByteArray7;
					break;
				}
			}
		}
		if (local12 == null) {
			@Pc(71) byte[] local71 = arg1.method981(arg0);
			arg2.method1257(arg1, true, arg0, local71);
		} else {
			arg2.method1257(arg1, true, arg0, local12);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method517() {
		anIntArray47 = null;
		aClass38_9 = null;
		aClass55_266 = null;
		aClass55_267 = null;
		aClass21_4 = null;
		anIntArrayArrayArray2 = null;
	}
}
