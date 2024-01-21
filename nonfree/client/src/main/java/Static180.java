import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static int anInt3987;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1728 = null;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1729 = Static32.method683("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static int anInt3988 = 0;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1730 = Static32.method683("sl_button");

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1731 = Static32.method683("rot:");

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public static int anInt3994 = 0;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1732 = Static32.method683("runes");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BILclient!wb;I)V")
	public static void method2980(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2) {
		@Pc(7) Class2_Sub22 local7 = new Class2_Sub22();
		local7.aByteArray45 = arg0;
		local7.aClass88_2 = arg2;
		local7.anInt2507 = 0;
		local7.aLong157 = arg1;
		@Pc(22) Class81 local22 = Static47.aClass81_4;
		synchronized (Static47.aClass81_4) {
			Static47.aClass81_4.method2683(local7);
		}
		Static61.method1071();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
	public static void method2982(@OriginalArg(1) int arg0) {
		if (!Static163.method531(arg0)) {
			return;
		}
		@Pc(19) Class85[] local19 = Static149.aClass85ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class85 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt3824 = 0;
				local27.anInt3888 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method2984() {
		aClass49_1732 = null;
		aClass49_1729 = null;
		aClass49_1731 = null;
		aByteArrayArrayArray9 = null;
		aClass49_1728 = null;
		aClass49_1730 = null;
	}
}
