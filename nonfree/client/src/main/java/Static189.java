import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "[I")
	public static final int[] anIntArray243 = new int[3];

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!nca;)I")
	public static int method2693(@OriginalArg(1) Class254 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method6072(Static102.anInt1792)) {
			local5++;
		}
		if (arg0.method6072(Static73.anInt1305)) {
			local5++;
		}
		if (arg0.method6072(Static723.anInt11034)) {
			local5++;
		}
		if (arg0.method6072(Static293.anInt4538)) {
			local5++;
		}
		if (arg0.method6072(Static476.anInt7646)) {
			local5++;
		}
		if (arg0.method6072(Static104.anInt1808)) {
			local5++;
		}
		if (arg0.method6072(Static477.anInt7667)) {
			local5++;
		}
		if (arg0.method6072(Static361.anInt5761)) {
			local5++;
		}
		if (arg0.method6072(Static110.anInt1833)) {
			local5++;
		}
		if (arg0.method6072(Static488.anInt7863)) {
			local5++;
		}
		if (arg0.method6072(Static694.anInt10675)) {
			local5++;
		}
		if (arg0.method6072(Static530.anInt8404)) {
			local5++;
		}
		if (arg0.method6072(Static629.anInt9655)) {
			local5++;
		}
		if (arg0.method6072(Static234.anInt3711)) {
			local5++;
		}
		if (arg0.method6072(Static632.anInt9758)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method2694(@OriginalArg(2) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg0.length();
		for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
			@Pc(54) char local54 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local54 == '-') {
					local37 = true;
					continue;
				}
				if (local54 == '+' && true) {
					continue;
				}
			}
			@Pc(95) int local95;
			if (local54 >= '0' && local54 <= '9') {
				local95 = local54 - '0';
			} else if (local54 >= 'A' && local54 <= 'Z') {
				local95 = local54 - '7';
			} else if (local54 >= 'a' && local54 <= 'z') {
				local95 = local54 - 'W';
			} else {
				return false;
			}
			if (local95 >= 10) {
				return false;
			}
			if (local37) {
				local95 = -local95;
			}
			@Pc(149) int local149 = local41 * 10 + local95;
			if (local41 != local149 / 10) {
				return false;
			}
			local39 = true;
			local41 = local149;
		}
		return local39;
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
	public static void method2695() {
		Static159.method2363();
		Static581.method8084(Static650.aClass2_Sub30_29.aClass11_Sub11_1.method2678() == 1);
		Static479.aClass70_2 = Static462.method6678(0, Static316.aCanvas1, 22050, Static135.aClass389_2);
		Static641.method8681(Static667.method9088((Class2_Sub23_Sub5) null));
		Static600.aClass70_3 = Static462.method6678(1, Static316.aCanvas1, 2048, Static135.aClass389_2);
		Static600.aClass70_3.method9365(Static130.aClass2_Sub23_Sub3_1);
	}
}
