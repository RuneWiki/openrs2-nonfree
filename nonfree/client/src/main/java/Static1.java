import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "M", descriptor = "Lclient!qj;")
	public static Class165 aClass165_3;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	public static final int[] anIntArray12 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Z")
	public static boolean aBoolean13 = true;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString1 = "green:";

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
	public static boolean aBoolean14 = true;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString2 = "rating: ";

	@OriginalMember(owner = "client!a", name = "T", descriptor = "I")
	public static int anInt49 = 0;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(B)V")
	public static void method45() {
		@Pc(3) Class79 local3 = Static61.aClass79_1;
		synchronized (Static61.aClass79_1) {
			Static130.anInt2532++;
			Static97.anInt1919 = Static84.anInt1650;
			@Pc(22) int local22;
			if (Static274.anInt5358 >= 0) {
				while (Static274.anInt5358 != Static215.anInt4250) {
					local22 = Static229.anIntArray211[Static215.anInt4250];
					Static215.anInt4250 = Static215.anInt4250 + 1 & 0x7F;
					if (local22 < 0) {
						Static220.aBooleanArray24[~local22] = false;
					} else {
						Static220.aBooleanArray24[local22] = true;
					}
				}
			} else {
				for (local22 = 0; local22 < 112; local22++) {
					Static220.aBooleanArray24[local22] = false;
				}
				Static274.anInt5358 = Static215.anInt4250;
			}
			Static84.anInt1650 = Static335.anInt6374;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static void method47(@OriginalArg(0) int arg0) {
		Static8.anInt204 = arg0;
		@Pc(7) Class140 local7 = Static102.aClass140_59;
		synchronized (Static102.aClass140_59) {
			Static102.aClass140_59.method3819();
		}
		local7 = Static69.aClass140_39;
		synchronized (Static69.aClass140_39) {
			Static69.aClass140_39.method3819();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method48(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg0 ? 32768 : 0;
		@Pc(32) int local32 = (arg0 ? Static111.anInt2271 : anInt49) + local24;
		for (@Pc(34) int local34 = local24; local34 < local32; local34++) {
			@Pc(40) Class1_Sub1_Sub17 local40 = Static122.method2174(local34);
			if (local40.aBoolean449 && local40.method4721().toLowerCase().indexOf(local13) != -1) {
				if (local18 >= 50) {
					Static37.aShortArray16 = null;
					Static243.anInt4740 = -1;
					return;
				}
				if (local18 >= local16.length) {
					@Pc(70) short[] local70 = new short[local16.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local18; local72++) {
						local70[local72] = local16[local72];
					}
					local16 = local70;
				}
				local16[local18++] = (short) local34;
			}
		}
		Static243.anInt4740 = local18;
		Static154.anInt3081 = 0;
		Static37.aShortArray16 = local16;
		@Pc(109) String[] local109 = new String[Static243.anInt4740];
		for (@Pc(111) int local111 = 0; local111 < Static243.anInt4740; local111++) {
			local109[local111] = Static122.method2174(local16[local111]).method4721();
		}
		Static188.method3644(local109, Static37.aShortArray16);
	}
}
