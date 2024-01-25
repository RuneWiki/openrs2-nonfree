import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
	public static int anInt8245;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!qaa", name = "k", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BII)Z")
	public static boolean method6813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static270.method8004(arg0, arg1) | (arg0 & 0x40000) != 0 || Static481.method7140(arg0, arg1);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II)Lclient!gw;")
	public static Class125 method6815(@OriginalArg(0) int arg0) {
		@Pc(10) Class125 local10 = (Class125) Static52.aClass236_7.method6242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static286.aClass237_77.method6314(0, arg0);
		local10 = new Class125();
		if (local20 != null) {
			local10.method3588(new Class8_Sub8(local20));
		}
		local10.method3589();
		Static52.aClass236_7.method6241((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BI)Z")
	public static boolean method6819(@OriginalArg(0) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			return false;
		} else {
			return local15 < 128 || local15 >= 160 || Static542.aCharArray9[local15 - 128] != '\u0000';
		}
	}
}
