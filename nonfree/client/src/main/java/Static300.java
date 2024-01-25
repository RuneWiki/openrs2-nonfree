import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!gf;")
	public static Class88 aClass88_3;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "I")
	public static int anInt5179;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "Z")
	public static boolean aBoolean350;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Lclient!s;")
	public static final Class217 aClass217_115 = new Class217(16, -1);

	@OriginalMember(owner = "client!os", name = "k", descriptor = "Lclient!s;")
	public static final Class217 aClass217_116 = new Class217(109, 6);

	@OriginalMember(owner = "client!os", name = "l", descriptor = "Z")
	public static boolean aBoolean351 = true;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method4152(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static42.aClass248_1.anInt6844 : Static42.aClass248_1.anInt6843) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class10_Sub1_Sub12 local38 = Static42.aClass248_1.method5371(local31);
			if (local38.aBoolean324 && local38.method3855().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static9.anInt150 = -1;
					Static260.aShortArray69 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(69) short[] local69 = new short[local11.length * 2];
					for (@Pc(71) int local71 = 0; local71 < local13; local71++) {
						local69[local71] = local11[local71];
					}
					local11 = local69;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static260.aShortArray69 = local11;
		Static9.anInt150 = local13;
		Static452.anInt4834 = 0;
		@Pc(112) String[] local112 = new String[Static9.anInt150];
		for (@Pc(114) int local114 = 0; local114 < Static9.anInt150; local114++) {
			local112[local114] = Static42.aClass248_1.method5371(local11[local114]).method3855();
		}
		Static259.method4921(local112, Static260.aShortArray69);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!nn;I)Lclient!dw;")
	public static Class62 method4153(@OriginalArg(0) Class10_Sub8 arg0) {
		@Pc(12) Class62 local12 = new Class62();
		local12.anInt1812 = arg0.method2485();
		local12.aClass10_Sub1_Sub12_1 = Static42.aClass248_1.method5371(local12.anInt1812);
		return local12;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method4156(@OriginalArg(0) Class50 arg0) {
		if (Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 != Static319.anInt5487 && (Static309.aClass11ArrayArrayArray2 != null && Static419.method5511(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, arg0))) {
			Static319.anInt5487 = Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98;
		}
	}
}
