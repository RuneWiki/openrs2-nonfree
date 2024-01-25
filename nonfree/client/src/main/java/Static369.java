import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt6328;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public static int anInt6329;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5492(@OriginalArg(0) String arg0) {
		if (Static190.aStringArray24 == null) {
			Static393.method5784();
		}
		Static221.aCalendar3.setTime(new Date(Static587.method7753()));
		@Pc(28) int local28 = Static221.aCalendar3.get(11);
		@Pc(32) int local32 = Static221.aCalendar3.get(12);
		@Pc(36) int local36 = Static221.aCalendar3.get(13);
		@Pc(70) String local70 = Integer.toString(local28 / 10) + local28 % 10 + ":" + local32 / 10 + local32 % 10 + ":" + local36 / 10 + local36 % 10;
		@Pc(75) String[] local75 = Static583.method7710('\n', arg0);
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			for (@Pc(81) int local81 = Static536.anInt8399; local81 > 0; local81--) {
				Static190.aStringArray24[local81] = Static190.aStringArray24[local81 - 1];
			}
			Static190.aStringArray24[0] = local70 + ": " + local75[local77];
			if (Static190.aStringArray24.length - 1 > Static536.anInt8399) {
				if (Static442.anInt8541 > 0) {
					Static442.anInt8541++;
				}
				Static536.anInt8399++;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!sh;)I")
	public static int method5493(@OriginalArg(1) Class307 arg0) {
		if (Static337.aClass307_3 == arg0) {
			return 9216;
		} else if (arg0 == Static28.aClass307_1) {
			return 34065;
		} else if (arg0 == Static390.aClass307_4) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!an;[IZI)V")
	public static void method5494(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray515 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray515.length; local8++) {
				if (arg1[local8] != arg0.anIntArray515[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt6453 != -1) {
				@Pc(41) Class17 local41 = Static330.aClass279_2.method6216(arg0.anInt6453);
				@Pc(44) int local44 = local41.anInt555;
				if (local44 == 1) {
					arg0.anInt6440 = 1;
					arg0.anInt6385 = 0;
					arg0.anInt6438 = arg2;
					arg0.anInt6423 = 0;
					arg0.anInt6441 = 0;
					Static351.method5300(arg0.anInt6385, local41, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, false);
				}
				if (local44 == 2) {
					arg0.anInt6423 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray515 == null || arg0.anIntArray515[local8] == -1 || Static330.aClass279_2.method6216(arg1[local8]).anInt559 >= Static330.aClass279_2.method6216(arg0.anIntArray515[local8]).anInt559) {
				arg0.anIntArray515 = arg1;
				arg0.anInt6438 = arg2;
				arg0.anInt6469 = arg0.anInt6468;
			}
		}
		if (local6) {
			arg0.anIntArray515 = arg1;
			arg0.anInt6469 = arg0.anInt6468;
			arg0.anInt6438 = arg2;
		}
	}
}
