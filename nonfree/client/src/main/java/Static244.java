import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "[S")
	public static short[] aShortArray63;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
	public static int anInt3937 = 0;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	public static int anInt3939 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = Static21.aClass14_1.method286(Static226.aClass198_62.method4012(Static38.anInt4834));
		@Pc(32) int local32;
		for (@Pc(26) Class5_Sub41 local26 = (Class5_Sub41) Static122.aClass177_13.method3618(); local26 != null; local26 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			local32 = Static120.method1713(local26);
			if (local32 > local21) {
				local21 = local32;
			}
		}
		local21 += 8;
		local32 = Static18.anInt395 * 16 + 21;
		@Pc(57) int local57 = arg0 - local21 / 2;
		if (local21 + local57 > Static178.anInt5792) {
			local57 = Static178.anInt5792 - local21;
		}
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(79) int local79 = arg1;
		if (local32 + arg1 > Static102.anInt1723) {
			local79 = Static102.anInt1723 - local32;
		}
		if (local79 < 0) {
			local79 = 0;
		}
		Static285.anInt4431 = local57;
		Static272.aBoolean283 = true;
		Static335.anInt5447 = Static18.anInt395 * 16 + (Static286.aBoolean295 ? 26 : 22);
		Static381.anInt3882 = local79;
		Static78.anInt4643 = local21;
	}
}
