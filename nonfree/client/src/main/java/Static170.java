import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "Lclient!gb;")
	public static Class1_Sub23 aClass1_Sub23_1;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Lclient!em;")
	public static final Class83 aClass83_75 = new Class83(38, 20);

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
	public static final int[] anIntArray147 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gn", name = "E", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!gn", name = "H", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBLclient!in;I)V")
	public static void method2736(@OriginalArg(0) int arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class181 local8 = arg1.method3361(Static31.aClass78_18);
		if (local8 == null) {
			return;
		}
		Static31.aClass78_18.da(arg2, arg0, arg2 + arg1.anInt4182, arg1.anInt4156 + arg0);
		if (Static71.anInt1363 >= 3) {
			Static31.aClass78_18.FA(-16777216, local8, arg2, arg0);
		} else {
			Static308.aClass5_21.method7805((float) arg2 + (float) arg1.anInt4182 / 2.0F, (float) arg1.anInt4156 / 2.0F + (float) arg0, ((int) -Static331.aFloat172 & 0x3FFF) << 2, local8, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!r;ILclient!ko;)I")
	public static int method2741(@OriginalArg(0) Class78 arg0, @OriginalArg(2) Class193 arg1) {
		if (arg1.anInt5032 != -1) {
			return arg1.anInt5032;
		}
		if (arg1.anInt5019 != -1) {
			@Pc(19) Class17 local19 = arg0.anInterface9_13.method947(arg1.anInt5019);
			if (!local19.aBoolean32) {
				return local19.aShort19;
			}
		}
		return arg1.anInt5023;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method2744(@OriginalArg(1) long arg0) {
		Static40.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static40.aCalendar1.get(7);
		@Pc(17) int local17 = Static40.aCalendar1.get(5);
		@Pc(21) int local21 = Static40.aCalendar1.get(2);
		@Pc(25) int local25 = Static40.aCalendar1.get(1);
		@Pc(34) int local34 = Static40.aCalendar1.get(11);
		@Pc(38) int local38 = Static40.aCalendar1.get(12);
		@Pc(42) int local42 = Static40.aCalendar1.get(13);
		return Static175.aStringArray4[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static446.aStringArray28[local21] + "-" + local25 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB[BII)V")
	public static void method2746(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		arg0 += arg3;
		@Pc(31) int local31 = arg2 - arg3 >> 2;
		while (true) {
			local31--;
			if (local31 < 0) {
				local31 = arg2 - arg3 & 0x3;
				while (true) {
					local31--;
					if (local31 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(36) int local36 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg1[local36] = 1;
			@Pc(46) int local46 = local41 + 1;
			arg1[local41] = 1;
			arg0 = local46 + 1;
			arg1[local46] = 1;
		}
	}
}
