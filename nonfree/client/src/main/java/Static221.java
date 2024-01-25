import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	public static int anInt3584;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "Lclient!jt;")
	public static Class129 aClass129_2;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Lclient!ic;")
	public static Class113 aClass113_71;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_134 = new Class214(80, -1);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!dh;)Lclient!dp;")
	public static Class53 method2941(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(7) Class53 local7 = new Class53();
		local7.anInt1435 = arg0.method4485();
		local7.aClass1_Sub3_Sub17_1 = Static109.aClass229_1.method4848(local7.anInt1435);
		return local7;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)V")
	public static void method2942(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static399.anInt6510 + Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613;
		@Pc(15) int local15 = Static106.anInt1854 + Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616;
		if (Static327.anInt5372 - local10 < -500 || Static327.anInt5372 - local10 > 500 || Static155.anInt2606 - local15 < -500 || Static155.anInt2606 - local15 > 500) {
			Static155.anInt2606 = local15;
			Static327.anInt5372 = local10;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		if (local10 != Static327.anInt5372) {
			local57 = local10 - Static327.anInt5372;
			local65 = (int) (arg0 * (long) local57 / 320L);
			if (local57 > 0) {
				if (local65 == 0) {
					local65 = 1;
				} else if (local57 < local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = -1;
			} else if (local57 > local65) {
				local65 = local57;
			}
			Static327.anInt5372 += local65;
		}
		if (local15 != Static155.anInt2606) {
			local57 = local15 - Static155.anInt2606;
			local65 = (int) (arg0 * (long) local57 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local65 < local57) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local65 > local57) {
				local65 = local57;
			}
			Static155.anInt2606 += local65;
		}
		if (!Static336.aClass106_Sub1_1.aBoolean470) {
			Static278.aFloat52 += (float) arg0 * Static230.aFloat90 / 6.0F;
			Static95.aFloat27 += (float) arg0 * Static19.aFloat3 / 6.0F;
		}
		Static430.method5421();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZLclient!mv;)V")
	public static void method2943(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11_Sub1 arg1) {
		Static405.anInt6543 = 0;
		Static45.aBoolean60 = false;
		Static384.method4911(arg1);
		Static243.method4675(arg1);
		if (Static45.aBoolean60) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt5766 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt5766 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2944(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
