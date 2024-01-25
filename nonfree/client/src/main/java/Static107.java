import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
	public static int anInt4790;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!rp;B)V")
	public static void method4303(@OriginalArg(0) Class3_Sub5 arg0) {
		@Pc(9) int local9 = arg0.method2750();
		Static26.aClass129Array1 = new Class129[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static26.aClass129Array1[local14] = new Class129();
			Static26.aClass129Array1[local14].anInt3176 = arg0.method2750();
			Static26.aClass129Array1[local14].aString31 = arg0.method2792();
		}
		Static374.anInt6249 = arg0.method2750();
		Static382.anInt6411 = arg0.method2750();
		Static76.anInt1626 = arg0.method2750();
		Static135.aClass23_Sub1Array2 = new Class23_Sub1[Static382.anInt6411 + 1 - Static374.anInt6249];
		for (@Pc(68) int local68 = 0; local68 < Static76.anInt1626; local68++) {
			@Pc(74) int local74 = arg0.method2750();
			@Pc(82) Class23_Sub1 local82 = Static135.aClass23_Sub1Array2[local74] = new Class23_Sub1();
			local82.anInt328 = arg0.method2739();
			local82.anInt319 = arg0.method2726();
			local82.anInt333 = local74 + Static374.anInt6249;
			local82.aString4 = arg0.method2792();
			local82.aString3 = arg0.method2792();
		}
		Static91.anInt2991 = arg0.method2726();
		Static52.aBoolean58 = true;
	}
}
