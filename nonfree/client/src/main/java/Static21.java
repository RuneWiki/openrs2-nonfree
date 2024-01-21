import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
	public static int anInt587;

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "Lclient!rf;")
	private static Class70 aClass70_203 = Static49.method1293("level)2");

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "Lclient!rf;")
	public static Class70 aClass70_204 = Static49.method1293("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_205 = Static49.method1293("(Udns");

	@OriginalMember(owner = "client!ca", name = "db", descriptor = "Lclient!rf;")
	public static Class70 aClass70_206 = Static49.method1293(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ca", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_207 = aClass70_203;

	@OriginalMember(owner = "client!ca", name = "gb", descriptor = "I")
	public static int anInt591 = 0;

	@OriginalMember(owner = "client!ca", name = "ib", descriptor = "Lclient!rf;")
	public static Class70 aClass70_208 = Static49.method1293("scrollen:");

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
	public static void method466() {
		@Pc(5) Object local5 = Static39.anObject1;
		synchronized (Static39.anObject1) {
			if (Static98.anInt2845 == 0) {
				Static9.aClass32_1.method1483(5, new Class84());
			}
			Static98.anInt2845 = 600;
		}
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V")
	public static void method467() {
		aClass70_206 = null;
		aClass70_208 = null;
		aClass70_203 = null;
		aClass70_205 = null;
		aClass70_207 = null;
		aClass70_204 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIILclient!s;JLclient!s;Lclient!s;)V")
	public static void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub4 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class1_Sub1_Sub4 arg6, @OriginalArg(7) Class1_Sub1_Sub4 arg7) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aClass1_Sub1_Sub4_9 = arg4;
		local3.anInt4452 = arg1 * 128 + 64;
		local3.anInt4448 = arg2 * 128 + 64;
		local3.anInt4444 = arg3;
		local3.aLong142 = arg5;
		local3.aClass1_Sub1_Sub4_8 = arg6;
		local3.aClass1_Sub1_Sub4_7 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(42) Class1_Sub17 local42 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2953; local46++) {
				if ((local42.aClass53Array2[local46].aLong99 & 0x400000L) == 4194304L && local42.aClass53Array2[local46].aClass1_Sub1_Sub4_4 instanceof Class1_Sub1_Sub4_Sub1) {
					@Pc(71) Class1_Sub1_Sub4_Sub1 local71 = (Class1_Sub1_Sub4_Sub1) local42.aClass53Array2[local46].aClass1_Sub1_Sub4_4;
					local71.method723();
					if (local71.aShort36 < local34) {
						local34 = local71.aShort36;
					}
				}
			}
		}
		local3.anInt4447 = -local34;
		if (Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass80_1 = local3;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method469(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static42.aBoolean55) {
			try {
				@Pc(20) Class52 local20 = (Class52) Class.forName("Class52_Sub1").getDeclaredConstructor().newInstance();
				local20.method3348(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static42.aBoolean55 = true;
			}
		}
		return arg0;
	}
}
