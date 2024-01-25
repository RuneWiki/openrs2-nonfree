import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "[Lclient!cl;")
	public static Class42[] aClass42Array3;

	@OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
	public static int anInt3862;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "Z")
	public static boolean aBoolean379 = false;

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
	public static int anInt3857 = 1;

	@OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
	public static int anInt3858 = 0;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	public static void method3189() {
		Static258.aClass227_33.method4871();
		Static374.aClass227_47.method4871();
		Static82.aClass227_13.method4871();
		Static66.aClass227_9.method4871();
		Static71.aClass227_10.method4871();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZLclient!qr;Z)V")
	public static void method3190(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub38 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt5050;
		@Pc(12) int local12 = (int) arg1.aLong207;
		arg1.method5577();
		if (arg2) {
			Static147.method2204(local8);
		}
		Static90.method1351(local8);
		@Pc(29) Class117 local29 = Static13.method107(local12);
		if (local29 != null) {
			Static312.method4635(local29);
		}
		Static241.method3347();
		if (!arg0 && Static352.anInt5753 != -1) {
			Static350.method4909(Static352.anInt5753, 1);
		}
		@Pc(58) Class60 local58 = new Class60(Static22.aClass77_29);
		for (@Pc(63) Class1_Sub38 local63 = (Class1_Sub38) local58.method1160(); local63 != null; local63 = (Class1_Sub38) local58.method1159()) {
			if (!local63.method5576()) {
				local63 = (Class1_Sub38) local58.method1160();
				if (local63 == null) {
					return;
				}
			}
			if (local63.anInt5052 == 3) {
				@Pc(87) int local87 = (int) local63.aLong207;
				if (local8 == local87 >>> 16) {
					method3190(arg0, local63, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3191(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
