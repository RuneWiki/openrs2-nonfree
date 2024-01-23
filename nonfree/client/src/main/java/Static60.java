import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Lclient!nf;")
	public static Class126 aClass126_1 = new Class126();

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	public static int anInt1213 = 0;

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
	public static int anInt1216 = 0;

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IJII)Z")
	public static boolean method1004(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 20 & 0x3;
		@Pc(23) int local23 = (int) arg1 >> 14 & 0x1F;
		@Pc(30) int local30 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local23 == 10 || local23 == 11 || local23 == 22) {
			@Pc(49) Class184 local49 = Static6.method99(local30);
			@Pc(52) int local52 = local49.anInt5539;
			@Pc(63) int local63;
			@Pc(66) int local66;
			if (local12 == 0 || local12 == 2) {
				local66 = local49.anInt5517;
				local63 = local49.anInt5528;
			} else {
				local63 = local49.anInt5517;
				local66 = local49.anInt5528;
			}
			if (local12 != 0) {
				local52 = (local52 << local12 & 0xF) + (local52 >> 4 - local12);
			}
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, local52, local63, arg0, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local66, arg2);
		} else {
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], local12, 0, 0, arg0, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], local23 + 1, 0, arg2);
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
	public static boolean method1005(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = Static262.aShortArray100[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1009;
	}
}
