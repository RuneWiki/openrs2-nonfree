import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
	public static int anInt4901;

	@OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
	public static int anInt4904;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public static int anInt4895 = 0;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
	public static int anInt4902 = 0;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString152 = "Members object";

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI[Lclient!ok;)V")
	public static void method3893(@OriginalArg(1) int arg0, @OriginalArg(2) Class116[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class116 local15 = arg1[local7];
			if (local15 != null) {
				if (local15.anInt4376 == 0) {
					if (local15.aClass116Array1 != null) {
						method3893(arg0, local15.aClass116Array1);
					}
					@Pc(39) Class1_Sub12 local39 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local15.anInt4290);
					if (local39 != null) {
						Static55.method1116(local39.anInt2230, arg0);
					}
				}
				@Pc(60) Class1_Sub27 local60;
				if (arg0 == 0 && local15.anObjectArray31 != null) {
					local60 = new Class1_Sub27();
					local60.anObjectArray32 = local15.anObjectArray31;
					local60.aClass116_13 = local15;
					Static22.method392(local60);
				}
				if (arg0 == 1 && local15.anObjectArray16 != null) {
					if (local15.anInt4297 >= 0) {
						@Pc(89) Class116 local89 = Static115.method1897(local15.anInt4290);
						if (local89 == null || local89.aClass116Array1 == null || local89.aClass116Array1.length <= local15.anInt4297 || local15 != local89.aClass116Array1[local15.anInt4297]) {
							continue;
						}
					}
					local60 = new Class1_Sub27();
					local60.anObjectArray32 = local15.anObjectArray16;
					local60.aClass116_13 = local15;
					Static22.method392(local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public static void method3894() {
		if (Static209.anInt4636 == 5) {
			Static209.anInt4636 = 6;
		}
	}
}
