import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array17;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!or;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!ui;")
	public static final Class248 aClass248_8 = new Class248("LOCAL", 4);

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_176 = new Class158("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ec;B)V")
	public static void method5104(@OriginalArg(0) Class68 arg0) {
		@Pc(15) Class68 local15 = Static420.method3351(arg0);
		@Pc(19) int local19;
		@Pc(21) int local21;
		if (local15 == null) {
			local19 = Static152.anInt3234;
			local21 = Static342.anInt6292;
		} else {
			local19 = local15.anInt2107;
			local21 = local15.anInt2149;
		}
		Static26.method558(arg0, false, local19, local21);
		Static45.method858(arg0, local19, local21);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5108(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg0, 2);
		local8.method2957();
		local8.aString33 = arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method5109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static372.aShortArrayArray6 == null ? 0 : Static372.aShortArrayArray6[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ia;)V")
	public static void method5115(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aByteArray14.length - arg0.anInt1710 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method1171();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray14.length - arg0.anInt1710 < 2) {
			return;
		}
		@Pc(42) int local42 = arg0.method1177();
		if (local42 * 6 > arg0.aByteArray14.length - arg0.anInt1710) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < local42; local59++) {
			@Pc(65) int local65 = arg0.method1177();
			@Pc(71) int local71 = arg0.method1188();
			if (Static31.anIntArray221.length > local65 && Static398.aBooleanArray23[local65] && (Static344.aClass56_1.method1400(local65).aChar2 != '1' || local71 >= -1 && local71 <= 1)) {
				Static31.anIntArray221[local65] = local71;
			}
		}
	}
}
