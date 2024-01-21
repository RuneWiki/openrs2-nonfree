import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_13;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_690 = Static120.method1824(":clan:");

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_691 = Static120.method1824("<col=00ffff>");

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_692 = Static120.method1824("Weiter");

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_693 = Static120.method1824("(Z");

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_695 = Static120.method1824("Checking for updates )2 ");

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!rd;")
	public static Class80 aClass80_694 = aClass80_695;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_696 = Static120.method1824(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_697 = Static120.method1824("(U0a )2 in: ");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[Lclient!qf;I)V")
	public static void method1228(@OriginalArg(1) Class77[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) Class77 local14 = arg0[local3];
			if (local14 != null && arg1 == local14.anInt3201 && (!local14.aBoolean127 || !Static75.method1107(local14))) {
				if (local14.anInt3206 == 0) {
					if (!local14.aBoolean127 && Static75.method1107(local14) && Static85.aClass77_5 != local14) {
						continue;
					}
					method1228(arg0, local14.anInt3237);
					if (local14.aClass77Array1 != null) {
						method1228(local14.aClass77Array1, local14.anInt3237);
					}
					@Pc(70) Class3_Sub20 local70 = (Class3_Sub20) Static28.aClass54_4.method1496((long) local14.anInt3237);
					if (local70 != null) {
						Static11.method219(local70.anInt2996);
					}
				}
				if (local14.anInt3206 == 6) {
					@Pc(100) int local100;
					if (local14.anInt3250 != -1 || local14.anInt3192 != -1) {
						@Pc(95) boolean local95 = Static195.method3154(local14);
						if (local95) {
							local100 = local14.anInt3192;
						} else {
							local100 = local14.anInt3250;
						}
						if (local100 != -1) {
							@Pc(114) Class3_Sub1_Sub15 local114 = Static148.method2368(local100);
							if (local114 != null) {
								local14.anInt3243 += Static152.anInt3407;
								while (local114.anIntArray440[local14.anInt3211] < local14.anInt3243) {
									local14.anInt3243 -= local114.anIntArray440[local14.anInt3211];
									local14.anInt3211++;
									if (local114.anIntArray439.length <= local14.anInt3211) {
										local14.anInt3211 -= local114.anInt3549;
										if (local14.anInt3211 < 0 || local114.anIntArray439.length <= local14.anInt3211) {
											local14.anInt3211 = 0;
										}
									}
									Static186.method3014(local14);
								}
							}
						}
					}
					if (local14.anInt3193 != 0 && !local14.aBoolean127) {
						local100 = local14.anInt3193 << 16 >> 16;
						@Pc(204) int local204 = local14.anInt3193 >> 16;
						local100 *= Static152.anInt3407;
						local14.anInt3225 = local14.anInt3225 + local100 & 0x7FF;
						@Pc(221) int local221 = local204 * Static152.anInt3407;
						local14.anInt3232 = local14.anInt3232 + local221 & 0x7FF;
						Static186.method3014(local14);
					}
				}
			}
		}
	}
}
