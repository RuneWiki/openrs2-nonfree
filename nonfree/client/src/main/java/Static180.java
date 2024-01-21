import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!we", name = "bc", descriptor = "Lclient!jc;")
	public static Class40 aClass40_41;

	@OriginalMember(owner = "client!we", name = "rc", descriptor = "I")
	public static int anInt4033;

	@OriginalMember(owner = "client!we", name = "sc", descriptor = "Lclient!jc;")
	public static Class40 aClass40_42;

	@OriginalMember(owner = "client!we", name = "Ib", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2422 = Static107.method1838(":trade:");

	@OriginalMember(owner = "client!we", name = "Kb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2423 = Static107.method1838("Ok");

	@OriginalMember(owner = "client!we", name = "Pb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2424 = aClass28_2423;

	@OriginalMember(owner = "client!we", name = "nc", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2426 = Static107.method1838(" ");

	@OriginalMember(owner = "client!we", name = "ac", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2425 = aClass28_2426;

	@OriginalMember(owner = "client!we", name = "ec", descriptor = "[I")
	public static int[] anIntArray369 = new int[32];

	@OriginalMember(owner = "client!we", name = "gc", descriptor = "I")
	public static int anInt4026 = 0;

	@OriginalMember(owner = "client!we", name = "ic", descriptor = "I")
	public static int anInt4028 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!eh;)V")
	public static void method2861(@OriginalArg(1) Class2_Sub4_Sub1_Sub1 arg0) {
		arg0.anInt1638 = 0;
		if (arg0.anInt1652 == 0) {
			arg0.anInt1623 = 1024;
		}
		@Pc(28) int local28 = arg0.anInt1618 * 64 + arg0.anInt1642 * 128;
		@Pc(34) int local34 = arg0.anInt1620 - Static156.anInt3491;
		@Pc(45) int local45 = arg0.anInt1598 * 128 + arg0.anInt1618 * 64;
		arg0.anInt1635 += (local45 - arg0.anInt1635) / local34;
		arg0.anInt1633 += (local28 - arg0.anInt1633) / local34;
		if (arg0.anInt1652 == 1) {
			arg0.anInt1623 = 1536;
		}
		if (arg0.anInt1652 == 2) {
			arg0.anInt1623 = 0;
		}
		if (arg0.anInt1652 == 3) {
			arg0.anInt1623 = 512;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
	public static void method2862() {
		@Pc(3) int local3 = Static149.anIntArray316[Static48.anInt1256];
		@Pc(7) Class54[] local7 = Static149.aClass54ArrayArray1[Static48.anInt1256];
		Static136.anInt3110 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class54 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt2670 == 1) {
				local27 = local16.anInt2677 + Static91.anInt2325 - Static30.anInt927;
				if (local27 >= 0 && local27 <= Static91.anInt2325 + Static91.anInt2325) {
					local42 = local16.anInt2667 + Static91.anInt2325 - Static72.anInt1868;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2671 + Static91.anInt2325 - Static72.anInt1868;
					if (local53 > Static91.anInt2325 + Static91.anInt2325) {
						local53 = Static91.anInt2325 + Static91.anInt2325;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static13.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static125.anInt2954 - local16.anInt2683;
						if (local85 > 32) {
							local16.anInt2687 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2687 = 2;
							local85 = -local85;
						}
						local16.anInt2675 = (local16.anInt2666 - Static14.anInt612 << 8) / local85;
						local16.anInt2680 = (local16.anInt2665 - Static14.anInt612 << 8) / local85;
						local16.anInt2681 = (local16.anInt2676 - Static95.anInt2362 << 8) / local85;
						local16.anInt2689 = (local16.anInt2679 - Static95.anInt2362 << 8) / local85;
						Static108.aClass54Array1[Static136.anInt3110++] = local16;
					}
				}
			} else if (local16.anInt2670 == 2) {
				local27 = local16.anInt2667 + Static91.anInt2325 - Static72.anInt1868;
				if (local27 >= 0 && local27 <= Static91.anInt2325 + Static91.anInt2325) {
					local42 = local16.anInt2677 + Static91.anInt2325 - Static30.anInt927;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2691 + Static91.anInt2325 - Static30.anInt927;
					if (local53 > Static91.anInt2325 + Static91.anInt2325) {
						local53 = Static91.anInt2325 + Static91.anInt2325;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static13.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static14.anInt612 - local16.anInt2666;
						if (local85 > 32) {
							local16.anInt2687 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2687 = 4;
							local85 = -local85;
						}
						local16.anInt2682 = (local16.anInt2683 - Static125.anInt2954 << 8) / local85;
						local16.anInt2686 = (local16.anInt2674 - Static125.anInt2954 << 8) / local85;
						local16.anInt2681 = (local16.anInt2676 - Static95.anInt2362 << 8) / local85;
						local16.anInt2689 = (local16.anInt2679 - Static95.anInt2362 << 8) / local85;
						Static108.aClass54Array1[Static136.anInt3110++] = local16;
					}
				}
			} else if (local16.anInt2670 == 4) {
				local27 = local16.anInt2676 - Static95.anInt2362;
				if (local27 > 128) {
					local42 = local16.anInt2667 + Static91.anInt2325 - Static72.anInt1868;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2671 + Static91.anInt2325 - Static72.anInt1868;
					if (local53 > Static91.anInt2325 + Static91.anInt2325) {
						local53 = Static91.anInt2325 + Static91.anInt2325;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt2677 + Static91.anInt2325 - Static30.anInt927;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt2691 + Static91.anInt2325 - Static30.anInt927;
						if (local85 > Static91.anInt2325 + Static91.anInt2325) {
							local85 = Static91.anInt2325 + Static91.anInt2325;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static13.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt2687 = 5;
							local16.anInt2682 = (local16.anInt2683 - Static125.anInt2954 << 8) / local27;
							local16.anInt2686 = (local16.anInt2674 - Static125.anInt2954 << 8) / local27;
							local16.anInt2675 = (local16.anInt2666 - Static14.anInt612 << 8) / local27;
							local16.anInt2680 = (local16.anInt2665 - Static14.anInt612 << 8) / local27;
							Static108.aClass54Array1[Static136.anInt3110++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!de;")
	public static RuntimeException_Sub1 method2863(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString1 = local5.aString1 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public static void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt2269; local12++) {
			@Pc(18) Class43 local18 = local7.aClass43Array56[local12];
			if ((local18.aLong83 >> 29 & 0x3L) == 2L && local18.anInt2326 == arg1 && local18.anInt2322 == arg2) {
				Static43.method773(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method2866() {
		aClass40_42 = null;
		aClass28_2426 = null;
		anIntArray369 = null;
		aClass40_41 = null;
		aClass28_2424 = null;
		aClass28_2423 = null;
		aClass28_2425 = null;
		aClass28_2422 = null;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(ILjava/awt/Component;)V")
	public static void method2867(@OriginalArg(1) Component arg0) {
		@Pc(1) Method local1 = Static134.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static45.aClass59_1);
		arg0.addFocusListener(Static45.aClass59_1);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!jc;Lclient!jc;Lclient!jc;Lclient!ec;)Z")
	public static boolean method2869(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2, @OriginalArg(4) Class2_Sub8_Sub1 arg3) {
		Static130.aClass40_32 = arg2;
		Static164.aClass2_Sub8_Sub1_2 = arg3;
		Static171.aClass40_37 = arg0;
		Static88.aClass40_26 = arg1;
		return true;
	}
}
