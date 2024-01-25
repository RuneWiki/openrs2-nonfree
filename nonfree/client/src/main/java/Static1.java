import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[Lclient!ei;")
	public static Class89_Sub1[] aClass89_Sub1Array6 = new Class89_Sub1[0];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Z")
	public static boolean method7734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static627.aBoolean736) {
			return false;
		}
		@Pc(19) int local19 = arg1 >> 16;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		if (Static559.aClass261ArrayArray2[local19] == null || Static559.aClass261ArrayArray2[local19][local23] == null) {
			return false;
		}
		@Pc(41) Class261 local41 = Static559.aClass261ArrayArray2[local19][local23];
		@Pc(53) Class2_Sub2_Sub11 local53;
		if (arg0 == -1 && local41.anInt6635 == 0) {
			for (local53 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local53 != null; local53 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
				if (local53.anInt4369 == 9 || local53.anInt4369 == 1002 || local53.anInt4369 == 5 || local53.anInt4369 == 10 || local53.anInt4369 == 15) {
					for (@Pc(147) Class261 local147 = Static357.method4826(local53.anInt4367); local147 != null; local147 = Static83.method1185(local147)) {
						if (local41.anInt6614 == local147.anInt6614) {
							return true;
						}
					}
				}
			}
		} else {
			for (local53 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local53 != null; local53 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
				if (arg0 == local53.anInt4366 && local41.anInt6614 == local53.anInt4367 && (local53.anInt4369 == 9 || local53.anInt4369 == 1002 || local53.anInt4369 == 5 || local53.anInt4369 == 10 || local53.anInt4369 == 15)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[Lclient!ln;")
	public static Class210[] method7735() {
		if (Static308.aClass210Array1 == null) {
			@Pc(17) Class210[] local17 = Static3.method8594(Static452.aClass226_6);
			@Pc(21) Class210[] local21 = new Class210[local17.length];
			@Pc(23) int local23 = 0;
			@Pc(28) int local28 = Static234.aClass2_Sub5_48.aClass6_Sub5_1.method2473();
			@Pc(92) int local92;
			@Pc(98) Class210 local98;
			label70: for (@Pc(30) int local30 = 0; local30 < local17.length; local30++) {
				@Pc(36) Class210 local36 = local17[local30];
				if ((local36.anInt5211 <= 0 || local36.anInt5211 >= 24) && local36.anInt5212 >= 800 && local36.anInt5208 >= 600 && (local28 != 2 || local36.anInt5212 <= 800 && local36.anInt5208 <= 600) && (local28 != 1 || local36.anInt5212 <= 1024 && local36.anInt5208 <= 768)) {
					for (local92 = 0; local92 < local23; local92++) {
						local98 = local21[local92];
						if (local98.anInt5212 == local36.anInt5212 && local36.anInt5208 == local98.anInt5208) {
							if (local98.anInt5211 < local36.anInt5211) {
								local21[local92] = local36;
							}
							continue label70;
						}
					}
					local21[local23] = local36;
					local23++;
				}
			}
			Static308.aClass210Array1 = new Class210[local23];
			Static653.method5395(local21, 0, Static308.aClass210Array1, 0, local23);
			@Pc(150) int[] local150 = new int[Static308.aClass210Array1.length];
			for (local92 = 0; local92 < Static308.aClass210Array1.length; local92++) {
				local98 = Static308.aClass210Array1[local92];
				local150[local92] = local98.anInt5212 * local98.anInt5208;
			}
			Static352.method4710(local150, Static308.aClass210Array1);
		}
		return Static308.aClass210Array1;
	}
}
