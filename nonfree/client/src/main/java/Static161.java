import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	public static int anInt2868;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public static int anInt2865 = 0;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_62 = new Class254(16, 8);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!ti;)Ljava/lang/String;")
	public static String method2527(@OriginalArg(1) Class1_Sub14 arg0) {
		return Static146.method2379(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2529(@OriginalArg(0) String arg0) {
		if (Static71.aStringArray12 == null) {
			Static233.method3385();
		}
		@Pc(14) String[] local14 = Static71.method1050('\n', arg0);
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			for (@Pc(26) int local26 = Static72.anInt1373; local26 > 0; local26--) {
				Static71.aStringArray12[local26] = Static71.aStringArray12[local26 - 1];
			}
			Static71.aStringArray12[0] = local14[local22];
			if (Static71.aStringArray12.length - 1 > Static72.anInt1373) {
				Static72.anInt1373++;
				if (Static214.anInt6453 > 0) {
					Static214.anInt6453++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method2531() {
		if (!Static217.aBoolean311) {
			return;
		}
		@Pc(11) Class229 local11 = Static99.method1611(Static380.anInt6831, Static224.anInt3903);
		if (local11 != null && local11.anObjectArray31 != null) {
			@Pc(20) Class1_Sub16 local20 = new Class1_Sub16();
			local20.aClass229_4 = local11;
			local20.anObjectArray1 = local11.anObjectArray31;
			Static354.method5070(local20);
		}
		Static281.anInt4710 = -1;
		Static217.aBoolean311 = false;
		Static139.anInt2525 = -1;
		if (local11 != null) {
			Static373.method5289(local11);
		}
	}
}
