import java.awt.Dimension;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!sk;")
	public static Class39 aClass39_12;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
	public static int[] anIntArray626 = new int[1];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method8294() {
		if (Static105.aClass188_1 != null) {
			Static105.aClass188_1.method7758();
		}
		if (Static181.aClass188_3 != null) {
			Static181.aClass188_3.method7758();
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method8296() {
		if (Static323.aClass5_9.method7542()) {
			Static323.aClass5_9.method7547(Static364.aCanvas13);
			Static138.method2574();
			if (Static219.aBoolean285) {
				Static100.method2130(Static364.aCanvas13);
			} else {
				@Pc(35) Dimension local35 = Static364.aCanvas13.getSize();
				Static323.aClass5_9.method7520(Static364.aCanvas13, local35.width, local35.height);
			}
			Static323.aClass5_9.method7539(Static364.aCanvas13);
		} else {
			Static441.method6865(false, Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025());
		}
		Static40.method1343();
		Static585.aBoolean690 = true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method8297(@OriginalArg(0) String arg0) {
		if (!Static573.aClass138_6.aBoolean276) {
			return -1;
		} else if (Static340.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static489.method7288(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static242.aString52 + local25;
			if (!Static200.aClass196_42.method5097("", local38)) {
				return -1;
			} else if (Static200.aClass196_42.method5106(local38)) {
				@Pc(62) byte[] local62 = Static200.aClass196_42.method5093(local38, "");
				@Pc(68) File local68;
				try {
					local68 = Static370.method6000(local25);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static134.method2554(local68);
				if (local82 != null && local82.length == local62.length) {
					for (@Pc(95) int local95 = 0; local95 < local82.length; local95++) {
						if (local82[local95] != local62[local95]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static573.aClass138_6.method3569(local62, local68);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static376.method6065(arg0, local68);
				return 100;
			} else {
				return Static200.aClass196_42.method5105(local38);
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!mda;Lclient!la;Lclient!la;ILclient!eg;Lclient!la;)Z")
	public static boolean method8298(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(4) Class3_Sub7_Sub2 arg3, @OriginalArg(5) Class196 arg4) {
		Static145.aClass188_2 = arg0;
		Static163.aClass196_35 = arg1;
		Static269.aClass196_49 = arg2;
		Static594.aClass3_Sub7_Sub2_3 = arg3;
		Static514.anIntArray550 = new int[16];
		Static518.aClass196_108 = arg4;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static514.anIntArray550[local25] = 255;
		}
		return true;
	}
}
