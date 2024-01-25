import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hka", name = "bb", descriptor = "Z")
	public static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IZ)I")
	public static int method3321(@OriginalArg(1) boolean arg0) {
		if (Static368.anIntArray419 == null) {
			return 0;
		} else if (arg0 || Static14.aClass221Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static368.anIntArray419.length; local22++) {
				@Pc(28) int local28 = Static368.anIntArray419[local22];
				if (Static201.aClass34_51.method1235(local28)) {
					local20++;
				}
				if (Static456.aClass34_96.method1235(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static368.anIntArray419.length * 2;
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZII)I")
	public static int method3322(@OriginalArg(2) int arg0) {
		@Pc(14) Class4_Sub54 local14 = Static473.method6525(arg0, false);
		if (local14 == null) {
			return Static432.aClass121_1.method2808(arg0).anInt10581;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray723.length; local31++) {
			if (local14.anIntArray723[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static432.aClass121_1.method2808(arg0).anInt10581 - local14.anIntArray723.length;
	}

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "(III)Z")
	public static boolean method3323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static32.method708(arg0, arg1) || Static345.method4663(arg1, arg0);
	}
}
