import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	public static int anInt3666;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "Z")
	public static boolean aBoolean277;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "[I")
	public static final int[] anIntArray432 = new int[50];

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "[I")
	public static final int[] anIntArray433 = new int[50];

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
	public static int anInt3669 = 0;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "[I")
	public static final int[] anIntArray434 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method3611(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static242.method4247(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1 != arg0.charAt(local25); local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
	public static void method3612() {
		Static104.anImage1 = null;
		Static205.aFont3 = null;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
	public static void method3614() {
		if (Static163.aFloat69 < 1024.0F) {
			Static163.aFloat69 = 1024.0F;
		}
		while (Static117.aFloat58 >= 16384.0F) {
			Static117.aFloat58 -= 16384.0F;
		}
		if (Static163.aFloat69 > 3072.0F) {
			Static163.aFloat69 = 3072.0F;
		}
		while (Static117.aFloat58 < 0.0F) {
			Static117.aFloat58 += 16384.0F;
		}
		@Pc(41) int local41 = Static304.anInt5743 >> 7;
		@Pc(45) int local45 = Static219.anInt4043 >> 7;
		@Pc(51) int local51 = Static306.method5249(Static219.anInt4043, Static304.anInt5743, Static343.anInt6225);
		@Pc(53) int local53 = 0;
		@Pc(79) int local79;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (@Pc(73) int local73 = local41 - 4; local73 <= local41 + 4; local73++) {
				for (local79 = local45 - 4; local79 <= local45 + 4; local79++) {
					@Pc(83) int local83 = Static343.anInt6225;
					if (local83 < 3 && Static222.method3934(local73, local79)) {
						local83++;
					}
					@Pc(94) int local94 = 0;
					if (Static270.aByteArrayArrayArray12 != null && Static270.aByteArrayArrayArray12[local83] != null) {
						local94 = (Static270.aByteArrayArrayArray12[local83][local73][local79] & 0xFF) * 8;
					}
					@Pc(124) int local124 = local51 + local94 - Static203.aClass106Array3[local83].method5720(local73, local79);
					if (local53 < local124) {
						local53 = local124;
					}
				}
			}
		}
		local79 = local53 * 1536;
		if (local79 > 786432) {
			local79 = 786432;
		}
		if (local79 < 262144) {
			local79 = 262144;
		}
		if (Static86.anInt1602 < local79) {
			Static86.anInt1602 += (local79 - Static86.anInt1602) / 24;
		} else if (local79 < Static86.anInt1602) {
			Static86.anInt1602 += (local79 - Static86.anInt1602) / 80;
		}
	}
}
