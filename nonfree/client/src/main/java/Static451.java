import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!rca", name = "N", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_116 = new Class90(80, 12);

	@OriginalMember(owner = "client!rca", name = "U", descriptor = "[I")
	public static final int[] anIntArray499 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!rca", name = "V", descriptor = "I")
	public static int anInt8607 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BIII[BI)V")
	public static void method6631(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		arg1 += arg3;
		@Pc(34) int local34 = arg0 - arg3 >> 2;
		while (true) {
			local34--;
			if (local34 < 0) {
				local34 = arg0 - arg3 & 0x3;
				while (true) {
					local34--;
					if (local34 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(39) int local39 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg2[local39] = 1;
			@Pc(49) int local49 = local44 + 1;
			arg2[local44] = 1;
			arg1 = local49 + 1;
			arg2[local49] = 1;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIIILclient!ufa;Z)V")
	public static void method6632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class21_Sub1_Sub1_Sub1 arg3) {
		Static526.method7451(arg3.aByte127, arg3.anInt10550, arg3.anInt10551, arg1, arg2, arg0, 0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	public static void method6638() {
		Static33.aClass4_Sub36_1 = new Class4_Sub36(Static223.aClass152_8.method3624(Static142.anInt3088), "", Static117.anInt2703, 1001, -1, 0L, 0, 0, true, false);
	}
}
