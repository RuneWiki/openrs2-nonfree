import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public static int anInt5910;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!an;")
	public static final Class20 aClass20_9 = new Class20(9, 19);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5003(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(21) int local21 = 0;
		@Pc(27) int local27 = arg0 ? 32768 : 0;
		@Pc(37) int local37 = local27 + (arg0 ? Static221.aClass136_1.anInt5085 : Static221.aClass136_1.anInt5086);
		for (@Pc(39) int local39 = local27; local39 < local37; local39++) {
			@Pc(46) Class3_Sub1_Sub19 local46 = Static221.aClass136_1.method4290(local39);
			if (local46.aBoolean741 && local46.method7191().toLowerCase().indexOf(local8) != -1) {
				if (local21 >= 50) {
					Static29.anInt562 = -1;
					Static179.aShortArray34 = null;
					return;
				}
				if (local21 >= local11.length) {
					@Pc(80) short[] local80 = new short[local11.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local21; local82++) {
						local80[local82] = local11[local82];
					}
					local11 = local80;
				}
				local11[local21++] = (short) local39;
			}
		}
		Static385.anInt10555 = 0;
		Static29.anInt562 = local21;
		Static179.aShortArray34 = local11;
		@Pc(119) String[] local119 = new String[Static29.anInt562];
		for (@Pc(121) int local121 = 0; local121 < Static29.anInt562; local121++) {
			local119[local121] = Static221.aClass136_1.method4290(local11[local121]).method7191();
		}
		Static87.method2249(local119, Static179.aShortArray34);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!dt;)V")
	public static void method5004(@OriginalArg(0) Class70 arg0) {
		Static625.aClass70_2 = arg0;
	}
}
