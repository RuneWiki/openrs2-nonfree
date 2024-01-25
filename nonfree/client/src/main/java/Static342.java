import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public static int anInt6002;

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "[Lclient!pt;")
	public static Class263[] aClass263Array1;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
	public static int anInt6008;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
	public static final int[] anIntArray322 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "[I")
	public static final int[] anIntArray323 = new int[14];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)I")
	public static int method5073(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5077(@OriginalArg(1) String arg0) {
		if (!Static564.aClass258_6.aBoolean524) {
			return -1;
		} else if (Static487.aHashtable9.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static416.method5936(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static173.aString19 + local20;
			if (!Static249.aClass322_87.method6822("", local33)) {
				return -1;
			} else if (Static249.aClass322_87.method6818(local33)) {
				@Pc(57) byte[] local57 = Static249.aClass322_87.method6810("", local33);
				@Pc(63) File local63;
				try {
					local63 = Static431.method6074(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local57 == null || local63 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static239.method3673(local63);
				if (local82 != null && local57.length == local82.length) {
					for (@Pc(99) int local99 = 0; local99 < local82.length; local99++) {
						if (local57[local99] != local82[local99]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static564.aClass258_6.method5879(local63, local57);
					}
				} catch (@Pc(127) Throwable local127) {
					return -1;
				}
				Static113.method1957(local63, arg0);
				return 100;
			} else {
				return Static249.aClass322_87.method6828(local33);
			}
		}
	}
}
