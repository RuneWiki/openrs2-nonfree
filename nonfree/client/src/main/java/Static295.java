import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	public static int anInt4973;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public static void method4153() {
		Static6.aBoolean11 = false;
		Static272.aByte15 = 0;
		Static247.anInt4992 = 0;
		Static230.anInt4489 = 0;
		Static81.anInt1533 = 0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public static void method4155() {
		Static98.aClass3_Sub4_Sub12_1 = null;
		Static36.anInt639 = -1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method4156(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(45) int local45 = 2;
		@Pc(49) int local49 = arg0 / 10;
		while (local49 != 0) {
			local49 /= 10;
			local45++;
		}
		@Pc(61) char[] local61 = new char[local45];
		local61[0] = '+';
		for (@Pc(69) int local69 = local45 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local73 - arg0 * 10;
			if (local83 >= 10) {
				local61[local69] = (char) (local83 + 87);
			} else {
				local61[local69] = (char) (local83 + 48);
			}
		}
		return new String(local61);
	}
}
