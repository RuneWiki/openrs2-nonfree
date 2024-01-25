import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZII[B)Ljava/lang/String;")
	public static String method7511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
			@Pc(28) int local28 = arg2[local18 + arg0] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(49) char local49 = Static145.aCharArray8[local28 - 128];
					if (local49 == '\u0000') {
						local49 = '?';
					}
					local28 = local49;
				}
				local8[local10++] = (char) local28;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method7512() {
		@Pc(7) int[] local7 = Static384.anIntArray436;
		for (@Pc(9) int local9 = 0; local9 < Static607.anInt9201; local9++) {
			@Pc(17) Class9_Sub1_Sub1_Sub2_Sub1 local17 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local7[local9]];
			if (local17 != null) {
				local17.method7493();
			}
		}
		for (@Pc(30) int local30 = 0; local30 < Static28.anInt1087; local30++) {
			@Pc(39) long local39 = (long) Static633.anIntArray705[local30];
			@Pc(45) Class3_Sub52 local45 = (Class3_Sub52) Static94.aClass313_8.method7104(local39);
			if (local45 != null) {
				local45.aClass9_Sub1_Sub1_Sub2_Sub2_2.method7493();
			}
		}
		if (-75 <= -117 || Static103.anInt2245 != 3) {
			return;
		}
		for (@Pc(75) int local75 = 0; local75 < Static470.aClass7Array1.length; local75++) {
			@Pc(81) Class7 local81 = Static470.aClass7Array1[local75];
			if (local81.aBoolean4) {
				local81.method249().method7493();
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Z")
	public static boolean method7513() {
		Static572.aBoolean586 = true;
		Static407.anInt6329++;
		return true;
	}
}
