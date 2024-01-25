import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "[S")
	public static final short[] aShortArray51 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method2774(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg2.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(78) char local78;
			if (local19 == '\u0000') {
				local78 = arg1.charAt(local15++);
			} else {
				local78 = local19;
			}
			local17 = Static242.method3587(local62);
			local19 = Static242.method3587(local78);
			local62 = Static373.method5113(local62, arg0);
			local78 = Static373.method5113(local78, arg0);
			if (local62 != local78 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local62 != local78) {
					return Static127.method2922(local62, arg0) - Static127.method2922(local78, arg0);
				}
			}
		}
		@Pc(145) int local145 = Math.min(local8, local11);
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			if (arg0 == 2) {
				local13 = local8 - local147 - 1;
				local15 = local11 - local147 - 1;
			} else {
				local15 = local147;
				local13 = local147;
			}
			@Pc(176) char local176 = arg2.charAt(local13);
			@Pc(180) char local180 = arg1.charAt(local15);
			if (local176 != local180 && Character.toUpperCase(local176) != Character.toUpperCase(local180)) {
				local176 = Character.toLowerCase(local176);
				local180 = Character.toLowerCase(local180);
				if (local176 != local180) {
					return Static127.method2922(local176, arg0) - Static127.method2922(local180, arg0);
				}
			}
		}
		@Pc(224) int local224 = local8 - local11;
		if (local224 != 0) {
			return local224;
		}
		for (@Pc(233) int local233 = 0; local233 < local145; local233++) {
			@Pc(239) char local239 = arg2.charAt(local233);
			@Pc(243) char local243 = arg1.charAt(local233);
			if (local239 != local243) {
				return Static127.method2922(local239, arg0) - Static127.method2922(local243, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	public static void method2775(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub1 local13 = Static258.method5559(arg0, 2);
		local13.method195();
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public static void method2776() {
		Static82.anInt1627 = 0;
		Static8.aClass266_2.method6004();
		Static108.aBoolean111 = false;
	}
}
