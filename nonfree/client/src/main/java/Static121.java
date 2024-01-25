import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public static int anInt2306;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!gs;")
	public static Class104 aClass104_2;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_1 = new Class44(14, 1);

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_2 = new Class44(15, 4);

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_3 = new Class44(16, -2);

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_4 = new Class44(17, 0);

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_5 = new Class44(18, -2);

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_6 = new Class44(20, 6);

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_7 = new Class44(21, 8);

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_8 = new Class44(22, -2);

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_9 = new Class44(23, 4);

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!ck;")
	public static final Class44 aClass44_10 = new Class44(24, -1);

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
	public static final int[] anIntArray127 = new int[8];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!hh;ILclient!hh;Lclient!hh;Lclient!hh;)V")
	public static void method1883(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) Class109 arg2, @OriginalArg(4) Class109 arg3) {
		Static176.aClass109_45 = arg3;
		Static168.aClass109_38 = arg2;
		Static361.aClass109_81 = arg0;
		Static2.aClass109_1 = arg1;
		Static276.aClass229ArrayArray1 = new Class229[Static2.aClass109_1.method2324()][];
		Static65.aBooleanArray5 = new boolean[Static2.aClass109_1.method2324()];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(CB)C")
	public static char method1886(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method1887(@OriginalArg(0) Class47_Sub1_Sub5_Sub2 arg0) {
		@Pc(16) Class1_Sub25 local16 = (Class1_Sub25) Static254.aClass51_14.method930((long) arg0.anInt5358);
		if (local16 == null) {
			return;
		}
		if (local16.aClass1_Sub5_Sub2_3 != null) {
			Static292.aClass1_Sub5_Sub1_2.method423(local16.aClass1_Sub5_Sub2_3);
			local16.aClass1_Sub5_Sub2_3 = null;
		}
		local16.method5965();
	}
}
