import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!sg;")
	public static Class77 aClass77_979 = Static146.method2172(")1");

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Lclient!sg;")
	public static Class77 aClass77_980 = Static146.method2172("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!na", name = "F", descriptor = "Lclient!sg;")
	private static Class77 aClass77_983 = Static146.method2172(" from your friend list first)3");

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Lclient!sg;")
	public static Class77 aClass77_981 = aClass77_983;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "I")
	public static int anInt2514 = 1;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "Lclient!sg;")
	public static Class77 aClass77_982 = Static146.method2172("blinken1:");

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[I")
	public static int[] anIntArray402 = new int[50];

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!na", name = "J", descriptor = "I")
	public static int anInt2518 = 0;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "Lclient!sg;")
	public static Class77 aClass77_984 = Static146.method2172("Die Verbindung konnte");

	@OriginalMember(owner = "client!na", name = "L", descriptor = "Lclient!sg;")
	public static Class77 aClass77_985 = Static146.method2172("::gc");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZII)V")
	public static void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static27.aClass2_Sub2_Sub3_Sub3Array4[0].method1019(arg4, arg0);
		@Pc(23) int local23 = (arg1 - 32) * arg1 / arg3;
		if (local23 < 8) {
			local23 = 8;
		}
		@Pc(42) int local42 = (arg1 - local23 - 32) * arg2 / (arg3 - arg1);
		Static27.aClass2_Sub2_Sub3_Sub3Array4[1].method1019(arg4, arg1 + arg0 - 16);
		Static113.method1243(arg4, arg0 + 16, 16, arg1 - 32, Static144.anInt3528);
		Static113.method1243(arg4, local42 + arg0 + 16, 16, local23, Static50.anInt1382);
		Static113.method1248(arg4, arg0 + local42 + 16, local23, Static166.anInt4393);
		Static113.method1248(arg4 + 1, arg0 - (-16 - local42), local23, Static166.anInt4393);
		Static113.method1236(arg4, local42 + arg0 + 16, 16, Static166.anInt4393);
		Static113.method1236(arg4, local42 + arg0 + 17, 16, Static166.anInt4393);
		Static113.method1248(arg4 + 15, arg0 - -16 - -local42, local23, Static125.anInt3051);
		Static113.method1248(arg4 + 14, local42 + 17 + arg0, local23 - 1, Static125.anInt3051);
		Static113.method1236(arg4, local23 + arg0 + local42 + 15, 16, Static125.anInt3051);
		Static113.method1236(arg4 + 1, local23 + arg0 + 14 + local42, 15, Static125.anInt3051);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method1801(@OriginalArg(1) Class2_Sub18 arg0) {
		if (Static159.aClass89_5 != null) {
			try {
				Static159.aClass89_5.method3019(0L);
				Static159.aClass89_5.method3010(arg0.anInt3423, 24, arg0.aByteArray39);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt3423 += 24;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	public static void method1802() {
		@Pc(5) Object local5 = Static50.anObject1;
		synchronized (Static50.anObject1) {
			if (Static178.anInt4522 != 0) {
				Static178.anInt4522 = 1;
				try {
					Static50.anObject1.wait();
				} catch (@Pc(18) InterruptedException local18) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
	public static int method1803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub13 local8 = (Class2_Sub13) Static3.aClass74_1.method2433((long) arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local8.anIntArray336.length; local30++) {
				if (arg0 == local8.anIntArray335[local30]) {
					local28 += local8.anIntArray336[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)I")
	public static int method1804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 >>> 31;
		return (local8 + arg1) / arg0 - local8;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public static void method1805() {
		aBooleanArray9 = null;
		aClass77_985 = null;
		aClass77_981 = null;
		aClass77_980 = null;
		anIntArray402 = null;
		aClass77_979 = null;
		aClass77_984 = null;
		aClass77_982 = null;
		aClass77_983 = null;
	}
}
