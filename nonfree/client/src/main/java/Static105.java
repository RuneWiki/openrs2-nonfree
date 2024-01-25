import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "Lclient!f;")
	public static Class76 aClass76_6;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!ou;")
	public static Class141 aClass141_2;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_47 = new Class81(24, 12);

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "Lclient!jk;")
	public static Class128 aClass128_1 = null;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII)V")
	public static void method1624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class1 local3 = new Class1();
		local3.anInt3 = arg1 >> Static250.anInt4056;
		local3.anInt7 = arg2 >> Static250.anInt4056;
		local3.anInt18 = arg3 >> Static250.anInt4056;
		local3.anInt4 = arg4 >> Static250.anInt4056;
		local3.anInt1 = arg0;
		local3.anInt17 = arg1;
		local3.anInt11 = arg2;
		local3.anInt12 = arg3;
		local3.anInt21 = arg4;
		local3.anInt13 = arg5;
		local3.anInt19 = arg6;
		Static325.aClass1Array2[Static334.anInt5941++] = local3;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII)V")
	public static void method1625(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		if (Static65.anInt7824 == 2) {
			Static436.anInt7610 = 0;
			Static293.anInt5622 = local3;
			Static258.anInt4308 = local11;
		}
		Static203.aFloat130 = local11;
		Static328.aFloat179 = local3;
		Static309.method4416();
		Static18.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method1626(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(9) int local9 = arg0.method3698();
		Static413.aClass88Array1 = new Class88[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static413.aClass88Array1[local14] = new Class88();
			Static413.aClass88Array1[local14].anInt2405 = arg0.method3698();
			Static413.aClass88Array1[local14].aString20 = arg0.method3729();
		}
		Static270.anInt4971 = arg0.method3698();
		Static220.anInt4212 = arg0.method3698();
		Static114.anInt2337 = arg0.method3698();
		Static323.aClass23_Sub1Array1 = new Class23_Sub1[Static220.anInt4212 + 1 - Static270.anInt4971];
		for (@Pc(72) int local72 = 0; local72 < Static114.anInt2337; local72++) {
			@Pc(78) int local78 = arg0.method3698();
			@Pc(86) Class23_Sub1 local86 = Static323.aClass23_Sub1Array1[local78] = new Class23_Sub1();
			local86.anInt3266 = arg0.method3737();
			local86.anInt3268 = arg0.method3731();
			local86.anInt3274 = Static270.anInt4971 + local78;
			local86.aString22 = arg0.method3729();
			local86.aString21 = arg0.method3729();
		}
		Static383.anInt6790 = arg0.method3731();
		Static293.aBoolean500 = true;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)V")
	public static void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg1, 6);
		local8.method434();
		local8.anInt657 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)B")
	public static byte method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
