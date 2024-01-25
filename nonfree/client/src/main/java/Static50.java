import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "S")
	public static short aShort30 = 1;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BII)Z")
	public static boolean method953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static318.method4821(arg1, arg0) | (arg1 & 0x40000) != 0 || Static370.method5584(arg0, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIILclient!bj;)V")
	public static void method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub5_Sub2 arg2) {
		if (!Static642.aBoolean757) {
			return;
		}
		@Pc(8) int local8 = 0;
		@Pc(19) int local19;
		for (@Pc(14) Class2_Sub5_Sub20 local14 = (Class2_Sub5_Sub20) arg2.aClass175_1.method4280(); local14 != null; local14 = (Class2_Sub5_Sub20) arg2.aClass175_1.method4288()) {
			local19 = Static474.method6804(local14);
			if (local19 > local8) {
				local8 = local19;
			}
		}
		local8 += 8;
		local19 = arg2.anInt964 * 16 + 21;
		Static67.anInt1403 = (Static507.aBoolean636 ? 26 : 22) + arg2.anInt964 * 16;
		@Pc(59) int local59 = Static254.anInt5025 + Static133.anInt3038;
		if (local59 + local8 > Static571.anInt9399) {
			local59 = Static254.anInt5025 - local8;
		}
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(92) int local92 = Static507.aBoolean636 ? 33 : 31;
		@Pc(99) int local99 = arg0 + 13 - local92;
		if (Static585.anInt9606 < local19 + local99) {
			local99 = Static585.anInt9606 - local19;
		}
		Static331.anInt5908 = local59;
		if (local99 < 0) {
			local99 = 0;
		}
		Static591.aClass2_Sub5_Sub2_1 = arg2;
		Static63.anInt1369 = local8;
		Static320.anInt5800 = local99;
	}
}
