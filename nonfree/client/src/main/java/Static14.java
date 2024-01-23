import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	public static int anInt277;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	public static int anInt276 = 0;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "[Lclient!eb;")
	public static Class2_Sub8_Sub6[] aClass2_Sub8_Sub6Array1 = new Class2_Sub8_Sub6[14];

	@OriginalMember(owner = "client!an", name = "y", descriptor = "[I")
	public static int[] anIntArray43 = new int[2000];

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
	public static void method246() {
		if (Static270.anInt4256 != -1) {
			Static198.method3392(Static270.anInt4256, -1, -1, false);
			Static270.anInt4256 = -1;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!ec;I)V")
	public static void method248(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub8_Sub3 local18 = Static251.method3954(local14);
		if (local18 == null) {
			return;
		}
		Static269.anIntArray512 = new int[local18.anInt976];
		Static296.aStringArray44 = new String[local18.anInt978];
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		for (@Pc(40) int local40 = 1; local40 < local8.length; local40++) {
			if (local8[local40] instanceof Integer) {
				@Pc(59) int local59 = (Integer) local8[local40];
				if (local59 == -2147483647) {
					local59 = arg0.anInt1527;
				}
				if (local59 == -2147483646) {
					local59 = arg0.anInt1524;
				}
				if (local59 == -2147483645) {
					local59 = arg0.aClass56_6 == null ? -1 : arg0.aClass56_6.anInt2096;
				}
				if (local59 == -2147483644) {
					local59 = arg0.anInt1529;
				}
				if (local59 == -2147483643) {
					local59 = arg0.aClass56_6 == null ? -1 : arg0.aClass56_6.anInt2056;
				}
				if (local59 == -2147483642) {
					local59 = arg0.aClass56_7 == null ? -1 : arg0.aClass56_7.anInt2096;
				}
				if (local59 == -2147483641) {
					local59 = arg0.aClass56_7 == null ? -1 : arg0.aClass56_7.anInt2056;
				}
				if (local59 == -2147483640) {
					local59 = arg0.anInt1522;
				}
				if (local59 == -2147483639) {
					local59 = arg0.anInt1528;
				}
				Static269.anIntArray512[local34++] = local59;
			} else if (local8[local40] instanceof String) {
				@Pc(169) String local169 = (String) local8[local40];
				if (local169.equals("event_opbase")) {
					local169 = arg0.aString53;
				}
				Static296.aStringArray44[local32++] = local169;
			}
		}
		Static36.method700(local18, arg1);
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V")
	public static void method249() {
		Static4.aClass157_3.method4027();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
	public static void method250() {
		Static89.aClass157_17.method4027();
		Static48.aClass157_10.method4027();
	}
}
