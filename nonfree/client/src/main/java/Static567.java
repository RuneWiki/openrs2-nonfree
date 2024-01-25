import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!dl;")
	public static Class87 aClass87_4;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_58 = new Class340(64);

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void method7777() {
		Static475.aClass114_56 = new Class114();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7778(@OriginalArg(0) String arg0) {
		if (!Static55.aBoolean60 || (Static24.anInt7340 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static105.anInt2258;
		@Pc(21) int[] local21 = Static321.anIntArray339;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(30) Class28_Sub1_Sub4_Sub2_Sub2 local30 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local21[local23]];
			if (local30.aString45 != null && local30.aString45.equalsIgnoreCase(arg0) && (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == local30 && (Static24.anInt7340 & 0x10) != 0 || local30 != null && (Static24.anInt7340 & 0x8) != 0)) {
				@Pc(60) Class5_Sub21 local60 = Static64.method905(Static263.aClass49_1, Static50.aClass305_11);
				local60.aClass5_Sub41_Sub2_1.method7828(local21[local23]);
				local60.aClass5_Sub41_Sub2_1.method7809(Static353.anInt6392);
				local60.aClass5_Sub41_Sub2_1.method7803(Static549.anInt9003);
				local60.aClass5_Sub41_Sub2_1.method7850(0);
				local60.aClass5_Sub41_Sub2_1.method7809(Static529.anInt9069);
				Static495.method7092(local60);
				local17 = true;
				Static274.method4253(local30.anIntArray307[0], 0, local30.anIntArray308[0], local30.method4599(), -2, 0, local30.method4599(), true);
				break;
			}
		}
		if (!local17) {
			Static491.method7052(Static64.aClass52_21.method907(Static544.anInt8937) + arg0);
		}
		if (Static55.aBoolean60) {
			Static424.method6285();
		}
	}
}
