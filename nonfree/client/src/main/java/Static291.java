import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!ufa;")
	public static Class4 aClass4_13;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method5008() {
		if (Static199.aBoolean358 || Static469.aClass6_Sub5_Sub9_2 == null) {
			return "";
		} else if ((Static469.aClass6_Sub5_Sub9_2.aString25 == null || Static469.aClass6_Sub5_Sub9_2.aString25.length() == 0) && Static469.aClass6_Sub5_Sub9_2.aString24 != null && Static469.aClass6_Sub5_Sub9_2.aString24.length() > 0) {
			return Static469.aClass6_Sub5_Sub9_2.aString24;
		} else {
			return Static469.aClass6_Sub5_Sub9_2.aString25;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!mg;III)V")
	public static void method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class6_Sub36 local11 = null;
		for (@Pc(16) Class6_Sub36 local16 = (Class6_Sub36) Static122.aClass163_15.method4966(); local16 != null; local16 = (Class6_Sub36) Static122.aClass163_15.method4965()) {
			if (local16.anInt7724 == arg4 && arg3 == local16.anInt7720 && arg0 == local16.anInt7721 && local16.anInt7726 == arg1) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class6_Sub36();
			local11.anInt7721 = arg0;
			local11.anInt7726 = arg1;
			local11.anInt7720 = arg3;
			local11.anInt7724 = arg4;
			Static122.aClass163_15.method4967(local11);
		}
		local11.aClass200_1 = arg2;
		local11.aBoolean609 = false;
		local11.aBoolean608 = true;
	}
}
