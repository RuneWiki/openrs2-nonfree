import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	public static void method7908() {
		@Pc(9) Class236[] local9 = Class4_Sub36.aClass236Array1;
		synchronized (Class4_Sub36.aClass236Array1) {
			for (@Pc(13) int local13 = 0; local13 < Class4_Sub36.aClass236Array1.length; local13++) {
				Class4_Sub36.aClass236Array1[local13] = new Class236();
				Static433.anIntArray471[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I")
	public static int method7909() {
		return Static290.anInt4596;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7910(@OriginalArg(0) String arg0) {
		if (!Static567.aClass207_5.aBoolean399) {
			return -1;
		} else if (Static502.aHashtable5.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static28.method641(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static343.aString68 + local20;
			if (!Static518.aClass34_132.method1253("", local33)) {
				return -1;
			} else if (Static518.aClass34_132.method1246(local33)) {
				@Pc(62) byte[] local62 = Static518.aClass34_132.method1238(local33, "");
				@Pc(68) File local68;
				try {
					local68 = Static29.method646(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static219.method3254(local68);
				if (local82 != null && local82.length == local62.length) {
					for (@Pc(99) int local99 = 0; local99 < local82.length; local99++) {
						if (local62[local99] != local82[local99]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static567.aClass207_5.method4584(local62, local68);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static96.method1968(local68, arg0);
				return 100;
			} else {
				return Static518.aClass34_132.method1237(local33);
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static472.anInt7503 && Static257.anInt4172 >= arg4 && Static73.anInt1542 <= arg1 && Static527.anInt8177 >= arg2) {
			Static474.method6528(arg0, arg6, arg4, arg3, arg1, arg5, arg2);
		} else {
			Static559.method7425(arg5, arg3, arg4, arg2, arg6, arg1, arg0);
		}
	}
}
