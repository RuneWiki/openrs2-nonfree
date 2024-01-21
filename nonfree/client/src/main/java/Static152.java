import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3 aClass4_Sub1_Sub7_Sub3_4;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1281 = Static177.method3050("Benutzername: ");

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1282 = Static177.method3050("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1283 = Static177.method3050("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt3459 = 0;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1284 = Static177.method3050("(R");

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1285 = Static177.method3050("m");

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[Lclient!jc;")
	public static final Class4_Sub1_Sub1_Sub1_Sub1[] aClass4_Sub1_Sub1_Sub1_Sub1Array1 = new Class4_Sub1_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2601(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static150.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.addKeyListener(Static71.aClass88_1);
		arg0.addFocusListener(Static71.aClass88_1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)V")
	public static void method2602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class92[] local8 = Static121.aClass92Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class92 local16 = local8[local10];
			if (local16 != null && local16.anInt4005 == 2) {
				Static94.method1841(local16.anInt4003 * 2, local16.anInt3999 + (local16.anInt3996 - Static103.anInt2610 << 7), (-Static184.anInt4144 + local16.anInt4004 << 7) + local16.anInt3995);
				if (Static162.anInt3591 > -1 && Static142.anInt3325 % 20 < 10) {
					Static186.aClass4_Sub1_Sub7_Sub2Array12[local16.anInt4001].method2538(arg0 + Static162.anInt3591 - 12, Static48.anInt1228 + (arg1 - 28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!h;IB)Lclient!jd;")
	public static Class46 method2608(@OriginalArg(0) Class4_Sub11 arg0) {
		try {
			@Pc(12) Class46 local12 = new Class46();
			local12.anInt2141 = arg0.method1240();
			if (local12.anInt2141 > 32767) {
				local12.anInt2141 = 32767;
			}
			local12.aByteArray20 = new byte[local12.anInt2141];
			arg0.anInt1597 += Static55.aClass82_1.method2695(local12.aByteArray20, arg0.anInt1597, 0, local12.anInt2141, arg0.aByteArray19);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static79.aClass46_756;
		}
	}
}
