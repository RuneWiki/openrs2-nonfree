import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	public static void method7834() {
		for (@Pc(10) Class6_Sub2_Sub2 local10 = (Class6_Sub2_Sub2) Static79.aClass361_9.method7838(); local10 != null; local10 = (Class6_Sub2_Sub2) Static79.aClass361_9.method7845()) {
			@Pc(23) Class4_Sub1_Sub6 local23 = local10.aClass4_Sub1_Sub6_1;
			if (local23.aBoolean732) {
				local10.method7804();
				local23.method7799();
			} else if (local23.anInt9543 <= Static312.anInt5688) {
				local23.method7794(Static54.anInt1208);
				if (local23.aBoolean732) {
					local10.method7804();
				} else {
					Static254.method7016(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)V")
	public static void method7844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class4_Sub2 local13 = local7.aClass4_Sub2_3;
		@Pc(16) Class4_Sub2 local16 = local7.aClass4_Sub2_2;
		if (local13 != null) {
			local13.anInt6699 = local13.anInt6699 * arg3 / (0x10 << Static339.anInt6128 - 7);
			local13.anInt6696 = local13.anInt6696 * arg3 / (0x10 << Static339.anInt6128 - 7);
		}
		if (local16 != null) {
			local16.anInt6699 = local16.anInt6699 * arg3 / (0x10 << Static339.anInt6128 - 7);
			local16.anInt6696 = local16.anInt6696 * arg3 / (0x10 << Static339.anInt6128 - 7);
		}
	}
}
