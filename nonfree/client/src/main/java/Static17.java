import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "D")
	public static double aDouble5;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	public static int anInt243 = 0;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public static void method248() {
		Static631.anInt9607 = -1;
		Static70.anIntArray93 = null;
		Static322.anInt5121 = -1;
		Static469.aClass177_2 = null;
		Static539.aClass177_10 = null;
		Static319.anInterface4Array1 = null;
		Static361.aClass95_9 = null;
		Static151.anInterface4_1 = null;
		Static257.anInt4066 = -1;
		Static372.aClass177_5 = null;
		Static491.anInt8078 = -1;
		Static3.aClass94_7.method1859();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method249(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static597.method8090(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IZ)I")
	public static int method250(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	public static void method251() {
		Static566.aClass95_14.L(Static519.anInt8614, Static234.aClass2_Sub5_48.aClass6_Sub6_1.method2780() == 1 ? Static115.anInt2102 + 256 << 2 : -1, 0);
	}
}
