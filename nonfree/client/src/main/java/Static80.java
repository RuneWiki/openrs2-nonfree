import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
	public static int[] anIntArray202 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_613 = Static184.method2923("title_mute");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!ea;)Lclient!tj;")
	public static Class94 method1466(@OriginalArg(1) Class2_Sub3 arg0) {
		@Pc(15) Class94 local15 = new Class94();
		local15.anInt4376 = arg0.method163();
		local15.aClass2_Sub2_Sub20_1 = Static151.method2358(local15.anInt4376);
		return local15;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
	public static void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static105.anInt2543 == 0 || arg0 == 0 || Static156.anInt3673 >= 50 || arg2 == -1) {
			return;
		}
		Static23.anIntArray46[Static156.anInt3673] = arg2;
		Static96.anIntArray238[Static156.anInt3673] = arg0;
		Static7.anIntArray14[Static156.anInt3673] = arg1;
		Static210.aClass24Array1[Static156.anInt3673] = null;
		Static130.anIntArray409[Static156.anInt3673] = 0;
		Static156.anInt3673++;
	}
}
