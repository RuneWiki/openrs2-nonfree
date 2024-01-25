import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "Lclient!ct;")
	public static Class30 aClass30_99;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_44 = new Class42();

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_216 = new Class18(72, -1);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lclient!ae;I)V")
	public static void method5671(@OriginalArg(0) Class4[] arg0) {
		Static281.anInt5476 = arg0.length;
		Static213.aClass4Array11 = new Class4[Static281.anInt5476 + 10];
		Static74.anIntArray137 = new int[Static281.anInt5476 + 10];
		Static374.method2825(arg0, 0, Static213.aClass4Array11, 0, Static281.anInt5476);
		for (@Pc(30) int local30 = 0; local30 < Static281.anInt5476; local30++) {
			Static74.anIntArray137[local30] = Static213.aClass4Array11[local30].method5963();
		}
		for (@Pc(45) int local45 = Static281.anInt5476; local45 < Static213.aClass4Array11.length; local45++) {
			Static74.anIntArray137[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!at;)Ljava/lang/String;")
	public static String method5674(@OriginalArg(1) Class1_Sub7 arg0) {
		return Static264.method4801(arg0);
	}
}
