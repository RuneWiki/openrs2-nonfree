import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
	public static int anInt7257;

	@OriginalMember(owner = "client!vv", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!vv", name = "J", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_261 = new Class186(34, -2);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI[Lclient!jb;)V")
	public static void method5597(@OriginalArg(1) int arg0, @OriginalArg(2) Class126[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
			@Pc(16) Class126 local16 = arg1[local10];
			if (local16 != null) {
				if (local16.anInt3426 == 0) {
					if (local16.aClass126Array3 != null) {
						method5597(arg0, local16.aClass126Array3);
					}
					@Pc(40) Class4_Sub4 local40 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local16.anInt3397);
					if (local40 != null) {
						Static99.method4522(local40.anInt573, arg0);
					}
				}
				@Pc(56) Class4_Sub40 local56;
				if (arg0 == 0 && local16.anObjectArray14 != null) {
					local56 = new Class4_Sub40();
					local56.anObjectArray35 = local16.anObjectArray14;
					local56.aClass126_16 = local16;
					Static172.method2513(local56);
				}
				if (arg0 == 1 && local16.anObjectArray6 != null) {
					if (local16.anInt3392 >= 0) {
						@Pc(82) Class126 local82 = Static53.method1056(local16.anInt3397);
						if (local82 == null || local82.aClass126Array3 == null || local82.aClass126Array3.length <= local16.anInt3392 || local16 != local82.aClass126Array3[local16.anInt3392]) {
							continue;
						}
					}
					local56 = new Class4_Sub40();
					local56.anObjectArray35 = local16.anObjectArray6;
					local56.aClass126_16 = local16;
					Static172.method2513(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZI)V")
	public static void method5598(@OriginalArg(1) int arg0) {
		Static154.method2309();
		Static216.method3072();
		Static183.method2710(true, arg0);
		Static341.method4737(Static439.aClass166_293, Static149.aClass166_105, Static16.aClass30_11);
		Static276.method3722(Static16.aClass30_11, Static149.aClass166_105);
		Static178.method2599(Static352.aClass3Array13);
		Static13.method324();
		Static262.method3574();
		if (Static73.anInt1749 == 10) {
			Static93.method1521(false);
		} else if (Static73.anInt1749 == 30) {
			Static321.method4406(25);
		} else if (Static73.anInt1749 == 5) {
			Static274.method3701(Static149.aClass166_105, Static16.aClass30_11);
		}
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(III)Z")
	public static boolean method5599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
