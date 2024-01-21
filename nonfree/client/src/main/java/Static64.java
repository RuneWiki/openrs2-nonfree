import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "Lclient!eh;")
	public static Class28 aClass28_72;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_490 = Static181.method2795("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[I")
	public static final int[] anIntArray130 = new int[2048];

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_491 = Static181.method2795("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_493 = Static181.method2795("Started 3d library");

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Lclient!qe;")
	public static Class83 aClass83_492 = aClass83_493;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!kd;)V")
	public static void method1210(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(1) int local1 = -1;
		@Pc(7) long local7 = 0L;
		if (arg0.anInt2076 == 0) {
			local7 = Static213.method3230(arg0.anInt2080, arg0.anInt2084, arg0.anInt2082);
		}
		@Pc(20) int local20 = 0;
		if (arg0.anInt2076 == 1) {
			local7 = Static58.method1122(arg0.anInt2080, arg0.anInt2084, arg0.anInt2082);
		}
		@Pc(39) int local39 = 0;
		if (arg0.anInt2076 == 2) {
			local7 = Static175.method2694(arg0.anInt2080, arg0.anInt2084, arg0.anInt2082);
		}
		if (arg0.anInt2076 == 3) {
			local7 = Static93.method1604(arg0.anInt2080, arg0.anInt2084, arg0.anInt2082);
		}
		if (local7 != 0L) {
			local39 = (int) local7 >> 14 & 0x1F;
			local1 = (int) (local7 >>> 32) & Integer.MAX_VALUE;
			local20 = (int) local7 >> 20 & 0x3;
		}
		arg0.anInt2075 = local39;
		arg0.anInt2078 = local1;
		arg0.anInt2087 = local20;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)V")
	public static void method1211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass26_1 = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public static void method1212() {
		@Pc(10) int local10 = Static33.aClass2_Sub3_Sub1_1.method285(8);
		@Pc(19) int local19;
		if (Static21.anInt572 > local10) {
			for (local19 = local10; local19 < Static21.anInt572; local19++) {
				Static26.anIntArray46[Static89.anInt4289++] = Static10.anIntArray18[local19];
			}
		}
		if (Static21.anInt572 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static21.anInt572 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(57) int local57 = Static10.anIntArray18[local19];
			@Pc(61) Class24_Sub4_Sub1 local61 = Static22.aClass24_Sub4_Sub1Array1[local57];
			@Pc(68) int local68 = Static33.aClass2_Sub3_Sub1_1.method285(1);
			if (local68 == 0) {
				Static10.anIntArray18[Static21.anInt572++] = local57;
				local61.anInt3309 = Static13.anInt386;
			} else {
				@Pc(91) int local91 = Static33.aClass2_Sub3_Sub1_1.method285(2);
				if (local91 == 0) {
					Static10.anIntArray18[Static21.anInt572++] = local57;
					local61.anInt3309 = Static13.anInt386;
					anIntArray130[Static177.anInt3619++] = local57;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local91 == 1) {
						Static10.anIntArray18[Static21.anInt572++] = local57;
						local61.anInt3309 = Static13.anInt386;
						local138 = Static33.aClass2_Sub3_Sub1_1.method285(3);
						local61.method2522(local138, false);
						local148 = Static33.aClass2_Sub3_Sub1_1.method285(1);
						if (local148 == 1) {
							anIntArray130[Static177.anInt3619++] = local57;
						}
					} else if (local91 == 2) {
						Static10.anIntArray18[Static21.anInt572++] = local57;
						local61.anInt3309 = Static13.anInt386;
						local138 = Static33.aClass2_Sub3_Sub1_1.method285(3);
						local61.method2522(local138, true);
						local148 = Static33.aClass2_Sub3_Sub1_1.method285(3);
						local61.method2522(local148, true);
						@Pc(206) int local206 = Static33.aClass2_Sub3_Sub1_1.method285(1);
						if (local206 == 1) {
							anIntArray130[Static177.anInt3619++] = local57;
						}
					} else if (local91 == 3) {
						Static26.anIntArray46[Static89.anInt4289++] = local57;
					}
				}
			}
		}
	}
}
