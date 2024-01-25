import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!pea", name = "ic", descriptor = "I")
	public static int anInt7806;

	@OriginalMember(owner = "client!pea", name = "ec", descriptor = "[I")
	public static final int[] anIntArray574 = new int[250];

	@OriginalMember(owner = "client!pea", name = "Lc", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_123 = new Class397(76, -1);

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "(I)[Lclient!dea;")
	public static Class74[] method6683() {
		return new Class74[] { Static631.aClass74_2, Static129.aClass74_1, Static632.aClass74_3 };
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(III)Z")
	public static boolean method6689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)Z")
	public static boolean method6693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static284.method4011(arg1, arg0) | Static601.method7730(arg0, arg1) | Static407.method5470(arg0, arg1)) & Static336.method4834(arg1, arg0);
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(IIII)I")
	public static int method6697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static147.anInt2696 < 100) {
			return -2;
		}
		@Pc(15) int local15 = -2;
		@Pc(17) int local17 = Integer.MAX_VALUE;
		@Pc(22) int local22 = arg1 - Static327.anInt1084;
		@Pc(27) int local27 = arg2 - Static327.anInt1076;
		for (@Pc(32) Class3_Sub48 local32 = (Class3_Sub48) Static327.aClass342_14.method7644(); local32 != null; local32 = (Class3_Sub48) Static327.aClass342_14.method7650()) {
			if (local32.anInt8050 == arg0) {
				@Pc(47) int local47 = local32.anInt8047;
				@Pc(50) int local50 = local32.anInt8049;
				@Pc(60) int local60 = Static327.anInt1076 + local50 | Static327.anInt1084 + local47 << 14;
				@Pc(79) int local79 = (local27 - local50) * (-local50 + local27) + (local22 - local47) * (-local47 + local22);
				if (local15 < 0 || local17 > local79) {
					local17 = local79;
					local15 = local60;
				}
			}
		}
		if (166952455 != 166952455) {
			method6693(67, 116);
		}
		return local15;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6701(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = (local18 << 5) + (Static197.method6349(arg0.charAt(local20)) - local18);
		}
		return local18;
	}
}
