import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "Lclient!ru;")
	public static Class308 aClass308_2;

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "Lclient!da;")
	public static Class37 aClass37_7;

	@OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
	public static int anInt7769;

	@OriginalMember(owner = "client!qr", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString72 = null;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(IZII)I")
	public static int method6798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static372.aByteArrayArrayArray3[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static372.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public static void method6800() {
		for (@Pc(6) Class16_Sub4 local6 = (Class16_Sub4) Static176.aClass19_4.method557(); local6 != null; local6 = (Class16_Sub4) Static176.aClass19_4.method557()) {
			Static93.method1897(local6);
		}
		@Pc(30) int local30;
		@Pc(32) int local32;
		if (Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 1) {
			local30 = 0;
			local32 = 3;
		} else {
			local32 = Static245.anInt4753;
			local30 = Static245.anInt4753;
		}
		Static79.method1722();
		for (@Pc(50) int local50 = local30; local50 <= local32; local50++) {
			Static79.method1731();
			Static79.method1733(local50);
			Static79.method1727(local50);
		}
		Static79.method1738();
		Static79.method1728();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z")
	public static boolean method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
