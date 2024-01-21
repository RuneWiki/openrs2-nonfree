import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!nd", name = "mb", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!nd", name = "jc", descriptor = "I")
	public static int anInt2096;

	@OriginalMember(owner = "client!nd", name = "gb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1124 = Static106.method1849("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!nd", name = "Fb", descriptor = "I")
	public static int anInt2076 = 0;

	@OriginalMember(owner = "client!nd", name = "Zb", descriptor = "[I")
	public static int[] anIntArray342 = new int[128];

	@OriginalMember(owner = "client!nd", name = "hc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1126 = Static106.method1849(")1p");

	@OriginalMember(owner = "client!nd", name = "ic", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1127 = Static106.method1849(":");

	@OriginalMember(owner = "client!nd", name = "kc", descriptor = "I")
	public static final int anInt2097 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIBLclient!b;)V")
	public static void method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub2_Sub1 arg4) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static38.anInt2851 + anInt2076 & 0x7FF;
		@Pc(20) int local20 = arg0 * arg0 + arg2 * arg2;
		if (local20 > 6400) {
			return;
		}
		@Pc(30) int local30 = Class1_Sub1_Sub2_Sub4.anIntArray399[local12];
		@Pc(38) int local38 = local30 * 256 / (Static70.anInt712 + 256);
		@Pc(47) int local47 = Class1_Sub1_Sub2_Sub4.anIntArray397[local12];
		@Pc(55) int local55 = local47 * 256 / (Static70.anInt712 + 256);
		@Pc(65) int local65 = local55 * arg0 - arg2 * local38 >> 16;
		@Pc(75) int local75 = arg2 * local55 + local38 * arg0 >> 16;
		if (local20 > 2500) {
			arg4.method227(Static92.aClass1_Sub1_Sub2_Sub3_3, arg3 + local75 + 4 + 94 - arg4.anInt284 / 2, -(arg4.anInt288 / 2) + 83 + arg1 - local65 - 4);
		} else {
			arg4.method250(arg3 + local75 + 4 + 94 - arg4.anInt284 / 2, arg1 + (83 - local65 - (arg4.anInt288 / 2 + 4)));
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!sf;Lclient!sf;BZ)V")
	public static void method1444(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) boolean arg2) {
		Static54.aClass5_50 = arg0;
		Static20.aClass5_21 = arg1;
		Static95.aBoolean103 = arg2;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1446(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static117.aClass56_1);
		arg0.removeFocusListener(Static117.aClass56_1);
		Static13.anInt463 = -1;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	public static void method1448() {
		aClass66_1124 = null;
		aClass66_1126 = null;
		anIntArray342 = null;
		Class1_Sub1_Sub9.anIntArray340 = null;
		aClass66_1127 = null;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public static void method1449() {
		Static127.aClass1_Sub12_Sub1_2.method1227(119);
		Static127.aClass1_Sub12_Sub1_2.method1195((long) 0);
	}
}
