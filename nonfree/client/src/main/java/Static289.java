import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!wh;")
	public static Class4_Sub2_Sub12 aClass4_Sub2_Sub12_3;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public static int anInt5418 = 0;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public static int anInt5422 = -1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)[Lclient!bi;")
	public static Class4_Sub2_Sub1[] method4305() {
		@Pc(4) Class4_Sub2_Sub1[] local4 = new Class4_Sub2_Sub1[Static84.anInt1699];
		for (@Pc(10) int local10 = 0; local10 < Static84.anInt1699; local10++) {
			@Pc(27) int local27 = Static159.anIntArray285[local10] * Static46.anIntArray120[local10];
			@Pc(30) int[] local30 = new int[local27];
			@Pc(34) byte[] local34 = Static274.aByteArrayArray20[local10];
			for (@Pc(36) int local36 = 0; local36 < local27; local36++) {
				local30[local36] = Static6.anIntArray14[local34[local36] & 0xFF];
			}
			if (Static178.aBoolean216) {
				local4[local10] = new Class4_Sub2_Sub1_Sub2(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local10], Static100.anIntArray223[local10], Static159.anIntArray285[local10], Static46.anIntArray120[local10], local30);
			} else {
				local4[local10] = new Class4_Sub2_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local10], Static100.anIntArray223[local10], Static159.anIntArray285[local10], Static46.anIntArray120[local10], local30);
			}
		}
		Static268.method4006();
		return local4;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method4306() {
		aClass4_Sub2_Sub12_3 = null;
	}
}
