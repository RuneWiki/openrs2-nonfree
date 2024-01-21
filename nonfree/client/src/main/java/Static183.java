import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	public static int anInt3928;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray46;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!wd;")
	public static Class97 aClass97_21 = new Class97(8);

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1860 = Static187.method3089("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1861 = Static187.method3089("k");

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1862 = Static187.method3089("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1863 = Static187.method3089("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!u", name = "F", descriptor = "I")
	public static int anInt3929 = 1;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	public static int anInt3930 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ve;IILclient!s;)V")
	public static void method2954(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class83 arg2) {
		@Pc(3) Class1_Sub23 local3 = new Class1_Sub23();
		local3.aClass3_Sub1_22 = arg0;
		local3.aClass83_1 = arg2;
		local3.aLong251 = arg1;
		local3.anInt3194 = 1;
		@Pc(26) Class20 local26 = Static164.aClass20_18;
		synchronized (Static164.aClass20_18) {
			Static164.aClass20_18.method466(local3);
		}
		Static173.method2739();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ab;III)[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] method2955(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static42.method736(arg0, arg1, arg2) ? Static138.method2072() : null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public static void method2956(@OriginalArg(0) int arg0) {
		Static147.method2192();
		Static8.method162();
		@Pc(25) int local25 = Static169.method2638(arg0).anInt1160;
		if (local25 == 0) {
			return;
		}
		@Pc(35) int local35 = Static84.anIntArray156[arg0];
		if (local25 == 1) {
			Static176.anInt3799 = local35;
			if (Static176.anInt3799 == 1) {
				Static174.method2850(0.9F);
			}
			if (Static176.anInt3799 == 2) {
				Static174.method2850(0.8F);
			}
			if (Static176.anInt3799 == 3) {
				Static174.method2850(0.7F);
			}
			if (Static176.anInt3799 == 4) {
				Static174.method2850(0.6F);
			}
			Static88.method1303();
		}
		if (local25 == 3) {
			@Pc(73) short local73 = 0;
			if (local35 == 0) {
				local73 = 255;
			}
			if (local35 == 1) {
				local73 = 192;
			}
			if (local35 == 2) {
				local73 = 128;
			}
			if (local35 == 3) {
				local73 = 64;
			}
			if (local35 == 4) {
				local73 = 0;
			}
			if (local73 != Static22.anInt552) {
				if (Static22.anInt552 == 0 && Static170.anInt3548 != -1) {
					Static99.method3061(local73, Static170.anInt3548, Static166.aClass3_Sub1_23);
					Static156.aBoolean183 = false;
				} else if (local73 == 0) {
					Static39.method720();
					Static156.aBoolean183 = false;
				} else {
					Static140.method2080(local73);
				}
				Static22.anInt552 = local73;
			}
		}
		if (local25 == 9) {
			Static60.anInt1457 = local35;
		}
		if (local25 == 5) {
			Static141.anInt2817 = local35;
		}
		if (local25 == 10) {
			if (local35 == 0) {
				Static185.anInt3997 = 127;
			}
			if (local35 == 1) {
				Static185.anInt3997 = 96;
			}
			if (local35 == 2) {
				Static185.anInt3997 = 64;
			}
			if (local35 == 3) {
				Static185.anInt3997 = 32;
			}
			if (local35 == 4) {
				Static185.anInt3997 = 0;
			}
		}
		if (local25 == 4) {
			if (local35 == 0) {
				Static123.anInt2601 = 127;
			}
			if (local35 == 1) {
				Static123.anInt2601 = 96;
			}
			if (local35 == 2) {
				Static123.anInt2601 = 64;
			}
			if (local35 == 3) {
				Static123.anInt2601 = 32;
			}
			if (local35 == 4) {
				Static123.anInt2601 = 0;
			}
		}
		if (local25 == 6) {
			Static117.anInt2497 = local35;
		}
	}
}
