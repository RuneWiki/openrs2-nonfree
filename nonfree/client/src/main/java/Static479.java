import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static479 {

	@OriginalMember(owner = "client!qw", name = "qc", descriptor = "Lclient!nq;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!qw", name = "tc", descriptor = "Lclient!ms;")
	public static Class210_Sub1 aClass210_Sub1_2;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_96 = new Class185(52, 1);

	@OriginalMember(owner = "client!qw", name = "xb", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!sba;BII)V")
	public static void method7086(@OriginalArg(0) Class302 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static448.aClass302_13 != null || Static199.aBoolean358 || (arg0 == null || Static622.method8522(arg0) == null)) {
			return;
		}
		Static448.aClass302_13 = arg0;
		Static352.aClass302_9 = Static622.method8522(arg0);
		Static131.anInt3186 = arg2;
		Static30.aBoolean79 = false;
		Static191.anInt4144 = 0;
		Static334.anInt6640 = arg1;
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(B)Z")
	public static boolean method7089() {
		return Static333.anInt6626 >= 1;
	}
}
