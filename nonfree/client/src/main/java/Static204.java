import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "B")
	public static byte aByte89;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BC)Z")
	public static boolean method6279(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(24) char[] local24 = Static125.aCharArray7;
			for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
				@Pc(32) char local32 = local24[local26];
				if (arg0 == local32) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6284(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static544.anInt9412; local16++) {
			if (arg0.equalsIgnoreCase(Static277.aStringArray16[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)Z")
	public static boolean method6285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!gg;)V")
	public static void method6288(@OriginalArg(0) Class9_Sub4 arg0) {
		Static472.aClass5_14.H(arg0.anInt10360, arg0.anInt10365 + (arg0.method8425() >> 1), arg0.anInt10357, Static402.anIntArray372);
		arg0.anInt10362 = Static402.anIntArray372[0];
		arg0.anInt10358 = Static402.anIntArray372[1];
		arg0.anInt10359 = Static402.anIntArray372[2];
	}
}
