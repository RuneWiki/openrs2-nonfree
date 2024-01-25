import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_95 = new Class27(66, 6);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method5324() {
		if (Static189.anInt3826 == -1) {
			return;
		}
		@Pc(17) int local17 = Static113.aClass13_1.method4116();
		@Pc(21) int local21 = Static113.aClass13_1.method4123();
		@Pc(26) Class10_Sub16 local26 = (Class10_Sub16) Static173.aClass163_29.method3620();
		if (local26 != null) {
			local17 = local26.method1921();
			local21 = local26.method1923();
		}
		Static308.method4264(local21, 0, Static340.anInt5756, 0, 0, Static189.anInt3826, 0, local17, Static90.anInt1891);
		if (Static11.aClass89_1 != null) {
			Static410.method5397(local17, local21);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5326(@OriginalArg(1) String arg0) {
		Static104.method1823("", 0, arg0, "", 0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	public static void method5327(@OriginalArg(0) int arg0) {
		Static239.anInt4239 = arg0;
		Static328.aClass267_81.method6011();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
	public static int method5328(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
