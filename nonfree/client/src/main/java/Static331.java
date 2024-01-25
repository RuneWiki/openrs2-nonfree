import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array18;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!mv;")
	public static Class229 aClass229_80;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "S")
	public static short aShort71 = 256;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!mq;)V")
	public static void method4762(@OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub1 arg0) {
		@Pc(15) Class2_Sub40 local15 = (Class2_Sub40) Static399.aClass90_23.method1685((long) arg0.anInt8406);
		if (local15 == null) {
			return;
		}
		if (local15.aClass2_Sub3_Sub3_2 != null) {
			Static246.aClass2_Sub3_Sub4_2.method6705(local15.aClass2_Sub3_Sub3_2);
			local15.aClass2_Sub3_Sub3_2 = null;
		}
		local15.method7657();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	public static int method4763() {
		return Static345.anInt5964;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!gk;B)V")
	public static void method4764(@OriginalArg(0) Class2_Sub7 arg0) {
		if (arg0.aByteArray52.length - arg0.anInt5186 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method4464();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray52.length - arg0.anInt5186 < 2) {
			return;
		}
		@Pc(39) int local39 = arg0.method4518();
		if (local39 * 6 > arg0.aByteArray52.length - arg0.anInt5186) {
			return;
		}
		for (@Pc(61) int local61 = 0; local61 < local39; local61++) {
			@Pc(67) int local67 = arg0.method4518();
			@Pc(71) int local71 = arg0.method4509();
			if (Static297.anIntArray342.length > local67 && Static143.aBooleanArray26[local67] && (Static109.aClass355_1.method7449(local67).aChar4 != '1' || local71 >= -1 && local71 <= 1)) {
				Static297.anIntArray342[local67] = local71;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Z")
	public static boolean method4765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
