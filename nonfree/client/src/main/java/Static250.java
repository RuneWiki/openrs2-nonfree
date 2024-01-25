import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!jj;")
	public static Class1_Sub25 aClass1_Sub25_2;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
	public static boolean aBoolean368;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
	public static final int[] anIntArray400 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLclient!jj;)I")
	public static int method4430(@OriginalArg(1) Class1_Sub25 arg0) {
		@Pc(7) String local7 = Static140.method2620(arg0);
		@Pc(9) int[] local9 = null;
		if (Static337.method5699(arg0.anInt4365)) {
			local9 = Static181.aClass316_1.method8107((int) arg0.aLong114).anIntArray443;
		} else if (arg0.anInt4368 != -1) {
			local9 = Static181.aClass316_1.method8107(arg0.anInt4368).anIntArray443;
		} else if (Static459.method7010(arg0.anInt4365)) {
			@Pc(41) Class1_Sub41 local41 = (Class1_Sub41) Static362.aClass230_46.method6144((long) arg0.aLong114);
			if (local41 != null) {
				@Pc(46) Class20_Sub1_Sub1_Sub2 local46 = local41.aClass20_Sub1_Sub1_Sub2_2;
				@Pc(49) Class283 local49 = local46.aClass283_1;
				if (local49.anIntArray743 != null) {
					local49 = local49.method7368(Static417.aClass10_1);
				}
				if (local49 != null) {
					local9 = local49.anIntArray744;
				}
			}
		} else if (Static456.method6996(arg0.anInt4365)) {
			@Pc(91) Class51 local91;
			if (arg0.anInt4365 == 1010) {
				local91 = Static398.aClass18_4.method609((int) arg0.aLong114);
			} else {
				local91 = Static398.aClass18_4.method609((int) (arg0.aLong114 >>> 32 & 0x7FFFFFFFL));
			}
			if (local91.anIntArray108 != null) {
				local91 = local91.method1625(Static417.aClass10_1);
			}
			if (local91 != null) {
				local9 = local91.anIntArray106;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static19.method550(local9);
		}
		@Pc(139) int local139 = Static270.aClass96_10.method2373(local7, Static204.aClass104Array38);
		if (arg0.aBoolean341) {
			local139 += Static57.aClass104_6.c() + 4;
		}
		return local139;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public static void method4432() {
		@Pc(9) Class277 local9 = Static346.aClass277_50;
		synchronized (Static346.aClass277_50) {
			Static346.aClass277_50.method7026();
		}
		local9 = Static301.aClass277_42;
		synchronized (Static301.aClass277_42) {
			Static301.aClass277_42.method7026();
		}
	}
}
