import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	public static int anInt10108;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_61 = new Class244();

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	public static int anInt10107 = -1;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
	public static int anInt10109 = -1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z[B)Z")
	public static boolean method8265(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class4_Sub11 local13 = new Class4_Sub11(arg0);
		@Pc(17) int local17 = local13.method4905();
		if (local17 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local13.method4905() == 1;
		if (local31) {
			Static501.method5643(local13);
		}
		Static386.method6103(local13);
		return true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
	public static void method8266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(98) Class53 local98 = Static60.aClass53ArrayArrayArray1[arg3][arg1][arg2];
		if (local98 != null) {
			if (arg0 == 1) {
				local98.aShort16 = 0;
			} else if (arg0 == 2) {
				local98.aShort14 = 0;
			}
		}
		Static190.method3335();
	}
}
