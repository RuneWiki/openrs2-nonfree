import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	public static int anInt7640;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)I")
	public static int method6448(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static1.anInt9943;
		if (local5 == 0) {
			return arg0 ? 0 : Static147.anInt3008;
		} else if (local5 == 1) {
			return Static147.anInt3008;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)Z")
	public static boolean method6450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)Z")
	public static boolean method6451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static187.method5797(arg0, arg1) & Static646.method8667(arg0, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZ)I")
	public static int method6452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static500.anInt8324 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(23) int local23 = arg2 - Static330.anInt764;
		@Pc(28) int local28 = arg1 - Static330.anInt759;
		for (@Pc(33) Class5_Sub36 local33 = (Class5_Sub36) Static330.aClass114_6.method2805(); local33 != null; local33 = (Class5_Sub36) Static330.aClass114_6.method2814()) {
			if (local33.anInt5984 == arg0) {
				@Pc(41) int local41 = local33.anInt5981;
				@Pc(44) int local44 = local33.anInt5983;
				@Pc(55) int local55 = local41 + Static330.anInt764 << 14 | local44 + Static330.anInt759;
				@Pc(74) int local74 = (local28 - local44) * (local28 - local44) + (local23 - local41) * (-local41 + local23);
				if (local17 < 0 || local74 < local19) {
					local17 = local55;
					local19 = local74;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIJZ)Ljava/lang/String;")
	public static String method6453(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static622.method8435(arg1);
		@Pc(18) Calendar local18 = Static158.aCalendar1;
		@Pc(22) int local22 = local18.get(5);
		@Pc(26) int local26 = local18.get(2);
		@Pc(30) int local30 = local18.get(1);
		@Pc(34) int local34 = local18.get(11);
		@Pc(38) int local38 = local18.get(12);
		return arg0 == 3 ? Static201.method3274(arg0, arg1) : Integer.toString(local22 / 10) + local22 % 10 + "-" + Static36.aStringArrayArray1[arg0][local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10;
	}
}
