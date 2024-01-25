import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "Lclient!sv;")
	public static Class326 aClass326_6;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BII)Z")
	public static boolean method2189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method2191(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(21) int local21 = arg3 % 8;
		@Pc(31) int local31;
		if (local21 == 0) {
			local31 = 0;
		} else {
			local31 = 8 - local21;
		}
		@Pc(45) int local45 = -((arg0 + 8 - 1) / 8);
		@Pc(54) int local54 = -((arg3 + 8 - 1) / 8);
		for (@Pc(56) int local56 = local45; local56 < 0; local56++) {
			for (@Pc(60) int local60 = local54; local60 < 0; local60++) {
				if (arg1[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local31;
			if (arg1[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZLclient!tq;Lclient!tq;)V")
	public static void method2192(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_299 != null) {
			arg0.method8653();
		}
		arg0.aClass2_299 = arg1.aClass2_299;
		arg0.aClass2_300 = arg1;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}
}
