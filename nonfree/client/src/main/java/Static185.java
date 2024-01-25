import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IJ)V")
	public static void method2662(@OriginalArg(1) long arg0) {
		if (Static632.aClass311ArrayArrayArray3 != null) {
			if (Static60.anInt1040 == 1 || Static60.anInt1040 == 5) {
				Static160.method2368(arg0);
			} else if (Static60.anInt1040 == 4) {
				Static55.method811(arg0);
			}
		}
		Static183.method2654((long) Static528.anInt8386, Static396.aClass145_6);
		if (Static542.anInt8552 != -1) {
			Static170.method2534(Static542.anInt8552);
		}
		for (@Pc(49) int local49 = 0; local49 < Static172.anInt2988; local49++) {
			if (Static537.aBooleanArray25[local49]) {
				Static356.aBooleanArray26[local49] = true;
			}
			Static279.aBooleanArray21[local49] = Static537.aBooleanArray25[local49];
			Static537.aBooleanArray25[local49] = false;
		}
		Static482.anInt7720 = Static528.anInt8386;
		Static633.method8623((Class273) null, -1, -1);
		if (Static542.anInt8552 != -1) {
			Static172.anInt2988 = 0;
			Static25.method308();
		}
		Static396.aClass145_6.la();
		Static547.method7637(Static396.aClass145_6);
		@Pc(110) int local110 = Static220.method3083();
		if (local110 == -1) {
			local110 = Static85.anInt1436;
		}
		if (local110 == -1) {
			local110 = Static288.anInt4456;
		}
		Static693.method9336(local110);
		@Pc(130) int local130 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() << 8;
		Static3.method49(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 + local130, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, Static371.anInt5922, local130 + Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229);
		Static371.anInt5922 = 0;
	}
}
