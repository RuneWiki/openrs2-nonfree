import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Lclient!mg;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public static int anInt3527 = 0;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1305 = Static177.method3050("mapdots");

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public static int anInt3531 = 0;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public static int anInt3534 = 0;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1306 = Static177.method3050(":duelstake:");

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public static int anInt3535 = 0;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1307 = Static177.method3050("Konfig geladen)3");

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)Z")
	public static boolean method2678(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static11.aShortArray5[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1006;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method2679() {
		for (@Pc(14) Class4_Sub1_Sub1_Sub3 local14 = (Class4_Sub1_Sub1_Sub3) Static29.aClass11_3.method274(); local14 != null; local14 = (Class4_Sub1_Sub1_Sub3) Static29.aClass11_3.method271()) {
			if (local14.anInt839 != Static73.anInt1873 || Static142.anInt3325 > local14.anInt837) {
				local14.method3173();
			} else if (local14.anInt846 <= Static142.anInt3325) {
				if (local14.anInt832 > 0) {
					@Pc(47) Class4_Sub1_Sub1_Sub1_Sub2 local47 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local14.anInt832 - 1];
					if (local47 != null && local47.anInt2832 >= 0 && local47.anInt2832 < 13312 && local47.anInt2803 >= 0 && local47.anInt2803 < 13312) {
						local14.method545(local47.anInt2832, Static106.method1998(local47.anInt2832, local14.anInt839, local47.anInt2803) - local14.anInt845, Static142.anInt3325, local47.anInt2803);
					}
				}
				if (local14.anInt832 < 0) {
					@Pc(99) int local99 = -local14.anInt832 - 1;
					@Pc(110) Class4_Sub1_Sub1_Sub1_Sub1 local110;
					if (local99 == Static151.anInt3441) {
						local110 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1;
					} else {
						local110 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local99];
					}
					if (local110 != null && local110.anInt2832 >= 0 && local110.anInt2832 < 13312 && local110.anInt2803 >= 0 && local110.anInt2803 < 13312) {
						local14.method545(local110.anInt2832, Static106.method1998(local110.anInt2832, local14.anInt839, local110.anInt2803) - local14.anInt845, Static142.anInt3325, local110.anInt2803);
					}
				}
				local14.method543(Static68.anInt1847);
				Static101.method1950(Static73.anInt1873, (int) local14.aDouble7, (int) local14.aDouble4, (int) local14.aDouble3, 60, local14, local14.anInt844, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!nh;B)[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] method2680(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return Static178.method3063(arg0, arg1) ? Static59.method1123() : null;
	}
}
