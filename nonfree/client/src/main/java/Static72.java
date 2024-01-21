import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1113 = Static107.method1838("Loaded input handler");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1112 = aClass28_1113;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "J")
	public static volatile long aLong64 = 0L;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1114 = Static107.method1838("welle2:");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method1304() {
		@Pc(1) Object local1 = Static165.anObject3;
		synchronized (Static165.anObject3) {
			if (Static170.anInt4050 == 0) {
				Static76.aClass66_2.method2127(new Class34(), 5);
			}
			Static170.anInt4050 = 600;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!ud;")
	public static Class2_Sub4_Sub17 method1305(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub4_Sub17 local10 = (Class2_Sub4_Sub17) Static23.aClass14_38.method603((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static52.aClass40_15.method1771(3, arg0);
		local10 = new Class2_Sub4_Sub17();
		if (local20 != null) {
			local10.method2579(new Class2_Sub2(local20));
		}
		Static23.aClass14_38.method607((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method1308() {
		aClass28_1114 = null;
		aClass28_1113 = null;
		aClass28_1112 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ab;B)V")
	public static void method1309(@OriginalArg(0) Class2_Sub2 arg0) {
		@Pc(9) byte[] local9 = new byte[24];
		if (Static162.aClass5_5 != null) {
			@Pc(17) int local17;
			try {
				local17 = 0;
				Static162.aClass5_5.method391(0L);
				Static162.aClass5_5.method393(local9);
				while (local17 < 24 && local9[local17] == 0) {
					local17++;
				}
				if (local17 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local17 = 0; local17 < 24; local17++) {
					local9[local17] = -1;
				}
			}
		}
		arg0.method1706(24, local9);
	}
}
