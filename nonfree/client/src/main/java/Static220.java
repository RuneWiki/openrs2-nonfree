import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	public static int anInt4290;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "[B")
	public static final byte[] aByteArray53 = new byte[520];

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
	public static int anInt4289 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
	public static boolean method3499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static92.anIntArrayArrayArray9[arg0][arg1][arg2];
		if (local7 == -Static207.anInt4137) {
			return false;
		} else if (local7 == Static207.anInt4137) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static287.anInt5248;
			@Pc(26) int local26 = arg2 << Static287.anInt5248;
			if (Static386.method5263(local22 + 1, Static120.aClass64Array1[arg0].I(arg1, arg2), local26 + 1) && Static386.method5263(local22 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1 + 1, arg2), local26 + 1) && Static386.method5263(local22 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1 + 1, arg2 + 1), local26 + Static122.anInt2633 - 1) && Static386.method5263(local22 + 1, Static120.aClass64Array1[arg0].I(arg1, arg2 + 1), local26 + Static122.anInt2633 - 1) && Static386.method5263(local22 + Static340.anInt6290, Static120.aClass64Array1[arg0].I(arg1, arg2), local26 + 1) && Static386.method5263(local22 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1 + 1, arg2), local26 + Static340.anInt6290) && Static386.method5263(local22 + Static340.anInt6290, Static120.aClass64Array1[arg0].I(arg1, arg2 + 1), local26 + Static122.anInt2633 - 1) && Static386.method5263(local22 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1, arg2), local26 + Static340.anInt6290) && Static386.method5263(local22 + Static340.anInt6290, Static120.aClass64Array1[arg0].I(arg1, arg2), local26 + Static340.anInt6290)) {
				Static92.anIntArrayArrayArray9[arg0][arg1][arg2] = Static207.anInt4137;
				return true;
			} else {
				Static92.anIntArrayArrayArray9[arg0][arg1][arg2] = -Static207.anInt4137;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	public static void method3501() {
		if (Static189.anInt3807 < 0) {
			Static293.anInt3444 = -1;
			Static336.anInt6190 = -1;
			Static189.anInt3807 = 0;
		}
		if (Static210.anInt7495 < Static189.anInt3807) {
			Static189.anInt3807 = Static210.anInt7495;
			Static336.anInt6190 = -1;
			Static293.anInt3444 = -1;
		}
		if (Static372.anInt1537 < 0) {
			Static336.anInt6190 = -1;
			Static372.anInt1537 = 0;
			Static293.anInt3444 = -1;
		}
		if (Static372.anInt1537 > Static210.anInt7501) {
			Static293.anInt3444 = -1;
			Static372.anInt1537 = Static210.anInt7501;
			Static336.anInt6190 = -1;
		}
	}
}
