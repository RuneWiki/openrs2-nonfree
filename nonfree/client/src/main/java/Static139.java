import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString30 = null;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public static int anInt2651 = -1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2204(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static592.anInt1870 >= 200 && !Static524.aBoolean638 || Static592.anInt1870 >= 200) {
			Static271.method3957(Static514.aClass303_13.method7473(Static232.anInt4258));
			return;
		}
		@Pc(30) String local30 = Static566.method8154(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(35) int local35 = 0; local35 < Static592.anInt1870; local35++) {
			@Pc(43) String local43 = Static566.method8154(Static369.aStringArray24[local35]);
			if (local43 != null && local43.equals(local30)) {
				Static271.method3957(arg0 + Static514.aClass303_40.method7473(Static232.anInt4258));
				return;
			}
			if (Static570.aStringArray37[local35] != null) {
				local74 = Static566.method8154(Static570.aStringArray37[local35]);
				if (local74 != null && local74.equals(local30)) {
					Static271.method3957(arg0 + Static514.aClass303_40.method7473(Static232.anInt4258));
					return;
				}
			}
		}
		for (@Pc(101) int local101 = 0; local101 < Static641.anInt10703; local101++) {
			local74 = Static566.method8154(Static304.aStringArray17[local101]);
			if (local74 != null && local74.equals(local30)) {
				Static271.method3957(Static514.aClass303_45.method7473(Static232.anInt4258) + arg0 + Static514.aClass303_46.method7473(Static232.anInt4258));
				return;
			}
			if (Static543.aStringArray34[local101] != null) {
				@Pc(150) String local150 = Static566.method8154(Static543.aStringArray34[local101]);
				if (local150 != null && local150.equals(local30)) {
					Static271.method3957(Static514.aClass303_45.method7473(Static232.anInt4258) + arg0 + Static514.aClass303_46.method7473(Static232.anInt4258));
					return;
				}
			}
		}
		if (Static566.method8154(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35).equals(local30)) {
			Static271.method3957(Static514.aClass303_43.method7473(Static232.anInt4258));
		} else {
			@Pc(208) Class14_Sub19 local208 = Static286.method4081(Static205.aClass394_1, Static618.aClass100_131);
			local208.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(arg0));
			local208.aClass14_Sub29_Sub1_1.method5855(arg0);
			Static576.method8234(local208);
		}
	}
}
