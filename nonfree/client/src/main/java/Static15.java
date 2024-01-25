import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Lclient!ae;")
	public static final Class6 aClass6_1 = new Class6("stellardawn", 1);

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "Z")
	public static final boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_10 = new Class146(46, 8);

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_9 = new Class15("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method181(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static159.method2253(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method182(@OriginalArg(0) String arg0) {
		if (!Static70.aBoolean94) {
			return;
		}
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17 = Static438.anInt2796;
		@Pc(19) int[] local19 = Static78.anIntArray114;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			@Pc(29) Class8_Sub3_Sub1_Sub1 local29 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local19[local21]];
			if (local29 != null && local29 != Static401.aClass8_Sub3_Sub1_Sub1_2 && local29.aString60 != null && local29.aString60.equalsIgnoreCase(arg0)) {
				Static448.method5935(Static221.aClass146_56);
				Static247.aClass4_Sub9_Sub2_2.method5048(Static259.anInt4347);
				Static247.aClass4_Sub9_Sub2_2.method4996(0);
				Static247.aClass4_Sub9_Sub2_2.method5053(Static81.anInt1601);
				Static247.aClass4_Sub9_Sub2_2.method5053(Static270.anInt4512);
				Static247.aClass4_Sub9_Sub2_2.method5018(local19[local21]);
				Static344.method4581(-2, true, local29.anIntArray560[0], local29.method5894(), local29.anIntArray559[0], 0, local29.method5894(), 0);
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static392.method5198(Static9.aClass15_86.method180(Static429.anInt6999) + arg0);
		}
		if (Static70.aBoolean94) {
			Static4.method74();
		}
	}
}
