import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
	public static int anInt5634;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	public static int anInt5639;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z")
	public static boolean method4605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static211.aBoolean370) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static368.aClass331ArrayArray2[local21] == null || Static368.aClass331ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class331 local43 = Static368.aClass331ArrayArray2[local21][local25];
		@Pc(54) Class8_Sub5_Sub7 local54;
		if (arg1 == -1 && local43.anInt9490 == 0) {
			for (local54 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local54 != null; local54 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
				if (local54.anInt3779 == 13 || local54.anInt3779 == 1002 || local54.anInt3779 == 12 || local54.anInt3779 == 5 || local54.anInt3779 == 9) {
					for (@Pc(150) Class331 local150 = Static178.method3435(local54.anInt3782); local150 != null; local150 = Static222.method4170(local150)) {
						if (local150.anInt9578 == local43.anInt9578) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local54 != null; local54 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
				if (arg1 == local54.anInt3780 && local54.anInt3782 == local43.anInt9578 && (local54.anInt3779 == 13 || local54.anInt3779 == 1002 || local54.anInt3779 == 12 || local54.anInt3779 == 5 || local54.anInt3779 == 9)) {
					return true;
				}
			}
		}
		return false;
	}
}
