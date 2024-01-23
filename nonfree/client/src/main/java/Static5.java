import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public static int anInt97;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[S")
	public static short[] aShortArray11 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString8 = "Close";

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public static int anInt91 = 0;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public static void method89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class114 local17 = Static139.aClass114ArrayArrayArray1[Static281.anInt5335][arg0][arg1];
		if (local17 == null) {
			Static241.method3771(Static281.anInt5335, arg0, arg1);
			return;
		}
		@Pc(28) int local28 = -99999999;
		@Pc(33) Class4_Sub3_Sub21 local33 = (Class4_Sub3_Sub21) local17.method2623();
		@Pc(35) Class4_Sub3_Sub21 local35 = null;
		while (local33 != null) {
			@Pc(44) Class165 local44 = Static287.method4398(local33.aClass53_Sub2_1.anInt2168);
			@Pc(47) int local47 = local44.anInt5103;
			if (local44.anInt5076 == 1) {
				local47 *= local33.aClass53_Sub2_1.anInt2166 + 1;
			}
			if (local47 > local28) {
				local28 = local47;
				local35 = local33;
			}
			local33 = (Class4_Sub3_Sub21) local17.method2629();
		}
		if (local35 == null) {
			Static241.method3771(Static281.anInt5335, arg0, arg1);
			return;
		}
		local17.method2620(local35);
		local33 = (Class4_Sub3_Sub21) local17.method2623();
		@Pc(102) Class53_Sub2 local102 = null;
		@Pc(104) Class53_Sub2 local104 = null;
		while (local33 != null) {
			@Pc(110) Class53_Sub2 local110 = local33.aClass53_Sub2_1;
			if (local35.aClass53_Sub2_1.anInt2168 != local110.anInt2168) {
				if (local104 == null) {
					local104 = local110;
				}
				if (local104.anInt2168 != local110.anInt2168 && local102 == null) {
					local102 = local110;
				}
			}
			local33 = (Class4_Sub3_Sub21) local17.method2629();
		}
		@Pc(155) long local155 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static216.method3515(Static281.anInt5335, arg0, arg1, Static33.method522(arg1 * 128 + 64, arg0 * 128 + 64, Static281.anInt5335), local35.aClass53_Sub2_1, local155, local104, local102);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public static void method90(@OriginalArg(0) int arg0) {
		Static311.anInt6035 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static300.anInt5636; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static299.anInt5591; local8++) {
				if (Static6.aClass4_Sub19ArrayArrayArray1[arg0][local3][local8] == null) {
					Static6.aClass4_Sub19ArrayArrayArray1[arg0][local3][local8] = new Class4_Sub19(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public static void method91() {
		Static202.aClass26_42.method515();
		Static240.aClass26_46.method515();
	}
}
