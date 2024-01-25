import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt5444;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;IIZIZLjava/lang/String;)V")
	public static void method4638(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5) {
		Static194.aClass380_126.anInt10336 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg1 != -1) {
			@Pc(26) Class238 local26 = Static339.aClass66_1.method1439(arg1);
			if (local26 == null || arg2 != local26.method5153()) {
				return;
			}
			if (local26.method5153()) {
				local18 = local26.aString83;
			} else {
				local16 = local26.anInt6043;
			}
		}
		@Pc(51) int local51 = 0;
		@Pc(139) int local139;
		for (@Pc(53) int local53 = 0; local53 < Static72.aClass225_2.anInt5618; local53++) {
			@Pc(60) Class34 local60 = Static72.aClass225_2.method4789(local53);
			if ((!arg4 || local60.aBoolean66) && local60.anInt881 == -1 && local60.anInt851 == -1 && local60.anInt860 == 0 && local60.aString11.toLowerCase().indexOf(local11) != -1) {
				if (arg1 != -1) {
					if (arg2) {
						if (!arg5.equals(local60.method687(local18, arg1))) {
							continue;
						}
					} else if (arg3 != local60.method688(local16, arg1)) {
						continue;
					}
				}
				if (local51 >= 250) {
					Static354.aShortArray80 = null;
					Static129.anInt8997 = -1;
					return;
				}
				if (local51 >= local14.length) {
					@Pc(137) short[] local137 = new short[local14.length * 2];
					for (local139 = 0; local139 < local51; local139++) {
						local137[local139] = local14[local139];
					}
					local14 = local137;
				}
				local14[local51++] = (short) local53;
			}
		}
		Static354.aShortArray80 = local14;
		Static330.anInt6459 = 0;
		Static129.anInt8997 = local51;
		@Pc(185) String[] local185 = new String[Static129.anInt8997];
		for (local139 = 0; local139 < Static129.anInt8997; local139++) {
			local185[local139] = Static72.aClass225_2.method4789(local14[local139]).aString11;
		}
		Static51.method835(local185, Static354.aShortArray80);
		Static194.aClass380_126.method8626();
		Static194.aClass380_126.anInt10336 = 2;
	}
}
