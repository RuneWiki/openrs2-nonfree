import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
	public static int anInt262;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "Lclient!hb;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(BI)J")
	public static long method271(@OriginalArg(1) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!cb;Lclient!cb;Lclient!cb;Lclient!fa;Lclient!hk;)Z")
	public static boolean method273(@OriginalArg(1) Class50 arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) Class50 arg2, @OriginalArg(4) Class107 arg3, @OriginalArg(5) Class5_Sub14_Sub4 arg4) {
		Static507.aClass107_2 = arg3;
		Static537.aClass5_Sub14_Sub4_35 = arg4;
		Static452.anIntArray439 = new int[16];
		Static447.aClass50_128 = arg0;
		Static213.aClass50_58 = arg2;
		Static555.aClass50_160 = arg1;
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			Static452.anIntArray439[local26] = 255;
		}
		return true;
	}
}
