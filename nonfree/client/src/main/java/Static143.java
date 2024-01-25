import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ep", name = "ub", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!ep", name = "yb", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!ep", name = "Ab", descriptor = "Lclient!rr;")
	public static Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!ep", name = "eb", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_43 = new Class100(57, 2);

	@OriginalMember(owner = "client!ep", name = "tb", descriptor = "I")
	public static int anInt2730 = 0;

	@OriginalMember(owner = "client!ep", name = "wb", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!qfa;I)V")
	public static void method2257(@OriginalArg(0) Class137_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static640.anObject6 == null) {
			@Pc(9) Class17_Sub1_Sub1 local9 = new Class17_Sub1_Sub1();
			local16 = local9.method8217();
			Static640.anObject6 = Static508.method7427(local16);
		}
		if (Static234.anObject9 == null) {
			@Pc(27) Class17_Sub2_Sub1 local27 = new Class17_Sub2_Sub1();
			local16 = local27.method3269();
			Static234.anObject9 = Static508.method7427(local16);
		}
		@Pc(44) Class268 local44 = arg0.aClass268_1;
		if (local44.method6472() && Static145.anObject5 == null) {
			local16 = Static427.method6301(0.6F, 16.0F, 4.0F, new Class11_Sub1(419684), 4.0F, 0.5F);
			Static145.anObject5 = Static508.method7427(local16);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIII)V")
	public static void method2260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static56.aClass14_Sub22_5.aClass21_Sub20_1.method7115() != 0 && arg2 != 0 && Static4.anInt29 < 50 && arg3 != -1) {
			Static178.aClass393Array1[Static4.anInt29++] = new Class393((byte) 1, arg3, arg2, arg1, arg0, 0, arg4, (Class12_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V")
	public static void method2263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static486.aClass58ArrayArrayArray2[0][arg1][arg2] != null && Static486.aClass58ArrayArrayArray2[0][arg1][arg2].aClass58_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static486.aClass58ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class58 local44 = Static486.aClass58ArrayArrayArray2[local22][arg1][arg2] = new Class58(local22);
				if (local20) {
					local44.aByte39++;
				}
			}
		}
	}
}
