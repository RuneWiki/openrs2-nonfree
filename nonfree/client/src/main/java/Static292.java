import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!ih;")
	public static Class31 aClass31_20;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!uu;")
	public static Class343 aClass343_147;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "B")
	public static byte aByte70;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static int anInt5626 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4813(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, local9 + arg1.length())) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(local9 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method4814() {
		if (Static242.aClass220_6 != Static38.aClass220_2) {
			try {
				Static652.method1818("tbrefresh", Static554.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BI)V")
	public static synchronized void method4815(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static143.anInt2900 < 1000) {
			Static352.aByteArrayArray17[Static143.anInt2900++] = arg0;
		} else if (arg0.length == 5000 && Static125.anInt4936 < 250) {
			Static489.aByteArrayArray20[Static125.anInt4936++] = arg0;
		} else if (arg0.length == 30000 && Static521.anInt8816 < 50) {
			Static513.aByteArrayArray24[Static521.anInt8816++] = arg0;
		} else if (Static542.aByteArrayArrayArray11 != null) {
			for (@Pc(70) int local70 = 0; local70 < Static331.anIntArray342.length; local70++) {
				if (Static331.anIntArray342[local70] == arg0.length && Static542.aByteArrayArrayArray11[local70].length > Static640.anIntArray663[local70]) {
					Static542.aByteArrayArrayArray11[local70][Static640.anIntArray663[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method4817(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static143.anInt2900 > 0) {
			local16 = Static352.aByteArrayArray17[--Static143.anInt2900];
			Static352.aByteArrayArray17[Static143.anInt2900] = null;
			return local16;
		} else if (arg0 == 5000 && Static125.anInt4936 > 0) {
			local16 = Static489.aByteArrayArray20[--Static125.anInt4936];
			Static489.aByteArrayArray20[Static125.anInt4936] = null;
			return local16;
		} else if (arg0 == 30000 && Static521.anInt8816 > 0) {
			local16 = Static513.aByteArrayArray24[--Static521.anInt8816];
			Static513.aByteArrayArray24[Static521.anInt8816] = null;
			return local16;
		} else {
			if (Static542.aByteArrayArrayArray11 != null) {
				for (@Pc(72) int local72 = 0; local72 < Static331.anIntArray342.length; local72++) {
					if (arg0 == Static331.anIntArray342[local72] && Static640.anIntArray663[local72] > 0) {
						@Pc(98) byte[] local98 = Static542.aByteArrayArrayArray11[local72][--Static640.anIntArray663[local72]];
						Static542.aByteArrayArrayArray11[local72][Static640.anIntArray663[local72]] = null;
						return local98;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
