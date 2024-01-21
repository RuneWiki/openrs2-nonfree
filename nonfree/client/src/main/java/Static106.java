import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt2834;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1295 = Static24.method441(")1");

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1296 = Static24.method441("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt2836 = 0;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
	public static int[] anIntArray413 = new int[5];

	@OriginalMember(owner = "client!w", name = "i", descriptor = "I")
	public static int anInt2837 = 99;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1297 = Static24.method441("@whi@ )4 ");

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	public static int anInt2843 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!fe;)Lclient!wb;")
	public static Class65 method1746(@OriginalArg(1) Class2_Sub8 arg0) {
		return Static90.method832(arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method1747() {
		@Pc(5) Object local5 = Static28.anObject2;
		synchronized (Static28.anObject2) {
			if (Static20.anInt625 != 0) {
				Static20.anInt625 = 1;
				try {
					Static28.anObject2.wait();
				} catch (@Pc(16) InterruptedException local16) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BJ)V")
	public static void method1748(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method1749() {
		aClass65_1296 = null;
		aClass65_1295 = null;
		anIntArray413 = null;
		aClass65_1297 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V")
	public static void method1750(@OriginalArg(1) boolean arg0) {
		Static77.anInt2240++;
		if (Static77.anInt2240 < 50 && !arg0) {
			return;
		}
		Static77.anInt2240 = 0;
		if (Static13.aBoolean33 || Static41.aClass13_3 == null) {
			return;
		}
		Static12.aClass2_Sub8_Sub1_8.method1425(196);
		try {
			Static41.aClass13_3.method313(Static12.aClass2_Sub8_Sub1_8.anInt2342, Static12.aClass2_Sub8_Sub1_8.aByteArray59);
			Static12.aClass2_Sub8_Sub1_8.anInt2342 = 0;
		} catch (@Pc(42) IOException local42) {
			Static13.aBoolean33 = true;
		}
	}
}
