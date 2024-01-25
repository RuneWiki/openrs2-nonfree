import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLclient!ha;I)Lclient!da;")
	public static Class73 method7181(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(17) Class88 local17 = Static419.method6246(arg2, arg0, arg1);
		return local17 == null ? null : local17.aClass73_2;
	}
}
