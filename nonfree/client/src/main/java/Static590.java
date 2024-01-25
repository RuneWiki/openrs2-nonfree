import java.awt.Color;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "Ljava/lang/Object;")
	public static Object anObject157;

	@OriginalMember(owner = "client!wr", name = "bb", descriptor = "I")
	public static int anInt10586;

	@OriginalMember(owner = "client!wr", name = "X", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!wr", name = "Y", descriptor = "[Lclient!lj;")
	public static final Class4_Sub29[] aClass4_Sub29Array1 = new Class4_Sub29[1024];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!sj;I)I")
	public static int method8240(@OriginalArg(0) Class4_Sub13_Sub2 arg0) {
		@Pc(21) int local21 = arg0.method7065(2);
		@Pc(31) int local31;
		if (local21 == 0) {
			local31 = 0;
		} else if (local21 == 1) {
			local31 = arg0.method7065(5);
		} else if (local21 == 2) {
			local31 = arg0.method7065(8);
		} else {
			local31 = arg0.method7065(11);
		}
		return local31;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
	public static void method8241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static292.anInt5983 <= arg4 && Static61.anInt1627 >= arg3 && arg5 >= Static289.anInt5872 && arg0 <= Static160.anInt3347) {
			if (arg1 == 1) {
				Static493.method7125(arg5, arg3, arg2, arg4, arg0);
			} else {
				Static7.method641(arg2, arg5, arg4, arg3, arg0, arg1);
			}
		} else if (arg1 == 1) {
			Static582.method8144(arg2, arg4, arg0, arg3, arg5);
		} else {
			Static566.method8001(arg1, arg2, arg5, arg3, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method8243(@OriginalArg(1) String arg0) {
		if (!Static222.aClass366_3.aBoolean719) {
			return -1;
		} else if (Static36.aHashtable3.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static161.method2666(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static345.aString136 + local20;
			if (!Static380.aClass348_88.method7982(local33, "")) {
				return -1;
			} else if (Static380.aClass348_88.method7955(local33)) {
				@Pc(57) byte[] local57 = Static380.aClass348_88.method7956("", local33);
				@Pc(63) File local63;
				try {
					local63 = Static69.method1514(local20);
				} catch (@Pc(65) RuntimeException local65) {
					return -1;
				}
				if (local57 == null || local63 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static291.method4716(local63);
				if (local82 != null && local57.length == local82.length) {
					for (@Pc(95) int local95 = 0; local95 < local82.length; local95++) {
						if (local82[local95] != local57[local95]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static222.aClass366_3.method8270(local57, local63);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static473.method6909(arg0, local63);
				return 100;
			} else {
				return Static380.aClass348_88.method7967(local33);
			}
		}
	}
}
