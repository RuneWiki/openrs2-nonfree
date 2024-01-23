import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!si", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "I")
	public static int anInt4790 = -1;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "Lclient!qc;")
	public static Class135 aClass135_29 = new Class135(16);

	@OriginalMember(owner = "client!si", name = "u", descriptor = "I")
	public static int anInt4793 = 0;

	@OriginalMember(owner = "client!si", name = "v", descriptor = "J")
	public static long aLong167 = 0L;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method3707(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < Static287.aBooleanArray55.length) {
			Static287.aBooleanArray55[arg0] = !Static287.aBooleanArray55[arg0];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3708(@OriginalArg(0) String arg0) {
		if (Static53.aClass82_13 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static53.aClass82_13.anInt2893; local19++) {
			if (Static87.method1513(Static207.method3772(" ", Static53.aClass82_13.aStringArray38[local19], "<br>"), arg0)) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method3710(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(19) int local19 = 0; local19 < Static178.anInt3973; local19++) {
			@Pc(30) Class42 local30 = Static112.method2060(local19);
			if ((!arg0 || local30.aBoolean106) && local30.anInt1460 == -1 && local30.anInt1465 == -1 && local30.anInt1470 == 0 && local30.aString87.toLowerCase().indexOf(local8) != -1) {
				if (local10 >= 250) {
					Static191.aShortArray70 = null;
					Static183.anInt4432 = -1;
					return;
				}
				if (local13.length <= local10) {
					@Pc(82) short[] local82 = new short[local13.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local10; local84++) {
						local82[local84] = local13[local84];
					}
					local13 = local82;
				}
				local13[local10++] = (short) local19;
			}
		}
		Static191.aShortArray70 = local13;
		Static183.anInt4432 = local10;
		Static289.anInt5496 = 0;
		@Pc(120) String[] local120 = new String[Static183.anInt4432];
		for (@Pc(122) int local122 = 0; local122 < Static183.anInt4432; local122++) {
			local120[local122] = Static112.method2060(local13[local122]).aString87;
		}
		Static295.method4419(Static191.aShortArray70, local120);
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Lclient!te;")
	public static Class157 method3711(@OriginalArg(1) int arg0) {
		@Pc(10) Class157 local10 = (Class157) Static194.aClass135_21.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static105.aClass91_87.method2495(Static75.method1314(arg0), Static138.method3615(arg0));
		local10 = new Class157();
		local10.anInt4960 = arg0;
		if (local24 != null) {
			local10.method3869(new Class1_Sub11(local24));
		}
		Static194.aClass135_21.method3321((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBIII)V")
	public static void method3712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static127.anInt2836 == 0 || arg3 == 0 || Static103.anInt2427 >= 50 || arg0 == -1) {
			return;
		}
		Static252.anIntArray439[Static103.anInt2427] = arg0;
		Static30.anIntArray298[Static103.anInt2427] = arg3;
		Static192.anIntArray355[Static103.anInt2427] = arg2;
		Static59.aClass169Array5[Static103.anInt2427] = null;
		Static256.anIntArray443[Static103.anInt2427] = 0;
		Static23.anIntArray57[Static103.anInt2427] = arg1;
		Static103.anInt2427++;
	}
}
