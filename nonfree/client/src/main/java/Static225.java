import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	public static int anInt4878;

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "Lclient!mj;")
	public static Class64 aClass64_15;

	@OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
	public static int anInt4887;

	@OriginalMember(owner = "client!wg", name = "kb", descriptor = "Lclient!ui;")
	public static Class103 aClass103_23;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_865 = Static199.method3560("Freie Welt");

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "Lclient!he;")
	public static Class44 aClass44_62 = new Class44();

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
	public static int anInt4883 = 0;

	@OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
	public static int anInt4888 = 0;

	@OriginalMember(owner = "client!wg", name = "jb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_866 = Static199.method3560(" )2> ");

	@OriginalMember(owner = "client!wg", name = "lb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_867 = Static199.method3560("::clientdrop");

	@OriginalMember(owner = "client!wg", name = "mb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_868 = Static199.method3560("<col=ff0000>");

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIZI)V")
	public static void method3967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static49.anInt903 = arg2;
		Static59.anInt1032 = arg1;
		Static73.anInt1578 = arg0;
		Static5.anInt142 = arg3;
		Static196.anInt4471 = arg5;
		if (arg4 && Static5.anInt142 >= 100) {
			Static39.anInt727 = Static73.anInt1578 * 128 + 64;
			Static71.anInt1394 = Static49.anInt903 * 128 + 64;
			Static107.anInt2348 = Static208.method3667(Static39.anInt727, Static137.anInt3136, Static71.anInt1394) - Static196.anInt4471;
		}
		Static145.anInt3290 = 2;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V")
	public static void method3968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static226.aClass79Array8[0].method3071(arg4, arg0);
		Static226.aClass79Array8[1].method3071(arg4, arg0 + arg2 - 16);
		@Pc(27) int local27 = (arg2 - 32) * arg2 / arg1;
		if (local27 < 8) {
			local27 = 8;
		}
		@Pc(48) int local48 = (arg2 - local27 - 32) * arg3 / (arg1 - arg2);
		Static217.method3761(arg4, arg0 + 16, 16, arg2 - 32, Static99.anInt2146);
		Static217.method3761(arg4, arg0 + local48 + 16, 16, local27, Static140.anInt3199);
		Static217.method3758(arg4, local48 + arg0 + 16, local27, Static149.anInt1859);
		Static217.method3758(arg4 + 1, arg0 + 16 + local48, local27, Static149.anInt1859);
		Static217.method3762(arg4, local48 + arg0 + 16, 16, Static149.anInt1859);
		Static217.method3762(arg4, arg0 + local48 + 17, 16, Static149.anInt1859);
		Static217.method3758(arg4 + 15, local48 + arg0 + 16, local27, Static151.anInt3459);
		Static217.method3758(arg4 + 14, arg0 - -local48 + 17, local27 - 1, Static151.anInt3459);
		Static217.method3762(arg4, local48 + arg0 + local27 + 15, 16, Static151.anInt3459);
		Static217.method3762(arg4 + 1, local27 + arg0 + 14 + local48, 15, Static151.anInt3459);
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)[Lclient!gd;")
	public static Class2_Sub3_Sub8[] method3969() {
		@Pc(4) Class2_Sub3_Sub8[] local4 = new Class2_Sub3_Sub8[Static113.anInt2492];
		for (@Pc(6) int local6 = 0; local6 < Static113.anInt2492; local6++) {
			@Pc(16) int local16 = Static131.anIntArray489[local6] * Static113.anIntArray423[local6];
			@Pc(20) byte[] local20 = Static31.aByteArrayArray3[local6];
			if (Static131.aBooleanArray90[local6]) {
				@Pc(76) byte[] local76 = Static33.aByteArrayArray4[local6];
				@Pc(79) int[] local79 = new int[local16];
				for (@Pc(81) int local81 = 0; local81 < local16; local81++) {
					local79[local81] = (local76[local81] & 0xFF) << 24 | Static198.anIntArray725[local20[local81] & 0xFF];
				}
				local4[local6] = new Class2_Sub3_Sub8_Sub1_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[local6], Static37.anIntArray108[local6], Static113.anIntArray423[local6], Static131.anIntArray489[local6], local79);
			} else {
				@Pc(27) int[] local27 = new int[local16];
				for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
					local27[local29] = Static198.anIntArray725[local20[local29] & 0xFF];
				}
				local4[local6] = new Class2_Sub3_Sub8_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[local6], Static37.anIntArray108[local6], Static113.anIntArray423[local6], Static131.anIntArray489[local6], local27);
			}
		}
		Static28.method365();
		return local4;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!oe;)V")
	public static void method3970(@OriginalArg(1) Class72 arg0) {
		Static188.aClass72_263 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!mj;Z)V")
	public static void method3971(@OriginalArg(0) Class64 arg0) {
		@Pc(7) Class64 local7 = Static43.method585(arg0);
		@Pc(11) int local11;
		@Pc(13) int local13;
		if (local7 == null) {
			local11 = Static134.anInt3131;
			local13 = Static30.anInt546;
		} else {
			local11 = local7.anInt3021;
			local13 = local7.anInt3040;
		}
		Static192.method3524(arg0, local13, false, local11);
		Static201.method3580(local11, arg0, local13);
	}
}
