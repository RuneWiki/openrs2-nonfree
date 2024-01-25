import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!jr;")
	public static Class157 aClass157_6;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[Lclient!pm;")
	public static final Interface12[] anInterface12Array1 = new Interface12[128];

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)V")
	public static void method2644(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(16, arg0);
		local8.method4945();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V")
	public static void method2645(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg2) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local35;
		@Pc(55) int local55 = ~local21 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg3; local57 < arg2; local57++) {
			if ((long) (local57 & local55) + local21 > arg0[local57]) {
				@Pc(78) long local78 = arg0[local57];
				arg0[local57] = arg0[local17];
				arg0[local17] = local78;
				@Pc(92) Object local92 = arg1[local57];
				arg1[local57] = arg1[local17];
				arg1[local17++] = local92;
			}
		}
		arg0[arg2] = arg0[local17];
		arg0[local17] = local21;
		arg1[arg2] = arg1[local17];
		arg1[local17] = local35;
		method2645(arg0, arg1, local17 - 1, arg3);
		method2645(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method2651() {
		if (Static271.anInt5150 == 1 || Static271.anInt5150 == 3 || Static271.anInt5150 != Static331.anInt6011 && (Static271.anInt5150 == 0 || Static331.anInt6011 == 0)) {
			Static350.anInt6254 = 0;
			Static157.anInt4503 = 0;
			Static380.aClass17_29.method734();
		}
		Static331.anInt6011 = Static271.anInt5150;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method2654() {
		Static144.method2331(Static72.aClass296_74);
		Static455.aClass1_Sub6_Sub2_2.method3937(Static306.method4842());
		Static455.aClass1_Sub6_Sub2_2.method3919(Static83.anInt1567);
		Static455.aClass1_Sub6_Sub2_2.method3919(Static350.anInt6255);
		Static455.aClass1_Sub6_Sub2_2.method3937(Static544.aClass1_Sub22_Sub1_1.anInt5445);
	}
}
