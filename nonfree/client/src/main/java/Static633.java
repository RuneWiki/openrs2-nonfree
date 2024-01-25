import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Z")
	public static boolean aBoolean721;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "J")
	public static long aLong269 = 0L;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!cs;B)V")
	public static void method8663(@OriginalArg(0) Class4_Sub1_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt5754 == Static101.anInt2262 || arg0.anInt5718 == -1 || arg0.anInt5710 != 0) {
			local5 = true;
		} else {
			@Pc(27) Class361 local27 = Static115.aClass227_1.method5968(arg0.anInt5718);
			if (local27.aBoolean707 || arg0.anInt5723 + 1 > local27.anIntArray642[arg0.anInt5770]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(51) int local51 = arg0.anInt5754 - arg0.anInt5788;
			@Pc(57) int local57 = Static101.anInt2262 - arg0.anInt5788;
			@Pc(68) int local68 = arg0.anInt5750 * 512 + arg0.method5059() * 256;
			@Pc(79) int local79 = arg0.anInt5729 * 512 + arg0.method5059() * 256;
			@Pc(90) int local90 = arg0.anInt5748 * 512 + arg0.method5059() * 256;
			@Pc(101) int local101 = arg0.anInt5786 * 512 + arg0.method5059() * 256;
			arg0.anInt8916 = (local90 * local57 + local68 * (local51 - local57)) / local51;
			arg0.anInt8911 = (local101 * local57 + local79 * (local51 - local57)) / local51;
		}
		arg0.anInt5794 = 0;
		if (arg0.anInt5758 == 0) {
			arg0.method5067(8192, false);
		}
		if (arg0.anInt5758 == 1) {
			arg0.method5067(12288, false);
		}
		if (arg0.anInt5758 == 2) {
			arg0.method5067(0, false);
		}
		if (arg0.anInt5758 == 3) {
			arg0.method5067(4096, false);
		}
	}
}
