import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array13;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	public static int anInt3596;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	public static int anInt3597;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	public static int anInt3595 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
	public static void method2934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub6_Sub11 local16 = Static295.method4455(arg0, 5);
		local16.method3004();
		local16.anInt3686 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([Lclient!je;IB)V")
	public static void method2935(@OriginalArg(0) Class117[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class117 local14 = arg0[local8];
			if (local14 != null) {
				if (local14.anInt3108 == 0) {
					if (local14.aClass117Array1 != null) {
						method2935(local14.aClass117Array1, arg1);
					}
					@Pc(38) Class1_Sub38 local38 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local14.anInt3093);
					if (local38 != null) {
						Static350.method4909(local38.anInt5050, arg1);
					}
				}
				@Pc(54) Class1_Sub39 local54;
				if (arg1 == 0 && local14.anObjectArray21 != null) {
					local54 = new Class1_Sub39();
					local54.aClass117_16 = local14;
					local54.anObjectArray34 = local14.anObjectArray21;
					Static387.method5496(local54);
				}
				if (arg1 == 1 && local14.anObjectArray29 != null) {
					if (local14.anInt3043 >= 0) {
						@Pc(80) Class117 local80 = Static13.method107(local14.anInt3093);
						if (local80 == null || local80.aClass117Array1 == null || local14.anInt3043 >= local80.aClass117Array1.length || local80.aClass117Array1[local14.anInt3043] != local14) {
							continue;
						}
					}
					local54 = new Class1_Sub39();
					local54.aClass117_16 = local14;
					local54.anObjectArray34 = local14.anObjectArray29;
					Static387.method5496(local54);
				}
			}
		}
	}
}
