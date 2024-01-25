import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Lclient!kr;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_49 = new Class92(46, 3);

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	public static int anInt2821 = -50;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	public static void method2362() {
		Static54.aClass187_1.method4604();
		Static186.aClass50_1.method1447();
		if (Static335.aClass84_1 != null) {
			Static335.aClass84_1.method2113(Static280.aCanvas3);
		}
		Static448.aClient1.method1129();
		Static280.aCanvas3.setBackground(Color.black);
		Static403.anInt7240 = -1;
		Static54.aClass187_1 = Static177.method6075(Static280.aCanvas3);
		Static186.aClass50_1 = Static170.method2803(Static280.aCanvas3);
		if (Static335.aClass84_1 != null) {
			Static335.aClass84_1.method2110(Static280.aCanvas3);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method2363(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static426.aClass149_2.anInt4043 : Static426.aClass149_2.anInt4042) + local19;
		@Pc(70) int local70;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class6_Sub2_Sub12 local38 = Static426.aClass149_2.method3356(local31);
			if (local38.aBoolean322 && local38.method4354().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static315.aShortArray85 = null;
					Static87.anInt2049 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(68) short[] local68 = new short[local11.length * 2];
					for (local70 = 0; local70 < local13; local70++) {
						local68[local70] = local11[local70];
					}
					local11 = local68;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static40.anInt1169 = 0;
		Static87.anInt2049 = local13;
		Static315.aShortArray85 = local11;
		@Pc(119) String[] local119 = new String[Static87.anInt2049];
		for (local70 = 0; local70 < Static87.anInt2049; local70++) {
			local119[local70] = Static426.aClass149_2.method3356(local11[local70]).method4354();
		}
		Static340.method4952(local119, Static315.aShortArray85);
	}
}
