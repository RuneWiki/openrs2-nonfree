import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rba", name = "x", descriptor = "J")
	public static long aLong257 = 0L;

	@OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
	public static int anInt9636 = 0;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method8272(@OriginalArg(1) String arg0) {
		if (!Static241.aClass192_2.aBoolean389) {
			return -1;
		} else if (Static498.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static265.method4032(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static18.aString4 + local20;
			if (!Static457.aClass384_108.method8891("", local38)) {
				return -1;
			} else if (Static457.aClass384_108.method8894(local38)) {
				@Pc(62) byte[] local62 = Static457.aClass384_108.method8871("", local38);
				@Pc(68) File local68;
				try {
					local68 = Static6.method117(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static443.method6585(local68);
				if (local82 != null && local62.length == local82.length) {
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
						Static241.aClass192_2.method4328(local62, local68);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static512.method8464(local68, arg0);
				return 100;
			} else {
				return Static457.aClass384_108.method8879(local38);
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!fha;I)V")
	public static void method8273(@OriginalArg(0) Class14_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(14) Class5_Sub52 local14 = (Class5_Sub52) Static616.aClass81_73.method1599((long) arg0.anInt2960);
		if (local14 == null) {
			Static600.method8380((Class14_Sub1_Sub1_Sub3_Sub2) null, 0, arg0.anIntArray253[0], (Class283) null, arg0.aByte125, arg0.anIntArray252[0], arg0);
		} else {
			local14.method8843();
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIB)V")
	public static void method8274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class5_Sub4_Sub13 local12 = Static506.method2916(arg1, 9);
		local12.method4140();
		local12.anInt4508 = arg2;
		local12.anInt4504 = arg0;
	}
}
