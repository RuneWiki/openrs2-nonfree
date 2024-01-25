import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!qca", name = "i", descriptor = "I")
	public static int anInt7452 = -1;

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
	public static int anInt7453 = 0;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)Z")
	public static boolean method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!dj;B)[Lclient!af;")
	public static Class10[] method6218(@OriginalArg(0) Class71 arg0) {
		if (!arg0.method1976()) {
			return new Class10[0];
		}
		@Pc(18) Class55 local18 = arg0.method1981();
		while (local18.anInt1481 == 0) {
			Static17.method388(10L);
		}
		if (local18.anInt1481 == 2) {
			return new Class10[0];
		}
		@Pc(47) int[] local47 = (int[]) local18.anObject5;
		@Pc(53) Class10[] local53 = new Class10[local47.length >> 2];
		for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
			@Pc(61) Class10 local61 = new Class10();
			local53[local55] = local61;
			local61.anInt154 = local47[local55 << 2];
			local61.anInt155 = local47[(local55 << 2) + 1];
			local61.anInt151 = local47[(local55 << 2) + 2];
			local61.anInt150 = local47[(local55 << 2) + 3];
		}
		return local53;
	}
}
