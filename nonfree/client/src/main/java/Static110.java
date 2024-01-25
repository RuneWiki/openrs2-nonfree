import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString41 = "";

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "[Lclient!jla;")
	public static final Class197[] aClass197Array1 = new Class197[8];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class181 local14 = local7.aClass181_3; local14 != null; local14 = local14.aClass181_2) {
			@Pc(18) Class9_Sub1_Sub1 local18 = local14.aClass9_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort123 == arg1 && local18.aShort120 == arg2) {
				Static530.method7066(local18, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)V")
	public static void method2162(@OriginalArg(0) long arg0) {
		@Pc(12) int local12 = Static13.anInt566;
		@Pc(14) int local14 = Static78.anInt1842;
		@Pc(26) int local26;
		@Pc(34) int local34;
		if (Static690.anInt10754 != local12) {
			local26 = local12 - Static690.anInt10754;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 > 0) {
				if (local34 == 0) {
					local34 = 1;
				} else if (local34 > local26) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = -1;
			} else if (local26 > local34) {
				local34 = local26;
			}
			Static690.anInt10754 += local34;
		}
		Static382.aFloat40 += Static150.aFloat57 * (float) arg0 / 40.0F * 8.0F;
		Static447.aFloat107 += Static522.aFloat127 * (float) arg0 / 40.0F * 8.0F;
		if (local14 != Static504.anInt8040) {
			local26 = local14 - Static504.anInt8040;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local26 > local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local26 < local34) {
				local34 = local26;
			}
			Static504.anInt8040 += local34;
		}
		Static651.method8576();
	}
}
