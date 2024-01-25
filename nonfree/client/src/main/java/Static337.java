import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "Lclient!tga;")
	public static final Class335 aClass335_25 = new Class335(16);

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!lha", name = "n", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_61 = new Class187(44, 3);

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!su;Lclient!su;I)V")
	public static void method5161(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		if (arg1.aClass5_Sub2_66 != null) {
			arg1.method8569();
		}
		arg1.aClass5_Sub2_66 = arg0;
		arg1.aClass5_Sub2_67 = arg0.aClass5_Sub2_67;
		arg1.aClass5_Sub2_66.aClass5_Sub2_67 = arg1;
		arg1.aClass5_Sub2_67.aClass5_Sub2_66 = arg1;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IBI)V")
	public static void method5162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class5_Sub2_Sub4 local19 = Static257.method3597(18, (long) arg1 | (long) arg0 << 32);
		local19.method2440();
	}
}
