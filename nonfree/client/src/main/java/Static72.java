import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cia", name = "l", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!cia", name = "k", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_5 = new Class101(7, 19);

	@OriginalMember(owner = "client!cia", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!cia", name = "p", descriptor = "I")
	public static int anInt2387 = 0;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)I")
	public static int method2063() {
		return Static6.anIntArray10 == null ? 0 : Static6.anIntArray10.length * 2;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!bd;I)V")
	public static void method2064(@OriginalArg(0) Class9_Sub2 arg0) {
		arg0.aClass9_Sub4_1 = null;
		@Pc(20) int local20 = arg0.aClass9_Sub6Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			arg0.aClass9_Sub6Array1[local22].aBoolean490 = false;
		}
		@Pc(40) Class234[] local40 = Class6_Sub5_Sub1_Sub2.aClass234Array1;
		synchronized (Class6_Sub5_Sub1_Sub2.aClass234Array1) {
			if (Class6_Sub5_Sub1_Sub2.aClass234Array1.length > local20 && Static3.anIntArray1[local20] < 200) {
				Class6_Sub5_Sub1_Sub2.aClass234Array1[local20].method6097(arg0);
				@Pc(63) int local63 = Static3.anIntArray1[local20]++;
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(JJ)J")
	public static long method2066(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2068(@OriginalArg(1) String arg0) {
		if (!Static429.aClass104_2.aBoolean290) {
			return -1;
		} else if (Static236.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static282.method4944(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static582.aString104 + local20;
			if (!Static398.aClass223_86.method5946("", local33)) {
				return -1;
			} else if (Static398.aClass223_86.method5950(local33)) {
				@Pc(62) byte[] local62 = Static398.aClass223_86.method5948(local33, "");
				@Pc(68) File local68;
				try {
					local68 = Static546.method7686(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static478.method7047(local68);
				if (local82 != null && local82.length == local62.length) {
					for (@Pc(91) int local91 = 0; local91 < local82.length; local91++) {
						if (local62[local91] != local82[local91]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static429.aClass104_2.method3145(local62, local68);
					}
				} catch (@Pc(127) Throwable local127) {
					return -1;
				}
				Static396.method6256(local68, arg0);
				return 100;
			} else {
				return Static398.aClass223_86.method5957(local33);
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIIIIIB)I")
	public static int method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(19) int local19 = arg5;
			arg5 = arg0;
			arg0 = local19;
		}
		if (local7 == 0) {
			return arg4;
		} else if (local7 == 1) {
			return 1 + 7 - arg5 - arg3;
		} else if (local7 == 2) {
			return 7 + 1 - arg4 - arg0;
		} else {
			return arg3;
		}
	}
}
