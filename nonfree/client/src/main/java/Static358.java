import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Lclient!oh;")
	public static Class150 aClass150_5;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "I")
	public static int anInt6006 = 0;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_89 = new Class244(25, 7);

	@OriginalMember(owner = "client!us", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public static void method5344() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Static8.aBooleanArray148[local12] = false;
		}
		Static56.anInt1130 = Static327.anInt5556;
		Static53.anInt1102 = Static206.anInt3639;
		Static290.anInt5040 = Static76.anInt1617;
		Static348.anInt4437 = Static243.anInt4289;
		Static43.anInt775 = Static339.anInt5726;
		Static81.anInt1661 = 0;
		Static200.anInt3586 = 0;
		Static302.anInt5239 = -1;
		Static254.anInt1042 = -1;
		Static303.anInt5261 = Static145.anInt2716;
		Static88.anInt1815 = 5;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIBZIIF)[[I")
	public static int[][] method5345(@OriginalArg(8) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class3_Sub1_Sub1 local18 = new Class3_Sub1_Sub1();
		local18.anInt59 = (int) (arg0 * 4096.0F);
		local18.anInt54 = 8;
		local18.anInt69 = 4;
		local18.anInt56 = 3;
		local18.aBoolean6 = false;
		local18.method5552();
		Static223.method3716(64, 256);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local18.method58(local47, local14[local47]);
		}
		return local14;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!bj;B)V")
	public static void method5346(@OriginalArg(0) Class28_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class28_Sub1_Sub1_Sub1) {
			@Pc(5) Class28_Sub1_Sub1_Sub1 local5 = (Class28_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass61_1 != null) {
				Static308.method4745(Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 != local5.aByte73, local5);
			}
		} else if (arg0 instanceof Class28_Sub1_Sub1_Sub2) {
			@Pc(31) Class28_Sub1_Sub1_Sub2 local31 = (Class28_Sub1_Sub1_Sub2) arg0;
			Static59.method1065(local31.aByte73 != Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, local31);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
	public static void method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass28_Sub4_2 != null) {
			local7.aClass28_Sub4_2 = null;
		}
		if (local7.aClass28_Sub4_1 != null) {
			local7.aClass28_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
	public static void method5349() {
		Static278.aClass155_6.method4899(((float) Static164.aClass154_Sub1_1.anInt6069 * 0.1F + 0.7F) * Static71.aFloat10);
		Static278.aClass155_6.method4881(Static56.anInt1131, Static117.aFloat15, Static375.aFloat76, (float) Static22.anInt293, (float) Static380.anInt6377, (float) Static176.anInt3533);
		Static278.aClass155_6.method4907(Static53.aClass8_1);
	}
}
