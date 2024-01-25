import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "[[Lclient!kq;")
	public static Class199[][] aClass199ArrayArray2;

	@OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
	public static int anInt5769;

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "[I")
	public static final int[] anIntArray436 = new int[2];

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIII)I")
	public static int method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class4_Sub2_Sub26.anIntArray562[arg1 * 8192 / arg0] >> 1;
		return (arg3 * (65536 - local16) >> 16) + (local16 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!fg;I)V")
	public static void method5065(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1) {
		if (Static490.aBoolean796) {
			arg0 = 0;
			Static490.aBoolean796 = false;
		}
		if (Static544.aClass113_2 != null && Static544.aClass113_2.method2705(arg1)) {
			return;
		}
		Static544.aClass113_2 = arg1;
		Static177.aLong99 = Static429.method5935();
		Static642.anInt10087 = arg0;
		Static627.anInt9834 = arg0;
		if (Static627.anInt9834 != 0) {
			Static185.anInt3160 = Static177.anInt3089;
			Static521.aFloat194 = Static669.aFloat238;
			Static322.aClass68_3 = Static412.aClass68_4;
			Static358.aFloat119 = Static490.aFloat236;
			Static453.aFloat183 = Static429.aFloat159;
			Static467.anInt8242 = Static149.anInt2725;
			Static137.aFloat56 = Static615.aFloat209;
			Static547.aFloat199 = Static437.aFloat231;
			Static313.anInt4886 = Static401.anInt5840;
			Static387.aFloat123 = Static590.aFloat206;
			return;
		}
		Static197.method4784();
	}
}
