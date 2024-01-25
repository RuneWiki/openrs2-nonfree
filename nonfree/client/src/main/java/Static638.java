import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!vk", name = "G", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array44;

	@OriginalMember(owner = "client!vk", name = "I", descriptor = "Lclient!dl;")
	public static Class75 aClass75_3;

	@OriginalMember(owner = "client!vk", name = "K", descriptor = "Lclient!gga;")
	public static Class124 aClass124_130;

	@OriginalMember(owner = "client!vk", name = "L", descriptor = "[I")
	public static final int[] anIntArray577 = new int[16];

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(B)Z")
	public static boolean method9416() {
		@Pc(7) boolean local7 = true;
		if (Static315.aClass67_1 == null) {
			if (Static409.aClass124_84.method3627(Static512.anInt9125)) {
				Static315.aClass67_1 = Static676.method1689(Static409.aClass124_84, Static512.anInt9125);
			} else {
				local7 = false;
			}
		}
		if (Static623.aClass67_2 == null) {
			if (Static409.aClass124_84.method3627(Static35.anInt596)) {
				Static623.aClass67_2 = Static676.method1689(Static409.aClass124_84, Static35.anInt596);
			} else {
				local7 = false;
			}
		}
		if (Static655.aClass67_3 == null) {
			if (Static409.aClass124_84.method3627(Static221.anInt4514)) {
				Static655.aClass67_3 = Static676.method1689(Static409.aClass124_84, Static221.anInt4514);
			} else {
				local7 = false;
			}
		}
		if (Static228.aClass324_7 == null) {
			if (Static227.aClass124_49.method3627(Static144.anInt2713)) {
				Static228.aClass324_7 = Static386.method6506(Static227.aClass124_49, Static144.anInt2713);
			} else {
				local7 = false;
			}
		}
		if (Static271.aClass67Array1 == null) {
			if (Static409.aClass124_84.method3627(Static144.anInt2713)) {
				Static271.aClass67Array1 = Static676.method1699(Static409.aClass124_84, Static144.anInt2713);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
