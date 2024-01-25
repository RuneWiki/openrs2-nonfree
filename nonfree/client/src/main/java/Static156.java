import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
	public static int anInt3023;

	@OriginalMember(owner = "client!jp", name = "Q", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Loading fonts - ";

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBI)I")
	public static int method2485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub43 local15 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && local15.anIntArray560.length > arg1) {
			return local15.anIntArray560[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg2);
		@Pc(17) int local17 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg0);
		@Pc(23) int local23 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4);
		@Pc(29) int local29 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg6);
		@Pc(37) int local37 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg3 + arg2);
		@Pc(46) int local46 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg0 - arg3);
		for (@Pc(52) int local52 = local11; local52 < local37; local52++) {
			Static162.method1731(local29, Static196.anIntArrayArray37[local52], local23, arg5);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static162.method1731(local29, Static196.anIntArrayArray37[local68], local23, arg5);
		}
		@Pc(91) int local91 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 + arg3);
		@Pc(99) int local99 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg6 - arg3);
		for (@Pc(101) int local101 = local37; local101 <= local46; local101++) {
			@Pc(107) int[] local107 = Static196.anIntArrayArray37[local101];
			Static162.method1731(local91, local107, local23, arg5);
			Static162.method1731(local99, local107, local91, arg1);
			Static162.method1731(local29, local107, local99, arg5);
		}
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(Z)V")
	public static void method2488() {
		@Pc(11) Class156 local11 = Static308.aClass156_1;
		synchronized (Static308.aClass156_1) {
			Static322.anInt6238 = Static68.anInt1388;
			Static71.anInt5338++;
			@Pc(27) int local27;
			if (Static203.anInt4174 >= 0) {
				while (Static203.anInt4174 != Static113.anInt6408) {
					local27 = Static244.anIntArray394[Static113.anInt6408];
					Static113.anInt6408 = Static113.anInt6408 + 1 & 0x7F;
					if (local27 >= 0) {
						Static192.aBooleanArray19[local27] = true;
					} else {
						Static192.aBooleanArray19[~local27] = false;
					}
				}
			} else {
				for (local27 = 0; local27 < 112; local27++) {
					Static192.aBooleanArray19[local27] = false;
				}
				Static203.anInt4174 = Static113.anInt6408;
			}
			Static68.anInt1388 = Static47.anInt1041;
		}
	}
}
