import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_39 = new Class194(36, 11);

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
	public static int anInt2751 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;")
	public static String method2221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(21) String local21 = arg2[arg1];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(37) int local37 = arg1 + arg0;
			@Pc(39) int local39 = 0;
			for (@Pc(41) int local41 = arg1; local41 < local37; local41++) {
				@Pc(47) String local47 = arg2[local41];
				if (local47 == null) {
					local39 += 4;
				} else {
					local39 += local47.length();
				}
			}
			@Pc(70) StringBuffer local70 = new StringBuffer(local39);
			for (@Pc(72) int local72 = arg1; local72 < local37; local72++) {
				@Pc(78) String local78 = arg2[local72];
				if (local78 == null) {
					local70.append("null");
				} else {
					local70.append(local78);
				}
			}
			return local70.toString();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIBI)V")
	public static void method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static399.anInt6507 = arg2;
		Static199.anInt3310 = arg4;
		Static118.anInt2132 = arg1;
		Static230.anInt7236 = arg0;
		Static6.anInt110 = arg3;
		if (Static399.anInt6507 >= 100) {
			@Pc(26) int local26 = Static6.anInt110 * 128 + 64;
			@Pc(32) int local32 = Static118.anInt2132 * 128 + 64;
			@Pc(41) int local41 = Static192.method2572(local32, local26, Static6.anInt131) - Static230.anInt7236;
			@Pc(45) int local45 = local26 - Static116.anInt1977;
			@Pc(49) int local49 = local41 - Static444.anInt7360;
			@Pc(54) int local54 = local32 - Static393.anInt4184;
			@Pc(65) int local65 = (int) Math.sqrt((double) (local54 * local54 + local45 * local45));
			Static248.anInt3998 = (int) (Math.atan2((double) local49, (double) local65) * 2607.5945876176133D) & 0x3FFF;
			Static442.anInt7328 = (int) (Math.atan2((double) local45, (double) local54) * -2607.5945876176133D) & 0x3FFF;
			if (Static248.anInt3998 < 1024) {
				Static248.anInt3998 = 1024;
			}
			Static194.anInt3230 = 0;
			if (Static248.anInt3998 > 3072) {
				Static248.anInt3998 = 3072;
			}
		}
		Static449.anInt7379 = 2;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2224(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static244.anInt3939 >= 100 && !Static282.aBoolean288 || Static244.anInt3939 >= 200) {
			Static411.method5422(Static147.aClass198_48.method4012(Static38.anInt4834));
			return;
		}
		@Pc(29) String local29 = Static12.method193(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(80) String local80;
		for (@Pc(42) int local42 = 0; local42 < Static244.anInt3939; local42++) {
			@Pc(50) String local50 = Static12.method193(Static225.aStringArray27[local42]);
			if (local50 != null && local50.equals(local29)) {
				Static411.method5422(arg0 + Static300.aClass198_82.method4012(Static38.anInt4834));
				return;
			}
			if (Static88.aStringArray48[local42] != null) {
				local80 = Static12.method193(Static88.aStringArray48[local42]);
				if (local80 != null && local80.equals(local29)) {
					Static411.method5422(arg0 + Static300.aClass198_82.method4012(Static38.anInt4834));
					return;
				}
			}
		}
		for (@Pc(110) int local110 = 0; local110 < Static150.anInt2695; local110++) {
			local80 = Static12.method193(Static338.aStringArray36[local110]);
			if (local80 != null && local80.equals(local29)) {
				Static411.method5422(Static43.aClass198_97.method4012(Static38.anInt4834) + arg0 + Static86.aClass198_25.method4012(Static38.anInt4834));
				return;
			}
			if (Static65.aStringArray34[local110] != null) {
				@Pc(153) String local153 = Static12.method193(Static65.aStringArray34[local110]);
				if (local153 != null && local153.equals(local29)) {
					Static411.method5422(Static43.aClass198_97.method4012(Static38.anInt4834) + arg0 + Static86.aClass198_25.method4012(Static38.anInt4834));
					return;
				}
			}
		}
		if (Static12.method193(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65).equals(local29)) {
			Static411.method5422(Static63.aClass198_19.method4012(Static38.anInt4834));
		} else {
			Static288.method3576(Static287.aClass194_79);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(arg0));
			Static281.aClass5_Sub15_Sub2_13.method5545(arg0);
		}
	}
}
