import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bja", name = "u", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!bja", name = "s", descriptor = "Lclient!tq;")
	public static final Class342 aClass342_1 = new Class342();

	@OriginalMember(owner = "client!bja", name = "t", descriptor = "[I")
	public static final int[] anIntArray59 = new int[4096];

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V")
	public static void method963() {
		@Pc(10) Class6_Sub45 local10;
		for (local10 = (Class6_Sub45) Static464.aClass362_52.method8538(); local10 != null; local10 = (Class6_Sub45) Static464.aClass362_52.method8530()) {
			Static347.method9039(local10, false);
		}
		for (local10 = (Class6_Sub45) Static467.aClass362_53.method8538(); local10 != null; local10 = (Class6_Sub45) Static467.aClass362_53.method8530()) {
			Static347.method9039(local10, true);
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIIB)V")
	public static void method964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static623.method8579(false, local35, true);
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(III)Lclient!kka;")
	public static Class2_Sub1_Sub5 method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class2_Sub1_Sub5 local14 = local7.aClass2_Sub1_Sub5_1;
			local7.aClass2_Sub1_Sub5_1 = null;
			Static571.method7962(local14);
			return local14;
		}
	}
}
