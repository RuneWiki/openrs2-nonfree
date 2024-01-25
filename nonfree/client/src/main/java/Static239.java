import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
	public static int anInt4956;

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
	public static int anInt4959;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	public static int anInt4960 = -1;

	@OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
	public static int anInt4961 = 20;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Lclient!kj;")
	public static Class8_Sub5 method4367(@OriginalArg(1) int arg0) {
		@Pc(7) Class217[] local7 = Class45.aClass217Array1;
		synchronized (Class45.aClass217Array1) {
			@Pc(27) Class8_Sub5 local27;
			if (Class45.aClass217Array1.length <= arg0 || Class45.aClass217Array1[arg0].method5681()) {
				local27 = new Class8_Sub5();
				local27.aClass8_Sub3Array1 = new Class8_Sub3[arg0];
				for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
					local27.aClass8_Sub3Array1[local33] = new Class8_Sub3();
				}
			} else {
				local27 = (Class8_Sub5) Class45.aClass217Array1[arg0].method5680();
				local27.method4763();
				@Pc(62) int local62 = Static122.anIntArray251[arg0]--;
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[BI)I")
	public static int method4369(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class159.anIntArray428[(local7 ^ arg1[local9]) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4370(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(20) byte local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < local8; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			if (local20 == 0) {
				local28 = Character.toLowerCase(local28);
			} else if (local20 == 2 || Character.isUpperCase(local28)) {
				local28 = Static54.method1416(local28);
			}
			if (Character.isLetter(local28)) {
				local20 = 0;
			} else if (local28 == '.' || local28 == '?' || local28 == '!') {
				local20 = 2;
			} else if (!Character.isSpaceChar(local28)) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local11[local22] = local28;
		}
		return new String(local11);
	}
}
