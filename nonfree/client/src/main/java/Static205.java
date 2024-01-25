import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "Lclient!po;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString163 = "K";

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BZ)V")
	public static void method3695(@OriginalArg(1) boolean arg0) {
		Static305.aClass1_Sub21_Sub2_3.method5757(147);
		for (@Pc(23) Class1_Sub26 local23 = (Class1_Sub26) Static298.aClass207_35.method5560(); local23 != null; local23 = (Class1_Sub26) Static298.aClass207_35.method5559()) {
			if (!local23.method5797()) {
				local23 = (Class1_Sub26) Static298.aClass207_35.method5560();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt3826 == 0) {
				Static140.method2316(arg0, true, local23);
			}
		}
		if (Static50.aClass163_5 != null) {
			Static340.method5639(Static50.aClass163_5);
			Static50.aClass163_5 = null;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
	public static void method3696(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class1 local5 = Static226.aClass207_33.method5560(); local5 != null; local5 = Static226.aClass207_33.method5559()) {
			if ((long) arg0 == (local5.aLong214 >> 48 & 0xFFFFL)) {
				local5.method5796();
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!lm;I)V")
	public static void method3699(@OriginalArg(0) Class134 arg0) {
		Static193.aClass134_94 = arg0;
		Static128.anInt3534 = Static193.aClass134_94.method3020(19);
	}
}
