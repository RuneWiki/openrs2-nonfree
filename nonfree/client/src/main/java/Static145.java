import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public static int anInt3035;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!tba;")
	public static final Class323 aClass323_12 = new Class323(8);

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	public static int anInt3032 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!rba;ILclient!mk;)V")
	public static void method2602(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub1 arg1, @OriginalArg(3) Class228 arg2) {
		if (Static110.anInt2383 >= 50 || (arg2 == null || arg2.anIntArrayArray73 == null || arg0 >= arg2.anIntArrayArray73.length || arg2.anIntArrayArray73[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg2.anIntArrayArray73[arg0][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(69) int local69;
		if (arg2.anIntArrayArray73[arg0].length > 1) {
			local69 = (int) (Math.random() * (double) arg2.anIntArrayArray73[arg0].length);
			if (local69 > 0) {
				local40 = arg2.anIntArrayArray73[arg0][local69];
			}
		}
		local69 = 256;
		if (arg2.anIntArray402 != null && arg2.anIntArray405 != null) {
			local69 = arg2.anIntArray402[arg0] + (int) (Math.random() * (double) (arg2.anIntArray405[arg0] - arg2.anIntArray402[arg0]));
		}
		@Pc(119) int local119 = arg2.anIntArray407 == null ? 255 : arg2.anIntArray407[arg0];
		if (local50 == 0) {
			if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == arg1) {
				if (arg2.aBoolean452) {
					Static297.method4695(local40, local69, false, local46, 0, local119);
					return;
				}
				Static565.method7889(local46, local119, local40, 0, local69);
			}
		} else if (Static305.aClass2_Sub49_15.aClass33_Sub9_1.method3103() != 0) {
			@Pc(160) int local160 = arg1.anInt8037 - 256 >> 9;
			@Pc(167) int local167 = arg1.anInt8034 - 256 >> 9;
			@Pc(188) int local188 = arg1 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 ? 0 : local50 + (arg1.aByte109 << 24) + (local160 << 16) + (local167 << 8);
			Static301.aClass301Array1[Static110.anInt2383++] = new Class301((byte) (arg2.aBoolean452 ? 2 : 1), local40, local46, 0, local119, local188, local69, arg1);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIILclient!ha;IIIILclient!vda;II)V")
	public static void method2604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub7_Sub20 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg7 < arg5 && arg5 < arg7 + arg10 && arg0 > arg1 - 13 && arg0 < arg1 + 3) {
			arg9 = arg2;
		}
		@Pc(35) String local35 = Static36.method872(arg8);
		Static544.aClass37_8.method6074(arg1, arg7 + 3, arg9, Static629.anIntArray726, local35, Static402.aClass31Array11);
	}
}
