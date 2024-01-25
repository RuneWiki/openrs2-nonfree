import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ae", name = "hd", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!ae", name = "Sc", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_2 = new Class32("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ae", name = "bd", descriptor = "I")
	public static int anInt131 = 3;

	@OriginalMember(owner = "client!ae", name = "cd", descriptor = "Lclient!hq;")
	public static final Class101 aClass101_1 = new Class101("", 13);

	@OriginalMember(owner = "client!ae", name = "id", descriptor = "I")
	public static int anInt135 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!ed;")
	public static Class2_Sub10_Sub6 method74(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub10_Sub6 local12 = (Class2_Sub10_Sub6) Static154.aClass166_3.method3688((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = Static265.aClass171_66.method3745(1, arg0);
		} else {
			local30 = Static331.aClass171_86.method3745(1, arg0 & 0x7FFF);
		}
		local12 = new Class2_Sub10_Sub6();
		if (local30 != null) {
			local12.method1142(new Class2_Sub16(local30));
		}
		if (arg0 >= 32768) {
			local12.method1139();
		}
		Static154.aClass166_3.method3693((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method77() {
		if (!Static344.method4219()) {
			return;
		}
		if (Static79.aStringArray120 == null) {
			Static38.method688();
		}
		Static366.anInt6204 = 0;
		Static16.aBooleanArray6 = new boolean[100];
		Static38.aBoolean60 = true;
		Static217.anIntArray772 = new int[100];
		Static210.anIntArray754 = new int[100];
		Static263.anIntArray893 = new int[100];
		for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
			Static210.anIntArray754[local28] = (int) ((double) Static253.anInt4467 * Math.random());
			Static263.anIntArray893[local28] = (int) (Math.random() * 350.0D);
			Static217.anIntArray772[local28] = (int) (Math.random() * 102.0D);
			Static16.aBooleanArray6[local28] = Math.random() < 0.5D;
		}
		try {
			Static309.aClipboard1 = Static387.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(74) Exception local74) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZB)Z")
	public static boolean method78(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static111.aClass63_3.method1974();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static111.aClass63_3.method2001();
		} else if (!Static111.aClass63_3.method1996()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static262.aBoolean340 = arg0;
			Static164.method2916(Static359.aClass111_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIII)V")
	public static void method80(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg3 >= arg0) {
			for (local18 = arg0; local18 < arg3; local18++) {
				Static15.anIntArrayArray1[local18][arg1] = arg2;
			}
		} else {
			for (local18 = arg3; local18 < arg0; local18++) {
				Static15.anIntArrayArray1[local18][arg1] = arg2;
			}
		}
	}
}
