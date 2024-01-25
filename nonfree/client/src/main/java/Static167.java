import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
	public static int anInt3394;

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
	public static int anInt3396;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIII)V")
	public static void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static523.anIntArrayArray120 != null) {
			Static523.anIntArrayArray120[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static200.aShortArrayArray3 != null) {
			Static200.aShortArrayArray3[arg0][arg1] = (short) arg3;
		}
		if (Static278.aByteArrayArray16 != null) {
			Static278.aByteArrayArray16[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Z")
	public static boolean method3162(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)Z")
	public static boolean method3163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static238.aBoolean354) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static511.aClass91ArrayArray2[local18] == null || Static511.aClass91ArrayArray2[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class91 local40 = Static511.aClass91ArrayArray2[local18][local22];
		@Pc(52) Class1_Sub25 local52;
		if (arg0 == -1 && local40.anInt2452 == 0) {
			for (local52 = (Class1_Sub25) Static105.aClass295_10.method7543(); local52 != null; local52 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
				if (local52.anInt4365 == 48 || local52.anInt4365 == 1009 || local52.anInt4365 == 47 || local52.anInt4365 == 20 || local52.anInt4365 == 30) {
					for (@Pc(83) Class91 local83 = Static384.method6156(local52.anInt4371); local83 != null; local83 = Static68.method1682(local83)) {
						if (local40.anInt2368 == local83.anInt2368) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class1_Sub25) Static105.aClass295_10.method7543(); local52 != null; local52 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
				if (arg0 == local52.anInt4363 && local40.anInt2368 == local52.anInt4371 && (local52.anInt4365 == 48 || local52.anInt4365 == 1009 || local52.anInt4365 == 47 || local52.anInt4365 == 20 || local52.anInt4365 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(BII)Z")
	public static boolean method3164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(IBI)V")
	public static void method3166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub16 local12 = Static422.method6588(5, arg0);
		local12.method6693();
		local12.anInt7487 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3167(@OriginalArg(1) String arg0) {
		if (Static380.anInt6743 == 3) {
			return -1;
		} else if (Static311.aHashtable4.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static248.method4352(arg0);
			@Pc(31) String local31 = Static529.aString217 + local22;
			if (!Static352.aClass69_70.method1897("", local31)) {
				return -1;
			} else if (Static352.aClass69_70.method1908(local31)) {
				@Pc(60) byte[] local60 = Static352.aClass69_70.method1900("", local31);
				@Pc(67) File local67 = Static133.aClass229_15.method6076(local22);
				if (local60 == null || local67 == null) {
					return -1;
				}
				@Pc(73) boolean local73 = true;
				@Pc(77) byte[] local77 = Static212.method3943(local67);
				if (local77 != null && local77.length == local60.length) {
					for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
						if (local77[local86] != local60[local86]) {
							local73 = false;
							break;
						}
					}
				} else {
					local73 = false;
				}
				if (!local73) {
					Static133.aClass229_15.method6062(local67, local60);
				}
				Static228.method4099(arg0, local67);
				return 100;
			} else {
				return Static352.aClass69_70.method1907(local31);
			}
		}
	}
}
