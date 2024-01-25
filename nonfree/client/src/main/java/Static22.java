import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!al", name = "d", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z")
	public static boolean method317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!cca;)Z")
	public static boolean method319(@OriginalArg(1) Class59 arg0) {
		return arg0 == null ? false : Static63.method884(arg0.anInt1072, arg0.anInt1063 - arg0.anInt1072, arg0.anInt1068, arg0.anInt1076, arg0.anInt1067 - arg0.anInt1068, -arg0.anInt1076 + arg0.anInt1069);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!cja;Lclient!cja;B)V")
	public static void method320(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(1) Class5_Sub5 arg1) {
		if (arg1.aClass5_Sub5_65 != null) {
			arg1.method9186();
		}
		arg1.aClass5_Sub5_65 = arg0.aClass5_Sub5_65;
		arg1.aClass5_Sub5_66 = arg0;
		arg1.aClass5_Sub5_65.aClass5_Sub5_66 = arg1;
		arg1.aClass5_Sub5_66.aClass5_Sub5_65 = arg1;
	}
}
