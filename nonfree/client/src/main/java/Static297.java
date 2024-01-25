import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
	public static int anInt571;

	@OriginalMember(owner = "client!kda", name = "v", descriptor = "[I")
	public static final int[] anIntArray49 = new int[2];

	@OriginalMember(owner = "client!kda", name = "w", descriptor = "[I")
	public static final int[] anIntArray50 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)[B")
	public static byte[] method523(@OriginalArg(1) int arg0) {
		@Pc(18) Class5_Sub2_Sub8 local18 = (Class5_Sub2_Sub8) Static323.aClass252_1.method5973((long) arg0);
		if (local18 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static653.method8578(local51, local29);
				@Pc(60) byte local60 = local23[local56];
				local23[local56] = local23[local51];
				local23[local51] = local23[511 - local45] = local60;
			}
			local18 = new Class5_Sub2_Sub8(local23);
			Static323.aClass252_1.method5974(local18, (long) arg0);
		}
		return local18.aByteArray46;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBI)V")
	public static void method533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static622.anInt9017 = arg0;
		Static630.anInt10065 = arg1;
		if (Static634.anInt10113 == 0) {
			Static275.anInt4317 = Static665.anInt7246 * 2 + Static630.anInt10065;
			Static584.anInt9612 = Static320.anInt10345 * 2 + Static622.anInt9017;
		} else if (Static634.anInt10113 == 1) {
			Static449.anInt7857 = Static10.anInt178 + Static630.anInt10065 / Static586.anInt9622 + 2;
			Static259.anInt4111 = Static622.anInt9017 / Static77.anInt1204 + Static458.anInt7968 + 2;
			Static275.anInt4317 = Static586.anInt9622 * Static449.anInt7857;
			Static584.anInt9612 = Static77.anInt1204 * Static259.anInt4111;
			Static665.anInt7246 = Static275.anInt4317 - Static630.anInt10065 >> 1;
			Static320.anInt10345 = Static584.anInt9612 - Static622.anInt9017 >> 1;
		} else if (Static634.anInt10113 == 2) {
			Static275.anInt4317 = Static630.anInt10065;
			Static584.anInt9612 = Static622.anInt9017;
		}
	}
}
