import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dn", name = "eb", descriptor = "Lclient!eg;")
	public static Class86 aClass86_1;

	@OriginalMember(owner = "client!dn", name = "M", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_70 = new Class288(88, 6);

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
	public static int method1594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static459.aShortArrayArray25 == null ? 0 : Static459.aShortArrayArray25[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZ)V")
	public static void method1596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class2_Sub2_Sub4 local13 = Static566.method7763(arg2, 11);
		local13.method662();
		local13.anInt817 = arg1;
		local13.anInt823 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BII)V")
	public static void method1597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub2_Sub4 local18 = Static566.method7763(arg1, 6);
		local18.method662();
		local18.anInt823 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[Lclient!cw;)V")
	public static void method1599(@OriginalArg(1) Class61[] arg0) {
		Static274.anInt4386 = arg0.length;
		Static140.aClass61Array4 = new Class61[Static274.anInt4386 + 10];
		Static610.anIntArray675 = new int[Static274.anInt4386 + 10];
		Static653.method5395(arg0, 0, Static140.aClass61Array4, 0, Static274.anInt4386);
		for (@Pc(34) int local34 = 0; local34 < Static274.anInt4386; local34++) {
			Static610.anIntArray675[local34] = Static140.aClass61Array4[local34].method6438();
		}
		for (@Pc(53) int local53 = Static274.anInt4386; local53 < Static140.aClass61Array4.length; local53++) {
			Static610.anIntArray675[local53] = 12;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method1600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4) {
		arg4.KA(arg3, arg1, arg3 + arg2, arg0 + arg1);
		arg4.method6936(arg0, arg2, arg3, -16777216, arg1);
		if (Static619.anInt9953 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static193.anInt1550 / (float) Static193.anInt1544;
		@Pc(37) int local37 = arg2;
		@Pc(39) int local39 = arg0;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg2 * local35);
		} else {
			local37 = (int) ((float) arg0 / local35);
		}
		@Pc(66) int local66 = arg3 + (arg2 - local37) / 2;
		@Pc(74) int local74 = arg1 + (arg0 - local39) / 2;
		if (Static527.aClass61_28 == null || Static527.aClass61_28.method6445() != arg2 || Static527.aClass61_28.method6447() != arg0) {
			Static193.method1284(Static193.anInt1548, Static193.anInt1551 + Static193.anInt1550, Static193.anInt1544 + Static193.anInt1548, Static193.anInt1551, local66, local74, local37 + local66, local74 + local39);
			Static193.method1300(arg4);
			Static527.aClass61_28 = arg4.method6972(local66, local74, local37, local39, false);
		}
		Static527.aClass61_28.method6431(local66, local74);
		@Pc(128) int local128 = local37 * Static540.anInt8852 / Static193.anInt1544;
		@Pc(134) int local134 = Static122.anInt2173 * local39 / Static193.anInt1550;
		@Pc(143) int local143 = local66 + Static632.anInt10143 * local37 / Static193.anInt1544;
		@Pc(157) int local157 = local74 + local39 - local39 * Static634.anInt10184 / Static193.anInt1550 - local134;
		@Pc(159) int local159 = -1996554240;
		if (Static189.aClass375_5 == Static25.aClass375_2) {
			local159 = -1996488705;
		}
		arg4.aa(local143, local157, local128, local134, local159, 1);
		arg4.method6997(local143, local157, local128, local134, local159, 0);
		if (Static95.anInt1808 <= 0) {
			return;
		}
		@Pc(189) int local189;
		if (Static20.anInt544 <= 50) {
			local189 = Static20.anInt544 * 5;
		} else {
			local189 = 500 - Static20.anInt544 * 5;
		}
		for (@Pc(203) Class2_Sub14 local203 = (Class2_Sub14) Static193.aClass109_9.method2325(); local203 != null; local203 = (Class2_Sub14) Static193.aClass109_9.method2318()) {
			@Pc(211) Class172 local211 = Static193.aClass197_2.method4161(local203.anInt3128);
			if (Static373.method5030(local211)) {
				@Pc(240) int local240;
				@Pc(251) int local251;
				if (Static525.anInt5960 == local203.anInt3128) {
					local240 = local66 + local37 * local203.anInt3133 / Static193.anInt1544;
					local251 = local74 + (Static193.anInt1550 - local203.anInt3126) * local39 / Static193.anInt1550;
					arg4.method6936(4, 4, local240 - 2, local189 << 24 | 0xFFFF00, local251 - 2);
				} else if (Static249.anInt3980 != -1 && Static249.anInt3980 == local211.anInt4330) {
					local240 = local37 * local203.anInt3133 / Static193.anInt1544 + local66;
					local251 = (Static193.anInt1550 - local203.anInt3126) * local39 / Static193.anInt1550 + local74;
					arg4.method6936(4, 4, local240 - 2, local189 << 24 | 0xFFFF00, local251 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)I")
	public static int method1602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
