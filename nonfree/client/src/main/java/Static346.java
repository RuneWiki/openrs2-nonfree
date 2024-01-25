import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_107 = new Class6(103, 17);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!pc;Z)Z")
	public static boolean method5547(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static290.aClass10Array7 == Static106.aClass10Array5;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6952();
		if (arg0.aShort115 < 0 || arg0.aShort117 < 0 || arg0.aShort116 >= Static488.anInt8353 || arg0.aShort114 >= Static60.anInt1677) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort115; local34 <= arg0.aShort116; local34++) {
			for (local38 = arg0.aShort117; local38 <= arg0.aShort114; local38++) {
				@Pc(45) Class206 local45 = Static64.method1808(arg0.aByte94, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort115) {
						local49++;
					}
					if (local34 < arg0.aShort116) {
						local49 += 4;
					}
					if (local38 > arg0.aShort117) {
						local49 += 8;
					}
					if (local38 < arg0.aShort114) {
						local49 += 2;
					}
					@Pc(74) Class168 local74 = Static462.method6791(local49, arg0);
					@Pc(77) Class168 local77 = local45.aClass168_2;
					if (local77 == null) {
						local45.aClass168_2 = local74;
					} else {
						while (local77.aClass168_1 != null) {
							local77 = local77.aClass168_1;
						}
						local77.aClass168_1 = local74;
					}
					local45.aByte71 = (byte) (local45.aByte71 | local49);
					if (local6 && (Static184.anIntArrayArray32[local34][local38] & 0xFF000000) != 0) {
						local8 = Static184.anIntArrayArray32[local34][local38];
						local10 = Static184.aShortArrayArray3[local34][local38];
						local12 = Static39.aByteArrayArray7[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort115; local38 <= arg0.aShort116; local38++) {
				for (@Pc(150) int local150 = arg0.aShort117; local150 <= arg0.aShort114; local150++) {
					if ((Static184.anIntArrayArray32[local38][local150] & 0xFF000000) == 0) {
						Static184.anIntArrayArray32[local38][local150] = local8;
						Static184.aShortArrayArray3[local38][local150] = local10;
						Static39.aByteArrayArray7[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static530.aClass47_Sub2Array3[Static375.anInt6600++] = arg0;
		}
		return true;
	}
}
