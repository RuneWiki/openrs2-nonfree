import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "Lclient!kr;")
	public static Class171 aClass171_55;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILclient!vh;)V")
	public static void method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49_Sub5 arg3) {
		@Pc(4) Class255 local4 = Static188.method2930(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass49_Sub5_2 = arg3;
		}
	}
}
