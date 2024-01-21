import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
	public static int anInt1985;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_750 = Static177.method3050("titlebox");

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)J")
	public static long method1588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass17_1 == null ? 0L : local7.aClass17_1.aLong19;
	}
}
