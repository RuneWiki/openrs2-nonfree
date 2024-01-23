import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "Lclient!fb;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString444 = null;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!th;Lclient!th;)I")
	public static int method4704(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		@Pc(15) int local15 = 0;
		if (arg0.method4038(Static49.anInt1173)) {
			local15++;
		}
		if (arg0.method4038(Static176.anInt3904)) {
			local15++;
		}
		if (arg0.method4038(Static269.anInt5361)) {
			local15++;
		}
		if (arg1.method4038(Static49.anInt1173)) {
			local15++;
		}
		if (arg1.method4038(Static176.anInt3904)) {
			local15++;
		}
		if (arg1.method4038(Static269.anInt5361)) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIII)V")
	public static void method4705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class1_Sub3_Sub22 local4 = Static271.method4108(8, arg0);
		local4.method4468();
		local4.anInt5849 = arg2;
		local4.anInt5843 = arg3;
		local4.anInt5852 = arg1;
	}
}
