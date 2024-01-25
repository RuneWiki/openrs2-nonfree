import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIBI)V")
	public static void method2912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static513.aByteArrayArrayArray18 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z")
	public static boolean method2913(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class3_Sub4_Sub13 local10 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local10 != null; local10 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
			if (Static582.method8235(local10.anInt4577) && local10.aLong136 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method2915(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static430.aClass113_2.anInt3141 : Static430.aClass113_2.anInt3144) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class3_Sub4_Sub16 local38 = Static430.aClass113_2.method2868(local31);
			if (local38.aBoolean361 && local38.method4827().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static629.aShortArray146 = null;
					Static285.anInt5065 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(74) short[] local74 = new short[local11.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
						local74[local76] = local11[local76];
					}
					local11 = local74;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static285.anInt5065 = local13;
		Static629.aShortArray146 = local11;
		Static470.anInt8251 = 0;
		@Pc(117) String[] local117 = new String[Static285.anInt5065];
		for (@Pc(119) int local119 = 0; local119 < Static285.anInt5065; local119++) {
			local117[local119] = Static430.aClass113_2.method2868(local11[local119]).method4827();
		}
		Static538.method7889(Static629.aShortArray146, local117);
	}
}
