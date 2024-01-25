import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public static final int anInt7607 = 1337;

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_13 = new Class222(10, 2, 2, 0);

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "[I")
	public static final int[] anIntArray549 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_100 = new Class179(48, 12);

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_11 = new Class168(1, 8);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(JI)V")
	public static void method6412(@OriginalArg(0) long arg0) {
		if (Static28.aClass53ArrayArrayArray1 != null) {
			if (Static445.anInt7122 == 1 || Static445.anInt7122 == 5) {
				Static524.method7271(arg0);
			} else if (Static445.anInt7122 == 4) {
				Static7.method111(arg0);
			}
		}
		Static568.method7795((long) Static262.anInt5597, Static192.aClass95_4);
		if (Static38.anInt777 != -1) {
			Static564.method7730(Static38.anInt777);
		}
		for (@Pc(43) int local43 = 0; local43 < Static385.anInt6044; local43++) {
			if (Static69.aBooleanArray25[local43]) {
				Static498.aBooleanArray144[local43] = true;
			}
			Static556.aBooleanArray182[local43] = Static69.aBooleanArray25[local43];
			Static69.aBooleanArray25[local43] = false;
		}
		Static170.anInt9509 = Static262.anInt5597;
		Static70.method970(-1, -1, null);
		Static415.method5565(-1, null, -1);
		if (Static38.anInt777 != -1) {
			Static385.anInt6044 = 0;
			Static23.method426();
		}
		Static192.aClass95_4.la();
		Static170.method7975(Static192.aClass95_4);
		@Pc(100) int local100 = Static522.method7266();
		if (local100 == -1) {
			local100 = Static144.anInt2622;
		}
		if (local100 == -1) {
			local100 = Static473.anInt7592;
		}
		Static224.method3106(local100);
		@Pc(121) int local121 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() << 8;
		Static162.method2431(local121 + Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089, Static544.anInt9305, local121 + Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127);
		Static544.anInt9305 = 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)J")
	public static synchronized long method6413() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static357.aLong153) {
			Static379.aLong168 += Static357.aLong153 - local10;
		}
		Static357.aLong153 = local10;
		return Static379.aLong168 + local10;
	}
}
