import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gs", name = "F", descriptor = "[Lclient!aba;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString54;

	@OriginalMember(owner = "client!gs", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[8];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLclient!ee;)Lclient!gl;")
	public static Class5_Sub2 method3086(@OriginalArg(1) Class5_Sub12 arg0) {
		arg0.method8645();
		@Pc(13) int local13 = arg0.method8645();
		@Pc(17) Class5_Sub2 local17 = Static103.method1503(local13);
		local17.anInt10385 = arg0.method8645();
		@Pc(26) int local26 = arg0.method8645();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method8645();
			local17.method8825(arg0, local39);
		}
		local17.method8819();
		return local17;
	}
}
