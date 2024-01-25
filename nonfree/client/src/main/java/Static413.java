import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!us", name = "q", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!us", name = "r", descriptor = "I")
	public static int anInt3903;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "I")
	public static int anInt3900 = 0;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "Z")
	public static boolean aBoolean306 = true;

	@OriginalMember(owner = "client!us", name = "v", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)[Lclient!um;")
	public static Class238[] method3223() {
		return new Class238[] { Static411.aClass238_7, Static337.aClass238_5, Static243.aClass238_3, Static336.aClass238_4, Static212.aClass238_2, Static89.aClass238_1 };
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BII)Z")
	public static boolean method3224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
	public static void method3225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub5_2 != null) {
			local7.aClass1_Sub5_2 = null;
		}
		if (local7.aClass1_Sub5_3 != null) {
			local7.aClass1_Sub5_3 = null;
		}
	}
}
