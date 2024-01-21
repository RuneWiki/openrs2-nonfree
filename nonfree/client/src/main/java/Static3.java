import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_96 = Static56.method972("@gr1@");

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!ae;")
	public static Class5 aClass5_97 = Static56.method972("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	public static int anInt289 = 0;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
	public static int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!ae;")
	private static Class5 aClass5_98 = Static56.method972("Loaded input handler");

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array2 = new Class5[100];

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public static int anInt292 = 0;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!bd;")
	public static Class9 aClass9_3 = new Class9(64);

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "J")
	public static volatile long aLong7 = 0L;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_99 = Static56.method972("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_100 = aClass5_98;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!bd;")
	public static Class9 aClass9_4 = new Class9(50);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)J")
	public static synchronized long method125() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static23.aLong25) {
			Static16.aLong14 += Static23.aLong25 - local10;
		}
		Static23.aLong25 = local10;
		return Static16.aLong14 + local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ae;Z)V")
	public static void method126(@OriginalArg(0) Class5 arg0) {
		if (arg0 == null || arg0.method144() == 0) {
			Static111.anInt2907 = 0;
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(22) Class5[] local22 = new Class5[100];
		@Pc(24) Class5 local24 = arg0;
		while (true) {
			@Pc(29) int local29 = local24.method166();
			if (local29 == -1) {
				local24 = local24.method143();
				if (local24.method144() > 0) {
					local22[local19++] = local24.method151();
				}
				Static111.anInt2907 = 0;
				label46: for (local29 = 0; local29 < Static58.anInt1613; local29++) {
					@Pc(97) Class3_Sub1_Sub3 local97 = Static37.method694(local29);
					if (local97.anInt657 == -1 && local97.aClass5_300 != null) {
						@Pc(110) Class5 local110 = local97.aClass5_300.method151();
						for (@Pc(112) int local112 = 0; local112 < local19; local112++) {
							if (local110.method154(local22[local112]) == -1) {
								continue label46;
							}
						}
						Static50.aClass5Array10[Static111.anInt2907] = local110;
						Static31.anIntArray135[Static111.anInt2907] = local29;
						Static111.anInt2907++;
						if (Static111.anInt2907 >= Static50.aClass5Array10.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(58) Class5 local58 = local24.method133(0, local29).method143();
			if (local58.method144() > 0) {
				local22[local19++] = local58.method151();
			}
			local24 = local24.method159(local29 + 1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method127() {
		aClass5_98 = null;
		aClass5_97 = null;
		anIntArray35 = null;
		aClass5Array2 = null;
		aClass5_100 = null;
		aClass9_4 = null;
		aBigInteger1 = null;
		aClass9_3 = null;
		aClass5_96 = null;
		aClass5_99 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method128() {
		Static61.anInt1651 = 0;
		Static83.anInt2051 = 0;
		Static106.method1775();
		Static10.method1879();
		Static83.method1331();
		Static76.method1693();
		@Pc(30) int local30;
		for (@Pc(19) int local19 = 0; local19 < Static61.anInt1651; local19++) {
			local30 = Static37.anIntArray123[local19];
			if (Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30].anInt1556 != anInt289) {
				Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local30] = null;
			}
		}
		if (Static61.anInt1652 != Static75.aClass3_Sub6_Sub1_2.anInt2416) {
			throw new RuntimeException("gpp1 pos:" + Static75.aClass3_Sub6_Sub1_2.anInt2416 + " psize:" + Static61.anInt1652);
		}
		for (local30 = 0; local30 < Static38.anInt1056; local30++) {
			if (Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray6[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static38.anInt1056);
			}
		}
	}
}
