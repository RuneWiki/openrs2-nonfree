import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "Jb", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_1 = new Class171(103, 1);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
	public static void method327(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class252[] local3 = Static171.aClass252Array1;
		for (@Pc(9) int local9 = 0; local9 < local3.length; local9++) {
			@Pc(15) Class252 local15 = local3[local9];
			if (local15 != null && local15.anInt6681 == 2) {
				Static312.method4499(local15.anInt6674, local15.anInt6685 * 2, arg0 >> 1, local15.anInt6679, arg3 >> 1, local15.anInt6676);
				if (Static33.anIntArray465[0] > -1 && Static122.anInt2190 % 20 < 10) {
					@Pc(62) Class6 local62 = Static14.aClass6Array1[local15.anInt6684];
					@Pc(70) int local70 = arg2 + Static33.anIntArray465[0] - 12;
					@Pc(78) int local78 = Static33.anIntArray465[1] + arg1 - 28;
					local62.method5115(local70, local78);
					Static63.method1147(local78, local70 + local62.method5130(), local70, local62.method5134() + local78);
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBLjava/lang/String;IZ)V")
	public static void method336(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static259.method3885(arg3, arg2, false, arg0, (String) null, arg1);
	}
}
