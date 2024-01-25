import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "Lclient!da;")
	public static Class72 aClass72_2;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
	public static int anInt444 = -1;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	public static int anInt447 = 0;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)[Lclient!ve;")
	public static Class370[] method422() {
		return new Class370[] { Static528.aClass370_8, Static163.aClass370_2, Static363.aClass370_5, Static114.aClass370_1, Static460.aClass370_7, Static428.aClass370_6, Static598.aClass370_9, Static355.aClass370_4, Static188.aClass370_3, Static668.aClass370_10 };
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IZI)I")
	public static int method424(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(JJ)J")
	public static long method425(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIBILjava/lang/String;I)V")
	public static void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class41_Sub8 local7 = new Class41_Sub8();
		local7.anInt8701 = arg3;
		local7.anInt8708 = arg4;
		local7.anInt8704 = arg0;
		local7.anInt8700 = arg2;
		local7.anInt8702 = arg1;
		local7.anInt8698 = Static421.anInt7434 + arg6;
		local7.aString95 = arg5;
		Static261.aClass102_2.method2055(local7);
	}
}
