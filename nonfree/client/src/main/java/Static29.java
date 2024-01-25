import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
	public static int anInt761 = -1;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
	public static void method539() {
		@Pc(5) int local5 = 0;
		if (Static72.aClass2_Sub12_Sub1_1.method1408(Static391.anInt6846)) {
			local5 = 55;
		}
		if (!Static72.aClass2_Sub12_Sub1_1.aBoolean150) {
			local5 |= 0x40;
		}
		Static416.method6030(local5);
		Static541.aClass97_4.method1796(local5);
		Static296.aClass218_1.method5066(local5);
		Static254.aClass202_2.method4487(local5);
		Static215.aClass33_1.method586(local5);
		Static299.method4538(local5);
		Static114.method1698(local5);
		Static308.method4595(local5);
		Static130.method4332(local5);
		Static265.method4069();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZZ)V")
	public static void method540(@OriginalArg(1) boolean arg0) {
		if (Static527.aClass175_1 == null) {
			Static229.method3606();
		}
		if (arg0) {
			Static527.aClass175_1.method3939();
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLclient!kp;)Lclient!kp;")
	public static Class196 method541(@OriginalArg(1) Class196 arg0) {
		if (arg0.anInt5089 != -1) {
			return Static117.method1748(arg0.anInt5089);
		}
		@Pc(26) int local26 = arg0.anInt5112 >>> 16;
		@Pc(31) Class333 local31 = new Class333(Static217.aClass162_20);
		for (@Pc(36) Class2_Sub44 local36 = (Class2_Sub44) local31.method7310(); local36 != null; local36 = (Class2_Sub44) local31.method7308()) {
			if (local36.anInt8608 == local26) {
				return Static117.method1748((int) local36.aLong268);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)I")
	public static int method542() {
		return Static56.anInt1299;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
	public static void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub3_Sub13 local14 = Static382.method5650(6, arg1);
		local14.method6098();
		local14.anInt7258 = arg0;
	}
}
