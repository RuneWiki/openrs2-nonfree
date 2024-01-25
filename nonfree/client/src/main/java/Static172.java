import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "F")
	public static float aFloat367 = 0.25F;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7330(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 > '\u07ff') {
				local15 += 3;
			} else {
				local15 += 2;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)V")
	public static void method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 + Static515.anInt3214;
		@Pc(18) int local18 = arg0 + Static338.anInt6353;
		if (Static152.aClass37ArrayArrayArray1 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static460.anInt7894 || arg0 >= Static235.anInt4493) {
			return;
		}
		@Pc(42) long local42 = (long) (local10 | local18 << 14 | arg2 << 28);
		@Pc(48) Class5_Sub7 local48 = (Class5_Sub7) Static181.aClass42_11.method1109(local42);
		if (local48 == null) {
			Static507.method6978(arg2, arg1, arg0);
			return;
		}
		@Pc(62) Class5_Sub4 local62 = (Class5_Sub4) local48.aClass99_12.method2526();
		if (local62 == null) {
			Static507.method6978(arg2, arg1, arg0);
			return;
		}
		@Pc(76) Class15_Sub4_Sub1 local76 = (Class15_Sub4_Sub1) Static507.method6978(arg2, arg1, arg0);
		if (local76 == null) {
			local76 = new Class15_Sub4_Sub1();
		} else {
			local76.anInt3216 = local76.anInt3223 = -1;
		}
		local76.anInt3220 = local62.anInt469;
		local76.anInt3225 = local62.anInt468;
		label46: while (true) {
			@Pc(104) Class5_Sub4 local104 = (Class5_Sub4) local48.aClass99_12.method2519();
			if (local104 == null) {
				break;
			}
			if (local104.anInt469 != local76.anInt3220) {
				local76.anInt3218 = local104.anInt468;
				local76.anInt3216 = local104.anInt469;
				while (true) {
					@Pc(125) Class5_Sub4 local125 = (Class5_Sub4) local48.aClass99_12.method2519();
					if (local125 == null) {
						break label46;
					}
					if (local125.anInt469 != local76.anInt3220 && local76.anInt3216 != local125.anInt469) {
						local76.anInt3226 = local125.anInt468;
						local76.anInt3223 = local125.anInt469;
					}
				}
			}
		}
		@Pc(173) int local173 = Static191.method5464((arg1 << 7) + 64, (arg0 << 7) + 64, arg2);
		Static544.method2107(arg2, arg1, arg0, local173, local76);
	}
}
