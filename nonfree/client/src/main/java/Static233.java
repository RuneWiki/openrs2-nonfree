import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Lclient!ph;")
	public static Class138 aClass138_61;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public static int anInt4690;

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "Lclient!ph;")
	public static Class138 aClass138_62;

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
	public static int anInt4699;

	@OriginalMember(owner = "client!qo", name = "H", descriptor = "Lclient!ph;")
	public static Class138 aClass138_63;

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "Lclient!kc;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_3;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!c;")
	public static Class1_Sub5 aClass1_Sub5_1 = new Class1_Sub5(0, 0);

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	public static int anInt4689 = 0;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "[I")
	public static int[] anIntArray429 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
	public static int anInt4697 = 0;

	@OriginalMember(owner = "client!qo", name = "M", descriptor = "I")
	public static int anInt4707 = 2;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method3676(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static282.method4193(local21) : local21;
		} else if (arg0 instanceof Class11) {
			@Pc(36) Class11 local36 = (Class11) arg0;
			return local36.method125();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	public static void method3680() {
		for (@Pc(7) int local7 = 0; local7 < Static189.anInt3778; local7++) {
			@Pc(14) Class41 local14 = Static93.method1378(local7);
			if (local14 != null && local14.anInt1016 == 0) {
				Static264.anIntArray457[local7] = 0;
				Static46.anIntArray78[local7] = 0;
			}
		}
		Static276.aClass156_15 = new Class156(16);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIIIIII)V")
	public static void method3681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static189.method3079(arg2);
		@Pc(6) int local6 = 0;
		@Pc(13) int local13 = -arg2;
		@Pc(18) int local18 = arg2 - arg1;
		@Pc(20) int local20 = arg2;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(34) int local34 = local18;
		@Pc(37) int local37 = -local18;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(90) int local90;
		if (Static240.anInt1319 <= arg3 && Static59.anInt1155 >= arg3) {
			@Pc(56) int[] local56 = Static51.anIntArrayArray1[arg3];
			local65 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 - arg2);
			local73 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg2 + arg0);
			local82 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 - local18);
			local90 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, local18 + arg0);
			Static109.method1795(local65, local56, local82, arg5);
			Static109.method1795(local82, local56, local90, arg4);
			Static109.method1795(local90, local56, local73, arg5);
		}
		while (local20 > local6) {
			local39 += 2;
			local41 += 2;
			local13 += local41;
			local37 += local39;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				Static177.anIntArray183[local34] = local6;
				local37 -= local34 << 1;
			}
			local6++;
			@Pc(211) int local211;
			@Pc(219) int local219;
			@Pc(231) int[] local231;
			@Pc(163) int local163;
			if (local13 >= 0) {
				local20--;
				local13 -= local20 << 1;
				local65 = arg3 + local20;
				local163 = arg3 - local20;
				if (local65 >= Static240.anInt1319 && local163 <= Static59.anInt1155) {
					if (local20 < local18) {
						local73 = Static177.anIntArray183[local20];
						local82 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, local6 + arg0);
						local90 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 - local6);
						local211 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 + local73);
						local219 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 - local73);
						if (local65 <= Static59.anInt1155) {
							local231 = Static51.anIntArrayArray1[local65];
							Static109.method1795(local90, local231, local219, arg5);
							Static109.method1795(local219, local231, local211, arg4);
							Static109.method1795(local211, local231, local82, arg5);
						}
						if (Static240.anInt1319 <= local163) {
							local231 = Static51.anIntArrayArray1[local163];
							Static109.method1795(local90, local231, local219, arg5);
							Static109.method1795(local219, local231, local211, arg4);
							Static109.method1795(local211, local231, local82, arg5);
						}
					} else {
						local73 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 + local6);
						local82 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 - local6);
						if (Static59.anInt1155 >= local65) {
							Static109.method1795(local82, Static51.anIntArrayArray1[local65], local73, arg5);
						}
						if (local163 >= Static240.anInt1319) {
							Static109.method1795(local82, Static51.anIntArrayArray1[local163], local73, arg5);
						}
					}
				}
			}
			local163 = arg3 - local6;
			local65 = arg3 + local6;
			if (Static240.anInt1319 <= local65 && Static59.anInt1155 >= local163) {
				local73 = arg0 + local20;
				local82 = arg0 - local20;
				if (Static312.anInt5850 <= local73 && local82 <= Static214.anInt4216) {
					local73 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, local73);
					local82 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, local82);
					if (local6 < local18) {
						local90 = local34 >= local6 ? local34 : Static177.anIntArray183[local6];
						local211 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 + local90);
						local219 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 - local90);
						if (local65 <= Static59.anInt1155) {
							local231 = Static51.anIntArrayArray1[local65];
							Static109.method1795(local82, local231, local219, arg5);
							Static109.method1795(local219, local231, local211, arg4);
							Static109.method1795(local211, local231, local73, arg5);
						}
						if (local163 >= Static240.anInt1319) {
							local231 = Static51.anIntArrayArray1[local163];
							Static109.method1795(local82, local231, local219, arg5);
							Static109.method1795(local219, local231, local211, arg4);
							Static109.method1795(local211, local231, local73, arg5);
						}
					} else {
						if (local65 <= Static59.anInt1155) {
							Static109.method1795(local82, Static51.anIntArrayArray1[local65], local73, arg5);
						}
						if (local163 >= Static240.anInt1319) {
							Static109.method1795(local82, Static51.anIntArrayArray1[local163], local73, arg5);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
	public static void method3682() {
		if (Static17.aBoolean17) {
			return;
		}
		if (Static51.aBoolean77) {
			Static15.aFloat2 = (int) Static15.aFloat2 + 47 & 0xFFFFFFF0;
		} else {
			Static60.aFloat10 += (12.0F - Static60.aFloat10) / 2.0F;
		}
		Static104.aBoolean149 = true;
		Static17.aBoolean17 = true;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
	public static void method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static232.aClass169_102 = new Class169(arg0);
		Static134.aClass169_75 = new Class169(arg1);
	}
}
