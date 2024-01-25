import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!pf;)I")
	public static int method2727(@OriginalArg(1) Class266 arg0) {
		if (arg0 == Static59.aClass266_1) {
			return 9216;
		} else if (arg0 == Static376.aClass266_3) {
			return 34065;
		} else if (Static566.aClass266_4 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2728() {
		@Pc(7) String local7 = "www";
		if (Static252.aClass80_3 == Static560.aClass80_7) {
			local7 = "www-wtrc";
		} else if (Static449.aClass80_5 == Static252.aClass80_3) {
			local7 = "www-wtqa";
		} else if (Static252.aClass80_3 == Static258.aClass80_4) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static377.aString78 != null) {
			local33 = "/p=" + Static377.aString78;
		}
		return "http://" + local7 + "." + Static189.aClass375_5.aString110 + ".com/l=" + Static483.anInt7694 + "/a=" + Static380.anInt5916 + local33 + "/";
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method2729() {
		Static425.method5667(Static234.aClass2_Sub5_48.aClass6_Sub2_1.method252() == 1);
		Static123.aClass35_1 = Static401.method5453(Static504.aCanvas11, 22050, 0, Static452.aClass226_6);
		Static338.method4548(Static629.method8440(null));
		Static313.aClass35_3 = Static401.method5453(Static504.aCanvas11, 2048, 1, Static452.aClass226_6);
		Static586.aClass2_Sub13_Sub4_2 = new Class2_Sub13_Sub4();
		Static313.aClass35_3.method2738(Static586.aClass2_Sub13_Sub4_2);
		Static115.aClass217_1 = new Class217(22050, Static283.anInt7446);
		Static151.method2243();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
	public static void method2732(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static257.anInt4068 = 0;
		Static624.anInt10032 = arg1;
		Static379.anInt5914 = 0;
		Static67.anInt1214 = arg0;
	}
}
