import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	public static int anInt1392;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V")
	public static void method1225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static335.aClass5_Sub1_Sub1_3.method174(88);
		}
		if (arg0 == 1) {
			Static335.aClass5_Sub1_Sub1_3.method174(12);
		}
		Static335.aClass5_Sub1_Sub1_3.method1835(Static233.aBooleanArray19[82] ? 1 : 0);
		Static335.aClass5_Sub1_Sub1_3.method1861(Static28.anInt773 + arg2);
		Static335.aClass5_Sub1_Sub1_3.method1847(Static263.anInt5063 + arg1);
		Static301.aBoolean447 = false;
		Static238.anInt4612 = arg2;
		Static79.anInt1909 = arg1;
		Static301.method5304();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
	public static void method1228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass25_Sub3_2 != null) {
			local7.aClass25_Sub3_2 = null;
		}
		if (local7.aClass25_Sub3_1 != null) {
			local7.aClass25_Sub3_1 = null;
		}
	}
}
