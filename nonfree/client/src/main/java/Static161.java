import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!ae;")
	public static Class4 aClass4_10;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_114 = new Class217(12, 10);

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_91 = new Class21(500);

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_115 = new Class217(100, -1);

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "[I")
	public static final int[] anIntArray241 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Lclient!fp;)V")
	public static void method3062(@OriginalArg(0) Class63 arg0) {
		for (@Pc(1) int local1 = Static112.anInt2495; local1 < Static263.anInt5201; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static300.anInt5778; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static354.anInt6714; local7++) {
					@Pc(16) Class155 local16 = Static105.aClass155ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub5 local21 = local16.aClass11_Sub5_2;
						@Pc(24) Class11_Sub5 local24 = local16.aClass11_Sub5_1;
						if (local21 != null && local21.method5913()) {
							Static41.method956(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5913()) {
								Static41.method956(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5915(arg0, local21, false, 0, 0, 0);
								local24.method5911();
							}
							local21.method5911();
						}
						for (@Pc(70) Class187 local70 = local16.aClass187_2; local70 != null; local70 = local70.aClass187_3) {
							@Pc(74) Class11_Sub2 local74 = local70.aClass11_Sub2_2;
							if (local74 != null && local74.method5913()) {
								Static41.method956(arg0, local74, local1, local4, local7, local74.aShort92 + 1 - local74.aShort94, local74.aShort91 - local74.aShort93 + 1);
								local74.method5911();
							}
						}
						@Pc(111) Class11_Sub1 local111 = local16.aClass11_Sub1_2;
						if (local111 != null && local111.method5913()) {
							Static131.method2689(arg0, local111, local1, local4, local7);
							local111.method5911();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public static void method3064() {
		Static236.anInt4782 = -1;
		Static331.aClass4_22 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public static void method3065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class9 local12 = Static147.method2867(arg0);
		@Pc(15) int local15 = local12.anInt284;
		@Pc(18) int local18 = local12.anInt286;
		@Pc(21) int local21 = local12.anInt285;
		@Pc(28) int local28 = Class79.anIntArray189[local21 - local18];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local18;
		Static133.method2719(arg1 << local18 & local28 | ~local28 & Static277.anIntArray417[local15], local15);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)Lclient!tp;")
	public static Class199 method3066(@OriginalArg(0) int arg0) {
		@Pc(5) Class21 local5 = Static288.aClass21_147;
		@Pc(14) Class199 local14;
		synchronized (Static288.aClass21_147) {
			local14 = (Class199) Static288.aClass21_147.method854((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static209.aClass30_63.method1161(Static280.method5007(arg0), Static108.method2307(arg0));
		local14 = new Class199();
		local14.anInt6026 = arg0;
		if (local34 != null) {
			local14.method5410(new Class1_Sub7(local34));
		}
		local14.method5409();
		@Pc(60) Class21 local60 = Static288.aClass21_147;
		synchronized (Static288.aClass21_147) {
			Static288.aClass21_147.method843(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method3067() {
		Static27.aClass21_25.method851();
		Static336.aClass21_169.method851();
	}
}
