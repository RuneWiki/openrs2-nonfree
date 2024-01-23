import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dk", name = "Y", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!dk", name = "U", descriptor = "[I")
	public static int[] anIntArray109 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(III)I")
	public static int method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static126.method2412(4, arg0 + 91923, arg1 - -45365) + (Static126.method2412(2, arg0 + 37821, arg1 - -10294) - 128 >> 1) + (Static126.method2412(1, arg0, arg1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public static void method1013(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static9.method185(null, arg0, arg2, -1, arg1);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method1014(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(23) int local23 = 0; local23 < Static94.anInt4255; local23++) {
			@Pc(29) Class89 local29 = Static93.method2006(local23);
			if ((!arg0 || local29.aBoolean188) && local29.anInt3680 == -1 && local29.anInt3628 == -1 && local29.anInt3658 == 0 && local29.aString235.toLowerCase().indexOf(local8) != -1) {
				if (local10 >= 250) {
					Static147.anInt3575 = -1;
					Static82.aShortArray32 = null;
					return;
				}
				if (local10 >= local13.length) {
					@Pc(79) short[] local79 = new short[local13.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local10; local81++) {
						local79[local81] = local13[local81];
					}
					local13 = local79;
				}
				local13[local10++] = (short) local23;
			}
		}
		Static187.anInt4203 = 0;
		Static82.aShortArray32 = local13;
		Static147.anInt3575 = local10;
		@Pc(122) String[] local122 = new String[Static147.anInt3575];
		for (@Pc(124) int local124 = 0; local124 < Static147.anInt3575; local124++) {
			local122[local124] = Static93.method2006(local13[local124]).aString235;
		}
		Static42.method789(local122, Static82.aShortArray32);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method1015(@OriginalArg(1) Class51 arg0) {
		Static262.anInt5502 = arg0.method1866("p11_full");
		Static231.anInt5058 = arg0.method1866("p12_full");
		Static74.anInt2005 = arg0.method1866("b12_full");
		Static136.anInt3376 = arg0.method1866("mapfunction");
		Static207.anInt4554 = arg0.method1866("hitmarks");
		Static119.anInt3086 = arg0.method1866("hitbar_default");
		Static63.anInt1769 = arg0.method1866("headicons_pk");
		Static132.anInt3285 = arg0.method1866("headicons_prayer");
		Static4.anInt109 = arg0.method1866("hint_headicons");
		Static51.anInt1456 = arg0.method1866("hint_mapmarkers");
		Static85.anInt2426 = arg0.method1866("mapflag");
		Static204.anInt4527 = arg0.method1866("cross");
		Static68.anInt1405 = arg0.method1866("mapdots");
		Static109.anInt2900 = arg0.method1866("scrollbar");
		Static74.anInt2036 = arg0.method1866("name_icons");
		Static202.anInt4465 = arg0.method1866("floorshadows");
		Static266.anInt5552 = arg0.method1866("compass");
		Static137.anInt3325 = arg0.method1866("hint_mapedge");
	}
}
