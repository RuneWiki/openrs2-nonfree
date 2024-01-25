import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "Lclient!aa;")
	public static Class2 aClass2_17;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Lclient!su;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public static final int anInt3133 = 328;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method2801(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static65.anInt1626; local11++) {
			if (arg0.equalsIgnoreCase(Static75.aStringArray9[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)Z")
	public static boolean method2806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
