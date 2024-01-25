import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
	public static int anInt507;

	@OriginalMember(owner = "client!bd", name = "O", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_21 = new Class235(55, 0);

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "J")
	public static long aLong26 = 0L;

	@OriginalMember(owner = "client!bd", name = "S", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_3 = new Class297(5, 1);

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
	public static int anInt508 = 0;

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "[I")
	public static final int[] anIntArray55 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
	public static void method418(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub6_Sub16 local12 = Static212.method3332(6, arg0);
		local12.method6593();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method420() {
		Static307.aClass134_8.pa(Static561.anInt9348, Static348.aClass1_Sub30_Sub1_1.aBoolean380 ? Static590.anInt9619 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method421(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(9) int local9 = arg0.method5739();
		Static583.aClass333Array1 = new Class333[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static583.aClass333Array1[local14] = new Class333();
			Static583.aClass333Array1[local14].anInt8947 = arg0.method5739();
			Static583.aClass333Array1[local14].aString88 = arg0.method5798();
		}
		Static594.anInt9650 = arg0.method5739();
		Static214.anInt4119 = arg0.method5739();
		Static173.anInt3032 = arg0.method5739();
		Static416.aClass317_Sub1Array1 = new Class317_Sub1[Static214.anInt4119 + 1 - Static594.anInt9650];
		for (@Pc(62) int local62 = 0; local62 < Static173.anInt3032; local62++) {
			@Pc(76) int local76 = arg0.method5739();
			@Pc(84) Class317_Sub1 local84 = Static416.aClass317_Sub1Array1[local76] = new Class317_Sub1();
			local84.anInt9106 = arg0.method5750();
			local84.anInt9102 = arg0.method5804();
			local84.anInt9112 = Static594.anInt9650 + local76;
			local84.aString91 = arg0.method5798();
			local84.aString90 = arg0.method5798();
		}
		Static308.anInt5290 = arg0.method5804();
		Static142.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method424(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static389.anInt6691;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class12 local22 = Static591.aClass274_1.method5884(arg0[local13]);
			if (local22.anInt206 != -1) {
				@Pc(37) Class22 local37 = (Class22) Static224.aClass222_48.method4430((long) local22.anInt206);
				if (local37 == null) {
					@Pc(45) Class102 local45 = Static601.method2070(Static463.aClass270_98, local22.anInt206, 0);
					if (local45 != null) {
						local37 = Static16.aClass134_1.method6896(local45, true);
						Static224.aClass222_48.method4434(local37, (long) local22.anInt206);
					}
				}
				if (local37 != null) {
					Static104.aClass22Array5[local11] = local37;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
