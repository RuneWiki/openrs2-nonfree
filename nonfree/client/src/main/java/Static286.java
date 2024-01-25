import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!vn;")
	public static Class352 aClass352_17;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public static int anInt5239 = -1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!ih;)V")
	public static void method4304(@OriginalArg(1) Class11_Sub6 arg0) {
		arg0.aClass11_Sub1_Sub1_Sub3_1 = null;
		if (Static370.anInt6680 < 20) {
			Static106.aClass196_2.method4032(arg0);
			Static370.anInt6680++;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method4305(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static568.aClass360ArrayArrayArray22 = Static156.aClass360ArrayArrayArray8;
			Static310.aClass129Array5 = Static150.aClass129Array4;
		} else {
			Static568.aClass360ArrayArrayArray22 = Static368.aClass360ArrayArrayArray18;
			Static310.aClass129Array5 = Static36.aClass129Array7;
		}
		Static119.anInt2474 = Static568.aClass360ArrayArrayArray22.length;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method4306() {
		@Pc(7) String local7 = "www";
		if (Static405.aClass93_6 == Static215.aClass93_2) {
			local7 = "www-wtrc";
		} else if (Static440.aClass93_7 == Static405.aClass93_6) {
			local7 = "www-wtqa";
		} else if (Static403.aClass93_5 == Static405.aClass93_6) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static9.aString2 != null) {
			local28 = "/p=" + Static9.aString2;
		}
		return "http://" + local7 + "." + Static101.aClass42_1.aString8 + ".com/l=" + Static161.anInt3095 + "/a=" + Static547.anInt9149 + local28 + "/";
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBLclient!kj;I)J")
	public static long method4307(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(19) Class178 local19 = Static347.aClass122_4.method2770(arg1.method7232());
		@Pc(40) long local40 = (long) (arg0 | 0x40000000 | arg2 << 7 | arg1.method7227() << 14 | arg1.method7230() << 20);
		if (local19.anInt4662 == 0) {
			local40 |= local7;
		}
		if (local19.anInt4628 == 1) {
			local40 |= local5;
		}
		return local40 | (long) arg1.method7232() << 32;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method4310() {
		Static131.method2303(Static86.aClass1_Sub30_Sub1_1.anInt6197);
		@Pc(18) int local18 = (Static393.anInt6978 >> 12) + (Static539.anInt9045 >> 3);
		Static240.anInt4414 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 = 0;
		@Pc(31) int local31 = (Static78.anInt1534 >> 12) + (Static311.anInt5708 >> 3);
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method2956(8, 8);
		Static408.anIntArray434 = new int[18];
		Static393.aByteArrayArray21 = new byte[18][];
		Static145.aByteArrayArray5 = new byte[18][];
		Static380.aByteArrayArray18 = new byte[18][];
		Static344.aByteArrayArray17 = new byte[18][];
		Static526.anIntArrayArray53 = new int[18][4];
		Static506.anIntArray529 = new int[18];
		Static91.anIntArray519 = new int[18];
		Static505.anIntArray528 = new int[18];
		Static578.aByteArrayArray27 = new byte[18][];
		Static526.anIntArray550 = new int[18];
		Static342.anIntArray376 = new int[18];
		@Pc(77) int local77 = 0;
		@Pc(97) int local97;
		for (@Pc(86) int local86 = (local18 - (Static458.anInt9736 >> 4)) / 8; local86 <= ((Static458.anInt9736 >> 4) + local18) / 8; local86++) {
			for (local97 = (local31 - (Static378.anInt6747 >> 4)) / 8; local97 <= ((Static378.anInt6747 >> 4) + local31) / 8; local97++) {
				@Pc(105) int local105 = local97 + (local86 << 8);
				Static91.anIntArray519[local77] = local105;
				Static506.anIntArray529[local77] = Static141.aClass308_56.method6558("m" + local86 + "_" + local97);
				Static505.anIntArray528[local77] = Static141.aClass308_56.method6558("l" + local86 + "_" + local97);
				Static526.anIntArray550[local77] = Static141.aClass308_56.method6558("n" + local86 + "_" + local97);
				Static342.anIntArray376[local77] = Static141.aClass308_56.method6558("um" + local86 + "_" + local97);
				Static408.anIntArray434[local77] = Static141.aClass308_56.method6558("ul" + local86 + "_" + local97);
				if (Static526.anIntArray550[local77] == -1) {
					Static506.anIntArray529[local77] = -1;
					Static505.anIntArray528[local77] = -1;
					Static342.anIntArray376[local77] = -1;
					Static408.anIntArray434[local77] = -1;
				}
				local77++;
			}
		}
		for (local97 = local77; local97 < Static526.anIntArray550.length; local97++) {
			Static526.anIntArray550[local97] = -1;
			Static506.anIntArray529[local97] = -1;
			Static505.anIntArray528[local97] = -1;
			Static342.anIntArray376[local97] = -1;
			Static408.anIntArray434[local97] = -1;
		}
		@Pc(285) byte local285;
		if (Static55.anInt1068 == 3) {
			local285 = 4;
		} else {
			local285 = 8;
		}
		Static549.method7484(local31, local18, false, local285);
	}
}
