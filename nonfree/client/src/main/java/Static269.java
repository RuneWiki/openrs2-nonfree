import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "Lclient!wo;")
	public static Class216 aClass216_85;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "[Lclient!ip;")
	public static Class53[] aClass53Array2;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_155 = new Class34("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!rf", name = "K", descriptor = "Z")
	public static boolean aBoolean537 = true;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
	public static final int[] anIntArray460 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(JI)V")
	public static void method4737(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static133.anInt2962;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (Static107.anInt2547 != local7) {
			local18 = local7 - Static107.anInt2547;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Static107.anInt2547 += local26;
		}
		@Pc(68) int local68 = Static77.anInt2010;
		if (local68 != Static87.anInt2179) {
			local18 = local68 - Static87.anInt2179;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 <= 0) {
				if (local26 == 0) {
					local26 = -1;
				} else if (local26 < local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = 1;
			} else if (local26 > local18) {
				local26 = local18;
			}
			Static87.anInt2179 += local26;
		}
		if (!Static327.aBoolean607) {
			Static36.aFloat5 += (float) arg0 * Static146.aFloat40 / 40.0F * 8.0F;
			Static75.aFloat13 += Static356.aFloat79 * (float) arg0 / 40.0F * 8.0F;
		}
		Static218.method4139();
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(III)V")
	public static void method4738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static77.aClass194ArrayArrayArray1[0][arg1][arg2] != null && Static77.aClass194ArrayArrayArray1[0][arg1][arg2].aClass194_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static77.aClass194ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class194 local46 = Static77.aClass194ArrayArrayArray1[local22][arg1][arg2] = new Class194(local22, arg1, arg2);
				if (local20) {
					local46.aByte64++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method4739() {
		@Pc(1) Class87 local1 = Static304.aClass87_52;
		synchronized (Static304.aClass87_52) {
			Static304.aClass87_52.method2477();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!wo;I)V")
	public static void method4740(@OriginalArg(0) Class216 arg0) {
		Static72.aClass216_26 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Lclient!rn;")
	public static Class181 method4742(@OriginalArg(0) int arg0) {
		@Pc(10) Class181 local10 = (Class181) Static287.aClass87_50.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass216_16.method5648(1, arg0);
		local10 = new Class181();
		if (local20 != null) {
			local10.method4812(arg0, new Class1_Sub8(local20));
		}
		Static287.aClass87_50.method2481(local10, (long) arg0);
		return local10;
	}
}
