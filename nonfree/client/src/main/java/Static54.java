import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 aClass5_Sub2_Sub1_Sub4_4;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array7 = new Class61[1000];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!pa;)V")
	public static void method987(@OriginalArg(1) Class5_Sub14 arg0) {
		if (Static82.aClass8_5 != null) {
			try {
				Static82.aClass8_5.method166(0L);
				Static82.aClass8_5.method164(arg0.aByteArray33, 24, arg0.anInt2199);
			} catch (@Pc(22) Exception local22) {
			}
		}
		arg0.anInt2199 += 24;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!jf;Z)V")
	public static void method988(@OriginalArg(0) int arg0, @OriginalArg(1) Class26_Sub1 arg1) {
		if (Static23.aClass5_Sub14_1 == null) {
			Static25.method507(255, true, 0, (byte) 0, 255, null);
			Static40.aClass26_Sub1Array1[arg0] = arg1;
		} else {
			Static23.aClass5_Sub14_1.anInt2199 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static23.aClass5_Sub14_1.method1461();
			@Pc(20) int local20 = Static23.aClass5_Sub14_1.method1461();
			arg1.method1048(local16, local20);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	public static void method991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static97.anInt2547 == 2) {
			Static58.method1016(Static48.anInt1243 + (Static1.anInt16 - Static19.anInt623 << 7), Static100.anInt2584 + (-Static25.anInt730 + Static33.anInt998 << 7), Static88.anInt3388 * 2);
			if (Static124.anInt3091 > -1 && Static58.anInt1422 % 20 < 10) {
				Static100.aClass5_Sub2_Sub1_Sub4Array7[0].method2021(arg0 + Static124.anInt3091 - 12, arg1 + -28 + Static42.anInt1103);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
	public static void method993() {
		aClass5_Sub2_Sub1_Sub4_4 = null;
		aClass61Array7 = null;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method994() {
		if (Static81.aClass30_14 != null) {
			Static81.aClass30_14.method779();
		}
	}
}
