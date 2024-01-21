import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "[I")
	public static int[] anIntArray175 = new int[128];

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "Lclient!kb;")
	public static Class46 aClass46_646 = Static65.method1172("welle:");

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_647 = Static65.method1172(" loggt sich ein)3");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZI)Lclient!kb;")
	public static Class46 method1240(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(31) int local31 = 1;
		@Pc(35) int local35 = arg1 / 10;
		while (local35 != 0) {
			local35 /= 10;
			local31++;
		}
		@Pc(49) int local49 = local31;
		if (arg1 < 0 || arg0) {
			local49 = local31 + 1;
		}
		@Pc(60) byte[] local60 = new byte[local49];
		if (arg1 < 0) {
			local60[0] = 45;
		} else if (arg0) {
			local60[0] = 43;
		}
		for (@Pc(76) int local76 = 0; local76 < local31; local76++) {
			@Pc(82) int local82 = arg1 % 10;
			arg1 /= 10;
			if (local82 < 0) {
				local82 = -local82;
			}
			if (local82 > 9) {
				local82 += 39;
			}
			local60[local49 - local76 - 1] = (byte) (local82 + 48);
		}
		@Pc(119) Class46 local119 = new Class46();
		local119.aByteArray17 = local60;
		local119.anInt2034 = local49;
		return local119;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public static void method1241() {
		aClass46_646 = null;
		aClass46_647 = null;
		anIntArray175 = null;
	}
}
