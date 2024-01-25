import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
	public static void method7331(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		Static319.aString70 = arg2;
		Static148.aString116 = arg0;
		Static262.aBoolean397 = arg1;
		if (!Static262.aBoolean397 && Static49.anInt1353 != 3 && (Static319.aString70.equals("") || Static148.aString116.equals(""))) {
			Static554.method7903(3);
			return;
		}
		if (Static49.anInt1353 != 1) {
			Static220.anInt4641 = 0;
			Static310.anInt5847 = -1;
		}
		Static519.aBoolean682 = false;
		Static554.method7903(-3);
		Static558.anInt9502 = 1;
		Static569.anInt9617 = 0;
		Static436.anInt7961 = 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)I")
	public static int method7333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static47.aClass62Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 9;
		@Pc(15) int local15 = arg1 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static228.anInt4746 - 1 || Static44.anInt1275 - 1 < local15) {
			return 0;
		}
		@Pc(40) int local40 = arg0;
		if (arg0 < 3 && (Static356.aByteArrayArrayArray17[1][local11][local15] & 0x2) != 0) {
			local40 = arg0 + 1;
		}
		return Static47.aClass62Array1[local40].sa(arg2, arg1);
	}
}
