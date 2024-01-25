import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!pja", name = "i", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!pja", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IB)V")
	public static void method7035(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub6_Sub12 local16 = Static636.method8647(4, (long) arg0);
		local16.method6245();
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(BIZLclient!oh;I)V")
	public static void method7036(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class273 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt7402;
		if (arg2.aByte106 == 0) {
			arg2.anInt7402 = arg2.anInt7404;
		} else if (arg2.aByte106 == 1) {
			arg2.anInt7402 = arg3 - arg2.anInt7404;
		} else if (arg2.aByte106 == 2) {
			arg2.anInt7402 = arg3 * arg2.anInt7404 >> 14;
		}
		@Pc(57) int local57 = arg2.anInt7385;
		if (arg2.aByte104 == 0) {
			arg2.anInt7385 = arg2.anInt7388;
		} else if (arg2.aByte104 == 1) {
			arg2.anInt7385 = arg0 - arg2.anInt7388;
		} else if (arg2.aByte104 == 2) {
			arg2.anInt7385 = arg0 * arg2.anInt7388 >> 14;
		}
		if (arg2.aByte106 == 4) {
			arg2.anInt7402 = arg2.anInt7385 * arg2.anInt7421 / arg2.anInt7381;
		}
		if (arg2.aByte104 == 4) {
			arg2.anInt7385 = arg2.anInt7402 * arg2.anInt7381 / arg2.anInt7421;
		}
		if (Static311.aBoolean411 && (Static91.method1412(arg2).anInt3441 != 0 || arg2.anInt7371 == 0)) {
			if (arg2.anInt7385 < 5 && arg2.anInt7402 < 5) {
				arg2.anInt7402 = 5;
				arg2.anInt7385 = 5;
			} else {
				if (arg2.anInt7385 <= 0) {
					arg2.anInt7385 = 5;
				}
				if (arg2.anInt7402 <= 0) {
					arg2.anInt7402 = 5;
				}
			}
		}
		if (Static138.anInt2277 == arg2.anInt7401) {
			Static291.aClass273_5 = arg2;
		}
		if (arg1 && arg2.anObjectArray13 != null && (arg2.anInt7402 != local8 || local57 != arg2.anInt7385)) {
			@Pc(239) Class2_Sub36 local239 = new Class2_Sub36();
			local239.aClass273_6 = arg2;
			local239.anObjectArray2 = arg2.anObjectArray13;
			Static592.aClass60_189.method1233(local239);
		}
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(B)Lclient!nj;")
	public static Class2_Sub6_Sub12 method7037() {
		@Pc(17) Class2_Sub6_Sub12 local17 = (Class2_Sub6_Sub12) Static398.aClass388_5.method9213();
		if (local17 != null) {
			local17.method9872();
			local17.method8698();
			return local17;
		}
		do {
			local17 = (Class2_Sub6_Sub12) Static453.aClass388_8.method9213();
			if (local17 == null) {
				return null;
			}
			if (local17.method6240() > Static567.method7863()) {
				return null;
			}
			local17.method9872();
			local17.method8698();
		} while ((Long.MIN_VALUE & local17.aLong311) == 0L);
		return local17;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(II)Lclient!saa;")
	public static Class334 method7039(@OriginalArg(1) int arg0) {
		@Pc(12) Class334 local12 = (Class334) Static284.aClass85_32.method1737((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(23) byte[] local23 = Static370.aClass254_78.method6087(arg0, 0);
		local12 = new Class334();
		if (local23 != null) {
			local12.method7910(new Class2_Sub20(local23));
		}
		local12.method7909();
		Static284.aClass85_32.method1745((long) arg0, 16383, local12);
		return local12;
	}
}
