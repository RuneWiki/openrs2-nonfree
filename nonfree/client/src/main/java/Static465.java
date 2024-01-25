import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_42 = new Class233(30);

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_77 = new Class269(64, 8);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([[B[B[I[I[[BIBI)I")
	public static int method6728(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2[arg6];
		@Pc(14) int local14 = local7 + arg3[arg6];
		@Pc(18) int local18 = arg2[arg5];
		@Pc(25) int local25 = local18 + arg3[arg5];
		@Pc(27) int local27 = local7;
		if (local7 < local18) {
			local27 = local18;
		}
		@Pc(38) int local38 = local14;
		if (local14 > local25) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg1[arg6] & 0xFF;
		if (local53 > (arg1[arg5] & 0xFF)) {
			local53 = arg1[arg5] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg0[arg6];
		@Pc(78) byte[] local78 = arg4[arg5];
		@Pc(83) int local83 = local27 - local7;
		@Pc(93) int local93 = local27 - local18;
		for (@Pc(95) int local95 = local27; local95 < local38; local95++) {
			@Pc(107) int local107 = local74[local83++] + local78[local93++];
			if (local107 < local53) {
				local53 = local107;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public static void method6729() {
		@Pc(17) Class2_Sub50 local17 = Static595.method8194(Static610.aClass310_2, Static212.aClass269_44);
		local17.aClass2_Sub34_Sub2_2.method6854(Static43.anInt967);
		Static311.method4754(local17);
	}
}
