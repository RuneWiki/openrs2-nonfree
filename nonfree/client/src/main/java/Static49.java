import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cg", name = "ib", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_11 = new Class88();

	@OriginalMember(owner = "client!cg", name = "fb", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!cg", name = "gb", descriptor = "J")
	public static long aLong29 = -1L;

	@OriginalMember(owner = "client!cg", name = "hb", descriptor = "[B")
	public static final byte[] aByteArray15 = new byte[2048];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!hs;")
	public static Class3_Sub3 method903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class242 local14 = local7.aClass242_2; local14 != null; local14 = local14.aClass242_4) {
			@Pc(18) Class3_Sub3 local18 = local14.aClass3_Sub3_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort97 == arg1 && local18.aShort95 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
	public static boolean method904() {
		return Static449.aClass207_11 != Static194.aClass207_8 || Static221.anInt3810 >= 2;
	}
}
