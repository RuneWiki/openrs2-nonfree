import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public static void method4222(@OriginalArg(0) int arg0) {
		if (Static481.anInt8380 < arg0) {
			Static407.anInt7261 = -1;
			Static332.anInt5824 = -1;
			Static481.anInt8380 = 0;
		}
		if (Static654.anInt8155 < Static481.anInt8380) {
			Static481.anInt8380 = Static654.anInt8155;
			Static407.anInt7261 = -1;
			Static332.anInt5824 = -1;
		}
		if (Static442.anInt10084 < 0) {
			Static442.anInt10084 = 0;
			Static332.anInt5824 = -1;
			Static407.anInt7261 = -1;
		}
		if (Static442.anInt10084 > Static654.anInt8148) {
			Static407.anInt7261 = -1;
			Static332.anInt5824 = -1;
			Static442.anInt10084 = Static654.anInt8148;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!rba;)Lclient!eo;")
	public static Class99 method4224(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(9) String local9 = arg0.method5295();
		@Pc(16) Class304 local16 = Static24.method9444()[arg0.method5322(-45)];
		@Pc(25) Class216 local25 = Static133.method2912()[arg0.method5322(-22)];
		@Pc(29) int local29 = arg0.method5281();
		@Pc(33) int local33 = arg0.method5281();
		@Pc(37) int local37 = arg0.method5322(-21);
		@Pc(41) int local41 = arg0.method5322(-42);
		@Pc(47) int local47 = arg0.method5322(-106);
		@Pc(57) int local57 = arg0.method5272();
		@Pc(61) int local61 = arg0.method5272();
		@Pc(67) int local67 = arg0.method5312();
		@Pc(71) int local71 = arg0.method5312();
		@Pc(75) int local75 = arg0.method5312();
		return new Class99(local9, local16, local25, local29, local33, local37, local41, local47, local57, local61, local67, local71, local75);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public static void method4225() {
		Static478.anInt8342 = -1;
		Static669.aLong366 = 0L;
		Static364.aString94 = "";
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	public static void method4230() {
		@Pc(17) Class400 local17 = Static81.method1057();
		@Pc(23) Class3_Sub48 local23 = Static89.method1200(Static695.aClass286_128, local17.aClass399_2);
		local23.aClass3_Sub28_Sub2_1.method5329(0);
		local17.method9223(local23);
	}
}
