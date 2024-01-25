import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
	public static int anInt3519;

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "Lclient!ha;")
	public static Class35 aClass35_17;

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
	public static int anInt3520;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIIZIIIIIII)V")
	public static void method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static532.aClass75Array3 == null) {
			return;
		}
		@Pc(8) Class1_Sub1_Sub2 local8 = null;
		@Pc(15) int local15;
		if (arg5 < 0) {
			local15 = -arg5 - 1;
			if (local15 == Static174.anInt3154) {
				local8 = Static266.aClass1_Sub1_Sub2_Sub1_1;
			} else {
				local8 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local15];
			}
		} else {
			local15 = arg5 - 1;
			@Pc(37) Class2_Sub11 local37 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local15);
			if (local37 != null) {
				local8 = local37.aClass1_Sub1_Sub2_Sub2_1;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(50) Class129 local50 = Static505.aClass206_4.method5326(arg10);
		@Pc(62) int local62;
		@Pc(59) int local59;
		if (arg3 == 1 || arg3 == 3) {
			local59 = local50.anInt3650;
			local62 = local50.anInt3653;
		} else {
			local59 = local50.anInt3653;
			local62 = local50.anInt3650;
		}
		@Pc(76) int local76 = (local59 >> 1) + arg0;
		@Pc(84) int local84 = (local59 + 1 >> 1) + arg0;
		@Pc(90) int local90 = (local62 >> 1) + arg12;
		@Pc(98) int local98 = arg12 + (local62 + 1 >> 1);
		@Pc(102) Class75 local102 = Static532.aClass75Array3[arg7];
		@Pc(125) int local125 = local102.ba(local76, local90) + local102.ba(local84, local90) + local102.ba(local76, local98) + local102.ba(local84, local98) >> 2;
		@Pc(129) Class2_Sub47 local129 = new Class2_Sub47();
		local129.anInt9129 = arg10;
		local129.anInt9139 = arg0;
		local129.anInt9138 = arg3;
		local129.anInt9133 = arg6;
		local129.anInt9134 = arg12;
		local129.anInt9145 = arg8 + Static115.anInt2326;
		@Pc(159) int local159;
		if (arg2 < arg9) {
			local159 = arg9;
			arg9 = arg2;
			arg2 = local159;
		}
		local129.anInt9142 = local8.aByte90;
		local129.anInt9135 = arg1 + Static115.anInt2326;
		local129.anInt9137 = arg9 + arg0;
		if (arg4 > arg11) {
			local159 = arg4;
			arg4 = arg11;
			arg11 = local159;
		}
		local129.anInt9132 = arg0 + arg2;
		local129.anInt9131 = arg12 + arg11;
		local129.anInt9143 = local125;
		local129.anInt9136 = (local129.anInt9139 << 7) + (local59 << 6);
		local129.anInt9140 = (local62 << 6) + (local129.anInt9134 << 7);
		local129.anInt9141 = arg12 + arg4;
		Static31.aClass249_31.method6523(local129);
		local8.aClass2_Sub47_3 = local129;
	}
}
