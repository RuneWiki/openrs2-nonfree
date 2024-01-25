import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!uq", name = "D", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_89 = new Class208(66, -1);

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "I")
	public static int anInt9824 = 13156520;

	@OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
	public static int anInt9826 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method8281(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static316.method5292(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(44) int local44;
			do {
				local44 = arg0.nextInt();
			} while (local41 <= local44);
			return Static507.method7514(arg1, local44);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!cs;B)I")
	public static int method8284(@OriginalArg(0) Class6_Sub2_Sub4 arg0) {
		@Pc(15) String local15 = Static641.method8970(arg0);
		@Pc(17) int[] local17 = null;
		if (Static238.method4146(arg0.anInt1738)) {
			local17 = Static266.aClass138_1.method3730((int) arg0.aLong42).lb;
		} else if (arg0.anInt1732 != -1) {
			local17 = Static266.aClass138_1.method3730(arg0.anInt1732).lb;
		} else if (Static74.method1294(arg0.anInt1738)) {
			@Pc(50) Class6_Sub46 local50 = (Class6_Sub46) Static347.aClass128_23.method3560((long) (int) arg0.aLong42);
			if (local50 != null) {
				@Pc(55) Class20_Sub2_Sub2_Sub1_Sub2 local55 = local50.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				@Pc(58) Class247 local58 = local55.aClass247_1;
				if (local58.anIntArray467 != null) {
					local58 = local58.method6613(Static279.aClass294_1);
				}
				if (local58 != null) {
					local17 = local58.anIntArray465;
				}
			}
		} else if (Static420.method6609(arg0.anInt1738)) {
			@Pc(96) Class312 local96;
			if (arg0.anInt1738 == 1008) {
				local96 = Static283.aClass210_2.method5629((int) arg0.aLong42);
			} else {
				local96 = Static283.aClass210_2.method5629((int) (arg0.aLong42 >>> 32 & 0x7FFFFFFFL));
			}
			if (local96.anIntArray565 != null) {
				local96 = local96.method7866(Static279.aClass294_1);
			}
			if (local96 != null) {
				local17 = local96.anIntArray563;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static109.method6911(local17);
		}
		@Pc(144) int local144 = Static31.aClass133_3.method3645(local15, Static428.aClass32Array16);
		if (arg0.aBoolean122) {
			local144 += Static581.aClass32_30.method5072() + 4;
		}
		return local144;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
	public static void method8288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static10.method210(local7.aClass20_Sub2_Sub3_2);
		Static10.method210(local7.aClass20_Sub2_Sub3_1);
		if (local7.aClass20_Sub2_Sub3_2 != null) {
			local7.aClass20_Sub2_Sub3_2 = null;
		}
		if (local7.aClass20_Sub2_Sub3_1 != null) {
			local7.aClass20_Sub2_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method8289(@OriginalArg(0) long arg0) {
		Static86.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static86.aCalendar3.get(7);
		@Pc(17) int local17 = Static86.aCalendar3.get(5);
		@Pc(21) int local21 = Static86.aCalendar3.get(2);
		@Pc(25) int local25 = Static86.aCalendar3.get(1);
		@Pc(29) int local29 = Static86.aCalendar3.get(11);
		@Pc(33) int local33 = Static86.aCalendar3.get(12);
		@Pc(44) int local44 = Static86.aCalendar3.get(13);
		return Static176.aStringArray76[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static130.aStringArray28[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}
}
