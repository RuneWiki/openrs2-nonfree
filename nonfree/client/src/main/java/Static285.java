import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V")
	public static void method3972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static193.aFloat16 > Static193.aFloat15) {
			Static193.aFloat15 = (float) ((double) Static193.aFloat15 + (double) Static193.aFloat15 / 30.0D);
			if (Static193.aFloat15 > Static193.aFloat16) {
				Static193.aFloat15 = Static193.aFloat16;
			}
			Static61.method909();
			Static193.anInt1541 = (int) Static193.aFloat15 >> 1;
			Static193.aByteArrayArrayArray3 = Static562.method7704(Static193.anInt1541);
		} else if (Static193.aFloat15 > Static193.aFloat16) {
			Static193.aFloat15 = (float) ((double) Static193.aFloat15 - (double) Static193.aFloat15 / 30.0D);
			if (Static193.aFloat15 < Static193.aFloat16) {
				Static193.aFloat15 = Static193.aFloat16;
			}
			Static61.method909();
			Static193.anInt1541 = (int) Static193.aFloat15 >> 1;
			Static193.aByteArrayArrayArray3 = Static562.method7704(Static193.anInt1541);
		}
		if (Static27.anInt643 != -1 && Static160.anInt2883 != -1) {
			@Pc(86) int local86 = Static27.anInt643 - Static40.anInt794;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(104) int local104 = Static160.anInt2883 - Static347.anInt5452;
			Static40.anInt794 += local86;
			if (local104 < 2 || local104 > 2) {
				local104 /= 8;
			}
			Static347.anInt5452 += local104;
			if (local86 == 0 && local104 == 0) {
				Static160.anInt2883 = -1;
				Static27.anInt643 = -1;
			}
			Static61.method909();
		}
		if (Static95.anInt1808 > 0) {
			Static20.anInt544--;
			if (Static20.anInt544 == 0) {
				Static95.anInt1808--;
				Static20.anInt544 = 100;
			}
		} else {
			Static525.anInt5960 = -1;
			Static249.anInt3980 = -1;
		}
		if (!Static349.aBoolean399 || Static372.aClass109_37 == null) {
			return;
		}
		for (@Pc(175) Class2_Sub23 local175 = (Class2_Sub23) Static372.aClass109_37.method2325(); local175 != null; local175 = (Class2_Sub23) Static372.aClass109_37.method2318()) {
			@Pc(184) Class172 local184 = Static193.aClass197_2.method4161(local175.aClass2_Sub14_1.anInt3128);
			if (local175.method3863(arg0, arg1)) {
				if (local184.aStringArray23 != null) {
					if (local184.aStringArray23[4] != null) {
						Static564.method7726(false, local184.anInt4330, -1, -1, false, 0, (long) local175.aClass2_Sub14_1.anInt3128, local184.aStringArray23[4], (long) local175.aClass2_Sub14_1.anInt3128, 1010, true, local184.aString41);
					}
					if (local184.aStringArray23[3] != null) {
						Static564.method7726(false, local184.anInt4330, -1, -1, false, 0, (long) local175.aClass2_Sub14_1.anInt3128, local184.aStringArray23[3], (long) local175.aClass2_Sub14_1.anInt3128, 1003, true, local184.aString41);
					}
					if (local184.aStringArray23[2] != null) {
						Static564.method7726(false, local184.anInt4330, -1, -1, false, 0, (long) local175.aClass2_Sub14_1.anInt3128, local184.aStringArray23[2], (long) local175.aClass2_Sub14_1.anInt3128, 1006, true, local184.aString41);
					}
					if (local184.aStringArray23[1] != null) {
						Static564.method7726(false, local184.anInt4330, -1, -1, false, 0, (long) local175.aClass2_Sub14_1.anInt3128, local184.aStringArray23[1], (long) local175.aClass2_Sub14_1.anInt3128, 1012, true, local184.aString41);
					}
					if (local184.aStringArray23[0] != null) {
						Static564.method7726(false, local184.anInt4330, -1, -1, false, 0, (long) local175.aClass2_Sub14_1.anInt3128, local184.aStringArray23[0], (long) local175.aClass2_Sub14_1.anInt3128, 1007, true, local184.aString41);
					}
				}
				if (!local175.aClass2_Sub14_1.aBoolean227) {
					local175.aClass2_Sub14_1.aBoolean227 = true;
					Static300.method4136(Static470.aClass260_8, local175.aClass2_Sub14_1.anInt3128, local184.anInt4330);
				}
				if (local175.aClass2_Sub14_1.aBoolean227) {
					Static300.method4136(Static292.aClass260_4, local175.aClass2_Sub14_1.anInt3128, local184.anInt4330);
				}
			} else if (local175.aClass2_Sub14_1.aBoolean227) {
				local175.aClass2_Sub14_1.aBoolean227 = false;
				Static300.method4136(Static491.aClass260_9, local175.aClass2_Sub14_1.anInt3128, local184.anInt4330);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)I")
	public static int method3974(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
