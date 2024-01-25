import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
	public static int anInt4872;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!qa;IIII)Lclient!r;")
	public static Class145 method4195(@OriginalArg(1) int arg0, @OriginalArg(2) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class145 local12 = (Class145) Static174.aClass313_23.method7406(local6);
		if (local12 == null) {
			@Pc(22) Class97 local22 = Static321.method4995(arg0, Static179.aClass171_69);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt2722 < 13) {
				local22.method2320();
			}
			local12 = arg1.method7280(local22, 2055, Static93.anInt1896, 64, 768);
			Static174.aClass313_23.method7399(local6, local12);
		}
		local12 = local12.method6672((byte) 2, 2055, true);
		if (arg5 != 0) {
			local12.OA(arg5);
		}
		if (arg4 != 0) {
			local12.D(arg4);
		}
		if (arg2 != 0) {
			local12.b(arg2);
		}
		if (arg3 != 0) {
			local12.ca(0, arg3, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method4198() {
		Static230.aClient2.method1211();
		Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
		Static544.aClass140_152 = null;
		Static320.aClass140_86 = null;
		Static531.anInt8934 = 0;
		Static193.aClass140_112 = null;
		Static36.anInt791 = 0;
		Static91.aClass140_30 = null;
		Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
		Static545.method7544();
		Static489.anInt8146 = 0;
		Static3.aString1 = null;
		Static234.anInt4709 = 0;
		Static218.anInt7241 = 0;
		Static419.aClass249Array1 = null;
	}
}
