import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bs", name = "Fb", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!bs", name = "Cb", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_13 = new Class44(40, -1);

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
	public static void method735() {
		@Pc(7) int local7 = Static348.anInt6137;
		@Pc(14) int[] local14 = Static348.anIntArray412;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class4_Sub2_Sub2_Sub1 local24 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local14[local16]];
			if (local24 != null) {
				Static291.method4269(local24.method5118(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(CI)Z")
	public static boolean method737(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!cr;ILclient!f;ILclient!ea;ZI)V")
	public static void method742(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(20) int local20;
		if (Static65.anInt7824 == 4) {
			local20 = (int) Static203.aFloat130 & 0x3FFF;
		} else {
			local20 = Static357.anInt3686 + (int) Static203.aFloat130 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg1.anInt1622 / 2, arg1.anInt1599 / 2) + 10;
		@Pc(48) int local48 = arg6 * arg6 + arg2 * arg2;
		if (local39 * local39 < local48) {
			return;
		}
		@Pc(62) int local62 = Class184.anIntArray349[local20];
		@Pc(66) int local66 = Class184.anIntArray350[local20];
		if (Static65.anInt7824 != 4) {
			local62 = local62 * 256 / (Static119.anInt2384 + 256);
			local66 = local66 * 256 / (Static119.anInt2384 + 256);
		}
		@Pc(97) int local97 = local66 * arg6 + local62 * arg2 >> 15;
		@Pc(108) int local108 = arg2 * local66 - local62 * arg6 >> 15;
		arg3.method6094(arg1.anInt1622 / 2 + arg0 + local97 - arg3.ja() / 2, arg4 - -(arg1.anInt1599 / 2) - (local108 + arg3.JA() / 2), arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method745(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static14.method226(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(28) int local28 = 0; local28 < local10; local28++) {
			@Pc(32) int local32;
			for (local32 = local19; arg1 != arg0.charAt(local32); local32++) {
			}
			local15[local17++] = arg0.substring(local19, local32);
			local19 = local32 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}
}
