import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "Lclient!vf;")
	public static Class365 aClass365_4;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "Lclient!ha;")
	public static Class65 aClass65_11;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method5557(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static270.anInt4979 = -1;
		Static245.anInt780 = 1;
		Static430.method58(arg1, arg0, false);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!mc;B)V")
	public static void method5558(@OriginalArg(0) Class5_Sub41 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt9230 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method7816();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray93.length - arg0.anInt9230 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method7860();
		if (arg0.aByteArray93.length - arg0.anInt9230 < local45 * 6) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local45; local63++) {
			@Pc(69) int local69 = arg0.method7860();
			@Pc(73) int local73 = arg0.method7804();
			if (Static326.anIntArray342.length > local69 && Static180.aBooleanArray15[local69] && (Static564.aClass185_6.method4761(local69).aChar1 != '1' || local73 >= -1 && local73 <= 1)) {
				Static326.anIntArray342[local69] = local73;
			}
		}
	}
}
