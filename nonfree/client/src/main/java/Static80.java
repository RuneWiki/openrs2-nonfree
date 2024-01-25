import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt1245;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public static int anInt1246;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_2 = new Class258("", 18);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method1035(@OriginalArg(1) File arg0) {
		return Static76.method959(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!rba;I)Lclient!wf;")
	public static Class3_Sub2 method1036(@OriginalArg(0) Class3_Sub28 arg0) {
		arg0.method5322(-54);
		@Pc(21) int local21 = arg0.method5322(-28);
		@Pc(25) Class3_Sub2 local25 = Static155.method2464(local21);
		local25.anInt11031 = arg0.method5322(-125);
		@Pc(34) int local34 = arg0.method5322(-64);
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method5322(-79);
			local25.method9214(local42, arg0);
		}
		local25.method9205();
		return local25;
	}
}
