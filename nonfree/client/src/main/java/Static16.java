import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	public static int anInt207 = 999999;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_10 = new Class134("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIZI)V")
	public static void method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static215.anInt3549 = arg1;
		Static240.anInt3886 = arg5;
		Static247.anInt3992 = arg2;
		Static434.anInt7014 = arg0;
		Static77.anInt1469 = arg3;
		if (arg4 && Static215.anInt3549 >= 100) {
			Static143.anInt2544 = Static434.anInt7014 * 128 + 64;
			Static174.anInt3028 = Static247.anInt3992 * 128 + 64;
			Static40.anInt771 = Static302.method3973(Static143.anInt2544, Static174.anInt3028, Static61.anInt1129) - Static77.anInt1469;
		}
		Static414.anInt6776 = 2;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method200(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg3 && arg6 == arg2 && arg5 == arg8 && arg7 == arg4) {
			Static158.method2005(arg5, arg2, arg0, arg4, arg1);
			return;
		}
		@Pc(19) int local19 = arg1;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg1 * 3;
		@Pc(29) int local29 = arg2 * 3;
		@Pc(33) int local33 = arg3 * 3;
		@Pc(37) int local37 = arg6 * 3;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(55) int local55 = arg5 + local33 - local41 - arg1;
		@Pc(64) int local64 = local37 + arg4 - local45 - arg2;
		@Pc(75) int local75 = local41 + local25 - local33 - local33;
		@Pc(85) int local85 = local45 + local29 - local37 - local37;
		@Pc(90) int local90 = local33 - local25;
		@Pc(95) int local95 = local37 - local29;
		for (@Pc(97) int local97 = 128; local97 <= 4096; local97 += 128) {
			@Pc(105) int local105 = local97 * local97 >> 12;
			@Pc(111) int local111 = local105 * local97 >> 12;
			@Pc(115) int local115 = local111 * local55;
			@Pc(119) int local119 = local111 * local64;
			@Pc(123) int local123 = local75 * local105;
			@Pc(127) int local127 = local85 * local105;
			@Pc(131) int local131 = local97 * local90;
			@Pc(135) int local135 = local97 * local95;
			@Pc(146) int local146 = arg1 + (local115 + local123 + local131 >> 12);
			@Pc(157) int local157 = (local135 + local119 + local127 >> 12) + arg2;
			Static158.method2005(local146, local21, arg0, local157, local19);
			local19 = local146;
			local21 = local157;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBIZZ)V")
	public static void method202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static51.method704(Static85.aClass65_Sub1Array3.length - 1, arg3, arg1, arg0, 0, arg2);
		Static215.aClass2_Sub11_2 = null;
		Static180.anInt3089 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
	public static int method203() {
		return 6;
	}
}
