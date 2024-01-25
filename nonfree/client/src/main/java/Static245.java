import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ida", name = "db", descriptor = "[Lclient!s;")
	public static Class18[] aClass18Array14;

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_52 = new Class341(32, 2);

	@OriginalMember(owner = "client!ida", name = "A", descriptor = "I")
	public static int anInt4807 = 2;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "([BIIIIII[BB)V")
	public static void method4356(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7) {
		@Pc(14) int local14 = -(arg3 >> 2);
		@Pc(19) int local19 = -(arg3 & 0x3);
		for (@Pc(22) int local22 = -arg2; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg1++;
				arg0[local30] = (byte) (arg0[local30] - arg7[arg5++]);
				@Pc(43) int local43 = arg1++;
				arg0[local43] = (byte) (arg0[local43] - arg7[arg5++]);
				@Pc(56) int local56 = arg1++;
				arg0[local56] = (byte) (arg0[local56] - arg7[arg5++]);
				@Pc(69) int local69 = arg1++;
				arg0[local69] = (byte) (arg0[local69] - arg7[arg5++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg1++;
				arg0[local30] = (byte) (arg0[local30] - arg7[arg5++]);
			}
			arg1 += arg4;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIBLclient!td;)V")
	public static void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub19 arg2) {
		if (!Static183.aBoolean305) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(31) int local31;
		for (@Pc(23) Class2_Sub1_Sub13 local23 = (Class2_Sub1_Sub13) arg2.aClass279_13.method7293(); local23 != null; local23 = (Class2_Sub1_Sub13) arg2.aClass279_13.method7298()) {
			local31 = Static600.method9005(local23);
			if (local15 < local31) {
				local15 = local31;
			}
		}
		local15 += 8;
		local31 = arg2.anInt9806 * 16 + 21;
		Static31.anInt534 = arg2.anInt9806 * 16 + (Static300.aBoolean723 ? 26 : 22);
		@Pc(67) int local67 = Static537.anInt9380 + Static22.anInt384;
		if (Static406.anInt7570 < local67 + local15) {
			local67 = Static537.anInt9380 - local15;
		}
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(94) int local94 = Static300.aBoolean723 ? 33 : 31;
		@Pc(101) int local101 = arg1 + 13 - local94;
		if (local101 + local31 > Static19.anInt352) {
			local101 = Static19.anInt352 - local31;
		}
		if (local101 < 0) {
			local101 = 0;
		}
		Static429.anInt7876 = local67;
		Static100.anInt1550 = local15;
		Static659.anInt11274 = local101;
		Static214.aClass2_Sub1_Sub19_1 = arg2;
	}
}
