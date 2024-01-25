import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public static int anInt11097;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;I)V")
	public static void method9239(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static257.method3751(arg2, true, arg1, arg0, -1, arg3);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!jga;)V")
	public static void method9240(@OriginalArg(1) Class14_Sub3_Sub11 arg0) {
		if (arg0 == null) {
			return;
		}
		Static16.aClass262_68.method6314(arg0);
		Static313.anInt9044++;
		@Pc(43) Class14_Sub3_Sub21 local43;
		if (arg0.aBoolean325 || "".equals(arg0.aString58)) {
			local43 = new Class14_Sub3_Sub21(arg0.aString58);
			Static569.anInt9810++;
		} else {
			@Pc(37) long local37 = arg0.aLong145;
			for (local43 = (Class14_Sub3_Sub21) Static38.aClass187_6.method4078(local37); local43 != null && !local43.aString119.equals(arg0.aString58); local43 = (Class14_Sub3_Sub21) Static38.aClass187_6.method4086()) {
			}
			if (local43 == null) {
				local43 = (Class14_Sub3_Sub21) Static228.aClass264_25.method6367(local37);
				if (local43 != null && !local43.aString119.equals(arg0.aString58)) {
					local43 = null;
				}
				if (local43 == null) {
					local43 = new Class14_Sub3_Sub21(arg0.aString58);
				}
				Static38.aClass187_6.method4077(local37, local43);
				Static569.anInt9810++;
			}
		}
		if (local43.method9258(arg0)) {
			Static50.method1049(local43);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)[Lclient!mm;")
	public static Class235[] method9241() {
		if (Static574.aClass235Array1 == null) {
			@Pc(11) Class235[] local11 = Static361.method5487(Static234.aClass333_5);
			@Pc(15) Class235[] local15 = new Class235[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(22) int local22 = Static56.aClass14_Sub22_5.aClass21_Sub23_1.method7768();
			@Pc(84) int local84;
			@Pc(90) Class235 local90;
			label69: for (@Pc(24) int local24 = 0; local24 < local11.length; local24++) {
				@Pc(30) Class235 local30 = local11[local24];
				if ((local30.anInt6837 <= 0 || local30.anInt6837 >= 24) && local30.anInt6838 >= 800 && local30.anInt6833 >= 600 && (local22 != 2 || local30.anInt6838 <= 800 && local30.anInt6833 <= 600) && (local22 != 1 || local30.anInt6838 <= 1024 && local30.anInt6833 <= 768)) {
					for (local84 = 0; local84 < local17; local84++) {
						local90 = local15[local84];
						if (local90.anInt6838 == local30.anInt6838 && local30.anInt6833 == local90.anInt6833) {
							if (local90.anInt6837 < local30.anInt6837) {
								local15[local84] = local30;
							}
							continue label69;
						}
					}
					local15[local17] = local30;
					local17++;
				}
			}
			Static574.aClass235Array1 = new Class235[local17];
			Static681.method2481(local15, 0, Static574.aClass235Array1, 0, local17);
			@Pc(146) int[] local146 = new int[Static574.aClass235Array1.length];
			for (local84 = 0; local84 < Static574.aClass235Array1.length; local84++) {
				local90 = Static574.aClass235Array1[local84];
				local146[local84] = local90.anInt6833 * local90.anInt6838;
			}
			Static637.method8889(local146, Static574.aClass235Array1);
		}
		return Static574.aClass235Array1;
	}
}
