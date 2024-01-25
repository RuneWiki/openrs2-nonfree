import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!nr;")
	public static Class1_Sub6_Sub4 aClass1_Sub6_Sub4_1;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
	public static int[] anIntArray24;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
	public static int anInt217;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	public static int anInt214 = -1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method285(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static281.anInt5476;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(26) Class119 local26 = Static355.method5863(arg0[local13]);
			if (local26.anInt3689 != -1) {
				@Pc(38) Class4 local38 = (Class4) Static359.aClass21_176.method854((long) local26.anInt3689);
				if (local38 == null) {
					@Pc(46) Class201 local46 = Static382.method5432(Static280.aClass30_83, local26.anInt3689, 0);
					if (local46 != null) {
						local38 = Static9.aClass63_1.method4589(local46);
						Static359.aClass21_176.method843(local38, (long) local26.anInt3689);
					}
				}
				if (local38 != null) {
					Static213.aClass4Array11[local11] = local38;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method287() {
		Static353.aClass21_174.method857();
	}
}
