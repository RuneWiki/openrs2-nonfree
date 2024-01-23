import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "[Lclient!vj;")
	public static Class29_Sub1[] aClass29_Sub1Array4;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_51;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
	public static boolean aBoolean387 = false;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "[I")
	public static int[] anIntArray506 = new int[2];

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString340 = null;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)[Lclient!pa;")
	public static Class1_Sub2_Sub1[] method4760() {
		@Pc(15) Class1_Sub2_Sub1[] local15 = new Class1_Sub2_Sub1[Static94.anInt3439];
		for (@Pc(17) int local17 = 0; local17 < Static94.anInt3439; local17++) {
			@Pc(32) int local32 = Static235.anIntArray468[local17] * Static160.anIntArray267[local17];
			@Pc(35) int[] local35 = new int[local32];
			@Pc(39) byte[] local39 = Static69.aByteArrayArray15[local17];
			for (@Pc(41) int local41 = 0; local41 < local32; local41++) {
				local35[local41] = Static83.anIntArray144[local39[local41] & 0xFF];
			}
			if (Static156.aBoolean211) {
				local15[local17] = new Class1_Sub2_Sub1_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local17], Static254.anIntArray412[local17], Static160.anIntArray267[local17], Static235.anIntArray468[local17], local35);
			} else {
				local15[local17] = new Class1_Sub2_Sub1_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local17], Static254.anIntArray412[local17], Static160.anIntArray267[local17], Static235.anIntArray468[local17], local35);
			}
		}
		Static117.method2101();
		return local15;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)I")
	public static int method4761(@OriginalArg(1) int arg0) {
		@Pc(7) Class35 local7 = Static247.method3903(arg0);
		@Pc(10) int local10 = local7.anInt961;
		@Pc(13) int local13 = local7.anInt964;
		@Pc(24) int local24 = local7.anInt967;
		@Pc(31) int local31 = Class1_Sub4_Sub18.anIntArray212[local24 - local13];
		return Static55.anIntArray64[local10] >> local13 & local31;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public static void method4764() {
		for (@Pc(6) Class1_Sub18 local6 = (Class1_Sub18) Static159.aClass59_26.method1704(); local6 != null; local6 = (Class1_Sub18) Static159.aClass59_26.method1701()) {
			if (local6.anInt1783 > 0) {
				local6.anInt1783--;
			}
			if (local6.anInt1783 != 0) {
				if (local6.anInt1787 > 0) {
					local6.anInt1787--;
				}
				if (local6.anInt1787 == 0 && local6.anInt1791 >= 1 && local6.anInt1785 >= 1 && local6.anInt1791 <= 102 && local6.anInt1785 <= 102 && (local6.anInt1789 < 0 || Static205.method3266(local6.anInt1789, local6.anInt1786))) {
					Static86.method1606(local6.anInt1779, local6.anInt1789, local6.anInt1786, local6.anInt1791, local6.anInt1780, local6.anInt1790, local6.anInt1785);
					local6.anInt1787 = -1;
					if (local6.anInt1781 == local6.anInt1789 && local6.anInt1781 == -1) {
						local6.method4779();
					} else if (local6.anInt1789 == local6.anInt1781 && local6.anInt1790 == local6.anInt1788 && local6.anInt1782 == local6.anInt1786) {
						local6.method4779();
					}
				}
			} else if (local6.anInt1781 < 0 || Static205.method3266(local6.anInt1781, local6.anInt1782)) {
				Static86.method1606(local6.anInt1779, local6.anInt1781, local6.anInt1782, local6.anInt1791, local6.anInt1780, local6.anInt1788, local6.anInt1785);
				local6.method4779();
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZLclient!nk;II)[Lclient!cf;")
	public static Class23[] method4767(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		return Static313.method2575(arg1, 0, arg0) ? Static285.method4386() : null;
	}
}
