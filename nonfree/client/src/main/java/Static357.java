import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZII)V")
	public static void method4633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static390.anInt6394 = arg0 - Static98.anInt3328;
		Static438.anInt7278 = arg1 - Static98.anInt3332;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4635(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg1 ? Static407.aClass20_2.anInt560 : Static407.aClass20_2.anInt564);
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class5_Sub2_Sub15 local39 = Static407.aClass20_2.method458(local32);
			if (local39.aBoolean397 && local39.method4702().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static244.aShortArray63 = null;
					Static52.anInt930 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(72) short[] local72 = new short[local11.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local13; local74++) {
						local72[local74] = local11[local74];
					}
					local11 = local72;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static244.aShortArray63 = local11;
		Static52.anInt930 = local13;
		Static15.anInt343 = 0;
		@Pc(115) String[] local115 = new String[Static52.anInt930];
		for (@Pc(117) int local117 = 0; local117 < Static52.anInt930; local117++) {
			local115[local117] = Static407.aClass20_2.method458(local11[local117]).method4702();
		}
		Static258.method3329(local115, Static244.aShortArray63);
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V")
	public static void method4636() {
		Static430.aBoolean482 = false;
		Static412.aClipboard1 = null;
		Static251.method3223();
	}
}
