import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "Lclient!an;")
	public static Class16 aClass16_58;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!lf;")
	public static final Class187 aClass187_18 = new Class187();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) Class12_Sub4_Sub1 local15 = Static389.method6156(3, arg0);
		local15.method820();
		local15.aString9 = arg1;
	}
}
