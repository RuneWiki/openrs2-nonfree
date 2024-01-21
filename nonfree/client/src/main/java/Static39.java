import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!g", name = "W", descriptor = "Lclient!lc;")
	public static Class40 aClass40_30;

	@OriginalMember(owner = "client!g", name = "db", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_8;

	@OriginalMember(owner = "client!g", name = "rb", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_416 = Static121.method2047("Close");

	@OriginalMember(owner = "client!g", name = "ib", descriptor = "Lclient!qc;")
	public static Class60 aClass60_417 = Static121.method2047("blinken2:");

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "[J")
	public static long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!g", name = "yb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_418 = Static121.method2047("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!g", name = "zb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_419 = Static121.method2047("0(U");

	@OriginalMember(owner = "client!g", name = "Ab", descriptor = "Lclient!qc;")
	public static Class60 aClass60_420 = aClass60_416;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(B)V")
	public static void method670() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static25.anInt693 - 1; local17++) {
				if (Static36.anIntArray71[local17] < 1000 && Static36.anIntArray71[local17 + 1] > 1000) {
					local11 = false;
					@Pc(37) Class60 local37 = Static9.aClass60Array2[local17];
					Static9.aClass60Array2[local17] = Static9.aClass60Array2[local17 + 1];
					Static9.aClass60Array2[local17 + 1] = local37;
					@Pc(55) Class60 local55 = Static112.aClass60Array24[local17];
					Static112.aClass60Array24[local17] = Static112.aClass60Array24[local17 + 1];
					Static112.aClass60Array24[local17 + 1] = local55;
					@Pc(73) int local73 = Static36.anIntArray71[local17];
					Static36.anIntArray71[local17] = Static36.anIntArray71[local17 + 1];
					Static36.anIntArray71[local17 + 1] = local73;
					@Pc(91) int local91 = Static47.anIntArray116[local17];
					Static47.anIntArray116[local17] = Static47.anIntArray116[local17 + 1];
					Static47.anIntArray116[local17 + 1] = local91;
					@Pc(109) int local109 = Static20.anIntArray32[local17];
					Static20.anIntArray32[local17] = Static20.anIntArray32[local17 + 1];
					Static20.anIntArray32[local17 + 1] = local109;
					@Pc(127) int local127 = Static76.anIntArray194[local17];
					Static76.anIntArray194[local17] = Static76.anIntArray194[local17 + 1];
					Static76.anIntArray194[local17 + 1] = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public static void method672() {
		aClass60_417 = null;
		aClass60_416 = null;
		aClass60_418 = null;
		aClass40_30 = null;
		aLongArray7 = null;
		aClass40_Sub1_8 = null;
		anIntArray74 = null;
		aClass60_420 = null;
		aClass60_419 = null;
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(B)V")
	public static void method674() {
		while (true) {
			@Pc(9) Class70 local9 = Static60.aClass70_16;
			@Pc(16) Class4_Sub6 local16;
			synchronized (Static60.aClass70_16) {
				local16 = (Class4_Sub6) Static3.aClass70_1.method1932();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass40_Sub1_6.method1131(local16.aByteArray27, (int) local16.aLong100, false, local16.aClass54_1);
		}
	}
}
