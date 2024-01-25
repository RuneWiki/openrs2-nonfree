import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "Lclient!bh;")
	public static final Class35 aClass35_3 = new Class35("LIVE", "", "", 0);

	@OriginalMember(owner = "client!ou", name = "N", descriptor = "[Lclient!ao;")
	public static final Class21[] aClass21Array2 = new Class21[14];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
	public static void method6583(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class302 local17 = Static110.method1816(arg0, arg2);
		if (local17 == null) {
			return;
		}
		if (local17.anObjectArray15 != null) {
			@Pc(27) Class6_Sub10 local27 = new Class6_Sub10();
			local27.aClass302_14 = local17;
			local27.aString23 = arg1;
			local27.anObjectArray1 = local17.anObjectArray15;
			local27.anInt1848 = arg3;
			Static244.method4193(local27);
		}
		if (Static554.anInt1821 != 10 || !Static78.method1364(local17).method8148(arg3 - 1)) {
			return;
		}
		@Pc(73) Class6_Sub9 local73;
		if (arg3 == 1) {
			local73 = Static560.method8089(Static391.aClass126_1, Static316.aClass208_51);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 2) {
			local73 = Static560.method8089(Static391.aClass126_1, Static309.aClass208_49);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 3) {
			local73 = Static560.method8089(Static391.aClass126_1, Static10.aClass208_2);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 4) {
			local73 = Static560.method8089(Static391.aClass126_1, Static138.aClass208_26);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 5) {
			local73 = Static560.method8089(Static391.aClass126_1, Static235.aClass208_39);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 6) {
			local73 = Static560.method8089(Static391.aClass126_1, Static494.aClass208_75);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 7) {
			local73 = Static560.method8089(Static391.aClass126_1, Static553.aClass208_85);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 8) {
			local73 = Static560.method8089(Static391.aClass126_1, Static344.aClass208_55);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 9) {
			local73 = Static560.method8089(Static391.aClass126_1, Static537.aClass208_80);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
		if (arg3 == 10) {
			local73 = Static560.method8089(Static391.aClass126_1, Static200.aClass208_35);
			Static14.method281(arg2, local17.anInt8877, local73, arg0);
			Static263.method4681(local73);
		}
	}
}
