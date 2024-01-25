import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "Z")
	public static final boolean aBoolean663 = true;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V")
	public static void method7810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg2 + Static534.anInt8358;
		@Pc(14) int local14 = arg1 + Static402.anInt6661;
		if (Static254.aClass368ArrayArrayArray2 == null || arg2 < 0 || arg1 < 0 || Static98.anInt361 <= arg2 || arg1 >= Static438.anInt7120 || Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 0 && arg0 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) {
			return;
		}
		@Pc(69) long local69 = (long) (local10 | local14 << 14 | arg0 << 28);
		@Pc(77) Class3_Sub20 local77 = (Class3_Sub20) Static462.aClass333_29.method7489(local69);
		if (local77 == null) {
			Static47.method831(arg0, arg2, arg1);
			return;
		}
		@Pc(91) Class3_Sub48 local91 = (Class3_Sub48) local77.aClass302_17.method6603();
		if (local91 == null) {
			Static47.method831(arg0, arg2, arg1);
			return;
		}
		@Pc(105) Class34_Sub1_Sub4_Sub1 local105 = (Class34_Sub1_Sub4_Sub1) Static47.method831(arg0, arg2, arg1);
		if (local105 == null) {
			local105 = new Class34_Sub1_Sub4_Sub1(arg2 << 9, Static582.aClass35Array3[arg0].method7461(arg1, arg2), arg1 << 9, arg0, arg0);
		} else {
			local105.anInt6150 = local105.anInt6157 = -1;
		}
		local105.anInt6145 = local91.anInt9328;
		local105.anInt6144 = local91.anInt9332;
		label56: while (true) {
			@Pc(148) Class3_Sub48 local148 = (Class3_Sub48) local77.aClass302_17.method6605();
			if (local148 == null) {
				break;
			}
			if (local105.anInt6145 != local148.anInt9328) {
				local105.anInt6155 = local148.anInt9332;
				local105.anInt6150 = local148.anInt9328;
				while (true) {
					@Pc(173) Class3_Sub48 local173 = (Class3_Sub48) local77.aClass302_17.method6605();
					if (local173 == null) {
						break label56;
					}
					if (local105.anInt6145 != local173.anInt9328 && local173.anInt9328 != local105.anInt6150) {
						local105.anInt6157 = local173.anInt9328;
						local105.anInt6161 = local173.anInt9332;
					}
				}
			}
		}
		@Pc(213) int local213 = Static662.method8831((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
		local105.aByte132 = (byte) arg0;
		local105.anInt9614 = arg2 << 9;
		local105.anInt6156 = 0;
		local105.anInt9622 = local213;
		local105.anInt9619 = arg1 << 9;
		local105.aByte131 = (byte) arg0;
		if (Static209.method3118(arg2, arg1)) {
			local105.aByte131++;
		}
		Static428.method5911(arg0, arg2, arg1, local213, local105);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZJ)V")
	public static void method7811(@OriginalArg(1) long arg0) {
		Static387.aCalendar2.setTime(new Date(arg0));
	}
}
