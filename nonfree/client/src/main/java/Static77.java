import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "J")
	public static long aLong42;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_38 = new Class44(102, 10);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B)Z")
	public static boolean method1435(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class14_Sub29 local8 = new Class14_Sub29(arg0);
		@Pc(12) int local12 = local8.method5866();
		if (local12 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method5866() == 1;
		if (local33) {
			Static170.method2770(local8);
		}
		Static186.method9081(local8);
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ne;I)Z")
	public static boolean method1439(@OriginalArg(0) Class240 arg0) {
		return Static508.aClass240_6 == arg0 || Static380.aClass240_4 == arg0 || Static133.aClass240_2 == arg0 || Static223.aClass240_3 == arg0 || Static628.aClass240_8 == arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z")
	public static boolean method1440(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!so;I)Lclient!wd;")
	public static Class92_Sub3 method1441(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(12) Class92 local12 = Static64.method1268(arg0);
		@Pc(16) int local16 = arg0.method5878();
		@Pc(20) int local20 = arg0.method5878();
		return new Class92_Sub3(local12.aClass168_13, local12.aClass339_13, local12.anInt10908, local12.anInt10902, local12.anInt10903, local12.anInt10907, local12.anInt10904, local12.anInt10910, local12.anInt10905, local16, local20);
	}
}
