import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "[I")
	public static final int[] anIntArray618 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	public static int anInt7625 = -1;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_51 = new Class223(64);

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	public static int anInt7631 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method6306(@OriginalArg(1) Class66 arg0) {
		for (@Pc(6) Class26_Sub3 local6 = (Class26_Sub3) Static471.aClass8_7.method110(); local6 != null; local6 = (Class26_Sub3) Static471.aClass8_7.method113()) {
			if (local6.aBoolean321) {
				local6.method3657(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)Lclient!ub;")
	public static Class4_Sub48 method6308() {
		if (Static392.aClass124_60 == null || Static269.aClass331_1 == null) {
			return null;
		}
		for (@Pc(22) Class4_Sub48 local22 = (Class4_Sub48) Static269.aClass331_1.method7401(); local22 != null; local22 = (Class4_Sub48) Static269.aClass331_1.method7401()) {
			@Pc(30) Class86 local30 = Static392.aClass337_4.method7441(local22.anInt8895);
			if (local30 != null && local30.aBoolean219 && local30.method2406(Static392.anInterface1_2)) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZII)V")
	public static void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static548.anInt9202 = arg1;
		Static466.anInt7862 = arg2;
		Static23.anInt454 = arg3;
		Static354.anInt6168 = arg4;
		Static353.anInt6160 = arg0;
		if (Static466.anInt7862 >= 100) {
			@Pc(29) int local29 = Static548.anInt9202 * 512 + 256;
			@Pc(35) int local35 = Static353.anInt6160 * 512 + 256;
			@Pc(44) int local44 = Static160.method3164(local29, Static320.anInt5748, local35) - Static23.anInt454;
			@Pc(49) int local49 = local29 - Static473.anInt7978;
			@Pc(53) int local53 = local44 - Static569.anInt4616;
			@Pc(58) int local58 = local35 - Static563.anInt9436;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local58 * local58 + local49 * local49));
			Static348.anInt6087 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static37.anInt738 = (int) (Math.atan2((double) local49, (double) local58) * -2607.5945876176133D) & 0x3FFF;
			Static235.anInt4750 = 0;
			if (Static348.anInt6087 < 1024) {
				Static348.anInt6087 = 1024;
			}
			if (Static348.anInt6087 > 3072) {
				Static348.anInt6087 = 3072;
			}
		}
		Static140.anInt3147 = -1;
		Static380.anInt6749 = -1;
		Static555.anInt9335 = 2;
	}
}
