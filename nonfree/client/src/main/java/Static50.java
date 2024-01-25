import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ct", name = "E", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!ct", name = "O", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_19 = new Class32("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
	public static int anInt1038 = 0;

	@OriginalMember(owner = "client!ct", name = "R", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_25 = new Class205(79, 1);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BII)I")
	public static int method860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)V")
	public static void method861(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub10_Sub2 local14 = Static217.method3611(arg0, 16);
		local14.method859();
	}
}
