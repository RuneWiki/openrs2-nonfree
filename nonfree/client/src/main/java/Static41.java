import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "Z")
	public static boolean aBoolean57;

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_7;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Lclient!sg;")
	private static Class77 aClass77_467 = Static146.method2172("yellow:");

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "Lclient!sg;")
	public static Class77 aClass77_468 = Static146.method2172("");

	@OriginalMember(owner = "client!eg", name = "C", descriptor = "Lclient!sg;")
	public static Class77 aClass77_469 = aClass77_467;

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Lclient!sg;")
	public static Class77 aClass77_470 = aClass77_467;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Lclient!sg;")
	public static Class77 aClass77_471 = aClass77_468;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method804() {
		aClass77_467 = null;
		aClass43_Sub1_7 = null;
		aClass77_471 = null;
		aClass77_468 = null;
		aClass77_470 = null;
		aClass77_469 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method805(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static90.method1668(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static3.method65(arg1, local45);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!sg;Lclient!sg;Lclient!ke;Lclient!ke;)Lclient!hg;")
	public static Class2_Sub2_Sub3_Sub4_Sub1 method806(@OriginalArg(1) Class77 arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) Class43 arg3) {
		@Pc(14) int local14 = arg2.method2206(arg0);
		@Pc(20) int local20 = arg2.method2215(local14, arg1);
		return Static59.method1101(local20, local14, arg3, arg2);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!ga;I)V")
	public static void method807(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class29 arg1) {
		if (Static101.aClass29_3 != null) {
			try {
				Static101.aClass29_3.method967();
			} catch (@Pc(12) Exception local12) {
			}
			Static101.aClass29_3 = null;
		}
		Static101.aClass29_3 = arg1;
		Static176.method2956(arg0);
		Static80.aClass2_Sub18_56.anInt3423 = 0;
		Static166.aClass2_Sub18_101 = null;
		Static160.aClass2_Sub2_Sub4_103 = null;
		Static38.anInt1105 = 0;
		while (true) {
			@Pc(39) Class2_Sub2_Sub4 local39 = (Class2_Sub2_Sub4) Static169.aClass74_11.method2430();
			if (local39 == null) {
				while (true) {
					local39 = (Class2_Sub2_Sub4) Static53.aClass74_6.method2430();
					if (local39 == null) {
						if (Static79.aByte5 != 0) {
							try {
								@Pc(91) Class2_Sub18 local91 = new Class2_Sub18(4);
								local91.method2389(4);
								local91.method2389(Static79.aByte5);
								local91.method2369(0);
								Static101.aClass29_3.method969(4, local91.aByteArray39);
							} catch (@Pc(114) IOException local114) {
								try {
									Static101.aClass29_3.method967();
								} catch (@Pc(119) Exception local119) {
								}
								Static170.anInt4200++;
								Static101.aClass29_3 = null;
							}
						}
						Static90.anInt2357 = 0;
						Static176.aLong129 = Static101.method1795();
						return;
					}
					Static173.aClass85_2.method2761(local39);
					Static42.aClass74_4.method2432(local39.aLong134, local39);
					Static120.anInt1043--;
					Static136.anInt3301++;
				}
			}
			Static48.aClass74_5.method2432(local39.aLong134, local39);
			Static44.anInt1188--;
			Static15.anInt481++;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Lclient!ic;")
	public static Class2_Sub2_Sub11 method808(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub11 local6 = (Class2_Sub2_Sub11) Static179.aClass82_64.method2699((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static130.aClass43_31.method2205(arg0, 13);
		local6 = new Class2_Sub2_Sub11();
		local6.anInt1860 = arg0;
		if (local25 != null) {
			local6.method1340(new Class2_Sub18(local25));
		}
		Static179.aClass82_64.method2701((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BJ)V")
	public static void method809(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
