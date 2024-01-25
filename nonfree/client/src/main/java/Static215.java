import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public static int anInt4291;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[I")
	public static final int[] anIntArray385 = new int[14];

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
	public static final int[] anIntArray386 = new int[100];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public static void method3860() {
		Static262.aClass46_7.method5121(Static123.aFloat136 * ((float) Static85.anInt2078 * 0.1F + 0.7F));
		Static262.aClass46_7.method5180(Static236.anInt174, Static348.aFloat101, aFloat84, (float) Static351.anInt6642, (float) Static307.anInt2890, (float) Static272.anInt5177);
		Static262.aClass46_7.method5170(Static181.aClass67_2);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method3861() {
		if (Static290.aBoolean370) {
			Static110.aClass2_12 = null;
			Static290.aBoolean370 = false;
			Static209.aClass2_17 = null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	public static void method3862() {
		Static76.aClass11_40.method213();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIILclient!ne;)V")
	public static void method3863(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class146 arg2) {
		if (Static94.aClass146_21 != null || Static302.aBoolean409 || (arg2 == null || Static56.method1294(arg2) == null)) {
			return;
		}
		Static94.aClass146_21 = arg2;
		Static30.aClass146_8 = Static56.method1294(arg2);
		Static282.anInt5380 = arg1;
		Static200.anInt4041 = arg0;
		Static130.anInt2810 = 0;
		Static293.aBoolean371 = false;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
	public static void method3865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static241.aFloat107 > Static241.aFloat108) {
			Static241.aFloat108 = (float) ((double) Static241.aFloat108 + (double) Static241.aFloat108 / 30.0D);
			if (Static241.aFloat108 > Static241.aFloat107) {
				Static241.aFloat108 = Static241.aFloat107;
			}
			Static22.method502();
			Static241.anInt5675 = (int) Static241.aFloat108 >> 1;
			Static241.aByteArrayArrayArray13 = Static312.method5391(Static241.anInt5675);
		} else if (Static241.aFloat107 < Static241.aFloat108) {
			Static241.aFloat108 = (float) ((double) Static241.aFloat108 - (double) Static241.aFloat108 / 30.0D);
			if (Static241.aFloat108 < Static241.aFloat107) {
				Static241.aFloat108 = Static241.aFloat107;
			}
			Static22.method502();
			Static241.anInt5675 = (int) Static241.aFloat108 >> 1;
			Static241.aByteArrayArrayArray13 = Static312.method5391(Static241.anInt5675);
		}
		if (Static195.anInt3964 != -1 && Static273.anInt5198 != -1) {
			@Pc(80) int local80 = Static195.anInt3964 - Static297.anInt5698;
			if (local80 < 2 || local80 > 2) {
				local80 /= 8;
			}
			@Pc(97) int local97 = Static273.anInt5198 - Static41.anInt983;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static297.anInt5698 += local80;
			if (local80 == 0 && local97 == 0) {
				Static273.anInt5198 = -1;
				Static195.anInt3964 = -1;
			}
			Static41.anInt983 += local97;
			Static22.method502();
		}
		if (Static28.anInt659 > 0) {
			Static331.anInt6398--;
			if (Static331.anInt6398 == 0) {
				Static28.anInt659--;
				Static331.anInt6398 = 100;
			}
		} else {
			Static118.anInt2594 = -1;
			Static17.anInt347 = -1;
		}
		if (!Static151.aBoolean210 || Static326.aClass18_44 == null) {
			return;
		}
		for (@Pc(161) Class14_Sub36 local161 = (Class14_Sub36) Static326.aClass18_44.method459(); local161 != null; local161 = (Class14_Sub36) Static326.aClass18_44.method453()) {
			@Pc(171) Class52 local171 = Static247.method4306(local161.aClass14_Sub5_1.anInt725);
			if (Static86.anInt2091 == 0 && local161.method5658(arg1, arg0)) {
				if (local171.aStringArray25 != null) {
					if (local171.aStringArray25[4] != null) {
						Static223.method5291((long) local161.aClass14_Sub5_1.anInt725, local171.aStringArray25[4], local171.anInt1756, -1, 1006, 0, local171.aString64);
					}
					if (local171.aStringArray25[3] != null) {
						Static223.method5291((long) local161.aClass14_Sub5_1.anInt725, local171.aStringArray25[3], local171.anInt1756, -1, 1009, 0, local171.aString64);
					}
					if (local171.aStringArray25[2] != null) {
						Static223.method5291((long) local161.aClass14_Sub5_1.anInt725, local171.aStringArray25[2], local171.anInt1756, -1, 1007, 0, local171.aString64);
					}
					if (local171.aStringArray25[1] != null) {
						Static223.method5291((long) local161.aClass14_Sub5_1.anInt725, local171.aStringArray25[1], local171.anInt1756, -1, 1005, 0, local171.aString64);
					}
					if (local171.aStringArray25[0] != null) {
						Static223.method5291((long) local161.aClass14_Sub5_1.anInt725, local171.aStringArray25[0], local171.anInt1756, -1, 1010, 0, local171.aString64);
					}
				}
				if (!local161.aClass14_Sub5_1.aBoolean38) {
					local161.aClass14_Sub5_1.aBoolean38 = true;
					Static10.method226(15, local161.aClass14_Sub5_1.anInt725, local171.anInt1756);
				}
				if (local161.aClass14_Sub5_1.aBoolean38) {
					Static10.method226(17, local161.aClass14_Sub5_1.anInt725, local171.anInt1756);
				}
			} else if (local161.aClass14_Sub5_1.aBoolean38) {
				local161.aClass14_Sub5_1.aBoolean38 = false;
				Static10.method226(16, local161.aClass14_Sub5_1.anInt725, local171.anInt1756);
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
	public static boolean method3866(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!cf;)V")
	public static void method3867(@OriginalArg(1) Class14_Sub6 arg0) {
		if (Static98.aClass213ArrayArrayArray2 == null) {
			return;
		}
		@Pc(12) Interface7 local12 = null;
		if (arg0.anInt869 == 0) {
			local12 = (Interface7) Static242.method4277(arg0.anInt865, arg0.anInt867, arg0.anInt874);
		}
		if (arg0.anInt869 == 1) {
			local12 = (Interface7) Static216.method3896(arg0.anInt865, arg0.anInt867, arg0.anInt874);
		}
		if (arg0.anInt869 == 2) {
			local12 = (Interface7) Static263.method4514(arg0.anInt865, arg0.anInt867, arg0.anInt874, up.class);
		}
		if (arg0.anInt869 == 3) {
			local12 = (Interface7) Static274.method4660(arg0.anInt865, arg0.anInt867, arg0.anInt874);
		}
		if (local12 == null) {
			arg0.anInt871 = 0;
			arg0.anInt876 = -1;
			arg0.anInt866 = 0;
		} else {
			arg0.anInt876 = local12.method4070();
			arg0.anInt871 = local12.method4066();
			arg0.anInt866 = local12.method4067();
		}
	}
}
