import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
	public static int anInt6636;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
	public static int anInt6638;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!tb;")
	public static Class49 aClass49_26;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public static int anInt6644 = -1;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)Lclient!lg;")
	public static Class60_Sub1_Sub5 method5910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass60_Sub1_Sub5_1;
	}
}
