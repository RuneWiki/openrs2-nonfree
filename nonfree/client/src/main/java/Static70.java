import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "J")
	public static long aLong50;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)Z")
	public static boolean method1031() {
		return Static175.anInt2881 == 0 ? Static537.aClass5_Sub14_Sub4_35.method3241() : true;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!rv;)Lclient!fq;")
	public static Class119 method1032(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3642();
		@Pc(14) Class112 local14 = Static17.method265()[arg0.method3642()];
		@Pc(21) Class4 local21 = Static49.method727()[arg0.method3642()];
		@Pc(25) int local25 = arg0.method3638();
		@Pc(35) int local35 = arg0.method3638();
		@Pc(39) int local39 = arg0.method3698();
		@Pc(43) int local43 = arg0.method3698();
		@Pc(49) int local49 = arg0.method3671();
		@Pc(53) int local53 = arg0.method3671();
		@Pc(57) int local57 = arg0.method3671();
		@Pc(66) boolean local66 = arg0.method3642() == 1;
		return new Class119(local7, local14, local21, local25, local35, local39, local43, local49, local53, local57, local66);
	}
}
