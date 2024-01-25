import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
	public static int anInt2253;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_58 = new Class12(82, -2);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BCI)I")
	public static int method1922(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local15 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local15 = 1762;
		}
		return local15;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	public static void method1924() {
		@Pc(7) int local7 = Static285.anInt5015;
		@Pc(9) int[] local9 = Static103.anIntArray135;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class25_Sub5_Sub1_Sub2 local19 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt4291 > 0) {
				local19.anInt4291--;
				if (local19.anInt4291 == 0) {
					local19.aString50 = null;
				}
			}
		}
		for (@Pc(52) int local52 = 0; local52 < Static328.anInt5608; local52++) {
			@Pc(58) int local58 = Static31.anIntArray30[local52];
			@Pc(62) Class25_Sub5_Sub1_Sub1 local62 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local58];
			if (local62 != null && local62.anInt4291 > 0) {
				local62.anInt4291--;
				if (local62.anInt4291 == 0) {
					local62.aString50 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)I")
	public static int method1925(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
