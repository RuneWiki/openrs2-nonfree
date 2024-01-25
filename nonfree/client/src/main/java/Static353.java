import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!de;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString260 = "Loaded sprites";

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	public static int anInt6829 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
	public static void method5711() {
		for (@Pc(1) int local1 = 0; local1 < Static45.anInt928; local1++) {
			@Pc(6) Class5_Sub4 local6 = Static287.aClass5_Sub4Array3[local1];
			Static222.method3880(local6);
			Static287.aClass5_Sub4Array3[local1] = null;
		}
		Static45.anInt928 = 0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIB)Z")
	public static boolean method5712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(20) Class170 local20 = Static268.method4553(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local20.method4404(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZ)V")
	public static void method5714(@OriginalArg(0) int arg0) {
		if (arg0 == Static266.anInt5370) {
			return;
		}
		if (Static266.anInt5370 == 0) {
			Static3.method27();
		}
		if (arg0 == 40) {
			Static118.method2063();
		}
		if (arg0 != 40 && Static6.aClass16_5 != null) {
			Static6.aClass16_5.method392();
			Static6.aClass16_5 = null;
		}
		if (Static266.anInt5370 == 25 || Static266.anInt5370 == 28) {
			Static296.aClass100_115.anInt2828 = 2;
			Static277.aClass100_111.anInt2828 = 2;
			Static227.aClass100_95.anInt2828 = 2;
			Static175.aClass100_74.anInt2828 = 2;
			Static107.aClass100_45.anInt2828 = 2;
			Static147.aClass100_63.anInt2828 = 2;
			Static38.aClass100_14.anInt2828 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static230.anInt6563 = 1;
			Static1.anInt9 = 1;
			Static290.anInt5803 = 0;
			Static231.anInt4674 = 0;
			Static78.anInt1558 = 0;
			Static233.method4014(true);
			Static296.aClass100_115.anInt2828 = 1;
			Static277.aClass100_111.anInt2828 = 1;
			Static227.aClass100_95.anInt2828 = 1;
			Static175.aClass100_74.anInt2828 = 1;
			Static107.aClass100_45.anInt2828 = 1;
			Static147.aClass100_63.anInt2828 = 1;
			Static38.aClass100_14.anInt2828 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static184.method5383();
		}
		if (arg0 == 5) {
			Static5.method90(Static212.aClass122_2, Static317.aClass100_112);
		} else {
			Static83.method1302();
		}
		@Pc(144) boolean local144 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(159) boolean local159 = Static266.anInt5370 == 5 || Static266.anInt5370 == 10 || Static266.anInt5370 == 28;
		if (local159 != local144) {
			if (local144) {
				Static312.anInt6282 = Class5_Sub4_Sub4.lb;
				if (Static36.anInt809 == 0) {
					Static310.method5212();
				} else {
					Static225.method4598(Class5_Sub4_Sub4.lb, Static244.aClass100_98, 255);
				}
				Static10.aClass163_1.method4174(false);
			} else {
				Static310.method5212();
				Static10.aClass163_1.method4174(true);
				if (Static88.aClass115_1 != null) {
					Static88.aClass115_1.method2842();
					Static88.aClass115_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static212.aClass122_2.method4737();
		}
		Static266.anInt5370 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)Lclient!mi;")
	public static Class135 method5715(@OriginalArg(0) int arg0) {
		@Pc(5) Class198 local5 = Static270.aClass198_50;
		@Pc(23) Class135 local23;
		synchronized (Static270.aClass198_50) {
			local23 = (Class135) Static270.aClass198_50.method5242((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(39) byte[] local39 = Static277.aClass100_110.method2319(16, arg0);
		local23 = new Class135();
		if (local39 != null) {
			local23.method3428(new Class3_Sub4(local39));
		}
		local5 = Static270.aClass198_50;
		synchronized (Static270.aClass198_50) {
			Static270.aClass198_50.method5231((long) arg0, local23);
			return local23;
		}
	}
}
