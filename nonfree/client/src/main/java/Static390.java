import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "[I")
	public static final int[] anIntArray469 = new int[13];

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_9 = new Class184(3, 2);

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5854(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static446.anInt7901 >= 200 && !Static632.aBoolean751 || Static446.anInt7901 >= 200) {
			Static74.method1384(Static628.aClass369_10.method8475(Static377.anInt6756));
			local30 = Static628.aClass369_11.method8475(Static377.anInt6756);
			if (local30 != null) {
				Static74.method1384(local30);
			}
			return;
		}
		local30 = Static70.method1355(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(84) String local84;
		for (@Pc(46) int local46 = 0; local46 < Static446.anInt7901; local46++) {
			@Pc(53) String local53 = Static70.method1355(Static391.aStringArray25[local46]);
			if (local53 != null && local53.equals(local30)) {
				Static74.method1384(arg0 + Static628.aClass369_38.method8475(Static377.anInt6756));
				return;
			}
			if (Static488.aStringArray35[local46] != null) {
				local84 = Static70.method1355(Static488.aStringArray35[local46]);
				if (local84 != null && local84.equals(local30)) {
					Static74.method1384(arg0 + Static628.aClass369_38.method8475(Static377.anInt6756));
					return;
				}
			}
		}
		for (@Pc(115) int local115 = 0; local115 < Static449.anInt7920; local115++) {
			local84 = Static70.method1355(Static7.aStringArray3[local115]);
			if (local84 != null && local84.equals(local30)) {
				Static74.method1384(Static628.aClass369_43.method8475(Static377.anInt6756) + arg0 + Static628.aClass369_44.method8475(Static377.anInt6756));
				return;
			}
			if (Static525.aStringArray38[local115] != null) {
				@Pc(163) String local163 = Static70.method1355(Static525.aStringArray38[local115]);
				if (local163 != null && local163.equals(local30)) {
					Static74.method1384(Static628.aClass369_43.method8475(Static377.anInt6756) + arg0 + Static628.aClass369_44.method8475(Static377.anInt6756));
					return;
				}
			}
		}
		if (Static70.method1355(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4).equals(local30)) {
			Static74.method1384(Static628.aClass369_41.method8475(Static377.anInt6756));
		} else {
			@Pc(221) Class2_Sub50 local221 = Static595.method8194(Static610.aClass310_2, Static432.aClass269_74);
			local221.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(arg0));
			local221.aClass2_Sub34_Sub2_2.method6918(arg0);
			Static311.method4754(local221);
		}
	}
}
