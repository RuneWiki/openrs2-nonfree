import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "Lclient!nk;")
	public static Class260 aClass260_2;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "Lclient!sha;")
	public static Class336 aClass336_1;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
	public static int anInt2769 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(2, (long) arg0);
		local9.method6239();
		local9.aString73 = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(BI)V")
	public static void method2435(@OriginalArg(1) int arg0) {
		Static482.anInt7725 = 100;
		Static181.anInt3030 = 3;
		Static368.anInt5903 = -1;
		Static444.anInt7209 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)V")
	public static void method2436(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(14, (long) arg0);
		local14.method6245();
	}
}
