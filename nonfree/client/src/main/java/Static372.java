import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "Lclient!lda;")
	public static Class204 aClass204_24;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[6][];

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!lo;[Lclient!gga;)V")
	public static void method5513(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) Class2_Sub14[] arg1) {
		@Pc(6) int local6;
		if (Static222.aBoolean341) {
			local6 = arg0.method7315(arg1);
			Static356.aClass100_8.method6188(local6, arg1);
		}
		if (Static592.aClass67Array4 == Static421.aClass67Array7) {
			@Pc(28) int local28;
			if (arg0 instanceof Class6_Sub1_Sub1) {
				local6 = ((Class6_Sub1_Sub1) arg0).aShort85;
				local28 = ((Class6_Sub1_Sub1) arg0).aShort83;
			} else {
				local6 = arg0.anInt8761 >> Static134.anInt2822;
				local28 = arg0.anInt8764 >> Static134.anInt2822;
			}
			Static356.aClass100_8.YA(Static569.aClass67Array8[0].method6711(arg0.anInt8764, arg0.anInt8761), Static106.method5542(local6, local28), Static299.method4537(local6, local28), Static386.method5688(local6, local28));
		}
		@Pc(64) Class6_Sub5 local64 = arg0.method7317(Static356.aClass100_8);
		if (local64 == null) {
			return;
		}
		local64.aClass6_Sub1_1 = arg0;
		if (Static293.aBoolean419) {
			@Pc(73) Class109 local73 = Static380.aClass109_7;
			synchronized (Static380.aClass109_7) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class6_Sub5 local82 = (Class6_Sub5) Static380.aClass109_7.method2314(); local82 != null; local82 = (Class6_Sub5) Static380.aClass109_7.method2312()) {
					if (arg0.anInt8758 >= local82.aClass6_Sub1_1.anInt8758) {
						Static26.method449(local64, local82);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static380.aClass109_7.method2313(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class6_Sub5 local122 = (Class6_Sub5) Static380.aClass109_7.method2314(); local122 != null; local122 = (Class6_Sub5) Static380.aClass109_7.method2312()) {
			if (arg0.anInt8758 >= local122.aClass6_Sub1_1.anInt8758) {
				Static26.method449(local64, local122);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static380.aClass109_7.method2313(local64);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
	public static void method5514() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static188.anInt3850; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static49.anInt1174; local13++) {
				if (Static450.method6453(true, local7, local13, local9, Static389.aClass346ArrayArrayArray2)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
