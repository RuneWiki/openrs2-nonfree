import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_22 = new Class25(63, -1);

	@OriginalMember(owner = "client!co", name = "i", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_13 = new Class208(73, -1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!on;)V")
	public static void method903(@OriginalArg(1) Class28_Sub5 arg0) {
		arg0.aClass11_1 = null;
		@Pc(20) int local20 = arg0.aClass28_Sub4Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			arg0.aClass28_Sub4Array1[local22].aBoolean246 = false;
		}
		@Pc(40) Class97[] local40 = Class20.aClass97Array3;
		synchronized (Class20.aClass97Array3) {
			if (local20 < Class20.aClass97Array3.length && Static224.anIntArray346[local20] < 200) {
				Class20.aClass97Array3[local20].method2154(arg0);
				@Pc(61) int local61 = Static224.anIntArray346[local20]++;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)V")
	public static void method907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static9.aClass15_9.method320(Static14.aClass231_7.method5261(Static80.anInt6195));
		@Pc(32) int local32;
		for (@Pc(26) Class2_Sub35 local26 = (Class2_Sub35) Static93.aClass181_7.method3972(); local26 != null; local26 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			local32 = Static287.method4059(local26);
			if (local13 < local32) {
				local13 = local32;
			}
		}
		local13 += 8;
		local32 = Static377.anInt6585 * 16 + 21;
		@Pc(62) int local62 = arg1 - local13 / 2;
		if (local62 + local13 > Static49.anInt789) {
			local62 = Static49.anInt789 - local13;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(81) int local81 = arg0;
		if (arg0 + local32 > Static344.anInt6105) {
			local81 = Static344.anInt6105 - local32;
		}
		if (local81 < 0) {
			local81 = 0;
		}
		Static281.anInt4448 = local62;
		Static204.anInt3495 = local13;
		Static45.aBoolean34 = true;
		Static168.anInt6340 = local81;
		Static407.anInt7040 = (Static237.aBoolean264 ? 26 : 22) + Static377.anInt6585 * 16;
	}
}
