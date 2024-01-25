import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!gp;")
	public static Class117 aClass117_81;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	public static int method2801() {
		return Static263.anInt5184++;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!od;Z[[B)V")
	public static void method2802(@OriginalArg(0) Class130_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class5_Sub3 local30 = new Class5_Sub3(local23);
				local36 = Static103.anIntArray76[local17] >> 8;
				@Pc(42) int local42 = Static103.anIntArray76[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static515.anInt3214;
				@Pc(56) int local56 = local42 * 64 - Static338.anInt6353;
				Static485.method6727();
				arg0.method5424(local49, Static338.anInt6353, Static71.aClass10Array3, local56, Static515.anInt3214, local30);
				arg0.method5428(local30, local12, local49, Static110.aClass62_15, local56);
				if (!arg0.aBoolean453 && Static381.anInt6974 / 8 == local36 && local42 == Static100.anInt2262 / 8 && local12[0] != -1) {
					Static514.aClass82_1 = Static175.aClass49_1.method1196(local12[3], Static420.aClass118_10, local12[2], local12[1], local12[0]);
					Static458.anInt7886 = local12[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local15; local131++) {
			@Pc(144) int local144 = (Static103.anIntArray76[local131] >> 8) * 64 - Static515.anInt3214;
			local36 = (Static103.anIntArray76[local131] & 0xFF) * 64 - Static338.anInt6353;
			@Pc(159) byte[] local159 = arg1[local131];
			if (local159 == null && Static100.anInt2262 < 800) {
				Static485.method6727();
				arg0.method5419(local144, local36);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)S")
	public static short method2803(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(43) int local43 = local19 + local39;
		@Pc(54) int local54;
		if (local43 == 0) {
			local54 = local39 << 1;
		} else {
			local54 = (local39 << 8) / local43;
		}
		return (short) (local9 << 10 | local54 >> 4 << 7 | local43);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ae;Ljava/lang/Object;I)V")
	public static void method2805(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 50 && arg0.anEventQueue1.peekEvent() != null; local18++) {
			Static213.method3465(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
