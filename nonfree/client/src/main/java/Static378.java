import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_9;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "[I")
	public static int[] anIntArray380;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public static int anInt6757 = 1;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "Lclient!kka;")
	public static final Class198 aClass198_2 = new Class198();

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_57 = new Class305(5, 4);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Z")
	public static boolean method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	public static void method5639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = arg2;
		@Pc(18) int local18 = -arg2;
		@Pc(20) int local20 = -1;
		@Pc(28) int local28 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 + arg1);
		@Pc(37) int local37 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg1 - arg2);
		Static197.method3240(local28, Static16.anIntArrayArray2[arg3], local37, arg0);
		while (local13 < local15) {
			local20 += 2;
			local18 += local20;
			@Pc(65) int local65;
			@Pc(70) int local70;
			@Pc(89) int local89;
			@Pc(97) int local97;
			if (local18 > 0) {
				local15--;
				local18 -= local15 << 1;
				local65 = arg3 - local15;
				local70 = arg3 + local15;
				if (Static639.anInt10384 <= local70 && Static496.anInt8305 >= local65) {
					local89 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg1 + local13);
					local97 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg1 - local13);
					if (local70 <= Static496.anInt8305) {
						Static197.method3240(local89, Static16.anIntArrayArray2[local70], local97, arg0);
					}
					if (Static639.anInt10384 <= local65) {
						Static197.method3240(local89, Static16.anIntArrayArray2[local65], local97, arg0);
					}
				}
			}
			local13++;
			local65 = arg3 - local13;
			local70 = arg3 + local13;
			if (Static639.anInt10384 <= local70 && Static496.anInt8305 >= local65) {
				local89 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg1 + local15);
				local97 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg1 - local15);
				if (Static496.anInt8305 >= local70) {
					Static197.method3240(local89, Static16.anIntArrayArray2[local70], local97, arg0);
				}
				if (Static639.anInt10384 <= local65) {
					Static197.method3240(local89, Static16.anIntArrayArray2[local65], local97, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)Lclient!si;")
	public static Class28_Sub1_Sub5 method5641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub1_Sub5_1;
	}
}
