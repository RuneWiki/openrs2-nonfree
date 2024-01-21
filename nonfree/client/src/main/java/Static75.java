import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array5;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static int anInt1775;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_550 = Static129.method2060("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!r;")
	private static Class61 aClass61_551 = Static129.method2060("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!r;")
	private static Class61 aClass61_552 = Static129.method2060("The server is being updated)3");

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_553 = aClass61_551;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_554 = Static129.method2060("rot:");

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient!ge;")
	public static Class29 aClass29_19 = new Class29(64);

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_555 = aClass61_552;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!t;IIZ)V")
	public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub2_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10 == arg1 || Static36.anInt1015 >= 400) {
			return;
		}
		@Pc(59) Class61 local59;
		if (arg1.anInt2943 == 0) {
			local59 = Static123.method1929(new Class61[] { arg1.aClass61_877, Static55.method1001(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2934, arg1.anInt2934), Static36.aClass61_305, Static121.aClass61_958, Static39.method730(arg1.anInt2934), Static8.aClass61_76 });
		} else {
			local59 = Static123.method1929(new Class61[] { arg1.aClass61_877, Static36.aClass61_305, Static109.aClass61_843, Static39.method730(arg1.anInt2943), Static8.aClass61_76 });
		}
		@Pc(131) int local131;
		if (Static123.anInt3071 == 1) {
			Static92.method1470(Static30.aClass61_277, arg3, Static123.method1929(new Class61[] { Static86.aClass61_673, Static123.aClass61_970, local59 }), arg0, arg2, 33);
		} else if (!Static32.aBoolean27) {
			for (local131 = 7; local131 >= 0; local131--) {
				if (Static77.aClass61Array13[local131] != null) {
					@Pc(143) short local143 = 0;
					if (Static77.aClass61Array13[local131].method1709(Static91.aClass61_719)) {
						if (arg1.anInt2934 > Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2934) {
							local143 = 2000;
						}
						if (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2938 != 0 && arg1.anInt2938 != 0) {
							if (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2938 == arg1.anInt2938) {
								local143 = 2000;
							} else {
								local143 = 0;
							}
						}
					} else if (Static91.aBooleanArray11[local131]) {
						local143 = 2000;
					}
					@Pc(195) int local195 = Static105.anIntArray443[local131] + local143;
					Static92.method1470(Static77.aClass61Array13[local131], arg3, Static123.method1929(new Class61[] { Static57.aClass61_447, local59 }), arg0, arg2, local195);
				}
			}
		} else if ((Static73.anInt1738 & 0x8) == 8) {
			Static92.method1470(Static91.aClass61_717, arg3, Static123.method1929(new Class61[] { Static50.aClass61_396, Static123.aClass61_970, local59 }), arg0, arg2, 14);
		}
		for (local131 = 0; local131 < Static36.anInt1015; local131++) {
			if (Static38.anIntArray223[local131] == 41) {
				Static107.aClass61Array19[local131] = Static123.method1929(new Class61[] { Static57.aClass61_447, local59 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method1196() {
		aClass61_554 = null;
		aByteArrayArrayArray4 = null;
		aClass61_552 = null;
		aClass61_553 = null;
		aClass29_19 = null;
		aClass61_555 = null;
		aClass5_Sub2_Sub1_Sub4Array5 = null;
		aClass61_551 = null;
		aClass61_550 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public static void method1197() {
		for (@Pc(10) Class5_Sub4 local10 = (Class5_Sub4) Static97.aClass58_57.method1669(); local10 != null; local10 = (Class5_Sub4) Static97.aClass58_57.method1664()) {
			if (local10.anInt257 == -1) {
				local10.anInt264 = 0;
				Static77.method1250(local10);
			} else {
				local10.method2189();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method1198() {
		for (@Pc(15) Class5_Sub13 local15 = (Class5_Sub13) Static28.aClass20_3.method655(); local15 != null; local15 = (Class5_Sub13) Static28.aClass20_3.method649()) {
			@Pc(20) int local20 = local15.anInt2013;
			if (Static21.method461(local20)) {
				@Pc(26) boolean local26 = true;
				@Pc(30) Class5_Sub11[] local30 = Static56.aClass5_Sub11ArrayArray1[local20];
				for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
					if (local30[local32] != null) {
						local26 = local30[local32].aBoolean66;
						break;
					}
				}
				if (!local26) {
					@Pc(56) int local56 = (int) local15.aLong100;
					@Pc(62) Class5_Sub11 local62 = Static88.method2191(local56);
					if (local62 != null) {
						Static24.method505(local62);
					}
				}
			}
		}
	}
}
