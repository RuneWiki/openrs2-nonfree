import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public static int anInt2463;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public static int anInt2464;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public static int anInt2467;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Lclient!ke;")
	public static Class52 aClass52_28;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "[I")
	public static final int[] anIntArray146 = new int[128];

	@OriginalMember(owner = "client!li", name = "m", descriptor = "[I")
	public static final int[] anIntArray147 = new int[5];

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	public static int anInt2470 = 0;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(BI)I")
	public static int method1752(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BJII)Z")
	public static boolean method1754(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = (int) arg0 >> 14 & 0x1F;
		@Pc(19) int local19 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		@Pc(26) int local26 = (int) arg0 >> 20 & 0x3;
		if (local8 == 10 || local8 == 11 || local8 == 22) {
			@Pc(39) Class3_Sub3_Sub9 local39 = Static161.method2421(local19);
			@Pc(42) int local42 = local39.anInt1017;
			@Pc(58) int local58;
			@Pc(55) int local55;
			if (local26 == 0 || local26 == 2) {
				local55 = local39.anInt1002;
				local58 = local39.anInt1010;
			} else {
				local55 = local39.anInt1010;
				local58 = local39.anInt1002;
			}
			if (local26 != 0) {
				local42 = (local42 << local26 & 0xF) + (local42 >> 4 - local26);
			}
			Static103.method1467(true, local55, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, local58, 0, arg2, arg1, 2, local42, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
		} else {
			Static103.method1467(true, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], local26, 0, local8 + 1, arg2, arg1, 2, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
		}
		Static27.anInt572 = Static124.anInt3874;
		Static31.anInt714 = Static96.anInt2006;
		Static108.anInt2201 = 2;
		Static191.anInt3883 = 0;
		return true;
	}
}
