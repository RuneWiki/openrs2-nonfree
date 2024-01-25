import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static104 {

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILclient!tm;Lclient!tm;)V")
	public static void method2431(@OriginalArg(1) Class6_Sub5 arg0, @OriginalArg(2) Class6_Sub5 arg1) {
		if (arg1.aClass6_Sub5_67 != null) {
			arg1.method7748();
		}
		arg1.aClass6_Sub5_66 = arg0;
		arg1.aClass6_Sub5_67 = arg0.aClass6_Sub5_67;
		arg1.aClass6_Sub5_67.aClass6_Sub5_66 = arg1;
		arg1.aClass6_Sub5_66.aClass6_Sub5_67 = arg1;
	}
}
