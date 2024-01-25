import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "Z")
	public static boolean aBoolean764 = true;

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray876 = new int[8];

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)Lclient!fca;")
	public static Class3_Sub22 method8814() {
		@Pc(7) Class214 local7 = null;
		@Pc(13) Class3_Sub22 local13 = new Class3_Sub22(Static55.aClass118_2, 0);
		try {
			@Pc(19) Class81 local19 = Static247.aClass291_1.method7130("");
			while (local19.anInt2532 == 0) {
				Static373.method5403(1L);
			}
			if (local19.anInt2532 == 1) {
				local7 = (Class214) local19.anObject4;
				@Pc(43) byte[] local43 = new byte[(int) local7.method5376()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local7.method5381(local45, local43, local43.length - local45);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class3_Sub22(new Class3_Sub25(local43), Static55.aClass118_2, 0);
			}
		} catch (@Pc(86) Exception local86) {
		}
		try {
			if (local7 != null) {
				local7.method5380();
			}
		} catch (@Pc(93) Exception local93) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "(I)V")
	public static void method8816() {
		if (!Static624.aBoolean698) {
			return;
		}
		@Pc(17) Class260 local17 = Static245.method4101(Static531.anInt8767, Static287.anInt4913);
		if (local17 != null && local17.anObjectArray5 != null) {
			@Pc(26) Class3_Sub17 local26 = new Class3_Sub17();
			local26.anObjectArray2 = local17.anObjectArray5;
			local26.aClass260_6 = local17;
			Static565.method8015(local26);
		}
		Static21.anInt510 = -1;
		Static658.anInt10730 = -1;
		Static624.aBoolean698 = false;
		if (local17 != null) {
			Static456.method8151(local17);
		}
	}
}
