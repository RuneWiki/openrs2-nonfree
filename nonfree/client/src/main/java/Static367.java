import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!nd;")
	public static Class238 aClass238_170;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Lclient!iea;")
	public static Class31 aClass31_15;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_141 = new Class200(33, -2);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5449(@OriginalArg(1) String arg0) {
		if (!Static557.aBoolean660 || (Static613.anInt10082 & 0x18) == 0) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(14) int local14 = Static649.anInt10495;
		@Pc(16) int[] local16 = Static426.anIntArray476;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(25) Class16_Sub1_Sub1_Sub3_Sub2 local25 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local16[local18]];
			if (local25.aString82 != null && local25.aString82.equalsIgnoreCase(arg0) && (local25 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 && (Static613.anInt10082 & 0x10) != 0 || local25 != null && (Static613.anInt10082 & 0x8) != 0)) {
				@Pc(58) Class2_Sub31 local58 = Static275.method4480(Static640.aClass314_2, Static580.aClass145_167);
				local58.aClass2_Sub17_Sub1_2.method2889(Static252.anInt4804);
				local58.aClass2_Sub17_Sub1_2.method2889(Static264.anInt4966);
				local58.aClass2_Sub17_Sub1_2.method2824(0);
				local58.aClass2_Sub17_Sub1_2.method2883(local16[local18]);
				local58.aClass2_Sub17_Sub1_2.method2866(Static454.anInt7419);
				Static526.method7309(local58);
				Static250.method4182(0, local25.method6999(), 0, -2, true, local25.anIntArray595[0], local25.method6999(), local25.anIntArray594[0]);
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static601.method8468(Static573.aClass345_23.method7951(Static496.anInt7407) + arg0);
		}
		if (Static557.aBoolean660) {
			Static210.method8326();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZII)I")
	public static int method5450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}
}
