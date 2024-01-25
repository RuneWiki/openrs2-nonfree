import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dm", name = "Y", descriptor = "[Lclient!gw;")
	public static final Class2_Sub6_Sub9[] aClass2_Sub6_Sub9Array1 = new Class2_Sub6_Sub9[14];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2755(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = arg0.charAt(local20) + (local18 << 5) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)I")
	public static int method2756(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
