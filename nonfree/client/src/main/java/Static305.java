import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
	public static int anInt166;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!jd;")
	public static final Class129 aClass129_2 = new Class129("WTI", 5);

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	public static int anInt167 = -1;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(JIBI)V")
	public static void method170(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg0 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static391.method5421(arg1, 0, 0, arg2, local10, local21, 0, true);
			return;
		}
		@Pc(60) Class192 local60 = Static249.aClass39_2.method748(local28);
		@Pc(73) int local73;
		@Pc(76) int local76;
		if (local21 == 0 || local21 == 2) {
			local73 = local60.anInt5455;
			local76 = local60.anInt5446;
		} else {
			local76 = local60.anInt5455;
			local73 = local60.anInt5446;
		}
		@Pc(87) int local87 = local60.anInt5437;
		if (local21 != 0) {
			local87 = (local87 << local21 & 0xF) + (local87 >> 4 - local21);
		}
		Static391.method5421(arg1, local87, local73, arg2, 0, 0, local76, true);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)V")
	public static void method171(@OriginalArg(1) int arg0) {
		if (Static452.anInt951 == 0) {
			Static386.aClass2_Sub8_Sub2_6.method3308(arg0);
		} else {
			Static389.anInt6735 = arg0;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method172(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(15) int local15 = Static64.method1051(arg0, arg1);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1 != arg0.charAt(local30); local30++) {
			}
			local20[local22++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local15] = arg0.substring(local24);
		return local20;
	}
}
